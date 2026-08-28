package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ql extends f2.n0 {
    public final /* synthetic */ jh.k r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(jh.k kVar, Context context) {
        super(context);
        this.r = kVar;
    }

    @Override // f2.n0
    public final int k(int i9, View view) {
        int topScrollOffset;
        int k10 = super.k(i9, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.r.R;
        int paddingTop = chatAttachAlertPhotoLayout.A.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override // f2.n0
    public final int m(int i9) {
        return super.m(i9) * 2;
    }
}
