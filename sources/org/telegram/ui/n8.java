package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8 implements r0.n, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.ol0 {
    public final /* synthetic */ m9 a;

    public /* synthetic */ n8(m9 m9Var) {
        this.a = m9Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        return this.a.onInsetsInternal(view, k1Var);
    }

    @Override // org.telegram.ui.Components.ol0
    public void a() {
        this.a.e0();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m9.W(this.a, (org.telegram.ui.Components.m61) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.m61) obj).G;
        if (obj6 instanceof i9) {
            this.a.d0(((i9) obj6).c, (h9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
