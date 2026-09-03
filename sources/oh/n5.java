package oh;

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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class n5 extends FrameLayout {
    public final h5 B;
    public final ArrayList C;
    public final ArrayList D;
    public final q4 E;
    public float F;
    public final k5 a;
    public float b;
    public float c;
    public float d;
    public final l5 e;
    public float f;
    public final g5 h;
    public float n;
    public final i9 r;
    public final Drawable s;
    public float v;
    public boolean w;
    public int x;
    public long y;

    public n5(Context context, i9 i9Var) {
        super(context);
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new q4();
        b bVar = i9Var.y;
        this.r = i9Var;
        g5 g5Var = new g5(getContext(), this, i9Var);
        this.h = g5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, bVar), PorterDuff.Mode.MULTIPLY));
        l5 l5Var = new l5(this, context);
        this.e = l5Var;
        h5 h5Var = new h5(this, context);
        this.B = h5Var;
        h5Var.b(new i5(0, this));
        k5 k5Var = new k5(context, this, i9Var);
        this.a = k5Var;
        h5Var.setAdapter(k5Var);
        l5Var.addView(h5Var, k7.c6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(g5Var, k7.c6.c(-1.0f, -1));
        addView(l5Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f10 = this.d;
        e5 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f10;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.C;
        arrayList2.clear();
        this.y = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            m5 m5Var = new m5();
            m5Var.a = storyItem;
            arrayList2.add(m5Var);
        }
        ArrayList E = MessagesController.getInstance(this.r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                s6 s6Var = (s6) E.get(i12);
                m5 m5Var2 = new m5();
                m5Var2.b = s6Var;
                arrayList2.add(m5Var2);
            }
        }
        g5 g5Var = this.h;
        ArrayList arrayList3 = g5Var.D;
        ArrayList arrayList4 = g5Var.B;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        g5Var.d();
        if (g5Var.getMeasuredHeight() > 0) {
            g5Var.c(i10, false, false);
        } else {
            g5Var.w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((j4) arrayList3.get(i13)).a(((j4) arrayList3.get(i13)).b);
        }
        h5 h5Var = this.B;
        h5Var.setAdapter(null);
        k5 k5Var = this.a;
        h5Var.setAdapter(k5Var);
        k5Var.g();
        h5Var.setCurrentItem(i10);
    }

    public j4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public e5 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((e5) arrayList.get(i10)).getTag()).intValue() == this.B.getCurrentItem()) {
                return (e5) arrayList.get(i10);
            }
            i10++;
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.h.getClosestPosition();
        if (closestPosition < 0) {
            return null;
        }
        ArrayList arrayList = this.C;
        if (closestPosition >= arrayList.size()) {
            return null;
        }
        return ((m5) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        int i13 = this.r.b ? AndroidUtilities.statusBarHeight : 0;
        int size = View.MeasureSpec.getSize(i11);
        g5 g5Var = this.h;
        ((FrameLayout.LayoutParams) g5Var.getLayoutParams()).topMargin = i13;
        this.n = g5Var.getFinalHeight();
        this.b = AndroidUtilities.dp(20.0f) + i13;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i13) + this.n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.c = size - dp;
        while (true) {
            ArrayList arrayList = this.D;
            if (i12 >= arrayList.size()) {
                super.onMeasure(i10, i11);
                return;
            } else {
                ((e5) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        e5 currentPage;
        boolean z4 = this.x >= AndroidUtilities.dp(20.0f);
        boolean z10 = i10 >= AndroidUtilities.dp(20.0f);
        if (z10 != z4) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new f5(this, 0));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
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
            currentPage.d.z((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.r1.w);
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
        i9 i9Var = this.r;
        f4 t6 = i9Var.t();
        f9 f9Var = i9Var.p0;
        g5 g5Var = this.h;
        if (f11 == 1.0f && this.f != 1.0f) {
            if (i9Var.L0 != null) {
                MessageObject messageObject = (MessageObject) i9Var.L0.i.get(Utilities.clamp(g5Var.getClosestPosition(), i9Var.L0.i.size() - 1, 0));
                long b10 = l6.b(messageObject);
                ImageReceiver imageReceiver = f9Var.c;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    f9Var.c = null;
                }
                y8 y8Var = i9Var.k0;
                int i10 = messageObject.storyItem.id;
                i9 i9Var2 = y8Var.K0;
                int i11 = 0;
                while (true) {
                    if (i11 >= y8Var.u0.size()) {
                        break;
                    }
                    if (b10 == l6.b(i9Var2.L0.f(((Integer) ((ArrayList) y8Var.u0.get(i11)).get(0)).intValue()))) {
                        int size = i9Var2.O0 ? (y8Var.u0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) y8Var.u0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) y8Var.u0.get(i11)).get(i12)).intValue() == i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (y8Var.getCurrentPeerView() == null || y8Var.getCurrentItem() != size) {
                            y8Var.x(size, false);
                            f4 currentPeerView = y8Var.getCurrentPeerView();
                            if (currentPeerView != null) {
                                q7 q7Var = (q7) currentPeerView.getParent();
                                q7Var.a(true);
                                if (y8Var.u0 != null) {
                                    f4 f4Var = q7Var.a;
                                    long j10 = q7Var.b;
                                    ArrayList arrayList = q7Var.c;
                                    f4Var.y1 = j10;
                                    f4Var.w1 = arrayList;
                                    f4Var.o0(i12);
                                } else {
                                    q7Var.a.U0(i12, q7Var.b);
                                }
                            }
                        } else {
                            f4 currentPeerView2 = y8Var.getCurrentPeerView();
                            if (currentPeerView2.G1 != i12) {
                                currentPeerView2.G1 = i12;
                                currentPeerView2.f1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (t6 != null && t6.G1 != (closestPosition = g5Var.getClosestPosition())) {
                t6.G1 = closestPosition;
                t6.f1(false);
            }
            g5Var.d.abortAnimation();
            ValueAnimator valueAnimator = g5Var.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                g5Var.J = null;
            }
            g5Var.c(g5Var.H, false, true);
        }
        if (t6 != null) {
            j3 j3Var = t6.Z0;
            g5Var.a = j3Var.getTop();
            g5Var.b = j3Var.getMeasuredWidth();
            g5Var.c = j3Var.getMeasuredHeight();
        }
        g5Var.setProgressToOpen(this.f);
        h5 h5Var = this.B;
        if (h5Var.t0 && this.f != 1.0f) {
            h5Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            h5Var.t0 = false;
        }
    }
}
