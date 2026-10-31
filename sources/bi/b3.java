package bi;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.hs;
import org.telegram.ui.Cells.j9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class b3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b3(Object obj, int i10, int i11, int i12, int i13) {
        this.a = i13;
        this.e = obj;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.e;
                KeyEvent.Callback D4 = d4Var.D4(this.b);
                if (D4 instanceof j9) {
                    d4Var.u3.b0(this.c, this.d, (j9) D4);
                    return;
                }
                return;
            case 1:
                s3 s3Var = (s3) this.e;
                d4.N1(s3Var.b, this.b, this.c, this.d);
                return;
            case 2:
                hs hsVar = (hs) this.e;
                int i10 = this.b;
                int i11 = this.c;
                int i12 = this.d;
                hsVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = hsVar.b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i10);
                        sQLitePreparedStatement.bindInteger(2, i11);
                        sQLitePreparedStatement.bindInteger(3, i12);
                        sQLitePreparedStatement.step();
                    } catch (Exception e) {
                        hsVar.o(e, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            default:
                vh.w wVar = (vh.w) ((kg.j2) this.e).b;
                vh.n5 n5Var = wVar.n;
                if (n5Var == null) {
                    return;
                }
                int i13 = n5Var.k0;
                int i14 = this.b;
                int i15 = this.c;
                int i16 = this.d;
                if (i13 == i14 && n5Var.l0 == i15 && n5Var.Q == i16) {
                    return;
                }
                n5Var.k0 = i14;
                n5Var.l0 = i15;
                n5Var.Q = i16;
                TextureView textureView = wVar.e;
                if (textureView != null) {
                    textureView.requestLayout();
                    return;
                }
                return;
        }
    }
}
