package hi;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.tr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d0(Object obj, int i7, int i10, int i11, int i12) {
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
                f0 f0Var = (f0) ((e0) this.e).b;
                c7 c7Var = f0Var.n;
                if (c7Var == null) {
                    return;
                }
                int i7 = c7Var.k0;
                int i10 = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (i7 == i10 && c7Var.l0 == i11 && c7Var.Q == i12) {
                    return;
                }
                c7Var.k0 = i10;
                c7Var.l0 = i11;
                c7Var.Q = i12;
                TextureView textureView = f0Var.e;
                if (textureView != null) {
                    textureView.requestLayout();
                    return;
                }
                return;
            case 1:
                oi.t3 t3Var = (oi.t3) this.e;
                KeyEvent.Callback D4 = t3Var.D4(this.b);
                if (D4 instanceof org.telegram.ui.Cells.i9) {
                    t3Var.v3.b0(this.c, this.d, (org.telegram.ui.Cells.i9) D4);
                    return;
                }
                return;
            case 2:
                oi.j3 j3Var = (oi.j3) this.e;
                oi.t3.O1(j3Var.b, this.b, this.c, this.d);
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
