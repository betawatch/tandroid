package org.telegram.ui.Components.voip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.f40;
import org.telegram.ui.pe;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class g {
    public static boolean a;

    public static void a(int i7, List list, boolean z10) {
        t3 t3Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || i7 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(3);
        int i10 = 0;
        if (z10 && sharedInstance.mutedByAdmin()) {
            t3 t3Var2 = sharedInstance.groupCall;
            TLRPC.GroupCallParticipant groupCallParticipant = t3Var2 != null ? (TLRPC.GroupCallParticipant) t3Var2.d.f(sharedInstance.getSelfId()) : null;
            boolean z11 = (groupCallParticipant == null || groupCallParticipant.raise_hand_rating == 0) ? false : true;
            arrayList.add(new f(new wi.k(1, R.drawable.msg_voice_muted, hd.N0(z11 ? 2131743149 : 2131743045, null), !z11), 100, 0));
        } else if (sharedInstance.isMicMute()) {
            arrayList.add(new f(new wi.k(1, R.drawable.msg_voice_muted, hd.N0(2131742985, null), true), 100, 0));
        } else {
            arrayList.add(new f(new wi.k(1, R.drawable.msg_voice_unmuted, hd.N0(2131743048, null), true), 100, 0));
        }
        int videoState = sharedInstance.getVideoState(false);
        if (videoState == 2) {
            arrayList.add(new f(new wi.k(2, R.drawable.pip_camera_on, hd.N0(2131742992, null), true), 90, 1));
        } else if (a || videoState == 1) {
            arrayList.add(new f(new wi.k(2, R.drawable.pip_camera_off, hd.N0(2131742993, null), org.telegram.messenger.t0.b.checkSelfPermission("android.permission.CAMERA") == 0 && (!z10 || ((t3Var = sharedInstance.groupCall) != null && t3Var.c()))), 60, 1));
        }
        arrayList.add(new f(new wi.k(3, R.drawable.msg_endcall, hd.N0(z10 ? 2131743119 : 2131743167, null), true), 80, 2));
        Collections.sort(arrayList, new pe(19));
        while (arrayList.size() > i7) {
            a8.p0.z(1, arrayList);
        }
        Collections.sort(arrayList, new pe(20));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            list.add(((f) obj).a);
        }
    }

    public static void b(int i7, boolean z10) {
        t3 t3Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (org.telegram.messenger.s2.a) {
            StringBuilder m10 = i5.c.m(i7, "call pip: action ", ", camera ");
            m10.append(sharedInstance.getVideoState(false));
            m10.append(", mic muted ");
            m10.append(sharedInstance.isMicMute());
            a8.b(m10.toString());
        }
        if (i7 == 1) {
            if (z10 && sharedInstance.mutedByAdmin()) {
                sharedInstance.editCallMember(k10.i(sharedInstance.getAccount()).f(), null, null, null, Boolean.TRUE, null);
                return;
            } else {
                sharedInstance.setMicMute(!sharedInstance.isMicMute(), false, true);
                return;
            }
        }
        if (i7 != 2) {
            if (i7 == 3) {
                if (z10) {
                    f40.x1(org.telegram.messenger.t0.b, null, false, true);
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
        if (!z10 || ((t3Var = sharedInstance.groupCall) != null && t3Var.c())) {
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
