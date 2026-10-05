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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements org.telegram.ui.ActionBar.a2, d5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, gj, org.telegram.ui.ActionBar.m1, ol0, MessagesStorage.BooleanCallback, nl0, pl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.d5
    public void K(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        switch (this.a) {
            case 3:
                qf qfVar = (qf) this.c;
                String str = (String) this.b;
                ChatActivityEnterView chatActivityEnterView = qfVar.a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
                of2.sendMessageChatArguments = ynVar != null ? ynVar.D8() : null;
                of2.effect_id = chatActivityEnterView.S4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                ze zeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                zeVar.setEffect(0L);
                break;
            case 4:
                ((og) this.b).o((t0.i) this.c, z10, i10, i11);
                break;
            case 5:
                gl glVar = (gl) this.b;
                il ilVar = (il) this.c;
                jl jlVar = glVar.b;
                jlVar.x0.b(ilVar.c, jlVar.y0, z10, i10, 0L);
                jlVar.b.dismiss(true);
                break;
            default:
                xn xnVar = (xn) this.b;
                View view = (View) this.c;
                if (!z10) {
                    xnVar.getClass();
                    break;
                } else {
                    xnVar.V = i10;
                    xnVar.U = 0;
                    if (!(view instanceof org.telegram.ui.Cells.r8)) {
                        xnVar.r.m(xnVar.I0);
                        break;
                    } else {
                        xnVar.S((org.telegram.ui.Cells.r8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.Cells.s5
    public void a(org.telegram.ui.Cells.t5 t5Var) {
        TLRPC.Chat chat;
        km kmVar = (km) this.b;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.v0;
        xi xiVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = xiVar.Q0;
            org.telegram.ui.ActionBar.n2 n2Var = xiVar.f0;
            if (i10 != 0 || xiVar.H) {
                return;
            }
            int intValue = ((Integer) t5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.W(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout)) {
                new yc(xiVar.r1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && xiVar.S1 >= 0 && hashMap.size() >= xiVar.S1) {
                if (!xiVar.T1 || !(n2Var instanceof org.telegram.ui.yn) || (chat = ((org.telegram.ui.yn) n2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.L == 2) {
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
            if ((n2Var instanceof org.telegram.ui.yn) && xiVar.T1) {
                t5Var.b(size, z11, true);
            } else {
                t5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.O(photoEntry, intValue);
            km kmVar2 = chatAttachAlertPhotoLayout.v;
            if (kmVar == kmVar2) {
                km kmVar3 = chatAttachAlertPhotoLayout.G;
                if (kmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    intValue++;
                }
                if (kmVar3.f && intValue >= chatAttachAlertPhotoLayout.M0) {
                    intValue++;
                }
                kmVar3.m(intValue);
            } else {
                kmVar2.m(intValue);
            }
            xiVar.U1(containsKey ? 2 : 1);
            t5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            t5Var2.setHighQuality(photoEntry.isHighQuality());
            t5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void b() {
        vo voVar = (vo) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (voVar.c != null) {
            voVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            voVar.a();
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 19:
                e71 e71Var = (e71) this.b;
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.c;
                h61 G = e71Var.f3.G(i10);
                if (G != null) {
                    callback5.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                    break;
                }
                break;
            case 26:
                DataSettingsActivity.S((DataSettingsActivity) this.b, (Context) this.c, view, i10, f7);
                break;
            default:
                org.telegram.ui.uy.e0((org.telegram.ui.uy) this.b, (org.telegram.ui.ty) this.c, view, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        z5 z5Var;
        wv wvVar = (wv) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof nv) || (z5Var = ((nv) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(wvVar.getContext(), true, true);
        f1Var.setItemHeight(48);
        f1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        f1Var.setText(LocaleController.getString(R.string.Copy));
        f1Var.getTextView().setTextSize(1, 14.4f);
        f1Var.getTextView().setTypeface(AndroidUtilities.bold());
        f1Var.setOnClickListener(new gt(1, wvVar, z5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = wvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(wvVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(f1Var);
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        wvVar.G = n1Var;
        n1Var.setClippingEnabled(true);
        wvVar.G.g();
        wvVar.G.setInputMethodMode(2);
        wvVar.G.setSoftInputMode(0);
        wvVar.G.setOutsideTouchable(true);
        wvVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        wvVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        qm qmVar = (qm) this.b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
        qmVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && qmVar.d.getBitmap() == null) {
            if (qmVar.d.getBitmap() != null && !qmVar.d.getBitmap().isRecycled()) {
                qmVar.d.getBitmap().recycle();
                qmVar.d.setImageBitmap((Bitmap) null);
            }
            qmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
            case 19:
                break;
            case 26:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                Runnable runnable = (Runnable) this.c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + str);
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ((MessagesStorage.BooleanCallback) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 2:
                org.telegram.ui.pw pwVar = (org.telegram.ui.pw) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) pwVar.b;
                ArrayList arrayList = (ArrayList) pwVar.c;
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
                uyVar.k4(false);
                break;
            case 12:
                ((du) this.b).run(((fi.o) this.c).getText().toString().trim());
                break;
            case 14:
                h40 h40Var = (h40) this.c;
                HashtagSearchController.getInstance(h40Var.a).removeHashtagFromHistory((String) this.b);
                h40Var.f.N(true);
                break;
            case 15:
                ia0 ia0Var = (ia0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                pa0 pa0Var = ia0Var.a;
                pa0Var.getMessagesController().getStoriesController().s(pa0Var.e, arrayList2);
                pa0Var.V.L(false);
                break;
            case 16:
                qo0 qo0Var = (qo0) this.b;
                ArrayList<MessageObject> arrayList3 = (ArrayList) this.c;
                qo0Var.getClass();
                b2Var.dismiss();
                qo0Var.L0.getDownloadController().deleteRecentFiles(arrayList3);
                qo0Var.S(false);
                break;
            case 18:
                Runnable runnable2 = (Runnable) this.c;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.b;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.u7(15));
                break;
            case 22:
                Context context = (Context) this.b;
                File file = (File) this.c;
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent);
                break;
            case 23:
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                qsVar.getClass();
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                arrayList4.add(user);
                qsVar.getContactsController().deleteContact(arrayList4, true);
                if (user != null) {
                    user.contact = false;
                }
                qsVar.finishFragment();
                break;
            case 24:
                ContactsActivity.W((ContactsActivity) this.c, (String) this.b);
                break;
            case 25:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.bt btVar = contactsActivity.W;
                if (btVar != null) {
                    btVar.b(user2);
                    contactsActivity.W = null;
                    break;
                }
                break;
            case 27:
                org.telegram.ui.nv.S((org.telegram.ui.nv) this.b, (TLRPC.User) this.c);
                break;
            default:
                ((org.telegram.ui.uy) this.b).getMediaDataController().removeWebapp(((TLRPC.User) this.c).id);
                break;
        }
    }

    @Override // org.telegram.ui.Components.gj
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.b;
        fn fnVar = (fn) this.c;
        if (!arrayList.isEmpty()) {
            callback.run(new rh.g((MessageObject) arrayList.get(0)));
        }
        fnVar.dismiss(true);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        ut0 ut0Var = (ut0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        qv0 qv0Var = ut0Var.d;
        qv0Var.v1.finishFragment();
        org.telegram.ui.ActionBar.n2 n2Var = qv0Var.v1;
        if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            n2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
        }
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(qv0Var.j1), user, null, Boolean.valueOf(z10));
        n2Var.getMessagesController().setSavedViewAs(false);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    public /* synthetic */ w2(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ w2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 25;
        this.b = contactsActivity;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.pl0
    public boolean c(float f7, float f10, int i10, View view) {
        e71 e71Var = (e71) this.b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.c;
        h61 G = e71Var.f3.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override // org.telegram.ui.Components.pl0
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.pl0
    public /* synthetic */ void q(float f7) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void f(View view, float f7, float f10) {
    }

    private final /* synthetic */ void h(View view, float f7, float f10) {
    }
}
