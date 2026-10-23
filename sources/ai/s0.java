package ai;

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
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        org.telegram.ui.Components.ad adVar;
        org.telegram.ui.Components.ad adVar2;
        switch (this.a) {
            case 0:
                b1.S((b1) this.b, (pf.c) this.c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                l7 l7Var = (l7) this.b;
                ei.x3[] x3VarArr = (ei.x3[]) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                ei.x3 x3Var = x3VarArr[0];
                if (x3Var != null) {
                    x3Var.e(true);
                }
                CharSequence replaceTags = AndroidUtilities.replaceTags(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y3 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof org.telegram.ui.Components.zc) {
                    Layout layout = ((org.telegram.ui.Components.zc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        org.telegram.ui.Components.ad[] adVarArr = (org.telegram.ui.Components.ad[]) spanned.getSpans(0, text.length(), org.telegram.ui.Components.ad.class);
                        if (adVarArr.length > 0 && (adVar = adVarArr[0]) != null) {
                            x10 += layout.getPrimaryHorizontal(spanned.getSpanStart(adVar)) + (adVarArr[0].a() / 2);
                            y3 += layout.getLineTop(layout.getLineForOffset(r8));
                        }
                    }
                }
                ei.x3 x3Var2 = new ei.x3(l7Var.getContext(), 3);
                x3VarArr[0] = x3Var2;
                x3Var2.p(true);
                x3Var2.k(11.0f, 8.0f, 11.0f, 7.0f);
                x3Var2.q(10.0f);
                x3Var2.s(replaceTags);
                x3Var2.l0 = new y2(x3Var2, 1);
                x3Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y3);
                x3Var2.h = AndroidUtilities.dp(300.0f);
                x3Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                x3Var2.m(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(x3Var2, w7.z5.e(-1, 100, 55));
                x3Var2.u();
                break;
            case 2:
                ((ConnectionsManager) this.b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                org.telegram.ui.Components.e0.X((org.telegram.ui.Components.e0) this.b, (pf.c) this.c, (TL_aicompose.TL_aiComposeTone) this.d);
                break;
            case 4:
                org.telegram.ui.Components.q.T((org.telegram.ui.Components.q) this.b, (org.telegram.ui.ActionBar.d6) this.c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                break;
            case 5:
                org.telegram.ui.Components.y.Q((org.telegram.ui.Components.y) this.b, (pf.c) this.c, (org.telegram.ui.ActionBar.b2) this.d);
                break;
            case 6:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.b;
                ci.z7 z7Var = (ci.z7) this.c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str = (String) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (!TextUtils.isEmpty(str)) {
                    a1Var.x(z7Var, "prepared_message_failed", org.telegram.ui.web.a1.A(str, "error"));
                    break;
                } else {
                    a1Var.x(z7Var, "prepared_message_sent", null);
                    org.telegram.ui.web.g0 g0Var = a1Var.c;
                    if (g0Var != null) {
                        g0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.z3(22, botWebViewContainer$BotWebViewProxy, arrayList), 500L);
                    break;
                }
            case 7:
                yh.v vVar = (yh.v) this.b;
                ei.x3[] x3VarArr2 = (ei.x3[]) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                ei.x3 x3Var3 = x3VarArr2[0];
                if (x3Var3 != null) {
                    x3Var3.e(true);
                }
                CharSequence replaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y10 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof org.telegram.ui.Components.zc) {
                    Layout layout2 = ((org.telegram.ui.Components.zc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        org.telegram.ui.Components.ad[] adVarArr2 = (org.telegram.ui.Components.ad[]) spanned2.getSpans(0, text2.length(), org.telegram.ui.Components.ad.class);
                        if (adVarArr2.length > 0 && (adVar2 = adVarArr2[0]) != null) {
                            x11 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(adVar2)) + (adVarArr2[0].a() / 2);
                            y10 += layout2.getLineTop(layout2.getLineForOffset(r8));
                        }
                    }
                }
                ei.x3 x3Var4 = new ei.x3(vVar.getContext(), 3);
                x3VarArr2[0] = x3Var4;
                x3Var4.p(true);
                x3Var4.k(11.0f, 8.0f, 11.0f, 7.0f);
                x3Var4.q(10.0f);
                x3Var4.s(replaceTags2);
                x3Var4.l0 = new y2(x3Var4, 3);
                x3Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                x3Var4.h = AndroidUtilities.dp(300.0f);
                x3Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                x3Var4.m(0.0f, x11 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(x3Var4, w7.z5.e(-1, 100, 55));
                x3Var4.u();
                break;
            default:
                yh.f4 f4Var = (yh.f4) this.b;
                pf.c cVar = (pf.c) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                cVar.b();
                if (((Boolean) obj).booleanValue()) {
                    s2 s2Var = f4Var.f0;
                    if (s2Var != null) {
                        s2Var.run(tL_starGiftUnique);
                    }
                    f4Var.dismiss();
                    break;
                }
                break;
        }
    }
}
