package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gv extends o9 {
    public final /* synthetic */ jv C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv(jv jvVar, Context context) {
        super(context);
        this.C = jvVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (hg.h0.b(this)) {
            return;
        }
        super.invalidate();
        this.C.f();
    }

    @Override // android.view.View
    public final void invalidate(int i9, int i10, int i11, int i12) {
        if (hg.h0.b(this)) {
            return;
        }
        super.invalidate(i9, i10, i11, i12);
    }
}
