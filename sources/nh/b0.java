package nh;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.u51;
import org.telegram.ui.fy;
import org.telegram.ui.ox;
import org.telegram.ui.tn;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        k51 k51Var;
        k51 k51Var2;
        k51 k51Var3;
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.b;
                e0Var.f0.n.P = ((Float) obj).floatValue();
                d0 d0Var = e0Var.f0;
                cg.v2 v2Var = d0Var.d;
                if (v2Var != null) {
                    v2Var.setVolume(d0Var.n.P);
                    break;
                }
                break;
            case 1:
                r0 r0Var = (r0) this.b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.c);
                    break;
                }
                break;
            case 2:
                p2 p2Var = (p2) this.b;
                p2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new lh.r3(27, p2Var, (Runnable) obj), 80L);
                break;
            case 3:
                ((n3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
                break;
            case 4:
                ja jaVar = (ja) ((t5) this.b);
                gb gbVar = jaVar.w2;
                gbVar.T0.q((MessageObject) obj);
                o7 o7Var = gbVar.G1;
                int i11 = 0;
                if (o7Var != null && gbVar.K1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(o7Var.y);
                    boolean z10 = !isEmpty;
                    ((cg0) gbVar.f1.c).a(!gbVar.T0.k(), false);
                    gbVar.f1.setVisibility(0);
                    gbVar.f1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new hh.f(11, jaVar, z10)).start();
                }
                if (gbVar.w0.j()) {
                    ArrayList arrayList = gbVar.w0.h;
                    int size = arrayList.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            o7 o7Var2 = ((d0) obj2).n;
                            if (o7Var2 != null && o7Var2.K) {
                                i10 = TextUtils.isEmpty(gbVar.G1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                gbVar.l0(i10, true, true);
                break;
            case 5:
                n7 n7Var = (n7) obj;
                l61 l61Var = ((f6) this.b).n;
                if (l61Var != null) {
                    l61Var.setHDRInfo(n7Var);
                    break;
                }
                break;
            case 6:
                y7 y7Var = (y7) this.b;
                bg.h1 h1Var = (bg.h1) obj;
                if (h1Var == null) {
                    y7Var.U();
                    break;
                } else {
                    y7Var.k0 = h1Var.e;
                    y7Var.j0 = h1Var.f;
                    break;
                }
            case 7:
                ((u8) this.b).n.S.D = ((Integer) obj).intValue();
                break;
            case 8:
                ((ca) this.b).g((Utilities.Callback) obj);
                break;
            case 9:
                AndroidUtilities.hideKeyboard((st) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 10:
                org.telegram.ui.web.w0 w0Var = ((BotWebViewContainer$WebViewProxy) this.b).b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                sb2.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb2.append(")");
                w0Var.d(sb2.toString());
                break;
            case 11:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.b;
                d1Var.e = (ArrayList) obj;
                o51 o51Var = d1Var.a;
                if (o51Var.C) {
                    o51Var.U2.N(true);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.b;
                w1Var.n = ((ArrayList) obj).size();
                o51 o51Var2 = w1Var.a;
                if (o51Var2 != null && (k51Var = o51Var2.U2) != null && o51Var2.C) {
                    k51Var.N(true);
                    break;
                }
                break;
            case 13:
                ph.r rVar = (ph.r) this.b;
                ArrayList arrayList2 = rVar.b;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj);
                u51 u51Var = rVar.a;
                if (u51Var != null && (k51Var2 = u51Var.U2) != null) {
                    k51Var2.N(true);
                    break;
                }
                break;
            case 14:
                qh.g gVar = (qh.g) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = gVar.h;
                boolean z11 = arrayList4 == null || arrayList4.isEmpty();
                gVar.h = arrayList3;
                u51 u51Var2 = gVar.e;
                if (u51Var2 != null) {
                    u51Var2.U2.N(z11);
                    break;
                }
                break;
            case 15:
                ((rf.l) this.b).L((TLRPC.User) obj);
                break;
            case 16:
                TLRPC.User user = (TLRPC.User) obj;
                mn0 mn0Var = (mn0) ((rf.a0) this.b);
                ox oxVar = mn0Var.G0;
                if (user != null) {
                    fy fyVar = oxVar.F0;
                    if (fyVar != null) {
                        fyVar.K3();
                    }
                    MessagesController.getInstance(oxVar.D0).openApp(user, 0);
                    mn0Var.R(user.id, user);
                    break;
                }
                break;
            case 17:
                sf.l lVar = (sf.l) this.b;
                boolean z12 = ((Integer) obj).intValue() > AndroidUtilities.dp(20.0f);
                if (lVar.B != z12) {
                    lVar.B = z12;
                    if (!z12) {
                        lVar.a.x0(0);
                        break;
                    }
                }
                break;
            case 18:
                AndroidUtilities.forEachViews((RecyclerView) ((sf.d0) this.b).s, (f5.d) new l4.x0(16));
                break;
            case 19:
                sf.l0 l0Var = (sf.l0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                l0Var.C = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : l0Var.C.connected_bots.get(0);
                l0Var.D = tL_connectedBot;
                l0Var.I = tL_connectedBot == null ? null : l0Var.getMessagesController().getUser(Long.valueOf(l0Var.D.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = l0Var.D;
                l0Var.F = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = l0Var.D;
                l0Var.E = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                sf.w wVar = l0Var.v;
                if (wVar != null) {
                    wVar.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                u51 u51Var3 = l0Var.c;
                if (u51Var3 != null && (k51Var3 = u51Var3.U2) != null) {
                    k51Var3.N(true);
                }
                l0Var.Y(true);
                l0Var.P = true;
                break;
            case 20:
                sf.n0 n0Var = (sf.n0) this.b;
                n0Var.w = n0Var.e[((Integer) obj).intValue()];
                n0Var.V(true);
                break;
            case 21:
                sf.n1 n1Var = (sf.n1) this.b;
                n1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", n1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                tn tnVar = new tn(bundle);
                tnVar.y9 = true;
                n1Var.presentFragment(tnVar);
                break;
            case 22:
                AndroidUtilities.hideKeyboard((sf.h1) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 23:
                th.g3 g3Var = (th.g3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i12 = g3Var.b;
                int i13 = g3Var.a;
                th.p3 p3Var = g3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList5 = p3Var.h3;
                    ArrayList arrayList6 = p3Var.h3;
                    if (i13 < arrayList5.size() && i12 < arrayList6.size()) {
                        th.b2 b2Var = p3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        th.d3 d3Var = p3Var.j3;
                        if (d3Var != null) {
                            d3Var.f(false);
                        }
                        th.a aVar = (th.a) arrayList6.get(i13);
                        th.a aVar2 = (th.a) arrayList6.get(i12);
                        String M4 = th.p3.A3(aVar.b) ? p3Var.M4(aVar) : "";
                        CharSequence M42 = th.p3.A3(aVar2.b) ? p3Var.M4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M4.subSequence(0, Math.max(0, Math.min(g3Var.c, M4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M42.subSequence(Math.max(0, Math.min(g3Var.d, M42.length())), M42.length()));
                        ArrayList arrayList7 = new ArrayList();
                        th.p3.W2(arrayList7, richMessage.blocks, null);
                        if (arrayList7.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            th.t5.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList7.add(new th.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                th.a aVar3 = (th.a) arrayList7.get(0);
                                if (th.p3.A3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) th.t5.A(aVar3.b));
                                    th.t5.d(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    th.t5.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList7.add(0, new th.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                th.a aVar4 = (th.a) j7.l1.i(1, arrayList7);
                                if (th.p3.A3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(th.t5.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    th.t5.d(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    th.t5.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList7.add(new th.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = p3Var.g3;
                        if (richMessage2 == null) {
                            p3Var.g3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList8 = richMessage.photos;
                            if (arrayList8 != null) {
                                richMessage2.photos.addAll(arrayList8);
                            }
                            ArrayList<TLRPC.Document> arrayList9 = richMessage.documents;
                            if (arrayList9 != null) {
                                p3Var.g3.documents.addAll(arrayList9);
                            }
                        }
                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                            p3Var.v4((th.a) arrayList7.get(i14));
                        }
                        while (i12 >= i13) {
                            arrayList6.remove(i12);
                            i12--;
                        }
                        arrayList6.addAll(i13, arrayList7);
                        p3Var.s4();
                        p3Var.U2.N(false);
                        th.b2 b2Var2 = p3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        p3Var.d3.onContentChanged();
                        p3Var.post(new sf.o1(8, g3Var, arrayList7.isEmpty() ? null : (th.a) j7.l1.i(1, arrayList7)));
                        break;
                    }
                }
                break;
            case 24:
                ((th.k) this.b).a.r.U1((TL_iv.RichMessage) obj);
                break;
            case 25:
                ((th.x1) this.b).L.U1((TL_iv.RichMessage) obj);
                break;
            default:
                th.p3 p3Var2 = (th.p3) this.b;
                String str = (String) obj;
                p3Var2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str;
                    p3Var2.R1(pageblockmath);
                    break;
                }
                break;
        }
    }
}
