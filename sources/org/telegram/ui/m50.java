package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class m50 implements org.telegram.ui.Components.u40 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public ImageLocation d;
    public final long e;
    public final /* synthetic */ f60 f;

    public m50(f60 f60Var, long j3) {
        this.f = f60Var;
        this.e = j3;
    }

    @Override // org.telegram.ui.Components.u40
    public final void B(float f7) {
        this.f.b.O(this.d, f7);
        a(f7);
    }

    @Override // org.telegram.ui.Components.u40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new fi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f7) {
        this.a = f7;
        l50 l50Var = this.f.Q;
        if (l50Var == null) {
            return;
        }
        for (int i10 = 0; i10 < l50Var.getChildCount(); i10++) {
            View childAt = l50Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.e4) {
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                if (e4Var.c()) {
                    org.telegram.ui.Cells.z3 z3Var = e4Var.x;
                    z3Var.setProgress(f7);
                    if (f7 < 1.0f) {
                        AndroidUtilities.updateViewVisibilityAnimated(z3Var, true, 1.0f, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(z3Var, false, 1.0f, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ wu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.u40
    public final void L(boolean z10, boolean z11) {
    }
}
