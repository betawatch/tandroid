// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.z;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kb1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kb1(e13 e13Var, Context context, ghb ghbVar) {
        this.a = (byte) 25;
        this.b = context;
        this.c = ghbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v5, types: [vkb, wjb] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b;
        boolean z;
        View view2;
        FrameLayout frameLayout;
        View view3;
        byte b2 = this.a;
        byte b3 = 7;
        int i = 2;
        ?? r10 = 0;
        ArrayList arrayList = null;
        byte b4 = 0;
        byte b5 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b2) {
            case 0:
                mb1 mb1Var = (mb1) obj2;
                z zVar = (z) obj;
                cs5 cs5Var = mb1Var.X0;
                if (cs5Var != null && cs5Var.E()) {
                    mb1Var.X0.u();
                    mb1Var.X0 = null;
                    return;
                }
                mb1Var.d1.f(true);
                cs5 G = cs5.G(zVar, new f53(), mb1Var.V0);
                mb1Var.X0 = G;
                G.s = (short) 0;
                G.o(13, gl.L(200.0f), k96.M0(2131743894, null));
                mb1Var.X0.j();
                int[] iArr = mb1Var.c1;
                int length = iArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr[i2];
                    mb1Var.X0.b(0, i3 == 0 ? k96.M0(2131743895, null) : i3 == Integer.MAX_VALUE ? k96.M0(2131743893, null) : k96.G(i3, "Seconds", new Object[0]), new eg((Object) mb1Var, i3, (byte) 10), false);
                    if (mb1Var.b1 == i3) {
                        mb1Var.X0.M();
                    }
                }
                mb1Var.X0.a0();
                return;
            case 1:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((fx0) obj2).dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(ProfileActivity.P2(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 2:
                zi1 zi1Var = (zi1) obj2;
                uxa uxaVar = (uxa) obj;
                u41 u41Var = zi1Var.A0;
                if (!view.isEnabled() || u41Var.R) {
                    return;
                }
                oi1 oi1Var = zi1Var.G0;
                if (oi1Var == null || !oi1Var.R) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    gi1 gi1Var = new gi1(zi1Var, twoStepVerificationActivity, b4);
                    twoStepVerificationActivity.a0 = (byte) 1;
                    twoStepVerificationActivity.c0 = gi1Var;
                    u41Var.setLoading(true);
                    twoStepVerificationActivity.w0(new hi1(zi1Var, uxaVar, twoStepVerificationActivity, b4));
                    return;
                }
                return;
            case 3:
                d01.t((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                return;
            case 4:
                mu1 mu1Var = (mu1) obj2;
                hq6 mediaDataController = mu1Var.getMediaDataController();
                TLRPC.Document F0 = ((k27) obj).F0();
                if (F0 == null) {
                    mediaDataController.getClass();
                } else {
                    if (mediaDataController.A0.c(F0.id) == null) {
                        if (F0.size > na7.q1(mediaDataController.currentAccount).k4.R0.f()) {
                            kk7.e().k(kk7.R4, 4, k96.a0("TooLargeError", null, 2131743802, new Object[0]), k96.a0("ErrorRingtoneSizeTooBig", null, 2131751090, Integer.valueOf(na7.q1(y6c.t0).k4.R0.f() / 1024)));
                        } else {
                            for (int i4 = 0; i4 < F0.attributes.size(); i4++) {
                                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i4);
                                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration > na7.q1(mediaDataController.currentAccount).k4.S0.f()) {
                                    kk7.e().k(kk7.R4, 4, k96.a0("TooLongError", null, 2131743801, new Object[0]), k96.a0("ErrorRingtoneDurationTooLong", null, 2131751092, Integer.valueOf(na7.q1(y6c.t0).k4.S0.f())));
                                }
                            }
                            TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            saveringtone.id = tL_inputDocument;
                            tL_inputDocument.id = F0.id;
                            tL_inputDocument.file_reference = F0.file_reference;
                            tL_inputDocument.access_hash = F0.access_hash;
                            ConnectionsManager.getInstance(mediaDataController.currentAccount).sendRequest(saveringtone, new rv3(mediaDataController, F0, (byte) 25));
                        }
                    }
                    b4 = 1;
                }
                if (b4 != 0) {
                    mu1Var.Z5();
                    UndoView undoView = mu1Var.N3;
                    if (undoView != null) {
                        long j = mu1Var.l6;
                        int i5 = UndoView.j0;
                        undoView.j(83, j, new hx(mu1Var, (byte) 1));
                    }
                }
                mu1Var.F5(true);
                return;
            case 5:
                ((mu1) obj2).y9((String) obj);
                return;
            case 6:
                ((mu1) obj2).z9((cs5) obj);
                return;
            case 7:
                ag2 ag2Var = (ag2) obj2;
                boolean z2 = !ag2Var.b();
                ag2Var.c(z2, true);
                ((AtomicBoolean) obj).set(z2);
                return;
            case 8:
                ((mu1) obj2).E8((Context) obj);
                return;
            case 9:
                ((c42) obj2).W((wjb) obj);
                return;
            case 10:
                k62 k62Var = (k62) ((s20) obj2).e;
                rkb rkbVar = k62Var.s;
                View F = rkbVar.F((i62) obj);
                s49 T = F == null ? null : rkbVar.T(F);
                if (T == null || (b = T.b() - k62Var.u0) < 0 || b >= k62Var.L.length) {
                    return;
                }
                k62Var.e0(b);
                return;
            case 11:
                o72 o72Var = (o72) obj2;
                wjb wjbVar = (wjb) obj;
                mu1 mu1Var2 = o72Var.H;
                if (o72Var.U) {
                    mu1Var2.showDialog(ij.S(o72Var.getContext(), mu1Var2.h, wjbVar).a);
                    return;
                }
                k72 k72Var = o72Var.e;
                if (mu1Var2.getParentActivity() != null) {
                    TLRPC.Chat chat = mu1Var2.e;
                    if (chat != null && !hc2.y(13, chat)) {
                        if (!o72Var.a.f || mu1Var2.getParentActivity() == null || mu1Var2.fragmentView == null || mu1Var2.r8 == null) {
                            return;
                        }
                        if (mu1Var2.D2 == null) {
                            je5 r4 = mu1Var2.r4(310.0f, 1, -1, false);
                            mu1Var2.D2 = r4;
                            r4.d = 4000L;
                        }
                        int i6 = mu1Var2.r8.ttl_period;
                        mu1Var2.D2.t(k96.a0("AutoDeleteSetInfo", null, 2131753841, i6 > 86400 ? k96.G(i6 / 86400, "Days", new Object[0]) : i6 >= 3600 ? k96.G(i6 / 3600, "Hours", new Object[0]) : i6 >= 60 ? k96.G(i6 / 60, "Minutes", new Object[0]) : k96.G(i6, "Seconds", new Object[0])));
                        mu1Var2.D2.x(mu1Var2.p1.getTimeItem(), true);
                        return;
                    }
                    TLRPC.ChatFull chatFull = mu1Var2.r8;
                    TLRPC.UserFull userFull = mu1Var2.s8;
                    int i7 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                    spc spcVar = new spc(o72Var.getContext(), null, new l72(o72Var, r4), true, 0, o72Var.e0);
                    spcVar.B(i7);
                    m72 m72Var = new m72(o72Var, (ActionBarPopupWindow$ActionBarPopupWindowLayout) spcVar.b);
                    m8[] m8VarArr = {m72Var};
                    m72Var.e = true;
                    m72Var.c = (short) 220;
                    m72Var.setOutsideTouchable(true);
                    m8VarArr[0].setClippingEnabled(true);
                    m8VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    m8VarArr[0].setFocusable(true);
                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) spcVar.b).measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
                    m8VarArr[0].setInputMethodMode(2);
                    m8VarArr[0].getContentView().setFocusableInTouchMode(true);
                    m8VarArr[0].showAtLocation(k72Var, 0, (int) (o72Var.getX() + k72Var.getX()), (int) k72Var.getY());
                    mu1Var2.p6(false, true, 0.2f);
                    return;
                }
                return;
            case 12:
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                r72 r72Var = ((s72) obj2).w;
                if (r72Var != null) {
                    ao0 ao0Var = ((sn0) r72Var).a;
                    ao0Var.X1.remove(chat2);
                    ao0Var.f1(true, true);
                    return;
                }
                return;
            case 13:
                p82 p82Var = (p82) obj2;
                Context context = (Context) obj;
                i4d i4dVar = new i4d(context, null);
                Object obj3 = i4dVar.a;
                ((fx0) obj3).v0 = false;
                LinearLayout j2 = de9.j(context, 1);
                ld5 ld5Var = new ld5(context, bkb.m5, 23, 15, false, null);
                ld5Var.setHeight(47);
                ld5Var.setText(k96.M0(2131752221, "ChatHistory"));
                j2.addView(ld5Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                j2.addView(linearLayout, nme.o(-1, -2));
                uy8[] uy8VarArr = new uy8[2];
                int i8 = 0;
                while (i8 < i) {
                    uy8 uy8Var = new uy8(context, true);
                    uy8VarArr[i8] = uy8Var;
                    uy8Var.setTag(Integer.valueOf(i8));
                    zkb.R(uy8VarArr[i8], bkb.L0(false), r10, zkb.M(bkb.h6), r10);
                    if (i8 == 0) {
                        uy8VarArr[i8].b(k96.M0(2131752216, "ChatHistoryVisible"), k96.M0(2131752215, "ChatHistoryVisibleInfo"), true, !p82Var.K0);
                    } else if (hc2.T(p82Var.x0)) {
                        uy8VarArr[i8].b(k96.M0(2131752220, "ChatHistoryHidden"), k96.M0(2131752219, "ChatHistoryHiddenInfo"), false, p82Var.K0);
                    } else {
                        uy8VarArr[i8].b(k96.M0(2131752220, "ChatHistoryHidden"), k96.M0(2131752218, "ChatHistoryHiddenInfo2"), false, p82Var.K0);
                    }
                    linearLayout.addView(uy8VarArr[i8], nme.o(-1, -2));
                    uy8VarArr[i8].setOnClickListener(new b0(p82Var, uy8VarArr, i4dVar, (byte) 22));
                    i8++;
                    i = 2;
                    r10 = 0;
                }
                fx0 fx0Var = (fx0) obj3;
                fx0Var.O = j2;
                p82Var.showDialog(fx0Var);
                return;
            case 14:
                ((p82) obj2).g0((FrameLayout) obj, view);
                return;
            case 15:
                TLRPC.Document document = (TLRPC.Document) obj;
                h92 h92Var = ((i92) obj2).d;
                if (h92Var != null) {
                    h92Var.b(document);
                    return;
                }
                return;
            case 16:
                TLRPC.Document document2 = (TLRPC.Document) obj;
                h92 h92Var2 = ((t31) obj2).d;
                if (h92Var2 != null) {
                    h92Var2.b(document2);
                    return;
                }
                return;
            case 17:
                ((zc2) obj2).g0((i4d) obj, view);
                return;
            case 18:
                xd2 xd2Var = (xd2) obj2;
                mu1 mu1Var3 = (mu1) obj;
                if (xd2Var.p1 == null) {
                    xd2Var.dismiss();
                    return;
                }
                xd2Var.p1 = null;
                xd2Var.dismiss();
                je2.e(xd2Var.a).a(mu1Var3.a(), true, false);
                return;
            case 19:
                mf2 mf2Var = (mf2) obj2;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj;
                m41 m41Var = mf2Var.U1;
                u41 u41Var2 = mf2Var.Y1;
                if (u41Var2.R) {
                    return;
                }
                u41Var2.setLoading(true);
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.bot = na7.q1(mf2Var.a).m1(tL_connectedBot.bot_id);
                updateconnectedbot.recipients = m41Var.b();
                ConnectionsManager.getInstance(mf2Var.a).sendRequest(updateconnectedbot, new en0((Object) mf2Var, (Object) tL_connectedBot, (Object) m41Var.c(), (byte) 19));
                return;
            case 20:
                yl2 yl2Var = (yl2) obj2;
                Context context2 = (Context) obj;
                qx qxVar = yl2Var.r1;
                switch (qxVar.a) {
                    case 5:
                        z = qxVar.b;
                        break;
                    default:
                        z = qxVar.b;
                        break;
                }
                if (z) {
                    return;
                }
                qx qxVar2 = yl2Var.r1;
                switch (qxVar2.a) {
                    case 5:
                        view2 = (q88) qxVar2.d;
                        break;
                    default:
                        view2 = (x6b) qxVar2.d;
                        break;
                }
                Bitmap I3 = gl.I3(view2);
                Bitmap createBitmap = Bitmap.createBitmap(I3.getWidth(), I3.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(-16777216);
                qx qxVar3 = yl2Var.r1;
                switch (qxVar3.a) {
                    case 5:
                        lw5 lw5Var = ((q88) qxVar3.d).M0;
                        Matrix matrix = lw5Var.getMatrix();
                        canvas.save();
                        canvas.translate(lw5Var.getX(), lw5Var.getY());
                        canvas.concat(matrix);
                        float width = lw5Var.getWidth();
                        Bitmap bitmap = (Bitmap) qxVar3.c;
                        canvas.scale(width / bitmap.getWidth(), lw5Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        canvas.drawBitmap(I3, 0.0f, 0.0f, (Paint) null);
                        I3.recycle();
                        ol2 ol2Var = new ol2(yl2Var, context2, createBitmap);
                        qx qxVar4 = yl2Var.r1;
                        switch (qxVar4.a) {
                            case 5:
                                frameLayout = ((q88) qxVar4.d).U0;
                                break;
                            default:
                                frameLayout = ((x6b) qxVar4.d).L0;
                                break;
                        }
                        frameLayout.addView(ol2Var, nme.c(-1.0f, -1));
                        qx qxVar5 = yl2Var.r1;
                        Objects.requireNonNull(qxVar5);
                        ol2Var.setColorListener(new gw(qxVar5, b3));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                        duration.setInterpolator(s33.f);
                        duration.addUpdateListener(new u28(ol2Var, (byte) 8));
                        duration.start();
                        qx qxVar6 = yl2Var.r1;
                        switch (qxVar6.a) {
                            case 5:
                                qxVar6.b = true;
                                break;
                            default:
                                qxVar6.b = true;
                                break;
                        }
                        yl2Var.dismiss();
                        return;
                    default:
                        rt7 rt7Var = ((x6b) qxVar3.d).E0;
                        Matrix matrix2 = rt7Var.getMatrix();
                        canvas.save();
                        canvas.translate(rt7Var.getX(), rt7Var.getY());
                        canvas.concat(matrix2);
                        rt7Var.getWidth();
                        throw null;
                }
            case 21:
                ((Runnable) obj).run();
                ((fn2) obj2).dismiss();
                return;
            case 22:
                it2 it2Var = (it2) obj2;
                it2Var.showDialog((fx0) ij.l(it2Var.getParentActivity(), k96.a0(null, null, 2131743437, l7c.l((TLRPC.User) obj)), k96.M0(2131743438, null), null, new be2(it2Var, (byte) 27), null, false, false, it2Var.r).a);
                return;
            case 23:
                ArrayList arrayList2 = (ArrayList) obj;
                xv2 xv2Var = ((tv2) obj2).a;
                if (xv2Var.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        vv2 vv2Var = xv2Var.l;
                        Object obj4 = xv2Var.W;
                        if (obj4 == null) {
                            obj4 = xv2Var.Z;
                        }
                        vv2Var.u(obj4, xv2Var.b0, true, 0, 0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        vv2 vv2Var2 = xv2Var.l;
                        Object obj5 = xv2Var.W;
                        if (obj5 == null) {
                            obj5 = xv2Var.Z;
                        }
                        vv2Var2.u(obj5, xv2Var.b0, false, 0, 0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        hq6 d0 = hq6.d0(xv2Var.r);
                        TLRPC.Document document3 = xv2Var.W;
                        int size = d0.j0.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 < size) {
                                if (((TLRPC.Document) d0.j0.get(i9)).id == document3.id) {
                                    d0.j0.remove(i9);
                                } else {
                                    i9++;
                                }
                            }
                        }
                        TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
                        TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                        tL_messages_saveGif.id = tL_inputDocument2;
                        tL_inputDocument2.id = document3.id;
                        tL_inputDocument2.access_hash = document3.access_hash;
                        byte[] bArr = document3.file_reference;
                        tL_inputDocument2.file_reference = bArr;
                        if (bArr == null) {
                            tL_inputDocument2.file_reference = new byte[0];
                        }
                        tL_messages_saveGif.unsave = true;
                        d0.getConnectionsManager().sendRequest(tL_messages_saveGif, new rv3(d0, tL_messages_saveGif, (byte) 24));
                        d0.getMessagesStorage().a.c(new cn6(d0, document3, b5));
                        xv2Var.l.M();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        hq6.d0(xv2Var.r).c(xv2Var.W, (int) (System.currentTimeMillis() / 1000), true);
                        na7.q1(xv2Var.r).v4("gif", xv2Var.W);
                        xv2Var.l.M();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document4 = xv2Var.W;
                        TLRPC.BotInlineResult botInlineResult = xv2Var.Z;
                        Object obj6 = xv2Var.b0;
                        vv2 vv2Var3 = xv2Var.l;
                        ij.J(xv2Var.w, vv2Var3.a(), new lt((Object) vv2Var3, (Object) document4, (Object) botInlineResult, obj6, (byte) 7), xv2Var.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        vv2 vv2Var4 = xv2Var.l;
                        Object obj7 = xv2Var.W;
                        if (obj7 == null) {
                            obj7 = xv2Var.Z;
                        }
                        vv2Var4.I(obj7, xv2Var.b0);
                    }
                    xv2Var.d();
                    return;
                }
                return;
            case 24:
                f13 f13Var = (f13) obj2;
                f13Var.U1 = na7.q1(f13Var.a).h1(k27.B1((TLRPC.Peer) obj));
                f13Var.dismiss();
                return;
            case 25:
                Context context3 = (Context) obj2;
                gl.g(((ghb) obj).a.getText().toString());
                if (gl.D3()) {
                    Toast.makeText(context3, k96.M0(2131743953, null), 0).show();
                    return;
                }
                return;
            case 26:
                s43 s43Var = (s43) obj2;
                String str = (String) obj;
                if (s43Var.b == null && (view3 = s43Var.d) != null) {
                    View findFocus = view3.findFocus();
                    if (findFocus instanceof EditText) {
                        s43Var.b = (EditText) findFocus;
                    }
                }
                if (s43Var.b != null) {
                    try {
                        s43Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = s43Var.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).v(true, false);
                    }
                    Editable text = s43Var.b.getText();
                    int length2 = s43Var.b.getSelectionEnd() == s43Var.b.length() ? -1 : str.length() + s43Var.b.getSelectionStart();
                    if (s43Var.b.getSelectionStart() == -1 || s43Var.b.getSelectionEnd() == -1) {
                        s43Var.b.setText(str);
                        EditText editText2 = s43Var.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = s43Var.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), s43Var.b.getSelectionEnd(), str));
                        EditText editText4 = s43Var.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = s43Var.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).v(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                sd3 sd3Var = (sd3) obj2;
                rd3 rd3Var = (rd3) obj;
                sd3Var.S0();
                rd3Var.f = !rd3Var.f;
                rd3Var.j.S1.O(true);
                sd3Var.D0();
                return;
            case 28:
                ((sd3) obj2).w2 = !r0.w2;
                ((l5c) obj).O(true);
                return;
            default:
                je3 je3Var = (je3) obj2;
                v61 v61Var = (v61) obj;
                ie3 ie3Var = je3Var.S1;
                f15[] f15VarArr = je3Var.W1;
                for (f15 f15Var : f15VarArr) {
                    if (f15Var != null) {
                        boolean z3 = f15Var.b;
                    }
                }
                ag2 ag2Var2 = (ag2) view;
                int intValue2 = ((Integer) ag2Var2.getTag()).intValue();
                f15 f15Var2 = f15VarArr[intValue2];
                boolean z4 = f15Var2.b;
                boolean z5 = !z4;
                if (z4 != z5) {
                    f15Var2.b = z5;
                    f15Var2.c = true;
                    z4 = z5;
                }
                ag2Var2.c(z4, true);
                boolean z6 = f15VarArr[intValue2].b;
                ArrayList arrayList3 = v61Var.d;
                HashSet hashSet = v61Var.j;
                if (intValue2 == 0) {
                    v61Var.m = z6;
                } else {
                    if (intValue2 != 1) {
                        if (intValue2 == 2) {
                            arrayList = v61Var.e;
                            v61Var.o = z6;
                        } else if (intValue2 == 3) {
                            arrayList = v61Var.f;
                            v61Var.p = z6;
                        } else if (intValue2 == 4) {
                            arrayList = v61Var.g;
                            v61Var.q = z6;
                        } else if (intValue2 == 7) {
                            arrayList = v61Var.h;
                        }
                        if (arrayList != null) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (((u61) arrayList.get(i10)).d == intValue2) {
                                    if (z6) {
                                        if (!hashSet.contains(arrayList.get(i10))) {
                                            hashSet.add((u61) arrayList.get(i10));
                                            v61Var.g((u61) arrayList.get(i10), true);
                                        }
                                    } else if (hashSet.contains(arrayList.get(i10))) {
                                        hashSet.remove(arrayList.get(i10));
                                        v61Var.g((u61) arrayList.get(i10), false);
                                    }
                                }
                            }
                        }
                        je3Var.Z1.d();
                        je3Var.V1.a(ie3Var.d(), true);
                        ie3Var.c(true);
                        return;
                    }
                    v61Var.n = z6;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                je3Var.Z1.d();
                je3Var.V1.a(ie3Var.d(), true);
                ie3Var.c(true);
                return;
        }
    }

    public /* synthetic */ kb1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
