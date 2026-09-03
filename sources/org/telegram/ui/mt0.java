package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mt0 extends dg.e1 {
    public final /* synthetic */ PhotoViewer l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, tq0 tq0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, tq0Var, f6Var);
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
