package hg;

import ai.g3;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zl0;
import w7.z5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class e2 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public e71 a;
    public LinearLayout b;
    public g3 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void S(e2 e2Var, h61 h61Var, View view) {
        if (h61Var.d == -1) {
            boolean z10 = e2Var.h;
            e2Var.h = !z10;
            if (!z10) {
                String str = e2Var.f;
                e2Var.n = str;
                g3 g3Var = e2Var.c;
                if (g3Var != null) {
                    g3Var.run(str);
                }
            }
            ((w8) view).setChecked(e2Var.h);
            e2Var.a.f3.N(true);
            return;
        }
        if (view.isEnabled()) {
            f2 b10 = f2.b(e2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = h61Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(h61Var.d);
                e2Var.h = false;
                String str2 = tL_timezone.id;
                e2Var.n = str2;
                g3 g3Var2 = e2Var.c;
                if (g3Var2 != null) {
                    g3Var2.run(str2);
                }
                if (e2Var.d) {
                    e2Var.actionBar.h(true);
                }
                e2Var.a.f3.N(true);
            }
        }
    }

    public static void T(e2 e2Var, ArrayList arrayList, w61 w61Var) {
        boolean z10 = e2Var.d && !TextUtils.isEmpty(e2Var.e);
        f2 b10 = f2.b(e2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            w61Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            h61 h61Var = new h61(9);
            h61Var.d = -1;
            h61Var.l = string;
            h61Var.L(e2Var.h);
            arrayList.add(h61Var);
            w61Var.T();
            arrayList.add(h61.C(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(e2Var.n, true))));
        }
        w61Var.U();
        if (!z10) {
            com.google.android.gms.internal.vision.e2.n(R.string.TimezoneHeader, arrayList);
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
            CharSequence e7 = f2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(e2Var.e).toLowerCase();
                if (bi.u(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e7 = AndroidUtilities.highlightText(e7, e2Var.e, e2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = f2.f(tL_timezone);
            h61 h61Var2 = new h61(10);
            h61Var2.d = i10;
            h61Var2.l = e7;
            h61Var2.n = f7;
            h61Var2.L(TextUtils.equals(tL_timezone.id, e2Var.n));
            h61Var2.g = !e2Var.h || z10;
            arrayList.add(h61Var2);
            z11 = false;
            i10++;
        }
        w61Var.T();
        if (z11) {
            arrayList.add(h61.m(e2Var.b));
        } else {
            arrayList.add(h61.C(null));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 16));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new d2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        e71 e71Var = new e71(this, new bi.v(this, 29), new ei.f(this, 7), null);
        this.a = e71Var;
        e71Var.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, z5.c(-1.0f, -1));
        this.a.setOnScrollListener(new ai.r(this, 11));
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
        bi.m(i6.y6, this.resourceProvider, textView, 1, 15.0f);
        this.b.addView(textView, z5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e71 e71Var;
        w61 w61Var;
        if (i10 != NotificationCenter.timezonesUpdated || (e71Var = this.a) == null || (w61Var = e71Var.f3) == null) {
            return;
        }
        w61Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final zl0 getListViewForSimpleGlass() {
        return this.a;
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
}
