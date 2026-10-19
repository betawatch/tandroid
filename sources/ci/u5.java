package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public abstract class u5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public t5 E;
    public t5 F;
    public d7 G;
    public int H;
    public boolean I;
    public final nl0 J;
    public final aa K;
    public final e5 L;
    public final f5 M;
    public final ai.r0 N;
    public final f5 O;
    public final j5 P;
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
    public i5 f;
    public final TextView h;
    public int n;
    public final z4 r;
    public final b s;
    public final int v;
    public final p5 w;
    public final yz x;
    public b6 y;

    public u5(aa aaVar, Context context, f5 f5Var, ai.r0 r0Var) {
        super(context);
        this.e = 96;
        this.O = new f5();
        this.M = f5Var;
        this.N = r0Var;
        b bVar = aaVar.y;
        this.s = bVar;
        this.K = aaVar;
        this.v = aaVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        j5 j5Var = new j5(this, getContext());
        this.P = j5Var;
        z4 z4Var = new z4(this, context, bVar);
        this.r = z4Var;
        z4Var.setClipToPadding(false);
        this.J = new nl0(z4Var, true);
        yz yzVar = new yz(z4Var, 0);
        this.x = yzVar;
        z4Var.setLayoutManager(yzVar);
        z4Var.setNestedScrollingEnabled(true);
        p5 p5Var = new p5(this);
        this.w = p5Var;
        z4Var.setAdapter(p5Var);
        new SparseArray();
        new HashMap();
        addView(z4Var);
        this.d = new a5.a(z4Var);
        z4Var.setOnScrollListener(new a5(this));
        z4Var.setOnItemClickListener(new y4(0, this, aaVar));
        z4Var.setOnItemLongClickListener(new d5(this, aaVar));
        p5Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.h6.h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.h6.w0(i10, bVar), 0}));
        frameLayout.addView(view, w7.z5.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i10, bVar));
        frameLayout.addView(view2, w7.z5.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(j5Var);
        frameLayout.addView(textView);
        e5 e5Var = new e5(this, getContext(), bVar);
        this.L = e5Var;
        e5Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(e5Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(u5 u5Var) {
        new sg.y0(u5Var.K.f, 14, false).show();
    }

    public static void b(u5 u5Var) {
        t5 t5Var = u5Var.E;
        if (t5Var != null) {
            t5Var.r.remove(u5Var);
        }
        t5 t5Var2 = u5Var.F;
        u5Var.E = t5Var2;
        if (t5Var2 == null) {
            return;
        }
        ArrayList arrayList = t5Var2.r;
        if (!arrayList.contains(u5Var)) {
            arrayList.add(u5Var);
        }
        u5Var.E.e(u5Var.O, u5Var.T, u5Var.S);
        u5Var.w.E();
        u5Var.x.h1(0, (int) (u5Var.getTopOffset() - u5Var.r.getPaddingTop()));
    }

    public static void f(int i10, long j10, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.x.f(storyItem.dialogId);
        t5 t5Var = sparseArray == null ? null : (t5) sparseArray.get(storyItem.id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i11 = storyViews == null ? 0 : storyViews.views_count;
        if (t5Var == null || t5Var.a != i11) {
            if (t5Var != null) {
                t5Var.d();
            }
            t5 t5Var2 = new t5(i10, j10, storyItem);
            t5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = MessagesController.getInstance(i10).storiesController.x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.id, t5Var2);
        }
    }

    public final void c() {
        if (this.E == null || this.x.N0() <= this.w.c.size() - 10) {
            return;
        }
        this.E.c();
    }

    public final boolean d(TL_stories.StoryView storyView) {
        ei.a8 a8Var;
        ei.p9 p9Var;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        b6 b6Var = this.y;
        if (b6Var != null) {
            TL_stories.StoryItem storyItem = b6Var.a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new ei.p9(i10, storyItem.privacy);
                }
                return this.y.a.parsedPrivacy.b(user);
            }
            h7 h7Var = b6Var.b;
            if (h7Var != null && (a8Var = h7Var.c) != null && (p9Var = a8Var.E0) != null) {
                return p9Var.b(user);
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
                            b6 b6Var = this.y;
                            b6Var.b = null;
                            b6Var.a = storyItem;
                            g(this.W, b6Var);
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
            z4 z4Var = this.r;
            if (i12 >= z4Var.getChildCount()) {
                return;
            }
            View childAt = z4Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Cells.n6) && (R = RecyclerView.R(childAt)) >= 0) {
                p5 p5Var = this.w;
                if (R < p5Var.c.size()) {
                    ((org.telegram.ui.Cells.n6) childAt).a(d(((k5) p5Var.c.get(R)).b) ? 1.0f : 0.5f, true);
                }
            }
            i12++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        z4 z4Var;
        View view = null;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            z4Var = this.r;
            if (i11 >= z4Var.getChildCount()) {
                break;
            }
            View childAt = z4Var.getChildAt(i11);
            int S = RecyclerView.S(childAt);
            if (S < i10 || i10 == -1) {
                view = childAt;
                i10 = S;
            }
            i11++;
        }
        int max = i10 == 0 ? (int) Math.max(0.0f, view.getY()) : i10 > 0 ? 0 : z4Var.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f7 = max;
        if (frameLayout.getTranslationY() != f7) {
            frameLayout.setTranslationY(f7);
            y5 y5Var = (y5) this;
            int intValue = ((Integer) y5Var.getTag()).intValue();
            c6 c6Var = y5Var.a0.e;
            v5 v5Var = c6Var.h;
            if (intValue == c6Var.E.getCurrentItem()) {
                v5Var.setAlpha(Utilities.clamp(f7 / c6Var.d, 1.0f, 0.0f));
                v5Var.setTranslationY((-(c6Var.d - f7)) / 2.0f);
            }
        }
        this.U.setBounds(-AndroidUtilities.dp(6.0f), max, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != z4Var.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = z4Var.getPaddingTop() / 2.0f;
                a5.a aVar = this.d;
                if (translationY > paddingTop) {
                    aVar.z((int) (-(z4Var.getPaddingTop() - frameLayout.getTranslationY())));
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

    public final void e(t5 t5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        p5 p5Var = this.w;
        int size = p5Var.c.size();
        f5 f5Var = this.O;
        if (TextUtils.isEmpty(f5Var.c) && !f5Var.b) {
            i();
        }
        p5Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = t5Var.i;
            if (t5Var != this.E || arrayList == null || this.H >= arrayList.size()) {
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

    public final void g(long j10, b6 b6Var) {
        this.W = j10;
        this.y = b6Var;
        i();
        h(false);
        if (b6Var == null || b6Var.a == null) {
            return;
        }
        NotificationsController.getInstance(this.v).processSeenStoryReactions(j10, b6Var.a.id);
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        f5 f5Var = this.O;
        boolean z11 = f5Var.b;
        j5 j5Var = this.P;
        if (z11 != j5Var.s || !z10) {
            ValueAnimator valueAnimator = j5Var.w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                j5Var.w.cancel();
            }
            j5Var.s = z11 ? 1 : 0;
            if (z10) {
                j5Var.e.set(j5Var.n);
                j5Var.f = j5Var.c.getAlpha();
                j5Var.h = j5Var.d.getAlpha();
                j5Var.r = 0.0f;
                j5Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                j5Var.w = ofFloat;
                ofFloat.addUpdateListener(new ah.c0(j5Var, 18));
                j5Var.w.addListener(new ah.b(j5Var, 13));
                j5Var.w.setDuration(250L);
                j5Var.w.setInterpolator(bs.f);
                j5Var.w.start();
            } else {
                j5Var.r = 1.0f;
                j5Var.invalidate();
            }
        }
        boolean z12 = f5Var.a;
        nm0 nm0Var = j5Var.v;
        if (z12) {
            t5 t5Var = this.E;
            i10 = (t5Var == null || !t5Var.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        nm0Var.a(i10, z10);
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
        e5 e5Var = this.L;
        j5 j5Var = this.P;
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
            t5 t5Var = sparseArray != null ? (t5) sparseArray.get(storyItem.id) : null;
            this.F = t5Var;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i12 = storyViews2 == null ? 0 : storyViews2.views_count;
            f5 f5Var = this.O;
            if (t5Var == null || !(t5Var.f || t5Var.a == i12)) {
                if (t5Var != null) {
                    t5Var.d();
                }
                t5 t5Var2 = new t5(i11, this.W, storyItem);
                this.F = t5Var2;
                t5Var2.e(f5Var, this.T, this.S);
                this.F.c();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.F);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.F);
                    MessagesController.getInstance(i11).storiesController.x.k(sparseArray2, storyItem.dialogId);
                }
            } else {
                t5Var.e(f5Var, this.T, this.S);
            }
            t5 t5Var3 = this.E;
            if (t5Var3 != null) {
                t5Var3.r.remove(this);
            }
            t5 t5Var4 = this.F;
            this.E = t5Var4;
            if (t5Var4 != null && this.I) {
                ArrayList arrayList = t5Var4.r;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            t5 t5Var5 = this.E;
            if (t5Var5 == null || !t5Var5.j || UserConfig.getInstance(i11).isPremium()) {
                t5 t5Var6 = this.E;
                if (t5Var6.e || t5Var6.m || !t5Var6.g.isEmpty() || !this.E.i.isEmpty() || !TextUtils.isEmpty(this.E.s.c)) {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.R = false;
                        this.S = false;
                        this.T = false;
                        textView.setText(LocaleController.getString(this.E.f ? R.string.Reactions : R.string.Viewers));
                        e5Var.setVisibility(8);
                        j5Var.setVisibility(8);
                        this.e = 46;
                    } else {
                        j5Var.setVisibility(0);
                        t5 t5Var7 = this.E;
                        if (t5Var7.k) {
                            textView.setText(LocaleController.getString(t5Var7.f ? R.string.Reactions : R.string.Viewers));
                            this.R = false;
                            this.S = false;
                            this.T = false;
                        } else {
                            if (t5Var7.b() < 20 && this.E.b() < storyItem.views.views_count) {
                                t5 t5Var8 = this.E;
                                if (!t5Var8.e && !t5Var8.m) {
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
                        e5Var.setVisibility(this.R ? 0 : 8);
                        this.e = this.R ? 96 : 46;
                    }
                }
            }
            this.R = false;
            this.S = false;
            this.T = false;
            textView.setText(LocaleController.getString(this.E.f ? R.string.Reactions : R.string.Viewers));
            e5Var.setVisibility(8);
            j5Var.setVisibility(8);
            this.e = 46;
        } else {
            this.e = 46;
            textView.setText(LocaleController.getString(R.string.UploadingStory));
            e5Var.setVisibility(8);
            j5Var.setVisibility(8);
        }
        j5Var.a.setVisibility(this.S ? 0 : 8);
        j5Var.c.setVisibility(this.T ? 0 : 8);
        j5Var.d.setVisibility(this.T ? 0 : 8);
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
        t5 t5Var = this.E;
        if (t5Var != null) {
            ArrayList arrayList = t5Var.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.p.clear();
        }
        this.w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        qc.a(this, new ah.m0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        t5 t5Var = this.E;
        if (t5Var != null) {
            t5Var.r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        qc.h(this);
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
        z4 z4Var = this.r;
        if (f7 != z4Var.getPaddingBottom()) {
            z4Var.setPadding(0, (int) f7, 0, 0);
            z4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }
}
