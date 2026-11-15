package jg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import hi.p5;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.bb;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.qd;
import org.telegram.messenger.rd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.ja0;
import org.telegram.ui.la0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class r0 extends c {
    public int E;
    public p6 F;
    public Location G;
    public Location H;
    public String I;
    public String J;
    public Location K;
    public final int L;
    public final long M;
    public int N;
    public gj O;
    public TLRPC.TL_channelLocation P;
    public ArrayList Q;
    public boolean R;
    public final boolean S;
    public final e6 T;
    public boolean U;
    public TLRPC.TL_messageMediaVenue V;
    public TLRPC.TL_messageMediaVenue W;
    public boolean X;
    public final boolean Y;
    public ja0 Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public FrameLayout d0;
    public final int x;
    public final Context y;

    public r0(Context context, int i7, long j3, boolean z10, e6 e6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.x = m10.t0;
        this.N = -1;
        this.Q = new ArrayList();
        this.U = true;
        this.b0 = false;
        this.c0 = false;
        this.Y = z12;
        this.y = context;
        this.L = i7;
        this.M = j3;
        this.S = z10;
        this.T = e6Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        if (i7 == 6) {
            if (rd.f(this.x).h(this.M) == null && this.G == null) {
                return false;
            }
        } else if (i7 != 1 && i7 != 8 && i7 != 12 && i7 != 7) {
            return false;
        }
        return true;
    }

    public final void H() {
        int i7 = this.L;
        if (i7 == 8) {
            Location location = this.H;
            if (location == null && (location = this.G) == null) {
                return;
            }
            this.R = true;
            Q();
            rd.d(location, this.e ? 1 : 0, this);
            return;
        }
        if (i7 != 4) {
            Location location2 = this.H;
            if (location2 != null) {
                Location location3 = this.K;
                if (location3 == null || location3.distanceTo(location2) > 20.0f) {
                    this.J = null;
                }
                this.R = true;
                Q();
                rd.d(location2, this.d ? 2 : 0, this);
                return;
            }
            return;
        }
        Location location4 = this.H;
        if (location4 == null && (location4 = this.G) == null) {
            return;
        }
        Location location5 = this.K;
        if (location5 == null || location5.distanceTo(location4) > 100.0f) {
            this.J = null;
        }
        this.R = true;
        Q();
        rd.d(location4, 0, this);
    }

    public final Object I(int i7) {
        int i10 = this.L;
        if (i10 != 4) {
            gj gjVar = this.O;
            if (gjVar == null) {
                int i11 = 2;
                if (i10 == 2) {
                    qd h = rd.f(this.x).h(this.M);
                    if (h != null && h.d != Integer.MAX_VALUE) {
                        i11 = 3;
                    }
                    if (i7 >= i11) {
                        return this.Q.get(i7 - i11);
                    }
                }
            } else {
                if (i7 == 1) {
                    return gjVar;
                }
                if (i7 > 4 && i7 < this.Q.size() + 5) {
                    return this.Q.get(i7 - 5);
                }
            }
            return null;
        }
        if (this.J == null) {
            return null;
        }
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
        tL_messageMediaVenue.address = this.J;
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaVenue.geo = tL_geoPoint;
        Location location = this.H;
        if (location != null) {
            tL_geoPoint.lat = location.getLatitude();
            tL_messageMediaVenue.geo._long = this.H.getLongitude();
            return tL_messageMediaVenue;
        }
        Location location2 = this.G;
        if (location2 != null) {
            tL_geoPoint.lat = location2.getLatitude();
            tL_messageMediaVenue.geo._long = this.G.getLongitude();
        }
        return tL_messageMediaVenue;
    }

    public final void K(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        this.R = false;
        this.K = location;
        int i7 = this.L;
        if (i7 == 8) {
            this.J = str2;
        } else {
            this.J = str;
        }
        if (i7 == 7 && this.c0) {
            this.V = null;
            this.W = null;
        }
        boolean z10 = this.W != null;
        if (i7 != 7) {
            Q();
            return;
        }
        this.V = tL_messageMediaVenue;
        this.W = tL_messageMediaVenue2;
        if (z10 != (tL_messageMediaVenue2 == null)) {
            k(1, 2);
            return;
        }
        g(1);
        if (this.W == null) {
            s(2);
        } else {
            i(2);
        }
    }

    public final void L(Location location) {
        this.H = location;
        H();
        Q();
    }

    public final void M(Location location) {
        int i7;
        boolean z10 = this.G == null;
        this.G = location;
        if (this.H == null) {
            H();
        }
        if (z10 && (i7 = this.N) > 0) {
            g(i7);
        }
        if (this.O != null) {
            h(1, new Object());
            if (this.Q.isEmpty()) {
                return;
            }
            n(2, this.Q.size(), new Object());
            return;
        }
        if (this.L != 2) {
            Q();
        } else {
            if (this.Q.isEmpty()) {
                return;
            }
            n(2, this.Q.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.Q = new ArrayList(arrayList);
        long e10 = m10.i(this.x).e();
        for (int i7 = 0; i7 < this.Q.size(); i7++) {
            if (((la0) this.Q.get(i7)).a == e10 || ((la0) this.Q.get(i7)).b.out) {
                this.Q.remove(i7);
                break;
            }
        }
        f();
    }

    public final void O(boolean z10, boolean z11) {
        if (this.b0 == z10 && this.c0 == z11) {
            return;
        }
        this.b0 = z10;
        this.c0 = z11;
        if (z11) {
            this.V = null;
            this.W = null;
        }
        f();
    }

    public final void P(int i7) {
        this.E = i7;
        FrameLayout frameLayout = this.d0;
        if (frameLayout != null) {
            v4.p0 p0Var = (v4.p0) frameLayout.getLayoutParams();
            if (p0Var == null) {
                p0Var = new v4.p0(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) p0Var).height = this.E;
            }
            this.d0.setLayoutParams(p0Var);
            this.d0.forceLayout();
        }
    }

    public final void Q() {
        R(this.F);
    }

    public final void R(p6 p6Var) {
        String str;
        if (p6Var != null) {
            int i7 = this.L;
            if (i7 == 8) {
                p6Var.b(hd.M0(2131745511, null), !TextUtils.isEmpty(this.I) ? this.I : !TextUtils.isEmpty(this.J) ? this.J : this.R ? hd.M0(2131748779, null) : hd.M0(2131743877, null));
                p6Var.setHasLocation(true);
                return;
            }
            str = "";
            if (i7 != 4 && this.H == null) {
                if (this.G != null) {
                    p6Var.b(hd.M0(2131745611, null), hd.a0(null, null, 2131754693, hd.G((int) this.G.getAccuracy(), "Meters", new Object[0])));
                    p6Var.setHasLocation(true);
                    return;
                } else {
                    p6Var.b(hd.M0(2131745611, null), this.b0 ? "" : hd.M0(2131748779, null));
                    p6Var.setHasLocation(!this.b0);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.I)) {
                str = this.I;
            } else if (TextUtils.isEmpty(this.J)) {
                Location location = this.H;
                if ((location == null && this.G == null) || this.R) {
                    str = hd.M0(2131748779, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.H.getLongitude()));
                } else {
                    Location location2 = this.G;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.G.getLongitude()));
                    } else if (!this.b0) {
                        str = hd.M0(2131748779, null);
                    }
                }
            } else {
                str = this.J;
            }
            if (this.X) {
                p6Var.b(hd.M0(2131753937, null), str);
            } else if (i7 == 4) {
                p6Var.b(hd.M0(2131752211, null), str);
            } else {
                p6Var.b(hd.M0(2131745590, null), str);
            }
            p6Var.setHasLocation(true);
        }
    }

    @Override // v4.h0
    public final int b() {
        int i7 = this.L;
        if (i7 != 6 && i7 != 5 && i7 != 4 && !this.e) {
            boolean z10 = this.S;
            if (i7 == 7) {
                r2 = (this.W != null ? 1 : 0) + 2 + (z10 ? 1 : 0);
            } else if (this.O != null) {
                if (!this.Q.isEmpty()) {
                    r5 = this.Q.size() + 3;
                } else if (!this.Y) {
                    r5 = 1;
                }
                r2 = 2 + r5;
            } else if (i7 == 2) {
                qd h = rd.f(this.x).h(this.M);
                int size = this.Q.size() + 2;
                if (h != null && h.d != Integer.MAX_VALUE) {
                    r5 = 1;
                }
                r2 = size + r5;
            } else {
                r2 = (i7 == 1 ? 3 : 2) + (z10 ? 1 : 0);
            }
        }
        return (this.Z == null || !this.a0) ? r2 : r2 + 1;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 == b() - 1 && this.Z != null && this.a0) {
            return 13;
        }
        if (i7 == 0) {
            return 0;
        }
        int i10 = this.L;
        if (i10 == 6) {
            return 8;
        }
        if (this.S && i7 == b() - 1) {
            return 11;
        }
        if (i10 == 5) {
            return 8;
        }
        if (i10 != 4) {
            qd h = (i10 == 2 || i10 == 1) ? rd.f(this.x).h(this.M) : null;
            if (this.O != null) {
                if (this.Q.isEmpty()) {
                    return i7 == 2 ? 9 : 8;
                }
                if (i7 == 2) {
                    return 10;
                }
                if (i7 == 3) {
                    return 2;
                }
                if (i7 != 4) {
                    return 8;
                }
                this.N = i7;
                return 6;
            }
            if (i10 == 2) {
                if (i7 != 2 || h == null || h.d == Integer.MAX_VALUE) {
                    if (i7 != 1) {
                        return 8;
                    }
                    if (h == null || h.d != Integer.MAX_VALUE) {
                        this.N = i7;
                        return 6;
                    }
                }
                return 7;
            }
            if (i10 == 1 && i7 == 2) {
                if (h != null) {
                    this.N = -1;
                    return 7;
                }
                this.N = i7;
                return 6;
            }
            if (i10 == 7) {
                return 12;
            }
        }
        return 1;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 == 0) {
            v4.p0 p0Var = (v4.p0) view.getLayoutParams();
            if (p0Var == null) {
                p0Var = new v4.p0(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) p0Var).height = this.E;
            }
            view.setLayoutParams(p0Var);
            return;
        }
        if (i10 == 1) {
            p6 p6Var = (p6) view;
            p6 p6Var2 = this.F;
            if (p6Var2 == null || !p6Var2.isAttachedToWindow()) {
                this.F = p6Var;
            }
            R(p6Var);
            return;
        }
        if (i10 == 2) {
            ((n4) view).setText(hd.M0(2131748837, null));
            return;
        }
        if (i10 == 6) {
            p6 p6Var3 = (p6) view;
            p6Var3.setHasLocation(this.G != null);
            int i11 = i7 + 1;
            p6Var3.y = i11 < b() && d(i11) == 7;
            p6Var3.invalidate();
            return;
        }
        if (i10 == 7) {
            ((p6) view).setHasLocation(this.G != null);
            return;
        }
        if (i10 != 8) {
            if (i10 != 12) {
                return;
            }
            v4 v4Var = (v4) view;
            if (this.c0) {
                v4Var.a(null, 2, i7 == 1 && this.W != null, false);
                return;
            } else if (i7 == 1) {
                v4Var.a(this.V, 2, this.W != null, this.U);
                return;
            } else {
                v4Var.a(this.W, 2, false, this.U);
                return;
            }
        }
        q7 q7Var = (q7) view;
        if (this.L == 6) {
            q7Var.b(this.O, this.G, this.b0);
            return;
        }
        TLRPC.TL_channelLocation tL_channelLocation = this.P;
        long j3 = this.M;
        if (tL_channelLocation != null) {
            TextView textView = q7Var.f;
            Location location = q7Var.y;
            i9 i9Var = q7Var.c;
            q7Var.F = m10.t0;
            String str = tL_channelLocation.address;
            q7Var.n = null;
            String str2 = "";
            if (m5.E(j3)) {
                TLRPC.User a22 = np.s1(q7Var.F).a2(Long.valueOf(j3));
                if (a22 != null) {
                    q7Var.n = new t8(0, a22);
                    str2 = q10.p(a22);
                    i9Var.f(a22, q7Var.n);
                }
            } else {
                TLRPC.Chat M0 = np.s1(q7Var.F).M0(Long.valueOf(-j3));
                if (M0 != null) {
                    t8 t8Var = new t8(M0);
                    q7Var.n = t8Var;
                    str2 = M0.title;
                    i9Var.f(M0, t8Var);
                }
            }
            q7Var.d.l(str2, false);
            location.setLatitude(tL_channelLocation.geo_point.lat);
            location.setLongitude(tL_channelLocation.geo_point._long);
            q7Var.h = true;
            textView.setSingleLine(true);
            textView.setText(str);
            return;
        }
        gj gjVar = this.O;
        if (gjVar != null && i7 == 1) {
            q7Var.b(gjVar, this.G, this.b0);
            return;
        }
        int i12 = i7 - (gjVar != null ? 5 : 2);
        qd h = rd.f(this.x).h(j3);
        if (h != null && h.d != Integer.MAX_VALUE) {
            i12--;
        }
        if (i12 < 0 || i12 >= this.Q.size()) {
            return;
        }
        la0 la0Var = (la0) this.Q.get(i12);
        Location location2 = this.G;
        TextView textView2 = q7Var.f;
        i9 i9Var2 = q7Var.c;
        j5 j5Var = q7Var.d;
        Location location3 = q7Var.y;
        q7Var.x = la0Var;
        if (m5.E(la0Var.a)) {
            TLRPC.User a23 = np.s1(q7Var.F).a2(Long.valueOf(la0Var.a));
            if (a23 != null) {
                q7Var.n.r(a23);
                j5Var.l(g5.m(0, a23.first_name, a23.last_name), false);
                i9Var2.f(a23, q7Var.n);
            }
        } else {
            TLRPC.Chat M02 = np.s1(q7Var.F).M0(Long.valueOf(-la0Var.a));
            if (M02 != null) {
                q7Var.n.q(M02);
                j5Var.l(M02.title, false);
                i9Var2.f(M02, q7Var.n);
            }
        }
        bb a10 = la0Var.e.a();
        location3.setLatitude(a10.a);
        location3.setLongitude(a10.b);
        int i13 = la0Var.b.edit_date;
        String D = hd.D(i13 != 0 ? i13 : r11.date);
        if (location2 == null) {
            textView2.setText(D);
            return;
        }
        textView2.setText(D + " - " + hd.y(location3.distanceTo(location2), 0, null));
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        Context context = this.y;
        if (i7 != 0) {
            e6 e6Var = this.T;
            if (i7 == 1) {
                view2 = new p6(context, e6Var, false, false);
            } else if (i7 != 2) {
                int i10 = 4;
                long j3 = this.M;
                switch (i7) {
                    case 6:
                        p6 p6Var = new p6(context, e6Var, true, false);
                        p6Var.setDialogId(j3);
                        view2 = p6Var;
                        break;
                    case 7:
                        p6 p6Var2 = new p6(context, e6Var, true, true);
                        p6Var2.setDialogId(j3);
                        view2 = p6Var2;
                        break;
                    case 8:
                        int i11 = this.L;
                        view2 = new q7((i11 == 4 || i11 == 5 || i11 == 3) ? 16 : 54, context, e6Var, true);
                        break;
                    case 9:
                        w4 w4Var = new w4(context, e6Var);
                        w4Var.setOnButtonClick(new p5(this, i10));
                        view2 = w4Var;
                        break;
                    case 10:
                        View x6Var = new x6(context, (org.telegram.ui.Cells.y0) null);
                        new fq(new ColorDrawable(j6.w0(j6.a7, e6Var)), j6.Y0(context, R.drawable.greydivider_bottom, j6.b7)).x = true;
                        view2 = x6Var;
                        break;
                    case 11:
                        View view3 = new View(context);
                        view3.setTag(-33024);
                        view = view3;
                        break;
                    case 12:
                        v4 v4Var = new v4(context, e6Var);
                        v4Var.setAllowTextAnimation(true);
                        view2 = v4Var;
                        break;
                    case 13:
                        view2 = this.Z;
                        break;
                    default:
                        view2 = new View(context);
                        break;
                }
            } else {
                view2 = new n4(context, e6Var);
            }
            return new cj0(view2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.d0 = frameLayout;
        frameLayout.setTag(-33024);
        this.d0.setLayoutParams(new v4.p0(-1, this.E));
        view = frameLayout;
        view2 = view;
        return new cj0(view2);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        if (e1Var.f == 1) {
            this.F = (p6) e1Var.a;
            Q();
        }
    }

    public void J() {
    }
}
