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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class c30 implements View.OnClickListener {
    public final y5 a = new y5(this, 5);
    public final /* synthetic */ v50 b;

    public c30(v50 v50Var) {
        this.b = v50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.t40 t40Var;
        int i10;
        v50 v50Var = this.b;
        a30 a30Var = v50Var.x;
        ArrayList arrayList = v50Var.q0;
        org.telegram.ui.Components.voip.w2 w2Var = v50Var.w;
        org.telegram.ui.Components.xj0 xj0Var = v50Var.K0;
        AccountInstance accountInstance = v50Var.d;
        if (v50Var.a1 == null || v50Var.F1 == 3) {
            return;
        }
        int i11 = 0;
        if (v50Var.r1() && !v50Var.a1.isScheduled()) {
            m30 m30Var = v50Var.a2;
            if (m30Var != null && m30Var.b && (AndroidUtilities.isTablet() || v50.F3 == v50Var.q1())) {
                v50Var.e1(null);
                if (v50.F3) {
                    AndroidUtilities.runOnUIThread(new p00(this, 5), 200L);
                }
                v50Var.i0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                v50Var.e1(videoParticipant);
                return;
            }
            if (v50.F3 == v50Var.q1()) {
                v50Var.e1(videoParticipant);
            }
            if (v50Var.q1()) {
                v50Var.i0.setRequestedOrientation(6);
                return;
            } else {
                v50Var.i0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = v50Var.F1;
        if (i12 == 5) {
            if (v50Var.H1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            v50Var.H1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = v50Var.a1.getInputGroupCall();
            final int i13 = 0;
            accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.b30
                public final /* synthetic */ c30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            c30 c30Var = this.b;
                            if (tLObject == null) {
                                c30Var.getClass();
                                break;
                            } else {
                                c30Var.b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            c30 c30Var2 = this.b;
                            if (tLObject == null) {
                                c30Var2.getClass();
                                break;
                            } else {
                                c30Var2.b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (t40Var = v50Var.n0) != null) {
                t40Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = v50Var.a1.getInputGroupCall();
            TLRPC.GroupCall groupCall = v50Var.a1.call;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            final int i14 = 1;
            accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.b30
                public final /* synthetic */ c30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i14) {
                        case 0:
                            c30 c30Var = this.b;
                            if (tLObject == null) {
                                c30Var.getClass();
                                break;
                            } else {
                                c30Var.b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            c30 c30Var2 = this.b;
                            if (tLObject == null) {
                                c30Var2.getClass();
                                break;
                            } else {
                                c30Var2.b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            v50Var.K1(v50Var.a1.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = v50Var.T1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = v50Var.F1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    v50Var.K1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    w2Var.performHapticFeedback(3, 2);
                    return;
                }
                LaunchActivity launchActivity = v50Var.i0;
                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    org.telegram.ui.Components.xe0.c(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new di.e(16));
                    return;
                }
                v50Var.K1(1, true);
                VoIPService.getSharedInstance().setMicMute(false, false, true);
                w2Var.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        if (v50Var.o1() || v50Var.L0) {
            return;
        }
        v50Var.L0 = true;
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
        xj0Var.P(i16);
        xj0Var.S(i16 - 1, this.a);
        a30Var.setAnimation(xj0Var);
        xj0Var.M(i11);
        a30Var.d();
        if (v50Var.F1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) v50Var.a1.participants.f(MessageObject.getPeerId(v50Var.A0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            v50Var.K1(4, true);
        }
    }
}
