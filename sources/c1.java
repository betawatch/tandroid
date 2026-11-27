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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        vx vxVar = (vx) this.b;
        synchronized (vxVar.a) {
            if (vxVar.m) {
                return;
            }
            long j = vxVar.l - 1;
            vxVar.l = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                vxVar.c(new IllegalStateException());
            } else {
                vxVar.a();
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
        iw iwVar;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.b;
                while (true) {
                    synchronized (e1Var.a) {
                        while (!e1Var.e) {
                            try {
                                e1Var.a.wait();
                            } catch (InterruptedException unused) {
                            }
                        }
                        i = e1Var.f;
                        i2 = e1Var.g + 1;
                        e1Var.g = i2;
                    }
                    e1Var.b.obtainMessage(1, i2, i).sendToTarget();
                    try {
                        Thread.sleep(5000L);
                        if (e1Var.e && e1Var.f == i && e1Var.h != i2 && !e1Var.i) {
                            e1Var.i = true;
                            try {
                                e1Var.d.run();
                            } catch (Throwable th) {
                                cc4.g(th, true);
                            }
                        }
                    } catch (InterruptedException unused2) {
                    }
                }
                break;
            case 1:
                q1 q1Var = (q1) this.b;
                va6 va6Var = q1Var.d;
                if (va6Var != null) {
                    q1Var.h.F.m(va6Var, true);
                    return;
                }
                return;
            case 2:
                ((ze7) this.b).run();
                return;
            case 3:
                gp6 gp6Var = (gp6) this.b;
                Drawable drawable = ActionBarLayout.w1;
                hl.c3(gp6Var);
                return;
            case 4:
                ((r7) this.b).setSelectedForDelete(false);
                return;
            case 5:
                x7 x7Var = (x7) this.b;
                x7Var.a0 = true;
                hl.j2(new te2(x7Var, r5), 8.0f);
                return;
            case 6:
                ((fb) this.b).x.g3.O(true);
                return;
            case 7:
                ((hb) this.b).c();
                return;
            case 8:
                dd ddVar = (dd) this.b;
                id idVar = ddVar.d;
                int i7 = hl.q.x;
                idVar.M = i7;
                int min = Math.min(hl.O1() ? hl.N1() ? hl.L(446.0f) : hl.L(496.0f) : hl.L(356.0f), i7 - hl.L(56.0f));
                Rect rect = idVar.B0;
                int i8 = min + rect.left + rect.right;
                if (idVar.Y0) {
                    ViewGroup.LayoutParams layoutParams = ddVar.getLayoutParams();
                    if (layoutParams == null || layoutParams.width == i8) {
                        return;
                    }
                    layoutParams.width = i8;
                    ddVar.requestLayout();
                    return;
                }
                Window window = idVar.getWindow();
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                layoutParams2.copyFrom(window.getAttributes());
                layoutParams2.width = i8;
                try {
                    window.setAttributes(layoutParams2);
                    return;
                } catch (Throwable th2) {
                    cc4.g(th2, true);
                    return;
                }
            case 9:
                Animation animation = null;
                od odVar = (od) this.b;
                odVar.n1.setVisibility(0);
                odVar.p1.setAlpha(0.0f);
                int i9 = odVar.l1;
                if (i9 != 0 && i9 != -1) {
                    try {
                        animation = AnimationUtils.loadAnimation(odVar.getContext(), i9);
                    } catch (Resources.NotFoundException e) {
                        cc4.g(e, true);
                    }
                }
                ViewGroup viewGroup = odVar.o1;
                if (animation != null) {
                    viewGroup.startAnimation(animation);
                } else {
                    viewGroup.setAlpha(0.0f);
                    odVar.o1.animate().setDuration(300L).alpha(1.0f).start();
                }
                odVar.p1.animate().setDuration(300L).alpha(1.0f).setListener(new ld(odVar, (byte) 0)).start();
                return;
            case 10:
                ij ijVar = (ij) this.b;
                ijVar.requestFocus();
                hl.E3(ijVar);
                return;
            case 11:
                hl.E3((EditText) this.b);
                return;
            case 12:
                jga jgaVar = (jga) this.b;
                if (jgaVar.getAdapter() != null) {
                    jgaVar.getAdapter().f();
                    return;
                }
                return;
            case 13:
                wl wlVar = (wl) this.b;
                SparseArray sparseArray = wl.r;
                wlVar.u();
                return;
            case 14:
                sl slVar = (sl) this.b;
                ArrayList arrayList = new ArrayList(slVar.c);
                slVar.c.clear();
                jf7.Y(slVar.e).a.c(new ol(slVar, arrayList, (byte) 0));
                slVar.d = null;
                return;
            case 15:
                ((ul) this.b).invalidate();
                return;
            case 16:
                ((vpa) this.b).h();
                return;
            case 17:
                in inVar = (in) this.b;
                CharSequence charSequence = inVar.f;
                if (charSequence != null) {
                    inVar.c(charSequence, inVar.h, true);
                    inVar.f = null;
                    inVar.h = false;
                    return;
                }
                return;
            case 18:
                ((ds) this.b).presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 19:
                ((fu) this.b).a(2, false);
                return;
            case 20:
                o oVar = ((bu) this.b).a;
                oVar.T0.e();
                Runnable runnable = oVar.b0;
                if (runnable != null) {
                    runnable.run();
                    oVar.b0 = null;
                    return;
                }
                return;
            case 21:
                o oVar2 = ((j) ((su) this.b).b).y;
                View view = oVar2.P;
                if (view != null) {
                    oVar2.Q.addView(view, tre.c(-1.0f, -1));
                    oVar2.Q.setVisibility(0);
                    return;
                }
                return;
            case 22:
                m01.u(((j) ((tu) this.b).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 23:
                ((dv) this.b).requestLayout();
                return;
            case 24:
                tw twVar = (tw) this.b;
                twVar.release();
                twVar.L.p();
                return;
            case 25:
                ex exVar = (ex) this.b;
                ArrayList arrayList2 = new ArrayList(exVar.d);
                int size = arrayList2.size();
                o oVar3 = exVar.N;
                int i10 = size + (oVar3.L == null ? (byte) 0 : (byte) 1);
                int[] iArr = new int[i10];
                int[] iArr2 = new int[i10];
                m mVar = oVar3.v0[0];
                if (mVar == null || (iwVar = mVar.b) == null) {
                    return;
                }
                Point point = hl.q;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i10) {
                    if (!exVar.J) {
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
                        f89 a = exVar.a(iwVar, ex.I(pageBlock));
                        View view2 = a.a;
                        i4 = i11;
                        i5 = i12;
                        exVar.H(a.f, a, pageBlock, i3, arrayList2.size(), true);
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
                hl.c3(new ze7(exVar, i12, iArr, iArr2));
                return;
            case 26:
                a();
                return;
            case 27:
                uy uyVar = (uy) this.b;
                uyVar.c2.setTranslationX(uyVar.b2.getAnimatedWidth() + hl.L(28.0f));
                return;
            case 28:
                ((mz) this.b).onBackPressed();
                return;
            default:
                vh4 vh4Var = (vh4) this.b;
                ((Context) vh4Var.b).unregisterReceiver((qz) vh4Var.c);
                return;
        }
    }
}
