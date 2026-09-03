package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o2(Context context, String str, long j10, boolean z4, ze.c cVar) {
        this.d = context;
        this.e = str;
        this.b = j10;
        this.c = z4;
        this.f = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.d;
                String str = (String) this.e;
                ze.d.q(context, Uri.parse(str), this.b == 0, this.c, (ze.c) this.f);
                break;
            default:
                c8.A((c8) this.d, this.b, this.c, (TLRPC.Document) this.e, (Runnable) this.f);
                break;
        }
    }

    public /* synthetic */ o2(c8 c8Var, long j10, boolean z4, TLRPC.Document document, Runnable runnable) {
        this.d = c8Var;
        this.b = j10;
        this.c = z4;
        this.e = document;
        this.f = runnable;
    }
}
