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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q10 implements View.OnClickListener {
    public final m4 a = new m4(this, 6);
    public final /* synthetic */ e40 b;

    public q10(e40 e40Var) {
        this.b = e40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.z20 z20Var;
        int i7;
        e40 e40Var = this.b;
        o10 o10Var = e40Var.t1;
        ArrayList arrayList = e40Var.h2;
        org.telegram.ui.Components.voip.n2 n2Var = e40Var.s1;
        org.telegram.ui.Components.ah0 ah0Var = e40Var.B2;
        org.telegram.messenger.c cVar = e40Var.k1;
        if (e40Var.R2 == null || e40Var.w3 == 3) {
            return;
        }
        final int i10 = 0;
        final int i11 = 1;
        if (e40Var.u1() && !e40Var.R2.j()) {
            b20 b20Var = e40Var.R3;
            if (b20Var != null && b20Var.b && (org.telegram.messenger.g0.Q1() || e40.w5 == e40Var.t1())) {
                e40Var.h1(null);
                if (e40.w5) {
                    org.telegram.messenger.g0.i3(new jz(this, 5), 200L);
                }
                e40Var.Z1.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(0);
            if (org.telegram.messenger.g0.Q1()) {
                e40Var.h1(s3Var);
                return;
            }
            if (e40.w5 == e40Var.t1()) {
                e40Var.h1(s3Var);
            }
            if (e40Var.t1()) {
                e40Var.Z1.setRequestedOrientation(6);
                return;
            } else {
                e40Var.Z1.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = e40Var.w3;
        if (i12 == 5) {
            if (e40Var.y3) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            e40Var.y3 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            org.telegram.messenger.r3 r3Var = e40Var.R2;
            startscheduledgroupcall.call = r3Var.g(r3Var.a);
            ConnectionsManager.getInstance(cVar.a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.p10
                public final /* synthetic */ q10 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            q10 q10Var = this.b;
                            if (tLObject == null) {
                                q10Var.getClass();
                                break;
                            } else {
                                org.telegram.messenger.qp.s1(q10Var.b.k1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            q10 q10Var2 = this.b;
                            if (tLObject == null) {
                                q10Var2.getClass();
                                break;
                            } else {
                                org.telegram.messenger.qp.s1(q10Var2.b.k1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (z20Var = e40Var.e2) != null) {
                z20Var.a();
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            org.telegram.messenger.r3 r3Var2 = e40Var.R2;
            togglegroupcallstartsubscription.call = r3Var2.g(r3Var2.a);
            TLRPC.GroupCall groupCall = e40Var.R2.b;
            boolean z9 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z9;
            togglegroupcallstartsubscription.subscribed = z9;
            ConnectionsManager.getInstance(cVar.a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.p10
                public final /* synthetic */ q10 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            q10 q10Var = this.b;
                            if (tLObject == null) {
                                q10Var.getClass();
                                break;
                            } else {
                                org.telegram.messenger.qp.s1(q10Var.b.k1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            q10 q10Var2 = this.b;
                            if (tLObject == null) {
                                q10Var2.getClass();
                                break;
                            } else {
                                org.telegram.messenger.qp.s1(q10Var2.b.k1.a).O3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            e40Var.P1(e40Var.R2.b.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i7 = e40Var.K3) == 1 || i7 == 2 || i7 == 6 || i7 == 5) {
            return;
        }
        int i13 = e40Var.w3;
        if (i13 != 2 && i13 != 4) {
            try {
                if (i13 != 0) {
                    e40Var.P1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    n2Var.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = e40Var.Z1;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    c8.ia.c(R.raw.permission_request_microphone, 2131743283, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new di.e(17));
                    return;
                }
                e40Var.P1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                n2Var.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (e40Var.r1() || e40Var.C2) {
            return;
        }
        e40Var.C2 = true;
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
        ah0Var.P(i14);
        ah0Var.S(i14 - 1, this.a);
        o10Var.setAnimation(ah0Var);
        ah0Var.M(i10);
        o10Var.d();
        if (e40Var.w3 == 2) {
            long B1 = org.telegram.messenger.ij.B1(((TLRPC.GroupCallParticipant) e40Var.R2.d.f(org.telegram.messenger.ij.B1(e40Var.r2))).peer);
            VoIPService.getSharedInstance().editCallMember(org.telegram.messenger.m5.E(B1) ? org.telegram.messenger.qp.s1(cVar.a).a2(Long.valueOf(B1)) : org.telegram.messenger.qp.s1(cVar.a).M0(Long.valueOf(-B1)), null, null, null, Boolean.TRUE, null);
            e40Var.P1(4, true);
        }
    }
}
