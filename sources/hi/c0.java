package hi;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.tr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c0(Object obj, int i7, int i10, int i11, int i12) {
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
                e0 e0Var = (e0) ((d0) this.e).b;
                d7 d7Var = e0Var.n;
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
                TextureView textureView = e0Var.e;
                if (textureView != null) {
                    textureView.requestLayout();
                    return;
                }
                return;
            case 1:
                oi.s3 s3Var = (oi.s3) this.e;
                KeyEvent.Callback D4 = s3Var.D4(this.b);
                if (D4 instanceof org.telegram.ui.Cells.h9) {
                    s3Var.v3.b0(this.c, this.d, (org.telegram.ui.Cells.h9) D4);
                    return;
                }
                return;
            case 2:
                oi.i3 i3Var = (oi.i3) this.e;
                oi.s3.O1(i3Var.b, this.b, this.c, this.d);
                return;
            default:
                tr trVar = (tr) this.e;
                int i13 = this.b;
                int i14 = this.c;
                int i15 = this.d;
                trVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = trVar.b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i13);
                        sQLitePreparedStatement.bindInteger(2, i14);
                        sQLitePreparedStatement.bindInteger(3, i15);
                        sQLitePreparedStatement.step();
                    } catch (Exception e10) {
                        trVar.o(e10, true);
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
