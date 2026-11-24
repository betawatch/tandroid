// default package

import android.content.Context;
import com.google.android.gms.tasks.TaskExecutors;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class eoe {
    public static void a(String str, zy5 zy5Var, yy5 yy5Var) {
        b(str, zy5Var, yy5Var, false);
    }

    public static void b(String str, zy5 zy5Var, yy5 yy5Var, boolean z) {
        if (z) {
            try {
                Context context = a.b;
                synchronized (cg7.b) {
                    try {
                        cg7.d(context, TaskExecutors.MAIN_THREAD);
                    } finally {
                    }
                }
            } catch (IllegalStateException e) {
                if (!z) {
                    b(str, zy5Var, yy5Var, true);
                    return;
                } else {
                    yy5Var.o(e);
                    fc4.g(e, false);
                    return;
                }
            } catch (Exception e2) {
                yy5Var.o(e2);
                fc4.g(e2, true);
                return;
            } catch (Throwable th) {
                yy5Var.o(null);
                fc4.g(th, false);
                return;
            }
        }
        joe.a().c(str).addOnSuccessListener(new wx4((Object) zy5Var, (byte) 21)).addOnFailureListener(new wx4((Object) yy5Var, (byte) 22));
    }
}
