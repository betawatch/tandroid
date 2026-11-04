package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lp0 extends ug.f0 {
    public final /* synthetic */ PhotoViewer Y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(PhotoViewer photoViewer, Context context, Activity activity, int i3, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, org.telegram.messenger.re reVar, xm0 xm0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, activity, i3, bitmap, bitmap2, i10, arrayList, reVar, xm0Var, e6Var);
        this.Y1 = photoViewer;
    }

    @Override // ug.f0
    public final int getPKeyboardHeight() {
        gi.p3 p3Var = this.Y1.L1;
        if (p3Var != null) {
            return p3Var.l;
        }
        return 0;
    }

    @Override // ug.f0
    public final void o0(boolean z10) {
        PhotoViewer photoViewer = this.Y1;
        if (photoViewer.G2 == null) {
            return;
        }
        photoViewer.I2 = false;
        photoViewer.v0();
        if (z10) {
            photoViewer.G2.g0();
        } else {
            if (photoViewer.K4 && photoViewer.T1() && photoViewer.d2 != 1) {
                return;
            }
            photoViewer.G2.h0();
        }
    }
}
