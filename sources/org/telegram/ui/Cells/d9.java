package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.Menu;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import org.telegram.messenger.nc;
import org.telegram.messenger.oc;
import org.telegram.ui.Components.hd0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d9 implements oc, nc, hd0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.messenger.oc
    public void a(String str) {
        e9 e9Var = (e9) this.a;
        Menu menu = (Menu) this.b;
        e9Var.b = str;
        e9Var.b(menu);
    }

    @Override // org.telegram.ui.Components.hd0
    public void k(int i7, int i10) {
        s5 s5Var = (s5) this.a;
        hd0 hd0Var = (hd0) this.b;
        j6.o oVar = s5Var.e;
        TextView textView = s5Var.b;
        hd0Var.k(i7, i10);
        if (i10 > 0) {
            textView.setText("+" + i10);
        } else {
            textView.setText("" + i10);
        }
        if (textView.getTag() != null) {
            org.telegram.messenger.g0.r(oVar);
            org.telegram.messenger.g0.i3(oVar, 1000L);
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
        s5Var.d.addListener(new ki.s3(s5Var, 27));
        s5Var.d.start();
    }

    @Override // org.telegram.messenger.nc
    public void r(Exception exc) {
        e9 e9Var = (e9) this.a;
        Menu menu = (Menu) this.b;
        org.telegram.messenger.a8.d("mlkit: failed to detect language in selection");
        org.telegram.messenger.a8.g(exc, true);
        e9Var.b = null;
        e9Var.b(menu);
    }
}
