package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class bt0 extends org.telegram.ui.Components.br0 {
    public final /* synthetic */ FrameLayout X0;
    public final /* synthetic */ boolean Y0;
    public final /* synthetic */ PhotoViewer Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(PhotoViewer photoViewer, Context context, yn ynVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, ynVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.Z0 = photoViewer;
        this.X0 = frameLayout;
        this.Y0 = z10;
    }

    @Override // org.telegram.ui.Components.br0
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r21(this, this.X0, iVar, i10, 9), 250L);
        }
    }

    @Override // org.telegram.ui.Components.br0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.Y0) {
            AndroidUtilities.runOnUIThread(new nl0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.Z0;
        photoViewer.d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.y.getSystemService("window")).updateViewLayout(photoViewer.g0, photoViewer.d0);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
