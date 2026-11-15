package ki;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import bi.x4;
import c8.ja;
import hi.g7;
import hi.q4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.f5;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class s extends org.telegram.ui.ActionBar.e2 {
    public u41 a;
    public final ArrayList b;
    public final HashMap c;

    public s() {
        super(null);
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public static void Z(s sVar, ArrayList arrayList) {
        HashMap hashMap = sVar.c;
        ArrayList arrayList2 = sVar.b;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            q qVar = (q) arrayList2.get(i7);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                f5 f5Var = new f5(24.0f, sVar.currentAccount, null);
                f5Var.e(qVar.a);
                spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) q10.p(qVar.a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            b41 i10 = b41.i(i7, spannableStringBuilder);
            i10.L(!qVar.b);
            arrayList.add(i10);
        }
        arrayList.add(b41.C(hd.M0(2131746861, null)));
    }

    public static void a0(s sVar, b41 b41Var) {
        int i7;
        p41 p41Var;
        ArrayList arrayList = sVar.b;
        if (b41Var.a != 4 || (i7 = b41Var.d) < 0 || i7 >= arrayList.size()) {
            return;
        }
        q qVar = (q) arrayList.get(b41Var.d);
        qVar.b = !qVar.b;
        Activity parentActivity = sVar.getParentActivity();
        int i10 = sVar.currentAccount;
        long j3 = qVar.a.id;
        boolean z10 = qVar.b;
        WeakHashMap weakHashMap = r.k;
        SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i10, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(j3 + "_disabled", z10);
        if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
            edit.putString(String.valueOf(j3), "");
        }
        edit.apply();
        u41 u41Var = sVar.a;
        if (u41Var == null || (p41Var = u41Var.g3) == null) {
            return;
        }
        p41Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(hd.M0(2131746863, null));
        this.actionBar.setActionBarMenuOnItemClick(new x4(this, 13));
        FrameLayout frameLayout = new FrameLayout(context);
        q6.h(j6.a7, frameLayout, this.resourceProvider);
        u41 u41Var = new u41(this, new q4(this, 17), new e(this, 1), new i0.b(this, 14));
        this.a = u41Var;
        frameLayout.addView(u41Var, ja.e(-1, -1, ns.E1));
        r.d(getParentActivity(), this.currentAccount, new g7(this, 12));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
