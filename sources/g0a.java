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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public abstract class g0a extends FrameLayout implements tjb, gk7 {
    public static final /* synthetic */ int c0 = 0;
    public m0a E;
    public f0a F;
    public f0a G;
    public a2b H;
    public int I;
    public boolean J;
    public final t29 K;
    public final m8b L;
    public final sz9 M;
    public final tz9 N;
    public final ae9 O;
    public final tz9 P;
    public final xz9 Q;
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
    public final kp d;
    public byte e;
    public wz9 f;
    public final TextView h;
    public int n;
    public final oz9 r;
    public final f53 s;
    public final int w;
    public final c0a x;
    public final wb4 y;

    public g0a(m8b m8bVar, Context context, tz9 tz9Var, ae9 ae9Var) {
        super(context);
        this.e = (byte) 96;
        this.P = new tz9();
        this.N = tz9Var;
        this.O = ae9Var;
        f53 f53Var = m8bVar.E;
        this.s = f53Var;
        this.L = m8bVar;
        this.w = m8bVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        zkb.X(textView, bkb.i5, f53Var);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        textView.setPadding(gl.L(21.0f), gl.L(6.0f), gl.L(21.0f), gl.L(8.0f));
        xz9 xz9Var = new xz9(this, getContext());
        this.Q = xz9Var;
        oz9 oz9Var = new oz9(this, context, f53Var);
        this.r = oz9Var;
        oz9Var.setClipToPadding(false);
        this.K = new t29(oz9Var, true);
        wb4 wb4Var = new wb4(0, oz9Var);
        this.y = wb4Var;
        oz9Var.setLayoutManager(wb4Var);
        oz9Var.setNestedScrollingEnabled(true);
        c0a c0aVar = new c0a(this);
        this.x = c0aVar;
        oz9Var.setAdapter(c0aVar);
        addView(oz9Var);
        this.d = new kp(oz9Var);
        oz9Var.setOnScrollListener(new n58(this, (byte) 19));
        oz9Var.setOnItemClickListener(new k0(this, m8bVar, (byte) 21));
        oz9Var.setOnItemLongClickListener(new rz9(this, m8bVar));
        c0aVar.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i = bkb.g5;
        int v0 = bkb.v0(i, f53Var);
        this.b0 = v0;
        view.setBackground(new GradientDrawable(orientation, new int[]{v0, 0}));
        frameLayout.addView(view, nme.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        zkb.h(i, f53Var, view2);
        frameLayout.addView(view2, nme.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(xz9Var);
        frameLayout.addView(textView);
        sz9 sz9Var = new sz9(this, getContext(), f53Var);
        this.M = sz9Var;
        sz9Var.setHint(k96.M0(2131745644, null));
        frameLayout.addView(sz9Var, nme.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void d(int i, long j, TL_stories.StoryItem storyItem) {
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) na7.q1(i).e0.x.f(storyItem.dialogId);
            f0a f0aVar = sparseArray == null ? null : (f0a) sparseArray.get(storyItem.id);
            TL_stories.StoryViews storyViews = storyItem.views;
            int i2 = storyViews == null ? 0 : storyViews.views_count;
            if (f0aVar != null) {
                if (f0aVar.a == i2) {
                    return;
                } else {
                    f0aVar.d();
                }
            }
            f0a f0aVar2 = new f0a(i, j, storyItem);
            f0aVar2.c();
            if (sparseArray == null) {
                vf6 vf6Var = na7.q1(i).e0.x;
                long j2 = storyItem.dialogId;
                sparseArray = new SparseArray();
                vf6Var.k(sparseArray, j2);
            }
            sparseArray.put(storyItem.id, f0aVar2);
        }
    }

    public final void a() {
        if (this.F == null || this.y.M0() <= this.x.c.size() - 10) {
            return;
        }
        this.F.c();
    }

    public final boolean b(TL_stories.StoryView storyView) {
        f4b f4bVar;
        w5b w5bVar;
        if (storyView == null) {
            return true;
        }
        int i = this.w;
        if (na7.q1(i).M1().M(storyView) || na7.q1(i).x0.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(storyView.user_id));
        m0a m0aVar = this.E;
        if (m0aVar == null) {
            return true;
        }
        TL_stories.StoryItem storyItem = m0aVar.a;
        if (storyItem != null) {
            if (storyItem.parsedPrivacy == null) {
                storyItem.parsedPrivacy = new w5b(i, storyItem.privacy);
            }
            return this.E.a.parsedPrivacy.b(V1);
        }
        f2b f2bVar = m0aVar.b;
        if (f2bVar == null || (f4bVar = f2bVar.c) == null || (w5bVar = f4bVar.E0) == null) {
            return true;
        }
        return w5bVar.b(V1);
    }

    public final void c(f0a f0aVar) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        c0a c0aVar = this.x;
        int size = c0aVar.c.size();
        tz9 tz9Var = this.P;
        if (TextUtils.isEmpty(tz9Var.c) && !tz9Var.b) {
            h();
        }
        c0aVar.E();
        this.K.b(size - 1);
        a();
        if (this.H != null) {
            ArrayList arrayList = f0aVar.i;
            if (f0aVar != this.F || this.I >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = this.I; i < arrayList.size(); i++) {
                TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i);
                if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                    storyItem.dialogId = cf3.n(tL_storyReactionPublicRepost.peer_id);
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

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int R;
        int i3 = 0;
        if (i == kk7.x5) {
            if (this.E.b != null) {
                int i4 = this.w;
                TL_stories.PeerStories x = na7.q1(i4).e0.x(y6c.h(i4).n);
                if (x != null) {
                    while (i3 < x.stories.size()) {
                        TL_stories.StoryItem storyItem = x.stories.get(i3);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.E.b.e)) {
                            m0a m0aVar = this.E;
                            m0aVar.b = null;
                            m0aVar.a = storyItem;
                            f(this.a0, m0aVar);
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
        if (i != kk7.b3) {
            return;
        }
        while (true) {
            oz9 oz9Var = this.r;
            if (i3 >= oz9Var.getChildCount()) {
                return;
            }
            View childAt = oz9Var.getChildAt(i3);
            if ((childAt instanceof qz8) && (R = RecyclerView.R(childAt)) >= 0) {
                c0a c0aVar = this.x;
                if (R < c0aVar.c.size()) {
                    ((qz8) childAt).a(true, b(((yz9) c0aVar.c.get(R)).b) ? 1.0f : 0.5f);
                }
            }
            i3++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        oz9 oz9Var;
        View view = null;
        int i = -1;
        int i2 = 0;
        while (true) {
            oz9Var = this.r;
            if (i2 >= oz9Var.getChildCount()) {
                break;
            }
            View childAt = oz9Var.getChildAt(i2);
            int S = RecyclerView.S(childAt);
            if (S < i || i == -1) {
                view = childAt;
                i = S;
            }
            i2++;
        }
        int max = i == 0 ? (int) Math.max(0.0f, view.getY()) : i > 0 ? 0 : oz9Var.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f = max;
        if (frameLayout.getTranslationY() != f) {
            frameLayout.setTranslationY(f);
            j0a j0aVar = (j0a) this;
            int intValue = ((Integer) j0aVar.getTag()).intValue();
            n0a n0aVar = j0aVar.d0.e;
            h0a h0aVar = n0aVar.h;
            if (intValue == n0aVar.F.getCurrentItem()) {
                h0aVar.setAlpha(Utilities.i(f / n0aVar.d, 1.0f, 0.0f));
                h0aVar.setTranslationY((-(n0aVar.d - f)) / 2.0f);
            }
        }
        this.V.setBounds(-gl.L(6.0f), max, gl.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.V.draw(canvas);
        if (this.W) {
            this.W = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != oz9Var.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = oz9Var.getPaddingTop() / 2.0f;
                kp kpVar = this.d;
                if (translationY > paddingTop) {
                    kpVar.y((int) (-(oz9Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    kpVar.y((int) frameLayout.getTranslationY());
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
        canvas.clipRect(0, gl.L(this.e), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j);
        canvas.restore();
        return true;
    }

    public final void e() {
        f0a f0aVar = this.F;
        if (f0aVar != null) {
            f0aVar.r.remove(this);
        }
        f0a f0aVar2 = this.G;
        this.F = f0aVar2;
        if (f0aVar2 == null) {
            return;
        }
        ArrayList arrayList = f0aVar2.r;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        this.F.e(this.P, this.U, this.T);
        this.x.E();
        this.y.g1(0, (int) (getTopOffset() - this.r.getPaddingTop()));
    }

    public final void f(long j, m0a m0aVar) {
        this.a0 = j;
        this.E = m0aVar;
        h();
        g(false);
        if (m0aVar == null || m0aVar.a == null) {
            return;
        }
        im7 n = im7.n(this.w);
        int i = m0aVar.a.id;
        if (j == n.getUserConfig().e()) {
            im7.l0.c(new cm7(n, i, (byte) 5));
        }
    }

    public final void g(boolean z) {
        int i;
        tz9 tz9Var = this.P;
        boolean z2 = tz9Var.b;
        xz9 xz9Var = this.Q;
        if (z2 != xz9Var.s || !z) {
            ValueAnimator valueAnimator = xz9Var.x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                xz9Var.x.cancel();
            }
            xz9Var.s = z2;
            if (z) {
                xz9Var.e.set(xz9Var.n);
                xz9Var.f = xz9Var.c.getAlpha();
                xz9Var.h = xz9Var.d.getAlpha();
                xz9Var.r = 0.0f;
                xz9Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xz9Var.x = ofFloat;
                ofFloat.addUpdateListener(new x89(xz9Var, (byte) 20));
                xz9Var.x.addListener(new ng9((Object) xz9Var, (byte) 10));
                xz9Var.x.setDuration(250L);
                xz9Var.x.setInterpolator(s33.f);
                xz9Var.x.start();
            } else {
                xz9Var.r = 1.0f;
                xz9Var.invalidate();
            }
        }
        boolean z3 = tz9Var.a;
        l79 l79Var = xz9Var.w;
        if (z3) {
            f0a f0aVar = this.F;
            i = (f0aVar == null || !f0aVar.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i = R.drawable.menu_views_recent3;
        }
        l79Var.a(i, z);
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
        f0a f0aVar;
        f0a f0aVar2;
        f0a f0aVar3;
        f0a f0aVar4;
        TL_stories.StoryViews storyViews;
        f0a f0aVar5;
        ArrayList arrayList;
        this.S = false;
        this.U = false;
        this.T = false;
        TL_stories.StoryItem storyItem = this.E.a;
        sz9 sz9Var = this.M;
        TextView textView = this.h;
        xz9 xz9Var = this.Q;
        if (storyItem != null) {
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2 != null) {
                int i = storyViews2.views_count;
                j = 0;
                this.S = i >= 15;
                int i2 = storyViews2.reactions_count;
                boolean z = w01.a;
                this.T = i2 >= 10;
                this.U = (storyItem.dialogId < 0 || i < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
            } else {
                j = 0;
            }
            int i3 = this.w;
            SparseArray sparseArray = (SparseArray) na7.q1(i3).e0.x.f(storyItem.dialogId);
            f0a f0aVar6 = sparseArray != null ? (f0a) sparseArray.get(storyItem.id) : null;
            this.G = f0aVar6;
            TL_stories.StoryViews storyViews3 = storyItem.views;
            int i4 = storyViews3 == null ? 0 : storyViews3.views_count;
            tz9 tz9Var = this.P;
            if (f0aVar6 != null) {
                if (f0aVar6.f || f0aVar6.a == i4) {
                    f0aVar6.e(tz9Var, this.U, this.T);
                    f0aVar = this.F;
                    if (f0aVar != null) {
                        f0aVar.r.remove(this);
                    }
                    f0aVar2 = this.G;
                    this.F = f0aVar2;
                    if (f0aVar2 != null && this.J) {
                        arrayList = f0aVar2.r;
                        if (!arrayList.contains(this)) {
                            arrayList.add(this);
                        }
                    }
                    f0aVar3 = this.F;
                    if (f0aVar3 != null || !f0aVar3.j || y6c.h(i3).p()) {
                        f0aVar4 = this.F;
                        if (!f0aVar4.e || f0aVar4.m || !f0aVar4.g.isEmpty() || !this.F.i.isEmpty() || !TextUtils.isEmpty(this.F.s.c)) {
                            storyViews = storyItem.views;
                            if (storyViews != null || storyViews.views_count == 0) {
                                this.S = false;
                                this.T = false;
                                this.U = false;
                                textView.setText(k96.M0(this.F.f ? 2131746194 : 2131743295, null));
                                sz9Var.setVisibility(8);
                                xz9Var.setVisibility(8);
                                this.e = (byte) 46;
                            } else {
                                xz9Var.setVisibility(0);
                                f0a f0aVar7 = this.F;
                                if (f0aVar7.k) {
                                    textView.setText(k96.M0(f0aVar7.f ? 2131746194 : 2131743295, null));
                                    this.S = false;
                                    this.T = false;
                                    this.U = false;
                                } else {
                                    if (f0aVar7.b() < 20 && this.F.b() < storyItem.views.views_count) {
                                        f0aVar5 = this.F;
                                        if (!f0aVar5.e && !f0aVar5.m) {
                                            this.S = false;
                                            this.T = false;
                                            this.U = false;
                                            textView.setText(k96.M0(f0aVar5.f ? 2131746194 : 2131743295, null));
                                        }
                                    }
                                    f0aVar5 = this.F;
                                    this.S = !f0aVar5.f && storyItem.views.views_count >= 15;
                                    TL_stories.StoryViews storyViews4 = storyItem.views;
                                    int i5 = storyViews4.reactions_count;
                                    boolean z2 = w01.a;
                                    this.T = i5 >= 5;
                                    this.U = (storyItem.dialogId < j || storyViews4.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                                    textView.setText(k96.M0(f0aVar5.f ? 2131746194 : 2131743295, null));
                                }
                                sz9Var.setVisibility(this.S ? 0 : 8);
                                this.e = this.S ? (byte) 96 : (byte) 46;
                            }
                        }
                    }
                    this.S = false;
                    this.T = false;
                    this.U = false;
                    textView.setText(k96.M0(this.F.f ? 2131746194 : 2131743295, null));
                    sz9Var.setVisibility(8);
                    xz9Var.setVisibility(8);
                    this.e = (byte) 46;
                } else {
                    f0aVar6.d();
                }
            }
            f0a f0aVar8 = new f0a(i3, this.a0, storyItem);
            this.G = f0aVar8;
            f0aVar8.e(tz9Var, this.U, this.T);
            this.G.c();
            if (sparseArray != null) {
                sparseArray.put(storyItem.id, this.G);
            } else {
                SparseArray sparseArray2 = new SparseArray();
                sparseArray2.put(storyItem.id, this.G);
                na7.q1(i3).e0.x.k(sparseArray2, storyItem.dialogId);
            }
            f0aVar = this.F;
            if (f0aVar != null) {
            }
            f0aVar2 = this.G;
            this.F = f0aVar2;
            if (f0aVar2 != null) {
                arrayList = f0aVar2.r;
                if (!arrayList.contains(this)) {
                }
            }
            f0aVar3 = this.F;
            if (f0aVar3 != null) {
            }
            f0aVar4 = this.F;
            if (!f0aVar4.e) {
            }
            storyViews = storyItem.views;
            if (storyViews != null) {
            }
            this.S = false;
            this.T = false;
            this.U = false;
            textView.setText(k96.M0(this.F.f ? 2131746194 : 2131743295, null));
            sz9Var.setVisibility(8);
            xz9Var.setVisibility(8);
            this.e = (byte) 46;
        } else {
            this.e = (byte) 46;
            textView.setText(k96.M0(2131743561, null));
            sz9Var.setVisibility(8);
            xz9Var.setVisibility(8);
        }
        xz9Var.a.setVisibility(this.T ? 0 : 8);
        xz9Var.c.setVisibility(this.U ? 0 : 8);
        xz9Var.d.setVisibility(this.U ? 0 : 8);
        if (this.U) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = gl.L(this.e - 8);
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).topMargin = gl.L(this.e - 17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        f0a f0aVar = this.F;
        if (f0aVar != null) {
            ArrayList arrayList = f0aVar.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.F.p.clear();
        }
        this.x.E();
        int i = this.w;
        kk7.f(i).b(this, kk7.x5);
        kk7.f(i).b(this, kk7.b3);
        setTag(R.id.bulletin_delegate_tag, new s10(this, (byte) 17));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        f0a f0aVar = this.F;
        if (f0aVar != null) {
            f0aVar.r.remove(this);
        }
        int i = this.w;
        kk7.f(i).n(this, kk7.x5);
        kk7.f(i).n(this, kk7.b3);
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
        oz9 oz9Var = this.r;
        if (f != oz9Var.getPaddingBottom()) {
            oz9Var.setPadding(0, (int) f, 0, 0);
            oz9Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.V = drawable;
    }

    @Override // tjb
    public final void updateColors() {
        try {
            int v0 = bkb.v0(bkb.g5, this.s);
            View view = this.a;
            if (view == null || v0 == this.b0) {
                return;
            }
            this.b0 = v0;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{v0, 0}));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
