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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a2 extends FrameLayout implements org.telegram.messenger.y5, org.telegram.ui.Cells.h9 {
    public int E;
    public boolean F;
    public int G;
    public int H;
    public TLRPC.PhotoSize I;
    public String J;
    public TLRPC.PhotoSize K;
    public String L;
    public TLRPC.Photo M;
    public final int N;
    public TL_iv.pageBlockPhoto O;
    public TLObject P;
    public TL_iv.PageBlock Q;
    public boolean R;
    public org.telegram.messenger.xi S;
    public Drawable T;
    public boolean U;
    public final p50 a;
    public final e4 b;
    public z2 c;
    public z2 d;
    public final ImageReceiver e;
    public final RadialProgress2 f;
    public final a1 h;
    public final int n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    public a2(Context context, p50 p50Var, e4 e4Var, int i7) {
        super(context);
        this.a = p50Var;
        this.b = e4Var;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        a1 a1Var = new a1(context, p50Var, e4Var, 1);
        this.h = a1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.N = org.telegram.messenger.a6.q(((g4) p50Var).Y).k();
        addView(a1Var, c8.na.c(-2.0f, -1));
        this.n = i7;
    }

    private int getIconForCurrentState() {
        int i7 = this.G;
        if (i7 == 0) {
            return 2;
        }
        return i7 == 1 ? 3 : 4;
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
        b(false);
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
        this.f.p(true, 1.0f);
        b(true);
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z10, boolean z11) {
        this.Q = null;
        this.O = pageblockphoto;
        this.P = tLObject;
        this.R = z10;
        this.r = z11;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.O.url)) {
            this.T = getResources().getDrawable(R.drawable.msg_instant_link);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.O;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = d4.d(pageblockphoto2.photo_id, this.P);
            if (d != null) {
                this.I = org.telegram.messenger.w7.w(d.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            } else {
                this.I = null;
            }
        } else {
            this.I = null;
        }
        b(false);
        requestLayout();
    }

    public final void b(boolean z10) {
        int i7 = ((g4) this.a).Y;
        String r10 = org.telegram.messenger.w7.r(null, this.I);
        org.telegram.messenger.w7.G(i7);
        File J = org.telegram.messenger.w7.J(this.I, null, true, true);
        org.telegram.messenger.w7.G(i7);
        File J2 = org.telegram.messenger.w7.J(this.I, null, false, true);
        boolean z11 = J.exists() || (J2 != null && J2.exists());
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            org.telegram.messenger.a6.q(i7).v(this);
            this.G = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.a6.q(i7).a(r10, null, this);
            float f10 = 0.0f;
            if (this.U || org.telegram.messenger.w7.G(i7).S(r10)) {
                this.G = 1;
                Float w10 = org.telegram.messenger.ec.D().w(r10);
                if (w10 != null) {
                    f10 = w10.floatValue();
                }
            } else {
                this.G = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            radialProgress2.p(false, f10);
        }
        invalidate();
    }

    public View getChannelCell() {
        return this.h;
    }

    public TL_iv.pageBlockPhoto getCurrentBlock() {
        return this.O;
    }

    public TLObject getCurrentPage() {
        return this.P;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override // org.telegram.messenger.y5
    public int getObserverTag() {
        return this.N;
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        this.f.p(true, Math.min(1.0f, j3 / j10));
        if (this.G != 1) {
            b(true);
        }
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.Q();
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
        this.e.S();
        org.telegram.messenger.a6.q(((g4) this.a).Y).v(this);
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
        if (this.O == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver.J() && imageReceiver.i1 == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.z(), imageReceiver.B(), g4.q1);
        }
        imageReceiver.h(canvas2, null);
        if (imageReceiver.R0) {
            this.f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.O.url) && !(this.M instanceof org.telegram.ui.web.v1)) {
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(35.0f);
            int L = (int) (imageReceiver.M0 + org.telegram.messenger.g0.L(11.0f));
            this.T.setBounds(measuredWidth, L, org.telegram.messenger.g0.L(24.0f) + measuredWidth, org.telegram.messenger.g0.L(24.0f) + L);
            this.T.draw(canvas2);
        }
        z2 z2Var = this.c;
        p50 p50Var = this.a;
        int i7 = 0;
        if (z2Var != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w);
            g4.t(p50Var, canvas2, this, 0);
            this.c.d(canvas2, this);
            canvas2.restore();
            i7 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w + this.x);
            g4.t(p50Var, canvas2, this, i7);
            this.d.d(canvas2, this);
            canvas2.restore();
        }
        g4.s(canvas2, p50Var, this.O, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.gd.N0(2131753945, null));
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
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        TL_iv.pageBlockPhoto pageblockphoto;
        int L;
        int i13;
        int i14;
        int i15;
        e4 e4Var;
        ArrayList arrayList;
        int i16;
        int i17;
        float f10;
        int i18;
        int i19;
        int i20;
        int i21;
        int size = View.MeasureSpec.getSize(i7);
        int i22 = this.n;
        int i23 = 1;
        if (i22 == 1) {
            size = ((View) getParent()).getMeasuredWidth();
            i12 = ((View) getParent()).getMeasuredHeight();
        } else {
            if (i22 != 2) {
                i11 = size;
                i12 = 0;
                pageblockphoto = this.O;
                ImageReceiver imageReceiver = this.e;
                if (pageblockphoto != null) {
                    this.M = d4.d(pageblockphoto.photo_id, this.P);
                    int L2 = org.telegram.messenger.g0.L(48.0f);
                    if (i22 != 0 || (i21 = this.O.level) <= 0) {
                        this.s = org.telegram.messenger.g0.L(18.0f);
                        L = i11 - org.telegram.messenger.g0.L(36.0f);
                        i13 = 0;
                        i14 = i11;
                    } else {
                        i13 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(i21 * 14);
                        this.s = i13;
                        i14 = org.telegram.messenger.m10.x(18.0f, i13, i11);
                        L = i14;
                    }
                    TLRPC.Photo photo = this.M;
                    e4 e4Var2 = this.b;
                    if (photo == null || (this.I == null && !(photo instanceof org.telegram.ui.web.v1))) {
                        i15 = i12;
                    } else {
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 40, true, null, false);
                        this.K = w10;
                        TLRPC.PhotoSize photoSize = this.I;
                        if (photoSize == w10) {
                            this.K = null;
                        }
                        TLRPC.Photo photo2 = this.M;
                        if (photo2 instanceof org.telegram.ui.web.v1) {
                            org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) photo2;
                            i16 = v1Var.d;
                            i17 = v1Var.e;
                        } else {
                            int i24 = photoSize.w;
                            int i25 = photoSize.h;
                            i16 = i24;
                            i17 = i25;
                        }
                        if (i22 == 0) {
                            float f11 = i16;
                            float f12 = i17;
                            i12 = (int) ((i14 / f11) * f12);
                            f10 = 2.0f;
                            if (this.Q instanceof TL_iv.pageBlockCover) {
                                i12 = Math.min(i12, i14);
                            } else {
                                Point point = org.telegram.messenger.g0.q;
                                int max = (int) ((Math.max(point.x, point.y) - org.telegram.messenger.g0.L(56.0f)) * 0.9f);
                                if (i12 > max) {
                                    i14 = (int) ((max / f12) * f11);
                                    i13 += ((i11 - i13) - i14) / 2;
                                    i12 = max;
                                }
                            }
                        } else {
                            f10 = 2.0f;
                            if (i22 == 2) {
                                if ((this.S.l & 2) == 0) {
                                    i14 -= org.telegram.messenger.g0.L(2.0f);
                                }
                                int L3 = (this.S.l & 8) == 0 ? i12 - org.telegram.messenger.g0.L(2.0f) : i12;
                                if (this.S.j != 0) {
                                    int ceil = (int) Math.ceil((r7 * i11) / 1000.0f);
                                    i14 -= ceil;
                                    i13 += ceil;
                                }
                                int i26 = i14;
                                i18 = i12;
                                i12 = L3;
                                i19 = i13;
                                i20 = i26;
                                imageReceiver.z0(i19, (!this.r || i22 == 1 || i22 == 2 || this.O.level > 0) ? 0.0f : org.telegram.messenger.g0.L(8.0f), i20, i12);
                                if (i22 != 0) {
                                    this.J = null;
                                } else {
                                    Locale locale = Locale.US;
                                    this.J = com.google.android.gms.internal.vision.e2.j(i20, "_", i12);
                                }
                                this.L = "80_80_b";
                                g4 g4Var = (g4) this.a;
                                this.U = (org.telegram.messenger.a6.q(g4Var.Y).m() & 1) == 0;
                                if (!this.R) {
                                    TLRPC.Photo photo3 = this.M;
                                    if (photo3 instanceof org.telegram.ui.web.v1) {
                                        this.U = true;
                                        imageReceiver.O = null;
                                        org.telegram.ui.web.w1.g((org.telegram.ui.web.v1) photo3, imageReceiver, new hq0(this, 9));
                                    } else {
                                        org.telegram.messenger.w7.G(g4Var.Y);
                                        File J = org.telegram.messenger.w7.J(this.I, null, true, true);
                                        if (this.U || J.exists()) {
                                            imageReceiver.O = null;
                                            imageReceiver.s0(org.telegram.messenger.fc.i(this.I, this.M), this.J, org.telegram.messenger.fc.i(this.K, this.M), this.L, null, this.I.size, null, e4Var2 != null ? e4Var2.F : null, 1);
                                        } else {
                                            imageReceiver.O = org.telegram.messenger.fc.i(this.I, this.M);
                                            imageReceiver.s0(null, this.J, org.telegram.messenger.fc.i(this.K, this.M), this.L, null, this.I.size, null, e4Var2 != null ? e4Var2.F : null, 1);
                                        }
                                    }
                                }
                                float f13 = L2;
                                float f14 = f10;
                                int A = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.N0, f13, f14, imageReceiver.L0);
                                this.y = A;
                                int A2 = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.O0, f13, f14, imageReceiver.M0);
                                this.E = A2;
                                this.f.r(A, A2, A + L2, L2 + A2);
                                i15 = i18;
                            }
                        }
                        i19 = i13;
                        i20 = i14;
                        i18 = i12;
                        imageReceiver.z0(i19, (!this.r || i22 == 1 || i22 == 2 || this.O.level > 0) ? 0.0f : org.telegram.messenger.g0.L(8.0f), i20, i12);
                        if (i22 != 0) {
                        }
                        this.L = "80_80_b";
                        g4 g4Var2 = (g4) this.a;
                        this.U = (org.telegram.messenger.a6.q(g4Var2.Y).m() & 1) == 0;
                        if (!this.R) {
                        }
                        float f132 = L2;
                        float f142 = f10;
                        int A3 = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.N0, f132, f142, imageReceiver.L0);
                        this.y = A3;
                        int A22 = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.O0, f132, f142, imageReceiver.M0);
                        this.E = A22;
                        this.f.r(A3, A22, A3 + L2, L2 + A22);
                        i15 = i18;
                    }
                    int L4 = (int) (imageReceiver.M0 + imageReceiver.O0 + org.telegram.messenger.g0.L(8.0f));
                    this.w = L4;
                    if (i22 == 0) {
                        TL_iv.pageBlockPhoto pageblockphoto2 = this.O;
                        z2 o4 = g4.o(this.a, this, null, pageblockphoto2.caption.text, L, L4, pageblockphoto2, this.b);
                        this.c = o4;
                        if (o4 != null) {
                            int height = this.c.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                            this.x = height;
                            i15 = org.telegram.messenger.f3.C(4.0f, height, i15);
                        }
                        int i27 = i15;
                        TL_iv.pageBlockPhoto pageblockphoto3 = this.O;
                        e4Var = e4Var2;
                        z2 n10 = g4.n(this.a, this, null, pageblockphoto3.caption.credit, L, this.w + this.x, pageblockphoto3, (e4Var2 == null || !e4Var2.H) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.yu0.a(), 0, this.b);
                        this.d = n10;
                        i15 = n10 != null ? this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f) + i27 : i27;
                    } else {
                        e4Var = e4Var2;
                    }
                    if (!this.r && i22 == 0 && this.O.level <= 0) {
                        i15 += org.telegram.messenger.g0.L(8.0f);
                    }
                    i23 = (i22 == 2 || ((this.Q instanceof TL_iv.pageBlockCover) && e4Var != null && (arrayList = e4Var.e) != null && arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel))) ? i15 : org.telegram.messenger.g0.L(8.0f) + i15;
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
                a1 a1Var = this.h;
                a1Var.measure(i7, i10);
                a1Var.setTranslationY(imageReceiver.O0 - org.telegram.messenger.g0.L(39.0f));
                setMeasuredDimension(i11, i23);
            }
            float f15 = this.S.f;
            Point point2 = org.telegram.messenger.g0.q;
            i12 = (int) Math.ceil(f15 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i11 = size;
        pageblockphoto = this.O;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockphoto != null) {
        }
        a1 a1Var2 = this.h;
        a1Var2.measure(i7, i10);
        a1Var2.setTranslationY(imageReceiver2.O0 - org.telegram.messenger.g0.L(39.0f));
        setMeasuredDimension(i11, i23);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r1 <= (org.telegram.messenger.g0.L(48.0f) + r0)) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        a1 a1Var = this.h;
        int visibility = a1Var.getVisibility();
        e4 e4Var = this.b;
        if (visibility != 0 || y10 <= a1Var.getTranslationY() || y10 >= a1Var.getTranslationY() + org.telegram.messenger.g0.L(39.0f)) {
            int action = motionEvent.getAction();
            ImageReceiver imageReceiver = this.e;
            if (action == 0 && imageReceiver.P(x10, y10)) {
                if (this.G != -1) {
                    if (x10 >= this.y && x10 <= org.telegram.messenger.g0.L(48.0f) + r2) {
                        if (y10 >= this.E) {
                        }
                    }
                }
                if (this.G != 0) {
                    this.F = true;
                }
                this.H = 1;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.F) {
                    this.F = false;
                    this.a.b(this.O, e4Var);
                } else if (this.H == 1) {
                    this.H = 0;
                    playSoundEffect(0);
                    if (this.I != null) {
                        int i7 = this.G;
                        RadialProgress2 radialProgress2 = this.f;
                        if (i7 == 0) {
                            radialProgress2.p(true, 0.0f);
                            imageReceiver.s0(org.telegram.messenger.fc.i(this.I, this.M), this.J, org.telegram.messenger.fc.i(this.K, this.M), this.L, null, this.I.size, null, this.P, 1);
                            this.G = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i7 == 1) {
                            imageReceiver.c();
                            this.G = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    }
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.F = false;
                this.H = 0;
            }
            if (!this.F && this.H == 0) {
                if (!g4.j(this.a, this.b, motionEvent, this, this.c, this.s, this.w)) {
                    if (!g4.j(this.a, this.b, motionEvent, this, this.d, this.s, this.w + this.x) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (e4Var != null && e4Var.G != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.Q = pageBlock;
        e4 e4Var = this.b;
        if (e4Var == null || (pageblockchannel = e4Var.G) == null || !(pageBlock instanceof TL_iv.pageBlockCover)) {
            return;
        }
        a1 a1Var = this.h;
        a1Var.setBlock(pageblockchannel);
        a1Var.setVisibility(0);
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
