package lh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class c5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public b5 A;
    public b5 B;
    public n6 C;
    public int D;
    public boolean E;
    public final pk0 F;
    public final i9 G;
    public final n4 H;
    public final o4 I;
    public final kg.i J;
    public final o4 K;
    public final s4 L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public Drawable Q;
    public boolean R;
    public long S;
    public final View a;
    public final View b;
    public final FrameLayout c;
    public final ag.j2 d;
    public int e;
    public r4 f;
    public final TextView h;
    public int n;
    public final j4 r;
    public final b s;
    public final int v;
    public final y4 w;
    public final kz x;
    public k5 y;

    public c5(i9 i9Var, Context context, o4 o4Var, kg.i iVar) {
        super(context);
        this.e = 96;
        this.K = new o4();
        this.I = o4Var;
        this.J = iVar;
        b bVar = i9Var.y;
        this.s = bVar;
        this.G = i9Var;
        this.v = i9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        s4 s4Var = new s4(this, getContext());
        this.L = s4Var;
        j4 j4Var = new j4(this, context, bVar);
        this.r = j4Var;
        j4Var.setClipToPadding(false);
        this.F = new pk0(j4Var, true);
        kz kzVar = new kz(j4Var, 0);
        this.x = kzVar;
        j4Var.setLayoutManager(kzVar);
        j4Var.setNestedScrollingEnabled(true);
        y4 y4Var = new y4(this);
        this.w = y4Var;
        j4Var.setAdapter(y4Var);
        new SparseArray();
        new HashMap();
        addView(j4Var);
        this.d = new ag.j2(j4Var);
        j4Var.setOnScrollListener(new cg.g2(this, 12));
        j4Var.setOnItemClickListener(new eg.w0(2, this, i9Var));
        j4Var.setOnItemLongClickListener(new m4(this, i9Var));
        y4Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.g6.h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.g6.v0(i10, bVar), 0}));
        frameLayout.addView(view, i7.f6.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i10, bVar));
        frameLayout.addView(view2, i7.f6.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(s4Var);
        frameLayout.addView(textView);
        n4 n4Var = new n4(this, getContext(), bVar);
        this.H = n4Var;
        n4Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(n4Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(c5 c5Var) {
        new cg.p1(c5Var.G.f, 14, false).show();
    }

    public static void b(c5 c5Var) {
        b5 b5Var = c5Var.A;
        if (b5Var != null) {
            b5Var.r.remove(c5Var);
        }
        b5 b5Var2 = c5Var.B;
        c5Var.A = b5Var2;
        if (b5Var2 == null) {
            return;
        }
        ArrayList arrayList = b5Var2.r;
        if (!arrayList.contains(c5Var)) {
            arrayList.add(c5Var);
        }
        c5Var.A.e(c5Var.K, c5Var.P, c5Var.O);
        c5Var.w.E();
        c5Var.x.h1(0, (int) (c5Var.getTopOffset() - c5Var.r.getPaddingTop()));
    }

    public static void f(int i10, long j10, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.x.f(storyItem.dialogId);
        b5 b5Var = sparseArray == null ? null : (b5) sparseArray.get(storyItem.id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i11 = storyViews == null ? 0 : storyViews.views_count;
        if (b5Var == null || b5Var.a != i11) {
            if (b5Var != null) {
                b5Var.d();
            }
            b5 b5Var2 = new b5(i10, j10, storyItem);
            b5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = MessagesController.getInstance(i10).storiesController.x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.id, b5Var2);
        }
    }

    public final void c() {
        if (this.A == null || this.x.N0() <= this.w.c.size() - 10) {
            return;
        }
        this.A.c();
    }

    public final boolean d(TL_stories.StoryView storyView) {
        nh.o7 o7Var;
        nh.c9 c9Var;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        k5 k5Var = this.y;
        if (k5Var != null) {
            TL_stories.StoryItem storyItem = k5Var.a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new nh.c9(i10, storyItem.privacy);
                }
                return this.y.a.parsedPrivacy.b(user);
            }
            r6 r6Var = k5Var.b;
            if (r6Var != null && (o7Var = r6Var.c) != null && (c9Var = o7Var.E0) != null) {
                return c9Var.b(user);
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
                TL_stories.PeerStories y8 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y8 != null) {
                    while (i12 < y8.stories.size()) {
                        TL_stories.StoryItem storyItem = y8.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.y.b.e)) {
                            k5 k5Var = this.y;
                            k5Var.b = null;
                            k5Var.a = storyItem;
                            g(this.S, k5Var);
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
            j4 j4Var = this.r;
            if (i12 >= j4Var.getChildCount()) {
                return;
            }
            View childAt = j4Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Cells.l6) && (R = RecyclerView.R(childAt)) >= 0) {
                y4 y4Var = this.w;
                if (R < y4Var.c.size()) {
                    ((org.telegram.ui.Cells.l6) childAt).a(d(((t4) y4Var.c.get(R)).b) ? 1.0f : 0.5f, true);
                }
            }
            i12++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j4 j4Var;
        View view = null;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            j4Var = this.r;
            if (i10 >= j4Var.getChildCount()) {
                break;
            }
            View childAt = j4Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (S < i11 || i11 == -1) {
                view = childAt;
                i11 = S;
            }
            i10++;
        }
        int max = i11 == 0 ? (int) Math.max(0.0f, view.getY()) : i11 > 0 ? 0 : j4Var.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f9 = max;
        if (frameLayout.getTranslationY() != f9) {
            frameLayout.setTranslationY(f9);
            h5 h5Var = (h5) this;
            int intValue = ((Integer) h5Var.getTag()).intValue();
            l5 l5Var = h5Var.T.e;
            e5 e5Var = l5Var.h;
            if (intValue == l5Var.A.getCurrentItem()) {
                e5Var.setAlpha(Utilities.clamp(f9 / l5Var.d, 1.0f, 0.0f));
                e5Var.setTranslationY((-(l5Var.d - f9)) / 2.0f);
            }
        }
        this.Q.setBounds(-AndroidUtilities.dp(6.0f), max, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.Q.draw(canvas);
        if (this.R) {
            this.R = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != j4Var.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = j4Var.getPaddingTop() / 2.0f;
                ag.j2 j2Var = this.d;
                if (translationY > paddingTop) {
                    j2Var.m((int) (-(j4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    j2Var.m((int) frameLayout.getTranslationY());
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

    public final void e(b5 b5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        y4 y4Var = this.w;
        int size = y4Var.c.size();
        o4 o4Var = this.K;
        if (TextUtils.isEmpty(o4Var.c) && !o4Var.b) {
            i();
        }
        y4Var.E();
        this.F.b(size - 1);
        c();
        if (this.C != null) {
            ArrayList arrayList = b5Var.i;
            if (b5Var != this.A || arrayList == null || this.D >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = this.D; i10 < arrayList.size(); i10++) {
                TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i10);
                if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                    arrayList2.add(storyItem);
                }
            }
            this.D = arrayList.size();
            if (arrayList2.isEmpty()) {
                return;
            }
            this.C.F(arrayList2);
        }
    }

    public final void g(long j10, k5 k5Var) {
        this.S = j10;
        this.y = k5Var;
        i();
        h(false);
        if (k5Var == null || k5Var.a == null) {
            return;
        }
        NotificationsController.getInstance(this.v).processSeenStoryReactions(j10, k5Var.a.id);
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        o4 o4Var = this.K;
        boolean z11 = o4Var.b;
        s4 s4Var = this.L;
        if (z11 != s4Var.s || !z10) {
            ValueAnimator valueAnimator = s4Var.w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                s4Var.w.cancel();
            }
            s4Var.s = z11 ? 1 : 0;
            if (z10) {
                s4Var.e.set(s4Var.n);
                s4Var.f = s4Var.c.getAlpha();
                s4Var.h = s4Var.d.getAlpha();
                s4Var.r = 0.0f;
                s4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                s4Var.w = ofFloat;
                ofFloat.addUpdateListener(new bg.q1(s4Var, 29));
                s4Var.w.addListener(new ag.m0(s4Var, 22));
                s4Var.w.setDuration(250L);
                s4Var.w.setInterpolator(jr.f);
                s4Var.w.start();
            } else {
                s4Var.r = 1.0f;
                s4Var.invalidate();
            }
        }
        boolean z12 = o4Var.a;
        ol0 ol0Var = s4Var.v;
        if (z12) {
            b5 b5Var = this.A;
            i10 = (b5Var == null || !b5Var.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        ol0Var.a(i10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        this.N = false;
        this.P = false;
        this.O = false;
        TL_stories.StoryItem storyItem = this.y.a;
        n4 n4Var = this.H;
        s4 s4Var = this.L;
        TextView textView = this.h;
        if (storyItem != null) {
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews != null) {
                int i10 = storyViews.views_count;
                this.N = i10 >= 15;
                this.O = storyViews.reactions_count >= (BuildVars.DEBUG_PRIVATE_VERSION ? 5 : 10);
                this.P = (storyItem.dialogId < 0 || i10 < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
            }
            int i11 = this.v;
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i11).storiesController.x.f(storyItem.dialogId);
            b5 b5Var = sparseArray != null ? (b5) sparseArray.get(storyItem.id) : null;
            this.B = b5Var;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i12 = storyViews2 == null ? 0 : storyViews2.views_count;
            o4 o4Var = this.K;
            if (b5Var == null || !(b5Var.f || b5Var.a == i12)) {
                if (b5Var != null) {
                    b5Var.d();
                }
                b5 b5Var2 = new b5(i11, this.S, storyItem);
                this.B = b5Var2;
                b5Var2.e(o4Var, this.P, this.O);
                this.B.c();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.B);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.B);
                    MessagesController.getInstance(i11).storiesController.x.k(sparseArray2, storyItem.dialogId);
                }
            } else {
                b5Var.e(o4Var, this.P, this.O);
            }
            b5 b5Var3 = this.A;
            if (b5Var3 != null) {
                b5Var3.r.remove(this);
            }
            b5 b5Var4 = this.B;
            this.A = b5Var4;
            if (b5Var4 != null && this.E) {
                ArrayList arrayList = b5Var4.r;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            b5 b5Var5 = this.A;
            if (b5Var5 == null || !b5Var5.j || UserConfig.getInstance(i11).isPremium()) {
                b5 b5Var6 = this.A;
                if (b5Var6.e || b5Var6.m || !b5Var6.g.isEmpty() || !this.A.i.isEmpty() || !TextUtils.isEmpty(this.A.s.c)) {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.N = false;
                        this.O = false;
                        this.P = false;
                        textView.setText(LocaleController.getString(this.A.f ? R.string.Reactions : R.string.Viewers));
                        n4Var.setVisibility(8);
                        s4Var.setVisibility(8);
                        this.e = 46;
                    } else {
                        s4Var.setVisibility(0);
                        b5 b5Var7 = this.A;
                        if (b5Var7.k) {
                            textView.setText(LocaleController.getString(b5Var7.f ? R.string.Reactions : R.string.Viewers));
                            this.N = false;
                            this.O = false;
                            this.P = false;
                        } else {
                            if (b5Var7.b() < 20 && this.A.b() < storyItem.views.views_count) {
                                b5 b5Var8 = this.A;
                                if (!b5Var8.e && !b5Var8.m) {
                                    this.N = false;
                                    this.O = false;
                                    this.P = false;
                                    textView.setText(LocaleController.getString(!this.A.f ? R.string.Reactions : R.string.Viewers));
                                }
                            }
                            this.N = !this.A.f && storyItem.views.views_count >= 15;
                            TL_stories.StoryViews storyViews4 = storyItem.views;
                            this.O = storyViews4.reactions_count >= (BuildVars.DEBUG_VERSION ? 5 : 10);
                            this.P = (storyItem.dialogId < 0 || storyViews4.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                            textView.setText(LocaleController.getString(!this.A.f ? R.string.Reactions : R.string.Viewers));
                        }
                        n4Var.setVisibility(this.N ? 0 : 8);
                        this.e = this.N ? 96 : 46;
                    }
                }
            }
            this.N = false;
            this.O = false;
            this.P = false;
            textView.setText(LocaleController.getString(this.A.f ? R.string.Reactions : R.string.Viewers));
            n4Var.setVisibility(8);
            s4Var.setVisibility(8);
            this.e = 46;
        } else {
            this.e = 46;
            textView.setText(LocaleController.getString(R.string.UploadingStory));
            n4Var.setVisibility(8);
            s4Var.setVisibility(8);
        }
        s4Var.a.setVisibility(this.O ? 0 : 8);
        s4Var.c.setVisibility(this.P ? 0 : 8);
        s4Var.d.setVisibility(this.P ? 0 : 8);
        if (this.P) {
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
        this.E = true;
        b5 b5Var = this.A;
        if (b5Var != null) {
            ArrayList arrayList = b5Var.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.A.p.clear();
        }
        this.w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        mc.a(this, new ih.u0(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E = false;
        b5 b5Var = this.A;
        if (b5Var != null) {
            b5Var.r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        mc.h(this);
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

    public void setListBottomPadding(float f9) {
        j4 j4Var = this.r;
        if (f9 != j4Var.getPaddingBottom()) {
            j4Var.setPadding(0, (int) f9, 0, 0);
            j4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.Q = drawable;
    }
}
