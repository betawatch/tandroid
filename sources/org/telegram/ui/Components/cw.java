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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class cw extends ViewGroup {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final /* synthetic */ gw J;
    public Long a;
    public boolean b;
    public final boolean c;
    public final w9 d;
    public final hj0 e;
    public final qg.e1 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public dy v;
    public p5 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(gw gwVar, Context context, int i10, int i11) {
        super(context);
        this.J = gwVar;
        setFocusable(true);
        this.h = true;
        this.n = false;
        setBackground(org.telegram.ui.ActionBar.j6.M(gwVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            hj0 hj0Var = new hj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = hj0Var;
            hj0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            hj0Var.v0 = this;
            hj0Var.J(true);
            hj0Var.start();
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
        gw gwVar = this.J;
        int i11 = gwVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = gwVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        w9 w9Var = this.d;
        if (w9Var != null && !this.c) {
            w9Var.setColorFilter(porterDuffColorFilter);
            w9Var.invalidate();
        }
        hj0 hj0Var = this.e;
        if (hj0Var != null) {
            hj0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        qg.e1 e1Var = this.f;
        if (e1Var == null) {
            return;
        }
        this.E = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            e1Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable mutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        e1Var.setImageDrawable(mutate);
    }

    public final void b() {
        gg.h1 h1Var;
        p5 p5Var = this.w;
        if (p5Var == null || (h1Var = p5Var.k) == null) {
            return;
        }
        if (h1Var.getLottieAnimation() != null) {
            h1Var.getLottieAnimation().M(0);
            h1Var.getLottieAnimation().stop();
        } else if (h1Var.getAnimation() != null) {
            h1Var.getAnimation().stop();
        }
    }

    public final void c() {
        w9 w9Var = this.d;
        if (w9Var == null) {
            return;
        }
        if (this.x && this.y) {
            p5 p5Var = this.w;
            if (p5Var != null || (this.s == null && this.r == null)) {
                if (p5Var != null) {
                    p5Var.o(w9Var);
                    this.w = null;
                }
                w9Var.b();
                dy dyVar = this.v;
                if (dyVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(dyVar.b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            } else {
                w9Var.b();
                TLRPC.Document document = this.s;
                gw gwVar = this.J;
                if (document != null) {
                    this.w = p5.m(UserConfig.selectedAccount, gwVar.S, document);
                } else {
                    this.w = p5.n(UserConfig.selectedAccount, this.r.longValue(), null, gwVar.S);
                }
                this.w.a(w9Var);
                w9Var.setImageDrawable(this.w);
            }
        } else {
            p5 p5Var2 = this.w;
            if (p5Var2 != null) {
                p5Var2.o(w9Var);
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
        gw gwVar = this.J;
        int k10 = gwVar.k();
        org.telegram.ui.ActionBar.f6 f6Var = gwVar.v;
        org.telegram.ui.ActionBar.j6.B1(background, k10, false);
        if (gwVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
        } else {
            setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oe, f6Var)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        hj0 hj0Var = this.e;
        if (hj0Var == null || !this.y) {
            return;
        }
        hj0Var.draw(canvas);
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
        qg.e1 e1Var = this.f;
        e1Var.setScaleX(f7);
        e1Var.setScaleY(this.F);
        e1Var.setAlpha(this.F);
        e1Var.setVisibility(z10 ? 0 : 8);
    }

    public final void f() {
        qg.e1 e1Var = this.f;
        if (e1Var == null || e1Var.h || !(getDrawable() instanceof p5)) {
            return;
        }
        if (((p5) getDrawable()).c()) {
            e1Var.setImageReceiver(null);
            e1Var.setColor(this.J.Q);
            return;
        }
        gg.h1 h1Var = ((p5) getDrawable()).k;
        if (h1Var != null) {
            e1Var.setImageReceiver(h1Var);
            e1Var.invalidate();
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
            ofFloat.addUpdateListener(new j6(this, 19));
            this.I.addListener(new yo(3, this, z10));
            this.I.setDuration(yg.f0.d() ? 0L : 350L);
            this.I.setInterpolator(wr.h);
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
        if (yg.f0.b(this)) {
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
            dy dyVar = this.v;
            if (dyVar == null || (stickerSet = dyVar.b) == null || (str = stickerSet.title) == null) {
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
        w9 w9Var = this.d;
        if (w9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            w9Var.layout(i14 - (w9Var.getMeasuredWidth() / 2), i15 - (w9Var.getMeasuredHeight() / 2), (w9Var.getMeasuredWidth() / 2) + i14, (w9Var.getMeasuredHeight() / 2) + i15);
        }
        qg.e1 e1Var = this.f;
        if (e1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            e1Var.layout(i16 - e1Var.getMeasuredWidth(), i17 - e1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        w9 w9Var = this.d;
        if (w9Var != null) {
            w9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        qg.e1 e1Var = this.f;
        if (e1Var != null) {
            e1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        gg.h1 h1Var;
        p5 p5Var = this.w;
        if (p5Var != null && (h1Var = p5Var.k) != null) {
            if (h1Var.getAnimation() != null) {
                h1Var.getAnimation().y(0L, true, false);
            }
            h1Var.startAnimation();
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
        w9 w9Var = this.d;
        if (p5Var != null) {
            p5Var.o(w9Var);
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
        p5 p5Var = this.w;
        w9 w9Var = this.d;
        if (p5Var != null) {
            p5Var.o(w9Var);
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

    public void setStickerThumb(dy dyVar) {
        if (dyVar != null && dyVar.b == null) {
            dyVar = null;
        }
        dy dyVar2 = this.v;
        if (dyVar2 == null || dyVar == null || dyVar2.b.id != dyVar.b.id) {
            p5 p5Var = this.w;
            w9 w9Var = this.d;
            if (p5Var != null && this.s == null && this.r == null) {
                p5Var.o(w9Var);
                this.w = null;
            }
            w9Var.b();
            this.v = dyVar;
            c();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (yg.f0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(gw gwVar, Context context, int i10, boolean z10) {
        super(context);
        this.J = gwVar;
        setFocusable(true);
        this.h = false;
        this.n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.j6.Y(gwVar.k(), 8, 8));
        }
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.w = false;
        w9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(w9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(gw gwVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = gwVar;
        setFocusable(true);
        this.b = true;
        this.h = false;
        this.n = false;
        zv zvVar = new zv(this, context);
        this.d = zvVar;
        zvVar.w = false;
        this.s = document;
        this.c = true;
        zvVar.setColorFilter(gwVar.getEmojiColorFilter());
        addView(zvVar);
        int i10 = qg.e1.L;
        aw awVar = new aw(context, 1, gwVar.v);
        this.f = awVar;
        awVar.setAlpha(0.0f);
        awVar.setScaleX(0.0f);
        awVar.setScaleY(0.0f);
        f();
        addView(awVar);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(gw gwVar, Context context, long j3) {
        super(context);
        this.J = gwVar;
        setFocusable(true);
        this.b = true;
        this.h = false;
        this.n = false;
        gg.i1 i1Var = new gg.i1(this, context, 7);
        this.d = i1Var;
        i1Var.w = false;
        this.r = Long.valueOf(j3);
        this.c = true;
        i1Var.setColorFilter(gwVar.getEmojiColorFilter());
        addView(i1Var);
        int i10 = qg.e1.L;
        bw bwVar = new bw(context, 1, gwVar.v);
        this.f = bwVar;
        bwVar.setAlpha(0.0f);
        bwVar.setScaleX(0.0f);
        bwVar.setScaleY(0.0f);
        f();
        addView(bwVar);
        d();
    }
}
