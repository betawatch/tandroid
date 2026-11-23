package ki;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class f4 {
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

    public static f4 b(int i7, long j3, long j10, String str, String str2, int i10, int i11, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i12, boolean z11, boolean z12) {
        f4 f4Var = new f4();
        f4Var.a = i7;
        f4Var.b = j3;
        f4Var.c = j10;
        f4Var.e = str;
        f4Var.f = str2;
        f4Var.g = i10;
        f4Var.h = i11;
        f4Var.i = j11;
        f4Var.j = botApp;
        f4Var.k = z10;
        f4Var.l = str3;
        f4Var.m = user;
        f4Var.n = i12;
        f4Var.o = z11;
        f4Var.p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                f4Var.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                f4Var.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return f4Var;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return f4Var;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj;
        if (this.a != f4Var.a || this.b != f4Var.b || this.c != f4Var.c || !TextUtils.equals(this.f, f4Var.f) || this.g != f4Var.g || this.h != f4Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j3 = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = f4Var.j;
        if (j3 != (botApp2 == null ? 0L : botApp2.id) || this.k != f4Var.k || !TextUtils.equals(this.l, f4Var.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j10 = user == null ? 0L : user.id;
        TLRPC.User user2 = f4Var.m;
        return j10 == (user2 != null ? user2.id : 0L) && this.n == f4Var.n;
    }
}
