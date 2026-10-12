package ig;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import bi.u3;
import java.util.ArrayList;
import java.util.HashMap;
import ji.h2;
import ji.h5;
import m.q3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.voip.o2;
import org.telegram.ui.fo;
import org.telegram.ui.lg1;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long cameraFlipElapsedMs;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                u0 u0Var = (u0) ((a6.i) obj).b;
                u0Var.c.W2.N(true);
                u0Var.b0();
                break;
            case 1:
                w0 w0Var = (w0) obj;
                w0Var.c.W2.N(true);
                w0Var.V(true);
                break;
            case 2:
                g1 g1Var = (g1) obj;
                g1Var.a.W2.N(true);
                g1Var.Y(true);
                break;
            case 3:
                ((u3) obj).run(Boolean.FALSE);
                break;
            case 4:
                NotificationCenter.getInstance(((b2) obj).a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 5:
                j2.f fVar = (j2.f) obj;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4));
                fVar.f.d();
                break;
            case 6:
                h3 h3Var = ((j3) obj).b;
                h3Var.requestFocus();
                AndroidUtilities.showKeyboard(h3Var);
                break;
            case 7:
                AndroidUtilities.showKeyboard(((ji.x) obj).e0.b);
                break;
            case 8:
                ((ji.d0) obj).invalidate();
                break;
            case 9:
                q3 q3Var = (q3) obj;
                q3Var.c = null;
                q3Var.d = null;
                q3Var.e = null;
                q3Var.f = null;
                q3Var.e(null);
                break;
            case 10:
                ((ji.a2) obj).invalidateSelf();
                break;
            case 11:
                ((h2) obj).c();
                break;
            case 12:
                ((k2.e) obj).c();
                break;
            case 13:
                e2.r rVar = (e2.r) obj;
                rVar.getClass();
                if (Thread.currentThread() == rVar.a) {
                    rVar.e(-1, new j2.e(26));
                    break;
                }
                break;
            case 14:
                k2.s0 s0Var = (k2.s0) obj;
                if (s0Var.a0 >= 300000) {
                    s0Var.n.d();
                    s0Var.a0 = 0L;
                    break;
                }
                break;
            case 15:
                ((lh.b) obj).invalidate();
                break;
            case 16:
                o60 o60Var = (o60) ((l2.f) obj).b;
                o60Var.p0 = true;
                StringBuilder sb2 = new StringBuilder("RoundVideo camera flip first frame: elapsedMs=");
                cameraFlipElapsedMs = o60Var.getCameraFlipElapsedMs();
                sb2.append(cameraFlipElapsedMs);
                FileLog.d(sb2.toString());
                o60Var.t(true);
                o60.l(o60Var);
                break;
            case 17:
                mh.c cVar = (mh.c) obj;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.b.a(cVar.H.isSendError(), true);
                    break;
                }
                break;
            case 18:
                n2.d dVar = (n2.d) obj;
                if (!dVar.c) {
                    n2.g gVar = dVar.b;
                    if (gVar != null) {
                        gVar.a(dVar.a);
                    }
                    dVar.d.x.remove(dVar);
                    dVar.c = true;
                    break;
                }
                break;
            case 19:
                ((n2.b) obj).a(null);
                break;
            case 20:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (f6) obj, Boolean.TRUE, null, -1);
                break;
            case 21:
                ((h5) obj).U0();
                break;
            case 22:
                lg1 lg1Var = (lg1) obj;
                if (lg1Var.getParentLayout() != null) {
                    lg1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", lg1Var.a);
                    fo foVar = new fo(bundle);
                    foVar.ja = true;
                    lg1Var.presentFragment(foVar);
                    break;
                }
                break;
            case 23:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) obj);
                break;
            case 24:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) obj;
                l0Var.P0 = null;
                l0Var.setVisibleParticipant(true);
                break;
            case 25:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) obj;
                h1Var.K = false;
                h1Var.o(false);
                h1Var.W = false;
                break;
            case 26:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) ((mg.b) obj).b;
                h1Var2.e.invalidate();
                if (!h1Var2.e.isInLayout()) {
                    h1Var2.e.requestLayout();
                    h1Var2.d.requestLayout();
                    h1Var2.f.requestLayout();
                    break;
                }
                break;
            case 27:
                ((org.telegram.ui.Components.voip.g1) obj).a.i(false);
                break;
            case 28:
                org.telegram.ui.Components.voip.f2 f2Var = (org.telegram.ui.Components.voip.f2) obj;
                f2Var.e = false;
                HashMap hashMap = f2Var.a;
                ArrayList arrayList = f2Var.c;
                ArrayList arrayList2 = f2Var.b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (f2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(f2Var, f2Var.d);
                    }
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) arrayList2.get(i11);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList.size()) {
                                break;
                            }
                            if (e2Var.a.equals(((org.telegram.ui.Components.voip.e2) arrayList.get(i12)).a)) {
                                arrayList2.remove(i11);
                                arrayList.remove(i12);
                                i11--;
                            } else {
                                i12++;
                            }
                        }
                        i11++;
                    }
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        f2Var.addView((View) arrayList2.get(i13), a6.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        f2Var.removeView((View) arrayList.get(i14));
                    }
                    hashMap.clear();
                    for (int i15 = 0; i15 < f2Var.getChildCount(); i15++) {
                        org.telegram.ui.Components.voip.e2 e2Var2 = (org.telegram.ui.Components.voip.e2) f2Var.getChildAt(i15);
                        hashMap.put(e2Var2.a, e2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    f2Var.e = true;
                    AndroidUtilities.runOnUIThread(new t0(f2Var, 28), 700L);
                    Runnable runnable = f2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                TextView[] textViewArr = ((o2) obj).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
        }
    }
}
