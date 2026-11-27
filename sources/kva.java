// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kva implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lva b;

    public /* synthetic */ kva(lva lvaVar, byte b) {
        this.a = b;
        this.b = lvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        lva lvaVar = this.b;
        switch (b) {
            case 0:
                lvaVar.r = false;
                lvaVar.invalidate();
                lvaVar.a();
                lvaVar.c();
                break;
            case 1:
                lvaVar.invalidate();
                break;
            default:
                lvaVar.setMessageCell(null);
                ArrayList arrayList = lvaVar.K;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((b29) obj).x(true);
                }
                arrayList.clear();
                break;
        }
    }
}
