package ag;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import bi.q6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import m.p3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.nj;
import org.telegram.messenger.q20;
import org.telegram.messenger.t9;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.x9;
import org.telegram.messenger.zc;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.i31;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.l31;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.o4;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.t10;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.za0;
import org.telegram.ui.er0;
import org.telegram.ui.un;
import org.telegram.ui.v50;
import org.telegram.ui.xk;
import org.telegram.ui.zd;
import rh.y7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean t12;
        za0 za0Var;
        org.telegram.ui.ActionBar.p2 p2Var;
        int i10 = 3;
        int i11 = 6;
        int i12 = 2;
        CharSequence charSequence = null;
        boolean z10 = false;
        z10 = false;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                z60 F = z60.F(((un) this.c).getLayoutContainer(), (p6) this.d, jVar.n);
                F.c(R.drawable.msg_cancel, cd.L0(2131753702, null), new h(jVar, c10 == true ? 1 : 0), true);
                F.E();
                if (jVar.y != null) {
                    F.c(R.drawable.msg_settings, cd.L0(2131753703, null), new h(jVar, i12), false);
                }
                F.a0(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(7.0f));
                F.s = 0;
                F.Z();
                break;
            case 1:
                j1 j1Var = (j1) this.b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.c;
                qq qqVar = (qq) this.d;
                vh.d dVar = j1Var.U1;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = vp.r1(j1Var.a).n1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(j1Var.a).sendRequest(updateconnectedbot, new k0(c11 == true ? 1 : 0, j1Var, qqVar));
                    break;
                }
                break;
            case 2:
                ai.a aVar = (ai.a) this.b;
                q20 q20Var = (q20) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z11 = aVar.Q1;
                if (chat != null && !w3.w(27, chat)) {
                    z10 = true;
                }
                aVar.d1(q20Var, z11, z10);
                break;
            case 3:
                p3 p3Var = (p3) this.b;
                q6 q6Var = (q6) this.c;
                bi.p0 p0Var = (bi.p0) this.d;
                p3Var.a();
                q6Var.D(p0Var);
                break;
            case 4:
                er0 er0Var = (er0) this.b;
                Context context = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!er0Var.u1) {
                    Runnable runnable = er0Var.D1;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                } else {
                    ig.u uVar = new ig.u(context, er0Var.z1);
                    uVar.I0(er0Var.t1.a, 2);
                    uVar.o1 = new androidx.activity.o(er0Var, bitmap, i10);
                    uVar.n1 = new jg.m(er0Var, 1);
                    uVar.show();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) this.b;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) this.c;
                p6 p6Var = (p6) this.d;
                vh.d dVar2 = rVar.X1;
                if (dVar2.c0 && !dVar2.Q) {
                    if (!rVar.d1()) {
                        dVar2.setLoading(true);
                        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        ConnectionsManager.getInstance(rVar.a).sendRequestTyped(savetone, new a3.b(c12 == true ? 1 : 0), new org.telegram.tgnet.e(rVar, p6Var, aiComposeTone, i12));
                        break;
                    } else {
                        rVar.dismiss();
                        break;
                    }
                }
                break;
            case 6:
                boolean[] zArr = (boolean[]) this.b;
                q4 q4Var = (q4) this.c;
                l2.f fVar = (l2.f) this.d;
                zArr[0] = false;
                q4Var.K(-1, 0, true);
                ((org.telegram.ui.ActionBar.z2) fVar.b).x0.run();
                break;
            case 7:
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) this.b;
                Runnable runnable2 = (Runnable) this.c;
                o4 o4Var = (o4) this.d;
                org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
                if (x1Var != null) {
                    x1Var.setOnDismissListener(null);
                }
                runnable2.run();
                o4Var.a(((org.telegram.ui.Cells.j) view).getAccountNumber());
                break;
            case 8:
                ArrayList arrayList = (ArrayList) this.b;
                Runnable runnable3 = (Runnable) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                tz.o0 = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = vp.d1().edit();
                edit.putInt("mapPreviewType", tz.o0);
                edit.apply();
                runnable3.run();
                alertDialog$Builder.a.N0.run();
                break;
            case 9:
                ((v7) this.b).n.X0((org.telegram.ui.Cells.w) this.c, (jj) this.d);
                break;
            case 10:
                bi biVar = (bi) this.b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.c;
                p6 p6Var2 = (p6) this.d;
                org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
                int i13 = biVar.D3;
                ih ihVar = biVar.C2;
                pe peVar = biVar.Y1;
                long j10 = peVar != null ? peVar.j() : 0L;
                biVar.H2 = j10;
                ihVar.setEffect(j10);
                biVar.c1 = true;
                if (biVar.B1 - biVar.C1 < 0) {
                    org.telegram.messenger.i0.E3(biVar.q1);
                    org.telegram.messenger.i0.E3(biVar.r1);
                    try {
                        ihVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!vp.r1(i13).A3() && vp.r1(i13).V4 > biVar.C1) {
                        biVar.C1(k2Var);
                    }
                    pe peVar2 = biVar.Y1;
                    if (peVar2 != null) {
                        peVar2.g(false);
                        biVar.Y1 = null;
                        break;
                    }
                } else {
                    if (biVar.B3 == null && (k2Var2 instanceof un)) {
                        un unVar = (un) k2Var2;
                        if (unVar.c()) {
                            s4.L(biVar.getContext(), unVar.a(), new m4.x0(biVar, j10, i12), p6Var2);
                            biVar.u1(false, false);
                            break;
                        }
                    }
                    uh uhVar = biVar.s2;
                    if (uhVar == biVar.a2 || uhVar == biVar.h2) {
                        t12 = biVar.t1(true, 0, 0, j10, biVar.e1());
                    } else {
                        if (!uhVar.J(true, 0, 0, j10, biVar.e1())) {
                            biVar.x4 = true;
                            biVar.dismiss();
                        }
                        t12 = false;
                    }
                    pe peVar3 = biVar.Y1;
                    if (peVar3 != null) {
                        peVar3.g(!t12);
                        biVar.Y1 = null;
                    }
                    biVar.u1(false, false);
                }
                break;
            case 11:
                bi biVar2 = (bi) this.b;
                jj jjVar = (jj) this.c;
                za0 za0Var2 = (za0) this.d;
                biVar2.u1(!biVar2.T1, true);
                TLRPC.Message message = jjVar.k;
                boolean z12 = biVar2.T1;
                message.invert_media = z12;
                za0Var2.a(!z12, true);
                biVar2.Y1.e(jjVar);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar2.a2;
                if (chatAttachAlertPhotoLayout != null && (za0Var = chatAttachAlertPhotoLayout.d1) != null) {
                    za0Var.a(!biVar2.T1, true);
                }
                biVar2.Y1.m(!biVar2.T1);
                break;
            case 12:
                cr crVar = (cr) this.b;
                q20 q20Var2 = (q20) this.c;
                vh.d dVar3 = (vh.d) this.d;
                q20Var2.a(new gf.e(new ho(dVar3, i11), new org.telegram.ui.Components.cd(26, crVar, dVar3)));
                break;
            case 13:
                br brVar = (br) this.b;
                Context context2 = (Context) this.c;
                z8 z8Var = (z8) this.d;
                brVar.getClass();
                org.telegram.messenger.i0.g(z8Var.a.getText().toString());
                if (org.telegram.messenger.i0.H3()) {
                    Toast.makeText(context2, cd.L0(2131744219, null), 0).show();
                    break;
                }
                break;
            case 14:
                mt mtVar = (mt) this.b;
                zd zdVar = (zd) this.c;
                n0 n0Var = (n0) this.d;
                try {
                    charSequence = ((ClipboardManager) mtVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(mtVar.getContext());
                } catch (Exception e) {
                    f8.g(e, true);
                }
                if (charSequence != null) {
                    zdVar.setText(charSequence);
                    zdVar.setSelection(0, zdVar.getText().length());
                }
                n0Var.run();
                break;
            case 15:
                wt wtVar = (wt) this.b;
                uu0 uu0Var = (uu0) this.c;
                p6 p6Var3 = (p6) this.d;
                rt rtVar = wtVar.a;
                r rVar2 = wtVar.b;
                if (rVar2.isEnabled() && rVar2.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.m1 m1Var = wtVar.K;
                    if (m1Var == null || !m1Var.f) {
                        if (!wtVar.n) {
                            if (!wtVar.e) {
                                wtVar.x(1);
                                boolean isFocused = rtVar.isFocused();
                                wtVar.d.D(rtVar.length() > 0, false);
                                rtVar.requestFocus();
                                if (!isFocused) {
                                    rtVar.setSelection(rtVar.length());
                                    break;
                                }
                            } else {
                                if (wtVar.y) {
                                    wtVar.k(true);
                                    wtVar.y = false;
                                    wtVar.p();
                                }
                                wtVar.v();
                                break;
                            }
                        } else {
                            rtVar.m();
                            z60 z60Var = new z60(uu0Var, p6Var3, rVar2, false, false, true);
                            z60Var.X = org.telegram.messenger.i0.L(280.0f);
                            rtVar.o(null, new z90(z60Var, rtVar));
                            z60Var.U = true;
                            z60Var.Z();
                            break;
                        }
                    }
                }
                break;
            case 16:
                t10 t10Var = (t10) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.ActionBar.k2 k2Var3 = (org.telegram.ui.ActionBar.k2) this.d;
                t10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                alertDialog$Builder2.a.R = cd.L0(2131749570, null);
                alertDialog$Builder2.a.T = org.telegram.messenger.i0.W2(cd.L0(2131749571, null));
                alertDialog$Builder2.k(cd.L0(2131749572, null), new px(t10Var, 4));
                alertDialog$Builder2.h(cd.L0(2131752589, null), null);
                k2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 17:
                j80 j80Var = (j80) this.b;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.c;
                org.telegram.ui.ActionBar.k2 k2Var4 = (org.telegram.ui.ActionBar.k2) this.d;
                try {
                    if (j80Var.b != null) {
                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", j80Var.b));
                        if (z2Var == null || (p2Var = z2Var.c) == null) {
                            cc.j(k2Var4).j();
                        } else {
                            new cc(p2Var, null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
                break;
            case 18:
                ua0 ua0Var = (ua0) this.b;
                za0 za0Var3 = (za0) this.c;
                za0 za0Var4 = (za0) this.d;
                ab0 ab0Var = ua0Var.c0;
                nj njVar = ab0Var.d;
                boolean z13 = njVar.l;
                boolean z14 = !z13;
                njVar.l = z14;
                if (z13) {
                    if (ab0Var.y) {
                        njVar.k = false;
                    }
                    ab0Var.y = false;
                } else if (!njVar.k) {
                    njVar.k = true;
                    ab0Var.y = true;
                }
                za0Var3.a(z14, true);
                za0Var4.a(njVar.k, true);
                ua0Var.i();
                ua0Var.l(true);
                break;
            case 19:
                hd0.J0((hd0) this.b, (TLRPC.ChatFull) this.c, (v50) this.d);
                break;
            case 20:
                pe0 pe0Var = (pe0) this.b;
                Context context4 = (Context) this.c;
                p6 p6Var4 = (p6) this.d;
                if (pe0Var.h == null) {
                    vh.n2 n2Var = new vh.n2(context4, p6Var4, cd.L0(2131743633, null), pe0Var.f);
                    pe0Var.h = n2Var;
                    n2Var.o(new eb0(pe0Var, 8));
                    pe0Var.h.m1 = pe0Var.n;
                }
                pe0Var.h.show();
                break;
            case 21:
                k31 k31Var = (k31) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                zc zcVar = (zc) this.d;
                m31 m31Var = k31Var.n;
                Runnable runnable4 = runnableArr[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str = m31Var.r1;
                l31 l31Var = m31Var.E1;
                if (!TextUtils.equals(str, zcVar.f)) {
                    View view2 = l31Var.d;
                    if (view2 == m31Var.v1 || view2 == m31Var.p1) {
                        m31Var.s1 = m31Var.r1;
                    }
                    i31 i31Var = k31Var.e;
                    String str2 = zcVar.f;
                    m31Var.r1 = str2;
                    i31Var.setText(m31.K0(m31.O0(str2, null, null)));
                    l31Var.D(m31Var.n1 != null ? m31Var.o1 : m31Var.u1);
                    m31.S0(m31Var.r1);
                    m31Var.W0();
                    break;
                }
                break;
            case 22:
                xk xkVar = (xk) this.b;
                org.telegram.messenger.t10 t10Var2 = (org.telegram.messenger.t10) this.c;
                org.telegram.ui.ActionBar.k1 k1Var = (org.telegram.ui.ActionBar.k1) this.d;
                long j11 = xkVar.b;
                t10Var2.J(j11, true, false);
                TLRPC.Chat L0 = vp.r1(xkVar.a).L0(Long.valueOf(-j11));
                cc.a0(xkVar.c).K(R.raw.msg_translate, org.telegram.messenger.i0.W2((L0 == null || !w3.V(L0)) ? L0 != null ? cd.L0(2131743973, null) : cd.L0(2131743974, null) : cd.L0(2131743975, null)), cd.L0(2131743910, null), new gi0(20, xkVar, t10Var2)).j();
                k1Var.d(true);
                break;
            case 23:
                ph.e eVar = (ph.e) this.b;
                new ph.m((Context) this.c, null, null, (t9) this.d).show();
                eVar.dismiss();
                break;
            case 24:
                ph.m mVar = (ph.m) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                p6 p6Var5 = (p6) this.d;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    x9.c(mVar.a).e(mVar.P1, new kg.d0(mVar, zArr2, p6Var5, i11));
                    break;
                }
                break;
            case 25:
                ph.w wVar = (ph.w) this.b;
                Context context5 = (Context) this.c;
                p6 p6Var6 = (p6) this.d;
                int i14 = wVar.a;
                t9 t9Var = wVar.e2;
                new rh.t0(context5, p6Var6, i14, t9Var.d.title, t9Var.h, false).show();
                wVar.dismiss();
                break;
            case 26:
                ph.w wVar2 = (ph.w) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                p6 p6Var7 = (p6) this.d;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    x9.c(wVar2.a).e(wVar2.Q1, new kg.d0(wVar2, zArr3, p6Var7, 7));
                    break;
                }
                break;
            case 27:
                ph.f2 f2Var = (ph.f2) this.b;
                z60 z60Var2 = (z60) this.c;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.d;
                z60Var2.u();
                vq0 vq0Var = f2Var.a;
                ph.y1 y1Var = new ph.y1(f2Var, savedStarGift, z10 ? 1 : 0);
                HashMap hashMap = ph.j2.U;
                vq0Var.h(null, y1Var);
                break;
            case 28:
                ((qg.h) this.b).a(view, (HashSet) this.c, (Runnable) this.d);
                break;
            default:
                rh.b0 b0Var = (rh.b0) this.b;
                Context context6 = (Context) this.c;
                p6 p6Var8 = (p6) this.d;
                if (b0Var.f2.a == sf.b.a) {
                    new y7(context6, p6Var8).show();
                    break;
                }
                break;
        }
    }
}
