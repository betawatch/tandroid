package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class n0 implements c {
    public final /* synthetic */ h a;

    public n0(h hVar) {
        this.a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final void a(boolean z10) {
        com.google.android.gms.internal.cast.a0 a0Var = this.a.x;
        a0Var.sendMessage(a0Var.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
