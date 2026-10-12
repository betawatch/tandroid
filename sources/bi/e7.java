package bi;

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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class e7 extends FrameLayout {
    public final y6 E;
    public final ArrayList F;
    public final ArrayList G;
    public final g6 H;
    public float I;
    public final b7 a;
    public float b;
    public float c;
    public float d;
    public final c7 e;
    public float f;
    public final x6 h;
    public float n;
    public final sb r;
    public final Drawable s;
    public float v;
    public boolean w;
    public int x;
    public long y;

    public e7(Context context, sb sbVar) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new g6();
        b bVar = sbVar.y;
        this.r = sbVar;
        x6 x6Var = new x6(getContext(), this, sbVar);
        this.h = x6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, bVar), PorterDuff.Mode.MULTIPLY));
        c7 c7Var = new c7(this, context);
        this.e = c7Var;
        y6 y6Var = new y6(this, context);
        this.E = y6Var;
        y6Var.b(new z6(this, 0));
        b7 b7Var = new b7(context, this, sbVar);
        this.a = b7Var;
        y6Var.setAdapter(b7Var);
        c7Var.addView(y6Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        addView(x6Var, w7.a6.d(-1.0f, -1));
        addView(c7Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f7 = this.d;
        w6 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f7;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.y = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            d7 d7Var = new d7();
            d7Var.a = storyItem;
            arrayList2.add(d7Var);
        }
        ArrayList E = MessagesController.getInstance(this.r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                w8 w8Var = (w8) E.get(i12);
                d7 d7Var2 = new d7();
                d7Var2.b = w8Var;
                arrayList2.add(d7Var2);
            }
        }
        x6 x6Var = this.h;
        ArrayList arrayList3 = x6Var.G;
        ArrayList arrayList4 = x6Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        x6Var.d();
        if (x6Var.getMeasuredHeight() > 0) {
            x6Var.c(i10, false, false);
        } else {
            x6Var.w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((x5) arrayList3.get(i13)).a(((x5) arrayList3.get(i13)).b);
        }
        y6 y6Var = this.E;
        y6Var.setAdapter(null);
        b7 b7Var = this.a;
        y6Var.setAdapter(b7Var);
        b7Var.g();
        y6Var.setCurrentItem(i10);
    }

    public x5 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public w6 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((w6) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                return (w6) arrayList.get(i10);
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
        return ((d7) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        int i13 = this.r.b ? AndroidUtilities.statusBarHeight : 0;
        int size = View.MeasureSpec.getSize(i11);
        x6 x6Var = this.h;
        ((FrameLayout.LayoutParams) x6Var.getLayoutParams()).topMargin = i13;
        this.n = x6Var.getFinalHeight();
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
                ((w6) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        w6 currentPage;
        boolean z10 = this.x >= AndroidUtilities.dp(20.0f);
        boolean z11 = i10 >= AndroidUtilities.dp(20.0f);
        if (z11 != z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z11 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ah.c0(this, 12));
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
            currentPage.d.A((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.o1.w);
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
        sb sbVar = this.r;
        q5 t10 = sbVar.t();
        pb pbVar = sbVar.s0;
        x6 x6Var = this.h;
        if (f10 == 1.0f && this.f != 1.0f) {
            if (sbVar.O0 != null) {
                MessageObject messageObject = (MessageObject) sbVar.O0.i.get(Utilities.clamp(x6Var.getClosestPosition(), sbVar.O0.i.size() - 1, 0));
                long b10 = o8.b(messageObject);
                ImageReceiver imageReceiver = pbVar.c;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    pbVar.c = null;
                }
                ib ibVar = sbVar.n0;
                int i10 = messageObject.storyItem.id;
                sb sbVar2 = ibVar.N0;
                int i11 = 0;
                while (true) {
                    if (i11 >= ibVar.x0.size()) {
                        break;
                    }
                    if (b10 == o8.b(sbVar2.O0.f(((Integer) ((ArrayList) ibVar.x0.get(i11)).get(0)).intValue()))) {
                        int size = sbVar2.R0 ? (ibVar.x0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) ibVar.x0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) ibVar.x0.get(i11)).get(i12)).intValue() == i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (ibVar.getCurrentPeerView() == null || ibVar.getCurrentItem() != size) {
                            ibVar.x(size, false);
                            q5 currentPeerView = ibVar.getCurrentPeerView();
                            if (currentPeerView != null) {
                                w9 w9Var = (w9) currentPeerView.getParent();
                                w9Var.a(true);
                                if (ibVar.x0 != null) {
                                    q5 q5Var = w9Var.a;
                                    long j10 = w9Var.b;
                                    ArrayList arrayList = w9Var.c;
                                    q5Var.B1 = j10;
                                    q5Var.z1 = arrayList;
                                    q5Var.o0(i12);
                                } else {
                                    w9Var.a.U0(i12, w9Var.b);
                                }
                            }
                        } else {
                            q5 currentPeerView2 = ibVar.getCurrentPeerView();
                            if (currentPeerView2.J1 != i12) {
                                currentPeerView2.J1 = i12;
                                currentPeerView2.f1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (t10 != null && t10.J1 != (closestPosition = x6Var.getClosestPosition())) {
                t10.J1 = closestPosition;
                t10.f1(false);
            }
            x6Var.d.abortAnimation();
            ValueAnimator valueAnimator = x6Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                x6Var.M = null;
            }
            x6Var.c(x6Var.K, false, true);
        }
        if (t10 != null) {
            o4 o4Var = t10.c1;
            x6Var.a = o4Var.getTop();
            x6Var.b = o4Var.getMeasuredWidth();
            x6Var.c = o4Var.getMeasuredHeight();
        }
        x6Var.setProgressToOpen(this.f);
        y6 y6Var = this.E;
        if (y6Var.w0 && this.f != 1.0f) {
            y6Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            y6Var.w0 = false;
        }
    }
}
