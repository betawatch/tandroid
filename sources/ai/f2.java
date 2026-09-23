package ai;

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
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ae;
import org.telegram.ui.je;
import org.telegram.ui.py0;
import org.telegram.ui.r70;
import org.telegram.ui.ra1;
import org.telegram.ui.rd;
import org.telegram.ui.sd;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        x5 x5Var;
        CharSequence charSequence;
        String str;
        String str2;
        String str3;
        switch (this.a) {
            case 0:
                d2 d2Var = (d2) this.b;
                Context context = (Context) this.c;
                if (d2Var != null) {
                    int i10 = d2Var.e;
                    if (i10 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            launchActivity.K0(i10);
                        }
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i10).getStoriesController().u(d2Var.c, d2Var.b);
                        if (u10 == null) {
                            u10 = d2Var.a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().A(i10, context, u10, null);
                            AndroidUtilities.runOnUIThread(new f(2), 200L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                e6 e6Var = (e6) this.b;
                sa saVar = (sa) this.c;
                jc jcVar = e6Var.J0;
                if (saVar.b == null) {
                    org.telegram.ui.Components.qc Q = new xc(e6Var.c1, e6Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    if (saVar.b.longValue() >= 0) {
                        bundle.putLong("user_id", saVar.b.longValue());
                    } else {
                        bundle.putLong("chat_id", -saVar.b.longValue());
                    }
                    if (saVar.e && (num = saVar.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        jcVar.H(new xn(bundle));
                        break;
                    } else {
                        jcVar.H(new ProfileActivity(bundle, null));
                        break;
                    }
                }
                break;
            case 2:
                e6 e6Var2 = (e6) this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                ((ac) e6Var2.Q1).h(new rg.x0(e6Var2.J0.f, 14, false));
                f3Var.dismiss();
                break;
            case 3:
                v5 v5Var = (v5) this.b;
                db dbVar = (db) this.c;
                e6 e6Var3 = v5Var.l;
                tv alert = dbVar.getAlert();
                if (alert != null && (x5Var = e6Var3.Q1) != null) {
                    ((ac) x5Var).h(alert);
                    e6Var3.t1.a();
                    break;
                }
                break;
            case 4:
                ci.w3 w3Var = (ci.w3) this.b;
                w3Var.e((MediaController.AlbumEntry) this.c, false);
                w3Var.F.n();
                break;
            case 5:
                ci.u8 u8Var = (ci.u8) this.b;
                ba baVar = (ba) this.c;
                org.telegram.ui.Cells.i3 i3Var = u8Var.Y;
                try {
                    charSequence = ((ClipboardManager) u8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(u8Var.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    i3Var.b.setText(charSequence.toString());
                    org.telegram.ui.Cells.g3 g3Var = i3Var.b;
                    g3Var.setSelection(0, g3Var.getText().length());
                }
                baVar.run();
                break;
            case 6:
                ci.lc lcVar = (ci.lc) this.b;
                new ci.f9((Context) this.c, lcVar.c, true, lcVar.x0, new ci.ia(lcVar, 20), lcVar.a).show();
                break;
            case 7:
                ei.l.x0((ei.l) this.b, (Context) this.c);
                break;
            case 8:
                ei.k3 k3Var = (ei.k3) this.b;
                ei.k0 k0Var = (ei.k0) this.c;
                if (k0Var.c()) {
                    k0Var.a();
                } else {
                    File file = k0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = k0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                    }
                }
                o70 o70Var = k3Var.K0;
                if (o70Var != null) {
                    o70Var.u();
                    k3Var.K0 = null;
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                f3Var2.dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    break;
                }
                break;
            case 10:
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.b;
                xn xnVar = (xn) this.c;
                AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                xc.a0(xnVar).k(false).j();
                break;
            case 11:
                hg.m0.Q((hg.m0) this.b, (TL_account.TL_connectedBot) this.c);
                break;
            case 12:
                hi.c cVar = (hi.c) this.b;
                Runnable runnable = (Runnable) this.c;
                cVar.getClass();
                runnable.run();
                cVar.dismiss();
                break;
            case 13:
                ii.e2.Y((ii.e2) this.b, (Context) this.c, view);
                break;
            case 14:
                ((VideoAds) this.b).lambda$show$2((VideoAds.CloseDrawable) this.c, view);
                break;
            case 15:
                ((VideoAds) this.b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.c, view);
                break;
            case 16:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.b;
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.c;
                int indexOf = v0Var.g0.indexOf(u0Var.getFilter());
                if (v0Var.h0 == indexOf) {
                    if (u0Var.getFilter().h) {
                        if (!u0Var.a.f) {
                            u0Var.setSelectedForDelete(true);
                            break;
                        } else {
                            gg.q0 filter = u0Var.getFilter();
                            v0Var.C(filter);
                            org.telegram.ui.ActionBar.f5 f5Var = v0Var.H;
                            if (f5Var != null) {
                                f5Var.o(filter);
                                v0Var.H.q(v0Var.e);
                                break;
                            }
                        }
                    }
                } else {
                    v0Var.h0 = indexOf;
                    v0Var.y();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.b;
                org.telegram.ui.ActionBar.v0 v0Var2 = (org.telegram.ui.ActionBar.v0) this.c;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var2.d;
                if (n1Var != null && n1Var.isShowing() && t0Var.f) {
                    if (!v0Var2.T) {
                        v0Var2.T = true;
                        v0Var2.d.d(v0Var2.R);
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var2.c;
                if (zVar == null) {
                    org.telegram.ui.ActionBar.r0 r0Var = v0Var2.P;
                    if (r0Var != null) {
                        r0Var.m(((Integer) view.getTag()).intValue());
                        break;
                    }
                } else {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                }
                break;
            case 18:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.b;
                if (!((org.telegram.ui.ActionBar.w1) this.c).a) {
                    org.telegram.ui.ActionBar.a2 a2Var = b2Var.m0;
                    if (a2Var != null) {
                        a2Var.f(b2Var, -1);
                    }
                    if (b2Var.h0) {
                        b2Var.dismiss();
                        break;
                    }
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.b;
                if (!((org.telegram.ui.ActionBar.w1) this.c).a) {
                    org.telegram.ui.ActionBar.a2 a2Var2 = b2Var2.o0;
                    if (a2Var2 != null) {
                        a2Var2.f(b2Var2, -2);
                    }
                    if (b2Var2.h0) {
                        b2Var2.cancel();
                        break;
                    }
                }
                break;
            case 20:
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.b;
                if (!((org.telegram.ui.ActionBar.w1) this.c).a) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = b2Var3.s0;
                    if (a2Var3 != null) {
                        a2Var3.f(b2Var3, -2);
                    }
                    if (b2Var3.h0) {
                        b2Var3.dismiss();
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.ActionBar.b2 b2Var4 = (org.telegram.ui.ActionBar.b2) this.b;
                if (!((org.telegram.ui.ActionBar.w1) this.c).a) {
                    ii.f4 f4Var = b2Var4.q0;
                    if (f4Var != null) {
                        f4Var.f(b2Var4, -2);
                    }
                    if (b2Var4.h0) {
                        b2Var4.cancel();
                        break;
                    }
                }
                break;
            case 22:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.b;
                Activity activity = (Activity) this.c;
                org.telegram.ui.v3 v3Var = i4Var.K;
                if (!i4Var.h0.A0) {
                    org.telegram.ui.m3 m3Var = i4Var.u0[0];
                    if (!m3Var.f()) {
                        if (v3Var == null) {
                            m3Var.b.x0(0);
                            break;
                        } else {
                            yv0 yv0Var = new yv0(activity);
                            yv0Var.a = 1;
                            yv0Var.s = -AndroidUtilities.dp(32.0f);
                            m3Var.d.w0(yv0Var);
                            break;
                        }
                    } else if (m3Var.getWebView() != null && !i4Var.h0.W) {
                        if (i4Var.i0 != null) {
                            org.telegram.ui.web.y0 webView = m3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String v = org.telegram.ui.web.b1.v(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.k kVar = i4Var.i0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = LocaleController.getString(R.string.WebEmpty);
                            }
                            String str4 = TextUtils.isEmpty(v) ? "about:blank" : v;
                            org.telegram.ui.y yVar = new org.telegram.ui.y(i4Var, v, 0);
                            org.telegram.ui.z zVar2 = new org.telegram.ui.z(i4Var, m3Var, activity, 0);
                            org.telegram.ui.r rVar = new org.telegram.ui.r(i4Var, 1);
                            org.telegram.ui.r rVar2 = new org.telegram.ui.r(i4Var, 2);
                            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(i4Var, v, m3Var, 0);
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
                                str2 = nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null);
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
                                    kVar.L = zVar2;
                                    kVar.M = rVar;
                                    kVar.N = rVar2;
                                    kVar.e.setOnClickListener(new py0(12, kVar, yVar));
                                    kVar.n.setOnClickListener(a0Var);
                                    kVar.b = false;
                                    kVar.setInput(null);
                                    cVar2.Y2.N(true);
                                    cVar2.u0(0);
                                    org.telegram.ui.l0 l0Var = i4Var.h0;
                                    g3 g3Var2 = new g3(28, m3Var, activity);
                                    fi.o oVar = l0Var.b0;
                                    oVar.setText("");
                                    oVar.setSelection(0, oVar.getText().length());
                                    oVar.setScrollX(0);
                                    l0Var.v0 = g3Var2;
                                    l0Var.k(true);
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
                                kVar.L = zVar2;
                                kVar.M = rVar;
                                kVar.N = rVar2;
                                kVar.e.setOnClickListener(new py0(12, kVar, yVar));
                                kVar.n.setOnClickListener(a0Var);
                                kVar.b = false;
                                kVar.setInput(null);
                                cVar2.Y2.N(true);
                                cVar2.u0(0);
                                org.telegram.ui.l0 l0Var2 = i4Var.h0;
                                g3 g3Var22 = new g3(28, m3Var, activity);
                                fi.o oVar2 = l0Var2.b0;
                                oVar2.setText("");
                                oVar2.setSelection(0, oVar2.getText().length());
                                oVar2.setScrollX(0);
                                l0Var2.v0 = g3Var22;
                                l0Var2.k(true);
                                return;
                            }
                            TextView textView222 = kVar.s;
                            textView222.setText(Emoji.replaceEmoji(str3, textView222.getPaint().getFontMetricsInt(), false));
                            kVar.L = zVar2;
                            kVar.M = rVar;
                            kVar.N = rVar2;
                            kVar.e.setOnClickListener(new py0(12, kVar, yVar));
                            kVar.n.setOnClickListener(a0Var);
                            kVar.b = false;
                            kVar.setInput(null);
                            cVar2.Y2.N(true);
                            cVar2.u0(0);
                        }
                        org.telegram.ui.l0 l0Var22 = i4Var.h0;
                        g3 g3Var222 = new g3(28, m3Var, activity);
                        fi.o oVar22 = l0Var22.b0;
                        oVar22.setText("");
                        oVar22.setSelection(0, oVar22.getText().length());
                        oVar22.setScrollX(0);
                        l0Var22.v0 = g3Var222;
                        l0Var22.k(true);
                    }
                }
                break;
            case 23:
                org.telegram.ui.d1 d1Var = (org.telegram.ui.d1) this.b;
                r70 r70Var = (r70) this.c;
                if (d1Var.f == 0) {
                    d1Var.a(1, true);
                    int i11 = ((org.telegram.ui.i4) r70Var).X;
                    TLRPC.Chat chat = r70Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new ei.h1(d1Var, i11, tL_channels_joinChannel, chat));
                    break;
                }
                break;
            case 24:
                org.telegram.ui.d5 d5Var = (org.telegram.ui.d5) this.b;
                org.telegram.ui.e5 e5Var = (org.telegram.ui.e5) this.c;
                d5Var.b(false);
                d5Var.e.b(e5Var);
                break;
            case 25:
                ((org.telegram.ui.x6) this.b).e.u0((org.telegram.ui.Cells.z1) this.c);
                break;
            case 26:
                org.telegram.ui.e7 e7Var = (org.telegram.ui.e7) this.b;
                org.telegram.ui.m7 m7Var = (org.telegram.ui.m7) this.c;
                org.telegram.ui.i7 i7Var = e7Var.d.v;
                if (i7Var != null) {
                    i7Var.H0(m7Var.c, m7Var.d, true);
                }
                org.telegram.ui.ActionBar.n1 n1Var2 = e7Var.a;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.k9 k9Var = (org.telegram.ui.k9) this.b;
                org.telegram.ui.g9 g9Var = (org.telegram.ui.g9) this.c;
                ArrayList arrayList = g9Var.b;
                if (arrayList.size() != 1) {
                    boolean z10 = g9Var.e;
                    HashSet hashSet = new HashSet();
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) g9Var.c.get(0)).id;
                    org.telegram.ui.ActionBar.b2 b2Var5 = new org.telegram.ui.ActionBar.b2(k9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = k9Var.getMessagesController().conferenceCallSizeLimit;
                    b2Var5.setOnCancelListener(new org.telegram.ui.p8(k9Var, k9Var.getConnectionsManager().sendRequest(getgroupcall, new org.telegram.ui.o8(k9Var, b2Var5, hashSet, tL_inputGroupCallInviteMessage, z10, 1)), 1));
                    b2Var5.q(600L);
                    break;
                } else {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = k9Var.getMessagesController().getUserFull(user.id);
                    k9Var.P = user;
                    boolean z11 = g9Var.e;
                    org.telegram.ui.Components.voip.f2.m(user, z11, z11 || (userFull != null && userFull.video_calls_available), k9Var.getParentActivity(), null, k9Var.getAccountInstance());
                    break;
                }
            case 28:
                je jeVar = (je) this.b;
                ra1 ra1Var = (ra1) this.c;
                ci.d dVar = jeVar.K0;
                if (view.isEnabled() && !dVar.N) {
                    ae aeVar = jeVar.Q0;
                    if (aeVar == null || !aeVar.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        rd rdVar = new rd(jeVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.b0 = rdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new sd(jeVar, ra1Var, twoStepVerificationActivity, 0));
                        break;
                    }
                }
                break;
            default:
                nf.f.s((Context) this.c, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) this.b).transaction_url);
                break;
        }
    }

    public /* synthetic */ f2(Context context, TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal) {
        this.a = 29;
        this.c = context;
        this.b = tL_broadcastRevenueTransactionWithdrawal;
    }
}
