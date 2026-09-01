package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class o9 extends GradientDrawable {
    public final int[] a;
    public final a0.f b;
    public final a0.f c;
    public final a0.f d;
    public final ArrayList e;
    public final Paint f;
    public boolean g;

    public o9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.b = new a0.f(0);
        this.c = new a0.f(0);
        this.d = new a0.f(0);
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.g = false;
        setDither(true);
        this.a = iArr;
        paint.setDither(true);
    }

    public static /* synthetic */ void a(o9 o9Var, Runnable[] runnableArr, Bitmap bitmap, b60 b60Var, int i10, k7.z5[] z5VarArr) {
        a0.f fVar = o9Var.b;
        ArrayList arrayList = o9Var.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(b60Var, bitmap);
        } else {
            fVar.remove(b60Var);
            o9Var.c.remove(b60Var);
        }
        runnableArr[i10] = null;
        boolean z4 = true;
        if (runnableArr.length > 1) {
            for (Runnable runnable : runnableArr) {
                if (runnable != null) {
                    break;
                }
            }
        }
        z4 = false;
        if (!z4) {
            arrayList.remove(runnableArr);
        }
        k7.z5 z5Var = z5VarArr[0];
        if (z5Var != null) {
            z5Var.b(b60Var.a, b60Var.b);
            if (z4) {
                return;
            }
            z5VarArr[0].a();
            z5VarArr[0] = null;
        }
    }

    public static GradientDrawable.Orientation d(int i10) {
        return i10 != 0 ? i10 != 90 ? i10 != 135 ? i10 != 180 ? i10 != 225 ? i10 != 270 ? i10 != 315 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BR_TL : GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.TR_BL : GradientDrawable.Orientation.TOP_BOTTOM : GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.BOTTOM_TOP;
    }

    public static Rect e(GradientDrawable.Orientation orientation, int i10, int i11) {
        Rect rect = new Rect();
        switch (m9.a[orientation.ordinal()]) {
            case 1:
                int i12 = i10 / 2;
                rect.left = i12;
                rect.top = 0;
                rect.right = i12;
                rect.bottom = i11;
                break;
            case 2:
                rect.left = i10;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = i11;
                break;
            case 3:
                rect.left = i10;
                int i13 = i11 / 2;
                rect.top = i13;
                rect.right = 0;
                rect.bottom = i13;
                break;
            case 4:
                rect.left = i10;
                rect.top = i11;
                rect.right = 0;
                rect.bottom = 0;
                break;
            case 5:
                int i14 = i10 / 2;
                rect.left = i14;
                rect.top = i11;
                rect.right = i14;
                rect.bottom = 0;
                break;
            case 6:
                rect.left = 0;
                rect.top = i11;
                rect.right = i10;
                rect.bottom = 0;
                break;
            case 7:
                rect.left = 0;
                int i15 = i11 / 2;
                rect.top = i15;
                rect.right = i10;
                rect.bottom = i15;
                break;
            default:
                rect.left = 0;
                rect.top = 0;
                rect.right = i10;
                rect.bottom = i11;
                break;
        }
        return rect;
    }

    public final void b() {
        if (this.g) {
            return;
        }
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Utilities.globalQueue.cancelRunnables((Runnable[]) this.e.remove(size));
        }
        for (int i10 = this.b.c - 1; i10 >= 0; i10--) {
            Bitmap bitmap = (Bitmap) this.b.f(i10);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.c.clear();
        this.d.clear();
        this.g = true;
    }

    public final n9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.b;
        int i10 = fVar.c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 >= i10) {
                n9 n9Var = (n9) fVar2.remove(viewGroup);
                if (n9Var != null) {
                    n9Var.dispose();
                }
                b60 b60Var = new b60(width, height);
                fVar.put(b60Var, null);
                this.c.put(b60Var, Boolean.TRUE);
                final j9 g10 = g(new b60[]{b60Var}, new l9(this, viewGroup), 0L);
                n9 n9Var2 = (n9) fVar2.put(viewGroup, new n9() { // from class: org.telegram.ui.Components.k9
                    @Override // org.telegram.ui.Components.n9
                    public final void dispose() {
                        o9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return n9Var2;
            }
            b60 b60Var2 = (b60) fVar.e(i11);
            if (b60Var2.a == width && b60Var2.b == height) {
                Bitmap bitmap = (Bitmap) fVar.h(i11);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f);
                } else {
                    super.draw(canvas);
                }
                return (n9) fVar2.get(viewGroup);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.b;
        int i10 = fVar.c;
        float f10 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            b60 b60Var = (b60) fVar.e(i11);
            float f11 = f10;
            float sqrt = (float) Math.sqrt(Math.pow(height - b60Var.b, 2.0d) + Math.pow(width - b60Var.a, 2.0d));
            if (sqrt >= f11 || (bitmap = (Bitmap) fVar.h(i11)) == null || ((bool = (Boolean) this.c.get(b60Var)) != null && bool.booleanValue())) {
                f10 = f11;
            } else {
                bitmap2 = bitmap;
                f10 = sqrt;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f);
        } else {
            super.draw(canvas);
        }
    }

    public final j9 f(org.telegram.ui.Cells.f1 f1Var, k7.z5 z5Var, long j10) {
        b60[] b60VarArr = (b60[]) f1Var.b;
        if (!this.g) {
            ArrayList arrayList = new ArrayList(b60VarArr.length);
            for (b60 b60Var : b60VarArr) {
                a0.f fVar = this.b;
                if (!fVar.containsKey(b60Var)) {
                    fVar.put(b60Var, null);
                    arrayList.add(b60Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((b60[]) arrayList.toArray(new b60[0]), z5Var, j10);
            }
        }
        return null;
    }

    public final void finalize() {
        try {
            b();
        } finally {
            super.finalize();
        }
    }

    public final j9 g(b60[] b60VarArr, k7.z5 z5Var, long j10) {
        if (b60VarArr.length == 0) {
            return null;
        }
        k7.z5[] z5VarArr = {z5Var};
        Runnable[] runnableArr = new Runnable[b60VarArr.length];
        this.e.add(runnableArr);
        for (int i10 = 0; i10 < b60VarArr.length; i10++) {
            b60 b60Var = b60VarArr[i10];
            if (b60Var.a != 0 && b60Var.b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                i9 i9Var = new i9(this, b60Var, runnableArr, i10, z5VarArr);
                runnableArr[i10] = i9Var;
                dispatchQueue.postRunnable(i9Var, j10);
            }
        }
        return new j9(this, z5VarArr, runnableArr, b60VarArr);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f.setAlpha(i10);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f.setColorFilter(colorFilter);
    }
}
