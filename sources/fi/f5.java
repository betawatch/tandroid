package fi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class f5 {
    public int a;
    public long b;
    public long c;
    public long d;
    public String e;
    public String f;
    public int g;
    public int h;
    public long i;
    public TLRPC.BotApp j;
    public boolean k;
    public String l;
    public TLRPC.User m;
    public int n;
    public boolean o;
    public boolean p;
    public TLObject q;
    public long r;

    public static f5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        f5 f5Var = new f5();
        f5Var.a = i10;
        f5Var.b = j3;
        f5Var.c = j10;
        f5Var.e = str;
        f5Var.f = str2;
        f5Var.g = i11;
        f5Var.h = i12;
        f5Var.i = j11;
        f5Var.j = botApp;
        f5Var.k = z10;
        f5Var.l = str3;
        f5Var.m = user;
        f5Var.n = i13;
        f5Var.o = z11;
        f5Var.p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                f5Var.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                f5Var.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return f5Var;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return f5Var;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        if (this.a != f5Var.a || this.b != f5Var.b || this.c != f5Var.c || !TextUtils.equals(this.f, f5Var.f) || this.g != f5Var.g || this.h != f5Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j3 = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = f5Var.j;
        if (j3 != (botApp2 == null ? 0L : botApp2.id) || this.k != f5Var.k || !TextUtils.equals(this.l, f5Var.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j10 = user == null ? 0L : user.id;
        TLRPC.User user2 = f5Var.m;
        return j10 == (user2 != null ? user2.id : 0L) && this.n == f5Var.n;
    }
}
