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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class q30 implements View.OnClickListener {
    public final w5 a = new w5(this, 5);
    public final /* synthetic */ i60 b;

    public q30(i60 i60Var) {
        this.b = i60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.i40 i40Var;
        int i10;
        LaunchActivity launchActivity;
        i60 i60Var = this.b;
        o30 o30Var = i60Var.x;
        ArrayList arrayList = i60Var.q0;
        org.telegram.ui.Components.voip.v2 v2Var = i60Var.w;
        org.telegram.ui.Components.hj0 hj0Var = i60Var.K0;
        AccountInstance accountInstance = i60Var.d;
        if (i60Var.a1 == null || i60Var.F1 == 3) {
            return;
        }
        int i11 = 0;
        if (i60Var.r1() && !i60Var.a1.isScheduled()) {
            a40 a40Var = i60Var.a2;
            if (a40Var != null && a40Var.b && (AndroidUtilities.isTablet() || i60.F3 == i60Var.q1())) {
                i60Var.e1(null);
                if (i60.F3) {
                    AndroidUtilities.runOnUIThread(new g10(this, 5), 200L);
                }
                i60Var.i0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                i60Var.e1(videoParticipant);
                return;
            }
            if (i60.F3 == i60Var.q1()) {
                i60Var.e1(videoParticipant);
            }
            if (i60Var.q1()) {
                i60Var.i0.setRequestedOrientation(6);
                return;
            } else {
                i60Var.i0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = i60Var.F1;
        if (i12 == 5) {
            if (i60Var.H1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            i60Var.H1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = i60Var.a1.getInputGroupCall();
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
            if (i12 == 6 && (i40Var = i60Var.n0) != null) {
                i40Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = i60Var.a1.getInputGroupCall();
            TLRPC.GroupCall groupCall = i60Var.a1.call;
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
            i60Var.J1(i60Var.a1.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = i60Var.T1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = i60Var.F1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    i60Var.J1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    v2Var.performHapticFeedback(3, 2);
                    return;
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && (launchActivity = i60Var.i0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                        org.telegram.ui.Components.le0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new org.telegram.ui.ActionBar.j3(3));
                        return;
                    }
                    i60Var.J1(1, true);
                    VoIPService.getSharedInstance().setMicMute(false, false, true);
                    v2Var.performHapticFeedback(3, 2);
                    return;
                }
            } catch (Exception unused2) {
                return;
            }
        }
        if (i60Var.o1() || i60Var.L0) {
            return;
        }
        i60Var.L0 = true;
        AndroidUtilities.shakeView(v2Var.getTextView());
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
        hj0Var.P(i16);
        hj0Var.S(i16 - 1, this.a);
        o30Var.setAnimation(hj0Var);
        hj0Var.M(i11);
        o30Var.d();
        if (i60Var.F1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) i60Var.a1.participants.f(MessageObject.getPeerId(i60Var.A0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            i60Var.J1(4, true);
        }
    }
}
