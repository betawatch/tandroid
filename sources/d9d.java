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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class d9d extends Fragment implements g36 {
    public static final WeakHashMap b = new WeakHashMap();
    public final pe8 a = new pe8();

    @Override // g36
    public final void a(String str, c36 c36Var) {
        this.a.a(str, c36Var);
    }

    @Override // g36
    public final c36 b(Class cls, String str) {
        return (c36) cls.cast(((Map) this.a.b).get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.a.b).values().iterator();
        while (it.hasNext()) {
            ((c36) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // g36
    public final Activity e() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = ((Map) this.a.b).values().iterator();
        while (it.hasNext()) {
            ((c36) it.next()).onActivityResult(i, i2, intent);
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
        pe8 pe8Var = this.a;
        pe8Var.a = (byte) 5;
        Iterator it = ((Map) pe8Var.b).values().iterator();
        while (it.hasNext()) {
            ((c36) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        pe8 pe8Var = this.a;
        pe8Var.a = (byte) 3;
        Iterator it = ((Map) pe8Var.b).values().iterator();
        while (it.hasNext()) {
            ((c36) it.next()).onResume();
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
        pe8 pe8Var = this.a;
        pe8Var.a = (byte) 2;
        Iterator it = ((Map) pe8Var.b).values().iterator();
        while (it.hasNext()) {
            ((c36) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        pe8 pe8Var = this.a;
        pe8Var.a = (byte) 4;
        Iterator it = ((Map) pe8Var.b).values().iterator();
        while (it.hasNext()) {
            ((c36) it.next()).onStop();
        }
    }
}
