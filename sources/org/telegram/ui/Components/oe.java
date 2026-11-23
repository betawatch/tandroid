package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class oe extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.c = h6Var;
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
            int G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Pe);
            Paint paint = this.a;
            paint.setColor(G0);
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
        return !this.d.p7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r7 != 0) goto L369;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07e4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        de deVar;
        long j3;
        boolean z10;
        long j10;
        boolean z11;
        ai.p0 p0Var;
        long j11;
        boolean z12;
        boolean z13;
        float[] fArr;
        float[] fArr2;
        ChatActivityEnterView.RecordCircle recordCircle;
        char c10;
        boolean z14;
        ChatActivityEnterView chatActivityEnterView = this.d;
        oe oeVar = chatActivityEnterView.a1;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        te teVar = chatActivityEnterView.x4;
        cg cgVar = chatActivityEnterView.A4;
        re reVar = chatActivityEnterView.K0;
        final int i7 = 0;
        if (!chatActivityEnterView.p7) {
            final int i10 = 1;
            if (chatActivityEnterView.J1) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 0) {
                    chatActivityEnterView.J1 = false;
                }
                return true;
            }
            chatActivityEnterView.e0();
            if (motionEvent.getAction() == 0) {
                if (!ChatActivityEnterView.this.i5) {
                    chatActivityEnterView.m0();
                    TLRPC.Chat chat = bnVar == null ? null : bnVar.e;
                    TLRPC.UserFull userFull = bnVar == null ? chatActivityEnterView.L : bnVar.s8;
                    if (!chatActivityEnterView.l1 && ((chat != null && !org.telegram.messenger.v3.v(chat) && (!org.telegram.messenger.v3.s(chat) || !chatActivityEnterView.U2)) || (userFull != null && userFull.voice_messages_forbidden))) {
                        chatActivityEnterView.P3.m2();
                        return true;
                    }
                    chatActivityEnterView.u1 = motionEvent.getX();
                    chatActivityEnterView.v1 = motionEvent.getY();
                    chatActivityEnterView.E1 = false;
                    chatActivityEnterView.J1 = false;
                    rg rgVar = chatActivityEnterView.E2;
                    if (rgVar != null) {
                        rgVar.c0 = false;
                        rgVar.b0.e(true, 0.0f);
                    }
                    chatActivityEnterView.x1 = false;
                    chatActivityEnterView.w1 = 0.0f;
                    ai.p0 p0Var2 = chatActivityEnterView.j1;
                    if (p0Var2 != null && p0Var2.n()) {
                        chatActivityEnterView.j1.k();
                    }
                    if (!chatActivityEnterView.U2) {
                        cgVar.run();
                        return true;
                    }
                    chatActivityEnterView.z4 = false;
                    chatActivityEnterView.y4 = true;
                    org.telegram.messenger.g0.h3(cgVar, 150L);
                    return true;
                }
                if (chatActivityEnterView.l1 && !chatActivityEnterView.d1) {
                    chatActivityEnterView.n0(false, false);
                    chatActivityEnterView.k0();
                    ai.p0 p0Var3 = chatActivityEnterView.j1;
                    if (p0Var3 == null || !p0Var3.p()) {
                        gf gfVar = chatActivityEnterView.F0;
                        if (gfVar != null && gfVar.length() > 0) {
                            chatActivityEnterView.v1();
                        }
                    } else {
                        ai.p0 p0Var4 = chatActivityEnterView.j1;
                        if (p0Var4.o0 && p0Var4.p()) {
                            Editable text = p0Var4.f.a.F0.getText();
                            if (text == null || text.toString().trim().length() <= 0) {
                                p0Var4.s();
                            } else {
                                p0Var4.B();
                            }
                        }
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                boolean z15 = chatActivityEnterView.U2;
                if (!z15 || chatActivityEnterView.z4) {
                    chatActivityEnterView.t3 = -1.0f;
                    if (!z15 || !chatActivityEnterView.d1) {
                        if (chatActivityEnterView.v3 && chatActivityEnterView.c()) {
                            Activity activity = chatActivityEnterView.E3;
                            long a10 = bnVar.a();
                            l2 l2Var = new l2(16);
                            me meVar = new me(i7);
                            Pattern pattern = c5.a;
                            org.telegram.ui.ActionBar.h6 h6Var = this.c;
                            c5.H(activity, a10, -1L, 0, false, l2Var, meVar, new z4(h6Var), h6Var);
                        }
                        if (c5.a0(chatActivityEnterView.R, chatActivityEnterView.G3)) {
                            if (chatActivityEnterView.d1) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.a2;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.P3.l1();
                            } else {
                                if (chatActivityEnterView.i5) {
                                    chatActivityEnterView.z4 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.P);
                                chatActivityEnterView.P3.a1(0);
                                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.a2;
                                if (slideTextView2 != null) {
                                    slideTextView2.setEnabled(false);
                                }
                            }
                            c5.X(chatActivityEnterView.R, 1, chatActivityEnterView.G3, new org.telegram.messenger.y10(this) { // from class: org.telegram.ui.Components.le
                                public final /* synthetic */ oe b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.y10
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i10) {
                                        case 0:
                                            this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        MediaController.B().B0(chatActivityEnterView.c() ? 3 : 1, 0, true, chatActivityEnterView.P);
                        chatActivityEnterView.P3.a1(0);
                    } else {
                        if (c5.a0(chatActivityEnterView.R, chatActivityEnterView.G3)) {
                            ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.a2;
                            if (slideTextView3 != null) {
                                slideTextView3.setEnabled(false);
                            }
                            chatActivityEnterView.P3.l1();
                            c5.X(chatActivityEnterView.R, 1, chatActivityEnterView.G3, new org.telegram.messenger.y10(this) { // from class: org.telegram.ui.Components.le
                                public final /* synthetic */ oe b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.y10
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i7) {
                                        case 0:
                                            this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.P3.o2(1, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.P6, 0L, true);
                        chatActivityEnterView.P6 = 0L;
                        reVar.setEffect(0L);
                    }
                    chatActivityEnterView.v3 = false;
                    chatActivityEnterView.h0 = false;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Components.ne
                        public final /* synthetic */ oe b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = this.b.d;
                                    chatActivityEnterView2.g0 = null;
                                    chatActivityEnterView2.s2(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                    chatActivityEnterView3.g0 = null;
                                    chatActivityEnterView3.s2(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.g0 = runnable;
                    org.telegram.messenger.g0.h3(runnable, 200L);
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                motionEvent.getAction();
                chatActivityEnterView.x1 = false;
                chatActivityEnterView.w1 = 0.0f;
                if (motionEvent.getAction() == 3 && chatActivityEnterView.v3) {
                    if (chatActivityEnterView.Z4 >= 0.7f) {
                        chatActivityEnterView.i5 = true;
                        chatActivityEnterView.d2();
                        return false;
                    }
                    if (chatActivityEnterView.U2 && chatActivityEnterView.d1) {
                        CameraController.getInstance().cancelOnInitRunnable(teVar);
                        chatActivityEnterView.P3.o2(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.P6, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.P6 = 0L;
                        reVar.setEffect(0L);
                        z12 = false;
                    } else {
                        j11 = 0;
                        z12 = false;
                        chatActivityEnterView.P3.a1(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.Y1 = j11;
                    chatActivityEnterView.v3 = z12;
                    chatActivityEnterView.s2(5, true);
                    return z12;
                }
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.D2;
                if ((recordCircle2 != null && ChatActivityEnterView.this.i5) || ((deVar = chatActivityEnterView.f1) != null && deVar.getVisibility() == 0)) {
                    if (!chatActivityEnterView.y4) {
                        return false;
                    }
                    org.telegram.messenger.g0.r(cgVar);
                    return false;
                }
                if ((((oeVar.getX() + motionEvent.getX()) - chatActivityEnterView.t3) / chatActivityEnterView.u3) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.l1 && (p0Var = chatActivityEnterView.j1) != null && p0Var.o()) {
                        ai.p0 p0Var5 = chatActivityEnterView.j1;
                        if (p0Var5.o0 && p0Var5.p()) {
                            p0Var5.s();
                        }
                        j10 = 0;
                    } else {
                        if (!chatActivityEnterView.U2 || !chatActivityEnterView.d1) {
                            j10 = 0;
                            z11 = false;
                            chatActivityEnterView.P3.a1(0);
                            MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                            chatActivityEnterView.Y1 = j10;
                            chatActivityEnterView.v3 = z11;
                            chatActivityEnterView.s2(5, true);
                            return true;
                        }
                        CameraController.getInstance().cancelOnInitRunnable(teVar);
                        chatActivityEnterView.P3.o2(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.P6, 0L, true);
                        j10 = 0;
                        chatActivityEnterView.P6 = 0L;
                        reVar.setEffect(0L);
                    }
                    z11 = false;
                    chatActivityEnterView.Y1 = j10;
                    chatActivityEnterView.v3 = z11;
                    chatActivityEnterView.s2(5, true);
                    return true;
                }
                if (chatActivityEnterView.y4) {
                    org.telegram.messenger.g0.r(cgVar);
                    boolean z16 = chatActivityEnterView.l1;
                    if (!z16 || chatActivityEnterView.o1) {
                        if ((chatActivityEnterView.z0 || z16) && chatActivityEnterView.y0) {
                            chatActivityEnterView.P3.a0(!chatActivityEnterView.d1);
                            chatActivityEnterView.N1(!chatActivityEnterView.d1, true);
                        } else {
                            chatActivityEnterView.P3.m2();
                        }
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                }
                boolean z17 = chatActivityEnterView.U2;
                if (!z17 || chatActivityEnterView.z4) {
                    chatActivityEnterView.t3 = -1.0f;
                    if (!z17 || !chatActivityEnterView.d1) {
                        j3 = 0;
                        if (chatActivityEnterView.l1) {
                            chatActivityEnterView.l0();
                            return true;
                        }
                        if (chatActivityEnterView.z0) {
                            if (c5.a0(chatActivityEnterView.R, chatActivityEnterView.G3)) {
                                if (chatActivityEnterView.i5) {
                                    chatActivityEnterView.z4 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.P);
                                chatActivityEnterView.P3.a1(0);
                                ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.a2;
                                if (slideTextView4 != null) {
                                    slideTextView4.setEnabled(false);
                                }
                                final int i11 = 3;
                                c5.X(chatActivityEnterView.R, 1, chatActivityEnterView.G3, new org.telegram.messenger.y10(this) { // from class: org.telegram.ui.Components.le
                                    public final /* synthetic */ oe b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.messenger.y10
                                    public final void a(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (i11) {
                                            case 0:
                                                this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                                break;
                                            case 1:
                                                this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                                break;
                                            case 2:
                                                this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                                break;
                                            default:
                                                this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                            if (chatActivityEnterView.v3 && chatActivityEnterView.c()) {
                                Activity activity2 = chatActivityEnterView.E3;
                                long a11 = bnVar.a();
                                l2 l2Var2 = new l2(17);
                                me meVar2 = new me(i10);
                                org.telegram.ui.ActionBar.h6 h6Var2 = this.c;
                                c5.H(activity2, a11, -1L, 0, false, l2Var2, meVar2, new z4(h6Var2), h6Var2);
                            }
                            z10 = false;
                            chatActivityEnterView.P3.a1(0);
                            MediaController.B().B0(chatActivityEnterView.c() ? 3 : 1, 0, true, chatActivityEnterView.P);
                            chatActivityEnterView.v3 = z10;
                            chatActivityEnterView.h0 = z10;
                            Runnable runnable2 = new Runnable(this) { // from class: org.telegram.ui.Components.ne
                                public final /* synthetic */ oe b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            ChatActivityEnterView chatActivityEnterView2 = this.b.d;
                                            chatActivityEnterView2.g0 = null;
                                            chatActivityEnterView2.s2(1, true);
                                            break;
                                        default:
                                            ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                            chatActivityEnterView3.g0 = null;
                                            chatActivityEnterView3.s2(1, true);
                                            break;
                                    }
                                }
                            };
                            chatActivityEnterView.g0 = runnable2;
                            org.telegram.messenger.g0.h3(runnable2, !chatActivityEnterView.Y5 ? 500L : j3);
                            return true;
                        }
                        chatActivityEnterView.P3.m2();
                    } else {
                        if (c5.a0(chatActivityEnterView.R, chatActivityEnterView.G3)) {
                            ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.a2;
                            if (slideTextView5 != null) {
                                slideTextView5.setEnabled(false);
                            }
                            chatActivityEnterView.P3.l1();
                            final int i12 = 2;
                            c5.X(chatActivityEnterView.R, 1, chatActivityEnterView.G3, new org.telegram.messenger.y10(this) { // from class: org.telegram.ui.Components.le
                                public final /* synthetic */ oe b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.y10
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i12) {
                                        case 0:
                                            this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.w1(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        CameraController.getInstance().cancelOnInitRunnable(teVar);
                        chatActivityEnterView.P3.o2(1, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.P6, 0L, true);
                        j3 = 0;
                        chatActivityEnterView.P6 = 0L;
                        reVar.setEffect(0L);
                    }
                    z10 = false;
                    chatActivityEnterView.v3 = z10;
                    chatActivityEnterView.h0 = z10;
                    Runnable runnable22 = new Runnable(this) { // from class: org.telegram.ui.Components.ne
                        public final /* synthetic */ oe b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = this.b.d;
                                    chatActivityEnterView2.g0 = null;
                                    chatActivityEnterView2.s2(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                    chatActivityEnterView3.g0 = null;
                                    chatActivityEnterView3.s2(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.g0 = runnable22;
                    org.telegram.messenger.g0.h3(runnable22, !chatActivityEnterView.Y5 ? 500L : j3);
                    return true;
                }
            } else if (motionEvent.getAction() == 2 && chatActivityEnterView.v3) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (!ChatActivityEnterView.this.i5) {
                    if (chatActivityEnterView.r0()) {
                        float f10 = chatActivityEnterView.u1 - x10;
                        float f11 = chatActivityEnterView.v1 - y10;
                        double d = f10;
                        double d2 = f11;
                        float hypot = (float) Math.hypot(d, d2);
                        double degrees = Math.toDegrees(Math.atan2(d2, d));
                        boolean z18 = chatActivityEnterView.x1;
                        if (f10 > 0.0f && f11 > 0.0f && hypot > org.telegram.messenger.g0.L(16.0f) && degrees >= 25.0d && degrees <= 65.0d) {
                            chatActivityEnterView.x1 = true;
                        } else if (!z18 || f10 <= 0.0f || f11 <= 0.0f || hypot <= org.telegram.messenger.g0.L(10.0f) || degrees < 15.0d || degrees > 75.0d) {
                            chatActivityEnterView.x1 = false;
                        } else {
                            chatActivityEnterView.x1 = true;
                        }
                        float L = org.telegram.messenger.g0.L(64.0f);
                        float sqrt = (f10 + f11) * ((float) Math.sqrt(0.5d));
                        chatActivityEnterView.w1 = chatActivityEnterView.x1 ? Utilities.i(sqrt / L, 1.0f, 0.0f) : 0.0f;
                        rg rgVar2 = chatActivityEnterView.E2;
                        if (rgVar2 != null) {
                            rgVar2.invalidate();
                        }
                        if (chatActivityEnterView.x1 && sqrt >= L && chatActivityEnterView.v3) {
                            chatActivityEnterView.J1 = true;
                            rg rgVar3 = chatActivityEnterView.E2;
                            if (rgVar3 != null) {
                                rgVar3.c0 = true;
                                rgVar3.invalidate();
                            }
                            try {
                                chatActivityEnterView.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (chatActivityEnterView.r0()) {
                                chatActivityEnterView.x1 = false;
                                chatActivityEnterView.w1 = 0.0f;
                                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.D2;
                                if (recordCircle3 == null || !recordCircle3.isShown() || chatActivityEnterView.D2.M <= org.telegram.messenger.g0.L(4.0f)) {
                                    fArr = null;
                                } else {
                                    int[] iArr = new int[2];
                                    chatActivityEnterView.D2.getLocationInWindow(iArr);
                                    float f12 = iArr[0];
                                    ChatActivityEnterView.RecordCircle recordCircle4 = chatActivityEnterView.D2;
                                    fArr = new float[]{f12 + recordCircle4.K, iArr[1] + recordCircle4.L, recordCircle4.M};
                                }
                                tg tgVar = chatActivityEnterView.b2;
                                if (tgVar == null || tgVar.getWidth() <= 0 || !chatActivityEnterView.b2.isShown() || chatActivityEnterView.b2.getScaleX() <= 0.5f) {
                                    fArr2 = null;
                                } else {
                                    chatActivityEnterView.b2.getLocationInWindow(new int[2]);
                                    chatActivityEnterView.c2.getLocationInWindow(new int[2]);
                                    fArr2 = new float[]{(chatActivityEnterView.b2.getWidth() / 2.0f) + (r8[0] - r11[0]), (chatActivityEnterView.b2.getHeight() / 2.0f) + (r8[1] - r11[1])};
                                }
                                if (chatActivityEnterView.v3 || ((recordCircle = chatActivityEnterView.D2) != null && ChatActivityEnterView.this.i5)) {
                                    chatActivityEnterView.Y1 = 0L;
                                    chatActivityEnterView.D1 = true;
                                    chatActivityEnterView.E1 = true;
                                    try {
                                        chatActivityEnterView.G();
                                    } finally {
                                        chatActivityEnterView.D1 = false;
                                    }
                                }
                                ai.p0 A0 = chatActivityEnterView.A0();
                                int G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.ag);
                                A0.h0 = fArr2;
                                A0.n0 = G0;
                                ai.p0 A02 = chatActivityEnterView.A0();
                                int G02 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Uf);
                                A02.i0 = fArr;
                                A02.j0 = G02;
                                chatActivityEnterView.A0().I(false);
                            }
                        }
                        z13 = chatActivityEnterView.x1;
                    } else {
                        chatActivityEnterView.x1 = false;
                        z13 = false;
                    }
                    if (!z13) {
                        ChatActivityEnterView.RecordCircle recordCircle5 = chatActivityEnterView.D2;
                        ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                        if (!chatActivityEnterView2.i5) {
                            if (chatActivityEnterView2.b5 == -1.0f) {
                                chatActivityEnterView2.a5 = y10;
                            }
                            chatActivityEnterView2.b5 = y10;
                            recordCircle5.invalidate();
                            if (chatActivityEnterView2.h5 || chatActivityEnterView2.Z4 < 0.7f || chatActivityEnterView2.a5 - chatActivityEnterView2.b5 < org.telegram.messenger.g0.L(57.0f)) {
                                c10 = 1;
                                if (c10 != 2) {
                                    chatActivityEnterView.d2();
                                    return false;
                                }
                                ChatActivityEnterView.RecordCircle recordCircle6 = chatActivityEnterView.D2;
                                float f13 = x10 - recordCircle6.G;
                                float f14 = y10 - recordCircle6.H;
                                float f15 = (f14 * f14) + (f13 * f13);
                                recordCircle6.H = y10;
                                recordCircle6.G = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.U4 && chatActivityEnterView3.W4 == 0.0f && f15 > recordCircle6.F) {
                                    chatActivityEnterView3.V4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.t3 == -1.0f) {
                                    chatActivityEnterView.t3 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.c2.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.u3 = measuredWidth;
                                    if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
                                        chatActivityEnterView.u3 = org.telegram.messenger.g0.L(140.0f);
                                    }
                                }
                                float x11 = oeVar.getX() + x10;
                                float f16 = chatActivityEnterView.t3;
                                float f17 = ((x11 - f16) / chatActivityEnterView.u3) + 1.0f;
                                if (f16 != -1.0f) {
                                    float f18 = f17 > 1.0f ? 1.0f : f17 < 0.0f ? 0.0f : f17;
                                    ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.a2;
                                    if (slideTextView6 != null) {
                                        slideTextView6.r = f18;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f18);
                                    f17 = f18;
                                }
                                if (f17 == 0.0f) {
                                    if (chatActivityEnterView.U2 && chatActivityEnterView.d1) {
                                        CameraController.getInstance().cancelOnInitRunnable(teVar);
                                        chatActivityEnterView.P3.o2(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.P6, 0L, true);
                                        chatActivityEnterView.P6 = 0L;
                                        reVar.setEffect(0L);
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                        chatActivityEnterView.P3.a1(0);
                                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                                    }
                                    chatActivityEnterView.v3 = z14;
                                    chatActivityEnterView.s2(5, true);
                                }
                            } else {
                                chatActivityEnterView2.i5 = true;
                                rg rgVar4 = chatActivityEnterView2.E2;
                                if (rgVar4 != null) {
                                    ChatActivityEnterView chatActivityEnterView4 = rgVar4.Q0;
                                    if (org.telegram.messenger.np.g1().getInt("voicepausehint", 0) <= 3 && !c8.b1.a(chatActivityEnterView4.G3)) {
                                        rgVar4.f();
                                        hi.l3 l3Var = new hi.l3(rgVar4.getContext(), 2);
                                        rgVar4.a = l3Var;
                                        l3Var.o(1.0f, 0.0f);
                                        rgVar4.a.r(true);
                                        rgVar4.a.v(org.telegram.messenger.hd.N0(2131743267, null));
                                        chatActivityEnterView4.setHintGlass(rgVar4.a);
                                        org.telegram.messenger.np.g1().edit().putInt("voicepausehint", org.telegram.messenger.np.g1().getInt("voicepausehint", 0) + 1).apply();
                                        rgVar4.addView(rgVar4.a, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 0.0f, 0.0f, 54.0f, 58.0f));
                                        hi.l3 l3Var2 = rgVar4.a;
                                        l3Var2.r0 = new pg(rgVar4, l3Var2, 3);
                                        l3Var2.x();
                                    }
                                }
                            }
                        }
                        c10 = 2;
                        if (c10 != 2) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
