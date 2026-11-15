package hi;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.vr;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b0(Object obj, int i7, int i10, int i11, int i12) {
        this.a = i12;
        this.e = obj;
        this.b = i7;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).b;
                d7 d7Var = d0Var.n;
                if (d7Var == null) {
                    return;
                }
                int i7 = d7Var.k0;
                int i10 = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (i7 == i10 && d7Var.l0 == i11 && d7Var.Q == i12) {
                    return;
                }
                d7Var.k0 = i10;
                d7Var.l0 = i11;
                d7Var.Q = i12;
                TextureView textureView = d0Var.e;
                if (textureView != null) {
                    textureView.requestLayout();
                    return;
                }
                return;
            case 1:
                oi.q3 q3Var = (oi.q3) this.e;
                KeyEvent.Callback D4 = q3Var.D4(this.b);
                if (D4 instanceof org.telegram.ui.Cells.g9) {
                    q3Var.v3.b0(this.c, this.d, (org.telegram.ui.Cells.g9) D4);
                    return;
                }
                return;
            case 2:
                oi.g3 g3Var = (oi.g3) this.e;
                oi.q3.O1(g3Var.b, this.b, this.c, this.d);
                return;
            default:
                vr vrVar = (vr) this.e;
                int i13 = this.b;
                int i14 = this.c;
                int i15 = this.d;
                vrVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = vrVar.b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i13);
                        sQLitePreparedStatement.bindInteger(2, i14);
                        sQLitePreparedStatement.bindInteger(3, i15);
                        sQLitePreparedStatement.step();
                    } catch (Exception e10) {
                        vrVar.o(e10, true);
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
