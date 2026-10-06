package ei;

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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.h5;
import w7.z5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class v extends org.telegram.ui.ActionBar.n2 {
    public e71 a;
    public final ArrayList b;
    public final HashMap c;

    public v() {
        super(null);
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public static void S(v vVar, ArrayList arrayList) {
        HashMap hashMap = vVar.c;
        ArrayList arrayList2 = vVar.b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            r rVar = (r) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(rVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                h5 h5Var = new h5(null, 24.0f, vVar.currentAccount);
                h5Var.e(rVar.a);
                spannableStringBuilder.setSpan(h5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(rVar.a));
                hashMap.put(rVar, spannableStringBuilder);
            }
            h61 i11 = h61.i(i10, spannableStringBuilder);
            i11.L(!rVar.b);
            arrayList.add(i11);
        }
        hg.c.n(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void T(v vVar, h61 h61Var) {
        int i10;
        w61 w61Var;
        ArrayList arrayList = vVar.b;
        if (h61Var.a != 4 || (i10 = h61Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        r rVar = (r) arrayList.get(h61Var.d);
        rVar.b = !rVar.b;
        Activity parentActivity = vVar.getParentActivity();
        int i11 = vVar.currentAccount;
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
        e71 e71Var = vVar.a;
        if (e71Var == null || (w61Var = e71Var.f3) == null) {
            return;
        }
        w61Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        hg.c.u(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new u(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.v0(i6.a7, this.resourceProvider));
        e71 e71Var = new e71(this, new bi.v(this, 13), new t(this), new t(this));
        this.a = e71Var;
        frameLayout.addView(e71Var, z5.e(-1, -1, 119));
        s.d(getParentActivity(), this.currentAccount, new ai.y1(this, 18));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
