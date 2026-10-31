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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.wo;
import org.telegram.messenger.z20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final zl0 E;
    public k0 F;
    public ea G;
    public final q1 a;
    public int b;
    public long c;
    public jj d;
    public long e;
    public StaticLayout g;
    public float h;
    public float i;
    public int j;
    public float o;
    public float p;
    public t80 s;
    public final org.telegram.ui.Components.t5 u;
    public qz0 v;
    public final dc y;
    public final TextPaint f = new TextPaint(1);
    public final Paint k = new Paint(1);
    public final Path l = new Path();
    public final float m = -1.0f;
    public int n = org.telegram.messenger.i0.L(66.0f);
    public final ArrayList q = new ArrayList();
    public final Path r = new Path();
    public final RectF w = new RectF();
    public final RectF x = new RectF();
    public final Paint z = new Paint(1);
    public boolean t = true;

    public l0(q1 q1Var) {
        this.a = q1Var;
        this.E = new zl0(q1Var.getContext(), null);
        this.y = new dc(q1Var);
        this.u = new org.telegram.ui.Components.t5(q1Var, 350L, gr.h);
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
        boolean z10;
        VelocityTracker velocityTracker2;
        ea eaVar;
        if (this.d != null && (q1Var = this.a) != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.w;
            float L = (rectF.left + org.telegram.messenger.i0.L(7.0f)) - this.o;
            int i10 = 0;
            while (true) {
                arrayList = this.q;
                if (i10 >= arrayList.size()) {
                    k0Var = null;
                    break;
                }
                k0Var = (k0) arrayList.get(i10);
                if (motionEvent.getX() >= L && motionEvent.getX() <= this.n + L && motionEvent.getY() >= rectF.bottom - org.telegram.messenger.i0.L(99.0f) && motionEvent.getY() < rectF.bottom) {
                    break;
                }
                L += org.telegram.messenger.i0.L(9.0f) + this.n;
                i10++;
            }
            boolean contains = this.x.contains(motionEvent.getX(), motionEvent.getY());
            dc dcVar = this.y;
            if (action == 0) {
                this.E.a();
                if (!this.t) {
                    float x10 = motionEvent.getX();
                    this.C = x10;
                    if (rectF.contains(x10, motionEvent.getY())) {
                        z10 = true;
                        this.A = z10;
                        if (z10 && q1Var.getParent() != null) {
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
                            dcVar.c(true);
                        }
                        eaVar = this.G;
                        if (eaVar != null) {
                            org.telegram.messenger.i0.r(eaVar);
                            this.G = null;
                        }
                        this.F = k0Var;
                        if (k0Var != null) {
                            ea eaVar2 = new ea(1, this, k0Var);
                            this.G = eaVar2;
                            org.telegram.messenger.i0.h3(eaVar2, ViewConfiguration.getLongPressTimeout());
                        }
                        return this.A;
                    }
                }
                z10 = false;
                this.A = z10;
                if (z10) {
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
                if ((this.A && Math.abs(motionEvent.getX() - this.C) >= org.telegram.messenger.i0.e) || this.B) {
                    ea eaVar3 = this.G;
                    if (eaVar3 != null) {
                        org.telegram.messenger.i0.r(eaVar3);
                        this.G = null;
                    }
                    this.B = true;
                    this.o = Utilities.i(this.o + (this.C - motionEvent.getX()), this.p - (rectF.width() - org.telegram.messenger.i0.L(14.0f)), 0.0f);
                    q1Var.n2();
                    this.C = motionEvent.getX();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((k0) arrayList.get(i11)).n.c(false);
                    }
                    return true;
                }
            } else if (action == 1 || action == 3) {
                ea eaVar4 = this.G;
                if (eaVar4 != null) {
                    org.telegram.messenger.i0.r(eaVar4);
                    this.G = null;
                }
                VelocityTracker velocityTracker4 = this.D;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                boolean z11 = this.B;
                this.B = false;
                if (action == 1) {
                    if (z11 || k0Var == null || !k0Var.n.i) {
                        if (z11 && (velocityTracker = this.D) != null) {
                            velocityTracker.computeCurrentVelocity(500);
                            this.E.c((int) this.o, 0, (int) (-this.D.getXVelocity()), 0, -2147483647, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, 0);
                        } else if (dcVar.i && q1Var.getDelegate() != null) {
                            q1Var.getDelegate().z(q1Var);
                        }
                    } else if (!k0Var.g) {
                        TLObject tLObject = k0Var.o;
                        if (q1Var.getDelegate() != null) {
                            q1Var.getDelegate().z0(q1Var, tLObject, false);
                        }
                    } else if (q1Var.getDelegate() != null) {
                        q1Var.getDelegate().e2();
                    }
                }
                dcVar.c(false);
                this.A = false;
                VelocityTracker velocityTracker5 = this.D;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                    this.D = null;
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ((k0) arrayList.get(i12)).n.c(false);
                }
                return z11;
            }
        }
        return false;
    }

    public final void b() {
        zl0 zl0Var = this.E;
        if (zl0Var.b()) {
            float f7 = zl0Var.j;
            this.o = f7;
            this.o = Utilities.i(f7, this.p - (this.w.width() - org.telegram.messenger.i0.L(14.0f)), 0.0f);
            this.a.n2();
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
    
        org.telegram.messenger.f8.g(r0, true);
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
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        Canvas canvas2;
        ArrayList arrayList;
        float f14;
        RectF rectF;
        float f15;
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        float[] fArr;
        float f16;
        boolean z10;
        float[] fArr2;
        float f17;
        if (this.d == null || (q1Var = this.a) == null) {
            return;
        }
        x1 x1Var = q1Var.gb;
        b();
        float f18 = 0.0f;
        if (this.g != null) {
            canvas.save();
            float width = (q1Var.getWidth() - this.g.getWidth()) / 2.0f;
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set((this.h + width) - org.telegram.messenger.i0.L(8.66f), org.telegram.messenger.i0.L(4.0f), this.i + width + org.telegram.messenger.i0.L(8.66f), org.telegram.messenger.i0.L(10.66f) + this.j);
            q1Var.s1(canvas, rectF2, org.telegram.messenger.i0.L(11.0f));
            canvas.translate(width, org.telegram.messenger.i0.L(7.33f));
            this.f.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, q1Var.Ob));
            this.g.draw(canvas);
            canvas.restore();
            f7 = org.telegram.messenger.i0.L(10.66f) + this.j + 0.0f;
        } else {
            f7 = 0.0f;
        }
        float i15 = Utilities.i(((x1Var.M2 ? d() ? x1Var.L1 : 1.0f - x1Var.L1 : d() ? 1.0f : 0.0f) - 0.3f) / 0.7f, 1.0f, 0.0f);
        if (i15 > 0.0f) {
            int width2 = q1Var.getWidth() - org.telegram.messenger.i0.L(18.0f);
            this.n = (int) (width2 > org.telegram.messenger.i0.L(441.0f) ? org.telegram.messenger.i0.L(66.0f) : Math.max((width2 / 4.5f) - org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(66.0f)));
            ArrayList arrayList2 = this.q;
            this.p = ((arrayList2.size() - 1) * org.telegram.messenger.i0.L(9.0f)) + (arrayList2.size() * r4);
            int min = (int) Math.min(width2, this.n * 6.5f);
            RectF rectF3 = this.w;
            rectF3.set((q1Var.getWidth() - min) / 2.0f, org.telegram.messenger.i0.L(10.0f) + f7, (q1Var.getWidth() + min) / 2.0f, f7 + org.telegram.messenger.i0.L(138.0f));
            this.o = Utilities.i(this.o, this.p - (rectF3.width() - org.telegram.messenger.i0.L(14.0f)), 0.0f);
            float abs = Math.abs(i15 - this.m);
            Path path = this.l;
            if (abs < 0.001f) {
                f13 = 2.0f;
                i10 = 1;
                f12 = 9.0f;
                f10 = 6.0f;
                f11 = 8.0f;
            } else {
                float L = org.telegram.messenger.i0.L(16.66f) * 2.0f;
                f10 = 6.0f;
                float f19 = rectF3.bottom;
                path.rewind();
                f11 = 8.0f;
                RectF rectF4 = org.telegram.messenger.i0.P;
                f12 = 9.0f;
                float f20 = rectF3.left;
                f13 = 2.0f;
                float f21 = rectF3.top;
                i10 = 1;
                rectF4.set(f20, f21, f20 + L, f21 + L);
                path.arcTo(rectF4, -90.0f, -90.0f);
                float f22 = rectF3.left;
                float f23 = f19 - L;
                rectF4.set(f22, f23, f22 + L, f19);
                path.arcTo(rectF4, -180.0f, -90.0f);
                float f24 = rectF3.right;
                rectF4.set(f24 - L, f23, f24, f19);
                path.arcTo(rectF4, -270.0f, -90.0f);
                float f25 = rectF3.right;
                float f26 = rectF3.top;
                rectF4.set(f25 - L, f26, f25, L + f26);
                path.arcTo(rectF4, 0.0f, -90.0f);
                path.lineTo(rectF3.centerX() + org.telegram.messenger.i0.L(8.0f), rectF3.top);
                path.lineTo(rectF3.centerX(), rectF3.top - org.telegram.messenger.i0.L(6.0f));
                path.lineTo(rectF3.centerX() - org.telegram.messenger.i0.L(8.0f), rectF3.top);
                path.close();
            }
            canvas.save();
            float f27 = (i15 * 0.6f) + 0.4f;
            canvas.scale(f27, f27, rectF3.centerX(), rectF3.top - org.telegram.messenger.i0.L(f10));
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ra, q1Var.Ob);
            Paint paint = this.k;
            paint.setColor(w02);
            paint.setAlpha((int) (i15 * 255.0f));
            paint.setShadowLayer(org.telegram.messenger.i0.N(1.0f), 0.0f, org.telegram.messenger.i0.N(0.33f), i0.b.o(-16777216, (int) (27.0f * i15)));
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            qz0 qz0Var = this.v;
            if (qz0Var != null) {
                arrayList = arrayList2;
                qz0Var.c(rectF3.left + org.telegram.messenger.i0.L(17.0f), rectF3.top + org.telegram.messenger.i0.L(20.0f), i15, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, q1Var.Ob), canvas);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                arrayList = arrayList2;
            }
            float d = this.u.d(this.t);
            float L2 = (rectF3.left + org.telegram.messenger.i0.L(7.0f)) - this.o;
            float L3 = org.telegram.messenger.i0.L(f12) + this.n;
            int floor = (int) Math.floor(((rectF3.left - min) - L2) / L3);
            int ceil = (int) Math.ceil((rectF3.right - L2) / L3);
            int i16 = 0;
            if (d < 1.0f) {
                int max = Math.max(0, floor);
                while (max < Math.min(ceil + 1, arrayList.size())) {
                    k0 k0Var = (k0) arrayList.get(max);
                    canvas2.save();
                    int i17 = i16;
                    canvas2.translate((max * L3) + L2, rectF3.bottom - org.telegram.messenger.i0.L(99.0f));
                    int i18 = this.n;
                    float f28 = (1.0f - d) * i15;
                    org.telegram.ui.Components.r8[] r8VarArr = k0Var.b;
                    boolean z11 = k0Var.g;
                    Drawable drawable = k0Var.h;
                    float f29 = f18;
                    ImageReceiver[] imageReceiverArr = k0Var.c;
                    float f30 = L3;
                    q1 q1Var2 = k0Var.a;
                    int i19 = floor;
                    dc dcVar = k0Var.n;
                    int i20 = ceil;
                    qz0 qz0Var2 = k0Var.k;
                    Paint paint2 = k0Var.j;
                    canvas2.save();
                    int i21 = max;
                    float a2 = dcVar.a(0.075f);
                    float f31 = i18;
                    float f32 = f31 / f13;
                    canvas2.scale(a2, a2, f32, org.telegram.messenger.i0.L(99.0f) / f13);
                    Paint paint3 = k0Var.i;
                    paint3.setStrokeWidth(org.telegram.messenger.i0.L(2.66f));
                    paint3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ra, q1Var2.Ob));
                    int length = imageReceiverArr.length - 1;
                    while (length >= 0) {
                        int i22 = length;
                        float length2 = (f32 - (((imageReceiverArr.length - 1) * org.telegram.messenger.i0.L(7.0f)) / f13)) + (org.telegram.messenger.i0.L(7.0f) * i22);
                        float L4 = (org.telegram.messenger.i0.L(54.0f) / f13) + org.telegram.messenger.i0.L(10.0f);
                        ArrayList arrayList3 = arrayList;
                        RectF rectF5 = rectF3;
                        if (imageReceiverArr.length > i10) {
                            canvas2.drawCircle(length2, L4, org.telegram.messenger.i0.L(54.0f) / f13, paint3);
                        }
                        imageReceiverArr[i22].y0(length2 - (org.telegram.messenger.i0.L(54.0f) / f13), L4 - (org.telegram.messenger.i0.L(54.0f) / f13), org.telegram.messenger.i0.L(54.0f), org.telegram.messenger.i0.L(54.0f));
                        imageReceiverArr[i22].setAlpha(f28);
                        imageReceiverArr[i22].h(canvas2, null);
                        length = i22 - 1;
                        arrayList = arrayList3;
                        rectF3 = rectF5;
                        q1Var = q1Var;
                        i10 = 1;
                    }
                    q1 q1Var3 = q1Var;
                    RectF rectF6 = rectF3;
                    ArrayList arrayList4 = arrayList;
                    if (qz0Var2 != null) {
                        qz0Var2.p = i18 - org.telegram.messenger.i0.L(32.0f);
                        float k10 = qz0Var2.k() + org.telegram.messenger.i0.L(drawable != null ? 17.0f : f11);
                        float L5 = org.telegram.messenger.i0.L(1.0f) + org.telegram.messenger.i0.L(54.0f) + org.telegram.messenger.i0.L(10.0f);
                        f15 = 32.0f;
                        i11 = 2;
                        org.telegram.messenger.i0.P.set((f31 - k10) / f13, L5 - org.telegram.messenger.i0.L(14.33f), (f31 + k10) / f13, L5);
                        boolean z12 = k0Var.m;
                        if (z12 || !z11) {
                            if (!z12) {
                                Drawable drawable2 = imageReceiverArr[i17].m0;
                                if (drawable2 instanceof BitmapDrawable) {
                                    Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                                    try {
                                        int pixel = bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 2);
                                        fArr2 = new float[3];
                                        i0.b.c(Color.red(pixel), Color.green(pixel), Color.blue(pixel), fArr2);
                                        f17 = fArr2[1];
                                    } catch (Exception e) {
                                        z10 = true;
                                        org.telegram.messenger.f8.g(e, true);
                                    }
                                    if (f17 > 0.05f && f17 < 0.95f) {
                                        float f33 = fArr2[2];
                                        if (f33 > 0.02f && f33 < 0.98f) {
                                            fArr2[1] = 0.25f;
                                            fArr2[2] = org.telegram.ui.ActionBar.t6.I.q() ? 0.35f : 0.65f;
                                            paint2.setColor(i0.b.a(fArr2));
                                            z10 = true;
                                            k0Var.m = z10;
                                        }
                                    }
                                    fArr2[1] = f29;
                                    fArr2[2] = org.telegram.ui.ActionBar.t6.I.q() ? 0.38f : 0.7f;
                                    paint2.setColor(i0.b.a(fArr2));
                                    z10 = true;
                                    k0Var.m = z10;
                                }
                            }
                            if (!z12 && !k0Var.l) {
                                try {
                                    int f34 = i0.b.f(0.5f, r8VarArr[i17].b(), r8VarArr[i17].c());
                                    fArr = new float[3];
                                    i0.b.c(Color.red(f34), Color.green(f34), Color.blue(f34), fArr);
                                    f16 = fArr[1];
                                } catch (Exception e7) {
                                    e = e7;
                                    c10 = 39322;
                                }
                                if (f16 > 0.05f && f16 < 0.95f) {
                                    fArr[1] = Utilities.i(f16 - 0.06f, 0.4f, f29);
                                    fArr[2] = Utilities.i(fArr[2] - 0.08f, 0.5f, 0.2f);
                                    c10 = 39322;
                                    paint2.setColor(i0.b.a(fArr));
                                    boolean z13 = true;
                                    k0Var.l = z13;
                                    RectF rectF7 = org.telegram.messenger.i0.P;
                                    canvas2.drawRoundRect(rectF7, org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f11), paint2);
                                    rectF7.inset((-org.telegram.messenger.i0.L(1.0f)) / f13, (-org.telegram.messenger.i0.L(1.0f)) / f13);
                                    paint3.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
                                    canvas2.drawRoundRect(rectF7, org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f11), paint3);
                                }
                                c10 = 39322;
                                fArr[2] = Utilities.i(fArr[2] - 0.1f, 0.6f, 0.3f);
                                paint2.setColor(i0.b.a(fArr));
                                boolean z132 = true;
                                k0Var.l = z132;
                                RectF rectF72 = org.telegram.messenger.i0.P;
                                canvas2.drawRoundRect(rectF72, org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f11), paint2);
                                rectF72.inset((-org.telegram.messenger.i0.L(1.0f)) / f13, (-org.telegram.messenger.i0.L(1.0f)) / f13);
                                paint3.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
                                canvas2.drawRoundRect(rectF72, org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f11), paint3);
                            }
                        } else {
                            paint2.setColor(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ra, q1Var2.Ob), org.telegram.ui.ActionBar.t6.r1(0.85f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, q1Var2.Ob))));
                            k0Var.m = true;
                        }
                        c10 = 39322;
                        RectF rectF722 = org.telegram.messenger.i0.P;
                        canvas2.drawRoundRect(rectF722, org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f11), paint2);
                        rectF722.inset((-org.telegram.messenger.i0.L(1.0f)) / f13, (-org.telegram.messenger.i0.L(1.0f)) / f13);
                        paint3.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
                        canvas2.drawRoundRect(rectF722, org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f11), paint3);
                    } else {
                        f15 = 32.0f;
                        c10 = 39322;
                        i11 = 2;
                    }
                    canvas2.restore();
                    int i23 = this.n;
                    TextPaint textPaint = k0Var.d;
                    canvas2.save();
                    float a10 = dcVar.a(0.075f);
                    float f35 = i23;
                    canvas2.scale(a10, a10, f35 / f13, org.telegram.messenger.i0.L(99.0f) / f13);
                    StaticLayout staticLayout = k0Var.f;
                    if (staticLayout != null || staticLayout.getWidth() != i23) {
                        CharSequence charSequence = k0Var.e;
                        k0Var.f = StaticLayout.Builder.obtain(charSequence, i17, charSequence.length(), textPaint, i23).setMaxLines(i11).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(i17).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
                    }
                    if (k0Var.f == null) {
                        canvas2.save();
                        canvas2.translate((i23 - k0Var.f.getWidth()) / f13, org.telegram.messenger.i0.L(66.33f));
                        i12 = 1;
                        if (imageReceiverArr.length <= 1) {
                            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Sc, q1Var2.Ob));
                        } else {
                            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, q1Var2.Ob));
                        }
                        textPaint.setAlpha((int) (textPaint.getAlpha() * f28));
                        k0Var.f.draw(canvas2);
                        canvas2.restore();
                    } else {
                        i12 = 1;
                    }
                    if (qz0Var2 == null) {
                        qz0Var2.p = i23 - org.telegram.messenger.i0.L(f15);
                        float k11 = (f35 - (qz0Var2.k() + org.telegram.messenger.i0.L(drawable != null ? 17.0f : f11))) / f13;
                        float L6 = org.telegram.messenger.i0.L(54.0f) + org.telegram.messenger.i0.L(4.165f);
                        if (drawable != null) {
                            drawable.setBounds((int) ((z11 ? qz0Var2.k() + org.telegram.messenger.i0.L(1.33f) : 0.0f) + k11 + org.telegram.messenger.i0.L(3.0f)), (int) z20.v(drawable.getIntrinsicHeight(), f13, 0.625f, L6), (int) ((drawable.getIntrinsicWidth() * 0.625f) + (z11 ? org.telegram.messenger.i0.L(1.33f) + qz0Var2.k() : 0.0f) + k11 + org.telegram.messenger.i0.L(3.0f)), (int) a1.g.c(drawable.getIntrinsicHeight(), 2.0f, 0.625f, L6));
                            drawable.draw(canvas2);
                        }
                        float L7 = org.telegram.messenger.i0.L(!z11 ? 12.66f : 4.0f) + k11;
                        Canvas canvas3 = canvas2;
                        i13 = i19;
                        i14 = i20;
                        k0Var.k.c(L7, L6, f28, -1, canvas3);
                        canvas2 = canvas3;
                    } else {
                        i13 = i19;
                        i14 = i20;
                    }
                    canvas2.restore();
                    canvas2.restore();
                    max = i21 + 1;
                    floor = i13;
                    ceil = i14;
                    i10 = i12;
                    L3 = f30;
                    arrayList = arrayList4;
                    rectF3 = rectF6;
                    f18 = 0.0f;
                    i16 = 0;
                    f13 = 2.0f;
                    q1Var = q1Var3;
                }
                f14 = 0.02f;
            } else {
                f14 = 0.02f;
            }
            float f36 = L3;
            int i24 = floor;
            int i25 = ceil;
            q1 q1Var4 = q1Var;
            RectF rectF8 = rectF3;
            if (d > 0.0f) {
                Path path2 = this.r;
                path2.rewind();
                for (int max2 = Math.max(0, i24); max2 < i25; max2++) {
                    float f37 = (max2 * f36) + L2;
                    float f38 = this.n;
                    Path.Direction direction = Path.Direction.CW;
                    path2.addCircle((f38 / 2.0f) + f37, (org.telegram.messenger.i0.L(54.0f) / 2.0f) + org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(54.0f) / 2.0f, direction);
                    float f39 = f38 * 0.4f;
                    RectF rectF9 = org.telegram.messenger.i0.P;
                    rectF9.set(c3.i0.B(f38, f39, 2.0f, f37), org.telegram.messenger.i0.L(69.0f), org.telegram.messenger.m5.a(f38, f39, 2.0f, f37), org.telegram.messenger.i0.L(79.0f));
                    path2.addRoundRect(rectF9, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), direction);
                    float f40 = f38 * 0.35f;
                    rectF9.set(c3.i0.B(f38, f40, 2.0f, f37), org.telegram.messenger.i0.L(83.0f), org.telegram.messenger.m5.a(f38, f40, 2.0f, f37), org.telegram.messenger.i0.L(91.0f));
                    path2.addRoundRect(rectF9, org.telegram.messenger.i0.L(2.5f), org.telegram.messenger.i0.L(2.5f), direction);
                }
                if (this.s == null) {
                    t80 t80Var = new t80();
                    this.s = t80Var;
                    t80Var.y = path2;
                    t80Var.D = false;
                }
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, q1Var4.Ob);
                this.s.g(org.telegram.ui.ActionBar.t6.r1(0.05f, w03), org.telegram.ui.ActionBar.t6.r1(0.15f, w03), org.telegram.ui.ActionBar.t6.r1(0.1f, w03), org.telegram.ui.ActionBar.t6.r1(0.3f, w03));
                t80 t80Var2 = this.s;
                t80Var2.t = 1.5f;
                t80Var2.setAlpha((int) (d * 255.0f));
                canvas2.save();
                rectF = rectF8;
                canvas2.translate(0.0f, rectF.bottom - org.telegram.messenger.i0.L(99.0f));
                this.s.draw(canvas2);
                canvas2.restore();
            } else {
                rectF = rectF8;
            }
            float a11 = this.y.a(f14);
            float L8 = rectF.right - org.telegram.messenger.i0.L(20.0f);
            float L9 = rectF.top + org.telegram.messenger.i0.L(20.0f);
            canvas2.save();
            canvas2.scale(a11, a11, L8, L9);
            float L10 = org.telegram.messenger.i0.L(1.33f);
            Paint paint4 = this.z;
            paint4.setStrokeWidth(L10);
            canvas2.drawLine(L8 - org.telegram.messenger.i0.L(4.0f), L9 - org.telegram.messenger.i0.L(4.0f), L8 + org.telegram.messenger.i0.L(4.0f), L9 + org.telegram.messenger.i0.L(4.0f), paint4);
            canvas.drawLine(L8 - org.telegram.messenger.i0.L(4.0f), L9 + org.telegram.messenger.i0.L(4.0f), L8 + org.telegram.messenger.i0.L(4.0f), L9 - org.telegram.messenger.i0.L(4.0f), paint4);
            this.x.set(L8 - org.telegram.messenger.i0.L(12.0f), L9 - org.telegram.messenger.i0.L(12.0f), L8 + org.telegram.messenger.i0.L(12.0f), L9 + org.telegram.messenger.i0.L(12.0f));
            canvas.restore();
            canvas.restore();
        }
    }

    public final boolean d() {
        return this.d.g1 && this.q.size() > 0;
    }

    public final void e(jj jjVar) {
        ArrayList arrayList;
        int i10;
        int i11;
        ArrayList arrayList2;
        this.b = jjVar.I1;
        this.d = jjVar;
        this.c = jj.B0(jjVar.k);
        vp.r1(this.b).L0(Long.valueOf(-this.c));
        this.e = -this.c;
        Typeface o10 = org.telegram.messenger.i0.o();
        TextPaint textPaint = this.f;
        textPaint.setTypeface(o10);
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        int i12 = org.telegram.ui.ActionBar.t6.Wc;
        q1 q1Var = this.a;
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i12, q1Var.Ob));
        this.g = new StaticLayout(cd.L0(2131752391, null), textPaint, this.d.m1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = r0.getWidth();
        this.i = 0.0f;
        for (int i13 = 0; i13 < this.g.getLineCount(); i13++) {
            this.h = Math.min(this.h, this.g.getLineLeft(i13));
            this.i = Math.max(this.i, this.g.getLineRight(i13));
        }
        this.j = this.g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W5, q1Var.Ob));
        q1Var.u0 = org.telegram.messenger.i0.L(14.66f) + this.j;
        int i14 = 0;
        while (true) {
            arrayList = this.q;
            if (i14 >= arrayList.size()) {
                break;
            }
            k0 k0Var = (k0) arrayList.get(i14);
            int i15 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = k0Var.c;
                if (i15 < imageReceiverArr.length) {
                    imageReceiverArr[i15].R();
                    i15++;
                }
            }
            i14++;
        }
        arrayList.clear();
        wo K0 = vp.r1(this.b).K0(this.c);
        ArrayList arrayList3 = (K0 == null || (arrayList2 = K0.b) == null) ? new ArrayList() : new ArrayList(arrayList2);
        int i16 = 0;
        while (i16 < arrayList3.size()) {
            TLObject tLObject = (TLObject) arrayList3.get(i16);
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.w3.r0((TLRPC.Chat) tLObject)) {
                arrayList3.remove(i16);
                i16--;
            }
            i16++;
        }
        boolean z10 = arrayList3.isEmpty() || (!d20.i(this.b).q() && arrayList3.size() == 1);
        this.t = z10;
        if (!z10) {
            int size = arrayList3.size();
            if (!d20.i(this.b).q() && K0.c > 0) {
                size = Math.min(size - 1, vp.r1(this.b).x4);
            }
            int min = Math.min(size, 10);
            for (int i17 = 0; i17 < min; i17++) {
                arrayList.add(new k0(q1Var, (TLObject) arrayList3.get(i17)));
            }
            if (min < arrayList3.size()) {
                arrayList.add(new k0(q1Var, new TLObject[]{(min < 0 || min >= arrayList3.size()) ? null : (TLObject) arrayList3.get(min), (min < 0 || (i11 = min + 1) >= arrayList3.size()) ? null : (TLObject) arrayList3.get(i11), (min < 0 || (i10 = min + 2) >= arrayList3.size()) ? null : (TLObject) arrayList3.get(i10)}, (arrayList3.size() + K0.c) - min));
            }
        }
        if (this.v == null) {
            qz0 qz0Var = new qz0(cd.L0(this.c > 0 ? 2131745337 : 2131745335, null), 14.0f, org.telegram.messenger.i0.o());
            qz0Var.o = true;
            this.v = qz0Var;
        }
        if (d()) {
            q1Var.u0 = org.telegram.messenger.i0.L(144.0f) + q1Var.u0;
            this.k.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ra, q1Var.Ob));
        }
        float size2 = ((arrayList.size() - 1) * org.telegram.messenger.i0.L(9.0f)) + (arrayList.size() * this.n);
        this.p = size2;
        this.o = Utilities.i(this.o, size2, 0.0f);
    }
}
