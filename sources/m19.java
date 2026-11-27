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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class m19 extends Path {
    public final wb2 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final jx2 j;
    public final mm k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public l19 q;
    public final int r;
    public final kmb s;
    public final int t;
    public final ArrayList u;

    public m19(final wb2 wb2Var, final ViewParent viewParent, int i, ArrayList arrayList, int i2, int i3, float f) {
        int i4;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new jx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final byte b = 0;
        this.k = new mm(0.0f, new Runnable() { // from class: k19
            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                Object obj = viewParent;
                wb2 wb2Var2 = wb2Var;
                switch (b2) {
                    case 0:
                        wb2Var2.invalidate();
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                    default:
                        wb2Var2.invalidate();
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, k43.h);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = false;
        this.f = false;
        if (arrayList == null) {
            return;
        }
        int L = hl.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        boolean z = false;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            o47 o47Var = (o47) arrayList.get(i5);
            if (o47Var != null && i2 <= o47Var.r && i3 >= (i4 = o47Var.n)) {
                int max = Math.max(0, i2 - i4);
                int i6 = o47Var.n;
                int min = Math.min(i3 - i6, o47Var.r - i6);
                float f2 = -f;
                this.n = f2;
                if (o47Var.I && !o47Var.J) {
                    this.n = f2 + (o47Var.V ? hl.L(14.0f) : hl.L(10.0f));
                }
                this.o = o47Var.o(arrayList) + o47Var.f;
                this.p = o47Var.J ? hl.L(10.0f) : 0.0f;
                z = z || hl.J1(o47Var.e.getText());
                StaticLayout staticLayout = o47Var.e;
                if (z) {
                    staticLayout.getSelectionPath(max, min, this);
                } else {
                    e(staticLayout, max, min);
                }
                if (o47Var.K && o47Var.f()) {
                    this.m.add(Integer.valueOf(o47Var.c));
                }
            }
        }
        d();
    }

    public static void b(jx2 jx2Var, l19 l19Var, float f, float f2, Rect rect, float f3) {
        float x = l19Var.j != null ? r0.getX() - l19Var.k : 0.0f;
        float y = l19Var.j != null ? r2.getY() - l19Var.l : 0.0f;
        jx2Var.addRect(hl.R1(rect.left - f, l19Var.a + x, f3), hl.R1(l19Var.e ? rect.top - f2 : l19Var.g + y, l19Var.c + y, f3), hl.R1(rect.right - f, l19Var.b + x, f3), hl.R1(l19Var.f ? rect.bottom - f2 : l19Var.h + y, l19Var.d + y, f3), Path.Direction.CW);
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
        l19 l19Var = new l19();
        l19Var.a = f7 - hl.L(3.0f);
        l19Var.b = f10 + hl.L(3.0f);
        l19Var.c = f9;
        l19Var.d = f4 + f8;
        l19Var.i = this.r;
        kmb kmbVar = this.s;
        l19Var.j = kmbVar;
        if (kmbVar != null) {
            l19Var.k = kmbVar.getX();
            l19Var.l = kmbVar.getY();
        }
        l19 l19Var2 = this.q;
        if (l19Var2 != null) {
            float f11 = l19Var2.d;
            l19Var2.h = (f11 + f9) / 2.0f;
            l19Var.g = (f11 + f9) / 2.0f;
        }
        this.l.add(l19Var);
        this.q = l19Var;
    }

    @Override // android.graphics.Path
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        a(f, f2, f3, f4);
    }

    public final void c(Canvas canvas, float f, float f2, Rect rect, float f3) {
        jx2 jx2Var;
        ArrayList arrayList;
        Rect rect2 = rect;
        int i = 0;
        float e = this.k.e(false, 1.0f);
        canvas.save();
        boolean z = this.f;
        jx2 jx2Var2 = this.j;
        wb2 wb2Var = this.a;
        Paint paint = this.i;
        if (z) {
            int U1 = hl.U1(e, hl.L(4.0f), 0);
            if (this.h != U1) {
                this.h = U1;
                paint.setPathEffect(new CornerPathEffect(U1));
            }
            jx2Var2.rewind();
            int Y1 = wb2Var.Y1(this.g);
            RectF rectF = hl.P;
            rectF.set(wb2Var.getBackgroundDrawableLeft(), wb2Var.X1(Y1), wb2Var.getBackgroundDrawableRight(), wb2Var.W1(Y1));
            hl.W1(rect2, rectF, e, rectF);
            jx2Var2.addRect(rectF, Path.Direction.CW);
            jx2Var2.a();
        } else {
            if (!this.e) {
                int i2 = this.t;
                ArrayList arrayList2 = this.l;
                if (i2 <= 1) {
                    canvas.translate(f, f2);
                    jx2Var2.rewind();
                    while (i < arrayList2.size()) {
                        jx2 jx2Var3 = jx2Var2;
                        b(jx2Var3, (l19) arrayList2.get(i), f, f2, rect2, e);
                        i++;
                        rect2 = rect;
                        jx2Var2 = jx2Var3;
                    }
                    jx2Var = jx2Var2;
                    jx2Var.a();
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * f3));
                    canvas.drawPath(jx2Var, paint);
                    paint.setAlpha(alpha);
                    canvas.restore();
                }
                canvas.translate(f, f2);
                jx2 jx2Var4 = null;
                int i3 = -1;
                int i4 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.u;
                    if (i4 >= size) {
                        break;
                    }
                    l19 l19Var = (l19) arrayList2.get(i4);
                    if (jx2Var4 != null) {
                        if (l19Var.e) {
                            jx2Var4.a();
                        }
                        jx2 jx2Var5 = jx2Var4;
                        float f4 = e;
                        Rect rect3 = rect2;
                        b(jx2Var5, l19Var, f, f2, rect3, f4);
                        jx2Var4 = jx2Var5;
                        rect2 = rect3;
                        e = f4;
                        i4++;
                    }
                    i3++;
                    if (i3 >= arrayList.size()) {
                        arrayList.add(new jx2());
                    }
                    jx2Var4 = (jx2) arrayList.get(i3);
                    jx2Var4.rewind();
                    jx2 jx2Var52 = jx2Var4;
                    float f42 = e;
                    Rect rect32 = rect2;
                    b(jx2Var52, l19Var, f, f2, rect32, f42);
                    jx2Var4 = jx2Var52;
                    rect2 = rect32;
                    e = f42;
                    i4++;
                }
                if (jx2Var4 != null) {
                    jx2Var4.a();
                }
                int alpha2 = paint.getAlpha();
                canvas.saveLayerAlpha(rect2.left - f, rect2.top - f2, rect2.right - f, rect2.bottom - f2, (int) (alpha2 * f3), 31);
                paint.setAlpha(jn7.d4);
                while (i <= i3) {
                    canvas.drawPath((Path) arrayList.get(i), paint);
                    i++;
                }
                paint.setAlpha(alpha2);
                canvas.restore();
                canvas.restore();
                return;
            }
            int U12 = hl.U1(e, hl.L(4.0f), 0);
            if (this.h != U12) {
                this.h = U12;
                paint.setPathEffect(new CornerPathEffect(U12));
            }
            jx2Var2.rewind();
            int e2 = wb2Var.e2(-this.c);
            RectF rectF2 = hl.P;
            rectF2.set(wb2Var.getBackgroundDrawableLeft(), wb2Var.X1(e2), wb2Var.getBackgroundDrawableRight(), wb2Var.W1(e2));
            hl.W1(rect2, rectF2, e, rectF2);
            jx2Var2.addRect(rectF2, Path.Direction.CW);
            jx2Var2.a();
        }
        jx2Var = jx2Var2;
        int alpha3 = paint.getAlpha();
        paint.setAlpha((int) (alpha3 * f3));
        canvas.drawPath(jx2Var, paint);
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
            l19 l19Var = (l19) arrayList.get(i);
            if (i == 0 || ((l19) arrayList.get(i - 1)).i != l19Var.i) {
                l19Var.e = true;
                l19Var.c -= hl.L(0.66f);
            }
            if (i == arrayList.size() - 1 || ((l19) arrayList.get(i + 1)).i != l19Var.i) {
                l19Var.f = true;
                l19Var.d += hl.L(0.66f);
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

    public m19(wb2 wb2Var, int i, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new jx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = wb2Var;
        this.k = new mm(0.0f, new ib2(wb2Var, (byte) 13), 350L, 420L, k43.h);
        this.b = i;
        this.g = bArr;
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = true;
        int L = hl.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public m19(wb2 wb2Var, int i, int i2) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new jx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = wb2Var;
        this.k = new mm(0.0f, new ib2(wb2Var, (byte) 12), 350L, 420L, k43.h);
        this.b = i;
        int i3 = -i2;
        this.c = i3;
        this.d = i3;
        this.e = true;
        this.f = false;
        int L = hl.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public m19(final wb2 wb2Var, final ViewParent viewParent, int i, hl9 hl9Var, int i2, int i3) {
        final byte b = 1;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new jx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        this.k = new mm(0.0f, new Runnable() { // from class: k19
            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                Object obj = viewParent;
                wb2 wb2Var2 = wb2Var;
                switch (b2) {
                    case 0:
                        wb2Var2.invalidate();
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                    default:
                        wb2Var2.invalidate();
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, k43.h);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = false;
        this.f = false;
        if (hl9Var == null) {
            return;
        }
        ArrayList arrayList = hl9Var.n;
        int L = hl.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.p = -3.4028235E38f;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            kmb kmbVar = (kmb) arrayList.get(i4);
            Layout a = kmbVar == null ? null : kmbVar.a();
            if (a != null && a.getText() != null) {
                int intValue = ((Integer) hl9Var.o.get(i4)).intValue();
                int length = a.getText().length();
                int j = Utilities.j(i2 - intValue, length, 0);
                int j2 = Utilities.j(i3 - intValue, length, 0);
                if (j < j2) {
                    this.n = kmbVar.getX();
                    this.o = kmbVar.getY();
                    this.s = kmbVar;
                    this.q = null;
                    int size = this.l.size();
                    if (hl.J1(a.getText())) {
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
