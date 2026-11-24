// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class hq3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p8c b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ hq3(p8c p8cVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = p8cVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                p8cVar.a(arrayList);
                break;
            default:
                if (p8cVar != null) {
                    p8cVar.a(arrayList);
                    break;
                }
                break;
        }
    }
}
