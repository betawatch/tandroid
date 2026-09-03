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
import c2.z;
import c5.j;
import cg.c1;
import cg.d1;
import cg.h2;
import cg.i2;
import cg.n1;
import cg.s1;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.k;
import com.google.firebase.messaging.r;
import dg.b4;
import dg.o3;
import dh.u;
import j7.a8;
import j7.b8;
import j7.j8;
import j7.s;
import j7.t;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import n0.g;
import o0.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.sf1;
import org.telegram.ui.zn;
import ph.o4;
import w0.h;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                sf1 sf1Var = (sf1) this.b;
                if (sf1Var.getParentLayout() != null) {
                    sf1Var.E = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", sf1Var.a);
                    zn znVar = new zn(bundle);
                    znVar.ga = true;
                    sf1Var.presentFragment(znVar);
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
                                ab.a aVar = qVar.c;
                                Context context = qVar.a;
                                aVar.getClass();
                                i[] iVarArr = {d};
                                a8 a8Var = i0.e.a;
                                j8.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b10 = i0.e.a.b(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e = b8.e(qVar.a, d.a);
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
                ((z) this.b).b();
                return;
            case 12:
                o5.i iVar = ((c1) this.b).b.a;
                if (iVar != null) {
                    iVar.q();
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
                    h2Var.g();
                    return;
                }
                return;
            case 16:
                ch.c cVar = (ch.c) this.b;
                ch.b bVar = cVar.c;
                if (bVar == ch.b.b) {
                    cVar.a(ch.b.a, true);
                    return;
                } else {
                    if (bVar == ch.b.c) {
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
                c0 c0Var = (c0) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + c0Var.a.getAction() + " finishing.");
                c0Var.b.trySetResult(null);
                return;
            case 20:
                b();
                return;
            case 21:
                ((j) this.b).A();
                return;
            case 22:
                o4 o4Var = (o4) this.b;
                o4Var.u0 = true;
                o4Var.s();
                return;
            case 23:
                ((View) this.b).performClick();
                return;
            case 24:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((o3) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 25:
                AndroidUtilities.showKeyboard(((b4) this.b).n0);
                return;
            case 26:
                AndroidUtilities.showKeyboard(((dh.f) this.b).a);
                return;
            case 27:
                dh.f fVar = (dh.f) ((dh.b) this.b).d;
                org.telegram.ui.Cells.s1 s1Var2 = fVar.n;
                if (s1Var2 == null || s1Var2.getDelegate() == null) {
                    return;
                }
                fVar.n.getDelegate().I1(fVar.n, false);
                return;
            case 28:
                ((u) this.b).c.V2.N(true);
                return;
            default:
                ((dh.t) this.b).a();
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
