package bi;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import fi.i7;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    @Override // org.telegram.messenger.s10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        fc fcVar;
        fc fcVar2;
        org.telegram.ui.ActionBar.e2 T;
        int i7 = this.a;
        int i10 = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i7) {
            case 0:
                m0 m0Var = (m0) obj5;
                hi.l3[] l3VarArr = (hi.l3[]) obj4;
                FrameLayout frameLayout = (FrameLayout) obj3;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                hi.l3 l3Var = l3VarArr[0];
                if (l3Var != null) {
                    l3Var.f(true);
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y10 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof ec) {
                    Layout layout = ((ec) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        fc[] fcVarArr = (fc[]) spanned.getSpans(0, text.length(), fc.class);
                        if (fcVarArr.length > 0 && (fcVar = fcVarArr[0]) != null) {
                            x10 += layout.getPrimaryHorizontal(spanned.getSpanStart(fcVar)) + (fcVarArr[0].a() / 2);
                            y10 += layout.getLineTop(layout.getLineForOffset(r9));
                        }
                    }
                }
                hi.l3 l3Var2 = new hi.l3(m0Var.getContext(), 3);
                l3VarArr[0] = l3Var2;
                l3Var2.r(true);
                l3Var2.n(11.0f, 8.0f, 11.0f, 7.0f);
                l3Var2.s(10.0f);
                l3Var2.u(W2);
                l3Var2.r0 = new c0(l3Var2, i10);
                l3Var2.setTranslationY((-org.telegram.messenger.g0.L(100.0f)) + y10);
                l3Var2.h = org.telegram.messenger.g0.L(300.0f);
                l3Var2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                l3Var2.p(0.0f, x10 - org.telegram.messenger.g0.L(4.0f));
                frameLayout.addView(l3Var2, ja.e(-1, 100, 55));
                l3Var2.w();
                break;
            case 1:
                z5 z5Var = (z5) obj5;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                ((vf.b) obj4).b();
                if (((Boolean) obj).booleanValue()) {
                    di.y1 y1Var = z5Var.b2;
                    if (y1Var != null) {
                        y1Var.a(tL_starGiftUnique);
                    }
                    z5Var.dismiss();
                    break;
                }
                break;
            case 2:
                di.p0 p0Var = (di.p0) obj5;
                vf.b bVar = (vf.b) obj4;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    np.s1(p0Var.a).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new ai.b(p0Var, bVar, t1Var, updates, tL_error, 2));
                break;
            case 3:
                di.c6 c6Var = (di.c6) obj5;
                hi.l3[] l3VarArr2 = (hi.l3[]) obj4;
                FrameLayout frameLayout2 = (FrameLayout) obj3;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                hi.l3 l3Var3 = l3VarArr2[0];
                if (l3Var3 != null) {
                    l3Var3.f(true);
                }
                SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y11 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                int i11 = 2;
                if (view2 instanceof ec) {
                    Layout layout2 = ((ec) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        fc[] fcVarArr2 = (fc[]) spanned2.getSpans(0, text2.length(), fc.class);
                        if (fcVarArr2.length > 0 && (fcVar2 = fcVarArr2[0]) != null) {
                            x11 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(fcVar2)) + (fcVarArr2[0].a() / 2);
                            y11 += layout2.getLineTop(layout2.getLineForOffset(r8));
                        }
                    }
                }
                hi.l3 l3Var4 = new hi.l3(c6Var.getContext(), 3);
                l3VarArr2[0] = l3Var4;
                l3Var4.r(true);
                l3Var4.n(11.0f, 8.0f, 11.0f, 7.0f);
                l3Var4.s(10.0f);
                l3Var4.u(W22);
                l3Var4.r0 = new c0(l3Var4, i11);
                l3Var4.setTranslationY((-org.telegram.messenger.g0.L(100.0f)) + y11);
                l3Var4.h = org.telegram.messenger.g0.L(300.0f);
                l3Var4.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                l3Var4.p(0.0f, x11 - org.telegram.messenger.g0.L(4.0f));
                frameLayout2.addView(l3Var4, ja.e(-1, 100, 55));
                l3Var4.w();
                break;
            case 4:
                ((ConnectionsManager) obj5).lambda$sendRequestTypedAndProcessUpdates$5((Executor) obj4, (s10) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) obj5;
                ((vf.b) obj4).c(false);
                org.telegram.messenger.e R1 = np.s1(d0Var.a).R1();
                R1.b.remove((TL_aicompose.TL_aiComposeTone) obj3);
                R1.d();
                R1.c();
                d0Var.x1();
                break;
            case 6:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout3 = qVar.a2;
                qVar.b2.setLoading(false);
                if (tL_error2 != null) {
                    if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.ui.Components.d0.t1(new cc(frameLayout3, e6Var), qVar.a);
                        break;
                    } else {
                        org.telegram.ui.Cells.y0.q(frameLayout3, e6Var, tL_error2, false);
                        break;
                    }
                } else {
                    org.telegram.messenger.e R12 = np.s1(qVar.a).R1();
                    ArrayList arrayList = R12.b;
                    if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                        long j3 = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).id;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if ((arrayList.get(i12) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i12)).id == j3) {
                                qVar.dismiss();
                                T = LaunchActivity.T();
                                if (T == null) {
                                    cc.a0(T).p(aiComposeTone.emoji_id, hd.M0(2131754958, null), hd.a0(null, null, 2131754959, aiComposeTone.title)).j();
                                    break;
                                }
                            }
                        }
                    }
                    arrayList.add(0, aiComposeTone);
                    R12.d();
                    R12.c();
                    qVar.dismiss();
                    T = LaunchActivity.T();
                    if (T == null) {
                    }
                }
                break;
            case 7:
                org.telegram.ui.Components.y yVar = (org.telegram.ui.Components.y) obj5;
                ((vf.b) obj4).c(false);
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                yVar.dismiss();
                org.telegram.messenger.e R13 = np.s1(yVar.a).R1();
                R13.b.remove(yVar.f2);
                R13.d();
                R13.c();
                break;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj5;
                i7 i7Var = (i7) obj4;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj3;
                String str = (String) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                if (TextUtils.isEmpty(str)) {
                    v0Var.x(i7Var, "prepared_message_sent", null);
                    org.telegram.ui.web.c0 c0Var = v0Var.c;
                    if (c0Var != null) {
                        c0Var.c();
                    }
                    org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.r(26, botWebViewContainer$BotWebViewProxy, arrayList2), 500L);
                    break;
                } else {
                    v0Var.x(i7Var, "prepared_message_failed", org.telegram.ui.web.v0.A(str, "error"));
                    break;
                }
        }
    }
}
