// default package

import android.net.Uri;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nt implements h8c {
    public final /* synthetic */ o a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ vt d;

    public /* synthetic */ nt(o oVar, String str, boolean[] zArr, vt vtVar) {
        this.a = oVar;
        this.b = str;
        this.c = zArr;
        this.d = vtVar;
    }

    @Override // h8c
    public final Object run() {
        String str = this.b;
        if (!d01.g(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        o oVar = this.a;
        vt vtVar = this.d;
        if (vtVar != null) {
            vtVar.c = new ee2(oVar, vtVar, (byte) 25);
        } else {
            sw swVar = oVar.L;
            if (swVar != null) {
                swVar.a(true);
            }
        }
        d01.s(oVar.M, Uri.parse(str), true, true, false, vtVar, null, true, true, false, false);
        return Boolean.TRUE;
    }
}
