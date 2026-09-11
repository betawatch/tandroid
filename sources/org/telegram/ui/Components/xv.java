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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class xv extends ViewGroup {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final /* synthetic */ bw J;
    public Long a;
    public boolean b;
    public final boolean c;
    public final x9 d;
    public final xi0 e;
    public final sg.e1 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public xx v;
    public q5 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(bw bwVar, Context context, int i10, int i11) {
        super(context);
        this.J = bwVar;
        setFocusable(true);
        this.h = true;
        this.n = false;
        setBackground(org.telegram.ui.ActionBar.j6.M(bwVar.k(), 0, 0));
        if (Build.VERSION.SDK_INT >= 23) {
            xi0 xi0Var = new xi0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
            this.e = xi0Var;
            xi0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            xi0Var.v0 = this;
            xi0Var.H(true);
            xi0Var.start();
        } else {
            x9 x9Var = new x9(context);
            this.d = x9Var;
            x9Var.w = false;
            x9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
            addView(x9Var);
        }
        d();
    }

    private void setColor(int i10) {
        bw bwVar = this.J;
        int i11 = bwVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = bwVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        x9 x9Var = this.d;
        if (x9Var != null && !this.c) {
            x9Var.setColorFilter(porterDuffColorFilter);
            x9Var.invalidate();
        }
        xi0 xi0Var = this.e;
        if (xi0Var != null) {
            xi0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        sg.e1 e1Var = this.f;
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
        bi.y3 y3Var;
        q5 q5Var = this.w;
        if (q5Var == null || (y3Var = q5Var.k) == null) {
            return;
        }
        if (y3Var.getLottieAnimation() != null) {
            y3Var.getLottieAnimation().K(0);
            y3Var.getLottieAnimation().stop();
        } else if (y3Var.getAnimation() != null) {
            y3Var.getAnimation().stop();
        }
    }

    public final void c() {
        x9 x9Var = this.d;
        if (x9Var == null) {
            return;
        }
        if (this.x && this.y) {
            q5 q5Var = this.w;
            if (q5Var != null || (this.s == null && this.r == null)) {
                if (q5Var != null) {
                    q5Var.o(x9Var);
                    this.w = null;
                }
                x9Var.b();
                xx xxVar = this.v;
                if (xxVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(xxVar.b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            } else {
                x9Var.b();
                TLRPC.Document document = this.s;
                bw bwVar = this.J;
                if (document != null) {
                    this.w = q5.m(UserConfig.selectedAccount, bwVar.S, document);
                } else {
                    this.w = q5.n(UserConfig.selectedAccount, this.r.longValue(), null, bwVar.S);
                }
                this.w.a(x9Var);
                x9Var.setImageDrawable(this.w);
            }
        } else {
            q5 q5Var2 = this.w;
            if (q5Var2 != null) {
                q5Var2.o(x9Var);
                this.w = null;
            }
            x9Var.b();
        }
        if (this.x && this.y) {
            x9Var.onAttachedToWindow();
        } else {
            x9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        bw bwVar = this.J;
        int k10 = bwVar.k();
        org.telegram.ui.ActionBar.f6 f6Var = bwVar.v;
        org.telegram.ui.ActionBar.j6.B1(background, k10, false);
        if (bwVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
        } else {
            setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oe, f6Var)));
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
        sg.e1 e1Var = this.f;
        e1Var.setScaleX(f7);
        e1Var.setScaleY(this.F);
        e1Var.setAlpha(this.F);
        e1Var.setVisibility(z10 ? 0 : 8);
    }

    public final void f() {
        sg.e1 e1Var = this.f;
        if (e1Var == null || e1Var.h || !(getDrawable() instanceof q5)) {
            return;
        }
        if (((q5) getDrawable()).c()) {
            e1Var.setImageReceiver(null);
            e1Var.setColor(this.J.Q);
            return;
        }
        bi.y3 y3Var = ((q5) getDrawable()).k;
        if (y3Var != null) {
            e1Var.setImageReceiver(y3Var);
            e1Var.invalidate();
        }
    }

    public final void g(boolean z10, boolean z11) {
        x9 x9Var = this.d;
        if ((x9Var == null || x9Var.getImageReceiver().getImageDrawable() != null || this.J.P) && this.H != z10) {
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
            ofFloat.addUpdateListener(new l6(this, 19));
            this.I.addListener(new org.telegram.ui.to(8, this, z10));
            this.I.setDuration(ah.y0.d() ? 0L : 350L);
            this.I.setInterpolator(pr.h);
            this.I.start();
        }
    }

    public Drawable getDrawable() {
        x9 x9Var = this.d;
        if (x9Var != null) {
            return x9Var.getImageReceiver().getImageDrawable();
        }
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ah.y0.b(this)) {
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
        x9 x9Var = this.d;
        if (x9Var != null) {
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 2;
            x9Var.layout(i14 - (x9Var.getMeasuredWidth() / 2), i15 - (x9Var.getMeasuredHeight() / 2), (x9Var.getMeasuredWidth() / 2) + i14, (x9Var.getMeasuredHeight() / 2) + i15);
        }
        sg.e1 e1Var = this.f;
        if (e1Var != null) {
            int i16 = i12 - i10;
            int i17 = i13 - i11;
            e1Var.layout(i16 - e1Var.getMeasuredWidth(), i17 - e1Var.getMeasuredHeight(), i16, i17);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        x9 x9Var = this.d;
        if (x9Var != null) {
            x9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        sg.e1 e1Var = this.f;
        if (e1Var != null) {
            e1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        bi.y3 y3Var;
        q5 q5Var = this.w;
        if (q5Var != null && (y3Var = q5Var.k) != null) {
            if (y3Var.getAnimation() != null) {
                y3Var.getAnimation().y(0L, true, false);
            }
            y3Var.startAnimation();
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
        x9 x9Var = this.d;
        if (q5Var != null) {
            q5Var.o(x9Var);
            this.w = null;
        }
        x9Var.b();
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
        x9 x9Var = this.d;
        if (q5Var != null) {
            q5Var.o(x9Var);
            this.w = null;
        }
        x9Var.b();
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
            q5 q5Var = this.w;
            x9 x9Var = this.d;
            if (q5Var != null && this.s == null && this.r == null) {
                q5Var.o(x9Var);
                this.w = null;
            }
            x9Var.b();
            this.v = xxVar;
            c();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ah.y0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(bw bwVar, Context context, int i10, boolean z10) {
        super(context);
        this.J = bwVar;
        setFocusable(true);
        this.h = false;
        this.n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.j6.Y(bwVar.k(), 8, 8));
        }
        x9 x9Var = new x9(context);
        this.d = x9Var;
        x9Var.w = false;
        x9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(x9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(bw bwVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = bwVar;
        setFocusable(true);
        this.b = true;
        this.h = false;
        this.n = false;
        uv uvVar = new uv(this, context);
        this.d = uvVar;
        uvVar.w = false;
        this.s = document;
        this.c = true;
        uvVar.setColorFilter(bwVar.getEmojiColorFilter());
        addView(uvVar);
        int i10 = sg.e1.L;
        vv vvVar = new vv(context, 1, bwVar.v);
        this.f = vvVar;
        vvVar.setAlpha(0.0f);
        vvVar.setScaleX(0.0f);
        vvVar.setScaleY(0.0f);
        f();
        addView(vvVar);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(bw bwVar, Context context, long j3) {
        super(context);
        this.J = bwVar;
        setFocusable(true);
        this.b = true;
        this.h = false;
        this.n = false;
        bi.i5 i5Var = new bi.i5(this, context, 8);
        this.d = i5Var;
        i5Var.w = false;
        this.r = Long.valueOf(j3);
        this.c = true;
        i5Var.setColorFilter(bwVar.getEmojiColorFilter());
        addView(i5Var);
        int i10 = sg.e1.L;
        wv wvVar = new wv(context, 1, bwVar.v);
        this.f = wvVar;
        wvVar.setAlpha(0.0f);
        wvVar.setScaleX(0.0f);
        wvVar.setScaleY(0.0f);
        f();
        addView(wvVar);
        d();
    }
}
