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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf implements b5, org.telegram.ui.Cells.r5, ImageReceiver.ImageReceiverDelegate, dj, org.telegram.ui.ActionBar.n1, org.telegram.ui.ActionBar.b2, cl0, MessagesStorage.BooleanCallback, bl0, dl0 {
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

    @Override // org.telegram.ui.ActionBar.n1
    public void a() {
        so soVar = (so) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (soVar.c != null) {
            soVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            soVar.a();
        }
    }

    @Override // org.telegram.ui.Cells.r5
    public void b(org.telegram.ui.Cells.s5 s5Var) {
        TLRPC.Chat chat;
        hm hmVar = (hm) this.b;
        org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.v0;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = viVar.Q0;
            org.telegram.ui.ActionBar.o2 o2Var = viVar.f0;
            if (i10 != 0 || viVar.H) {
                return;
            }
            int intValue = ((Integer) s5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = s5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.X(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                new vc(viVar.r1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", o2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && viVar.S1 >= 0 && hashMap.size() >= viVar.S1) {
                if (!viVar.T1 || !(o2Var instanceof org.telegram.ui.bo) || (chat = ((org.telegram.ui.bo) o2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.L == 2) {
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
            if ((o2Var instanceof org.telegram.ui.bo) && viVar.T1) {
                s5Var.b(size, z11, true);
            } else {
                s5Var.b(-1, z11, true);
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
            s5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            s5Var2.setHighQuality(photoEntry.isHighQuality());
            s5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 16:
                f61 f61Var = (f61) this.b;
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.c;
                j51 G = f61Var.Y2.G(i10);
                if (G != null) {
                    callback5.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                    break;
                }
                break;
            case 23:
                DataSettingsActivity.U((DataSettingsActivity) this.b, (Context) this.c, view, i10, f7);
                break;
            case 26:
                org.telegram.ui.wy.f0((org.telegram.ui.wy) this.b, (org.telegram.ui.vy) this.c, view, i10);
                break;
            default:
                FiltersSetupActivity.U((FiltersSetupActivity) this.b, (Context) this.c, view, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        x5 x5Var;
        sv svVar = (sv) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof jv) || (x5Var = ((jv) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(svVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new dt(1, svVar, x5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = svVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(svVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        svVar.G = o1Var;
        o1Var.setClippingEnabled(true);
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

    @Override // org.telegram.ui.Components.bl0
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

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
                org.telegram.ui.vw vwVar = (org.telegram.ui.vw) this.b;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.c;
                vwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                org.telegram.ui.wy wyVar = vwVar.b;
                wyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                wyVar.getMessagesController().removeFilter(dialogFilter);
                wyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
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
                zn0 zn0Var = (zn0) this.b;
                ArrayList<MessageObject> arrayList2 = (ArrayList) this.c;
                zn0Var.getClass();
                c2Var.dismiss();
                zn0Var.K0.getDownloadController().deleteRecentFiles(arrayList2);
                zn0Var.R(false);
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
                org.telegram.ui.us usVar = (org.telegram.ui.us) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                usVar.getClass();
                ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                arrayList3.add(user);
                usVar.getContactsController().deleteContact(arrayList3, true);
                if (user != null) {
                    user.contact = false;
                }
                usVar.finishFragment();
                break;
            case 21:
                ContactsActivity.X((ContactsActivity) this.b, (String) this.c);
                break;
            case 22:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ft ftVar = contactsActivity.W;
                if (ftVar != null) {
                    ftVar.b(user2);
                    contactsActivity.W = null;
                    break;
                }
                break;
            case 24:
                org.telegram.ui.pv.U((org.telegram.ui.pv) this.b, (TLRPC.User) this.c);
                break;
            case 25:
                ((org.telegram.ui.wy) this.b).getMediaDataController().removeWebapp(((TLRPC.User) this.c).id);
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

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        dt0 dt0Var = (dt0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        zu0 zu0Var = dt0Var.d;
        zu0Var.v1.finishFragment();
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.v1;
        if (o2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            o2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) o2Var, NotificationCenter.closeChats);
        }
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(zu0Var.j1), user, null, Boolean.valueOf(z10));
        o2Var.getMessagesController().setSavedViewAs(false);
    }

    public /* synthetic */ mf(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 22;
        this.b = contactsActivity;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.dl0
    public boolean c(float f7, float f10, int i10, View view) {
        f61 f61Var = (f61) this.b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.c;
        j51 G = f61Var.Y2.G(i10);
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

    private final /* synthetic */ void k(View view, float f7, float f10) {
    }
}
