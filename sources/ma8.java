// default package

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ma8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m41 b;

    public /* synthetic */ ma8(m41 m41Var, byte b) {
        this.a = b;
        this.b = m41Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        if (r1 != 7) goto L28;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        tm2 tm2Var;
        byte b = this.a;
        m41 m41Var = this.b;
        switch (b) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) m41Var.c;
                kb8 kb8Var = photoViewer.F2;
                if (kb8Var != null) {
                    ndc ndcVar = photoViewer.G2;
                    if (kb8Var.e != ndcVar) {
                        kb8Var.c = false;
                        kb8Var.d = false;
                        if (kb8Var.b) {
                            kb8Var.a++;
                            kb8Var.b = false;
                        }
                        kb8Var.setImageResource(R.color.transparent);
                    }
                    if (ndcVar != null) {
                        h74 h74Var = ndcVar.d;
                        if (h74Var != null) {
                            try {
                                h74Var.y1();
                                go4 go4Var = h74Var.S;
                                if (go4Var != null && (tm2Var = go4Var.L) != null) {
                                    int i = tm2Var.c;
                                    if (i != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long U = ndcVar.U() - ndcVar.S();
                        if (!kb8Var.c && !kb8Var.d && !kb8Var.b && U < 5250.0f) {
                            Uri uri = ndcVar.G;
                            int i2 = kb8Var.a + 1;
                            kb8Var.a = i2;
                            Utilities.e.c(new h65((Object) kb8Var, (Object) uri, i2, (byte) 22));
                            kb8Var.b = true;
                        }
                    }
                    kb8Var.e = ndcVar;
                    break;
                }
                break;
            case 1:
                kb8 kb8Var2 = ((PhotoViewer) m41Var.c).F2;
                int i3 = kb8.r;
                kb8Var2.a();
                break;
            default:
                kb8 kb8Var3 = ((PhotoViewer) m41Var.c).F2;
                int i4 = kb8.r;
                kb8Var3.a();
                break;
        }
    }
}
