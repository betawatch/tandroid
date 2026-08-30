package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ft0 extends dg.e1 {
    public final /* synthetic */ PhotoViewer l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, mq0 mq0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, mq0Var, f6Var);
        this.l2 = photoViewer;
    }

    @Override // dg.e1
    public final int getPKeyboardHeight() {
        ph.i3 i3Var = this.l2.H1;
        if (i3Var != null) {
            return i3Var.l;
        }
        return 0;
    }
}
