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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class v extends androidx.activity.l implements e0.a {
    public boolean M;
    public boolean N;
    public final cb.c K = new cb.c(new u(this), 6);
    public final androidx.lifecycle.v L = new androidx.lifecycle.v(this);
    public boolean O = true;

    public v() {
        ((m.p) this.e.d).f("android:support:lifecycle", new androidx.activity.e(this, 1));
        final int i7 = 0;
        o(new q0.a(this) { // from class: androidx.fragment.app.t
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        this.b.K.n();
                        break;
                    default:
                        this.b.K.n();
                        break;
                }
            }
        });
        final int i10 = 1;
        this.F.add(new q0.a(this) { // from class: androidx.fragment.app.t
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.b.K.n();
                        break;
                    default:
                        this.b.K.n();
                        break;
                }
            }
        });
        androidx.activity.f fVar = new androidx.activity.f(this, 1);
        com.google.android.gms.internal.cast.b0 b0Var = this.b;
        b0Var.getClass();
        if (((androidx.activity.l) b0Var.c) != null) {
            fVar.a();
        }
        ((CopyOnWriteArraySet) b0Var.b).add(fVar);
    }

    public static boolean t(j0 j0Var) {
        boolean z10 = false;
        for (s sVar : j0Var.c.w()) {
            if (sVar != null) {
                u uVar = sVar.L;
                if ((uVar == null ? null : uVar.e) != null) {
                    z10 |= t(sVar.l());
                }
                if (sVar.e0.c.compareTo(androidx.lifecycle.n.d) >= 0) {
                    sVar.e0.g();
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
        printWriter.print(this.M);
        printWriter.print(" mResumed=");
        printWriter.print(this.N);
        printWriter.print(" mStopped=");
        printWriter.print(this.O);
        if (getApplication() != null) {
            new sg.h0(this, g()).c(str3, printWriter);
        }
        ((u) this.K.b).d.w(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.l, android.app.Activity
    public void onActivityResult(int i7, int i10, Intent intent) {
        this.K.n();
        super.onActivityResult(i7, i10, intent);
    }

    @Override // androidx.activity.l, e0.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.L.e(androidx.lifecycle.m.ON_CREATE);
        k0 k0Var = ((u) this.K.b).d;
        k0Var.H = false;
        k0Var.I = false;
        k0Var.O.i = false;
        k0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        x xVar = (x) ((u) this.K.b).d.f.onCreateView(view, str, context, attributeSet);
        return xVar == null ? super.onCreateView(view, str, context, attributeSet) : xVar;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((u) this.K.b).d.l();
        this.L.e(androidx.lifecycle.m.ON_DESTROY);
    }

    @Override // androidx.activity.l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 6) {
            return ((u) this.K.b).d.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.N = false;
        ((u) this.K.b).d.u(5);
        this.L.e(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.L.e(androidx.lifecycle.m.ON_RESUME);
        k0 k0Var = ((u) this.K.b).d;
        k0Var.H = false;
        k0Var.I = false;
        k0Var.O.i = false;
        k0Var.u(7);
    }

    @Override // androidx.activity.l, android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.K.n();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        cb.c cVar = this.K;
        cVar.n();
        super.onResume();
        this.N = true;
        ((u) cVar.b).d.A(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        cb.c cVar = this.K;
        cVar.n();
        u uVar = (u) cVar.b;
        super.onStart();
        this.O = false;
        if (!this.M) {
            this.M = true;
            k0 k0Var = uVar.d;
            k0Var.H = false;
            k0Var.I = false;
            k0Var.O.i = false;
            k0Var.u(4);
        }
        uVar.d.A(true);
        this.L.e(androidx.lifecycle.m.ON_START);
        k0 k0Var2 = uVar.d;
        k0Var2.H = false;
        k0Var2.I = false;
        k0Var2.O.i = false;
        k0Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.K.n();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.O = true;
        while (t(s())) {
        }
        k0 k0Var = ((u) this.K.b).d;
        k0Var.I = true;
        k0Var.O.i = true;
        k0Var.u(4);
        this.L.e(androidx.lifecycle.m.ON_STOP);
    }

    public final k0 s() {
        return ((u) this.K.b).d;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        x xVar = (x) ((u) this.K.b).d.f.onCreateView(null, str, context, attributeSet);
        return xVar == null ? super.onCreateView(str, context, attributeSet) : xVar;
    }
}
