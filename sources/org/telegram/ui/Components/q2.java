package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q2(Context context, String str, long j3, boolean z10, of.e eVar) {
        this.d = context;
        this.e = str;
        this.b = j3;
        this.c = z10;
        this.f = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.d;
                String str = (String) this.e;
                of.f.q(context, Uri.parse(str), this.b == 0, this.c, (of.e) this.f);
                break;
            default:
                k8.A((k8) this.d, this.b, this.c, (TLRPC.Document) this.e, (Runnable) this.f);
                break;
        }
    }

    public /* synthetic */ q2(k8 k8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = k8Var;
        this.b = j3;
        this.c = z10;
        this.e = document;
        this.f = runnable;
    }
}
