package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class fp0 extends org.telegram.ui.Components.ap0 {
    public final /* synthetic */ FrameLayout V2;
    public final /* synthetic */ boolean W2;
    public final /* synthetic */ PhotoViewer X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp0(PhotoViewer photoViewer, Context context, bn bnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, bnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.X2 = photoViewer;
        this.V2 = frameLayout;
        this.W2 = z10;
    }

    @Override // org.telegram.ui.Components.ap0, org.telegram.ui.ActionBar.w2
    public final void L() {
        super.L();
        if (this.W2) {
            org.telegram.messenger.g0.h3(new hf0(this, 20), 50L);
        }
        PhotoViewer photoViewer = this.X2;
        photoViewer.e0.softInputMode = org.telegram.messenger.ks.v4;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.h0, photoViewer.e0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ap0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.mp0(this, this.V2, hVar, i7, 15), 250L);
        }
    }
}
