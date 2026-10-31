package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class f5 extends androidx.fragment.app.v {
    public int O = -1;

    public final boolean u(int i10, String[] strArr, int[] iArr) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        boolean z10 = iArr.length > 0 && iArr[0] == 0;
        if (i10 == 104) {
            if (!z10) {
                w(R.raw.permission_request_camera, org.telegram.messenger.cd.L0(2131743311, null));
                return true;
            }
            b50 b50Var = b50.u5;
            if (b50Var != null) {
                b50Var.o1.callOnClick();
                return true;
            }
        } else {
            if (i10 == 4 || i10 == 151) {
                if (z10) {
                    org.telegram.messenger.hc.D().i(null);
                    return true;
                }
                w(R.raw.permission_request_folder, i10 == 151 ? org.telegram.messenger.cd.L0(2131747317, null) : org.telegram.messenger.cd.L0(2131747315, null));
                return true;
            }
            if (i10 == 5) {
                if (z10) {
                    org.telegram.messenger.i5.r(this.O).l();
                    return true;
                }
                w(R.raw.permission_request_contacts, org.telegram.messenger.cd.L0(2131747322, null));
                return false;
            }
            if (i10 == 3 || i10 == 150) {
                int min = Math.min(strArr.length, iArr.length);
                boolean z11 = true;
                boolean z12 = true;
                for (int i11 = 0; i11 < min; i11++) {
                    if ("android.permission.RECORD_AUDIO".equals(strArr[i11])) {
                        z11 = iArr[i11] == 0;
                    } else if ("android.permission.CAMERA".equals(strArr[i11])) {
                        z12 = iArr[i11] == 0;
                    }
                }
                if (i10 == 150 && (!z11 || !z12)) {
                    w(R.raw.permission_request_camera, org.telegram.messenger.cd.L0(2131747325, null));
                    return true;
                }
                if (!z11) {
                    w(R.raw.permission_request_microphone, org.telegram.messenger.cd.L0(2131747327, null));
                    return true;
                }
                if (!z12) {
                    w(R.raw.permission_request_camera, org.telegram.messenger.cd.L0(2131747324, null));
                    return true;
                }
                if (org.telegram.messenger.tz.y0) {
                    CameraController.getInstance().initCamera(null);
                }
                return false;
            }
            if (i10 != 18 && i10 != 19 && i10 != 20 && i10 != 22) {
                int i12 = org.telegram.messenger.zs.w4;
                int i13 = org.telegram.messenger.zs.v4;
                if (i10 == 2) {
                    org.telegram.messenger.zs e = org.telegram.messenger.zs.e();
                    if (z10) {
                        i12 = i13;
                    }
                    e.k(i12, new Object[0]);
                    return true;
                }
                if (i10 == 211) {
                    org.telegram.messenger.zs e7 = org.telegram.messenger.zs.e();
                    if (z10) {
                        i12 = i13;
                    }
                    e7.k(i12, 1);
                    return true;
                }
            } else if (!z10) {
                w(R.raw.permission_request_camera, org.telegram.messenger.cd.L0(2131747324, null));
            }
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.x1 v(int i10, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        int i11 = org.telegram.ui.ActionBar.t6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.t6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(str);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.T = W2;
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747316, null), new y0(this, 4));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751772, null), null);
        return x1Var;
    }

    public final void w(int i10, String str) {
        v(i10, str).show();
    }
}
