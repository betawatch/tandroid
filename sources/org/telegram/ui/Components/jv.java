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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class jv extends ViewGroup {
    public Boolean A;
    public float B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public final /* synthetic */ nv F;
    public Long a;
    public boolean b;
    public final boolean c;
    public final o9 d;
    public final mi0 e;
    public final zf.b1 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public jx v;
    public k5 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(nv nvVar, Context context, int i9, int i10) {
        super(context);
        this.F = nvVar;
        setFocusable(true);
        this.h = true;
        this.n = false;
        setBackground(org.telegram.ui.ActionBar.f6.M(nvVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            mi0 mi0Var = new mi0(i10, j3.r0.l(i10, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = mi0Var;
            mi0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            mi0Var.r0 = this;
            mi0Var.H(true);
            mi0Var.start();
        } else {
            o9 o9Var = new o9(context);
            this.d = o9Var;
            o9Var.w = false;
            o9Var.setImageDrawable(context.getResources().getDrawable(i9).mutate());
            addView(o9Var);
        }
        d();
    }

    private void setColor(int i9) {
        nv nvVar = this.F;
        int i10 = nvVar.P;
        if (i10 == 5 || i10 == 7) {
            i9 = nvVar.M;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
        o9 o9Var = this.d;
        if (o9Var != null && !this.c) {
            o9Var.setColorFilter(porterDuffColorFilter);
            o9Var.invalidate();
        }
        mi0 mi0Var = this.e;
        if (mi0Var != null) {
            mi0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        zf.b1 b1Var = this.f;
        if (b1Var == null) {
            return;
        }
        this.A = bool;
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
        ih.z2 z2Var;
        k5 k5Var = this.w;
        if (k5Var == null || (z2Var = k5Var.k) == null) {
            return;
        }
        if (z2Var.getLottieAnimation() != null) {
            z2Var.getLottieAnimation().K(0);
            z2Var.getLottieAnimation().stop();
        } else if (z2Var.getAnimation() != null) {
            z2Var.getAnimation().stop();
        }
    }

    public final void c() {
        o9 o9Var = this.d;
        if (o9Var == null) {
            return;
        }
        if (this.x && this.y) {
            k5 k5Var = this.w;
            if (k5Var != null || (this.s == null && this.r == null)) {
                if (k5Var != null) {
                    k5Var.o(o9Var);
                    this.w = null;
                }
                o9Var.b();
                jx jxVar = this.v;
                if (jxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(jxVar.b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            } else {
                o9Var.b();
                TLRPC.Document document = this.s;
                nv nvVar = this.F;
                if (document != null) {
                    this.w = k5.m(UserConfig.selectedAccount, nvVar.O, document);
                } else {
                    this.w = k5.n(UserConfig.selectedAccount, this.r.longValue(), null, nvVar.O);
                }
                this.w.a(o9Var);
                o9Var.setImageDrawable(this.w);
            }
        } else {
            k5 k5Var2 = this.w;
            if (k5Var2 != null) {
                k5Var2.o(o9Var);
                this.w = null;
            }
            o9Var.b();
        }
        if (this.x && this.y) {
            o9Var.onAttachedToWindow();
        } else {
            o9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        nv nvVar = this.F;
        int k10 = nvVar.k();
        org.telegram.ui.ActionBar.b6 b6Var = nvVar.v;
        org.telegram.ui.ActionBar.f6.B1(background, k10, false);
        if (nvVar.L) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, b6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.C) * 255.0f)));
        } else {
            setColor(i0.a.d(this.C, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Me, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oe, b6Var)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mi0 mi0Var = this.e;
        if (mi0Var == null || !this.y) {
            return;
        }
        mi0Var.draw(canvas);
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
        float f10 = z10 ? 1.0f : 0.0f;
        this.B = f10;
        zf.b1 b1Var = this.f;
        b1Var.setScaleX(f10);
        b1Var.setScaleY(this.B);
        b1Var.setAlpha(this.B);
        b1Var.setVisibility(z10 ? 0 : 8);
    }

    public final void f() {
        zf.b1 b1Var = this.f;
        if (b1Var == null || b1Var.h || !(getDrawable() instanceof k5)) {
            return;
        }
        if (((k5) getDrawable()).c()) {
            b1Var.setImageReceiver(null);
            b1Var.setColor(this.F.M);
            return;
        }
        ih.z2 z2Var = ((k5) getDrawable()).k;
        if (z2Var != null) {
            b1Var.setImageReceiver(z2Var);
            b1Var.invalidate();
        }
    }

    public final void g(boolean z10, boolean z11) {
        o9 o9Var = this.d;
        if ((o9Var == null || o9Var.getImageReceiver().getImageDrawable() != null || this.F.L) && this.D != z10) {
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
            ofFloat.addUpdateListener(new e6(this, 19));
            this.E.addListener(new u9(7, this, z10));
            this.E.setDuration(hg.h0.d() ? 0L : 350L);
            this.E.setInterpolator(gr.h);
            this.E.start();
        }
    }

    public Drawable getDrawable() {
        o9 o9Var = this.d;
        if (o9Var != null) {
            return o9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (hg.h0.b(this)) {
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
        TLRPC.Document f10;
        TLRPC.StickerSet stickerSet;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null) {
            jx jxVar = this.v;
            if (jxVar == null || (stickerSet = jxVar.b) == null || (str = stickerSet.title) == null) {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l10 = this.r;
                    if (l10 != null && (f10 = k5.f(UserConfig.selectedAccount, l10.longValue())) != null) {
                        contentDescription = MessageObject.findAnimatedEmojiEmoticon(f10, null);
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        o9 o9Var = this.d;
        if (o9Var != null) {
            int i13 = (i11 - i9) / 2;
            int i14 = (i12 - i10) / 2;
            o9Var.layout(i13 - (o9Var.getMeasuredWidth() / 2), i14 - (o9Var.getMeasuredHeight() / 2), (o9Var.getMeasuredWidth() / 2) + i13, (o9Var.getMeasuredHeight() / 2) + i14);
        }
        zf.b1 b1Var = this.f;
        if (b1Var != null) {
            int i15 = i11 - i9;
            int i16 = i12 - i10;
            b1Var.layout(i15 - b1Var.getMeasuredWidth(), i16 - b1Var.getMeasuredHeight(), i15, i16);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        o9 o9Var = this.d;
        if (o9Var != null) {
            o9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        zf.b1 b1Var = this.f;
        if (b1Var != null) {
            b1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        ih.z2 z2Var;
        k5 k5Var = this.w;
        if (k5Var != null && (z2Var = k5Var.k) != null) {
            if (z2Var.getAnimation() != null) {
                z2Var.getAnimation().y(0L, true, false);
            }
            z2Var.startAnimation();
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
        k5 k5Var = this.w;
        o9 o9Var = this.d;
        if (k5Var != null) {
            k5Var.o(o9Var);
            this.w = null;
        }
        o9Var.b();
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
        k5 k5Var = this.w;
        o9 o9Var = this.d;
        if (k5Var != null) {
            k5Var.o(o9Var);
            this.w = null;
        }
        o9Var.b();
        this.s = null;
        this.r = j10 != 0 ? Long.valueOf(j10) : null;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(jx jxVar) {
        if (jxVar != null && jxVar.b == null) {
            jxVar = null;
        }
        jx jxVar2 = this.v;
        if (jxVar2 == null || jxVar == null || jxVar2.b.id != jxVar.b.id) {
            k5 k5Var = this.w;
            o9 o9Var = this.d;
            if (k5Var != null && this.s == null && this.r == null) {
                k5Var.o(o9Var);
                this.w = null;
            }
            o9Var.b();
            this.v = jxVar;
            c();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i9, int i10, int i11, int i12) {
        if (hg.h0.b(this)) {
            return;
        }
        super.invalidate(i9, i10, i11, i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(nv nvVar, Context context, int i9, boolean z10) {
        super(context);
        this.F = nvVar;
        setFocusable(true);
        this.h = false;
        this.n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.f6.Y(nvVar.k(), 8, 8));
        }
        o9 o9Var = new o9(context);
        this.d = o9Var;
        o9Var.w = false;
        o9Var.setImageDrawable(context.getResources().getDrawable(i9).mutate());
        d();
        addView(o9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(nv nvVar, Context context, TLRPC.Document document) {
        super(context);
        this.F = nvVar;
        setFocusable(true);
        this.b = true;
        this.h = false;
        this.n = false;
        gv gvVar = new gv(this, context);
        this.d = gvVar;
        gvVar.w = false;
        this.s = document;
        this.c = true;
        gvVar.setColorFilter(nvVar.getEmojiColorFilter());
        addView(gvVar);
        int i9 = zf.b1.H;
        hv hvVar = new hv(context, 1, nvVar.v);
        this.f = hvVar;
        hvVar.setAlpha(0.0f);
        hvVar.setScaleX(0.0f);
        hvVar.setScaleY(0.0f);
        f();
        addView(hvVar);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(nv nvVar, Context context, long j10) {
        super(context);
        this.F = nvVar;
        setFocusable(true);
        this.b = true;
        this.h = false;
        this.n = false;
        ih.d4 d4Var = new ih.d4(this, context, 7);
        this.d = d4Var;
        d4Var.w = false;
        this.r = Long.valueOf(j10);
        this.c = true;
        d4Var.setColorFilter(nvVar.getEmojiColorFilter());
        addView(d4Var);
        int i9 = zf.b1.H;
        iv ivVar = new iv(context, 1, nvVar.v);
        this.f = ivVar;
        ivVar.setAlpha(0.0f);
        ivVar.setScaleX(0.0f);
        ivVar.setScaleY(0.0f);
        f();
        addView(ivVar);
        d();
    }
}
