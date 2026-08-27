package gh;

import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        pc pcVar;
        pc pcVar2;
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) this.b;
                lh.w3[] w3VarArr = (lh.w3[]) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                lh.w3 w3Var = w3VarArr[0];
                if (w3Var != null) {
                    w3Var.e(true);
                }
                CharSequence replaceTags = AndroidUtilities.replaceTags(charSequence);
                float x8 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y10 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof oc) {
                    Layout layout = ((oc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        pc[] pcVarArr = (pc[]) spanned.getSpans(0, text.length(), pc.class);
                        if (pcVarArr.length > 0 && (pcVar = pcVarArr[0]) != null) {
                            x8 += layout.getPrimaryHorizontal(spanned.getSpanStart(pcVar)) + (pcVarArr[0].a() / 2);
                            y10 += layout.getLineTop(layout.getLineForOffset(r8));
                        }
                    }
                }
                lh.w3 w3Var2 = new lh.w3(i0Var.getContext(), 3);
                w3VarArr[0] = w3Var2;
                w3Var2.q(true);
                w3Var2.l(11.0f, 8.0f, 11.0f, 7.0f);
                w3Var2.r(10.0f);
                w3Var2.t(replaceTags);
                w3Var2.h0 = new z(w3Var2, 0);
                w3Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                w3Var2.h = AndroidUtilities.dp(300.0f);
                w3Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                w3Var2.n(0.0f, x8 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(w3Var2, h7.z5.e(-1, 100, 55));
                w3Var2.v();
                break;
            case 1:
                x5 x5Var = (x5) this.b;
                we.d dVar = (we.d) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                dVar.b();
                if (((Boolean) obj).booleanValue()) {
                    hh.p1 p1Var = x5Var.b0;
                    if (p1Var != null) {
                        p1Var.run(tL_starGiftUnique);
                    }
                    x5Var.dismiss();
                    break;
                }
                break;
            case 2:
                hh.o0.R((hh.o0) this.b, (we.d) this.c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                hh.i5 i5Var = (hh.i5) this.b;
                lh.w3[] w3VarArr2 = (lh.w3[]) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                lh.w3 w3Var3 = w3VarArr2[0];
                if (w3Var3 != null) {
                    w3Var3.e(true);
                }
                CharSequence replaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x10 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y11 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof oc) {
                    Layout layout2 = ((oc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        pc[] pcVarArr2 = (pc[]) spanned2.getSpans(0, text2.length(), pc.class);
                        if (pcVarArr2.length > 0 && (pcVar2 = pcVarArr2[0]) != null) {
                            x10 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(pcVar2)) + (pcVarArr2[0].a() / 2);
                            y11 += layout2.getLineTop(layout2.getLineForOffset(r8));
                        }
                    }
                }
                lh.w3 w3Var4 = new lh.w3(i5Var.getContext(), 3);
                w3VarArr2[0] = w3Var4;
                w3Var4.q(true);
                w3Var4.l(11.0f, 8.0f, 11.0f, 7.0f);
                w3Var4.r(10.0f);
                w3Var4.t(replaceTags2);
                w3Var4.h0 = new z(w3Var4, 2);
                w3Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y11);
                w3Var4.h = AndroidUtilities.dp(300.0f);
                w3Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                w3Var4.n(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(w3Var4, h7.z5.e(-1, 100, 55));
                w3Var4.v();
                break;
            case 4:
                ((ConnectionsManager) this.b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                org.telegram.ui.Components.e0.W((org.telegram.ui.Components.e0) this.b, (we.d) this.c, (TL_aicompose.TL_aiComposeTone) this.d);
                break;
            case 6:
                org.telegram.ui.Components.q.S((org.telegram.ui.Components.q) this.b, (org.telegram.ui.ActionBar.c6) this.c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                break;
            case 7:
                org.telegram.ui.Components.y.P((org.telegram.ui.Components.y) this.b, (we.d) this.c, (org.telegram.ui.ActionBar.b2) this.d);
                break;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.b;
                String str = (String) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = z0Var.e;
                if (updates == null) {
                    if (tL_error == null) {
                        new mc(z0Var, c6Var).c0("UNKNOWN_BUTTON", false);
                        z0Var.v("requested_chat_failed", org.telegram.ui.web.z0.x(str, "req_id"));
                        break;
                    } else {
                        new mc(z0Var, c6Var).d0(tL_error, false);
                        z0Var.v("requested_chat_failed", org.telegram.ui.web.z0.x(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(z0Var.I).processUpdates(updates, false);
                    z0Var.v("requested_chat_sent", org.telegram.ui.web.z0.x(str, "req_id"));
                    long j10 = z0Var.Q.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    org.telegram.ui.web.d0 d0Var = new org.telegram.ui.web.d0(z0Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(d0Var);
                    }
                    org.telegram.ui.web.f0 f0Var = z0Var.c;
                    if (f0Var != null) {
                        f0Var.b();
                        break;
                    }
                }
                break;
        }
    }
}
