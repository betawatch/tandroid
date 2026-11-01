package ih;

import android.text.TextUtils;
import org.telegram.messenger.b8;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a {
    public final int a;
    public final TLRPC.Document b;
    public final String c;
    public final kj d;
    public final String e;
    public boolean f;
    public boolean g;

    public a(int i10, kj kjVar, TLRPC.Document document, String str) {
        this.a = i10;
        this.d = kjVar;
        this.b = document;
        this.c = str;
        this.e = TextUtils.isEmpty(str) ? b8.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z10 = false;
        String str = this.c;
        boolean x10 = str != null ? sc.e.x(str) : false;
        int i10 = this.a;
        if (!x10) {
            b8.G(i10);
            x10 = b8.I(this.b).exists();
        }
        this.f = x10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && b8.G(i10).T(str2)) {
            z10 = true;
        }
        this.g = z10;
    }
}
