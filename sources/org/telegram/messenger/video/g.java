package org.telegram.messenger.video;

import ai.h4;
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
import b8.mf;
import ci.s;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kg.l0;
import mi.c4;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.k5;
import org.telegram.messenger.n10;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l1;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.o0;
import org.telegram.ui.ActionBar.p0;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.ActionBar.x;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.k3;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.voip.n1;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a0;
import org.telegram.ui.b1;
import org.telegram.ui.d5;
import org.telegram.ui.e5;
import org.telegram.ui.e7;
import org.telegram.ui.e9;
import org.telegram.ui.h9;
import org.telegram.ui.hd;
import org.telegram.ui.i4;
import org.telegram.ui.i50;
import org.telegram.ui.id;
import org.telegram.ui.ip;
import org.telegram.ui.j7;
import org.telegram.ui.k4;
import org.telegram.ui.l3;
import org.telegram.ui.ln;
import org.telegram.ui.n7;
import org.telegram.ui.n8;
import org.telegram.ui.nd;
import org.telegram.ui.o8;
import org.telegram.ui.r41;
import org.telegram.ui.rn;
import org.telegram.ui.u3;
import org.telegram.ui.web.t0;
import org.telegram.ui.web.w0;
import org.telegram.ui.wm;
import org.telegram.ui.ws;
import org.telegram.ui.x6;
import org.telegram.ui.xd;
import org.telegram.ui.y;
import org.telegram.ui.z;
import org.telegram.ui.z6;
import vg.v0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [org.telegram.ui.ActionBar.e6, org.telegram.ui.ActionBar.n6] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? r12;
        String str;
        int i3 = this.a;
        int i10 = 2;
        ?? r72 = 0;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                break;
            case 1:
                q0 q0Var = (q0) obj2;
                p0 p0Var = (p0) obj;
                int indexOf = q0Var.h0.indexOf(p0Var.getFilter());
                if (q0Var.i0 == indexOf) {
                    if (p0Var.getFilter().h) {
                        if (!p0Var.a.f) {
                            p0Var.setSelectedForDelete(true);
                            break;
                        } else {
                            l0 filter = p0Var.getFilter();
                            q0Var.I(filter);
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
                    q0Var.D();
                    break;
                }
                break;
            case 2:
                o0 o0Var = (o0) obj2;
                q0 q0Var2 = (q0) obj;
                if (q0Var2.x() && o0Var.f) {
                    if (!q0Var2.U) {
                        q0Var2.U = true;
                        q0Var2.q();
                    }
                }
                x xVar = q0Var2.c;
                if (xVar == null) {
                    org.telegram.ui.ActionBar.l0 l0Var = q0Var2.Q;
                    if (l0Var != null) {
                        l0Var.i(((Integer) view.getTag()).intValue());
                        break;
                    }
                } else {
                    xVar.o(((Integer) view.getTag()).intValue());
                    break;
                }
                break;
            case 3:
                s1 s1Var = (s1) obj2;
                if (!((l1) obj).a) {
                    p1 p1Var = s1Var.p0;
                    if (p1Var != null) {
                        p1Var.g(s1Var, -1);
                    }
                    if (s1Var.k0) {
                        s1Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                s1 s1Var2 = (s1) obj2;
                if (!((l1) obj).a) {
                    p1 p1Var2 = s1Var2.r0;
                    if (p1Var2 != null) {
                        p1Var2.g(s1Var2, -2);
                    }
                    if (s1Var2.k0) {
                        s1Var2.cancel();
                        break;
                    }
                }
                break;
            case 5:
                s1 s1Var3 = (s1) obj2;
                if (!((l1) obj).a) {
                    p1 p1Var3 = s1Var3.v0;
                    if (p1Var3 != null) {
                        p1Var3.g(s1Var3, -2);
                    }
                    if (s1Var3.k0) {
                        s1Var3.dismiss();
                        break;
                    }
                }
                break;
            case 6:
                s1 s1Var4 = (s1) obj2;
                if (!((l1) obj).a) {
                    c4 c4Var = s1Var4.t0;
                    if (c4Var != null) {
                        c4Var.g(s1Var4, -2);
                    }
                    if (s1Var4.k0) {
                        s1Var4.cancel();
                        break;
                    }
                }
                break;
            case 7:
                i4 i4Var = (i4) obj2;
                Activity activity = (Activity) obj;
                u3 u3Var = i4Var.L;
                if (!i4Var.i0.B0) {
                    l3 l3Var = i4Var.v0[0];
                    if (!l3Var.f()) {
                        if (u3Var == null) {
                            l3Var.b.y0(0);
                            break;
                        } else {
                            zt0 zt0Var = new zt0(activity);
                            zt0Var.a = 1;
                            zt0Var.s = -g0.L(32.0f);
                            l3Var.d.w0(zt0Var);
                            break;
                        }
                    } else if (l3Var.getWebView() != null && !i4Var.i0.a0) {
                        if (i4Var.j0 != null) {
                            t0 webView = l3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String u10 = w0.u(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.l lVar = i4Var.j0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = bd.M0(2131742936, null);
                            }
                            String str2 = TextUtils.isEmpty(u10) ? "about:blank" : u10;
                            y yVar = new y(i4Var, u10, i11);
                            z zVar = new z(i4Var, l3Var, activity, i11);
                            org.telegram.ui.q qVar = new org.telegram.ui.q(i4Var, i12);
                            org.telegram.ui.q qVar2 = new org.telegram.ui.q(i4Var, 2);
                            a0 a0Var = new a0(i4Var, u10, l3Var, i11);
                            h4 h4Var = lVar.x;
                            ImageView imageView = lVar.f;
                            if (favicon == null) {
                                imageView.setImageResource(R.drawable.msg_language);
                                imageView.setColorFilter(new PorterDuffColorFilter(lVar.I, PorterDuff.Mode.SRC_IN));
                                r12 = 0;
                            } else {
                                imageView.setImageDrawable(new BitmapDrawable(lVar.getContext().getResources(), favicon));
                                r12 = 0;
                                imageView.setColorFilter((ColorFilter) null);
                            }
                            TextView textView = lVar.r;
                            textView.setText(i6.m(title, textView.getPaint().getFontMetricsInt(), false, r12, 0));
                            try {
                                try {
                                    Uri parse = Uri.parse(str2);
                                    str2 = sf.c.w(parse, r12, r12, sf.c.a(parse.getHost()), r12);
                                } catch (Exception e10) {
                                    a8.g(e10, false);
                                }
                                str = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e11) {
                                a8.g(e11, true);
                                str = str2;
                            }
                            TextView textView2 = lVar.s;
                            textView2.setText(i6.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            lVar.M = zVar;
                            lVar.N = qVar;
                            lVar.O = qVar2;
                            lVar.e.setOnClickListener(new org.telegram.ui.web.d(0, lVar, yVar));
                            lVar.n.setOnClickListener(a0Var);
                            lVar.b = false;
                            lVar.setInput(null);
                            h4Var.g3.O(true);
                            h4Var.v0(0);
                        }
                        org.telegram.ui.m0 m0Var2 = i4Var.i0;
                        mi.f fVar = new mi.f(9, l3Var, activity);
                        s sVar = m0Var2.c0;
                        sVar.setText("");
                        sVar.setSelection(0, sVar.getText().length());
                        sVar.setScrollX(0);
                        m0Var2.w0 = fVar;
                        m0Var2.k(true);
                        break;
                    }
                }
                break;
            case 8:
                b1 b1Var = (b1) obj2;
                i50 i50Var = (i50) obj;
                if (b1Var.h == 0) {
                    b1Var.a(1, true);
                    int i13 = ((i4) i50Var).Y;
                    TLRPC.Chat chat = i50Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = hp.i1(chat);
                    ConnectionsManager.getInstance(i13).sendRequestTyped(tL_channels_joinChannel, new ci.o0(b1Var, i13, tL_channels_joinChannel, chat, 4));
                    break;
                }
                break;
            case 9:
                d5 d5Var = (d5) obj2;
                d5Var.b(false);
                d5Var.e.d((e5) obj);
                break;
            case 10:
                ((z6) ((x6) obj2).f).x0((c2) obj);
                break;
            case 11:
                e7 e7Var = (e7) obj2;
                n7 n7Var = (n7) obj;
                j7 j7Var = e7Var.f.G;
                if (j7Var != null) {
                    j7Var.a(n7Var.c, n7Var.d, true);
                }
                f1 f1Var = e7Var.a;
                if (f1Var != null) {
                    f1Var.d(true);
                    break;
                }
                break;
            case 12:
                h9 h9Var = (h9) obj2;
                e9 e9Var = (e9) obj;
                ArrayList arrayList = e9Var.b;
                if (arrayList.size() != 1) {
                    boolean z10 = e9Var.e;
                    HashSet hashSet = new HashSet();
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList.get(i14);
                        i14++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) e9Var.c.get(0)).id;
                    s1 s1Var5 = new s1(3, h9Var.getParentActivity(), null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = h9Var.getMessagesController().P6;
                    s1Var5.setOnCancelListener(new o8(h9Var, h9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(h9Var, s1Var5, hashSet, tL_inputGroupCallInviteMessage, z10, 1)), i12));
                    s1Var5.r(600L);
                    break;
                } else {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull b22 = h9Var.getMessagesController().b2(user.id);
                    h9Var.M = user;
                    boolean z11 = e9Var.e;
                    n1.m(user, z11, z11 || (b22 != null && b22.video_calls_available), h9Var.getParentActivity(), null, h9Var.getAccountInstance());
                    break;
                }
            case 13:
                xd xdVar = (xd) obj2;
                r41 r41Var = (r41) obj;
                gi.d dVar = xdVar.B0;
                if (view.isEnabled() && !dVar.R) {
                    nd ndVar = xdVar.H0;
                    if (ndVar == null || !ndVar.R) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        hd hdVar = new hd(xdVar, twoStepVerificationActivity, i11);
                        twoStepVerificationActivity.a0 = 1;
                        twoStepVerificationActivity.c0 = hdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.x0(new id(xdVar, r41Var, twoStepVerificationActivity, i11));
                        break;
                    }
                }
                break;
            case 14:
                sf.c.t((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                break;
            case 15:
                wm wmVar = (wm) obj2;
                if (wmVar.getMediaDataController().V1(((zi) obj).F0())) {
                    wmVar.f8();
                    UndoView undoView = wmVar.N3;
                    if (undoView != null) {
                        long j10 = wmVar.k6;
                        int i15 = UndoView.j0;
                        undoView.j(83, j10, new k4(wmVar, 1));
                    }
                }
                wmVar.O7(true);
                break;
            case 16:
                wm.y1((wm) obj2, (String) obj);
                break;
            case 17:
                wm.m1((wm) obj2, (f60) obj);
                break;
            case 18:
                c2 c2Var = (c2) obj2;
                boolean z12 = !c2Var.b();
                c2Var.c(z12, true);
                ((AtomicBoolean) obj).set(z12);
                break;
            case 19:
                wm.p1((wm) obj2, (Context) obj);
                break;
            case 20:
                ln lnVar = (ln) obj2;
                Context context = (Context) obj;
                hi.d dVar2 = new hi.d(context, (e6) null);
                ((t2) dVar2.b).v0 = false;
                LinearLayout f10 = k5.f(context, 1);
                n4 n4Var = new n4(context, k6.n5, 23, 15, false, null);
                n4Var.setHeight(47);
                n4Var.setText(bd.M0(2131752233, "ChatHistory"));
                f10.addView(n4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                f10.addView(linearLayout, mf.o(-1, -2));
                g6[] g6VarArr = new g6[2];
                int i16 = 0;
                while (i16 < i10) {
                    g6 g6Var = new g6(context, true);
                    g6VarArr[i16] = g6Var;
                    g6Var.setTag(Integer.valueOf(i16));
                    r6.R(g6VarArr[i16], k6.N0(false), r72, r6.N(k6.i6), r72);
                    if (i16 == 0) {
                        g6VarArr[i16].b(bd.M0(2131752228, "ChatHistoryVisible"), bd.M0(2131752227, "ChatHistoryVisibleInfo"), true, !lnVar.K0);
                    } else if (t3.T(lnVar.x0)) {
                        g6VarArr[i16].b(bd.M0(2131752232, "ChatHistoryHidden"), bd.M0(2131752231, "ChatHistoryHiddenInfo"), false, lnVar.K0);
                    } else {
                        g6VarArr[i16].b(bd.M0(2131752232, "ChatHistoryHidden"), bd.M0(2131752230, "ChatHistoryHiddenInfo2"), false, lnVar.K0);
                    }
                    linearLayout.addView(g6VarArr[i16], mf.o(-1, -2));
                    g6VarArr[i16].setOnClickListener(new a0(lnVar, g6VarArr, dVar2, 8));
                    i16++;
                    i10 = 2;
                    r72 = 0;
                }
                t2 t2Var = (t2) dVar2.b;
                t2Var.O = f10;
                lnVar.showDialog(t2Var);
                break;
            case 21:
                ln.Z((ln) obj2, (FrameLayout) obj, view);
                break;
            case 22:
                ip.a0((ip) obj2, (hi.d) obj, view);
                break;
            case 23:
                new v0(42, ((e0) obj2).getContext(), (e6) obj).show();
                break;
            case 24:
                final org.telegram.ui.Components.z zVar2 = (org.telegram.ui.Components.z) obj2;
                final e6 e6Var = (e6) obj;
                k3 k3Var = zVar2.U1;
                k3 k3Var2 = zVar2.T1;
                wo woVar = zVar2.W1;
                gi.d dVar3 = zVar2.Z1;
                if (!dVar3.R) {
                    if (!dVar3.d0) {
                        if (zVar2.a2 == null) {
                            zVar2.d1();
                            break;
                        }
                    } else {
                        dVar3.setLoading(true);
                        if (zVar2.c2 == null) {
                            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
                            createtone.display_author = woVar.a.q;
                            createtone.emoji_id = zVar2.a2.longValue();
                            createtone.title = k3Var2.getText().toString();
                            createtone.prompt = k3Var.getText().toString();
                            ConnectionsManager.getInstance(zVar2.a).sendRequestTyped(createtone, new c3.b(i12), new n10() { // from class: org.telegram.ui.Components.u
                                @Override // org.telegram.messenger.n10
                                public final void a(Object obj4, Object obj5) {
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                    switch (i12) {
                                        case 0:
                                            z zVar3 = zVar2;
                                            zVar3.Z1.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    org.telegram.ui.Cells.f1.v(zVar3.Y1, e6Var, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                g gVar = zVar3.e2;
                                                if (gVar != null) {
                                                    gVar.a(aiComposeTone);
                                                }
                                                zVar3.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            z zVar4 = zVar2;
                                            FrameLayout frameLayout = zVar4.Y1;
                                            zVar4.Z1.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                                    if (!equalsIgnoreCase) {
                                                        org.telegram.ui.Cells.f1.v(frameLayout, e6Var2, tL_error, false);
                                                        break;
                                                    } else {
                                                        e0.t1(new fc(frameLayout, e6Var2), zVar4.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                zVar4.dismiss();
                                                g gVar2 = zVar4.d2;
                                                if (gVar2 != null) {
                                                    gVar2.a(aiComposeTone);
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
                            updatetone.display_author = woVar.a.q;
                            updatetone.tone = TL_aicompose.InputAiComposeTone.from(zVar2.c2);
                            updatetone.flags |= 2;
                            updatetone.emoji_id = zVar2.a2.longValue();
                            updatetone.flags |= 4;
                            updatetone.title = k3Var2.getText().toString();
                            updatetone.flags |= 8;
                            updatetone.prompt = k3Var.getText().toString();
                            ConnectionsManager.getInstance(zVar2.a).sendRequestTyped(updatetone, new c3.b(i12), new n10() { // from class: org.telegram.ui.Components.u
                                @Override // org.telegram.messenger.n10
                                public final void a(Object obj4, Object obj5) {
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                    switch (i11) {
                                        case 0:
                                            z zVar3 = zVar2;
                                            zVar3.Z1.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    org.telegram.ui.Cells.f1.v(zVar3.Y1, e6Var, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                g gVar = zVar3.e2;
                                                if (gVar != null) {
                                                    gVar.a(aiComposeTone);
                                                }
                                                zVar3.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            z zVar4 = zVar2;
                                            FrameLayout frameLayout = zVar4.Y1;
                                            zVar4.Z1.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                                    if (!equalsIgnoreCase) {
                                                        org.telegram.ui.Cells.f1.v(frameLayout, e6Var2, tL_error, false);
                                                        break;
                                                    } else {
                                                        e0.t1(new fc(frameLayout, e6Var2), zVar4.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                zVar4.dismiss();
                                                g gVar2 = zVar4.d2;
                                                if (gVar2 != null) {
                                                    gVar2.a(aiComposeTone);
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
            case 25:
                ((u10) obj2).a((TL_aicompose.AiComposeTone) obj);
                break;
            case 26:
                q0 q0Var3 = (q0) obj2;
                q4 q4Var = (q4) obj;
                q0Var3.U(null, null);
                q0Var3.O(q4Var.d, false);
                q0Var3.setupPopupRadialSelectors(q4Var.f);
                q0Var3.H(q4Var.e);
                break;
            case 27:
                boolean[] zArr = (boolean[]) obj2;
                boolean z13 = !zArr[0];
                zArr[0] = z13;
                ((c2) view).c(z13, true);
                ((rn) obj).run();
                break;
            case 28:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.O0.run();
                ((ws) obj).onClick(null, intValue);
                break;
            default:
                ((t2) ((hi.d) obj2).b).y0.run();
                ((u10) obj).a(null);
                break;
        }
    }
}
