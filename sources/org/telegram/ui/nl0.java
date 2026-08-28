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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl0 implements org.telegram.ui.ActionBar.b2, pt, FileLoader.FileResolver, org.telegram.ui.Components.x4, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.nk0, org.telegram.ui.Components.ok0, wu0, MessagesStorage.BooleanCallback, r01, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nl0(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        switch (this.a) {
            case 9:
                pu0 pu0Var = (pu0) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.c;
                xu0 xu0Var = pu0Var.a;
                xu0Var.a0.b(tL_messageMediaToDo);
                xu0Var.finishFragment();
                break;
            default:
                pu0 pu0Var2 = (pu0) this.b;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.c;
                xu0 xu0Var2 = pu0Var2.a;
                xu0Var2.a0.b(tL_messageMediaPoll);
                xu0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        final xa1 xa1Var = (xa1) this.b;
        final za1 za1Var = (za1) this.c;
        ThemeActivity themeActivity = xa1Var.e;
        if (i9 >= 0 && i9 < za1Var.e.size()) {
            final org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) za1Var.e.get(i9);
            if (d6Var.a >= 100 && !d6Var.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = d6Var.r;
                CharSequence[] charSequenceArr = {string, string2, (tL_theme == null || !tL_theme.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), LocaleController.getString("DeleteTheme", R.string.DeleteTheme)};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.ra1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        xa1 xa1Var2 = xa1.this;
                        ThemeActivity themeActivity2 = xa1Var2.e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                        if (i10 == 0) {
                            org.telegram.ui.Components.y4.W(themeActivity2, i10 != 1 ? 1 : 2, d6Var2.b, d6Var2);
                            return;
                        }
                        if (i10 == 1) {
                            if (d6Var2.r == null) {
                                themeActivity2.getMessagesController().saveThemeToServer(d6Var2.b, d6Var2);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, d6Var2.b, d6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + d6Var2.r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.rp0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i10 == 2) {
                            themeActivity2.presentFragment(new tc1(d6Var2.b, d6Var2, false));
                            return;
                        }
                        if (i10 != 3 || themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                        String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.a;
                        c2Var.N = string3;
                        c2Var.P = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                        alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new a7(xa1Var2, za1Var, d6Var2, 22));
                        alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity2.showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                        }
                    }
                };
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.L = charSequenceArr;
                c2Var.M = iArr;
                c2Var.I = onClickListener;
                themeActivity.showDialog(c2Var);
                c2Var.l(c2Var.J0.size() - 1, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.pt
    public void a1(lt ltVar) {
        wm0 wm0Var = (wm0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = wm0Var.U[intValue];
        if (intValue == 5) {
            wm0Var.s = ltVar.d;
        } else {
            wm0Var.v = ltVar.d;
        }
        editTextBoldCursor.setText(ltVar.a);
    }

    @Override // org.telegram.ui.wu0
    public void b(TLRPC.MessageMedia messageMedia) {
        dd1 dd1Var = (dd1) this.b;
        qn qnVar = (qn) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = dd1Var.C.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        dd1Var.C.messageOwner.media = messageMedia;
        qnVar.getSendMessagesHelper().editMessage(dd1Var.C, null, null, null, null, null, null, false, false, null);
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        ThemeActivity.V((ThemeActivity) this.b, (Context) this.c, view, i9, f10);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        ArrayList<Long> arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.a) {
            case 0:
                wm0 wm0Var = (wm0) this.b;
                boolean[] zArr = (boolean[]) this.c;
                if (!wm0Var.r0) {
                    wm0Var.o1.clear();
                }
                wm0Var.p1.clear();
                am0 am0Var = (am0) wm0Var.x1;
                am0Var.d.j1(wm0Var.A, wm0Var.B, wm0Var.C, zArr[0], null, null, am0Var.b);
                wm0Var.finishFragment();
                break;
            case 1:
                wm0 wm0Var2 = (wm0) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                int[] iArr = wm0Var2.x;
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
                mh1 mh1Var = (mh1) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                mh1Var.getClass();
                zArr2[0] = true;
                mh1Var.l0 = 17;
                Intent intent = new Intent(mh1Var.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", mh1Var.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", mh1Var.a);
                try {
                    mh1Var.b.startService(intent);
                    break;
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            case 3:
                wm0.T((wm0) this.b, (TLRPC.TL_auth_passwordRecovery) this.c);
                break;
            case 4:
                co0 co0Var = (co0) this.b;
                String str = (String) this.c;
                co0Var.X = true;
                co0Var.W.email_unconfirmed_pattern = str;
                co0Var.I0();
                break;
            case 7:
                PhotoViewer.C(((pr0) this.b).b, (ArrayList) this.c);
                break;
            case 8:
                pr0 pr0Var = (pr0) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                PhotoViewer photoViewer = pr0Var.b;
                zt0 zt0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.W6;
                ArrayList arrayList3 = photoViewer.Z6;
                ArrayList arrayList4 = photoViewer.U6;
                ArrayList arrayList5 = photoViewer.a7;
                ArrayList arrayList6 = photoViewer.b7;
                if (!zt0Var.M()) {
                    photoViewer.F0(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i10 = photoViewer.L4;
                    if (i10 >= 0 && i10 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.L4);
                        if (messageObject.isSent()) {
                            photoViewer.F0(false, false);
                            ArrayList<Integer> arrayList7 = new ArrayList<>();
                            int i11 = photoViewer.v;
                            if (i11 != 0) {
                                arrayList7.add(Integer.valueOf(i11));
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
                    int i12 = photoViewer.L4;
                    if (i12 >= 0 && i12 < arrayList6.size()) {
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
                                    photoViewer.F0(false, false);
                                } else {
                                    int i13 = photoViewer.L4;
                                    if (i13 >= arrayList6.size()) {
                                        i13 = arrayList6.size() - 1;
                                    }
                                    photoViewer.L4 = -1;
                                    photoViewer.B2(i13);
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
                            photoViewer.F0(false, false);
                            break;
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.L4);
                    photoViewer.d.B(photoViewer.L4);
                    if (!arrayList5.isEmpty()) {
                        int i14 = photoViewer.L4;
                        if (i14 >= arrayList5.size()) {
                            i14 = arrayList5.size() - 1;
                        }
                        photoViewer.L4 = -1;
                        photoViewer.B2(i14);
                        break;
                    } else {
                        photoViewer.F0(false, false);
                        break;
                    }
                }
                break;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                privacyControlActivity.s0();
                sharedPreferences.edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) this.c;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr4 = privacySettingsActivity.V;
                tL_payments_clearSavedInfo.credentials = zArr4[1];
                tL_payments_clearSavedInfo.info = zArr4[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new v40(21, privacySettingsActivity, t8Var));
                break;
            case 14:
                ProfileActivity.b0((ProfileActivity) this.b, (org.telegram.ui.Cells.z1[]) this.c);
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
                l61 l61Var = (l61) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    l61Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(l61Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.V = 0;
                    twoStepVerificationActivity.X = a7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 19:
                aa1.m((aa1) this.b, (dy) this.c);
                break;
            case 20:
                ThemeActivity.W((ThemeActivity) this.b, (n21) this.c);
                break;
            case 23:
                xa1 xa1Var = (xa1) this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                xa1Var.getClass();
                MessagesController.getInstance(e6Var.A).saveTheme(e6Var, null, e6Var == org.telegram.ui.ActionBar.f6.J, true);
                HashMap hashMap = org.telegram.ui.ActionBar.f6.H;
                if (e6Var.b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.f6.I == e6Var) {
                        org.telegram.ui.ActionBar.f6.t(org.telegram.ui.ActionBar.f6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (e6Var == org.telegram.ui.ActionBar.f6.J) {
                        org.telegram.ui.ActionBar.f6.J = (org.telegram.ui.ActionBar.e6) hashMap.get("Dark Blue");
                    }
                    e6Var.t();
                    org.telegram.ui.ActionBar.f6.G.remove(e6Var);
                    hashMap.remove(e6Var.a);
                    org.telegram.ui.ActionBar.y5 y5Var = e6Var.e0;
                    if (y5Var != null) {
                        org.telegram.ui.ActionBar.y5.a(y5Var);
                    }
                    org.telegram.ui.ActionBar.f6.F.remove(e6Var);
                    new File(e6Var.b).delete();
                    org.telegram.ui.ActionBar.f6.s1(true, false);
                }
                if (z10) {
                    b5Var = ((org.telegram.ui.ActionBar.o2) xa1Var.e).parentLayout;
                    ((ActionBarLayout) b5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                break;
            case 27:
                ag1.V((ag1) this.b, (byte[]) this.c);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.r01
    public void g(ek0 ek0Var) {
        af1 af1Var = (af1) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        df1 df1Var = af1Var.a;
        df1Var.e.add(Integer.valueOf(tL_forumTopic.id));
        df1Var.U();
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

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        b3.b bVar = (b3.b) this.b;
        kh.d dVar = (kh.d) this.c;
        FileLog.d("wear-auth: /token delivered to " + ((String) bVar.c));
        dVar.setLoading(false);
        di1.d = null;
        org.telegram.ui.ActionBar.f3 f3Var = di1.c;
        if (f3Var != null) {
            f3Var.dismiss();
            di1.c = null;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        ew0 ew0Var = (ew0) this.b;
        dw0 dw0Var = (dw0) this.c;
        PremiumPreviewFragment premiumPreviewFragment = ew0Var.d.n;
        premiumPreviewFragment.j0.d(0, 0.0f, 0, dw0Var.getMeasuredWidth(), -dw0Var.getTier().h, premiumPreviewFragment.K);
        return premiumPreviewFragment.j0.f;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        fe1 fe1Var = (fe1) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        we1 we1Var = fe1Var.b;
        NotificationCenter notificationCenter = we1Var.getNotificationCenter();
        int i9 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(we1Var, i9);
        we1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i9, new Object[0]);
        we1Var.finishFragment();
        we1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z10));
    }

    public /* synthetic */ nl0(pu0 pu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = 10;
        this.b = pu0Var;
        this.c = tL_messageMediaPoll;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        Runnable runnable = (Runnable) this.c;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            try {
                if (!((MediaDataController.KeywordResult) arrayList.get(i9)).emoji.startsWith("animated_")) {
                    String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i9)).emoji);
                    if (Emoji.getEmojiDrawable(fixEmoji) != null) {
                        linkedHashSet.add(fixEmoji);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // org.telegram.ui.r01
    public /* synthetic */ void E() {
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
