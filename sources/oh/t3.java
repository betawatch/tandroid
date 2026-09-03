package oh;

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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = false;
        switch (this.a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                int i10 = ProfileStoriesView.p0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                break;
            case 2:
                e5.a(((a5) this.b).d);
                break;
            case 3:
                r5 r5Var = (r5) this.b;
                if (r5Var.isShowing()) {
                    r5Var.q(true);
                    break;
                }
                break;
            case 4:
                ((qh.o7) this.b).run();
                break;
            case 5:
                qh.t0 t0Var = (qh.t0) this.b;
                t0Var.b(t0Var.b);
                t0Var.c = false;
                break;
            case 6:
                x6 x6Var = (x6) this.b;
                x6Var.c();
                x6Var.a(true);
                break;
            case 7:
                ((w5) this.b).accept(null);
                break;
            case 8:
                ((h7) this.b).onDetachedFromWindow();
                break;
            case 9:
                q7 q7Var = (q7) this.b;
                ArrayList arrayList = q7Var.c;
                if (arrayList != null) {
                    q7Var.a.w1 = arrayList;
                }
                f4 f4Var = q7Var.a;
                long j10 = q7Var.b;
                if (f4Var.y1 != j10 || f4Var.w1 != null) {
                    f4Var.y1 = j10;
                    f4Var.j1();
                    f4Var.i1();
                    f4Var.f1(true);
                    TL_stories.PeerStories peerStories = f4Var.G0.N0;
                    if (peerStories != null) {
                        f4Var.P1.S(peerStories, true);
                        break;
                    } else {
                        t6 t6Var = f4Var.P1;
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
            case 10:
                ((d90) this.b).d(true);
                break;
            case 11:
                ((d8) this.b).requestLayout();
                break;
            case 12:
                m8 m8Var = (m8) this.b;
                qh.e3 e3Var = m8Var.c;
                if (e3Var != null) {
                    e3Var.e(true);
                    m8Var.c = null;
                }
                m8Var.b(false);
                break;
            case 13:
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
            case 14:
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
            case 15:
                ((w8) this.b).F0.K(true);
                break;
            case 16:
                ((r9) this.b).c();
                break;
            case 17:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                break;
            case 18:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                l0Var.M0 = null;
                l0Var.setVisibleParticipant(true);
                break;
            case 19:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                h1Var.H = false;
                h1Var.o(false);
                h1Var.T = false;
                break;
            case 20:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) ((jg0) this.b).b;
                h1Var2.e.invalidate();
                if (!h1Var2.e.isInLayout()) {
                    h1Var2.e.requestLayout();
                    h1Var2.d.requestLayout();
                    h1Var2.f.requestLayout();
                    break;
                }
                break;
            case 21:
                ((org.telegram.ui.Components.voip.g1) this.b).a.i(false);
                break;
            case 22:
                org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) this.b;
                i2Var.e = false;
                HashMap hashMap = i2Var.a;
                ArrayList arrayList2 = i2Var.c;
                ArrayList arrayList3 = i2Var.b;
                if (!arrayList3.isEmpty() || !arrayList2.isEmpty()) {
                    if (i2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(i2Var, i2Var.d);
                    }
                    int i11 = 0;
                    while (i11 < arrayList3.size()) {
                        org.telegram.ui.Components.voip.h2 h2Var = (org.telegram.ui.Components.voip.h2) arrayList3.get(i11);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            }
                            if (h2Var.a.equals(((org.telegram.ui.Components.voip.h2) arrayList2.get(i12)).a)) {
                                arrayList3.remove(i11);
                                arrayList2.remove(i12);
                                i11--;
                            } else {
                                i12++;
                            }
                        }
                        i11++;
                    }
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        i2Var.addView((View) arrayList3.get(i13), k7.c6.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                        i2Var.removeView((View) arrayList2.get(i14));
                    }
                    hashMap.clear();
                    for (int i15 = 0; i15 < i2Var.getChildCount(); i15++) {
                        org.telegram.ui.Components.voip.h2 h2Var2 = (org.telegram.ui.Components.voip.h2) i2Var.getChildAt(i15);
                        hashMap.put(h2Var2.a, h2Var2);
                    }
                    arrayList3.clear();
                    arrayList2.clear();
                    i2Var.e = true;
                    AndroidUtilities.runOnUIThread(new t3(i2Var, 22), 700L);
                    Runnable runnable = i2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 23:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.q2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 24:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.q2) ((xs) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 25:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.b;
                if (u2Var.getVisibility() == 0) {
                    u2Var.a();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.voip.y2 y2Var = (org.telegram.ui.Components.voip.y2) this.b;
                y2Var.e = Bitmap.createBitmap(y2Var.getMeasuredWidth(), y2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(y2Var.e).drawText(y2Var.d, y2Var.getMeasuredWidth() / 2, (int) ((y2Var.getMeasuredHeight() / 2) - ((y2Var.a.ascent() + y2Var.a.descent()) / 2.0f)), y2Var.a);
                y2Var.postInvalidate();
                break;
            case 27:
                ((org.telegram.ui.web.k) this.b).w.V2.N(true);
                break;
            case 28:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.o) this.b).h.e;
                if (iVar != null) {
                    iVar.d();
                    break;
                }
                break;
            default:
                ((xt) this.b).requestFocus();
                break;
        }
    }
}
