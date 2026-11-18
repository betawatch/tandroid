package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class bm extends v4.d0 {
    public final /* synthetic */ gi.g r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(gi.g gVar, Context context) {
        super(context);
        this.r = gVar;
    }

    @Override // v4.d0
    public final int k(int i7, View view) {
        int topScrollOffset;
        int k10 = super.k(i7, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.r.R;
        int paddingTop = chatAttachAlertPhotoLayout.F.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override // v4.d0
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
