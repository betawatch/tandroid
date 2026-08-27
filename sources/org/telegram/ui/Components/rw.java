package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rw extends g41 {
    public final /* synthetic */ yy b;

    public rw(yy yyVar) {
        this.b = yyVar;
    }

    @Override // org.telegram.ui.Components.g41
    public final boolean a() {
        return this.b.p1.b();
    }

    @Override // org.telegram.ui.Components.g41
    public final String[] b() {
        return this.b.S0;
    }

    @Override // org.telegram.ui.Components.g41
    public final boolean c() {
        return this.b.p1.c();
    }

    @Override // org.telegram.ui.Components.g41
    public final boolean d(z31 z31Var, MotionEvent motionEvent) {
        org.telegram.ui.kt q6 = org.telegram.ui.kt.q();
        yy yyVar = this.b;
        yyVar.getMeasuredHeight();
        return q6.r(motionEvent, z31Var, yyVar.c2, yyVar.V1);
    }

    @Override // org.telegram.ui.Components.g41
    public final boolean e(z31 z31Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.kt q6 = org.telegram.ui.kt.q();
        yy yyVar = this.b;
        yyVar.getMeasuredHeight();
        return q6.s(motionEvent, z31Var, jVar, yyVar.c2, yyVar.V1);
    }

    @Override // org.telegram.ui.Components.g41
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.p1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.g41
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        yy yyVar = this.b;
        yyVar.p1.r(stickerSetCovered);
        if (z10) {
            yyVar.Z(true);
        }
    }

    @Override // org.telegram.ui.Components.g41
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.p1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.g41
    public final void i(String[] strArr) {
        this.b.S0 = strArr;
    }
}
