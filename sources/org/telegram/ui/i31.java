package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class i31 extends pg.b {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public i31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.s.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((j31) this.d.s.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        int i11;
        View view = b1Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((j31) arrayList.get(i10)).a == 1) {
            ((org.telegram.ui.Cells.r8) view).setNeedDivider(saveToGallerySettingsActivity.v.size() > 0);
            return;
        }
        if (((j31) arrayList.get(i10)).a == 6) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            SaveToGallerySettingsHelper.Settings Y = saveToGallerySettingsActivity.Y();
            if (i10 == saveToGallerySettingsActivity.e) {
                w8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), Y.savePhoto, true);
                int i12 = org.telegram.ui.ActionBar.k6.lj;
                w8Var.c(saveToGallerySettingsActivity.getThemedColor(i12), R.drawable.msg_filled_data_photos);
                SaveToGallerySettingsActivity.W(saveToGallerySettingsActivity, w8Var, i12);
                return;
            }
            w8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), Y.saveVideo, false);
            int i13 = org.telegram.ui.ActionBar.k6.ij;
            w8Var.c(saveToGallerySettingsActivity.getThemedColor(i13), R.drawable.msg_filled_data_videos);
            SaveToGallerySettingsActivity.W(saveToGallerySettingsActivity, w8Var, i13);
            return;
        }
        if (((j31) arrayList.get(i10)).a != 7) {
            if (((j31) arrayList.get(i10)).a == 5) {
                ((org.telegram.ui.Cells.l4) view).setText(((j31) arrayList.get(i10)).d);
                return;
            }
            if (((j31) arrayList.get(i10)).a == 2) {
                org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
                SaveToGallerySettingsHelper.DialogException dialogException = ((j31) arrayList.get(i10)).c;
                TLObject userOrChat = saveToGallerySettingsActivity.getMessagesController().getUserOrChat(dialogException.dialogId);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                }
                waVar.setSelfAsSavedMessages(true);
                i11 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                waVar.d(userOrChat, str, dialogException.createDescription(i11), i10 == arrayList.size() - 1 || ((j31) arrayList.get(i10 + 1)).a == 2);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        if (i10 != saveToGallerySettingsActivity.h) {
            e9Var.setText(((j31) arrayList.get(i10)).d);
            return;
        }
        long j10 = saveToGallerySettingsActivity.Y().limitVideo;
        if (saveToGallerySettingsActivity.c != null) {
            e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
            return;
        }
        int i14 = saveToGallerySettingsActivity.a;
        if (i14 == 1) {
            e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
        } else if (i14 == 4) {
            e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
        } else if (i14 == 2) {
            e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        TLObject chat;
        int i12;
        View view2;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view3 = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var.o(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                r8Var.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, r8Var, null);
                view3 = r8Var;
                break;
            case 2:
                View waVar = new org.telegram.ui.Cells.wa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, waVar, null);
                view = waVar;
                view3 = view;
                break;
            case 3:
                view2 = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.b1) null);
                view3 = view2;
                break;
            case 4:
                org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var2.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                r8Var2.g(-1, org.telegram.ui.ActionBar.k6.p7);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, r8Var2, null);
                view2 = r8Var2;
                view3 = view2;
                break;
            case 5:
                View l4Var = new org.telegram.ui.Cells.l4(viewGroup.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, null);
                view2 = l4Var;
                view3 = view2;
                break;
            case 6:
                View w8Var = new org.telegram.ui.Cells.w8(viewGroup.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, w8Var, null);
                view2 = w8Var;
                view3 = view2;
                break;
            case 7:
                view3 = new org.telegram.ui.Cells.e9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Components.hp0 hp0Var = new org.telegram.ui.Components.hp0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                k31 k31Var = new k31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                k31Var.setTextSize(AndroidUtilities.dp(13.0f));
                k31Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(k31Var, w7.z5.e(-2, -2, 83));
                k31 k31Var2 = new k31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                k31Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(k31Var2, w7.z5.e(-2, -2, 81));
                k31 k31Var3 = new k31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                k31Var3.setTextSize(AndroidUtilities.dp(13.0f));
                k31Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(k31Var3, w7.z5.e(-2, -2, 85));
                linearLayout.addView(frameLayout, w7.z5.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(hp0Var, w7.z5.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.Y().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                hp0Var.setReportChanges(true);
                hp0Var.setDelegate(new h31(this, hp0Var, k31Var, k31Var2, k31Var3));
                hp0Var.setProgress(((float) j10) > ((float) SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) * 0.7f ? a1.g.d(j10 - SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT, 4089446400L, 0.3f, 0.7f) : ((j10 - 524288) / 104333312) * 0.7f);
                hp0Var.x.L(hp0Var.getProgress(), false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, linearLayout, null);
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.b)) {
                    i12 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                vaVar.a(chat, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, vaVar, saveToGallerySettingsActivity.getResourceProvider());
                view2 = vaVar;
                view3 = view2;
                break;
            case 10:
                View b7Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.b1) null);
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7, saveToGallerySettingsActivity.getParentActivity(), b7Var, saveToGallerySettingsActivity.getResourceProvider());
                view2 = b7Var;
                view3 = view2;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view3, view3, -1, -2);
    }
}
