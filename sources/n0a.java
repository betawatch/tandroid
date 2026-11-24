// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class n0a extends FrameLayout {
    public long E;
    public final i0a F;
    public final ArrayList G;
    public final ArrayList H;
    public final tz9 I;
    public float J;
    public final k0a a;
    public float b;
    public float c;
    public float d;
    public final l0a e;
    public float f;
    public final h0a h;
    public float n;
    public final m8b r;
    public final Drawable s;
    public float w;
    public boolean x;
    public int y;

    public n0a(m8b m8bVar, Context context) {
        super(context);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new tz9();
        f53 f53Var = m8bVar.E;
        this.r = m8bVar;
        h0a h0aVar = new h0a(this, m8bVar, getContext());
        this.h = h0aVar;
        Drawable d = b00.d(context, R.drawable.sheet_shadow_round);
        this.s = d;
        zkb.x(this, d, bkb.g5, f53Var, PorterDuff.Mode.MULTIPLY);
        l0a l0aVar = new l0a(this, context);
        this.e = l0aVar;
        i0a i0aVar = new i0a(this, context);
        this.F = i0aVar;
        i0aVar.b(new lv(this, (byte) 4));
        k0a k0aVar = new k0a(this, m8bVar, context);
        this.a = k0aVar;
        i0aVar.setAdapter(k0aVar);
        l0aVar.addView(i0aVar, nme.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(h0aVar, nme.c(-1.0f, -1));
        addView(l0aVar);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f = this.d;
        g0a currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f;
    }

    public final void b(int i, long j, ArrayList arrayList) {
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        this.E = j;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i2);
            m0a m0aVar = new m0a();
            m0aVar.a = storyItem;
            arrayList2.add(m0aVar);
        }
        ArrayList E = na7.q1(this.r.h).e0.E(y6c.h(y6c.t0).e());
        if (E != null) {
            for (int i3 = 0; i3 < E.size(); i3++) {
                f2b f2bVar = (f2b) E.get(i3);
                m0a m0aVar2 = new m0a();
                m0aVar2.b = f2bVar;
                arrayList2.add(m0aVar2);
            }
        }
        h0a h0aVar = this.h;
        ArrayList arrayList3 = h0aVar.H;
        ArrayList arrayList4 = h0aVar.F;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        h0aVar.d();
        if (h0aVar.getMeasuredHeight() > 0) {
            h0aVar.c(i, false, false);
        } else {
            h0aVar.x = i;
        }
        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
            ((mz9) arrayList3.get(i4)).a(((mz9) arrayList3.get(i4)).b);
        }
        i0a i0aVar = this.F;
        i0aVar.setAdapter(null);
        k0a k0aVar = this.a;
        i0aVar.setAdapter(k0aVar);
        k0aVar.g();
        i0aVar.setCurrentItem(i);
    }

    public mz9 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public g0a getCurrentPage() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((g0a) arrayList.get(i)).getTag()).intValue() == this.F.getCurrentItem()) {
                return (g0a) arrayList.get(i);
            }
            i++;
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.h.getClosestPosition();
        if (closestPosition < 0) {
            return null;
        }
        ArrayList arrayList = this.G;
        if (closestPosition < arrayList.size()) {
            return ((m0a) arrayList.get(closestPosition)).a;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        int i4 = this.r.b ? gl.m : 0;
        int size = View.MeasureSpec.getSize(i2);
        h0a h0aVar = this.h;
        ((FrameLayout.LayoutParams) h0aVar.getLayoutParams()).topMargin = i4;
        this.n = h0aVar.getFinalHeight();
        this.b = gl.L(20.0f) + i4;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = gl.m;
        float L = (((gl.L(20.0f) + i4) + this.n) + gl.L(24.0f)) - gl.m;
        this.d = L;
        this.c = size - L;
        while (true) {
            ArrayList arrayList = this.H;
            if (i3 >= arrayList.size()) {
                super.onMeasure(i, i2);
                return;
            } else {
                ((g0a) arrayList.get(i3)).setListBottomPadding(this.d);
                i3++;
            }
        }
    }

    public void setKeyboardHeight(int i) {
        g0a currentPage;
        boolean z = this.y >= gl.L(20.0f);
        boolean z2 = i >= gl.L(20.0f);
        if (z2 != z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, z2 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new x89(this, (byte) 21));
            ofFloat.setInterpolator(gb.w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.y = i;
        if (i <= 0 || (currentPage = getCurrentPage()) == null) {
            return;
        }
        currentPage.r.dispatchTouchEvent(gl.R());
        FrameLayout frameLayout = currentPage.c;
        if (frameLayout.getTranslationY() != 0.0f) {
            currentPage.d.z((int) frameLayout.getTranslationY(), 250L, gb.w);
        }
    }

    public void setOffset(float f) {
        int closestPosition;
        if (this.w != f) {
            this.w = f;
            this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.w);
            float f2 = this.f;
            this.f = Utilities.i(f / this.c, 1.0f, 0.0f);
            m8b m8bVar = this.r;
            y28 w = m8bVar.w();
            j8b j8bVar = m8bVar.t0;
            h0a h0aVar = this.h;
            if (f2 == 1.0f && this.f != 1.0f) {
                if (m8bVar.O0 != null) {
                    k27 k27Var = (k27) m8bVar.O0.i.get(Utilities.j(h0aVar.getClosestPosition(), m8bVar.O0.i.size() - 1, 0));
                    long b = y1b.b(k27Var);
                    ImageReceiver imageReceiver = j8bVar.c;
                    if (imageReceiver != null) {
                        imageReceiver.v0(true, true);
                        j8bVar.c = null;
                    }
                    c8b c8bVar = m8bVar.o0;
                    int i = k27Var.l.id;
                    m8b m8bVar2 = c8bVar.O0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= c8bVar.y0.size()) {
                            break;
                        }
                        if (b == y1b.b(m8bVar2.O0.f(((Integer) ((ArrayList) c8bVar.y0.get(i2)).get(0)).intValue()))) {
                            int size = m8bVar2.R0 ? (c8bVar.y0.size() - 1) - i2 : i2;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= ((ArrayList) c8bVar.y0.get(i2)).size()) {
                                    i3 = 0;
                                    break;
                                } else if (((Integer) ((ArrayList) c8bVar.y0.get(i2)).get(i3)).intValue() == i) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (c8bVar.getCurrentPeerView() == null || c8bVar.getCurrentItem() != size) {
                                c8bVar.x(size, false);
                                y28 currentPeerView = c8bVar.getCurrentPeerView();
                                if (currentPeerView != null) {
                                    a3b a3bVar = (a3b) currentPeerView.getParent();
                                    a3bVar.a(true);
                                    ArrayList arrayList = c8bVar.y0;
                                    y28 y28Var = a3bVar.a;
                                    long j = a3bVar.b;
                                    if (arrayList != null) {
                                        ArrayList arrayList2 = a3bVar.c;
                                        y28Var.r1 = j;
                                        y28Var.p1 = arrayList2;
                                        y28Var.e0(i3);
                                    } else {
                                        y28Var.P0(i3, j);
                                    }
                                }
                            } else {
                                y28 currentPeerView2 = c8bVar.getCurrentPeerView();
                                if (currentPeerView2.z1 != i3) {
                                    currentPeerView2.z1 = i3;
                                    currentPeerView2.c1(false);
                                }
                            }
                        } else {
                            i2++;
                        }
                    }
                } else if (w != null && w.z1 != (closestPosition = h0aVar.getClosestPosition())) {
                    w.z1 = closestPosition;
                    w.c1(false);
                }
                h0aVar.d.abortAnimation();
                ValueAnimator valueAnimator = h0aVar.N;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    h0aVar.N = null;
                }
                h0aVar.c(h0aVar.L, false, true);
            }
            if (w != null) {
                d28 d28Var = w.S0;
                h0aVar.a = d28Var.getTop();
                h0aVar.b = d28Var.getMeasuredWidth();
                h0aVar.c = d28Var.getMeasuredHeight();
            }
            h0aVar.setProgressToOpen(this.f);
            i0a i0aVar = this.F;
            if (i0aVar.x0 && this.f != 1.0f) {
                i0aVar.onTouchEvent(gl.R());
            }
            setVisibility(this.f == 0.0f ? 4 : 0);
            if (this.f != 1.0f) {
                i0aVar.x0 = false;
            }
        }
    }
}
