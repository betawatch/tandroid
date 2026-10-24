package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class km extends s4.c0 {
    public final /* synthetic */ di.k r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(di.k kVar, Context context) {
        super(context);
        this.r = kVar;
    }

    @Override // s4.c0
    public final int k(int i10, View view) {
        int topScrollOffset;
        int k10 = super.k(i10, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.r.R;
        int paddingTop = chatAttachAlertPhotoLayout.E.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override // s4.c0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
