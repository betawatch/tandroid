package lh;

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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class l5 extends FrameLayout {
    public final f5 A;
    public final ArrayList B;
    public final ArrayList C;
    public final o4 D;
    public float E;
    public final i5 a;
    public float b;
    public float c;
    public float d;
    public final j5 e;
    public float f;
    public final e5 h;
    public float n;
    public final i9 r;
    public final Drawable s;
    public float v;
    public boolean w;
    public int x;
    public long y;

    public l5(Context context, i9 i9Var) {
        super(context);
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new o4();
        b bVar = i9Var.y;
        this.r = i9Var;
        e5 e5Var = new e5(getContext(), this, i9Var);
        this.h = e5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, bVar), PorterDuff.Mode.MULTIPLY));
        j5 j5Var = new j5(this, context);
        this.e = j5Var;
        f5 f5Var = new f5(this, context);
        this.A = f5Var;
        f5Var.b(new g5(0, this));
        i5 i5Var = new i5(context, this, i9Var);
        this.a = i5Var;
        f5Var.setAdapter(i5Var);
        j5Var.addView(f5Var, i7.f6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(e5Var, i7.f6.c(-1.0f, -1));
        addView(j5Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f9 = this.d;
        c5 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f9;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.B;
        arrayList2.clear();
        this.y = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            k5 k5Var = new k5();
            k5Var.a = storyItem;
            arrayList2.add(k5Var);
        }
        ArrayList E = MessagesController.getInstance(this.r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                r6 r6Var = (r6) E.get(i12);
                k5 k5Var2 = new k5();
                k5Var2.b = r6Var;
                arrayList2.add(k5Var2);
            }
        }
        e5 e5Var = this.h;
        ArrayList arrayList3 = e5Var.C;
        ArrayList arrayList4 = e5Var.A;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        e5Var.d();
        if (e5Var.getMeasuredHeight() > 0) {
            e5Var.c(i10, false, false);
        } else {
            e5Var.w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((h4) arrayList3.get(i13)).a(((h4) arrayList3.get(i13)).b);
        }
        f5 f5Var = this.A;
        f5Var.setAdapter(null);
        i5 i5Var = this.a;
        f5Var.setAdapter(i5Var);
        i5Var.g();
        f5Var.setCurrentItem(i10);
    }

    public h4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public c5 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((c5) arrayList.get(i10)).getTag()).intValue() == this.A.getCurrentItem()) {
                return (c5) arrayList.get(i10);
            }
            i10++;
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
        return ((k5) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        int i13 = this.r.b ? AndroidUtilities.statusBarHeight : 0;
        int size = View.MeasureSpec.getSize(i11);
        e5 e5Var = this.h;
        ((FrameLayout.LayoutParams) e5Var.getLayoutParams()).topMargin = i13;
        this.n = e5Var.getFinalHeight();
        this.b = AndroidUtilities.dp(20.0f) + i13;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i13) + this.n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.c = size - dp;
        while (true) {
            ArrayList arrayList = this.C;
            if (i12 >= arrayList.size()) {
                super.onMeasure(i10, i11);
                return;
            } else {
                ((c5) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        c5 currentPage;
        boolean z10 = this.x >= AndroidUtilities.dp(20.0f);
        boolean z11 = i10 >= AndroidUtilities.dp(20.0f);
        if (z11 != z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z11 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new d5(this, 0));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
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
            currentPage.d.n((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.q1.w);
        }
    }

    public void setOffset(float f9) {
        int closestPosition;
        if (this.v == f9) {
            return;
        }
        this.v = f9;
        this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.v);
        float f10 = this.f;
        float clamp = Utilities.clamp(f9 / this.c, 1.0f, 0.0f);
        this.f = clamp;
        Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
        i9 i9Var = this.r;
        d4 t10 = i9Var.t();
        f9 f9Var = i9Var.o0;
        e5 e5Var = this.h;
        if (f10 == 1.0f && this.f != 1.0f) {
            if (i9Var.K0 != null) {
                MessageObject messageObject = (MessageObject) i9Var.K0.i.get(Utilities.clamp(e5Var.getClosestPosition(), i9Var.K0.i.size() - 1, 0));
                long b10 = k6.b(messageObject);
                ImageReceiver imageReceiver = f9Var.c;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    f9Var.c = null;
                }
                y8 y8Var = i9Var.j0;
                int i10 = messageObject.storyItem.id;
                i9 i9Var2 = y8Var.J0;
                int i11 = 0;
                while (true) {
                    if (i11 >= y8Var.t0.size()) {
                        break;
                    }
                    if (b10 == k6.b(i9Var2.K0.f(((Integer) ((ArrayList) y8Var.t0.get(i11)).get(0)).intValue()))) {
                        int size = i9Var2.N0 ? (y8Var.t0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) y8Var.t0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) y8Var.t0.get(i11)).get(i12)).intValue() == i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (y8Var.getCurrentPeerView() == null || y8Var.getCurrentItem() != size) {
                            y8Var.x(size, false);
                            d4 currentPeerView = y8Var.getCurrentPeerView();
                            if (currentPeerView != null) {
                                q7 q7Var = (q7) currentPeerView.getParent();
                                q7Var.a(true);
                                if (y8Var.t0 != null) {
                                    d4 d4Var = q7Var.a;
                                    long j10 = q7Var.b;
                                    ArrayList arrayList = q7Var.c;
                                    d4Var.x1 = j10;
                                    d4Var.v1 = arrayList;
                                    d4Var.o0(i12);
                                } else {
                                    q7Var.a.U0(i12, q7Var.b);
                                }
                            }
                        } else {
                            d4 currentPeerView2 = y8Var.getCurrentPeerView();
                            if (currentPeerView2.F1 != i12) {
                                currentPeerView2.F1 = i12;
                                currentPeerView2.f1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (t10 != null && t10.F1 != (closestPosition = e5Var.getClosestPosition())) {
                t10.F1 = closestPosition;
                t10.f1(false);
            }
            e5Var.d.abortAnimation();
            ValueAnimator valueAnimator = e5Var.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                e5Var.I = null;
            }
            e5Var.c(e5Var.G, false, true);
        }
        if (t10 != null) {
            h3 h3Var = t10.Y0;
            e5Var.a = h3Var.getTop();
            e5Var.b = h3Var.getMeasuredWidth();
            e5Var.c = h3Var.getMeasuredHeight();
        }
        e5Var.setProgressToOpen(this.f);
        f5 f5Var = this.A;
        if (f5Var.s0 && this.f != 1.0f) {
            f5Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            f5Var.s0 = false;
        }
    }
}
