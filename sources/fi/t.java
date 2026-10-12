package fi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.z61;
import org.telegram.ui.k5;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class t extends org.telegram.ui.ActionBar.m2 {
    public h71 a;
    public final ArrayList b;
    public final HashMap c;

    public t() {
        super(null);
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public static void U(t tVar, ArrayList arrayList) {
        HashMap hashMap = tVar.c;
        ArrayList arrayList2 = tVar.b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            q qVar = (q) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                k5 k5Var = new k5(null, 24.0f, tVar.currentAccount);
                k5Var.e(qVar.a);
                spannableStringBuilder.setSpan(k5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(qVar.a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            l61 i11 = l61.i(i10, spannableStringBuilder);
            i11.K(!qVar.b);
            arrayList.add(i11);
        }
        i2.d.y(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(t tVar, l61 l61Var) {
        int i10;
        z61 z61Var;
        ArrayList arrayList = tVar.b;
        if (l61Var.a != 4 || (i10 = l61Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        q qVar = (q) arrayList.get(l61Var.d);
        qVar.b = !qVar.b;
        Activity parentActivity = tVar.getParentActivity();
        int i11 = tVar.currentAccount;
        long j10 = qVar.a.id;
        boolean z10 = qVar.b;
        WeakHashMap weakHashMap = r.k;
        SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(j10 + "_disabled", z10);
        if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
            edit.putString(String.valueOf(j10), "");
        }
        edit.apply();
        h71 h71Var = tVar.a;
        if (h71Var == null || (z61Var = h71Var.W2) == null) {
            return;
        }
        z61Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        i2.d.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(g6.a7, this.resourceProvider));
        h71 h71Var = new h71(this, new ci.u(this, 13), new s(this), new s(this));
        this.a = h71Var;
        frameLayout.addView(h71Var, a6.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new bi.o1(this, 18));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
