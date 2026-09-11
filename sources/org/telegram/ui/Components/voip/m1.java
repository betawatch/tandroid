package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import ji.k5;
import org.telegram.ui.ci1;
import w7.x5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class m1 extends FrameLayout {
    public final j1 a;
    public final FrameLayout b;
    public final l1[] c;
    public ci1 d;

    public m1(Activity activity, o1 o1Var) {
        super(activity);
        this.c = new l1[5];
        setWillNotDraw(false);
        j1 j1Var = new j1(activity, o1Var);
        this.a = j1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.b = frameLayout;
        j1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.c[i10] = new l1(activity);
            this.c[i10].setAllStarsProvider(new k5(this, 12));
            l1 l1Var = this.c[i10];
            l1Var.d = new org.telegram.ui.Components.b3(19, this, activity);
            l1Var.f = i10;
            this.b.addView(l1Var, x5.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.a, x5.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.b, x5.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
