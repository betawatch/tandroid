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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final /* synthetic */ ylb c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ChatActivityEnterView chatActivityEnterView, Activity activity, ylb ylbVar) {
        super(activity);
        this.d = chatActivityEnterView;
        this.c = ylbVar;
        this.a = new Paint(1);
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.b1 && !chatActivityEnterView.w7) {
            tx1 tx1Var = chatActivityEnterView.T0;
            float f = 1.0f;
            if (tx1Var != null && tx1Var.getVisibility() == 0) {
                f = 1.0f - chatActivityEnterView.T0.getAlpha();
            }
            float N = gm.N(19.0f);
            int F0 = chatActivityEnterView.F0(cmb.Oe);
            Paint paint = this.a;
            paint.setColor(F0);
            float N2 = gm.N(3.0f);
            float N3 = gm.N(38.0f);
            float measuredWidth = (getMeasuredWidth() - gm.N(38.0f)) - N2;
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
        return !this.d.w7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r6 == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:371:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x078d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        px1 px1Var;
        long j;
        boolean z;
        long j2;
        boolean z2;
        un3 un3Var;
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
        yv1 yv1Var = chatActivityEnterView.F3;
        i iVar = chatActivityEnterView.z4;
        by1 by1Var = chatActivityEnterView.K0;
        final byte b = 0;
        if (!chatActivityEnterView.w7) {
            final byte b2 = 1;
            if (chatActivityEnterView.J1) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 0) {
                    chatActivityEnterView.J1 = false;
                }
                return true;
            }
            chatActivityEnterView.c0();
            if (motionEvent.getAction() == 0) {
                if (!ChatActivityEnterView.this.h5) {
                    chatActivityEnterView.l0();
                    if (yv1Var == null) {
                        userFull = chatActivityEnterView.L;
                        chat = null;
                    } else {
                        chat = yv1Var.e;
                        userFull = yv1Var.s8;
                    }
                    if (!chatActivityEnterView.l1 && ((chat != null && !sd2.v(chat) && (!sd2.s(chat) || !chatActivityEnterView.U2)) || (userFull != null && userFull.voice_messages_forbidden))) {
                        chatActivityEnterView.P3.A1();
                        return true;
                    }
                    chatActivityEnterView.u1 = motionEvent.getX();
                    chatActivityEnterView.v1 = motionEvent.getY();
                    chatActivityEnterView.E1 = false;
                    chatActivityEnterView.J1 = false;
                    l lVar = chatActivityEnterView.E2;
                    if (lVar != null) {
                        lVar.c0 = false;
                        lVar.b0.e(true, 0.0f);
                    }
                    chatActivityEnterView.x1 = false;
                    chatActivityEnterView.w1 = 0.0f;
                    un3 un3Var2 = chatActivityEnterView.j1;
                    if (un3Var2 != null && un3Var2.o()) {
                        chatActivityEnterView.j1.m();
                    }
                    if (!chatActivityEnterView.U2) {
                        iVar.run();
                        return true;
                    }
                    chatActivityEnterView.y4 = false;
                    chatActivityEnterView.x4 = true;
                    gm.d3(iVar, 150L);
                    return true;
                }
                if (chatActivityEnterView.l1 && !chatActivityEnterView.d1) {
                    chatActivityEnterView.m0(false, false);
                    chatActivityEnterView.j0();
                    un3 un3Var3 = chatActivityEnterView.j1;
                    if (un3Var3 == null || !un3Var3.q()) {
                        sy1 sy1Var = chatActivityEnterView.F0;
                        if (sy1Var != null && sy1Var.length() > 0) {
                            chatActivityEnterView.w1();
                        }
                    } else {
                        un3 un3Var4 = chatActivityEnterView.j1;
                        if (un3Var4.o0 && un3Var4.q()) {
                            Editable text = un3Var4.f.a.F0.getText();
                            if (text == null || text.toString().trim().length() <= 0) {
                                un3Var4.t();
                            } else {
                                un3Var4.B();
                            }
                        }
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                boolean z6 = chatActivityEnterView.U2;
                if (!z6 || chatActivityEnterView.y4) {
                    chatActivityEnterView.t3 = -1.0f;
                    if (!z6 || !chatActivityEnterView.d1) {
                        if (chatActivityEnterView.v3 && chatActivityEnterView.c()) {
                            Activity activity = chatActivityEnterView.E3;
                            long a = yv1Var.a();
                            qn0 qn0Var = new qn0((byte) 23);
                            jd jdVar = new jd((byte) 20);
                            Pattern pattern = ik.a;
                            ylb ylbVar = this.c;
                            ik.H(activity, a, -1L, 0, false, qn0Var, jdVar, new fk(ylbVar), ylbVar);
                        }
                        if (ik.a0(chatActivityEnterView.R, chatActivityEnterView.G3)) {
                            if (chatActivityEnterView.d1) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.a2;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.P3.I0();
                            } else {
                                if (chatActivityEnterView.h5) {
                                    chatActivityEnterView.y4 = true;
                                }
                                MediaController.w().C0(chatActivityEnterView.P);
                                chatActivityEnterView.P3.z0(0);
                                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.a2;
                                if (slideTextView2 != null) {
                                    slideTextView2.setEnabled(false);
                                }
                            }
                            ik.X(chatActivityEnterView.R, chatActivityEnterView.G3, 1, new qac(this) { // from class: xx1
                                public final /* synthetic */ a b;

                                {
                                    this.b = this;
                                }

                                @Override // qac
                                public final void a(Object obj) {
                                    byte b3 = b2;
                                    a aVar2 = this.b;
                                    Long l = (Long) obj;
                                    switch (b3) {
                                        case 0:
                                            aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                            break;
                                        case 1:
                                            aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                            break;
                                        case 2:
                                            aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                            break;
                                        default:
                                            aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        MediaController.w().A0(chatActivityEnterView.c() ? 3 : 1, 0, true, chatActivityEnterView.P);
                        chatActivityEnterView.P3.z0(0);
                    } else {
                        if (ik.a0(chatActivityEnterView.R, chatActivityEnterView.G3)) {
                            ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.a2;
                            if (slideTextView3 != null) {
                                slideTextView3.setEnabled(false);
                            }
                            chatActivityEnterView.P3.I0();
                            ik.X(chatActivityEnterView.R, chatActivityEnterView.G3, 1, new qac(this) { // from class: xx1
                                public final /* synthetic */ a b;

                                {
                                    this.b = this;
                                }

                                @Override // qac
                                public final void a(Object obj) {
                                    byte b3 = b;
                                    a aVar2 = this.b;
                                    Long l = (Long) obj;
                                    switch (b3) {
                                        case 0:
                                            aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                            break;
                                        case 1:
                                            aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                            break;
                                        case 2:
                                            aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                            break;
                                        default:
                                            aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.P3.F1(1, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.W6, 0L, true);
                        chatActivityEnterView.W6 = 0L;
                        by1Var.setEffect(0L);
                    }
                    chatActivityEnterView.v3 = false;
                    chatActivityEnterView.h0 = false;
                    Runnable runnable = new Runnable(this) { // from class: yx1
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
                                    chatActivityEnterView2.w2(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = aVar2.d;
                                    chatActivityEnterView3.g0 = null;
                                    chatActivityEnterView3.w2(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.g0 = runnable;
                    gm.d3(runnable, 200L);
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            final byte b3 = 2;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                motionEvent.getAction();
                chatActivityEnterView.x1 = false;
                chatActivityEnterView.w1 = 0.0f;
                if (motionEvent.getAction() == 3 && chatActivityEnterView.v3) {
                    if (chatActivityEnterView.Y4 >= 0.7f) {
                        chatActivityEnterView.h5 = true;
                        chatActivityEnterView.f2();
                        return false;
                    }
                    if (chatActivityEnterView.U2 && chatActivityEnterView.d1) {
                        chatActivityEnterView.P3.F1(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.W6, 0L, true);
                        j3 = 0;
                        chatActivityEnterView.W6 = 0L;
                        by1Var.setEffect(0L);
                        z3 = false;
                    } else {
                        j3 = 0;
                        z3 = false;
                        chatActivityEnterView.P3.z0(0);
                        MediaController.w().A0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.Y1 = j3;
                    chatActivityEnterView.v3 = z3;
                    chatActivityEnterView.w2(5, true);
                    return z3;
                }
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.D2;
                if ((recordCircle2 != null && ChatActivityEnterView.this.h5) || ((px1Var = chatActivityEnterView.f1) != null && px1Var.getVisibility() == 0)) {
                    if (!chatActivityEnterView.x4) {
                        return false;
                    }
                    gm.r(iVar);
                    return false;
                }
                if ((((aVar.getX() + motionEvent.getX()) - chatActivityEnterView.t3) / chatActivityEnterView.u3) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.l1 && (un3Var = chatActivityEnterView.j1) != null && un3Var.p()) {
                        un3 un3Var5 = chatActivityEnterView.j1;
                        if (un3Var5.o0 && un3Var5.q()) {
                            un3Var5.t();
                        }
                        z2 = false;
                        j2 = 0;
                    } else if (chatActivityEnterView.U2 && chatActivityEnterView.d1) {
                        chatActivityEnterView.P3.F1(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.W6, 0L, true);
                        j2 = 0;
                        chatActivityEnterView.W6 = 0L;
                        by1Var.setEffect(0L);
                        z2 = false;
                    } else {
                        j2 = 0;
                        z2 = false;
                        chatActivityEnterView.P3.z0(0);
                        MediaController.w().A0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.Y1 = j2;
                    chatActivityEnterView.v3 = z2;
                    chatActivityEnterView.w2(5, true);
                    return true;
                }
                if (chatActivityEnterView.x4) {
                    gm.r(iVar);
                    boolean z7 = chatActivityEnterView.l1;
                    if (!z7 || chatActivityEnterView.o1) {
                        if ((chatActivityEnterView.z0 || z7) && chatActivityEnterView.y0) {
                            chatActivityEnterView.P3.C(!chatActivityEnterView.d1);
                            chatActivityEnterView.P1(!chatActivityEnterView.d1, true);
                        } else {
                            chatActivityEnterView.P3.A1();
                        }
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                }
                boolean z8 = chatActivityEnterView.U2;
                if (!z8 || chatActivityEnterView.y4) {
                    chatActivityEnterView.t3 = -1.0f;
                    if (!z8 || !chatActivityEnterView.d1) {
                        j = 0;
                        if (chatActivityEnterView.l1) {
                            chatActivityEnterView.k0();
                            return true;
                        }
                        if (chatActivityEnterView.z0) {
                            if (ik.a0(chatActivityEnterView.R, chatActivityEnterView.G3)) {
                                if (chatActivityEnterView.h5) {
                                    chatActivityEnterView.y4 = true;
                                }
                                MediaController.w().C0(chatActivityEnterView.P);
                                chatActivityEnterView.P3.z0(0);
                                ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.a2;
                                if (slideTextView4 != null) {
                                    slideTextView4.setEnabled(false);
                                }
                                final byte b4 = 3;
                                ik.X(chatActivityEnterView.R, chatActivityEnterView.G3, 1, new qac(this) { // from class: xx1
                                    public final /* synthetic */ a b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // qac
                                    public final void a(Object obj) {
                                        byte b32 = b4;
                                        a aVar2 = this.b;
                                        Long l = (Long) obj;
                                        switch (b32) {
                                            case 0:
                                                aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                                break;
                                            case 1:
                                                aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                                break;
                                            case 2:
                                                aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                                break;
                                            default:
                                                aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                            if (chatActivityEnterView.v3 && chatActivityEnterView.c()) {
                                Activity activity2 = chatActivityEnterView.E3;
                                long a2 = yv1Var.a();
                                qn0 qn0Var2 = new qn0((byte) 24);
                                jd jdVar2 = new jd((byte) 21);
                                ylb ylbVar2 = this.c;
                                ik.H(activity2, a2, -1L, 0, false, qn0Var2, jdVar2, new fk(ylbVar2), ylbVar2);
                            }
                            z = false;
                            chatActivityEnterView.P3.z0(0);
                            MediaController.w().A0(chatActivityEnterView.c() ? 3 : 1, 0, true, chatActivityEnterView.P);
                            chatActivityEnterView.v3 = z;
                            chatActivityEnterView.h0 = z;
                            Runnable runnable2 = new Runnable(this) { // from class: yx1
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
                                            chatActivityEnterView2.w2(1, true);
                                            break;
                                        default:
                                            ChatActivityEnterView chatActivityEnterView3 = aVar2.d;
                                            chatActivityEnterView3.g0 = null;
                                            chatActivityEnterView3.w2(1, true);
                                            break;
                                    }
                                }
                            };
                            chatActivityEnterView.g0 = runnable2;
                            gm.d3(runnable2, !chatActivityEnterView.X5 ? 500L : j);
                            return true;
                        }
                        chatActivityEnterView.P3.A1();
                    } else {
                        if (ik.a0(chatActivityEnterView.R, chatActivityEnterView.G3)) {
                            ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.a2;
                            if (slideTextView5 != null) {
                                slideTextView5.setEnabled(false);
                            }
                            chatActivityEnterView.P3.I0();
                            ik.X(chatActivityEnterView.R, chatActivityEnterView.G3, 1, new qac(this) { // from class: xx1
                                public final /* synthetic */ a b;

                                {
                                    this.b = this;
                                }

                                @Override // qac
                                public final void a(Object obj) {
                                    byte b32 = b3;
                                    a aVar2 = this.b;
                                    Long l = (Long) obj;
                                    switch (b32) {
                                        case 0:
                                            aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                            break;
                                        case 1:
                                            aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                            break;
                                        case 2:
                                            aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                            break;
                                        default:
                                            aVar2.d.x1(true, 0, 0, l.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.P3.F1(1, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.W6, 0L, true);
                        j = 0;
                        chatActivityEnterView.W6 = 0L;
                        by1Var.setEffect(0L);
                    }
                    z = false;
                    chatActivityEnterView.v3 = z;
                    chatActivityEnterView.h0 = z;
                    Runnable runnable22 = new Runnable(this) { // from class: yx1
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
                                    chatActivityEnterView2.w2(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = aVar2.d;
                                    chatActivityEnterView3.g0 = null;
                                    chatActivityEnterView3.w2(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.g0 = runnable22;
                    gm.d3(runnable22, !chatActivityEnterView.X5 ? 500L : j);
                    return true;
                }
            } else if (motionEvent.getAction() == 2 && chatActivityEnterView.v3) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (!ChatActivityEnterView.this.h5) {
                    if (chatActivityEnterView.q0()) {
                        float f = chatActivityEnterView.u1 - x;
                        float f2 = chatActivityEnterView.v1 - y;
                        double d = f;
                        double d2 = f2;
                        float hypot = (float) Math.hypot(d, d2);
                        double degrees = Math.toDegrees(Math.atan2(d2, d));
                        boolean z9 = chatActivityEnterView.x1;
                        if (f > 0.0f && f2 > 0.0f && hypot > gm.L(16.0f) && degrees >= 25.0d && degrees <= 65.0d) {
                            chatActivityEnterView.x1 = true;
                        } else if (!z9 || f <= 0.0f || f2 <= 0.0f || hypot <= gm.L(10.0f) || degrees < 15.0d || degrees > 75.0d) {
                            chatActivityEnterView.x1 = false;
                        } else {
                            chatActivityEnterView.x1 = true;
                        }
                        float L = gm.L(64.0f);
                        float f3 = (f + f2) * 0.70710677f;
                        chatActivityEnterView.w1 = chatActivityEnterView.x1 ? Utilities.i(f3 / L, 1.0f, 0.0f) : 0.0f;
                        l lVar2 = chatActivityEnterView.E2;
                        if (lVar2 != null) {
                            lVar2.invalidate();
                        }
                        if (chatActivityEnterView.x1 && f3 >= L && chatActivityEnterView.v3) {
                            chatActivityEnterView.J1 = true;
                            l lVar3 = chatActivityEnterView.E2;
                            if (lVar3 != null) {
                                lVar3.c0 = true;
                                lVar3.invalidate();
                            }
                            try {
                                chatActivityEnterView.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (chatActivityEnterView.q0()) {
                                chatActivityEnterView.x1 = false;
                                chatActivityEnterView.w1 = 0.0f;
                                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.D2;
                                if (recordCircle3 == null || !recordCircle3.isShown() || chatActivityEnterView.D2.M <= gm.L(4.0f)) {
                                    fArr = null;
                                } else {
                                    int[] iArr = new int[2];
                                    chatActivityEnterView.D2.getLocationInWindow(iArr);
                                    float f4 = iArr[0];
                                    ChatActivityEnterView.RecordCircle recordCircle4 = chatActivityEnterView.D2;
                                    fArr = new float[]{f4 + recordCircle4.K, iArr[1] + recordCircle4.L, recordCircle4.M};
                                }
                                wz1 wz1Var = chatActivityEnterView.b2;
                                if (wz1Var == null || wz1Var.getWidth() <= 0 || !chatActivityEnterView.b2.isShown() || chatActivityEnterView.b2.getScaleX() <= 0.5f) {
                                    fArr2 = null;
                                } else {
                                    chatActivityEnterView.b2.getLocationInWindow(new int[2]);
                                    chatActivityEnterView.c2.getLocationInWindow(new int[2]);
                                    fArr2 = new float[]{(chatActivityEnterView.b2.getWidth() / 2.0f) + (r4[0] - r6[0]), (chatActivityEnterView.b2.getHeight() / 2.0f) + (r4[1] - r6[1])};
                                }
                                if (chatActivityEnterView.v3 || ((recordCircle = chatActivityEnterView.D2) != null && ChatActivityEnterView.this.h5)) {
                                    chatActivityEnterView.Y1 = 0L;
                                    chatActivityEnterView.D1 = true;
                                    chatActivityEnterView.E1 = true;
                                    try {
                                        chatActivityEnterView.E();
                                    } finally {
                                        chatActivityEnterView.D1 = false;
                                    }
                                }
                                un3 z0 = chatActivityEnterView.z0();
                                int F0 = chatActivityEnterView.F0(cmb.Zf);
                                z0.h0 = fArr2;
                                z0.n0 = F0;
                                un3 z02 = chatActivityEnterView.z0();
                                int F02 = chatActivityEnterView.F0(cmb.Tf);
                                z02.i0 = fArr;
                                z02.j0 = F02;
                                chatActivityEnterView.z0().I(false);
                            }
                        }
                        z4 = chatActivityEnterView.x1;
                    } else {
                        chatActivityEnterView.x1 = false;
                        z4 = false;
                    }
                    if (!z4) {
                        ChatActivityEnterView.RecordCircle recordCircle5 = chatActivityEnterView.D2;
                        ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                        if (!chatActivityEnterView2.h5) {
                            if (chatActivityEnterView2.a5 == -1.0f) {
                                chatActivityEnterView2.Z4 = y;
                            }
                            chatActivityEnterView2.a5 = y;
                            recordCircle5.invalidate();
                            if (chatActivityEnterView2.g5 || chatActivityEnterView2.Y4 < 0.7f || chatActivityEnterView2.Z4 - chatActivityEnterView2.a5 < gm.L(57.0f)) {
                                ChatActivityEnterView.RecordCircle recordCircle6 = chatActivityEnterView.D2;
                                float f5 = x - recordCircle6.G;
                                float f6 = y - recordCircle6.H;
                                float f7 = (f6 * f6) + (f5 * f5);
                                recordCircle6.H = y;
                                recordCircle6.G = x;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.T4 && chatActivityEnterView3.V4 == 0.0f && f7 > recordCircle6.F) {
                                    chatActivityEnterView3.U4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.t3 == -1.0f) {
                                    chatActivityEnterView.t3 = x;
                                    float measuredWidth = (float) (chatActivityEnterView.c2.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.u3 = measuredWidth;
                                    if (measuredWidth > gm.L(140.0f)) {
                                        chatActivityEnterView.u3 = gm.L(140.0f);
                                    }
                                }
                                float x2 = aVar.getX() + x;
                                float f8 = chatActivityEnterView.t3;
                                float f9 = ((x2 - f8) / chatActivityEnterView.u3) + 1.0f;
                                if (f8 != -1.0f) {
                                    float f10 = f9 > 1.0f ? 1.0f : f9 < 0.0f ? 0.0f : f9;
                                    ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.a2;
                                    if (slideTextView6 != null) {
                                        slideTextView6.r = f10;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f10);
                                    f9 = f10;
                                }
                                if (f9 == 0.0f) {
                                    if (chatActivityEnterView.U2 && chatActivityEnterView.d1) {
                                        chatActivityEnterView.P3.F1(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.W6, 0L, true);
                                        chatActivityEnterView.W6 = 0L;
                                        by1Var.setEffect(0L);
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                        chatActivityEnterView.P3.z0(0);
                                        MediaController.w().A0(0, 0, false, chatActivityEnterView.P);
                                    }
                                    chatActivityEnterView.v3 = z5;
                                    chatActivityEnterView.w2(5, true);
                                }
                            } else {
                                chatActivityEnterView2.h5 = true;
                                l lVar4 = chatActivityEnterView2.E2;
                                if (lVar4 != null) {
                                    ChatActivityEnterView chatActivityEnterView4 = lVar4.Q0;
                                    if (oc7.d1().getInt("voicepausehint", 0) <= 3 && !yze.a()) {
                                        lVar4.e();
                                        hg5 hg5Var = new hg5(lVar4.getContext(), 2);
                                        lVar4.a = hg5Var;
                                        hg5Var.n(1.0f, 0.0f);
                                        lVar4.a.p(true);
                                        lVar4.a.t(jb6.M0(2131743196, null));
                                        chatActivityEnterView4.setHintGlass(lVar4.a);
                                        oc7.d1().edit().putInt("voicepausehint", oc7.d1().getInt("voicepausehint", 0) + 1).apply();
                                        lVar4.addView(lVar4.a, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 54.0f, 58.0f));
                                        hg5 hg5Var2 = lVar4.a;
                                        hg5Var2.r0 = new vz1(lVar4, hg5Var2, (byte) 3);
                                        hg5Var2.v();
                                    }
                                }
                            }
                        }
                        chatActivityEnterView.f2();
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
