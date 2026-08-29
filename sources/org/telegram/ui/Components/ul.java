package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ul extends f2.k0 {
    public final /* synthetic */ mh.k r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(mh.k kVar, Context context) {
        super(context);
        this.r = kVar;
    }

    @Override // f2.k0
    public final int k(int i10, View view) {
        int topScrollOffset;
        int k9 = super.k(i10, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.r.R;
        int paddingTop = chatAttachAlertPhotoLayout.A.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k9 - (paddingTop - topScrollOffset);
    }

    @Override // f2.k0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
