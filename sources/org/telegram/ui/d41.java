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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d41 extends bg.c {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public d41(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.s.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return ((e41) this.d.s.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        int i11;
        View view = l1Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((e41) arrayList.get(i10)).a == 1) {
            ((org.telegram.ui.Cells.n8) view).setNeedDivider(saveToGallerySettingsActivity.v.size() > 0);
            return;
        }
        if (((e41) arrayList.get(i10)).a == 6) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.e) {
                r8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), X.savePhoto, true);
                r8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.lj), R.drawable.msg_filled_data_photos);
                return;
            } else {
                r8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), X.saveVideo, false);
                r8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.ij), R.drawable.msg_filled_data_videos);
                return;
            }
        }
        if (((e41) arrayList.get(i10)).a != 7) {
            if (((e41) arrayList.get(i10)).a == 5) {
                ((org.telegram.ui.Cells.l4) view).setText(((e41) arrayList.get(i10)).d);
                return;
            }
            if (((e41) arrayList.get(i10)).a == 2) {
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
                SaveToGallerySettingsHelper.DialogException dialogException = ((e41) arrayList.get(i10)).c;
                TLObject userOrChat = saveToGallerySettingsActivity.getMessagesController().getUserOrChat(dialogException.dialogId);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                }
                uaVar.setSelfAsSavedMessages(true);
                i11 = ((org.telegram.ui.ActionBar.p2) saveToGallerySettingsActivity).currentAccount;
                uaVar.d(userOrChat, str, dialogException.createDescription(i11), i10 == arrayList.size() - 1 || ((e41) arrayList.get(i10 + 1)).a == 2);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        if (i10 != saveToGallerySettingsActivity.h) {
            z8Var.setText(((e41) arrayList.get(i10)).d);
            return;
        }
        long j10 = saveToGallerySettingsActivity.X().limitVideo;
        if (saveToGallerySettingsActivity.c != null) {
            z8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
            return;
        }
        int i12 = saveToGallerySettingsActivity.a;
        if (i12 == 1) {
            z8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
        } else if (i12 == 4) {
            z8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
        } else if (i12 == 2) {
            z8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        TLObject chat;
        int i12;
        View view2;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view3 = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                n8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                n8Var.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                n8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view3 = n8Var;
                break;
            case 2:
                View uaVar = new org.telegram.ui.Cells.ua(4, 0, viewGroup.getContext(), null, false, false);
                uaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = uaVar;
                view3 = view;
                break;
            case 3:
                view2 = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (b) null);
                view3 = view2;
                break;
            case 4:
                org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                n8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                n8Var2.e(-1, org.telegram.ui.ActionBar.j6.p7);
                n8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view2 = n8Var2;
                view3 = view2;
                break;
            case 5:
                View l4Var = new org.telegram.ui.Cells.l4(viewGroup.getContext());
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view2 = l4Var;
                view3 = view2;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view2 = r8Var;
                view3 = view2;
                break;
            case 7:
                view3 = new org.telegram.ui.Cells.z8(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Components.jo0 jo0Var = new org.telegram.ui.Components.jo0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                f41 f41Var = new f41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                f41Var.setTextSize(AndroidUtilities.dp(13.0f));
                f41Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(f41Var, k7.b6.e(-2, -2, 83));
                f41 f41Var2 = new f41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                f41Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(f41Var2, k7.b6.e(-2, -2, 81));
                f41 f41Var3 = new f41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                f41Var3.setTextSize(AndroidUtilities.dp(13.0f));
                f41Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(f41Var3, k7.b6.e(-2, -2, 85));
                linearLayout.addView(frameLayout, k7.b6.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(jo0Var, k7.b6.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                jo0Var.setReportChanges(true);
                jo0Var.setDelegate(new c41(this, jo0Var, f41Var, f41Var2, f41Var3));
                jo0Var.setProgress(((float) j10) > ((float) SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) * 0.7f ? vh.w2.c(j10 - SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT, 4089446400L, 0.3f, 0.7f) : ((j10 - 524288) / 104333312) * 0.7f);
                jo0Var.w.Y(jo0Var.getProgress(), false);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                org.telegram.ui.Cells.ta taVar = new org.telegram.ui.Cells.ta(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.b)) {
                    i12 = ((org.telegram.ui.ActionBar.p2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.p2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                taVar.a(chat, null);
                taVar.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                view2 = taVar;
                view3 = view2;
                break;
            case 10:
                View y6Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (b) null);
                y6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.U0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.b7, saveToGallerySettingsActivity.getResourceProvider())));
                view2 = y6Var;
                view3 = view2;
                break;
        }
        return ai.n(view3, view3, -1, -2);
    }
}
