package oi;

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
import bi.i6;
import c8.na;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b51;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.ct;
import org.telegram.ui.d7;
import org.telegram.ui.g9;
import org.telegram.ui.hd;
import org.telegram.ui.i7;
import org.telegram.ui.id;
import org.telegram.ui.ig0;
import org.telegram.ui.j9;
import org.telegram.ui.jw;
import org.telegram.ui.m7;
import org.telegram.ui.nd;
import org.telegram.ui.np;
import org.telegram.ui.o8;
import org.telegram.ui.p50;
import org.telegram.ui.p8;
import org.telegram.ui.rn;
import org.telegram.ui.w6;
import org.telegram.ui.xd;
import org.telegram.ui.xn;
import org.telegram.ui.y6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v2, types: [org.telegram.ui.ActionBar.i6, org.telegram.ui.ActionBar.q6] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        ?? r12;
        String str;
        int L;
        int i10 = this.a;
        int i11 = -1;
        int i12 = 2;
        ?? r82 = 0;
        final int i13 = 0;
        final int i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                b2.c0((b2) obj2, (Context) obj, view);
                break;
            case 1:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                break;
            case 2:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                break;
            case 3:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.t3 t3Var = g4Var.L;
                if (!g4Var.i0.B0) {
                    org.telegram.ui.k3 k3Var = g4Var.v0[0];
                    if (!k3Var.f()) {
                        if (t3Var == null) {
                            k3Var.b.y0(0);
                            break;
                        } else {
                            lu0 lu0Var = new lu0(activity);
                            lu0Var.a = 1;
                            lu0Var.s = -org.telegram.messenger.g0.L(32.0f);
                            k3Var.d.w0(lu0Var);
                            break;
                        }
                    } else if (k3Var.getWebView() != null && !g4Var.i0.a0) {
                        if (g4Var.j0 != null) {
                            org.telegram.ui.web.s0 webView = k3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String u10 = org.telegram.ui.web.v0.u(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.k kVar = g4Var.j0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = gd.N0(2131742655, null);
                            }
                            String str2 = TextUtils.isEmpty(u10) ? "about:blank" : u10;
                            org.telegram.ui.w wVar = new org.telegram.ui.w(g4Var, u10, i13);
                            org.telegram.ui.x xVar = new org.telegram.ui.x(g4Var, k3Var, activity, i13);
                            org.telegram.ui.q qVar = new org.telegram.ui.q(g4Var, i14);
                            org.telegram.ui.q qVar2 = new org.telegram.ui.q(g4Var, 2);
                            org.telegram.ui.y yVar = new org.telegram.ui.y(g4Var, u10, k3Var, i13);
                            i6 i6Var = kVar.x;
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
                            kVar.e.setOnClickListener(new ig0(24, kVar, wVar));
                            kVar.n.setOnClickListener(yVar);
                            i7 = 0;
                            kVar.b = false;
                            kVar.setInput(null);
                            i6Var.g3.O(true);
                            i6Var.v0(0);
                        } else {
                            i7 = 0;
                        }
                        org.telegram.ui.l0 l0Var = g4Var.i0;
                        ki.n2 n2Var = new ki.n2(10, k3Var, activity);
                        di.q qVar3 = l0Var.c0;
                        qVar3.setText("");
                        qVar3.setSelection(i7, qVar3.getText().length());
                        qVar3.setScrollX(i7);
                        l0Var.w0 = n2Var;
                        l0Var.k(true);
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.a1 a1Var = (org.telegram.ui.a1) obj2;
                p50 p50Var = (p50) obj;
                if (a1Var.h == 0) {
                    a1Var.a(1, true);
                    int i15 = ((org.telegram.ui.g4) p50Var).Y;
                    TLRPC.Chat chat = p50Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = mp.k1(chat);
                    ConnectionsManager.getInstance(i15).sendRequestTyped(tL_channels_joinChannel, new di.j0(a1Var, i15, tL_channels_joinChannel, chat, 4));
                    break;
                }
                break;
            case 5:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) obj2;
                b5Var.b(false);
                b5Var.e.c((org.telegram.ui.c5) obj);
                break;
            case 6:
                ((y6) ((w6) obj2).f).x0((org.telegram.ui.Cells.d2) obj);
                break;
            case 7:
                d7 d7Var = (d7) obj2;
                m7 m7Var = (m7) obj;
                i7 i7Var = d7Var.f.G;
                if (i7Var != null) {
                    i7Var.O(m7Var.c, m7Var.d, true);
                }
                org.telegram.ui.ActionBar.g1 g1Var = d7Var.a;
                if (g1Var != null) {
                    g1Var.d(true);
                    break;
                }
                break;
            case 8:
                j9 j9Var = (j9) obj2;
                g9 g9Var = (g9) obj;
                ArrayList arrayList = g9Var.b;
                if (arrayList.size() != 1) {
                    boolean z10 = g9Var.e;
                    HashSet hashSet = new HashSet();
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList.get(i16);
                        i16++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) g9Var.c.get(0)).id;
                    org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, j9Var.getParentActivity(), null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = j9Var.getMessagesController().S6;
                    t1Var.setOnCancelListener(new p8(j9Var, j9Var.getConnectionsManager().sendRequest(getgroupcall, new o8(j9Var, t1Var, hashSet, tL_inputGroupCallInviteMessage, z10, 1)), i14));
                    t1Var.r(600L);
                    break;
                } else {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull d2 = j9Var.getMessagesController().d2(user.id);
                    j9Var.L = user;
                    boolean z11 = g9Var.e;
                    org.telegram.ui.Components.voip.c2.m(user, z11, z11 || (d2 != null && d2.video_calls_available), j9Var.getParentActivity(), null, j9Var.getAccountInstance());
                    break;
                }
            case 9:
                xd xdVar = (xd) obj2;
                b51 b51Var = (b51) obj;
                hi.e eVar = xdVar.B0;
                if (view.isEnabled() && !eVar.R) {
                    nd ndVar = xdVar.H0;
                    if (ndVar == null || !ndVar.R) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        hd hdVar = new hd(xdVar, twoStepVerificationActivity, i13);
                        twoStepVerificationActivity.a0 = 1;
                        twoStepVerificationActivity.c0 = hdVar;
                        eVar.setLoading(true);
                        twoStepVerificationActivity.x0(new id(xdVar, b51Var, twoStepVerificationActivity, i13));
                        break;
                    }
                }
                break;
            case 10:
                vf.c.t((Context) obj, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj2).transaction_url);
                break;
            case 11:
                bn bnVar = (bn) obj2;
                if (bnVar.getMediaDataController().a2(((fj) obj).F0())) {
                    bnVar.h8();
                    UndoView undoView = bnVar.N3;
                    if (undoView != null) {
                        long j3 = bnVar.l6;
                        int i17 = UndoView.j0;
                        undoView.j(83, j3, new org.telegram.ui.i4(bnVar, 1));
                    }
                }
                bnVar.P7(true);
                break;
            case 12:
                bn.C1((bn) obj2, (String) obj);
                break;
            case 13:
                bn.p1((bn) obj2, (x60) obj);
                break;
            case 14:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) obj2;
                boolean z12 = !d2Var.b();
                d2Var.c(z12, true);
                ((AtomicBoolean) obj).set(z12);
                break;
            case 15:
                bn.s1((bn) obj2, (Context) obj);
                break;
            case 16:
                rn rnVar = (rn) obj2;
                Context context = (Context) obj;
                h6.o oVar = new h6.o(context, (org.telegram.ui.ActionBar.i6) null);
                ((org.telegram.ui.ActionBar.w2) oVar.b).v0 = false;
                LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, n6.n5, 23, 15, false, null);
                o4Var.setHeight(47);
                o4Var.setText(gd.N0(2131752221, "ChatHistory"));
                g10.addView(o4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                g10.addView(linearLayout, na.o(-1, -2));
                h6[] h6VarArr = new h6[2];
                int i18 = 0;
                while (i18 < i12) {
                    h6 h6Var = new h6(context, true);
                    h6VarArr[i18] = h6Var;
                    h6Var.setTag(Integer.valueOf(i18));
                    u6.Q(h6VarArr[i18], n6.N0(false), r82, u6.M(n6.i6), r82);
                    if (i18 == 0) {
                        h6VarArr[i18].b(gd.N0(2131752216, "ChatHistoryVisible"), gd.N0(2131752215, "ChatHistoryVisibleInfo"), true, !rnVar.K0);
                    } else if (org.telegram.messenger.v3.T(rnVar.x0)) {
                        h6VarArr[i18].b(gd.N0(2131752220, "ChatHistoryHidden"), gd.N0(2131752219, "ChatHistoryHiddenInfo"), false, rnVar.K0);
                    } else {
                        h6VarArr[i18].b(gd.N0(2131752220, "ChatHistoryHidden"), gd.N0(2131752218, "ChatHistoryHiddenInfo2"), false, rnVar.K0);
                    }
                    linearLayout.addView(h6VarArr[i18], na.o(-1, -2));
                    h6VarArr[i18].setOnClickListener(new org.telegram.ui.y(rnVar, h6VarArr, oVar, 8));
                    i18++;
                    i12 = 2;
                    r82 = 0;
                }
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) oVar.b;
                w2Var.O = g10;
                rnVar.showDialog(w2Var);
                break;
            case 17:
                rn.Z((rn) obj2, (FrameLayout) obj, view);
                break;
            case 18:
                np.a0((np) obj2, (h6.o) obj, view);
                break;
            case 19:
                new ug.y0(42, ((org.telegram.ui.Components.m0) obj2).getContext(), (org.telegram.ui.ActionBar.i6) obj).show();
                break;
            case 20:
                final org.telegram.ui.Components.h0 h0Var = (org.telegram.ui.Components.h0) obj2;
                final org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj;
                org.telegram.ui.Cells.l3 l3Var = h0Var.X1;
                org.telegram.ui.Cells.l3 l3Var2 = h0Var.W1;
                lp lpVar = h0Var.Z1;
                hi.e eVar2 = h0Var.c2;
                if (!eVar2.R) {
                    if (!eVar2.e0) {
                        if (h0Var.d2 == null) {
                            h0Var.e1();
                            break;
                        }
                    } else {
                        eVar2.setLoading(true);
                        if (h0Var.f2 == null) {
                            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
                            createtone.display_author = lpVar.a.q;
                            createtone.emoji_id = h0Var.d2.longValue();
                            createtone.title = l3Var2.getText().toString();
                            createtone.prompt = l3Var.getText().toString();
                            ConnectionsManager.getInstance(h0Var.a).sendRequestTyped(createtone, new d3.b(i14), new p10() { // from class: org.telegram.ui.Components.c0
                                @Override // org.telegram.messenger.p10
                                public final void a(Object obj4, Object obj5) {
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                    switch (i14) {
                                        case 0:
                                            h0 h0Var2 = h0Var;
                                            h0Var2.c2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    org.telegram.ui.Cells.c0.t(h0Var2.b2, i6Var2, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                f fVar = h0Var2.h2;
                                                if (fVar != null) {
                                                    fVar.a(aiComposeTone);
                                                }
                                                h0Var2.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            h0 h0Var3 = h0Var;
                                            FrameLayout frameLayout = h0Var3.b2;
                                            h0Var3.c2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                                                    if (!equalsIgnoreCase) {
                                                        org.telegram.ui.Cells.c0.t(frameLayout, i6Var3, tL_error, false);
                                                        break;
                                                    } else {
                                                        m0.z1(new kc(frameLayout, i6Var3), h0Var3.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                h0Var3.dismiss();
                                                f fVar2 = h0Var3.g2;
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
                            updatetone.display_author = lpVar.a.q;
                            updatetone.tone = TL_aicompose.InputAiComposeTone.from(h0Var.f2);
                            updatetone.flags |= 2;
                            updatetone.emoji_id = h0Var.d2.longValue();
                            updatetone.flags |= 4;
                            updatetone.title = l3Var2.getText().toString();
                            updatetone.flags |= 8;
                            updatetone.prompt = l3Var.getText().toString();
                            ConnectionsManager.getInstance(h0Var.a).sendRequestTyped(updatetone, new d3.b(i14), new p10() { // from class: org.telegram.ui.Components.c0
                                @Override // org.telegram.messenger.p10
                                public final void a(Object obj4, Object obj5) {
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                    switch (i13) {
                                        case 0:
                                            h0 h0Var2 = h0Var;
                                            h0Var2.c2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    org.telegram.ui.Cells.c0.t(h0Var2.b2, i6Var2, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                f fVar = h0Var2.h2;
                                                if (fVar != null) {
                                                    fVar.a(aiComposeTone);
                                                }
                                                h0Var2.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            h0 h0Var3 = h0Var;
                                            FrameLayout frameLayout = h0Var3.b2;
                                            h0Var3.c2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                                                    if (!equalsIgnoreCase) {
                                                        org.telegram.ui.Cells.c0.t(frameLayout, i6Var3, tL_error, false);
                                                        break;
                                                    } else {
                                                        m0.z1(new kc(frameLayout, i6Var3), h0Var3.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                h0Var3.dismiss();
                                                f fVar2 = h0Var3.g2;
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
            case 21:
                ((w10) obj2).a((TL_aicompose.AiComposeTone) obj);
                break;
            case 22:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) obj2;
                org.telegram.ui.Components.y4 y4Var = (org.telegram.ui.Components.y4) obj;
                q0Var.V(null, null);
                q0Var.P(y4Var.d, false);
                q0Var.setupPopupRadialSelectors(y4Var.f);
                q0Var.I(y4Var.e);
                break;
            case 23:
                boolean[] zArr = (boolean[]) obj2;
                boolean z13 = !zArr[0];
                zArr[0] = z13;
                ((org.telegram.ui.Cells.d2) view).c(z13, true);
                ((xn) obj).run();
                break;
            case 24:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.M0.run();
                ((ct) obj).onClick(null, intValue);
                break;
            case 25:
                ((org.telegram.ui.ActionBar.w2) ((h6.o) obj2).b).y0.run();
                ((w10) obj).a(null);
                break;
            case 26:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 27:
                e8 e8Var = (e8) obj2;
                float[] fArr = (float[]) obj;
                float f10 = MediaController.B().r0;
                int i19 = 0;
                while (true) {
                    if (i19 < 3) {
                        if (f10 - 0.1f <= fArr[i19]) {
                            i11 = i19;
                        } else {
                            i19++;
                        }
                    }
                }
                int i20 = i11 + 1;
                if (i20 >= 3) {
                    i20 = 0;
                }
                MediaController.B().m0(true, fArr[i20]);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - e8Var.K2 > 300) {
                    int i21 = mp.h1().getInt("speedhint", 0) + 1;
                    if (i21 > 2) {
                        i21 = -10;
                    }
                    mp.h1().edit().putInt("speedhint", i21).apply();
                    if (i21 >= 0 && e8Var.b != null) {
                        r7 r7Var = new r7(5, e8Var.getContext(), null, false);
                        e8Var.J2 = r7Var;
                        r7Var.setExtraTranslationY(org.telegram.messenger.g0.L(6.0f));
                        e8Var.J2.setText(gd.N0(2131745028, null));
                        e8Var.y1.addView(e8Var.J2, na.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                        e8Var.J2.c(e8Var.P1);
                    }
                }
                e8Var.K2 = currentTimeMillis;
                break;
            case 28:
                e8 e8Var2 = (e8) obj2;
                e8Var2.getClass();
                ((x60) obj).v();
                e8Var2.Q0(6);
                break;
            default:
                b90 b90Var = (b90) obj;
                e8 e8Var3 = (e8) ((w7) obj2).G;
                int i22 = e8Var3.a;
                LaunchActivity launchActivity = e8Var3.A2;
                ArrayList arrayList2 = (ArrayList) mp.u1(i22).w.get(0);
                if ((arrayList2 != null ? arrayList2.size() : 0) > 10 && !TextUtils.isEmpty(b90Var.getText().toString())) {
                    String charSequence = b90Var.getText().toString();
                    if (launchActivity.M().getLastFragment() instanceof bx) {
                        bx bxVar = (bx) launchActivity.M().getLastFragment();
                        ArrayList arrayList3 = (ArrayList) bxVar.getMessagesController().w.get(0);
                        int size2 = arrayList3 != null ? arrayList3.size() : 0;
                        if (!bxVar.n2 && (size2 > 10 || bxVar.L)) {
                            i14 = 0;
                        }
                        if (i14 == 0) {
                            if (bxVar.l2) {
                                bxVar.Y.r.setText(charSequence);
                                bxVar.Y.r.setSelection(charSequence.length());
                                jw jwVar = bxVar.D0;
                                if (jwVar != null && (L = jwVar.L(3)) >= 0 && bxVar.D0.getTabsView().getCurrentTabId() != L) {
                                    bxVar.D0.getTabsView().e(L, L);
                                }
                            } else {
                                bxVar.y = 3;
                                bxVar.Y.r.setText(charSequence);
                                bxVar.Y.r.setSelection(charSequence.length());
                            }
                            e8Var3.dismiss();
                            break;
                        }
                    }
                    bx bxVar2 = new bx(null);
                    bxVar2.p2 = charSequence;
                    bxVar2.y = 3;
                    launchActivity.u0(bxVar2, false, false);
                    e8Var3.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i1(Context context, TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal) {
        this.a = 10;
        this.c = context;
        this.b = tL_broadcastRevenueTransactionWithdrawal;
    }
}
