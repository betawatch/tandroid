// default package

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ex3 implements Runnable {
    public final ArrayList a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public ex3(List list, int i, Throwable th) {
        ewe.a(list, "initCallbacks cannot be null");
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
                ((dx3) arrayList.get(i)).getClass();
                i++;
            }
        } else {
            while (i < size) {
                ((dx3) arrayList.get(i)).a();
                i++;
            }
        }
    }
}
