package oi;

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
import c8.na;
import hi.c7;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Animation animation = null;
        int i7 = 0;
        switch (this.a) {
            case 0:
                ((g2) this.b).c();
                break;
            case 1:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                break;
            case 2:
                ai.x0 x0Var = (ai.x0) this.b;
                Drawable drawable = ActionBarLayout.w1;
                org.telegram.messenger.g0.g3(x0Var);
                break;
            case 3:
                ((org.telegram.ui.ActionBar.p0) this.b).setSelectedForDelete(false);
                break;
            case 4:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.b;
                v0Var.a0 = true;
                org.telegram.messenger.g0.l2(new c7(v0Var, 19), 8.0f);
                break;
            case 5:
                ((org.telegram.ui.ActionBar.i1) this.b).c();
                break;
            case 6:
                org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.b;
                org.telegram.ui.ActionBar.t1 t1Var = p1Var.d;
                int i10 = org.telegram.messenger.g0.q.x;
                t1Var.M = i10;
                int min = Math.min(org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.P1() ? org.telegram.messenger.g0.L(446.0f) : org.telegram.messenger.g0.L(496.0f) : org.telegram.messenger.g0.L(356.0f), i10 - org.telegram.messenger.g0.L(56.0f));
                Rect rect = t1Var.B0;
                int i11 = min + rect.left + rect.right;
                if (t1Var.Y0) {
                    ViewGroup.LayoutParams layoutParams = p1Var.getLayoutParams();
                    if (layoutParams != null && layoutParams.width != i11) {
                        layoutParams.width = i11;
                        p1Var.requestLayout();
                        break;
                    }
                } else {
                    Window window = t1Var.getWindow();
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                    layoutParams2.copyFrom(window.getAttributes());
                    layoutParams2.width = i11;
                    try {
                        window.setAttributes(layoutParams2);
                        break;
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                        return;
                    }
                }
                break;
            case 7:
                org.telegram.ui.ActionBar.w1 w1Var = (org.telegram.ui.ActionBar.w1) this.b;
                w1Var.n1.setVisibility(0);
                w1Var.p1.setAlpha(0.0f);
                int i12 = w1Var.l1;
                if (i12 != 0 && i12 != -1) {
                    try {
                        animation = AnimationUtils.loadAnimation(w1Var.getContext(), i12);
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
                w1Var.p1.animate().setDuration(300L).alpha(1.0f).setListener(new org.telegram.ui.ActionBar.u1(w1Var, 0)).start();
                break;
            case 8:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) ((ki.e2) this.b).c;
                DialogInterface.OnDismissListener onDismissListener = w2Var.I0;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(w2Var);
                }
                try {
                    w2Var.L();
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 9:
                try {
                    ((org.telegram.ui.ActionBar.o2) this.b).b.L();
                    break;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.b;
                if (j3Var.d() != null) {
                    j3Var.d().setDrawingFromOverlay(true);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.ActionBar.m3) this.b).f();
                break;
            case 12:
                org.telegram.ui.ActionBar.j4 j4Var = (org.telegram.ui.ActionBar.j4) ((androidx.mediarouter.app.f0) this.b).b;
                j4Var.k();
                j4Var.j();
                break;
            case 13:
                org.telegram.ui.ActionBar.j4 j4Var2 = ((org.telegram.ui.ActionBar.g4) this.b).b;
                j4Var2.c.dismiss();
                j4Var2.f.removeAllViews();
                break;
            case 14:
                ((org.telegram.ui.ActionBar.g4) this.b).b.c.dismiss();
                break;
            case 15:
                Drawable drawable2 = (Drawable) this.b;
                n6.d = null;
                n6.P();
                if (!n6.b) {
                    n6.j(drawable2);
                    n6.h(drawable2);
                }
                ks.e().k(ks.C4, new Object[0]);
                break;
            case 16:
                f8 f8Var = (f8) n6.e5.remove((fj) this.b);
                if (f8Var != null) {
                    f8Var.i = null;
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                l0Var.Q0 = null;
                l0Var.setVisibleParticipant(true);
                break;
            case 18:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = t0Var.a;
                ArrayList arrayList2 = new ArrayList(arrayList);
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) obj;
                    if (s0Var.b && uptimeMillis - s0Var.c > 5000) {
                        arrayList.remove(s0Var);
                        t0Var.removeView(s0Var);
                    }
                }
                c2 c2Var = t0Var.h;
                t0Var.removeCallbacks(c2Var);
                if (!arrayList.isEmpty()) {
                    t0Var.postDelayed(c2Var, 500L);
                    break;
                }
                break;
            case 19:
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
            case 20:
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
                        e2Var.addView((View) arrayList4.get(i15), na.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        e2Var.removeView((View) arrayList3.get(i16));
                    }
                    hashMap.clear();
                    while (i7 < e2Var.getChildCount()) {
                        org.telegram.ui.Components.voip.d2 d2Var2 = (org.telegram.ui.Components.voip.d2) e2Var.getChildAt(i7);
                        hashMap.put(d2Var2.a, d2Var2);
                        i7++;
                    }
                    arrayList4.clear();
                    arrayList3.clear();
                    e2Var.e = true;
                    org.telegram.messenger.g0.h3(new c2(e2Var, 20), 700L);
                    Runnable runnable = e2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 21:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.l2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 22:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.l2) ((jg.j0) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 23:
                org.telegram.ui.Components.voip.p2 p2Var = (org.telegram.ui.Components.voip.p2) this.b;
                if (p2Var.getVisibility() == 0) {
                    p2Var.a();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.b;
                t2Var.e = Bitmap.createBitmap(t2Var.getMeasuredWidth(), t2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(t2Var.e).drawText(t2Var.d, t2Var.getMeasuredWidth() / 2, (int) ((t2Var.getMeasuredHeight() / 2) - ((t2Var.a.ascent() + t2Var.a.descent()) / 2.0f)), t2Var.a);
                t2Var.postInvalidate();
                break;
            case 25:
                ((org.telegram.ui.web.k) this.b).x.g3.O(true);
                break;
            case 26:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.m) ((hi.b3) this.b).c).f;
                if (iVar != null) {
                    iVar.d();
                    break;
                }
                break;
            case 27:
                ((mt) this.b).requestFocus();
                break;
            case 28:
                vf.c.t(((org.telegram.ui.web.o0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            default:
                hi.b3 b3Var = (hi.b3) this.b;
                Utilities.g.c(new as0(b3Var, new ArrayList(((org.telegram.ui.web.x0) b3Var.c).f), ((org.telegram.ui.web.x0) b3Var.c).r, 15));
                break;
        }
    }
}
