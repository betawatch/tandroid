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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class f31 extends pg.b {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public f31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.Components.hm0
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
        return ((g31) this.d.s.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        int i11;
        View view = b1Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((g31) arrayList.get(i10)).a == 1) {
            ((org.telegram.ui.Cells.q8) view).setNeedDivider(saveToGallerySettingsActivity.v.size() > 0);
            return;
        }
        if (((g31) arrayList.get(i10)).a == 6) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.e) {
                v8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), X.savePhoto, true);
                v8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.lj), R.drawable.msg_filled_data_photos);
                return;
            } else {
                v8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), X.saveVideo, false);
                v8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.ij), R.drawable.msg_filled_data_videos);
                return;
            }
        }
        if (((g31) arrayList.get(i10)).a != 7) {
            if (((g31) arrayList.get(i10)).a == 5) {
                ((org.telegram.ui.Cells.l4) view).setText(((g31) arrayList.get(i10)).d);
                return;
            }
            if (((g31) arrayList.get(i10)).a == 2) {
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                SaveToGallerySettingsHelper.DialogException dialogException = ((g31) arrayList.get(i10)).c;
                TLObject userOrChat = saveToGallerySettingsActivity.getMessagesController().getUserOrChat(dialogException.dialogId);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                }
                vaVar.setSelfAsSavedMessages(true);
                i11 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
                vaVar.e(userOrChat, str, dialogException.createDescription(i11), i10 == arrayList.size() - 1 || ((g31) arrayList.get(i10 + 1)).a == 2);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
        if (i10 != saveToGallerySettingsActivity.h) {
            d9Var.setText(((g31) arrayList.get(i10)).d);
            return;
        }
        long j10 = saveToGallerySettingsActivity.X().limitVideo;
        if (saveToGallerySettingsActivity.c != null) {
            d9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
            return;
        }
        int i12 = saveToGallerySettingsActivity.a;
        if (i12 == 1) {
            d9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
        } else if (i12 == 4) {
            d9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
        } else if (i12 == 2) {
            d9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
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
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                q8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                q8Var.e(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                q8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view3 = q8Var;
                break;
            case 2:
                View vaVar = new org.telegram.ui.Cells.va(4, 0, viewGroup.getContext(), null, false, false);
                vaVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view = vaVar;
                view3 = view;
                break;
            case 3:
                view2 = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
                view3 = view2;
                break;
            case 4:
                org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                q8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                q8Var2.e(-1, org.telegram.ui.ActionBar.h6.p7);
                q8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view2 = q8Var2;
                view3 = view2;
                break;
            case 5:
                View l4Var = new org.telegram.ui.Cells.l4(viewGroup.getContext());
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view2 = l4Var;
                view3 = view2;
                break;
            case 6:
                View v8Var = new org.telegram.ui.Cells.v8(viewGroup.getContext());
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view2 = v8Var;
                view3 = view2;
                break;
            case 7:
                view3 = new org.telegram.ui.Cells.d9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Components.cp0 cp0Var = new org.telegram.ui.Components.cp0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                h31 h31Var = new h31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                h31Var.setTextSize(AndroidUtilities.dp(13.0f));
                h31Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(h31Var, w7.z5.e(-2, -2, 83));
                h31 h31Var2 = new h31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                h31Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(h31Var2, w7.z5.e(-2, -2, 81));
                h31 h31Var3 = new h31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                h31Var3.setTextSize(AndroidUtilities.dp(13.0f));
                h31Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(h31Var3, w7.z5.e(-2, -2, 85));
                linearLayout.addView(frameLayout, w7.z5.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(cp0Var, w7.z5.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                cp0Var.setReportChanges(true);
                cp0Var.setDelegate(new e31(this, cp0Var, h31Var, h31Var2, h31Var3));
                cp0Var.setProgress(((float) j10) > ((float) SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) * 0.7f ? a1.g.d(j10 - SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT, 4089446400L, 0.3f, 0.7f) : ((j10 - 524288) / 104333312) * 0.7f);
                cp0Var.w.L(cp0Var.getProgress(), false);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                org.telegram.ui.Cells.ua uaVar = new org.telegram.ui.Cells.ua(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.b)) {
                    i12 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                uaVar.a(chat, null);
                uaVar.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                view2 = uaVar;
                view3 = view2;
                break;
            case 10:
                View z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
                z6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.b7, saveToGallerySettingsActivity.getResourceProvider())));
                view2 = z6Var;
                view3 = view2;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view3, view3, -1, -2);
    }
}
