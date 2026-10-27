package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ea(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        int i11 = this.a;
        int i12 = 9;
        int i13 = 19;
        lg.b bVar = null;
        final int i14 = 0;
        final int i15 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.u0(obj3, obj2, tL_error, tLObject, obj, 21));
                break;
            case 1:
                final ta taVar = (ta) obj3;
                final org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error != null) {
                    if (!"USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                        if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                            AndroidUtilities.runOnUIThread(new m4.v0(taVar, e2Var, tL_error, updateusername, 11));
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                                            ta taVar2 = taVar;
                                            taVar2.getClass();
                                            try {
                                                e2Var2.dismiss();
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            taVar2.finishFragment();
                                            break;
                                        default:
                                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                                            ta taVar3 = taVar;
                                            taVar3.getClass();
                                            try {
                                                e2Var3.dismiss();
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                            }
                                            taVar3.i0();
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fa
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                                        ta taVar2 = taVar;
                                        taVar2.getClass();
                                        try {
                                            e2Var2.dismiss();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        taVar2.finishFragment();
                                        break;
                                    default:
                                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                                        ta taVar3 = taVar;
                                        taVar3.getClass();
                                        try {
                                            e2Var3.dismiss();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        taVar3.i0();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new q1(taVar, e2Var, (TLRPC.User) tLObject, 8));
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new bi.u0(obj3, obj2, tL_error, tLObject, obj, 24));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new m4.v0((wn) obj3, (qf.c) obj2, tLObject, (bi.b3) obj, 13));
                break;
            case 4:
                wn wnVar = (wn) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((m4.v0) obj2);
                wnVar.t5.messageOwner.voiceTranscriptionRated = true;
                wnVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(wnVar.t5.getDialogId(), wnVar.t5.getId(), wnVar.t5.messageOwner);
                AndroidUtilities.runOnUIThread(new ig(wnVar, i13), jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 5:
                wn wnVar2 = (wn) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new og((org.telegram.ui.ActionBar.e2[]) obj2, i15));
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new q1(wnVar2, tL_error, tL_messages_editMessage, 22));
                    break;
                } else {
                    wnVar2.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new bi.u0(obj3, obj2, tL_error, tLObject, obj, 27));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((ht) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 4));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((ey) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 5));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new iv((ey) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, i15));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new pq((r10) obj3, (org.telegram.ui.ActionBar.e2) obj2, (MessagesController.DialogFilter) obj, i12));
                break;
            case 11:
                x50 x50Var = (x50) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject == null) {
                    AndroidUtilities.runOnUIThread(new kz(i12, x50Var, tL_error));
                    break;
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i16 = 0;
                    while (true) {
                        if (i16 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i16);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10(x50Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 14));
                            } else {
                                i16++;
                            }
                        }
                    }
                    x50Var.d.getMessagesController().lambda$processUpdates$379(updates, false);
                    break;
                }
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((x50) obj3, (org.telegram.ui.ActionBar.e2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 6));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10(tLObject, (ArrayList) obj3, (ArrayList) obj2, (org.telegram.ui.Components.i30) obj, 16));
                break;
            case 14:
                g70 g70Var = (g70) obj3;
                String str = (String) obj;
                h70 h70Var = g70Var.r;
                if (Objects.equals(g70Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = ((TLRPC.TL_messages_foundStickerSets) tLObject).sets;
                    int size = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i17);
                        i17++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        tL_messages_stickerSet.set = stickerSet;
                        tL_messages_stickerSet.documents = stickerSetCovered2.covers;
                        if (!h70Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    i10 = ((org.telegram.ui.ActionBar.r2) h70Var).currentAccount;
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(h70Var.d0());
                    int size2 = stickerSets.size();
                    while (i14 < size2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i14);
                        i14++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = tL_messages_stickerSet2;
                        String str2 = tL_messages_stickerSet3.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet3.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet3);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10(g70Var, arrayList, arrayList3, str, 19));
                    break;
                }
                break;
            case 15:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error, 10));
                break;
            case 16:
                Pattern pattern2 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((LaunchActivity) obj3, (kz) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 8));
                break;
            case 17:
                Pattern pattern3 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.e2) obj2, (kz) obj, tL_error, 11));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((ob0) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, 12));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new pq((rc0) obj3, (org.telegram.ui.ActionBar.e2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 24));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((qd0) obj3, tLObject, (Bundle) obj2, tL_error, (TLRPC.TL_auth_resendCode) obj, 14));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((xe0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.verifyEmail) obj, 16));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((xe0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.sendVerifyEmailCode) obj, 15));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((qf0) obj3, tLObject, (TLRPC.TL_inputInvoicePremiumAuthCode) obj2, (TLRPC.TL_inputStorePaymentAuthCode) obj, tL_error, 17));
                break;
            case 24:
                xi0 xi0Var = (xi0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = y91.d0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new kb0(i13, xi0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30(xi0Var, tL_error, bVar, str3, tL_loadAsyncGraph, 18));
                break;
            case 25:
                ui0 ui0Var = (ui0) obj3;
                String str4 = (String) obj2;
                x91 x91Var = (x91) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = y91.d0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), ui0Var.r.i, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ui0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new cg0((Object) ui0Var, (Object) bVar, str4, (Object) x91Var, 1));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((qj0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj, 19));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((gn0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, 21));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((ro0) obj3, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, 22));
                break;
            default:
                ro0 ro0Var = (ro0) obj3;
                am0 am0Var = (am0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new rn0(ro0Var, tL_error, tLObject2, 2));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ne0(ro0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, am0Var, 20));
                    break;
                }
        }
    }

    public /* synthetic */ ea(Object obj, TLObject tLObject, String str, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = tLObject;
        this.c = str;
    }
}
