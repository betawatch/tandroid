package hh;

import java.util.ArrayList;
import org.telegram.ui.Components.oi0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class l5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ l5(o5 o5Var, int i10) {
        this.a = i10;
        this.b = o5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o5 o5Var = this.b;
                o5Var.r = false;
                o5Var.invalidate();
                o5Var.a();
                o5Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                o5 o5Var2 = this.b;
                o5Var2.setMessageCell(null);
                ArrayList arrayList = o5Var2.F;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((oi0) obj).A(true);
                }
                arrayList.clear();
                break;
        }
    }
}
