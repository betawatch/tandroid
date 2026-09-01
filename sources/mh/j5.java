package mh;

import java.util.ArrayList;
import org.telegram.ui.Components.ij0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;

    public /* synthetic */ j5(l5 l5Var, int i10) {
        this.a = i10;
        this.b = l5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l5 l5Var = this.b;
                l5Var.r = false;
                l5Var.invalidate();
                l5Var.a();
                l5Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                l5 l5Var2 = this.b;
                l5Var2.setMessageCell(null);
                ArrayList arrayList = l5Var2.G;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ij0) obj).A(true);
                }
                arrayList.clear();
                break;
        }
    }
}
