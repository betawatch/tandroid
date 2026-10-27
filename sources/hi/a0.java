package hi;

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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.j5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class a0 extends org.telegram.ui.ActionBar.r2 {
    public s71 a;
    public final ArrayList b;
    public final HashMap c;

    public a0() {
        super(null);
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public static void V(a0 a0Var, ArrayList arrayList) {
        HashMap hashMap = a0Var.c;
        ArrayList arrayList2 = a0Var.b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            x xVar = (x) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(xVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                j5 j5Var = new j5(null, 24.0f, a0Var.currentAccount);
                j5Var.e(xVar.a);
                spannableStringBuilder.setSpan(j5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(xVar.a));
                hashMap.put(xVar, spannableStringBuilder);
            }
            u61 i11 = u61.i(i10, spannableStringBuilder);
            i11.L(!xVar.b);
            arrayList.add(i11);
        }
        ic.a.z(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void W(a0 a0Var, u61 u61Var) {
        int i10;
        k71 k71Var;
        ArrayList arrayList = a0Var.b;
        if (u61Var.a != 4 || (i10 = u61Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        x xVar = (x) arrayList.get(u61Var.d);
        xVar.b = !xVar.b;
        Activity parentActivity = a0Var.getParentActivity();
        int i11 = a0Var.currentAccount;
        long j10 = xVar.a.id;
        boolean z10 = xVar.b;
        WeakHashMap weakHashMap = y.k;
        SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(j10 + "_disabled", z10);
        if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
            edit.putString(String.valueOf(j10), "");
        }
        edit.apply();
        s71 s71Var = a0Var.a;
        if (s71Var == null || (k71Var = s71Var.g3) == null) {
            return;
        }
        k71Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        f7.i(y6.a7, frameLayout, this.resourceProvider);
        s71 s71Var = new s71(this, new ai.e(this, 27), new z(this), new z(this));
        this.a = s71Var;
        frameLayout.addView(s71Var, kb1.i(-1, -1, 119));
        y.d(getParentActivity(), this.currentAccount, new ai.i(this, 28));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
