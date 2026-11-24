// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bb4 {
    public final int a;
    public final TLRPC.Document b;
    public final String c;
    public final k27 d;
    public final String e;
    public boolean f;
    public boolean g;

    public bb4(int i, k27 k27Var, TLRPC.Document document, String str) {
        this.a = i;
        this.d = k27Var;
        this.b = document;
        this.c = str;
        this.e = TextUtils.isEmpty(str) ? ba4.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z = false;
        String str = this.c;
        boolean t = str != null ? oo1.t(str) : false;
        int i = this.a;
        if (!t) {
            ba4.G(i);
            t = ba4.I(this.b).exists();
        }
        this.f = t;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && ba4.G(i).S(str2)) {
            z = true;
        }
        this.g = z;
    }
}
