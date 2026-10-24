package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class jt0 extends rg.m0 {
    public final /* synthetic */ PhotoViewer o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, tq0 tq0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, tq0Var, g6Var);
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
