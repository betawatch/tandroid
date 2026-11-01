package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n20 implements View.OnClickListener {
    public final m4 a = new m4(this, 6);
    public final /* synthetic */ a50 b;

    public n20(a50 a50Var) {
        this.b = a50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.q30 q30Var;
        int i10;
        a50 a50Var = this.b;
        l20 l20Var = a50Var.t1;
        ArrayList arrayList = a50Var.h2;
        org.telegram.ui.Components.voip.c2 c2Var = a50Var.s1;
        org.telegram.ui.Components.ci0 ci0Var = a50Var.B2;
        org.telegram.messenger.c cVar = a50Var.k1;
        if (a50Var.R2 == null || a50Var.w3 == 3) {
            return;
        }
        final int i11 = 0;
        final int i12 = 1;
        if (a50Var.t1() && !a50Var.R2.j()) {
            x20 x20Var = a50Var.R3;
            if (x20Var != null && x20Var.b && (org.telegram.messenger.i0.Q1() || a50.w5 == a50Var.s1())) {
                a50Var.g1(null);
                if (a50.w5) {
                    org.telegram.messenger.i0.h3(new yy(this, 6), 200L);
                }
                a50Var.Z1.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            org.telegram.messenger.v3 v3Var = (org.telegram.messenger.v3) arrayList.get(0);
            if (org.telegram.messenger.i0.Q1()) {
                a50Var.g1(v3Var);
                return;
            }
            if (a50.w5 == a50Var.s1()) {
                a50Var.g1(v3Var);
            }
            if (a50Var.s1()) {
                a50Var.Z1.setRequestedOrientation(6);
                return;
            } else {
                a50Var.Z1.setRequestedOrientation(1);
                return;
            }
        }
        int i13 = a50Var.w3;
        if (i13 == 5) {
            if (a50Var.y3) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            a50Var.y3 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            org.telegram.messenger.u3 u3Var = a50Var.R2;
            startscheduledgroupcall.call = u3Var.g(u3Var.a);
            ConnectionsManager.getInstance(cVar.a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.m20
                public final /* synthetic */ n20 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            n20 n20Var = this.b;
                            if (tLObject == null) {
                                n20Var.getClass();
                                break;
                            } else {
                                org.telegram.messenger.wp.r1(n20Var.b.k1.a).L3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            n20 n20Var2 = this.b;
                            if (tLObject == null) {
                                n20Var2.getClass();
                                break;
                            } else {
                                org.telegram.messenger.wp.r1(n20Var2.b.k1.a).L3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i13 == 7 || i13 == 6) {
            if (i13 == 6 && (q30Var = a50Var.e2) != null) {
                q30Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            org.telegram.messenger.u3 u3Var2 = a50Var.R2;
            togglegroupcallstartsubscription.call = u3Var2.g(u3Var2.a);
            TLRPC.GroupCall groupCall = a50Var.R2.b;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            ConnectionsManager.getInstance(cVar.a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.m20
                public final /* synthetic */ n20 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            n20 n20Var = this.b;
                            if (tLObject == null) {
                                n20Var.getClass();
                                break;
                            } else {
                                org.telegram.messenger.wp.r1(n20Var.b.k1.a).L3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            n20 n20Var2 = this.b;
                            if (tLObject == null) {
                                n20Var2.getClass();
                                break;
                            } else {
                                org.telegram.messenger.wp.r1(n20Var2.b.k1.a).L3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            a50Var.M1(a50Var.R2.b.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = a50Var.K3) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i14 = a50Var.w3;
        if (i14 != 2 && i14 != 4) {
            try {
                if (i14 != 0) {
                    a50Var.M1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    c2Var.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = a50Var.Z1;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    w7.c6.c(R.raw.permission_request_microphone, 2131743309, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ag.z0(15));
                    return;
                }
                a50Var.M1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                c2Var.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (a50Var.q1() || a50Var.C2) {
            return;
        }
        a50Var.C2 = true;
        org.telegram.messenger.i0.E3(c2Var.getTextView());
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused3) {
        }
        int nextInt = Utilities.b.nextInt(100);
        int i15 = 120;
        if (nextInt >= 32) {
            i11 = org.telegram.messenger.at.P3;
            if (nextInt >= 64) {
                i15 = 420;
                if (nextInt >= 97) {
                    i11 = 540;
                    if (nextInt != 98) {
                        i15 = 720;
                    }
                }
            }
            int i16 = i11;
            i11 = i15;
            i15 = i16;
        }
        ci0Var.P(i15);
        ci0Var.S(i15 - 1, this.a);
        l20Var.setAnimation(ci0Var);
        ci0Var.M(i11);
        l20Var.d();
        if (a50Var.w3 == 2) {
            long C1 = org.telegram.messenger.kj.C1(((TLRPC.GroupCallParticipant) a50Var.R2.d.f(org.telegram.messenger.kj.C1(a50Var.r2))).peer);
            VoIPService.getSharedInstance().editCallMember(org.telegram.messenger.o5.E(C1) ? org.telegram.messenger.wp.r1(cVar.a).Z1(Long.valueOf(C1)) : org.telegram.messenger.wp.r1(cVar.a).L0(Long.valueOf(-C1)), null, null, null, Boolean.TRUE, null);
            a50Var.M1(4, true);
        }
    }
}
