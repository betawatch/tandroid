package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k5 extends FrameLayout {
    public long E;
    public final e5 F;
    public final ArrayList G;
    public final ArrayList H;
    public final o4 I;
    public float J;
    public final h5 a;
    public float b;
    public float c;
    public float d;
    public final i5 e;
    public float f;
    public final d5 h;
    public float n;
    public final i9 r;
    public final Drawable s;
    public float w;
    public boolean x;
    public int y;

    public k5(Context context, i9 i9Var) {
        super(context);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new o4();
        b bVar = i9Var.E;
        this.r = i9Var;
        d5 d5Var = new d5(getContext(), this, i9Var);
        this.h = d5Var;
        Drawable g10 = i5.c.g(context, R.drawable.sheet_shadow_round);
        this.s = g10;
        org.telegram.ui.ActionBar.q6.x(this, g10, org.telegram.ui.ActionBar.j6.h5, bVar, PorterDuff.Mode.MULTIPLY);
        i5 i5Var = new i5(this, context);
        this.e = i5Var;
        e5 e5Var = new e5(this, context);
        this.F = e5Var;
        e5Var.b(new f5(0, this));
        h5 h5Var = new h5(context, this, i9Var);
        this.a = h5Var;
        e5Var.setAdapter(h5Var);
        i5Var.addView(e5Var, ja.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(d5Var, ja.c(-1.0f, -1));
        addView(i5Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f10 = this.d;
        c5 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f10;
    }

    public final void b(int i7, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        this.E = j3;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            j5 j5Var = new j5();
            j5Var.a = storyItem;
            arrayList2.add(j5Var);
        }
        ArrayList F = np.s1(this.r.h).i0.F(m10.i(m10.t0).e());
        if (F != null) {
            for (int i11 = 0; i11 < F.size(); i11++) {
                r6 r6Var = (r6) F.get(i11);
                j5 j5Var2 = new j5();
                j5Var2.b = r6Var;
                arrayList2.add(j5Var2);
            }
        }
        d5 d5Var = this.h;
        ArrayList arrayList3 = d5Var.H;
        ArrayList arrayList4 = d5Var.F;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        d5Var.d();
        if (d5Var.getMeasuredHeight() > 0) {
            d5Var.c(i7, false, false);
        } else {
            d5Var.x = i7;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            ((g4) arrayList3.get(i12)).a(((g4) arrayList3.get(i12)).b);
        }
        e5 e5Var = this.F;
        e5Var.setAdapter(null);
        h5 h5Var = this.a;
        e5Var.setAdapter(h5Var);
        h5Var.g();
        e5Var.setCurrentItem(i7);
    }

    public g4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public c5 getCurrentPage() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((c5) arrayList.get(i7)).getTag()).intValue() == this.F.getCurrentItem()) {
                return (c5) arrayList.get(i7);
            }
            i7++;
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.h.getClosestPosition();
        if (closestPosition < 0) {
            return null;
        }
        ArrayList arrayList = this.G;
        if (closestPosition >= arrayList.size()) {
            return null;
        }
        return ((j5) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = 0;
        int i12 = this.r.b ? org.telegram.messenger.g0.m : 0;
        int size = View.MeasureSpec.getSize(i10);
        d5 d5Var = this.h;
        ((FrameLayout.LayoutParams) d5Var.getLayoutParams()).topMargin = i12;
        this.n = d5Var.getFinalHeight();
        this.b = org.telegram.messenger.g0.L(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
        float L = (((org.telegram.messenger.g0.L(20.0f) + i12) + this.n) + org.telegram.messenger.g0.L(24.0f)) - org.telegram.messenger.g0.m;
        this.d = L;
        this.c = size - L;
        while (true) {
            ArrayList arrayList = this.H;
            if (i11 >= arrayList.size()) {
                super.onMeasure(i7, i10);
                return;
            } else {
                ((c5) arrayList.get(i11)).setListBottomPadding(this.d);
                i11++;
            }
        }
    }

    public void setKeyboardHeight(int i7) {
        c5 currentPage;
        boolean z10 = this.y >= org.telegram.messenger.g0.L(20.0f);
        boolean z11 = i7 >= org.telegram.messenger.g0.L(20.0f);
        if (z11 != z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, z11 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ah.h(this, 22));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.y = i7;
        if (i7 <= 0 || (currentPage = getCurrentPage()) == null) {
            return;
        }
        currentPage.r.dispatchTouchEvent(org.telegram.messenger.g0.R());
        FrameLayout frameLayout = currentPage.c;
        if (frameLayout.getTranslationY() != 0.0f) {
            currentPage.d.x((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.i1.w);
        }
    }

    public void setOffset(float f10) {
        int closestPosition;
        if (this.w == f10) {
            return;
        }
        this.w = f10;
        this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.w);
        float f11 = this.f;
        float i7 = Utilities.i(f10 / this.c, 1.0f, 0.0f);
        this.f = i7;
        Utilities.i(i7 / 0.5f, 1.0f, 0.0f);
        i9 i9Var = this.r;
        b4 z10 = i9Var.z();
        f9 f9Var = i9Var.t0;
        d5 d5Var = this.h;
        if (f11 == 1.0f && this.f != 1.0f) {
            if (i9Var.O0 != null) {
                gj gjVar = (gj) i9Var.O0.i.get(Utilities.j(d5Var.getClosestPosition(), i9Var.O0.i.size() - 1, 0));
                long b10 = k6.b(gjVar);
                ImageReceiver imageReceiver = f9Var.c;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    f9Var.c = null;
                }
                y8 y8Var = i9Var.o0;
                int i10 = gjVar.l.id;
                i9 i9Var2 = y8Var.O0;
                int i11 = 0;
                while (true) {
                    if (i11 >= y8Var.y0.size()) {
                        break;
                    }
                    if (b10 == k6.b(i9Var2.O0.f(((Integer) ((ArrayList) y8Var.y0.get(i11)).get(0)).intValue()))) {
                        int size = i9Var2.R0 ? (y8Var.y0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) y8Var.y0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) y8Var.y0.get(i11)).get(i12)).intValue() == i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (y8Var.getCurrentPeerView() == null || y8Var.getCurrentItem() != size) {
                            y8Var.x(size, false);
                            b4 currentPeerView = y8Var.getCurrentPeerView();
                            if (currentPeerView != null) {
                                p7 p7Var = (p7) currentPeerView.getParent();
                                p7Var.a(true);
                                if (y8Var.y0 != null) {
                                    b4 b4Var = p7Var.a;
                                    long j3 = p7Var.b;
                                    ArrayList arrayList = p7Var.c;
                                    b4Var.l1 = j3;
                                    b4Var.j1 = arrayList;
                                    b4Var.m0(i12);
                                } else {
                                    p7Var.a.S0(i12, p7Var.b);
                                }
                            }
                        } else {
                            b4 currentPeerView2 = y8Var.getCurrentPeerView();
                            if (currentPeerView2.t1 != i12) {
                                currentPeerView2.t1 = i12;
                                currentPeerView2.d1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (z10 != null && z10.t1 != (closestPosition = d5Var.getClosestPosition())) {
                z10.t1 = closestPosition;
                z10.d1(false);
            }
            d5Var.d.abortAnimation();
            ValueAnimator valueAnimator = d5Var.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                d5Var.N = null;
            }
            d5Var.c(d5Var.L, false, true);
        }
        if (z10 != null) {
            e3 e3Var = z10.M0;
            d5Var.a = e3Var.getTop();
            d5Var.b = e3Var.getMeasuredWidth();
            d5Var.c = e3Var.getMeasuredHeight();
        }
        d5Var.setProgressToOpen(this.f);
        e5 e5Var = this.F;
        if (e5Var.x0 && this.f != 1.0f) {
            e5Var.onTouchEvent(org.telegram.messenger.g0.R());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            e5Var.x0 = false;
        }
    }
}
