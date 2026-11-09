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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout {
    public long D;
    public final n5 E;
    public final ArrayList F;
    public final ArrayList G;
    public final x4 H;
    public float I;
    public final q5 a;
    public float b;
    public float c;
    public float d;
    public final r5 e;
    public float f;
    public final m5 h;
    public float n;
    public final q9 r;
    public final Drawable s;
    public float w;
    public boolean x;
    public int y;

    public t5(Context context, q9 q9Var) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new x4();
        b bVar = q9Var.D;
        this.r = q9Var;
        m5 m5Var = new m5(getContext(), this, q9Var);
        this.h = m5Var;
        Drawable h = jg.g.h(context, R.drawable.sheet_shadow_round);
        this.s = h;
        org.telegram.ui.ActionBar.s6.x(this, h, org.telegram.ui.ActionBar.l6.h5, bVar, PorterDuff.Mode.MULTIPLY);
        r5 r5Var = new r5(this, context);
        this.e = r5Var;
        n5 n5Var = new n5(this, context);
        this.E = n5Var;
        n5Var.b(new o5(0, this));
        q5 q5Var = new q5(context, this, q9Var);
        this.a = q5Var;
        n5Var.setAdapter(q5Var);
        r5Var.addView(n5Var, ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(m5Var, ha.c(-1.0f, -1));
        addView(r5Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f10 = this.d;
        l5 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f10;
    }

    public final void b(int i7, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.D = j3;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            s5 s5Var = new s5();
            s5Var.a = storyItem;
            arrayList2.add(s5Var);
        }
        ArrayList F = qp.s1(this.r.h).h0.F(p10.i(p10.s0).e());
        if (F != null) {
            for (int i11 = 0; i11 < F.size(); i11++) {
                y6 y6Var = (y6) F.get(i11);
                s5 s5Var2 = new s5();
                s5Var2.b = y6Var;
                arrayList2.add(s5Var2);
            }
        }
        m5 m5Var = this.h;
        ArrayList arrayList3 = m5Var.G;
        ArrayList arrayList4 = m5Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        m5Var.d();
        if (m5Var.getMeasuredHeight() > 0) {
            m5Var.c(i7, false, false);
        } else {
            m5Var.x = i7;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            ((o4) arrayList3.get(i12)).a(((o4) arrayList3.get(i12)).b);
        }
        n5 n5Var = this.E;
        n5Var.setAdapter(null);
        q5 q5Var = this.a;
        n5Var.setAdapter(q5Var);
        q5Var.g();
        n5Var.setCurrentItem(i7);
    }

    public o4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public l5 getCurrentPage() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((l5) arrayList.get(i7)).getTag()).intValue() == this.E.getCurrentItem()) {
                return (l5) arrayList.get(i7);
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
        return ((s5) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = 0;
        int i12 = this.r.b ? org.telegram.messenger.g0.m : 0;
        int size = View.MeasureSpec.getSize(i10);
        m5 m5Var = this.h;
        ((FrameLayout.LayoutParams) m5Var.getLayoutParams()).topMargin = i12;
        this.n = m5Var.getFinalHeight();
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
                ((l5) arrayList.get(i11)).setListBottomPadding(this.d);
                i11++;
            }
        }
    }

    public void setKeyboardHeight(int i7) {
        l5 currentPage;
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
        q9 q9Var = this.r;
        j4 z9 = q9Var.z();
        n9 n9Var = q9Var.s0;
        m5 m5Var = this.h;
        if (f11 == 1.0f && this.f != 1.0f) {
            if (q9Var.N0 != null) {
                ij ijVar = (ij) q9Var.N0.i.get(Utilities.j(m5Var.getClosestPosition(), q9Var.N0.i.size() - 1, 0));
                long b10 = r6.b(ijVar);
                ImageReceiver imageReceiver = n9Var.c;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    n9Var.c = null;
                }
                g9 g9Var = q9Var.n0;
                int i10 = ijVar.l.id;
                q9 q9Var2 = g9Var.N0;
                int i11 = 0;
                while (true) {
                    if (i11 >= g9Var.x0.size()) {
                        break;
                    }
                    if (b10 == r6.b(q9Var2.N0.f(((Integer) ((ArrayList) g9Var.x0.get(i11)).get(0)).intValue()))) {
                        int size = q9Var2.Q0 ? (g9Var.x0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) g9Var.x0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) g9Var.x0.get(i11)).get(i12)).intValue() == i10) {
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
                                if (g9Var.x0 != null) {
                                    j4 j4Var = w7Var.a;
                                    long j3 = w7Var.b;
                                    ArrayList arrayList = w7Var.c;
                                    j4Var.k1 = j3;
                                    j4Var.i1 = arrayList;
                                    j4Var.m0(i12);
                                } else {
                                    w7Var.a.S0(i12, w7Var.b);
                                }
                            }
                        } else {
                            j4 currentPeerView2 = g9Var.getCurrentPeerView();
                            if (currentPeerView2.s1 != i12) {
                                currentPeerView2.s1 = i12;
                                currentPeerView2.d1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (z9 != null && z9.s1 != (closestPosition = m5Var.getClosestPosition())) {
                z9.s1 = closestPosition;
                z9.d1(false);
            }
            m5Var.d.abortAnimation();
            ValueAnimator valueAnimator = m5Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                m5Var.M = null;
            }
            m5Var.c(m5Var.K, false, true);
        }
        if (z9 != null) {
            j3 j3Var = z9.L0;
            m5Var.a = j3Var.getTop();
            m5Var.b = j3Var.getMeasuredWidth();
            m5Var.c = j3Var.getMeasuredHeight();
        }
        m5Var.setProgressToOpen(this.f);
        n5 n5Var = this.E;
        if (n5Var.w0 && this.f != 1.0f) {
            n5Var.onTouchEvent(org.telegram.messenger.g0.R());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            n5Var.w0 = false;
        }
    }
}
