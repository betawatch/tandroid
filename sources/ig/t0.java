package ig;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import bi.r3;
import java.util.ArrayList;
import java.util.HashMap;
import ji.g2;
import m.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.Components.voip.v2;
import org.telegram.ui.co;
import org.telegram.ui.eg1;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) ((a6.m) this.b).b;
                u0Var.c.Y2.N(true);
                u0Var.b0();
                break;
            case 1:
                w0 w0Var = (w0) this.b;
                w0Var.c.Y2.N(true);
                w0Var.V(true);
                break;
            case 2:
                g1 g1Var = (g1) this.b;
                g1Var.a.Y2.N(true);
                g1Var.Y(true);
                break;
            case 3:
                ((r3) this.b).run(Boolean.FALSE);
                break;
            case 4:
                NotificationCenter.getInstance(((b2) this.b).a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 5:
                j2.f fVar = (j2.f) this.b;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4, 3));
                fVar.f.d();
                break;
            case 6:
                g3 g3Var = ((i3) this.b).b;
                g3Var.requestFocus();
                AndroidUtilities.showKeyboard(g3Var);
                break;
            case 7:
                AndroidUtilities.showKeyboard(((ji.x) this.b).e0.b);
                break;
            case 8:
                ((ji.d0) this.b).invalidate();
                break;
            case 9:
                p3 p3Var = (p3) this.b;
                p3Var.c = null;
                p3Var.d = null;
                p3Var.e = null;
                p3Var.f = null;
                p3Var.c(null);
                break;
            case 10:
                ((ji.z1) this.b).invalidateSelf();
                break;
            case 11:
                ((g2) this.b).c();
                break;
            case 12:
                k2.d0 d0Var = (k2.d0) this.b;
                if (d0Var.k0 >= 300000) {
                    d0Var.t.d();
                    d0Var.k0 = 0L;
                    break;
                }
                break;
            case 13:
                ((lh.b) this.b).invalidate();
                break;
            case 14:
                mh.c cVar = (mh.c) this.b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.b.a(cVar.H.isSendError(), true);
                    break;
                }
                break;
            case 15:
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
            case 16:
                ((n2.b) this.b).a(null);
                break;
            case 17:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (i6) this.b, Boolean.TRUE, null, -1);
                break;
            case 18:
                ((mg.n) this.b).e();
                break;
            case 19:
                eg1 eg1Var = (eg1) this.b;
                if (eg1Var.getParentLayout() != null) {
                    eg1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", eg1Var.a);
                    co coVar = new co(bundle);
                    coVar.ja = true;
                    eg1Var.presentFragment(coVar);
                    break;
                }
                break;
            case 20:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                break;
            case 21:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                l0Var.P0 = null;
                l0Var.setVisibleParticipant(true);
                break;
            case 22:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                h1Var.K = false;
                h1Var.o(false);
                h1Var.W = false;
                break;
            case 23:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) ((mg.b) this.b).b;
                h1Var2.e.invalidate();
                if (!h1Var2.e.isInLayout()) {
                    h1Var2.e.requestLayout();
                    h1Var2.d.requestLayout();
                    h1Var2.f.requestLayout();
                    break;
                }
                break;
            case 24:
                ((org.telegram.ui.Components.voip.g1) this.b).a.i(false);
                break;
            case 25:
                org.telegram.ui.Components.voip.f2 f2Var = (org.telegram.ui.Components.voip.f2) this.b;
                f2Var.e = false;
                HashMap hashMap = f2Var.a;
                ArrayList arrayList = f2Var.c;
                ArrayList arrayList2 = f2Var.b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (f2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(f2Var, f2Var.d);
                    }
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) arrayList2.get(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                break;
                            }
                            if (e2Var.a.equals(((org.telegram.ui.Components.voip.e2) arrayList.get(i11)).a)) {
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
                        f2Var.addView((View) arrayList2.get(i12), x5.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        f2Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < f2Var.getChildCount(); i14++) {
                        org.telegram.ui.Components.voip.e2 e2Var2 = (org.telegram.ui.Components.voip.e2) f2Var.getChildAt(i14);
                        hashMap.put(e2Var2.a, e2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    f2Var.e = true;
                    AndroidUtilities.runOnUIThread(new t0(f2Var, 25), 700L);
                    Runnable runnable = f2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 26:
                TextView[] textViewArr = ((n2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 27:
                TextView[] textViewArr2 = ((n2) ((hg.k0) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 28:
                r2 r2Var = (r2) this.b;
                if (r2Var.getVisibility() == 0) {
                    r2Var.a();
                    break;
                }
                break;
            default:
                v2 v2Var = (v2) this.b;
                v2Var.e = Bitmap.createBitmap(v2Var.getMeasuredWidth(), v2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(v2Var.e).drawText(v2Var.d, v2Var.getMeasuredWidth() / 2, (int) ((v2Var.getMeasuredHeight() / 2) - ((v2Var.a.ascent() + v2Var.a.descent()) / 2.0f)), v2Var.a);
                v2Var.postInvalidate();
                break;
        }
    }
}
