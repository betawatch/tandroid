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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j31 implements org.telegram.ui.Components.bm0, org.telegram.ui.Components.dm0, xx {
    public final /* synthetic */ SaveToGallerySettingsActivity a;

    public /* synthetic */ j31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean K(ey eyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (i10 == saveToGallerySettingsActivity.e) {
            saveToGallerySettingsActivity.Z().savePhoto = !r11.savePhoto;
            saveToGallerySettingsActivity.a0();
            saveToGallerySettingsActivity.b0();
            return;
        }
        if (i10 == saveToGallerySettingsActivity.f) {
            saveToGallerySettingsActivity.Z().saveVideo = !r11.saveVideo;
            saveToGallerySettingsActivity.a0();
            saveToGallerySettingsActivity.b0();
            return;
        }
        if (((m31) arrayList.get(i10)).a != 1) {
            if (((m31) arrayList.get(i10)).a == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((m31) arrayList.get(i10)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (((m31) arrayList.get(i10)).a == 4) {
                org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.N(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new oy0(saveToGallerySettingsActivity, 12), null).a;
                e2Var.show();
                e2Var.i();
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
        eyVar.C2 = new j31(saveToGallerySettingsActivity);
        saveToGallerySettingsActivity.presentFragment(eyVar);
    }

    @Override // org.telegram.ui.xx
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void o(float f7) {
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean e(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((m31) arrayList.get(i10)).a != 2) {
            return false;
        }
        SaveToGallerySettingsHelper.DialogException dialogException = ((m31) arrayList.get(i10)).c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        int i11 = org.telegram.ui.ActionBar.y6.p7;
        c11.d(org.telegram.ui.ActionBar.y6.x0(null, i11, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        org.telegram.ui.ActionBar.o1 P = org.telegram.ui.Components.g5.P(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(P);
        c10.setOnClickListener(new bi.pa(saveToGallerySettingsActivity, P, i10, 17));
        c11.setOnClickListener(new z(saveToGallerySettingsActivity, P, dialogException, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
