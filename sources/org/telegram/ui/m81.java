package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m81 implements Utilities.Callback5, Utilities.Callback5Return, r0.o {
    public final /* synthetic */ v81 a;

    public /* synthetic */ m81(v81 v81Var) {
        this.a = v81Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.d;
        v81 v81Var = this.a;
        v81Var.P = i10;
        v81Var.c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.b, 0, v81Var.P + v81Var.Q);
        return r0.m1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(v81.U(this.a, (org.telegram.ui.Components.h51) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        v81.e0(this.a, (org.telegram.ui.Components.h51) obj);
    }
}
