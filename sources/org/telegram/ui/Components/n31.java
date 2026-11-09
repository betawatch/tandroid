package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n31 implements wv0 {
    public final /* synthetic */ u31 a;

    public n31(u31 u31Var) {
        this.a = u31Var;
    }

    @Override // org.telegram.ui.Components.wv0
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9, boolean z10, int i7, int i10) {
        this.a.b.f(document, obj, z10, i7);
    }

    @Override // org.telegram.ui.Components.wv0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.wv0
    public final boolean c() {
        return this.a.b.c();
    }
}
