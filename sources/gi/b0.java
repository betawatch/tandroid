package gi;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.qr;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b0(Object obj, int i3, int i10, int i11, int i12) {
        this.a = i12;
        this.e = obj;
        this.b = i3;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).b;
                f7 f7Var = d0Var.n;
                if (f7Var == null) {
                    return;
                }
                int i3 = f7Var.k0;
                int i10 = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (i3 == i10 && f7Var.l0 == i11 && f7Var.Q == i12) {
                    return;
                }
                f7Var.k0 = i10;
                f7Var.l0 = i11;
                f7Var.Q = i12;
                TextureView textureView = d0Var.e;
                if (textureView != null) {
                    textureView.requestLayout();
                    return;
                }
                return;
            case 1:
                mi.t3 t3Var = (mi.t3) this.e;
                KeyEvent.Callback D4 = t3Var.D4(this.b);
                if (D4 instanceof org.telegram.ui.Cells.g9) {
                    t3Var.v3.b0(this.c, this.d, (org.telegram.ui.Cells.g9) D4);
                    return;
                }
                return;
            case 2:
                mi.j3 j3Var = (mi.j3) this.e;
                mi.t3.O1(j3Var.b, this.b, this.c, this.d);
                return;
            default:
                qr qrVar = (qr) this.e;
                int i13 = this.b;
                int i14 = this.c;
                int i15 = this.d;
                qrVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = qrVar.b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i13);
                        sQLitePreparedStatement.bindInteger(2, i14);
                        sQLitePreparedStatement.bindInteger(3, i15);
                        sQLitePreparedStatement.step();
                    } catch (Exception e10) {
                        qrVar.o(e10, true);
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
        }
    }
}
