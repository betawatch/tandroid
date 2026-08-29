package k2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import h7.c8;
import h7.l8;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p extends g {
    public static final PorterDuff.Mode s = PorterDuff.Mode.SRC_IN;
    public n b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] h;
    public final Matrix n;
    public final Rect r;

    public p() {
        this.f = true;
        this.h = new float[9];
        this.n = new Matrix();
        this.r = new Rect();
        n nVar = new n();
        nVar.c = null;
        nVar.d = s;
        nVar.b = new m();
        this.b = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.r;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.n;
        canvas.getMatrix(matrix);
        float[] fArr = this.h;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && l8.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.b;
        Bitmap bitmap = nVar.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f.getHeight()) {
            nVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            nVar.k = true;
        }
        if (this.f) {
            n nVar2 = this.b;
            if (nVar2.k || nVar2.g != nVar2.c || nVar2.h != nVar2.d || nVar2.j != nVar2.e || nVar2.i != nVar2.b.getRootAlpha()) {
                n nVar3 = this.b;
                nVar3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f);
                m mVar = nVar3.b;
                mVar.a(mVar.g, m.p, canvas2, min, min2);
                n nVar4 = this.b;
                nVar4.g = nVar4.c;
                nVar4.h = nVar4.d;
                nVar4.i = nVar4.b.getRootAlpha();
                nVar4.j = nVar4.e;
                nVar4.k = false;
            }
        } else {
            n nVar5 = this.b;
            nVar5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f);
            m mVar2 = nVar5.b;
            mVar2.a(mVar2.g, m.p, canvas3, min, min2);
        }
        n nVar6 = this.b;
        if (nVar6.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.l == null) {
                Paint paint2 = new Paint();
                nVar6.l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.l.setAlpha(nVar6.b.getRootAlpha());
            nVar6.l.setColorFilter(colorFilter);
            paint = nVar6.l;
        }
        canvas.drawBitmap(nVar6.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getColorFilter() : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        n nVar = this.b;
        if (nVar == null) {
            return false;
        }
        m mVar = nVar.b;
        if (mVar.n == null) {
            mVar.n = Boolean.valueOf(mVar.g.a());
        }
        if (mVar.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            n nVar = this.b;
            n nVar2 = new n();
            nVar2.c = null;
            nVar2.d = s;
            if (nVar != null) {
                nVar2.a = nVar.a;
                m mVar = new m(nVar.b);
                nVar2.b = mVar;
                if (nVar.b.e != null) {
                    mVar.e = new Paint(nVar.b.e);
                }
                if (nVar.b.d != null) {
                    nVar2.b.d = new Paint(nVar.b.d);
                }
                nVar2.c = nVar.c;
                nVar2.d = nVar.d;
                nVar2.e = nVar.e;
            }
            this.b = nVar2;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.b;
        ColorStateList colorStateList = nVar.c;
        if (colorStateList == null || (mode = nVar.d) == null) {
            z10 = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        m mVar = nVar.b;
        if (mVar.n == null) {
            mVar.n = Boolean.valueOf(mVar.g.a());
        }
        if (mVar.n.booleanValue()) {
            boolean b10 = nVar.b.g.b(iArr);
            nVar.k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.b.b.getRootAlpha() != i10) {
            this.b.b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.b.e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.a;
        if (drawable != null) {
            l8.c(i10, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.b;
        if (nVar.c != colorStateList) {
            nVar.c = colorStateList;
            this.c = a(colorStateList, nVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.b;
        if (nVar.d != mode) {
            nVar.d = mode;
            this.c = a(nVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.b;
        nVar.b = new m();
        TypedArray f9 = h0.b.f(resources, theme, attributeSet, a.a);
        n nVar2 = this.b;
        m mVar = nVar2.b;
        int i11 = !h0.b.c(xmlPullParser, "tintMode") ? -1 : f9.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.d = mode;
        ColorStateList colorStateList = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f9.getValue(1, typedValue);
            int i12 = typedValue.type;
            if (i12 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i12 >= 28 && i12 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f9.getResources();
                int resourceId = f9.getResourceId(1, 0);
                ThreadLocal threadLocal = h0.c.a;
                try {
                    colorStateList = h0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e10) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.c = colorStateList2;
        }
        boolean z10 = nVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = f9.getBoolean(5, z10);
        }
        nVar2.e = z10;
        float f10 = mVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = f9.getFloat(7, f10);
        }
        mVar.j = f10;
        float f11 = mVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = f9.getFloat(8, f11);
        }
        mVar.k = f11;
        if (mVar.j <= 0.0f) {
            throw new XmlPullParserException(f9.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            mVar.h = f9.getDimension(3, mVar.h);
            float dimension = f9.getDimension(2, mVar.i);
            mVar.i = dimension;
            if (mVar.h <= 0.0f) {
                throw new XmlPullParserException(f9.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f9.getFloat(4, alpha);
                }
                mVar.setAlpha(alpha);
                String string = f9.getString(0);
                if (string != null) {
                    mVar.m = string;
                    mVar.o.put(string, mVar);
                }
                f9.recycle();
                nVar.a = getChangingConfigurations();
                nVar.k = true;
                n nVar3 = this.b;
                m mVar2 = nVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.g;
                a0.f fVar = mVar2.o;
                arrayDeque.push(jVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                for (int i13 = 1; eventType != i13 && (xmlPullParser.getDepth() >= depth || eventType != 3); i13 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar2 = (j) arrayDeque.peek();
                        i10 = depth;
                        if ("path".equals(name)) {
                            i iVar = new i();
                            iVar.e = 0.0f;
                            iVar.g = 1.0f;
                            iVar.h = 1.0f;
                            iVar.i = 0.0f;
                            iVar.j = 1.0f;
                            iVar.k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            iVar.m = join2;
                            iVar.n = 4.0f;
                            TypedArray f12 = h0.b.f(resources, theme, attributeSet, a.c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f12.getString(0);
                                if (string2 != null) {
                                    iVar.b = string2;
                                }
                                String string3 = f12.getString(2);
                                if (string3 != null) {
                                    iVar.a = c8.c(string3);
                                }
                                iVar.f = h0.b.a(f12, xmlPullParser, theme, "fillColor", 1);
                                float f13 = iVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f13 = f12.getFloat(12, f13);
                                }
                                iVar.h = f13;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f12.getInt(8, -1) : -1;
                                Paint.Cap cap3 = iVar.l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                iVar.l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f12.getInt(9, -1) : -1;
                                Paint.Join join3 = iVar.m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                iVar.m = join;
                                float f14 = iVar.n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f14 = f12.getFloat(10, f14);
                                }
                                iVar.n = f14;
                                iVar.d = h0.b.a(f12, xmlPullParser, theme, "strokeColor", 3);
                                float f15 = iVar.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f15 = f12.getFloat(11, f15);
                                }
                                iVar.g = f15;
                                float f16 = iVar.e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f16 = f12.getFloat(4, f16);
                                }
                                iVar.e = f16;
                                float f17 = iVar.j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f17 = f12.getFloat(6, f17);
                                }
                                iVar.j = f17;
                                float f18 = iVar.k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f18 = f12.getFloat(7, f18);
                                }
                                iVar.k = f18;
                                float f19 = iVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f19 = f12.getFloat(5, f19);
                                }
                                iVar.i = f19;
                                int i16 = iVar.c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = f12.getInt(13, i16);
                                }
                                iVar.c = i16;
                            }
                            f12.recycle();
                            jVar2.b.add(iVar);
                            if (iVar.getPathName() != null) {
                                fVar.put(iVar.getPathName(), iVar);
                            }
                            nVar3.a = nVar3.a;
                            z11 = false;
                        } else if ("clip-path".equals(name)) {
                            h hVar = new h();
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                TypedArray f20 = h0.b.f(resources, theme, attributeSet, a.d);
                                String string4 = f20.getString(0);
                                if (string4 != null) {
                                    hVar.b = string4;
                                }
                                String string5 = f20.getString(1);
                                if (string5 != null) {
                                    hVar.a = c8.c(string5);
                                }
                                hVar.c = !h0.b.c(xmlPullParser, "fillType") ? 0 : f20.getInt(2, 0);
                                f20.recycle();
                            }
                            jVar2.b.add(hVar);
                            if (hVar.getPathName() != null) {
                                fVar.put(hVar.getPathName(), hVar);
                            }
                            nVar3.a = nVar3.a;
                        } else if ("group".equals(name)) {
                            j jVar3 = new j();
                            TypedArray f21 = h0.b.f(resources, theme, attributeSet, a.b);
                            float f22 = jVar3.c;
                            if (h0.b.c(xmlPullParser, "rotation")) {
                                f22 = f21.getFloat(5, f22);
                            }
                            jVar3.c = f22;
                            jVar3.d = f21.getFloat(1, jVar3.d);
                            jVar3.e = f21.getFloat(2, jVar3.e);
                            float f23 = jVar3.f;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                f23 = f21.getFloat(3, f23);
                            }
                            jVar3.f = f23;
                            float f24 = jVar3.g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                f24 = f21.getFloat(4, f24);
                            }
                            jVar3.g = f24;
                            float f25 = jVar3.h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                f25 = f21.getFloat(6, f25);
                            }
                            jVar3.h = f25;
                            float f26 = jVar3.i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                f26 = f21.getFloat(7, f26);
                            }
                            jVar3.i = f26;
                            String string6 = f21.getString(0);
                            if (string6 != null) {
                                jVar3.k = string6;
                            }
                            jVar3.c();
                            f21.recycle();
                            jVar2.b.add(jVar3);
                            arrayDeque.push(jVar3);
                            if (jVar3.getGroupName() != null) {
                                fVar.put(jVar3.getGroupName(), jVar3);
                            }
                            nVar3.a = nVar3.a;
                        }
                    } else {
                        i10 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i10;
                }
                if (!z11) {
                    this.c = a(nVar.c, nVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f9.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f9.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f = true;
        this.h = new float[9];
        this.n = new Matrix();
        this.r = new Rect();
        this.b = nVar;
        this.c = a(nVar.c, nVar.d);
    }
}
