package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bd;
import org.telegram.messenger.v10;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.bi;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ab(KeyEvent.Callback callback, int i3) {
        this.a = i3;
        this.b = callback;
    }

    @Override // org.telegram.messenger.v10
    public final Object a(Object obj) {
        int i3 = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i3) {
            case 0:
                bb bbVar = (bb) callback;
                return bbVar.s[((Integer) obj).intValue() % bbVar.s.length];
            case 1:
                zi ziVar = (zi) obj;
                ((gi.x6) callback).j2 = ziVar;
                return Boolean.valueOf(MediaController.B().o0(org.telegram.messenger.k5.k(ziVar), ziVar, 0L, true, null, 0L));
            case 2:
                bb bbVar2 = (bb) callback;
                return bbVar2.s[((Integer) obj).intValue() % bbVar2.s.length];
            case 3:
                return new hc1(9, (org.telegram.ui.m0) callback, (Integer) obj);
            case 4:
                ug.f0 f0Var = (ug.f0) callback;
                if (((Integer) obj).intValue() == 2) {
                    bi biVar = new bi(f0Var.getContext(), new ug.w(f0Var), false, false, false, f0Var.A1);
                    biVar.n = true;
                    biVar.A1(bd.M0(2131754428, null));
                    biVar.U3 = new mi.h0(27, f0Var, biVar);
                    biVar.setOnDismissListener(new gi.d1(8));
                    biVar.y1(1, false);
                    biVar.e1();
                    MediaController.h2 = true;
                    biVar.b2.i0();
                    biVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((zg.r) callback).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
