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
import eg.o1;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.b6;
import kh.a1;
import lh.i0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s0;
import org.telegram.ui.ActionBar.u0;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.f0;
import org.telegram.ui.Components.voip.f2;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a0;
import org.telegram.ui.a4;
import org.telegram.ui.b0;
import org.telegram.ui.b7;
import org.telegram.ui.c0;
import org.telegram.ui.de;
import org.telegram.ui.g1;
import org.telegram.ui.g5;
import org.telegram.ui.i7;
import org.telegram.ui.ib0;
import org.telegram.ui.j9;
import org.telegram.ui.lq;
import org.telegram.ui.m7;
import org.telegram.ui.me;
import org.telegram.ui.mu;
import org.telegram.ui.n4;
import org.telegram.ui.n9;
import org.telegram.ui.o0;
import org.telegram.ui.oa1;
import org.telegram.ui.p4;
import org.telegram.ui.p70;
import org.telegram.ui.q7;
import org.telegram.ui.r3;
import org.telegram.ui.ro;
import org.telegram.ui.s8;
import org.telegram.ui.t;
import org.telegram.ui.t8;
import org.telegram.ui.vd;
import org.telegram.ui.wd;
import org.telegram.ui.web.c1;
import org.telegram.ui.web.y0;
import org.telegram.ui.zn;
import tf.e0;
import vh.z3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                        h5 h5Var = w0Var.E;
                        if (h5Var != null) {
                            h5Var.o(filter);
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
                        s0Var.m(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                d2 d2Var = (d2) obj2;
                if (!((y1) obj).a) {
                    c2 c2Var = d2Var.j0;
                    if (c2Var != null) {
                        c2Var.l(d2Var, -1);
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
                        c2Var2.l(d2Var2, -2);
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
                        c2Var3.l(d2Var3, -2);
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
                    z3 z3Var = d2Var4.n0;
                    if (z3Var != null) {
                        z3Var.l(d2Var4, -2);
                    }
                    if (d2Var4.e0) {
                        d2Var4.cancel();
                        break;
                    }
                }
                break;
            case 7:
                n4 n4Var = (n4) obj2;
                Activity activity = (Activity) obj;
                a4 a4Var = n4Var.H;
                if (!n4Var.e0.x0) {
                    r3 r3Var = n4Var.r0[0];
                    if (!r3Var.f()) {
                        if (a4Var != null) {
                            zv0 zv0Var = new zv0(activity);
                            zv0Var.a = 1;
                            zv0Var.s = -AndroidUtilities.dp(32.0f);
                            r3Var.d.w0(zv0Var);
                            break;
                        } else {
                            r3Var.b.x0(0);
                            break;
                        }
                    } else if (r3Var.getWebView() != null && !n4Var.e0.T) {
                        if (n4Var.f0 != null) {
                            y0 webView = r3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String v = c1.v(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.k kVar = n4Var.f0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = LocaleController.getString(R.string.WebEmpty);
                            }
                            String str2 = TextUtils.isEmpty(v) ? "about:blank" : v;
                            a0 a0Var = new a0(n4Var, v, i11);
                            b0 b0Var = new b0(n4Var, r3Var, activity, i11);
                            t tVar = new t(n4Var, i12);
                            t tVar2 = new t(n4Var, 2);
                            c0 c0Var = new c0(n4Var, v, r3Var, i11);
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
                                    str2 = ze.d.v(parse, null, null, ze.d.a(parse.getHost()), null);
                                } catch (Exception e) {
                                    FileLog.e((Throwable) e, false);
                                }
                                str = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e6) {
                                FileLog.e(e6);
                                str = str2;
                            }
                            TextView textView2 = kVar.s;
                            textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                            kVar.I = b0Var;
                            kVar.J = tVar;
                            kVar.K = tVar2;
                            kVar.e.setOnClickListener(new ib0(27, kVar, a0Var));
                            kVar.n.setOnClickListener(c0Var);
                            kVar.b = false;
                            kVar.setInput(null);
                            cVar.V2.N(true);
                            cVar.u0(0);
                        }
                        o0 o0Var = n4Var.e0;
                        a1 a1Var = new a1(14, r3Var, activity);
                        lh.n nVar = o0Var.V;
                        nVar.setText("");
                        nVar.setSelection(0, nVar.getText().length());
                        nVar.setScrollX(0);
                        o0Var.s0 = a1Var;
                        o0Var.k(true);
                        break;
                    }
                }
                break;
            case 8:
                g1 g1Var = (g1) obj2;
                p70 p70Var = (p70) obj;
                if (g1Var.f == 0) {
                    g1Var.a(1, true);
                    int i13 = ((n4) p70Var).U;
                    TLRPC.Chat chat = p70Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i13).sendRequestTyped(tL_channels_joinChannel, new i0(g1Var, i13, tL_channels_joinChannel, chat));
                    break;
                }
                break;
            case 9:
                g5 g5Var = (g5) obj2;
                g5Var.b(false);
                g5Var.e.b((org.telegram.ui.h5) obj);
                break;
            case 10:
                ((b7) obj2).e.u0((org.telegram.ui.Cells.y1) obj);
                break;
            case 11:
                i7 i7Var = (i7) obj2;
                q7 q7Var = (q7) obj;
                m7 m7Var = i7Var.d.v;
                if (m7Var != null) {
                    m7Var.r(q7Var.c, q7Var.d, true);
                }
                p1 p1Var2 = i7Var.a;
                if (p1Var2 != null) {
                    p1Var2.d(true);
                    break;
                }
                break;
            case 12:
                n9 n9Var = (n9) obj2;
                j9 j9Var = (j9) obj;
                ArrayList arrayList = j9Var.b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = n9Var.getMessagesController().getUserFull(user.id);
                    n9Var.M = user;
                    boolean z4 = j9Var.e;
                    f2.m(user, z4, z4 || (userFull != null && userFull.video_calls_available), n9Var.getParentActivity(), null, n9Var.getAccountInstance());
                    break;
                } else {
                    boolean z10 = j9Var.e;
                    HashSet hashSet = new HashSet();
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList.get(i14);
                        i14++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) j9Var.c.get(0)).id;
                    d2 d2Var5 = new d2(n9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = n9Var.getMessagesController().conferenceCallSizeLimit;
                    d2Var5.setOnCancelListener(new t8(n9Var, n9Var.getConnectionsManager().sendRequest(getgroupcall, new s8(n9Var, d2Var5, hashSet, tL_inputGroupCallInviteMessage, z10, 1)), i12));
                    d2Var5.q(600L);
                    break;
                }
            case 13:
                me meVar = (me) obj2;
                oa1 oa1Var = (oa1) obj;
                ph.d dVar = meVar.H0;
                if (view.isEnabled() && !dVar.K) {
                    de deVar = meVar.N0;
                    if (deVar == null || !deVar.K) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        vd vdVar = new vd(meVar, twoStepVerificationActivity, i11);
                        twoStepVerificationActivity.W = 1;
                        twoStepVerificationActivity.Y = vdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new wd(meVar, oa1Var, twoStepVerificationActivity, i11));
                        break;
                    }
                }
                break;
            case 14:
                ze.d.s((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                break;
            case 15:
                zn znVar = (zn) obj2;
                if (znVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    znVar.Q7();
                    UndoView undoView = znVar.v3;
                    if (undoView != null) {
                        long j10 = znVar.Q5;
                        int i15 = UndoView.b0;
                        undoView.j(83, j10, new p4(znVar, 1));
                    }
                }
                znVar.A7(true);
                break;
            case 16:
                zn.I0((zn) obj2, (String) obj);
                break;
            case 17:
                zn.y1((zn) obj2, (org.telegram.ui.Components.p70) obj);
                break;
            case 18:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) obj2;
                boolean z11 = !y1Var.b();
                y1Var.c(z11, true);
                ((AtomicBoolean) obj).set(z11);
                break;
            case 19:
                zn.z1((zn) obj2, (Context) obj);
                break;
            case 20:
                ro roVar = (ro) obj2;
                Context context = (Context) obj;
                b3 b3Var = new b3(context, null);
                g3 g3Var = b3Var.a;
                g3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                l4 l4Var = new l4(context, j6.n5, 23, 15, false, null);
                l4Var.setHeight(47);
                l4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(l4Var);
                LinearLayout f10 = y3.f(context, 1);
                linearLayout.addView(f10, b6.n(-1, -2));
                h6[] h6VarArr = new h6[2];
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    h6 h6Var = new h6(context, true);
                    h6VarArr[i16] = h6Var;
                    h6Var.setTag(Integer.valueOf(i16));
                    h6VarArr[i16].setBackgroundDrawable(j6.K0(false));
                    if (i16 == 0) {
                        h6VarArr[i16].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !roVar.G0);
                    } else if (ChatObject.isChannel(roVar.u0)) {
                        h6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, roVar.G0);
                    } else {
                        h6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, roVar.G0);
                    }
                    f10.addView(h6VarArr[i16], b6.n(-1, -2));
                    h6VarArr[i16].setOnClickListener(new c0(roVar, h6VarArr, b3Var, 8));
                    i16++;
                }
                b3Var.b(linearLayout);
                roVar.showDialog(g3Var);
                break;
            case 21:
                ro.U((ro) obj2, (FrameLayout) obj, view);
                break;
            case 22:
                lq.V((lq) obj2, (b3) obj, view);
                break;
            case 23:
                new o1(((f0) obj2).getContext(), 42, (f6) obj).show();
                break;
            case 24:
                org.telegram.ui.Components.z.Q((org.telegram.ui.Components.z) obj2, (f6) obj);
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
                ((org.telegram.ui.Cells.y1) view).c(z12, true);
                ((cg.u0) obj).run();
                break;
            case 28:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.I0.run();
                ((mu) obj).onClick(null, intValue);
                break;
            default:
                ((b3) obj2).a.dismissRunnable.run();
                ((Utilities.Callback) obj).run(null);
                break;
        }
    }
}
