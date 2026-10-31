package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vl extends s4.b0 {
    public final /* synthetic */ oi r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(oi oiVar, Context context) {
        super(context);
        this.r = oiVar;
    }

    @Override // s4.b0
    public final int k(int i10, View view) {
        int topScrollOffset;
        int k10 = super.k(i10, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.r.R;
        int paddingTop = chatAttachAlertPhotoLayout.E.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override // s4.b0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
