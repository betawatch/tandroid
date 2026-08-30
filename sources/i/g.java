package i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import androidx.activity.i;
import j7.h8;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class g extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int x = 0;
    public b a;
    public Rect b;
    public Drawable c;
    public Drawable d;
    public int e;
    public boolean f;
    public int h;
    public boolean n;
    public i r;
    public long s;
    public long v;
    public f w;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z4) {
        boolean z10;
        Drawable drawable;
        boolean z11 = true;
        this.f = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            long j10 = this.s;
            if (j10 != 0) {
                if (j10 > uptimeMillis) {
                    drawable2.setAlpha(((255 - (((int) ((j10 - uptimeMillis) * 255)) / this.a.y)) * this.e) / 255);
                    z10 = true;
                    drawable = this.d;
                    if (drawable == null) {
                        long j11 = this.v;
                        if (j11 != 0) {
                            if (j11 > uptimeMillis) {
                                drawable.setAlpha(((((int) ((j11 - uptimeMillis) * 255)) / this.a.z) * this.e) / 255);
                                if (z4 && z11) {
                                    scheduleSelf(this.r, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                            drawable.setVisible(false, false);
                            this.d = null;
                            this.v = 0L;
                        }
                    } else {
                        this.v = 0L;
                    }
                    z11 = z10;
                    if (z4) {
                        return;
                    } else {
                        return;
                    }
                }
                drawable2.setAlpha(this.e);
                this.s = 0L;
            }
        } else {
            this.s = 0L;
        }
        z10 = false;
        drawable = this.d;
        if (drawable == null) {
        }
        z11 = z10;
        if (z4) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.a;
        if (theme == null) {
            bVar.getClass();
            return;
        }
        bVar.c();
        int i10 = bVar.h;
        Drawable[] drawableArr = bVar.g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i11].applyTheme(theme);
                bVar.e |= drawableArr[i11].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            bVar.b = resources;
            int i12 = resources.getDisplayMetrics().densityDpi;
            if (i12 == 0) {
                i12 = 160;
            }
            int i13 = bVar.c;
            bVar.c = i12;
            if (i13 != i12) {
                bVar.m = false;
                bVar.j = false;
            }
        }
    }

    public final void b(Drawable drawable) {
        if (this.w == null) {
            this.w = new f();
        }
        f fVar = this.w;
        fVar.b = drawable.getCallback();
        drawable.setCallback(fVar);
        try {
            if (this.a.y <= 0 && this.f) {
                drawable.setAlpha(this.e);
            }
            b bVar = this.a;
            if (bVar.C) {
                drawable.setColorFilter(bVar.B);
            } else {
                if (bVar.F) {
                    drawable.setTintList(bVar.D);
                }
                b bVar2 = this.a;
                if (bVar2.G) {
                    drawable.setTintMode(bVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                h8.b(h8.a(this), drawable);
            }
            drawable.setAutoMirrored(this.a.A);
            Rect rect = this.b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            f fVar2 = this.w;
            Drawable.Callback callback = (Drawable.Callback) fVar2.b;
            fVar2.b = null;
            drawable.setCallback(callback);
        } catch (Throwable th2) {
            f fVar3 = this.w;
            Drawable.Callback callback2 = (Drawable.Callback) fVar3.b;
            fVar3.b = null;
            drawable.setCallback(callback2);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i10) {
        i iVar;
        if (i10 == this.h) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.a.z > 0) {
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.c;
            if (drawable2 != null) {
                this.d = drawable2;
                this.v = this.a.z + uptimeMillis;
            } else {
                this.d = null;
                this.v = 0L;
            }
        } else {
            Drawable drawable3 = this.c;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i10 >= 0) {
            b bVar = this.a;
            if (i10 < bVar.h) {
                Drawable d = bVar.d(i10);
                this.c = d;
                this.h = i10;
                if (d != null) {
                    int i11 = this.a.y;
                    if (i11 > 0) {
                        this.s = uptimeMillis + i11;
                    }
                    b(d);
                }
                if (this.s == 0 || this.v != 0) {
                    iVar = this.r;
                    if (iVar != null) {
                        this.r = new i((e) this, 23);
                    } else {
                        unscheduleSelf(iVar);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.c = null;
        this.h = -1;
        if (this.s == 0) {
        }
        iVar = this.r;
        if (iVar != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z4;
        b bVar = this.a;
        if (!bVar.u) {
            bVar.c();
            bVar.u = true;
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.g;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    bVar.v = true;
                    z4 = true;
                    break;
                }
                if (drawableArr[i11].getConstantState() == null) {
                    bVar.v = false;
                    z4 = false;
                    break;
                }
                i11++;
            }
        } else {
            z4 = bVar.v;
        }
        if (!z4) {
            return null;
        }
        this.a.d = getChangingConfigurations();
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.a;
        if (bVar.l) {
            if (!bVar.m) {
                bVar.b();
            }
            return bVar.o;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.a;
        if (bVar.l) {
            if (!bVar.m) {
                bVar.b();
            }
            return bVar.n;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.a;
        if (bVar.l) {
            if (!bVar.m) {
                bVar.b();
            }
            return bVar.q;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.a;
        if (bVar.l) {
            if (!bVar.m) {
                bVar.b();
            }
            return bVar.p;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.c;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.a;
            if (bVar.r) {
                return bVar.s;
            }
            bVar.c();
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.g;
            r1 = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                r1 = Drawable.resolveOpacity(r1, drawableArr[i11].getOpacity());
            }
            bVar.s = r1;
            bVar.r = true;
        }
        return r1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.a;
        Rect rect2 = null;
        boolean z4 = false;
        if (!bVar.i) {
            Rect rect3 = bVar.k;
            if (rect3 != null || bVar.j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i10 = bVar.h;
                Drawable[] drawableArr = bVar.g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                bVar.j = true;
                bVar.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z4 = true;
            }
        } else {
            Drawable drawable = this.c;
            z4 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.a.A && h8.a(this) == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return z4;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.r = false;
            bVar.t = false;
        }
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z4;
        Drawable drawable = this.d;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z4 = true;
        } else {
            z4 = false;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if (this.v != 0) {
            this.v = 0L;
            z4 = true;
        }
        if (this.s != 0) {
            this.s = 0L;
        } else {
            z10 = z4;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.n && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.C, eVar, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            d(bVar);
            this.n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        b bVar = this.a;
        int i11 = this.h;
        int i12 = bVar.h;
        Drawable[] drawableArr = bVar.g;
        boolean z4 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean b10 = Build.VERSION.SDK_INT >= 23 ? h8.b(i10, drawable) : false;
                if (i13 == i11) {
                    z4 = b10;
                }
            }
        }
        bVar.x = i10;
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f && this.e == i10) {
            return;
        }
        this.f = true;
        this.e = i10;
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.s == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        b bVar = this.a;
        if (bVar.A != z4) {
            bVar.A = z4;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setAutoMirrored(z4);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z4) {
        b bVar = this.a;
        if (bVar.w != z4) {
            bVar.w = z4;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setDither(z4);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z10) {
        boolean visible = super.setVisible(z4, z10);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z4, z10);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z4, z10);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
