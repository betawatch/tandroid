package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class a extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final /* synthetic */ vnb c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ChatActivityEnterView chatActivityEnterView, Activity activity, vnb vnbVar) {
        super(activity);
        this.d = chatActivityEnterView;
        this.c = vnbVar;
        this.a = new Paint(1);
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.b1 && !chatActivityEnterView.T7) {
            vw1 vw1Var = chatActivityEnterView.T0;
            float f = 1.0f;
            if (vw1Var != null && vw1Var.getVisibility() == 0) {
                f = 1.0f - chatActivityEnterView.T0.getAlpha();
            }
            float N = hl.N(19.0f);
            int J0 = chatActivityEnterView.J0(aob.Pe);
            Paint paint = this.a;
            paint.setColor(J0);
            float N2 = hl.N(3.0f);
            float N3 = hl.N(38.0f);
            float measuredWidth = (getMeasuredWidth() - hl.N(38.0f)) - N2;
            float measuredHeight = (getMeasuredHeight() - N3) - N2;
            float measuredWidth2 = getMeasuredWidth() - N2;
            float measuredHeight2 = getMeasuredHeight() - N2;
            RectF rectF = this.b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(f, f, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, N, N, paint);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.d.T7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r7 == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07be  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rw1 rw1Var;
        long j;
        boolean z;
        long j2;
        boolean z2;
        bn3 bn3Var;
        long j3;
        boolean z3;
        boolean z4;
        float[] fArr;
        float[] fArr2;
        ChatActivityEnterView.RecordCircle recordCircle;
        boolean z5;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull;
        ChatActivityEnterView chatActivityEnterView = this.d;
        a aVar = chatActivityEnterView.a1;
        zu1 zu1Var = chatActivityEnterView.E3;
        g gVar = chatActivityEnterView.y4;
        mv1 mv1Var = chatActivityEnterView.Z6;
        bx1 bx1Var = chatActivityEnterView.K0;
        final byte b = 0;
        if (!chatActivityEnterView.T7) {
            final byte b2 = 1;
            if (chatActivityEnterView.I1) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 0) {
                    chatActivityEnterView.I1 = false;
                }
                return true;
            }
            if (chatActivityEnterView.W6 != 0) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 1 || actionMasked2 == 3) {
                    boolean z6 = chatActivityEnterView.W6 == 1 && actionMasked2 == 1;
                    chatActivityEnterView.W6 = (byte) 0;
                    hl.r(mv1Var);
                    if (z6) {
                        chatActivityEnterView.i0();
                        chatActivityEnterView.m0();
                        bn3 bn3Var2 = chatActivityEnterView.j1;
                        if (bn3Var2 == null || !bn3Var2.s()) {
                            tx1 tx1Var = chatActivityEnterView.F0;
                            if (tx1Var != null && tx1Var.length() > 0) {
                                chatActivityEnterView.E1();
                                return true;
                            }
                        } else {
                            bn3 bn3Var3 = chatActivityEnterView.j1;
                            if (bn3Var3.p0 && bn3Var3.s()) {
                                Editable text = bn3Var3.f.a.F0.getText();
                                if (text == null || text.toString().trim().length() <= 0) {
                                    bn3Var3.v();
                                    return true;
                                }
                                bn3Var3.E();
                                return true;
                            }
                        }
                    }
                } else if (actionMasked2 == 0) {
                    chatActivityEnterView.W6 = (byte) 0;
                    hl.r(mv1Var);
                }
                return true;
            }
            chatActivityEnterView.e0();
            if (motionEvent.getAction() == 0) {
                if (!ChatActivityEnterView.this.j5) {
                    chatActivityEnterView.o0();
                    if (zu1Var == null) {
                        userFull = chatActivityEnterView.L;
                        chat = null;
                    } else {
                        chat = zu1Var.e;
                        userFull = zu1Var.s8;
                    }
                    if (!chatActivityEnterView.l1 && ((chat != null && !xc2.v(chat) && (!xc2.s(chat) || !chatActivityEnterView.T2)) || (userFull != null && userFull.voice_messages_forbidden))) {
                        chatActivityEnterView.O3.D1();
                        return true;
                    }
                    chatActivityEnterView.u1 = motionEvent.getX();
                    chatActivityEnterView.v1 = motionEvent.getY();
                    chatActivityEnterView.E1 = false;
                    chatActivityEnterView.I1 = false;
                    l lVar = chatActivityEnterView.D2;
                    if (lVar != null) {
                        lVar.c0 = false;
                        lVar.b0.e(true, 0.0f);
                    }
                    chatActivityEnterView.x1 = false;
                    chatActivityEnterView.w1 = 0.0f;
                    bn3 bn3Var4 = chatActivityEnterView.j1;
                    if (bn3Var4 != null && bn3Var4.q()) {
                        chatActivityEnterView.j1.o();
                    }
                    if (!chatActivityEnterView.T2) {
                        gVar.run();
                        return true;
                    }
                    chatActivityEnterView.x4 = false;
                    chatActivityEnterView.w4 = true;
                    hl.d3(gVar, 150L);
                    return true;
                }
                if (chatActivityEnterView.l1 && !chatActivityEnterView.d1) {
                    chatActivityEnterView.W6 = (byte) 1;
                    hl.r(mv1Var);
                    hl.d3(mv1Var, ViewConfiguration.getLongPressTimeout());
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                boolean z7 = chatActivityEnterView.T2;
                if (!z7 || chatActivityEnterView.x4) {
                    chatActivityEnterView.s3 = -1.0f;
                    if (!z7 || !chatActivityEnterView.d1) {
                        if (chatActivityEnterView.u3 && chatActivityEnterView.c()) {
                            Activity activity = chatActivityEnterView.D3;
                            long a = zu1Var.a();
                            rm0 rm0Var = new rm0((byte) 27);
                            kc kcVar = new kc((byte) 20);
                            Pattern pattern = jj.a;
                            vnb vnbVar = this.c;
                            jj.H(activity, a, -1L, 0, false, rm0Var, kcVar, new gj(vnbVar), vnbVar);
                        }
                        if (jj.a0(chatActivityEnterView.R, chatActivityEnterView.F3)) {
                            if (chatActivityEnterView.d1) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Z1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.O3.S0();
                            } else {
                                if (chatActivityEnterView.j5) {
                                    chatActivityEnterView.x4 = true;
                                }
                                MediaController.z().H0(chatActivityEnterView.P);
                                chatActivityEnterView.O3.z0(0);
                                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.Z1;
                                if (slideTextView2 != null) {
                                    slideTextView2.setEnabled(false);
                                }
                            }
                            jj.X(chatActivityEnterView.R, chatActivityEnterView.F3, 1, new pcc(this) { // from class: xw1
                                public final /* synthetic */ a b;

                                {
                                    this.b = this;
                                }

                                @Override // pcc
                                public final void a(Object obj) {
                                    byte b3 = b2;
                                    a aVar2 = this.b;
                                    Long l = (Long) obj;
                                    switch (b3) {
                                        case 0:
                                            aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                            break;
                                        case 1:
                                            aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                            break;
                                        case 2:
                                            aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                            break;
                                        default:
                                            aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        MediaController.z().F0(chatActivityEnterView.c() ? (byte) 3 : (byte) 1, 0, true, chatActivityEnterView.P);
                        chatActivityEnterView.O3.z0(0);
                    } else {
                        if (jj.a0(chatActivityEnterView.R, chatActivityEnterView.F3)) {
                            ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.Z1;
                            if (slideTextView3 != null) {
                                slideTextView3.setEnabled(false);
                            }
                            chatActivityEnterView.O3.S0();
                            jj.X(chatActivityEnterView.R, chatActivityEnterView.F3, 1, new pcc(this) { // from class: xw1
                                public final /* synthetic */ a b;

                                {
                                    this.b = this;
                                }

                                @Override // pcc
                                public final void a(Object obj) {
                                    byte b3 = b;
                                    a aVar2 = this.b;
                                    Long l = (Long) obj;
                                    switch (b3) {
                                        case 0:
                                            aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                            break;
                                        case 1:
                                            aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                            break;
                                        case 2:
                                            aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                            break;
                                        default:
                                            aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.O3.H1(1, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.o7, 0L, true);
                        chatActivityEnterView.o7 = 0L;
                        bx1Var.setEffect(0L);
                    }
                    chatActivityEnterView.u3 = false;
                    chatActivityEnterView.h0 = false;
                    Runnable runnable = new Runnable(this) { // from class: yw1
                        public final /* synthetic */ a b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b;
                            a aVar2 = this.b;
                            switch (b3) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = aVar2.d;
                                    chatActivityEnterView2.g0 = null;
                                    chatActivityEnterView2.D2(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = aVar2.d;
                                    chatActivityEnterView3.g0 = null;
                                    chatActivityEnterView3.D2(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.g0 = runnable;
                    hl.d3(runnable, 200L);
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                motionEvent.getAction();
                chatActivityEnterView.x1 = false;
                chatActivityEnterView.w1 = 0.0f;
                if (motionEvent.getAction() == 3 && chatActivityEnterView.u3) {
                    if (chatActivityEnterView.X4 >= 0.7f) {
                        chatActivityEnterView.j5 = true;
                        chatActivityEnterView.o2();
                        return false;
                    }
                    if (chatActivityEnterView.T2 && chatActivityEnterView.d1) {
                        chatActivityEnterView.O3.H1(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.o7, 0L, true);
                        j3 = 0;
                        chatActivityEnterView.o7 = 0L;
                        bx1Var.setEffect(0L);
                        z3 = false;
                    } else {
                        j3 = 0;
                        z3 = false;
                        chatActivityEnterView.O3.z0(0);
                        MediaController.z().F0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.X1 = j3;
                    chatActivityEnterView.u3 = z3;
                    chatActivityEnterView.D2(5, true);
                    return z3;
                }
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.C2;
                if ((recordCircle2 != null && ChatActivityEnterView.this.j5) || ((rw1Var = chatActivityEnterView.f1) != null && rw1Var.getVisibility() == 0)) {
                    if (!chatActivityEnterView.w4) {
                        return false;
                    }
                    hl.r(gVar);
                    return false;
                }
                if ((((aVar.getX() + motionEvent.getX()) - chatActivityEnterView.s3) / chatActivityEnterView.t3) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.l1 && (bn3Var = chatActivityEnterView.j1) != null && bn3Var.r()) {
                        bn3 bn3Var5 = chatActivityEnterView.j1;
                        if (bn3Var5.p0 && bn3Var5.s()) {
                            bn3Var5.v();
                        }
                        z2 = false;
                        j2 = 0;
                    } else if (chatActivityEnterView.T2 && chatActivityEnterView.d1) {
                        chatActivityEnterView.O3.H1(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.o7, 0L, true);
                        j2 = 0;
                        chatActivityEnterView.o7 = 0L;
                        bx1Var.setEffect(0L);
                        z2 = false;
                    } else {
                        j2 = 0;
                        z2 = false;
                        chatActivityEnterView.O3.z0(0);
                        MediaController.z().F0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.X1 = j2;
                    chatActivityEnterView.u3 = z2;
                    chatActivityEnterView.D2(5, true);
                    return true;
                }
                if (chatActivityEnterView.w4) {
                    hl.r(gVar);
                    boolean z8 = chatActivityEnterView.l1;
                    if (!z8 || chatActivityEnterView.o1) {
                        if ((chatActivityEnterView.z0 || z8) && chatActivityEnterView.y0) {
                            chatActivityEnterView.O3.D(!chatActivityEnterView.d1);
                            chatActivityEnterView.X1(!chatActivityEnterView.d1, true);
                        } else {
                            chatActivityEnterView.O3.D1();
                        }
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                }
                boolean z9 = chatActivityEnterView.T2;
                if (!z9 || chatActivityEnterView.x4) {
                    chatActivityEnterView.s3 = -1.0f;
                    if (!z9 || !chatActivityEnterView.d1) {
                        j = 0;
                        if (chatActivityEnterView.l1) {
                            chatActivityEnterView.n0();
                            return true;
                        }
                        if (chatActivityEnterView.z0) {
                            if (jj.a0(chatActivityEnterView.R, chatActivityEnterView.F3)) {
                                if (chatActivityEnterView.j5) {
                                    chatActivityEnterView.x4 = true;
                                }
                                MediaController.z().H0(chatActivityEnterView.P);
                                chatActivityEnterView.O3.z0(0);
                                ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.Z1;
                                if (slideTextView4 != null) {
                                    slideTextView4.setEnabled(false);
                                }
                                jj.X(chatActivityEnterView.R, chatActivityEnterView.F3, 1, new pcc(this) { // from class: xw1
                                    public final /* synthetic */ a b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // pcc
                                    public final void a(Object obj) {
                                        byte b3 = r2;
                                        a aVar2 = this.b;
                                        Long l = (Long) obj;
                                        switch (b3) {
                                            case 0:
                                                aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                                break;
                                            case 1:
                                                aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                                break;
                                            case 2:
                                                aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                                break;
                                            default:
                                                aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                            if (chatActivityEnterView.u3 && chatActivityEnterView.c()) {
                                Activity activity2 = chatActivityEnterView.D3;
                                long a2 = zu1Var.a();
                                rm0 rm0Var2 = new rm0((byte) 28);
                                kc kcVar2 = new kc((byte) 21);
                                vnb vnbVar2 = this.c;
                                jj.H(activity2, a2, -1L, 0, false, rm0Var2, kcVar2, new gj(vnbVar2), vnbVar2);
                            }
                            z = false;
                            chatActivityEnterView.O3.z0(0);
                            MediaController.z().F0(chatActivityEnterView.c() ? (byte) 3 : (byte) 1, 0, true, chatActivityEnterView.P);
                            chatActivityEnterView.u3 = z;
                            chatActivityEnterView.h0 = z;
                            Runnable runnable2 = new Runnable(this) { // from class: yw1
                                public final /* synthetic */ a b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b3 = b2;
                                    a aVar2 = this.b;
                                    switch (b3) {
                                        case 0:
                                            ChatActivityEnterView chatActivityEnterView2 = aVar2.d;
                                            chatActivityEnterView2.g0 = null;
                                            chatActivityEnterView2.D2(1, true);
                                            break;
                                        default:
                                            ChatActivityEnterView chatActivityEnterView3 = aVar2.d;
                                            chatActivityEnterView3.g0 = null;
                                            chatActivityEnterView3.D2(1, true);
                                            break;
                                    }
                                }
                            };
                            chatActivityEnterView.g0 = runnable2;
                            hl.d3(runnable2, !chatActivityEnterView.i6 ? 500L : j);
                            return true;
                        }
                        chatActivityEnterView.O3.D1();
                    } else {
                        if (jj.a0(chatActivityEnterView.R, chatActivityEnterView.F3)) {
                            ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.Z1;
                            if (slideTextView5 != null) {
                                slideTextView5.setEnabled(false);
                            }
                            chatActivityEnterView.O3.S0();
                            final byte b3 = 2;
                            jj.X(chatActivityEnterView.R, chatActivityEnterView.F3, 1, new pcc(this) { // from class: xw1
                                public final /* synthetic */ a b;

                                {
                                    this.b = this;
                                }

                                @Override // pcc
                                public final void a(Object obj) {
                                    byte b32 = b3;
                                    a aVar2 = this.b;
                                    Long l = (Long) obj;
                                    switch (b32) {
                                        case 0:
                                            aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                            break;
                                        case 1:
                                            aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                            break;
                                        case 2:
                                            aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                            break;
                                        default:
                                            aVar2.d.F1(true, 0, 0, l.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.O3.H1(1, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.o7, 0L, true);
                        j = 0;
                        chatActivityEnterView.o7 = 0L;
                        bx1Var.setEffect(0L);
                    }
                    z = false;
                    chatActivityEnterView.u3 = z;
                    chatActivityEnterView.h0 = z;
                    Runnable runnable22 = new Runnable(this) { // from class: yw1
                        public final /* synthetic */ a b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b32 = b2;
                            a aVar2 = this.b;
                            switch (b32) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = aVar2.d;
                                    chatActivityEnterView2.g0 = null;
                                    chatActivityEnterView2.D2(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = aVar2.d;
                                    chatActivityEnterView3.g0 = null;
                                    chatActivityEnterView3.D2(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.g0 = runnable22;
                    hl.d3(runnable22, !chatActivityEnterView.i6 ? 500L : j);
                    return true;
                }
            } else if (motionEvent.getAction() == 2 && chatActivityEnterView.u3) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (!ChatActivityEnterView.this.j5) {
                    if (chatActivityEnterView.t0()) {
                        float f = chatActivityEnterView.u1 - x;
                        float f2 = chatActivityEnterView.v1 - y;
                        double d = f;
                        double d2 = f2;
                        float hypot = (float) Math.hypot(d, d2);
                        double degrees = Math.toDegrees(Math.atan2(d2, d));
                        boolean z10 = chatActivityEnterView.x1;
                        if (f > 0.0f && f2 > 0.0f && hypot > hl.L(16.0f) && degrees >= 25.0d && degrees <= 65.0d) {
                            chatActivityEnterView.x1 = true;
                        } else if (!z10 || f <= 0.0f || f2 <= 0.0f || hypot <= hl.L(10.0f) || degrees < 15.0d || degrees > 75.0d) {
                            chatActivityEnterView.x1 = false;
                        } else {
                            chatActivityEnterView.x1 = true;
                        }
                        float L = hl.L(64.0f);
                        float f3 = (f + f2) * 0.70710677f;
                        chatActivityEnterView.w1 = chatActivityEnterView.x1 ? Utilities.i(f3 / L, 1.0f, 0.0f) : 0.0f;
                        l lVar2 = chatActivityEnterView.D2;
                        if (lVar2 != null) {
                            lVar2.invalidate();
                        }
                        if (chatActivityEnterView.x1 && f3 >= L && chatActivityEnterView.u3) {
                            chatActivityEnterView.I1 = true;
                            l lVar3 = chatActivityEnterView.D2;
                            if (lVar3 != null) {
                                lVar3.c0 = true;
                                lVar3.invalidate();
                            }
                            try {
                                chatActivityEnterView.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (chatActivityEnterView.t0()) {
                                chatActivityEnterView.x1 = false;
                                chatActivityEnterView.w1 = 0.0f;
                                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.C2;
                                if (recordCircle3 == null || !recordCircle3.isShown() || chatActivityEnterView.C2.M <= hl.L(4.0f)) {
                                    fArr = null;
                                } else {
                                    int[] iArr = new int[2];
                                    chatActivityEnterView.C2.getLocationInWindow(iArr);
                                    float f4 = iArr[0];
                                    ChatActivityEnterView.RecordCircle recordCircle4 = chatActivityEnterView.C2;
                                    fArr = new float[]{f4 + recordCircle4.K, iArr[1] + recordCircle4.L, recordCircle4.M};
                                }
                                zy1 zy1Var = chatActivityEnterView.a2;
                                if (zy1Var == null || zy1Var.getWidth() <= 0 || !chatActivityEnterView.a2.isShown() || chatActivityEnterView.a2.getScaleX() <= 0.5f) {
                                    fArr2 = null;
                                } else {
                                    chatActivityEnterView.a2.getLocationInWindow(new int[2]);
                                    chatActivityEnterView.b2.getLocationInWindow(new int[2]);
                                    fArr2 = new float[]{(chatActivityEnterView.a2.getWidth() / 2.0f) + (r7[0] - r8[0]), (chatActivityEnterView.a2.getHeight() / 2.0f) + (r7[1] - r8[1])};
                                }
                                if (chatActivityEnterView.u3 || ((recordCircle = chatActivityEnterView.C2) != null && ChatActivityEnterView.this.j5)) {
                                    chatActivityEnterView.X1 = 0L;
                                    chatActivityEnterView.D1 = true;
                                    chatActivityEnterView.E1 = true;
                                    try {
                                        chatActivityEnterView.G();
                                    } finally {
                                        chatActivityEnterView.D1 = false;
                                    }
                                }
                                bn3 D0 = chatActivityEnterView.D0();
                                int J0 = chatActivityEnterView.J0(aob.ag);
                                D0.i0 = fArr2;
                                D0.o0 = J0;
                                bn3 D02 = chatActivityEnterView.D0();
                                int J02 = chatActivityEnterView.J0(aob.Uf);
                                D02.j0 = fArr;
                                D02.k0 = J02;
                                chatActivityEnterView.D0().M(false);
                            }
                        }
                        z4 = chatActivityEnterView.x1;
                    } else {
                        chatActivityEnterView.x1 = false;
                        z4 = false;
                    }
                    if (!z4) {
                        ChatActivityEnterView.RecordCircle recordCircle5 = chatActivityEnterView.C2;
                        ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                        if (!chatActivityEnterView2.j5) {
                            if (chatActivityEnterView2.Z4 == -1.0f) {
                                chatActivityEnterView2.Y4 = y;
                            }
                            chatActivityEnterView2.Z4 = y;
                            recordCircle5.invalidate();
                            if (chatActivityEnterView2.i5 || chatActivityEnterView2.X4 < 0.7f || chatActivityEnterView2.Y4 - chatActivityEnterView2.Z4 < hl.L(57.0f)) {
                                ChatActivityEnterView.RecordCircle recordCircle6 = chatActivityEnterView.C2;
                                float f5 = x - recordCircle6.G;
                                float f6 = y - recordCircle6.H;
                                float f7 = (f6 * f6) + (f5 * f5);
                                recordCircle6.H = y;
                                recordCircle6.G = x;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.S4 && chatActivityEnterView3.U4 == 0.0f && f7 > recordCircle6.F) {
                                    chatActivityEnterView3.T4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.s3 == -1.0f) {
                                    chatActivityEnterView.s3 = x;
                                    float measuredWidth = (float) (chatActivityEnterView.b2.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.t3 = measuredWidth;
                                    if (measuredWidth > hl.L(140.0f)) {
                                        chatActivityEnterView.t3 = hl.L(140.0f);
                                    }
                                }
                                float x2 = aVar.getX() + x;
                                float f8 = chatActivityEnterView.s3;
                                float f9 = ((x2 - f8) / chatActivityEnterView.t3) + 1.0f;
                                if (f8 != -1.0f) {
                                    float f10 = f9 <= 1.0f ? f9 < 0.0f ? 0.0f : f9 : 1.0f;
                                    ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.Z1;
                                    if (slideTextView6 != null) {
                                        slideTextView6.r = f10;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f10);
                                    f9 = f10;
                                }
                                if (f9 == 0.0f) {
                                    if (chatActivityEnterView.T2 && chatActivityEnterView.d1) {
                                        chatActivityEnterView.O3.H1(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.o7, 0L, true);
                                        chatActivityEnterView.o7 = 0L;
                                        bx1Var.setEffect(0L);
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                        chatActivityEnterView.O3.z0(0);
                                        MediaController.z().F0(0, 0, false, chatActivityEnterView.P);
                                    }
                                    chatActivityEnterView.u3 = z5;
                                    chatActivityEnterView.D2(5, true);
                                }
                            } else {
                                chatActivityEnterView2.j5 = true;
                                l lVar4 = chatActivityEnterView2.D2;
                                if (lVar4 != null && uc7.e1().getInt("voicepausehint", 0) <= 3 && !o2f.a()) {
                                    lVar4.f();
                                    dz1 dz1Var = new dz1(lVar4.getContext());
                                    lVar4.a = dz1Var;
                                    dz1Var.n(1.0f, 0.0f);
                                    lVar4.a.p(true);
                                    lVar4.a.m(15.0f, 8.0f, 8.0f, 8.0f);
                                    lVar4.a.t(ob6.M0(2131743164, null));
                                    uc7.e1().edit().putInt("voicepausehint", uc7.e1().getInt("voicepausehint", 0) + 1).apply();
                                    lVar4.addView(lVar4.a, tre.d(-1, -1.0f, jn7.D1, 0.0f, 0.0f, 54.0f, 58.0f));
                                    dz1 dz1Var2 = lVar4.a;
                                    dz1Var2.r0 = new yy1(lVar4, dz1Var2, (byte) 2);
                                    dz1Var2.v();
                                }
                            }
                        }
                        chatActivityEnterView.o2();
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
