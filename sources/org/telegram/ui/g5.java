package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class g5 extends androidx.fragment.app.v {
    public int P = -1;

    public final boolean u(int i7, String[] strArr, int[] iArr) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        boolean z10 = iArr.length > 0 && iArr[0] == 0;
        if (i7 == 104) {
            if (!z10) {
                w(R.raw.permission_request_camera, org.telegram.messenger.gd.N0(2131743035, null));
                return true;
            }
            e40 e40Var = e40.C5;
            if (e40Var != null) {
                e40Var.s1.callOnClick();
                return true;
            }
        } else {
            if (i7 == 4 || i7 == 151) {
                if (z10) {
                    org.telegram.messenger.ec.D().i(null);
                    return true;
                }
                w(R.raw.permission_request_folder, i7 == 151 ? org.telegram.messenger.gd.N0(2131747107, null) : org.telegram.messenger.gd.N0(2131747105, null));
                return true;
            }
            if (i7 == 5) {
                if (z10) {
                    org.telegram.messenger.i5.r(this.P).l();
                    return true;
                }
                w(R.raw.permission_request_contacts, org.telegram.messenger.gd.N0(2131747112, null));
                return false;
            }
            if (i7 == 3 || i7 == 150) {
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
                if (i7 == 150 && (!z11 || !z12)) {
                    w(R.raw.permission_request_camera, org.telegram.messenger.gd.N0(2131747115, null));
                    return true;
                }
                if (!z11) {
                    w(R.raw.permission_request_microphone, org.telegram.messenger.gd.N0(2131747117, null));
                    return true;
                }
                if (!z12) {
                    w(R.raw.permission_request_camera, org.telegram.messenger.gd.N0(2131747114, null));
                    return true;
                }
                if (org.telegram.messenger.bz.y0) {
                    CameraController.getInstance().initCamera(null);
                }
                return false;
            }
            if (i7 != 18 && i7 != 19 && i7 != 20 && i7 != 22) {
                int i11 = org.telegram.messenger.ks.z4;
                int i12 = org.telegram.messenger.ks.y4;
                if (i7 == 2) {
                    org.telegram.messenger.ks e10 = org.telegram.messenger.ks.e();
                    if (z10) {
                        i11 = i12;
                    }
                    e10.k(i11, new Object[0]);
                    return true;
                }
                if (i7 == 211) {
                    org.telegram.messenger.ks e11 = org.telegram.messenger.ks.e();
                    if (z10) {
                        i11 = i12;
                    }
                    e11.k(i11, 1);
                    return true;
                }
            } else if (!z10) {
                w(R.raw.permission_request_camera, org.telegram.messenger.gd.N0(2131747114, null));
            }
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.t1 v(int i7, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        int i10 = org.telegram.ui.ActionBar.n6.L5;
        alertDialog$Builder.m(i7, 72, org.telegram.ui.ActionBar.n6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(str);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.U = W2;
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747106, null), new w0(this, 4));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751760, null), null);
        return t1Var;
    }

    public final void w(int i7, String str) {
        v(i7, str).show();
    }
}
