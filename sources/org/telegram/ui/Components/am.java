package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class am extends s4.d0 {
    public final /* synthetic */ bi.l r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(bi.l lVar, Context context) {
        super(context);
        this.r = lVar;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        int topScrollOffset;
        int k10 = super.k(i10, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.r.R;
        int paddingTop = chatAttachAlertPhotoLayout.E.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
