package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class le extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.c = g6Var;
        this.a = new Paint(1);
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.X0) {
            se seVar = chatActivityEnterView.P0;
            float f10 = 1.0f;
            if (seVar != null && seVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.P0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.k6.Yd);
            Paint paint = this.a;
            paint.setColor(i02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.d.h5;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ae aeVar;
        long j10;
        long j11;
        long j12;
        float f10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        le leVar = chatActivityEnterView.W0;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        re reVar = chatActivityEnterView.D3;
        zf zfVar = chatActivityEnterView.G3;
        oe oeVar = chatActivityEnterView.G0;
        final int i10 = 0;
        if (!chatActivityEnterView.h5) {
            chatActivityEnterView.Y();
            final int i11 = 3;
            final int i12 = 1;
            if (motionEvent.getAction() == 0) {
                if (!ChatActivityEnterView.this.o4) {
                    TLRPC.Chat chat = xnVar == null ? null : xnVar.e;
                    TLRPC.UserFull userFull = xnVar == null ? chatActivityEnterView.H : xnVar.X7;
                    if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.a2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                        chatActivityEnterView.V2.s2();
                        return true;
                    }
                    if (!chatActivityEnterView.a2) {
                        zfVar.run();
                        return true;
                    }
                    chatActivityEnterView.F3 = false;
                    chatActivityEnterView.E3 = true;
                    AndroidUtilities.runOnUIThread(zfVar, 150L);
                    return true;
                }
                boolean z4 = chatActivityEnterView.a2;
                if (!z4 || chatActivityEnterView.F3) {
                    chatActivityEnterView.z2 = -1.0f;
                    if (!z4 || !chatActivityEnterView.Z0) {
                        if (chatActivityEnterView.B2 && chatActivityEnterView.c()) {
                            Activity activity = chatActivityEnterView.K2;
                            long a2 = xnVar.a();
                            k2 k2Var = new k2(9);
                            jc jcVar = new jc(i11);
                            Pattern pattern = z4.a;
                            org.telegram.ui.ActionBar.g6 g6Var = this.c;
                            z4.K(activity, a2, -1L, 0, false, k2Var, jcVar, new x4(g6Var), g6Var);
                        }
                        if (z4.d0(chatActivityEnterView.N, chatActivityEnterView.M2)) {
                            if (chatActivityEnterView.Z0) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.g1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.V2.t1();
                            } else {
                                if (chatActivityEnterView.o4) {
                                    chatActivityEnterView.F3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.L);
                                chatActivityEnterView.V2.e1(0);
                                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.g1;
                                if (slideTextView2 != null) {
                                    slideTextView2.setEnabled(false);
                                }
                            }
                            z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.je
                                public final /* synthetic */ le b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i12) {
                                        case 0:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 1:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 2:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        default:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        MediaController.getInstance().stopRecording(chatActivityEnterView.c() ? 3 : 1, true, 0, chatActivityEnterView.L, 0L);
                        chatActivityEnterView.V2.e1(0);
                    } else {
                        if (z4.d0(chatActivityEnterView.N, chatActivityEnterView.M2)) {
                            ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.g1;
                            if (slideTextView3 != null) {
                                slideTextView3.setEnabled(false);
                            }
                            chatActivityEnterView.V2.t1();
                            z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.je
                                public final /* synthetic */ le b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i10) {
                                        case 0:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 1:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 2:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        default:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.V2.u2(1, 0, chatActivityEnterView.L ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.O4, 0L, true);
                        chatActivityEnterView.O4 = 0L;
                        oeVar.setEffect(0L);
                    }
                    chatActivityEnterView.B2 = false;
                    chatActivityEnterView.d0 = false;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Components.ke
                        public final /* synthetic */ le b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = this.b.d;
                                    chatActivityEnterView2.c0 = null;
                                    chatActivityEnterView2.L1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                    chatActivityEnterView3.c0 = null;
                                    chatActivityEnterView3.L1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.c0 = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 200L);
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            final int i13 = 2;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.B2) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.J1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.o4;
                    if (!z10) {
                        if (!z10) {
                            if (chatActivityEnterView2.h4 == -1.0f) {
                                chatActivityEnterView2.g4 = y10;
                            }
                            chatActivityEnterView2.h4 = y10;
                            recordCircle.invalidate();
                            if (chatActivityEnterView2.n4 || chatActivityEnterView2.f4 < 0.7f || chatActivityEnterView2.g4 - chatActivityEnterView2.h4 < AndroidUtilities.dp(57.0f)) {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.J1;
                                float f11 = x10 - recordCircle2.C;
                                float f12 = y10 - recordCircle2.D;
                                float f13 = (f12 * f12) + (f11 * f11);
                                recordCircle2.D = y10;
                                recordCircle2.C = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.a4 && chatActivityEnterView3.c4 == 0.0f && f13 > recordCircle2.B) {
                                    f10 = 1.0f;
                                    chatActivityEnterView3.b4 = System.currentTimeMillis();
                                } else {
                                    f10 = 1.0f;
                                }
                                if (chatActivityEnterView.z2 == -1.0f) {
                                    chatActivityEnterView.z2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.i1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.A2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.A2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x11 = leVar.getX() + x10;
                                float f14 = chatActivityEnterView.z2;
                                float f15 = ((x11 - f14) / chatActivityEnterView.A2) + f10;
                                if (f14 != -1.0f) {
                                    float f16 = f15 > f10 ? 1.0f : f15 < 0.0f ? 0.0f : f15;
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.g1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.r = f16;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f16);
                                    f15 = f16;
                                }
                                if (f15 == 0.0f) {
                                    if (chatActivityEnterView.a2 && chatActivityEnterView.Z0) {
                                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                                        chatActivityEnterView.V2.u2(2, 0, chatActivityEnterView.L ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.O4, 0L, true);
                                        chatActivityEnterView.O4 = 0L;
                                        oeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.V2.e1(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.L, 0L);
                                    }
                                    chatActivityEnterView.B2 = false;
                                    chatActivityEnterView.L1(5, true);
                                    return true;
                                }
                            } else {
                                chatActivityEnterView2.o4 = true;
                                ig igVar = chatActivityEnterView2.K1;
                                if (igVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    igVar.a();
                                    qh.f3 f3Var = new qh.f3(igVar.getContext(), 2);
                                    igVar.a = f3Var;
                                    f3Var.m(1.0f, 0.0f);
                                    igVar.a.q(true);
                                    igVar.a.t(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    igVar.addView(igVar.a, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    qh.f3 f3Var2 = igVar.a;
                                    f3Var2.i0 = new gg(igVar, f3Var2, 3);
                                    f3Var2.v();
                                }
                            }
                        }
                        ChatActivityEnterView.m(chatActivityEnterView);
                        return false;
                    }
                }
                return true;
            }
            if (motionEvent.getAction() == 3 && chatActivityEnterView.B2) {
                if (chatActivityEnterView.f4 >= 0.7f) {
                    chatActivityEnterView.o4 = true;
                    ChatActivityEnterView.m(chatActivityEnterView);
                    return false;
                }
                if (chatActivityEnterView.a2 && chatActivityEnterView.Z0) {
                    CameraController.getInstance().cancelOnInitRunnable(reVar);
                    chatActivityEnterView.V2.u2(2, 0, chatActivityEnterView.L ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.O4, 0L, true);
                    j12 = 0;
                    chatActivityEnterView.O4 = 0L;
                    oeVar.setEffect(0L);
                } else {
                    chatActivityEnterView.V2.e1(0);
                    MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.L, 0L);
                    j12 = 0;
                }
                chatActivityEnterView.f1 = j12;
                chatActivityEnterView.B2 = false;
                chatActivityEnterView.L1(5, true);
                return false;
            }
            ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.J1;
            if ((recordCircle3 == null || !ChatActivityEnterView.this.o4) && ((aeVar = chatActivityEnterView.b1) == null || aeVar.getVisibility() != 0)) {
                if ((((leVar.getX() + motionEvent.getX()) - chatActivityEnterView.z2) / chatActivityEnterView.A2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.a2 && chatActivityEnterView.Z0) {
                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                        chatActivityEnterView.V2.u2(2, 0, chatActivityEnterView.L ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.O4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.O4 = 0L;
                        oeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.V2.e1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.L, 0L);
                        j11 = 0;
                    }
                    chatActivityEnterView.f1 = j11;
                    chatActivityEnterView.B2 = false;
                    chatActivityEnterView.L1(5, true);
                    return true;
                }
                if (chatActivityEnterView.E3) {
                    AndroidUtilities.cancelRunOnUIThread(zfVar);
                    if (chatActivityEnterView.v0 && chatActivityEnterView.u0) {
                        chatActivityEnterView.V2.Y(!chatActivityEnterView.Z0);
                        chatActivityEnterView.k1(!chatActivityEnterView.Z0, true);
                    } else {
                        chatActivityEnterView.V2.s2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                }
                boolean z11 = chatActivityEnterView.a2;
                if (!z11 || chatActivityEnterView.F3) {
                    chatActivityEnterView.z2 = -1.0f;
                    if (!z11 || !chatActivityEnterView.Z0) {
                        j10 = 0;
                        if (!chatActivityEnterView.v0) {
                            chatActivityEnterView.V2.s2();
                        } else {
                            if (z4.d0(chatActivityEnterView.N, chatActivityEnterView.M2)) {
                                if (chatActivityEnterView.o4) {
                                    chatActivityEnterView.F3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.L);
                                chatActivityEnterView.V2.e1(0);
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.g1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.je
                                    public final /* synthetic */ le b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.messenger.Utilities.Callback
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (i11) {
                                            case 0:
                                                this.b.d.T0(0, true, 0, false, l10.longValue());
                                                break;
                                            case 1:
                                                this.b.d.T0(0, true, 0, false, l10.longValue());
                                                break;
                                            case 2:
                                                this.b.d.T0(0, true, 0, false, l10.longValue());
                                                break;
                                            default:
                                                this.b.d.T0(0, true, 0, false, l10.longValue());
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                            if (chatActivityEnterView.B2 && chatActivityEnterView.c()) {
                                Activity activity2 = chatActivityEnterView.K2;
                                long a10 = xnVar.a();
                                k2 k2Var2 = new k2(10);
                                jc jcVar2 = new jc(4);
                                org.telegram.ui.ActionBar.g6 g6Var2 = this.c;
                                z4.K(activity2, a10, -1L, 0, false, k2Var2, jcVar2, new x4(g6Var2), g6Var2);
                            }
                            chatActivityEnterView.V2.e1(0);
                            MediaController.getInstance().stopRecording(chatActivityEnterView.c() ? 3 : 1, true, 0, chatActivityEnterView.L, 0L);
                        }
                    } else {
                        if (z4.d0(chatActivityEnterView.N, chatActivityEnterView.M2)) {
                            ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.g1;
                            if (slideTextView6 != null) {
                                slideTextView6.setEnabled(false);
                            }
                            chatActivityEnterView.V2.t1();
                            z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.je
                                public final /* synthetic */ le b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i13) {
                                        case 0:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 1:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 2:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        default:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                        chatActivityEnterView.V2.u2(1, 0, chatActivityEnterView.L ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.O4, 0L, true);
                        j10 = 0;
                        chatActivityEnterView.O4 = 0L;
                        oeVar.setEffect(0L);
                    }
                    chatActivityEnterView.B2 = false;
                    chatActivityEnterView.d0 = false;
                    Runnable runnable2 = new Runnable(this) { // from class: org.telegram.ui.Components.ke
                        public final /* synthetic */ le b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView22 = this.b.d;
                                    chatActivityEnterView22.c0 = null;
                                    chatActivityEnterView22.L1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView32 = this.b.d;
                                    chatActivityEnterView32.c0 = null;
                                    chatActivityEnterView32.L1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.c0 = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, chatActivityEnterView.u4 ? 500L : j10);
                    return true;
                }
                return true;
            }
            if (chatActivityEnterView.E3) {
                AndroidUtilities.cancelRunOnUIThread(zfVar);
            }
        }
        return false;
    }
}
