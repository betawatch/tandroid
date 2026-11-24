// default package

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class b91 {
    public static boolean a;

    public static void a(int i, ArrayList arrayList, boolean z) {
        fc2 fc2Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || i <= 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(3);
        int i2 = 0;
        if (z && sharedInstance.mutedByAdmin()) {
            fc2 fc2Var2 = sharedInstance.groupCall;
            TLRPC.GroupCallParticipant groupCallParticipant = fc2Var2 != null ? (TLRPC.GroupCallParticipant) fc2Var2.d.f(sharedInstance.getSelfId()) : null;
            boolean z2 = (groupCallParticipant == null || groupCallParticipant.raise_hand_rating == 0) ? false : true;
            arrayList2.add(new a91(new ra8(1, R.drawable.msg_voice_muted, k96.M0(z2 ? 2131743152 : 2131743048, null), !z2), 100, 0));
        } else if (sharedInstance.isMicMute()) {
            arrayList2.add(new a91(new ra8(1, R.drawable.msg_voice_muted, k96.M0(2131742988, null), true), 100, 0));
        } else {
            arrayList2.add(new a91(new ra8(1, R.drawable.msg_voice_unmuted, k96.M0(2131743051, null), true), 100, 0));
        }
        int videoState = sharedInstance.getVideoState(false);
        if (videoState == 2) {
            arrayList2.add(new a91(new ra8(2, R.drawable.pip_camera_on, k96.M0(2131742995, null), true), 90, 1));
        } else if (a || videoState == 1) {
            arrayList2.add(new a91(new ra8(2, R.drawable.pip_camera_off, k96.M0(2131742996, null), a.b.checkSelfPermission("android.permission.CAMERA") == 0 && (!z || ((fc2Var = sharedInstance.groupCall) != null && fc2Var.c()))), 60, 1));
        }
        arrayList2.add(new a91(new ra8(3, R.drawable.msg_endcall, k96.M0(z ? 2131743122 : 2131743170, null), true), 80, 2));
        Collections.sort(arrayList2, new sa((byte) 15));
        while (arrayList2.size() > i) {
            tb4.v(1, arrayList2);
        }
        Collections.sort(arrayList2, new sa((byte) 16));
        int size = arrayList2.size();
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(((a91) obj).a);
        }
    }

    public static void b(int i, boolean z) {
        fc2 fc2Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (w01.a) {
                StringBuilder m = de9.m(i, "call pip: action ", ", camera ");
                m.append(sharedInstance.getVideoState(false));
                m.append(", mic muted ");
                m.append(sharedInstance.isMicMute());
                fa4.b(m.toString());
            }
            if (i == 1) {
                if (z && sharedInstance.mutedByAdmin()) {
                    sharedInstance.editCallMember(y6c.h(sharedInstance.getAccount()).f(), null, null, null, Boolean.TRUE, null);
                    return;
                } else {
                    sharedInstance.setMicMute(!sharedInstance.isMicMute(), false, true);
                    return;
                }
            }
            if (i != 2) {
                if (i == 3) {
                    if (z) {
                        h75.l1(a.b, null, false, true);
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
                if (!z || ((fc2Var = sharedInstance.groupCall) != null && fc2Var.c())) {
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
