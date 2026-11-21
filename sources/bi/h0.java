package bi;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements q10 {
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
    @Override // org.telegram.messenger.q10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        oc ocVar;
        oc ocVar2;
        org.telegram.ui.ActionBar.g2 T;
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
                SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y10 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof nc) {
                    Layout layout = ((nc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        oc[] ocVarArr = (oc[]) spanned.getSpans(0, text.length(), oc.class);
                        if (ocVarArr.length > 0 && (ocVar = ocVarArr[0]) != null) {
                            x10 += layout.getPrimaryHorizontal(spanned.getSpanStart(ocVar)) + (ocVarArr[0].a() / 2);
                            y10 += layout.getLineTop(layout.getLineForOffset(r9));
                        }
                    }
                }
                hi.l3 l3Var2 = new hi.l3(m0Var.getContext(), 3);
                l3VarArr[0] = l3Var2;
                l3Var2.r(true);
                l3Var2.n(11.0f, 8.0f, 11.0f, 7.0f);
                l3Var2.s(10.0f);
                l3Var2.v(V2);
                l3Var2.r0 = new c0(l3Var2, i10);
                l3Var2.setTranslationY((-org.telegram.messenger.g0.L(100.0f)) + y10);
                l3Var2.h = org.telegram.messenger.g0.L(300.0f);
                l3Var2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                l3Var2.p(0.0f, x10 - org.telegram.messenger.g0.L(4.0f));
                frameLayout.addView(l3Var2, ma.e(-1, 100, 55));
                l3Var2.x();
                break;
            case 1:
                boolean[] zArr = (boolean[]) obj5;
                aa.r rVar = (aa.r) obj4;
                g4 g4Var = (g4) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.g0.r(rVar);
                    long j3 = 0;
                    if (wallettransaction != null) {
                        long j10 = wallettransaction.fee;
                        if (j10 > 0) {
                            j3 = j10;
                        }
                    }
                    g4Var.a(Long.valueOf(j3));
                    break;
                }
                break;
            case 2:
                j8 j8Var = (j8) obj5;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                ((vf.b) obj4).b();
                if (((Boolean) obj).booleanValue()) {
                    di.c2 c2Var = j8Var.b2;
                    if (c2Var != null) {
                        c2Var.a(tL_starGiftUnique);
                    }
                    j8Var.dismiss();
                    break;
                }
                break;
            case 3:
                di.o0 o0Var = (di.o0) obj5;
                vf.b bVar = (vf.b) obj4;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    mp.u1(o0Var.a).V3(updates, false);
                }
                org.telegram.messenger.g0.g3(new ai.b(o0Var, bVar, t1Var, updates, tL_error, 3));
                break;
            case 4:
                di.f6 f6Var = (di.f6) obj5;
                hi.l3[] l3VarArr2 = (hi.l3[]) obj4;
                FrameLayout frameLayout2 = (FrameLayout) obj3;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                hi.l3 l3Var3 = l3VarArr2[0];
                if (l3Var3 != null) {
                    l3Var3.f(true);
                }
                SpannableStringBuilder V22 = org.telegram.messenger.g0.V2(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y11 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                int i11 = 2;
                if (view2 instanceof nc) {
                    Layout layout2 = ((nc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        oc[] ocVarArr2 = (oc[]) spanned2.getSpans(0, text2.length(), oc.class);
                        if (ocVarArr2.length > 0 && (ocVar2 = ocVarArr2[0]) != null) {
                            x11 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(ocVar2)) + (ocVarArr2[0].a() / 2);
                            y11 += layout2.getLineTop(layout2.getLineForOffset(r8));
                        }
                    }
                }
                hi.l3 l3Var4 = new hi.l3(f6Var.getContext(), 3);
                l3VarArr2[0] = l3Var4;
                l3Var4.r(true);
                l3Var4.n(11.0f, 8.0f, 11.0f, 7.0f);
                l3Var4.s(10.0f);
                l3Var4.v(V22);
                l3Var4.r0 = new c0(l3Var4, i11);
                l3Var4.setTranslationY((-org.telegram.messenger.g0.L(100.0f)) + y11);
                l3Var4.h = org.telegram.messenger.g0.L(300.0f);
                l3Var4.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                l3Var4.p(0.0f, x11 - org.telegram.messenger.g0.L(4.0f));
                frameLayout2.addView(l3Var4, ma.e(-1, 100, 55));
                l3Var4.x();
                break;
            case 5:
                ((ConnectionsManager) obj5).lambda$sendRequestTypedAndProcessUpdates$5((Executor) obj4, (q10) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 6:
                org.telegram.ui.Components.n0 n0Var = (org.telegram.ui.Components.n0) obj5;
                ((vf.b) obj4).c(false);
                org.telegram.messenger.e T1 = mp.u1(n0Var.a).T1();
                T1.b.remove((TL_aicompose.TL_aiComposeTone) obj3);
                T1.d();
                T1.c();
                n0Var.E1();
                break;
            case 7:
                org.telegram.ui.Components.w wVar = (org.telegram.ui.Components.w) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout3 = wVar.a2;
                wVar.b2.setLoading(false);
                if (tL_error2 != null) {
                    if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.ui.Components.n0.z1(new lc(frameLayout3, h6Var), wVar.a);
                        break;
                    } else {
                        org.telegram.ui.Cells.c0.t(frameLayout3, h6Var, tL_error2, false);
                        break;
                    }
                } else {
                    org.telegram.messenger.e T12 = mp.u1(wVar.a).T1();
                    ArrayList arrayList = T12.b;
                    if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                        long j11 = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).id;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if ((arrayList.get(i12) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i12)).id == j11) {
                                wVar.dismiss();
                                T = LaunchActivity.T();
                                if (T == null) {
                                    lc.b0(T).p(aiComposeTone.emoji_id, gd.N0(2131754958, null), gd.a0(null, null, 2131754959, aiComposeTone.title)).j();
                                    break;
                                }
                            }
                        }
                    }
                    arrayList.add(0, aiComposeTone);
                    T12.d();
                    T12.c();
                    wVar.dismiss();
                    T = LaunchActivity.T();
                    if (T == null) {
                    }
                }
                break;
            case 8:
                org.telegram.ui.Components.i0 i0Var = (org.telegram.ui.Components.i0) obj5;
                ((vf.b) obj4).c(false);
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                i0Var.dismiss();
                org.telegram.messenger.e T13 = mp.u1(i0Var.a).T1();
                T13.b.remove(i0Var.f2);
                T13.d();
                T13.c();
                break;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj5;
                fi.f7 f7Var = (fi.f7) obj4;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj3;
                String str = (String) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                if (TextUtils.isEmpty(str)) {
                    v0Var.x(f7Var, "prepared_message_sent", null);
                    org.telegram.ui.web.c0 c0Var = v0Var.c;
                    if (c0Var != null) {
                        c0Var.c();
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.u4(20, botWebViewContainer$BotWebViewProxy, arrayList2), 500L);
                    break;
                } else {
                    v0Var.x(f7Var, "prepared_message_failed", org.telegram.ui.web.v0.A(str, "error"));
                    break;
                }
        }
    }
}
