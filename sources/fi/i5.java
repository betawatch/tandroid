package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class i5 extends FrameLayout {
    public long E;
    public final c5 F;
    public final ArrayList G;
    public final ArrayList H;
    public final m4 I;
    public float J;
    public final f5 a;
    public float b;
    public float c;
    public float d;
    public final g5 e;
    public float f;
    public final b5 h;
    public float n;
    public final f9 r;
    public final Drawable s;
    public float w;
    public boolean x;
    public int y;

    public i5(Context context, f9 f9Var) {
        super(context);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new m4();
        b bVar = f9Var.E;
        this.r = f9Var;
        b5 b5Var = new b5(getContext(), this, f9Var);
        this.h = b5Var;
        Drawable g10 = i5.c.g(context, R.drawable.sheet_shadow_round);
        this.s = g10;
        org.telegram.ui.ActionBar.u6.x(this, g10, org.telegram.ui.ActionBar.n6.h5, bVar, PorterDuff.Mode.MULTIPLY);
        g5 g5Var = new g5(this, context);
        this.e = g5Var;
        c5 c5Var = new c5(this, context);
        this.F = c5Var;
        c5Var.b(new d5(0, this));
        f5 f5Var = new f5(context, this, f9Var);
        this.a = f5Var;
        c5Var.setAdapter(f5Var);
        g5Var.addView(c5Var, ma.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(b5Var, ma.c(-1.0f, -1));
        addView(g5Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f10 = this.d;
        a5 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f10;
    }

    public final void b(int i7, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        this.E = j3;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            h5 h5Var = new h5();
            h5Var.a = storyItem;
            arrayList2.add(h5Var);
        }
        ArrayList F = mp.u1(this.r.h).i0.F(j10.i(j10.t0).e());
        if (F != null) {
            for (int i11 = 0; i11 < F.size(); i11++) {
                o6 o6Var = (o6) F.get(i11);
                h5 h5Var2 = new h5();
                h5Var2.b = o6Var;
                arrayList2.add(h5Var2);
            }
        }
        b5 b5Var = this.h;
        ArrayList arrayList3 = b5Var.H;
        ArrayList arrayList4 = b5Var.F;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        b5Var.d();
        if (b5Var.getMeasuredHeight() > 0) {
            b5Var.c(i7, false, false);
        } else {
            b5Var.x = i7;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            ((e4) arrayList3.get(i12)).a(((e4) arrayList3.get(i12)).b);
        }
        c5 c5Var = this.F;
        c5Var.setAdapter(null);
        f5 f5Var = this.a;
        c5Var.setAdapter(f5Var);
        f5Var.g();
        c5Var.setCurrentItem(i7);
    }

    public e4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public a5 getCurrentPage() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((a5) arrayList.get(i7)).getTag()).intValue() == this.F.getCurrentItem()) {
                return (a5) arrayList.get(i7);
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
        return ((h5) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = 0;
        int i12 = this.r.b ? org.telegram.messenger.g0.m : 0;
        int size = View.MeasureSpec.getSize(i10);
        b5 b5Var = this.h;
        ((FrameLayout.LayoutParams) b5Var.getLayoutParams()).topMargin = i12;
        this.n = b5Var.getFinalHeight();
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
                ((a5) arrayList.get(i11)).setListBottomPadding(this.d);
                i11++;
            }
        }
    }

    public void setKeyboardHeight(int i7) {
        a5 currentPage;
        boolean z10 = this.y >= org.telegram.messenger.g0.L(20.0f);
        boolean z11 = i7 >= org.telegram.messenger.g0.L(20.0f);
        if (z11 != z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, z11 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ah.g(this, 22));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.w);
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
            currentPage.d.z((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.j1.w);
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
        f9 f9Var = this.r;
        z3 z10 = f9Var.z();
        c9 c9Var = f9Var.t0;
        b5 b5Var = this.h;
        if (f11 == 1.0f && this.f != 1.0f) {
            if (f9Var.O0 != null) {
                fj fjVar = (fj) f9Var.O0.i.get(Utilities.j(b5Var.getClosestPosition(), f9Var.O0.i.size() - 1, 0));
                long b10 = h6.b(fjVar);
                ImageReceiver imageReceiver = c9Var.c;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    c9Var.c = null;
                }
                v8 v8Var = f9Var.o0;
                int i10 = fjVar.l.id;
                f9 f9Var2 = v8Var.O0;
                int i11 = 0;
                while (true) {
                    if (i11 >= v8Var.y0.size()) {
                        break;
                    }
                    if (b10 == h6.b(f9Var2.O0.f(((Integer) ((ArrayList) v8Var.y0.get(i11)).get(0)).intValue()))) {
                        int size = f9Var2.R0 ? (v8Var.y0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) v8Var.y0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) v8Var.y0.get(i11)).get(i12)).intValue() == i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (v8Var.getCurrentPeerView() == null || v8Var.getCurrentItem() != size) {
                            v8Var.x(size, false);
                            z3 currentPeerView = v8Var.getCurrentPeerView();
                            if (currentPeerView != null) {
                                m7 m7Var = (m7) currentPeerView.getParent();
                                m7Var.a(true);
                                if (v8Var.y0 != null) {
                                    z3 z3Var = m7Var.a;
                                    long j3 = m7Var.b;
                                    ArrayList arrayList = m7Var.c;
                                    z3Var.l1 = j3;
                                    z3Var.j1 = arrayList;
                                    z3Var.m0(i12);
                                } else {
                                    m7Var.a.S0(i12, m7Var.b);
                                }
                            }
                        } else {
                            z3 currentPeerView2 = v8Var.getCurrentPeerView();
                            if (currentPeerView2.t1 != i12) {
                                currentPeerView2.t1 = i12;
                                currentPeerView2.d1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (z10 != null && z10.t1 != (closestPosition = b5Var.getClosestPosition())) {
                z10.t1 = closestPosition;
                z10.d1(false);
            }
            b5Var.d.abortAnimation();
            ValueAnimator valueAnimator = b5Var.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                b5Var.N = null;
            }
            b5Var.c(b5Var.L, false, true);
        }
        if (z10 != null) {
            c3 c3Var = z10.M0;
            b5Var.a = c3Var.getTop();
            b5Var.b = c3Var.getMeasuredWidth();
            b5Var.c = c3Var.getMeasuredHeight();
        }
        b5Var.setProgressToOpen(this.f);
        c5 c5Var = this.F;
        if (c5Var.x0 && this.f != 1.0f) {
            c5Var.onTouchEvent(org.telegram.messenger.g0.R());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            c5Var.x0 = false;
        }
    }
}
