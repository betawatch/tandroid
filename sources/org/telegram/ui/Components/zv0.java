package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zv0 {
    public final int a;
    public final int b;
    public final yv0 c;
    public final xv0 d;
    public final /* synthetic */ aw0 e;

    public zv0(aw0 aw0Var, Context context, int i10) {
        this.e = aw0Var;
        this.b = i10;
        int i11 = aw0Var.l2;
        aw0Var.l2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new yv0(this, context, i10);
        this.d = new xv0(aw0Var, context, i10, false);
    }
}
