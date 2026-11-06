package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class dw0 extends org.telegram.ui.Cells.x8 {
    public final /* synthetic */ jw0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw0(jw0 jw0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10) {
        super(18, context, f6Var, z9, z10);
        this.r = jw0Var;
    }

    @Override // org.telegram.ui.Cells.x8
    public final int a(int i7) {
        ProfileActivity profileActivity = this.r.e;
        RectF rectF = ProfileActivity.S6;
        profileActivity.getClass();
        return i7;
    }
}
