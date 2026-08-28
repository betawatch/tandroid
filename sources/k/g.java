package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import l.m;
import l.n;
import l.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ h E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public n z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        h hVar = this.E;
        Context context = hVar.c;
        boolean z10 = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i9 = this.v;
        if (i9 >= 0) {
            menuItem.setShowAsAction(i9);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(context);
            }
            Object obj = hVar.d;
            String str = this.y;
            f fVar = new f();
            fVar.a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.b = cls.getMethod(str, f.c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e10) {
                StringBuilder t10 = aa.d.t("Couldn't resolve menu item onClick handler ", str, " in class ");
                t10.append(cls.getName());
                InflateException inflateException = new InflateException(t10.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof m) {
                m mVar = (m) menuItem;
                mVar.x = (mVar.x & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                l0.a aVar = rVar.c;
                try {
                    if (rVar.d == null) {
                        rVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    rVar.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e11) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.e, hVar.a));
            z10 = true;
        }
        int i10 = this.w;
        if (i10 > 0) {
            if (z10) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i10);
            }
        }
        n nVar = this.z;
        if (nVar != null) {
            if (menuItem instanceof l0.a) {
                ((l0.a) menuItem).a(nVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z11 = menuItem instanceof l0.a;
        if (z11) {
            ((l0.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            g6.a.i(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z11) {
            ((l0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            g6.a.q(menuItem, charSequence2);
        }
        char c10 = this.n;
        int i11 = this.o;
        if (z11) {
            ((l0.a) menuItem).setAlphabeticShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            g6.a.g(menuItem, c10, i11);
        }
        char c11 = this.p;
        int i12 = this.q;
        if (z11) {
            ((l0.a) menuItem).setNumericShortcut(c11, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            g6.a.m(menuItem, c11, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z11) {
                ((l0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                g6.a.l(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z11) {
                ((l0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                g6.a.k(menuItem, colorStateList);
            }
        }
    }
}
