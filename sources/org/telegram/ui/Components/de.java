package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class de extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.c = f6Var;
        this.a = new Paint(1);
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.a1) {
            ke keVar = chatActivityEnterView.S0;
            float f10 = 1.0f;
            if (keVar != null && keVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float N = org.telegram.messenger.g0.N(19.0f);
            int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Me);
            Paint paint = this.a;
            paint.setColor(f02);
            float N2 = org.telegram.messenger.g0.N(3.0f);
            float N3 = org.telegram.messenger.g0.N(38.0f);
            float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.N(38.0f)) - N2;
            float measuredHeight = (getMeasuredHeight() - N3) - N2;
            float measuredWidth2 = getMeasuredWidth() - N2;
            float measuredHeight2 = getMeasuredHeight() - N2;
            RectF rectF = this.b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, N, N, paint);
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
        ud udVar;
        long j3;
        long j10;
        long j11;
        ChatActivityEnterView chatActivityEnterView = this.d;
        de deVar = chatActivityEnterView.Z0;
        org.telegram.ui.an anVar = chatActivityEnterView.P2;
        je jeVar = chatActivityEnterView.H3;
        rf rfVar = chatActivityEnterView.K3;
        ge geVar = chatActivityEnterView.J0;
        final int i7 = 0;
        if (!chatActivityEnterView.p5) {
            chatActivityEnterView.U();
            final int i10 = 1;
            if (motionEvent.getAction() == 0) {
                if (!ChatActivityEnterView.this.s4) {
                    TLRPC.Chat chat = anVar == null ? null : anVar.e;
                    TLRPC.UserFull userFull = anVar == null ? chatActivityEnterView.K : anVar.q8;
                    if ((chat != null && !org.telegram.messenger.t3.v(chat) && (!org.telegram.messenger.t3.s(chat) || !chatActivityEnterView.e2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                        chatActivityEnterView.Z2.X1();
                        return true;
                    }
                    if (!chatActivityEnterView.e2) {
                        rfVar.run();
                        return true;
                    }
                    chatActivityEnterView.J3 = false;
                    chatActivityEnterView.I3 = true;
                    org.telegram.messenger.g0.i3(rfVar, 150L);
                    return true;
                }
                boolean z9 = chatActivityEnterView.e2;
                if (!z9 || chatActivityEnterView.J3) {
                    chatActivityEnterView.D2 = -1.0f;
                    if (!z9 || !chatActivityEnterView.c1) {
                        if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                            Activity activity = chatActivityEnterView.O2;
                            long a10 = anVar.a();
                            k2 k2Var = new k2(11);
                            org.telegram.messenger.pd pdVar = new org.telegram.messenger.pd(22);
                            Pattern pattern = v4.a;
                            org.telegram.ui.ActionBar.f6 f6Var = this.c;
                            v4.H(activity, a10, -1L, 0, false, k2Var, pdVar, new s4(f6Var), f6Var);
                        }
                        if (v4.a0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                            if (chatActivityEnterView.c1) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.c1();
                            } else {
                                if (chatActivityEnterView.s4) {
                                    chatActivityEnterView.J3 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.O);
                                chatActivityEnterView.Z2.R0(0);
                                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.k1;
                                if (slideTextView2 != null) {
                                    slideTextView2.setEnabled(false);
                                }
                            }
                            v4.X(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.Components.be
                                public final /* synthetic */ de b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i10) {
                                        case 0:
                                            this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        MediaController.B().B0(chatActivityEnterView.c() ? 3 : 1, 0, true, chatActivityEnterView.O);
                        chatActivityEnterView.Z2.R0(0);
                    } else {
                        if (v4.a0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                            ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.k1;
                            if (slideTextView3 != null) {
                                slideTextView3.setEnabled(false);
                            }
                            chatActivityEnterView.Z2.c1();
                            v4.X(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.Components.be
                                public final /* synthetic */ de b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i7) {
                                        case 0:
                                            this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.Z2.Z1(1, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                        chatActivityEnterView.S4 = 0L;
                        geVar.setEffect(0L);
                    }
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.g0 = false;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Components.ce
                        public final /* synthetic */ de b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = this.b.d;
                                    chatActivityEnterView2.f0 = null;
                                    chatActivityEnterView2.N1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                    chatActivityEnterView3.f0 = null;
                                    chatActivityEnterView3.N1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.f0 = runnable;
                    org.telegram.messenger.g0.i3(runnable, 200L);
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            final int i11 = 2;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.F2) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.s4;
                    if (!z10) {
                        if (!z10) {
                            if (chatActivityEnterView2.l4 == -1.0f) {
                                chatActivityEnterView2.k4 = y10;
                            }
                            chatActivityEnterView2.l4 = y10;
                            recordCircle.invalidate();
                            if (chatActivityEnterView2.r4 || chatActivityEnterView2.j4 < 0.7f || chatActivityEnterView2.k4 - chatActivityEnterView2.l4 < org.telegram.messenger.g0.L(57.0f)) {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                                float f10 = x10 - recordCircle2.F;
                                float f11 = y10 - recordCircle2.G;
                                float f12 = (f11 * f11) + (f10 * f10);
                                recordCircle2.G = y10;
                                recordCircle2.F = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.e4 && chatActivityEnterView3.g4 == 0.0f && f12 > recordCircle2.E) {
                                    chatActivityEnterView3.f4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.D2 == -1.0f) {
                                    chatActivityEnterView.D2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.m1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.E2 = measuredWidth;
                                    if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
                                        chatActivityEnterView.E2 = org.telegram.messenger.g0.L(140.0f);
                                    }
                                }
                                float x11 = deVar.getX() + x10;
                                float f13 = chatActivityEnterView.D2;
                                float f14 = ((x11 - f13) / chatActivityEnterView.E2) + 1.0f;
                                if (f13 != -1.0f) {
                                    float f15 = f14 <= 1.0f ? f14 < 0.0f ? 0.0f : f14 : 1.0f;
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.k1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.r = f15;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f15);
                                    f14 = f15;
                                }
                                if (f14 == 0.0f) {
                                    if (chatActivityEnterView.e2 && chatActivityEnterView.c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(jeVar);
                                        chatActivityEnterView.Z2.Z1(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                                        chatActivityEnterView.S4 = 0L;
                                        geVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Z2.R0(0);
                                        MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                                    }
                                    chatActivityEnterView.F2 = false;
                                    chatActivityEnterView.N1(5, true);
                                    return true;
                                }
                            } else {
                                chatActivityEnterView2.s4 = true;
                                ag agVar = chatActivityEnterView2.O1;
                                if (agVar != null && org.telegram.messenger.qp.e1().getInt("voicepausehint", 0) <= 3) {
                                    agVar.a();
                                    fi.m3 m3Var = new fi.m3(agVar.getContext(), 2);
                                    agVar.a = m3Var;
                                    m3Var.o(1.0f, 0.0f);
                                    agVar.a.r(true);
                                    agVar.a.u(org.telegram.messenger.hd.M0(2131743513, null));
                                    agVar.b0.setHintGlass(agVar.a);
                                    org.telegram.messenger.qp.e1().edit().putInt("voicepausehint", org.telegram.messenger.qp.e1().getInt("voicepausehint", 0) + 1).apply();
                                    agVar.addView(agVar.a, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 54.0f, 58.0f));
                                    fi.m3 m3Var2 = agVar.a;
                                    m3Var2.q0 = new yf(agVar, m3Var2, 3);
                                    m3Var2.w();
                                }
                            }
                        }
                        chatActivityEnterView.z1();
                        return false;
                    }
                }
                return true;
            }
            if (motionEvent.getAction() == 3 && chatActivityEnterView.F2) {
                if (chatActivityEnterView.j4 >= 0.7f) {
                    chatActivityEnterView.s4 = true;
                    chatActivityEnterView.z1();
                    return false;
                }
                if (chatActivityEnterView.e2 && chatActivityEnterView.c1) {
                    CameraController.getInstance().cancelOnInitRunnable(jeVar);
                    chatActivityEnterView.Z2.Z1(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                    j11 = 0;
                    chatActivityEnterView.S4 = 0L;
                    geVar.setEffect(0L);
                } else {
                    j11 = 0;
                    chatActivityEnterView.Z2.R0(0);
                    MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                }
                chatActivityEnterView.i1 = j11;
                chatActivityEnterView.F2 = false;
                chatActivityEnterView.N1(5, true);
                return false;
            }
            ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.N1;
            if ((recordCircle3 == null || !ChatActivityEnterView.this.s4) && ((udVar = chatActivityEnterView.e1) == null || udVar.getVisibility() != 0)) {
                if ((((deVar.getX() + motionEvent.getX()) - chatActivityEnterView.D2) / chatActivityEnterView.E2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.e2 && chatActivityEnterView.c1) {
                        CameraController.getInstance().cancelOnInitRunnable(jeVar);
                        chatActivityEnterView.Z2.Z1(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                        j10 = 0;
                        chatActivityEnterView.S4 = 0L;
                        geVar.setEffect(0L);
                    } else {
                        j10 = 0;
                        chatActivityEnterView.Z2.R0(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                    }
                    chatActivityEnterView.i1 = j10;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.N1(5, true);
                    return true;
                }
                if (chatActivityEnterView.I3) {
                    org.telegram.messenger.g0.r(rfVar);
                    if (chatActivityEnterView.y0 && chatActivityEnterView.x0) {
                        chatActivityEnterView.Z2.Y(!chatActivityEnterView.c1);
                        chatActivityEnterView.j1(!chatActivityEnterView.c1, true);
                    } else {
                        chatActivityEnterView.Z2.X1();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                }
                boolean z11 = chatActivityEnterView.e2;
                if (!z11 || chatActivityEnterView.J3) {
                    chatActivityEnterView.D2 = -1.0f;
                    if (!z11 || !chatActivityEnterView.c1) {
                        j3 = 0;
                        if (!chatActivityEnterView.y0) {
                            chatActivityEnterView.Z2.X1();
                        } else {
                            if (v4.a0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.s4) {
                                    chatActivityEnterView.J3 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.O);
                                chatActivityEnterView.Z2.R0(0);
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.k1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                v4.X(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.Components.be
                                    public final /* synthetic */ de b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.messenger.c20
                                    public final void a(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                                break;
                                            case 1:
                                                this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                                break;
                                            case 2:
                                                this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                                break;
                                            default:
                                                this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                            if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                Activity activity2 = chatActivityEnterView.O2;
                                long a11 = anVar.a();
                                k2 k2Var2 = new k2(12);
                                org.telegram.messenger.pd pdVar2 = new org.telegram.messenger.pd(23);
                                org.telegram.ui.ActionBar.f6 f6Var2 = this.c;
                                v4.H(activity2, a11, -1L, 0, false, k2Var2, pdVar2, new s4(f6Var2), f6Var2);
                            }
                            chatActivityEnterView.Z2.R0(0);
                            MediaController.B().B0(chatActivityEnterView.c() ? 3 : 1, 0, true, chatActivityEnterView.O);
                        }
                    } else {
                        if (v4.a0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                            ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.k1;
                            if (slideTextView6 != null) {
                                slideTextView6.setEnabled(false);
                            }
                            chatActivityEnterView.Z2.c1();
                            v4.X(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.Components.be
                                public final /* synthetic */ de b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i11) {
                                        case 0:
                                            this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.T0(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        CameraController.getInstance().cancelOnInitRunnable(jeVar);
                        chatActivityEnterView.Z2.Z1(1, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                        j3 = 0;
                        chatActivityEnterView.S4 = 0L;
                        geVar.setEffect(0L);
                    }
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.g0 = false;
                    Runnable runnable2 = new Runnable(this) { // from class: org.telegram.ui.Components.ce
                        public final /* synthetic */ de b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView22 = this.b.d;
                                    chatActivityEnterView22.f0 = null;
                                    chatActivityEnterView22.N1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView32 = this.b.d;
                                    chatActivityEnterView32.f0 = null;
                                    chatActivityEnterView32.N1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.f0 = runnable2;
                    org.telegram.messenger.g0.i3(runnable2, chatActivityEnterView.y4 ? 500L : j3);
                    return true;
                }
                return true;
            }
            if (chatActivityEnterView.I3) {
                org.telegram.messenger.g0.r(rfVar);
            }
        }
        return false;
    }
}
