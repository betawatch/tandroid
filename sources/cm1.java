// default package

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cm1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ fn7 e;

    public /* synthetic */ cm1(zu1 zu1Var, long j, boolean z, boolean z2) {
        this.a = (byte) 0;
        this.e = zu1Var;
        this.d = j;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 2131751879;
        long j = this.d;
        boolean z = this.c;
        boolean z2 = this.b;
        fn7 fn7Var = this.e;
        switch (b) {
            case 0:
                ((zu1) fn7Var).d9(j, z2, z);
                break;
            case 1:
                xn2 xn2Var = (xn2) fn7Var;
                String M0 = ob6.M0(2131751880, null);
                if (z2) {
                    i = 2131751882;
                } else if (z) {
                    i = 2131751881;
                }
                jj.s0(xn2Var, M0, ob6.M0(i, null), ob6.M0(2131746048, null), true, new rn2(xn2Var, j, (byte) 0));
                break;
            case 2:
                xo2 xo2Var = (xo2) fn7Var;
                Context context = xo2Var.getContext();
                vnb vnbVar = xo2Var.J0;
                String M02 = ob6.M0(2131751880, null);
                if (z2) {
                    i = 2131751882;
                } else if (z) {
                    i = 2131751881;
                }
                id M = jj.M(context, vnbVar, M02, ob6.M0(i, null), ob6.M0(2131746048, null), new kt((Object) xo2Var, j, (byte) 10));
                M.show();
                TextView textView = (TextView) M.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, null);
                    break;
                }
                break;
            default:
                uc7 uc7Var = (uc7) fn7Var;
                ArrayList arrayList = z2 ? uc7Var.m0 : uc7Var.l0;
                if (!z) {
                    arrayList.remove(Long.valueOf(j));
                    break;
                } else if (!arrayList.contains(Long.valueOf(j))) {
                    arrayList.add(Long.valueOf(j));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ cm1(fn7 fn7Var, boolean z, boolean z2, long j, byte b) {
        this.a = b;
        this.e = fn7Var;
        this.b = z;
        this.c = z2;
        this.d = j;
    }
}
