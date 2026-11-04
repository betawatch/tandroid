package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.db1;
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ri0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ri0(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 18:
                ((r0.m0) this.b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.a;
        int i10 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                si0 si0Var = (si0) obj2;
                vi0 vi0Var = si0Var.e;
                if (((ValueAnimator) vi0Var.g) != null) {
                    ((tj0) vi0Var.e).W1 = false;
                    ArrayList arrayList = si0Var.b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        View view = (View) obj3;
                        if (view instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) view).b(false, true);
                        }
                        view.setTranslationY(0.0f);
                        ((u4.b0) vi0Var.f).getClass();
                        u4.o0.x0(view);
                        ((tj0) vi0Var.e).removeView(view);
                        b8.of ofVar = (b8.of) vi0Var.i;
                        if (ofVar != null) {
                            ofVar.d(view);
                        }
                    }
                    ((tj0) vi0Var.e).setScrollEnabled(true);
                    ((tj0) vi0Var.e).setVerticalScrollBarEnabled(true);
                    boolean z10 = org.telegram.messenger.r2.a;
                    int childCount = ((tj0) vi0Var.e).getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = ((tj0) vi0Var.e).getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt).b(false, false);
                        }
                        childAt.setTranslationY(0.0f);
                    }
                    ArrayList arrayList2 = (ArrayList) obj;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj4 = arrayList2.get(i13);
                        i13++;
                        View view2 = (View) obj4;
                        if (view2 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) view2).b(false, false);
                        }
                        view2.setTranslationY(0.0f);
                    }
                    ti0 ti0Var = si0Var.d;
                    if (ti0Var != null) {
                        ti0Var.E();
                    }
                    b8.of ofVar2 = (b8.of) vi0Var.i;
                    if (ofVar2 != null) {
                        ofVar2.a();
                    }
                    ((SparseArray) vi0Var.j).clear();
                    vi0Var.g = null;
                    break;
                }
                break;
            case 1:
                iz izVar = (iz) obj;
                izVar.setAlpha(1.0f);
                u4.o0.x0(izVar);
                wi0 wi0Var = (wi0) obj2;
                wi0Var.c.remove(izVar);
                wi0Var.a.removeView(izVar);
                break;
            case 2:
                super.onAnimationEnd(animator);
                org.telegram.ui.tp tpVar = (org.telegram.ui.tp) obj2;
                ((wi0) tpVar.d).g.remove((AnimatorSet) obj);
                if (((wi0) tpVar.d).g.isEmpty()) {
                    ((wi0) tpVar.d).b.clear();
                    wi0 wi0Var2 = (wi0) tpVar.d;
                    wi0Var2.d = true;
                    wi0Var2.a.invalidate();
                    break;
                }
                break;
            case 3:
                en0 en0Var = (en0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(en0Var.B);
                } catch (Exception unused) {
                }
                j50 j50Var = en0Var.C;
                if (j50Var != null) {
                    org.telegram.messenger.g0.r(j50Var);
                    break;
                }
                break;
            case 4:
                ev0 ev0Var = (ev0) obj2;
                ev0Var.b = 0.0f;
                ev0Var.invalidate();
                ((vk0) obj).invalidate();
                break;
            case 5:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) obj2;
                q2Var.d.setText((String) obj);
                q2Var.d.setTranslationY(0.0f);
                q2Var.d.setAlpha(1.0f);
                break;
            case 6:
                ((org.telegram.ui.Components.voip.q2) obj2).removeView((org.telegram.ui.Components.voip.p2) obj);
                break;
            case 7:
                View view3 = (View) obj;
                if (view3.getParent() != null) {
                    ((ViewGroup) view3.getParent()).removeView(view3);
                }
                ((org.telegram.ui.uw) obj2).R3 = null;
                break;
            case 8:
                org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) obj2;
                s50Var.removeView((y10) obj);
                s50Var.d = null;
                s50Var.a = null;
                s50Var.b = false;
                break;
            case 9:
                vt0 vt0Var = (vt0) obj2;
                vt0Var.setVisibility(8);
                vt0Var.setX(0.0f);
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                ad0 ad0Var = photoViewer.D1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = ad0Var.e;
                ad0Var.f = bitmap != null;
                imageReceiver.v0(bitmap);
                imageReceiver.G0(0, 0, false);
                AnimatorSet animatorSet = ad0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ad0Var.w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ad0Var.h = true;
                ad0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ad0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ad0Var, ad0Var.F, 0.0f, 1.0f));
                ad0Var.s.setDuration(250L);
                ad0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                ad0Var.s.addListener(new yc0(ad0Var, 0));
                ad0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.B2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.A2, photoViewer.e4, 0.0f));
                photoViewer.B2.setDuration(85L);
                photoViewer.B2.setInterpolator(xq.g);
                photoViewer.B2.addListener(new org.telegram.ui.y20(this, 10));
                photoViewer.B2.start();
                break;
            case 11:
                org.telegram.ui.ks0 ks0Var = (org.telegram.ui.ks0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ks0Var.n;
                ((View) obj).setVisibility(8);
                while (i10 < premiumPreviewFragment.V.getChildCount()) {
                    View childAt2 = premiumPreviewFragment.V.getChildAt(i10);
                    if (childAt2 != ks0Var.e) {
                        childAt2.setTranslationY(0.0f);
                    }
                    i10++;
                }
                break;
            case 12:
                org.telegram.ui.my0 my0Var = (org.telegram.ui.my0) obj2;
                if (my0Var.h != null) {
                    my0Var.h = null;
                    my0Var.n.e();
                    ((org.telegram.ui.wv) obj).onTransitionAnimationEnd(true, false);
                    my0Var.e = 1.0f;
                    my0Var.g();
                    my0Var.d(false);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.mq0 mq0Var = (org.telegram.ui.mq0) obj;
                if (mq0Var != null) {
                    mq0Var.a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                org.telegram.messenger.g0.h3(new org.telegram.ui.pu0(this, 12));
                break;
            case 14:
                ((org.telegram.ui.w01) obj).run();
                org.telegram.ui.g11 g11Var = (org.telegram.ui.g11) obj2;
                org.telegram.ui.wz0 wz0Var = g11Var.Y0;
                if (wz0Var != null) {
                    wz0Var.dismiss();
                    g11Var.Y0 = null;
                    break;
                }
                break;
            case 15:
                db1 db1Var = (db1) obj2;
                db1Var.removeView((y10) obj);
                db1Var.e = null;
                db1Var.a = null;
                db1Var.b = false;
                UsersSelectActivity usersSelectActivity = db1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.Q.isEmpty()) {
                    usersSelectActivity.c.t(true, true);
                    break;
                }
                break;
            case 16:
                ((Runnable) obj).run();
                zb1 zb1Var = (zb1) obj2;
                zb1Var.f0.setScaleX(1.15f);
                zb1Var.f0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zb1Var.f0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f);
                zb1Var.f0.setVisibility(8);
                break;
            case 17:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.l0 = null;
                break;
            case 18:
                ((r0.m0) obj).c();
                break;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                break;
            case 20:
                ug.q1 q1Var = (ug.q1) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q1Var.s0.b(q1Var.z0, false);
                }
                q1Var.setRotationY(0.0f);
                q1Var.A0 = 1.0f;
                break;
            case 21:
                ((vg.v0) obj2).t1 = false;
                ((vg.m0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                break;
            default:
                vg.h1 h1Var = (vg.h1) obj2;
                h1Var.A2 = false;
                h1Var.z2 = 1.0f;
                h1Var.l2.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, org.telegram.messenger.hs.e4);
                    ofInt.addUpdateListener(new vg.e1(i10, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 9:
                ((vt0) this.b).setVisibility(0);
                break;
            case 18:
                ((r0.m0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ ri0(Object obj, View view, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = view;
    }

    public ri0(wi0 wi0Var, iz izVar, u4.o0 o0Var) {
        this.a = 1;
        this.c = wi0Var;
        this.b = izVar;
    }
}
