package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f81 implements View.OnClickListener {
    public final /* synthetic */ i81 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ j81 c;

    public f81(j81 j81Var, i81 i81Var, TLRPC.TL_authorization tL_authorization) {
        this.c = j81Var;
        this.a = i81Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.encrypted_requests_disabled = !r4.d.h;
        j81.n(this.c);
    }
}
