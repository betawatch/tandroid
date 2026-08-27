package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.t80;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final bm0 E;
    public n0 F;
    public ga G;
    public final s1 a;
    public int b;
    public long c;
    public MessageObject d;
    public long e;
    public StaticLayout g;
    public float h;
    public float i;
    public int j;
    public float o;
    public float p;
    public t80 s;
    public final org.telegram.ui.Components.y5 u;
    public pz0 v;
    public final nc y;
    public final TextPaint f = new TextPaint(1);
    public final Paint k = new Paint(1);
    public final Path l = new Path();
    public final float m = -1.0f;
    public int n = AndroidUtilities.dp(66.0f);
    public final ArrayList q = new ArrayList();
    public final Path r = new Path();
    public final RectF w = new RectF();
    public final RectF x = new RectF();
    public final Paint z = new Paint(1);
    public boolean t = true;

    public o0(s1 s1Var) {
        this.a = s1Var;
        this.E = new bm0(s1Var.getContext(), null);
        this.y = new nc(s1Var);
        this.u = new org.telegram.ui.Components.y5(s1Var, 350L, er.h);
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
        s1 s1Var;
        ArrayList arrayList;
        n0 n0Var;
        VelocityTracker velocityTracker;
        boolean z10;
        VelocityTracker velocityTracker2;
        ga gaVar;
        if (this.d != null && (s1Var = this.a) != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.w;
            float dp = (rectF.left + AndroidUtilities.dp(7.0f)) - this.o;
            int i10 = 0;
            while (true) {
                arrayList = this.q;
                if (i10 >= arrayList.size()) {
                    n0Var = null;
                    break;
                }
                n0Var = (n0) arrayList.get(i10);
                if (motionEvent.getX() >= dp && motionEvent.getX() <= this.n + dp && motionEvent.getY() >= rectF.bottom - AndroidUtilities.dp(99.0f) && motionEvent.getY() < rectF.bottom) {
                    break;
                }
                dp += AndroidUtilities.dp(9.0f) + this.n;
                i10++;
            }
            boolean contains = this.x.contains(motionEvent.getX(), motionEvent.getY());
            nc ncVar = this.y;
            if (action == 0) {
                this.E.a();
                if (!this.t) {
                    float x8 = motionEvent.getX();
                    this.C = x8;
                    if (rectF.contains(x8, motionEvent.getY())) {
                        z10 = true;
                        this.A = z10;
                        if (z10 && s1Var.getParent() != null) {
                            s1Var.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        this.B = false;
                        velocityTracker2 = this.D;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.D = null;
                        }
                        this.D = VelocityTracker.obtain();
                        if (n0Var != null) {
                            n0Var.n.c(true);
                        }
                        if (contains) {
                            ncVar.c(true);
                        }
                        gaVar = this.G;
                        if (gaVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(gaVar);
                            this.G = null;
                        }
                        this.F = n0Var;
                        if (n0Var != null) {
                            ga gaVar2 = new ga(1, this, n0Var);
                            this.G = gaVar2;
                            AndroidUtilities.runOnUIThread(gaVar2, ViewConfiguration.getLongPressTimeout());
                        }
                        return this.A;
                    }
                }
                z10 = false;
                this.A = z10;
                if (z10) {
                    s1Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.B = false;
                velocityTracker2 = this.D;
                if (velocityTracker2 != null) {
                }
                this.D = VelocityTracker.obtain();
                if (n0Var != null) {
                }
                if (contains) {
                }
                gaVar = this.G;
                if (gaVar != null) {
                }
                this.F = n0Var;
                if (n0Var != null) {
                }
                return this.A;
            }
            if (action == 2) {
                VelocityTracker velocityTracker3 = this.D;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                if ((this.A && Math.abs(motionEvent.getX() - this.C) >= AndroidUtilities.touchSlop) || this.B) {
                    ga gaVar3 = this.G;
                    if (gaVar3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(gaVar3);
                        this.G = null;
                    }
                    this.B = true;
                    this.o = Utilities.clamp(this.o + (this.C - motionEvent.getX()), this.p - (rectF.width() - AndroidUtilities.dp(14.0f)), 0.0f);
                    s1Var.Z2();
                    this.C = motionEvent.getX();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((n0) arrayList.get(i11)).n.c(false);
                    }
                    return true;
                }
            } else if (action == 1 || action == 3) {
                ga gaVar4 = this.G;
                if (gaVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar4);
                    this.G = null;
                }
                VelocityTracker velocityTracker4 = this.D;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                boolean z11 = this.B;
                this.B = false;
                if (action == 1) {
                    if (z11 || n0Var == null || !n0Var.n.h) {
                        if (z11 && (velocityTracker = this.D) != null) {
                            velocityTracker.computeCurrentVelocity(500);
                            this.E.c((int) this.o, 0, (int) (-this.D.getXVelocity()), 0, -2147483647, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, 0);
                        } else if (ncVar.h && s1Var.getDelegate() != null) {
                            s1Var.getDelegate().D(s1Var);
                        }
                    } else if (!n0Var.g) {
                        TLObject tLObject = n0Var.o;
                        if (s1Var.getDelegate() != null) {
                            s1Var.getDelegate().E0(s1Var, tLObject, false);
                        }
                    } else if (s1Var.getDelegate() != null) {
                        s1Var.getDelegate().m2();
                    }
                }
                ncVar.c(false);
                this.A = false;
                VelocityTracker velocityTracker5 = this.D;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                    this.D = null;
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ((n0) arrayList.get(i12)).n.c(false);
                }
                return z11;
            }
        }
        return false;
    }

    public final void b() {
        bm0 bm0Var = this.E;
        if (bm0Var.b()) {
            float f10 = bm0Var.j;
            this.o = f10;
            this.o = Utilities.clamp(f10, this.p - (this.w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.a.Z2();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:88|89|(4:94|95|96|97)|101|102|103|104|95|96|97) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0529, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0528, code lost:
    
        r0 = e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas) {
        s1 s1Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        Canvas canvas2;
        ArrayList arrayList;
        RectF rectF;
        float[] fArr;
        float f15;
        float[] fArr2;
        float f16;
        if (this.d == null || (s1Var = this.a) == null) {
            return;
        }
        r1 r1Var = s1Var.Vc;
        b();
        if (this.g != null) {
            canvas.save();
            float width = (s1Var.getWidth() - this.g.getWidth()) / 2.0f;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((this.h + width) - AndroidUtilities.dp(8.66f), AndroidUtilities.dp(4.0f), this.i + width + AndroidUtilities.dp(8.66f), AndroidUtilities.dp(10.66f) + this.j);
            s1Var.i2(canvas, rectF2, AndroidUtilities.dp(11.0f));
            canvas.translate(width, AndroidUtilities.dp(7.33f));
            this.g.draw(canvas);
            canvas.restore();
            f10 = AndroidUtilities.dp(10.66f) + this.j + 0.0f;
        } else {
            f10 = 0.0f;
        }
        float clamp = Utilities.clamp(((r1Var.L2 ? d() ? r1Var.K1 : 1.0f - r1Var.K1 : d() ? 1.0f : 0.0f) - 0.3f) / 0.7f, 1.0f, 0.0f);
        if (clamp > 0.0f) {
            int width2 = s1Var.getWidth() - AndroidUtilities.dp(18.0f);
            this.n = (int) (width2 > AndroidUtilities.dp(441.0f) ? AndroidUtilities.dp(66.0f) : Math.max((width2 / 4.5f) - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(66.0f)));
            ArrayList arrayList2 = this.q;
            this.p = ((arrayList2.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList2.size() * r4);
            int min = (int) Math.min(width2, this.n * 6.5f);
            RectF rectF3 = this.w;
            rectF3.set((s1Var.getWidth() - min) / 2.0f, AndroidUtilities.dp(10.0f) + f10, (s1Var.getWidth() + min) / 2.0f, f10 + AndroidUtilities.dp(138.0f));
            this.o = Utilities.clamp(this.o, this.p - (rectF3.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            float abs = Math.abs(clamp - this.m);
            Path path = this.l;
            if (abs < 0.001f) {
                f11 = 6.0f;
                f12 = 8.0f;
                f13 = 9.0f;
                f14 = 2.0f;
            } else {
                float dp = AndroidUtilities.dp(16.66f) * 2.0f;
                f11 = 6.0f;
                float f17 = rectF3.bottom;
                path.rewind();
                f12 = 8.0f;
                RectF rectF4 = AndroidUtilities.rectTmp;
                f13 = 9.0f;
                float f18 = rectF3.left;
                f14 = 2.0f;
                float f19 = rectF3.top;
                rectF4.set(f18, f19, f18 + dp, f19 + dp);
                path.arcTo(rectF4, -90.0f, -90.0f);
                float f20 = rectF3.left;
                float f21 = f17 - dp;
                rectF4.set(f20, f21, f20 + dp, f17);
                path.arcTo(rectF4, -180.0f, -90.0f);
                float f22 = rectF3.right;
                rectF4.set(f22 - dp, f21, f22, f17);
                path.arcTo(rectF4, -270.0f, -90.0f);
                float f23 = rectF3.right;
                float f24 = rectF3.top;
                rectF4.set(f23 - dp, f24, f23, dp + f24);
                path.arcTo(rectF4, 0.0f, -90.0f);
                path.lineTo(rectF3.centerX() + AndroidUtilities.dp(8.0f), rectF3.top);
                path.lineTo(rectF3.centerX(), rectF3.top - AndroidUtilities.dp(6.0f));
                path.lineTo(rectF3.centerX() - AndroidUtilities.dp(8.0f), rectF3.top);
                path.close();
            }
            canvas.save();
            float f25 = (clamp * 0.6f) + 0.4f;
            canvas.scale(f25, f25, rectF3.centerX(), rectF3.top - AndroidUtilities.dp(f11));
            Paint paint = this.k;
            paint.setAlpha((int) (clamp * 255.0f));
            paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), i0.b.k(-16777216, (int) (27.0f * clamp)));
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            pz0 pz0Var = this.v;
            if (pz0Var != null) {
                arrayList = arrayList2;
                pz0Var.c(rectF3.left + AndroidUtilities.dp(17.0f), rectF3.top + AndroidUtilities.dp(20.0f), clamp, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, s1Var.Ed), canvas);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                arrayList = arrayList2;
            }
            float e9 = this.u.e(this.t);
            float dp2 = (rectF3.left + AndroidUtilities.dp(7.0f)) - this.o;
            float dp3 = AndroidUtilities.dp(f13) + this.n;
            int floor = (int) Math.floor(((rectF3.left - min) - dp2) / dp3);
            int ceil = (int) Math.ceil((rectF3.right - dp2) / dp3);
            if (e9 < 1.0f) {
                int max = Math.max(0, floor);
                while (max < Math.min(ceil + 1, arrayList.size())) {
                    n0 n0Var = (n0) arrayList.get(max);
                    canvas2.save();
                    canvas2.translate((max * dp3) + dp2, rectF3.bottom - AndroidUtilities.dp(99.0f));
                    int i10 = this.n;
                    float f26 = (1.0f - e9) * clamp;
                    org.telegram.ui.Components.y8[] y8VarArr = n0Var.b;
                    float f27 = e9;
                    pz0 pz0Var2 = n0Var.k;
                    float f28 = dp2;
                    Paint paint2 = n0Var.j;
                    canvas2.save();
                    float f29 = clamp;
                    float f30 = dp3;
                    float a2 = n0Var.n.a(0.075f);
                    float f31 = i10;
                    float f32 = f31 / f14;
                    canvas2.scale(a2, a2, f32, AndroidUtilities.dp(99.0f) / f14);
                    Paint paint3 = n0Var.i;
                    paint3.setStrokeWidth(AndroidUtilities.dp(2.66f));
                    s1 s1Var2 = n0Var.a;
                    paint3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ra, s1Var2.Ed));
                    ImageReceiver[] imageReceiverArr = n0Var.c;
                    int length = imageReceiverArr.length - 1;
                    while (length >= 0) {
                        int i11 = length;
                        float length2 = (f32 - (((imageReceiverArr.length - 1) * AndroidUtilities.dp(7.0f)) / f14)) + (AndroidUtilities.dp(7.0f) * i11);
                        int i12 = max;
                        float dp4 = (AndroidUtilities.dp(54.0f) / f14) + AndroidUtilities.dp(10.0f);
                        ArrayList arrayList3 = arrayList;
                        RectF rectF5 = rectF3;
                        if (imageReceiverArr.length > 1) {
                            canvas2.drawCircle(length2, dp4, AndroidUtilities.dp(54.0f) / f14, paint3);
                        }
                        ImageReceiver[] imageReceiverArr2 = imageReceiverArr;
                        imageReceiverArr[i11].setImageCoords(length2 - (AndroidUtilities.dp(54.0f) / f14), dp4 - (AndroidUtilities.dp(54.0f) / f14), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(54.0f));
                        imageReceiverArr2[i11].setAlpha(f26);
                        imageReceiverArr2[i11].draw(canvas2);
                        length = i11 - 1;
                        max = i12;
                        arrayList = arrayList3;
                        rectF3 = rectF5;
                        imageReceiverArr = imageReceiverArr2;
                    }
                    ImageReceiver[] imageReceiverArr3 = imageReceiverArr;
                    int i13 = max;
                    RectF rectF6 = rectF3;
                    ArrayList arrayList4 = arrayList;
                    if (pz0Var2 != null) {
                        pz0Var2.p = i10 - AndroidUtilities.dp(32.0f);
                        float l10 = pz0Var2.l() + AndroidUtilities.dp(n0Var.h != null ? 17.0f : 8.0f);
                        float dp5 = AndroidUtilities.dp(1.0f) + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(10.0f);
                        AndroidUtilities.rectTmp.set((f31 - l10) / f14, dp5 - AndroidUtilities.dp(14.33f), (f31 + l10) / f14, dp5);
                        boolean z10 = n0Var.m;
                        if (!z10 && n0Var.g) {
                            paint2.setColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ra, s1Var2.Ed), org.telegram.ui.ActionBar.g6.l1(0.85f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, s1Var2.Ed))));
                            n0Var.m = true;
                        } else if (z10 || !(imageReceiverArr3[0].getStaticThumb() instanceof BitmapDrawable)) {
                            if (!n0Var.m && !n0Var.l) {
                                try {
                                    int d = i0.b.d(0.5f, y8VarArr[0].b(), y8VarArr[0].c());
                                    fArr = new float[3];
                                    i0.b.b(fArr, Color.red(d), Color.green(d), Color.blue(d));
                                    f15 = fArr[1];
                                } catch (Exception e10) {
                                    e = e10;
                                }
                                if (f15 > 0.05f && f15 < 0.95f) {
                                    fArr[1] = Utilities.clamp(f15 - 0.06f, 0.4f, 0.0f);
                                    fArr[2] = Utilities.clamp(fArr[2] - 0.08f, 0.5f, 0.2f);
                                    paint2.setColor(i0.b.a(fArr));
                                    n0Var.l = true;
                                }
                                fArr[2] = Utilities.clamp(fArr[2] - 0.1f, 0.6f, 0.3f);
                                paint2.setColor(i0.b.a(fArr));
                                n0Var.l = true;
                            }
                            RectF rectF7 = AndroidUtilities.rectTmp;
                            canvas2.drawRoundRect(rectF7, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), paint2);
                            rectF7.inset((-AndroidUtilities.dp(1.0f)) / f14, (-AndroidUtilities.dp(1.0f)) / f14);
                            paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
                            canvas2.drawRoundRect(rectF7, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), paint3);
                        } else {
                            Bitmap bitmap = ((BitmapDrawable) imageReceiverArr3[0].getStaticThumb()).getBitmap();
                            try {
                                int pixel = bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 2);
                                fArr2 = new float[3];
                                i0.b.b(fArr2, Color.red(pixel), Color.green(pixel), Color.blue(pixel));
                                f16 = fArr2[1];
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            if (f16 > 0.05f && f16 < 0.95f) {
                                float f33 = fArr2[2];
                                if (f33 > 0.02f && f33 < 0.98f) {
                                    fArr2[1] = 0.25f;
                                    fArr2[2] = org.telegram.ui.ActionBar.g6.I.q() ? 0.35f : 0.65f;
                                    paint2.setColor(i0.b.a(fArr2));
                                    n0Var.m = true;
                                }
                            }
                            fArr2[1] = 0.0f;
                            fArr2[2] = org.telegram.ui.ActionBar.g6.I.q() ? 0.38f : 0.7f;
                            paint2.setColor(i0.b.a(fArr2));
                            n0Var.m = true;
                        }
                        RectF rectF72 = AndroidUtilities.rectTmp;
                        canvas2.drawRoundRect(rectF72, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), paint2);
                        rectF72.inset((-AndroidUtilities.dp(1.0f)) / f14, (-AndroidUtilities.dp(1.0f)) / f14);
                        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
                        canvas2.drawRoundRect(rectF72, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), paint3);
                    }
                    canvas2.restore();
                    n0Var.b(canvas2, this.n, f26);
                    canvas2.restore();
                    max = i13 + 1;
                    e9 = f27;
                    dp2 = f28;
                    clamp = f29;
                    dp3 = f30;
                    arrayList = arrayList4;
                    rectF3 = rectF6;
                }
            }
            float f34 = e9;
            float f35 = dp2;
            float f36 = dp3;
            RectF rectF8 = rectF3;
            if (f34 > 0.0f) {
                Path path2 = this.r;
                path2.rewind();
                int max2 = Math.max(0, floor);
                while (max2 < ceil) {
                    float f37 = (max2 * f36) + f35;
                    float f38 = this.n;
                    Path.Direction direction = Path.Direction.CW;
                    path2.addCircle((f38 / f14) + f37, (AndroidUtilities.dp(54.0f) / f14) + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(54.0f) / f14, direction);
                    float f39 = f38 * 0.4f;
                    RectF rectF9 = AndroidUtilities.rectTmp;
                    rectF9.set(com.google.android.recaptcha.internal.a.A(f38, f39, 2.0f, f37), AndroidUtilities.dp(69.0f), i0.a.c(f38, f39, 2.0f, f37), AndroidUtilities.dp(79.0f));
                    path2.addRoundRect(rectF9, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), direction);
                    float f40 = f38 * 0.35f;
                    rectF9.set(com.google.android.recaptcha.internal.a.A(f38, f40, 2.0f, f37), AndroidUtilities.dp(83.0f), i0.a.c(f38, f40, 2.0f, f37), AndroidUtilities.dp(91.0f));
                    path2.addRoundRect(rectF9, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), direction);
                    max2++;
                    f14 = 2.0f;
                }
                if (this.s == null) {
                    t80 t80Var = new t80();
                    this.s = t80Var;
                    t80Var.x = path2;
                    t80Var.C = false;
                }
                int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, s1Var.Ed);
                this.s.f(org.telegram.ui.ActionBar.g6.l1(0.05f, v02), org.telegram.ui.ActionBar.g6.l1(0.15f, v02), org.telegram.ui.ActionBar.g6.l1(0.1f, v02), org.telegram.ui.ActionBar.g6.l1(0.3f, v02));
                t80 t80Var2 = this.s;
                t80Var2.t = 1.5f;
                t80Var2.setAlpha((int) (f34 * 255.0f));
                canvas2.save();
                rectF = rectF8;
                canvas2.translate(0.0f, rectF.bottom - AndroidUtilities.dp(99.0f));
                this.s.draw(canvas2);
                canvas2.restore();
            } else {
                rectF = rectF8;
            }
            float a3 = this.y.a(0.02f);
            float dp6 = rectF.right - AndroidUtilities.dp(20.0f);
            float dp7 = rectF.top + AndroidUtilities.dp(20.0f);
            canvas2.save();
            canvas2.scale(a3, a3, dp6, dp7);
            float dp8 = AndroidUtilities.dp(1.33f);
            Paint paint4 = this.z;
            paint4.setStrokeWidth(dp8);
            canvas2.drawLine(dp6 - AndroidUtilities.dp(4.0f), dp7 - AndroidUtilities.dp(4.0f), dp6 + AndroidUtilities.dp(4.0f), dp7 + AndroidUtilities.dp(4.0f), paint4);
            canvas.drawLine(dp6 - AndroidUtilities.dp(4.0f), dp7 + AndroidUtilities.dp(4.0f), dp6 + AndroidUtilities.dp(4.0f), dp7 - AndroidUtilities.dp(4.0f), paint4);
            this.x.set(dp6 - AndroidUtilities.dp(12.0f), dp7 - AndroidUtilities.dp(12.0f), dp6 + AndroidUtilities.dp(12.0f), dp7 + AndroidUtilities.dp(12.0f));
            canvas.restore();
            canvas.restore();
        }
    }

    public final boolean d() {
        return this.d.channelJoinedExpanded && this.q.size() > 0;
    }

    public final void e(MessageObject messageObject) {
        ArrayList arrayList;
        int i10;
        int i11;
        this.b = messageObject.currentAccount;
        this.d = messageObject;
        this.c = messageObject.getDialogId();
        MessagesController.getInstance(this.b).getChat(Long.valueOf(-this.c));
        this.e = -this.c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i12 = org.telegram.ui.ActionBar.g6.ic;
        s1 s1Var = this.a;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i12, s1Var.Ed));
        this.g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W5, s1Var.Ed));
        s1Var.o0 = AndroidUtilities.dp(14.66f) + this.j;
        int i14 = 0;
        while (true) {
            arrayList = this.q;
            if (i14 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i14);
            int i15 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.c;
                if (i15 < imageReceiverArr.length) {
                    imageReceiverArr[i15].onDetachedFromWindow();
                    i15++;
                }
            }
            i14++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.b).getChannelRecommendations(this.c);
        ArrayList arrayList2 = (channelRecommendations == null || channelRecommendations.chats == null) ? new ArrayList() : new ArrayList(channelRecommendations.chats);
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            TLObject tLObject = (TLObject) arrayList2.get(i16);
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isNotInChat((TLRPC.Chat) tLObject)) {
                arrayList2.remove(i16);
                i16--;
            }
            i16++;
        }
        boolean z10 = arrayList2.isEmpty() || (!UserConfig.getInstance(this.b).isPremium() && arrayList2.size() == 1);
        this.t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i17 = 0; i17 < min; i17++) {
                arrayList.add(new n0(this.b, s1Var, (TLObject) arrayList2.get(i17)));
            }
            if (min < arrayList2.size()) {
                TLObject tLObject2 = null;
                TLObject tLObject3 = (min < 0 || min >= arrayList2.size()) ? null : (TLObject) arrayList2.get(min);
                TLObject tLObject4 = (min < 0 || (i11 = min + 1) >= arrayList2.size()) ? null : (TLObject) arrayList2.get(i11);
                if (min >= 0 && (i10 = min + 2) < arrayList2.size()) {
                    tLObject2 = (TLObject) arrayList2.get(i10);
                }
                arrayList.add(new n0(this.b, s1Var, new TLObject[]{tLObject3, tLObject4, tLObject2}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            pz0 pz0Var = new pz0(LocaleController.getString(this.c > 0 ? R.string.SimilarBots : R.string.SimilarChannels), 14.0f, AndroidUtilities.bold());
            pz0Var.o = true;
            this.v = pz0Var;
        }
        if (d()) {
            s1Var.o0 = AndroidUtilities.dp(144.0f) + s1Var.o0;
            this.k.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ra, s1Var.Ed));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.n);
        this.p = size2;
        this.o = Utilities.clamp(this.o, size2, 0.0f);
    }
}
