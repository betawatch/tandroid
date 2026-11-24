// default package

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class mg3 extends dp4 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler l0;
    public boolean u0;
    public Dialog w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public final o1 m0 = new o1(this, 20);
    public final jg3 n0 = new jg3(this);
    public final kg3 o0 = new kg3(this, 0);
    public int p0 = 0;
    public int q0 = 0;
    public boolean r0 = true;
    public boolean s0 = true;
    public int t0 = -1;
    public final ni6 v0 = new ni6(this, 26);
    public boolean A0 = false;

    @Override // dp4
    public final void B() {
        this.V = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            this.x0 = true;
            dialog.setOnDismissListener(null);
            this.w0.dismiss();
            if (!this.y0) {
                onDismiss(this.w0);
            }
            this.w0 = null;
            this.A0 = false;
        }
    }

    @Override // dp4
    public final void C() {
        this.V = true;
        if (!this.z0 && !this.y0) {
            this.y0 = true;
        }
        this.f0.h(this.v0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:10:0x0017, B:12:0x0023, B:17:0x002c, B:19:0x0032, B:20:0x003a, B:22:0x0042, B:23:0x0049, B:25:0x0037, B:26:0x0061), top: B:9:0x0017 }] */
    @Override // dp4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater D(Bundle bundle) {
        Context n;
        LayoutInflater D = super.D(bundle);
        boolean z = this.s0;
        if (z && !this.u0) {
            if (z && !this.A0) {
                try {
                    this.u0 = true;
                    Dialog P = P();
                    this.w0 = P;
                    if (this.s0) {
                        int i = this.p0;
                        if (i != 1 && i != 2) {
                            if (i == 3) {
                                Window window = P.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            }
                            n = n();
                            if (n instanceof Activity) {
                                this.w0.setOwnerActivity((Activity) n);
                            }
                            this.w0.setCancelable(this.r0);
                            this.w0.setOnCancelListener(this.n0);
                            this.w0.setOnDismissListener(this.o0);
                            this.A0 = true;
                        }
                        P.requestWindowFeature(1);
                        n = n();
                        if (n instanceof Activity) {
                        }
                        this.w0.setCancelable(this.r0);
                        this.w0.setOnCancelListener(this.n0);
                        this.w0.setOnDismissListener(this.o0);
                        this.A0 = true;
                    } else {
                        this.w0 = null;
                    }
                } finally {
                    this.u0 = false;
                }
            }
            if (hq4.K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.w0;
            if (dialog != null) {
                return D.cloneInContext(dialog.getContext());
            }
        } else if (hq4.K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.s0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return D;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return D;
    }

    @Override // dp4
    public final void G(Bundle bundle) {
        Dialog dialog = this.w0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.p0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.q0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.r0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.s0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.t0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // dp4
    public final void H() {
        this.V = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            this.x0 = false;
            dialog.show();
            View decorView = this.w0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // dp4
    public void I() {
        this.V = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // dp4
    public final void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.J(layoutInflater, viewGroup, bundle);
        if (this.w0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.w0.onRestoreInstanceState(bundle2);
    }

    public final void O(boolean z) {
        if (this.y0) {
            return;
        }
        this.y0 = true;
        this.z0 = false;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.w0.dismiss();
            if (!z) {
                if (Looper.myLooper() == this.l0.getLooper()) {
                    onDismiss(this.w0);
                } else {
                    this.l0.post(this.m0);
                }
            }
        }
        this.x0 = true;
        if (this.t0 < 0) {
            ie0 ie0Var = new ie0(p());
            ie0Var.o = true;
            ie0Var.h(this);
            ie0Var.e(true, true);
            return;
        }
        hq4 p = p();
        int i = this.t0;
        if (i < 0) {
            u36.j(hg9.j(i, "Bad id: "));
        } else {
            p.y(new fq4(p, i), true);
            this.t0 = -1;
        }
    }

    public Dialog P() {
        if (hq4.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new jr2(K(), this.q0);
    }

    @Override // dp4
    public final jke h() {
        return new lg3(this, new lg3(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.x0) {
            return;
        }
        if (hq4.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        O(true);
    }

    @Override // dp4
    public final void w() {
        this.V = true;
    }

    @Override // dp4
    public final void y(Context context) {
        Object obj;
        super.y(context);
        kj7 kj7Var = this.f0;
        kj7Var.getClass();
        kj7.a("observeForever");
        ni6 ni6Var = this.v0;
        l96 l96Var = new l96(kj7Var, ni6Var);
        xq9 xq9Var = kj7Var.b;
        uq9 h = xq9Var.h(ni6Var);
        if (h != null) {
            obj = h.b;
        } else {
            uq9 uq9Var = new uq9(ni6Var, l96Var);
            xq9Var.d++;
            uq9 uq9Var2 = xq9Var.b;
            if (uq9Var2 == null) {
                xq9Var.a = uq9Var;
                xq9Var.b = uq9Var;
            } else {
                uq9Var2.c = uq9Var;
                uq9Var.d = uq9Var2;
                xq9Var.b = uq9Var;
            }
            obj = null;
        }
        n96 n96Var = (n96) obj;
        if (n96Var instanceof m96) {
            u36.j("Cannot add the same observer with different lifecycles");
            return;
        }
        if (n96Var == null) {
            l96Var.a(true);
        }
        if (this.z0) {
            return;
        }
        this.y0 = false;
    }

    @Override // dp4
    public void z(Bundle bundle) {
        super.z(bundle);
        this.l0 = new Handler();
        this.s0 = this.P == 0;
        if (bundle != null) {
            this.p0 = bundle.getInt("android:style", 0);
            this.q0 = bundle.getInt("android:theme", 0);
            this.r0 = bundle.getBoolean("android:cancelable", true);
            this.s0 = bundle.getBoolean("android:showsDialog", this.s0);
            this.t0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
