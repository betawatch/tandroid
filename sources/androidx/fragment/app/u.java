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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class u extends androidx.activity.m implements e0.c, e0.d {
    public boolean L;
    public boolean M;
    public final a6.m J = new a6.m(new t(this), 3);
    public final androidx.lifecycle.v K = new androidx.lifecycle.v(this);
    public boolean N = true;

    public u() {
        ((m.p) this.e.d).f("android:support:lifecycle", new androidx.activity.e(this, 1));
        final int i10 = 0;
        o(new q0.a(this) { // from class: androidx.fragment.app.s
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.b.J.a0();
                        break;
                    default:
                        this.b.J.a0();
                        break;
                }
            }
        });
        final int i11 = 1;
        this.E.add(new q0.a(this) { // from class: androidx.fragment.app.s
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.b.J.a0();
                        break;
                    default:
                        this.b.J.a0();
                        break;
                }
            }
        });
        androidx.activity.f fVar = new androidx.activity.f(this, 1);
        com.google.android.gms.internal.cast.f0 f0Var = this.b;
        f0Var.getClass();
        if (((androidx.activity.m) f0Var.c) != null) {
            fVar.a();
        }
        ((CopyOnWriteArraySet) f0Var.b).add(fVar);
    }

    public static boolean t(i0 i0Var) {
        boolean z10 = false;
        for (r rVar : i0Var.c.v()) {
            if (rVar != null) {
                t tVar = rVar.K;
                if ((tVar == null ? null : tVar.e) != null) {
                    z10 |= t(rVar.l());
                }
                if (rVar.d0.c.compareTo(androidx.lifecycle.n.d) >= 0) {
                    rVar.d0.g();
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
            new o0.a(this, f()).q(str3, printWriter);
        }
        ((t) this.J.b).d.w(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.J.a0();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.m, e0.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.K.e(androidx.lifecycle.m.ON_CREATE);
        j0 j0Var = ((t) this.J.b).d;
        j0Var.H = false;
        j0Var.I = false;
        j0Var.O.i = false;
        j0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        w wVar = (w) ((t) this.J.b).d.f.onCreateView(view, str, context, attributeSet);
        return wVar == null ? super.onCreateView(view, str, context, attributeSet) : wVar;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((t) this.J.b).d.l();
        this.K.e(androidx.lifecycle.m.ON_DESTROY);
    }

    @Override // androidx.activity.m, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return ((t) this.J.b).d.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.M = false;
        ((t) this.J.b).d.u(5);
        this.K.e(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.K.e(androidx.lifecycle.m.ON_RESUME);
        j0 j0Var = ((t) this.J.b).d;
        j0Var.H = false;
        j0Var.I = false;
        j0Var.O.i = false;
        j0Var.u(7);
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.J.a0();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        a6.m mVar = this.J;
        mVar.a0();
        super.onResume();
        this.M = true;
        ((t) mVar.b).d.A(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        a6.m mVar = this.J;
        mVar.a0();
        t tVar = (t) mVar.b;
        super.onStart();
        this.N = false;
        if (!this.L) {
            this.L = true;
            j0 j0Var = tVar.d;
            j0Var.H = false;
            j0Var.I = false;
            j0Var.O.i = false;
            j0Var.u(4);
        }
        tVar.d.A(true);
        this.K.e(androidx.lifecycle.m.ON_START);
        j0 j0Var2 = tVar.d;
        j0Var2.H = false;
        j0Var2.I = false;
        j0Var2.O.i = false;
        j0Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.J.a0();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.N = true;
        while (t(s())) {
        }
        j0 j0Var = ((t) this.J.b).d;
        j0Var.I = true;
        j0Var.O.i = true;
        j0Var.u(4);
        this.K.e(androidx.lifecycle.m.ON_STOP);
    }

    public final j0 s() {
        return ((t) this.J.b).d;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        w wVar = (w) ((t) this.J.b).d.f.onCreateView(null, str, context, attributeSet);
        return wVar == null ? super.onCreateView(str, context, attributeSet) : wVar;
    }
}
