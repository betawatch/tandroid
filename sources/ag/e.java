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
import androidx.emoji2.text.q;
import androidx.fragment.app.j0;
import androidx.fragment.app.u0;
import androidx.lifecycle.e0;
import androidx.lifecycle.v;
import c2.y;
import com.google.firebase.messaging.d0;
import com.google.firebase.messaging.s;
import dg.b1;
import dg.c1;
import dg.g2;
import dg.h2;
import dg.m1;
import dg.r1;
import eg.m3;
import eg.z3;
import j7.a8;
import j7.b8;
import j7.j8;
import j7.t;
import j7.u;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.sf1;
import org.telegram.ui.xn;
import qh.n4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(androidx.fragment.app.l lVar, u0 u0Var) {
        this.a = 5;
        this.b = lVar;
    }

    private final void a() {
        c5.j jVar = (c5.j) this.b;
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
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (j6) this.b, Boolean.TRUE, null, -1);
                return;
            case 1:
                ((androidx.activity.m) this.b).invalidateOptionsMenu();
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
                androidx.activity.n.a((androidx.activity.n) this.b);
                return;
            case 4:
                q qVar = (q) this.b;
                synchronized (qVar.d) {
                    try {
                        if (qVar.h == null) {
                            return;
                        }
                        try {
                            o0.i d = qVar.d();
                            int i10 = d.e;
                            if (i10 == 2) {
                                synchronized (qVar.d) {
                                }
                            }
                            if (i10 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                            }
                            try {
                                int i11 = n0.g.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                cb.b bVar = qVar.c;
                                Context context = qVar.a;
                                bVar.getClass();
                                o0.i[] iVarArr = {d};
                                a8 a8Var = i0.e.a;
                                j8.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b10 = i0.e.a.b(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e6 = b8.e(qVar.a, d.a);
                                    if (e6 == null || b10 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        s sVar = new s(b10, u.a(e6));
                                        Trace.endSection();
                                        synchronized (qVar.d) {
                                            try {
                                                t tVar = qVar.h;
                                                if (tVar != null) {
                                                    tVar.b(sVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        qVar.b();
                                        return;
                                    } finally {
                                        int i12 = n0.g.a;
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
                                    t tVar2 = qVar.h;
                                    if (tVar2 != null) {
                                        tVar2.a(th3);
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
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.b;
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
                sf1 sf1Var = (sf1) this.b;
                if (sf1Var.getParentLayout() != null) {
                    sf1Var.E = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", sf1Var.a);
                    xn xnVar = new xn(bundle);
                    xnVar.ga = true;
                    sf1Var.presentFragment(xnVar);
                    return;
                }
                return;
            case 9:
                ((c1.f) this.b).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 10:
                ((c2.e) this.b).k();
                return;
            case 11:
                ((c2.h) this.b).n = -1;
                return;
            case 12:
                ((y) this.b).b();
                return;
            case 13:
                com.google.firebase.messaging.k.a((Intent) this.b);
                return;
            case 14:
                a();
                return;
            case 15:
                d0 d0Var = (d0) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + d0Var.a.getAction() + " finishing.");
                d0Var.b.trySetResult(null);
                return;
            case 16:
                b();
                return;
            case 17:
                o5.i iVar = ((b1) this.b).b.a;
                if (iVar != null) {
                    iVar.c();
                    return;
                }
                return;
            case 18:
                c1 c1Var = ((b1) this.b).b;
                if (c1Var.d == null) {
                    c1Var.L = null;
                    return;
                }
                int currentColor = c1Var.f.getCurrentColor();
                c1Var.l(c1Var.b, false, false);
                b4.e0 d10 = c1Var.d(c1Var.b, currentColor, new RectF(c1Var.h));
                c1Var.b();
                r1 r1Var = c1Var.d;
                RectF rectF = new RectF();
                c1Var.h = rectF;
                r1Var.a(rectF);
                c1Var.p(c1Var.e(r1Var, currentColor, new RectF(c1Var.h)), false);
                c1Var.p(d10, false);
                c1Var.e(r1Var, currentColor, null);
                c1Var.d = null;
                c1Var.J = 0.0f;
                c1Var.L = null;
                return;
            case 19:
                ((m1) ((androidx.activity.i) this.b).b).y.a.a();
                return;
            case 20:
                g2 g2Var = ((h2) this.b).a;
                if (g2Var != null) {
                    g2Var.e();
                    return;
                }
                return;
            case 21:
                dh.c cVar = (dh.c) this.b;
                dh.b bVar2 = cVar.c;
                if (bVar2 == dh.b.b) {
                    cVar.a(dh.b.a, true);
                    return;
                } else {
                    if (bVar2 == dh.b.c) {
                        cVar.a(dh.b.d, true);
                        return;
                    }
                    return;
                }
            case 22:
                s sVar2 = (s) this.b;
                ((f3.h) ((g3.c) sVar2.d)).f(new a1.c(sVar2, 16));
                return;
            case 23:
                ((c5.j) this.b).A();
                return;
            case 24:
                n4 n4Var = (n4) this.b;
                n4Var.u0 = true;
                n4Var.s();
                return;
            case 25:
                ((View) this.b).performClick();
                return;
            case 26:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((m3) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 27:
                AndroidUtilities.showKeyboard(((z3) this.b).n0);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((eh.f) this.b).a);
                return;
            default:
                eh.f fVar = (eh.f) ((eh.b) this.b).d;
                t1 t1Var = fVar.n;
                if (t1Var == null || t1Var.getDelegate() == null) {
                    return;
                }
                fVar.n.getDelegate().L1(fVar.n, false);
                return;
        }
    }

    public /* synthetic */ e(com.google.firebase.messaging.k kVar, Intent intent) {
        this.a = 13;
        this.b = intent;
    }

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
