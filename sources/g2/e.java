package g2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.j;
import f7.q8;
import f7.t7;
import g7.o7;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;
import m.m1;
import m.q;
import r0.j0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e {
    public boolean a;
    public boolean b;
    public boolean c;
    public final Object d;
    public Parcelable e;
    public Object f;

    public /* synthetic */ e(TextView textView) {
        this.e = null;
        this.f = null;
        this.a = false;
        this.b = false;
        this.d = textView;
    }

    public void a() {
        Drawable drawable;
        CompoundButton compoundButton = (CompoundButton) this.d;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable = e0.b.d(compoundButton);
        } else {
            if (!o7.b) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    o7.a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e10);
                }
                o7.b = true;
            }
            Field field = o7.a;
            if (field != null) {
                try {
                    drawable = (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e11) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e11);
                    o7.a = null;
                }
            }
            drawable = null;
        }
        if (drawable != null) {
            if (this.a || this.b) {
                Drawable mutate = q8.d(drawable).mutate();
                if (this.a) {
                    mutate.setTintList((ColorStateList) this.e);
                }
                if (this.b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        q qVar = (q) this.d;
        Drawable checkMarkDrawable = qVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.a || this.b) {
                Drawable mutate = q8.d(checkMarkDrawable).mutate();
                if (this.a) {
                    mutate.setTintList((ColorStateList) this.e);
                }
                if (this.b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(qVar.getDrawableState());
                }
                qVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.e = null;
        return bundle2;
    }

    public d d() {
        String str;
        d dVar;
        Iterator it = ((o.f) this.d).iterator();
        do {
            o.b bVar = (o.b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) bVar.next();
            i.d(components, "components");
            str = (String) components.getKey();
            dVar = (d) components.getValue();
        } while (!i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(AttributeSet attributeSet, int i9) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.d;
        Context context = compoundButton.getContext();
        int[] iArr = f.a.m;
        j4.c E = j4.c.E(context, attributeSet, iArr, i9);
        TypedArray typedArray = (TypedArray) E.c;
        j0.j(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) E.c, i9);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(t7.b(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(E.v(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(m1.b(typedArray.getInt(3, -1), null));
                }
                E.G();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(t7.b(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            E.G();
        } catch (Throwable th) {
            E.G();
            throw th;
        }
    }

    public void f(String str, d provider) {
        Object obj;
        i.e(provider, "provider");
        o.f fVar = (o.f) this.d;
        o.c i9 = fVar.i(str);
        if (i9 != null) {
            obj = i9.b;
        } else {
            o.c cVar = new o.c(str, provider);
            fVar.d++;
            o.c cVar2 = fVar.b;
            if (cVar2 == null) {
                fVar.a = cVar;
                fVar.b = cVar;
            } else {
                cVar2.c = cVar;
                cVar.d = cVar2;
                fVar.b = cVar;
            }
            obj = null;
        }
        if (((d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void g() {
        if (!this.c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = (a) this.f;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f = aVar;
        try {
            j.class.getDeclaredConstructor(null);
            a aVar2 = (a) this.f;
            if (aVar2 != null) {
                aVar2.a.add(j.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public e() {
        this.d = new o.f();
        this.c = true;
    }
}
