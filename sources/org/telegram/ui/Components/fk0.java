package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class fk0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Cells.b1 g1 = new org.telegram.ui.Cells.b1(Float.class, "transitionProgress", 2);
    public final float A;
    public boolean A0;
    public final float B;
    public boolean B0;
    public int C;
    public boolean C0;
    public MessageObject D;
    public final Paint D0;
    public boolean E;
    public final Paint E0;
    public int F;
    public mo F0;
    public long G;
    public boolean G0;
    public boolean H;
    public final AnimationNotificationsLocker H0;
    public boolean I;
    public final int I0;
    public boolean J;
    public boolean J0;
    public float K;
    public boolean K0;
    public long L;
    public Runnable L0;
    public ValueAnimator M;
    public boolean M0;
    public FrameLayout N;
    public y80 N0;
    public bg.d1 O;
    public int O0;
    public final ArrayList P;
    public int P0;
    public final ArrayList Q;
    public float Q0;
    public final ArrayList R;
    public float R0;
    public final org.telegram.ui.vq S;
    public ng.d S0;
    public final vj0 T;
    public ng.d T0;
    public final RectF U;
    public ng.d U0;
    public boolean V;
    public lg.a V0;
    public final HashSet W;
    public og.d W0;
    public boolean X0;
    public boolean Y0;
    public mo Z0;
    public boolean a;
    public final HashSet a0;
    public boolean a1;
    public final jh.e1 b;
    public final int[] b0;
    public boolean b1;
    public final float c;
    public ek0 c0;
    public boolean c1;
    public final ArrayList d;
    public final Rect d0;
    public Paint d1;
    public final ArrayList e;
    public final Drawable e0;
    public Matrix e1;
    public final Paint f;
    public final boolean f0;
    public LinearGradient f1;
    public final org.telegram.ui.ActionBar.c6 g0;
    public final Paint h;
    public kg.q0 h0;
    public int i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public final Paint n;
    public boolean n0;
    public long o0;
    public org.telegram.ui.ActionBar.o2 p0;
    public cg.t1 q0;
    public float r;
    public lr r0;
    public float s;
    public float s0;
    public kg.d0 t0;
    public ValueAnimator u0;
    public float v;
    public final dk0 v0;
    public final RectF w;
    public boolean w0;
    public final Path x;
    public float x0;
    public float y;
    public final HashSet y0;
    public final HashSet z0;

    public fk0(int i10, int i11, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = false;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new Paint(1);
        this.n = new Paint(1);
        this.v = 1.0f;
        this.w = new RectF();
        this.x = new Path();
        this.y = AndroidUtilities.dp(72.0f);
        float dp = AndroidUtilities.dp(8.0f);
        this.A = dp;
        this.B = dp / 2.0f;
        this.C = AndroidUtilities.dp(36.0f);
        this.P = new ArrayList(20);
        this.Q = new ArrayList(10);
        this.R = new ArrayList(20);
        this.U = new RectF();
        this.V = false;
        this.W = new HashSet();
        this.a0 = new HashSet();
        this.b0 = new int[2];
        Rect rect = new Rect();
        this.d0 = rect;
        new ArrayList();
        this.y0 = new HashSet();
        this.z0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.D0 = paint2;
        Paint paint3 = new Paint(1);
        this.E0 = paint3;
        this.H0 = new AnimationNotificationsLocker();
        this.K0 = true;
        this.b1 = false;
        this.I0 = i10;
        this.c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var));
        paint3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Jj, c6Var));
        this.g0 = c6Var;
        this.F = i11;
        this.p0 = o2Var;
        dk0 dk0Var = new dk0(this, context);
        this.v0 = dk0Var;
        dk0Var.setVisibility(8);
        dk0Var.K = false;
        dk0Var.c.setVisibility(8);
        addView(dk0Var);
        this.f0 = SharedConfig.animationsEnabled() && SharedConfig.getDevicePerformanceClass() != 0;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.e0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Td, false), PorterDuff.Mode.MULTIPLY));
        jh.e1 e1Var = new jh.e1(this, context, 17);
        this.b = e1Var;
        e1Var.setClipChildren(false);
        e1Var.setClipToPadding(false);
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((ViewGroup) this, 3);
        this.S = vqVar;
        e1Var.i(new sj0(this, 0));
        e1Var.setLayoutManager(vqVar);
        e1Var.setOverScrollMode(2);
        vj0 vj0Var = new vj0(this);
        this.T = vj0Var;
        e1Var.setAdapter(vj0Var);
        e1Var.j(new zj0(this));
        e1Var.j(new h00(this, 4));
        e1Var.i(new sj0(this, 1));
        e1Var.setOnItemClickListener(new k(this, 11));
        e1Var.setOnItemLongClickListener((bl0) new eg.n2(this, i10, 7));
        addView(e1Var, i7.f6.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (e1Var.getLayoutParams().height - e1Var.getPaddingTop()) - e1Var.getPaddingBottom();
        dk0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        dk0Var.getLayoutParams().height = paddingTop;
        if (i10 == 2 || i10 == 4) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
        }
        MediaDataController.getInstance(i11).preloadDefaultReactions();
    }

    public static void a(fk0 fk0Var) {
        if (fk0Var.t0 != null) {
            return;
        }
        kg.d0 d0Var = new kg.d0(fk0Var.I0, fk0Var.p0, fk0Var.R, fk0Var.W, fk0Var, fk0Var.g0, fk0Var.a);
        fk0Var.t0 = d0Var;
        lg.a aVar = fk0Var.V0;
        boolean z10 = true;
        if (aVar != null) {
            og.d dVar = fk0Var.W0;
            org.telegram.ui.u41 u41Var = d0Var.m.b0;
            u41Var.x = true;
            u41Var.setBackground(null);
            u41Var.e();
            u41Var.invalidate();
            ng.d c3 = aVar.c(d0Var.a, null, true);
            c3.n(dVar);
            c3.p(AndroidUtilities.dp(12.0f));
            c3.o(AndroidUtilities.dp(8.0f));
            d0Var.z = c3;
        }
        kg.d0 d0Var2 = fk0Var.t0;
        ek0 ek0Var = fk0Var.c0;
        if (ek0Var != null && !ek0Var.j()) {
            z10 = false;
        }
        d0Var2.m.setLongPressEnabled(z10);
        fk0Var.j();
        fk0Var.t0.p = new xb0(fk0Var, 16);
        fk0Var.m();
    }

    public static void b(fk0 fk0Var, View view, float f9) {
        if (view instanceof dk0) {
            ((dk0) view).h = f9;
        } else {
            view.setScaleX(f9);
            view.setScaleY(f9);
        }
    }

    public static boolean c() {
        return SharedConfig.deviceIsHigh();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        boolean z10 = true;
        while (i10 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            hashSet.clear();
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        kg.q0 d = kg.q0.d(messageObject.messageOwner.reactions.results.get(i11).reaction);
                        if (z10 || longSparseArray.indexOfKey(d.h) >= 0) {
                            hashSet.add(Long.valueOf(d.h));
                            longSparseArray.put(d.h, d);
                        }
                    }
                }
            }
            int i12 = 0;
            while (i12 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i12)))) {
                    longSparseArray.removeAt(i12);
                    i12--;
                }
                i12++;
            }
            i10++;
            z10 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
            if (longSparseArray.valueAt(i13) != null) {
                hashSet2.add((kg.q0) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    public final void d() {
        kg.d0 d0Var = this.t0;
        if (d0Var != null) {
            if (!d0Var.q) {
                d0Var.q = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                int i10 = 0;
                ofFloat.addUpdateListener(new kg.y(d0Var, i10));
                ofFloat.addListener(new kg.b0(d0Var, i10));
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
            this.t0 = null;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id != this.G || getVisibility() == 0 || (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                return;
            }
            p(this.D, null, true);
            setVisibility(0);
            r(false);
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.availableEffectsUpdate) {
                p(this.D, null, true);
            }
        } else {
            if (this.I0 != 4) {
                return;
            }
            invalidate();
            jh.e1 e1Var = this.b;
            e1Var.invalidate();
            e1Var.f1();
            for (int i12 = 0; i12 < e1Var.getChildCount(); i12++) {
                View childAt = e1Var.getChildAt(i12);
                if (childAt instanceof dk0) {
                    dk0 dk0Var = (dk0) childAt;
                    dk0Var.a.invalidate();
                    dk0Var.b.invalidate();
                } else {
                    childAt.invalidate();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0376  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        y80 y80Var;
        kg.q0 q0Var;
        int i10;
        kg.q0 q0Var2;
        float width;
        float f9;
        float f10;
        float max;
        float f11;
        mo moVar;
        float f12;
        int i11;
        float f13;
        RectF rectF;
        float f14;
        float f15;
        int i12;
        RectF rectF2;
        jh.e1 e1Var;
        float f16;
        boolean q6;
        RectF rectF3;
        int i13;
        RectF rectF4;
        int i14;
        jh.e1 e1Var2;
        float f17;
        int R;
        float f18;
        float f19;
        float x4;
        float scaleX;
        float f20;
        float f21;
        p5 p5Var;
        lh.x2 x2Var;
        int i15;
        int i16;
        ek0 ek0Var;
        float f22;
        Canvas canvas2 = canvas;
        long min = Math.min(16L, System.currentTimeMillis() - this.L);
        this.L = System.currentTimeMillis();
        boolean z10 = this.J;
        if (z10) {
            float f23 = this.K;
            if (f23 != 1.0f) {
                this.K = Math.min(1.0f, (min / 220.0f) + f23);
                invalidate();
                y80Var = this.N0;
                if (y80Var != null) {
                    y80Var.setTranslationY(-g());
                }
                float max2 = (Math.max(0.25f, Math.min(this.v, 1.0f)) - 0.25f) / 0.75f;
                float f24 = this.A * max2;
                float f25 = this.B * max2;
                HashSet hashSet = this.z0;
                hashSet.clear();
                HashSet hashSet2 = this.y0;
                hashSet.addAll(hashSet2);
                hashSet2.clear();
                if (this.X0) {
                    invalidate();
                }
                q0Var = this.h0;
                i10 = this.I0;
                if (q0Var != null && i10 != 5 && ((ek0Var = this.c0) == null || ek0Var.j())) {
                    f22 = this.j0;
                    if (f22 != 1.0f) {
                        float longPressTimeout = (16.0f / (this.h0.a ? ViewConfiguration.getLongPressTimeout() : 1500.0f)) + f22;
                        this.j0 = longPressTimeout;
                        if (longPressTimeout >= 1.0f) {
                            this.j0 = 1.0f;
                        }
                        invalidate();
                    }
                }
                q0Var2 = this.h0;
                if (q0Var2 == null && q0Var2.a) {
                    this.l0 = 1.0f;
                    this.m0 = 1.0f;
                } else {
                    float f26 = this.j0;
                    this.l0 = (f26 * 2.0f) + 1.0f;
                    this.m0 = 1.0f - (f26 * 0.15f);
                }
                int save = canvas2.save();
                if (!LocaleController.isRTL || this.I) {
                    width = getWidth();
                    f9 = 0.125f;
                } else {
                    width = getWidth();
                    f9 = 0.875f;
                }
                float f27 = width * f9;
                f10 = this.v;
                if (f10 != 1.0f) {
                    canvas2.scale(f10, f10, f27, getHeight() / 2.0f);
                }
                if (!LocaleController.isRTL || this.I) {
                    max = Math.max(0.25f, this.v);
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f - Math.max(0.25f, this.v);
                    max = 1.0f;
                }
                float pullingLeftProgress = getPullingLeftProgress();
                float g10 = g();
                moVar = this.Z0;
                if (moVar != null) {
                    moVar.setExpandSize(g10);
                }
                float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f11);
                float topOffset = getTopOffset();
                float paddingTop = getPaddingTop();
                jh.e1 e1Var3 = this.b;
                float f28 = f11;
                float f29 = max;
                RectF rectF5 = this.w;
                rectF5.set(getPaddingLeft() + width2, (((1.0f - this.m0) * e1Var3.getMeasuredHeight()) + paddingTop) - g10, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g10);
                this.y = com.google.android.recaptcha.internal.a.w(g10, 2.0f, rectF5.height() - topOffset, 2.0f);
                if (i10 == 1) {
                    f12 = 255.0f;
                    int clamp = (int) (Utilities.clamp(1.0f - (this.s0 / 0.05f), 1.0f, 0.0f) * 255.0f);
                    Drawable drawable = this.e0;
                    drawable.setAlpha(clamp);
                    float paddingLeft = getPaddingLeft();
                    int width3 = getWidth() - getPaddingRight();
                    Rect rect = this.d0;
                    int i17 = (int) g10;
                    drawable.setBounds((int) ((((width3 + rect.right) * f28) + paddingLeft) - rect.left), (getPaddingTop() - rect.top) - i17, (int) (((getWidth() - getPaddingRight()) + rect.right) * f29), (getHeight() - getPaddingBottom()) + rect.bottom + i17);
                    if (this.S0 == null) {
                        drawable.draw(canvas2);
                    }
                } else {
                    f12 = 255.0f;
                }
                canvas2.restoreToCount(save);
                if (this.Y0) {
                    int save2 = canvas2.save();
                    float f30 = this.v;
                    if (f30 != 1.0f) {
                        f14 = 2.0f;
                        canvas2.scale(f30, f30, f27, getHeight() / 2.0f);
                    } else {
                        f14 = 2.0f;
                    }
                    if (i10 == 1 || this.c0.O()) {
                        i15 = save2;
                        i11 = i10;
                        rectF = rectF5;
                        f13 = f27;
                        i16 = 1;
                        this.c0.G(canvas, rectF, this.y, getX(), getY(), 255, false);
                        canvas2 = canvas;
                    } else {
                        ng.d dVar = this.S0;
                        Paint paint = this.f;
                        if (dVar != null) {
                            Rect rect2 = AndroidUtilities.rectTmp2;
                            rectF5.round(rect2);
                            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                            this.S0.setBounds(rect2);
                            this.S0.setAlpha(paint.getAlpha());
                            this.S0.draw(canvas2);
                        } else {
                            float f31 = this.y;
                            canvas2.drawRoundRect(rectF5, f31, f31, paint);
                        }
                        i15 = save2;
                        i11 = i10;
                        f13 = f27;
                        rectF = rectF5;
                        i16 = 1;
                    }
                    if (this.V) {
                        Iterator it = this.W.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                float f32 = this.y;
                                float clamp01 = Utilities.clamp01(1.0f - getPullingLeftProgress());
                                if (this.d1 == null) {
                                    this.d1 = new Paint(i16);
                                }
                                if (this.e1 == null) {
                                    this.e1 = new Matrix();
                                }
                                if (this.f1 == null) {
                                    int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Jj, this.g0);
                                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{v02, org.telegram.ui.ActionBar.g6.l1(0.0f, v02)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                    this.f1 = linearGradient;
                                    this.d1.setShader(linearGradient);
                                }
                                this.e1.reset();
                                this.e1.postTranslate(rectF.left, rectF.top);
                                this.f1.setLocalMatrix(this.e1);
                                this.d1.setAlpha((int) (clamp01 * f12));
                                canvas2.drawRoundRect(rectF, f32, f32, this.d1);
                            } else if (((kg.q0) it.next()).a) {
                                break;
                            }
                        }
                    }
                    canvas2.restoreToCount(i15);
                } else {
                    i11 = i10;
                    f13 = f27;
                    rectF = rectF5;
                    f14 = 2.0f;
                }
                Path path = this.x;
                path.rewind();
                float f33 = this.y;
                path.addRoundRect(rectF, f33, f33, Path.Direction.CW);
                int save3 = canvas2.save();
                f15 = this.v;
                if (f15 != 1.0f) {
                    canvas2.scale(f15, f15, f13, getHeight() / f14);
                }
                if (this.v != 0.0f) {
                    int i18 = i11;
                    if (getAlpha() == 1.0f || i18 == 5) {
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 0;
                        while (i19 < e1Var3.getChildCount()) {
                            View childAt = e1Var3.getChildAt(i19);
                            int abs = (this.v == 1.0f || !SharedConfig.deviceIsHigh()) ? i21 : (int) (Math.abs((((childAt.getMeasuredWidth() / f14) + childAt.getLeft()) / e1Var3.getMeasuredWidth()) - 0.8f) * 200.0f);
                            float f34 = f25;
                            if (childAt instanceof dk0) {
                                dk0 dk0Var = (dk0) e1Var3.getChildAt(i19);
                                i14 = i19;
                                if (this.x0 != 0.0f) {
                                    i13 = save3;
                                    f19 = AndroidUtilities.dp(46.0f) * Utilities.clamp(dk0Var.getLeft() / (getMeasuredWidth() - AndroidUtilities.dp(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress();
                                } else {
                                    i13 = save3;
                                    f19 = 0.0f;
                                }
                                kg.q0 q0Var3 = dk0Var.e;
                                ck0 ck0Var = dk0Var.a;
                                float f35 = f19;
                                ck0 ck0Var2 = dk0Var.b;
                                ck0 ck0Var3 = dk0Var.c;
                                rectF4 = rectF;
                                if (q0Var3.equals(this.h0)) {
                                    ck0 ck0Var4 = ck0Var2.getVisibility() == 0 ? ck0Var2 : ck0Var;
                                    dk0Var.setPivotX(dk0Var.getMeasuredWidth() >> 1);
                                    dk0Var.setPivotY(ck0Var4.getY() + ck0Var4.getMeasuredHeight());
                                    dk0Var.setScaleX(this.l0);
                                    dk0Var.setScaleY(this.l0);
                                    if (!this.n0) {
                                        if (this.M == null) {
                                            ck0Var3.setVisibility(0);
                                            ck0Var3.setAlpha(1.0f);
                                            if (ck0Var3.getImageReceiver().hasBitmapImage() || ((p5Var = ck0Var3.e) != null && (x2Var = p5Var.k) != null && x2Var.hasBitmapImage())) {
                                                ck0Var4.setAlpha(0.0f);
                                            }
                                            f21 = 1.0f;
                                        } else {
                                            f21 = 1.0f;
                                            ck0Var3.setAlpha(1.0f - this.k0);
                                            ck0Var4.setAlpha(this.k0);
                                        }
                                        if (this.j0 == f21) {
                                            this.n0 = true;
                                            if (System.currentTimeMillis() - this.o0 > 300) {
                                                this.o0 = System.currentTimeMillis();
                                                e1Var2 = e1Var3;
                                                this.c0.Q(dk0Var, dk0Var.e, true, false);
                                                canvas2.save();
                                                x4 = dk0Var.getX() + e1Var2.getX();
                                                scaleX = ((dk0Var.getScaleX() * dk0Var.getMeasuredWidth()) - dk0Var.getMeasuredWidth()) / f14;
                                                f20 = x4 - scaleX;
                                                if (f20 >= 0.0f && dk0Var.getTranslationX() >= 0.0f) {
                                                    dk0Var.setTranslationX((-f20) - f35);
                                                } else if (dk0Var.getMeasuredWidth() + x4 + scaleX > getMeasuredWidth() || dk0Var.getTranslationX() > 0.0f) {
                                                    dk0Var.setTranslationX(0.0f - f35);
                                                } else {
                                                    dk0Var.setTranslationX((((getMeasuredWidth() - x4) - dk0Var.getMeasuredWidth()) - scaleX) - f35);
                                                }
                                                canvas2.translate(dk0Var.getX() + e1Var2.getX(), dk0Var.getY() + e1Var2.getY());
                                                canvas2.scale(dk0Var.getScaleX(), dk0Var.getScaleY(), dk0Var.getPivotX(), dk0Var.getPivotY());
                                                dk0Var.draw(canvas2);
                                                canvas2.restore();
                                            }
                                        }
                                    }
                                    e1Var2 = e1Var3;
                                    canvas2.save();
                                    x4 = dk0Var.getX() + e1Var2.getX();
                                    scaleX = ((dk0Var.getScaleX() * dk0Var.getMeasuredWidth()) - dk0Var.getMeasuredWidth()) / f14;
                                    f20 = x4 - scaleX;
                                    if (f20 >= 0.0f) {
                                    }
                                    if (dk0Var.getMeasuredWidth() + x4 + scaleX > getMeasuredWidth()) {
                                    }
                                    dk0Var.setTranslationX(0.0f - f35);
                                    canvas2.translate(dk0Var.getX() + e1Var2.getX(), dk0Var.getY() + e1Var2.getY());
                                    canvas2.scale(dk0Var.getScaleX(), dk0Var.getScaleY(), dk0Var.getPivotX(), dk0Var.getPivotY());
                                    dk0Var.draw(canvas2);
                                    canvas2.restore();
                                } else {
                                    e1Var2 = e1Var3;
                                    int R2 = RecyclerView.R(dk0Var);
                                    float measuredWidth = (((this.l0 - 1.0f) * dk0Var.getMeasuredWidth()) / 3.0f) - (((1.0f - this.m0) * dk0Var.getMeasuredWidth()) * (Math.abs(this.i0 - R2) - 1));
                                    if (R2 < this.i0) {
                                        dk0Var.setPivotX(0.0f);
                                        dk0Var.setTranslationX(-measuredWidth);
                                    } else {
                                        dk0Var.setPivotX(dk0Var.getMeasuredWidth() - f35);
                                        dk0Var.setTranslationX(measuredWidth - f35);
                                    }
                                    dk0Var.setPivotY(ck0Var.getY() + ck0Var.getMeasuredHeight());
                                    dk0Var.setScaleX(this.m0);
                                    dk0Var.setScaleY(this.m0);
                                    ck0Var3.setVisibility(4);
                                    ck0Var.setAlpha(1.0f);
                                }
                                if (childAt.getLeft() > i20) {
                                    i20 = childAt.getLeft();
                                }
                                if (!this.J0 && (!dk0Var.r || ck0Var.getImageReceiver().getLottieAnimation() != null)) {
                                    if ((dk0Var.getMeasuredWidth() / f14) + dk0Var.getX() > 0.0f && (dk0Var.getMeasuredWidth() / f14) + dk0Var.getX() < e1Var2.getWidth()) {
                                        if (!hashSet.contains(dk0Var)) {
                                            dk0Var.c(abs);
                                            abs += 30;
                                        }
                                        hashSet2.add(dk0Var);
                                    } else if (!dk0Var.n) {
                                        dk0Var.d();
                                    }
                                }
                            } else {
                                i13 = save3;
                                rectF4 = rectF;
                                i14 = i19;
                                e1Var2 = e1Var3;
                                if (childAt == this.N) {
                                    if ((childAt.getMeasuredWidth() / f14) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f14) + childAt.getX() >= e1Var2.getWidth()) {
                                        cg.t1 t1Var = this.q0;
                                        f17 = 0.0f;
                                        t1Var.setScaleX(0.0f);
                                        t1Var.setScaleY(0.0f);
                                        if (childAt == this.O) {
                                            if ((childAt.getMeasuredWidth() / f14) + childAt.getX() <= f17 || (childAt.getMeasuredWidth() / f14) + childAt.getX() >= e1Var2.getWidth()) {
                                                lr lrVar = this.r0;
                                                lrVar.setScaleX(0.0f);
                                                lrVar.setScaleY(0.0f);
                                                ((fk0) lrVar.c).O.invalidate();
                                                ValueAnimator valueAnimator = (ValueAnimator) lrVar.b;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                            } else {
                                                if (!hashSet.contains(childAt)) {
                                                    if (this.v != 1.0f) {
                                                        lr lrVar2 = this.r0;
                                                        lrVar2.setScaleX(0.0f);
                                                        lrVar2.setScaleY(0.0f);
                                                        ((fk0) lrVar2.c).O.invalidate();
                                                        ValueAnimator valueAnimator2 = (ValueAnimator) lrVar2.b;
                                                        if (valueAnimator2 != null) {
                                                            valueAnimator2.cancel();
                                                        }
                                                    }
                                                    lr lrVar3 = this.r0;
                                                    boolean z11 = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || SharedConfig.getDevicePerformanceClass() >= 1;
                                                    lrVar3.invalidate();
                                                    ValueAnimator valueAnimator3 = (ValueAnimator) lrVar3.b;
                                                    if (valueAnimator3 != null) {
                                                        valueAnimator3.removeAllListeners();
                                                        ((ValueAnimator) lrVar3.b).cancel();
                                                    }
                                                    if (z11) {
                                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(lrVar3.getScaleX(), 1.0f);
                                                        lrVar3.b = ofFloat;
                                                        ofFloat.setInterpolator(AndroidUtilities.overshootInterpolator);
                                                        ((ValueAnimator) lrVar3.b).addUpdateListener(new d70(lrVar3, 7));
                                                        ((ValueAnimator) lrVar3.b).setStartDelay((long) (abs * ((fk0) lrVar3.c).c));
                                                        ((ValueAnimator) lrVar3.b).setDuration(300L);
                                                        ((ValueAnimator) lrVar3.b).start();
                                                    } else {
                                                        lrVar3.setScaleX(1.0f);
                                                        lrVar3.setScaleY(1.0f);
                                                    }
                                                    abs += 30;
                                                }
                                                hashSet2.add(childAt);
                                            }
                                        }
                                        R = RecyclerView.R(childAt);
                                        float measuredWidth2 = (((this.l0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.m0) * childAt.getMeasuredWidth()) * (Math.abs(this.i0 - R) - 1));
                                        if (R >= this.i0) {
                                            childAt.setPivotX(0.0f);
                                            childAt.setTranslationX(-measuredWidth2);
                                        } else {
                                            childAt.setPivotX(childAt.getMeasuredWidth());
                                            childAt.setTranslationX(measuredWidth2);
                                        }
                                        childAt.setScaleX(this.m0);
                                        childAt.setScaleY(this.m0);
                                    } else {
                                        if (!hashSet.contains(childAt)) {
                                            if (this.v != 1.0f) {
                                                cg.t1 t1Var2 = this.q0;
                                                f18 = 0.0f;
                                                t1Var2.setScaleX(0.0f);
                                                t1Var2.setScaleY(0.0f);
                                            } else {
                                                f18 = 0.0f;
                                            }
                                            cg.t1 t1Var3 = this.q0;
                                            org.telegram.ui.Components.voip.h hVar = t1Var3.F;
                                            if (hVar != null) {
                                                hVar.g = f18;
                                                hVar.j = false;
                                            }
                                            t1Var3.invalidate();
                                            t1Var3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(abs).setInterpolator(AndroidUtilities.overshootInterpolator).setDuration(300L);
                                            abs += 30;
                                        }
                                        hashSet2.add(childAt);
                                    }
                                }
                                f17 = 0.0f;
                                if (childAt == this.O) {
                                }
                                R = RecyclerView.R(childAt);
                                float measuredWidth22 = (((this.l0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.m0) * childAt.getMeasuredWidth()) * (Math.abs(this.i0 - R) - 1));
                                if (R >= this.i0) {
                                }
                                childAt.setScaleX(this.m0);
                                childAt.setScaleY(this.m0);
                            }
                            i21 = abs;
                            i19 = i14 + 1;
                            canvas2 = canvas;
                            f25 = f34;
                            save3 = i13;
                            e1Var3 = e1Var2;
                            rectF = rectF4;
                        }
                        i12 = save3;
                        rectF2 = rectF;
                        e1Var = e1Var3;
                        f16 = f25;
                        dk0 dk0Var2 = this.v0;
                        if (pullingLeftProgress > 0.0f) {
                            float pullingLeftProgress2 = getPullingLeftProgress();
                            int measuredWidth3 = dk0Var2.getMeasuredWidth() - AndroidUtilities.dp(f14);
                            float f36 = i20 + measuredWidth3;
                            float clamp2 = Utilities.clamp(f36 / (getMeasuredWidth() - dk0Var2.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth3;
                            if (dk0Var2.getTag() == null) {
                                dk0Var2.setTag(Float.valueOf(1.0f));
                                dk0Var2.d();
                                dk0Var2.c(0);
                            }
                            float clamp3 = Utilities.clamp(pullingLeftProgress2, 1.0f, 0.0f);
                            dk0Var2.setScaleX(clamp3);
                            dk0Var2.setScaleY(clamp3);
                            dk0Var2.setTranslationX(((e1Var.getX() + f36) - clamp2) + (-((i18 == 1 || i18 == 2) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(20.0f))));
                            if (dk0Var2.getVisibility() != 0) {
                                dk0Var2.setVisibility(0);
                            }
                        } else {
                            if (dk0Var2.getVisibility() != 8 && this.K0) {
                                dk0Var2.setVisibility(8);
                            }
                            if (dk0Var2.getTag() != null) {
                                dk0Var2.setTag(null);
                            }
                        }
                        if (!this.Y0 && this.t0 != null) {
                            int y8 = (int) org.telegram.messenger.x3.y(1.0f, this.s0, Utilities.clamp(1.0f - (this.s0 / 0.2f), 1.0f, 0.0f), 255.0f);
                            canvas.save();
                            f(f24, max2, f16, y8, canvas);
                            canvas.restore();
                            return;
                        }
                        float f37 = f16;
                        q6 = q();
                        if (!q6) {
                            canvas.clipPath(path);
                        }
                        canvas.translate((1.0f - this.v) * getWidth() * ((!LocaleController.isRTL || this.I) ? -1 : 1), 0.0f);
                        e1Var.setTranslationX(-width2);
                        super.dispatchDraw(canvas);
                        if (!q6) {
                            Paint paint2 = this.h;
                            if (paint2 != null) {
                                paint2.setAlpha((int) (Utilities.clamp(this.r * this.v, 1.0f, 0.0f) * 255.0f));
                                rectF3 = rectF2;
                                canvas.drawRect(rectF3, paint2);
                            } else {
                                rectF3 = rectF2;
                            }
                            Paint paint3 = this.n;
                            if (paint3 != null) {
                                paint3.setAlpha((int) (Utilities.clamp(this.s * this.v, 1.0f, 0.0f) * 255.0f));
                                canvas.drawRect(rectF3, paint3);
                            }
                        }
                        canvas.restoreToCount(i12);
                        f(f24, max2, f37, 255, canvas);
                        invalidate();
                    }
                }
                i12 = save3;
                rectF2 = rectF;
                e1Var = e1Var3;
                f16 = f25;
                if (!this.Y0) {
                }
                float f372 = f16;
                q6 = q();
                if (!q6) {
                }
                canvas.translate((1.0f - this.v) * getWidth() * ((!LocaleController.isRTL || this.I) ? -1 : 1), 0.0f);
                e1Var.setTranslationX(-width2);
                super.dispatchDraw(canvas);
                if (!q6) {
                }
                canvas.restoreToCount(i12);
                f(f24, max2, f372, 255, canvas);
                invalidate();
            }
        }
        if (!z10) {
            float f38 = this.K;
            if (f38 != 0.0f) {
                this.K = Math.max(0.0f, f38 - (min / 220.0f));
                invalidate();
            }
        }
        y80Var = this.N0;
        if (y80Var != null) {
        }
        float max22 = (Math.max(0.25f, Math.min(this.v, 1.0f)) - 0.25f) / 0.75f;
        float f242 = this.A * max22;
        float f252 = this.B * max22;
        HashSet hashSet3 = this.z0;
        hashSet3.clear();
        HashSet hashSet22 = this.y0;
        hashSet3.addAll(hashSet22);
        hashSet22.clear();
        if (this.X0) {
        }
        q0Var = this.h0;
        i10 = this.I0;
        if (q0Var != null) {
            f22 = this.j0;
            if (f22 != 1.0f) {
            }
        }
        q0Var2 = this.h0;
        if (q0Var2 == null) {
        }
        float f262 = this.j0;
        this.l0 = (f262 * 2.0f) + 1.0f;
        this.m0 = 1.0f - (f262 * 0.15f);
        int save4 = canvas2.save();
        if (LocaleController.isRTL) {
        }
        width = getWidth();
        f9 = 0.125f;
        float f272 = width * f9;
        f10 = this.v;
        if (f10 != 1.0f) {
        }
        if (LocaleController.isRTL) {
        }
        max = Math.max(0.25f, this.v);
        f11 = 0.0f;
        float pullingLeftProgress3 = getPullingLeftProgress();
        float g102 = g();
        moVar = this.Z0;
        if (moVar != null) {
        }
        float width22 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f11);
        float topOffset2 = getTopOffset();
        float paddingTop2 = getPaddingTop();
        jh.e1 e1Var32 = this.b;
        float f282 = f11;
        float f292 = max;
        RectF rectF52 = this.w;
        rectF52.set(getPaddingLeft() + width22, (((1.0f - this.m0) * e1Var32.getMeasuredHeight()) + paddingTop2) - g102, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g102);
        this.y = com.google.android.recaptcha.internal.a.w(g102, 2.0f, rectF52.height() - topOffset2, 2.0f);
        if (i10 == 1) {
        }
        canvas2.restoreToCount(save4);
        if (this.Y0) {
        }
        Path path2 = this.x;
        path2.rewind();
        float f332 = this.y;
        path2.addRoundRect(rectF, f332, f332, Path.Direction.CW);
        int save32 = canvas2.save();
        f15 = this.v;
        if (f15 != 1.0f) {
        }
        if (this.v != 0.0f) {
        }
        i12 = save32;
        rectF2 = rectF;
        e1Var = e1Var32;
        f16 = f252;
        if (!this.Y0) {
        }
        float f3722 = f16;
        q6 = q();
        if (!q6) {
        }
        canvas.translate((1.0f - this.v) * getWidth() * ((!LocaleController.isRTL || this.I) ? -1 : 1), 0.0f);
        e1Var.setTranslationX(-width22);
        super.dispatchDraw(canvas);
        if (!q6) {
        }
        canvas.restoreToCount(i12);
        f(f242, max22, f3722, 255, canvas);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        kg.d0 d0Var = this.t0;
        if (d0Var != null) {
            d0Var.d();
        }
    }

    public final void f(float f9, float f10, float f11, int i10, Canvas canvas) {
        float f12;
        if (this.I0 == 1) {
            return;
        }
        canvas.save();
        boolean z10 = this.H;
        RectF rectF = this.w;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), jr.f.getInterpolation(this.K)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f13 = rectF.bottom;
            jr jrVar = jr.f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f13, 0.0f, jrVar.getInterpolation(this.K)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), jrVar.getInterpolation(this.K)));
        }
        float width = ((LocaleController.isRTL || this.I) ? this.C : getWidth() - this.C) + this.Q0;
        float paddingTop = this.H ? getPaddingTop() - g() : (getHeight() - getPaddingBottom()) + g();
        int dp = AndroidUtilities.dp(3.0f);
        Drawable drawable = this.e0;
        drawable.setAlpha(i10);
        Paint paint = this.f;
        paint.setAlpha(i10);
        float f14 = width - f9;
        float f15 = dp;
        float f16 = f15 * f10;
        float f17 = paddingTop - f9;
        float f18 = width + f9;
        float f19 = paddingTop + f9;
        drawable.setBounds((int) (f14 - f16), (int) (f17 - f16), (int) (f18 + f16), (int) (f16 + f19));
        drawable.draw(canvas);
        boolean O = this.c0.O();
        float f20 = paddingTop;
        RectF rectF2 = this.U;
        if (O) {
            rectF2.set(f14, f17, f18, f19);
            f12 = f9;
            this.c0.G(canvas, rectF2, f12, getX(), getY(), i10, false);
        } else {
            f12 = f9;
            if (this.T0 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(f14, f17, f18, f19);
                Rect rect = AndroidUtilities.rectTmp2;
                rectF3.round(rect);
                rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                this.T0.setBounds(rect);
                this.T0.setAlpha(paint.getAlpha());
                this.T0.draw(canvas);
            } else {
                canvas.drawCircle(width, f20, f12, paint);
            }
        }
        boolean z11 = LocaleController.isRTL;
        float f21 = this.A;
        float width2 = this.Q0 + this.R0 + ((z11 || this.I) ? this.C - f21 : (getWidth() - this.C) + f21);
        boolean z12 = this.H;
        float f22 = this.B;
        float lerp = AndroidUtilities.lerp(z12 ? (getPaddingTop() - g()) - AndroidUtilities.dp(16.0f) : ((getHeight() - f22) - f15) + g(), (f22 + f15) - g(), jr.f.getInterpolation(this.K));
        float f23 = (-AndroidUtilities.dp(1.0f)) * f10;
        drawable.setBounds((int) ((width2 - f12) - f23), (int) ((lerp - f12) - f23), (int) (width2 + f12 + f23), (int) (f12 + lerp + f23));
        drawable.draw(canvas);
        if (this.c0.O()) {
            rectF2.set(width2 - f11, lerp - f11, width2 + f11, lerp + f11);
            this.c0.G(canvas, rectF2, f11, getX(), getY(), i10, false);
        } else if (this.U0 != null) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(width2 - f11, lerp - f11, width2 + f11, lerp + f11);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rectF4.round(rect2);
            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
            this.U0.setBounds(rect2);
            this.U0.setAlpha(paint.getAlpha());
            this.U0.draw(canvas);
        } else {
            canvas.drawCircle(width2, lerp, f11, paint);
        }
        canvas.restore();
        drawable.setAlpha(255);
        paint.setAlpha(255);
    }

    public final float g() {
        return (int) (getPullingLeftProgress() * AndroidUtilities.dp(6.0f));
    }

    public ek0 getDelegate() {
        return this.c0;
    }

    public int getHintTextWidth() {
        return this.O0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.P.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.clamp(this.x0 / AndroidUtilities.dp(42.0f), 2.0f, 0.0f);
    }

    public kg.d0 getReactionsWindow() {
        return this.t0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f9;
        HashSet hashSet = this.W;
        if (hashSet.isEmpty()) {
            return "";
        }
        kg.q0 q0Var = (kg.q0) hashSet.iterator().next();
        long j10 = q0Var.g;
        String str = null;
        if (j10 != 0 && (f9 = p5.f(this.F, j10)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f9, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = q0Var.f;
        }
        return TextUtils.isEmpty(str) ? "👍" : str;
    }

    public HashSet<kg.q0> getSelectedReactions() {
        return this.W;
    }

    public float getTopOffset() {
        if (this.M0) {
            return ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (q()) {
            return (AndroidUtilities.dp(36.0f) * itemsCount) - AndroidUtilities.dp(4.0f);
        }
        return AndroidUtilities.dp(16.0f) + com.google.android.recaptcha.internal.a.f(itemsCount, 1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(36.0f) * itemsCount);
    }

    public List<kg.q0> getVisibleReactionsList() {
        return this.P;
    }

    public int getWindowType() {
        int i10 = this.I0;
        if (i10 == 4) {
            return 13;
        }
        if (i10 == 3) {
            return 11;
        }
        if (i10 == 5) {
            return 14;
        }
        return this.B0 ? 8 : 1;
    }

    public View getWindowView() {
        kg.d0 d0Var = this.t0;
        if (d0Var == null) {
            return null;
        }
        return d0Var.c;
    }

    public final void h(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.I0;
        if (i11 == 4) {
            Iterator it = this.W.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                kg.q0 q0Var = (kg.q0) it.next();
                if (!hashSet.contains(q0Var)) {
                    hashSet.add(q0Var);
                    arrayList.add(q0Var);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.F).getEnabledReactionsList();
            while (i10 < enabledReactionsList.size()) {
                kg.q0 c3 = kg.q0.c(enabledReactionsList.get(i10));
                if (!hashSet.contains(c3)) {
                    hashSet.add(c3);
                    arrayList.add(c3);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
                i10++;
            }
            return;
        }
        if (!this.A0 || i11 == 4) {
            if (i11 != 3) {
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.F).getEnabledReactionsList();
                while (i10 < enabledReactionsList2.size()) {
                    arrayList.add(kg.q0.c(enabledReactionsList2.get(i10)));
                    i10++;
                }
                return;
            }
            ArrayList<TLRPC.Reaction> savedReactions = MediaDataController.getInstance(this.F).getSavedReactions();
            int i13 = 0;
            while (i10 < savedReactions.size()) {
                kg.q0 d = kg.q0.d(savedReactions.get(i10));
                if (!hashSet.contains(d)) {
                    hashSet.add(d);
                    arrayList.add(d);
                    i13++;
                }
                if (i13 == 16) {
                    return;
                } else {
                    i10++;
                }
            }
            return;
        }
        if (i11 == 5) {
            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.F).getAvailableEffects();
            if (availableEffects != null) {
                while (i10 < availableEffects.effects.size()) {
                    kg.q0 e10 = kg.q0.e(availableEffects.effects.get(i10));
                    if (!hashSet.contains(e10)) {
                        hashSet.add(e10);
                        arrayList.add(e10);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        ArrayList<TLRPC.Reaction> savedReactions2 = i11 == 3 ? MediaDataController.getInstance(this.F).getSavedReactions() : MediaDataController.getInstance(this.F).getTopReactions();
        if (i11 == 3) {
            TLRPC.TL_messages_savedReactionsTags savedReactionTags = MessagesController.getInstance(this.F).getSavedReactionTags(0L);
            if (savedReactionTags != null) {
                for (int i14 = 0; i14 < savedReactionTags.tags.size(); i14++) {
                    kg.q0 d10 = kg.q0.d(savedReactionTags.tags.get(i14).reaction);
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            }
            for (int i15 = 0; i15 < savedReactions2.size(); i15++) {
                kg.q0 d11 = kg.q0.d(savedReactions2.get(i15));
                if (!hashSet.contains(d11)) {
                    hashSet.add(d11);
                    arrayList.add(d11);
                }
            }
        } else {
            for (int i16 = 0; i16 < savedReactions2.size(); i16++) {
                kg.q0 d12 = kg.q0.d(savedReactions2.get(i16));
                if (!hashSet.contains(d12) && (i11 == 3 || UserConfig.getInstance(this.F).isPremium() || d12.g == 0)) {
                    hashSet.add(d12);
                    arrayList.add(d12);
                }
            }
        }
        if (i11 != 3 || UserConfig.getInstance(this.F).isPremium()) {
            ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.F).getRecentReactions();
            for (int i17 = 0; i17 < recentReactions.size(); i17++) {
                kg.q0 d13 = kg.q0.d(recentReactions.get(i17));
                if (!hashSet.contains(d13)) {
                    hashSet.add(d13);
                    arrayList.add(d13);
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList3 = MediaDataController.getInstance(this.F).getEnabledReactionsList();
            while (i10 < enabledReactionsList3.size()) {
                kg.q0 c6 = kg.q0.c(enabledReactionsList3.get(i10));
                if (!hashSet.contains(c6)) {
                    hashSet.add(c6);
                    arrayList.add(c6);
                }
                i10++;
            }
        }
    }

    public void j() {
        int i10 = 0;
        while (true) {
            jh.e1 e1Var = this.b;
            if (i10 >= e1Var.getChildCount()) {
                return;
            }
            View childAt = e1Var.getChildAt(i10);
            if (childAt instanceof dk0) {
                ((dk0) childAt).b.invalidate();
            }
            i10++;
        }
    }

    public final void k() {
        int dp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, w02, 0, tileMode));
        this.n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, w02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, kg.q0 q0Var, boolean z10) {
        ek0 ek0Var = this.c0;
        if (ek0Var != null) {
            ek0Var.Q(view, q0Var, z10, true);
        }
        if (this.I0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void n() {
        this.K0 = true;
        this.i0 = 0;
        this.j0 = 0.0f;
        this.x0 = 0.0f;
        this.h0 = null;
        this.n0 = false;
        rj0 rj0Var = new rj0(this, 1);
        jh.e1 e1Var = this.b;
        AndroidUtilities.forEachViews((RecyclerView) e1Var, (f5.d) rj0Var);
        this.y0.clear();
        e1Var.invalidate();
        bg.d1 d1Var = this.O;
        if (d1Var != null) {
            d1Var.invalidate();
        }
        invalidate();
    }

    public final void o(lg.a aVar, og.d dVar) {
        this.V0 = aVar;
        this.W0 = dVar;
        ng.d c3 = aVar.c(this, null, true);
        c3.n(dVar);
        c3.p(AndroidUtilities.dp(24.0f));
        c3.o(AndroidUtilities.dp(8.0f));
        this.S0 = c3;
        ng.d c6 = aVar.c(this, null, true);
        c6.n(dVar);
        c6.p(AndroidUtilities.dp(8.0f));
        c6.o(AndroidUtilities.dp(8.0f));
        this.T0 = c6;
        ng.d c10 = aVar.c(this, null, true);
        c10.n(dVar);
        c10.p(AndroidUtilities.dp(4.0f));
        c10.o(AndroidUtilities.dp(8.0f));
        this.U0 = c10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.F).addObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.I0 == 5) {
            NotificationCenter.getInstance(this.F).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.I0 == 5) {
            NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        k();
    }

    public final void p(MessageObject messageObject, TLRPC.ChatFull chatFull, boolean z10) {
        int i10;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.D = messageObject;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (tL_messageReactions2 = message.reactions) == null) {
            i10 = 0;
        } else {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i11);
                i11++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i10++;
                }
            }
        }
        int i12 = this.I0;
        this.E = i12 == 0 && this.D != null && i10 >= MessagesController.getInstance(this.F).getChatMaxUniqReactions(this.D.getDialogId());
        this.w0 = i12 == 0 && this.D != null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.F).getChat(Long.valueOf(-this.D.getDialogId())));
        ArrayList arrayList2 = new ArrayList();
        if (messageObject != null && messageObject.isForwardedChannelPost() && (chatFull = MessagesController.getInstance(this.F).getChatFull(-messageObject.getFromChatId())) == null) {
            this.G = -messageObject.getFromChatId();
            MessagesController.getInstance(this.F).loadFullChat(-messageObject.getFromChatId(), 0, true);
            setVisibility(4);
            return;
        }
        this.V = false;
        if (i12 == 3) {
            this.A0 = UserConfig.getInstance(this.F).isPremium();
            h(arrayList2);
        } else if (i12 == 5) {
            this.A0 = true;
            h(arrayList2);
        } else if (this.E) {
            this.A0 = false;
            if (chatFull != null && chatFull.paid_reactions_available) {
                this.V = true;
                kg.q0 q0Var = new kg.q0();
                q0Var.a = true;
                arrayList2.add(q0Var);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.D.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i13);
                i13++;
                arrayList2.add(kg.q0.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.V = true;
                kg.q0 q0Var2 = new kg.q0();
                q0Var2.a = true;
                arrayList2.add(q0Var2);
            }
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat chat = MessagesController.getInstance(this.F).getChat(Long.valueOf(chatFull.id));
                if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
                    this.A0 = false;
                } else {
                    this.A0 = true;
                }
                h(arrayList2);
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i14);
                    i14++;
                    TLRPC.Reaction reaction2 = reaction;
                    Iterator<TLRPC.TL_availableReaction> it = MediaDataController.getInstance(this.F).getEnabledReactionsList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TLRPC.TL_availableReaction next = it.next();
                            if (!(reaction2 instanceof TLRPC.TL_reactionEmoji) || !next.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    arrayList2.add(kg.q0.d(reaction2));
                                    break;
                                }
                            } else {
                                arrayList2.add(kg.q0.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.A0 = true;
            h(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i15))) {
                i15--;
                arrayList2.remove(i15);
            } else {
                hashSet.add((kg.q0) arrayList2.get(i15));
            }
            i15++;
        }
        this.B0 = !this.E && ((!this.A0 && arrayList2.size() > 16) || (this.A0 && !UserConfig.getInstance(this.F).isPremium() && MessagesController.getInstance(this.F).premiumFeaturesBlocked()));
        if (i12 == 3 && !UserConfig.getInstance(this.F).isPremium()) {
            this.B0 = false;
        }
        if (i12 == 4) {
            this.B0 = true;
        }
        ArrayList arrayList5 = this.P;
        arrayList5.clear();
        if (q()) {
            int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) / AndroidUtilities.dp(34.0f);
            if (dp > 7) {
                dp = 7;
            }
            if (dp < 1) {
                dp = 1;
            }
            int i16 = 0;
            while (i16 < Math.min(arrayList2.size(), dp)) {
                arrayList5.add((kg.q0) arrayList2.get(i16));
                i16++;
            }
            if (i16 < arrayList2.size()) {
                dk0.a(this.v0, (kg.q0) arrayList2.get(i16), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.C0 = true;
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (((kg.q0) arrayList5.get(i17)).g != 0) {
                this.C0 = false;
            }
        }
        ArrayList arrayList6 = this.R;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        vj0 vj0Var = this.T;
        fk0 fk0Var = vj0Var.d;
        ArrayList arrayList7 = fk0Var.e;
        ArrayList arrayList8 = fk0Var.P;
        ArrayList arrayList9 = fk0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i18 = 0; i18 < arrayList8.size(); i18++) {
            kg.q0 q0Var3 = (kg.q0) arrayList8.get(i18);
            arrayList9.add(new wj0(q0Var3.f == null ? 3 : 0, q0Var3));
        }
        if (!fk0Var.Q.isEmpty() && !MessagesController.getInstance(fk0Var.F).premiumFeaturesBlocked()) {
            arrayList9.add(new wj0(1, null));
        }
        if (fk0Var.q()) {
            arrayList9.add(new wj0(2, null));
        }
        if (z10) {
            vj0Var.E(arrayList7, arrayList9);
        } else {
            vj0Var.l();
        }
        if (messageObject == null || (tL_messageReactions = messageObject.messageOwner.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i19 = 0; i19 < messageObject.messageOwner.reactions.results.size(); i19++) {
            if (messageObject.messageOwner.reactions.results.get(i19).chosen) {
                this.W.add(kg.q0.d(messageObject.messageOwner.reactions.results.get(i19).reaction));
            }
        }
    }

    public final boolean q() {
        return this.A0 || this.B0;
    }

    public final void r(boolean z10) {
        ObjectAnimator duration;
        this.G0 = z10;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.H0.lock();
        boolean deviceIsHigh = SharedConfig.deviceIsHigh();
        org.telegram.ui.Cells.b1 b1Var = g1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new nh.a5(this, 1));
        duration.start();
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        if (getAlpha() != f9 && f9 == 0.0f) {
            this.y0.clear();
            int i10 = 0;
            while (true) {
                jh.e1 e1Var = this.b;
                if (i10 >= e1Var.getChildCount()) {
                    break;
                }
                if (e1Var.getChildAt(i10) instanceof dk0) {
                    ((dk0) e1Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f9);
    }

    public void setBubbleOffset(float f9) {
        this.Q0 = f9;
    }

    public void setChatScrimView(mo moVar) {
        this.Z0 = moVar;
    }

    public void setCurrentAccount(int i10) {
        this.F = i10;
    }

    public void setCustomEmojiEnterProgress(float f9) {
        this.s0 = f9;
        mo moVar = this.Z0;
        if (moVar != null) {
            moVar.setPopupAlpha(1.0f - f9);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            this.r0.setBackground(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), 40)));
        } else {
            this.r0.setBackground(null);
        }
    }

    public void setDelegate(ek0 ek0Var) {
        this.c0 = ek0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        this.p0 = o2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.M0 = true;
        if (this.N0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.g0;
            y80 y80Var = new y80(context, c6Var);
            this.N0 = y80Var;
            y80Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.N0.setClickable(true);
            this.N0.setTextSize(1, 12.0f);
            int i10 = this.I0;
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                this.N0.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
                this.N0.setAlpha(0.5f);
            } else {
                this.N0.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
            }
            this.N0.setGravity(1);
            addView(this.N0, i7.f6.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.N0.setText(charSequence);
        this.a1 = false;
        ((FrameLayout.LayoutParams) this.v0.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
    }

    public void setMiniBubblesOffset(float f9) {
        this.R0 = f9;
    }

    public void setMirrorX(boolean z10) {
        this.I = z10;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.L0 = runnable;
    }

    public void setParentLayout(mo moVar) {
        this.F0 = moVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.W;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            kg.q0 b10 = kg.q0.b(str);
            hashSet.add(b10);
            this.a0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (f5.d) new rj0(this, 0));
    }

    public void setSelectedReaction(kg.q0 q0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        this.T.l();
    }

    public void setSelectedReactionAnimated(kg.q0 q0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (f5.d) new rj0(this, 0));
    }

    public void setSelectedReactionInclusive(kg.q0 q0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (f5.d) new rj0(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.W;
        hashSet.clear();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = arrayList.get(i10);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        hashSet.add(kg.q0.d(messageObject.messageOwner.reactions.results.get(i11).reaction));
                    }
                }
            }
        }
        this.T.l();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        HashSet hashSet = this.W;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        AndroidUtilities.forEachViews((RecyclerView) this.b, (f5.d) new rj0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.Y0 != z10) {
            this.Y0 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    jh.e1 e1Var = this.b;
                    if (i10 >= e1Var.getChildCount()) {
                        break;
                    }
                    if (e1Var.getChildAt(i10) instanceof dk0) {
                        dk0 dk0Var = (dk0) e1Var.getChildAt(i10);
                        boolean z11 = dk0Var.r;
                        ck0 ck0Var = dk0Var.b;
                        if (z11 && (ck0Var.getImageReceiver().getLottieAnimation() != null || ck0Var.getImageReceiver().getAnimation() != null)) {
                            ck0Var.setVisibility(0);
                            dk0Var.a.setVisibility(4);
                            if (dk0Var.s) {
                                dk0Var.v = true;
                            }
                        }
                        dk0Var.invalidate();
                    }
                    i10++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.W;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(kg.q0.d(reaction));
        }
        this.T.l();
    }

    public void setTop(boolean z10) {
        this.H = z10;
    }

    public void setTransitionProgress(float f9) {
        this.v = f9;
        mo moVar = this.F0;
        if (moVar != null) {
            if (!this.G0 || !SharedConfig.deviceIsHigh()) {
                f9 = 1.0f;
            }
            moVar.setReactionsTransitionProgress(f9);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationX(float f9) {
        if (f9 != getTranslationX()) {
            super.setTranslationX(f9);
        }
    }

    public void m() {
    }
}
