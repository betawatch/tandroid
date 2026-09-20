package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class b91 extends org.telegram.ui.Components.uq0 {
    public final /* synthetic */ i91 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b91(i91 i91Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = i91Var;
    }

    @Override // org.telegram.ui.Components.uq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new w81(this, iVar, i10), 250L);
        }
    }
}
