package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        boolean z4;
        p0 g10;
        boolean equals = x.class.getName().equals(str);
        j0 j0Var = this.a;
        if (equals) {
            return new x(context, attributeSet, j0Var);
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
                    z4 = s.class.isAssignableFrom(c0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z4 = false;
                }
                if (z4) {
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
                        C.y = true;
                        C.K = resourceId != 0 ? resourceId : id2;
                        C.L = id2;
                        C.M = string;
                        C.B = true;
                        C.G = j0Var;
                        u uVar = j0Var.w;
                        C.H = uVar;
                        v vVar = uVar.b;
                        C.R = true;
                        if ((uVar != null ? uVar.a : null) != null) {
                            C.R = true;
                        }
                        g10 = j0Var.a(C);
                        if (j0.K(2)) {
                            Log.v("FragmentManager", "Fragment " + C + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (C.B) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        C.B = true;
                        C.G = j0Var;
                        u uVar2 = j0Var.w;
                        C.H = uVar2;
                        v vVar2 = uVar2.b;
                        C.R = true;
                        if ((uVar2 != null ? uVar2.a : null) != null) {
                            C.R = true;
                        }
                        g10 = j0Var.g(C);
                        if (j0.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + C + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    t1.b bVar = t1.c.a;
                    t1.c.b(new t1.a(C, "Attempting to use <fragment> tag to add fragment " + C + " to container " + viewGroup));
                    t1.c.a(C).getClass();
                    C.S = viewGroup;
                    g10.j();
                    g10.i();
                    throw new IllegalStateException(android.support.v4.media.a.o("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
