package hi;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c5 {
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

    public static c5 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        c5 c5Var = new c5();
        c5Var.a = i10;
        c5Var.b = j10;
        c5Var.c = j11;
        c5Var.e = str;
        c5Var.f = str2;
        c5Var.g = i11;
        c5Var.h = i12;
        c5Var.i = j12;
        c5Var.j = botApp;
        c5Var.k = z10;
        c5Var.l = str3;
        c5Var.m = user;
        c5Var.n = i13;
        c5Var.o = z11;
        c5Var.p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                c5Var.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                c5Var.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return c5Var;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return c5Var;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        if (this.a != c5Var.a || this.b != c5Var.b || this.c != c5Var.c || !TextUtils.equals(this.f, c5Var.f) || this.g != c5Var.g || this.h != c5Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j10 = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = c5Var.j;
        if (j10 != (botApp2 == null ? 0L : botApp2.id) || this.k != c5Var.k || !TextUtils.equals(this.l, c5Var.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j11 = user == null ? 0L : user.id;
        TLRPC.User user2 = c5Var.m;
        return j11 == (user2 != null ? user2.id : 0L) && this.n == c5Var.n;
    }
}
