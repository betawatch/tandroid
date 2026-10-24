package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class a30 implements View.OnClickListener {
    public final z5 a = new z5(this, 5);
    public final /* synthetic */ u50 b;

    public a30(u50 u50Var) {
        this.b = u50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.r40 r40Var;
        int i10;
        u50 u50Var = this.b;
        y20 y20Var = u50Var.x;
        ArrayList arrayList = u50Var.q0;
        org.telegram.ui.Components.voip.t2 t2Var = u50Var.w;
        org.telegram.ui.Components.yj0 yj0Var = u50Var.K0;
        AccountInstance accountInstance = u50Var.d;
        if (u50Var.a1 == null || u50Var.F1 == 3) {
            return;
        }
        int i11 = 0;
        if (u50Var.r1() && !u50Var.a1.isScheduled()) {
            k30 k30Var = u50Var.a2;
            if (k30Var != null && k30Var.b && (AndroidUtilities.isTablet() || u50.F3 == u50Var.q1())) {
                u50Var.e1(null);
                if (u50.F3) {
                    AndroidUtilities.runOnUIThread(new fz(this, 6), 200L);
                }
                u50Var.i0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                u50Var.e1(videoParticipant);
                return;
            }
            if (u50.F3 == u50Var.q1()) {
                u50Var.e1(videoParticipant);
            }
            if (u50Var.q1()) {
                u50Var.i0.setRequestedOrientation(6);
                return;
            } else {
                u50Var.i0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = u50Var.F1;
        if (i12 == 5) {
            if (u50Var.H1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            u50Var.H1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = u50Var.a1.getInputGroupCall();
            final int i13 = 0;
            accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.z20
                public final /* synthetic */ a30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            a30 a30Var = this.b;
                            if (tLObject == null) {
                                a30Var.getClass();
                                break;
                            } else {
                                a30Var.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            a30 a30Var2 = this.b;
                            if (tLObject == null) {
                                a30Var2.getClass();
                                break;
                            } else {
                                a30Var2.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (r40Var = u50Var.n0) != null) {
                r40Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = u50Var.a1.getInputGroupCall();
            TLRPC.GroupCall groupCall = u50Var.a1.call;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            final int i14 = 1;
            accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.z20
                public final /* synthetic */ a30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i14) {
                        case 0:
                            a30 a30Var = this.b;
                            if (tLObject == null) {
                                a30Var.getClass();
                                break;
                            } else {
                                a30Var.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            a30 a30Var2 = this.b;
                            if (tLObject == null) {
                                a30Var2.getClass();
                                break;
                            } else {
                                a30Var2.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            u50Var.K1(u50Var.a1.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = u50Var.T1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = u50Var.F1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    u50Var.K1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    t2Var.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = u50Var.i0;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    org.telegram.ui.Components.af0.c(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ci.e(16));
                    return;
                }
                u50Var.K1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                t2Var.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (u50Var.o1() || u50Var.L0) {
            return;
        }
        u50Var.L0 = true;
        AndroidUtilities.shakeView(t2Var.getTextView());
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused3) {
        }
        int nextInt = Utilities.random.nextInt(100);
        int i16 = 120;
        if (nextInt >= 32) {
            i11 = 240;
            if (nextInt >= 64) {
                i16 = 420;
                if (nextInt >= 97) {
                    i11 = 540;
                    if (nextInt != 98) {
                        i16 = 720;
                    }
                }
            }
            int i17 = i11;
            i11 = i16;
            i16 = i17;
        }
        yj0Var.P(i16);
        yj0Var.S(i16 - 1, this.a);
        y20Var.setAnimation(yj0Var);
        yj0Var.M(i11);
        y20Var.d();
        if (u50Var.F1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) u50Var.a1.participants.f(MessageObject.getPeerId(u50Var.A0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            u50Var.K1(4, true);
        }
    }
}
