package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements r0.o, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.nk0 {
    public final /* synthetic */ h9 a;

    public /* synthetic */ i8(h9 h9Var) {
        this.a = h9Var;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        return this.a.onInsetsInternal(view, m1Var);
    }

    @Override // org.telegram.ui.Components.nk0
    public void a() {
        this.a.f0();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        h9.X(this.a, (org.telegram.ui.Components.w41) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.w41) obj).G;
        if (obj6 instanceof d9) {
            this.a.e0(((d9) obj6).c, (c9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
