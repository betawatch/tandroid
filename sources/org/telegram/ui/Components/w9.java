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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class w9 extends GradientDrawable {
    public final int[] a;
    public final a0.f b;
    public final a0.f c;
    public final a0.f d;
    public final ArrayList e;
    public final Paint f;
    public boolean g;

    public w9(GradientDrawable.Orientation orientation, int[] iArr) {
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

    public static /* synthetic */ void a(w9 w9Var, Runnable[] runnableArr, Bitmap bitmap, y50 y50Var, int i10, w7.i0[] i0VarArr) {
        a0.f fVar = w9Var.b;
        ArrayList arrayList = w9Var.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(y50Var, bitmap);
        } else {
            fVar.remove(y50Var);
            w9Var.c.remove(y50Var);
        }
        runnableArr[i10] = null;
        boolean z10 = true;
        if (runnableArr.length > 1) {
            for (Runnable runnable : runnableArr) {
                if (runnable != null) {
                    break;
                }
            }
        }
        z10 = false;
        if (!z10) {
            arrayList.remove(runnableArr);
        }
        w7.i0 i0Var = i0VarArr[0];
        if (i0Var != null) {
            i0Var.b(y50Var.a, y50Var.b);
            if (z10) {
                return;
            }
            i0VarArr[0].a();
            i0VarArr[0] = null;
        }
    }

    public static GradientDrawable.Orientation d(int i10) {
        return i10 != 0 ? i10 != 90 ? i10 != 135 ? i10 != 180 ? i10 != 225 ? i10 != 270 ? i10 != 315 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BR_TL : GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.TR_BL : GradientDrawable.Orientation.TOP_BOTTOM : GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.BOTTOM_TOP;
    }

    public static Rect e(GradientDrawable.Orientation orientation, int i10, int i11) {
        Rect rect = new Rect();
        switch (u9.a[orientation.ordinal()]) {
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

    public final v9 c(Canvas canvas, final ViewGroup viewGroup) {
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
                v9 v9Var = (v9) fVar2.remove(viewGroup);
                if (v9Var != null) {
                    v9Var.dispose();
                }
                y50 y50Var = new y50(width, height);
                fVar.put(y50Var, null);
                this.c.put(y50Var, Boolean.TRUE);
                final r9 g10 = g(new y50[]{y50Var}, new t9(this, viewGroup), 0L);
                v9 v9Var2 = (v9) fVar2.put(viewGroup, new v9() { // from class: org.telegram.ui.Components.s9
                    @Override // org.telegram.ui.Components.v9
                    public final void dispose() {
                        w9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return v9Var2;
            }
            y50 y50Var2 = (y50) fVar.e(i11);
            if (y50Var2.a == width && y50Var2.b == height) {
                Bitmap bitmap = (Bitmap) fVar.h(i11);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f);
                } else {
                    super.draw(canvas);
                }
                return (v9) fVar2.get(viewGroup);
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
        float f7 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            y50 y50Var = (y50) fVar.e(i11);
            float f10 = f7;
            float sqrt = (float) Math.sqrt(Math.pow(height - y50Var.b, 2.0d) + Math.pow(width - y50Var.a, 2.0d));
            if (sqrt >= f10 || (bitmap = (Bitmap) fVar.h(i11)) == null || ((bool = (Boolean) this.c.get(y50Var)) != null && bool.booleanValue())) {
                f7 = f10;
            } else {
                bitmap2 = bitmap;
                f7 = sqrt;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f);
        } else {
            super.draw(canvas);
        }
    }

    public final r9 f(l.d dVar, w7.i0 i0Var, long j3) {
        y50[] y50VarArr = (y50[]) dVar.b;
        if (!this.g) {
            ArrayList arrayList = new ArrayList(y50VarArr.length);
            for (y50 y50Var : y50VarArr) {
                a0.f fVar = this.b;
                if (!fVar.containsKey(y50Var)) {
                    fVar.put(y50Var, null);
                    arrayList.add(y50Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((y50[]) arrayList.toArray(new y50[0]), i0Var, j3);
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

    public final r9 g(y50[] y50VarArr, w7.i0 i0Var, long j3) {
        if (y50VarArr.length == 0) {
            return null;
        }
        w7.i0[] i0VarArr = {i0Var};
        Runnable[] runnableArr = new Runnable[y50VarArr.length];
        this.e.add(runnableArr);
        for (int i10 = 0; i10 < y50VarArr.length; i10++) {
            y50 y50Var = y50VarArr[i10];
            if (y50Var.a != 0 && y50Var.b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                q9 q9Var = new q9(this, y50Var, runnableArr, i10, i0VarArr);
                runnableArr[i10] = q9Var;
                dispatchQueue.postRunnable(q9Var, j3);
            }
        }
        return new r9(this, i0VarArr, runnableArr, y50VarArr);
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
