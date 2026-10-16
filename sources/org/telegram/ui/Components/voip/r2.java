package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import di.a6;
import java.io.File;
import java.util.ArrayList;
import ji.m5;
import ji.w4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.uo;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s2 s2Var = (s2) this.b;
                if (s2Var.getVisibility() == 0) {
                    s2Var.a();
                    return;
                }
                return;
            case 1:
                w2 w2Var = (w2) this.b;
                w2Var.e = Bitmap.createBitmap(w2Var.getMeasuredWidth(), w2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(w2Var.e).drawText(w2Var.d, w2Var.getMeasuredWidth() / 2, (int) ((w2Var.getMeasuredHeight() / 2) - ((w2Var.a.ascent() + w2Var.a.descent()) / 2.0f)), w2Var.a);
                w2Var.postInvalidate();
                return;
            case 2:
                ((org.telegram.ui.web.k) this.b).w.W2.N(true);
                return;
            case 3:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.n) this.b).h.e;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            case 4:
                ((nu) this.b).requestFocus();
                return;
            case 5:
                pf.d.r(((org.telegram.ui.web.v0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 6:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) this.b;
                Utilities.searchQueue.postRunnable(new ze0(g1Var, new ArrayList(g1Var.h.e), g1Var.h.n, 25));
                return;
            case 7:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                return;
            case 8:
                ((org.telegram.ui.Cells.o1) this.b).invalidateSelf();
                return;
            case 9:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += org.telegram.ui.web.z1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += org.telegram.ui.web.z1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new uo(z1Var, length, file3.exists() ? org.telegram.ui.web.z1.Z(file3, Boolean.TRUE) : 0L, 1));
                return;
            case 10:
                ((boolean[]) this.b)[0] = true;
                return;
            case 11:
                ((p4.e) this.b).k();
                return;
            case 12:
                ((p4.g) this.b).n = -1;
                return;
            case 13:
                ((pl0) this.b).b();
                return;
            case 14:
                pi.c cVar = (pi.c) this.b;
                AndroidUtilities.runOnUIThread(new pi.b(cVar.a, cVar.b, 1), 500L);
                return;
            case 15:
                w4 w4Var = ((qg.p0) this.b).b.a;
                if (w4Var != null) {
                    w4Var.Y0();
                    return;
                }
                return;
            case 16:
                qg.q0 q0Var = ((qg.p0) this.b).b;
                if (q0Var.d == null) {
                    q0Var.L = null;
                    return;
                }
                int currentColor = q0Var.f.getCurrentColor();
                q0Var.l(q0Var.b, false, false);
                a5.a d = q0Var.d(q0Var.b, currentColor, new RectF(q0Var.h));
                q0Var.b();
                qg.f1 f1Var = q0Var.d;
                RectF rectF = new RectF();
                q0Var.h = rectF;
                f1Var.a(rectF);
                q0Var.p(q0Var.e(f1Var, currentColor, new RectF(q0Var.h)), false);
                q0Var.p(d, false);
                q0Var.e(f1Var, currentColor, null);
                q0Var.d = null;
                q0Var.J = 0.0f;
                q0Var.L = null;
                return;
            case 17:
                ((qg.a1) ((p4.s0) this.b).b).y.a.a();
                return;
            case 18:
                qg.s1 s1Var = ((qg.t1) this.b).a;
                if (s1Var != null) {
                    s1Var.e();
                    return;
                }
                return;
            case 19:
                qh.c cVar2 = (qh.c) this.b;
                qh.b bVar = cVar2.c;
                if (bVar == qh.b.b) {
                    cVar2.a(qh.b.a, true);
                    return;
                } else {
                    if (bVar == qh.b.c) {
                        cVar2.a(qh.b.d, true);
                        return;
                    }
                    return;
                }
            case 20:
                r2.f fVar = (r2.f) this.b;
                synchronized (fVar.a) {
                    try {
                        if (fVar.m) {
                            return;
                        }
                        long j10 = fVar.l - 1;
                        fVar.l = j10;
                        if (j10 > 0) {
                            return;
                        }
                        if (j10 < 0) {
                            fVar.c(new IllegalStateException());
                            return;
                        } else {
                            fVar.a();
                            return;
                        }
                    } finally {
                    }
                }
            case 21:
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.b;
                ((s5.g) ((t5.c) sVar.e)).f(new m5(sVar, 26));
                return;
            case 22:
                a6 a6Var = (a6) this.b;
                a6Var.x0 = true;
                a6Var.s();
                return;
            case 23:
                ((View) this.b).performClick();
                return;
            case 24:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((rg.n2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 25:
                AndroidUtilities.showKeyboard(((rg.x2) this.b).q0);
                return;
            case 26:
                AndroidUtilities.showKeyboard(((rh.c) this.b).a);
                return;
            case 27:
                rh.c cVar3 = (rh.c) ((c6) this.b).d;
                org.telegram.ui.Cells.u1 u1Var = cVar3.n;
                if (u1Var == null || u1Var.getDelegate() == null) {
                    return;
                }
                cVar3.n.getDelegate().y1(cVar3.n, false);
                return;
            case 28:
                ((rh.q) this.b).c.W2.N(true);
                return;
            default:
                ((rh.p) this.b).a();
                return;
        }
    }
}
