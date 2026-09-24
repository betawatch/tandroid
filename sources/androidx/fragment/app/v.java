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
import n7.z0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public abstract class v extends androidx.activity.l implements e0.c, e0.d {
    public boolean L;
    public boolean M;
    public final xa.c J = new xa.c(new u(this), 4);
    public final androidx.lifecycle.v K = new androidx.lifecycle.v(this);
    public boolean N = true;

    public v() {
        ((m.p) this.e.d).f("android:support:lifecycle", new androidx.activity.e(this, 1));
        final int i10 = 0;
        o(new q0.a(this) { // from class: androidx.fragment.app.t
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.b.J.w();
                        break;
                    default:
                        this.b.J.w();
                        break;
                }
            }
        });
        final int i11 = 1;
        this.E.add(new q0.a(this) { // from class: androidx.fragment.app.t
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.b.J.w();
                        break;
                    default:
                        this.b.J.w();
                        break;
                }
            }
        });
        androidx.activity.f fVar = new androidx.activity.f(this, 1);
        com.google.android.gms.internal.cast.f0 f0Var = this.b;
        f0Var.getClass();
        if (((androidx.activity.l) f0Var.c) != null) {
            fVar.a();
        }
        ((CopyOnWriteArraySet) f0Var.b).add(fVar);
    }

    public static boolean t(k0 k0Var) {
        boolean z10 = false;
        for (s sVar : k0Var.c.u()) {
            if (sVar != null) {
                u uVar = sVar.K;
                if ((uVar == null ? null : uVar.e) != null) {
                    z10 |= t(sVar.l());
                }
                if (sVar.d0.c.compareTo(androidx.lifecycle.n.d) >= 0) {
                    sVar.d0.g();
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
        printWriter.print(this.L);
        printWriter.print(" mResumed=");
        printWriter.print(this.M);
        printWriter.print(" mStopped=");
        printWriter.print(this.N);
        if (getApplication() != null) {
            new z0(this, f()).s(str3, printWriter);
        }
        ((u) this.J.b).d.w(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.l, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.J.w();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.l, e0.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.K.e(androidx.lifecycle.m.ON_CREATE);
        l0 l0Var = ((u) this.J.b).d;
        l0Var.H = false;
        l0Var.I = false;
        l0Var.O.i = false;
        l0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        x xVar = (x) ((u) this.J.b).d.f.onCreateView(view, str, context, attributeSet);
        return xVar == null ? super.onCreateView(view, str, context, attributeSet) : xVar;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((u) this.J.b).d.l();
        this.K.e(androidx.lifecycle.m.ON_DESTROY);
    }

    @Override // androidx.activity.l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return ((u) this.J.b).d.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.M = false;
        ((u) this.J.b).d.u(5);
        this.K.e(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.K.e(androidx.lifecycle.m.ON_RESUME);
        l0 l0Var = ((u) this.J.b).d;
        l0Var.H = false;
        l0Var.I = false;
        l0Var.O.i = false;
        l0Var.u(7);
    }

    @Override // androidx.activity.l, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.J.w();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        xa.c cVar = this.J;
        cVar.w();
        super.onResume();
        this.M = true;
        ((u) cVar.b).d.A(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        xa.c cVar = this.J;
        cVar.w();
        u uVar = (u) cVar.b;
        super.onStart();
        this.N = false;
        if (!this.L) {
            this.L = true;
            l0 l0Var = uVar.d;
            l0Var.H = false;
            l0Var.I = false;
            l0Var.O.i = false;
            l0Var.u(4);
        }
        uVar.d.A(true);
        this.K.e(androidx.lifecycle.m.ON_START);
        l0 l0Var2 = uVar.d;
        l0Var2.H = false;
        l0Var2.I = false;
        l0Var2.O.i = false;
        l0Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.J.w();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.N = true;
        while (t(s())) {
        }
        l0 l0Var = ((u) this.J.b).d;
        l0Var.I = true;
        l0Var.O.i = true;
        l0Var.u(4);
        this.K.e(androidx.lifecycle.m.ON_STOP);
    }

    public final l0 s() {
        return ((u) this.J.b).d;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        x xVar = (x) ((u) this.J.b).d.f.onCreateView(null, str, context, attributeSet);
        return xVar == null ? super.onCreateView(str, context, attributeSet) : xVar;
    }
}
