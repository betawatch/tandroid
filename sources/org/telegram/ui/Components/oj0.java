package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class oj0 extends Path {
    public final org.telegram.ui.Cells.t1 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final dr j;
    public final f6 k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public nj0 q;
    public final int r;
    public final org.telegram.ui.Cells.z9 s;
    public final int t;
    public final ArrayList u;

    public oj0(final org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new dr();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = t1Var;
        final int i12 = 0;
        this.k = new f6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.mj0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        org.telegram.ui.Cells.t1 t1Var2 = t1Var;
                        if (t1Var2 != null) {
                            t1Var2.invalidate();
                        }
                        if (t1Var2.getParent() instanceof View) {
                            ((View) t1Var2.getParent()).invalidate();
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.t1 t1Var3 = t1Var;
                        if (t1Var3 != null) {
                            t1Var3.invalidate();
                        }
                        if (t1Var3.getParent() instanceof View) {
                            ((View) t1Var3.getParent()).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, bs.h);
        this.b = i10;
        int i13 = -i11;
        this.c = i13;
        this.d = i13;
        this.e = true;
        this.f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public static void b(dr drVar, nj0 nj0Var, float f7, float f10, Rect rect, float f11) {
        float x10 = nj0Var.j != null ? r0.getX() - nj0Var.k : 0.0f;
        float y3 = nj0Var.j != null ? r2.getY() - nj0Var.l : 0.0f;
        drVar.addRect(AndroidUtilities.lerp(rect.left - f7, nj0Var.a + x10, f11), AndroidUtilities.lerp(nj0Var.e ? rect.top - f10 : nj0Var.g + y3, nj0Var.c + y3, f11), AndroidUtilities.lerp(rect.right - f7, nj0Var.b + x10, f11), AndroidUtilities.lerp(nj0Var.f ? rect.bottom - f10 : nj0Var.h + y3, nj0Var.d + y3, f11), Path.Direction.CW);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.n;
        float f15 = max + f14;
        float f16 = this.o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        nj0 nj0Var = new nj0();
        nj0Var.a = f15 - AndroidUtilities.dp(3.0f);
        nj0Var.b = f18 + AndroidUtilities.dp(3.0f);
        nj0Var.c = f17;
        nj0Var.d = f12 + f16;
        nj0Var.i = this.r;
        org.telegram.ui.Cells.z9 z9Var = this.s;
        nj0Var.j = z9Var;
        if (z9Var != null) {
            nj0Var.k = z9Var.getX();
            nj0Var.l = z9Var.getY();
        }
        nj0 nj0Var2 = this.q;
        if (nj0Var2 != null) {
            float f19 = nj0Var2.d;
            nj0Var2.h = (f19 + f17) / 2.0f;
            nj0Var.g = (f19 + f17) / 2.0f;
        }
        this.l.add(nj0Var);
        this.q = nj0Var;
    }

    @Override // android.graphics.Path
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void c(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i10 = 0;
        float d = this.k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f;
        org.telegram.ui.Cells.t1 t1Var = this.a;
        dr drVar = this.j;
        Paint paint = this.i;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            drVar.rewind();
            int H2 = t1Var.H2(this.g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(t1Var.getBackgroundDrawableLeft(), t1Var.G2(H2), t1Var.getBackgroundDrawableRight(), t1Var.F2(H2));
            AndroidUtilities.lerp(rect2, rectF, d, rectF);
            drVar.addRect(rectF, Path.Direction.CW);
            drVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            drVar.rewind();
            int N2 = t1Var.N2(-this.c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(t1Var.getBackgroundDrawableLeft(), t1Var.G2(N2), t1Var.getBackgroundDrawableRight(), t1Var.F2(N2));
            AndroidUtilities.lerp(rect2, rectF2, d, rectF2);
            drVar.addRect(rectF2, Path.Direction.CW);
            drVar.a();
        } else {
            int i11 = this.t;
            ArrayList arrayList2 = this.l;
            if (i11 > 1) {
                canvas.translate(f7, f10);
                dr drVar2 = null;
                int i12 = -1;
                int i13 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.u;
                    if (i13 >= size) {
                        break;
                    }
                    nj0 nj0Var = (nj0) arrayList2.get(i13);
                    if (drVar2 == null || nj0Var.e) {
                        if (drVar2 != null) {
                            drVar2.a();
                        }
                        i12++;
                        if (i12 >= arrayList.size()) {
                            arrayList.add(new dr());
                        }
                        drVar2 = (dr) arrayList.get(i12);
                        drVar2.rewind();
                    }
                    dr drVar3 = drVar2;
                    b(drVar3, nj0Var, f7, f10, rect2, d);
                    drVar2 = drVar3;
                    i13++;
                }
                if (drVar2 != null) {
                    drVar2.a();
                }
                int alpha = paint.getAlpha();
                canvas.saveLayerAlpha(rect2.left - f7, rect2.top - f10, rect2.right - f7, rect2.bottom - f10, (int) (alpha * f11), 31);
                paint.setAlpha(255);
                while (i10 <= i12) {
                    canvas.drawPath((Path) arrayList.get(i10), paint);
                    i10++;
                }
                paint.setAlpha(alpha);
                canvas.restore();
                canvas.restore();
                return;
            }
            canvas.translate(f7, f10);
            drVar.rewind();
            while (i10 < arrayList2.size()) {
                b(drVar, (nj0) arrayList2.get(i10), f7, f10, rect2, d);
                i10++;
                rect2 = rect;
            }
            drVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f11));
        canvas.drawPath(drVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i10 >= arrayList.size()) {
                return;
            }
            nj0 nj0Var = (nj0) arrayList.get(i10);
            if (i10 == 0 || ((nj0) arrayList.get(i10 - 1)).i != nj0Var.i) {
                nj0Var.e = true;
                nj0Var.c -= AndroidUtilities.dp(0.66f);
            }
            if (i10 == arrayList.size() - 1 || ((nj0) arrayList.get(i10 + 1)).i != nj0Var.i) {
                nj0Var.f = true;
                nj0Var.d += AndroidUtilities.dp(0.66f);
            }
            i10++;
        }
    }

    public final void e(Layout layout, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 < i10) {
            i11 = i10;
            i10 = i11;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineForOffset2 = layout.getLineForOffset(i11);
        int i12 = lineForOffset;
        while (i12 <= lineForOffset2) {
            int lineStart = layout.getLineStart(i12);
            int lineEnd = layout.getLineEnd(i12);
            if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(layout.getText().charAt(lineStart)))) {
                float lineLeft = (i12 != lineForOffset || i10 <= lineStart) ? layout.getLineLeft(i12) : layout.getPrimaryHorizontal(i10);
                float lineRight = (i12 != lineForOffset2 || i11 >= lineEnd) ? layout.getLineRight(i12) : layout.getPrimaryHorizontal(i11);
                a(Math.min(lineLeft, lineRight), layout.getLineTop(i12), Math.max(lineLeft, lineRight), layout.getLineBottom(i12));
            }
            i12++;
        }
    }

    public oj0(final org.telegram.ui.Cells.t1 t1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new dr();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = t1Var;
        final int i11 = 1;
        this.k = new f6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.mj0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        org.telegram.ui.Cells.t1 t1Var2 = t1Var;
                        if (t1Var2 != null) {
                            t1Var2.invalidate();
                        }
                        if (t1Var2.getParent() instanceof View) {
                            ((View) t1Var2.getParent()).invalidate();
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.t1 t1Var3 = t1Var;
                        if (t1Var3 != null) {
                            t1Var3.invalidate();
                        }
                        if (t1Var3.getParent() instanceof View) {
                            ((View) t1Var3.getParent()).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, bs.h);
        this.b = i10;
        this.g = bArr;
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public oj0(final org.telegram.ui.Cells.t1 t1Var, final ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new dr();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final int i14 = 0;
        this.k = new f6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.lj0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        t1Var.invalidate();
                        Object obj = viewParent;
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                    default:
                        t1Var.invalidate();
                        Object obj2 = viewParent;
                        if (obj2 instanceof View) {
                            ((View) obj2).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, bs.h);
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = false;
        this.f = false;
        if (arrayList == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        boolean z10 = false;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList.get(i15);
            if (textLayoutBlock != null && i11 <= textLayoutBlock.charactersEnd && i12 >= (i13 = textLayoutBlock.charactersOffset)) {
                int max = Math.max(0, i11 - i13);
                int i16 = textLayoutBlock.charactersOffset;
                int min = Math.min(i12 - i16, textLayoutBlock.charactersEnd - i16);
                float f10 = -f7;
                this.n = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.n = f10 + AndroidUtilities.dp(10.0f);
                }
                this.o = textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop;
                this.p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                z10 = z10 || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z10) {
                    textLayoutBlock.textLayout.getSelectionPath(max, min, this);
                } else {
                    e(textLayoutBlock.textLayout, max, min);
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
        }
        d();
    }

    public oj0(final org.telegram.ui.Cells.t1 t1Var, final ViewParent viewParent, int i10, RichMessageLayout richMessageLayout, int i11, int i12) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new dr();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final int i13 = 1;
        this.k = new f6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.lj0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        t1Var.invalidate();
                        Object obj = viewParent;
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                    default:
                        t1Var.invalidate();
                        Object obj2 = viewParent;
                        if (obj2 instanceof View) {
                            ((View) obj2).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, bs.h);
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = false;
        this.f = false;
        if (richMessageLayout == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        this.p = -3.4028235E38f;
        for (int i14 = 0; i14 < richMessageLayout.textBlocks.size(); i14++) {
            org.telegram.ui.Cells.z9 z9Var = richMessageLayout.textBlocks.get(i14);
            Layout layout = z9Var == null ? null : z9Var.getLayout();
            if (layout != null && layout.getText() != null) {
                int intValue = richMessageLayout.textBlockCharOffsets.get(i14).intValue();
                int length = layout.getText().length();
                int clamp = Utilities.clamp(i11 - intValue, length, 0);
                int clamp2 = Utilities.clamp(i12 - intValue, length, 0);
                if (clamp < clamp2) {
                    this.n = z9Var.getX();
                    this.o = z9Var.getY();
                    this.s = z9Var;
                    this.q = null;
                    int size = this.l.size();
                    if (AndroidUtilities.isRTL(layout.getText())) {
                        layout.getSelectionPath(clamp, clamp2, this);
                    } else {
                        e(layout, clamp, clamp2);
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
