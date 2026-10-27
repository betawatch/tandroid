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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e30 implements View.OnClickListener {
    public final y5 a = new y5(this, 5);
    public final /* synthetic */ x50 b;

    public e30(x50 x50Var) {
        this.b = x50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.t40 t40Var;
        int i10;
        x50 x50Var = this.b;
        c30 c30Var = x50Var.x;
        ArrayList arrayList = x50Var.q0;
        org.telegram.ui.Components.voip.w2 w2Var = x50Var.w;
        org.telegram.ui.Components.yj0 yj0Var = x50Var.K0;
        AccountInstance accountInstance = x50Var.d;
        if (x50Var.a1 == null || x50Var.F1 == 3) {
            return;
        }
        int i11 = 0;
        if (x50Var.r1() && !x50Var.a1.isScheduled()) {
            o30 o30Var = x50Var.a2;
            if (o30Var != null && o30Var.b && (AndroidUtilities.isTablet() || x50.F3 == x50Var.q1())) {
                x50Var.e1(null);
                if (x50.F3) {
                    AndroidUtilities.runOnUIThread(new r00(this, 5), 200L);
                }
                x50Var.i0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                x50Var.e1(videoParticipant);
                return;
            }
            if (x50.F3 == x50Var.q1()) {
                x50Var.e1(videoParticipant);
            }
            if (x50Var.q1()) {
                x50Var.i0.setRequestedOrientation(6);
                return;
            } else {
                x50Var.i0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = x50Var.F1;
        if (i12 == 5) {
            if (x50Var.H1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            x50Var.H1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = x50Var.a1.getInputGroupCall();
            final int i13 = 0;
            accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.d30
                public final /* synthetic */ e30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            e30 e30Var = this.b;
                            if (tLObject == null) {
                                e30Var.getClass();
                                break;
                            } else {
                                e30Var.b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            e30 e30Var2 = this.b;
                            if (tLObject == null) {
                                e30Var2.getClass();
                                break;
                            } else {
                                e30Var2.b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (t40Var = x50Var.n0) != null) {
                t40Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = x50Var.a1.getInputGroupCall();
            TLRPC.GroupCall groupCall = x50Var.a1.call;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            final int i14 = 1;
            accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.d30
                public final /* synthetic */ e30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i14) {
                        case 0:
                            e30 e30Var = this.b;
                            if (tLObject == null) {
                                e30Var.getClass();
                                break;
                            } else {
                                e30Var.b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            e30 e30Var2 = this.b;
                            if (tLObject == null) {
                                e30Var2.getClass();
                                break;
                            } else {
                                e30Var2.b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            x50Var.K1(x50Var.a1.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = x50Var.T1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = x50Var.F1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    x50Var.K1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    w2Var.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = x50Var.i0;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    org.telegram.ui.Components.ye0.c(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new di.e(16));
                    return;
                }
                x50Var.K1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                w2Var.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (x50Var.o1() || x50Var.L0) {
            return;
        }
        x50Var.L0 = true;
        AndroidUtilities.shakeView(w2Var.getTextView());
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
        c30Var.setAnimation(yj0Var);
        yj0Var.M(i11);
        c30Var.d();
        if (x50Var.F1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) x50Var.a1.participants.f(MessageObject.getPeerId(x50Var.A0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            x50Var.K1(4, true);
        }
    }
}
