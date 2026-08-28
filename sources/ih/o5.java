package ih;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o5 extends FrameLayout {
    public final i5 A;
    public final ArrayList B;
    public final ArrayList C;
    public final s4 D;
    public float E;
    public final l5 a;
    public float b;
    public float c;
    public float d;
    public final m5 e;
    public float f;
    public final h5 h;
    public float n;
    public final m9 r;
    public final Drawable s;
    public float v;
    public boolean w;
    public int x;
    public long y;

    public o5(Context context, m9 m9Var) {
        super(context);
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new s4();
        b bVar = m9Var.y;
        this.r = m9Var;
        h5 h5Var = new h5(getContext(), this, m9Var);
        this.h = h5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, bVar), PorterDuff.Mode.MULTIPLY));
        m5 m5Var = new m5(this, context);
        this.e = m5Var;
        i5 i5Var = new i5(this, context);
        this.A = i5Var;
        i5Var.b(new j5(0, this));
        l5 l5Var = new l5(context, this, m9Var);
        this.a = l5Var;
        i5Var.setAdapter(l5Var);
        m5Var.addView(i5Var, g7.e6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(h5Var, g7.e6.c(-1.0f, -1));
        addView(m5Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f10 = this.d;
        g5 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f10;
    }

    public final void b(int i9, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.B;
        arrayList2.clear();
        this.y = j10;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            n5 n5Var = new n5();
            n5Var.a = storyItem;
            arrayList2.add(n5Var);
        }
        ArrayList E = MessagesController.getInstance(this.r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i11 = 0; i11 < E.size(); i11++) {
                u6 u6Var = (u6) E.get(i11);
                n5 n5Var2 = new n5();
                n5Var2.b = u6Var;
                arrayList2.add(n5Var2);
            }
        }
        h5 h5Var = this.h;
        ArrayList arrayList3 = h5Var.C;
        ArrayList arrayList4 = h5Var.A;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        h5Var.d();
        if (h5Var.getMeasuredHeight() > 0) {
            h5Var.c(i9, false, false);
        } else {
            h5Var.w = i9;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            ((l4) arrayList3.get(i12)).a(((l4) arrayList3.get(i12)).b);
        }
        i5 i5Var = this.A;
        i5Var.setAdapter(null);
        l5 l5Var = this.a;
        i5Var.setAdapter(l5Var);
        l5Var.g();
        i5Var.setCurrentItem(i9);
    }

    public l4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public g5 getCurrentPage() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i9 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((g5) arrayList.get(i9)).getTag()).intValue() == this.A.getCurrentItem()) {
                return (g5) arrayList.get(i9);
            }
            i9++;
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.h.getClosestPosition();
        if (closestPosition < 0) {
            return null;
        }
        ArrayList arrayList = this.B;
        if (closestPosition >= arrayList.size()) {
            return null;
        }
        return ((n5) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11 = 0;
        int i12 = this.r.b ? AndroidUtilities.statusBarHeight : 0;
        int size = View.MeasureSpec.getSize(i10);
        h5 h5Var = this.h;
        ((FrameLayout.LayoutParams) h5Var.getLayoutParams()).topMargin = i12;
        this.n = h5Var.getFinalHeight();
        this.b = AndroidUtilities.dp(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i12) + this.n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.c = size - dp;
        while (true) {
            ArrayList arrayList = this.C;
            if (i11 >= arrayList.size()) {
                super.onMeasure(i9, i10);
                return;
            } else {
                ((g5) arrayList.get(i11)).setListBottomPadding(this.d);
                i11++;
            }
        }
    }

    public void setKeyboardHeight(int i9) {
        g5 currentPage;
        boolean z10 = this.x >= AndroidUtilities.dp(20.0f);
        boolean z11 = i9 >= AndroidUtilities.dp(20.0f);
        if (z11 != z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z11 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new bg.b(this, 21));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.x = i9;
        if (i9 <= 0 || (currentPage = getCurrentPage()) == null) {
            return;
        }
        currentPage.r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
        FrameLayout frameLayout = currentPage.c;
        if (frameLayout.getTranslationY() != 0.0f) {
            currentPage.d.l((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.q1.w);
        }
    }

    public void setOffset(float f10) {
        int closestPosition;
        if (this.v == f10) {
            return;
        }
        this.v = f10;
        this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.v);
        float f11 = this.f;
        float clamp = Utilities.clamp(f10 / this.c, 1.0f, 0.0f);
        this.f = clamp;
        Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
        m9 m9Var = this.r;
        i4 t10 = m9Var.t();
        j9 j9Var = m9Var.o0;
        h5 h5Var = this.h;
        if (f11 == 1.0f && this.f != 1.0f) {
            if (m9Var.K0 != null) {
                MessageObject messageObject = (MessageObject) m9Var.K0.i.get(Utilities.clamp(h5Var.getClosestPosition(), m9Var.K0.i.size() - 1, 0));
                long b10 = n6.b(messageObject);
                ImageReceiver imageReceiver = j9Var.c;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    j9Var.c = null;
                }
                c9 c9Var = m9Var.j0;
                int i9 = messageObject.storyItem.id;
                m9 m9Var2 = c9Var.J0;
                int i10 = 0;
                while (true) {
                    if (i10 >= c9Var.t0.size()) {
                        break;
                    }
                    if (b10 == n6.b(m9Var2.K0.f(((Integer) ((ArrayList) c9Var.t0.get(i10)).get(0)).intValue()))) {
                        int size = m9Var2.N0 ? (c9Var.t0.size() - 1) - i10 : i10;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= ((ArrayList) c9Var.t0.get(i10)).size()) {
                                i11 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) c9Var.t0.get(i10)).get(i11)).intValue() == i9) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                        if (c9Var.getCurrentPeerView() == null || c9Var.getCurrentItem() != size) {
                            c9Var.x(size, false);
                            i4 currentPeerView = c9Var.getCurrentPeerView();
                            if (currentPeerView != null) {
                                t7 t7Var = (t7) currentPeerView.getParent();
                                t7Var.a(true);
                                if (c9Var.t0 != null) {
                                    i4 i4Var = t7Var.a;
                                    long j10 = t7Var.b;
                                    ArrayList arrayList = t7Var.c;
                                    i4Var.x1 = j10;
                                    i4Var.v1 = arrayList;
                                    i4Var.o0(i11);
                                } else {
                                    t7Var.a.U0(i11, t7Var.b);
                                }
                            }
                        } else {
                            i4 currentPeerView2 = c9Var.getCurrentPeerView();
                            if (currentPeerView2.F1 != i11) {
                                currentPeerView2.F1 = i11;
                                currentPeerView2.f1(false);
                            }
                        }
                    } else {
                        i10++;
                    }
                }
            } else if (t10 != null && t10.F1 != (closestPosition = h5Var.getClosestPosition())) {
                t10.F1 = closestPosition;
                t10.f1(false);
            }
            h5Var.d.abortAnimation();
            ValueAnimator valueAnimator = h5Var.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                h5Var.I = null;
            }
            h5Var.c(h5Var.G, false, true);
        }
        if (t10 != null) {
            l3 l3Var = t10.Y0;
            h5Var.a = l3Var.getTop();
            h5Var.b = l3Var.getMeasuredWidth();
            h5Var.c = l3Var.getMeasuredHeight();
        }
        h5Var.setProgressToOpen(this.f);
        i5 i5Var = this.A;
        if (i5Var.s0 && this.f != 1.0f) {
            i5Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            i5Var.s0 = false;
        }
    }
}
