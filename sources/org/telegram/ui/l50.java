package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l50 implements org.telegram.ui.Components.x40 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public ImageLocation d;
    public final long e;
    public final /* synthetic */ d60 f;

    public l50(d60 d60Var, long j10) {
        this.f = d60Var;
        this.e = j10;
    }

    @Override // org.telegram.ui.Components.x40
    public final void D(float f10) {
        this.f.b.O(this.d, f10);
        a(f10);
    }

    @Override // org.telegram.ui.Components.x40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 2));
    }

    public final void a(float f10) {
        this.a = f10;
        k50 k50Var = this.f.N;
        if (k50Var == null) {
            return;
        }
        for (int i10 = 0; i10 < k50Var.getChildCount(); i10++) {
            View childAt = k50Var.getChildAt(i10);
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

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ qu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.x40
    public final void K(boolean z4, boolean z10) {
    }
}
