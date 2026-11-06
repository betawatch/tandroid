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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class o10 implements View.OnClickListener {
    public final m4 a = new m4(this, 6);
    public final /* synthetic */ c40 b;

    public o10(c40 c40Var) {
        this.b = c40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.y20 y20Var;
        int i7;
        c40 c40Var = this.b;
        m10 m10Var = c40Var.t1;
        ArrayList arrayList = c40Var.h2;
        org.telegram.ui.Components.voip.n2 n2Var = c40Var.s1;
        org.telegram.ui.Components.zg0 zg0Var = c40Var.B2;
        org.telegram.messenger.c cVar = c40Var.k1;
        if (c40Var.R2 == null || c40Var.w3 == 3) {
            return;
        }
        final int i10 = 0;
        final int i11 = 1;
        if (c40Var.u1() && !c40Var.R2.j()) {
            z10 z10Var = c40Var.R3;
            if (z10Var != null && z10Var.b && (org.telegram.messenger.g0.Q1() || c40.w5 == c40Var.t1())) {
                c40Var.h1(null);
                if (c40.w5) {
                    org.telegram.messenger.g0.i3(new hz(this, 5), 200L);
                }
                c40Var.Z1.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(0);
            if (org.telegram.messenger.g0.Q1()) {
                c40Var.h1(s3Var);
                return;
            }
            if (c40.w5 == c40Var.t1()) {
                c40Var.h1(s3Var);
            }
            if (c40Var.t1()) {
                c40Var.Z1.setRequestedOrientation(6);
                return;
            } else {
                c40Var.Z1.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = c40Var.w3;
        if (i12 == 5) {
            if (c40Var.y3) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            c40Var.y3 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            org.telegram.messenger.r3 r3Var = c40Var.R2;
            startscheduledgroupcall.call = r3Var.g(r3Var.a);
            ConnectionsManager.getInstance(cVar.a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.n10
                public final /* synthetic */ o10 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            o10 o10Var = this.b;
                            if (tLObject == null) {
                                o10Var.getClass();
                                break;
                            } else {
                                org.telegram.messenger.qp.s1(o10Var.b.k1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            o10 o10Var2 = this.b;
                            if (tLObject == null) {
                                o10Var2.getClass();
                                break;
                            } else {
                                org.telegram.messenger.qp.s1(o10Var2.b.k1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (y20Var = c40Var.e2) != null) {
                y20Var.a();
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            org.telegram.messenger.r3 r3Var2 = c40Var.R2;
            togglegroupcallstartsubscription.call = r3Var2.g(r3Var2.a);
            TLRPC.GroupCall groupCall = c40Var.R2.b;
            boolean z9 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z9;
            togglegroupcallstartsubscription.subscribed = z9;
            ConnectionsManager.getInstance(cVar.a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.n10
                public final /* synthetic */ o10 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            o10 o10Var = this.b;
                            if (tLObject == null) {
                                o10Var.getClass();
                                break;
                            } else {
                                org.telegram.messenger.qp.s1(o10Var.b.k1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            o10 o10Var2 = this.b;
                            if (tLObject == null) {
                                o10Var2.getClass();
                                break;
                            } else {
                                org.telegram.messenger.qp.s1(o10Var2.b.k1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            c40Var.P1(c40Var.R2.b.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i7 = c40Var.K3) == 1 || i7 == 2 || i7 == 6 || i7 == 5) {
            return;
        }
        int i13 = c40Var.w3;
        if (i13 != 2 && i13 != 4) {
            try {
                if (i13 != 0) {
                    c40Var.P1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    n2Var.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = c40Var.Z1;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    c8.ia.c(R.raw.permission_request_microphone, 2131743284, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new di.e(17));
                    return;
                }
                c40Var.P1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                n2Var.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (c40Var.r1() || c40Var.C2) {
            return;
        }
        c40Var.C2 = true;
        org.telegram.messenger.g0.F3(n2Var.getTextView());
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused3) {
        }
        int nextInt = Utilities.b.nextInt(100);
        int i14 = 120;
        if (nextInt >= 32) {
            i10 = org.telegram.messenger.qs.P3;
            if (nextInt >= 64) {
                i14 = 420;
                if (nextInt >= 97) {
                    i10 = 540;
                    if (nextInt != 98) {
                        i14 = 720;
                    }
                }
            }
            int i15 = i10;
            i10 = i14;
            i14 = i15;
        }
        zg0Var.P(i14);
        zg0Var.S(i14 - 1, this.a);
        m10Var.setAnimation(zg0Var);
        zg0Var.M(i10);
        m10Var.d();
        if (c40Var.w3 == 2) {
            long C1 = org.telegram.messenger.ij.C1(((TLRPC.GroupCallParticipant) c40Var.R2.d.f(org.telegram.messenger.ij.C1(c40Var.r2))).peer);
            VoIPService.getSharedInstance().editCallMember(org.telegram.messenger.m5.E(C1) ? org.telegram.messenger.qp.s1(cVar.a).a2(Long.valueOf(C1)) : org.telegram.messenger.qp.s1(cVar.a).M0(Long.valueOf(-C1)), null, null, null, Boolean.TRUE, null);
            c40Var.P1(4, true);
        }
    }
}
