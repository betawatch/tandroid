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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b2 extends FrameLayout implements org.telegram.messenger.x5, org.telegram.ui.Cells.g9 {
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
    public org.telegram.messenger.ri S;
    public Drawable T;
    public boolean U;
    public final i50 a;
    public final g4 b;
    public a3 c;
    public a3 d;
    public final ImageReceiver e;
    public final RadialProgress2 f;
    public final b1 h;
    public final int n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    public b2(Context context, i50 i50Var, g4 g4Var, int i3) {
        super(context);
        this.a = i50Var;
        this.b = g4Var;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        b1 b1Var = new b1(context, i50Var, g4Var, 1);
        this.h = b1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.N = org.telegram.messenger.z5.q(((i4) i50Var).Y).k();
        addView(b1Var, b8.mf.c(-2.0f, -1));
        this.n = i3;
    }

    private int getIconForCurrentState() {
        int i3 = this.G;
        if (i3 == 0) {
            return 2;
        }
        return i3 == 1 ? 3 : 4;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        b(false);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
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
            TLRPC.Photo d = e4.d(pageblockphoto2.photo_id, this.P);
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
        int i3 = ((i4) this.a).Y;
        String r5 = org.telegram.messenger.w7.r(null, this.I);
        org.telegram.messenger.w7.G(i3);
        File K = org.telegram.messenger.w7.K(this.I, null, true, true);
        org.telegram.messenger.w7.G(i3);
        File K2 = org.telegram.messenger.w7.K(this.I, null, false, true);
        boolean z11 = K.exists() || (K2 != null && K2.exists());
        boolean isEmpty = TextUtils.isEmpty(r5);
        RadialProgress2 radialProgress2 = this.f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            org.telegram.messenger.z5.q(i3).v(this);
            this.G = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.z5.q(i3).a(r5, null, this);
            float f10 = 0.0f;
            if (this.U || org.telegram.messenger.w7.G(i3).T(r5)) {
                this.G = 1;
                Float w10 = org.telegram.messenger.zb.D().w(r5);
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

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.N;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        this.f.p(true, Math.min(1.0f, j10 / j11));
        if (this.G != 1) {
            b(true);
        }
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.P();
        b(false);
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.R();
        org.telegram.messenger.z5.q(((i4) this.a).Y).v(this);
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.O == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver.I() && imageReceiver.i1 == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A(), i4.q1);
        }
        imageReceiver.h(canvas2, null);
        if (imageReceiver.R0) {
            this.f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.O.url) && !(this.M instanceof org.telegram.ui.web.t1)) {
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(35.0f);
            int L = (int) (imageReceiver.M0 + org.telegram.messenger.g0.L(11.0f));
            this.T.setBounds(measuredWidth, L, org.telegram.messenger.g0.L(24.0f) + measuredWidth, org.telegram.messenger.g0.L(24.0f) + L);
            this.T.draw(canvas2);
        }
        a3 a3Var = this.c;
        i50 i50Var = this.a;
        int i3 = 0;
        if (a3Var != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w);
            i4.t(i50Var, canvas2, this, 0);
            this.c.d(canvas2, this);
            canvas2.restore();
            i3 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w + this.x);
            i4.t(i50Var, canvas2, this, i3);
            this.d.d(canvas2, this);
            canvas2.restore();
        }
        i4.s(canvas2, i50Var, this.O, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131753948, null));
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
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        TL_iv.pageBlockPhoto pageblockphoto;
        int L;
        int i13;
        int i14;
        int i15;
        g4 g4Var;
        ArrayList arrayList;
        int i16;
        int i17;
        float f10;
        int i18;
        int i19;
        int i20;
        int i21;
        int size = View.MeasureSpec.getSize(i3);
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
                    this.M = e4.d(pageblockphoto.photo_id, this.P);
                    int L2 = org.telegram.messenger.g0.L(48.0f);
                    if (i22 != 0 || (i21 = this.O.level) <= 0) {
                        this.s = org.telegram.messenger.g0.L(18.0f);
                        L = i11 - org.telegram.messenger.g0.L(36.0f);
                        i13 = 0;
                        i14 = i11;
                    } else {
                        i13 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(i21 * 14);
                        this.s = i13;
                        i14 = org.telegram.messenger.camera.q.w(18.0f, i13, i11);
                        L = i14;
                    }
                    TLRPC.Photo photo = this.M;
                    g4 g4Var2 = this.b;
                    if (photo == null || (this.I == null && !(photo instanceof org.telegram.ui.web.t1))) {
                        i15 = i12;
                    } else {
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 40, true, null, false);
                        this.K = w10;
                        TLRPC.PhotoSize photoSize = this.I;
                        if (photoSize == w10) {
                            this.K = null;
                        }
                        TLRPC.Photo photo2 = this.M;
                        if (photo2 instanceof org.telegram.ui.web.t1) {
                            org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) photo2;
                            i16 = t1Var.d;
                            i17 = t1Var.e;
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
                                imageReceiver.y0(i19, (!this.r || i22 == 1 || i22 == 2 || this.O.level > 0) ? 0.0f : org.telegram.messenger.g0.L(8.0f), i20, i12);
                                if (i22 != 0) {
                                    this.J = null;
                                } else {
                                    Locale locale = Locale.US;
                                    this.J = com.google.android.recaptcha.internal.a.i(i20, "_", i12);
                                }
                                this.L = "80_80_b";
                                i4 i4Var = (i4) this.a;
                                this.U = (org.telegram.messenger.z5.q(i4Var.Y).m() & 1) == 0;
                                if (!this.R) {
                                    TLRPC.Photo photo3 = this.M;
                                    if (photo3 instanceof org.telegram.ui.web.t1) {
                                        this.U = true;
                                        imageReceiver.O = null;
                                        org.telegram.ui.web.u1.g((org.telegram.ui.web.t1) photo3, imageReceiver, new xp0(this, 9));
                                    } else {
                                        org.telegram.messenger.w7.G(i4Var.Y);
                                        File K = org.telegram.messenger.w7.K(this.I, null, true, true);
                                        if (this.U || K.exists()) {
                                            imageReceiver.O = null;
                                            imageReceiver.r0(org.telegram.messenger.ac.i(this.I, this.M), this.J, org.telegram.messenger.ac.i(this.K, this.M), this.L, null, this.I.size, null, g4Var2 != null ? g4Var2.F : null, 1);
                                        } else {
                                            imageReceiver.O = org.telegram.messenger.ac.i(this.I, this.M);
                                            imageReceiver.r0(null, this.J, org.telegram.messenger.ac.i(this.K, this.M), this.L, null, this.I.size, null, g4Var2 != null ? g4Var2.F : null, 1);
                                        }
                                    }
                                }
                                float f13 = L2;
                                float f14 = f10;
                                int z10 = (int) com.google.android.recaptcha.internal.a.z(imageReceiver.N0, f13, f14, imageReceiver.L0);
                                this.y = z10;
                                int z11 = (int) com.google.android.recaptcha.internal.a.z(imageReceiver.O0, f13, f14, imageReceiver.M0);
                                this.E = z11;
                                this.f.r(z10, z11, z10 + L2, L2 + z11);
                                i15 = i18;
                            }
                        }
                        i19 = i13;
                        i20 = i14;
                        i18 = i12;
                        imageReceiver.y0(i19, (!this.r || i22 == 1 || i22 == 2 || this.O.level > 0) ? 0.0f : org.telegram.messenger.g0.L(8.0f), i20, i12);
                        if (i22 != 0) {
                        }
                        this.L = "80_80_b";
                        i4 i4Var2 = (i4) this.a;
                        this.U = (org.telegram.messenger.z5.q(i4Var2.Y).m() & 1) == 0;
                        if (!this.R) {
                        }
                        float f132 = L2;
                        float f142 = f10;
                        int z102 = (int) com.google.android.recaptcha.internal.a.z(imageReceiver.N0, f132, f142, imageReceiver.L0);
                        this.y = z102;
                        int z112 = (int) com.google.android.recaptcha.internal.a.z(imageReceiver.O0, f132, f142, imageReceiver.M0);
                        this.E = z112;
                        this.f.r(z102, z112, z102 + L2, L2 + z112);
                        i15 = i18;
                    }
                    int L4 = (int) (imageReceiver.M0 + imageReceiver.O0 + org.telegram.messenger.g0.L(8.0f));
                    this.w = L4;
                    if (i22 == 0) {
                        TL_iv.pageBlockPhoto pageblockphoto2 = this.O;
                        a3 o10 = i4.o(this.a, this, null, pageblockphoto2.caption.text, L, L4, pageblockphoto2, this.b);
                        this.c = o10;
                        if (o10 != null) {
                            int height = this.c.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                            this.x = height;
                            i15 = org.telegram.messenger.k5.C(4.0f, height, i15);
                        }
                        int i27 = i15;
                        TL_iv.pageBlockPhoto pageblockphoto3 = this.O;
                        g4Var = g4Var2;
                        a3 n4 = i4.n(this.a, this, null, pageblockphoto3.caption.credit, L, this.w + this.x, pageblockphoto3, (g4Var2 == null || !g4Var2.H) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.lu0.a(), 0, this.b);
                        this.d = n4;
                        i15 = n4 != null ? this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f) + i27 : i27;
                    } else {
                        g4Var = g4Var2;
                    }
                    if (!this.r && i22 == 0 && this.O.level <= 0) {
                        i15 += org.telegram.messenger.g0.L(8.0f);
                    }
                    i23 = (i22 == 2 || ((this.Q instanceof TL_iv.pageBlockCover) && g4Var != null && (arrayList = g4Var.e) != null && arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel))) ? i15 : org.telegram.messenger.g0.L(8.0f) + i15;
                    a3 a3Var = this.c;
                    if (a3Var != null) {
                        a3Var.s = this.s;
                        a3Var.w = this.w;
                    }
                    a3 a3Var2 = this.d;
                    if (a3Var2 != null) {
                        a3Var2.s = this.s;
                        a3Var2.w = this.w + this.x;
                    }
                }
                b1 b1Var = this.h;
                b1Var.measure(i3, i10);
                b1Var.setTranslationY(imageReceiver.O0 - org.telegram.messenger.g0.L(39.0f));
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
        b1 b1Var2 = this.h;
        b1Var2.measure(i3, i10);
        b1Var2.setTranslationY(imageReceiver2.O0 - org.telegram.messenger.g0.L(39.0f));
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
        float y9 = motionEvent.getY();
        b1 b1Var = this.h;
        int visibility = b1Var.getVisibility();
        g4 g4Var = this.b;
        if (visibility != 0 || y9 <= b1Var.getTranslationY() || y9 >= b1Var.getTranslationY() + org.telegram.messenger.g0.L(39.0f)) {
            int action = motionEvent.getAction();
            ImageReceiver imageReceiver = this.e;
            if (action == 0 && imageReceiver.O(x10, y9)) {
                if (this.G != -1) {
                    if (x10 >= this.y && x10 <= org.telegram.messenger.g0.L(48.0f) + r2) {
                        if (y9 >= this.E) {
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
                    this.a.b(this.O, g4Var);
                } else if (this.H == 1) {
                    this.H = 0;
                    playSoundEffect(0);
                    if (this.I != null) {
                        int i3 = this.G;
                        RadialProgress2 radialProgress2 = this.f;
                        if (i3 == 0) {
                            radialProgress2.p(true, 0.0f);
                            imageReceiver.r0(org.telegram.messenger.ac.i(this.I, this.M), this.J, org.telegram.messenger.ac.i(this.K, this.M), this.L, null, this.I.size, null, this.P, 1);
                            this.G = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i3 == 1) {
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
                if (!i4.j(this.a, this.b, motionEvent, this, this.c, this.s, this.w)) {
                    if (!i4.j(this.a, this.b, motionEvent, this, this.d, this.s, this.w + this.x) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (g4Var != null && g4Var.G != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.Q = pageBlock;
        g4 g4Var = this.b;
        if (g4Var == null || (pageblockchannel = g4Var.G) == null || !(pageBlock instanceof TL_iv.pageBlockCover)) {
            return;
        }
        b1 b1Var = this.h;
        b1Var.setBlock(pageblockchannel);
        b1Var.setVisibility(0);
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
