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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class oe extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.c = i6Var;
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
            int C0 = chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Pe);
            Paint paint = this.a;
            paint.setColor(C0);
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
        return !this.d.k7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r7 != 0) goto L365;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07d9  */
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
        ai.n0 n0Var;
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
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        te teVar = chatActivityEnterView.v4;
        ag agVar = chatActivityEnterView.y4;
        re reVar = chatActivityEnterView.K0;
        final int i7 = 0;
        if (!chatActivityEnterView.k7) {
            final int i10 = 1;
            if (chatActivityEnterView.H1) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 0) {
                    chatActivityEnterView.H1 = false;
                }
                return true;
            }
            chatActivityEnterView.e0();
            if (motionEvent.getAction() == 0) {
                if (!ChatActivityEnterView.this.g5) {
                    TLRPC.Chat chat = bnVar == null ? null : bnVar.e;
                    TLRPC.UserFull userFull = bnVar == null ? chatActivityEnterView.L : bnVar.s8;
                    if (!chatActivityEnterView.l1 && ((chat != null && !org.telegram.messenger.v3.v(chat) && (!org.telegram.messenger.v3.s(chat) || !chatActivityEnterView.S2)) || (userFull != null && userFull.voice_messages_forbidden))) {
                        chatActivityEnterView.N3.m2();
                        return true;
                    }
                    chatActivityEnterView.s1 = motionEvent.getX();
                    chatActivityEnterView.t1 = motionEvent.getY();
                    chatActivityEnterView.C1 = false;
                    chatActivityEnterView.H1 = false;
                    pg pgVar = chatActivityEnterView.C2;
                    if (pgVar != null) {
                        pgVar.c0 = false;
                        pgVar.b0.e(true, 0.0f);
                    }
                    chatActivityEnterView.v1 = false;
                    chatActivityEnterView.u1 = 0.0f;
                    ai.n0 n0Var2 = chatActivityEnterView.j1;
                    if (n0Var2 != null && n0Var2.m()) {
                        chatActivityEnterView.j1.j();
                    }
                    if (!chatActivityEnterView.S2) {
                        agVar.run();
                        return true;
                    }
                    chatActivityEnterView.x4 = false;
                    chatActivityEnterView.w4 = true;
                    org.telegram.messenger.g0.h3(agVar, 150L);
                    return true;
                }
                if (chatActivityEnterView.l1 && !chatActivityEnterView.d1) {
                    chatActivityEnterView.l0(false, false);
                    chatActivityEnterView.j0();
                    ai.n0 n0Var3 = chatActivityEnterView.j1;
                    if (n0Var3 == null || !n0Var3.o()) {
                        gf gfVar = chatActivityEnterView.F0;
                        if (gfVar != null && gfVar.length() > 0) {
                            chatActivityEnterView.r1();
                        }
                    } else {
                        ai.n0 n0Var4 = chatActivityEnterView.j1;
                        if (n0Var4.o0 && n0Var4.o()) {
                            Editable text = n0Var4.f.a.F0.getText();
                            if (text == null || text.toString().trim().length() <= 0) {
                                n0Var4.r();
                            } else {
                                n0Var4.z();
                            }
                        }
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                boolean z15 = chatActivityEnterView.S2;
                if (!z15 || chatActivityEnterView.x4) {
                    chatActivityEnterView.r3 = -1.0f;
                    if (!z15 || !chatActivityEnterView.d1) {
                        if (chatActivityEnterView.t3 && chatActivityEnterView.c()) {
                            Activity activity = chatActivityEnterView.C3;
                            long a10 = bnVar.a();
                            k2 k2Var = new k2(16);
                            me meVar = new me(i7);
                            Pattern pattern = b5.a;
                            org.telegram.ui.ActionBar.i6 i6Var = this.c;
                            b5.H(activity, a10, -1L, 0, false, k2Var, meVar, new y4(i6Var), i6Var);
                        }
                        if (b5.a0(chatActivityEnterView.R, chatActivityEnterView.E3)) {
                            if (chatActivityEnterView.d1) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Y1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.N3.l1();
                            } else {
                                if (chatActivityEnterView.g5) {
                                    chatActivityEnterView.x4 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.P);
                                chatActivityEnterView.N3.a1(0);
                                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.Y1;
                                if (slideTextView2 != null) {
                                    slideTextView2.setEnabled(false);
                                }
                            }
                            b5.X(chatActivityEnterView.R, 1, chatActivityEnterView.E3, new org.telegram.messenger.x10(this) { // from class: org.telegram.ui.Components.le
                                public final /* synthetic */ oe b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.x10
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i10) {
                                        case 0:
                                            this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        MediaController.B().B0(chatActivityEnterView.c() ? 3 : 1, 0, true, chatActivityEnterView.P);
                        chatActivityEnterView.N3.a1(0);
                    } else {
                        if (b5.a0(chatActivityEnterView.R, chatActivityEnterView.E3)) {
                            ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.Y1;
                            if (slideTextView3 != null) {
                                slideTextView3.setEnabled(false);
                            }
                            chatActivityEnterView.N3.l1();
                            b5.X(chatActivityEnterView.R, 1, chatActivityEnterView.E3, new org.telegram.messenger.x10(this) { // from class: org.telegram.ui.Components.le
                                public final /* synthetic */ oe b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.x10
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i7) {
                                        case 0:
                                            this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.N3.o2(1, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N6, 0L, true);
                        chatActivityEnterView.N6 = 0L;
                        reVar.setEffect(0L);
                    }
                    chatActivityEnterView.t3 = false;
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
                                    chatActivityEnterView2.o2(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                    chatActivityEnterView3.g0 = null;
                                    chatActivityEnterView3.o2(1, true);
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
                chatActivityEnterView.v1 = false;
                chatActivityEnterView.u1 = 0.0f;
                if (motionEvent.getAction() == 3 && chatActivityEnterView.t3) {
                    if (chatActivityEnterView.X4 >= 0.7f) {
                        chatActivityEnterView.g5 = true;
                        chatActivityEnterView.Z1();
                        return false;
                    }
                    if (chatActivityEnterView.S2 && chatActivityEnterView.d1) {
                        CameraController.getInstance().cancelOnInitRunnable(teVar);
                        chatActivityEnterView.N3.o2(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N6, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.N6 = 0L;
                        reVar.setEffect(0L);
                        z12 = false;
                    } else {
                        j11 = 0;
                        z12 = false;
                        chatActivityEnterView.N3.a1(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.W1 = j11;
                    chatActivityEnterView.t3 = z12;
                    chatActivityEnterView.o2(5, true);
                    return z12;
                }
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.B2;
                if ((recordCircle2 != null && ChatActivityEnterView.this.g5) || ((deVar = chatActivityEnterView.f1) != null && deVar.getVisibility() == 0)) {
                    if (!chatActivityEnterView.w4) {
                        return false;
                    }
                    org.telegram.messenger.g0.r(agVar);
                    return false;
                }
                if ((((oeVar.getX() + motionEvent.getX()) - chatActivityEnterView.r3) / chatActivityEnterView.s3) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.l1 && (n0Var = chatActivityEnterView.j1) != null && n0Var.n()) {
                        ai.n0 n0Var5 = chatActivityEnterView.j1;
                        if (n0Var5.o0 && n0Var5.o()) {
                            n0Var5.r();
                        }
                        j10 = 0;
                    } else {
                        if (!chatActivityEnterView.S2 || !chatActivityEnterView.d1) {
                            j10 = 0;
                            z11 = false;
                            chatActivityEnterView.N3.a1(0);
                            MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                            chatActivityEnterView.W1 = j10;
                            chatActivityEnterView.t3 = z11;
                            chatActivityEnterView.o2(5, true);
                            return true;
                        }
                        CameraController.getInstance().cancelOnInitRunnable(teVar);
                        chatActivityEnterView.N3.o2(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N6, 0L, true);
                        j10 = 0;
                        chatActivityEnterView.N6 = 0L;
                        reVar.setEffect(0L);
                    }
                    z11 = false;
                    chatActivityEnterView.W1 = j10;
                    chatActivityEnterView.t3 = z11;
                    chatActivityEnterView.o2(5, true);
                    return true;
                }
                if (chatActivityEnterView.w4) {
                    org.telegram.messenger.g0.r(agVar);
                    if (!chatActivityEnterView.l1) {
                        if (chatActivityEnterView.z0 && chatActivityEnterView.y0) {
                            chatActivityEnterView.N3.a0(!chatActivityEnterView.d1);
                            chatActivityEnterView.J1(!chatActivityEnterView.d1, true);
                        } else {
                            chatActivityEnterView.N3.m2();
                        }
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                }
                boolean z16 = chatActivityEnterView.S2;
                if (!z16 || chatActivityEnterView.x4) {
                    chatActivityEnterView.r3 = -1.0f;
                    if (!z16 || !chatActivityEnterView.d1) {
                        j3 = 0;
                        if (chatActivityEnterView.l1) {
                            chatActivityEnterView.k0();
                            return true;
                        }
                        if (chatActivityEnterView.z0) {
                            if (b5.a0(chatActivityEnterView.R, chatActivityEnterView.E3)) {
                                if (chatActivityEnterView.g5) {
                                    chatActivityEnterView.x4 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.P);
                                chatActivityEnterView.N3.a1(0);
                                ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.Y1;
                                if (slideTextView4 != null) {
                                    slideTextView4.setEnabled(false);
                                }
                                final int i11 = 3;
                                b5.X(chatActivityEnterView.R, 1, chatActivityEnterView.E3, new org.telegram.messenger.x10(this) { // from class: org.telegram.ui.Components.le
                                    public final /* synthetic */ oe b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.messenger.x10
                                    public final void a(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (i11) {
                                            case 0:
                                                this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                                break;
                                            case 1:
                                                this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                                break;
                                            case 2:
                                                this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                                break;
                                            default:
                                                this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                            if (chatActivityEnterView.t3 && chatActivityEnterView.c()) {
                                Activity activity2 = chatActivityEnterView.C3;
                                long a11 = bnVar.a();
                                k2 k2Var2 = new k2(17);
                                me meVar2 = new me(i10);
                                org.telegram.ui.ActionBar.i6 i6Var2 = this.c;
                                b5.H(activity2, a11, -1L, 0, false, k2Var2, meVar2, new y4(i6Var2), i6Var2);
                            }
                            z10 = false;
                            chatActivityEnterView.N3.a1(0);
                            MediaController.B().B0(chatActivityEnterView.c() ? 3 : 1, 0, true, chatActivityEnterView.P);
                            chatActivityEnterView.t3 = z10;
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
                                            chatActivityEnterView2.o2(1, true);
                                            break;
                                        default:
                                            ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                            chatActivityEnterView3.g0 = null;
                                            chatActivityEnterView3.o2(1, true);
                                            break;
                                    }
                                }
                            };
                            chatActivityEnterView.g0 = runnable2;
                            org.telegram.messenger.g0.h3(runnable2, !chatActivityEnterView.W5 ? 500L : j3);
                            return true;
                        }
                        chatActivityEnterView.N3.m2();
                    } else {
                        if (b5.a0(chatActivityEnterView.R, chatActivityEnterView.E3)) {
                            ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.Y1;
                            if (slideTextView5 != null) {
                                slideTextView5.setEnabled(false);
                            }
                            chatActivityEnterView.N3.l1();
                            final int i12 = 2;
                            b5.X(chatActivityEnterView.R, 1, chatActivityEnterView.E3, new org.telegram.messenger.x10(this) { // from class: org.telegram.ui.Components.le
                                public final /* synthetic */ oe b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.x10
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i12) {
                                        case 0:
                                            this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.s1(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        CameraController.getInstance().cancelOnInitRunnable(teVar);
                        chatActivityEnterView.N3.o2(1, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N6, 0L, true);
                        j3 = 0;
                        chatActivityEnterView.N6 = 0L;
                        reVar.setEffect(0L);
                    }
                    z10 = false;
                    chatActivityEnterView.t3 = z10;
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
                                    chatActivityEnterView2.o2(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                    chatActivityEnterView3.g0 = null;
                                    chatActivityEnterView3.o2(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.g0 = runnable22;
                    org.telegram.messenger.g0.h3(runnable22, !chatActivityEnterView.W5 ? 500L : j3);
                    return true;
                }
            } else if (motionEvent.getAction() == 2 && chatActivityEnterView.t3) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (!ChatActivityEnterView.this.g5) {
                    if (chatActivityEnterView.n0()) {
                        float f10 = chatActivityEnterView.s1 - x10;
                        float f11 = chatActivityEnterView.t1 - y10;
                        double d = f10;
                        double d2 = f11;
                        float hypot = (float) Math.hypot(d, d2);
                        double degrees = Math.toDegrees(Math.atan2(d2, d));
                        boolean z17 = chatActivityEnterView.v1;
                        if (f10 > 0.0f && f11 > 0.0f && hypot > org.telegram.messenger.g0.L(16.0f) && degrees >= 25.0d && degrees <= 65.0d) {
                            chatActivityEnterView.v1 = true;
                        } else if (!z17 || f10 <= 0.0f || f11 <= 0.0f || hypot <= org.telegram.messenger.g0.L(10.0f) || degrees < 15.0d || degrees > 75.0d) {
                            chatActivityEnterView.v1 = false;
                        } else {
                            chatActivityEnterView.v1 = true;
                        }
                        float L = org.telegram.messenger.g0.L(64.0f);
                        float sqrt = (f10 + f11) * ((float) Math.sqrt(0.5d));
                        chatActivityEnterView.u1 = chatActivityEnterView.v1 ? Utilities.i(sqrt / L, 1.0f, 0.0f) : 0.0f;
                        pg pgVar2 = chatActivityEnterView.C2;
                        if (pgVar2 != null) {
                            pgVar2.invalidate();
                        }
                        if (chatActivityEnterView.v1 && sqrt >= L && chatActivityEnterView.t3) {
                            chatActivityEnterView.H1 = true;
                            pg pgVar3 = chatActivityEnterView.C2;
                            if (pgVar3 != null) {
                                pgVar3.c0 = true;
                                pgVar3.invalidate();
                            }
                            try {
                                chatActivityEnterView.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (chatActivityEnterView.n0()) {
                                chatActivityEnterView.v1 = false;
                                chatActivityEnterView.u1 = 0.0f;
                                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.B2;
                                if (recordCircle3 == null || !recordCircle3.isShown() || chatActivityEnterView.B2.M <= org.telegram.messenger.g0.L(4.0f)) {
                                    fArr = null;
                                } else {
                                    int[] iArr = new int[2];
                                    chatActivityEnterView.B2.getLocationInWindow(iArr);
                                    float f12 = iArr[0];
                                    ChatActivityEnterView.RecordCircle recordCircle4 = chatActivityEnterView.B2;
                                    fArr = new float[]{f12 + recordCircle4.K, iArr[1] + recordCircle4.L, recordCircle4.M};
                                }
                                rg rgVar = chatActivityEnterView.Z1;
                                if (rgVar == null || rgVar.getWidth() <= 0 || !chatActivityEnterView.Z1.isShown() || chatActivityEnterView.Z1.getScaleX() <= 0.5f) {
                                    fArr2 = null;
                                } else {
                                    chatActivityEnterView.Z1.getLocationInWindow(new int[2]);
                                    chatActivityEnterView.a2.getLocationInWindow(new int[2]);
                                    fArr2 = new float[]{(chatActivityEnterView.Z1.getWidth() / 2.0f) + (r8[0] - r11[0]), (chatActivityEnterView.Z1.getHeight() / 2.0f) + (r8[1] - r11[1])};
                                }
                                if (chatActivityEnterView.t3 || ((recordCircle = chatActivityEnterView.B2) != null && ChatActivityEnterView.this.g5)) {
                                    chatActivityEnterView.W1 = 0L;
                                    chatActivityEnterView.B1 = true;
                                    chatActivityEnterView.C1 = true;
                                    try {
                                        chatActivityEnterView.G();
                                    } finally {
                                        chatActivityEnterView.B1 = false;
                                    }
                                }
                                ai.n0 w02 = chatActivityEnterView.w0();
                                int C0 = chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.ag);
                                w02.h0 = fArr2;
                                w02.n0 = C0;
                                ai.n0 w03 = chatActivityEnterView.w0();
                                int C02 = chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Uf);
                                w03.i0 = fArr;
                                w03.j0 = C02;
                                chatActivityEnterView.w0().F(false);
                            }
                        }
                        z13 = chatActivityEnterView.v1;
                    } else {
                        chatActivityEnterView.v1 = false;
                        z13 = false;
                    }
                    if (!z13) {
                        ChatActivityEnterView.RecordCircle recordCircle5 = chatActivityEnterView.B2;
                        ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                        if (!chatActivityEnterView2.g5) {
                            if (chatActivityEnterView2.Z4 == -1.0f) {
                                chatActivityEnterView2.Y4 = y10;
                            }
                            chatActivityEnterView2.Z4 = y10;
                            recordCircle5.invalidate();
                            if (chatActivityEnterView2.f5 || chatActivityEnterView2.X4 < 0.7f || chatActivityEnterView2.Y4 - chatActivityEnterView2.Z4 < org.telegram.messenger.g0.L(57.0f)) {
                                c10 = 1;
                                if (c10 != 2) {
                                    chatActivityEnterView.Z1();
                                    return false;
                                }
                                ChatActivityEnterView.RecordCircle recordCircle6 = chatActivityEnterView.B2;
                                float f13 = x10 - recordCircle6.G;
                                float f14 = y10 - recordCircle6.H;
                                float f15 = (f14 * f14) + (f13 * f13);
                                recordCircle6.H = y10;
                                recordCircle6.G = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.S4 && chatActivityEnterView3.U4 == 0.0f && f15 > recordCircle6.F) {
                                    chatActivityEnterView3.T4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.r3 == -1.0f) {
                                    chatActivityEnterView.r3 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.a2.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.s3 = measuredWidth;
                                    if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
                                        chatActivityEnterView.s3 = org.telegram.messenger.g0.L(140.0f);
                                    }
                                }
                                float x11 = oeVar.getX() + x10;
                                float f16 = chatActivityEnterView.r3;
                                float f17 = ((x11 - f16) / chatActivityEnterView.s3) + 1.0f;
                                if (f16 != -1.0f) {
                                    float f18 = f17 > 1.0f ? 1.0f : f17 < 0.0f ? 0.0f : f17;
                                    ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.Y1;
                                    if (slideTextView6 != null) {
                                        slideTextView6.r = f18;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f18);
                                    f17 = f18;
                                }
                                if (f17 == 0.0f) {
                                    if (chatActivityEnterView.S2 && chatActivityEnterView.d1) {
                                        CameraController.getInstance().cancelOnInitRunnable(teVar);
                                        chatActivityEnterView.N3.o2(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N6, 0L, true);
                                        chatActivityEnterView.N6 = 0L;
                                        reVar.setEffect(0L);
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                        chatActivityEnterView.N3.a1(0);
                                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                                    }
                                    chatActivityEnterView.t3 = z14;
                                    chatActivityEnterView.o2(5, true);
                                }
                            } else {
                                chatActivityEnterView2.g5 = true;
                                pg pgVar4 = chatActivityEnterView2.C2;
                                if (pgVar4 != null && org.telegram.messenger.mp.g1().getInt("voicepausehint", 0) <= 3 && !c8.b1.a()) {
                                    pgVar4.f();
                                    hi.m3 m3Var = new hi.m3(pgVar4.getContext(), 2);
                                    pgVar4.a = m3Var;
                                    m3Var.o(1.0f, 0.0f);
                                    pgVar4.a.r(true);
                                    pgVar4.a.v(org.telegram.messenger.gd.M0(2131743275, null));
                                    pgVar4.Q0.setHintGlass(pgVar4.a);
                                    org.telegram.messenger.mp.g1().edit().putInt("voicepausehint", org.telegram.messenger.mp.g1().getInt("voicepausehint", 0) + 1).apply();
                                    pgVar4.addView(pgVar4.a, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 0.0f, 54.0f, 58.0f));
                                    hi.m3 m3Var2 = pgVar4.a;
                                    m3Var2.r0 = new ng(pgVar4, m3Var2, 3);
                                    m3Var2.x();
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
