// default package

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class bc8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n31 b;

    public /* synthetic */ bc8(n31 n31Var, byte b) {
        this.a = b;
        this.b = n31Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        if (r1 != 7) goto L28;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        bm2 bm2Var;
        byte b = this.a;
        n31 n31Var = this.b;
        switch (b) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) n31Var.c;
                zc8 zc8Var = photoViewer.F2;
                if (zc8Var != null) {
                    kfc kfcVar = photoViewer.G2;
                    if (zc8Var.e != kfcVar) {
                        zc8Var.c = false;
                        zc8Var.d = false;
                        if (zc8Var.b) {
                            zc8Var.a++;
                            zc8Var.b = false;
                        }
                        zc8Var.setImageResource(R.color.transparent);
                    }
                    if (kfcVar != null) {
                        s64 s64Var = kfcVar.d;
                        if (s64Var != null) {
                            try {
                                s64Var.y1();
                                ko4 ko4Var = s64Var.S;
                                if (ko4Var != null && (bm2Var = ko4Var.L) != null) {
                                    int i = bm2Var.c;
                                    if (i != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long U = kfcVar.U() - kfcVar.S();
                        if (!zc8Var.c && !zc8Var.d && !zc8Var.b && U < 5250.0f) {
                            Uri uri = kfcVar.G;
                            int i2 = zc8Var.a + 1;
                            zc8Var.a = i2;
                            Utilities.e.c(new l65((Object) zc8Var, (Object) uri, i2, (byte) 23));
                            zc8Var.b = true;
                        }
                    }
                    zc8Var.e = kfcVar;
                    break;
                }
                break;
            case 1:
                zc8 zc8Var2 = ((PhotoViewer) n31Var.c).F2;
                int i3 = zc8.r;
                zc8Var2.a();
                break;
            default:
                zc8 zc8Var3 = ((PhotoViewer) n31Var.c).F2;
                int i4 = zc8.r;
                zc8Var3.a();
                break;
        }
    }
}
