package bi;

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
import org.telegram.ui.af1;
import org.telegram.ui.cy;
import org.telegram.ui.of0;
import org.telegram.ui.un;
import org.telegram.ui.ux;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ d1(g1 g1Var, un unVar, int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, Utilities.Callback callback) {
        this.d = g1Var;
        this.b = i10;
        this.e = context;
        this.f = u6Var;
        this.c = j10;
        this.h = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z10;
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (g1Var.s.c0) {
                    int i10 = this.b;
                    if (!MessagesController.getInstance(i10).isFrozen()) {
                        ca x9 = ca.x(i10, g1Var.H.a);
                        bg.a l4 = x9.e ? bg.a.l(x9.p()) : null;
                        if (!g1Var.c && (l4 == null || l4.b < g1Var.H.b)) {
                            bg.a aVar = g1Var.H;
                            bg.b bVar = aVar.a;
                            if (bVar != bg.b.a) {
                                if (bVar == bg.b.b) {
                                    new gi.g(context, u6Var, aVar, true, null).show();
                                    break;
                                }
                            } else {
                                long a2 = aVar.a();
                                long j10 = this.c;
                                new tc(context, u6Var, a2, 13, pg.d.h(i10, j10), null, j10).show();
                                break;
                            }
                        } else {
                            callback.run(MessageSuggestionParams.of(g1Var.H, g1Var.I));
                            g1Var.dismiss();
                            break;
                        }
                    } else {
                        org.telegram.ui.b.b(i10);
                        break;
                    }
                }
                break;
            case 1:
                final hi.s1 s1Var = (hi.s1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final t0 t0Var = (t0) this.f;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.h;
                final org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    s1Var.b0 = true;
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
                            org.telegram.ui.web.t tVar2 = tVar;
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
                            tVar = tVar2;
                        }
                    }
                    org.telegram.ui.web.t tVar3 = tVar;
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage3 = tL_messages_preparedInlineMessage2;
                    hi.q1 q1Var = new hi.q1(s1Var, bundle, t0Var);
                    final int i12 = this.b;
                    final long j11 = this.c;
                    q1Var.C2 = new ux() { // from class: hi.h1
                        @Override // org.telegram.ui.ux
                        public final /* synthetic */ boolean C() {
                            return false;
                        }

                        @Override // org.telegram.ui.ux
                        public final /* synthetic */ boolean K(cy cyVar) {
                            return false;
                        }

                        @Override // org.telegram.ui.ux
                        public final boolean v(cy cyVar, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i13, int i14, af1 af1Var) {
                            TLRPC.TL_forumTopic findTopic;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i15 = 0;
                            while (true) {
                                r5 = null;
                                r5 = null;
                                MessageObject messageObject = null;
                                if (i15 >= size2) {
                                    break;
                                }
                                Object obj = arrayList2.get(i15);
                                i15++;
                                MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) obj;
                                long j12 = topicKey.dialogId;
                                long j13 = topicKey.topicId;
                                if (!DialogObject.isEncryptedDialog(j12)) {
                                    int i16 = i12;
                                    if (j13 != 0 && (findTopic = MessagesController.getInstance(i16).getTopicsController().findTopic(-j12, j13)) != null && (message = findTopic.topicStartMessage) != null) {
                                        messageObject = new MessageObject(i16, message, false, false);
                                        messageObject.isTopicMainMessage = true;
                                    }
                                    MessageObject messageObject2 = messageObject;
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.id);
                                    hashMap.put("bot", "" + j11);
                                    long j14 = j12;
                                    SendMessagesHelper.prepareSendingBotContextResult(U, AccountInstance.getInstance(i16), tL_messages_preparedInlineMessage4.result, hashMap, j14, messageObject2, messageObject2, null, null, z12, i13, 0, null, 0L, 0L);
                                    if (charSequence != null) {
                                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i16);
                                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j14, messageObject2, messageObject2, null, true, null, null, null, true, 0, 0, null, false);
                                        j14 = j14;
                                        sendMessagesHelper.sendMessage(of2);
                                    }
                                    arrayList3.add(Long.valueOf(j14));
                                }
                            }
                            s1 s1Var2 = s1.this;
                            if (!s1Var2.c0) {
                                s1Var2.c0 = true;
                                t0Var.run(arrayList3.size() <= 0 ? "USER_DECLINED" : null, arrayList3);
                            }
                            if (af1Var == null) {
                                cyVar.finishFragment();
                                return true;
                            }
                            af1Var.finishFragment();
                            cyVar.removeSelfFromStack();
                            return true;
                        }
                    };
                    U.presentFragment(q1Var);
                    s1Var.dismiss();
                    tVar3.run();
                    break;
                }
                break;
            default:
                of0 of0Var = (of0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.h;
                fi.d dVar = of0Var.b;
                if (!dVar.Q) {
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
                    JSONObject q5 = hi.m3.q(null, false);
                    if (q5 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = q5.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    of0Var.v.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.ea(of0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d1(hi.s1 s1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, t0 t0Var, int i10, long j10, org.telegram.ui.web.t tVar) {
        this.d = s1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f = t0Var;
        this.b = i10;
        this.c = j10;
        this.h = tVar;
    }

    public /* synthetic */ d1(of0 of0Var, String str, long j10, String str2, String str3, int i10) {
        this.d = of0Var;
        this.e = str;
        this.c = j10;
        this.f = str2;
        this.h = str3;
        this.b = i10;
    }
}
