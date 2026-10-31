package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u implements View.OnClickListener {
    public final View a;
    public final String b;
    public Method c;
    public Context d;

    public u(View view, String str) {
        this.a = view;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.c == null) {
            View view2 = this.a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.b;
                if (context == null) {
                    int id2 = view2.getId();
                    if (id2 == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder u10 = a1.g.u("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    u10.append(view2.getClass());
                    u10.append(str);
                    throw new IllegalStateException(u10.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.c = method;
                        this.d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.c.invoke(this.d, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e7) {
            throw new IllegalStateException("Could not execute method for android:onClick", e7);
        }
    }
}
