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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n9 extends GradientDrawable {
    public final int[] a;
    public final a0.f b;
    public final a0.f c;
    public final a0.f d;
    public final ArrayList e;
    public final Paint f;
    public boolean g;

    public n9(GradientDrawable.Orientation orientation, int[] iArr) {
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

    public static /* synthetic */ void a(n9 n9Var, Runnable[] runnableArr, Bitmap bitmap, h50 h50Var, int i9, g7.b6[] b6VarArr) {
        a0.f fVar = n9Var.b;
        ArrayList arrayList = n9Var.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(h50Var, bitmap);
        } else {
            fVar.remove(h50Var);
            n9Var.c.remove(h50Var);
        }
        runnableArr[i9] = null;
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
        g7.b6 b6Var = b6VarArr[0];
        if (b6Var != null) {
            b6Var.b(h50Var.a, h50Var.b);
            if (z10) {
                return;
            }
            b6VarArr[0].a();
            b6VarArr[0] = null;
        }
    }

    public static GradientDrawable.Orientation d(int i9) {
        return i9 != 0 ? i9 != 90 ? i9 != 135 ? i9 != 180 ? i9 != 225 ? i9 != 270 ? i9 != 315 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BR_TL : GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.TR_BL : GradientDrawable.Orientation.TOP_BOTTOM : GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.BOTTOM_TOP;
    }

    public static Rect e(GradientDrawable.Orientation orientation, int i9, int i10) {
        Rect rect = new Rect();
        switch (l9.a[orientation.ordinal()]) {
            case 1:
                int i11 = i9 / 2;
                rect.left = i11;
                rect.top = 0;
                rect.right = i11;
                rect.bottom = i10;
                break;
            case 2:
                rect.left = i9;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = i10;
                break;
            case 3:
                rect.left = i9;
                int i12 = i10 / 2;
                rect.top = i12;
                rect.right = 0;
                rect.bottom = i12;
                break;
            case 4:
                rect.left = i9;
                rect.top = i10;
                rect.right = 0;
                rect.bottom = 0;
                break;
            case 5:
                int i13 = i9 / 2;
                rect.left = i13;
                rect.top = i10;
                rect.right = i13;
                rect.bottom = 0;
                break;
            case 6:
                rect.left = 0;
                rect.top = i10;
                rect.right = i9;
                rect.bottom = 0;
                break;
            case 7:
                rect.left = 0;
                int i14 = i10 / 2;
                rect.top = i14;
                rect.right = i9;
                rect.bottom = i14;
                break;
            default:
                rect.left = 0;
                rect.top = 0;
                rect.right = i9;
                rect.bottom = i10;
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
        for (int i9 = this.b.c - 1; i9 >= 0; i9--) {
            Bitmap bitmap = (Bitmap) this.b.f(i9);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.c.clear();
        this.d.clear();
        this.g = true;
    }

    public final m9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.b;
        int i9 = fVar.c;
        int i10 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i10 >= i9) {
                m9 m9Var = (m9) fVar2.remove(viewGroup);
                if (m9Var != null) {
                    m9Var.dispose();
                }
                h50 h50Var = new h50(width, height);
                fVar.put(h50Var, null);
                this.c.put(h50Var, Boolean.TRUE);
                final i9 g10 = g(new h50[]{h50Var}, new k9(this, viewGroup), 0L);
                m9 m9Var2 = (m9) fVar2.put(viewGroup, new m9() { // from class: org.telegram.ui.Components.j9
                    @Override // org.telegram.ui.Components.m9
                    public final void dispose() {
                        n9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return m9Var2;
            }
            h50 h50Var2 = (h50) fVar.e(i10);
            if (h50Var2.a == width && h50Var2.b == height) {
                Bitmap bitmap = (Bitmap) fVar.h(i10);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f);
                } else {
                    super.draw(canvas);
                }
                return (m9) fVar2.get(viewGroup);
            }
            i10++;
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
        int i9 = fVar.c;
        float f10 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i10 = 0; i10 < i9; i10++) {
            h50 h50Var = (h50) fVar.e(i10);
            float f11 = f10;
            float sqrt = (float) Math.sqrt(Math.pow(height - h50Var.b, 2.0d) + Math.pow(width - h50Var.a, 2.0d));
            if (sqrt >= f11 || (bitmap = (Bitmap) fVar.h(i10)) == null || ((bool = (Boolean) this.c.get(h50Var)) != null && bool.booleanValue())) {
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

    public final i9 f(m5.c0 c0Var, g7.b6 b6Var, long j10) {
        h50[] h50VarArr = (h50[]) c0Var.b;
        if (!this.g) {
            ArrayList arrayList = new ArrayList(h50VarArr.length);
            for (h50 h50Var : h50VarArr) {
                a0.f fVar = this.b;
                if (!fVar.containsKey(h50Var)) {
                    fVar.put(h50Var, null);
                    arrayList.add(h50Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((h50[]) arrayList.toArray(new h50[0]), b6Var, j10);
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

    public final i9 g(h50[] h50VarArr, g7.b6 b6Var, long j10) {
        if (h50VarArr.length == 0) {
            return null;
        }
        g7.b6[] b6VarArr = {b6Var};
        Runnable[] runnableArr = new Runnable[h50VarArr.length];
        this.e.add(runnableArr);
        for (int i9 = 0; i9 < h50VarArr.length; i9++) {
            h50 h50Var = h50VarArr[i9];
            if (h50Var.a != 0 && h50Var.b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                h9 h9Var = new h9(this, h50Var, runnableArr, i9, b6VarArr);
                runnableArr[i9] = h9Var;
                dispatchQueue.postRunnable(h9Var, j10);
            }
        }
        return new i9(this, b6VarArr, runnableArr, h50VarArr);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        super.setAlpha(i9);
        this.f.setAlpha(i9);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f.setColorFilter(colorFilter);
    }
}
