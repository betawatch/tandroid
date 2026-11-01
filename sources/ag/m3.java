package ag;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m3 extends org.telegram.ui.ActionBar.k2 implements vs {
    public v51 a;
    public LinearLayout b;
    public e0 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void Z(m3 m3Var, b51 b51Var, View view) {
        if (b51Var.d == -1) {
            boolean z10 = m3Var.h;
            m3Var.h = !z10;
            if (!z10) {
                String str = m3Var.f;
                m3Var.n = str;
                e0 e0Var = m3Var.c;
                if (e0Var != null) {
                    e0Var.a(str);
                }
            }
            ((t8) view).setChecked(m3Var.h);
            m3Var.a.f3.O(true);
            return;
        }
        if (view.isEnabled()) {
            n3 b10 = n3.b(m3Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = b51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(b51Var.d);
                m3Var.h = false;
                String str2 = tL_timezone.id;
                m3Var.n = str2;
                e0 e0Var2 = m3Var.c;
                if (e0Var2 != null) {
                    e0Var2.a(str2);
                }
                if (m3Var.d) {
                    m3Var.simpleActionBar.j(true);
                }
                m3Var.a.f3.O(true);
            }
        }
    }

    public static void a0(m3 m3Var, ArrayList arrayList, q51 q51Var) {
        boolean z10 = m3Var.d && !TextUtils.isEmpty(m3Var.e);
        n3 b10 = n3.b(m3Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            q51Var.V();
            String L0 = dd.L0(2131744145, null);
            b51 b51Var = new b51(9);
            b51Var.d = -1;
            b51Var.l = L0;
            b51Var.L(m3Var.h);
            arrayList.add(b51Var);
            q51Var.U();
            arrayList.add(b51.C(dd.a0(null, null, 2131744144, b10.d(m3Var.n, true))));
        }
        q51Var.V();
        if (!z10) {
            arrayList.add(b51.u(dd.L0(2131744143, null)));
        }
        boolean z11 = true;
        int i10 = 0;
        while (true) {
            b10.g();
            if (i10 >= arrayList2.size()) {
                break;
            }
            b10.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i10);
            CharSequence e = n3.e(tL_timezone, false);
            if (z10) {
                String replace = org.telegram.messenger.i0.N3(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = org.telegram.messenger.i0.N3(m3Var.e).toLowerCase();
                if (sc.e.y(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = org.telegram.messenger.i0.w1(e, m3Var.e, m3Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = n3.f(tL_timezone);
            b51 b51Var2 = new b51(10);
            b51Var2.d = i10;
            b51Var2.l = e;
            b51Var2.n = f7;
            b51Var2.L(TextUtils.equals(tL_timezone.id, m3Var.n));
            b51Var2.g = !m3Var.h || z10;
            arrayList.add(b51Var2);
            z11 = false;
            i10++;
        }
        q51Var.U();
        if (z11) {
            arrayList.add(b51.m(m3Var.b));
        } else {
            arrayList.add(b51.C(null));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(dd.L0(2131744141, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 8));
        p5 b10 = this.simpleActionBar.o().b(1, R.drawable.outline_header_search);
        b10.N();
        b10.B0 = new l3(this, 0);
        b10.setSearchFieldHint(dd.L0(2131745853, null));
        FrameLayout frameLayout = new FrameLayout(context);
        v51 v51Var = new v51(this, new a(this, 8), new a1.c(this, 5), null);
        this.a = v51Var;
        v51Var.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, b6.c(-1.0f, -1));
        this.a.setOnScrollListener(new u(this, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(org.telegram.messenger.i0.L(500.0f));
        g9 g9Var = new g9(context);
        g9Var.getImageReceiver().z1 = false;
        vi.b0(this.currentAccount).c2(g9Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(g9Var, b6.t(at.O1, at.O1, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(dd.L0(2131744142, null));
        a7.V(textView, t6.y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.b.addView(textView, b6.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        q51 q51Var;
        if (i10 != at.r3 || (v51Var = this.a) == null || (q51Var = v51Var.f3) == null) {
            return;
        }
        q51Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final uk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        String c10 = n3.b(this.currentAccount).c();
        this.f = c10;
        this.h = TextUtils.equals(c10, this.n);
        getNotificationCenter().c(this, at.r3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, at.r3);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
