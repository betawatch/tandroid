package androidx.fragment.app;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class p extends s implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler g0;
    public boolean p0;
    public Dialog r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public final androidx.activity.i h0 = new androidx.activity.i(this, 2);
    public final m i0 = new m(this);
    public final n j0 = new n(this);
    public int k0 = 0;
    public int l0 = 0;
    public boolean m0 = true;
    public boolean n0 = true;
    public int o0 = -1;
    public final xa.c q0 = new xa.c(this, 4);
    public boolean v0 = false;

    @Override // androidx.fragment.app.s
    public final void B() {
        this.Q = true;
        Dialog dialog = this.r0;
        if (dialog != null) {
            this.s0 = true;
            dialog.setOnDismissListener(null);
            this.r0.dismiss();
            if (!this.t0) {
                onDismiss(this.r0);
            }
            this.r0 = null;
            this.v0 = false;
        }
    }

    @Override // androidx.fragment.app.s
    public final void C() {
        this.Q = true;
        if (!this.u0 && !this.t0) {
            this.t0 = true;
        }
        this.a0.i(this.q0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0048, B:21:0x0052, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x006a), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater D(Bundle bundle) {
        Context n10;
        LayoutInflater D = super.D(bundle);
        boolean z10 = this.n0;
        if (z10 && !this.p0) {
            if (z10 && !this.v0) {
                try {
                    this.p0 = true;
                    Dialog O = O();
                    this.r0 = O;
                    if (this.n0) {
                        int i9 = this.k0;
                        if (i9 != 1 && i9 != 2) {
                            if (i9 == 3) {
                                Window window = O.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                n10 = n();
                                if (e2.c.v(n10)) {
                                    this.r0.setOwnerActivity((Activity) n10);
                                }
                                this.r0.setCancelable(this.m0);
                                this.r0.setOnCancelListener(this.i0);
                                this.r0.setOnDismissListener(this.j0);
                                this.v0 = true;
                            }
                        }
                        O.requestWindowFeature(1);
                        n10 = n();
                        if (e2.c.v(n10)) {
                        }
                        this.r0.setCancelable(this.m0);
                        this.r0.setOnCancelListener(this.i0);
                        this.r0.setOnDismissListener(this.j0);
                        this.v0 = true;
                    } else {
                        this.r0 = null;
                    }
                    this.p0 = false;
                } catch (Throwable th) {
                    this.p0 = false;
                    throw th;
                }
            }
            if (j0.K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.r0;
            if (dialog != null) {
                return D.cloneInContext(dialog.getContext());
            }
        } else if (j0.K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.n0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return D;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return D;
    }

    @Override // androidx.fragment.app.s
    public final void G(Bundle bundle) {
        Dialog dialog = this.r0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i9 = this.k0;
        if (i9 != 0) {
            bundle.putInt("android:style", i9);
        }
        int i10 = this.l0;
        if (i10 != 0) {
            bundle.putInt("android:theme", i10);
        }
        boolean z10 = this.m0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.n0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i11 = this.o0;
        if (i11 != -1) {
            bundle.putInt("android:backStackId", i11);
        }
    }

    @Override // androidx.fragment.app.s
    public final void H() {
        this.Q = true;
        Dialog dialog = this.r0;
        if (dialog != null) {
            this.s0 = false;
            dialog.show();
            View decorView = this.r0.getWindow().getDecorView();
            kotlin.jvm.internal.i.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.s
    public void I() {
        this.Q = true;
        Dialog dialog = this.r0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.s
    public final void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.J(layoutInflater, viewGroup, bundle);
        if (this.r0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.r0.onRestoreInstanceState(bundle2);
    }

    public final void N(boolean z10) {
        if (this.t0) {
            return;
        }
        this.t0 = true;
        this.u0 = false;
        Dialog dialog = this.r0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.r0.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.g0.getLooper()) {
                    onDismiss(this.r0);
                } else {
                    this.g0.post(this.h0);
                }
            }
        }
        this.s0 = true;
        if (this.o0 < 0) {
            a aVar = new a(p());
            aVar.o = true;
            aVar.h(this);
            aVar.e(true, true);
            return;
        }
        j0 p6 = p();
        int i9 = this.o0;
        if (i9 < 0) {
            throw new IllegalArgumentException(j3.r0.l(i9, "Bad id: "));
        }
        p6.y(new h0(p6, i9), true);
        this.o0 = -1;
    }

    public Dialog O() {
        if (j0.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.n(K(), this.l0);
    }

    @Override // androidx.fragment.app.s
    public final f7.a0 h() {
        return new o(this, new o(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.s0) {
            return;
        }
        if (j0.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        N(true);
    }

    @Override // androidx.fragment.app.s
    public final void w() {
        this.Q = true;
    }

    @Override // androidx.fragment.app.s
    public final void y(Context context) {
        super.y(context);
        this.a0.e(this.q0);
        if (this.u0) {
            return;
        }
        this.t0 = false;
    }

    @Override // androidx.fragment.app.s
    public void z(Bundle bundle) {
        super.z(bundle);
        this.g0 = new Handler();
        this.n0 = this.K == 0;
        if (bundle != null) {
            this.k0 = bundle.getInt("android:style", 0);
            this.l0 = bundle.getInt("android:theme", 0);
            this.m0 = bundle.getBoolean("android:cancelable", true);
            this.n0 = bundle.getBoolean("android:showsDialog", this.n0);
            this.o0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
