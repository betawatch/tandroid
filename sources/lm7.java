// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lm7 extends e implements ej6, fn7, i1d {
    public static final fa4 f0 = new fa4(null, 0, null);
    public float E;
    public ValueAnimator F;
    public int G;
    public ir8 H;
    public c51 I;
    public Boolean J;
    public dm7 K;
    public sla L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public vl7 R;
    public rla S;
    public boolean T;
    public final km7 U;
    public final HashMap V;
    public final HashMap W;
    public final fm7[] X;
    public final da4[] Y;
    public final vl7 Z;
    public oz4 a;
    public final na4 a0;
    public final jm7[] b;
    public String b0;
    public final ArrayList c;
    public boolean c0;
    public final HashSet d;
    public b29 d0;
    public final HashSet e;
    public b29 e0;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public ir1 w;
    public cm7 x;
    public hj3 y;

    public lm7() {
        super(null);
        byte b = 3;
        byte b2 = 0;
        this.b = new jm7[]{new jm7(), new jm7(), new jm7()};
        this.c = new ArrayList();
        this.d = new HashSet();
        this.e = new HashSet();
        this.Q = "";
        boolean z = uc7.e1().getBoolean("news_expanded", false);
        this.T = z;
        float f = z ? 1.0f : 0.0f;
        this.U = new km7(this, f, f);
        this.V = new HashMap();
        this.W = new HashMap();
        this.X = new fm7[3];
        this.Y = new da4[3];
        this.Z = new vl7(this, b);
        this.a0 = new na4(new su3((byte) 21), new y94(ea4.i(this.currentAccount), b2));
    }

    public static String B0(int i, r47 r47Var) {
        return i + "_" + r47.B0(r47Var.k) + "_" + r47Var.e1();
    }

    public static String E0(TLRPC.Message message) {
        Object valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(r47.B0(message));
        sb.append(":");
        if (message.grouped_id != 0) {
            valueOf = "g" + message.grouped_id;
        } else {
            valueOf = Integer.valueOf(message.id);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    public static void L0(jm7 jm7Var) {
        im7 im7Var = jm7Var.f;
        if (im7Var != null) {
            im7Var.g3.O(true);
        }
    }

    public static void f0(ViewGroup viewGroup, boolean z) {
        viewGroup.animate().cancel();
        if (z) {
            viewGroup.setVisibility(0);
        }
        viewGroup.animate().alpha(z ? 1.0f : 0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(220L).setInterpolator(k43.h).withEndAction(z ? null : new fe7(viewGroup, (byte) 7)).start();
    }

    public static void g0(jm7 jm7Var, List list, fa4 fa4Var) {
        HashMap hashMap = jm7Var.d;
        if (fa4Var.a != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLRPC.Message message = (TLRPC.Message) it.next();
                if (message != null && message.peer_id != null && !hashMap.containsKey(E0(message))) {
                    hashMap.put(E0(message), fa4Var);
                }
            }
        }
    }

    public static void i0(im7 im7Var) {
        if (im7Var == null) {
            return;
        }
        im7Var.getViewTreeObserver().addOnPreDrawListener(new gb(im7Var, (byte) 7));
        im7Var.invalidate();
    }

    @Override // ej6
    public final rz4 A() {
        return getBaseSimpleGlass().d();
    }

    public final void A0() {
        View m;
        int round;
        int i = 0;
        while (true) {
            jm7[] jm7VarArr = this.b;
            if (i >= jm7VarArr.length) {
                return;
            }
            im7 im7Var = jm7VarArr[i].f;
            if (im7Var != null) {
                for (int i2 = 0; i2 < im7Var.getChildCount(); i2++) {
                    View childAt = im7Var.getChildAt(i2);
                    if (childAt instanceof v94) {
                        ((v94) childAt).p();
                    }
                }
                fm7 fm7Var = this.X[i];
                im7 im7Var2 = jm7VarArr[i].f;
                if (fm7Var != null && im7Var2 != null && (m = im7Var2.f3.m(fm7Var.a)) != null) {
                    km7 km7Var = fm7Var.d;
                    if (km7Var != null) {
                        float f = km7Var.b;
                        float f2 = fm7Var.f;
                        float max = f != f2 ? Math.max(0.0f, Math.min(1.0f, (km7Var.a - f2) / (f - f2))) : 1.0f;
                        int i3 = fm7Var.e;
                        round = Math.round(hl.U1(max, i3, Math.max(0, i3)));
                    } else {
                        round = Math.round((fm7Var.b + fm7Var.c) - ((m instanceof v94 ? ((v94) m).getMorphHeight() : m.getHeight()) / 2.0f));
                    }
                    im7Var2.f3.g1(fm7Var.a, round);
                }
            }
            i++;
        }
    }

    public final String C0(r47 r47Var) {
        String K = xc2.K(getMessagesController().M0(Long.valueOf(-r47.B0(r47Var.k))), false);
        String k = c00.k(new StringBuilder("https://"), getMessagesController().N2, "/");
        if (!TextUtils.isEmpty(K)) {
            StringBuilder p = ik8.p(k, K, "/");
            p.append(r47Var.e1());
            return p.toString();
        }
        StringBuilder l = c00.l(k, "c/");
        l.append(-r47.B0(r47Var.k));
        l.append("/");
        l.append(r47Var.e1());
        return l.toString();
    }

    public final void D0(zu1 zu1Var, int i, r47 r47Var) {
        ha4 n0 = n0(i, r47Var, "open_post", null);
        fa4 fa4Var = n0.f;
        if (fa4Var != null) {
            zu1Var.yb = new ty0(fa4Var, new int[]{n0.d}, r47Var.k.grouped_id, SystemClock.elapsedRealtime());
        }
        zu1Var.zb = n0;
    }

    @Override // ej6
    public final void F() {
        boolean z = this.N;
        jm7[] jm7VarArr = this.b;
        if (z) {
            i0(jm7VarArr[2].f);
            return;
        }
        ir1 ir1Var = this.w;
        if (ir1Var != null) {
            i0(jm7VarArr[ir1Var.getCurrentPosition()].f);
        }
    }

    public final void F0(ha4 ha4Var) {
        this.a0.b();
        String i = ea4.i(this.currentAccount);
        if (i != null) {
            ea4.e.postRunnable(new x94(i, ha4Var, (byte) 0));
        }
    }

    public final void G0() {
        if (this.f) {
            return;
        }
        HashSet hashSet = this.d;
        if (hashSet.isEmpty() || hashSet.equals(this.e)) {
            return;
        }
        this.f = true;
        M0(true);
        TL_feed.TL_feed_setInterestCategories tL_feed_setInterestCategories = new TL_feed.TL_feed_setInterestCategories();
        tL_feed_setInterestCategories.category_ids.addAll(hashSet);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_feed_setInterestCategories, new ol7(this, tL_feed_setInterestCategories, (byte) 1)), this.classGuid);
    }

    public final void H0(String str) {
        if (str.equals(this.Q)) {
            return;
        }
        this.Q = str;
        jm7[] jm7VarArr = this.b;
        jm7 jm7Var = jm7VarArr[2];
        vl7 vl7Var = this.R;
        if (vl7Var != null) {
            hl.r(vl7Var);
        }
        this.R = null;
        jm7Var.a.clear();
        jm7Var.b.clear();
        jm7Var.c.clear();
        jm7Var.d.clear();
        jm7Var.e.clear();
        jm7Var.i = null;
        jm7Var.l = false;
        jm7Var.n = false;
        jm7Var.m = false;
        jm7Var.o = false;
        L0(jm7Var);
        byte b = 1;
        boolean z = this.M && !TextUtils.isEmpty(this.Q);
        if (this.N != z) {
            this.N = z;
            im7 im7Var = jm7VarArr[2].f;
            f0(this.w, !z);
            f0(im7Var, z);
            if (z) {
                im7Var.x0(0);
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        vl7 vl7Var2 = new vl7(this, b);
        this.R = vl7Var2;
        hl.d3(vl7Var2, 500L);
    }

    public final float I0(int i) {
        im7 im7Var;
        View m;
        int L = hl.L(48.0f);
        if (i < 0 || i >= 2 || (im7Var = this.b[i].f) == null || im7Var.getChildCount() == 0) {
            return 0.0f;
        }
        return (im7Var.f3.K0() > 0 || (m = im7Var.f3.m(0)) == null) ? L : Math.max(0, Math.min(L, im7Var.getPaddingTop() - m.getTop()));
    }

    public final void J0(int i, r47 r47Var, boolean z) {
        F0(n0(i, r47Var, z ? "feed.likePost" : "feed.dislikePost", null));
        if (z) {
            d31.b0(this).M(getParentActivity().getResources().getDrawable(R.drawable.msg_rate_up).mutate(), ob6.M0(2131747990, null)).j();
        } else {
            hl.d3(new fd7((Object) this, (Object) this.b[i], (Object) r47Var, (byte) 11), 420L);
            d31.b0(this).M(getParentActivity().getResources().getDrawable(R.drawable.msg_rate_down).mutate(), ob6.M0(2131747985, null)).j();
        }
    }

    public final void K0(boolean z) {
        if (this.M == z) {
            return;
        }
        this.M = z;
        if (!z) {
            H0("");
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z ? 1.0f : 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new ch4(this, (byte) 27));
        this.F.setDuration(350L);
        this.F.setInterpolator(k43.h);
        this.F.start();
    }

    public final void M0(boolean z) {
        int q0;
        boolean s0 = s0();
        if (this.H != null) {
            Boolean bool = this.J;
            if (bool == null || bool.booleanValue() != s0) {
                this.J = Boolean.valueOf(s0);
                this.H.animate().cancel();
                ir8 ir8Var = this.H;
                if (!z) {
                    ir8Var.setAlpha(s0 ? 1.0f : 0.0f);
                    this.H.setScaleX(s0 ? 1.0f : 0.7f);
                    this.H.setScaleY(s0 ? 1.0f : 0.7f);
                    this.H.setTranslationY(s0 ? 0.0f : hl.L(10.0f));
                    this.H.setVisibility(s0 ? 0 : 8);
                } else if (s0) {
                    if (ir8Var.getVisibility() != 0) {
                        this.H.setAlpha(0.0f);
                        this.H.setScaleX(0.7f);
                        this.H.setScaleY(0.7f);
                        this.H.setTranslationY(hl.L(10.0f));
                    }
                    this.H.setVisibility(0);
                    this.H.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(320L).setInterpolator(k43.h).withEndAction(null).start();
                } else {
                    ir8Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).translationY(hl.L(10.0f)).setDuration(320L).setInterpolator(k43.h).withEndAction(new vl7(this, (byte) 4)).start();
                }
            }
            this.H.setEnabled(!this.f);
            this.I.setLoading(this.f);
            c51 c51Var = this.I;
            HashSet hashSet = this.d;
            c51Var.c(hashSet.size(), z);
            this.H.setContentDescription(ob6.M0(2131747983, null) + ", " + hashSet.size());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.H.getLayoutParams();
            layoutParams.bottomMargin = hl.L(72.0f) + this.G;
            this.H.setLayoutParams(layoutParams);
        }
        int i = 0;
        while (true) {
            jm7[] jm7VarArr = this.b;
            if (i >= jm7VarArr.length) {
                return;
            }
            jm7 jm7Var = jm7VarArr[i];
            if (jm7Var.f != null && jm7Var.f.getPaddingBottom() != (q0 = q0(i))) {
                im7 im7Var = jm7Var.f;
                im7Var.setPadding(0, im7Var.getPaddingTop(), 0, q0);
                ViewGroup viewGroup = jm7Var.i;
                if (viewGroup != null) {
                    viewGroup.requestLayout();
                }
            }
            i++;
        }
    }

    public final void N0(boolean z) {
        sla slaVar = this.L;
        if (slaVar != null) {
            slaVar.setContentDescription(ob6.M0(this.T ? 2131747996 : 2131747993, null));
            e29 iconView = this.L.getIconView();
            if (iconView == null) {
                return;
            }
            if (this.d0 == null) {
                b29 b29Var = new b29(R.raw.media_shrink, hl.L(24.0f), hl.L(24.0f));
                b29Var.M(iconView);
                b29Var.E(true);
                b29Var.h = true;
                b29Var.F(0);
                this.d0 = b29Var;
                b29 b29Var2 = new b29(R.raw.media_enlarge, hl.L(24.0f), hl.L(24.0f));
                b29Var2.M(iconView);
                b29Var2.E(true);
                b29Var2.h = true;
                b29Var2.F(0);
                this.e0 = b29Var2;
            }
            b29 b29Var3 = this.T ? this.e0 : this.d0;
            if (!z || (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled())) {
                b29Var3.stop();
                b29Var3.I(b29Var3.e[0] - 1, false, false);
                iconView.setImageDrawable(b29Var3);
            } else {
                this.d0.H(0);
                this.e0.H(0);
                iconView.setImageDrawable(b29Var3);
                b29Var3.start();
            }
        }
    }

    public final void O0(int i) {
        jm7 jm7Var;
        String str;
        jm7 jm7Var2 = this.b[i];
        ArrayList arrayList = new ArrayList();
        im7 im7Var = jm7Var2.f;
        int i2 = 0;
        while (im7Var != null && i2 < im7Var.getChildCount()) {
            View childAt = im7Var.getChildAt(i2);
            if (childAt instanceof v94) {
                v94 v94Var = (v94) childAt;
                if (v94Var.getMessage() != null && childAt.getAlpha() >= 0.5f) {
                    r47 message = v94Var.getMessage();
                    float y = childAt.getY() + im7Var.getTranslationY();
                    fa4 fa4Var = (fa4) jm7Var2.d.get(E0(message.k));
                    long B0 = r47.B0(message.k);
                    Integer num = (Integer) jm7Var2.e.get(E0(message.k));
                    int intValue = num != null ? num.intValue() : message.e1();
                    long j = message.k.grouped_id;
                    float height = y + childAt.getHeight();
                    float paddingTop = im7Var.getPaddingTop();
                    jm7Var = jm7Var2;
                    float height2 = im7Var.getHeight() - Math.max(im7Var.getPaddingBottom(), this.O);
                    if (fa4Var == null) {
                        fa4Var = f0;
                    }
                    r47 message2 = v94Var.getMessage();
                    if (t0(i, message2)) {
                        km7 km7Var = (km7) this.W.get(B0(i, message2));
                        str = (!v94Var.L || v94Var.a0 <= v94Var.b0 || (km7Var != null && km7Var.b >= 1.0f)) ? "whole" : "cut";
                    } else {
                        str = "card";
                    }
                    ga4 a = vke.a(B0, intValue, j, y, height, paddingTop, height2, new fa4(fa4Var.a, fa4Var.b, str));
                    if (a != null) {
                        arrayList.add(a);
                    }
                    i2++;
                    jm7Var2 = jm7Var;
                }
            }
            jm7Var = jm7Var2;
            i2++;
            jm7Var2 = jm7Var;
        }
        this.Y[i].a.d(arrayList);
    }

    @Override // i1d
    public final void P() {
        int i = this.P;
        if (this.O == i) {
            return;
        }
        this.O = i;
        M0(false);
    }

    public final void P0() {
        ir1 ir1Var;
        if (this.y == null || (ir1Var = this.w) == null) {
            return;
        }
        int currentPosition = ir1Var.getCurrentPosition();
        float positionAnimated = this.w.getPositionAnimated();
        float f = currentPosition;
        float R1 = hl.R1(I0(currentPosition), I0(positionAnimated > f ? currentPosition + 1 : currentPosition - 1), Math.abs(positionAnimated - f));
        float L = hl.L(48.0f);
        float p0 = (p0() - hl.L(9.0f)) - R1;
        float r0 = r0();
        this.y.setTranslationY(hl.R1(p0, r0, this.E));
        this.w.setTranslationY((r0 - p0) * this.E);
        float R12 = hl.R1(1.0f - (R1 / L), 1.0f, this.E);
        this.y.setAlpha(R12);
        this.y.setVisibility(R12 > 0.0f ? 0 : 4);
        this.y.setBlurredBackgroundVisibility(this.E);
        this.y.setTranslationZ(this.E > 0.0f ? hl.L(1.0f) : 0.0f);
        float f2 = 1.0f - this.E;
        cm7 cm7Var = this.x;
        if (cm7Var != null) {
            cm7Var.setAlpha(f2);
        }
        rla rlaVar = this.S;
        if (rlaVar != null) {
            rlaVar.setAlpha(f2);
            this.S.setVisibility(f2 > 0.0f ? 0 : 4);
            this.simpleActionBar.setMenuPillAlpha(f2);
        }
    }

    @Override // i1d
    public final View R() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e, ej6
    public final boolean W(MotionEvent motionEvent, boolean z) {
        if (u0(z)) {
            return false;
        }
        if (!this.N) {
            ir1 ir1Var = this.w;
            if (ir1Var == null || ir1Var.s()) {
                return false;
            }
            this.simpleActionBar.getLocationOnScreen(new int[2]);
            if (motionEvent.getRawY() >= this.simpleActionBar.getHeight() + r0[1]) {
                if (this.w.canScrollHorizontally(z ? 1 : -1)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean clipsScrimUnderOccluders() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        byte b = 0;
        this.N = false;
        this.M = false;
        this.Q = "";
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 12));
        rla v = this.simpleActionBar.v();
        this.S = v;
        byte b2 = 1;
        this.L = v.a(1, this.T ? R.drawable.news_compact : R.drawable.news_expanded);
        N0(false);
        d26 d26Var = new d26((byte) 5, context, this);
        bm6 bm6Var = new bm6(this, (byte) 18);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(d26Var, bm6Var);
        int i = aob.d6;
        yob.h(i, getResourceProvider(), d26Var);
        this.fragmentView = d26Var;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.g1.d.add(this);
        }
        ir1 ir1Var = new ir1((byte) 4, context, this);
        this.w = ir1Var;
        ir1Var.setAllowDisallowInterceptTouch(false);
        byte b3 = 3;
        this.w.setAdapter(new bn0(b3, context, this));
        d26Var.addView(this.w, tre.e(-1, -1, jn7.D1));
        jm7[] jm7VarArr = this.b;
        jm7VarArr[2].f = m0(context, 2);
        jm7VarArr[2].f.setAlpha(0.0f);
        jm7VarArr[2].f.setVisibility(8);
        d26Var.addView(jm7VarArr[2].f, tre.c(-1.0f, -1));
        eg0 baseSimpleGlass = getBaseSimpleGlass();
        ir1 ir1Var2 = this.w;
        jla jlaVar = this.simpleActionBar;
        vnb vnbVar = this.resourceProvider;
        baseSimpleGlass.m = d26Var;
        baseSimpleGlass.n = ir1Var2;
        baseSimpleGlass.a.c(ir1Var2);
        baseSimpleGlass.j(d26Var, jlaVar, vnbVar);
        this.simpleActionBar.setButtonsGlassColorProvider(dtd.n(this.resourceProvider));
        getBaseSimpleGlass().o = new dg0(this, d26Var, (byte) 7);
        getBaseSimpleGlass().n = null;
        dm7 dm7Var = new dm7(this, context);
        this.K = dm7Var;
        dm7Var.setImportantForAccessibility(2);
        d26Var.addView(this.K, d26Var.indexOfChild(this.simpleActionBar), tre.e(-1, 0, 48));
        hj3 hj3Var = new hj3(context, this.resourceProvider, b2);
        hj3Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        hj3Var.setPivotX(0.0f);
        hj3Var.setPivotY(0.0f);
        String M0 = ob6.M0(2131745564, null);
        m7 m7Var = hj3Var.r;
        m7Var.setHint(M0);
        m7Var.setContentDescription(ob6.M0(2131745564, null));
        jl0 c = getBaseSimpleGlass().c.c(hj3Var, null, false);
        c.p(dtd.n(this.resourceProvider));
        hj3Var.setupBlurredBackground(c);
        hj3Var.setBlurredBackgroundVisibility(0.0f);
        m7Var.setOnFocusChangeListener(new ts0(this, (byte) 15));
        hj3Var.setCloseButtonOnClickListener(new vl7(this, b));
        hj3Var.setCloseButtonHideDuration(80L);
        m7Var.addTextChangedListener(new nh6(this, b3));
        this.y = hj3Var;
        d26Var.addView(hj3Var, d26Var.indexOfChild(this.K), tre.d(-1, 48.0f, 48, 7.0f, 0.0f, 7.0f, 0.0f));
        this.simpleActionBar.setBackground(null);
        cm7 cm7Var = new cm7(context, this.resourceProvider);
        jl0 c2 = getBaseSimpleGlass().c.c(cm7Var, null, false);
        c2.p(dtd.r(this.resourceProvider));
        c2.r(hl.L(18.0f));
        c2.q(hl.L(6.666f));
        cm7Var.setBlurredBackground(c2);
        cm7Var.setPadding(0, hl.L(7.0f), 0, hl.L(7.0f));
        cm7Var.setDelegate(new xh4((Object) this, (byte) 17));
        cm7Var.a(0, 0, ob6.M0(2131747992, null));
        cm7Var.a(1, 1, ob6.M0(2131754355, null));
        cm7Var.G.setItemAnimator(null);
        cm7Var.J.f();
        cm7Var.j(1.0f, 0);
        this.x = cm7Var;
        this.simpleActionBar.addView(cm7Var, tre.e(-2, -2, 1));
        oz4 oz4Var = new oz4();
        this.a = oz4Var;
        oz4Var.a(getThemedColor(i));
        ll0 ll0Var = new ll0(oz4Var, oz4Var, oz4Var);
        ir8 ir8Var = new ir8(context);
        this.H = ir8Var;
        jl0 c3 = ll0Var.c(ir8Var, new cl0(i, this.resourceProvider), false);
        c3.q(hl.L(8.0f));
        c3.r(hl.L(22.0f));
        this.H.setBackground(c3);
        iye.b(this.H, 0.02f, 1.2f);
        c51 c51Var = new c51(this.resourceProvider, context, true);
        this.I = c51Var;
        c51Var.setUseWrapContent(true);
        this.I.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        this.I.setRoundRadius(19);
        this.I.i(ob6.M0(2131747983, null), false, true);
        this.I.setShowZero(true);
        this.I.setStateListAnimator(null);
        this.H.addView(this.I, tre.e(-2, -1, 17));
        this.H.setOnClickListener(new am7(this, b));
        d26Var.addView(this.H, tre.e(-2, 60, 81));
        M0(false);
        x0();
        setBulletinDelegate(new t10(this, (byte) 13));
        return d26Var;
    }

    public final void d0(TLRPC.Chat chat, boolean z) {
        long j = chat.id;
        j61 j61Var = new j61((Object) this, j, (Object) chat, z, (byte) 9);
        if (!chat.in_news) {
            getMessagesController().j(j, getUserConfig().f(), 0, null, this, false, new j61((Object) this, j, z, (Object) j61Var, (byte) 10), null, null, z);
            return;
        }
        TLRPC.TL_channels_editChannelNews tL_channels_editChannelNews = new TLRPC.TL_channels_editChannelNews();
        tL_channels_editChannelNews.channel = getMessagesController().h1(j);
        tL_channels_editChannelNews.news = false;
        getConnectionsManager().sendRequest(tL_channels_editChannelNews, new rs0((Object) this, j, false, (Object) tL_channels_editChannelNews, (Runnable) j61Var, (byte) 4));
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.Q) {
            y0(1, true);
            return;
        }
        if (i == 1) {
            long longValue = ((Long) objArr[0]).longValue();
            if (((Boolean) objArr[2]).booleanValue() || ((Integer) objArr[3]).intValue() != 0 || longValue >= 0) {
                return;
            }
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-longValue));
            if (!xc2.V(M0) || xc2.r0(M0)) {
                return;
            }
            jm7 jm7Var = this.b[1];
            if (jm7Var.l) {
                if (jm7Var.k && jm7Var.p) {
                    return;
                }
                ArrayList arrayList = (ArrayList) objArr[1];
                im7 im7Var = jm7Var.f;
                boolean z = (im7Var == null || im7Var.canScrollVertically(-1)) ? false : true;
                int size = arrayList.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    TLRPC.Message message = ((r47) obj).k;
                    if (message != null && message.id > 0 && !(message instanceof TLRPC.TL_messageService) && e0(jm7Var, message, 0)) {
                        i3++;
                    }
                }
                if (i3 > 0) {
                    L0(jm7Var);
                    if (z) {
                        jm7Var.f.x0(0);
                    }
                }
            }
        }
    }

    public final boolean e0(jm7 jm7Var, TLRPC.Message message, int i) {
        int i2 = 0;
        if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.peer_id != null) {
            String str = r47.B0(message) + ":" + message.id;
            HashSet hashSet = jm7Var.b;
            ArrayList arrayList = jm7Var.a;
            if (hashSet.add(str)) {
                r47 r47Var = new r47(this.currentAccount, message, false, false);
                if (jm7Var == this.b[2]) {
                    r47Var.J5(this.Q, true);
                }
                HashMap hashMap = jm7Var.e;
                String E0 = E0(message);
                int i3 = message.id;
                Integer num = (Integer) hashMap.get(E0);
                if (num == null || i3 < num.intValue()) {
                    hashMap.put(E0, Integer.valueOf(i3));
                }
                if (message.grouped_id != 0) {
                    long B0 = r47.B0(r47Var.k);
                    long j = r47Var.k.grouped_id;
                    while (true) {
                        IdentityHashMap identityHashMap = jm7Var.c;
                        if (i2 >= arrayList.size()) {
                            break;
                        }
                        Object obj = arrayList.get(i2);
                        if (obj instanceof r47) {
                            r47 r47Var2 = (r47) obj;
                            TLRPC.Message message2 = r47Var2.k;
                            if (message2.grouped_id == j && r47.B0(message2) == B0) {
                                ArrayList arrayList2 = (ArrayList) identityHashMap.get(r47Var2);
                                if (arrayList2 == null) {
                                    arrayList2 = qd4.t(r47Var2);
                                }
                                arrayList2.add(r47Var);
                                Collections.sort(arrayList2, new vk6((byte) 28));
                                if (!TextUtils.isEmpty(r47Var2.k.message) || TextUtils.isEmpty(r47Var.k.message)) {
                                    r47Var = r47Var2;
                                } else {
                                    identityHashMap.remove(r47Var2);
                                    arrayList.set(i2, r47Var);
                                }
                                identityHashMap.put(r47Var, arrayList2);
                                return true;
                            }
                        }
                        i2++;
                    }
                }
                if (i < 0) {
                    arrayList.add(r47Var);
                    return true;
                }
                arrayList.add(i, r47Var);
                return true;
            }
        }
        return false;
    }

    public final void h0(ha4 ha4Var, boolean z, String str) {
        this.a0.a(ha4Var, z, PhotoViewer.C0() && PhotoViewer.q0().V0());
        ea4.c(this.currentAccount, ha4Var, str);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // ej6
    public final rz4 j() {
        return getBaseSimpleGlass().c();
    }

    public final void j0() {
        hj3 hj3Var = this.y;
        if (hj3Var == null || !this.M) {
            return;
        }
        hj3Var.post(new fe7(hj3Var, (byte) 8));
        this.y.r.getText().clear();
        hl.t1(this.y.r);
        this.y.r.clearFocus();
        this.y.setCloseButtonVisible(false);
        K0(false);
    }

    public final FrameLayout k0(Context context, int i) {
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(hl.L(24.0f), hl.L(24.0f), hl.L(24.0f), hl.L(24.0f));
        frameLayout.addView(linearLayout, tre.e(-1, -2, 17));
        de0 de0Var = new de0(context);
        linearLayout.addView(de0Var, tre.r(jn7.N1, jn7.N1, 1));
        ls6.d0(this.currentAccount).e2(de0Var, "UtyaDuck", "😎", "130_130");
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(i == 1 ? 2131747998 : i == 2 ? 2131747999 : 2131748000, null));
        textView.setTextSize(20.0f);
        textView.setTypeface(hl.o());
        yob.X(textView, aob.G6, getResourceProvider());
        textView.setGravity(17);
        TextView m = ik8.m(linearLayout, textView, tre.k(0.0f, 16.0f, 0.0f, 0.0f, -1, -2), context);
        m.setText(ob6.M0(i == 1 ? 2131748001 : i == 2 ? 2131748002 : 2131748003, null));
        m.setTextSize(14.0f);
        yob.X(m, aob.y6, getResourceProvider());
        m.setGravity(17);
        linearLayout.addView(m, tre.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        return frameLayout;
    }

    public final rg2 l0(Context context) {
        e29 e29Var = new e29(context);
        e29Var.f(R.raw.utyan_empty, jn7.N1, jn7.N1, null);
        e29Var.d();
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131745528, null));
        textView.setTextSize(20.0f);
        textView.setTypeface(hl.o());
        yob.X(textView, aob.G6, getResourceProvider());
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        textView2.setText(ob6.M0(2131745535, null));
        textView2.setTextSize(14.0f);
        yob.X(textView2, aob.y6, getResourceProvider());
        textView2.setGravity(17);
        rg2 rg2Var = new rg2(context, textView, textView2, e29Var);
        rg2Var.setOrientation(1);
        rg2Var.setGravity(17);
        rg2Var.setPadding(hl.L(24.0f), hl.L(12.0f), hl.L(24.0f), hl.L(12.0f));
        rg2Var.addView(e29Var, tre.t(jn7.N1, jn7.N1, 1, 0, 0, 0, 16));
        rg2Var.addView(textView, tre.o(-1, -2));
        rg2Var.addView(textView2, tre.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        return rg2Var;
    }

    public final im7 m0(Context context, int i) {
        jm7 jm7Var = this.b[i];
        im7 im7Var = new im7(this, context, i, new f((Object) this, i, (Object) jm7Var, (Object) context, (byte) 7), new bf((Object) this, i, (Object) jm7Var, (byte) 10), new wg((Object) this, i, (byte) 16));
        im7Var.setClipToPadding(false);
        im7Var.setPadding(0, p0(), 0, q0(i));
        im7Var.j(new em7(this, i, im7Var, jm7Var));
        return im7Var;
    }

    public final ha4 n0(int i, r47 r47Var, String str, String str2) {
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-r47.B0(r47Var.k)));
        long B0 = r47.B0(r47Var.k);
        long j = (M0 == null || M0.min) ? 0L : M0.access_hash;
        jm7[] jm7VarArr = this.b;
        Integer num = (Integer) jm7VarArr[i].e.get(E0(r47Var.k));
        return new ha4(B0, j, num != null ? num.intValue() : r47Var.e1(), str, str2, i == 2 ? "search" : i == 1 ? "added" : "feed", (fa4) jm7VarArr[i].d.get(E0(r47Var.k)), ea4.g(this.currentAccount), Utilities.b.nextLong());
    }

    @Override // i1d
    public final void o(l2d l2dVar) {
        int i = l2dVar.a.f(8).d;
        if (this.O == i) {
            return;
        }
        this.O = i;
        M0(false);
    }

    public final void o0(int i, r47 r47Var, ArrayList arrayList) {
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-r47.B0(r47Var.k)));
        kea keaVar = new kea(getParentActivity(), arrayList, null, xc2.V(M0), TextUtils.isEmpty(xc2.K(M0, false)) ? null : C0(r47Var), false, this.resourceProvider);
        keaVar.n2 = new lp((Object) this, i, (Object) r47Var, (byte) 11);
        showDialog(keaVar);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        if (!this.M) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        j0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        int i = 0;
        if (!super.onFragmentCreate()) {
            return false;
        }
        getNotificationCenter().b(this, jn7.Q);
        byte b = 1;
        getNotificationCenter().b(this, 1);
        while (true) {
            da4[] da4VarArr = this.Y;
            if (i >= da4VarArr.length) {
                break;
            }
            da4VarArr[i] = new da4(this.currentAccount, i == 2 ? "search" : i == 1 ? "added" : "feed");
            i++;
        }
        hl.d3(this.Z, 100L);
        String i2 = ea4.i(this.currentAccount);
        if (i2 != null) {
            ea4.e.postRunnable(new qu2(i2, b));
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        this.h = true;
        hl.r(this.Z);
        na4 na4Var = this.a0;
        na4Var.e &= na4Var.d;
        na4Var.b();
        for (da4 da4Var : this.Y) {
            da4Var.a.b(false);
            da4Var.a();
        }
        vpa vpaVar = this.U.c;
        if (vpaVar != null) {
            vpaVar.d();
        }
        Iterator it = this.V.values().iterator();
        while (it.hasNext()) {
            vpa vpaVar2 = ((km7) it.next()).c;
            if (vpaVar2 != null) {
                vpaVar2.d();
            }
        }
        Iterator it2 = this.W.values().iterator();
        while (it2.hasNext()) {
            vpa vpaVar3 = ((km7) it2.next()).c;
            if (vpaVar3 != null) {
                vpaVar3.d();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.g1.d.remove(this);
        }
        vl7 vl7Var = this.R;
        if (vl7Var != null) {
            hl.r(vl7Var);
        }
        getNotificationCenter().n(this, jn7.Q);
        getNotificationCenter().n(this, 1);
        setBulletinDelegate(null);
        super.onFragmentDestroy();
        for (jm7 jm7Var : this.b) {
            xl7 xl7Var = jm7Var.t;
            if (xl7Var != null) {
                hl.r(xl7Var);
                jm7Var.t.run();
            }
            jm7Var.f = null;
            jm7Var.g = null;
            jm7Var.h = null;
            jm7Var.i = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            oz4 oz4Var = this.a;
            if (oz4Var != null) {
                oz4Var.a(getThemedColor(aob.d6));
            }
            hj3 hj3Var = this.y;
            if (hj3Var != null) {
                hj3Var.updateColors();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final int p0() {
        jla jlaVar = this.simpleActionBar;
        if (jlaVar == null) {
            return a.getCurrentActionBarHeight();
        }
        return this.simpleActionBar.getExtraHeight() + a.getCurrentActionBarHeight() + (jlaVar.getOccupyStatusBar() ? hl.m : 0);
    }

    public final int q0(int i) {
        int L = hl.L((s0() ? 60 : 0) + 72) + this.G;
        return i == 2 ? Math.max(L, this.O) : L;
    }

    public final int r0() {
        jla jlaVar = this.simpleActionBar;
        return ((a.getCurrentActionBarHeight() - hl.L(48.0f)) / 2) + ((jlaVar == null || !jlaVar.getOccupyStatusBar()) ? 0 : hl.m);
    }

    public final boolean s0() {
        if (this.f) {
            return true;
        }
        HashSet hashSet = this.d;
        return (hashSet.isEmpty() || hashSet.equals(this.e)) ? false : true;
    }

    public final boolean t0(int i, r47 r47Var) {
        km7 km7Var = (km7) this.V.get(B0(i, r47Var));
        return (km7Var != null ? km7Var.b : this.U.b) > 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u0(boolean z) {
        im7 im7Var;
        jm7 jm7Var;
        if (ob6.a0 != z) {
            return false;
        }
        boolean z2 = this.N;
        jm7[] jm7VarArr = this.b;
        if (z2) {
            jm7Var = jm7VarArr[2];
        } else {
            ir1 ir1Var = this.w;
            if (ir1Var == null) {
                im7Var = null;
                if (ik8.A(im7Var)) {
                    return false;
                }
                return im7Var.t3 || im7Var.u3;
            }
            jm7Var = jm7VarArr[ir1Var.getCurrentPosition()];
        }
        im7Var = jm7Var.f;
        if (ik8.A(im7Var)) {
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // ej6
    public final void v() {
        int currentPosition;
        jm7 jm7Var;
        im7 im7Var;
        if (this.N) {
            currentPosition = 2;
        } else {
            ir1 ir1Var = this.w;
            currentPosition = ir1Var != null ? ir1Var.getCurrentPosition() : -1;
        }
        if (currentPosition < 0 || (im7Var = (jm7Var = this.b[currentPosition]).f) == null) {
            return;
        }
        if (im7Var.f3.K0() < 2) {
            jm7Var.f.A0(0);
            return;
        }
        this.X[currentPosition] = null;
        hw6 hw6Var = jm7Var.g;
        if (hw6Var == null) {
            im7 im7Var2 = jm7Var.f;
            hw6Var = new hw6(im7Var2, im7Var2.f3);
            jm7Var.g = hw6Var;
        }
        hw6Var.l(1);
        jm7Var.g.k(0, 0, false, false);
    }

    public final /* synthetic */ void w0(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_editChannelNews tL_channels_editChannelNews, long j, boolean z, j61 j61Var) {
        if (this.h) {
            return;
        }
        if (tL_error != null || !(tLObject instanceof TLRPC.Updates)) {
            jj.c0(this.currentAccount, tL_error, this, tL_channels_editChannelNews, new Object[0]);
            return;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j));
        if (M0 != null) {
            M0.in_news = z;
        }
        getNotificationCenter().k(jn7.Q, Long.valueOf(j));
        getMessagesController().h5(null);
        getNotificationCenter().k(jn7.r, new Object[0]);
        jn7 notificationCenter = getNotificationCenter();
        int i = uc7.r5;
        notificationCenter.k(2, Integer.valueOf(TLObject.FLAG_13));
        j61Var.run();
    }

    public final void x0() {
        if (this.n || this.h) {
            return;
        }
        this.n = true;
        this.r = false;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(new TL_feed.TL_feed_getInterestCategories(), new wl7(this, (byte) 0)), this.classGuid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0(int i, boolean z) {
        TL_feed.TL_feed_getForYou tL_feed_getForYou;
        w94 w94Var;
        jm7 jm7Var = this.b[i];
        if (this.h) {
            return;
        }
        if (jm7Var.k) {
            jm7Var.o |= z;
            return;
        }
        if (z || !jm7Var.m) {
            if (i == 2) {
                if (TextUtils.isEmpty(this.Q)) {
                    return;
                }
                if (!z && (this.R != null || !jm7Var.l)) {
                    return;
                }
            }
            String str = this.Q;
            jm7Var.p = z;
            jm7Var.q = z;
            if (z && (w94Var = jm7Var.h) != null) {
                w94Var.setRefreshing(true);
            }
            jm7Var.k = true;
            jm7Var.n = false;
            L0(jm7Var);
            if (i == 0 || i == 2) {
                TL_feed.TL_feed_getForYou tL_feed_getForYou2 = new TL_feed.TL_feed_getForYou();
                tL_feed_getForYou2.limit = 30;
                if (i == 2) {
                    tL_feed_getForYou2.query = str;
                }
                tL_feed_getForYou = tL_feed_getForYou2;
            } else {
                TL_feed.TL_feed_getFeed tL_feed_getFeed = new TL_feed.TL_feed_getFeed();
                tL_feed_getFeed.limit = 30;
                tL_feed_getFeed.offset_position = z ? null : jm7Var.r;
                tL_feed_getForYou = tL_feed_getFeed;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_feed_getForYou, new qa7(this, jm7Var, i, str, z)), this.classGuid);
        }
    }

    public final void z0(jm7 jm7Var) {
        im7 im7Var;
        int i;
        int i2;
        int i3;
        if (this.h || (im7Var = jm7Var.f) == null) {
            return;
        }
        int K0 = im7Var.f3.K0();
        int M0 = jm7Var.f.f3.M0();
        if (K0 >= 0) {
            TLRPC.Message message = null;
            while (K0 <= M0) {
                b8c G = jm7Var.f.g3.G(K0);
                if (G != null) {
                    Object obj = G.H;
                    if (obj instanceof r47) {
                        TLRPC.Message message2 = ((r47) obj).k;
                        if (message == null || (i2 = message2.date) > (i3 = message.date) || (i2 == i3 && message2.id > message.id)) {
                            message = message2;
                        }
                    }
                }
                K0++;
            }
            if (message != null) {
                TL_feed.FeedPosition feedPosition = new TL_feed.FeedPosition();
                int i4 = message.date;
                feedPosition.date = i4;
                feedPosition.peer = message.peer_id;
                int i5 = message.id;
                feedPosition.id = i5;
                TL_feed.FeedPosition feedPosition2 = jm7Var.s;
                if (feedPosition2 == null || i4 > (i = feedPosition2.date) || (i4 == i && i5 > feedPosition2.id)) {
                    jm7Var.s = feedPosition;
                    xl7 xl7Var = jm7Var.t;
                    if (xl7Var != null) {
                        hl.r(xl7Var);
                    }
                    xl7 xl7Var2 = new xl7(this, jm7Var, (byte) 1);
                    jm7Var.t = xl7Var2;
                    hl.d3(xl7Var2, 500L);
                }
            }
        }
    }

    @Override // i1d
    public final void w() {
    }
}
