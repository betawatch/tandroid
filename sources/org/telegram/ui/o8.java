package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8 implements r0.o, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.xk0 {
    public final /* synthetic */ n9 a;

    public /* synthetic */ o8(n9 n9Var) {
        this.a = n9Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        return this.a.onInsetsInternal(view, m1Var);
    }

    @Override // org.telegram.ui.Components.xk0
    public void e() {
        this.a.f0();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n9.X(this.a, (org.telegram.ui.Components.i51) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z4;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.i51) obj).G;
        if (obj6 instanceof j9) {
            this.a.e0(((j9) obj6).c, (i9) view);
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
