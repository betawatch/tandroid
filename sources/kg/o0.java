package kg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.kd;
import org.telegram.messenger.l10;
import org.telegram.messenger.ld;
import org.telegram.messenger.m5;
import org.telegram.messenger.va;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.fa0;
import org.telegram.ui.ha0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class o0 extends c {
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
    public zi O;
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
    public fa0 Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public FrameLayout d0;
    public final int x;
    public final Context y;

    public o0(Context context, int i3, long j10, boolean z10, e6 e6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.x = h10.t0;
        this.N = -1;
        this.Q = new ArrayList();
        this.U = true;
        this.b0 = false;
        this.c0 = false;
        this.Y = z12;
        this.y = context;
        this.L = i3;
        this.M = j10;
        this.S = z10;
        this.T = e6Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        if (i3 == 6) {
            if (ld.f(this.x).h(this.M) == null && this.G == null) {
                return false;
            }
        } else if (i3 != 1 && i3 != 8 && i3 != 12 && i3 != 7) {
            return false;
        }
        return true;
    }

    public final void H() {
        int i3 = this.L;
        if (i3 == 8) {
            Location location = this.H;
            if (location == null && (location = this.G) == null) {
                return;
            }
            this.R = true;
            Q();
            ld.d(location, this.e ? 1 : 0, this);
            return;
        }
        if (i3 != 4) {
            Location location2 = this.H;
            if (location2 != null) {
                Location location3 = this.K;
                if (location3 == null || location3.distanceTo(location2) > 20.0f) {
                    this.J = null;
                }
                this.R = true;
                Q();
                ld.d(location2, this.d ? 2 : 0, this);
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
        ld.d(location4, 0, this);
    }

    public final Object I(int i3) {
        int i10 = this.L;
        if (i10 != 4) {
            zi ziVar = this.O;
            if (ziVar == null) {
                int i11 = 2;
                if (i10 == 2) {
                    kd h = ld.f(this.x).h(this.M);
                    if (h != null && h.d != Integer.MAX_VALUE) {
                        i11 = 3;
                    }
                    if (i3 >= i11) {
                        return this.Q.get(i3 - i11);
                    }
                }
            } else {
                if (i3 == 1) {
                    return ziVar;
                }
                if (i3 > 4 && i3 < this.Q.size() + 5) {
                    return this.Q.get(i3 - 5);
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
        int i3 = this.L;
        if (i3 == 8) {
            this.J = str2;
        } else {
            this.J = str;
        }
        if (i3 == 7 && this.c0) {
            this.V = null;
            this.W = null;
        }
        boolean z10 = this.W != null;
        if (i3 != 7) {
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
        int i3;
        boolean z10 = this.G == null;
        this.G = location;
        if (this.H == null) {
            H();
        }
        if (z10 && (i3 = this.N) > 0) {
            g(i3);
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
        long e10 = h10.i(this.x).e();
        for (int i3 = 0; i3 < this.Q.size(); i3++) {
            if (((ha0) this.Q.get(i3)).a == e10 || ((ha0) this.Q.get(i3)).b.out) {
                this.Q.remove(i3);
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

    public final void P(int i3) {
        this.E = i3;
        FrameLayout frameLayout = this.d0;
        if (frameLayout != null) {
            u4.p0 p0Var = (u4.p0) frameLayout.getLayoutParams();
            if (p0Var == null) {
                p0Var = new u4.p0(-1, this.E);
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
            int i3 = this.L;
            if (i3 == 8) {
                p6Var.b(bd.M0(2131745521, null), !TextUtils.isEmpty(this.I) ? this.I : !TextUtils.isEmpty(this.J) ? this.J : this.R ? bd.M0(2131748787, null) : bd.M0(2131743887, null));
                p6Var.setHasLocation(true);
                return;
            }
            str = "";
            if (i3 != 4 && this.H == null) {
                if (this.G != null) {
                    p6Var.b(bd.M0(2131745621, null), bd.a0(null, null, 2131754693, bd.G((int) this.G.getAccuracy(), "Meters", new Object[0])));
                    p6Var.setHasLocation(true);
                    return;
                } else {
                    p6Var.b(bd.M0(2131745621, null), this.b0 ? "" : bd.M0(2131748787, null));
                    p6Var.setHasLocation(!this.b0);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.I)) {
                str = this.I;
            } else if (TextUtils.isEmpty(this.J)) {
                Location location = this.H;
                if ((location == null && this.G == null) || this.R) {
                    str = bd.M0(2131748787, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.H.getLongitude()));
                } else {
                    Location location2 = this.G;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.G.getLongitude()));
                    } else if (!this.b0) {
                        str = bd.M0(2131748787, null);
                    }
                }
            } else {
                str = this.J;
            }
            if (this.X) {
                p6Var.b(bd.M0(2131753937, null), str);
            } else if (i3 == 4) {
                p6Var.b(bd.M0(2131752211, null), str);
            } else {
                p6Var.b(bd.M0(2131745600, null), str);
            }
            p6Var.setHasLocation(true);
        }
    }

    @Override // u4.h0
    public final int b() {
        int i3 = this.L;
        if (i3 != 6 && i3 != 5 && i3 != 4 && !this.e) {
            boolean z10 = this.S;
            if (i3 == 7) {
                r2 = (this.W != null ? 1 : 0) + 2 + (z10 ? 1 : 0);
            } else if (this.O != null) {
                if (!this.Q.isEmpty()) {
                    r5 = this.Q.size() + 3;
                } else if (!this.Y) {
                    r5 = 1;
                }
                r2 = 2 + r5;
            } else if (i3 == 2) {
                kd h = ld.f(this.x).h(this.M);
                int size = this.Q.size() + 2;
                if (h != null && h.d != Integer.MAX_VALUE) {
                    r5 = 1;
                }
                r2 = size + r5;
            } else {
                r2 = (i3 == 1 ? 3 : 2) + (z10 ? 1 : 0);
            }
        }
        return (this.Z == null || !this.a0) ? r2 : r2 + 1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == b() - 1 && this.Z != null && this.a0) {
            return 13;
        }
        if (i3 == 0) {
            return 0;
        }
        int i10 = this.L;
        if (i10 == 6) {
            return 8;
        }
        if (this.S && i3 == b() - 1) {
            return 11;
        }
        if (i10 == 5) {
            return 8;
        }
        if (i10 != 4) {
            kd h = (i10 == 2 || i10 == 1) ? ld.f(this.x).h(this.M) : null;
            if (this.O != null) {
                if (this.Q.isEmpty()) {
                    return i3 == 2 ? 9 : 8;
                }
                if (i3 == 2) {
                    return 10;
                }
                if (i3 == 3) {
                    return 2;
                }
                if (i3 != 4) {
                    return 8;
                }
                this.N = i3;
                return 6;
            }
            if (i10 == 2) {
                if (i3 != 2 || h == null || h.d == Integer.MAX_VALUE) {
                    if (i3 != 1) {
                        return 8;
                    }
                    if (h == null || h.d != Integer.MAX_VALUE) {
                        this.N = i3;
                        return 6;
                    }
                }
                return 7;
            }
            if (i10 == 1 && i3 == 2) {
                if (h != null) {
                    this.N = -1;
                    return 7;
                }
                this.N = i3;
                return 6;
            }
            if (i10 == 7) {
                return 12;
            }
        }
        return 1;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            u4.p0 p0Var = (u4.p0) view.getLayoutParams();
            if (p0Var == null) {
                p0Var = new u4.p0(-1, this.E);
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
            ((n4) view).setText(bd.M0(2131748845, null));
            return;
        }
        if (i10 == 6) {
            p6 p6Var3 = (p6) view;
            p6Var3.setHasLocation(this.G != null);
            int i11 = i3 + 1;
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
                v4Var.a(null, 2, i3 == 1 && this.W != null, false);
                return;
            } else if (i3 == 1) {
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
        long j10 = this.M;
        if (tL_channelLocation != null) {
            TextView textView = q7Var.f;
            Location location = q7Var.y;
            k9 k9Var = q7Var.c;
            q7Var.F = h10.t0;
            String str = tL_channelLocation.address;
            q7Var.n = null;
            String str2 = "";
            if (m5.E(j10)) {
                TLRPC.User a22 = hp.s1(q7Var.F).a2(Long.valueOf(j10));
                if (a22 != null) {
                    q7Var.n = new u8(0, a22);
                    str2 = l10.p(a22);
                    k9Var.e(a22, q7Var.n);
                }
            } else {
                TLRPC.Chat M0 = hp.s1(q7Var.F).M0(Long.valueOf(-j10));
                if (M0 != null) {
                    u8 u8Var = new u8(M0);
                    q7Var.n = u8Var;
                    str2 = M0.title;
                    k9Var.e(M0, u8Var);
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
        zi ziVar = this.O;
        if (ziVar != null && i3 == 1) {
            q7Var.b(ziVar, this.G, this.b0);
            return;
        }
        int i12 = i3 - (ziVar != null ? 5 : 2);
        kd h = ld.f(this.x).h(j10);
        if (h != null && h.d != Integer.MAX_VALUE) {
            i12--;
        }
        if (i12 < 0 || i12 >= this.Q.size()) {
            return;
        }
        ha0 ha0Var = (ha0) this.Q.get(i12);
        Location location2 = this.G;
        TextView textView2 = q7Var.f;
        k9 k9Var2 = q7Var.c;
        k5 k5Var = q7Var.d;
        Location location3 = q7Var.y;
        q7Var.x = ha0Var;
        if (m5.E(ha0Var.a)) {
            TLRPC.User a23 = hp.s1(q7Var.F).a2(Long.valueOf(ha0Var.a));
            if (a23 != null) {
                q7Var.n.r(a23);
                k5Var.l(g5.m(0, a23.first_name, a23.last_name), false);
                k9Var2.e(a23, q7Var.n);
            }
        } else {
            TLRPC.Chat M02 = hp.s1(q7Var.F).M0(Long.valueOf(-ha0Var.a));
            if (M02 != null) {
                q7Var.n.q(M02);
                k5Var.l(M02.title, false);
                k9Var2.e(M02, q7Var.n);
            }
        }
        va a10 = ha0Var.e.a();
        location3.setLatitude(a10.a);
        location3.setLongitude(a10.b);
        int i13 = ha0Var.b.edit_date;
        String D = bd.D(i13 != 0 ? i13 : r11.date);
        if (location2 == null) {
            textView2.setText(D);
            return;
        }
        textView2.setText(D + " - " + bd.y(location3.distanceTo(location2), 0, null));
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        View view2;
        Context context = this.y;
        if (i3 != 0) {
            e6 e6Var = this.T;
            if (i3 == 1) {
                view2 = new p6(context, e6Var, false, false);
            } else if (i3 != 2) {
                long j10 = this.M;
                switch (i3) {
                    case 6:
                        p6 p6Var = new p6(context, e6Var, true, false);
                        p6Var.setDialogId(j10);
                        view2 = p6Var;
                        break;
                    case 7:
                        p6 p6Var2 = new p6(context, e6Var, true, true);
                        p6Var2.setDialogId(j10);
                        view2 = p6Var2;
                        break;
                    case 8:
                        int i10 = this.L;
                        view2 = new q7((i10 == 4 || i10 == 5 || i10 == 3) ? 16 : 54, context, e6Var, true);
                        break;
                    case 9:
                        w4 w4Var = new w4(context, e6Var);
                        w4Var.setOnButtonClick(new ii.m(this, 8));
                        view2 = w4Var;
                        break;
                    case 10:
                        View x6Var = new x6(context, (org.telegram.ui.Cells.f1) null);
                        new xp(new ColorDrawable(k6.w0(k6.a7, e6Var)), k6.Y0(context, R.drawable.greydivider_bottom, k6.b7)).x = true;
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
            return new bj0(view2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.d0 = frameLayout;
        frameLayout.setTag(-33024);
        this.d0.setLayoutParams(new u4.p0(-1, this.E));
        view = frameLayout;
        view2 = view;
        return new bj0(view2);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        if (d1Var.f == 1) {
            this.F = (p6) d1Var.a;
            Q();
        }
    }

    public void J() {
    }
}
