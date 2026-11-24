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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class di4 extends mg3 {
    public final Handler B0 = new Handler(Looper.getMainLooper());
    public final o04 C0 = new o04(this, 4);
    public lk0 D0;
    public int E0;
    public int F0;
    public ImageView G0;
    public TextView H0;

    @Override // dp4
    public final void E() {
        this.V = true;
        this.B0.removeCallbacksAndMessages(null);
    }

    @Override // dp4
    public final void F() {
        this.V = true;
        lk0 lk0Var = this.D0;
        lk0Var.w = 0;
        lk0Var.d(1);
        lk0 lk0Var2 = this.D0;
        String q = q(R.string.fingerprint_dialog_touch_sensor);
        kj7 kj7Var = lk0Var2.y;
        if (kj7Var == null) {
            kj7Var = new kj7();
            lk0Var2.y = kj7Var;
        }
        lk0.f(kj7Var, q);
    }

    @Override // mg3
    public final Dialog P() {
        de deVar = new de(K(), (byte) 0);
        hk0 hk0Var = this.D0.d;
        String str = null;
        String str2 = hk0Var != null ? hk0Var.a : null;
        pd pdVar = (pd) deVar.c;
        pdVar.f = str2;
        View inflate = LayoutInflater.from((ContextThemeWrapper) pdVar.c).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            this.D0.getClass();
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            hk0 hk0Var2 = this.D0.d;
            String str3 = hk0Var2 != null ? hk0Var2.b : null;
            if (TextUtils.isEmpty(str3)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str3);
            }
        }
        this.G0 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.H0 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (zod.b(this.D0.c())) {
            str = q(R.string.confirm_device_credential_password);
        } else {
            lk0 lk0Var = this.D0;
            String str4 = lk0Var.i;
            if (str4 != null) {
                str = str4;
            } else {
                hk0 hk0Var3 = lk0Var.d;
                if (hk0Var3 != null && (str = hk0Var3.c) == null) {
                    str = "";
                }
            }
        }
        kk0 kk0Var = new kk0(this);
        pdVar.g = str;
        pdVar.j = kk0Var;
        pdVar.i = inflate;
        ie a0 = deVar.a0();
        a0.setCanceledOnTouchOutside(false);
        return a0;
    }

    public final int Q(int i) {
        Context n = n();
        gp4 k = k();
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

    @Override // mg3, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        lk0 lk0Var = this.D0;
        kj7 kj7Var = lk0Var.v;
        if (kj7Var == null) {
            kj7Var = new kj7();
            lk0Var.v = kj7Var;
        }
        lk0.f(kj7Var, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mg3, dp4
    public final void z(Bundle bundle) {
        super.z(bundle);
        gp4 k = k();
        Object[] objArr = 0;
        if (k != null) {
            lk0 lk0Var = (lk0) new et8(k).l(lk0.class);
            this.D0 = lk0Var;
            kj7 kj7Var = lk0Var.x;
            if (kj7Var == null) {
                kj7Var = new kj7();
                lk0Var.x = kj7Var;
            }
            kj7Var.d(this, new ai4((Object) this, (byte) (objArr == true ? 1 : 0)));
            lk0 lk0Var2 = this.D0;
            kj7 kj7Var2 = lk0Var2.y;
            if (kj7Var2 == null) {
                kj7Var2 = new kj7();
                lk0Var2.y = kj7Var2;
            }
            kj7Var2.d(this, new fk3(this));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.E0 = Q(ci4.a());
        } else {
            Context n = n();
            this.E0 = n != null ? n.getColor(R.color.biometric_error_color) : 0;
        }
        this.F0 = Q(android.R.attr.textColorSecondary);
    }
}
