package ki;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class k4 {
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

    public static k4 b(int i7, long j3, long j10, String str, String str2, int i10, int i11, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i12, boolean z11, boolean z12) {
        k4 k4Var = new k4();
        k4Var.a = i7;
        k4Var.b = j3;
        k4Var.c = j10;
        k4Var.e = str;
        k4Var.f = str2;
        k4Var.g = i10;
        k4Var.h = i11;
        k4Var.i = j11;
        k4Var.j = botApp;
        k4Var.k = z10;
        k4Var.l = str3;
        k4Var.m = user;
        k4Var.n = i12;
        k4Var.o = z11;
        k4Var.p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                k4Var.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                k4Var.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return k4Var;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return k4Var;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj;
        if (this.a != k4Var.a || this.b != k4Var.b || this.c != k4Var.c || !TextUtils.equals(this.f, k4Var.f) || this.g != k4Var.g || this.h != k4Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j3 = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = k4Var.j;
        if (j3 != (botApp2 == null ? 0L : botApp2.id) || this.k != k4Var.k || !TextUtils.equals(this.l, k4Var.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j10 = user == null ? 0L : user.id;
        TLRPC.User user2 = k4Var.m;
        return j10 == (user2 != null ? user2.id : 0L) && this.n == k4Var.n;
    }
}
