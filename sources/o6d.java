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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class o6d extends Fragment implements c36 {
    public static final WeakHashMap b = new WeakHashMap();
    public final dd8 a = new dd8();

    @Override // c36
    public final void a(String str, y26 y26Var) {
        this.a.a(str, y26Var);
    }

    @Override // c36
    public final y26 b(Class cls, String str) {
        return (y26) cls.cast(((Map) this.a.b).get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.a.b).values().iterator();
        while (it.hasNext()) {
            ((y26) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // c36
    public final Activity e() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = ((Map) this.a.b).values().iterator();
        while (it.hasNext()) {
            ((y26) it.next()).onActivityResult(i, i2, intent);
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
        dd8 dd8Var = this.a;
        dd8Var.a = (byte) 5;
        Iterator it = ((Map) dd8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y26) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        dd8 dd8Var = this.a;
        dd8Var.a = (byte) 3;
        Iterator it = ((Map) dd8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y26) it.next()).onResume();
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
        dd8 dd8Var = this.a;
        dd8Var.a = (byte) 2;
        Iterator it = ((Map) dd8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y26) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        dd8 dd8Var = this.a;
        dd8Var.a = (byte) 4;
        Iterator it = ((Map) dd8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y26) it.next()).onStop();
        }
    }
}
