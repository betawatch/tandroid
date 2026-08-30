package m;

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
import j7.h8;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class n2 {
    public static n2 i;
    public WeakHashMap a;
    public a0.k b;
    public a0.l c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public a9.a g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final l2 j = new l2(6);

    public static synchronized n2 d() {
        n2 n2Var;
        synchronized (n2.class) {
            try {
                if (i == null) {
                    n2 n2Var2 = new n2();
                    i = n2Var2;
                    j(n2Var2);
                }
                n2Var = i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n2Var;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (n2.class) {
            l2 l2Var = j;
            l2Var.getClass();
            int i11 = (31 + i10) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) l2Var.a(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(n2 n2Var) {
        if (Build.VERSION.SDK_INT < 24) {
            n2Var.a("vector", new m2(3));
            n2Var.a("animated-vector", new m2(2));
            n2Var.a("animated-selector", new m2(1));
            n2Var.a("drawable", new m2(0));
        }
    }

    public final void a(String str, m2 m2Var) {
        if (this.b == null) {
            this.b = new a0.k(0);
        }
        this.b.put(str, m2Var);
    }

    public final synchronized void b(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                a0.h hVar = (a0.h) this.d.get(context);
                if (hVar == null) {
                    hVar = new a0.h();
                    this.d.put(context, hVar);
                }
                hVar.k(new WeakReference(constantState), j10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Drawable c(Context context, int i10) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e = e(context, j10);
        if (e != null) {
            return e;
        }
        LayerDrawable layerDrawable = null;
        if (this.g != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{g(context, R.drawable.abc_cab_background_internal_bg), g(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawable = a9.a.p(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = a9.a.p(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = a9.a.p(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j10, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j10) {
        a0.h hVar = (a0.h) this.d.get(context);
        if (hVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) hVar.f(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            hVar.l(j10);
        }
        return null;
    }

    public final synchronized Drawable f(int i10, Context context, boolean z4) {
        Drawable k10;
        try {
            if (!this.f) {
                this.f = true;
                Drawable g10 = g(context, R.drawable.abc_vector_test);
                if (g10 == null || (!(g10 instanceof k2.p) && !"android.graphics.drawable.VectorDrawable".equals(g10.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k10 = k(context, i10);
            if (k10 == null) {
                k10 = c(context, i10);
            }
            if (k10 == null) {
                k10 = context.getDrawable(i10);
            }
            if (k10 != null) {
                k10 = m(context, i10, z4, k10);
            }
            if (k10 != null) {
                m1.a(k10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return k10;
    }

    public final synchronized Drawable g(Context context, int i10) {
        return f(i10, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        a0.l lVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (lVar = (a0.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.c(i10);
        if (colorStateList == null) {
            a9.a aVar = this.g;
            if (aVar != null) {
                colorStateList2 = aVar.r(context, i10);
            }
            if (colorStateList2 != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                a0.l lVar2 = (a0.l) this.a.get(context);
                if (lVar2 == null) {
                    lVar2 = new a0.l();
                    this.a.put(context, lVar2);
                }
                lVar2.a(i10, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i10) {
        int next;
        a0.k kVar = this.b;
        if (kVar == null || kVar.isEmpty()) {
            return null;
        }
        a0.l lVar = this.c;
        if (lVar != null) {
            String str = (String) lVar.c(i10);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.b.get(str) == null) {
                return null;
            }
        } else {
            this.c = new a0.l();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e = e(context, j10);
        if (e != null) {
            return e;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
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
                String name = xml.getName();
                this.c.a(i10, name);
                m2 m2Var = (m2) this.b.get(name);
                if (m2Var != null) {
                    e = m2Var.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (e != null) {
                    e.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j10, e);
                }
            } catch (Exception e6) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e6);
            }
        }
        if (e == null) {
            this.c.a(i10, "appcompat_skip_skip");
        }
        return e;
    }

    public final synchronized void l(a9.a aVar) {
        this.g = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m(Context context, int i10, boolean z4, Drawable drawable) {
        int i11;
        boolean z10;
        PorterDuffColorFilter h9;
        ColorStateList i12 = i(context, i10);
        PorterDuff.Mode mode = null;
        if (i12 != null) {
            int[] iArr = m1.a;
            Drawable d = h8.d(drawable.mutate());
            d.setTintList(i12);
            if (this.g != null && i10 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                d.setTintMode(mode);
            }
            return d;
        }
        a9.a aVar = this.g;
        int i13 = R.attr.colorControlNormal;
        if (aVar != null) {
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c3 = d3.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = q.b;
                a9.a.A(findDrawableByLayerId, c3, mode2);
                a9.a.A(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), d3.c(context, R.attr.colorControlNormal), mode2);
                a9.a.A(layerDrawable.findDrawableByLayerId(android.R.id.progress), d3.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b10 = d3.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = q.b;
                a9.a.A(findDrawableByLayerId2, b10, mode3);
                a9.a.A(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), d3.c(context, R.attr.colorControlActivated), mode3);
                a9.a.A(layerDrawable2.findDrawableByLayerId(android.R.id.progress), d3.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        a9.a aVar2 = this.g;
        boolean z11 = false;
        if (aVar2 != null) {
            PorterDuff.Mode mode4 = q.b;
            if (!a9.a.f(i10, (int[]) aVar2.a)) {
                if (a9.a.f(i10, (int[]) aVar2.c)) {
                    i11 = -1;
                    z10 = true;
                    i13 = R.attr.colorControlActivated;
                } else {
                    boolean f10 = a9.a.f(i10, (int[]) aVar2.d);
                    i13 = android.R.attr.colorBackground;
                    if (f10) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i10 == R.drawable.abc_list_divider_mtrl_alpha) {
                        i11 = Math.round(40.8f);
                        i13 = android.R.attr.colorForeground;
                        z10 = true;
                    } else if (i10 != R.drawable.abc_dialog_material_background) {
                        i11 = -1;
                        z10 = false;
                        i13 = 0;
                    }
                }
                if (z10) {
                    int[] iArr2 = m1.a;
                    Drawable mutate = drawable.mutate();
                    int c10 = d3.c(context, i13);
                    synchronized (q.class) {
                        h9 = h(c10, mode4);
                    }
                    mutate.setColorFilter(h9);
                    if (i11 != -1) {
                        mutate.setAlpha(i11);
                    }
                    z11 = true;
                }
            }
            i11 = -1;
            z10 = true;
            if (z10) {
            }
        }
        if (z11 || !z4) {
            return drawable;
        }
        return null;
    }
}
