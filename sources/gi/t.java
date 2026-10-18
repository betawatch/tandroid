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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.l5;
import w7.z5;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class t extends org.telegram.ui.ActionBar.n2 {
    public a71 a;
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
                l5 l5Var = new l5(null, 24.0f, tVar.currentAccount);
                l5Var.e(qVar.a);
                spannableStringBuilder.setSpan(l5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(qVar.a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            f61 i11 = f61.i(i10, spannableStringBuilder);
            i11.K(!qVar.b);
            arrayList.add(i11);
        }
        i2.d.B(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(t tVar, f61 f61Var) {
        int i10;
        s61 s61Var;
        ArrayList arrayList = tVar.b;
        if (f61Var.a != 4 || (i10 = f61Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        q qVar = (q) arrayList.get(f61Var.d);
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
        a71 a71Var = tVar.a;
        if (a71Var == null || (s61Var = a71Var.W2) == null) {
            return;
        }
        s61Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.w0(h6.a7, this.resourceProvider));
        a71 a71Var = new a71(this, new ai.q(this, 24), new s(this), new s(this));
        this.a = a71Var;
        frameLayout.addView(a71Var, z5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new ai.r0(this, 24));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
