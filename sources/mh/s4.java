package mh;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s4 {
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

    public static s4 b(int i9, long j10, long j11, String str, String str2, int i10, int i11, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i12, boolean z11, boolean z12) {
        s4 s4Var = new s4();
        s4Var.a = i9;
        s4Var.b = j10;
        s4Var.c = j11;
        s4Var.e = str;
        s4Var.f = str2;
        s4Var.g = i10;
        s4Var.h = i11;
        s4Var.i = j12;
        s4Var.j = botApp;
        s4Var.k = z10;
        s4Var.l = str3;
        s4Var.m = user;
        s4Var.n = i12;
        s4Var.o = z11;
        s4Var.p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                s4Var.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                s4Var.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return s4Var;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return s4Var;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        if (this.a != s4Var.a || this.b != s4Var.b || this.c != s4Var.c || !TextUtils.equals(this.f, s4Var.f) || this.g != s4Var.g || this.h != s4Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j10 = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = s4Var.j;
        if (j10 != (botApp2 == null ? 0L : botApp2.id) || this.k != s4Var.k || !TextUtils.equals(this.l, s4Var.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j11 = user == null ? 0L : user.id;
        TLRPC.User user2 = s4Var.m;
        return j11 == (user2 != null ? user2.id : 0L) && this.n == s4Var.n;
    }
}
