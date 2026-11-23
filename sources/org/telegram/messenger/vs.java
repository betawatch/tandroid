package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class vs {
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
    public final /* synthetic */ ys r;

    public vs(ys ysVar, int i7, long j3, boolean z10, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z11, boolean z12, boolean z13, int i12) {
        this.r = ysVar;
        this.h = j10;
        this.i = str2;
        this.j = jArr;
        this.k = i10;
        this.l = uri;
        this.m = i11;
        this.n = z11;
        this.o = z12;
        this.p = z13;
        this.q = i12;
        this.a = i7;
        this.d = str;
        this.e = user;
        this.f = chat;
        this.g = qVar;
        this.b = j3;
        this.c = z10;
    }

    public final void a() {
        e0.q qVar = this.g;
        boolean z10 = s2.a;
        int i7 = this.a;
        if (z10) {
            StringBuilder m10 = i5.c.m(i7, "show dialog notification with id ", " ");
            m10.append(this.b);
            m10.append(" user=");
            m10.append(this.e);
            m10.append(" chat=");
            m10.append(this.f);
            a8.l(m10.toString());
        }
        try {
            ys.m0.e(null, i7, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.r.P(qVar, this.b, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }
    }
}
