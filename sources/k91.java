// default package

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class k91 {
    public static boolean a;

    public static void a(int i, ArrayList arrayList, boolean z) {
        vc2 vc2Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || i <= 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(3);
        int i2 = 0;
        if (z && sharedInstance.mutedByAdmin()) {
            vc2 vc2Var2 = sharedInstance.groupCall;
            TLRPC.GroupCallParticipant groupCallParticipant = vc2Var2 != null ? (TLRPC.GroupCallParticipant) vc2Var2.d.f(sharedInstance.getSelfId()) : null;
            boolean z2 = (groupCallParticipant == null || groupCallParticipant.raise_hand_rating == 0) ? false : true;
            arrayList2.add(new j91(new ie8(1, R.drawable.msg_voice_muted, ob6.M0(z2 ? 2131743046 : 2131742942, null), !z2), 100, 0));
        } else if (sharedInstance.isMicMute()) {
            arrayList2.add(new j91(new ie8(1, R.drawable.msg_voice_muted, ob6.M0(2131742882, null), true), 100, 0));
        } else {
            arrayList2.add(new j91(new ie8(1, R.drawable.msg_voice_unmuted, ob6.M0(2131742945, null), true), 100, 0));
        }
        int videoState = sharedInstance.getVideoState(false);
        if (videoState == 2) {
            arrayList2.add(new j91(new ie8(2, R.drawable.pip_camera_on, ob6.M0(2131742889, null), true), 90, 1));
        } else if (a || videoState == 1) {
            arrayList2.add(new j91(new ie8(2, R.drawable.pip_camera_off, ob6.M0(2131742890, null), a.b.checkSelfPermission("android.permission.CAMERA") == 0 && (!z || ((vc2Var = sharedInstance.groupCall) != null && vc2Var.c()))), 60, 1));
        }
        arrayList2.add(new j91(new ie8(3, R.drawable.msg_endcall, ob6.M0(z ? 2131743016 : 2131743064, null), true), 80, 2));
        Collections.sort(arrayList2, new ta((byte) 15));
        while (arrayList2.size() > i) {
            qd4.v(1, arrayList2);
        }
        Collections.sort(arrayList2, new ta((byte) 16));
        int size = arrayList2.size();
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(((j91) obj).a);
        }
    }

    public static void b(int i, boolean z) {
        vc2 vc2Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (f11.a) {
                StringBuilder m = uh9.m(i, "call pip: action ", ", camera ");
                m.append(sharedInstance.getVideoState(false));
                m.append(", mic muted ");
                m.append(sharedInstance.isMicMute());
                cc4.b(m.toString());
            }
            if (i == 1) {
                if (z && sharedInstance.mutedByAdmin()) {
                    sharedInstance.editCallMember(yac.h(sharedInstance.getAccount()).f(), null, null, null, Boolean.TRUE, null);
                    return;
                } else {
                    sharedInstance.setMicMute(!sharedInstance.isMicMute(), false, true);
                    return;
                }
            }
            if (i != 2) {
                if (i == 3) {
                    if (z) {
                        j95.m1(a.b, null, false, true);
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
            if (a.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                if (!z || ((vc2Var = sharedInstance.groupCall) != null && vc2Var.c())) {
                    if (videoState == 0) {
                        sharedInstance.createCaptureDevice(false);
                        sharedInstance.requestVideoCall(false);
                    }
                    sharedInstance.setVideoState(false, 2);
                }
            }
        }
    }

    public static long c() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return 0L;
        }
        return (((sharedInstance.getVideoState(false) << 1) + (sharedInstance.isMicMute() ? 1L : 0L)) << 1) + (sharedInstance.mutedByAdmin() ? 1L : 0L);
    }
}
