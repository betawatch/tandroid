package i;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import j7.y7;
import k2.p;
import m.m2;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e extends g implements j0.b {
    public boolean B;
    public b C;
    public y7 D;
    public int E;
    public int F;
    public boolean G;
    public b y;

    public e(b bVar, Resources resources) {
        this.e = 255;
        this.h = -1;
        this.E = -1;
        this.F = -1;
        d(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0274, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x027b, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e e(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
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
        int i10 = 1;
        eVar.setVisible(f10.getBoolean(1, true), true);
        b bVar = eVar.C;
        bVar.d |= j.b.b(f10);
        int i11 = 2;
        bVar.i = f10.getBoolean(2, bVar.i);
        int i12 = 3;
        bVar.l = f10.getBoolean(3, bVar.l);
        bVar.y = f10.getInt(4, bVar.y);
        bVar.z = f10.getInt(5, bVar.z);
        boolean z4 = false;
        eVar.setDither(f10.getBoolean(0, bVar.w));
        b bVar2 = eVar.a;
        if (resources2 != null) {
            bVar2.b = resources2;
            int i13 = resources2.getDisplayMetrics().densityDpi;
            if (i13 == 0) {
                i13 = 160;
            }
            int i14 = bVar2.c;
            bVar2.c = i13;
            if (i14 != i13) {
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
            if (next3 == i10 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i12)) {
                break;
            }
            if (next3 == i11 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray f11 = h0.b.f(resources2, theme, attributeSet, j.c.b);
                    int resourceId = f11.getResourceId(z4 ? 1 : 0, z4 ? 1 : 0);
                    int resourceId2 = f11.getResourceId(i10, -1);
                    Drawable g10 = resourceId2 > 0 ? m2.d().g(context2, resourceId2) : null;
                    f11.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i15 = 0;
                    for (int i16 = 0; i16 < attributeCount; i16++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i16);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i17 = i15 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i16, z4)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i15] = attributeNameResource;
                            i15 = i17;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr, i15);
                    if (g10 == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            g10 = new p();
                            g10.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            g10 = j.b.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (g10 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    b bVar3 = eVar.C;
                    int a2 = bVar3.a(g10);
                    bVar3.H[a2] = trimStateSet;
                    bVar3.J.d(a2, Integer.valueOf(resourceId));
                } else if (xmlResourceParser.getName().equals("transition")) {
                    TypedArray f12 = h0.b.f(resources2, theme, attributeSet, j.c.c);
                    int resourceId3 = f12.getResourceId(2, -1);
                    int resourceId4 = f12.getResourceId(1, -1);
                    int resourceId5 = f12.getResourceId(z4 ? 1 : 0, -1);
                    Drawable g11 = resourceId5 > 0 ? m2.d().g(context2, resourceId5) : null;
                    boolean z10 = f12.getBoolean(3, z4);
                    f12.recycle();
                    if (g11 == null) {
                        do {
                            next = xmlResourceParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("animated-vector")) {
                            g11 = new k2.d(context2);
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
                    b bVar4 = eVar.C;
                    int a10 = bVar4.a(g11);
                    long j10 = resourceId3;
                    long j11 = resourceId4;
                    long j12 = (j10 << 32) | j11;
                    long j13 = z10 ? 8589934592L : 0L;
                    long j14 = a10;
                    bVar4.I.a(Long.valueOf(j14 | j13), j12);
                    if (z10) {
                        bVar4.I.a(Long.valueOf(j14 | 4294967296L | j13), (j11 << 32) | j10);
                    }
                    context2 = context;
                    resources2 = resources;
                    i10 = 1;
                    z4 = false;
                    i11 = 2;
                    i12 = 3;
                } else {
                    context2 = context;
                    resources2 = resources;
                }
                i10 = 1;
                i11 = 2;
                i12 = 3;
            }
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    @Override // i.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // i.g
    public final void d(b bVar) {
        this.a = bVar;
        int i10 = this.h;
        if (i10 >= 0) {
            Drawable d = bVar.d(i10);
            this.c = d;
            if (d != null) {
                b(d);
            }
        }
        this.d = null;
        this.y = bVar;
        this.C = bVar;
    }

    public final Drawable f() {
        if (!this.B) {
            super.mutate();
            b bVar = this.y;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.B = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // i.g, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        y7 y7Var = this.D;
        if (y7Var != null) {
            y7Var.d();
            this.D = null;
            c(this.E);
            this.E = -1;
            this.F = -1;
        }
    }

    @Override // i.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.G) {
            f();
            b bVar = this.C;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.G = true;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00da, code lost:
    
        if (c(r1) != false) goto L46;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        int i10;
        y7 aVar;
        b bVar = this.C;
        int f10 = bVar.f(iArr);
        if (f10 < 0) {
            f10 = bVar.f(StateSet.WILD_CARD);
        }
        if (f10 != this.h) {
            y7 y7Var = this.D;
            if (y7Var != null) {
                if (f10 != this.E) {
                    if (f10 == this.F && y7Var.a()) {
                        y7Var.b();
                        this.E = this.F;
                        this.F = f10;
                    } else {
                        i10 = this.E;
                        y7Var.d();
                    }
                }
                r2 = true;
            } else {
                i10 = this.h;
            }
            this.D = null;
            this.F = -1;
            this.E = -1;
            b bVar2 = this.C;
            int e6 = bVar2.e(i10);
            int e10 = bVar2.e(f10);
            if (e10 != 0 && e6 != 0) {
                long j10 = e10 | (e6 << 32);
                int longValue = (int) ((Long) bVar2.I.g(-1L, j10)).longValue();
                if (longValue >= 0) {
                    boolean z4 = (((Long) bVar2.I.g(-1L, j10)).longValue() & 8589934592L) != 0;
                    c(longValue);
                    Object obj = this.c;
                    if (obj instanceof AnimationDrawable) {
                        aVar = new c((AnimationDrawable) obj, (((Long) bVar2.I.g(-1L, j10)).longValue() & 4294967296L) != 0, z4);
                    } else if (obj instanceof k2.d) {
                        aVar = new a((k2.d) obj, 1);
                    } else if (obj instanceof Animatable) {
                        aVar = new a((Animatable) obj, 0);
                    }
                    aVar.c();
                    this.D = aVar;
                    this.F = i10;
                    this.E = f10;
                    r2 = true;
                }
            }
        }
        Drawable drawable = this.c;
        return drawable != null ? drawable.setState(iArr) | r2 : r2;
    }

    @Override // i.g, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z10) {
        boolean visible = super.setVisible(z4, z10);
        y7 y7Var = this.D;
        if (y7Var != null && (visible || z10)) {
            if (z4) {
                y7Var.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
