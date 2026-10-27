package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class gw extends ViewGroup implements org.telegram.ui.ActionBar.p6 {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public int L;
    public float M;
    public final /* synthetic */ kw N;
    public Long a;
    public boolean b;
    public final boolean c;
    public final y9 d;
    public final yj0 e;
    public final tg.c1 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public ey v;
    public t5 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(kw kwVar, Context context, int i10) {
        super(context);
        this.N = kwVar;
        setFocusable(true);
        this.M = -1.0f;
        this.h = true;
        this.n = false;
        setBackground(org.telegram.ui.ActionBar.y6.N(kwVar.k(), 0, 0));
        yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
        this.e = yj0Var;
        yj0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
        yj0Var.R(this);
        yj0Var.J(true);
        yj0Var.start();
        d();
    }

    private void setColor(int i10) {
        kw kwVar = this.N;
        int i11 = kwVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = kwVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        y9 y9Var = this.d;
        if (y9Var != null && !this.c) {
            y9Var.setColorFilter(porterDuffColorFilter);
            y9Var.invalidate();
        }
        yj0 yj0Var = this.e;
        if (yj0Var != null) {
            yj0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        tg.c1 c1Var = this.f;
        if (c1Var == null) {
            return;
        }
        this.E = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            c1Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable mutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        c1Var.setImageDrawable(mutate);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Wk));
    }

    public final void b() {
        di.f3 f3Var;
        t5 t5Var = this.w;
        if (t5Var == null || (f3Var = t5Var.k) == null) {
            return;
        }
        if (f3Var.getLottieAnimation() != null) {
            f3Var.getLottieAnimation().M(0);
            f3Var.getLottieAnimation().stop();
        } else if (f3Var.getAnimation() != null) {
            f3Var.getAnimation().stop();
        }
    }

    public final void c() {
        y9 y9Var = this.d;
        if (y9Var == null) {
            return;
        }
        if (this.x && this.y) {
            t5 t5Var = this.w;
            if (t5Var != null || (this.s == null && this.r == null)) {
                if (t5Var != null) {
                    t5Var.o(y9Var);
                    this.w = null;
                }
                y9Var.b();
                ey eyVar = this.v;
                if (eyVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(eyVar.b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            } else {
                y9Var.b();
                TLRPC.Document document = this.s;
                kw kwVar = this.N;
                if (document != null) {
                    this.w = t5.m(UserConfig.selectedAccount, kwVar.S, document);
                } else {
                    this.w = t5.n(UserConfig.selectedAccount, this.r.longValue(), null, kwVar.S);
                }
                this.w.a(y9Var);
                y9Var.setImageDrawable(this.w);
            }
        } else {
            t5 t5Var2 = this.w;
            if (t5Var2 != null) {
                t5Var2.o(y9Var);
                this.w = null;
            }
            y9Var.b();
        }
        if (this.x && this.y) {
            y9Var.onAttachedToWindow();
        } else {
            y9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        kw kwVar = this.N;
        int k10 = kwVar.k();
        org.telegram.ui.ActionBar.u6 u6Var = kwVar.v;
        org.telegram.ui.ActionBar.y6.E1(background, k10, false);
        if (kwVar.P) {
            setColor(i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wk, u6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
        } else {
            setColor(i0.a.f(this.G, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Me, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oe, u6Var)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yj0 yj0Var = this.e;
        if (yj0Var == null || !this.y) {
            return;
        }
        yj0Var.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.y) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    public final void e(boolean z10) {
        if (Math.abs(this.F - (z10 ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        float f7 = z10 ? 1.0f : 0.0f;
        this.F = f7;
        tg.c1 c1Var = this.f;
        c1Var.setScaleX(f7);
        c1Var.setScaleY(this.F);
        c1Var.setAlpha(this.F);
        c1Var.setVisibility(z10 ? 0 : 8);
    }

    public final void f() {
        tg.c1 c1Var = this.f;
        if (c1Var == null || c1Var.h || !(getDrawable() instanceof t5)) {
            return;
        }
        if (((t5) getDrawable()).c()) {
            c1Var.setImageReceiver(null);
            c1Var.setColor(this.N.Q);
            return;
        }
        di.f3 f3Var = ((t5) getDrawable()).k;
        if (f3Var != null) {
            c1Var.setImageReceiver(f3Var);
            c1Var.invalidate();
        }
    }

    public final void g(boolean z10, boolean z11) {
        y9 y9Var = this.d;
        if ((y9Var == null || y9Var.getImageReceiver().getImageDrawable() != null || this.N.P) && this.H != z10) {
            this.H = z10;
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.I = null;
            }
            if (!z10) {
                b();
            }
            if (!z11) {
                this.G = z10 ? 1.0f : 0.0f;
                d();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, z10 ? 1.0f : 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new n6(this, 20));
            this.I.addListener(new org.telegram.ui.lo(8, this, z10));
            this.I.setDuration(bh.m0.d() ? 0L : 350L);
            this.I.setInterpolator(ds.h);
            this.I.start();
        }
    }

    public Drawable getDrawable() {
        y9 y9Var = this.d;
        if (y9Var != null) {
            return y9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (bh.m0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x = true;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x = false;
        c();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y) {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        TLRPC.Document f7;
        TLRPC.StickerSet stickerSet;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null) {
            ey eyVar = this.v;
            if (eyVar == null || (stickerSet = eyVar.b) == null || (str = stickerSet.title) == null) {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.r;
                    if (l4 != null && (f7 = t5.f(UserConfig.selectedAccount, l4.longValue())) != null) {
                        contentDescription = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    }
                }
            } else {
                contentDescription = str;
            }
        }
        Boolean bool = this.E;
        if (bool != null && !bool.booleanValue()) {
            String string = LocaleController.getString(R.string.FeaturedStickersShort);
            if (contentDescription == null) {
                contentDescription = string;
            } else {
                contentDescription = ((Object) contentDescription) + ", " + string;
            }
        }
        if (contentDescription != null) {
            accessibilityNodeInfo.setContentDescription(contentDescription);
        }
        accessibilityNodeInfo.setSelected(this.H);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        y9 y9Var = this.d;
        if (y9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            y9Var.layout(i14 - (y9Var.getMeasuredWidth() / 2), i15 - (y9Var.getMeasuredHeight() / 2), (y9Var.getMeasuredWidth() / 2) + i14, (y9Var.getMeasuredHeight() / 2) + i15);
        }
        tg.c1 c1Var = this.f;
        if (c1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            c1Var.layout(i16 - c1Var.getMeasuredWidth(), i17 - c1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        y9 y9Var = this.d;
        if (y9Var != null) {
            y9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        tg.c1 c1Var = this.f;
        if (c1Var != null) {
            c1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        di.f3 f3Var;
        t5 t5Var = this.w;
        if (t5Var != null && (f3Var = t5Var.k) != null) {
            if (f3Var.getAnimation() != null) {
                f3Var.getAnimation().y(0L, true, false);
            }
            f3Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        TLRPC.Document document2 = this.s;
        if ((document2 != null || this.r != null) && document != null) {
            Long l4 = this.r;
            if ((l4 != null ? l4.longValue() : document2.id) == document.id) {
                return;
            }
        }
        t5 t5Var = this.w;
        y9 y9Var = this.d;
        if (t5Var != null) {
            t5Var.o(y9Var);
            this.w = null;
        }
        y9Var.b();
        this.s = document;
        this.r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j10) {
        TLRPC.Document document = this.s;
        if ((document != null || this.r != null) && j10 != 0) {
            Long l4 = this.r;
            if ((l4 != null ? l4.longValue() : document.id) == j10) {
                return;
            }
        }
        t5 t5Var = this.w;
        y9 y9Var = this.d;
        if (t5Var != null) {
            t5Var.o(y9Var);
            this.w = null;
        }
        y9Var.b();
        this.s = null;
        this.r = j10 != 0 ? Long.valueOf(j10) : null;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(ey eyVar) {
        if (eyVar != null && eyVar.b == null) {
            eyVar = null;
        }
        ey eyVar2 = this.v;
        if (eyVar2 == null || eyVar == null || eyVar2.b.id != eyVar.b.id) {
            t5 t5Var = this.w;
            y9 y9Var = this.d;
            if (t5Var != null && this.s == null && this.r == null) {
                t5Var.o(y9Var);
                this.w = null;
            }
            y9Var.b();
            this.v = eyVar;
            c();
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        kw kwVar = this.N;
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Me, kwVar.v);
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oe, kwVar.v);
            int k10 = kwVar.k();
            if (w02 == this.J && w03 == this.K && k10 == this.L && this.M == this.G) {
                return;
            }
            this.J = w02;
            this.K = w03;
            this.L = k10;
            this.M = this.G;
            d();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (bh.m0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(kw kwVar, Context context, int i10, boolean z10) {
        super(context);
        this.N = kwVar;
        setFocusable(true);
        this.M = -1.0f;
        this.h = false;
        this.n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.y6.Z(kwVar.k(), 8, 8));
        }
        y9 y9Var = new y9(context);
        this.d = y9Var;
        y9Var.w = false;
        y9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(y9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(kw kwVar, Context context, TLRPC.Document document) {
        super(context);
        this.N = kwVar;
        setFocusable(true);
        this.M = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        dw dwVar = new dw(this, context);
        this.d = dwVar;
        dwVar.w = false;
        this.s = document;
        this.c = true;
        dwVar.setColorFilter(kwVar.getEmojiColorFilter());
        addView(dwVar);
        int i10 = tg.c1.L;
        ew ewVar = new ew(context, 1, kwVar.v);
        this.f = ewVar;
        ewVar.setAlpha(0.0f);
        ewVar.setScaleX(0.0f);
        ewVar.setScaleY(0.0f);
        f();
        addView(ewVar);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(kw kwVar, Context context, long j10) {
        super(context);
        this.N = kwVar;
        setFocusable(true);
        this.M = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        di.k4 k4Var = new di.k4(this, context, 8);
        this.d = k4Var;
        k4Var.w = false;
        this.r = Long.valueOf(j10);
        this.c = true;
        k4Var.setColorFilter(kwVar.getEmojiColorFilter());
        addView(k4Var);
        int i10 = tg.c1.L;
        fw fwVar = new fw(context, 1, kwVar.v);
        this.f = fwVar;
        fwVar.setAlpha(0.0f);
        fwVar.setScaleX(0.0f);
        fwVar.setScaleY(0.0f);
        f();
        addView(fwVar);
        d();
    }
}
