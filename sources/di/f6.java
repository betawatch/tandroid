package di;

import java.util.ArrayList;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h6 b;

    public /* synthetic */ f6(h6 h6Var, int i7) {
        this.a = i7;
        this.b = h6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h6 h6Var = this.b;
                h6Var.r = false;
                h6Var.invalidate();
                h6Var.a();
                h6Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                h6 h6Var2 = this.b;
                h6Var2.setMessageCell(null);
                ArrayList arrayList = h6Var2.K;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((ch0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
