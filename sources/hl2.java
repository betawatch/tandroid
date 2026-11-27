// default package

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hl2(Object obj, int i, int i2, int i3, byte b) {
        this.a = b;
        this.e = obj;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        Object obj = this.e;
        switch (b) {
            case 0:
                jl2 jl2Var = (jl2) ((il2) obj).b;
                c8b c8bVar = jl2Var.n;
                if (c8bVar != null) {
                    if (c8bVar.k0 == i3 && c8bVar.l0 == i2 && c8bVar.Q == i) {
                        return;
                    }
                    c8bVar.k0 = i3;
                    c8bVar.l0 = i2;
                    c8bVar.Q = i;
                    TextureView textureView = jl2Var.e;
                    if (textureView != null) {
                        textureView.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                kf7 kf7Var = (kf7) obj;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = kf7Var.b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i3);
                        sQLitePreparedStatement.bindInteger(2, i2);
                        sQLitePreparedStatement.bindInteger(3, i);
                        sQLitePreparedStatement.step();
                    } catch (Exception e) {
                        kf7Var.p(e, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 2:
                pi9 pi9Var = (pi9) obj;
                KeyEvent.Callback D4 = pi9Var.D4(i3);
                if (D4 instanceof zlb) {
                    pi9Var.v3.a0(i2, i, (zlb) D4);
                    return;
                }
                return;
            default:
                ((fi9) obj).b.z4(i3, i2, i);
                return;
        }
    }
}
