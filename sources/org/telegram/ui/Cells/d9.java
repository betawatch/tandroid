package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.Menu;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import org.telegram.messenger.ic;
import org.telegram.messenger.jc;
import org.telegram.ui.Components.bd0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d9 implements jc, ic, bd0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.messenger.jc
    public void a(String str) {
        e9 e9Var = (e9) this.a;
        Menu menu = (Menu) this.b;
        e9Var.b = str;
        e9Var.b(menu);
    }

    @Override // org.telegram.ui.Components.bd0
    public void m(int i3, int i10) {
        s5 s5Var = (s5) this.a;
        bd0 bd0Var = (bd0) this.b;
        mi.b0 b0Var = s5Var.e;
        TextView textView = s5Var.b;
        bd0Var.m(i3, i10);
        if (i10 > 0) {
            textView.setText("+" + i10);
        } else {
            textView.setText("" + i10);
        }
        if (textView.getTag() != null) {
            org.telegram.messenger.g0.r(b0Var);
            org.telegram.messenger.g0.i3(b0Var, 1000L);
            return;
        }
        AnimatorSet animatorSet = s5Var.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        textView.setTag(1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        s5Var.d = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(s5Var.a, (Property<TextView, Float>) property, 0.0f));
        s5Var.d.setDuration(250L);
        s5Var.d.setInterpolator(new DecelerateInterpolator());
        s5Var.d.addListener(new ii.v3(s5Var, 27));
        s5Var.d.start();
    }

    @Override // org.telegram.messenger.ic
    public void s(Exception exc) {
        e9 e9Var = (e9) this.a;
        Menu menu = (Menu) this.b;
        org.telegram.messenger.a8.d("mlkit: failed to detect language in selection");
        org.telegram.messenger.a8.g(exc, true);
        e9Var.b = null;
        e9Var.b(menu);
    }
}
