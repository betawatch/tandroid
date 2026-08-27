package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ml extends f2.l0 {
    public final /* synthetic */ kh.l r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml(kh.l lVar, Context context) {
        super(context);
        this.r = lVar;
    }

    @Override // f2.l0
    public final int k(int i10, View view) {
        int topScrollOffset;
        int k10 = super.k(i10, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.r.R;
        int paddingTop = chatAttachAlertPhotoLayout.A.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override // f2.l0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
