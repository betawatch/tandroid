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
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.w51;
import w7.y5;
import yh.s7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class e2 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public s61 a;
    public LinearLayout b;
    public m2 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void U(e2 e2Var, w51 w51Var, View view) {
        if (w51Var.d == -1) {
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
            ((x8) view).setChecked(e2Var.h);
            e2Var.a.Y2.N(true);
            return;
        }
        if (view.isEnabled()) {
            f2 b10 = f2.b(e2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = w51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(w51Var.d);
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

    public static void V(e2 e2Var, ArrayList arrayList, k61 k61Var) {
        boolean z10 = e2Var.d && !TextUtils.isEmpty(e2Var.e);
        f2 b10 = f2.b(e2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            k61Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            w51 w51Var = new w51(9);
            w51Var.d = -1;
            w51Var.l = string;
            w51Var.K(e2Var.h);
            arrayList.add(w51Var);
            k61Var.T();
            arrayList.add(w51.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(e2Var.n, true))));
        }
        k61Var.U();
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
                if (org.telegram.messenger.l0.v(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, e2Var.e, e2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = f2.f(tL_timezone);
            w51 w51Var2 = new w51(10);
            w51Var2.d = i10;
            w51Var2.l = e;
            w51Var2.n = f7;
            w51Var2.K(TextUtils.equals(tL_timezone.id, e2Var.n));
            w51Var2.g = !e2Var.h || z10;
            arrayList.add(w51Var2);
            z11 = false;
            i10++;
        }
        k61Var.T();
        if (z11) {
            arrayList.add(w51.l(e2Var.b));
        } else {
            arrayList.add(w51.B(null));
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
        a2.H = new d2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.a7, false));
        s61 s61Var = new s61(this, new s7(this, 1), new d5(this, 6), null);
        this.a = s61Var;
        s61Var.q1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, y5.c(-1.0f, -1));
        this.a.setOnScrollListener(new ai.r(this, 11));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        v9 v9Var = new v9(context);
        v9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(v9Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(v9Var, y5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        rk.n(j6.y6, this.resourceProvider, textView, 1, 15.0f);
        this.b.addView(textView, y5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s61 s61Var;
        k61 k61Var;
        if (i10 != NotificationCenter.timezonesUpdated || (s61Var = this.a) == null || (k61Var = s61Var.Y2) == null) {
            return;
        }
        k61Var.N(true);
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
