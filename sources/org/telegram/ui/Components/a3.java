package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
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
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements org.telegram.ui.ActionBar.a2, c5, org.telegram.ui.Cells.t5, ImageReceiver.ImageReceiverDelegate, dj, org.telegram.ui.ActionBar.m1, ol0, MessagesStorage.BooleanCallback, nl0, pl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.c5
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        switch (this.a) {
            case 1:
                of ofVar = (of) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = ofVar.a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.zn znVar = chatActivityEnterView.P2;
                of2.sendMessageChatArguments = znVar != null ? znVar.C8() : null;
                of2.effect_id = chatActivityEnterView.S4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                xe xeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                xeVar.setEffect(0L);
                break;
            case 2:
                ((mg) this.b).o((t0.i) this.c, z10, i10, i11);
                break;
            case 3:
                dl dlVar = (dl) this.b;
                fl flVar = (fl) this.c;
                gl glVar = dlVar.b;
                glVar.x0.b(flVar.c, glVar.y0, z10, i10, 0L);
                glVar.b.dismiss(true);
                break;
            default:
                un unVar = (un) this.b;
                View view = (View) this.c;
                if (!z10) {
                    unVar.getClass();
                    break;
                } else {
                    unVar.V = i10;
                    unVar.U = 0;
                    if (!(view instanceof org.telegram.ui.Cells.s8)) {
                        unVar.r.m(unVar.I0);
                        break;
                    } else {
                        unVar.U((org.telegram.ui.Cells.s8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void a() {
        so soVar = (so) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (soVar.c != null) {
            soVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            soVar.a();
        }
    }

    @Override // org.telegram.ui.Cells.t5
    public void b(org.telegram.ui.Cells.u5 u5Var) {
        TLRPC.Chat chat;
        hm hmVar = (hm) this.b;
        org.telegram.ui.Cells.u5 u5Var2 = (org.telegram.ui.Cells.u5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.v0;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = viVar.Q0;
            org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
            if (i10 != 0 || viVar.H) {
                return;
            }
            int intValue = ((Integer) u5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = u5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.X(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                new xc(viVar.r1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && viVar.S1 >= 0 && hashMap.size() >= viVar.S1) {
                if (!viVar.T1 || !(n2Var instanceof org.telegram.ui.zn) || (chat = ((org.telegram.ui.zn) n2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.L == 2) {
                    return;
                }
                d5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.a).o();
                if (chatAttachAlertPhotoLayout.L == 1) {
                    chatAttachAlertPhotoLayout.L = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.t1.size() : -1;
            if ((n2Var instanceof org.telegram.ui.zn) && viVar.T1) {
                u5Var.b(size, z11, true);
            } else {
                u5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
            hm hmVar2 = chatAttachAlertPhotoLayout.v;
            if (hmVar == hmVar2) {
                hm hmVar3 = chatAttachAlertPhotoLayout.G;
                if (hmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    intValue++;
                }
                if (hmVar3.f && intValue >= chatAttachAlertPhotoLayout.M0) {
                    intValue++;
                }
                hmVar3.m(intValue);
            } else {
                hmVar2.m(intValue);
            }
            viVar.V1(containsKey ? 2 : 1);
            u5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            u5Var2.setHighQuality(photoEntry.isHighQuality());
            u5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 17:
                u61 u61Var = (u61) this.b;
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.c;
                y51 G = u61Var.Y2.G(i10);
                if (G != null) {
                    callback5.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                    break;
                }
                break;
            case 24:
                DataSettingsActivity.U((DataSettingsActivity) this.b, (Context) this.c, view, i10, f7);
                break;
            default:
                org.telegram.ui.uy.f0((org.telegram.ui.uy) this.b, (org.telegram.ui.ty) this.c, view, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
            case 17:
                break;
            case 24:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        y5 y5Var;
        tv tvVar = (tv) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof kv) || (y5Var = ((kv) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(tvVar.getContext(), true, true);
        f1Var.setItemHeight(48);
        f1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        f1Var.setText(LocaleController.getString(R.string.Copy));
        f1Var.getTextView().setTextSize(1, 14.4f);
        f1Var.getTextView().setTypeface(AndroidUtilities.bold());
        f1Var.setOnClickListener(new dt(1, tvVar, y5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = tvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(tvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(f1Var);
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        tvVar.G = n1Var;
        n1Var.setClippingEnabled(true);
        tvVar.G.g();
        tvVar.G.setInputMethodMode(2);
        tvVar.G.setSoftInputMode(0);
        tvVar.G.setOutsideTouchable(true);
        tvVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        tvVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        nm nmVar = (nm) this.b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
        nmVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && nmVar.d.getBitmap() == null) {
            if (nmVar.d.getBitmap() != null && !nmVar.d.getBitmap().isRecycled()) {
                nmVar.d.getBitmap().recycle();
                nmVar.d.setImageBitmap((Bitmap) null);
            }
            nmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.dj
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.b;
        cn cnVar = (cn) this.c;
        if (!arrayList.isEmpty()) {
            callback.run(new rh.g((MessageObject) arrayList.get(0)));
        }
        cnVar.dismiss(true);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                a3 a3Var = (a3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) a3Var.b;
                ArrayList arrayList = (ArrayList) a3Var.c;
                uyVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l4 = (Long) arrayList.get(i11);
                    long longValue = l4.longValue();
                    if (z10) {
                        uyVar.getMessagesController().reportSpam(longValue, uyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        uyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    uyVar.getMessagesController().blockPeer(longValue);
                }
                uyVar.b4(false);
                break;
            case 10:
                ((au) this.b).run(((fi.o) this.c).getText().toString().trim());
                break;
            case 12:
                d40 d40Var = (d40) this.b;
                HashtagSearchController.getInstance(d40Var.a).removeHashtagFromHistory((String) this.c);
                d40Var.f.N(true);
                break;
            case 13:
                fa0 fa0Var = (fa0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ma0 ma0Var = fa0Var.a;
                ma0Var.getMessagesController().getStoriesController().s(ma0Var.e, arrayList2);
                ma0Var.V.L(false);
                break;
            case 14:
                no0 no0Var = (no0) this.b;
                ArrayList<MessageObject> arrayList3 = (ArrayList) this.c;
                no0Var.getClass();
                b2Var.dismiss();
                no0Var.K0.getDownloadController().deleteRecentFiles(arrayList3);
                no0Var.R(false);
                break;
            case 16:
                Runnable runnable = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.t7(15));
                break;
            case 20:
                Context context = (Context) this.b;
                File file = (File) this.c;
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent);
                break;
            case 21:
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ssVar.getClass();
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                arrayList4.add(user);
                ssVar.getContactsController().deleteContact(arrayList4, true);
                if (user != null) {
                    user.contact = false;
                }
                ssVar.finishFragment();
                break;
            case 22:
                ContactsActivity.X((ContactsActivity) this.b, (String) this.c);
                break;
            case 23:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.dt dtVar = contactsActivity.W;
                if (dtVar != null) {
                    dtVar.b(user2);
                    contactsActivity.W = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.ov.U((org.telegram.ui.ov) this.b, (TLRPC.User) this.c);
                break;
            case 26:
                ((org.telegram.ui.uy) this.b).getMediaDataController().removeWebapp(((TLRPC.User) this.c).id);
                break;
            default:
                org.telegram.ui.tw twVar = (org.telegram.ui.tw) this.b;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.c;
                twVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                org.telegram.ui.uy uyVar2 = twVar.b;
                uyVar2.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                uyVar2.getMessagesController().removeFilter(dialogFilter);
                uyVar2.getMessagesStorage().deleteDialogFilter(dialogFilter);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void q0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        pt0 pt0Var = (pt0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        lv0 lv0Var = pt0Var.d;
        lv0Var.v1.finishFragment();
        org.telegram.ui.ActionBar.n2 n2Var = lv0Var.v1;
        if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            n2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
        }
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(lv0Var.j1), user, null, Boolean.valueOf(z10));
        n2Var.getMessagesController().setSavedViewAs(false);
    }

    public /* synthetic */ a3(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 23;
        this.b = contactsActivity;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.pl0
    public boolean c(float f7, float f10, int i10, View view) {
        u61 u61Var = (u61) this.b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.c;
        y51 G = u61Var.Y2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override // org.telegram.ui.Components.pl0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.pl0
    public /* synthetic */ void q(float f7) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void f(View view, float f7, float f10) {
    }

    private final /* synthetic */ void i(View view, float f7, float f10) {
    }
}
