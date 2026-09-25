package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p2(Context context, String str, long j3, boolean z10, nf.e eVar) {
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
                nf.f.q(context, Uri.parse(str), this.b == 0, this.c, (nf.e) this.f);
                break;
            default:
                j8.z((j8) this.d, this.b, this.c, (TLRPC.Document) this.e, (Runnable) this.f);
                break;
        }
    }

    public /* synthetic */ p2(j8 j8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = j8Var;
        this.b = j3;
        this.c = z10;
        this.e = document;
        this.f = runnable;
    }
}
