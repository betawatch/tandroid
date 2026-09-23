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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class f41 implements org.telegram.ui.Components.bl0, org.telegram.ui.Components.dl0, ly {
    public final /* synthetic */ SaveToGallerySettingsActivity a;

    public /* synthetic */ f41(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.ly
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ly
    public /* synthetic */ boolean K(ry ryVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
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
        if (((i41) arrayList.get(i10)).a != 1) {
            if (((i41) arrayList.get(i10)).a == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((i41) arrayList.get(i10)).c.dialogId);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (((i41) arrayList.get(i10)).a == 4) {
                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new xz0(saveToGallerySettingsActivity, 9), null).a;
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
        ry ryVar = new ry(bundle2);
        ryVar.C2 = new f41(saveToGallerySettingsActivity);
        saveToGallerySettingsActivity.presentFragment(ryVar);
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ly
    public boolean u(ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override // org.telegram.ui.Components.dl0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.dl0
    public /* synthetic */ void q(float f7) {
    }

    @Override // org.telegram.ui.Components.dl0
    public boolean c(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((i41) arrayList.get(i10)).a != 2) {
            return false;
        }
        SaveToGallerySettingsHelper.DialogException dialogException = ((i41) arrayList.get(i10)).c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        int i11 = org.telegram.ui.ActionBar.h6.p7;
        c11.c(org.telegram.ui.ActionBar.h6.w0(null, i11, false), org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        org.telegram.ui.ActionBar.n1 Q = org.telegram.ui.Components.e5.Q(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(Q);
        c10.setOnClickListener(new org.telegram.ui.Cells.wa(saveToGallerySettingsActivity, Q, i10, 14));
        c11.setOnClickListener(new a0(saveToGallerySettingsActivity, Q, dialogException, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
