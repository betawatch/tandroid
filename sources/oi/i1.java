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
import bi.g6;
import c8.ma;
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
import org.telegram.messenger.q10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.s7;
import org.telegram.ui.Components.x7;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
import org.telegram.ui.c7;
import org.telegram.ui.cx;
import org.telegram.ui.dt;
import org.telegram.ui.g9;
import org.telegram.ui.h7;
import org.telegram.ui.hd;
import org.telegram.ui.id;
import org.telegram.ui.j9;
import org.telegram.ui.jg0;
import org.telegram.ui.kw;
import org.telegram.ui.l7;
import org.telegram.ui.n8;
import org.telegram.ui.nd;
import org.telegram.ui.np;
import org.telegram.ui.o8;
import org.telegram.ui.p50;
import org.telegram.ui.rn;
import org.telegram.ui.v6;
import org.telegram.ui.x6;
import org.telegram.ui.xd;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [org.telegram.ui.ActionBar.h6, org.telegram.ui.ActionBar.p6] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? r12;
        String str;
        int J;
        int i7 = this.a;
        int i10 = -1;
        int i11 = 2;
        ?? r72 = 0;
        final int i12 = 0;
        final int i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
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
                            mu0 mu0Var = new mu0(activity);
                            mu0Var.a = 1;
                            mu0Var.s = -org.telegram.messenger.g0.L(32.0f);
                            k3Var.d.w0(mu0Var);
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
                                title = gd.N0(2131742662, null);
                            }
                            String str2 = TextUtils.isEmpty(u10) ? "about:blank" : u10;
                            org.telegram.ui.w wVar = new org.telegram.ui.w(g4Var, u10, i12);
                            org.telegram.ui.x xVar = new org.telegram.ui.x(g4Var, k3Var, activity, i12);
                            org.telegram.ui.q qVar = new org.telegram.ui.q(g4Var, i13);
                            org.telegram.ui.q qVar2 = new org.telegram.ui.q(g4Var, 2);
                            org.telegram.ui.y yVar = new org.telegram.ui.y(g4Var, u10, k3Var, i12);
                            g6 g6Var = kVar.x;
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
                            kVar.e.setOnClickListener(new jg0(24, kVar, wVar));
                            kVar.n.setOnClickListener(yVar);
                            kVar.b = false;
                            kVar.setInput(null);
                            g6Var.g3.O(true);
                            g6Var.v0(0);
                        }
                        org.telegram.ui.l0 l0Var = g4Var.i0;
                        li.d dVar = new li.d(9, k3Var, activity);
                        di.q qVar3 = l0Var.c0;
                        qVar3.setText("");
                        qVar3.setSelection(0, qVar3.getText().length());
                        qVar3.setScrollX(0);
                        l0Var.w0 = dVar;
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
                    int i14 = ((org.telegram.ui.g4) p50Var).Y;
                    TLRPC.Chat chat = p50Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = mp.k1(chat);
                    ConnectionsManager.getInstance(i14).sendRequestTyped(tL_channels_joinChannel, new di.j0(a1Var, i14, tL_channels_joinChannel, chat, 4));
                    break;
                }
                break;
            case 5:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) obj2;
                b5Var.b(false);
                b5Var.e.c((org.telegram.ui.c5) obj);
                break;
            case 6:
                ((x6) ((v6) obj2).f).x0((org.telegram.ui.Cells.d2) obj);
                break;
            case 7:
                c7 c7Var = (c7) obj2;
                l7 l7Var = (l7) obj;
                h7 h7Var = c7Var.f.G;
                if (h7Var != null) {
                    h7Var.m(l7Var.c, l7Var.d, true);
                }
                org.telegram.ui.ActionBar.g1 g1Var = c7Var.a;
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
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj3 = arrayList.get(i15);
                        i15++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) g9Var.c.get(0)).id;
                    org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, j9Var.getParentActivity(), null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = j9Var.getMessagesController().S6;
                    t1Var.setOnCancelListener(new o8(j9Var, j9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(j9Var, t1Var, hashSet, tL_inputGroupCallInviteMessage, z10, 1)), i13));
                    t1Var.r(600L);
                    break;
                } else {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull d2 = j9Var.getMessagesController().d2(user.id);
                    j9Var.L = user;
                    boolean z11 = g9Var.e;
                    org.telegram.ui.Components.voip.b2.m(user, z11, z11 || (d2 != null && d2.video_calls_available), j9Var.getParentActivity(), null, j9Var.getAccountInstance());
                    break;
                }
            case 9:
                xd xdVar = (xd) obj2;
                c51 c51Var = (c51) obj;
                hi.e eVar = xdVar.B0;
                if (view.isEnabled() && !eVar.R) {
                    nd ndVar = xdVar.H0;
                    if (ndVar == null || !ndVar.R) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        hd hdVar = new hd(xdVar, twoStepVerificationActivity, i12);
                        twoStepVerificationActivity.a0 = 1;
                        twoStepVerificationActivity.c0 = hdVar;
                        eVar.setLoading(true);
                        twoStepVerificationActivity.x0(new id(xdVar, c51Var, twoStepVerificationActivity, i12));
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
                        int i16 = UndoView.j0;
                        undoView.j(83, j3, new org.telegram.ui.i4(bnVar, 1));
                    }
                }
                bnVar.P7(true);
                break;
            case 12:
                bn.C1((bn) obj2, (String) obj);
                break;
            case 13:
                bn.p1((bn) obj2, (a70) obj);
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
                hi.w4 w4Var = new hi.w4(context, (h6) null);
                ((org.telegram.ui.ActionBar.w2) w4Var.b).v0 = false;
                LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, m6.n5, 23, 15, false, null);
                o4Var.setHeight(47);
                o4Var.setText(gd.N0(2131752221, "ChatHistory"));
                g10.addView(o4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                g10.addView(linearLayout, ma.o(-1, -2));
                i6[] i6VarArr = new i6[2];
                int i17 = 0;
                while (i17 < i11) {
                    i6 i6Var = new i6(context, true);
                    i6VarArr[i17] = i6Var;
                    i6Var.setTag(Integer.valueOf(i17));
                    t6.Q(i6VarArr[i17], m6.N0(false), r72, t6.M(m6.i6), r72);
                    if (i17 == 0) {
                        i6VarArr[i17].b(gd.N0(2131752216, "ChatHistoryVisible"), gd.N0(2131752215, "ChatHistoryVisibleInfo"), true, !rnVar.K0);
                    } else if (org.telegram.messenger.v3.T(rnVar.x0)) {
                        i6VarArr[i17].b(gd.N0(2131752220, "ChatHistoryHidden"), gd.N0(2131752219, "ChatHistoryHiddenInfo"), false, rnVar.K0);
                    } else {
                        i6VarArr[i17].b(gd.N0(2131752220, "ChatHistoryHidden"), gd.N0(2131752218, "ChatHistoryHiddenInfo2"), false, rnVar.K0);
                    }
                    linearLayout.addView(i6VarArr[i17], ma.o(-1, -2));
                    i6VarArr[i17].setOnClickListener(new org.telegram.ui.y(rnVar, i6VarArr, w4Var, 8));
                    i17++;
                    i11 = 2;
                    r72 = 0;
                }
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) w4Var.b;
                w2Var.O = g10;
                rnVar.showDialog(w2Var);
                break;
            case 17:
                rn.Z((rn) obj2, (FrameLayout) obj, view);
                break;
            case 18:
                np.a0((np) obj2, (hi.w4) obj, view);
                break;
            case 19:
                new ug.y0(42, ((org.telegram.ui.Components.n0) obj2).getContext(), (h6) obj).show();
                break;
            case 20:
                final org.telegram.ui.Components.i0 i0Var = (org.telegram.ui.Components.i0) obj2;
                final h6 h6Var = (h6) obj;
                org.telegram.ui.Cells.l3 l3Var = i0Var.X1;
                org.telegram.ui.Cells.l3 l3Var2 = i0Var.W1;
                op opVar = i0Var.Z1;
                hi.e eVar2 = i0Var.c2;
                if (!eVar2.R) {
                    if (!eVar2.e0) {
                        if (i0Var.d2 == null) {
                            i0Var.e1();
                            break;
                        }
                    } else {
                        eVar2.setLoading(true);
                        if (i0Var.f2 == null) {
                            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
                            createtone.display_author = opVar.a.q;
                            createtone.emoji_id = i0Var.d2.longValue();
                            createtone.title = l3Var2.getText().toString();
                            createtone.prompt = l3Var.getText().toString();
                            ConnectionsManager.getInstance(i0Var.a).sendRequestTyped(createtone, new d3.b(i13), new q10() { // from class: org.telegram.ui.Components.d0
                                @Override // org.telegram.messenger.q10
                                public final void a(Object obj4, Object obj5) {
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                    switch (i13) {
                                        case 0:
                                            i0 i0Var2 = i0Var;
                                            i0Var2.c2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    org.telegram.ui.Cells.c0.t(i0Var2.b2, h6Var, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                f fVar = i0Var2.h2;
                                                if (fVar != null) {
                                                    fVar.a(aiComposeTone);
                                                }
                                                i0Var2.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            i0 i0Var3 = i0Var;
                                            FrameLayout frameLayout = i0Var3.b2;
                                            i0Var3.c2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                                    if (!equalsIgnoreCase) {
                                                        org.telegram.ui.Cells.c0.t(frameLayout, h6Var2, tL_error, false);
                                                        break;
                                                    } else {
                                                        n0.z1(new lc(frameLayout, h6Var2), i0Var3.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                i0Var3.dismiss();
                                                f fVar2 = i0Var3.g2;
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
                            updatetone.display_author = opVar.a.q;
                            updatetone.tone = TL_aicompose.InputAiComposeTone.from(i0Var.f2);
                            updatetone.flags |= 2;
                            updatetone.emoji_id = i0Var.d2.longValue();
                            updatetone.flags |= 4;
                            updatetone.title = l3Var2.getText().toString();
                            updatetone.flags |= 8;
                            updatetone.prompt = l3Var.getText().toString();
                            ConnectionsManager.getInstance(i0Var.a).sendRequestTyped(updatetone, new d3.b(i13), new q10() { // from class: org.telegram.ui.Components.d0
                                @Override // org.telegram.messenger.q10
                                public final void a(Object obj4, Object obj5) {
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                    switch (i12) {
                                        case 0:
                                            i0 i0Var2 = i0Var;
                                            i0Var2.c2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    org.telegram.ui.Cells.c0.t(i0Var2.b2, h6Var, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                f fVar = i0Var2.h2;
                                                if (fVar != null) {
                                                    fVar.a(aiComposeTone);
                                                }
                                                i0Var2.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            i0 i0Var3 = i0Var;
                                            FrameLayout frameLayout = i0Var3.b2;
                                            i0Var3.c2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                                    if (!equalsIgnoreCase) {
                                                        org.telegram.ui.Cells.c0.t(frameLayout, h6Var2, tL_error, false);
                                                        break;
                                                    } else {
                                                        n0.z1(new lc(frameLayout, h6Var2), i0Var3.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                i0Var3.dismiss();
                                                f fVar2 = i0Var3.g2;
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
                ((x10) obj2).a((TL_aicompose.AiComposeTone) obj);
                break;
            case 22:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) obj2;
                org.telegram.ui.Components.z4 z4Var = (org.telegram.ui.Components.z4) obj;
                q0Var.V(null, null);
                q0Var.P(z4Var.d, false);
                q0Var.setupPopupRadialSelectors(z4Var.f);
                q0Var.I(z4Var.e);
                break;
            case 23:
                boolean[] zArr = (boolean[]) obj2;
                boolean z13 = !zArr[0];
                zArr[0] = z13;
                ((org.telegram.ui.Cells.d2) view).c(z13, true);
                ((yn) obj).run();
                break;
            case 24:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.M0.run();
                ((dt) obj).onClick(null, intValue);
                break;
            case 25:
                ((org.telegram.ui.ActionBar.w2) ((hi.w4) obj2).b).y0.run();
                ((x10) obj).a(null);
                break;
            case 26:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 27:
                f8 f8Var = (f8) obj2;
                float[] fArr = (float[]) obj;
                float f10 = MediaController.B().r0;
                int i18 = 0;
                while (true) {
                    if (i18 < 3) {
                        if (f10 - 0.1f <= fArr[i18]) {
                            i10 = i18;
                        } else {
                            i18++;
                        }
                    }
                }
                int i19 = i10 + 1;
                if (i19 >= 3) {
                    i19 = 0;
                }
                MediaController.B().m0(true, fArr[i19]);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - f8Var.K2 > 300) {
                    int i20 = mp.h1().getInt("speedhint", 0) + 1;
                    if (i20 > 2) {
                        i20 = -10;
                    }
                    mp.h1().edit().putInt("speedhint", i20).apply();
                    if (i20 >= 0 && f8Var.b != null) {
                        s7 s7Var = new s7(5, f8Var.getContext(), null, false);
                        f8Var.J2 = s7Var;
                        s7Var.setExtraTranslationY(org.telegram.messenger.g0.L(6.0f));
                        f8Var.J2.setText(gd.N0(2131745028, null));
                        f8Var.y1.addView(f8Var.J2, ma.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                        f8Var.J2.c(f8Var.P1);
                    }
                }
                f8Var.K2 = currentTimeMillis;
                break;
            case 28:
                f8 f8Var2 = (f8) obj2;
                f8Var2.getClass();
                ((a70) obj).v();
                f8Var2.Q0(6);
                break;
            default:
                e90 e90Var = (e90) obj;
                f8 f8Var3 = (f8) ((x7) obj2).G;
                int i21 = f8Var3.a;
                LaunchActivity launchActivity = f8Var3.A2;
                ArrayList arrayList2 = (ArrayList) mp.u1(i21).w.get(0);
                if ((arrayList2 != null ? arrayList2.size() : 0) > 10 && !TextUtils.isEmpty(e90Var.getText().toString())) {
                    String charSequence = e90Var.getText().toString();
                    if (launchActivity.M().getLastFragment() instanceof cx) {
                        cx cxVar = (cx) launchActivity.M().getLastFragment();
                        ArrayList arrayList3 = (ArrayList) cxVar.getMessagesController().w.get(0);
                        int size2 = arrayList3 != null ? arrayList3.size() : 0;
                        if (!cxVar.n2 && (size2 > 10 || cxVar.L)) {
                            i13 = 0;
                        }
                        if (i13 == 0) {
                            if (cxVar.l2) {
                                cxVar.Y.r.setText(charSequence);
                                cxVar.Y.r.setSelection(charSequence.length());
                                kw kwVar = cxVar.D0;
                                if (kwVar != null && (J = kwVar.J(3)) >= 0 && cxVar.D0.getTabsView().getCurrentTabId() != J) {
                                    cxVar.D0.getTabsView().e(J, J);
                                }
                            } else {
                                cxVar.y = 3;
                                cxVar.Y.r.setText(charSequence);
                                cxVar.Y.r.setSelection(charSequence.length());
                            }
                            f8Var3.dismiss();
                            break;
                        }
                    }
                    cx cxVar2 = new cx(null);
                    cxVar2.p2 = charSequence;
                    cxVar2.y = 3;
                    launchActivity.u0(cxVar2, false, false);
                    f8Var3.dismiss();
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
