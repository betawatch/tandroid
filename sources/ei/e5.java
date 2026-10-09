package ei;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class e5 {
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

    public static e5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        e5 e5Var = new e5();
        e5Var.a = i10;
        e5Var.b = j3;
        e5Var.c = j10;
        e5Var.e = str;
        e5Var.f = str2;
        e5Var.g = i11;
        e5Var.h = i12;
        e5Var.i = j11;
        e5Var.j = botApp;
        e5Var.k = z10;
        e5Var.l = str3;
        e5Var.m = user;
        e5Var.n = i13;
        e5Var.o = z11;
        e5Var.p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                e5Var.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                e5Var.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return e5Var;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return e5Var;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        if (this.a != e5Var.a || this.b != e5Var.b || this.c != e5Var.c || !TextUtils.equals(this.f, e5Var.f) || this.g != e5Var.g || this.h != e5Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j3 = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = e5Var.j;
        if (j3 != (botApp2 == null ? 0L : botApp2.id) || this.k != e5Var.k || !TextUtils.equals(this.l, e5Var.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j10 = user == null ? 0L : user.id;
        TLRPC.User user2 = e5Var.m;
        return j10 == (user2 != null ? user2.id : 0L) && this.n == e5Var.n;
    }
}
