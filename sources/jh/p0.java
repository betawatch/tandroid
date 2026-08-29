package jh;

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
import org.telegram.ui.fy;
import org.telegram.ui.of0;
import org.telegram.ui.tn;
import org.telegram.ui.yx;
import org.telegram.ui.ze1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ p0(s0 s0Var, tn tnVar, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, Utilities.Callback callback) {
        this.d = s0Var;
        this.c = i10;
        this.e = context;
        this.f = c6Var;
        this.b = j10;
        this.h = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        switch (this.a) {
            case 0:
                s0 s0Var = (s0) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (s0Var.s.S) {
                    int i10 = this.c;
                    if (!MessagesController.getInstance(i10).isFrozen()) {
                        s7 x4 = s7.x(i10, s0Var.D.a);
                        kf.a l10 = x4.e ? kf.a.l(x4.p()) : null;
                        if (!s0Var.c && (l10 == null || l10.b < s0Var.D.b)) {
                            kf.a aVar = s0Var.D;
                            kf.b bVar = aVar.a;
                            if (bVar != kf.b.a) {
                                if (bVar == kf.b.b) {
                                    new oh.f(context, c6Var, aVar, true, null).show();
                                    break;
                                }
                            } else {
                                long a2 = aVar.a();
                                long j10 = this.b;
                                new y9(context, c6Var, a2, 13, yf.d.h(i10, j10), null, j10).show();
                                break;
                            }
                        } else {
                            callback.run(MessageSuggestionParams.of(s0Var.D, s0Var.E));
                            s0Var.dismiss();
                            break;
                        }
                    } else {
                        org.telegram.ui.c.b(i10);
                        break;
                    }
                }
                break;
            case 1:
                of0 of0Var = (of0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.h;
                nh.d dVar = of0Var.b;
                if (!dVar.J) {
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
                    JSONObject p10 = ph.p2.p(null, false);
                    if (p10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = p10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    of0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.x9(of0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    break;
                }
                break;
            default:
                final ph.e1 e1Var = (ph.e1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final bh.v vVar = (bh.v) this.f;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.h;
                final org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    e1Var.X = true;
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
                    ph.c1 c1Var = new ph.c1(e1Var, bundle, vVar);
                    final int i12 = this.c;
                    final long j11 = this.b;
                    c1Var.y2 = new yx() { // from class: ph.v0
                        @Override // org.telegram.ui.yx
                        public final /* synthetic */ boolean C() {
                            return false;
                        }

                        @Override // org.telegram.ui.yx
                        public final /* synthetic */ boolean J(fy fyVar) {
                            return false;
                        }

                        @Override // org.telegram.ui.yx
                        public final boolean v(fy fyVar, ArrayList arrayList2, CharSequence charSequence, boolean z10, boolean z11, int i13, int i14, ze1 ze1Var) {
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
                            e1 e1Var2 = e1.this;
                            if (!e1Var2.Y) {
                                e1Var2.Y = true;
                                vVar.run(arrayList3.size() > 0 ? null : "USER_DECLINED", arrayList3);
                            }
                            if (ze1Var == null) {
                                fyVar.finishFragment();
                                return true;
                            }
                            ze1Var.finishFragment();
                            fyVar.removeSelfFromStack();
                            return true;
                        }
                    };
                    U.presentFragment(c1Var);
                    e1Var.dismiss();
                    uVar3.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p0(of0 of0Var, String str, long j10, String str2, String str3, int i10) {
        this.d = of0Var;
        this.e = str;
        this.b = j10;
        this.f = str2;
        this.h = str3;
        this.c = i10;
    }

    public /* synthetic */ p0(ph.e1 e1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, bh.v vVar, int i10, long j10, org.telegram.ui.web.u uVar) {
        this.d = e1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f = vVar;
        this.c = i10;
        this.b = j10;
        this.h = uVar;
    }
}
