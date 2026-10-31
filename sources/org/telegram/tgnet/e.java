package org.telegram.tgnet;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.j20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g0;
import org.telegram.ui.Components.z;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.k3;
import org.telegram.ui.m90;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.d0;
import org.telegram.ui.web.x0;
import org.telegram.ui.web.z0;
import ph.q3;
import rh.b0;
import rh.e1;
import rh.e4;
import vh.p2;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x034f  */
    @Override // org.telegram.messenger.j20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        k2 T;
        fc fcVar;
        int i10;
        fc fcVar2;
        int i11 = this.a;
        int i12 = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i11) {
            case 0:
                ((ConnectionsManager) obj5).lambda$sendRequestTypedAndProcessUpdates$5((Executor) obj4, (j20) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                g0 g0Var = (g0) obj5;
                ((gf.e) obj4).c(false);
                org.telegram.messenger.e Q1 = vp.r1(g0Var.a).Q1();
                Q1.b.remove((TL_aicompose.TL_aiComposeTone) obj3);
                Q1.d();
                Q1.c();
                g0Var.x1();
                break;
            case 2:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) obj5;
                p6 p6Var = (p6) obj4;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout = rVar.W1;
                rVar.X1.setLoading(false);
                if (tL_error != null) {
                    if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                        g0.t1(new cc(frameLayout, p6Var), rVar.a);
                        break;
                    } else {
                        f1.s(frameLayout, p6Var, tL_error, false);
                        break;
                    }
                } else {
                    org.telegram.messenger.e Q12 = vp.r1(rVar.a).Q1();
                    ArrayList arrayList = Q12.b;
                    if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                        long j10 = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).id;
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            if ((arrayList.get(i13) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i13)).id == j10) {
                                rVar.dismiss();
                                T = LaunchActivity.T();
                                if (T == null) {
                                    cc.a0(T).p(aiComposeTone.emoji_id, cd.L0(2131754958, null), cd.a0(null, null, 2131754959, aiComposeTone.title)).j();
                                    break;
                                }
                            }
                        }
                    }
                    arrayList.add(0, aiComposeTone);
                    Q12.d();
                    Q12.c();
                    rVar.dismiss();
                    T = LaunchActivity.T();
                    if (T == null) {
                    }
                }
                break;
            case 3:
                z zVar = (z) obj5;
                ((gf.e) obj4).c(false);
                ((x1) obj3).dismiss();
                zVar.dismiss();
                org.telegram.messenger.e Q13 = vp.r1(zVar.a).Q1();
                Q13.b.remove(zVar.b2);
                Q13.d();
                Q13.c();
                break;
            case 4:
                z0 z0Var = (z0) obj5;
                x0 x0Var = (x0) obj4;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj3;
                String str = (String) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                if (TextUtils.isEmpty(str)) {
                    z0Var.y(x0Var, "prepared_message_sent", null);
                    d0 d0Var = z0Var.c;
                    if (d0Var != null) {
                        d0Var.c();
                    }
                    i0.h3(new k3(23, botWebViewContainer$BotWebViewProxy, arrayList2), 500L);
                    break;
                } else {
                    z0Var.y(x0Var, "prepared_message_failed", z0.A(str, "error"));
                    break;
                }
            case 5:
                ph.w wVar = (ph.w) obj5;
                p2[] p2VarArr = (p2[]) obj4;
                FrameLayout frameLayout2 = (FrameLayout) obj3;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                p2 p2Var = p2VarArr[0];
                if (p2Var != null) {
                    p2Var.e(true);
                }
                SpannableStringBuilder V2 = i0.V2(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y3 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof ec) {
                    Layout layout = ((ec) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        fc[] fcVarArr = (fc[]) spanned.getSpans(0, text.length(), fc.class);
                        if (fcVarArr.length > 0 && (fcVar = fcVarArr[0]) != null) {
                            x10 += layout.getPrimaryHorizontal(spanned.getSpanStart(fcVar)) + (fcVarArr[0].a() / 2);
                            y3 += layout.getLineTop(layout.getLineForOffset(r10));
                        }
                    }
                }
                p2 p2Var2 = new p2(wVar.getContext(), 3);
                p2VarArr[0] = p2Var2;
                p2Var2.p(true);
                p2Var2.k(11.0f, 8.0f, 11.0f, 7.0f);
                p2Var2.q(10.0f);
                p2Var2.s(V2);
                p2Var2.l0 = new ph.p(p2Var2, i12);
                p2Var2.setTranslationY((-i0.L(100.0f)) + y3);
                p2Var2.h = i0.L(300.0f);
                p2Var2.setPadding(i0.L(4.0f), i0.L(4.0f), i0.L(4.0f), i0.L(4.0f));
                p2Var2.m(0.0f, x10 - i0.L(4.0f));
                frameLayout2.addView(p2Var2, b6.e(-1, 100, 55));
                p2Var2.u();
                break;
            case 6:
                q3 q3Var = (q3) obj5;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                ((gf.e) obj4).b();
                if (((Boolean) obj).booleanValue()) {
                    e1 e1Var = q3Var.X1;
                    if (e1Var != null) {
                        e1Var.a(tL_starGiftUnique);
                    }
                    q3Var.dismiss();
                    break;
                }
                break;
            case 7:
                b0 b0Var = (b0) obj5;
                gf.e eVar = (gf.e) obj4;
                x1 x1Var = (x1) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error2 == null) {
                    vp.r1(b0Var.a).L3(updates, false);
                }
                i0.g3(new m90(b0Var, eVar, x1Var, updates, tL_error2, 29));
                break;
            default:
                e4 e4Var = (e4) obj5;
                p2[] p2VarArr2 = (p2[]) obj4;
                FrameLayout frameLayout3 = (FrameLayout) obj3;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                p2 p2Var3 = p2VarArr2[0];
                if (p2Var3 != null) {
                    p2Var3.e(true);
                }
                SpannableStringBuilder V22 = i0.V2(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y10 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof ec) {
                    Layout layout2 = ((ec) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    i10 = 2;
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        fc[] fcVarArr2 = (fc[]) spanned2.getSpans(0, text2.length(), fc.class);
                        if (fcVarArr2.length > 0 && (fcVar2 = fcVarArr2[0]) != null) {
                            x11 = layout2.getPrimaryHorizontal(spanned2.getSpanStart(fcVar2)) + (fcVarArr2[0].a() / 2) + x11;
                            y10 += layout2.getLineTop(layout2.getLineForOffset(r7));
                        }
                    }
                } else {
                    i10 = 2;
                }
                p2 p2Var4 = new p2(e4Var.getContext(), 3);
                p2VarArr2[0] = p2Var4;
                p2Var4.p(true);
                p2Var4.k(11.0f, 8.0f, 11.0f, 7.0f);
                p2Var4.q(10.0f);
                p2Var4.s(V22);
                p2Var4.l0 = new ph.p(p2Var4, i10);
                p2Var4.setTranslationY((-i0.L(100.0f)) + y10);
                p2Var4.h = i0.L(300.0f);
                p2Var4.setPadding(i0.L(4.0f), i0.L(4.0f), i0.L(4.0f), i0.L(4.0f));
                p2Var4.m(0.0f, x11 - i0.L(4.0f));
                frameLayout3.addView(p2Var4, b6.e(-1, 100, 55));
                p2Var4.u();
                break;
        }
    }
}
