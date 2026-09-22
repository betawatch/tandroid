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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.w51;
import w7.x5;
import yh.t7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class f2 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public e61 a;
    public LinearLayout b;
    public m2 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void U(f2 f2Var, i51 i51Var, View view) {
        if (i51Var.d == -1) {
            boolean z10 = f2Var.h;
            f2Var.h = !z10;
            if (!z10) {
                String str = f2Var.f;
                f2Var.n = str;
                m2 m2Var = f2Var.c;
                if (m2Var != null) {
                    m2Var.run(str);
                }
            }
            ((w8) view).setChecked(f2Var.h);
            f2Var.a.Y2.N(true);
            return;
        }
        if (view.isEnabled()) {
            g2 b10 = g2.b(f2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = i51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i51Var.d);
                f2Var.h = false;
                String str2 = tL_timezone.id;
                f2Var.n = str2;
                m2 m2Var2 = f2Var.c;
                if (m2Var2 != null) {
                    m2Var2.run(str2);
                }
                if (f2Var.d) {
                    f2Var.actionBar.h(true);
                }
                f2Var.a.Y2.N(true);
            }
        }
    }

    public static void V(f2 f2Var, ArrayList arrayList, w51 w51Var) {
        boolean z10 = f2Var.d && !TextUtils.isEmpty(f2Var.e);
        g2 b10 = g2.b(f2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            w51Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            i51 i51Var = new i51(9);
            i51Var.d = -1;
            i51Var.l = string;
            i51Var.K(f2Var.h);
            arrayList.add(i51Var);
            w51Var.T();
            arrayList.add(i51.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(f2Var.n, true))));
        }
        w51Var.U();
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
            CharSequence e = g2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(f2Var.e).toLowerCase();
                if (org.telegram.messenger.y0.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, f2Var.e, f2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = g2.f(tL_timezone);
            i51 i51Var2 = new i51(10);
            i51Var2.d = i10;
            i51Var2.l = e;
            i51Var2.n = f7;
            i51Var2.K(TextUtils.equals(tL_timezone.id, f2Var.n));
            i51Var2.g = !f2Var.h || z10;
            arrayList.add(i51Var2);
            z11 = false;
            i10++;
        }
        w51Var.T();
        if (z11) {
            arrayList.add(i51.l(f2Var.b));
        } else {
            arrayList.add(i51.B(null));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 16));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new e2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.w0(null, i6.a7, false));
        e61 e61Var = new e61(this, new t7(this, 1), new d5(this, 6), null);
        this.a = e61Var;
        e61Var.p1();
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
        vl.o(i6.y6, this.resourceProvider, textView, 1, 15.0f);
        this.b.addView(textView, x5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e61 e61Var;
        w51 w51Var;
        if (i10 != NotificationCenter.timezonesUpdated || (e61Var = this.a) == null || (w51Var = e61Var.Y2) == null) {
            return;
        }
        w51Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        String c10 = g2.b(this.currentAccount).c();
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
