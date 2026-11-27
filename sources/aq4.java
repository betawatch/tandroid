// default package

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class aq4 implements LayoutInflater.Factory2 {
    public final kq4 a;

    public aq4(kq4 kq4Var) {
        this.a = kq4Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        xq4 g;
        boolean equals = kp4.class.getName().equals(str);
        kq4 kq4Var = this.a;
        if (equals) {
            return new kp4(context, attributeSet, kq4Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u19.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = gp4.class.isAssignableFrom(eq4.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    gp4 C = resourceId != -1 ? kq4Var.C(resourceId) : null;
                    if (C == null && string != null) {
                        C = kq4Var.D(string);
                    }
                    if (C == null && id != -1) {
                        C = kq4Var.C(id);
                    }
                    if (C == null) {
                        eq4 H = kq4Var.H();
                        context.getClassLoader();
                        C = H.a(attributeValue);
                        C.E = true;
                        C.O = resourceId != 0 ? resourceId : id;
                        C.P = id;
                        C.Q = string;
                        C.F = true;
                        C.K = kq4Var;
                        ip4 ip4Var = kq4Var.w;
                        C.L = ip4Var;
                        Context context2 = ip4Var.b;
                        C.V = true;
                        if ((ip4Var == null ? null : ip4Var.a) != null) {
                            C.V = true;
                        }
                        g = kq4Var.a(C);
                        if (kq4.K(2)) {
                            Log.v("FragmentManager", "Fragment " + C + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (C.F) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        C.F = true;
                        C.K = kq4Var;
                        ip4 ip4Var2 = kq4Var.w;
                        C.L = ip4Var2;
                        Context context3 = ip4Var2.b;
                        C.V = true;
                        if ((ip4Var2 == null ? null : ip4Var2.a) != null) {
                            C.V = true;
                        }
                        g = kq4Var.g(C);
                        if (kq4.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + C + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    yq4 yq4Var = zq4.a;
                    zq4.b(new pq4(C, "Attempting to use <fragment> tag to add fragment " + C + " to container " + viewGroup));
                    zq4.a(C).getClass();
                    C.W = viewGroup;
                    g.j();
                    g.i();
                    grb.i(qd4.y("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
