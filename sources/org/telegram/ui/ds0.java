package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ds0 extends org.telegram.ui.Components.rp0 {
    public final /* synthetic */ FrameLayout X0;
    public final /* synthetic */ boolean Y0;
    public final /* synthetic */ PhotoViewer Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds0(PhotoViewer photoViewer, Context context, qn qnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, qnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.Z0 = photoViewer;
        this.X0 = frameLayout;
        this.Y0 = z10;
    }

    @Override // org.telegram.ui.Components.rp0
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.y01(this, this.X0, hVar, i9, 9), 250L);
        }
    }

    @Override // org.telegram.ui.Components.rp0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.Y0) {
            AndroidUtilities.runOnUIThread(new zk0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.Z0;
        photoViewer.Z.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.y.getSystemService("window")).updateViewLayout(photoViewer.c0, photoViewer.Z);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
