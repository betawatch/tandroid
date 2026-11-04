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
import b8.a1;
import k2.p1;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class p extends s implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler l0;
    public boolean u0;
    public Dialog w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public final a3.o m0 = new a3.o(this, 3);
    public final m n0 = new m(this);
    public final n o0 = new n(this);
    public int p0 = 0;
    public int q0 = 0;
    public boolean r0 = true;
    public boolean s0 = true;
    public int t0 = -1;
    public final bb.c v0 = new bb.c(this, 4);
    public boolean A0 = false;

    @Override // androidx.fragment.app.s
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

    @Override // androidx.fragment.app.s
    public final void C() {
        this.V = true;
        if (!this.z0 && !this.y0) {
            this.y0 = true;
        }
        this.f0.i(this.v0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0048, B:21:0x0052, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x006a), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater D(Bundle bundle) {
        Context n4;
        LayoutInflater D = super.D(bundle);
        boolean z10 = this.s0;
        if (z10 && !this.u0) {
            if (z10 && !this.A0) {
                try {
                    this.u0 = true;
                    Dialog O = O();
                    this.w0 = O;
                    if (this.s0) {
                        int i3 = this.p0;
                        if (i3 != 1 && i3 != 2) {
                            if (i3 == 3) {
                                Window window = O.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                n4 = n();
                                if (com.google.android.recaptcha.internal.a.u(n4)) {
                                    this.w0.setOwnerActivity((Activity) n4);
                                }
                                this.w0.setCancelable(this.r0);
                                this.w0.setOnCancelListener(this.n0);
                                this.w0.setOnDismissListener(this.o0);
                                this.A0 = true;
                            }
                        }
                        O.requestWindowFeature(1);
                        n4 = n();
                        if (com.google.android.recaptcha.internal.a.u(n4)) {
                        }
                        this.w0.setCancelable(this.r0);
                        this.w0.setOnCancelListener(this.n0);
                        this.w0.setOnDismissListener(this.o0);
                        this.A0 = true;
                    } else {
                        this.w0 = null;
                    }
                    this.u0 = false;
                } catch (Throwable th2) {
                    this.u0 = false;
                    throw th2;
                }
            }
            if (j0.K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.w0;
            if (dialog != null) {
                return D.cloneInContext(dialog.getContext());
            }
        } else if (j0.K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.s0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return D;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return D;
    }

    @Override // androidx.fragment.app.s
    public final void G(Bundle bundle) {
        Dialog dialog = this.w0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i3 = this.p0;
        if (i3 != 0) {
            bundle.putInt("android:style", i3);
        }
        int i10 = this.q0;
        if (i10 != 0) {
            bundle.putInt("android:theme", i10);
        }
        boolean z10 = this.r0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.s0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i11 = this.t0;
        if (i11 != -1) {
            bundle.putInt("android:backStackId", i11);
        }
    }

    @Override // androidx.fragment.app.s
    public final void H() {
        this.V = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            this.x0 = false;
            dialog.show();
            View decorView = this.w0.getWindow().getDecorView();
            kotlin.jvm.internal.j.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.s
    public void I() {
        this.V = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.s
    public final void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.J(layoutInflater, viewGroup, bundle);
        if (this.w0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.w0.onRestoreInstanceState(bundle2);
    }

    public final void N(boolean z10) {
        if (this.y0) {
            return;
        }
        this.y0 = true;
        this.z0 = false;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.w0.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.l0.getLooper()) {
                    onDismiss(this.w0);
                } else {
                    this.l0.post(this.m0);
                }
            }
        }
        this.x0 = true;
        if (this.t0 < 0) {
            a aVar = new a(p());
            aVar.o = true;
            aVar.h(this);
            aVar.e(true, true);
            return;
        }
        j0 p10 = p();
        int i3 = this.t0;
        if (i3 < 0) {
            throw new IllegalArgumentException(p1.i(i3, "Bad id: "));
        }
        p10.y(new h0(p10, i3), true);
        this.t0 = -1;
    }

    public Dialog O() {
        if (j0.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.m(K(), this.q0);
    }

    @Override // androidx.fragment.app.s
    public final a1 h() {
        return new o(this, new o(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.x0) {
            return;
        }
        if (j0.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        N(true);
    }

    @Override // androidx.fragment.app.s
    public final void w() {
        this.V = true;
    }

    @Override // androidx.fragment.app.s
    public final void y(Context context) {
        super.y(context);
        this.f0.e(this.v0);
        if (this.z0) {
            return;
        }
        this.y0 = false;
    }

    @Override // androidx.fragment.app.s
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
