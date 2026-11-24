// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hc9 {
    public static hc9 i;
    public WeakHashMap a;
    public cka b;
    public rma c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public eq g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final fc9 j = new fc9(6);

    public static synchronized hc9 d() {
        hc9 hc9Var;
        synchronized (hc9.class) {
            if (i == null) {
                hc9 hc9Var2 = new hc9();
                i = hc9Var2;
                j(hc9Var2);
            }
            hc9Var = i;
        }
        return hc9Var;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (hc9.class) {
            fc9 fc9Var = j;
            fc9Var.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) fc9Var.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(hc9 hc9Var) {
        if (Build.VERSION.SDK_INT < 24) {
            hc9Var.a("vector", new gc9((byte) 3));
            hc9Var.a("animated-vector", new gc9((byte) 2));
            hc9Var.a("animated-selector", new gc9((byte) 1));
            hc9Var.a("drawable", new gc9((byte) 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(Drawable drawable, s34 s34Var, int[] iArr) {
        ColorStateList colorStateList;
        int[] state = drawable.getState();
        int[] iArr2 = vr3.a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (s34Var.b) {
            colorStateList = (ColorStateList) s34Var.c;
        } else {
            if (!s34Var.a) {
                drawable.clearColorFilter();
                if (Build.VERSION.SDK_INT > 23) {
                    drawable.invalidateSelf();
                    return;
                }
                return;
            }
            colorStateList = null;
        }
        PorterDuff.Mode mode = s34Var.a ? (PorterDuff.Mode) s34Var.d : h;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = h(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilter);
        if (Build.VERSION.SDK_INT > 23) {
        }
    }

    public final void a(String str, gc9 gc9Var) {
        cka ckaVar = this.b;
        if (ckaVar == null) {
            ckaVar = new cka(0);
            this.b = ckaVar;
        }
        ckaVar.put(str, gc9Var);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            vh6 vh6Var = (vh6) this.d.get(context);
            if (vh6Var == null) {
                vh6Var = new vh6();
                this.d.put(context, vh6Var);
            }
            vh6Var.k(new WeakReference(constantState), j2);
        }
    }

    public final Drawable c(Context context, int i2) {
        TypedValue typedValue = this.e;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.e = typedValue;
        }
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e = e(context, j2);
        if (e != null) {
            return e;
        }
        LayerDrawable layerDrawable = null;
        if (this.g != null) {
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{g(context, R.drawable.abc_cab_background_internal_bg), g(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i2 == R.drawable.abc_ratingbar_material) {
                layerDrawable = eq.f(this, context, R.dimen.abc_star_big);
            } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = eq.f(this, context, R.dimen.abc_star_medium);
            } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = eq.f(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j2) {
        vh6 vh6Var = (vh6) this.d.get(context);
        if (vh6Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) vh6Var.f(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            vh6Var.l(j2);
        }
        return null;
    }

    public final synchronized Drawable f(int i2, Context context, boolean z) {
        Drawable k;
        if (!this.f) {
            this.f = true;
            Drawable g = g(context, R.drawable.abc_vector_test);
            if (g == null || (!(g instanceof sbc) && !"android.graphics.drawable.VectorDrawable".equals(g.getClass().getName()))) {
                this.f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        k = k(context, i2);
        if (k == null) {
            k = c(context, i2);
        }
        if (k == null) {
            k = context.getDrawable(i2);
        }
        if (k != null) {
            k = m(context, i2, z, k);
        }
        if (k != null) {
            vr3.a(k);
        }
        return k;
    }

    public final synchronized Drawable g(Context context, int i2) {
        return f(i2, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        rma rmaVar;
        WeakHashMap weakHashMap = this.a;
        colorStateList = (weakHashMap == null || (rmaVar = (rma) weakHashMap.get(context)) == null) ? null : (ColorStateList) bfd.a(rmaVar, i2);
        if (colorStateList == null) {
            eq eqVar = this.g;
            ColorStateList g = eqVar != null ? eqVar.g(context, i2) : null;
            if (g != null) {
                WeakHashMap weakHashMap2 = this.a;
                if (weakHashMap2 == null) {
                    weakHashMap2 = new WeakHashMap();
                    this.a = weakHashMap2;
                }
                rma rmaVar2 = (rma) weakHashMap2.get(context);
                if (rmaVar2 == null) {
                    rmaVar2 = new rma();
                    this.a.put(context, rmaVar2);
                }
                rmaVar2.a(i2, g);
            }
            colorStateList = g;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i2) {
        int next;
        cka ckaVar = this.b;
        if (ckaVar == null || ckaVar.isEmpty()) {
            return null;
        }
        rma rmaVar = this.c;
        if (rmaVar != null) {
            String str = (String) bfd.a(rmaVar, i2);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.b.get(str) == null) {
                return null;
            }
        } else {
            this.c = new rma();
        }
        TypedValue typedValue = this.e;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.e = typedValue;
        }
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e = e(context, j2);
        if (e != null) {
            return e;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        String name = xml.getName();
                        this.c.a(i2, name);
                        gc9 gc9Var = (gc9) this.b.get(name);
                        if (gc9Var != null) {
                            e = gc9Var.a(context, xml, asAttributeSet, context.getTheme());
                        }
                        if (e != null) {
                            e.setChangingConfigurations(typedValue.changingConfigurations);
                            b(context, j2, e);
                        }
                    }
                } while (next != 1);
                throw new XmlPullParserException("No start tag found");
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (e == null) {
            this.c.a(i2, "appcompat_skip_skip");
        }
        return e;
    }

    public final synchronized void l(eq eqVar) {
        this.g = eqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m(Context context, int i2, boolean z, Drawable drawable) {
        boolean z2;
        int i3;
        PorterDuffColorFilter h2;
        ColorStateList i4 = i(context, i2);
        PorterDuff.Mode mode = null;
        if (i4 != null) {
            int[] iArr = vr3.a;
            Drawable mutate = drawable.mutate();
            mutate.setTintList(i4);
            if (this.g != null && i2 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        eq eqVar = this.g;
        int i5 = R.attr.colorControlNormal;
        if (eqVar != null) {
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c = dpb.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = fq.b;
                eq.l(findDrawableByLayerId, c, mode2);
                eq.l(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), dpb.c(context, R.attr.colorControlNormal), mode2);
                eq.l(layerDrawable.findDrawableByLayerId(android.R.id.progress), dpb.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b = dpb.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = fq.b;
                eq.l(findDrawableByLayerId2, b, mode3);
                eq.l(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), dpb.c(context, R.attr.colorControlActivated), mode3);
                eq.l(layerDrawable2.findDrawableByLayerId(android.R.id.progress), dpb.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        eq eqVar2 = this.g;
        boolean z3 = false;
        if (eqVar2 != null) {
            PorterDuff.Mode mode4 = fq.b;
            if (!eq.b((int[]) eqVar2.a, i2)) {
                if (eq.b((int[]) eqVar2.c, i2)) {
                    i5 = R.attr.colorControlActivated;
                } else {
                    boolean b2 = eq.b((int[]) eqVar2.d, i2);
                    i5 = android.R.attr.colorBackground;
                    if (b2) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i2 == R.drawable.abc_list_divider_mtrl_alpha) {
                        i5 = android.R.attr.colorForeground;
                        i3 = 41;
                        z2 = true;
                        if (z2) {
                            int[] iArr2 = vr3.a;
                            Drawable mutate2 = drawable.mutate();
                            int c2 = dpb.c(context, i5);
                            synchronized (fq.class) {
                                h2 = h(c2, mode4);
                            }
                            mutate2.setColorFilter(h2);
                            if (i3 != -1) {
                                mutate2.setAlpha(i3);
                            }
                            z3 = true;
                        }
                    } else if (i2 != R.drawable.abc_dialog_material_background) {
                        z2 = false;
                        i5 = 0;
                        i3 = -1;
                        if (z2) {
                        }
                    }
                }
            }
            z2 = true;
            i3 = -1;
            if (z2) {
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
