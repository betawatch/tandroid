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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class q30 implements View.OnClickListener {
    public final w5 a = new w5(this, 5);
    public final /* synthetic */ j60 b;

    public q30(j60 j60Var) {
        this.b = j60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.i40 i40Var;
        int i10;
        LaunchActivity launchActivity;
        j60 j60Var = this.b;
        o30 o30Var = j60Var.x;
        ArrayList arrayList = j60Var.q0;
        org.telegram.ui.Components.voip.t2 t2Var = j60Var.w;
        org.telegram.ui.Components.xi0 xi0Var = j60Var.K0;
        AccountInstance accountInstance = j60Var.d;
        if (j60Var.a1 == null || j60Var.F1 == 3) {
            return;
        }
        int i11 = 0;
        if (j60Var.r1() && !j60Var.a1.isScheduled()) {
            a40 a40Var = j60Var.a2;
            if (a40Var != null && a40Var.b && (AndroidUtilities.isTablet() || j60.F3 == j60Var.q1())) {
                j60Var.e1(null);
                if (j60.F3) {
                    AndroidUtilities.runOnUIThread(new g10(this, 5), 200L);
                }
                j60Var.i0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                j60Var.e1(videoParticipant);
                return;
            }
            if (j60.F3 == j60Var.q1()) {
                j60Var.e1(videoParticipant);
            }
            if (j60Var.q1()) {
                j60Var.i0.setRequestedOrientation(6);
                return;
            } else {
                j60Var.i0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = j60Var.F1;
        if (i12 == 5) {
            if (j60Var.H1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            j60Var.H1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = j60Var.a1.getInputGroupCall();
            final int i13 = 0;
            accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.p30
                public final /* synthetic */ q30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            q30 q30Var = this.b;
                            if (tLObject == null) {
                                q30Var.getClass();
                                break;
                            } else {
                                q30Var.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            q30 q30Var2 = this.b;
                            if (tLObject == null) {
                                q30Var2.getClass();
                                break;
                            } else {
                                q30Var2.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (i40Var = j60Var.n0) != null) {
                i40Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = j60Var.a1.getInputGroupCall();
            TLRPC.GroupCall groupCall = j60Var.a1.call;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            final int i14 = 1;
            accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.p30
                public final /* synthetic */ q30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i14) {
                        case 0:
                            q30 q30Var = this.b;
                            if (tLObject == null) {
                                q30Var.getClass();
                                break;
                            } else {
                                q30Var.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            q30 q30Var2 = this.b;
                            if (tLObject == null) {
                                q30Var2.getClass();
                                break;
                            } else {
                                q30Var2.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            j60Var.J1(j60Var.a1.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = j60Var.T1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = j60Var.F1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    j60Var.J1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    t2Var.performHapticFeedback(3, 2);
                    return;
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && (launchActivity = j60Var.i0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                        org.telegram.ui.Components.de0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new org.telegram.ui.ActionBar.j3(3));
                        return;
                    }
                    j60Var.J1(1, true);
                    VoIPService.getSharedInstance().setMicMute(false, false, true);
                    t2Var.performHapticFeedback(3, 2);
                    return;
                }
            } catch (Exception unused2) {
                return;
            }
        }
        if (j60Var.o1() || j60Var.L0) {
            return;
        }
        j60Var.L0 = true;
        AndroidUtilities.shakeView(t2Var.getTextView());
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
        xi0Var.N(i16);
        xi0Var.P(i16 - 1, this.a);
        o30Var.setAnimation(xi0Var);
        xi0Var.K(i11);
        o30Var.d();
        if (j60Var.F1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) j60Var.a1.participants.f(MessageObject.getPeerId(j60Var.A0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            j60Var.J1(4, true);
        }
    }
}
