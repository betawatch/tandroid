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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class fk0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Cells.c1 k1 = new org.telegram.ui.Cells.c1(Float.class, "transitionProgress", 2);
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
    public ro J0;
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
    public d90 R0;
    public ah.w S;
    public int S0;
    public final ArrayList T;
    public int T0;
    public final ArrayList U;
    public float U0;
    public final ArrayList V;
    public float V0;
    public final hg.j0 W;
    public dh.d W0;
    public dh.d X0;
    public dh.d Y0;
    public bh.b Z0;
    public boolean a;
    public final vj0 a0;
    public eh.e a1;
    public final bi.o0 b;
    public final RectF b0;
    public boolean b1;
    public final float c;
    public boolean c0;
    public boolean c1;
    public final ArrayList d;
    public final HashSet d0;
    public ro d1;
    public final ArrayList e;
    public final HashSet e0;
    public boolean e1;
    public final Paint f;
    public final int[] f0;
    public boolean f1;
    public ek0 g0;
    public boolean g1;
    public final Paint h;
    public final Rect h0;
    public Paint h1;
    public final Drawable i0;
    public Matrix i1;
    public final boolean j0;
    public LinearGradient j1;
    public final org.telegram.ui.ActionBar.f6 k0;
    public ah.j1 l0;
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
    public sg.e1 u0;
    public float v;
    public rr v0;
    public final RectF w;
    public float w0;
    public final Path x;
    public ah.u0 x0;
    public float y;
    public ValueAnimator y0;
    public final dk0 z0;

    public fk0(int i10, int i11, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
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
        paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var));
        paint3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Jj, f6Var));
        this.k0 = f6Var;
        this.J = i11;
        this.t0 = n2Var;
        dk0 dk0Var = new dk0(this, context);
        this.z0 = dk0Var;
        dk0Var.setVisibility(8);
        dk0Var.O = false;
        dk0Var.c.setVisibility(8);
        addView(dk0Var);
        this.j0 = SharedConfig.animationsEnabled() && SharedConfig.getDevicePerformanceClass() != 0;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.i0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Td, false), PorterDuff.Mode.MULTIPLY));
        bi.o0 o0Var = new bi.o0(this, context, 18);
        this.b = o0Var;
        o0Var.setClipChildren(false);
        o0Var.setClipToPadding(false);
        hg.j0 j0Var = new hg.j0((ViewGroup) this, 4);
        this.W = j0Var;
        o0Var.i(new sj0(this, 0));
        o0Var.setLayoutManager(j0Var);
        o0Var.setOverScrollMode(2);
        vj0 vj0Var = new vj0(this);
        this.a0 = vj0Var;
        o0Var.setAdapter(vj0Var);
        o0Var.j(new zj0(this));
        o0Var.j(new lb0(this, 2));
        o0Var.i(new sj0(this, 1));
        o0Var.setOnItemClickListener(new k(this, 11));
        o0Var.setOnItemLongClickListener((bl0) new i2.t(this, i10, 8));
        addView(o0Var, w7.x5.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (o0Var.getLayoutParams().height - o0Var.getPaddingTop()) - o0Var.getPaddingBottom();
        dk0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        dk0Var.getLayoutParams().height = paddingTop;
        if (i10 == 2 || i10 == 4) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
        }
        MediaDataController.getInstance(i11).preloadDefaultReactions();
    }

    public static void a(fk0 fk0Var) {
        if (fk0Var.x0 != null) {
            return;
        }
        ah.u0 u0Var = new ah.u0(fk0Var.M0, fk0Var.t0, fk0Var.V, fk0Var.d0, fk0Var, fk0Var.k0, fk0Var.a);
        fk0Var.x0 = u0Var;
        bh.b bVar = fk0Var.Z0;
        boolean z10 = true;
        if (bVar != null) {
            eh.e eVar = fk0Var.a1;
            org.telegram.ui.a61 a61Var = u0Var.m.f0;
            a61Var.x = true;
            a61Var.setBackground(null);
            a61Var.d();
            a61Var.invalidate();
            dh.d c10 = bVar.c(u0Var.a, null, true);
            c10.n(eVar);
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            u0Var.z = c10;
        }
        ah.u0 u0Var2 = fk0Var.x0;
        ek0 ek0Var = fk0Var.g0;
        if (ek0Var != null && !ek0Var.n()) {
            z10 = false;
        }
        u0Var2.m.setLongPressEnabled(z10);
        fk0Var.j();
        fk0Var.x0.p = new cc0(fk0Var, 16);
        fk0Var.m();
    }

    public static void b(fk0 fk0Var, View view, float f7) {
        if (view instanceof dk0) {
            ((dk0) view).h = f7;
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
        int i10 = 0;
        boolean z10 = true;
        while (i10 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            hashSet.clear();
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        ah.j1 d = ah.j1.d(messageObject.messageOwner.reactions.results.get(i11).reaction);
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
                hashSet2.add((ah.j1) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    public final void d() {
        ah.u0 u0Var = this.x0;
        if (u0Var != null) {
            if (!u0Var.q) {
                u0Var.q = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                int i10 = 0;
                ofFloat.addUpdateListener(new ah.k0(u0Var, i10));
                ofFloat.addListener(new ah.s0(u0Var, i10));
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
            bi.o0 o0Var = this.b;
            o0Var.invalidate();
            o0Var.e1();
            for (int i12 = 0; i12 < o0Var.getChildCount(); i12++) {
                View childAt = o0Var.getChildAt(i12);
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
        d90 d90Var;
        ah.j1 j1Var;
        int i10;
        ah.j1 j1Var2;
        float width;
        float f7;
        float f10;
        float max;
        float f11;
        ro roVar;
        float f12;
        int i11;
        float f13;
        RectF rectF;
        float f14;
        float f15;
        int i12;
        RectF rectF2;
        bi.o0 o0Var;
        float f16;
        boolean q6;
        RectF rectF3;
        int i13;
        RectF rectF4;
        int i14;
        bi.o0 o0Var2;
        float f17;
        int R;
        float f18;
        float f19;
        float x10;
        float scaleX;
        float f20;
        float f21;
        q5 q5Var;
        bi.y3 y3Var;
        int i15;
        int i16;
        ek0 ek0Var;
        float f22;
        Canvas canvas2 = canvas;
        long min = Math.min(16L, System.currentTimeMillis() - this.P);
        this.P = System.currentTimeMillis();
        boolean z10 = this.N;
        if (z10) {
            float f23 = this.O;
            if (f23 != 1.0f) {
                this.O = Math.min(1.0f, (min / 220.0f) + f23);
                invalidate();
                d90Var = this.R0;
                if (d90Var != null) {
                    d90Var.setTranslationY(-g());
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
                j1Var = this.l0;
                i10 = this.M0;
                if (j1Var != null && i10 != 5 && ((ek0Var = this.g0) == null || ek0Var.n())) {
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
                j1Var2 = this.l0;
                if (j1Var2 == null && j1Var2.a) {
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
                roVar = this.d1;
                if (roVar != null) {
                    roVar.setExpandSize(g10);
                }
                float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f11);
                float topOffset = getTopOffset();
                float paddingTop = getPaddingTop();
                bi.o0 o0Var3 = this.b;
                float f28 = f11;
                float f29 = max;
                RectF rectF5 = this.w;
                rectF5.set(getPaddingLeft() + width2, (((1.0f - this.q0) * o0Var3.getMeasuredHeight()) + paddingTop) - g10, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g10);
                this.y = com.google.android.gms.internal.vision.e2.v(g10, 2.0f, rectF5.height() - topOffset, 2.0f);
                if (i10 == 1) {
                    f12 = 255.0f;
                    int clamp = (int) (Utilities.clamp(1.0f - (this.w0 / 0.05f), 1.0f, 0.0f) * 255.0f);
                    Drawable drawable = this.i0;
                    drawable.setAlpha(clamp);
                    float paddingLeft = getPaddingLeft();
                    int width3 = getWidth() - getPaddingRight();
                    Rect rect = this.h0;
                    int i17 = (int) g10;
                    drawable.setBounds((int) ((((width3 + rect.right) * f28) + paddingLeft) - rect.left), (getPaddingTop() - rect.top) - i17, (int) (((getWidth() - getPaddingRight()) + rect.right) * f29), (getHeight() - getPaddingBottom()) + rect.bottom + i17);
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
                    if (i10 == 1 || this.g0.S()) {
                        i15 = save2;
                        i11 = i10;
                        rectF = rectF5;
                        f13 = f27;
                        i16 = 1;
                        this.g0.I(canvas, rectF, this.y, getX(), getY(), 255, false);
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
                        i15 = save2;
                        i11 = i10;
                        f13 = f27;
                        rectF = rectF5;
                        i16 = 1;
                    }
                    if (this.c0) {
                        Iterator it = this.d0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                float f32 = this.y;
                                float clamp01 = Utilities.clamp01(1.0f - getPullingLeftProgress());
                                if (this.h1 == null) {
                                    this.h1 = new Paint(i16);
                                }
                                if (this.i1 == null) {
                                    this.i1 = new Matrix();
                                }
                                if (this.j1 == null) {
                                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Jj, this.k0);
                                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{v02, org.telegram.ui.ActionBar.j6.l1(0.0f, v02)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                    this.j1 = linearGradient;
                                    this.h1.setShader(linearGradient);
                                }
                                this.i1.reset();
                                this.i1.postTranslate(rectF.left, rectF.top);
                                this.j1.setLocalMatrix(this.i1);
                                this.h1.setAlpha((int) (clamp01 * f12));
                                canvas2.drawRoundRect(rectF, f32, f32, this.h1);
                            } else if (((ah.j1) it.next()).a) {
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
                        while (i19 < o0Var3.getChildCount()) {
                            View childAt = o0Var3.getChildAt(i19);
                            int abs = (this.v == 1.0f || !SharedConfig.deviceIsHigh()) ? i21 : (int) (Math.abs((((childAt.getMeasuredWidth() / f14) + childAt.getLeft()) / o0Var3.getMeasuredWidth()) - 0.8f) * 200.0f);
                            float f34 = f25;
                            if (childAt instanceof dk0) {
                                dk0 dk0Var = (dk0) o0Var3.getChildAt(i19);
                                i14 = i19;
                                if (this.B0 != 0.0f) {
                                    i13 = save3;
                                    f19 = AndroidUtilities.dp(46.0f) * Utilities.clamp(dk0Var.getLeft() / (getMeasuredWidth() - AndroidUtilities.dp(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress();
                                } else {
                                    i13 = save3;
                                    f19 = 0.0f;
                                }
                                ah.j1 j1Var3 = dk0Var.e;
                                ck0 ck0Var = dk0Var.a;
                                float f35 = f19;
                                ck0 ck0Var2 = dk0Var.b;
                                ck0 ck0Var3 = dk0Var.c;
                                rectF4 = rectF;
                                if (j1Var3.equals(this.l0)) {
                                    ck0 ck0Var4 = ck0Var2.getVisibility() == 0 ? ck0Var2 : ck0Var;
                                    dk0Var.setPivotX(dk0Var.getMeasuredWidth() >> 1);
                                    dk0Var.setPivotY(ck0Var4.getY() + ck0Var4.getMeasuredHeight());
                                    dk0Var.setScaleX(this.p0);
                                    dk0Var.setScaleY(this.p0);
                                    if (!this.r0) {
                                        if (this.Q == null) {
                                            ck0Var3.setVisibility(0);
                                            ck0Var3.setAlpha(1.0f);
                                            if (ck0Var3.getImageReceiver().hasBitmapImage() || ((q5Var = ck0Var3.e) != null && (y3Var = q5Var.k) != null && y3Var.hasBitmapImage())) {
                                                ck0Var4.setAlpha(0.0f);
                                            }
                                            f21 = 1.0f;
                                        } else {
                                            f21 = 1.0f;
                                            ck0Var3.setAlpha(1.0f - this.o0);
                                            ck0Var4.setAlpha(this.o0);
                                        }
                                        if (this.n0 == f21) {
                                            this.r0 = true;
                                            if (System.currentTimeMillis() - this.s0 > 300) {
                                                this.s0 = System.currentTimeMillis();
                                                o0Var2 = o0Var3;
                                                this.g0.B(dk0Var, dk0Var.e, true, false);
                                                canvas2.save();
                                                x10 = dk0Var.getX() + o0Var2.getX();
                                                scaleX = ((dk0Var.getScaleX() * dk0Var.getMeasuredWidth()) - dk0Var.getMeasuredWidth()) / f14;
                                                f20 = x10 - scaleX;
                                                if (f20 >= 0.0f && dk0Var.getTranslationX() >= 0.0f) {
                                                    dk0Var.setTranslationX((-f20) - f35);
                                                } else if (dk0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth() || dk0Var.getTranslationX() > 0.0f) {
                                                    dk0Var.setTranslationX(0.0f - f35);
                                                } else {
                                                    dk0Var.setTranslationX((((getMeasuredWidth() - x10) - dk0Var.getMeasuredWidth()) - scaleX) - f35);
                                                }
                                                canvas2.translate(dk0Var.getX() + o0Var2.getX(), dk0Var.getY() + o0Var2.getY());
                                                canvas2.scale(dk0Var.getScaleX(), dk0Var.getScaleY(), dk0Var.getPivotX(), dk0Var.getPivotY());
                                                dk0Var.draw(canvas2);
                                                canvas2.restore();
                                            }
                                        }
                                    }
                                    o0Var2 = o0Var3;
                                    canvas2.save();
                                    x10 = dk0Var.getX() + o0Var2.getX();
                                    scaleX = ((dk0Var.getScaleX() * dk0Var.getMeasuredWidth()) - dk0Var.getMeasuredWidth()) / f14;
                                    f20 = x10 - scaleX;
                                    if (f20 >= 0.0f) {
                                    }
                                    if (dk0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth()) {
                                    }
                                    dk0Var.setTranslationX(0.0f - f35);
                                    canvas2.translate(dk0Var.getX() + o0Var2.getX(), dk0Var.getY() + o0Var2.getY());
                                    canvas2.scale(dk0Var.getScaleX(), dk0Var.getScaleY(), dk0Var.getPivotX(), dk0Var.getPivotY());
                                    dk0Var.draw(canvas2);
                                    canvas2.restore();
                                } else {
                                    o0Var2 = o0Var3;
                                    int R2 = RecyclerView.R(dk0Var);
                                    float measuredWidth = (((this.p0 - 1.0f) * dk0Var.getMeasuredWidth()) / 3.0f) - (((1.0f - this.q0) * dk0Var.getMeasuredWidth()) * (Math.abs(this.m0 - R2) - 1));
                                    if (R2 < this.m0) {
                                        dk0Var.setPivotX(0.0f);
                                        dk0Var.setTranslationX(-measuredWidth);
                                    } else {
                                        dk0Var.setPivotX(dk0Var.getMeasuredWidth() - f35);
                                        dk0Var.setTranslationX(measuredWidth - f35);
                                    }
                                    dk0Var.setPivotY(ck0Var.getY() + ck0Var.getMeasuredHeight());
                                    dk0Var.setScaleX(this.q0);
                                    dk0Var.setScaleY(this.q0);
                                    ck0Var3.setVisibility(4);
                                    ck0Var.setAlpha(1.0f);
                                }
                                if (childAt.getLeft() > i20) {
                                    i20 = childAt.getLeft();
                                }
                                if (!this.N0 && (!dk0Var.r || ck0Var.getImageReceiver().getLottieAnimation() != null)) {
                                    if ((dk0Var.getMeasuredWidth() / f14) + dk0Var.getX() > 0.0f && (dk0Var.getMeasuredWidth() / f14) + dk0Var.getX() < o0Var2.getWidth()) {
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
                                o0Var2 = o0Var3;
                                if (childAt == this.R) {
                                    if ((childAt.getMeasuredWidth() / f14) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f14) + childAt.getX() >= o0Var2.getWidth()) {
                                        sg.e1 e1Var = this.u0;
                                        f17 = 0.0f;
                                        e1Var.setScaleX(0.0f);
                                        e1Var.setScaleY(0.0f);
                                        if (childAt == this.S) {
                                            if ((childAt.getMeasuredWidth() / f14) + childAt.getX() <= f17 || (childAt.getMeasuredWidth() / f14) + childAt.getX() >= o0Var2.getWidth()) {
                                                rr rrVar = this.v0;
                                                rrVar.setScaleX(0.0f);
                                                rrVar.setScaleY(0.0f);
                                                ((fk0) rrVar.c).S.invalidate();
                                                ValueAnimator valueAnimator = (ValueAnimator) rrVar.b;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                            } else {
                                                if (!hashSet.contains(childAt)) {
                                                    if (this.v != 1.0f) {
                                                        rr rrVar2 = this.v0;
                                                        rrVar2.setScaleX(0.0f);
                                                        rrVar2.setScaleY(0.0f);
                                                        ((fk0) rrVar2.c).S.invalidate();
                                                        ValueAnimator valueAnimator2 = (ValueAnimator) rrVar2.b;
                                                        if (valueAnimator2 != null) {
                                                            valueAnimator2.cancel();
                                                        }
                                                    }
                                                    rr rrVar3 = this.v0;
                                                    boolean z11 = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || SharedConfig.getDevicePerformanceClass() >= 1;
                                                    rrVar3.invalidate();
                                                    ValueAnimator valueAnimator3 = (ValueAnimator) rrVar3.b;
                                                    if (valueAnimator3 != null) {
                                                        valueAnimator3.removeAllListeners();
                                                        ((ValueAnimator) rrVar3.b).cancel();
                                                    }
                                                    if (z11) {
                                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(rrVar3.getScaleX(), 1.0f);
                                                        rrVar3.b = ofFloat;
                                                        ofFloat.setInterpolator(AndroidUtilities.overshootInterpolator);
                                                        ((ValueAnimator) rrVar3.b).addUpdateListener(new h70(rrVar3, 7));
                                                        ((ValueAnimator) rrVar3.b).setStartDelay((long) (abs * ((fk0) rrVar3.c).c));
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
                                                sg.e1 e1Var2 = this.u0;
                                                f18 = 0.0f;
                                                e1Var2.setScaleX(0.0f);
                                                e1Var2.setScaleY(0.0f);
                                            } else {
                                                f18 = 0.0f;
                                            }
                                            sg.e1 e1Var3 = this.u0;
                                            org.telegram.ui.Components.voip.h hVar = e1Var3.J;
                                            if (hVar != null) {
                                                hVar.g = f18;
                                                hVar.j = false;
                                            }
                                            e1Var3.invalidate();
                                            e1Var3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(abs).setInterpolator(AndroidUtilities.overshootInterpolator).setDuration(300L);
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
                            i21 = abs;
                            i19 = i14 + 1;
                            canvas2 = canvas;
                            f25 = f34;
                            save3 = i13;
                            o0Var3 = o0Var2;
                            rectF = rectF4;
                        }
                        i12 = save3;
                        rectF2 = rectF;
                        o0Var = o0Var3;
                        f16 = f25;
                        dk0 dk0Var2 = this.z0;
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
                            dk0Var2.setTranslationX(((o0Var.getX() + f36) - clamp2) + (-((i18 == 1 || i18 == 2) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(20.0f))));
                            if (dk0Var2.getVisibility() != 0) {
                                dk0Var2.setVisibility(0);
                            }
                        } else {
                            if (dk0Var2.getVisibility() != 8 && this.O0) {
                                dk0Var2.setVisibility(8);
                            }
                            if (dk0Var2.getTag() != null) {
                                dk0Var2.setTag(null);
                            }
                        }
                        if (!this.c1 && this.x0 != null) {
                            int A = (int) org.telegram.messenger.w1.A(1.0f, this.w0, Utilities.clamp(1.0f - (this.w0 / 0.2f), 1.0f, 0.0f), 255.0f);
                            canvas.save();
                            f(f24, max2, f16, A, canvas);
                            canvas.restore();
                            return;
                        }
                        float f37 = f16;
                        q6 = q();
                        if (!q6) {
                            canvas.clipPath(path);
                        }
                        canvas.translate((1.0f - this.v) * getWidth() * ((!LocaleController.isRTL || this.M) ? -1 : 1), 0.0f);
                        o0Var.setTranslationX(-width2);
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
                o0Var = o0Var3;
                f16 = f25;
                if (!this.c1) {
                }
                float f372 = f16;
                q6 = q();
                if (!q6) {
                }
                canvas.translate((1.0f - this.v) * getWidth() * ((!LocaleController.isRTL || this.M) ? -1 : 1), 0.0f);
                o0Var.setTranslationX(-width2);
                super.dispatchDraw(canvas);
                if (!q6) {
                }
                canvas.restoreToCount(i12);
                f(f24, max2, f372, 255, canvas);
                invalidate();
            }
        }
        if (!z10) {
            float f38 = this.O;
            if (f38 != 0.0f) {
                this.O = Math.max(0.0f, f38 - (min / 220.0f));
                invalidate();
            }
        }
        d90Var = this.R0;
        if (d90Var != null) {
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
        j1Var = this.l0;
        i10 = this.M0;
        if (j1Var != null) {
            f22 = this.n0;
            if (f22 != 1.0f) {
            }
        }
        j1Var2 = this.l0;
        if (j1Var2 == null) {
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
        roVar = this.d1;
        if (roVar != null) {
        }
        float width22 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f11);
        float topOffset2 = getTopOffset();
        float paddingTop2 = getPaddingTop();
        bi.o0 o0Var32 = this.b;
        float f282 = f11;
        float f292 = max;
        RectF rectF52 = this.w;
        rectF52.set(getPaddingLeft() + width22, (((1.0f - this.q0) * o0Var32.getMeasuredHeight()) + paddingTop2) - g102, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g102);
        this.y = com.google.android.gms.internal.vision.e2.v(g102, 2.0f, rectF52.height() - topOffset2, 2.0f);
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
        i12 = save32;
        rectF2 = rectF;
        o0Var = o0Var32;
        f16 = f252;
        if (!this.c1) {
        }
        float f3722 = f16;
        q6 = q();
        if (!q6) {
        }
        canvas.translate((1.0f - this.v) * getWidth() * ((!LocaleController.isRTL || this.M) ? -1 : 1), 0.0f);
        o0Var.setTranslationX(-width22);
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
        ah.u0 u0Var = this.x0;
        if (u0Var != null) {
            u0Var.d();
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
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), pr.f.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f13 = rectF.bottom;
            pr prVar = pr.f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f13, 0.0f, prVar.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), prVar.getInterpolation(this.O)));
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
        boolean S = this.g0.S();
        float f20 = paddingTop;
        RectF rectF2 = this.b0;
        if (S) {
            rectF2.set(f14, f17, f18, f19);
            f12 = f7;
            this.g0.I(canvas, rectF2, f12, getX(), getY(), i10, false);
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
        float lerp = AndroidUtilities.lerp(z12 ? (getPaddingTop() - g()) - AndroidUtilities.dp(16.0f) : ((getHeight() - f22) - f15) + g(), (f22 + f15) - g(), pr.f.getInterpolation(this.O));
        float f23 = (-AndroidUtilities.dp(1.0f)) * f10;
        drawable.setBounds((int) ((width2 - f12) - f23), (int) ((lerp - f12) - f23), (int) (width2 + f12 + f23), (int) (f12 + lerp + f23));
        drawable.draw(canvas);
        if (this.g0.S()) {
            rectF2.set(width2 - f11, lerp - f11, width2 + f11, lerp + f11);
            this.g0.I(canvas, rectF2, f11, getX(), getY(), i10, false);
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

    public ek0 getDelegate() {
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

    public ah.u0 getReactionsWindow() {
        return this.x0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f7;
        HashSet hashSet = this.d0;
        if (hashSet.isEmpty()) {
            return "";
        }
        ah.j1 j1Var = (ah.j1) hashSet.iterator().next();
        long j3 = j1Var.g;
        String str = null;
        if (j3 != 0 && (f7 = q5.f(this.J, j3)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = j1Var.f;
        }
        return TextUtils.isEmpty(str) ? "👍" : str;
    }

    public HashSet<ah.j1> getSelectedReactions() {
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
        return AndroidUtilities.dp(16.0f) + com.google.android.gms.internal.vision.e2.w(itemsCount, 1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(36.0f) * itemsCount);
    }

    public List<ah.j1> getVisibleReactionsList() {
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
        ah.u0 u0Var = this.x0;
        if (u0Var == null) {
            return null;
        }
        return u0Var.c;
    }

    public final void h(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.M0;
        if (i11 == 4) {
            Iterator it = this.d0.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                ah.j1 j1Var = (ah.j1) it.next();
                if (!hashSet.contains(j1Var)) {
                    hashSet.add(j1Var);
                    arrayList.add(j1Var);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.J).getEnabledReactionsList();
            while (i10 < enabledReactionsList.size()) {
                ah.j1 c10 = ah.j1.c(enabledReactionsList.get(i10));
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
                    arrayList.add(ah.j1.c(enabledReactionsList2.get(i10)));
                    i10++;
                }
                return;
            }
            ArrayList<TLRPC.Reaction> savedReactions = MediaDataController.getInstance(this.J).getSavedReactions();
            int i13 = 0;
            while (i10 < savedReactions.size()) {
                ah.j1 d = ah.j1.d(savedReactions.get(i10));
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
                    ah.j1 e7 = ah.j1.e(availableEffects.effects.get(i10));
                    if (!hashSet.contains(e7)) {
                        hashSet.add(e7);
                        arrayList.add(e7);
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
                    ah.j1 d10 = ah.j1.d(savedReactionTags.tags.get(i14).reaction);
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            }
            for (int i15 = 0; i15 < savedReactions2.size(); i15++) {
                ah.j1 d11 = ah.j1.d(savedReactions2.get(i15));
                if (!hashSet.contains(d11)) {
                    hashSet.add(d11);
                    arrayList.add(d11);
                }
            }
        } else {
            for (int i16 = 0; i16 < savedReactions2.size(); i16++) {
                ah.j1 d12 = ah.j1.d(savedReactions2.get(i16));
                if (!hashSet.contains(d12) && (i11 == 3 || UserConfig.getInstance(this.J).isPremium() || d12.g == 0)) {
                    hashSet.add(d12);
                    arrayList.add(d12);
                }
            }
        }
        if (i11 != 3 || UserConfig.getInstance(this.J).isPremium()) {
            ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.J).getRecentReactions();
            for (int i17 = 0; i17 < recentReactions.size(); i17++) {
                ah.j1 d13 = ah.j1.d(recentReactions.get(i17));
                if (!hashSet.contains(d13)) {
                    hashSet.add(d13);
                    arrayList.add(d13);
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList3 = MediaDataController.getInstance(this.J).getEnabledReactionsList();
            while (i10 < enabledReactionsList3.size()) {
                ah.j1 c11 = ah.j1.c(enabledReactionsList3.get(i10));
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
            bi.o0 o0Var = this.b;
            if (i10 >= o0Var.getChildCount()) {
                return;
            }
            View childAt = o0Var.getChildAt(i10);
            if (childAt instanceof dk0) {
                ((dk0) childAt).b.invalidate();
            }
            i10++;
        }
    }

    public final void k() {
        int dp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, w02, 0, tileMode));
        this.n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, w02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, ah.j1 j1Var, boolean z10) {
        ek0 ek0Var = this.g0;
        if (ek0Var != null) {
            ek0Var.B(view, j1Var, z10, true);
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
        rj0 rj0Var = new rj0(this, 1);
        bi.o0 o0Var = this.b;
        AndroidUtilities.forEachViews((RecyclerView) o0Var, (e2.h) rj0Var);
        this.C0.clear();
        o0Var.invalidate();
        ah.w wVar = this.S;
        if (wVar != null) {
            wVar.invalidate();
        }
        invalidate();
    }

    public final void o(bh.b bVar, eh.e eVar) {
        this.Z0 = bVar;
        this.a1 = eVar;
        dh.d c10 = bVar.c(this, null, true);
        c10.n(eVar);
        c10.p(AndroidUtilities.dp(24.0f));
        c10.o(AndroidUtilities.dp(8.0f));
        this.W0 = c10;
        dh.d c11 = bVar.c(this, null, true);
        c11.n(eVar);
        c11.p(AndroidUtilities.dp(8.0f));
        c11.o(AndroidUtilities.dp(8.0f));
        this.X0 = c11;
        dh.d c12 = bVar.c(this, null, true);
        c12.n(eVar);
        c12.p(AndroidUtilities.dp(4.0f));
        c12.o(AndroidUtilities.dp(8.0f));
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
                ah.j1 j1Var = new ah.j1();
                j1Var.a = true;
                arrayList2.add(j1Var);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.H.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i13);
                i13++;
                arrayList2.add(ah.j1.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.c0 = true;
                ah.j1 j1Var2 = new ah.j1();
                j1Var2.a = true;
                arrayList2.add(j1Var2);
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
                                    arrayList2.add(ah.j1.d(reaction2));
                                    break;
                                }
                            } else {
                                arrayList2.add(ah.j1.d(reaction2));
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
                hashSet.add((ah.j1) arrayList2.get(i15));
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
            if (dp < 1) {
                dp = 1;
            }
            int i16 = 0;
            while (i16 < Math.min(arrayList2.size(), dp)) {
                arrayList5.add((ah.j1) arrayList2.get(i16));
                i16++;
            }
            if (i16 < arrayList2.size()) {
                dk0.a(this.z0, (ah.j1) arrayList2.get(i16), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.G0 = true;
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (((ah.j1) arrayList5.get(i17)).g != 0) {
                this.G0 = false;
            }
        }
        ArrayList arrayList6 = this.V;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        vj0 vj0Var = this.a0;
        fk0 fk0Var = vj0Var.d;
        ArrayList arrayList7 = fk0Var.e;
        ArrayList arrayList8 = fk0Var.T;
        ArrayList arrayList9 = fk0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i18 = 0; i18 < arrayList8.size(); i18++) {
            ah.j1 j1Var3 = (ah.j1) arrayList8.get(i18);
            arrayList9.add(new wj0(j1Var3.f == null ? 3 : 0, j1Var3));
        }
        if (!fk0Var.U.isEmpty() && !MessagesController.getInstance(fk0Var.J).premiumFeaturesBlocked()) {
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
                this.d0.add(ah.j1.d(messageObject.messageOwner.reactions.results.get(i19).reaction));
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
        org.telegram.ui.Cells.c1 c1Var = k1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, c1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, c1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new di.v5(this, 1));
        duration.start();
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        if (getAlpha() != f7 && f7 == 0.0f) {
            this.C0.clear();
            int i10 = 0;
            while (true) {
                bi.o0 o0Var = this.b;
                if (i10 >= o0Var.getChildCount()) {
                    break;
                }
                if (o0Var.getChildAt(i10) instanceof dk0) {
                    ((dk0) o0Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f7);
    }

    public void setBubbleOffset(float f7) {
        this.U0 = f7;
    }

    public void setChatScrimView(ro roVar) {
        this.d1 = roVar;
    }

    public void setCurrentAccount(int i10) {
        this.J = i10;
    }

    public void setCustomEmojiEnterProgress(float f7) {
        this.w0 = f7;
        ro roVar = this.d1;
        if (roVar != null) {
            roVar.setPopupAlpha(1.0f - f7);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            this.v0.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 40)));
        } else {
            this.v0.setBackground(null);
        }
    }

    public void setDelegate(ek0 ek0Var) {
        this.g0 = ek0Var;
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
            org.telegram.ui.ActionBar.f6 f6Var = this.k0;
            d90 d90Var = new d90(context, f6Var);
            this.R0 = d90Var;
            d90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.R0.setClickable(true);
            this.R0.setTextSize(1, 12.0f);
            int i10 = this.M0;
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                this.R0.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
                this.R0.setAlpha(0.5f);
            } else {
                this.R0.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
            }
            this.R0.setGravity(1);
            addView(this.R0, w7.x5.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
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

    public void setParentLayout(ro roVar) {
        this.J0 = roVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            ah.j1 b10 = ah.j1.b(str);
            hashSet.add(b10);
            this.e0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (e2.h) new rj0(this, 0));
    }

    public void setSelectedReaction(ah.j1 j1Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (j1Var != null) {
            hashSet.add(j1Var);
        }
        this.a0.l();
    }

    public void setSelectedReactionAnimated(ah.j1 j1Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (j1Var != null) {
            hashSet.add(j1Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (e2.h) new rj0(this, 0));
    }

    public void setSelectedReactionInclusive(ah.j1 j1Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (j1Var != null) {
            hashSet.add(j1Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (e2.h) new rj0(this, 0));
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
                        hashSet.add(ah.j1.d(messageObject.messageOwner.reactions.results.get(i11).reaction));
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
        AndroidUtilities.forEachViews((RecyclerView) this.b, (e2.h) new rj0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.c1 != z10) {
            this.c1 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    bi.o0 o0Var = this.b;
                    if (i10 >= o0Var.getChildCount()) {
                        break;
                    }
                    if (o0Var.getChildAt(i10) instanceof dk0) {
                        dk0 dk0Var = (dk0) o0Var.getChildAt(i10);
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
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(ah.j1.d(reaction));
        }
        this.a0.l();
    }

    public void setTop(boolean z10) {
        this.L = z10;
    }

    public void setTransitionProgress(float f7) {
        this.v = f7;
        ro roVar = this.J0;
        if (roVar != null) {
            if (!this.K0 || !SharedConfig.deviceIsHigh()) {
                f7 = 1.0f;
            }
            roVar.setReactionsTransitionProgress(f7);
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
