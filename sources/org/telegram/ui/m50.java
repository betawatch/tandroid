package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m50 implements org.telegram.ui.Components.w40 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public ImageLocation d;
    public final long e;
    public final /* synthetic */ e60 f;

    public m50(e60 e60Var, long j10) {
        this.f = e60Var;
        this.e = j10;
    }

    @Override // org.telegram.ui.Components.w40
    public final void D(float f10) {
        this.f.b.O(this.d, f10);
        a(f10);
    }

    @Override // org.telegram.ui.Components.w40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ed(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 2));
    }

    public final void a(float f10) {
        this.a = f10;
        l50 l50Var = this.f.N;
        if (l50Var == null) {
            return;
        }
        for (int i10 = 0; i10 < l50Var.getChildCount(); i10++) {
            View childAt = l50Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.d4) {
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                if (d4Var.c()) {
                    org.telegram.ui.Cells.x3 x3Var = d4Var.x;
                    x3Var.setProgress(f10);
                    if (f10 < 1.0f) {
                        AndroidUtilities.updateViewVisibilityAnimated(x3Var, true, 1.0f, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(x3Var, false, 1.0f, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ qu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.w40
    public final void K(boolean z4, boolean z10) {
    }
}
