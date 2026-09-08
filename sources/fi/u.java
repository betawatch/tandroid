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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.g5;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class u extends org.telegram.ui.ActionBar.n2 {
    public d61 a;
    public final ArrayList b;
    public final HashMap c;

    public u() {
        super(null);
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public static void U(u uVar, ArrayList arrayList) {
        HashMap hashMap = uVar.c;
        ArrayList arrayList2 = uVar.b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            r rVar = (r) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(rVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                g5 g5Var = new g5(null, 24.0f, uVar.currentAccount);
                g5Var.e(rVar.a);
                spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(rVar.a));
                hashMap.put(rVar, spannableStringBuilder);
            }
            h51 i11 = h51.i(i10, spannableStringBuilder);
            i11.K(!rVar.b);
            arrayList.add(i11);
        }
        i2.g.A(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(u uVar, h51 h51Var) {
        int i10;
        v51 v51Var;
        ArrayList arrayList = uVar.b;
        if (h51Var.a != 4 || (i10 = h51Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        r rVar = (r) arrayList.get(h51Var.d);
        rVar.b = !rVar.b;
        Activity parentActivity = uVar.getParentActivity();
        int i11 = uVar.currentAccount;
        long j3 = rVar.a.id;
        boolean z10 = rVar.b;
        WeakHashMap weakHashMap = s.k;
        SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(j3 + "_disabled", z10);
        if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
            edit.putString(String.valueOf(j3), "");
        }
        edit.apply();
        d61 d61Var = uVar.a;
        if (d61Var == null || (v51Var = d61Var.Y2) == null) {
            return;
        }
        v51Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        i2.g.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.v0(j6.a7, this.resourceProvider));
        d61 d61Var = new d61(this, new ci.u(this, 13), new t(this), new t(this));
        this.a = d61Var;
        frameLayout.addView(d61Var, x5.e(-1, -1, 119));
        s.d(getParentActivity(), this.currentAccount, new bi.o1(this, 15));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
