package mh;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import fh.w4;
import g7.e6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import kh.b8;
import kh.i9;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.f5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class t extends org.telegram.ui.ActionBar.o2 {
    public i51 a;
    public final ArrayList b;
    public final HashMap c;

    public t() {
        super(null);
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public static void T(t tVar, ArrayList arrayList) {
        HashMap hashMap = tVar.c;
        ArrayList arrayList2 = tVar.b;
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            q qVar = (q) arrayList2.get(i9);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                f5 f5Var = new f5(null, 24.0f, tVar.currentAccount);
                f5Var.e(qVar.a);
                spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(qVar.a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            l41 i10 = l41.i(i9, spannableStringBuilder);
            i10.K(!qVar.b);
            arrayList.add(i10);
        }
        org.telegram.ui.Cells.j2.y(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void U(t tVar, l41 l41Var) {
        int i9;
        z41 z41Var;
        ArrayList arrayList = tVar.b;
        if (l41Var.a != 4 || (i9 = l41Var.d) < 0 || i9 >= arrayList.size()) {
            return;
        }
        q qVar = (q) arrayList.get(l41Var.d);
        qVar.b = !qVar.b;
        Activity parentActivity = tVar.getParentActivity();
        int i10 = tVar.currentAccount;
        long j10 = qVar.a.id;
        boolean z10 = qVar.b;
        WeakHashMap weakHashMap = r.k;
        SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i10, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(j10 + "_disabled", z10);
        if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
            edit.putString(String.valueOf(j10), "");
        }
        edit.apply();
        i51 i51Var = tVar.a;
        if (i51Var == null || (z41Var = i51Var.U2) == null) {
            return;
        }
        z41Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new w4(this, 3));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(f6.v0(f6.a7, this.resourceProvider));
        i51 i51Var = new i51(this, new b8(this, 6), new s(this), new s(this));
        this.a = i51Var;
        frameLayout.addView(i51Var, e6.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new i9(this, 2));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
