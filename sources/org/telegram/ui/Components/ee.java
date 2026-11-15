package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.Editable;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ee extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
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
            zd zdVar = chatActivityEnterView.T0;
            float f10 = 1.0f;
            if (zdVar != null && zdVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.T0.getAlpha();
            }
            float N = org.telegram.messenger.g0.N(19.0f);
            int u02 = chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Pe);
            Paint paint = this.a;
            paint.setColor(u02);
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
        return !this.d.K6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r7 != 0) goto L387;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0968  */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v39 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ud udVar;
        long j3;
        boolean z10;
        long j10;
        boolean z11;
        long j11;
        boolean z12;
        boolean z13;
        float[] fArr;
        float[] fArr2;
        ?? r13;
        String str;
        ai.i iVar;
        ChatActivityEnterView.RecordCircle recordCircle;
        char c10;
        boolean z14;
        ChatActivityEnterView chatActivityEnterView = this.d;
        ee eeVar = chatActivityEnterView.a1;
        org.telegram.ui.an anVar = chatActivityEnterView.x3;
        ke keVar = chatActivityEnterView.p4;
        tf tfVar = chatActivityEnterView.s4;
        he heVar = chatActivityEnterView.K0;
        final int i7 = 0;
        if (!chatActivityEnterView.K6) {
            final int i10 = 1;
            if (chatActivityEnterView.B1) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 0) {
                    chatActivityEnterView.B1 = false;
                }
                return true;
            }
            chatActivityEnterView.c0();
            int i11 = 15;
            if (motionEvent.getAction() == 0) {
                if (!ChatActivityEnterView.this.a5) {
                    TLRPC.Chat chat = anVar == null ? null : anVar.e;
                    TLRPC.UserFull userFull = anVar == null ? chatActivityEnterView.L : anVar.r8;
                    if ((chat != null && !org.telegram.messenger.t3.v(chat) && (!org.telegram.messenger.t3.s(chat) || !chatActivityEnterView.M2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                        chatActivityEnterView.H3.m2();
                        return true;
                    }
                    chatActivityEnterView.n1 = motionEvent.getX();
                    chatActivityEnterView.o1 = motionEvent.getY();
                    chatActivityEnterView.x1 = false;
                    chatActivityEnterView.B1 = false;
                    gg ggVar = chatActivityEnterView.w2;
                    if (ggVar != null) {
                        ggVar.c0 = false;
                        ggVar.b0.e(true, 0.0f);
                    }
                    chatActivityEnterView.q1 = false;
                    chatActivityEnterView.p1 = 0.0f;
                    ai.n0 n0Var = chatActivityEnterView.j1;
                    if (n0Var != null && n0Var.r != 0) {
                        n0Var.i();
                    }
                    if (!chatActivityEnterView.M2) {
                        tfVar.run();
                        return true;
                    }
                    chatActivityEnterView.r4 = false;
                    chatActivityEnterView.q4 = true;
                    org.telegram.messenger.g0.i3(tfVar, 150L);
                    return true;
                }
                boolean z15 = chatActivityEnterView.M2;
                if (!z15 || chatActivityEnterView.r4) {
                    chatActivityEnterView.l3 = -1.0f;
                    if (!z15 || !chatActivityEnterView.d1) {
                        if (chatActivityEnterView.n3 && chatActivityEnterView.c()) {
                            Activity activity = chatActivityEnterView.w3;
                            long a10 = anVar.a();
                            e2 e2Var = new e2(i11);
                            org.telegram.messenger.c6 c6Var = new org.telegram.messenger.c6(28);
                            Pattern pattern = t4.a;
                            org.telegram.ui.ActionBar.e6 e6Var = this.c;
                            t4.H(activity, a10, -1L, 0, false, e2Var, c6Var, new q4(e6Var), e6Var);
                        }
                        if (t4.a0(chatActivityEnterView.R, chatActivityEnterView.y3)) {
                            if (chatActivityEnterView.d1) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.S1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.H3.l1();
                            } else {
                                if (chatActivityEnterView.a5) {
                                    chatActivityEnterView.r4 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.P);
                                chatActivityEnterView.H3.a1(0);
                                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.S1;
                                if (slideTextView2 != null) {
                                    slideTextView2.setEnabled(false);
                                }
                            }
                            t4.X(chatActivityEnterView.R, 1, chatActivityEnterView.y3, new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.Components.ce
                                public final /* synthetic */ ee b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.z10
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i10) {
                                        case 0:
                                            this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        MediaController.B().B0(chatActivityEnterView.c() ? 3 : 1, 0, true, chatActivityEnterView.P);
                        chatActivityEnterView.H3.a1(0);
                    } else {
                        if (t4.a0(chatActivityEnterView.R, chatActivityEnterView.y3)) {
                            ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.S1;
                            if (slideTextView3 != null) {
                                slideTextView3.setEnabled(false);
                            }
                            chatActivityEnterView.H3.l1();
                            t4.X(chatActivityEnterView.R, 1, chatActivityEnterView.y3, new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.Components.ce
                                public final /* synthetic */ ee b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.z10
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i7) {
                                        case 0:
                                            this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.H3.o2(1, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.n6, 0L, true);
                        chatActivityEnterView.n6 = 0L;
                        heVar.setEffect(0L);
                    }
                    chatActivityEnterView.n3 = false;
                    chatActivityEnterView.h0 = false;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Components.de
                        public final /* synthetic */ ee b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = this.b.d;
                                    chatActivityEnterView2.g0 = null;
                                    chatActivityEnterView2.f2(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                    chatActivityEnterView3.g0 = null;
                                    chatActivityEnterView3.f2(1, true);
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
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                motionEvent.getAction();
                chatActivityEnterView.q1 = false;
                chatActivityEnterView.p1 = 0.0f;
                if (motionEvent.getAction() == 3 && chatActivityEnterView.n3) {
                    if (chatActivityEnterView.R4 >= 0.7f) {
                        chatActivityEnterView.a5 = true;
                        chatActivityEnterView.R1();
                        return false;
                    }
                    if (chatActivityEnterView.M2 && chatActivityEnterView.d1) {
                        CameraController.getInstance().cancelOnInitRunnable(keVar);
                        chatActivityEnterView.H3.o2(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.n6, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.n6 = 0L;
                        heVar.setEffect(0L);
                        z12 = false;
                    } else {
                        j11 = 0;
                        z12 = false;
                        chatActivityEnterView.H3.a1(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.Q1 = j11;
                    chatActivityEnterView.n3 = z12;
                    chatActivityEnterView.f2(5, true);
                    return z12;
                }
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.v2;
                if ((recordCircle2 != null && ChatActivityEnterView.this.a5) || ((udVar = chatActivityEnterView.f1) != null && udVar.getVisibility() == 0)) {
                    if (!chatActivityEnterView.q4) {
                        return false;
                    }
                    org.telegram.messenger.g0.r(tfVar);
                    return false;
                }
                if ((((eeVar.getX() + motionEvent.getX()) - chatActivityEnterView.l3) / chatActivityEnterView.m3) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.M2 && chatActivityEnterView.d1) {
                        CameraController.getInstance().cancelOnInitRunnable(keVar);
                        chatActivityEnterView.H3.o2(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.n6, 0L, true);
                        j10 = 0;
                        chatActivityEnterView.n6 = 0L;
                        heVar.setEffect(0L);
                        z11 = false;
                    } else {
                        j10 = 0;
                        z11 = false;
                        chatActivityEnterView.H3.a1(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.Q1 = j10;
                    chatActivityEnterView.n3 = z11;
                    chatActivityEnterView.f2(5, true);
                    return true;
                }
                if (chatActivityEnterView.q4) {
                    org.telegram.messenger.g0.r(tfVar);
                    if (chatActivityEnterView.z0 && chatActivityEnterView.y0) {
                        chatActivityEnterView.H3.b0(!chatActivityEnterView.d1);
                        chatActivityEnterView.B1(!chatActivityEnterView.d1, true);
                    } else {
                        chatActivityEnterView.H3.m2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                }
                boolean z16 = chatActivityEnterView.M2;
                if (!z16 || chatActivityEnterView.r4) {
                    chatActivityEnterView.l3 = -1.0f;
                    if (!z16 || !chatActivityEnterView.d1) {
                        j3 = 0;
                        if (chatActivityEnterView.z0) {
                            if (t4.a0(chatActivityEnterView.R, chatActivityEnterView.y3)) {
                                if (chatActivityEnterView.a5) {
                                    chatActivityEnterView.r4 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.P);
                                chatActivityEnterView.H3.a1(0);
                                ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.S1;
                                if (slideTextView4 != null) {
                                    slideTextView4.setEnabled(false);
                                }
                                final int i12 = 3;
                                t4.X(chatActivityEnterView.R, 1, chatActivityEnterView.y3, new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.Components.ce
                                    public final /* synthetic */ ee b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.messenger.z10
                                    public final void a(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (i12) {
                                            case 0:
                                                this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                                break;
                                            case 1:
                                                this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                                break;
                                            case 2:
                                                this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                                break;
                                            default:
                                                this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                            if (chatActivityEnterView.n3 && chatActivityEnterView.c()) {
                                Activity activity2 = chatActivityEnterView.w3;
                                long a11 = anVar.a();
                                e2 e2Var2 = new e2(16);
                                org.telegram.messenger.c6 c6Var2 = new org.telegram.messenger.c6(29);
                                org.telegram.ui.ActionBar.e6 e6Var2 = this.c;
                                t4.H(activity2, a11, -1L, 0, false, e2Var2, c6Var2, new q4(e6Var2), e6Var2);
                            }
                            z10 = false;
                            chatActivityEnterView.H3.a1(0);
                            MediaController.B().B0(chatActivityEnterView.c() ? 3 : 1, 0, true, chatActivityEnterView.P);
                            chatActivityEnterView.n3 = z10;
                            chatActivityEnterView.h0 = z10;
                            Runnable runnable2 = new Runnable(this) { // from class: org.telegram.ui.Components.de
                                public final /* synthetic */ ee b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            ChatActivityEnterView chatActivityEnterView2 = this.b.d;
                                            chatActivityEnterView2.g0 = null;
                                            chatActivityEnterView2.f2(1, true);
                                            break;
                                        default:
                                            ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                            chatActivityEnterView3.g0 = null;
                                            chatActivityEnterView3.f2(1, true);
                                            break;
                                    }
                                }
                            };
                            chatActivityEnterView.g0 = runnable2;
                            org.telegram.messenger.g0.i3(runnable2, !chatActivityEnterView.Q5 ? 500L : j3);
                            return true;
                        }
                        chatActivityEnterView.H3.m2();
                    } else {
                        if (t4.a0(chatActivityEnterView.R, chatActivityEnterView.y3)) {
                            ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.S1;
                            if (slideTextView5 != null) {
                                slideTextView5.setEnabled(false);
                            }
                            chatActivityEnterView.H3.l1();
                            final int i13 = 2;
                            t4.X(chatActivityEnterView.R, 1, chatActivityEnterView.y3, new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.Components.ce
                                public final /* synthetic */ ee b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.z10
                                public final void a(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i13) {
                                        case 0:
                                            this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 1:
                                            this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        case 2:
                                            this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                            break;
                                        default:
                                            this.b.d.k1(true, 0, 0, l10.longValue(), false);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        CameraController.getInstance().cancelOnInitRunnable(keVar);
                        chatActivityEnterView.H3.o2(1, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.n6, 0L, true);
                        j3 = 0;
                        chatActivityEnterView.n6 = 0L;
                        heVar.setEffect(0L);
                    }
                    z10 = false;
                    chatActivityEnterView.n3 = z10;
                    chatActivityEnterView.h0 = z10;
                    Runnable runnable22 = new Runnable(this) { // from class: org.telegram.ui.Components.de
                        public final /* synthetic */ ee b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = this.b.d;
                                    chatActivityEnterView2.g0 = null;
                                    chatActivityEnterView2.f2(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                    chatActivityEnterView3.g0 = null;
                                    chatActivityEnterView3.f2(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.g0 = runnable22;
                    org.telegram.messenger.g0.i3(runnable22, !chatActivityEnterView.Q5 ? 500L : j3);
                    return true;
                }
            } else if (motionEvent.getAction() == 2 && chatActivityEnterView.n3) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (!ChatActivityEnterView.this.a5) {
                    if (chatActivityEnterView.g0()) {
                        float f10 = chatActivityEnterView.n1 - x10;
                        float f11 = chatActivityEnterView.o1 - y10;
                        double d = f10;
                        double d2 = f11;
                        float hypot = (float) Math.hypot(d, d2);
                        double degrees = Math.toDegrees(Math.atan2(d2, d));
                        boolean z17 = chatActivityEnterView.q1;
                        if (f10 > 0.0f && f11 > 0.0f && hypot > org.telegram.messenger.g0.L(16.0f) && degrees >= 25.0d && degrees <= 65.0d) {
                            chatActivityEnterView.q1 = true;
                        } else if (!z17 || f10 <= 0.0f || f11 <= 0.0f || hypot <= org.telegram.messenger.g0.L(10.0f) || degrees < 15.0d || degrees > 75.0d) {
                            chatActivityEnterView.q1 = false;
                        } else {
                            chatActivityEnterView.q1 = true;
                        }
                        float L = org.telegram.messenger.g0.L(64.0f);
                        float sqrt = (f10 + f11) * ((float) Math.sqrt(0.5d));
                        chatActivityEnterView.p1 = chatActivityEnterView.q1 ? Utilities.i(sqrt / L, 1.0f, 0.0f) : 0.0f;
                        gg ggVar2 = chatActivityEnterView.w2;
                        if (ggVar2 != null) {
                            ggVar2.invalidate();
                        }
                        if (chatActivityEnterView.q1 && sqrt >= L && chatActivityEnterView.n3) {
                            chatActivityEnterView.B1 = true;
                            gg ggVar3 = chatActivityEnterView.w2;
                            if (ggVar3 != null) {
                                ggVar3.c0 = true;
                                ggVar3.invalidate();
                            }
                            try {
                                chatActivityEnterView.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (chatActivityEnterView.g0()) {
                                chatActivityEnterView.q1 = false;
                                chatActivityEnterView.p1 = 0.0f;
                                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.v2;
                                if (recordCircle3 == null || !recordCircle3.isShown() || chatActivityEnterView.v2.M <= org.telegram.messenger.g0.L(4.0f)) {
                                    fArr = null;
                                } else {
                                    int[] iArr = new int[2];
                                    chatActivityEnterView.v2.getLocationInWindow(iArr);
                                    float f12 = iArr[0];
                                    ChatActivityEnterView.RecordCircle recordCircle4 = chatActivityEnterView.v2;
                                    fArr = new float[]{f12 + recordCircle4.K, iArr[1] + recordCircle4.L, recordCircle4.M};
                                }
                                ig igVar = chatActivityEnterView.T1;
                                if (igVar == null || igVar.getWidth() <= 0 || !chatActivityEnterView.T1.isShown() || chatActivityEnterView.T1.getScaleX() <= 0.5f) {
                                    fArr2 = null;
                                } else {
                                    chatActivityEnterView.T1.getLocationInWindow(new int[2]);
                                    chatActivityEnterView.U1.getLocationInWindow(new int[2]);
                                    fArr2 = new float[]{(chatActivityEnterView.T1.getWidth() / 2.0f) + (r8[0] - r9[0]), (chatActivityEnterView.T1.getHeight() / 2.0f) + (r8[1] - r9[1])};
                                }
                                if (chatActivityEnterView.n3 || ((recordCircle = chatActivityEnterView.v2) != null && ChatActivityEnterView.this.a5)) {
                                    chatActivityEnterView.Q1 = 0L;
                                    chatActivityEnterView.w1 = true;
                                    chatActivityEnterView.x1 = true;
                                    try {
                                        chatActivityEnterView.D();
                                    } finally {
                                        chatActivityEnterView.w1 = false;
                                    }
                                }
                                ai.n0 o02 = chatActivityEnterView.o0();
                                int u02 = chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.ag);
                                o02.h0 = fArr2;
                                o02.n0 = u02;
                                ai.n0 o03 = chatActivityEnterView.o0();
                                int u03 = chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Uf);
                                o03.i0 = fArr;
                                o03.j0 = u03;
                                ai.n0 o04 = chatActivityEnterView.o0();
                                ai.b0 b0Var = o04.m0;
                                ae aeVar = o04.f;
                                int i14 = o04.r;
                                if (i14 != 1 && i14 != 2) {
                                    if (i14 == 4 && (iVar = o04.H) != null) {
                                        iVar.b();
                                    }
                                    o04.g();
                                    ValueAnimator valueAnimator = o04.z0;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    o04.z0 = null;
                                    ChatActivityEnterView chatActivityEnterView2 = aeVar.b;
                                    chatActivityEnterView2.t1 = 0.0f;
                                    chatActivityEnterView2.Z1();
                                    ChatActivityEnterView chatActivityEnterView3 = aeVar.b;
                                    Editable text = chatActivityEnterView3.F0.getText();
                                    int i15 = o04.r;
                                    if (i15 == 3 || i15 == 4) {
                                        o04.w.a();
                                        o04.w.setIsland(false);
                                        o04.w.setRevert(false);
                                        o04.w.setSettings(false);
                                        o04.w();
                                        ai.h2 h2Var = o04.F;
                                        if (h2Var != null) {
                                            h2Var.f(false);
                                        }
                                    }
                                    o04.J = null;
                                    o04.K = ai.i.c;
                                    int length = text == null ? 0 : text.length();
                                    if (length <= 0 || Character.isWhitespace(text.charAt(length - 1))) {
                                        r13 = 0;
                                    } else {
                                        o04.L = true;
                                        text.append(' ');
                                        r13 = 0;
                                        o04.L = false;
                                        length++;
                                    }
                                    o04.I = length;
                                    o04.M = "";
                                    o04.N = r13;
                                    o04.O = r13;
                                    o04.r = 1;
                                    aeVar.b();
                                    o04.U = SystemClock.uptimeMillis();
                                    org.telegram.messenger.g0.r(o04.k0);
                                    DictationAsr.N(b0Var);
                                    DictationAsr.g.add(b0Var);
                                    o04.B(true);
                                    o04.b(1.0f, 220L, er.h);
                                    org.telegram.messenger.g0.r(o04.s0);
                                    ai.q0 q0Var = o04.s;
                                    float[] fArr3 = o04.h0;
                                    int i16 = o04.n0;
                                    q0Var.getClass();
                                    boolean z18 = fArr3 != null;
                                    q0Var.R = z18;
                                    if (z18) {
                                        q0Var.S = fArr3[0] - q0Var.getLeft();
                                        q0Var.T = fArr3[1] - q0Var.getTop();
                                        q0Var.U.setColor(i16);
                                    }
                                    ai.q0 q0Var2 = o04.s;
                                    float[] fArr4 = o04.i0;
                                    int i17 = o04.j0;
                                    int[] iArr2 = q0Var2.o0;
                                    boolean z19 = fArr4 != null;
                                    q0Var2.A0 = z19;
                                    if (z19) {
                                        q0Var2.getLocationInWindow(iArr2);
                                        q0Var2.B0 = fArr4[0] - iArr2[0];
                                        q0Var2.C0 = fArr4[1] - iArr2[1];
                                        q0Var2.D0 = fArr4[2];
                                        q0Var2.E0 = i17;
                                        q0Var2.F0 = 0L;
                                        if (q0Var2.J0 == null) {
                                            q0Var2.J0 = q0Var2.getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
                                        }
                                        q0Var2.J0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                    }
                                    StringBuilder sb2 = new StringBuilder("commit morph from circle ");
                                    if (o04.i0 == null) {
                                        str = "null";
                                    } else {
                                        str = ((int) o04.i0[0]) + "," + ((int) o04.i0[1]) + " r" + ((int) o04.i0[2]);
                                    }
                                    r.b.t(sb2, str, "Dictation");
                                    o04.i0 = null;
                                    o04.h0 = null;
                                    o04.s.setShown(true);
                                    o04.s.setRightMode(0);
                                    o04.x.f();
                                    o04.v(true);
                                    o04.u(true);
                                    o04.s.setStopIsland(true);
                                    String U = DictationAsr.U();
                                    o04.w.setLanguage(U != null ? ai.n0.l(U) : null);
                                    o04.w.setSettings(true);
                                    long uptimeMillis = SystemClock.uptimeMillis();
                                    o04.q0 = uptimeMillis;
                                    o04.p0 = uptimeMillis;
                                    o04.U = uptimeMillis;
                                    o04.o0 = 0L;
                                    org.telegram.messenger.g0.i3(o04.r0, 300L);
                                    boolean z20 = org.telegram.messenger.np.e1().getInt("design_dictation_mode", 1) == 2;
                                    boolean z21 = z20;
                                    o04.G = new ai.c2(o04.h, chatActivityEnterView3.R, chatActivityEnterView3.y3, z20, o04);
                                    xe xeVar = chatActivityEnterView3.F0;
                                    if (xeVar != null) {
                                        xeVar.n1 = true;
                                    }
                                    Log.d("Dictation", "start simulated=" + z21);
                                    ai.c2 c2Var = o04.G;
                                    c2Var.m();
                                    org.telegram.messenger.g0.i3(new a1.e(15, o04, c2Var), z21 ? 120L : 420L);
                                }
                            }
                        }
                        z13 = chatActivityEnterView.q1;
                    } else {
                        chatActivityEnterView.q1 = false;
                        z13 = false;
                    }
                    if (!z13) {
                        ChatActivityEnterView.RecordCircle recordCircle5 = chatActivityEnterView.v2;
                        ChatActivityEnterView chatActivityEnterView4 = ChatActivityEnterView.this;
                        if (!chatActivityEnterView4.a5) {
                            if (chatActivityEnterView4.T4 == -1.0f) {
                                chatActivityEnterView4.S4 = y10;
                            }
                            chatActivityEnterView4.T4 = y10;
                            recordCircle5.invalidate();
                            if (chatActivityEnterView4.Z4 || chatActivityEnterView4.R4 < 0.7f || chatActivityEnterView4.S4 - chatActivityEnterView4.T4 < org.telegram.messenger.g0.L(57.0f)) {
                                c10 = 1;
                                if (c10 != 2) {
                                    chatActivityEnterView.R1();
                                    return false;
                                }
                                ChatActivityEnterView.RecordCircle recordCircle6 = chatActivityEnterView.v2;
                                float f13 = x10 - recordCircle6.G;
                                float f14 = y10 - recordCircle6.H;
                                float f15 = (f14 * f14) + (f13 * f13);
                                recordCircle6.H = y10;
                                recordCircle6.G = x10;
                                ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                                if (chatActivityEnterView5.M4 && chatActivityEnterView5.O4 == 0.0f && f15 > recordCircle6.F) {
                                    chatActivityEnterView5.N4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.l3 == -1.0f) {
                                    chatActivityEnterView.l3 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.U1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.m3 = measuredWidth;
                                    if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
                                        chatActivityEnterView.m3 = org.telegram.messenger.g0.L(140.0f);
                                    }
                                }
                                float x11 = eeVar.getX() + x10;
                                float f16 = chatActivityEnterView.l3;
                                float f17 = ((x11 - f16) / chatActivityEnterView.m3) + 1.0f;
                                if (f16 != -1.0f) {
                                    float f18 = f17 > 1.0f ? 1.0f : f17 < 0.0f ? 0.0f : f17;
                                    ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.S1;
                                    if (slideTextView6 != null) {
                                        slideTextView6.r = f18;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f18);
                                    f17 = f18;
                                }
                                if (f17 == 0.0f) {
                                    if (chatActivityEnterView.M2 && chatActivityEnterView.d1) {
                                        CameraController.getInstance().cancelOnInitRunnable(keVar);
                                        chatActivityEnterView.H3.o2(2, 0, chatActivityEnterView.P ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.n6, 0L, true);
                                        chatActivityEnterView.n6 = 0L;
                                        heVar.setEffect(0L);
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                        chatActivityEnterView.H3.a1(0);
                                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                                    }
                                    chatActivityEnterView.n3 = z14;
                                    chatActivityEnterView.f2(5, true);
                                }
                            } else {
                                chatActivityEnterView4.a5 = true;
                                gg ggVar4 = chatActivityEnterView4.w2;
                                if (ggVar4 != null && org.telegram.messenger.np.e1().getInt("voicepausehint", 0) <= 3 && !c8.z0.a()) {
                                    ggVar4.f();
                                    hi.l3 l3Var = new hi.l3(ggVar4.getContext(), 2);
                                    ggVar4.a = l3Var;
                                    l3Var.o(1.0f, 0.0f);
                                    ggVar4.a.r(true);
                                    ggVar4.a.u(org.telegram.messenger.hd.M0(2131743512, null));
                                    ggVar4.Q0.setHintGlass(ggVar4.a);
                                    org.telegram.messenger.np.e1().edit().putInt("voicepausehint", org.telegram.messenger.np.e1().getInt("voicepausehint", 0) + 1).apply();
                                    ggVar4.addView(ggVar4.a, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 0.0f, 0.0f, 54.0f, 58.0f));
                                    hi.l3 l3Var2 = ggVar4.a;
                                    l3Var2.r0 = new eg(ggVar4, l3Var2, 3);
                                    l3Var2.w();
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
