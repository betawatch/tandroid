package bi;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        org.telegram.ui.Components.zc zcVar;
        org.telegram.ui.Components.zc zcVar2;
        switch (this.a) {
            case 0:
                b1.R((b1) this.b, (qf.c) this.c, (org.telegram.ui.ActionBar.e2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                h7 h7Var = (h7) this.b;
                fi.v3[] v3VarArr = (fi.v3[]) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                fi.v3 v3Var = v3VarArr[0];
                if (v3Var != null) {
                    v3Var.e(true);
                }
                CharSequence replaceTags = AndroidUtilities.replaceTags(charSequence);
                float x9 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y3 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof org.telegram.ui.Components.yc) {
                    Layout layout = ((org.telegram.ui.Components.yc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        org.telegram.ui.Components.zc[] zcVarArr = (org.telegram.ui.Components.zc[]) spanned.getSpans(0, text.length(), org.telegram.ui.Components.zc.class);
                        if (zcVarArr.length > 0 && (zcVar = zcVarArr[0]) != null) {
                            x9 += layout.getPrimaryHorizontal(spanned.getSpanStart(zcVar)) + (zcVarArr[0].a() / 2);
                            y3 += layout.getLineTop(layout.getLineForOffset(r8));
                        }
                    }
                }
                fi.v3 v3Var2 = new fi.v3(h7Var.getContext(), 3);
                v3VarArr[0] = v3Var2;
                v3Var2.p(true);
                v3Var2.k(11.0f, 8.0f, 11.0f, 7.0f);
                v3Var2.q(10.0f);
                v3Var2.s(replaceTags);
                v3Var2.l0 = new u2(v3Var2, 1);
                v3Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y3);
                v3Var2.h = AndroidUtilities.dp(300.0f);
                v3Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                v3Var2.m(0.0f, x9 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(v3Var2, kb1.i(-1, 100, 55));
                v3Var2.u();
                break;
            case 2:
                ((ConnectionsManager) this.b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                org.telegram.ui.Components.e0.W((org.telegram.ui.Components.e0) this.b, (qf.c) this.c, (TL_aicompose.TL_aiComposeTone) this.d);
                break;
            case 4:
                org.telegram.ui.Components.q.S((org.telegram.ui.Components.q) this.b, (org.telegram.ui.ActionBar.u6) this.c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                break;
            case 5:
                org.telegram.ui.Components.y.P((org.telegram.ui.Components.y) this.b, (qf.c) this.c, (org.telegram.ui.ActionBar.e2) this.d);
                break;
            case 6:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.b;
                di.x7 x7Var = (di.x7) this.c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str = (String) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (!TextUtils.isEmpty(str)) {
                    a1Var.x(x7Var, "prepared_message_failed", org.telegram.ui.web.a1.A(str, "error"));
                    break;
                } else {
                    a1Var.x(x7Var, "prepared_message_sent", null);
                    org.telegram.ui.web.g0 g0Var = a1Var.c;
                    if (g0Var != null) {
                        g0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.a6(13, botWebViewContainer$BotWebViewProxy, arrayList), 500L);
                    break;
                }
            case 7:
                zh.v vVar = (zh.v) this.b;
                fi.v3[] v3VarArr2 = (fi.v3[]) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                fi.v3 v3Var3 = v3VarArr2[0];
                if (v3Var3 != null) {
                    v3Var3.e(true);
                }
                CharSequence replaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x10 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y10 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof org.telegram.ui.Components.yc) {
                    Layout layout2 = ((org.telegram.ui.Components.yc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        org.telegram.ui.Components.zc[] zcVarArr2 = (org.telegram.ui.Components.zc[]) spanned2.getSpans(0, text2.length(), org.telegram.ui.Components.zc.class);
                        if (zcVarArr2.length > 0 && (zcVar2 = zcVarArr2[0]) != null) {
                            x10 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(zcVar2)) + (zcVarArr2[0].a() / 2);
                            y10 += layout2.getLineTop(layout2.getLineForOffset(r8));
                        }
                    }
                }
                fi.v3 v3Var4 = new fi.v3(vVar.getContext(), 3);
                v3VarArr2[0] = v3Var4;
                v3Var4.p(true);
                v3Var4.k(11.0f, 8.0f, 11.0f, 7.0f);
                v3Var4.q(10.0f);
                v3Var4.s(replaceTags2);
                v3Var4.l0 = new u2(v3Var4, 3);
                v3Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                v3Var4.h = AndroidUtilities.dp(300.0f);
                v3Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                v3Var4.m(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(v3Var4, kb1.i(-1, 100, 55));
                v3Var4.u();
                break;
            default:
                zh.g4 g4Var = (zh.g4) this.b;
                qf.c cVar = (qf.c) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                cVar.b();
                if (((Boolean) obj).booleanValue()) {
                    p2 p2Var = g4Var.f0;
                    if (p2Var != null) {
                        p2Var.run(tL_starGiftUnique);
                    }
                    g4Var.dismiss();
                    break;
                }
                break;
        }
    }
}
