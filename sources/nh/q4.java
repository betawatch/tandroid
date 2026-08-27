package nh;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class q4 {
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

    public static q4 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        q4 q4Var = new q4();
        q4Var.a = i10;
        q4Var.b = j10;
        q4Var.c = j11;
        q4Var.e = str;
        q4Var.f = str2;
        q4Var.g = i11;
        q4Var.h = i12;
        q4Var.i = j12;
        q4Var.j = botApp;
        q4Var.k = z10;
        q4Var.l = str3;
        q4Var.m = user;
        q4Var.n = i13;
        q4Var.o = z11;
        q4Var.p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                q4Var.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                q4Var.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return q4Var;
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        return q4Var;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        if (this.a != q4Var.a || this.b != q4Var.b || this.c != q4Var.c || !TextUtils.equals(this.f, q4Var.f) || this.g != q4Var.g || this.h != q4Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j10 = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = q4Var.j;
        if (j10 != (botApp2 == null ? 0L : botApp2.id) || this.k != q4Var.k || !TextUtils.equals(this.l, q4Var.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j11 = user == null ? 0L : user.id;
        TLRPC.User user2 = q4Var.m;
        return j11 == (user2 != null ? user2.id : 0L) && this.n == q4Var.n;
    }
}
