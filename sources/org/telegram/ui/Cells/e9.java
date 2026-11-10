package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.Menu;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import org.telegram.messenger.oc;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.gd0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e9 implements pc, oc, gd0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.messenger.pc
    public void a(String str) {
        f9 f9Var = (f9) this.a;
        Menu menu = (Menu) this.b;
        f9Var.b = str;
        f9Var.b(menu);
    }

    @Override // org.telegram.ui.Components.gd0
    public void l(int i7, int i10) {
        s5 s5Var = (s5) this.a;
        gd0 gd0Var = (gd0) this.b;
        m.f3 f3Var = s5Var.e;
        TextView textView = s5Var.b;
        gd0Var.l(i7, i10);
        if (i10 > 0) {
            textView.setText("+" + i10);
        } else {
            textView.setText("" + i10);
        }
        if (textView.getTag() != null) {
            org.telegram.messenger.g0.r(f3Var);
            org.telegram.messenger.g0.i3(f3Var, 1000L);
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
        s5Var.d.addListener(new m.a(s5Var, 26));
        s5Var.d.start();
    }

    @Override // org.telegram.messenger.oc
    public void r(Exception exc) {
        f9 f9Var = (f9) this.a;
        Menu menu = (Menu) this.b;
        org.telegram.messenger.a8.d("mlkit: failed to detect language in selection");
        org.telegram.messenger.a8.g(exc, true);
        f9Var.b = null;
        f9Var.b(menu);
    }
}
