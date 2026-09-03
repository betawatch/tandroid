package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements i2.b {
    @Override // i2.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // i2.b
    public final Object b(Context context) {
        r rVar = new r(new androidx.biometric.u(context, 1));
        rVar.a = 1;
        if (l.j == null) {
            synchronized (l.i) {
                try {
                    if (l.j == null) {
                        l.j = new l(rVar);
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
        i2.a c3 = i2.a.c(context);
        c3.getClass();
        synchronized (i2.a.e) {
            try {
                obj = c3.a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c3.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final androidx.lifecycle.o m9 = ((androidx.lifecycle.t) obj).m();
        m9.a(new androidx.lifecycle.e(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.e
            public final void a(androidx.lifecycle.t tVar) {
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new n(0), 500L);
                m9.b(this);
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
