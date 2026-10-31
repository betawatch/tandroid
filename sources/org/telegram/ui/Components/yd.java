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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yd extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.c = p6Var;
        this.a = new Paint(1);
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.a1) {
            fe feVar = chatActivityEnterView.S0;
            float f7 = 1.0f;
            if (feVar != null && feVar.getVisibility() == 0) {
                f7 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float N = org.telegram.messenger.i0.N(19.0f);
            int e02 = chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Me);
            Paint paint = this.a;
            paint.setColor(e02);
            float N2 = org.telegram.messenger.i0.N(3.0f);
            float N3 = org.telegram.messenger.i0.N(38.0f);
            float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.i0.N(38.0f)) - N2;
            float measuredHeight = (getMeasuredHeight() - N3) - N2;
            float measuredWidth2 = getMeasuredWidth() - N2;
            float measuredHeight2 = getMeasuredHeight() - N2;
            RectF rectF = this.b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
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
        pd pdVar;
        long j10;
        long j11;
        long j12;
        ChatActivityEnterView chatActivityEnterView = this.d;
        yd ydVar = chatActivityEnterView.Z0;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        ee eeVar = chatActivityEnterView.H3;
        nf nfVar = chatActivityEnterView.K3;
        be beVar = chatActivityEnterView.J0;
        final int i10 = 0;
        if (!chatActivityEnterView.p5) {
            chatActivityEnterView.U();
            final int i11 = 1;
            if (motionEvent.getAction() == 0) {
                if (!ChatActivityEnterView.this.s4) {
                    TLRPC.Chat chat = unVar == null ? null : unVar.e;
                    TLRPC.UserFull userFull = unVar == null ? chatActivityEnterView.K : unVar.q8;
                    if ((chat != null && !org.telegram.messenger.w3.v(chat) && (!org.telegram.messenger.w3.s(chat) || !chatActivityEnterView.e2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                        chatActivityEnterView.Z2.T1();
                        return true;
                    }
                    if (!chatActivityEnterView.e2) {
                        nfVar.run();
                        return true;
                    }
                    chatActivityEnterView.J3 = false;
                    chatActivityEnterView.I3 = true;
                    org.telegram.messenger.i0.h3(nfVar, 150L);
                    return true;
                }
                boolean z10 = chatActivityEnterView.e2;
                if (!z10 || chatActivityEnterView.J3) {
                    chatActivityEnterView.D2 = -1.0f;
                    if (!z10 || !chatActivityEnterView.c1) {
                        if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                            Activity activity = chatActivityEnterView.O2;
                            long a2 = unVar.a();
                            v1 v1Var = new v1(25);
                            org.telegram.messenger.rz rzVar = new org.telegram.messenger.rz(13);
                            Pattern pattern = s4.a;
                            org.telegram.ui.ActionBar.p6 p6Var = this.c;
                            s4.J(activity, a2, -1L, 0, false, v1Var, rzVar, new p4(p6Var), p6Var);
                        }
                        if (s4.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                            if (chatActivityEnterView.c1) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.X0();
                            } else {
                                if (chatActivityEnterView.s4) {
                                    chatActivityEnterView.J3 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.O);
                                chatActivityEnterView.Z2.G0(0);
                                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.k1;
                                if (slideTextView2 != null) {
                                    slideTextView2.setEnabled(false);
                                }
                            }
                            s4.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.Components.wd
                                public final /* synthetic */ yd b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.q20
                                public final void a(Object obj) {
                                    Long l4 = (Long) obj;
                                    switch (i11) {
                                        case 0:
                                            this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        MediaController.B().B0(chatActivityEnterView.c() ? 3 : 1, 0, true, chatActivityEnterView.O);
                        chatActivityEnterView.Z2.G0(0);
                    } else {
                        if (s4.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                            ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.k1;
                            if (slideTextView3 != null) {
                                slideTextView3.setEnabled(false);
                            }
                            chatActivityEnterView.Z2.X0();
                            s4.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.Components.wd
                                public final /* synthetic */ yd b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.q20
                                public final void a(Object obj) {
                                    Long l4 = (Long) obj;
                                    switch (i10) {
                                        case 0:
                                            this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.Z2.V1(1, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                        chatActivityEnterView.S4 = 0L;
                        beVar.setEffect(0L);
                    }
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.g0 = false;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Components.xd
                        public final /* synthetic */ yd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = this.b.d;
                                    chatActivityEnterView2.f0 = null;
                                    chatActivityEnterView2.K1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                    chatActivityEnterView3.f0 = null;
                                    chatActivityEnterView3.K1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.f0 = runnable;
                    org.telegram.messenger.i0.h3(runnable, 200L);
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            final int i12 = 2;
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
                            if (chatActivityEnterView2.r4 || chatActivityEnterView2.j4 < 0.7f || chatActivityEnterView2.k4 - chatActivityEnterView2.l4 < org.telegram.messenger.i0.L(57.0f)) {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                                float f7 = x10 - recordCircle2.F;
                                float f10 = y3 - recordCircle2.G;
                                float f11 = (f10 * f10) + (f7 * f7);
                                recordCircle2.G = y3;
                                recordCircle2.F = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.e4 && chatActivityEnterView3.g4 == 0.0f && f11 > recordCircle2.E) {
                                    chatActivityEnterView3.f4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.D2 == -1.0f) {
                                    chatActivityEnterView.D2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.m1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.E2 = measuredWidth;
                                    if (measuredWidth > org.telegram.messenger.i0.L(140.0f)) {
                                        chatActivityEnterView.E2 = org.telegram.messenger.i0.L(140.0f);
                                    }
                                }
                                float x11 = ydVar.getX() + x10;
                                float f12 = chatActivityEnterView.D2;
                                float f13 = ((x11 - f12) / chatActivityEnterView.E2) + 1.0f;
                                if (f12 != -1.0f) {
                                    float f14 = f13 <= 1.0f ? f13 < 0.0f ? 0.0f : f13 : 1.0f;
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.k1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.r = f14;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f14);
                                    f13 = f14;
                                }
                                if (f13 == 0.0f) {
                                    if (chatActivityEnterView.e2 && chatActivityEnterView.c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(eeVar);
                                        chatActivityEnterView.Z2.V1(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                                        chatActivityEnterView.S4 = 0L;
                                        beVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Z2.G0(0);
                                        MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                                    }
                                    chatActivityEnterView.F2 = false;
                                    chatActivityEnterView.K1(5, true);
                                    return true;
                                }
                            } else {
                                chatActivityEnterView2.s4 = true;
                                wf wfVar = chatActivityEnterView2.O1;
                                if (wfVar != null && org.telegram.messenger.vp.d1().getInt("voicepausehint", 0) <= 3) {
                                    wfVar.a();
                                    vh.p2 p2Var = new vh.p2(wfVar.getContext(), 2);
                                    wfVar.a = p2Var;
                                    p2Var.l(1.0f, 0.0f);
                                    wfVar.a.p(true);
                                    wfVar.a.s(org.telegram.messenger.cd.L0(2131743538, null));
                                    org.telegram.messenger.vp.d1().edit().putInt("voicepausehint", org.telegram.messenger.vp.d1().getInt("voicepausehint", 0) + 1).apply();
                                    wfVar.addView(wfVar.a, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 54.0f, 58.0f));
                                    vh.p2 p2Var2 = wfVar.a;
                                    p2Var2.l0 = new uf(wfVar, p2Var2, 3);
                                    p2Var2.u();
                                }
                            }
                        }
                        chatActivityEnterView.w1();
                        return false;
                    }
                }
                return true;
            }
            if (motionEvent.getAction() == 3 && chatActivityEnterView.F2) {
                if (chatActivityEnterView.j4 >= 0.7f) {
                    chatActivityEnterView.s4 = true;
                    chatActivityEnterView.w1();
                    return false;
                }
                if (chatActivityEnterView.e2 && chatActivityEnterView.c1) {
                    CameraController.getInstance().cancelOnInitRunnable(eeVar);
                    chatActivityEnterView.Z2.V1(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                    j12 = 0;
                    chatActivityEnterView.S4 = 0L;
                    beVar.setEffect(0L);
                } else {
                    j12 = 0;
                    chatActivityEnterView.Z2.G0(0);
                    MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                }
                chatActivityEnterView.i1 = j12;
                chatActivityEnterView.F2 = false;
                chatActivityEnterView.K1(5, true);
                return false;
            }
            ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.N1;
            if ((recordCircle3 == null || !ChatActivityEnterView.this.s4) && ((pdVar = chatActivityEnterView.e1) == null || pdVar.getVisibility() != 0)) {
                if ((((ydVar.getX() + motionEvent.getX()) - chatActivityEnterView.D2) / chatActivityEnterView.E2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.e2 && chatActivityEnterView.c1) {
                        CameraController.getInstance().cancelOnInitRunnable(eeVar);
                        chatActivityEnterView.Z2.V1(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.S4 = 0L;
                        beVar.setEffect(0L);
                    } else {
                        j11 = 0;
                        chatActivityEnterView.Z2.G0(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                    }
                    chatActivityEnterView.i1 = j11;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.K1(5, true);
                    return true;
                }
                if (chatActivityEnterView.I3) {
                    org.telegram.messenger.i0.r(nfVar);
                    if (chatActivityEnterView.y0 && chatActivityEnterView.x0) {
                        chatActivityEnterView.Z2.V(!chatActivityEnterView.c1);
                        chatActivityEnterView.i1(!chatActivityEnterView.c1, true);
                    } else {
                        chatActivityEnterView.Z2.T1();
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
                            chatActivityEnterView.Z2.T1();
                        } else {
                            if (s4.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.s4) {
                                    chatActivityEnterView.J3 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.O);
                                chatActivityEnterView.Z2.G0(0);
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.k1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                s4.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.Components.wd
                                    public final /* synthetic */ yd b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.messenger.q20
                                    public final void a(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                                break;
                                            case 1:
                                                this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                                break;
                                            case 2:
                                                this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                                break;
                                            default:
                                                this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                            if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                Activity activity2 = chatActivityEnterView.O2;
                                long a10 = unVar.a();
                                v1 v1Var2 = new v1(26);
                                org.telegram.messenger.rz rzVar2 = new org.telegram.messenger.rz(14);
                                org.telegram.ui.ActionBar.p6 p6Var2 = this.c;
                                s4.J(activity2, a10, -1L, 0, false, v1Var2, rzVar2, new p4(p6Var2), p6Var2);
                            }
                            chatActivityEnterView.Z2.G0(0);
                            MediaController.B().B0(chatActivityEnterView.c() ? 3 : 1, 0, true, chatActivityEnterView.O);
                        }
                    } else {
                        if (s4.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                            ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.k1;
                            if (slideTextView6 != null) {
                                slideTextView6.setEnabled(false);
                            }
                            chatActivityEnterView.Z2.X0();
                            s4.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.Components.wd
                                public final /* synthetic */ yd b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.q20
                                public final void a(Object obj) {
                                    Long l4 = (Long) obj;
                                    switch (i12) {
                                        case 0:
                                            this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.R0(true, 0, 0, l4.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        CameraController.getInstance().cancelOnInitRunnable(eeVar);
                        chatActivityEnterView.Z2.V1(1, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                        j10 = 0;
                        chatActivityEnterView.S4 = 0L;
                        beVar.setEffect(0L);
                    }
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.g0 = false;
                    Runnable runnable2 = new Runnable(this) { // from class: org.telegram.ui.Components.xd
                        public final /* synthetic */ yd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView22 = this.b.d;
                                    chatActivityEnterView22.f0 = null;
                                    chatActivityEnterView22.K1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView32 = this.b.d;
                                    chatActivityEnterView32.f0 = null;
                                    chatActivityEnterView32.K1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.f0 = runnable2;
                    org.telegram.messenger.i0.h3(runnable2, chatActivityEnterView.y4 ? 500L : j10);
                    return true;
                }
                return true;
            }
            if (chatActivityEnterView.I3) {
                org.telegram.messenger.i0.r(nfVar);
            }
        }
        return false;
    }
}
