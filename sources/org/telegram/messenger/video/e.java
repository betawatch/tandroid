package org.telegram.messenger.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.v3;
import c8.ja;
import di.k0;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.o0;
import li.v;
import oi.z3;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.ou;
import org.telegram.messenger.s10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.l0;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.ActionBar.p0;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.d0;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.q4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a1;
import org.telegram.ui.an;
import org.telegram.ui.b5;
import org.telegram.ui.bt;
import org.telegram.ui.c5;
import org.telegram.ui.d7;
import org.telegram.ui.f9;
import org.telegram.ui.g4;
import org.telegram.ui.i4;
import org.telegram.ui.i7;
import org.telegram.ui.i9;
import org.telegram.ui.id;
import org.telegram.ui.k3;
import org.telegram.ui.m7;
import org.telegram.ui.mp;
import org.telegram.ui.n50;
import org.telegram.ui.n8;
import org.telegram.ui.nd;
import org.telegram.ui.o8;
import org.telegram.ui.qn;
import org.telegram.ui.sc1;
import org.telegram.ui.t3;
import org.telegram.ui.w;
import org.telegram.ui.w6;
import org.telegram.ui.web.s0;
import org.telegram.ui.web.v0;
import org.telegram.ui.wn;
import org.telegram.ui.x;
import org.telegram.ui.xd;
import org.telegram.ui.y6;
import org.telegram.ui.z41;
import ug.x0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [org.telegram.ui.ActionBar.e6, org.telegram.ui.ActionBar.m6] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? r12;
        String str;
        int i7 = this.a;
        int i10 = 2;
        ?? r72 = 0;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                break;
            case 1:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                break;
            case 2:
                q0 q0Var = (q0) obj2;
                p0 p0Var = (p0) obj;
                int indexOf = q0Var.h0.indexOf(p0Var.getFilter());
                if (q0Var.i0 == indexOf) {
                    if (p0Var.getFilter().h) {
                        if (!p0Var.a.f) {
                            p0Var.setSelectedForDelete(true);
                            break;
                        } else {
                            o0 filter = p0Var.getFilter();
                            q0Var.J(filter);
                            m0 m0Var = q0Var.I;
                            if (m0Var != null) {
                                m0Var.j(filter);
                                q0Var.I.l(q0Var.e);
                                break;
                            }
                        }
                    }
                } else {
                    q0Var.i0 = indexOf;
                    q0Var.E();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.o0 o0Var = (org.telegram.ui.ActionBar.o0) obj2;
                q0 q0Var2 = (q0) obj;
                if (q0Var2.y() && o0Var.f) {
                    if (!q0Var2.U) {
                        q0Var2.U = true;
                        q0Var2.r();
                    }
                }
                y yVar = q0Var2.c;
                if (yVar == null) {
                    l0 l0Var = q0Var2.Q;
                    if (l0Var != null) {
                        l0Var.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                } else {
                    yVar.o(((Integer) view.getTag()).intValue());
                    break;
                }
                break;
            case 4:
                t1 t1Var = (t1) obj2;
                if (!((m1) obj).a) {
                    q1 q1Var = t1Var.n0;
                    if (q1Var != null) {
                        q1Var.h(t1Var, -1);
                    }
                    if (t1Var.k0) {
                        t1Var.dismiss();
                        break;
                    }
                }
                break;
            case 5:
                t1 t1Var2 = (t1) obj2;
                if (!((m1) obj).a) {
                    q1 q1Var2 = t1Var2.p0;
                    if (q1Var2 != null) {
                        q1Var2.h(t1Var2, -2);
                    }
                    if (t1Var2.k0) {
                        t1Var2.cancel();
                        break;
                    }
                }
                break;
            case 6:
                t1 t1Var3 = (t1) obj2;
                if (!((m1) obj).a) {
                    q1 q1Var3 = t1Var3.t0;
                    if (q1Var3 != null) {
                        q1Var3.h(t1Var3, -2);
                    }
                    if (t1Var3.k0) {
                        t1Var3.dismiss();
                        break;
                    }
                }
                break;
            case 7:
                t1 t1Var4 = (t1) obj2;
                if (!((m1) obj).a) {
                    z3 z3Var = t1Var4.r0;
                    if (z3Var != null) {
                        z3Var.h(t1Var4, -2);
                    }
                    if (t1Var4.k0) {
                        t1Var4.cancel();
                        break;
                    }
                }
                break;
            case 8:
                g4 g4Var = (g4) obj2;
                Activity activity = (Activity) obj;
                t3 t3Var = g4Var.L;
                if (!g4Var.i0.B0) {
                    k3 k3Var = g4Var.v0[0];
                    if (!k3Var.f()) {
                        if (t3Var == null) {
                            k3Var.b.y0(0);
                            break;
                        } else {
                            bu0 bu0Var = new bu0(activity);
                            bu0Var.a = 1;
                            bu0Var.s = -g0.L(32.0f);
                            k3Var.d.w0(bu0Var);
                            break;
                        }
                    } else if (k3Var.getWebView() != null && !g4Var.i0.a0) {
                        if (g4Var.j0 != null) {
                            s0 webView = k3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String u10 = v0.u(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.k kVar = g4Var.j0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = hd.M0(2131742926, null);
                            }
                            String str2 = TextUtils.isEmpty(u10) ? "about:blank" : u10;
                            w wVar = new w(g4Var, u10, i11);
                            x xVar = new x(g4Var, k3Var, activity, i11);
                            org.telegram.ui.q qVar = new org.telegram.ui.q(g4Var, i12);
                            org.telegram.ui.q qVar2 = new org.telegram.ui.q(g4Var, 2);
                            org.telegram.ui.y yVar2 = new org.telegram.ui.y(g4Var, u10, k3Var, i11);
                            v3 v3Var = kVar.x;
                            ImageView imageView = kVar.f;
                            if (favicon == null) {
                                imageView.setImageResource(R.drawable.msg_language);
                                imageView.setColorFilter(new PorterDuffColorFilter(kVar.I, PorterDuff.Mode.SRC_IN));
                                r12 = 0;
                            } else {
                                imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), favicon));
                                r12 = 0;
                                imageView.setColorFilter((ColorFilter) null);
                            }
                            TextView textView = kVar.r;
                            textView.setText(j6.m(title, textView.getPaint().getFontMetricsInt(), false, r12, 0));
                            try {
                                try {
                                    Uri parse = Uri.parse(str2);
                                    str2 = vf.c.w(parse, r12, r12, vf.c.a(parse.getHost()), r12);
                                } catch (Exception e10) {
                                    a8.g(e10, false);
                                }
                                str = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e11) {
                                a8.g(e11, true);
                                str = str2;
                            }
                            TextView textView2 = kVar.s;
                            textView2.setText(j6.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            kVar.M = xVar;
                            kVar.N = qVar;
                            kVar.O = qVar2;
                            kVar.e.setOnClickListener(new sc1(1, kVar, wVar));
                            kVar.n.setOnClickListener(yVar2);
                            kVar.b = false;
                            kVar.setInput(null);
                            v3Var.g3.O(true);
                            v3Var.v0(0);
                        }
                        org.telegram.ui.l0 l0Var2 = g4Var.i0;
                        v vVar = new v(10, k3Var, activity);
                        di.q qVar3 = l0Var2.c0;
                        qVar3.setText("");
                        qVar3.setSelection(0, qVar3.getText().length());
                        qVar3.setScrollX(0);
                        l0Var2.w0 = vVar;
                        l0Var2.k(true);
                        break;
                    }
                }
                break;
            case 9:
                a1 a1Var = (a1) obj2;
                n50 n50Var = (n50) obj;
                if (a1Var.h == 0) {
                    a1Var.a(1, true);
                    int i13 = ((g4) n50Var).Y;
                    TLRPC.Chat chat = n50Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = np.i1(chat);
                    ConnectionsManager.getInstance(i13).sendRequestTyped(tL_channels_joinChannel, new k0(a1Var, i13, tL_channels_joinChannel, chat, 4));
                    break;
                }
                break;
            case 10:
                b5 b5Var = (b5) obj2;
                b5Var.b(false);
                b5Var.e.c((c5) obj);
                break;
            case 11:
                ((y6) ((w6) obj2).f).x0((c2) obj);
                break;
            case 12:
                d7 d7Var = (d7) obj2;
                m7 m7Var = (m7) obj;
                i7 i7Var = d7Var.f.G;
                if (i7Var != null) {
                    i7Var.N(m7Var.c, m7Var.d, true);
                }
                g1 g1Var = d7Var.a;
                if (g1Var != null) {
                    g1Var.d(true);
                    break;
                }
                break;
            case 13:
                i9 i9Var = (i9) obj2;
                f9 f9Var = (f9) obj;
                ArrayList arrayList = f9Var.b;
                if (arrayList.size() != 1) {
                    boolean z10 = f9Var.e;
                    HashSet hashSet = new HashSet();
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList.get(i14);
                        i14++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) f9Var.c.get(0)).id;
                    t1 t1Var5 = new t1(3, i9Var.getParentActivity(), null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = i9Var.getMessagesController().Q6;
                    t1Var5.setOnCancelListener(new o8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(i9Var, t1Var5, hashSet, tL_inputGroupCallInviteMessage, z10, 1)), i12));
                    t1Var5.r(600L);
                    break;
                } else {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull b22 = i9Var.getMessagesController().b2(user.id);
                    i9Var.M = user;
                    boolean z11 = f9Var.e;
                    org.telegram.ui.Components.voip.c2.m(user, z11, z11 || (b22 != null && b22.video_calls_available), i9Var.getParentActivity(), null, i9Var.getAccountInstance());
                    break;
                }
            case 14:
                xd xdVar = (xd) obj2;
                z41 z41Var = (z41) obj;
                hi.d dVar = xdVar.B0;
                if (view.isEnabled() && !dVar.R) {
                    nd ndVar = xdVar.H0;
                    if (ndVar == null || !ndVar.R) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        org.telegram.ui.hd hdVar = new org.telegram.ui.hd(xdVar, twoStepVerificationActivity, i11);
                        twoStepVerificationActivity.a0 = 1;
                        twoStepVerificationActivity.c0 = hdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.x0(new id(xdVar, z41Var, twoStepVerificationActivity, i11));
                        break;
                    }
                }
                break;
            case 15:
                vf.c.t((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                break;
            case 16:
                an anVar = (an) obj2;
                if (anVar.getMediaDataController().V1(((gj) obj).F0())) {
                    anVar.h8();
                    UndoView undoView = anVar.N3;
                    if (undoView != null) {
                        long j3 = anVar.k6;
                        int i15 = UndoView.j0;
                        undoView.j(83, j3, new i4(anVar, 1));
                    }
                }
                anVar.P7(true);
                break;
            case 17:
                an.C1((an) obj2, (String) obj);
                break;
            case 18:
                an.p1((an) obj2, (m60) obj);
                break;
            case 19:
                c2 c2Var = (c2) obj2;
                boolean z12 = !c2Var.b();
                c2Var.c(z12, true);
                ((AtomicBoolean) obj).set(z12);
                break;
            case 20:
                an.s1((an) obj2, (Context) obj);
                break;
            case 21:
                qn qnVar = (qn) obj2;
                Context context = (Context) obj;
                ou ouVar = new ou(context, (e6) null);
                ((u2) ouVar.b).v0 = false;
                LinearLayout f10 = k5.f(context, 1);
                n4 n4Var = new n4(context, org.telegram.ui.ActionBar.j6.n5, 23, 15, false, null);
                n4Var.setHeight(47);
                n4Var.setText(hd.M0(2131752233, "ChatHistory"));
                f10.addView(n4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                f10.addView(linearLayout, ja.o(-1, -2));
                g6[] g6VarArr = new g6[2];
                int i16 = 0;
                while (i16 < i10) {
                    g6 g6Var = new g6(context, true);
                    g6VarArr[i16] = g6Var;
                    g6Var.setTag(Integer.valueOf(i16));
                    q6.Q(g6VarArr[i16], org.telegram.ui.ActionBar.j6.N0(false), r72, q6.M(org.telegram.ui.ActionBar.j6.i6), r72);
                    if (i16 == 0) {
                        g6VarArr[i16].b(hd.M0(2131752228, "ChatHistoryVisible"), hd.M0(2131752227, "ChatHistoryVisibleInfo"), true, !qnVar.K0);
                    } else if (org.telegram.messenger.t3.T(qnVar.x0)) {
                        g6VarArr[i16].b(hd.M0(2131752232, "ChatHistoryHidden"), hd.M0(2131752231, "ChatHistoryHiddenInfo"), false, qnVar.K0);
                    } else {
                        g6VarArr[i16].b(hd.M0(2131752232, "ChatHistoryHidden"), hd.M0(2131752230, "ChatHistoryHiddenInfo2"), false, qnVar.K0);
                    }
                    linearLayout.addView(g6VarArr[i16], ja.o(-1, -2));
                    g6VarArr[i16].setOnClickListener(new org.telegram.ui.y(qnVar, g6VarArr, ouVar, 8));
                    i16++;
                    i10 = 2;
                    r72 = 0;
                }
                u2 u2Var = (u2) ouVar.b;
                u2Var.O = f10;
                qnVar.showDialog(u2Var);
                break;
            case 22:
                qn.Z((qn) obj2, (FrameLayout) obj, view);
                break;
            case 23:
                mp.a0((mp) obj2, (ou) obj, view);
                break;
            case 24:
                new x0(42, ((d0) obj2).getContext(), (e6) obj).show();
                break;
            case 25:
                final org.telegram.ui.Components.y yVar3 = (org.telegram.ui.Components.y) obj2;
                final e6 e6Var = (e6) obj;
                org.telegram.ui.Cells.k3 k3Var2 = yVar3.X1;
                org.telegram.ui.Cells.k3 k3Var3 = yVar3.W1;
                fp fpVar = yVar3.Z1;
                hi.d dVar2 = yVar3.c2;
                if (!dVar2.R) {
                    if (!dVar2.d0) {
                        if (yVar3.d2 == null) {
                            yVar3.d1();
                            break;
                        }
                    } else {
                        dVar2.setLoading(true);
                        if (yVar3.f2 == null) {
                            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
                            createtone.display_author = fpVar.a.q;
                            createtone.emoji_id = yVar3.d2.longValue();
                            createtone.title = k3Var3.getText().toString();
                            createtone.prompt = k3Var2.getText().toString();
                            ConnectionsManager.getInstance(yVar3.a).sendRequestTyped(createtone, new d3.b(i12), new s10() { // from class: org.telegram.ui.Components.t
                                @Override // org.telegram.messenger.s10
                                public final void a(Object obj4, Object obj5) {
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                    switch (i12) {
                                        case 0:
                                            y yVar4 = yVar3;
                                            yVar4.c2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    org.telegram.ui.Cells.y0.q(yVar4.b2, e6Var, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                f fVar = yVar4.h2;
                                                if (fVar != null) {
                                                    fVar.a(aiComposeTone);
                                                }
                                                yVar4.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            y yVar5 = yVar3;
                                            FrameLayout frameLayout = yVar5.b2;
                                            yVar5.c2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                                    if (!equalsIgnoreCase) {
                                                        org.telegram.ui.Cells.y0.q(frameLayout, e6Var2, tL_error, false);
                                                        break;
                                                    } else {
                                                        d0.t1(new cc(frameLayout, e6Var2), yVar5.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                yVar5.dismiss();
                                                f fVar2 = yVar5.g2;
                                                if (fVar2 != null) {
                                                    fVar2.a(aiComposeTone);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                            updatetone.flags |= 1;
                            updatetone.display_author = fpVar.a.q;
                            updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar3.f2);
                            updatetone.flags |= 2;
                            updatetone.emoji_id = yVar3.d2.longValue();
                            updatetone.flags |= 4;
                            updatetone.title = k3Var3.getText().toString();
                            updatetone.flags |= 8;
                            updatetone.prompt = k3Var2.getText().toString();
                            ConnectionsManager.getInstance(yVar3.a).sendRequestTyped(updatetone, new d3.b(i12), new s10() { // from class: org.telegram.ui.Components.t
                                @Override // org.telegram.messenger.s10
                                public final void a(Object obj4, Object obj5) {
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                    switch (i11) {
                                        case 0:
                                            y yVar4 = yVar3;
                                            yVar4.c2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    org.telegram.ui.Cells.y0.q(yVar4.b2, e6Var, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                f fVar = yVar4.h2;
                                                if (fVar != null) {
                                                    fVar.a(aiComposeTone);
                                                }
                                                yVar4.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            y yVar5 = yVar3;
                                            FrameLayout frameLayout = yVar5.b2;
                                            yVar5.c2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                                    if (!equalsIgnoreCase) {
                                                        org.telegram.ui.Cells.y0.q(frameLayout, e6Var2, tL_error, false);
                                                        break;
                                                    } else {
                                                        d0.t1(new cc(frameLayout, e6Var2), yVar5.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                yVar5.dismiss();
                                                f fVar2 = yVar5.g2;
                                                if (fVar2 != null) {
                                                    fVar2.a(aiComposeTone);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    }
                }
                break;
            case 26:
                ((z10) obj2).a((TL_aicompose.AiComposeTone) obj);
                break;
            case 27:
                q0 q0Var3 = (q0) obj2;
                q4 q4Var = (q4) obj;
                q0Var3.V(null, null);
                q0Var3.P(q4Var.d, false);
                q0Var3.setupPopupRadialSelectors(q4Var.f);
                q0Var3.I(q4Var.e);
                break;
            case 28:
                boolean[] zArr = (boolean[]) obj2;
                boolean z13 = !zArr[0];
                zArr[0] = z13;
                ((c2) view).c(z13, true);
                ((wn) obj).run();
                break;
            default:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.M0.run();
                ((bt) obj).onClick(null, intValue);
                break;
        }
    }
}
