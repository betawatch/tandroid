package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import ii.a2;
import ii.h2;
import java.util.ArrayList;
import java.util.HashMap;
import m.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.voip.g2;
import org.telegram.ui.Components.voip.p2;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.dg1;
import org.telegram.ui.zn;
import w7.y5;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(o0 o0Var, j1 j1Var) {
        this.a = 0;
        this.b = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 1;
        switch (this.a) {
            case 0:
                try {
                    o0.g((j1) this.b);
                    return;
                } catch (n e) {
                    e2.a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 1:
                h3 h3Var = ((j3) this.b).b;
                h3Var.requestFocus();
                AndroidUtilities.showKeyboard(h3Var);
                return;
            case 2:
                AndroidUtilities.showKeyboard(((ii.x) this.b).e0.b);
                return;
            case 3:
                ((ii.e0) this.b).invalidate();
                return;
            case 4:
                p3 p3Var = (p3) this.b;
                p3Var.c = null;
                p3Var.d = null;
                p3Var.e = null;
                p3Var.f = null;
                p3Var.c(null);
                return;
            case 5:
                ((a2) this.b).invalidateSelf();
                return;
            case 6:
                ((h2) this.b).c();
                return;
            case 7:
                j2.f fVar = (j2.f) this.b;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4, 5));
                fVar.f.d();
                return;
            case 8:
                k2.f0 f0Var = (k2.f0) this.b;
                if (f0Var.k0 >= 300000) {
                    f0Var.t.o();
                    f0Var.k0 = 0L;
                    return;
                }
                return;
            case 9:
                ((kh.b) this.b).invalidate();
                return;
            case 10:
                lh.c cVar = (lh.c) this.b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 11:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (i6) this.b, Boolean.TRUE, null, -1);
                return;
            case 12:
                n2.d dVar = (n2.d) this.b;
                if (dVar.c) {
                    return;
                }
                n2.h hVar = dVar.b;
                if (hVar != null) {
                    hVar.a(dVar.a);
                }
                dVar.d.x.remove(dVar);
                dVar.c = true;
                return;
            case 13:
                ((n2.b) this.b).a(null);
                return;
            case 14:
                dg1 dg1Var = (dg1) this.b;
                if (dg1Var.getParentLayout() != null) {
                    dg1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", dg1Var.a);
                    zn znVar = new zn(bundle);
                    znVar.ja = true;
                    dg1Var.presentFragment(znVar);
                    return;
                }
                return;
            case 15:
                ((ka.c) this.b).Z();
                return;
            case 16:
                oi.d dVar2 = (oi.d) this.b;
                AndroidUtilities.runOnUIThread(new oi.c(dVar2.a, dVar2.b, i10), 500L);
                return;
            case 17:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                return;
            case 18:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.b;
                m0Var.P0 = null;
                m0Var.setVisibleParticipant(true);
                return;
            case 19:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) this.b;
                j1Var.K = false;
                j1Var.o(false);
                j1Var.W = false;
                return;
            case 20:
                org.telegram.ui.Components.voip.j1 j1Var2 = (org.telegram.ui.Components.voip.j1) ((lg.b) this.b).b;
                j1Var2.e.invalidate();
                if (j1Var2.e.isInLayout()) {
                    return;
                }
                j1Var2.e.requestLayout();
                j1Var2.d.requestLayout();
                j1Var2.f.requestLayout();
                return;
            case 21:
                ((org.telegram.ui.Components.voip.i1) this.b).a.i(false);
                return;
            case 22:
                org.telegram.ui.Components.voip.h2 h2Var = (org.telegram.ui.Components.voip.h2) this.b;
                h2Var.e = false;
                HashMap hashMap = h2Var.a;
                ArrayList arrayList = h2Var.c;
                ArrayList arrayList2 = h2Var.b;
                if (arrayList2.isEmpty() && arrayList.isEmpty()) {
                    return;
                }
                if (h2Var.getParent() != null) {
                    TransitionManager.beginDelayedTransition(h2Var, h2Var.d);
                }
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    g2 g2Var = (g2) arrayList2.get(i11);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        if (g2Var.a.equals(((g2) arrayList.get(i12)).a)) {
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
                    h2Var.addView((View) arrayList2.get(i13), y5.t(-2, -2, 1, 4, 0, 0, 4));
                }
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    h2Var.removeView((View) arrayList.get(i14));
                }
                hashMap.clear();
                for (int i15 = 0; i15 < h2Var.getChildCount(); i15++) {
                    g2 g2Var2 = (g2) h2Var.getChildAt(i15);
                    hashMap.put(g2Var2.a, g2Var2);
                }
                arrayList2.clear();
                arrayList.clear();
                h2Var.e = true;
                AndroidUtilities.runOnUIThread(new g0(h2Var, 22), 700L);
                Runnable runnable = h2Var.h;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 23:
                TextView[] textViewArr = ((p2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 24:
                TextView[] textViewArr2 = ((p2) ((gg.k0) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 25:
                t2 t2Var = (t2) this.b;
                if (t2Var.getVisibility() == 0) {
                    t2Var.a();
                    return;
                }
                return;
            case 26:
                x2 x2Var = (x2) this.b;
                x2Var.e = Bitmap.createBitmap(x2Var.getMeasuredWidth(), x2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(x2Var.e).drawText(x2Var.d, x2Var.getMeasuredWidth() / 2, (int) ((x2Var.getMeasuredHeight() / 2) - ((x2Var.a.ascent() + x2Var.a.descent()) / 2.0f)), x2Var.a);
                x2Var.postInvalidate();
                return;
            case 27:
                ((org.telegram.ui.web.k) this.b).w.Y2.N(true);
                return;
            case 28:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.o) this.b).h.f;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            default:
                ((bu) this.b).requestFocus();
                return;
        }
    }

    public /* synthetic */ g0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
