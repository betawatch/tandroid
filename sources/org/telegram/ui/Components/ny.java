package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ny extends p9 {
    public final /* synthetic */ oy H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny(oy oyVar, Context context) {
        super(context);
        this.H = oyVar;
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        oy oyVar = this.H;
        qy qyVar = oyVar.d;
        boolean z10 = oyVar.c;
        if (z10) {
            return;
        }
        if (!org.telegram.messenger.ri.d0(qyVar.d1).v0[z10 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.id)) || qyVar.t1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), qyVar.t1);
    }
}
