package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ms0 extends org.telegram.ui.Components.er0 {
    public final /* synthetic */ FrameLayout c1;
    public final /* synthetic */ boolean d1;
    public final /* synthetic */ PhotoViewer e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms0(PhotoViewer photoViewer, Context context, qn qnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, qnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.e1 = photoViewer;
        this.c1 = frameLayout;
        this.d1 = z10;
    }

    @Override // org.telegram.ui.Components.er0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bz0(this, this.c1, hVar, i10, 11), 250L);
        }
    }

    @Override // org.telegram.ui.Components.er0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.d1) {
            AndroidUtilities.runOnUIThread(new ck0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.e1;
        photoViewer.d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.y.getSystemService("window")).updateViewLayout(photoViewer.g0, photoViewer.d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
