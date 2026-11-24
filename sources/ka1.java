// default package

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class ka1 {
    public static boolean a;

    public static void a(int i, ArrayList arrayList, boolean z) {
        qd2 qd2Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || i <= 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(3);
        int i2 = 0;
        if (z && sharedInstance.mutedByAdmin()) {
            qd2 qd2Var2 = sharedInstance.groupCall;
            TLRPC.GroupCallParticipant groupCallParticipant = qd2Var2 != null ? (TLRPC.GroupCallParticipant) qd2Var2.d.f(sharedInstance.getSelfId()) : null;
            boolean z2 = (groupCallParticipant == null || groupCallParticipant.raise_hand_rating == 0) ? false : true;
            arrayList2.add(new ja1(new uc8(1, R.drawable.msg_voice_muted, jb6.M0(z2 ? 2131743078 : 2131742974, null), !z2), 100, 0));
        } else if (sharedInstance.isMicMute()) {
            arrayList2.add(new ja1(new uc8(1, R.drawable.msg_voice_muted, jb6.M0(2131742914, null), true), 100, 0));
        } else {
            arrayList2.add(new ja1(new uc8(1, R.drawable.msg_voice_unmuted, jb6.M0(2131742977, null), true), 100, 0));
        }
        int videoState = sharedInstance.getVideoState(false);
        if (videoState == 2) {
            arrayList2.add(new ja1(new uc8(2, R.drawable.pip_camera_on, jb6.M0(2131742921, null), true), 90, 1));
        } else if (a || videoState == 1) {
            arrayList2.add(new ja1(new uc8(2, R.drawable.pip_camera_off, jb6.M0(2131742922, null), a.b.checkSelfPermission("android.permission.CAMERA") == 0 && (!z || ((qd2Var = sharedInstance.groupCall) != null && qd2Var.c()))), 60, 1));
        }
        arrayList2.add(new ja1(new uc8(3, R.drawable.msg_endcall, jb6.M0(z ? 2131743048 : 2131743096, null), true), 80, 2));
        Collections.sort(arrayList2, new sa((byte) 15));
        while (arrayList2.size() > i) {
            td4.w(1, arrayList2);
        }
        Collections.sort(arrayList2, new sa((byte) 16));
        int size = arrayList2.size();
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(((ja1) obj).a);
        }
    }

    public static void b(int i, boolean z) {
        qd2 qd2Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (e21.a) {
                StringBuilder l = hg9.l(i, "call pip: action ", ", camera ");
                l.append(sharedInstance.getVideoState(false));
                l.append(", mic muted ");
                l.append(sharedInstance.isMicMute());
                fc4.b(l.toString());
            }
            if (i == 1) {
                if (z && sharedInstance.mutedByAdmin()) {
                    sharedInstance.editCallMember(z8c.h(sharedInstance.getAccount()).f(), null, null, null, Boolean.TRUE, null);
                    return;
                } else {
                    sharedInstance.setMicMute(!sharedInstance.isMicMute(), false, true);
                    return;
                }
            }
            if (i != 2) {
                if (i == 3) {
                    if (z) {
                        g95.l1(a.b, null, false, true);
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
                if (!z || ((qd2Var = sharedInstance.groupCall) != null && qd2Var.c())) {
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
