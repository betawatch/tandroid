package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class pv extends ViewGroup {
    public Boolean A;
    public float B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public final /* synthetic */ tv F;
    public Long a;
    public boolean b;
    public final boolean c;
    public final t9 d;
    public final xi0 e;
    public final cg.t1 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public rx v;
    public p5 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(tv tvVar, Context context, int i10, int i11) {
        super(context);
        this.F = tvVar;
        setFocusable(true);
        this.h = true;
        this.n = false;
        setBackground(org.telegram.ui.ActionBar.g6.M(tvVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            xi0 xi0Var = new xi0(i11, j7.l1.k(i11, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = xi0Var;
            xi0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            xi0Var.r0 = this;
            xi0Var.H(true);
            xi0Var.start();
        } else {
            t9 t9Var = new t9(context);
            this.d = t9Var;
            t9Var.w = false;
            t9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(t9Var);
        }
        d();
    }

    private void setColor(int i10) {
        tv tvVar = this.F;
        int i11 = tvVar.P;
        if (i11 == 5 || i11 == 7) {
            i10 = tvVar.M;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        t9 t9Var = this.d;
        if (t9Var != null && !this.c) {
            t9Var.setColorFilter(porterDuffColorFilter);
            t9Var.invalidate();
        }
        xi0 xi0Var = this.e;
        if (xi0Var != null) {
            xi0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        cg.t1 t1Var = this.f;
        if (t1Var == null) {
            return;
        }
        this.A = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            t1Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable mutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        t1Var.setImageDrawable(mutate);
    }

    public final void b() {
        lh.x2 x2Var;
        p5 p5Var = this.w;
        if (p5Var == null || (x2Var = p5Var.k) == null) {
            return;
        }
        if (x2Var.getLottieAnimation() != null) {
            x2Var.getLottieAnimation().K(0);
            x2Var.getLottieAnimation().stop();
        } else if (x2Var.getAnimation() != null) {
            x2Var.getAnimation().stop();
        }
    }

    public final void c() {
        t9 t9Var = this.d;
        if (t9Var == null) {
            return;
        }
        if (this.x && this.y) {
            p5 p5Var = this.w;
            if (p5Var != null || (this.s == null && this.r == null)) {
                if (p5Var != null) {
                    p5Var.o(t9Var);
                    this.w = null;
                }
                t9Var.b();
                rx rxVar = this.v;
                if (rxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(rxVar.b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            } else {
                t9Var.b();
                TLRPC.Document document = this.s;
                tv tvVar = this.F;
                if (document != null) {
                    this.w = p5.m(UserConfig.selectedAccount, tvVar.O, document);
                } else {
                    this.w = p5.n(UserConfig.selectedAccount, this.r.longValue(), null, tvVar.O);
                }
                this.w.a(t9Var);
                t9Var.setImageDrawable(this.w);
            }
        } else {
            p5 p5Var2 = this.w;
            if (p5Var2 != null) {
                p5Var2.o(t9Var);
                this.w = null;
            }
            t9Var.b();
        }
        if (this.x && this.y) {
            t9Var.onAttachedToWindow();
        } else {
            t9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        tv tvVar = this.F;
        int k9 = tvVar.k();
        org.telegram.ui.ActionBar.c6 c6Var = tvVar.v;
        org.telegram.ui.ActionBar.g6.B1(background, k9, false);
        if (tvVar.L) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.C) * 255.0f)));
        } else {
            setColor(i0.a.d(this.C, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oe, c6Var)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        xi0 xi0Var = this.e;
        if (xi0Var == null || !this.y) {
            return;
        }
        xi0Var.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.y) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    public final void e(boolean z10) {
        if (Math.abs(this.B - (z10 ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        float f9 = z10 ? 1.0f : 0.0f;
        this.B = f9;
        cg.t1 t1Var = this.f;
        t1Var.setScaleX(f9);
        t1Var.setScaleY(this.B);
        t1Var.setAlpha(this.B);
        t1Var.setVisibility(z10 ? 0 : 8);
    }

    public final void f() {
        cg.t1 t1Var = this.f;
        if (t1Var == null || t1Var.h || !(getDrawable() instanceof p5)) {
            return;
        }
        if (((p5) getDrawable()).c()) {
            t1Var.setImageReceiver(null);
            t1Var.setColor(this.F.M);
            return;
        }
        lh.x2 x2Var = ((p5) getDrawable()).k;
        if (x2Var != null) {
            t1Var.setImageReceiver(x2Var);
            t1Var.invalidate();
        }
    }

    public final void g(boolean z10, boolean z11) {
        t9 t9Var = this.d;
        if ((t9Var == null || t9Var.getImageReceiver().getImageDrawable() != null || this.F.L) && this.D != z10) {
            this.D = z10;
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            if (!z10) {
                b();
            }
            if (!z11) {
                this.C = z10 ? 1.0f : 0.0f;
                d();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C, z10 ? 1.0f : 0.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new j6(this, 19));
            this.E.addListener(new z9(7, this, z10));
            this.E.setDuration(kg.g0.d() ? 0L : 350L);
            this.E.setInterpolator(jr.h);
            this.E.start();
        }
    }

    public Drawable getDrawable() {
        t9 t9Var = this.d;
        if (t9Var != null) {
            return t9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (kg.g0.b(this)) {
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
        TLRPC.Document f9;
        TLRPC.StickerSet stickerSet;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null) {
            rx rxVar = this.v;
            if (rxVar == null || (stickerSet = rxVar.b) == null || (str = stickerSet.title) == null) {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l10 = this.r;
                    if (l10 != null && (f9 = p5.f(UserConfig.selectedAccount, l10.longValue())) != null) {
                        contentDescription = MessageObject.findAnimatedEmojiEmoticon(f9, null);
                    }
                }
            } else {
                contentDescription = str;
            }
        }
        Boolean bool = this.A;
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
        accessibilityNodeInfo.setSelected(this.D);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        t9 t9Var = this.d;
        if (t9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            t9Var.layout(i14 - (t9Var.getMeasuredWidth() / 2), i15 - (t9Var.getMeasuredHeight() / 2), (t9Var.getMeasuredWidth() / 2) + i14, (t9Var.getMeasuredHeight() / 2) + i15);
        }
        cg.t1 t1Var = this.f;
        if (t1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            t1Var.layout(i16 - t1Var.getMeasuredWidth(), i17 - t1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        t9 t9Var = this.d;
        if (t9Var != null) {
            t9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        cg.t1 t1Var = this.f;
        if (t1Var != null) {
            t1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        lh.x2 x2Var;
        p5 p5Var = this.w;
        if (p5Var != null && (x2Var = p5Var.k) != null) {
            if (x2Var.getAnimation() != null) {
                x2Var.getAnimation().y(0L, true, false);
            }
            x2Var.startAnimation();
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        TLRPC.Document document2 = this.s;
        if ((document2 != null || this.r != null) && document != null) {
            Long l10 = this.r;
            if ((l10 != null ? l10.longValue() : document2.id) == document.id) {
                return;
            }
        }
        p5 p5Var = this.w;
        t9 t9Var = this.d;
        if (p5Var != null) {
            p5Var.o(t9Var);
            this.w = null;
        }
        t9Var.b();
        this.s = document;
        this.r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j10) {
        TLRPC.Document document = this.s;
        if ((document != null || this.r != null) && j10 != 0) {
            Long l10 = this.r;
            if ((l10 != null ? l10.longValue() : document.id) == j10) {
                return;
            }
        }
        p5 p5Var = this.w;
        t9 t9Var = this.d;
        if (p5Var != null) {
            p5Var.o(t9Var);
            this.w = null;
        }
        t9Var.b();
        this.s = null;
        this.r = j10 != 0 ? Long.valueOf(j10) : null;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(rx rxVar) {
        if (rxVar != null && rxVar.b == null) {
            rxVar = null;
        }
        rx rxVar2 = this.v;
        if (rxVar2 == null || rxVar == null || rxVar2.b.id != rxVar.b.id) {
            p5 p5Var = this.w;
            t9 t9Var = this.d;
            if (p5Var != null && this.s == null && this.r == null) {
                p5Var.o(t9Var);
                this.w = null;
            }
            t9Var.b();
            this.v = rxVar;
            c();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (kg.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(tv tvVar, Context context, int i10, boolean z10) {
        super(context);
        this.F = tvVar;
        setFocusable(true);
        this.h = false;
        this.n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.g6.Y(tvVar.k(), 8, 8));
        }
        t9 t9Var = new t9(context);
        this.d = t9Var;
        t9Var.w = false;
        t9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(t9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(tv tvVar, Context context, TLRPC.Document document) {
        super(context);
        this.F = tvVar;
        setFocusable(true);
        this.b = true;
        this.h = false;
        this.n = false;
        mv mvVar = new mv(this, context);
        this.d = mvVar;
        mvVar.w = false;
        this.s = document;
        this.c = true;
        mvVar.setColorFilter(tvVar.getEmojiColorFilter());
        addView(mvVar);
        int i10 = cg.t1.H;
        nv nvVar = new nv(context, 1, tvVar.v);
        this.f = nvVar;
        nvVar.setAlpha(0.0f);
        nvVar.setScaleX(0.0f);
        nvVar.setScaleY(0.0f);
        f();
        addView(nvVar);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(tv tvVar, Context context, long j10) {
        super(context);
        this.F = tvVar;
        setFocusable(true);
        this.b = true;
        this.h = false;
        this.n = false;
        lh.y3 y3Var = new lh.y3(this, context, 7);
        this.d = y3Var;
        y3Var.w = false;
        this.r = Long.valueOf(j10);
        this.c = true;
        y3Var.setColorFilter(tvVar.getEmojiColorFilter());
        addView(y3Var);
        int i10 = cg.t1.H;
        ov ovVar = new ov(context, 1, tvVar.v);
        this.f = ovVar;
        ovVar.setAlpha(0.0f);
        ovVar.setScaleX(0.0f);
        ovVar.setScaleY(0.0f);
        f();
        addView(ovVar);
        d();
    }
}
