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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class qk0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Cells.b1 h1 = new org.telegram.ui.Cells.b1(Float.class, "transitionProgress", 2);
    public final HashSet A0;
    public final float B;
    public boolean B0;
    public final float C;
    public boolean C0;
    public int D;
    public boolean D0;
    public MessageObject E;
    public final Paint E0;
    public boolean F;
    public final Paint F0;
    public int G;
    public qo G0;
    public long H;
    public boolean H0;
    public boolean I;
    public final AnimationNotificationsLocker I0;
    public boolean J;
    public final int J0;
    public boolean K;
    public boolean K0;
    public float L;
    public boolean L0;
    public long M;
    public Runnable M0;
    public ValueAnimator N;
    public boolean N0;
    public FrameLayout O;
    public g90 O0;
    public ag.l P;
    public int P0;
    public final ArrayList Q;
    public int Q0;
    public final ArrayList R;
    public float R0;
    public final ArrayList S;
    public float S0;
    public final org.telegram.ui.cr T;
    public qg.b T0;
    public final gk0 U;
    public qg.b U0;
    public final RectF V;
    public qg.b V0;
    public boolean W;
    public og.a W0;
    public rg.d X0;
    public boolean Y0;
    public boolean Z0;
    public boolean a;
    public final HashSet a0;
    public qo a1;
    public final mh.d1 b;
    public final HashSet b0;
    public boolean b1;
    public final float c;
    public final int[] c0;
    public boolean c1;
    public final ArrayList d;
    public pk0 d0;
    public boolean d1;
    public final ArrayList e;
    public final Rect e0;
    public Paint e1;
    public final Paint f;
    public final Drawable f0;
    public Matrix f1;
    public final boolean g0;
    public LinearGradient g1;
    public final Paint h;
    public final org.telegram.ui.ActionBar.g6 h0;
    public ng.q0 i0;
    public int j0;
    public float k0;
    public float l0;
    public float m0;
    public final Paint n;
    public float n0;
    public boolean o0;
    public long p0;
    public org.telegram.ui.ActionBar.p2 q0;
    public float r;
    public fg.r1 r0;
    public float s;
    public rr s0;
    public float t0;
    public ng.d0 u0;
    public float v;
    public ValueAnimator v0;
    public final RectF w;
    public final ok0 w0;
    public final Path x;
    public boolean x0;
    public float y;
    public float y0;
    public final HashSet z0;

    public qk0(int i10, int i11, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
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
        this.B = dp;
        this.C = dp / 2.0f;
        this.D = AndroidUtilities.dp(36.0f);
        this.Q = new ArrayList(20);
        this.R = new ArrayList(10);
        this.S = new ArrayList(20);
        this.V = new RectF();
        this.W = false;
        this.a0 = new HashSet();
        this.b0 = new HashSet();
        this.c0 = new int[2];
        Rect rect = new Rect();
        this.e0 = rect;
        new ArrayList();
        this.z0 = new HashSet();
        this.A0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.E0 = paint2;
        Paint paint3 = new Paint(1);
        this.F0 = paint3;
        this.I0 = new AnimationNotificationsLocker();
        this.L0 = true;
        this.c1 = false;
        this.J0 = i10;
        this.c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, g6Var));
        paint3.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Jj, g6Var));
        this.h0 = g6Var;
        this.G = i11;
        this.q0 = p2Var;
        ok0 ok0Var = new ok0(this, context);
        this.w0 = ok0Var;
        ok0Var.setVisibility(8);
        ok0Var.L = false;
        ok0Var.c.setVisibility(8);
        addView(ok0Var);
        this.g0 = SharedConfig.animationsEnabled() && SharedConfig.getDevicePerformanceClass() != 0;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Td, false), PorterDuff.Mode.MULTIPLY));
        mh.d1 d1Var = new mh.d1(this, context, 16);
        this.b = d1Var;
        d1Var.setClipChildren(false);
        d1Var.setClipToPadding(false);
        org.telegram.ui.cr crVar = new org.telegram.ui.cr((ViewGroup) this, 3);
        this.T = crVar;
        d1Var.i(new ck0(this, 0));
        d1Var.setLayoutManager(crVar);
        d1Var.setOverScrollMode(2);
        gk0 gk0Var = new gk0(this);
        this.U = gk0Var;
        d1Var.setAdapter(gk0Var);
        d1Var.j(new kk0(this));
        d1Var.j(new nb0(this, 2));
        d1Var.i(new ck0(this, 1));
        d1Var.setOnItemClickListener(new k(this, 11));
        d1Var.setOnItemLongClickListener((kl0) new hg.m2(this, i10, 8));
        addView(d1Var, k7.c6.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (d1Var.getLayoutParams().height - d1Var.getPaddingTop()) - d1Var.getPaddingBottom();
        ok0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        ok0Var.getLayoutParams().height = paddingTop;
        if (i10 == 2 || i10 == 4) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, g6Var));
        }
        MediaDataController.getInstance(i11).preloadDefaultReactions();
    }

    public static void a(qk0 qk0Var) {
        if (qk0Var.u0 != null) {
            return;
        }
        ng.d0 d0Var = new ng.d0(qk0Var.J0, qk0Var.q0, qk0Var.S, qk0Var.a0, qk0Var, qk0Var.h0, qk0Var.a);
        qk0Var.u0 = d0Var;
        og.a aVar = qk0Var.W0;
        boolean z4 = true;
        if (aVar != null) {
            rg.d dVar = qk0Var.X0;
            org.telegram.ui.n51 n51Var = d0Var.m.c0;
            n51Var.x = true;
            n51Var.setBackground(null);
            n51Var.e();
            n51Var.invalidate();
            qg.b c3 = aVar.c(d0Var.a, null, true);
            c3.n(dVar);
            c3.p(AndroidUtilities.dp(12.0f));
            c3.o(AndroidUtilities.dp(8.0f));
            d0Var.z = c3;
        }
        ng.d0 d0Var2 = qk0Var.u0;
        pk0 pk0Var = qk0Var.d0;
        if (pk0Var != null && !pk0Var.g()) {
            z4 = false;
        }
        d0Var2.m.setLongPressEnabled(z4);
        qk0Var.j();
        qk0Var.u0.p = new ec0(qk0Var, 16);
        qk0Var.m();
    }

    public static void b(qk0 qk0Var, View view, float f10) {
        if (view instanceof ok0) {
            ((ok0) view).h = f10;
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
        int i10 = 0;
        boolean z4 = true;
        while (i10 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            hashSet.clear();
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        ng.q0 d = ng.q0.d(messageObject.messageOwner.reactions.results.get(i11).reaction);
                        if (z4 || longSparseArray.indexOfKey(d.h) >= 0) {
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
            z4 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
            if (longSparseArray.valueAt(i13) != null) {
                hashSet2.add((ng.q0) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    public final void d() {
        ng.d0 d0Var = this.u0;
        if (d0Var != null) {
            if (!d0Var.q) {
                d0Var.q = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                int i10 = 0;
                ofFloat.addUpdateListener(new ng.y(d0Var, i10));
                ofFloat.addListener(new ng.b0(d0Var, i10));
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
            this.u0 = null;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id != this.H || getVisibility() == 0 || (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                return;
            }
            p(this.E, null, true);
            setVisibility(0);
            r(false);
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.availableEffectsUpdate) {
                p(this.E, null, true);
            }
        } else {
            if (this.J0 != 4) {
                return;
            }
            invalidate();
            mh.d1 d1Var = this.b;
            d1Var.invalidate();
            d1Var.e1();
            for (int i12 = 0; i12 < d1Var.getChildCount(); i12++) {
                View childAt = d1Var.getChildAt(i12);
                if (childAt instanceof ok0) {
                    ok0 ok0Var = (ok0) childAt;
                    ok0Var.a.invalidate();
                    ok0Var.b.invalidate();
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
        g90 g90Var;
        ng.q0 q0Var;
        int i10;
        ng.q0 q0Var2;
        float width;
        float f10;
        float f11;
        float max;
        float f12;
        qo qoVar;
        float f13;
        int i11;
        float f14;
        RectF rectF;
        float f15;
        float f16;
        int i12;
        RectF rectF2;
        mh.d1 d1Var;
        float f17;
        boolean q10;
        RectF rectF3;
        int i13;
        RectF rectF4;
        int i14;
        mh.d1 d1Var2;
        float f18;
        int R;
        float f19;
        float f20;
        float x10;
        float scaleX;
        float f21;
        float f22;
        l5 l5Var;
        oh.z2 z2Var;
        int i15;
        int i16;
        pk0 pk0Var;
        float f23;
        Canvas canvas2 = canvas;
        long min = Math.min(16L, System.currentTimeMillis() - this.M);
        this.M = System.currentTimeMillis();
        boolean z4 = this.K;
        if (z4) {
            float f24 = this.L;
            if (f24 != 1.0f) {
                this.L = Math.min(1.0f, (min / 220.0f) + f24);
                invalidate();
                g90Var = this.O0;
                if (g90Var != null) {
                    g90Var.setTranslationY(-g());
                }
                float max2 = (Math.max(0.25f, Math.min(this.v, 1.0f)) - 0.25f) / 0.75f;
                float f25 = this.B * max2;
                float f26 = this.C * max2;
                HashSet hashSet = this.A0;
                hashSet.clear();
                HashSet hashSet2 = this.z0;
                hashSet.addAll(hashSet2);
                hashSet2.clear();
                if (this.Y0) {
                    invalidate();
                }
                q0Var = this.i0;
                i10 = this.J0;
                if (q0Var != null && i10 != 5 && ((pk0Var = this.d0) == null || pk0Var.g())) {
                    f23 = this.k0;
                    if (f23 != 1.0f) {
                        float longPressTimeout = (16.0f / (this.i0.a ? ViewConfiguration.getLongPressTimeout() : 1500.0f)) + f23;
                        this.k0 = longPressTimeout;
                        if (longPressTimeout >= 1.0f) {
                            this.k0 = 1.0f;
                        }
                        invalidate();
                    }
                }
                q0Var2 = this.i0;
                if (q0Var2 == null && q0Var2.a) {
                    this.m0 = 1.0f;
                    this.n0 = 1.0f;
                } else {
                    float f27 = this.k0;
                    this.m0 = (f27 * 2.0f) + 1.0f;
                    this.n0 = 1.0f - (f27 * 0.15f);
                }
                int save = canvas2.save();
                if (!LocaleController.isRTL || this.J) {
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
                if (!LocaleController.isRTL || this.J) {
                    max = Math.max(0.25f, this.v);
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f - Math.max(0.25f, this.v);
                    max = 1.0f;
                }
                float pullingLeftProgress = getPullingLeftProgress();
                float g10 = g();
                qoVar = this.a1;
                if (qoVar != null) {
                    qoVar.setExpandSize(g10);
                }
                float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f12);
                float topOffset = getTopOffset();
                float paddingTop = getPaddingTop();
                mh.d1 d1Var3 = this.b;
                float f29 = f12;
                float f30 = max;
                RectF rectF5 = this.w;
                rectF5.set(getPaddingLeft() + width2, (((1.0f - this.n0) * d1Var3.getMeasuredHeight()) + paddingTop) - g10, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g10);
                this.y = e2.c.d(g10, 2.0f, rectF5.height() - topOffset, 2.0f);
                if (i10 == 1) {
                    f13 = 255.0f;
                    int clamp = (int) (Utilities.clamp(1.0f - (this.t0 / 0.05f), 1.0f, 0.0f) * 255.0f);
                    Drawable drawable = this.f0;
                    drawable.setAlpha(clamp);
                    float paddingLeft = getPaddingLeft();
                    int width3 = getWidth() - getPaddingRight();
                    Rect rect = this.e0;
                    int i17 = (int) g10;
                    drawable.setBounds((int) ((((width3 + rect.right) * f29) + paddingLeft) - rect.left), (getPaddingTop() - rect.top) - i17, (int) (((getWidth() - getPaddingRight()) + rect.right) * f30), (getHeight() - getPaddingBottom()) + rect.bottom + i17);
                    if (this.T0 == null) {
                        drawable.draw(canvas2);
                    }
                } else {
                    f13 = 255.0f;
                }
                canvas2.restoreToCount(save);
                if (this.Z0) {
                    int save2 = canvas2.save();
                    float f31 = this.v;
                    if (f31 != 1.0f) {
                        f15 = 2.0f;
                        canvas2.scale(f31, f31, f28, getHeight() / 2.0f);
                    } else {
                        f15 = 2.0f;
                    }
                    if (i10 == 1 || this.d0.t()) {
                        i15 = save2;
                        i11 = i10;
                        rectF = rectF5;
                        f14 = f28;
                        i16 = 1;
                        this.d0.j(canvas, rectF, this.y, getX(), getY(), 255, false);
                        canvas2 = canvas;
                    } else {
                        qg.b bVar = this.T0;
                        Paint paint = this.f;
                        if (bVar != null) {
                            Rect rect2 = AndroidUtilities.rectTmp2;
                            rectF5.round(rect2);
                            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                            this.T0.setBounds(rect2);
                            this.T0.setAlpha(paint.getAlpha());
                            this.T0.draw(canvas2);
                        } else {
                            float f32 = this.y;
                            canvas2.drawRoundRect(rectF5, f32, f32, paint);
                        }
                        i15 = save2;
                        i11 = i10;
                        f14 = f28;
                        rectF = rectF5;
                        i16 = 1;
                    }
                    if (this.W) {
                        Iterator it = this.a0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                float f33 = this.y;
                                float clamp01 = Utilities.clamp01(1.0f - getPullingLeftProgress());
                                if (this.e1 == null) {
                                    this.e1 = new Paint(i16);
                                }
                                if (this.f1 == null) {
                                    this.f1 = new Matrix();
                                }
                                if (this.g1 == null) {
                                    int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Jj, this.h0);
                                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{v02, org.telegram.ui.ActionBar.k6.l1(0.0f, v02)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                    this.g1 = linearGradient;
                                    this.e1.setShader(linearGradient);
                                }
                                this.f1.reset();
                                this.f1.postTranslate(rectF.left, rectF.top);
                                this.g1.setLocalMatrix(this.f1);
                                this.e1.setAlpha((int) (clamp01 * f13));
                                canvas2.drawRoundRect(rectF, f33, f33, this.e1);
                            } else if (((ng.q0) it.next()).a) {
                                break;
                            }
                        }
                    }
                    canvas2.restoreToCount(i15);
                } else {
                    i11 = i10;
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
                    int i18 = i11;
                    if (getAlpha() == 1.0f || i18 == 5) {
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 0;
                        while (i19 < d1Var3.getChildCount()) {
                            View childAt = d1Var3.getChildAt(i19);
                            int abs = (this.v == 1.0f || !SharedConfig.deviceIsHigh()) ? i21 : (int) (Math.abs((((childAt.getMeasuredWidth() / f15) + childAt.getLeft()) / d1Var3.getMeasuredWidth()) - 0.8f) * 200.0f);
                            float f35 = f26;
                            if (childAt instanceof ok0) {
                                ok0 ok0Var = (ok0) d1Var3.getChildAt(i19);
                                i14 = i19;
                                if (this.y0 != 0.0f) {
                                    i13 = save3;
                                    f20 = AndroidUtilities.dp(46.0f) * Utilities.clamp(ok0Var.getLeft() / (getMeasuredWidth() - AndroidUtilities.dp(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress();
                                } else {
                                    i13 = save3;
                                    f20 = 0.0f;
                                }
                                ng.q0 q0Var3 = ok0Var.e;
                                nk0 nk0Var = ok0Var.a;
                                float f36 = f20;
                                nk0 nk0Var2 = ok0Var.b;
                                nk0 nk0Var3 = ok0Var.c;
                                rectF4 = rectF;
                                if (q0Var3.equals(this.i0)) {
                                    nk0 nk0Var4 = nk0Var2.getVisibility() == 0 ? nk0Var2 : nk0Var;
                                    ok0Var.setPivotX(ok0Var.getMeasuredWidth() >> 1);
                                    ok0Var.setPivotY(nk0Var4.getY() + nk0Var4.getMeasuredHeight());
                                    ok0Var.setScaleX(this.m0);
                                    ok0Var.setScaleY(this.m0);
                                    if (!this.o0) {
                                        if (this.N == null) {
                                            nk0Var3.setVisibility(0);
                                            nk0Var3.setAlpha(1.0f);
                                            if (nk0Var3.getImageReceiver().hasBitmapImage() || ((l5Var = nk0Var3.e) != null && (z2Var = l5Var.k) != null && z2Var.hasBitmapImage())) {
                                                nk0Var4.setAlpha(0.0f);
                                            }
                                            f22 = 1.0f;
                                        } else {
                                            f22 = 1.0f;
                                            nk0Var3.setAlpha(1.0f - this.l0);
                                            nk0Var4.setAlpha(this.l0);
                                        }
                                        if (this.k0 == f22) {
                                            this.o0 = true;
                                            if (System.currentTimeMillis() - this.p0 > 300) {
                                                this.p0 = System.currentTimeMillis();
                                                d1Var2 = d1Var3;
                                                this.d0.o(ok0Var, ok0Var.e, true, false);
                                                canvas2.save();
                                                x10 = ok0Var.getX() + d1Var2.getX();
                                                scaleX = ((ok0Var.getScaleX() * ok0Var.getMeasuredWidth()) - ok0Var.getMeasuredWidth()) / f15;
                                                f21 = x10 - scaleX;
                                                if (f21 >= 0.0f && ok0Var.getTranslationX() >= 0.0f) {
                                                    ok0Var.setTranslationX((-f21) - f36);
                                                } else if (ok0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth() || ok0Var.getTranslationX() > 0.0f) {
                                                    ok0Var.setTranslationX(0.0f - f36);
                                                } else {
                                                    ok0Var.setTranslationX((((getMeasuredWidth() - x10) - ok0Var.getMeasuredWidth()) - scaleX) - f36);
                                                }
                                                canvas2.translate(ok0Var.getX() + d1Var2.getX(), ok0Var.getY() + d1Var2.getY());
                                                canvas2.scale(ok0Var.getScaleX(), ok0Var.getScaleY(), ok0Var.getPivotX(), ok0Var.getPivotY());
                                                ok0Var.draw(canvas2);
                                                canvas2.restore();
                                            }
                                        }
                                    }
                                    d1Var2 = d1Var3;
                                    canvas2.save();
                                    x10 = ok0Var.getX() + d1Var2.getX();
                                    scaleX = ((ok0Var.getScaleX() * ok0Var.getMeasuredWidth()) - ok0Var.getMeasuredWidth()) / f15;
                                    f21 = x10 - scaleX;
                                    if (f21 >= 0.0f) {
                                    }
                                    if (ok0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth()) {
                                    }
                                    ok0Var.setTranslationX(0.0f - f36);
                                    canvas2.translate(ok0Var.getX() + d1Var2.getX(), ok0Var.getY() + d1Var2.getY());
                                    canvas2.scale(ok0Var.getScaleX(), ok0Var.getScaleY(), ok0Var.getPivotX(), ok0Var.getPivotY());
                                    ok0Var.draw(canvas2);
                                    canvas2.restore();
                                } else {
                                    d1Var2 = d1Var3;
                                    int R2 = RecyclerView.R(ok0Var);
                                    float measuredWidth = (((this.m0 - 1.0f) * ok0Var.getMeasuredWidth()) / 3.0f) - (((1.0f - this.n0) * ok0Var.getMeasuredWidth()) * (Math.abs(this.j0 - R2) - 1));
                                    if (R2 < this.j0) {
                                        ok0Var.setPivotX(0.0f);
                                        ok0Var.setTranslationX(-measuredWidth);
                                    } else {
                                        ok0Var.setPivotX(ok0Var.getMeasuredWidth() - f36);
                                        ok0Var.setTranslationX(measuredWidth - f36);
                                    }
                                    ok0Var.setPivotY(nk0Var.getY() + nk0Var.getMeasuredHeight());
                                    ok0Var.setScaleX(this.n0);
                                    ok0Var.setScaleY(this.n0);
                                    nk0Var3.setVisibility(4);
                                    nk0Var.setAlpha(1.0f);
                                }
                                if (childAt.getLeft() > i20) {
                                    i20 = childAt.getLeft();
                                }
                                if (!this.K0 && (!ok0Var.r || nk0Var.getImageReceiver().getLottieAnimation() != null)) {
                                    if ((ok0Var.getMeasuredWidth() / f15) + ok0Var.getX() > 0.0f && (ok0Var.getMeasuredWidth() / f15) + ok0Var.getX() < d1Var2.getWidth()) {
                                        if (!hashSet.contains(ok0Var)) {
                                            ok0Var.c(abs);
                                            abs += 30;
                                        }
                                        hashSet2.add(ok0Var);
                                    } else if (!ok0Var.n) {
                                        ok0Var.d();
                                    }
                                }
                            } else {
                                i13 = save3;
                                rectF4 = rectF;
                                i14 = i19;
                                d1Var2 = d1Var3;
                                if (childAt == this.O) {
                                    if ((childAt.getMeasuredWidth() / f15) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f15) + childAt.getX() >= d1Var2.getWidth()) {
                                        fg.r1 r1Var = this.r0;
                                        f18 = 0.0f;
                                        r1Var.setScaleX(0.0f);
                                        r1Var.setScaleY(0.0f);
                                        if (childAt == this.P) {
                                            if ((childAt.getMeasuredWidth() / f15) + childAt.getX() <= f18 || (childAt.getMeasuredWidth() / f15) + childAt.getX() >= d1Var2.getWidth()) {
                                                rr rrVar = this.s0;
                                                rrVar.setScaleX(0.0f);
                                                rrVar.setScaleY(0.0f);
                                                ((qk0) rrVar.c).P.invalidate();
                                                ValueAnimator valueAnimator = (ValueAnimator) rrVar.b;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                            } else {
                                                if (!hashSet.contains(childAt)) {
                                                    if (this.v != 1.0f) {
                                                        rr rrVar2 = this.s0;
                                                        rrVar2.setScaleX(0.0f);
                                                        rrVar2.setScaleY(0.0f);
                                                        ((qk0) rrVar2.c).P.invalidate();
                                                        ValueAnimator valueAnimator2 = (ValueAnimator) rrVar2.b;
                                                        if (valueAnimator2 != null) {
                                                            valueAnimator2.cancel();
                                                        }
                                                    }
                                                    rr rrVar3 = this.s0;
                                                    boolean z10 = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || SharedConfig.getDevicePerformanceClass() >= 1;
                                                    rrVar3.invalidate();
                                                    ValueAnimator valueAnimator3 = (ValueAnimator) rrVar3.b;
                                                    if (valueAnimator3 != null) {
                                                        valueAnimator3.removeAllListeners();
                                                        ((ValueAnimator) rrVar3.b).cancel();
                                                    }
                                                    if (z10) {
                                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(rrVar3.getScaleX(), 1.0f);
                                                        rrVar3.b = ofFloat;
                                                        ofFloat.setInterpolator(AndroidUtilities.overshootInterpolator);
                                                        ((ValueAnimator) rrVar3.b).addUpdateListener(new k70(rrVar3, 7));
                                                        ((ValueAnimator) rrVar3.b).setStartDelay((long) (abs * ((qk0) rrVar3.c).c));
                                                        ((ValueAnimator) rrVar3.b).setDuration(300L);
                                                        ((ValueAnimator) rrVar3.b).start();
                                                    } else {
                                                        rrVar3.setScaleX(1.0f);
                                                        rrVar3.setScaleY(1.0f);
                                                    }
                                                    abs += 30;
                                                }
                                                hashSet2.add(childAt);
                                            }
                                        }
                                        R = RecyclerView.R(childAt);
                                        float measuredWidth2 = (((this.m0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.n0) * childAt.getMeasuredWidth()) * (Math.abs(this.j0 - R) - 1));
                                        if (R >= this.j0) {
                                            childAt.setPivotX(0.0f);
                                            childAt.setTranslationX(-measuredWidth2);
                                        } else {
                                            childAt.setPivotX(childAt.getMeasuredWidth());
                                            childAt.setTranslationX(measuredWidth2);
                                        }
                                        childAt.setScaleX(this.n0);
                                        childAt.setScaleY(this.n0);
                                    } else {
                                        if (!hashSet.contains(childAt)) {
                                            if (this.v != 1.0f) {
                                                fg.r1 r1Var2 = this.r0;
                                                f19 = 0.0f;
                                                r1Var2.setScaleX(0.0f);
                                                r1Var2.setScaleY(0.0f);
                                            } else {
                                                f19 = 0.0f;
                                            }
                                            fg.r1 r1Var3 = this.r0;
                                            org.telegram.ui.Components.voip.h hVar = r1Var3.G;
                                            if (hVar != null) {
                                                hVar.g = f19;
                                                hVar.j = false;
                                            }
                                            r1Var3.invalidate();
                                            r1Var3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(abs).setInterpolator(AndroidUtilities.overshootInterpolator).setDuration(300L);
                                            abs += 30;
                                        }
                                        hashSet2.add(childAt);
                                    }
                                }
                                f18 = 0.0f;
                                if (childAt == this.P) {
                                }
                                R = RecyclerView.R(childAt);
                                float measuredWidth22 = (((this.m0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.n0) * childAt.getMeasuredWidth()) * (Math.abs(this.j0 - R) - 1));
                                if (R >= this.j0) {
                                }
                                childAt.setScaleX(this.n0);
                                childAt.setScaleY(this.n0);
                            }
                            i21 = abs;
                            i19 = i14 + 1;
                            canvas2 = canvas;
                            f26 = f35;
                            save3 = i13;
                            d1Var3 = d1Var2;
                            rectF = rectF4;
                        }
                        i12 = save3;
                        rectF2 = rectF;
                        d1Var = d1Var3;
                        f17 = f26;
                        ok0 ok0Var2 = this.w0;
                        if (pullingLeftProgress > 0.0f) {
                            float pullingLeftProgress2 = getPullingLeftProgress();
                            int measuredWidth3 = ok0Var2.getMeasuredWidth() - AndroidUtilities.dp(f15);
                            float f37 = i20 + measuredWidth3;
                            float clamp2 = Utilities.clamp(f37 / (getMeasuredWidth() - ok0Var2.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth3;
                            if (ok0Var2.getTag() == null) {
                                ok0Var2.setTag(Float.valueOf(1.0f));
                                ok0Var2.d();
                                ok0Var2.c(0);
                            }
                            float clamp3 = Utilities.clamp(pullingLeftProgress2, 1.0f, 0.0f);
                            ok0Var2.setScaleX(clamp3);
                            ok0Var2.setScaleY(clamp3);
                            ok0Var2.setTranslationX(((d1Var.getX() + f37) - clamp2) + (-((i18 == 1 || i18 == 2) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(20.0f))));
                            if (ok0Var2.getVisibility() != 0) {
                                ok0Var2.setVisibility(0);
                            }
                        } else {
                            if (ok0Var2.getVisibility() != 8 && this.L0) {
                                ok0Var2.setVisibility(8);
                            }
                            if (ok0Var2.getTag() != null) {
                                ok0Var2.setTag(null);
                            }
                        }
                        if (!this.Z0 && this.u0 != null) {
                            int y10 = (int) org.telegram.messenger.y3.y(1.0f, this.t0, Utilities.clamp(1.0f - (this.t0 / 0.2f), 1.0f, 0.0f), 255.0f);
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
                        canvas.translate((1.0f - this.v) * getWidth() * ((!LocaleController.isRTL || this.J) ? -1 : 1), 0.0f);
                        d1Var.setTranslationX(-width2);
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
                        canvas.restoreToCount(i12);
                        f(f25, max2, f38, 255, canvas);
                        invalidate();
                    }
                }
                i12 = save3;
                rectF2 = rectF;
                d1Var = d1Var3;
                f17 = f26;
                if (!this.Z0) {
                }
                float f382 = f17;
                q10 = q();
                if (!q10) {
                }
                canvas.translate((1.0f - this.v) * getWidth() * ((!LocaleController.isRTL || this.J) ? -1 : 1), 0.0f);
                d1Var.setTranslationX(-width2);
                super.dispatchDraw(canvas);
                if (!q10) {
                }
                canvas.restoreToCount(i12);
                f(f25, max2, f382, 255, canvas);
                invalidate();
            }
        }
        if (!z4) {
            float f39 = this.L;
            if (f39 != 0.0f) {
                this.L = Math.max(0.0f, f39 - (min / 220.0f));
                invalidate();
            }
        }
        g90Var = this.O0;
        if (g90Var != null) {
        }
        float max22 = (Math.max(0.25f, Math.min(this.v, 1.0f)) - 0.25f) / 0.75f;
        float f252 = this.B * max22;
        float f262 = this.C * max22;
        HashSet hashSet3 = this.A0;
        hashSet3.clear();
        HashSet hashSet22 = this.z0;
        hashSet3.addAll(hashSet22);
        hashSet22.clear();
        if (this.Y0) {
        }
        q0Var = this.i0;
        i10 = this.J0;
        if (q0Var != null) {
            f23 = this.k0;
            if (f23 != 1.0f) {
            }
        }
        q0Var2 = this.i0;
        if (q0Var2 == null) {
        }
        float f272 = this.k0;
        this.m0 = (f272 * 2.0f) + 1.0f;
        this.n0 = 1.0f - (f272 * 0.15f);
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
        qoVar = this.a1;
        if (qoVar != null) {
        }
        float width22 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f12);
        float topOffset2 = getTopOffset();
        float paddingTop2 = getPaddingTop();
        mh.d1 d1Var32 = this.b;
        float f292 = f12;
        float f302 = max;
        RectF rectF52 = this.w;
        rectF52.set(getPaddingLeft() + width22, (((1.0f - this.n0) * d1Var32.getMeasuredHeight()) + paddingTop2) - g102, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g102);
        this.y = e2.c.d(g102, 2.0f, rectF52.height() - topOffset2, 2.0f);
        if (i10 == 1) {
        }
        canvas2.restoreToCount(save4);
        if (this.Z0) {
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
        i12 = save32;
        rectF2 = rectF;
        d1Var = d1Var32;
        f17 = f262;
        if (!this.Z0) {
        }
        float f3822 = f17;
        q10 = q();
        if (!q10) {
        }
        canvas.translate((1.0f - this.v) * getWidth() * ((!LocaleController.isRTL || this.J) ? -1 : 1), 0.0f);
        d1Var.setTranslationX(-width22);
        super.dispatchDraw(canvas);
        if (!q10) {
        }
        canvas.restoreToCount(i12);
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
        ng.d0 d0Var = this.u0;
        if (d0Var != null) {
            d0Var.d();
        }
    }

    public final void f(float f10, float f11, float f12, int i10, Canvas canvas) {
        float f13;
        if (this.J0 == 1) {
            return;
        }
        canvas.save();
        boolean z4 = this.I;
        RectF rectF = this.w;
        if (z4) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), pr.f.getInterpolation(this.L)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f14 = rectF.bottom;
            pr prVar = pr.f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f14, 0.0f, prVar.getInterpolation(this.L)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), prVar.getInterpolation(this.L)));
        }
        float width = ((LocaleController.isRTL || this.J) ? this.D : getWidth() - this.D) + this.R0;
        float paddingTop = this.I ? getPaddingTop() - g() : (getHeight() - getPaddingBottom()) + g();
        int dp = AndroidUtilities.dp(3.0f);
        Drawable drawable = this.f0;
        drawable.setAlpha(i10);
        Paint paint = this.f;
        paint.setAlpha(i10);
        float f15 = width - f10;
        float f16 = dp;
        float f17 = f16 * f11;
        float f18 = paddingTop - f10;
        float f19 = width + f10;
        float f20 = paddingTop + f10;
        drawable.setBounds((int) (f15 - f17), (int) (f18 - f17), (int) (f19 + f17), (int) (f17 + f20));
        drawable.draw(canvas);
        boolean t6 = this.d0.t();
        float f21 = paddingTop;
        RectF rectF2 = this.V;
        if (t6) {
            rectF2.set(f15, f18, f19, f20);
            f13 = f10;
            this.d0.j(canvas, rectF2, f13, getX(), getY(), i10, false);
        } else {
            f13 = f10;
            if (this.U0 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(f15, f18, f19, f20);
                Rect rect = AndroidUtilities.rectTmp2;
                rectF3.round(rect);
                rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                this.U0.setBounds(rect);
                this.U0.setAlpha(paint.getAlpha());
                this.U0.draw(canvas);
            } else {
                canvas.drawCircle(width, f21, f13, paint);
            }
        }
        boolean z10 = LocaleController.isRTL;
        float f22 = this.B;
        float width2 = this.R0 + this.S0 + ((z10 || this.J) ? this.D - f22 : (getWidth() - this.D) + f22);
        boolean z11 = this.I;
        float f23 = this.C;
        float lerp = AndroidUtilities.lerp(z11 ? (getPaddingTop() - g()) - AndroidUtilities.dp(16.0f) : ((getHeight() - f23) - f16) + g(), (f23 + f16) - g(), pr.f.getInterpolation(this.L));
        float f24 = (-AndroidUtilities.dp(1.0f)) * f11;
        drawable.setBounds((int) ((width2 - f13) - f24), (int) ((lerp - f13) - f24), (int) (width2 + f13 + f24), (int) (f13 + lerp + f24));
        drawable.draw(canvas);
        if (this.d0.t()) {
            rectF2.set(width2 - f12, lerp - f12, width2 + f12, lerp + f12);
            this.d0.j(canvas, rectF2, f12, getX(), getY(), i10, false);
        } else if (this.V0 != null) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(width2 - f12, lerp - f12, width2 + f12, lerp + f12);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rectF4.round(rect2);
            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
            this.V0.setBounds(rect2);
            this.V0.setAlpha(paint.getAlpha());
            this.V0.draw(canvas);
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

    public pk0 getDelegate() {
        return this.d0;
    }

    public int getHintTextWidth() {
        return this.P0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.Q.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.clamp(this.y0 / AndroidUtilities.dp(42.0f), 2.0f, 0.0f);
    }

    public ng.d0 getReactionsWindow() {
        return this.u0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f10;
        HashSet hashSet = this.a0;
        if (hashSet.isEmpty()) {
            return "";
        }
        ng.q0 q0Var = (ng.q0) hashSet.iterator().next();
        long j10 = q0Var.g;
        String str = null;
        if (j10 != 0 && (f10 = l5.f(this.G, j10)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f10, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = q0Var.f;
        }
        return TextUtils.isEmpty(str) ? "👍" : str;
    }

    public HashSet<ng.q0> getSelectedReactions() {
        return this.a0;
    }

    public float getTopOffset() {
        if (this.N0) {
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

    public List<ng.q0> getVisibleReactionsList() {
        return this.Q;
    }

    public int getWindowType() {
        int i10 = this.J0;
        if (i10 == 4) {
            return 13;
        }
        if (i10 == 3) {
            return 11;
        }
        if (i10 == 5) {
            return 14;
        }
        return this.C0 ? 8 : 1;
    }

    public View getWindowView() {
        ng.d0 d0Var = this.u0;
        if (d0Var == null) {
            return null;
        }
        return d0Var.c;
    }

    public final void h(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.J0;
        if (i11 == 4) {
            Iterator it = this.a0.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                ng.q0 q0Var = (ng.q0) it.next();
                if (!hashSet.contains(q0Var)) {
                    hashSet.add(q0Var);
                    arrayList.add(q0Var);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.G).getEnabledReactionsList();
            while (i10 < enabledReactionsList.size()) {
                ng.q0 c3 = ng.q0.c(enabledReactionsList.get(i10));
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
        if (!this.B0 || i11 == 4) {
            if (i11 != 3) {
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.G).getEnabledReactionsList();
                while (i10 < enabledReactionsList2.size()) {
                    arrayList.add(ng.q0.c(enabledReactionsList2.get(i10)));
                    i10++;
                }
                return;
            }
            ArrayList<TLRPC.Reaction> savedReactions = MediaDataController.getInstance(this.G).getSavedReactions();
            int i13 = 0;
            while (i10 < savedReactions.size()) {
                ng.q0 d = ng.q0.d(savedReactions.get(i10));
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
            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.G).getAvailableEffects();
            if (availableEffects != null) {
                while (i10 < availableEffects.effects.size()) {
                    ng.q0 e6 = ng.q0.e(availableEffects.effects.get(i10));
                    if (!hashSet.contains(e6)) {
                        hashSet.add(e6);
                        arrayList.add(e6);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        ArrayList<TLRPC.Reaction> savedReactions2 = i11 == 3 ? MediaDataController.getInstance(this.G).getSavedReactions() : MediaDataController.getInstance(this.G).getTopReactions();
        if (i11 == 3) {
            TLRPC.TL_messages_savedReactionsTags savedReactionTags = MessagesController.getInstance(this.G).getSavedReactionTags(0L);
            if (savedReactionTags != null) {
                for (int i14 = 0; i14 < savedReactionTags.tags.size(); i14++) {
                    ng.q0 d10 = ng.q0.d(savedReactionTags.tags.get(i14).reaction);
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            }
            for (int i15 = 0; i15 < savedReactions2.size(); i15++) {
                ng.q0 d11 = ng.q0.d(savedReactions2.get(i15));
                if (!hashSet.contains(d11)) {
                    hashSet.add(d11);
                    arrayList.add(d11);
                }
            }
        } else {
            for (int i16 = 0; i16 < savedReactions2.size(); i16++) {
                ng.q0 d12 = ng.q0.d(savedReactions2.get(i16));
                if (!hashSet.contains(d12) && (i11 == 3 || UserConfig.getInstance(this.G).isPremium() || d12.g == 0)) {
                    hashSet.add(d12);
                    arrayList.add(d12);
                }
            }
        }
        if (i11 != 3 || UserConfig.getInstance(this.G).isPremium()) {
            ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.G).getRecentReactions();
            for (int i17 = 0; i17 < recentReactions.size(); i17++) {
                ng.q0 d13 = ng.q0.d(recentReactions.get(i17));
                if (!hashSet.contains(d13)) {
                    hashSet.add(d13);
                    arrayList.add(d13);
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList3 = MediaDataController.getInstance(this.G).getEnabledReactionsList();
            while (i10 < enabledReactionsList3.size()) {
                ng.q0 c10 = ng.q0.c(enabledReactionsList3.get(i10));
                if (!hashSet.contains(c10)) {
                    hashSet.add(c10);
                    arrayList.add(c10);
                }
                i10++;
            }
        }
    }

    public void j() {
        int i10 = 0;
        while (true) {
            mh.d1 d1Var = this.b;
            if (i10 >= d1Var.getChildCount()) {
                return;
            }
            View childAt = d1Var.getChildAt(i10);
            if (childAt instanceof ok0) {
                ((ok0) childAt).b.invalidate();
            }
            i10++;
        }
    }

    public final void k() {
        int dp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G8, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, w02, 0, tileMode));
        this.n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, w02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, ng.q0 q0Var, boolean z4) {
        pk0 pk0Var = this.d0;
        if (pk0Var != null) {
            pk0Var.o(view, q0Var, z4, true);
        }
        if (this.J0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void n() {
        this.L0 = true;
        this.j0 = 0;
        this.k0 = 0.0f;
        this.y0 = 0.0f;
        this.i0 = null;
        this.o0 = false;
        bk0 bk0Var = new bk0(this, 1);
        mh.d1 d1Var = this.b;
        AndroidUtilities.forEachViews((RecyclerView) d1Var, (h5.d) bk0Var);
        this.z0.clear();
        d1Var.invalidate();
        ag.l lVar = this.P;
        if (lVar != null) {
            lVar.invalidate();
        }
        invalidate();
    }

    public final void o(og.a aVar, rg.d dVar) {
        this.W0 = aVar;
        this.X0 = dVar;
        qg.b c3 = aVar.c(this, null, true);
        c3.n(dVar);
        c3.p(AndroidUtilities.dp(24.0f));
        c3.o(AndroidUtilities.dp(8.0f));
        this.T0 = c3;
        qg.b c10 = aVar.c(this, null, true);
        c10.n(dVar);
        c10.p(AndroidUtilities.dp(8.0f));
        c10.o(AndroidUtilities.dp(8.0f));
        this.U0 = c10;
        qg.b c11 = aVar.c(this, null, true);
        c11.n(dVar);
        c11.p(AndroidUtilities.dp(4.0f));
        c11.o(AndroidUtilities.dp(8.0f));
        this.V0 = c11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.J0 == 5) {
            NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.J0 == 5) {
            NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        k();
    }

    public final void p(MessageObject messageObject, TLRPC.ChatFull chatFull, boolean z4) {
        int i10;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.E = messageObject;
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
        int i12 = this.J0;
        this.F = i12 == 0 && this.E != null && i10 >= MessagesController.getInstance(this.G).getChatMaxUniqReactions(this.E.getDialogId());
        this.x0 = i12 == 0 && this.E != null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.G).getChat(Long.valueOf(-this.E.getDialogId())));
        ArrayList arrayList2 = new ArrayList();
        if (messageObject != null && messageObject.isForwardedChannelPost() && (chatFull = MessagesController.getInstance(this.G).getChatFull(-messageObject.getFromChatId())) == null) {
            this.H = -messageObject.getFromChatId();
            MessagesController.getInstance(this.G).loadFullChat(-messageObject.getFromChatId(), 0, true);
            setVisibility(4);
            return;
        }
        this.W = false;
        if (i12 == 3) {
            this.B0 = UserConfig.getInstance(this.G).isPremium();
            h(arrayList2);
        } else if (i12 == 5) {
            this.B0 = true;
            h(arrayList2);
        } else if (this.F) {
            this.B0 = false;
            if (chatFull != null && chatFull.paid_reactions_available) {
                this.W = true;
                ng.q0 q0Var = new ng.q0();
                q0Var.a = true;
                arrayList2.add(q0Var);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.E.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i13);
                i13++;
                arrayList2.add(ng.q0.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.W = true;
                ng.q0 q0Var2 = new ng.q0();
                q0Var2.a = true;
                arrayList2.add(q0Var2);
            }
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat chat = MessagesController.getInstance(this.G).getChat(Long.valueOf(chatFull.id));
                if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
                    this.B0 = false;
                } else {
                    this.B0 = true;
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
                    Iterator<TLRPC.TL_availableReaction> it = MediaDataController.getInstance(this.G).getEnabledReactionsList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TLRPC.TL_availableReaction next = it.next();
                            if (!(reaction2 instanceof TLRPC.TL_reactionEmoji) || !next.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    arrayList2.add(ng.q0.d(reaction2));
                                    break;
                                }
                            } else {
                                arrayList2.add(ng.q0.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.B0 = true;
            h(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i15))) {
                i15--;
                arrayList2.remove(i15);
            } else {
                hashSet.add((ng.q0) arrayList2.get(i15));
            }
            i15++;
        }
        this.C0 = !this.F && ((!this.B0 && arrayList2.size() > 16) || (this.B0 && !UserConfig.getInstance(this.G).isPremium() && MessagesController.getInstance(this.G).premiumFeaturesBlocked()));
        if (i12 == 3 && !UserConfig.getInstance(this.G).isPremium()) {
            this.C0 = false;
        }
        if (i12 == 4) {
            this.C0 = true;
        }
        ArrayList arrayList5 = this.Q;
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
                arrayList5.add((ng.q0) arrayList2.get(i16));
                i16++;
            }
            if (i16 < arrayList2.size()) {
                ok0.a(this.w0, (ng.q0) arrayList2.get(i16), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.D0 = true;
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (((ng.q0) arrayList5.get(i17)).g != 0) {
                this.D0 = false;
            }
        }
        ArrayList arrayList6 = this.S;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        gk0 gk0Var = this.U;
        qk0 qk0Var = gk0Var.d;
        ArrayList arrayList7 = qk0Var.e;
        ArrayList arrayList8 = qk0Var.Q;
        ArrayList arrayList9 = qk0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i18 = 0; i18 < arrayList8.size(); i18++) {
            ng.q0 q0Var3 = (ng.q0) arrayList8.get(i18);
            arrayList9.add(new hk0(q0Var3.f == null ? 3 : 0, q0Var3));
        }
        if (!qk0Var.R.isEmpty() && !MessagesController.getInstance(qk0Var.G).premiumFeaturesBlocked()) {
            arrayList9.add(new hk0(1, null));
        }
        if (qk0Var.q()) {
            arrayList9.add(new hk0(2, null));
        }
        if (z4) {
            gk0Var.E(arrayList7, arrayList9);
        } else {
            gk0Var.l();
        }
        if (messageObject == null || (tL_messageReactions = messageObject.messageOwner.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i19 = 0; i19 < messageObject.messageOwner.reactions.results.size(); i19++) {
            if (messageObject.messageOwner.reactions.results.get(i19).chosen) {
                this.a0.add(ng.q0.d(messageObject.messageOwner.reactions.results.get(i19).reaction));
            }
        }
    }

    public final boolean q() {
        return this.B0 || this.C0;
    }

    public final void r(boolean z4) {
        ObjectAnimator duration;
        this.H0 = z4;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.I0.lock();
        boolean deviceIsHigh = SharedConfig.deviceIsHigh();
        org.telegram.ui.Cells.b1 b1Var = h1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new dk0(this, 0));
        duration.start();
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        if (getAlpha() != f10 && f10 == 0.0f) {
            this.z0.clear();
            int i10 = 0;
            while (true) {
                mh.d1 d1Var = this.b;
                if (i10 >= d1Var.getChildCount()) {
                    break;
                }
                if (d1Var.getChildAt(i10) instanceof ok0) {
                    ((ok0) d1Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f10);
    }

    public void setBubbleOffset(float f10) {
        this.R0 = f10;
    }

    public void setChatScrimView(qo qoVar) {
        this.a1 = qoVar;
    }

    public void setCurrentAccount(int i10) {
        this.G = i10;
    }

    public void setCustomEmojiEnterProgress(float f10) {
        this.t0 = f10;
        qo qoVar = this.a1;
        if (qoVar != null) {
            qoVar.setPopupAlpha(1.0f - f10);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z4) {
        if (z4) {
            this.s0.setBackground(org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i6, false), 40)));
        } else {
            this.s0.setBackground(null);
        }
    }

    public void setDelegate(pk0 pk0Var) {
        this.d0 = pk0Var;
    }

    public void setFlippedVertically(boolean z4) {
        this.K = z4;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        this.q0 = p2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.N0 = true;
        if (this.O0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.g6 g6Var = this.h0;
            g90 g90Var = new g90(context, g6Var);
            this.O0 = g90Var;
            g90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.O0.setClickable(true);
            this.O0.setTextSize(1, 12.0f);
            int i10 = this.J0;
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                this.O0.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
                this.O0.setAlpha(0.5f);
            } else {
                this.O0.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z6, g6Var));
            }
            this.O0.setGravity(1);
            addView(this.O0, k7.c6.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.O0.setText(charSequence);
        this.b1 = false;
        ((FrameLayout.LayoutParams) this.w0.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
    }

    public void setMiniBubblesOffset(float f10) {
        this.S0 = f10;
    }

    public void setMirrorX(boolean z4) {
        this.J = z4;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.M0 = runnable;
    }

    public void setParentLayout(qo qoVar) {
        this.G0 = qoVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.a0;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            ng.q0 b10 = ng.q0.b(str);
            hashSet.add(b10);
            this.b0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (h5.d) new bk0(this, 0));
    }

    public void setSelectedReaction(ng.q0 q0Var) {
        HashSet hashSet = this.a0;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        this.U.l();
    }

    public void setSelectedReactionAnimated(ng.q0 q0Var) {
        HashSet hashSet = this.a0;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (h5.d) new bk0(this, 0));
    }

    public void setSelectedReactionInclusive(ng.q0 q0Var) {
        HashSet hashSet = this.a0;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (h5.d) new bk0(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.a0;
        hashSet.clear();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = arrayList.get(i10);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        hashSet.add(ng.q0.d(messageObject.messageOwner.reactions.results.get(i11).reaction));
                    }
                }
            }
        }
        this.U.l();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        HashSet hashSet = this.a0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        AndroidUtilities.forEachViews((RecyclerView) this.b, (h5.d) new bk0(this, 0));
    }

    public void setSkipDraw(boolean z4) {
        if (this.Z0 != z4) {
            this.Z0 = z4;
            if (!z4) {
                int i10 = 0;
                while (true) {
                    mh.d1 d1Var = this.b;
                    if (i10 >= d1Var.getChildCount()) {
                        break;
                    }
                    if (d1Var.getChildAt(i10) instanceof ok0) {
                        ok0 ok0Var = (ok0) d1Var.getChildAt(i10);
                        boolean z10 = ok0Var.r;
                        nk0 nk0Var = ok0Var.b;
                        if (z10 && (nk0Var.getImageReceiver().getLottieAnimation() != null || nk0Var.getImageReceiver().getAnimation() != null)) {
                            nk0Var.setVisibility(0);
                            ok0Var.a.setVisibility(4);
                            if (ok0Var.s) {
                                ok0Var.v = true;
                            }
                        }
                        ok0Var.invalidate();
                    }
                    i10++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.a0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(ng.q0.d(reaction));
        }
        this.U.l();
    }

    public void setTop(boolean z4) {
        this.I = z4;
    }

    public void setTransitionProgress(float f10) {
        this.v = f10;
        qo qoVar = this.G0;
        if (qoVar != null) {
            if (!this.H0 || !SharedConfig.deviceIsHigh()) {
                f10 = 1.0f;
            }
            qoVar.setReactionsTransitionProgress(f10);
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
