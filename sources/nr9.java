// default package

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.SaveToGallerySettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nr9 implements g59, i59, hk3 {
    public final /* synthetic */ SaveToGallerySettingsActivity a;

    public /* synthetic */ nr9(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override // hk3
    public final boolean E() {
        return false;
    }

    @Override // g59
    public final void d(float f, float f2, int i, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (i == saveToGallerySettingsActivity.e) {
            saveToGallerySettingsActivity.c0().a = !r9.a;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
            return;
        }
        if (i == saveToGallerySettingsActivity.f) {
            saveToGallerySettingsActivity.c0().b = !r9.b;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
            return;
        }
        if (((pr9) arrayList.get(i)).a != 1) {
            if (((pr9) arrayList.get(i)).a == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((pr9) arrayList.get(i)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (((pr9) arrayList.get(i)).a == 4) {
                he heVar = ik.L(saveToGallerySettingsActivity.getParentActivity(), jb6.M0(2131747646, null), jb6.M0(2131747647, null), jb6.M0(2131751535, null), new kf9(saveToGallerySettingsActivity, (byte) 15), null).a;
                heVar.show();
                heVar.h();
                return;
            }
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        int i2 = saveToGallerySettingsActivity.a;
        if (i2 == 2) {
            bundle2.putInt("dialogsType", 6);
        } else if (i2 == 4) {
            bundle2.putInt("dialogsType", 5);
        } else {
            bundle2.putInt("dialogsType", 4);
        }
        bundle2.putBoolean("allowGlobalSearch", false);
        nk3 nk3Var = new nk3(bundle2);
        nk3Var.E2 = new nr9(saveToGallerySettingsActivity);
        saveToGallerySettingsActivity.presentFragment(nk3Var);
    }

    @Override // hk3
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((bf7) arrayList.get(0)).a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override // hk3
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    @Override // i59
    public final void i() {
    }

    @Override // i59
    public final void k(float f) {
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }

    @Override // i59
    public final boolean d(float f, float f2, int i, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((pr9) arrayList.get(i)).a != 2) {
            return false;
        }
        rr9 rr9Var = ((pr9) arrayList.get(i)).c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
        a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, jb6.M0(2131751217, null), false, null);
        a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, jb6.M0(2131751479, null), false, null);
        int i2 = cmb.o7;
        c2.d(cmb.w0(null, i2, false), cmb.w0(null, i2, false));
        m8 N = ik.N(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f, f2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(N);
        c.setOnClickListener(new wh((Object) saveToGallerySettingsActivity, (Object) N, i, (byte) 14));
        c2.setOnClickListener(new jw4(saveToGallerySettingsActivity, N, rr9Var, (byte) 18));
        return true;
    }
}
