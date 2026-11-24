// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ab6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eb6 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ab6(eb6 eb6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = eb6Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        eb6 eb6Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList2 = eb6Var.b;
                arrayList2.addAll(arrayList);
                for (int i = 0; i < arrayList2.size(); i++) {
                    db6 db6Var = (db6) arrayList2.get(i);
                    eb6Var.a.k(db6Var, db6Var.a);
                }
                gl.d3(new ab6(eb6Var, arrayList, (byte) 1));
                break;
            default:
                eb6Var.J.addAll(arrayList);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    db6 db6Var2 = (db6) arrayList.get(i2);
                    eb6Var.K.k(db6Var2, db6Var2.a);
                }
                eb6.q();
                kk7.e().k(kk7.F4, new Object[0]);
                break;
        }
    }
}
