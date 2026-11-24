// default package

import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fm7 {
    public final int a;
    public final long b;
    public final boolean c;
    public final String d;
    public final TLRPC.User e;
    public final TLRPC.Chat f;
    public final xk7 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ String i;
    public final /* synthetic */ long[] j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Uri l;
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ byte q;
    public final /* synthetic */ im7 r;

    /* JADX WARN: Multi-variable type inference failed */
    public fm7(im7 im7Var, int i, long j, boolean z, String str, TLRPC.User user, TLRPC.Chat chat, xk7 xk7Var, long j2, String str2, long[] jArr, int i2, Uri uri, int i3, boolean z2, boolean z3, boolean z4, int i4) {
        this.r = im7Var;
        this.h = j2;
        this.i = str2;
        this.j = jArr;
        this.k = i2;
        this.l = uri;
        this.m = i3;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = i4;
        this.a = i;
        this.d = str;
        this.e = user;
        this.f = chat;
        this.g = xk7Var;
        this.b = j;
        this.c = z;
    }

    public final void a() {
        xk7 xk7Var = this.g;
        boolean z = w01.a;
        int i = this.a;
        if (z) {
            StringBuilder m = de9.m(i, "show dialog notification with id ", " ");
            m.append(this.b);
            m.append(" user=");
            m.append(this.e);
            m.append(" chat=");
            m.append(this.f);
            fa4.l(m.toString());
        }
        try {
            im7.m0.e(null, i, xk7Var.b());
        } catch (SecurityException e) {
            fa4.g(e, true);
            this.r.P(xk7Var, this.b, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }
    }
}
