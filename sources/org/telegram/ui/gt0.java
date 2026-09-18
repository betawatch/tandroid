package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class gt0 extends org.telegram.ui.Components.vq0 {
    public final /* synthetic */ FrameLayout b1;
    public final /* synthetic */ boolean c1;
    public final /* synthetic */ PhotoViewer d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt0(PhotoViewer photoViewer, Context context, zn znVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, znVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.d1 = photoViewer;
        this.b1 = frameLayout;
        this.c1 = z10;
    }

    @Override // org.telegram.ui.Components.vq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h21(this, this.b1, iVar, i10, 9), 250L);
        }
    }

    @Override // org.telegram.ui.Components.vq0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.c1) {
            AndroidUtilities.runOnUIThread(new sl0(this, 16), 50L);
        }
        PhotoViewer photoViewer = this.d1;
        photoViewer.d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.y.getSystemService("window")).updateViewLayout(photoViewer.g0, photoViewer.d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
