// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class g1d extends Layout {
    public final f1d a;

    public g1d(f1d f1dVar) {
        super(f1dVar.a, h1d.b, Math.max(1, f1dVar.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f);
        this.a = f1dVar;
    }

    @Override // android.text.Layout
    public final int getBottomPadding() {
        return 0;
    }

    @Override // android.text.Layout
    public final int getEllipsisCount(int i) {
        return 0;
    }

    @Override // android.text.Layout
    public final int getEllipsisStart(int i) {
        return 0;
    }

    @Override // android.text.Layout
    public final boolean getLineContainsTab(int i) {
        return false;
    }

    @Override // android.text.Layout
    public final int getLineCount() {
        return this.a.g.length;
    }

    @Override // android.text.Layout
    public final int getLineDescent(int i) {
        return 0;
    }

    @Override // android.text.Layout
    public final Layout.Directions getLineDirections(int i) {
        return null;
    }

    @Override // android.text.Layout
    public final int getLineForOffset(int i) {
        int i2 = 0;
        while (true) {
            f1d f1dVar = this.a;
            if (i2 >= f1dVar.g.length) {
                return r2.length - 1;
            }
            int i3 = i2 + 1;
            if (i < f1dVar.e[i3]) {
                return i2;
            }
            i2 = i3;
        }
    }

    @Override // android.text.Layout
    public final float getLineLeft(int i) {
        return this.a.g[Math.max(0, Math.min(i, r1.length - 1))][0];
    }

    @Override // android.text.Layout
    public final float getLineMax(int i) {
        return getLineRight(i);
    }

    @Override // android.text.Layout
    public final float getLineRight(int i) {
        return this.a.g[Math.max(0, Math.min(i, r1.length - 1))][r1.length - 1];
    }

    @Override // android.text.Layout
    public final int getLineStart(int i) {
        f1d f1dVar = this.a;
        return f1dVar.e[Math.max(0, Math.min(i, f1dVar.g.length))];
    }

    @Override // android.text.Layout
    public final int getLineTop(int i) {
        f1d f1dVar = this.a;
        return f1dVar.f[Math.max(0, Math.min(i, f1dVar.g.length))];
    }

    @Override // android.text.Layout
    public final float getLineWidth(int i) {
        return getLineRight(i) - getLineLeft(i);
    }

    @Override // android.text.Layout
    public final int getOffsetForHorizontal(int i, float f) {
        f1d f1dVar = this.a;
        int max = Math.max(0, Math.min(i, f1dVar.g.length - 1));
        float[] fArr = f1dVar.g[max];
        int[] iArr = f1dVar.e;
        int i2 = iArr[max + 1] - iArr[max];
        int i3 = 0;
        for (int i4 = 0; i4 <= i2 && i4 < fArr.length; i4++) {
            if (i4 < i2) {
                int i5 = i4 + 1;
                if (f >= (fArr[i4] + fArr[i5]) / 2.0f) {
                    i3 = i5;
                }
            }
        }
        if (i3 == i2 && i2 > 0 && max < r1.length - 1 && Character.isWhitespace(f1dVar.a.charAt((iArr[max] + i2) - 1))) {
            i3--;
        }
        return iArr[max] + i3;
    }

    @Override // android.text.Layout
    public final int getParagraphDirection(int i) {
        return 1;
    }

    @Override // android.text.Layout
    public final float getPrimaryHorizontal(int i) {
        int lineForOffset = getLineForOffset(i);
        f1d f1dVar = this.a;
        return f1dVar.g[lineForOffset][Math.max(0, Math.min(i - f1dVar.e[lineForOffset], r1.length - 1))];
    }

    @Override // android.text.Layout
    public final float getSecondaryHorizontal(int i) {
        return getPrimaryHorizontal(i);
    }

    @Override // android.text.Layout
    public final void getSelectionPath(int i, int i2, Path path) {
        Path path2;
        path.reset();
        if (i != i2) {
            if (i2 < i) {
                i2 = i;
                i = i2;
            }
            int lineForOffset = getLineForOffset(i);
            int lineForOffset2 = getLineForOffset(i2);
            int i3 = lineForOffset;
            while (i3 <= lineForOffset2) {
                float primaryHorizontal = i3 == lineForOffset ? getPrimaryHorizontal(i) : getLineLeft(i3);
                float primaryHorizontal2 = i3 == lineForOffset2 ? getPrimaryHorizontal(i2) : getLineRight(i3);
                if (primaryHorizontal2 > primaryHorizontal) {
                    path2 = path;
                    path2.addRect(primaryHorizontal, getLineTop(i3), primaryHorizontal2, getLineTop(i3 + 1), Path.Direction.CW);
                } else {
                    path2 = path;
                }
                i3++;
                path = path2;
            }
        }
    }

    @Override // android.text.Layout
    public final int getTopPadding() {
        return 0;
    }

    @Override // android.text.Layout
    public final boolean isRtlCharAt(int i) {
        return false;
    }

    @Override // android.text.Layout
    public final void draw(Canvas canvas, Path path, Paint paint, int i) {
    }

    @Override // android.text.Layout
    public final void draw(Canvas canvas) {
    }
}
