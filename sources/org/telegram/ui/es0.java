package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class es0 extends org.telegram.ui.Components.sp0 {
    public final /* synthetic */ FrameLayout X0;
    public final /* synthetic */ boolean Y0;
    public final /* synthetic */ PhotoViewer Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es0(PhotoViewer photoViewer, Context context, rn rnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, rnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.Z0 = photoViewer;
        this.X0 = frameLayout;
        this.Y0 = z10;
    }

    @Override // org.telegram.ui.Components.sp0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new xs(this, this.X0, hVar, i10, 8), 250L);
        }
    }

    @Override // org.telegram.ui.Components.sp0, org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.Y0) {
            AndroidUtilities.runOnUIThread(new zk0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.Z0;
        photoViewer.Z.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.y.getSystemService("window")).updateViewLayout(photoViewer.c0, photoViewer.Z);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
