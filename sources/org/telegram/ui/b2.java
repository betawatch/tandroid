package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b2 extends FrameLayout implements org.telegram.messenger.z5, org.telegram.ui.Cells.j9 {
    public int D;
    public boolean E;
    public int F;
    public int G;
    public TLRPC.PhotoSize H;
    public String I;
    public TLRPC.PhotoSize J;
    public String K;
    public TLRPC.Photo L;
    public final int M;
    public TL_iv.pageBlockPhoto N;
    public TLObject O;
    public TL_iv.PageBlock P;
    public boolean Q;
    public org.telegram.messenger.bj R;
    public Drawable S;
    public boolean T;
    public final m60 a;
    public final f4 b;
    public z2 c;
    public z2 d;
    public final ImageReceiver e;
    public final RadialProgress2 f;
    public final c1 h;
    public final int n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    public b2(Context context, m60 m60Var, f4 f4Var, int i10) {
        super(context);
        this.a = m60Var;
        this.b = f4Var;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        c1 c1Var = new c1(context, m60Var, f4Var, 1);
        this.h = c1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.M = org.telegram.messenger.b6.q(((h4) m60Var).X).k();
        addView(c1Var, w7.b6.c(-2.0f, -1));
        this.n = i10;
    }

    private int getIconForCurrentState() {
        int i10 = this.F;
        if (i10 == 0) {
            return 2;
        }
        return i10 == 1 ? 3 : 4;
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        b(false);
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        this.f.p(true, 1.0f);
        b(true);
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z10, boolean z11) {
        this.P = null;
        this.N = pageblockphoto;
        this.O = tLObject;
        this.Q = z10;
        this.r = z11;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.N.url)) {
            this.S = getResources().getDrawable(R.drawable.msg_instant_link);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.N;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = e4.d(pageblockphoto2.photo_id, this.O);
            if (d != null) {
                this.H = org.telegram.messenger.b8.w(d.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
            } else {
                this.H = null;
            }
        } else {
            this.H = null;
        }
        b(false);
        requestLayout();
    }

    public final void b(boolean z10) {
        int i10 = ((h4) this.a).X;
        String r10 = org.telegram.messenger.b8.r(null, this.H);
        org.telegram.messenger.b8.G(i10);
        File K = org.telegram.messenger.b8.K(this.H, null, true, true);
        org.telegram.messenger.b8.G(i10);
        File K2 = org.telegram.messenger.b8.K(this.H, null, false, true);
        boolean z11 = K.exists() || (K2 != null && K2.exists());
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            org.telegram.messenger.b6.q(i10).v(this);
            this.F = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.b6.q(i10).a(r10, null, this);
            float f7 = 0.0f;
            if (this.T || org.telegram.messenger.b8.G(i10).T(r10)) {
                this.F = 1;
                Float w9 = org.telegram.messenger.hc.D().w(r10);
                if (w9 != null) {
                    f7 = w9.floatValue();
                }
            } else {
                this.F = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            radialProgress2.p(false, f7);
        }
        invalidate();
    }

    public View getChannelCell() {
        return this.h;
    }

    public TL_iv.pageBlockPhoto getCurrentBlock() {
        return this.N;
    }

    public TLObject getCurrentPage() {
        return this.O;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override // org.telegram.messenger.z5
    public int getObserverTag() {
        return this.M;
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        this.f.p(true, Math.min(1.0f, j10 / j11));
        if (this.F != 1) {
            b(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.P();
        b(false);
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.R();
        org.telegram.messenger.b6.q(((h4) this.a).X).v(this);
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.N == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver.I() && imageReceiver.h1 == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A(), h4.p1);
        }
        imageReceiver.h(canvas2, null);
        if (imageReceiver.Q0) {
            this.f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.N.url) && !(this.L instanceof org.telegram.ui.web.x1)) {
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(35.0f);
            int L = (int) (imageReceiver.L0 + org.telegram.messenger.i0.L(11.0f));
            this.S.setBounds(measuredWidth, L, org.telegram.messenger.i0.L(24.0f) + measuredWidth, org.telegram.messenger.i0.L(24.0f) + L);
            this.S.draw(canvas2);
        }
        z2 z2Var = this.c;
        m60 m60Var = this.a;
        int i10 = 0;
        if (z2Var != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w);
            h4.t(m60Var, canvas2, this, 0);
            this.c.d(canvas2, this);
            canvas2.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w + this.x);
            h4.t(m60Var, canvas2, this, i10);
            this.d.d(canvas2, this);
            canvas2.restore();
        }
        h4.s(canvas2, m60Var, this.N, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131753948, null));
        if (this.c != null) {
            sb2.append(", ");
            sb2.append(this.c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        TL_iv.pageBlockPhoto pageblockphoto;
        int L;
        int i14;
        int i15;
        int i16;
        f4 f4Var;
        ArrayList arrayList;
        int i17;
        int i18;
        float f7;
        int i19;
        int i20;
        int i21;
        int i22;
        int size = View.MeasureSpec.getSize(i10);
        int i23 = this.n;
        int i24 = 1;
        if (i23 == 1) {
            size = ((View) getParent()).getMeasuredWidth();
            i13 = ((View) getParent()).getMeasuredHeight();
        } else {
            if (i23 != 2) {
                i12 = size;
                i13 = 0;
                pageblockphoto = this.N;
                ImageReceiver imageReceiver = this.e;
                if (pageblockphoto != null) {
                    this.L = e4.d(pageblockphoto.photo_id, this.O);
                    int L2 = org.telegram.messenger.i0.L(48.0f);
                    if (i23 != 0 || (i22 = this.N.level) <= 0) {
                        this.s = org.telegram.messenger.i0.L(18.0f);
                        L = i12 - org.telegram.messenger.i0.L(36.0f);
                        i14 = 0;
                        i15 = i12;
                    } else {
                        i14 = org.telegram.messenger.i0.L(18.0f) + org.telegram.messenger.i0.L(i22 * 14);
                        this.s = i14;
                        i15 = org.telegram.messenger.z20.w(18.0f, i14, i12);
                        L = i15;
                    }
                    TLRPC.Photo photo = this.L;
                    f4 f4Var2 = this.b;
                    if (photo == null || (this.H == null && !(photo instanceof org.telegram.ui.web.x1))) {
                        i16 = i13;
                    } else {
                        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, 40, true, null, false);
                        this.J = w9;
                        TLRPC.PhotoSize photoSize = this.H;
                        if (photoSize == w9) {
                            this.J = null;
                        }
                        TLRPC.Photo photo2 = this.L;
                        if (photo2 instanceof org.telegram.ui.web.x1) {
                            org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) photo2;
                            i17 = x1Var.d;
                            i18 = x1Var.e;
                        } else {
                            int i25 = photoSize.w;
                            int i26 = photoSize.h;
                            i17 = i25;
                            i18 = i26;
                        }
                        if (i23 == 0) {
                            float f10 = i17;
                            float f11 = i18;
                            i13 = (int) ((i15 / f10) * f11);
                            f7 = 2.0f;
                            if (this.P instanceof TL_iv.pageBlockCover) {
                                i13 = Math.min(i13, i15);
                            } else {
                                Point point = org.telegram.messenger.i0.q;
                                int max = (int) ((Math.max(point.x, point.y) - org.telegram.messenger.i0.L(56.0f)) * 0.9f);
                                if (i13 > max) {
                                    i15 = (int) ((max / f11) * f10);
                                    i14 += ((i12 - i14) - i15) / 2;
                                    i13 = max;
                                }
                            }
                        } else {
                            f7 = 2.0f;
                            if (i23 == 2) {
                                if ((this.R.l & 2) == 0) {
                                    i15 -= org.telegram.messenger.i0.L(2.0f);
                                }
                                int L3 = (this.R.l & 8) == 0 ? i13 - org.telegram.messenger.i0.L(2.0f) : i13;
                                if (this.R.j != 0) {
                                    int ceil = (int) Math.ceil((r7 * i12) / 1000.0f);
                                    i15 -= ceil;
                                    i14 += ceil;
                                }
                                int i27 = i15;
                                i19 = i13;
                                i13 = L3;
                                i20 = i14;
                                i21 = i27;
                                imageReceiver.y0(i20, (!this.r || i23 == 1 || i23 == 2 || this.N.level > 0) ? 0.0f : org.telegram.messenger.i0.L(8.0f), i21, i13);
                                if (i23 != 0) {
                                    this.I = null;
                                } else {
                                    Locale locale = Locale.US;
                                    this.I = a1.g.i(i21, i13, "_");
                                }
                                this.K = "80_80_b";
                                h4 h4Var = (h4) this.a;
                                this.T = (org.telegram.messenger.b6.q(h4Var.X).m() & 1) == 0;
                                if (!this.Q) {
                                    TLRPC.Photo photo3 = this.L;
                                    if (photo3 instanceof org.telegram.ui.web.x1) {
                                        this.T = true;
                                        imageReceiver.N = null;
                                        org.telegram.ui.web.y1.g((org.telegram.ui.web.x1) photo3, imageReceiver, new rr0(this, 9));
                                    } else {
                                        org.telegram.messenger.b8.G(h4Var.X);
                                        File K = org.telegram.messenger.b8.K(this.H, null, true, true);
                                        if (this.T || K.exists()) {
                                            imageReceiver.N = null;
                                            imageReceiver.r0(org.telegram.messenger.ic.i(this.H, this.L), this.I, org.telegram.messenger.ic.i(this.J, this.L), this.K, null, this.H.size, null, f4Var2 != null ? f4Var2.E : null, 1);
                                        } else {
                                            imageReceiver.N = org.telegram.messenger.ic.i(this.H, this.L);
                                            imageReceiver.r0(null, this.I, org.telegram.messenger.ic.i(this.J, this.L), this.K, null, this.H.size, null, f4Var2 != null ? f4Var2.E : null, 1);
                                        }
                                    }
                                }
                                float f12 = L2;
                                float f13 = f7;
                                int B = (int) c3.i0.B(imageReceiver.M0, f12, f13, imageReceiver.K0);
                                this.y = B;
                                int B2 = (int) c3.i0.B(imageReceiver.N0, f12, f13, imageReceiver.L0);
                                this.D = B2;
                                this.f.r(B, B2, B + L2, L2 + B2);
                                i16 = i19;
                            }
                        }
                        i20 = i14;
                        i21 = i15;
                        i19 = i13;
                        imageReceiver.y0(i20, (!this.r || i23 == 1 || i23 == 2 || this.N.level > 0) ? 0.0f : org.telegram.messenger.i0.L(8.0f), i21, i13);
                        if (i23 != 0) {
                        }
                        this.K = "80_80_b";
                        h4 h4Var2 = (h4) this.a;
                        this.T = (org.telegram.messenger.b6.q(h4Var2.X).m() & 1) == 0;
                        if (!this.Q) {
                        }
                        float f122 = L2;
                        float f132 = f7;
                        int B3 = (int) c3.i0.B(imageReceiver.M0, f122, f132, imageReceiver.K0);
                        this.y = B3;
                        int B22 = (int) c3.i0.B(imageReceiver.N0, f122, f132, imageReceiver.L0);
                        this.D = B22;
                        this.f.r(B3, B22, B3 + L2, L2 + B22);
                        i16 = i19;
                    }
                    int L4 = (int) (imageReceiver.L0 + imageReceiver.N0 + org.telegram.messenger.i0.L(8.0f));
                    this.w = L4;
                    if (i23 == 0) {
                        TL_iv.pageBlockPhoto pageblockphoto2 = this.N;
                        z2 o10 = h4.o(this.a, this, null, pageblockphoto2.caption.text, L, L4, pageblockphoto2, this.b);
                        this.c = o10;
                        if (o10 != null) {
                            int height = this.c.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                            this.x = height;
                            i16 = org.telegram.messenger.m5.C(4.0f, height, i16);
                        }
                        int i28 = i16;
                        TL_iv.pageBlockPhoto pageblockphoto3 = this.N;
                        f4Var = f4Var2;
                        z2 n10 = h4.n(this.a, this, null, pageblockphoto3.caption.credit, L, this.w + this.x, pageblockphoto3, (f4Var2 == null || !f4Var2.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ov0.a(), 0, this.b);
                        this.d = n10;
                        i16 = n10 != null ? this.d.d.getHeight() + org.telegram.messenger.i0.L(4.0f) + i28 : i28;
                    } else {
                        f4Var = f4Var2;
                    }
                    if (!this.r && i23 == 0 && this.N.level <= 0) {
                        i16 += org.telegram.messenger.i0.L(8.0f);
                    }
                    i24 = (i23 == 2 || ((this.P instanceof TL_iv.pageBlockCover) && f4Var != null && (arrayList = f4Var.e) != null && arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel))) ? i16 : org.telegram.messenger.i0.L(8.0f) + i16;
                    z2 z2Var = this.c;
                    if (z2Var != null) {
                        z2Var.s = this.s;
                        z2Var.w = this.w;
                    }
                    z2 z2Var2 = this.d;
                    if (z2Var2 != null) {
                        z2Var2.s = this.s;
                        z2Var2.w = this.w + this.x;
                    }
                }
                c1 c1Var = this.h;
                c1Var.measure(i10, i11);
                c1Var.setTranslationY(imageReceiver.N0 - org.telegram.messenger.i0.L(39.0f));
                setMeasuredDimension(i12, i24);
            }
            float f14 = this.R.f;
            Point point2 = org.telegram.messenger.i0.q;
            i13 = (int) Math.ceil(f14 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i12 = size;
        pageblockphoto = this.N;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockphoto != null) {
        }
        c1 c1Var2 = this.h;
        c1Var2.measure(i10, i11);
        c1Var2.setTranslationY(imageReceiver2.N0 - org.telegram.messenger.i0.L(39.0f));
        setMeasuredDimension(i12, i24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r1 <= (org.telegram.messenger.i0.L(48.0f) + r0)) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        c1 c1Var = this.h;
        int visibility = c1Var.getVisibility();
        f4 f4Var = this.b;
        if (visibility != 0 || y3 <= c1Var.getTranslationY() || y3 >= c1Var.getTranslationY() + org.telegram.messenger.i0.L(39.0f)) {
            int action = motionEvent.getAction();
            ImageReceiver imageReceiver = this.e;
            if (action == 0 && imageReceiver.O(x10, y3)) {
                if (this.F != -1) {
                    if (x10 >= this.y && x10 <= org.telegram.messenger.i0.L(48.0f) + r2) {
                        if (y3 >= this.D) {
                        }
                    }
                }
                if (this.F != 0) {
                    this.E = true;
                }
                this.G = 1;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.E) {
                    this.E = false;
                    this.a.b(this.N, f4Var);
                } else if (this.G == 1) {
                    this.G = 0;
                    playSoundEffect(0);
                    if (this.H != null) {
                        int i10 = this.F;
                        RadialProgress2 radialProgress2 = this.f;
                        if (i10 == 0) {
                            radialProgress2.p(true, 0.0f);
                            imageReceiver.r0(org.telegram.messenger.ic.i(this.H, this.L), this.I, org.telegram.messenger.ic.i(this.J, this.L), this.K, null, this.H.size, null, this.O, 1);
                            this.F = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i10 == 1) {
                            imageReceiver.c();
                            this.F = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    }
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.E = false;
                this.G = 0;
            }
            if (!this.E && this.G == 0) {
                if (!h4.j(this.a, this.b, motionEvent, this, this.c, this.s, this.w)) {
                    if (!h4.j(this.a, this.b, motionEvent, this, this.d, this.s, this.w + this.x) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (f4Var != null && f4Var.F != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.P = pageBlock;
        f4 f4Var = this.b;
        if (f4Var == null || (pageblockchannel = f4Var.F) == null || !(pageBlock instanceof TL_iv.pageBlockCover)) {
            return;
        }
        c1 c1Var = this.h;
        c1Var.setBlock(pageblockchannel);
        c1Var.setVisibility(0);
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
