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
import dg.t0;
import fg.n1;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.c6;
import mh.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s0;
import org.telegram.ui.ActionBar.u0;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.f0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.voip.g2;
import org.telegram.ui.Components.x4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a0;
import org.telegram.ui.b0;
import org.telegram.ui.be;
import org.telegram.ui.e1;
import org.telegram.ui.e5;
import org.telegram.ui.f5;
import org.telegram.ui.g7;
import org.telegram.ui.h9;
import org.telegram.ui.ha1;
import org.telegram.ui.hb0;
import org.telegram.ui.k7;
import org.telegram.ui.ke;
import org.telegram.ui.kq;
import org.telegram.ui.l4;
import org.telegram.ui.l9;
import org.telegram.ui.lu;
import org.telegram.ui.m0;
import org.telegram.ui.n4;
import org.telegram.ui.o7;
import org.telegram.ui.o70;
import org.telegram.ui.p3;
import org.telegram.ui.po;
import org.telegram.ui.q8;
import org.telegram.ui.r8;
import org.telegram.ui.t;
import org.telegram.ui.td;
import org.telegram.ui.ud;
import org.telegram.ui.web.a1;
import org.telegram.ui.web.x0;
import org.telegram.ui.xn;
import org.telegram.ui.z6;
import uf.e0;
import wh.y3;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                break;
            case 1:
                w0 w0Var = (w0) obj2;
                v0 v0Var = (v0) obj;
                int indexOf = w0Var.d0.indexOf(v0Var.getFilter());
                if (w0Var.e0 != indexOf) {
                    w0Var.e0 = indexOf;
                    w0Var.y();
                    break;
                } else if (v0Var.getFilter().h) {
                    if (v0Var.a.f) {
                        e0 filter = v0Var.getFilter();
                        w0Var.C(filter);
                        i5 i5Var = w0Var.E;
                        if (i5Var != null) {
                            i5Var.o(filter);
                            w0Var.E.q(w0Var.e);
                            break;
                        }
                    } else {
                        v0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 2:
                u0 u0Var = (u0) obj2;
                w0 w0Var2 = (w0) obj;
                p1 p1Var = w0Var2.d;
                if (p1Var != null && p1Var.isShowing() && u0Var.f) {
                    if (!w0Var2.Q) {
                        w0Var2.Q = true;
                        w0Var2.d.d(w0Var2.O);
                    }
                }
                z zVar = w0Var2.c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    s0 s0Var = w0Var2.M;
                    if (s0Var != null) {
                        s0Var.h(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                d2 d2Var = (d2) obj2;
                if (!((y1) obj).a) {
                    c2 c2Var = d2Var.j0;
                    if (c2Var != null) {
                        c2Var.j(d2Var, -1);
                    }
                    if (d2Var.e0) {
                        d2Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                d2 d2Var2 = (d2) obj2;
                if (!((y1) obj).a) {
                    c2 c2Var2 = d2Var2.l0;
                    if (c2Var2 != null) {
                        c2Var2.j(d2Var2, -2);
                    }
                    if (d2Var2.e0) {
                        d2Var2.cancel();
                        break;
                    }
                }
                break;
            case 5:
                d2 d2Var3 = (d2) obj2;
                if (!((y1) obj).a) {
                    c2 c2Var3 = d2Var3.p0;
                    if (c2Var3 != null) {
                        c2Var3.j(d2Var3, -2);
                    }
                    if (d2Var3.e0) {
                        d2Var3.dismiss();
                        break;
                    }
                }
                break;
            case 6:
                d2 d2Var4 = (d2) obj2;
                if (!((y1) obj).a) {
                    y3 y3Var = d2Var4.n0;
                    if (y3Var != null) {
                        y3Var.j(d2Var4, -2);
                    }
                    if (d2Var4.e0) {
                        d2Var4.cancel();
                        break;
                    }
                }
                break;
            case 7:
                l4 l4Var = (l4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.y3 y3Var2 = l4Var.H;
                if (!l4Var.e0.x0) {
                    p3 p3Var = l4Var.r0[0];
                    if (!p3Var.f()) {
                        if (y3Var2 != null) {
                            aw0 aw0Var = new aw0(activity);
                            aw0Var.a = 1;
                            aw0Var.s = -AndroidUtilities.dp(32.0f);
                            p3Var.d.w0(aw0Var);
                            break;
                        } else {
                            p3Var.b.x0(0);
                            break;
                        }
                    } else if (p3Var.getWebView() != null && !l4Var.e0.T) {
                        if (l4Var.f0 != null) {
                            x0 webView = p3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String s6 = a1.s(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.k kVar = l4Var.f0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = LocaleController.getString(R.string.WebEmpty);
                            }
                            String str2 = TextUtils.isEmpty(s6) ? "about:blank" : s6;
                            org.telegram.ui.z zVar2 = new org.telegram.ui.z(l4Var, s6, i11);
                            a0 a0Var = new a0(l4Var, p3Var, activity, i11);
                            t tVar = new t(l4Var, i12);
                            t tVar2 = new t(l4Var, 2);
                            b0 b0Var = new b0(l4Var, s6, p3Var, i11);
                            org.telegram.ui.web.c cVar = kVar.w;
                            ImageView imageView = kVar.f;
                            if (favicon == null) {
                                imageView.setImageResource(R.drawable.msg_language);
                                imageView.setColorFilter(new PorterDuffColorFilter(kVar.E, PorterDuff.Mode.SRC_IN));
                            } else {
                                imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), favicon));
                                imageView.setColorFilter((ColorFilter) null);
                            }
                            TextView textView = kVar.r;
                            textView.setText(Emoji.replaceEmoji(title, textView.getPaint().getFontMetricsInt(), false));
                            try {
                                try {
                                    Uri parse = Uri.parse(str2);
                                    str2 = af.g.v(parse, null, null, af.g.a(parse.getHost()), null);
                                } catch (Exception e6) {
                                    FileLog.e((Throwable) e6, false);
                                }
                                str = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                str = str2;
                            }
                            TextView textView2 = kVar.s;
                            textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                            kVar.I = a0Var;
                            kVar.J = tVar;
                            kVar.K = tVar2;
                            kVar.e.setOnClickListener(new hb0(27, kVar, zVar2));
                            kVar.n.setOnClickListener(b0Var);
                            kVar.b = false;
                            kVar.setInput(null);
                            cVar.V2.N(true);
                            cVar.u0(0);
                        }
                        m0 m0Var = l4Var.e0;
                        lh.a1 a1Var = new lh.a1(14, p3Var, activity);
                        mh.m mVar = m0Var.V;
                        mVar.setText("");
                        mVar.setSelection(0, mVar.getText().length());
                        mVar.setScrollX(0);
                        m0Var.s0 = a1Var;
                        m0Var.k(true);
                        break;
                    }
                }
                break;
            case 8:
                e1 e1Var = (e1) obj2;
                o70 o70Var = (o70) obj;
                if (e1Var.f == 0) {
                    e1Var.a(1, true);
                    int i13 = ((l4) o70Var).U;
                    TLRPC.Chat chat = o70Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i13).sendRequestTyped(tL_channels_joinChannel, new h0(e1Var, i13, tL_channels_joinChannel, chat));
                    break;
                }
                break;
            case 9:
                e5 e5Var = (e5) obj2;
                e5Var.b(false);
                e5Var.e.b((f5) obj);
                break;
            case 10:
                ((z6) obj2).e.u0((z1) obj);
                break;
            case 11:
                g7 g7Var = (g7) obj2;
                o7 o7Var = (o7) obj;
                k7 k7Var = g7Var.d.v;
                if (k7Var != null) {
                    k7Var.Y(o7Var.c, o7Var.d, true);
                }
                p1 p1Var2 = g7Var.a;
                if (p1Var2 != null) {
                    p1Var2.d(true);
                    break;
                }
                break;
            case 12:
                l9 l9Var = (l9) obj2;
                h9 h9Var = (h9) obj;
                ArrayList arrayList = h9Var.b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = l9Var.getMessagesController().getUserFull(user.id);
                    l9Var.M = user;
                    boolean z4 = h9Var.e;
                    g2.n(user, z4, z4 || (userFull != null && userFull.video_calls_available), l9Var.getParentActivity(), null, l9Var.getAccountInstance());
                    break;
                } else {
                    boolean z10 = h9Var.e;
                    HashSet hashSet = new HashSet();
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList.get(i14);
                        i14++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) h9Var.c.get(0)).id;
                    d2 d2Var5 = new d2(l9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = l9Var.getMessagesController().conferenceCallSizeLimit;
                    d2Var5.setOnCancelListener(new r8(l9Var, l9Var.getConnectionsManager().sendRequest(getgroupcall, new q8(l9Var, d2Var5, hashSet, tL_inputGroupCallInviteMessage, z10, 1)), i12));
                    d2Var5.q(600L);
                    break;
                }
            case 13:
                ke keVar = (ke) obj2;
                ha1 ha1Var = (ha1) obj;
                qh.d dVar = keVar.H0;
                if (view.isEnabled() && !dVar.K) {
                    be beVar = keVar.N0;
                    if (beVar == null || !beVar.K) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        td tdVar = new td(keVar, twoStepVerificationActivity, i11);
                        twoStepVerificationActivity.W = 1;
                        twoStepVerificationActivity.Y = tdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new ud(keVar, ha1Var, twoStepVerificationActivity, i11));
                        break;
                    }
                }
                break;
            case 14:
                af.g.s((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                break;
            case 15:
                xn xnVar = (xn) obj2;
                if (xnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    xnVar.Q7();
                    UndoView undoView = xnVar.v3;
                    if (undoView != null) {
                        long j10 = xnVar.Q5;
                        int i15 = UndoView.b0;
                        undoView.j(83, j10, new n4(xnVar, 1));
                    }
                }
                xnVar.A7(true);
                break;
            case 16:
                xn.I0((xn) obj2, (String) obj);
                break;
            case 17:
                xn.y1((xn) obj2, (q70) obj);
                break;
            case 18:
                z1 z1Var = (z1) obj2;
                boolean z11 = !z1Var.b();
                z1Var.c(z11, true);
                ((AtomicBoolean) obj).set(z11);
                break;
            case 19:
                xn.z1((xn) obj2, (Context) obj);
                break;
            case 20:
                po poVar = (po) obj2;
                Context context = (Context) obj;
                c3 c3Var = new c3(context, null);
                h3 h3Var = c3Var.a;
                h3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                m4 m4Var = new m4(context, k6.n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
                linearLayout.addView(f10, c6.n(-1, -2));
                i6[] i6VarArr = new i6[2];
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    i6 i6Var = new i6(context, true);
                    i6VarArr[i16] = i6Var;
                    i6Var.setTag(Integer.valueOf(i16));
                    i6VarArr[i16].setBackgroundDrawable(k6.K0(false));
                    if (i16 == 0) {
                        i6VarArr[i16].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !poVar.G0);
                    } else if (ChatObject.isChannel(poVar.u0)) {
                        i6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, poVar.G0);
                    } else {
                        i6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, poVar.G0);
                    }
                    f10.addView(i6VarArr[i16], c6.n(-1, -2));
                    i6VarArr[i16].setOnClickListener(new b0(poVar, i6VarArr, c3Var, 8));
                    i16++;
                }
                c3Var.b(linearLayout);
                poVar.showDialog(h3Var);
                break;
            case 21:
                po.U((po) obj2, (FrameLayout) obj, view);
                break;
            case 22:
                kq.V((kq) obj2, (c3) obj, view);
                break;
            case 23:
                new n1(((f0) obj2).getContext(), 42, (g6) obj).show();
                break;
            case 24:
                org.telegram.ui.Components.z.Q((org.telegram.ui.Components.z) obj2, (g6) obj);
                break;
            case 25:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                break;
            case 26:
                w0 w0Var3 = (w0) obj2;
                x4 x4Var = (x4) obj;
                w0Var3.M(null, null);
                w0Var3.G(x4Var.d, false);
                w0Var3.setupPopupRadialSelectors(x4Var.f);
                w0Var3.B(x4Var.e);
                break;
            case 27:
                boolean[] zArr = (boolean[]) obj2;
                boolean z12 = !zArr[0];
                zArr[0] = z12;
                ((z1) view).c(z12, true);
                ((t0) obj).run();
                break;
            case 28:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.I0.run();
                ((lu) obj).onClick(null, intValue);
                break;
            default:
                ((c3) obj2).a.dismissRunnable.run();
                ((Utilities.Callback) obj).run(null);
                break;
        }
    }
}
