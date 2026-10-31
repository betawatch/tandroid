package androidx.car.app.utils;

import ag.a2;
import ag.k0;
import ag.q0;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import bi.a4;
import bi.d4;
import bi.k2;
import bi.m4;
import bi.o2;
import bi.t;
import e2.l0;
import j9.e0;
import j9.q;
import j9.r;
import j9.y;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import k2.u;
import li.s;
import m4.f0;
import m4.g1;
import m4.o0;
import m4.p0;
import m4.p1;
import m4.t1;
import m4.v0;
import m4.w;
import m4.x;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.gs;
import org.telegram.messenger.h20;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.kc;
import org.telegram.messenger.mc;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.qi;
import org.telegram.messenger.qz;
import org.telegram.messenger.ri;
import org.telegram.messenger.t20;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.x20;
import org.telegram.messenger.zr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.s3;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.t3;
import org.telegram.ui.Components.tx;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.voip.m1;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.z3;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.ay;
import org.telegram.ui.pb1;
import org.telegram.ui.rm0;
import org.telegram.ui.un;
import org.telegram.ui.ux;
import xh.i3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements c, wk, u1, o0, q, org.telegram.ui.ActionBar.o0, yb0, ux, rm0, q4, t20, ri, mc, zr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean G() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    @Override // org.telegram.ui.Components.q4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void K(int i10, int i11, boolean z10) {
        int i12;
        switch (this.a) {
            case 19:
                bl blVar = (bl) this.b;
                blVar.u0.d((TLRPC.TL_messageMediaGeo) this.d, blVar.v0, z10, i10, ((Long) this.c).longValue());
                blVar.b.a(true);
                break;
            case 20:
                jn jnVar = (jn) this.b;
                jnVar.j0.e((TLRPC.TL_messageMediaToDo) this.d, null, null, null, z10, i10, ((Long) this.c).longValue());
                jnVar.b.a(true);
                break;
            default:
                x40 x40Var = (x40) this.b;
                u40 u40Var = (u40) this.d;
                x20 x20Var = (x20) this.c;
                e50 e50Var = x40Var.H0;
                ef efVar = new ef(0, x40Var.a.getAbsolutePath(), 0, true, 0, 0);
                if (u40Var != null) {
                    efVar.x = u40Var.c;
                    efVar.y = u40Var.d;
                }
                s40 s40Var = e50Var.h;
                boolean z11 = z10 || u40Var == null || u40Var.a;
                if (i10 == 0) {
                    if (u40Var == null) {
                        i12 = 0;
                        s40Var.t(efVar, x20Var, z11, i12, i11 == 0 ? i11 : 0, false, u40Var == null ? u40Var.e : 0L);
                        e50Var.r(false, false);
                        break;
                    } else {
                        i10 = u40Var.b;
                    }
                }
                i12 = i10;
                s40Var.t(efVar, x20Var, z11, i12, i11 == 0 ? i11 : 0, false, u40Var == null ? u40Var.e : 0L);
                e50Var.r(false, false);
        }
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean N(ay ayVar) {
        return false;
    }

    @Override // org.telegram.messenger.t20
    public void a(int i10, TLObject tLObject) {
        vr vrVar = (vr) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.c;
        long d = o5.d(tLObject);
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            vp.r1(vrVar.a).h0(-vrVar.Q1.id, ((Integer) arrayList.get(i12)).intValue(), d);
        }
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj = arrayList2.get(i11);
            i11++;
            vp.r1(vrVar.a).h0(vrVar.U1, ((Integer) obj).intValue(), d);
        }
    }

    @Override // j9.q
    public y apply(Object obj) {
        int i10 = this.a;
        int i11 = 21;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i10) {
            case 7:
                f0 f0Var = (f0) obj4;
                Handler handler = f0Var.l;
                u uVar = new u(f0Var, (w) obj3, new s(f0Var, (v0) obj2, (x) obj, 4));
                t1 t1Var = new t1(0);
                String str = l0.a;
                e0 e0Var = new e0();
                l0.W(handler, new a3.l0(e0Var, uVar, t1Var, i11));
                return e0Var;
            default:
                f0 f0Var2 = (f0) obj4;
                w wVar = (w) obj3;
                List list = (List) obj;
                Handler handler2 = f0Var2.l;
                u uVar2 = new u(f0Var2, wVar, new q0(f0Var2, (g1) obj2, wVar, list, 13));
                t1 t1Var2 = new t1(0);
                String str2 = l0.a;
                e0 e0Var2 = new e0();
                l0.W(handler2, new a3.l0(e0Var2, uVar2, t1Var2, i11));
                return e0Var2;
        }
    }

    @Override // m4.o0
    public void b(w wVar) {
        p0 p0Var = (p0) this.b;
        Bundle bundle = (Bundle) this.d;
        ResultReceiver resultReceiver = (ResultReceiver) this.c;
        f0 f0Var = p0Var.h;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        j9.w n10 = f0Var.n(wVar);
        if (resultReceiver != null) {
            n10.a(new u(19, n10, resultReceiver), r.a);
        }
    }

    @Override // org.telegram.messenger.ri
    public void c(String str, ArrayList arrayList) {
        switch (this.a) {
            case 23:
                tx txVar = (tx) this.b;
                String str2 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.Components.ux uxVar = txVar.a;
                if (str2.equals(uxVar.w)) {
                    uxVar.x = str;
                    uxVar.n.addAll(arrayList);
                    runnable.run();
                    break;
                }
                break;
            default:
                py pyVar = (py) this.b;
                HashMap hashMap = (HashMap) this.d;
                Runnable runnable2 = (Runnable) this.c;
                HashMap hashMap2 = pyVar.f;
                if (pyVar.x.M == pyVar.b) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        String str3 = ((qi) arrayList.get(i10)).a;
                        ArrayList arrayList2 = (ArrayList) hashMap.get(str3);
                        if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                            hashMap2.put(arrayList2, str3);
                            pyVar.h.add(arrayList2);
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
        }
    }

    @Override // androidx.car.app.utils.c
    public void call() {
        w.b bVar;
        switch (this.a) {
            case 0:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str = (String) this.c;
                Object obj = this.d;
                if (obj == null) {
                    bVar = null;
                } else {
                    try {
                        bVar = new w.b(obj);
                    } catch (w.f e) {
                        h.f(iOnDoneCallback, str, e);
                        return;
                    }
                }
                iOnDoneCallback.onSuccess(bVar);
                break;
            default:
                IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.b;
                Exception exc = (Exception) this.d;
                String str2 = (String) this.c;
                try {
                    iOnDoneCallback2.onFailure(new w.b(new FailureResponse(exc)));
                    break;
                } catch (w.f e7) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e7);
                }
        }
    }

    @Override // org.telegram.ui.Components.wk
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.a) {
            case 2:
                t tVar = (t) this.b;
                bi.a aVar = (bi.a) this.d;
                bi biVar = (bi) this.c;
                d4 d4Var = tVar.r;
                if (messageMedia != null && messageMedia.geo != null) {
                    o2 o2Var = d4Var.Q3;
                    if (o2Var != null) {
                        o2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.w = 600;
                        pageblockmap.h = 400;
                    }
                    o2 o2Var2 = d4Var.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                    tVar.Y(true);
                    biVar.a(true);
                    d4Var.post(new bi.h(tVar, aVar, 0));
                    break;
                }
                break;
            default:
                k2 k2Var = (k2) this.b;
                bi.a aVar2 = (bi.a) this.d;
                bi biVar2 = (bi) this.c;
                if (messageMedia != null && messageMedia.geo != null) {
                    o2 o2Var3 = k2Var.P.Q3;
                    if (o2Var3 != null) {
                        o2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.w = 600;
                        pageblockmap2.h = 400;
                    }
                    o2 o2Var4 = k2Var.P.Q3;
                    if (o2Var4 != null) {
                        o2Var4.h();
                    }
                    biVar2.a(true);
                    k2Var.P.post(new bi.t1(k2Var, aVar2, 9));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.rm0
    public void e(int i10) {
        fc0 fc0Var = (fc0) this.b;
        i3 i3Var = (i3) this.d;
        String str = (String) this.c;
        if (i10 != 3) {
            fc0Var.dismiss();
        }
        i3Var.getWebViewContainer().F(str, f1.A(i10).toLowerCase(Locale.ROOT), false);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(x1 x1Var, int i10) {
        int i11 = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i11) {
            case 4:
                m4 m4Var = (m4) obj;
                String trim = ((EditTextBoldCursor) obj3).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) obj2).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    switch (m4Var.a) {
                        case 1:
                            a4 a4Var = m4Var.b;
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            a4Var.a(trim, tL_inlineButtonTypeUrl);
                            break;
                        default:
                            a4 a4Var2 = m4Var.b;
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            a4Var2.a(trim, tL_inlineButtonTypeCopy);
                            break;
                    }
                }
                break;
            case 5:
                kg.q0 q0Var = (kg.q0) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                q0Var.dismiss();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i12);
                    vp.r1(q0Var.a).N3(chat, false);
                    vp.r1(q0Var.a).f0(chat.id, user);
                }
                break;
            case 9:
                ((boolean[]) obj3)[0] = true;
                ((q20) obj2).a(Boolean.FALSE);
                ((x1[]) obj)[0].dismiss();
                break;
            case 14:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                jj jjVar = (jj) obj2;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) obj;
                Activity activity = chatActivityEnterView.O2;
                if (activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                    chatActivityEnterView.i3 = jjVar;
                    chatActivityEnterView.j3 = keyboardButtonProto;
                    break;
                } else {
                    qz.C(chatActivityEnterView.Q).o0(jjVar, keyboardButtonProto);
                    break;
                }
            case 16:
                bi biVar = (bi) obj3;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                int i13 = biVar.D3;
                if (tL_attachMenuBot != null) {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = vp.r1(i13).p1(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new k0(25, biVar, tL_attachMenuBot), 66);
                    break;
                } else {
                    ui.b0(i13).L1(user2.id);
                    break;
                }
            case 18:
                kk kkVar = (kk) obj3;
                a2 a2Var = (a2) obj2;
                c2 c2Var = (c2) obj;
                TextView textView = kkVar.U;
                if (a2Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i14 = -kkVar.v0;
                    kkVar.v0 = i14;
                    i0.F3(i14, a2Var, null);
                    break;
                } else {
                    String trim3 = a2Var.getText().toString().trim();
                    kkVar.s0 = TextUtils.isEmpty(trim3) ? null : trim3;
                    kkVar.t0 = !c2Var.b();
                    if (TextUtils.isEmpty(kkVar.s0)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(kkVar.s0);
                        textView.setVisibility(0);
                    }
                    kkVar.i0();
                    x1Var.dismiss();
                    kkVar.Y();
                    break;
                }
            case 21:
                jn jnVar = (jn) obj3;
                View view = (View) obj2;
                jnVar.getClass();
                view.setTag(null);
                jnVar.a0(view, (e6) obj, false);
                break;
            case 26:
                zt0 zt0Var = (zt0) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                ((th.q4) obj2).F(arrayList2);
                cc.a0(zt0Var.x1).Q(R.raw.ic_delete, 36, cd.G(arrayList2.size(), "BotPreviewsDeleted", new Object[0])).j();
                zt0Var.T(false);
                break;
            default:
                boolean[] zArr = (boolean[]) obj3;
                JsPromptResult jsPromptResult = (JsPromptResult) obj2;
                mt mtVar = (mt) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(mtVar.getText().toString());
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.zr
    public void i(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.b;
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.d;
        m1.l(chat, null, true, null, k2Var.getParentActivity(), k2Var, (org.telegram.messenger.c) this.c);
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void k(int i10) {
        q4 q4Var = (q4) this.b;
        boolean[] zArr = (boolean[]) this.d;
        l2.f fVar = (l2.f) this.c;
        if (i10 == 1) {
            q4Var.K(2147483646, 0, zArr[0]);
            ((z2) fVar.b).x0.run();
        }
    }

    @Override // org.telegram.messenger.mc
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        e11 e11Var = (e11) this.b;
        cp cpVar = (cp) this.d;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.c;
        kc p5 = imageReceiver.p();
        if (!z10 || p5 == null || (bitmap = p5.c) == null) {
            return;
        }
        Drawable drawable = cpVar.b;
        if (drawable instanceof jb0) {
            jb0 jb0Var = (jb0) drawable;
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            jb0Var.s(e11.e(bitmap), (wallPaperSettings == null || wallPaperSettings.intensity >= 0) ? 100 : -100);
            jb0Var.t(e11Var.L);
            e11Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.yb0
    public void t(ac0 ac0Var, int i10) {
        switch (this.a) {
            case 11:
                s4.g(null, null, 0L, 0L, 0, (ac0) this.b, (z3) this.d, (org.telegram.ui.Components.a4) this.c);
                break;
            default:
                s4.g(null, null, 0L, 0L, 0, (ac0) this.b, (s3) this.d, (t3) this.c);
                break;
        }
    }

    @Override // org.telegram.ui.ux
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        jj jjVar = (jj) this.d;
        TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.c;
        un unVar = chatActivityEnterView.P2;
        TLRPC.Message message = jjVar.k;
        long j10 = message.from_id.user_id;
        long j11 = message.via_bot_id;
        if (j11 != 0) {
            j10 = j11;
        }
        TLRPC.User Z1 = vp.r1(chatActivityEnterView.R.a).Z1(Long.valueOf(j10));
        if (Z1 == null) {
            ayVar.finishFragment();
            return true;
        }
        long j12 = ((gs) arrayList.get(0)).a;
        ui.b0(chatActivityEnterView.Q).Q1(j12, 0, "@" + h20.n(Z1) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, null, null, 0L, true, false, null);
        if (j12 == chatActivityEnterView.Q2) {
            ayVar.finishFragment();
            return true;
        }
        if (o5.C(j12)) {
            ayVar.finishFragment();
            return true;
        }
        Bundle bundle = new Bundle();
        if (o5.E(j12)) {
            bundle.putLong("user_id", j12);
        } else {
            bundle.putLong("chat_id", -j12);
        }
        if (vp.r1(chatActivityEnterView.R.a).E(bundle, ayVar, null, null)) {
            if (!unVar.presentFragment(new un(bundle), true)) {
                ayVar.finishFragment();
                return true;
            }
            if (!i0.Q1()) {
                unVar.removeSelfFromStack();
            }
        }
        return true;
    }

    public /* synthetic */ a(p0 p0Var, p1 p1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 6;
        this.b = p0Var;
        this.d = bundle;
        this.c = resultReceiver;
    }

    public /* synthetic */ a(tx txVar, String str, Runnable runnable) {
        this.a = 23;
        this.b = txVar;
        this.c = str;
        this.d = runnable;
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void q(int i10, Drawable drawable) {
    }
}
