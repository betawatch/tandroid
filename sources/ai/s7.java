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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class s7 extends FrameLayout {
    public final m7 E;
    public final ArrayList F;
    public final ArrayList G;
    public final u6 H;
    public float I;
    public final p7 a;
    public float b;
    public float c;
    public float d;
    public final q7 e;
    public float f;
    public final l7 h;
    public float n;
    public final jc r;
    public final Drawable s;
    public float v;
    public boolean w;
    public int x;
    public long y;

    public s7(jc jcVar, Context context) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new u6();
        d dVar = jcVar.y;
        this.r = jcVar;
        l7 l7Var = new l7(this, jcVar, getContext());
        this.h = l7Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, dVar), PorterDuff.Mode.MULTIPLY));
        q7 q7Var = new q7(this, context);
        this.e = q7Var;
        m7 m7Var = new m7(this, context);
        this.E = m7Var;
        m7Var.b(new n7(this, 0));
        p7 p7Var = new p7(this, jcVar, context);
        this.a = p7Var;
        m7Var.setAdapter(p7Var);
        q7Var.addView(m7Var, w7.y5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(l7Var, w7.y5.c(-1.0f, -1));
        addView(q7Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f7 = this.d;
        k7 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f7;
    }

    public final void b(int i10, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.y = j3;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            r7 r7Var = new r7();
            r7Var.a = storyItem;
            arrayList2.add(r7Var);
        }
        ArrayList E = MessagesController.getInstance(this.r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                k9 k9Var = (k9) E.get(i12);
                r7 r7Var2 = new r7();
                r7Var2.b = k9Var;
                arrayList2.add(r7Var2);
            }
        }
        l7 l7Var = this.h;
        ArrayList arrayList3 = l7Var.G;
        ArrayList arrayList4 = l7Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        l7Var.d();
        if (l7Var.getMeasuredHeight() > 0) {
            l7Var.c(i10, false, false);
        } else {
            l7Var.w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((l6) arrayList3.get(i13)).a(((l6) arrayList3.get(i13)).b);
        }
        m7 m7Var = this.E;
        m7Var.setAdapter(null);
        p7 p7Var = this.a;
        m7Var.setAdapter(p7Var);
        p7Var.g();
        m7Var.setCurrentItem(i10);
    }

    public l6 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public k7 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((k7) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                return (k7) arrayList.get(i10);
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
        return ((r7) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        int i13 = this.r.b ? AndroidUtilities.statusBarHeight : 0;
        int size = View.MeasureSpec.getSize(i11);
        l7 l7Var = this.h;
        ((FrameLayout.LayoutParams) l7Var.getLayoutParams()).topMargin = i13;
        this.n = l7Var.getFinalHeight();
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
                ((k7) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        k7 currentPage;
        boolean z10 = this.x >= AndroidUtilities.dp(20.0f);
        boolean z11 = i10 >= AndroidUtilities.dp(20.0f);
        if (z11 != z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z11 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new a(this, 11));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.w);
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
            currentPage.d.w((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.o1.w);
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
        jc jcVar = this.r;
        e6 t10 = jcVar.t();
        gc gcVar = jcVar.s0;
        l7 l7Var = this.h;
        if (f10 == 1.0f && this.f != 1.0f) {
            if (jcVar.O0 != null) {
                MessageObject messageObject = (MessageObject) jcVar.O0.i.get(Utilities.clamp(l7Var.getClosestPosition(), jcVar.O0.i.size() - 1, 0));
                long b10 = d9.b(messageObject);
                ImageReceiver imageReceiver = gcVar.c;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    gcVar.c = null;
                }
                zb zbVar = jcVar.n0;
                int i10 = messageObject.storyItem.id;
                jc jcVar2 = zbVar.N0;
                int i11 = 0;
                while (true) {
                    if (i11 >= zbVar.x0.size()) {
                        break;
                    }
                    if (b10 == d9.b(jcVar2.O0.f(((Integer) ((ArrayList) zbVar.x0.get(i11)).get(0)).intValue()))) {
                        int size = jcVar2.R0 ? (zbVar.x0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) zbVar.x0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) zbVar.x0.get(i11)).get(i12)).intValue() == i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (zbVar.getCurrentPeerView() == null || zbVar.getCurrentItem() != size) {
                            zbVar.x(size, false);
                            e6 currentPeerView = zbVar.getCurrentPeerView();
                            if (currentPeerView != null) {
                                ma maVar = (ma) currentPeerView.getParent();
                                maVar.a(true);
                                if (zbVar.x0 != null) {
                                    e6 e6Var = maVar.a;
                                    long j3 = maVar.b;
                                    ArrayList arrayList = maVar.c;
                                    e6Var.B1 = j3;
                                    e6Var.z1 = arrayList;
                                    e6Var.o0(i12);
                                } else {
                                    maVar.a.U0(i12, maVar.b);
                                }
                            }
                        } else {
                            e6 currentPeerView2 = zbVar.getCurrentPeerView();
                            if (currentPeerView2.J1 != i12) {
                                currentPeerView2.J1 = i12;
                                currentPeerView2.f1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (t10 != null && t10.J1 != (closestPosition = l7Var.getClosestPosition())) {
                t10.J1 = closestPosition;
                t10.f1(false);
            }
            l7Var.d.abortAnimation();
            ValueAnimator valueAnimator = l7Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                l7Var.M = null;
            }
            l7Var.c(l7Var.K, false, true);
        }
        if (t10 != null) {
            a5 a5Var = t10.c1;
            l7Var.a = a5Var.getTop();
            l7Var.b = a5Var.getMeasuredWidth();
            l7Var.c = a5Var.getMeasuredHeight();
        }
        l7Var.setProgressToOpen(this.f);
        m7 m7Var = this.E;
        if (m7Var.w0 && this.f != 1.0f) {
            m7Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            m7Var.w0 = false;
        }
    }
}
