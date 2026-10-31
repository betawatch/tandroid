package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class er0 extends jg.r0 {
    public final /* synthetic */ PhotoViewer X1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, org.telegram.messenger.ye yeVar, qo0 qo0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, yeVar, qo0Var, p6Var);
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
