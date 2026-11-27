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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class g4a extends FrameLayout {
    public long E;
    public final b4a F;
    public final ArrayList G;
    public final ArrayList H;
    public final n3a I;
    public float J;
    public final d4a a;
    public float b;
    public float c;
    public float d;
    public final e4a e;
    public float f;
    public final a4a h;
    public float n;
    public final lcb r;
    public final Drawable s;
    public float w;
    public boolean x;
    public int y;

    public g4a(lcb lcbVar, Context context) {
        super(context);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new n3a();
        x53 x53Var = lcbVar.E;
        this.r = lcbVar;
        a4a a4aVar = new a4a(this, lcbVar, getContext());
        this.h = a4aVar;
        Drawable e = c00.e(context, R.drawable.sheet_shadow_round);
        this.s = e;
        yob.x(this, e, aob.h5, x53Var, PorterDuff.Mode.MULTIPLY);
        e4a e4aVar = new e4a(this, context);
        this.e = e4aVar;
        b4a b4aVar = new b4a(this, context);
        this.F = b4aVar;
        b4aVar.b(new mv(this, (byte) 4));
        d4a d4aVar = new d4a(this, lcbVar, context);
        this.a = d4aVar;
        b4aVar.setAdapter(d4aVar);
        e4aVar.addView(b4aVar, tre.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(a4aVar, tre.c(-1.0f, -1));
        addView(e4aVar);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f = this.d;
        z3a currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f;
    }

    public final void b(int i, long j, ArrayList arrayList) {
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        this.E = j;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i2);
            f4a f4aVar = new f4a();
            f4aVar.a = storyItem;
            arrayList2.add(f4aVar);
        }
        ArrayList E = uc7.s1(this.r.h).e0.E(yac.h(yac.t0).e());
        if (E != null) {
            for (int i3 = 0; i3 < E.size(); i3++) {
                b6b b6bVar = (b6b) E.get(i3);
                f4a f4aVar2 = new f4a();
                f4aVar2.b = b6bVar;
                arrayList2.add(f4aVar2);
            }
        }
        a4a a4aVar = this.h;
        ArrayList arrayList3 = a4aVar.H;
        ArrayList arrayList4 = a4aVar.F;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        a4aVar.d();
        if (a4aVar.getMeasuredHeight() > 0) {
            a4aVar.c(i, false, false);
        } else {
            a4aVar.x = i;
        }
        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
            ((g3a) arrayList3.get(i4)).a(((g3a) arrayList3.get(i4)).b);
        }
        b4a b4aVar = this.F;
        b4aVar.setAdapter(null);
        d4a d4aVar = this.a;
        b4aVar.setAdapter(d4aVar);
        d4aVar.g();
        b4aVar.setCurrentItem(i);
    }

    public g3a getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public z3a getCurrentPage() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((z3a) arrayList.get(i)).getTag()).intValue() == this.F.getCurrentItem()) {
                return (z3a) arrayList.get(i);
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
            return ((f4a) arrayList.get(closestPosition)).a;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        int i4 = this.r.b ? hl.m : 0;
        int size = View.MeasureSpec.getSize(i2);
        a4a a4aVar = this.h;
        ((FrameLayout.LayoutParams) a4aVar.getLayoutParams()).topMargin = i4;
        this.n = a4aVar.getFinalHeight();
        this.b = hl.L(20.0f) + i4;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = hl.m;
        float L = (((hl.L(20.0f) + i4) + this.n) + hl.L(24.0f)) - hl.m;
        this.d = L;
        this.c = size - L;
        while (true) {
            ArrayList arrayList = this.H;
            if (i3 >= arrayList.size()) {
                super.onMeasure(i, i2);
                return;
            } else {
                ((z3a) arrayList.get(i3)).setListBottomPadding(this.d);
                i3++;
            }
        }
    }

    public void setKeyboardHeight(int i) {
        z3a currentPage;
        boolean z = this.y >= hl.L(20.0f);
        boolean z2 = i >= hl.L(20.0f);
        if (z2 != z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, z2 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new b49(this, (byte) 23));
            ofFloat.setInterpolator(hb.w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.y = i;
        if (i <= 0 || (currentPage = getCurrentPage()) == null) {
            return;
        }
        currentPage.r.dispatchTouchEvent(hl.R());
        FrameLayout frameLayout = currentPage.c;
        if (frameLayout.getTranslationY() != 0.0f) {
            currentPage.d.A((int) frameLayout.getTranslationY(), 250L, hb.w);
        }
    }

    public void setOffset(float f) {
        int closestPosition;
        if (this.w != f) {
            this.w = f;
            this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.w);
            float f2 = this.f;
            this.f = Utilities.i(f / this.c, 1.0f, 0.0f);
            lcb lcbVar = this.r;
            o68 w = lcbVar.w();
            icb icbVar = lcbVar.t0;
            a4a a4aVar = this.h;
            if (f2 == 1.0f && this.f != 1.0f) {
                if (lcbVar.O0 != null) {
                    r47 r47Var = (r47) lcbVar.O0.i.get(Utilities.j(a4aVar.getClosestPosition(), lcbVar.O0.i.size() - 1, 0));
                    long b = v5b.b(r47Var);
                    ImageReceiver imageReceiver = icbVar.c;
                    if (imageReceiver != null) {
                        imageReceiver.v0(true, true);
                        icbVar.c = null;
                    }
                    bcb bcbVar = lcbVar.o0;
                    int i = r47Var.l.id;
                    lcb lcbVar2 = bcbVar.O0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= bcbVar.y0.size()) {
                            break;
                        }
                        if (b == v5b.b(lcbVar2.O0.f(((Integer) ((ArrayList) bcbVar.y0.get(i2)).get(0)).intValue()))) {
                            int size = lcbVar2.R0 ? (bcbVar.y0.size() - 1) - i2 : i2;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= ((ArrayList) bcbVar.y0.get(i2)).size()) {
                                    i3 = 0;
                                    break;
                                } else if (((Integer) ((ArrayList) bcbVar.y0.get(i2)).get(i3)).intValue() == i) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (bcbVar.getCurrentPeerView() == null || bcbVar.getCurrentItem() != size) {
                                bcbVar.x(size, false);
                                o68 currentPeerView = bcbVar.getCurrentPeerView();
                                if (currentPeerView != null) {
                                    w6b w6bVar = (w6b) currentPeerView.getParent();
                                    w6bVar.a(true);
                                    ArrayList arrayList = bcbVar.y0;
                                    o68 o68Var = w6bVar.a;
                                    long j = w6bVar.b;
                                    if (arrayList != null) {
                                        ArrayList arrayList2 = w6bVar.c;
                                        o68Var.l1 = j;
                                        o68Var.j1 = arrayList2;
                                        o68Var.e0(i3);
                                    } else {
                                        o68Var.P0(i3, j);
                                    }
                                }
                            } else {
                                o68 currentPeerView2 = bcbVar.getCurrentPeerView();
                                if (currentPeerView2.t1 != i3) {
                                    currentPeerView2.t1 = i3;
                                    currentPeerView2.c1(false);
                                }
                            }
                        } else {
                            i2++;
                        }
                    }
                } else if (w != null && w.t1 != (closestPosition = a4aVar.getClosestPosition())) {
                    w.t1 = closestPosition;
                    w.c1(false);
                }
                a4aVar.d.abortAnimation();
                ValueAnimator valueAnimator = a4aVar.N;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    a4aVar.N = null;
                }
                a4aVar.c(a4aVar.L, false, true);
            }
            if (w != null) {
                u58 u58Var = w.M0;
                a4aVar.a = u58Var.getTop();
                a4aVar.b = u58Var.getMeasuredWidth();
                a4aVar.c = u58Var.getMeasuredHeight();
            }
            a4aVar.setProgressToOpen(this.f);
            b4a b4aVar = this.F;
            if (b4aVar.x0 && this.f != 1.0f) {
                b4aVar.onTouchEvent(hl.R());
            }
            setVisibility(this.f == 0.0f ? 4 : 0);
            if (this.f != 1.0f) {
                b4aVar.x0 = false;
            }
        }
    }
}
