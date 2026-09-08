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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class a7 extends FrameLayout {
    public final u6 E;
    public final ArrayList F;
    public final ArrayList G;
    public final d6 H;
    public float I;
    public final x6 a;
    public float b;
    public float c;
    public float d;
    public final y6 e;
    public float f;
    public final t6 h;
    public float n;
    public final pb r;
    public final Drawable s;
    public float v;
    public boolean w;
    public int x;
    public long y;

    public a7(Context context, pb pbVar) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new d6();
        b bVar = pbVar.y;
        this.r = pbVar;
        t6 t6Var = new t6(getContext(), this, pbVar);
        this.h = t6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, bVar), PorterDuff.Mode.MULTIPLY));
        y6 y6Var = new y6(this, context);
        this.e = y6Var;
        u6 u6Var = new u6(this, context);
        this.E = u6Var;
        u6Var.b(new v6(0, this));
        x6 x6Var = new x6(context, this, pbVar);
        this.a = x6Var;
        u6Var.setAdapter(x6Var);
        y6Var.addView(u6Var, w7.x5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(t6Var, w7.x5.c(-1.0f, -1));
        addView(y6Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f7 = this.d;
        s6 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f7;
    }

    public final void b(int i10, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.y = j3;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            z6 z6Var = new z6();
            z6Var.a = storyItem;
            arrayList2.add(z6Var);
        }
        ArrayList E = MessagesController.getInstance(this.r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                t8 t8Var = (t8) E.get(i12);
                z6 z6Var2 = new z6();
                z6Var2.b = t8Var;
                arrayList2.add(z6Var2);
            }
        }
        t6 t6Var = this.h;
        ArrayList arrayList3 = t6Var.G;
        ArrayList arrayList4 = t6Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        t6Var.d();
        if (t6Var.getMeasuredHeight() > 0) {
            t6Var.c(i10, false, false);
        } else {
            t6Var.w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((v5) arrayList3.get(i13)).a(((v5) arrayList3.get(i13)).b);
        }
        u6 u6Var = this.E;
        u6Var.setAdapter(null);
        x6 x6Var = this.a;
        u6Var.setAdapter(x6Var);
        x6Var.g();
        u6Var.setCurrentItem(i10);
    }

    public v5 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public s6 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((s6) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                return (s6) arrayList.get(i10);
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
        return ((z6) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        int i13 = this.r.b ? AndroidUtilities.statusBarHeight : 0;
        int size = View.MeasureSpec.getSize(i11);
        t6 t6Var = this.h;
        ((FrameLayout.LayoutParams) t6Var.getLayoutParams()).topMargin = i13;
        this.n = t6Var.getFinalHeight();
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
                ((s6) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        s6 currentPage;
        boolean z10 = this.x >= AndroidUtilities.dp(20.0f);
        boolean z11 = i10 >= AndroidUtilities.dp(20.0f);
        if (z11 != z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z11 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ah.d0(this, 12));
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
            currentPage.d.v((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.p1.w);
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
        pb pbVar = this.r;
        o5 t10 = pbVar.t();
        mb mbVar = pbVar.s0;
        t6 t6Var = this.h;
        if (f10 == 1.0f && this.f != 1.0f) {
            if (pbVar.O0 != null) {
                MessageObject messageObject = (MessageObject) pbVar.O0.i.get(Utilities.clamp(t6Var.getClosestPosition(), pbVar.O0.i.size() - 1, 0));
                long b10 = l8.b(messageObject);
                ImageReceiver imageReceiver = mbVar.c;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    mbVar.c = null;
                }
                fb fbVar = pbVar.n0;
                int i10 = messageObject.storyItem.id;
                pb pbVar2 = fbVar.N0;
                int i11 = 0;
                while (true) {
                    if (i11 >= fbVar.x0.size()) {
                        break;
                    }
                    if (b10 == l8.b(pbVar2.O0.f(((Integer) ((ArrayList) fbVar.x0.get(i11)).get(0)).intValue()))) {
                        int size = pbVar2.R0 ? (fbVar.x0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) fbVar.x0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) fbVar.x0.get(i11)).get(i12)).intValue() == i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (fbVar.getCurrentPeerView() == null || fbVar.getCurrentItem() != size) {
                            fbVar.x(size, false);
                            o5 currentPeerView = fbVar.getCurrentPeerView();
                            if (currentPeerView != null) {
                                t9 t9Var = (t9) currentPeerView.getParent();
                                t9Var.a(true);
                                if (fbVar.x0 != null) {
                                    o5 o5Var = t9Var.a;
                                    long j3 = t9Var.b;
                                    ArrayList arrayList = t9Var.c;
                                    o5Var.B1 = j3;
                                    o5Var.z1 = arrayList;
                                    o5Var.o0(i12);
                                } else {
                                    t9Var.a.U0(i12, t9Var.b);
                                }
                            }
                        } else {
                            o5 currentPeerView2 = fbVar.getCurrentPeerView();
                            if (currentPeerView2.J1 != i12) {
                                currentPeerView2.J1 = i12;
                                currentPeerView2.f1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (t10 != null && t10.J1 != (closestPosition = t6Var.getClosestPosition())) {
                t10.J1 = closestPosition;
                t10.f1(false);
            }
            t6Var.d.abortAnimation();
            ValueAnimator valueAnimator = t6Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                t6Var.M = null;
            }
            t6Var.c(t6Var.K, false, true);
        }
        if (t10 != null) {
            l4 l4Var = t10.c1;
            t6Var.a = l4Var.getTop();
            t6Var.b = l4Var.getMeasuredWidth();
            t6Var.c = l4Var.getMeasuredHeight();
        }
        t6Var.setProgressToOpen(this.f);
        u6 u6Var = this.E;
        if (u6Var.w0 && this.f != 1.0f) {
            u6Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            u6Var.w0 = false;
        }
    }
}
