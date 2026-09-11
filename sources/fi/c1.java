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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.aa;
import org.telegram.ui.co;
import org.telegram.ui.eg1;
import org.telegram.ui.fg0;
import org.telegram.ui.oy;
import org.telegram.ui.uy;
import zh.k7;
import zh.s5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ c1(p1 p1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, org.telegram.tgnet.e eVar, int i10, long j3, org.telegram.ui.web.u uVar) {
        this.d = p1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f = eVar;
        this.c = i10;
        this.b = j3;
        this.h = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        switch (this.a) {
            case 0:
                final p1 p1Var = (p1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.h;
                final org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.b0 = true;
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
                            org.telegram.ui.web.u uVar2 = uVar;
                            if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                bundle.putBoolean("allowUsers", true);
                                tL_messages_preparedInlineMessage = tL_messages_preparedInlineMessage2;
                            } else {
                                tL_messages_preparedInlineMessage = tL_messages_preparedInlineMessage2;
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
                            uVar = uVar2;
                        }
                    }
                    org.telegram.ui.web.u uVar3 = uVar;
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage3 = tL_messages_preparedInlineMessage2;
                    n1 n1Var = new n1(p1Var, bundle, eVar);
                    final int i11 = this.c;
                    final long j3 = this.b;
                    n1Var.C2 = new oy() { // from class: fi.d1
                        @Override // org.telegram.ui.oy
                        public final /* synthetic */ boolean B() {
                            return false;
                        }

                        @Override // org.telegram.ui.oy
                        public final /* synthetic */ boolean K(uy uyVar) {
                            return false;
                        }

                        @Override // org.telegram.ui.oy
                        public final boolean u(uy uyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, boolean z11, int i12, int i13, eg1 eg1Var) {
                            MessageObject messageObject;
                            TLRPC.TL_forumTopic findTopic;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            boolean z12 = false;
                            int i14 = 0;
                            while (i14 < size2) {
                                Object obj = arrayList2.get(i14);
                                i14++;
                                MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) obj;
                                long j10 = topicKey.dialogId;
                                long j11 = topicKey.topicId;
                                if (!DialogObject.isEncryptedDialog(j10)) {
                                    int i15 = i11;
                                    if (j11 == 0 || (findTopic = MessagesController.getInstance(i15).getTopicsController().findTopic(-j10, j11)) == null || (message = findTopic.topicStartMessage) == null) {
                                        messageObject = null;
                                    } else {
                                        MessageObject messageObject2 = new MessageObject(i15, message, z12, z12);
                                        messageObject2.isTopicMainMessage = true;
                                        messageObject = messageObject2;
                                    }
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.id);
                                    hashMap.put("bot", "" + j3);
                                    long j12 = j10;
                                    MessageObject messageObject3 = messageObject;
                                    SendMessagesHelper.prepareSendingBotContextResult(U, AccountInstance.getInstance(i15), tL_messages_preparedInlineMessage4.result, hashMap, j12, messageObject3, messageObject, null, null, z11, i12, 0, null, 0L, 0L);
                                    if (charSequence != null) {
                                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i15);
                                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j12, messageObject3, messageObject3, null, true, null, null, null, true, 0, 0, null, false);
                                        j12 = j12;
                                        sendMessagesHelper.sendMessage(of2);
                                    }
                                    arrayList3.add(Long.valueOf(j12));
                                    i14 = i14;
                                    z12 = false;
                                }
                            }
                            p1 p1Var2 = p1.this;
                            if (!p1Var2.c0) {
                                p1Var2.c0 = true;
                                eVar.run(arrayList3.size() > 0 ? null : "USER_DECLINED", arrayList3);
                            }
                            if (eg1Var == null) {
                                uyVar.finishFragment();
                                return true;
                            }
                            eg1Var.finishFragment();
                            uyVar.removeSelfFromStack();
                            return true;
                        }
                    };
                    U.presentFragment(n1Var);
                    p1Var.dismiss();
                    uVar3.run();
                    break;
                }
                break;
            case 1:
                fg0 fg0Var = (fg0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.h;
                di.d dVar = fg0Var.b;
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
                    JSONObject p5 = k3.p(null, false);
                    if (p5 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = p5.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    fg0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new aa(fg0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    break;
                }
                break;
            default:
                zh.e0 e0Var = (zh.e0) this.d;
                Context context = (Context) this.e;
                f6 f6Var = (f6) this.f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (e0Var.s.W) {
                    int i12 = this.c;
                    if (!MessagesController.getInstance(i12).isFrozen()) {
                        s5 x10 = s5.x(i12, e0Var.H.a);
                        zf.a l4 = x10.e ? zf.a.l(x10.p()) : null;
                        if (!e0Var.c && (l4 == null || l4.b < e0Var.H.b)) {
                            zf.a aVar = e0Var.H;
                            zf.b bVar = aVar.a;
                            if (bVar != zf.b.a) {
                                if (bVar == zf.b.b) {
                                    new ei.h(context, f6Var, aVar, true, null).show();
                                    break;
                                }
                            } else {
                                long a2 = aVar.a();
                                long j10 = this.b;
                                new k7(context, f6Var, a2, 13, og.d.h(i12, j10), null, j10).show();
                                break;
                            }
                        } else {
                            callback.run(MessageSuggestionParams.of(e0Var.H, e0Var.I));
                            e0Var.dismiss();
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

    public /* synthetic */ c1(fg0 fg0Var, String str, long j3, String str2, String str3, int i10) {
        this.d = fg0Var;
        this.e = str;
        this.b = j3;
        this.f = str2;
        this.h = str3;
        this.c = i10;
    }

    public /* synthetic */ c1(zh.e0 e0Var, co coVar, int i10, Context context, f6 f6Var, long j3, Utilities.Callback callback) {
        this.d = e0Var;
        this.c = i10;
        this.e = context;
        this.f = f6Var;
        this.b = j3;
        this.h = callback;
    }
}
