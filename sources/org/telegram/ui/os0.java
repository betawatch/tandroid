package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class os0 extends org.telegram.ui.Components.dr0 {
    public final /* synthetic */ FrameLayout b1;
    public final /* synthetic */ boolean c1;
    public final /* synthetic */ PhotoViewer d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os0(PhotoViewer photoViewer, Context context, sn snVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, snVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.d1 = photoViewer;
        this.b1 = frameLayout;
        this.c1 = z10;
    }

    @Override // org.telegram.ui.Components.dr0
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.az0(this, this.b1, hVar, i10, 11), 250L);
        }
    }

    @Override // org.telegram.ui.Components.dr0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.c1) {
            AndroidUtilities.runOnUIThread(new ek0(this, 17), 50L);
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
