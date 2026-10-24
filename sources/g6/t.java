package g6;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
    public final Status h() {
        return this.a;
    }
}
