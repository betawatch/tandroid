package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.sh1;
import w7.z5;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class p1 extends FrameLayout {
    public final m1 a;
    public final FrameLayout b;
    public final o1[] c;
    public sh1 d;

    public p1(Activity activity, r1 r1Var) {
        super(activity);
        this.c = new o1[5];
        setWillNotDraw(false);
        m1 m1Var = new m1(activity, r1Var);
        this.a = m1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.b = frameLayout;
        m1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.c[i10] = new o1(activity);
            this.c[i10].setAllStarsProvider(new k2.v(this, 14));
            o1 o1Var = this.c[i10];
            o1Var.d = new org.telegram.ui.Components.w2(21, this, activity);
            o1Var.f = i10;
            this.b.addView(o1Var, z5.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.a, z5.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.b, z5.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
