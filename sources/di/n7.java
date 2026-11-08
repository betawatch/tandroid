package di;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class n7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public ic H;
    public org.telegram.ui.ActionBar.f6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public z0 Q;
    public View R;
    public int c;
    public TL_stories.StoryItem d;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public long s;
    public float t;
    public boolean v;
    public boolean w;
    public long x;
    public int y;
    public int z;
    public boolean a = true;
    public boolean b = true;
    public float e = 1.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public float j = 0.0f;
    public boolean k = true;
    public float u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public n7(org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        this.E = z9;
        this.J = f6Var;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z9;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        y6 P1 = qp.s1(p10.s0).P1();
        boolean z10 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.x > 0) {
                    user = qp.s1(p10.s0).a2(Long.valueOf(this.x));
                } else {
                    chat = qp.s1(p10.s0).M0(Long.valueOf(-this.x));
                    user = null;
                }
                if (c(chat, user)) {
                    z9 = true;
                } else if (this.r) {
                    z9 = !P1.h.isEmpty();
                } else {
                    if (this.x <= 0 ? qp.s1(p10.s0).P1().K(this.x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : qp.s1(p10.s0).P1().K(this.x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z10 = true;
                    }
                    z9 = z10;
                }
                if (this.x != p10.i(p10.s0).n && z9) {
                    ic icVar = this.H;
                    if (icVar == null) {
                        this.H = new ic(view, 1.5f, 5.0f);
                    } else {
                        icVar.a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        z0 z0Var = this.Q;
                        if (z0Var != null) {
                            org.telegram.messenger.g0.r(z0Var);
                        }
                        z0 z0Var2 = new z0(22, this, view);
                        this.Q = z0Var2;
                        org.telegram.messenger.g0.i3(z0Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > org.telegram.messenger.g0.e || Math.abs(this.P - motionEvent.getY()) > org.telegram.messenger.g0.e) {
                ic icVar2 = this.H;
                if (icVar2 != null) {
                    icVar2.a = view;
                    icVar2.c(false);
                }
                z0 z0Var3 = this.Q;
                if (z0Var3 != null) {
                    org.telegram.messenger.g0.r(z0Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ic icVar3 = this.H;
            if (icVar3 != null) {
                icVar3.a = view;
                icVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.x)) {
                qp s12 = qp.s1(p10.s0);
                y6 P12 = s12.P1();
                if (this.r) {
                    f(0L);
                } else if (this.x != p10.i(p10.s0).e()) {
                    if (P12.K(this.x)) {
                        f(this.x);
                    } else {
                        long j3 = this.x;
                        if (j3 > 0) {
                            TLRPC.User a22 = s12.a2(Long.valueOf(j3));
                            if (a22 != null && !a22.stories_unavailable && (tL_recentStory2 = a22.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new q7().a(this.x, view, this);
                            }
                        } else {
                            TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
                            if (M0 != null && !M0.stories_unavailable && (tL_recentStory = M0.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new q7().a(this.x, view, this);
                            }
                        }
                    }
                }
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
            }
            this.N = false;
            z0 z0Var4 = this.Q;
            if (z0Var4 != null) {
                org.telegram.messenger.g0.r(z0Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        ic icVar = this.H;
        if (icVar == null) {
            return 1.0f;
        }
        return icVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j3) {
        return false;
    }

    public void f(long j3) {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q == null || this.R == null) {
            return;
        }
        Q.getOrCreateStoryViewer().getClass();
        ViewParent parent = this.R.getParent();
        Q.getOrCreateStoryViewer().J(Q.getContext(), j3, parent instanceof RecyclerView ? h7.a((pj0) parent) : null);
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
