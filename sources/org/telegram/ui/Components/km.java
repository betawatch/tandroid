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
import org.telegram.messenger.AccountInstance;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class km implements org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, c5, gj, org.telegram.ui.ActionBar.o1, org.telegram.ui.ActionBar.c2, ll0, MessagesStorage.BooleanCallback, kl0, ml0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ km(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        zn znVar = (zn) this.b;
        View view = (View) this.c;
        if (!z10) {
            znVar.getClass();
            return;
        }
        znVar.V = i10;
        znVar.U = 0;
        if (view instanceof org.telegram.ui.Cells.s8) {
            znVar.U((org.telegram.ui.Cells.s8) view, true);
        } else {
            znVar.r.m(znVar.I0);
        }
    }

    @Override // org.telegram.ui.Cells.s5
    public void a(org.telegram.ui.Cells.t5 t5Var) {
        TLRPC.Chat chat;
        nm nmVar = (nm) this.b;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.v0;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = yiVar.Q0;
            org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
            if (i10 != 0 || yiVar.H) {
                return;
            }
            int intValue = ((Integer) t5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.X(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                new wc(yiVar.r1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", p2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && yiVar.S1 >= 0 && hashMap.size() >= yiVar.S1) {
                if (!yiVar.T1 || !(p2Var instanceof org.telegram.ui.eo) || (chat = ((org.telegram.ui.eo) p2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.L == 2) {
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
            if ((p2Var instanceof org.telegram.ui.eo) && yiVar.T1) {
                t5Var.b(size, z11, true);
            } else {
                t5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
            nm nmVar2 = chatAttachAlertPhotoLayout.v;
            if (nmVar == nmVar2) {
                nm nmVar3 = chatAttachAlertPhotoLayout.G;
                if (nmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    intValue++;
                }
                if (nmVar3.f && intValue >= chatAttachAlertPhotoLayout.M0) {
                    intValue++;
                }
                nmVar3.m(intValue);
            } else {
                nmVar2.m(intValue);
            }
            yiVar.V1(containsKey ? 2 : 1);
            t5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            t5Var2.setHighQuality(photoEntry.isHighQuality());
            t5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public void b() {
        xo xoVar = (xo) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (xoVar.c != null) {
            xoVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            xoVar.a();
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 12:
                r61 r61Var = (r61) this.b;
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.c;
                v51 G = r61Var.Y2.G(i10);
                if (G != null) {
                    callback5.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                    break;
                }
                break;
            case 19:
                DataSettingsActivity.U((DataSettingsActivity) this.b, (Context) this.c, view, i10, f7);
                break;
            case 22:
                org.telegram.ui.wy.f0((org.telegram.ui.wy) this.b, (org.telegram.ui.vy) this.c, view, i10);
                break;
            default:
                FiltersSetupActivity.U((FiltersSetupActivity) this.b, (Context) this.c, view, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        y5 y5Var;
        wv wvVar = (wv) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof nv) || (y5Var = ((nv) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(wvVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new org.telegram.ui.sh(28, wvVar, y5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = wvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(linearLayout, -2, -2);
        wvVar.G = p1Var;
        p1Var.setClippingEnabled(true);
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

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
            case 12:
                break;
            case 19:
                break;
            case 22:
                break;
        }
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        um umVar = (um) this.b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
        umVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && umVar.d.getBitmap() == null) {
            if (umVar.d.getBitmap() != null && !umVar.d.getBitmap().isRecycled()) {
                umVar.d.getBitmap().recycle();
                umVar.d.setImageBitmap((Bitmap) null);
            }
            umVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ConferenceCall conferenceCall;
        switch (this.a) {
            case 5:
                ((eu) this.b).run(((ei.o) this.c).getText().toString().trim());
                break;
            case 6:
            case 10:
            case 12:
            case 13:
            case 14:
            case 19:
            case 22:
            case 23:
            case 25:
            default:
                org.telegram.ui.e70 e70Var = (org.telegram.ui.e70) this.b;
                org.telegram.ui.Cells.z1[] z1VarArr = (org.telegram.ui.Cells.z1[]) this.c;
                e70Var.getClass();
                int i11 = 0;
                org.telegram.ui.Cells.z1 z1Var = z1VarArr[0];
                if (z1Var != null && z1Var.b()) {
                    i11 = 100;
                }
                e70Var.m0(i11);
                break;
            case 7:
                n40 n40Var = (n40) this.b;
                HashtagSearchController.getInstance(n40Var.a).removeHashtagFromHistory((String) this.c);
                n40Var.f.N(true);
                break;
            case 8:
                ea0 ea0Var = (ea0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                la0 la0Var = ea0Var.a;
                la0Var.getMessagesController().getStoriesController().s(la0Var.e, arrayList);
                la0Var.V.L(false);
                break;
            case 9:
                ho0 ho0Var = (ho0) this.b;
                ArrayList<MessageObject> arrayList2 = (ArrayList) this.c;
                ho0Var.getClass();
                d2Var.dismiss();
                ho0Var.J0.getDownloadController().deleteRecentFiles(arrayList2);
                ho0Var.Q(false);
                break;
            case 11:
                Runnable runnable = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new bi.g1(11));
                break;
            case 15:
                Context context = (Context) this.b;
                File file = (File) this.c;
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent);
                break;
            case 16:
                org.telegram.ui.ts tsVar = (org.telegram.ui.ts) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                tsVar.getClass();
                ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                arrayList3.add(user);
                tsVar.getContactsController().deleteContact(arrayList3, true);
                if (user != null) {
                    user.contact = false;
                }
                tsVar.finishFragment();
                break;
            case 17:
                ContactsActivity.X((ContactsActivity) this.b, (String) this.c);
                break;
            case 18:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.et etVar = contactsActivity.W;
                if (etVar != null) {
                    etVar.b(user2);
                    contactsActivity.W = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.pv.U((org.telegram.ui.pv) this.b, (TLRPC.User) this.c);
                break;
            case 21:
                ((org.telegram.ui.wy) this.b).getMediaDataController().removeWebapp(((TLRPC.User) this.c).id);
                break;
            case 24:
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
            case 26:
                org.telegram.ui.f20 f20Var = (org.telegram.ui.f20) this.b;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) this.c;
                FiltersSetupActivity filtersSetupActivity = f20Var.e;
                org.telegram.ui.ActionBar.d2 d2Var2 = null;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(filtersSetupActivity.getParentActivity(), 3, null);
                    d2Var3.g0 = false;
                    d2Var3.show();
                    d2Var2 = d2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = dialogFilter2.id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new org.telegram.ui.aa(f20Var, d2Var2, dialogFilter2, 10));
                break;
            case 27:
                org.telegram.ui.j60 j60Var = (org.telegram.ui.j60) this.b;
                TLObject tLObject = (TLObject) this.c;
                AccountInstance accountInstance = j60Var.d;
                if (!j60Var.o1()) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(j60Var.i1(), (TLRPC.User) null, chat, false, false);
                        j60Var.k1().k(0L, 32, chat, null, null, null);
                        break;
                    } else {
                        TLRPC.User user3 = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(j60Var.i1(), user3);
                        j60Var.k1().k(0L, 32, user3, null, null, null);
                        break;
                    }
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user4 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user4.id);
                        j60Var.a1.addKickedUser(user4.id);
                        j60Var.k1().k(0L, 102, user4, null, null, null);
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.e70 e70Var2 = (org.telegram.ui.e70) this.b;
                e70Var2.x.j((TLRPC.User) this.c);
                if (e70Var2.f.r.length() > 0) {
                    e70Var2.f.r.setText((CharSequence) null);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.gj
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.b;
        in inVar = (in) this.c;
        if (!arrayList.isEmpty()) {
            callback.run(new qh.g((MessageObject) arrayList.get(0)));
        }
        inVar.dismiss(true);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        lt0 lt0Var = (lt0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        iv0 iv0Var = lt0Var.d;
        iv0Var.v1.finishFragment();
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.v1;
        if (p2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            p2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) p2Var, NotificationCenter.closeChats);
        }
        p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(iv0Var.j1), user, null, Boolean.valueOf(z10));
        p2Var.getMessagesController().setSavedViewAs(false);
    }

    public /* synthetic */ km(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 18;
        this.b = contactsActivity;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean c(float f7, float f10, int i10, View view) {
        r61 r61Var = (r61) this.b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.c;
        v51 G = r61Var.Y2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override // org.telegram.ui.Components.ml0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.ml0
    public /* synthetic */ void p(float f7) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void g(View view, float f7, float f10) {
    }

    private final /* synthetic */ void j(View view, float f7, float f10) {
    }

    private final /* synthetic */ void k(View view, float f7, float f10) {
    }
}
