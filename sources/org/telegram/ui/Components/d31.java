package org.telegram.ui.Components;

import android.R;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.StateSet;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class d31 {
    public static final int[] N = {R.attr.state_enabled, R.attr.state_pressed};
    public static HashMap O;
    public static HashMap P;
    public static ArrayList Q;
    public Path C;
    public int D;
    public int E;
    public float F;
    public float G;
    public Paint H;
    public Paint I;
    public Paint J;
    public float K;
    public Path L;
    public float[] M;
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;
    public Paint f;
    public Paint g;
    public Path h;
    public boolean i;
    public final z5 j;
    public boolean k;
    public final z5 l;
    public int m;
    public final gj0 n;
    public int o;
    public final gj0 p;
    public org.telegram.ui.Cells.z q;
    public final org.telegram.ui.Cells.t1 r;
    public final mo0 s;
    public final Rect u;
    public final Rect v;
    public final boolean x;
    public boolean y;
    public boolean z;
    public boolean w = false;
    public boolean A = false;
    public final u1.a B = new u1.a();
    public long t = SystemClock.elapsedRealtime();

    public d31(org.telegram.ui.Cells.t1 t1Var, mo0 mo0Var) {
        boolean z4 = false;
        this.r = t1Var;
        this.s = mo0Var;
        Rect rect = new Rect(0, 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        this.u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        gj0 gj0Var = new gj0(org.telegram.messenger.R.raw.transcribe_out, AndroidUtilities.dp(26.0f), "transcribe_out", AndroidUtilities.dp(26.0f));
        this.p = gj0Var;
        gj0Var.K(0);
        gj0Var.setCallback(t1Var);
        final int i10 = 0;
        gj0Var.P(19, new Runnable(this) { // from class: org.telegram.ui.Components.b31
            public final /* synthetic */ d31 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        d31 d31Var = this.b;
                        d31Var.p.stop();
                        gj0 gj0Var2 = d31Var.n;
                        gj0Var2.stop();
                        d31Var.z = true;
                        d31Var.y = true;
                        gj0Var2.K(0);
                        break;
                    default:
                        d31 d31Var2 = this.b;
                        d31Var2.n.stop();
                        gj0 gj0Var3 = d31Var2.p;
                        gj0Var3.stop();
                        d31Var2.z = false;
                        d31Var2.y = false;
                        gj0Var3.K(0);
                        break;
                }
            }
        });
        gj0Var.H(true);
        gj0 gj0Var2 = new gj0(org.telegram.messenger.R.raw.transcribe_in, AndroidUtilities.dp(26.0f), "transcribe_in", AndroidUtilities.dp(26.0f));
        this.n = gj0Var2;
        gj0Var2.K(0);
        gj0Var2.setCallback(t1Var);
        gj0Var2.s0 = t1Var;
        final int i11 = 1;
        gj0Var2.P(19, new Runnable(this) { // from class: org.telegram.ui.Components.b31
            public final /* synthetic */ d31 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        d31 d31Var = this.b;
                        d31Var.p.stop();
                        gj0 gj0Var22 = d31Var.n;
                        gj0Var22.stop();
                        d31Var.z = true;
                        d31Var.y = true;
                        gj0Var22.K(0);
                        break;
                    default:
                        d31 d31Var2 = this.b;
                        d31Var2.n.stop();
                        gj0 gj0Var3 = d31Var2.p;
                        gj0Var3.stop();
                        d31Var2.z = false;
                        d31Var2.y = false;
                        gj0Var3.K(0);
                        break;
                }
            }
        });
        gj0Var2.H(true);
        this.y = false;
        this.z = false;
        if (t1Var.getMessageObject() != null && UserConfig.getInstance(t1Var.getMessageObject().currentAccount).isPremium()) {
            z4 = true;
        }
        this.x = z4;
        nr nrVar = nr.h;
        this.l = new z5(t1Var, 250L, nrVar);
        this.j = new z5(t1Var, 250L, nrVar);
    }

    public static void a(Path path, int i10, int i11, int i12, int i13, float f10, float f11) {
        float a2 = k7.n.a(f10, 0.0f, 1.0f);
        float a10 = k7.n.a(f11, 0.0f, 1.0f) - a2;
        if (a10 <= 0.0f) {
            return;
        }
        if (i13 == 1) {
            AndroidUtilities.rectTmp.set(i10 - i12, i11, i10, i11 + i12);
        } else if (i13 == 2) {
            AndroidUtilities.rectTmp.set(i10 - i12, i11 - i12, i10, i11);
        } else if (i13 == 3) {
            AndroidUtilities.rectTmp.set(i10, i11 - i12, i10 + i12, i11);
        } else if (i13 == 4) {
            AndroidUtilities.rectTmp.set(i10, i11, i10 + i12, i11 + i12);
        }
        path.addArc(AndroidUtilities.rectTmp, (a2 * 90.0f) + ((i13 * 90) - 180), a10 * 90.0f);
    }

    public static void b(Path path, int i10, int i11, int i12, int i13, float f10, float f11, float f12, float f13) {
        if (f10 <= f11) {
            float f14 = f13 - f12;
            a(path, i10, i11, i12, i13, Math.max(0.0f, f10 - f12) / f14, (Math.min(f11, f13) - f12) / f14);
        } else {
            float f15 = f13 - f12;
            a(path, i10, i11, i12, i13, (f10 - f12) / f15, 1.0f);
            a(path, i10, i11, i12, i13, 0.0f, (f11 - f12) / f15);
        }
    }

    public static void c(Path path, int i10, int i11, int i12, int i13, float f10, float f11) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        float a2 = k7.n.a(f10, 0.0f, 1.0f);
        if (k7.n.a(f11, 0.0f, 1.0f) - a2 <= 0.0f) {
            return;
        }
        path.moveTo(AndroidUtilities.lerp(i10, i12, a2), AndroidUtilities.lerp(i11, i13, a2));
        path.lineTo(AndroidUtilities.lerp(i10, i12, r8), AndroidUtilities.lerp(i11, i13, r8));
    }

    public static void d(Path path, int i10, int i11, int i12, int i13, float f10, float f11, float f12, float f13) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        if (f10 <= f11) {
            float f14 = f13 - f12;
            c(path, i10, i11, i12, i13, Math.max(0.0f, f10 - f12) / f14, (Math.min(f11, f13) - f12) / f14);
        } else {
            float f15 = f13 - f12;
            c(path, i10, i11, i12, i13, (f10 - f12) / f15, 1.0f);
            c(path, i10, i11, i12, i13, 0.0f, (f11 - f12) / f15);
        }
    }

    public static boolean e(MessageObject messageObject) {
        if (messageObject != null && messageObject.messageOwner != null) {
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(messageObject.currentAccount);
            MessagesController messagesController = MessagesController.getInstance(messageObject.currentAccount);
            if (j(messageObject)) {
                return true;
            }
            if (messagesController.transcribeAudioTrialWeeklyNumber > 0 && messageObject.getDuration() <= messagesController.transcribeAudioTrialDurationMax) {
                return messagesController.transcribeAudioTrialCooldownUntil == 0 || connectionsManager.getCurrentTime() > messagesController.transcribeAudioTrialCooldownUntil || messagesController.transcribeAudioTrialCurrentNumber > 0;
            }
        }
        return false;
    }

    public static boolean g(MessageObject messageObject, long j10, String str) {
        try {
            HashMap hashMap = O;
            MessageObject messageObject2 = messageObject == null ? (hashMap == null || !hashMap.containsKey(Long.valueOf(j10))) ? null : (MessageObject) O.remove(Long.valueOf(j10)) : messageObject;
            if (messageObject2 != null && messageObject2.messageOwner != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(o(messageObject2)));
                }
                messageObject2.messageOwner.voiceTranscriptionFinal = true;
                MessagesStorage.getInstance(messageObject2.currentAccount).updateMessageVoiceTranscription(messageObject2.getDialogId(), messageObject2.getId(), str, messageObject2.messageOwner);
                AndroidUtilities.runOnUIThread(new y21(str, messageObject2, j10, 0));
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int h(int i10) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        MessagesController messagesController = MessagesController.getInstance(i10);
        if (messagesController.transcribeAudioTrialWeeklyNumber <= 0) {
            return 0;
        }
        return (messagesController.transcribeAudioTrialCooldownUntil == 0 || connectionsManager.getCurrentTime() > messagesController.transcribeAudioTrialCooldownUntil) ? messagesController.transcribeAudioTrialWeeklyNumber : messagesController.transcribeAudioTrialCurrentNumber;
    }

    public static boolean j(MessageObject messageObject) {
        if (messageObject != null && messageObject.messageOwner != null) {
            MessagesController messagesController = MessagesController.getInstance(messageObject.currentAccount);
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(messageObject.getChatId()));
            if (ChatObject.isMegagroup(chat) && chat.level >= messagesController.groupTranscribeLevelMin) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(MessageObject messageObject) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap != null && (hashMap.containsValue(messageObject) || P.containsKey(Integer.valueOf(o(messageObject))))) {
            return true;
        }
        HashMap hashMap2 = O;
        return (hashMap2 == null || messageObject == null || (message = messageObject.messageOwner) == null || !hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) ? false : true;
    }

    public static boolean l(MessageObject messageObject) {
        if (Q != null) {
            return !messageObject.isRoundVideo() || Q.contains(Integer.valueOf(o(messageObject)));
        }
        return false;
    }

    public static void n(MessageObject messageObject) {
        if (messageObject == null || l(messageObject)) {
            return;
        }
        if (Q == null) {
            Q = new ArrayList(1);
        }
        Q.add(Integer.valueOf(o(messageObject)));
    }

    public static int o(MessageObject messageObject) {
        if (messageObject == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(messageObject.currentAccount), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()));
    }

    public static void u(MessageObject messageObject, boolean z4) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return;
        }
        message.voiceTranscriptionForce = true;
        MessagesStorage.getInstance(messageObject.currentAccount).updateMessageVoiceTranscriptionOpen(messageObject.getDialogId(), messageObject.getId(), messageObject.messageOwner);
        if (z4) {
            AndroidUtilities.runOnUIThread(new nq0(messageObject, 20));
        }
    }

    public static boolean v(MessageObject messageObject) {
        if (messageObject == null || messageObject.messageOwner == null || j(messageObject) || !TextUtils.isEmpty(messageObject.messageOwner.voiceTranscription)) {
            return false;
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(messageObject.currentAccount);
        MessagesController messagesController = MessagesController.getInstance(messageObject.currentAccount);
        return !UserConfig.getInstance(messageObject.currentAccount).isPremium() && messagesController.transcribeAudioTrialCooldownUntil != 0 && connectionsManager.getCurrentTime() <= messagesController.transcribeAudioTrialCooldownUntil && messagesController.transcribeAudioTrialCurrentNumber <= 0;
    }

    public static void w(final MessageObject messageObject, boolean z4, final org.telegram.ui.Cells.k1 k1Var) {
        if (messageObject == null || messageObject.messageOwner == null || !messageObject.isSent()) {
            return;
        }
        final int i10 = messageObject.currentAccount;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i10).getInputPeer(messageObject.messageOwner.peer_id);
        final long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        TLRPC.Message message = messageObject.messageOwner;
        final int i11 = message.id;
        if (!z4) {
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(o(messageObject)));
            }
            messageObject.messageOwner.voiceTranscriptionOpen = false;
            MessagesStorage.getInstance(i10).updateMessageVoiceTranscriptionOpen(peerDialogId, i11, messageObject.messageOwner);
            final int i12 = 1;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.z21
                @Override // java.lang.Runnable
                public final void run() {
                    int i13 = i12;
                    MessageObject messageObject2 = messageObject;
                    int i14 = i10;
                    switch (i13) {
                        case 0:
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i14);
                            int i15 = NotificationCenter.voiceTranscriptionUpdate;
                            Boolean bool = Boolean.TRUE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, messageObject2, null, null, bool, bool);
                            break;
                        default:
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (message.voiceTranscription != null && message.voiceTranscriptionFinal) {
            n(messageObject);
            messageObject.messageOwner.voiceTranscriptionOpen = true;
            MessagesStorage.getInstance(i10).updateMessageVoiceTranscriptionOpen(peerDialogId, i11, messageObject.messageOwner);
            final int i13 = 0;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.z21
                @Override // java.lang.Runnable
                public final void run() {
                    int i132 = i13;
                    MessageObject messageObject2 = messageObject;
                    int i14 = i10;
                    switch (i132) {
                        case 0:
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i14);
                            int i15 = NotificationCenter.voiceTranscriptionUpdate;
                            Boolean bool = Boolean.TRUE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, messageObject2, null, null, bool, bool);
                            break;
                        default:
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("sending Transcription request, msg_id=" + i11 + " dialog_id=" + peerDialogId);
        }
        TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
        tL_messages_transcribeAudio.peer = inputPeer;
        tL_messages_transcribeAudio.msg_id = i11;
        if (P == null) {
            P = new HashMap();
        }
        P.put(Integer.valueOf(o(messageObject)), messageObject);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() { // from class: org.telegram.ui.Components.a31
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                long j10;
                boolean z10;
                String str;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                int i14 = i10;
                org.telegram.ui.Cells.k1 k1Var2 = k1Var;
                MessageObject messageObject2 = messageObject;
                String str2 = "";
                if (z11) {
                    TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
                    String str3 = tL_messages_transcribedAudio.text;
                    j10 = tL_messages_transcribedAudio.transcription_id;
                    boolean z12 = tL_messages_transcribedAudio.pending;
                    z10 = !z12;
                    if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    } else if (z12) {
                        str2 = null;
                    }
                    if ((tL_messages_transcribedAudio.flags & 2) != 0) {
                        MessagesController.getInstance(i14).updateTranscribeAudioTrialCurrentNumber(tL_messages_transcribedAudio.trial_remains_num);
                        MessagesController.getInstance(i14).updateTranscribeAudioTrialCooldownUntil(tL_messages_transcribedAudio.trial_remains_until_date);
                        AndroidUtilities.runOnUIThread(new i80(27, k1Var2, tL_messages_transcribedAudio));
                    }
                    if (d31.O == null) {
                        d31.O = new HashMap();
                    }
                    d31.O.put(Long.valueOf(j10), messageObject2);
                    messageObject2.messageOwner.voiceTranscriptionId = j10;
                } else {
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        MessagesController.getInstance(i14).updateTranscribeAudioTrialCurrentNumber(0);
                        MessagesController.getInstance(i14).updateTranscribeAudioTrialCooldownUntil(Utilities.parseInt((CharSequence) tL_error.text).intValue() + ConnectionsManager.getInstance(i14).getCurrentTime());
                        AndroidUtilities.runOnUIThread(new ey(messageObject2, k1Var2, i14, 22));
                        return;
                    }
                    j10 = 0;
                    z10 = true;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                d31.n(messageObject2);
                TLRPC.Message message2 = messageObject2.messageOwner;
                message2.voiceTranscriptionOpen = true;
                message2.voiceTranscriptionFinal = z10;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("Transcription request sent, received final=" + z10 + " id=" + j10 + " text=" + str2);
                }
                String str4 = str2;
                MessagesStorage.getInstance(i14).updateMessageVoiceTranscription(peerDialogId, i11, str4, messageObject2.messageOwner);
                if (z10) {
                    AndroidUtilities.runOnUIThread(new y21(str4, messageObject2, j10, 1), Math.max(0L, 350 - elapsedRealtime2));
                }
            }
        }, !UserConfig.getInstance(i10).isPremium() ? 1024 : 0);
    }

    public final void f(Canvas canvas, float f10) {
        float f11;
        Rect rect = this.u;
        this.v.set(rect.left - AndroidUtilities.dp(8.0f), rect.top - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + rect.right, AndroidUtilities.dp(8.0f) + rect.bottom);
        Path path = this.C;
        if (path == null) {
            this.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        Path path2 = this.C;
        float f12 = this.D;
        path2.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.C);
        float f13 = this.e * f10;
        if (f13 > 0.0f) {
            org.telegram.ui.Cells.t1 t1Var = ((org.telegram.ui.Cells.i1) this).R;
            Paint M2 = t1Var.v7.shouldDrawWithoutBackground() ? t1Var.M2("paintChatActionBackground") : t1Var.M2("paintChatTimeBackground");
            int alpha = M2.getAlpha();
            M2.setAlpha((int) (alpha * f13));
            t1Var.p0();
            canvas.drawRect(rect, M2);
            if (M2 == t1Var.M2("paintChatActionBackground") && t1Var.R2()) {
                int alpha2 = org.telegram.ui.ActionBar.j6.h2.getAlpha();
                org.telegram.ui.ActionBar.j6.h2.setAlpha((int) (alpha2 * f13));
                canvas.drawRect(rect, org.telegram.ui.ActionBar.j6.h2);
                org.telegram.ui.ActionBar.j6.h2.setAlpha(alpha2);
            }
            M2.setAlpha(alpha);
        }
        Paint paint = this.f;
        if (paint != null) {
            int alpha3 = paint.getAlpha();
            this.f.setAlpha((int) (alpha3 * f10));
            canvas.drawRect(rect, this.f);
            this.f.setAlpha(alpha3);
        }
        org.telegram.ui.Cells.z zVar = this.q;
        if (zVar != null) {
            zVar.setBounds(rect);
            this.q.draw(canvas);
        }
        canvas.restore();
        float d = this.l.d(this.k ? 1.0f : 0.0f, false);
        if (d > 0.0f) {
            long elapsedRealtime = (long) ((SystemClock.elapsedRealtime() - this.t) * 0.75f);
            if (this.M == null) {
                this.M = new float[2];
            }
            long j10 = elapsedRealtime % 5400;
            float[] fArr = this.M;
            float f14 = (1520 * j10) / 5400.0f;
            fArr[0] = f14 - 20.0f;
            fArr[1] = f14;
            for (int i10 = 0; i10 < 4; i10++) {
                float[] fArr2 = this.M;
                float f15 = fArr2[1];
                int i11 = i10 * 1350;
                u1.a aVar = this.B;
                fArr2[1] = (aVar.getInterpolation((j10 - i11) / 667.0f) * 250.0f) + f15;
                float[] fArr3 = this.M;
                fArr3[0] = (aVar.getInterpolation((j10 - (i11 + 667)) / 667.0f) * 250.0f) + fArr3[0];
            }
            f11 = 1.0f;
            float[] fArr4 = this.M;
            Path path3 = this.h;
            if (path3 == null) {
                this.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(40.0f * d, fArr4[1] - fArr4[0]);
            float f16 = ((1.0f - d) * max * (this.k ? 0.0f : 1.0f)) + fArr4[0];
            float f17 = (max * d) + f16;
            float f18 = f16 % 360.0f;
            float f19 = f17 % 360.0f;
            if (f18 < 0.0f) {
                f18 += 360.0f;
            }
            float f20 = f18;
            if (f19 < 0.0f) {
                f19 += 360.0f;
            }
            float f21 = f19;
            Path path4 = this.h;
            int centerX = rect.centerX();
            int i12 = rect.top;
            d(path4, centerX, i12, rect.right - this.D, i12, f20, f21, 0.0f, this.F);
            b(this.h, rect.right, rect.top, this.E, 1, f20, f21, this.F, this.G);
            Path path5 = this.h;
            int i13 = rect.right;
            int i14 = rect.top;
            int i15 = this.D;
            int i16 = i14 + i15;
            int i17 = rect.bottom - i15;
            float f22 = this.G;
            d(path5, i13, i16, i13, i17, f20, f21, f22, 180.0f - f22);
            b(this.h, rect.right, rect.bottom, this.E, 2, f20, f21, 180.0f - this.G, 180.0f - this.F);
            Path path6 = this.h;
            int i18 = rect.right;
            int i19 = this.D;
            int i20 = i18 - i19;
            int i21 = rect.bottom;
            int i22 = rect.left + i19;
            float f23 = this.F;
            d(path6, i20, i21, i22, i21, f20, f21, 180.0f - f23, f23 + 180.0f);
            b(this.h, rect.left, rect.bottom, this.E, 3, f20, f21, this.F + 180.0f, this.G + 180.0f);
            Path path7 = this.h;
            int i23 = rect.left;
            int i24 = rect.bottom;
            int i25 = this.D;
            int i26 = i24 - i25;
            int i27 = rect.top + i25;
            float f24 = this.G;
            d(path7, i23, i26, i23, i27, f20, f21, f24 + 180.0f, 360.0f - f24);
            b(this.h, rect.left, rect.top, this.E, 4, f20, f21, 360.0f - this.G, 360.0f - this.F);
            d(this.h, rect.left + this.D, rect.top, rect.centerX(), rect.top, f20, f21, 360.0f - this.F, 360.0f);
            this.g.setStrokeWidth(AndroidUtilities.dp(1.5f));
            int alpha4 = this.g.getAlpha();
            this.g.setAlpha((int) (alpha4 * f10));
            canvas.drawPath(this.h, this.g);
            this.g.setAlpha(alpha4);
            this.r.invalidate();
        } else {
            f11 = 1.0f;
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(-13.0f) + rect.centerX(), AndroidUtilities.dp(-13.0f) + rect.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), 255, 31);
        if (this.y) {
            gj0 gj0Var = this.n;
            gj0Var.setAlpha((int) (this.m * f10));
            gj0Var.draw(canvas);
        } else {
            gj0 gj0Var2 = this.p;
            gj0Var2.setAlpha((int) (this.o * f10));
            gj0Var2.draw(canvas);
        }
        float e = this.j.e((!this.i || this.y || this.k) ? false : true);
        if (e > 0.0f) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(12.0f));
            if (this.H == null) {
                Paint paint2 = new Paint(1);
                this.H = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, -AndroidUtilities.dp(0.4f), AndroidUtilities.dp(6.666f), AndroidUtilities.dp(8.733f));
            canvas.scale(e, e, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.H);
            if (this.I == null) {
                this.I = new Paint(1);
            }
            this.I.setColor(this.c);
            int i28 = (int) (e * 255.0f);
            this.I.setAlpha(i28);
            rectF2.set(0.0f, AndroidUtilities.dp(3.33f), AndroidUtilities.dp(6.666f), AndroidUtilities.dp(8.33f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), this.I);
            if (this.L == null || Math.abs(this.K - AndroidUtilities.density) > 0.1f) {
                this.K = AndroidUtilities.density;
                Path path8 = new Path();
                this.L = path8;
                path8.moveTo(AndroidUtilities.dp(1.66f), AndroidUtilities.dp(3.33f));
                this.L.lineTo(AndroidUtilities.dp(1.66f), AndroidUtilities.dp(2.0f));
                rectF2.set(AndroidUtilities.dp(1.66f), AndroidUtilities.dp(0.33f), AndroidUtilities.dp(4.99f), AndroidUtilities.dp(3.6599998f));
                this.L.arcTo(rectF2, -180.0f, 180.0f, false);
                this.L.lineTo(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.33f));
            }
            if (this.J == null) {
                Paint paint3 = new Paint(1);
                this.J = paint3;
                paint3.setStyle(Paint.Style.STROKE);
            }
            this.J.setStrokeWidth(AndroidUtilities.dp(f11));
            this.J.setColor(this.c);
            this.J.setAlpha(i28);
            canvas.drawPath(this.L, this.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
    }

    public final int i() {
        return this.u.height();
    }

    public final void m() {
        boolean z4;
        org.telegram.ui.Cells.t1 t1Var = this.r;
        if (t1Var == null) {
            return;
        }
        this.w = false;
        boolean z10 = this.z;
        boolean z11 = !z10;
        boolean z12 = this.x;
        if (z10) {
            t(false, true);
            r(false, true);
            z4 = true;
        } else {
            z4 = !this.k;
            if ((z12 || e(t1Var.getMessageObject())) && t1Var.getMessageObject().isSent()) {
                r(true, true);
            }
        }
        org.telegram.ui.Cells.z zVar = this.q;
        if (zVar != null) {
            zVar.setState(StateSet.NOTHING);
            t1Var.invalidate();
        }
        this.A = false;
        if (z4) {
            if (z12 || z10) {
                if (!z10) {
                    this.w = true;
                }
                w(t1Var.getMessageObject(), z11, t1Var.getDelegate());
            } else if (e(t1Var.getMessageObject()) || !(t1Var.getMessageObject() == null || t1Var.getMessageObject().messageOwner == null || TextUtils.isEmpty(t1Var.getMessageObject().messageOwner.voiceTranscription))) {
                w(t1Var.getMessageObject(), z11, t1Var.getDelegate());
            } else if (t1Var.getDelegate() != null) {
                if (MessagesController.getInstance(t1Var.F7).transcribeAudioTrialWeeklyNumber > 0) {
                    t1Var.getDelegate().g0(3);
                } else {
                    t1Var.getDelegate().g0(0);
                }
            }
        }
    }

    public final void p(int i10, int i11, int i12, int i13, int i14) {
        Rect rect = this.u;
        if (i12 != rect.width() || i13 != rect.height()) {
            float f10 = i12 / 2.0f;
            float f11 = i14;
            float f12 = i13 / 2.0f;
            this.F = (float) ((Math.atan((f10 - f11) / f12) * 180.0d) / 3.141592653589793d);
            this.G = (float) ((Math.atan(f10 / (f12 - f11)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i10, i11, i10 + i12, i11 + i13);
        int min = Math.min(Math.min(i12, i13) / 2, i14);
        this.D = min;
        this.E = min * 2;
    }

    public final void q(float f10, int i10) {
        boolean z4 = this.b != i10;
        this.b = i10;
        this.c = i10;
        int k10 = i0.a.k(i10, (int) (Color.alpha(i10) * 0.156f));
        this.a = k10;
        this.e = f10;
        this.d = org.telegram.ui.ActionBar.j6.v(k10, i0.a.k(i10, (int) (Color.alpha(i10) * (org.telegram.ui.ActionBar.j6.I.q() ? 0.3f : 0.2f))));
        if (this.f == null) {
            this.f = new Paint();
        }
        this.f.setColor(this.a);
        this.f.setAlpha((int) ((1.0f - f10) * r2.getAlpha()));
        if (z4 || this.q == null) {
            int dp = AndroidUtilities.dp(8.0f);
            int i11 = this.d;
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, i11, i11);
            this.q = i02;
            i02.setCallback(this.r);
        }
        if (z4) {
            gj0 gj0Var = this.n;
            gj0Var.X = true;
            gj0Var.O(this.c, "Artboard Outlines");
            gj0Var.m();
            gj0Var.H(true);
            gj0Var.S(0L);
            int alpha = Color.alpha(i10);
            this.m = alpha;
            gj0Var.setAlpha(alpha);
            gj0 gj0Var2 = this.p;
            gj0Var2.X = true;
            gj0Var2.O(this.c, "Artboard Outlines");
            gj0Var2.m();
            gj0Var2.H(true);
            gj0Var2.S(0L);
            int alpha2 = Color.alpha(i10);
            this.o = alpha2;
            gj0Var2.setAlpha(alpha2);
        }
        if (this.g == null) {
            Paint paint = new Paint(1);
            this.g = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.g.setStrokeCap(Paint.Cap.ROUND);
        }
        this.g.setColor(i10);
    }

    public final void r(boolean z4, boolean z10) {
        this.k = z4;
        mo0 mo0Var = this.s;
        if (!mo0Var.z && z4 && mo0Var.B.c <= 0.0f) {
            mo0Var.A = SystemClock.elapsedRealtime();
        }
        mo0Var.z = z4;
        org.telegram.ui.Cells.t1 t1Var = mo0Var.n;
        if (t1Var != null) {
            t1Var.invalidate();
        }
        z5 z5Var = this.l;
        if (!z10) {
            z5Var.f(this.k, true);
        } else if (z5Var.c <= 0.0f) {
            this.t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.t1 t1Var2 = this.r;
        if (t1Var2 != null) {
            t1Var2.invalidate();
        }
    }

    public final void s(boolean z4, boolean z10) {
        org.telegram.ui.Cells.t1 t1Var;
        if (this.i != z4 && (t1Var = this.r) != null) {
            t1Var.invalidate();
        }
        this.i = z4;
        if (z10) {
            return;
        }
        this.j.f(z4, true);
    }

    public final void t(boolean z4, boolean z10) {
        boolean z11 = this.z;
        if (!z11 && z4 && this.w) {
            this.w = false;
            ((org.telegram.ui.Cells.i1) this).R.D3 = true;
        }
        this.z = z4;
        gj0 gj0Var = this.p;
        gj0 gj0Var2 = this.n;
        if (!z10) {
            this.y = z4;
            gj0Var2.stop();
            gj0Var.stop();
            gj0Var2.K(0);
            gj0Var.K(0);
        } else if (z4 && !z11) {
            this.y = false;
            gj0Var2.K(0);
            gj0Var.K(0);
            gj0Var.start();
        } else if (!z4 && z11) {
            this.y = true;
            gj0Var.K(0);
            gj0Var2.K(0);
            gj0Var2.start();
        }
        org.telegram.ui.Cells.t1 t1Var = this.r;
        if (t1Var != null) {
            t1Var.invalidate();
        }
    }

    public final int x() {
        return this.u.width();
    }
}
