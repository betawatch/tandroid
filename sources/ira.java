// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ira implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jra b;

    public /* synthetic */ ira(jra jraVar, byte b) {
        this.a = b;
        this.b = jraVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        jra jraVar = this.b;
        switch (b) {
            case 0:
                jraVar.r = false;
                jraVar.invalidate();
                jraVar.a();
                jraVar.c();
                break;
            case 1:
                jraVar.invalidate();
                break;
            default:
                jraVar.setMessageCell(null);
                ArrayList arrayList = jraVar.K;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((oy8) obj).x(true);
                }
                arrayList.clear();
                break;
        }
    }
}
