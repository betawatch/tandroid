package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class VoIPPermissionActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean isVideo;
        super.onCreate(bundle);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
            isVideo = phoneCall != null && phoneCall.video;
        } else {
            isVideo = VoIPPreNotificationService.isVideo();
        }
        ArrayList arrayList = new ArrayList();
        if (checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (isVideo && checkSelfPermission("android.permission.CAMERA") != 0) {
            arrayList.add("android.permission.CAMERA");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            requestPermissions((String[]) arrayList.toArray(new String[0]), isVideo ? 102 : 101);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 == 101 || i10 == 102) {
            boolean z4 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= iArr.length) {
                    z4 = true;
                    break;
                } else if (iArr[i11] != 0) {
                    break;
                } else {
                    i11++;
                }
            }
            if (iArr.length > 0 && z4) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().acceptIncomingCall();
                } else {
                    VoIPPreNotificationService.answer(this);
                }
                finish();
                startActivity(new Intent(this, (Class<?>) LaunchActivity.class).setAction("voip"));
                return;
            }
            if (shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                finish();
                return;
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().declineIncomingCall();
            } else {
                VoIPPreNotificationService.decline(this, 1);
            }
            org.telegram.ui.Components.voip.g2.h(this, new sz0(this, 25), i10);
        }
    }
}
