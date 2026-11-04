package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import b8.mf;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.messenger.ok;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.xs;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d4(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i4 i4Var = ((e4) this.b).b;
                i4Var.c.dismiss();
                i4Var.f.removeAllViews();
                break;
            case 1:
                ((e4) this.b).b.c.dismiss();
                break;
            case 2:
                i5 i5Var = (i5) this.b;
                if (!i5Var.y && i5Var.N) {
                    i5Var.c();
                    break;
                }
                break;
            case 3:
                Drawable drawable = (Drawable) this.b;
                k6.d = null;
                k6.P();
                if (!k6.b) {
                    k6.j(drawable);
                    k6.h(drawable);
                }
                hs.e().k(hs.z4, new Object[0]);
                break;
            case 4:
                ((CountDownLatch) this.b).countDown();
                break;
            case 5:
                org.telegram.messenger.camera.q.j(1, (d2) this.b);
                break;
            case 6:
                a8 a8Var = (a8) k6.e5.remove((zi) this.b);
                if (a8Var != null) {
                    a8Var.i = null;
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.voip.x xVar = (org.telegram.ui.Components.voip.x) this.b;
                xVar.Q0 = null;
                xVar.setVisibleParticipant(true);
                break;
            case 8:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.b;
                s0Var.L = false;
                s0Var.j(false);
                s0Var.X = false;
                break;
            case 9:
                org.telegram.ui.Components.voip.s0 s0Var2 = (org.telegram.ui.Components.voip.s0) ((ee0) this.b).b;
                s0Var2.e.invalidate();
                if (!s0Var2.e.isInLayout()) {
                    s0Var2.e.requestLayout();
                    s0Var2.d.requestLayout();
                    s0Var2.f.requestLayout();
                    break;
                }
                break;
            case 10:
                ((org.telegram.ui.Components.voip.q0) this.b).a.a(false);
                break;
            case 11:
                org.telegram.ui.Components.voip.p1 p1Var = (org.telegram.ui.Components.voip.p1) this.b;
                p1Var.e = false;
                HashMap hashMap = p1Var.a;
                ArrayList arrayList = p1Var.c;
                ArrayList arrayList2 = p1Var.b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (p1Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(p1Var, p1Var.d);
                    }
                    int i3 = 0;
                    while (i3 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) arrayList2.get(i3);
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            if (o1Var.a.equals(((org.telegram.ui.Components.voip.o1) arrayList.get(i10)).a)) {
                                arrayList2.remove(i3);
                                arrayList.remove(i10);
                                i3--;
                            } else {
                                i10++;
                            }
                        }
                        i3++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        p1Var.addView((View) arrayList2.get(i11), mf.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        p1Var.removeView((View) arrayList.get(i12));
                    }
                    hashMap.clear();
                    for (int i13 = 0; i13 < p1Var.getChildCount(); i13++) {
                        org.telegram.ui.Components.voip.o1 o1Var2 = (org.telegram.ui.Components.voip.o1) p1Var.getChildAt(i13);
                        hashMap.put(o1Var2.a, o1Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    p1Var.e = true;
                    org.telegram.messenger.g0.i3(new d4(p1Var, 11), 700L);
                    Runnable runnable = p1Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 12:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.w1) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 13:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.w1) ((kg.g0) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 14:
                org.telegram.ui.Components.voip.a2 a2Var = (org.telegram.ui.Components.voip.a2) this.b;
                if (a2Var.getVisibility() == 0) {
                    a2Var.a();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) this.b;
                e2Var.e = Bitmap.createBitmap(e2Var.getMeasuredWidth(), e2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(e2Var.e).drawText(e2Var.d, e2Var.getMeasuredWidth() / 2, (int) ((e2Var.getMeasuredHeight() / 2) - ((e2Var.a.ascent() + e2Var.a.descent()) / 2.0f)), e2Var.a);
                e2Var.postInvalidate();
                break;
            case 16:
                ((org.telegram.ui.web.l) this.b).x.g3.O(true);
                break;
            case 17:
                org.telegram.ui.web.j jVar = ((org.telegram.ui.web.n) ((gi.s2) this.b).c).f;
                if (jVar != null) {
                    jVar.d();
                    break;
                }
                break;
            case 18:
                ((xs) this.b).requestFocus();
                break;
            case 19:
                sf.c.t(((org.telegram.ui.web.p0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 20:
                gi.s2 s2Var = (gi.s2) this.b;
                Utilities.g.c(new iv0(s2Var, new ArrayList(((org.telegram.ui.web.y0) s2Var.c).f), ((org.telegram.ui.web.y0) s2Var.c).r, 12));
                break;
            case 21:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                break;
            case 22:
                ((org.telegram.ui.Wallet.v5) this.b).invalidateSelf();
                break;
            case 23:
                org.telegram.ui.web.m1 m1Var = (org.telegram.ui.web.m1) this.b;
                File databasePath = org.telegram.messenger.t0.b.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = org.telegram.messenger.t0.b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += org.telegram.ui.web.m1.e0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += org.telegram.ui.web.m1.e0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                org.telegram.messenger.g0.h3(new ok(m1Var, length, file3.exists() ? org.telegram.ui.web.m1.e0(file3, Boolean.TRUE) : 0L, 2));
                break;
            case 24:
                ((boolean[]) this.b)[0] = true;
                break;
            case 25:
                p2.d dVar = (p2.d) this.b;
                if (!dVar.c) {
                    p2.g gVar = dVar.b;
                    if (gVar != null) {
                        gVar.b(dVar.a);
                    }
                    dVar.d.y.remove(dVar);
                    dVar.c = true;
                    break;
                }
                break;
            case 26:
                ((p2.b) this.b).b(null);
                break;
            case 27:
                ((nh) this.b).B();
                break;
            case 28:
                ((r4.e) this.b).k();
                break;
            default:
                ((r4.g) this.b).n = -1;
                break;
        }
    }
}
