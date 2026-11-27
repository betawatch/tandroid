// default package

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class j84 {
    public static j84 e;
    public boolean a = false;
    public boolean b = true;
    public boolean c = false;
    public Object d;

    public j84(Context context) {
        this.d = context;
    }

    public static j84 c() {
        j84 j84Var = e;
        if (j84Var != null) {
            return j84Var;
        }
        j84 j84Var2 = new j84();
        e = j84Var2;
        return j84Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k84 a() {
        boolean z;
        i3e i3eVar = new i3e();
        boolean z2 = this.c;
        i3eVar.a = z2 ? 1 : 0;
        boolean z3 = this.a;
        i3eVar.b = z3 ? 1 : 0;
        boolean z4 = false;
        i3eVar.c = 0;
        i3eVar.d = false;
        i3eVar.e = this.b;
        i3eVar.f = -1.0f;
        if (z2 == 2 || z3 != 2) {
            z = true;
        } else {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z = false;
        }
        if (i3eVar.b == 2 && i3eVar.c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z4 = z;
        }
        if (z4) {
            return new k84(new cgd((Context) this.d, i3eVar));
        }
        lq5.j("Invalid build options");
        return null;
    }

    public final wxc b(String str) {
        d();
        wxc wxcVar = (wxc) ((HashMap) this.d).get(str);
        if (wxcVar == null) {
            return null;
        }
        wxcVar.a = Math.max(wxcVar.a, System.currentTimeMillis());
        e();
        return wxcVar;
    }

    public final void d() {
        if (this.a || this.b) {
            return;
        }
        this.b = true;
        if (((HashMap) this.d) == null) {
            this.d = new HashMap();
        }
        Utilities.e.c(new txc(this, (byte) 1));
    }

    public final void e() {
        byte b = 0;
        hl.r(new txc(this, b));
        if (this.c) {
            return;
        }
        txc txcVar = new txc(this, b);
        boolean z = f11.a;
        hl.d3(txcVar, 1000L);
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
