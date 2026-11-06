package m;

import a8.b8;
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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class n2 {
    public static n2 i;
    public WeakHashMap a;
    public a0.l b;
    public a0.m c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public b8 g;
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

    public static synchronized PorterDuffColorFilter h(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (n2.class) {
            l2 l2Var = j;
            l2Var.getClass();
            int i10 = (31 + i7) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) l2Var.a(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
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
            this.b = new a0.l(0);
        }
        this.b.put(str, m2Var);
    }

    public final synchronized void b(Context context, long j3, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                a0.h hVar = (a0.h) this.d.get(context);
                if (hVar == null) {
                    hVar = new a0.h();
                    this.d.put(context, hVar);
                }
                hVar.k(new WeakReference(constantState), j3);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Drawable c(Context context, int i7) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i7, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j3);
        if (e10 != null) {
            return e10;
        }
        LayerDrawable layerDrawable = null;
        if (this.g != null) {
            if (i7 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{g(context, R.drawable.abc_cab_background_internal_bg), g(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i7 == R.drawable.abc_ratingbar_material) {
                layerDrawable = b8.g(this, context, R.dimen.abc_star_big);
            } else if (i7 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = b8.g(this, context, R.dimen.abc_star_medium);
            } else if (i7 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = b8.g(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j3, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j3) {
        a0.h hVar = (a0.h) this.d.get(context);
        if (hVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) hVar.f(j3);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            hVar.l(j3);
        }
        return null;
    }

    public final synchronized Drawable f(int i7, Context context, boolean z9) {
        Drawable k10;
        try {
            if (!this.f) {
                this.f = true;
                Drawable g10 = g(context, R.drawable.abc_vector_test);
                if (g10 == null || (!(g10 instanceof a5.q) && !"android.graphics.drawable.VectorDrawable".equals(g10.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k10 = k(context, i7);
            if (k10 == null) {
                k10 = c(context, i7);
            }
            if (k10 == null) {
                k10 = context.getDrawable(i7);
            }
            if (k10 != null) {
                k10 = m(context, i7, z9, k10);
            }
            if (k10 != null) {
                m1.a(k10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return k10;
    }

    public final synchronized Drawable g(Context context, int i7) {
        return f(i7, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i7) {
        ColorStateList colorStateList;
        a0.m mVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (mVar = (a0.m) weakHashMap.get(context)) == null) ? null : (ColorStateList) mVar.c(i7);
        if (colorStateList == null) {
            b8 b8Var = this.g;
            if (b8Var != null) {
                colorStateList2 = b8Var.h(context, i7);
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
                mVar2.a(i7, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i7) {
        int next;
        a0.l lVar = this.b;
        if (lVar == null || lVar.isEmpty()) {
            return null;
        }
        a0.m mVar = this.c;
        if (mVar != null) {
            String str = (String) mVar.c(i7);
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
        resources.getValue(i7, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j3);
        if (e10 != null) {
            return e10;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
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
                String name = xml.getName();
                this.c.a(i7, name);
                m2 m2Var = (m2) this.b.get(name);
                if (m2Var != null) {
                    e10 = m2Var.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (e10 != null) {
                    e10.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j3, e10);
                }
            } catch (Exception e11) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
            }
        }
        if (e10 == null) {
            this.c.a(i7, "appcompat_skip_skip");
        }
        return e10;
    }

    public final synchronized void l(b8 b8Var) {
        this.g = b8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m(Context context, int i7, boolean z9, Drawable drawable) {
        boolean z10;
        int round;
        PorterDuffColorFilter h7;
        ColorStateList i10 = i(context, i7);
        PorterDuff.Mode mode = null;
        if (i10 != null) {
            int[] iArr = m1.a;
            Drawable mutate = drawable.mutate();
            mutate.setTintList(i10);
            if (this.g != null && i7 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        b8 b8Var = this.g;
        int i11 = R.attr.colorControlNormal;
        if (b8Var != null) {
            if (i7 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c10 = a3.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = r.b;
                b8.n(findDrawableByLayerId, c10, mode2);
                b8.n(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), a3.c(context, R.attr.colorControlNormal), mode2);
                b8.n(layerDrawable.findDrawableByLayerId(android.R.id.progress), a3.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i7 == R.drawable.abc_ratingbar_material || i7 == R.drawable.abc_ratingbar_indicator_material || i7 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b10 = a3.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = r.b;
                b8.n(findDrawableByLayerId2, b10, mode3);
                b8.n(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), a3.c(context, R.attr.colorControlActivated), mode3);
                b8.n(layerDrawable2.findDrawableByLayerId(android.R.id.progress), a3.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        b8 b8Var2 = this.g;
        boolean z11 = false;
        if (b8Var2 != null) {
            PorterDuff.Mode mode4 = r.b;
            if (!b8.b((int[]) b8Var2.a, i7)) {
                if (b8.b((int[]) b8Var2.c, i7)) {
                    i11 = R.attr.colorControlActivated;
                } else {
                    boolean b11 = b8.b((int[]) b8Var2.d, i7);
                    i11 = android.R.attr.colorBackground;
                    if (b11) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i7 == R.drawable.abc_list_divider_mtrl_alpha) {
                        round = Math.round(40.8f);
                        i11 = android.R.attr.colorForeground;
                        z10 = true;
                        if (z10) {
                            int[] iArr2 = m1.a;
                            Drawable mutate2 = drawable.mutate();
                            int c11 = a3.c(context, i11);
                            synchronized (r.class) {
                                h7 = h(c11, mode4);
                            }
                            mutate2.setColorFilter(h7);
                            if (round != -1) {
                                mutate2.setAlpha(round);
                            }
                            z11 = true;
                        }
                    } else if (i7 != R.drawable.abc_dialog_material_background) {
                        z10 = false;
                        i11 = 0;
                        round = -1;
                        if (z10) {
                        }
                    }
                }
            }
            z10 = true;
            round = -1;
            if (z10) {
            }
        }
        if (z11 || !z9) {
            return drawable;
        }
        return null;
    }
}
