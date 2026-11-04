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
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m2 {
    public static m2 i;
    public WeakHashMap a;
    public a0.l b;
    public a0.m c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public l2.e g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final k2 j = new k2(6);

    public static synchronized m2 d() {
        m2 m2Var;
        synchronized (m2.class) {
            try {
                if (i == null) {
                    m2 m2Var2 = new m2();
                    i = m2Var2;
                    j(m2Var2);
                }
                m2Var = i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m2Var;
    }

    public static synchronized PorterDuffColorFilter h(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (m2.class) {
            k2 k2Var = j;
            k2Var.getClass();
            int i10 = (31 + i3) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) k2Var.a(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(m2 m2Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m2Var.a("vector", new l2(3));
            m2Var.a("animated-vector", new l2(2));
            m2Var.a("animated-selector", new l2(1));
            m2Var.a("drawable", new l2(0));
        }
    }

    public final void a(String str, l2 l2Var) {
        if (this.b == null) {
            this.b = new a0.l(0);
        }
        this.b.put(str, l2Var);
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

    public final Drawable c(Context context, int i3) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i3, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j10);
        if (e10 != null) {
            return e10;
        }
        LayerDrawable layerDrawable = null;
        if (this.g != null) {
            if (i3 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{g(context, R.drawable.abc_cab_background_internal_bg), g(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i3 == R.drawable.abc_ratingbar_material) {
                layerDrawable = l2.e.i(this, context, R.dimen.abc_star_big);
            } else if (i3 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = l2.e.i(this, context, R.dimen.abc_star_medium);
            } else if (i3 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = l2.e.i(this, context, R.dimen.abc_star_small);
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

    public final synchronized Drawable f(int i3, Context context, boolean z10) {
        Drawable k10;
        try {
            if (!this.f) {
                this.f = true;
                Drawable g7 = g(context, R.drawable.abc_vector_test);
                if (g7 == null || (!(g7 instanceof z4.o) && !"android.graphics.drawable.VectorDrawable".equals(g7.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k10 = k(context, i3);
            if (k10 == null) {
                k10 = c(context, i3);
            }
            if (k10 == null) {
                k10 = context.getDrawable(i3);
            }
            if (k10 != null) {
                k10 = m(context, i3, z10, k10);
            }
            if (k10 != null) {
                l1.a(k10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return k10;
    }

    public final synchronized Drawable g(Context context, int i3) {
        return f(i3, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i3) {
        ColorStateList colorStateList;
        a0.m mVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (mVar = (a0.m) weakHashMap.get(context)) == null) ? null : (ColorStateList) mVar.c(i3);
        if (colorStateList == null) {
            l2.e eVar = this.g;
            if (eVar != null) {
                colorStateList2 = eVar.j(context, i3);
            }
            if (colorStateList2 != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                a0.m mVar2 = (a0.m) this.a.get(context);
                if (mVar2 == null) {
                    mVar2 = new a0.m();
                    this.a.put(context, mVar2);
                }
                mVar2.a(i3, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i3) {
        int next;
        a0.l lVar = this.b;
        if (lVar == null || lVar.isEmpty()) {
            return null;
        }
        a0.m mVar = this.c;
        if (mVar != null) {
            String str = (String) mVar.c(i3);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.b.get(str) == null) {
                return null;
            }
        } else {
            this.c = new a0.m();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i3, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j10);
        if (e10 != null) {
            return e10;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i3);
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
                this.c.a(i3, name);
                l2 l2Var = (l2) this.b.get(name);
                if (l2Var != null) {
                    e10 = l2Var.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (e10 != null) {
                    e10.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j10, e10);
                }
            } catch (Exception e11) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
            }
        }
        if (e10 == null) {
            this.c.a(i3, "appcompat_skip_skip");
        }
        return e10;
    }

    public final synchronized void l(l2.e eVar) {
        this.g = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m(Context context, int i3, boolean z10, Drawable drawable) {
        boolean z11;
        int round;
        PorterDuffColorFilter h7;
        ColorStateList i10 = i(context, i3);
        PorterDuff.Mode mode = null;
        if (i10 != null) {
            int[] iArr = l1.a;
            Drawable mutate = drawable.mutate();
            mutate.setTintList(i10);
            if (this.g != null && i3 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        l2.e eVar = this.g;
        int i11 = R.attr.colorControlNormal;
        if (eVar != null) {
            if (i3 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c2 = z2.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = q.b;
                l2.e.p(findDrawableByLayerId, c2, mode2);
                l2.e.p(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), z2.c(context, R.attr.colorControlNormal), mode2);
                l2.e.p(layerDrawable.findDrawableByLayerId(android.R.id.progress), z2.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i3 == R.drawable.abc_ratingbar_material || i3 == R.drawable.abc_ratingbar_indicator_material || i3 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b10 = z2.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = q.b;
                l2.e.p(findDrawableByLayerId2, b10, mode3);
                l2.e.p(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), z2.c(context, R.attr.colorControlActivated), mode3);
                l2.e.p(layerDrawable2.findDrawableByLayerId(android.R.id.progress), z2.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        l2.e eVar2 = this.g;
        boolean z12 = false;
        if (eVar2 != null) {
            PorterDuff.Mode mode4 = q.b;
            if (!l2.e.b((int[]) eVar2.a, i3)) {
                if (l2.e.b((int[]) eVar2.c, i3)) {
                    i11 = R.attr.colorControlActivated;
                } else {
                    boolean b11 = l2.e.b((int[]) eVar2.d, i3);
                    i11 = android.R.attr.colorBackground;
                    if (b11) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i3 == R.drawable.abc_list_divider_mtrl_alpha) {
                        round = Math.round(40.8f);
                        i11 = android.R.attr.colorForeground;
                        z11 = true;
                        if (z11) {
                            int[] iArr2 = l1.a;
                            Drawable mutate2 = drawable.mutate();
                            int c10 = z2.c(context, i11);
                            synchronized (q.class) {
                                h7 = h(c10, mode4);
                            }
                            mutate2.setColorFilter(h7);
                            if (round != -1) {
                                mutate2.setAlpha(round);
                            }
                            z12 = true;
                        }
                    } else if (i3 != R.drawable.abc_dialog_material_background) {
                        z11 = false;
                        i11 = 0;
                        round = -1;
                        if (z11) {
                        }
                    }
                }
            }
            z11 = true;
            round = -1;
            if (z11) {
            }
        }
        if (z12 || !z10) {
            return drawable;
        }
        return null;
    }
}
