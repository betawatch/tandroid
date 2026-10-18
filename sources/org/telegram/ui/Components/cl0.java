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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public class cl0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Cells.d1 k1 = new org.telegram.ui.Cells.d1(Float.class, "transitionProgress", 2);
    public boolean A0;
    public float B0;
    public final HashSet C0;
    public final HashSet D0;
    public final float E;
    public boolean E0;
    public final float F;
    public boolean F0;
    public int G;
    public boolean G0;
    public MessageObject H;
    public final Paint H0;
    public boolean I;
    public final Paint I0;
    public int J;
    public cp J0;
    public long K;
    public boolean K0;
    public boolean L;
    public final AnimationNotificationsLocker L0;
    public boolean M;
    public final int M0;
    public boolean N;
    public boolean N0;
    public float O;
    public boolean O0;
    public long P;
    public Runnable P0;
    public ValueAnimator Q;
    public boolean Q0;
    public FrameLayout R;
    public x90 R0;
    public ah.v S;
    public int S0;
    public final ArrayList T;
    public int T0;
    public final ArrayList U;
    public float U0;
    public final ArrayList V;
    public float V0;
    public final hg.i0 W;
    public dh.d W0;
    public dh.d X0;
    public dh.d Y0;
    public bh.b Z0;
    public boolean a;
    public final sk0 a0;
    public eh.e a1;
    public final ai.u1 b;
    public final RectF b0;
    public boolean b1;
    public final float c;
    public boolean c0;
    public boolean c1;
    public final ArrayList d;
    public final HashSet d0;
    public cp d1;
    public final ArrayList e;
    public final HashSet e0;
    public boolean e1;
    public final Paint f;
    public final int[] f0;
    public boolean f1;
    public bl0 g0;
    public boolean g1;
    public final Paint h;
    public final Rect h0;
    public Paint h1;
    public final Drawable i0;
    public Matrix i1;
    public final boolean j0;
    public LinearGradient j1;
    public final org.telegram.ui.ActionBar.d6 k0;
    public ah.i1 l0;
    public int m0;
    public final Paint n;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public float r;
    public boolean r0;
    public float s;
    public long s0;
    public org.telegram.ui.ActionBar.n2 t0;
    public sg.b1 u0;
    public float v;
    public ds v0;
    public final RectF w;
    public float w0;
    public final Path x;
    public ah.t0 x0;
    public float y;
    public ValueAnimator y0;
    public final al0 z0;

    public cl0(int i10, int i11, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
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
        this.E = dp;
        this.F = dp / 2.0f;
        this.G = AndroidUtilities.dp(36.0f);
        this.T = new ArrayList(20);
        this.U = new ArrayList(10);
        this.V = new ArrayList(20);
        this.b0 = new RectF();
        this.c0 = false;
        this.d0 = new HashSet();
        this.e0 = new HashSet();
        this.f0 = new int[2];
        Rect rect = new Rect();
        this.h0 = rect;
        new ArrayList();
        this.C0 = new HashSet();
        this.D0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.H0 = paint2;
        Paint paint3 = new Paint(1);
        this.I0 = paint3;
        this.L0 = new AnimationNotificationsLocker();
        this.O0 = true;
        this.f1 = false;
        this.M0 = i10;
        this.c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var));
        paint3.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Jj, d6Var));
        this.k0 = d6Var;
        this.J = i11;
        this.t0 = n2Var;
        al0 al0Var = new al0(this, context);
        this.z0 = al0Var;
        al0Var.setVisibility(8);
        al0Var.O = false;
        al0Var.c.setVisibility(8);
        addView(al0Var);
        this.j0 = SharedConfig.animationsEnabled() && SharedConfig.getDevicePerformanceClass() != 0;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.i0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Td, false), PorterDuff.Mode.MULTIPLY));
        ai.u1 u1Var = new ai.u1(this, context, 19);
        this.b = u1Var;
        u1Var.setClipChildren(false);
        u1Var.setClipToPadding(false);
        hg.i0 i0Var = new hg.i0((ViewGroup) this, 4);
        this.W = i0Var;
        u1Var.i(new pk0(this, 0));
        u1Var.setLayoutManager(i0Var);
        u1Var.setOverScrollMode(2);
        sk0 sk0Var = new sk0(this);
        this.a0 = sk0Var;
        u1Var.setAdapter(sk0Var);
        u1Var.j(new wk0(this));
        u1Var.j(new kv(this, 6));
        u1Var.i(new pk0(this, 1));
        u1Var.setOnItemClickListener(new j(this, 11));
        u1Var.setOnItemLongClickListener((yl0) new i2.r(this, i10, 9));
        addView(u1Var, w7.z5.d(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (u1Var.getLayoutParams().height - u1Var.getPaddingTop()) - u1Var.getPaddingBottom();
        al0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        al0Var.getLayoutParams().height = paddingTop;
        if (i10 == 2 || i10 == 4) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var));
        }
        MediaDataController.getInstance(i11).preloadDefaultReactions();
    }

    public static void a(cl0 cl0Var) {
        if (cl0Var.x0 != null) {
            return;
        }
        ah.t0 t0Var = new ah.t0(cl0Var.M0, cl0Var.t0, cl0Var.V, cl0Var.d0, cl0Var, cl0Var.k0, cl0Var.a);
        cl0Var.x0 = t0Var;
        bh.b bVar = cl0Var.Z0;
        boolean z10 = true;
        if (bVar != null) {
            eh.e eVar = cl0Var.a1;
            org.telegram.ui.q41 q41Var = t0Var.m.f0;
            q41Var.x = true;
            q41Var.setBackground(null);
            q41Var.d();
            q41Var.invalidate();
            dh.d c10 = bVar.c(t0Var.a, null, true);
            c10.o(eVar);
            c10.q(AndroidUtilities.dp(12.0f));
            c10.p(AndroidUtilities.dp(8.0f));
            t0Var.z = c10;
        }
        ah.t0 t0Var2 = cl0Var.x0;
        bl0 bl0Var = cl0Var.g0;
        if (bl0Var != null && !bl0Var.h()) {
            z10 = false;
        }
        t0Var2.m.setLongPressEnabled(z10);
        cl0Var.j();
        cl0Var.x0.p = new rc0(cl0Var, 16);
        cl0Var.m();
    }

    public static void b(cl0 cl0Var, View view, float f7) {
        if (view instanceof al0) {
            ((al0) view).h = f7;
        } else {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public static boolean c() {
        return SharedConfig.deviceIsHigh();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z10 = true;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            hashSet.clear();
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        ah.i1 d = ah.i1.d(messageObject.messageOwner.reactions.results.get(i11).reaction);
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
                hashSet2.add((ah.i1) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    public final void d() {
        ah.t0 t0Var = this.x0;
        if (t0Var != null) {
            if (!t0Var.q) {
                t0Var.q = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                int i10 = 0;
                ofFloat.addUpdateListener(new ah.j0(t0Var, i10));
                ofFloat.addListener(new ah.r0(t0Var, i10));
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
            this.x0 = null;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id != this.K || getVisibility() == 0 || (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                return;
            }
            p(this.H, null, true);
            setVisibility(0);
            r(false);
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.availableEffectsUpdate) {
                p(this.H, null, true);
            }
        } else {
            if (this.M0 != 4) {
                return;
            }
            invalidate();
            ai.u1 u1Var = this.b;
            u1Var.invalidate();
            u1Var.f1();
            for (int i12 = 0; i12 < u1Var.getChildCount(); i12++) {
                View childAt = u1Var.getChildAt(i12);
                if (childAt instanceof al0) {
                    al0 al0Var = (al0) childAt;
                    al0Var.a.invalidate();
                    al0Var.b.invalidate();
                } else {
                    childAt.invalidate();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x036e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        x90 x90Var;
        ah.i1 i1Var;
        int i10;
        ah.i1 i1Var2;
        float width;
        float f7;
        float f10;
        float max;
        float f11;
        cp cpVar;
        float f12;
        int i11;
        float f13;
        RectF rectF;
        int i12;
        float f14;
        float f15;
        int i13;
        RectF rectF2;
        ai.u1 u1Var;
        int i14;
        float f16;
        boolean q6;
        RectF rectF3;
        int i15;
        RectF rectF4;
        int i16;
        ai.u1 u1Var2;
        float f17;
        int R;
        float f18;
        float f19;
        float x10;
        float scaleX;
        float f20;
        float f21;
        r5 r5Var;
        ci.g3 g3Var;
        int i17;
        bl0 bl0Var;
        float f22;
        Canvas canvas2 = canvas;
        long min = Math.min(16L, System.currentTimeMillis() - this.P);
        this.P = System.currentTimeMillis();
        boolean z10 = this.N;
        if (z10) {
            float f23 = this.O;
            if (f23 != 1.0f) {
                this.O = org.telegram.ui.Cells.c1.c(min, 220.0f, f23, 1.0f);
                invalidate();
                x90Var = this.R0;
                if (x90Var != null) {
                    x90Var.setTranslationY(-g());
                }
                float max2 = (Math.max(0.25f, Math.min(this.v, 1.0f)) - 0.25f) / 0.75f;
                float f24 = this.E * max2;
                float f25 = this.F * max2;
                HashSet hashSet = this.D0;
                hashSet.clear();
                HashSet hashSet2 = this.C0;
                hashSet.addAll(hashSet2);
                hashSet2.clear();
                if (this.b1) {
                    invalidate();
                }
                i1Var = this.l0;
                i10 = this.M0;
                if (i1Var != null && i10 != 5 && ((bl0Var = this.g0) == null || bl0Var.h())) {
                    f22 = this.n0;
                    if (f22 != 1.0f) {
                        float longPressTimeout = (16.0f / (this.l0.a ? ViewConfiguration.getLongPressTimeout() : 1500.0f)) + f22;
                        this.n0 = longPressTimeout;
                        if (longPressTimeout >= 1.0f) {
                            this.n0 = 1.0f;
                        }
                        invalidate();
                    }
                }
                i1Var2 = this.l0;
                if (i1Var2 == null && i1Var2.a) {
                    this.p0 = 1.0f;
                    this.q0 = 1.0f;
                } else {
                    float f26 = this.n0;
                    this.p0 = (f26 * 2.0f) + 1.0f;
                    this.q0 = 1.0f - (f26 * 0.15f);
                }
                int save = canvas2.save();
                if (!LocaleController.isRTL || this.M) {
                    width = getWidth();
                    f7 = 0.125f;
                } else {
                    width = getWidth();
                    f7 = 0.875f;
                }
                float f27 = width * f7;
                f10 = this.v;
                if (f10 != 1.0f) {
                    canvas2.scale(f10, f10, f27, getHeight() / 2.0f);
                }
                if (!LocaleController.isRTL || this.M) {
                    max = Math.max(0.25f, this.v);
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f - Math.max(0.25f, this.v);
                    max = 1.0f;
                }
                float pullingLeftProgress = getPullingLeftProgress();
                float g10 = g();
                cpVar = this.d1;
                if (cpVar != null) {
                    cpVar.setExpandSize(g10);
                }
                float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f11);
                float topOffset = getTopOffset();
                float paddingTop = getPaddingTop();
                ai.u1 u1Var3 = this.b;
                float f28 = f11;
                float f29 = max;
                RectF rectF5 = this.w;
                rectF5.set(getPaddingLeft() + width2, (((1.0f - this.q0) * u1Var3.getMeasuredHeight()) + paddingTop) - g10, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g10);
                this.y = com.google.android.gms.internal.play_billing.k3.c(g10, 2.0f, rectF5.height() - topOffset, 2.0f);
                if (i10 == 1) {
                    f12 = 255.0f;
                    int clamp = (int) (Utilities.clamp(1.0f - (this.w0 / 0.05f), 1.0f, 0.0f) * 255.0f);
                    Drawable drawable = this.i0;
                    drawable.setAlpha(clamp);
                    float paddingLeft = getPaddingLeft();
                    int width3 = getWidth() - getPaddingRight();
                    Rect rect = this.h0;
                    int i18 = (int) g10;
                    drawable.setBounds((int) ((((width3 + rect.right) * f28) + paddingLeft) - rect.left), (getPaddingTop() - rect.top) - i18, (int) (((getWidth() - getPaddingRight()) + rect.right) * f29), (getHeight() - getPaddingBottom()) + rect.bottom + i18);
                    if (this.W0 == null) {
                        drawable.draw(canvas2);
                    }
                } else {
                    f12 = 255.0f;
                }
                canvas2.restoreToCount(save);
                if (this.c1) {
                    int save2 = canvas2.save();
                    float f30 = this.v;
                    if (f30 != 1.0f) {
                        f14 = 2.0f;
                        canvas2.scale(f30, f30, f27, getHeight() / 2.0f);
                    } else {
                        f14 = 2.0f;
                    }
                    if (i10 == 1 || this.g0.r()) {
                        i17 = save2;
                        i11 = i10;
                        rectF = rectF5;
                        f13 = f27;
                        i12 = 1;
                        this.g0.m(canvas, rectF, this.y, getX(), getY(), 255, false);
                        canvas2 = canvas;
                    } else {
                        dh.d dVar = this.W0;
                        Paint paint = this.f;
                        if (dVar != null) {
                            Rect rect2 = AndroidUtilities.rectTmp2;
                            rectF5.round(rect2);
                            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                            this.W0.setBounds(rect2);
                            this.W0.setAlpha(paint.getAlpha());
                            this.W0.draw(canvas2);
                        } else {
                            float f31 = this.y;
                            canvas2.drawRoundRect(rectF5, f31, f31, paint);
                        }
                        i17 = save2;
                        i11 = i10;
                        f13 = f27;
                        rectF = rectF5;
                        i12 = 1;
                    }
                    if (this.c0) {
                        Iterator it = this.d0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                float f32 = this.y;
                                float clamp01 = Utilities.clamp01(1.0f - getPullingLeftProgress());
                                if (this.h1 == null) {
                                    this.h1 = new Paint(i12);
                                }
                                if (this.i1 == null) {
                                    this.i1 = new Matrix();
                                }
                                if (this.j1 == null) {
                                    int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Jj, this.k0);
                                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{w02, org.telegram.ui.ActionBar.h6.m1(0.0f, w02)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                    this.j1 = linearGradient;
                                    this.h1.setShader(linearGradient);
                                }
                                this.i1.reset();
                                this.i1.postTranslate(rectF.left, rectF.top);
                                this.j1.setLocalMatrix(this.i1);
                                this.h1.setAlpha((int) (clamp01 * f12));
                                canvas2.drawRoundRect(rectF, f32, f32, this.h1);
                            } else if (((ah.i1) it.next()).a) {
                                break;
                            }
                        }
                    }
                    canvas2.restoreToCount(i17);
                } else {
                    i11 = i10;
                    f13 = f27;
                    rectF = rectF5;
                    i12 = 1;
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
                    int i19 = i11;
                    if (getAlpha() == 1.0f || i19 == 5) {
                        int i20 = 0;
                        int i21 = 0;
                        int i22 = 0;
                        while (true) {
                            boolean z11 = i12;
                            if (i20 >= u1Var3.getChildCount()) {
                                break;
                            }
                            View childAt = u1Var3.getChildAt(i20);
                            int abs = (this.v == 1.0f || !SharedConfig.deviceIsHigh()) ? i22 : (int) (Math.abs((((childAt.getMeasuredWidth() / f14) + childAt.getLeft()) / u1Var3.getMeasuredWidth()) - 0.8f) * 200.0f);
                            float f34 = f25;
                            if (childAt instanceof al0) {
                                al0 al0Var = (al0) u1Var3.getChildAt(i20);
                                i16 = i20;
                                if (this.B0 != 0.0f) {
                                    i15 = save3;
                                    f19 = AndroidUtilities.dp(46.0f) * Utilities.clamp(al0Var.getLeft() / (getMeasuredWidth() - AndroidUtilities.dp(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress();
                                } else {
                                    i15 = save3;
                                    f19 = 0.0f;
                                }
                                ah.i1 i1Var3 = al0Var.e;
                                zk0 zk0Var = al0Var.a;
                                float f35 = f19;
                                zk0 zk0Var2 = al0Var.b;
                                zk0 zk0Var3 = al0Var.c;
                                rectF4 = rectF;
                                if (i1Var3.equals(this.l0)) {
                                    zk0 zk0Var4 = zk0Var2.getVisibility() == 0 ? zk0Var2 : zk0Var;
                                    al0Var.setPivotX(al0Var.getMeasuredWidth() >> 1);
                                    al0Var.setPivotY(zk0Var4.getY() + zk0Var4.getMeasuredHeight());
                                    al0Var.setScaleX(this.p0);
                                    al0Var.setScaleY(this.p0);
                                    if (!this.r0) {
                                        if (this.Q == null) {
                                            zk0Var3.setVisibility(0);
                                            zk0Var3.setAlpha(1.0f);
                                            if (zk0Var3.getImageReceiver().hasBitmapImage() || ((r5Var = zk0Var3.e) != null && (g3Var = r5Var.k) != null && g3Var.hasBitmapImage())) {
                                                zk0Var4.setAlpha(0.0f);
                                            }
                                            f21 = 1.0f;
                                        } else {
                                            f21 = 1.0f;
                                            zk0Var3.setAlpha(1.0f - this.o0);
                                            zk0Var4.setAlpha(this.o0);
                                        }
                                        if (this.n0 == f21) {
                                            this.r0 = z11;
                                            if (System.currentTimeMillis() - this.s0 > 300) {
                                                this.s0 = System.currentTimeMillis();
                                                u1Var2 = u1Var3;
                                                this.g0.l(al0Var, al0Var.e, true, false);
                                                canvas2.save();
                                                x10 = al0Var.getX() + u1Var2.getX();
                                                scaleX = ((al0Var.getScaleX() * al0Var.getMeasuredWidth()) - al0Var.getMeasuredWidth()) / f14;
                                                f20 = x10 - scaleX;
                                                if (f20 >= 0.0f && al0Var.getTranslationX() >= 0.0f) {
                                                    al0Var.setTranslationX((-f20) - f35);
                                                } else if (al0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth() || al0Var.getTranslationX() > 0.0f) {
                                                    al0Var.setTranslationX(0.0f - f35);
                                                } else {
                                                    al0Var.setTranslationX((((getMeasuredWidth() - x10) - al0Var.getMeasuredWidth()) - scaleX) - f35);
                                                }
                                                canvas2.translate(al0Var.getX() + u1Var2.getX(), al0Var.getY() + u1Var2.getY());
                                                canvas2.scale(al0Var.getScaleX(), al0Var.getScaleY(), al0Var.getPivotX(), al0Var.getPivotY());
                                                al0Var.draw(canvas2);
                                                canvas2.restore();
                                            }
                                        }
                                    }
                                    u1Var2 = u1Var3;
                                    canvas2.save();
                                    x10 = al0Var.getX() + u1Var2.getX();
                                    scaleX = ((al0Var.getScaleX() * al0Var.getMeasuredWidth()) - al0Var.getMeasuredWidth()) / f14;
                                    f20 = x10 - scaleX;
                                    if (f20 >= 0.0f) {
                                    }
                                    if (al0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth()) {
                                    }
                                    al0Var.setTranslationX(0.0f - f35);
                                    canvas2.translate(al0Var.getX() + u1Var2.getX(), al0Var.getY() + u1Var2.getY());
                                    canvas2.scale(al0Var.getScaleX(), al0Var.getScaleY(), al0Var.getPivotX(), al0Var.getPivotY());
                                    al0Var.draw(canvas2);
                                    canvas2.restore();
                                } else {
                                    u1Var2 = u1Var3;
                                    int R2 = RecyclerView.R(al0Var);
                                    float measuredWidth = (((this.p0 - 1.0f) * al0Var.getMeasuredWidth()) / 3.0f) - (((1.0f - this.q0) * al0Var.getMeasuredWidth()) * (Math.abs(this.m0 - R2) - 1));
                                    if (R2 < this.m0) {
                                        al0Var.setPivotX(0.0f);
                                        al0Var.setTranslationX(-measuredWidth);
                                    } else {
                                        al0Var.setPivotX(al0Var.getMeasuredWidth() - f35);
                                        al0Var.setTranslationX(measuredWidth - f35);
                                    }
                                    al0Var.setPivotY(zk0Var.getY() + zk0Var.getMeasuredHeight());
                                    al0Var.setScaleX(this.q0);
                                    al0Var.setScaleY(this.q0);
                                    zk0Var3.setVisibility(4);
                                    zk0Var.setAlpha(1.0f);
                                }
                                if (childAt.getLeft() > i21) {
                                    i21 = childAt.getLeft();
                                }
                                if (!this.N0 && (!al0Var.r || zk0Var.getImageReceiver().getLottieAnimation() != null)) {
                                    if ((al0Var.getMeasuredWidth() / f14) + al0Var.getX() > 0.0f && (al0Var.getMeasuredWidth() / f14) + al0Var.getX() < u1Var2.getWidth()) {
                                        if (!hashSet.contains(al0Var)) {
                                            al0Var.c(abs);
                                            abs += 30;
                                        }
                                        hashSet2.add(al0Var);
                                    } else if (!al0Var.n) {
                                        al0Var.d();
                                    }
                                }
                            } else {
                                i15 = save3;
                                rectF4 = rectF;
                                i16 = i20;
                                u1Var2 = u1Var3;
                                if (childAt == this.R) {
                                    if ((childAt.getMeasuredWidth() / f14) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f14) + childAt.getX() >= u1Var2.getWidth()) {
                                        sg.b1 b1Var = this.u0;
                                        f17 = 0.0f;
                                        b1Var.setScaleX(0.0f);
                                        b1Var.setScaleY(0.0f);
                                        if (childAt == this.S) {
                                            if ((childAt.getMeasuredWidth() / f14) + childAt.getX() <= f17 || (childAt.getMeasuredWidth() / f14) + childAt.getX() >= u1Var2.getWidth()) {
                                                ds dsVar = this.v0;
                                                dsVar.setScaleX(0.0f);
                                                dsVar.setScaleY(0.0f);
                                                ((cl0) dsVar.c).S.invalidate();
                                                ValueAnimator valueAnimator = (ValueAnimator) dsVar.b;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                            } else {
                                                if (!hashSet.contains(childAt)) {
                                                    if (this.v != 1.0f) {
                                                        ds dsVar2 = this.v0;
                                                        dsVar2.setScaleX(0.0f);
                                                        dsVar2.setScaleY(0.0f);
                                                        ((cl0) dsVar2.c).S.invalidate();
                                                        ValueAnimator valueAnimator2 = (ValueAnimator) dsVar2.b;
                                                        if (valueAnimator2 != null) {
                                                            valueAnimator2.cancel();
                                                        }
                                                    }
                                                    ds dsVar3 = this.v0;
                                                    boolean z12 = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || SharedConfig.getDevicePerformanceClass() >= 1;
                                                    dsVar3.invalidate();
                                                    ValueAnimator valueAnimator3 = (ValueAnimator) dsVar3.b;
                                                    if (valueAnimator3 != null) {
                                                        valueAnimator3.removeAllListeners();
                                                        ((ValueAnimator) dsVar3.b).cancel();
                                                    }
                                                    if (z12) {
                                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(dsVar3.getScaleX(), 1.0f);
                                                        dsVar3.b = ofFloat;
                                                        ofFloat.setInterpolator(AndroidUtilities.overshootInterpolator);
                                                        ((ValueAnimator) dsVar3.b).addUpdateListener(new b80(dsVar3, 8));
                                                        ((ValueAnimator) dsVar3.b).setStartDelay((long) (abs * ((cl0) dsVar3.c).c));
                                                        ((ValueAnimator) dsVar3.b).setDuration(300L);
                                                        ((ValueAnimator) dsVar3.b).start();
                                                    } else {
                                                        dsVar3.setScaleX(1.0f);
                                                        dsVar3.setScaleY(1.0f);
                                                    }
                                                    abs += 30;
                                                }
                                                hashSet2.add(childAt);
                                            }
                                        }
                                        R = RecyclerView.R(childAt);
                                        float measuredWidth2 = (((this.p0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.q0) * childAt.getMeasuredWidth()) * (Math.abs(this.m0 - R) - 1));
                                        if (R >= this.m0) {
                                            childAt.setPivotX(0.0f);
                                            childAt.setTranslationX(-measuredWidth2);
                                        } else {
                                            childAt.setPivotX(childAt.getMeasuredWidth());
                                            childAt.setTranslationX(measuredWidth2);
                                        }
                                        childAt.setScaleX(this.q0);
                                        childAt.setScaleY(this.q0);
                                    } else {
                                        if (!hashSet.contains(childAt)) {
                                            if (this.v != 1.0f) {
                                                sg.b1 b1Var2 = this.u0;
                                                f18 = 0.0f;
                                                b1Var2.setScaleX(0.0f);
                                                b1Var2.setScaleY(0.0f);
                                            } else {
                                                f18 = 0.0f;
                                            }
                                            sg.b1 b1Var3 = this.u0;
                                            org.telegram.ui.Components.voip.h hVar = b1Var3.J;
                                            if (hVar != null) {
                                                hVar.g = f18;
                                                hVar.j = false;
                                            }
                                            b1Var3.invalidate();
                                            b1Var3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(abs).setInterpolator(AndroidUtilities.overshootInterpolator).setDuration(300L);
                                            abs += 30;
                                        }
                                        hashSet2.add(childAt);
                                    }
                                }
                                f17 = 0.0f;
                                if (childAt == this.S) {
                                }
                                R = RecyclerView.R(childAt);
                                float measuredWidth22 = (((this.p0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.q0) * childAt.getMeasuredWidth()) * (Math.abs(this.m0 - R) - 1));
                                if (R >= this.m0) {
                                }
                                childAt.setScaleX(this.q0);
                                childAt.setScaleY(this.q0);
                            }
                            i22 = abs;
                            i20 = i16 + 1;
                            canvas2 = canvas;
                            f25 = f34;
                            save3 = i15;
                            u1Var3 = u1Var2;
                            rectF = rectF4;
                            i12 = 1;
                        }
                        i13 = save3;
                        rectF2 = rectF;
                        u1Var = u1Var3;
                        f16 = f25;
                        al0 al0Var2 = this.z0;
                        if (pullingLeftProgress > 0.0f) {
                            float pullingLeftProgress2 = getPullingLeftProgress();
                            int measuredWidth3 = al0Var2.getMeasuredWidth() - AndroidUtilities.dp(f14);
                            float f36 = i21 + measuredWidth3;
                            float clamp2 = Utilities.clamp(f36 / (getMeasuredWidth() - al0Var2.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth3;
                            if (al0Var2.getTag() == null) {
                                al0Var2.setTag(Float.valueOf(1.0f));
                                al0Var2.d();
                                al0Var2.c(0);
                            }
                            float clamp3 = Utilities.clamp(pullingLeftProgress2, 1.0f, 0.0f);
                            al0Var2.setScaleX(clamp3);
                            al0Var2.setScaleY(clamp3);
                            i14 = 1;
                            al0Var2.setTranslationX(((u1Var.getX() + f36) - clamp2) + (-((i19 == 1 || i19 == 2) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(20.0f))));
                            if (al0Var2.getVisibility() != 0) {
                                al0Var2.setVisibility(0);
                            }
                        } else {
                            i14 = 1;
                            if (al0Var2.getVisibility() != 8 && this.O0) {
                                al0Var2.setVisibility(8);
                            }
                            if (al0Var2.getTag() != null) {
                                al0Var2.setTag(null);
                            }
                        }
                        if (!this.c1 && this.x0 != null) {
                            int z13 = (int) org.telegram.messenger.g0.z(1.0f, this.w0, Utilities.clamp(1.0f - (this.w0 / 0.2f), 1.0f, 0.0f), f12);
                            canvas.save();
                            f(f24, max2, f16, z13, canvas);
                            canvas.restore();
                            return;
                        }
                        float f37 = f16;
                        q6 = q();
                        if (!q6) {
                            canvas.clipPath(path);
                        }
                        if (!LocaleController.isRTL || this.M) {
                            i14 = -1;
                        }
                        canvas.translate((1.0f - this.v) * getWidth() * i14, 0.0f);
                        u1Var.setTranslationX(-width2);
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
                        canvas.restoreToCount(i13);
                        f(f24, max2, f37, 255, canvas);
                        invalidate();
                    }
                }
                i13 = save3;
                rectF2 = rectF;
                u1Var = u1Var3;
                i14 = i12;
                f16 = f25;
                if (!this.c1) {
                }
                float f372 = f16;
                q6 = q();
                if (!q6) {
                }
                if (!LocaleController.isRTL) {
                }
                i14 = -1;
                canvas.translate((1.0f - this.v) * getWidth() * i14, 0.0f);
                u1Var.setTranslationX(-width2);
                super.dispatchDraw(canvas);
                if (!q6) {
                }
                canvas.restoreToCount(i13);
                f(f24, max2, f372, 255, canvas);
                invalidate();
            }
        }
        if (!z10) {
            float f38 = this.O;
            if (f38 != 0.0f) {
                this.O = org.telegram.ui.Cells.c1.v(min, 220.0f, f38, 0.0f);
                invalidate();
            }
        }
        x90Var = this.R0;
        if (x90Var != null) {
        }
        float max22 = (Math.max(0.25f, Math.min(this.v, 1.0f)) - 0.25f) / 0.75f;
        float f242 = this.E * max22;
        float f252 = this.F * max22;
        HashSet hashSet3 = this.D0;
        hashSet3.clear();
        HashSet hashSet22 = this.C0;
        hashSet3.addAll(hashSet22);
        hashSet22.clear();
        if (this.b1) {
        }
        i1Var = this.l0;
        i10 = this.M0;
        if (i1Var != null) {
            f22 = this.n0;
            if (f22 != 1.0f) {
            }
        }
        i1Var2 = this.l0;
        if (i1Var2 == null) {
        }
        float f262 = this.n0;
        this.p0 = (f262 * 2.0f) + 1.0f;
        this.q0 = 1.0f - (f262 * 0.15f);
        int save4 = canvas2.save();
        if (LocaleController.isRTL) {
        }
        width = getWidth();
        f7 = 0.125f;
        float f272 = width * f7;
        f10 = this.v;
        if (f10 != 1.0f) {
        }
        if (LocaleController.isRTL) {
        }
        max = Math.max(0.25f, this.v);
        f11 = 0.0f;
        float pullingLeftProgress3 = getPullingLeftProgress();
        float g102 = g();
        cpVar = this.d1;
        if (cpVar != null) {
        }
        float width22 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f11);
        float topOffset2 = getTopOffset();
        float paddingTop2 = getPaddingTop();
        ai.u1 u1Var32 = this.b;
        float f282 = f11;
        float f292 = max;
        RectF rectF52 = this.w;
        rectF52.set(getPaddingLeft() + width22, (((1.0f - this.q0) * u1Var32.getMeasuredHeight()) + paddingTop2) - g102, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g102);
        this.y = com.google.android.gms.internal.play_billing.k3.c(g102, 2.0f, rectF52.height() - topOffset2, 2.0f);
        if (i10 == 1) {
        }
        canvas2.restoreToCount(save4);
        if (this.c1) {
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
        i13 = save32;
        rectF2 = rectF;
        u1Var = u1Var32;
        i14 = i12;
        f16 = f252;
        if (!this.c1) {
        }
        float f3722 = f16;
        q6 = q();
        if (!q6) {
        }
        if (!LocaleController.isRTL) {
        }
        i14 = -1;
        canvas.translate((1.0f - this.v) * getWidth() * i14, 0.0f);
        u1Var.setTranslationX(-width22);
        super.dispatchDraw(canvas);
        if (!q6) {
        }
        canvas.restoreToCount(i13);
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
        ah.t0 t0Var = this.x0;
        if (t0Var != null) {
            t0Var.d();
        }
    }

    public final void f(float f7, float f10, float f11, int i10, Canvas canvas) {
        float f12;
        if (this.M0 == 1) {
            return;
        }
        canvas.save();
        boolean z10 = this.L;
        RectF rectF = this.w;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), bs.f.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f13 = rectF.bottom;
            bs bsVar = bs.f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f13, 0.0f, bsVar.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), bsVar.getInterpolation(this.O)));
        }
        float width = ((LocaleController.isRTL || this.M) ? this.G : getWidth() - this.G) + this.U0;
        float paddingTop = this.L ? getPaddingTop() - g() : (getHeight() - getPaddingBottom()) + g();
        int dp = AndroidUtilities.dp(3.0f);
        Drawable drawable = this.i0;
        drawable.setAlpha(i10);
        Paint paint = this.f;
        paint.setAlpha(i10);
        float f14 = width - f7;
        float f15 = dp;
        float f16 = f15 * f10;
        float f17 = paddingTop - f7;
        float f18 = width + f7;
        float f19 = paddingTop + f7;
        drawable.setBounds((int) (f14 - f16), (int) (f17 - f16), (int) (f18 + f16), (int) (f16 + f19));
        drawable.draw(canvas);
        boolean r10 = this.g0.r();
        float f20 = paddingTop;
        RectF rectF2 = this.b0;
        if (r10) {
            rectF2.set(f14, f17, f18, f19);
            f12 = f7;
            this.g0.m(canvas, rectF2, f12, getX(), getY(), i10, false);
        } else {
            f12 = f7;
            if (this.X0 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(f14, f17, f18, f19);
                Rect rect = AndroidUtilities.rectTmp2;
                rectF3.round(rect);
                rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                this.X0.setBounds(rect);
                this.X0.setAlpha(paint.getAlpha());
                this.X0.draw(canvas);
            } else {
                canvas.drawCircle(width, f20, f12, paint);
            }
        }
        boolean z11 = LocaleController.isRTL;
        float f21 = this.E;
        float width2 = this.U0 + this.V0 + ((z11 || this.M) ? this.G - f21 : (getWidth() - this.G) + f21);
        boolean z12 = this.L;
        float f22 = this.F;
        float lerp = AndroidUtilities.lerp(z12 ? (getPaddingTop() - g()) - AndroidUtilities.dp(16.0f) : ((getHeight() - f22) - f15) + g(), (f22 + f15) - g(), bs.f.getInterpolation(this.O));
        float f23 = (-AndroidUtilities.dp(1.0f)) * f10;
        drawable.setBounds((int) ((width2 - f12) - f23), (int) ((lerp - f12) - f23), (int) (width2 + f12 + f23), (int) (f12 + lerp + f23));
        drawable.draw(canvas);
        if (this.g0.r()) {
            rectF2.set(width2 - f11, lerp - f11, width2 + f11, lerp + f11);
            this.g0.m(canvas, rectF2, f11, getX(), getY(), i10, false);
        } else if (this.Y0 != null) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(width2 - f11, lerp - f11, width2 + f11, lerp + f11);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rectF4.round(rect2);
            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
            this.Y0.setBounds(rect2);
            this.Y0.setAlpha(paint.getAlpha());
            this.Y0.draw(canvas);
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

    public bl0 getDelegate() {
        return this.g0;
    }

    public int getHintTextWidth() {
        return this.S0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.T.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.clamp(this.B0 / AndroidUtilities.dp(42.0f), 2.0f, 0.0f);
    }

    public ah.t0 getReactionsWindow() {
        return this.x0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f7;
        HashSet hashSet = this.d0;
        if (hashSet.isEmpty()) {
            return "";
        }
        ah.i1 i1Var = (ah.i1) hashSet.iterator().next();
        long j10 = i1Var.g;
        String str = null;
        if (j10 != 0 && (f7 = r5.f(this.J, j10)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = i1Var.f;
        }
        return TextUtils.isEmpty(str) ? "👍" : str;
    }

    public HashSet<ah.i1> getSelectedReactions() {
        return this.d0;
    }

    public float getTopOffset() {
        if (this.Q0) {
            return ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (q()) {
            return (AndroidUtilities.dp(36.0f) * itemsCount) - AndroidUtilities.dp(4.0f);
        }
        return AndroidUtilities.dp(16.0f) + com.google.android.gms.internal.play_billing.k3.v(itemsCount, 1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(36.0f) * itemsCount);
    }

    public List<ah.i1> getVisibleReactionsList() {
        return this.T;
    }

    public int getWindowType() {
        int i10 = this.M0;
        if (i10 == 4) {
            return 13;
        }
        if (i10 == 3) {
            return 11;
        }
        if (i10 == 5) {
            return 14;
        }
        return this.F0 ? 8 : 1;
    }

    public View getWindowView() {
        ah.t0 t0Var = this.x0;
        if (t0Var == null) {
            return null;
        }
        return t0Var.c;
    }

    public final void h(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.M0;
        if (i11 == 4) {
            Iterator it = this.d0.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                ah.i1 i1Var = (ah.i1) it.next();
                if (!hashSet.contains(i1Var)) {
                    hashSet.add(i1Var);
                    arrayList.add(i1Var);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.J).getEnabledReactionsList();
            while (i10 < enabledReactionsList.size()) {
                ah.i1 c10 = ah.i1.c(enabledReactionsList.get(i10));
                if (!hashSet.contains(c10)) {
                    hashSet.add(c10);
                    arrayList.add(c10);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
                i10++;
            }
            return;
        }
        if (!this.E0 || i11 == 4) {
            if (i11 != 3) {
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.J).getEnabledReactionsList();
                while (i10 < enabledReactionsList2.size()) {
                    arrayList.add(ah.i1.c(enabledReactionsList2.get(i10)));
                    i10++;
                }
                return;
            }
            ArrayList<TLRPC.Reaction> savedReactions = MediaDataController.getInstance(this.J).getSavedReactions();
            int i13 = 0;
            while (i10 < savedReactions.size()) {
                ah.i1 d = ah.i1.d(savedReactions.get(i10));
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
            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.J).getAvailableEffects();
            if (availableEffects != null) {
                while (i10 < availableEffects.effects.size()) {
                    ah.i1 e = ah.i1.e(availableEffects.effects.get(i10));
                    if (!hashSet.contains(e)) {
                        hashSet.add(e);
                        arrayList.add(e);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        ArrayList<TLRPC.Reaction> savedReactions2 = i11 == 3 ? MediaDataController.getInstance(this.J).getSavedReactions() : MediaDataController.getInstance(this.J).getTopReactions();
        if (i11 == 3) {
            TLRPC.TL_messages_savedReactionsTags savedReactionTags = MessagesController.getInstance(this.J).getSavedReactionTags(0L);
            if (savedReactionTags != null) {
                for (int i14 = 0; i14 < savedReactionTags.tags.size(); i14++) {
                    ah.i1 d10 = ah.i1.d(savedReactionTags.tags.get(i14).reaction);
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            }
            for (int i15 = 0; i15 < savedReactions2.size(); i15++) {
                ah.i1 d11 = ah.i1.d(savedReactions2.get(i15));
                if (!hashSet.contains(d11)) {
                    hashSet.add(d11);
                    arrayList.add(d11);
                }
            }
        } else {
            for (int i16 = 0; i16 < savedReactions2.size(); i16++) {
                ah.i1 d12 = ah.i1.d(savedReactions2.get(i16));
                if (!hashSet.contains(d12) && (i11 == 3 || UserConfig.getInstance(this.J).isPremium() || d12.g == 0)) {
                    hashSet.add(d12);
                    arrayList.add(d12);
                }
            }
        }
        if (i11 != 3 || UserConfig.getInstance(this.J).isPremium()) {
            ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.J).getRecentReactions();
            for (int i17 = 0; i17 < recentReactions.size(); i17++) {
                ah.i1 d13 = ah.i1.d(recentReactions.get(i17));
                if (!hashSet.contains(d13)) {
                    hashSet.add(d13);
                    arrayList.add(d13);
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList3 = MediaDataController.getInstance(this.J).getEnabledReactionsList();
            while (i10 < enabledReactionsList3.size()) {
                ah.i1 c11 = ah.i1.c(enabledReactionsList3.get(i10));
                if (!hashSet.contains(c11)) {
                    hashSet.add(c11);
                    arrayList.add(c11);
                }
                i10++;
            }
        }
    }

    public void j() {
        int i10 = 0;
        while (true) {
            ai.u1 u1Var = this.b;
            if (i10 >= u1Var.getChildCount()) {
                return;
            }
            View childAt = u1Var.getChildAt(i10);
            if (childAt instanceof al0) {
                ((al0) childAt).b.invalidate();
            }
            i10++;
        }
    }

    public final void k() {
        int dp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G8, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, x02, 0, tileMode));
        this.n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, x02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, ah.i1 i1Var, boolean z10) {
        bl0 bl0Var = this.g0;
        if (bl0Var != null) {
            bl0Var.l(view, i1Var, z10, true);
        }
        if (this.M0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void n() {
        this.O0 = true;
        this.m0 = 0;
        this.n0 = 0.0f;
        this.B0 = 0.0f;
        this.l0 = null;
        this.r0 = false;
        ok0 ok0Var = new ok0(this, 1);
        ai.u1 u1Var = this.b;
        AndroidUtilities.forEachViews((RecyclerView) u1Var, (Utilities.Callback<View>) ok0Var);
        this.C0.clear();
        u1Var.invalidate();
        ah.v vVar = this.S;
        if (vVar != null) {
            vVar.invalidate();
        }
        invalidate();
    }

    public final void o(bh.b bVar, eh.e eVar) {
        this.Z0 = bVar;
        this.a1 = eVar;
        dh.d c10 = bVar.c(this, null, true);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(24.0f));
        c10.p(AndroidUtilities.dp(8.0f));
        this.W0 = c10;
        dh.d c11 = bVar.c(this, null, true);
        c11.o(eVar);
        c11.q(AndroidUtilities.dp(8.0f));
        c11.p(AndroidUtilities.dp(8.0f));
        this.X0 = c11;
        dh.d c12 = bVar.c(this, null, true);
        c12.o(eVar);
        c12.q(AndroidUtilities.dp(4.0f));
        c12.p(AndroidUtilities.dp(8.0f));
        this.Y0 = c12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.J).addObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.M0 == 5) {
            NotificationCenter.getInstance(this.J).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.J).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.M0 == 5) {
            NotificationCenter.getInstance(this.J).removeObserver(this, NotificationCenter.availableEffectsUpdate);
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
        this.H = messageObject;
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
        int i12 = this.M0;
        this.I = i12 == 0 && this.H != null && i10 >= MessagesController.getInstance(this.J).getChatMaxUniqReactions(this.H.getDialogId());
        this.A0 = i12 == 0 && this.H != null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.J).getChat(Long.valueOf(-this.H.getDialogId())));
        ArrayList arrayList2 = new ArrayList();
        if (messageObject != null && messageObject.isForwardedChannelPost() && (chatFull = MessagesController.getInstance(this.J).getChatFull(-messageObject.getFromChatId())) == null) {
            this.K = -messageObject.getFromChatId();
            MessagesController.getInstance(this.J).loadFullChat(-messageObject.getFromChatId(), 0, true);
            setVisibility(4);
            return;
        }
        this.c0 = false;
        if (i12 == 3) {
            this.E0 = UserConfig.getInstance(this.J).isPremium();
            h(arrayList2);
        } else if (i12 == 5) {
            this.E0 = true;
            h(arrayList2);
        } else if (this.I) {
            this.E0 = false;
            if (chatFull != null && chatFull.paid_reactions_available) {
                this.c0 = true;
                ah.i1 i1Var = new ah.i1();
                i1Var.a = true;
                arrayList2.add(i1Var);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.H.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i13);
                i13++;
                arrayList2.add(ah.i1.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.c0 = true;
                ah.i1 i1Var2 = new ah.i1();
                i1Var2.a = true;
                arrayList2.add(i1Var2);
            }
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat chat = MessagesController.getInstance(this.J).getChat(Long.valueOf(chatFull.id));
                if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
                    this.E0 = false;
                } else {
                    this.E0 = true;
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
                    Iterator<TLRPC.TL_availableReaction> it = MediaDataController.getInstance(this.J).getEnabledReactionsList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TLRPC.TL_availableReaction next = it.next();
                            if (!(reaction2 instanceof TLRPC.TL_reactionEmoji) || !next.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    arrayList2.add(ah.i1.d(reaction2));
                                    break;
                                }
                            } else {
                                arrayList2.add(ah.i1.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.E0 = true;
            h(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i15))) {
                i15--;
                arrayList2.remove(i15);
            } else {
                hashSet.add((ah.i1) arrayList2.get(i15));
            }
            i15++;
        }
        this.F0 = !this.I && ((!this.E0 && arrayList2.size() > 16) || (this.E0 && !UserConfig.getInstance(this.J).isPremium() && MessagesController.getInstance(this.J).premiumFeaturesBlocked()));
        if (i12 == 3 && !UserConfig.getInstance(this.J).isPremium()) {
            this.F0 = false;
        }
        if (i12 == 4) {
            this.F0 = true;
        }
        ArrayList arrayList5 = this.T;
        arrayList5.clear();
        if (q()) {
            int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) / AndroidUtilities.dp(34.0f);
            if (dp > 7) {
                dp = 7;
            }
            int i16 = 0;
            if (dp < 1) {
                dp = 1;
            }
            while (i16 < Math.min(arrayList2.size(), dp)) {
                arrayList5.add((ah.i1) arrayList2.get(i16));
                i16++;
            }
            if (i16 < arrayList2.size()) {
                al0.a(this.z0, (ah.i1) arrayList2.get(i16), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.G0 = true;
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (((ah.i1) arrayList5.get(i17)).g != 0) {
                this.G0 = false;
            }
        }
        ArrayList arrayList6 = this.V;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        sk0 sk0Var = this.a0;
        cl0 cl0Var = sk0Var.d;
        ArrayList arrayList7 = cl0Var.e;
        ArrayList arrayList8 = cl0Var.T;
        ArrayList arrayList9 = cl0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i18 = 0; i18 < arrayList8.size(); i18++) {
            ah.i1 i1Var3 = (ah.i1) arrayList8.get(i18);
            arrayList9.add(new tk0(i1Var3.f == null ? 3 : 0, i1Var3));
        }
        if (!cl0Var.U.isEmpty() && !MessagesController.getInstance(cl0Var.J).premiumFeaturesBlocked()) {
            arrayList9.add(new tk0(1, null));
        }
        if (cl0Var.q()) {
            arrayList9.add(new tk0(2, null));
        }
        if (z10) {
            sk0Var.E(arrayList7, arrayList9);
        } else {
            sk0Var.l();
        }
        if (messageObject == null || (tL_messageReactions = messageObject.messageOwner.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i19 = 0; i19 < messageObject.messageOwner.reactions.results.size(); i19++) {
            if (messageObject.messageOwner.reactions.results.get(i19).chosen) {
                this.d0.add(ah.i1.d(messageObject.messageOwner.reactions.results.get(i19).reaction));
            }
        }
    }

    public final boolean q() {
        return this.E0 || this.F0;
    }

    public final void r(boolean z10) {
        ObjectAnimator duration;
        this.K0 = z10;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.L0.lock();
        boolean deviceIsHigh = SharedConfig.deviceIsHigh();
        org.telegram.ui.Cells.d1 d1Var = k1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, d1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, d1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new ei.k5(this, 1));
        duration.start();
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        if (getAlpha() != f7 && f7 == 0.0f) {
            this.C0.clear();
            int i10 = 0;
            while (true) {
                ai.u1 u1Var = this.b;
                if (i10 >= u1Var.getChildCount()) {
                    break;
                }
                if (u1Var.getChildAt(i10) instanceof al0) {
                    ((al0) u1Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f7);
    }

    public void setBubbleOffset(float f7) {
        this.U0 = f7;
    }

    public void setChatScrimView(cp cpVar) {
        this.d1 = cpVar;
    }

    public void setCurrentAccount(int i10) {
        this.J = i10;
    }

    public void setCustomEmojiEnterProgress(float f7) {
        this.w0 = f7;
        cp cpVar = this.d1;
        if (cpVar != null) {
            cpVar.setPopupAlpha(1.0f - f7);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            this.v0.setBackground(org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(28.0f), 0, i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false), 40)));
        } else {
            this.v0.setBackground(null);
        }
    }

    public void setDelegate(bl0 bl0Var) {
        this.g0 = bl0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        this.t0 = n2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.Q0 = true;
        if (this.R0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.d6 d6Var = this.k0;
            x90 x90Var = new x90(context, d6Var);
            this.R0 = x90Var;
            x90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.R0.setClickable(true);
            this.R0.setTextSize(1, 12.0f);
            int i10 = this.M0;
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                this.R0.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
                this.R0.setAlpha(0.5f);
            } else {
                this.R0.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var));
            }
            this.R0.setGravity(1);
            addView(this.R0, w7.z5.a(-2.0f, 0.0f, 6.0f, 0.0f, 0.0f, -1, 0));
        }
        this.R0.setText(charSequence);
        this.e1 = false;
        ((FrameLayout.LayoutParams) this.z0.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
    }

    public void setMiniBubblesOffset(float f7) {
        this.V0 = f7;
    }

    public void setMirrorX(boolean z10) {
        this.M = z10;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.P0 = runnable;
    }

    public void setParentLayout(cp cpVar) {
        this.J0 = cpVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            ah.i1 b10 = ah.i1.b(str);
            hashSet.add(b10);
            this.e0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new ok0(this, 0));
    }

    public void setSelectedReaction(ah.i1 i1Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (i1Var != null) {
            hashSet.add(i1Var);
        }
        this.a0.l();
    }

    public void setSelectedReactionAnimated(ah.i1 i1Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (i1Var != null) {
            hashSet.add(i1Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new ok0(this, 0));
    }

    public void setSelectedReactionInclusive(ah.i1 i1Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (i1Var != null) {
            hashSet.add(i1Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new ok0(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.d0;
        hashSet.clear();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = arrayList.get(i10);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        hashSet.add(ah.i1.d(messageObject.messageOwner.reactions.results.get(i11).reaction));
                    }
                }
            }
        }
        this.a0.l();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new ok0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.c1 != z10) {
            this.c1 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    ai.u1 u1Var = this.b;
                    if (i10 >= u1Var.getChildCount()) {
                        break;
                    }
                    if (u1Var.getChildAt(i10) instanceof al0) {
                        al0 al0Var = (al0) u1Var.getChildAt(i10);
                        boolean z11 = al0Var.r;
                        zk0 zk0Var = al0Var.b;
                        if (z11 && (zk0Var.getImageReceiver().getLottieAnimation() != null || zk0Var.getImageReceiver().getAnimation() != null)) {
                            zk0Var.setVisibility(0);
                            al0Var.a.setVisibility(4);
                            if (al0Var.s) {
                                al0Var.v = true;
                            }
                        }
                        al0Var.invalidate();
                    }
                    i10++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(ah.i1.d(reaction));
        }
        this.a0.l();
    }

    public void setTop(boolean z10) {
        this.L = z10;
    }

    public void setTransitionProgress(float f7) {
        this.v = f7;
        cp cpVar = this.J0;
        if (cpVar != null) {
            if (!this.K0 || !SharedConfig.deviceIsHigh()) {
                f7 = 1.0f;
            }
            cpVar.setReactionsTransitionProgress(f7);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        if (f7 != getTranslationX()) {
            super.setTranslationX(f7);
        }
    }

    public void m() {
    }
}
