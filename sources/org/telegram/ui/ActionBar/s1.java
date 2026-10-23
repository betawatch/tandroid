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
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a7;
import org.telegram.ui.bu;
import org.telegram.ui.dq;
import org.telegram.ui.ey;
import org.telegram.ui.f70;
import org.telegram.ui.h7;
import org.telegram.ui.i9;
import org.telegram.ui.ie;
import org.telegram.ui.ko;
import org.telegram.ui.l7;
import org.telegram.ui.m9;
import org.telegram.ui.nx;
import org.telegram.ui.p7;
import org.telegram.ui.q8;
import org.telegram.ui.r8;
import org.telegram.ui.sd;
import org.telegram.ui.sn;
import org.telegram.ui.td;
import org.telegram.ui.u91;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v14, types: [org.telegram.ui.ActionBar.g6, org.telegram.ui.ActionBar.n6] */
    /* JADX WARN: Type inference failed for: r6v23 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Runnable runnable;
        int i10;
        int L;
        int i11 = this.a;
        int i12 = 2;
        ?? r62 = 0;
        int i13 = 1;
        int i14 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                c2 c2Var = (c2) obj2;
                if (!((v1) obj).a) {
                    z1 z1Var = c2Var.u0;
                    if (z1Var != null) {
                        z1Var.g(c2Var, -2);
                    }
                    if (c2Var.j0) {
                        c2Var.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                c2 c2Var2 = (c2) obj2;
                if (!((v1) obj).a) {
                    ki.e4 e4Var = c2Var2.s0;
                    if (e4Var != null) {
                        e4Var.g(c2Var2, -2);
                    }
                    if (c2Var2.j0) {
                        c2Var2.cancel();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.w3 w3Var = k4Var.K;
                if (!k4Var.h0.A0) {
                    org.telegram.ui.n3 n3Var = k4Var.u0[0];
                    if (!n3Var.f()) {
                        if (w3Var == null) {
                            n3Var.b.x0(0);
                            break;
                        } else {
                            xw0 xw0Var = new xw0(activity);
                            xw0Var.a = 1;
                            xw0Var.s = -AndroidUtilities.dp(32.0f);
                            n3Var.d.w0(xw0Var);
                            break;
                        }
                    } else if (n3Var.getWebView() != null && !k4Var.h0.W) {
                        if (k4Var.i0 != null) {
                            org.telegram.ui.web.y0 webView = n3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String u10 = org.telegram.ui.web.b1.u(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.l lVar = k4Var.i0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = LocaleController.getString(R.string.WebEmpty);
                            }
                            String str2 = TextUtils.isEmpty(u10) ? "about:blank" : u10;
                            org.telegram.ui.x xVar = new org.telegram.ui.x(k4Var, u10, i14);
                            org.telegram.ui.y yVar = new org.telegram.ui.y(k4Var, n3Var, activity, i14);
                            org.telegram.ui.q qVar = new org.telegram.ui.q(k4Var, i13);
                            org.telegram.ui.q qVar2 = new org.telegram.ui.q(k4Var, 2);
                            org.telegram.ui.z zVar = new org.telegram.ui.z(k4Var, u10, n3Var, i14);
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
                                    str2 = pf.d.u(parse, null, null, pf.d.a(parse.getHost()), null);
                                } catch (Exception e) {
                                    FileLog.e((Throwable) e, false);
                                }
                                str = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                str = str2;
                            }
                            TextView textView2 = lVar.s;
                            textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                            lVar.L = yVar;
                            lVar.M = qVar;
                            lVar.N = qVar2;
                            lVar.e.setOnClickListener(new org.telegram.ui.web.c(0, lVar, xVar));
                            lVar.n.setOnClickListener(zVar);
                            lVar.b = false;
                            lVar.setInput(null);
                            dVar.Z2.N(true);
                            dVar.u0(0);
                        }
                        org.telegram.ui.m0 m0Var = k4Var.h0;
                        m3 m3Var = new m3(4, n3Var, activity);
                        ai.t tVar = m0Var.b0;
                        tVar.setText("");
                        tVar.setSelection(0, tVar.getText().length());
                        tVar.setScrollX(0);
                        m0Var.v0 = m3Var;
                        m0Var.k(true);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.e1 e1Var = (org.telegram.ui.e1) obj2;
                f70 f70Var = (f70) obj;
                if (e1Var.h == 0) {
                    e1Var.a(1, true);
                    int i15 = ((org.telegram.ui.k4) f70Var).X;
                    TLRPC.Chat chat = f70Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i15).sendRequestTyped(tL_channels_joinChannel, new ai.u0(e1Var, i15, tL_channels_joinChannel, chat, 4));
                    break;
                }
                break;
            case 4:
                org.telegram.ui.g5 g5Var = (org.telegram.ui.g5) obj2;
                g5Var.b(false);
                g5Var.e.b((org.telegram.ui.h5) obj);
                break;
            case 5:
                ((a7) obj2).e.v0((org.telegram.ui.Cells.z1) obj);
                break;
            case 6:
                h7 h7Var = (h7) obj2;
                p7 p7Var = (p7) obj;
                l7 l7Var = h7Var.d.w;
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
                if (arrayList.size() != 1) {
                    boolean z10 = i9Var.e;
                    HashSet hashSet = new HashSet();
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList.get(i16);
                        i16++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) i9Var.c.get(0)).id;
                    c2 c2Var3 = new c2(m9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = m9Var.getMessagesController().conferenceCallSizeLimit;
                    c2Var3.setOnCancelListener(new r8(m9Var, m9Var.getConnectionsManager().sendRequest(getgroupcall, new q8(m9Var, c2Var3, hashSet, tL_inputGroupCallInviteMessage, z10, 1)), i13));
                    c2Var3.r(600L);
                    break;
                } else {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = m9Var.getMessagesController().getUserFull(user.id);
                    m9Var.P = user;
                    boolean z11 = i9Var.e;
                    org.telegram.ui.Components.voip.d2.m(user, z11, z11 || (userFull != null && userFull.video_calls_available), m9Var.getParentActivity(), null, m9Var.getAccountInstance());
                    break;
                }
            case 8:
                ie ieVar = (ie) obj2;
                u91 u91Var = (u91) obj;
                ei.d dVar2 = ieVar.K0;
                if (view.isEnabled() && !dVar2.Q) {
                    zd zdVar = ieVar.Q0;
                    if (zdVar == null || !zdVar.Q) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        sd sdVar = new sd(ieVar, twoStepVerificationActivity, i14);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.b0 = sdVar;
                        dVar2.setLoading(true);
                        twoStepVerificationActivity.s0(new td(ieVar, u91Var, twoStepVerificationActivity, i14));
                        break;
                    }
                }
                break;
            case 9:
                pf.d.r((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                break;
            case 10:
                sn snVar = (sn) obj2;
                if (snVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    snVar.T7();
                    UndoView undoView = snVar.K3;
                    if (undoView != null) {
                        long j10 = snVar.f6;
                        int i17 = UndoView.i0;
                        undoView.j(83, j10, new org.telegram.ui.m4(snVar, 1));
                    }
                }
                snVar.D7(true);
                break;
            case 11:
                sn.b1((sn) obj2, (String) obj);
                break;
            case 12:
                sn.W0((sn) obj2, (j80) obj);
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) obj2;
                boolean z12 = !z1Var2.b();
                z1Var2.c(z12, true);
                ((AtomicBoolean) obj).set(z12);
                break;
            case 14:
                sn.j1((sn) obj2, (Context) obj);
                break;
            case 15:
                ko koVar = (ko) obj2;
                Context context = (Context) obj;
                b3 b3Var = new b3(context, null);
                h3 h3Var = b3Var.a;
                h3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, k6.n5, 23, 15, false, null);
                l4Var.setHeight(47);
                l4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(l4Var);
                LinearLayout e10 = sl.e(context, 1);
                linearLayout.addView(e10, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i18 = 0;
                while (i18 < i12) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i18] = j6Var;
                    j6Var.setTag(Integer.valueOf(i18));
                    r6.S(j6VarArr[i18], k6.M0(false), r62, r6.O(k6.i6), r62);
                    if (i18 == 0) {
                        j6VarArr[i18].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !koVar.I0);
                    } else if (ChatObject.isChannel(koVar.w0)) {
                        j6VarArr[i18].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, koVar.I0);
                    } else {
                        j6VarArr[i18].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, koVar.I0);
                    }
                    e10.addView(j6VarArr[i18], w7.z5.n(-1, -2));
                    j6VarArr[i18].setOnClickListener(new org.telegram.ui.z(koVar, j6VarArr, b3Var, 8));
                    i18++;
                    i12 = 2;
                    r62 = 0;
                }
                b3Var.b(linearLayout);
                koVar.showDialog(h3Var);
                break;
            case 16:
                ko.U((ko) obj2, (FrameLayout) obj, view);
                break;
            case 17:
                dq.V((dq) obj2, (b3) obj, view);
                break;
            case 18:
                new sg.y0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (g6) obj).show();
                break;
            case 19:
                org.telegram.ui.Components.y.Q((org.telegram.ui.Components.y) obj2, (g6) obj);
                break;
            case 20:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                break;
            case 21:
                u0 u0Var = (u0) obj2;
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) obj;
                u0Var.M(null, null);
                u0Var.G(c5Var.d, false);
                u0Var.setupPopupRadialSelectors(c5Var.f);
                u0Var.B(c5Var.e);
                break;
            case 22:
                boolean[] zArr = (boolean[]) obj2;
                boolean z13 = !zArr[0];
                zArr[0] = z13;
                ((org.telegram.ui.Cells.z1) view).c(z13, true);
                ((x9) obj).run();
                break;
            case 23:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.N0.run();
                ((bu) obj).onClick(null, intValue);
                break;
            case 24:
                runnable = ((b3) obj2).a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                break;
            case 25:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 26:
                k8.D((k8) obj2, (float[]) obj);
                break;
            case 27:
                k8 k8Var = (k8) obj2;
                k8Var.getClass();
                ((j80) obj).u();
                k8Var.A0(6);
                break;
            case 28:
                na0 na0Var = (na0) obj;
                k8 k8Var2 = ((b8) obj2).F;
                i10 = k8Var2.currentAccount;
                LaunchActivity launchActivity = k8Var2.F0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(na0Var.getText().toString())) {
                    String charSequence = na0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof ey) {
                        ey eyVar = (ey) launchActivity.O().getLastFragment();
                        int totalDialogsCount = eyVar.getMessagesController().getTotalDialogsCount();
                        if (!eyVar.l2 && (totalDialogsCount > 10 || eyVar.K)) {
                            if (eyVar.j2) {
                                eyVar.X.r.setText(charSequence);
                                eyVar.X.r.setSelection(charSequence.length());
                                nx nxVar = eyVar.C0;
                                if (nxVar != null && (L = nxVar.L(3)) >= 0 && eyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    eyVar.C0.getTabsView().d(L, L);
                                }
                            } else {
                                eyVar.x = 3;
                                eyVar.X.r.setText(charSequence);
                                eyVar.X.r.setSelection(charSequence.length());
                            }
                            k8Var2.dismiss();
                            break;
                        }
                    }
                    ey eyVar2 = new ey(null);
                    eyVar2.n2 = charSequence;
                    eyVar2.x = 3;
                    launchActivity.v0(eyVar2, false, false);
                    k8Var2.dismiss();
                    break;
                }
                break;
            default:
                e9 e9Var = (e9) obj2;
                ((boolean[]) obj)[0] = true;
                e9Var.J.C1(e9Var.Y);
                e9Var.S.dismiss();
                break;
        }
    }
}
