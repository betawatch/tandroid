// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class jp4 extends pq2 {
    public boolean M;
    public boolean N;
    public final v34 K = new v34(new ip4(this), 3);
    public final k36 L = new k36(this);
    public boolean O = true;

    public jp4() {
        final byte b = 1;
        ((po) this.e.d).f("android:support:lifecycle", new hq2(this, b));
        final byte b2 = 0;
        o(new pt2(this) { // from class: hp4
            public final /* synthetic */ jp4 b;

            {
                this.b = this;
            }

            @Override // pt2
            public final void accept(Object obj) {
                byte b3 = b2;
                jp4 jp4Var = this.b;
                switch (b3) {
                    case 0:
                        jp4Var.K.M();
                        break;
                    default:
                        jp4Var.K.M();
                        break;
                }
            }
        });
        this.F.add(new pt2(this) { // from class: hp4
            public final /* synthetic */ jp4 b;

            {
                this.b = this;
            }

            @Override // pt2
            public final void accept(Object obj) {
                byte b3 = b;
                jp4 jp4Var = this.b;
                switch (b3) {
                    case 0:
                        jp4Var.K.M();
                        break;
                    default:
                        jp4Var.K.M();
                        break;
                }
            }
        });
        iq2 iq2Var = new iq2(this, b);
        sw2 sw2Var = this.b;
        sw2Var.getClass();
        if (((pq2) sw2Var.c) != null) {
            iq2Var.a();
        }
        ((CopyOnWriteArraySet) sw2Var.b).add(iq2Var);
    }

    public static boolean v(kq4 kq4Var) {
        boolean z = false;
        for (gp4 gp4Var : kq4Var.c.u()) {
            if (gp4Var != null) {
                ip4 ip4Var = gp4Var.L;
                if ((ip4Var == null ? null : ip4Var.e) != null) {
                    z |= v(gp4Var.l());
                }
                if (gp4Var.e0.b.compareTo(z26.d) >= 0) {
                    k36 k36Var = gp4Var.e0;
                    k36Var.d("setCurrentState");
                    k36Var.f(z26.c);
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r0.equals("--list-dumpables") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r0.equals("--dump-dumpable") != false) goto L24;
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
            new ym4(this, f()).w(str3, printWriter);
        }
        ((ip4) this.K.b).d.w(str, fileDescriptor, printWriter, strArr);
    }

    @Override // pq2, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.K.M();
        super.onActivityResult(i, i2, intent);
    }

    @Override // pq2, oq2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.L.e(y26.ON_CREATE);
        lq4 lq4Var = ((ip4) this.K.b).d;
        lq4Var.H = false;
        lq4Var.I = false;
        lq4Var.O.g = false;
        lq4Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        kp4 kp4Var = (kp4) ((ip4) this.K.b).d.f.onCreateView(null, str, context, attributeSet);
        return kp4Var == null ? super.onCreateView(str, context, attributeSet) : kp4Var;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((ip4) this.K.b).d.l();
        this.L.e(y26.ON_DESTROY);
    }

    @Override // pq2, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((ip4) this.K.b).d.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.N = false;
        ((ip4) this.K.b).d.u(5);
        this.L.e(y26.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.L.e(y26.ON_RESUME);
        lq4 lq4Var = ((ip4) this.K.b).d;
        lq4Var.H = false;
        lq4Var.I = false;
        lq4Var.O.g = false;
        lq4Var.u(7);
    }

    @Override // pq2, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.K.M();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        v34 v34Var = this.K;
        v34Var.M();
        super.onResume();
        this.N = true;
        ((ip4) v34Var.b).d.A(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        v34 v34Var = this.K;
        v34Var.M();
        ip4 ip4Var = (ip4) v34Var.b;
        super.onStart();
        this.O = false;
        if (!this.M) {
            this.M = true;
            lq4 lq4Var = ip4Var.d;
            lq4Var.H = false;
            lq4Var.I = false;
            lq4Var.O.g = false;
            lq4Var.u(4);
        }
        ip4Var.d.A(true);
        this.L.e(y26.ON_START);
        lq4 lq4Var2 = ip4Var.d;
        lq4Var2.H = false;
        lq4Var2.I = false;
        lq4Var2.O.g = false;
        lq4Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.K.M();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.O = true;
        while (v(u())) {
        }
        lq4 lq4Var = ((ip4) this.K.b).d;
        lq4Var.I = true;
        lq4Var.O.g = true;
        lq4Var.u(4);
        this.L.e(y26.ON_STOP);
    }

    public final lq4 u() {
        return ((ip4) this.K.b).d;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        kp4 kp4Var = (kp4) ((ip4) this.K.b).d.f.onCreateView(view, str, context, attributeSet);
        return kp4Var == null ? super.onCreateView(view, str, context, attributeSet) : kp4Var;
    }
}
