package bi;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d20;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.ci;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc implements d20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ fc(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // org.telegram.messenger.d20
    public final Object a(Object obj) {
        int i7 = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i7) {
            case 0:
                gc gcVar = (gc) callback;
                return gcVar.s[((Integer) obj).intValue() % gcVar.s.length];
            case 1:
                ij ijVar = (ij) obj;
                ((fi.w6) callback).l2 = ijVar;
                return Boolean.valueOf(MediaController.B().o0(org.telegram.messenger.k5.k(ijVar), ijVar, 0L, true, null, 0L));
            case 2:
                gc gcVar2 = (gc) callback;
                return gcVar2.s[((Integer) obj).intValue() % gcVar2.s.length];
            case 3:
                return new org.telegram.ui.web.s(5, (org.telegram.ui.l0) callback, (Integer) obj);
            case 4:
                tg.g0 g0Var = (tg.g0) callback;
                if (((Integer) obj).intValue() == 2) {
                    ci ciVar = new ci(g0Var.getContext(), new tg.w(g0Var), false, false, false, g0Var.z1);
                    ciVar.n = true;
                    ciVar.A1(org.telegram.messenger.id.M0(2131754428, null));
                    ciVar.W3 = new m4.d0(g0Var, ciVar, false);
                    ciVar.setOnDismissListener(new fi.d1(8));
                    ciVar.y1(1, false);
                    ciVar.e1();
                    MediaController.g2 = true;
                    ciVar.d2.i0();
                    ciVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((yg.r) callback).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
