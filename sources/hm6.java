// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hm6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jm6 b;

    public /* synthetic */ hm6(jm6 jm6Var, byte b) {
        this.a = b;
        this.b = jm6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jm6 jm6Var = this.b;
        switch (b) {
            case 0:
                jm6Var.d();
                gl.c3(new hm6(jm6Var, (byte) 1));
                break;
            default:
                jm6Var.X = false;
                ArrayList arrayList = jm6Var.Y;
                jm6Var.Y = null;
                if (arrayList != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((Runnable) arrayList.get(i)).run();
                    }
                    break;
                }
                break;
        }
    }
}
