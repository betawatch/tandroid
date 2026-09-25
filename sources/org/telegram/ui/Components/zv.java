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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
    public final w9 d;
    public final ij0 e;
    public final rg.b1 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public yx v;
    public q5 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(dw dwVar, Context context, int i10, int i11) {
        super(context);
        this.J = dwVar;
        setFocusable(true);
        this.h = true;
        this.n = false;
        setBackground(org.telegram.ui.ActionBar.h6.M(dwVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            ij0 ij0Var = new ij0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = ij0Var;
            ij0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            ij0Var.R(this);
            ij0Var.J(true);
            ij0Var.start();
        } else {
            w9 w9Var = new w9(context);
            this.d = w9Var;
            w9Var.w = false;
            w9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(w9Var);
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
        w9 w9Var = this.d;
        if (w9Var != null && !this.c) {
            w9Var.setColorFilter(porterDuffColorFilter);
            w9Var.invalidate();
        }
        ij0 ij0Var = this.e;
        if (ij0Var != null) {
            ij0Var.setColorFilter(porterDuffColorFilter);
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
        q5 q5Var = this.w;
        if (q5Var == null || (l4Var = q5Var.k) == null) {
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
        w9 w9Var = this.d;
        if (w9Var == null) {
            return;
        }
        if (this.x && this.y) {
            q5 q5Var = this.w;
            if (q5Var != null || (this.s == null && this.r == null)) {
                if (q5Var != null) {
                    q5Var.o(w9Var);
                    this.w = null;
                }
                w9Var.b();
                yx yxVar = this.v;
                if (yxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(yxVar.b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            } else {
                w9Var.b();
                TLRPC.Document document = this.s;
                dw dwVar = this.J;
                if (document != null) {
                    this.w = q5.m(UserConfig.selectedAccount, dwVar.S, document);
                } else {
                    this.w = q5.n(UserConfig.selectedAccount, this.r.longValue(), null, dwVar.S);
                }
                this.w.a(w9Var);
                w9Var.setImageDrawable(this.w);
            }
        } else {
            q5 q5Var2 = this.w;
            if (q5Var2 != null) {
                q5Var2.o(w9Var);
                this.w = null;
            }
            w9Var.b();
        }
        if (this.x && this.y) {
            w9Var.onAttachedToWindow();
        } else {
            w9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        dw dwVar = this.J;
        int k10 = dwVar.k();
        org.telegram.ui.ActionBar.d6 d6Var = dwVar.v;
        org.telegram.ui.ActionBar.h6.B1(background, k10, false);
        if (dwVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Wk, d6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
        } else {
            setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Me, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oe, d6Var)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ij0 ij0Var = this.e;
        if (ij0Var == null || !this.y) {
            return;
        }
        ij0Var.draw(canvas);
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
        if (b1Var == null || b1Var.h || !(getDrawable() instanceof q5)) {
            return;
        }
        if (((q5) getDrawable()).c()) {
            b1Var.setImageReceiver(null);
            b1Var.setColor(this.J.Q);
            return;
        }
        ai.l4 l4Var = ((q5) getDrawable()).k;
        if (l4Var != null) {
            b1Var.setImageReceiver(l4Var);
            b1Var.invalidate();
        }
    }

    public final void g(boolean z10, boolean z11) {
        w9 w9Var = this.d;
        if ((w9Var == null || w9Var.getImageReceiver().getImageDrawable() != null || this.J.P) && this.H != z10) {
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
            ofFloat.addUpdateListener(new k6(this, 19));
            this.I.addListener(new ca(7, this, z10));
            this.I.setDuration(zg.e0.d() ? 0L : 350L);
            this.I.setInterpolator(rr.h);
            this.I.start();
        }
    }

    public Drawable getDrawable() {
        w9 w9Var = this.d;
        if (w9Var != null) {
            return w9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (zg.e0.b(this)) {
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
            yx yxVar = this.v;
            if (yxVar == null || (stickerSet = yxVar.b) == null || (str = stickerSet.title) == null) {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.r;
                    if (l4 != null && (f7 = q5.f(UserConfig.selectedAccount, l4.longValue())) != null) {
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
        w9 w9Var = this.d;
        if (w9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            w9Var.layout(i14 - (w9Var.getMeasuredWidth() / 2), i15 - (w9Var.getMeasuredHeight() / 2), (w9Var.getMeasuredWidth() / 2) + i14, (w9Var.getMeasuredHeight() / 2) + i15);
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
        w9 w9Var = this.d;
        if (w9Var != null) {
            w9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        rg.b1 b1Var = this.f;
        if (b1Var != null) {
            b1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        ai.l4 l4Var;
        q5 q5Var = this.w;
        if (q5Var != null && (l4Var = q5Var.k) != null) {
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
        q5 q5Var = this.w;
        w9 w9Var = this.d;
        if (q5Var != null) {
            q5Var.o(w9Var);
            this.w = null;
        }
        w9Var.b();
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
        q5 q5Var = this.w;
        w9 w9Var = this.d;
        if (q5Var != null) {
            q5Var.o(w9Var);
            this.w = null;
        }
        w9Var.b();
        this.s = null;
        this.r = j3 != 0 ? Long.valueOf(j3) : null;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(yx yxVar) {
        if (yxVar != null && yxVar.b == null) {
            yxVar = null;
        }
        yx yxVar2 = this.v;
        if (yxVar2 == null || yxVar == null || yxVar2.b.id != yxVar.b.id) {
            q5 q5Var = this.w;
            w9 w9Var = this.d;
            if (q5Var != null && this.s == null && this.r == null) {
                q5Var.o(w9Var);
                this.w = null;
            }
            w9Var.b();
            this.v = yxVar;
            c();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.e0.b(this)) {
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
            setBackground(org.telegram.ui.ActionBar.h6.Y(dwVar.k(), 8, 8));
        }
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.w = false;
        w9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(w9Var);
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
        ai.y5 y5Var = new ai.y5(this, context, 8);
        this.d = y5Var;
        y5Var.w = false;
        this.r = Long.valueOf(j3);
        this.c = true;
        y5Var.setColorFilter(dwVar.getEmojiColorFilter());
        addView(y5Var);
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
