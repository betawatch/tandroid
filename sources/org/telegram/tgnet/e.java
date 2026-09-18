package org.telegram.tgnet;

import ai.da;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import ci.d4;
import ci.f4;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.y;
import org.telegram.ui.Components.zc;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.d1;
import org.telegram.ui.web.h0;
import org.telegram.ui.x81;
import w7.y5;
import xh.h4;
import yh.a0;
import yh.w0;
import yh.y3;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        ad adVar;
        ad adVar2;
        switch (this.a) {
            case 0:
                ((ConnectionsManager) this.b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                e0.W((e0) this.b, (nf.e) this.c, (TL_aicompose.TL_aiComposeTone) this.d);
                break;
            case 2:
                org.telegram.ui.Components.q.S((org.telegram.ui.Components.q) this.b, (e6) this.c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                break;
            case 3:
                y.P((y) this.b, (nf.e) this.c, (b2) this.d);
                break;
            case 4:
                d1 d1Var = (d1) this.b;
                da daVar = (da) this.c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str = (String) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (!TextUtils.isEmpty(str)) {
                    d1Var.y(daVar, "prepared_message_failed", d1.B(str, "error"));
                    break;
                } else {
                    d1Var.y(daVar, "prepared_message_sent", null);
                    h0 h0Var = d1Var.c;
                    if (h0Var != null) {
                        h0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new x81(26, botWebViewContainer$BotWebViewProxy, arrayList), 500L);
                    break;
                }
            case 5:
                xh.v vVar = (xh.v) this.b;
                f4[] f4VarArr = (f4[]) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                f4 f4Var = f4VarArr[0];
                if (f4Var != null) {
                    f4Var.e(true);
                }
                CharSequence replaceTags = AndroidUtilities.replaceTags(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y3 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof zc) {
                    Layout layout = ((zc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        ad[] adVarArr = (ad[]) spanned.getSpans(0, text.length(), ad.class);
                        if (adVarArr.length > 0 && (adVar = adVarArr[0]) != null) {
                            x10 += layout.getPrimaryHorizontal(spanned.getSpanStart(adVar)) + (adVarArr[0].a() / 2);
                            y3 += layout.getLineTop(layout.getLineForOffset(r8));
                        }
                    }
                }
                f4 f4Var2 = new f4(vVar.getContext(), 3);
                f4VarArr[0] = f4Var2;
                f4Var2.p(true);
                f4Var2.k(11.0f, 8.0f, 11.0f, 7.0f);
                f4Var2.q(10.0f);
                f4Var2.s(replaceTags);
                f4Var2.l0 = new d4(f4Var2, 1);
                f4Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y3);
                f4Var2.h = AndroidUtilities.dp(300.0f);
                f4Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                f4Var2.m(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(f4Var2, y5.e(-1, 100, 55));
                f4Var2.u();
                break;
            case 6:
                h4 h4Var = (h4) this.b;
                nf.e eVar = (nf.e) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                eVar.b();
                if (((Boolean) obj).booleanValue()) {
                    w0 w0Var = h4Var.f0;
                    if (w0Var != null) {
                        w0Var.run(tL_starGiftUnique);
                    }
                    h4Var.dismiss();
                    break;
                }
                break;
            case 7:
                a0.R((a0) this.b, (nf.e) this.c, (b2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                y3 y3Var = (y3) this.b;
                f4[] f4VarArr2 = (f4[]) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                f4 f4Var3 = f4VarArr2[0];
                if (f4Var3 != null) {
                    f4Var3.e(true);
                }
                CharSequence replaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y10 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof zc) {
                    Layout layout2 = ((zc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        ad[] adVarArr2 = (ad[]) spanned2.getSpans(0, text2.length(), ad.class);
                        if (adVarArr2.length > 0 && (adVar2 = adVarArr2[0]) != null) {
                            x11 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(adVar2)) + (adVarArr2[0].a() / 2);
                            y10 += layout2.getLineTop(layout2.getLineForOffset(r8));
                        }
                    }
                }
                f4 f4Var4 = new f4(y3Var.getContext(), 3);
                f4VarArr2[0] = f4Var4;
                f4Var4.p(true);
                f4Var4.k(11.0f, 8.0f, 11.0f, 7.0f);
                f4Var4.q(10.0f);
                f4Var4.s(replaceTags2);
                f4Var4.l0 = new d4(f4Var4, 3);
                f4Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                f4Var4.h = AndroidUtilities.dp(300.0f);
                f4Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                f4Var4.m(0.0f, x11 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(f4Var4, y5.e(-1, 100, 55));
                f4Var4.u();
                break;
        }
    }
}
