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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements org.telegram.ui.ActionBar.c2, y4, org.telegram.ui.Cells.r5, ImageReceiver.ImageReceiverDelegate, ti, org.telegram.ui.ActionBar.o1, jl0, MessagesStorage.BooleanCallback, il0, kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        MessageObject threadMessage;
        switch (this.a) {
            case 9:
                ef efVar = (ef) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = efVar.a;
                long j10 = chatActivityEnterView.M2;
                MessageObject messageObject = chatActivityEnterView.P2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z4, i10, i11, null, false);
                org.telegram.ui.zn znVar = chatActivityEnterView.L2;
                of2.sendMessageChatArguments = znVar != null ? znVar.C8() : null;
                of2.effect_id = chatActivityEnterView.O4;
                SendMessagesHelper.getInstance(chatActivityEnterView.N).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.j0.c();
                oe oeVar = chatActivityEnterView.G0;
                chatActivityEnterView.O4 = 0L;
                oeVar.setEffect(0L);
                break;
            case 10:
                ((dg) this.b).o((t0.i) this.c, z4, i10, i11);
                break;
            case 11:
                xk xkVar = (xk) this.b;
                zk zkVar = (zk) this.c;
                al alVar = xkVar.b;
                alVar.u0.b(zkVar.c, alVar.v0, z4, i10, 0L);
                alVar.b.dismiss(true);
                break;
            default:
                pn pnVar = (pn) this.b;
                View view = (View) this.c;
                if (!z4) {
                    pnVar.getClass();
                    break;
                } else {
                    pnVar.S = i10;
                    pnVar.R = 0;
                    if (!(view instanceof org.telegram.ui.Cells.n8)) {
                        pnVar.r.m(pnVar.F0);
                        break;
                    } else {
                        pnVar.U((org.telegram.ui.Cells.n8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public void a() {
        no noVar = (no) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (noVar.c != null) {
            noVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            noVar.a();
        }
    }

    @Override // org.telegram.ui.Cells.r5
    public void b(org.telegram.ui.Cells.s5 s5Var) {
        TLRPC.Chat chat;
        dm dmVar = (dm) this.b;
        org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = dmVar.v;
        boolean z4 = chatAttachAlertPhotoLayout.s0;
        li liVar = chatAttachAlertPhotoLayout.b;
        if (z4) {
            int i10 = liVar.N0;
            org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
            if (i10 != 0 || liVar.E) {
                return;
            }
            int intValue = ((Integer) s5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = s5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.X(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.p1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                new qc(liVar.o1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", p2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z10 = !containsKey;
            if (!containsKey && liVar.P1 >= 0 && hashMap.size() >= liVar.P1) {
                if (!liVar.Q1 || !(p2Var instanceof org.telegram.ui.zn) || (chat = ((org.telegram.ui.zn) p2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.I == 2) {
                    return;
                }
                z4.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.a).o();
                if (chatAttachAlertPhotoLayout.I == 1) {
                    chatAttachAlertPhotoLayout.I = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.q1.size() : -1;
            if ((p2Var instanceof org.telegram.ui.zn) && liVar.Q1) {
                s5Var.b(size, z10, true);
            } else {
                s5Var.b(-1, z10, true);
            }
            chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
            dm dmVar2 = chatAttachAlertPhotoLayout.v;
            if (dmVar == dmVar2) {
                dm dmVar3 = chatAttachAlertPhotoLayout.D;
                if (dmVar3.d && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                    intValue++;
                }
                if (dmVar3.f && intValue >= chatAttachAlertPhotoLayout.J0) {
                    intValue++;
                }
                dmVar3.m(intValue);
            } else {
                dmVar2.m(intValue);
            }
            liVar.V1(containsKey ? 2 : 1);
            s5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            s5Var2.setHighQuality(photoEntry.isHighQuality());
            s5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        g61 g61Var = (g61) this.b;
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.c;
        i51 G = g61Var.V2.G(i10);
        if (G == null) {
            return;
        }
        callback5.run(G, view, Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11));
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        u5 u5Var;
        lv lvVar = (lv) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof cv) || (u5Var = ((cv) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(lvVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new w2(16, lvVar, u5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = lvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(lvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(linearLayout, -2, -2);
        lvVar.D = p1Var;
        p1Var.setClippingEnabled(true);
        lvVar.D.g();
        lvVar.D.setInputMethodMode(2);
        lvVar.D.setSoftInputMode(0);
        lvVar.D.setOutsideTouchable(true);
        lvVar.D.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        lvVar.D.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        km kmVar = (km) this.b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
        kmVar.getClass();
        if (z4 && !z10 && photoEntry != null && photoEntry.hasSpoiler && kmVar.d.getBitmap() == null) {
            if (kmVar.d.getBitmap() != null && !kmVar.d.getBitmap().isRecycled()) {
                kmVar.d.getBitmap().recycle();
                kmVar.d.setImageBitmap((Bitmap) null);
            }
            kmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.ti
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.b;
        ym ymVar = (ym) this.c;
        if (!arrayList.isEmpty()) {
            callback.run(new eh.h((MessageObject) arrayList.get(0)));
        }
        ymVar.dismiss(true);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                kh.a1 a1Var = (kh.a1) this.b;
                EditText editText = (EditText) this.c;
                d2Var.dismiss();
                a1Var.run(editText.getText().toString());
                break;
            case 1:
                a4 a4Var = (a4) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String trim = a4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim) ? false : z4.a.matcher(trim.trim()).matches()) {
                    callback.run(trim);
                    d2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(a4Var);
                    break;
                }
            case 2:
                String str = (String) this.b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(p2Var.getCurrentAccount()).getInviteText(1));
                    p2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                xc0 xc0Var = (xc0) this.c;
                int i11 = encryptedChat.ttl;
                int value = xc0Var.getValue();
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
            case 4:
                ((gg.a0) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 5:
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
            case 6:
                ((MessagesStorage.BooleanCallback) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 7:
                ((Utilities.Callback) this.b).run(Boolean.valueOf(((boolean[]) this.c)[0]));
                break;
            case 8:
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z4 = zArr[0];
                boolean z10 = zArr[1];
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) ssVar.b;
                ArrayList arrayList = (ArrayList) ssVar.c;
                qyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l10 = (Long) arrayList.get(i12);
                    long longValue = l10.longValue();
                    if (z4) {
                        qyVar.getMessagesController().reportSpam(longValue, qyVar.getMessagesController().getUser(l10), null, null, false);
                    }
                    if (z10) {
                        qyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    qyVar.getMessagesController().blockPeer(longValue);
                }
                qyVar.b4(false);
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 23:
            case 25:
            case 26:
            case 27:
            default:
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                psVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                psVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                psVar.finishFragment();
                break;
            case 18:
                ((tt) this.b).run(((lh.n) this.c).getText().toString().trim());
                break;
            case 20:
                g40 g40Var = (g40) this.b;
                HashtagSearchController.getInstance(g40Var.a).removeHashtagFromHistory((String) this.c);
                g40Var.f.N(true);
                break;
            case 21:
                x90 x90Var = (x90) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ea0 ea0Var = x90Var.a;
                ea0Var.getMessagesController().getStoriesController().s(ea0Var.e, arrayList3);
                ea0Var.S.L(false);
                break;
            case 22:
                co0 co0Var = (co0) this.b;
                ArrayList<MessageObject> arrayList4 = (ArrayList) this.c;
                co0Var.getClass();
                d2Var.dismiss();
                co0Var.G0.getDownloadController().deleteRecentFiles(arrayList4);
                co0Var.Q(false);
                break;
            case 24:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new nh.p5(11));
                break;
            case 28:
                Context context = (Context) this.b;
                File file = (File) this.c;
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent2);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z4) {
        bt0 bt0Var = (bt0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        yu0 yu0Var = bt0Var.d;
        yu0Var.s1.finishFragment();
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
        if (p2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            p2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) p2Var, NotificationCenter.closeChats);
        }
        p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(yu0Var.g1), user, null, Boolean.valueOf(z4));
        p2Var.getMessagesController().setSavedViewAs(false);
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean c(float f10, float f11, int i10, View view) {
        g61 g61Var = (g61) this.b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.c;
        i51 G = g61Var.V2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11))).booleanValue();
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p(float f10) {
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }
}
