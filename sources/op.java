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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class op {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public /* synthetic */ op(TextView textView) {
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
        np npVar = (np) this.f;
        Drawable checkMarkDrawable = npVar.getCheckMarkDrawable();
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
                    mutate.setState(npVar.getDrawableState());
                }
                npVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public final Bundle c(String str) {
        if (!this.d) {
            dq9.m("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
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

    public final ds9 d() {
        String str;
        ds9 ds9Var;
        Iterator it = ((xq9) this.f).iterator();
        do {
            tq9 tq9Var = (tq9) it;
            if (!tq9Var.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) tq9Var.next();
            entry.getClass();
            str = (String) entry.getKey();
            ds9Var = (ds9) entry.getValue();
        } while (!rr5.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return ds9Var;
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
        int[] iArr = k09.m;
        wm9 v = wm9.v(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) v.c;
        kfc.j(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) v.c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(kod.a(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(v.i(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(vr3.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(kod.a(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            v.y();
        }
    }

    public final void f(String str, ds9 ds9Var) {
        Object obj;
        ds9Var.getClass();
        xq9 xq9Var = (xq9) this.f;
        uq9 h = xq9Var.h(str);
        if (h != null) {
            obj = h.b;
        } else {
            uq9 uq9Var = new uq9(str, ds9Var);
            xq9Var.d++;
            uq9 uq9Var2 = xq9Var.b;
            if (uq9Var2 == null) {
                xq9Var.a = uq9Var;
                xq9Var.b = uq9Var;
            } else {
                uq9Var2.c = uq9Var;
                uq9Var.d = uq9Var2;
                xq9Var.b = uq9Var;
            }
            obj = null;
        }
        if (((ds9) obj) == null) {
            return;
        }
        u36.j("SavedStateProvider with the given key is already registered");
    }

    public final void g() {
        if (!this.e) {
            dq9.m("Can not perform this action after onSaveInstanceState");
            return;
        }
        m49 m49Var = (m49) this.b;
        if (m49Var == null) {
            m49Var = new m49(this);
        }
        this.b = m49Var;
        try {
            k26.class.getDeclaredConstructor(null);
            m49 m49Var2 = (m49) this.b;
            if (m49Var2 != null) {
                m49Var2.a.add(k26.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + k26.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public op() {
        this.f = new xq9();
        this.e = true;
    }
}
