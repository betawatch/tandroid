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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class o30 implements View.OnClickListener {
    public final w5 a = new w5(this, 5);
    public final /* synthetic */ g60 b;

    public o30(g60 g60Var) {
        this.b = g60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.z40 z40Var;
        int i10;
        g60 g60Var = this.b;
        m30 m30Var = g60Var.x;
        ArrayList arrayList = g60Var.q0;
        org.telegram.ui.Components.voip.v2 v2Var = g60Var.w;
        org.telegram.ui.Components.ck0 ck0Var = g60Var.K0;
        AccountInstance accountInstance = g60Var.d;
        if (g60Var.a1 == null || g60Var.F1 == 3) {
            return;
        }
        int i11 = 0;
        if (g60Var.s1() && !g60Var.a1.isScheduled()) {
            y30 y30Var = g60Var.a2;
            if (y30Var != null && y30Var.b && (AndroidUtilities.isTablet() || g60.F3 == g60Var.r1())) {
                g60Var.f1(null);
                if (g60.F3) {
                    AndroidUtilities.runOnUIThread(new uz(this, 6), 200L);
                }
                g60Var.i0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                g60Var.f1(videoParticipant);
                return;
            }
            if (g60.F3 == g60Var.r1()) {
                g60Var.f1(videoParticipant);
            }
            if (g60Var.r1()) {
                g60Var.i0.setRequestedOrientation(6);
                return;
            } else {
                g60Var.i0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = g60Var.F1;
        if (i12 == 5) {
            if (g60Var.H1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            g60Var.H1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = g60Var.a1.getInputGroupCall();
            final int i13 = 0;
            accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.n30
                public final /* synthetic */ o30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            o30 o30Var = this.b;
                            if (tLObject == null) {
                                o30Var.getClass();
                                break;
                            } else {
                                o30Var.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            o30 o30Var2 = this.b;
                            if (tLObject == null) {
                                o30Var2.getClass();
                                break;
                            } else {
                                o30Var2.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (z40Var = g60Var.n0) != null) {
                z40Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = g60Var.a1.getInputGroupCall();
            TLRPC.GroupCall groupCall = g60Var.a1.call;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            final int i14 = 1;
            accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.n30
                public final /* synthetic */ o30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i14) {
                        case 0:
                            o30 o30Var = this.b;
                            if (tLObject == null) {
                                o30Var.getClass();
                                break;
                            } else {
                                o30Var.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            o30 o30Var2 = this.b;
                            if (tLObject == null) {
                                o30Var2.getClass();
                                break;
                            } else {
                                o30Var2.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            g60Var.K1(g60Var.a1.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = g60Var.T1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = g60Var.F1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    g60Var.K1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    v2Var.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = g60Var.i0;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    org.telegram.ui.Components.ef0.c(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ai.i(16));
                    return;
                }
                g60Var.K1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                v2Var.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (g60Var.p1() || g60Var.L0) {
            return;
        }
        g60Var.L0 = true;
        AndroidUtilities.shakeView(v2Var.getTextView());
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
        ck0Var.P(i16);
        ck0Var.S(i16 - 1, this.a);
        m30Var.setAnimation(ck0Var);
        ck0Var.M(i11);
        m30Var.d();
        if (g60Var.F1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) g60Var.a1.participants.f(MessageObject.getPeerId(g60Var.A0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            g60Var.K1(4, true);
        }
    }
}
