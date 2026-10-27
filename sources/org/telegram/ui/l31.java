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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l31 extends qg.b {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public l31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.s.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((m31) this.d.s.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        int i11;
        View view = e1Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((m31) arrayList.get(i10)).a == 1) {
            ((org.telegram.ui.Cells.v8) view).setNeedDivider(saveToGallerySettingsActivity.v.size() > 0);
            return;
        }
        if (((m31) arrayList.get(i10)).a == 6) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            SaveToGallerySettingsHelper.Settings Z = saveToGallerySettingsActivity.Z();
            if (i10 == saveToGallerySettingsActivity.e) {
                a9Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), Z.savePhoto, true);
                int i12 = org.telegram.ui.ActionBar.y6.lj;
                a9Var.c(saveToGallerySettingsActivity.getThemedColor(i12), R.drawable.msg_filled_data_photos);
                SaveToGallerySettingsActivity.X(saveToGallerySettingsActivity, a9Var, i12);
                return;
            }
            a9Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), Z.saveVideo, false);
            int i13 = org.telegram.ui.ActionBar.y6.ij;
            a9Var.c(saveToGallerySettingsActivity.getThemedColor(i13), R.drawable.msg_filled_data_videos);
            SaveToGallerySettingsActivity.X(saveToGallerySettingsActivity, a9Var, i13);
            return;
        }
        if (((m31) arrayList.get(i10)).a != 7) {
            if (((m31) arrayList.get(i10)).a == 5) {
                ((org.telegram.ui.Cells.q4) view).setText(((m31) arrayList.get(i10)).d);
                return;
            }
            if (((m31) arrayList.get(i10)).a == 2) {
                org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                SaveToGallerySettingsHelper.DialogException dialogException = ((m31) arrayList.get(i10)).c;
                TLObject userOrChat = saveToGallerySettingsActivity.getMessagesController().getUserOrChat(dialogException.dialogId);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                }
                abVar.setSelfAsSavedMessages(true);
                i11 = ((org.telegram.ui.ActionBar.r2) saveToGallerySettingsActivity).currentAccount;
                abVar.d(userOrChat, str, dialogException.createDescription(i11), i10 == arrayList.size() - 1 || ((m31) arrayList.get(i10 + 1)).a == 2);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
        if (i10 != saveToGallerySettingsActivity.h) {
            i9Var.setText(((m31) arrayList.get(i10)).d);
            return;
        }
        long j10 = saveToGallerySettingsActivity.Z().limitVideo;
        if (saveToGallerySettingsActivity.c != null) {
            i9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
            return;
        }
        int i14 = saveToGallerySettingsActivity.a;
        if (i14 == 1) {
            i9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
        } else if (i14 == 4) {
            i9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
        } else if (i14 == 2) {
            i9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        TLObject chat;
        int i12;
        View view2;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view3 = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(viewGroup.getContext());
                v8Var.o(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                v8Var.g(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, v8Var, null);
                view3 = v8Var;
                break;
            case 2:
                View abVar = new org.telegram.ui.Cells.ab(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, abVar, null);
                view = abVar;
                view3 = view;
                break;
            case 3:
                view2 = new org.telegram.ui.Cells.f7(viewGroup.getContext(), (d3) null);
                view3 = view2;
                break;
            case 4:
                org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(viewGroup.getContext());
                v8Var2.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                v8Var2.g(-1, org.telegram.ui.ActionBar.y6.p7);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, v8Var2, null);
                view2 = v8Var2;
                view3 = view2;
                break;
            case 5:
                View q4Var = new org.telegram.ui.Cells.q4(viewGroup.getContext());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, null);
                view2 = q4Var;
                view3 = view2;
                break;
            case 6:
                View a9Var = new org.telegram.ui.Cells.a9(viewGroup.getContext());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, a9Var, null);
                view2 = a9Var;
                view3 = view2;
                break;
            case 7:
                view3 = new org.telegram.ui.Cells.i9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Components.mp0 mp0Var = new org.telegram.ui.Components.mp0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                n31 n31Var = new n31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                n31Var.setTextSize(AndroidUtilities.dp(13.0f));
                n31Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(n31Var, org.telegram.ui.Components.kb1.i(-2, -2, 83));
                n31 n31Var2 = new n31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                n31Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(n31Var2, org.telegram.ui.Components.kb1.i(-2, -2, 81));
                n31 n31Var3 = new n31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                n31Var3.setTextSize(AndroidUtilities.dp(13.0f));
                n31Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(n31Var3, org.telegram.ui.Components.kb1.i(-2, -2, 85));
                linearLayout.addView(frameLayout, org.telegram.ui.Components.kb1.x(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(mp0Var, org.telegram.ui.Components.kb1.x(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.Z().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                mp0Var.setReportChanges(true);
                mp0Var.setDelegate(new k31(this, mp0Var, n31Var, n31Var2, n31Var3));
                mp0Var.setProgress(((float) j10) > ((float) SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) * 0.7f ? a1.g.c(j10 - SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT, 4089446400L, 0.3f, 0.7f) : ((j10 - 524288) / 104333312) * 0.7f);
                mp0Var.x.U(mp0Var.getProgress(), false);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, linearLayout, null);
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                org.telegram.ui.Cells.za zaVar = new org.telegram.ui.Cells.za(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.b)) {
                    i12 = ((org.telegram.ui.ActionBar.r2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.r2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                zaVar.a(chat, null);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, zaVar, saveToGallerySettingsActivity.getResourceProvider());
                view2 = zaVar;
                view3 = view2;
                break;
            case 10:
                view2 = new org.telegram.ui.Cells.f7(viewGroup.getContext(), (d3) null);
                view3 = view2;
                break;
        }
        return ic.a.n(view3, view3, -1, -2);
    }
}
