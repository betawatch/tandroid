package ai;

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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class t7 extends FrameLayout {
    public final n7 E;
    public final ArrayList F;
    public final ArrayList G;
    public final v6 H;
    public float I;
    public final q7 a;
    public float b;
    public float c;
    public float d;
    public final r7 e;
    public float f;
    public final m7 h;
    public float n;
    public final kc r;
    public final Drawable s;
    public float v;
    public boolean w;
    public int x;
    public long y;

    public t7(kc kcVar, Context context) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new v6();
        d dVar = kcVar.y;
        this.r = kcVar;
        m7 m7Var = new m7(this, kcVar, getContext());
        this.h = m7Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, dVar), PorterDuff.Mode.MULTIPLY));
        r7 r7Var = new r7(this, context);
        this.e = r7Var;
        n7 n7Var = new n7(this, context);
        this.E = n7Var;
        n7Var.b(new o7(this, 0));
        q7 q7Var = new q7(this, kcVar, context);
        this.a = q7Var;
        n7Var.setAdapter(q7Var);
        r7Var.addView(n7Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        addView(m7Var, w7.x5.d(-1.0f, -1));
        addView(r7Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f7 = this.d;
        l7 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f7;
    }

    public final void b(int i10, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.y = j3;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            s7 s7Var = new s7();
            s7Var.a = storyItem;
            arrayList2.add(s7Var);
        }
        ArrayList E = MessagesController.getInstance(this.r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                l9 l9Var = (l9) E.get(i12);
                s7 s7Var2 = new s7();
                s7Var2.b = l9Var;
                arrayList2.add(s7Var2);
            }
        }
        m7 m7Var = this.h;
        ArrayList arrayList3 = m7Var.G;
        ArrayList arrayList4 = m7Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        m7Var.d();
        if (m7Var.getMeasuredHeight() > 0) {
            m7Var.c(i10, false, false);
        } else {
            m7Var.w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((m6) arrayList3.get(i13)).a(((m6) arrayList3.get(i13)).b);
        }
        n7 n7Var = this.E;
        n7Var.setAdapter(null);
        q7 q7Var = this.a;
        n7Var.setAdapter(q7Var);
        q7Var.g();
        n7Var.setCurrentItem(i10);
    }

    public m6 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public l7 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((l7) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                return (l7) arrayList.get(i10);
            }
            i10++;
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
        return ((s7) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        int i13 = this.r.b ? AndroidUtilities.statusBarHeight : 0;
        int size = View.MeasureSpec.getSize(i11);
        m7 m7Var = this.h;
        ((FrameLayout.LayoutParams) m7Var.getLayoutParams()).topMargin = i13;
        this.n = m7Var.getFinalHeight();
        this.b = AndroidUtilities.dp(20.0f) + i13;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i13) + this.n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.c = size - dp;
        while (true) {
            ArrayList arrayList = this.G;
            if (i12 >= arrayList.size()) {
                super.onMeasure(i10, i11);
                return;
            } else {
                ((l7) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        l7 currentPage;
        boolean z10 = this.x >= AndroidUtilities.dp(20.0f);
        boolean z11 = i10 >= AndroidUtilities.dp(20.0f);
        if (z11 != z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z11 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new a(this, 11));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.x = i10;
        if (i10 <= 0 || (currentPage = getCurrentPage()) == null) {
            return;
        }
        currentPage.r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
        FrameLayout frameLayout = currentPage.c;
        if (frameLayout.getTranslationY() != 0.0f) {
            currentPage.d.y((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.p1.w);
        }
    }

    public void setOffset(float f7) {
        int closestPosition;
        if (this.v == f7) {
            return;
        }
        this.v = f7;
        this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.v);
        float f10 = this.f;
        float clamp = Utilities.clamp(f7 / this.c, 1.0f, 0.0f);
        this.f = clamp;
        Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
        kc kcVar = this.r;
        f6 t10 = kcVar.t();
        hc hcVar = kcVar.s0;
        m7 m7Var = this.h;
        if (f10 == 1.0f && this.f != 1.0f) {
            if (kcVar.O0 != null) {
                MessageObject messageObject = (MessageObject) kcVar.O0.i.get(Utilities.clamp(m7Var.getClosestPosition(), kcVar.O0.i.size() - 1, 0));
                long b10 = e9.b(messageObject);
                ImageReceiver imageReceiver = hcVar.c;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    hcVar.c = null;
                }
                ac acVar = kcVar.n0;
                int i10 = messageObject.storyItem.id;
                kc kcVar2 = acVar.N0;
                int i11 = 0;
                while (true) {
                    if (i11 >= acVar.x0.size()) {
                        break;
                    }
                    if (b10 == e9.b(kcVar2.O0.f(((Integer) ((ArrayList) acVar.x0.get(i11)).get(0)).intValue()))) {
                        int size = kcVar2.R0 ? (acVar.x0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) acVar.x0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) acVar.x0.get(i11)).get(i12)).intValue() == i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (acVar.getCurrentPeerView() == null || acVar.getCurrentItem() != size) {
                            acVar.x(size, false);
                            f6 currentPeerView = acVar.getCurrentPeerView();
                            if (currentPeerView != null) {
                                na naVar = (na) currentPeerView.getParent();
                                naVar.a(true);
                                if (acVar.x0 != null) {
                                    f6 f6Var = naVar.a;
                                    long j3 = naVar.b;
                                    ArrayList arrayList = naVar.c;
                                    f6Var.B1 = j3;
                                    f6Var.z1 = arrayList;
                                    f6Var.o0(i12);
                                } else {
                                    naVar.a.U0(i12, naVar.b);
                                }
                            }
                        } else {
                            f6 currentPeerView2 = acVar.getCurrentPeerView();
                            if (currentPeerView2.J1 != i12) {
                                currentPeerView2.J1 = i12;
                                currentPeerView2.f1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (t10 != null && t10.J1 != (closestPosition = m7Var.getClosestPosition())) {
                t10.J1 = closestPosition;
                t10.f1(false);
            }
            m7Var.d.abortAnimation();
            ValueAnimator valueAnimator = m7Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                m7Var.M = null;
            }
            m7Var.c(m7Var.K, false, true);
        }
        if (t10 != null) {
            b5 b5Var = t10.c1;
            m7Var.a = b5Var.getTop();
            m7Var.b = b5Var.getMeasuredWidth();
            m7Var.c = b5Var.getMeasuredHeight();
        }
        m7Var.setProgressToOpen(this.f);
        n7 n7Var = this.E;
        if (n7Var.w0 && this.f != 1.0f) {
            n7Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            n7Var.w0 = false;
        }
    }
}
