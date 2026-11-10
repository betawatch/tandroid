package org.telegram.ui.ActionBar;

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
import c8.ha;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.s7;
import org.telegram.ui.Components.s8;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.wo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bt;
import org.telegram.ui.cn;
import org.telegram.ui.d7;
import org.telegram.ui.e51;
import org.telegram.ui.f9;
import org.telegram.ui.i7;
import org.telegram.ui.i9;
import org.telegram.ui.ik0;
import org.telegram.ui.iw;
import org.telegram.ui.jd;
import org.telegram.ui.m7;
import org.telegram.ui.m8;
import org.telegram.ui.mp;
import org.telegram.ui.n8;
import org.telegram.ui.pd;
import org.telegram.ui.r50;
import org.telegram.ui.rn;
import org.telegram.ui.w6;
import org.telegram.ui.xn;
import org.telegram.ui.y6;
import org.telegram.ui.zd;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3, types: [org.telegram.ui.ActionBar.h6, org.telegram.ui.ActionBar.p6] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        ?? r12;
        String str;
        int N;
        int i10 = this.a;
        int i11 = -1;
        int i12 = 2;
        ?? r92 = 0;
        final int i13 = 0;
        final int i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                u1 u1Var = (u1) obj2;
                if (!((n1) obj).a) {
                    li.c4 c4Var = u1Var.q0;
                    if (c4Var != null) {
                        c4Var.g(u1Var, -2);
                    }
                    if (u1Var.j0) {
                        u1Var.cancel();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.t3 t3Var = g4Var.K;
                if (!g4Var.h0.A0) {
                    org.telegram.ui.k3 k3Var = g4Var.u0[0];
                    if (!k3Var.f()) {
                        if (t3Var != null) {
                            bu0 bu0Var = new bu0(activity);
                            bu0Var.a = 1;
                            bu0Var.s = -org.telegram.messenger.g0.L(32.0f);
                            k3Var.d.w0(bu0Var);
                            break;
                        } else {
                            k3Var.b.y0(0);
                            break;
                        }
                    } else if (k3Var.getWebView() != null && !g4Var.h0.W) {
                        if (g4Var.i0 != null) {
                            org.telegram.ui.web.u0 webView = k3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String u10 = org.telegram.ui.web.x0.u(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.j jVar = g4Var.i0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = id.M0(2131742926, null);
                            }
                            String str2 = TextUtils.isEmpty(u10) ? "about:blank" : u10;
                            org.telegram.ui.x xVar = new org.telegram.ui.x(g4Var, u10, i13);
                            org.telegram.ui.y yVar = new org.telegram.ui.y(g4Var, k3Var, activity, i13);
                            org.telegram.ui.q qVar = new org.telegram.ui.q(g4Var, i14);
                            org.telegram.ui.q qVar2 = new org.telegram.ui.q(g4Var, 2);
                            org.telegram.ui.z zVar = new org.telegram.ui.z(g4Var, u10, k3Var, i13);
                            fi.w3 w3Var = jVar.x;
                            ImageView imageView = jVar.f;
                            if (favicon == null) {
                                imageView.setImageResource(R.drawable.msg_language);
                                imageView.setColorFilter(new PorterDuffColorFilter(jVar.H, PorterDuff.Mode.SRC_IN));
                                r12 = 0;
                            } else {
                                imageView.setImageDrawable(new BitmapDrawable(jVar.getContext().getResources(), favicon));
                                r12 = 0;
                                imageView.setColorFilter((ColorFilter) null);
                            }
                            TextView textView = jVar.r;
                            textView.setText(org.telegram.messenger.i6.m(title, textView.getPaint().getFontMetricsInt(), false, r12, 0));
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
                            TextView textView2 = jVar.s;
                            textView2.setText(org.telegram.messenger.i6.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            jVar.L = yVar;
                            jVar.M = qVar;
                            jVar.N = qVar2;
                            jVar.e.setOnClickListener(new ik0(23, jVar, xVar));
                            jVar.n.setOnClickListener(zVar);
                            i7 = 0;
                            jVar.b = false;
                            jVar.setInput(null);
                            w3Var.f3.O(true);
                            w3Var.v0(0);
                        } else {
                            i7 = 0;
                        }
                        org.telegram.ui.l0 l0Var = g4Var.h0;
                        org.telegram.messenger.voip.k kVar = new org.telegram.messenger.voip.k(5, k3Var, activity);
                        bi.v vVar = l0Var.b0;
                        vVar.setText("");
                        vVar.setSelection(i7, vVar.getText().length());
                        vVar.setScrollX(i7);
                        l0Var.v0 = kVar;
                        l0Var.k(true);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.a1 a1Var = (org.telegram.ui.a1) obj2;
                r50 r50Var = (r50) obj;
                if (a1Var.h == 0) {
                    a1Var.a(1, true);
                    int i15 = ((org.telegram.ui.g4) r50Var).X;
                    TLRPC.Chat chat = r50Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = qp.i1(chat);
                    ConnectionsManager.getInstance(i15).sendRequestTyped(tL_channels_joinChannel, new bi.v0(a1Var, i15, tL_channels_joinChannel, chat, 4));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) obj2;
                b5Var.b(false);
                b5Var.e.c((org.telegram.ui.c5) obj);
                break;
            case 4:
                ((y6) ((w6) obj2).f).x0((org.telegram.ui.Cells.c2) obj);
                break;
            case 5:
                d7 d7Var = (d7) obj2;
                m7 m7Var = (m7) obj;
                i7 i7Var = d7Var.f.F;
                if (i7Var != null) {
                    i7Var.o(m7Var.c, m7Var.d, true);
                }
                g1 g1Var = d7Var.a;
                if (g1Var != null) {
                    g1Var.d(true);
                    break;
                }
                break;
            case 6:
                i9 i9Var = (i9) obj2;
                f9 f9Var = (f9) obj;
                ArrayList arrayList = f9Var.b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull b22 = i9Var.getMessagesController().b2(user.id);
                    i9Var.L = user;
                    boolean z9 = f9Var.e;
                    org.telegram.ui.Components.voip.y1.m(user, z9, z9 || (b22 != null && b22.video_calls_available), i9Var.getParentActivity(), null, i9Var.getAccountInstance());
                    break;
                } else {
                    boolean z10 = f9Var.e;
                    HashSet hashSet = new HashSet();
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList.get(i16);
                        i16++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) f9Var.c.get(0)).id;
                    u1 u1Var2 = new u1(3, i9Var.getParentActivity(), null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = i9Var.getMessagesController().P6;
                    u1Var2.setOnCancelListener(new n8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new m8(i9Var, u1Var2, hashSet, tL_inputGroupCallInviteMessage, z10, 1)), i14));
                    u1Var2.r(600L);
                    break;
                }
            case 7:
                zd zdVar = (zd) obj2;
                e51 e51Var = (e51) obj;
                fi.d dVar = zdVar.A0;
                if (view.isEnabled() && !dVar.Q) {
                    pd pdVar = zdVar.G0;
                    if (pdVar == null || !pdVar.Q) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        org.telegram.ui.id idVar = new org.telegram.ui.id(zdVar, twoStepVerificationActivity, i13);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.b0 = idVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.x0(new jd(zdVar, e51Var, twoStepVerificationActivity, i13));
                        break;
                    }
                }
                break;
            case 8:
                vf.c.t((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                break;
            case 9:
                cn cnVar = (cn) obj2;
                if (cnVar.getMediaDataController().V1(((ij) obj).F0())) {
                    cnVar.g8();
                    UndoView undoView = cnVar.M3;
                    if (undoView != null) {
                        long j3 = cnVar.j6;
                        int i17 = UndoView.i0;
                        undoView.j(83, j3, new org.telegram.ui.i4(cnVar, 1));
                    }
                }
                cnVar.P7(true);
                break;
            case 10:
                cn.C1((cn) obj2, (String) obj);
                break;
            case 11:
                cn.p1((cn) obj2, (k60) obj);
                break;
            case 12:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) obj2;
                boolean z11 = !c2Var.b();
                c2Var.c(z11, true);
                ((AtomicBoolean) obj).set(z11);
                break;
            case 13:
                cn.s1((cn) obj2, (Context) obj);
                break;
            case 14:
                rn rnVar = (rn) obj2;
                Context context = (Context) obj;
                h9.f1 f1Var = new h9.f1(context, (h6) null);
                ((w2) f1Var.b).u0 = false;
                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, m6.n5, 23, 15, false, null);
                n4Var.setHeight(47);
                n4Var.setText(id.M0(2131752233, "ChatHistory"));
                f10.addView(n4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                f10.addView(linearLayout, ha.o(-1, -2));
                org.telegram.ui.Cells.h6[] h6VarArr = new org.telegram.ui.Cells.h6[2];
                int i18 = 0;
                while (i18 < i12) {
                    org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, true);
                    h6VarArr[i18] = h6Var;
                    h6Var.setTag(Integer.valueOf(i18));
                    t6.Q(h6VarArr[i18], m6.N0(false), r92, t6.M(m6.i6), r92);
                    if (i18 == 0) {
                        h6VarArr[i18].b(id.M0(2131752228, "ChatHistoryVisible"), id.M0(2131752227, "ChatHistoryVisibleInfo"), true, !rnVar.J0);
                    } else if (org.telegram.messenger.t3.T(rnVar.w0)) {
                        h6VarArr[i18].b(id.M0(2131752232, "ChatHistoryHidden"), id.M0(2131752231, "ChatHistoryHiddenInfo"), false, rnVar.J0);
                    } else {
                        h6VarArr[i18].b(id.M0(2131752232, "ChatHistoryHidden"), id.M0(2131752230, "ChatHistoryHiddenInfo2"), false, rnVar.J0);
                    }
                    linearLayout.addView(h6VarArr[i18], ha.o(-1, -2));
                    h6VarArr[i18].setOnClickListener(new org.telegram.ui.z(rnVar, h6VarArr, f1Var, 8));
                    i18++;
                    i12 = 2;
                    r92 = 0;
                }
                w2 w2Var = (w2) f1Var.b;
                w2Var.N = f10;
                rnVar.showDialog(w2Var);
                break;
            case 15:
                rn.Z((rn) obj2, (FrameLayout) obj, view);
                break;
            case 16:
                mp.a0((mp) obj2, (h9.f1) obj, view);
                break;
            case 17:
                new ug.w0(42, ((org.telegram.ui.Components.f0) obj2).getContext(), (h6) obj).show();
                break;
            case 18:
                final org.telegram.ui.Components.z zVar2 = (org.telegram.ui.Components.z) obj2;
                final h6 h6Var2 = (h6) obj;
                org.telegram.ui.Cells.k3 k3Var2 = zVar2.W1;
                org.telegram.ui.Cells.k3 k3Var3 = zVar2.V1;
                wo woVar = zVar2.Y1;
                fi.d dVar2 = zVar2.b2;
                if (!dVar2.Q) {
                    if (dVar2.c0) {
                        dVar2.setLoading(true);
                        if (zVar2.e2 != null) {
                            TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                            updatetone.flags |= 1;
                            updatetone.display_author = woVar.a.q;
                            updatetone.tone = TL_aicompose.InputAiComposeTone.from(zVar2.e2);
                            updatetone.flags |= 2;
                            updatetone.emoji_id = zVar2.c2.longValue();
                            updatetone.flags |= 4;
                            updatetone.title = k3Var3.getText().toString();
                            updatetone.flags |= 8;
                            updatetone.prompt = k3Var2.getText().toString();
                            ConnectionsManager.getInstance(zVar2.a).sendRequestTyped(updatetone, new d3.b(i14), new v10() { // from class: org.telegram.ui.Components.u
                                @Override // org.telegram.messenger.v10
                                public final void a(Object obj4, Object obj5) {
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                    switch (i13) {
                                        case 0:
                                            z zVar3 = zVar2;
                                            zVar3.b2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    org.telegram.ui.Cells.f1.r(zVar3.a2, h6Var2, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                f fVar = zVar3.g2;
                                                if (fVar != null) {
                                                    fVar.a(aiComposeTone);
                                                }
                                                zVar3.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            z zVar4 = zVar2;
                                            FrameLayout frameLayout = zVar4.a2;
                                            zVar4.b2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    org.telegram.ui.ActionBar.h6 h6Var3 = h6Var2;
                                                    if (!equalsIgnoreCase) {
                                                        org.telegram.ui.Cells.f1.r(frameLayout, h6Var3, tL_error, false);
                                                        break;
                                                    } else {
                                                        f0.t1(new gc(frameLayout, h6Var3), zVar4.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                zVar4.dismiss();
                                                f fVar2 = zVar4.f2;
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
                            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
                            createtone.display_author = woVar.a.q;
                            createtone.emoji_id = zVar2.c2.longValue();
                            createtone.title = k3Var3.getText().toString();
                            createtone.prompt = k3Var2.getText().toString();
                            ConnectionsManager.getInstance(zVar2.a).sendRequestTyped(createtone, new d3.b(i14), new v10() { // from class: org.telegram.ui.Components.u
                                @Override // org.telegram.messenger.v10
                                public final void a(Object obj4, Object obj5) {
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                    switch (i14) {
                                        case 0:
                                            z zVar3 = zVar2;
                                            zVar3.b2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    org.telegram.ui.Cells.f1.r(zVar3.a2, h6Var2, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                f fVar = zVar3.g2;
                                                if (fVar != null) {
                                                    fVar.a(aiComposeTone);
                                                }
                                                zVar3.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            z zVar4 = zVar2;
                                            FrameLayout frameLayout = zVar4.a2;
                                            zVar4.b2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    org.telegram.ui.ActionBar.h6 h6Var3 = h6Var2;
                                                    if (!equalsIgnoreCase) {
                                                        org.telegram.ui.Cells.f1.r(frameLayout, h6Var3, tL_error, false);
                                                        break;
                                                    } else {
                                                        f0.t1(new gc(frameLayout, h6Var3), zVar4.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                zVar4.dismiss();
                                                f fVar2 = zVar4.f2;
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
                    } else if (zVar2.c2 == null) {
                        zVar2.d1();
                        break;
                    }
                }
                break;
            case 19:
                ((c20) obj2).a((TL_aicompose.AiComposeTone) obj);
                break;
            case 20:
                r0 r0Var = (r0) obj2;
                org.telegram.ui.Components.r4 r4Var = (org.telegram.ui.Components.r4) obj;
                r0Var.U(null, null);
                r0Var.O(r4Var.d, false);
                r0Var.setupPopupRadialSelectors(r4Var.f);
                r0Var.H(r4Var.e);
                break;
            case 21:
                boolean[] zArr = (boolean[]) obj2;
                boolean z12 = !zArr[0];
                zArr[0] = z12;
                ((org.telegram.ui.Cells.c2) view).c(z12, true);
                ((xn) obj).run();
                break;
            case 22:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.L0.run();
                ((bt) obj).onClick(null, intValue);
                break;
            case 23:
                ((w2) ((h9.f1) obj2).b).x0.run();
                ((c20) obj).a(null);
                break;
            case 24:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 25:
                org.telegram.ui.Components.a8 a8Var = (org.telegram.ui.Components.a8) obj2;
                float[] fArr = (float[]) obj;
                float f11 = MediaController.B().q0;
                int i19 = 0;
                while (true) {
                    if (i19 < 3) {
                        if (f11 - 0.1f <= fArr[i19]) {
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
                if (currentTimeMillis - a8Var.J2 > 300) {
                    int i21 = qp.f1().getInt("speedhint", 0) + 1;
                    if (i21 > 2) {
                        i21 = -10;
                    }
                    qp.f1().edit().putInt("speedhint", i21).apply();
                    if (i21 >= 0 && a8Var.b != null) {
                        n7 n7Var = new n7(5, a8Var.getContext(), null, false);
                        a8Var.I2 = n7Var;
                        n7Var.setExtraTranslationY(org.telegram.messenger.g0.L(6.0f));
                        a8Var.I2.setText(id.M0(2131745269, null));
                        a8Var.x1.addView(a8Var.I2, ha.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                        a8Var.I2.c(a8Var.O1);
                    }
                }
                a8Var.J2 = currentTimeMillis;
                break;
            case 26:
                org.telegram.ui.Components.a8 a8Var2 = (org.telegram.ui.Components.a8) obj2;
                a8Var2.getClass();
                ((k60) obj).u();
                a8Var2.P0(6);
                break;
            case 27:
                o80 o80Var = (o80) obj;
                org.telegram.ui.Components.a8 a8Var3 = (org.telegram.ui.Components.a8) ((s7) obj2).F;
                int i22 = a8Var3.a;
                LaunchActivity launchActivity = a8Var3.z2;
                ArrayList arrayList2 = (ArrayList) qp.s1(i22).w.get(0);
                if ((arrayList2 != null ? arrayList2.size() : 0) > 10 && !TextUtils.isEmpty(o80Var.getText().toString())) {
                    String charSequence = o80Var.getText().toString();
                    if (launchActivity.M().getLastFragment() instanceof zw) {
                        zw zwVar = (zw) launchActivity.M().getLastFragment();
                        ArrayList arrayList3 = (ArrayList) zwVar.getMessagesController().w.get(0);
                        int size2 = arrayList3 != null ? arrayList3.size() : 0;
                        if (!zwVar.m2 && (size2 > 10 || zwVar.K)) {
                            i14 = 0;
                        }
                        if (i14 == 0) {
                            if (zwVar.k2) {
                                zwVar.X.r.setText(charSequence);
                                zwVar.X.r.setSelection(charSequence.length());
                                iw iwVar = zwVar.C0;
                                if (iwVar != null && (N = iwVar.N(3)) >= 0 && zwVar.C0.getTabsView().getCurrentTabId() != N) {
                                    zwVar.C0.getTabsView().d(N, N);
                                }
                            } else {
                                zwVar.y = 3;
                                zwVar.X.r.setText(charSequence);
                                zwVar.X.r.setSelection(charSequence.length());
                            }
                            a8Var3.dismiss();
                            break;
                        }
                    }
                    zw zwVar2 = new zw(null);
                    zwVar2.o2 = charSequence;
                    zwVar2.y = 3;
                    launchActivity.u0(zwVar2, false, false);
                    a8Var3.dismiss();
                    break;
                }
                break;
            case 28:
                s8 s8Var = (s8) obj2;
                ((boolean[]) obj)[0] = true;
                s8Var.J.z1(s8Var.Y);
                s8Var.S.dismiss();
                break;
            default:
                tc tcVar = (tc) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                k60 k60Var = tcVar.W0;
                if (k60Var == null || !k60Var.D()) {
                    tcVar.c1.f(true);
                    k60 F = k60.F(frameLayout, new di.b(), tcVar.U0);
                    tcVar.W0 = F;
                    F.s = 0;
                    F.p(13, org.telegram.messenger.g0.L(200.0f), id.M0(2131744135, null));
                    tcVar.W0.k();
                    int[] iArr = tcVar.b1;
                    int length = iArr.length;
                    for (int i23 = 0; i23 < length; i23++) {
                        int i24 = iArr[i23];
                        tcVar.W0.c(0, i24 == 0 ? id.M0(2131744136, null) : i24 == Integer.MAX_VALUE ? id.M0(2131744134, null) : id.G(i24, "Seconds", new Object[0]), new org.telegram.ui.Components.q2(tcVar, i24, i12), false);
                        if (tcVar.a1 == i24) {
                            tcVar.W0.L();
                        }
                    }
                    tcVar.W0.Z();
                    break;
                } else {
                    tcVar.W0.u();
                    tcVar.W0 = null;
                    break;
                }
        }
    }
}
