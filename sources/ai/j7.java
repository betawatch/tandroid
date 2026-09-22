package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public abstract class j7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public i7 E;
    public i7 F;
    public g9 G;
    public int H;
    public boolean I;
    public final qk0 J;
    public final jc K;
    public final t6 L;
    public final u6 M;
    public final f3 N;
    public final u6 O;
    public final y6 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public boolean V;
    public long W;
    public final View a;
    public final View b;
    public final FrameLayout c;
    public final a5.a d;
    public int e;
    public x6 f;
    public final TextView h;
    public int n;
    public final p6 r;
    public final d s;
    public final int v;
    public final e7 w;
    public final pz x;
    public q7 y;

    public j7(jc jcVar, Context context, u6 u6Var, f3 f3Var) {
        super(context);
        this.e = 96;
        this.O = new u6();
        this.M = u6Var;
        this.N = f3Var;
        d dVar = jcVar.y;
        this.s = dVar;
        this.K = jcVar;
        this.v = jcVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.j5, dVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        y6 y6Var = new y6(this, getContext());
        this.P = y6Var;
        p6 p6Var = new p6(this, context, dVar);
        this.r = p6Var;
        p6Var.setClipToPadding(false);
        this.J = new qk0(p6Var, true);
        pz pzVar = new pz(p6Var, 0);
        this.x = pzVar;
        p6Var.setLayoutManager(pzVar);
        p6Var.setNestedScrollingEnabled(true);
        e7 e7Var = new e7(this);
        this.w = e7Var;
        p6Var.setAdapter(e7Var);
        new SparseArray();
        new HashMap();
        addView(p6Var);
        this.d = new a5.a(p6Var);
        p6Var.setOnScrollListener(new r(this, 1));
        p6Var.setOnItemClickListener(new o6(0, this, jcVar));
        p6Var.setOnItemLongClickListener(new s6(this, jcVar));
        e7Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.i6.h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.i6.v0(i10, dVar), 0}));
        frameLayout.addView(view, w7.x5.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i10, dVar));
        frameLayout.addView(view2, w7.x5.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(y6Var);
        frameLayout.addView(textView);
        t6 t6Var = new t6(this, getContext(), dVar);
        this.L = t6Var;
        t6Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(t6Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(j7 j7Var) {
        new rg.x0(j7Var.K.f, 14, false).show();
    }

    public static void b(j7 j7Var) {
        i7 i7Var = j7Var.E;
        if (i7Var != null) {
            i7Var.r.remove(j7Var);
        }
        i7 i7Var2 = j7Var.F;
        j7Var.E = i7Var2;
        if (i7Var2 == null) {
            return;
        }
        ArrayList arrayList = i7Var2.r;
        if (!arrayList.contains(j7Var)) {
            arrayList.add(j7Var);
        }
        j7Var.E.e(j7Var.O, j7Var.T, j7Var.S);
        j7Var.w.E();
        j7Var.x.h1(0, (int) (j7Var.getTopOffset() - j7Var.r.getPaddingTop()));
    }

    public static void f(int i10, long j3, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.x.f(storyItem.dialogId);
        i7 i7Var = sparseArray == null ? null : (i7) sparseArray.get(storyItem.id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i11 = storyViews == null ? 0 : storyViews.views_count;
        if (i7Var == null || i7Var.a != i11) {
            if (i7Var != null) {
                i7Var.d();
            }
            i7 i7Var2 = new i7(i10, j3, storyItem);
            i7Var2.c();
            if (sparseArray == null) {
                a0.i iVar = MessagesController.getInstance(i10).storiesController.x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                iVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.id, i7Var2);
        }
    }

    public final void c() {
        if (this.E == null || this.x.N0() <= this.w.c.size() - 10) {
            return;
        }
        this.E.c();
    }

    public final boolean d(TL_stories.StoryView storyView) {
        ci.o8 o8Var;
        ci.ga gaVar;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        q7 q7Var = this.y;
        if (q7Var != null) {
            TL_stories.StoryItem storyItem = q7Var.a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new ci.ga(i10, storyItem.privacy);
                }
                return this.y.a.parsedPrivacy.b(user);
            }
            k9 k9Var = q7Var.b;
            if (k9Var != null && (o8Var = k9Var.c) != null && (gaVar = o8Var.E0) != null) {
                return gaVar.b(user);
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int R;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesUpdated) {
            if (this.y.b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y3 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y3 != null) {
                    while (i12 < y3.stories.size()) {
                        TL_stories.StoryItem storyItem = y3.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.y.b.e)) {
                            q7 q7Var = this.y;
                            q7Var.b = null;
                            q7Var.a = storyItem;
                            g(this.W, q7Var);
                            return;
                        }
                        i12++;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.storiesBlocklistUpdate) {
            return;
        }
        while (true) {
            p6 p6Var = this.r;
            if (i12 >= p6Var.getChildCount()) {
                return;
            }
            View childAt = p6Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Cells.o6) && (R = RecyclerView.R(childAt)) >= 0) {
                e7 e7Var = this.w;
                if (R < e7Var.c.size()) {
                    ((org.telegram.ui.Cells.o6) childAt).a(d(((z6) e7Var.c.get(R)).b) ? 1.0f : 0.5f, true);
                }
            }
            i12++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        p6 p6Var;
        View view = null;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            p6Var = this.r;
            if (i10 >= p6Var.getChildCount()) {
                break;
            }
            View childAt = p6Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (S < i11 || i11 == -1) {
                view = childAt;
                i11 = S;
            }
            i10++;
        }
        int max = i11 == 0 ? (int) Math.max(0.0f, view.getY()) : i11 > 0 ? 0 : p6Var.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f7 = max;
        if (frameLayout.getTranslationY() != f7) {
            frameLayout.setTranslationY(f7);
            n7 n7Var = (n7) this;
            int intValue = ((Integer) n7Var.getTag()).intValue();
            r7 r7Var = n7Var.a0.e;
            k7 k7Var = r7Var.h;
            if (intValue == r7Var.E.getCurrentItem()) {
                k7Var.setAlpha(Utilities.clamp(f7 / r7Var.d, 1.0f, 0.0f));
                k7Var.setTranslationY((-(r7Var.d - f7)) / 2.0f);
            }
        }
        this.U.setBounds(-AndroidUtilities.dp(6.0f), max, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != p6Var.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = p6Var.getPaddingTop() / 2.0f;
                a5.a aVar = this.d;
                if (translationY > paddingTop) {
                    aVar.v((int) (-(p6Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    aVar.v((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.r) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0, AndroidUtilities.dp(this.e), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j3);
        canvas.restore();
        return true;
    }

    public final void e(i7 i7Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        e7 e7Var = this.w;
        int size = e7Var.c.size();
        u6 u6Var = this.O;
        if (TextUtils.isEmpty(u6Var.c) && !u6Var.b) {
            i();
        }
        e7Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = i7Var.i;
            if (i7Var != this.E || arrayList == null || this.H >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = this.H; i10 < arrayList.size(); i10++) {
                TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i10);
                if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                    arrayList2.add(storyItem);
                }
            }
            this.H = arrayList.size();
            if (arrayList2.isEmpty()) {
                return;
            }
            this.G.F(arrayList2);
        }
    }

    public final void g(long j3, q7 q7Var) {
        this.W = j3;
        this.y = q7Var;
        i();
        h(false);
        if (q7Var == null || q7Var.a == null) {
            return;
        }
        NotificationsController.getInstance(this.v).processSeenStoryReactions(j3, q7Var.a.id);
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        u6 u6Var = this.O;
        boolean z11 = u6Var.b;
        y6 y6Var = this.P;
        if (z11 != y6Var.s || !z10) {
            ValueAnimator valueAnimator = y6Var.w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                y6Var.w.cancel();
            }
            y6Var.s = z11 ? 1 : 0;
            if (z10) {
                y6Var.e.set(y6Var.n);
                y6Var.f = y6Var.c.getAlpha();
                y6Var.h = y6Var.d.getAlpha();
                y6Var.r = 0.0f;
                y6Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                y6Var.w = ofFloat;
                ofFloat.addUpdateListener(new a(y6Var, 10));
                y6Var.w.addListener(new b(y6Var, 8));
                y6Var.w.setDuration(250L);
                y6Var.w.setInterpolator(qr.f);
                y6Var.w.start();
            } else {
                y6Var.r = 1.0f;
                y6Var.invalidate();
            }
        }
        boolean z12 = u6Var.a;
        ql0 ql0Var = y6Var.v;
        if (z12) {
            i7 i7Var = this.E;
            i10 = (i7Var == null || !i7Var.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        ql0Var.a(i10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        this.R = false;
        this.T = false;
        this.S = false;
        TL_stories.StoryItem storyItem = this.y.a;
        t6 t6Var = this.L;
        y6 y6Var = this.P;
        TextView textView = this.h;
        if (storyItem != null) {
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews != null) {
                int i10 = storyViews.views_count;
                this.R = i10 >= 15;
                this.S = storyViews.reactions_count >= (BuildVars.DEBUG_PRIVATE_VERSION ? 5 : 10);
                this.T = (storyItem.dialogId < 0 || i10 < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
            }
            int i11 = this.v;
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i11).storiesController.x.f(storyItem.dialogId);
            i7 i7Var = sparseArray != null ? (i7) sparseArray.get(storyItem.id) : null;
            this.F = i7Var;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i12 = storyViews2 == null ? 0 : storyViews2.views_count;
            u6 u6Var = this.O;
            if (i7Var == null || !(i7Var.f || i7Var.a == i12)) {
                if (i7Var != null) {
                    i7Var.d();
                }
                i7 i7Var2 = new i7(i11, this.W, storyItem);
                this.F = i7Var2;
                i7Var2.e(u6Var, this.T, this.S);
                this.F.c();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.F);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.F);
                    MessagesController.getInstance(i11).storiesController.x.k(sparseArray2, storyItem.dialogId);
                }
            } else {
                i7Var.e(u6Var, this.T, this.S);
            }
            i7 i7Var3 = this.E;
            if (i7Var3 != null) {
                i7Var3.r.remove(this);
            }
            i7 i7Var4 = this.F;
            this.E = i7Var4;
            if (i7Var4 != null && this.I) {
                ArrayList arrayList = i7Var4.r;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            i7 i7Var5 = this.E;
            if (i7Var5 == null || !i7Var5.j || UserConfig.getInstance(i11).isPremium()) {
                i7 i7Var6 = this.E;
                if (i7Var6.e || i7Var6.m || !i7Var6.g.isEmpty() || !this.E.i.isEmpty() || !TextUtils.isEmpty(this.E.s.c)) {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.R = false;
                        this.S = false;
                        this.T = false;
                        textView.setText(LocaleController.getString(this.E.f ? R.string.Reactions : R.string.Viewers));
                        t6Var.setVisibility(8);
                        y6Var.setVisibility(8);
                        this.e = 46;
                    } else {
                        y6Var.setVisibility(0);
                        i7 i7Var7 = this.E;
                        if (i7Var7.k) {
                            textView.setText(LocaleController.getString(i7Var7.f ? R.string.Reactions : R.string.Viewers));
                            this.R = false;
                            this.S = false;
                            this.T = false;
                        } else {
                            if (i7Var7.b() < 20 && this.E.b() < storyItem.views.views_count) {
                                i7 i7Var8 = this.E;
                                if (!i7Var8.e && !i7Var8.m) {
                                    this.R = false;
                                    this.S = false;
                                    this.T = false;
                                    textView.setText(LocaleController.getString(!this.E.f ? R.string.Reactions : R.string.Viewers));
                                }
                            }
                            this.R = !this.E.f && storyItem.views.views_count >= 15;
                            TL_stories.StoryViews storyViews4 = storyItem.views;
                            this.S = storyViews4.reactions_count >= (BuildVars.DEBUG_VERSION ? 5 : 10);
                            this.T = (storyItem.dialogId < 0 || storyViews4.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                            textView.setText(LocaleController.getString(!this.E.f ? R.string.Reactions : R.string.Viewers));
                        }
                        t6Var.setVisibility(this.R ? 0 : 8);
                        this.e = this.R ? 96 : 46;
                    }
                }
            }
            this.R = false;
            this.S = false;
            this.T = false;
            textView.setText(LocaleController.getString(this.E.f ? R.string.Reactions : R.string.Viewers));
            t6Var.setVisibility(8);
            y6Var.setVisibility(8);
            this.e = 46;
        } else {
            this.e = 46;
            textView.setText(LocaleController.getString(R.string.UploadingStory));
            t6Var.setVisibility(8);
            y6Var.setVisibility(8);
        }
        y6Var.a.setVisibility(this.S ? 0 : 8);
        y6Var.c.setVisibility(this.T ? 0 : 8);
        y6Var.d.setVisibility(this.T ? 0 : 8);
        if (this.T) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = AndroidUtilities.dp(this.e - 8);
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).topMargin = AndroidUtilities.dp(this.e - 17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        i7 i7Var = this.E;
        if (i7Var != null) {
            ArrayList arrayList = i7Var.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.p.clear();
        }
        this.w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        org.telegram.ui.Components.oc.a(this, new w4(this, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        i7 i7Var = this.E;
        if (i7Var != null) {
            i7Var.r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        org.telegram.ui.Components.oc.h(this);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f7) {
        p6 p6Var = this.r;
        if (f7 != p6Var.getPaddingBottom()) {
            p6Var.setPadding(0, (int) f7, 0, 0);
            p6Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }
}
