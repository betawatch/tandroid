package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import c8.ja;
import hi.g7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.z7;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w0 w0Var = (w0) this.b;
                w0Var.a0 = true;
                org.telegram.messenger.g0.l2(new g7(w0Var, 18), 8.0f);
                break;
            case 1:
                ((i1) this.b).c();
                break;
            case 2:
                p1 p1Var = (p1) this.b;
                t1 t1Var = p1Var.d;
                int i7 = org.telegram.messenger.g0.q.x;
                t1Var.M = i7;
                int min = Math.min(org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.P1() ? org.telegram.messenger.g0.L(446.0f) : org.telegram.messenger.g0.L(496.0f) : org.telegram.messenger.g0.L(356.0f), i7 - org.telegram.messenger.g0.L(56.0f));
                Rect rect = t1Var.B0;
                int i10 = min + rect.left + rect.right;
                if (t1Var.Y0) {
                    ViewGroup.LayoutParams layoutParams = p1Var.getLayoutParams();
                    if (layoutParams != null && layoutParams.width != i10) {
                        layoutParams.width = i10;
                        p1Var.requestLayout();
                        break;
                    }
                } else {
                    Window window = t1Var.getWindow();
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                    layoutParams2.copyFrom(window.getAttributes());
                    layoutParams2.width = i10;
                    try {
                        window.setAttributes(layoutParams2);
                        break;
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                        return;
                    }
                }
                break;
            case 3:
                w1 w1Var = (w1) this.b;
                w1Var.n1.setVisibility(0);
                w1Var.p1.setAlpha(0.0f);
                int i11 = w1Var.l1;
                Animation animation = null;
                if (i11 != 0 && i11 != -1) {
                    try {
                        animation = AnimationUtils.loadAnimation(w1Var.getContext(), i11);
                    } catch (Resources.NotFoundException e10) {
                        a8.g(e10, true);
                    }
                }
                if (animation != null) {
                    w1Var.o1.startAnimation(animation);
                } else {
                    w1Var.o1.setAlpha(0.0f);
                    w1Var.o1.animate().setDuration(300L).alpha(1.0f).start();
                }
                w1Var.p1.animate().setDuration(300L).alpha(1.0f).setListener(new u1(w1Var, 0)).start();
                break;
            case 4:
                u2 u2Var = (u2) ((ki.j2) this.b).c;
                DialogInterface.OnDismissListener onDismissListener = u2Var.I0;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(u2Var);
                }
                try {
                    u2Var.L();
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 5:
                try {
                    ((m2) this.b).b.L();
                    break;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 6:
                g3 g3Var = (g3) this.b;
                if (g3Var.d() != null) {
                    g3Var.d().setDrawingFromOverlay(true);
                    break;
                }
                break;
            case 7:
                ((j3) this.b).f();
                break;
            case 8:
                g4 g4Var = (g4) ((androidx.mediarouter.app.f0) this.b).b;
                g4Var.k();
                g4Var.j();
                break;
            case 9:
                g4 g4Var2 = ((d4) this.b).b;
                g4Var2.c.dismiss();
                g4Var2.f.removeAllViews();
                break;
            case 10:
                ((d4) this.b).b.c.dismiss();
                break;
            case 11:
                Drawable drawable = (Drawable) this.b;
                j6.d = null;
                j6.P();
                if (!j6.b) {
                    j6.j(drawable);
                    j6.h(drawable);
                }
                ns.e().k(ns.z4, new Object[0]);
                break;
            case 12:
                i20.l(1, (e2) this.b);
                break;
            case 13:
                z7 z7Var = (z7) j6.e5.remove((gj) this.b);
                if (z7Var != null) {
                    z7Var.i = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                l0Var.Q0 = null;
                l0Var.setVisibleParticipant(true);
                break;
            case 15:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = t0Var.a;
                ArrayList arrayList2 = new ArrayList(arrayList);
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) obj;
                    if (s0Var.b && uptimeMillis - s0Var.c > 5000) {
                        arrayList.remove(s0Var);
                        t0Var.removeView(s0Var);
                    }
                }
                r0 r0Var = t0Var.h;
                t0Var.removeCallbacks(r0Var);
                if (!arrayList.isEmpty()) {
                    t0Var.postDelayed(r0Var, 500L);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.voip.k1 k1Var = ((org.telegram.ui.Components.voip.h1) this.b).h;
                wi.n nVar = k1Var.a;
                if (nVar != null) {
                    nVar.c();
                }
                org.telegram.ui.Components.voip.j1 j1Var = k1Var.f;
                if (j1Var != null) {
                    j1Var.a();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) this.b;
                e2Var.e = false;
                HashMap hashMap = e2Var.a;
                ArrayList arrayList3 = e2Var.c;
                ArrayList arrayList4 = e2Var.b;
                if (!arrayList4.isEmpty() || !arrayList3.isEmpty()) {
                    if (e2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(e2Var, e2Var.d);
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        org.telegram.ui.Components.voip.d2 d2Var = (org.telegram.ui.Components.voip.d2) arrayList4.get(i13);
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList3.size()) {
                                break;
                            }
                            if (d2Var.a.equals(((org.telegram.ui.Components.voip.d2) arrayList3.get(i14)).a)) {
                                arrayList4.remove(i13);
                                arrayList3.remove(i14);
                                i13--;
                            } else {
                                i14++;
                            }
                        }
                        i13++;
                    }
                    for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                        e2Var.addView((View) arrayList4.get(i15), ja.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        e2Var.removeView((View) arrayList3.get(i16));
                    }
                    hashMap.clear();
                    for (int i17 = 0; i17 < e2Var.getChildCount(); i17++) {
                        org.telegram.ui.Components.voip.d2 d2Var2 = (org.telegram.ui.Components.voip.d2) e2Var.getChildAt(i17);
                        hashMap.put(d2Var2.a, d2Var2);
                    }
                    arrayList4.clear();
                    arrayList3.clear();
                    e2Var.e = true;
                    org.telegram.messenger.g0.i3(new r0(e2Var, 17), 700L);
                    Runnable runnable = e2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 18:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.l2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 19:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.l2) ((jg.j0) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 20:
                org.telegram.ui.Components.voip.p2 p2Var = (org.telegram.ui.Components.voip.p2) this.b;
                if (p2Var.getVisibility() == 0) {
                    p2Var.a();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.b;
                t2Var.e = Bitmap.createBitmap(t2Var.getMeasuredWidth(), t2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(t2Var.e).drawText(t2Var.d, t2Var.getMeasuredWidth() / 2, (int) ((t2Var.getMeasuredHeight() / 2) - ((t2Var.a.ascent() + t2Var.a.descent()) / 2.0f)), t2Var.a);
                t2Var.postInvalidate();
                break;
            case 22:
                ((org.telegram.ui.web.k) this.b).x.g3.O(true);
                break;
            case 23:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.m) ((hi.s2) this.b).c).f;
                if (iVar != null) {
                    iVar.d();
                    break;
                }
                break;
            case 24:
                ((ft) this.b).requestFocus();
                break;
            case 25:
                vf.c.t(((org.telegram.ui.web.o0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 26:
                hi.s2 s2Var = (hi.s2) this.b;
                Utilities.g.c(new lv0(s2Var, new ArrayList(((org.telegram.ui.web.x0) s2Var.c).f), ((org.telegram.ui.web.x0) s2Var.c).r));
                break;
            case 27:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                break;
            case 28:
                ((org.telegram.ui.Wallet.x5) this.b).invalidateSelf();
                break;
            default:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.b;
                File databasePath = org.telegram.messenger.t0.b.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = org.telegram.messenger.t0.b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += org.telegram.ui.web.n1.e0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += org.telegram.ui.web.n1.e0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                org.telegram.messenger.g0.h3(new ai.f0(n1Var, length, file3.exists() ? org.telegram.ui.web.n1.e0(file3, Boolean.TRUE) : 0L, 3));
                break;
        }
    }
}
