package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements r0.o, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.ck0 {
    public final /* synthetic */ i9 a;

    public /* synthetic */ j8(i9 i9Var) {
        this.a = i9Var;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        return this.a.onInsetsInternal(view, m1Var);
    }

    @Override // org.telegram.ui.Components.ck0
    public void b() {
        this.a.e0();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        i9.W(this.a, (org.telegram.ui.Components.l41) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.l41) obj).G;
        if (obj6 instanceof e9) {
            this.a.d0(((e9) obj6).c, (d9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
