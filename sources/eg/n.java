package eg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.Log;
import android.view.Display;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import ih.i5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import jh.fa;
import jh.ia;
import jh.j5;
import jh.s7;
import jh.u4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.w41;
import org.telegram.ui.ao0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements org.telegram.ui.ActionBar.b2, al0, OnSuccessListener, fh.a, Continuation, jf.o, r0.o, BillingController.ProductDetailsResponseListenerLegacy, f5.j, v2.e, b5, vd.b, Utilities.Callback5, ao0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        jh.s0 s0Var = (jh.s0) this.b;
        if (z10) {
            long j10 = i10;
            if (s0Var.E != j10) {
                s0Var.E = j10;
                s0Var.r.setText(jh.s0.o(j10));
            }
            s0Var.n(true);
        }
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        ((ih.v0) this.b).h.i(m1Var);
        return r0.m1.b;
    }

    @Override // vd.b
    public void N(int i10, float f9, float f10, vd.c cVar) {
        View view = ((j5) this.b).b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).J();
        } else {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.ao0
    public void a(int i10) {
        switch (this.a) {
            case 23:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        callback2.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    callback2.run(Boolean.TRUE, null);
                    break;
                }
                break;
            case 24:
                bh.v vVar = (bh.v) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        vVar.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    vVar.run(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                i5 i5Var = (i5) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        i5Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    i5Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // v2.e
    public Object apply(Object obj) {
        ((za.c) this.b).getClass();
        String y8 = ja.f0.b.y((ja.e0) obj);
        kotlin.jvm.internal.j.d(y8, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(y8));
        byte[] bytes = y8.getBytes(hd.a.a);
        kotlin.jvm.internal.j.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        g2.Q((g2) this.b, view);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    public void c(Display display) {
        g5.s sVar = (g5.s) this.b;
        sVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            sVar.k = refreshRate;
            sVar.l = (refreshRate * 80) / 100;
        } else {
            f5.a.K("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            sVar.k = -9223372036854775807L;
            sVar.l = -9223372036854775807L;
        }
    }

    @Override // jf.o
    public void e(long j10) {
        switch (this.a) {
            case 6:
                ((ih.e) this.b).a(j10, true);
                break;
            default:
                ((u4) this.b).h();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                ((y1) this.b).run();
                break;
            case 7:
                ((ih.y) this.b).run();
                break;
            default:
                ((Utilities.Callback) this.b).run(c2Var.g(i10, true, true));
                break;
        }
    }

    @Override // f5.j
    public void invoke(Object obj) {
        switch (this.a) {
            case 10:
                ((j3.a2) obj).onMediaMetadataChanged((j3.h1) this.b);
                break;
            case 11:
                ((j3.a2) obj).onAudioAttributesChanged((l3.e) this.b);
                break;
            case 12:
                ((j3.a2) obj).onCues((t4.c) this.b);
                break;
            case 13:
                ((j3.a2) obj).onMediaMetadataChanged(((j3.h0) this.b).a.O);
                break;
            case 14:
                ((j3.a2) obj).onMetadata((b4.c) this.b);
                break;
            case 15:
                ((j3.a2) obj).onDeviceInfoChanged((j3.m) this.b);
                break;
            case 27:
                ((k3.b) obj).h((l4.x) this.b);
                break;
            case 28:
                ((k3.b) obj).a((j3.v1) this.b);
                break;
            default:
                ((k3.b) obj).f((m3.f) this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(p2.g gVar, List list) {
        int i10;
        ih.h2 h2Var = (ih.h2) this.b;
        ArrayList arrayList = h2Var.j0;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            p2.l lVar = (p2.l) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    cg.n nVar = (cg.n) obj;
                    if (nVar.h() != null && nVar.h().equals(lVar.c)) {
                        nVar.h = lVar;
                        if (nVar.f() > j10) {
                            j10 = nVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((cg.n) obj2).g = j10;
        }
        AndroidUtilities.runOnUIThread(new cg.m2(h2Var, 20));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((e1.b) this.b).invoke(obj);
    }

    @Override // fh.a
    public void p(Canvas canvas, int i10) {
        fh.j jVar = (fh.j) this.b;
        jVar.getClass();
        canvas.save();
        RectF rectF = jVar.r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        jVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 22:
                s7.b((s7) this.b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                break;
            default:
                fa faVar = (fa) this.b;
                w41 w41Var = (w41) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                faVar.getClass();
                if (w41Var.G instanceof TL_stars.StarsTransaction) {
                    ia.h1(faVar.getContext(), false, 0L, faVar.c, (TL_stars.StarsTransaction) w41Var.G, faVar.b);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    public /* synthetic */ n(k3.a aVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ n(k3.a aVar, l4.p pVar, l4.x xVar, IOException iOException, boolean z10) {
        this.a = 27;
        this.b = xVar;
    }

    @Override // vd.b
    public /* synthetic */ void z(float f9, int i10) {
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
