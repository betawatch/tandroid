package i;

import a5.q;
import a8.ra;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.StateSet;
import c8.h0;
import m.n2;
import org.telegram.messenger.qs;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int J = 0;
    public boolean D;
    public b E;
    public h0 F;
    public boolean I;
    public b a;
    public Rect b;
    public Drawable c;
    public Drawable d;
    public boolean f;
    public boolean n;
    public ra r;
    public long s;
    public long w;
    public a5.b x;
    public b y;
    public int e = qs.e4;
    public int h = -1;
    public int G = -1;
    public int H = -1;

    public e(b bVar, Resources resources) {
        i(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0272, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0279, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e c(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        e eVar = new e(null, null);
        TypedArray f10 = h0.b.f(resources2, theme, attributeSet, j.c.a);
        int i7 = 1;
        eVar.setVisible(f10.getBoolean(1, true), true);
        b bVar = eVar.E;
        bVar.d |= j.b.b(f10);
        int i10 = 2;
        bVar.i = f10.getBoolean(2, bVar.i);
        int i11 = 3;
        bVar.l = f10.getBoolean(3, bVar.l);
        bVar.y = f10.getInt(4, bVar.y);
        bVar.z = f10.getInt(5, bVar.z);
        boolean z9 = false;
        eVar.setDither(f10.getBoolean(0, bVar.w));
        b bVar2 = eVar.a;
        if (resources2 != null) {
            bVar2.b = resources2;
            int i12 = resources2.getDisplayMetrics().densityDpi;
            if (i12 == 0) {
                i12 = qs.q2;
            }
            int i13 = bVar2.c;
            bVar2.c = i12;
            if (i13 != i12) {
                bVar2.m = false;
                bVar2.j = false;
            }
        } else {
            bVar2.getClass();
        }
        f10.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i7 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i11)) {
                break;
            }
            if (next3 == i10 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray f11 = h0.b.f(resources2, theme, attributeSet, j.c.b);
                    int resourceId = f11.getResourceId(z9 ? 1 : 0, z9 ? 1 : 0);
                    int resourceId2 = f11.getResourceId(i7, -1);
                    Drawable g10 = resourceId2 > 0 ? n2.d().g(context2, resourceId2) : null;
                    f11.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i14 = z9 ? 1 : 0;
                    for (int i15 = i14; i15 < attributeCount; i15++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i15);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i16 = i14 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i15, z9)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i14] = attributeNameResource;
                            i14 = i16;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr, i14);
                    if (g10 == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            g10 = new q();
                            g10.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            g10 = j.b.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (g10 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    b bVar3 = eVar.E;
                    int a10 = bVar3.a(g10);
                    bVar3.H[a10] = trimStateSet;
                    bVar3.J.d(a10, Integer.valueOf(resourceId));
                } else if (xmlResourceParser.getName().equals("transition")) {
                    TypedArray f12 = h0.b.f(resources2, theme, attributeSet, j.c.c);
                    int resourceId3 = f12.getResourceId(2, -1);
                    int resourceId4 = f12.getResourceId(1, -1);
                    int resourceId5 = f12.getResourceId(z9 ? 1 : 0, -1);
                    Drawable g11 = resourceId5 > 0 ? n2.d().g(context2, resourceId5) : null;
                    boolean z10 = f12.getBoolean(3, z9);
                    f12.recycle();
                    if (g11 == null) {
                        do {
                            next = xmlResourceParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("animated-vector")) {
                            g11 = new a5.e(context2);
                            g11.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            g11 = j.b.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (g11 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    if (resourceId3 == -1 || resourceId4 == -1) {
                        break;
                    }
                    b bVar4 = eVar.E;
                    int a11 = bVar4.a(g11);
                    long j3 = resourceId3;
                    long j10 = resourceId4;
                    long j11 = (j3 << 32) | j10;
                    long j12 = z10 ? 8589934592L : 0L;
                    long j13 = a11;
                    bVar4.I.a(j11, Long.valueOf(j13 | j12));
                    if (z10) {
                        bVar4.I.a((j10 << 32) | j3, Long.valueOf(j13 | 4294967296L | j12));
                    }
                    context2 = context;
                    resources2 = resources;
                    i7 = 1;
                    z9 = false;
                    i10 = 2;
                    i11 = 3;
                } else {
                    context2 = context;
                    resources2 = resources;
                }
                i7 = 1;
                i10 = 2;
                i11 = 3;
            }
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z9) {
        boolean z10;
        Drawable drawable;
        boolean z11 = true;
        this.f = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            long j3 = this.s;
            if (j3 != 0) {
                if (j3 > uptimeMillis) {
                    drawable2.setAlpha(((255 - (((int) ((j3 - uptimeMillis) * 255)) / this.a.y)) * this.e) / qs.e4);
                    z10 = true;
                    drawable = this.d;
                    if (drawable == null) {
                        long j10 = this.w;
                        if (j10 != 0) {
                            if (j10 > uptimeMillis) {
                                drawable.setAlpha(((((int) ((j10 - uptimeMillis) * 255)) / this.a.z) * this.e) / qs.e4);
                                if (z9 && z11) {
                                    scheduleSelf(this.r, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                            drawable.setVisible(false, false);
                            this.d = null;
                            this.w = 0L;
                        }
                    } else {
                        this.w = 0L;
                    }
                    z11 = z10;
                    if (z9) {
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
        if (z9) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        b bVar = this.a;
        if (theme == null) {
            bVar.getClass();
            return;
        }
        bVar.c();
        int i7 = bVar.h;
        Drawable[] drawableArr = bVar.g;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i10].applyTheme(theme);
                bVar.e |= drawableArr[i10].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            bVar.b = resources;
            int i11 = resources.getDisplayMetrics().densityDpi;
            if (i11 == 0) {
                i11 = qs.q2;
            }
            int i12 = bVar.c;
            bVar.c = i11;
            if (i12 != i11) {
                bVar.m = false;
                bVar.j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.x == null) {
            this.x = new a5.b();
        }
        a5.b bVar = this.x;
        bVar.b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.a.y <= 0 && this.f) {
                drawable.setAlpha(this.e);
            }
            b bVar2 = this.a;
            if (bVar2.C) {
                drawable.setColorFilter(bVar2.B);
            } else {
                if (bVar2.F) {
                    drawable.setTintList(bVar2.D);
                }
                b bVar3 = this.a;
                if (bVar3.G) {
                    drawable.setTintMode(bVar3.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.a.A);
            Rect rect = this.b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            a5.b bVar4 = this.x;
            Drawable.Callback callback = (Drawable.Callback) bVar4.b;
            bVar4.b = null;
            drawable.setCallback(callback);
        } catch (Throwable th2) {
            a5.b bVar5 = this.x;
            Drawable.Callback callback2 = (Drawable.Callback) bVar5.b;
            bVar5.b = null;
            drawable.setCallback(callback2);
            throw th2;
        }
    }

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

    public final void e() {
        boolean z9;
        Drawable drawable = this.d;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z9 = true;
        } else {
            z9 = false;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if (this.w != 0) {
            this.w = 0L;
            z9 = true;
        }
        if (this.s != 0) {
            this.s = 0L;
        } else {
            z10 = z9;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.n && super.mutate() == this) {
            b bVar = new b(this.E, this, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            i(bVar);
            this.n = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.D) {
            f();
            b bVar = this.y;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.D = true;
        }
        return this;
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
        boolean z9;
        b bVar = this.a;
        if (!bVar.u) {
            bVar.c();
            bVar.u = true;
            int i7 = bVar.h;
            Drawable[] drawableArr = bVar.g;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    bVar.v = true;
                    z9 = true;
                    break;
                }
                if (drawableArr[i10].getConstantState() == null) {
                    bVar.v = false;
                    z9 = false;
                    break;
                }
                i10++;
            }
        } else {
            z9 = bVar.v;
        }
        if (!z9) {
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
            int i7 = bVar.h;
            Drawable[] drawableArr = bVar.g;
            r1 = i7 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i10 = 1; i10 < i7; i10++) {
                r1 = Drawable.resolveOpacity(r1, drawableArr[i10].getOpacity());
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
        boolean z9 = false;
        if (!bVar.i) {
            Rect rect3 = bVar.k;
            if (rect3 != null || bVar.j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i7 = bVar.h;
                Drawable[] drawableArr = bVar.g;
                for (int i10 = 0; i10 < i7; i10++) {
                    if (drawableArr[i10].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i11 = rect4.left;
                        if (i11 > rect2.left) {
                            rect2.left = i11;
                        }
                        int i12 = rect4.top;
                        if (i12 > rect2.top) {
                            rect2.top = i12;
                        }
                        int i13 = rect4.right;
                        if (i13 > rect2.right) {
                            rect2.right = i13;
                        }
                        int i14 = rect4.bottom;
                        if (i14 > rect2.bottom) {
                            rect2.bottom = i14;
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
                z9 = true;
            }
        } else {
            Drawable drawable = this.c;
            z9 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.a.A && getLayoutDirection() == 1) {
            int i15 = rect.left;
            rect.left = rect.right;
            rect.right = i15;
        }
        return z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i7) {
        ra raVar;
        if (i7 == this.h) {
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
                this.w = this.a.z + uptimeMillis;
            } else {
                this.d = null;
                this.w = 0L;
            }
        } else {
            Drawable drawable3 = this.c;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i7 >= 0) {
            b bVar = this.a;
            if (i7 < bVar.h) {
                Drawable d = bVar.d(i7);
                this.c = d;
                this.h = i7;
                if (d != null) {
                    int i10 = this.a.y;
                    if (i10 > 0) {
                        this.s = uptimeMillis + i10;
                    }
                    d(d);
                }
                if (this.s == 0 || this.w != 0) {
                    raVar = this.r;
                    if (raVar != null) {
                        this.r = new ra(this, 25);
                    } else {
                        unscheduleSelf(raVar);
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
        raVar = this.r;
        if (raVar != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    public final void i(b bVar) {
        this.a = bVar;
        int i7 = this.h;
        if (i7 >= 0) {
            Drawable d = bVar.d(i7);
            this.c = d;
            if (d != null) {
                d(d);
            }
        }
        this.d = null;
        this.y = bVar;
        this.E = bVar;
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
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z9, z10);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z9, z10);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        h0 h0Var = this.F;
        if (h0Var != null) {
            h0Var.d();
            this.F = null;
            h(this.G);
            this.G = -1;
            this.H = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.I) {
            g();
            b bVar = this.E;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.I = true;
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
    public final boolean onLayoutDirectionChanged(int i7) {
        b bVar = this.a;
        int i10 = this.h;
        int i11 = bVar.h;
        Drawable[] drawableArr = bVar.g;
        boolean z9 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i7);
                if (i12 == i10) {
                    z9 = layoutDirection;
                }
            }
        }
        bVar.x = i7;
        return z9;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(i7);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
    
        if (h(r3) != false) goto L46;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        int i7;
        h0 aVar;
        b bVar = this.E;
        int f10 = bVar.f(iArr);
        if (f10 < 0) {
            f10 = bVar.f(StateSet.WILD_CARD);
        }
        if (f10 != this.h) {
            h0 h0Var = this.F;
            if (h0Var != null) {
                if (f10 != this.G) {
                    if (f10 == this.H && h0Var.a()) {
                        h0Var.b();
                        this.G = this.H;
                        this.H = f10;
                    } else {
                        i7 = this.G;
                        h0Var.d();
                    }
                }
                r4 = true;
            } else {
                i7 = this.h;
            }
            this.F = null;
            this.H = -1;
            this.G = -1;
            b bVar2 = this.E;
            int e10 = bVar2.e(i7);
            int e11 = bVar2.e(f10);
            if (e11 != 0 && e10 != 0) {
                long j3 = e11 | (e10 << 32);
                int longValue = (int) ((Long) bVar2.I.g(-1L, j3)).longValue();
                if (longValue >= 0) {
                    boolean z9 = (((Long) bVar2.I.g(-1L, j3)).longValue() & 8589934592L) != 0;
                    h(longValue);
                    Object obj = this.c;
                    if (obj instanceof AnimationDrawable) {
                        aVar = new c((AnimationDrawable) obj, (((Long) bVar2.I.g(-1L, j3)).longValue() & 4294967296L) != 0, z9);
                    } else if (obj instanceof a5.e) {
                        aVar = new a((a5.e) obj, 1);
                    } else if (obj instanceof Animatable) {
                        aVar = new a((Animatable) obj, 0);
                    }
                    aVar.c();
                    this.F = aVar;
                    this.H = i7;
                    this.G = f10;
                    r4 = true;
                }
            }
        }
        Drawable drawable = this.c;
        return drawable != null ? drawable.setState(iArr) | r4 : r4;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.f && this.e == i7) {
            return;
        }
        this.f = true;
        this.e = i7;
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.s == 0) {
                drawable.setAlpha(i7);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z9) {
        b bVar = this.a;
        if (bVar.A != z9) {
            bVar.A = z9;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setAutoMirrored(z9);
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
    public final void setDither(boolean z9) {
        b bVar = this.a;
        if (bVar.w != z9) {
            bVar.w = z9;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setDither(z9);
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
    public final void setHotspotBounds(int i7, int i10, int i11, int i12) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(i7, i10, i11, i12);
        } else {
            rect.set(i7, i10, i11, i12);
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspotBounds(i7, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
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
    public final boolean setVisible(boolean z9, boolean z10) {
        boolean j3 = j(z9, z10);
        h0 h0Var = this.F;
        if (h0Var != null && (j3 || z10)) {
            if (z9) {
                h0Var.c();
                return j3;
            }
            jumpToCurrentState();
        }
        return j3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
