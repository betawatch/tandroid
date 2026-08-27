package jh;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class k5 extends FrameLayout {
    public final e5 A;
    public final ArrayList B;
    public final ArrayList C;
    public final o4 D;
    public float E;
    public final h5 a;
    public float b;
    public float c;
    public float d;
    public final i5 e;
    public float f;
    public final d5 h;
    public float n;
    public final i9 r;
    public final Drawable s;
    public float v;
    public boolean w;
    public int x;
    public long y;

    public k5(Context context, i9 i9Var) {
        super(context);
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new o4();
        b bVar = i9Var.y;
        this.r = i9Var;
        d5 d5Var = new d5(getContext(), this, i9Var);
        this.h = d5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, bVar), PorterDuff.Mode.MULTIPLY));
        i5 i5Var = new i5(this, context);
        this.e = i5Var;
        e5 e5Var = new e5(this, context);
        this.A = e5Var;
        e5Var.b(new f5(0, this));
        h5 h5Var = new h5(context, this, i9Var);
        this.a = h5Var;
        e5Var.setAdapter(h5Var);
        i5Var.addView(e5Var, h7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(d5Var, h7.z5.c(-1.0f, -1));
        addView(i5Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f10 = this.d;
        c5 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f10;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.B;
        arrayList2.clear();
        this.y = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            j5 j5Var = new j5();
            j5Var.a = storyItem;
            arrayList2.add(j5Var);
        }
        ArrayList E = MessagesController.getInstance(this.r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                r6 r6Var = (r6) E.get(i12);
                j5 j5Var2 = new j5();
                j5Var2.b = r6Var;
                arrayList2.add(j5Var2);
            }
        }
        d5 d5Var = this.h;
        ArrayList arrayList3 = d5Var.C;
        ArrayList arrayList4 = d5Var.A;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        d5Var.d();
        if (d5Var.getMeasuredHeight() > 0) {
            d5Var.c(i10, false, false);
        } else {
            d5Var.w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((h4) arrayList3.get(i13)).a(((h4) arrayList3.get(i13)).b);
        }
        e5 e5Var = this.A;
        e5Var.setAdapter(null);
        h5 h5Var = this.a;
        e5Var.setAdapter(h5Var);
        h5Var.g();
        e5Var.setCurrentItem(i10);
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
        return ((j5) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        int i13 = this.r.b ? AndroidUtilities.statusBarHeight : 0;
        int size = View.MeasureSpec.getSize(i11);
        d5 d5Var = this.h;
        ((FrameLayout.LayoutParams) d5Var.getLayoutParams()).topMargin = i13;
        this.n = d5Var.getFinalHeight();
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
            ofFloat.addUpdateListener(new ag.u(this, 24));
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
            currentPage.d.l((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.p1.w);
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
        e4 t10 = i9Var.t();
        f9 f9Var = i9Var.o0;
        d5 d5Var = this.h;
        if (f11 == 1.0f && this.f != 1.0f) {
            if (i9Var.K0 != null) {
                MessageObject messageObject = (MessageObject) i9Var.K0.i.get(Utilities.clamp(d5Var.getClosestPosition(), i9Var.K0.i.size() - 1, 0));
                long b10 = j6.b(messageObject);
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
                    if (b10 == j6.b(i9Var2.K0.f(((Integer) ((ArrayList) y8Var.t0.get(i11)).get(0)).intValue()))) {
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
                            e4 currentPeerView = y8Var.getCurrentPeerView();
                            if (currentPeerView != null) {
                                p7 p7Var = (p7) currentPeerView.getParent();
                                p7Var.a(true);
                                if (y8Var.t0 != null) {
                                    e4 e4Var = p7Var.a;
                                    long j10 = p7Var.b;
                                    ArrayList arrayList = p7Var.c;
                                    e4Var.x1 = j10;
                                    e4Var.v1 = arrayList;
                                    e4Var.o0(i12);
                                } else {
                                    p7Var.a.U0(i12, p7Var.b);
                                }
                            }
                        } else {
                            e4 currentPeerView2 = y8Var.getCurrentPeerView();
                            if (currentPeerView2.F1 != i12) {
                                currentPeerView2.F1 = i12;
                                currentPeerView2.f1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (t10 != null && t10.F1 != (closestPosition = d5Var.getClosestPosition())) {
                t10.F1 = closestPosition;
                t10.f1(false);
            }
            d5Var.d.abortAnimation();
            ValueAnimator valueAnimator = d5Var.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                d5Var.I = null;
            }
            d5Var.c(d5Var.G, false, true);
        }
        if (t10 != null) {
            j3 j3Var = t10.Y0;
            d5Var.a = j3Var.getTop();
            d5Var.b = j3Var.getMeasuredWidth();
            d5Var.c = j3Var.getMeasuredHeight();
        }
        d5Var.setProgressToOpen(this.f);
        e5 e5Var = this.A;
        if (e5Var.s0 && this.f != 1.0f) {
            e5Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            e5Var.s0 = false;
        }
    }
}
