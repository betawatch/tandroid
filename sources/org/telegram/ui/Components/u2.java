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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements org.telegram.ui.ActionBar.z1, f5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, ej, org.telegram.ui.ActionBar.l1, cm0, MessagesStorage.BooleanCallback, bm0, dm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        switch (this.a) {
            case 4:
                qf qfVar = (qf) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = qfVar.a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.fo foVar = chatActivityEnterView.P2;
                of2.sendMessageChatArguments = foVar != null ? foVar.H8() : null;
                of2.effect_id = chatActivityEnterView.S4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                ze zeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                zeVar.setEffect(0L);
                break;
            case 5:
                ((og) this.b).o((t0.j) this.c, z10, i10, i11);
                break;
            case 6:
                ql qlVar = (ql) this.b;
                sl slVar = (sl) this.c;
                tl tlVar = qlVar.b;
                tlVar.x0.b(slVar.c, tlVar.y0, z10, i10, 0L);
                tlVar.b.dismiss(true);
                break;
            default:
                io ioVar = (io) this.b;
                View view = (View) this.c;
                if (!z10) {
                    ioVar.getClass();
                    break;
                } else {
                    ioVar.V = i10;
                    ioVar.U = 0;
                    if (!(view instanceof org.telegram.ui.Cells.r8)) {
                        ioVar.r.m(ioVar.I0);
                        break;
                    } else {
                        ioVar.X((org.telegram.ui.Cells.r8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        b6 b6Var;
        ew ewVar = (ew) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof vv) || (b6Var = ((vv) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(ewVar.getContext(), true, true);
        e1Var.setItemHeight(48);
        e1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        e1Var.setText(LocaleController.getString(R.string.Copy));
        e1Var.getTextView().setTextSize(1, 14.4f);
        e1Var.getTextView().setTypeface(AndroidUtilities.bold());
        e1Var.setOnClickListener(new rt(1, ewVar, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = ewVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(e1Var);
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        ewVar.G = m1Var;
        m1Var.setClippingEnabled(true);
        ewVar.G.g();
        ewVar.G.setInputMethodMode(2);
        ewVar.G.setSoftInputMode(0);
        ewVar.G.setOutsideTouchable(true);
        ewVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        ewVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void b() {
        fp fpVar = (fp) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (fpVar.c != null) {
            fpVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            fpVar.a();
        }
    }

    @Override // org.telegram.ui.Cells.s5
    public void c(org.telegram.ui.Cells.t5 t5Var) {
        TLRPC.Chat chat;
        um umVar = (um) this.b;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = umVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.v0;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = viVar.T0;
            org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
            if (i10 != 0 || viVar.H) {
                return;
            }
            int intValue = ((Integer) t5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.X(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                new zc(viVar.u1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", m2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && viVar.V1 >= 0 && hashMap.size() >= viVar.V1) {
                if (!viVar.W1 || !(m2Var instanceof org.telegram.ui.fo) || (chat = ((org.telegram.ui.fo) m2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.L == 2) {
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
            if ((m2Var instanceof org.telegram.ui.fo) && viVar.W1) {
                t5Var.b(size, z11, true);
            } else {
                t5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
            um umVar2 = chatAttachAlertPhotoLayout.v;
            if (umVar == umVar2) {
                um umVar3 = chatAttachAlertPhotoLayout.G;
                if (umVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    intValue++;
                }
                if (umVar3.f && intValue >= chatAttachAlertPhotoLayout.M0) {
                    intValue++;
                }
                umVar3.m(intValue);
            } else {
                umVar2.m(intValue);
            }
            viVar.Z1(containsKey ? 2 : 1);
            t5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            t5Var2.setHighQuality(photoEntry.isHighQuality());
            t5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 20:
                i71 i71Var = (i71) this.b;
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.c;
                m61 G = i71Var.W2.G(i10);
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
        bn bnVar = (bn) this.b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
        bnVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && bnVar.d.getBitmap() == null) {
            if (bnVar.d.getBitmap() != null && !bnVar.d.getBitmap().isRecycled()) {
                bnVar.d.getBitmap().recycle();
                bnVar.d.setImageBitmap((Bitmap) null);
            }
            bnVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.ia) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 1:
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
            case 2:
                ((MessagesStorage.BooleanCallback) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 3:
                org.telegram.ui.qw qwVar = (org.telegram.ui.qw) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) qwVar.b;
                ArrayList arrayList = (ArrayList) qwVar.c;
                yyVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l4 = (Long) arrayList.get(i11);
                    long longValue = l4.longValue();
                    if (z10) {
                        yyVar.getMessagesController().reportSpam(longValue, yyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        yyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    yyVar.getMessagesController().blockPeer(longValue);
                }
                yyVar.Z3(false);
                break;
            case 13:
                ((mu) this.b).run(((gi.o) this.c).getText().toString().trim());
                break;
            case 15:
                q40 q40Var = (q40) this.b;
                HashtagSearchController.getInstance(q40Var.a).removeHashtagFromHistory((String) this.c);
                q40Var.f.N(true);
                break;
            case 16:
                va0 va0Var = (va0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                cb0 cb0Var = va0Var.a;
                cb0Var.getMessagesController().getStoriesController().s(cb0Var.e, arrayList2);
                cb0Var.V.L(false);
                break;
            case 17:
                zo0 zo0Var = (zo0) this.b;
                ArrayList<MessageObject> arrayList3 = (ArrayList) this.c;
                zo0Var.getClass();
                a2Var.dismiss();
                zo0Var.J0.getDownloadController().deleteRecentFiles(arrayList3);
                zo0Var.Q(false);
                break;
            case 19:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new bi.g7(15));
                break;
            case 23:
                Context context = (Context) this.b;
                File file = (File) this.c;
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent);
                break;
            case 24:
                org.telegram.ui.ws wsVar = (org.telegram.ui.ws) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                wsVar.getClass();
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                arrayList4.add(user);
                wsVar.getContactsController().deleteContact(arrayList4, true);
                if (user != null) {
                    user.contact = false;
                }
                wsVar.finishFragment();
                break;
            case 25:
                ContactsActivity.X((ContactsActivity) this.b, (String) this.c);
                break;
            case 26:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ht htVar = contactsActivity.W;
                if (htVar != null) {
                    htVar.b(user2);
                    contactsActivity.W = null;
                    break;
                }
                break;
            case 28:
                org.telegram.ui.sv.U((org.telegram.ui.sv) this.b, (TLRPC.User) this.c);
                break;
            default:
                ((org.telegram.ui.yy) this.b).getMediaDataController().removeWebapp(((TLRPC.User) this.c).id);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ej
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.b;
        pn pnVar = (pn) this.c;
        if (!arrayList.isEmpty()) {
            callback.run(new sh.g((MessageObject) arrayList.get(0)));
        }
        pnVar.dismiss(true);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        bu0 bu0Var = (bu0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        xv0 xv0Var = bu0Var.d;
        xv0Var.v1.finishFragment();
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.v1;
        if (m2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            m2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) m2Var, NotificationCenter.closeChats);
        }
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(xv0Var.j1), user, null, Boolean.valueOf(z10));
        m2Var.getMessagesController().setSavedViewAs(false);
    }

    public /* synthetic */ u2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 26;
        this.b = contactsActivity;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean d(float f7, float f10, int i10, View view) {
        i71 i71Var = (i71) this.b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.c;
        m61 G = i71Var.W2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void q(float f7) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void f(View view, float f7, float f10) {
    }
}
