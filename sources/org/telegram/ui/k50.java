package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k50 implements org.telegram.ui.Components.v40 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public ImageLocation d;
    public final long e;
    public final /* synthetic */ c60 f;

    public k50(c60 c60Var, long j10) {
        this.f = c60Var;
        this.e = j10;
    }

    @Override // org.telegram.ui.Components.v40
    public final void D(float f10) {
        this.f.b.O(this.d, f10);
        a(f10);
    }

    @Override // org.telegram.ui.Components.v40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 2));
    }

    public final void a(float f10) {
        this.a = f10;
        j50 j50Var = this.f.N;
        if (j50Var == null) {
            return;
        }
        for (int i10 = 0; i10 < j50Var.getChildCount(); i10++) {
            View childAt = j50Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.e4) {
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                if (e4Var.c()) {
                    org.telegram.ui.Cells.y3 y3Var = e4Var.x;
                    y3Var.setProgress(f10);
                    if (f10 < 1.0f) {
                        AndroidUtilities.updateViewVisibilityAnimated(y3Var, true, 1.0f, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(y3Var, false, 1.0f, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ ju0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.v40
    public final void I(boolean z4, boolean z10) {
    }
}
