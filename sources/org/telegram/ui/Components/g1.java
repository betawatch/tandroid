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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements org.telegram.ui.ActionBar.b2, x4, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, si, org.telegram.ui.ActionBar.n1, ok0, MessagesStorage.BooleanCallback, nk0, pk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g1(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        MessageObject threadMessage;
        switch (this.a) {
            case 10:
                ef efVar = (ef) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = efVar.a;
                long j10 = chatActivityEnterView.L2;
                MessageObject messageObject = chatActivityEnterView.O2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z10, i9, i10, null, false);
                org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
                of2.sendMessageChatArguments = qnVar != null ? qnVar.C8() : null;
                of2.effect_id = chatActivityEnterView.N4;
                SendMessagesHelper.getInstance(chatActivityEnterView.M).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.i0.c();
                oe oeVar = chatActivityEnterView.F0;
                chatActivityEnterView.N4 = 0L;
                oeVar.setEffect(0L);
                break;
            case 11:
                ((dg) this.b).o((t0.j) this.c, z10, i9, i10);
                break;
            case 12:
                uk ukVar = (uk) this.b;
                wk wkVar = (wk) this.c;
                xk xkVar = ukVar.b;
                xkVar.t0.d(wkVar.c, xkVar.u0, z10, i9, 0L);
                xkVar.b.dismiss(true);
                break;
            default:
                jn jnVar = (jn) this.b;
                View view = (View) this.c;
                if (!z10) {
                    jnVar.getClass();
                    break;
                } else {
                    jnVar.R = i9;
                    jnVar.Q = 0;
                    if (!(view instanceof org.telegram.ui.Cells.p8)) {
                        jnVar.r.m(jnVar.E0);
                        break;
                    } else {
                        jnVar.T((org.telegram.ui.Cells.p8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        t5 t5Var;
        dv dvVar = (dv) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof uu) || (t5Var = ((uu) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(dvVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new s2(18, dvVar, t5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = dvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        dvVar.C = o1Var;
        o1Var.setClippingEnabled(true);
        dvVar.C.g();
        dvVar.C.setInputMethodMode(2);
        dvVar.C.setSoftInputMode(0);
        dvVar.C.setOutsideTouchable(true);
        dvVar.C.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        dvVar.C.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void b() {
        io ioVar = (io) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (ioVar.c != null) {
            ioVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            ioVar.a();
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        i51 i51Var = (i51) this.b;
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.c;
        l41 G = i51Var.U2.G(i9);
        if (G == null) {
            return;
        }
        callback5.run(G, view, Integer.valueOf(i9), Float.valueOf(f10), Float.valueOf(f11));
    }

    @Override // org.telegram.ui.Cells.s5
    public void d(org.telegram.ui.Cells.t5 t5Var) {
        TLRPC.Chat chat;
        yl ylVar = (yl) this.b;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ylVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.r0;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i9 = kiVar.M0;
            org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
            if (i9 != 0 || kiVar.D) {
                return;
            }
            int intValue = ((Integer) t5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.W(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.M(chatAttachAlertPhotoLayout)) {
                new oc(kiVar.n1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", o2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && kiVar.O1 >= 0 && hashMap.size() >= kiVar.O1) {
                if (!kiVar.P1 || !(o2Var instanceof org.telegram.ui.qn) || (chat = ((org.telegram.ui.qn) o2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.H == 2) {
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
            if ((o2Var instanceof org.telegram.ui.qn) && kiVar.P1) {
                t5Var.b(size, z11, true);
            } else {
                t5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.P(photoEntry, intValue);
            yl ylVar2 = chatAttachAlertPhotoLayout.v;
            if (ylVar == ylVar2) {
                yl ylVar3 = chatAttachAlertPhotoLayout.C;
                if (ylVar3.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                    intValue++;
                }
                if (ylVar3.f && intValue >= chatAttachAlertPhotoLayout.I0) {
                    intValue++;
                }
                ylVar3.m(intValue);
            } else {
                ylVar2.m(intValue);
            }
            kiVar.V1(containsKey ? 2 : 1);
            t5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            t5Var2.setHighQuality(photoEntry.isHighQuality());
            t5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        em emVar = (em) this.b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
        emVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && emVar.d.getBitmap() == null) {
            if (emVar.d.getBitmap() != null && !emVar.d.getBitmap().isRecycled()) {
                emVar.d.getBitmap().recycle();
                emVar.d.setImageBitmap((Bitmap) null);
            }
            emVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
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
                c2Var.dismiss();
                dfVar.run(editText.getText().toString());
                break;
            case 2:
                z3 z3Var = (z3) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String trim = z3Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim) ? false : y4.a.matcher(trim.trim()).matches()) {
                    callback.run(trim);
                    c2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(z3Var);
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
                bc0 bc0Var = (bc0) this.c;
                int i10 = encryptedChat.ttl;
                int value = bc0Var.getValue();
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
                if (i10 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    break;
                }
                break;
            case 5:
                ((bg.d0) this.b).run(((boolean[]) this.c)[0]);
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
                org.telegram.ui.yr yrVar = (org.telegram.ui.yr) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.dy dyVar = (org.telegram.ui.dy) yrVar.b;
                ArrayList arrayList = (ArrayList) yrVar.c;
                dyVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l10 = (Long) arrayList.get(i11);
                    long longValue = l10.longValue();
                    if (z10) {
                        dyVar.getMessagesController().reportSpam(longValue, dyVar.getMessagesController().getUser(l10), null, null, false);
                    }
                    if (z11) {
                        dyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    dyVar.getMessagesController().blockPeer(longValue);
                }
                dyVar.b4(false);
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
                ((lt) this.b).run(((gh.o) this.c).getText().toString().trim());
                break;
            case 21:
                n30 n30Var = (n30) this.b;
                HashtagSearchController.getInstance(n30Var.a).removeHashtagFromHistory((String) this.c);
                n30Var.f.N(true);
                break;
            case 22:
                d90 d90Var = (d90) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                k90 k90Var = d90Var.a;
                k90Var.getMessagesController().getStoriesController().s(k90Var.e, arrayList2);
                k90Var.R.L(false);
                break;
            case 23:
                hn0 hn0Var = (hn0) this.b;
                ArrayList<MessageObject> arrayList3 = (ArrayList) this.c;
                hn0Var.getClass();
                c2Var.dismiss();
                hn0Var.F0.getDownloadController().deleteRecentFiles(arrayList3);
                hn0Var.Q(false);
                break;
            case 25:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ih.q5(12));
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.b;
        sm smVar = (sm) this.c;
        if (!arrayList.isEmpty()) {
            callback.run(new zg.g((MessageObject) arrayList.get(0)));
        }
        smVar.dismiss(true);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        is0 is0Var = (is0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        eu0 eu0Var = is0Var.d;
        eu0Var.r1.finishFragment();
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
        if (o2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            o2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) o2Var, NotificationCenter.closeChats);
        }
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(eu0Var.f1), user, null, Boolean.valueOf(z10));
        o2Var.getMessagesController().setSavedViewAs(false);
    }

    @Override // org.telegram.ui.Components.pk0
    public boolean c(float f10, float f11, int i9, View view) {
        i51 i51Var = (i51) this.b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.c;
        l41 G = i51Var.U2.G(i9);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i9), Float.valueOf(f10), Float.valueOf(f11))).booleanValue();
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void u(float f10) {
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
