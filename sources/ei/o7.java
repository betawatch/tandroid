package ei;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class o7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public gc H;
    public org.telegram.ui.ActionBar.e6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public b0 Q;
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

    public o7(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this.E = z10;
        this.J = e6Var;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z10;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        z6 P1 = hp.s1(h10.t0).P1();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.x > 0) {
                    user = hp.s1(h10.t0).a2(Long.valueOf(this.x));
                } else {
                    chat = hp.s1(h10.t0).M0(Long.valueOf(-this.x));
                    user = null;
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.r) {
                    z10 = !P1.h.isEmpty();
                } else {
                    if (this.x <= 0 ? hp.s1(h10.t0).P1().K(this.x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : hp.s1(h10.t0).P1().K(this.x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.x != h10.i(h10.t0).n && z10) {
                    gc gcVar = this.H;
                    if (gcVar == null) {
                        this.H = new gc(view, 1.5f, 5.0f);
                    } else {
                        gcVar.a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        b0 b0Var = this.Q;
                        if (b0Var != null) {
                            org.telegram.messenger.g0.r(b0Var);
                        }
                        b0 b0Var2 = new b0(25, this, view);
                        this.Q = b0Var2;
                        org.telegram.messenger.g0.i3(b0Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > org.telegram.messenger.g0.e || Math.abs(this.P - motionEvent.getY()) > org.telegram.messenger.g0.e) {
                gc gcVar2 = this.H;
                if (gcVar2 != null) {
                    gcVar2.a = view;
                    gcVar2.c(false);
                }
                b0 b0Var3 = this.Q;
                if (b0Var3 != null) {
                    org.telegram.messenger.g0.r(b0Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gc gcVar3 = this.H;
            if (gcVar3 != null) {
                gcVar3.a = view;
                gcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.x)) {
                hp s12 = hp.s1(h10.t0);
                z6 P12 = s12.P1();
                if (this.r) {
                    f(0L);
                } else if (this.x != h10.i(h10.t0).e()) {
                    if (P12.K(this.x)) {
                        f(this.x);
                    } else {
                        long j10 = this.x;
                        if (j10 > 0) {
                            TLRPC.User a22 = s12.a2(Long.valueOf(j10));
                            if (a22 != null && !a22.stories_unavailable && (tL_recentStory2 = a22.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new r7().a(this.x, view, this);
                            }
                        } else {
                            TLRPC.Chat M0 = s12.M0(Long.valueOf(-j10));
                            if (M0 != null && !M0.stories_unavailable && (tL_recentStory = M0.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new r7().a(this.x, view, this);
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
            b0 b0Var4 = this.Q;
            if (b0Var4 != null) {
                org.telegram.messenger.g0.r(b0Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        gc gcVar = this.H;
        if (gcVar == null) {
            return 1.0f;
        }
        return gcVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j10) {
        return false;
    }

    public void f(long j10) {
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (Q == null || this.R == null) {
            return;
        }
        Q.getOrCreateStoryViewer().getClass();
        ViewParent parent = this.R.getParent();
        Q.getOrCreateStoryViewer().R(Q.getContext(), j10, parent instanceof RecyclerView ? i7.a((tj0) parent) : null);
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
