package fi;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public class e7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public mc H;
    public org.telegram.ui.ActionBar.i6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public a6 Q;
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

    public e7(org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        this.E = z10;
        this.J = i6Var;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z10;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        p6 R1 = mp.u1(j10.t0).R1();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.x > 0) {
                    user = mp.u1(j10.t0).c2(Long.valueOf(this.x));
                } else {
                    chat = mp.u1(j10.t0).O0(Long.valueOf(-this.x));
                    user = null;
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.r) {
                    z10 = !R1.h.isEmpty();
                } else {
                    if (this.x <= 0 ? mp.u1(j10.t0).R1().K(this.x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : mp.u1(j10.t0).R1().K(this.x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.x != j10.i(j10.t0).n && z10) {
                    mc mcVar = this.H;
                    if (mcVar == null) {
                        this.H = new mc(view, 1.5f, 5.0f);
                    } else {
                        mcVar.a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        a6 a6Var = this.Q;
                        if (a6Var != null) {
                            org.telegram.messenger.g0.r(a6Var);
                        }
                        a6 a6Var2 = new a6(15, this, view);
                        this.Q = a6Var2;
                        org.telegram.messenger.g0.h3(a6Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > org.telegram.messenger.g0.e || Math.abs(this.P - motionEvent.getY()) > org.telegram.messenger.g0.e) {
                mc mcVar2 = this.H;
                if (mcVar2 != null) {
                    mcVar2.a = view;
                    mcVar2.c(false);
                }
                a6 a6Var3 = this.Q;
                if (a6Var3 != null) {
                    org.telegram.messenger.g0.r(a6Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            mc mcVar3 = this.H;
            if (mcVar3 != null) {
                mcVar3.a = view;
                mcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.x)) {
                mp u12 = mp.u1(j10.t0);
                p6 R12 = u12.R1();
                if (this.r) {
                    f(0L);
                } else if (this.x != j10.i(j10.t0).e()) {
                    if (R12.K(this.x)) {
                        f(this.x);
                    } else {
                        long j3 = this.x;
                        if (j3 > 0) {
                            TLRPC.User c22 = u12.c2(Long.valueOf(j3));
                            if (c22 != null && !c22.stories_unavailable && (tL_recentStory2 = c22.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new h7().a(this.x, view, this);
                            }
                        } else {
                            TLRPC.Chat O0 = u12.O0(Long.valueOf(-j3));
                            if (O0 != null && !O0.stories_unavailable && (tL_recentStory = O0.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new h7().a(this.x, view, this);
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
            a6 a6Var4 = this.Q;
            if (a6Var4 != null) {
                org.telegram.messenger.g0.r(a6Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        mc mcVar = this.H;
        if (mcVar == null) {
            return 1.0f;
        }
        return mcVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j3) {
        return false;
    }

    public void f(long j3) {
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        if (Q == null || this.R == null) {
            return;
        }
        Q.getOrCreateStoryViewer().getClass();
        ViewParent parent = this.R.getParent();
        Q.getOrCreateStoryViewer().J(Q.getContext(), j3, parent instanceof RecyclerView ? y6.a((ck0) parent) : null);
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
