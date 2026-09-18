package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.Components.mf;
import org.telegram.ui.bi1;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class o1 extends FrameLayout {
    public final l1 a;
    public final FrameLayout b;
    public final n1[] c;
    public bi1 d;

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
            this.c[i10].setAllStarsProvider(new k2.v(this, 13));
            n1 n1Var = this.c[i10];
            n1Var.d = new mf(18, this, activity);
            n1Var.f = i10;
            this.b.addView(n1Var, x5.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.a, x5.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.b, x5.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
