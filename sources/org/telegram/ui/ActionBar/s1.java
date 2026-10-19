package org.telegram.ui.ActionBar;

import ai.x9;
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
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a7;
import org.telegram.ui.b70;
import org.telegram.ui.bq;
import org.telegram.ui.cf0;
import org.telegram.ui.cy;
import org.telegram.ui.h7;
import org.telegram.ui.i9;
import org.telegram.ui.ie;
import org.telegram.ui.io;
import org.telegram.ui.l7;
import org.telegram.ui.lx;
import org.telegram.ui.m9;
import org.telegram.ui.p7;
import org.telegram.ui.p91;
import org.telegram.ui.q8;
import org.telegram.ui.qn;
import org.telegram.ui.r8;
import org.telegram.ui.sd;
import org.telegram.ui.td;
import org.telegram.ui.yt;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Runnable runnable;
        int i10;
        int L;
        int i11 = this.a;
        int i12 = 1;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                b2 b2Var = (b2) obj2;
                if (!((w1) obj).a) {
                    a2 a2Var = b2Var.s0;
                    if (a2Var != null) {
                        a2Var.g(b2Var, -2);
                    }
                    if (b2Var.h0) {
                        b2Var.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                b2 b2Var2 = (b2) obj2;
                if (!((w1) obj).a) {
                    ki.e4 e4Var = b2Var2.q0;
                    if (e4Var != null) {
                        e4Var.g(b2Var2, -2);
                    }
                    if (b2Var2.h0) {
                        b2Var2.cancel();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.x3 x3Var = l4Var.K;
                if (!l4Var.h0.A0) {
                    org.telegram.ui.o3 o3Var = l4Var.u0[0];
                    if (!o3Var.f()) {
                        if (x3Var != null) {
                            tw0 tw0Var = new tw0(activity);
                            tw0Var.a = 1;
                            tw0Var.s = -AndroidUtilities.dp(32.0f);
                            o3Var.d.w0(tw0Var);
                            break;
                        } else {
                            o3Var.b.x0(0);
                            break;
                        }
                    } else if (o3Var.getWebView() != null && !l4Var.h0.W) {
                        if (l4Var.i0 != null) {
                            org.telegram.ui.web.x0 webView = o3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String u10 = org.telegram.ui.web.a1.u(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.k kVar = l4Var.i0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = LocaleController.getString(R.string.WebEmpty);
                            }
                            String str2 = TextUtils.isEmpty(u10) ? "about:blank" : u10;
                            org.telegram.ui.y yVar = new org.telegram.ui.y(l4Var, u10, i13);
                            org.telegram.ui.z zVar = new org.telegram.ui.z(l4Var, o3Var, activity, i13);
                            org.telegram.ui.r rVar = new org.telegram.ui.r(l4Var, i12);
                            org.telegram.ui.r rVar2 = new org.telegram.ui.r(l4Var, 2);
                            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(l4Var, u10, o3Var, i13);
                            org.telegram.ui.web.c cVar = kVar.w;
                            ImageView imageView = kVar.f;
                            if (favicon == null) {
                                imageView.setImageResource(R.drawable.msg_language);
                                imageView.setColorFilter(new PorterDuffColorFilter(kVar.H, PorterDuff.Mode.SRC_IN));
                            } else {
                                imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), favicon));
                                imageView.setColorFilter((ColorFilter) null);
                            }
                            TextView textView = kVar.r;
                            textView.setText(Emoji.replaceEmoji(title, textView.getPaint().getFontMetricsInt(), false));
                            try {
                                try {
                                    Uri parse = Uri.parse(str2);
                                    str2 = pf.d.u(parse, null, null, pf.d.a(parse.getHost()), null);
                                } catch (Exception e) {
                                    FileLog.e((Throwable) e, false);
                                }
                                str = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                str = str2;
                            }
                            TextView textView2 = kVar.s;
                            textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                            kVar.L = zVar;
                            kVar.M = rVar;
                            kVar.N = rVar2;
                            kVar.e.setOnClickListener(new cf0(29, kVar, yVar));
                            kVar.n.setOnClickListener(a0Var);
                            kVar.b = false;
                            kVar.setInput(null);
                            cVar.W2.N(true);
                            cVar.u0(0);
                        }
                        org.telegram.ui.n0 n0Var = l4Var.h0;
                        j3 j3Var = new j3(4, o3Var, activity);
                        ai.t tVar = n0Var.b0;
                        tVar.setText("");
                        tVar.setSelection(0, tVar.getText().length());
                        tVar.setScrollX(0);
                        n0Var.v0 = j3Var;
                        n0Var.k(true);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.f1 f1Var = (org.telegram.ui.f1) obj2;
                b70 b70Var = (b70) obj;
                if (f1Var.f == 0) {
                    f1Var.a(1, true);
                    int i14 = ((org.telegram.ui.l4) b70Var).X;
                    TLRPC.Chat chat = b70Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i14).sendRequestTyped(tL_channels_joinChannel, new ai.u0(f1Var, i14, tL_channels_joinChannel, chat, 4));
                    break;
                }
                break;
            case 4:
                org.telegram.ui.h5 h5Var = (org.telegram.ui.h5) obj2;
                h5Var.b(false);
                h5Var.e.b((org.telegram.ui.i5) obj);
                break;
            case 5:
                ((a7) obj2).e.u0((org.telegram.ui.Cells.a2) obj);
                break;
            case 6:
                h7 h7Var = (h7) obj2;
                p7 p7Var = (p7) obj;
                l7 l7Var = h7Var.d.v;
                if (l7Var != null) {
                    l7Var.s0(p7Var.c, p7Var.d, true);
                }
                m1 m1Var = h7Var.a;
                if (m1Var != null) {
                    m1Var.d(true);
                    break;
                }
                break;
            case 7:
                m9 m9Var = (m9) obj2;
                i9 i9Var = (i9) obj;
                ArrayList arrayList = i9Var.b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = m9Var.getMessagesController().getUserFull(user.id);
                    m9Var.P = user;
                    boolean z10 = i9Var.e;
                    org.telegram.ui.Components.voip.d2.m(user, z10, z10 || (userFull != null && userFull.video_calls_available), m9Var.getParentActivity(), null, m9Var.getAccountInstance());
                    break;
                } else {
                    boolean z11 = i9Var.e;
                    HashSet hashSet = new HashSet();
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj3 = arrayList.get(i15);
                        i15++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) i9Var.c.get(0)).id;
                    b2 b2Var3 = new b2(m9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = m9Var.getMessagesController().conferenceCallSizeLimit;
                    b2Var3.setOnCancelListener(new r8(m9Var, m9Var.getConnectionsManager().sendRequest(getgroupcall, new q8(m9Var, b2Var3, hashSet, tL_inputGroupCallInviteMessage, z11, 1)), i12));
                    b2Var3.r(600L);
                    break;
                }
            case 8:
                ie ieVar = (ie) obj2;
                p91 p91Var = (p91) obj;
                ei.d dVar = ieVar.K0;
                if (view.isEnabled() && !dVar.N) {
                    zd zdVar = ieVar.Q0;
                    if (zdVar == null || !zdVar.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        sd sdVar = new sd(ieVar, twoStepVerificationActivity, i13);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.b0 = sdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new td(ieVar, p91Var, twoStepVerificationActivity, i13));
                        break;
                    }
                }
                break;
            case 9:
                pf.d.r((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                break;
            case 10:
                qn qnVar = (qn) obj2;
                if (qnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    qnVar.T7();
                    UndoView undoView = qnVar.y3;
                    if (undoView != null) {
                        long j10 = qnVar.T5;
                        int i16 = UndoView.e0;
                        undoView.j(83, j10, new org.telegram.ui.n4(qnVar, 1));
                    }
                }
                qnVar.D7(true);
                break;
            case 11:
                qn.W0((qn) obj2, (String) obj);
                break;
            case 12:
                qn.S0((qn) obj2, (i80) obj);
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) obj2;
                boolean z12 = !a2Var2.b();
                a2Var2.c(z12, true);
                ((AtomicBoolean) obj).set(z12);
                break;
            case 14:
                qn.g1((qn) obj2, (Context) obj);
                break;
            case 15:
                io ioVar = (io) obj2;
                Context context = (Context) obj;
                a3 a3Var = new a3(context, null);
                f3 f3Var = a3Var.a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, h6.n5, 23, 15, false, null);
                l4Var2.setHeight(47);
                l4Var2.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(l4Var2);
                LinearLayout e10 = kk.e(context, 1);
                linearLayout.addView(e10, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.i6[] i6VarArr = new org.telegram.ui.Cells.i6[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, true);
                    i6VarArr[i17] = i6Var;
                    i6Var.setTag(Integer.valueOf(i17));
                    i6VarArr[i17].setBackgroundDrawable(h6.L0(false));
                    if (i17 == 0) {
                        i6VarArr[i17].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !ioVar.J0);
                    } else if (ChatObject.isChannel(ioVar.x0)) {
                        i6VarArr[i17].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, ioVar.J0);
                    } else {
                        i6VarArr[i17].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, ioVar.J0);
                    }
                    e10.addView(i6VarArr[i17], w7.z5.n(-1, -2));
                    i6VarArr[i17].setOnClickListener(new org.telegram.ui.a0(ioVar, i6VarArr, a3Var, 8));
                    i17++;
                }
                a3Var.b(linearLayout);
                ioVar.showDialog(f3Var);
                break;
            case 16:
                io.U((io) obj2, (FrameLayout) obj, view);
                break;
            case 17:
                bq.V((bq) obj2, (a3) obj, view);
                break;
            case 18:
                new sg.y0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (d6) obj).show();
                break;
            case 19:
                org.telegram.ui.Components.y.R((org.telegram.ui.Components.y) obj2, (d6) obj);
                break;
            case 20:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                break;
            case 21:
                u0 u0Var = (u0) obj2;
                org.telegram.ui.Components.d5 d5Var = (org.telegram.ui.Components.d5) obj;
                u0Var.M(null, null);
                u0Var.G(d5Var.d, false);
                u0Var.setupPopupRadialSelectors(d5Var.f);
                u0Var.B(d5Var.e);
                break;
            case 22:
                boolean[] zArr = (boolean[]) obj2;
                boolean z13 = !zArr[0];
                zArr[0] = z13;
                ((org.telegram.ui.Cells.a2) view).c(z13, true);
                ((x9) obj).run();
                break;
            case 23:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.L0.run();
                ((yt) obj).onClick(null, intValue);
                break;
            case 24:
                runnable = ((a3) obj2).a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                break;
            case 25:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 26:
                k8.F((k8) obj2, (float[]) obj);
                break;
            case 27:
                k8 k8Var = (k8) obj2;
                k8Var.getClass();
                ((i80) obj).u();
                k8Var.u0(6);
                break;
            case 28:
                ma0 ma0Var = (ma0) obj;
                k8 k8Var2 = ((b8) obj2).F;
                i10 = k8Var2.currentAccount;
                LaunchActivity launchActivity = k8Var2.G0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(ma0Var.getText().toString())) {
                    String charSequence = ma0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof cy) {
                        cy cyVar = (cy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = cyVar.getMessagesController().getTotalDialogsCount();
                        if (!cyVar.l2 && (totalDialogsCount > 10 || cyVar.K)) {
                            if (cyVar.j2) {
                                cyVar.X.r.setText(charSequence);
                                cyVar.X.r.setSelection(charSequence.length());
                                lx lxVar = cyVar.C0;
                                if (lxVar != null && (L = lxVar.L(3)) >= 0 && cyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    cyVar.C0.getTabsView().d(L, L);
                                }
                            } else {
                                cyVar.x = 3;
                                cyVar.X.r.setText(charSequence);
                                cyVar.X.r.setSelection(charSequence.length());
                            }
                            k8Var2.dismiss();
                            break;
                        }
                    }
                    cy cyVar2 = new cy(null);
                    cyVar2.n2 = charSequence;
                    cyVar2.x = 3;
                    launchActivity.u0(cyVar2, false, false);
                    k8Var2.dismiss();
                    break;
                }
                break;
            default:
                e9 e9Var = (e9) obj2;
                ((boolean[]) obj)[0] = true;
                e9Var.J.x1(e9Var.Y);
                e9Var.S.dismiss();
                break;
        }
    }
}
