package bi;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import di.kc;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bz0;
import org.telegram.ui.fo;
import org.telegram.ui.hb1;
import org.telegram.ui.he;
import org.telegram.ui.qe;
import org.telegram.ui.yd;
import org.telegram.ui.z70;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        j5 j5Var;
        CharSequence charSequence;
        String str;
        String str2;
        String str3;
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                Context context = (Context) this.c;
                if (t1Var != null) {
                    int i10 = t1Var.e;
                    if (i10 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            launchActivity.K0(i10);
                        }
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i10).getStoriesController().u(t1Var.c, t1Var.b);
                        if (u10 == null) {
                            u10 = t1Var.a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().A(i10, context, u10, null);
                            AndroidUtilities.runOnUIThread(new ah.j(3), 200L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                q5 q5Var = (q5) this.b;
                ca caVar = (ca) this.c;
                sb sbVar = q5Var.J0;
                if (caVar.b == null) {
                    sc Q = new zc(q5Var.c1, q5Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    if (caVar.b.longValue() >= 0) {
                        bundle.putLong("user_id", caVar.b.longValue());
                    } else {
                        bundle.putLong("chat_id", -caVar.b.longValue());
                    }
                    if (caVar.e && (num = caVar.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        sbVar.H(new fo(bundle));
                        break;
                    } else {
                        sbVar.H(new ProfileActivity(bundle, null));
                        break;
                    }
                }
                break;
            case 2:
                q5 q5Var2 = (q5) this.b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.c;
                ((jb) q5Var2.Q1).h(new sg.y0(q5Var2.J0.f, 14, false));
                e3Var.dismiss();
                break;
            case 3:
                h5 h5Var = (h5) this.b;
                na naVar = (na) this.c;
                q5 q5Var3 = h5Var.l;
                ew alert = naVar.getAlert();
                if (alert != null && (j5Var = q5Var3.Q1) != null) {
                    ((jb) j5Var).h(alert);
                    q5Var3.t1.a();
                    break;
                }
                break;
            case 4:
                di.v3 v3Var = (di.v3) this.b;
                v3Var.e((MediaController.AlbumEntry) this.c, false);
                v3Var.F.n();
                break;
            case 5:
                di.t8 t8Var = (di.t8) this.b;
                di.x6 x6Var = (di.x6) this.c;
                org.telegram.ui.Cells.j3 j3Var = t8Var.Y;
                try {
                    charSequence = ((ClipboardManager) t8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(t8Var.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    j3Var.b.setText(charSequence.toString());
                    org.telegram.ui.Cells.h3 h3Var = j3Var.b;
                    h3Var.setSelection(0, h3Var.getText().length());
                }
                x6Var.run();
                break;
            case 6:
                kc kcVar = (kc) this.b;
                new di.e9((Context) this.c, kcVar.c, true, kcVar.x0, new di.ha(kcVar, 20), kcVar.a).show();
                break;
            case 7:
                fi.l.y0((fi.l) this.b, (Context) this.c);
                break;
            case 8:
                fi.k3 k3Var = (fi.k3) this.b;
                fi.j0 j0Var = (fi.j0) this.c;
                if (j0Var.c()) {
                    j0Var.a();
                } else {
                    File file = j0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = j0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                    }
                }
                m80 m80Var = k3Var.K0;
                if (m80Var != null) {
                    m80Var.u();
                    k3Var.K0 = null;
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                e3Var2.dismiss();
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    break;
                }
                break;
            case 10:
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.b;
                fo foVar = (fo) this.c;
                AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                zc.a0(foVar).k(false).j();
                break;
            case 11:
                ig.k0.R((ig.k0) this.b, (TL_account.TL_connectedBot) this.c);
                break;
            case 12:
                ii.c cVar = (ii.c) this.b;
                Runnable runnable = (Runnable) this.c;
                cVar.getClass();
                runnable.run();
                cVar.dismiss();
                break;
            case 13:
                ji.d2.Y((ji.d2) this.b, (Context) this.c, view);
                break;
            case 14:
                ((VideoAds) this.b).lambda$show$2((VideoAds.CloseDrawable) this.c, view);
                break;
            case 15:
                ((VideoAds) this.b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.c, view);
                break;
            case 16:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.b;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.c;
                int indexOf = u0Var.g0.indexOf(t0Var.getFilter());
                if (u0Var.h0 == indexOf) {
                    if (t0Var.getFilter().h) {
                        if (!t0Var.a.f) {
                            t0Var.setSelectedForDelete(true);
                            break;
                        } else {
                            hg.p0 filter = t0Var.getFilter();
                            u0Var.C(filter);
                            org.telegram.ui.ActionBar.e5 e5Var = u0Var.H;
                            if (e5Var != null) {
                                e5Var.o(filter);
                                u0Var.H.q(u0Var.e);
                                break;
                            }
                        }
                    }
                } else {
                    u0Var.h0 = indexOf;
                    u0Var.y();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.ActionBar.s0 s0Var = (org.telegram.ui.ActionBar.s0) this.b;
                org.telegram.ui.ActionBar.u0 u0Var2 = (org.telegram.ui.ActionBar.u0) this.c;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var2.d;
                if (m1Var != null && m1Var.isShowing() && s0Var.f) {
                    if (!u0Var2.T) {
                        u0Var2.T = true;
                        u0Var2.d.d(u0Var2.R);
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var2.c;
                if (yVar == null) {
                    org.telegram.ui.ActionBar.q0 q0Var = u0Var2.P;
                    if (q0Var != null) {
                        q0Var.l(((Integer) view.getTag()).intValue());
                        break;
                    }
                } else {
                    yVar.o(((Integer) view.getTag()).intValue());
                    break;
                }
                break;
            case 18:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.b;
                if (!((org.telegram.ui.ActionBar.v1) this.c).a) {
                    org.telegram.ui.ActionBar.z1 z1Var = a2Var.m0;
                    if (z1Var != null) {
                        z1Var.g(a2Var, -1);
                    }
                    if (a2Var.h0) {
                        a2Var.dismiss();
                        break;
                    }
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.b;
                if (!((org.telegram.ui.ActionBar.v1) this.c).a) {
                    org.telegram.ui.ActionBar.z1 z1Var2 = a2Var2.o0;
                    if (z1Var2 != null) {
                        z1Var2.g(a2Var2, -2);
                    }
                    if (a2Var2.h0) {
                        a2Var2.cancel();
                        break;
                    }
                }
                break;
            case 20:
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) this.b;
                if (!((org.telegram.ui.ActionBar.v1) this.c).a) {
                    org.telegram.ui.ActionBar.z1 z1Var3 = a2Var3.s0;
                    if (z1Var3 != null) {
                        z1Var3.g(a2Var3, -2);
                    }
                    if (a2Var3.h0) {
                        a2Var3.dismiss();
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.ActionBar.a2 a2Var4 = (org.telegram.ui.ActionBar.a2) this.b;
                if (!((org.telegram.ui.ActionBar.v1) this.c).a) {
                    ji.g4 g4Var = a2Var4.q0;
                    if (g4Var != null) {
                        g4Var.g(a2Var4, -2);
                    }
                    if (a2Var4.h0) {
                        a2Var4.cancel();
                        break;
                    }
                }
                break;
            case 22:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) this.b;
                Activity activity = (Activity) this.c;
                org.telegram.ui.x3 x3Var = k4Var.K;
                if (!k4Var.h0.A0) {
                    org.telegram.ui.o3 o3Var = k4Var.u0[0];
                    if (!o3Var.f()) {
                        if (x3Var == null) {
                            o3Var.b.x0(0);
                            break;
                        } else {
                            xw0 xw0Var = new xw0(activity);
                            xw0Var.a = 1;
                            xw0Var.s = -AndroidUtilities.dp(32.0f);
                            o3Var.d.w0(xw0Var);
                            break;
                        }
                    } else if (o3Var.getWebView() != null && !k4Var.h0.W) {
                        if (k4Var.i0 != null) {
                            org.telegram.ui.web.y0 webView = o3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String u11 = org.telegram.ui.web.b1.u(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.k kVar = k4Var.i0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = LocaleController.getString(R.string.WebEmpty);
                            }
                            String str4 = TextUtils.isEmpty(u11) ? "about:blank" : u11;
                            org.telegram.ui.y yVar2 = new org.telegram.ui.y(k4Var, u11, 0);
                            org.telegram.ui.z zVar = new org.telegram.ui.z(k4Var, o3Var, activity, 0);
                            org.telegram.ui.r rVar = new org.telegram.ui.r(k4Var, 1);
                            org.telegram.ui.r rVar2 = new org.telegram.ui.r(k4Var, 2);
                            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(k4Var, u11, o3Var, 0);
                            org.telegram.ui.web.c cVar2 = kVar.w;
                            ImageView imageView = kVar.f;
                            if (favicon == null) {
                                imageView.setImageResource(R.drawable.msg_language);
                                str = str4;
                                imageView.setColorFilter(new PorterDuffColorFilter(kVar.H, PorterDuff.Mode.SRC_IN));
                            } else {
                                str = str4;
                                imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), favicon));
                                imageView.setColorFilter((ColorFilter) null);
                            }
                            TextView textView = kVar.r;
                            textView.setText(Emoji.replaceEmoji(title, textView.getPaint().getFontMetricsInt(), false));
                            try {
                                Uri parse = Uri.parse(str);
                                str2 = pf.d.v(parse, null, null, pf.d.a(parse.getHost()), null);
                            } catch (Exception e7) {
                                try {
                                    FileLog.e((Throwable) e7, false);
                                    str2 = str;
                                } catch (Exception e10) {
                                    e = e10;
                                    str2 = str;
                                    FileLog.e(e);
                                    str3 = str2;
                                    TextView textView2 = kVar.s;
                                    textView2.setText(Emoji.replaceEmoji(str3, textView2.getPaint().getFontMetricsInt(), false));
                                    kVar.L = zVar;
                                    kVar.M = rVar;
                                    kVar.N = rVar2;
                                    kVar.e.setOnClickListener(new bz0(18, kVar, yVar2));
                                    kVar.n.setOnClickListener(a0Var);
                                    kVar.b = false;
                                    kVar.setInput(null);
                                    cVar2.W2.N(true);
                                    cVar2.u0(0);
                                    org.telegram.ui.m0 m0Var = k4Var.h0;
                                    v2 v2Var = new v2(28, o3Var, activity);
                                    gi.o oVar = m0Var.b0;
                                    oVar.setText("");
                                    oVar.setSelection(0, oVar.getText().length());
                                    oVar.setScrollX(0);
                                    m0Var.v0 = v2Var;
                                    m0Var.k(true);
                                    return;
                                }
                            }
                            try {
                                str3 = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e11) {
                                e = e11;
                                FileLog.e(e);
                                str3 = str2;
                                TextView textView22 = kVar.s;
                                textView22.setText(Emoji.replaceEmoji(str3, textView22.getPaint().getFontMetricsInt(), false));
                                kVar.L = zVar;
                                kVar.M = rVar;
                                kVar.N = rVar2;
                                kVar.e.setOnClickListener(new bz0(18, kVar, yVar2));
                                kVar.n.setOnClickListener(a0Var);
                                kVar.b = false;
                                kVar.setInput(null);
                                cVar2.W2.N(true);
                                cVar2.u0(0);
                                org.telegram.ui.m0 m0Var2 = k4Var.h0;
                                v2 v2Var2 = new v2(28, o3Var, activity);
                                gi.o oVar2 = m0Var2.b0;
                                oVar2.setText("");
                                oVar2.setSelection(0, oVar2.getText().length());
                                oVar2.setScrollX(0);
                                m0Var2.v0 = v2Var2;
                                m0Var2.k(true);
                                return;
                            }
                            TextView textView222 = kVar.s;
                            textView222.setText(Emoji.replaceEmoji(str3, textView222.getPaint().getFontMetricsInt(), false));
                            kVar.L = zVar;
                            kVar.M = rVar;
                            kVar.N = rVar2;
                            kVar.e.setOnClickListener(new bz0(18, kVar, yVar2));
                            kVar.n.setOnClickListener(a0Var);
                            kVar.b = false;
                            kVar.setInput(null);
                            cVar2.W2.N(true);
                            cVar2.u0(0);
                        }
                        org.telegram.ui.m0 m0Var22 = k4Var.h0;
                        v2 v2Var22 = new v2(28, o3Var, activity);
                        gi.o oVar22 = m0Var22.b0;
                        oVar22.setText("");
                        oVar22.setSelection(0, oVar22.getText().length());
                        oVar22.setScrollX(0);
                        m0Var22.v0 = v2Var22;
                        m0Var22.k(true);
                    }
                }
                break;
            case 23:
                org.telegram.ui.f1 f1Var = (org.telegram.ui.f1) this.b;
                z70 z70Var = (z70) this.c;
                if (f1Var.f == 0) {
                    f1Var.a(1, true);
                    int i11 = ((org.telegram.ui.k4) z70Var).X;
                    TLRPC.Chat chat = z70Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new fi.g1(f1Var, i11, tL_channels_joinChannel, chat));
                    break;
                }
                break;
            case 24:
                org.telegram.ui.g5 g5Var = (org.telegram.ui.g5) this.b;
                org.telegram.ui.h5 h5Var2 = (org.telegram.ui.h5) this.c;
                g5Var.b(false);
                g5Var.e.b(h5Var2);
                break;
            case 25:
                ((org.telegram.ui.b7) this.b).e.u0((org.telegram.ui.Cells.a2) this.c);
                break;
            case 26:
                org.telegram.ui.i7 i7Var = (org.telegram.ui.i7) this.b;
                org.telegram.ui.q7 q7Var = (org.telegram.ui.q7) this.c;
                org.telegram.ui.m7 m7Var = i7Var.d.v;
                if (m7Var != null) {
                    m7Var.j1(q7Var.c, q7Var.d, true);
                }
                org.telegram.ui.ActionBar.m1 m1Var2 = i7Var.a;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.n9 n9Var = (org.telegram.ui.n9) this.b;
                org.telegram.ui.j9 j9Var = (org.telegram.ui.j9) this.c;
                ArrayList arrayList = j9Var.b;
                if (arrayList.size() != 1) {
                    boolean z10 = j9Var.e;
                    HashSet hashSet = new HashSet();
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) j9Var.c.get(0)).id;
                    org.telegram.ui.ActionBar.a2 a2Var5 = new org.telegram.ui.ActionBar.a2(n9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = n9Var.getMessagesController().conferenceCallSizeLimit;
                    a2Var5.setOnCancelListener(new org.telegram.ui.s8(n9Var, n9Var.getConnectionsManager().sendRequest(getgroupcall, new org.telegram.ui.r8(n9Var, a2Var5, hashSet, tL_inputGroupCallInviteMessage, z10, 1)), 1));
                    a2Var5.q(600L);
                    break;
                } else {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = n9Var.getMessagesController().getUserFull(user.id);
                    n9Var.P = user;
                    boolean z11 = j9Var.e;
                    org.telegram.ui.Components.voip.d2.m(user, z11, z11 || (userFull != null && userFull.video_calls_available), n9Var.getParentActivity(), null, n9Var.getAccountInstance());
                    break;
                }
            case 28:
                qe qeVar = (qe) this.b;
                hb1 hb1Var = (hb1) this.c;
                di.d dVar = qeVar.K0;
                if (view.isEnabled() && !dVar.N) {
                    he heVar = qeVar.Q0;
                    if (heVar == null || !heVar.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        yd ydVar = new yd(qeVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.b0 = ydVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new zd(qeVar, hb1Var, twoStepVerificationActivity, 0));
                        break;
                    }
                }
                break;
            default:
                pf.d.s((Context) this.c, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) this.b).transaction_url);
                break;
        }
    }

    public /* synthetic */ u1(Context context, TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal) {
        this.a = 29;
        this.c = context;
        this.b = tL_broadcastRevenueTransactionWithdrawal;
    }
}
