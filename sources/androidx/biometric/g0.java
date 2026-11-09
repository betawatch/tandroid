package androidx.biometric;

import a8.k1;
import a8.ra;
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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class g0 extends androidx.fragment.app.o {
    public final Handler A0 = new Handler(Looper.getMainLooper());
    public final ra B0 = new ra(this, 3);
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
        f5.u uVar = new f5.u(K());
        m6.n nVar = this.C0.f;
        Object obj = null;
        CharSequence charSequence = nVar != null ? (CharSequence) nVar.b : null;
        g.b bVar = (g.b) uVar.c;
        bVar.f = charSequence;
        View inflate = LayoutInflater.from((ContextThemeWrapper) bVar.c).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
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
            m6.n nVar2 = this.C0.f;
            CharSequence charSequence2 = nVar2 != null ? (CharSequence) nVar2.c : null;
            if (TextUtils.isEmpty(charSequence2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence2);
            }
        }
        this.F0 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.G0 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (k1.a(this.C0.c())) {
            obj = q(R.string.confirm_device_credential_password);
        } else {
            z zVar = this.C0;
            String str = zVar.k;
            if (str != null) {
                obj = str;
            } else {
                m6.n nVar3 = zVar.f;
                if (nVar3 != null && (obj = (CharSequence) nVar3.d) == null) {
                    obj = "";
                }
            }
        }
        y yVar = new y(this);
        bVar.g = obj;
        bVar.j = yVar;
        bVar.i = inflate;
        g.f g10 = uVar.g();
        g10.setCanceledOnTouchOutside(false);
        return g10;
    }

    public final int P(int i7) {
        Context n10 = n();
        androidx.fragment.app.u k10 = k();
        if (n10 == null || k10 == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        n10.getTheme().resolveAttribute(i7, typedValue, true);
        TypedArray obtainStyledAttributes = k10.obtainStyledAttributes(typedValue.data, new int[]{i7});
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
            z zVar = (z) new android.support.v4.media.session.a0(k10).i(z.class);
            this.C0 = zVar;
            if (zVar.z == null) {
                zVar.z = new androidx.lifecycle.z();
            }
            zVar.z.d(this, new d6.i(this, 6));
            z zVar2 = this.C0;
            if (zVar2.A == null) {
                zVar2.A = new androidx.lifecycle.z();
            }
            zVar2.A.d(this, new aa.n(this, 2));
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
