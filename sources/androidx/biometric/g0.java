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
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b8.k0;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class g0 extends androidx.fragment.app.p {
    public final Handler B0 = new Handler(Looper.getMainLooper());
    public final a3.o C0 = new a3.o(this, 2);
    public z D0;
    public int E0;
    public int F0;
    public ImageView G0;
    public TextView H0;

    @Override // androidx.fragment.app.s
    public final void E() {
        this.V = true;
        this.B0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.s
    public final void F() {
        this.V = true;
        z zVar = this.D0;
        zVar.y = 0;
        zVar.f(1);
        this.D0.e(q(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        e5.u uVar = new e5.u(K());
        l6.n nVar = this.D0.f;
        Object obj = null;
        CharSequence charSequence = nVar != null ? (CharSequence) nVar.b : null;
        g.b bVar = (g.b) uVar.c;
        bVar.f = charSequence;
        View inflate = LayoutInflater.from((ContextThemeWrapper) bVar.c).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            this.D0.getClass();
            if (TextUtils.isEmpty(null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            l6.n nVar2 = this.D0.f;
            CharSequence charSequence2 = nVar2 != null ? (CharSequence) nVar2.c : null;
            if (TextUtils.isEmpty(charSequence2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence2);
            }
        }
        this.G0 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.H0 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (k0.a(this.D0.c())) {
            obj = q(R.string.confirm_device_credential_password);
        } else {
            z zVar = this.D0;
            String str = zVar.k;
            if (str != null) {
                obj = str;
            } else {
                l6.n nVar3 = zVar.f;
                if (nVar3 != null && (obj = (CharSequence) nVar3.d) == null) {
                    obj = "";
                }
            }
        }
        y yVar = new y(this);
        bVar.g = obj;
        bVar.j = yVar;
        bVar.i = inflate;
        g.f e10 = uVar.e();
        e10.setCanceledOnTouchOutside(false);
        return e10;
    }

    public final int P(int i3) {
        Context n4 = n();
        androidx.fragment.app.v k10 = k();
        if (n4 == null || k10 == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        n4.getTheme().resolveAttribute(i3, typedValue, true);
        TypedArray obtainStyledAttributes = k10.obtainStyledAttributes(typedValue.data, new int[]{i3});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        z zVar = this.D0;
        if (zVar.x == null) {
            zVar.x = new androidx.lifecycle.z();
        }
        z.h(zVar.x, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.s
    public final void z(Bundle bundle) {
        super.z(bundle);
        androidx.fragment.app.v k10 = k();
        if (k10 != null) {
            z zVar = (z) new android.support.v4.media.session.a0(k10).h(z.class);
            this.D0 = zVar;
            if (zVar.z == null) {
                zVar.z = new androidx.lifecycle.z();
            }
            zVar.z.d(this, new bb.c(this, 3));
            z zVar2 = this.D0;
            if (zVar2.A == null) {
                zVar2.A = new androidx.lifecycle.z();
            }
            zVar2.A.d(this, new c6.i(this, 2));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.E0 = P(f0.a());
        } else {
            Context n4 = n();
            this.E0 = n4 != null ? n4.getColor(R.color.biometric_error_color) : 0;
        }
        this.F0 = P(android.R.attr.textColorSecondary);
    }
}
