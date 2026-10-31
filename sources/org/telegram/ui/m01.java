package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m01 implements org.telegram.ui.Components.hk0, org.telegram.ui.Components.jk0, ux {
    public final /* synthetic */ SaveToGallerySettingsActivity a;

    public /* synthetic */ m01(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean N(ay ayVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (i10 == saveToGallerySettingsActivity.e) {
            saveToGallerySettingsActivity.b0().a = !r11.a;
            saveToGallerySettingsActivity.c0();
            saveToGallerySettingsActivity.d0();
            return;
        }
        if (i10 == saveToGallerySettingsActivity.f) {
            saveToGallerySettingsActivity.b0().b = !r11.b;
            saveToGallerySettingsActivity.c0();
            saveToGallerySettingsActivity.d0();
            return;
        }
        if (((o01) arrayList.get(i10)).a != 1) {
            if (((o01) arrayList.get(i10)).a == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((o01) arrayList.get(i10)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (((o01) arrayList.get(i10)).a == 4) {
                org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.N(saveToGallerySettingsActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131747929, null), org.telegram.messenger.cd.L0(2131747930, null), org.telegram.messenger.cd.L0(2131751599, null), new wv0(saveToGallerySettingsActivity, 13), null).a;
                x1Var.show();
                x1Var.i();
                return;
            }
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        int i11 = saveToGallerySettingsActivity.a;
        if (i11 == 2) {
            bundle2.putInt("dialogsType", 6);
        } else if (i11 == 4) {
            bundle2.putInt("dialogsType", 5);
        } else {
            bundle2.putInt("dialogsType", 4);
        }
        bundle2.putBoolean("allowGlobalSearch", false);
        ay ayVar = new ay(bundle2);
        ayVar.C2 = new m01(saveToGallerySettingsActivity);
        saveToGallerySettingsActivity.presentFragment(ayVar);
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ux
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((org.telegram.messenger.gs) arrayList.get(0)).a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override // org.telegram.ui.Components.jk0
    public /* synthetic */ void p(float f7) {
    }

    @Override // org.telegram.ui.Components.jk0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean b(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((o01) arrayList.get(i10)).a != 2) {
            return false;
        }
        org.telegram.messenger.bw bwVar = ((o01) arrayList.get(i10)).c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, org.telegram.messenger.cd.L0(2131751281, null), false, null);
        org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751543, null), false, null);
        int i11 = org.telegram.ui.ActionBar.t6.p7;
        c11.d(org.telegram.ui.ActionBar.t6.x0(null, i11, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        org.telegram.ui.ActionBar.k1 P = org.telegram.ui.Components.s4.P(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(P);
        c10.setOnClickListener(new jg.w1(saveToGallerySettingsActivity, P, i10, 17));
        c11.setOnClickListener(new x(saveToGallerySettingsActivity, P, bwVar, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
