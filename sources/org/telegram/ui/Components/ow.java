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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class ow extends ViewGroup {
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final /* synthetic */ sw J;
    public Long a;
    public boolean b;
    public final boolean c;
    public final y9 d;
    public final ck0 e;
    public final rg.c1 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public ny v;
    public s5 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(sw swVar, Context context, int i10) {
        super(context);
        this.J = swVar;
        setFocusable(true);
        this.h = true;
        this.n = false;
        setBackground(org.telegram.ui.ActionBar.i6.N(swVar.k(), 0, 0));
        ck0 ck0Var = new ck0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
        this.e = ck0Var;
        ck0Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
        ck0Var.R(this);
        ck0Var.J(true);
        ck0Var.start();
        d();
    }

    private void setColor(int i10) {
        sw swVar = this.J;
        int i11 = swVar.T;
        if (i11 == 5 || i11 == 7) {
            i10 = swVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        y9 y9Var = this.d;
        if (y9Var != null && !this.c) {
            y9Var.setColorFilter(porterDuffColorFilter);
            y9Var.invalidate();
        }
        ck0 ck0Var = this.e;
        if (ck0Var != null) {
            ck0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        rg.c1 c1Var = this.f;
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

    public final void b() {
        ai.m4 m4Var;
        s5 s5Var = this.w;
        if (s5Var == null || (m4Var = s5Var.k) == null) {
            return;
        }
        if (m4Var.getLottieAnimation() != null) {
            m4Var.getLottieAnimation().M(0);
            m4Var.getLottieAnimation().stop();
        } else if (m4Var.getAnimation() != null) {
            m4Var.getAnimation().stop();
        }
    }

    public final void c() {
        y9 y9Var = this.d;
        if (y9Var == null) {
            return;
        }
        if (this.x && this.y) {
            s5 s5Var = this.w;
            if (s5Var != null || (this.s == null && this.r == null)) {
                if (s5Var != null) {
                    s5Var.o(y9Var);
                    this.w = null;
                }
                y9Var.b();
                ny nyVar = this.v;
                if (nyVar != null) {
                    this.d.i(ImageLocation.getForStickerSet(nyVar.b), "24_24", null, null, this.v);
                    if (this.v.d != null) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.v.d, false);
                        this.v.d = null;
                    }
                }
            } else {
                y9Var.b();
                TLRPC.Document document = this.s;
                sw swVar = this.J;
                if (document != null) {
                    this.w = s5.m(UserConfig.selectedAccount, swVar.S, document);
                } else {
                    this.w = s5.n(UserConfig.selectedAccount, this.r.longValue(), null, swVar.S);
                }
                this.w.a(y9Var);
                y9Var.setImageDrawable(this.w);
            }
        } else {
            s5 s5Var2 = this.w;
            if (s5Var2 != null) {
                s5Var2.o(y9Var);
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
        sw swVar = this.J;
        int k10 = swVar.k();
        org.telegram.ui.ActionBar.e6 e6Var = swVar.v;
        org.telegram.ui.ActionBar.i6.C1(background, k10, false);
        if (swVar.P) {
            setColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Wk, e6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.G) * 255.0f)));
        } else {
            setColor(i0.a.d(this.G, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Me, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oe, e6Var)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ck0 ck0Var = this.e;
        if (ck0Var == null || !this.y) {
            return;
        }
        ck0Var.draw(canvas);
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
        rg.c1 c1Var = this.f;
        c1Var.setScaleX(f7);
        c1Var.setScaleY(this.F);
        c1Var.setAlpha(this.F);
        c1Var.setVisibility(z10 ? 0 : 8);
    }

    public final void f() {
        rg.c1 c1Var = this.f;
        if (c1Var == null || c1Var.h || !(getDrawable() instanceof s5)) {
            return;
        }
        if (((s5) getDrawable()).c()) {
            c1Var.setImageReceiver(null);
            c1Var.setColor(this.J.Q);
            return;
        }
        ai.m4 m4Var = ((s5) getDrawable()).k;
        if (m4Var != null) {
            c1Var.setImageReceiver(m4Var);
            c1Var.invalidate();
        }
    }

    public final void g(boolean z10, boolean z11) {
        y9 y9Var = this.d;
        if ((y9Var == null || y9Var.getImageReceiver().getImageDrawable() != null || this.J.P) && this.H != z10) {
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
            ofFloat.addUpdateListener(new m6(this, 20));
            this.I.addListener(new fa(7, this, z10));
            this.I.setDuration(zg.d0.d() ? 0L : 350L);
            this.I.setInterpolator(hs.h);
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
        if (zg.d0.b(this)) {
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
            ny nyVar = this.v;
            if (nyVar == null || (stickerSet = nyVar.b) == null || (str = stickerSet.title) == null) {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                } else {
                    Long l4 = this.r;
                    if (l4 != null && (f7 = s5.f(UserConfig.selectedAccount, l4.longValue())) != null) {
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
        rg.c1 c1Var = this.f;
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
        rg.c1 c1Var = this.f;
        if (c1Var != null) {
            c1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        ai.m4 m4Var;
        s5 s5Var = this.w;
        if (s5Var != null && (m4Var = s5Var.k) != null) {
            if (m4Var.getAnimation() != null) {
                m4Var.getAnimation().y(0L, true, false);
            }
            m4Var.startAnimation();
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
        s5 s5Var = this.w;
        y9 y9Var = this.d;
        if (s5Var != null) {
            s5Var.o(y9Var);
            this.w = null;
        }
        y9Var.b();
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
        s5 s5Var = this.w;
        y9 y9Var = this.d;
        if (s5Var != null) {
            s5Var.o(y9Var);
            this.w = null;
        }
        y9Var.b();
        this.s = null;
        this.r = j3 != 0 ? Long.valueOf(j3) : null;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(ny nyVar) {
        if (nyVar != null && nyVar.b == null) {
            nyVar = null;
        }
        ny nyVar2 = this.v;
        if (nyVar2 == null || nyVar == null || nyVar2.b.id != nyVar.b.id) {
            s5 s5Var = this.w;
            y9 y9Var = this.d;
            if (s5Var != null && this.s == null && this.r == null) {
                s5Var.o(y9Var);
                this.w = null;
            }
            y9Var.b();
            this.v = nyVar;
            c();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.d0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(sw swVar, Context context, int i10, boolean z10) {
        super(context);
        this.J = swVar;
        setFocusable(true);
        this.h = false;
        this.n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.i6.Z(swVar.k(), 8, 8));
        }
        y9 y9Var = new y9(context);
        this.d = y9Var;
        y9Var.w = false;
        y9Var.setImageDrawable(context.getResources().getDrawable(i10).mutate());
        d();
        addView(y9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(sw swVar, Context context, TLRPC.Document document) {
        super(context);
        this.J = swVar;
        setFocusable(true);
        this.b = true;
        this.h = false;
        this.n = false;
        lw lwVar = new lw(this, context);
        this.d = lwVar;
        lwVar.w = false;
        this.s = document;
        this.c = true;
        lwVar.setColorFilter(swVar.getEmojiColorFilter());
        addView(lwVar);
        int i10 = rg.c1.L;
        mw mwVar = new mw(context, 1, swVar.v);
        this.f = mwVar;
        mwVar.setAlpha(0.0f);
        mwVar.setScaleX(0.0f);
        mwVar.setScaleY(0.0f);
        f();
        addView(mwVar);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(sw swVar, Context context, long j3) {
        super(context);
        this.J = swVar;
        setFocusable(true);
        this.b = true;
        this.h = false;
        this.n = false;
        ai.z5 z5Var = new ai.z5(this, context, 8);
        this.d = z5Var;
        z5Var.w = false;
        this.r = Long.valueOf(j3);
        this.c = true;
        z5Var.setColorFilter(swVar.getEmojiColorFilter());
        addView(z5Var);
        int i10 = rg.c1.L;
        nw nwVar = new nw(context, 1, swVar.v);
        this.f = nwVar;
        nwVar.setAlpha(0.0f);
        nwVar.setScaleX(0.0f);
        nwVar.setScaleY(0.0f);
        f();
        addView(nwVar);
        d();
    }
}
