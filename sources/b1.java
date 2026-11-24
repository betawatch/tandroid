// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        vy vyVar = (vy) this.b;
        synchronized (vyVar.a) {
            if (vyVar.m) {
                return;
            }
            long j = vyVar.l - 1;
            vyVar.l = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                vyVar.c(new IllegalStateException());
            } else {
                vyVar.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        hx hxVar;
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
                                fc4.g(th, true);
                            }
                        }
                    } catch (InterruptedException unused2) {
                    }
                }
                break;
            case 1:
                p1 p1Var = (p1) this.b;
                qa6 qa6Var = p1Var.d;
                if (qa6Var != null) {
                    p1Var.h.F.m(qa6Var, true);
                    return;
                }
                return;
            case 2:
                ((wc7) this.b).run();
                return;
            case 3:
                up6 up6Var = (up6) this.b;
                Drawable drawable = ActionBarLayout.w1;
                gm.c3(up6Var);
                return;
            case 4:
                ((q7) this.b).setSelectedForDelete(false);
                return;
            case 5:
                w7 w7Var = (w7) this.b;
                w7Var.a0 = true;
                gm.j2(new mf2(w7Var, r5), 8.0f);
                return;
            case 6:
                ((eb) this.b).x.g3.O(true);
                return;
            case 7:
                ((gb) this.b).c();
                return;
            case 8:
                ((ad) this.b).j(true);
                return;
            case 9:
                ((wc) this.b).a();
                return;
            case 10:
                ce ceVar = (ce) this.b;
                he heVar = ceVar.d;
                int i7 = gm.q.x;
                heVar.M = i7;
                int min = Math.min(gm.O1() ? gm.N1() ? gm.L(446.0f) : gm.L(496.0f) : gm.L(356.0f), i7 - gm.L(56.0f));
                Rect rect = heVar.B0;
                int i8 = min + rect.left + rect.right;
                if (heVar.Y0) {
                    ViewGroup.LayoutParams layoutParams = ceVar.getLayoutParams();
                    if (layoutParams == null || layoutParams.width == i8) {
                        return;
                    }
                    layoutParams.width = i8;
                    ceVar.requestLayout();
                    return;
                }
                Window window = heVar.getWindow();
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                layoutParams2.copyFrom(window.getAttributes());
                layoutParams2.width = i8;
                try {
                    window.setAttributes(layoutParams2);
                    return;
                } catch (Throwable th2) {
                    fc4.g(th2, true);
                    return;
                }
            case 11:
                Animation animation = null;
                ne neVar = (ne) this.b;
                neVar.n1.setVisibility(0);
                neVar.p1.setAlpha(0.0f);
                int i9 = neVar.l1;
                if (i9 != 0 && i9 != -1) {
                    try {
                        animation = AnimationUtils.loadAnimation(neVar.getContext(), i9);
                    } catch (Resources.NotFoundException e) {
                        fc4.g(e, true);
                    }
                }
                ViewGroup viewGroup = neVar.o1;
                if (animation != null) {
                    viewGroup.startAnimation(animation);
                } else {
                    viewGroup.setAlpha(0.0f);
                    neVar.o1.animate().setDuration(300L).alpha(1.0f).start();
                }
                neVar.p1.animate().setDuration(300L).alpha(1.0f).setListener(new ke(neVar, (byte) 0)).start();
                return;
            case 12:
                hk hkVar = (hk) this.b;
                hkVar.requestFocus();
                gm.E3(hkVar);
                return;
            case 13:
                gm.E3((EditText) this.b);
                return;
            case 14:
                sea seaVar = (sea) this.b;
                if (seaVar.getAdapter() != null) {
                    seaVar.getAdapter().f();
                    return;
                }
                return;
            case 15:
                vm vmVar = (vm) this.b;
                SparseArray sparseArray = vm.r;
                vmVar.u();
                return;
            case 16:
                rm rmVar = (rm) this.b;
                ArrayList arrayList = new ArrayList(rmVar.c);
                rmVar.c.clear();
                cf7.Y(rmVar.e).a.c(new nm(rmVar, arrayList, (byte) 0));
                rmVar.d = null;
                return;
            case 17:
                ((tm) this.b).invalidate();
                return;
            case 18:
                ((zna) this.b).h();
                return;
            case 19:
                io ioVar = (io) this.b;
                CharSequence charSequence = ioVar.f;
                if (charSequence != null) {
                    ioVar.c(charSequence, ioVar.h, true);
                    ioVar.f = null;
                    ioVar.h = false;
                    return;
                }
                return;
            case 20:
                ((ct) this.b).presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 21:
                ((ev) this.b).a(2, false);
                return;
            case 22:
                o oVar = ((av) this.b).a;
                oVar.T0.e();
                Runnable runnable = oVar.b0;
                if (runnable != null) {
                    runnable.run();
                    oVar.b0 = null;
                    return;
                }
                return;
            case 23:
                o oVar2 = ((j) ((rv) this.b).b).y;
                View view = oVar2.P;
                if (view != null) {
                    oVar2.Q.addView(view, qoe.c(-1.0f, -1));
                    oVar2.Q.setVisibility(0);
                    return;
                }
                return;
            case 24:
                l11.u(((j) ((sv) this.b).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 25:
                ((cw) this.b).requestLayout();
                return;
            case 26:
                sx sxVar = (sx) this.b;
                sxVar.release();
                sxVar.L.p();
                return;
            case 27:
                ey eyVar = (ey) this.b;
                ArrayList arrayList2 = new ArrayList(eyVar.d);
                int size = arrayList2.size();
                o oVar3 = eyVar.N;
                int i10 = size + (oVar3.L == null ? (byte) 0 : (byte) 1);
                int[] iArr = new int[i10];
                int[] iArr2 = new int[i10];
                m mVar = oVar3.v0[0];
                if (mVar == null || (hxVar = mVar.b) == null) {
                    return;
                }
                Point point = gm.q;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i10) {
                    if (!eyVar.J) {
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
                        u69 a = eyVar.a(hxVar, ey.I(pageBlock));
                        View view2 = a.a;
                        i4 = i11;
                        i5 = i12;
                        eyVar.H(a.f, a, pageBlock, i3, arrayList2.size(), true);
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
                gm.c3(new wc7(eyVar, i12, iArr, iArr2));
                return;
            case 28:
                a();
                return;
            default:
                tz tzVar = (tz) this.b;
                tzVar.c2.setTranslationX(tzVar.b2.getAnimatedWidth() + gm.L(28.0f));
                return;
        }
    }
}
