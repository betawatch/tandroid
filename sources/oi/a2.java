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
import c8.ma;
import hi.t6;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.sv0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Animation animation = null;
        int i7 = 0;
        switch (this.a) {
            case 0:
                ((e2) this.b).c();
                break;
            case 1:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                break;
            case 2:
                bi.u4 u4Var = (bi.u4) this.b;
                Drawable drawable = ActionBarLayout.w1;
                org.telegram.messenger.g0.g3(u4Var);
                break;
            case 3:
                ((org.telegram.ui.ActionBar.q0) this.b).setSelectedForDelete(false);
                break;
            case 4:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.b;
                w0Var.a0 = true;
                org.telegram.messenger.g0.l2(new t6(w0Var, 19), 8.0f);
                break;
            case 5:
                ((org.telegram.ui.ActionBar.j1) this.b).c();
                break;
            case 6:
                org.telegram.ui.ActionBar.q1 q1Var = (org.telegram.ui.ActionBar.q1) this.b;
                org.telegram.ui.ActionBar.u1 u1Var = q1Var.d;
                int i10 = org.telegram.messenger.g0.q.x;
                u1Var.M = i10;
                int min = Math.min(org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.P1() ? org.telegram.messenger.g0.L(446.0f) : org.telegram.messenger.g0.L(496.0f) : org.telegram.messenger.g0.L(356.0f), i10 - org.telegram.messenger.g0.L(56.0f));
                Rect rect = u1Var.B0;
                int i11 = min + rect.left + rect.right;
                if (u1Var.Y0) {
                    ViewGroup.LayoutParams layoutParams = q1Var.getLayoutParams();
                    if (layoutParams != null && layoutParams.width != i11) {
                        layoutParams.width = i11;
                        q1Var.requestLayout();
                        break;
                    }
                } else {
                    Window window = u1Var.getWindow();
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
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.b;
                x1Var.n1.setVisibility(0);
                x1Var.p1.setAlpha(0.0f);
                int i12 = x1Var.l1;
                if (i12 != 0 && i12 != -1) {
                    try {
                        animation = AnimationUtils.loadAnimation(x1Var.getContext(), i12);
                    } catch (Resources.NotFoundException e10) {
                        a8.g(e10, true);
                    }
                }
                if (animation != null) {
                    x1Var.o1.startAnimation(animation);
                } else {
                    x1Var.o1.setAlpha(0.0f);
                    x1Var.o1.animate().setDuration(300L).alpha(1.0f).start();
                }
                x1Var.p1.animate().setDuration(300L).alpha(1.0f).setListener(new org.telegram.ui.ActionBar.v1(x1Var, 0)).start();
                break;
            case 8:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) ((ki.f2) this.b).c;
                DialogInterface.OnDismissListener onDismissListener = x2Var.I0;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(x2Var);
                }
                try {
                    x2Var.L();
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 9:
                try {
                    ((org.telegram.ui.ActionBar.p2) this.b).b.L();
                    break;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.b;
                if (k3Var.d() != null) {
                    k3Var.d().setDrawingFromOverlay(true);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.ActionBar.n3) this.b).f();
                break;
            case 12:
                org.telegram.ui.ActionBar.k4 k4Var = (org.telegram.ui.ActionBar.k4) ((androidx.mediarouter.app.f0) this.b).b;
                k4Var.k();
                k4Var.j();
                break;
            case 13:
                org.telegram.ui.ActionBar.k4 k4Var2 = ((org.telegram.ui.ActionBar.h4) this.b).b;
                k4Var2.c.dismiss();
                k4Var2.f.removeAllViews();
                break;
            case 14:
                ((org.telegram.ui.ActionBar.h4) this.b).b.c.dismiss();
                break;
            case 15:
                Drawable drawable2 = (Drawable) this.b;
                n6.d = null;
                n6.P();
                if (!n6.b) {
                    n6.j(drawable2);
                    n6.h(drawable2);
                }
                ks.e().k(ks.B4, new Object[0]);
                break;
            case 16:
                h8 h8Var = (h8) n6.e5.remove((fj) this.b);
                if (h8Var != null) {
                    h8Var.i = null;
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.b;
                k0Var.Q0 = null;
                k0Var.setVisibleParticipant(true);
                break;
            case 18:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = s0Var.a;
                ArrayList arrayList2 = new ArrayList(arrayList);
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) obj;
                    if (r0Var.b && uptimeMillis - r0Var.c > 5000) {
                        arrayList.remove(r0Var);
                        s0Var.removeView(r0Var);
                    }
                }
                a2 a2Var = s0Var.h;
                s0Var.removeCallbacks(a2Var);
                if (!arrayList.isEmpty()) {
                    s0Var.postDelayed(a2Var, 500L);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.voip.j1 j1Var = ((org.telegram.ui.Components.voip.g1) this.b).h;
                wi.n nVar = j1Var.a;
                if (nVar != null) {
                    nVar.c();
                }
                org.telegram.ui.Components.voip.i1 i1Var = j1Var.f;
                if (i1Var != null) {
                    i1Var.a();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.voip.d2 d2Var = (org.telegram.ui.Components.voip.d2) this.b;
                d2Var.e = false;
                HashMap hashMap = d2Var.a;
                ArrayList arrayList3 = d2Var.c;
                ArrayList arrayList4 = d2Var.b;
                if (!arrayList4.isEmpty() || !arrayList3.isEmpty()) {
                    if (d2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(d2Var, d2Var.d);
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        org.telegram.ui.Components.voip.c2 c2Var = (org.telegram.ui.Components.voip.c2) arrayList4.get(i13);
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList3.size()) {
                                break;
                            }
                            if (c2Var.a.equals(((org.telegram.ui.Components.voip.c2) arrayList3.get(i14)).a)) {
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
                        d2Var.addView((View) arrayList4.get(i15), ma.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        d2Var.removeView((View) arrayList3.get(i16));
                    }
                    hashMap.clear();
                    while (i7 < d2Var.getChildCount()) {
                        org.telegram.ui.Components.voip.c2 c2Var2 = (org.telegram.ui.Components.voip.c2) d2Var.getChildAt(i7);
                        hashMap.put(c2Var2.a, c2Var2);
                        i7++;
                    }
                    arrayList4.clear();
                    arrayList3.clear();
                    d2Var.e = true;
                    org.telegram.messenger.g0.h3(new a2(d2Var, 20), 700L);
                    Runnable runnable = d2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 21:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.k2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 22:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.k2) ((jg.j0) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                break;
            case 23:
                org.telegram.ui.Components.voip.o2 o2Var = (org.telegram.ui.Components.voip.o2) this.b;
                if (o2Var.getVisibility() == 0) {
                    o2Var.a();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.b;
                s2Var.e = Bitmap.createBitmap(s2Var.getMeasuredWidth(), s2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(s2Var.e).drawText(s2Var.d, s2Var.getMeasuredWidth() / 2, (int) ((s2Var.getMeasuredHeight() / 2) - ((s2Var.a.ascent() + s2Var.a.descent()) / 2.0f)), s2Var.a);
                s2Var.postInvalidate();
                break;
            case 25:
                ((org.telegram.ui.web.k) this.b).x.g3.O(true);
                break;
            case 26:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.m) ((hi.t2) this.b).c).f;
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
                hi.t2 t2Var = (hi.t2) this.b;
                Utilities.g.c(new sv0((Object) t2Var, (Object) new ArrayList(((org.telegram.ui.web.x0) t2Var.c).f), ((org.telegram.ui.web.x0) t2Var.c).r, 13));
                break;
        }
    }
}
