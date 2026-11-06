package l;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import r0.j0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class k implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public i e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public m v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public k(Context context) {
        boolean z9;
        boolean z10 = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = j0.a;
            if (Build.VERSION.SDK_INT >= 28) {
                z9 = d1.f.B(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z9 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z9) {
                z10 = true;
            }
        }
        this.d = z10;
    }

    public final m a(int i7, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 < 0 || i13 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i14 = (y[i13] << 16) | (65535 & i11);
        m mVar = new m(this, i7, i10, i11, i14, charSequence, this.l);
        ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i12 = 0;
                break;
            }
            if (((m) arrayList.get(size)).d <= i14) {
                i12 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i12, mVar);
        p(true);
        return mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            m a10 = a(i7, i10, i11, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.g = intent2;
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = a10;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.u.add(new WeakReference(xVar));
        xVar.i(context, this);
        this.k = true;
    }

    public final void c(boolean z9) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.c(this, z9);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        m mVar = this.v;
        if (mVar != null) {
            d(mVar);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z9 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == mVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z9 = xVar.k(mVar);
                    if (z9) {
                        break;
                    }
                }
            }
            v();
            if (z9) {
                this.v = null;
            }
        }
        return z9;
    }

    public boolean e(k kVar, MenuItem menuItem) {
        i iVar = this.e;
        return iVar != null && iVar.F0(kVar, menuItem);
    }

    public boolean f(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z9 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z9 = xVar.b(mVar);
                if (z9) {
                    break;
                }
            }
        }
        v();
        if (z9) {
            this.v = mVar;
        }
        return z9;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        MenuItem findItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (mVar.a == i7) {
                return mVar;
            }
            if (mVar.hasSubMenu() && (findItem = mVar.o.findItem(i7)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final m g(int i7, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (m) arrayList.get(0);
        }
        boolean n10 = n();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            char c10 = n10 ? mVar.j : mVar.h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == '\b' && i7 == 67))) {
                return mVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return (MenuItem) this.f.get(i7);
    }

    public final void h(List list, int i7, KeyEvent keyEvent) {
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                m mVar = (m) arrayList.get(i10);
                if (mVar.hasSubMenu()) {
                    mVar.o.h(list, i7, keyEvent);
                }
                char c10 = n10 ? mVar.j : mVar.h;
                if ((modifiers & 69647) == ((n10 ? mVar.k : mVar.i) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (n10 && c10 == '\b' && i7 == 67)) && mVar.isEnabled()) {
                        list.add(mVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((m) arrayList.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l10 = l();
        if (this.k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z9 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z9 |= xVar.d();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (z9) {
                arrayList.clear();
                arrayList2.clear();
                int size = l10.size();
                for (int i7 = 0; i7 < size; i7++) {
                    m mVar = (m) l10.get(i7);
                    if ((mVar.x & 32) == 32) {
                        arrayList.add(mVar);
                    } else {
                        arrayList2.add(mVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return g(i7, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z9 = this.h;
        ArrayList arrayList = this.g;
        if (!z9) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = (m) arrayList2.get(i7);
            if (mVar.isVisible()) {
                arrayList.add(mVar);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z9) {
        if (this.p) {
            this.q = true;
            if (z9) {
                this.r = true;
                return;
            }
            return;
        }
        if (z9) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.e();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i10) {
        return q(findItem(i7), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
        m g10 = g(i7, keyEvent);
        boolean q10 = g10 != null ? q(g10, null, i10) : false;
        if ((i10 & 2) != 0) {
            c(true);
        }
        return q10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, x xVar, int i7) {
        boolean z9;
        m mVar = (m) menuItem;
        if (mVar == null || !mVar.isEnabled()) {
            return false;
        }
        k kVar = mVar.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = mVar.p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(mVar)) && !kVar.e(kVar, mVar)) {
            Intent intent = mVar.g;
            if (intent != null) {
                try {
                    kVar.a.startActivity(intent);
                } catch (ActivityNotFoundException e10) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                }
            }
            n nVar = mVar.A;
            if (nVar == null || !nVar.a.onPerformDefaultAction()) {
                z9 = false;
                n nVar2 = mVar.A;
                boolean z10 = nVar2 == null && nVar2.a.hasSubMenu();
                if (!mVar.e()) {
                    z9 |= mVar.expandActionView();
                    if (z9) {
                        c(true);
                    }
                } else if (mVar.hasSubMenu() || z10) {
                    if ((i7 & 4) == 0) {
                        c(false);
                    }
                    if (!mVar.hasSubMenu()) {
                        d0 d0Var = new d0(this.a, this, mVar);
                        mVar.o = d0Var;
                        d0Var.setHeaderTitle(mVar.e);
                    }
                    d0 d0Var2 = mVar.o;
                    if (z10) {
                        nVar2.a.onPrepareSubMenu(d0Var2);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = this.u;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = xVar != null ? xVar.j(d0Var2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            x xVar2 = (x) weakReference.get();
                            if (xVar2 == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = xVar2.j(d0Var2);
                            }
                        }
                    }
                    z9 |= r0;
                    if (!z9) {
                        c(true);
                    }
                } else if ((i7 & 1) == 0) {
                    c(true);
                }
                return z9;
            }
        }
        z9 = true;
        n nVar22 = mVar.A;
        if (nVar22 == null) {
        }
        if (!mVar.e()) {
        }
        return z9;
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((m) arrayList.get(i11)).b == i7) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((m) arrayList.get(i11)).b != i7) {
                    break;
                }
                if (i11 >= 0 && i11 < arrayList.size()) {
                    arrayList.remove(i11);
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((m) arrayList.get(i10)).a == i7) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i10);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((d0) item.getSubMenu()).s(bundle);
            }
        }
        int i10 = bundle.getInt("android:menu:expandedactionview");
        if (i10 <= 0 || (findItem = findItem(i10)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z9, boolean z10) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (mVar.b == i7) {
                mVar.x = (mVar.x & (-5)) | (z10 ? 4 : 0);
                mVar.setCheckable(z9);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z9) {
        this.w = z9;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z9) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (mVar.b == i7) {
                mVar.setEnabled(z9);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z9) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (mVar.b == i7) {
                int i11 = mVar.x;
                int i12 = (i11 & (-9)) | (z9 ? 0 : 8);
                mVar.x = i12;
                if (i11 != i12) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z9) {
        this.c = z9;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((d0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i7, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i7 > 0) {
                this.m = this.b.getText(i7);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i10 > 0) {
                this.n = this.a.getDrawable(i10);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return a(0, 0, 0, this.b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.b.getString(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        return a(i7, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        m a10 = a(i7, i10, i11, charSequence);
        d0 d0Var = new d0(this.a, this, a10);
        a10.o = d0Var;
        d0Var.setHeaderTitle(a10.e);
        return d0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, int i12) {
        return a(i7, i10, i11, this.b.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return addSubMenu(i7, i10, i11, this.b.getString(i12));
    }

    public k k() {
        return this;
    }
}
