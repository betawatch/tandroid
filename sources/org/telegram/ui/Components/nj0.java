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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class nj0 extends Path {
    public final org.telegram.ui.Cells.s1 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final fr j;
    public final h6 k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public mj0 q;
    public final int r;
    public final org.telegram.ui.Cells.da s;
    public final int t;
    public final ArrayList u;

    public nj0(final org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new fr();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = s1Var;
        final int i12 = 0;
        this.k = new h6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.lj0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        org.telegram.ui.Cells.s1 s1Var2 = s1Var;
                        if (s1Var2 != null) {
                            s1Var2.invalidate();
                        }
                        if (s1Var2.getParent() instanceof View) {
                            ((View) s1Var2.getParent()).invalidate();
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.s1 s1Var3 = s1Var;
                        if (s1Var3 != null) {
                            s1Var3.invalidate();
                        }
                        if (s1Var3.getParent() instanceof View) {
                            ((View) s1Var3.getParent()).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, ds.h);
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

    public static void b(fr frVar, mj0 mj0Var, float f7, float f10, Rect rect, float f11) {
        float x9 = mj0Var.j != null ? r0.getX() - mj0Var.k : 0.0f;
        float y3 = mj0Var.j != null ? r2.getY() - mj0Var.l : 0.0f;
        frVar.addRect(AndroidUtilities.lerp(rect.left - f7, mj0Var.a + x9, f11), AndroidUtilities.lerp(mj0Var.e ? rect.top - f10 : mj0Var.g + y3, mj0Var.c + y3, f11), AndroidUtilities.lerp(rect.right - f7, mj0Var.b + x9, f11), AndroidUtilities.lerp(mj0Var.f ? rect.bottom - f10 : mj0Var.h + y3, mj0Var.d + y3, f11), Path.Direction.CW);
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
        mj0 mj0Var = new mj0();
        mj0Var.a = f15 - AndroidUtilities.dp(3.0f);
        mj0Var.b = f18 + AndroidUtilities.dp(3.0f);
        mj0Var.c = f17;
        mj0Var.d = f12 + f16;
        mj0Var.i = this.r;
        org.telegram.ui.Cells.da daVar = this.s;
        mj0Var.j = daVar;
        if (daVar != null) {
            mj0Var.k = daVar.getX();
            mj0Var.l = daVar.getY();
        }
        mj0 mj0Var2 = this.q;
        if (mj0Var2 != null) {
            float f19 = mj0Var2.d;
            mj0Var2.h = (f19 + f17) / 2.0f;
            mj0Var.g = (f19 + f17) / 2.0f;
        }
        this.l.add(mj0Var);
        this.q = mj0Var;
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
        fr frVar = this.j;
        org.telegram.ui.Cells.s1 s1Var = this.a;
        Paint paint = this.i;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            frVar.rewind();
            int I2 = s1Var.I2(this.g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(s1Var.getBackgroundDrawableLeft(), s1Var.H2(I2), s1Var.getBackgroundDrawableRight(), s1Var.G2(I2));
            AndroidUtilities.lerp(rect2, rectF, d, rectF);
            frVar.addRect(rectF, Path.Direction.CW);
            frVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            frVar.rewind();
            int O2 = s1Var.O2(-this.c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(s1Var.getBackgroundDrawableLeft(), s1Var.H2(O2), s1Var.getBackgroundDrawableRight(), s1Var.G2(O2));
            AndroidUtilities.lerp(rect2, rectF2, d, rectF2);
            frVar.addRect(rectF2, Path.Direction.CW);
            frVar.a();
        } else {
            int i11 = this.t;
            ArrayList arrayList2 = this.l;
            if (i11 > 1) {
                canvas.translate(f7, f10);
                fr frVar2 = null;
                int i12 = -1;
                int i13 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.u;
                    if (i13 >= size) {
                        break;
                    }
                    mj0 mj0Var = (mj0) arrayList2.get(i13);
                    if (frVar2 == null || mj0Var.e) {
                        if (frVar2 != null) {
                            frVar2.a();
                        }
                        i12++;
                        if (i12 >= arrayList.size()) {
                            arrayList.add(new fr());
                        }
                        frVar2 = (fr) arrayList.get(i12);
                        frVar2.rewind();
                    }
                    fr frVar3 = frVar2;
                    b(frVar3, mj0Var, f7, f10, rect2, d);
                    frVar2 = frVar3;
                    i13++;
                }
                if (frVar2 != null) {
                    frVar2.a();
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
            frVar.rewind();
            while (i10 < arrayList2.size()) {
                b(frVar, (mj0) arrayList2.get(i10), f7, f10, rect2, d);
                i10++;
                rect2 = rect;
            }
            frVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f11));
        canvas.drawPath(frVar, paint);
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
            mj0 mj0Var = (mj0) arrayList.get(i10);
            if (i10 == 0 || ((mj0) arrayList.get(i10 - 1)).i != mj0Var.i) {
                mj0Var.e = true;
                mj0Var.c -= AndroidUtilities.dp(0.66f);
            }
            if (i10 == arrayList.size() - 1 || ((mj0) arrayList.get(i10 + 1)).i != mj0Var.i) {
                mj0Var.f = true;
                mj0Var.d += AndroidUtilities.dp(0.66f);
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

    public nj0(final org.telegram.ui.Cells.s1 s1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new fr();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = s1Var;
        final int i11 = 1;
        this.k = new h6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.lj0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        org.telegram.ui.Cells.s1 s1Var2 = s1Var;
                        if (s1Var2 != null) {
                            s1Var2.invalidate();
                        }
                        if (s1Var2.getParent() instanceof View) {
                            ((View) s1Var2.getParent()).invalidate();
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.s1 s1Var3 = s1Var;
                        if (s1Var3 != null) {
                            s1Var3.invalidate();
                        }
                        if (s1Var3.getParent() instanceof View) {
                            ((View) s1Var3.getParent()).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, ds.h);
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

    public nj0(final org.telegram.ui.Cells.s1 s1Var, final ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new fr();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final int i14 = 0;
        this.k = new h6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.kj0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        s1Var.invalidate();
                        Object obj = viewParent;
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                    default:
                        s1Var.invalidate();
                        Object obj2 = viewParent;
                        if (obj2 instanceof View) {
                            ((View) obj2).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, ds.h);
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

    public nj0(final org.telegram.ui.Cells.s1 s1Var, final ViewParent viewParent, int i10, RichMessageLayout richMessageLayout, int i11, int i12) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new fr();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final int i13 = 1;
        this.k = new h6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.kj0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        s1Var.invalidate();
                        Object obj = viewParent;
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                    default:
                        s1Var.invalidate();
                        Object obj2 = viewParent;
                        if (obj2 instanceof View) {
                            ((View) obj2).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, ds.h);
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
            org.telegram.ui.Cells.da daVar = richMessageLayout.textBlocks.get(i14);
            Layout layout = daVar == null ? null : daVar.getLayout();
            if (layout != null && layout.getText() != null) {
                int intValue = richMessageLayout.textBlockCharOffsets.get(i14).intValue();
                int length = layout.getText().length();
                int clamp = Utilities.clamp(i11 - intValue, length, 0);
                int clamp2 = Utilities.clamp(i12 - intValue, length, 0);
                if (clamp < clamp2) {
                    this.n = daVar.getX();
                    this.o = daVar.getY();
                    this.s = daVar;
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
