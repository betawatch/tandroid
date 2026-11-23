package bi;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements p10 {
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
    @Override // org.telegram.messenger.p10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        nc ncVar;
        nc ncVar2;
        org.telegram.ui.ActionBar.g2 T;
        int i7 = this.a;
        int i10 = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i7) {
            case 0:
                m0 m0Var = (m0) obj5;
                hi.u3[] u3VarArr = (hi.u3[]) obj4;
                FrameLayout frameLayout = (FrameLayout) obj3;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                hi.u3 u3Var = u3VarArr[0];
                if (u3Var != null) {
                    u3Var.f(true);
                }
                SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y10 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof mc) {
                    Layout layout = ((mc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        nc[] ncVarArr = (nc[]) spanned.getSpans(0, text.length(), nc.class);
                        if (ncVarArr.length > 0 && (ncVar = ncVarArr[0]) != null) {
                            x10 += layout.getPrimaryHorizontal(spanned.getSpanStart(ncVar)) + (ncVarArr[0].a() / 2);
                            y10 += layout.getLineTop(layout.getLineForOffset(r9));
                        }
                    }
                }
                hi.u3 u3Var2 = new hi.u3(m0Var.getContext(), 3);
                u3VarArr[0] = u3Var2;
                u3Var2.r(true);
                u3Var2.n(11.0f, 8.0f, 11.0f, 7.0f);
                u3Var2.s(10.0f);
                u3Var2.v(V2);
                u3Var2.r0 = new c0(u3Var2, i10);
                u3Var2.setTranslationY((-org.telegram.messenger.g0.L(100.0f)) + y10);
                u3Var2.h = org.telegram.messenger.g0.L(300.0f);
                u3Var2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                u3Var2.p(0.0f, x10 - org.telegram.messenger.g0.L(4.0f));
                frameLayout.addView(u3Var2, na.e(-1, 100, 55));
                u3Var2.x();
                break;
            case 1:
                boolean[] zArr = (boolean[]) obj5;
                aa.r rVar = (aa.r) obj4;
                j4 j4Var = (j4) obj3;
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
                    j4Var.a(Long.valueOf(j3));
                    break;
                }
                break;
            case 2:
                l8 l8Var = (l8) obj5;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                ((vf.b) obj4).b();
                if (((Boolean) obj).booleanValue()) {
                    di.c2 c2Var = l8Var.b2;
                    if (c2Var != null) {
                        c2Var.a(tL_starGiftUnique);
                    }
                    l8Var.dismiss();
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
                org.telegram.messenger.g0.g3(new s1(o0Var, bVar, t1Var, updates, tL_error, 2));
                break;
            case 4:
                di.f6 f6Var = (di.f6) obj5;
                hi.u3[] u3VarArr2 = (hi.u3[]) obj4;
                FrameLayout frameLayout2 = (FrameLayout) obj3;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                hi.u3 u3Var3 = u3VarArr2[0];
                if (u3Var3 != null) {
                    u3Var3.f(true);
                }
                SpannableStringBuilder V22 = org.telegram.messenger.g0.V2(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y11 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                int i11 = 2;
                if (view2 instanceof mc) {
                    Layout layout2 = ((mc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        nc[] ncVarArr2 = (nc[]) spanned2.getSpans(0, text2.length(), nc.class);
                        if (ncVarArr2.length > 0 && (ncVar2 = ncVarArr2[0]) != null) {
                            x11 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(ncVar2)) + (ncVarArr2[0].a() / 2);
                            y11 += layout2.getLineTop(layout2.getLineForOffset(r8));
                        }
                    }
                }
                hi.u3 u3Var4 = new hi.u3(f6Var.getContext(), 3);
                u3VarArr2[0] = u3Var4;
                u3Var4.r(true);
                u3Var4.n(11.0f, 8.0f, 11.0f, 7.0f);
                u3Var4.s(10.0f);
                u3Var4.v(V22);
                u3Var4.r0 = new c0(u3Var4, i11);
                u3Var4.setTranslationY((-org.telegram.messenger.g0.L(100.0f)) + y11);
                u3Var4.h = org.telegram.messenger.g0.L(300.0f);
                u3Var4.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                u3Var4.p(0.0f, x11 - org.telegram.messenger.g0.L(4.0f));
                frameLayout2.addView(u3Var4, na.e(-1, 100, 55));
                u3Var4.x();
                break;
            case 5:
                ((ConnectionsManager) obj5).lambda$sendRequestTypedAndProcessUpdates$5((Executor) obj4, (p10) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 6:
                org.telegram.ui.Components.m0 m0Var2 = (org.telegram.ui.Components.m0) obj5;
                ((vf.b) obj4).c(false);
                org.telegram.messenger.e T1 = mp.u1(m0Var2.a).T1();
                T1.b.remove((TL_aicompose.TL_aiComposeTone) obj3);
                T1.d();
                T1.c();
                m0Var2.E1();
                break;
            case 7:
                org.telegram.ui.Components.v vVar = (org.telegram.ui.Components.v) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout3 = vVar.a2;
                vVar.b2.setLoading(false);
                if (tL_error2 != null) {
                    if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.ui.Components.m0.z1(new kc(frameLayout3, i6Var), vVar.a);
                        break;
                    } else {
                        org.telegram.ui.Cells.c0.t(frameLayout3, i6Var, tL_error2, false);
                        break;
                    }
                } else {
                    org.telegram.messenger.e T12 = mp.u1(vVar.a).T1();
                    ArrayList arrayList = T12.b;
                    if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                        long j11 = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).id;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if ((arrayList.get(i12) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i12)).id == j11) {
                                vVar.dismiss();
                                T = LaunchActivity.T();
                                if (T == null) {
                                    kc.b0(T).p(aiComposeTone.emoji_id, gd.N0(2131754958, null), gd.a0(null, null, 2131754959, aiComposeTone.title)).j();
                                    break;
                                }
                            }
                        }
                    }
                    arrayList.add(0, aiComposeTone);
                    T12.d();
                    T12.c();
                    vVar.dismiss();
                    T = LaunchActivity.T();
                    if (T == null) {
                    }
                }
                break;
            case 8:
                org.telegram.ui.Components.h0 h0Var = (org.telegram.ui.Components.h0) obj5;
                ((vf.b) obj4).c(false);
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                h0Var.dismiss();
                org.telegram.messenger.e T13 = mp.u1(h0Var.a).T1();
                T13.b.remove(h0Var.f2);
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
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.r(24, botWebViewContainer$BotWebViewProxy, arrayList2), 500L);
                    break;
                } else {
                    v0Var.x(f7Var, "prepared_message_failed", org.telegram.ui.web.v0.A(str, "error"));
                    break;
                }
        }
    }
}
