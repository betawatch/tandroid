package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    public static /* synthetic */ void a(o9 o9Var, Runnable[] runnableArr, Bitmap bitmap, f50 f50Var, int i7, c8.ja[] jaVarArr) {
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
            fVar.put(f50Var, bitmap);
        } else {
            fVar.remove(f50Var);
            o9Var.c.remove(f50Var);
        }
        runnableArr[i7] = null;
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
        c8.ja jaVar = jaVarArr[0];
        if (jaVar != null) {
            jaVar.b(f50Var.a, f50Var.b);
            if (z10) {
                return;
            }
            jaVarArr[0].a();
            jaVarArr[0] = null;
        }
    }

    public static GradientDrawable.Orientation d(int i7) {
        return i7 != 0 ? i7 != 90 ? i7 != 135 ? i7 != 180 ? i7 != 225 ? i7 != 270 ? i7 != 315 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BR_TL : GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.TR_BL : GradientDrawable.Orientation.TOP_BOTTOM : GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.BOTTOM_TOP;
    }

    public static Rect e(GradientDrawable.Orientation orientation, int i7, int i10) {
        Rect rect = new Rect();
        switch (m9.a[orientation.ordinal()]) {
            case 1:
                int i11 = i7 / 2;
                rect.left = i11;
                rect.top = 0;
                rect.right = i11;
                rect.bottom = i10;
                break;
            case 2:
                rect.left = i7;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = i10;
                break;
            case 3:
                rect.left = i7;
                int i12 = i10 / 2;
                rect.top = i12;
                rect.right = 0;
                rect.bottom = i12;
                break;
            case 4:
                rect.left = i7;
                rect.top = i10;
                rect.right = 0;
                rect.bottom = 0;
                break;
            case 5:
                int i13 = i7 / 2;
                rect.left = i13;
                rect.top = i10;
                rect.right = i13;
                rect.bottom = 0;
                break;
            case 6:
                rect.left = 0;
                rect.top = i10;
                rect.right = i7;
                rect.bottom = 0;
                break;
            case 7:
                rect.left = 0;
                int i14 = i10 / 2;
                rect.top = i14;
                rect.right = i7;
                rect.bottom = i14;
                break;
            default:
                rect.left = 0;
                rect.top = 0;
                rect.right = i7;
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
            org.telegram.messenger.q5 q5Var = Utilities.e;
            Runnable[] runnableArr = (Runnable[]) this.e.remove(size);
            q5Var.getClass();
            for (Runnable runnable : runnableArr) {
                q5Var.a(runnable);
            }
        }
        for (int i7 = this.b.c - 1; i7 >= 0; i7--) {
            Bitmap bitmap = (Bitmap) this.b.g(i7);
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
        int i7 = fVar.c;
        int i10 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i10 >= i7) {
                n9 n9Var = (n9) fVar2.remove(viewGroup);
                if (n9Var != null) {
                    n9Var.dispose();
                }
                f50 f50Var = new f50(width, height);
                fVar.put(f50Var, null);
                this.c.put(f50Var, Boolean.TRUE);
                final j9 g10 = g(new f50[]{f50Var}, new l9(this, viewGroup), 0L);
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
            f50 f50Var2 = (f50) fVar.f(i10);
            if (f50Var2.a == width && f50Var2.b == height) {
                Bitmap bitmap = (Bitmap) fVar.i(i10);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f);
                } else {
                    super.draw(canvas);
                }
                return (n9) fVar2.get(viewGroup);
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
        int i7 = fVar.c;
        float f10 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i10 = 0; i10 < i7; i10++) {
            f50 f50Var = (f50) fVar.f(i10);
            float f11 = f10;
            float sqrt = (float) Math.sqrt(Math.pow(height - f50Var.b, 2.0d) + Math.pow(width - f50Var.a, 2.0d));
            if (sqrt >= f11 || (bitmap = (Bitmap) fVar.i(i10)) == null || ((bool = (Boolean) this.c.get(f50Var)) != null && bool.booleanValue())) {
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

    public final j9 f(org.telegram.ui.ActionBar.i5 i5Var, c8.ja jaVar, long j3) {
        f50[] f50VarArr = (f50[]) i5Var.a;
        if (!this.g) {
            ArrayList arrayList = new ArrayList(f50VarArr.length);
            for (f50 f50Var : f50VarArr) {
                a0.f fVar = this.b;
                if (!fVar.containsKey(f50Var)) {
                    fVar.put(f50Var, null);
                    arrayList.add(f50Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((f50[]) arrayList.toArray(new f50[0]), jaVar, j3);
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

    public final j9 g(f50[] f50VarArr, c8.ja jaVar, long j3) {
        if (f50VarArr.length == 0) {
            return null;
        }
        c8.ja[] jaVarArr = {jaVar};
        Runnable[] runnableArr = new Runnable[f50VarArr.length];
        this.e.add(runnableArr);
        for (int i7 = 0; i7 < f50VarArr.length; i7++) {
            f50 f50Var = f50VarArr[i7];
            if (f50Var.a != 0 && f50Var.b != 0) {
                org.telegram.messenger.q5 q5Var = Utilities.e;
                i9 i9Var = new i9(this, f50Var, runnableArr, i7, jaVarArr);
                runnableArr[i7] = i9Var;
                q5Var.d(i9Var, j3);
            }
        }
        return new j9(this, jaVarArr, runnableArr, f50VarArr);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        super.setAlpha(i7);
        this.f.setAlpha(i7);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f.setColorFilter(colorFilter);
    }
}
