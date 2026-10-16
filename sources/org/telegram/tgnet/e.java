package org.telegram.tgnet;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import bi.n9;
import di.b4;
import di.d4;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.y;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.c1;
import org.telegram.ui.web.h0;
import w7.z5;
import yh.f4;
import zh.r3;
import zh.v0;
import zh.z;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        cd cdVar;
        cd cdVar2;
        switch (this.a) {
            case 0:
                ((ConnectionsManager) this.b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                e0.X((e0) this.b, (pf.c) this.c, (TL_aicompose.TL_aiComposeTone) this.d);
                break;
            case 2:
                org.telegram.ui.Components.q.T((org.telegram.ui.Components.q) this.b, (c6) this.c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                break;
            case 3:
                y.Q((y) this.b, (pf.c) this.c, (a2) this.d);
                break;
            case 4:
                c1 c1Var = (c1) this.b;
                n9 n9Var = (n9) this.c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str = (String) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (!TextUtils.isEmpty(str)) {
                    c1Var.x(n9Var, "prepared_message_failed", c1.A(str, "error"));
                    break;
                } else {
                    c1Var.x(n9Var, "prepared_message_sent", null);
                    h0 h0Var = c1Var.c;
                    if (h0Var != null) {
                        h0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.v(1, botWebViewContainer$BotWebViewProxy, arrayList), 500L);
                    break;
                }
            case 5:
                yh.w wVar = (yh.w) this.b;
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
                if (view instanceof bd) {
                    Layout layout = ((bd) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        cd[] cdVarArr = (cd[]) spanned.getSpans(0, text.length(), cd.class);
                        if (cdVarArr.length > 0 && (cdVar = cdVarArr[0]) != null) {
                            x10 += layout.getPrimaryHorizontal(spanned.getSpanStart(cdVar)) + (cdVarArr[0].a() / 2);
                            y3 += layout.getLineTop(layout.getLineForOffset(r8));
                        }
                    }
                }
                d4 d4Var2 = new d4(wVar.getContext(), 3);
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
                frameLayout.addView(d4Var2, z5.e(-1, 100, 55));
                d4Var2.u();
                break;
            case 6:
                f4 f4Var = (f4) this.b;
                pf.c cVar = (pf.c) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                cVar.b();
                if (((Boolean) obj).booleanValue()) {
                    v0 v0Var = f4Var.f0;
                    if (v0Var != null) {
                        v0Var.run(tL_starGiftUnique);
                    }
                    f4Var.dismiss();
                    break;
                }
                break;
            case 7:
                z.S((z) this.b, (pf.c) this.c, (a2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                r3 r3Var = (r3) this.b;
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
                if (view2 instanceof bd) {
                    Layout layout2 = ((bd) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        cd[] cdVarArr2 = (cd[]) spanned2.getSpans(0, text2.length(), cd.class);
                        if (cdVarArr2.length > 0 && (cdVar2 = cdVarArr2[0]) != null) {
                            x11 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(cdVar2)) + (cdVarArr2[0].a() / 2);
                            y10 += layout2.getLineTop(layout2.getLineForOffset(r8));
                        }
                    }
                }
                d4 d4Var4 = new d4(r3Var.getContext(), 3);
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
                frameLayout2.addView(d4Var4, z5.e(-1, 100, 55));
                d4Var4.u();
                break;
        }
    }
}
