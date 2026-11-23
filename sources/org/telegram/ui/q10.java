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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q10 implements View.OnClickListener {
    public final m4 a = new m4(this, 6);
    public final /* synthetic */ e40 b;

    public q10(e40 e40Var) {
        this.b = e40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.j30 j30Var;
        int i7;
        e40 e40Var = this.b;
        o10 o10Var = e40Var.x1;
        ArrayList arrayList = e40Var.l2;
        org.telegram.ui.Components.voip.r2 r2Var = e40Var.w1;
        org.telegram.ui.Components.nh0 nh0Var = e40Var.F2;
        org.telegram.messenger.c cVar = e40Var.o1;
        if (e40Var.V2 == null || e40Var.E3 == 3) {
            return;
        }
        final int i10 = 0;
        final int i11 = 1;
        if (e40Var.v1() && !e40Var.V2.j()) {
            a20 a20Var = e40Var.Z3;
            if (a20Var != null && a20Var.b && (org.telegram.messenger.g0.Q1() || e40.E5 == e40Var.u1())) {
                e40Var.i1(null);
                if (e40.E5) {
                    org.telegram.messenger.g0.h3(new kz(this, 5), 200L);
                }
                e40Var.d2.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) arrayList.get(0);
            if (org.telegram.messenger.g0.Q1()) {
                e40Var.i1(u3Var);
                return;
            }
            if (e40.E5 == e40Var.u1()) {
                e40Var.i1(u3Var);
            }
            if (e40Var.u1()) {
                e40Var.d2.setRequestedOrientation(6);
                return;
            } else {
                e40Var.d2.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = e40Var.E3;
        if (i12 == 5) {
            if (e40Var.G3) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            e40Var.G3 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            org.telegram.messenger.t3 t3Var = e40Var.V2;
            startscheduledgroupcall.call = t3Var.g(t3Var.a);
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
                                org.telegram.messenger.mp.u1(q10Var.b.o1.a).V3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            q10 q10Var2 = this.b;
                            if (tLObject == null) {
                                q10Var2.getClass();
                                break;
                            } else {
                                org.telegram.messenger.mp.u1(q10Var2.b.o1.a).V3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (j30Var = e40Var.i2) != null) {
                j30Var.a();
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            org.telegram.messenger.t3 t3Var2 = e40Var.V2;
            togglegroupcallstartsubscription.call = t3Var2.g(t3Var2.a);
            TLRPC.GroupCall groupCall = e40Var.V2.b;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
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
                                org.telegram.messenger.mp.u1(q10Var.b.o1.a).V3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            q10 q10Var2 = this.b;
                            if (tLObject == null) {
                                q10Var2.getClass();
                                break;
                            } else {
                                org.telegram.messenger.mp.u1(q10Var2.b.o1.a).V3((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            e40Var.R1(e40Var.V2.b.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i7 = e40Var.S3) == 1 || i7 == 2 || i7 == 6 || i7 == 5) {
            return;
        }
        int i13 = e40Var.E3;
        if (i13 != 2 && i13 != 4) {
            try {
                if (i13 != 0) {
                    e40Var.R1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    r2Var.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = e40Var.d2;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    c8.oa.c(R.raw.permission_request_microphone, 2131743033, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new fi.e(18));
                    return;
                }
                e40Var.R1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                r2Var.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (e40Var.s1() || e40Var.G2) {
            return;
        }
        e40Var.G2 = true;
        org.telegram.messenger.g0.D3(r2Var.getTextView());
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused3) {
        }
        int nextInt = Utilities.b.nextInt(100);
        int i14 = 120;
        if (nextInt >= 32) {
            i10 = org.telegram.messenger.ks.P3;
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
        nh0Var.P(i14);
        nh0Var.S(i14 - 1, this.a);
        o10Var.setAnimation(nh0Var);
        nh0Var.M(i10);
        o10Var.d();
        if (e40Var.E3 == 2) {
            long B1 = org.telegram.messenger.fj.B1(((TLRPC.GroupCallParticipant) e40Var.V2.d.f(org.telegram.messenger.fj.B1(e40Var.v2))).peer);
            VoIPService.getSharedInstance().editCallMember(org.telegram.messenger.n5.E(B1) ? org.telegram.messenger.mp.u1(cVar.a).c2(Long.valueOf(B1)) : org.telegram.messenger.mp.u1(cVar.a).O0(Long.valueOf(-B1)), null, null, null, Boolean.TRUE, null);
            e40Var.R1(4, true);
        }
    }
}
