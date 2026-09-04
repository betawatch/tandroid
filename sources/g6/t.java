package g6;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class t implements com.google.android.gms.common.api.q {
    public final Status a;
    public final c6.d b;
    public final String c;
    public final String d;
    public final boolean e;

    public t(Status status, c6.d dVar, String str, String str2, boolean z10) {
        this.a = status;
        this.b = dVar;
        this.c = str;
        this.d = str2;
        this.e = z10;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status i() {
        return this.a;
    }
}
