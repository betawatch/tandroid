package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import ii.b2;
import ii.i2;
import java.util.ArrayList;
import java.util.HashMap;
import m.q3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.voip.g2;
import org.telegram.ui.Components.voip.h2;
import org.telegram.ui.Components.voip.p2;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.fg1;
import org.telegram.ui.zn;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(p0 p0Var, k1 k1Var) {
        this.a = 0;
        this.b = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long cameraFlipElapsedMs;
        int i10 = 1;
        switch (this.a) {
            case 0:
                try {
                    p0.f((k1) this.b);
                    return;
                } catch (n e7) {
                    e2.a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
                    throw new RuntimeException(e7);
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
                q3 q3Var = (q3) this.b;
                q3Var.c = null;
                q3Var.d = null;
                q3Var.e = null;
                q3Var.f = null;
                q3Var.e(null);
                return;
            case 5:
                ((b2) this.b).invalidateSelf();
                return;
            case 6:
                ((i2) this.b).c();
                return;
            case 7:
                j2.f fVar = (j2.f) this.b;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4, 3));
                fVar.f.d();
                return;
            case 8:
                k2.d0 d0Var = (k2.d0) this.b;
                if (d0Var.j0 >= 300000) {
                    d0Var.s.d();
                    d0Var.j0 = 0L;
                    return;
                }
                return;
            case 9:
                ((kh.b) this.b).invalidate();
                return;
            case 10:
                s60 s60Var = (s60) ((m2.t) this.b).b;
                s60Var.o0 = true;
                StringBuilder sb2 = new StringBuilder("RoundVideo camera flip first frame: elapsedMs=");
                cameraFlipElapsedMs = s60Var.getCameraFlipElapsedMs();
                sb2.append(cameraFlipElapsedMs);
                FileLog.d(sb2.toString());
                s60Var.s();
                return;
            case 11:
                lh.c cVar = (lh.c) this.b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 12:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (h6) this.b, Boolean.TRUE, null, -1);
                return;
            case 13:
                n2.d dVar = (n2.d) this.b;
                if (dVar.c) {
                    return;
                }
                n2.g gVar = dVar.b;
                if (gVar != null) {
                    gVar.a(dVar.a);
                }
                dVar.d.x.remove(dVar);
                dVar.c = true;
                return;
            case 14:
                ((n2.b) this.b).a(null);
                return;
            case 15:
                fg1 fg1Var = (fg1) this.b;
                if (fg1Var.getParentLayout() != null) {
                    fg1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", fg1Var.a);
                    zn znVar = new zn(bundle);
                    znVar.ja = true;
                    fg1Var.presentFragment(znVar);
                    return;
                }
                return;
            case 16:
                ((k2.g0) this.b).M0();
                return;
            case 17:
                oi.d dVar2 = (oi.d) this.b;
                AndroidUtilities.runOnUIThread(new oi.c(dVar2.a, dVar2.b, i10), 500L);
                return;
            case 18:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                return;
            case 19:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.b;
                m0Var.P0 = null;
                m0Var.setVisibleParticipant(true);
                return;
            case 20:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) this.b;
                j1Var.K = false;
                j1Var.o(false);
                j1Var.W = false;
                return;
            case 21:
                org.telegram.ui.Components.voip.j1 j1Var2 = (org.telegram.ui.Components.voip.j1) ((lg.b) this.b).b;
                j1Var2.e.invalidate();
                if (j1Var2.e.isInLayout()) {
                    return;
                }
                j1Var2.e.requestLayout();
                j1Var2.d.requestLayout();
                j1Var2.f.requestLayout();
                return;
            case 22:
                ((org.telegram.ui.Components.voip.i1) this.b).a.i(false);
                return;
            case 23:
                h2 h2Var = (h2) this.b;
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
                    h2Var.addView((View) arrayList2.get(i13), x5.t(-2, -2, 1, 4, 0, 0, 4));
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
                AndroidUtilities.runOnUIThread(new h0(h2Var, 23), 700L);
                Runnable runnable = h2Var.h;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 24:
                TextView[] textViewArr = ((p2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 25:
                TextView[] textViewArr2 = ((p2) ((gg.j0) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 26:
                t2 t2Var = (t2) this.b;
                if (t2Var.getVisibility() == 0) {
                    t2Var.a();
                    return;
                }
                return;
            case 27:
                x2 x2Var = (x2) this.b;
                x2Var.e = Bitmap.createBitmap(x2Var.getMeasuredWidth(), x2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(x2Var.e).drawText(x2Var.d, x2Var.getMeasuredWidth() / 2, (int) ((x2Var.getMeasuredHeight() / 2) - ((x2Var.a.ascent() + x2Var.a.descent()) / 2.0f)), x2Var.a);
                x2Var.postInvalidate();
                return;
            case 28:
                ((org.telegram.ui.web.k) this.b).w.W2.N(true);
                return;
            default:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.n) this.b).h.e;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ h0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
