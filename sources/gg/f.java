package gg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.Log;
import android.view.Display;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import lh.i5;
import lh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.y4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements org.telegram.ui.ActionBar.c2, il0, hh.a, Continuation, r8.i, h5.j, kf.o, r0.o, BillingController.ProductDetailsResponseListenerLegacy, v2.e, y4, xd.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        lh.s0 s0Var = (lh.s0) this.b;
        if (z4) {
            long j10 = i10;
            if (s0Var.F != j10) {
                s0Var.F = j10;
                s0Var.r.setText(lh.s0.o(j10));
            }
            s0Var.n(true);
        }
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        View view = ((i5) this.b).b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).J();
        } else {
            view.invalidate();
        }
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        ((kh.u0) this.b).h.i(m1Var);
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    public void a(Display display) {
        i5.s sVar = (i5.s) this.b;
        sVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            sVar.k = refreshRate;
            sVar.l = (refreshRate * 80) / 100;
        } else {
            h5.a.K("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            sVar.k = -9223372036854775807L;
            sVar.l = -9223372036854775807L;
        }
    }

    @Override // v2.e
    public Object apply(Object obj) {
        ((ja.c) this.b).getClass();
        String l10 = la.c0.b.l((la.b0) obj);
        kotlin.jvm.internal.j.d(l10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(l10));
        byte[] bytes = l10.getBytes(jd.a.a);
        kotlin.jvm.internal.j.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        f2.Q((f2) this.b, view);
    }

    @Override // kf.o
    public void e(long j10) {
        switch (this.a) {
            case 20:
                ((kh.e) this.b).a(j10, true);
                break;
            default:
                ((t4) this.b).h();
                break;
        }
    }

    @Override // r8.i
    public Object get() {
        switch (this.a) {
            case 6:
                return (j3.j) this.b;
            case 7:
                return (f5.t) this.b;
            case 8:
                return (j3.l) this.b;
            default:
                return Boolean.valueOf(((j3.k0) this.b).L);
        }
    }

    @Override // h5.j
    public void invoke(Object obj) {
        switch (this.a) {
            case 9:
                ((j3.y1) obj).onMediaMetadataChanged((j3.e1) this.b);
                break;
            case 10:
                ((j3.y1) obj).onAudioAttributesChanged((l3.d) this.b);
                break;
            case 11:
                ((j3.y1) obj).onCues((v4.c) this.b);
                break;
            case 12:
                ((j3.y1) obj).onMediaMetadataChanged(((j3.c0) this.b).a.M);
                break;
            case 13:
                ((j3.y1) obj).onMetadata((e4.c) this.b);
                break;
            case 14:
            default:
                ((k3.b) obj).d((n3.f) this.b);
                break;
            case 15:
                ((k3.b) obj).onSeekStarted((k3.a) this.b);
                break;
            case 16:
                ((k3.b) obj).f((o4.r) this.b);
                break;
            case 17:
                ((k3.b) obj).b((j3.t1) this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                ((s0) this.b).run();
                break;
            case 1:
                ((x1) this.b).run();
                break;
            case 21:
                ((kh.x) this.b).run();
                break;
            default:
                ((Utilities.Callback) this.b).run(d2Var.g(i10, true, true));
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(p2.h hVar, List list) {
        int i10;
        kh.g2 g2Var = (kh.g2) this.b;
        ArrayList arrayList = g2Var.k0;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            p2.n nVar = (p2.n) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    eg.n nVar2 = (eg.n) obj;
                    if (nVar2.h() != null && nVar2.h().equals(nVar.c)) {
                        nVar2.h = nVar;
                        if (nVar2.f() > j10) {
                            j10 = nVar2.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((eg.n) obj2).g = j10;
        }
        AndroidUtilities.runOnUIThread(new e3.h(g2Var, 26));
    }

    @Override // hh.a
    public void p(Canvas canvas, int i10) {
        hh.j jVar = (hh.j) this.b;
        jVar.getClass();
        canvas.save();
        RectF rectF = jVar.r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        jVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    public /* synthetic */ f(k3.a aVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ f(k3.a aVar, o4.j jVar, o4.r rVar, IOException iOException, boolean z4) {
        this.a = 16;
        this.b = rVar;
    }

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }
}
