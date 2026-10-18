package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class a50 implements org.telegram.ui.Components.d50 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public ImageLocation d;
    public final long e;
    public final /* synthetic */ s50 f;

    public a50(s50 s50Var, long j10) {
        this.f = s50Var;
        this.e = j10;
    }

    @Override // org.telegram.ui.Components.d50
    public final void F(float f7) {
        this.f.b.O(this.d, f7);
        a(f7);
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f7) {
        this.a = f7;
        y40 y40Var = this.f.Q;
        if (y40Var == null) {
            return;
        }
        for (int i10 = 0; i10 < y40Var.getChildCount(); i10++) {
            View childAt = y40Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.d4) {
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                if (d4Var.c()) {
                    org.telegram.ui.Cells.y3 y3Var = d4Var.x;
                    y3Var.setProgress(f7);
                    if (f7 < 1.0f) {
                        AndroidUtilities.updateViewVisibilityAnimated(y3Var, true, 1.0f, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(y3Var, false, 1.0f, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ lu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.d50
    public final void J(boolean z10, boolean z11) {
    }
}
