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
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.g5;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class u extends org.telegram.ui.ActionBar.n2 {
    public e61 a;
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
            i51 i11 = i51.i(i10, spannableStringBuilder);
            i11.K(!qVar.b);
            arrayList.add(i11);
        }
        hg.c.p(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(u uVar, i51 i51Var) {
        int i10;
        w51 w51Var;
        ArrayList arrayList = uVar.b;
        if (i51Var.a != 4 || (i10 = i51Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        q qVar = (q) arrayList.get(i51Var.d);
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
        e61 e61Var = uVar.a;
        if (e61Var == null || (w51Var = e61Var.Y2) == null) {
            return;
        }
        w51Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        hg.c.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.v0(i6.a7, this.resourceProvider));
        e61 e61Var = new e61(this, new bi.v(this, 13), new s(this), new s(this));
        this.a = e61Var;
        frameLayout.addView(e61Var, x5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new ai.y1(this, 15));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
