package hi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.f5;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class q extends org.telegram.ui.ActionBar.f2 {
    public q41 a;
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
            x31 i10 = x31.i(i7, spannableStringBuilder);
            i10.L(!oVar.b);
            arrayList.add(i10);
        }
        arrayList.add(x31.C(hd.M0(2131746860, null)));
    }

    public static void a0(q qVar, x31 x31Var) {
        int i7;
        l41 l41Var;
        ArrayList arrayList = qVar.b;
        if (x31Var.a != 4 || (i7 = x31Var.d) < 0 || i7 >= arrayList.size()) {
            return;
        }
        o oVar = (o) arrayList.get(x31Var.d);
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
        q41 q41Var = qVar.a;
        if (q41Var == null || (l41Var = q41Var.f3) == null) {
            return;
        }
        l41Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(hd.M0(2131746862, null));
        this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 3));
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.a7, frameLayout, this.resourceProvider);
        q41 q41Var = new q41(this, new ai.e(this, 27), new di.q4(this, 21), new g2.c(this, 24));
        this.a = q41Var;
        frameLayout.addView(q41Var, ha.e(-1, -1, qs.E1));
        p.d(getParentActivity(), this.currentAccount, new ai.i(this, 29));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
