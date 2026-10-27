package jg;

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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f2 extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public s71 a;
    public LinearLayout b;
    public ai.n1 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void V(f2 f2Var, u61 u61Var, View view) {
        if (u61Var.d == -1) {
            boolean z10 = f2Var.h;
            f2Var.h = !z10;
            if (!z10) {
                String str = f2Var.f;
                f2Var.n = str;
                ai.n1 n1Var = f2Var.c;
                if (n1Var != null) {
                    n1Var.run(str);
                }
            }
            ((a9) view).setChecked(f2Var.h);
            f2Var.a.g3.O(true);
            return;
        }
        if (view.isEnabled()) {
            g2 b10 = g2.b(f2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = u61Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(u61Var.d);
                f2Var.h = false;
                String str2 = tL_timezone.id;
                f2Var.n = str2;
                ai.n1 n1Var2 = f2Var.c;
                if (n1Var2 != null) {
                    n1Var2.run(str2);
                }
                if (f2Var.d) {
                    f2Var.simpleActionBar.f(true);
                }
                f2Var.a.g3.O(true);
            }
        }
    }

    public static void W(f2 f2Var, ArrayList arrayList, k71 k71Var) {
        boolean z10 = f2Var.d && !TextUtils.isEmpty(f2Var.e);
        g2 b10 = g2.b(f2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            k71Var.V();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            u61 u61Var = new u61(9);
            u61Var.d = -1;
            u61Var.l = string;
            u61Var.L(f2Var.h);
            arrayList.add(u61Var);
            k71Var.U();
            arrayList.add(u61.C(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(f2Var.n, true))));
        }
        k71Var.V();
        if (!z10) {
            ic.a.p(R.string.TimezoneHeader, arrayList);
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
            CharSequence e = g2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(f2Var.e).toLowerCase();
                if (wh.u(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, f2Var.e, f2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = g2.f(tL_timezone);
            u61 u61Var2 = new u61(10);
            u61Var2.d = i10;
            u61Var2.l = e;
            u61Var2.n = f7;
            u61Var2.L(TextUtils.equals(tL_timezone.id, f2Var.n));
            u61Var2.g = !f2Var.h || z10;
            arrayList.add(u61Var2);
            z11 = false;
            i10++;
        }
        k71Var.U();
        if (z11) {
            arrayList.add(u61.m(f2Var.b));
        } else {
            arrayList.add(u61.C(null));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 18));
        y5 a2 = this.simpleActionBar.j().a(1, R.drawable.outline_header_search);
        a2.N();
        a2.z0 = new e2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        s71 s71Var = new s71(this, new hi.e2(this, 13), new e1(this, 3), null);
        this.a = s71Var;
        s71Var.u1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, kb1.g(-1.0f, -1));
        this.a.setOnScrollListener(new ai.b(this, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        y9 y9Var = new y9(context);
        y9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(y9Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(y9Var, kb1.x(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        f7.V(textView, y6.y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.b.addView(textView, kb1.x(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s71 s71Var;
        k71 k71Var;
        if (i10 != NotificationCenter.timezonesUpdated || (s71Var = this.a) == null || (k71Var = s71Var.g3) == null) {
            return;
        }
        k71Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final nm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        String c10 = g2.b(this.currentAccount).c();
        this.f = c10;
        this.h = TextUtils.equals(c10, this.n);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.timezonesUpdated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.timezonesUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
