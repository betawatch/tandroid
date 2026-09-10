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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class aa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aa(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        int i11 = this.a;
        ig.b bVar = null;
        final int i12 = 0;
        final int i13 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.ya(obj3, (String) obj2, tL_error, tLObject, obj, 9));
                break;
            case 1:
                final ra raVar = (ra) obj3;
                final org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error != null) {
                    if (!"USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                        if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                            AndroidUtilities.runOnUIThread(new da(raVar, d2Var, tL_error, updateusername, 0));
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ca
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                                            ra raVar2 = raVar;
                                            raVar2.getClass();
                                            try {
                                                d2Var2.dismiss();
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            raVar2.finishFragment();
                                            break;
                                        default:
                                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                                            ra raVar3 = raVar;
                                            raVar3.getClass();
                                            try {
                                                d2Var3.dismiss();
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                            }
                                            raVar3.h0();
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ca
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                                        ra raVar2 = raVar;
                                        raVar2.getClass();
                                        try {
                                            d2Var2.dismiss();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        raVar2.finishFragment();
                                        break;
                                    default:
                                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                                        ra raVar3 = raVar;
                                        raVar3.getClass();
                                        try {
                                            d2Var3.dismiss();
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                        raVar3.h0();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new s1(raVar, d2Var, (TLRPC.User) tLObject, 8));
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new bi.ya(obj3, (String) obj2, tL_error, tLObject, obj, 12));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new da((eo) obj3, (nf.e) obj2, tLObject, (ua) obj, 2));
                break;
            case 4:
                eo eoVar = (eo) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((da) obj2);
                eoVar.d5.messageOwner.voiceTranscriptionRated = true;
                eoVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(eoVar.d5.getDialogId(), eoVar.d5.getId(), eoVar.d5.messageOwner);
                AndroidUtilities.runOnUIThread(new vg(eoVar, 17), jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 5:
                eo eoVar2 = (eo) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new yg((org.telegram.ui.ActionBar.d2[]) obj2, i13));
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new s1(eoVar2, tL_error, tL_messages_editMessage, 21));
                    break;
                } else {
                    eoVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new bi.ya(obj3, (String) obj2, tL_error, tLObject, obj, 15));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new bi.ya((tt) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new bi.ya(obj3, tLObject, obj2, obj, tL_error, 23));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new vv((wy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, i13));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new zq((f20) obj3, (org.telegram.ui.ActionBar.d2) obj2, (MessagesController.DialogFilter) obj, 9));
                break;
            case 11:
                j60 j60Var = (j60) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject == null) {
                    AndroidUtilities.runOnUIThread(new uv(19, j60Var, tL_error));
                    break;
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i14 = 0;
                    while (true) {
                        if (i14 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i14);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01((Object) j60Var, (Object) chat, (Object) inputPeer, update, 3));
                            } else {
                                i14++;
                            }
                        }
                    }
                    j60Var.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
            case 12:
                AndroidUtilities.runOnUIThread(new bi.ya((j60) obj3, (org.telegram.ui.ActionBar.d2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 24));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01(tLObject, (ArrayList) obj3, (ArrayList) obj2, (bi.ya) obj));
                break;
            case 14:
                r70 r70Var = (r70) obj3;
                String str = (String) obj;
                s70 s70Var = r70Var.r;
                if (Objects.equals(r70Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!s70Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    i10 = ((org.telegram.ui.ActionBar.p2) s70Var).currentAccount;
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(s70Var.c0());
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01(r70Var, arrayList, arrayList3, str, 8));
                    break;
                }
                break;
            case 15:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new bi.ya(obj3, tLObject, obj, obj2, tL_error, 28));
                break;
            case 16:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new bi.ya((LaunchActivity) obj3, (h90) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 26));
                break;
            case 17:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new bi.ya(obj3, tLObject, obj2, obj, tL_error, 29));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new ac0((fc0) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, 0));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new zq((id0) obj3, (org.telegram.ui.ActionBar.d2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new ac0((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 2));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new ac0((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 4));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new ac0((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 3));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new ac0(obj3, (Object) tLObject, obj2, obj, tL_error, 5));
                break;
            case 24:
                kj0 kj0Var = (kj0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = fb1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new h90(27, kj0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new ac0((org.telegram.ui.ActionBar.p2) kj0Var, tL_error, (Object) bVar, str3, (TLObject) tL_loadAsyncGraph, 6));
                break;
            case 25:
                hj0 hj0Var = (hj0) obj3;
                String str4 = (String) obj2;
                eb1 eb1Var = (eb1) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = fb1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), hj0Var.r.i, false);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(hj0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01(hj0Var, bVar, str4, eb1Var, 20));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new ac0((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 7));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new ac0(obj3, tL_error, obj2, tLObject, (TLObject) obj, 9));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new ac0((org.telegram.ui.ActionBar.p2) obj3, tL_error, (Object) tLObject, (String) obj2, (TLObject) obj, 10));
                break;
            default:
                wo0 wo0Var = (wo0) obj3;
                ak0 ak0Var = (ak0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new vn0(wo0Var, tL_error, tLObject2, 2));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new pf0(wo0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, ak0Var, 16));
                    break;
                }
        }
    }

    public /* synthetic */ aa(Object obj, TLObject tLObject, String str, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = tLObject;
        this.c = str;
    }
}
