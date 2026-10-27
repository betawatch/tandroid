package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.xg1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p1 extends FrameLayout {
    public final m1 a;
    public final FrameLayout b;
    public final o1[] c;
    public xg1 d;

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
            int i11 = 0;
            this.c[i10].setAllStarsProvider(new j1(this, i11));
            o1 o1Var = this.c[i10];
            o1Var.d = new k1(i11, this, activity);
            o1Var.f = i10;
            this.b.addView(o1Var, kb1.h(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.a, kb1.h(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.b, kb1.h(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
