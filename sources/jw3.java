// default package

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class jw3 implements Runnable {
    public final ArrayList a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public jw3(List list, int i, Throwable th) {
        kre.a(list, "initCallbacks cannot be null");
        this.a = new ArrayList(list);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        if (this.b != 1) {
            while (i < size) {
                ((iw3) arrayList.get(i)).getClass();
                i++;
            }
        } else {
            while (i < size) {
                ((iw3) arrayList.get(i)).a();
                i++;
            }
        }
    }
}
