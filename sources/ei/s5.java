package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s5 extends FrameLayout {
    public long E;
    public final m5 F;
    public final ArrayList G;
    public final ArrayList H;
    public final w4 I;
    public float J;
    public final p5 a;
    public float b;
    public float c;
    public float d;
    public final q5 e;
    public float f;
    public final l5 h;
    public float n;
    public final r9 r;
    public final Drawable s;
    public float w;
    public boolean x;
    public int y;

    public s5(Context context, r9 r9Var) {
        super(context);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new w4();
        b bVar = r9Var.E;
        this.r = r9Var;
        l5 l5Var = new l5(getContext(), this, r9Var);
        this.h = l5Var;
        Drawable g7 = k2.p1.g(context, R.drawable.sheet_shadow_round);
        this.s = g7;
        org.telegram.ui.ActionBar.r6.y(this, g7, org.telegram.ui.ActionBar.k6.h5, bVar, PorterDuff.Mode.MULTIPLY);
        q5 q5Var = new q5(this, context);
        this.e = q5Var;
        m5 m5Var = new m5(this, context);
        this.F = m5Var;
        m5Var.b(new n5(0, this));
        p5 p5Var = new p5(context, this, r9Var);
        this.a = p5Var;
        m5Var.setAdapter(p5Var);
        q5Var.addView(m5Var, mf.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(l5Var, mf.c(-1.0f, -1));
        addView(q5Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f10 = this.d;
        k5 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f10;
    }

    public final void b(int i3, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        this.E = j10;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            r5 r5Var = new r5();
            r5Var.a = storyItem;
            arrayList2.add(r5Var);
        }
        ArrayList F = hp.s1(this.r.h).i0.F(h10.i(h10.t0).e());
        if (F != null) {
            for (int i11 = 0; i11 < F.size(); i11++) {
                y6 y6Var = (y6) F.get(i11);
                r5 r5Var2 = new r5();
                r5Var2.b = y6Var;
                arrayList2.add(r5Var2);
            }
        }
        l5 l5Var = this.h;
        ArrayList arrayList3 = l5Var.H;
        ArrayList arrayList4 = l5Var.F;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        l5Var.d();
        if (l5Var.getMeasuredHeight() > 0) {
            l5Var.c(i3, false, false);
        } else {
            l5Var.x = i3;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            ((o4) arrayList3.get(i12)).a(((o4) arrayList3.get(i12)).b);
        }
        m5 m5Var = this.F;
        m5Var.setAdapter(null);
        p5 p5Var = this.a;
        m5Var.setAdapter(p5Var);
        p5Var.g();
        m5Var.setCurrentItem(i3);
    }

    public o4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public k5 getCurrentPage() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i3 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((k5) arrayList.get(i3)).getTag()).intValue() == this.F.getCurrentItem()) {
                return (k5) arrayList.get(i3);
            }
            i3++;
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
        return ((r5) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11 = 0;
        int i12 = this.r.b ? org.telegram.messenger.g0.m : 0;
        int size = View.MeasureSpec.getSize(i10);
        l5 l5Var = this.h;
        ((FrameLayout.LayoutParams) l5Var.getLayoutParams()).topMargin = i12;
        this.n = l5Var.getFinalHeight();
        this.b = org.telegram.messenger.g0.L(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
        float L = (((org.telegram.messenger.g0.L(20.0f) + i12) + this.n) + org.telegram.messenger.g0.L(24.0f)) - org.telegram.messenger.g0.m;
        this.d = L;
        this.c = size - L;
        while (true) {
            ArrayList arrayList = this.H;
            if (i11 >= arrayList.size()) {
                super.onMeasure(i3, i10);
                return;
            } else {
                ((k5) arrayList.get(i11)).setListBottomPadding(this.d);
                i11++;
            }
        }
    }

    public void setKeyboardHeight(int i3) {
        k5 currentPage;
        boolean z10 = this.y >= org.telegram.messenger.g0.L(20.0f);
        boolean z11 = i3 >= org.telegram.messenger.g0.L(20.0f);
        if (z11 != z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, z11 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new bh.f(this, 22));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.y = i3;
        if (i3 <= 0 || (currentPage = getCurrentPage()) == null) {
            return;
        }
        currentPage.r.dispatchTouchEvent(org.telegram.messenger.g0.R());
        FrameLayout frameLayout = currentPage.c;
        if (frameLayout.getTranslationY() != 0.0f) {
            currentPage.d.z((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.h1.w);
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
        float i3 = Utilities.i(f10 / this.c, 1.0f, 0.0f);
        this.f = i3;
        Utilities.i(i3 / 0.5f, 1.0f, 0.0f);
        r9 r9Var = this.r;
        j4 H = r9Var.H();
        o9 o9Var = r9Var.t0;
        l5 l5Var = this.h;
        if (f11 == 1.0f && this.f != 1.0f) {
            if (r9Var.P0 != null) {
                zi ziVar = (zi) r9Var.P0.i.get(Utilities.j(l5Var.getClosestPosition(), r9Var.P0.i.size() - 1, 0));
                long b10 = r6.b(ziVar);
                ImageReceiver imageReceiver = o9Var.c;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    o9Var.c = null;
                }
                g9 g9Var = r9Var.o0;
                int i10 = ziVar.l.id;
                r9 r9Var2 = g9Var.O0;
                int i11 = 0;
                while (true) {
                    if (i11 >= g9Var.y0.size()) {
                        break;
                    }
                    if (b10 == r6.b(r9Var2.P0.f(((Integer) ((ArrayList) g9Var.y0.get(i11)).get(0)).intValue()))) {
                        int size = r9Var2.S0 ? (g9Var.y0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) g9Var.y0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) g9Var.y0.get(i11)).get(i12)).intValue() == i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (g9Var.getCurrentPeerView() == null || g9Var.getCurrentItem() != size) {
                            g9Var.x(size, false);
                            j4 currentPeerView = g9Var.getCurrentPeerView();
                            if (currentPeerView != null) {
                                w7 w7Var = (w7) currentPeerView.getParent();
                                w7Var.a(true);
                                if (g9Var.y0 != null) {
                                    j4 j4Var = w7Var.a;
                                    long j10 = w7Var.b;
                                    ArrayList arrayList = w7Var.c;
                                    j4Var.l1 = j10;
                                    j4Var.j1 = arrayList;
                                    j4Var.m0(i12);
                                } else {
                                    w7Var.a.S0(i12, w7Var.b);
                                }
                            }
                        } else {
                            j4 currentPeerView2 = g9Var.getCurrentPeerView();
                            if (currentPeerView2.t1 != i12) {
                                currentPeerView2.t1 = i12;
                                currentPeerView2.d1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (H != null && H.t1 != (closestPosition = l5Var.getClosestPosition())) {
                H.t1 = closestPosition;
                H.d1(false);
            }
            l5Var.d.abortAnimation();
            ValueAnimator valueAnimator = l5Var.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                l5Var.N = null;
            }
            l5Var.c(l5Var.L, false, true);
        }
        if (H != null) {
            m3 m3Var = H.M0;
            l5Var.a = m3Var.getTop();
            l5Var.b = m3Var.getMeasuredWidth();
            l5Var.c = m3Var.getMeasuredHeight();
        }
        l5Var.setProgressToOpen(this.f);
        m5 m5Var = this.F;
        if (m5Var.x0 && this.f != 1.0f) {
            m5Var.onTouchEvent(org.telegram.messenger.g0.R());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            m5Var.x0 = false;
        }
    }
}
