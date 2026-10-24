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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ue extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.c = g6Var;
        this.a = new Paint(1);
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.a1) {
            bf bfVar = chatActivityEnterView.S0;
            float f7 = 1.0f;
            if (bfVar != null && bfVar.getVisibility() == 0) {
                f7 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Yd);
            Paint paint = this.a;
            paint.setColor(f02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.d.p5;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ke keVar;
        long j10;
        long j11;
        long j12;
        float f7;
        ChatActivityEnterView chatActivityEnterView = this.d;
        ue ueVar = chatActivityEnterView.Z0;
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        af afVar = chatActivityEnterView.H3;
        ig igVar = chatActivityEnterView.K3;
        xe xeVar = chatActivityEnterView.J0;
        final int i10 = 0;
        if (!chatActivityEnterView.p5) {
            chatActivityEnterView.V();
            final int i11 = 3;
            final int i12 = 1;
            if (motionEvent.getAction() == 0) {
                if (!ChatActivityEnterView.this.s4) {
                    TLRPC.Chat chat = snVar == null ? null : snVar.e;
                    TLRPC.UserFull userFull = snVar == null ? chatActivityEnterView.K : snVar.m8;
                    if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.e2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                        chatActivityEnterView.Z2.Y1();
                        return true;
                    }
                    if (!chatActivityEnterView.e2) {
                        igVar.run();
                        return true;
                    }
                    chatActivityEnterView.J3 = false;
                    chatActivityEnterView.I3 = true;
                    AndroidUtilities.runOnUIThread(igVar, 150L);
                    return true;
                }
                boolean z10 = chatActivityEnterView.e2;
                if (!z10 || chatActivityEnterView.J3) {
                    chatActivityEnterView.D2 = -1.0f;
                    if (!z10 || !chatActivityEnterView.c1) {
                        if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                            Activity activity = chatActivityEnterView.O2;
                            long a2 = snVar.a();
                            e2 e2Var = new e2(16);
                            rc rcVar = new rc(i11);
                            Pattern pattern = f5.a;
                            org.telegram.ui.ActionBar.g6 g6Var = this.c;
                            f5.K(activity, a2, -1L, 0, false, e2Var, rcVar, new c5(g6Var), g6Var);
                        }
                        if (f5.d0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                            if (chatActivityEnterView.c1) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.i1();
                            } else {
                                if (chatActivityEnterView.s4) {
                                    chatActivityEnterView.J3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                chatActivityEnterView.Z2.X0(0);
                                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.k1;
                                if (slideTextView2 != null) {
                                    slideTextView2.setEnabled(false);
                                }
                            }
                            f5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.se
                                public final /* synthetic */ ue b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Long l4 = (Long) obj;
                                    switch (i12) {
                                        case 0:
                                            this.b.d.R0(0, true, 0, false, l4.longValue());
                                            break;
                                        case 1:
                                            this.b.d.R0(0, true, 0, false, l4.longValue());
                                            break;
                                        case 2:
                                            this.b.d.R0(0, true, 0, false, l4.longValue());
                                            break;
                                        default:
                                            this.b.d.R0(0, true, 0, false, l4.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        MediaController.getInstance().stopRecording(chatActivityEnterView.c() ? 3 : 1, true, 0, chatActivityEnterView.O, 0L);
                        chatActivityEnterView.Z2.X0(0);
                    } else {
                        if (f5.d0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                            ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.k1;
                            if (slideTextView3 != null) {
                                slideTextView3.setEnabled(false);
                            }
                            chatActivityEnterView.Z2.i1();
                            f5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.se
                                public final /* synthetic */ ue b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Long l4 = (Long) obj;
                                    switch (i10) {
                                        case 0:
                                            this.b.d.R0(0, true, 0, false, l4.longValue());
                                            break;
                                        case 1:
                                            this.b.d.R0(0, true, 0, false, l4.longValue());
                                            break;
                                        case 2:
                                            this.b.d.R0(0, true, 0, false, l4.longValue());
                                            break;
                                        default:
                                            this.b.d.R0(0, true, 0, false, l4.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.Z2.a2(1, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    }
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.g0 = false;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Components.te
                        public final /* synthetic */ ue b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = this.b.d;
                                    chatActivityEnterView2.f0 = null;
                                    chatActivityEnterView2.I1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                    chatActivityEnterView3.f0 = null;
                                    chatActivityEnterView3.I1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.f0 = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 200L);
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            final int i13 = 2;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.F2) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.s4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.l4 == -1.0f) {
                                chatActivityEnterView2.k4 = y3;
                            }
                            chatActivityEnterView2.l4 = y3;
                            recordCircle.invalidate();
                            if (chatActivityEnterView2.r4 || chatActivityEnterView2.j4 < 0.7f || chatActivityEnterView2.k4 - chatActivityEnterView2.l4 < AndroidUtilities.dp(57.0f)) {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                                float f10 = x10 - recordCircle2.F;
                                float f11 = y3 - recordCircle2.G;
                                float f12 = (f11 * f11) + (f10 * f10);
                                recordCircle2.G = y3;
                                recordCircle2.F = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.e4 && chatActivityEnterView3.g4 == 0.0f && f12 > recordCircle2.E) {
                                    f7 = 1.0f;
                                    chatActivityEnterView3.f4 = System.currentTimeMillis();
                                } else {
                                    f7 = 1.0f;
                                }
                                if (chatActivityEnterView.D2 == -1.0f) {
                                    chatActivityEnterView.D2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.m1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.E2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.E2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x11 = ueVar.getX() + x10;
                                float f13 = chatActivityEnterView.D2;
                                float f14 = ((x11 - f13) / chatActivityEnterView.E2) + f7;
                                if (f13 != -1.0f) {
                                    float f15 = f14 > f7 ? f7 : f14 < 0.0f ? 0.0f : f14;
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.k1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.r = f15;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f15);
                                    f14 = f15;
                                }
                                if (f14 == 0.0f) {
                                    if (chatActivityEnterView.e2 && chatActivityEnterView.c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                                        chatActivityEnterView.Z2.a2(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                                        chatActivityEnterView.S4 = 0L;
                                        xeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Z2.X0(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                                    }
                                    chatActivityEnterView.F2 = false;
                                    chatActivityEnterView.I1(5, true);
                                    return true;
                                }
                            } else {
                                chatActivityEnterView2.s4 = true;
                                sg sgVar = chatActivityEnterView2.O1;
                                if (sgVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    sgVar.a();
                                    ei.x3 x3Var = new ei.x3(sgVar.getContext(), 2);
                                    sgVar.a = x3Var;
                                    x3Var.l(1.0f, 0.0f);
                                    sgVar.a.p(true);
                                    sgVar.a.s(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    sgVar.addView(sgVar.a, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    ei.x3 x3Var2 = sgVar.a;
                                    x3Var2.l0 = new qg(sgVar, x3Var2, 3);
                                    x3Var2.u();
                                }
                            }
                        }
                        ChatActivityEnterView.j(chatActivityEnterView);
                        return false;
                    }
                }
                return true;
            }
            if (motionEvent.getAction() == 3 && chatActivityEnterView.F2) {
                if (chatActivityEnterView.j4 >= 0.7f) {
                    chatActivityEnterView.s4 = true;
                    ChatActivityEnterView.j(chatActivityEnterView);
                    return false;
                }
                if (chatActivityEnterView.e2 && chatActivityEnterView.c1) {
                    CameraController.getInstance().cancelOnInitRunnable(afVar);
                    chatActivityEnterView.Z2.a2(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                    j12 = 0;
                    chatActivityEnterView.S4 = 0L;
                    xeVar.setEffect(0L);
                } else {
                    chatActivityEnterView.Z2.X0(0);
                    MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                    j12 = 0;
                }
                chatActivityEnterView.i1 = j12;
                chatActivityEnterView.F2 = false;
                chatActivityEnterView.I1(5, true);
                return false;
            }
            ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.N1;
            if ((recordCircle3 == null || !ChatActivityEnterView.this.s4) && ((keVar = chatActivityEnterView.e1) == null || keVar.getVisibility() != 0)) {
                if ((((ueVar.getX() + motionEvent.getX()) - chatActivityEnterView.D2) / chatActivityEnterView.E2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.e2 && chatActivityEnterView.c1) {
                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                        chatActivityEnterView.Z2.a2(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.X0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j11 = 0;
                    }
                    chatActivityEnterView.i1 = j11;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.I1(5, true);
                    return true;
                }
                if (chatActivityEnterView.I3) {
                    AndroidUtilities.cancelRunOnUIThread(igVar);
                    if (chatActivityEnterView.y0 && chatActivityEnterView.x0) {
                        chatActivityEnterView.Z2.a0(!chatActivityEnterView.c1);
                        chatActivityEnterView.h1(!chatActivityEnterView.c1, true);
                    } else {
                        chatActivityEnterView.Z2.Y1();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                }
                boolean z12 = chatActivityEnterView.e2;
                if (!z12 || chatActivityEnterView.J3) {
                    chatActivityEnterView.D2 = -1.0f;
                    if (!z12 || !chatActivityEnterView.c1) {
                        j10 = 0;
                        if (!chatActivityEnterView.y0) {
                            chatActivityEnterView.Z2.Y1();
                        } else {
                            if (f5.d0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.s4) {
                                    chatActivityEnterView.J3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                chatActivityEnterView.Z2.X0(0);
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.k1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                f5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.se
                                    public final /* synthetic */ ue b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.messenger.Utilities.Callback
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (i11) {
                                            case 0:
                                                this.b.d.R0(0, true, 0, false, l4.longValue());
                                                break;
                                            case 1:
                                                this.b.d.R0(0, true, 0, false, l4.longValue());
                                                break;
                                            case 2:
                                                this.b.d.R0(0, true, 0, false, l4.longValue());
                                                break;
                                            default:
                                                this.b.d.R0(0, true, 0, false, l4.longValue());
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                            if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                Activity activity2 = chatActivityEnterView.O2;
                                long a10 = snVar.a();
                                e2 e2Var2 = new e2(17);
                                rc rcVar2 = new rc(4);
                                org.telegram.ui.ActionBar.g6 g6Var2 = this.c;
                                f5.K(activity2, a10, -1L, 0, false, e2Var2, rcVar2, new c5(g6Var2), g6Var2);
                            }
                            chatActivityEnterView.Z2.X0(0);
                            MediaController.getInstance().stopRecording(chatActivityEnterView.c() ? 3 : 1, true, 0, chatActivityEnterView.O, 0L);
                        }
                    } else {
                        if (f5.d0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                            ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.k1;
                            if (slideTextView6 != null) {
                                slideTextView6.setEnabled(false);
                            }
                            chatActivityEnterView.Z2.i1();
                            f5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.se
                                public final /* synthetic */ ue b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Long l4 = (Long) obj;
                                    switch (i13) {
                                        case 0:
                                            this.b.d.R0(0, true, 0, false, l4.longValue());
                                            break;
                                        case 1:
                                            this.b.d.R0(0, true, 0, false, l4.longValue());
                                            break;
                                        case 2:
                                            this.b.d.R0(0, true, 0, false, l4.longValue());
                                            break;
                                        default:
                                            this.b.d.R0(0, true, 0, false, l4.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                        chatActivityEnterView.Z2.a2(1, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                        j10 = 0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    }
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.g0 = false;
                    Runnable runnable2 = new Runnable(this) { // from class: org.telegram.ui.Components.te
                        public final /* synthetic */ ue b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView22 = this.b.d;
                                    chatActivityEnterView22.f0 = null;
                                    chatActivityEnterView22.I1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView32 = this.b.d;
                                    chatActivityEnterView32.f0 = null;
                                    chatActivityEnterView32.I1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.f0 = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, chatActivityEnterView.y4 ? 500L : j10);
                    return true;
                }
                return true;
            }
            if (chatActivityEnterView.I3) {
                AndroidUtilities.cancelRunOnUIThread(igVar);
            }
        }
        return false;
    }
}
