package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.ui.Cells.e3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class v extends androidx.activity.m implements e0.c, e0.d {
    public boolean H;
    public boolean I;
    public final fa.c F = new fa.c(new u(this), 3);
    public final androidx.lifecycle.v G = new androidx.lifecycle.v(this);
    public boolean J = true;

    public v() {
        ((g2.e) this.e.c).f("android:support:lifecycle", new androidx.activity.e(this, 1));
        final int i9 = 0;
        o(new q0.a(this) { // from class: androidx.fragment.app.t
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        this.b.F.J();
                        break;
                    default:
                        this.b.F.J();
                        break;
                }
            }
        });
        final int i10 = 1;
        this.A.add(new q0.a(this) { // from class: androidx.fragment.app.t
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.b.F.J();
                        break;
                    default:
                        this.b.F.J();
                        break;
                }
            }
        });
        androidx.activity.f fVar = new androidx.activity.f(this, 1);
        com.google.android.gms.internal.cast.d0 d0Var = this.b;
        d0Var.getClass();
        if (((androidx.activity.m) d0Var.c) != null) {
            fVar.a();
        }
        ((CopyOnWriteArraySet) d0Var.b).add(fVar);
    }

    public static boolean t(j0 j0Var) {
        boolean z10 = false;
        for (s sVar : j0Var.c.u()) {
            if (sVar != null) {
                u uVar = sVar.G;
                if ((uVar == null ? null : uVar.e) != null) {
                    z10 |= t(sVar.l());
                }
                if (sVar.Z.c.compareTo(androidx.lifecycle.n.d) >= 0) {
                    sVar.Z.g();
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r0.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.H);
        printWriter.print(" mResumed=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        if (getApplication() != null) {
            new e3(this, f()).v2(str3, printWriter);
        }
        ((u) this.F.b).d.w(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        this.F.J();
        super.onActivityResult(i9, i10, intent);
    }

    @Override // androidx.activity.m, e0.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.G.e(androidx.lifecycle.m.ON_CREATE);
        k0 k0Var = ((u) this.F.b).d;
        k0Var.H = false;
        k0Var.I = false;
        k0Var.O.i = false;
        k0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        x xVar = (x) ((u) this.F.b).d.f.onCreateView(view, str, context, attributeSet);
        return xVar == null ? super.onCreateView(view, str, context, attributeSet) : xVar;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((u) this.F.b).d.l();
        this.G.e(androidx.lifecycle.m.ON_DESTROY);
    }

    @Override // androidx.activity.m, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i9, MenuItem menuItem) {
        if (super.onMenuItemSelected(i9, menuItem)) {
            return true;
        }
        if (i9 == 6) {
            return ((u) this.F.b).d.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.I = false;
        ((u) this.F.b).d.u(5);
        this.G.e(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.G.e(androidx.lifecycle.m.ON_RESUME);
        k0 k0Var = ((u) this.F.b).d;
        k0Var.H = false;
        k0Var.I = false;
        k0Var.O.i = false;
        k0Var.u(7);
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        this.F.J();
        super.onRequestPermissionsResult(i9, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        fa.c cVar = this.F;
        cVar.J();
        super.onResume();
        this.I = true;
        ((u) cVar.b).d.A(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        fa.c cVar = this.F;
        cVar.J();
        u uVar = (u) cVar.b;
        super.onStart();
        this.J = false;
        if (!this.H) {
            this.H = true;
            k0 k0Var = uVar.d;
            k0Var.H = false;
            k0Var.I = false;
            k0Var.O.i = false;
            k0Var.u(4);
        }
        uVar.d.A(true);
        this.G.e(androidx.lifecycle.m.ON_START);
        k0 k0Var2 = uVar.d;
        k0Var2.H = false;
        k0Var2.I = false;
        k0Var2.O.i = false;
        k0Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.F.J();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.J = true;
        while (t(s())) {
        }
        k0 k0Var = ((u) this.F.b).d;
        k0Var.I = true;
        k0Var.O.i = true;
        k0Var.u(4);
        this.G.e(androidx.lifecycle.m.ON_STOP);
    }

    public final k0 s() {
        return ((u) this.F.b).d;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        x xVar = (x) ((u) this.F.b).d.f.onCreateView(null, str, context, attributeSet);
        return xVar == null ? super.onCreateView(str, context, attributeSet) : xVar;
    }
}
