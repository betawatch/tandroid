// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bd4 {
    public final int a;
    public final TLRPC.Document b;
    public final String c;
    public final k47 d;
    public final String e;
    public boolean f;
    public boolean g;

    public bd4(int i, k47 k47Var, TLRPC.Document document, String str) {
        this.a = i;
        this.d = k47Var;
        this.b = document;
        this.c = str;
        this.e = TextUtils.isEmpty(str) ? bc4.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z = false;
        String str = this.c;
        boolean t = str != null ? aq1.t(str) : false;
        int i = this.a;
        if (!t) {
            bc4.G(i);
            t = bc4.I(this.b).exists();
        }
        this.f = t;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && bc4.G(i).S(str2)) {
            z = true;
        }
        this.g = z;
    }
}
