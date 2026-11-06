package jg;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cb;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.rd;
import org.telegram.messenger.sd;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.q6;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.ja0;
import org.telegram.ui.la0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class r0 extends c {
    public int D;
    public q6 E;
    public Location F;
    public Location G;
    public String H;
    public String I;
    public Location J;
    public final int K;
    public final long L;
    public int M;
    public ij N;
    public TLRPC.TL_channelLocation O;
    public ArrayList P;
    public boolean Q;
    public final boolean R;
    public final f6 S;
    public boolean T;
    public TLRPC.TL_messageMediaVenue U;
    public TLRPC.TL_messageMediaVenue V;
    public boolean W;
    public final boolean X;
    public ja0 Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public FrameLayout c0;
    public final int x;
    public final Context y;

    public r0(Context context, int i7, long j3, boolean z9, f6 f6Var, boolean z10, boolean z11, boolean z12) {
        super(z10, z12);
        this.x = p10.s0;
        this.M = -1;
        this.P = new ArrayList();
        this.T = true;
        this.a0 = false;
        this.b0 = false;
        this.X = z11;
        this.y = context;
        this.K = i7;
        this.L = j3;
        this.R = z9;
        this.S = f6Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        if (i7 == 6) {
            if (sd.f(this.x).h(this.L) == null && this.F == null) {
                return false;
            }
        } else if (i7 != 1 && i7 != 8 && i7 != 12 && i7 != 7) {
            return false;
        }
        return true;
    }

    public final void H() {
        int i7 = this.K;
        if (i7 == 8) {
            Location location = this.G;
            if (location == null && (location = this.F) == null) {
                return;
            }
            this.Q = true;
            Q();
            sd.d(location, this.e ? 1 : 0, this);
            return;
        }
        if (i7 != 4) {
            Location location2 = this.G;
            if (location2 != null) {
                Location location3 = this.J;
                if (location3 == null || location3.distanceTo(location2) > 20.0f) {
                    this.I = null;
                }
                this.Q = true;
                Q();
                sd.d(location2, this.d ? 2 : 0, this);
                return;
            }
            return;
        }
        Location location4 = this.G;
        if (location4 == null && (location4 = this.F) == null) {
            return;
        }
        Location location5 = this.J;
        if (location5 == null || location5.distanceTo(location4) > 100.0f) {
            this.I = null;
        }
        this.Q = true;
        Q();
        sd.d(location4, 0, this);
    }

    public final Object I(int i7) {
        int i10 = this.K;
        if (i10 != 4) {
            ij ijVar = this.N;
            if (ijVar == null) {
                int i11 = 2;
                if (i10 == 2) {
                    rd h = sd.f(this.x).h(this.L);
                    if (h != null && h.d != Integer.MAX_VALUE) {
                        i11 = 3;
                    }
                    if (i7 >= i11) {
                        return this.P.get(i7 - i11);
                    }
                }
            } else {
                if (i7 == 1) {
                    return ijVar;
                }
                if (i7 > 4 && i7 < this.P.size() + 5) {
                    return this.P.get(i7 - 5);
                }
            }
            return null;
        }
        if (this.I == null) {
            return null;
        }
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
        tL_messageMediaVenue.address = this.I;
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaVenue.geo = tL_geoPoint;
        Location location = this.G;
        if (location != null) {
            tL_geoPoint.lat = location.getLatitude();
            tL_messageMediaVenue.geo._long = this.G.getLongitude();
            return tL_messageMediaVenue;
        }
        Location location2 = this.F;
        if (location2 != null) {
            tL_geoPoint.lat = location2.getLatitude();
            tL_messageMediaVenue.geo._long = this.F.getLongitude();
        }
        return tL_messageMediaVenue;
    }

    public final void K(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        this.Q = false;
        this.J = location;
        int i7 = this.K;
        if (i7 == 8) {
            this.I = str2;
        } else {
            this.I = str;
        }
        if (i7 == 7 && this.b0) {
            this.U = null;
            this.V = null;
        }
        boolean z9 = this.V != null;
        if (i7 != 7) {
            Q();
            return;
        }
        this.U = tL_messageMediaVenue;
        this.V = tL_messageMediaVenue2;
        if (z9 != (tL_messageMediaVenue2 == null)) {
            k(1, 2);
            return;
        }
        g(1);
        if (this.V == null) {
            s(2);
        } else {
            i(2);
        }
    }

    public final void L(Location location) {
        this.G = location;
        H();
        Q();
    }

    public final void M(Location location) {
        int i7;
        boolean z9 = this.F == null;
        this.F = location;
        if (this.G == null) {
            H();
        }
        if (z9 && (i7 = this.M) > 0) {
            g(i7);
        }
        if (this.N != null) {
            h(1, new Object());
            if (this.P.isEmpty()) {
                return;
            }
            n(2, this.P.size(), new Object());
            return;
        }
        if (this.K != 2) {
            Q();
        } else {
            if (this.P.isEmpty()) {
                return;
            }
            n(2, this.P.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.P = new ArrayList(arrayList);
        long e10 = p10.i(this.x).e();
        for (int i7 = 0; i7 < this.P.size(); i7++) {
            if (((la0) this.P.get(i7)).a == e10 || ((la0) this.P.get(i7)).b.out) {
                this.P.remove(i7);
                break;
            }
        }
        f();
    }

    public final void O(boolean z9, boolean z10) {
        if (this.a0 == z9 && this.b0 == z10) {
            return;
        }
        this.a0 = z9;
        this.b0 = z10;
        if (z10) {
            this.U = null;
            this.V = null;
        }
        f();
    }

    public final void P(int i7) {
        this.D = i7;
        FrameLayout frameLayout = this.c0;
        if (frameLayout != null) {
            v4.o0 o0Var = (v4.o0) frameLayout.getLayoutParams();
            if (o0Var == null) {
                o0Var = new v4.o0(-1, this.D);
            } else {
                ((ViewGroup.MarginLayoutParams) o0Var).height = this.D;
            }
            this.c0.setLayoutParams(o0Var);
            this.c0.forceLayout();
        }
    }

    public final void Q() {
        R(this.E);
    }

    public final void R(q6 q6Var) {
        String str;
        if (q6Var != null) {
            int i7 = this.K;
            if (i7 == 8) {
                q6Var.b(hd.M0(2131745512, null), !TextUtils.isEmpty(this.H) ? this.H : !TextUtils.isEmpty(this.I) ? this.I : this.Q ? hd.M0(2131748778, null) : hd.M0(2131743878, null));
                q6Var.setHasLocation(true);
                return;
            }
            str = "";
            if (i7 != 4 && this.G == null) {
                if (this.F != null) {
                    q6Var.b(hd.M0(2131745612, null), hd.a0(null, null, 2131754693, hd.G((int) this.F.getAccuracy(), "Meters", new Object[0])));
                    q6Var.setHasLocation(true);
                    return;
                } else {
                    q6Var.b(hd.M0(2131745612, null), this.a0 ? "" : hd.M0(2131748778, null));
                    q6Var.setHasLocation(!this.a0);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.H)) {
                str = this.H;
            } else if (TextUtils.isEmpty(this.I)) {
                Location location = this.G;
                if ((location == null && this.F == null) || this.Q) {
                    str = hd.M0(2131748778, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.G.getLongitude()));
                } else {
                    Location location2 = this.F;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.F.getLongitude()));
                    } else if (!this.a0) {
                        str = hd.M0(2131748778, null);
                    }
                }
            } else {
                str = this.I;
            }
            if (this.W) {
                q6Var.b(hd.M0(2131753937, null), str);
            } else if (i7 == 4) {
                q6Var.b(hd.M0(2131752211, null), str);
            } else {
                q6Var.b(hd.M0(2131745591, null), str);
            }
            q6Var.setHasLocation(true);
        }
    }

    @Override // v4.g0
    public final int b() {
        int i7 = this.K;
        if (i7 != 6 && i7 != 5 && i7 != 4 && !this.e) {
            boolean z9 = this.R;
            if (i7 == 7) {
                r2 = (this.V != null ? 1 : 0) + 2 + (z9 ? 1 : 0);
            } else if (this.N != null) {
                if (!this.P.isEmpty()) {
                    r5 = this.P.size() + 3;
                } else if (!this.X) {
                    r5 = 1;
                }
                r2 = 2 + r5;
            } else if (i7 == 2) {
                rd h = sd.f(this.x).h(this.L);
                int size = this.P.size() + 2;
                if (h != null && h.d != Integer.MAX_VALUE) {
                    r5 = 1;
                }
                r2 = size + r5;
            } else {
                r2 = (i7 == 1 ? 3 : 2) + (z9 ? 1 : 0);
            }
        }
        return (this.Y == null || !this.Z) ? r2 : r2 + 1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == b() - 1 && this.Y != null && this.Z) {
            return 13;
        }
        if (i7 == 0) {
            return 0;
        }
        int i10 = this.K;
        if (i10 == 6) {
            return 8;
        }
        if (this.R && i7 == b() - 1) {
            return 11;
        }
        if (i10 == 5) {
            return 8;
        }
        if (i10 != 4) {
            rd h = (i10 == 2 || i10 == 1) ? sd.f(this.x).h(this.L) : null;
            if (this.N != null) {
                if (this.P.isEmpty()) {
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
                this.M = i7;
                return 6;
            }
            if (i10 == 2) {
                if (i7 != 2 || h == null || h.d == Integer.MAX_VALUE) {
                    if (i7 != 1) {
                        return 8;
                    }
                    if (h == null || h.d != Integer.MAX_VALUE) {
                        this.M = i7;
                        return 6;
                    }
                }
                return 7;
            }
            if (i10 == 1 && i7 == 2) {
                if (h != null) {
                    this.M = -1;
                    return 7;
                }
                this.M = i7;
                return 6;
            }
            if (i10 == 7) {
                return 12;
            }
        }
        return 1;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            v4.o0 o0Var = (v4.o0) view.getLayoutParams();
            if (o0Var == null) {
                o0Var = new v4.o0(-1, this.D);
            } else {
                ((ViewGroup.MarginLayoutParams) o0Var).height = this.D;
            }
            view.setLayoutParams(o0Var);
            return;
        }
        if (i10 == 1) {
            q6 q6Var = (q6) view;
            q6 q6Var2 = this.E;
            if (q6Var2 == null || !q6Var2.isAttachedToWindow()) {
                this.E = q6Var;
            }
            R(q6Var);
            return;
        }
        if (i10 == 2) {
            ((n4) view).setText(hd.M0(2131748836, null));
            return;
        }
        if (i10 == 6) {
            q6 q6Var3 = (q6) view;
            q6Var3.setHasLocation(this.F != null);
            int i11 = i7 + 1;
            q6Var3.y = i11 < b() && d(i11) == 7;
            q6Var3.invalidate();
            return;
        }
        if (i10 == 7) {
            ((q6) view).setHasLocation(this.F != null);
            return;
        }
        if (i10 != 8) {
            if (i10 != 12) {
                return;
            }
            v4 v4Var = (v4) view;
            if (this.b0) {
                v4Var.a(null, 2, i7 == 1 && this.V != null, false);
                return;
            } else if (i7 == 1) {
                v4Var.a(this.U, 2, this.V != null, this.T);
                return;
            } else {
                v4Var.a(this.V, 2, false, this.T);
                return;
            }
        }
        r7 r7Var = (r7) view;
        if (this.K == 6) {
            r7Var.b(this.N, this.F, this.a0);
            return;
        }
        TLRPC.TL_channelLocation tL_channelLocation = this.O;
        long j3 = this.L;
        if (tL_channelLocation != null) {
            TextView textView = r7Var.f;
            Location location = r7Var.y;
            l9 l9Var = r7Var.c;
            r7Var.E = p10.s0;
            String str = tL_channelLocation.address;
            r7Var.n = null;
            String str2 = "";
            if (m5.E(j3)) {
                TLRPC.User a22 = qp.s1(r7Var.E).a2(Long.valueOf(j3));
                if (a22 != null) {
                    r7Var.n = new w8(0, a22);
                    str2 = t10.p(a22);
                    l9Var.e(a22, r7Var.n);
                }
            } else {
                TLRPC.Chat M0 = qp.s1(r7Var.E).M0(Long.valueOf(-j3));
                if (M0 != null) {
                    w8 w8Var = new w8(M0);
                    r7Var.n = w8Var;
                    str2 = M0.title;
                    l9Var.e(M0, w8Var);
                }
            }
            r7Var.d.l(str2, false);
            location.setLatitude(tL_channelLocation.geo_point.lat);
            location.setLongitude(tL_channelLocation.geo_point._long);
            r7Var.h = true;
            textView.setSingleLine(true);
            textView.setText(str);
            return;
        }
        ij ijVar = this.N;
        if (ijVar != null && i7 == 1) {
            r7Var.b(ijVar, this.F, this.a0);
            return;
        }
        int i12 = i7 - (ijVar != null ? 5 : 2);
        rd h = sd.f(this.x).h(j3);
        if (h != null && h.d != Integer.MAX_VALUE) {
            i12--;
        }
        if (i12 < 0 || i12 >= this.P.size()) {
            return;
        }
        la0 la0Var = (la0) this.P.get(i12);
        Location location2 = this.F;
        TextView textView2 = r7Var.f;
        l9 l9Var2 = r7Var.c;
        k5 k5Var = r7Var.d;
        Location location3 = r7Var.y;
        r7Var.x = la0Var;
        if (m5.E(la0Var.a)) {
            TLRPC.User a23 = qp.s1(r7Var.E).a2(Long.valueOf(la0Var.a));
            if (a23 != null) {
                r7Var.n.r(a23);
                k5Var.l(g5.m(0, a23.first_name, a23.last_name), false);
                l9Var2.e(a23, r7Var.n);
            }
        } else {
            TLRPC.Chat M02 = qp.s1(r7Var.E).M0(Long.valueOf(-la0Var.a));
            if (M02 != null) {
                r7Var.n.q(M02);
                k5Var.l(M02.title, false);
                l9Var2.e(M02, r7Var.n);
            }
        }
        cb a10 = la0Var.e.a();
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

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        Context context = this.y;
        if (i7 != 0) {
            f6 f6Var = this.S;
            if (i7 == 1) {
                view2 = new q6(context, f6Var, false, false);
            } else if (i7 != 2) {
                int i10 = 5;
                long j3 = this.L;
                switch (i7) {
                    case 6:
                        q6 q6Var = new q6(context, f6Var, true, false);
                        q6Var.setDialogId(j3);
                        view2 = q6Var;
                        break;
                    case 7:
                        q6 q6Var2 = new q6(context, f6Var, true, true);
                        q6Var2.setDialogId(j3);
                        view2 = q6Var2;
                        break;
                    case 8:
                        int i11 = this.K;
                        view2 = new r7((i11 == 4 || i11 == 5 || i11 == 3) ? 16 : 54, context, f6Var, true);
                        break;
                    case 9:
                        w4 w4Var = new w4(context, f6Var);
                        w4Var.setOnButtonClick(new ii.g(this, i10));
                        view2 = w4Var;
                        break;
                    case 10:
                        View y6Var = new y6(context, (org.telegram.ui.Cells.f1) null);
                        new xp(new ColorDrawable(k6.w0(k6.a7, f6Var)), k6.Y0(context, R.drawable.greydivider_bottom, k6.b7)).x = true;
                        view2 = y6Var;
                        break;
                    case 11:
                        View view3 = new View(context);
                        view3.setTag(-33024);
                        view = view3;
                        break;
                    case 12:
                        v4 v4Var = new v4(context, f6Var);
                        v4Var.setAllowTextAnimation(true);
                        view2 = v4Var;
                        break;
                    case 13:
                        view2 = this.Y;
                        break;
                    default:
                        view2 = new View(context);
                        break;
                }
            } else {
                view2 = new n4(context, f6Var);
            }
            return new xi0(view2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.c0 = frameLayout;
        frameLayout.setTag(-33024);
        this.c0.setLayoutParams(new v4.o0(-1, this.D));
        view = frameLayout;
        view2 = view;
        return new xi0(view2);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        if (d1Var.f == 1) {
            this.E = (q6) d1Var.a;
            Q();
        }
    }

    public void J() {
    }
}
