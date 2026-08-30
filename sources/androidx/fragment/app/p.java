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
import kh.a2;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class p extends s implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler h0;
    public boolean q0;
    public Dialog s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final androidx.activity.i i0 = new androidx.activity.i(this, 2);
    public final m j0 = new m(this);
    public final n k0 = new n(this);
    public int l0 = 0;
    public int m0 = 0;
    public boolean n0 = true;
    public boolean o0 = true;
    public int p0 = -1;
    public final o5.i r0 = new o5.i(this, 4);
    public boolean w0 = false;

    @Override // androidx.fragment.app.s
    public final void B() {
        this.R = true;
        Dialog dialog = this.s0;
        if (dialog != null) {
            this.t0 = true;
            dialog.setOnDismissListener(null);
            this.s0.dismiss();
            if (!this.u0) {
                onDismiss(this.s0);
            }
            this.s0 = null;
            this.w0 = false;
        }
    }

    @Override // androidx.fragment.app.s
    public final void C() {
        this.R = true;
        if (!this.v0 && !this.u0) {
            this.u0 = true;
        }
        this.b0.i(this.r0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0048, B:21:0x0052, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x006a), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater D(Bundle bundle) {
        Context n10;
        LayoutInflater D = super.D(bundle);
        boolean z4 = this.o0;
        if (z4 && !this.q0) {
            if (z4 && !this.w0) {
                try {
                    this.q0 = true;
                    Dialog O = O();
                    this.s0 = O;
                    if (this.o0) {
                        int i10 = this.l0;
                        if (i10 != 1 && i10 != 2) {
                            if (i10 == 3) {
                                Window window = O.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                n10 = n();
                                if (e2.c.s(n10)) {
                                    this.s0.setOwnerActivity((Activity) n10);
                                }
                                this.s0.setCancelable(this.n0);
                                this.s0.setOnCancelListener(this.j0);
                                this.s0.setOnDismissListener(this.k0);
                                this.w0 = true;
                            }
                        }
                        O.requestWindowFeature(1);
                        n10 = n();
                        if (e2.c.s(n10)) {
                        }
                        this.s0.setCancelable(this.n0);
                        this.s0.setOnCancelListener(this.j0);
                        this.s0.setOnDismissListener(this.k0);
                        this.w0 = true;
                    } else {
                        this.s0 = null;
                    }
                    this.q0 = false;
                } catch (Throwable th2) {
                    this.q0 = false;
                    throw th2;
                }
            }
            if (j0.K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.s0;
            if (dialog != null) {
                return D.cloneInContext(dialog.getContext());
            }
        } else if (j0.K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.o0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return D;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return D;
    }

    @Override // androidx.fragment.app.s
    public final void G(Bundle bundle) {
        Dialog dialog = this.s0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.l0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.m0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z4 = this.n0;
        if (!z4) {
            bundle.putBoolean("android:cancelable", z4);
        }
        boolean z10 = this.o0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i12 = this.p0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.s
    public final void H() {
        this.R = true;
        Dialog dialog = this.s0;
        if (dialog != null) {
            this.t0 = false;
            dialog.show();
            View decorView = this.s0.getWindow().getDecorView();
            kotlin.jvm.internal.j.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.s
    public void I() {
        this.R = true;
        Dialog dialog = this.s0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.s
    public final void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.J(layoutInflater, viewGroup, bundle);
        if (this.s0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.s0.onRestoreInstanceState(bundle2);
    }

    public final void N(boolean z4) {
        if (this.u0) {
            return;
        }
        this.u0 = true;
        this.v0 = false;
        Dialog dialog = this.s0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.s0.dismiss();
            if (!z4) {
                if (Looper.myLooper() == this.h0.getLooper()) {
                    onDismiss(this.s0);
                } else {
                    this.h0.post(this.i0);
                }
            }
        }
        this.t0 = true;
        if (this.p0 < 0) {
            a aVar = new a(p());
            aVar.o = true;
            aVar.h(this);
            aVar.e(true, true);
            return;
        }
        j0 p10 = p();
        int i10 = this.p0;
        if (i10 < 0) {
            throw new IllegalArgumentException(a2.j(i10, "Bad id: "));
        }
        p10.y(new h0(p10, i10), true);
        this.p0 = -1;
    }

    public Dialog O() {
        if (j0.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.n(K(), this.m0);
    }

    @Override // androidx.fragment.app.s
    public final j7.w h() {
        return new o(this, new o(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.t0) {
            return;
        }
        if (j0.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        N(true);
    }

    @Override // androidx.fragment.app.s
    public final void w() {
        this.R = true;
    }

    @Override // androidx.fragment.app.s
    public final void y(Context context) {
        super.y(context);
        this.b0.e(this.r0);
        if (this.v0) {
            return;
        }
        this.u0 = false;
    }

    @Override // androidx.fragment.app.s
    public void z(Bundle bundle) {
        super.z(bundle);
        this.h0 = new Handler();
        this.o0 = this.L == 0;
        if (bundle != null) {
            this.l0 = bundle.getInt("android:style", 0);
            this.m0 = bundle.getInt("android:theme", 0);
            this.n0 = bundle.getBoolean("android:cancelable", true);
            this.o0 = bundle.getBoolean("android:showsDialog", this.o0);
            this.p0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
