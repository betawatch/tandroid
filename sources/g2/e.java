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
import j7.i8;
import j7.s7;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import k7.u7;
import kotlin.jvm.internal.j;
import l7.w0;
import m.l1;
import m.p;
import r0.j0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
            if (!u7.b) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    u7.a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e6) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e6);
                }
                u7.b = true;
            }
            Field field = u7.a;
            if (field != null) {
                try {
                    drawable = (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e10) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e10);
                    u7.a = null;
                }
            }
            drawable = null;
        }
        if (drawable != null) {
            if (this.a || this.b) {
                Drawable mutate = i8.d(drawable).mutate();
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
        p pVar = (p) this.d;
        Drawable checkMarkDrawable = pVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.a || this.b) {
                Drawable mutate = i8.d(checkMarkDrawable).mutate();
                if (this.a) {
                    mutate.setTintList((ColorStateList) this.e);
                }
                if (this.b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(pVar.getDrawableState());
                }
                pVar.setCheckMarkDrawable(mutate);
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
            j.d(components, "components");
            str = (String) components.getKey();
            dVar = (d) components.getValue();
        } while (!j.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(AttributeSet attributeSet, int i10) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.d;
        Context context = compoundButton.getContext();
        int[] iArr = f.a.m;
        w0 y10 = w0.y(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) y10.c;
        j0.j(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) y10.c, i10);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(s7.b(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(y10.r(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(l1.b(typedArray.getInt(3, -1), null));
                }
                y10.A();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(s7.b(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            y10.A();
        } catch (Throwable th2) {
            y10.A();
            throw th2;
        }
    }

    public void f(String str, d provider) {
        Object obj;
        j.e(provider, "provider");
        o.f fVar = (o.f) this.d;
        o.c i10 = fVar.i(str);
        if (i10 != null) {
            obj = i10.b;
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
            androidx.lifecycle.j.class.getDeclaredConstructor(null);
            a aVar2 = (a) this.f;
            if (aVar2 != null) {
                aVar2.a.add(androidx.lifecycle.j.class.getName());
            }
        } catch (NoSuchMethodException e6) {
            throw new IllegalArgumentException("Class " + androidx.lifecycle.j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
        }
    }

    public e() {
        this.d = new o.f();
        this.c = true;
    }
}
