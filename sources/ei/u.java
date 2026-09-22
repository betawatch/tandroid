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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y51;
import org.telegram.ui.g5;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class u extends org.telegram.ui.ActionBar.n2 {
    public u61 a;
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
            y51 i11 = y51.i(i10, spannableStringBuilder);
            i11.K(!qVar.b);
            arrayList.add(i11);
        }
        com.google.android.gms.internal.vision.e2.w(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(u uVar, y51 y51Var) {
        int i10;
        m61 m61Var;
        ArrayList arrayList = uVar.b;
        if (y51Var.a != 4 || (i10 = y51Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        q qVar = (q) arrayList.get(y51Var.d);
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
        u61 u61Var = uVar.a;
        if (u61Var == null || (m61Var = u61Var.Y2) == null) {
            return;
        }
        m61Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        hg.k0.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.v0(j6.a7, this.resourceProvider));
        u61 u61Var = new u61(this, new bi.v(this, 13), new s(this), new s(this));
        this.a = u61Var;
        frameLayout.addView(u61Var, y5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new ai.y1(this, 15));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
