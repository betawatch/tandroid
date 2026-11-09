package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class g5 extends androidx.fragment.app.u {
    public int O = -1;

    public final boolean u(int i7, String[] strArr, int[] iArr) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        boolean z9 = iArr.length > 0 && iArr[0] == 0;
        if (i7 == 104) {
            if (!z9) {
                w(R.raw.permission_request_camera, org.telegram.messenger.id.M0(2131743285, null));
                return true;
            }
            e40 e40Var = e40.u5;
            if (e40Var != null) {
                e40Var.o1.callOnClick();
                return true;
            }
        } else {
            if (i7 == 4 || i7 == 151) {
                if (z9) {
                    org.telegram.messenger.gc.D().i(null);
                    return true;
                }
                w(R.raw.permission_request_folder, i7 == 151 ? org.telegram.messenger.id.M0(2131747301, null) : org.telegram.messenger.id.M0(2131747299, null));
                return true;
            }
            if (i7 == 5) {
                if (z9) {
                    org.telegram.messenger.g5.r(this.O).l();
                    return true;
                }
                w(R.raw.permission_request_contacts, org.telegram.messenger.id.M0(2131747306, null));
                return false;
            }
            if (i7 == 3 || i7 == 150) {
                int min = Math.min(strArr.length, iArr.length);
                boolean z10 = true;
                boolean z11 = true;
                for (int i10 = 0; i10 < min; i10++) {
                    if ("android.permission.RECORD_AUDIO".equals(strArr[i10])) {
                        z10 = iArr[i10] == 0;
                    } else if ("android.permission.CAMERA".equals(strArr[i10])) {
                        z11 = iArr[i10] == 0;
                    }
                }
                if (i7 == 150 && (!z10 || !z11)) {
                    w(R.raw.permission_request_camera, org.telegram.messenger.id.M0(2131747309, null));
                    return true;
                }
                if (!z10) {
                    w(R.raw.permission_request_microphone, org.telegram.messenger.id.M0(2131747311, null));
                    return true;
                }
                if (!z11) {
                    w(R.raw.permission_request_camera, org.telegram.messenger.id.M0(2131747308, null));
                    return true;
                }
                if (org.telegram.messenger.iz.y0) {
                    CameraController.getInstance().initCamera(null);
                }
                return false;
            }
            if (i7 != 18 && i7 != 19 && i7 != 20 && i7 != 22) {
                int i11 = org.telegram.messenger.qs.w4;
                int i12 = org.telegram.messenger.qs.v4;
                if (i7 == 2) {
                    org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                    if (z9) {
                        i11 = i12;
                    }
                    e10.k(i11, new Object[0]);
                    return true;
                }
                if (i7 == 211) {
                    org.telegram.messenger.qs e11 = org.telegram.messenger.qs.e();
                    if (z9) {
                        i11 = i12;
                    }
                    e11.k(i11, 1);
                    return true;
                }
            } else if (!z9) {
                w(R.raw.permission_request_camera, org.telegram.messenger.id.M0(2131747308, null));
            }
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.u1 v(int i7, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        int i10 = org.telegram.ui.ActionBar.l6.L5;
        alertDialog$Builder.m(i7, 72, org.telegram.ui.ActionBar.l6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(str);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.T = X2;
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747300, null), new w0(this, 4));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751772, null), null);
        return u1Var;
    }

    public final void w(int i7, String str) {
        v(i7, str).show();
    }
}
