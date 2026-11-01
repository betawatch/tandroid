package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e80 extends pp0 {
    public final /* synthetic */ j80 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e80(j80 j80Var, Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.R2 = j80Var;
    }

    @Override // org.telegram.ui.Components.pp0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.dd.a0(null, null, 2131749197, org.telegram.messenger.dd.G(i10, "Chats", new Object[0]));
            } else {
                long j10 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j10 == 0 || j10 == org.telegram.messenger.e20.i(this.a).e()) ? org.telegram.messenger.dd.L0(2131749195, null) : org.telegram.messenger.dd.a0(null, null, 2131749194, org.telegram.messenger.wp.r1(this.a).A1(j10, true));
            }
            this.R2.e(org.telegram.messenger.i0.W2(a02));
        }
    }
}
