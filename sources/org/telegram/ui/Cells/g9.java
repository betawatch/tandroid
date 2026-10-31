package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.Menu;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import org.telegram.messenger.pc;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.ce0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g9 implements qc, pc, ce0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.messenger.qc
    public void a(String str) {
        h9 h9Var = (h9) this.a;
        Menu menu = (Menu) this.b;
        h9Var.b = str;
        h9Var.b(menu);
    }

    @Override // org.telegram.ui.Components.ce0
    public void p(int i10, int i11) {
        x5 x5Var = (x5) this.a;
        ce0 ce0Var = (ce0) this.b;
        mg.c2 c2Var = x5Var.e;
        TextView textView = x5Var.b;
        ce0Var.p(i10, i11);
        if (i11 > 0) {
            textView.setText("+" + i11);
        } else {
            textView.setText("" + i11);
        }
        if (textView.getTag() != null) {
            org.telegram.messenger.i0.r(c2Var);
            org.telegram.messenger.i0.h3(c2Var, 1000L);
            return;
        }
        AnimatorSet animatorSet = x5Var.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        textView.setTag(1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        x5Var.d = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(x5Var.a, (Property<TextView, Float>) property, 0.0f));
        x5Var.d.setDuration(250L);
        x5Var.d.setInterpolator(new DecelerateInterpolator());
        x5Var.d.addListener(new org.telegram.ui.s9(x5Var, 7));
        x5Var.d.start();
    }

    @Override // org.telegram.messenger.pc
    public void q(Exception exc) {
        h9 h9Var = (h9) this.a;
        Menu menu = (Menu) this.b;
        org.telegram.messenger.f8.d("mlkit: failed to detect language in selection");
        org.telegram.messenger.f8.g(exc, true);
        h9Var.b = null;
        h9Var.b(menu);
    }
}
