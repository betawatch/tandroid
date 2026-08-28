package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.ui.ug1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout {
    public final i1 a;
    public final FrameLayout b;
    public final k1[] c;
    public ug1 d;

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
        for (int i9 = 0; i9 < 5; i9++) {
            this.c[i9] = new k1(activity);
            this.c[i9].setAllStarsProvider(new kh.p(this, 13));
            k1 k1Var = this.c[i9];
            k1Var.d = new org.telegram.ui.Components.g1(28, this, activity);
            k1Var.f = i9;
            this.b.addView(k1Var, e6.d(-2, -2.0f, 51, i9 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.a, e6.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.b, e6.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
