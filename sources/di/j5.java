package di;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class j5 {
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

    public static j5 b(int i10, long j3, long j10, String str, String str2, int i11, int i12, long j11, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        j5 j5Var = new j5();
        j5Var.a = i10;
        j5Var.b = j3;
        j5Var.c = j10;
        j5Var.e = str;
        j5Var.f = str2;
        j5Var.g = i11;
        j5Var.h = i12;
        j5Var.i = j11;
        j5Var.j = botApp;
        j5Var.k = z10;
        j5Var.l = str3;
        j5Var.m = user;
        j5Var.n = i13;
        j5Var.o = z11;
        j5Var.p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                j5Var.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                j5Var.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return j5Var;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return j5Var;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        if (this.a != j5Var.a || this.b != j5Var.b || this.c != j5Var.c || !TextUtils.equals(this.f, j5Var.f) || this.g != j5Var.g || this.h != j5Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j3 = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = j5Var.j;
        if (j3 != (botApp2 == null ? 0L : botApp2.id) || this.k != j5Var.k || !TextUtils.equals(this.l, j5Var.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j10 = user == null ? 0L : user.id;
        TLRPC.User user2 = j5Var.m;
        return j10 == (user2 != null ? user2.id : 0L) && this.n == j5Var.n;
    }
}
