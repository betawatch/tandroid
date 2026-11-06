package org.telegram.ui.Components.voip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.r3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c40;
import org.telegram.ui.oe;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class g {
    public static boolean a;

    public static void a(int i7, List list, boolean z9) {
        r3 r3Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || i7 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(3);
        int i10 = 0;
        if (z9 && sharedInstance.mutedByAdmin()) {
            r3 r3Var2 = sharedInstance.groupCall;
            TLRPC.GroupCallParticipant groupCallParticipant = r3Var2 != null ? (TLRPC.GroupCallParticipant) r3Var2.d.f(sharedInstance.getSelfId()) : null;
            boolean z10 = (groupCallParticipant == null || groupCallParticipant.raise_hand_rating == 0) ? false : true;
            arrayList.add(new f(new ti.l(1, R.drawable.msg_voice_muted, hd.M0(z10 ? 2131743395 : 2131743291, null), !z10), 100, 0));
        } else if (sharedInstance.isMicMute()) {
            arrayList.add(new f(new ti.l(1, R.drawable.msg_voice_muted, hd.M0(2131743231, null), true), 100, 0));
        } else {
            arrayList.add(new f(new ti.l(1, R.drawable.msg_voice_unmuted, hd.M0(2131743294, null), true), 100, 0));
        }
        int videoState = sharedInstance.getVideoState(false);
        if (videoState == 2) {
            arrayList.add(new f(new ti.l(2, R.drawable.pip_camera_on, hd.M0(2131743238, null), true), 90, 1));
        } else if (a || videoState == 1) {
            arrayList.add(new f(new ti.l(2, R.drawable.pip_camera_off, hd.M0(2131743239, null), org.telegram.messenger.t0.b.checkSelfPermission("android.permission.CAMERA") == 0 && (!z9 || ((r3Var = sharedInstance.groupCall) != null && r3Var.c()))), 60, 1));
        }
        arrayList.add(new f(new ti.l(3, R.drawable.msg_endcall, hd.M0(z9 ? 2131743365 : 2131743413, null), true), 80, 2));
        Collections.sort(arrayList, new oe(20));
        while (arrayList.size() > i7) {
            a8.p0.z(1, arrayList);
        }
        Collections.sort(arrayList, new oe(21));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            list.add(((f) obj).a);
        }
    }

    public static void b(int i7, boolean z9) {
        r3 r3Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (org.telegram.messenger.r2.a) {
            StringBuilder n10 = jg.g.n(i7, "call pip: action ", ", camera ");
            n10.append(sharedInstance.getVideoState(false));
            n10.append(", mic muted ");
            n10.append(sharedInstance.isMicMute());
            a8.b(n10.toString());
        }
        if (i7 == 1) {
            if (z9 && sharedInstance.mutedByAdmin()) {
                sharedInstance.editCallMember(p10.i(sharedInstance.getAccount()).f(), null, null, null, Boolean.TRUE, null);
                return;
            } else {
                sharedInstance.setMicMute(!sharedInstance.isMicMute(), false, true);
                return;
            }
        }
        if (i7 != 2) {
            if (i7 == 3) {
                if (z9) {
                    c40.w1(org.telegram.messenger.t0.b, null, false, true);
                    return;
                } else {
                    sharedInstance.hangUp();
                    return;
                }
            }
            return;
        }
        int videoState = sharedInstance.getVideoState(false);
        if (videoState == 2) {
            sharedInstance.setVideoState(false, 0);
            return;
        }
        if (org.telegram.messenger.t0.b.checkSelfPermission("android.permission.CAMERA") != 0) {
            return;
        }
        if (!z9 || ((r3Var = sharedInstance.groupCall) != null && r3Var.c())) {
            if (videoState == 0) {
                sharedInstance.createCaptureDevice(false);
                sharedInstance.requestVideoCall(false);
            }
            sharedInstance.setVideoState(false, 2);
        }
    }

    public static long c() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return 0L;
        }
        return (((sharedInstance.getVideoState(false) * 2) + (sharedInstance.isMicMute() ? 1L : 0L)) * 2) + (sharedInstance.mutedByAdmin() ? 1L : 0L);
    }
}
