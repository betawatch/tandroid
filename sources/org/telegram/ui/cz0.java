package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cz0 implements org.telegram.ui.Components.cj0, org.telegram.ui.Components.ej0, tw {
    public final /* synthetic */ SaveToGallerySettingsActivity a;

    public /* synthetic */ cz0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.tw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.tw
    public /* synthetic */ boolean N(zw zwVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.cj0
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
        if (((ez0) arrayList.get(i7)).a != 1) {
            if (((ez0) arrayList.get(i7)).a == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((ez0) arrayList.get(i7)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (((ez0) arrayList.get(i7)).a == 4) {
                org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.u4.L(saveToGallerySettingsActivity.getParentActivity(), org.telegram.messenger.id.M0(2131747913, null), org.telegram.messenger.id.M0(2131747914, null), org.telegram.messenger.id.M0(2131751598, null), new uu0(saveToGallerySettingsActivity, 11), null).a;
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
        zw zwVar = new zw(bundle2);
        zwVar.D2 = new cz0(saveToGallerySettingsActivity);
        saveToGallerySettingsActivity.presentFragment(zwVar);
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.tw
    public boolean y(zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((org.telegram.messenger.xr) arrayList.get(0)).a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override // org.telegram.ui.Components.ej0
    public /* synthetic */ void q(float f10) {
    }

    @Override // org.telegram.ui.Components.ej0
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean f(float f10, float f11, int i7, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((ez0) arrayList.get(i7)).a != 2) {
            return false;
        }
        org.telegram.messenger.qv qvVar = ((ez0) arrayList.get(i7)).c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, org.telegram.messenger.id.M0(2131751280, null), false, null);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, org.telegram.messenger.id.M0(2131751542, null), false, null);
        int i10 = org.telegram.ui.ActionBar.m6.p7;
        c11.d(org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        org.telegram.ui.ActionBar.g1 N = org.telegram.ui.Components.u4.N(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(N);
        c10.setOnClickListener(new bi.la(saveToGallerySettingsActivity, N, i7, 17));
        c11.setOnClickListener(new z(saveToGallerySettingsActivity, N, qvVar, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
