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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class cv extends ViewGroup implements org.telegram.ui.ActionBar.z5 {
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
    public final /* synthetic */ gv O;
    public Long a;
    public boolean b;
    public final boolean c;
    public final i9 d;
    public final ch0 e;
    public final ug.a1 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public zw w;
    public g5 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(gv gvVar, Context context, int i7) {
        super(context);
        this.O = gvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = true;
        this.n = false;
        setBackground(org.telegram.ui.ActionBar.j6.O(gvVar.k(), 0, 0));
        ch0 ch0Var = new ch0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), false, null);
        this.e = ch0Var;
        ch0Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
        ch0Var.R(this);
        ch0Var.J(true);
        ch0Var.start();
        d();
    }

    private void setColor(int i7) {
        gv gvVar = this.O;
        int i10 = gvVar.U;
        if (i10 == 5 || i10 == 7) {
            i7 = gvVar.R;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        i9 i9Var = this.d;
        if (i9Var != null && !this.c) {
            i9Var.setColorFilter(porterDuffColorFilter);
            i9Var.invalidate();
        }
        ch0 ch0Var = this.e;
        if (ch0Var != null) {
            ch0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        ug.a1 a1Var = this.f;
        if (a1Var == null) {
            return;
        }
        this.F = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            a1Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable mutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        a1Var.setImageDrawable(mutate);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Nl));
    }

    public final void b() {
        fi.u2 u2Var;
        g5 g5Var = this.x;
        if (g5Var == null || (u2Var = g5Var.k) == null) {
            return;
        }
        if (u2Var.B() != null) {
            u2Var.B().M(0);
            u2Var.B().stop();
        } else if (u2Var.m() != null) {
            u2Var.m().stop();
        }
    }

    public final void c() {
        TLRPC.PhotoSize w10;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        org.telegram.messenger.gc h;
        i9 i9Var = this.d;
        if (i9Var == null) {
            return;
        }
        if (this.y && this.E) {
            g5 g5Var = this.x;
            if (g5Var != null || (this.s == null && this.r == null)) {
                if (g5Var != null) {
                    g5Var.n(i9Var);
                    this.x = null;
                }
                i9Var.b();
                zw zwVar = this.w;
                if (zwVar != null) {
                    TLRPC.StickerSet stickerSet = zwVar.b;
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
                        h = org.telegram.messenger.gc.h(fileLocation, w10.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, w10.type);
                    }
                    this.d.k(h, "24_24", null, null, this.w);
                    if (this.w.d != null) {
                        org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).m0(this.w.d, false);
                        this.w.d = null;
                    }
                }
            } else {
                i9Var.b();
                TLRPC.Document document = this.s;
                gv gvVar = this.O;
                if (document != null) {
                    this.x = g5.l(org.telegram.messenger.m10.t0, gvVar.T, document);
                } else {
                    this.x = g5.m(org.telegram.messenger.m10.t0, this.r.longValue(), null, gvVar.T);
                }
                this.x.a(i9Var);
                i9Var.setImageDrawable(this.x);
            }
        } else {
            g5 g5Var2 = this.x;
            if (g5Var2 != null) {
                g5Var2.n(i9Var);
                this.x = null;
            }
            i9Var.b();
        }
        if (this.y && this.E) {
            i9Var.onAttachedToWindow();
        } else {
            i9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        gv gvVar = this.O;
        int k10 = gvVar.k();
        org.telegram.ui.ActionBar.e6 e6Var = gvVar.w;
        org.telegram.ui.ActionBar.j6.H1(background, k10, false);
        if (gvVar.Q) {
            setColor(i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nl, e6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, this.H) * 255.0f)));
        } else {
            setColor(i0.a.f(this.H, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ef, e6Var), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Gf, e6Var)));
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.E) {
            return super.drawChild(canvas, view, j3);
        }
        return true;
    }

    public final void e(boolean z10) {
        if (Math.abs(this.G - (z10 ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        float f10 = z10 ? 1.0f : 0.0f;
        this.G = f10;
        ug.a1 a1Var = this.f;
        a1Var.setScaleX(f10);
        a1Var.setScaleY(this.G);
        a1Var.setAlpha(this.G);
        a1Var.setVisibility(z10 ? 0 : 8);
    }

    public final void f() {
        ug.a1 a1Var = this.f;
        if (a1Var == null || a1Var.h || !(getDrawable() instanceof g5)) {
            return;
        }
        if (((g5) getDrawable()).c()) {
            a1Var.setImageReceiver(null);
            a1Var.setColor(this.O.R);
            return;
        }
        fi.u2 u2Var = ((g5) getDrawable()).k;
        if (u2Var != null) {
            a1Var.setImageReceiver(u2Var);
            a1Var.invalidate();
        }
    }

    public final void g(boolean z10, boolean z11) {
        i9 i9Var = this.d;
        if ((i9Var == null || i9Var.getImageReceiver().T != null || this.O.Q) && this.I != z10) {
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
            this.J.addListener(new org.telegram.ui.nn(8, this, z10));
            this.J.setDuration(ch.f0.d() ? 0L : 350L);
            this.J.setInterpolator(er.h);
            this.J.start();
        }
    }

    public Drawable getDrawable() {
        i9 i9Var = this.d;
        if (i9Var != null) {
            return i9Var.getImageReceiver().T;
        }
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ch.f0.b(this)) {
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
            zw zwVar = this.w;
            if (zwVar == null || (stickerSet = zwVar.b) == null || (str = stickerSet.title) == null) {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = org.telegram.messenger.gj.V(document, null, null);
                } else {
                    Long l10 = this.r;
                    if (l10 != null && (e10 = g5.e(org.telegram.messenger.m10.t0, l10.longValue())) != null) {
                        contentDescription = org.telegram.messenger.gj.V(e10, null, null);
                    }
                }
            } else {
                contentDescription = str;
            }
        }
        Boolean bool = this.F;
        if (bool != null && !bool.booleanValue()) {
            String M0 = org.telegram.messenger.hd.M0(2131750831, null);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        i9 i9Var = this.d;
        if (i9Var != null) {
            int i13 = (i11 - i7) / 2;
            int i14 = (i12 - i10) / 2;
            i9Var.layout(i13 - (i9Var.getMeasuredWidth() / 2), i14 - (i9Var.getMeasuredHeight() / 2), (i9Var.getMeasuredWidth() / 2) + i13, (i9Var.getMeasuredHeight() / 2) + i14);
        }
        ug.a1 a1Var = this.f;
        if (a1Var != null) {
            int i15 = i11 - i7;
            int i16 = i12 - i10;
            a1Var.layout(i15 - a1Var.getMeasuredWidth(), i16 - a1Var.getMeasuredHeight(), i15, i16);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        i9 i9Var = this.d;
        if (i9Var != null) {
            i9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
        }
        ug.a1 a1Var = this.f;
        if (a1Var != null) {
            a1Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        fi.u2 u2Var;
        g5 g5Var = this.x;
        if (g5Var != null && (u2Var = g5Var.k) != null) {
            if (u2Var.m() != null) {
                u2Var.m().y(0L, true, false);
            }
            u2Var.P0(false);
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
        i9 i9Var = this.d;
        if (g5Var != null) {
            g5Var.n(i9Var);
            this.x = null;
        }
        i9Var.b();
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
        g5 g5Var = this.x;
        i9 i9Var = this.d;
        if (g5Var != null) {
            g5Var.n(i9Var);
            this.x = null;
        }
        i9Var.b();
        this.s = null;
        this.r = j3 != 0 ? Long.valueOf(j3) : null;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(zw zwVar) {
        if (zwVar != null && zwVar.b == null) {
            zwVar = null;
        }
        zw zwVar2 = this.w;
        if (zwVar2 == null || zwVar == null || zwVar2.b.id != zwVar.b.id) {
            g5 g5Var = this.x;
            i9 i9Var = this.d;
            if (g5Var != null && this.s == null && this.r == null) {
                g5Var.n(i9Var);
                this.x = null;
            }
            i9Var.b();
            this.w = zwVar;
            c();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        gv gvVar = this.O;
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ef, gvVar.w);
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Gf, gvVar.w);
            int k10 = gvVar.k();
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
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.f0.b(this)) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(gv gvVar, Context context, int i7, boolean z10) {
        super(context);
        this.O = gvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = false;
        this.n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.j6.a0(gvVar.k(), 8, 8));
        }
        i9 i9Var = new i9(context);
        this.d = i9Var;
        i9Var.x = false;
        i9Var.setImageDrawable(context.getResources().getDrawable(i7).mutate());
        d();
        addView(i9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(gv gvVar, Context context, TLRPC.Document document) {
        super(context);
        this.O = gvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        zu zuVar = new zu(this, context);
        this.d = zuVar;
        zuVar.x = false;
        this.s = document;
        this.c = true;
        zuVar.setColorFilter(gvVar.getEmojiColorFilter());
        addView(zuVar);
        int i7 = ug.a1.M;
        av avVar = new av(1, context, gvVar.w);
        this.f = avVar;
        avVar.setAlpha(0.0f);
        avVar.setScaleX(0.0f);
        avVar.setScaleY(0.0f);
        f();
        addView(avVar);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(gv gvVar, Context context, long j3) {
        super(context);
        this.O = gvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        fi.v3 v3Var = new fi.v3(8, context, this);
        this.d = v3Var;
        v3Var.x = false;
        this.r = Long.valueOf(j3);
        this.c = true;
        v3Var.setColorFilter(gvVar.getEmojiColorFilter());
        addView(v3Var);
        int i7 = ug.a1.M;
        bv bvVar = new bv(1, context, gvVar.w);
        this.f = bvVar;
        bvVar.setAlpha(0.0f);
        bvVar.setScaleX(0.0f);
        bvVar.setScaleY(0.0f);
        f();
        addView(bvVar);
        d();
    }
}
