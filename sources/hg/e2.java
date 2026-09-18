package hg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.m2;
import ei.d5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.x51;
import w7.x5;
import yh.u7;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class e2 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public f61 a;
    public LinearLayout b;
    public m2 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void U(e2 e2Var, j51 j51Var, View view) {
        if (j51Var.d == -1) {
            boolean z10 = e2Var.h;
            e2Var.h = !z10;
            if (!z10) {
                String str = e2Var.f;
                e2Var.n = str;
                m2 m2Var = e2Var.c;
                if (m2Var != null) {
                    m2Var.run(str);
                }
            }
            ((w8) view).setChecked(e2Var.h);
            e2Var.a.Y2.N(true);
            return;
        }
        if (view.isEnabled()) {
            f2 b10 = f2.b(e2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = j51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(j51Var.d);
                e2Var.h = false;
                String str2 = tL_timezone.id;
                e2Var.n = str2;
                m2 m2Var2 = e2Var.c;
                if (m2Var2 != null) {
                    m2Var2.run(str2);
                }
                if (e2Var.d) {
                    e2Var.actionBar.h(true);
                }
                e2Var.a.Y2.N(true);
            }
        }
    }

    public static void V(e2 e2Var, ArrayList arrayList, x51 x51Var) {
        boolean z10 = e2Var.d && !TextUtils.isEmpty(e2Var.e);
        f2 b10 = f2.b(e2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            x51Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            j51 j51Var = new j51(9);
            j51Var.d = -1;
            j51Var.l = string;
            j51Var.K(e2Var.h);
            arrayList.add(j51Var);
            x51Var.T();
            arrayList.add(j51.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(e2Var.n, true))));
        }
        x51Var.U();
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
            CharSequence e = f2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(e2Var.e).toLowerCase();
                if (org.telegram.messenger.w1.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, e2Var.e, e2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = f2.f(tL_timezone);
            j51 j51Var2 = new j51(10);
            j51Var2.d = i10;
            j51Var2.l = e;
            j51Var2.n = f7;
            j51Var2.K(TextUtils.equals(tL_timezone.id, e2Var.n));
            j51Var2.g = !e2Var.h || z10;
            arrayList.add(j51Var2);
            z11 = false;
            i10++;
        }
        x51Var.T();
        if (z11) {
            arrayList.add(j51.l(e2Var.b));
        } else {
            arrayList.add(j51.B(null));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 16));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new d2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.a7, false));
        f61 f61Var = new f61(this, new u7(this, 1), new d5(this, 6), null);
        this.a = f61Var;
        f61Var.q1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, x5.c(-1.0f, -1));
        this.a.setOnScrollListener(new ai.r(this, 11));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        u9 u9Var = new u9(context);
        u9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(u9Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(u9Var, x5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        wl.n(j6.y6, this.resourceProvider, textView, 1, 15.0f);
        this.b.addView(textView, x5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f61 f61Var;
        x51 x51Var;
        if (i10 != NotificationCenter.timezonesUpdated || (f61Var = this.a) == null || (x51Var = f61Var.Y2) == null) {
            return;
        }
        x51Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        String c10 = f2.b(this.currentAccount).c();
        this.f = c10;
        this.h = TextUtils.equals(c10, this.n);
        getNotificationCenter().addObserver(this, NotificationCenter.timezonesUpdated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.timezonesUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
