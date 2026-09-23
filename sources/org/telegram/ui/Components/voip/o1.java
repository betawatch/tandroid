package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.uh1;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o1 extends FrameLayout {
    public final l1 a;
    public final FrameLayout b;
    public final n1[] c;
    public uh1 d;

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
            this.c[i10].setAllStarsProvider(new le.b(this, 13));
            n1 n1Var = this.c[i10];
            n1Var.d = new org.telegram.ui.Components.b3(19, this, activity);
            n1Var.f = i10;
            this.b.addView(n1Var, x5.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.a, x5.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.b, x5.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
