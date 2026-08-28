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
import f7.h8;
import k2.p;
import m.n2;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends f implements j0.b {
    public boolean A;
    public b B;
    public h8 C;
    public int D;
    public int E;
    public boolean F;
    public b y;

    public e(b bVar, Resources resources) {
        this.e = 255;
        this.h = -1;
        this.D = -1;
        this.E = -1;
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
        int i9 = 1;
        eVar.setVisible(f10.getBoolean(1, true), true);
        b bVar = eVar.B;
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
                i12 = 160;
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
            if (next3 == i9 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i11)) {
                break;
            }
            if (next3 == i10 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray f11 = h0.b.f(resources2, theme, attributeSet, j.c.b);
                    int resourceId = f11.getResourceId(z10 ? 1 : 0, z10 ? 1 : 0);
                    int resourceId2 = f11.getResourceId(i9, -1);
                    Drawable g10 = resourceId2 > 0 ? n2.d().g(context2, resourceId2) : null;
                    f11.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i14 = 0;
                    for (int i15 = 0; i15 < attributeCount; i15++) {
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
                    b bVar3 = eVar.B;
                    int a2 = bVar3.a(g10);
                    bVar3.H[a2] = trimStateSet;
                    bVar3.J.d(a2, Integer.valueOf(resourceId));
                } else if (xmlResourceParser.getName().equals("transition")) {
                    TypedArray f12 = h0.b.f(resources2, theme, attributeSet, j.c.c);
                    int resourceId3 = f12.getResourceId(2, -1);
                    int resourceId4 = f12.getResourceId(1, -1);
                    int resourceId5 = f12.getResourceId(z10 ? 1 : 0, -1);
                    Drawable g11 = resourceId5 > 0 ? n2.d().g(context2, resourceId5) : null;
                    boolean z11 = f12.getBoolean(3, z10);
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
                    b bVar4 = eVar.B;
                    int a3 = bVar4.a(g11);
                    long j10 = resourceId3;
                    long j11 = resourceId4;
                    long j12 = (j10 << 32) | j11;
                    long j13 = z11 ? 8589934592L : 0L;
                    long j14 = a3;
                    bVar4.I.a(Long.valueOf(j14 | j13), j12);
                    if (z11) {
                        bVar4.I.a(Long.valueOf(j14 | 4294967296L | j13), (j11 << 32) | j10);
                    }
                    context2 = context;
                    resources2 = resources;
                    i9 = 1;
                    z10 = false;
                    i10 = 2;
                    i11 = 3;
                } else {
                    context2 = context;
                    resources2 = resources;
                }
                i9 = 1;
                i10 = 2;
                i11 = 3;
            }
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    @Override // i.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // i.f
    public final void d(b bVar) {
        this.a = bVar;
        int i9 = this.h;
        if (i9 >= 0) {
            Drawable d = bVar.d(i9);
            this.c = d;
            if (d != null) {
                b(d);
            }
        }
        this.d = null;
        this.y = bVar;
        this.B = bVar;
    }

    public final Drawable f() {
        if (!this.A) {
            super.mutate();
            b bVar = this.y;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.A = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // i.f, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        h8 h8Var = this.C;
        if (h8Var != null) {
            h8Var.d();
            this.C = null;
            c(this.D);
            this.D = -1;
            this.E = -1;
        }
    }

    @Override // i.f, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.F) {
            f();
            b bVar = this.B;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.F = true;
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
        int i9;
        h8 aVar;
        b bVar = this.B;
        int f10 = bVar.f(iArr);
        if (f10 < 0) {
            f10 = bVar.f(StateSet.WILD_CARD);
        }
        if (f10 != this.h) {
            h8 h8Var = this.C;
            if (h8Var != null) {
                if (f10 != this.D) {
                    if (f10 == this.E && h8Var.a()) {
                        h8Var.b();
                        this.D = this.E;
                        this.E = f10;
                    } else {
                        i9 = this.D;
                        h8Var.d();
                    }
                }
                r2 = true;
            } else {
                i9 = this.h;
            }
            this.C = null;
            this.E = -1;
            this.D = -1;
            b bVar2 = this.B;
            int e10 = bVar2.e(i9);
            int e11 = bVar2.e(f10);
            if (e11 != 0 && e10 != 0) {
                long j10 = e11 | (e10 << 32);
                int longValue = (int) ((Long) bVar2.I.g(-1L, j10)).longValue();
                if (longValue >= 0) {
                    boolean z10 = (((Long) bVar2.I.g(-1L, j10)).longValue() & 8589934592L) != 0;
                    c(longValue);
                    Object obj = this.c;
                    if (obj instanceof AnimationDrawable) {
                        aVar = new c((AnimationDrawable) obj, (((Long) bVar2.I.g(-1L, j10)).longValue() & 4294967296L) != 0, z10);
                    } else if (obj instanceof k2.d) {
                        aVar = new a((k2.d) obj, 1);
                    } else if (obj instanceof Animatable) {
                        aVar = new a((Animatable) obj, 0);
                    }
                    aVar.c();
                    this.C = aVar;
                    this.E = i9;
                    this.D = f10;
                    r2 = true;
                }
            }
        }
        Drawable drawable = this.c;
        return drawable != null ? drawable.setState(iArr) | r2 : r2;
    }

    @Override // i.f, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        h8 h8Var = this.C;
        if (h8Var != null && (visible || z11)) {
            if (z10) {
                h8Var.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
