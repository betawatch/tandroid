package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e50 implements org.telegram.ui.Components.f50 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public ImageLocation d;
    public final long e;
    public final /* synthetic */ x50 f;

    public e50(x50 x50Var, long j10) {
        this.f = x50Var;
        this.e = j10;
    }

    @Override // org.telegram.ui.Components.f50
    public final void F(float f7) {
        this.f.b.O(this.d, f7);
        a(f7);
    }

    @Override // org.telegram.ui.Components.f50
    public final void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ii.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f7) {
        this.a = f7;
        d50 d50Var = this.f.Q;
        if (d50Var == null) {
            return;
        }
        for (int i10 = 0; i10 < d50Var.getChildCount(); i10++) {
            View childAt = d50Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.i4) {
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) childAt;
                if (i4Var.c()) {
                    org.telegram.ui.Cells.d4 d4Var = i4Var.x;
                    d4Var.setProgress(f7);
                    if (f7 < 1.0f) {
                        AndroidUtilities.updateViewVisibilityAnimated(d4Var, true, 1.0f, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(d4Var, false, 1.0f, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ su0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ void Q() {
    }

    @Override // org.telegram.ui.Components.f50
    public final void L(boolean z10, boolean z11) {
    }
}
