package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mt0 extends eg.c1 {
    public final /* synthetic */ PhotoViewer l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, tq0 tq0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, tq0Var, g6Var);
        this.l2 = photoViewer;
    }

    @Override // eg.c1
    public final int getPKeyboardHeight() {
        qh.h3 h3Var = this.l2.H1;
        if (h3Var != null) {
            return h3Var.l;
        }
        return 0;
    }
}
