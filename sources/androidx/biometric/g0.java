package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class g0 extends androidx.fragment.app.o {
    public final Handler A0 = new Handler(Looper.getMainLooper());
    public final androidx.activity.i B0 = new androidx.activity.i(this, 1);
    public z C0;
    public int D0;
    public int E0;
    public ImageView F0;
    public TextView G0;

    @Override // androidx.fragment.app.r
    public final void E() {
        this.U = true;
        this.A0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.r
    public final void F() {
        this.U = true;
        z zVar = this.C0;
        zVar.y = 0;
        zVar.f(1);
        this.C0.e(q(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.o
    public final Dialog O() {
        c5.c0 c0Var = new c5.c0(K());
        j6.l lVar = this.C0.f;
        CharSequence charSequence = null;
        CharSequence charSequence2 = lVar != null ? (CharSequence) lVar.b : null;
        g.b bVar = (g.b) c0Var.c;
        bVar.d = charSequence2;
        View inflate = LayoutInflater.from(bVar.a).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            this.C0.getClass();
            if (TextUtils.isEmpty(null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            j6.l lVar2 = this.C0.f;
            CharSequence charSequence3 = lVar2 != null ? (CharSequence) lVar2.c : null;
            if (TextUtils.isEmpty(charSequence3)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence3);
            }
        }
        this.F0 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.G0 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (v7.k.a(this.C0.c())) {
            charSequence = q(R.string.confirm_device_credential_password);
        } else {
            z zVar = this.C0;
            String str = zVar.k;
            if (str != null) {
                charSequence = str;
            } else {
                j6.l lVar3 = zVar.f;
                if (lVar3 != null && (charSequence = (CharSequence) lVar3.d) == null) {
                    charSequence = "";
                }
            }
        }
        y yVar = new y(this);
        bVar.f = charSequence;
        bVar.g = yVar;
        bVar.k = inflate;
        g.f g10 = c0Var.g();
        g10.setCanceledOnTouchOutside(false);
        return g10;
    }

    public final int P(int i10) {
        Context n10 = n();
        androidx.fragment.app.u k10 = k();
        if (n10 == null || k10 == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        n10.getTheme().resolveAttribute(i10, typedValue, true);
        TypedArray obtainStyledAttributes = k10.obtainStyledAttributes(typedValue.data, new int[]{i10});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        z zVar = this.C0;
        if (zVar.x == null) {
            zVar.x = new androidx.lifecycle.z();
        }
        z.h(zVar.x, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void z(Bundle bundle) {
        super.z(bundle);
        androidx.fragment.app.u k10 = k();
        if (k10 != null) {
            z zVar = (z) new e(k10).m(z.class);
            this.C0 = zVar;
            if (zVar.z == null) {
                zVar.z = new androidx.lifecycle.z();
            }
            int i10 = 4;
            zVar.z.d(this, new qb.c(this, i10));
            z zVar2 = this.C0;
            if (zVar2.A == null) {
                zVar2.A = new androidx.lifecycle.z();
            }
            zVar2.A.d(this, new ya.c(this, i10));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.D0 = P(f0.a());
        } else {
            Context n10 = n();
            this.D0 = n10 != null ? n10.getColor(R.color.biometric_error_color) : 0;
        }
        this.E0 = P(android.R.attr.textColorSecondary);
    }
}
