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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.g5;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class u extends org.telegram.ui.ActionBar.m2 {
    public r61 a;
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
            q qVar = (q) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                g5 g5Var = new g5(null, 24.0f, uVar.currentAccount);
                g5Var.e(qVar.a);
                spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(qVar.a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            v51 i11 = v51.i(i10, spannableStringBuilder);
            i11.K(!qVar.b);
            arrayList.add(i11);
        }
        hg.c.n(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(u uVar, v51 v51Var) {
        int i10;
        j61 j61Var;
        ArrayList arrayList = uVar.b;
        if (v51Var.a != 4 || (i10 = v51Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        q qVar = (q) arrayList.get(v51Var.d);
        qVar.b = !qVar.b;
        Activity parentActivity = uVar.getParentActivity();
        int i11 = uVar.currentAccount;
        long j3 = qVar.a.id;
        boolean z10 = qVar.b;
        WeakHashMap weakHashMap = r.k;
        SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(j3 + "_disabled", z10);
        if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
            edit.putString(String.valueOf(j3), "");
        }
        edit.apply();
        r61 r61Var = uVar.a;
        if (r61Var == null || (j61Var = r61Var.Y2) == null) {
            return;
        }
        j61Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.v0(h6.a7, this.resourceProvider));
        r61 r61Var = new r61(this, new bi.v(this, 13), new s(this), new s(this));
        this.a = r61Var;
        frameLayout.addView(r61Var, y5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new ai.y1(this, 18));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
