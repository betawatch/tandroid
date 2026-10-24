package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f31 implements org.telegram.ui.Components.bm0, org.telegram.ui.Components.dm0, xx {
    public final /* synthetic */ SaveToGallerySettingsActivity a;

    public /* synthetic */ f31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean J(ey eyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (i10 == saveToGallerySettingsActivity.e) {
            saveToGallerySettingsActivity.Y().savePhoto = !r11.savePhoto;
            saveToGallerySettingsActivity.Z();
            saveToGallerySettingsActivity.a0();
            return;
        }
        if (i10 == saveToGallerySettingsActivity.f) {
            saveToGallerySettingsActivity.Y().saveVideo = !r11.saveVideo;
            saveToGallerySettingsActivity.Z();
            saveToGallerySettingsActivity.a0();
            return;
        }
        if (((j31) arrayList.get(i10)).a != 1) {
            if (((j31) arrayList.get(i10)).a == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((j31) arrayList.get(i10)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (((j31) arrayList.get(i10)).a == 4) {
                org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.f5.O(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new my0(saveToGallerySettingsActivity, 11), null).a;
                c2Var.show();
                c2Var.i();
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
        ey eyVar = new ey(bundle2);
        eyVar.C2 = new f31(saveToGallerySettingsActivity);
        saveToGallerySettingsActivity.presentFragment(eyVar);
    }

    @Override // org.telegram.ui.xx
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ye1 ye1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void o(float f7) {
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean c(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((j31) arrayList.get(i10)).a != 2) {
            return false;
        }
        SaveToGallerySettingsHelper.DialogException dialogException = ((j31) arrayList.get(i10)).c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        int i11 = org.telegram.ui.ActionBar.k6.p7;
        c11.d(org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        org.telegram.ui.ActionBar.m1 Q = org.telegram.ui.Components.f5.Q(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(Q);
        c10.setOnClickListener(new ai.ia(saveToGallerySettingsActivity, Q, i10, 16));
        c11.setOnClickListener(new z(saveToGallerySettingsActivity, Q, dialogException, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
