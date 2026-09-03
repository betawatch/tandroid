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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n30 implements View.OnClickListener {
    public final b6 a = new b6(this, 5);
    public final /* synthetic */ e60 b;

    public n30(e60 e60Var) {
        this.b = e60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.l40 l40Var;
        int i10;
        LaunchActivity launchActivity;
        e60 e60Var = this.b;
        l30 l30Var = e60Var.x;
        ArrayList arrayList = e60Var.n0;
        org.telegram.ui.Components.voip.v2 v2Var = e60Var.w;
        org.telegram.ui.Components.gj0 gj0Var = e60Var.H0;
        AccountInstance accountInstance = e60Var.d;
        if (e60Var.X0 == null || e60Var.C1 == 3) {
            return;
        }
        int i11 = 0;
        if (e60Var.r1() && !e60Var.X0.isScheduled()) {
            x30 x30Var = e60Var.X1;
            if (x30Var != null && x30Var.b && (AndroidUtilities.isTablet() || e60.C3 == e60Var.q1())) {
                e60Var.e1(null);
                if (e60.C3) {
                    AndroidUtilities.runOnUIThread(new d10(this, 5), 200L);
                }
                e60Var.f0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                e60Var.e1(videoParticipant);
                return;
            }
            if (e60.C3 == e60Var.q1()) {
                e60Var.e1(videoParticipant);
            }
            if (e60Var.q1()) {
                e60Var.f0.setRequestedOrientation(6);
                return;
            } else {
                e60Var.f0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = e60Var.C1;
        if (i12 == 5) {
            if (e60Var.E1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            e60Var.E1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = e60Var.X0.getInputGroupCall();
            final int i13 = 0;
            accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) { // from class: org.telegram.ui.m30
                public final /* synthetic */ n30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            n30 n30Var = this.b;
                            if (tLObject == null) {
                                n30Var.getClass();
                                break;
                            } else {
                                n30Var.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            n30 n30Var2 = this.b;
                            if (tLObject == null) {
                                n30Var2.getClass();
                                break;
                            } else {
                                n30Var2.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (l40Var = e60Var.k0) != null) {
                l40Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = e60Var.X0.getInputGroupCall();
            TLRPC.GroupCall groupCall = e60Var.X0.call;
            boolean z4 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z4;
            togglegroupcallstartsubscription.subscribed = z4;
            final int i14 = 1;
            accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) { // from class: org.telegram.ui.m30
                public final /* synthetic */ n30 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i14) {
                        case 0:
                            n30 n30Var = this.b;
                            if (tLObject == null) {
                                n30Var.getClass();
                                break;
                            } else {
                                n30Var.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                        default:
                            n30 n30Var2 = this.b;
                            if (tLObject == null) {
                                n30Var2.getClass();
                                break;
                            } else {
                                n30Var2.b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                break;
                            }
                    }
                }
            });
            e60Var.J1(e60Var.X0.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = e60Var.Q1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = e60Var.C1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    e60Var.J1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    v2Var.performHapticFeedback(3, 2);
                    return;
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && (launchActivity = e60Var.f0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                        org.telegram.ui.Components.he0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new gg.h(4));
                        return;
                    }
                    e60Var.J1(1, true);
                    VoIPService.getSharedInstance().setMicMute(false, false, true);
                    v2Var.performHapticFeedback(3, 2);
                    return;
                }
            } catch (Exception unused2) {
                return;
            }
        }
        if (e60Var.o1() || e60Var.I0) {
            return;
        }
        e60Var.I0 = true;
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
        gj0Var.N(i16);
        gj0Var.P(i16 - 1, this.a);
        l30Var.setAnimation(gj0Var);
        gj0Var.K(i11);
        l30Var.d();
        if (e60Var.C1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) e60Var.X0.participants.f(MessageObject.getPeerId(e60Var.x0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            e60Var.J1(4, true);
        }
    }
}
