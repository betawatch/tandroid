package ag;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import androidx.activity.m;
import androidx.activity.n;
import androidx.emoji2.text.q;
import androidx.fragment.app.j0;
import androidx.fragment.app.l;
import androidx.fragment.app.u0;
import androidx.lifecycle.e0;
import androidx.lifecycle.v;
import c2.y;
import c5.j;
import cg.c1;
import cg.d1;
import cg.h2;
import cg.i2;
import cg.n1;
import cg.s1;
import com.google.firebase.messaging.d0;
import com.google.firebase.messaging.k;
import com.google.firebase.messaging.r;
import dg.b4;
import dg.o3;
import dh.u;
import j7.a8;
import j7.i8;
import j7.s;
import j7.t;
import j7.z7;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import n0.g;
import o0.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.kf1;
import org.telegram.ui.xn;
import ph.o4;
import w0.h;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(l lVar, u0 u0Var) {
        this.a = 5;
        this.b = lVar;
    }

    private final void a() {
        j jVar = (j) this.b;
        synchronized (((ArrayDeque) jVar.d)) {
            SharedPreferences.Editor edit = ((SharedPreferences) jVar.a).edit();
            String str = (String) jVar.b;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) jVar.d).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) jVar.c);
            }
            edit.putString(str, sb.toString()).commit();
        }
    }

    private final void b() {
        d4.f fVar = (d4.f) this.b;
        synchronized (fVar.a) {
            try {
                if (fVar.l) {
                    return;
                }
                long j10 = fVar.k - 1;
                fVar.k = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    fVar.c(new IllegalStateException());
                } else {
                    fVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kf1 kf1Var = (kf1) this.b;
                if (kf1Var.getParentLayout() != null) {
                    kf1Var.E = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", kf1Var.a);
                    xn xnVar = new xn(bundle);
                    xnVar.ga = true;
                    kf1Var.presentFragment(xnVar);
                    return;
                }
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
                q qVar = (q) this.b;
                synchronized (qVar.d) {
                    try {
                        if (qVar.h == null) {
                            return;
                        }
                        try {
                            i d = qVar.d();
                            int i10 = d.e;
                            if (i10 == 2) {
                                synchronized (qVar.d) {
                                }
                            }
                            if (i10 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                            }
                            try {
                                int i11 = g.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                cb.b bVar = qVar.c;
                                Context context = qVar.a;
                                bVar.getClass();
                                i[] iVarArr = {d};
                                z7 z7Var = i0.e.a;
                                i8.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b10 = i0.e.a.b(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e = a8.e(qVar.a, d.a);
                                    if (e == null || b10 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        r rVar = new r(b10, t.a(e));
                                        Trace.endSection();
                                        synchronized (qVar.d) {
                                            try {
                                                s sVar = qVar.h;
                                                if (sVar != null) {
                                                    sVar.b(rVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        qVar.b();
                                        return;
                                    } finally {
                                        int i12 = g.a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            synchronized (qVar.d) {
                                try {
                                    s sVar2 = qVar.h;
                                    if (sVar2 != null) {
                                        sVar2.a(th3);
                                    }
                                    qVar.b();
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
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(null, "$operation");
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
                ((c1.f) this.b).e().onError(new h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 9:
                ((c2.e) this.b).k();
                return;
            case 10:
                ((c2.h) this.b).n = -1;
                return;
            case 11:
                ((y) this.b).b();
                return;
            case 12:
                o5.i iVar = ((c1) this.b).b.a;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            case 13:
                d1 d1Var = ((c1) this.b).b;
                if (d1Var.d == null) {
                    d1Var.L = null;
                    return;
                }
                int currentColor = d1Var.f.getCurrentColor();
                d1Var.l(d1Var.b, false, false);
                b4.e0 d10 = d1Var.d(d1Var.b, currentColor, new RectF(d1Var.h));
                d1Var.b();
                s1 s1Var = d1Var.d;
                RectF rectF = new RectF();
                d1Var.h = rectF;
                s1Var.a(rectF);
                d1Var.p(d1Var.e(s1Var, currentColor, new RectF(d1Var.h)), false);
                d1Var.p(d10, false);
                d1Var.e(s1Var, currentColor, null);
                d1Var.d = null;
                d1Var.J = 0.0f;
                d1Var.L = null;
                return;
            case 14:
                ((n1) ((androidx.activity.i) this.b).b).y.a.a();
                return;
            case 15:
                h2 h2Var = ((i2) this.b).a;
                if (h2Var != null) {
                    h2Var.e();
                    return;
                }
                return;
            case 16:
                ch.c cVar = (ch.c) this.b;
                ch.b bVar2 = cVar.c;
                if (bVar2 == ch.b.b) {
                    cVar.a(ch.b.a, true);
                    return;
                } else {
                    if (bVar2 == ch.b.c) {
                        cVar.a(ch.b.d, true);
                        return;
                    }
                    return;
                }
            case 17:
                k.a((Intent) this.b);
                return;
            case 18:
                a();
                return;
            case 19:
                d0 d0Var = (d0) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + d0Var.a.getAction() + " finishing.");
                d0Var.b.trySetResult(null);
                return;
            case 20:
                b();
                return;
            case 21:
                o4 o4Var = (o4) this.b;
                o4Var.u0 = true;
                o4Var.s();
                return;
            case 22:
                ((View) this.b).performClick();
                return;
            case 23:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((o3) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 24:
                AndroidUtilities.showKeyboard(((b4) this.b).n0);
                return;
            case 25:
                AndroidUtilities.showKeyboard(((dh.f) this.b).a);
                return;
            case 26:
                dh.f fVar = (dh.f) ((dh.b) this.b).d;
                t1 t1Var = fVar.n;
                if (t1Var == null || t1Var.getDelegate() == null) {
                    return;
                }
                fVar.n.getDelegate().G1(fVar.n, false);
                return;
            case 27:
                ((u) this.b).c.V2.N(true);
                return;
            case 28:
                ((dh.t) this.b).a();
                return;
            default:
                r rVar2 = (r) this.b;
                ((f3.h) ((g3.c) rVar2.e)).f(new a1.c(rVar2, 25));
                return;
        }
    }

    public /* synthetic */ d(k kVar, Intent intent) {
        this.a = 17;
        this.b = intent;
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
