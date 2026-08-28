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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class le extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.c = b6Var;
        this.a = new Paint(1);
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.W0) {
            se seVar = chatActivityEnterView.O0;
            float f10 = 1.0f;
            if (seVar != null && seVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.O0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int h02 = chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.Yd);
            Paint paint = this.a;
            paint.setColor(h02);
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
        return !this.d.g5;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ae aeVar;
        long j10;
        long j11;
        long j12;
        float f10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        le leVar = chatActivityEnterView.V0;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        re reVar = chatActivityEnterView.C3;
        zf zfVar = chatActivityEnterView.F3;
        oe oeVar = chatActivityEnterView.F0;
        final int i9 = 0;
        if (!chatActivityEnterView.g5) {
            chatActivityEnterView.X();
            final int i10 = 3;
            final int i11 = 1;
            if (motionEvent.getAction() == 0) {
                if (!ChatActivityEnterView.this.n4) {
                    TLRPC.Chat chat = qnVar == null ? null : qnVar.e;
                    TLRPC.UserFull userFull = qnVar == null ? chatActivityEnterView.G : qnVar.W7;
                    if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.Z1)) || (userFull != null && userFull.voice_messages_forbidden)) {
                        chatActivityEnterView.U2.Q1();
                        return true;
                    }
                    if (!chatActivityEnterView.Z1) {
                        zfVar.run();
                        return true;
                    }
                    chatActivityEnterView.E3 = false;
                    chatActivityEnterView.D3 = true;
                    AndroidUtilities.runOnUIThread(zfVar, 150L);
                    return true;
                }
                boolean z10 = chatActivityEnterView.Z1;
                if (!z10 || chatActivityEnterView.E3) {
                    chatActivityEnterView.y2 = -1.0f;
                    if (!z10 || !chatActivityEnterView.Y0) {
                        if (chatActivityEnterView.A2 && chatActivityEnterView.c()) {
                            Activity activity = chatActivityEnterView.J2;
                            long a2 = qnVar.a();
                            g2 g2Var = new g2(10);
                            hc hcVar = new hc(i10);
                            Pattern pattern = y4.a;
                            org.telegram.ui.ActionBar.b6 b6Var = this.c;
                            y4.K(activity, a2, -1L, 0, false, g2Var, hcVar, new w4(b6Var), b6Var);
                        }
                        if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                            if (chatActivityEnterView.Y0) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.U2.c1();
                            } else {
                                if (chatActivityEnterView.n4) {
                                    chatActivityEnterView.E3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                                chatActivityEnterView.U2.L0(0);
                                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f1;
                                if (slideTextView2 != null) {
                                    slideTextView2.setEnabled(false);
                                }
                            }
                            y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.je
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
                        MediaController.getInstance().stopRecording(chatActivityEnterView.c() ? 3 : 1, true, 0, chatActivityEnterView.K, 0L);
                        chatActivityEnterView.U2.L0(0);
                    } else {
                        if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                            ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f1;
                            if (slideTextView3 != null) {
                                slideTextView3.setEnabled(false);
                            }
                            chatActivityEnterView.U2.c1();
                            y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.je
                                public final /* synthetic */ le b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i9) {
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
                        chatActivityEnterView.U2.U1(1, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, 0L, true);
                        chatActivityEnterView.N4 = 0L;
                        oeVar.setEffect(0L);
                    }
                    chatActivityEnterView.A2 = false;
                    chatActivityEnterView.c0 = false;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Components.ke
                        public final /* synthetic */ le b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i9) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = this.b.d;
                                    chatActivityEnterView2.b0 = null;
                                    chatActivityEnterView2.L1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                    chatActivityEnterView3.b0 = null;
                                    chatActivityEnterView3.L1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.b0 = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 200L);
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            final int i12 = 2;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.A2) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.n4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.g4 == -1.0f) {
                                chatActivityEnterView2.f4 = y10;
                            }
                            chatActivityEnterView2.g4 = y10;
                            recordCircle.invalidate();
                            if (chatActivityEnterView2.m4 || chatActivityEnterView2.e4 < 0.7f || chatActivityEnterView2.f4 - chatActivityEnterView2.g4 < AndroidUtilities.dp(57.0f)) {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.I1;
                                float f11 = x10 - recordCircle2.B;
                                float f12 = y10 - recordCircle2.C;
                                float f13 = (f12 * f12) + (f11 * f11);
                                recordCircle2.C = y10;
                                recordCircle2.B = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.Z3 && chatActivityEnterView3.b4 == 0.0f && f13 > recordCircle2.A) {
                                    f10 = 1.0f;
                                    chatActivityEnterView3.a4 = System.currentTimeMillis();
                                } else {
                                    f10 = 1.0f;
                                }
                                if (chatActivityEnterView.y2 == -1.0f) {
                                    chatActivityEnterView.y2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.h1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.z2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.z2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x11 = leVar.getX() + x10;
                                float f14 = chatActivityEnterView.y2;
                                float f15 = ((x11 - f14) / chatActivityEnterView.z2) + f10;
                                if (f14 != -1.0f) {
                                    float f16 = f15 > f10 ? 1.0f : f15 < 0.0f ? 0.0f : f15;
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.r = f16;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f16);
                                    f15 = f16;
                                }
                                if (f15 == 0.0f) {
                                    if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                                        chatActivityEnterView.U2.U1(2, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, 0L, true);
                                        chatActivityEnterView.N4 = 0L;
                                        oeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.U2.L0(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                                    }
                                    chatActivityEnterView.A2 = false;
                                    chatActivityEnterView.L1(5, true);
                                    return true;
                                }
                            } else {
                                chatActivityEnterView2.n4 = true;
                                ig igVar = chatActivityEnterView2.J1;
                                if (igVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    igVar.a();
                                    kh.x3 x3Var = new kh.x3(igVar.getContext(), 2);
                                    igVar.a = x3Var;
                                    x3Var.m(1.0f, 0.0f);
                                    igVar.a.q(true);
                                    igVar.a.t(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    igVar.addView(igVar.a, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    kh.x3 x3Var2 = igVar.a;
                                    x3Var2.h0 = new gg(igVar, x3Var2, 3);
                                    x3Var2.v();
                                }
                            }
                        }
                        ChatActivityEnterView.m(chatActivityEnterView);
                        return false;
                    }
                }
                return true;
            }
            if (motionEvent.getAction() == 3 && chatActivityEnterView.A2) {
                if (chatActivityEnterView.e4 >= 0.7f) {
                    chatActivityEnterView.n4 = true;
                    ChatActivityEnterView.m(chatActivityEnterView);
                    return false;
                }
                if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                    CameraController.getInstance().cancelOnInitRunnable(reVar);
                    chatActivityEnterView.U2.U1(2, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, 0L, true);
                    j12 = 0;
                    chatActivityEnterView.N4 = 0L;
                    oeVar.setEffect(0L);
                } else {
                    chatActivityEnterView.U2.L0(0);
                    MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                    j12 = 0;
                }
                chatActivityEnterView.e1 = j12;
                chatActivityEnterView.A2 = false;
                chatActivityEnterView.L1(5, true);
                return false;
            }
            ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.I1;
            if ((recordCircle3 == null || !ChatActivityEnterView.this.n4) && ((aeVar = chatActivityEnterView.a1) == null || aeVar.getVisibility() != 0)) {
                if ((((leVar.getX() + motionEvent.getX()) - chatActivityEnterView.y2) / chatActivityEnterView.z2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                        chatActivityEnterView.U2.U1(2, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.N4 = 0L;
                        oeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.U2.L0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                        j11 = 0;
                    }
                    chatActivityEnterView.e1 = j11;
                    chatActivityEnterView.A2 = false;
                    chatActivityEnterView.L1(5, true);
                    return true;
                }
                if (chatActivityEnterView.D3) {
                    AndroidUtilities.cancelRunOnUIThread(zfVar);
                    if (chatActivityEnterView.u0 && chatActivityEnterView.t0) {
                        chatActivityEnterView.U2.H(!chatActivityEnterView.Y0);
                        chatActivityEnterView.k1(!chatActivityEnterView.Y0, true);
                    } else {
                        chatActivityEnterView.U2.Q1();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                }
                boolean z12 = chatActivityEnterView.Z1;
                if (!z12 || chatActivityEnterView.E3) {
                    chatActivityEnterView.y2 = -1.0f;
                    if (!z12 || !chatActivityEnterView.Y0) {
                        j10 = 0;
                        if (!chatActivityEnterView.u0) {
                            chatActivityEnterView.U2.Q1();
                        } else {
                            if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                                if (chatActivityEnterView.n4) {
                                    chatActivityEnterView.E3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                                chatActivityEnterView.U2.L0(0);
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.je
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
                            if (chatActivityEnterView.A2 && chatActivityEnterView.c()) {
                                Activity activity2 = chatActivityEnterView.J2;
                                long a3 = qnVar.a();
                                g2 g2Var2 = new g2(11);
                                hc hcVar2 = new hc(4);
                                org.telegram.ui.ActionBar.b6 b6Var2 = this.c;
                                y4.K(activity2, a3, -1L, 0, false, g2Var2, hcVar2, new w4(b6Var2), b6Var2);
                            }
                            chatActivityEnterView.U2.L0(0);
                            MediaController.getInstance().stopRecording(chatActivityEnterView.c() ? 3 : 1, true, 0, chatActivityEnterView.K, 0L);
                        }
                    } else {
                        if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                            ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f1;
                            if (slideTextView6 != null) {
                                slideTextView6.setEnabled(false);
                            }
                            chatActivityEnterView.U2.c1();
                            y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.je
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
                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                        chatActivityEnterView.U2.U1(1, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, 0L, true);
                        j10 = 0;
                        chatActivityEnterView.N4 = 0L;
                        oeVar.setEffect(0L);
                    }
                    chatActivityEnterView.A2 = false;
                    chatActivityEnterView.c0 = false;
                    Runnable runnable2 = new Runnable(this) { // from class: org.telegram.ui.Components.ke
                        public final /* synthetic */ le b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView22 = this.b.d;
                                    chatActivityEnterView22.b0 = null;
                                    chatActivityEnterView22.L1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView32 = this.b.d;
                                    chatActivityEnterView32.b0 = null;
                                    chatActivityEnterView32.L1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.b0 = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, chatActivityEnterView.t4 ? 500L : j10);
                    return true;
                }
                return true;
            }
            if (chatActivityEnterView.D3) {
                AndroidUtilities.cancelRunOnUIThread(zfVar);
            }
        }
        return false;
    }
}
