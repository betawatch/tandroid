package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ml extends u4.c0 {
    public final /* synthetic */ fi.g r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml(fi.g gVar, Context context) {
        super(context);
        this.r = gVar;
    }

    @Override // u4.c0
    public final int k(int i3, View view) {
        int topScrollOffset;
        int k10 = super.k(i3, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.r.R;
        int paddingTop = chatAttachAlertPhotoLayout.F.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override // u4.c0
    public final int m(int i3) {
        return super.m(i3) * 2;
    }
}
