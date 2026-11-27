// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mbc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sbc b;

    public /* synthetic */ mbc(sbc sbcVar, byte b) {
        this.a = b;
        this.b = sbcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sbc sbcVar = this.b;
        switch (b) {
            case 0:
                sbcVar.d1(true);
                break;
            case 1:
                sbcVar.Y1.setVisibility(8);
                break;
            case 2:
                sbcVar.Z0();
                sbcVar.h1(true, false);
                break;
            case 3:
                ni7 ni7Var = sbcVar.U1;
                ni7Var.b.r(ob6.M0(2131745564, null), true);
                break;
            case 4:
                ni7 ni7Var2 = sbcVar.U1;
                ni7Var2.b.r(ob6.M0(2131749439, null), true);
                break;
            case 5:
                sbcVar.Z0();
                sbcVar.h1(true, false);
                break;
            case 6:
                sbcVar.Y1.setVisibility(8);
                break;
            case 7:
                ArrayList arrayList = sbcVar.d2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(ls6.d0(sbcVar.a).j1);
                    sbcVar.g1(true, true);
                    break;
                }
                break;
            case 8:
                sbcVar.Z0();
                sbcVar.h1(true, false);
                break;
            case 9:
                sbcVar.g1(true, true);
                break;
            case 10:
                sbcVar.dismiss();
                break;
            default:
                sbcVar.Z0();
                sbcVar.h1(true, false);
                break;
        }
    }
}
