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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class hv extends ViewGroup implements org.telegram.ui.ActionBar.c6 {
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
    public final /* synthetic */ lv O;
    public Long a;
    public boolean b;
    public final boolean c;
    public final q9 d;
    public final mh0 e;
    public final ug.c1 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public fx w;
    public o5 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(lv lvVar, Context context, int i7) {
        super(context);
        this.O = lvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = true;
        this.n = false;
        setBackground(org.telegram.ui.ActionBar.n6.O(lvVar.k(), 0, 0));
        mh0 mh0Var = new mh0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), false, null);
        this.e = mh0Var;
        mh0Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
        mh0Var.R(this);
        mh0Var.J(true);
        mh0Var.start();
        d();
    }

    private void setColor(int i7) {
        lv lvVar = this.O;
        int i10 = lvVar.U;
        if (i10 == 5 || i10 == 7) {
            i7 = lvVar.R;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        q9 q9Var = this.d;
        if (q9Var != null && !this.c) {
            q9Var.setColorFilter(porterDuffColorFilter);
            q9Var.invalidate();
        }
        mh0 mh0Var = this.e;
        if (mh0Var != null) {
            mh0Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        ug.c1 c1Var = this.f;
        if (c1Var == null) {
            return;
        }
        this.F = bool;
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Nl));
    }

    public final void b() {
        fi.s2 s2Var;
        o5 o5Var = this.x;
        if (o5Var == null || (s2Var = o5Var.k) == null) {
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
        org.telegram.messenger.fc h;
        q9 q9Var = this.d;
        if (q9Var == null) {
            return;
        }
        if (this.y && this.E) {
            o5 o5Var = this.x;
            if (o5Var != null || (this.s == null && this.r == null)) {
                if (o5Var != null) {
                    o5Var.n(q9Var);
                    this.x = null;
                }
                q9Var.b();
                fx fxVar = this.w;
                if (fxVar != null) {
                    TLRPC.StickerSet stickerSet = fxVar.b;
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
                        h = org.telegram.messenger.fc.h(fileLocation, w10.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, w10.type);
                    }
                    this.d.k(h, "24_24", null, null, this.w);
                    if (this.w.d != null) {
                        org.telegram.messenger.ri.d0(org.telegram.messenger.j10.t0).o0(this.w.d, false);
                        this.w.d = null;
                    }
                }
            } else {
                q9Var.b();
                TLRPC.Document document = this.s;
                lv lvVar = this.O;
                if (document != null) {
                    this.x = o5.l(org.telegram.messenger.j10.t0, lvVar.T, document);
                } else {
                    this.x = o5.m(org.telegram.messenger.j10.t0, this.r.longValue(), null, lvVar.T);
                }
                this.x.a(q9Var);
                q9Var.setImageDrawable(this.x);
            }
        } else {
            o5 o5Var2 = this.x;
            if (o5Var2 != null) {
                o5Var2.n(q9Var);
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
        lv lvVar = this.O;
        int k10 = lvVar.k();
        org.telegram.ui.ActionBar.i6 i6Var = lvVar.w;
        org.telegram.ui.ActionBar.n6.H1(background, k10, false);
        if (lvVar.Q) {
            setColor(i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nl, i6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, this.H) * 255.0f)));
        } else {
            setColor(i0.a.f(this.H, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ef, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Gf, i6Var)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mh0 mh0Var = this.e;
        if (mh0Var == null || !this.E) {
            return;
        }
        mh0Var.draw(canvas);
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
        ug.c1 c1Var = this.f;
        c1Var.setScaleX(f10);
        c1Var.setScaleY(this.G);
        c1Var.setAlpha(this.G);
        c1Var.setVisibility(z10 ? 0 : 8);
    }

    public final void f() {
        ug.c1 c1Var = this.f;
        if (c1Var == null || c1Var.h || !(getDrawable() instanceof o5)) {
            return;
        }
        if (((o5) getDrawable()).c()) {
            c1Var.setImageReceiver(null);
            c1Var.setColor(this.O.R);
            return;
        }
        fi.s2 s2Var = ((o5) getDrawable()).k;
        if (s2Var != null) {
            c1Var.setImageReceiver(s2Var);
            c1Var.invalidate();
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
            ofFloat.addUpdateListener(new w(this, 20));
            this.J.addListener(new org.telegram.ui.on(8, this, z10));
            this.J.setDuration(ch.f0.d() ? 0L : 350L);
            this.J.setInterpolator(lr.h);
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
            fx fxVar = this.w;
            if (fxVar == null || (stickerSet = fxVar.b) == null || (str = stickerSet.title) == null) {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = org.telegram.messenger.fj.V(document, null, null);
                } else {
                    Long l10 = this.r;
                    if (l10 != null && (e10 = o5.e(org.telegram.messenger.j10.t0, l10.longValue())) != null) {
                        contentDescription = org.telegram.messenger.fj.V(e10, null, null);
                    }
                }
            } else {
                contentDescription = str;
            }
        }
        Boolean bool = this.F;
        if (bool != null && !bool.booleanValue()) {
            String M0 = org.telegram.messenger.gd.M0(2131750820, null);
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
        q9 q9Var = this.d;
        if (q9Var != null) {
            int i13 = (i11 - i7) / 2;
            int i14 = (i12 - i10) / 2;
            q9Var.layout(i13 - (q9Var.getMeasuredWidth() / 2), i14 - (q9Var.getMeasuredHeight() / 2), (q9Var.getMeasuredWidth() / 2) + i13, (q9Var.getMeasuredHeight() / 2) + i14);
        }
        ug.c1 c1Var = this.f;
        if (c1Var != null) {
            int i15 = i11 - i7;
            int i16 = i12 - i10;
            c1Var.layout(i15 - c1Var.getMeasuredWidth(), i16 - c1Var.getMeasuredHeight(), i15, i16);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        q9 q9Var = this.d;
        if (q9Var != null) {
            q9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
        }
        ug.c1 c1Var = this.f;
        if (c1Var != null) {
            c1Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        fi.s2 s2Var;
        o5 o5Var = this.x;
        if (o5Var != null && (s2Var = o5Var.k) != null) {
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
        o5 o5Var = this.x;
        q9 q9Var = this.d;
        if (o5Var != null) {
            o5Var.n(q9Var);
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
        o5 o5Var = this.x;
        q9 q9Var = this.d;
        if (o5Var != null) {
            o5Var.n(q9Var);
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

    public void setStickerThumb(fx fxVar) {
        if (fxVar != null && fxVar.b == null) {
            fxVar = null;
        }
        fx fxVar2 = this.w;
        if (fxVar2 == null || fxVar == null || fxVar2.b.id != fxVar.b.id) {
            o5 o5Var = this.x;
            q9 q9Var = this.d;
            if (o5Var != null && this.s == null && this.r == null) {
                o5Var.n(q9Var);
                this.x = null;
            }
            q9Var.b();
            this.w = fxVar;
            c();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        lv lvVar = this.O;
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ef, lvVar.w);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Gf, lvVar.w);
            int k10 = lvVar.k();
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
    public hv(lv lvVar, Context context, int i7, boolean z10) {
        super(context);
        this.O = lvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.h = false;
        this.n = z10;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.n6.a0(lvVar.k(), 8, 8));
        }
        q9 q9Var = new q9(context);
        this.d = q9Var;
        q9Var.x = false;
        q9Var.setImageDrawable(context.getResources().getDrawable(i7).mutate());
        d();
        addView(q9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(lv lvVar, Context context, TLRPC.Document document) {
        super(context);
        this.O = lvVar;
        setFocusable(true);
        this.N = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        ev evVar = new ev(this, context);
        this.d = evVar;
        evVar.x = false;
        this.s = document;
        this.c = true;
        evVar.setColorFilter(lvVar.getEmojiColorFilter());
        addView(evVar);
        int i7 = ug.c1.M;
        fv fvVar = new fv(1, context, lvVar.w);
        this.f = fvVar;
        fvVar.setAlpha(0.0f);
        fvVar.setScaleX(0.0f);
        fvVar.setScaleY(0.0f);
        f();
        addView(fvVar);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(lv lvVar, Context context, long j3) {
        super(context);
        this.O = lvVar;
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
        t3Var.setColorFilter(lvVar.getEmojiColorFilter());
        addView(t3Var);
        int i7 = ug.c1.M;
        gv gvVar = new gv(1, context, lvVar.w);
        this.f = gvVar;
        gvVar.setAlpha(0.0f);
        gvVar.setScaleX(0.0f);
        gvVar.setScaleY(0.0f);
        f();
        addView(gvVar);
        d();
    }
}
