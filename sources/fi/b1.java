package fi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fa;
import org.telegram.ui.fo;
import org.telegram.ui.kg0;
import org.telegram.ui.lg1;
import org.telegram.ui.sy;
import org.telegram.ui.yy;
import zh.e7;
import zh.n5;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ b1(o1 o1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, org.telegram.tgnet.e eVar, int i10, long j10, org.telegram.ui.web.s sVar) {
        this.d = o1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f = eVar;
        this.c = i10;
        this.b = j10;
        this.h = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z10;
        switch (this.a) {
            case 0:
                final o1 o1Var = (o1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.h;
                final org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    o1Var.b0 = true;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 1);
                    if (!tL_messages_preparedInlineMessage2.peer_types.isEmpty()) {
                        int i10 = 0;
                        bundle.putBoolean("allowGroups", false);
                        bundle.putBoolean("allowMegagroups", false);
                        bundle.putBoolean("allowLegacyGroups", false);
                        bundle.putBoolean("allowUsers", false);
                        bundle.putBoolean("allowChannels", false);
                        bundle.putBoolean("allowBots", false);
                        ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_messages_preparedInlineMessage2.peer_types;
                        int size = arrayList.size();
                        while (i10 < size) {
                            TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i10);
                            i10++;
                            TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                            org.telegram.ui.web.s sVar2 = sVar;
                            if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                z10 = true;
                                bundle.putBoolean("allowUsers", true);
                                tL_messages_preparedInlineMessage = tL_messages_preparedInlineMessage2;
                            } else {
                                tL_messages_preparedInlineMessage = tL_messages_preparedInlineMessage2;
                                z10 = true;
                                if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                    bundle.putBoolean("allowBots", true);
                                } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                    bundle.putBoolean("allowChannels", true);
                                } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                    bundle.putBoolean("allowLegacyGroups", true);
                                } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                    bundle.putBoolean("allowMegagroups", true);
                                }
                            }
                            tL_messages_preparedInlineMessage2 = tL_messages_preparedInlineMessage;
                            sVar = sVar2;
                        }
                    }
                    org.telegram.ui.web.s sVar3 = sVar;
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage3 = tL_messages_preparedInlineMessage2;
                    m1 m1Var = new m1(o1Var, bundle, eVar);
                    final int i11 = this.c;
                    final long j10 = this.b;
                    m1Var.C2 = new sy() { // from class: fi.c1
                        @Override // org.telegram.ui.sy
                        public final /* synthetic */ boolean D() {
                            return false;
                        }

                        @Override // org.telegram.ui.sy
                        public final /* synthetic */ boolean L(yy yyVar) {
                            return false;
                        }

                        @Override // org.telegram.ui.sy
                        public final boolean w(yy yyVar, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i12, int i13, lg1 lg1Var) {
                            TLRPC.TL_forumTopic findTopic;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i14 = 0;
                            while (true) {
                                r5 = null;
                                r5 = null;
                                MessageObject messageObject = null;
                                if (i14 >= size2) {
                                    break;
                                }
                                Object obj = arrayList2.get(i14);
                                i14++;
                                MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) obj;
                                long j11 = topicKey.dialogId;
                                long j12 = topicKey.topicId;
                                if (!DialogObject.isEncryptedDialog(j11)) {
                                    int i15 = i11;
                                    if (j12 != 0 && (findTopic = MessagesController.getInstance(i15).getTopicsController().findTopic(-j11, j12)) != null && (message = findTopic.topicStartMessage) != null) {
                                        messageObject = new MessageObject(i15, message, false, false);
                                        messageObject.isTopicMainMessage = true;
                                    }
                                    MessageObject messageObject2 = messageObject;
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.id);
                                    hashMap.put("bot", "" + j10);
                                    long j13 = j11;
                                    SendMessagesHelper.prepareSendingBotContextResult(U, AccountInstance.getInstance(i15), tL_messages_preparedInlineMessage4.result, hashMap, j13, messageObject2, messageObject2, null, null, z12, i12, 0, null, 0L, 0L);
                                    if (charSequence != null) {
                                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i15);
                                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j13, messageObject2, messageObject2, null, true, null, null, null, true, 0, 0, null, false);
                                        j13 = j13;
                                        sendMessagesHelper.sendMessage(of2);
                                    }
                                    arrayList3.add(Long.valueOf(j13));
                                }
                            }
                            o1 o1Var2 = o1.this;
                            if (!o1Var2.c0) {
                                o1Var2.c0 = true;
                                eVar.run(arrayList3.size() <= 0 ? "USER_DECLINED" : null, arrayList3);
                            }
                            if (lg1Var == null) {
                                yyVar.finishFragment();
                                return true;
                            }
                            lg1Var.finishFragment();
                            yyVar.removeSelfFromStack();
                            return true;
                        }
                    };
                    U.presentFragment(m1Var);
                    o1Var.dismiss();
                    sVar3.run();
                    break;
                }
                break;
            case 1:
                kg0 kg0Var = (kg0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.h;
                di.d dVar = kg0Var.b;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.b;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.c;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject q6 = k3.q(null, false);
                    if (q6 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = q6.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    kg0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new fa(kg0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    break;
                }
                break;
            default:
                zh.d0 d0Var = (zh.d0) this.d;
                Context context = (Context) this.e;
                c6 c6Var = (c6) this.f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (d0Var.s.W) {
                    int i12 = this.c;
                    if (!MessagesController.getInstance(i12).isFrozen()) {
                        n5 x10 = n5.x(i12, d0Var.H.a);
                        ag.a l4 = x10.e ? ag.a.l(x10.p()) : null;
                        if (!d0Var.c && (l4 == null || l4.b < d0Var.H.b)) {
                            ag.a aVar = d0Var.H;
                            ag.b bVar = aVar.a;
                            if (bVar != ag.b.a) {
                                if (bVar == ag.b.b) {
                                    new ei.h(context, c6Var, aVar, true, null).show();
                                    break;
                                }
                            } else {
                                long a2 = aVar.a();
                                long j11 = this.b;
                                new e7(context, c6Var, a2, 13, og.d.h(i12, j11), null, j11).show();
                                break;
                            }
                        } else {
                            callback.run(MessageSuggestionParams.of(d0Var.H, d0Var.I));
                            d0Var.dismiss();
                            break;
                        }
                    } else {
                        org.telegram.ui.b.b(i12);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ b1(kg0 kg0Var, String str, long j10, String str2, String str3, int i10) {
        this.d = kg0Var;
        this.e = str;
        this.b = j10;
        this.f = str2;
        this.h = str3;
        this.c = i10;
    }

    public /* synthetic */ b1(zh.d0 d0Var, fo foVar, int i10, Context context, c6 c6Var, long j10, Utilities.Callback callback) {
        this.d = d0Var;
        this.c = i10;
        this.e = context;
        this.f = c6Var;
        this.b = j10;
        this.h = callback;
    }
}
