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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements org.telegram.ui.ActionBar.a2, f5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, hj, org.telegram.ui.ActionBar.m1, gm0, MessagesStorage.BooleanCallback, fm0, hm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        switch (this.a) {
            case 2:
                rf rfVar = (rf) this.c;
                String str = (String) this.b;
                ChatActivityEnterView chatActivityEnterView = rfVar.a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.zn znVar = chatActivityEnterView.P2;
                of2.sendMessageChatArguments = znVar != null ? znVar.H8() : null;
                of2.effect_id = chatActivityEnterView.S4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                af afVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                afVar.setEffect(0L);
                break;
            case 3:
                ((pg) this.c).o((t0.i) this.b, z10, i10, i11);
                break;
            case 4:
                ul ulVar = (ul) this.c;
                wl wlVar = (wl) this.b;
                xl xlVar = ulVar.b;
                xlVar.x0.b(wlVar.c, xlVar.y0, z10, i10, 0L);
                xlVar.b.dismiss(true);
                break;
            default:
                lo loVar = (lo) this.c;
                View view = (View) this.b;
                if (!z10) {
                    loVar.getClass();
                    break;
                } else {
                    loVar.V = i10;
                    loVar.U = 0;
                    if (!(view instanceof org.telegram.ui.Cells.r8)) {
                        loVar.r.m(loVar.I0);
                        break;
                    } else {
                        loVar.X((org.telegram.ui.Cells.r8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ boolean Y0(View view) {
        switch (this.a) {
            case 18:
                break;
            case 25:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void a() {
        ip ipVar = (ip) this.c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        if (ipVar.c != null) {
            ipVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            ipVar.a();
        }
    }

    @Override // org.telegram.ui.Cells.s5
    public void b(org.telegram.ui.Cells.t5 t5Var) {
        TLRPC.Chat chat;
        ym ymVar = (ym) this.c;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ymVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.v0;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = yiVar.T0;
            org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
            if (i10 != 0 || yiVar.H) {
                return;
            }
            int intValue = ((Integer) t5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.X(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                new ad(yiVar.u1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && yiVar.V1 >= 0 && hashMap.size() >= yiVar.V1) {
                if (!yiVar.W1 || !(n2Var instanceof org.telegram.ui.zn) || (chat = ((org.telegram.ui.zn) n2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.L == 2) {
                    return;
                }
                g5.N(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.a).o();
                if (chatAttachAlertPhotoLayout.L == 1) {
                    chatAttachAlertPhotoLayout.L = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.t1.size() : -1;
            if ((n2Var instanceof org.telegram.ui.zn) && yiVar.W1) {
                t5Var.b(size, z11, true);
            } else {
                t5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
            ym ymVar2 = chatAttachAlertPhotoLayout.v;
            if (ymVar == ymVar2) {
                ym ymVar3 = chatAttachAlertPhotoLayout.G;
                if (ymVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    intValue++;
                }
                if (ymVar3.f && intValue >= chatAttachAlertPhotoLayout.M0) {
                    intValue++;
                }
                ymVar3.m(intValue);
            } else {
                ymVar2.m(intValue);
            }
            yiVar.Z1(containsKey ? 2 : 1);
            t5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            t5Var2.setHighQuality(photoEntry.isHighQuality());
            t5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.fm0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 18:
                k71 k71Var = (k71) this.c;
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.b;
                p61 G = k71Var.W2.G(i10);
                if (G != null) {
                    callback5.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                    break;
                }
                break;
            case 25:
                DataSettingsActivity.U((DataSettingsActivity) this.c, (Context) this.b, view, i10, f7);
                break;
            default:
                org.telegram.ui.ty.c0((org.telegram.ui.ty) this.c, (org.telegram.ui.sy) this.b, view, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        b6 b6Var;
        iw iwVar = (iw) this.c;
        Context context = (Context) this.b;
        if (!(view instanceof zv) || (b6Var = ((zv) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(iwVar.getContext(), true, true);
        f1Var.setItemHeight(48);
        f1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        f1Var.setText(LocaleController.getString(R.string.Copy));
        f1Var.getTextView().setTextSize(1, 14.4f);
        f1Var.getTextView().setTypeface(AndroidUtilities.bold());
        f1Var.setOnClickListener(new ut(1, iwVar, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = iwVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(iwVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(f1Var);
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        iwVar.G = n1Var;
        n1Var.setClippingEnabled(true);
        iwVar.G.g();
        iwVar.G.setInputMethodMode(2);
        iwVar.G.setSoftInputMode(0);
        iwVar.G.setOutsideTouchable(true);
        iwVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        iwVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        en enVar = (en) this.c;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.b;
        enVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && enVar.d.getBitmap() == null) {
            if (enVar.d.getBitmap() != null && !enVar.d.getBitmap().isRecycled()) {
                enVar.d.getBitmap().recycle();
                enVar.d.setImageBitmap((Bitmap) null);
            }
            enVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
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
                ((MessagesStorage.BooleanCallback) this.c).run(((boolean[]) this.b)[0]);
                break;
            case 1:
                y2 y2Var = (y2) this.c;
                boolean[] zArr = (boolean[]) this.b;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) y2Var.c;
                ArrayList arrayList = (ArrayList) y2Var.b;
                tyVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l4 = (Long) arrayList.get(i11);
                    long longValue = l4.longValue();
                    if (z10) {
                        tyVar.getMessagesController().reportSpam(longValue, tyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        tyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    tyVar.getMessagesController().blockPeer(longValue);
                }
                tyVar.Y3(false);
                break;
            case 11:
                ((qu) this.c).run(((fi.o) this.b).getText().toString().trim());
                break;
            case 13:
                u40 u40Var = (u40) this.c;
                HashtagSearchController.getInstance(u40Var.a).removeHashtagFromHistory((String) this.b);
                u40Var.f.N(true);
                break;
            case 14:
                wa0 wa0Var = (wa0) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                db0 db0Var = wa0Var.a;
                db0Var.getMessagesController().getStoriesController().s(db0Var.e, arrayList2);
                db0Var.V.L(false);
                break;
            case 15:
                dp0 dp0Var = (dp0) this.c;
                ArrayList<MessageObject> arrayList3 = (ArrayList) this.b;
                dp0Var.getClass();
                b2Var.dismiss();
                dp0Var.J0.getDownloadController().deleteRecentFiles(arrayList3);
                dp0Var.Q(false);
                break;
            case 17:
                Runnable runnable = (Runnable) this.c;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.b;
                runnable.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.v7(15));
                break;
            case 21:
                Context context = (Context) this.c;
                File file = (File) this.b;
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent);
                break;
            case 22:
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) this.c;
                TLRPC.User user = (TLRPC.User) this.b;
                qsVar.getClass();
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                arrayList4.add(user);
                qsVar.getContactsController().deleteContact(arrayList4, true);
                if (user != null) {
                    user.contact = false;
                }
                qsVar.finishFragment();
                break;
            case 23:
                ContactsActivity.X((ContactsActivity) this.c, (String) this.b);
                break;
            case 24:
                ContactsActivity contactsActivity = (ContactsActivity) this.c;
                TLRPC.User user2 = (TLRPC.User) this.b;
                org.telegram.ui.bt btVar = contactsActivity.W;
                if (btVar != null) {
                    btVar.b(user2);
                    contactsActivity.W = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.mv.U((org.telegram.ui.mv) this.c, (TLRPC.User) this.b);
                break;
            default:
                ((org.telegram.ui.ty) this.c).getMediaDataController().removeWebapp(((TLRPC.User) this.b).id);
                break;
        }
    }

    @Override // org.telegram.ui.Components.hj
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.c;
        sn snVar = (sn) this.b;
        if (!arrayList.isEmpty()) {
            callback.run(new rh.g((MessageObject) arrayList.get(0)));
        }
        snVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ void n0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        fu0 fu0Var = (fu0) this.c;
        TLRPC.User user = (TLRPC.User) this.b;
        bw0 bw0Var = fu0Var.d;
        bw0Var.v1.finishFragment();
        org.telegram.ui.ActionBar.n2 n2Var = bw0Var.v1;
        if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            n2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
        }
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(bw0Var.j1), user, null, Boolean.valueOf(z10));
        n2Var.getMessagesController().setSavedViewAs(false);
    }

    public /* synthetic */ y2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 24;
        this.c = contactsActivity;
        this.b = user;
    }

    @Override // org.telegram.ui.Components.hm0
    public boolean c(float f7, float f10, int i10, View view) {
        k71 k71Var = (k71) this.c;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.b;
        p61 G = k71Var.W2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override // org.telegram.ui.Components.hm0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.hm0
    public /* synthetic */ void q(float f7) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void g(View view, float f7, float f10) {
    }

    private final /* synthetic */ void j(View view, float f7, float f10) {
    }
}
