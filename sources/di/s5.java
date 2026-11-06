package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class s5 extends FrameLayout {
    public long D;
    public final m5 E;
    public final ArrayList F;
    public final ArrayList G;
    public final w4 H;
    public float I;
    public final p5 a;
    public float b;
    public float c;
    public float d;
    public final q5 e;
    public float f;
    public final l5 h;
    public float n;
    public final p9 r;
    public final Drawable s;
    public float w;
    public boolean x;
    public int y;

    public s5(Context context, p9 p9Var) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new w4();
        b bVar = p9Var.D;
        this.r = p9Var;
        l5 l5Var = new l5(getContext(), this, p9Var);
        this.h = l5Var;
        Drawable h = jg.g.h(context, R.drawable.sheet_shadow_round);
        this.s = h;
        org.telegram.ui.ActionBar.r6.y(this, h, org.telegram.ui.ActionBar.k6.h5, bVar, PorterDuff.Mode.MULTIPLY);
        q5 q5Var = new q5(this, context);
        this.e = q5Var;
        m5 m5Var = new m5(this, context);
        this.E = m5Var;
        m5Var.b(new n5(0, this));
        p5 p5Var = new p5(context, this, p9Var);
        this.a = p5Var;
        m5Var.setAdapter(p5Var);
        q5Var.addView(m5Var, ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(l5Var, ha.c(-1.0f, -1));
        addView(q5Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f10 = this.d;
        k5 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f10;
    }

    public final void b(int i7, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.D = j3;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            r5 r5Var = new r5();
            r5Var.a = storyItem;
            arrayList2.add(r5Var);
        }
        ArrayList F = qp.s1(this.r.h).h0.F(p10.i(p10.s0).e());
        if (F != null) {
            for (int i11 = 0; i11 < F.size(); i11++) {
                x6 x6Var = (x6) F.get(i11);
                r5 r5Var2 = new r5();
                r5Var2.b = x6Var;
                arrayList2.add(r5Var2);
            }
        }
        l5 l5Var = this.h;
        ArrayList arrayList3 = l5Var.G;
        ArrayList arrayList4 = l5Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        l5Var.d();
        if (l5Var.getMeasuredHeight() > 0) {
            l5Var.c(i7, false, false);
        } else {
            l5Var.x = i7;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            ((n4) arrayList3.get(i12)).a(((n4) arrayList3.get(i12)).b);
        }
        m5 m5Var = this.E;
        m5Var.setAdapter(null);
        p5 p5Var = this.a;
        m5Var.setAdapter(p5Var);
        p5Var.g();
        m5Var.setCurrentItem(i7);
    }

    public n4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public k5 getCurrentPage() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((k5) arrayList.get(i7)).getTag()).intValue() == this.E.getCurrentItem()) {
                return (k5) arrayList.get(i7);
            }
            i7++;
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.h.getClosestPosition();
        if (closestPosition < 0) {
            return null;
        }
        ArrayList arrayList = this.F;
        if (closestPosition >= arrayList.size()) {
            return null;
        }
        return ((r5) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
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
            ArrayList arrayList = this.G;
            if (i11 >= arrayList.size()) {
                super.onMeasure(i7, i10);
                return;
            } else {
                ((k5) arrayList.get(i11)).setListBottomPadding(this.d);
                i11++;
            }
        }
    }

    public void setKeyboardHeight(int i7) {
        k5 currentPage;
        boolean z9 = this.y >= org.telegram.messenger.g0.L(20.0f);
        boolean z10 = i7 >= org.telegram.messenger.g0.L(20.0f);
        if (z10 != z9) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ah.h(this, 21));
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
            currentPage.d.y((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.i1.w);
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
        p9 p9Var = this.r;
        i4 z9 = p9Var.z();
        m9 m9Var = p9Var.s0;
        l5 l5Var = this.h;
        if (f11 == 1.0f && this.f != 1.0f) {
            if (p9Var.N0 != null) {
                ij ijVar = (ij) p9Var.N0.i.get(Utilities.j(l5Var.getClosestPosition(), p9Var.N0.i.size() - 1, 0));
                long b10 = q6.b(ijVar);
                ImageReceiver imageReceiver = m9Var.c;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    m9Var.c = null;
                }
                f9 f9Var = p9Var.n0;
                int i10 = ijVar.l.id;
                p9 p9Var2 = f9Var.N0;
                int i11 = 0;
                while (true) {
                    if (i11 >= f9Var.x0.size()) {
                        break;
                    }
                    if (b10 == q6.b(p9Var2.N0.f(((Integer) ((ArrayList) f9Var.x0.get(i11)).get(0)).intValue()))) {
                        int size = p9Var2.Q0 ? (f9Var.x0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) f9Var.x0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) f9Var.x0.get(i11)).get(i12)).intValue() == i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (f9Var.getCurrentPeerView() == null || f9Var.getCurrentItem() != size) {
                            f9Var.x(size, false);
                            i4 currentPeerView = f9Var.getCurrentPeerView();
                            if (currentPeerView != null) {
                                w7 w7Var = (w7) currentPeerView.getParent();
                                w7Var.a(true);
                                if (f9Var.x0 != null) {
                                    i4 i4Var = w7Var.a;
                                    long j3 = w7Var.b;
                                    ArrayList arrayList = w7Var.c;
                                    i4Var.k1 = j3;
                                    i4Var.i1 = arrayList;
                                    i4Var.m0(i12);
                                } else {
                                    w7Var.a.S0(i12, w7Var.b);
                                }
                            }
                        } else {
                            i4 currentPeerView2 = f9Var.getCurrentPeerView();
                            if (currentPeerView2.s1 != i12) {
                                currentPeerView2.s1 = i12;
                                currentPeerView2.d1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (z9 != null && z9.s1 != (closestPosition = l5Var.getClosestPosition())) {
                z9.s1 = closestPosition;
                z9.d1(false);
            }
            l5Var.d.abortAnimation();
            ValueAnimator valueAnimator = l5Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                l5Var.M = null;
            }
            l5Var.c(l5Var.K, false, true);
        }
        if (z9 != null) {
            j3 j3Var = z9.L0;
            l5Var.a = j3Var.getTop();
            l5Var.b = j3Var.getMeasuredWidth();
            l5Var.c = j3Var.getMeasuredHeight();
        }
        l5Var.setProgressToOpen(this.f);
        m5 m5Var = this.E;
        if (m5Var.w0 && this.f != 1.0f) {
            m5Var.onTouchEvent(org.telegram.messenger.g0.R());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            m5Var.w0 = false;
        }
    }
}
