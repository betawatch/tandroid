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
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ae;
import org.telegram.ui.bo;
import org.telegram.ui.je;
import org.telegram.ui.rd;
import org.telegram.ui.sd;
import org.telegram.ui.u70;
import org.telegram.ui.wy0;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        y5 y5Var;
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
                f6 f6Var = (f6) this.b;
                sa saVar = (sa) this.c;
                jc jcVar = f6Var.J0;
                if (saVar.b == null) {
                    org.telegram.ui.Components.oc Q = new vc(f6Var.c1, f6Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
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
                        jcVar.H(new bo(bundle));
                        break;
                    } else {
                        jcVar.H(new ProfileActivity(bundle, null));
                        break;
                    }
                }
                break;
            case 2:
                f6 f6Var2 = (f6) this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                ((ac) f6Var2.Q1).h(new rg.x0(f6Var2.J0.f, 14, false));
                f3Var.dismiss();
                break;
            case 3:
                w5 w5Var = (w5) this.b;
                db dbVar = (db) this.c;
                f6 f6Var3 = w5Var.l;
                sv alert = dbVar.getAlert();
                if (alert != null && (y5Var = f6Var3.Q1) != null) {
                    ((ac) y5Var).h(alert);
                    f6Var3.t1.a();
                    break;
                }
                break;
            case 4:
                ci.x3 x3Var = (ci.x3) this.b;
                x3Var.e((MediaController.AlbumEntry) this.c, false);
                x3Var.F.n();
                break;
            case 5:
                ci.x8 x8Var = (ci.x8) this.b;
                ba baVar = (ba) this.c;
                org.telegram.ui.Cells.i3 i3Var = x8Var.Y;
                try {
                    charSequence = ((ClipboardManager) x8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(x8Var.getContext());
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
                ci.oc ocVar = (ci.oc) this.b;
                new ci.i9((Context) this.c, ocVar.c, true, ocVar.x0, new ci.la(ocVar, 20), ocVar.a).show();
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
                n70 n70Var = k3Var.K0;
                if (n70Var != null) {
                    n70Var.u();
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
                bo boVar = (bo) this.c;
                AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                vc.a0(boVar).k(false).j();
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
                ii.d2.Y((ii.d2) this.b, (Context) this.c, view);
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
                            org.telegram.ui.ActionBar.g5 g5Var = v0Var.H;
                            if (g5Var != null) {
                                g5Var.o(filter);
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
                    ii.e4 e4Var = b2Var4.q0;
                    if (e4Var != null) {
                        e4Var.f(b2Var4, -2);
                    }
                    if (b2Var4.h0) {
                        b2Var4.cancel();
                        break;
                    }
                }
                break;
            case 22:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.b;
                Activity activity = (Activity) this.c;
                org.telegram.ui.u3 u3Var = h4Var.K;
                if (!h4Var.h0.A0) {
                    org.telegram.ui.l3 l3Var = h4Var.u0[0];
                    if (!l3Var.f()) {
                        if (u3Var == null) {
                            l3Var.b.x0(0);
                            break;
                        } else {
                            yv0 yv0Var = new yv0(activity);
                            yv0Var.a = 1;
                            yv0Var.s = -AndroidUtilities.dp(32.0f);
                            l3Var.d.w0(yv0Var);
                            break;
                        }
                    } else if (l3Var.getWebView() != null && !h4Var.h0.W) {
                        if (h4Var.i0 != null) {
                            org.telegram.ui.web.z0 webView = l3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String v = org.telegram.ui.web.d1.v(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.k kVar = h4Var.i0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = LocaleController.getString(R.string.WebEmpty);
                            }
                            String str4 = TextUtils.isEmpty(v) ? "about:blank" : v;
                            org.telegram.ui.x xVar = new org.telegram.ui.x(h4Var, v, 0);
                            org.telegram.ui.y yVar = new org.telegram.ui.y(h4Var, l3Var, activity, 0);
                            org.telegram.ui.r rVar = new org.telegram.ui.r(h4Var, 1);
                            org.telegram.ui.r rVar2 = new org.telegram.ui.r(h4Var, 2);
                            org.telegram.ui.z zVar2 = new org.telegram.ui.z(h4Var, v, l3Var, 0);
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
                                    kVar.L = yVar;
                                    kVar.M = rVar;
                                    kVar.N = rVar2;
                                    kVar.e.setOnClickListener(new wy0(12, kVar, xVar));
                                    kVar.n.setOnClickListener(zVar2);
                                    kVar.b = false;
                                    kVar.setInput(null);
                                    cVar2.Y2.N(true);
                                    cVar2.u0(0);
                                    org.telegram.ui.k0 k0Var2 = h4Var.h0;
                                    ci.m2 m2Var = new ci.m2(27, l3Var, activity);
                                    fi.o oVar = k0Var2.b0;
                                    oVar.setText("");
                                    oVar.setSelection(0, oVar.getText().length());
                                    oVar.setScrollX(0);
                                    k0Var2.v0 = m2Var;
                                    k0Var2.k(true);
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
                                kVar.L = yVar;
                                kVar.M = rVar;
                                kVar.N = rVar2;
                                kVar.e.setOnClickListener(new wy0(12, kVar, xVar));
                                kVar.n.setOnClickListener(zVar2);
                                kVar.b = false;
                                kVar.setInput(null);
                                cVar2.Y2.N(true);
                                cVar2.u0(0);
                                org.telegram.ui.k0 k0Var22 = h4Var.h0;
                                ci.m2 m2Var2 = new ci.m2(27, l3Var, activity);
                                fi.o oVar2 = k0Var22.b0;
                                oVar2.setText("");
                                oVar2.setSelection(0, oVar2.getText().length());
                                oVar2.setScrollX(0);
                                k0Var22.v0 = m2Var2;
                                k0Var22.k(true);
                                return;
                            }
                            TextView textView222 = kVar.s;
                            textView222.setText(Emoji.replaceEmoji(str3, textView222.getPaint().getFontMetricsInt(), false));
                            kVar.L = yVar;
                            kVar.M = rVar;
                            kVar.N = rVar2;
                            kVar.e.setOnClickListener(new wy0(12, kVar, xVar));
                            kVar.n.setOnClickListener(zVar2);
                            kVar.b = false;
                            kVar.setInput(null);
                            cVar2.Y2.N(true);
                            cVar2.u0(0);
                        }
                        org.telegram.ui.k0 k0Var222 = h4Var.h0;
                        ci.m2 m2Var22 = new ci.m2(27, l3Var, activity);
                        fi.o oVar22 = k0Var222.b0;
                        oVar22.setText("");
                        oVar22.setSelection(0, oVar22.getText().length());
                        oVar22.setScrollX(0);
                        k0Var222.v0 = m2Var22;
                        k0Var222.k(true);
                    }
                }
                break;
            case 23:
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) this.b;
                u70 u70Var = (u70) this.c;
                if (c1Var.f == 0) {
                    c1Var.a(1, true);
                    int i11 = ((org.telegram.ui.h4) u70Var).X;
                    TLRPC.Chat chat = u70Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new ei.h1(c1Var, i11, tL_channels_joinChannel, chat));
                    break;
                }
                break;
            case 24:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.b;
                org.telegram.ui.d5 d5Var = (org.telegram.ui.d5) this.c;
                c5Var.b(false);
                c5Var.e.b(d5Var);
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
                za1 za1Var = (za1) this.c;
                ci.d dVar = jeVar.K0;
                if (view.isEnabled() && !dVar.N) {
                    ae aeVar = jeVar.Q0;
                    if (aeVar == null || !aeVar.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        rd rdVar = new rd(jeVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.b0 = rdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new sd(jeVar, za1Var, twoStepVerificationActivity, 0));
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
