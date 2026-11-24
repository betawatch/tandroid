// default package

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j88 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e31 b;

    public /* synthetic */ j88(e31 e31Var, byte b) {
        this.a = b;
        this.b = e31Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        if (r1 != 7) goto L28;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        hl2 hl2Var;
        byte b = this.a;
        e31 e31Var = this.b;
        switch (b) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) e31Var.c;
                j98 j98Var = photoViewer.F2;
                if (j98Var != null) {
                    lbc lbcVar = photoViewer.G2;
                    if (j98Var.e != lbcVar) {
                        j98Var.c = false;
                        j98Var.d = false;
                        if (j98Var.b) {
                            j98Var.a++;
                            j98Var.b = false;
                        }
                        j98Var.setImageResource(R.color.transparent);
                    }
                    if (lbcVar != null) {
                        y54 y54Var = lbcVar.d;
                        if (y54Var != null) {
                            try {
                                y54Var.y1();
                                fm4 fm4Var = y54Var.S;
                                if (fm4Var != null && (hl2Var = fm4Var.L) != null) {
                                    int i = hl2Var.c;
                                    if (i != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long U = lbcVar.U() - lbcVar.S();
                        if (!j98Var.c && !j98Var.d && !j98Var.b && U < 5250.0f) {
                            Uri uri = lbcVar.G;
                            int i2 = j98Var.a + 1;
                            j98Var.a = i2;
                            Utilities.e.c(new j45((Object) j98Var, (Object) uri, i2, (byte) 22));
                            j98Var.b = true;
                        }
                    }
                    j98Var.e = lbcVar;
                    break;
                }
                break;
            case 1:
                j98 j98Var2 = ((PhotoViewer) e31Var.c).F2;
                int i3 = j98.r;
                j98Var2.a();
                break;
            default:
                j98 j98Var3 = ((PhotoViewer) e31Var.c).F2;
                int i4 = j98.r;
                j98Var3.a();
                break;
        }
    }
}
