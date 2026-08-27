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
import com.google.android.gms.internal.play_billing.r1;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class f0 extends androidx.fragment.app.p {
    public int A0;
    public ImageView B0;
    public TextView C0;
    public final Handler w0 = new Handler(Looper.getMainLooper());
    public final a8.b x0 = new a8.b(this, 3);
    public y y0;
    public int z0;

    @Override // androidx.fragment.app.s
    public final void E() {
        this.Q = true;
        this.w0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.s
    public final void F() {
        this.Q = true;
        y yVar = this.y0;
        yVar.y = 0;
        yVar.f(1);
        this.y0.e(q(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        n2.v vVar = new n2.v(K());
        u5.k kVar = this.y0.f;
        CharSequence charSequence = null;
        CharSequence charSequence2 = kVar != null ? (CharSequence) kVar.b : null;
        g.d dVar = (g.d) vVar.c;
        dVar.d = charSequence2;
        View inflate = LayoutInflater.from(dVar.a).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            this.y0.getClass();
            if (TextUtils.isEmpty(null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            u5.k kVar2 = this.y0.f;
            CharSequence charSequence3 = kVar2 != null ? (CharSequence) kVar2.c : null;
            if (TextUtils.isEmpty(charSequence3)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence3);
            }
        }
        this.B0 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.C0 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (r1.a(this.y0.c())) {
            charSequence = q(R.string.confirm_device_credential_password);
        } else {
            y yVar = this.y0;
            String str = yVar.k;
            if (str != null) {
                charSequence = str;
            } else {
                u5.k kVar3 = yVar.f;
                if (kVar3 != null && (charSequence = (CharSequence) kVar3.d) == null) {
                    charSequence = "";
                }
            }
        }
        x xVar = new x(this);
        dVar.f = charSequence;
        dVar.g = xVar;
        dVar.k = inflate;
        g.g d = vVar.d();
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
        y yVar = this.y0;
        if (yVar.x == null) {
            yVar.x = new androidx.lifecycle.z();
        }
        y.h(yVar.x, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.s
    public final void z(Bundle bundle) {
        super.z(bundle);
        androidx.fragment.app.v k10 = k();
        if (k10 != null) {
            y yVar = (y) new a5.n(k10).l(y.class);
            this.y0 = yVar;
            if (yVar.z == null) {
                yVar.z = new androidx.lifecycle.z();
            }
            yVar.z.d(this, new ae.b(this, 1));
            y yVar2 = this.y0;
            if (yVar2.A == null) {
                yVar2.A = new androidx.lifecycle.z();
            }
            yVar2.A.d(this, new ga.c(this, 2));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.z0 = P(e0.a());
        } else {
            Context n10 = n();
            this.z0 = n10 != null ? f0.e.c(n10, R.color.biometric_error_color) : 0;
        }
        this.A0 = P(android.R.attr.textColorSecondary);
    }
}
