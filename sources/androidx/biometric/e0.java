package androidx.biometric;

import a8.h0;
import a8.z0;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class e0 extends androidx.fragment.app.o {
    public final Handler A0 = new Handler(Looper.getMainLooper());
    public final a5.d B0 = new a5.d(this, 5);
    public x C0;
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
        x xVar = this.C0;
        xVar.y = 0;
        xVar.f(1);
        this.C0.e(q(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.o
    public final Dialog O() {
        d5.z zVar = new d5.z(K());
        k6.m mVar = this.C0.f;
        CharSequence charSequence = null;
        CharSequence charSequence2 = mVar != null ? (CharSequence) mVar.b : null;
        g.b bVar = (g.b) zVar.c;
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
            k6.m mVar2 = this.C0.f;
            CharSequence charSequence3 = mVar2 != null ? (CharSequence) mVar2.c : null;
            if (TextUtils.isEmpty(charSequence3)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence3);
            }
        }
        this.F0 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.G0 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (z0.a(this.C0.c())) {
            charSequence = q(R.string.confirm_device_credential_password);
        } else {
            x xVar = this.C0;
            String str = xVar.k;
            if (str != null) {
                charSequence = str;
            } else {
                k6.m mVar3 = xVar.f;
                if (mVar3 != null && (charSequence = (CharSequence) mVar3.d) == null) {
                    charSequence = "";
                }
            }
        }
        w wVar = new w(this);
        bVar.f = charSequence;
        bVar.g = wVar;
        bVar.k = inflate;
        g.f f7 = zVar.f();
        f7.setCanceledOnTouchOutside(false);
        return f7;
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
        x xVar = this.C0;
        if (xVar.x == null) {
            xVar.x = new androidx.lifecycle.z();
        }
        x.h(xVar.x, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void z(Bundle bundle) {
        super.z(bundle);
        androidx.fragment.app.u k10 = k();
        if (k10 != null) {
            x xVar = (x) new h0(k10).m(x.class);
            this.C0 = xVar;
            if (xVar.z == null) {
                xVar.z = new androidx.lifecycle.z();
            }
            xVar.z.d(this, new za.c(this, 2));
            x xVar2 = this.C0;
            if (xVar2.A == null) {
                xVar2.A = new androidx.lifecycle.z();
            }
            xVar2.A.d(this, new b6.i(this, 3));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.D0 = P(d0.a());
        } else {
            Context n10 = n();
            this.D0 = n10 != null ? n10.getColor(R.color.biometric_error_color) : 0;
        }
        this.E0 = P(android.R.attr.textColorSecondary);
    }
}
