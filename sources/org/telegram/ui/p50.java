package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class p50 implements org.telegram.ui.Components.t40 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public ImageLocation d;
    public final long e;
    public final /* synthetic */ i60 f;

    public p50(i60 i60Var, long j3) {
        this.f = i60Var;
        this.e = j3;
    }

    @Override // org.telegram.ui.Components.t40
    public final void B(float f7) {
        this.f.b.O(this.d, f7);
        a(f7);
    }

    @Override // org.telegram.ui.Components.t40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new fi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f7) {
        this.a = f7;
        o50 o50Var = this.f.Q;
        if (o50Var == null) {
            return;
        }
        for (int i10 = 0; i10 < o50Var.getChildCount(); i10++) {
            View childAt = o50Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.f4) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                if (f4Var.c()) {
                    org.telegram.ui.Cells.a4 a4Var = f4Var.x;
                    a4Var.setProgress(f7);
                    if (f7 < 1.0f) {
                        AndroidUtilities.updateViewVisibilityAnimated(a4Var, true, 1.0f, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(a4Var, false, 1.0f, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ dv0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.t40
    public final void L(boolean z10, boolean z11) {
    }
}
