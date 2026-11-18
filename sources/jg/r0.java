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
import org.telegram.messenger.ab;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.pd;
import org.telegram.messenger.qd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.x4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.q9;
import org.telegram.ui.ka0;
import org.telegram.ui.ma0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class r0 extends c {
    public int E;
    public r6 F;
    public Location G;
    public Location H;
    public String I;
    public String J;
    public Location K;
    public final int L;
    public final long M;
    public int N;
    public fj O;
    public TLRPC.TL_channelLocation P;
    public ArrayList Q;
    public boolean R;
    public final boolean S;
    public final i6 T;
    public boolean U;
    public TLRPC.TL_messageMediaVenue V;
    public TLRPC.TL_messageMediaVenue W;
    public boolean X;
    public final boolean Y;
    public ka0 Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public FrameLayout d0;
    public final int x;
    public final Context y;

    public r0(Context context, int i7, long j3, boolean z10, i6 i6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.x = j10.t0;
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
        this.T = i6Var;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        if (i7 == 6) {
            if (qd.f(this.x).h(this.M) == null && this.G == null) {
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
            qd.d(location, this.e ? 1 : 0, this);
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
                qd.d(location2, this.d ? 2 : 0, this);
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
        qd.d(location4, 0, this);
    }

    public final Object I(int i7) {
        int i10 = this.L;
        if (i10 != 4) {
            fj fjVar = this.O;
            if (fjVar == null) {
                int i11 = 2;
                if (i10 == 2) {
                    pd h = qd.f(this.x).h(this.M);
                    if (h != null && h.d != Integer.MAX_VALUE) {
                        i11 = 3;
                    }
                    if (i7 >= i11) {
                        return this.Q.get(i7 - i11);
                    }
                }
            } else {
                if (i7 == 1) {
                    return fjVar;
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
        long e10 = j10.i(this.x).e();
        for (int i7 = 0; i7 < this.Q.size(); i7++) {
            if (((ma0) this.Q.get(i7)).a == e10 || ((ma0) this.Q.get(i7)).b.out) {
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
            v4.q0 q0Var = (v4.q0) frameLayout.getLayoutParams();
            if (q0Var == null) {
                q0Var = new v4.q0(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) q0Var).height = this.E;
            }
            this.d0.setLayoutParams(q0Var);
            this.d0.forceLayout();
        }
    }

    public final void Q() {
        R(this.F);
    }

    public final void R(r6 r6Var) {
        String str;
        if (r6Var != null) {
            int i7 = this.L;
            if (i7 == 8) {
                r6Var.b(gd.M0(2131745316, null), !TextUtils.isEmpty(this.I) ? this.I : !TextUtils.isEmpty(this.J) ? this.J : this.R ? gd.M0(2131748587, null) : gd.M0(2131743640, null));
                r6Var.setHasLocation(true);
                return;
            }
            str = "";
            if (i7 != 4 && this.H == null) {
                if (this.G != null) {
                    r6Var.b(gd.M0(2131745416, null), gd.a0(null, null, 2131754693, gd.G((int) this.G.getAccuracy(), "Meters", new Object[0])));
                    r6Var.setHasLocation(true);
                    return;
                } else {
                    r6Var.b(gd.M0(2131745416, null), this.b0 ? "" : gd.M0(2131748587, null));
                    r6Var.setHasLocation(!this.b0);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.I)) {
                str = this.I;
            } else if (TextUtils.isEmpty(this.J)) {
                Location location = this.H;
                if ((location == null && this.G == null) || this.R) {
                    str = gd.M0(2131748587, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.H.getLongitude()));
                } else {
                    Location location2 = this.G;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.G.getLongitude()));
                    } else if (!this.b0) {
                        str = gd.M0(2131748587, null);
                    }
                }
            } else {
                str = this.J;
            }
            if (this.X) {
                r6Var.b(gd.M0(2131753935, null), str);
            } else if (i7 == 4) {
                r6Var.b(gd.M0(2131752200, null), str);
            } else {
                r6Var.b(gd.M0(2131745395, null), str);
            }
            r6Var.setHasLocation(true);
        }
    }

    @Override // v4.i0
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
                pd h = qd.f(this.x).h(this.M);
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

    @Override // v4.i0
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
            pd h = (i10 == 2 || i10 == 1) ? qd.f(this.x).h(this.M) : null;
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

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            v4.q0 q0Var = (v4.q0) view.getLayoutParams();
            if (q0Var == null) {
                q0Var = new v4.q0(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) q0Var).height = this.E;
            }
            view.setLayoutParams(q0Var);
            return;
        }
        if (i10 == 1) {
            r6 r6Var = (r6) view;
            r6 r6Var2 = this.F;
            if (r6Var2 == null || !r6Var2.isAttachedToWindow()) {
                this.F = r6Var;
            }
            R(r6Var);
            return;
        }
        if (i10 == 2) {
            ((o4) view).setText(gd.M0(2131748645, null));
            return;
        }
        if (i10 == 6) {
            r6 r6Var3 = (r6) view;
            r6Var3.setHasLocation(this.G != null);
            int i11 = i7 + 1;
            r6Var3.y = i11 < b() && d(i11) == 7;
            r6Var3.invalidate();
            return;
        }
        if (i10 == 7) {
            ((r6) view).setHasLocation(this.G != null);
            return;
        }
        if (i10 != 8) {
            if (i10 != 12) {
                return;
            }
            w4 w4Var = (w4) view;
            if (this.c0) {
                w4Var.a(null, 2, i7 == 1 && this.W != null, false);
                return;
            } else if (i7 == 1) {
                w4Var.a(this.V, 2, this.W != null, this.U);
                return;
            } else {
                w4Var.a(this.W, 2, false, this.U);
                return;
            }
        }
        s7 s7Var = (s7) view;
        if (this.L == 6) {
            s7Var.b(this.O, this.G, this.b0);
            return;
        }
        TLRPC.TL_channelLocation tL_channelLocation = this.P;
        long j3 = this.M;
        if (tL_channelLocation != null) {
            TextView textView = s7Var.f;
            Location location = s7Var.y;
            q9 q9Var = s7Var.c;
            s7Var.F = j10.t0;
            String str = tL_channelLocation.address;
            s7Var.n = null;
            String str2 = "";
            if (n5.E(j3)) {
                TLRPC.User c22 = mp.u1(s7Var.F).c2(Long.valueOf(j3));
                if (c22 != null) {
                    s7Var.n = new b9(0, c22);
                    str2 = o10.q(c22);
                    q9Var.f(c22, s7Var.n);
                }
            } else {
                TLRPC.Chat O0 = mp.u1(s7Var.F).O0(Long.valueOf(-j3));
                if (O0 != null) {
                    b9 b9Var = new b9(O0);
                    s7Var.n = b9Var;
                    str2 = O0.title;
                    q9Var.f(O0, b9Var);
                }
            }
            s7Var.d.l(str2, false);
            location.setLatitude(tL_channelLocation.geo_point.lat);
            location.setLongitude(tL_channelLocation.geo_point._long);
            s7Var.h = true;
            textView.setSingleLine(true);
            textView.setText(str);
            return;
        }
        fj fjVar = this.O;
        if (fjVar != null && i7 == 1) {
            s7Var.b(fjVar, this.G, this.b0);
            return;
        }
        int i12 = i7 - (fjVar != null ? 5 : 2);
        pd h = qd.f(this.x).h(j3);
        if (h != null && h.d != Integer.MAX_VALUE) {
            i12--;
        }
        if (i12 < 0 || i12 >= this.Q.size()) {
            return;
        }
        ma0 ma0Var = (ma0) this.Q.get(i12);
        Location location2 = this.G;
        TextView textView2 = s7Var.f;
        q9 q9Var2 = s7Var.c;
        org.telegram.ui.ActionBar.n5 n5Var = s7Var.d;
        Location location3 = s7Var.y;
        s7Var.x = ma0Var;
        if (n5.E(ma0Var.a)) {
            TLRPC.User c23 = mp.u1(s7Var.F).c2(Long.valueOf(ma0Var.a));
            if (c23 != null) {
                s7Var.n.r(c23);
                n5Var.l(i5.m(0, c23.first_name, c23.last_name), false);
                q9Var2.f(c23, s7Var.n);
            }
        } else {
            TLRPC.Chat O02 = mp.u1(s7Var.F).O0(Long.valueOf(-ma0Var.a));
            if (O02 != null) {
                s7Var.n.q(O02);
                n5Var.l(O02.title, false);
                q9Var2.f(O02, s7Var.n);
            }
        }
        ab a10 = ma0Var.e.a();
        location3.setLatitude(a10.a);
        location3.setLongitude(a10.b);
        int i13 = ma0Var.b.edit_date;
        String D = gd.D(i13 != 0 ? i13 : r11.date);
        if (location2 == null) {
            textView2.setText(D);
            return;
        }
        textView2.setText(D + " - " + gd.y(location3.distanceTo(location2), 0, null));
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        Context context = this.y;
        if (i7 != 0) {
            i6 i6Var = this.T;
            if (i7 == 1) {
                view2 = new r6(context, i6Var, false, false);
            } else if (i7 != 2) {
                long j3 = this.M;
                switch (i7) {
                    case 6:
                        r6 r6Var = new r6(context, i6Var, true, false);
                        r6Var.setDialogId(j3);
                        view2 = r6Var;
                        break;
                    case 7:
                        r6 r6Var2 = new r6(context, i6Var, true, true);
                        r6Var2.setDialogId(j3);
                        view2 = r6Var2;
                        break;
                    case 8:
                        int i10 = this.L;
                        view2 = new s7((i10 == 4 || i10 == 5 || i10 == 3) ? 16 : 54, context, i6Var, true);
                        break;
                    case 9:
                        x4 x4Var = new x4(context, i6Var);
                        x4Var.setOnButtonClick(new hi.o0(this, 6));
                        view2 = x4Var;
                        break;
                    case 10:
                        View z6Var = new z6(context, (org.telegram.ui.Cells.c0) null);
                        new mq(new ColorDrawable(n6.w0(n6.a7, i6Var)), n6.Y0(context, R.drawable.greydivider_bottom, n6.b7)).x = true;
                        view2 = z6Var;
                        break;
                    case 11:
                        View view3 = new View(context);
                        view3.setTag(-33024);
                        view = view3;
                        break;
                    case 12:
                        w4 w4Var = new w4(context, i6Var);
                        w4Var.setAllowTextAnimation(true);
                        view2 = w4Var;
                        break;
                    case 13:
                        view2 = this.Z;
                        break;
                    default:
                        view2 = new View(context);
                        break;
                }
            } else {
                view2 = new o4(context, i6Var);
            }
            return new kj0(view2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.d0 = frameLayout;
        frameLayout.setTag(-33024);
        this.d0.setLayoutParams(new v4.q0(-1, this.E));
        view = frameLayout;
        view2 = view;
        return new kj0(view2);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        if (f1Var.f == 1) {
            this.F = (r6) f1Var.a;
            Q();
        }
    }

    public void J() {
    }
}
