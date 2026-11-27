// default package

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class gzc {
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
    public byte n;
    public boolean o;
    public boolean p;
    public TLObject q;
    public long r;

    /* JADX WARN: Multi-variable type inference failed */
    public static gzc b(int i, long j, long j2, String str, String str2, int i2, int i3, long j3, TLRPC.BotApp botApp, boolean z, String str3, TLRPC.User user, int i4, boolean z2, boolean z3) {
        gzc gzcVar = new gzc();
        gzcVar.a = i;
        gzcVar.b = j;
        gzcVar.c = j2;
        gzcVar.e = str;
        gzcVar.f = str2;
        gzcVar.g = i2;
        gzcVar.h = i3;
        gzcVar.i = j3;
        gzcVar.j = botApp;
        gzcVar.k = z;
        gzcVar.l = str3;
        gzcVar.m = user;
        gzcVar.n = i4;
        gzcVar.o = z2;
        gzcVar.p = z3;
        if (!z2 && !z3 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                gzcVar.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                gzcVar.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return gzcVar;
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return gzcVar;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gzc)) {
            return false;
        }
        gzc gzcVar = (gzc) obj;
        if (this.a != gzcVar.a || this.b != gzcVar.b || this.c != gzcVar.c || !TextUtils.equals(this.f, gzcVar.f) || this.g != gzcVar.g || this.h != gzcVar.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = gzcVar.j;
        if (j != (botApp2 == null ? 0L : botApp2.id) || this.k != gzcVar.k || !TextUtils.equals(this.l, gzcVar.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j2 = user == null ? 0L : user.id;
        TLRPC.User user2 = gzcVar.m;
        return j2 == (user2 != null ? user2.id : 0L) && this.n == gzcVar.n;
    }
}
