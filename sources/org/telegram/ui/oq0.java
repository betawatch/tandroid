package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oq0 extends org.telegram.ui.Components.op0 {
    public final /* synthetic */ FrameLayout R2;
    public final /* synthetic */ boolean S2;
    public final /* synthetic */ PhotoViewer T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq0(PhotoViewer photoViewer, Context context, un unVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, unVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.T2 = photoViewer;
        this.R2 = frameLayout;
        this.S2 = z10;
    }

    @Override // org.telegram.ui.Components.op0, org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        if (this.S2) {
            org.telegram.messenger.i0.h3(new mg0(this, 20), 50L);
        }
        PhotoViewer photoViewer = this.T2;
        photoViewer.d0.softInputMode = org.telegram.messenger.zs.v4;
        try {
            ((WindowManager) photoViewer.D.getSystemService("window")).updateViewLayout(photoViewer.g0, photoViewer.d0);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.op0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.messenger.i0.h3(new org.telegram.ui.Components.c11(this, this.R2, hVar, i10, 9), 250L);
        }
    }
}
