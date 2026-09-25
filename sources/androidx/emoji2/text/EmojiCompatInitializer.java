package androidx.emoji2.text;

import ai.z9;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements v4.b {
    @Override // v4.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // v4.b
    public final Object b(Context context) {
        q qVar = new q(new k6.h(context, 2));
        qVar.a = 1;
        if (l.j == null) {
            synchronized (l.i) {
                try {
                    if (l.j == null) {
                        l.j = new l(qVar);
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
        v4.a c10 = v4.a.c(context);
        c10.getClass();
        synchronized (v4.a.e) {
            try {
                obj = c10.a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c10.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final androidx.lifecycle.o m10 = ((androidx.lifecycle.t) obj).m();
        m10.a(new androidx.lifecycle.e(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.e
            public final void a(androidx.lifecycle.t tVar) {
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new z9(1), 500L);
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
