// default package

import android.net.Uri;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nu implements iac {
    public final /* synthetic */ o a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ vu d;

    public /* synthetic */ nu(o oVar, String str, boolean[] zArr, vu vuVar) {
        this.a = oVar;
        this.b = str;
        this.c = zArr;
        this.d = vuVar;
    }

    @Override // iac
    public final Object run() {
        String str = this.b;
        if (!l11.g(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        o oVar = this.a;
        vu vuVar = this.d;
        if (vuVar != null) {
            vuVar.c = new pf2(oVar, vuVar, (byte) 26);
        } else {
            sx sxVar = oVar.L;
            if (sxVar != null) {
                sxVar.a(true);
            }
        }
        l11.t(oVar.M, Uri.parse(str), true, true, false, vuVar, null, true, true, false, false);
        return Boolean.TRUE;
    }
}
