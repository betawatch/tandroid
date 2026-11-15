package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l30 implements org.telegram.ui.Components.l30 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public org.telegram.messenger.gc d;
    public final long e;
    public final /* synthetic */ c40 f;

    public l30(c40 c40Var, long j3) {
        this.f = c40Var;
        this.e = j3;
    }

    @Override // org.telegram.ui.Components.l30
    public final void I(float f10) {
        this.f.m1.O(this.d, f10);
        a(f10);
    }

    @Override // org.telegram.ui.Components.l30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new li.j(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f10) {
        this.a = f10;
        k30 k30Var = this.f.L1;
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
                        org.telegram.messenger.g0.Y3(b4Var, true, 1.0f, true, true);
                    } else {
                        org.telegram.messenger.g0.Y3(b4Var, false, 1.0f, true, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ uq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.l30
    public final void O(boolean z10, boolean z11) {
    }
}
