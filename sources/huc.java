// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class huc extends Thread {
    public final buc a;

    public huc(String str, buc bucVar, int i) {
        super(str);
        this.a = bucVar;
    }

    public abstract void a();

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        xf4 xf4Var = this.a.d;
        int i = 0;
        if (xf4Var != null) {
            ArrayList arrayList = (ArrayList) xf4Var.u();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                o15 o15Var = (o15) obj;
                try {
                    try {
                        o15Var.getClass();
                    } catch (Throwable unused) {
                        o15Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        a();
        if (xf4Var != null) {
            ArrayList arrayList2 = (ArrayList) xf4Var.u();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                o15 o15Var2 = (o15) obj2;
                try {
                    try {
                        o15Var2.getClass();
                    } catch (Throwable unused3) {
                        o15Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
    }
}
