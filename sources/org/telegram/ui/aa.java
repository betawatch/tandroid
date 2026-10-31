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
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        int i12 = 22;
        cg.b bVar = null;
        int i13 = 2;
        final int i14 = 0;
        final int i15 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                org.telegram.messenger.i0.g3(new ag.e3((oa) obj3, (String) obj2, tL_error, tLObject, (TL_account.checkUsername) obj, 10));
                break;
            case 1:
                final oa oaVar = (oa) obj3;
                final org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error != null) {
                    if (!"USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                        if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                            org.telegram.messenger.i0.g3(new ag.q0((Object) oaVar, (Object) x1Var, (Object) tL_error, (Object) updateusername, 23));
                            break;
                        } else {
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ca
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            try {
                                                x1Var.dismiss();
                                            } catch (Exception e) {
                                                org.telegram.messenger.f8.g(e, true);
                                            }
                                            oaVar.finishFragment();
                                            break;
                                        default:
                                            try {
                                                x1Var.dismiss();
                                            } catch (Exception e7) {
                                                org.telegram.messenger.f8.g(e7, true);
                                            }
                                            oaVar.l0();
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ca
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        try {
                                            x1Var.dismiss();
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                        }
                                        oaVar.finishFragment();
                                        break;
                                    default:
                                        try {
                                            x1Var.dismiss();
                                        } catch (Exception e7) {
                                            org.telegram.messenger.f8.g(e7, true);
                                        }
                                        oaVar.l0();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } else {
                    org.telegram.messenger.i0.g3(new p1(oaVar, x1Var, (TLRPC.User) tLObject, 8));
                    break;
                }
            case 2:
                org.telegram.messenger.i0.g3(new ag.e3((kd) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 13));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new ag.q0(obj3, obj2, tLObject, obj, 25));
                break;
            case 4:
                un unVar = (un) obj3;
                long[] jArr = (long[]) obj;
                org.telegram.messenger.i0.r((ag.q0) obj2);
                unVar.t5.k.voiceTranscriptionRated = true;
                org.telegram.messenger.hs messagesStorage = unVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.rk(messagesStorage, unVar.t5.f1(), org.telegram.messenger.jj.B0(unVar.t5.k), unVar.t5.k, 7));
                org.telegram.messenger.i0.h3(new lg(unVar, 15), jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 5:
                un unVar2 = (un) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.i0.g3(new pg((org.telegram.ui.ActionBar.x1[]) obj2, i15));
                if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new p1(unVar2, tL_error, tL_messages_editMessage, i12));
                    break;
                } else {
                    unVar2.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                org.telegram.messenger.i0.g3(new ag.e3((cp) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 16));
                break;
            case 7:
                org.telegram.messenger.i0.g3(new ag.e3((lt) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj));
                break;
            case 8:
                org.telegram.messenger.i0.g3(new ag.e3((ay) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 24));
                break;
            case 9:
                org.telegram.messenger.i0.g3(new gv((ay) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, i15));
                break;
            case 10:
                org.telegram.messenger.i0.g3(new qq((f10) obj3, (org.telegram.ui.ActionBar.x1) obj2, (org.telegram.messenger.ap) obj, 9));
                break;
            case 11:
                b50 b50Var = (b50) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject == null) {
                    org.telegram.messenger.i0.g3(new xs(i12, b50Var, tL_error));
                    break;
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i16 = 0;
                    while (true) {
                        if (i16 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i16);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                org.telegram.messenger.i0.g3(new fp((KeyEvent.Callback) b50Var, (Object) chat, (Object) inputPeer, update, 26));
                            } else {
                                i16++;
                            }
                        }
                    }
                    org.telegram.messenger.vp.r1(b50Var.k1.a).L3(updates, false);
                    break;
                }
            case 12:
                org.telegram.messenger.i0.g3(new ag.e3((b50) obj3, (org.telegram.ui.ActionBar.x1) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 25));
                break;
            case 13:
                org.telegram.messenger.i0.g3(new fp(tLObject, (ArrayList) obj3, (ArrayList) obj2, (ag.e3) obj, 28));
                break;
            case 14:
                j60 j60Var = (j60) obj3;
                String str = (String) obj;
                k60 k60Var = j60Var.r;
                if (Objects.equals(j60Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!k60Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    i10 = ((org.telegram.ui.ActionBar.k2) k60Var).currentAccount;
                    ArrayList s02 = org.telegram.messenger.ui.b0(i10).s0(k60Var.g0());
                    int size2 = s02.size();
                    while (i14 < size2) {
                        Object obj4 = s02.get(i14);
                        i14++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj4;
                        String str2 = tL_messages_stickerSet2.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet2.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet2);
                        }
                    }
                    org.telegram.messenger.i0.g3(new w50(j60Var, arrayList, arrayList3, str, 1));
                    break;
                }
                break;
            case 15:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new ag.e3((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error, 29));
                break;
            case 16:
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new ag.e3((LaunchActivity) obj3, (f70) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 27));
                break;
            case 17:
                Pattern pattern3 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new m90((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.x1) obj2, (f70) obj, tL_error, 0));
                break;
            case 18:
                org.telegram.messenger.i0.g3(new m90(obj3, tL_error, (Object) tLObject, obj, obj2, 1));
                break;
            case 19:
                org.telegram.messenger.i0.g3(new qq((yb0) obj3, (org.telegram.ui.ActionBar.x1[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 25));
                break;
            case 20:
                org.telegram.messenger.i0.g3(new m90((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 3));
                break;
            case 21:
                org.telegram.messenger.i0.g3(new m90((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 5));
                break;
            case 22:
                org.telegram.messenger.i0.g3(new m90((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 4));
                break;
            case 23:
                org.telegram.messenger.i0.g3(new m90((se0) obj3, tLObject, (TLRPC.TL_inputInvoicePremiumAuthCode) obj2, (TLRPC.TL_inputStorePaymentAuthCode) obj, tL_error, 6));
                break;
            case 24:
                sh0 sh0Var = (sh0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = u61.g0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    org.telegram.messenger.i0.g3(new uf0(i13, sh0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                org.telegram.messenger.i0.g3(new m90((Object) sh0Var, tL_error, (Object) bVar, (Object) str3, (Object) tL_loadAsyncGraph, 7));
                break;
            case 25:
                ph0 ph0Var = (ph0) obj3;
                String str4 = (String) obj2;
                t61 t61Var = (t61) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = u61.g0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), ph0Var.r.i, false);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ph0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.i0.g3(new w50(ph0Var, bVar, str4, t61Var, 13));
                break;
            case 26:
                org.telegram.messenger.i0.g3(new m90((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, 8));
                break;
            case 27:
                org.telegram.messenger.i0.g3(new m90((hl0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj));
                break;
            case 28:
                org.telegram.messenger.i0.g3(new m90(obj3, tL_error, (Object) tLObject, obj2, obj, 11));
                break;
            default:
                sm0 sm0Var = (sm0) obj3;
                uf0 uf0Var = (uf0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    org.telegram.messenger.i0.g3(new tl0(sm0Var, tL_error, tLObject2, i13));
                    break;
                } else {
                    org.telegram.messenger.i0.g3(new qd0(sm0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, uf0Var, 19));
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
