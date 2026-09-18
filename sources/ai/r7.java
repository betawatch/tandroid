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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class r7 extends FrameLayout {
    public final l7 E;
    public final ArrayList F;
    public final ArrayList G;
    public final u6 H;
    public float I;
    public final o7 a;
    public float b;
    public float c;
    public float d;
    public final p7 e;
    public float f;
    public final k7 h;
    public float n;
    public final jc r;
    public final Drawable s;
    public float v;
    public boolean w;
    public int x;
    public long y;

    public r7(jc jcVar, Context context) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new u6();
        d dVar = jcVar.y;
        this.r = jcVar;
        k7 k7Var = new k7(this, jcVar, getContext());
        this.h = k7Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, dVar), PorterDuff.Mode.MULTIPLY));
        p7 p7Var = new p7(this, context);
        this.e = p7Var;
        l7 l7Var = new l7(this, context);
        this.E = l7Var;
        l7Var.b(new m7(this, 0));
        o7 o7Var = new o7(this, jcVar, context);
        this.a = o7Var;
        l7Var.setAdapter(o7Var);
        p7Var.addView(l7Var, w7.y5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(k7Var, w7.y5.c(-1.0f, -1));
        addView(p7Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f7 = this.d;
        j7 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f7;
    }

    public final void b(int i10, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.y = j3;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            q7 q7Var = new q7();
            q7Var.a = storyItem;
            arrayList2.add(q7Var);
        }
        ArrayList E = MessagesController.getInstance(this.r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                k9 k9Var = (k9) E.get(i12);
                q7 q7Var2 = new q7();
                q7Var2.b = k9Var;
                arrayList2.add(q7Var2);
            }
        }
        k7 k7Var = this.h;
        ArrayList arrayList3 = k7Var.G;
        ArrayList arrayList4 = k7Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        k7Var.d();
        if (k7Var.getMeasuredHeight() > 0) {
            k7Var.c(i10, false, false);
        } else {
            k7Var.w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((m6) arrayList3.get(i13)).a(((m6) arrayList3.get(i13)).b);
        }
        l7 l7Var = this.E;
        l7Var.setAdapter(null);
        o7 o7Var = this.a;
        l7Var.setAdapter(o7Var);
        o7Var.g();
        l7Var.setCurrentItem(i10);
    }

    public m6 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public j7 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((j7) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                return (j7) arrayList.get(i10);
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
        return ((q7) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        int i13 = this.r.b ? AndroidUtilities.statusBarHeight : 0;
        int size = View.MeasureSpec.getSize(i11);
        k7 k7Var = this.h;
        ((FrameLayout.LayoutParams) k7Var.getLayoutParams()).topMargin = i13;
        this.n = k7Var.getFinalHeight();
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
                ((j7) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        j7 currentPage;
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
            currentPage.d.w((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.p1.w);
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
        f6 t10 = jcVar.t();
        gc gcVar = jcVar.s0;
        k7 k7Var = this.h;
        if (f10 == 1.0f && this.f != 1.0f) {
            if (jcVar.O0 != null) {
                MessageObject messageObject = (MessageObject) jcVar.O0.i.get(Utilities.clamp(k7Var.getClosestPosition(), jcVar.O0.i.size() - 1, 0));
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
                            f6 currentPeerView = zbVar.getCurrentPeerView();
                            if (currentPeerView != null) {
                                ma maVar = (ma) currentPeerView.getParent();
                                maVar.a(true);
                                if (zbVar.x0 != null) {
                                    f6 f6Var = maVar.a;
                                    long j3 = maVar.b;
                                    ArrayList arrayList = maVar.c;
                                    f6Var.B1 = j3;
                                    f6Var.z1 = arrayList;
                                    f6Var.o0(i12);
                                } else {
                                    maVar.a.U0(i12, maVar.b);
                                }
                            }
                        } else {
                            f6 currentPeerView2 = zbVar.getCurrentPeerView();
                            if (currentPeerView2.J1 != i12) {
                                currentPeerView2.J1 = i12;
                                currentPeerView2.f1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (t10 != null && t10.J1 != (closestPosition = k7Var.getClosestPosition())) {
                t10.J1 = closestPosition;
                t10.f1(false);
            }
            k7Var.d.abortAnimation();
            ValueAnimator valueAnimator = k7Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                k7Var.M = null;
            }
            k7Var.c(k7Var.K, false, true);
        }
        if (t10 != null) {
            a5 a5Var = t10.c1;
            k7Var.a = a5Var.getTop();
            k7Var.b = a5Var.getMeasuredWidth();
            k7Var.c = a5Var.getMeasuredHeight();
        }
        k7Var.setProgressToOpen(this.f);
        l7 l7Var = this.E;
        if (l7Var.w0 && this.f != 1.0f) {
            l7Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            l7Var.w0 = false;
        }
    }
}
