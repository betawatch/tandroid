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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v9 extends GradientDrawable {
    public final int[] a;
    public final a0.f b;
    public final a0.f c;
    public final a0.f d;
    public final ArrayList e;
    public final Paint f;
    public boolean g;

    public v9(GradientDrawable.Orientation orientation, int[] iArr) {
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

    public static /* synthetic */ void a(v9 v9Var, Runnable[] runnableArr, Bitmap bitmap, h60 h60Var, int i10, w7.x5[] x5VarArr) {
        a0.f fVar = v9Var.b;
        ArrayList arrayList = v9Var.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(h60Var, bitmap);
        } else {
            fVar.remove(h60Var);
            v9Var.c.remove(h60Var);
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
        w7.x5 x5Var = x5VarArr[0];
        if (x5Var != null) {
            x5Var.b(h60Var.a, h60Var.b);
            if (z10) {
                return;
            }
            x5VarArr[0].a();
            x5VarArr[0] = null;
        }
    }

    public static GradientDrawable.Orientation d(int i10) {
        return i10 != 0 ? i10 != 90 ? i10 != 135 ? i10 != 180 ? i10 != 225 ? i10 != 270 ? i10 != 315 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BR_TL : GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.TR_BL : GradientDrawable.Orientation.TOP_BOTTOM : GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.BOTTOM_TOP;
    }

    public static Rect e(GradientDrawable.Orientation orientation, int i10, int i11) {
        Rect rect = new Rect();
        switch (t9.a[orientation.ordinal()]) {
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

    public final u9 c(Canvas canvas, final ViewGroup viewGroup) {
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
                u9 u9Var = (u9) fVar2.remove(viewGroup);
                if (u9Var != null) {
                    u9Var.dispose();
                }
                h60 h60Var = new h60(width, height);
                fVar.put(h60Var, null);
                this.c.put(h60Var, Boolean.TRUE);
                final q9 g10 = g(new h60[]{h60Var}, new s9(this, viewGroup), 0L);
                u9 u9Var2 = (u9) fVar2.put(viewGroup, new u9() { // from class: org.telegram.ui.Components.r9
                    @Override // org.telegram.ui.Components.u9
                    public final void dispose() {
                        v9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return u9Var2;
            }
            h60 h60Var2 = (h60) fVar.e(i11);
            if (h60Var2.a == width && h60Var2.b == height) {
                Bitmap bitmap = (Bitmap) fVar.h(i11);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f);
                } else {
                    super.draw(canvas);
                }
                return (u9) fVar2.get(viewGroup);
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
            h60 h60Var = (h60) fVar.e(i11);
            float f10 = f7;
            float sqrt = (float) Math.sqrt(Math.pow(height - h60Var.b, 2.0d) + Math.pow(width - h60Var.a, 2.0d));
            if (sqrt >= f10 || (bitmap = (Bitmap) fVar.h(i11)) == null || ((bool = (Boolean) this.c.get(h60Var)) != null && bool.booleanValue())) {
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

    public final q9 f(o0.b bVar, w7.x5 x5Var, long j3) {
        h60[] h60VarArr = (h60[]) bVar.a;
        if (!this.g) {
            ArrayList arrayList = new ArrayList(h60VarArr.length);
            for (h60 h60Var : h60VarArr) {
                a0.f fVar = this.b;
                if (!fVar.containsKey(h60Var)) {
                    fVar.put(h60Var, null);
                    arrayList.add(h60Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((h60[]) arrayList.toArray(new h60[0]), x5Var, j3);
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

    public final q9 g(h60[] h60VarArr, w7.x5 x5Var, long j3) {
        if (h60VarArr.length == 0) {
            return null;
        }
        w7.x5[] x5VarArr = {x5Var};
        Runnable[] runnableArr = new Runnable[h60VarArr.length];
        this.e.add(runnableArr);
        for (int i10 = 0; i10 < h60VarArr.length; i10++) {
            h60 h60Var = h60VarArr[i10];
            if (h60Var.a != 0 && h60Var.b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                p9 p9Var = new p9(this, h60Var, runnableArr, i10, x5VarArr);
                runnableArr[i10] = p9Var;
                dispatchQueue.postRunnable(p9Var, j3);
            }
        }
        return new q9(this, x5VarArr, runnableArr, h60VarArr);
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
