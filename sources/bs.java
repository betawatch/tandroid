// default package

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bs implements View.OnClickListener {
    public final View a;
    public final String b;
    public Method c;
    public Context d;

    public bs(View view, String str) {
        this.a = view;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        Method method2 = this.c;
        if (method2 == null) {
            View view2 = this.a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder p = wi8.p("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    p.append(view2.getClass());
                    p.append(str);
                    throw new IllegalStateException(p.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.c = method;
                        this.d = context;
                        method2 = method;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            method2.invoke(this.d, view);
        } catch (IllegalAccessException e) {
            wa3.h("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            wa3.h("Could not execute method for android:onClick", e2);
        }
    }
}
