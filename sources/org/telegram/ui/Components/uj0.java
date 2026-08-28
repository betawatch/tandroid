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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class uj0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Cells.c1 g1 = new org.telegram.ui.Cells.c1(Float.class, "transitionProgress", 2);
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
    public io F0;
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
    public l80 N0;
    public fh.v O;
    public int O0;
    public final ArrayList P;
    public int P0;
    public final ArrayList Q;
    public float Q0;
    public final ArrayList R;
    public float R0;
    public final of.g0 S;
    public kg.d S0;
    public final kj0 T;
    public kg.d T0;
    public final RectF U;
    public kg.d U0;
    public boolean V;
    public ig.a V0;
    public final HashSet W;
    public lg.d W0;
    public boolean X0;
    public boolean Y0;
    public io Z0;
    public boolean a;
    public final HashSet a0;
    public boolean a1;
    public final gh.f1 b;
    public final int[] b0;
    public boolean b1;
    public final float c;
    public tj0 c0;
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
    public final org.telegram.ui.ActionBar.b6 g0;
    public final Paint h;
    public hg.r0 h0;
    public int i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public final Paint n;
    public boolean n0;
    public long o0;
    public org.telegram.ui.ActionBar.o2 p0;
    public zf.b1 q0;
    public float r;
    public ir r0;
    public float s;
    public float s0;
    public hg.e0 t0;
    public ValueAnimator u0;
    public float v;
    public final sj0 v0;
    public final RectF w;
    public boolean w0;
    public final Path x;
    public float x0;
    public float y;
    public final HashSet y0;
    public final HashSet z0;

    public uj0(int i9, int i10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
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
        this.I0 = i9;
        this.c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var));
        paint3.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Jj, b6Var));
        this.g0 = b6Var;
        this.F = i10;
        this.p0 = o2Var;
        sj0 sj0Var = new sj0(this, context);
        this.v0 = sj0Var;
        sj0Var.setVisibility(8);
        sj0Var.K = false;
        sj0Var.c.setVisibility(8);
        addView(sj0Var);
        this.f0 = SharedConfig.animationsEnabled() && SharedConfig.getDevicePerformanceClass() != 0;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.e0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Td, false), PorterDuff.Mode.MULTIPLY));
        gh.f1 f1Var = new gh.f1(this, context, 18);
        this.b = f1Var;
        f1Var.setClipChildren(false);
        f1Var.setClipToPadding(false);
        of.g0 g0Var = new of.g0((ViewGroup) this, 4);
        this.S = g0Var;
        f1Var.i(new hj0(this, 0));
        f1Var.setLayoutManager(g0Var);
        f1Var.setOverScrollMode(2);
        kj0 kj0Var = new kj0(this);
        this.T = kj0Var;
        f1Var.setAdapter(kj0Var);
        f1Var.j(new oj0(this));
        f1Var.j(new kn(this, 8));
        f1Var.i(new hj0(this, 1));
        f1Var.setOnItemClickListener(new j(this, 11));
        f1Var.setOnItemLongClickListener((ok0) new bg.x2(this, i9, 7));
        addView(f1Var, g7.e6.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (f1Var.getLayoutParams().height - f1Var.getPaddingTop()) - f1Var.getPaddingBottom();
        sj0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        sj0Var.getLayoutParams().height = paddingTop;
        if (i9 == 2 || i9 == 4) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var));
        }
        MediaDataController.getInstance(i10).preloadDefaultReactions();
    }

    public static void a(uj0 uj0Var) {
        if (uj0Var.t0 != null) {
            return;
        }
        hg.e0 e0Var = new hg.e0(uj0Var.I0, uj0Var.p0, uj0Var.R, uj0Var.W, uj0Var, uj0Var.g0, uj0Var.a);
        uj0Var.t0 = e0Var;
        ig.a aVar = uj0Var.V0;
        boolean z10 = true;
        if (aVar != null) {
            lg.d dVar = uj0Var.W0;
            org.telegram.ui.s41 s41Var = e0Var.m.b0;
            s41Var.x = true;
            s41Var.setBackground(null);
            s41Var.d();
            s41Var.invalidate();
            kg.d c10 = aVar.c(e0Var.a, null, true);
            c10.n(dVar);
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            e0Var.z = c10;
        }
        hg.e0 e0Var2 = uj0Var.t0;
        tj0 tj0Var = uj0Var.c0;
        if (tj0Var != null && !tj0Var.n()) {
            z10 = false;
        }
        e0Var2.m.setLongPressEnabled(z10);
        uj0Var.j();
        uj0Var.t0.p = new ib0(uj0Var, 16);
        uj0Var.m();
    }

    public static void b(uj0 uj0Var, View view, float f10) {
        if (view instanceof sj0) {
            ((sj0) view).h = f10;
        } else {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public static boolean c() {
        return SharedConfig.deviceIsHigh();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        int i9 = 0;
        boolean z10 = true;
        while (i9 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i9);
            hashSet.clear();
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < messageObject.messageOwner.reactions.results.size(); i10++) {
                    if (messageObject.messageOwner.reactions.results.get(i10).chosen) {
                        hg.r0 d = hg.r0.d(messageObject.messageOwner.reactions.results.get(i10).reaction);
                        if (z10 || longSparseArray.indexOfKey(d.h) >= 0) {
                            hashSet.add(Long.valueOf(d.h));
                            longSparseArray.put(d.h, d);
                        }
                    }
                }
            }
            int i11 = 0;
            while (i11 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i11)))) {
                    longSparseArray.removeAt(i11);
                    i11--;
                }
                i11++;
            }
            i9++;
            z10 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
            if (longSparseArray.valueAt(i12) != null) {
                hashSet2.add((hg.r0) longSparseArray.valueAt(i12));
            }
        }
        return hashSet2;
    }

    public final void d() {
        hg.e0 e0Var = this.t0;
        if (e0Var != null) {
            if (!e0Var.q) {
                e0Var.q = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                int i9 = 0;
                ofFloat.addUpdateListener(new hg.x(e0Var, i9));
                ofFloat.addListener(new hg.c0(e0Var, i9));
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
            this.t0 = null;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id != this.G || getVisibility() == 0 || (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                return;
            }
            p(this.D, null, true);
            setVisibility(0);
            r(false);
            return;
        }
        if (i9 != NotificationCenter.emojiLoaded) {
            if (i9 == NotificationCenter.availableEffectsUpdate) {
                p(this.D, null, true);
            }
        } else {
            if (this.I0 != 4) {
                return;
            }
            invalidate();
            gh.f1 f1Var = this.b;
            f1Var.invalidate();
            f1Var.f1();
            for (int i11 = 0; i11 < f1Var.getChildCount(); i11++) {
                View childAt = f1Var.getChildAt(i11);
                if (childAt instanceof sj0) {
                    sj0 sj0Var = (sj0) childAt;
                    sj0Var.a.invalidate();
                    sj0Var.b.invalidate();
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
        l80 l80Var;
        hg.r0 r0Var;
        int i9;
        hg.r0 r0Var2;
        float width;
        float f10;
        float f11;
        float max;
        float f12;
        io ioVar;
        float f13;
        int i10;
        float f14;
        RectF rectF;
        float f15;
        float f16;
        int i11;
        RectF rectF2;
        gh.f1 f1Var;
        float f17;
        boolean q10;
        RectF rectF3;
        int i12;
        RectF rectF4;
        int i13;
        gh.f1 f1Var2;
        float f18;
        int R;
        float f19;
        float f20;
        float x10;
        float scaleX;
        float f21;
        float f22;
        k5 k5Var;
        ih.z2 z2Var;
        int i14;
        int i15;
        tj0 tj0Var;
        float f23;
        Canvas canvas2 = canvas;
        long min = Math.min(16L, System.currentTimeMillis() - this.L);
        this.L = System.currentTimeMillis();
        boolean z10 = this.J;
        if (z10) {
            float f24 = this.K;
            if (f24 != 1.0f) {
                this.K = Math.min(1.0f, (min / 220.0f) + f24);
                invalidate();
                l80Var = this.N0;
                if (l80Var != null) {
                    l80Var.setTranslationY(-g());
                }
                float max2 = (Math.max(0.25f, Math.min(this.v, 1.0f)) - 0.25f) / 0.75f;
                float f25 = this.A * max2;
                float f26 = this.B * max2;
                HashSet hashSet = this.z0;
                hashSet.clear();
                HashSet hashSet2 = this.y0;
                hashSet.addAll(hashSet2);
                hashSet2.clear();
                if (this.X0) {
                    invalidate();
                }
                r0Var = this.h0;
                i9 = this.I0;
                if (r0Var != null && i9 != 5 && ((tj0Var = this.c0) == null || tj0Var.n())) {
                    f23 = this.j0;
                    if (f23 != 1.0f) {
                        float longPressTimeout = (16.0f / (this.h0.a ? ViewConfiguration.getLongPressTimeout() : 1500.0f)) + f23;
                        this.j0 = longPressTimeout;
                        if (longPressTimeout >= 1.0f) {
                            this.j0 = 1.0f;
                        }
                        invalidate();
                    }
                }
                r0Var2 = this.h0;
                if (r0Var2 == null && r0Var2.a) {
                    this.l0 = 1.0f;
                    this.m0 = 1.0f;
                } else {
                    float f27 = this.j0;
                    this.l0 = (f27 * 2.0f) + 1.0f;
                    this.m0 = 1.0f - (f27 * 0.15f);
                }
                int save = canvas2.save();
                if (!LocaleController.isRTL || this.I) {
                    width = getWidth();
                    f10 = 0.125f;
                } else {
                    width = getWidth();
                    f10 = 0.875f;
                }
                float f28 = width * f10;
                f11 = this.v;
                if (f11 != 1.0f) {
                    canvas2.scale(f11, f11, f28, getHeight() / 2.0f);
                }
                if (!LocaleController.isRTL || this.I) {
                    max = Math.max(0.25f, this.v);
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f - Math.max(0.25f, this.v);
                    max = 1.0f;
                }
                float pullingLeftProgress = getPullingLeftProgress();
                float g10 = g();
                ioVar = this.Z0;
                if (ioVar != null) {
                    ioVar.setExpandSize(g10);
                }
                float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f12);
                float topOffset = getTopOffset();
                float paddingTop = getPaddingTop();
                gh.f1 f1Var3 = this.b;
                float f29 = f12;
                float f30 = max;
                RectF rectF5 = this.w;
                rectF5.set(getPaddingLeft() + width2, (((1.0f - this.m0) * f1Var3.getMeasuredHeight()) + paddingTop) - g10, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g10);
                this.y = e2.c.d(g10, 2.0f, rectF5.height() - topOffset, 2.0f);
                if (i9 == 1) {
                    f13 = 255.0f;
                    int clamp = (int) (Utilities.clamp(1.0f - (this.s0 / 0.05f), 1.0f, 0.0f) * 255.0f);
                    Drawable drawable = this.e0;
                    drawable.setAlpha(clamp);
                    float paddingLeft = getPaddingLeft();
                    int width3 = getWidth() - getPaddingRight();
                    Rect rect = this.d0;
                    int i16 = (int) g10;
                    drawable.setBounds((int) ((((width3 + rect.right) * f29) + paddingLeft) - rect.left), (getPaddingTop() - rect.top) - i16, (int) (((getWidth() - getPaddingRight()) + rect.right) * f30), (getHeight() - getPaddingBottom()) + rect.bottom + i16);
                    if (this.S0 == null) {
                        drawable.draw(canvas2);
                    }
                } else {
                    f13 = 255.0f;
                }
                canvas2.restoreToCount(save);
                if (this.Y0) {
                    int save2 = canvas2.save();
                    float f31 = this.v;
                    if (f31 != 1.0f) {
                        f15 = 2.0f;
                        canvas2.scale(f31, f31, f28, getHeight() / 2.0f);
                    } else {
                        f15 = 2.0f;
                    }
                    if (i9 == 1 || this.c0.u()) {
                        i14 = save2;
                        i10 = i9;
                        rectF = rectF5;
                        f14 = f28;
                        i15 = 1;
                        this.c0.s(canvas, rectF, this.y, getX(), getY(), 255, false);
                        canvas2 = canvas;
                    } else {
                        kg.d dVar = this.S0;
                        Paint paint = this.f;
                        if (dVar != null) {
                            Rect rect2 = AndroidUtilities.rectTmp2;
                            rectF5.round(rect2);
                            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                            this.S0.setBounds(rect2);
                            this.S0.setAlpha(paint.getAlpha());
                            this.S0.draw(canvas2);
                        } else {
                            float f32 = this.y;
                            canvas2.drawRoundRect(rectF5, f32, f32, paint);
                        }
                        i14 = save2;
                        i10 = i9;
                        f14 = f28;
                        rectF = rectF5;
                        i15 = 1;
                    }
                    if (this.V) {
                        Iterator it = this.W.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                float f33 = this.y;
                                float clamp01 = Utilities.clamp01(1.0f - getPullingLeftProgress());
                                if (this.d1 == null) {
                                    this.d1 = new Paint(i15);
                                }
                                if (this.e1 == null) {
                                    this.e1 = new Matrix();
                                }
                                if (this.f1 == null) {
                                    int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Jj, this.g0);
                                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{v02, org.telegram.ui.ActionBar.f6.l1(0.0f, v02)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                    this.f1 = linearGradient;
                                    this.d1.setShader(linearGradient);
                                }
                                this.e1.reset();
                                this.e1.postTranslate(rectF.left, rectF.top);
                                this.f1.setLocalMatrix(this.e1);
                                this.d1.setAlpha((int) (clamp01 * f13));
                                canvas2.drawRoundRect(rectF, f33, f33, this.d1);
                            } else if (((hg.r0) it.next()).a) {
                                break;
                            }
                        }
                    }
                    canvas2.restoreToCount(i14);
                } else {
                    i10 = i9;
                    f14 = f28;
                    rectF = rectF5;
                    f15 = 2.0f;
                }
                Path path = this.x;
                path.rewind();
                float f34 = this.y;
                path.addRoundRect(rectF, f34, f34, Path.Direction.CW);
                int save3 = canvas2.save();
                f16 = this.v;
                if (f16 != 1.0f) {
                    canvas2.scale(f16, f16, f14, getHeight() / f15);
                }
                if (this.v != 0.0f) {
                    int i17 = i10;
                    if (getAlpha() == 1.0f || i17 == 5) {
                        int i18 = 0;
                        int i19 = 0;
                        int i20 = 0;
                        while (i18 < f1Var3.getChildCount()) {
                            View childAt = f1Var3.getChildAt(i18);
                            int abs = (this.v == 1.0f || !SharedConfig.deviceIsHigh()) ? i20 : (int) (Math.abs((((childAt.getMeasuredWidth() / f15) + childAt.getLeft()) / f1Var3.getMeasuredWidth()) - 0.8f) * 200.0f);
                            float f35 = f26;
                            if (childAt instanceof sj0) {
                                sj0 sj0Var = (sj0) f1Var3.getChildAt(i18);
                                i13 = i18;
                                if (this.x0 != 0.0f) {
                                    i12 = save3;
                                    f20 = AndroidUtilities.dp(46.0f) * Utilities.clamp(sj0Var.getLeft() / (getMeasuredWidth() - AndroidUtilities.dp(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress();
                                } else {
                                    i12 = save3;
                                    f20 = 0.0f;
                                }
                                hg.r0 r0Var3 = sj0Var.e;
                                rj0 rj0Var = sj0Var.a;
                                float f36 = f20;
                                rj0 rj0Var2 = sj0Var.b;
                                rj0 rj0Var3 = sj0Var.c;
                                rectF4 = rectF;
                                if (r0Var3.equals(this.h0)) {
                                    rj0 rj0Var4 = rj0Var2.getVisibility() == 0 ? rj0Var2 : rj0Var;
                                    sj0Var.setPivotX(sj0Var.getMeasuredWidth() >> 1);
                                    sj0Var.setPivotY(rj0Var4.getY() + rj0Var4.getMeasuredHeight());
                                    sj0Var.setScaleX(this.l0);
                                    sj0Var.setScaleY(this.l0);
                                    if (!this.n0) {
                                        if (this.M == null) {
                                            rj0Var3.setVisibility(0);
                                            rj0Var3.setAlpha(1.0f);
                                            if (rj0Var3.getImageReceiver().hasBitmapImage() || ((k5Var = rj0Var3.e) != null && (z2Var = k5Var.k) != null && z2Var.hasBitmapImage())) {
                                                rj0Var4.setAlpha(0.0f);
                                            }
                                            f22 = 1.0f;
                                        } else {
                                            f22 = 1.0f;
                                            rj0Var3.setAlpha(1.0f - this.k0);
                                            rj0Var4.setAlpha(this.k0);
                                        }
                                        if (this.j0 == f22) {
                                            this.n0 = true;
                                            if (System.currentTimeMillis() - this.o0 > 300) {
                                                this.o0 = System.currentTimeMillis();
                                                f1Var2 = f1Var3;
                                                this.c0.d(sj0Var, sj0Var.e, true, false);
                                                canvas2.save();
                                                x10 = sj0Var.getX() + f1Var2.getX();
                                                scaleX = ((sj0Var.getScaleX() * sj0Var.getMeasuredWidth()) - sj0Var.getMeasuredWidth()) / f15;
                                                f21 = x10 - scaleX;
                                                if (f21 >= 0.0f && sj0Var.getTranslationX() >= 0.0f) {
                                                    sj0Var.setTranslationX((-f21) - f36);
                                                } else if (sj0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth() || sj0Var.getTranslationX() > 0.0f) {
                                                    sj0Var.setTranslationX(0.0f - f36);
                                                } else {
                                                    sj0Var.setTranslationX((((getMeasuredWidth() - x10) - sj0Var.getMeasuredWidth()) - scaleX) - f36);
                                                }
                                                canvas2.translate(sj0Var.getX() + f1Var2.getX(), sj0Var.getY() + f1Var2.getY());
                                                canvas2.scale(sj0Var.getScaleX(), sj0Var.getScaleY(), sj0Var.getPivotX(), sj0Var.getPivotY());
                                                sj0Var.draw(canvas2);
                                                canvas2.restore();
                                            }
                                        }
                                    }
                                    f1Var2 = f1Var3;
                                    canvas2.save();
                                    x10 = sj0Var.getX() + f1Var2.getX();
                                    scaleX = ((sj0Var.getScaleX() * sj0Var.getMeasuredWidth()) - sj0Var.getMeasuredWidth()) / f15;
                                    f21 = x10 - scaleX;
                                    if (f21 >= 0.0f) {
                                    }
                                    if (sj0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth()) {
                                    }
                                    sj0Var.setTranslationX(0.0f - f36);
                                    canvas2.translate(sj0Var.getX() + f1Var2.getX(), sj0Var.getY() + f1Var2.getY());
                                    canvas2.scale(sj0Var.getScaleX(), sj0Var.getScaleY(), sj0Var.getPivotX(), sj0Var.getPivotY());
                                    sj0Var.draw(canvas2);
                                    canvas2.restore();
                                } else {
                                    f1Var2 = f1Var3;
                                    int R2 = RecyclerView.R(sj0Var);
                                    float measuredWidth = (((this.l0 - 1.0f) * sj0Var.getMeasuredWidth()) / 3.0f) - (((1.0f - this.m0) * sj0Var.getMeasuredWidth()) * (Math.abs(this.i0 - R2) - 1));
                                    if (R2 < this.i0) {
                                        sj0Var.setPivotX(0.0f);
                                        sj0Var.setTranslationX(-measuredWidth);
                                    } else {
                                        sj0Var.setPivotX(sj0Var.getMeasuredWidth() - f36);
                                        sj0Var.setTranslationX(measuredWidth - f36);
                                    }
                                    sj0Var.setPivotY(rj0Var.getY() + rj0Var.getMeasuredHeight());
                                    sj0Var.setScaleX(this.m0);
                                    sj0Var.setScaleY(this.m0);
                                    rj0Var3.setVisibility(4);
                                    rj0Var.setAlpha(1.0f);
                                }
                                if (childAt.getLeft() > i19) {
                                    i19 = childAt.getLeft();
                                }
                                if (!this.J0 && (!sj0Var.r || rj0Var.getImageReceiver().getLottieAnimation() != null)) {
                                    if ((sj0Var.getMeasuredWidth() / f15) + sj0Var.getX() > 0.0f && (sj0Var.getMeasuredWidth() / f15) + sj0Var.getX() < f1Var2.getWidth()) {
                                        if (!hashSet.contains(sj0Var)) {
                                            sj0Var.c(abs);
                                            abs += 30;
                                        }
                                        hashSet2.add(sj0Var);
                                    } else if (!sj0Var.n) {
                                        sj0Var.d();
                                    }
                                }
                            } else {
                                i12 = save3;
                                rectF4 = rectF;
                                i13 = i18;
                                f1Var2 = f1Var3;
                                if (childAt == this.N) {
                                    if ((childAt.getMeasuredWidth() / f15) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f15) + childAt.getX() >= f1Var2.getWidth()) {
                                        zf.b1 b1Var = this.q0;
                                        f18 = 0.0f;
                                        b1Var.setScaleX(0.0f);
                                        b1Var.setScaleY(0.0f);
                                        if (childAt == this.O) {
                                            if ((childAt.getMeasuredWidth() / f15) + childAt.getX() <= f18 || (childAt.getMeasuredWidth() / f15) + childAt.getX() >= f1Var2.getWidth()) {
                                                ir irVar = this.r0;
                                                irVar.setScaleX(0.0f);
                                                irVar.setScaleY(0.0f);
                                                ((uj0) irVar.c).O.invalidate();
                                                ValueAnimator valueAnimator = (ValueAnimator) irVar.b;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                            } else {
                                                if (!hashSet.contains(childAt)) {
                                                    if (this.v != 1.0f) {
                                                        ir irVar2 = this.r0;
                                                        irVar2.setScaleX(0.0f);
                                                        irVar2.setScaleY(0.0f);
                                                        ((uj0) irVar2.c).O.invalidate();
                                                        ValueAnimator valueAnimator2 = (ValueAnimator) irVar2.b;
                                                        if (valueAnimator2 != null) {
                                                            valueAnimator2.cancel();
                                                        }
                                                    }
                                                    ir irVar3 = this.r0;
                                                    boolean z11 = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || SharedConfig.getDevicePerformanceClass() >= 1;
                                                    irVar3.invalidate();
                                                    ValueAnimator valueAnimator3 = (ValueAnimator) irVar3.b;
                                                    if (valueAnimator3 != null) {
                                                        valueAnimator3.removeAllListeners();
                                                        ((ValueAnimator) irVar3.b).cancel();
                                                    }
                                                    if (z11) {
                                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(irVar3.getScaleX(), 1.0f);
                                                        irVar3.b = ofFloat;
                                                        ofFloat.setInterpolator(AndroidUtilities.overshootInterpolator);
                                                        ((ValueAnimator) irVar3.b).addUpdateListener(new q60(irVar3, 7));
                                                        ((ValueAnimator) irVar3.b).setStartDelay((long) (abs * ((uj0) irVar3.c).c));
                                                        ((ValueAnimator) irVar3.b).setDuration(300L);
                                                        ((ValueAnimator) irVar3.b).start();
                                                    } else {
                                                        irVar3.setScaleX(1.0f);
                                                        irVar3.setScaleY(1.0f);
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
                                                zf.b1 b1Var2 = this.q0;
                                                f19 = 0.0f;
                                                b1Var2.setScaleX(0.0f);
                                                b1Var2.setScaleY(0.0f);
                                            } else {
                                                f19 = 0.0f;
                                            }
                                            zf.b1 b1Var3 = this.q0;
                                            org.telegram.ui.Components.voip.h hVar = b1Var3.F;
                                            if (hVar != null) {
                                                hVar.g = f19;
                                                hVar.j = false;
                                            }
                                            b1Var3.invalidate();
                                            b1Var3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(abs).setInterpolator(AndroidUtilities.overshootInterpolator).setDuration(300L);
                                            abs += 30;
                                        }
                                        hashSet2.add(childAt);
                                    }
                                }
                                f18 = 0.0f;
                                if (childAt == this.O) {
                                }
                                R = RecyclerView.R(childAt);
                                float measuredWidth22 = (((this.l0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.m0) * childAt.getMeasuredWidth()) * (Math.abs(this.i0 - R) - 1));
                                if (R >= this.i0) {
                                }
                                childAt.setScaleX(this.m0);
                                childAt.setScaleY(this.m0);
                            }
                            i20 = abs;
                            i18 = i13 + 1;
                            canvas2 = canvas;
                            f26 = f35;
                            save3 = i12;
                            f1Var3 = f1Var2;
                            rectF = rectF4;
                        }
                        i11 = save3;
                        rectF2 = rectF;
                        f1Var = f1Var3;
                        f17 = f26;
                        sj0 sj0Var2 = this.v0;
                        if (pullingLeftProgress > 0.0f) {
                            float pullingLeftProgress2 = getPullingLeftProgress();
                            int measuredWidth3 = sj0Var2.getMeasuredWidth() - AndroidUtilities.dp(f15);
                            float f37 = i19 + measuredWidth3;
                            float clamp2 = Utilities.clamp(f37 / (getMeasuredWidth() - sj0Var2.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth3;
                            if (sj0Var2.getTag() == null) {
                                sj0Var2.setTag(Float.valueOf(1.0f));
                                sj0Var2.d();
                                sj0Var2.c(0);
                            }
                            float clamp3 = Utilities.clamp(pullingLeftProgress2, 1.0f, 0.0f);
                            sj0Var2.setScaleX(clamp3);
                            sj0Var2.setScaleY(clamp3);
                            sj0Var2.setTranslationX(((f1Var.getX() + f37) - clamp2) + (-((i17 == 1 || i17 == 2) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(20.0f))));
                            if (sj0Var2.getVisibility() != 0) {
                                sj0Var2.setVisibility(0);
                            }
                        } else {
                            if (sj0Var2.getVisibility() != 8 && this.K0) {
                                sj0Var2.setVisibility(8);
                            }
                            if (sj0Var2.getTag() != null) {
                                sj0Var2.setTag(null);
                            }
                        }
                        if (!this.Y0 && this.t0 != null) {
                            int y10 = (int) org.telegram.messenger.l0.y(1.0f, this.s0, Utilities.clamp(1.0f - (this.s0 / 0.2f), 1.0f, 0.0f), 255.0f);
                            canvas.save();
                            f(f25, max2, f17, y10, canvas);
                            canvas.restore();
                            return;
                        }
                        float f38 = f17;
                        q10 = q();
                        if (!q10) {
                            canvas.clipPath(path);
                        }
                        canvas.translate((1.0f - this.v) * getWidth() * ((!LocaleController.isRTL || this.I) ? -1 : 1), 0.0f);
                        f1Var.setTranslationX(-width2);
                        super.dispatchDraw(canvas);
                        if (!q10) {
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
                        canvas.restoreToCount(i11);
                        f(f25, max2, f38, 255, canvas);
                        invalidate();
                    }
                }
                i11 = save3;
                rectF2 = rectF;
                f1Var = f1Var3;
                f17 = f26;
                if (!this.Y0) {
                }
                float f382 = f17;
                q10 = q();
                if (!q10) {
                }
                canvas.translate((1.0f - this.v) * getWidth() * ((!LocaleController.isRTL || this.I) ? -1 : 1), 0.0f);
                f1Var.setTranslationX(-width2);
                super.dispatchDraw(canvas);
                if (!q10) {
                }
                canvas.restoreToCount(i11);
                f(f25, max2, f382, 255, canvas);
                invalidate();
            }
        }
        if (!z10) {
            float f39 = this.K;
            if (f39 != 0.0f) {
                this.K = Math.max(0.0f, f39 - (min / 220.0f));
                invalidate();
            }
        }
        l80Var = this.N0;
        if (l80Var != null) {
        }
        float max22 = (Math.max(0.25f, Math.min(this.v, 1.0f)) - 0.25f) / 0.75f;
        float f252 = this.A * max22;
        float f262 = this.B * max22;
        HashSet hashSet3 = this.z0;
        hashSet3.clear();
        HashSet hashSet22 = this.y0;
        hashSet3.addAll(hashSet22);
        hashSet22.clear();
        if (this.X0) {
        }
        r0Var = this.h0;
        i9 = this.I0;
        if (r0Var != null) {
            f23 = this.j0;
            if (f23 != 1.0f) {
            }
        }
        r0Var2 = this.h0;
        if (r0Var2 == null) {
        }
        float f272 = this.j0;
        this.l0 = (f272 * 2.0f) + 1.0f;
        this.m0 = 1.0f - (f272 * 0.15f);
        int save4 = canvas2.save();
        if (LocaleController.isRTL) {
        }
        width = getWidth();
        f10 = 0.125f;
        float f282 = width * f10;
        f11 = this.v;
        if (f11 != 1.0f) {
        }
        if (LocaleController.isRTL) {
        }
        max = Math.max(0.25f, this.v);
        f12 = 0.0f;
        float pullingLeftProgress3 = getPullingLeftProgress();
        float g102 = g();
        ioVar = this.Z0;
        if (ioVar != null) {
        }
        float width22 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f12);
        float topOffset2 = getTopOffset();
        float paddingTop2 = getPaddingTop();
        gh.f1 f1Var32 = this.b;
        float f292 = f12;
        float f302 = max;
        RectF rectF52 = this.w;
        rectF52.set(getPaddingLeft() + width22, (((1.0f - this.m0) * f1Var32.getMeasuredHeight()) + paddingTop2) - g102, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g102);
        this.y = e2.c.d(g102, 2.0f, rectF52.height() - topOffset2, 2.0f);
        if (i9 == 1) {
        }
        canvas2.restoreToCount(save4);
        if (this.Y0) {
        }
        Path path2 = this.x;
        path2.rewind();
        float f342 = this.y;
        path2.addRoundRect(rectF, f342, f342, Path.Direction.CW);
        int save32 = canvas2.save();
        f16 = this.v;
        if (f16 != 1.0f) {
        }
        if (this.v != 0.0f) {
        }
        i11 = save32;
        rectF2 = rectF;
        f1Var = f1Var32;
        f17 = f262;
        if (!this.Y0) {
        }
        float f3822 = f17;
        q10 = q();
        if (!q10) {
        }
        canvas.translate((1.0f - this.v) * getWidth() * ((!LocaleController.isRTL || this.I) ? -1 : 1), 0.0f);
        f1Var.setTranslationX(-width22);
        super.dispatchDraw(canvas);
        if (!q10) {
        }
        canvas.restoreToCount(i11);
        f(f252, max22, f3822, 255, canvas);
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
        hg.e0 e0Var = this.t0;
        if (e0Var != null) {
            e0Var.d();
        }
    }

    public final void f(float f10, float f11, float f12, int i9, Canvas canvas) {
        float f13;
        if (this.I0 == 1) {
            return;
        }
        canvas.save();
        boolean z10 = this.H;
        RectF rectF = this.w;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), gr.f.getInterpolation(this.K)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f14 = rectF.bottom;
            gr grVar = gr.f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f14, 0.0f, grVar.getInterpolation(this.K)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), grVar.getInterpolation(this.K)));
        }
        float width = ((LocaleController.isRTL || this.I) ? this.C : getWidth() - this.C) + this.Q0;
        float paddingTop = this.H ? getPaddingTop() - g() : (getHeight() - getPaddingBottom()) + g();
        int dp = AndroidUtilities.dp(3.0f);
        Drawable drawable = this.e0;
        drawable.setAlpha(i9);
        Paint paint = this.f;
        paint.setAlpha(i9);
        float f15 = width - f10;
        float f16 = dp;
        float f17 = f16 * f11;
        float f18 = paddingTop - f10;
        float f19 = width + f10;
        float f20 = paddingTop + f10;
        drawable.setBounds((int) (f15 - f17), (int) (f18 - f17), (int) (f19 + f17), (int) (f17 + f20));
        drawable.draw(canvas);
        boolean u10 = this.c0.u();
        float f21 = paddingTop;
        RectF rectF2 = this.U;
        if (u10) {
            rectF2.set(f15, f18, f19, f20);
            f13 = f10;
            this.c0.s(canvas, rectF2, f13, getX(), getY(), i9, false);
        } else {
            f13 = f10;
            if (this.T0 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(f15, f18, f19, f20);
                Rect rect = AndroidUtilities.rectTmp2;
                rectF3.round(rect);
                rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                this.T0.setBounds(rect);
                this.T0.setAlpha(paint.getAlpha());
                this.T0.draw(canvas);
            } else {
                canvas.drawCircle(width, f21, f13, paint);
            }
        }
        boolean z11 = LocaleController.isRTL;
        float f22 = this.A;
        float width2 = this.Q0 + this.R0 + ((z11 || this.I) ? this.C - f22 : (getWidth() - this.C) + f22);
        boolean z12 = this.H;
        float f23 = this.B;
        float lerp = AndroidUtilities.lerp(z12 ? (getPaddingTop() - g()) - AndroidUtilities.dp(16.0f) : ((getHeight() - f23) - f16) + g(), (f23 + f16) - g(), gr.f.getInterpolation(this.K));
        float f24 = (-AndroidUtilities.dp(1.0f)) * f11;
        drawable.setBounds((int) ((width2 - f13) - f24), (int) ((lerp - f13) - f24), (int) (width2 + f13 + f24), (int) (f13 + lerp + f24));
        drawable.draw(canvas);
        if (this.c0.u()) {
            rectF2.set(width2 - f12, lerp - f12, width2 + f12, lerp + f12);
            this.c0.s(canvas, rectF2, f12, getX(), getY(), i9, false);
        } else if (this.U0 != null) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(width2 - f12, lerp - f12, width2 + f12, lerp + f12);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rectF4.round(rect2);
            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
            this.U0.setBounds(rect2);
            this.U0.setAlpha(paint.getAlpha());
            this.U0.draw(canvas);
        } else {
            canvas.drawCircle(width2, lerp, f12, paint);
        }
        canvas.restore();
        drawable.setAlpha(255);
        paint.setAlpha(255);
    }

    public final float g() {
        return (int) (getPullingLeftProgress() * AndroidUtilities.dp(6.0f));
    }

    public tj0 getDelegate() {
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

    public hg.e0 getReactionsWindow() {
        return this.t0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f10;
        HashSet hashSet = this.W;
        if (hashSet.isEmpty()) {
            return "";
        }
        hg.r0 r0Var = (hg.r0) hashSet.iterator().next();
        long j10 = r0Var.g;
        String str = null;
        if (j10 != 0 && (f10 = k5.f(this.F, j10)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f10, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = r0Var.f;
        }
        return TextUtils.isEmpty(str) ? "👍" : str;
    }

    public HashSet<hg.r0> getSelectedReactions() {
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
        return AndroidUtilities.dp(16.0f) + e2.c.e(itemsCount, 1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(36.0f) * itemsCount);
    }

    public List<hg.r0> getVisibleReactionsList() {
        return this.P;
    }

    public int getWindowType() {
        int i9 = this.I0;
        if (i9 == 4) {
            return 13;
        }
        if (i9 == 3) {
            return 11;
        }
        if (i9 == 5) {
            return 14;
        }
        return this.B0 ? 8 : 1;
    }

    public View getWindowView() {
        hg.e0 e0Var = this.t0;
        if (e0Var == null) {
            return null;
        }
        return e0Var.c;
    }

    public final void h(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int i9 = 0;
        int i10 = this.I0;
        if (i10 == 4) {
            Iterator it = this.W.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                hg.r0 r0Var = (hg.r0) it.next();
                if (!hashSet.contains(r0Var)) {
                    hashSet.add(r0Var);
                    arrayList.add(r0Var);
                    i11++;
                    if (i11 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.F).getEnabledReactionsList();
            while (i9 < enabledReactionsList.size()) {
                hg.r0 c10 = hg.r0.c(enabledReactionsList.get(i9));
                if (!hashSet.contains(c10)) {
                    hashSet.add(c10);
                    arrayList.add(c10);
                    i11++;
                    if (i11 >= 8) {
                        return;
                    }
                }
                i9++;
            }
            return;
        }
        if (!this.A0 || i10 == 4) {
            if (i10 != 3) {
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.F).getEnabledReactionsList();
                while (i9 < enabledReactionsList2.size()) {
                    arrayList.add(hg.r0.c(enabledReactionsList2.get(i9)));
                    i9++;
                }
                return;
            }
            ArrayList<TLRPC.Reaction> savedReactions = MediaDataController.getInstance(this.F).getSavedReactions();
            int i12 = 0;
            while (i9 < savedReactions.size()) {
                hg.r0 d = hg.r0.d(savedReactions.get(i9));
                if (!hashSet.contains(d)) {
                    hashSet.add(d);
                    arrayList.add(d);
                    i12++;
                }
                if (i12 == 16) {
                    return;
                } else {
                    i9++;
                }
            }
            return;
        }
        if (i10 == 5) {
            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.F).getAvailableEffects();
            if (availableEffects != null) {
                while (i9 < availableEffects.effects.size()) {
                    hg.r0 e10 = hg.r0.e(availableEffects.effects.get(i9));
                    if (!hashSet.contains(e10)) {
                        hashSet.add(e10);
                        arrayList.add(e10);
                    }
                    i9++;
                }
                return;
            }
            return;
        }
        ArrayList<TLRPC.Reaction> savedReactions2 = i10 == 3 ? MediaDataController.getInstance(this.F).getSavedReactions() : MediaDataController.getInstance(this.F).getTopReactions();
        if (i10 == 3) {
            TLRPC.TL_messages_savedReactionsTags savedReactionTags = MessagesController.getInstance(this.F).getSavedReactionTags(0L);
            if (savedReactionTags != null) {
                for (int i13 = 0; i13 < savedReactionTags.tags.size(); i13++) {
                    hg.r0 d9 = hg.r0.d(savedReactionTags.tags.get(i13).reaction);
                    if (!hashSet.contains(d9)) {
                        hashSet.add(d9);
                        arrayList.add(d9);
                    }
                }
            }
            for (int i14 = 0; i14 < savedReactions2.size(); i14++) {
                hg.r0 d10 = hg.r0.d(savedReactions2.get(i14));
                if (!hashSet.contains(d10)) {
                    hashSet.add(d10);
                    arrayList.add(d10);
                }
            }
        } else {
            for (int i15 = 0; i15 < savedReactions2.size(); i15++) {
                hg.r0 d11 = hg.r0.d(savedReactions2.get(i15));
                if (!hashSet.contains(d11) && (i10 == 3 || UserConfig.getInstance(this.F).isPremium() || d11.g == 0)) {
                    hashSet.add(d11);
                    arrayList.add(d11);
                }
            }
        }
        if (i10 != 3 || UserConfig.getInstance(this.F).isPremium()) {
            ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.F).getRecentReactions();
            for (int i16 = 0; i16 < recentReactions.size(); i16++) {
                hg.r0 d12 = hg.r0.d(recentReactions.get(i16));
                if (!hashSet.contains(d12)) {
                    hashSet.add(d12);
                    arrayList.add(d12);
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList3 = MediaDataController.getInstance(this.F).getEnabledReactionsList();
            while (i9 < enabledReactionsList3.size()) {
                hg.r0 c11 = hg.r0.c(enabledReactionsList3.get(i9));
                if (!hashSet.contains(c11)) {
                    hashSet.add(c11);
                    arrayList.add(c11);
                }
                i9++;
            }
        }
    }

    public void j() {
        int i9 = 0;
        while (true) {
            gh.f1 f1Var = this.b;
            if (i9 >= f1Var.getChildCount()) {
                return;
            }
            View childAt = f1Var.getChildAt(i9);
            if (childAt instanceof sj0) {
                ((sj0) childAt).b.invalidate();
            }
            i9++;
        }
    }

    public final void k() {
        int dp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G8, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, w02, 0, tileMode));
        this.n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, w02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, hg.r0 r0Var, boolean z10) {
        tj0 tj0Var = this.c0;
        if (tj0Var != null) {
            tj0Var.d(view, r0Var, z10, true);
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
        gj0 gj0Var = new gj0(this, 1);
        gh.f1 f1Var = this.b;
        AndroidUtilities.forEachViews((RecyclerView) f1Var, (d5.d) gj0Var);
        this.y0.clear();
        f1Var.invalidate();
        fh.v vVar = this.O;
        if (vVar != null) {
            vVar.invalidate();
        }
        invalidate();
    }

    public final void o(ig.a aVar, lg.d dVar) {
        this.V0 = aVar;
        this.W0 = dVar;
        kg.d c10 = aVar.c(this, null, true);
        c10.n(dVar);
        c10.p(AndroidUtilities.dp(24.0f));
        c10.o(AndroidUtilities.dp(8.0f));
        this.S0 = c10;
        kg.d c11 = aVar.c(this, null, true);
        c11.n(dVar);
        c11.p(AndroidUtilities.dp(8.0f));
        c11.o(AndroidUtilities.dp(8.0f));
        this.T0 = c11;
        kg.d c12 = aVar.c(this, null, true);
        c12.n(dVar);
        c12.p(AndroidUtilities.dp(4.0f));
        c12.o(AndroidUtilities.dp(8.0f));
        this.U0 = c12;
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
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        k();
    }

    public final void p(MessageObject messageObject, TLRPC.ChatFull chatFull, boolean z10) {
        int i9;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.D = messageObject;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (tL_messageReactions2 = message.reactions) == null) {
            i9 = 0;
        } else {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i9 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i10);
                i10++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i9++;
                }
            }
        }
        int i11 = this.I0;
        this.E = i11 == 0 && this.D != null && i9 >= MessagesController.getInstance(this.F).getChatMaxUniqReactions(this.D.getDialogId());
        this.w0 = i11 == 0 && this.D != null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.F).getChat(Long.valueOf(-this.D.getDialogId())));
        ArrayList arrayList2 = new ArrayList();
        if (messageObject != null && messageObject.isForwardedChannelPost() && (chatFull = MessagesController.getInstance(this.F).getChatFull(-messageObject.getFromChatId())) == null) {
            this.G = -messageObject.getFromChatId();
            MessagesController.getInstance(this.F).loadFullChat(-messageObject.getFromChatId(), 0, true);
            setVisibility(4);
            return;
        }
        this.V = false;
        if (i11 == 3) {
            this.A0 = UserConfig.getInstance(this.F).isPremium();
            h(arrayList2);
        } else if (i11 == 5) {
            this.A0 = true;
            h(arrayList2);
        } else if (this.E) {
            this.A0 = false;
            if (chatFull != null && chatFull.paid_reactions_available) {
                this.V = true;
                hg.r0 r0Var = new hg.r0();
                r0Var.a = true;
                arrayList2.add(r0Var);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.D.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i12);
                i12++;
                arrayList2.add(hg.r0.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.V = true;
                hg.r0 r0Var2 = new hg.r0();
                r0Var2.a = true;
                arrayList2.add(r0Var2);
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
                int i13 = 0;
                while (i13 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i13);
                    i13++;
                    TLRPC.Reaction reaction2 = reaction;
                    Iterator<TLRPC.TL_availableReaction> it = MediaDataController.getInstance(this.F).getEnabledReactionsList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TLRPC.TL_availableReaction next = it.next();
                            if (!(reaction2 instanceof TLRPC.TL_reactionEmoji) || !next.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    arrayList2.add(hg.r0.d(reaction2));
                                    break;
                                }
                            } else {
                                arrayList2.add(hg.r0.d(reaction2));
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
        int i14 = 0;
        while (i14 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i14))) {
                i14--;
                arrayList2.remove(i14);
            } else {
                hashSet.add((hg.r0) arrayList2.get(i14));
            }
            i14++;
        }
        this.B0 = !this.E && ((!this.A0 && arrayList2.size() > 16) || (this.A0 && !UserConfig.getInstance(this.F).isPremium() && MessagesController.getInstance(this.F).premiumFeaturesBlocked()));
        if (i11 == 3 && !UserConfig.getInstance(this.F).isPremium()) {
            this.B0 = false;
        }
        if (i11 == 4) {
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
            int i15 = 0;
            while (i15 < Math.min(arrayList2.size(), dp)) {
                arrayList5.add((hg.r0) arrayList2.get(i15));
                i15++;
            }
            if (i15 < arrayList2.size()) {
                sj0.a(this.v0, (hg.r0) arrayList2.get(i15), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.C0 = true;
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (((hg.r0) arrayList5.get(i16)).g != 0) {
                this.C0 = false;
            }
        }
        ArrayList arrayList6 = this.R;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        kj0 kj0Var = this.T;
        uj0 uj0Var = kj0Var.d;
        ArrayList arrayList7 = uj0Var.e;
        ArrayList arrayList8 = uj0Var.P;
        ArrayList arrayList9 = uj0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i17 = 0; i17 < arrayList8.size(); i17++) {
            hg.r0 r0Var3 = (hg.r0) arrayList8.get(i17);
            arrayList9.add(new lj0(r0Var3.f == null ? 3 : 0, r0Var3));
        }
        if (!uj0Var.Q.isEmpty() && !MessagesController.getInstance(uj0Var.F).premiumFeaturesBlocked()) {
            arrayList9.add(new lj0(1, null));
        }
        if (uj0Var.q()) {
            arrayList9.add(new lj0(2, null));
        }
        if (z10) {
            kj0Var.E(arrayList7, arrayList9);
        } else {
            kj0Var.l();
        }
        if (messageObject == null || (tL_messageReactions = messageObject.messageOwner.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i18 = 0; i18 < messageObject.messageOwner.reactions.results.size(); i18++) {
            if (messageObject.messageOwner.reactions.results.get(i18).chosen) {
                this.W.add(hg.r0.d(messageObject.messageOwner.reactions.results.get(i18).reaction));
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
        org.telegram.ui.Cells.c1 c1Var = g1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, c1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, c1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new kh.l5(this, 1));
        duration.start();
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        if (getAlpha() != f10 && f10 == 0.0f) {
            this.y0.clear();
            int i9 = 0;
            while (true) {
                gh.f1 f1Var = this.b;
                if (i9 >= f1Var.getChildCount()) {
                    break;
                }
                if (f1Var.getChildAt(i9) instanceof sj0) {
                    ((sj0) f1Var.getChildAt(i9)).d();
                }
                i9++;
            }
        }
        super.setAlpha(f10);
    }

    public void setBubbleOffset(float f10) {
        this.Q0 = f10;
    }

    public void setChatScrimView(io ioVar) {
        this.Z0 = ioVar;
    }

    public void setCurrentAccount(int i9) {
        this.F = i9;
    }

    public void setCustomEmojiEnterProgress(float f10) {
        this.s0 = f10;
        io ioVar = this.Z0;
        if (ioVar != null) {
            ioVar.setPopupAlpha(1.0f - f10);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            this.r0.setBackground(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 40)));
        } else {
            this.r0.setBackground(null);
        }
    }

    public void setDelegate(tj0 tj0Var) {
        this.c0 = tj0Var;
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
            org.telegram.ui.ActionBar.b6 b6Var = this.g0;
            l80 l80Var = new l80(context, b6Var);
            this.N0 = l80Var;
            l80Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.N0.setClickable(true);
            this.N0.setTextSize(1, 12.0f);
            int i9 = this.I0;
            if (i9 == 1 || i9 == 2 || i9 == 4) {
                this.N0.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
                this.N0.setAlpha(0.5f);
            } else {
                this.N0.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, b6Var));
            }
            this.N0.setGravity(1);
            addView(this.N0, g7.e6.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.N0.setText(charSequence);
        this.a1 = false;
        ((FrameLayout.LayoutParams) this.v0.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
    }

    public void setMiniBubblesOffset(float f10) {
        this.R0 = f10;
    }

    public void setMirrorX(boolean z10) {
        this.I = z10;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.L0 = runnable;
    }

    public void setParentLayout(io ioVar) {
        this.F0 = ioVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.W;
        hashSet.clear();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            String str = arrayList.get(i9);
            i9++;
            hg.r0 b10 = hg.r0.b(str);
            hashSet.add(b10);
            this.a0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (d5.d) new gj0(this, 0));
    }

    public void setSelectedReaction(hg.r0 r0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (r0Var != null) {
            hashSet.add(r0Var);
        }
        this.T.l();
    }

    public void setSelectedReactionAnimated(hg.r0 r0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (r0Var != null) {
            hashSet.add(r0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (d5.d) new gj0(this, 0));
    }

    public void setSelectedReactionInclusive(hg.r0 r0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (r0Var != null) {
            hashSet.add(r0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (d5.d) new gj0(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.W;
        hashSet.clear();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            MessageObject messageObject = arrayList.get(i9);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < messageObject.messageOwner.reactions.results.size(); i10++) {
                    if (messageObject.messageOwner.reactions.results.get(i10).chosen) {
                        hashSet.add(hg.r0.d(messageObject.messageOwner.reactions.results.get(i10).reaction));
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
        AndroidUtilities.forEachViews((RecyclerView) this.b, (d5.d) new gj0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.Y0 != z10) {
            this.Y0 = z10;
            if (!z10) {
                int i9 = 0;
                while (true) {
                    gh.f1 f1Var = this.b;
                    if (i9 >= f1Var.getChildCount()) {
                        break;
                    }
                    if (f1Var.getChildAt(i9) instanceof sj0) {
                        sj0 sj0Var = (sj0) f1Var.getChildAt(i9);
                        boolean z11 = sj0Var.r;
                        rj0 rj0Var = sj0Var.b;
                        if (z11 && (rj0Var.getImageReceiver().getLottieAnimation() != null || rj0Var.getImageReceiver().getAnimation() != null)) {
                            rj0Var.setVisibility(0);
                            sj0Var.a.setVisibility(4);
                            if (sj0Var.s) {
                                sj0Var.v = true;
                            }
                        }
                        sj0Var.invalidate();
                    }
                    i9++;
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
            hashSet.add(hg.r0.d(reaction));
        }
        this.T.l();
    }

    public void setTop(boolean z10) {
        this.H = z10;
    }

    public void setTransitionProgress(float f10) {
        this.v = f10;
        io ioVar = this.F0;
        if (ioVar != null) {
            if (!this.G0 || !SharedConfig.deviceIsHigh()) {
                f10 = 1.0f;
            }
            ioVar.setReactionsTransitionProgress(f10);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        if (f10 != getTranslationX()) {
            super.setTranslationX(f10);
        }
    }

    public void m() {
    }
}
