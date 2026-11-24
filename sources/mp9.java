// default package

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.SaveToGallerySettingsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mp9 implements d39, f39, wi3 {
    public final /* synthetic */ SaveToGallerySettingsActivity a;

    public /* synthetic */ mp9(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override // wi3
    public final boolean G() {
        return false;
    }

    @Override // d39
    public final void e(float f, float f2, int i, View view) {
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
        if (((op9) arrayList.get(i)).a != 1) {
            if (((op9) arrayList.get(i)).a == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((op9) arrayList.get(i)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (((op9) arrayList.get(i)).a == 4) {
                hd hdVar = ij.L(saveToGallerySettingsActivity.getParentActivity(), k96.M0(2131747720, null), k96.M0(2131747721, null), k96.M0(2131751586, null), new zk9(saveToGallerySettingsActivity, (byte) 7), null).a;
                hdVar.show();
                hdVar.h();
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
        cj3 cj3Var = new cj3(bundle2);
        cj3Var.E2 = new mp9(saveToGallerySettingsActivity);
        saveToGallerySettingsActivity.presentFragment(cj3Var);
    }

    @Override // d39
    public final boolean q(View view) {
        return false;
    }

    @Override // wi3
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((zc7) arrayList.get(0)).a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override // wi3
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override // f39
    public final void f() {
    }

    @Override // f39
    public final void g(float f) {
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
    }

    @Override // f39
    public final boolean e(float f, float f2, int i, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((op9) arrayList.get(i)).a != 2) {
            return false;
        }
        qp9 qp9Var = ((op9) arrayList.get(i)).c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
        a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, k96.M0(2131751268, null), false, null);
        a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, k96.M0(2131751530, null), false, null);
        int i2 = bkb.o7;
        c2.d(bkb.w0(null, i2, false), bkb.w0(null, i2, false));
        m8 N = ij.N(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f, f2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(N);
        c.setOnClickListener(new wg((Object) saveToGallerySettingsActivity, (Object) N, i, (byte) 14));
        c2.setOnClickListener(new hu4(saveToGallerySettingsActivity, N, qp9Var, (byte) 18));
        return true;
    }
}
