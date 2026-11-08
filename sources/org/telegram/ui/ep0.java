package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ep0 extends org.telegram.ui.Components.mo0 {
    public final /* synthetic */ FrameLayout R2;
    public final /* synthetic */ boolean S2;
    public final /* synthetic */ PhotoViewer T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep0(PhotoViewer photoViewer, Context context, an anVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z9) {
        super(context, anVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.T2 = photoViewer;
        this.R2 = frameLayout;
        this.S2 = z9;
    }

    @Override // org.telegram.ui.Components.mo0, org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        if (this.S2) {
            org.telegram.messenger.g0.i3(new ef0(this, 20), 50L);
        }
        PhotoViewer photoViewer = this.T2;
        photoViewer.d0.softInputMode = org.telegram.messenger.qs.v4;
        try {
            ((WindowManager) photoViewer.D.getSystemService("window")).updateViewLayout(photoViewer.g0, photoViewer.d0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            org.telegram.messenger.g0.i3(new org.telegram.ui.Components.pp0(this, this.R2, hVar, i7, 14), 250L);
        }
    }
}
