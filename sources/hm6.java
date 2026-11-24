// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.d3(new hm6(jm6Var, (byte) 1));
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
