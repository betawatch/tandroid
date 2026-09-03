package nh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.us;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = false;
        switch (this.a) {
            case 0:
                r5 r5Var = (r5) this.b;
                if (r5Var.isShowing()) {
                    r5Var.q(true);
                    break;
                }
                break;
            case 1:
                ((ph.q7) this.b).run();
                break;
            case 2:
                ph.t0 t0Var = (ph.t0) this.b;
                t0Var.b(t0Var.b);
                t0Var.c = false;
                break;
            case 3:
                x6 x6Var = (x6) this.b;
                x6Var.c();
                x6Var.a(true);
                break;
            case 4:
                ((w5) this.b).accept(null);
                break;
            case 5:
                ((h7) this.b).onDetachedFromWindow();
                break;
            case 6:
                q7 q7Var = (q7) this.b;
                ArrayList arrayList = q7Var.c;
                if (arrayList != null) {
                    q7Var.a.w1 = arrayList;
                }
                d4 d4Var = q7Var.a;
                long j10 = q7Var.b;
                if (d4Var.y1 != j10 || d4Var.w1 != null) {
                    d4Var.y1 = j10;
                    d4Var.j1();
                    d4Var.i1();
                    d4Var.f1(true);
                    TL_stories.PeerStories peerStories = d4Var.G0.N0;
                    if (peerStories != null) {
                        d4Var.P1.S(peerStories, true);
                        break;
                    } else {
                        t6 t6Var = d4Var.P1;
                        TL_stories.PeerStories y10 = t6Var.y(j10);
                        if (y10 == null) {
                            y10 = t6Var.z(j10);
                            z4 = true;
                        }
                        t6Var.S(y10, z4);
                        break;
                    }
                }
                break;
            case 7:
                ((c90) this.b).d(true);
                break;
            case 8:
                ((d8) this.b).requestLayout();
                break;
            case 9:
                m8 m8Var = (m8) this.b;
                ph.f3 f3Var = m8Var.c;
                if (f3Var != null) {
                    f3Var.e(true);
                    m8Var.c = null;
                }
                m8Var.b(false);
                break;
            case 10:
                k8 k8Var = (k8) this.b;
                if (k8Var.v) {
                    k8Var.B = true;
                    k8Var.C = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    k8Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.invalidate();
                    break;
                }
                break;
            case 11:
                i9 i9Var = ((r8) this.b).b;
                try {
                    w8 w8Var = i9Var.s;
                    if (w8Var == null) {
                        break;
                    } else {
                        if (i9Var.b) {
                            AndroidUtilities.removeFromParent(w8Var);
                        } else {
                            i9Var.n.removeView(w8Var);
                        }
                        i9Var.s = null;
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 12:
                ((w8) this.b).F0.K(true);
                break;
            case 13:
                ((r9) this.b).c();
                break;
            case 14:
                o3.e eVar = (o3.e) this.b;
                if (!eVar.c) {
                    o3.j jVar = eVar.b;
                    if (jVar != null) {
                        jVar.c(eVar.a);
                    }
                    eVar.d.x.remove(eVar);
                    eVar.c = true;
                    break;
                }
                break;
            case 15:
                ((o3.b) this.b).c(null);
                break;
            case 16:
                ((li) this.b).hide();
                break;
            case 17:
                oh.r rVar = (oh.r) this.b;
                nr0 nr0Var = rVar.T;
                d6 d6Var = rVar.a;
                nr0Var.a(d6Var == null ? "" : d6Var.E);
                break;
            case 18:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                break;
            case 19:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.b;
                k0Var.M0 = null;
                k0Var.setVisibleParticipant(true);
                break;
            case 20:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                g1Var.H = false;
                g1Var.o(false);
                g1Var.T = false;
                break;
            case 21:
                org.telegram.ui.Components.voip.g1 g1Var2 = (org.telegram.ui.Components.voip.g1) ((ig0) this.b).b;
                g1Var2.e.invalidate();
                if (!g1Var2.e.isInLayout()) {
                    g1Var2.e.requestLayout();
                    g1Var2.d.requestLayout();
                    g1Var2.f.requestLayout();
                    break;
                }
                break;
            case 22:
                ((org.telegram.ui.Components.voip.f1) this.b).a.i(false);
                break;
            case 23:
                org.telegram.ui.Components.voip.h2 h2Var = (org.telegram.ui.Components.voip.h2) this.b;
                h2Var.e = false;
                HashMap hashMap = h2Var.a;
                ArrayList arrayList2 = h2Var.c;
                ArrayList arrayList3 = h2Var.b;
                if (!arrayList3.isEmpty() || !arrayList2.isEmpty()) {
                    if (h2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(h2Var, h2Var.d);
                    }
                    int i10 = 0;
                    while (i10 < arrayList3.size()) {
                        org.telegram.ui.Components.voip.g2 g2Var = (org.telegram.ui.Components.voip.g2) arrayList3.get(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList2.size()) {
                                break;
                            }
                            if (g2Var.a.equals(((org.telegram.ui.Components.voip.g2) arrayList2.get(i11)).a)) {
                                arrayList3.remove(i10);
                                arrayList2.remove(i11);
                                i10--;
                            } else {
                                i11++;
                            }
                        }
                        i10++;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        h2Var.addView((View) arrayList3.get(i12), k7.b6.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        h2Var.removeView((View) arrayList2.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < h2Var.getChildCount(); i14++) {
                        org.telegram.ui.Components.voip.g2 g2Var2 = (org.telegram.ui.Components.voip.g2) h2Var.getChildAt(i14);
                        hashMap.put(g2Var2.a, g2Var2);
                    }
                    arrayList3.clear();
                    arrayList2.clear();
                    h2Var.e = true;
                    AndroidUtilities.runOnUIThread(new n5(h2Var, 23), 700L);
                    Runnable runnable = h2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 24:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.p2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 25:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.p2) ((us) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 26:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.b;
                if (t2Var.getVisibility() == 0) {
                    t2Var.a();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.voip.x2 x2Var = (org.telegram.ui.Components.voip.x2) this.b;
                x2Var.e = Bitmap.createBitmap(x2Var.getMeasuredWidth(), x2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(x2Var.e).drawText(x2Var.d, x2Var.getMeasuredWidth() / 2, (int) ((x2Var.getMeasuredHeight() / 2) - ((x2Var.a.ascent() + x2Var.a.descent()) / 2.0f)), x2Var.a);
                x2Var.postInvalidate();
                break;
            case 28:
                ((org.telegram.ui.web.k) this.b).w.V2.N(true);
                break;
            default:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.o) this.b).h.e;
                if (iVar != null) {
                    iVar.d();
                    break;
                }
                break;
        }
    }
}
