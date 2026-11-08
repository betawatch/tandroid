package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.ro;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class l0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final wk0 E;
    public k0 F;
    public ea G;
    public final q1 a;
    public int b;
    public long c;
    public ij d;
    public long e;
    public StaticLayout g;
    public float h;
    public float i;
    public int j;
    public float o;
    public float p;
    public a80 s;
    public final org.telegram.ui.Components.w5 u;
    public my0 v;
    public final ic y;
    public final TextPaint f = new TextPaint(1);
    public final Paint k = new Paint(1);
    public final Path l = new Path();
    public final float m = -1.0f;
    public int n = org.telegram.messenger.g0.L(66.0f);
    public final ArrayList q = new ArrayList();
    public final Path r = new Path();
    public final RectF w = new RectF();
    public final RectF x = new RectF();
    public final Paint z = new Paint(1);
    public boolean t = true;

    public l0(q1 q1Var) {
        this.a = q1Var;
        this.E = new wk0(q1Var.getContext(), null);
        this.y = new ic(q1Var);
        this.u = new org.telegram.ui.Components.w5(q1Var, 350L, xq.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(MotionEvent motionEvent) {
        q1 q1Var;
        ArrayList arrayList;
        k0 k0Var;
        VelocityTracker velocityTracker;
        boolean z9;
        VelocityTracker velocityTracker2;
        ea eaVar;
        if (this.d != null && (q1Var = this.a) != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.w;
            float L = (rectF.left + org.telegram.messenger.g0.L(7.0f)) - this.o;
            int i7 = 0;
            while (true) {
                arrayList = this.q;
                if (i7 >= arrayList.size()) {
                    k0Var = null;
                    break;
                }
                k0Var = (k0) arrayList.get(i7);
                if (motionEvent.getX() >= L && motionEvent.getX() <= this.n + L && motionEvent.getY() >= rectF.bottom - org.telegram.messenger.g0.L(99.0f) && motionEvent.getY() < rectF.bottom) {
                    break;
                }
                L += org.telegram.messenger.g0.L(9.0f) + this.n;
                i7++;
            }
            boolean contains = this.x.contains(motionEvent.getX(), motionEvent.getY());
            ic icVar = this.y;
            if (action == 0) {
                this.E.a();
                if (!this.t) {
                    float x10 = motionEvent.getX();
                    this.C = x10;
                    if (rectF.contains(x10, motionEvent.getY())) {
                        z9 = true;
                        this.A = z9;
                        if (z9 && q1Var.getParent() != null) {
                            q1Var.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        this.B = false;
                        velocityTracker2 = this.D;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.D = null;
                        }
                        this.D = VelocityTracker.obtain();
                        if (k0Var != null) {
                            k0Var.n.c(true);
                        }
                        if (contains) {
                            icVar.c(true);
                        }
                        eaVar = this.G;
                        if (eaVar != null) {
                            org.telegram.messenger.g0.r(eaVar);
                            this.G = null;
                        }
                        this.F = k0Var;
                        if (k0Var != null) {
                            ea eaVar2 = new ea(1, this, k0Var);
                            this.G = eaVar2;
                            org.telegram.messenger.g0.i3(eaVar2, ViewConfiguration.getLongPressTimeout());
                        }
                        return this.A;
                    }
                }
                z9 = false;
                this.A = z9;
                if (z9) {
                    q1Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.B = false;
                velocityTracker2 = this.D;
                if (velocityTracker2 != null) {
                }
                this.D = VelocityTracker.obtain();
                if (k0Var != null) {
                }
                if (contains) {
                }
                eaVar = this.G;
                if (eaVar != null) {
                }
                this.F = k0Var;
                if (k0Var != null) {
                }
                return this.A;
            }
            if (action == 2) {
                VelocityTracker velocityTracker3 = this.D;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                if ((this.A && Math.abs(motionEvent.getX() - this.C) >= org.telegram.messenger.g0.e) || this.B) {
                    ea eaVar3 = this.G;
                    if (eaVar3 != null) {
                        org.telegram.messenger.g0.r(eaVar3);
                        this.G = null;
                    }
                    this.B = true;
                    this.o = Utilities.i(this.o + (this.C - motionEvent.getX()), this.p - (rectF.width() - org.telegram.messenger.g0.L(14.0f)), 0.0f);
                    q1Var.p2();
                    this.C = motionEvent.getX();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((k0) arrayList.get(i10)).n.c(false);
                    }
                    return true;
                }
            } else if (action == 1 || action == 3) {
                ea eaVar4 = this.G;
                if (eaVar4 != null) {
                    org.telegram.messenger.g0.r(eaVar4);
                    this.G = null;
                }
                VelocityTracker velocityTracker4 = this.D;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                boolean z10 = this.B;
                this.B = false;
                if (action == 1) {
                    if (z10 || k0Var == null || !k0Var.n.i) {
                        if (z10 && (velocityTracker = this.D) != null) {
                            velocityTracker.computeCurrentVelocity(500);
                            this.E.c((int) this.o, 0, (int) (-this.D.getXVelocity()), 0, -2147483647, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, 0);
                        } else if (icVar.i && q1Var.getDelegate() != null) {
                            q1Var.getDelegate().z(q1Var);
                        }
                    } else if (!k0Var.g) {
                        TLObject tLObject = k0Var.o;
                        if (q1Var.getDelegate() != null) {
                            q1Var.getDelegate().A0(q1Var, tLObject, false);
                        }
                    } else if (q1Var.getDelegate() != null) {
                        q1Var.getDelegate().i2();
                    }
                }
                icVar.c(false);
                this.A = false;
                VelocityTracker velocityTracker5 = this.D;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                    this.D = null;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((k0) arrayList.get(i11)).n.c(false);
                }
                return z10;
            }
        }
        return false;
    }

    public final void b() {
        wk0 wk0Var = this.E;
        if (wk0Var.b()) {
            float f10 = wk0Var.j;
            this.o = f10;
            this.o = Utilities.i(f10, this.p - (this.w.width() - org.telegram.messenger.g0.L(14.0f)), 0.0f);
            this.a.p2();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:123|124)|(5:129|130|131|132|49)|137|138|139|140|130|131|132|49) */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0535, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0518, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0537, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0617  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas) {
        q1 q1Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i7;
        Canvas canvas2;
        ArrayList arrayList;
        float f15;
        RectF rectF;
        float f16;
        char c10;
        int i10;
        int i11;
        int i12;
        int i13;
        float[] fArr;
        float f17;
        boolean z9;
        float[] fArr2;
        float f18;
        if (this.d == null || (q1Var = this.a) == null) {
            return;
        }
        x1 x1Var = q1Var.hb;
        b();
        float f19 = 0.0f;
        if (this.g != null) {
            canvas.save();
            float width = (q1Var.getWidth() - this.g.getWidth()) / 2.0f;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set((this.h + width) - org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(4.0f), this.i + width + org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(10.66f) + this.j);
            q1Var.u1(canvas, rectF2, org.telegram.messenger.g0.L(11.0f));
            canvas.translate(width, org.telegram.messenger.g0.L(7.33f));
            this.f.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, q1Var.Pb));
            this.g.draw(canvas);
            canvas.restore();
            f10 = org.telegram.messenger.g0.L(10.66f) + this.j + 0.0f;
        } else {
            f10 = 0.0f;
        }
        float i14 = Utilities.i(((x1Var.M2 ? d() ? x1Var.L1 : 1.0f - x1Var.L1 : d() ? 1.0f : 0.0f) - 0.3f) / 0.7f, 1.0f, 0.0f);
        if (i14 > 0.0f) {
            int width2 = q1Var.getWidth() - org.telegram.messenger.g0.L(18.0f);
            this.n = (int) (width2 > org.telegram.messenger.g0.L(441.0f) ? org.telegram.messenger.g0.L(66.0f) : Math.max((width2 / 4.5f) - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(66.0f)));
            ArrayList arrayList2 = this.q;
            this.p = ((arrayList2.size() - 1) * org.telegram.messenger.g0.L(9.0f)) + (arrayList2.size() * r4);
            int min = (int) Math.min(width2, this.n * 6.5f);
            RectF rectF3 = this.w;
            rectF3.set((q1Var.getWidth() - min) / 2.0f, org.telegram.messenger.g0.L(10.0f) + f10, (q1Var.getWidth() + min) / 2.0f, f10 + org.telegram.messenger.g0.L(138.0f));
            this.o = Utilities.i(this.o, this.p - (rectF3.width() - org.telegram.messenger.g0.L(14.0f)), 0.0f);
            float abs = Math.abs(i14 - this.m);
            Path path = this.l;
            if (abs < 0.001f) {
                f14 = 2.0f;
                i7 = 1;
                f13 = 9.0f;
                f11 = 6.0f;
                f12 = 8.0f;
            } else {
                float L = org.telegram.messenger.g0.L(16.66f) * 2.0f;
                f11 = 6.0f;
                float f20 = rectF3.bottom;
                path.rewind();
                f12 = 8.0f;
                RectF rectF4 = org.telegram.messenger.g0.P;
                f13 = 9.0f;
                float f21 = rectF3.left;
                f14 = 2.0f;
                float f22 = rectF3.top;
                i7 = 1;
                rectF4.set(f21, f22, f21 + L, f22 + L);
                path.arcTo(rectF4, -90.0f, -90.0f);
                float f23 = rectF3.left;
                float f24 = f20 - L;
                rectF4.set(f23, f24, f23 + L, f20);
                path.arcTo(rectF4, -180.0f, -90.0f);
                float f25 = rectF3.right;
                rectF4.set(f25 - L, f24, f25, f20);
                path.arcTo(rectF4, -270.0f, -90.0f);
                float f26 = rectF3.right;
                float f27 = rectF3.top;
                rectF4.set(f26 - L, f27, f26, L + f27);
                path.arcTo(rectF4, 0.0f, -90.0f);
                path.lineTo(rectF3.centerX() + org.telegram.messenger.g0.L(8.0f), rectF3.top);
                path.lineTo(rectF3.centerX(), rectF3.top - org.telegram.messenger.g0.L(6.0f));
                path.lineTo(rectF3.centerX() - org.telegram.messenger.g0.L(8.0f), rectF3.top);
                path.close();
            }
            canvas.save();
            float f28 = (i14 * 0.6f) + 0.4f;
            canvas.scale(f28, f28, rectF3.centerX(), rectF3.top - org.telegram.messenger.g0.L(f11));
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ra, q1Var.Pb);
            Paint paint = this.k;
            paint.setColor(w02);
            paint.setAlpha((int) (i14 * 255.0f));
            paint.setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, org.telegram.messenger.g0.N(0.33f), i0.a.o(-16777216, (int) (27.0f * i14)));
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            my0 my0Var = this.v;
            if (my0Var != null) {
                arrayList = arrayList2;
                my0Var.c(rectF3.left + org.telegram.messenger.g0.L(17.0f), rectF3.top + org.telegram.messenger.g0.L(20.0f), i14, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, q1Var.Pb), canvas);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                arrayList = arrayList2;
            }
            float d = this.u.d(this.t);
            float L2 = (rectF3.left + org.telegram.messenger.g0.L(7.0f)) - this.o;
            float L3 = org.telegram.messenger.g0.L(f13) + this.n;
            int floor = (int) Math.floor(((rectF3.left - min) - L2) / L3);
            int ceil = (int) Math.ceil((rectF3.right - L2) / L3);
            int i15 = 0;
            if (d < 1.0f) {
                int max = Math.max(0, floor);
                while (max < Math.min(ceil + 1, arrayList.size())) {
                    k0 k0Var = (k0) arrayList.get(max);
                    canvas2.save();
                    int i16 = i15;
                    canvas2.translate((max * L3) + L2, rectF3.bottom - org.telegram.messenger.g0.L(99.0f));
                    int i17 = this.n;
                    float f29 = (1.0f - d) * i14;
                    org.telegram.ui.Components.w8[] w8VarArr = k0Var.b;
                    boolean z10 = k0Var.g;
                    Drawable drawable = k0Var.h;
                    float f30 = f19;
                    ImageReceiver[] imageReceiverArr = k0Var.c;
                    float f31 = L3;
                    q1 q1Var2 = k0Var.a;
                    int i18 = floor;
                    ic icVar = k0Var.n;
                    int i19 = ceil;
                    my0 my0Var2 = k0Var.k;
                    Paint paint2 = k0Var.j;
                    canvas2.save();
                    int i20 = max;
                    float a10 = icVar.a(0.075f);
                    float f32 = i17;
                    float f33 = f32 / f14;
                    canvas2.scale(a10, a10, f33, org.telegram.messenger.g0.L(99.0f) / f14);
                    Paint paint3 = k0Var.i;
                    paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.66f));
                    paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ra, q1Var2.Pb));
                    int length = imageReceiverArr.length - 1;
                    while (length >= 0) {
                        int i21 = length;
                        float length2 = (f33 - (((imageReceiverArr.length - 1) * org.telegram.messenger.g0.L(7.0f)) / f14)) + (org.telegram.messenger.g0.L(7.0f) * i21);
                        float L4 = (org.telegram.messenger.g0.L(54.0f) / f14) + org.telegram.messenger.g0.L(10.0f);
                        ArrayList arrayList3 = arrayList;
                        RectF rectF5 = rectF3;
                        if (imageReceiverArr.length > i7) {
                            canvas2.drawCircle(length2, L4, org.telegram.messenger.g0.L(54.0f) / f14, paint3);
                        }
                        imageReceiverArr[i21].y0(length2 - (org.telegram.messenger.g0.L(54.0f) / f14), L4 - (org.telegram.messenger.g0.L(54.0f) / f14), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(54.0f));
                        imageReceiverArr[i21].setAlpha(f29);
                        imageReceiverArr[i21].h(canvas2, null);
                        length = i21 - 1;
                        arrayList = arrayList3;
                        rectF3 = rectF5;
                        q1Var = q1Var;
                        i7 = 1;
                    }
                    q1 q1Var3 = q1Var;
                    RectF rectF6 = rectF3;
                    ArrayList arrayList4 = arrayList;
                    if (my0Var2 != null) {
                        my0Var2.p = i17 - org.telegram.messenger.g0.L(32.0f);
                        float k10 = my0Var2.k() + org.telegram.messenger.g0.L(drawable != null ? 17.0f : f12);
                        float L5 = org.telegram.messenger.g0.L(1.0f) + org.telegram.messenger.g0.L(54.0f) + org.telegram.messenger.g0.L(10.0f);
                        f16 = 32.0f;
                        i10 = 2;
                        org.telegram.messenger.g0.P.set((f32 - k10) / f14, L5 - org.telegram.messenger.g0.L(14.33f), (f32 + k10) / f14, L5);
                        boolean z11 = k0Var.m;
                        if (z11 || !z10) {
                            if (!z11) {
                                Drawable drawable2 = imageReceiverArr[i16].m0;
                                if (drawable2 instanceof BitmapDrawable) {
                                    Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                                    try {
                                        int pixel = bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 2);
                                        fArr2 = new float[3];
                                        i0.a.c(Color.red(pixel), Color.green(pixel), Color.blue(pixel), fArr2);
                                        f18 = fArr2[1];
                                    } catch (Exception e10) {
                                        z9 = true;
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    if (f18 > 0.05f && f18 < 0.95f) {
                                        float f34 = fArr2[2];
                                        if (f34 > 0.02f && f34 < 0.98f) {
                                            fArr2[1] = 0.25f;
                                            fArr2[2] = org.telegram.ui.ActionBar.k6.I.q() ? 0.35f : 0.65f;
                                            paint2.setColor(i0.a.a(fArr2));
                                            z9 = true;
                                            k0Var.m = z9;
                                        }
                                    }
                                    fArr2[1] = f30;
                                    fArr2[2] = org.telegram.ui.ActionBar.k6.I.q() ? 0.38f : 0.7f;
                                    paint2.setColor(i0.a.a(fArr2));
                                    z9 = true;
                                    k0Var.m = z9;
                                }
                            }
                            if (!z11 && !k0Var.l) {
                                try {
                                    int f35 = i0.a.f(0.5f, w8VarArr[i16].b(), w8VarArr[i16].c());
                                    fArr = new float[3];
                                    i0.a.c(Color.red(f35), Color.green(f35), Color.blue(f35), fArr);
                                    f17 = fArr[1];
                                } catch (Exception e11) {
                                    e = e11;
                                    c10 = 39322;
                                }
                                if (f17 > 0.05f && f17 < 0.95f) {
                                    fArr[1] = Utilities.i(f17 - 0.06f, 0.4f, f30);
                                    fArr[2] = Utilities.i(fArr[2] - 0.08f, 0.5f, 0.2f);
                                    c10 = 39322;
                                    paint2.setColor(i0.a.a(fArr));
                                    boolean z12 = true;
                                    k0Var.l = z12;
                                    RectF rectF7 = org.telegram.messenger.g0.P;
                                    canvas2.drawRoundRect(rectF7, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), paint2);
                                    rectF7.inset((-org.telegram.messenger.g0.L(1.0f)) / f14, (-org.telegram.messenger.g0.L(1.0f)) / f14);
                                    paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                                    canvas2.drawRoundRect(rectF7, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), paint3);
                                }
                                c10 = 39322;
                                fArr[2] = Utilities.i(fArr[2] - 0.1f, 0.6f, 0.3f);
                                paint2.setColor(i0.a.a(fArr));
                                boolean z122 = true;
                                k0Var.l = z122;
                                RectF rectF72 = org.telegram.messenger.g0.P;
                                canvas2.drawRoundRect(rectF72, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), paint2);
                                rectF72.inset((-org.telegram.messenger.g0.L(1.0f)) / f14, (-org.telegram.messenger.g0.L(1.0f)) / f14);
                                paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                                canvas2.drawRoundRect(rectF72, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), paint3);
                            }
                        } else {
                            paint2.setColor(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ra, q1Var2.Pb), org.telegram.ui.ActionBar.k6.r1(0.85f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, q1Var2.Pb))));
                            k0Var.m = true;
                        }
                        c10 = 39322;
                        RectF rectF722 = org.telegram.messenger.g0.P;
                        canvas2.drawRoundRect(rectF722, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), paint2);
                        rectF722.inset((-org.telegram.messenger.g0.L(1.0f)) / f14, (-org.telegram.messenger.g0.L(1.0f)) / f14);
                        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
                        canvas2.drawRoundRect(rectF722, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), paint3);
                    } else {
                        f16 = 32.0f;
                        c10 = 39322;
                        i10 = 2;
                    }
                    canvas2.restore();
                    int i22 = this.n;
                    TextPaint textPaint = k0Var.d;
                    canvas2.save();
                    float a11 = icVar.a(0.075f);
                    float f36 = i22;
                    canvas2.scale(a11, a11, f36 / f14, org.telegram.messenger.g0.L(99.0f) / f14);
                    StaticLayout staticLayout = k0Var.f;
                    if (staticLayout != null || staticLayout.getWidth() != i22) {
                        CharSequence charSequence = k0Var.e;
                        k0Var.f = StaticLayout.Builder.obtain(charSequence, i16, charSequence.length(), textPaint, i22).setMaxLines(i10).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(i16).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
                    }
                    if (k0Var.f == null) {
                        canvas2.save();
                        canvas2.translate((i22 - k0Var.f.getWidth()) / f14, org.telegram.messenger.g0.L(66.33f));
                        i11 = 1;
                        if (imageReceiverArr.length <= 1) {
                            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, q1Var2.Pb));
                        } else {
                            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, q1Var2.Pb));
                        }
                        textPaint.setAlpha((int) (textPaint.getAlpha() * f29));
                        k0Var.f.draw(canvas2);
                        canvas2.restore();
                    } else {
                        i11 = 1;
                    }
                    if (my0Var2 == null) {
                        my0Var2.p = i22 - org.telegram.messenger.g0.L(f16);
                        float k11 = (f36 - (my0Var2.k() + org.telegram.messenger.g0.L(drawable != null ? 17.0f : f12))) / f14;
                        float L6 = org.telegram.messenger.g0.L(54.0f) + org.telegram.messenger.g0.L(4.165f);
                        if (drawable != null) {
                            drawable.setBounds((int) ((z10 ? my0Var2.k() + org.telegram.messenger.g0.L(1.33f) : 0.0f) + k11 + org.telegram.messenger.g0.L(3.0f)), (int) org.telegram.messenger.camera.q.v(drawable.getIntrinsicHeight(), f14, 0.625f, L6), (int) ((drawable.getIntrinsicWidth() * 0.625f) + (z10 ? org.telegram.messenger.g0.L(1.33f) + my0Var2.k() : 0.0f) + k11 + org.telegram.messenger.g0.L(3.0f)), (int) com.google.android.recaptcha.internal.a.c(drawable.getIntrinsicHeight(), 2.0f, 0.625f, L6));
                            drawable.draw(canvas2);
                        }
                        float L7 = org.telegram.messenger.g0.L(!z10 ? 12.66f : 4.0f) + k11;
                        Canvas canvas3 = canvas2;
                        i12 = i18;
                        i13 = i19;
                        k0Var.k.c(L7, L6, f29, -1, canvas3);
                        canvas2 = canvas3;
                    } else {
                        i12 = i18;
                        i13 = i19;
                    }
                    canvas2.restore();
                    canvas2.restore();
                    max = i20 + 1;
                    floor = i12;
                    ceil = i13;
                    i7 = i11;
                    L3 = f31;
                    arrayList = arrayList4;
                    rectF3 = rectF6;
                    f19 = 0.0f;
                    i15 = 0;
                    f14 = 2.0f;
                    q1Var = q1Var3;
                }
                f15 = 0.02f;
            } else {
                f15 = 0.02f;
            }
            float f37 = L3;
            int i23 = floor;
            int i24 = ceil;
            q1 q1Var4 = q1Var;
            RectF rectF8 = rectF3;
            if (d > 0.0f) {
                Path path2 = this.r;
                path2.rewind();
                for (int max2 = Math.max(0, i23); max2 < i24; max2++) {
                    float f38 = (max2 * f37) + L2;
                    float f39 = this.n;
                    Path.Direction direction = Path.Direction.CW;
                    path2.addCircle((f39 / 2.0f) + f38, (org.telegram.messenger.g0.L(54.0f) / 2.0f) + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(54.0f) / 2.0f, direction);
                    float f40 = f39 * 0.4f;
                    RectF rectF9 = org.telegram.messenger.g0.P;
                    rectF9.set(com.google.android.recaptcha.internal.a.A(f39, f40, 2.0f, f38), org.telegram.messenger.g0.L(69.0f), org.telegram.messenger.k5.a(f39, f40, 2.0f, f38), org.telegram.messenger.g0.L(79.0f));
                    path2.addRoundRect(rectF9, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), direction);
                    float f41 = f39 * 0.35f;
                    rectF9.set(com.google.android.recaptcha.internal.a.A(f39, f41, 2.0f, f38), org.telegram.messenger.g0.L(83.0f), org.telegram.messenger.k5.a(f39, f41, 2.0f, f38), org.telegram.messenger.g0.L(91.0f));
                    path2.addRoundRect(rectF9, org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.L(2.5f), direction);
                }
                if (this.s == null) {
                    a80 a80Var = new a80();
                    this.s = a80Var;
                    a80Var.y = path2;
                    a80Var.D = false;
                }
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, q1Var4.Pb);
                this.s.g(org.telegram.ui.ActionBar.k6.r1(0.05f, w03), org.telegram.ui.ActionBar.k6.r1(0.15f, w03), org.telegram.ui.ActionBar.k6.r1(0.1f, w03), org.telegram.ui.ActionBar.k6.r1(0.3f, w03));
                a80 a80Var2 = this.s;
                a80Var2.t = 1.5f;
                a80Var2.setAlpha((int) (d * 255.0f));
                canvas2.save();
                rectF = rectF8;
                canvas2.translate(0.0f, rectF.bottom - org.telegram.messenger.g0.L(99.0f));
                this.s.draw(canvas2);
                canvas2.restore();
            } else {
                rectF = rectF8;
            }
            float a12 = this.y.a(f15);
            float L8 = rectF.right - org.telegram.messenger.g0.L(20.0f);
            float L9 = rectF.top + org.telegram.messenger.g0.L(20.0f);
            canvas2.save();
            canvas2.scale(a12, a12, L8, L9);
            float L10 = org.telegram.messenger.g0.L(1.33f);
            Paint paint4 = this.z;
            paint4.setStrokeWidth(L10);
            canvas2.drawLine(L8 - org.telegram.messenger.g0.L(4.0f), L9 - org.telegram.messenger.g0.L(4.0f), L8 + org.telegram.messenger.g0.L(4.0f), L9 + org.telegram.messenger.g0.L(4.0f), paint4);
            canvas.drawLine(L8 - org.telegram.messenger.g0.L(4.0f), L9 + org.telegram.messenger.g0.L(4.0f), L8 + org.telegram.messenger.g0.L(4.0f), L9 - org.telegram.messenger.g0.L(4.0f), paint4);
            this.x.set(L8 - org.telegram.messenger.g0.L(12.0f), L9 - org.telegram.messenger.g0.L(12.0f), L8 + org.telegram.messenger.g0.L(12.0f), L9 + org.telegram.messenger.g0.L(12.0f));
            canvas.restore();
            canvas.restore();
        }
    }

    public final boolean d() {
        return this.d.g1 && this.q.size() > 0;
    }

    public final void e(ij ijVar) {
        ArrayList arrayList;
        int i7;
        int i10;
        ArrayList arrayList2;
        this.b = ijVar.I1;
        this.d = ijVar;
        this.c = ij.B0(ijVar.k);
        qp.s1(this.b).M0(Long.valueOf(-this.c));
        this.e = -this.c;
        Typeface o4 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.f;
        textPaint.setTypeface(o4);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        int i11 = org.telegram.ui.ActionBar.k6.Wc;
        q1 q1Var = this.a;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i11, q1Var.Pb));
        this.g = new StaticLayout(id.M0(2131752391, null), textPaint, this.d.m1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = r0.getWidth();
        this.i = 0.0f;
        for (int i12 = 0; i12 < this.g.getLineCount(); i12++) {
            this.h = Math.min(this.h, this.g.getLineLeft(i12));
            this.i = Math.max(this.i, this.g.getLineRight(i12));
        }
        this.j = this.g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W5, q1Var.Pb));
        q1Var.u0 = org.telegram.messenger.g0.L(14.66f) + this.j;
        int i13 = 0;
        while (true) {
            arrayList = this.q;
            if (i13 >= arrayList.size()) {
                break;
            }
            k0 k0Var = (k0) arrayList.get(i13);
            int i14 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = k0Var.c;
                if (i14 < imageReceiverArr.length) {
                    imageReceiverArr[i14].R();
                    i14++;
                }
            }
            i13++;
        }
        arrayList.clear();
        ro L0 = qp.s1(this.b).L0(this.c);
        ArrayList arrayList3 = (L0 == null || (arrayList2 = L0.b) == null) ? new ArrayList() : new ArrayList(arrayList2);
        int i15 = 0;
        while (i15 < arrayList3.size()) {
            TLObject tLObject = (TLObject) arrayList3.get(i15);
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.t3.r0((TLRPC.Chat) tLObject)) {
                arrayList3.remove(i15);
                i15--;
            }
            i15++;
        }
        boolean z9 = arrayList3.isEmpty() || (!p10.i(this.b).q() && arrayList3.size() == 1);
        this.t = z9;
        if (!z9) {
            int size = arrayList3.size();
            if (!p10.i(this.b).q() && L0.c > 0) {
                size = Math.min(size - 1, qp.s1(this.b).w4);
            }
            int min = Math.min(size, 10);
            for (int i16 = 0; i16 < min; i16++) {
                arrayList.add(new k0(q1Var, (TLObject) arrayList3.get(i16)));
            }
            if (min < arrayList3.size()) {
                arrayList.add(new k0(q1Var, new TLObject[]{(min < 0 || min >= arrayList3.size()) ? null : (TLObject) arrayList3.get(min), (min < 0 || (i10 = min + 1) >= arrayList3.size()) ? null : (TLObject) arrayList3.get(i10), (min < 0 || (i7 = min + 2) >= arrayList3.size()) ? null : (TLObject) arrayList3.get(i7)}, (arrayList3.size() + L0.c) - min));
            }
        }
        if (this.v == null) {
            my0 my0Var = new my0(id.M0(this.c > 0 ? 2131745322 : 2131745320, null), 14.0f, org.telegram.messenger.g0.o());
            my0Var.o = true;
            this.v = my0Var;
        }
        if (d()) {
            q1Var.u0 = org.telegram.messenger.g0.L(144.0f) + q1Var.u0;
            this.k.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ra, q1Var.Pb));
        }
        float size2 = ((arrayList.size() - 1) * org.telegram.messenger.g0.L(9.0f)) + (arrayList.size() * this.n);
        this.p = size2;
        this.o = Utilities.i(this.o, size2, 0.0f);
    }
}
