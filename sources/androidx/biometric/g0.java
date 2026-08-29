package androidx.biometric;

import ag.o1;
import ag.q1;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class g0 extends androidx.fragment.app.p {
    public int A0;
    public ImageView B0;
    public TextView C0;
    public final Handler w0 = new Handler(Looper.getMainLooper());
    public final q1 x0 = new q1(this, 2);
    public z y0;
    public int z0;

    @Override // androidx.fragment.app.s
    public final void E() {
        this.Q = true;
        this.w0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.s
    public final void F() {
        this.Q = true;
        z zVar = this.y0;
        zVar.y = 0;
        zVar.f(1);
        this.y0.e(q(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        p2.u uVar = new p2.u(K());
        v5.l lVar = this.y0.f;
        CharSequence charSequence = null;
        CharSequence charSequence2 = lVar != null ? (CharSequence) lVar.b : null;
        g.c cVar = (g.c) uVar.c;
        cVar.d = charSequence2;
        View inflate = LayoutInflater.from(cVar.a).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
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
            v5.l lVar2 = this.y0.f;
            CharSequence charSequence3 = lVar2 != null ? (CharSequence) lVar2.c : null;
            if (TextUtils.isEmpty(charSequence3)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence3);
            }
        }
        this.B0 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.C0 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (h7.u.a(this.y0.c())) {
            charSequence = q(R.string.confirm_device_credential_password);
        } else {
            z zVar = this.y0;
            String str = zVar.k;
            if (str != null) {
                charSequence = str;
            } else {
                v5.l lVar3 = zVar.f;
                if (lVar3 != null && (charSequence = (CharSequence) lVar3.d) == null) {
                    charSequence = "";
                }
            }
        }
        y yVar = new y(this);
        cVar.f = charSequence;
        cVar.g = yVar;
        cVar.k = inflate;
        g.f d = uVar.d();
        d.setCanceledOnTouchOutside(false);
        return d;
    }

    public final int P(int i10) {
        Context n10 = n();
        androidx.fragment.app.v k9 = k();
        if (n10 == null || k9 == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        n10.getTheme().resolveAttribute(i10, typedValue, true);
        TypedArray obtainStyledAttributes = k9.obtainStyledAttributes(typedValue.data, new int[]{i10});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        z zVar = this.y0;
        if (zVar.x == null) {
            zVar.x = new androidx.lifecycle.z();
        }
        z.h(zVar.x, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.s
    public final void z(Bundle bundle) {
        super.z(bundle);
        androidx.fragment.app.v k9 = k();
        if (k9 != null) {
            z zVar = (z) new e(k9).l(z.class);
            this.y0 = zVar;
            if (zVar.z == null) {
                zVar.z = new androidx.lifecycle.z();
            }
            zVar.z.d(this, new m5.i(this, 2));
            z zVar2 = this.y0;
            if (zVar2.A == null) {
                zVar2.A = new androidx.lifecycle.z();
            }
            zVar2.A.d(this, new o1(this, 1));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.z0 = P(f0.a());
        } else {
            Context n10 = n();
            this.z0 = n10 != null ? f0.e.c(n10, R.color.biometric_error_color) : 0;
        }
        this.A0 = P(android.R.attr.textColorSecondary);
    }
}
