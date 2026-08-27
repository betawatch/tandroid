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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements org.telegram.ui.ActionBar.a2, x4, org.telegram.ui.Cells.p5, ImageReceiver.ImageReceiverDelegate, oi, org.telegram.ui.ActionBar.m1, rk0, MessagesStorage.BooleanCallback, qk0, sk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        switch (this.a) {
            case 10:
                af afVar = (af) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = afVar.a;
                long j10 = chatActivityEnterView.L2;
                MessageObject messageObject = chatActivityEnterView.O2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
                of2.sendMessageChatArguments = rnVar != null ? rnVar.C8() : null;
                of2.effect_id = chatActivityEnterView.N4;
                SendMessagesHelper.getInstance(chatActivityEnterView.M).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.i0.c();
                ke keVar = chatActivityEnterView.F0;
                chatActivityEnterView.N4 = 0L;
                keVar.setEffect(0L);
                break;
            case 11:
                ((zf) this.b).o((t0.j) this.c, z10, i10, i11);
                break;
            case 12:
                qk qkVar = (qk) this.b;
                sk skVar = (sk) this.c;
                tk tkVar = qkVar.b;
                tkVar.t0.d(skVar.c, tkVar.u0, z10, i10, 0L);
                tkVar.b.dismiss(true);
                break;
            default:
                in inVar = (in) this.b;
                View view = (View) this.c;
                if (!z10) {
                    inVar.getClass();
                    break;
                } else {
                    inVar.R = i10;
                    inVar.Q = 0;
                    if (!(view instanceof org.telegram.ui.Cells.l8)) {
                        inVar.r.m(inVar.E0);
                        break;
                    } else {
                        inVar.U((org.telegram.ui.Cells.l8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        t5 t5Var;
        cv cvVar = (cv) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof tu) || (t5Var = ((tu) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(cvVar.getContext(), true, true);
        f1Var.setItemHeight(48);
        f1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        f1Var.setText(LocaleController.getString(R.string.Copy));
        f1Var.getTextView().setTextSize(1, 14.4f);
        f1Var.getTextView().setTypeface(AndroidUtilities.bold());
        f1Var.setOnClickListener(new q2(19, cvVar, t5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = cvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(cvVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(f1Var);
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        cvVar.C = n1Var;
        n1Var.setClippingEnabled(true);
        cvVar.C.g();
        cvVar.C.setInputMethodMode(2);
        cvVar.C.setSoftInputMode(0);
        cvVar.C.setOutsideTouchable(true);
        cvVar.C.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        cvVar.C.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void b() {
        go goVar = (go) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (goVar.c != null) {
            goVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            goVar.a();
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        k51 k51Var = (k51) this.b;
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.c;
        n41 G = k51Var.U2.G(i10);
        if (G == null) {
            return;
        }
        callback5.run(G, view, Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11));
    }

    @Override // org.telegram.ui.Cells.p5
    public void d(org.telegram.ui.Cells.q5 q5Var) {
        TLRPC.Chat chat;
        ul ulVar = (ul) this.b;
        org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ulVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.r0;
        gi giVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = giVar.M0;
            org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
            if (i10 != 0 || giVar.D) {
                return;
            }
            int intValue = ((Integer) q5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = q5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.X(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                new mc(giVar.n1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && giVar.O1 >= 0 && hashMap.size() >= giVar.O1) {
                if (!giVar.P1 || !(n2Var instanceof org.telegram.ui.rn) || (chat = ((org.telegram.ui.rn) n2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.H == 2) {
                    return;
                }
                y4.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.a).o();
                if (chatAttachAlertPhotoLayout.H == 1) {
                    chatAttachAlertPhotoLayout.H = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.p1.size() : -1;
            if ((n2Var instanceof org.telegram.ui.rn) && giVar.P1) {
                q5Var.b(size, z11, true);
            } else {
                q5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
            ul ulVar2 = chatAttachAlertPhotoLayout.v;
            if (ulVar == ulVar2) {
                ul ulVar3 = chatAttachAlertPhotoLayout.C;
                if (ulVar3.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                    intValue++;
                }
                if (ulVar3.f && intValue >= chatAttachAlertPhotoLayout.I0) {
                    intValue++;
                }
                ulVar3.m(intValue);
            } else {
                ulVar2.m(intValue);
            }
            giVar.V1(containsKey ? 2 : 1);
            q5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            q5Var2.setHighQuality(photoEntry.isHighQuality());
            q5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        bm bmVar = (bm) this.b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
        bmVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && bmVar.d.getBitmap() == null) {
            if (bmVar.d.getBitmap() != null && !bmVar.d.getBitmap().isRecycled()) {
                bmVar.d.getBitmap().recycle();
                bmVar.d.setImageBitmap((Bitmap) null);
            }
            bmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
                org.telegram.ui.df dfVar = (org.telegram.ui.df) this.b;
                EditText editText = (EditText) this.c;
                b2Var.dismiss();
                dfVar.run(editText.getText().toString());
                break;
            case 2:
                z3 z3Var = (z3) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String trim = z3Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim) ? false : y4.a.matcher(trim.trim()).matches()) {
                    callback.run(trim);
                    b2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(z3Var);
                    break;
                }
            case 3:
                String str = (String) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(n2Var.getCurrentAccount()).getInviteText(1));
                    n2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 4:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                fc0 fc0Var = (fc0) this.c;
                int i11 = encryptedChat.ttl;
                int value = fc0Var.getValue();
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
                ((cg.a0) this.b).run(((boolean[]) this.c)[0]);
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
                org.telegram.ui.zr zrVar = (org.telegram.ui.zr) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.gy gyVar = (org.telegram.ui.gy) zrVar.b;
                ArrayList arrayList = (ArrayList) zrVar.c;
                gyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l10 = (Long) arrayList.get(i12);
                    long longValue = l10.longValue();
                    if (z10) {
                        gyVar.getMessagesController().reportSpam(longValue, gyVar.getMessagesController().getUser(l10), null, null, false);
                    }
                    if (z11) {
                        gyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    gyVar.getMessagesController().blockPeer(longValue);
                }
                gyVar.b4(false);
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
                ((kt) this.b).run(((hh.o) this.c).getText().toString().trim());
                break;
            case 21:
                s30 s30Var = (s30) this.b;
                HashtagSearchController.getInstance(s30Var.a).removeHashtagFromHistory((String) this.c);
                s30Var.f.N(true);
                break;
            case 22:
                h90 h90Var = (h90) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                o90 o90Var = h90Var.a;
                o90Var.getMessagesController().getStoriesController().s(o90Var.e, arrayList2);
                o90Var.R.L(false);
                break;
            case 23:
                jn0 jn0Var = (jn0) this.b;
                ArrayList<MessageObject> arrayList3 = (ArrayList) this.c;
                jn0Var.getClass();
                b2Var.dismiss();
                jn0Var.F0.getDownloadController().deleteRecentFiles(arrayList3);
                jn0Var.Q(false);
                break;
            case 25:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new jh.m5(12));
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.oi
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.b;
        qm qmVar = (qm) this.c;
        if (!arrayList.isEmpty()) {
            callback.run(new ah.h((MessageObject) arrayList.get(0)));
        }
        qmVar.dismiss(true);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        ks0 ks0Var = (ks0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        hu0 hu0Var = ks0Var.d;
        hu0Var.r1.finishFragment();
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
        if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            n2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
        }
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(hu0Var.f1), user, null, Boolean.valueOf(z10));
        n2Var.getMessagesController().setSavedViewAs(false);
    }

    @Override // org.telegram.ui.Components.sk0
    public boolean c(float f10, float f11, int i10, View view) {
        k51 k51Var = (k51) this.b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.c;
        n41 G = k51Var.U2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11))).booleanValue();
    }

    @Override // org.telegram.ui.Components.sk0
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.sk0
    public /* synthetic */ void s(float f10) {
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }
}
