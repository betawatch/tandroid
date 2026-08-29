package a4;

import ag.e1;
import ag.f1;
import ag.j2;
import ag.m2;
import ag.n2;
import ag.o1;
import ag.q1;
import ag.r1;
import ag.w1;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.fragment.app.u0;
import bg.f4;
import bg.s3;
import cg.d1;
import cg.k2;
import cg.l1;
import cg.n0;
import cg.v0;
import h7.e0;
import h7.f0;
import h7.f8;
import h7.g8;
import h7.m8;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import nh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.t91;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(androidx.fragment.app.l lVar, u0 u0Var) {
        this.a = 10;
        this.b = lVar;
    }

    private final void a() {
        androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) this.b;
        synchronized (pVar.d) {
            try {
                if (pVar.h == null) {
                    return;
                }
                try {
                    o0.j d = pVar.d();
                    int i10 = d.e;
                    if (i10 == 2) {
                        synchronized (pVar.d) {
                        }
                    }
                    if (i10 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                    }
                    try {
                        int i11 = n0.g.a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        ab.b bVar = pVar.c;
                        Context context = pVar.a;
                        bVar.getClass();
                        o0.j[] jVarArr = {d};
                        f8 f8Var = i0.e.a;
                        m8.a("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface b10 = i0.e.a.b(context, jVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer e10 = g8.e(pVar.a, d.a);
                            if (e10 == null || b10 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(b10, f0.a(e10));
                                Trace.endSection();
                                synchronized (pVar.d) {
                                    try {
                                        e0 e0Var = pVar.h;
                                        if (e0Var != null) {
                                            e0Var.b(sVar);
                                        }
                                    } finally {
                                    }
                                }
                                pVar.b();
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
                    synchronized (pVar.d) {
                        try {
                            e0 e0Var2 = pVar.h;
                            if (e0Var2 != null) {
                                e0Var2.a(th3);
                            }
                            pVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                synchronized (hVar.a) {
                    try {
                        if (hVar.l) {
                            return;
                        }
                        long j10 = hVar.k - 1;
                        hVar.k = j10;
                        if (j10 > 0) {
                            return;
                        }
                        if (j10 < 0) {
                            hVar.c(new IllegalStateException());
                            return;
                        } else {
                            hVar.a();
                            return;
                        }
                    } finally {
                    }
                }
            case 1:
                o1 o1Var = ((e1) this.b).b.a;
                if (o1Var != null) {
                    o1Var.c();
                    return;
                }
                return;
            case 2:
                f1 f1Var = ((e1) this.b).b;
                if (f1Var.d == null) {
                    f1Var.L = null;
                    return;
                }
                int currentColor = f1Var.f.getCurrentColor();
                f1Var.l(f1Var.b, false, false);
                j2 d = f1Var.d(f1Var.b, currentColor, new RectF(f1Var.h));
                f1Var.b();
                w1 w1Var = f1Var.d;
                RectF rectF = new RectF();
                f1Var.h = rectF;
                w1Var.a(rectF);
                f1Var.p(f1Var.e(w1Var, currentColor, new RectF(f1Var.h)), false);
                f1Var.p(d, false);
                f1Var.e(w1Var, currentColor, null);
                f1Var.d = null;
                f1Var.J = 0.0f;
                f1Var.L = null;
                return;
            case 3:
                ((r1) ((q1) this.b).b).y.a.a();
                return;
            case 4:
                m2 m2Var = ((n2) this.b).a;
                if (m2Var != null) {
                    m2Var.e();
                    return;
                }
                return;
            case 5:
                ah.c cVar = (ah.c) this.b;
                ah.b bVar = cVar.c;
                if (bVar == ah.b.b) {
                    cVar.a(ah.b.a, true);
                    return;
                } else {
                    if (bVar == ah.b.c) {
                        cVar.a(ah.b.d, true);
                        return;
                    }
                    return;
                }
            case 6:
                ((androidx.activity.l) this.b).invalidateOptionsMenu();
                return;
            case 7:
                androidx.activity.k kVar = (androidx.activity.k) this.b;
                Runnable runnable = kVar.b;
                if (runnable != null) {
                    runnable.run();
                    kVar.b = null;
                    return;
                }
                return;
            case 8:
                androidx.activity.m.a((androidx.activity.m) this.b);
                return;
            case 9:
                a();
                return;
            case 10:
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(null, "$operation");
                this$0.a(null);
                return;
            case 11:
                Iterator it = ((j0) this.b).n.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            case 12:
                androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) this.b;
                androidx.lifecycle.v vVar = e0Var.f;
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
            case 13:
                f5 f5Var = (f5) this.b;
                f5Var.t0 = true;
                f5Var.s();
                return;
            case 14:
                ((View) this.b).performClick();
                return;
            case 15:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((s3) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 16:
                AndroidUtilities.showKeyboard(((f4) this.b).m0);
                return;
            case 17:
                AndroidUtilities.showKeyboard(((bh.f) this.b).a);
                return;
            case 18:
                bh.f fVar = (bh.f) ((bh.b) this.b).d;
                s1 s1Var = fVar.n;
                if (s1Var == null || s1Var.getDelegate() == null) {
                    return;
                }
                fVar.n.getDelegate().F1(fVar.n, false);
                return;
            case 19:
                ((bh.u) this.b).c.U2.N(true);
                return;
            case 20:
                ((bh.t) this.b).a();
                return;
            case 21:
                ((c1.e) this.b).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 22:
                ((c2.e) this.b).k();
                return;
            case 23:
                ((c2.h) this.b).n = -1;
                return;
            case 24:
                ((c2.z) this.b).b();
                return;
            case 25:
                ((a5.j) this.b).t();
                return;
            case 26:
                v0 v0Var = ((n0) this.b).c;
                v0Var.n.presentFragment(t91.d0(v0Var.s1(), true));
                return;
            case 27:
                aj0 aj0Var = ((d1) this.b).y;
                aj0Var.getAnimatedDrawable().L(0, true, false);
                aj0Var.d();
                return;
            case 28:
                ((l1) this.b).b.y();
                return;
            default:
                k2 k2Var = (k2) this.b;
                int size = 1073741823 - (1073741823 % k2Var.T2.size());
                f2.j0 j0Var = k2Var.U2;
                k2Var.h3 = size;
                j0Var.h1(size, (k2Var.getMeasuredHeight() - k2Var.getChildAt(0).getMeasuredHeight()) >> 1);
                k2Var.w1(null, false);
                return;
        }
    }

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
