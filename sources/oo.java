// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class oo {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public /* synthetic */ oo(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }

    public final void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public final void b() {
        no noVar = (no) this.f;
        Drawable checkMarkDrawable = noVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(noVar.getDrawableState());
                }
                noVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public final Bundle c(String str) {
        if (!this.d) {
            sc8.j("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            return null;
        }
        Bundle bundle = (Bundle) this.a;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.a;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.a;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.a = null;
        return bundle2;
    }

    public final cq9 d() {
        String str;
        cq9 cq9Var;
        Iterator it = ((wo9) this.f).iterator();
        do {
            so9 so9Var = (so9) it;
            if (!so9Var.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) so9Var.next();
            entry.getClass();
            str = (String) entry.getKey();
            cq9Var = (cq9) entry.getValue();
        } while (!rp5.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return cq9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0053, B:11:0x005a, B:12:0x0061, B:14:0x0068, B:21:0x003c, B:23:0x0042, B:25:0x0048), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #1 {all -> 0x0079, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0053, B:11:0x005a, B:12:0x0061, B:14:0x0068, B:21:0x003c, B:23:0x0042, B:25:0x0048), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = jy8.m;
        vk9 v = vk9.v(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) v.c;
        jdc.j(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) v.c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(hmd.a(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(v.m(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(lq3.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(hmd.a(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            v.y();
        }
    }

    public final void f(String str, cq9 cq9Var) {
        Object obj;
        cq9Var.getClass();
        wo9 wo9Var = (wo9) this.f;
        to9 h = wo9Var.h(str);
        if (h != null) {
            obj = h.b;
        } else {
            to9 to9Var = new to9(str, cq9Var);
            wo9Var.d++;
            to9 to9Var2 = wo9Var.b;
            if (to9Var2 == null) {
                wo9Var.a = to9Var;
                wo9Var.b = to9Var;
            } else {
                to9Var2.c = to9Var;
                to9Var.d = to9Var2;
                wo9Var.b = to9Var;
            }
            obj = null;
        }
        if (((cq9) obj) == null) {
            return;
        }
        w26.j("SavedStateProvider with the given key is already registered");
    }

    public final void g() {
        if (!this.e) {
            sc8.j("Can not perform this action after onSaveInstanceState");
            return;
        }
        j29 j29Var = (j29) this.b;
        if (j29Var == null) {
            j29Var = new j29(this);
        }
        this.b = j29Var;
        try {
            k06.class.getDeclaredConstructor(null);
            j29 j29Var2 = (j29) this.b;
            if (j29Var2 != null) {
                j29Var2.a.add(k06.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + k06.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public oo() {
        this.f = new wo9();
        this.e = true;
    }
}
