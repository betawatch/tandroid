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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class xu extends ViewGroup implements org.telegram.ui.ActionBar.b6 {
    public boolean D;
    public Boolean E;
    public float F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public int L;
    public float M;
    public final /* synthetic */ bv N;
    public Long a;
    public boolean b;
    public final boolean c;
    public final l9 d;
    public final ah0 e;
    public final ug.z0 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public uw w;
    public i5 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(bv bvVar, Context context, int i7) {
        super(context);
        this.N = bvVar;
        setFocusable(true);
        this.M = -1.0f;
        this.h = true;
        this.n = false;
        setBackground(org.telegram.ui.ActionBar.l6.O(bvVar.k(), 0, 0));
        ah0 ah0Var = new ah0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), false, null);
        this.e = ah0Var;
        ah0Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
        ah0Var.R(this);
        ah0Var.J(true);
        ah0Var.start();
        d();
    }

    private void setColor(int i7) {
        bv bvVar = this.N;
        int i10 = bvVar.T;
        if (i10 == 5 || i10 == 7) {
            i7 = bvVar.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        l9 l9Var = this.d;
        if (l9Var != null && !this.c) {
            l9Var.setColorFilter(porterDuffColorFilter);
            l9Var.invalidate();
        }
        ah0 ah0Var = this.e;
        if (ah0Var != null) {
            ah0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        ug.z0 z0Var = this.f;
        if (z0Var == null) {
            return;
        }
        this.E = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            z0Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable mutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        z0Var.setImageDrawable(mutate);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Df));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Kl));
    }

    public final void b() {
        di.z2 z2Var;
        i5 i5Var = this.x;
        if (i5Var == null || (z2Var = i5Var.k) == null) {
            return;
        }
        if (z2Var.B() != null) {
            z2Var.B().M(0);
            z2Var.B().stop();
        } else if (z2Var.m() != null) {
            z2Var.m().stop();
        }
    }

    public final void c() {
        TLRPC.PhotoSize w10;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        org.telegram.messenger.hc h;
        l9 l9Var = this.d;
        if (l9Var == null) {
            return;
        }
        if (this.y && this.D) {
            i5 i5Var = this.x;
            if (i5Var != null || (this.s == null && this.r == null)) {
                if (i5Var != null) {
                    i5Var.n(l9Var);
                    this.x = null;
                }
                l9Var.b();
                uw uwVar = this.w;
                if (uwVar != null) {
                    TLRPC.StickerSet stickerSet = uwVar.b;
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
                        h = org.telegram.messenger.hc.h(fileLocation, w10.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, w10.type);
                    }
                    this.d.k(h, "24_24", null, null, this.w);
                    if (this.w.d != null) {
                        org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).m0(this.w.d, false);
                        this.w.d = null;
                    }
                }
            } else {
                l9Var.b();
                TLRPC.Document document = this.s;
                bv bvVar = this.N;
                if (document != null) {
                    this.x = i5.l(org.telegram.messenger.p10.s0, bvVar.S, document);
                } else {
                    this.x = i5.m(org.telegram.messenger.p10.s0, this.r.longValue(), null, bvVar.S);
                }
                this.x.a(l9Var);
                l9Var.setImageDrawable(this.x);
            }
        } else {
            i5 i5Var2 = this.x;
            if (i5Var2 != null) {
                i5Var2.n(l9Var);
                this.x = null;
            }
            l9Var.b();
        }
        if (this.y && this.D) {
            l9Var.onAttachedToWindow();
        } else {
            l9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        bv bvVar = this.N;
        int k10 = bvVar.k();
        org.telegram.ui.ActionBar.g6 g6Var = bvVar.w;
        org.telegram.ui.ActionBar.l6.H1(background, k10, false);
        if (bvVar.P) {
            setColor(i0.a.o(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Kl, g6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, this.G) * 255.0f)));
        } else {
            setColor(i0.a.f(this.G, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Bf, g6Var), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Df, g6Var)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ah0 ah0Var = this.e;
        if (ah0Var == null || !this.D) {
            return;
        }
        ah0Var.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.D) {
            return super.drawChild(canvas, view, j3);
        }
        return true;
    }

    public final void e(boolean z9) {
        if (Math.abs(this.F - (z9 ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        float f10 = z9 ? 1.0f : 0.0f;
        this.F = f10;
        ug.z0 z0Var = this.f;
        z0Var.setScaleX(f10);
        z0Var.setScaleY(this.F);
        z0Var.setAlpha(this.F);
        z0Var.setVisibility(z9 ? 0 : 8);
    }

    public final void f() {
        ug.z0 z0Var = this.f;
        if (z0Var == null || z0Var.h || !(getDrawable() instanceof i5)) {
            return;
        }
        if (((i5) getDrawable()).c()) {
            z0Var.setImageReceiver(null);
            z0Var.setColor(this.N.Q);
            return;
        }
        di.z2 z2Var = ((i5) getDrawable()).k;
        if (z2Var != null) {
            z0Var.setImageReceiver(z2Var);
            z0Var.invalidate();
        }
    }

    public final void g(boolean z9, boolean z10) {
        l9 l9Var = this.d;
        if ((l9Var == null || l9Var.getImageReceiver().S != null || this.N.P) && this.H != z9) {
            this.H = z9;
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.I = null;
            }
            if (!z9) {
                b();
            }
            if (!z10) {
                this.G = z9 ? 1.0f : 0.0f;
                d();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, z9 ? 1.0f : 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 19));
            this.I.addListener(new t9(7, this, z9));
            this.I.setDuration(ch.e0.d() ? 0L : 350L);
            this.I.setInterpolator(xq.h);
            this.I.start();
        }
    }

    public Drawable getDrawable() {
        l9 l9Var = this.d;
        if (l9Var != null) {
            return l9Var.getImageReceiver().S;
        }
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ch.e0.b(this)) {
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
        if (this.D) {
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
            uw uwVar = this.w;
            if (uwVar == null || (stickerSet = uwVar.b) == null || (str = stickerSet.title) == null) {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = org.telegram.messenger.ij.V(document, null, null);
                } else {
                    Long l10 = this.r;
                    if (l10 != null && (e10 = i5.e(org.telegram.messenger.p10.s0, l10.longValue())) != null) {
                        contentDescription = org.telegram.messenger.ij.V(e10, null, null);
                    }
                }
            } else {
                contentDescription = str;
            }
        }
        Boolean bool = this.E;
        if (bool != null && !bool.booleanValue()) {
            String M0 = org.telegram.messenger.id.M0(2131750831, null);
            if (contentDescription == null) {
                contentDescription = M0;
            } else {
                contentDescription = ((Object) contentDescription) + ", " + M0;
            }
        }
        if (contentDescription != null) {
            accessibilityNodeInfo.setContentDescription(contentDescription);
        }
        accessibilityNodeInfo.setSelected(this.H);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        l9 l9Var = this.d;
        if (l9Var != null) {
            int i13 = (i11 - i7) / 2;
            int i14 = (i12 - i10) / 2;
            l9Var.layout(i13 - (l9Var.getMeasuredWidth() / 2), i14 - (l9Var.getMeasuredHeight() / 2), (l9Var.getMeasuredWidth() / 2) + i13, (l9Var.getMeasuredHeight() / 2) + i14);
        }
        ug.z0 z0Var = this.f;
        if (z0Var != null) {
            int i15 = i11 - i7;
            int i16 = i12 - i10;
            z0Var.layout(i15 - z0Var.getMeasuredWidth(), i16 - z0Var.getMeasuredHeight(), i15, i16);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        l9 l9Var = this.d;
        if (l9Var != null) {
            l9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
        }
        ug.z0 z0Var = this.f;
        if (z0Var != null) {
            z0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        di.z2 z2Var;
        i5 i5Var = this.x;
        if (i5Var != null && (z2Var = i5Var.k) != null) {
            if (z2Var.m() != null) {
                z2Var.m().y(0L, true, false);
            }
            z2Var.P0(false);
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
        i5 i5Var = this.x;
        l9 l9Var = this.d;
        if (i5Var != null) {
            i5Var.n(l9Var);
            this.x = null;
        }
        l9Var.b();
        this.s = document;
        this.r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j3) {
        TLRPC.Document document = this.s;
        if ((document != null || this.r != null) && j3 != 0) {
            Long l10 = this.r;
            if ((l10 != null ? l10.longValue() : document.id) == j3) {
                return;
            }
        }
        i5 i5Var = this.x;
        l9 l9Var = this.d;
        if (i5Var != null) {
            i5Var.n(l9Var);
            this.x = null;
        }
        l9Var.b();
        this.s = null;
        this.r = j3 != 0 ? Long.valueOf(j3) : null;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(uw uwVar) {
        if (uwVar != null && uwVar.b == null) {
            uwVar = null;
        }
        uw uwVar2 = this.w;
        if (uwVar2 == null || uwVar == null || uwVar2.b.id != uwVar.b.id) {
            i5 i5Var = this.x;
            l9 l9Var = this.d;
            if (i5Var != null && this.s == null && this.r == null) {
                i5Var.n(l9Var);
                this.x = null;
            }
            l9Var.b();
            this.w = uwVar;
            c();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        bv bvVar = this.N;
        try {
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Bf, bvVar.w);
            int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Df, bvVar.w);
            int k10 = bvVar.k();
            if (w02 == this.J && w03 == this.K && k10 == this.L && this.M == this.G) {
                return;
            }
            this.J = w02;
            this.K = w03;
            this.L = k10;
            this.M = this.G;
            d();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.e0.b(this)) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(bv bvVar, Context context, int i7, boolean z9) {
        super(context);
        this.N = bvVar;
        setFocusable(true);
        this.M = -1.0f;
        this.h = false;
        this.n = z9;
        if (z9) {
            setBackground(org.telegram.ui.ActionBar.l6.a0(bvVar.k(), 8, 8));
        }
        l9 l9Var = new l9(context);
        this.d = l9Var;
        l9Var.x = false;
        l9Var.setImageDrawable(context.getResources().getDrawable(i7).mutate());
        d();
        addView(l9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(bv bvVar, Context context, TLRPC.Document document) {
        super(context);
        this.N = bvVar;
        setFocusable(true);
        this.M = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        uu uuVar = new uu(this, context);
        this.d = uuVar;
        uuVar.x = false;
        this.s = document;
        this.c = true;
        uuVar.setColorFilter(bvVar.getEmojiColorFilter());
        addView(uuVar);
        int i7 = ug.z0.L;
        vu vuVar = new vu(1, context, bvVar.w);
        this.f = vuVar;
        vuVar.setAlpha(0.0f);
        vuVar.setScaleX(0.0f);
        vuVar.setScaleY(0.0f);
        f();
        addView(vuVar);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(bv bvVar, Context context, long j3) {
        super(context);
        this.N = bvVar;
        setFocusable(true);
        this.M = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        di.d4 d4Var = new di.d4(8, context, this);
        this.d = d4Var;
        d4Var.x = false;
        this.r = Long.valueOf(j3);
        this.c = true;
        d4Var.setColorFilter(bvVar.getEmojiColorFilter());
        addView(d4Var);
        int i7 = ug.z0.L;
        wu wuVar = new wu(1, context, bvVar.w);
        this.f = wuVar;
        wuVar.setAlpha(0.0f);
        wuVar.setScaleX(0.0f);
        wuVar.setScaleY(0.0f);
        f();
        addView(wuVar);
        d();
    }
}
