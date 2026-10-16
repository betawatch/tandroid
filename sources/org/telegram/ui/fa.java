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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fa(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        int i11 = this.a;
        kg.b bVar = null;
        final int i12 = 0;
        final int i13 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.c3((va) obj3, (String) obj2, tL_error, tLObject, (TL_account.checkUsername) obj, 13));
                break;
            case 1:
                final va vaVar = (va) obj3;
                final org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error != null) {
                    if (!"USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                        if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                            AndroidUtilities.runOnUIThread(new p6(vaVar, a2Var, tL_error, updateusername, 2));
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ha
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            org.telegram.ui.ActionBar.a2 a2Var2 = a2Var;
                                            va vaVar2 = vaVar;
                                            vaVar2.getClass();
                                            try {
                                                a2Var2.dismiss();
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            vaVar2.finishFragment();
                                            break;
                                        default:
                                            org.telegram.ui.ActionBar.a2 a2Var3 = a2Var;
                                            va vaVar3 = vaVar;
                                            vaVar3.getClass();
                                            try {
                                                a2Var3.dismiss();
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                            }
                                            vaVar3.h0();
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ha
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        org.telegram.ui.ActionBar.a2 a2Var2 = a2Var;
                                        va vaVar2 = vaVar;
                                        vaVar2.getClass();
                                        try {
                                            a2Var2.dismiss();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        vaVar2.finishFragment();
                                        break;
                                    default:
                                        org.telegram.ui.ActionBar.a2 a2Var3 = a2Var;
                                        va vaVar3 = vaVar;
                                        vaVar3.getClass();
                                        try {
                                            a2Var3.dismiss();
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                        vaVar3.h0();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new t1(vaVar, a2Var, (TLRPC.User) tLObject, 8));
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new bi.c3((sd) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 16));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new p6((fo) obj3, (pf.c) obj2, tLObject, (xa) obj, 4));
                break;
            case 4:
                fo foVar = (fo) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((p6) obj2);
                foVar.d5.messageOwner.voiceTranscriptionRated = true;
                foVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(foVar.d5.getDialogId(), foVar.d5.getId(), foVar.d5.messageOwner);
                AndroidUtilities.runOnUIThread(new xg(foVar, 17), jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 5:
                fo foVar2 = (fo) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new ah((org.telegram.ui.ActionBar.a2[]) obj2, i13));
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new t1(foVar2, tL_error, tL_messages_editMessage, 22));
                    break;
                } else {
                    foVar2.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new bi.c3((np) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 19));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new bi.c3((xt) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 26));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new bi.c3((yy) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 27));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new yv((yy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, i13));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new br((i20) obj3, (org.telegram.ui.ActionBar.a2) obj2, (MessagesController.DialogFilter) obj, 9));
                break;
            case 11:
                n60 n60Var = (n60) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject == null) {
                    AndroidUtilities.runOnUIThread(new d20(3, n60Var, tL_error));
                    break;
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i14 = 0;
                    while (true) {
                        if (i14 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i14);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0((Object) n60Var, (Object) chat, (Object) inputPeer, update, 5));
                            } else {
                                i14++;
                            }
                        }
                    }
                    n60Var.d.getMessagesController().lambda$processUpdates$377(updates, false);
                    break;
                }
            case 12:
                AndroidUtilities.runOnUIThread(new bi.c3((n60) obj3, (org.telegram.ui.ActionBar.a2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 28));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(tLObject, (ArrayList) obj3, (ArrayList) obj2, (bi.c3) obj));
                break;
            case 14:
                x70 x70Var = (x70) obj3;
                String str = (String) obj;
                y70 y70Var = x70Var.r;
                if (Objects.equals(x70Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = ((TLRPC.TL_messages_foundStickerSets) tLObject).sets;
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i15);
                        i15++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        tL_messages_stickerSet.set = stickerSet;
                        tL_messages_stickerSet.documents = stickerSetCovered2.covers;
                        if (!y70Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    i10 = ((org.telegram.ui.ActionBar.m2) y70Var).currentAccount;
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(y70Var.c0());
                    int size2 = stickerSets.size();
                    while (i12 < size2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i12);
                        i12++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = tL_messages_stickerSet2;
                        String str2 = tL_messages_stickerSet3.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet3.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet3);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(x70Var, arrayList, arrayList3, str, 10));
                    break;
                }
                break;
            case 15:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new l90(obj3, tLObject, obj, obj2, tL_error, 2));
                break;
            case 16:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new l90((LaunchActivity) obj3, (d20) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 0));
                break;
            case 17:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new l90((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.a2) obj2, (d20) obj, tL_error));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new l90(obj3, tL_error, tLObject, obj, obj2, 4));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new br((ld0) obj3, (org.telegram.ui.ActionBar.a2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new l90((org.telegram.ui.Components.tw0) obj3, tLObject, (Bundle) obj2, tL_error, (TLObject) obj, 6));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new l90((org.telegram.ui.Components.tw0) obj3, tLObject, (Bundle) obj2, tL_error, (TLObject) obj, 8));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new l90((org.telegram.ui.Components.tw0) obj3, tLObject, (Bundle) obj2, tL_error, (TLObject) obj, 7));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new l90(obj3, tLObject, obj2, obj, tL_error, 9));
                break;
            case 24:
                pj0 pj0Var = (pj0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = hb1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new se0(13, pj0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new l90((Object) pj0Var, tL_error, (Object) bVar, (Object) str3, (Object) tL_loadAsyncGraph, 10));
                break;
            case 25:
                mj0 mj0Var = (mj0) obj3;
                String str4 = (String) obj2;
                gb1 gb1Var = (gb1) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = hb1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), mj0Var.r.i, false);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(mj0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(mj0Var, bVar, str4, gb1Var, 22));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new l90((hk0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new l90(obj3, tL_error, obj2, (Object) tLObject, obj, 13));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new l90(obj3, tL_error, tLObject, obj2, obj, 14));
                break;
            default:
                ap0 ap0Var = (ap0) obj3;
                se0 se0Var = (se0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new zn0(ap0Var, tL_error, tLObject2, 2));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new tf0(ap0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, se0Var, 16));
                    break;
                }
        }
    }

    public /* synthetic */ fa(Object obj, TLObject tLObject, String str, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = tLObject;
        this.c = str;
    }
}
