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
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class o extends r implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler k0;
    public boolean t0;
    public Dialog v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public final androidx.activity.i l0 = new androidx.activity.i(this, 2);
    public final l m0 = new l(this);
    public final m n0 = new m(this);
    public int o0 = 0;
    public int p0 = 0;
    public boolean q0 = true;
    public boolean r0 = true;
    public int s0 = -1;
    public final a4.m u0 = new a4.m(this, 5);
    public boolean z0 = false;

    @Override // androidx.fragment.app.r
    public final void B() {
        this.U = true;
        Dialog dialog = this.v0;
        if (dialog != null) {
            this.w0 = true;
            dialog.setOnDismissListener(null);
            this.v0.dismiss();
            if (!this.x0) {
                onDismiss(this.v0);
            }
            this.v0 = null;
            this.z0 = false;
        }
    }

    @Override // androidx.fragment.app.r
    public final void C() {
        this.U = true;
        if (!this.y0 && !this.x0) {
            this.x0 = true;
        }
        this.e0.i(this.u0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0048, B:21:0x0052, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x006a), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater D(Bundle bundle) {
        Context n10;
        LayoutInflater D = super.D(bundle);
        boolean z10 = this.r0;
        if (z10 && !this.t0) {
            if (z10 && !this.z0) {
                try {
                    this.t0 = true;
                    Dialog O = O();
                    this.v0 = O;
                    if (this.r0) {
                        int i10 = this.o0;
                        if (i10 != 1 && i10 != 2) {
                            if (i10 == 3) {
                                Window window = O.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                n10 = n();
                                if (e2.u(n10)) {
                                    this.v0.setOwnerActivity((Activity) n10);
                                }
                                this.v0.setCancelable(this.q0);
                                this.v0.setOnCancelListener(this.m0);
                                this.v0.setOnDismissListener(this.n0);
                                this.z0 = true;
                            }
                        }
                        O.requestWindowFeature(1);
                        n10 = n();
                        if (e2.u(n10)) {
                        }
                        this.v0.setCancelable(this.q0);
                        this.v0.setOnCancelListener(this.m0);
                        this.v0.setOnDismissListener(this.n0);
                        this.z0 = true;
                    } else {
                        this.v0 = null;
                    }
                    this.t0 = false;
                } catch (Throwable th2) {
                    this.t0 = false;
                    throw th2;
                }
            }
            if (i0.K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.v0;
            if (dialog != null) {
                return D.cloneInContext(dialog.getContext());
            }
        } else if (i0.K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.r0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return D;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return D;
    }

    @Override // androidx.fragment.app.r
    public final void G(Bundle bundle) {
        Dialog dialog = this.v0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.o0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.p0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.q0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.r0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.s0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.r
    public final void H() {
        this.U = true;
        Dialog dialog = this.v0;
        if (dialog != null) {
            this.w0 = false;
            dialog.show();
            View decorView = this.v0.getWindow().getDecorView();
            kotlin.jvm.internal.i.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.r
    public void I() {
        this.U = true;
        Dialog dialog = this.v0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.r
    public final void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.J(layoutInflater, viewGroup, bundle);
        if (this.v0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.v0.onRestoreInstanceState(bundle2);
    }

    public final void N(boolean z10) {
        if (this.x0) {
            return;
        }
        this.x0 = true;
        this.y0 = false;
        Dialog dialog = this.v0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.v0.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.k0.getLooper()) {
                    onDismiss(this.v0);
                } else {
                    this.k0.post(this.l0);
                }
            }
        }
        this.w0 = true;
        if (this.s0 < 0) {
            a aVar = new a(p());
            aVar.o = true;
            aVar.h(this);
            aVar.e(true, true);
            return;
        }
        i0 p5 = p();
        int i10 = this.s0;
        if (i10 < 0) {
            throw new IllegalArgumentException(i2.g.i(i10, "Bad id: "));
        }
        p5.y(new g0(p5, i10), true);
        this.s0 = -1;
    }

    public Dialog O() {
        if (i0.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.n(K(), this.p0);
    }

    @Override // androidx.fragment.app.r
    public final v7.a0 h() {
        return new n(this, new n(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.w0) {
            return;
        }
        if (i0.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        N(true);
    }

    @Override // androidx.fragment.app.r
    public final void w() {
        this.U = true;
    }

    @Override // androidx.fragment.app.r
    public final void y(Context context) {
        super.y(context);
        this.e0.e(this.u0);
        if (this.y0) {
            return;
        }
        this.x0 = false;
    }

    @Override // androidx.fragment.app.r
    public void z(Bundle bundle) {
        super.z(bundle);
        this.k0 = new Handler();
        this.r0 = this.O == 0;
        if (bundle != null) {
            this.o0 = bundle.getInt("android:style", 0);
            this.p0 = bundle.getInt("android:theme", 0);
            this.q0 = bundle.getBoolean("android:cancelable", true);
            this.r0 = bundle.getBoolean("android:showsDialog", this.r0);
            this.s0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
