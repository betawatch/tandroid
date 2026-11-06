package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import di.q4;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class w1 extends f2 implements ls {
    public k41 a;
    public LinearLayout b;
    public ai.f1 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void Z(w1 w1Var, r31 r31Var, View view) {
        if (r31Var.d == -1) {
            boolean z9 = w1Var.h;
            w1Var.h = !z9;
            if (!z9) {
                String str = w1Var.f;
                w1Var.n = str;
                ai.f1 f1Var = w1Var.c;
                if (f1Var != null) {
                    f1Var.a(str);
                }
            }
            ((r8) view).setChecked(w1Var.h);
            w1Var.a.f3.O(true);
            return;
        }
        if (view.isEnabled()) {
            x1 b10 = x1.b(w1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i7 = r31Var.d;
            if (i7 >= 0) {
                b10.g();
                if (i7 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(r31Var.d);
                w1Var.h = false;
                String str2 = tL_timezone.id;
                w1Var.n = str2;
                ai.f1 f1Var2 = w1Var.c;
                if (f1Var2 != null) {
                    f1Var2.a(str2);
                }
                if (w1Var.d) {
                    w1Var.simpleActionBar.j(true);
                }
                w1Var.a.f3.O(true);
            }
        }
    }

    public static void a0(w1 w1Var, ArrayList arrayList, f41 f41Var) {
        boolean z9 = w1Var.d && !TextUtils.isEmpty(w1Var.e);
        x1 b10 = x1.b(w1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z9) {
            f41Var.V();
            String M0 = hd.M0(2131744121, null);
            r31 r31Var = new r31(9);
            r31Var.d = -1;
            r31Var.l = M0;
            r31Var.L(w1Var.h);
            arrayList.add(r31Var);
            f41Var.U();
            arrayList.add(r31.C(hd.a0(null, null, 2131744120, b10.d(w1Var.n, true))));
        }
        f41Var.V();
        if (!z9) {
            arrayList.add(r31.u(hd.M0(2131744119, null)));
        }
        boolean z10 = true;
        int i7 = 0;
        while (true) {
            b10.g();
            if (i7 >= arrayList2.size()) {
                break;
            }
            b10.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i7);
            CharSequence e10 = x1.e(tL_timezone, false);
            if (z9) {
                String replace = org.telegram.messenger.g0.O3(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = org.telegram.messenger.g0.O3(w1Var.e).toLowerCase();
                if (jg.g.A(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e10 = org.telegram.messenger.g0.w1(e10, w1Var.e, w1Var.resourceProvider);
                } else {
                    i7++;
                }
            }
            String f10 = x1.f(tL_timezone);
            r31 r31Var2 = new r31(10);
            r31Var2.d = i7;
            r31Var2.l = e10;
            r31Var2.n = f10;
            r31Var2.L(TextUtils.equals(tL_timezone.id, w1Var.n));
            r31Var2.g = !w1Var.h || z9;
            arrayList.add(r31Var2);
            z10 = false;
            i7++;
        }
        f41Var.U();
        if (z10) {
            arrayList.add(r31.m(w1Var.b));
        } else {
            arrayList.add(r31.C(null));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(hd.M0(2131744117, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 19));
        f5 b10 = this.simpleActionBar.o().b(1, R.drawable.outline_header_search);
        b10.N();
        b10.B0 = new v1(this, 0);
        b10.setSearchFieldHint(hd.M0(2131745837, null));
        FrameLayout frameLayout = new FrameLayout(context);
        k41 k41Var = new k41(this, new hi.u1(this, 13), new q4(this, 27), null);
        this.a = k41Var;
        k41Var.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, ha.c(-1.0f, -1));
        this.a.setOnScrollListener(new ai.b(this, 22));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(org.telegram.messenger.g0.L(500.0f));
        l9 l9Var = new l9(context);
        l9Var.getImageReceiver().z1 = false;
        ui.b0(this.currentAccount).c2(l9Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(l9Var, ha.t(qs.O1, qs.O1, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131744118, null));
        r6.V(textView, k6.y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.b.addView(textView, ha.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        k41 k41Var;
        f41 f41Var;
        if (i7 != qs.r3 || (k41Var = this.a) == null || (f41Var = k41Var.f3) == null) {
            return;
        }
        f41Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final pj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        String c10 = x1.b(this.currentAccount).c();
        this.f = c10;
        this.h = TextUtils.equals(c10, this.n);
        getNotificationCenter().c(this, qs.r3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.r3);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
