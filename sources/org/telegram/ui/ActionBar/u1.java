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
import bi.s9;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ae;
import org.telegram.ui.au;
import org.telegram.ui.ey;
import org.telegram.ui.iq;
import org.telegram.ui.j70;
import org.telegram.ui.k9;
import org.telegram.ui.ke;
import org.telegram.ui.m7;
import org.telegram.ui.mx;
import org.telegram.ui.o9;
import org.telegram.ui.oo;
import org.telegram.ui.q7;
import org.telegram.ui.s8;
import org.telegram.ui.t8;
import org.telegram.ui.ud;
import org.telegram.ui.vd;
import org.telegram.ui.wn;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v12, types: [org.telegram.ui.ActionBar.b7, org.telegram.ui.ActionBar.u6] */
    /* JADX WARN: Type inference failed for: r7v21 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        String str;
        Runnable runnable;
        int i11;
        int N;
        int i12 = this.a;
        int i13 = 2;
        ?? r72 = 0;
        int i14 = 1;
        int i15 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                e2 e2Var = (e2) obj2;
                if (!((x1) obj).a) {
                    b2 b2Var = e2Var.u0;
                    if (b2Var != null) {
                        b2Var.h(e2Var, -2);
                    }
                    if (e2Var.j0) {
                        e2Var.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                e2 e2Var2 = (e2) obj2;
                if (!((x1) obj).a) {
                    li.e4 e4Var = e2Var2.s0;
                    if (e4Var != null) {
                        e4Var.h(e2Var2, -2);
                    }
                    if (e2Var2.j0) {
                        e2Var2.cancel();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.v3 v3Var = j4Var.K;
                if (!j4Var.h0.A0) {
                    org.telegram.ui.m3 m3Var = j4Var.u0[0];
                    if (!m3Var.f()) {
                        if (v3Var == null) {
                            m3Var.b.y0(0);
                            break;
                        } else {
                            fx0 fx0Var = new fx0(activity);
                            fx0Var.a = 1;
                            fx0Var.s = -AndroidUtilities.dp(32.0f);
                            m3Var.d.w0(fx0Var);
                            break;
                        }
                    } else if (m3Var.getWebView() != null && !j4Var.h0.W) {
                        if (j4Var.i0 != null) {
                            org.telegram.ui.web.x0 webView = m3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String u10 = org.telegram.ui.web.a1.u(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.l lVar = j4Var.i0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = LocaleController.getString(R.string.WebEmpty);
                            }
                            String str2 = TextUtils.isEmpty(u10) ? "about:blank" : u10;
                            org.telegram.ui.x xVar = new org.telegram.ui.x(j4Var, u10, i15);
                            org.telegram.ui.y yVar = new org.telegram.ui.y(j4Var, m3Var, activity, i15);
                            org.telegram.ui.q qVar = new org.telegram.ui.q(j4Var, i14);
                            org.telegram.ui.q qVar2 = new org.telegram.ui.q(j4Var, 2);
                            org.telegram.ui.z zVar = new org.telegram.ui.z(j4Var, u10, m3Var, i15);
                            org.telegram.ui.web.d dVar = lVar.w;
                            ImageView imageView = lVar.f;
                            if (favicon == null) {
                                imageView.setImageResource(R.drawable.msg_language);
                                imageView.setColorFilter(new PorterDuffColorFilter(lVar.H, PorterDuff.Mode.SRC_IN));
                            } else {
                                imageView.setImageDrawable(new BitmapDrawable(lVar.getContext().getResources(), favicon));
                                imageView.setColorFilter((ColorFilter) null);
                            }
                            TextView textView = lVar.r;
                            textView.setText(Emoji.replaceEmoji(title, textView.getPaint().getFontMetricsInt(), false));
                            try {
                                try {
                                    Uri parse = Uri.parse(str2);
                                    str2 = qf.d.u(parse, null, null, qf.d.a(parse.getHost()), null);
                                } catch (Exception e) {
                                    FileLog.e((Throwable) e, false);
                                }
                                str = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                str = str2;
                            }
                            TextView textView2 = lVar.s;
                            i10 = 0;
                            textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                            lVar.L = yVar;
                            lVar.M = qVar;
                            lVar.N = qVar2;
                            lVar.e.setOnClickListener(new org.telegram.ui.web.c(i10, lVar, xVar));
                            lVar.n.setOnClickListener(zVar);
                            lVar.b = false;
                            lVar.setInput(null);
                            dVar.g3.O(true);
                            dVar.v0(0);
                        } else {
                            i10 = 0;
                        }
                        org.telegram.ui.l0 l0Var = j4Var.h0;
                        li.s2 s2Var = new li.s2(6, m3Var, activity);
                        bi.t tVar = l0Var.b0;
                        tVar.setText("");
                        tVar.setSelection(i10, tVar.getText().length());
                        tVar.setScrollX(i10);
                        l0Var.v0 = s2Var;
                        l0Var.k(true);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) obj2;
                j70 j70Var = (j70) obj;
                if (c1Var.h == 0) {
                    c1Var.a(1, true);
                    int i16 = ((org.telegram.ui.j4) j70Var).X;
                    TLRPC.Chat chat = j70Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i16).sendRequestTyped(tL_channels_joinChannel, new bi.v0(c1Var, i16, tL_channels_joinChannel, chat, 4));
                    break;
                }
                break;
            case 4:
                org.telegram.ui.f5 f5Var = (org.telegram.ui.f5) obj2;
                f5Var.b(false);
                f5Var.e.b((org.telegram.ui.g5) obj);
                break;
            case 5:
                ((org.telegram.ui.a7) obj2).e.t0((org.telegram.ui.Cells.y1) obj);
                break;
            case 6:
                org.telegram.ui.h7 h7Var = (org.telegram.ui.h7) obj2;
                q7 q7Var = (q7) obj;
                m7 m7Var = h7Var.f.F;
                if (m7Var != null) {
                    m7Var.q(q7Var.c, q7Var.d, true);
                }
                o1 o1Var = h7Var.a;
                if (o1Var != null) {
                    o1Var.d(true);
                    break;
                }
                break;
            case 7:
                o9 o9Var = (o9) obj2;
                k9 k9Var = (k9) obj;
                ArrayList arrayList = k9Var.b;
                if (arrayList.size() != 1) {
                    boolean z10 = k9Var.e;
                    HashSet hashSet = new HashSet();
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList.get(i17);
                        i17++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) k9Var.c.get(0)).id;
                    e2 e2Var3 = new e2(o9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = o9Var.getMessagesController().conferenceCallSizeLimit;
                    e2Var3.setOnCancelListener(new t8(o9Var, o9Var.getConnectionsManager().sendRequest(getgroupcall, new s8(o9Var, e2Var3, hashSet, tL_inputGroupCallInviteMessage, z10, 1)), i14));
                    e2Var3.r(600L);
                    break;
                } else {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = o9Var.getMessagesController().getUserFull(user.id);
                    o9Var.K = user;
                    boolean z11 = k9Var.e;
                    org.telegram.ui.Components.voip.g2.m(user, z11, z11 || (userFull != null && userFull.video_calls_available), o9Var.getParentActivity(), null, o9Var.getAccountInstance());
                    break;
                }
            case 8:
                ke keVar = (ke) obj2;
                y91 y91Var = (y91) obj;
                fi.d dVar2 = keVar.A0;
                if (view.isEnabled() && !dVar2.Q) {
                    ae aeVar = keVar.G0;
                    if (aeVar == null || !aeVar.Q) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        ud udVar = new ud(keVar, twoStepVerificationActivity, i15);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.b0 = udVar;
                        dVar2.setLoading(true);
                        twoStepVerificationActivity.t0(new vd(keVar, y91Var, twoStepVerificationActivity, i15));
                        break;
                    }
                }
                break;
            case 9:
                qf.d.r((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                break;
            case 10:
                wn wnVar = (wn) obj2;
                if (wnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    wnVar.Z7();
                    UndoView undoView = wnVar.K3;
                    if (undoView != null) {
                        long j10 = wnVar.j6;
                        int i18 = UndoView.i0;
                        undoView.j(83, j10, new org.telegram.ui.l4(wnVar, 1));
                    }
                }
                wnVar.J7(true);
                break;
            case 11:
                wn.l1((wn) obj2, (String) obj);
                break;
            case 12:
                wn.F0((wn) obj2, (l80) obj);
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) obj2;
                boolean z12 = !y1Var.b();
                y1Var.c(z12, true);
                ((AtomicBoolean) obj).set(z12);
                break;
            case 14:
                wn.D1((wn) obj2, (Context) obj);
                break;
            case 15:
                oo ooVar = (oo) obj2;
                Context context = (Context) obj;
                e3 e3Var = new e3(context, null);
                k3 k3Var = e3Var.a;
                k3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context, y6.n5, 23, 15, false, null);
                q4Var.setHeight(47);
                q4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(q4Var);
                LinearLayout d = wh.d(context, 1);
                linearLayout.addView(d, kb1.r(-1, -2));
                org.telegram.ui.Cells.n6[] n6VarArr = new org.telegram.ui.Cells.n6[2];
                int i19 = 0;
                while (i19 < i13) {
                    org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(context, true);
                    n6VarArr[i19] = n6Var;
                    n6Var.setTag(Integer.valueOf(i19));
                    f7.R(n6VarArr[i19], y6.M0(false), r72, f7.N(y6.i6), r72);
                    if (i19 == 0) {
                        n6VarArr[i19].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !ooVar.I0);
                    } else if (ChatObject.isChannel(ooVar.w0)) {
                        n6VarArr[i19].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, ooVar.I0);
                    } else {
                        n6VarArr[i19].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, ooVar.I0);
                    }
                    d.addView(n6VarArr[i19], kb1.r(-1, -2));
                    n6VarArr[i19].setOnClickListener(new org.telegram.ui.z(ooVar, n6VarArr, e3Var, 8));
                    i19++;
                    i13 = 2;
                    r72 = 0;
                }
                e3Var.b(linearLayout);
                ooVar.showDialog(k3Var);
                break;
            case 16:
                oo.V((oo) obj2, (FrameLayout) obj, view);
                break;
            case 17:
                iq.W((iq) obj2, (e3) obj, view);
                break;
            case 18:
                new tg.y0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (u6) obj).show();
                break;
            case 19:
                org.telegram.ui.Components.y.Q((org.telegram.ui.Components.y) obj2, (u6) obj);
                break;
            case 20:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                break;
            case 21:
                w0 w0Var = (w0) obj2;
                org.telegram.ui.Components.d5 d5Var = (org.telegram.ui.Components.d5) obj;
                w0Var.U(null, null);
                w0Var.O(d5Var.d, false);
                w0Var.setupPopupRadialSelectors(d5Var.f);
                w0Var.H(d5Var.e);
                break;
            case 22:
                boolean[] zArr = (boolean[]) obj2;
                boolean z13 = !zArr[0];
                zArr[0] = z13;
                ((org.telegram.ui.Cells.y1) view).c(z13, true);
                ((s9) obj).run();
                break;
            case 23:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.N0.run();
                ((au) obj).onClick(null, intValue);
                break;
            case 24:
                runnable = ((e3) obj2).a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                break;
            case 25:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 26:
                m8.D((m8) obj2, (float[]) obj);
                break;
            case 27:
                m8 m8Var = (m8) obj2;
                m8Var.getClass();
                ((l80) obj).u();
                m8Var.A0(6);
                break;
            case 28:
                pa0 pa0Var = (pa0) obj;
                m8 m8Var2 = (m8) ((d8) obj2).F;
                i11 = m8Var2.currentAccount;
                LaunchActivity launchActivity = m8Var2.F0;
                if (MessagesController.getInstance(i11).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(pa0Var.getText().toString())) {
                    String charSequence = pa0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof ey) {
                        ey eyVar = (ey) launchActivity.O().getLastFragment();
                        int totalDialogsCount = eyVar.getMessagesController().getTotalDialogsCount();
                        if (!eyVar.l2 && (totalDialogsCount > 10 || eyVar.K)) {
                            if (eyVar.j2) {
                                eyVar.X.r.setText(charSequence);
                                eyVar.X.r.setSelection(charSequence.length());
                                mx mxVar = eyVar.C0;
                                if (mxVar != null && (N = mxVar.N(3)) >= 0 && eyVar.C0.getTabsView().getCurrentTabId() != N) {
                                    eyVar.C0.getTabsView().d(N, N);
                                }
                            } else {
                                eyVar.x = 3;
                                eyVar.X.r.setText(charSequence);
                                eyVar.X.r.setSelection(charSequence.length());
                            }
                            m8Var2.dismiss();
                            break;
                        }
                    }
                    ey eyVar2 = new ey(null);
                    eyVar2.n2 = charSequence;
                    eyVar2.x = 3;
                    launchActivity.v0(eyVar2, false, false);
                    m8Var2.dismiss();
                    break;
                }
                break;
            default:
                g9 g9Var = (g9) obj2;
                ((boolean[]) obj)[0] = true;
                g9Var.J.C1(g9Var.Y);
                g9Var.S.dismiss();
                break;
        }
    }
}
