package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m2(Context context, String str, long j10, boolean z10, ve.d dVar) {
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
                ve.e.q(context, Uri.parse(str), this.b == 0, this.c, (ve.d) this.f);
                break;
            default:
                c8.z((c8) this.d, this.b, this.c, (TLRPC.Document) this.e, (Runnable) this.f);
                break;
        }
    }

    public /* synthetic */ m2(c8 c8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = c8Var;
        this.b = j10;
        this.c = z10;
        this.e = document;
        this.f = runnable;
    }
}
