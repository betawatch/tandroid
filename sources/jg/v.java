package jg;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.r20;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Wallet.k3;
import rh.o7;
import vh.f5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ v(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.r20
    public final Object a(Object obj) {
        int i10 = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i10) {
            case 0:
                r0 r0Var = (r0) callback;
                if (((Integer) obj).intValue() == 2) {
                    bi biVar = new bi(r0Var.getContext(), new f0(r0Var), false, false, false, r0Var.z1);
                    biVar.n = true;
                    biVar.z1(cd.L0(2131754428, null));
                    biVar.T3 = new hf.b(r0Var, biVar, false, 28);
                    biVar.setOnDismissListener(new z(0));
                    biVar.x1(1, false);
                    biVar.d1();
                    MediaController.f2 = true;
                    biVar.a2.g0();
                    biVar.show();
                }
                return Boolean.TRUE;
            case 1:
                Paint[] paintArr = ((og.s) callback).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 2:
                return new k3(27, (org.telegram.ui.m0) callback, (Integer) obj);
            case 3:
                o7 o7Var = (o7) callback;
                return o7Var.s[((Integer) obj).intValue() % o7Var.s.length];
            case 4:
                jj jjVar = (jj) obj;
                ((f5) callback).i2 = jjVar;
                return Boolean.valueOf(MediaController.B().o0(m5.j(jjVar), jjVar, 0L, true, null));
            default:
                o7 o7Var2 = (o7) callback;
                return o7Var2.s[((Integer) obj).intValue() % o7Var2.s.length];
        }
    }
}
