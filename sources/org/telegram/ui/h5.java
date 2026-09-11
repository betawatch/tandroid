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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class h5 extends androidx.fragment.app.u {
    public int O = -1;

    public final boolean v(int i10, String[] strArr, int[] iArr) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        boolean z10 = iArr.length > 0 && iArr[0] == 0;
        if (i10 == 104) {
            if (!z10) {
                x(R.raw.permission_request_camera, LocaleController.getString(R.string.VoipNeedCameraPermission));
                return true;
            }
            j60 j60Var = j60.D3;
            if (j60Var != null) {
                j60Var.n.callOnClick();
                return true;
            }
        } else {
            if (i10 == 4 || i10 == 151) {
                if (z10) {
                    ImageLoader.getInstance().checkMediaPaths();
                    return true;
                }
                x(R.raw.permission_request_folder, i10 == 151 ? LocaleController.getString(R.string.PermissionNoStorageAvatar) : LocaleController.getString(R.string.PermissionStorageWithHint));
                return true;
            }
            if (i10 == 5) {
                if (z10) {
                    ContactsController.getInstance(this.O).forceImportContacts();
                    return true;
                }
                x(R.raw.permission_request_contacts, LocaleController.getString(R.string.PermissionNoContactsSharing));
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
            if (i10 != 18 && i10 != 19 && i10 != 20 && i10 != 22) {
                if (i10 == 2) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.locationPermissionGranted : NotificationCenter.locationPermissionDenied, new Object[0]);
                    return true;
                }
                if (i10 == 211) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.locationPermissionGranted : NotificationCenter.locationPermissionDenied, 1);
                    return true;
                }
            } else if (!z10) {
                x(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraWithHint));
            }
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.b2 w(int i10, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(str);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new z0(this, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.a;
    }

    public final void x(int i10, String str) {
        w(i10, str).show();
    }
}
