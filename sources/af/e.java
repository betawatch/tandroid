package af;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.Log;
import androidx.activity.m;
import androidx.activity.n;
import androidx.emoji2.text.p;
import androidx.fragment.app.j0;
import androidx.fragment.app.l;
import androidx.fragment.app.u0;
import androidx.lifecycle.e0;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import bg.d1;
import bg.d2;
import bg.k1;
import bg.l1;
import bg.z0;
import bh.j;
import c2.y;
import com.google.firebase.messaging.t;
import f7.j8;
import f7.k8;
import f7.r8;
import f7.w;
import f7.x;
import ff.q;
import fh.r0;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import n0.g;
import o0.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.oc;
import org.telegram.ui.eb0;
import w0.h;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(l lVar, u0 u0Var) {
        this.a = 5;
        this.b = lVar;
    }

    private final void a() {
        b3.b bVar = (b3.b) this.b;
        synchronized (((ArrayDeque) bVar.d)) {
            SharedPreferences.Editor edit = ((SharedPreferences) bVar.a).edit();
            String str = (String) bVar.b;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) bVar.d).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) bVar.c);
            }
            edit.putString(str, sb2.toString()).commit();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        b6 b6Var;
        int i10 = 0;
        switch (this.a) {
            case 0:
                ((ze.b) ((f) this.b).c).a(false);
                return;
            case 1:
                ((m) this.b).invalidateOptionsMenu();
                return;
            case 2:
                androidx.activity.l lVar = (androidx.activity.l) this.b;
                Runnable runnable = lVar.b;
                if (runnable != null) {
                    runnable.run();
                    lVar.b = null;
                    return;
                }
                return;
            case 3:
                n.a((n) this.b);
                return;
            case 4:
                p pVar = (p) this.b;
                synchronized (pVar.d) {
                    try {
                        if (pVar.h == null) {
                            return;
                        }
                        try {
                            i d = pVar.d();
                            int i11 = d.e;
                            if (i11 == 2) {
                                synchronized (pVar.d) {
                                }
                            }
                            if (i11 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i11 + ")");
                            }
                            try {
                                int i12 = g.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                v9.d dVar = pVar.c;
                                Context context = pVar.a;
                                dVar.getClass();
                                i[] iVarArr = {d};
                                j8 j8Var = i0.e.a;
                                r8.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b10 = i0.e.a.b(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e10 = k8.e(pVar.a, d.a);
                                    if (e10 == null || b10 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        t tVar = new t(b10, x.a(e10));
                                        Trace.endSection();
                                        synchronized (pVar.d) {
                                            try {
                                                w wVar = pVar.h;
                                                if (wVar != null) {
                                                    wVar.b(tVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        pVar.b();
                                        return;
                                    } finally {
                                        int i13 = g.a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (pVar.d) {
                                try {
                                    w wVar2 = pVar.h;
                                    if (wVar2 != null) {
                                        wVar2.a(th2);
                                    }
                                    pVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 5:
                l this$0 = (l) this.b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(null, "$operation");
                this$0.a(null);
                return;
            case 6:
                Iterator it = ((j0) this.b).n.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            case 7:
                e0 e0Var = (e0) this.b;
                v vVar = e0Var.f;
                if (e0Var.b == 0) {
                    e0Var.c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.a == 0 && e0Var.c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 8:
                CharSequence charSequence = (CharSequence) this.b;
                oc X = oc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 9:
                ((d1) this.b).run(null);
                return;
            case 10:
                ((eb0) this.b).run(Collections.EMPTY_LIST);
                return;
            case 11:
                ((z0) this.b).run(null);
                return;
            case 12:
                l1 l1Var = ((k1) this.b).r;
                o2 o2Var = l1Var.n;
                i9 = ((f3) l1Var).currentAccount;
                b6Var = ((f3) l1Var).resourcesProvider;
                zf.k1 k1Var = new zf.k1(o2Var, i9, null, null, null, b6Var);
                k1Var.F0 = true;
                k1Var.Y = true;
                l1Var.n.showDialog(k1Var);
                return;
            case 13:
                ((f3) this.b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new d2(i10), 220L);
                return;
            case 14:
                ((j) this.b).Z.N(true);
                return;
            case 15:
                ((c1.e) this.b).e().onError(new h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 16:
                ((c2.e) this.b).k();
                return;
            case 17:
                ((c2.h) this.b).n = -1;
                return;
            case 18:
                ((y) this.b).b();
                return;
            case 19:
                t tVar2 = (t) this.b;
                ((d3.h) ((e3.c) tVar2.e)).f(new a1.c(tVar2, 12));
                return;
            case 20:
                com.google.firebase.messaging.j.a((Intent) this.b);
                return;
            case 21:
                a();
                return;
            case 22:
                com.google.firebase.messaging.e0 e0Var2 = (com.google.firebase.messaging.e0) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + e0Var2.a.getAction() + " finishing.");
                e0Var2.b.trySetResult(null);
                return;
            case 23:
                eh.w wVar3 = (eh.w) this.b;
                wVar3.f();
                wVar3.e(true);
                return;
            case 24:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 25:
                try {
                    ((Bitmap) this.b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 26:
                q qVar = (q) this.b;
                long j10 = qVar.b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    qVar.b = j11;
                    qVar.a.h(j11);
                }
                if (qVar.b <= 0) {
                    qVar.c = false;
                }
                if (qVar.c) {
                    AndroidUtilities.runOnUIThread(qVar.d, 1000L);
                    return;
                }
                return;
            case 27:
                ((fg.c) this.b).f();
                return;
            case 28:
                fh.x xVar = (fh.x) this.b;
                xVar.d0.setTranslationX(xVar.c0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            default:
                ((r0) this.b).onBackPressed();
                return;
        }
    }

    public /* synthetic */ e(com.google.firebase.messaging.j jVar, Intent intent) {
        this.a = 20;
        this.b = intent;
    }

    public /* synthetic */ e(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }
}
