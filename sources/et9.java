// default package

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.SaveToGallerySettingsActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class et9 implements s69, u69, oj3 {
    public final /* synthetic */ SaveToGallerySettingsActivity a;

    public /* synthetic */ et9(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // oj3
    public final boolean E() {
        return false;
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (i == saveToGallerySettingsActivity.e) {
            saveToGallerySettingsActivity.b0().a = !r9.a;
            saveToGallerySettingsActivity.c0();
            saveToGallerySettingsActivity.d0();
            return;
        }
        if (i == saveToGallerySettingsActivity.f) {
            saveToGallerySettingsActivity.b0().b = !r9.b;
            saveToGallerySettingsActivity.c0();
            saveToGallerySettingsActivity.d0();
            return;
        }
        if (((gt9) arrayList.get(i)).a != 1) {
            if (((gt9) arrayList.get(i)).a == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((gt9) arrayList.get(i)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (((gt9) arrayList.get(i)).a == 4) {
                id idVar = jj.L(saveToGallerySettingsActivity.getParentActivity(), ob6.M0(2131747640, null), ob6.M0(2131747641, null), ob6.M0(2131751563, null), new v59(saveToGallerySettingsActivity, (byte) 23), null).a;
                idVar.show();
                idVar.h();
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
        uj3 uj3Var = new uj3(bundle2);
        uj3Var.E2 = new et9(saveToGallerySettingsActivity);
        saveToGallerySettingsActivity.presentFragment(uj3Var);
    }

    @Override // oj3
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((if7) arrayList.get(0)).a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override // oj3
    public final boolean s(uj3 uj3Var) {
        return false;
    }

    @Override // u69
    public final void f() {
    }

    @Override // u69
    public final void h(float f) {
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }

    @Override // u69
    public final boolean d(float f, float f2, int i, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((gt9) arrayList.get(i)).a != 2) {
            return false;
        }
        it9 it9Var = ((gt9) arrayList.get(i)).c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
        b8 c = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, ob6.M0(2131751245, null), false, null);
        b8 c2 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, ob6.M0(2131751507, null), false, null);
        int i2 = aob.p7;
        c2.d(aob.w0(null, i2, false), aob.w0(null, i2, false));
        n8 N = jj.N(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f, f2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(N);
        c.setOnClickListener(new ae((Object) saveToGallerySettingsActivity, (Object) N, i, (byte) 14));
        c2.setOnClickListener(new lw4(saveToGallerySettingsActivity, N, it9Var, (byte) 19));
        return true;
    }
}
