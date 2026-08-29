package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cs0 extends org.telegram.ui.Components.dq0 {
    public final /* synthetic */ FrameLayout X0;
    public final /* synthetic */ boolean Y0;
    public final /* synthetic */ PhotoViewer Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs0(PhotoViewer photoViewer, Context context, tn tnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, tnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.Z0 = photoViewer;
        this.X0 = frameLayout;
        this.Y0 = z10;
    }

    @Override // org.telegram.ui.Components.dq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new vs(this, this.X0, hVar, i10, 8), 250L);
        }
    }

    @Override // org.telegram.ui.Components.dq0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.Y0) {
            AndroidUtilities.runOnUIThread(new vk0(this, 17), 50L);
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
