package gi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class t4 {
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

    public static t4 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        t4 t4Var = new t4();
        t4Var.a = i10;
        t4Var.b = j10;
        t4Var.c = j11;
        t4Var.e = str;
        t4Var.f = str2;
        t4Var.g = i11;
        t4Var.h = i12;
        t4Var.i = j12;
        t4Var.j = botApp;
        t4Var.k = z10;
        t4Var.l = str3;
        t4Var.m = user;
        t4Var.n = i13;
        t4Var.o = z11;
        t4Var.p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                t4Var.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                t4Var.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return t4Var;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return t4Var;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        if (this.a != t4Var.a || this.b != t4Var.b || this.c != t4Var.c || !TextUtils.equals(this.f, t4Var.f) || this.g != t4Var.g || this.h != t4Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j10 = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = t4Var.j;
        if (j10 != (botApp2 == null ? 0L : botApp2.id) || this.k != t4Var.k || !TextUtils.equals(this.l, t4Var.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j11 = user == null ? 0L : user.id;
        TLRPC.User user2 = t4Var.m;
        return j11 == (user2 != null ? user2.id : 0L) && this.n == t4Var.n;
    }
}
