package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class cr0 extends jg.r0 {
    public final /* synthetic */ PhotoViewer X1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, org.telegram.messenger.ze zeVar, oo0 oo0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, zeVar, oo0Var, p6Var);
        this.X1 = photoViewer;
    }

    @Override // jg.r0
    public final int getPKeyboardHeight() {
        vh.r2 r2Var = this.X1.K1;
        if (r2Var != null) {
            return r2Var.l;
        }
        return 0;
    }
}
