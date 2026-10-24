package gi;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.k5;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class t extends org.telegram.ui.ActionBar.o2 {
    public j71 a;
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
            m61 i11 = m61.i(i10, spannableStringBuilder);
            i11.K(!qVar.b);
            arrayList.add(i11);
        }
        i2.o1.B(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(t tVar, m61 m61Var) {
        int i10;
        b71 b71Var;
        ArrayList arrayList = tVar.b;
        if (m61Var.a != 4 || (i10 = m61Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        q qVar = (q) arrayList.get(m61Var.d);
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
        j71 j71Var = tVar.a;
        if (j71Var == null || (b71Var = j71Var.Z2) == null) {
            return;
        }
        b71Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        i2.o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.a7, frameLayout, this.resourceProvider);
        j71 j71Var = new j71(this, new ai.q(this, 24), new s(this), new s(this));
        this.a = j71Var;
        frameLayout.addView(j71Var, z5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new ai.r0(this, 24));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
