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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.tn0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final tn0 E;
    public n0 F;
    public la G;
    public final u1 a;
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
    public ia0 s;
    public final org.telegram.ui.Components.g6 u;
    public l11 v;
    public final bd y;
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

    public o0(u1 u1Var) {
        this.a = u1Var;
        this.E = new tn0(u1Var.getContext(), null);
        this.y = new bd(u1Var);
        this.u = new org.telegram.ui.Components.g6(u1Var, 350L, hs.h);
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
        u1 u1Var;
        ArrayList arrayList;
        n0 n0Var;
        VelocityTracker velocityTracker;
        boolean z10;
        VelocityTracker velocityTracker2;
        la laVar;
        if (this.d != null && (u1Var = this.a) != null) {
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
            bd bdVar = this.y;
            if (action == 0) {
                this.E.a();
                if (!this.t) {
                    float x10 = motionEvent.getX();
                    this.C = x10;
                    if (rectF.contains(x10, motionEvent.getY())) {
                        z10 = true;
                        this.A = z10;
                        if (z10 && u1Var.getParent() != null) {
                            u1Var.getParent().requestDisallowInterceptTouchEvent(true);
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
                            bdVar.c(true);
                        }
                        laVar = this.G;
                        if (laVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(laVar);
                            this.G = null;
                        }
                        this.F = n0Var;
                        if (n0Var != null) {
                            la laVar2 = new la(1, this, n0Var);
                            this.G = laVar2;
                            AndroidUtilities.runOnUIThread(laVar2, ViewConfiguration.getLongPressTimeout());
                        }
                        return this.A;
                    }
                }
                z10 = false;
                this.A = z10;
                if (z10) {
                    u1Var.getParent().requestDisallowInterceptTouchEvent(true);
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
                laVar = this.G;
                if (laVar != null) {
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
                    la laVar3 = this.G;
                    if (laVar3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(laVar3);
                        this.G = null;
                    }
                    this.B = true;
                    this.o = Utilities.clamp(this.o + (this.C - motionEvent.getX()), this.p - (rectF.width() - AndroidUtilities.dp(14.0f)), 0.0f);
                    u1Var.a3();
                    this.C = motionEvent.getX();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((n0) arrayList.get(i11)).n.c(false);
                    }
                    return true;
                }
            } else if (action == 1 || action == 3) {
                la laVar4 = this.G;
                if (laVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(laVar4);
                    this.G = null;
                }
                VelocityTracker velocityTracker4 = this.D;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                boolean z11 = this.B;
                this.B = false;
                if (action == 1) {
                    if (z11 || n0Var == null || !n0Var.n.i) {
                        if (z11 && (velocityTracker = this.D) != null) {
                            velocityTracker.computeCurrentVelocity(500);
                            this.E.c((int) this.o, 0, (int) (-this.D.getXVelocity()), 0, -2147483647, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, 0);
                        } else if (bdVar.i && u1Var.getDelegate() != null) {
                            u1Var.getDelegate().A(u1Var);
                        }
                    } else if (!n0Var.g) {
                        TLObject tLObject = n0Var.o;
                        if (u1Var.getDelegate() != null) {
                            u1Var.getDelegate().G0(u1Var, tLObject, false);
                        }
                    } else if (u1Var.getDelegate() != null) {
                        u1Var.getDelegate().C2();
                    }
                }
                bdVar.c(false);
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
        tn0 tn0Var = this.E;
        if (tn0Var.b()) {
            float f7 = tn0Var.j;
            this.o = f7;
            this.o = Utilities.clamp(f7, this.p - (this.w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.a.a3();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:124|125)|(5:130|131|132|133|49)|137|138|139|140|131|132|133|49) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0525, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0526, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0607  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas) {
        u1 u1Var;
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
        float[] fArr2;
        float f17;
        if (this.d == null || (u1Var = this.a) == null) {
            return;
        }
        t1 t1Var = u1Var.Zc;
        b();
        float f18 = 0.0f;
        if (this.g != null) {
            canvas.save();
            float width = (u1Var.getWidth() - this.g.getWidth()) / 2.0f;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((this.h + width) - AndroidUtilities.dp(8.66f), AndroidUtilities.dp(4.0f), this.i + width + AndroidUtilities.dp(8.66f), AndroidUtilities.dp(10.66f) + this.j);
            u1Var.j2(canvas, rectF2, AndroidUtilities.dp(11.0f));
            canvas.translate(width, AndroidUtilities.dp(7.33f));
            this.g.draw(canvas);
            canvas.restore();
            f7 = AndroidUtilities.dp(10.66f) + this.j + 0.0f;
        } else {
            f7 = 0.0f;
        }
        float clamp = Utilities.clamp(((t1Var.L2 ? d() ? t1Var.K1 : 1.0f - t1Var.K1 : d() ? 1.0f : 0.0f) - 0.3f) / 0.7f, 1.0f, 0.0f);
        if (clamp > 0.0f) {
            int width2 = u1Var.getWidth() - AndroidUtilities.dp(18.0f);
            this.n = (int) (width2 > AndroidUtilities.dp(441.0f) ? AndroidUtilities.dp(66.0f) : Math.max((width2 / 4.5f) - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(66.0f)));
            ArrayList arrayList2 = this.q;
            this.p = ((arrayList2.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList2.size() * r4);
            int min = (int) Math.min(width2, this.n * 6.5f);
            RectF rectF3 = this.w;
            rectF3.set((u1Var.getWidth() - min) / 2.0f, AndroidUtilities.dp(10.0f) + f7, (u1Var.getWidth() + min) / 2.0f, f7 + AndroidUtilities.dp(138.0f));
            this.o = Utilities.clamp(this.o, this.p - (rectF3.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            float abs = Math.abs(clamp - this.m);
            Path path = this.l;
            if (abs < 0.001f) {
                f13 = 2.0f;
                i10 = 1;
                f12 = 9.0f;
                f10 = 6.0f;
                f11 = 8.0f;
            } else {
                float dp = AndroidUtilities.dp(16.66f) * 2.0f;
                f10 = 6.0f;
                float f19 = rectF3.bottom;
                path.rewind();
                f11 = 8.0f;
                RectF rectF4 = AndroidUtilities.rectTmp;
                f12 = 9.0f;
                float f20 = rectF3.left;
                f13 = 2.0f;
                float f21 = rectF3.top;
                i10 = 1;
                rectF4.set(f20, f21, f20 + dp, f21 + dp);
                path.arcTo(rectF4, -90.0f, -90.0f);
                float f22 = rectF3.left;
                float f23 = f19 - dp;
                rectF4.set(f22, f23, f22 + dp, f19);
                path.arcTo(rectF4, -180.0f, -90.0f);
                float f24 = rectF3.right;
                rectF4.set(f24 - dp, f23, f24, f19);
                path.arcTo(rectF4, -270.0f, -90.0f);
                float f25 = rectF3.right;
                float f26 = rectF3.top;
                rectF4.set(f25 - dp, f26, f25, dp + f26);
                path.arcTo(rectF4, 0.0f, -90.0f);
                path.lineTo(rectF3.centerX() + AndroidUtilities.dp(8.0f), rectF3.top);
                path.lineTo(rectF3.centerX(), rectF3.top - AndroidUtilities.dp(6.0f));
                path.lineTo(rectF3.centerX() - AndroidUtilities.dp(8.0f), rectF3.top);
                path.close();
            }
            canvas.save();
            float f27 = (clamp * 0.6f) + 0.4f;
            canvas.scale(f27, f27, rectF3.centerX(), rectF3.top - AndroidUtilities.dp(f10));
            Paint paint = this.k;
            paint.setAlpha((int) (clamp * 255.0f));
            paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), i0.a.k(-16777216, (int) (27.0f * clamp)));
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            l11 l11Var = this.v;
            if (l11Var != null) {
                arrayList = arrayList2;
                l11Var.c(rectF3.left + AndroidUtilities.dp(17.0f), rectF3.top + AndroidUtilities.dp(20.0f), clamp, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, u1Var.Id), canvas);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                arrayList = arrayList2;
            }
            float e7 = this.u.e(this.t);
            float dp2 = (rectF3.left + AndroidUtilities.dp(7.0f)) - this.o;
            float dp3 = AndroidUtilities.dp(f12) + this.n;
            int floor = (int) Math.floor(((rectF3.left - min) - dp2) / dp3);
            int ceil = (int) Math.ceil((rectF3.right - dp2) / dp3);
            int i15 = 0;
            if (e7 < 1.0f) {
                int max = Math.max(0, floor);
                while (max < Math.min(ceil + 1, arrayList.size())) {
                    n0 n0Var = (n0) arrayList.get(max);
                    canvas2.save();
                    int i16 = i15;
                    canvas2.translate((max * dp3) + dp2, rectF3.bottom - AndroidUtilities.dp(99.0f));
                    int i17 = this.n;
                    float f28 = (1.0f - e7) * clamp;
                    org.telegram.ui.Components.j9[] j9VarArr = n0Var.b;
                    boolean z10 = n0Var.g;
                    Drawable drawable = n0Var.h;
                    float f29 = f18;
                    ImageReceiver[] imageReceiverArr = n0Var.c;
                    float f30 = dp3;
                    u1 u1Var2 = n0Var.a;
                    int i18 = floor;
                    bd bdVar = n0Var.n;
                    int i19 = ceil;
                    l11 l11Var2 = n0Var.k;
                    Paint paint2 = n0Var.j;
                    canvas2.save();
                    int i20 = max;
                    float a2 = bdVar.a(0.075f);
                    float f31 = i17;
                    float f32 = f31 / f13;
                    canvas2.scale(a2, a2, f32, AndroidUtilities.dp(99.0f) / f13);
                    Paint paint3 = n0Var.i;
                    paint3.setStrokeWidth(AndroidUtilities.dp(2.66f));
                    paint3.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ra, u1Var2.Id));
                    int length = imageReceiverArr.length - 1;
                    while (length >= 0) {
                        int i21 = length;
                        float length2 = (f32 - (((imageReceiverArr.length - 1) * AndroidUtilities.dp(7.0f)) / f13)) + (AndroidUtilities.dp(7.0f) * i21);
                        float dp4 = (AndroidUtilities.dp(54.0f) / f13) + AndroidUtilities.dp(10.0f);
                        ArrayList arrayList3 = arrayList;
                        RectF rectF5 = rectF3;
                        if (imageReceiverArr.length > i10) {
                            canvas2.drawCircle(length2, dp4, AndroidUtilities.dp(54.0f) / f13, paint3);
                        }
                        imageReceiverArr[i21].setImageCoords(length2 - (AndroidUtilities.dp(54.0f) / f13), dp4 - (AndroidUtilities.dp(54.0f) / f13), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(54.0f));
                        imageReceiverArr[i21].setAlpha(f28);
                        imageReceiverArr[i21].draw(canvas2);
                        length = i21 - 1;
                        arrayList = arrayList3;
                        rectF3 = rectF5;
                        u1Var = u1Var;
                        i10 = 1;
                    }
                    u1 u1Var3 = u1Var;
                    RectF rectF6 = rectF3;
                    ArrayList arrayList4 = arrayList;
                    if (l11Var2 != null) {
                        l11Var2.p = i17 - AndroidUtilities.dp(32.0f);
                        float l4 = l11Var2.l() + AndroidUtilities.dp(drawable != null ? 17.0f : f11);
                        float dp5 = AndroidUtilities.dp(1.0f) + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(10.0f);
                        f15 = 32.0f;
                        i11 = 2;
                        AndroidUtilities.rectTmp.set((f31 - l4) / f13, dp5 - AndroidUtilities.dp(14.33f), (f31 + l4) / f13, dp5);
                        boolean z11 = n0Var.m;
                        if (!z11 && z10) {
                            paint2.setColor(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ra, u1Var2.Id), org.telegram.ui.ActionBar.i6.m1(0.85f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.y6, u1Var2.Id))));
                            n0Var.m = true;
                        } else if (!z11 && (imageReceiverArr[i16].getStaticThumb() instanceof BitmapDrawable)) {
                            Bitmap bitmap = ((BitmapDrawable) imageReceiverArr[i16].getStaticThumb()).getBitmap();
                            try {
                                int pixel = bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 2);
                                fArr2 = new float[3];
                                i0.a.b(fArr2, Color.red(pixel), Color.green(pixel), Color.blue(pixel));
                                f17 = fArr2[1];
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            if (f17 > 0.05f && f17 < 0.95f) {
                                float f33 = fArr2[2];
                                if (f33 > 0.02f && f33 < 0.98f) {
                                    fArr2[1] = 0.25f;
                                    fArr2[2] = org.telegram.ui.ActionBar.i6.I.q() ? 0.35f : 0.65f;
                                    paint2.setColor(i0.a.a(fArr2));
                                    n0Var.m = true;
                                }
                            }
                            fArr2[1] = f29;
                            fArr2[2] = org.telegram.ui.ActionBar.i6.I.q() ? 0.38f : 0.7f;
                            paint2.setColor(i0.a.a(fArr2));
                            n0Var.m = true;
                        } else if (!n0Var.m && !n0Var.l) {
                            try {
                                int d = i0.a.d(0.5f, j9VarArr[i16].b(), j9VarArr[i16].c());
                                fArr = new float[3];
                                i0.a.b(fArr, Color.red(d), Color.green(d), Color.blue(d));
                                f16 = fArr[1];
                            } catch (Exception e11) {
                                e = e11;
                                c10 = 39322;
                            }
                            if (f16 > 0.05f && f16 < 0.95f) {
                                fArr[1] = Utilities.clamp(f16 - 0.06f, 0.4f, f29);
                                fArr[2] = Utilities.clamp(fArr[2] - 0.08f, 0.5f, 0.2f);
                                c10 = 39322;
                                paint2.setColor(i0.a.a(fArr));
                                n0Var.l = true;
                                RectF rectF7 = AndroidUtilities.rectTmp;
                                canvas2.drawRoundRect(rectF7, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint2);
                                rectF7.inset((-AndroidUtilities.dp(1.0f)) / f13, (-AndroidUtilities.dp(1.0f)) / f13);
                                paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
                                canvas2.drawRoundRect(rectF7, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint3);
                            }
                            c10 = 39322;
                            fArr[2] = Utilities.clamp(fArr[2] - 0.1f, 0.6f, 0.3f);
                            paint2.setColor(i0.a.a(fArr));
                            n0Var.l = true;
                            RectF rectF72 = AndroidUtilities.rectTmp;
                            canvas2.drawRoundRect(rectF72, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint2);
                            rectF72.inset((-AndroidUtilities.dp(1.0f)) / f13, (-AndroidUtilities.dp(1.0f)) / f13);
                            paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
                            canvas2.drawRoundRect(rectF72, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint3);
                        }
                        c10 = 39322;
                        RectF rectF722 = AndroidUtilities.rectTmp;
                        canvas2.drawRoundRect(rectF722, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint2);
                        rectF722.inset((-AndroidUtilities.dp(1.0f)) / f13, (-AndroidUtilities.dp(1.0f)) / f13);
                        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
                        canvas2.drawRoundRect(rectF722, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint3);
                    } else {
                        f15 = 32.0f;
                        c10 = 39322;
                        i11 = 2;
                    }
                    canvas2.restore();
                    int i22 = this.n;
                    TextPaint textPaint = n0Var.d;
                    canvas2.save();
                    float a10 = bdVar.a(0.075f);
                    float f34 = i22;
                    canvas2.scale(a10, a10, f34 / f13, AndroidUtilities.dp(99.0f) / f13);
                    StaticLayout staticLayout = n0Var.f;
                    if (staticLayout != null || staticLayout.getWidth() != i22) {
                        CharSequence charSequence = n0Var.e;
                        n0Var.f = StaticLayout.Builder.obtain(charSequence, i16, charSequence.length(), textPaint, i22).setMaxLines(i11).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(i16).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
                    }
                    if (n0Var.f == null) {
                        canvas2.save();
                        canvas2.translate((i22 - n0Var.f.getWidth()) / f13, AndroidUtilities.dp(66.33f));
                        i12 = 1;
                        if (imageReceiverArr.length <= 1) {
                            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ec, u1Var2.Id));
                        } else {
                            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.y6, u1Var2.Id));
                        }
                        textPaint.setAlpha((int) (textPaint.getAlpha() * f28));
                        n0Var.f.draw(canvas2);
                        canvas2.restore();
                    } else {
                        i12 = 1;
                    }
                    if (l11Var2 == null) {
                        l11Var2.p = i22 - AndroidUtilities.dp(f15);
                        float l10 = (f34 - (l11Var2.l() + AndroidUtilities.dp(drawable != null ? 17.0f : f11))) / f13;
                        float dp6 = AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(4.165f);
                        if (drawable != null) {
                            drawable.setBounds((int) ((z10 ? l11Var2.l() + AndroidUtilities.dp(1.33f) : 0.0f) + l10 + AndroidUtilities.dp(3.0f)), (int) bi.b(drawable.getIntrinsicHeight(), f13, 0.625f, dp6), (int) ((drawable.getIntrinsicWidth() * 0.625f) + (z10 ? AndroidUtilities.dp(1.33f) + l11Var2.l() : 0.0f) + l10 + AndroidUtilities.dp(3.0f)), (int) a1.g.e(drawable.getIntrinsicHeight(), 2.0f, 0.625f, dp6));
                            drawable.draw(canvas2);
                        }
                        float dp7 = AndroidUtilities.dp(!z10 ? 12.66f : 4.0f) + l10;
                        Canvas canvas3 = canvas2;
                        i13 = i18;
                        i14 = i19;
                        n0Var.k.c(dp7, dp6, f28, -1, canvas3);
                        canvas2 = canvas3;
                    } else {
                        i13 = i18;
                        i14 = i19;
                    }
                    canvas2.restore();
                    canvas2.restore();
                    max = i20 + 1;
                    floor = i13;
                    ceil = i14;
                    i10 = i12;
                    dp3 = f30;
                    arrayList = arrayList4;
                    rectF3 = rectF6;
                    f18 = 0.0f;
                    i15 = 0;
                    f13 = 2.0f;
                    u1Var = u1Var3;
                }
                f14 = 0.02f;
            } else {
                f14 = 0.02f;
            }
            float f35 = dp3;
            int i23 = floor;
            int i24 = ceil;
            u1 u1Var4 = u1Var;
            RectF rectF8 = rectF3;
            if (e7 > 0.0f) {
                Path path2 = this.r;
                path2.rewind();
                for (int max2 = Math.max(0, i23); max2 < i24; max2++) {
                    float f36 = (max2 * f35) + dp2;
                    float f37 = this.n;
                    Path.Direction direction = Path.Direction.CW;
                    path2.addCircle((f37 / 2.0f) + f36, (AndroidUtilities.dp(54.0f) / 2.0f) + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(54.0f) / 2.0f, direction);
                    float f38 = f37 * 0.4f;
                    RectF rectF9 = AndroidUtilities.rectTmp;
                    rectF9.set(com.google.android.gms.internal.vision.e2.z(f37, f38, 2.0f, f36), AndroidUtilities.dp(69.0f), org.telegram.messenger.q.a(f37, f38, 2.0f, f36), AndroidUtilities.dp(79.0f));
                    path2.addRoundRect(rectF9, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), direction);
                    float f39 = f37 * 0.35f;
                    rectF9.set(com.google.android.gms.internal.vision.e2.z(f37, f39, 2.0f, f36), AndroidUtilities.dp(83.0f), org.telegram.messenger.q.a(f37, f39, 2.0f, f36), AndroidUtilities.dp(91.0f));
                    path2.addRoundRect(rectF9, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), direction);
                }
                if (this.s == null) {
                    ia0 ia0Var = new ia0();
                    this.s = ia0Var;
                    ia0Var.y = path2;
                    ia0Var.D = false;
                }
                int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, u1Var4.Id);
                this.s.g(org.telegram.ui.ActionBar.i6.m1(0.05f, w02), org.telegram.ui.ActionBar.i6.m1(0.15f, w02), org.telegram.ui.ActionBar.i6.m1(0.1f, w02), org.telegram.ui.ActionBar.i6.m1(0.3f, w02));
                ia0 ia0Var2 = this.s;
                ia0Var2.t = 1.5f;
                ia0Var2.setAlpha((int) (e7 * 255.0f));
                canvas2.save();
                rectF = rectF8;
                canvas2.translate(0.0f, rectF.bottom - AndroidUtilities.dp(99.0f));
                this.s.draw(canvas2);
                canvas2.restore();
            } else {
                rectF = rectF8;
            }
            float a11 = this.y.a(f14);
            float dp8 = rectF.right - AndroidUtilities.dp(20.0f);
            float dp9 = rectF.top + AndroidUtilities.dp(20.0f);
            canvas2.save();
            canvas2.scale(a11, a11, dp8, dp9);
            float dp10 = AndroidUtilities.dp(1.33f);
            Paint paint4 = this.z;
            paint4.setStrokeWidth(dp10);
            canvas2.drawLine(dp8 - AndroidUtilities.dp(4.0f), dp9 - AndroidUtilities.dp(4.0f), dp8 + AndroidUtilities.dp(4.0f), dp9 + AndroidUtilities.dp(4.0f), paint4);
            canvas.drawLine(dp8 - AndroidUtilities.dp(4.0f), dp9 + AndroidUtilities.dp(4.0f), dp8 + AndroidUtilities.dp(4.0f), dp9 - AndroidUtilities.dp(4.0f), paint4);
            this.x.set(dp8 - AndroidUtilities.dp(12.0f), dp9 - AndroidUtilities.dp(12.0f), dp8 + AndroidUtilities.dp(12.0f), dp9 + AndroidUtilities.dp(12.0f));
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
        int i12 = org.telegram.ui.ActionBar.i6.ic;
        u1 u1Var = this.a;
        textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(i12, u1Var.Id));
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
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.W5, u1Var.Id));
        u1Var.s0 = AndroidUtilities.dp(14.66f) + this.j;
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
                arrayList.add(new n0(this.b, u1Var, (TLObject) arrayList2.get(i17)));
            }
            if (min < arrayList2.size()) {
                TLObject tLObject2 = null;
                TLObject tLObject3 = (min < 0 || min >= arrayList2.size()) ? null : (TLObject) arrayList2.get(min);
                TLObject tLObject4 = (min < 0 || (i11 = min + 1) >= arrayList2.size()) ? null : (TLObject) arrayList2.get(i11);
                if (min >= 0 && (i10 = min + 2) < arrayList2.size()) {
                    tLObject2 = (TLObject) arrayList2.get(i10);
                }
                arrayList.add(new n0(this.b, u1Var, new TLObject[]{tLObject3, tLObject4, tLObject2}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            l11 l11Var = new l11(LocaleController.getString(this.c > 0 ? R.string.SimilarBots : R.string.SimilarChannels), 14.0f, AndroidUtilities.bold());
            l11Var.o = true;
            this.v = l11Var;
        }
        if (d()) {
            u1Var.s0 = AndroidUtilities.dp(144.0f) + u1Var.s0;
            this.k.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ra, u1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.n);
        this.p = size2;
        this.o = Utilities.clamp(this.o, size2, 0.0f);
    }
}
