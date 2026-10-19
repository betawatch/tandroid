package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
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
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements org.telegram.ui.ActionBar.a2, e5, org.telegram.ui.Cells.r5, ImageReceiver.ImageReceiverDelegate, cj, org.telegram.ui.ActionBar.l1, yl0, MessagesStorage.BooleanCallback, xl0, zl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        switch (this.a) {
            case 6:
                of ofVar = (of) this.c;
                String str = (String) this.b;
                ChatActivityEnterView chatActivityEnterView = ofVar.a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.qn qnVar = chatActivityEnterView.P2;
                of2.sendMessageChatArguments = qnVar != null ? qnVar.H8() : null;
                of2.effect_id = chatActivityEnterView.S4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                xe xeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                xeVar.setEffect(0L);
                break;
            case 7:
                ((ng) this.b).o((t0.i) this.c, z10, i10, i11);
                break;
            case 8:
                ol olVar = (ol) this.b;
                ql qlVar = (ql) this.c;
                rl rlVar = olVar.b;
                rlVar.x0.b(qlVar.c, rlVar.y0, z10, i10, 0L);
                rlVar.b.dismiss(true);
                break;
            default:
                fo foVar = (fo) this.b;
                View view = (View) this.c;
                if (!z10) {
                    foVar.getClass();
                    break;
                } else {
                    foVar.V = i10;
                    foVar.U = 0;
                    if (!(view instanceof org.telegram.ui.Cells.q8)) {
                        foVar.r.m(foVar.I0);
                        break;
                    } else {
                        foVar.X((org.telegram.ui.Cells.q8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        a6 a6Var;
        aw awVar = (aw) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof rv) || (a6Var = ((rv) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(awVar.getContext(), true, true);
        e1Var.setItemHeight(48);
        e1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        e1Var.setText(LocaleController.getString(R.string.Copy));
        e1Var.getTextView().setTextSize(1, 14.4f);
        e1Var.getTextView().setTypeface(AndroidUtilities.bold());
        e1Var.setOnClickListener(new ca(11, awVar, a6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = awVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(awVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(e1Var);
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        awVar.G = m1Var;
        m1Var.setClippingEnabled(true);
        awVar.G.g();
        awVar.G.setInputMethodMode(2);
        awVar.G.setSoftInputMode(0);
        awVar.G.setOutsideTouchable(true);
        awVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        awVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void b() {
        cp cpVar = (cp) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (cpVar.c != null) {
            cpVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            cpVar.a();
        }
    }

    @Override // org.telegram.ui.Cells.r5
    public void c(org.telegram.ui.Cells.s5 s5Var) {
        TLRPC.Chat chat;
        sm smVar = (sm) this.b;
        org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = smVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.v0;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = tiVar.T0;
            org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
            if (i10 != 0 || tiVar.H) {
                return;
            }
            int intValue = ((Integer) s5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = s5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.X(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                new xc(tiVar.u1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && tiVar.V1 >= 0 && hashMap.size() >= tiVar.V1) {
                if (!tiVar.W1 || !(n2Var instanceof org.telegram.ui.qn) || (chat = ((org.telegram.ui.qn) n2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.L == 2) {
                    return;
                }
                f5.N(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.a).o();
                if (chatAttachAlertPhotoLayout.L == 1) {
                    chatAttachAlertPhotoLayout.L = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.t1.size() : -1;
            if ((n2Var instanceof org.telegram.ui.qn) && tiVar.W1) {
                s5Var.b(size, z11, true);
            } else {
                s5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
            sm smVar2 = chatAttachAlertPhotoLayout.v;
            if (smVar == smVar2) {
                sm smVar3 = chatAttachAlertPhotoLayout.G;
                if (smVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    intValue++;
                }
                if (smVar3.f && intValue >= chatAttachAlertPhotoLayout.M0) {
                    intValue++;
                }
                smVar3.m(intValue);
            } else {
                smVar2.m(intValue);
            }
            tiVar.Z1(containsKey ? 2 : 1);
            s5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            s5Var2.setHighQuality(photoEntry.isHighQuality());
            s5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 22:
                b71 b71Var = (b71) this.b;
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.c;
                g61 G = b71Var.W2.G(i10);
                if (G != null) {
                    callback5.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                    break;
                }
                break;
            default:
                DataSettingsActivity.U((DataSettingsActivity) this.b, (Context) this.c, view, i10, f7);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ym ymVar = (ym) this.b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
        ymVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && ymVar.d.getBitmap() == null) {
            if (ymVar.d.getBitmap() != null && !ymVar.d.getBitmap().isRecycled()) {
                ymVar.d.getBitmap().recycle();
                ymVar.d.setImageBitmap((Bitmap) null);
            }
            ymVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.k5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(n2Var.getCurrentAccount()).getInviteText(1));
                    n2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                od0 od0Var = (od0) this.c;
                int i11 = encryptedChat.ttl;
                int value = od0Var.getValue();
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
            case 2:
                ((org.telegram.ui.fa) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 3:
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
            case 4:
                ((MessagesStorage.BooleanCallback) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 5:
                org.telegram.ui.xu xuVar = (org.telegram.ui.xu) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) xuVar.c;
                ArrayList arrayList = (ArrayList) xuVar.b;
                cyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l4 = (Long) arrayList.get(i12);
                    long longValue = l4.longValue();
                    if (z10) {
                        cyVar.getMessagesController().reportSpam(longValue, cyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        cyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    cyVar.getMessagesController().blockPeer(longValue);
                }
                cyVar.Z3(false);
                break;
            case 15:
                ((hu) this.b).run(((ai.t) this.c).getText().toString().trim());
                break;
            case 17:
                m40 m40Var = (m40) this.c;
                HashtagSearchController.getInstance(m40Var.a).removeHashtagFromHistory((String) this.b);
                m40Var.f.N(true);
                break;
            case 18:
                pa0 pa0Var = (pa0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                wa0 wa0Var = pa0Var.a;
                wa0Var.getMessagesController().getStoriesController().s(wa0Var.e, arrayList2);
                wa0Var.V.L(false);
                break;
            case 19:
                vo0 vo0Var = (vo0) this.b;
                ArrayList<MessageObject> arrayList3 = (ArrayList) this.c;
                vo0Var.getClass();
                b2Var.dismiss();
                vo0Var.J0.getDownloadController().deleteRecentFiles(arrayList3);
                vo0Var.Q(false);
                break;
            case 21:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ci.e6(15));
                break;
            case 25:
                Context context = (Context) this.b;
                File file = (File) this.c;
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent2);
                break;
            case 26:
                org.telegram.ui.fs fsVar = (org.telegram.ui.fs) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                fsVar.getClass();
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                arrayList4.add(user);
                fsVar.getContactsController().deleteContact(arrayList4, true);
                if (user != null) {
                    user.contact = false;
                }
                fsVar.finishFragment();
                break;
            case 27:
                ContactsActivity.X((ContactsActivity) this.c, (String) this.b);
                break;
            default:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.qs qsVar = contactsActivity.W;
                if (qsVar != null) {
                    qsVar.b(user2);
                    contactsActivity.W = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.cj
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.b;
        mn mnVar = (mn) this.c;
        if (!arrayList.isEmpty()) {
            callback.run(new sh.g((MessageObject) arrayList.get(0)));
        }
        mnVar.dismiss(true);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.k5.b(this, imageReceiver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        xt0 xt0Var = (xt0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        tv0 tv0Var = xt0Var.d;
        tv0Var.v1.finishFragment();
        org.telegram.ui.ActionBar.n2 n2Var = tv0Var.v1;
        if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            n2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
        }
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(tv0Var.j1), user, null, Boolean.valueOf(z10));
        n2Var.getMessagesController().setSavedViewAs(false);
    }

    public /* synthetic */ q2(String str, int i10, Object obj) {
        this.a = i10;
        this.c = obj;
        this.b = str;
    }

    public /* synthetic */ q2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 28;
        this.b = contactsActivity;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean d(float f7, float f10, int i10, View view) {
        b71 b71Var = (b71) this.b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.c;
        g61 G = b71Var.W2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override // org.telegram.ui.Components.zl0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.zl0
    public /* synthetic */ void o(float f7) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void f(View view, float f7, float f10) {
    }
}
