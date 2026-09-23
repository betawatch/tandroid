package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class y implements LayoutInflater.Factory2 {
    public final k0 a;

    public y(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        q0 g10;
        boolean equals = x.class.getName().equals(str);
        k0 k0Var = this.a;
        if (equals) {
            return new x(context, attributeSet, k0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s1.a.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z10 = s.class.isAssignableFrom(d0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    s C = resourceId != -1 ? k0Var.C(resourceId) : null;
                    if (C == null && string != null) {
                        C = k0Var.D(string);
                    }
                    if (C == null && id2 != -1) {
                        C = k0Var.C(id2);
                    }
                    if (C == null) {
                        d0 H = k0Var.H();
                        context.getClassLoader();
                        C = H.a(attributeValue);
                        C.y = true;
                        C.N = resourceId != 0 ? resourceId : id2;
                        C.O = id2;
                        C.P = string;
                        C.E = true;
                        C.J = k0Var;
                        u uVar = k0Var.w;
                        C.K = uVar;
                        v vVar = uVar.b;
                        C.U = true;
                        if ((uVar != null ? uVar.a : null) != null) {
                            C.U = true;
                        }
                        g10 = k0Var.a(C);
                        if (k0.K(2)) {
                            Log.v("FragmentManager", "Fragment " + C + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (C.E) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        C.E = true;
                        C.J = k0Var;
                        u uVar2 = k0Var.w;
                        C.K = uVar2;
                        v vVar2 = uVar2.b;
                        C.U = true;
                        if ((uVar2 != null ? uVar2.a : null) != null) {
                            C.U = true;
                        }
                        g10 = k0Var.g(C);
                        if (k0.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + C + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    t1.b bVar = t1.c.a;
                    t1.c.b(new t1.a(C, "Attempting to use <fragment> tag to add fragment " + C + " to container " + viewGroup));
                    t1.c.a(C).getClass();
                    C.V = viewGroup;
                    g10.j();
                    g10.i();
                    throw new IllegalStateException(a4.a.q("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
