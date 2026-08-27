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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j31 extends xf.b {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public j31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.s.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return ((k31) this.d.s.get(i10)).a;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        String str;
        int i11;
        View view = o1Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((k31) arrayList.get(i10)).a == 1) {
            ((org.telegram.ui.Cells.l8) view).setNeedDivider(saveToGallerySettingsActivity.v.size() > 0);
            return;
        }
        if (((k31) arrayList.get(i10)).a == 6) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.e) {
                p8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), X.savePhoto, true);
                p8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.lj), R.drawable.msg_filled_data_photos);
                return;
            } else {
                p8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), X.saveVideo, false);
                p8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.ij), R.drawable.msg_filled_data_videos);
                return;
            }
        }
        if (((k31) arrayList.get(i10)).a != 7) {
            if (((k31) arrayList.get(i10)).a == 5) {
                ((org.telegram.ui.Cells.j4) view).setText(((k31) arrayList.get(i10)).d);
                return;
            }
            if (((k31) arrayList.get(i10)).a == 2) {
                org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
                SaveToGallerySettingsHelper.DialogException dialogException = ((k31) arrayList.get(i10)).c;
                TLObject userOrChat = saveToGallerySettingsActivity.getMessagesController().getUserOrChat(dialogException.dialogId);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                }
                saVar.setSelfAsSavedMessages(true);
                i11 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
                saVar.e(userOrChat, str, dialogException.createDescription(i11), i10 == arrayList.size() - 1 || ((k31) arrayList.get(i10 + 1)).a == 2);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        if (i10 != saveToGallerySettingsActivity.h) {
            x8Var.setText(((k31) arrayList.get(i10)).d);
            return;
        }
        long j10 = saveToGallerySettingsActivity.X().limitVideo;
        if (saveToGallerySettingsActivity.c != null) {
            x8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
            return;
        }
        int i12 = saveToGallerySettingsActivity.a;
        if (i12 == 1) {
            x8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
        } else if (i12 == 4) {
            x8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
        } else if (i12 == 2) {
            x8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        TLObject chat;
        int i12;
        View view2;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view3 = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                l8Var.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                l8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view3 = l8Var;
                break;
            case 2:
                View saVar = new org.telegram.ui.Cells.sa(4, 0, viewGroup.getContext(), null, false, false);
                saVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view = saVar;
                view3 = view;
                break;
            case 3:
                view2 = new org.telegram.ui.Cells.w6(viewGroup.getContext(), (org.telegram.messenger.rl) null);
                view3 = view2;
                break;
            case 4:
                org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                l8Var2.e(-1, org.telegram.ui.ActionBar.g6.p7);
                l8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view2 = l8Var2;
                view3 = view2;
                break;
            case 5:
                View j4Var = new org.telegram.ui.Cells.j4(viewGroup.getContext());
                j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view2 = j4Var;
                view3 = view2;
                break;
            case 6:
                View p8Var = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                p8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view2 = p8Var;
                view3 = view2;
                break;
            case 7:
                view3 = new org.telegram.ui.Cells.x8(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Components.qn0 qn0Var = new org.telegram.ui.Components.qn0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                l31 l31Var = new l31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                l31Var.setTextSize(AndroidUtilities.dp(13.0f));
                l31Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(l31Var, h7.z5.e(-2, -2, 83));
                l31 l31Var2 = new l31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                l31Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(l31Var2, h7.z5.e(-2, -2, 81));
                l31 l31Var3 = new l31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                l31Var3.setTextSize(AndroidUtilities.dp(13.0f));
                l31Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(l31Var3, h7.z5.e(-2, -2, 85));
                linearLayout.addView(frameLayout, h7.z5.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(qn0Var, h7.z5.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                qn0Var.setReportChanges(true);
                qn0Var.setDelegate(new i31(this, qn0Var, l31Var, l31Var2, l31Var3));
                qn0Var.setProgress(((float) j10) > ((float) SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) * 0.7f ? s3.c.c(j10 - SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT, 4089446400L, 0.3f, 0.7f) : ((j10 - 524288) / 104333312) * 0.7f);
                qn0Var.w.P(qn0Var.getProgress(), false);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                org.telegram.ui.Cells.ra raVar = new org.telegram.ui.Cells.ra(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.b)) {
                    i12 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                raVar.a(chat, null);
                raVar.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                view2 = raVar;
                view3 = view2;
                break;
            case 10:
                View w6Var = new org.telegram.ui.Cells.w6(viewGroup.getContext(), (org.telegram.messenger.rl) null);
                w6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.U0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.b7, saveToGallerySettingsActivity.getResourceProvider())));
                view2 = w6Var;
                view3 = view2;
                break;
        }
        return org.telegram.ui.Cells.pa.l(view3, view3, -1, -2);
    }
}
