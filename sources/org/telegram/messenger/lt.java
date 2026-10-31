package org.telegram.messenger;

import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class lt {
    public final int a;
    public final long b;
    public final boolean c;
    public final String d;
    public final TLRPC.User e;
    public final TLRPC.Chat f;
    public final e0.r g;
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
    public final /* synthetic */ ot r;

    public lt(ot otVar, int i10, long j10, boolean z10, String str, TLRPC.User user, TLRPC.Chat chat, e0.r rVar, long j11, String str2, long[] jArr, int i11, Uri uri, int i12, boolean z11, boolean z12, boolean z13, int i13) {
        this.r = otVar;
        this.h = j11;
        this.i = str2;
        this.j = jArr;
        this.k = i11;
        this.l = uri;
        this.m = i12;
        this.n = z11;
        this.o = z12;
        this.p = z13;
        this.q = i13;
        this.a = i10;
        this.d = str;
        this.e = user;
        this.f = chat;
        this.g = rVar;
        this.b = j10;
        this.c = z10;
    }

    public final void a() {
        e0.r rVar = this.g;
        boolean z10 = v2.a;
        int i10 = this.a;
        if (z10) {
            StringBuilder l4 = i0.a.l(i10, "show dialog notification with id ", " ");
            l4.append(this.b);
            l4.append(" user=");
            l4.append(this.e);
            l4.append(" chat=");
            l4.append(this.f);
            f8.l(l4.toString());
        }
        try {
            ot.l0.e(null, i10, rVar.b());
        } catch (SecurityException e) {
            f8.g(e, true);
            this.r.P(rVar, this.b, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }
    }
}
