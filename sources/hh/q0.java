package hh;

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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gy;
import org.telegram.ui.rf0;
import org.telegram.ui.rn;
import org.telegram.ui.we1;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ q0(t0 t0Var, rn rnVar, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, Utilities.Callback callback) {
        this.d = t0Var;
        this.b = i10;
        this.e = context;
        this.f = c6Var;
        this.c = j10;
        this.h = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (t0Var.s.S) {
                    int i10 = this.b;
                    if (!MessagesController.getInstance(i10).isFrozen()) {
                        u7 x8 = u7.x(i10, t0Var.D.a);
                        hf.a l10 = x8.e ? hf.a.l(x8.p()) : null;
                        if (!t0Var.c && (l10 == null || l10.b < t0Var.D.b)) {
                            hf.a aVar = t0Var.D;
                            hf.b bVar = aVar.a;
                            if (bVar != hf.b.a) {
                                if (bVar == hf.b.b) {
                                    new mh.f(context, c6Var, aVar, true, null).show();
                                    break;
                                }
                            } else {
                                long a2 = aVar.a();
                                long j10 = this.c;
                                new ea(context, c6Var, a2, 13, wf.c.h(i10, j10), null, j10).show();
                                break;
                            }
                        } else {
                            callback.run(MessageSuggestionParams.of(t0Var.D, t0Var.E));
                            t0Var.dismiss();
                            break;
                        }
                    } else {
                        org.telegram.ui.b.b(i10);
                        break;
                    }
                }
                break;
            case 1:
                final nh.k1 k1Var = (nh.k1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final cg.u0 u0Var = (cg.u0) this.f;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.h;
                final org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    k1Var.X = true;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 1);
                    if (!tL_messages_preparedInlineMessage2.peer_types.isEmpty()) {
                        int i11 = 0;
                        bundle.putBoolean("allowGroups", false);
                        bundle.putBoolean("allowMegagroups", false);
                        bundle.putBoolean("allowLegacyGroups", false);
                        bundle.putBoolean("allowUsers", false);
                        bundle.putBoolean("allowChannels", false);
                        bundle.putBoolean("allowBots", false);
                        ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_messages_preparedInlineMessage2.peer_types;
                        int size = arrayList.size();
                        while (i11 < size) {
                            TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                            i11++;
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
                    nh.i1 i1Var = new nh.i1(k1Var, bundle, u0Var);
                    final int i12 = this.b;
                    final long j11 = this.c;
                    i1Var.y2 = new zx() { // from class: nh.z0
                        @Override // org.telegram.ui.zx
                        public final /* synthetic */ boolean D() {
                            return false;
                        }

                        @Override // org.telegram.ui.zx
                        public final /* synthetic */ boolean K(gy gyVar) {
                            return false;
                        }

                        @Override // org.telegram.ui.zx
                        public final boolean w(gy gyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, boolean z11, int i13, int i14, we1 we1Var) {
                            MessageObject messageObject;
                            TLRPC.TL_forumTopic findTopic;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            boolean z12 = false;
                            int i15 = 0;
                            while (i15 < size2) {
                                Object obj = arrayList2.get(i15);
                                i15++;
                                MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) obj;
                                long j12 = topicKey.dialogId;
                                long j13 = topicKey.topicId;
                                if (!DialogObject.isEncryptedDialog(j12)) {
                                    int i16 = i12;
                                    if (j13 == 0 || (findTopic = MessagesController.getInstance(i16).getTopicsController().findTopic(-j12, j13)) == null || (message = findTopic.topicStartMessage) == null) {
                                        messageObject = null;
                                    } else {
                                        MessageObject messageObject2 = new MessageObject(i16, message, z12, z12);
                                        messageObject2.isTopicMainMessage = true;
                                        messageObject = messageObject2;
                                    }
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.id);
                                    hashMap.put("bot", "" + j11);
                                    long j14 = j12;
                                    MessageObject messageObject3 = messageObject;
                                    SendMessagesHelper.prepareSendingBotContextResult(U, AccountInstance.getInstance(i16), tL_messages_preparedInlineMessage4.result, hashMap, j14, messageObject3, messageObject, null, null, z11, i13, 0, null, 0L, 0L);
                                    if (charSequence != null) {
                                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i16);
                                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j14, messageObject3, messageObject3, null, true, null, null, null, true, 0, 0, null, false);
                                        j14 = j14;
                                        sendMessagesHelper.sendMessage(of2);
                                    }
                                    arrayList3.add(Long.valueOf(j14));
                                    i15 = i15;
                                    z12 = false;
                                }
                            }
                            k1 k1Var2 = k1.this;
                            if (!k1Var2.Y) {
                                k1Var2.Y = true;
                                u0Var.run(arrayList3.size() > 0 ? null : "USER_DECLINED", arrayList3);
                            }
                            if (we1Var == null) {
                                gyVar.finishFragment();
                                return true;
                            }
                            we1Var.finishFragment();
                            gyVar.removeSelfFromStack();
                            return true;
                        }
                    };
                    U.presentFragment(i1Var);
                    k1Var.dismiss();
                    uVar3.run();
                    break;
                }
                break;
            default:
                rf0 rf0Var = (rf0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.h;
                lh.d dVar = rf0Var.b;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.c;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.b;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject p6 = nh.b3.p(null, false);
                    if (p6 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = p6.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    rf0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.z9(rf0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q0(nh.k1 k1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, cg.u0 u0Var, int i10, long j10, org.telegram.ui.web.u uVar) {
        this.d = k1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f = u0Var;
        this.b = i10;
        this.c = j10;
        this.h = uVar;
    }

    public /* synthetic */ q0(rf0 rf0Var, String str, long j10, String str2, String str3, int i10) {
        this.d = rf0Var;
        this.e = str;
        this.c = j10;
        this.f = str2;
        this.h = str3;
        this.b = i10;
    }
}
