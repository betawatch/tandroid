package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import hi.y7;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y1 extends g2 implements fs {
    public g51 a;
    public LinearLayout b;
    public ai.s1 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void Z(y1 y1Var, n41 n41Var, View view) {
        if (n41Var.d == -1) {
            boolean z10 = y1Var.h;
            y1Var.h = !z10;
            if (!z10) {
                String str = y1Var.f;
                y1Var.n = str;
                ai.s1 s1Var = y1Var.c;
                if (s1Var != null) {
                    s1Var.a(str);
                }
            }
            ((r8) view).setChecked(y1Var.h);
            y1Var.a.g3.O(true);
            return;
        }
        if (view.isEnabled()) {
            z1 b10 = z1.b(y1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i7 = n41Var.d;
            if (i7 >= 0) {
                b10.g();
                if (i7 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(n41Var.d);
                y1Var.h = false;
                String str2 = tL_timezone.id;
                y1Var.n = str2;
                ai.s1 s1Var2 = y1Var.c;
                if (s1Var2 != null) {
                    s1Var2.a(str2);
                }
                if (y1Var.d) {
                    y1Var.simpleActionBar.o(true);
                }
                y1Var.a.g3.O(true);
            }
        }
    }

    public static void a0(y1 y1Var, ArrayList arrayList, b51 b51Var) {
        boolean z10 = y1Var.d && !TextUtils.isEmpty(y1Var.e);
        z1 b10 = z1.b(y1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            b51Var.V();
            String N0 = gd.N0(2131743875, null);
            n41 n41Var = new n41(9);
            n41Var.d = -1;
            n41Var.m = N0;
            n41Var.L(y1Var.h);
            arrayList.add(n41Var);
            b51Var.U();
            arrayList.add(n41.C(gd.a0(null, null, 2131743874, b10.d(y1Var.n, true))));
        }
        b51Var.V();
        if (!z10) {
            i5.c.s(2131743873, null, arrayList);
        }
        boolean z11 = true;
        int i7 = 0;
        while (true) {
            b10.g();
            if (i7 >= arrayList2.size()) {
                break;
            }
            b10.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i7);
            CharSequence e10 = z1.e(tL_timezone, false);
            if (z10) {
                String replace = org.telegram.messenger.g0.M3(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = org.telegram.messenger.g0.M3(y1Var.e).toLowerCase();
                if (i5.c.B(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e10 = org.telegram.messenger.g0.w1(e10, y1Var.e, y1Var.resourceProvider);
                } else {
                    i7++;
                }
            }
            String f10 = z1.f(tL_timezone);
            n41 n41Var2 = new n41(10);
            n41Var2.d = i7;
            n41Var2.m = e10;
            n41Var2.o = f10;
            n41Var2.L(TextUtils.equals(tL_timezone.id, y1Var.n));
            n41Var2.g = !y1Var.h || z10;
            arrayList.add(n41Var2);
            z11 = false;
            i7++;
        }
        b51Var.U();
        if (z11) {
            arrayList.add(n41.m(y1Var.b));
        } else {
            arrayList.add(n41.C(null));
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(gd.N0(2131743871, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 14));
        g5 b10 = this.simpleActionBar.t().b(1, R.drawable.outline_header_search);
        b10.O();
        b10.C0 = new bi.x1(this, 1);
        b10.setSearchFieldHint(gd.N0(2131745640, null));
        FrameLayout frameLayout = new FrameLayout(context);
        g51 g51Var = new g51(this, new y7(this, 15), new f1(this, 2), null);
        this.a = g51Var;
        g51Var.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, na.c(-1.0f, -1));
        this.a.setOnScrollListener(new bi.v1(this, 20));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(org.telegram.messenger.g0.L(500.0f));
        p9 p9Var = new p9(context);
        p9Var.getImageReceiver().A1 = false;
        ri.d0(this.currentAccount).h2(p9Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(p9Var, na.t(ks.O1, ks.O1, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131743872, null));
        u6.U(textView, n6.y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.b.addView(textView, na.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        g51 g51Var;
        b51 b51Var;
        if (i7 != ks.t3 || (g51Var = this.a) == null || (b51Var = g51Var.g3) == null) {
            return;
        }
        b51Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ek0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        String c10 = z1.b(this.currentAccount).c();
        this.f = c10;
        this.h = TextUtils.equals(c10, this.n);
        getNotificationCenter().c(this, ks.t3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.t3);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
