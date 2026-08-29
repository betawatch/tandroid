package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl0 implements org.telegram.ui.ActionBar.b2, qt, FileLoader.FileResolver, org.telegram.ui.Components.b5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0, uu0, MessagesStorage.BooleanCallback, s01, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kl0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 9:
                nu0 nu0Var = (nu0) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.c;
                vu0 vu0Var = nu0Var.a;
                vu0Var.a0.a(tL_messageMediaToDo);
                vu0Var.finishFragment();
                break;
            default:
                nu0 nu0Var2 = (nu0) this.b;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.c;
                vu0 vu0Var2 = nu0Var2.a;
                vu0Var2.a0.a(tL_messageMediaPoll);
                vu0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.qt
    public void Z0(lt ltVar) {
        vm0 vm0Var = (vm0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = vm0Var.U[intValue];
        if (intValue == 5) {
            vm0Var.s = ltVar.d;
        } else {
            vm0Var.v = ltVar.d;
        }
        editTextBoldCursor.setText(ltVar.a);
    }

    @Override // org.telegram.ui.uu0
    public void a(TLRPC.MessageMedia messageMedia) {
        fd1 fd1Var = (fd1) this.b;
        tn tnVar = (tn) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = fd1Var.C.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        fd1Var.C.messageOwner.media = messageMedia;
        tnVar.getSendMessagesHelper().editMessage(fd1Var.C, null, null, null, null, null, null, false, false, null);
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.b, (Context) this.c, view, i10, f9);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        final ya1 ya1Var = (ya1) this.b;
        final ab1 ab1Var = (ab1) this.c;
        ThemeActivity themeActivity = ya1Var.e;
        if (i10 >= 0 && i10 < ab1Var.e.size()) {
            final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) ab1Var.e.get(i10);
            if (e6Var.a >= 100 && !e6Var.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = e6Var.r;
                CharSequence[] charSequenceArr = {string, string2, (tL_theme == null || !tL_theme.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), LocaleController.getString("DeleteTheme", R.string.DeleteTheme)};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.sa1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        ya1 ya1Var2 = ya1.this;
                        ThemeActivity themeActivity2 = ya1Var2.e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (i11 == 0) {
                            org.telegram.ui.Components.c5.W(themeActivity2, i11 != 1 ? 1 : 2, e6Var2.b, e6Var2);
                            return;
                        }
                        if (i11 == 1) {
                            if (e6Var2.r == null) {
                                themeActivity2.getMessagesController().saveThemeToServer(e6Var2.b, e6Var2);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6Var2.b, e6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + e6Var2.r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.dq0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i11 == 2) {
                            themeActivity2.presentFragment(new vc1(e6Var2.b, e6Var2, false));
                            return;
                        }
                        if (i11 != 3 || themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                        String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.a;
                        c2Var.N = string3;
                        c2Var.P = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                        alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new z6(ya1Var2, ab1Var, e6Var2, 22));
                        alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity2.showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                        }
                    }
                };
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.L = charSequenceArr;
                c2Var.M = iArr;
                c2Var.I = onClickListener;
                themeActivity.showDialog(c2Var);
                c2Var.l(c2Var.J0.size() - 1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ArrayList<Long> arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.a) {
            case 0:
                vm0 vm0Var = (vm0) this.b;
                boolean[] zArr = (boolean[]) this.c;
                if (!vm0Var.r0) {
                    vm0Var.o1.clear();
                }
                vm0Var.p1.clear();
                yl0 yl0Var = (yl0) vm0Var.x1;
                yl0Var.d.j1(vm0Var.A, vm0Var.B, vm0Var.C, zArr[0], null, null, yl0Var.b);
                vm0Var.finishFragment();
                break;
            case 1:
                vm0 vm0Var2 = (vm0) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                int[] iArr = vm0Var2.x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
                break;
            case 2:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 16:
            case 17:
            case 21:
            case 22:
            case 24:
            case 25:
            case 26:
            default:
                oh1 oh1Var = (oh1) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                oh1Var.getClass();
                zArr2[0] = true;
                oh1Var.l0 = 17;
                Intent intent = new Intent(oh1Var.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", oh1Var.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", oh1Var.a);
                try {
                    oh1Var.b.startService(intent);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            case 3:
                vm0.U((vm0) this.b, (TLRPC.TL_auth_passwordRecovery) this.c);
                break;
            case 4:
                bo0 bo0Var = (bo0) this.b;
                String str = (String) this.c;
                bo0Var.X = true;
                bo0Var.W.email_unconfirmed_pattern = str;
                bo0Var.J0();
                break;
            case 7:
                PhotoViewer.C(((or0) this.b).b, (ArrayList) this.c);
                break;
            case 8:
                or0 or0Var = (or0) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                PhotoViewer photoViewer = or0Var.b;
                xt0 xt0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.W6;
                ArrayList arrayList3 = photoViewer.Z6;
                ArrayList arrayList4 = photoViewer.U6;
                ArrayList arrayList5 = photoViewer.a7;
                ArrayList arrayList6 = photoViewer.b7;
                if (!xt0Var.M()) {
                    photoViewer.G0(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i11 = photoViewer.L4;
                    if (i11 >= 0 && i11 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.L4);
                        if (messageObject.isSent()) {
                            photoViewer.G0(false, false);
                            ArrayList<Integer> arrayList7 = new ArrayList<>();
                            int i12 = photoViewer.v;
                            if (i12 != 0) {
                                arrayList7.add(Integer.valueOf(i12));
                            } else {
                                arrayList7.add(Integer.valueOf(messageObject.getId()));
                            }
                            if (!DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.messageOwner.random_id == 0) {
                                arrayList = null;
                                encryptedChat = null;
                            } else {
                                ArrayList<Long> arrayList8 = new ArrayList<>();
                                arrayList8.add(Long.valueOf(messageObject.messageOwner.random_id));
                                encryptedChat = MessagesController.getInstance(photoViewer.P).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                                arrayList = arrayList8;
                            }
                            MessagesController.getInstance(photoViewer.P).deleteMessages(arrayList7, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr3[0], messageObject.getChatMode());
                            break;
                        }
                    }
                } else if (!arrayList6.isEmpty()) {
                    int i13 = photoViewer.L4;
                    if (i13 >= 0 && i13 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.L4);
                        if (message != null) {
                            ArrayList<Integer> arrayList9 = new ArrayList<>();
                            arrayList9.add(Integer.valueOf(message.id));
                            MessagesController.getInstance(photoViewer.P).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.P).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (!photoViewer.I1()) {
                            TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.L4);
                            if (photo != null) {
                                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                tL_inputPhoto.id = photo.id;
                                tL_inputPhoto.access_hash = photo.access_hash;
                                byte[] bArr = photo.file_reference;
                                tL_inputPhoto.file_reference = bArr;
                                if (bArr == null) {
                                    tL_inputPhoto.file_reference = new byte[0];
                                }
                                if (photoViewer.v5 > 0) {
                                    MessagesController.getInstance(photoViewer.P).deleteUserPhoto(tL_inputPhoto);
                                }
                                MessagesStorage.getInstance(photoViewer.P).clearUserPhoto(photoViewer.v5, photo.id);
                                arrayList2.remove(photoViewer.L4);
                                photoViewer.Y6.remove(photoViewer.L4);
                                photoViewer.X6.remove(photoViewer.L4);
                                arrayList3.remove(photoViewer.L4);
                                arrayList6.remove(photoViewer.L4);
                                if (arrayList2.isEmpty()) {
                                    photoViewer.G0(false, false);
                                } else {
                                    int i14 = photoViewer.L4;
                                    if (i14 >= arrayList6.size()) {
                                        i14 = arrayList6.size() - 1;
                                    }
                                    photoViewer.L4 = -1;
                                    photoViewer.B2(i14);
                                }
                                if (message == null) {
                                    NotificationCenter.getInstance(photoViewer.P).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                                    break;
                                }
                            }
                        } else {
                            if (photoViewer.v5 > 0) {
                                MessagesController.getInstance(photoViewer.P).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.P).changeChatAvatar(-photoViewer.v5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            break;
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.L4);
                    photoViewer.d.B(photoViewer.L4);
                    if (!arrayList5.isEmpty()) {
                        int i15 = photoViewer.L4;
                        if (i15 >= arrayList5.size()) {
                            i15 = arrayList5.size() - 1;
                        }
                        photoViewer.L4 = -1;
                        photoViewer.B2(i15);
                        break;
                    } else {
                        photoViewer.G0(false, false);
                        break;
                    }
                }
                break;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                privacyControlActivity.t0();
                sharedPreferences.edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) this.c;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr4 = privacySettingsActivity.V;
                tL_payments_clearSavedInfo.credentials = zArr4[1];
                tL_payments_clearSavedInfo.info = zArr4[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new u80(17, privacySettingsActivity, q8Var));
                break;
            case 14:
                ProfileActivity.c0((ProfileActivity) this.b, (org.telegram.ui.Cells.y1[]) this.c);
                break;
            case 15:
                dz0 dz0Var = (dz0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                dz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = dz0Var.b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    break;
                }
                break;
            case 18:
                n61 n61Var = (n61) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    n61Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    z6 z6Var = new z6(n61Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.V = 0;
                    twoStepVerificationActivity.X = z6Var;
                    U.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 19:
                ba1.m((ba1) this.b, (fy) this.c);
                break;
            case 20:
                ThemeActivity.X((ThemeActivity) this.b, (t31) this.c);
                break;
            case 23:
                ya1 ya1Var = (ya1) this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                ya1Var.getClass();
                MessagesController.getInstance(f6Var.A).saveTheme(f6Var, null, f6Var == org.telegram.ui.ActionBar.g6.J, true);
                HashMap hashMap = org.telegram.ui.ActionBar.g6.H;
                if (f6Var.b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.g6.I == f6Var) {
                        org.telegram.ui.ActionBar.g6.t(org.telegram.ui.ActionBar.g6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f6Var == org.telegram.ui.ActionBar.g6.J) {
                        org.telegram.ui.ActionBar.g6.J = (org.telegram.ui.ActionBar.f6) hashMap.get("Dark Blue");
                    }
                    f6Var.t();
                    org.telegram.ui.ActionBar.g6.G.remove(f6Var);
                    hashMap.remove(f6Var.a);
                    org.telegram.ui.ActionBar.z5 z5Var = f6Var.e0;
                    if (z5Var != null) {
                        org.telegram.ui.ActionBar.z5.a(z5Var);
                    }
                    org.telegram.ui.ActionBar.g6.F.remove(f6Var);
                    new File(f6Var.b).delete();
                    org.telegram.ui.ActionBar.g6.s1(true, false);
                }
                if (z10) {
                    b5Var = ((org.telegram.ui.ActionBar.o2) ya1Var.e).parentLayout;
                    ((ActionBarLayout) b5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                break;
            case 27:
                cg1.W((cg1) this.b, (byte[]) this.c);
                break;
        }
    }

    @Override // org.telegram.messenger.FileLoader.FileResolver
    public File getFile() {
        switch (this.a) {
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                return FileLoader.getInstance(photoViewer.P).getPathToAttach((TLObject) this.c, true);
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                return FileLoader.getInstance(photoViewer2.P).getPathToMessage((TLRPC.Message) this.c);
        }
    }

    @Override // org.telegram.ui.s01
    public void m(bk0 bk0Var) {
        cf1 cf1Var = (cf1) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        ff1 ff1Var = cf1Var.a;
        ff1Var.e.add(Integer.valueOf(tL_forumTopic.id));
        ff1Var.V();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a5.j jVar = (a5.j) this.b;
        nh.d dVar = (nh.d) this.c;
        FileLog.d("wear-auth: /token delivered to " + ((String) jVar.c));
        dVar.setLoading(false);
        ei1.d = null;
        org.telegram.ui.ActionBar.f3 f3Var = ei1.c;
        if (f3Var != null) {
            f3Var.dismiss();
            ei1.c = null;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        dw0 dw0Var = (dw0) this.b;
        cw0 cw0Var = (cw0) this.c;
        PremiumPreviewFragment premiumPreviewFragment = dw0Var.d.n;
        premiumPreviewFragment.j0.d(0, 0.0f, 0, cw0Var.getMeasuredWidth(), -cw0Var.getTier().h, premiumPreviewFragment.K);
        return premiumPreviewFragment.j0.f;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        ie1 ie1Var = (ie1) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        ze1 ze1Var = ie1Var.b;
        NotificationCenter notificationCenter = ze1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(ze1Var, i10);
        ze1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        ze1Var.finishFragment();
        ze1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z10));
    }

    public /* synthetic */ kl0(nu0 nu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = 10;
        this.b = nu0Var;
        this.c = tL_messageMediaPoll;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        Runnable runnable = (Runnable) this.c;
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

    @Override // org.telegram.ui.s01
    public /* synthetic */ void a0() {
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
