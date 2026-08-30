package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ks0 extends org.telegram.ui.Components.lq0 {
    public final /* synthetic */ FrameLayout Y0;
    public final /* synthetic */ boolean Z0;
    public final /* synthetic */ PhotoViewer a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(PhotoViewer photoViewer, Context context, xn xnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z4) {
        super(context, xnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.a1 = photoViewer;
        this.Y0 = frameLayout;
        this.Z0 = z4;
    }

    @Override // org.telegram.ui.Components.lq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (z4) {
            AndroidUtilities.runOnUIThread(new ct(this, this.Y0, hVar, i10, 8), 250L);
        }
    }

    @Override // org.telegram.ui.Components.lq0, org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.Z0) {
            AndroidUtilities.runOnUIThread(new el0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.a1;
        photoViewer.a0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.y.getSystemService("window")).updateViewLayout(photoViewer.d0, photoViewer.a0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
