package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class kz0 extends org.telegram.ui.Components.uq0 {
    public final /* synthetic */ lz0 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(lz0 lz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = lz0Var;
    }

    @Override // org.telegram.ui.Components.uq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new rx0(this, iVar, i10, 13), 250L);
        }
    }
}
