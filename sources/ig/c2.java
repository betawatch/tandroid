package ig;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.w9;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class c2 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public j71 a;
    public LinearLayout b;
    public ai.o2 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void U(c2 c2Var, m61 m61Var, View view) {
        if (m61Var.d == -1) {
            boolean z10 = c2Var.h;
            c2Var.h = !z10;
            if (!z10) {
                String str = c2Var.f;
                c2Var.n = str;
                ai.o2 o2Var = c2Var.c;
                if (o2Var != null) {
                    o2Var.run(str);
                }
            }
            ((w8) view).setChecked(c2Var.h);
            c2Var.a.Z2.N(true);
            return;
        }
        if (view.isEnabled()) {
            e2 b10 = e2.b(c2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = m61Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(m61Var.d);
                c2Var.h = false;
                String str2 = tL_timezone.id;
                c2Var.n = str2;
                ai.o2 o2Var2 = c2Var.c;
                if (o2Var2 != null) {
                    o2Var2.run(str2);
                }
                if (c2Var.d) {
                    c2Var.actionBar.g(true);
                }
                c2Var.a.Z2.N(true);
            }
        }
    }

    public static void V(c2 c2Var, ArrayList arrayList, b71 b71Var) {
        boolean z10 = c2Var.d && !TextUtils.isEmpty(c2Var.e);
        e2 b10 = e2.b(c2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            b71Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            m61 m61Var = new m61(9);
            m61Var.d = -1;
            m61Var.l = string;
            m61Var.K(c2Var.h);
            arrayList.add(m61Var);
            b71Var.T();
            arrayList.add(m61.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(c2Var.n, true))));
        }
        b71Var.U();
        if (!z10) {
            i2.o1.q(R.string.TimezoneHeader, arrayList);
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
            CharSequence e = e2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(c2Var.e).toLowerCase();
                if (org.telegram.messenger.v0.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, c2Var.e, c2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = e2.f(tL_timezone);
            m61 m61Var2 = new m61(10);
            m61Var2.d = i10;
            m61Var2.l = e;
            m61Var2.n = f7;
            m61Var2.K(TextUtils.equals(tL_timezone.id, c2Var.n));
            m61Var2.g = !c2Var.h || z10;
            arrayList.add(m61Var2);
            z11 = false;
            i10++;
        }
        b71Var.T();
        if (z11) {
            arrayList.add(m61.l(c2Var.b));
        } else {
            arrayList.add(m61.B(null));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 18));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new b2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.a7, frameLayout, null);
        j71 j71Var = new j71(this, new hg.o(this, 10), new e1.c(this, 23), null);
        this.a = j71Var;
        j71Var.t1();
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
        r6.W(textView, k6.y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.b.addView(textView, z5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j71 j71Var;
        b71 b71Var;
        if (i10 != NotificationCenter.timezonesUpdated || (j71Var = this.a) == null || (b71Var = j71Var.Z2) == null) {
            return;
        }
        b71Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        String c10 = e2.b(this.currentAccount).c();
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
