package mh;

import java.util.ArrayList;
import org.telegram.ui.Components.hj0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                    ((hj0) obj).A(true);
                }
                arrayList.clear();
                break;
        }
    }
}
