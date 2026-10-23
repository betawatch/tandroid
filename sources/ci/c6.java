package ci;

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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class c6 extends FrameLayout {
    public final w5 E;
    public final ArrayList F;
    public final ArrayList G;
    public final f5 H;
    public float I;
    public final z5 a;
    public float b;
    public float c;
    public float d;
    public final a6 e;
    public float f;
    public final v5 h;
    public float n;
    public final aa r;
    public final Drawable s;
    public float v;
    public boolean w;
    public int x;
    public long y;

    public c6(Context context, aa aaVar) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new f5();
        b bVar = aaVar.y;
        this.r = aaVar;
        v5 v5Var = new v5(getContext(), this, aaVar);
        this.h = v5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, bVar), PorterDuff.Mode.MULTIPLY));
        a6 a6Var = new a6(this, context);
        this.e = a6Var;
        w5 w5Var = new w5(this, context);
        this.E = w5Var;
        w5Var.b(new x5(this, 0));
        z5 z5Var = new z5(context, this, aaVar);
        this.a = z5Var;
        w5Var.setAdapter(z5Var);
        a6Var.addView(w5Var, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(v5Var, w7.z5.c(-1.0f, -1));
        addView(a6Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f7 = this.d;
        u5 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f7;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.y = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            b6 b6Var = new b6();
            b6Var.a = storyItem;
            arrayList2.add(b6Var);
        }
        ArrayList E = MessagesController.getInstance(this.r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                h7 h7Var = (h7) E.get(i12);
                b6 b6Var2 = new b6();
                b6Var2.b = h7Var;
                arrayList2.add(b6Var2);
            }
        }
        v5 v5Var = this.h;
        ArrayList arrayList3 = v5Var.G;
        ArrayList arrayList4 = v5Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        v5Var.d();
        if (v5Var.getMeasuredHeight() > 0) {
            v5Var.c(i10, false, false);
        } else {
            v5Var.w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((w4) arrayList3.get(i13)).a(((w4) arrayList3.get(i13)).b);
        }
        w5 w5Var = this.E;
        w5Var.setAdapter(null);
        z5 z5Var = this.a;
        w5Var.setAdapter(z5Var);
        z5Var.g();
        w5Var.setCurrentItem(i10);
    }

    public w4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public u5 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((u5) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                return (u5) arrayList.get(i10);
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
        return ((b6) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        int i13 = this.r.b ? AndroidUtilities.statusBarHeight : 0;
        int size = View.MeasureSpec.getSize(i11);
        v5 v5Var = this.h;
        ((FrameLayout.LayoutParams) v5Var.getLayoutParams()).topMargin = i13;
        this.n = v5Var.getFinalHeight();
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
                ((u5) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        u5 currentPage;
        boolean z10 = this.x >= AndroidUtilities.dp(20.0f);
        boolean z11 = i10 >= AndroidUtilities.dp(20.0f);
        if (z11 != z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z11 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ah.c0(this, 19));
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
        aa aaVar = this.r;
        q4 t10 = aaVar.t();
        x9 x9Var = aaVar.s0;
        v5 v5Var = this.h;
        if (f10 == 1.0f && this.f != 1.0f) {
            if (aaVar.O0 != null) {
                MessageObject messageObject = (MessageObject) aaVar.O0.i.get(Utilities.clamp(v5Var.getClosestPosition(), aaVar.O0.i.size() - 1, 0));
                long b10 = a7.b(messageObject);
                ImageReceiver imageReceiver = x9Var.c;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    x9Var.c = null;
                }
                q9 q9Var = aaVar.n0;
                int i10 = messageObject.storyItem.id;
                aa aaVar2 = q9Var.N0;
                int i11 = 0;
                while (true) {
                    if (i11 >= q9Var.x0.size()) {
                        break;
                    }
                    if (b10 == a7.b(aaVar2.O0.f(((Integer) ((ArrayList) q9Var.x0.get(i11)).get(0)).intValue()))) {
                        int size = aaVar2.R0 ? (q9Var.x0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) q9Var.x0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) q9Var.x0.get(i11)).get(i12)).intValue() == i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (q9Var.getCurrentPeerView() == null || q9Var.getCurrentItem() != size) {
                            q9Var.x(size, false);
                            q4 currentPeerView = q9Var.getCurrentPeerView();
                            if (currentPeerView != null) {
                                h8 h8Var = (h8) currentPeerView.getParent();
                                h8Var.a(true);
                                if (q9Var.x0 != null) {
                                    q4 q4Var = h8Var.a;
                                    long j10 = h8Var.b;
                                    ArrayList arrayList = h8Var.c;
                                    q4Var.B1 = j10;
                                    q4Var.z1 = arrayList;
                                    q4Var.o0(i12);
                                } else {
                                    h8Var.a.U0(i12, h8Var.b);
                                }
                            }
                        } else {
                            q4 currentPeerView2 = q9Var.getCurrentPeerView();
                            if (currentPeerView2.J1 != i12) {
                                currentPeerView2.J1 = i12;
                                currentPeerView2.f1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (t10 != null && t10.J1 != (closestPosition = v5Var.getClosestPosition())) {
                t10.J1 = closestPosition;
                t10.f1(false);
            }
            v5Var.d.abortAnimation();
            ValueAnimator valueAnimator = v5Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                v5Var.M = null;
            }
            v5Var.c(v5Var.K, false, true);
        }
        if (t10 != null) {
            r3 r3Var = t10.c1;
            v5Var.a = r3Var.getTop();
            v5Var.b = r3Var.getMeasuredWidth();
            v5Var.c = r3Var.getMeasuredHeight();
        }
        v5Var.setProgressToOpen(this.f);
        w5 w5Var = this.E;
        if (w5Var.w0 && this.f != 1.0f) {
            w5Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            w5Var.w0 = false;
        }
    }
}
