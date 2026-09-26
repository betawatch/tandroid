package org.telegram.ui;

import android.os.Build;
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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class l30 implements View.OnClickListener {
    public final w5 a = new w5(this, 5);
    public final /* synthetic */ d60 b;

    public l30(d60 d60Var) {
        this.b = d60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.j40 j40Var;
        int i10;
        LaunchActivity launchActivity;
        d60 d60Var = this.b;
        j30 j30Var = d60Var.x;
        ArrayList arrayList = d60Var.q0;
        org.telegram.ui.Components.voip.w2 w2Var = d60Var.w;
        org.telegram.ui.Components.ij0 ij0Var = d60Var.K0;
        AccountInstance accountInstance = d60Var.d;
        if (d60Var.a1 == null || d60Var.F1 == 3) {
            return;
        }
        int i11 = 0;
        if (d60Var.r1() && !d60Var.a1.isScheduled()) {
            v30 v30Var = d60Var.a2;
            if (v30Var != null && v30Var.b && (AndroidUtilities.isTablet() || d60.F3 == d60Var.q1())) {
                d60Var.e1(null);
                if (d60.F3) {
                    AndroidUtilities.runOnUIThread(new c10(this, 5), 200L);
                }
                d60Var.i0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                d60Var.e1(videoParticipant);
                return;
            }
            if (d60.F3 == d60Var.q1()) {
                d60Var.e1(videoParticipant);
            }
            if (d60Var.q1()) {
                d60Var.i0.setRequestedOrientation(6);
                return;
            } else {
                d60Var.i0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = d60Var.F1;
        if (i12 == 5) {
            if (d60Var.H1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            d60Var.H1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = d60Var.a1.getInputGroupCall();
            final int i13 = 0;
            accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.k30
                public final /* synthetic */ l30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            l30 l30Var = this.b;
                            if (tLObject == null) {
                                l30Var.getClass();
                                break;
                            } else {
                                l30Var.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            l30 l30Var2 = this.b;
                            if (tLObject == null) {
                                l30Var2.getClass();
                                break;
                            } else {
                                l30Var2.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (j40Var = d60Var.n0) != null) {
                j40Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = d60Var.a1.getInputGroupCall();
            TLRPC.GroupCall groupCall = d60Var.a1.call;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            final int i14 = 1;
            accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.k30
                public final /* synthetic */ l30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i14) {
                        case 0:
                            l30 l30Var = this.b;
                            if (tLObject == null) {
                                l30Var.getClass();
                                break;
                            } else {
                                l30Var.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            l30 l30Var2 = this.b;
                            if (tLObject == null) {
                                l30Var2.getClass();
                                break;
                            } else {
                                l30Var2.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            d60Var.J1(d60Var.a1.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = d60Var.T1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = d60Var.F1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    d60Var.J1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    w2Var.performHapticFeedback(3, 2);
                    return;
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && (launchActivity = d60Var.i0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                        org.telegram.ui.Components.ne0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ai.i(16));
                        return;
                    }
                    d60Var.J1(1, true);
                    VoIPService.getSharedInstance().setMicMute(false, false, true);
                    w2Var.performHapticFeedback(3, 2);
                    return;
                }
            } catch (Exception unused2) {
                return;
            }
        }
        if (d60Var.o1() || d60Var.L0) {
            return;
        }
        d60Var.L0 = true;
        AndroidUtilities.shakeView(w2Var.getTextView());
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused3) {
        }
        int nextInt = Utilities.random.nextInt(100);
        int i16 = 120;
        if (nextInt >= 32) {
            i11 = 240;
            if (nextInt < 64) {
                i16 = 240;
                i11 = 120;
            } else {
                i16 = 420;
                if (nextInt >= 97) {
                    i11 = 540;
                    if (nextInt == 98) {
                        i16 = 540;
                        i11 = 420;
                    } else {
                        i16 = 720;
                    }
                }
            }
        }
        ij0Var.P(i16);
        ij0Var.S(i16 - 1, this.a);
        j30Var.setAnimation(ij0Var);
        ij0Var.M(i11);
        j30Var.d();
        if (d60Var.F1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) d60Var.a1.participants.f(MessageObject.getPeerId(d60Var.A0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            d60Var.J1(4, true);
        }
    }
}
