package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ft0 extends org.telegram.ui.Components.hq0 {
    public final /* synthetic */ FrameLayout b1;
    public final /* synthetic */ boolean c1;
    public final /* synthetic */ PhotoViewer d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(PhotoViewer photoViewer, Context context, co coVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, coVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.d1 = photoViewer;
        this.b1 = frameLayout;
        this.c1 = z10;
    }

    @Override // org.telegram.ui.Components.hq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r11(this, this.b1, iVar, i10, 9), 250L);
        }
    }

    @Override // org.telegram.ui.Components.hq0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.c1) {
            AndroidUtilities.runOnUIThread(new rl0(this, 16), 50L);
        }
        PhotoViewer photoViewer = this.d1;
        photoViewer.d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.y.getSystemService("window")).updateViewLayout(photoViewer.g0, photoViewer.d0);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
