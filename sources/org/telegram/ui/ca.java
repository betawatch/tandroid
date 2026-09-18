package org.telegram.ui;

import android.os.SystemClock;
import android.view.KeyEvent;
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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ca(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        int i11 = this.a;
        jg.b bVar = null;
        int i12 = 16;
        final int i13 = 0;
        final int i14 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.m3((sa) obj3, (String) obj2, tL_error, tLObject, (TL_account.checkUsername) obj, 13));
                break;
            case 1:
                final sa saVar = (sa) obj3;
                final org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error != null) {
                    if (!"USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                        if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5((Object) saVar, (Object) c2Var, (Object) tL_error, (Object) updateusername, 4));
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ea
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                                            sa saVar2 = saVar;
                                            saVar2.getClass();
                                            try {
                                                c2Var2.dismiss();
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            saVar2.finishFragment();
                                            break;
                                        default:
                                            org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
                                            sa saVar3 = saVar;
                                            saVar3.getClass();
                                            try {
                                                c2Var3.dismiss();
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                            }
                                            saVar3.h0();
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ea
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                                        sa saVar2 = saVar;
                                        saVar2.getClass();
                                        try {
                                            c2Var2.dismiss();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        saVar2.finishFragment();
                                        break;
                                    default:
                                        org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
                                        sa saVar3 = saVar;
                                        saVar3.getClass();
                                        try {
                                            c2Var3.dismiss();
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                        saVar3.h0();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new q1(saVar, c2Var, (TLRPC.User) tLObject, 8));
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ai.m3((nd) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 16));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5(obj3, obj2, tLObject, obj, 6));
                break;
            case 4:
                bo boVar = (bo) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((org.telegram.ui.ActionBar.o5) obj2);
                boVar.d5.messageOwner.voiceTranscriptionRated = true;
                boVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(boVar.d5.getDialogId(), boVar.d5.getId(), boVar.d5.messageOwner);
                AndroidUtilities.runOnUIThread(new wg(boVar, 17), jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 5:
                bo boVar2 = (bo) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new zg((org.telegram.ui.ActionBar.c2[]) obj2, i14));
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new q1(boVar2, tL_error, tL_messages_editMessage, 21));
                    break;
                } else {
                    boVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new ai.m3((kp) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 19));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ai.m3((ut) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 26));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ai.m3((wy) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 27));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new vv((wy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, i14));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new xq((g20) obj3, (org.telegram.ui.ActionBar.c2) obj2, (MessagesController.DialogFilter) obj, 9));
                break;
            case 11:
                k60 k60Var = (k60) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject == null) {
                    AndroidUtilities.runOnUIThread(new mw(i12, k60Var, tL_error));
                    break;
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i15 = 0;
                    while (true) {
                        if (i15 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i15);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0(k60Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 7));
                            } else {
                                i15++;
                            }
                        }
                    }
                    k60Var.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
            case 12:
                AndroidUtilities.runOnUIThread(new ai.m3((k60) obj3, (org.telegram.ui.ActionBar.c2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 28));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0(tLObject, (ArrayList) obj3, (ArrayList) obj2, (ai.m3) obj, 9));
                break;
            case 14:
                u70 u70Var = (u70) obj3;
                String str = (String) obj;
                v70 v70Var = u70Var.r;
                if (Objects.equals(u70Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = ((TLRPC.TL_messages_foundStickerSets) tLObject).sets;
                    int size = arrayList2.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i16);
                        i16++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        tL_messages_stickerSet.set = stickerSet;
                        tL_messages_stickerSet.documents = stickerSetCovered2.covers;
                        if (!v70Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    i10 = ((org.telegram.ui.ActionBar.o2) v70Var).currentAccount;
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(v70Var.c0());
                    int size2 = stickerSets.size();
                    while (i13 < size2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i13);
                        i13++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = tL_messages_stickerSet2;
                        String str2 = tL_messages_stickerSet3.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet3.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet3);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0(u70Var, arrayList, arrayList3, str, 12));
                    break;
                }
                break;
            case 15:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new i90(obj3, tLObject, obj, obj2, tL_error, 2));
                break;
            case 16:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new i90((LaunchActivity) obj3, (oa0) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 0));
                break;
            case 17:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new i90((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.c2) obj2, (oa0) obj, tL_error));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new i90(obj3, tL_error, tLObject, obj, obj2, 4));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new xq((kd0) obj3, (org.telegram.ui.ActionBar.c2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new i90((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 6));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new i90((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 8));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new i90((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 7));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new i90(obj3, tLObject, obj2, obj, tL_error, 9));
                break;
            case 24:
                lj0 lj0Var = (lj0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = ab1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new oa0(24, lj0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new i90((Object) lj0Var, tL_error, (Object) bVar, (Object) str3, (Object) tL_loadAsyncGraph, 10));
                break;
            case 25:
                ij0 ij0Var = (ij0) obj3;
                String str4 = (String) obj2;
                za1 za1Var = (za1) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = ab1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), ij0Var.r.i, false);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ij0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0(ij0Var, bVar, str4, za1Var, 24));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new i90((ek0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new i90(obj3, tL_error, obj2, (Object) tLObject, obj, 13));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new i90(obj3, tL_error, tLObject, obj2, obj, 14));
                break;
            default:
                yo0 yo0Var = (yo0) obj3;
                pl0 pl0Var = (pl0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new xn0(yo0Var, tL_error, tLObject2, 2));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new rf0(yo0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, pl0Var, i12));
                    break;
                }
        }
    }

    public /* synthetic */ ca(Object obj, TLObject tLObject, String str, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = tLObject;
        this.c = str;
    }
}
