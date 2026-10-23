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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class n2 {
    public static n2 i;
    public WeakHashMap a;
    public a0.l b;
    public a0.m c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public com.google.firebase.messaging.l g;
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
            this.b = new a0.l(0);
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
                layerDrawable = com.google.firebase.messaging.l.v(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = com.google.firebase.messaging.l.v(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = com.google.firebase.messaging.l.v(this, context, R.dimen.abc_star_small);
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

    public final synchronized Drawable f(int i10, Context context, boolean z10) {
        Drawable k10;
        try {
            if (!this.f) {
                this.f = true;
                Drawable g10 = g(context, R.drawable.abc_vector_test);
                if (g10 == null || (!(g10 instanceof x4.o) && !"android.graphics.drawable.VectorDrawable".equals(g10.getClass().getName()))) {
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
                k10 = m(context, i10, z10, k10);
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
        a0.m mVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (mVar = (a0.m) weakHashMap.get(context)) == null) ? null : (ColorStateList) mVar.c(i10);
        if (colorStateList == null) {
            com.google.firebase.messaging.l lVar = this.g;
            if (lVar != null) {
                colorStateList2 = lVar.y(context, i10);
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
                mVar2.a(i10, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i10) {
        int next;
        a0.l lVar = this.b;
        if (lVar == null || lVar.isEmpty()) {
            return null;
        }
        a0.m mVar = this.c;
        if (mVar != null) {
            String str = (String) mVar.c(i10);
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
            } catch (Exception e7) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e7);
            }
        }
        if (e == null) {
            this.c.a(i10, "appcompat_skip_skip");
        }
        return e;
    }

    public final synchronized void l(com.google.firebase.messaging.l lVar) {
        this.g = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m(Context context, int i10, boolean z10, Drawable drawable) {
        boolean z11;
        int round;
        PorterDuffColorFilter h10;
        ColorStateList i11 = i(context, i10);
        PorterDuff.Mode mode = null;
        if (i11 != null) {
            int[] iArr = m1.a;
            Drawable mutate = drawable.mutate();
            mutate.setTintList(i11);
            if (this.g != null && i10 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        com.google.firebase.messaging.l lVar = this.g;
        int i12 = R.attr.colorControlNormal;
        if (lVar != null) {
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c10 = c3.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = r.b;
                com.google.firebase.messaging.l.I(findDrawableByLayerId, c10, mode2);
                com.google.firebase.messaging.l.I(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), c3.c(context, R.attr.colorControlNormal), mode2);
                com.google.firebase.messaging.l.I(layerDrawable.findDrawableByLayerId(android.R.id.progress), c3.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b10 = c3.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = r.b;
                com.google.firebase.messaging.l.I(findDrawableByLayerId2, b10, mode3);
                com.google.firebase.messaging.l.I(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), c3.c(context, R.attr.colorControlActivated), mode3);
                com.google.firebase.messaging.l.I(layerDrawable2.findDrawableByLayerId(android.R.id.progress), c3.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        com.google.firebase.messaging.l lVar2 = this.g;
        boolean z12 = false;
        if (lVar2 != null) {
            PorterDuff.Mode mode4 = r.b;
            if (!com.google.firebase.messaging.l.g(i10, (int[]) lVar2.a)) {
                if (com.google.firebase.messaging.l.g(i10, (int[]) lVar2.c)) {
                    i12 = R.attr.colorControlActivated;
                } else {
                    boolean g10 = com.google.firebase.messaging.l.g(i10, (int[]) lVar2.d);
                    i12 = android.R.attr.colorBackground;
                    if (g10) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i10 == R.drawable.abc_list_divider_mtrl_alpha) {
                        round = Math.round(40.8f);
                        i12 = android.R.attr.colorForeground;
                        z11 = true;
                        if (z11) {
                            int[] iArr2 = m1.a;
                            Drawable mutate2 = drawable.mutate();
                            int c11 = c3.c(context, i12);
                            synchronized (r.class) {
                                h10 = h(c11, mode4);
                            }
                            mutate2.setColorFilter(h10);
                            if (round != -1) {
                                mutate2.setAlpha(round);
                            }
                            z12 = true;
                        }
                    } else if (i10 != R.drawable.abc_dialog_material_background) {
                        z11 = false;
                        i12 = 0;
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
