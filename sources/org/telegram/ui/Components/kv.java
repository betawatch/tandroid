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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class kv extends ViewGroup implements org.telegram.ui.ActionBar.b6 {
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
    public final /* synthetic */ ov O;
    public Long a;
    public boolean b;
    public final boolean c;
    public final q9 d;
    public final oh0 e;
    public final ug.b1 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public hx w;
    public p5 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(ov ovVar, Context context, int i7) {
        super(context);
        this.O = ovVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = true;
        this.n = false;
        setBackground(org.telegram.ui.ActionBar.m6.O(ovVar.k(), 0, 0));
        oh0 oh0Var = new oh0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), false, null);
        this.e = oh0Var;
        oh0Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
        oh0Var.R(this);
        oh0Var.J(true);
        oh0Var.start();
        d();
    }

    private void setColor(int i7) {
        ov ovVar = this.O;
        int i10 = ovVar.U;
        if (i10 == 5 || i10 == 7) {
            i7 = ovVar.R;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        q9 q9Var = this.d;
        if (q9Var != null && !this.c) {
            q9Var.setColorFilter(porterDuffColorFilter);
            q9Var.invalidate();
        }
        oh0 oh0Var = this.e;
        if (oh0Var != null) {
            oh0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        ug.b1 b1Var = this.f;
        if (b1Var == null) {
            return;
        }
        this.F = bool;
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Nl));
    }

    public final void b() {
        fi.s2 s2Var;
        p5 p5Var = this.x;
        if (p5Var == null || (s2Var = p5Var.k) == null) {
            return;
        }
        if (s2Var.B() != null) {
            s2Var.B().M(0);
            s2Var.B().stop();
        } else if (s2Var.m() != null) {
            s2Var.m().stop();
        }
    }

    public final void c() {
        TLRPC.PhotoSize w10;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        org.telegram.messenger.gc h;
        q9 q9Var = this.d;
        if (q9Var == null) {
            return;
        }
        if (this.y && this.E) {
            p5 p5Var = this.x;
            if (p5Var != null || (this.s == null && this.r == null)) {
                if (p5Var != null) {
                    p5Var.n(q9Var);
                    this.x = null;
                }
                q9Var.b();
                hx hxVar = this.w;
                if (hxVar != null) {
                    TLRPC.StickerSet stickerSet = hxVar.b;
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
                        org.telegram.messenger.si.d0(org.telegram.messenger.k10.t0).o0(this.w.d, false);
                        this.w.d = null;
                    }
                }
            } else {
                q9Var.b();
                TLRPC.Document document = this.s;
                ov ovVar = this.O;
                if (document != null) {
                    this.x = p5.l(org.telegram.messenger.k10.t0, ovVar.T, document);
                } else {
                    this.x = p5.m(org.telegram.messenger.k10.t0, this.r.longValue(), null, ovVar.T);
                }
                this.x.a(q9Var);
                q9Var.setImageDrawable(this.x);
            }
        } else {
            p5 p5Var2 = this.x;
            if (p5Var2 != null) {
                p5Var2.n(q9Var);
                this.x = null;
            }
            q9Var.b();
        }
        if (this.y && this.E) {
            q9Var.onAttachedToWindow();
        } else {
            q9Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        ov ovVar = this.O;
        int k10 = ovVar.k();
        org.telegram.ui.ActionBar.h6 h6Var = ovVar.w;
        org.telegram.ui.ActionBar.m6.H1(background, k10, false);
        if (ovVar.Q) {
            setColor(i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nl, h6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, this.H) * 255.0f)));
        } else {
            setColor(i0.a.f(this.H, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ef, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gf, h6Var)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        oh0 oh0Var = this.e;
        if (oh0Var == null || !this.E) {
            return;
        }
        oh0Var.draw(canvas);
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
        ug.b1 b1Var = this.f;
        b1Var.setScaleX(f10);
        b1Var.setScaleY(this.G);
        b1Var.setAlpha(this.G);
        b1Var.setVisibility(z10 ? 0 : 8);
    }

    public final void f() {
        ug.b1 b1Var = this.f;
        if (b1Var == null || b1Var.h || !(getDrawable() instanceof p5)) {
            return;
        }
        if (((p5) getDrawable()).c()) {
            b1Var.setImageReceiver(null);
            b1Var.setColor(this.O.R);
            return;
        }
        fi.s2 s2Var = ((p5) getDrawable()).k;
        if (s2Var != null) {
            b1Var.setImageReceiver(s2Var);
            b1Var.invalidate();
        }
    }

    public final void g(boolean z10, boolean z11) {
        q9 q9Var = this.d;
        if ((q9Var == null || q9Var.getImageReceiver().T != null || this.O.Q) && this.I != z10) {
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
            ofFloat.addUpdateListener(new x(this, 20));
            this.J.addListener(new org.telegram.ui.on(8, this, z10));
            this.J.setDuration(ch.f0.d() ? 0L : 350L);
            this.J.setInterpolator(nr.h);
            this.J.start();
        }
    }

    public Drawable getDrawable() {
        q9 q9Var = this.d;
        if (q9Var != null) {
            return q9Var.getImageReceiver().T;
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
            hx hxVar = this.w;
            if (hxVar == null || (stickerSet = hxVar.b) == null || (str = stickerSet.title) == null) {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = org.telegram.messenger.gj.V(document, null, null);
                } else {
                    Long l10 = this.r;
                    if (l10 != null && (e10 = p5.e(org.telegram.messenger.k10.t0, l10.longValue())) != null) {
                        contentDescription = org.telegram.messenger.gj.V(e10, null, null);
                    }
                }
            } else {
                contentDescription = str;
            }
        }
        Boolean bool = this.F;
        if (bool != null && !bool.booleanValue()) {
            String N0 = org.telegram.messenger.hd.N0(2131750819, null);
            if (contentDescription == null) {
                contentDescription = N0;
            } else {
                contentDescription = ((Object) contentDescription) + ", " + N0;
            }
        }
        if (contentDescription != null) {
            accessibilityNodeInfo.setContentDescription(contentDescription);
        }
        accessibilityNodeInfo.setSelected(this.I);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        q9 q9Var = this.d;
        if (q9Var != null) {
            int i13 = (i11 - i7) / 2;
            int i14 = (i12 - i10) / 2;
            q9Var.layout(i13 - (q9Var.getMeasuredWidth() / 2), i14 - (q9Var.getMeasuredHeight() / 2), (q9Var.getMeasuredWidth() / 2) + i13, (q9Var.getMeasuredHeight() / 2) + i14);
        }
        ug.b1 b1Var = this.f;
        if (b1Var != null) {
            int i15 = i11 - i7;
            int i16 = i12 - i10;
            b1Var.layout(i15 - b1Var.getMeasuredWidth(), i16 - b1Var.getMeasuredHeight(), i15, i16);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        q9 q9Var = this.d;
        if (q9Var != null) {
            q9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
        }
        ug.b1 b1Var = this.f;
        if (b1Var != null) {
            b1Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        fi.s2 s2Var;
        p5 p5Var = this.x;
        if (p5Var != null && (s2Var = p5Var.k) != null) {
            if (s2Var.m() != null) {
                s2Var.m().y(0L, true, false);
            }
            s2Var.P0(false);
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
        p5 p5Var = this.x;
        q9 q9Var = this.d;
        if (p5Var != null) {
            p5Var.n(q9Var);
            this.x = null;
        }
        q9Var.b();
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
        p5 p5Var = this.x;
        q9 q9Var = this.d;
        if (p5Var != null) {
            p5Var.n(q9Var);
            this.x = null;
        }
        q9Var.b();
        this.s = null;
        this.r = j3 != 0 ? Long.valueOf(j3) : null;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(hx hxVar) {
        if (hxVar != null && hxVar.b == null) {
            hxVar = null;
        }
        hx hxVar2 = this.w;
        if (hxVar2 == null || hxVar == null || hxVar2.b.id != hxVar.b.id) {
            p5 p5Var = this.x;
            q9 q9Var = this.d;
            if (p5Var != null && this.s == null && this.r == null) {
                p5Var.n(q9Var);
                this.x = null;
            }
            q9Var.b();
            this.w = hxVar;
            c();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        ov ovVar = this.O;
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ef, ovVar.w);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gf, ovVar.w);
            int k10 = ovVar.k();
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
    public kv(ov ovVar, Context context, int i7, boolean z10) {
        super(context);
        this.O = ovVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = false;
        this.n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.m6.a0(ovVar.k(), 8, 8));
        }
        q9 q9Var = new q9(context);
        this.d = q9Var;
        q9Var.x = false;
        q9Var.setImageDrawable(context.getResources().getDrawable(i7).mutate());
        d();
        addView(q9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(ov ovVar, Context context, TLRPC.Document document) {
        super(context);
        this.O = ovVar;
        setFocusable(true);
        this.N = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        hv hvVar = new hv(this, context);
        this.d = hvVar;
        hvVar.x = false;
        this.s = document;
        this.c = true;
        hvVar.setColorFilter(ovVar.getEmojiColorFilter());
        addView(hvVar);
        int i7 = ug.b1.M;
        iv ivVar = new iv(1, context, ovVar.w);
        this.f = ivVar;
        ivVar.setAlpha(0.0f);
        ivVar.setScaleX(0.0f);
        ivVar.setScaleY(0.0f);
        f();
        addView(ivVar);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(ov ovVar, Context context, long j3) {
        super(context);
        this.O = ovVar;
        setFocusable(true);
        this.N = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        fi.t3 t3Var = new fi.t3(8, context, this);
        this.d = t3Var;
        t3Var.x = false;
        this.r = Long.valueOf(j3);
        this.c = true;
        t3Var.setColorFilter(ovVar.getEmojiColorFilter());
        addView(t3Var);
        int i7 = ug.b1.M;
        jv jvVar = new jv(1, context, ovVar.w);
        this.f = jvVar;
        jvVar.setAlpha(0.0f);
        jvVar.setScaleX(0.0f);
        jvVar.setScaleY(0.0f);
        f();
        addView(jvVar);
        d();
    }
}
