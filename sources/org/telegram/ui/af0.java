package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af0 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.am0, nt, FileLoader.FileResolver, org.telegram.ui.Components.e5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.bm0, lv0, MessagesStorage.BooleanCallback, g11 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ af0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 11:
                ev0 ev0Var = (ev0) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.b;
                mv0 mv0Var = ev0Var.a;
                mv0Var.e0.a(tL_messageMediaToDo);
                mv0Var.finishFragment();
                break;
            default:
                ev0 ev0Var2 = (ev0) this.c;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.b;
                mv0 mv0Var2 = ev0Var2.a;
                mv0Var2.e0.a(tL_messageMediaPoll);
                mv0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.nt
    public void Y0(jt jtVar) {
        in0 in0Var = (in0) this.c;
        int intValue = ((Integer) ((View) this.b).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = in0Var.Y[intValue];
        if (intValue == 5) {
            in0Var.s = jtVar.d;
        } else {
            in0Var.v = jtVar.d;
        }
        editTextBoldCursor.setText(jtVar.a);
    }

    @Override // org.telegram.ui.lv0
    public void a(TLRPC.MessageMedia messageMedia) {
        id1 id1Var = (id1) this.c;
        un unVar = (un) this.b;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = id1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        id1Var.G.messageOwner.media = messageMedia;
        unVar.getSendMessagesHelper().editMessage(id1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        final bb1 bb1Var = (bb1) this.c;
        final db1 db1Var = (db1) this.b;
        ThemeActivity themeActivity = bb1Var.e;
        if (i10 >= 0 && i10 < db1Var.e.size()) {
            final org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) db1Var.e.get(i10);
            if (w6Var.a >= 100 && !w6Var.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = w6Var.r;
                CharSequence[] charSequenceArr = {string, string2, (tL_theme == null || !tL_theme.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), LocaleController.getString("DeleteTheme", R.string.DeleteTheme)};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.va1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        bb1 bb1Var2 = bb1.this;
                        ThemeActivity themeActivity2 = bb1Var2.e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.w6 w6Var2 = w6Var;
                        if (i11 == 0) {
                            org.telegram.ui.Components.g5.V(themeActivity2, i11 != 1 ? 1 : 2, w6Var2.b, w6Var2);
                            return;
                        }
                        if (i11 == 1) {
                            if (w6Var2.r == null) {
                                themeActivity2.getMessagesController().saveThemeToServer(w6Var2.b, w6Var2);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, w6Var2.b, w6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + w6Var2.r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.mr0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i11 == 2) {
                            themeActivity2.presentFragment(new xc1(w6Var2.b, w6Var2, false));
                            return;
                        }
                        if (i11 != 3 || themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                        String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder2.a;
                        e2Var.R = string3;
                        e2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                        alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new e7(bb1Var2, db1Var, w6Var2, 22));
                        alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity2.showDialog(e2Var);
                        TextView textView = (TextView) e2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                        }
                    }
                };
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.P = charSequenceArr;
                e2Var.Q = iArr;
                e2Var.M = onClickListener;
                themeActivity.showDialog(e2Var);
                e2Var.m(e2Var.P0.size() - 1, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q7, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.p7, false));
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.am0
    public void e(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 1:
                NotificationsCustomSettingsActivity.V((NotificationsCustomSettingsActivity) this.c, (Context) this.b, view, i10, f7, f10);
                break;
            default:
                ThemeActivity.X((ThemeActivity) this.c, (Context) this.b, view, i10, f7);
                break;
        }
    }

    @Override // org.telegram.messenger.FileLoader.FileResolver
    public File getFile() {
        switch (this.a) {
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                return FileLoader.getInstance(photoViewer.T).getPathToAttach((TLObject) this.b, true);
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                return FileLoader.getInstance(photoViewer2.T).getPathToMessage((TLRPC.Message) this.b);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ArrayList<Long> arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        org.telegram.ui.ActionBar.j5 j5Var;
        int i11 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                jf0.n((jf0) obj2, (Context) obj);
                break;
            case 1:
            case 4:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 18:
            case 19:
            case 23:
            case 24:
            default:
                dg1.X((dg1) obj2, (byte[]) obj);
                break;
            case 2:
                in0 in0Var = (in0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!in0Var.v0) {
                    in0Var.s1.clear();
                }
                in0Var.t1.clear();
                lm0 lm0Var = (lm0) in0Var.B1;
                lm0Var.d.j1(in0Var.E, in0Var.F, in0Var.G, zArr[0], null, null, lm0Var.b);
                in0Var.finishFragment();
                break;
            case 3:
                int[] iArr = ((in0) obj2).x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                break;
            case 5:
                in0.V((in0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
            case 6:
                po0 po0Var = (po0) obj2;
                po0Var.b0 = true;
                po0Var.a0.email_unconfirmed_pattern = (String) obj;
                po0Var.K0();
                break;
            case 9:
                PhotoViewer.D(((fs0) obj2).b, (ArrayList) obj);
                break;
            case 10:
                boolean[] zArr2 = (boolean[]) obj;
                PhotoViewer photoViewer = ((fs0) obj2).b;
                ou0 ou0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.a7;
                ArrayList arrayList3 = photoViewer.d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!ou0Var.N()) {
                    photoViewer.H0(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i12 = photoViewer.P4;
                    if (i12 >= 0 && i12 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.P4);
                        if (messageObject.isSent()) {
                            photoViewer.H0(false, false);
                            ArrayList<Integer> arrayList7 = new ArrayList<>();
                            int i13 = photoViewer.v;
                            if (i13 != 0) {
                                arrayList7.add(Integer.valueOf(i13));
                            } else {
                                arrayList7.add(Integer.valueOf(messageObject.getId()));
                            }
                            if (!DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.messageOwner.random_id == 0) {
                                arrayList = null;
                                encryptedChat = null;
                            } else {
                                ArrayList<Long> arrayList8 = new ArrayList<>();
                                arrayList8.add(Long.valueOf(messageObject.messageOwner.random_id));
                                arrayList = arrayList8;
                                encryptedChat = MessagesController.getInstance(photoViewer.T).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                            }
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList7, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr2[0], messageObject.getChatMode());
                            break;
                        }
                    }
                } else if (!arrayList6.isEmpty()) {
                    int i14 = photoViewer.P4;
                    if (i14 >= 0 && i14 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.P4);
                        if (message != null) {
                            ArrayList<Integer> arrayList9 = new ArrayList<>();
                            arrayList9.add(Integer.valueOf(message.id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (!photoViewer.K1()) {
                            TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                            if (photo != null) {
                                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                tL_inputPhoto.id = photo.id;
                                tL_inputPhoto.access_hash = photo.access_hash;
                                byte[] bArr = photo.file_reference;
                                tL_inputPhoto.file_reference = bArr;
                                if (bArr == null) {
                                    tL_inputPhoto.file_reference = new byte[0];
                                }
                                if (photoViewer.z5 > 0) {
                                    MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                                }
                                MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.z5, photo.id);
                                arrayList2.remove(photoViewer.P4);
                                photoViewer.c7.remove(photoViewer.P4);
                                photoViewer.b7.remove(photoViewer.P4);
                                arrayList3.remove(photoViewer.P4);
                                arrayList6.remove(photoViewer.P4);
                                if (arrayList2.isEmpty()) {
                                    photoViewer.H0(false, false);
                                } else {
                                    int i15 = photoViewer.P4;
                                    if (i15 >= arrayList6.size()) {
                                        i15 = arrayList6.size() - 1;
                                    }
                                    photoViewer.P4 = -1;
                                    photoViewer.D2(i15);
                                }
                                if (message == null) {
                                    NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                                    break;
                                }
                            }
                        } else {
                            if (photoViewer.z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.H0(false, false);
                            break;
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.P4);
                    photoViewer.d.B(photoViewer.P4);
                    if (!arrayList5.isEmpty()) {
                        int i16 = photoViewer.P4;
                        if (i16 >= arrayList5.size()) {
                            i16 = arrayList5.size() - 1;
                        }
                        photoViewer.P4 = -1;
                        photoViewer.D2(i16);
                        break;
                    } else {
                        photoViewer.H0(false, false);
                        break;
                    }
                }
                break;
            case 14:
                ((PrivacyControlActivity) obj2).u0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 15:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new j10(23, privacySettingsActivity, (org.telegram.ui.Cells.a9) obj));
                break;
            case 16:
                ProfileActivity.j0((ProfileActivity) obj2, (org.telegram.ui.Cells.y1[]) obj);
                break;
            case 17:
                rz0 rz0Var = (rz0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                rz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = rz0Var.b;
                int i17 = ProfileActivity.R6;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.p5(false, false);
                    break;
                }
                break;
            case 20:
                m61 m61Var = (m61) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    m61Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    e7 e7Var = new e7(m61Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.b0 = e7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 21:
                ea1.m((ea1) obj2, (cy) obj);
                break;
            case 22:
                ThemeActivity.Y((ThemeActivity) obj2, (fy0) obj);
                break;
            case 25:
                bb1 bb1Var = (bb1) obj2;
                org.telegram.ui.ActionBar.x6 x6Var = (org.telegram.ui.ActionBar.x6) obj;
                bb1Var.getClass();
                MessagesController.getInstance(x6Var.E).saveTheme(x6Var, null, x6Var == org.telegram.ui.ActionBar.y6.J, true);
                HashMap hashMap = org.telegram.ui.ActionBar.y6.H;
                if (x6Var.b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.y6.I == x6Var) {
                        org.telegram.ui.ActionBar.y6.t(org.telegram.ui.ActionBar.y6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (x6Var == org.telegram.ui.ActionBar.y6.J) {
                        org.telegram.ui.ActionBar.y6.J = (org.telegram.ui.ActionBar.x6) hashMap.get("Dark Blue");
                    }
                    x6Var.t();
                    org.telegram.ui.ActionBar.y6.G.remove(x6Var);
                    hashMap.remove(x6Var.a);
                    org.telegram.ui.ActionBar.r6 r6Var = x6Var.i0;
                    if (r6Var != null) {
                        org.telegram.ui.ActionBar.r6.a(r6Var);
                    }
                    org.telegram.ui.ActionBar.y6.F.remove(x6Var);
                    new File(x6Var.b).delete();
                    org.telegram.ui.ActionBar.y6.v1(true, false);
                }
                if (z10) {
                    j5Var = ((org.telegram.ui.ActionBar.r2) bb1Var.e).parentLayout;
                    ((ActionBarLayout) j5Var).W(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                break;
        }
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ void l0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        uw0 uw0Var = (uw0) this.c;
        tw0 tw0Var = (tw0) this.b;
        PremiumPreviewFragment premiumPreviewFragment = uw0Var.d.n;
        premiumPreviewFragment.n0.d(0, 0.0f, 0, tw0Var.getMeasuredWidth(), -tw0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.n0.f;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        ke1 ke1Var = (ke1) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.b;
        af1 af1Var = ke1Var.b;
        NotificationCenter notificationCenter = af1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(af1Var, i10);
        af1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        af1Var.finishFragment();
        af1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z10));
    }

    @Override // org.telegram.ui.g11
    public void t(ok0 ok0Var) {
        df1 df1Var = (df1) this.c;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.b;
        gf1 gf1Var = df1Var.a;
        gf1Var.e.add(Integer.valueOf(tL_forumTopic.id));
        gf1Var.W();
    }

    public /* synthetic */ af0(ev0 ev0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = 12;
        this.c = ev0Var;
        this.b = tL_messageMediaPoll;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
        Runnable runnable = (Runnable) this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                    if (Emoji.getEmojiDrawable(fixEmoji) != null) {
                        linkedHashSet.add(fixEmoji);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // org.telegram.ui.g11
    public /* synthetic */ void Y() {
    }

    private final /* synthetic */ void b(View view, float f7, float f10) {
    }

    private final /* synthetic */ void d(View view, float f7, float f10) {
    }
}
