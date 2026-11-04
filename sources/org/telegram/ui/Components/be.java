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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class be extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.c = e6Var;
        this.a = new Paint(1);
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.b1) {
            ie ieVar = chatActivityEnterView.T0;
            float f10 = 1.0f;
            if (ieVar != null && ieVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.T0.getAlpha();
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
        return !this.d.q5;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        sd sdVar;
        long j10;
        long j11;
        long j12;
        ChatActivityEnterView chatActivityEnterView = this.d;
        be beVar = chatActivityEnterView.a1;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        he heVar = chatActivityEnterView.I3;
        pf pfVar = chatActivityEnterView.L3;
        ee eeVar = chatActivityEnterView.K0;
        final int i3 = 0;
        if (!chatActivityEnterView.q5) {
            chatActivityEnterView.U();
            final int i10 = 1;
            if (motionEvent.getAction() == 0) {
                if (!ChatActivityEnterView.this.t4) {
                    TLRPC.Chat chat = wmVar == null ? null : wmVar.e;
                    TLRPC.UserFull userFull = wmVar == null ? chatActivityEnterView.L : wmVar.r8;
                    if ((chat != null && !org.telegram.messenger.t3.v(chat) && (!org.telegram.messenger.t3.s(chat) || !chatActivityEnterView.f2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                        chatActivityEnterView.a3.b2();
                        return true;
                    }
                    if (!chatActivityEnterView.f2) {
                        pfVar.run();
                        return true;
                    }
                    chatActivityEnterView.K3 = false;
                    chatActivityEnterView.J3 = true;
                    org.telegram.messenger.g0.i3(pfVar, 150L);
                    return true;
                }
                boolean z10 = chatActivityEnterView.f2;
                if (!z10 || chatActivityEnterView.K3) {
                    chatActivityEnterView.E2 = -1.0f;
                    if (!z10 || !chatActivityEnterView.d1) {
                        if (chatActivityEnterView.G2 && chatActivityEnterView.c()) {
                            Activity activity = chatActivityEnterView.P2;
                            long a10 = wmVar.a();
                            a3 a3Var = new a3(8);
                            org.telegram.messenger.hc hcVar = new org.telegram.messenger.hc(26);
                            Pattern pattern = t4.a;
                            org.telegram.ui.ActionBar.e6 e6Var = this.c;
                            t4.J(activity, a10, -1L, 0, false, a3Var, hcVar, new q4(e6Var), e6Var);
                        }
                        if (t4.c0(chatActivityEnterView.R, chatActivityEnterView.R2)) {
                            if (chatActivityEnterView.d1) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.l1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.a3.Z0();
                            } else {
                                if (chatActivityEnterView.t4) {
                                    chatActivityEnterView.K3 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.P);
                                chatActivityEnterView.a3.M0(0);
                                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.l1;
                                if (slideTextView2 != null) {
                                    slideTextView2.setEnabled(false);
                                }
                            }
                            t4.Z(chatActivityEnterView.R, 1, chatActivityEnterView.R2, new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.Components.zd
                                public final /* synthetic */ be b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.u10
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i10) {
                                        case 0:
                                            this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        MediaController.B().B0(chatActivityEnterView.c() ? 3 : 1, 0, true, chatActivityEnterView.P);
                        chatActivityEnterView.a3.M0(0);
                    } else {
                        if (t4.c0(chatActivityEnterView.R, chatActivityEnterView.R2)) {
                            ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.l1;
                            if (slideTextView3 != null) {
                                slideTextView3.setEnabled(false);
                            }
                            chatActivityEnterView.a3.Z0();
                            t4.Z(chatActivityEnterView.R, 1, chatActivityEnterView.R2, new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.Components.zd
                                public final /* synthetic */ be b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.u10
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i3) {
                                        case 0:
                                            this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.a3.d2(1, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.T4, 0L, true);
                        chatActivityEnterView.T4 = 0L;
                        eeVar.setEffect(0L);
                    }
                    chatActivityEnterView.G2 = false;
                    chatActivityEnterView.h0 = false;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Components.ae
                        public final /* synthetic */ be b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = this.b.d;
                                    chatActivityEnterView2.g0 = null;
                                    chatActivityEnterView2.M1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                    chatActivityEnterView3.g0 = null;
                                    chatActivityEnterView3.M1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.g0 = runnable;
                    org.telegram.messenger.g0.i3(runnable, 200L);
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            final int i11 = 2;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.G2) {
                    float x10 = motionEvent.getX();
                    float y9 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.O1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.t4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.m4 == -1.0f) {
                                chatActivityEnterView2.l4 = y9;
                            }
                            chatActivityEnterView2.m4 = y9;
                            recordCircle.invalidate();
                            if (chatActivityEnterView2.s4 || chatActivityEnterView2.k4 < 0.7f || chatActivityEnterView2.l4 - chatActivityEnterView2.m4 < org.telegram.messenger.g0.L(57.0f)) {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.O1;
                                float f10 = x10 - recordCircle2.G;
                                float f11 = y9 - recordCircle2.H;
                                float f12 = (f11 * f11) + (f10 * f10);
                                recordCircle2.H = y9;
                                recordCircle2.G = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f4 && chatActivityEnterView3.h4 == 0.0f && f12 > recordCircle2.F) {
                                    chatActivityEnterView3.g4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.E2 == -1.0f) {
                                    chatActivityEnterView.E2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.n1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.F2 = measuredWidth;
                                    if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
                                        chatActivityEnterView.F2 = org.telegram.messenger.g0.L(140.0f);
                                    }
                                }
                                float x11 = beVar.getX() + x10;
                                float f13 = chatActivityEnterView.E2;
                                float f14 = ((x11 - f13) / chatActivityEnterView.F2) + 1.0f;
                                if (f13 != -1.0f) {
                                    float f15 = f14 <= 1.0f ? f14 < 0.0f ? 0.0f : f14 : 1.0f;
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.l1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.r = f15;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f15);
                                    f14 = f15;
                                }
                                if (f14 == 0.0f) {
                                    if (chatActivityEnterView.f2 && chatActivityEnterView.d1) {
                                        CameraController.getInstance().cancelOnInitRunnable(heVar);
                                        chatActivityEnterView.a3.d2(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.T4, 0L, true);
                                        chatActivityEnterView.T4 = 0L;
                                        eeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.a3.M0(0);
                                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                                    }
                                    chatActivityEnterView.G2 = false;
                                    chatActivityEnterView.M1(5, true);
                                    return true;
                                }
                            } else {
                                chatActivityEnterView2.t4 = true;
                                yf yfVar = chatActivityEnterView2.P1;
                                if (yfVar != null && org.telegram.messenger.hp.e1().getInt("voicepausehint", 0) <= 3) {
                                    yfVar.a();
                                    gi.l3 l3Var = new gi.l3(yfVar.getContext(), 2);
                                    yfVar.a = l3Var;
                                    l3Var.o(1.0f, 0.0f);
                                    yfVar.a.r(true);
                                    yfVar.a.u(org.telegram.messenger.bd.M0(2131743522, null));
                                    yfVar.c0.setHintGlass(yfVar.a);
                                    org.telegram.messenger.hp.e1().edit().putInt("voicepausehint", org.telegram.messenger.hp.e1().getInt("voicepausehint", 0) + 1).apply();
                                    yfVar.addView(yfVar.a, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 54.0f, 58.0f));
                                    gi.l3 l3Var2 = yfVar.a;
                                    l3Var2.r0 = new wf(yfVar, l3Var2, 3);
                                    l3Var2.w();
                                }
                            }
                        }
                        chatActivityEnterView.y1();
                        return false;
                    }
                }
                return true;
            }
            if (motionEvent.getAction() == 3 && chatActivityEnterView.G2) {
                if (chatActivityEnterView.k4 >= 0.7f) {
                    chatActivityEnterView.t4 = true;
                    chatActivityEnterView.y1();
                    return false;
                }
                if (chatActivityEnterView.f2 && chatActivityEnterView.d1) {
                    CameraController.getInstance().cancelOnInitRunnable(heVar);
                    chatActivityEnterView.a3.d2(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.T4, 0L, true);
                    j12 = 0;
                    chatActivityEnterView.T4 = 0L;
                    eeVar.setEffect(0L);
                } else {
                    j12 = 0;
                    chatActivityEnterView.a3.M0(0);
                    MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                }
                chatActivityEnterView.j1 = j12;
                chatActivityEnterView.G2 = false;
                chatActivityEnterView.M1(5, true);
                return false;
            }
            ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.O1;
            if ((recordCircle3 == null || !ChatActivityEnterView.this.t4) && ((sdVar = chatActivityEnterView.f1) == null || sdVar.getVisibility() != 0)) {
                if ((((beVar.getX() + motionEvent.getX()) - chatActivityEnterView.E2) / chatActivityEnterView.F2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.f2 && chatActivityEnterView.d1) {
                        CameraController.getInstance().cancelOnInitRunnable(heVar);
                        chatActivityEnterView.a3.d2(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.T4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.T4 = 0L;
                        eeVar.setEffect(0L);
                    } else {
                        j11 = 0;
                        chatActivityEnterView.a3.M0(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.j1 = j11;
                    chatActivityEnterView.G2 = false;
                    chatActivityEnterView.M1(5, true);
                    return true;
                }
                if (chatActivityEnterView.J3) {
                    org.telegram.messenger.g0.r(pfVar);
                    if (chatActivityEnterView.z0 && chatActivityEnterView.y0) {
                        chatActivityEnterView.a3.c0(!chatActivityEnterView.d1);
                        chatActivityEnterView.j1(!chatActivityEnterView.d1, true);
                    } else {
                        chatActivityEnterView.a3.b2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                }
                boolean z12 = chatActivityEnterView.f2;
                if (!z12 || chatActivityEnterView.K3) {
                    chatActivityEnterView.E2 = -1.0f;
                    if (!z12 || !chatActivityEnterView.d1) {
                        j10 = 0;
                        if (!chatActivityEnterView.z0) {
                            chatActivityEnterView.a3.b2();
                        } else {
                            if (t4.c0(chatActivityEnterView.R, chatActivityEnterView.R2)) {
                                if (chatActivityEnterView.t4) {
                                    chatActivityEnterView.K3 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.P);
                                chatActivityEnterView.a3.M0(0);
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.l1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                t4.Z(chatActivityEnterView.R, 1, chatActivityEnterView.R2, new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.Components.zd
                                    public final /* synthetic */ be b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.messenger.u10
                                    public final void a(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                                break;
                                            case 1:
                                                this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                                break;
                                            case 2:
                                                this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                                break;
                                            default:
                                                this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                            if (chatActivityEnterView.G2 && chatActivityEnterView.c()) {
                                Activity activity2 = chatActivityEnterView.P2;
                                long a11 = wmVar.a();
                                a3 a3Var2 = new a3(9);
                                org.telegram.messenger.hc hcVar2 = new org.telegram.messenger.hc(27);
                                org.telegram.ui.ActionBar.e6 e6Var2 = this.c;
                                t4.J(activity2, a11, -1L, 0, false, a3Var2, hcVar2, new q4(e6Var2), e6Var2);
                            }
                            chatActivityEnterView.a3.M0(0);
                            MediaController.B().B0(chatActivityEnterView.c() ? 3 : 1, 0, true, chatActivityEnterView.P);
                        }
                    } else {
                        if (t4.c0(chatActivityEnterView.R, chatActivityEnterView.R2)) {
                            ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.l1;
                            if (slideTextView6 != null) {
                                slideTextView6.setEnabled(false);
                            }
                            chatActivityEnterView.a3.Z0();
                            t4.Z(chatActivityEnterView.R, 1, chatActivityEnterView.R2, new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.Components.zd
                                public final /* synthetic */ be b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.u10
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i11) {
                                        case 0:
                                            this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.S0(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        CameraController.getInstance().cancelOnInitRunnable(heVar);
                        chatActivityEnterView.a3.d2(1, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.T4, 0L, true);
                        j10 = 0;
                        chatActivityEnterView.T4 = 0L;
                        eeVar.setEffect(0L);
                    }
                    chatActivityEnterView.G2 = false;
                    chatActivityEnterView.h0 = false;
                    Runnable runnable2 = new Runnable(this) { // from class: org.telegram.ui.Components.ae
                        public final /* synthetic */ be b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView22 = this.b.d;
                                    chatActivityEnterView22.g0 = null;
                                    chatActivityEnterView22.M1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView32 = this.b.d;
                                    chatActivityEnterView32.g0 = null;
                                    chatActivityEnterView32.M1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.g0 = runnable2;
                    org.telegram.messenger.g0.i3(runnable2, chatActivityEnterView.z4 ? 500L : j10);
                    return true;
                }
                return true;
            }
            if (chatActivityEnterView.J3) {
                org.telegram.messenger.g0.r(pfVar);
            }
        }
        return false;
    }
}
