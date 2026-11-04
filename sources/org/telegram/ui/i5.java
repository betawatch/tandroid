package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class i5 extends androidx.fragment.app.v {
    public int P = -1;

    public final boolean u(int i3, String[] strArr, int[] iArr) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        boolean z10 = iArr.length > 0 && iArr[0] == 0;
        if (i3 == 104) {
            if (!z10) {
                w(R.raw.permission_request_camera, org.telegram.messenger.bd.M0(2131743295, null));
                return true;
            }
            x30 x30Var = x30.v5;
            if (x30Var != null) {
                x30Var.p1.callOnClick();
                return true;
            }
        } else {
            if (i3 == 4 || i3 == 151) {
                if (z10) {
                    org.telegram.messenger.zb.D().i(null);
                    return true;
                }
                w(R.raw.permission_request_folder, i3 == 151 ? org.telegram.messenger.bd.M0(2131747309, null) : org.telegram.messenger.bd.M0(2131747307, null));
                return true;
            }
            if (i3 == 5) {
                if (z10) {
                    org.telegram.messenger.g5.r(this.P).l();
                    return true;
                }
                w(R.raw.permission_request_contacts, org.telegram.messenger.bd.M0(2131747314, null));
                return false;
            }
            if (i3 == 3 || i3 == 150) {
                int min = Math.min(strArr.length, iArr.length);
                boolean z11 = true;
                boolean z12 = true;
                for (int i10 = 0; i10 < min; i10++) {
                    if ("android.permission.RECORD_AUDIO".equals(strArr[i10])) {
                        z11 = iArr[i10] == 0;
                    } else if ("android.permission.CAMERA".equals(strArr[i10])) {
                        z12 = iArr[i10] == 0;
                    }
                }
                if (i3 == 150 && (!z11 || !z12)) {
                    w(R.raw.permission_request_camera, org.telegram.messenger.bd.M0(2131747317, null));
                    return true;
                }
                if (!z11) {
                    w(R.raw.permission_request_microphone, org.telegram.messenger.bd.M0(2131747319, null));
                    return true;
                }
                if (!z12) {
                    w(R.raw.permission_request_camera, org.telegram.messenger.bd.M0(2131747316, null));
                    return true;
                }
                if (org.telegram.messenger.az.y0) {
                    CameraController.getInstance().initCamera(null);
                }
                return false;
            }
            if (i3 != 18 && i3 != 19 && i3 != 20 && i3 != 22) {
                int i11 = org.telegram.messenger.hs.w4;
                int i12 = org.telegram.messenger.hs.v4;
                if (i3 == 2) {
                    org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
                    if (z10) {
                        i11 = i12;
                    }
                    e10.k(i11, new Object[0]);
                    return true;
                }
                if (i3 == 211) {
                    org.telegram.messenger.hs e11 = org.telegram.messenger.hs.e();
                    if (z10) {
                        i11 = i12;
                    }
                    e11.k(i11, 1);
                    return true;
                }
            } else if (!z10) {
                w(R.raw.permission_request_camera, org.telegram.messenger.bd.M0(2131747316, null));
            }
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.s1 v(int i3, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        int i10 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(i3, 72, org.telegram.ui.ActionBar.k6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(str);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.U = X2;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new x0(this, 4));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
        return s1Var;
    }

    public final void w(int i3, String str) {
        v(i3, str).show();
    }
}
