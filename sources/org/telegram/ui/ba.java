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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ba(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        int i11 = this.a;
        xf.b bVar = null;
        final int i12 = 0;
        final int i13 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.runOnUIThread(new hg.j0(obj3, obj2, tL_error, tLObject, obj, 19));
                break;
            case 1:
                final pa paVar = (pa) obj3;
                final org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error != null) {
                    if (!"USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                        if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(paVar, d2Var, tL_error, updateusername, 25));
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ca
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                                            pa paVar2 = paVar;
                                            paVar2.getClass();
                                            try {
                                                d2Var2.dismiss();
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                            }
                                            paVar2.finishFragment();
                                            break;
                                        default:
                                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                                            pa paVar3 = paVar;
                                            paVar3.getClass();
                                            try {
                                                d2Var3.dismiss();
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                            }
                                            paVar3.h0();
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
                                        pa paVar2 = paVar;
                                        paVar2.getClass();
                                        try {
                                            d2Var2.dismiss();
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                        }
                                        paVar2.finishFragment();
                                        break;
                                    default:
                                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                                        pa paVar3 = paVar;
                                        paVar3.getClass();
                                        try {
                                            d2Var3.dismiss();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        paVar3.h0();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new s1(paVar, d2Var, (TLRPC.User) tLObject, 8));
                    break;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new hg.j0(obj3, obj2, tL_error, tLObject, obj, 22));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((xn) obj3, (af.f) obj2, tLObject, (mh.f2) obj, 27));
                break;
            case 4:
                xn xnVar = (xn) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((androidx.car.app.utils.c) obj2);
                xnVar.a5.messageOwner.voiceTranscriptionRated = true;
                xnVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(xnVar.a5.getDialogId(), xnVar.a5.getId(), xnVar.a5.messageOwner);
                AndroidUtilities.runOnUIThread(new ng(xnVar, 17), jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 5:
                xn xnVar2 = (xn) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new qg((org.telegram.ui.ActionBar.d2[]) obj2, i13));
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new s1(xnVar2, tL_error, tL_messages_editMessage, 21));
                    break;
                } else {
                    xnVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new hg.j0(obj3, obj2, tL_error, tLObject, obj, 25));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0(2, (qt) obj3, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, tL_error));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0(obj3, (Object) tLObject, obj2, obj, (Object) tL_error, 3));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new qv((py) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, i13));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new sq((a20) obj3, (org.telegram.ui.ActionBar.d2) obj2, (MessagesController.DialogFilter) obj, 9));
                break;
            case 11:
                d60 d60Var = (d60) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject == null) {
                    AndroidUtilities.runOnUIThread(new v10(3, d60Var, tL_error));
                    break;
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i14 = 0;
                    while (true) {
                        if (i14 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i14);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new ih((Object) d60Var, (Object) chat, (Object) inputPeer, update, 28));
                            } else {
                                i14++;
                            }
                        }
                    }
                    d60Var.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0(obj3, obj2, tLObject, (TLObject) obj, tL_error, 4));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new b30(tLObject, (ArrayList) obj3, (ArrayList) obj2, (org.telegram.ui.Components.ky0) obj, 0));
                break;
            case 14:
                m70 m70Var = (m70) obj3;
                String str = (String) obj;
                n70 n70Var = m70Var.r;
                if (Objects.equals(m70Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!n70Var.K || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    i10 = ((org.telegram.ui.ActionBar.p2) n70Var).currentAccount;
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(n70Var.c0());
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
                    AndroidUtilities.runOnUIThread(new b30(m70Var, arrayList, arrayList3, str, 3));
                    break;
                }
                break;
            case 15:
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error, 8));
                break;
            case 16:
                Pattern pattern2 = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0(obj3, obj2, tLObject, (TLObject) obj, tL_error, 6));
                break;
            case 17:
                Pattern pattern3 = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.d2) obj2, (v10) obj, tL_error, 9));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0(10, (xb0) obj3, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, tL_error));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new sq((bd0) obj3, (org.telegram.ui.ActionBar.d2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 12));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 14));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 13));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0(obj3, (Object) tLObject, obj2, obj, (Object) tL_error, 15));
                break;
            case 24:
                bj0 bj0Var = (bj0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = ha1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new he0(11, bj0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0(16, bj0Var, bVar, str3, tL_loadAsyncGraph, tL_error));
                break;
            case 25:
                yi0 yi0Var = (yi0) obj3;
                String str4 = (String) obj2;
                ga1 ga1Var = (ga1) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = ha1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), yi0Var.r.i, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(yi0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new b30(yi0Var, bVar, str4, ga1Var, 15));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 17));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0((bn0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0(20, (lo0) obj3, tLObject, (String) obj2, (TL_account.getPassword) obj, tL_error));
                break;
            default:
                lo0 lo0Var = (lo0) obj3;
                he0 he0Var = (he0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new mn0(lo0Var, tL_error, tLObject2, 2));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new if0(lo0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, he0Var, 16));
                    break;
                }
        }
    }

    public /* synthetic */ ba(Object obj, TLObject tLObject, String str, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = tLObject;
        this.c = str;
    }
}
