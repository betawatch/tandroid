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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k10 implements View.OnClickListener {
    public final o4 a = new o4(this, 6);
    public final /* synthetic */ x30 b;

    public k10(x30 x30Var) {
        this.b = x30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.u20 u20Var;
        int i3;
        x30 x30Var = this.b;
        i10 i10Var = x30Var.u1;
        ArrayList arrayList = x30Var.i2;
        org.telegram.ui.Components.voip.c2 c2Var = x30Var.t1;
        org.telegram.ui.Components.ch0 ch0Var = x30Var.C2;
        org.telegram.messenger.c cVar = x30Var.l1;
        if (x30Var.S2 == null || x30Var.x3 == 3) {
            return;
        }
        final int i10 = 0;
        final int i11 = 1;
        if (x30Var.t1() && !x30Var.S2.j()) {
            u10 u10Var = x30Var.S3;
            if (u10Var != null && u10Var.b && (org.telegram.messenger.g0.Q1() || x30.x5 == x30Var.s1())) {
                x30Var.g1(null);
                if (x30.x5) {
                    org.telegram.messenger.g0.i3(new fz(this, 5), 200L);
                }
                x30Var.a2.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(0);
            if (org.telegram.messenger.g0.Q1()) {
                x30Var.g1(s3Var);
                return;
            }
            if (x30.x5 == x30Var.s1()) {
                x30Var.g1(s3Var);
            }
            if (x30Var.s1()) {
                x30Var.a2.setRequestedOrientation(6);
                return;
            } else {
                x30Var.a2.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = x30Var.x3;
        if (i12 == 5) {
            if (x30Var.z3) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            x30Var.z3 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            org.telegram.messenger.r3 r3Var = x30Var.S2;
            startscheduledgroupcall.call = r3Var.g(r3Var.a);
            ConnectionsManager.getInstance(cVar.a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.j10
                public final /* synthetic */ k10 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            k10 k10Var = this.b;
                            if (tLObject == null) {
                                k10Var.getClass();
                                break;
                            } else {
                                org.telegram.messenger.hp.s1(k10Var.b.l1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            k10 k10Var2 = this.b;
                            if (tLObject == null) {
                                k10Var2.getClass();
                                break;
                            } else {
                                org.telegram.messenger.hp.s1(k10Var2.b.l1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (u20Var = x30Var.f2) != null) {
                u20Var.a();
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            org.telegram.messenger.r3 r3Var2 = x30Var.S2;
            togglegroupcallstartsubscription.call = r3Var2.g(r3Var2.a);
            TLRPC.GroupCall groupCall = x30Var.S2.b;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            ConnectionsManager.getInstance(cVar.a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.j10
                public final /* synthetic */ k10 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            k10 k10Var = this.b;
                            if (tLObject == null) {
                                k10Var.getClass();
                                break;
                            } else {
                                org.telegram.messenger.hp.s1(k10Var.b.l1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            k10 k10Var2 = this.b;
                            if (tLObject == null) {
                                k10Var2.getClass();
                                break;
                            } else {
                                org.telegram.messenger.hp.s1(k10Var2.b.l1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            x30Var.M1(x30Var.S2.b.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i3 = x30Var.L3) == 1 || i3 == 2 || i3 == 6 || i3 == 5) {
            return;
        }
        int i13 = x30Var.x3;
        if (i13 != 2 && i13 != 4) {
            try {
                if (i13 != 0) {
                    x30Var.M1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    c2Var.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = x30Var.a2;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    b8.nf.c(R.raw.permission_request_microphone, 2131743293, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ei.e(16));
                    return;
                }
                x30Var.M1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                c2Var.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (x30Var.q1() || x30Var.D2) {
            return;
        }
        x30Var.D2 = true;
        org.telegram.messenger.g0.F3(c2Var.getTextView());
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused3) {
        }
        int nextInt = Utilities.b.nextInt(100);
        int i14 = 120;
        if (nextInt >= 32) {
            i10 = org.telegram.messenger.hs.P3;
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
        ch0Var.P(i14);
        ch0Var.S(i14 - 1, this.a);
        i10Var.setAnimation(ch0Var);
        ch0Var.M(i10);
        i10Var.d();
        if (x30Var.x3 == 2) {
            long C1 = org.telegram.messenger.zi.C1(((TLRPC.GroupCallParticipant) x30Var.S2.d.f(org.telegram.messenger.zi.C1(x30Var.s2))).peer);
            VoIPService.getSharedInstance().editCallMember(org.telegram.messenger.m5.E(C1) ? org.telegram.messenger.hp.s1(cVar.a).a2(Long.valueOf(C1)) : org.telegram.messenger.hp.s1(cVar.a).M0(Long.valueOf(-C1)), null, null, null, Boolean.TRUE, null);
            x30Var.M1(4, true);
        }
    }
}
