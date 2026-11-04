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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class vu extends ViewGroup implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public Boolean F;
    public float G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public int K;
    public int L;
    public int M;
    public float N;
    public final /* synthetic */ zu O;
    public Long a;
    public boolean b;
    public final boolean c;
    public final k9 d;
    public final ch0 e;
    public final vg.y0 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public sw w;
    public g5 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu(zu zuVar, Context context, int i3) {
        super(context);
        this.O = zuVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = true;
        this.n = false;
        setBackground(org.telegram.ui.ActionBar.k6.O(zuVar.k(), 0, 0));
        ch0 ch0Var = new ch0(i3, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), false, null);
        this.e = ch0Var;
        ch0Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
        ch0Var.R(this);
        ch0Var.J(true);
        ch0Var.start();
        d();
    }

    private void setColor(int i3) {
        zu zuVar = this.O;
        int i10 = zuVar.U;
        if (i10 == 5 || i10 == 7) {
            i3 = zuVar.R;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
        k9 k9Var = this.d;
        if (k9Var != null && !this.c) {
            k9Var.setColorFilter(porterDuffColorFilter);
            k9Var.invalidate();
        }
        ch0 ch0Var = this.e;
        if (ch0Var != null) {
            ch0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        vg.y0 y0Var = this.f;
        if (y0Var == null) {
            return;
        }
        this.F = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            y0Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable mutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        y0Var.setImageDrawable(mutate);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Df));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kl));
    }

    public final void b() {
        ei.c3 c3Var;
        g5 g5Var = this.x;
        if (g5Var == null || (c3Var = g5Var.k) == null) {
            return;
        }
        if (c3Var.B() != null) {
            c3Var.B().M(0);
            c3Var.B().stop();
        } else if (c3Var.m() != null) {
            c3Var.m().stop();
        }
    }

    public final void c() {
        TLRPC.PhotoSize w10;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        org.telegram.messenger.ac h;
        k9 k9Var = this.d;
        if (k9Var == null) {
            return;
        }
        if (this.y && this.E) {
            g5 g5Var = this.x;
            if (g5Var != null || (this.s == null && this.r == null)) {
                if (g5Var != null) {
                    g5Var.n(k9Var);
                    this.x = null;
                }
                k9Var.b();
                sw swVar = this.w;
                if (swVar != null) {
                    TLRPC.StickerSet stickerSet = swVar.b;
                    if (stickerSet == null || (w10 = org.telegram.messenger.w7.w(stickerSet.thumbs, 90, false, null, false)) == null) {
                        h = null;
                    } else {
                        if (stickerSet.access_hash != 0) {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetShortName.id = stickerSet.id;
                            tL_inputStickerSetShortName.access_hash = stickerSet.access_hash;
                        } else {
                            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            tL_inputStickerSetShortName.short_name = stickerSet.short_name;
                        }
                        TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                        TLRPC.FileLocation fileLocation = w10.location;
                        h = org.telegram.messenger.ac.h(fileLocation, w10.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, w10.type);
                    }
                    this.d.k(h, "24_24", null, null, this.w);
                    if (this.w.d != null) {
                        org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).m0(this.w.d, false);
                        this.w.d = null;
                    }
                }
            } else {
                k9Var.b();
                TLRPC.Document document = this.s;
                zu zuVar = this.O;
                if (document != null) {
                    this.x = g5.l(org.telegram.messenger.h10.t0, zuVar.T, document);
                } else {
                    this.x = g5.m(org.telegram.messenger.h10.t0, this.r.longValue(), null, zuVar.T);
                }
                this.x.a(k9Var);
                k9Var.setImageDrawable(this.x);
            }
        } else {
            g5 g5Var2 = this.x;
            if (g5Var2 != null) {
                g5Var2.n(k9Var);
                this.x = null;
            }
            k9Var.b();
        }
        if (this.y && this.E) {
            k9Var.onAttachedToWindow();
        } else {
            k9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        zu zuVar = this.O;
        int k10 = zuVar.k();
        org.telegram.ui.ActionBar.e6 e6Var = zuVar.w;
        org.telegram.ui.ActionBar.k6.H1(background, k10, false);
        if (zuVar.Q) {
            setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, e6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, this.H) * 255.0f)));
        } else {
            setColor(i0.a.f(this.H, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Df, e6Var)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ch0 ch0Var = this.e;
        if (ch0Var == null || !this.E) {
            return;
        }
        ch0Var.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.E) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    public final void e(boolean z10) {
        if (Math.abs(this.G - (z10 ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        float f10 = z10 ? 1.0f : 0.0f;
        this.G = f10;
        vg.y0 y0Var = this.f;
        y0Var.setScaleX(f10);
        y0Var.setScaleY(this.G);
        y0Var.setAlpha(this.G);
        y0Var.setVisibility(z10 ? 0 : 8);
    }

    public final void f() {
        vg.y0 y0Var = this.f;
        if (y0Var == null || y0Var.h || !(getDrawable() instanceof g5)) {
            return;
        }
        if (((g5) getDrawable()).c()) {
            y0Var.setImageReceiver(null);
            y0Var.setColor(this.O.R);
            return;
        }
        ei.c3 c3Var = ((g5) getDrawable()).k;
        if (c3Var != null) {
            y0Var.setImageReceiver(c3Var);
            y0Var.invalidate();
        }
    }

    public final void g(boolean z10, boolean z11) {
        k9 k9Var = this.d;
        if ((k9Var == null || k9Var.getImageReceiver().T != null || this.O.Q) && this.I != z10) {
            this.I = z10;
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.J = null;
            }
            if (!z10) {
                b();
            }
            if (!z11) {
                this.H = z10 ? 1.0f : 0.0f;
                d();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, z10 ? 1.0f : 0.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new c6(this, 19));
            this.J.addListener(new s9(7, this, z10));
            this.J.setDuration(dh.d0.d() ? 0L : 350L);
            this.J.setInterpolator(xq.h);
            this.J.start();
        }
    }

    public Drawable getDrawable() {
        k9 k9Var = this.d;
        if (k9Var != null) {
            return k9Var.getImageReceiver().T;
        }
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (dh.d0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        c();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.E) {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        TLRPC.Document e10;
        TLRPC.StickerSet stickerSet;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null) {
            sw swVar = this.w;
            if (swVar == null || (stickerSet = swVar.b) == null || (str = stickerSet.title) == null) {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = org.telegram.messenger.zi.V(document, null, null);
                } else {
                    Long l10 = this.r;
                    if (l10 != null && (e10 = g5.e(org.telegram.messenger.h10.t0, l10.longValue())) != null) {
                        contentDescription = org.telegram.messenger.zi.V(e10, null, null);
                    }
                }
            } else {
                contentDescription = str;
            }
        }
        Boolean bool = this.F;
        if (bool != null && !bool.booleanValue()) {
            String M0 = org.telegram.messenger.bd.M0(2131750832, null);
            if (contentDescription == null) {
                contentDescription = M0;
            } else {
                contentDescription = ((Object) contentDescription) + ", " + M0;
            }
        }
        if (contentDescription != null) {
            accessibilityNodeInfo.setContentDescription(contentDescription);
        }
        accessibilityNodeInfo.setSelected(this.I);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        k9 k9Var = this.d;
        if (k9Var != null) {
            int i13 = (i11 - i3) / 2;
            int i14 = (i12 - i10) / 2;
            k9Var.layout(i13 - (k9Var.getMeasuredWidth() / 2), i14 - (k9Var.getMeasuredHeight() / 2), (k9Var.getMeasuredWidth() / 2) + i13, (k9Var.getMeasuredHeight() / 2) + i14);
        }
        vg.y0 y0Var = this.f;
        if (y0Var != null) {
            int i15 = i11 - i3;
            int i16 = i12 - i10;
            y0Var.layout(i15 - y0Var.getMeasuredWidth(), i16 - y0Var.getMeasuredHeight(), i15, i16);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        k9 k9Var = this.d;
        if (k9Var != null) {
            k9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
        }
        vg.y0 y0Var = this.f;
        if (y0Var != null) {
            y0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        ei.c3 c3Var;
        g5 g5Var = this.x;
        if (g5Var != null && (c3Var = g5Var.k) != null) {
            if (c3Var.m() != null) {
                c3Var.m().y(0L, true, false);
            }
            c3Var.P0(false);
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
        g5 g5Var = this.x;
        k9 k9Var = this.d;
        if (g5Var != null) {
            g5Var.n(k9Var);
            this.x = null;
        }
        k9Var.b();
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
        g5 g5Var = this.x;
        k9 k9Var = this.d;
        if (g5Var != null) {
            g5Var.n(k9Var);
            this.x = null;
        }
        k9Var.b();
        this.s = null;
        this.r = j10 != 0 ? Long.valueOf(j10) : null;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(sw swVar) {
        if (swVar != null && swVar.b == null) {
            swVar = null;
        }
        sw swVar2 = this.w;
        if (swVar2 == null || swVar == null || swVar2.b.id != swVar.b.id) {
            g5 g5Var = this.x;
            k9 k9Var = this.d;
            if (g5Var != null && this.s == null && this.r == null) {
                g5Var.n(k9Var);
                this.x = null;
            }
            k9Var.b();
            this.w = swVar;
            c();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        zu zuVar = this.O;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, zuVar.w);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Df, zuVar.w);
            int k10 = zuVar.k();
            if (w02 == this.K && w03 == this.L && k10 == this.M && this.N == this.H) {
                return;
            }
            this.K = w02;
            this.L = w03;
            this.M = k10;
            this.N = this.H;
            d();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i3, int i10, int i11, int i12) {
        if (dh.d0.b(this)) {
            return;
        }
        super.invalidate(i3, i10, i11, i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu(zu zuVar, Context context, int i3, boolean z10) {
        super(context);
        this.O = zuVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = false;
        this.n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.k6.a0(zuVar.k(), 8, 8));
        }
        k9 k9Var = new k9(context);
        this.d = k9Var;
        k9Var.x = false;
        k9Var.setImageDrawable(context.getResources().getDrawable(i3).mutate());
        d();
        addView(k9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu(zu zuVar, Context context, TLRPC.Document document) {
        super(context);
        this.O = zuVar;
        setFocusable(true);
        this.N = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        su suVar = new su(this, context);
        this.d = suVar;
        suVar.x = false;
        this.s = document;
        this.c = true;
        suVar.setColorFilter(zuVar.getEmojiColorFilter());
        addView(suVar);
        int i3 = vg.y0.M;
        tu tuVar = new tu(1, context, zuVar.w);
        this.f = tuVar;
        tuVar.setAlpha(0.0f);
        tuVar.setScaleX(0.0f);
        tuVar.setScaleY(0.0f);
        f();
        addView(tuVar);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu(zu zuVar, Context context, long j10) {
        super(context);
        this.O = zuVar;
        setFocusable(true);
        this.N = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        ei.d4 d4Var = new ei.d4(8, context, this);
        this.d = d4Var;
        d4Var.x = false;
        this.r = Long.valueOf(j10);
        this.c = true;
        d4Var.setColorFilter(zuVar.getEmojiColorFilter());
        addView(d4Var);
        int i3 = vg.y0.M;
        uu uuVar = new uu(1, context, zuVar.w);
        this.f = uuVar;
        uuVar.setAlpha(0.0f);
        uuVar.setScaleX(0.0f);
        uuVar.setScaleY(0.0f);
        f();
        addView(uuVar);
        d();
    }
}
