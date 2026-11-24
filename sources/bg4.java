// default package

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
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class bg4 extends ze3 {
    public final Handler B0 = new Handler(Looper.getMainLooper());
    public final ez3 C0 = new ez3(this, 4);
    public lj0 D0;
    public int E0;
    public int F0;
    public ImageView G0;
    public TextView H0;

    @Override // bn4
    public final void E() {
        this.V = true;
        this.B0.removeCallbacksAndMessages(null);
    }

    @Override // bn4
    public final void F() {
        this.V = true;
        lj0 lj0Var = this.D0;
        lj0Var.w = 0;
        lj0Var.d(1);
        lj0 lj0Var2 = this.D0;
        String q = q(R.string.fingerprint_dialog_touch_sensor);
        hh7 hh7Var = lj0Var2.y;
        if (hh7Var == null) {
            hh7Var = new hh7();
            lj0Var2.y = hh7Var;
        }
        lj0.f(hh7Var, q);
    }

    @Override // ze3
    public final Dialog P() {
        dd ddVar = new dd(K(), (byte) 0);
        hj0 hj0Var = this.D0.d;
        String str = null;
        String str2 = hj0Var != null ? hj0Var.a : null;
        pc pcVar = (pc) ddVar.c;
        pcVar.f = str2;
        View inflate = LayoutInflater.from((ContextThemeWrapper) pcVar.c).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            this.D0.getClass();
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            hj0 hj0Var2 = this.D0.d;
            String str3 = hj0Var2 != null ? hj0Var2.b : null;
            if (TextUtils.isEmpty(str3)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str3);
            }
        }
        this.G0 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.H0 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (wmd.b(this.D0.c())) {
            str = q(R.string.confirm_device_credential_password);
        } else {
            lj0 lj0Var = this.D0;
            String str4 = lj0Var.i;
            if (str4 != null) {
                str = str4;
            } else {
                hj0 hj0Var3 = lj0Var.d;
                if (hj0Var3 != null && (str = hj0Var3.c) == null) {
                    str = "";
                }
            }
        }
        kj0 kj0Var = new kj0(this);
        pcVar.g = str;
        pcVar.j = kj0Var;
        pcVar.i = inflate;
        id Z = ddVar.Z();
        Z.setCanceledOnTouchOutside(false);
        return Z;
    }

    public final int Q(int i) {
        Context n = n();
        en4 k = k();
        if (n == null || k == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        n.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = k.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    @Override // ze3, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        lj0 lj0Var = this.D0;
        hh7 hh7Var = lj0Var.v;
        if (hh7Var == null) {
            hh7Var = new hh7();
            lj0Var.v = hh7Var;
        }
        lj0.f(hh7Var, Boolean.TRUE);
    }

    @Override // ze3, bn4
    public final void z(Bundle bundle) {
        super.z(bundle);
        en4 k = k();
        if (k != null) {
            lj0 lj0Var = (lj0) new g29(k).k(lj0.class);
            this.D0 = lj0Var;
            hh7 hh7Var = lj0Var.x;
            if (hh7Var == null) {
                hh7Var = new hh7();
                lj0Var.x = hh7Var;
            }
            hh7Var.d(this, new z24((Object) this, (byte) 2));
            lj0 lj0Var2 = this.D0;
            hh7 hh7Var2 = lj0Var2.y;
            if (hh7Var2 == null) {
                hh7Var2 = new hh7();
                lj0Var2.y = hh7Var2;
            }
            hh7Var2.d(this, new s34((Object) this, (byte) 1));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.E0 = Q(ag4.a());
        } else {
            Context n = n();
            this.E0 = n != null ? n.getColor(R.color.biometric_error_color) : 0;
        }
        this.F0 = Q(android.R.attr.textColorSecondary);
    }
}
