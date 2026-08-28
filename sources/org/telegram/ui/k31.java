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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k31 extends wf.b {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public k31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 1 || i9 == 2 || i9 == 4 || i9 == 6;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.s.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((l31) this.d.s.get(i9)).a;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        int i10;
        View view = q1Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((l31) arrayList.get(i9)).a == 1) {
            ((org.telegram.ui.Cells.p8) view).setNeedDivider(saveToGallerySettingsActivity.v.size() > 0);
            return;
        }
        if (((l31) arrayList.get(i9)).a == 6) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            SaveToGallerySettingsHelper.Settings W = saveToGallerySettingsActivity.W();
            if (i9 == saveToGallerySettingsActivity.e) {
                t8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), W.savePhoto, true);
                t8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.lj), R.drawable.msg_filled_data_photos);
                return;
            } else {
                t8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), W.saveVideo, false);
                t8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.ij), R.drawable.msg_filled_data_videos);
                return;
            }
        }
        if (((l31) arrayList.get(i9)).a != 7) {
            if (((l31) arrayList.get(i9)).a == 5) {
                ((org.telegram.ui.Cells.m4) view).setText(((l31) arrayList.get(i9)).d);
                return;
            }
            if (((l31) arrayList.get(i9)).a == 2) {
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                SaveToGallerySettingsHelper.DialogException dialogException = ((l31) arrayList.get(i9)).c;
                TLObject userOrChat = saveToGallerySettingsActivity.getMessagesController().getUserOrChat(dialogException.dialogId);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                }
                vaVar.setSelfAsSavedMessages(true);
                i10 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                vaVar.e(userOrChat, str, dialogException.createDescription(i10), i9 == arrayList.size() - 1 || ((l31) arrayList.get(i9 + 1)).a == 2);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
        if (i9 != saveToGallerySettingsActivity.h) {
            b9Var.setText(((l31) arrayList.get(i9)).d);
            return;
        }
        long j10 = saveToGallerySettingsActivity.W().limitVideo;
        if (saveToGallerySettingsActivity.c != null) {
            b9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
            return;
        }
        int i11 = saveToGallerySettingsActivity.a;
        if (i11 == 1) {
            b9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
        } else if (i11 == 4) {
            b9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
        } else if (i11 == 2) {
            b9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        int i10;
        TLObject chat;
        int i11;
        View view2;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view3 = null;
        switch (i9) {
            case 1:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                p8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                p8Var.e(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
                p8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view3 = p8Var;
                break;
            case 2:
                View vaVar = new org.telegram.ui.Cells.va(4, 0, viewGroup.getContext(), null, false, false);
                vaVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view = vaVar;
                view3 = view;
                break;
            case 3:
                view2 = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.j2) null);
                view3 = view2;
                break;
            case 4:
                org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                p8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                p8Var2.e(-1, org.telegram.ui.ActionBar.f6.p7);
                p8Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view2 = p8Var2;
                view3 = view2;
                break;
            case 5:
                View m4Var = new org.telegram.ui.Cells.m4(viewGroup.getContext());
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view2 = m4Var;
                view3 = view2;
                break;
            case 6:
                View t8Var = new org.telegram.ui.Cells.t8(viewGroup.getContext());
                t8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view2 = t8Var;
                view3 = view2;
                break;
            case 7:
                view3 = new org.telegram.ui.Cells.b9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Components.pn0 pn0Var = new org.telegram.ui.Components.pn0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                m31 m31Var = new m31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                m31Var.setTextSize(AndroidUtilities.dp(13.0f));
                m31Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(m31Var, g7.e6.e(-2, -2, 83));
                m31 m31Var2 = new m31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                m31Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(m31Var2, g7.e6.e(-2, -2, 81));
                m31 m31Var3 = new m31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                m31Var3.setTextSize(AndroidUtilities.dp(13.0f));
                m31Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(m31Var3, g7.e6.e(-2, -2, 85));
                linearLayout.addView(frameLayout, g7.e6.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(pn0Var, g7.e6.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.W().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                pn0Var.setReportChanges(true);
                pn0Var.setDelegate(new j31(this, pn0Var, m31Var, m31Var2, m31Var3));
                pn0Var.setProgress(((float) j10) > ((float) SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) * 0.7f ? org.telegram.ui.Cells.j2.b(j10 - SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT, 4089446400L, 0.3f, 0.7f) : ((j10 - 524288) / 104333312) * 0.7f);
                pn0Var.w.Q(pn0Var.getProgress(), false);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                org.telegram.ui.Cells.ua uaVar = new org.telegram.ui.Cells.ua(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.b)) {
                    i11 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getUser(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                uaVar.a(chat, null);
                uaVar.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                view2 = uaVar;
                view3 = view2;
                break;
            case 10:
                View z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.j2) null);
                z6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.U0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.b7, saveToGallerySettingsActivity.getResourceProvider())));
                view2 = z6Var;
                view3 = view2;
                break;
        }
        return j3.r0.s(view3, view3, -1, -2);
    }
}
