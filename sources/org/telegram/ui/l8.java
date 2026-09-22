package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8 implements r0.n, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.al0 {
    public final /* synthetic */ l9 a;

    public /* synthetic */ l8(l9 l9Var) {
        this.a = l9Var;
    }

    @Override // r0.n
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return this.a.onInsetsInternal(view, l1Var);
    }

    @Override // org.telegram.ui.Components.al0
    public void a() {
        this.a.f0();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        l9.X(this.a, (org.telegram.ui.Components.y51) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.y51) obj).G;
        if (obj6 instanceof h9) {
            this.a.e0(((h9) obj6).c, (g9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
