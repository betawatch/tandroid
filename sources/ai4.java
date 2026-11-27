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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class ai4 extends tf3 {
    public final Handler B0 = new Handler(Looper.getMainLooper());
    public final zz3 C0 = new zz3(this, 4);
    public mj0 D0;
    public int E0;
    public int F0;
    public ImageView G0;
    public TextView H0;

    @Override // gp4
    public final void E() {
        this.V = true;
        this.B0.removeCallbacksAndMessages(null);
    }

    @Override // gp4
    public final void F() {
        this.V = true;
        mj0 mj0Var = this.D0;
        mj0Var.w = 0;
        mj0Var.d(1);
        mj0 mj0Var2 = this.D0;
        String q = q(R.string.fingerprint_dialog_touch_sensor);
        qj7 qj7Var = mj0Var2.y;
        if (qj7Var == null) {
            qj7Var = new qj7();
            mj0Var2.y = qj7Var;
        }
        mj0.f(qj7Var, q);
    }

    @Override // tf3
    public final Dialog P() {
        ed edVar = new ed(K(), (byte) 0);
        ij0 ij0Var = this.D0.d;
        String str = null;
        String str2 = ij0Var != null ? ij0Var.a : null;
        qc qcVar = (qc) edVar.c;
        qcVar.f = str2;
        View inflate = LayoutInflater.from((ContextThemeWrapper) qcVar.c).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            this.D0.getClass();
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            ij0 ij0Var2 = this.D0.d;
            String str3 = ij0Var2 != null ? ij0Var2.b : null;
            if (TextUtils.isEmpty(str3)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str3);
            }
        }
        this.G0 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.H0 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (nrd.b(this.D0.c())) {
            str = q(R.string.confirm_device_credential_password);
        } else {
            mj0 mj0Var = this.D0;
            String str4 = mj0Var.i;
            if (str4 != null) {
                str = str4;
            } else {
                ij0 ij0Var3 = mj0Var.d;
                if (ij0Var3 != null && (str = ij0Var3.c) == null) {
                    str = "";
                }
            }
        }
        lj0 lj0Var = new lj0(this);
        qcVar.g = str;
        qcVar.j = lj0Var;
        qcVar.i = inflate;
        jd a0 = edVar.a0();
        a0.setCanceledOnTouchOutside(false);
        return a0;
    }

    public final int Q(int i) {
        Context n = n();
        jp4 k = k();
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

    @Override // tf3, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        mj0 mj0Var = this.D0;
        qj7 qj7Var = mj0Var.v;
        if (qj7Var == null) {
            qj7Var = new qj7();
            mj0Var.v = qj7Var;
        }
        mj0.f(qj7Var, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tf3, gp4
    public final void z(Bundle bundle) {
        super.z(bundle);
        jp4 k = k();
        Object[] objArr = 0;
        if (k != null) {
            mj0 mj0Var = (mj0) new pq8(k).n(mj0.class);
            this.D0 = mj0Var;
            qj7 qj7Var = mj0Var.x;
            if (qj7Var == null) {
                qj7Var = new qj7();
                mj0Var.x = qj7Var;
            }
            qj7Var.d(this, new xh4((Object) this, (byte) (objArr == true ? 1 : 0)));
            mj0 mj0Var2 = this.D0;
            qj7 qj7Var2 = mj0Var2.y;
            if (qj7Var2 == null) {
                qj7Var2 = new qj7();
                mj0Var2.y = qj7Var2;
            }
            qj7Var2.d(this, new aj3((Object) this, (byte) 4));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.E0 = Q(zh4.a());
        } else {
            Context n = n();
            this.E0 = n != null ? n.getColor(R.color.biometric_error_color) : 0;
        }
        this.F0 = Q(android.R.attr.textColorSecondary);
    }
}
