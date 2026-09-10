package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ft0 extends org.telegram.ui.Components.sq0 {
    public final /* synthetic */ FrameLayout b1;
    public final /* synthetic */ boolean c1;
    public final /* synthetic */ PhotoViewer d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(PhotoViewer photoViewer, Context context, eo eoVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, eoVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.d1 = photoViewer;
        this.b1 = frameLayout;
        this.c1 = z10;
    }

    @Override // org.telegram.ui.Components.sq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g21(this, this.b1, iVar, i10, 9), 250L);
        }
    }

    @Override // org.telegram.ui.Components.sq0, org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.c1) {
            AndroidUtilities.runOnUIThread(new ql0(this, 16), 50L);
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
