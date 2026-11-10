package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hp0 extends org.telegram.ui.Components.mo0 {
    public final /* synthetic */ FrameLayout U2;
    public final /* synthetic */ boolean V2;
    public final /* synthetic */ PhotoViewer W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(PhotoViewer photoViewer, Context context, cn cnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z9) {
        super(context, cnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.W2 = photoViewer;
        this.U2 = frameLayout;
        this.V2 = z9;
    }

    @Override // org.telegram.ui.Components.mo0, org.telegram.ui.ActionBar.w2
    public final void K() {
        super.K();
        if (this.V2) {
            org.telegram.messenger.g0.i3(new hf0(this, 20), 50L);
        }
        PhotoViewer photoViewer = this.W2;
        photoViewer.d0.softInputMode = org.telegram.messenger.qs.v4;
        try {
            ((WindowManager) photoViewer.D.getSystemService("window")).updateViewLayout(photoViewer.g0, photoViewer.d0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            org.telegram.messenger.g0.i3(new org.telegram.ui.Components.pp0(this, this.U2, hVar, i7, 14), 250L);
        }
    }
}
