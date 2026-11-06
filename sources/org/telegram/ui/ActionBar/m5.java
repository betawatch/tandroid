package org.telegram.ui.ActionBar;

import a8.wa;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import c8.ha;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.messenger.yk;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.ys;
import org.telegram.ui.an;
import org.telegram.ui.v91;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.b;
                k6.d = null;
                k6.P();
                if (!k6.b) {
                    k6.j(drawable);
                    k6.h(drawable);
                }
                qs.e().k(qs.z4, new Object[0]);
                break;
            case 1:
                ((CountDownLatch) this.b).countDown();
                break;
            case 2:
                org.telegram.messenger.camera.q.j(1, (f2) this.b);
                break;
            case 3:
                c8 c8Var = (c8) k6.e5.remove((ij) this.b);
                if (c8Var != null) {
                    c8Var.i = null;
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.b;
                k0Var.P0 = null;
                k0Var.setVisibleParticipant(true);
                break;
            case 5:
                org.telegram.ui.Components.voip.g1 g1Var = ((org.telegram.ui.Components.voip.d1) this.b).h;
                ti.o oVar = g1Var.a;
                if (oVar != null) {
                    oVar.c();
                }
                org.telegram.ui.Components.voip.f1 f1Var = g1Var.f;
                if (f1Var != null) {
                    f1Var.a();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.voip.a2 a2Var = (org.telegram.ui.Components.voip.a2) this.b;
                a2Var.e = false;
                HashMap hashMap = a2Var.a;
                ArrayList arrayList = a2Var.c;
                ArrayList arrayList2 = a2Var.b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (a2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(a2Var, a2Var.d);
                    }
                    int i7 = 0;
                    while (i7 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.z1 z1Var = (org.telegram.ui.Components.voip.z1) arrayList2.get(i7);
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            if (z1Var.a.equals(((org.telegram.ui.Components.voip.z1) arrayList.get(i10)).a)) {
                                arrayList2.remove(i7);
                                arrayList.remove(i10);
                                i7--;
                            } else {
                                i10++;
                            }
                        }
                        i7++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        a2Var.addView((View) arrayList2.get(i11), ha.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        a2Var.removeView((View) arrayList.get(i12));
                    }
                    hashMap.clear();
                    for (int i13 = 0; i13 < a2Var.getChildCount(); i13++) {
                        org.telegram.ui.Components.voip.z1 z1Var2 = (org.telegram.ui.Components.voip.z1) a2Var.getChildAt(i13);
                        hashMap.put(z1Var2.a, z1Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    a2Var.e = true;
                    org.telegram.messenger.g0.i3(new m5(a2Var, 6), 700L);
                    Runnable runnable = a2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 7:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.h2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 8:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.h2) ((jg.j0) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 9:
                org.telegram.ui.Components.voip.l2 l2Var = (org.telegram.ui.Components.voip.l2) this.b;
                if (l2Var.getVisibility() == 0) {
                    l2Var.a();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.voip.p2 p2Var = (org.telegram.ui.Components.voip.p2) this.b;
                p2Var.e = Bitmap.createBitmap(p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(p2Var.e).drawText(p2Var.d, p2Var.getMeasuredWidth() / 2, (int) ((p2Var.getMeasuredHeight() / 2) - ((p2Var.a.ascent() + p2Var.a.descent()) / 2.0f)), p2Var.a);
                p2Var.postInvalidate();
                break;
            case 11:
                ((org.telegram.ui.web.j) this.b).x.f3.O(true);
                break;
            case 12:
                org.telegram.ui.web.h hVar = ((org.telegram.ui.web.l) ((fi.u2) this.b).c).f;
                if (hVar != null) {
                    hVar.d();
                    break;
                }
                break;
            case 13:
                ((ys) this.b).requestFocus();
                break;
            case 14:
                vf.c.t(((org.telegram.ui.web.q0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 15:
                fi.u2 u2Var = (fi.u2) this.b;
                Utilities.g.c(new r31(u2Var, new ArrayList(((org.telegram.ui.web.z0) u2Var.c).f), ((org.telegram.ui.web.z0) u2Var.c).r, 8));
                break;
            case 16:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                break;
            case 17:
                ((org.telegram.ui.Wallet.x5) this.b).invalidateSelf();
                break;
            case 18:
                org.telegram.ui.web.o1 o1Var = (org.telegram.ui.web.o1) this.b;
                File databasePath = org.telegram.messenger.t0.b.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = org.telegram.messenger.t0.b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += org.telegram.ui.web.o1.e0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += org.telegram.ui.web.o1.e0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                org.telegram.messenger.g0.h3(new yk(o1Var, length, file3.exists() ? org.telegram.ui.web.o1.e0(file3, Boolean.TRUE) : 0L, 2));
                break;
            case 19:
                ((boolean[]) this.b)[0] = true;
                break;
            case 20:
                q2.d dVar = (q2.d) this.b;
                if (!dVar.c) {
                    q2.g gVar = dVar.b;
                    if (gVar != null) {
                        gVar.c(dVar.a);
                    }
                    dVar.d.y.remove(dVar);
                    dVar.c = true;
                    break;
                }
                break;
            case 21:
                ((q2.b) this.b).c(null);
                break;
            case 22:
                v91 v91Var = (v91) this.b;
                if (v91Var.getParentLayout() != null) {
                    v91Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", v91Var.a);
                    an anVar = new an(bundle);
                    anVar.Ca = true;
                    v91Var.presentFragment(anVar);
                    break;
                }
                break;
            case 23:
                ((qt) this.b).m0();
                break;
            case 24:
                hz hzVar = (hz) this.b;
                rh.b bVar = (rh.b) hzVar.c;
                if (bVar == rh.b.b) {
                    hzVar.a(rh.b.a, true);
                    break;
                } else if (bVar == rh.b.c) {
                    hzVar.a(rh.b.d, true);
                    break;
                }
                break;
            case 25:
                ((s4.e) this.b).k();
                break;
            case 26:
                ((s4.g) this.b).n = -1;
                break;
            case 27:
                ((ri0) this.b).b();
                break;
            case 28:
                uy uyVar = ((sg.h0) this.b).b.a;
                if (uyVar != null) {
                    uyVar.b();
                    break;
                }
                break;
            default:
                sg.j0 j0Var = ((sg.h0) this.b).b;
                if (j0Var.d == null) {
                    j0Var.L = null;
                    break;
                } else {
                    int currentColor = j0Var.f.getCurrentColor();
                    j0Var.l(j0Var.b, false, false);
                    wa d = j0Var.d(j0Var.b, currentColor, new RectF(j0Var.h));
                    j0Var.b();
                    sg.z0 z0Var = j0Var.d;
                    RectF rectF = new RectF();
                    j0Var.h = rectF;
                    z0Var.a(rectF);
                    j0Var.p(j0Var.e(z0Var, currentColor, new RectF(j0Var.h)), false);
                    j0Var.p(d, false);
                    j0Var.e(z0Var, currentColor, null);
                    j0Var.d = null;
                    j0Var.J = 0.0f;
                    j0Var.L = null;
                    break;
                }
        }
    }
}
