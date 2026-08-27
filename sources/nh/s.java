package nh;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import lh.a8;
import lh.n6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.g5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class s extends org.telegram.ui.ActionBar.n2 {
    public k51 a;
    public final ArrayList b;
    public final HashMap c;

    public s() {
        super(null);
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public static void U(s sVar, ArrayList arrayList) {
        HashMap hashMap = sVar.c;
        ArrayList arrayList2 = sVar.b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            p pVar = (p) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(pVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                g5 g5Var = new g5(null, 24.0f, sVar.currentAccount);
                g5Var.e(pVar.a);
                spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(pVar.a));
                hashMap.put(pVar, spannableStringBuilder);
            }
            n41 i11 = n41.i(i10, spannableStringBuilder);
            i11.K(!pVar.b);
            arrayList.add(i11);
        }
        pa.A(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(s sVar, n41 n41Var) {
        int i10;
        b51 b51Var;
        ArrayList arrayList = sVar.b;
        if (n41Var.a != 4 || (i10 = n41Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        p pVar = (p) arrayList.get(n41Var.d);
        pVar.b = !pVar.b;
        Activity parentActivity = sVar.getParentActivity();
        int i11 = sVar.currentAccount;
        long j10 = pVar.a.id;
        boolean z10 = pVar.b;
        WeakHashMap weakHashMap = q.k;
        SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(j10 + "_disabled", z10);
        if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
            edit.putString(String.valueOf(j10), "");
        }
        edit.apply();
        k51 k51Var = sVar.a;
        if (k51Var == null || (b51Var = k51Var.U2) == null) {
            return;
        }
        b51Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        pa.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.v0(g6.a7, this.resourceProvider));
        k51 k51Var = new k51(this, new a8(this, 6), new r(this), new r(this));
        this.a = k51Var;
        frameLayout.addView(k51Var, z5.e(-1, -1, 119));
        q.d(getParentActivity(), this.currentAccount, new n6(this, 4));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
