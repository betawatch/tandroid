package org.telegram.tgnet;

import ai.ea;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import ci.b4;
import ci.d4;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.y;
import org.telegram.ui.ii1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.g0;
import w7.x5;
import xh.h4;
import xh.x;
import yh.s3;
import yh.v0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Utilities.Callback2 {
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

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        dd ddVar;
        dd ddVar2;
        switch (this.a) {
            case 0:
                ((ConnectionsManager) this.b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                e0.X((e0) this.b, (of.e) this.c, (TL_aicompose.TL_aiComposeTone) this.d);
                break;
            case 2:
                org.telegram.ui.Components.q.T((org.telegram.ui.Components.q) this.b, (e6) this.c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                break;
            case 3:
                y.Q((y) this.b, (of.e) this.c, (b2) this.d);
                break;
            case 4:
                b1 b1Var = (b1) this.b;
                ea eaVar = (ea) this.c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str = (String) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (!TextUtils.isEmpty(str)) {
                    b1Var.x(eaVar, "prepared_message_failed", b1.A(str, "error"));
                    break;
                } else {
                    b1Var.x(eaVar, "prepared_message_sent", null);
                    g0 g0Var = b1Var.c;
                    if (g0Var != null) {
                        g0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new ii1(25, botWebViewContainer$BotWebViewProxy, arrayList), 500L);
                    break;
                }
            case 5:
                x xVar = (x) this.b;
                d4[] d4VarArr = (d4[]) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                d4 d4Var = d4VarArr[0];
                if (d4Var != null) {
                    d4Var.e(true);
                }
                CharSequence replaceTags = AndroidUtilities.replaceTags(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y3 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof cd) {
                    Layout layout = ((cd) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        dd[] ddVarArr = (dd[]) spanned.getSpans(0, text.length(), dd.class);
                        if (ddVarArr.length > 0 && (ddVar = ddVarArr[0]) != null) {
                            x10 += layout.getPrimaryHorizontal(spanned.getSpanStart(ddVar)) + (ddVarArr[0].a() / 2);
                            y3 += layout.getLineTop(layout.getLineForOffset(r8));
                        }
                    }
                }
                d4 d4Var2 = new d4(xVar.getContext(), 3);
                d4VarArr[0] = d4Var2;
                d4Var2.p(true);
                d4Var2.k(11.0f, 8.0f, 11.0f, 7.0f);
                d4Var2.q(10.0f);
                d4Var2.s(replaceTags);
                d4Var2.l0 = new b4(d4Var2, 1);
                d4Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y3);
                d4Var2.h = AndroidUtilities.dp(300.0f);
                d4Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                d4Var2.m(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(d4Var2, x5.e(-1, 100, 55));
                d4Var2.u();
                break;
            case 6:
                h4 h4Var = (h4) this.b;
                of.e eVar = (of.e) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                eVar.b();
                if (((Boolean) obj).booleanValue()) {
                    v0 v0Var = h4Var.f0;
                    if (v0Var != null) {
                        v0Var.run(tL_starGiftUnique);
                    }
                    h4Var.dismiss();
                    break;
                }
                break;
            case 7:
                yh.y.S((yh.y) this.b, (of.e) this.c, (b2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                s3 s3Var = (s3) this.b;
                d4[] d4VarArr2 = (d4[]) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                d4 d4Var3 = d4VarArr2[0];
                if (d4Var3 != null) {
                    d4Var3.e(true);
                }
                CharSequence replaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y10 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof cd) {
                    Layout layout2 = ((cd) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        dd[] ddVarArr2 = (dd[]) spanned2.getSpans(0, text2.length(), dd.class);
                        if (ddVarArr2.length > 0 && (ddVar2 = ddVarArr2[0]) != null) {
                            x11 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(ddVar2)) + (ddVarArr2[0].a() / 2);
                            y10 += layout2.getLineTop(layout2.getLineForOffset(r8));
                        }
                    }
                }
                d4 d4Var4 = new d4(s3Var.getContext(), 3);
                d4VarArr2[0] = d4Var4;
                d4Var4.p(true);
                d4Var4.k(11.0f, 8.0f, 11.0f, 7.0f);
                d4Var4.q(10.0f);
                d4Var4.s(replaceTags2);
                d4Var4.l0 = new b4(d4Var4, 3);
                d4Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                d4Var4.h = AndroidUtilities.dp(300.0f);
                d4Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                d4Var4.m(0.0f, x11 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(d4Var4, x5.e(-1, 100, 55));
                d4Var4.u();
                break;
        }
    }
}
