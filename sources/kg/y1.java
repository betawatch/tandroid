package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.x4;
import bi.z4;
import c8.ja;
import di.z6;
import hi.q4;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y1 extends e2 implements is {
    public u41 a;
    public LinearLayout b;
    public ai.v1 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void Z(y1 y1Var, b41 b41Var, View view) {
        if (b41Var.d == -1) {
            boolean z10 = y1Var.h;
            y1Var.h = !z10;
            if (!z10) {
                String str = y1Var.f;
                y1Var.n = str;
                ai.v1 v1Var = y1Var.c;
                if (v1Var != null) {
                    v1Var.a(str);
                }
            }
            ((q8) view).setChecked(y1Var.h);
            y1Var.a.g3.O(true);
            return;
        }
        if (view.isEnabled()) {
            z1 b10 = z1.b(y1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i7 = b41Var.d;
            if (i7 >= 0) {
                b10.g();
                if (i7 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(b41Var.d);
                y1Var.h = false;
                String str2 = tL_timezone.id;
                y1Var.n = str2;
                ai.v1 v1Var2 = y1Var.c;
                if (v1Var2 != null) {
                    v1Var2.a(str2);
                }
                if (y1Var.d) {
                    y1Var.simpleActionBar.m(true);
                }
                y1Var.a.g3.O(true);
            }
        }
    }

    public static void a0(y1 y1Var, ArrayList arrayList, p41 p41Var) {
        boolean z10 = y1Var.d && !TextUtils.isEmpty(y1Var.e);
        z1 b10 = z1.b(y1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            p41Var.V();
            String M0 = hd.M0(2131744120, null);
            b41 b41Var = new b41(9);
            b41Var.d = -1;
            b41Var.l = M0;
            b41Var.L(y1Var.h);
            arrayList.add(b41Var);
            p41Var.U();
            arrayList.add(b41.C(hd.a0(null, null, 2131744119, b10.d(y1Var.n, true))));
        }
        p41Var.V();
        if (!z10) {
            arrayList.add(b41.u(hd.M0(2131744118, null)));
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
                String replace = org.telegram.messenger.g0.N3(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = org.telegram.messenger.g0.N3(y1Var.e).toLowerCase();
                if (i5.c.A(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e10 = org.telegram.messenger.g0.w1(e10, y1Var.e, y1Var.resourceProvider);
                } else {
                    i7++;
                }
            }
            String f10 = z1.f(tL_timezone);
            b41 b41Var2 = new b41(10);
            b41Var2.d = i7;
            b41Var2.l = e10;
            b41Var2.n = f10;
            b41Var2.L(TextUtils.equals(tL_timezone.id, y1Var.n));
            b41Var2.g = !y1Var.h || z10;
            arrayList.add(b41Var2);
            z11 = false;
            i7++;
        }
        p41Var.U();
        if (z11) {
            arrayList.add(b41.m(y1Var.b));
        } else {
            arrayList.add(b41.C(null));
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(hd.M0(2131744116, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 12));
        d5 b10 = this.simpleActionBar.r().b(1, R.drawable.outline_header_search);
        b10.O();
        b10.C0 = new x1(this, 0);
        b10.setSearchFieldHint(hd.M0(2131745836, null));
        FrameLayout frameLayout = new FrameLayout(context);
        u41 u41Var = new u41(this, new q4(this, 15), new z6(this, 28), null);
        this.a = u41Var;
        u41Var.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, ja.c(-1.0f, -1));
        this.a.setOnScrollListener(new z4(this, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(org.telegram.messenger.g0.L(500.0f));
        i9 i9Var = new i9(context);
        i9Var.getImageReceiver().A1 = false;
        si.b0(this.currentAccount).c2(i9Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(i9Var, ja.t(ns.O1, ns.O1, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131744117, null));
        q6.U(textView, j6.y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.b.addView(textView, ja.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        u41 u41Var;
        p41 p41Var;
        if (i7 != ns.r3 || (u41Var = this.a) == null || (p41Var = u41Var.g3) == null) {
            return;
        }
        p41Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final uj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        String c10 = z1.b(this.currentAccount).c();
        this.f = c10;
        this.h = TextUtils.equals(c10, this.n);
        getNotificationCenter().c(this, ns.r3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ns.r3);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
