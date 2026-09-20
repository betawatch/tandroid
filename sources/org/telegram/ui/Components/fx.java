package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class fx extends p51 {
    public final /* synthetic */ kz b;

    public fx(kz kzVar) {
        this.b = kzVar;
    }

    @Override // org.telegram.ui.Components.p51
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.p51
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.p51
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.p51
    public final boolean d(i51 i51Var, MotionEvent motionEvent) {
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        kz kzVar = this.b;
        kzVar.getMeasuredHeight();
        return q6.r(motionEvent, i51Var, kzVar.g2, kzVar.Z1);
    }

    @Override // org.telegram.ui.Components.p51
    public final boolean e(i51 i51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        kz kzVar = this.b;
        kzVar.getMeasuredHeight();
        return q6.s(motionEvent, i51Var, jVar, kzVar.g2, kzVar.Z1);
    }

    @Override // org.telegram.ui.Components.p51
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.p51
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        kz kzVar = this.b;
        kzVar.t1.r(stickerSetCovered);
        if (z10) {
            kzVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.p51
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.p51
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
