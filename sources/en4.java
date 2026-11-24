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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class en4 extends wp2 {
    public final pj4 K;
    public boolean M;
    public boolean N;
    public final g16 L = new g16(this);
    public boolean O = true;

    public en4() {
        final byte b = 1;
        this.K = new pj4(new dn4(this), b);
        ((oo) this.e.d).f("android:support:lifecycle", new op2(this, b));
        final byte b2 = 0;
        o(new vs2(this) { // from class: cn4
            public final /* synthetic */ en4 b;

            {
                this.b = this;
            }

            @Override // vs2
            public final void accept(Object obj) {
                byte b3 = b2;
                en4 en4Var = this.b;
                switch (b3) {
                    case 0:
                        en4Var.K.S();
                        break;
                    default:
                        en4Var.K.S();
                        break;
                }
            }
        });
        this.F.add(new vs2(this) { // from class: cn4
            public final /* synthetic */ en4 b;

            {
                this.b = this;
            }

            @Override // vs2
            public final void accept(Object obj) {
                byte b3 = b;
                en4 en4Var = this.b;
                switch (b3) {
                    case 0:
                        en4Var.K.S();
                        break;
                    default:
                        en4Var.K.S();
                        break;
                }
            }
        });
        pp2 pp2Var = new pp2(this, b);
        yv2 yv2Var = this.b;
        yv2Var.getClass();
        if (((wp2) yv2Var.c) != null) {
            pp2Var.a();
        }
        ((CopyOnWriteArraySet) yv2Var.b).add(pp2Var);
    }

    public static boolean v(go4 go4Var) {
        boolean z = false;
        for (bn4 bn4Var : go4Var.c.s()) {
            if (bn4Var != null) {
                dn4 dn4Var = bn4Var.L;
                if ((dn4Var == null ? null : dn4Var.e) != null) {
                    z |= v(bn4Var.l());
                }
                if (bn4Var.e0.b.compareTo(v06.d) >= 0) {
                    g16 g16Var = bn4Var.e0;
                    g16Var.d("setCurrentState");
                    g16Var.f(v06.c);
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
            new sk4(this, f()).n(str3, printWriter);
        }
        ((dn4) this.K.b).d.w(str, fileDescriptor, printWriter, strArr);
    }

    @Override // wp2, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.K.S();
        super.onActivityResult(i, i2, intent);
    }

    @Override // wp2, vp2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.L.e(u06.ON_CREATE);
        ho4 ho4Var = ((dn4) this.K.b).d;
        ho4Var.H = false;
        ho4Var.I = false;
        ho4Var.O.g = false;
        ho4Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        fn4 fn4Var = (fn4) ((dn4) this.K.b).d.f.onCreateView(null, str, context, attributeSet);
        return fn4Var == null ? super.onCreateView(str, context, attributeSet) : fn4Var;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((dn4) this.K.b).d.l();
        this.L.e(u06.ON_DESTROY);
    }

    @Override // wp2, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((dn4) this.K.b).d.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.N = false;
        ((dn4) this.K.b).d.u(5);
        this.L.e(u06.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.L.e(u06.ON_RESUME);
        ho4 ho4Var = ((dn4) this.K.b).d;
        ho4Var.H = false;
        ho4Var.I = false;
        ho4Var.O.g = false;
        ho4Var.u(7);
    }

    @Override // wp2, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.K.S();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        pj4 pj4Var = this.K;
        pj4Var.S();
        super.onResume();
        this.N = true;
        ((dn4) pj4Var.b).d.A(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        pj4 pj4Var = this.K;
        pj4Var.S();
        dn4 dn4Var = (dn4) pj4Var.b;
        super.onStart();
        this.O = false;
        if (!this.M) {
            this.M = true;
            ho4 ho4Var = dn4Var.d;
            ho4Var.H = false;
            ho4Var.I = false;
            ho4Var.O.g = false;
            ho4Var.u(4);
        }
        dn4Var.d.A(true);
        this.L.e(u06.ON_START);
        ho4 ho4Var2 = dn4Var.d;
        ho4Var2.H = false;
        ho4Var2.I = false;
        ho4Var2.O.g = false;
        ho4Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.K.S();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.O = true;
        while (v(u())) {
        }
        ho4 ho4Var = ((dn4) this.K.b).d;
        ho4Var.I = true;
        ho4Var.O.g = true;
        ho4Var.u(4);
        this.L.e(u06.ON_STOP);
    }

    public final ho4 u() {
        return ((dn4) this.K.b).d;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        fn4 fn4Var = (fn4) ((dn4) this.K.b).d.f.onCreateView(view, str, context, attributeSet);
        return fn4Var == null ? super.onCreateView(view, str, context, attributeSet) : fn4Var;
    }
}
