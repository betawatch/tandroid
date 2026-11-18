package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class az0 implements org.telegram.ui.Components.pj0, org.telegram.ui.Components.rj0, ww {
    public final /* synthetic */ SaveToGallerySettingsActivity a;

    public /* synthetic */ az0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(cx cxVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.pj0
    public void f(float f10, float f11, int i7, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (i7 == saveToGallerySettingsActivity.e) {
            saveToGallerySettingsActivity.c0().a = !r11.a;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
            return;
        }
        if (i7 == saveToGallerySettingsActivity.f) {
            saveToGallerySettingsActivity.c0().b = !r11.b;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
            return;
        }
        if (((cz0) arrayList.get(i7)).a != 1) {
            if (((cz0) arrayList.get(i7)).a == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((cz0) arrayList.get(i7)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (((cz0) arrayList.get(i7)).a == 4) {
                org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.b5.L(saveToGallerySettingsActivity.getParentActivity(), org.telegram.messenger.gd.M0(2131747720, null), org.telegram.messenger.gd.M0(2131747721, null), org.telegram.messenger.gd.M0(2131751587, null), new ru0(saveToGallerySettingsActivity, 11), null).a;
                u1Var.show();
                u1Var.i();
                return;
            }
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        int i10 = saveToGallerySettingsActivity.a;
        if (i10 == 2) {
            bundle2.putInt("dialogsType", 6);
        } else if (i10 == 4) {
            bundle2.putInt("dialogsType", 5);
        } else {
            bundle2.putInt("dialogsType", 4);
        }
        bundle2.putBoolean("allowGlobalSearch", false);
        cx cxVar = new cx(bundle2);
        cxVar.E2 = new az0(saveToGallerySettingsActivity);
        saveToGallerySettingsActivity.presentFragment(cxVar);
    }

    @Override // org.telegram.ui.ww
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((org.telegram.messenger.sr) arrayList.get(0)).a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void r(float f10) {
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.rj0
    public boolean f(float f10, float f11, int i7, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((cz0) arrayList.get(i7)).a != 2) {
            return false;
        }
        org.telegram.messenger.kv kvVar = ((cz0) arrayList.get(i7)).c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, org.telegram.messenger.gd.M0(2131751269, null), false, null);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, org.telegram.messenger.gd.M0(2131751531, null), false, null);
        int i10 = org.telegram.ui.ActionBar.n6.p7;
        c11.d(org.telegram.ui.ActionBar.n6.x0(null, i10, false), org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        org.telegram.ui.ActionBar.h1 N = org.telegram.ui.Components.b5.N(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(N);
        c10.setOnClickListener(new bi.e5(saveToGallerySettingsActivity, N, i7, 20));
        c11.setOnClickListener(new y(saveToGallerySettingsActivity, N, kvVar, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
