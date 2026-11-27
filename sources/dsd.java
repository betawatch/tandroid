// default package

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class dsd extends gp4 implements g36 {
    public static final WeakHashMap m0 = new WeakHashMap();
    public final pe8 l0 = new pe8();

    @Override // gp4
    public final void A() {
        this.V = true;
        pe8 pe8Var = this.l0;
        pe8Var.a = (byte) 5;
        Iterator it = ((Map) pe8Var.b).values().iterator();
        while (it.hasNext()) {
            ((c36) it.next()).onDestroy();
        }
    }

    @Override // gp4
    public final void F() {
        this.V = true;
        pe8 pe8Var = this.l0;
        pe8Var.a = (byte) 3;
        Iterator it = ((Map) pe8Var.b).values().iterator();
        while (it.hasNext()) {
            ((c36) it.next()).onResume();
        }
    }

    @Override // gp4
    public final void G(Bundle bundle) {
        this.l0.c(bundle);
    }

    @Override // gp4
    public final void H() {
        this.V = true;
        pe8 pe8Var = this.l0;
        pe8Var.a = (byte) 2;
        Iterator it = ((Map) pe8Var.b).values().iterator();
        while (it.hasNext()) {
            ((c36) it.next()).onStart();
        }
    }

    @Override // gp4
    public final void I() {
        this.V = true;
        pe8 pe8Var = this.l0;
        pe8Var.a = (byte) 4;
        Iterator it = ((Map) pe8Var.b).values().iterator();
        while (it.hasNext()) {
            ((c36) it.next()).onStop();
        }
    }

    @Override // g36
    public final void a(String str, c36 c36Var) {
        this.l0.a(str, c36Var);
    }

    @Override // g36
    public final c36 b(Class cls, String str) {
        return (c36) cls.cast(((Map) this.l0.b).get(str));
    }

    @Override // gp4
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.l0.b).values().iterator();
        while (it.hasNext()) {
            ((c36) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // gp4
    public final void x(int i, int i2, Intent intent) {
        super.x(i, i2, intent);
        Iterator it = ((Map) this.l0.b).values().iterator();
        while (it.hasNext()) {
            ((c36) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // gp4
    public final void z(Bundle bundle) {
        super.z(bundle);
        this.l0.b(bundle);
    }
}
