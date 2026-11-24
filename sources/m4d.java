// default package

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class m4d extends Fragment implements c16 {
    public static final WeakHashMap b = new WeakHashMap();
    public final ab8 a = new ab8();

    @Override // c16
    public final void a(String str, y06 y06Var) {
        this.a.a(str, y06Var);
    }

    @Override // c16
    public final y06 b(Class cls, String str) {
        return (y06) cls.cast(((Map) this.a.b).get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.a.b).values().iterator();
        while (it.hasNext()) {
            ((y06) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // c16
    public final Activity e() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = ((Map) this.a.b).values().iterator();
        while (it.hasNext()) {
            ((y06) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.b(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ab8 ab8Var = this.a;
        ab8Var.a = (byte) 5;
        Iterator it = ((Map) ab8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y06) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        ab8 ab8Var = this.a;
        ab8Var.a = (byte) 3;
        Iterator it = ((Map) ab8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y06) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.c(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        ab8 ab8Var = this.a;
        ab8Var.a = (byte) 2;
        Iterator it = ((Map) ab8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y06) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        ab8 ab8Var = this.a;
        ab8Var.a = (byte) 4;
        Iterator it = ((Map) ab8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y06) it.next()).onStop();
        }
    }
}
