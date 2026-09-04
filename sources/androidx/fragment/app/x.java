package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class x implements LayoutInflater.Factory2 {
    public final i0 a;

    public x(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        o0 g10;
        boolean equals = w.class.getName().equals(str);
        i0 i0Var = this.a;
        if (equals) {
            return new w(context, attributeSet, i0Var);
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
                    z10 = r.class.isAssignableFrom(b0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    r C = resourceId != -1 ? i0Var.C(resourceId) : null;
                    if (C == null && string != null) {
                        C = i0Var.D(string);
                    }
                    if (C == null && id2 != -1) {
                        C = i0Var.C(id2);
                    }
                    if (C == null) {
                        b0 H = i0Var.H();
                        context.getClassLoader();
                        C = H.a(attributeValue);
                        C.y = true;
                        C.N = resourceId != 0 ? resourceId : id2;
                        C.O = id2;
                        C.P = string;
                        C.E = true;
                        C.J = i0Var;
                        t tVar = i0Var.w;
                        C.K = tVar;
                        u uVar = tVar.b;
                        C.U = true;
                        if ((tVar != null ? tVar.a : null) != null) {
                            C.U = true;
                        }
                        g10 = i0Var.a(C);
                        if (i0.K(2)) {
                            Log.v("FragmentManager", "Fragment " + C + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (C.E) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        C.E = true;
                        C.J = i0Var;
                        t tVar2 = i0Var.w;
                        C.K = tVar2;
                        u uVar2 = tVar2.b;
                        C.U = true;
                        if ((tVar2 != null ? tVar2.a : null) != null) {
                            C.U = true;
                        }
                        g10 = i0Var.g(C);
                        if (i0.K(2)) {
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
                    throw new IllegalStateException(a4.a.p("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
