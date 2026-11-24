// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class h96 {
    public boolean a;
    public long b;
    public int c;
    public int d;
    public ArrayList e;

    public final void a() {
        ArrayList arrayList = this.e;
        this.e = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            ((Runnable) arrayList.get(i)).run();
        }
    }
}
