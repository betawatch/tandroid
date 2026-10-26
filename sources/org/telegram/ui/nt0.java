package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class nt0 extends sg.n0 {
    public final /* synthetic */ PhotoViewer d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, xq0 xq0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, xq0Var, u6Var);
        this.d2 = photoViewer;
    }

    @Override // sg.n0
    public final int getPKeyboardHeight() {
        fi.z3 z3Var = this.d2.K1;
        if (z3Var != null) {
            return z3Var.l;
        }
        return 0;
    }
}
