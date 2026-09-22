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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public class zv extends ViewGroup {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final /* synthetic */ dw J;
    public Long a;
    public boolean b;
    public final boolean c;
    public final v9 d;
    public final kj0 e;
    public final rg.b1 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public xx v;
    public p5 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(dw dwVar, Context context, int i10, int i11) {
        super(context);
        this.J = dwVar;
        setFocusable(true);
        this.h = true;
        this.n = false;
        setBackground(org.telegram.ui.ActionBar.j6.M(dwVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            kj0 kj0Var = new kj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = kj0Var;
            kj0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            kj0Var.R(this);
            kj0Var.J(true);
            kj0Var.start();
        } else {
            v9 v9Var = new v9(context);
            this.d = v9Var;
            v9Var.w = false;
            v9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(v9Var);
        }
        d();
    }

    private void setColor(int i10) {
        dw dwVar = this.J;
        int i11 = dwVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = dwVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        v9 v9Var = this.d;
        if (v9Var != null && !this.c) {
            v9Var.setColorFilter(porterDuffColorFilter);
            v9Var.invalidate();
        }
        kj0 kj0Var = this.e;
        if (kj0Var != null) {
            kj0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        rg.b1 b1Var = this.f;
        if (b1Var == null) {
            return;
        }
        this.E = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            b1Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable mutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        b1Var.setImageDrawable(mutate);
    }

    public final void b() {
        ai.l4 l4Var;
        p5 p5Var = this.w;
        if (p5Var == null || (l4Var = p5Var.k) == null) {
            return;
        }
        if (l4Var.getLottieAnimation() != null) {
            l4Var.getLottieAnimation().M(0);
            l4Var.getLottieAnimation().stop();
        } else if (l4Var.getAnimation() != null) {
            l4Var.getAnimation().stop();
        }
    }

    public final void c() {
        v9 v9Var = this.d;
        if (v9Var == null) {
            return;
        }
        if (this.x && this.y) {
            p5 p5Var = this.w;
            if (p5Var != null || (this.s == null && this.r == null)) {
                if (p5Var != null) {
                    p5Var.o(v9Var);
                    this.w = null;
                }
                v9Var.b();
                xx xxVar = this.v;
                if (xxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(xxVar.b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            } else {
                v9Var.b();
                TLRPC.Document document = this.s;
                dw dwVar = this.J;
                if (document != null) {
                    this.w = p5.m(UserConfig.selectedAccount, dwVar.S, document);
                } else {
                    this.w = p5.n(UserConfig.selectedAccount, this.r.longValue(), null, dwVar.S);
                }
                this.w.a(v9Var);
                v9Var.setImageDrawable(this.w);
            }
        } else {
            p5 p5Var2 = this.w;
            if (p5Var2 != null) {
                p5Var2.o(v9Var);
                this.w = null;
            }
            v9Var.b();
        }
        if (this.x && this.y) {
            v9Var.onAttachedToWindow();
        } else {
            v9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        dw dwVar = this.J;
        int k10 = dwVar.k();
        org.telegram.ui.ActionBar.f6 f6Var = dwVar.v;
        org.telegram.ui.ActionBar.j6.B1(background, k10, false);
        if (dwVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
        } else {
            setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oe, f6Var)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        kj0 kj0Var = this.e;
        if (kj0Var == null || !this.y) {
            return;
        }
        kj0Var.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.y) {
            return super.drawChild(canvas, view, j3);
        }
        return true;
    }

    public final void e(boolean z10) {
        if (Math.abs(this.F - (z10 ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        float f7 = z10 ? 1.0f : 0.0f;
        this.F = f7;
        rg.b1 b1Var = this.f;
        b1Var.setScaleX(f7);
        b1Var.setScaleY(this.F);
        b1Var.setAlpha(this.F);
        b1Var.setVisibility(z10 ? 0 : 8);
    }

    public final void f() {
        rg.b1 b1Var = this.f;
        if (b1Var == null || b1Var.h || !(getDrawable() instanceof p5)) {
            return;
        }
        if (((p5) getDrawable()).c()) {
            b1Var.setImageReceiver(null);
            b1Var.setColor(this.J.Q);
            return;
        }
        ai.l4 l4Var = ((p5) getDrawable()).k;
        if (l4Var != null) {
            b1Var.setImageReceiver(l4Var);
            b1Var.invalidate();
        }
    }

    public final void g(boolean z10, boolean z11) {
        v9 v9Var = this.d;
        if ((v9Var == null || v9Var.getImageReceiver().getImageDrawable() != null || this.J.P) && this.H != z10) {
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
            ofFloat.addUpdateListener(new j6(this, 19));
            this.I.addListener(new ba(7, this, z10));
            this.I.setDuration(zg.f0.d() ? 0L : 350L);
            this.I.setInterpolator(qr.h);
            this.I.start();
        }
    }

    public Drawable getDrawable() {
        v9 v9Var = this.d;
        if (v9Var != null) {
            return v9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (zg.f0.b(this)) {
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
            xx xxVar = this.v;
            if (xxVar == null || (stickerSet = xxVar.b) == null || (str = stickerSet.title) == null) {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.r;
                    if (l4 != null && (f7 = p5.f(UserConfig.selectedAccount, l4.longValue())) != null) {
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
        v9 v9Var = this.d;
        if (v9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            v9Var.layout(i14 - (v9Var.getMeasuredWidth() / 2), i15 - (v9Var.getMeasuredHeight() / 2), (v9Var.getMeasuredWidth() / 2) + i14, (v9Var.getMeasuredHeight() / 2) + i15);
        }
        rg.b1 b1Var = this.f;
        if (b1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            b1Var.layout(i16 - b1Var.getMeasuredWidth(), i17 - b1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        v9 v9Var = this.d;
        if (v9Var != null) {
            v9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        rg.b1 b1Var = this.f;
        if (b1Var != null) {
            b1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        ai.l4 l4Var;
        p5 p5Var = this.w;
        if (p5Var != null && (l4Var = p5Var.k) != null) {
            if (l4Var.getAnimation() != null) {
                l4Var.getAnimation().y(0L, true, false);
            }
            l4Var.startAnimation();
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
        p5 p5Var = this.w;
        v9 v9Var = this.d;
        if (p5Var != null) {
            p5Var.o(v9Var);
            this.w = null;
        }
        v9Var.b();
        this.s = document;
        this.r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        TLRPC.Document document = this.s;
        if ((document != null || this.r != null) && j3 != 0) {
            Long l4 = this.r;
            if ((l4 != null ? l4.longValue() : document.id) == j3) {
                return;
            }
        }
        p5 p5Var = this.w;
        v9 v9Var = this.d;
        if (p5Var != null) {
            p5Var.o(v9Var);
            this.w = null;
        }
        v9Var.b();
        this.s = null;
        this.r = j3 != 0 ? Long.valueOf(j3) : null;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(xx xxVar) {
        if (xxVar != null && xxVar.b == null) {
            xxVar = null;
        }
        xx xxVar2 = this.v;
        if (xxVar2 == null || xxVar == null || xxVar2.b.id != xxVar.b.id) {
            p5 p5Var = this.w;
            v9 v9Var = this.d;
            if (p5Var != null && this.s == null && this.r == null) {
                p5Var.o(v9Var);
                this.w = null;
            }
            v9Var.b();
            this.v = xxVar;
            c();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.f0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(dw dwVar, Context context, int i10, boolean z10) {
        super(context);
        this.J = dwVar;
        setFocusable(true);
        this.h = false;
        this.n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.j6.Y(dwVar.k(), 8, 8));
        }
        v9 v9Var = new v9(context);
        this.d = v9Var;
        v9Var.w = false;
        v9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(v9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(dw dwVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = dwVar;
        setFocusable(true);
        this.b = true;
        this.h = false;
        this.n = false;
        wv wvVar = new wv(this, context);
        this.d = wvVar;
        wvVar.w = false;
        this.s = document;
        this.c = true;
        wvVar.setColorFilter(dwVar.getEmojiColorFilter());
        addView(wvVar);
        int i10 = rg.b1.L;
        xv xvVar = new xv(context, 1, dwVar.v);
        this.f = xvVar;
        xvVar.setAlpha(0.0f);
        xvVar.setScaleX(0.0f);
        xvVar.setScaleY(0.0f);
        f();
        addView(xvVar);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(dw dwVar, Context context, long j3) {
        super(context);
        this.J = dwVar;
        setFocusable(true);
        this.b = true;
        this.h = false;
        this.n = false;
        ai.z5 z5Var = new ai.z5(this, context, 8);
        this.d = z5Var;
        z5Var.w = false;
        this.r = Long.valueOf(j3);
        this.c = true;
        z5Var.setColorFilter(dwVar.getEmojiColorFilter());
        addView(z5Var);
        int i10 = rg.b1.L;
        yv yvVar = new yv(context, 1, dwVar.v);
        this.f = yvVar;
        yvVar.setAlpha(0.0f);
        yvVar.setScaleX(0.0f);
        yvVar.setScaleY(0.0f);
        f();
        addView(yvVar);
        d();
    }
}
