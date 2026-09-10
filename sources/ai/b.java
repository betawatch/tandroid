package ai;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import bi.aa;
import bi.ad;
import bi.ce;
import bi.e8;
import bi.gb;
import bi.h0;
import bi.i0;
import bi.j0;
import bi.m3;
import bi.p4;
import bi.q9;
import bi.r7;
import bi.r9;
import bi.sc;
import bi.v0;
import fg.s1;
import gg.a1;
import gg.a2;
import gg.h2;
import gg.y0;
import hi.g2;
import hi.g6;
import hi.k2;
import hi.q3;
import hi.z3;
import java.util.ArrayList;
import og.h1;
import og.k1;
import og.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.eo;
import org.telegram.ui.gy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.telegram.ui.wy;
import pg.n0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        j61 j61Var;
        j61 j61Var2;
        int i11;
        switch (this.a) {
            case 0:
                g0 g0Var = (g0) this.b;
                String str = (String) obj;
                ArrayList arrayList = g0Var.h;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                    g0Var.i(true);
                }
                AndroidUtilities.runOnUIThread(new a1.e(5, g0Var, str), 120L);
                break;
            case 1:
                ((bi.o) this.b).x(((Integer) obj).intValue());
                break;
            case 2:
                j0 j0Var = (j0) this.b;
                j0Var.j0.n.P = ((Float) obj).floatValue();
                i0 i0Var = j0Var.j0;
                h0 h0Var = i0Var.d;
                if (h0Var != null) {
                    h0Var.setVolume(i0Var.n.P);
                    break;
                }
                break;
            case 3:
                v0 v0Var = (v0) this.b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = v0Var.c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(v0Var.c);
                    break;
                }
                break;
            case 4:
                m3 m3Var = (m3) this.b;
                m3Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new a1.e(12, m3Var, (Runnable) obj), 80L);
                break;
            case 5:
                ((p4) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(r1.w).start();
                break;
            case 6:
                ad adVar = (ad) ((r7) this.b);
                ce ceVar = adVar.A2;
                ceVar.X0.q((MessageObject) obj);
                r9 r9Var = ceVar.K1;
                int i12 = 0;
                if (r9Var != null && ceVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(r9Var.y);
                    boolean z10 = !isEmpty;
                    ((pg0) ceVar.j1.c).a(!ceVar.X0.k(), false);
                    ceVar.j1.setVisibility(0);
                    ceVar.j1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new j(5, adVar, z10)).start();
                }
                if (ceVar.A0.j()) {
                    ArrayList arrayList2 = ceVar.A0.h;
                    int size = arrayList2.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList2.get(i12);
                            i12++;
                            r9 r9Var2 = ((i0) obj2).n;
                            if (r9Var2 != null && r9Var2.K) {
                                i10 = TextUtils.isEmpty(ceVar.K1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                ceVar.l0(i10, true, true);
                break;
            case 7:
                q9 q9Var = (q9) obj;
                h71 h71Var = ((e8) this.b).n;
                if (h71Var != null) {
                    h71Var.setHDRInfo(q9Var);
                    break;
                }
                break;
            case 8:
                aa aaVar = (aa) this.b;
                n0 n0Var = (n0) obj;
                if (n0Var == null) {
                    aaVar.U();
                    break;
                } else {
                    aaVar.o0 = n0Var.e;
                    aaVar.n0 = n0Var.f;
                    break;
                }
            case 9:
                ((gb) this.b).n.W.H = ((Integer) obj).intValue();
                break;
            case 10:
                ((sc) this.b).g((Utilities.Callback) obj);
                break;
            case 11:
                di.x xVar = (di.x) this.b;
                ArrayList arrayList3 = xVar.b;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj);
                r61 r61Var = xVar.a;
                if (r61Var != null && (j61Var = r61Var.Y2) != null) {
                    j61Var.N(true);
                    break;
                }
                break;
            case 12:
                ei.f fVar = (ei.f) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = fVar.h;
                boolean z11 = arrayList5 == null || arrayList5.isEmpty();
                fVar.h = arrayList4;
                r61 r61Var2 = fVar.e;
                if (r61Var2 != null) {
                    r61Var2.Y2.N(z11);
                    break;
                }
                break;
            case 13:
                ((fg.m) this.b).L((TLRPC.User) obj);
                break;
            case 14:
                TLRPC.User user = (TLRPC.User) obj;
                ao0 ao0Var = (ao0) ((fg.h0) this.b);
                gy gyVar = ao0Var.K0;
                if (user != null) {
                    wy wyVar = gyVar.J0;
                    if (wyVar != null) {
                        wyVar.K3();
                    }
                    MessagesController.getInstance(gyVar.H0).openApp(user, 0);
                    ao0Var.R(user.id, user);
                    break;
                }
                break;
            case 15:
                gg.n nVar = (gg.n) this.b;
                boolean z12 = ((Integer) obj).intValue() > AndroidUtilities.dp(20.0f);
                if (nVar.F != z12) {
                    nVar.F = z12;
                    if (!z12) {
                        nVar.a.x0(0);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.forEachViews((RecyclerView) ((gg.n0) this.b).s, (e2.h) new gg.g0(0));
                break;
            case 17:
                y0 y0Var = (y0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                y0Var.G = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : y0Var.G.connected_bots.get(0);
                y0Var.H = tL_connectedBot;
                y0Var.M = tL_connectedBot == null ? null : y0Var.getMessagesController().getUser(Long.valueOf(y0Var.H.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = y0Var.H;
                y0Var.J = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = y0Var.H;
                y0Var.I = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                gg.e0 e0Var = y0Var.v;
                if (e0Var != null) {
                    e0Var.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                r61 r61Var3 = y0Var.c;
                if (r61Var3 != null && (j61Var2 = r61Var3.Y2) != null) {
                    j61Var2.N(true);
                }
                y0Var.Y(true);
                y0Var.T = true;
                break;
            case 18:
                a1 a1Var = (a1) this.b;
                a1Var.w = a1Var.e[((Integer) obj).intValue()];
                a1Var.V(true);
                break;
            case 19:
                h2 h2Var = (h2) this.b;
                h2Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", h2Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                eo eoVar = new eo(bundle);
                eoVar.C9 = true;
                h2Var.presentFragment(eoVar);
                break;
            case 20:
                AndroidUtilities.hideKeyboard((a2) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 21:
                q3 q3Var = (q3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i13 = q3Var.b;
                int i14 = q3Var.a;
                z3 z3Var = q3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList6 = z3Var.l3;
                    ArrayList arrayList7 = z3Var.l3;
                    if (i14 < arrayList6.size() && i13 < arrayList7.size()) {
                        k2 k2Var = z3Var.J3;
                        if (k2Var != null) {
                            k2Var.d();
                        }
                        hi.m3 m3Var2 = z3Var.n3;
                        if (m3Var2 != null) {
                            m3Var2.f(false);
                        }
                        hi.a aVar = (hi.a) arrayList7.get(i14);
                        hi.a aVar2 = (hi.a) arrayList7.get(i13);
                        String L4 = z3.z3(aVar.b) ? z3Var.L4(aVar) : "";
                        CharSequence L42 = z3.z3(aVar2.b) ? z3Var.L4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L4.subSequence(0, Math.max(0, Math.min(q3Var.c, L4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(L42.subSequence(Math.max(0, Math.min(q3Var.d, L42.length())), L42.length()));
                        ArrayList arrayList8 = new ArrayList();
                        z3.V2(arrayList8, richMessage.blocks, null);
                        if (arrayList8.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            g6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList8.add(new hi.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                hi.a aVar3 = (hi.a) arrayList8.get(0);
                                if (z3.z3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) g6.A(aVar3.b));
                                    g6.d(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    g6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList8.add(0, new hi.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                hi.a aVar4 = (hi.a) hc.b.i(1, arrayList8);
                                if (z3.z3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(g6.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    g6.d(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    g6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList8.add(new hi.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = z3Var.k3;
                        if (richMessage2 == null) {
                            z3Var.k3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList9 = richMessage.photos;
                            if (arrayList9 != null) {
                                richMessage2.photos.addAll(arrayList9);
                            }
                            ArrayList<TLRPC.Document> arrayList10 = richMessage.documents;
                            if (arrayList10 != null) {
                                z3Var.k3.documents.addAll(arrayList10);
                            }
                        }
                        for (int i15 = 0; i15 < arrayList8.size(); i15++) {
                            z3Var.u4((hi.a) arrayList8.get(i15));
                        }
                        while (i13 >= i14) {
                            arrayList7.remove(i13);
                            i13--;
                        }
                        arrayList7.addAll(i14, arrayList8);
                        z3Var.r4();
                        z3Var.Y2.N(false);
                        k2 k2Var2 = z3Var.J3;
                        if (k2Var2 != null) {
                            k2Var2.h();
                        }
                        z3Var.h3.onContentChanged();
                        z3Var.post(new s1(15, q3Var, arrayList8.isEmpty() ? null : (hi.a) hc.b.i(1, arrayList8)));
                        break;
                    }
                }
                break;
            case 22:
                ((hi.n) this.b).a.r.T1((TL_iv.RichMessage) obj);
                break;
            case 23:
                ((g2) this.b).P.T1((TL_iv.RichMessage) obj);
                break;
            case 24:
                z3 z3Var2 = (z3) this.b;
                String str2 = (String) obj;
                z3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    z3Var2.Q1(pageblockmath);
                    break;
                }
                break;
            case 25:
                og.g0 g0Var2 = (og.g0) this.b;
                k1 k1Var = (k1) obj;
                h1 h1Var = g0Var2.a;
                if (k1Var != null) {
                    float currentWeight = h1Var.getCurrentWeight();
                    k1Var.f = currentWeight;
                    double d = g0Var2.p;
                    if (d > 0.0d) {
                        k1Var.f = (float) ((d / g0Var2.q) * currentWeight);
                    }
                    if (k1Var.a.o() == 4) {
                        k1Var.k *= k1Var.f;
                    }
                }
                og.v0 painting = h1Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new q0(painting, k1Var, 1));
                    break;
                }
                break;
            case 26:
                oh.i iVar = (oh.i) this.b;
                if (((oh.b) obj) == oh.b.d && ((i11 = iVar.s) == 2 || i11 == 3)) {
                    iVar.s = 1;
                }
                iVar.h.run();
                break;
            case 27:
                AndroidUtilities.hideKeyboard((fu) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 28:
                org.telegram.ui.web.y0 y0Var2 = ((BotWebViewContainer$WebViewProxy) this.b).b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                sb2.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb2.append(")");
                y0Var2.d(sb2.toString());
                break;
            default:
                org.telegram.ui.web.h1 h1Var2 = (org.telegram.ui.web.h1) this.b;
                h1Var2.e = (ArrayList) obj;
                l61 l61Var = h1Var2.a;
                if (l61Var.G) {
                    l61Var.Y2.N(true);
                    break;
                }
                break;
        }
    }
}
