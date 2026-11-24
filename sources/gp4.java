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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class gp4 extends hr2 {
    public boolean M;
    public boolean N;
    public final k44 K = new k44(new fp4(this), 4);
    public final g36 L = new g36(this);
    public boolean O = true;

    public gp4() {
        final byte b = 1;
        ((op) this.e.d).f("android:support:lifecycle", new zq2(this, b));
        final byte b2 = 0;
        o(new gu2(this) { // from class: ep4
            public final /* synthetic */ gp4 b;

            {
                this.b = this;
            }

            @Override // gu2
            public final void accept(Object obj) {
                byte b3 = b2;
                gp4 gp4Var = this.b;
                switch (b3) {
                    case 0:
                        gp4Var.K.C();
                        break;
                    default:
                        gp4Var.K.C();
                        break;
                }
            }
        });
        this.F.add(new gu2(this) { // from class: ep4
            public final /* synthetic */ gp4 b;

            {
                this.b = this;
            }

            @Override // gu2
            public final void accept(Object obj) {
                byte b3 = b;
                gp4 gp4Var = this.b;
                switch (b3) {
                    case 0:
                        gp4Var.K.C();
                        break;
                    default:
                        gp4Var.K.C();
                        break;
                }
            }
        });
        ar2 ar2Var = new ar2(this, b);
        ix2 ix2Var = this.b;
        ix2Var.getClass();
        if (((hr2) ix2Var.c) != null) {
            ar2Var.a();
        }
        ((CopyOnWriteArraySet) ix2Var.b).add(ar2Var);
    }

    public static boolean v(hq4 hq4Var) {
        boolean z = false;
        for (dp4 dp4Var : hq4Var.c.u()) {
            if (dp4Var != null) {
                fp4 fp4Var = dp4Var.L;
                if ((fp4Var == null ? null : fp4Var.e) != null) {
                    z |= v(dp4Var.l());
                }
                if (dp4Var.e0.b.compareTo(v26.d) >= 0) {
                    g36 g36Var = dp4Var.e0;
                    g36Var.d("setCurrentState");
                    g36Var.f(v26.c);
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
            new mj4(this, f()).j(str3, printWriter);
        }
        ((fp4) this.K.b).d.w(str, fileDescriptor, printWriter, strArr);
    }

    @Override // hr2, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.K.C();
        super.onActivityResult(i, i2, intent);
    }

    @Override // hr2, gr2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.L.e(u26.ON_CREATE);
        iq4 iq4Var = ((fp4) this.K.b).d;
        iq4Var.H = false;
        iq4Var.I = false;
        iq4Var.O.g = false;
        iq4Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        hp4 hp4Var = (hp4) ((fp4) this.K.b).d.f.onCreateView(null, str, context, attributeSet);
        return hp4Var == null ? super.onCreateView(str, context, attributeSet) : hp4Var;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((fp4) this.K.b).d.l();
        this.L.e(u26.ON_DESTROY);
    }

    @Override // hr2, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((fp4) this.K.b).d.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.N = false;
        ((fp4) this.K.b).d.u(5);
        this.L.e(u26.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.L.e(u26.ON_RESUME);
        iq4 iq4Var = ((fp4) this.K.b).d;
        iq4Var.H = false;
        iq4Var.I = false;
        iq4Var.O.g = false;
        iq4Var.u(7);
    }

    @Override // hr2, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.K.C();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        k44 k44Var = this.K;
        k44Var.C();
        super.onResume();
        this.N = true;
        ((fp4) k44Var.b).d.A(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        k44 k44Var = this.K;
        k44Var.C();
        fp4 fp4Var = (fp4) k44Var.b;
        super.onStart();
        this.O = false;
        if (!this.M) {
            this.M = true;
            iq4 iq4Var = fp4Var.d;
            iq4Var.H = false;
            iq4Var.I = false;
            iq4Var.O.g = false;
            iq4Var.u(4);
        }
        fp4Var.d.A(true);
        this.L.e(u26.ON_START);
        iq4 iq4Var2 = fp4Var.d;
        iq4Var2.H = false;
        iq4Var2.I = false;
        iq4Var2.O.g = false;
        iq4Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.K.C();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.O = true;
        while (v(u())) {
        }
        iq4 iq4Var = ((fp4) this.K.b).d;
        iq4Var.I = true;
        iq4Var.O.g = true;
        iq4Var.u(4);
        this.L.e(u26.ON_STOP);
    }

    public final iq4 u() {
        return ((fp4) this.K.b).d;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        hp4 hp4Var = (hp4) ((fp4) this.K.b).d.f.onCreateView(view, str, context, attributeSet);
        return hp4Var == null ? super.onCreateView(view, str, context, attributeSet) : hp4Var;
    }
}
