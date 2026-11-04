package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements x4.b {
    @Override // x4.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // x4.b
    public final Object b(Context context) {
        s sVar = new s(new n(context, 0));
        sVar.a = 1;
        if (l.j == null) {
            synchronized (l.i) {
                try {
                    if (l.j == null) {
                        l.j = new l(sVar);
                    }
                } finally {
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        x4.a c2 = x4.a.c(context);
        c2.getClass();
        synchronized (x4.a.e) {
            try {
                obj = c2.a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final androidx.lifecycle.o m10 = ((androidx.lifecycle.t) obj).m();
        m10.a(new androidx.lifecycle.e(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.e
            public final void a(androidx.lifecycle.t tVar) {
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new o(0), 500L);
                m10.b(this);
            }

            @Override // androidx.lifecycle.e
            public final /* synthetic */ void b(androidx.lifecycle.t tVar) {
            }

            @Override // androidx.lifecycle.e
            public final /* synthetic */ void e(androidx.lifecycle.t tVar) {
            }

            @Override // androidx.lifecycle.e
            public final /* synthetic */ void f(androidx.lifecycle.t tVar) {
            }

            @Override // androidx.lifecycle.e
            public final /* synthetic */ void h(androidx.lifecycle.t tVar) {
            }

            @Override // androidx.lifecycle.e
            public final /* synthetic */ void i(androidx.lifecycle.t tVar) {
            }
        });
    }
}
