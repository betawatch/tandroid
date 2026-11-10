package fi;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.yr;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                e7 e7Var = d0Var.n;
                if (e7Var == null) {
                    return;
                }
                int i7 = e7Var.k0;
                int i10 = this.b;
                int i11 = this.c;
                int i12 = this.d;
                if (i7 == i10 && e7Var.l0 == i11 && e7Var.Q == i12) {
                    return;
                }
                e7Var.k0 = i10;
                e7Var.l0 = i11;
                e7Var.Q = i12;
                TextureView textureView = d0Var.e;
                if (textureView != null) {
                    textureView.requestLayout();
                    return;
                }
                return;
            case 1:
                li.t3 t3Var = (li.t3) this.e;
                KeyEvent.Callback D4 = t3Var.D4(this.b);
                if (D4 instanceof org.telegram.ui.Cells.h9) {
                    t3Var.u3.b0(this.c, this.d, (org.telegram.ui.Cells.h9) D4);
                    return;
                }
                return;
            case 2:
                li.i3 i3Var = (li.i3) this.e;
                li.t3.O1(i3Var.b, this.b, this.c, this.d);
                return;
            default:
                yr yrVar = (yr) this.e;
                int i13 = this.b;
                int i14 = this.c;
                int i15 = this.d;
                yrVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = yrVar.b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i13);
                        sQLitePreparedStatement.bindInteger(2, i14);
                        sQLitePreparedStatement.bindInteger(3, i15);
                        sQLitePreparedStatement.step();
                    } catch (Exception e10) {
                        yrVar.o(e10, true);
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
