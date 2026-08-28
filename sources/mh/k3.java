package mh;

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
import g7.e6;
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
import org.telegram.messenger.ll;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.w4;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a70;
import org.telegram.ui.b5;
import org.telegram.ui.bq;
import org.telegram.ui.c5;
import org.telegram.ui.d7;
import org.telegram.ui.e9;
import org.telegram.ui.fe;
import org.telegram.ui.h7;
import org.telegram.ui.ho;
import org.telegram.ui.i9;
import org.telegram.ui.l7;
import org.telegram.ui.n8;
import org.telegram.ui.o8;
import org.telegram.ui.od;
import org.telegram.ui.pd;
import org.telegram.ui.qn;
import org.telegram.ui.s91;
import org.telegram.ui.v80;
import org.telegram.ui.w6;
import org.telegram.ui.wd;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k3(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i9;
        String str;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.f3) obj2).dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    break;
                }
                break;
            case 1:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                break;
            case 2:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                break;
            case 3:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = w0Var.c0.indexOf(v0Var.getFilter());
                if (w0Var.d0 != indexOf) {
                    w0Var.d0 = indexOf;
                    w0Var.y();
                    break;
                } else if (v0Var.getFilter().h) {
                    if (v0Var.a.f) {
                        of.m0 filter = v0Var.getFilter();
                        w0Var.C(filter);
                        e5 e5Var = w0Var.D;
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
            case 4:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.ActionBar.w0 w0Var2 = (org.telegram.ui.ActionBar.w0) obj;
                org.telegram.ui.ActionBar.o1 o1Var = w0Var2.d;
                if (o1Var != null && o1Var.isShowing() && u0Var.f) {
                    if (!w0Var2.P) {
                        w0Var2.P = true;
                        w0Var2.d.d(w0Var2.N);
                    }
                }
                org.telegram.ui.ActionBar.z zVar = w0Var2.c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    org.telegram.ui.ActionBar.s0 s0Var = w0Var2.L;
                    if (s0Var != null) {
                        s0Var.i(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).a) {
                    org.telegram.ui.ActionBar.b2 b2Var = c2Var.i0;
                    if (b2Var != null) {
                        b2Var.f(c2Var, -1);
                    }
                    if (c2Var.d0) {
                        c2Var.dismiss();
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).a) {
                    org.telegram.ui.ActionBar.b2 b2Var2 = c2Var2.k0;
                    if (b2Var2 != null) {
                        b2Var2.f(c2Var2, -2);
                    }
                    if (c2Var2.d0) {
                        c2Var2.cancel();
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).a) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = c2Var3.o0;
                    if (b2Var3 != null) {
                        b2Var3.f(c2Var3, -2);
                    }
                    if (c2Var3.d0) {
                        c2Var3.dismiss();
                        break;
                    }
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.c2 c2Var4 = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).a) {
                    qh.v3 v3Var = c2Var4.m0;
                    if (v3Var != null) {
                        v3Var.f(c2Var4, -2);
                    }
                    if (c2Var4.d0) {
                        c2Var4.cancel();
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.y3 y3Var = l4Var.G;
                if (!l4Var.d0.w0) {
                    org.telegram.ui.p3 p3Var = l4Var.q0[0];
                    if (!p3Var.f()) {
                        if (y3Var != null) {
                            gv0 gv0Var = new gv0(activity);
                            gv0Var.a = 1;
                            gv0Var.s = -AndroidUtilities.dp(32.0f);
                            p3Var.d.w0(gv0Var);
                            break;
                        } else {
                            p3Var.b.x0(0);
                            break;
                        }
                    } else if (p3Var.getWebView() != null && !l4Var.d0.S) {
                        if (l4Var.e0 != null) {
                            org.telegram.ui.web.v0 webView = p3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String s10 = org.telegram.ui.web.y0.s(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.k kVar = l4Var.e0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = LocaleController.getString(R.string.WebEmpty);
                            }
                            String str2 = TextUtils.isEmpty(s10) ? "about:blank" : s10;
                            org.telegram.ui.z zVar2 = new org.telegram.ui.z(l4Var, s10, i11);
                            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(l4Var, p3Var, activity, i11);
                            org.telegram.ui.r rVar = new org.telegram.ui.r(l4Var, i12);
                            org.telegram.ui.r rVar2 = new org.telegram.ui.r(l4Var, 2);
                            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(l4Var, s10, p3Var, i11);
                            org.telegram.ui.web.c cVar = kVar.w;
                            ImageView imageView = kVar.f;
                            if (favicon == null) {
                                imageView.setImageResource(R.drawable.msg_language);
                                imageView.setColorFilter(new PorterDuffColorFilter(kVar.D, PorterDuff.Mode.SRC_IN));
                            } else {
                                imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), favicon));
                                imageView.setColorFilter((ColorFilter) null);
                            }
                            TextView textView = kVar.r;
                            textView.setText(Emoji.replaceEmoji(title, textView.getPaint().getFontMetricsInt(), false));
                            try {
                                try {
                                    Uri parse = Uri.parse(str2);
                                    str2 = ve.e.v(parse, null, null, ve.e.a(parse.getHost()), null);
                                } catch (Exception e10) {
                                    FileLog.e((Throwable) e10, false);
                                }
                                str = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e11) {
                                FileLog.e(e11);
                                str = str2;
                            }
                            TextView textView2 = kVar.s;
                            i9 = 0;
                            textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                            kVar.H = a0Var;
                            kVar.I = rVar;
                            kVar.J = rVar2;
                            kVar.e.setOnClickListener(new v80(29, kVar, zVar2));
                            kVar.n.setOnClickListener(b0Var);
                            kVar.b = false;
                            kVar.setInput(null);
                            cVar.U2.N(true);
                            cVar.u0(0);
                        } else {
                            i9 = 0;
                        }
                        org.telegram.ui.n0 n0Var = l4Var.d0;
                        fh.f1 f1Var = new fh.f1(29, p3Var, activity);
                        gh.o oVar = n0Var.U;
                        oVar.setText("");
                        oVar.setSelection(i9, oVar.getText().length());
                        oVar.setScrollX(i9);
                        n0Var.r0 = f1Var;
                        n0Var.k(true);
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.f1 f1Var2 = (org.telegram.ui.f1) obj2;
                a70 a70Var = (a70) obj;
                if (f1Var2.f == 0) {
                    f1Var2.a(1, true);
                    int i13 = ((org.telegram.ui.l4) a70Var).T;
                    TLRPC.Chat chat = a70Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i13).sendRequestTyped(tL_channels_joinChannel, new gh.j0(f1Var2, i13, tL_channels_joinChannel, chat));
                    break;
                }
                break;
            case 11:
                b5 b5Var = (b5) obj2;
                b5Var.b(false);
                b5Var.e.b((c5) obj);
                break;
            case 12:
                ((w6) obj2).e.t0((org.telegram.ui.Cells.z1) obj);
                break;
            case 13:
                d7 d7Var = (d7) obj2;
                l7 l7Var = (l7) obj;
                h7 h7Var = d7Var.d.v;
                if (h7Var != null) {
                    h7Var.o1(l7Var.c, l7Var.d, true);
                }
                org.telegram.ui.ActionBar.o1 o1Var2 = d7Var.a;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                    break;
                }
                break;
            case 14:
                i9 i9Var = (i9) obj2;
                e9 e9Var = (e9) obj;
                ArrayList arrayList = e9Var.b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = i9Var.getMessagesController().getUserFull(user.id);
                    i9Var.L = user;
                    boolean z10 = e9Var.e;
                    org.telegram.ui.Components.voip.e2.n(user, z10, z10 || (userFull != null && userFull.video_calls_available), i9Var.getParentActivity(), null, i9Var.getAccountInstance());
                    break;
                } else {
                    boolean z11 = e9Var.e;
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
                    org.telegram.ui.ActionBar.c2 c2Var5 = new org.telegram.ui.ActionBar.c2(i9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = i9Var.getMessagesController().conferenceCallSizeLimit;
                    c2Var5.setOnCancelListener(new o8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(i9Var, c2Var5, hashSet, tL_inputGroupCallInviteMessage, z11, 1)), i12));
                    c2Var5.q(600L);
                    break;
                }
            case 15:
                fe feVar = (fe) obj2;
                s91 s91Var = (s91) obj;
                kh.d dVar = feVar.G0;
                if (view.isEnabled() && !dVar.J) {
                    wd wdVar = feVar.M0;
                    if (wdVar == null || !wdVar.J) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        od odVar = new od(feVar, twoStepVerificationActivity, i11);
                        twoStepVerificationActivity.V = 1;
                        twoStepVerificationActivity.X = odVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.r0(new pd(feVar, s91Var, twoStepVerificationActivity, i11));
                        break;
                    }
                }
                break;
            case 16:
                ve.e.s((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                break;
            case 17:
                qn qnVar = (qn) obj2;
                if (qnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    qnVar.Q7();
                    UndoView undoView = qnVar.u3;
                    if (undoView != null) {
                        long j10 = qnVar.P5;
                        int i15 = UndoView.a0;
                        undoView.j(83, j10, new c5.b(qnVar, 1));
                    }
                }
                qnVar.A7(true);
                break;
            case 18:
                qn.H0((qn) obj2, (String) obj);
                break;
            case 19:
                qn.y1((qn) obj2, (x60) obj);
                break;
            case 20:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) obj2;
                boolean z12 = !z1Var.b();
                z1Var.c(z12, true);
                ((AtomicBoolean) obj).set(z12);
                break;
            case 21:
                qn.z1((qn) obj2, (Context) obj);
                break;
            case 22:
                ho hoVar = (ho) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, f6.n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout f10 = ll.f(context, 1);
                linearLayout.addView(f10, e6.n(-1, -2));
                i6[] i6VarArr = new i6[2];
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    i6 i6Var = new i6(context, true);
                    i6VarArr[i16] = i6Var;
                    i6Var.setTag(Integer.valueOf(i16));
                    i6VarArr[i16].setBackgroundDrawable(f6.K0(false));
                    if (i16 == 0) {
                        i6VarArr[i16].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !hoVar.F0);
                    } else if (ChatObject.isChannel(hoVar.t0)) {
                        i6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, hoVar.F0);
                    } else {
                        i6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, hoVar.F0);
                    }
                    f10.addView(i6VarArr[i16], e6.n(-1, -2));
                    i6VarArr[i16].setOnClickListener(new org.telegram.ui.b0(hoVar, i6VarArr, a3Var, 8));
                    i16++;
                }
                a3Var.b(linearLayout);
                hoVar.showDialog(f3Var);
                break;
            case 23:
                ho.T((ho) obj2, (FrameLayout) obj, view);
                break;
            case 24:
                bq.U((bq) obj2, (org.telegram.ui.ActionBar.a3) obj, view);
                break;
            case 25:
                new zf.x0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (b6) obj).show();
                break;
            case 26:
                org.telegram.ui.Components.y.P((org.telegram.ui.Components.y) obj2, (b6) obj);
                break;
            case 27:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                break;
            case 28:
                org.telegram.ui.ActionBar.w0 w0Var3 = (org.telegram.ui.ActionBar.w0) obj2;
                w4 w4Var = (w4) obj;
                w0Var3.M(null, null);
                w0Var3.G(w4Var.d, false);
                w0Var3.setupPopupRadialSelectors(w4Var.f);
                w0Var3.B(w4Var.e);
                break;
            default:
                boolean[] zArr = (boolean[]) obj2;
                boolean z13 = !zArr[0];
                zArr[0] = z13;
                ((org.telegram.ui.Cells.z1) view).c(z13, true);
                ((bg.d) obj).run();
                break;
        }
    }
}
