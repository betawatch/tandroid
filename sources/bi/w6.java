package bi;

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
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sc;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public abstract class w6 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public v6 E;
    public v6 F;
    public r8 G;
    public int H;
    public boolean I;
    public final rl0 J;
    public final sb K;
    public final f6 L;
    public final g6 M;
    public final o1 N;
    public final g6 O;
    public final k6 P;
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
    public j6 f;
    public final TextView h;
    public int n;
    public final a6 r;
    public final b s;
    public final int v;
    public final q6 w;
    public final b00 x;
    public d7 y;

    public w6(sb sbVar, Context context, g6 g6Var, o1 o1Var) {
        super(context);
        this.e = 96;
        this.O = new g6();
        this.M = g6Var;
        this.N = o1Var;
        b bVar = sbVar.y;
        this.s = bVar;
        this.K = sbVar;
        this.v = sbVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        k6 k6Var = new k6(this, getContext());
        this.P = k6Var;
        a6 a6Var = new a6(this, context, bVar);
        this.r = a6Var;
        a6Var.setClipToPadding(false);
        this.J = new rl0(a6Var, true);
        b00 b00Var = new b00(a6Var, 0);
        this.x = b00Var;
        a6Var.setLayoutManager(b00Var);
        a6Var.setNestedScrollingEnabled(true);
        q6 q6Var = new q6(this);
        this.w = q6Var;
        a6Var.setAdapter(q6Var);
        new SparseArray();
        new HashMap();
        addView(a6Var);
        this.d = new a5.a(a6Var);
        a6Var.setOnScrollListener(new b6(this));
        a6Var.setOnItemClickListener(new z5(0, this, sbVar));
        a6Var.setOnItemLongClickListener(new e6(this, sbVar));
        q6Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.g6.h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.g6.w0(i10, bVar), 0}));
        frameLayout.addView(view, w7.z5.a(8.0f, 0.0f, this.e - 8, 0.0f, 0.0f, -1, 0));
        View view2 = new View(getContext());
        this.b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i10, bVar));
        frameLayout.addView(view2, w7.z5.a(10.0f, 0.0f, this.e - 17, 0.0f, 0.0f, -1, 0));
        frameLayout.addView(k6Var);
        frameLayout.addView(textView);
        f6 f6Var = new f6(this, getContext(), bVar);
        this.L = f6Var;
        f6Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(f6Var, w7.z5.a(-1.0f, 0.0f, 36.0f, 0.0f, 0.0f, -1, 51));
        addView(frameLayout);
    }

    public static void a(w6 w6Var) {
        new sg.y0(w6Var.K.f, 14, false).show();
    }

    public static void b(w6 w6Var) {
        v6 v6Var = w6Var.E;
        if (v6Var != null) {
            v6Var.r.remove(w6Var);
        }
        v6 v6Var2 = w6Var.F;
        w6Var.E = v6Var2;
        if (v6Var2 == null) {
            return;
        }
        ArrayList arrayList = v6Var2.r;
        if (!arrayList.contains(w6Var)) {
            arrayList.add(w6Var);
        }
        w6Var.E.e(w6Var.O, w6Var.T, w6Var.S);
        w6Var.w.E();
        w6Var.x.h1(0, (int) (w6Var.getTopOffset() - w6Var.r.getPaddingTop()));
    }

    public static void f(int i10, long j10, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.x.f(storyItem.dialogId);
        v6 v6Var = sparseArray == null ? null : (v6) sparseArray.get(storyItem.id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i11 = storyViews == null ? 0 : storyViews.views_count;
        if (v6Var == null || v6Var.a != i11) {
            if (v6Var != null) {
                v6Var.d();
            }
            v6 v6Var2 = new v6(i10, j10, storyItem);
            v6Var2.c();
            if (sparseArray == null) {
                a0.h hVar = MessagesController.getInstance(i10).storiesController.x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.id, v6Var2);
        }
    }

    public final void c() {
        if (this.E == null || this.x.N0() <= this.w.c.size() - 10) {
            return;
        }
        this.E.c();
    }

    public final boolean d(TL_stories.StoryView storyView) {
        di.k8 k8Var;
        di.ca caVar;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        d7 d7Var = this.y;
        if (d7Var != null) {
            TL_stories.StoryItem storyItem = d7Var.a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new di.ca(i10, storyItem.privacy);
                }
                return this.y.a.parsedPrivacy.b(user);
            }
            w8 w8Var = d7Var.b;
            if (w8Var != null && (k8Var = w8Var.c) != null && (caVar = k8Var.E0) != null) {
                return caVar.b(user);
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
                            d7 d7Var = this.y;
                            d7Var.b = null;
                            d7Var.a = storyItem;
                            g(this.W, d7Var);
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
            a6 a6Var = this.r;
            if (i12 >= a6Var.getChildCount()) {
                return;
            }
            View childAt = a6Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Cells.o6) && (R = RecyclerView.R(childAt)) >= 0) {
                q6 q6Var = this.w;
                if (R < q6Var.c.size()) {
                    ((org.telegram.ui.Cells.o6) childAt).a(d(((l6) q6Var.c.get(R)).b) ? 1.0f : 0.5f, true);
                }
            }
            i12++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a6 a6Var;
        View view = null;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            a6Var = this.r;
            if (i11 >= a6Var.getChildCount()) {
                break;
            }
            View childAt = a6Var.getChildAt(i11);
            int S = RecyclerView.S(childAt);
            if (S < i10 || i10 == -1) {
                view = childAt;
                i10 = S;
            }
            i11++;
        }
        int max = i10 == 0 ? (int) Math.max(0.0f, view.getY()) : i10 > 0 ? 0 : a6Var.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f7 = max;
        if (frameLayout.getTranslationY() != f7) {
            frameLayout.setTranslationY(f7);
            a7 a7Var = (a7) this;
            int intValue = ((Integer) a7Var.getTag()).intValue();
            e7 e7Var = a7Var.a0.e;
            x6 x6Var = e7Var.h;
            if (intValue == e7Var.E.getCurrentItem()) {
                x6Var.setAlpha(Utilities.clamp(f7 / e7Var.d, 1.0f, 0.0f));
                x6Var.setTranslationY((-(e7Var.d - f7)) / 2.0f);
            }
        }
        this.U.setBounds(-AndroidUtilities.dp(6.0f), max, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != a6Var.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = a6Var.getPaddingTop() / 2.0f;
                a5.a aVar = this.d;
                if (translationY > paddingTop) {
                    aVar.z((int) (-(a6Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    aVar.z((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.r) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0, AndroidUtilities.dp(this.e), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    public final void e(v6 v6Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        q6 q6Var = this.w;
        int size = q6Var.c.size();
        g6 g6Var = this.O;
        if (TextUtils.isEmpty(g6Var.c) && !g6Var.b) {
            i();
        }
        q6Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = v6Var.i;
            if (v6Var != this.E || arrayList == null || this.H >= arrayList.size()) {
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

    public final void g(long j10, d7 d7Var) {
        this.W = j10;
        this.y = d7Var;
        i();
        h(false);
        if (d7Var == null || d7Var.a == null) {
            return;
        }
        NotificationsController.getInstance(this.v).processSeenStoryReactions(j10, d7Var.a.id);
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        g6 g6Var = this.O;
        boolean z11 = g6Var.b;
        k6 k6Var = this.P;
        if (z11 != k6Var.s || !z10) {
            ValueAnimator valueAnimator = k6Var.w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                k6Var.w.cancel();
            }
            k6Var.s = z11 ? 1 : 0;
            if (z10) {
                k6Var.e.set(k6Var.n);
                k6Var.f = k6Var.c.getAlpha();
                k6Var.h = k6Var.d.getAlpha();
                k6Var.r = 0.0f;
                k6Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                k6Var.w = ofFloat;
                ofFloat.addUpdateListener(new ah.c0(k6Var, 11));
                k6Var.w.addListener(new ah.b(k6Var, 11));
                k6Var.w.setDuration(250L);
                k6Var.w.setInterpolator(es.f);
                k6Var.w.start();
            } else {
                k6Var.r = 1.0f;
                k6Var.invalidate();
            }
        }
        boolean z12 = g6Var.a;
        rm0 rm0Var = k6Var.v;
        if (z12) {
            v6 v6Var = this.E;
            i10 = (v6Var == null || !v6Var.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        rm0Var.a(i10, z10);
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
        f6 f6Var = this.L;
        k6 k6Var = this.P;
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
            v6 v6Var = sparseArray != null ? (v6) sparseArray.get(storyItem.id) : null;
            this.F = v6Var;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i12 = storyViews2 == null ? 0 : storyViews2.views_count;
            g6 g6Var = this.O;
            if (v6Var == null || !(v6Var.f || v6Var.a == i12)) {
                if (v6Var != null) {
                    v6Var.d();
                }
                v6 v6Var2 = new v6(i11, this.W, storyItem);
                this.F = v6Var2;
                v6Var2.e(g6Var, this.T, this.S);
                this.F.c();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.F);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.F);
                    MessagesController.getInstance(i11).storiesController.x.k(sparseArray2, storyItem.dialogId);
                }
            } else {
                v6Var.e(g6Var, this.T, this.S);
            }
            v6 v6Var3 = this.E;
            if (v6Var3 != null) {
                v6Var3.r.remove(this);
            }
            v6 v6Var4 = this.F;
            this.E = v6Var4;
            if (v6Var4 != null && this.I) {
                ArrayList arrayList = v6Var4.r;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            v6 v6Var5 = this.E;
            if (v6Var5 == null || !v6Var5.j || UserConfig.getInstance(i11).isPremium()) {
                v6 v6Var6 = this.E;
                if (v6Var6.e || v6Var6.m || !v6Var6.g.isEmpty() || !this.E.i.isEmpty() || !TextUtils.isEmpty(this.E.s.c)) {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.R = false;
                        this.S = false;
                        this.T = false;
                        textView.setText(LocaleController.getString(this.E.f ? R.string.Reactions : R.string.Viewers));
                        f6Var.setVisibility(8);
                        k6Var.setVisibility(8);
                        this.e = 46;
                    } else {
                        k6Var.setVisibility(0);
                        v6 v6Var7 = this.E;
                        if (v6Var7.k) {
                            textView.setText(LocaleController.getString(v6Var7.f ? R.string.Reactions : R.string.Viewers));
                            this.R = false;
                            this.S = false;
                            this.T = false;
                        } else {
                            if (v6Var7.b() < 20 && this.E.b() < storyItem.views.views_count) {
                                v6 v6Var8 = this.E;
                                if (!v6Var8.e && !v6Var8.m) {
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
                        f6Var.setVisibility(this.R ? 0 : 8);
                        this.e = this.R ? 96 : 46;
                    }
                }
            }
            this.R = false;
            this.S = false;
            this.T = false;
            textView.setText(LocaleController.getString(this.E.f ? R.string.Reactions : R.string.Viewers));
            f6Var.setVisibility(8);
            k6Var.setVisibility(8);
            this.e = 46;
        } else {
            this.e = 46;
            textView.setText(LocaleController.getString(R.string.UploadingStory));
            f6Var.setVisibility(8);
            k6Var.setVisibility(8);
        }
        k6Var.a.setVisibility(this.S ? 0 : 8);
        k6Var.c.setVisibility(this.T ? 0 : 8);
        k6Var.d.setVisibility(this.T ? 0 : 8);
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
        v6 v6Var = this.E;
        if (v6Var != null) {
            ArrayList arrayList = v6Var.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.p.clear();
        }
        this.w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        sc.a(this, new ah.m0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        v6 v6Var = this.E;
        if (v6Var != null) {
            v6Var.r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        sc.h(this);
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
        a6 a6Var = this.r;
        if (f7 != a6Var.getPaddingBottom()) {
            a6Var.setPadding(0, (int) f7, 0, 0);
            a6Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }
}
