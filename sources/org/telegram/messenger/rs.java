package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class rs {
    public final int a;
    public final long b;
    public final boolean c;
    public final String d;
    public final TLRPC.User e;
    public final TLRPC.Chat f;
    public final e0.q g;
    public final /* synthetic */ long h;
    public final /* synthetic */ String i;
    public final /* synthetic */ long[] j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Uri l;
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ int q;
    public final /* synthetic */ us r;

    public rs(us usVar, int i3, long j10, boolean z10, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j11, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z11, boolean z12, boolean z13, int i12) {
        this.r = usVar;
        this.h = j11;
        this.i = str2;
        this.j = jArr;
        this.k = i10;
        this.l = uri;
        this.m = i11;
        this.n = z11;
        this.o = z12;
        this.p = z13;
        this.q = i12;
        this.a = i3;
        this.d = str;
        this.e = user;
        this.f = chat;
        this.g = qVar;
        this.b = j10;
        this.c = z10;
    }

    public final void a() {
        e0.q qVar = this.g;
        boolean z10 = r2.a;
        int i3 = this.a;
        if (z10) {
            StringBuilder m10 = k2.p1.m(i3, "show dialog notification with id ", " ");
            m10.append(this.b);
            m10.append(" user=");
            m10.append(this.e);
            m10.append(" chat=");
            m10.append(this.f);
            a8.l(m10.toString());
        }
        try {
            us.m0.e(null, i3, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.r.P(qVar, this.b, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }
    }
}
