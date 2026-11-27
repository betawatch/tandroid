// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class nx9 extends vic implements xg4, fn7, yi5 {
    public kx9 A0;
    public boolean B0;
    public final HashMap C0;
    public final ArrayList D0;
    public s7 E0;
    public s7 F0;
    public s7 G0;
    public s7 H0;
    public s6 I0;
    public aw9 J0;
    public final int K0;
    public boolean L0;
    public final uj3 M0;
    public String N0;
    public og4 O0;
    public final yg4 P0;
    public int Q0;
    public boolean R0;
    public final aj3 S0;
    public final wma T0;
    public final int U0;
    public int V0;
    public final bn0 W;
    public final long W0;
    public int X0;
    public int Y0;
    public u8a Z0;
    public final FrameLayout a0;
    public ll0 a1;
    public final gw9 b0;
    public final ax9 c0;
    public final zb3 d0;
    public final gx9 e0;
    public final x46 f0;
    public final i69 g0;
    public boolean h0;
    public final FrameLayout i0;
    public final ax9 j0;
    public final x46 k0;
    public final d79 l0;
    public final ix9 m0;
    public final FrameLayout n0;
    public final ax9 o0;
    public final x46 p0;
    public final d79 q0;
    public final bx9 r0;
    public final mj8 s0;
    public boolean t0;
    public final FrameLayout u0;
    public final ax9 v0;
    public final x46 w0;
    public final d79 x0;
    public final ex9 y0;
    public ImageView z0;

    public nx9(Activity activity, uj3 uj3Var, int i, int i2, int i3, long j, aj3 aj3Var) {
        super(activity, null);
        byte b = 0;
        this.t0 = false;
        this.C0 = new HashMap();
        this.D0 = new ArrayList();
        int i4 = yac.t0;
        this.K0 = i4;
        this.V0 = 0;
        this.U0 = i3;
        this.W0 = j;
        this.M0 = uj3Var;
        this.S0 = aj3Var;
        zb3 zb3Var = new zb3();
        this.d0 = zb3Var;
        zb3Var.c = (short) 150;
        zb3Var.e = (short) 350;
        zb3Var.f = (short) 0;
        zb3Var.g = (short) 0;
        zb3Var.d = (short) 0;
        zb3Var.i = new OvershootInterpolator(1.1f);
        zb3Var.o = k43.h;
        bj3 bj3Var = (bj3) this;
        this.e0 = new gx9(bj3Var, activity, uj3Var, i, i2, zb3Var, uj3Var.G, uj3Var, activity);
        byte b2 = 1;
        if (i2 == 15) {
            ArrayList o3 = uj3Var.o3(i4, i2, i3, true);
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < o3.size(); i5 = dze.c(i5, 1, ((TLRPC.Dialog) o3.get(i5)).id, arrayList)) {
            }
            this.e0.r0 = arrayList;
        }
        this.T0 = (wma) uj3Var.getFragmentView();
        gw9 gw9Var = new gw9(b2, activity, bj3Var);
        this.b0 = gw9Var;
        gw9Var.setItemAnimator(this.d0);
        gw9Var.setPivotY(0.0f);
        gw9Var.setClipToPadding(false);
        gw9Var.setAdapter(this.e0);
        gw9Var.setVerticalScrollBarEnabled(true);
        gw9Var.setInstantClick(true);
        byte b3 = 2;
        gw9Var.setVerticalScrollbarPosition(ob6.a0 ? 1 : 2);
        x46 x46Var = new x46(1, false);
        this.f0 = x46Var;
        gw9Var.setLayoutManager(x46Var);
        gw9Var.X1 = true;
        gw9Var.Y1 = false;
        gw9Var.setOnScrollListener(new cx9(bj3Var, uj3Var, b3));
        byte b4 = 29;
        gw9Var.F0(new v59(bj3Var, b4));
        yg4 yg4Var = new yg4(this.M0);
        this.P0 = yg4Var;
        gu guVar = yg4Var.b;
        guVar.setClipToPadding(false);
        guVar.j(new fx9(bj3Var, b2));
        guVar.F0(new v59(bj3Var, b4));
        yg4Var.setUiCallback(this);
        yg4Var.setVisibility(8);
        yg4Var.setChatPreviewDelegate(aj3Var);
        tk4 tk4Var = new tk4(activity, null);
        tk4Var.setViewType(1);
        ax9 ax9Var = new ax9(bj3Var, activity, tk4Var, b3);
        this.c0 = ax9Var;
        ax9Var.d.setText(ob6.M0(2131747898, null));
        ax9Var.e.setVisibility(8);
        ax9Var.setVisibility(8);
        ax9Var.addView(tk4Var, 0);
        ax9Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a0 = frameLayout;
        frameLayout.addView(ax9Var);
        frameLayout.addView(gw9Var);
        frameLayout.addView(yg4Var);
        gw9Var.setEmptyView(ax9Var);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.i0 = frameLayout2;
        hx9 hx9Var = new hx9(bj3Var);
        hx9Var.m = false;
        hx9Var.C = false;
        k43 k43Var = k43.h;
        hx9Var.o(k43Var);
        hx9Var.n(350L);
        d79 d79Var = new d79(activity, null);
        this.l0 = d79Var;
        d79Var.setItemAnimator(hx9Var);
        d79Var.setPivotY(0.0f);
        d79Var.setVerticalScrollBarEnabled(true);
        d79Var.setInstantClick(true);
        d79Var.setVerticalScrollbarPosition(ob6.a0 ? 1 : 2);
        x46 x46Var2 = new x46(1, false);
        this.k0 = x46Var2;
        d79Var.setLayoutManager(x46Var2);
        d79Var.X1 = true;
        d79Var.Y1 = false;
        d79Var.setClipToPadding(false);
        tk4 tk4Var2 = new tk4(activity, null);
        tk4Var2.setViewType(1);
        ax9 ax9Var2 = new ax9(bj3Var, activity, tk4Var2, (byte) 3);
        this.j0 = ax9Var2;
        ax9Var2.d.setText(ob6.M0(2131747898, null));
        ax9Var2.e.setVisibility(8);
        ax9Var2.setVisibility(8);
        ax9Var2.addView(tk4Var2, 0);
        ax9Var2.e(true, false);
        frameLayout2.addView(ax9Var2);
        frameLayout2.addView(d79Var);
        d79Var.setEmptyView(ax9Var2);
        ix9 ix9Var = new ix9(bj3Var, d79Var, activity, this.K0, i3, uj3Var);
        this.m0 = ix9Var;
        d79Var.setAdapter(ix9Var);
        d79Var.setOnScrollListener(new cx9(bj3Var, uj3Var, (byte) 3));
        d79Var.F0(new v59(bj3Var, (byte) 29));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.n0 = frameLayout3;
        zw9 zw9Var = new zw9(bj3Var);
        zw9Var.m = false;
        zw9Var.C = false;
        zw9Var.o(k43Var);
        zw9Var.n(350L);
        d79 d79Var2 = new d79(activity, null);
        this.q0 = d79Var2;
        d79Var2.setItemAnimator(zw9Var);
        d79Var2.setPivotY(0.0f);
        d79Var2.setClipToPadding(false);
        d79Var2.setVerticalScrollBarEnabled(true);
        d79Var2.setInstantClick(true);
        d79Var2.setVerticalScrollbarPosition(ob6.a0 ? 1 : 2);
        x46 x46Var3 = new x46(1, false);
        this.p0 = x46Var3;
        d79Var2.setLayoutManager(x46Var3);
        d79Var2.X1 = true;
        d79Var2.Y1 = false;
        tk4 tk4Var3 = new tk4(activity, null);
        tk4Var3.setViewType(1);
        ax9 ax9Var3 = new ax9(bj3Var, activity, tk4Var3, b);
        this.o0 = ax9Var3;
        ax9Var3.d.setText(ob6.M0(2131747898, null));
        ax9Var3.e.setVisibility(8);
        ax9Var3.setVisibility(8);
        ax9Var3.addView(tk4Var3, 0);
        ax9Var3.e(true, false);
        frameLayout3.addView(ax9Var3);
        frameLayout3.addView(d79Var2);
        d79Var2.setEmptyView(ax9Var3);
        bx9 bx9Var = new bx9(bj3Var, d79Var2, activity, this.K0, i3);
        this.r0 = bx9Var;
        d79Var2.setAdapter(bx9Var);
        d79Var2.setOnScrollListener(new cx9(bj3Var, uj3Var, b));
        d79Var2.F0(new v59(bj3Var, (byte) 29));
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.u0 = frameLayout4;
        dx9 dx9Var = new dx9(bj3Var);
        dx9Var.m = false;
        dx9Var.C = false;
        dx9Var.o(k43Var);
        dx9Var.n(350L);
        d79 d79Var3 = new d79(activity, null);
        this.x0 = d79Var3;
        d79Var3.setItemAnimator(dx9Var);
        d79Var3.setPivotY(0.0f);
        byte b5 = 1;
        d79Var3.setVerticalScrollBarEnabled(true);
        d79Var3.setInstantClick(true);
        d79Var3.setVerticalScrollbarPosition(ob6.a0 ? 1 : 2);
        x46 x46Var4 = new x46(1, false);
        this.w0 = x46Var4;
        d79Var3.setLayoutManager(x46Var4);
        d79Var3.X1 = true;
        d79Var3.Y1 = false;
        d79Var3.setClipToPadding(false);
        tk4 tk4Var4 = new tk4(activity, null);
        tk4Var4.setViewType(1);
        ax9 ax9Var4 = new ax9(bj3Var, activity, tk4Var4, b5);
        this.v0 = ax9Var4;
        ax9Var4.d.setText(ob6.M0(2131747898, null));
        ax9Var4.e.setVisibility(8);
        ax9Var4.setVisibility(8);
        ax9Var4.addView(tk4Var4, 0);
        ax9Var4.e(true, false);
        frameLayout4.addView(ax9Var4);
        frameLayout4.addView(d79Var3);
        d79Var3.setEmptyView(ax9Var4);
        ex9 ex9Var = new ex9(bj3Var, d79Var3, activity, this.K0);
        this.y0 = ex9Var;
        d79Var3.setAdapter(ex9Var);
        d79Var3.setOnScrollListener(new cx9(bj3Var, uj3Var, b5));
        d79Var3.F0(new v59(bj3Var, (byte) 29));
        this.g0 = new i69(gw9Var, true);
        mj8 mj8Var = new mj8(activity, uj3Var);
        this.s0 = mj8Var;
        q9c q9cVar = mj8Var.c;
        q9cVar.setClipToPadding(false);
        q9cVar.j(new fx9(bj3Var, b));
        q9cVar.F0(new v59(bj3Var, (byte) 29));
        bn0 bn0Var = new bn0(bj3Var);
        this.W = bn0Var;
        setAdapter(bn0Var);
    }

    public static zu1 N(int i, r47 r47Var) {
        Bundle bundle = new Bundle();
        long B0 = r47.B0(r47Var.k);
        if (wf3.B(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (wf3.D(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat M0 = uc7.s1(k5.a(i).a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", r47Var.e1());
        return new zu1(bundle);
    }

    public static void R(FrameLayout frameLayout, d79 d79Var, int i, int i2, boolean z) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i, 0, i2);
        if (z) {
            d79Var.r1(0, i, 0, i2);
        } else {
            d79Var.setPadding(0, i, 0, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d79Var.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
    }

    public final void M() {
        if (this.t0) {
            int i = 0;
            this.t0 = false;
            T();
            lic licVar = this.N;
            if (licVar != null && licVar.getCurrentTabId() != 0) {
                this.N.e(0, 0);
            }
            gx9 gx9Var = this.e0;
            if (gx9Var != null) {
                String str = this.N0;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.D0;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    if (((ph4) arrayList.get(i2)).d == 7) {
                        i = 1;
                        break;
                    }
                    i2++;
                }
                gx9Var.T(i, str);
            }
        }
    }

    public final int O(int i) {
        int i2 = 0;
        while (true) {
            bn0 bn0Var = this.W;
            ArrayList arrayList = (ArrayList) bn0Var.b;
            ArrayList arrayList2 = (ArrayList) bn0Var.b;
            if (i2 >= arrayList.size()) {
                return -1;
            }
            if (((mx9) arrayList2.get(i2)).a == 3 && ((mx9) arrayList2.get(i2)).b == i) {
                return i2;
            }
            i2++;
        }
    }

    public final boolean P() {
        int i = this.K0;
        if (!yac.h(i).p() && !uc7.s1(i).M3()) {
            for (r47 r47Var : this.C0.values()) {
                if (r47Var.F0() != null && r47Var.F0().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(View view, int i, String str, boolean z) {
        boolean z2;
        ax9 ax9Var;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        boolean isEmpty = TextUtils.isEmpty(str);
        ax9 ax9Var2 = this.c0;
        if (isEmpty) {
            ax9Var2.e.setVisibility(8);
        } else {
            ax9Var2.e.setVisibility(0);
            ax9Var2.e.setText(ob6.a0(null, null, 2131747896, str));
        }
        gx9 gx9Var = this.e0;
        dj3 dj3Var = gx9Var.V;
        long a = dj3Var != null ? dj3Var.a() : 0L;
        long j2 = i == 0 ? 0L : a;
        int i2 = 0;
        int i3 = 0;
        long j3 = 0;
        long j4 = 0;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i2 >= arrayList.size()) {
                break;
            }
            ph4 ph4Var = (ph4) arrayList.get(i2);
            byte b = ph4Var.d;
            if (b == 4) {
                TLObject tLObject = ph4Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                } else if ((tLObject instanceof TLRPC.Chat) && !xc2.Y((TLRPC.Chat) tLObject)) {
                    j = -((TLRPC.Chat) ph4Var.f).id;
                }
                j2 = j;
            } else if (b == 6) {
                nh4 nh4Var = ph4Var.g;
                long j5 = nh4Var.b;
                j4 = nh4Var.c;
                j3 = j5;
            } else if (b == 7) {
                i3 = 1;
            }
            i2++;
        }
        ex9 ex9Var = this.y0;
        ex9Var.getClass();
        if (ef5.Y(str, null) == null) {
            M();
        }
        if (view == this.i0) {
            uc7.s1(this.K0).L0(0L);
            ix9 ix9Var = this.m0;
            d79 d79Var = ix9Var.d;
            ArrayList arrayList2 = ix9Var.T;
            ArrayList arrayList3 = ix9Var.U;
            ArrayList arrayList4 = ix9Var.V;
            zg3 zg3Var = ix9Var.f0;
            ix9Var.X();
            if (!TextUtils.equals(str, ix9Var.e0)) {
                ix9Var.e0 = str;
                hl.r(zg3Var);
                boolean isEmpty2 = TextUtils.isEmpty(ix9Var.e0);
                ArrayList arrayList5 = ix9Var.S;
                if (isEmpty2) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    ix9Var.O(true);
                    ix9Var.d0++;
                    z5 = false;
                    ix9Var.Z = false;
                    ix9Var.a0 = false;
                    ix9Var.b0 = false;
                    ix9Var.c0 = 0;
                    if (d79Var != null) {
                        d79Var.x0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    hl.d3(zg3Var, 1000L);
                    ix9Var.Z = true;
                    ix9Var.a0 = true;
                    ix9Var.O(true);
                    if (d79Var != null) {
                        z5 = false;
                        d79Var.x0(0);
                    }
                }
                this.j0.b(this.Q0, z5);
                return;
            }
            z5 = false;
            this.j0.b(this.Q0, z5);
            return;
        }
        if (view == this.n0) {
            bx9 bx9Var = this.r0;
            d79 d79Var2 = bx9Var.d;
            ik3 ik3Var = bx9Var.i0;
            if (TextUtils.equals(str, bx9Var.h0)) {
                z4 = false;
            } else {
                bx9Var.h0 = str;
                hl.r(ik3Var);
                boolean isEmpty3 = TextUtils.isEmpty(bx9Var.h0);
                ArrayList arrayList6 = bx9Var.W;
                if (isEmpty3) {
                    arrayList6.clear();
                    bx9Var.O(true);
                    bx9Var.g0++;
                    z4 = false;
                    bx9Var.c0 = false;
                    bx9Var.d0 = false;
                    bx9Var.e0 = false;
                    bx9Var.f0 = 0;
                    if (d79Var2 != null) {
                        d79Var2.x0(0);
                    }
                } else {
                    z4 = false;
                    arrayList6.clear();
                    hl.d3(ik3Var, 1000L);
                    bx9Var.c0 = true;
                    bx9Var.d0 = true;
                    bx9Var.O(true);
                    if (d79Var2 != null) {
                        d79Var2.x0(0);
                    }
                }
            }
            this.o0.b(this.Q0, z4);
            if (TextUtils.isEmpty(str)) {
                bx9Var.W();
                return;
            }
            return;
        }
        mj8 mj8Var = this.s0;
        if (view == mj8Var) {
            q9c q9cVar = mj8Var.c;
            ArrayList arrayList7 = mj8Var.n;
            if (TextUtils.equals(mj8Var.x, str)) {
                return;
            }
            if (mj8Var.L >= 0) {
                ConnectionsManager.getInstance(mj8Var.b).cancelRequest(mj8Var.L, true);
                mj8Var.L = -1;
            }
            mj8Var.w = false;
            mj8Var.I.setLoading(false);
            mj8Var.x = str;
            if (TextUtils.isEmpty(str)) {
                mj8Var.r = 0;
                z3 = true;
                mj8Var.M++;
                mj8Var.s = false;
                arrayList7.clear();
                mj8Var.a(false);
            } else {
                z3 = true;
                mj8Var.b(str);
                mj8Var.r = 0;
                mj8Var.M++;
                mj8Var.s = false;
                arrayList7.clear();
            }
            mj8Var.d();
            q9cVar.x0(0);
            q9cVar.g3.O(z3);
            return;
        }
        if (view == this.u0) {
            if (ef5.Y(str, null) != null) {
                if (z) {
                    this.w0.g1(0, 0);
                }
                ex9Var.Z(str);
                this.v0.b(this.Q0, false);
                return;
            }
            return;
        }
        if (view != this.a0) {
            boolean z6 = i3;
            long j6 = j3;
            long j7 = j4;
            if (view instanceof yg4) {
                yg4 yg4Var = (yg4) view;
                yg4Var.setUseFromUserAsAvatar(a != 0);
                yg4Var.c.b(this.Q0, false);
                yg4Var.h(j2, this.W0, j6, j7, rh4.k3[((mx9) ((ArrayList) this.W.b).get(i)).b], z6, str, z);
                return;
            }
            if (view instanceof aw9) {
                aw9 aw9Var = (aw9) view;
                aw9Var.a.b(this.Q0, false);
                aw9Var.L = str;
                aw9Var.d(false);
                return;
            }
            return;
        }
        yg4 yg4Var2 = this.P0;
        if (!(j2 == 0 && this.W0 == 0 && j3 == 0 && j4 == 0) && a == 0) {
            boolean z7 = true;
            yg4Var2.setTag(1);
            yg4Var2.i(this.O0, false);
            yg4Var2.animate().setListener(null).cancel();
            if (z) {
                yg4Var2.setVisibility(0);
                yg4Var2.setAlpha(1.0f);
                z2 = z;
            } else {
                if (yg4Var2.getVisibility() != 0) {
                    yg4Var2.setVisibility(0);
                    yg4Var2.setAlpha(0.0f);
                } else {
                    z7 = z;
                }
                yg4Var2.animate().alpha(1.0f).setDuration(150L).start();
                z2 = z7;
            }
            ax9Var = ax9Var2;
            this.P0.h(j2, this.W0, j3, j4, null, i3, str, z2);
            ax9Var.setVisibility(8);
        } else {
            this.L0 = false;
            gx9Var.T(i3, str);
            gx9Var.B0 = this.O0;
            yg4Var2.animate().setListener(null).cancel();
            yg4Var2.i(null, false);
            if (z) {
                ax9Var2.e(!(gx9Var.E0 > 0), false);
                ax9Var2.e(gx9Var.E0 > 0, false);
            } else if (!gx9Var.M()) {
                ax9Var2.e(gx9Var.E0 > 0, true);
            }
            if (z) {
                yg4Var2.setVisibility(8);
            } else if (yg4Var2.getVisibility() != 8) {
                yg4Var2.animate().alpha(0.0f).setListener(new po9((Object) this, (byte) 3)).setDuration(150L).start();
            }
            yg4Var2.setTag(null);
            ax9Var = ax9Var2;
        }
        ax9Var.b(this.Q0, false);
        yg4Var2.c.b(this.Q0, false);
    }

    public final void S(boolean z) {
        c79 c79Var;
        c79 c79Var2;
        c79 c79Var3;
        dj3 dj3Var;
        if (this.B0 != z) {
            uj3 uj3Var = this.M0;
            if (z) {
                if (uj3Var.getActionBar().z()) {
                    return;
                }
                if (!uj3Var.getActionBar().e("search_view_pager")) {
                    this.I0 = uj3Var.getActionBar().q("search_view_pager");
                    if (uj3Var.X) {
                        ImageView imageView = new ImageView(getContext());
                        this.z0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.z0.setImageDrawable(new gd0(true));
                        yob.s(this.z0, aob.y8, null, PorterDuff.Mode.MULTIPLY);
                        ImageView imageView2 = this.z0;
                        int i = aob.z8;
                        yob.R(imageView2, aob.f0(aob.w0(null, i, false), 1, -1), null, yob.M(i), null);
                        this.z0.setOnClickListener(new jn8(this, (byte) 20));
                        this.I0.addView(this.z0, tre.p(54, 54, 0.0f, 16));
                    }
                    kx9 kx9Var = new kx9(this.I0.getContext());
                    this.A0 = kx9Var;
                    kx9Var.setTextSize(18);
                    this.A0.setTypeface(hl.o());
                    kx9 kx9Var2 = this.A0;
                    int i2 = aob.y8;
                    vr9 vr9Var = new vr9((byte) 8);
                    vr9 vr9Var2 = new vr9((byte) 9);
                    int P = yob.P(i2, -1, 0, 0.0f, null);
                    vr9Var2.e(P, kx9Var2);
                    sob w = yob.w(101, kx9Var2);
                    w.c(i2, -1, 0, 0.0f, null);
                    w.n = vr9Var;
                    w.o = vr9Var2;
                    w.m = false;
                    w.g = P;
                    this.I0.addView(this.A0, tre.m(1.0f, 0, -1, uj3Var.X ? 18 : 72, 0, 0));
                    this.A0.setOnTouchListener(new b02((byte) 23));
                    s7 h = this.I0.h(203, R.drawable.avd_speed, hl.L(54.0f), ob6.M0(2131754796, null));
                    this.E0 = h;
                    if (h.getIconView() != null) {
                        yob.s(this.E0.getIconView(), i2, null, PorterDuff.Mode.SRC_IN);
                    }
                    this.F0 = this.I0.h(jn7.d3, R.drawable.msg_message, hl.L(54.0f), ob6.M0(2131754873, null));
                    this.G0 = this.I0.h(jn7.e3, R.drawable.msg_forward, hl.L(54.0f), ob6.M0(2131750547, null));
                    this.H0 = this.I0.h(jn7.f3, R.drawable.msg_delete, hl.L(54.0f), ob6.M0(2131751563, null));
                }
            }
            if (this.A0 != null) {
                gx9 gx9Var = this.e0;
                ((ViewGroup.MarginLayoutParams) this.A0.getLayoutParams()).leftMargin = hl.L((uj3Var.X ? 18 : 72) + (gx9Var != null && (dj3Var = gx9Var.V) != null && (dj3Var.a() > 0L ? 1 : (dj3Var.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
                kx9 kx9Var3 = this.A0;
                kx9Var3.setLayoutParams(kx9Var3.getLayoutParams());
            }
            if (uj3Var.getActionBar().getBackButton() != null && (uj3Var.getActionBar().getBackButton().getDrawable() instanceof h27)) {
                gd0 gd0Var = new gd0(false);
                uj3Var.getActionBar().setBackButtonDrawable(gd0Var);
                gd0Var.setColorFilter(null);
            }
            this.B0 = z;
            HashMap hashMap = this.C0;
            if (z) {
                hl.t1(uj3Var.getParentActivity().getCurrentFocus());
                uj3Var.getActionBar().R(null, null);
                this.A0.a(hashMap.size(), false);
                this.E0.setVisibility(P() ? 0 : 8);
                this.F0.setVisibility(0);
                this.G0.setVisibility(0);
                this.H0.setVisibility(0);
                return;
            }
            uj3Var.getActionBar().y();
            hashMap.clear();
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if ((getChildAt(i3) instanceof yg4) && (c79Var3 = ((yg4) getChildAt(i3)).d) != null) {
                    c79Var3.f();
                }
                if (getChildAt(i3) instanceof aw9) {
                    ((aw9) getChildAt(i3)).d(true);
                }
            }
            yg4 yg4Var = this.P0;
            if (yg4Var != null && (c79Var2 = yg4Var.d) != null) {
                c79Var2.f();
            }
            SparseArray sparseArray = this.h;
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) sparseArray.valueAt(i4);
                if ((view instanceof yg4) && (c79Var = ((yg4) view).d) != null) {
                    c79Var.f();
                }
            }
        }
    }

    public final void T() {
        this.W.l();
        m(false);
        lic licVar = this.N;
        if (licVar != null) {
            licVar.y.f();
        }
    }

    @Override // yi5
    public final void a(qeb qebVar, RectF rectF) {
        qebVar.b = true;
    }

    @Override // xg4
    public final boolean d(qg4 qg4Var) {
        return this.C0.containsKey(qg4Var);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.h3;
        ix9 ix9Var = this.m0;
        if (i == i3) {
            this.j0.e(uc7.s1(this.K0).L0(0L) != null, true);
            ix9Var.X();
            ix9Var.O(true);
            return;
        }
        if (i == jn7.y1 || i == jn7.r) {
            ix9Var.X();
            ix9Var.O(true);
        } else {
            if (i == jn7.V0) {
                this.r0.O(true);
                return;
            }
            if (i == jn7.A5) {
                Object obj = objArr[0];
                ex9 ex9Var = this.y0;
                if (obj == ex9Var.T) {
                    ex9Var.O(true);
                }
            }
        }
    }

    @Override // xg4
    public final void e() {
        S(true);
    }

    @Override // yi5
    public final void g(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.a0;
                d79 d79Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        d79Var = this.b0;
                    } else if (view == this.i0) {
                        d79Var = this.l0;
                    } else if (view == this.n0) {
                        d79Var = this.q0;
                    } else if (view == this.u0) {
                        d79Var = this.x0;
                    } else {
                        aw9 aw9Var = this.J0;
                        if (view == aw9Var) {
                            d79Var = aw9Var.b;
                        } else {
                            mj8 mj8Var = this.s0;
                            if (view == mj8Var) {
                                d79Var = mj8Var.c;
                            } else if (view instanceof yg4) {
                                d79Var = ((yg4) view).b;
                            }
                        }
                    }
                }
                if (d79Var != null) {
                    uk0.a(d79Var, canvas, rectF, d79Var, this);
                }
                if (view == frameLayout) {
                    yg4 yg4Var = this.P0;
                    if (yg4Var.getVisibility() == 0) {
                        gu guVar = yg4Var.b;
                        uk0.a(guVar, canvas, rectF, guVar, this);
                    }
                }
            }
        }
    }

    public s6 getActionMode() {
        return this.I0;
    }

    public ArrayList<ph4> getCurrentSearchFilters() {
        return this.D0;
    }

    public aw9 getDownloadsContainer() {
        return this.J0;
    }

    public int getFolderId() {
        return this.U0;
    }

    @Override // vic
    public long getManualScrollDuration() {
        return 320L;
    }

    public s7 getSpeedItem() {
        return this.E0;
    }

    public uic getTabsView() {
        return this.N;
    }

    @Override // xg4
    public final void h(r47 r47Var, View view, int i) {
        boolean z;
        qg4 qg4Var = new qg4(r47Var.e1(), r47.B0(r47Var.k));
        HashMap hashMap = this.C0;
        if (hashMap.containsKey(qg4Var)) {
            hashMap.remove(qg4Var);
        } else if (hashMap.size() >= 100) {
            return;
        } else {
            hashMap.put(qg4Var, r47Var);
        }
        if (hashMap.size() == 0) {
            S(false);
        } else {
            this.A0.a(hashMap.size(), true);
            s7 s7Var = this.F0;
            if (s7Var != null) {
                s7Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
            }
            if (this.E0 != null) {
                boolean P = P();
                int i2 = P ? 0 : 8;
                if (this.E0.getVisibility() != i2) {
                    this.E0.setVisibility(i2);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.E0.getIconView().getDrawable();
                    yob.x(this, animatedVectorDrawable, aob.y8, null, PorterDuff.Mode.SRC_IN);
                    if (P) {
                        animatedVectorDrawable.start();
                    } else {
                        animatedVectorDrawable.reset();
                    }
                }
            }
            if (this.H0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    } else if (!((r47) hashMap.get((qg4) it.next())).Q) {
                        z = false;
                        break;
                    }
                }
                this.H0.setVisibility(z ? 0 : 8);
            }
        }
        if (view instanceof zea) {
            ((zea) view).b(hashMap.containsKey(qg4Var), true);
            return;
        }
        if (view instanceof kja) {
            ((kja) view).b(i, hashMap.containsKey(qg4Var), true);
            return;
        }
        if (view instanceof cfa) {
            ((cfa) view).f(hashMap.containsKey(qg4Var), true);
            return;
        }
        if (view instanceof vea) {
            ((vea) view).e(hashMap.containsKey(qg4Var), true);
        } else if (view instanceof vw2) {
            ((vw2) view).c(hashMap.containsKey(qg4Var), true);
        } else if (view instanceof of3) {
            ((of3) view).d0(hashMap.containsKey(qg4Var), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u8a u8aVar = this.Z0;
        if (u8aVar != null) {
            u8aVar.a();
            this.Z0 = null;
        }
        u8a u8aVar2 = new u8a(jn7.f(this.K0), this);
        u8aVar2.b(jn7.h3);
        u8aVar2.b(jn7.y1);
        u8aVar2.b(jn7.r);
        u8aVar2.b(jn7.V0);
        u8aVar2.b(jn7.A5);
        this.Z0 = u8aVar2;
        this.h0 = true;
        ix9 ix9Var = this.m0;
        if (ix9Var != null) {
            ix9Var.O(false);
        }
        bx9 bx9Var = this.r0;
        if (bx9Var != null) {
            bx9Var.O(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h0 = false;
        u8a u8aVar = this.Z0;
        if (u8aVar != null) {
            u8aVar.a();
            this.Z0 = null;
        }
    }

    @Override // vic
    public final void q() {
        this.T0.K();
    }

    @Override // xg4
    public final void r(r47 r47Var) {
        this.M0.presentFragment(N(this.K0, r47Var));
        S(false);
    }

    public void setBlurredBackgroundDrawableFactory(ll0 ll0Var) {
        this.a1 = ll0Var;
    }

    public void setFilteredSearchViewDelegate(og4 og4Var) {
        this.O0 = og4Var;
    }

    public void setKeyboardHeight(int i) {
        this.Q0 = i;
        boolean z = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof yg4) {
                ((yg4) getChildAt(i2)).c.b(i, z);
            } else if (getChildAt(i2) == this.a0) {
                this.c0.b(i, z);
                this.P0.c.b(i, z);
            } else if (getChildAt(i2) instanceof aw9) {
                ((aw9) getChildAt(i2)).a.b(i, z);
            } else if (getChildAt(i2) == this.i0) {
                this.j0.b(i, z);
            }
        }
    }

    @Override // vic
    public void setPosition(int i) {
        if (i < 0) {
            return;
        }
        super.setPosition(i);
        this.h.clear();
        lic licVar = this.N;
        if (licVar != null) {
            licVar.g(1.0f, i);
        }
        invalidate();
    }

    @Override // vic
    public final void t(View view, View view2, int i, int i2) {
        gx9 gx9Var = this.e0;
        yg4 yg4Var = this.P0;
        if (i == 0) {
            if (yg4Var.getVisibility() == 0) {
                yg4Var.i(this.O0, false);
                gx9Var.B0 = null;
            } else {
                yg4Var.i(null, false);
                og4 og4Var = this.O0;
                gx9Var.B0 = og4Var;
                if (og4Var != null) {
                    ((xg3) og4Var).i(false, null, gx9Var.z0, gx9Var.A0);
                }
            }
        } else if (view instanceof yg4) {
            ((yg4) view).i(this.O0, i2 == 0 && yg4Var.getVisibility() != 0);
        }
        if (view2 instanceof yg4) {
            ((yg4) view2).i(null, false);
        } else {
            gx9Var.B0 = null;
            yg4Var.i(null, false);
        }
    }

    @Override // xg4
    public final boolean u() {
        return this.B0;
    }
}
