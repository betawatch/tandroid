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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.ql0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public abstract class s6 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public r6 E;
    public r6 F;
    public o8 G;
    public int H;
    public boolean I;
    public final qk0 J;
    public final pb K;
    public final c6 L;
    public final d6 M;
    public final ah.m N;
    public final d6 O;
    public final h6 P;
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
    public g6 f;
    public final TextView h;
    public int n;
    public final y5 r;
    public final b s;
    public final int v;
    public final n6 w;
    public final pz x;
    public z6 y;

    public s6(pb pbVar, Context context, d6 d6Var, ah.m mVar) {
        super(context);
        this.e = 96;
        this.O = new d6();
        this.M = d6Var;
        this.N = mVar;
        b bVar = pbVar.y;
        this.s = bVar;
        this.K = pbVar;
        this.v = pbVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        h6 h6Var = new h6(this, getContext());
        this.P = h6Var;
        y5 y5Var = new y5(this, context, bVar);
        this.r = y5Var;
        y5Var.setClipToPadding(false);
        this.J = new qk0(y5Var, true);
        pz pzVar = new pz(y5Var, 0);
        this.x = pzVar;
        y5Var.setLayoutManager(pzVar);
        y5Var.setNestedScrollingEnabled(true);
        n6 n6Var = new n6(this);
        this.w = n6Var;
        y5Var.setAdapter(n6Var);
        new SparseArray();
        new HashMap();
        addView(y5Var);
        this.d = new a5.a(y5Var);
        y5Var.setOnScrollListener(new ah.e0(this, 2));
        y5Var.setOnItemClickListener(new x5(0, this, pbVar));
        y5Var.setOnItemLongClickListener(new b6(this, pbVar));
        n6Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.v0(i10, bVar), 0}));
        frameLayout.addView(view, w7.x5.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i10, bVar));
        frameLayout.addView(view2, w7.x5.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(h6Var);
        frameLayout.addView(textView);
        c6 c6Var = new c6(this, getContext(), bVar);
        this.L = c6Var;
        c6Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(c6Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(s6 s6Var) {
        new sg.a1(s6Var.K.f, 14, false).show();
    }

    public static void b(s6 s6Var) {
        r6 r6Var = s6Var.E;
        if (r6Var != null) {
            r6Var.r.remove(s6Var);
        }
        r6 r6Var2 = s6Var.F;
        s6Var.E = r6Var2;
        if (r6Var2 == null) {
            return;
        }
        ArrayList arrayList = r6Var2.r;
        if (!arrayList.contains(s6Var)) {
            arrayList.add(s6Var);
        }
        s6Var.E.e(s6Var.O, s6Var.T, s6Var.S);
        s6Var.w.E();
        s6Var.x.h1(0, (int) (s6Var.getTopOffset() - s6Var.r.getPaddingTop()));
    }

    public static void f(int i10, long j3, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.x.f(storyItem.dialogId);
        r6 r6Var = sparseArray == null ? null : (r6) sparseArray.get(storyItem.id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i11 = storyViews == null ? 0 : storyViews.views_count;
        if (r6Var == null || r6Var.a != i11) {
            if (r6Var != null) {
                r6Var.d();
            }
            r6 r6Var2 = new r6(i10, j3, storyItem);
            r6Var2.c();
            if (sparseArray == null) {
                a0.i iVar = MessagesController.getInstance(i10).storiesController.x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                iVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.id, r6Var2);
        }
    }

    public final void c() {
        if (this.E == null || this.x.N0() <= this.w.c.size() - 10) {
            return;
        }
        this.E.c();
    }

    public final boolean d(TL_stories.StoryView storyView) {
        di.o8 o8Var;
        di.ga gaVar;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        z6 z6Var = this.y;
        if (z6Var != null) {
            TL_stories.StoryItem storyItem = z6Var.a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new di.ga(i10, storyItem.privacy);
                }
                return this.y.a.parsedPrivacy.b(user);
            }
            t8 t8Var = z6Var.b;
            if (t8Var != null && (o8Var = t8Var.c) != null && (gaVar = o8Var.E0) != null) {
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
                            z6 z6Var = this.y;
                            z6Var.b = null;
                            z6Var.a = storyItem;
                            g(this.W, z6Var);
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
            y5 y5Var = this.r;
            if (i12 >= y5Var.getChildCount()) {
                return;
            }
            View childAt = y5Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Cells.n6) && (R = RecyclerView.R(childAt)) >= 0) {
                n6 n6Var = this.w;
                if (R < n6Var.c.size()) {
                    ((org.telegram.ui.Cells.n6) childAt).a(d(((i6) n6Var.c.get(R)).b) ? 1.0f : 0.5f, true);
                }
            }
            i12++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        y5 y5Var;
        View view = null;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            y5Var = this.r;
            if (i10 >= y5Var.getChildCount()) {
                break;
            }
            View childAt = y5Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (S < i11 || i11 == -1) {
                view = childAt;
                i11 = S;
            }
            i10++;
        }
        int max = i11 == 0 ? (int) Math.max(0.0f, view.getY()) : i11 > 0 ? 0 : y5Var.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f7 = max;
        if (frameLayout.getTranslationY() != f7) {
            frameLayout.setTranslationY(f7);
            w6 w6Var = (w6) this;
            int intValue = ((Integer) w6Var.getTag()).intValue();
            a7 a7Var = w6Var.a0.e;
            t6 t6Var = a7Var.h;
            if (intValue == a7Var.E.getCurrentItem()) {
                t6Var.setAlpha(Utilities.clamp(f7 / a7Var.d, 1.0f, 0.0f));
                t6Var.setTranslationY((-(a7Var.d - f7)) / 2.0f);
            }
        }
        this.U.setBounds(-AndroidUtilities.dp(6.0f), max, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != y5Var.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = y5Var.getPaddingTop() / 2.0f;
                a5.a aVar = this.d;
                if (translationY > paddingTop) {
                    aVar.u((int) (-(y5Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    aVar.u((int) frameLayout.getTranslationY());
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

    public final void e(r6 r6Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        n6 n6Var = this.w;
        int size = n6Var.c.size();
        d6 d6Var = this.O;
        if (TextUtils.isEmpty(d6Var.c) && !d6Var.b) {
            i();
        }
        n6Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = r6Var.i;
            if (r6Var != this.E || arrayList == null || this.H >= arrayList.size()) {
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

    public final void g(long j3, z6 z6Var) {
        this.W = j3;
        this.y = z6Var;
        i();
        h(false);
        if (z6Var == null || z6Var.a == null) {
            return;
        }
        NotificationsController.getInstance(this.v).processSeenStoryReactions(j3, z6Var.a.id);
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        d6 d6Var = this.O;
        boolean z11 = d6Var.b;
        h6 h6Var = this.P;
        if (z11 != h6Var.s || !z10) {
            ValueAnimator valueAnimator = h6Var.w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                h6Var.w.cancel();
            }
            h6Var.s = z11 ? 1 : 0;
            if (z10) {
                h6Var.e.set(h6Var.n);
                h6Var.f = h6Var.c.getAlpha();
                h6Var.h = h6Var.d.getAlpha();
                h6Var.r = 0.0f;
                h6Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                h6Var.w = ofFloat;
                ofFloat.addUpdateListener(new ah.d0(h6Var, 11));
                h6Var.w.addListener(new ah.b(h6Var, 11));
                h6Var.w.setDuration(250L);
                h6Var.w.setInterpolator(pr.f);
                h6Var.w.start();
            } else {
                h6Var.r = 1.0f;
                h6Var.invalidate();
            }
        }
        boolean z12 = d6Var.a;
        ql0 ql0Var = h6Var.v;
        if (z12) {
            r6 r6Var = this.E;
            i10 = (r6Var == null || !r6Var.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
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
        c6 c6Var = this.L;
        h6 h6Var = this.P;
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
            r6 r6Var = sparseArray != null ? (r6) sparseArray.get(storyItem.id) : null;
            this.F = r6Var;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i12 = storyViews2 == null ? 0 : storyViews2.views_count;
            d6 d6Var = this.O;
            if (r6Var == null || !(r6Var.f || r6Var.a == i12)) {
                if (r6Var != null) {
                    r6Var.d();
                }
                r6 r6Var2 = new r6(i11, this.W, storyItem);
                this.F = r6Var2;
                r6Var2.e(d6Var, this.T, this.S);
                this.F.c();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.F);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.F);
                    MessagesController.getInstance(i11).storiesController.x.k(sparseArray2, storyItem.dialogId);
                }
            } else {
                r6Var.e(d6Var, this.T, this.S);
            }
            r6 r6Var3 = this.E;
            if (r6Var3 != null) {
                r6Var3.r.remove(this);
            }
            r6 r6Var4 = this.F;
            this.E = r6Var4;
            if (r6Var4 != null && this.I) {
                ArrayList arrayList = r6Var4.r;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            r6 r6Var5 = this.E;
            if (r6Var5 == null || !r6Var5.j || UserConfig.getInstance(i11).isPremium()) {
                r6 r6Var6 = this.E;
                if (r6Var6.e || r6Var6.m || !r6Var6.g.isEmpty() || !this.E.i.isEmpty() || !TextUtils.isEmpty(this.E.s.c)) {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.R = false;
                        this.S = false;
                        this.T = false;
                        textView.setText(LocaleController.getString(this.E.f ? R.string.Reactions : R.string.Viewers));
                        c6Var.setVisibility(8);
                        h6Var.setVisibility(8);
                        this.e = 46;
                    } else {
                        h6Var.setVisibility(0);
                        r6 r6Var7 = this.E;
                        if (r6Var7.k) {
                            textView.setText(LocaleController.getString(r6Var7.f ? R.string.Reactions : R.string.Viewers));
                            this.R = false;
                            this.S = false;
                            this.T = false;
                        } else {
                            if (r6Var7.b() < 20 && this.E.b() < storyItem.views.views_count) {
                                r6 r6Var8 = this.E;
                                if (!r6Var8.e && !r6Var8.m) {
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
                        c6Var.setVisibility(this.R ? 0 : 8);
                        this.e = this.R ? 96 : 46;
                    }
                }
            }
            this.R = false;
            this.S = false;
            this.T = false;
            textView.setText(LocaleController.getString(this.E.f ? R.string.Reactions : R.string.Viewers));
            c6Var.setVisibility(8);
            h6Var.setVisibility(8);
            this.e = 46;
        } else {
            this.e = 46;
            textView.setText(LocaleController.getString(R.string.UploadingStory));
            c6Var.setVisibility(8);
            h6Var.setVisibility(8);
        }
        h6Var.a.setVisibility(this.S ? 0 : 8);
        h6Var.c.setVisibility(this.T ? 0 : 8);
        h6Var.d.setVisibility(this.T ? 0 : 8);
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
        r6 r6Var = this.E;
        if (r6Var != null) {
            ArrayList arrayList = r6Var.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.p.clear();
        }
        this.w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        qc.a(this, new ah.n0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        r6 r6Var = this.E;
        if (r6Var != null) {
            r6Var.r.remove(this);
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
        y5 y5Var = this.r;
        if (f7 != y5Var.getPaddingBottom()) {
            y5Var.setPadding(0, (int) f7, 0, 0);
            y5Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }
}
