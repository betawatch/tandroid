package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p2(Context context, String str, long j10, boolean z10, ye.c cVar) {
        this.d = context;
        this.e = str;
        this.b = j10;
        this.c = z10;
        this.f = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.d;
                String str = (String) this.e;
                ye.d.q(context, Uri.parse(str), this.b == 0, this.c, (ye.c) this.f);
                break;
            default:
                g8.A((g8) this.d, this.b, this.c, (TLRPC.Document) this.e, (Runnable) this.f);
                break;
        }
    }

    public /* synthetic */ p2(g8 g8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = g8Var;
        this.b = j10;
        this.c = z10;
        this.e = document;
        this.f = runnable;
    }
}
