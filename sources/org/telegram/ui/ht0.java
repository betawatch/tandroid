package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ht0 extends eg.c1 {
    public final /* synthetic */ PhotoViewer l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, oq0 oq0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, oq0Var, g6Var);
        this.l2 = photoViewer;
    }

    @Override // eg.c1
    public final int getPKeyboardHeight() {
        qh.i3 i3Var = this.l2.H1;
        if (i3Var != null) {
            return i3Var.l;
        }
        return 0;
    }
}
