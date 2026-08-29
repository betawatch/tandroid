package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements org.telegram.ui.ActionBar.b2, b5, org.telegram.ui.Cells.q5, ImageReceiver.ImageReceiverDelegate, vi, org.telegram.ui.ActionBar.n1, bl0, MessagesStorage.BooleanCallback, al0, cl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        switch (this.a) {
            case 10:
                hf hfVar = (hf) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = hfVar.a;
                long j10 = chatActivityEnterView.L2;
                MessageObject messageObject = chatActivityEnterView.O2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
                of2.sendMessageChatArguments = tnVar != null ? tnVar.C8() : null;
                of2.effect_id = chatActivityEnterView.N4;
                SendMessagesHelper.getInstance(chatActivityEnterView.M).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.i0.c();
                re reVar = chatActivityEnterView.F0;
                chatActivityEnterView.N4 = 0L;
                reVar.setEffect(0L);
                break;
            case 11:
                ((gg) this.b).o((t0.i) this.c, z10, i10, i11);
                break;
            case 12:
                yk ykVar = (yk) this.b;
                al alVar = (al) this.c;
                bl blVar = ykVar.b;
                blVar.t0.d(alVar.c, blVar.u0, z10, i10, 0L);
                blVar.b.dismiss(true);
                break;
            default:
                on onVar = (on) this.b;
                View view = (View) this.c;
                if (!z10) {
                    onVar.getClass();
                    break;
                } else {
                    onVar.R = i10;
                    onVar.Q = 0;
                    if (!(view instanceof org.telegram.ui.Cells.m8)) {
                        onVar.r.m(onVar.E0);
                        break;
                    } else {
                        onVar.U((org.telegram.ui.Cells.m8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void a() {
        mo moVar = (mo) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (moVar.c != null) {
            moVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            moVar.a();
        }
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        u51 u51Var = (u51) this.b;
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.c;
        w41 G = u51Var.U2.G(i10);
        if (G == null) {
            return;
        }
        callback5.run(G, view, Integer.valueOf(i10), Float.valueOf(f9), Float.valueOf(f10));
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        y5 y5Var;
        jv jvVar = (jv) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof av) || (y5Var = ((av) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(jvVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new t2(19, jvVar, y5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = jvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        jvVar.C = o1Var;
        o1Var.setClippingEnabled(true);
        jvVar.C.g();
        jvVar.C.setInputMethodMode(2);
        jvVar.C.setSoftInputMode(0);
        jvVar.C.setOutsideTouchable(true);
        jvVar.C.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        jvVar.C.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.q5
    public void d(org.telegram.ui.Cells.r5 r5Var) {
        TLRPC.Chat chat;
        cm cmVar = (cm) this.b;
        org.telegram.ui.Cells.r5 r5Var2 = (org.telegram.ui.Cells.r5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = cmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.r0;
        ni niVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = niVar.M0;
            org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
            if (i10 != 0 || niVar.D) {
                return;
            }
            int intValue = ((Integer) r5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = r5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.X(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.M(chatAttachAlertPhotoLayout)) {
                new tc(niVar.n1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", o2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && niVar.O1 >= 0 && hashMap.size() >= niVar.O1) {
                if (!niVar.P1 || !(o2Var instanceof org.telegram.ui.tn) || (chat = ((org.telegram.ui.tn) o2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.H == 2) {
                    return;
                }
                c5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.a).o();
                if (chatAttachAlertPhotoLayout.H == 1) {
                    chatAttachAlertPhotoLayout.H = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.p1.size() : -1;
            if ((o2Var instanceof org.telegram.ui.tn) && niVar.P1) {
                r5Var.b(size, z11, true);
            } else {
                r5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
            cm cmVar2 = chatAttachAlertPhotoLayout.v;
            if (cmVar == cmVar2) {
                cm cmVar3 = chatAttachAlertPhotoLayout.C;
                if (cmVar3.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                    intValue++;
                }
                if (cmVar3.f && intValue >= chatAttachAlertPhotoLayout.I0) {
                    intValue++;
                }
                cmVar3.m(intValue);
            } else {
                cmVar2.m(intValue);
            }
            niVar.V1(containsKey ? 2 : 1);
            r5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            r5Var2.setHighQuality(photoEntry.isHighQuality());
            r5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        im imVar = (im) this.b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
        imVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && imVar.d.getBitmap() == null) {
            if (imVar.d.getBitmap() != null && !imVar.d.getBitmap().isRecycled()) {
                imVar.d.getBitmap().recycle();
                imVar.d.setImageBitmap((Bitmap) null);
            }
            imVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.b;
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                LocaleController.LocaleInfo languageFromDict = LocaleController.getInstance().getLanguageFromDict(tL_langPackLanguage.official ? "remote_" + tL_langPackLanguage.lang_code : "unofficial_" + tL_langPackLanguage.lang_code);
                if (languageFromDict == null) {
                    languageFromDict = new LocaleController.LocaleInfo();
                    languageFromDict.name = tL_langPackLanguage.native_name;
                    languageFromDict.nameEnglish = tL_langPackLanguage.name;
                    languageFromDict.shortName = tL_langPackLanguage.lang_code;
                    languageFromDict.baseLangCode = tL_langPackLanguage.base_lang_code;
                    languageFromDict.pluralLangCode = tL_langPackLanguage.plural_code;
                    languageFromDict.isRtl = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        languageFromDict.pathToFile = "remote";
                    } else {
                        languageFromDict.pathToFile = "unofficial";
                    }
                }
                LocaleController.getInstance().applyLanguage(languageFromDict, true, false, false, true, UserConfig.selectedAccount, null);
                launchActivity.u0(true);
                break;
            case 1:
                org.telegram.ui.tm tmVar = (org.telegram.ui.tm) this.b;
                EditText editText = (EditText) this.c;
                c2Var.dismiss();
                tmVar.run(editText.getText().toString());
                break;
            case 2:
                d4 d4Var = (d4) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String trim = d4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim) ? false : c5.a.matcher(trim.trim()).matches()) {
                    callback.run(trim);
                    c2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(d4Var);
                    break;
                }
            case 3:
                String str = (String) this.b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(o2Var.getCurrentAccount()).getInviteText(1));
                    o2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                qc0 qc0Var = (qc0) this.c;
                int i11 = encryptedChat.ttl;
                int value = qc0Var.getValue();
                if (value >= 0 && value < 16) {
                    encryptedChat.ttl = value;
                } else if (value == 16) {
                    encryptedChat.ttl = 30;
                } else if (value == 17) {
                    encryptedChat.ttl = 60;
                } else if (value == 18) {
                    encryptedChat.ttl = 3600;
                } else if (value == 19) {
                    encryptedChat.ttl = 86400;
                } else if (value == 20) {
                    encryptedChat.ttl = 604800;
                }
                if (i11 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    break;
                }
                break;
            case 5:
                ((eg.b0) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 6:
                String str2 = (String) this.b;
                Runnable runnable = (Runnable) this.c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + str2);
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                ((MessagesStorage.BooleanCallback) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 8:
                ((Utilities.Callback) this.b).run(Boolean.valueOf(((boolean[]) this.c)[0]));
                break;
            case 9:
                org.telegram.ui.xr xrVar = (org.telegram.ui.xr) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.fy fyVar = (org.telegram.ui.fy) xrVar.b;
                ArrayList arrayList = (ArrayList) xrVar.c;
                fyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l10 = (Long) arrayList.get(i12);
                    long longValue = l10.longValue();
                    if (z10) {
                        fyVar.getMessagesController().reportSpam(longValue, fyVar.getMessagesController().getUser(l10), null, null, false);
                    }
                    if (z11) {
                        fyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    fyVar.getMessagesController().blockPeer(longValue);
                }
                fyVar.b4(false);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 24:
            default:
                Context context = (Context) this.b;
                File file = (File) this.c;
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent2);
                break;
            case 19:
                ((rt) this.b).run(((jh.m) this.c).getText().toString().trim());
                break;
            case 21:
                b40 b40Var = (b40) this.b;
                HashtagSearchController.getInstance(b40Var.a).removeHashtagFromHistory((String) this.c);
                b40Var.f.N(true);
                break;
            case 22:
                r90 r90Var = (r90) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                y90 y90Var = r90Var.a;
                y90Var.getMessagesController().getStoriesController().s(y90Var.e, arrayList2);
                y90Var.R.L(false);
                break;
            case 23:
                tn0 tn0Var = (tn0) this.b;
                ArrayList<MessageObject> arrayList3 = (ArrayList) this.c;
                tn0Var.getClass();
                c2Var.dismiss();
                tn0Var.F0.getDownloadController().deleteRecentFiles(arrayList3);
                tn0Var.Q(false);
                break;
            case 25:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new lh.o5(12));
                break;
        }
    }

    @Override // org.telegram.ui.Components.vi
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.b;
        xm xmVar = (xm) this.c;
        if (!arrayList.isEmpty()) {
            callback.run(new ch.h((MessageObject) arrayList.get(0)));
        }
        xmVar.dismiss(true);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        ts0 ts0Var = (ts0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        qu0 qu0Var = ts0Var.d;
        qu0Var.r1.finishFragment();
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
        if (o2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            o2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) o2Var, NotificationCenter.closeChats);
        }
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(qu0Var.f1), user, null, Boolean.valueOf(z10));
        o2Var.getMessagesController().setSavedViewAs(false);
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean b(float f9, float f10, int i10, View view) {
        u51 u51Var = (u51) this.b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.c;
        w41 G = u51Var.U2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f9), Float.valueOf(f10))).booleanValue();
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void r(float f9) {
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
