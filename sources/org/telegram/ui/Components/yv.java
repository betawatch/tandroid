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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public class yv extends ViewGroup {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final /* synthetic */ cw J;
    public Long a;
    public boolean b;
    public final boolean c;
    public final u9 d;
    public final yi0 e;
    public final rg.b1 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public wx v;
    public o5 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(cw cwVar, Context context, int i10, int i11) {
        super(context);
        this.J = cwVar;
        setFocusable(true);
        this.h = true;
        this.n = false;
        setBackground(org.telegram.ui.ActionBar.j6.M(cwVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            yi0 yi0Var = new yi0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = yi0Var;
            yi0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            yi0Var.R(this);
            yi0Var.J(true);
            yi0Var.start();
        } else {
            u9 u9Var = new u9(context);
            this.d = u9Var;
            u9Var.w = false;
            u9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(u9Var);
        }
        d();
    }

    private void setColor(int i10) {
        cw cwVar = this.J;
        int i11 = cwVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = cwVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        u9 u9Var = this.d;
        if (u9Var != null && !this.c) {
            u9Var.setColorFilter(porterDuffColorFilter);
            u9Var.invalidate();
        }
        yi0 yi0Var = this.e;
        if (yi0Var != null) {
            yi0Var.setColorFilter(porterDuffColorFilter);
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
        o5 o5Var = this.w;
        if (o5Var == null || (l4Var = o5Var.k) == null) {
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
        u9 u9Var = this.d;
        if (u9Var == null) {
            return;
        }
        if (this.x && this.y) {
            o5 o5Var = this.w;
            if (o5Var != null || (this.s == null && this.r == null)) {
                if (o5Var != null) {
                    o5Var.o(u9Var);
                    this.w = null;
                }
                u9Var.b();
                wx wxVar = this.v;
                if (wxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(wxVar.b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            } else {
                u9Var.b();
                TLRPC.Document document = this.s;
                cw cwVar = this.J;
                if (document != null) {
                    this.w = o5.m(UserConfig.selectedAccount, cwVar.S, document);
                } else {
                    this.w = o5.n(UserConfig.selectedAccount, this.r.longValue(), null, cwVar.S);
                }
                this.w.a(u9Var);
                u9Var.setImageDrawable(this.w);
            }
        } else {
            o5 o5Var2 = this.w;
            if (o5Var2 != null) {
                o5Var2.o(u9Var);
                this.w = null;
            }
            u9Var.b();
        }
        if (this.x && this.y) {
            u9Var.onAttachedToWindow();
        } else {
            u9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        cw cwVar = this.J;
        int k10 = cwVar.k();
        org.telegram.ui.ActionBar.f6 f6Var = cwVar.v;
        org.telegram.ui.ActionBar.j6.B1(background, k10, false);
        if (cwVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
        } else {
            setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oe, f6Var)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yi0 yi0Var = this.e;
        if (yi0Var == null || !this.y) {
            return;
        }
        yi0Var.draw(canvas);
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
        if (b1Var == null || b1Var.h || !(getDrawable() instanceof o5)) {
            return;
        }
        if (((o5) getDrawable()).c()) {
            b1Var.setImageReceiver(null);
            b1Var.setColor(this.J.Q);
            return;
        }
        ai.l4 l4Var = ((o5) getDrawable()).k;
        if (l4Var != null) {
            b1Var.setImageReceiver(l4Var);
            b1Var.invalidate();
        }
    }

    public final void g(boolean z10, boolean z11) {
        u9 u9Var = this.d;
        if ((u9Var == null || u9Var.getImageReceiver().getImageDrawable() != null || this.J.P) && this.H != z10) {
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
            ofFloat.addUpdateListener(new i6(this, 19));
            this.I.addListener(new aa(7, this, z10));
            this.I.setDuration(zg.f0.d() ? 0L : 350L);
            this.I.setInterpolator(qr.h);
            this.I.start();
        }
    }

    public Drawable getDrawable() {
        u9 u9Var = this.d;
        if (u9Var != null) {
            return u9Var.getImageReceiver().getImageDrawable();
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
            wx wxVar = this.v;
            if (wxVar == null || (stickerSet = wxVar.b) == null || (str = stickerSet.title) == null) {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.r;
                    if (l4 != null && (f7 = o5.f(UserConfig.selectedAccount, l4.longValue())) != null) {
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
        u9 u9Var = this.d;
        if (u9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            u9Var.layout(i14 - (u9Var.getMeasuredWidth() / 2), i15 - (u9Var.getMeasuredHeight() / 2), (u9Var.getMeasuredWidth() / 2) + i14, (u9Var.getMeasuredHeight() / 2) + i15);
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
        u9 u9Var = this.d;
        if (u9Var != null) {
            u9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        rg.b1 b1Var = this.f;
        if (b1Var != null) {
            b1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        ai.l4 l4Var;
        o5 o5Var = this.w;
        if (o5Var != null && (l4Var = o5Var.k) != null) {
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
        o5 o5Var = this.w;
        u9 u9Var = this.d;
        if (o5Var != null) {
            o5Var.o(u9Var);
            this.w = null;
        }
        u9Var.b();
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
        o5 o5Var = this.w;
        u9 u9Var = this.d;
        if (o5Var != null) {
            o5Var.o(u9Var);
            this.w = null;
        }
        u9Var.b();
        this.s = null;
        this.r = j3 != 0 ? Long.valueOf(j3) : null;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(wx wxVar) {
        if (wxVar != null && wxVar.b == null) {
            wxVar = null;
        }
        wx wxVar2 = this.v;
        if (wxVar2 == null || wxVar == null || wxVar2.b.id != wxVar.b.id) {
            o5 o5Var = this.w;
            u9 u9Var = this.d;
            if (o5Var != null && this.s == null && this.r == null) {
                o5Var.o(u9Var);
                this.w = null;
            }
            u9Var.b();
            this.v = wxVar;
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
    public yv(cw cwVar, Context context, int i10, boolean z10) {
        super(context);
        this.J = cwVar;
        setFocusable(true);
        this.h = false;
        this.n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.j6.Y(cwVar.k(), 8, 8));
        }
        u9 u9Var = new u9(context);
        this.d = u9Var;
        u9Var.w = false;
        u9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(u9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(cw cwVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = cwVar;
        setFocusable(true);
        this.b = true;
        this.h = false;
        this.n = false;
        vv vvVar = new vv(this, context);
        this.d = vvVar;
        vvVar.w = false;
        this.s = document;
        this.c = true;
        vvVar.setColorFilter(cwVar.getEmojiColorFilter());
        addView(vvVar);
        int i10 = rg.b1.L;
        wv wvVar = new wv(context, 1, cwVar.v);
        this.f = wvVar;
        wvVar.setAlpha(0.0f);
        wvVar.setScaleX(0.0f);
        wvVar.setScaleY(0.0f);
        f();
        addView(wvVar);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(cw cwVar, Context context, long j3) {
        super(context);
        this.J = cwVar;
        setFocusable(true);
        this.b = true;
        this.h = false;
        this.n = false;
        ai.z5 z5Var = new ai.z5(this, context, 8);
        this.d = z5Var;
        z5Var.w = false;
        this.r = Long.valueOf(j3);
        this.c = true;
        z5Var.setColorFilter(cwVar.getEmojiColorFilter());
        addView(z5Var);
        int i10 = rg.b1.L;
        xv xvVar = new xv(context, 1, cwVar.v);
        this.f = xvVar;
        xvVar.setAlpha(0.0f);
        xvVar.setScaleX(0.0f);
        xvVar.setScaleY(0.0f);
        f();
        addView(xvVar);
        d();
    }
}
