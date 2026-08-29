package nh;

import android.app.Activity;
import android.content.ClipboardManager;
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
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d70;
import org.telegram.ui.de;
import org.telegram.ui.dq;
import org.telegram.ui.ko;
import org.telegram.ui.nd;
import org.telegram.ui.od;
import org.telegram.ui.t91;
import org.telegram.ui.tn;
import org.telegram.ui.ud;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r7(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence charSequence;
        String str;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                y7 y7Var = (y7) obj2;
                b6 b6Var = (b6) obj;
                org.telegram.ui.Cells.g3 g3Var = y7Var.U;
                try {
                    charSequence = ((ClipboardManager) y7Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(y7Var.getContext());
                } catch (Exception e10) {
                    FileLog.e(e10);
                    charSequence = null;
                }
                if (charSequence != null) {
                    g3Var.b.setText(charSequence.toString());
                    org.telegram.ui.Cells.e3 e3Var = g3Var.b;
                    e3Var.setSelection(0, e3Var.getText().length());
                }
                b6Var.run();
                break;
            case 1:
                gb gbVar = (gb) obj2;
                new h8((Context) obj, gbVar.c, true, gbVar.t0, new h9(gbVar, 20), gbVar.a).show();
                break;
            case 2:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                break;
            case 3:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                break;
            case 4:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = w0Var.c0.indexOf(v0Var.getFilter());
                if (w0Var.d0 != indexOf) {
                    w0Var.d0 = indexOf;
                    w0Var.y();
                    break;
                } else if (v0Var.getFilter().h) {
                    if (v0Var.a.f) {
                        rf.f0 filter = v0Var.getFilter();
                        w0Var.C(filter);
                        org.telegram.ui.ActionBar.e5 e5Var = w0Var.D;
                        if (e5Var != null) {
                            e5Var.o(filter);
                            w0Var.D.q(w0Var.e);
                            break;
                        }
                    } else {
                        v0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.ActionBar.w0 w0Var2 = (org.telegram.ui.ActionBar.w0) obj;
                org.telegram.ui.ActionBar.o1 o1Var = w0Var2.d;
                if (o1Var != null && o1Var.isShowing() && u0Var.f) {
                    if (!w0Var2.P) {
                        w0Var2.P = true;
                        w0Var2.d.d(w0Var2.N);
                    }
                }
                org.telegram.ui.ActionBar.a0 a0Var = w0Var2.c;
                if (a0Var != null) {
                    a0Var.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    org.telegram.ui.ActionBar.s0 s0Var = w0Var2.L;
                    if (s0Var != null) {
                        s0Var.i(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).a) {
                    org.telegram.ui.ActionBar.b2 b2Var = c2Var.i0;
                    if (b2Var != null) {
                        b2Var.g(c2Var, -1);
                    }
                    if (c2Var.d0) {
                        c2Var.dismiss();
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).a) {
                    org.telegram.ui.ActionBar.b2 b2Var2 = c2Var2.k0;
                    if (b2Var2 != null) {
                        b2Var2.g(c2Var2, -2);
                    }
                    if (c2Var2.d0) {
                        c2Var2.cancel();
                        break;
                    }
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).a) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = c2Var3.o0;
                    if (b2Var3 != null) {
                        b2Var3.g(c2Var3, -2);
                    }
                    if (c2Var3.d0) {
                        c2Var3.dismiss();
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.c2 c2Var4 = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).a) {
                    th.w3 w3Var = c2Var4.m0;
                    if (w3Var != null) {
                        w3Var.g(c2Var4, -2);
                    }
                    if (c2Var4.d0) {
                        c2Var4.cancel();
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.z3 z3Var = m4Var.G;
                if (!m4Var.d0.w0) {
                    org.telegram.ui.q3 q3Var = m4Var.q0[0];
                    if (!q3Var.f()) {
                        if (z3Var != null) {
                            qv0 qv0Var = new qv0(activity);
                            qv0Var.a = 1;
                            qv0Var.s = -AndroidUtilities.dp(32.0f);
                            q3Var.d.w0(qv0Var);
                            break;
                        } else {
                            q3Var.b.x0(0);
                            break;
                        }
                    } else if (q3Var.getWebView() != null && !m4Var.d0.S) {
                        if (m4Var.e0 != null) {
                            org.telegram.ui.web.w0 webView = q3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String s10 = org.telegram.ui.web.z0.s(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.l lVar = m4Var.e0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = LocaleController.getString(R.string.WebEmpty);
                            }
                            String str2 = TextUtils.isEmpty(s10) ? "about:blank" : s10;
                            org.telegram.ui.a0 a0Var2 = new org.telegram.ui.a0(m4Var, s10, i11);
                            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(m4Var, q3Var, activity, i11);
                            org.telegram.ui.t tVar = new org.telegram.ui.t(m4Var, i12);
                            org.telegram.ui.t tVar2 = new org.telegram.ui.t(m4Var, 2);
                            org.telegram.ui.c0 c0Var = new org.telegram.ui.c0(m4Var, s10, q3Var, i11);
                            org.telegram.ui.web.d dVar = lVar.w;
                            ImageView imageView = lVar.f;
                            if (favicon == null) {
                                imageView.setImageResource(R.drawable.msg_language);
                                imageView.setColorFilter(new PorterDuffColorFilter(lVar.D, PorterDuff.Mode.SRC_IN));
                            } else {
                                imageView.setImageDrawable(new BitmapDrawable(lVar.getContext().getResources(), favicon));
                                imageView.setColorFilter((ColorFilter) null);
                            }
                            TextView textView = lVar.r;
                            textView.setText(Emoji.replaceEmoji(title, textView.getPaint().getFontMetricsInt(), false));
                            try {
                                try {
                                    Uri parse = Uri.parse(str2);
                                    str2 = ye.d.v(parse, null, null, ye.d.a(parse.getHost()), null);
                                } catch (Exception e11) {
                                    FileLog.e((Throwable) e11, false);
                                }
                                str = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e12) {
                                FileLog.e(e12);
                                str = str2;
                            }
                            TextView textView2 = lVar.s;
                            textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                            lVar.H = b0Var;
                            lVar.I = tVar;
                            lVar.J = tVar2;
                            lVar.e.setOnClickListener(new org.telegram.ui.web.c(0, lVar, a0Var2));
                            lVar.n.setOnClickListener(c0Var);
                            lVar.b = false;
                            lVar.setInput(null);
                            dVar.U2.N(true);
                            dVar.u0(0);
                        }
                        org.telegram.ui.o0 o0Var = m4Var.d0;
                        ih.b1 b1Var = new ih.b1(22, q3Var, activity);
                        jh.m mVar = o0Var.U;
                        mVar.setText("");
                        mVar.setSelection(0, mVar.getText().length());
                        mVar.setScrollX(0);
                        o0Var.r0 = b1Var;
                        o0Var.k(true);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.g1 g1Var = (org.telegram.ui.g1) obj2;
                d70 d70Var = (d70) obj;
                if (g1Var.f == 0) {
                    g1Var.a(1, true);
                    int i13 = ((org.telegram.ui.m4) d70Var).T;
                    TLRPC.Chat chat = d70Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i13).sendRequestTyped(tL_channels_joinChannel, new jh.i0(g1Var, i13, tL_channels_joinChannel, chat));
                    break;
                }
                break;
            case 12:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) obj2;
                c5Var.b(false);
                c5Var.e.c((org.telegram.ui.d5) obj);
                break;
            case 13:
                ((org.telegram.ui.v6) obj2).e.u0((org.telegram.ui.Cells.y1) obj);
                break;
            case 14:
                org.telegram.ui.c7 c7Var = (org.telegram.ui.c7) obj2;
                org.telegram.ui.k7 k7Var = (org.telegram.ui.k7) obj;
                org.telegram.ui.g7 g7Var = c7Var.d.v;
                if (g7Var != null) {
                    g7Var.O0(k7Var.c, k7Var.d, true);
                }
                org.telegram.ui.ActionBar.o1 o1Var2 = c7Var.a;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.h9 h9Var = (org.telegram.ui.h9) obj2;
                org.telegram.ui.d9 d9Var = (org.telegram.ui.d9) obj;
                ArrayList arrayList = d9Var.b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = h9Var.getMessagesController().getUserFull(user.id);
                    h9Var.L = user;
                    boolean z10 = d9Var.e;
                    org.telegram.ui.Components.voip.h2.n(user, z10, z10 || (userFull != null && userFull.video_calls_available), h9Var.getParentActivity(), null, h9Var.getAccountInstance());
                    break;
                } else {
                    boolean z11 = d9Var.e;
                    HashSet hashSet = new HashSet();
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList.get(i14);
                        i14++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) d9Var.c.get(0)).id;
                    org.telegram.ui.ActionBar.c2 c2Var5 = new org.telegram.ui.ActionBar.c2(h9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = h9Var.getMessagesController().conferenceCallSizeLimit;
                    c2Var5.setOnCancelListener(new org.telegram.ui.n8(h9Var, h9Var.getConnectionsManager().sendRequest(getgroupcall, new org.telegram.ui.m8(h9Var, c2Var5, hashSet, tL_inputGroupCallInviteMessage, z11, 1)), i12));
                    c2Var5.q(600L);
                    break;
                }
            case 16:
                de deVar = (de) obj2;
                t91 t91Var = (t91) obj;
                d dVar2 = deVar.G0;
                if (view.isEnabled() && !dVar2.J) {
                    ud udVar = deVar.M0;
                    if (udVar == null || !udVar.J) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        nd ndVar = new nd(deVar, twoStepVerificationActivity, i11);
                        twoStepVerificationActivity.V = 1;
                        twoStepVerificationActivity.X = ndVar;
                        dVar2.setLoading(true);
                        twoStepVerificationActivity.s0(new od(deVar, t91Var, twoStepVerificationActivity, i11));
                        break;
                    }
                }
                break;
            case 17:
                ye.d.s((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                break;
            case 18:
                tn tnVar = (tn) obj2;
                if (tnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    tnVar.Q7();
                    UndoView undoView = tnVar.u3;
                    if (undoView != null) {
                        long j10 = tnVar.P5;
                        int i15 = UndoView.a0;
                        undoView.j(83, j10, new e5.b(tnVar, 1));
                    }
                }
                tnVar.A7(true);
                break;
            case 19:
                tn.I0((tn) obj2, (String) obj);
                break;
            case 20:
                tn.y1((tn) obj2, (j70) obj);
                break;
            case 21:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) obj2;
                boolean z12 = !y1Var.b();
                y1Var.c(z12, true);
                ((AtomicBoolean) obj).set(z12);
                break;
            case 22:
                tn.z1((tn) obj2, (Context) obj);
                break;
            case 23:
                ko koVar = (ko) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context, org.telegram.ui.ActionBar.g6.n5, 23, 15, false, null);
                k4Var.setHeight(47);
                k4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(k4Var);
                LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
                linearLayout.addView(g10, i7.f6.n(-1, -2));
                org.telegram.ui.Cells.g6[] g6VarArr = new org.telegram.ui.Cells.g6[2];
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, true);
                    g6VarArr[i16] = g6Var;
                    g6Var.setTag(Integer.valueOf(i16));
                    g6VarArr[i16].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                    if (i16 == 0) {
                        g6VarArr[i16].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !koVar.F0);
                    } else if (ChatObject.isChannel(koVar.t0)) {
                        g6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, koVar.F0);
                    } else {
                        g6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, koVar.F0);
                    }
                    g10.addView(g6VarArr[i16], i7.f6.n(-1, -2));
                    g6VarArr[i16].setOnClickListener(new org.telegram.ui.c0(koVar, g6VarArr, a3Var, 8));
                    i16++;
                }
                a3Var.b(linearLayout);
                koVar.showDialog(f3Var);
                break;
            case 24:
                ko.U((ko) obj2, (FrameLayout) obj, view);
                break;
            case 25:
                dq.V((dq) obj2, (org.telegram.ui.ActionBar.a3) obj, view);
                break;
            case 26:
                new cg.p1(((org.telegram.ui.Components.g0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.c6) obj).show();
                break;
            case 27:
                org.telegram.ui.Components.a0.Q((org.telegram.ui.Components.a0) obj2, (org.telegram.ui.ActionBar.c6) obj);
                break;
            case 28:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                break;
            default:
                org.telegram.ui.ActionBar.w0 w0Var3 = (org.telegram.ui.ActionBar.w0) obj2;
                org.telegram.ui.Components.a5 a5Var = (org.telegram.ui.Components.a5) obj;
                w0Var3.M(null, null);
                w0Var3.G(a5Var.d, false);
                w0Var3.setupPopupRadialSelectors(a5Var.f);
                w0Var3.B(a5Var.e);
                break;
        }
    }
}
