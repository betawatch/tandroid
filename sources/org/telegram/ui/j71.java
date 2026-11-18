package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class j71 extends org.telegram.ui.Components.yo0 {
    public final /* synthetic */ m71 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j71(m71 m71Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.V2 = m71Var;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            m71 m71Var = this.V2;
            if (m10 == 1) {
                m71Var.a.n0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i7), 61);
            } else {
                m71Var.a.n0.k(0L, 61, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
