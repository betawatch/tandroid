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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class h0 extends androidx.fragment.app.p {
    public int A0;
    public int B0;
    public ImageView C0;
    public TextView D0;
    public final Handler x0 = new Handler(Looper.getMainLooper());
    public final androidx.activity.i y0 = new androidx.activity.i(this, 1);
    public z z0;

    @Override // androidx.fragment.app.s
    public final void E() {
        this.R = true;
        this.x0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.s
    public final void F() {
        this.R = true;
        z zVar = this.z0;
        zVar.y = 0;
        zVar.f(1);
        this.z0.e(q(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        p2.w wVar = new p2.w(K());
        x5.k kVar = this.z0.f;
        CharSequence charSequence = null;
        CharSequence charSequence2 = kVar != null ? (CharSequence) kVar.b : null;
        g.c cVar = (g.c) wVar.c;
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
        if (com.google.android.gms.internal.cast.n.a(this.z0.c())) {
            charSequence = q(R.string.confirm_device_credential_password);
        } else {
            z zVar = this.z0;
            String str = zVar.k;
            if (str != null) {
                charSequence = str;
            } else {
                x5.k kVar3 = zVar.f;
                if (kVar3 != null && (charSequence = (CharSequence) kVar3.d) == null) {
                    charSequence = "";
                }
            }
        }
        y yVar = new y(this);
        cVar.f = charSequence;
        cVar.g = yVar;
        cVar.k = inflate;
        g.f f10 = wVar.f();
        f10.setCanceledOnTouchOutside(false);
        return f10;
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
        z zVar = this.z0;
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
            z zVar = (z) new af.d(k10).m(z.class);
            this.z0 = zVar;
            if (zVar.z == null) {
                zVar.z = new androidx.lifecycle.z();
            }
            zVar.z.d(this, new e0(this, r0));
            z zVar2 = this.z0;
            if (zVar2.A == null) {
                zVar2.A = new androidx.lifecycle.z();
            }
            zVar2.A.d(this, new bb.b(this, 1));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.A0 = P(g0.a());
        } else {
            Context n10 = n();
            this.A0 = n10 != null ? f0.f.c(n10, R.color.biometric_error_color) : 0;
        }
        this.B0 = P(android.R.attr.textColorSecondary);
    }
}
