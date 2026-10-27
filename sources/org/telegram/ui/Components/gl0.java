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
import org.telegram.messenger.FileLog;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class gl0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public static final org.telegram.ui.Cells.b1 l1 = new org.telegram.ui.Cells.b1(Float.class, "transitionProgress", 2);
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
    public fp J0;
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
    public aa0 R0;
    public bh.p S;
    public int S0;
    public final ArrayList T;
    public int T0;
    public final ArrayList U;
    public float U0;
    public final ArrayList V;
    public float V0;
    public final ig.j0 W;
    public eh.d W0;
    public eh.d X0;
    public eh.d Y0;
    public ch.b Z0;
    public boolean a;
    public final wk0 a0;
    public fh.e a1;
    public final bi.r1 b;
    public final RectF b0;
    public int b1;
    public final float c;
    public boolean c0;
    public boolean c1;
    public final ArrayList d;
    public final HashSet d0;
    public boolean d1;
    public final ArrayList e;
    public final HashSet e0;
    public fp e1;
    public final Paint f;
    public final int[] f0;
    public boolean f1;
    public fl0 g0;
    public boolean g1;
    public final Paint h;
    public final Rect h0;
    public boolean h1;
    public final Drawable i0;
    public Paint i1;
    public final boolean j0;
    public Matrix j1;
    public final org.telegram.ui.ActionBar.u6 k0;
    public LinearGradient k1;
    public bh.x0 l0;
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
    public org.telegram.ui.ActionBar.r2 t0;
    public tg.c1 u0;
    public float v;
    public fs v0;
    public final RectF w;
    public float w0;
    public final Path x;
    public bh.i0 x0;
    public float y;
    public ValueAnimator y0;
    public final el0 z0;

    public gl0(int i10, int i11, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
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
        this.g1 = false;
        this.M0 = i10;
        this.c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i6, u6Var));
        paint3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Jj, u6Var));
        this.k0 = u6Var;
        this.J = i11;
        this.t0 = r2Var;
        el0 el0Var = new el0(this, context);
        this.z0 = el0Var;
        el0Var.setVisibility(8);
        el0Var.O = false;
        el0Var.c.setVisibility(8);
        addView(el0Var);
        this.j0 = SharedConfig.animationsEnabled() && SharedConfig.getDevicePerformanceClass() != 0;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.i0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.Td, null, PorterDuff.Mode.MULTIPLY);
        bi.r1 r1Var = new bi.r1(this, context, 19);
        this.b = r1Var;
        r1Var.setClipChildren(false);
        r1Var.setClipToPadding(false);
        ig.j0 j0Var = new ig.j0((ViewGroup) this, 4);
        this.W = j0Var;
        r1Var.i(new tk0(this, 0));
        r1Var.setLayoutManager(j0Var);
        r1Var.setOverScrollMode(2);
        wk0 wk0Var = new wk0(this);
        this.a0 = wk0Var;
        r1Var.setAdapter(wk0Var);
        r1Var.j(new al0(this));
        r1Var.j(new ml(this, 10));
        r1Var.i(new tk0(this, 1));
        r1Var.setOnItemClickListener(new j(this, 11));
        r1Var.setOnItemLongClickListener((cm0) new i2.r(this, i10, 9));
        addView(r1Var, kb1.g(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (r1Var.getLayoutParams().height - r1Var.getPaddingTop()) - r1Var.getPaddingBottom();
        el0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        el0Var.getLayoutParams().height = paddingTop;
        if (i10 == 2 || i10 == 4) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, u6Var));
        }
        MediaDataController.getInstance(i11).preloadDefaultReactions();
    }

    public static void a(gl0 gl0Var) {
        if (gl0Var.x0 != null) {
            return;
        }
        bh.i0 i0Var = new bh.i0(gl0Var.M0, gl0Var.t0, gl0Var.V, gl0Var.d0, gl0Var, gl0Var.k0, gl0Var.a);
        gl0Var.x0 = i0Var;
        ch.b bVar = gl0Var.Z0;
        boolean z10 = true;
        if (bVar != null) {
            fh.e eVar = gl0Var.a1;
            org.telegram.ui.w41 w41Var = i0Var.m.f0;
            w41Var.x = true;
            w41Var.setBackground(null);
            w41Var.updateColors();
            w41Var.invalidate();
            eh.d c10 = bVar.c(i0Var.a, null, true);
            c10.v(eVar);
            org.telegram.messenger.wh.s(c10, AndroidUtilities.dp(12.0f), 8.0f);
            i0Var.z = c10;
        }
        bh.i0 i0Var2 = gl0Var.x0;
        fl0 fl0Var = gl0Var.g0;
        if (fl0Var != null && !fl0Var.f()) {
            z10 = false;
        }
        i0Var2.m.setLongPressEnabled(z10);
        gl0Var.j();
        gl0Var.x0.p = new xa0(gl0Var, 18);
        gl0Var.m();
    }

    public static void b(gl0 gl0Var, View view, float f7) {
        if (view instanceof el0) {
            ((el0) view).h = f7;
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
                        bh.x0 d = bh.x0.d(messageObject.messageOwner.reactions.results.get(i11).reaction);
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
                hashSet2.add((bh.x0) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.h5));
    }

    public final void d(boolean z10) {
        bh.i0 i0Var = this.x0;
        if (i0Var != null) {
            if (!i0Var.q || !z10) {
                i0Var.q = true;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    int i10 = 0;
                    ofFloat.addUpdateListener(new bh.z(i0Var, i10));
                    ofFloat.addListener(new bh.g0(i0Var, i10));
                    ofFloat.setDuration(150L);
                    ofFloat.start();
                } else {
                    i0Var.f();
                }
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
            bi.r1 r1Var = this.b;
            r1Var.invalidate();
            r1Var.g1();
            for (int i12 = 0; i12 < r1Var.getChildCount(); i12++) {
                View childAt = r1Var.getChildAt(i12);
                if (childAt instanceof el0) {
                    el0 el0Var = (el0) childAt;
                    el0Var.a.invalidate();
                    el0Var.b.invalidate();
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
        aa0 aa0Var;
        bh.x0 x0Var;
        int i10;
        bh.x0 x0Var2;
        float width;
        float f7;
        float f10;
        float max;
        float f11;
        fp fpVar;
        float f12;
        int i11;
        float f13;
        RectF rectF;
        int i12;
        float f14;
        float f15;
        int i13;
        RectF rectF2;
        bi.r1 r1Var;
        int i14;
        float f16;
        boolean q5;
        RectF rectF3;
        int i15;
        RectF rectF4;
        int i16;
        bi.r1 r1Var2;
        float f17;
        int R;
        float f18;
        float f19;
        float x9;
        float scaleX;
        float f20;
        float f21;
        t5 t5Var;
        di.f3 f3Var;
        int i17;
        fl0 fl0Var;
        float f22;
        Canvas canvas2 = canvas;
        long min = Math.min(16L, System.currentTimeMillis() - this.P);
        this.P = System.currentTimeMillis();
        boolean z10 = this.N;
        if (z10) {
            float f23 = this.O;
            if (f23 != 1.0f) {
                this.O = org.telegram.ui.d3.d(min, 220.0f, f23, 1.0f);
                invalidate();
                aa0Var = this.R0;
                if (aa0Var != null) {
                    aa0Var.setTranslationY(-g());
                }
                float max2 = (Math.max(0.25f, Math.min(this.v, 1.0f)) - 0.25f) / 0.75f;
                float f24 = this.E * max2;
                float f25 = this.F * max2;
                HashSet hashSet = this.D0;
                hashSet.clear();
                HashSet hashSet2 = this.C0;
                hashSet.addAll(hashSet2);
                hashSet2.clear();
                if (this.c1) {
                    invalidate();
                }
                x0Var = this.l0;
                i10 = this.M0;
                if (x0Var != null && i10 != 5 && ((fl0Var = this.g0) == null || fl0Var.f())) {
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
                x0Var2 = this.l0;
                if (x0Var2 == null && x0Var2.a) {
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
                float g7 = g();
                fpVar = this.e1;
                if (fpVar != null) {
                    fpVar.setExpandSize(g7);
                }
                float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f11);
                float topOffset = getTopOffset();
                float paddingTop = getPaddingTop();
                bi.r1 r1Var3 = this.b;
                float f28 = f11;
                float f29 = max;
                RectF rectF5 = this.w;
                rectF5.set(getPaddingLeft() + width2, (((1.0f - this.q0) * r1Var3.getMeasuredHeight()) + paddingTop) - g7, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g7);
                this.y = c3.h0.f(g7, 2.0f, rectF5.height() - topOffset, 2.0f);
                if (i10 == 1) {
                    f12 = 255.0f;
                    int clamp = (int) (Utilities.clamp(1.0f - (this.w0 / 0.05f), 1.0f, 0.0f) * 255.0f);
                    Drawable drawable = this.i0;
                    drawable.setAlpha(clamp);
                    float paddingLeft = getPaddingLeft();
                    int width3 = getWidth() - getPaddingRight();
                    Rect rect = this.h0;
                    int i18 = (int) g7;
                    drawable.setBounds((int) ((((width3 + rect.right) * f28) + paddingLeft) - rect.left), (getPaddingTop() - rect.top) - i18, (int) (((getWidth() - getPaddingRight()) + rect.right) * f29), (getHeight() - getPaddingBottom()) + rect.bottom + i18);
                    if (this.W0 == null) {
                        drawable.draw(canvas2);
                    }
                } else {
                    f12 = 255.0f;
                }
                canvas2.restoreToCount(save);
                if (this.d1) {
                    int save2 = canvas2.save();
                    float f30 = this.v;
                    if (f30 != 1.0f) {
                        f14 = 2.0f;
                        canvas2.scale(f30, f30, f27, getHeight() / 2.0f);
                    } else {
                        f14 = 2.0f;
                    }
                    if (i10 == 1 || this.g0.o()) {
                        i17 = save2;
                        i11 = i10;
                        rectF = rectF5;
                        f13 = f27;
                        i12 = 1;
                        this.g0.l(canvas, rectF, this.y, getX(), getY(), 255, false);
                        canvas2 = canvas;
                    } else {
                        eh.d dVar = this.W0;
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
                                if (this.i1 == null) {
                                    this.i1 = new Paint(i12);
                                }
                                if (this.j1 == null) {
                                    this.j1 = new Matrix();
                                }
                                if (this.k1 == null) {
                                    int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Jj, this.k0);
                                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{w02, org.telegram.ui.ActionBar.y6.o1(0.0f, w02)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                    this.k1 = linearGradient;
                                    this.i1.setShader(linearGradient);
                                }
                                this.j1.reset();
                                this.j1.postTranslate(rectF.left, rectF.top);
                                this.k1.setLocalMatrix(this.j1);
                                this.i1.setAlpha((int) (clamp01 * f12));
                                canvas2.drawRoundRect(rectF, f32, f32, this.i1);
                            } else if (((bh.x0) it.next()).a) {
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
                            if (i20 >= r1Var3.getChildCount()) {
                                break;
                            }
                            View childAt = r1Var3.getChildAt(i20);
                            int abs = (this.v == 1.0f || !SharedConfig.deviceIsHigh()) ? i22 : (int) (Math.abs((((childAt.getMeasuredWidth() / f14) + childAt.getLeft()) / r1Var3.getMeasuredWidth()) - 0.8f) * 200.0f);
                            float f34 = f25;
                            if (childAt instanceof el0) {
                                el0 el0Var = (el0) r1Var3.getChildAt(i20);
                                i16 = i20;
                                if (this.B0 != 0.0f) {
                                    i15 = save3;
                                    f19 = AndroidUtilities.dp(46.0f) * Utilities.clamp(el0Var.getLeft() / (getMeasuredWidth() - AndroidUtilities.dp(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress();
                                } else {
                                    i15 = save3;
                                    f19 = 0.0f;
                                }
                                bh.x0 x0Var3 = el0Var.e;
                                dl0 dl0Var = el0Var.a;
                                float f35 = f19;
                                dl0 dl0Var2 = el0Var.b;
                                dl0 dl0Var3 = el0Var.c;
                                rectF4 = rectF;
                                if (x0Var3.equals(this.l0)) {
                                    dl0 dl0Var4 = dl0Var2.getVisibility() == 0 ? dl0Var2 : dl0Var;
                                    el0Var.setPivotX(el0Var.getMeasuredWidth() >> 1);
                                    el0Var.setPivotY(dl0Var4.getY() + dl0Var4.getMeasuredHeight());
                                    el0Var.setScaleX(this.p0);
                                    el0Var.setScaleY(this.p0);
                                    if (!this.r0) {
                                        if (this.Q == null) {
                                            dl0Var3.setVisibility(0);
                                            dl0Var3.setAlpha(1.0f);
                                            if (dl0Var3.getImageReceiver().hasBitmapImage() || ((t5Var = dl0Var3.e) != null && (f3Var = t5Var.k) != null && f3Var.hasBitmapImage())) {
                                                dl0Var4.setAlpha(0.0f);
                                            }
                                            f21 = 1.0f;
                                        } else {
                                            f21 = 1.0f;
                                            dl0Var3.setAlpha(1.0f - this.o0);
                                            dl0Var4.setAlpha(this.o0);
                                        }
                                        if (this.n0 == f21) {
                                            this.r0 = z11;
                                            if (System.currentTimeMillis() - this.s0 > 300) {
                                                this.s0 = System.currentTimeMillis();
                                                r1Var2 = r1Var3;
                                                this.g0.p(el0Var, el0Var.e, true, false);
                                                canvas2.save();
                                                x9 = el0Var.getX() + r1Var2.getX();
                                                scaleX = ((el0Var.getScaleX() * el0Var.getMeasuredWidth()) - el0Var.getMeasuredWidth()) / f14;
                                                f20 = x9 - scaleX;
                                                if (f20 >= 0.0f && el0Var.getTranslationX() >= 0.0f) {
                                                    el0Var.setTranslationX((-f20) - f35);
                                                } else if (el0Var.getMeasuredWidth() + x9 + scaleX > getMeasuredWidth() || el0Var.getTranslationX() > 0.0f) {
                                                    el0Var.setTranslationX(0.0f - f35);
                                                } else {
                                                    el0Var.setTranslationX((((getMeasuredWidth() - x9) - el0Var.getMeasuredWidth()) - scaleX) - f35);
                                                }
                                                canvas2.translate(el0Var.getX() + r1Var2.getX(), el0Var.getY() + r1Var2.getY());
                                                canvas2.scale(el0Var.getScaleX(), el0Var.getScaleY(), el0Var.getPivotX(), el0Var.getPivotY());
                                                el0Var.draw(canvas2);
                                                canvas2.restore();
                                            }
                                        }
                                    }
                                    r1Var2 = r1Var3;
                                    canvas2.save();
                                    x9 = el0Var.getX() + r1Var2.getX();
                                    scaleX = ((el0Var.getScaleX() * el0Var.getMeasuredWidth()) - el0Var.getMeasuredWidth()) / f14;
                                    f20 = x9 - scaleX;
                                    if (f20 >= 0.0f) {
                                    }
                                    if (el0Var.getMeasuredWidth() + x9 + scaleX > getMeasuredWidth()) {
                                    }
                                    el0Var.setTranslationX(0.0f - f35);
                                    canvas2.translate(el0Var.getX() + r1Var2.getX(), el0Var.getY() + r1Var2.getY());
                                    canvas2.scale(el0Var.getScaleX(), el0Var.getScaleY(), el0Var.getPivotX(), el0Var.getPivotY());
                                    el0Var.draw(canvas2);
                                    canvas2.restore();
                                } else {
                                    r1Var2 = r1Var3;
                                    int R2 = RecyclerView.R(el0Var);
                                    float measuredWidth = (((this.p0 - 1.0f) * el0Var.getMeasuredWidth()) / 3.0f) - (((1.0f - this.q0) * el0Var.getMeasuredWidth()) * (Math.abs(this.m0 - R2) - 1));
                                    if (R2 < this.m0) {
                                        el0Var.setPivotX(0.0f);
                                        el0Var.setTranslationX(-measuredWidth);
                                    } else {
                                        el0Var.setPivotX(el0Var.getMeasuredWidth() - f35);
                                        el0Var.setTranslationX(measuredWidth - f35);
                                    }
                                    el0Var.setPivotY(dl0Var.getY() + dl0Var.getMeasuredHeight());
                                    el0Var.setScaleX(this.q0);
                                    el0Var.setScaleY(this.q0);
                                    dl0Var3.setVisibility(4);
                                    dl0Var.setAlpha(1.0f);
                                }
                                if (childAt.getLeft() > i21) {
                                    i21 = childAt.getLeft();
                                }
                                if (!this.N0 && (!el0Var.r || dl0Var.getImageReceiver().getLottieAnimation() != null)) {
                                    if ((el0Var.getMeasuredWidth() / f14) + el0Var.getX() > 0.0f && (el0Var.getMeasuredWidth() / f14) + el0Var.getX() < r1Var2.getWidth()) {
                                        if (!hashSet.contains(el0Var)) {
                                            el0Var.c(abs);
                                            abs += 30;
                                        }
                                        hashSet2.add(el0Var);
                                    } else if (!el0Var.n) {
                                        el0Var.d();
                                    }
                                }
                            } else {
                                i15 = save3;
                                rectF4 = rectF;
                                i16 = i20;
                                r1Var2 = r1Var3;
                                if (childAt == this.R) {
                                    if ((childAt.getMeasuredWidth() / f14) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f14) + childAt.getX() >= r1Var2.getWidth()) {
                                        tg.c1 c1Var = this.u0;
                                        f17 = 0.0f;
                                        c1Var.setScaleX(0.0f);
                                        c1Var.setScaleY(0.0f);
                                        if (childAt == this.S) {
                                            if ((childAt.getMeasuredWidth() / f14) + childAt.getX() <= f17 || (childAt.getMeasuredWidth() / f14) + childAt.getX() >= r1Var2.getWidth()) {
                                                fs fsVar = this.v0;
                                                fsVar.setScaleX(0.0f);
                                                fsVar.setScaleY(0.0f);
                                                ((gl0) fsVar.c).S.invalidate();
                                                ValueAnimator valueAnimator = (ValueAnimator) fsVar.b;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                            } else {
                                                if (!hashSet.contains(childAt)) {
                                                    if (this.v != 1.0f) {
                                                        fs fsVar2 = this.v0;
                                                        fsVar2.setScaleX(0.0f);
                                                        fsVar2.setScaleY(0.0f);
                                                        ((gl0) fsVar2.c).S.invalidate();
                                                        ValueAnimator valueAnimator2 = (ValueAnimator) fsVar2.b;
                                                        if (valueAnimator2 != null) {
                                                            valueAnimator2.cancel();
                                                        }
                                                    }
                                                    fs fsVar3 = this.v0;
                                                    boolean z12 = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || SharedConfig.getDevicePerformanceClass() >= 1;
                                                    fsVar3.invalidate();
                                                    ValueAnimator valueAnimator3 = (ValueAnimator) fsVar3.b;
                                                    if (valueAnimator3 != null) {
                                                        valueAnimator3.removeAllListeners();
                                                        ((ValueAnimator) fsVar3.b).cancel();
                                                    }
                                                    if (z12) {
                                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fsVar3.getScaleX(), 1.0f);
                                                        fsVar3.b = ofFloat;
                                                        ofFloat.setInterpolator(AndroidUtilities.overshootInterpolator);
                                                        ((ValueAnimator) fsVar3.b).addUpdateListener(new f80(fsVar3, 8));
                                                        ((ValueAnimator) fsVar3.b).setStartDelay((long) (abs * ((gl0) fsVar3.c).c));
                                                        ((ValueAnimator) fsVar3.b).setDuration(300L);
                                                        ((ValueAnimator) fsVar3.b).start();
                                                    } else {
                                                        fsVar3.setScaleX(1.0f);
                                                        fsVar3.setScaleY(1.0f);
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
                                                tg.c1 c1Var2 = this.u0;
                                                f18 = 0.0f;
                                                c1Var2.setScaleX(0.0f);
                                                c1Var2.setScaleY(0.0f);
                                            } else {
                                                f18 = 0.0f;
                                            }
                                            tg.c1 c1Var3 = this.u0;
                                            org.telegram.ui.Components.voip.h hVar = c1Var3.J;
                                            if (hVar != null) {
                                                hVar.g = f18;
                                                hVar.j = false;
                                            }
                                            c1Var3.invalidate();
                                            c1Var3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(abs).setInterpolator(AndroidUtilities.overshootInterpolator).setDuration(300L);
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
                            r1Var3 = r1Var2;
                            rectF = rectF4;
                            i12 = 1;
                        }
                        i13 = save3;
                        rectF2 = rectF;
                        r1Var = r1Var3;
                        f16 = f25;
                        el0 el0Var2 = this.z0;
                        if (pullingLeftProgress > 0.0f) {
                            float pullingLeftProgress2 = getPullingLeftProgress();
                            int measuredWidth3 = el0Var2.getMeasuredWidth() - AndroidUtilities.dp(f14);
                            float f36 = i21 + measuredWidth3;
                            float clamp2 = Utilities.clamp(f36 / (getMeasuredWidth() - el0Var2.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth3;
                            if (el0Var2.getTag() == null) {
                                el0Var2.setTag(Float.valueOf(1.0f));
                                el0Var2.d();
                                el0Var2.c(0);
                            }
                            float clamp3 = Utilities.clamp(pullingLeftProgress2, 1.0f, 0.0f);
                            el0Var2.setScaleX(clamp3);
                            el0Var2.setScaleY(clamp3);
                            i14 = 1;
                            el0Var2.setTranslationX(((r1Var.getX() + f36) - clamp2) + (-((i19 == 1 || i19 == 2) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(20.0f))));
                            if (el0Var2.getVisibility() != 0) {
                                el0Var2.setVisibility(0);
                            }
                        } else {
                            i14 = 1;
                            if (el0Var2.getVisibility() != 8 && this.O0) {
                                el0Var2.setVisibility(8);
                            }
                            if (el0Var2.getTag() != null) {
                                el0Var2.setTag(null);
                            }
                        }
                        if (!this.d1 && this.x0 != null) {
                            int A = (int) org.telegram.messenger.t.A(1.0f, this.w0, Utilities.clamp(1.0f - (this.w0 / 0.2f), 1.0f, 0.0f), f12);
                            canvas.save();
                            f(f24, max2, f16, A, canvas);
                            canvas.restore();
                            return;
                        }
                        float f37 = f16;
                        q5 = q();
                        if (!q5) {
                            canvas.clipPath(path);
                        }
                        if (!LocaleController.isRTL || this.M) {
                            i14 = -1;
                        }
                        canvas.translate((1.0f - this.v) * getWidth() * i14, 0.0f);
                        r1Var.setTranslationX(-width2);
                        super.dispatchDraw(canvas);
                        if (!q5) {
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
                r1Var = r1Var3;
                i14 = i12;
                f16 = f25;
                if (!this.d1) {
                }
                float f372 = f16;
                q5 = q();
                if (!q5) {
                }
                if (!LocaleController.isRTL) {
                }
                i14 = -1;
                canvas.translate((1.0f - this.v) * getWidth() * i14, 0.0f);
                r1Var.setTranslationX(-width2);
                super.dispatchDraw(canvas);
                if (!q5) {
                }
                canvas.restoreToCount(i13);
                f(f24, max2, f372, 255, canvas);
                invalidate();
            }
        }
        if (!z10) {
            float f38 = this.O;
            if (f38 != 0.0f) {
                this.O = org.telegram.ui.d3.v(min, 220.0f, f38, 0.0f);
                invalidate();
            }
        }
        aa0Var = this.R0;
        if (aa0Var != null) {
        }
        float max22 = (Math.max(0.25f, Math.min(this.v, 1.0f)) - 0.25f) / 0.75f;
        float f242 = this.E * max22;
        float f252 = this.F * max22;
        HashSet hashSet3 = this.D0;
        hashSet3.clear();
        HashSet hashSet22 = this.C0;
        hashSet3.addAll(hashSet22);
        hashSet22.clear();
        if (this.c1) {
        }
        x0Var = this.l0;
        i10 = this.M0;
        if (x0Var != null) {
            f22 = this.n0;
            if (f22 != 1.0f) {
            }
        }
        x0Var2 = this.l0;
        if (x0Var2 == null) {
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
        float g72 = g();
        fpVar = this.e1;
        if (fpVar != null) {
        }
        float width22 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f11);
        float topOffset2 = getTopOffset();
        float paddingTop2 = getPaddingTop();
        bi.r1 r1Var32 = this.b;
        float f282 = f11;
        float f292 = max;
        RectF rectF52 = this.w;
        rectF52.set(getPaddingLeft() + width22, (((1.0f - this.q0) * r1Var32.getMeasuredHeight()) + paddingTop2) - g72, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g72);
        this.y = c3.h0.f(g72, 2.0f, rectF52.height() - topOffset2, 2.0f);
        if (i10 == 1) {
        }
        canvas2.restoreToCount(save4);
        if (this.d1) {
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
        r1Var = r1Var32;
        i14 = i12;
        f16 = f252;
        if (!this.d1) {
        }
        float f3722 = f16;
        q5 = q();
        if (!q5) {
        }
        if (!LocaleController.isRTL) {
        }
        i14 = -1;
        canvas.translate((1.0f - this.v) * getWidth() * i14, 0.0f);
        r1Var.setTranslationX(-width22);
        super.dispatchDraw(canvas);
        if (!q5) {
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
        bh.i0 i0Var = this.x0;
        if (i0Var != null) {
            i0Var.d();
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
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), ds.f.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f13 = rectF.bottom;
            ds dsVar = ds.f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f13, 0.0f, dsVar.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), dsVar.getInterpolation(this.O)));
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
        boolean o10 = this.g0.o();
        float f20 = paddingTop;
        RectF rectF2 = this.b0;
        if (o10) {
            rectF2.set(f14, f17, f18, f19);
            f12 = f7;
            this.g0.l(canvas, rectF2, f12, getX(), getY(), i10, false);
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
        float lerp = AndroidUtilities.lerp(z12 ? (getPaddingTop() - g()) - AndroidUtilities.dp(16.0f) : ((getHeight() - f22) - f15) + g(), (f22 + f15) - g(), ds.f.getInterpolation(this.O));
        float f23 = (-AndroidUtilities.dp(1.0f)) * f10;
        drawable.setBounds((int) ((width2 - f12) - f23), (int) ((lerp - f12) - f23), (int) (width2 + f12 + f23), (int) (f12 + lerp + f23));
        drawable.draw(canvas);
        if (this.g0.o()) {
            rectF2.set(width2 - f11, lerp - f11, width2 + f11, lerp + f11);
            this.g0.l(canvas, rectF2, f11, getX(), getY(), i10, false);
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

    public fl0 getDelegate() {
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

    public bh.i0 getReactionsWindow() {
        return this.x0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f7;
        HashSet hashSet = this.d0;
        if (hashSet.isEmpty()) {
            return "";
        }
        bh.x0 x0Var = (bh.x0) hashSet.iterator().next();
        long j10 = x0Var.g;
        String str = null;
        if (j10 != 0 && (f7 = t5.f(this.J, j10)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = x0Var.f;
        }
        return TextUtils.isEmpty(str) ? "👍" : str;
    }

    public HashSet<bh.x0> getSelectedReactions() {
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
        return AndroidUtilities.dp(16.0f) + c3.h0.w(itemsCount, 1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(36.0f) * itemsCount);
    }

    public List<bh.x0> getVisibleReactionsList() {
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
        bh.i0 i0Var = this.x0;
        if (i0Var == null) {
            return null;
        }
        return i0Var.c;
    }

    public final void h(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.M0;
        if (i11 == 4) {
            Iterator it = this.d0.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                bh.x0 x0Var = (bh.x0) it.next();
                if (!hashSet.contains(x0Var)) {
                    hashSet.add(x0Var);
                    arrayList.add(x0Var);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.J).getEnabledReactionsList();
            while (i10 < enabledReactionsList.size()) {
                bh.x0 c10 = bh.x0.c(enabledReactionsList.get(i10));
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
                    arrayList.add(bh.x0.c(enabledReactionsList2.get(i10)));
                    i10++;
                }
                return;
            }
            ArrayList<TLRPC.Reaction> savedReactions = MediaDataController.getInstance(this.J).getSavedReactions();
            int i13 = 0;
            while (i10 < savedReactions.size()) {
                bh.x0 d = bh.x0.d(savedReactions.get(i10));
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
                    bh.x0 e = bh.x0.e(availableEffects.effects.get(i10));
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
                    bh.x0 d10 = bh.x0.d(savedReactionTags.tags.get(i14).reaction);
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            }
            for (int i15 = 0; i15 < savedReactions2.size(); i15++) {
                bh.x0 d11 = bh.x0.d(savedReactions2.get(i15));
                if (!hashSet.contains(d11)) {
                    hashSet.add(d11);
                    arrayList.add(d11);
                }
            }
        } else {
            for (int i16 = 0; i16 < savedReactions2.size(); i16++) {
                bh.x0 d12 = bh.x0.d(savedReactions2.get(i16));
                if (!hashSet.contains(d12) && (i11 == 3 || UserConfig.getInstance(this.J).isPremium() || d12.g == 0)) {
                    hashSet.add(d12);
                    arrayList.add(d12);
                }
            }
        }
        if (i11 != 3 || UserConfig.getInstance(this.J).isPremium()) {
            ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.J).getRecentReactions();
            for (int i17 = 0; i17 < recentReactions.size(); i17++) {
                bh.x0 d13 = bh.x0.d(recentReactions.get(i17));
                if (!hashSet.contains(d13)) {
                    hashSet.add(d13);
                    arrayList.add(d13);
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList3 = MediaDataController.getInstance(this.J).getEnabledReactionsList();
            while (i10 < enabledReactionsList3.size()) {
                bh.x0 c11 = bh.x0.c(enabledReactionsList3.get(i10));
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
            bi.r1 r1Var = this.b;
            if (i10 >= r1Var.getChildCount()) {
                return;
            }
            View childAt = r1Var.getChildAt(i10);
            if (childAt instanceof el0) {
                ((el0) childAt).b.invalidate();
            }
            i10++;
        }
    }

    public final void k() {
        int dp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G8, false);
        this.b1 = x02;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, x02, 0, tileMode));
        this.n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, x02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, bh.x0 x0Var, boolean z10) {
        fl0 fl0Var = this.g0;
        if (fl0Var != null) {
            fl0Var.p(view, x0Var, z10, true);
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
        sk0 sk0Var = new sk0(this, 1);
        bi.r1 r1Var = this.b;
        AndroidUtilities.forEachViews((RecyclerView) r1Var, (Utilities.Callback<View>) sk0Var);
        this.C0.clear();
        r1Var.invalidate();
        bh.p pVar = this.S;
        if (pVar != null) {
            pVar.invalidate();
        }
        invalidate();
    }

    public final void o(ch.b bVar, fh.e eVar) {
        this.Z0 = bVar;
        this.a1 = eVar;
        eh.d c10 = bVar.c(this, null, true);
        c10.v(eVar);
        org.telegram.messenger.wh.s(c10, AndroidUtilities.dp(24.0f), 8.0f);
        this.W0 = c10;
        eh.d c11 = bVar.c(this, null, true);
        c11.v(eVar);
        org.telegram.messenger.wh.s(c11, AndroidUtilities.dp(8.0f), 8.0f);
        this.X0 = c11;
        eh.d c12 = bVar.c(this, null, true);
        c12.v(eVar);
        org.telegram.messenger.wh.s(c12, AndroidUtilities.dp(4.0f), 8.0f);
        this.Y0 = c12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.J).addWeakObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.M0 == 5) {
            NotificationCenter.getInstance(this.J).addWeakObserver(this, NotificationCenter.availableEffectsUpdate);
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
                bh.x0 x0Var = new bh.x0();
                x0Var.a = true;
                arrayList2.add(x0Var);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.H.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i13);
                i13++;
                arrayList2.add(bh.x0.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.c0 = true;
                bh.x0 x0Var2 = new bh.x0();
                x0Var2.a = true;
                arrayList2.add(x0Var2);
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
                                    arrayList2.add(bh.x0.d(reaction2));
                                    break;
                                }
                            } else {
                                arrayList2.add(bh.x0.d(reaction2));
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
                hashSet.add((bh.x0) arrayList2.get(i15));
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
                arrayList5.add((bh.x0) arrayList2.get(i16));
                i16++;
            }
            if (i16 < arrayList2.size()) {
                el0.a(this.z0, (bh.x0) arrayList2.get(i16), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.G0 = true;
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (((bh.x0) arrayList5.get(i17)).g != 0) {
                this.G0 = false;
            }
        }
        ArrayList arrayList6 = this.V;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        wk0 wk0Var = this.a0;
        gl0 gl0Var = wk0Var.d;
        ArrayList arrayList7 = gl0Var.e;
        ArrayList arrayList8 = gl0Var.T;
        ArrayList arrayList9 = gl0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i18 = 0; i18 < arrayList8.size(); i18++) {
            bh.x0 x0Var3 = (bh.x0) arrayList8.get(i18);
            arrayList9.add(new xk0(x0Var3.f == null ? 3 : 0, x0Var3));
        }
        if (!gl0Var.U.isEmpty() && !MessagesController.getInstance(gl0Var.J).premiumFeaturesBlocked()) {
            arrayList9.add(new xk0(1, null));
        }
        if (gl0Var.q()) {
            arrayList9.add(new xk0(2, null));
        }
        if (z10) {
            wk0Var.E(arrayList7, arrayList9);
        } else {
            wk0Var.l();
        }
        if (messageObject == null || (tL_messageReactions = messageObject.messageOwner.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i19 = 0; i19 < messageObject.messageOwner.reactions.results.size(); i19++) {
            if (messageObject.messageOwner.reactions.results.get(i19).chosen) {
                this.d0.add(bh.x0.d(messageObject.messageOwner.reactions.results.get(i19).reaction));
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
        org.telegram.ui.Cells.b1 b1Var = l1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new fi.j5(this, 1));
        duration.start();
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        if (getAlpha() != f7 && f7 == 0.0f) {
            this.C0.clear();
            int i10 = 0;
            while (true) {
                bi.r1 r1Var = this.b;
                if (i10 >= r1Var.getChildCount()) {
                    break;
                }
                if (r1Var.getChildAt(i10) instanceof el0) {
                    ((el0) r1Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f7);
    }

    public void setBubbleOffset(float f7) {
        this.U0 = f7;
    }

    public void setChatScrimView(fp fpVar) {
        this.e1 = fpVar;
    }

    public void setCurrentAccount(int i10) {
        this.J = i10;
    }

    public void setCustomEmojiEnterProgress(float f7) {
        this.w0 = f7;
        fp fpVar = this.e1;
        if (fpVar != null) {
            fpVar.setPopupAlpha(1.0f - f7);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (!z10) {
            this.v0.setBackground(null);
            return;
        }
        fs fsVar = this.v0;
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.ActionBar.f7.R(fsVar, org.telegram.ui.ActionBar.y6.i0(dp, 0, i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i10, false), 40)), null, org.telegram.ui.ActionBar.f7.h(i10, 40), null);
    }

    public void setDelegate(fl0 fl0Var) {
        this.g0 = fl0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.r2 r2Var) {
        this.t0 = r2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.Q0 = true;
        if (this.R0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.u6 u6Var = this.k0;
            aa0 aa0Var = new aa0(context, u6Var);
            this.R0 = aa0Var;
            aa0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.R0.setClickable(true);
            this.R0.setTextSize(1, 12.0f);
            int i10 = this.M0;
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                org.telegram.ui.ActionBar.f7.V(this.R0, org.telegram.ui.ActionBar.y6.G6, u6Var);
                this.R0.setAlpha(0.5f);
            } else {
                org.telegram.ui.ActionBar.f7.V(this.R0, org.telegram.ui.ActionBar.y6.z6, u6Var);
            }
            this.R0.setGravity(1);
            addView(this.R0, kb1.h(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.R0.setText(charSequence);
        this.f1 = false;
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

    public void setParentLayout(fp fpVar) {
        this.J0 = fpVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            bh.x0 b10 = bh.x0.b(str);
            hashSet.add(b10);
            this.e0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new sk0(this, 0));
    }

    public void setSelectedReaction(bh.x0 x0Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (x0Var != null) {
            hashSet.add(x0Var);
        }
        this.a0.l();
    }

    public void setSelectedReactionAnimated(bh.x0 x0Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (x0Var != null) {
            hashSet.add(x0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new sk0(this, 0));
    }

    public void setSelectedReactionInclusive(bh.x0 x0Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (x0Var != null) {
            hashSet.add(x0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new sk0(this, 0));
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
                        hashSet.add(bh.x0.d(messageObject.messageOwner.reactions.results.get(i11).reaction));
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
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new sk0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.d1 != z10) {
            this.d1 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    bi.r1 r1Var = this.b;
                    if (i10 >= r1Var.getChildCount()) {
                        break;
                    }
                    if (r1Var.getChildAt(i10) instanceof el0) {
                        el0 el0Var = (el0) r1Var.getChildAt(i10);
                        boolean z11 = el0Var.r;
                        dl0 dl0Var = el0Var.b;
                        if (z11 && (dl0Var.getImageReceiver().getLottieAnimation() != null || dl0Var.getImageReceiver().getAnimation() != null)) {
                            dl0Var.setVisibility(0);
                            el0Var.a.setVisibility(4);
                            if (el0Var.s) {
                                el0Var.v = true;
                            }
                        }
                        el0Var.invalidate();
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
            hashSet.add(bh.x0.d(reaction));
        }
        this.a0.l();
    }

    public void setTop(boolean z10) {
        this.L = z10;
    }

    public void setTransitionProgress(float f7) {
        this.v = f7;
        fp fpVar = this.J0;
        if (fpVar != null) {
            if (!this.K0 || !SharedConfig.deviceIsHigh()) {
                f7 = 1.0f;
            }
            fpVar.setReactionsTransitionProgress(f7);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        if (f7 != getTranslationX()) {
            super.setTranslationX(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int w02;
        Paint paint = this.f;
        if (paint != null) {
            try {
                int i10 = this.M0;
                if (i10 != 2 && i10 != 4 && paint.getColor() != (w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, this.k0))) {
                    int alpha = paint.getAlpha();
                    paint.setColor(w02);
                    paint.setAlpha(alpha);
                    invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        tg.c1 c1Var = this.u0;
        if (c1Var != null) {
            c1Var.setColor(i0.a.f(0.7f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.F8, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false)));
        }
        if (getWidth() <= 0 || getHeight() <= 0 || this.b1 == org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G8, false)) {
            return;
        }
        k();
    }

    public void m() {
    }
}
