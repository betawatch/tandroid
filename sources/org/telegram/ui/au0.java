package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class au0 extends qg.p0 {
    public final /* synthetic */ PhotoViewer o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, ir0 ir0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, ir0Var, e6Var);
        this.o2 = photoViewer;
    }

    @Override // qg.p0
    public final int getPKeyboardHeight() {
        ci.j4 j4Var = this.o2.K1;
        if (j4Var != null) {
            return j4Var.l;
        }
        return 0;
    }
}
