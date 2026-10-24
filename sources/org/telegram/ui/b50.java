package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class b50 implements org.telegram.ui.Components.d50 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public ImageLocation d;
    public final long e;
    public final /* synthetic */ u50 f;

    public b50(u50 u50Var, long j10) {
        this.f = u50Var;
        this.e = j10;
    }

    @Override // org.telegram.ui.Components.d50
    public final void E(float f7) {
        this.f.b.O(this.d, f7);
        a(f7);
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f7) {
        this.a = f7;
        z40 z40Var = this.f.Q;
        if (z40Var == null) {
            return;
        }
        for (int i10 = 0; i10 < z40Var.getChildCount(); i10++) {
            View childAt = z40Var.getChildAt(i10);
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
    public final /* synthetic */ mu0 getCloseIntoObject() {
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
    public final void K(boolean z10, boolean z11) {
    }
}
