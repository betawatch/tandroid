package gg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.y2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w9;
import w7.a6;
import xh.v7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n2 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public r61 a;
    public LinearLayout b;
    public y2 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void U(n2 n2Var, v51 v51Var, View view) {
        if (v51Var.d == -1) {
            boolean z10 = n2Var.h;
            n2Var.h = !z10;
            if (!z10) {
                String str = n2Var.f;
                n2Var.n = str;
                y2 y2Var = n2Var.c;
                if (y2Var != null) {
                    y2Var.run(str);
                }
            }
            ((x8) view).setChecked(n2Var.h);
            n2Var.a.Y2.N(true);
            return;
        }
        if (view.isEnabled()) {
            o2 b10 = o2.b(n2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = v51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(v51Var.d);
                n2Var.h = false;
                String str2 = tL_timezone.id;
                n2Var.n = str2;
                y2 y2Var2 = n2Var.c;
                if (y2Var2 != null) {
                    y2Var2.run(str2);
                }
                if (n2Var.d) {
                    n2Var.actionBar.h(true);
                }
                n2Var.a.Y2.N(true);
            }
        }
    }

    public static void V(n2 n2Var, ArrayList arrayList, j61 j61Var) {
        boolean z10 = n2Var.d && !TextUtils.isEmpty(n2Var.e);
        o2 b10 = o2.b(n2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            j61Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            v51 v51Var = new v51(9);
            v51Var.d = -1;
            v51Var.l = string;
            v51Var.K(n2Var.h);
            arrayList.add(v51Var);
            j61Var.T();
            arrayList.add(v51.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(n2Var.n, true))));
        }
        j61Var.U();
        if (!z10) {
            com.google.android.gms.internal.vision.e2.m(R.string.TimezoneHeader, arrayList);
        }
        int i10 = 0;
        boolean z11 = true;
        while (true) {
            b10.g();
            if (i10 >= arrayList2.size()) {
                break;
            }
            b10.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i10);
            CharSequence e = o2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(n2Var.e).toLowerCase();
                if (org.telegram.messenger.a2.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, n2Var.e, n2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = o2.f(tL_timezone);
            v51 v51Var2 = new v51(10);
            v51Var2.d = i10;
            v51Var2.l = e;
            v51Var2.n = f7;
            v51Var2.K(TextUtils.equals(tL_timezone.id, n2Var.n));
            v51Var2.g = !n2Var.h || z10;
            arrayList.add(v51Var2);
            z11 = false;
            i10++;
        }
        j61Var.T();
        if (z11) {
            arrayList.add(v51.l(n2Var.b));
        } else {
            arrayList.add(v51.B(null));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 16));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new m2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.a7, false));
        r61 r61Var = new r61(this, new v7(this, 1), new a1.c(this, 26), null);
        this.a = r61Var;
        r61Var.o1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, a6.c(-1.0f, -1));
        this.a.setOnScrollListener(new bi.a2(this, 9));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        w9 w9Var = new w9(context);
        w9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(w9Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(w9Var, a6.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        em.n(j6.y6, this.resourceProvider, textView, 1, 15.0f);
        this.b.addView(textView, a6.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        r61 r61Var;
        j61 j61Var;
        if (i10 != NotificationCenter.timezonesUpdated || (r61Var = this.a) == null || (j61Var = r61Var.Y2) == null) {
            return;
        }
        j61Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        String c10 = o2.b(this.currentAccount).c();
        this.f = c10;
        this.h = TextUtils.equals(c10, this.n);
        getNotificationCenter().addObserver(this, NotificationCenter.timezonesUpdated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.timezonesUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
