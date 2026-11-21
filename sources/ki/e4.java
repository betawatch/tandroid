package ki;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class e4 {
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

    public static e4 b(int i7, long j3, long j10, String str, String str2, int i10, int i11, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i12, boolean z11, boolean z12) {
        e4 e4Var = new e4();
        e4Var.a = i7;
        e4Var.b = j3;
        e4Var.c = j10;
        e4Var.e = str;
        e4Var.f = str2;
        e4Var.g = i10;
        e4Var.h = i11;
        e4Var.i = j11;
        e4Var.j = botApp;
        e4Var.k = z10;
        e4Var.l = str3;
        e4Var.m = user;
        e4Var.n = i12;
        e4Var.o = z11;
        e4Var.p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                e4Var.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                e4Var.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return e4Var;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return e4Var;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        if (this.a != e4Var.a || this.b != e4Var.b || this.c != e4Var.c || !TextUtils.equals(this.f, e4Var.f) || this.g != e4Var.g || this.h != e4Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j3 = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = e4Var.j;
        if (j3 != (botApp2 == null ? 0L : botApp2.id) || this.k != e4Var.k || !TextUtils.equals(this.l, e4Var.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j10 = user == null ? 0L : user.id;
        TLRPC.User user2 = e4Var.m;
        return j10 == (user2 != null ? user2.id : 0L) && this.n == e4Var.n;
    }
}
