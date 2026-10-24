package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ps0 extends org.telegram.ui.Components.ir0 {
    public final /* synthetic */ FrameLayout e1;
    public final /* synthetic */ boolean f1;
    public final /* synthetic */ PhotoViewer g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(PhotoViewer photoViewer, Context context, sn snVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, snVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.g1 = photoViewer;
        this.e1 = frameLayout;
        this.f1 = z10;
    }

    @Override // org.telegram.ui.Components.ir0
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fz0(this, this.e1, hVar, i10, 12), 250L);
        }
    }

    @Override // org.telegram.ui.Components.ir0, org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f1) {
            AndroidUtilities.runOnUIThread(new oj0(this, 18), 50L);
        }
        PhotoViewer photoViewer = this.g1;
        photoViewer.d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.y.getSystemService("window")).updateViewLayout(photoViewer.g0, photoViewer.d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
