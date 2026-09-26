package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ds0 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.d5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.ll0, org.telegram.ui.Components.ml0, qv0, MessagesStorage.BooleanCallback, m11, OnSuccessListener, pa.a, OnFailureListener, t5.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ds0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 1:
                jv0 jv0Var = (jv0) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.c;
                rv0 rv0Var = jv0Var.a;
                rv0Var.e0.a(tL_messageMediaToDo);
                rv0Var.finishFragment();
                break;
            default:
                jv0 jv0Var2 = (jv0) this.b;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.c;
                rv0 rv0Var2 = jv0Var2.a;
                rv0Var2.e0.a(tL_messageMediaPoll);
                rv0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.qv0
    public void a(TLRPC.MessageMedia messageMedia) {
        de1 de1Var = (de1) this.b;
        wn wnVar = (wn) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = de1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        de1Var.G.messageOwner.media = messageMedia;
        wnVar.getSendMessagesHelper().editMessage(de1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override // org.telegram.ui.Components.ll0
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.b, (Context) this.c, view, i10, f7);
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        final yb1 yb1Var = (yb1) this.b;
        final ac1 ac1Var = (ac1) this.c;
        ThemeActivity themeActivity = yb1Var.e;
        if (i10 >= 0 && i10 < ac1Var.e.size()) {
            final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) ac1Var.e.get(i10);
            if (f6Var.a >= 100 && !f6Var.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = f6Var.r;
                CharSequence[] charSequenceArr = {string, string2, (tL_theme == null || !tL_theme.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), LocaleController.getString("DeleteTheme", R.string.DeleteTheme)};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.sb1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        yb1 yb1Var2 = yb1.this;
                        ThemeActivity themeActivity2 = yb1Var2.e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                        if (i11 == 0) {
                            org.telegram.ui.Components.e5.W(themeActivity2, i11 != 1 ? 1 : 2, f6Var2.b, f6Var2);
                            return;
                        }
                        if (i11 == 1) {
                            if (f6Var2.r == null) {
                                themeActivity2.getMessagesController().saveThemeToServer(f6Var2.b, f6Var2);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var2.b, f6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + f6Var2.r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.uq0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i11 == 2) {
                            themeActivity2.presentFragment(new td1(f6Var2.b, f6Var2, false));
                            return;
                        }
                        if (i11 != 3 || themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                        String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.a;
                        a2Var.R = string3;
                        a2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                        alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new b7(yb1Var2, ac1Var, f6Var2, 22));
                        alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity2.showDialog(a2Var);
                        TextView textView = (TextView) a2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                        }
                    }
                };
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.P = charSequenceArr;
                a2Var.Q = iArr;
                a2Var.M = onClickListener;
                themeActivity.showDialog(a2Var);
                a2Var.l(a2Var.N0.size() - 1, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.p7, false));
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList<Long> arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.a) {
            case 0:
                ks0 ks0Var = (ks0) this.b;
                boolean[] zArr = (boolean[]) this.c;
                PhotoViewer photoViewer = ks0Var.b;
                tu0 tu0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.a7;
                ArrayList arrayList3 = photoViewer.d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!tu0Var.M()) {
                    photoViewer.G0(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i11 = photoViewer.P4;
                    if (i11 >= 0 && i11 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.P4);
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
                                encryptedChat = MessagesController.getInstance(photoViewer.T).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                                arrayList = arrayList8;
                            }
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList7, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr[0], messageObject.getChatMode());
                            break;
                        }
                    }
                } else if (!arrayList6.isEmpty()) {
                    int i13 = photoViewer.P4;
                    if (i13 >= 0 && i13 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.P4);
                        if (message != null) {
                            ArrayList<Integer> arrayList9 = new ArrayList<>();
                            arrayList9.add(Integer.valueOf(message.id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (!photoViewer.I1()) {
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
                                    photoViewer.G0(false, false);
                                } else {
                                    int i14 = photoViewer.P4;
                                    if (i14 >= arrayList6.size()) {
                                        i14 = arrayList6.size() - 1;
                                    }
                                    photoViewer.P4 = -1;
                                    photoViewer.A2(i14);
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
                            photoViewer.G0(false, false);
                            break;
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.P4);
                    photoViewer.d.B(photoViewer.P4);
                    if (!arrayList5.isEmpty()) {
                        int i15 = photoViewer.P4;
                        if (i15 >= arrayList5.size()) {
                            i15 = arrayList5.size() - 1;
                        }
                        photoViewer.P4 = -1;
                        photoViewer.A2(i15);
                        break;
                    } else {
                        photoViewer.G0(false, false);
                        break;
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 8:
            case 9:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 21:
            default:
                rg.j0.Q((rg.j0) this.b, (ArrayList) this.c);
                break;
            case 4:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                privacyControlActivity.t0();
                sharedPreferences.edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 5:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) this.c;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new vb0(14, privacySettingsActivity, w8Var));
                break;
            case 6:
                ProfileActivity.c0((ProfileActivity) this.b, (org.telegram.ui.Cells.a2[]) this.c);
                break;
            case 7:
                yz0 yz0Var = (yz0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                yz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = yz0Var.b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    break;
                }
                break;
            case 10:
                k71 k71Var = (k71) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    k71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    b7 b7Var = new b7(k71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.b0 = b7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 11:
                ab1.m((ab1) this.b, (qy) this.c);
                break;
            case 12:
                ThemeActivity.X((ThemeActivity) this.b, (p81) this.c);
                break;
            case 15:
                yb1 yb1Var = (yb1) this.b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                yb1Var.getClass();
                MessagesController.getInstance(g6Var.E).saveTheme(g6Var, null, g6Var == org.telegram.ui.ActionBar.h6.J, true);
                HashMap hashMap = org.telegram.ui.ActionBar.h6.H;
                if (g6Var.b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.h6.I == g6Var) {
                        org.telegram.ui.ActionBar.h6.t(org.telegram.ui.ActionBar.h6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g6Var == org.telegram.ui.ActionBar.h6.J) {
                        org.telegram.ui.ActionBar.h6.J = (org.telegram.ui.ActionBar.g6) hashMap.get("Dark Blue");
                    }
                    g6Var.t();
                    org.telegram.ui.ActionBar.h6.G.remove(g6Var);
                    hashMap.remove(g6Var.a);
                    org.telegram.ui.ActionBar.z5 z5Var = g6Var.i0;
                    if (z5Var != null) {
                        org.telegram.ui.ActionBar.z5.a(z5Var);
                    }
                    org.telegram.ui.ActionBar.h6.F.remove(g6Var);
                    new File(g6Var.b).delete();
                    org.telegram.ui.ActionBar.h6.s1(true, false);
                }
                if (z10) {
                    b5Var = ((org.telegram.ui.ActionBar.m2) yb1Var.e).parentLayout;
                    ((ActionBarLayout) b5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                break;
            case 19:
                zg1.W((zg1) this.b, (byte[]) this.c);
                break;
            case 20:
                mi1 mi1Var = (mi1) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                mi1Var.getClass();
                zArr3[0] = true;
                mi1Var.p0 = 17;
                Intent intent = new Intent(mi1Var.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", mi1Var.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", mi1Var.a);
                try {
                    mi1Var.b.startService(intent);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 22:
                org.telegram.ui.web.o.Y((org.telegram.ui.web.o) this.b, (HashSet) this.c);
                break;
            case 23:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(b1Var.M).getInputUser(b1Var.U);
                ConnectionsManager.getInstance(b1Var.M).sendRequest(allowsendmessage, new ai.s5(b1Var, strArr, a2Var, 15));
                break;
            case 24:
                boolean[] zArr4 = (boolean[]) this.c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.b;
                if (!zArr4[0]) {
                    zArr4[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
        }
    }

    @Override // pa.a
    public void g(pa.b bVar) {
        pa.a aVar = (pa.a) this.b;
        pa.a aVar2 = (pa.a) this.c;
        aVar.g(bVar);
        aVar2.g(bVar);
    }

    @Override // t5.b
    public Object i() {
        switch (this.a) {
            case 27:
                da.b bVar = (da.b) this.b;
                Iterable iterable = (Iterable) this.c;
                s5.h hVar = (s5.h) ((s5.d) bVar.c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.h.g(iterable)).execute();
                    break;
                }
                break;
            default:
                da.b bVar2 = (da.b) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((s5.h) ((s5.c) bVar2.i)).e(((Integer) entry.getValue()).intValue(), o5.c.h, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        qg.y1 y1Var = (qg.y1) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        y1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && y1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.o1(11, y1Var, bitmap), 2000L);
        } else {
            y1Var.C0 = true;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        cf.c cVar = (cf.c) this.b;
        ci.d dVar = (ci.d) this.c;
        FileLog.d("wear-auth: /token delivered to " + ((String) cVar.d));
        dVar.setLoading(false);
        dj1.d = null;
        org.telegram.ui.ActionBar.e3 e3Var = dj1.c;
        if (e3Var != null) {
            e3Var.dismiss();
            dj1.c = null;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        zw0 zw0Var = (zw0) this.b;
        yw0 yw0Var = (yw0) this.c;
        PremiumPreviewFragment premiumPreviewFragment = zw0Var.d.n;
        premiumPreviewFragment.n0.d(0, 0.0f, 0, yw0Var.getMeasuredWidth(), -yw0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.n0.f;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        gf1 gf1Var = (gf1) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        wf1 wf1Var = gf1Var.b;
        NotificationCenter notificationCenter = wf1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(wf1Var, i10);
        wf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        wf1Var.finishFragment();
        wf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z10));
    }

    @Override // org.telegram.ui.m11
    public void v(nk0 nk0Var) {
        zf1 zf1Var = (zf1) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        cg1 cg1Var = zf1Var.a;
        cg1Var.e.add(Integer.valueOf(tL_forumTopic.id));
        cg1Var.V();
    }

    public /* synthetic */ ds0(jv0 jv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = 2;
        this.b = jv0Var;
        this.c = tL_messageMediaPoll;
    }

    public /* synthetic */ ds0(boolean[] zArr, JsPromptResult jsPromptResult) {
        this.a = 24;
        this.c = zArr;
        this.b = jsPromptResult;
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

    @Override // org.telegram.ui.m11
    public /* synthetic */ void c0() {
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
