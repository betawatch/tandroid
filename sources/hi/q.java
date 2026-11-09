package hi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import di.r4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.y31;
import org.telegram.ui.f5;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class q extends org.telegram.ui.ActionBar.f2 {
    public r41 a;
    public final ArrayList b;
    public final HashMap c;

    public q() {
        super(null);
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public static void Z(q qVar, ArrayList arrayList) {
        HashMap hashMap = qVar.c;
        ArrayList arrayList2 = qVar.b;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            o oVar = (o) arrayList2.get(i7);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(oVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                f5 f5Var = new f5(24.0f, qVar.currentAccount, null);
                f5Var.e(oVar.a);
                spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) t10.p(oVar.a));
                hashMap.put(oVar, spannableStringBuilder);
            }
            y31 i10 = y31.i(i7, spannableStringBuilder);
            i10.L(!oVar.b);
            arrayList.add(i10);
        }
        arrayList.add(y31.C(id.M0(2131746861, null)));
    }

    public static void a0(q qVar, y31 y31Var) {
        int i7;
        m41 m41Var;
        ArrayList arrayList = qVar.b;
        if (y31Var.a != 4 || (i7 = y31Var.d) < 0 || i7 >= arrayList.size()) {
            return;
        }
        o oVar = (o) arrayList.get(y31Var.d);
        oVar.b = !oVar.b;
        Activity parentActivity = qVar.getParentActivity();
        int i10 = qVar.currentAccount;
        long j3 = oVar.a.id;
        boolean z9 = oVar.b;
        WeakHashMap weakHashMap = p.k;
        SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i10, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(j3 + "_disabled", z9);
        if (!z9 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
            edit.putString(String.valueOf(j3), "");
        }
        edit.apply();
        r41 r41Var = qVar.a;
        if (r41Var == null || (m41Var = r41Var.f3) == null) {
            return;
        }
        m41Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(id.M0(2131746863, null));
        this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 3));
        FrameLayout frameLayout = new FrameLayout(context);
        s6.h(l6.a7, frameLayout, this.resourceProvider);
        r41 r41Var = new r41(this, new ai.e(this, 27), new r4(this, 21), new g2.c(this, 24));
        this.a = r41Var;
        frameLayout.addView(r41Var, ha.e(-1, -1, qs.E1));
        p.d(getParentActivity(), this.currentAccount, new ai.i(this, 29));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
