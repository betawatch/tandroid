package bi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eo;
import org.telegram.ui.fb1;
import org.telegram.ui.t70;
import org.telegram.ui.w71;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class n3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence charSequence;
        int i10;
        String str;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 0;
        int i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                p4 p4Var = (p4) obj2;
                p4Var.e((MediaController.AlbumEntry) obj, false);
                p4Var.F.n();
                break;
            case 1:
                aa aaVar = (aa) obj2;
                a1.e eVar = (a1.e) obj;
                org.telegram.ui.Cells.i3 i3Var = aaVar.Y;
                try {
                    charSequence = ((ClipboardManager) aaVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(aaVar.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    i3Var.b.setText(charSequence.toString());
                    org.telegram.ui.Cells.g3 g3Var = i3Var.b;
                    g3Var.setSelection(0, g3Var.getText().length());
                }
                eVar.run();
                break;
            case 2:
                ce ceVar = (ce) obj2;
                new ka((Context) obj, ceVar.c, true, ceVar.x0, new ub(ceVar, 20), ceVar.a).show();
                break;
            case 3:
                di.m.x0((di.m) obj2, (Context) obj);
                break;
            case 4:
                di.n3 n3Var = (di.n3) obj2;
                di.n0 n0Var = (di.n0) obj;
                if (n0Var.c()) {
                    n0Var.a();
                } else {
                    File file = n0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = n0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                    }
                }
                w70 w70Var = n3Var.K0;
                if (w70Var != null) {
                    w70Var.u();
                    n3Var.K0 = null;
                    break;
                }
                break;
            case 5:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.h3) obj2).dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) obj2).link);
                org.telegram.ui.Components.wc.a0((eo) obj).k(false).j();
                break;
            case 7:
                gg.p0.Q((gg.p0) obj2, (TL_account.TL_connectedBot) obj);
                break;
            case 8:
                gi.c cVar = (gi.c) obj2;
                cVar.getClass();
                ((Runnable) obj).run();
                cVar.dismiss();
                break;
            case 9:
                hi.g2.Y((hi.g2) obj2, (Context) obj, view);
                break;
            case 10:
                og.a0 a0Var = (og.a0) obj2;
                Context context = (Context) obj;
                if (!a0Var.n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(a0Var.n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    a0Var.n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    og.n nVar = new og.n(a0Var, context, createBitmap);
                    a0Var.n.f().addView(nVar, w7.a6.c(-1.0f, -1));
                    og.v vVar = a0Var.n;
                    Objects.requireNonNull(vVar);
                    nVar.setColorListener(new a6(vVar, 4));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(wr.f);
                    duration.addUpdateListener(new ai.a(nVar, 27));
                    duration.start();
                    a0Var.n.a();
                    a0Var.dismiss();
                    break;
                }
                break;
            case 11:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                break;
            case 12:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                break;
            case 13:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = w0Var.g0.indexOf(v0Var.getFilter());
                if (w0Var.h0 == indexOf) {
                    if (v0Var.getFilter().h) {
                        if (!v0Var.a.f) {
                            v0Var.setSelectedForDelete(true);
                            break;
                        } else {
                            fg.q0 filter = v0Var.getFilter();
                            w0Var.C(filter);
                            org.telegram.ui.ActionBar.i5 i5Var = w0Var.H;
                            if (i5Var != null) {
                                i5Var.o(filter);
                                w0Var.H.q(w0Var.e);
                                break;
                            }
                        }
                    }
                } else {
                    w0Var.h0 = indexOf;
                    w0Var.y();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.ActionBar.w0 w0Var2 = (org.telegram.ui.ActionBar.w0) obj;
                org.telegram.ui.ActionBar.p1 p1Var = w0Var2.d;
                if (p1Var != null && p1Var.isShowing() && u0Var.f) {
                    if (!w0Var2.T) {
                        w0Var2.T = true;
                        w0Var2.d.d(w0Var2.R);
                    }
                }
                org.telegram.ui.ActionBar.z zVar = w0Var2.c;
                if (zVar == null) {
                    org.telegram.ui.ActionBar.s0 s0Var = w0Var2.P;
                    if (s0Var != null) {
                        s0Var.m(((Integer) view.getTag()).intValue());
                        break;
                    }
                } else {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                }
                break;
            case 15:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                if (!((org.telegram.ui.ActionBar.y1) obj).a) {
                    org.telegram.ui.ActionBar.c2 c2Var = d2Var.m0;
                    if (c2Var != null) {
                        c2Var.f(d2Var, -1);
                    }
                    if (d2Var.h0) {
                        d2Var.dismiss();
                        break;
                    }
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                if (!((org.telegram.ui.ActionBar.y1) obj).a) {
                    org.telegram.ui.ActionBar.c2 c2Var2 = d2Var2.o0;
                    if (c2Var2 != null) {
                        c2Var2.f(d2Var2, -2);
                    }
                    if (d2Var2.h0) {
                        d2Var2.cancel();
                        break;
                    }
                }
                break;
            case 17:
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) obj2;
                if (!((org.telegram.ui.ActionBar.y1) obj).a) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = d2Var3.s0;
                    if (c2Var3 != null) {
                        c2Var3.f(d2Var3, -2);
                    }
                    if (d2Var3.h0) {
                        d2Var3.dismiss();
                        break;
                    }
                }
                break;
            case 18:
                org.telegram.ui.ActionBar.d2 d2Var4 = (org.telegram.ui.ActionBar.d2) obj2;
                if (!((org.telegram.ui.ActionBar.y1) obj).a) {
                    hi.h4 h4Var = d2Var4.q0;
                    if (h4Var != null) {
                        h4Var.f(d2Var4, -2);
                    }
                    if (d2Var4.h0) {
                        d2Var4.cancel();
                        break;
                    }
                }
                break;
            case 19:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.w3 w3Var = j4Var.K;
                if (!j4Var.h0.A0) {
                    org.telegram.ui.n3 n3Var2 = j4Var.u0[0];
                    if (!n3Var2.f()) {
                        if (w3Var == null) {
                            n3Var2.b.x0(0);
                            break;
                        } else {
                            jw0 jw0Var = new jw0(activity);
                            jw0Var.a = 1;
                            jw0Var.s = -AndroidUtilities.dp(32.0f);
                            n3Var2.d.w0(jw0Var);
                            break;
                        }
                    } else if (n3Var2.getWebView() != null && !j4Var.h0.W) {
                        if (j4Var.i0 != null) {
                            org.telegram.ui.web.y0 webView = n3Var2.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String v = org.telegram.ui.web.c1.v(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.l lVar = j4Var.i0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = LocaleController.getString(R.string.WebEmpty);
                            }
                            String str2 = TextUtils.isEmpty(v) ? "about:blank" : v;
                            org.telegram.ui.y yVar = new org.telegram.ui.y(j4Var, v, i13);
                            org.telegram.ui.z zVar2 = new org.telegram.ui.z(j4Var, n3Var2, activity, i13);
                            org.telegram.ui.s sVar = new org.telegram.ui.s(j4Var, i14);
                            org.telegram.ui.s sVar2 = new org.telegram.ui.s(j4Var, i12);
                            org.telegram.ui.a0 a0Var2 = new org.telegram.ui.a0(j4Var, v, n3Var2, i13);
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
                                    str2 = nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null);
                                } catch (Exception e7) {
                                    FileLog.e((Throwable) e7, false);
                                }
                                str = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                str = str2;
                            }
                            TextView textView2 = lVar.s;
                            textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                            lVar.L = zVar2;
                            lVar.M = sVar;
                            lVar.N = sVar2;
                            lVar.e.setOnClickListener(new w71(9, lVar, yVar));
                            lVar.n.setOnClickListener(a0Var2);
                            i10 = 0;
                            lVar.b = false;
                            lVar.setInput(null);
                            dVar.Y2.N(true);
                            dVar.u0(0);
                        } else {
                            i10 = 0;
                        }
                        org.telegram.ui.l0 l0Var = j4Var.h0;
                        y2 y2Var = new y2(27, n3Var2, activity);
                        ei.o oVar = l0Var.b0;
                        oVar.setText("");
                        oVar.setSelection(i10, oVar.getText().length());
                        oVar.setScrollX(i10);
                        l0Var.v0 = y2Var;
                        l0Var.k(true);
                        break;
                    }
                }
                break;
            case 20:
                org.telegram.ui.e1 e1Var = (org.telegram.ui.e1) obj2;
                t70 t70Var = (t70) obj;
                if (e1Var.f == 0) {
                    e1Var.a(1, true);
                    int i15 = ((org.telegram.ui.j4) t70Var).X;
                    TLRPC.Chat chat = t70Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i15).sendRequestTyped(tL_channels_joinChannel, new di.k1(e1Var, i15, tL_channels_joinChannel, chat));
                    break;
                }
                break;
            case 21:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) obj2;
                c5Var.b(false);
                c5Var.e.e((org.telegram.ui.d5) obj);
                break;
            case 22:
                ((org.telegram.ui.w6) obj2).e.u0((org.telegram.ui.Cells.z1) obj);
                break;
            case 23:
                org.telegram.ui.d7 d7Var = (org.telegram.ui.d7) obj2;
                org.telegram.ui.l7 l7Var = (org.telegram.ui.l7) obj;
                org.telegram.ui.h7 h7Var = d7Var.d.v;
                if (h7Var != null) {
                    h7Var.a0(l7Var.c, l7Var.d, true);
                }
                org.telegram.ui.ActionBar.p1 p1Var2 = d7Var.a;
                if (p1Var2 != null) {
                    p1Var2.d(true);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.k9 k9Var = (org.telegram.ui.k9) obj2;
                org.telegram.ui.g9 g9Var = (org.telegram.ui.g9) obj;
                ArrayList arrayList = g9Var.b;
                if (arrayList.size() != 1) {
                    boolean z10 = g9Var.e;
                    HashSet hashSet = new HashSet();
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList.get(i16);
                        i16++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) g9Var.c.get(0)).id;
                    org.telegram.ui.ActionBar.d2 d2Var5 = new org.telegram.ui.ActionBar.d2(k9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = k9Var.getMessagesController().conferenceCallSizeLimit;
                    d2Var5.setOnCancelListener(new org.telegram.ui.p8(k9Var, k9Var.getConnectionsManager().sendRequest(getgroupcall, new org.telegram.ui.o8(k9Var, d2Var5, hashSet, tL_inputGroupCallInviteMessage, z10, 1)), i14));
                    d2Var5.q(600L);
                    break;
                } else {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = k9Var.getMessagesController().getUserFull(user.id);
                    k9Var.P = user;
                    boolean z11 = g9Var.e;
                    org.telegram.ui.Components.voip.e2.m(user, z11, z11 || (userFull != null && userFull.video_calls_available), k9Var.getParentActivity(), null, k9Var.getAccountInstance());
                    break;
                }
            case 25:
                org.telegram.ui.le leVar = (org.telegram.ui.le) obj2;
                fb1 fb1Var = (fb1) obj;
                d dVar2 = leVar.K0;
                if (view.isEnabled() && !dVar2.N) {
                    org.telegram.ui.ce ceVar2 = leVar.Q0;
                    if (ceVar2 == null || !ceVar2.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        org.telegram.ui.td tdVar = new org.telegram.ui.td(leVar, twoStepVerificationActivity, i13);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.b0 = tdVar;
                        dVar2.setLoading(true);
                        twoStepVerificationActivity.s0(new org.telegram.ui.ud(leVar, fb1Var, twoStepVerificationActivity, i13));
                        break;
                    }
                }
                break;
            case 26:
                nf.f.s((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                break;
            case 27:
                eo eoVar = (eo) obj2;
                if (eoVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    eoVar.Q7();
                    UndoView undoView = eoVar.y3;
                    if (undoView != null) {
                        long j3 = eoVar.T5;
                        int i17 = UndoView.e0;
                        undoView.j(83, j3, new org.telegram.ui.l4(eoVar, 1));
                    }
                }
                eoVar.A7(true);
                break;
            case 28:
                eo.I0((eo) obj2, (String) obj);
                break;
            default:
                eo.y1((eo) obj2, (w70) obj);
                break;
        }
    }
}
