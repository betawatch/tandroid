package org.telegram.tgnet;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import bi.v4;
import bi.x4;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z;
import org.telegram.ui.Components.zc;
import org.telegram.ui.r91;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.a1;
import org.telegram.ui.web.c1;
import org.telegram.ui.web.h0;
import w7.a6;
import wh.g4;
import xh.a0;
import xh.w0;
import xh.x3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        zc zcVar;
        zc zcVar2;
        switch (this.a) {
            case 0:
                ((ConnectionsManager) this.b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                g0.W((g0) this.b, (nf.e) this.c, (TL_aicompose.TL_aiComposeTone) this.d);
                break;
            case 2:
                org.telegram.ui.Components.r.S((org.telegram.ui.Components.r) this.b, (f6) this.c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                break;
            case 3:
                z.P((z) this.b, (nf.e) this.c, (d2) this.d);
                break;
            case 4:
                c1 c1Var = (c1) this.b;
                a1 a1Var = (a1) this.c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str = (String) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (!TextUtils.isEmpty(str)) {
                    c1Var.z(a1Var, "prepared_message_failed", c1.B(str, "error"));
                    break;
                } else {
                    c1Var.z(a1Var, "prepared_message_sent", null);
                    h0 h0Var = c1Var.c;
                    if (h0Var != null) {
                        h0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new r91(25, botWebViewContainer$BotWebViewProxy, arrayList), 500L);
                    break;
                }
            case 5:
                wh.w wVar = (wh.w) this.b;
                x4[] x4VarArr = (x4[]) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                x4 x4Var = x4VarArr[0];
                if (x4Var != null) {
                    x4Var.e(true);
                }
                CharSequence replaceTags = AndroidUtilities.replaceTags(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y3 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof yc) {
                    Layout layout = ((yc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        zc[] zcVarArr = (zc[]) spanned.getSpans(0, text.length(), zc.class);
                        if (zcVarArr.length > 0 && (zcVar = zcVarArr[0]) != null) {
                            x10 += layout.getPrimaryHorizontal(spanned.getSpanStart(zcVar)) + (zcVarArr[0].a() / 2);
                            y3 += layout.getLineTop(layout.getLineForOffset(r8));
                        }
                    }
                }
                x4 x4Var2 = new x4(wVar.getContext(), 3);
                x4VarArr[0] = x4Var2;
                x4Var2.p(true);
                x4Var2.k(11.0f, 8.0f, 11.0f, 7.0f);
                x4Var2.q(10.0f);
                x4Var2.s(replaceTags);
                x4Var2.l0 = new v4(x4Var2, 1);
                x4Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y3);
                x4Var2.h = AndroidUtilities.dp(300.0f);
                x4Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                x4Var2.m(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(x4Var2, a6.e(-1, 100, 55));
                x4Var2.u();
                break;
            case 6:
                g4 g4Var = (g4) this.b;
                nf.e eVar = (nf.e) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                eVar.b();
                if (((Boolean) obj).booleanValue()) {
                    w0 w0Var = g4Var.f0;
                    if (w0Var != null) {
                        w0Var.run(tL_starGiftUnique);
                    }
                    g4Var.dismiss();
                    break;
                }
                break;
            case 7:
                a0.R((a0) this.b, (nf.e) this.c, (d2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                x3 x3Var = (x3) this.b;
                x4[] x4VarArr2 = (x4[]) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                x4 x4Var3 = x4VarArr2[0];
                if (x4Var3 != null) {
                    x4Var3.e(true);
                }
                CharSequence replaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y10 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof yc) {
                    Layout layout2 = ((yc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        zc[] zcVarArr2 = (zc[]) spanned2.getSpans(0, text2.length(), zc.class);
                        if (zcVarArr2.length > 0 && (zcVar2 = zcVarArr2[0]) != null) {
                            x11 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(zcVar2)) + (zcVarArr2[0].a() / 2);
                            y10 += layout2.getLineTop(layout2.getLineForOffset(r8));
                        }
                    }
                }
                x4 x4Var4 = new x4(x3Var.getContext(), 3);
                x4VarArr2[0] = x4Var4;
                x4Var4.p(true);
                x4Var4.k(11.0f, 8.0f, 11.0f, 7.0f);
                x4Var4.q(10.0f);
                x4Var4.s(replaceTags2);
                x4Var4.l0 = new v4(x4Var4, 3);
                x4Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                x4Var4.h = AndroidUtilities.dp(300.0f);
                x4Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                x4Var4.m(0.0f, x11 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(x4Var4, a6.e(-1, 100, 55));
                x4Var4.u();
                break;
        }
    }
}
