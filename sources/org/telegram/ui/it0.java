package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class it0 extends rg.m0 {
    public final /* synthetic */ PhotoViewer o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, sq0 sq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, sq0Var, d6Var);
        this.o2 = photoViewer;
    }

    @Override // rg.m0
    public final int getPKeyboardHeight() {
        ei.b4 b4Var = this.o2.K1;
        if (b4Var != null) {
            return b4Var.l;
        }
        return 0;
    }
}
