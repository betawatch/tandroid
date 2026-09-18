package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8 implements r0.n, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.yk0 {
    public final /* synthetic */ l9 a;

    public /* synthetic */ l8(l9 l9Var) {
        this.a = l9Var;
    }

    @Override // r0.n
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        return this.a.onInsetsInternal(view, m1Var);
    }

    @Override // org.telegram.ui.Components.yk0
    public void a() {
        this.a.f0();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        l9.X(this.a, (org.telegram.ui.Components.x51) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.x51) obj).G;
        if (obj6 instanceof h9) {
            this.a.e0(((h9) obj6).c, (g9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
