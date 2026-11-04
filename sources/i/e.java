package i;

import a3.o;
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
import b8.qc;
import m.m2;
import org.telegram.messenger.hs;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int K = 0;
    public boolean E;
    public b F;
    public qc G;
    public boolean J;
    public b a;
    public Rect b;
    public Drawable c;
    public Drawable d;
    public boolean f;
    public boolean n;
    public o r;
    public long s;
    public long w;
    public ah.a x;
    public b y;
    public int e = hs.e4;
    public int h = -1;
    public int H = -1;
    public int I = -1;

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
        int i3 = 1;
        eVar.setVisible(f10.getBoolean(1, true), true);
        b bVar = eVar.F;
        bVar.d |= j.b.b(f10);
        int i10 = 2;
        bVar.i = f10.getBoolean(2, bVar.i);
        int i11 = 3;
        bVar.l = f10.getBoolean(3, bVar.l);
        bVar.y = f10.getInt(4, bVar.y);
        bVar.z = f10.getInt(5, bVar.z);
        boolean z10 = false;
        eVar.setDither(f10.getBoolean(0, bVar.w));
        b bVar2 = eVar.a;
        if (resources2 != null) {
            bVar2.b = resources2;
            int i12 = resources2.getDisplayMetrics().densityDpi;
            if (i12 == 0) {
                i12 = hs.q2;
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
            if (next3 == i3 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i11)) {
                break;
            }
            if (next3 == i10 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray f11 = h0.b.f(resources2, theme, attributeSet, j.c.b);
                    int resourceId = f11.getResourceId(z10 ? 1 : 0, z10 ? 1 : 0);
                    int resourceId2 = f11.getResourceId(i3, -1);
                    Drawable g7 = resourceId2 > 0 ? m2.d().g(context2, resourceId2) : null;
                    f11.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i14 = z10 ? 1 : 0;
                    for (int i15 = i14; i15 < attributeCount; i15++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i15);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i16 = i14 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i15, z10)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i14] = attributeNameResource;
                            i14 = i16;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr, i14);
                    if (g7 == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            g7 = new z4.o();
                            g7.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            g7 = j.b.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (g7 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    b bVar3 = eVar.F;
                    int a10 = bVar3.a(g7);
                    bVar3.H[a10] = trimStateSet;
                    bVar3.J.d(a10, Integer.valueOf(resourceId));
                } else if (xmlResourceParser.getName().equals("transition")) {
                    TypedArray f12 = h0.b.f(resources2, theme, attributeSet, j.c.c);
                    int resourceId3 = f12.getResourceId(2, -1);
                    int resourceId4 = f12.getResourceId(1, -1);
                    int resourceId5 = f12.getResourceId(z10 ? 1 : 0, -1);
                    Drawable g10 = resourceId5 > 0 ? m2.d().g(context2, resourceId5) : null;
                    boolean z11 = f12.getBoolean(3, z10);
                    f12.recycle();
                    if (g10 == null) {
                        do {
                            next = xmlResourceParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("animated-vector")) {
                            g10 = new z4.d(context2);
                            g10.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            g10 = j.b.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (g10 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    if (resourceId3 == -1 || resourceId4 == -1) {
                        break;
                    }
                    b bVar4 = eVar.F;
                    int a11 = bVar4.a(g10);
                    long j10 = resourceId3;
                    long j11 = resourceId4;
                    long j12 = (j10 << 32) | j11;
                    long j13 = z11 ? 8589934592L : 0L;
                    long j14 = a11;
                    bVar4.I.a(j12, Long.valueOf(j14 | j13));
                    if (z11) {
                        bVar4.I.a((j11 << 32) | j10, Long.valueOf(j14 | 4294967296L | j13));
                    }
                    context2 = context;
                    resources2 = resources;
                    i3 = 1;
                    z10 = false;
                    i10 = 2;
                    i11 = 3;
                } else {
                    context2 = context;
                    resources2 = resources;
                }
                i3 = 1;
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
    public final void a(boolean z10) {
        boolean z11;
        Drawable drawable;
        boolean z12 = true;
        this.f = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            long j10 = this.s;
            if (j10 != 0) {
                if (j10 > uptimeMillis) {
                    drawable2.setAlpha(((255 - (((int) ((j10 - uptimeMillis) * 255)) / this.a.y)) * this.e) / hs.e4);
                    z11 = true;
                    drawable = this.d;
                    if (drawable == null) {
                        long j11 = this.w;
                        if (j11 != 0) {
                            if (j11 > uptimeMillis) {
                                drawable.setAlpha(((((int) ((j11 - uptimeMillis) * 255)) / this.a.z) * this.e) / hs.e4);
                                if (z10 && z12) {
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
                    z12 = z11;
                    if (z10) {
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
        z11 = false;
        drawable = this.d;
        if (drawable == null) {
        }
        z12 = z11;
        if (z10) {
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
        int i3 = bVar.h;
        Drawable[] drawableArr = bVar.g;
        for (int i10 = 0; i10 < i3; i10++) {
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
                i11 = hs.q2;
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
            this.x = new ah.a();
        }
        ah.a aVar = this.x;
        aVar.b = drawable.getCallback();
        drawable.setCallback(aVar);
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
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.a.A);
            Rect rect = this.b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            ah.a aVar2 = this.x;
            Drawable.Callback callback = (Drawable.Callback) aVar2.b;
            aVar2.b = null;
            drawable.setCallback(callback);
        } catch (Throwable th2) {
            ah.a aVar3 = this.x;
            Drawable.Callback callback2 = (Drawable.Callback) aVar3.b;
            aVar3.b = null;
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
        boolean z10;
        Drawable drawable = this.d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z10 = true;
        } else {
            z10 = false;
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
            z10 = true;
        }
        if (this.s != 0) {
            this.s = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.n && super.mutate() == this) {
            b bVar = new b(this.F, this, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            i(bVar);
            this.n = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.E) {
            f();
            b bVar = this.y;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.E = true;
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
        boolean z10;
        b bVar = this.a;
        if (!bVar.u) {
            bVar.c();
            bVar.u = true;
            int i3 = bVar.h;
            Drawable[] drawableArr = bVar.g;
            int i10 = 0;
            while (true) {
                if (i10 >= i3) {
                    bVar.v = true;
                    z10 = true;
                    break;
                }
                if (drawableArr[i10].getConstantState() == null) {
                    bVar.v = false;
                    z10 = false;
                    break;
                }
                i10++;
            }
        } else {
            z10 = bVar.v;
        }
        if (!z10) {
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
            int i3 = bVar.h;
            Drawable[] drawableArr = bVar.g;
            r1 = i3 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i10 = 1; i10 < i3; i10++) {
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
        boolean z10 = false;
        if (!bVar.i) {
            Rect rect3 = bVar.k;
            if (rect3 != null || bVar.j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i3 = bVar.h;
                Drawable[] drawableArr = bVar.g;
                for (int i10 = 0; i10 < i3; i10++) {
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
                z10 = true;
            }
        } else {
            Drawable drawable = this.c;
            z10 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.a.A && getLayoutDirection() == 1) {
            int i15 = rect.left;
            rect.left = rect.right;
            rect.right = i15;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i3) {
        o oVar;
        if (i3 == this.h) {
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
        if (i3 >= 0) {
            b bVar = this.a;
            if (i3 < bVar.h) {
                Drawable d = bVar.d(i3);
                this.c = d;
                this.h = i3;
                if (d != null) {
                    int i10 = this.a.y;
                    if (i10 > 0) {
                        this.s = uptimeMillis + i10;
                    }
                    d(d);
                }
                if (this.s == 0 || this.w != 0) {
                    oVar = this.r;
                    if (oVar != null) {
                        this.r = new o(this, 25);
                    } else {
                        unscheduleSelf(oVar);
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
        oVar = this.r;
        if (oVar != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    public final void i(b bVar) {
        this.a = bVar;
        int i3 = this.h;
        if (i3 >= 0) {
            Drawable d = bVar.d(i3);
            this.c = d;
            if (d != null) {
                d(d);
            }
        }
        this.d = null;
        this.y = bVar;
        this.F = bVar;
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

    public final boolean j(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        qc qcVar = this.G;
        if (qcVar != null) {
            qcVar.d();
            this.G = null;
            h(this.H);
            this.H = -1;
            this.I = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.J) {
            g();
            b bVar = this.F;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.J = true;
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
    public final boolean onLayoutDirectionChanged(int i3) {
        b bVar = this.a;
        int i10 = this.h;
        int i11 = bVar.h;
        Drawable[] drawableArr = bVar.g;
        boolean z10 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i3);
                if (i12 == i10) {
                    z10 = layoutDirection;
                }
            }
        }
        bVar.x = i3;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i3);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(i3);
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
        int i3;
        qc aVar;
        b bVar = this.F;
        int f10 = bVar.f(iArr);
        if (f10 < 0) {
            f10 = bVar.f(StateSet.WILD_CARD);
        }
        if (f10 != this.h) {
            qc qcVar = this.G;
            if (qcVar != null) {
                if (f10 != this.H) {
                    if (f10 == this.I && qcVar.a()) {
                        qcVar.b();
                        this.H = this.I;
                        this.I = f10;
                    } else {
                        i3 = this.H;
                        qcVar.d();
                    }
                }
                r4 = true;
            } else {
                i3 = this.h;
            }
            this.G = null;
            this.I = -1;
            this.H = -1;
            b bVar2 = this.F;
            int e10 = bVar2.e(i3);
            int e11 = bVar2.e(f10);
            if (e11 != 0 && e10 != 0) {
                long j10 = e11 | (e10 << 32);
                int longValue = (int) ((Long) bVar2.I.g(-1L, j10)).longValue();
                if (longValue >= 0) {
                    boolean z10 = (((Long) bVar2.I.g(-1L, j10)).longValue() & 8589934592L) != 0;
                    h(longValue);
                    Object obj = this.c;
                    if (obj instanceof AnimationDrawable) {
                        aVar = new c((AnimationDrawable) obj, (((Long) bVar2.I.g(-1L, j10)).longValue() & 4294967296L) != 0, z10);
                    } else if (obj instanceof z4.d) {
                        aVar = new a((z4.d) obj, 1);
                    } else if (obj instanceof Animatable) {
                        aVar = new a((Animatable) obj, 0);
                    }
                    aVar.c();
                    this.G = aVar;
                    this.I = i3;
                    this.H = f10;
                    r4 = true;
                }
            }
        }
        Drawable drawable = this.c;
        return drawable != null ? drawable.setState(iArr) | r4 : r4;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        if (this.f && this.e == i3) {
            return;
        }
        this.f = true;
        this.e = i3;
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.s == 0) {
                drawable.setAlpha(i3);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        b bVar = this.a;
        if (bVar.A != z10) {
            bVar.A = z10;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
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
    public final void setDither(boolean z10) {
        b bVar = this.a;
        if (bVar.w != z10) {
            bVar.w = z10;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setDither(z10);
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
    public final void setHotspotBounds(int i3, int i10, int i11, int i12) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(i3, i10, i11, i12);
        } else {
            rect.set(i3, i10, i11, i12);
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspotBounds(i3, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        setTintList(ColorStateList.valueOf(i3));
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
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean j10 = j(z10, z11);
        qc qcVar = this.G;
        if (qcVar != null && (j10 || z11)) {
            if (z10) {
                qcVar.c();
                return j10;
            }
            jumpToCurrentState();
        }
        return j10;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
