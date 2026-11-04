package ai;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import ei.p7;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hc1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n0(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    @Override // org.telegram.messenger.n10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        ic icVar;
        ic icVar2;
        org.telegram.ui.ActionBar.d2 T;
        int i3 = this.a;
        int i10 = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i3) {
            case 0:
                s0 s0Var = (s0) obj5;
                gi.l3[] l3VarArr = (gi.l3[]) obj4;
                FrameLayout frameLayout = (FrameLayout) obj3;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                gi.l3 l3Var = l3VarArr[0];
                if (l3Var != null) {
                    l3Var.f(true);
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y9 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof hc) {
                    Layout layout = ((hc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        ic[] icVarArr = (ic[]) spanned.getSpans(0, text.length(), ic.class);
                        if (icVarArr.length > 0 && (icVar = icVarArr[0]) != null) {
                            x10 += layout.getPrimaryHorizontal(spanned.getSpanStart(icVar)) + (icVarArr[0].a() / 2);
                            y9 += layout.getLineTop(layout.getLineForOffset(r9));
                        }
                    }
                }
                gi.l3 l3Var2 = new gi.l3(s0Var.getContext(), 3);
                l3VarArr[0] = l3Var2;
                l3Var2.r(true);
                l3Var2.n(11.0f, 8.0f, 11.0f, 7.0f);
                l3Var2.s(10.0f);
                l3Var2.u(W2);
                l3Var2.r0 = new i0(l3Var2, i10);
                l3Var2.setTranslationY((-org.telegram.messenger.g0.L(100.0f)) + y9);
                l3Var2.h = org.telegram.messenger.g0.L(300.0f);
                l3Var2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                l3Var2.p(0.0f, x10 - org.telegram.messenger.g0.L(4.0f));
                frameLayout.addView(l3Var2, mf.e(-1, 100, 55));
                l3Var2.w();
                break;
            case 1:
                h6 h6Var = (h6) obj5;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                ((sf.b) obj4).b();
                if (((Boolean) obj).booleanValue()) {
                    ci.e2 e2Var = h6Var.Y1;
                    if (e2Var != null) {
                        e2Var.a(tL_starGiftUnique);
                    }
                    h6Var.dismiss();
                    break;
                }
                break;
            case 2:
                ci.t0 t0Var = (ci.t0) obj5;
                sf.b bVar = (sf.b) obj4;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    hp.s1(t0Var.a).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new t6((Object) t0Var, (Object) bVar, (Object) s1Var, (Object) updates, tL_error, 1));
                break;
            case 3:
                ci.l6 l6Var = (ci.l6) obj5;
                gi.l3[] l3VarArr2 = (gi.l3[]) obj4;
                FrameLayout frameLayout2 = (FrameLayout) obj3;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                gi.l3 l3Var3 = l3VarArr2[0];
                if (l3Var3 != null) {
                    l3Var3.f(true);
                }
                SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y10 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                int i11 = 2;
                if (view2 instanceof hc) {
                    Layout layout2 = ((hc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        ic[] icVarArr2 = (ic[]) spanned2.getSpans(0, text2.length(), ic.class);
                        if (icVarArr2.length > 0 && (icVar2 = icVarArr2[0]) != null) {
                            x11 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(icVar2)) + (icVarArr2[0].a() / 2);
                            y10 += layout2.getLineTop(layout2.getLineForOffset(r8));
                        }
                    }
                }
                gi.l3 l3Var4 = new gi.l3(l6Var.getContext(), 3);
                l3VarArr2[0] = l3Var4;
                l3Var4.r(true);
                l3Var4.n(11.0f, 8.0f, 11.0f, 7.0f);
                l3Var4.s(10.0f);
                l3Var4.u(W22);
                l3Var4.r0 = new i0(l3Var4, i11);
                l3Var4.setTranslationY((-org.telegram.messenger.g0.L(100.0f)) + y10);
                l3Var4.h = org.telegram.messenger.g0.L(300.0f);
                l3Var4.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                l3Var4.p(0.0f, x11 - org.telegram.messenger.g0.L(4.0f));
                frameLayout2.addView(l3Var4, mf.e(-1, 100, 55));
                l3Var4.w();
                break;
            case 4:
                ((ConnectionsManager) obj5).lambda$sendRequestTypedAndProcessUpdates$5((Executor) obj4, (n10) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) obj5;
                ((sf.b) obj4).c(false);
                org.telegram.messenger.e R1 = hp.s1(e0Var.a).R1();
                R1.b.remove((TL_aicompose.TL_aiComposeTone) obj3);
                R1.d();
                R1.c();
                e0Var.x1();
                break;
            case 6:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout3 = rVar.X1;
                rVar.Y1.setLoading(false);
                if (tL_error2 != null) {
                    if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.ui.Components.e0.t1(new fc(frameLayout3, e6Var), rVar.a);
                        break;
                    } else {
                        org.telegram.ui.Cells.f1.v(frameLayout3, e6Var, tL_error2, false);
                        break;
                    }
                } else {
                    org.telegram.messenger.e R12 = hp.s1(rVar.a).R1();
                    ArrayList arrayList = R12.b;
                    if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                        long j10 = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).id;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if ((arrayList.get(i12) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i12)).id == j10) {
                                rVar.dismiss();
                                T = LaunchActivity.T();
                                if (T == null) {
                                    fc.a0(T).p(aiComposeTone.emoji_id, bd.M0(2131754958, null), bd.a0(null, null, 2131754959, aiComposeTone.title)).j();
                                    break;
                                }
                            }
                        }
                    }
                    arrayList.add(0, aiComposeTone);
                    R12.d();
                    R12.c();
                    rVar.dismiss();
                    T = LaunchActivity.T();
                    if (T == null) {
                    }
                }
                break;
            case 7:
                org.telegram.ui.Components.z zVar = (org.telegram.ui.Components.z) obj5;
                ((sf.b) obj4).c(false);
                ((org.telegram.ui.ActionBar.s1) obj3).dismiss();
                zVar.dismiss();
                org.telegram.messenger.e R13 = hp.s1(zVar.a).R1();
                R13.b.remove(zVar.c2);
                R13.d();
                R13.c();
                break;
            default:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj5;
                p7 p7Var = (p7) obj4;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj3;
                String str = (String) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                if (TextUtils.isEmpty(str)) {
                    w0Var.x(p7Var, "prepared_message_sent", null);
                    org.telegram.ui.web.d0 d0Var = w0Var.c;
                    if (d0Var != null) {
                        d0Var.c();
                    }
                    org.telegram.messenger.g0.i3(new hc1(5, botWebViewContainer$BotWebViewProxy, arrayList2), 500L);
                    break;
                } else {
                    w0Var.x(p7Var, "prepared_message_failed", org.telegram.ui.web.w0.A(str, "error"));
                    break;
                }
        }
    }
}
