package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.hs;
import org.telegram.messenger.kj;
import org.telegram.messenger.o5;
import org.telegram.messenger.pz;
import org.telegram.messenger.rz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nb1;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne0 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ne0(re0 re0Var, String str, long j10, String str2, String str3, int i10) {
        this.d = re0Var;
        this.e = str;
        this.c = j10;
        this.f = str2;
        this.h = str3;
        this.b = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z10;
        switch (this.a) {
            case 0:
                re0 re0Var = (re0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.h;
                vh.d dVar = re0Var.b;
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
                    JSONObject u10 = xh.m2.u(null, false);
                    if (u10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = u10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    re0Var.w.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new aa(re0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    break;
                }
                break;
            case 1:
                rh.e0 e0Var = (rh.e0) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.f;
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) this.h;
                if (e0Var.q1.c0) {
                    int i10 = this.b;
                    if (!org.telegram.messenger.wp.r1(i10).u2()) {
                        rh.e6 x10 = rh.e6.x(i10, e0Var.y1.a);
                        sf.a l4 = x10.e ? sf.a.l(x10.p()) : null;
                        if (!e0Var.j1 && (l4 == null || l4.b < e0Var.y1.b)) {
                            sf.a aVar = e0Var.y1;
                            sf.b bVar = aVar.a;
                            if (bVar != sf.b.a) {
                                if (bVar == sf.b.b) {
                                    new wh.f(context, p6Var, aVar, true, null).show();
                                    break;
                                }
                            } else {
                                long a2 = aVar.a();
                                long j10 = this.c;
                                new rh.x7(context, p6Var, a2, 13, gg.e.h(i10, j10), null, j10).show();
                                break;
                            }
                        } else {
                            r20Var.a(new org.telegram.messenger.pj(e0Var.y1, e0Var.z1));
                            e0Var.dismiss();
                            break;
                        }
                    } else {
                        b.b(i10);
                        break;
                    }
                }
                break;
            default:
                final xh.c1 c1Var = (xh.c1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.h;
                final org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    c1Var.T1 = true;
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
                            org.telegram.ui.web.q qVar2 = qVar;
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
                            qVar = qVar2;
                        }
                    }
                    org.telegram.ui.web.q qVar3 = qVar;
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage3 = tL_messages_preparedInlineMessage2;
                    xh.a1 a1Var = new xh.a1(c1Var, bundle, eVar);
                    final int i12 = this.b;
                    final long j11 = this.c;
                    a1Var.C2 = new tx() { // from class: xh.t0
                        @Override // org.telegram.ui.tx
                        public final /* synthetic */ boolean H() {
                            return false;
                        }

                        @Override // org.telegram.ui.tx
                        public final /* synthetic */ boolean O(zx zxVar) {
                            return false;
                        }

                        @Override // org.telegram.ui.tx
                        public final boolean z(zx zxVar, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i13, int i14, nb1 nb1Var) {
                            TLRPC.TL_forumTopic f7;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i15 = 0;
                            while (true) {
                                r5 = null;
                                r5 = null;
                                kj kjVar = null;
                                if (i15 >= size2) {
                                    break;
                                }
                                Object obj = arrayList2.get(i15);
                                i15++;
                                hs hsVar = (hs) obj;
                                long j12 = hsVar.a;
                                long j13 = hsVar.b;
                                if (!o5.C(j12)) {
                                    int i16 = i12;
                                    if (j13 != 0 && (f7 = wp.r1(i16).r7.f(-j12, j13)) != null && (message = f7.topicStartMessage) != null) {
                                        kjVar = new kj(i16, message, false, false);
                                        kjVar.p = true;
                                    }
                                    kj kjVar2 = kjVar;
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.id);
                                    hashMap.put("bot", "" + j11);
                                    rz.S(i13, j12, 0L, 0L, hashMap, org.telegram.messenger.c.a(i16), kjVar2, kjVar2, null, tL_messages_preparedInlineMessage4.result, null, T, null, z12);
                                    if (charSequence != null) {
                                        rz.C(i16).r0(pz.b(charSequence.toString(), j12, kjVar2, kjVar2, null, true, null, null, null, true, 0, 0, null, false));
                                    }
                                    arrayList3.add(Long.valueOf(j12));
                                }
                            }
                            c1 c1Var2 = c1.this;
                            if (!c1Var2.U1) {
                                c1Var2.U1 = true;
                                eVar.a(arrayList3.size() <= 0 ? "USER_DECLINED" : null, arrayList3);
                            }
                            if (nb1Var == null) {
                                zxVar.finishFragment();
                                return true;
                            }
                            nb1Var.finishFragment();
                            zxVar.removeSelfFromStack();
                            return true;
                        }
                    };
                    T.presentFragment(a1Var);
                    c1Var.dismiss();
                    qVar3.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ne0(rh.e0 e0Var, un unVar, int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, org.telegram.messenger.r20 r20Var) {
        this.d = e0Var;
        this.b = i10;
        this.e = context;
        this.f = p6Var;
        this.c = j10;
        this.h = r20Var;
    }

    public /* synthetic */ ne0(xh.c1 c1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, org.telegram.tgnet.e eVar, int i10, long j10, org.telegram.ui.web.q qVar) {
        this.d = c1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f = eVar;
        this.b = i10;
        this.c = j10;
        this.h = qVar;
    }
}
