package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g30 implements org.telegram.ui.Components.e30 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public org.telegram.messenger.ac d;
    public final long e;
    public final /* synthetic */ x30 f;

    public g30(x30 x30Var, long j10) {
        this.f = x30Var;
        this.e = j10;
    }

    @Override // org.telegram.ui.Components.e30
    public final void H(float f10) {
        this.f.j1.O(this.d, f10);
        a(f10);
    }

    @Override // org.telegram.ui.Components.e30
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ji.j(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f10) {
        this.a = f10;
        f30 f30Var = this.f.I1;
        if (f30Var == null) {
            return;
        }
        for (int i3 = 0; i3 < f30Var.getChildCount(); i3++) {
            View childAt = f30Var.getChildAt(i3);
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

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ mq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.e30
    public final void O(boolean z10, boolean z11) {
    }
}
