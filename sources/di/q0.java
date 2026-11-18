package di;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.fj;
import org.telegram.messenger.kj;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.sr;
import org.telegram.messenger.x10;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.md0;
import org.telegram.ui.ww;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ q0(r0 r0Var, bn bnVar, int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, x10 x10Var) {
        this.d = r0Var;
        this.b = i7;
        this.e = context;
        this.f = i6Var;
        this.c = j3;
        this.h = x10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z10;
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f;
                x10 x10Var = (x10) this.h;
                if (r0Var.u1.e0) {
                    int i7 = this.b;
                    if (!mp.u1(i7).A2()) {
                        x8 x10 = x8.x(i7, r0Var.C1.a);
                        cg.a m10 = x10.e ? cg.a.m(x10.p()) : null;
                        if (!r0Var.n1 && (m10 == null || m10.b < r0Var.C1.b)) {
                            cg.a aVar = r0Var.C1;
                            cg.b bVar = aVar.a;
                            if (bVar != cg.b.a) {
                                if (bVar == cg.b.b) {
                                    new ii.s(context, i6Var, aVar, true, null).show();
                                    break;
                                }
                            } else {
                                long a10 = aVar.a();
                                long j3 = this.c;
                                new fb(context, i6Var, a10, 13, qg.c.i(i7, j3), null, j3).show();
                                break;
                            }
                        } else {
                            x10Var.a(new kj(r0Var.C1, r0Var.D1));
                            r0Var.dismiss();
                            break;
                        }
                    } else {
                        org.telegram.ui.b.b(i7);
                        break;
                    }
                }
                break;
            case 1:
                final ki.h1 h1Var = (ki.h1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final bi.h0 h0Var = (bi.h0) this.f;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.h;
                final org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    h1Var.X1 = true;
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
                    ki.f1 f1Var = new ki.f1(h1Var, bundle, h0Var);
                    final int i11 = this.b;
                    final long j10 = this.c;
                    f1Var.E2 = new ww() { // from class: ki.x0
                        @Override // org.telegram.ui.ww
                        public final /* synthetic */ boolean G() {
                            return false;
                        }

                        @Override // org.telegram.ui.ww
                        public final /* synthetic */ boolean P(cx cxVar) {
                            return false;
                        }

                        @Override // org.telegram.ui.ww
                        public final boolean y(cx cxVar, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i12, int i13, y91 y91Var) {
                            TLRPC.TL_forumTopic f10;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i14 = 0;
                            while (true) {
                                r5 = null;
                                r5 = null;
                                fj fjVar = null;
                                if (i14 >= size2) {
                                    break;
                                }
                                Object obj = arrayList2.get(i14);
                                i14++;
                                sr srVar = (sr) obj;
                                long j11 = srVar.a;
                                long j12 = srVar.b;
                                if (!n5.C(j11)) {
                                    int i15 = i11;
                                    if (j12 != 0 && (f10 = mp.u1(i15).t7.f(-j11, j12)) != null && (message = f10.topicStartMessage) != null) {
                                        fjVar = new fj(i15, message, false, false);
                                        fjVar.p = true;
                                    }
                                    fj fjVar2 = fjVar;
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.id);
                                    hashMap.put("bot", "" + j10);
                                    zy.S(i12, j11, 0L, 0L, hashMap, org.telegram.messenger.c.a(i15), fjVar2, fjVar2, null, tL_messages_preparedInlineMessage4.result, null, T, null, z12);
                                    if (charSequence != null) {
                                        zy.C(i15).r0(xy.b(charSequence.toString(), j11, fjVar2, fjVar2, null, true, null, null, null, true, 0, 0, null, false));
                                    }
                                    arrayList3.add(Long.valueOf(j11));
                                }
                            }
                            h1 h1Var2 = h1.this;
                            if (!h1Var2.Y1) {
                                h1Var2.Y1 = true;
                                h0Var.a(arrayList3.size() <= 0 ? "USER_DECLINED" : null, arrayList3);
                            }
                            if (y91Var == null) {
                                cxVar.finishFragment();
                                return true;
                            }
                            y91Var.finishFragment();
                            cxVar.removeSelfFromStack();
                            return true;
                        }
                    };
                    T.presentFragment(f1Var);
                    h1Var.dismiss();
                    qVar3.run();
                    break;
                }
                break;
            default:
                md0 md0Var = (md0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.h;
                hi.d dVar = md0Var.b;
                if (!dVar.R) {
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
                    JSONObject u10 = ki.t2.u(null, false);
                    if (u10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = u10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    md0Var.w.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.z9(md0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q0(ki.h1 h1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, bi.h0 h0Var, int i7, long j3, org.telegram.ui.web.q qVar) {
        this.d = h1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f = h0Var;
        this.b = i7;
        this.c = j3;
        this.h = qVar;
    }

    public /* synthetic */ q0(md0 md0Var, String str, long j3, String str2, String str3, int i7) {
        this.d = md0Var;
        this.e = str;
        this.c = j3;
        this.f = str2;
        this.h = str3;
        this.b = i7;
    }
}
