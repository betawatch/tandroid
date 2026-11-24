// default package

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a09 extends Path {
    public final rc2 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final zx2 j;
    public final ln k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public zz8 q;
    public final int r;
    public final qkb s;
    public final int t;
    public final ArrayList u;

    public a09(final rc2 rc2Var, final ViewParent viewParent, int i, ArrayList arrayList, int i2, int i3, float f) {
        int i4;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new zx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final byte b = 0;
        this.k = new ln(0.0f, new Runnable() { // from class: yz8
            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                Object obj = viewParent;
                rc2 rc2Var2 = rc2Var;
                switch (b2) {
                    case 0:
                        rc2Var2.invalidate();
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                    default:
                        rc2Var2.invalidate();
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, d53.h);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = false;
        this.f = false;
        if (arrayList == null) {
            return;
        }
        int L = gm.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        boolean z = false;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            h47 h47Var = (h47) arrayList.get(i5);
            if (h47Var != null && i2 <= h47Var.r && i3 >= (i4 = h47Var.n)) {
                int max = Math.max(0, i2 - i4);
                int i6 = h47Var.n;
                int min = Math.min(i3 - i6, h47Var.r - i6);
                float f2 = -f;
                this.n = f2;
                if (h47Var.I && !h47Var.J) {
                    this.n = f2 + (h47Var.V ? gm.L(14.0f) : gm.L(10.0f));
                }
                this.o = h47Var.o(arrayList) + h47Var.f;
                this.p = h47Var.J ? gm.L(10.0f) : 0.0f;
                z = z || gm.J1(h47Var.e.getText());
                StaticLayout staticLayout = h47Var.e;
                if (z) {
                    staticLayout.getSelectionPath(max, min, this);
                } else {
                    e(staticLayout, max, min);
                }
                if (h47Var.K && h47Var.f()) {
                    this.m.add(Integer.valueOf(h47Var.c));
                }
            }
        }
        d();
    }

    public static void b(zx2 zx2Var, zz8 zz8Var, float f, float f2, Rect rect, float f3) {
        float x = zz8Var.j != null ? r0.getX() - zz8Var.k : 0.0f;
        float y = zz8Var.j != null ? r2.getY() - zz8Var.l : 0.0f;
        zx2Var.addRect(gm.R1(rect.left - f, zz8Var.a + x, f3), gm.R1(zz8Var.e ? rect.top - f2 : zz8Var.g + y, zz8Var.c + y, f3), gm.R1(rect.right - f, zz8Var.b + x, f3), gm.R1(zz8Var.f ? rect.bottom - f2 : zz8Var.h + y, zz8Var.d + y, f3), Path.Direction.CW);
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f >= f3) {
            return;
        }
        float f5 = this.p;
        float max = Math.max(f5, f);
        float max2 = Math.max(f5, f3);
        float f6 = this.n;
        float f7 = max + f6;
        float f8 = this.o;
        float f9 = f2 + f8;
        float f10 = max2 + f6;
        zz8 zz8Var = new zz8();
        zz8Var.a = f7 - gm.L(3.0f);
        zz8Var.b = f10 + gm.L(3.0f);
        zz8Var.c = f9;
        zz8Var.d = f4 + f8;
        zz8Var.i = this.r;
        qkb qkbVar = this.s;
        zz8Var.j = qkbVar;
        if (qkbVar != null) {
            zz8Var.k = qkbVar.getX();
            zz8Var.l = qkbVar.getY();
        }
        zz8 zz8Var2 = this.q;
        if (zz8Var2 != null) {
            float f11 = zz8Var2.d;
            zz8Var2.h = (f11 + f9) / 2.0f;
            zz8Var.g = (f11 + f9) / 2.0f;
        }
        this.l.add(zz8Var);
        this.q = zz8Var;
    }

    @Override // android.graphics.Path
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        a(f, f2, f3, f4);
    }

    public final void c(Canvas canvas, float f, float f2, Rect rect, float f3) {
        zx2 zx2Var;
        ArrayList arrayList;
        Rect rect2 = rect;
        int i = 0;
        float e = this.k.e(false, 1.0f);
        canvas.save();
        boolean z = this.f;
        zx2 zx2Var2 = this.j;
        rc2 rc2Var = this.a;
        Paint paint = this.i;
        if (z) {
            int U1 = gm.U1(e, gm.L(4.0f), 0);
            if (this.h != U1) {
                this.h = U1;
                paint.setPathEffect(new CornerPathEffect(U1));
            }
            zx2Var2.rewind();
            int Y1 = rc2Var.Y1(this.g);
            RectF rectF = gm.P;
            rectF.set(rc2Var.getBackgroundDrawableLeft(), rc2Var.X1(Y1), rc2Var.getBackgroundDrawableRight(), rc2Var.W1(Y1));
            gm.W1(rect2, rectF, e, rectF);
            zx2Var2.addRect(rectF, Path.Direction.CW);
            zx2Var2.a();
        } else {
            if (!this.e) {
                int i2 = this.t;
                ArrayList arrayList2 = this.l;
                if (i2 <= 1) {
                    canvas.translate(f, f2);
                    zx2Var2.rewind();
                    while (i < arrayList2.size()) {
                        zx2 zx2Var3 = zx2Var2;
                        b(zx2Var3, (zz8) arrayList2.get(i), f, f2, rect2, e);
                        i++;
                        rect2 = rect;
                        zx2Var2 = zx2Var3;
                    }
                    zx2Var = zx2Var2;
                    zx2Var.a();
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * f3));
                    canvas.drawPath(zx2Var, paint);
                    paint.setAlpha(alpha);
                    canvas.restore();
                }
                canvas.translate(f, f2);
                zx2 zx2Var4 = null;
                int i3 = -1;
                int i4 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.u;
                    if (i4 >= size) {
                        break;
                    }
                    zz8 zz8Var = (zz8) arrayList2.get(i4);
                    if (zx2Var4 != null) {
                        if (zz8Var.e) {
                            zx2Var4.a();
                        }
                        zx2 zx2Var5 = zx2Var4;
                        float f4 = e;
                        Rect rect3 = rect2;
                        b(zx2Var5, zz8Var, f, f2, rect3, f4);
                        zx2Var4 = zx2Var5;
                        rect2 = rect3;
                        e = f4;
                        i4++;
                    }
                    i3++;
                    if (i3 >= arrayList.size()) {
                        arrayList.add(new zx2());
                    }
                    zx2Var4 = (zx2) arrayList.get(i3);
                    zx2Var4.rewind();
                    zx2 zx2Var52 = zx2Var4;
                    float f42 = e;
                    Rect rect32 = rect2;
                    b(zx2Var52, zz8Var, f, f2, rect32, f42);
                    zx2Var4 = zx2Var52;
                    rect2 = rect32;
                    e = f42;
                    i4++;
                }
                if (zx2Var4 != null) {
                    zx2Var4.a();
                }
                int alpha2 = paint.getAlpha();
                canvas.saveLayerAlpha(rect2.left - f, rect2.top - f2, rect2.right - f, rect2.bottom - f2, (int) (alpha2 * f3), 31);
                paint.setAlpha(nm7.d4);
                while (i <= i3) {
                    canvas.drawPath((Path) arrayList.get(i), paint);
                    i++;
                }
                paint.setAlpha(alpha2);
                canvas.restore();
                canvas.restore();
                return;
            }
            int U12 = gm.U1(e, gm.L(4.0f), 0);
            if (this.h != U12) {
                this.h = U12;
                paint.setPathEffect(new CornerPathEffect(U12));
            }
            zx2Var2.rewind();
            int e2 = rc2Var.e2(-this.c);
            RectF rectF2 = gm.P;
            rectF2.set(rc2Var.getBackgroundDrawableLeft(), rc2Var.X1(e2), rc2Var.getBackgroundDrawableRight(), rc2Var.W1(e2));
            gm.W1(rect2, rectF2, e, rectF2);
            zx2Var2.addRect(rectF2, Path.Direction.CW);
            zx2Var2.a();
        }
        zx2Var = zx2Var2;
        int alpha3 = paint.getAlpha();
        paint.setAlpha((int) (alpha3 * f3));
        canvas.drawPath(zx2Var, paint);
        paint.setAlpha(alpha3);
        canvas.restore();
    }

    public final void d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i >= arrayList.size()) {
                return;
            }
            zz8 zz8Var = (zz8) arrayList.get(i);
            if (i == 0 || ((zz8) arrayList.get(i - 1)).i != zz8Var.i) {
                zz8Var.e = true;
                zz8Var.c -= gm.L(0.66f);
            }
            if (i == arrayList.size() - 1 || ((zz8) arrayList.get(i + 1)).i != zz8Var.i) {
                zz8Var.f = true;
                zz8Var.d += gm.L(0.66f);
            }
            i++;
        }
    }

    public final void e(Layout layout, int i, int i2) {
        if (i != i2) {
            if (i2 < i) {
                i2 = i;
                i = i2;
            }
            int lineForOffset = layout.getLineForOffset(i);
            int lineForOffset2 = layout.getLineForOffset(i2);
            int i3 = lineForOffset;
            while (i3 <= lineForOffset2) {
                int lineStart = layout.getLineStart(i3);
                int lineEnd = layout.getLineEnd(i3);
                if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(layout.getText().charAt(lineStart)))) {
                    float lineLeft = (i3 != lineForOffset || i <= lineStart) ? layout.getLineLeft(i3) : layout.getPrimaryHorizontal(i);
                    float lineRight = (i3 != lineForOffset2 || i2 >= lineEnd) ? layout.getLineRight(i3) : layout.getPrimaryHorizontal(i2);
                    a(Math.min(lineLeft, lineRight), layout.getLineTop(i3), Math.max(lineLeft, lineRight), layout.getLineBottom(i3));
                }
                i3++;
            }
        }
    }

    public a09(rc2 rc2Var, int i, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new zx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = rc2Var;
        this.k = new ln(0.0f, new dc2(rc2Var, (byte) 13), 350L, 420L, d53.h);
        this.b = i;
        this.g = bArr;
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = true;
        int L = gm.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public a09(rc2 rc2Var, int i, int i2) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new zx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = rc2Var;
        this.k = new ln(0.0f, new dc2(rc2Var, (byte) 12), 350L, 420L, d53.h);
        this.b = i;
        int i3 = -i2;
        this.c = i3;
        this.d = i3;
        this.e = true;
        this.f = false;
        int L = gm.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public a09(final rc2 rc2Var, final ViewParent viewParent, int i, uj9 uj9Var, int i2, int i3) {
        final byte b = 1;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new zx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        this.k = new ln(0.0f, new Runnable() { // from class: yz8
            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                Object obj = viewParent;
                rc2 rc2Var2 = rc2Var;
                switch (b2) {
                    case 0:
                        rc2Var2.invalidate();
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                    default:
                        rc2Var2.invalidate();
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, d53.h);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = false;
        this.f = false;
        if (uj9Var == null) {
            return;
        }
        ArrayList arrayList = uj9Var.n;
        int L = gm.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.p = -3.4028235E38f;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            qkb qkbVar = (qkb) arrayList.get(i4);
            Layout a = qkbVar == null ? null : qkbVar.a();
            if (a != null && a.getText() != null) {
                int intValue = ((Integer) uj9Var.o.get(i4)).intValue();
                int length = a.getText().length();
                int j = Utilities.j(i2 - intValue, length, 0);
                int j2 = Utilities.j(i3 - intValue, length, 0);
                if (j < j2) {
                    this.n = qkbVar.getX();
                    this.o = qkbVar.getY();
                    this.s = qkbVar;
                    this.q = null;
                    int size = this.l.size();
                    if (gm.J1(a.getText())) {
                        a.getSelectionPath(j, j2, this);
                    } else {
                        e(a, j, j2);
                    }
                    if (this.l.size() > size) {
                        this.r++;
                    }
                }
            }
        }
        this.t = Math.max(1, this.r);
        d();
    }
}
