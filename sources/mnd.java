// default package

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mnd extends bn4 implements c16 {
    public static final WeakHashMap m0 = new WeakHashMap();
    public final ab8 l0 = new ab8();

    @Override // bn4
    public final void A() {
        this.V = true;
        ab8 ab8Var = this.l0;
        ab8Var.a = (byte) 5;
        Iterator it = ((Map) ab8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y06) it.next()).onDestroy();
        }
    }

    @Override // bn4
    public final void F() {
        this.V = true;
        ab8 ab8Var = this.l0;
        ab8Var.a = (byte) 3;
        Iterator it = ((Map) ab8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y06) it.next()).onResume();
        }
    }

    @Override // bn4
    public final void G(Bundle bundle) {
        this.l0.c(bundle);
    }

    @Override // bn4
    public final void H() {
        this.V = true;
        ab8 ab8Var = this.l0;
        ab8Var.a = (byte) 2;
        Iterator it = ((Map) ab8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y06) it.next()).onStart();
        }
    }

    @Override // bn4
    public final void I() {
        this.V = true;
        ab8 ab8Var = this.l0;
        ab8Var.a = (byte) 4;
        Iterator it = ((Map) ab8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y06) it.next()).onStop();
        }
    }

    @Override // c16
    public final void a(String str, y06 y06Var) {
        this.l0.a(str, y06Var);
    }

    @Override // c16
    public final y06 b(Class cls, String str) {
        return (y06) cls.cast(((Map) this.l0.b).get(str));
    }

    @Override // bn4
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.l0.b).values().iterator();
        while (it.hasNext()) {
            ((y06) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // bn4
    public final void x(int i, int i2, Intent intent) {
        super.x(i, i2, intent);
        Iterator it = ((Map) this.l0.b).values().iterator();
        while (it.hasNext()) {
            ((y06) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // bn4
    public final void z(Bundle bundle) {
        super.z(bundle);
        this.l0.b(bundle);
    }
}
