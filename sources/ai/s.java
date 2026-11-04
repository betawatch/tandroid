package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Trace;
import b8.sc;
import b8.tc;
import ci.lc;
import ci.nb;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.i20;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(androidx.fragment.app.l lVar, androidx.fragment.app.u0 u0Var) {
        this.a = 11;
        this.b = lVar;
    }

    private final void a() {
        boolean z10;
        String str;
        m.o3 o3Var = (m.o3) this.b;
        synchronized (((AtomicMarkableReference) o3Var.g)) {
            try {
                z10 = false;
                if (((AtomicMarkableReference) o3Var.g).isMarked()) {
                    str = (String) ((AtomicMarkableReference) o3Var.g).getReference();
                    ((AtomicMarkableReference) o3Var.g).set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ((ba.h) o3Var.a).i((String) o3Var.c, str);
        }
    }

    private final void b() {
        b4.n nVar = (b4.n) this.b;
        Map map = null;
        ((AtomicReference) nVar.c).set(null);
        synchronized (nVar) {
            try {
                if (((AtomicMarkableReference) nVar.b).isMarked()) {
                    map = ((ba.e) ((AtomicMarkableReference) nVar.b).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) nVar.b;
                    atomicMarkableReference.set((ba.e) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (map != null) {
            m.o3 o3Var = (m.o3) nVar.d;
            ((ba.h) o3Var.a).h((String) o3Var.c, map, nVar.a);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.b;
                e0Var.a2.setTranslationX(e0Var.Z1.getAnimatedWidth() + org.telegram.messenger.g0.L(28.0f));
                return;
            case 1:
                ((z0) this.b).onBackPressed();
                return;
            case 2:
                f41 f41Var = ((b3) this.b).R1;
                if (f41Var != null) {
                    f41Var.O(false);
                    return;
                }
                return;
            case 3:
                ((m2) this.b).c();
                return;
            case 4:
                ((t2) this.b).invalidateSelf();
                return;
            case 5:
                w2 w2Var = (w2) this.b;
                lc lcVar = w2Var.e;
                if (lcVar != null) {
                    lcVar.d();
                    w2Var.invalidateSelf();
                    return;
                }
                return;
            case 6:
                ((u4) this.b).p();
                return;
            case 7:
                ((androidx.activity.l) this.b).invalidateOptionsMenu();
                return;
            case 8:
                androidx.activity.k kVar = (androidx.activity.k) this.b;
                Runnable runnable = kVar.b;
                if (runnable != null) {
                    runnable.run();
                    kVar.b = null;
                    return;
                }
                return;
            case 9:
                androidx.activity.m.a((androidx.activity.m) this.b);
                return;
            case 10:
                androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) this.b;
                synchronized (rVar.d) {
                    try {
                        if (rVar.n == null) {
                            return;
                        }
                        try {
                            o0.i d = rVar.d();
                            int i3 = d.e;
                            if (i3 == 2) {
                                synchronized (rVar.d) {
                                }
                            }
                            if (i3 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                            }
                            try {
                                int i10 = n0.g.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                ra.e eVar = rVar.c;
                                Context context = rVar.a;
                                eVar.getClass();
                                o0.i[] iVarArr = {d};
                                sc scVar = i0.e.a;
                                x7.e6.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b10 = i0.e.a.b(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e10 = tc.e(rVar.a, d.a);
                                    if (e10 == null || b10 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        ui.f fVar = new ui.f(b10, b8.x0.a(e10));
                                        Trace.endSection();
                                        synchronized (rVar.d) {
                                            try {
                                                b8.w0 w0Var = rVar.n;
                                                if (w0Var != null) {
                                                    w0Var.b(fVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        rVar.b();
                                        return;
                                    } finally {
                                        int i11 = n0.g.a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            synchronized (rVar.d) {
                                try {
                                    b8.w0 w0Var2 = rVar.n;
                                    if (w0Var2 != null) {
                                        w0Var2.a(th3);
                                    }
                                    rVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 11:
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(null, "$operation");
                this$0.a(null);
                return;
            case 12:
                Iterator it = ((androidx.fragment.app.j0) this.b).n.iterator();
                if (it.hasNext()) {
                    throw a1.g.m(it);
                }
                return;
            case 13:
                androidx.lifecycle.e0 e0Var2 = (androidx.lifecycle.e0) this.b;
                androidx.lifecycle.v vVar = e0Var2.f;
                if (e0Var2.b == 0) {
                    e0Var2.c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var2.a == 0 && e0Var2.c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var2.d = true;
                    return;
                }
                return;
            case 14:
                a();
                return;
            case 15:
                b();
                return;
            case 16:
                ((bh.c) this.b).f();
                return;
            case 17:
                ((bi.s) this.b).e();
                return;
            case 18:
                ((c1.e) this.b).e().a(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 19:
                ((c3.e) this.b).h.i0();
                return;
            case 20:
                ((c3.u) this.b).m--;
                return;
            case 21:
                r0.a.postVsyncCallback((c3.c0) this.b);
                return;
            case 22:
                try {
                    ((Bitmap) this.b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                cg.p pVar = (cg.p) this.b;
                long j10 = pVar.b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    pVar.b = j11;
                    pVar.a.h(j11);
                }
                if (pVar.b <= 0) {
                    pVar.c = false;
                }
                if (pVar.c) {
                    org.telegram.messenger.g0.i3(pVar.d, 1000L);
                    return;
                }
                return;
            case 24:
                ci.c cVar = (ci.c) this.b;
                cVar.getClass();
                new nb(cVar.getContext(), cVar.b).show();
                return;
            case 25:
                ci.u uVar = (ci.u) this.b;
                if (!uVar.isAttachedToWindow() || uVar.c.canScrollVertically(1)) {
                    return;
                }
                uVar.a();
                return;
            case 26:
                new gu0(((i20) this.b).getContext()).show();
                return;
            case 27:
                org.telegram.messenger.g0.K3(((ci.t0) this.b).X1);
                return;
            case 28:
                org.telegram.messenger.g0.K3(((ci.x0) this.b).o1);
                return;
            default:
                org.telegram.messenger.g0.K3(((ci.a1) this.b).k1);
                return;
        }
    }

    public /* synthetic */ s(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }
}
