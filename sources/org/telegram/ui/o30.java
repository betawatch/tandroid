package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class o30 implements org.telegram.ui.Components.w30 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public org.telegram.messenger.fc d;
    public final long e;
    public final /* synthetic */ f40 f;

    public o30(f40 f40Var, long j3) {
        this.f = f40Var;
        this.e = j3;
    }

    @Override // org.telegram.ui.Components.w30
    public final void I(float f10) {
        this.f.m1.O(this.d, f10);
        a(f10);
    }

    @Override // org.telegram.ui.Components.w30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.l(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f10) {
        this.a = f10;
        n30 n30Var = this.f.L1;
        if (n30Var == null) {
            return;
        }
        for (int i7 = 0; i7 < n30Var.getChildCount(); i7++) {
            View childAt = n30Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                if (g4Var.c()) {
                    org.telegram.ui.Cells.c4 c4Var = g4Var.y;
                    c4Var.setProgress(f10);
                    if (f10 < 1.0f) {
                        org.telegram.messenger.g0.X3(c4Var, true, 1.0f, true, true);
                    } else {
                        org.telegram.messenger.g0.X3(c4Var, false, 1.0f, true, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.w30
    public final void Q(boolean z10, boolean z11) {
    }
}
