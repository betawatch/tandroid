package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.Menu;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import org.telegram.messenger.mc;
import org.telegram.messenger.nc;
import org.telegram.ui.Components.rd0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e9 implements nc, mc, rd0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.messenger.nc
    public void a(String str) {
        f9 f9Var = (f9) this.a;
        Menu menu = (Menu) this.b;
        f9Var.b = str;
        f9Var.b(menu);
    }

    @Override // org.telegram.ui.Components.rd0
    public void j(int i7, int i10) {
        t5 t5Var = (t5) this.a;
        rd0 rd0Var = (rd0) this.b;
        j6.o oVar = t5Var.e;
        TextView textView = t5Var.b;
        rd0Var.j(i7, i10);
        if (i10 > 0) {
            textView.setText("+" + i10);
        } else {
            textView.setText("" + i10);
        }
        if (textView.getTag() != null) {
            org.telegram.messenger.g0.r(oVar);
            org.telegram.messenger.g0.h3(oVar, 1000L);
            return;
        }
        AnimatorSet animatorSet = t5Var.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        textView.setTag(1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        t5Var.d = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(t5Var.a, (Property<TextView, Float>) property, 0.0f));
        t5Var.d.setDuration(250L);
        t5Var.d.setInterpolator(new DecelerateInterpolator());
        t5Var.d.addListener(new ki.n3(t5Var, 27));
        t5Var.d.start();
    }

    @Override // org.telegram.messenger.mc
    public void q(Exception exc) {
        f9 f9Var = (f9) this.a;
        Menu menu = (Menu) this.b;
        org.telegram.messenger.a8.d("mlkit: failed to detect language in selection");
        org.telegram.messenger.a8.g(exc, true);
        f9Var.b = null;
        f9Var.b(menu);
    }
}
