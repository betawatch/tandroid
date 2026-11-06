package bi;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x021f  */
    @Override // org.telegram.messenger.v10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        org.telegram.ui.Components.kc kcVar;
        org.telegram.ui.ActionBar.f2 T;
        org.telegram.ui.Components.kc kcVar2;
        int i7 = this.a;
        int i10 = 1;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i7) {
            case 0:
                a1 a1Var = (a1) obj5;
                vf.b bVar = (vf.b) obj4;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    qp.s1(a1Var.a).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new u0(a1Var, bVar, u1Var, updates, tL_error, 0));
                break;
            case 1:
                k7 k7Var = (k7) obj5;
                fi.m3[] m3VarArr = (fi.m3[]) obj4;
                FrameLayout frameLayout = (FrameLayout) obj3;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                fi.m3 m3Var = m3VarArr[0];
                if (m3Var != null) {
                    m3Var.f(true);
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y10 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof org.telegram.ui.Components.jc) {
                    Layout layout = ((org.telegram.ui.Components.jc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        org.telegram.ui.Components.kc[] kcVarArr = (org.telegram.ui.Components.kc[]) spanned.getSpans(0, text.length(), org.telegram.ui.Components.kc.class);
                        if (kcVarArr.length > 0 && (kcVar = kcVarArr[0]) != null) {
                            x10 += layout.getPrimaryHorizontal(spanned.getSpanStart(kcVar)) + (kcVarArr[0].a() / 2);
                            y10 += layout.getLineTop(layout.getLineForOffset(r10));
                        }
                    }
                }
                fi.m3 m3Var2 = new fi.m3(k7Var.getContext(), 3);
                m3VarArr[0] = m3Var2;
                m3Var2.r(true);
                m3Var2.n(11.0f, 8.0f, 11.0f, 7.0f);
                m3Var2.s(10.0f);
                m3Var2.u(W2);
                m3Var2.q0 = new s2(m3Var2, i10);
                m3Var2.setTranslationY((-org.telegram.messenger.g0.L(100.0f)) + y10);
                m3Var2.h = org.telegram.messenger.g0.L(300.0f);
                m3Var2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                m3Var2.p(0.0f, x10 - org.telegram.messenger.g0.L(4.0f));
                frameLayout.addView(m3Var2, c8.ha.e(-1, 100, 55));
                m3Var2.w();
                break;
            case 2:
                ((ConnectionsManager) obj5).lambda$sendRequestTypedAndProcessUpdates$5((Executor) obj4, (v10) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj5;
                ((vf.b) obj4).c(false);
                org.telegram.messenger.e R1 = qp.s1(g0Var.a).R1();
                R1.b.remove((TL_aicompose.TL_aiComposeTone) obj3);
                R1.d();
                R1.c();
                g0Var.x1();
                break;
            case 4:
                org.telegram.ui.Components.s sVar = (org.telegram.ui.Components.s) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout2 = sVar.W1;
                sVar.X1.setLoading(false);
                if (tL_error2 != null) {
                    if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.ui.Components.g0.t1(new org.telegram.ui.Components.hc(frameLayout2, f6Var), sVar.a);
                        break;
                    } else {
                        org.telegram.ui.Cells.f1.r(frameLayout2, f6Var, tL_error2, false);
                        break;
                    }
                } else {
                    org.telegram.messenger.e R12 = qp.s1(sVar.a).R1();
                    ArrayList arrayList = R12.b;
                    if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                        long j3 = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).id;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if ((arrayList.get(i12) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i12)).id == j3) {
                                sVar.dismiss();
                                T = LaunchActivity.T();
                                if (T == null) {
                                    org.telegram.ui.Components.hc.a0(T).p(aiComposeTone.emoji_id, org.telegram.messenger.hd.M0(2131754958, null), org.telegram.messenger.hd.a0(null, null, 2131754959, aiComposeTone.title)).j();
                                    break;
                                }
                            }
                        }
                    }
                    arrayList.add(0, aiComposeTone);
                    R12.d();
                    R12.c();
                    sVar.dismiss();
                    T = LaunchActivity.T();
                    if (T == null) {
                    }
                }
                break;
            case 5:
                org.telegram.ui.Components.a0 a0Var = (org.telegram.ui.Components.a0) obj5;
                ((vf.b) obj4).c(false);
                ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                a0Var.dismiss();
                org.telegram.messenger.e R13 = qp.s1(a0Var.a).R1();
                R13.b.remove(a0Var.b2);
                R13.d();
                R13.c();
                break;
            case 6:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj5;
                di.o7 o7Var = (di.o7) obj4;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj3;
                String str = (String) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                if (TextUtils.isEmpty(str)) {
                    x0Var.x(o7Var, "prepared_message_sent", null);
                    org.telegram.ui.web.d0 d0Var = x0Var.c;
                    if (d0Var != null) {
                        d0Var.c();
                    }
                    org.telegram.messenger.g0.i3(new org.telegram.ui.web.w(i11, botWebViewContainer$BotWebViewProxy, arrayList2), 500L);
                    break;
                } else {
                    x0Var.x(o7Var, "prepared_message_failed", org.telegram.ui.web.x0.A(str, "error"));
                    break;
                }
            case 7:
                zh.v vVar = (zh.v) obj5;
                fi.m3[] m3VarArr2 = (fi.m3[]) obj4;
                FrameLayout frameLayout3 = (FrameLayout) obj3;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                fi.m3 m3Var3 = m3VarArr2[0];
                if (m3Var3 != null) {
                    m3Var3.f(true);
                }
                SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y11 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof org.telegram.ui.Components.jc) {
                    Layout layout2 = ((org.telegram.ui.Components.jc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        org.telegram.ui.Components.kc[] kcVarArr2 = (org.telegram.ui.Components.kc[]) spanned2.getSpans(0, text2.length(), org.telegram.ui.Components.kc.class);
                        if (kcVarArr2.length > 0 && (kcVar2 = kcVarArr2[0]) != null) {
                            x11 = layout2.getPrimaryHorizontal(spanned2.getSpanStart(kcVar2)) + (kcVarArr2[0].a() / 2) + x11;
                            y11 += layout2.getLineTop(layout2.getLineForOffset(r6));
                        }
                    }
                }
                fi.m3 m3Var4 = new fi.m3(vVar.getContext(), 3);
                m3VarArr2[0] = m3Var4;
                m3Var4.r(true);
                m3Var4.n(11.0f, 8.0f, 11.0f, 7.0f);
                m3Var4.s(10.0f);
                m3Var4.u(W22);
                m3Var4.q0 = new s2(m3Var4, 4);
                m3Var4.setTranslationY((-org.telegram.messenger.g0.L(100.0f)) + y11);
                m3Var4.h = org.telegram.messenger.g0.L(300.0f);
                m3Var4.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                m3Var4.p(0.0f, x11 - org.telegram.messenger.g0.L(4.0f));
                frameLayout3.addView(m3Var4, c8.ha.e(-1, 100, 55));
                m3Var4.w();
                break;
            default:
                zh.l3 l3Var = (zh.l3) obj5;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                ((vf.b) obj4).b();
                if (((Boolean) obj).booleanValue()) {
                    n2 n2Var = l3Var.X1;
                    if (n2Var != null) {
                        n2Var.a(tL_starGiftUnique);
                    }
                    l3Var.dismiss();
                    break;
                }
                break;
        }
    }
}
