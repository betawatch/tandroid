package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy0 implements org.telegram.ui.Components.gj0, org.telegram.ui.Components.ij0, nw {
    public final /* synthetic */ SaveToGallerySettingsActivity a;

    public /* synthetic */ oy0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(uw uwVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (i3 == saveToGallerySettingsActivity.e) {
            saveToGallerySettingsActivity.c0().a = !r11.a;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
            return;
        }
        if (i3 == saveToGallerySettingsActivity.f) {
            saveToGallerySettingsActivity.c0().b = !r11.b;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
            return;
        }
        if (((qy0) arrayList.get(i3)).a != 1) {
            if (((qy0) arrayList.get(i3)).a == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((qy0) arrayList.get(i3)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (((qy0) arrayList.get(i3)).a == 4) {
                org.telegram.ui.ActionBar.s1 s1Var = org.telegram.ui.Components.t4.N(saveToGallerySettingsActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131747921, null), org.telegram.messenger.bd.M0(2131747922, null), org.telegram.messenger.bd.M0(2131751599, null), new pu0(saveToGallerySettingsActivity, 10), null).a;
                s1Var.show();
                s1Var.i();
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
        uw uwVar = new uw(bundle2);
        uwVar.D2 = new oy0(saveToGallerySettingsActivity);
        saveToGallerySettingsActivity.presentFragment(uwVar);
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.nw
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((org.telegram.messenger.pr) arrayList.get(0)).a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override // org.telegram.ui.Components.ij0
    public /* synthetic */ void r(float f10) {
    }

    @Override // org.telegram.ui.Components.ij0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(float f10, float f11, int i3, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((qy0) arrayList.get(i3)).a != 2) {
            return false;
        }
        org.telegram.messenger.iv ivVar = ((qy0) arrayList.get(i3)).c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
        org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, org.telegram.messenger.bd.M0(2131751281, null), false, null);
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751543, null), false, null);
        int i10 = org.telegram.ui.ActionBar.k6.p7;
        c10.d(org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        org.telegram.ui.ActionBar.f1 P = org.telegram.ui.Components.t4.P(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(P);
        c2.setOnClickListener(new ai.h3(saveToGallerySettingsActivity, P, i3, 19));
        c10.setOnClickListener(new a0(saveToGallerySettingsActivity, P, ivVar, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
