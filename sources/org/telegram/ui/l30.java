package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l30 implements org.telegram.ui.Components.i30 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public org.telegram.messenger.hc d;
    public final long e;
    public final /* synthetic */ c40 f;

    public l30(c40 c40Var, long j3) {
        this.f = c40Var;
        this.e = j3;
    }

    @Override // org.telegram.ui.Components.i30
    public final void H(float f10) {
        this.f.i1.O(this.d, f10);
        a(f10);
    }

    @Override // org.telegram.ui.Components.i30
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ii.l(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f10) {
        this.a = f10;
        k30 k30Var = this.f.H1;
        if (k30Var == null) {
            return;
        }
        for (int i7 = 0; i7 < k30Var.getChildCount(); i7++) {
            View childAt = k30Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.f4) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                if (f4Var.c()) {
                    org.telegram.ui.Cells.b4 b4Var = f4Var.y;
                    b4Var.setProgress(f10);
                    if (f10 < 1.0f) {
                        org.telegram.messenger.g0.Z3(b4Var, true, 1.0f, true, true);
                    } else {
                        org.telegram.messenger.g0.Z3(b4Var, false, 1.0f, true, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ vq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.i30
    public final void O(boolean z9, boolean z10) {
    }
}
