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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i31 implements org.telegram.ui.Components.nk0, org.telegram.ui.Components.pk0, wx {
    public final /* synthetic */ SaveToGallerySettingsActivity a;

    public /* synthetic */ i31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(dy dyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (i9 == saveToGallerySettingsActivity.e) {
            saveToGallerySettingsActivity.W().savePhoto = !r11.savePhoto;
            saveToGallerySettingsActivity.X();
            saveToGallerySettingsActivity.Y();
            return;
        }
        if (i9 == saveToGallerySettingsActivity.f) {
            saveToGallerySettingsActivity.W().saveVideo = !r11.saveVideo;
            saveToGallerySettingsActivity.X();
            saveToGallerySettingsActivity.Y();
            return;
        }
        if (((l31) arrayList.get(i9)).a != 1) {
            if (((l31) arrayList.get(i9)).a == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((l31) arrayList.get(i9)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (((l31) arrayList.get(i9)).a == 4) {
                org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.y4.O(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ky0(saveToGallerySettingsActivity, 11), null).a;
                c2Var.show();
                c2Var.h();
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
        dy dyVar = new dy(bundle2);
        dyVar.y2 = new i31(saveToGallerySettingsActivity);
        saveToGallerySettingsActivity.presentFragment(dyVar);
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.wx
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void u(float f10) {
    }

    @Override // org.telegram.ui.Components.pk0
    public boolean c(float f10, float f11, int i9, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((l31) arrayList.get(i9)).a != 2) {
            return false;
        }
        SaveToGallerySettingsHelper.DialogException dialogException = ((l31) arrayList.get(i9)).c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        int i10 = org.telegram.ui.ActionBar.f6.p7;
        c11.c(org.telegram.ui.ActionBar.f6.w0(null, i10, false), org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        org.telegram.ui.ActionBar.o1 Q = org.telegram.ui.Components.y4.Q(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(Q);
        c10.setOnClickListener(new fh.a3(saveToGallerySettingsActivity, Q, i9, 17));
        c11.setOnClickListener(new b0(saveToGallerySettingsActivity, Q, dialogException, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
