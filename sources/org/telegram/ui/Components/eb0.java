package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class eb0 extends o81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ dc0 b;

    public eb0(dc0 dc0Var, Context context) {
        this.b = dc0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.o81
    public final void b(View view, int i10, int i11) {
        xb0 xb0Var = (xb0) view;
        xb0Var.h();
        xb0Var.k(false);
    }

    @Override // org.telegram.ui.Components.o81
    public final View d(int i10) {
        return new xb0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.o81
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.o81
    public final int h(int i10) {
        return ((ac0) this.b.e.a.get(i10)).a;
    }
}
