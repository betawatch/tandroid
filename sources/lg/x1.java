package lg;

import ai.g5;
import ai.j5;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import gi.q4;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x1 extends d2 implements cs {
    public l41 a;
    public LinearLayout b;
    public ai.o1 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void Z(x1 x1Var, r31 r31Var, View view) {
        if (r31Var.d == -1) {
            boolean z10 = x1Var.h;
            x1Var.h = !z10;
            if (!z10) {
                String str = x1Var.f;
                x1Var.n = str;
                ai.o1 o1Var = x1Var.c;
                if (o1Var != null) {
                    o1Var.a(str);
                }
            }
            ((q8) view).setChecked(x1Var.h);
            x1Var.a.g3.O(true);
            return;
        }
        if (view.isEnabled()) {
            y1 b10 = y1.b(x1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i3 = r31Var.d;
            if (i3 >= 0) {
                b10.g();
                if (i3 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(r31Var.d);
                x1Var.h = false;
                String str2 = tL_timezone.id;
                x1Var.n = str2;
                ai.o1 o1Var2 = x1Var.c;
                if (o1Var2 != null) {
                    o1Var2.a(str2);
                }
                if (x1Var.d) {
                    x1Var.simpleActionBar.j(true);
                }
                x1Var.a.g3.O(true);
            }
        }
    }

    public static void a0(x1 x1Var, ArrayList arrayList, f41 f41Var) {
        boolean z10 = x1Var.d && !TextUtils.isEmpty(x1Var.e);
        y1 b10 = y1.b(x1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            f41Var.V();
            String M0 = bd.M0(2131744130, null);
            r31 r31Var = new r31(9);
            r31Var.d = -1;
            r31Var.l = M0;
            r31Var.L(x1Var.h);
            arrayList.add(r31Var);
            f41Var.U();
            arrayList.add(r31.C(bd.a0(null, null, 2131744129, b10.d(x1Var.n, true))));
        }
        f41Var.V();
        if (!z10) {
            arrayList.add(r31.u(bd.M0(2131744128, null)));
        }
        boolean z11 = true;
        int i3 = 0;
        while (true) {
            b10.g();
            if (i3 >= arrayList2.size()) {
                break;
            }
            b10.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i3);
            CharSequence e10 = y1.e(tL_timezone, false);
            if (z10) {
                String replace = org.telegram.messenger.g0.O3(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = org.telegram.messenger.g0.O3(x1Var.e).toLowerCase();
                if (k2.p1.z(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e10 = org.telegram.messenger.g0.w1(e10, x1Var.e, x1Var.resourceProvider);
                } else {
                    i3++;
                }
            }
            String f10 = y1.f(tL_timezone);
            r31 r31Var2 = new r31(10);
            r31Var2.d = i3;
            r31Var2.l = e10;
            r31Var2.n = f10;
            r31Var2.L(TextUtils.equals(tL_timezone.id, x1Var.n));
            r31Var2.g = !x1Var.h || z10;
            arrayList.add(r31Var2);
            z11 = false;
            i3++;
        }
        f41Var.U();
        if (z11) {
            arrayList.add(r31.m(x1Var.b));
        } else {
            arrayList.add(r31.C(null));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(bd.M0(2131744126, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 20));
        f5 b10 = this.simpleActionBar.o().b(1, R.drawable.outline_header_search);
        b10.N();
        b10.C0 = new w1(this, 0);
        b10.setSearchFieldHint(bd.M0(2131745846, null));
        FrameLayout frameLayout = new FrameLayout(context);
        l41 l41Var = new l41(this, new q4(this, 23), new l5.b(this, 4), null);
        this.a = l41Var;
        l41Var.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, mf.c(-1.0f, -1));
        this.a.setOnScrollListener(new j5(this, 25));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(org.telegram.messenger.g0.L(500.0f));
        k9 k9Var = new k9(context);
        k9Var.getImageReceiver().A1 = false;
        li.b0(this.currentAccount).c2(k9Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(k9Var, mf.t(hs.O1, hs.O1, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(bd.M0(2131744127, null));
        r6.V(textView, k6.y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.b.addView(textView, mf.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        l41 l41Var;
        f41 f41Var;
        if (i3 != hs.r3 || (l41Var = this.a) == null || (f41Var = l41Var.g3) == null) {
            return;
        }
        f41Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final tj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        String c2 = y1.b(this.currentAccount).c();
        this.f = c2;
        this.h = TextUtils.equals(c2, this.n);
        getNotificationCenter().c(this, hs.r3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.r3);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
