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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements org.telegram.ui.ActionBar.z1, d5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, fj, org.telegram.ui.ActionBar.l1, ol0, MessagesStorage.BooleanCallback, nl0, pl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        switch (this.a) {
            case 2:
                pf pfVar = (pf) this.c;
                String str = (String) this.b;
                ChatActivityEnterView chatActivityEnterView = pfVar.a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
                of2.sendMessageChatArguments = wnVar != null ? wnVar.C8() : null;
                of2.effect_id = chatActivityEnterView.S4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                ye yeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                yeVar.setEffect(0L);
                break;
            case 3:
                ((ng) this.c).o((t0.i) this.b, z10, i10, i11);
                break;
            case 4:
                fl flVar = (fl) this.c;
                hl hlVar = (hl) this.b;
                il ilVar = flVar.b;
                ilVar.x0.b(hlVar.c, ilVar.y0, z10, i10, 0L);
                ilVar.b.dismiss(true);
                break;
            default:
                wn wnVar2 = (wn) this.c;
                View view = (View) this.b;
                if (!z10) {
                    wnVar2.getClass();
                    break;
                } else {
                    wnVar2.V = i10;
                    wnVar2.U = 0;
                    if (!(view instanceof org.telegram.ui.Cells.r8)) {
                        wnVar2.r.m(wnVar2.I0);
                        break;
                    } else {
                        wnVar2.U((org.telegram.ui.Cells.r8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.Cells.s5
    public void a(org.telegram.ui.Cells.t5 t5Var) {
        TLRPC.Chat chat;
        jm jmVar = (jm) this.c;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = jmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.v0;
        wi wiVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = wiVar.Q0;
            org.telegram.ui.ActionBar.m2 m2Var = wiVar.f0;
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
                new yc(wiVar.r1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", m2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && wiVar.S1 >= 0 && hashMap.size() >= wiVar.S1) {
                if (!wiVar.T1 || !(m2Var instanceof org.telegram.ui.wn) || (chat = ((org.telegram.ui.wn) m2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.L == 2) {
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
            if ((m2Var instanceof org.telegram.ui.wn) && wiVar.T1) {
                t5Var.b(size, z11, true);
            } else {
                t5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
            jm jmVar2 = chatAttachAlertPhotoLayout.v;
            if (jmVar == jmVar2) {
                jm jmVar3 = chatAttachAlertPhotoLayout.G;
                if (jmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    intValue++;
                }
                if (jmVar3.f && intValue >= chatAttachAlertPhotoLayout.M0) {
                    intValue++;
                }
                jmVar3.m(intValue);
            } else {
                jmVar2.m(intValue);
            }
            wiVar.V1(containsKey ? 2 : 1);
            t5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            t5Var2.setHighQuality(photoEntry.isHighQuality());
            t5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void b() {
        uo uoVar = (uo) this.c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        if (uoVar.c != null) {
            uoVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            uoVar.a();
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 18:
                t61 t61Var = (t61) this.c;
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.b;
                x51 G = t61Var.Y2.G(i10);
                if (G != null) {
                    callback5.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                    break;
                }
                break;
            case 25:
                DataSettingsActivity.U((DataSettingsActivity) this.c, (Context) this.b, view, i10, f7);
                break;
            default:
                org.telegram.ui.qy.e0((org.telegram.ui.qy) this.c, (org.telegram.ui.py) this.b, view, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        z5 z5Var;
        vv vvVar = (vv) this.c;
        Context context = (Context) this.b;
        if (!(view instanceof mv) || (z5Var = ((mv) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(vvVar.getContext(), true, true);
        e1Var.setItemHeight(48);
        e1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        e1Var.setText(LocaleController.getString(R.string.Copy));
        e1Var.getTextView().setTextSize(1, 14.4f);
        e1Var.getTextView().setTypeface(AndroidUtilities.bold());
        e1Var.setOnClickListener(new ft(1, vvVar, z5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = vvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(vvVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(e1Var);
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        vvVar.G = m1Var;
        m1Var.setClippingEnabled(true);
        vvVar.G.g();
        vvVar.G.setInputMethodMode(2);
        vvVar.G.setSoftInputMode(0);
        vvVar.G.setOutsideTouchable(true);
        vvVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        vvVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
            case 18:
                break;
            case 25:
                break;
        }
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        pm pmVar = (pm) this.c;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.b;
        pmVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && pmVar.d.getBitmap() == null) {
            if (pmVar.d.getBitmap() != null && !pmVar.d.getBitmap().isRecycled()) {
                pmVar.d.getBitmap().recycle();
                pmVar.d.setImageBitmap((Bitmap) null);
            }
            pmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                ((MessagesStorage.BooleanCallback) this.c).run(((boolean[]) this.b)[0]);
                break;
            case 1:
                w2 w2Var = (w2) this.c;
                boolean[] zArr = (boolean[]) this.b;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) w2Var.c;
                ArrayList arrayList = (ArrayList) w2Var.b;
                qyVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l4 = (Long) arrayList.get(i11);
                    long longValue = l4.longValue();
                    if (z10) {
                        qyVar.getMessagesController().reportSpam(longValue, qyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        qyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    qyVar.getMessagesController().blockPeer(longValue);
                }
                qyVar.b4(false);
                break;
            case 11:
                ((cu) this.c).run(((fi.o) this.b).getText().toString().trim());
                break;
            case 13:
                g40 g40Var = (g40) this.c;
                HashtagSearchController.getInstance(g40Var.a).removeHashtagFromHistory((String) this.b);
                g40Var.f.N(true);
                break;
            case 14:
                ia0 ia0Var = (ia0) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                pa0 pa0Var = ia0Var.a;
                pa0Var.getMessagesController().getStoriesController().s(pa0Var.e, arrayList2);
                pa0Var.V.L(false);
                break;
            case 15:
                no0 no0Var = (no0) this.c;
                ArrayList<MessageObject> arrayList3 = (ArrayList) this.b;
                no0Var.getClass();
                a2Var.dismiss();
                no0Var.J0.getDownloadController().deleteRecentFiles(arrayList3);
                no0Var.Q(false);
                break;
            case 17:
                Runnable runnable = (Runnable) this.c;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.b;
                runnable.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.u7(15));
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
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) this.c;
                TLRPC.User user = (TLRPC.User) this.b;
                msVar.getClass();
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                arrayList4.add(user);
                msVar.getContactsController().deleteContact(arrayList4, true);
                if (user != null) {
                    user.contact = false;
                }
                msVar.finishFragment();
                break;
            case 23:
                ContactsActivity.X((ContactsActivity) this.c, (String) this.b);
                break;
            case 24:
                ContactsActivity contactsActivity = (ContactsActivity) this.c;
                TLRPC.User user2 = (TLRPC.User) this.b;
                org.telegram.ui.xs xsVar = contactsActivity.W;
                if (xsVar != null) {
                    xsVar.b(user2);
                    contactsActivity.W = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.jv.U((org.telegram.ui.jv) this.c, (TLRPC.User) this.b);
                break;
            default:
                ((org.telegram.ui.qy) this.c).getMediaDataController().removeWebapp(((TLRPC.User) this.b).id);
                break;
        }
    }

    @Override // org.telegram.ui.Components.fj
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.c;
        en enVar = (en) this.b;
        if (!arrayList.isEmpty()) {
            callback.run(new rh.g((MessageObject) arrayList.get(0)));
        }
        enVar.dismiss(true);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        pt0 pt0Var = (pt0) this.c;
        TLRPC.User user = (TLRPC.User) this.b;
        lv0 lv0Var = pt0Var.d;
        lv0Var.v1.finishFragment();
        org.telegram.ui.ActionBar.m2 m2Var = lv0Var.v1;
        if (m2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            m2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) m2Var, NotificationCenter.closeChats);
        }
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(lv0Var.j1), user, null, Boolean.valueOf(z10));
        m2Var.getMessagesController().setSavedViewAs(false);
    }

    public /* synthetic */ w2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 24;
        this.c = contactsActivity;
        this.b = user;
    }

    @Override // org.telegram.ui.Components.pl0
    public boolean c(float f7, float f10, int i10, View view) {
        t61 t61Var = (t61) this.c;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.b;
        x51 G = t61Var.Y2.G(i10);
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

    private final /* synthetic */ void i(View view, float f7, float f10) {
    }

    private final /* synthetic */ void j(View view, float f7, float f10) {
    }
}
