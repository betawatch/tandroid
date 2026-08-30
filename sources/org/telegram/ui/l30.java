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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l30 implements View.OnClickListener {
    public final z5 a = new z5(this, 5);
    public final /* synthetic */ c60 b;

    public l30(c60 c60Var) {
        this.b = c60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.k40 k40Var;
        int i10;
        LaunchActivity launchActivity;
        c60 c60Var = this.b;
        j30 j30Var = c60Var.x;
        ArrayList arrayList = c60Var.n0;
        org.telegram.ui.Components.voip.v2 v2Var = c60Var.w;
        org.telegram.ui.Components.gj0 gj0Var = c60Var.H0;
        AccountInstance accountInstance = c60Var.d;
        if (c60Var.X0 == null || c60Var.C1 == 3) {
            return;
        }
        int i11 = 0;
        if (c60Var.r1() && !c60Var.X0.isScheduled()) {
            v30 v30Var = c60Var.X1;
            if (v30Var != null && v30Var.b && (AndroidUtilities.isTablet() || c60.C3 == c60Var.q1())) {
                c60Var.e1(null);
                if (c60.C3) {
                    AndroidUtilities.runOnUIThread(new c10(this, 5), 200L);
                }
                c60Var.f0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                c60Var.e1(videoParticipant);
                return;
            }
            if (c60.C3 == c60Var.q1()) {
                c60Var.e1(videoParticipant);
            }
            if (c60Var.q1()) {
                c60Var.f0.setRequestedOrientation(6);
                return;
            } else {
                c60Var.f0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = c60Var.C1;
        if (i12 == 5) {
            if (c60Var.E1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            c60Var.E1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = c60Var.X0.getInputGroupCall();
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
            if (i12 == 6 && (k40Var = c60Var.k0) != null) {
                k40Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = c60Var.X0.getInputGroupCall();
            TLRPC.GroupCall groupCall = c60Var.X0.call;
            boolean z4 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z4;
            togglegroupcallstartsubscription.subscribed = z4;
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
            c60Var.J1(c60Var.X0.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = c60Var.Q1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = c60Var.C1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    c60Var.J1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    v2Var.performHapticFeedback(3, 2);
                    return;
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && (launchActivity = c60Var.f0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                        org.telegram.ui.Components.ge0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new gg.h(4));
                        return;
                    }
                    c60Var.J1(1, true);
                    VoIPService.getSharedInstance().setMicMute(false, false, true);
                    v2Var.performHapticFeedback(3, 2);
                    return;
                }
            } catch (Exception unused2) {
                return;
            }
        }
        if (c60Var.o1() || c60Var.I0) {
            return;
        }
        c60Var.I0 = true;
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
        j30Var.setAnimation(gj0Var);
        gj0Var.K(i11);
        j30Var.d();
        if (c60Var.C1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) c60Var.X0.participants.f(MessageObject.getPeerId(c60Var.x0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            c60Var.J1(4, true);
        }
    }
}
