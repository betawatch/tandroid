package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class tv0 {
    public final int a;
    public final int b;
    public final sv0 c;
    public final rv0 d;
    public final /* synthetic */ uv0 e;

    public tv0(uv0 uv0Var, Context context, int i10) {
        this.e = uv0Var;
        this.b = i10;
        int i11 = uv0Var.a2;
        uv0Var.a2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new sv0(this, context, i10);
        this.d = new rv0(uv0Var, context, i10, false);
    }
}
