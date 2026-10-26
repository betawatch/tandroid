package h6;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class t implements com.google.android.gms.common.api.q {
    public final Status a;
    public final d6.d b;
    public final String c;
    public final String d;
    public final boolean e;

    public t(Status status, d6.d dVar, String str, String str2, boolean z10) {
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
