package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class mp extends m2.g {
    public lp s0;

    public mp(Context context) {
        super(context);
        b(new kp((ah0) this));
    }

    @Override // m2.g
    @Deprecated
    public void setAdapter(m2.a aVar) {
        if (!(aVar instanceof lp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((lp) aVar);
    }

    public void setAdapter(lp lpVar) {
        this.s0 = lpVar;
        super.setAdapter((m2.a) lpVar);
        if (lpVar != null) {
            x(lpVar.j(), false);
        }
    }
}
