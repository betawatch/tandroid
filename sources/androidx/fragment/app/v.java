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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class v extends androidx.activity.m implements e0.c, e0.d {
    public final androidx.biometric.e0 G;
    public boolean I;
    public boolean J;
    public final androidx.lifecycle.v H = new androidx.lifecycle.v(this);
    public boolean K = true;

    public v() {
        int i10 = 1;
        this.G = new androidx.biometric.e0(new u(this), i10);
        ((g2.e) this.e.c).f("android:support:lifecycle", new androidx.activity.e(this, i10));
        final int i11 = 0;
        o(new q0.a(this) { // from class: androidx.fragment.app.t
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.b.G.t();
                        break;
                    default:
                        this.b.G.t();
                        break;
                }
            }
        });
        final int i12 = 1;
        this.B.add(new q0.a(this) { // from class: androidx.fragment.app.t
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        this.b.G.t();
                        break;
                    default:
                        this.b.G.t();
                        break;
                }
            }
        });
        androidx.activity.f fVar = new androidx.activity.f(this, 1);
        com.google.android.gms.internal.cast.c0 c0Var = this.b;
        c0Var.getClass();
        if (((androidx.activity.m) c0Var.c) != null) {
            fVar.a();
        }
        ((CopyOnWriteArraySet) c0Var.b).add(fVar);
    }

    public static boolean t(j0 j0Var) {
        boolean z4 = false;
        for (s sVar : j0Var.c.v()) {
            if (sVar != null) {
                u uVar = sVar.H;
                if ((uVar == null ? null : uVar.e) != null) {
                    z4 |= t(sVar.l());
                }
                if (sVar.a0.c.compareTo(androidx.lifecycle.n.d) >= 0) {
                    sVar.a0.g();
                    z4 = true;
                }
            }
        }
        return z4;
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
        printWriter.print(this.I);
        printWriter.print(" mResumed=");
        printWriter.print(this.J);
        printWriter.print(" mStopped=");
        printWriter.print(this.K);
        if (getApplication() != null) {
            new q5.c0(this, f()).q(str3, printWriter);
        }
        ((u) this.G.b).d.w(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.G.t();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.m, e0.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.H.e(androidx.lifecycle.m.ON_CREATE);
        k0 k0Var = ((u) this.G.b).d;
        k0Var.H = false;
        k0Var.I = false;
        k0Var.O.i = false;
        k0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        x xVar = (x) ((u) this.G.b).d.f.onCreateView(view, str, context, attributeSet);
        return xVar == null ? super.onCreateView(view, str, context, attributeSet) : xVar;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((u) this.G.b).d.l();
        this.H.e(androidx.lifecycle.m.ON_DESTROY);
    }

    @Override // androidx.activity.m, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return ((u) this.G.b).d.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.J = false;
        ((u) this.G.b).d.u(5);
        this.H.e(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.H.e(androidx.lifecycle.m.ON_RESUME);
        k0 k0Var = ((u) this.G.b).d;
        k0Var.H = false;
        k0Var.I = false;
        k0Var.O.i = false;
        k0Var.u(7);
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.G.t();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        androidx.biometric.e0 e0Var = this.G;
        e0Var.t();
        super.onResume();
        this.J = true;
        ((u) e0Var.b).d.A(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        androidx.biometric.e0 e0Var = this.G;
        e0Var.t();
        u uVar = (u) e0Var.b;
        super.onStart();
        this.K = false;
        if (!this.I) {
            this.I = true;
            k0 k0Var = uVar.d;
            k0Var.H = false;
            k0Var.I = false;
            k0Var.O.i = false;
            k0Var.u(4);
        }
        uVar.d.A(true);
        this.H.e(androidx.lifecycle.m.ON_START);
        k0 k0Var2 = uVar.d;
        k0Var2.H = false;
        k0Var2.I = false;
        k0Var2.O.i = false;
        k0Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.G.t();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.K = true;
        while (t(s())) {
        }
        k0 k0Var = ((u) this.G.b).d;
        k0Var.I = true;
        k0Var.O.i = true;
        k0Var.u(4);
        this.H.e(androidx.lifecycle.m.ON_STOP);
    }

    public final k0 s() {
        return ((u) this.G.b).d;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        x xVar = (x) ((u) this.G.b).d.f.onCreateView(null, str, context, attributeSet);
        return xVar == null ? super.onCreateView(str, context, attributeSet) : xVar;
    }
}
