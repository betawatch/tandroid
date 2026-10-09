package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.di1;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class o1 extends FrameLayout {
    public final l1 a;
    public final FrameLayout b;
    public final n1[] c;
    public di1 d;

    public o1(Activity activity, q1 q1Var) {
        super(activity);
        this.c = new n1[5];
        setWillNotDraw(false);
        l1 l1Var = new l1(activity, q1Var);
        this.a = l1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.b = frameLayout;
        l1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.c[i10] = new n1(activity);
            this.c[i10].setAllStarsProvider(new m4.w(this, 13));
            n1 n1Var = this.c[i10];
            n1Var.d = new org.telegram.ui.Components.y2(20, this, activity);
            n1Var.f = i10;
            this.b.addView(n1Var, x5.a(-2.0f, i10 * 41, 0.0f, 0.0f, 0.0f, -2, 51));
        }
        addView(this.a, x5.a(152.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 49));
        addView(this.b, x5.a(100.0f, 0.0f, 90.0f, 0.0f, 0.0f, 201, 49));
    }
}
