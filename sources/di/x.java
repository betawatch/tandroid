package di;

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
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x extends org.telegram.ui.ActionBar.p2 {
    public r61 a;
    public final ArrayList b;
    public final HashMap c;

    public x() {
        super(null);
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public static void U(x xVar, ArrayList arrayList) {
        HashMap hashMap = xVar.c;
        ArrayList arrayList2 = xVar.b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            t tVar = (t) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(tVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(null, 24.0f, xVar.currentAccount);
                g5Var.e(tVar.a);
                spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(tVar.a));
                hashMap.put(tVar, spannableStringBuilder);
            }
            v51 i11 = v51.i(i10, spannableStringBuilder);
            i11.K(!tVar.b);
            arrayList.add(i11);
        }
        com.google.android.gms.internal.vision.e2.w(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(x xVar, v51 v51Var) {
        int i10;
        j61 j61Var;
        ArrayList arrayList = xVar.b;
        if (v51Var.a != 4 || (i10 = v51Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        t tVar = (t) arrayList.get(v51Var.d);
        tVar.b = !tVar.b;
        Activity parentActivity = xVar.getParentActivity();
        int i11 = xVar.currentAccount;
        long j3 = tVar.a.id;
        boolean z10 = tVar.b;
        WeakHashMap weakHashMap = u.k;
        SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(j3 + "_disabled", z10);
        if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
            edit.putString(String.valueOf(j3), "");
        }
        edit.apply();
        r61 r61Var = xVar.a;
        if (r61Var == null || (j61Var = r61Var.Y2) == null) {
            return;
        }
        j61Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new w(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.v0(j6.a7, this.resourceProvider));
        r61 r61Var = new r61(this, new ai.c0(this, 13), new v(this), new v(this));
        this.a = r61Var;
        frameLayout.addView(r61Var, a6.e(-1, -1, 119));
        u.d(getParentActivity(), this.currentAccount, new ai.b(this, 11));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
