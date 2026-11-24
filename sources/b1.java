// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.j;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        ux uxVar = (ux) this.b;
        synchronized (uxVar.a) {
            if (uxVar.m) {
                return;
            }
            long j = uxVar.l - 1;
            uxVar.l = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                uxVar.c(new IllegalStateException());
            } else {
                uxVar.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        hw hwVar;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        switch (this.a) {
            case 0:
                d1 d1Var = (d1) this.b;
                while (true) {
                    synchronized (d1Var.a) {
                        while (!d1Var.e) {
                            try {
                                d1Var.a.wait();
                            } catch (InterruptedException unused) {
                            }
                        }
                        i = d1Var.f;
                        i2 = d1Var.g + 1;
                        d1Var.g = i2;
                    }
                    d1Var.b.obtainMessage(1, i2, i).sendToTarget();
                    try {
                        Thread.sleep(5000L);
                        if (d1Var.e && d1Var.f == i && d1Var.h != i2 && !d1Var.i) {
                            d1Var.i = true;
                            try {
                                d1Var.d.run();
                            } catch (Throwable th) {
                                fa4.g(th, true);
                            }
                        }
                    } catch (InterruptedException unused2) {
                    }
                }
                break;
            case 1:
                p1 p1Var = (p1) this.b;
                r86 r86Var = p1Var.d;
                if (r86Var != null) {
                    p1Var.h.F.m(r86Var, true);
                    return;
                }
                return;
            case 2:
                ((va7) this.b).run();
                return;
            case 3:
                tn6 tn6Var = (tn6) this.b;
                Drawable drawable = ActionBarLayout.w1;
                gl.d3(tn6Var);
                return;
            case 4:
                ((q7) this.b).setSelectedForDelete(false);
                return;
            case 5:
                w7 w7Var = (w7) this.b;
                w7Var.a0 = true;
                gl.j2(new be2(w7Var, r5), 8.0f);
                return;
            case 6:
                ((eb) this.b).x.g3.O(true);
                return;
            case 7:
                ((gb) this.b).c();
                return;
            case 8:
                cd cdVar = (cd) this.b;
                hd hdVar = cdVar.d;
                int i7 = gl.q.x;
                hdVar.M = i7;
                int min = Math.min(gl.O1() ? gl.N1() ? gl.L(446.0f) : gl.L(496.0f) : gl.L(356.0f), i7 - gl.L(56.0f));
                Rect rect = hdVar.B0;
                int i8 = min + rect.left + rect.right;
                if (hdVar.Y0) {
                    ViewGroup.LayoutParams layoutParams = cdVar.getLayoutParams();
                    if (layoutParams == null || layoutParams.width == i8) {
                        return;
                    }
                    layoutParams.width = i8;
                    cdVar.requestLayout();
                    return;
                }
                Window window = hdVar.getWindow();
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                layoutParams2.copyFrom(window.getAttributes());
                layoutParams2.width = i8;
                try {
                    window.setAttributes(layoutParams2);
                    return;
                } catch (Throwable th2) {
                    fa4.g(th2, true);
                    return;
                }
            case 9:
                Animation animation = null;
                nd ndVar = (nd) this.b;
                ndVar.n1.setVisibility(0);
                ndVar.p1.setAlpha(0.0f);
                int i9 = ndVar.l1;
                if (i9 != 0 && i9 != -1) {
                    try {
                        animation = AnimationUtils.loadAnimation(ndVar.getContext(), i9);
                    } catch (Resources.NotFoundException e) {
                        fa4.g(e, true);
                    }
                }
                ViewGroup viewGroup = ndVar.o1;
                if (animation != null) {
                    viewGroup.startAnimation(animation);
                } else {
                    viewGroup.setAlpha(0.0f);
                    ndVar.o1.animate().setDuration(300L).alpha(1.0f).start();
                }
                ndVar.p1.animate().setDuration(300L).alpha(1.0f).setListener(new kd(ndVar, (byte) 0)).start();
                return;
            case 10:
                hj hjVar = (hj) this.b;
                hjVar.requestFocus();
                gl.F3(hjVar);
                return;
            case 11:
                gl.F3((EditText) this.b);
                return;
            case 12:
                sca scaVar = (sca) this.b;
                if (scaVar.getAdapter() != null) {
                    scaVar.getAdapter().f();
                    return;
                }
                return;
            case 13:
                vl vlVar = (vl) this.b;
                SparseArray sparseArray = vl.r;
                vlVar.u();
                return;
            case 14:
                rl rlVar = (rl) this.b;
                ArrayList arrayList = new ArrayList(rlVar.c);
                rlVar.c.clear();
                ad7.Y(rlVar.e).a.c(new nl(rlVar, arrayList, (byte) 0));
                rlVar.d = null;
                return;
            case 15:
                ((tl) this.b).invalidate();
                return;
            case 16:
                ((yla) this.b).h();
                return;
            case 17:
                hn hnVar = (hn) this.b;
                CharSequence charSequence = hnVar.f;
                if (charSequence != null) {
                    hnVar.c(charSequence, hnVar.h, true);
                    hnVar.f = null;
                    hnVar.h = false;
                    return;
                }
                return;
            case 18:
                ((cs) this.b).presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 19:
                ((eu) this.b).a(2, false);
                return;
            case 20:
                o oVar = ((au) this.b).a;
                oVar.T0.e();
                Runnable runnable = oVar.b0;
                if (runnable != null) {
                    runnable.run();
                    oVar.b0 = null;
                    return;
                }
                return;
            case 21:
                o oVar2 = ((j) ((ru) this.b).b).y;
                View view = oVar2.P;
                if (view != null) {
                    oVar2.Q.addView(view, nme.c(-1.0f, -1));
                    oVar2.Q.setVisibility(0);
                    return;
                }
                return;
            case 22:
                d01.t(((j) ((su) this.b).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 23:
                ((cv) this.b).requestLayout();
                return;
            case 24:
                sw swVar = (sw) this.b;
                swVar.release();
                swVar.L.p();
                return;
            case 25:
                dx dxVar = (dx) this.b;
                ArrayList arrayList2 = new ArrayList(dxVar.d);
                int size = arrayList2.size();
                o oVar3 = dxVar.N;
                int i10 = size + (oVar3.L == null ? (byte) 0 : (byte) 1);
                int[] iArr = new int[i10];
                int[] iArr2 = new int[i10];
                m mVar = oVar3.v0[0];
                if (mVar == null || (hwVar = mVar.b) == null) {
                    return;
                }
                Point point = gl.q;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i10) {
                    if (!dxVar.J) {
                        i3 = i11;
                    } else if (i11 == 0) {
                        iArr[i6] = i6;
                        i4 = i11;
                        i5 = i12;
                        int i13 = i4 - 1;
                        iArr2[i4] = (i13 < 0 ? 0 : iArr2[i13]) + iArr[i4];
                        i12 = i5 + iArr[i4];
                        i11 = i4 + 1;
                        i6 = 0;
                    } else {
                        i3 = i11 - 1;
                    }
                    TL_iv.PageBlock pageBlock = (i3 < 0 || i3 >= arrayList2.size()) ? null : (TL_iv.PageBlock) arrayList2.get(i3);
                    if (pageBlock == null || pageBlock.cachedHeight == 0 || pageBlock.cachedWidth != View.MeasureSpec.getSize(makeMeasureSpec)) {
                        s49 a = dxVar.a(hwVar, dx.I(pageBlock));
                        View view2 = a.a;
                        i4 = i11;
                        i5 = i12;
                        dxVar.H(a.f, a, pageBlock, i3, arrayList2.size(), true);
                        view2.measure(makeMeasureSpec, makeMeasureSpec2);
                        int measuredHeight = view2.getMeasuredHeight();
                        iArr[i4] = measuredHeight;
                        if (pageBlock != null) {
                            pageBlock.cachedHeight = measuredHeight;
                            pageBlock.cachedWidth = View.MeasureSpec.getSize(makeMeasureSpec);
                        }
                        int i132 = i4 - 1;
                        iArr2[i4] = (i132 < 0 ? 0 : iArr2[i132]) + iArr[i4];
                        i12 = i5 + iArr[i4];
                        i11 = i4 + 1;
                        i6 = 0;
                    } else {
                        iArr[i11] = pageBlock.cachedHeight;
                        i4 = i11;
                        i5 = i12;
                        int i1322 = i4 - 1;
                        iArr2[i4] = (i1322 < 0 ? 0 : iArr2[i1322]) + iArr[i4];
                        i12 = i5 + iArr[i4];
                        i11 = i4 + 1;
                        i6 = 0;
                    }
                }
                gl.d3(new va7(dxVar, i12, iArr, iArr2));
                return;
            case 26:
                a();
                return;
            case 27:
                ty tyVar = (ty) this.b;
                tyVar.c2.setTranslationX(tyVar.b2.getAnimatedWidth() + gl.L(28.0f));
                return;
            case 28:
                ((lz) this.b).onBackPressed();
                return;
            default:
                xf4 xf4Var = (xf4) this.b;
                ((Context) xf4Var.b).unregisterReceiver((pz) xf4Var.c);
                return;
        }
    }
}
