package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m2(Context context, String str, long j10, boolean z10, we.d dVar) {
        this.d = context;
        this.e = str;
        this.b = j10;
        this.c = z10;
        this.f = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.d;
                String str = (String) this.e;
                we.e.q(context, Uri.parse(str), this.b == 0, this.c, (we.d) this.f);
                break;
            default:
                b8.B((b8) this.d, this.b, this.c, (TLRPC.Document) this.e, (Runnable) this.f);
                break;
        }
    }

    public /* synthetic */ m2(b8 b8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = b8Var;
        this.b = j10;
        this.c = z10;
        this.e = document;
        this.f = runnable;
    }
}
