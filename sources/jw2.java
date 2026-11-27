// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class jw2 implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nw2 c;

    public jw2(nw2 nw2Var, ArrayList arrayList, boolean z) {
        this.c = nw2Var;
        this.a = arrayList;
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rw2 rw2Var = this.c.a;
        if (rw2Var.w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.a;
            if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
                pw2 pw2Var = rw2Var.l;
                if (pw2Var != null) {
                    TLRPC.Document document = rw2Var.W;
                    String str = rw2Var.Y;
                    boolean z = true;
                    Object obj = rw2Var.b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z = false;
                    }
                    pw2Var.k(document, str, obj, z, 0, 0);
                }
            } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                pw2 pw2Var2 = rw2Var.l;
                if (pw2Var2 != null) {
                    pw2Var2.P(rw2Var.a0, rw2Var.i);
                }
            } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                ls6.d0(rw2Var.r).d(2, rw2Var.b0, rw2Var.W, (int) (System.currentTimeMillis() / 1000), this.b);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                TLRPC.Document document2 = rw2Var.W;
                Object obj2 = rw2Var.b0;
                String str2 = rw2Var.Y;
                pw2 pw2Var3 = rw2Var.l;
                if (pw2Var3 == null) {
                    return;
                } else {
                    jj.I(rw2Var.w, pw2Var3.a(), new pt((Object) pw2Var3, (Object) document2, obj2, str2, (byte) 8));
                }
            } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                ls6.d0(rw2Var.r).d(0, rw2Var.b0, rw2Var.W, (int) (System.currentTimeMillis() / 1000), true);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                rw2Var.l.K(rw2Var.X);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                rw2Var.l.m(rw2Var.W);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                rw2Var.l.D(rw2Var.W);
            }
            rw2Var.d();
        }
    }
}
