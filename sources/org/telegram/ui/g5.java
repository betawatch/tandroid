package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class g5 extends androidx.fragment.app.v {
    public int K = -1;

    public final boolean u(int i9, String[] strArr, int[] iArr) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        boolean z10 = iArr.length > 0 && iArr[0] == 0;
        if (i9 == 104) {
            if (!z10) {
                x(R.raw.permission_request_camera, LocaleController.getString(R.string.VoipNeedCameraPermission));
                return true;
            }
            o50 o50Var = o50.z3;
            if (o50Var != null) {
                o50Var.n.callOnClick();
                return true;
            }
        } else {
            if (i9 == 4 || i9 == 151) {
                if (z10) {
                    ImageLoader.getInstance().checkMediaPaths();
                    return true;
                }
                x(R.raw.permission_request_folder, i9 == 151 ? LocaleController.getString(R.string.PermissionNoStorageAvatar) : LocaleController.getString(R.string.PermissionStorageWithHint));
                return true;
            }
            if (i9 == 5) {
                if (z10) {
                    ContactsController.getInstance(this.K).forceImportContacts();
                    return true;
                }
                x(R.raw.permission_request_contacts, LocaleController.getString(R.string.PermissionNoContactsSharing));
                return false;
            }
            if (i9 == 3 || i9 == 150) {
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
                if (i9 == 150 && (!z11 || !z12)) {
                    x(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraMicVideo));
                    return true;
                }
                if (!z11) {
                    x(R.raw.permission_request_microphone, LocaleController.getString(R.string.PermissionNoAudioWithHint));
                    return true;
                }
                if (!z12) {
                    x(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraWithHint));
                    return true;
                }
                if (SharedConfig.inappCamera) {
                    CameraController.getInstance().initCamera(null);
                }
                return false;
            }
            if (i9 != 18 && i9 != 19 && i9 != 20 && i9 != 22) {
                if (i9 == 2) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.locationPermissionGranted : NotificationCenter.locationPermissionDenied, new Object[0]);
                    return true;
                }
                if (i9 == 211) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.locationPermissionGranted : NotificationCenter.locationPermissionDenied, 1);
                    return true;
                }
            } else if (!z10) {
                x(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraWithHint));
            }
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.c2 w(int i9, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        alertDialog$Builder.m(i9, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
        alertDialog$Builder.a.P = AndroidUtilities.replaceTags(str);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new b1(this, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.a;
    }

    public final void x(int i9, String str) {
        w(i9, str).show();
    }
}
