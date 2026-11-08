package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class at {
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
    public final /* synthetic */ dt r;

    public at(dt dtVar, int i7, long j3, boolean z9, String str, TLRPC.User user, TLRPC.Chat chat, e0.q qVar, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        this.r = dtVar;
        this.h = j10;
        this.i = str2;
        this.j = jArr;
        this.k = i10;
        this.l = uri;
        this.m = i11;
        this.n = z10;
        this.o = z11;
        this.p = z12;
        this.q = i12;
        this.a = i7;
        this.d = str;
        this.e = user;
        this.f = chat;
        this.g = qVar;
        this.b = j3;
        this.c = z9;
    }

    public final void a() {
        e0.q qVar = this.g;
        boolean z9 = r2.a;
        int i7 = this.a;
        if (z9) {
            StringBuilder n10 = jg.g.n(i7, "show dialog notification with id ", " ");
            n10.append(this.b);
            n10.append(" user=");
            n10.append(this.e);
            n10.append(" chat=");
            n10.append(this.f);
            a8.l(n10.toString());
        }
        try {
            dt.l0.e(null, i7, qVar.b());
        } catch (SecurityException e10) {
            a8.g(e10, true);
            this.r.P(qVar, this.b, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }
    }
}
