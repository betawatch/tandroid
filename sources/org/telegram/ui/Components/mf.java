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
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf implements b5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, dj, org.telegram.ui.ActionBar.m1, org.telegram.ui.ActionBar.a2, bl0, MessagesStorage.BooleanCallback, al0, cl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        switch (this.a) {
            case 0:
                nf nfVar = (nf) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = nfVar.a;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.bo boVar = chatActivityEnterView.O2;
                of2.sendMessageChatArguments = boVar != null ? boVar.C8() : null;
                of2.effect_id = chatActivityEnterView.S4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                ve veVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                veVar.setEffect(0L);
                break;
            case 1:
                ((lg) this.b).o((t0.j) this.c, z10, i10, i11);
                break;
            case 2:
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
                    if (!(view instanceof org.telegram.ui.Cells.r8)) {
                        unVar.r.m(unVar.I0);
                        break;
                    } else {
                        unVar.U((org.telegram.ui.Cells.r8) view, true);
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

    @Override // org.telegram.ui.Cells.s5
    public void b(org.telegram.ui.Cells.t5 t5Var) {
        TLRPC.Chat chat;
        hm hmVar = (hm) this.b;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.v0;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = viVar.Q0;
            org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
            if (i10 != 0 || viVar.H) {
                return;
            }
            int intValue = ((Integer) t5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.X(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                new vc(viVar.r1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && viVar.S1 >= 0 && hashMap.size() >= viVar.S1) {
                if (!viVar.T1 || !(n2Var instanceof org.telegram.ui.bo) || (chat = ((org.telegram.ui.bo) n2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.L == 2) {
                    return;
                }
                c5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.a).o();
                if (chatAttachAlertPhotoLayout.L == 1) {
                    chatAttachAlertPhotoLayout.L = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.t1.size() : -1;
            if ((n2Var instanceof org.telegram.ui.bo) && viVar.T1) {
                t5Var.b(size, z11, true);
            } else {
                t5Var.b(-1, z11, true);
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
            t5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            t5Var2.setHighQuality(photoEntry.isHighQuality());
            t5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.al0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 16:
                e61 e61Var = (e61) this.b;
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.c;
                i51 G = e61Var.Y2.G(i10);
                if (G != null) {
                    callback5.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                    break;
                }
                break;
            case 23:
                DataSettingsActivity.U((DataSettingsActivity) this.b, (Context) this.c, view, i10, f7);
                break;
            case 26:
                org.telegram.ui.uy.f0((org.telegram.ui.uy) this.b, (org.telegram.ui.ty) this.c, view, i10);
                break;
            default:
                FiltersSetupActivity.U((FiltersSetupActivity) this.b, (Context) this.c, view, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        x5 x5Var;
        sv svVar = (sv) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof jv) || (x5Var = ((jv) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(svVar.getContext(), true, true);
        f1Var.setItemHeight(48);
        f1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        f1Var.setText(LocaleController.getString(R.string.Copy));
        f1Var.getTextView().setTextSize(1, 14.4f);
        f1Var.getTextView().setTypeface(AndroidUtilities.bold());
        f1Var.setOnClickListener(new dt(1, svVar, x5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = svVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(svVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(f1Var);
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        svVar.G = n1Var;
        n1Var.setClippingEnabled(true);
        svVar.G.g();
        svVar.G.setInputMethodMode(2);
        svVar.G.setSoftInputMode(0);
        svVar.G.setOutsideTouchable(true);
        svVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        svVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
            case 16:
                break;
            case 23:
                break;
            case 26:
                break;
        }
        return false;
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

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 9:
                ((au) this.b).run(((fi.o) this.c).getText().toString().trim());
                break;
            case 10:
            case 14:
            case 16:
            case 17:
            case 18:
            case 23:
            default:
                org.telegram.ui.tw twVar = (org.telegram.ui.tw) this.b;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.c;
                twVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                org.telegram.ui.uy uyVar = twVar.b;
                uyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                uyVar.getMessagesController().removeFilter(dialogFilter);
                uyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                break;
            case 11:
                d40 d40Var = (d40) this.b;
                HashtagSearchController.getInstance(d40Var.a).removeHashtagFromHistory((String) this.c);
                d40Var.f.N(true);
                break;
            case 12:
                u90 u90Var = (u90) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ba0 ba0Var = u90Var.a;
                ba0Var.getMessagesController().getStoriesController().s(ba0Var.e, arrayList);
                ba0Var.V.L(false);
                break;
            case 13:
                yn0 yn0Var = (yn0) this.b;
                ArrayList<MessageObject> arrayList2 = (ArrayList) this.c;
                yn0Var.getClass();
                b2Var.dismiss();
                yn0Var.J0.getDownloadController().deleteRecentFiles(arrayList2);
                yn0Var.Q(false);
                break;
            case 15:
                Runnable runnable = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.t7(15));
                break;
            case 19:
                Context context = (Context) this.b;
                File file = (File) this.c;
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent);
                break;
            case 20:
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ssVar.getClass();
                ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                arrayList3.add(user);
                ssVar.getContactsController().deleteContact(arrayList3, true);
                if (user != null) {
                    user.contact = false;
                }
                ssVar.finishFragment();
                break;
            case 21:
                ContactsActivity.X((ContactsActivity) this.b, (String) this.c);
                break;
            case 22:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.dt dtVar = contactsActivity.W;
                if (dtVar != null) {
                    dtVar.b(user2);
                    contactsActivity.W = null;
                    break;
                }
                break;
            case 24:
                org.telegram.ui.nv.U((org.telegram.ui.nv) this.b, (TLRPC.User) this.c);
                break;
            case 25:
                ((org.telegram.ui.uy) this.b).getMediaDataController().removeWebapp(((TLRPC.User) this.c).id);
                break;
        }
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

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.al0
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

    public /* synthetic */ mf(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 22;
        this.b = contactsActivity;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean c(float f7, float f10, int i10, View view) {
        e61 e61Var = (e61) this.b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.c;
        i51 G = e61Var.Y2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void q(float f7) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void i(View view, float f7, float f10) {
    }

    private final /* synthetic */ void j(View view, float f7, float f10) {
    }

    private final /* synthetic */ void k(View view, float f7, float f10) {
    }
}
