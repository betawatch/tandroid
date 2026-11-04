package ci;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.ej;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.pr;
import org.telegram.messenger.u10;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.id0;
import org.telegram.ui.m91;
import org.telegram.ui.nw;
import org.telegram.ui.uw;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ w0(x0 x0Var, wm wmVar, int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, u10 u10Var) {
        this.d = x0Var;
        this.b = i3;
        this.e = context;
        this.f = e6Var;
        this.c = j10;
        this.h = u10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z10;
        switch (this.a) {
            case 0:
                x0 x0Var = (x0) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f;
                u10 u10Var = (u10) this.h;
                if (x0Var.r1.d0) {
                    int i3 = this.b;
                    if (!hp.s1(i3).v2()) {
                        e9 x10 = e9.x(i3, x0Var.z1.a);
                        dg.a l10 = x10.e ? dg.a.l(x10.p()) : null;
                        if (!x0Var.k1 && (l10 == null || l10.b < x0Var.z1.b)) {
                            dg.a aVar = x0Var.z1;
                            dg.b bVar = aVar.a;
                            if (bVar != dg.b.a) {
                                if (bVar == dg.b.b) {
                                    new hi.f(context, e6Var, aVar, true, null).show();
                                    break;
                                }
                            } else {
                                long a10 = aVar.a();
                                long j10 = this.c;
                                new mb(context, e6Var, a10, 13, rg.c.h(i3, j10), null, j10).show();
                                break;
                            }
                        } else {
                            u10Var.a(new ej(x0Var.z1, x0Var.A1));
                            x0Var.dismiss();
                            break;
                        }
                    } else {
                        org.telegram.ui.b.b(i3);
                        break;
                    }
                }
                break;
            case 1:
                final ii.j1 j1Var = (ii.j1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final ai.n0 n0Var = (ai.n0) this.f;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.h;
                final org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    j1Var.U1 = true;
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
                            org.telegram.ui.web.r rVar2 = rVar;
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
                            rVar = rVar2;
                        }
                    }
                    org.telegram.ui.web.r rVar3 = rVar;
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage3 = tL_messages_preparedInlineMessage2;
                    ii.h1 h1Var = new ii.h1(j1Var, bundle, n0Var);
                    final int i11 = this.b;
                    final long j11 = this.c;
                    h1Var.D2 = new nw() { // from class: ii.y0
                        @Override // org.telegram.ui.nw
                        public final /* synthetic */ boolean G() {
                            return false;
                        }

                        @Override // org.telegram.ui.nw
                        public final /* synthetic */ boolean N(uw uwVar) {
                            return false;
                        }

                        @Override // org.telegram.ui.nw
                        public final boolean y(uw uwVar, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i12, int i13, m91 m91Var) {
                            TLRPC.TL_forumTopic f10;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i14 = 0;
                            while (true) {
                                r5 = null;
                                r5 = null;
                                zi ziVar = null;
                                if (i14 >= size2) {
                                    break;
                                }
                                Object obj = arrayList2.get(i14);
                                i14++;
                                pr prVar = (pr) obj;
                                long j12 = prVar.a;
                                long j13 = prVar.b;
                                if (!m5.C(j12)) {
                                    int i15 = i11;
                                    if (j13 != 0 && (f10 = hp.s1(i15).q7.f(-j12, j13)) != null && (message = f10.topicStartMessage) != null) {
                                        ziVar = new zi(i15, message, false, false);
                                        ziVar.p = true;
                                    }
                                    zi ziVar2 = ziVar;
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.id);
                                    hashMap.put("bot", "" + j11);
                                    yy.S(i12, j12, 0L, 0L, hashMap, org.telegram.messenger.c.a(i15), ziVar2, ziVar2, null, tL_messages_preparedInlineMessage4.result, null, T, null, z12);
                                    if (charSequence != null) {
                                        yy.C(i15).r0(wy.b(charSequence.toString(), j12, ziVar2, ziVar2, null, true, null, null, null, true, 0, 0, null, false));
                                    }
                                    arrayList3.add(Long.valueOf(j12));
                                }
                            }
                            j1 j1Var2 = j1.this;
                            if (!j1Var2.V1) {
                                j1Var2.V1 = true;
                                n0Var.a(arrayList3.size() <= 0 ? "USER_DECLINED" : null, arrayList3);
                            }
                            if (m91Var == null) {
                                uwVar.finishFragment();
                                return true;
                            }
                            m91Var.finishFragment();
                            uwVar.removeSelfFromStack();
                            return true;
                        }
                    };
                    T.presentFragment(h1Var);
                    j1Var.dismiss();
                    rVar3.run();
                    break;
                }
                break;
            default:
                id0 id0Var = (id0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.h;
                gi.d dVar = id0Var.b;
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
                    JSONObject u10 = ii.a3.u(null, false);
                    if (u10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = u10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    id0Var.w.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.y9(id0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w0(ii.j1 j1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, ai.n0 n0Var, int i3, long j10, org.telegram.ui.web.r rVar) {
        this.d = j1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f = n0Var;
        this.b = i3;
        this.c = j10;
        this.h = rVar;
    }

    public /* synthetic */ w0(id0 id0Var, String str, long j10, String str2, String str3, int i3) {
        this.d = id0Var;
        this.e = str;
        this.c = j10;
        this.f = str2;
        this.h = str3;
        this.b = i3;
    }
}
