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
import com.google.android.gms.internal.play_billing.s1;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class i0 extends androidx.fragment.app.p {
    public int A0;
    public int B0;
    public ImageView C0;
    public TextView D0;
    public final Handler x0 = new Handler(Looper.getMainLooper());
    public final androidx.activity.i y0 = new androidx.activity.i(this, 1);
    public a0 z0;

    @Override // androidx.fragment.app.s
    public final void E() {
        this.R = true;
        this.x0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.s
    public final void F() {
        this.R = true;
        a0 a0Var = this.z0;
        a0Var.y = 0;
        a0Var.f(1);
        this.z0.e(q(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        p2.v vVar = new p2.v(K());
        x5.k kVar = this.z0.f;
        CharSequence charSequence = null;
        CharSequence charSequence2 = kVar != null ? (CharSequence) kVar.b : null;
        g.c cVar = (g.c) vVar.c;
        cVar.d = charSequence2;
        View inflate = LayoutInflater.from(cVar.a).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            this.z0.getClass();
            if (TextUtils.isEmpty(null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            x5.k kVar2 = this.z0.f;
            CharSequence charSequence3 = kVar2 != null ? (CharSequence) kVar2.c : null;
            if (TextUtils.isEmpty(charSequence3)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence3);
            }
        }
        this.C0 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.D0 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (s1.a(this.z0.c())) {
            charSequence = q(R.string.confirm_device_credential_password);
        } else {
            a0 a0Var = this.z0;
            String str = a0Var.k;
            if (str != null) {
                charSequence = str;
            } else {
                x5.k kVar3 = a0Var.f;
                if (kVar3 != null && (charSequence = (CharSequence) kVar3.d) == null) {
                    charSequence = "";
                }
            }
        }
        z zVar = new z(this);
        cVar.f = charSequence;
        cVar.g = zVar;
        cVar.k = inflate;
        g.f d = vVar.d();
        d.setCanceledOnTouchOutside(false);
        return d;
    }

    public final int P(int i10) {
        Context n10 = n();
        androidx.fragment.app.v k10 = k();
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

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a0 a0Var = this.z0;
        if (a0Var.x == null) {
            a0Var.x = new androidx.lifecycle.z();
        }
        a0.h(a0Var.x, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.s
    public final void z(Bundle bundle) {
        super.z(bundle);
        androidx.fragment.app.v k10 = k();
        if (k10 != null) {
            a0 a0Var = (a0) new e(k10).m(a0.class);
            this.z0 = a0Var;
            if (a0Var.z == null) {
                a0Var.z = new androidx.lifecycle.z();
            }
            a0Var.z.d(this, new f0(this, r0));
            a0 a0Var2 = this.z0;
            if (a0Var2.A == null) {
                a0Var2.A = new androidx.lifecycle.z();
            }
            a0Var2.A.d(this, new ja.c(this));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.A0 = P(h0.a());
        } else {
            Context n10 = n();
            this.A0 = n10 != null ? f0.e.c(n10, R.color.biometric_error_color) : 0;
        }
        this.B0 = P(android.R.attr.textColorSecondary);
    }
}
