package a5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
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
import android.util.Xml;
import c8.i0;
import c8.o0;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class q extends h {
    public static final PorterDuff.Mode w = PorterDuff.Mode.SRC_IN;
    public o c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f;
    public boolean h;
    public final float[] n;
    public final Matrix r;
    public final Rect s;

    public q() {
        this.h = true;
        this.n = new float[9];
        this.r = new Matrix();
        this.s = new Rect();
        o oVar = new o();
        oVar.c = null;
        oVar.d = w;
        oVar.b = new n();
        this.c = oVar;
    }

    public static q c(Resources resources, int i7, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            q qVar = new q();
            ThreadLocal threadLocal = h0.j.a;
            qVar.b = resources.getDrawable(i7, theme);
            new p(((Drawable) qVar.b).getConstantState());
            return qVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i7);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            q qVar2 = new q();
            qVar2.inflate(resources, xml, asAttributeSet, theme);
            return qVar2;
        } catch (IOException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = (Drawable) this.b;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.s;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.e;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        Matrix matrix = this.r;
        canvas.getMatrix(matrix);
        float[] fArr = this.n;
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
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        o oVar = this.c;
        Bitmap bitmap = oVar.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != oVar.f.getHeight()) {
            oVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            oVar.k = true;
        }
        if (this.h) {
            o oVar2 = this.c;
            if (oVar2.k || oVar2.g != oVar2.c || oVar2.h != oVar2.d || oVar2.j != oVar2.e || oVar2.i != oVar2.b.getRootAlpha()) {
                o oVar3 = this.c;
                oVar3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(oVar3.f);
                n nVar = oVar3.b;
                nVar.a(nVar.g, n.p, canvas2, min, min2);
                o oVar4 = this.c;
                oVar4.g = oVar4.c;
                oVar4.h = oVar4.d;
                oVar4.i = oVar4.b.getRootAlpha();
                oVar4.j = oVar4.e;
                oVar4.k = false;
            }
        } else {
            o oVar5 = this.c;
            oVar5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(oVar5.f);
            n nVar2 = oVar5.b;
            nVar2.a(nVar2.g, n.p, canvas3, min, min2);
        }
        o oVar6 = this.c;
        if (oVar6.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (oVar6.l == null) {
                Paint paint2 = new Paint();
                oVar6.l = paint2;
                paint2.setFilterBitmap(true);
            }
            oVar6.l.setAlpha(oVar6.b.getRootAlpha());
            oVar6.l.setColorFilter(colorFilter);
            paint = oVar6.l;
        }
        canvas.drawBitmap(oVar6.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getAlpha() : this.c.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getColorFilter() : this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.b) != null && Build.VERSION.SDK_INT >= 24) {
            return new p(((Drawable) this.b).getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.c.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.c.b.h;
    }

    @Override // a5.h, android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.isAutoMirrored() : this.c.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        o oVar = this.c;
        if (oVar == null) {
            return false;
        }
        n nVar = oVar.b;
        if (nVar.n == null) {
            nVar.n = Boolean.valueOf(nVar.g.a());
        }
        if (nVar.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.c.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            o oVar = this.c;
            o oVar2 = new o();
            oVar2.c = null;
            oVar2.d = w;
            if (oVar != null) {
                oVar2.a = oVar.a;
                n nVar = new n(oVar.b);
                oVar2.b = nVar;
                if (oVar.b.e != null) {
                    nVar.e = new Paint(oVar.b.e);
                }
                if (oVar.b.d != null) {
                    oVar2.b.d = new Paint(oVar.b.d);
                }
                oVar2.c = oVar.c;
                oVar2.d = oVar.d;
                oVar2.e = oVar.e;
            }
            this.c = oVar2;
            this.f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z9;
        PorterDuff.Mode mode;
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.c;
        ColorStateList colorStateList = oVar.c;
        if (colorStateList == null || (mode = oVar.d) == null) {
            z9 = false;
        } else {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z9 = true;
        }
        n nVar = oVar.b;
        if (nVar.n == null) {
            nVar.n = Boolean.valueOf(nVar.g.a());
        }
        if (nVar.n.booleanValue()) {
            boolean b10 = oVar.b.g.b(iArr);
            oVar.k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override // a5.h, android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.c.b.getRootAlpha() != i7) {
            this.c.b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z9) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setAutoMirrored(z9);
        } else {
            this.c.e = z9;
        }
    }

    @Override // a5.h, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            o0.a(i7, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        o oVar = this.c;
        if (oVar.c != colorStateList) {
            oVar.c = colorStateList;
            this.d = d(colorStateList, oVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        o oVar = this.c;
        if (oVar.d != mode) {
            oVar.d = mode;
            this.d = d(oVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.setVisible(z9, z10) : super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i7;
        char c10;
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.c;
        oVar.b = new n();
        TypedArray f10 = h0.b.f(resources, theme, attributeSet, a.a);
        o oVar2 = this.c;
        n nVar = oVar2.b;
        int i11 = !h0.b.c(xmlPullParser, "tintMode") ? -1 : f10.getInt(6, -1);
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
        oVar2.d = mode;
        ColorStateList colorStateList = null;
        int i12 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f10.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i13 >= 28 && i13 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f10.getResources();
                int resourceId = f10.getResourceId(1, 0);
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
            oVar2.c = colorStateList2;
        }
        boolean z9 = oVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z9 = f10.getBoolean(5, z9);
        }
        oVar2.e = z9;
        float f11 = nVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f11 = f10.getFloat(7, f11);
        }
        nVar.j = f11;
        float f12 = nVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f12 = f10.getFloat(8, f12);
        }
        nVar.k = f12;
        if (nVar.j <= 0.0f) {
            throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f12 > 0.0f) {
            nVar.h = f10.getDimension(3, nVar.h);
            float dimension = f10.getDimension(2, nVar.i);
            nVar.i = dimension;
            if (nVar.h <= 0.0f) {
                throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = nVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f10.getFloat(4, alpha);
                }
                nVar.setAlpha(alpha);
                String string = f10.getString(0);
                if (string != null) {
                    nVar.m = string;
                    nVar.o.put(string, nVar);
                }
                f10.recycle();
                oVar.a = getChangingConfigurations();
                oVar.k = true;
                o oVar3 = this.c;
                n nVar2 = oVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                k kVar = nVar2.g;
                a0.f fVar = nVar2.o;
                arrayDeque.push(kVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z10 = true;
                while (eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        k kVar2 = (k) arrayDeque.peek();
                        i7 = depth;
                        if ("path".equals(name)) {
                            j jVar = new j();
                            jVar.e = 0.0f;
                            jVar.g = 1.0f;
                            jVar.h = 1.0f;
                            jVar.i = 0.0f;
                            jVar.j = 1.0f;
                            jVar.k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            jVar.l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            jVar.m = join2;
                            jVar.n = 4.0f;
                            TypedArray f13 = h0.b.f(resources, theme, attributeSet, a.c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f13.getString(0);
                                if (string2 != null) {
                                    jVar.b = string2;
                                }
                                String string3 = f13.getString(2);
                                if (string3 != null) {
                                    jVar.a = i0.c(string3);
                                }
                                jVar.f = h0.b.a(f13, xmlPullParser, theme, "fillColor", 1);
                                float f14 = jVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f14 = f13.getFloat(12, f14);
                                }
                                jVar.h = f14;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f13.getInt(8, -1) : -1;
                                Paint.Cap cap3 = jVar.l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                jVar.l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f13.getInt(9, -1) : -1;
                                Paint.Join join3 = jVar.m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                jVar.m = join;
                                float f15 = jVar.n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f15 = f13.getFloat(10, f15);
                                }
                                jVar.n = f15;
                                jVar.d = h0.b.a(f13, xmlPullParser, theme, "strokeColor", 3);
                                float f16 = jVar.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f16 = f13.getFloat(11, f16);
                                }
                                jVar.g = f16;
                                float f17 = jVar.e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f17 = f13.getFloat(4, f17);
                                }
                                jVar.e = f17;
                                float f18 = jVar.j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f18 = f13.getFloat(6, f18);
                                }
                                jVar.j = f18;
                                float f19 = jVar.k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f19 = f13.getFloat(7, f19);
                                }
                                jVar.k = f19;
                                float f20 = jVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f20 = f13.getFloat(5, f20);
                                }
                                jVar.i = f20;
                                int i16 = jVar.c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = f13.getInt(13, i16);
                                }
                                jVar.c = i16;
                            }
                            f13.recycle();
                            kVar2.b.add(jVar);
                            if (jVar.getPathName() != null) {
                                fVar.put(jVar.getPathName(), jVar);
                            }
                            oVar3.a = oVar3.a;
                            z10 = false;
                            c10 = '\b';
                        } else {
                            c10 = '\b';
                            if ("clip-path".equals(name)) {
                                i iVar = new i();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f21 = h0.b.f(resources, theme, attributeSet, a.d);
                                    String string4 = f21.getString(0);
                                    if (string4 != null) {
                                        iVar.b = string4;
                                    }
                                    String string5 = f21.getString(1);
                                    if (string5 != null) {
                                        iVar.a = i0.c(string5);
                                    }
                                    iVar.c = !h0.b.c(xmlPullParser, "fillType") ? 0 : f21.getInt(2, 0);
                                    f21.recycle();
                                }
                                kVar2.b.add(iVar);
                                if (iVar.getPathName() != null) {
                                    fVar.put(iVar.getPathName(), iVar);
                                }
                                oVar3.a = oVar3.a;
                            } else if ("group".equals(name)) {
                                k kVar3 = new k();
                                TypedArray f22 = h0.b.f(resources, theme, attributeSet, a.b);
                                float f23 = kVar3.c;
                                if (h0.b.c(xmlPullParser, "rotation")) {
                                    f23 = f22.getFloat(5, f23);
                                }
                                kVar3.c = f23;
                                kVar3.d = f22.getFloat(1, kVar3.d);
                                kVar3.e = f22.getFloat(2, kVar3.e);
                                float f24 = kVar3.f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f24 = f22.getFloat(3, f24);
                                }
                                kVar3.f = f24;
                                float f25 = kVar3.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f25 = f22.getFloat(4, f25);
                                }
                                kVar3.g = f25;
                                float f26 = kVar3.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f26 = f22.getFloat(6, f26);
                                }
                                kVar3.h = f26;
                                float f27 = kVar3.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f27 = f22.getFloat(7, f27);
                                }
                                kVar3.i = f27;
                                String string6 = f22.getString(0);
                                if (string6 != null) {
                                    kVar3.k = string6;
                                }
                                kVar3.c();
                                f22.recycle();
                                kVar2.b.add(kVar3);
                                arrayDeque.push(kVar3);
                                if (kVar3.getGroupName() != null) {
                                    fVar.put(kVar3.getGroupName(), kVar3);
                                }
                                oVar3.a = oVar3.a;
                            }
                        }
                        i10 = 1;
                    } else {
                        i7 = depth;
                        c10 = '\b';
                        i10 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i12 = i10;
                    depth = i7;
                }
                if (!z10) {
                    this.d = d(oVar.c, oVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public q(o oVar) {
        this.h = true;
        this.n = new float[9];
        this.r = new Matrix();
        this.s = new Rect();
        this.c = oVar;
        this.d = d(oVar.c, oVar.d);
    }
}
