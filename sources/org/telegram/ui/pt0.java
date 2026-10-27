package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pt0 extends sg.m0 {
    public final /* synthetic */ PhotoViewer d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, zq0 zq0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, zq0Var, u6Var);
        this.d2 = photoViewer;
    }

    @Override // sg.m0
    public final int getPKeyboardHeight() {
        fi.z3 z3Var = this.d2.K1;
        if (z3Var != null) {
            return z3Var.l;
        }
        return 0;
    }
}
