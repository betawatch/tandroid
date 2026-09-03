package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xl extends f2.k0 {
    public final /* synthetic */ zi r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(zi ziVar, Context context) {
        super(context);
        this.r = ziVar;
    }

    @Override // f2.k0
    public final int k(int i10, View view) {
        int topScrollOffset;
        int k10 = super.k(i10, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.r.R;
        int paddingTop = chatAttachAlertPhotoLayout.B.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override // f2.k0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
