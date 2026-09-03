package org.telegram.ui;

import android.os.Bundle;
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
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class da implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ da(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        int i11 = this.a;
        wf.b bVar = null;
        final int i12 = 0;
        final int i13 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.runOnUIThread(new gg.j0(obj3, obj2, tL_error, tLObject, obj, 19));
                break;
            case 1:
                final ra raVar = (ra) obj3;
                final org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error != null) {
                    if (!"USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                        if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(raVar, d2Var, tL_error, updateusername, 25));
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ea
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
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                            }
                                            raVar3.h0();
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
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                        }
                                        raVar3.h0();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new u1(raVar, d2Var, (TLRPC.User) tLObject, 8));
                    break;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new gg.j0(obj3, obj2, tL_error, tLObject, obj, 22));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((zn) obj3, (ze.c) obj2, tLObject, (lh.g2) obj, 27));
                break;
            case 4:
                zn znVar = (zn) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((androidx.car.app.utils.c) obj2);
                znVar.a5.messageOwner.voiceTranscriptionRated = true;
                znVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(znVar.a5.getDialogId(), znVar.a5.getId(), znVar.a5.messageOwner);
                AndroidUtilities.runOnUIThread(new pg(znVar, 17), jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 5:
                zn znVar2 = (zn) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new sg((org.telegram.ui.ActionBar.d2[]) obj2, i13));
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new u1(znVar2, tL_error, tL_messages_editMessage, 21));
                    break;
                } else {
                    znVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new gg.j0(obj3, obj2, tL_error, tLObject, obj, 25));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(2, (rt) obj3, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, tL_error));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(obj3, (Object) tLObject, obj2, obj, (Object) tL_error, 3));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new rv((qy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, i13));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new tq((b20) obj3, (org.telegram.ui.ActionBar.d2) obj2, (MessagesController.DialogFilter) obj, 9));
                break;
            case 11:
                e60 e60Var = (e60) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject == null) {
                    AndroidUtilities.runOnUIThread(new w10(3, e60Var, tL_error));
                    break;
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i14 = 0;
                    while (true) {
                        if (i14 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i14);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new kh((Object) e60Var, (Object) chat, (Object) inputPeer, update, 28));
                            } else {
                                i14++;
                            }
                        }
                    }
                    e60Var.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(obj3, obj2, tLObject, (TLObject) obj, tL_error, 4));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new c30(tLObject, (ArrayList) obj3, (ArrayList) obj2, (org.telegram.ui.Components.jy0) obj, 0));
                break;
            case 14:
                n70 n70Var = (n70) obj3;
                String str = (String) obj;
                o70 o70Var = n70Var.r;
                if (Objects.equals(n70Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!o70Var.K || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    i10 = ((org.telegram.ui.ActionBar.p2) o70Var).currentAccount;
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(o70Var.c0());
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
                    AndroidUtilities.runOnUIThread(new c30(n70Var, arrayList, arrayList3, str, 3));
                    break;
                }
                break;
            case 15:
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error, 8));
                break;
            case 16:
                Pattern pattern2 = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(obj3, obj2, tLObject, (TLObject) obj, tL_error, 6));
                break;
            case 17:
                Pattern pattern3 = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.d2) obj2, (w10) obj, tL_error, 9));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(10, (yb0) obj3, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, tL_error));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new tq((cd0) obj3, (org.telegram.ui.ActionBar.d2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 12));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 14));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 13));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(obj3, (Object) tLObject, obj2, obj, (Object) tL_error, 15));
                break;
            case 24:
                cj0 cj0Var = (cj0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = oa1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new ie0(11, cj0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(16, cj0Var, bVar, str3, tL_loadAsyncGraph, tL_error));
                break;
            case 25:
                zi0 zi0Var = (zi0) obj3;
                String str4 = (String) obj2;
                na1 na1Var = (na1) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = oa1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), zi0Var.r.i, false);
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(zi0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new c30(zi0Var, bVar, str4, na1Var, 15));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 17));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((bn0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(20, (lo0) obj3, tLObject, (String) obj2, (TL_account.getPassword) obj, tL_error));
                break;
            default:
                lo0 lo0Var = (lo0) obj3;
                ie0 ie0Var = (ie0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new mn0(lo0Var, tL_error, tLObject2, 2));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new jf0(lo0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, ie0Var, 16));
                    break;
                }
        }
    }

    public /* synthetic */ da(Object obj, TLObject tLObject, String str, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = tLObject;
        this.c = str;
    }
}
