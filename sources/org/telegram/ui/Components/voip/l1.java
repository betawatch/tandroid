package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import k7.b6;
import lh.m5;
import org.telegram.ui.ih1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class l1 extends FrameLayout {
    public final i1 a;
    public final FrameLayout b;
    public final k1[] c;
    public ih1 d;

    public l1(Activity activity, n1 n1Var) {
        super(activity);
        this.c = new k1[5];
        setWillNotDraw(false);
        i1 i1Var = new i1(activity, n1Var);
        this.a = i1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.b = frameLayout;
        i1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.c[i10] = new k1(activity);
            this.c[i10].setAllStarsProvider(new m5(this, 20));
            k1 k1Var = this.c[i10];
            k1Var.d = new org.telegram.ui.Components.o1(27, this, activity);
            k1Var.f = i10;
            this.b.addView(k1Var, b6.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.a, b6.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.b, b6.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
