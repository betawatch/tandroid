package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b6 extends FrameLayout {
    public final v5 E;
    public final ArrayList F;
    public final ArrayList G;
    public final e5 H;
    public float I;
    public final y5 a;
    public float b;
    public float c;
    public float d;
    public final z5 e;
    public float f;
    public final u5 h;
    public float n;
    public final y9 r;
    public final Drawable s;
    public float v;
    public boolean w;
    public int x;
    public long y;

    public b6(Context context, y9 y9Var) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new e5();
        b bVar = y9Var.y;
        this.r = y9Var;
        u5 u5Var = new u5(getContext(), this, y9Var);
        this.h = u5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.h5, bVar, PorterDuff.Mode.MULTIPLY);
        z5 z5Var = new z5(this, context);
        this.e = z5Var;
        v5 v5Var = new v5(this, context);
        this.E = v5Var;
        v5Var.b(new w5(0, this));
        y5 y5Var = new y5(context, this, y9Var);
        this.a = y5Var;
        v5Var.setAdapter(y5Var);
        z5Var.addView(v5Var, gb1.h(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(u5Var, gb1.g(-1.0f, -1));
        addView(z5Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f7 = this.d;
        t5 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f7;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.y = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            a6 a6Var = new a6();
            a6Var.a = storyItem;
            arrayList2.add(a6Var);
        }
        ArrayList E = MessagesController.getInstance(this.r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                g7 g7Var = (g7) E.get(i12);
                a6 a6Var2 = new a6();
                a6Var2.b = g7Var;
                arrayList2.add(a6Var2);
            }
        }
        u5 u5Var = this.h;
        ArrayList arrayList3 = u5Var.G;
        ArrayList arrayList4 = u5Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        u5Var.d();
        if (u5Var.getMeasuredHeight() > 0) {
            u5Var.c(i10, false, false);
        } else {
            u5Var.w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((v4) arrayList3.get(i13)).a(((v4) arrayList3.get(i13)).b);
        }
        v5 v5Var = this.E;
        v5Var.setAdapter(null);
        y5 y5Var = this.a;
        v5Var.setAdapter(y5Var);
        y5Var.g();
        v5Var.setCurrentItem(i10);
    }

    public v4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public t5 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((t5) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                return (t5) arrayList.get(i10);
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
        return ((a6) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        int i13 = this.r.b ? AndroidUtilities.statusBarHeight : 0;
        int size = View.MeasureSpec.getSize(i11);
        u5 u5Var = this.h;
        ((FrameLayout.LayoutParams) u5Var.getLayoutParams()).topMargin = i13;
        this.n = u5Var.getFinalHeight();
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
                ((t5) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        t5 currentPage;
        boolean z10 = this.x >= AndroidUtilities.dp(20.0f);
        boolean z11 = i10 >= AndroidUtilities.dp(20.0f);
        if (z11 != z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z11 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ai.g0(this, 21));
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
            currentPage.d.A((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.q1.w);
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
        y9 y9Var = this.r;
        q4 t10 = y9Var.t();
        v9 v9Var = y9Var.s0;
        u5 u5Var = this.h;
        if (f10 == 1.0f && this.f != 1.0f) {
            if (y9Var.O0 != null) {
                MessageObject messageObject = (MessageObject) y9Var.O0.i.get(Utilities.clamp(u5Var.getClosestPosition(), y9Var.O0.i.size() - 1, 0));
                long b10 = z6.b(messageObject);
                ImageReceiver imageReceiver = v9Var.c;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    v9Var.c = null;
                }
                o9 o9Var = y9Var.n0;
                int i10 = messageObject.storyItem.id;
                y9 y9Var2 = o9Var.N0;
                int i11 = 0;
                while (true) {
                    if (i11 >= o9Var.x0.size()) {
                        break;
                    }
                    if (b10 == z6.b(y9Var2.O0.f(((Integer) ((ArrayList) o9Var.x0.get(i11)).get(0)).intValue()))) {
                        int size = y9Var2.R0 ? (o9Var.x0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) o9Var.x0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) o9Var.x0.get(i11)).get(i12)).intValue() == i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (o9Var.getCurrentPeerView() == null || o9Var.getCurrentItem() != size) {
                            o9Var.x(size, false);
                            q4 currentPeerView = o9Var.getCurrentPeerView();
                            if (currentPeerView != null) {
                                e8 e8Var = (e8) currentPeerView.getParent();
                                e8Var.a(true);
                                if (o9Var.x0 != null) {
                                    q4 q4Var = e8Var.a;
                                    long j10 = e8Var.b;
                                    ArrayList arrayList = e8Var.c;
                                    q4Var.q1 = j10;
                                    q4Var.o1 = arrayList;
                                    q4Var.m0(i12);
                                } else {
                                    e8Var.a.S0(i12, e8Var.b);
                                }
                            }
                        } else {
                            q4 currentPeerView2 = o9Var.getCurrentPeerView();
                            if (currentPeerView2.y1 != i12) {
                                currentPeerView2.y1 = i12;
                                currentPeerView2.d1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (t10 != null && t10.y1 != (closestPosition = u5Var.getClosestPosition())) {
                t10.y1 = closestPosition;
                t10.d1(false);
            }
            u5Var.d.abortAnimation();
            ValueAnimator valueAnimator = u5Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                u5Var.M = null;
            }
            u5Var.c(u5Var.K, false, true);
        }
        if (t10 != null) {
            q3 q3Var = t10.R0;
            u5Var.a = q3Var.getTop();
            u5Var.b = q3Var.getMeasuredWidth();
            u5Var.c = q3Var.getMeasuredHeight();
        }
        u5Var.setProgressToOpen(this.f);
        v5 v5Var = this.E;
        if (v5Var.w0 && this.f != 1.0f) {
            v5Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            v5Var.w0 = false;
        }
    }
}
