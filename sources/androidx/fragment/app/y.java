package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class y implements LayoutInflater.Factory2 {
    public final j0 a;

    public y(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        p0 g10;
        boolean equals = x.class.getName().equals(str);
        j0 j0Var = this.a;
        if (equals) {
            return new x(context, attributeSet, j0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v1.a.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z10 = s.class.isAssignableFrom(c0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    s C = resourceId != -1 ? j0Var.C(resourceId) : null;
                    if (C == null && string != null) {
                        C = j0Var.D(string);
                    }
                    if (C == null && id2 != -1) {
                        C = j0Var.C(id2);
                    }
                    if (C == null) {
                        c0 H = j0Var.H();
                        context.getClassLoader();
                        C = H.a(attributeValue);
                        C.E = true;
                        C.O = resourceId != 0 ? resourceId : id2;
                        C.P = id2;
                        C.Q = string;
                        C.F = true;
                        C.K = j0Var;
                        u uVar = j0Var.w;
                        C.L = uVar;
                        v vVar = uVar.b;
                        C.V = true;
                        if ((uVar != null ? uVar.a : null) != null) {
                            C.V = true;
                        }
                        g10 = j0Var.a(C);
                        if (j0.K(2)) {
                            Log.v("FragmentManager", "Fragment " + C + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (C.F) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        C.F = true;
                        C.K = j0Var;
                        u uVar2 = j0Var.w;
                        C.L = uVar2;
                        v vVar2 = uVar2.b;
                        C.V = true;
                        if ((uVar2 != null ? uVar2.a : null) != null) {
                            C.V = true;
                        }
                        g10 = j0Var.g(C);
                        if (j0.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + C + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    w1.b bVar = w1.c.a;
                    w1.c.b(new w1.a(C, "Attempting to use <fragment> tag to add fragment " + C + " to container " + viewGroup));
                    w1.c.a(C).getClass();
                    C.W = viewGroup;
                    g10.j();
                    g10.i();
                    throw new IllegalStateException(a8.p0.p("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
