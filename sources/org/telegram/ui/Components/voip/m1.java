package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import ji.m5;
import org.telegram.ui.ki1;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class m1 extends FrameLayout {
    public final j1 a;
    public final FrameLayout b;
    public final l1[] c;
    public ki1 d;

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
            this.c[i10].setAllStarsProvider(new m5(this, 17));
            l1 l1Var = this.c[i10];
            l1Var.d = new org.telegram.ui.Components.u2(22, this, activity);
            l1Var.f = i10;
            this.b.addView(l1Var, z5.a(-2.0f, i10 * 41, 0.0f, 0.0f, 0.0f, -2, 51));
        }
        addView(this.a, z5.a(152.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 49));
        addView(this.b, z5.a(100.0f, 0.0f, 90.0f, 0.0f, 0.0f, 201, 49));
    }
}
