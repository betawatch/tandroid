package ig;

import ai.o2;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.mk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w9;
import w7.z5;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class d2 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public c71 a;
    public LinearLayout b;
    public o2 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void U(d2 d2Var, h61 h61Var, View view) {
        if (h61Var.d == -1) {
            boolean z10 = d2Var.h;
            d2Var.h = !z10;
            if (!z10) {
                String str = d2Var.f;
                d2Var.n = str;
                o2 o2Var = d2Var.c;
                if (o2Var != null) {
                    o2Var.run(str);
                }
            }
            ((v8) view).setChecked(d2Var.h);
            d2Var.a.W2.N(true);
            return;
        }
        if (view.isEnabled()) {
            f2 b10 = f2.b(d2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = h61Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(h61Var.d);
                d2Var.h = false;
                String str2 = tL_timezone.id;
                d2Var.n = str2;
                o2 o2Var2 = d2Var.c;
                if (o2Var2 != null) {
                    o2Var2.run(str2);
                }
                if (d2Var.d) {
                    d2Var.actionBar.h(true);
                }
                d2Var.a.W2.N(true);
            }
        }
    }

    public static void V(d2 d2Var, ArrayList arrayList, u61 u61Var) {
        boolean z10 = d2Var.d && !TextUtils.isEmpty(d2Var.e);
        f2 b10 = f2.b(d2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            u61Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            h61 h61Var = new h61(9);
            h61Var.d = -1;
            h61Var.l = string;
            h61Var.K(d2Var.h);
            arrayList.add(h61Var);
            u61Var.T();
            arrayList.add(h61.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(d2Var.n, true))));
        }
        u61Var.U();
        if (!z10) {
            i2.e.p(R.string.TimezoneHeader, arrayList);
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
            CharSequence e = f2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(d2Var.e).toLowerCase();
                if (org.telegram.messenger.g0.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, d2Var.e, d2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = f2.f(tL_timezone);
            h61 h61Var2 = new h61(10);
            h61Var2.d = i10;
            h61Var2.l = e;
            h61Var2.n = f7;
            h61Var2.K(TextUtils.equals(tL_timezone.id, d2Var.n));
            h61Var2.g = !d2Var.h || z10;
            arrayList.add(h61Var2);
            z11 = false;
            i10++;
        }
        u61Var.T();
        if (z11) {
            arrayList.add(h61.l(d2Var.b));
        } else {
            arrayList.add(h61.B(null));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 18));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new c2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.a7, false));
        c71 c71Var = new c71(this, new hg.o(this, 10), new e1.c(this, 23), null);
        this.a = c71Var;
        c71Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, z5.c(-1.0f, -1));
        this.a.setOnScrollListener(new ah.d0(this, 15));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        w9 w9Var = new w9(context);
        w9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(w9Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(w9Var, z5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        mk.o(h6.y6, this.resourceProvider, textView, 1, 15.0f);
        this.b.addView(textView, z5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c71 c71Var;
        u61 u61Var;
        if (i10 != NotificationCenter.timezonesUpdated || (c71Var = this.a) == null || (u61Var = c71Var.W2) == null) {
            return;
        }
        u61Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        String c10 = f2.b(this.currentAccount).c();
        this.f = c10;
        this.h = TextUtils.equals(c10, this.n);
        getNotificationCenter().addObserver(this, NotificationCenter.timezonesUpdated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.timezonesUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
