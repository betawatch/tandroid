package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements r0.n, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.ok0 {
    public final /* synthetic */ m9 a;

    public /* synthetic */ m8(m9 m9Var) {
        this.a = m9Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return this.a.onInsetsInternal(view, l1Var);
    }

    @Override // org.telegram.ui.Components.ok0
    public void a() {
        this.a.f0();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m9.X(this.a, (org.telegram.ui.Components.j51) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.j51) obj).G;
        if (obj6 instanceof i9) {
            this.a.e0(((i9) obj6).c, (h9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
