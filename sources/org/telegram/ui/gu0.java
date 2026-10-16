package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class gu0 extends rg.o0 {
    public final /* synthetic */ PhotoViewer o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, mr0 mr0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, mr0Var, c6Var);
        this.o2 = photoViewer;
    }

    @Override // rg.o0
    public final int getPKeyboardHeight() {
        di.h4 h4Var = this.o2.K1;
        if (h4Var != null) {
            return h4Var.l;
        }
        return 0;
    }
}
