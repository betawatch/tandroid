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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d31 implements org.telegram.ui.Components.xl0, org.telegram.ui.Components.zl0, xx {
    public final /* synthetic */ SaveToGallerySettingsActivity a;

    public /* synthetic */ d31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean K(ey eyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (i10 == saveToGallerySettingsActivity.e) {
            saveToGallerySettingsActivity.X().savePhoto = !r11.savePhoto;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
            return;
        }
        if (i10 == saveToGallerySettingsActivity.f) {
            saveToGallerySettingsActivity.X().saveVideo = !r11.saveVideo;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
            return;
        }
        if (((g31) arrayList.get(i10)).a != 1) {
            if (((g31) arrayList.get(i10)).a == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((g31) arrayList.get(i10)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (((g31) arrayList.get(i10)).a == 4) {
                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.f5.N(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new sy0(saveToGallerySettingsActivity, 10), null).a;
                b2Var.show();
                b2Var.h();
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
        eyVar.C2 = new d31(saveToGallerySettingsActivity);
        saveToGallerySettingsActivity.presentFragment(eyVar);
    }

    @Override // org.telegram.ui.xx
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override // org.telegram.ui.Components.zl0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.zl0
    public /* synthetic */ void o(float f7) {
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean d(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((g31) arrayList.get(i10)).a != 2) {
            return false;
        }
        SaveToGallerySettingsHelper.DialogException dialogException = ((g31) arrayList.get(i10)).c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        int i11 = org.telegram.ui.ActionBar.h6.p7;
        c11.c(org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        org.telegram.ui.ActionBar.m1 P = org.telegram.ui.Components.f5.P(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(P);
        c10.setOnClickListener(new ai.ha(saveToGallerySettingsActivity, P, i10, 16));
        c11.setOnClickListener(new a0(saveToGallerySettingsActivity, P, dialogException, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
