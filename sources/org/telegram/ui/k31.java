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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k31 extends zf.b {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public k31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.s.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((l31) this.d.s.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        int i11;
        View view = n1Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((l31) arrayList.get(i10)).a == 1) {
            ((org.telegram.ui.Cells.m8) view).setNeedDivider(saveToGallerySettingsActivity.v.size() > 0);
            return;
        }
        if (((l31) arrayList.get(i10)).a == 6) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.e) {
                q8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), X.savePhoto, true);
                q8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.lj), R.drawable.msg_filled_data_photos);
                return;
            } else {
                q8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), X.saveVideo, false);
                q8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.ij), R.drawable.msg_filled_data_videos);
                return;
            }
        }
        if (((l31) arrayList.get(i10)).a != 7) {
            if (((l31) arrayList.get(i10)).a == 5) {
                ((org.telegram.ui.Cells.k4) view).setText(((l31) arrayList.get(i10)).d);
                return;
            }
            if (((l31) arrayList.get(i10)).a == 2) {
                org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
                SaveToGallerySettingsHelper.DialogException dialogException = ((l31) arrayList.get(i10)).c;
                TLObject userOrChat = saveToGallerySettingsActivity.getMessagesController().getUserOrChat(dialogException.dialogId);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                }
                saVar.setSelfAsSavedMessages(true);
                i11 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                saVar.d(userOrChat, str, dialogException.createDescription(i11), i10 == arrayList.size() - 1 || ((l31) arrayList.get(i10 + 1)).a == 2);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        if (i10 != saveToGallerySettingsActivity.h) {
            y8Var.setText(((l31) arrayList.get(i10)).d);
            return;
        }
        long j10 = saveToGallerySettingsActivity.X().limitVideo;
        if (saveToGallerySettingsActivity.c != null) {
            y8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
            return;
        }
        int i12 = saveToGallerySettingsActivity.a;
        if (i12 == 1) {
            y8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
        } else if (i12 == 4) {
            y8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
        } else if (i12 == 2) {
            y8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        TLObject chat;
        int i12;
        View view2;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view3 = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                m8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                m8Var.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                m8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view3 = m8Var;
                break;
            case 2:
                View saVar = new org.telegram.ui.Cells.sa(4, 0, viewGroup.getContext(), null, false, false);
                saVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view = saVar;
                view3 = view;
                break;
            case 3:
                view2 = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (b) null);
                view3 = view2;
                break;
            case 4:
                org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                m8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                m8Var2.e(-1, org.telegram.ui.ActionBar.g6.p7);
                m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view2 = m8Var2;
                view3 = view2;
                break;
            case 5:
                View k4Var = new org.telegram.ui.Cells.k4(viewGroup.getContext());
                k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view2 = k4Var;
                view3 = view2;
                break;
            case 6:
                View q8Var = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                q8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view2 = q8Var;
                view3 = view2;
                break;
            case 7:
                view3 = new org.telegram.ui.Cells.y8(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Components.ao0 ao0Var = new org.telegram.ui.Components.ao0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                m31 m31Var = new m31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                m31Var.setTextSize(AndroidUtilities.dp(13.0f));
                m31Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(m31Var, i7.f6.e(-2, -2, 83));
                m31 m31Var2 = new m31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                m31Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(m31Var2, i7.f6.e(-2, -2, 81));
                m31 m31Var3 = new m31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                m31Var3.setTextSize(AndroidUtilities.dp(13.0f));
                m31Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(m31Var3, i7.f6.e(-2, -2, 85));
                linearLayout.addView(frameLayout, i7.f6.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(ao0Var, i7.f6.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                ao0Var.setReportChanges(true);
                ao0Var.setDelegate(new j31(this, ao0Var, m31Var, m31Var2, m31Var3));
                ao0Var.setProgress(((float) j10) > ((float) SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) * 0.7f ? u3.c.c(j10 - SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT, 4089446400L, 0.3f, 0.7f) : ((j10 - 524288) / 104333312) * 0.7f);
                ao0Var.w.W(ao0Var.getProgress(), false);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                org.telegram.ui.Cells.ra raVar = new org.telegram.ui.Cells.ra(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.b)) {
                    i12 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                raVar.a(chat, null);
                raVar.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                view2 = raVar;
                view3 = view2;
                break;
            case 10:
                View x6Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (b) null);
                x6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.U0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.b7, saveToGallerySettingsActivity.getResourceProvider())));
                view2 = x6Var;
                view3 = view2;
                break;
        }
        return th.m(view3, view3, -1, -2);
    }
}
