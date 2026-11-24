// default package

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class o74 {
    public static o74 e;
    public boolean a = false;
    public boolean b = true;
    public boolean c = false;
    public Object d;

    public o74(Context context) {
        this.d = context;
    }

    public static o74 c() {
        o74 o74Var = e;
        if (o74Var != null) {
            return o74Var;
        }
        o74 o74Var2 = new o74();
        e = o74Var2;
        return o74Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p74 a() {
        boolean z;
        syd sydVar = new syd();
        boolean z2 = this.c;
        sydVar.a = z2 ? 1 : 0;
        boolean z3 = this.a;
        sydVar.b = z3 ? 1 : 0;
        boolean z4 = false;
        sydVar.c = 0;
        sydVar.d = false;
        sydVar.e = this.b;
        sydVar.f = -1.0f;
        if (z2 == 2 || z3 != 2) {
            z = true;
        } else {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z = false;
        }
        if (sydVar.b == 2 && sydVar.c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z4 = z;
        }
        if (z4) {
            return new p74(new jbd((Context) this.d, sydVar));
        }
        w26.j("Invalid build options");
        return null;
    }

    public final htc b(String str) {
        d();
        htc htcVar = (htc) ((HashMap) this.d).get(str);
        if (htcVar == null) {
            return null;
        }
        htcVar.a = Math.max(htcVar.a, System.currentTimeMillis());
        e();
        return htcVar;
    }

    public final void d() {
        if (this.a || this.b) {
            return;
        }
        this.b = true;
        if (((HashMap) this.d) == null) {
            this.d = new HashMap();
        }
        Utilities.e.c(new etc(this, (byte) 1));
    }

    public final void e() {
        byte b = 0;
        gl.r(new etc(this, b));
        if (this.c) {
            return;
        }
        etc etcVar = new etc(this, b);
        boolean z = w01.a;
        gl.d3(etcVar, 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.a = i;
            return;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Invalid landmark type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.c = i;
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid mode: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
