package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import ii.b2;
import ii.i2;
import java.util.ArrayList;
import java.util.HashMap;
import m.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.voip.h2;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.il;
import org.telegram.ui.wf1;
import org.telegram.ui.yn;
import w7.z5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        switch (this.a) {
            case 0:
                try {
                    p0.h((k1) this.b);
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
                p3 p3Var = (p3) this.b;
                p3Var.c = null;
                p3Var.d = null;
                p3Var.e = null;
                p3Var.f = null;
                p3Var.c(null);
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
                fVar.q(l4, 1028, new j2.c(l4, 5));
                fVar.f.d();
                return;
            case 8:
                k2.f0 f0Var = (k2.f0) this.b;
                if (f0Var.k0 >= 300000) {
                    f0Var.t.m();
                    f0Var.k0 = 0L;
                    return;
                }
                return;
            case 9:
                ((kh.b) this.b).invalidate();
                return;
            case 10:
                e60 e60Var = (e60) ((l2.g) this.b).b;
                il ilVar = e60Var.E;
                if (e60Var.l0) {
                    e60Var.l0 = false;
                    ilVar.animate().cancel();
                    ilVar.animate().alpha(0.0f).setDuration(100L).setInterpolator(new DecelerateInterpolator()).start();
                    return;
                }
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
                n2.e eVar = (n2.e) this.b;
                if (eVar.c) {
                    return;
                }
                n2.h hVar = eVar.b;
                if (hVar != null) {
                    hVar.a(eVar.a);
                }
                eVar.d.x.remove(eVar);
                eVar.c = true;
                return;
            case 14:
                ((n2.b) this.b).a(null);
                return;
            case 15:
                wf1 wf1Var = (wf1) this.b;
                if (wf1Var.getParentLayout() != null) {
                    wf1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", wf1Var.a);
                    yn ynVar = new yn(bundle);
                    ynVar.ha = true;
                    wf1Var.presentFragment(ynVar);
                    return;
                }
                return;
            case 16:
                ((l2.g) this.b).a0();
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
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) this.b;
                k1Var.K = false;
                k1Var.o(false);
                k1Var.W = false;
                return;
            case 20:
                org.telegram.ui.Components.voip.k1 k1Var2 = (org.telegram.ui.Components.voip.k1) ((lg.b) this.b).b;
                k1Var2.e.invalidate();
                if (k1Var2.e.isInLayout()) {
                    return;
                }
                k1Var2.e.requestLayout();
                k1Var2.d.requestLayout();
                k1Var2.f.requestLayout();
                return;
            case 21:
                ((org.telegram.ui.Components.voip.j1) this.b).a.i(false);
                return;
            case 22:
                org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) this.b;
                i2Var.e = false;
                HashMap hashMap = i2Var.a;
                ArrayList arrayList = i2Var.c;
                ArrayList arrayList2 = i2Var.b;
                if (arrayList2.isEmpty() && arrayList.isEmpty()) {
                    return;
                }
                if (i2Var.getParent() != null) {
                    TransitionManager.beginDelayedTransition(i2Var, i2Var.d);
                }
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    h2 h2Var = (h2) arrayList2.get(i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        if (h2Var.a.equals(((h2) arrayList.get(i11)).a)) {
                            arrayList2.remove(i10);
                            arrayList.remove(i11);
                            i10--;
                        } else {
                            i11++;
                        }
                    }
                    i10++;
                }
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    i2Var.addView((View) arrayList2.get(i12), z5.t(-2, -2, 1, 4, 0, 0, 4));
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    i2Var.removeView((View) arrayList.get(i13));
                }
                hashMap.clear();
                for (int i14 = 0; i14 < i2Var.getChildCount(); i14++) {
                    h2 h2Var2 = (h2) i2Var.getChildAt(i14);
                    hashMap.put(h2Var2.a, h2Var2);
                }
                arrayList2.clear();
                arrayList.clear();
                i2Var.e = true;
                AndroidUtilities.runOnUIThread(new h0(i2Var, 22), 700L);
                Runnable runnable = i2Var.h;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 23:
                TextView[] textViewArr = ((q2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 24:
                TextView[] textViewArr2 = ((q2) ((gg.k0) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 25:
                u2 u2Var = (u2) this.b;
                if (u2Var.getVisibility() == 0) {
                    u2Var.a();
                    return;
                }
                return;
            case 26:
                y2 y2Var = (y2) this.b;
                y2Var.e = Bitmap.createBitmap(y2Var.getMeasuredWidth(), y2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(y2Var.e).drawText(y2Var.d, y2Var.getMeasuredWidth() / 2, (int) ((y2Var.getMeasuredHeight() / 2) - ((y2Var.a.ascent() + y2Var.a.descent()) / 2.0f)), y2Var.a);
                y2Var.postInvalidate();
                return;
            case 27:
                ((org.telegram.ui.web.k) this.b).w.f3.N(true);
                return;
            case 28:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.n) this.b).h.f;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            default:
                ((eu) this.b).requestFocus();
                return;
        }
    }

    public /* synthetic */ h0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
