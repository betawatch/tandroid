package di;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.lj;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.kd0;
import org.telegram.ui.sw;
import org.telegram.ui.u91;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ r0(s0 s0Var, an anVar, int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, z10 z10Var) {
        this.d = s0Var;
        this.b = i7;
        this.e = context;
        this.f = e6Var;
        this.c = j3;
        this.h = z10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z10;
        switch (this.a) {
            case 0:
                s0 s0Var = (s0) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f;
                z10 z10Var = (z10) this.h;
                if (s0Var.u1.d0) {
                    int i7 = this.b;
                    if (!np.s1(i7).v2()) {
                        u8 x10 = u8.x(i7, s0Var.C1.a);
                        cg.a l10 = x10.e ? cg.a.l(x10.p()) : null;
                        if (!s0Var.n1 && (l10 == null || l10.b < s0Var.C1.b)) {
                            cg.a aVar = s0Var.C1;
                            cg.b bVar = aVar.a;
                            if (bVar != cg.b.a) {
                                if (bVar == cg.b.b) {
                                    new ii.e(context, e6Var, aVar, true, null).show();
                                    break;
                                }
                            } else {
                                long a10 = aVar.a();
                                long j3 = this.c;
                                new bb(context, e6Var, a10, 13, qg.c.h(i7, j3), null, j3).show();
                                break;
                            }
                        } else {
                            z10Var.a(new lj(s0Var.C1, s0Var.D1));
                            s0Var.dismiss();
                            break;
                        }
                    } else {
                        org.telegram.ui.b.b(i7);
                        break;
                    }
                }
                break;
            case 1:
                final ki.j1 j1Var = (ki.j1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final bi.h0 h0Var = (bi.h0) this.f;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.h;
                final org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    j1Var.X1 = true;
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
                    ki.h1 h1Var = new ki.h1(j1Var, bundle, h0Var);
                    final int i11 = this.b;
                    final long j10 = this.c;
                    h1Var.E2 = new sw() { // from class: ki.y0
                        @Override // org.telegram.ui.sw
                        public final /* synthetic */ boolean H() {
                            return false;
                        }

                        @Override // org.telegram.ui.sw
                        public final /* synthetic */ boolean P(yw ywVar) {
                            return false;
                        }

                        @Override // org.telegram.ui.sw
                        public final boolean y(yw ywVar, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i12, int i13, u91 u91Var) {
                            TLRPC.TL_forumTopic f10;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i14 = 0;
                            while (true) {
                                r5 = null;
                                r5 = null;
                                gj gjVar = null;
                                if (i14 >= size2) {
                                    break;
                                }
                                Object obj = arrayList2.get(i14);
                                i14++;
                                ur urVar = (ur) obj;
                                long j11 = urVar.a;
                                long j12 = urVar.b;
                                if (!m5.C(j11)) {
                                    int i15 = i11;
                                    if (j12 != 0 && (f10 = np.s1(i15).r7.f(-j11, j12)) != null && (message = f10.topicStartMessage) != null) {
                                        gjVar = new gj(i15, message, false, false);
                                        gjVar.p = true;
                                    }
                                    gj gjVar2 = gjVar;
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.id);
                                    hashMap.put("bot", "" + j10);
                                    ez.S(i12, j11, 0L, 0L, hashMap, org.telegram.messenger.c.a(i15), gjVar2, gjVar2, null, tL_messages_preparedInlineMessage4.result, null, T, null, z12);
                                    if (charSequence != null) {
                                        ez.C(i15).r0(cz.b(charSequence.toString(), j11, gjVar2, gjVar2, null, true, null, null, null, true, 0, 0, null, false));
                                    }
                                    arrayList3.add(Long.valueOf(j11));
                                }
                            }
                            j1 j1Var2 = j1.this;
                            if (!j1Var2.Y1) {
                                j1Var2.Y1 = true;
                                h0Var.a(arrayList3.size() <= 0 ? "USER_DECLINED" : null, arrayList3);
                            }
                            if (u91Var == null) {
                                ywVar.finishFragment();
                                return true;
                            }
                            u91Var.finishFragment();
                            ywVar.removeSelfFromStack();
                            return true;
                        }
                    };
                    T.presentFragment(h1Var);
                    j1Var.dismiss();
                    qVar3.run();
                    break;
                }
                break;
            default:
                kd0 kd0Var = (kd0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.h;
                hi.d dVar = kd0Var.b;
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
                    JSONObject u10 = ki.x2.u(null, false);
                    if (u10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = u10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    kd0Var.w.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new org.telegram.ui.z9(kd0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ r0(ki.j1 j1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, bi.h0 h0Var, int i7, long j3, org.telegram.ui.web.q qVar) {
        this.d = j1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f = h0Var;
        this.b = i7;
        this.c = j3;
        this.h = qVar;
    }

    public /* synthetic */ r0(kd0 kd0Var, String str, long j3, String str2, String str3, int i7) {
        this.d = kd0Var;
        this.e = str;
        this.c = j3;
        this.f = str2;
        this.h = str3;
        this.b = i7;
    }
}
