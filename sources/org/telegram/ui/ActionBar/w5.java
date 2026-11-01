package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a30;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.x7;
import org.telegram.ui.eo0;
import org.telegram.ui.web.HttpGetFileTask;
import rh.s8;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((CountDownLatch) this.b).countDown();
                break;
            case 1:
                a30.k(1, (k2) this.b);
                break;
            case 2:
                x7 x7Var = (x7) t6.e5.remove((kj) this.b);
                if (x7Var != null) {
                    x7Var.i = null;
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.voip.x xVar = (org.telegram.ui.Components.voip.x) this.b;
                xVar.P0 = null;
                xVar.setVisibleParticipant(true);
                break;
            case 4:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.b;
                t0Var.K = false;
                t0Var.j(false);
                t0Var.W = false;
                break;
            case 5:
                org.telegram.ui.Components.voip.t0 t0Var2 = (org.telegram.ui.Components.voip.t0) ((eg.b) this.b).b;
                t0Var2.e.invalidate();
                if (!t0Var2.e.isInLayout()) {
                    t0Var2.e.requestLayout();
                    t0Var2.d.requestLayout();
                    t0Var2.f.requestLayout();
                    break;
                }
                break;
            case 6:
                ((org.telegram.ui.Components.voip.s0) this.b).a.a(false);
                break;
            case 7:
                org.telegram.ui.Components.voip.p1 p1Var = (org.telegram.ui.Components.voip.p1) this.b;
                p1Var.e = false;
                HashMap hashMap = p1Var.a;
                ArrayList arrayList = p1Var.c;
                ArrayList arrayList2 = p1Var.b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (p1Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(p1Var, p1Var.d);
                    }
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) arrayList2.get(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                break;
                            }
                            if (o1Var.a.equals(((org.telegram.ui.Components.voip.o1) arrayList.get(i11)).a)) {
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
                        p1Var.addView((View) arrayList2.get(i12), w7.b6.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        p1Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < p1Var.getChildCount(); i14++) {
                        org.telegram.ui.Components.voip.o1 o1Var2 = (org.telegram.ui.Components.voip.o1) p1Var.getChildAt(i14);
                        hashMap.put(o1Var2.a, o1Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    p1Var.e = true;
                    org.telegram.messenger.i0.h3(new w5(p1Var, 7), 700L);
                    Runnable runnable = p1Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 8:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.w1) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 9:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.w1) ((ci.i) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 10:
                org.telegram.ui.Components.voip.a2 a2Var = (org.telegram.ui.Components.voip.a2) this.b;
                if (a2Var.getVisibility() == 0) {
                    a2Var.a();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) this.b;
                e2Var.e = Bitmap.createBitmap(e2Var.getMeasuredWidth(), e2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(e2Var.e).drawText(e2Var.d, e2Var.getMeasuredWidth() / 2, (int) ((e2Var.getMeasuredHeight() / 2) - ((e2Var.a.ascent() + e2Var.a.descent()) / 2.0f)), e2Var.a);
                e2Var.postInvalidate();
                break;
            case 12:
                ((org.telegram.ui.web.j) this.b).x.f3.O(true);
                break;
            case 13:
                org.telegram.ui.web.h hVar = ((org.telegram.ui.web.m) ((eo0) this.b).c).f;
                if (hVar != null) {
                    hVar.d();
                    break;
                }
                break;
            case 14:
                ((mt) this.b).requestFocus();
                break;
            case 15:
                gf.f.r(((org.telegram.ui.web.r0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 16:
                eo0 eo0Var = (eo0) this.b;
                Utilities.g.c(new v41(eo0Var, new ArrayList(((org.telegram.ui.web.b1) eo0Var.c).f), ((org.telegram.ui.web.b1) eo0Var.c).r, 8));
                break;
            case 17:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                break;
            case 18:
                ((org.telegram.ui.Wallet.a6) this.b).invalidateSelf();
                break;
            case 19:
                org.telegram.ui.web.p1 p1Var2 = (org.telegram.ui.web.p1) this.b;
                File databasePath = org.telegram.messenger.w0.b.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = org.telegram.messenger.w0.b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += org.telegram.ui.web.p1.e0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += org.telegram.ui.web.p1.e0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.w0.b.getApplicationInfo().dataDir, "app_webview");
                org.telegram.messenger.i0.g3(new ki.d(p1Var2, length, file3.exists() ? org.telegram.ui.web.p1.e0(file3, Boolean.TRUE) : 0L, 4));
                break;
            case 20:
                ((boolean[]) this.b)[0] = true;
                break;
            case 21:
                ((p4.e) this.b).k();
                break;
            case 22:
                ((p4.g) this.b).n = -1;
                break;
            case 23:
                ((wj0) this.b).b();
                break;
            case 24:
                ph.m mVar = (ph.m) this.b;
                mVar.Z1.setTranslationX(mVar.Y1.getAnimatedWidth() + org.telegram.messenger.i0.L(28.0f));
                break;
            case 25:
                ((ph.d0) this.b).onBackPressed();
                break;
            case 26:
                q51 q51Var = ((ph.l1) this.b).Q1;
                if (q51Var != null) {
                    q51Var.O(false);
                    break;
                }
                break;
            case 27:
                ((ph.z0) this.b).c();
                break;
            case 28:
                ((ph.f1) this.b).invalidateSelf();
                break;
            default:
                ph.i1 i1Var = (ph.i1) this.b;
                s8 s8Var = i1Var.e;
                if (s8Var != null) {
                    s8Var.d();
                    i1Var.invalidateSelf();
                    break;
                }
                break;
        }
    }
}
