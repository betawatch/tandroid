// default package

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
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class i2a extends FrameLayout implements vlb, jm7 {
    public static final /* synthetic */ int c0 = 0;
    public o2a E;
    public h2a F;
    public h2a G;
    public b4b H;
    public int I;
    public boolean J;
    public final w49 K;
    public final oab L;
    public final u1a M;
    public final v1a N;
    public final eg9 O;
    public final v1a P;
    public final z1a Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Drawable V;
    public boolean W;
    public final View a;
    public long a0;
    public final View b;
    public int b0;
    public final FrameLayout c;
    public final kq d;
    public byte e;
    public y1a f;
    public final TextView h;
    public int n;
    public final q1a r;
    public final r63 s;
    public final int w;
    public final e2a x;
    public final wd4 y;

    public i2a(oab oabVar, Context context, v1a v1aVar, eg9 eg9Var) {
        super(context);
        this.e = (byte) 96;
        this.P = new v1a();
        this.N = v1aVar;
        this.O = eg9Var;
        r63 r63Var = oabVar.E;
        this.s = r63Var;
        this.L = oabVar;
        this.w = oabVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        anb.X(textView, cmb.i5, r63Var);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        textView.setPadding(gm.L(21.0f), gm.L(6.0f), gm.L(21.0f), gm.L(8.0f));
        z1a z1aVar = new z1a(this, getContext());
        this.Q = z1aVar;
        q1a q1aVar = new q1a(this, context, r63Var);
        this.r = q1aVar;
        q1aVar.setClipToPadding(false);
        this.K = new w49(q1aVar, true);
        wd4 wd4Var = new wd4(0, q1aVar);
        this.y = wd4Var;
        q1aVar.setLayoutManager(wd4Var);
        q1aVar.setNestedScrollingEnabled(true);
        e2a e2aVar = new e2a(this);
        this.x = e2aVar;
        q1aVar.setAdapter(e2aVar);
        addView(q1aVar);
        this.d = new kq(q1aVar);
        q1aVar.setOnScrollListener(new so7(this, (byte) 20));
        q1aVar.setOnItemClickListener(new k0(this, oabVar, (byte) 21));
        q1aVar.setOnItemLongClickListener(new t1a(this, oabVar));
        e2aVar.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i = cmb.g5;
        int v0 = cmb.v0(i, r63Var);
        this.b0 = v0;
        view.setBackground(new GradientDrawable(orientation, new int[]{v0, 0}));
        frameLayout.addView(view, qoe.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        anb.h(i, r63Var, view2);
        frameLayout.addView(view2, qoe.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(z1aVar);
        frameLayout.addView(textView);
        u1a u1aVar = new u1a(this, getContext(), r63Var);
        this.M = u1aVar;
        u1aVar.setHint(jb6.M0(2131745570, null));
        frameLayout.addView(u1aVar, qoe.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void d(int i, long j, TL_stories.StoryItem storyItem) {
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) oc7.r1(i).e0.x.f(storyItem.dialogId);
            h2a h2aVar = sparseArray == null ? null : (h2a) sparseArray.get(storyItem.id);
            TL_stories.StoryViews storyViews = storyItem.views;
            int i2 = storyViews == null ? 0 : storyViews.views_count;
            if (h2aVar != null) {
                if (h2aVar.a == i2) {
                    return;
                } else {
                    h2aVar.d();
                }
            }
            h2a h2aVar2 = new h2a(i, j, storyItem);
            h2aVar2.c();
            if (sparseArray == null) {
                vh6 vh6Var = oc7.r1(i).e0.x;
                long j2 = storyItem.dialogId;
                sparseArray = new SparseArray();
                vh6Var.k(sparseArray, j2);
            }
            sparseArray.put(storyItem.id, h2aVar2);
        }
    }

    public final void a() {
        if (this.F == null || this.y.M0() <= this.x.c.size() - 10) {
            return;
        }
        this.F.c();
    }

    public final boolean b(TL_stories.StoryView storyView) {
        g6b g6bVar;
        y7b y7bVar;
        if (storyView == null) {
            return true;
        }
        int i = this.w;
        if (oc7.r1(i).N1().M(storyView) || oc7.r1(i).x0.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(storyView.user_id));
        o2a o2aVar = this.E;
        if (o2aVar == null) {
            return true;
        }
        TL_stories.StoryItem storyItem = o2aVar.a;
        if (storyItem != null) {
            if (storyItem.parsedPrivacy == null) {
                storyItem.parsedPrivacy = new y7b(i, storyItem.privacy);
            }
            return this.E.a.parsedPrivacy.b(W1);
        }
        g4b g4bVar = o2aVar.b;
        if (g4bVar == null || (g6bVar = g4bVar.c) == null || (y7bVar = g6bVar.E0) == null) {
            return true;
        }
        return y7bVar.b(W1);
    }

    public final void c(h2a h2aVar) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        e2a e2aVar = this.x;
        int size = e2aVar.c.size();
        v1a v1aVar = this.P;
        if (TextUtils.isEmpty(v1aVar.c) && !v1aVar.b) {
            h();
        }
        e2aVar.E();
        this.K.b(size - 1);
        a();
        if (this.H != null) {
            ArrayList arrayList = h2aVar.i;
            if (h2aVar != this.F || this.I >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = this.I; i < arrayList.size(); i++) {
                TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i);
                if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                    storyItem.dialogId = pg3.n(tL_storyReactionPublicRepost.peer_id);
                    arrayList2.add(storyItem);
                }
            }
            this.I = arrayList.size();
            if (arrayList2.isEmpty()) {
                return;
            }
            this.H.F(arrayList2);
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int R;
        int i3 = 0;
        if (i == nm7.z5) {
            if (this.E.b != null) {
                int i4 = this.w;
                TL_stories.PeerStories x = oc7.r1(i4).e0.x(z8c.h(i4).n);
                if (x != null) {
                    while (i3 < x.stories.size()) {
                        TL_stories.StoryItem storyItem = x.stories.get(i3);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.E.b.e)) {
                            o2a o2aVar = this.E;
                            o2aVar.b = null;
                            o2aVar.a = storyItem;
                            f(this.a0, o2aVar);
                            return;
                        }
                        i3++;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i != nm7.c3) {
            return;
        }
        while (true) {
            q1a q1aVar = this.r;
            if (i3 >= q1aVar.getChildCount()) {
                return;
            }
            View childAt = q1aVar.getChildAt(i3);
            if ((childAt instanceof r19) && (R = RecyclerView.R(childAt)) >= 0) {
                e2a e2aVar = this.x;
                if (R < e2aVar.c.size()) {
                    ((r19) childAt).a(true, b(((a2a) e2aVar.c.get(R)).b) ? 1.0f : 0.5f);
                }
            }
            i3++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        q1a q1aVar;
        View view = null;
        int i = -1;
        int i2 = 0;
        while (true) {
            q1aVar = this.r;
            if (i2 >= q1aVar.getChildCount()) {
                break;
            }
            View childAt = q1aVar.getChildAt(i2);
            int S = RecyclerView.S(childAt);
            if (S < i || i == -1) {
                view = childAt;
                i = S;
            }
            i2++;
        }
        int max = i == 0 ? (int) Math.max(0.0f, view.getY()) : i > 0 ? 0 : q1aVar.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f = max;
        if (frameLayout.getTranslationY() != f) {
            frameLayout.setTranslationY(f);
            l2a l2aVar = (l2a) this;
            int intValue = ((Integer) l2aVar.getTag()).intValue();
            p2a p2aVar = l2aVar.d0.e;
            j2a j2aVar = p2aVar.h;
            if (intValue == p2aVar.F.getCurrentItem()) {
                j2aVar.setAlpha(Utilities.i(f / p2aVar.d, 1.0f, 0.0f));
                j2aVar.setTranslationY((-(p2aVar.d - f)) / 2.0f);
            }
        }
        this.V.setBounds(-gm.L(6.0f), max, gm.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.V.draw(canvas);
        if (this.W) {
            this.W = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != q1aVar.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = q1aVar.getPaddingTop() / 2.0f;
                kq kqVar = this.d;
                if (translationY > paddingTop) {
                    kqVar.y((int) (-(q1aVar.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    kqVar.y((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.r) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(0, gm.L(this.e), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j);
        canvas.restore();
        return true;
    }

    public final void e() {
        h2a h2aVar = this.F;
        if (h2aVar != null) {
            h2aVar.r.remove(this);
        }
        h2a h2aVar2 = this.G;
        this.F = h2aVar2;
        if (h2aVar2 == null) {
            return;
        }
        ArrayList arrayList = h2aVar2.r;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        this.F.e(this.P, this.U, this.T);
        this.x.E();
        this.y.g1(0, (int) (getTopOffset() - this.r.getPaddingTop()));
    }

    public final void f(long j, o2a o2aVar) {
        this.a0 = j;
        this.E = o2aVar;
        h();
        g(false);
        if (o2aVar == null || o2aVar.a == null) {
            return;
        }
        lo7 n = lo7.n(this.w);
        int i = o2aVar.a.id;
        if (j == n.getUserConfig().e()) {
            lo7.l0.c(new fo7(n, i, (byte) 5));
        }
    }

    public final void g(boolean z) {
        int i;
        v1a v1aVar = this.P;
        boolean z2 = v1aVar.b;
        z1a z1aVar = this.Q;
        if (z2 != z1aVar.s || !z) {
            ValueAnimator valueAnimator = z1aVar.x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                z1aVar.x.cancel();
            }
            z1aVar.s = z2;
            if (z) {
                z1aVar.e.set(z1aVar.n);
                z1aVar.f = z1aVar.c.getAlpha();
                z1aVar.h = z1aVar.d.getAlpha();
                z1aVar.r = 0.0f;
                z1aVar.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                z1aVar.x = ofFloat;
                ofFloat.addUpdateListener(new p29(z1aVar, (byte) 22));
                z1aVar.x.addListener(new c39((Object) z1aVar, (byte) 12));
                z1aVar.x.setDuration(250L);
                z1aVar.x.setInterpolator(d53.f);
                z1aVar.x.start();
            } else {
                z1aVar.r = 1.0f;
                z1aVar.invalidate();
            }
        }
        boolean z3 = v1aVar.a;
        n99 n99Var = z1aVar.w;
        if (z3) {
            h2a h2aVar = this.F;
            i = (h2aVar == null || !h2aVar.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i = R.drawable.menu_views_recent3;
        }
        n99Var.a(i, z);
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        long j;
        h2a h2aVar;
        h2a h2aVar2;
        h2a h2aVar3;
        h2a h2aVar4;
        TL_stories.StoryViews storyViews;
        h2a h2aVar5;
        ArrayList arrayList;
        this.S = false;
        this.U = false;
        this.T = false;
        TL_stories.StoryItem storyItem = this.E.a;
        u1a u1aVar = this.M;
        TextView textView = this.h;
        z1a z1aVar = this.Q;
        if (storyItem != null) {
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2 != null) {
                int i = storyViews2.views_count;
                j = 0;
                this.S = i >= 15;
                int i2 = storyViews2.reactions_count;
                boolean z = e21.a;
                this.T = i2 >= 10;
                this.U = (storyItem.dialogId < 0 || i < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
            } else {
                j = 0;
            }
            int i3 = this.w;
            SparseArray sparseArray = (SparseArray) oc7.r1(i3).e0.x.f(storyItem.dialogId);
            h2a h2aVar6 = sparseArray != null ? (h2a) sparseArray.get(storyItem.id) : null;
            this.G = h2aVar6;
            TL_stories.StoryViews storyViews3 = storyItem.views;
            int i4 = storyViews3 == null ? 0 : storyViews3.views_count;
            v1a v1aVar = this.P;
            if (h2aVar6 != null) {
                if (h2aVar6.f || h2aVar6.a == i4) {
                    h2aVar6.e(v1aVar, this.U, this.T);
                    h2aVar = this.F;
                    if (h2aVar != null) {
                        h2aVar.r.remove(this);
                    }
                    h2aVar2 = this.G;
                    this.F = h2aVar2;
                    if (h2aVar2 != null && this.J) {
                        arrayList = h2aVar2.r;
                        if (!arrayList.contains(this)) {
                            arrayList.add(this);
                        }
                    }
                    h2aVar3 = this.F;
                    if (h2aVar3 != null || !h2aVar3.j || z8c.h(i3).p()) {
                        h2aVar4 = this.F;
                        if (!h2aVar4.e || h2aVar4.m || !h2aVar4.g.isEmpty() || !this.F.i.isEmpty() || !TextUtils.isEmpty(this.F.s.c)) {
                            storyViews = storyItem.views;
                            if (storyViews != null || storyViews.views_count == 0) {
                                this.S = false;
                                this.T = false;
                                this.U = false;
                                textView.setText(jb6.M0(this.F.f ? 2131746120 : 2131743221, null));
                                u1aVar.setVisibility(8);
                                z1aVar.setVisibility(8);
                                this.e = (byte) 46;
                            } else {
                                z1aVar.setVisibility(0);
                                h2a h2aVar7 = this.F;
                                if (h2aVar7.k) {
                                    textView.setText(jb6.M0(h2aVar7.f ? 2131746120 : 2131743221, null));
                                    this.S = false;
                                    this.T = false;
                                    this.U = false;
                                } else {
                                    if (h2aVar7.b() < 20 && this.F.b() < storyItem.views.views_count) {
                                        h2aVar5 = this.F;
                                        if (!h2aVar5.e && !h2aVar5.m) {
                                            this.S = false;
                                            this.T = false;
                                            this.U = false;
                                            textView.setText(jb6.M0(h2aVar5.f ? 2131746120 : 2131743221, null));
                                        }
                                    }
                                    h2aVar5 = this.F;
                                    this.S = !h2aVar5.f && storyItem.views.views_count >= 15;
                                    TL_stories.StoryViews storyViews4 = storyItem.views;
                                    int i5 = storyViews4.reactions_count;
                                    boolean z2 = e21.a;
                                    this.T = i5 >= 5;
                                    this.U = (storyItem.dialogId < j || storyViews4.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                                    textView.setText(jb6.M0(h2aVar5.f ? 2131746120 : 2131743221, null));
                                }
                                u1aVar.setVisibility(this.S ? 0 : 8);
                                this.e = this.S ? (byte) 96 : (byte) 46;
                            }
                        }
                    }
                    this.S = false;
                    this.T = false;
                    this.U = false;
                    textView.setText(jb6.M0(this.F.f ? 2131746120 : 2131743221, null));
                    u1aVar.setVisibility(8);
                    z1aVar.setVisibility(8);
                    this.e = (byte) 46;
                } else {
                    h2aVar6.d();
                }
            }
            h2a h2aVar8 = new h2a(i3, this.a0, storyItem);
            this.G = h2aVar8;
            h2aVar8.e(v1aVar, this.U, this.T);
            this.G.c();
            if (sparseArray != null) {
                sparseArray.put(storyItem.id, this.G);
            } else {
                SparseArray sparseArray2 = new SparseArray();
                sparseArray2.put(storyItem.id, this.G);
                oc7.r1(i3).e0.x.k(sparseArray2, storyItem.dialogId);
            }
            h2aVar = this.F;
            if (h2aVar != null) {
            }
            h2aVar2 = this.G;
            this.F = h2aVar2;
            if (h2aVar2 != null) {
                arrayList = h2aVar2.r;
                if (!arrayList.contains(this)) {
                }
            }
            h2aVar3 = this.F;
            if (h2aVar3 != null) {
            }
            h2aVar4 = this.F;
            if (!h2aVar4.e) {
            }
            storyViews = storyItem.views;
            if (storyViews != null) {
            }
            this.S = false;
            this.T = false;
            this.U = false;
            textView.setText(jb6.M0(this.F.f ? 2131746120 : 2131743221, null));
            u1aVar.setVisibility(8);
            z1aVar.setVisibility(8);
            this.e = (byte) 46;
        } else {
            this.e = (byte) 46;
            textView.setText(jb6.M0(2131743487, null));
            u1aVar.setVisibility(8);
            z1aVar.setVisibility(8);
        }
        z1aVar.a.setVisibility(this.T ? 0 : 8);
        z1aVar.c.setVisibility(this.U ? 0 : 8);
        z1aVar.d.setVisibility(this.U ? 0 : 8);
        if (this.U) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = gm.L(this.e - 8);
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).topMargin = gm.L(this.e - 17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        h2a h2aVar = this.F;
        if (h2aVar != null) {
            ArrayList arrayList = h2aVar.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.F.p.clear();
        }
        this.x.E();
        int i = this.w;
        nm7.f(i).b(this, nm7.z5);
        nm7.f(i).b(this, nm7.c3);
        setTag(R.id.bulletin_delegate_tag, new s20(this, (byte) 17));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        h2a h2aVar = this.F;
        if (h2aVar != null) {
            h2aVar.r.remove(this);
        }
        int i = this.w;
        nm7.f(i).n(this, nm7.z5);
        nm7.f(i).n(this, nm7.c3);
        setTag(R.id.bulletin_delegate_tag, null);
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

    public void setListBottomPadding(float f) {
        q1a q1aVar = this.r;
        if (f != q1aVar.getPaddingBottom()) {
            q1aVar.setPadding(0, (int) f, 0, 0);
            q1aVar.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.V = drawable;
    }

    @Override // vlb
    public final void updateColors() {
        try {
            int v0 = cmb.v0(cmb.g5, this.s);
            View view = this.a;
            if (view == null || v0 == this.b0) {
                return;
            }
            this.b0 = v0;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{v0, 0}));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
