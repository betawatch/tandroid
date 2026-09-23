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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements org.telegram.ui.ActionBar.a2, d5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, ej, org.telegram.ui.ActionBar.m1, cl0, MessagesStorage.BooleanCallback, bl0, dl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        switch (this.a) {
            case 1:
                of ofVar = (of) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = ofVar.a;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
                of2.sendMessageChatArguments = xnVar != null ? xnVar.C8() : null;
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
                el elVar = (el) this.b;
                gl glVar = (gl) this.c;
                hl hlVar = elVar.b;
                hlVar.x0.b(glVar.c, hlVar.y0, z10, i10, 0L);
                hlVar.b.dismiss(true);
                break;
            default:
                vn vnVar = (vn) this.b;
                View view = (View) this.c;
                if (!z10) {
                    vnVar.getClass();
                    break;
                } else {
                    vnVar.V = i10;
                    vnVar.U = 0;
                    if (!(view instanceof org.telegram.ui.Cells.s8)) {
                        vnVar.r.m(vnVar.I0);
                        break;
                    } else {
                        vnVar.U((org.telegram.ui.Cells.s8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void a() {
        to toVar = (to) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (toVar.c != null) {
            toVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            toVar.a();
        }
    }

    @Override // org.telegram.ui.Cells.s5
    public void b(org.telegram.ui.Cells.t5 t5Var) {
        TLRPC.Chat chat;
        im imVar = (im) this.b;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.v0;
        wi wiVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = wiVar.Q0;
            org.telegram.ui.ActionBar.n2 n2Var = wiVar.f0;
            if (i10 != 0 || wiVar.H) {
                return;
            }
            int intValue = ((Integer) t5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.X(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                new xc(wiVar.r1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && wiVar.S1 >= 0 && hashMap.size() >= wiVar.S1) {
                if (!wiVar.T1 || !(n2Var instanceof org.telegram.ui.xn) || (chat = ((org.telegram.ui.xn) n2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.L == 2) {
                    return;
                }
                e5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.a).o();
                if (chatAttachAlertPhotoLayout.L == 1) {
                    chatAttachAlertPhotoLayout.L = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.t1.size() : -1;
            if ((n2Var instanceof org.telegram.ui.xn) && wiVar.T1) {
                t5Var.b(size, z11, true);
            } else {
                t5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
            im imVar2 = chatAttachAlertPhotoLayout.v;
            if (imVar == imVar2) {
                im imVar3 = chatAttachAlertPhotoLayout.G;
                if (imVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    intValue++;
                }
                if (imVar3.f && intValue >= chatAttachAlertPhotoLayout.M0) {
                    intValue++;
                }
                imVar3.m(intValue);
            } else {
                imVar2.m(intValue);
            }
            wiVar.V1(containsKey ? 2 : 1);
            t5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            t5Var2.setHighQuality(photoEntry.isHighQuality());
            t5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 17:
                d61 d61Var = (d61) this.b;
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.c;
                h51 G = d61Var.Y2.G(i10);
                if (G != null) {
                    callback5.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                    break;
                }
                break;
            case 24:
                DataSettingsActivity.U((DataSettingsActivity) this.b, (Context) this.c, view, i10, f7);
                break;
            default:
                org.telegram.ui.ry.e0((org.telegram.ui.ry) this.b, (org.telegram.ui.qy) this.c, view, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        z5 z5Var;
        tv tvVar = (tv) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof kv) || (z5Var = ((kv) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(tvVar.getContext(), true, true);
        f1Var.setItemHeight(48);
        f1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        f1Var.setText(LocaleController.getString(R.string.Copy));
        f1Var.getTextView().setTextSize(1, 14.4f);
        f1Var.getTextView().setTypeface(AndroidUtilities.bold());
        f1Var.setOnClickListener(new et(1, tvVar, z5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = tvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
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

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
            case 17:
                break;
            case 24:
                break;
        }
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        om omVar = (om) this.b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
        omVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && omVar.d.getBitmap() == null) {
            if (omVar.d.getBitmap() != null && !omVar.d.getBitmap().isRecycled()) {
                omVar.d.getBitmap().recycle();
                omVar.d.setImageBitmap((Bitmap) null);
            }
            omVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                b3 b3Var = (b3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.ry ryVar = (org.telegram.ui.ry) b3Var.b;
                ArrayList arrayList = (ArrayList) b3Var.c;
                ryVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l4 = (Long) arrayList.get(i11);
                    long longValue = l4.longValue();
                    if (z10) {
                        ryVar.getMessagesController().reportSpam(longValue, ryVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        ryVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    ryVar.getMessagesController().blockPeer(longValue);
                }
                ryVar.b4(false);
                break;
            case 10:
                ((bu) this.b).run(((fi.o) this.c).getText().toString().trim());
                break;
            case 12:
                e40 e40Var = (e40) this.b;
                HashtagSearchController.getInstance(e40Var.a).removeHashtagFromHistory((String) this.c);
                e40Var.f.N(true);
                break;
            case 13:
                v90 v90Var = (v90) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ca0 ca0Var = v90Var.a;
                ca0Var.getMessagesController().getStoriesController().s(ca0Var.e, arrayList2);
                ca0Var.V.L(false);
                break;
            case 14:
                yn0 yn0Var = (yn0) this.b;
                ArrayList<MessageObject> arrayList3 = (ArrayList) this.c;
                yn0Var.getClass();
                b2Var.dismiss();
                yn0Var.J0.getDownloadController().deleteRecentFiles(arrayList3);
                yn0Var.Q(false);
                break;
            case 16:
                Runnable runnable = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.u7(15));
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
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                nsVar.getClass();
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                arrayList4.add(user);
                nsVar.getContactsController().deleteContact(arrayList4, true);
                if (user != null) {
                    user.contact = false;
                }
                nsVar.finishFragment();
                break;
            case 22:
                ContactsActivity.X((ContactsActivity) this.b, (String) this.c);
                break;
            case 23:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.zs zsVar = contactsActivity.W;
                if (zsVar != null) {
                    zsVar.b(user2);
                    contactsActivity.W = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.kv.U((org.telegram.ui.kv) this.b, (TLRPC.User) this.c);
                break;
            case 26:
                ((org.telegram.ui.ry) this.b).getMediaDataController().removeWebapp(((TLRPC.User) this.c).id);
                break;
            default:
                org.telegram.ui.qw qwVar = (org.telegram.ui.qw) this.b;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.c;
                qwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                org.telegram.ui.ry ryVar2 = qwVar.b;
                ryVar2.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                ryVar2.getMessagesController().removeFilter(dialogFilter);
                ryVar2.getMessagesStorage().deleteDialogFilter(dialogFilter);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ej
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.b;
        dn dnVar = (dn) this.c;
        if (!arrayList.isEmpty()) {
            callback.run(new rh.g((MessageObject) arrayList.get(0)));
        }
        dnVar.dismiss(true);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        ct0 ct0Var = (ct0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        yu0 yu0Var = ct0Var.d;
        yu0Var.v1.finishFragment();
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.v1;
        if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            n2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
        }
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(yu0Var.j1), user, null, Boolean.valueOf(z10));
        n2Var.getMessagesController().setSavedViewAs(false);
    }

    public /* synthetic */ b3(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 23;
        this.b = contactsActivity;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.dl0
    public boolean c(float f7, float f10, int i10, View view) {
        d61 d61Var = (d61) this.b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.c;
        h51 G = d61Var.Y2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override // org.telegram.ui.Components.dl0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.dl0
    public /* synthetic */ void q(float f7) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void i(View view, float f7, float f10) {
    }

    private final /* synthetic */ void j(View view, float f7, float f10) {
    }
}
