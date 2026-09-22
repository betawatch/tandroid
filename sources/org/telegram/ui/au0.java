package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class au0 extends qg.n0 {
    public final /* synthetic */ PhotoViewer o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, jr0 jr0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, jr0Var, f6Var);
        this.o2 = photoViewer;
    }

    @Override // qg.n0
    public final int getPKeyboardHeight() {
        ci.j4 j4Var = this.o2.K1;
        if (j4Var != null) {
            return j4Var.l;
        }
        return 0;
    }
}
