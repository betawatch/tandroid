package k2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import li.f2;
import li.y1;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.x6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.Components.voip.h2;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.voip.i2;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.web.e1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 4;
        switch (this.a) {
            case 0:
                ((f) this.b).c();
                break;
            case 1:
                e2.r rVar = (e2.r) this.b;
                rVar.getClass();
                if (Thread.currentThread() == rVar.a) {
                    rVar.e(-1, new jh.l(i10));
                    break;
                }
                break;
            case 2:
                u0 u0Var = (u0) this.b;
                if (u0Var.a0 >= 300000) {
                    u0Var.n.i();
                    u0Var.a0 = 0L;
                    break;
                }
                break;
            case 3:
                e3 e3Var = ((g3) this.b).d;
                e3Var.requestFocus();
                AndroidUtilities.showKeyboard(e3Var);
                break;
            case 4:
                AndroidUtilities.showKeyboard(((li.w) this.b).e0.d);
                break;
            case 5:
                ((li.c0) this.b).invalidate();
                break;
            case 6:
                r3 r3Var = (r3) this.b;
                r3Var.c = null;
                r3Var.d = null;
                r3Var.e = null;
                r3Var.f = null;
                r3Var.e(null);
                break;
            case 7:
                ((y1) this.b).invalidateSelf();
                break;
            case 8:
                ((f2) this.b).c();
                break;
            case 9:
                ((mh.b) this.b).invalidate();
                break;
            case 10:
                n2.d dVar = (n2.d) this.b;
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
            case 11:
                ((n2.b) this.b).a(null);
                break;
            case 12:
                nh.c cVar = (nh.c) this.b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.b.a(cVar.H.isSendError(), true);
                    break;
                }
                break;
            case 13:
                ((jg.i) this.b).f0();
                break;
            case 14:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (x6) this.b, Boolean.TRUE, null, -1);
                break;
            case 15:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                break;
            case 16:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                l0Var.P0 = null;
                l0Var.setVisibleParticipant(true);
                break;
            case 17:
                i1 i1Var = (i1) this.b;
                i1Var.K = false;
                i1Var.o(false);
                i1Var.W = false;
                break;
            case 18:
                i1 i1Var2 = (i1) ((ng.b) this.b).b;
                i1Var2.e.invalidate();
                if (!i1Var2.e.isInLayout()) {
                    i1Var2.e.requestLayout();
                    i1Var2.d.requestLayout();
                    i1Var2.f.requestLayout();
                    break;
                }
                break;
            case 19:
                ((h1) this.b).a.i(false);
                break;
            case 20:
                i2 i2Var = (i2) this.b;
                i2Var.e = false;
                HashMap hashMap = i2Var.a;
                ArrayList arrayList = i2Var.c;
                ArrayList arrayList2 = i2Var.b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (i2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(i2Var, i2Var.d);
                    }
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        h2 h2Var = (h2) arrayList2.get(i11);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList.size()) {
                                break;
                            }
                            if (h2Var.a.equals(((h2) arrayList.get(i12)).a)) {
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
                        i2Var.addView((View) arrayList2.get(i13), gb1.x(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        i2Var.removeView((View) arrayList.get(i14));
                    }
                    hashMap.clear();
                    for (int i15 = 0; i15 < i2Var.getChildCount(); i15++) {
                        h2 h2Var2 = (h2) i2Var.getChildAt(i15);
                        hashMap.put(h2Var2.a, h2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    i2Var.e = true;
                    AndroidUtilities.runOnUIThread(new c(i2Var, 20), 700L);
                    Runnable runnable = i2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 21:
                TextView[] textViewArr = ((q2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 22:
                TextView[] textViewArr2 = ((q2) ((ig.k0) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 23:
                u2 u2Var = (u2) this.b;
                if (u2Var.getVisibility() == 0) {
                    u2Var.a();
                    break;
                }
                break;
            case 24:
                y2 y2Var = (y2) this.b;
                y2Var.e = Bitmap.createBitmap(y2Var.getMeasuredWidth(), y2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(y2Var.e).drawText(y2Var.d, y2Var.getMeasuredWidth() / 2, (int) ((y2Var.getMeasuredHeight() / 2) - ((y2Var.a.ascent() + y2Var.a.descent()) / 2.0f)), y2Var.a);
                y2Var.postInvalidate();
                break;
            case 25:
                ((org.telegram.ui.web.l) this.b).w.g3.O(true);
                break;
            case 26:
                org.telegram.ui.web.j jVar = ((org.telegram.ui.web.o) this.b).b.f;
                if (jVar != null) {
                    jVar.d();
                    break;
                }
                break;
            case 27:
                ((ju) this.b).requestFocus();
                break;
            case 28:
                qf.d.r(((org.telegram.ui.web.t0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            default:
                e1 e1Var = (e1) this.b;
                Utilities.searchQueue.postRunnable(new ny0(e1Var, new ArrayList(e1Var.b.f), e1Var.b.r));
                break;
        }
    }
}
