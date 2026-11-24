// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.b0;
import org.telegram.ui.Components.c0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class f09 implements c39 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f09(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(int i, View view) {
        lwb lwbVar = (lwb) this.b;
        ArrayList arrayList = lwbVar.U;
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        iwb iwbVar = (iwb) arrayList.get(i);
        long j = iwbVar.a;
        if (j != 0) {
            if (lwbVar.V == j) {
                j = 0;
            }
            lwbVar.V = j;
        } else {
            lwbVar.W = iwbVar.b.equals(lwbVar.W) ? null : iwbVar.b;
        }
        gl.d0(lwbVar.S, new yvb((byte) 0));
        lwbVar.l(false);
        lwbVar.n();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:170|(3:172|(1:174)|175)|176|(2:178|(5:180|(1:182)(1:224)|(1:184)|(1:223)(5:188|189|190|(1:192)(1:220)|193)|(5:200|201|202|203|(2:205|206)(1:207))(3:210|(3:212|(2:215|213)|216)(1:218)|217))(6:225|226|201|202|203|(0)(0)))|227|226|201|202|203|(0)(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    @Override // c39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, View view) {
        c4c G;
        c4c G2;
        c4c G3;
        c4c G4;
        qya[] qyaVarArr;
        TLRPC.StickerSet stickerSet;
        bbb bbbVar;
        int intValue;
        int intValue2;
        int i2;
        zab zabVar;
        CharSequence m;
        gm[] gmVarArr;
        ArrayList arrayList;
        s49 K;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i3 = 3;
        Paint.FontMetricsInt fontMetricsInt = null;
        byte b = 0;
        byte b2 = 1;
        switch (this.a) {
            case 0:
                t09 t09Var = (t09) this.b;
                s09 s09Var = t09Var.h0;
                if (s09Var == null || !(view instanceof r09)) {
                    return;
                }
                s09Var.q(t09Var, ((r09) view).e, false, false);
                return;
            case 1:
                ((y09) this.b).f0(view);
                return;
            case 2:
                ((qa9) this.b).c0(i, view);
                return;
            case 3:
                vl9 vl9Var = (vl9) this.b;
                if (i == 1) {
                    vl9Var.c0(2131745793, new CharSequence[]{"480p", "360p"}, new sc8((byte) 23));
                    return;
                }
                if (i == 2) {
                    vl9Var.c0(2131745803, new CharSequence[]{k96.M0(2131745802, null), k96.M0(2131745800, null), k96.M0(2131745801, null)}, new sc8((byte) 24));
                    return;
                }
                if (i == 3) {
                    vl9Var.c0(2131745796, new CharSequence[]{"30 FPS", "60 FPS"}, new sc8((byte) 25));
                    return;
                }
                if (i != 4) {
                    if (i == 7) {
                        im0 im0Var = wcd.h;
                        im0Var.a();
                        boolean z = !im0Var.d;
                        synchronized (im0Var) {
                            im0Var.d = z;
                            im0Var.c = true;
                            im0Var.b = true;
                            j8a.a.edit().putBoolean("round_video_composition", z).apply();
                        }
                        ((gx0) vl9Var.c).g(i);
                        return;
                    }
                    return;
                }
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = vl9.d;
                    if (b >= 3) {
                        vl9Var.c0(2131745804, charSequenceArr, new sc8((byte) 26));
                        return;
                    } else {
                        charSequenceArr[b] = vl9.a0(iArr[b]);
                        b++;
                    }
                }
            case 4:
                iy9 iy9Var = (iy9) this.b;
                c4c G5 = iy9Var.d2.G(i - 1);
                if (G5 != null) {
                    Object obj = G5.H;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((rr8) view).y(true, true);
                        iy9Var.V1 = (TLObject) G5.H;
                        iy9Var.Z0(true);
                        iy9Var.d2.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ny9 ny9Var = (ny9) this.b;
                u41 u41Var = ny9Var.X1;
                HashSet hashSet = ny9Var.U1;
                l5c l5cVar = ny9Var.b2;
                if (l5cVar == null || (G = l5cVar.G(i - 1)) == null) {
                    return;
                }
                Object obj2 = G.H;
                if (obj2 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                    int i4 = savedStarGift.msg_id;
                    long j = i4 == 0 ? savedStarGift.saved_id : i4;
                    if (hashSet.contains(Long.valueOf(j))) {
                        hashSet.remove(Long.valueOf(j));
                        ((nv4) view).c(false, true);
                        G.e = false;
                    } else {
                        hashSet.add(Long.valueOf(j));
                        ((nv4) view).c(true, true);
                        G.e = true;
                    }
                    u41Var.setEnabled(hashSet.size() > 0);
                    u41Var.c(hashSet.size(), true);
                    return;
                }
                return;
            case 6:
                ((qy9) this.b).Z0(i, view);
                return;
            case 7:
                ((SessionsActivity) this.b).k0(i);
                return;
            case 8:
                ee5 ee5Var = (ee5) view;
                taa taaVar = ((qaa) this.b).L;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) hq6.d0(taaVar.a).j1.get(i);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                TLRPC.Peer peer = tL_topPeer.peer;
                long j2 = peer.user_id;
                if (j2 == 0) {
                    long j3 = peer.channel_id;
                    if (j3 == 0) {
                        j3 = peer.chat_id;
                        if (j3 == 0) {
                            j2 = 0;
                        }
                    }
                    j2 = -j3;
                }
                if (ee5Var.F) {
                    taaVar.S0(j2, ee5Var);
                    return;
                }
                tL_dialog.id = j2;
                taaVar.O0(null, tL_dialog);
                boolean z2 = taaVar.P1.h(j2) >= 0;
                if (ee5Var.x) {
                    ee5Var.w.a(z2, true);
                    return;
                }
                return;
            case 9:
                kga kgaVar = (kga) this.b;
                int i5 = i - 1;
                if (i5 < 0 || i5 >= eb6.g()) {
                    return;
                }
                kgaVar.r1.e(kga.D0(i5));
                kgaVar.dismiss();
                return;
            case 10:
                zma zmaVar = (zma) this.b;
                c4c G6 = zmaVar.S1.G(i - 1);
                Object obj3 = G6 != null ? G6.H : null;
                if (obj3 instanceof TLRPC.User) {
                    na7.q1(zmaVar.a).z3(zmaVar.i1, (TLRPC.User) obj3, null, 0, null, false, false);
                    return;
                }
                return;
            case 11:
                ((jva) this.b).L0(i);
                return;
            case 12:
                vua vuaVar = (vua) this.b;
                l5c l5cVar2 = vuaVar.W1;
                if (l5cVar2 == null || (G2 = l5cVar2.G(i - 1)) == null) {
                    return;
                }
                l5c l5cVar3 = vuaVar.W1;
                if (G2.d == -1) {
                    vuaVar.X1 = !vuaVar.X1;
                    l5cVar3.O(true);
                    vuaVar.n1.x0(0, gl.L(200.0f), s33.g);
                    return;
                }
                if (G2.H(wua.class) && (G2.H instanceof TL_stars.TL_starsGiftOption)) {
                    Context W = gl.W(vuaVar.getContext());
                    if (W == null) {
                        W = LaunchActivity.H1;
                    }
                    Context context = W;
                    if (context != null) {
                        long j4 = vuaVar.U1.id;
                        gta v = gta.v(vuaVar.a, false);
                        TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G2.H;
                        et4 et4Var = new et4((Object) vuaVar, (Object) G2, j4, (byte) 6);
                        int i6 = v.a;
                        if (!na7.q1(i6).a5()) {
                            d Q = LaunchActivity.Q();
                            if (Q == null || Q.getContext() == null) {
                                gta.c0(context, null);
                                return;
                            } else {
                                gta.c0(Q.getContext(), Q.getResourceProvider());
                                return;
                            }
                        }
                        if (!w01.b() && ci0.h().j()) {
                            TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                            tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                            tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                            tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                            tL_inputStorePaymentStarsGift.user_id = na7.q1(i6).m1(j4);
                            i5 i5Var = new i5();
                            i5Var.b = "inapp";
                            i5Var.a = tL_starsGiftOption.store_product;
                            ci0.h().o(Arrays.asList(i5Var.a()), new kh(v, et4Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                            return;
                        }
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = na7.q1(i6).m1(j4);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject u = ow0.u(gta.F(), false);
                        if (u != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = u.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i6).sendRequest(tL_payments_getPaymentForm, new ck8((Object) v, (Object) et4Var, (Object) tL_inputInvoiceStars, (byte) 19));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                zua zuaVar = (zua) this.b;
                l5c l5cVar4 = zuaVar.Z1;
                if (l5cVar4 == null || (G3 = l5cVar4.G(i - 1)) == null) {
                    return;
                }
                l5c l5cVar5 = zuaVar.Z1;
                if (G3.d == -1) {
                    zuaVar.a2 = !zuaVar.a2;
                    l5cVar5.O(true);
                    return;
                } else {
                    if (G3.H(wua.class) && (G3.H instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W2 = gl.W(zuaVar.getContext());
                        if (W2 == null) {
                            W2 = LaunchActivity.H1;
                        }
                        if (W2 != null) {
                            gta.v(zuaVar.a, false).d(W2, (TL_stars.TL_starsTopupOption) G3.H, new w77(zuaVar, G3, (byte) 13), zuaVar.X1);
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 14:
                ava avaVar = (ava) this.b;
                l5c l5cVar6 = avaVar.T1;
                if (l5cVar6 == null || (G4 = l5cVar6.G(i - 1)) == null) {
                    return;
                }
                l5c l5cVar7 = avaVar.T1;
                if (G4.d == -1) {
                    avaVar.U1 = !avaVar.U1;
                    l5cVar7.O(true);
                    avaVar.n1.x0(0, gl.L(300.0f), null);
                    return;
                } else {
                    if (G4.H(wua.class) && (G4.H instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W3 = gl.W(avaVar.getContext());
                        if (W3 == null) {
                            W3 = LaunchActivity.H1;
                        }
                        if (W3 != null) {
                            gta.v(avaVar.a, false).d(W3, (TL_stars.TL_starsTopupOption) G4.H, new w77(avaVar, G4, (byte) 14), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 15:
                uxa uxaVar = (uxa) this.b;
                ArrayList arrayList2 = uxaVar.O;
                ArrayList arrayList3 = uxaVar.P;
                ywa ywaVar = uxaVar.X;
                int i7 = ywaVar.J;
                if (i >= i7 && i <= ywaVar.K) {
                    rxa rxaVar = (rxa) uxaVar.z0.get(i - i7);
                    s47 s47Var = new s47(uxaVar.b, rxaVar.b, true);
                    s47Var.f0 = rxaVar;
                    uxaVar.presentFragment(s47Var);
                    return;
                }
                int i8 = ywaVar.V;
                if (i >= i8 && i <= ywaVar.W) {
                    ((nxa) uxaVar.R.get(i - i8)).b(uxaVar);
                    return;
                }
                int i9 = ywaVar.S;
                if (i >= i9 && i <= ywaVar.T) {
                    ((nxa) arrayList3.get(i - i9)).b(uxaVar);
                    return;
                }
                int i10 = ywaVar.Y;
                if (i >= i10 && i <= ywaVar.Z) {
                    ((nxa) uxaVar.Q.get(i - i10)).b(uxaVar);
                    return;
                }
                if (i == ywaVar.a0) {
                    int size = arrayList2.size() - arrayList3.size();
                    int i11 = uxaVar.X.a0;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    ywa ywaVar2 = uxaVar.X;
                    if (ywaVar2 != null) {
                        ywaVar2.E();
                        uxaVar.T.setItemAnimator(uxaVar.Y);
                        uxaVar.X.p(i11 + 1, size);
                        uxaVar.X.r(i11);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                tya tyaVar = (tya) this.b;
                if (i < 1 || (qyaVarArr = tyaVar.g3) == null) {
                    return;
                }
                qya qyaVar = qyaVarArr[i - 1];
                int L = gl.L(64.0f);
                if (tyaVar.getMeasuredWidth() - view.getRight() < L) {
                    tyaVar.x0(L - (tyaVar.getMeasuredWidth() - view.getRight()), 0, s33.h);
                } else if (view.getLeft() < L) {
                    tyaVar.x0(-(L - view.getLeft()), 0, s33.h);
                }
                p8c p8cVar = tyaVar.v3;
                if (p8cVar != null) {
                    p8cVar.a(qyaVar);
                    return;
                }
                return;
            case 17:
                u0b u0bVar = (u0b) this.b;
                if (view instanceof o0b) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = u0bVar.M1;
                    d dVar = u0bVar.F1;
                    wjb wjbVar = u0bVar.J0;
                    if (dVar != null) {
                        Context context2 = dVar.getContext();
                        if (!(dVar instanceof mu1)) {
                            a1b.a(tL_messages_stickerSet, dVar, wjbVar);
                            return;
                        }
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, wjbVar, context2);
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        b00.r(null, 2131744625, arrayList4, R.drawable.menu_sticker_add, arrayList6);
                        arrayList5.add(0);
                        arrayList4.add(k96.M0(2131744632, null));
                        arrayList6.add(Integer.valueOf(R.drawable.menu_sticker_select));
                        arrayList5.add(1);
                        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        wjb wjbVar2 = wjbVar;
                        og ogVar = new og(m8Var, arrayList5, tL_messages_stickerSet, dVar, wjbVar2);
                        int i12 = 0;
                        while (i12 < arrayList4.size()) {
                            wjb wjbVar3 = wjbVar2;
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList6.get(i12)).intValue(), (CharSequence) arrayList4.get(i12), false, wjbVar3);
                            wjbVar2 = wjbVar3;
                            c.setTag(Integer.valueOf(i12));
                            c.setOnClickListener(ogVar);
                            i12++;
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        }
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        m8Var.c = (short) 100;
                        m8Var.g = true;
                        m8Var.setOutsideTouchable(true);
                        m8Var.setClippingEnabled(true);
                        m8Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m8Var.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
                        m8Var.setInputMethodMode(2);
                        m8Var.getContentView().setFocusableInTouchMode(true);
                        int[] iArr2 = new int[2];
                        view.getLocationInWindow(iArr2);
                        m8Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr2[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr2[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout3.getMeasuredHeight() / 2));
                        m8Var.b();
                        return;
                    }
                    return;
                }
                if (u0bVar.L1) {
                    return;
                }
                if (u0bVar.Q1 != null) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) u0bVar.n1.f.get(i);
                    if (stickerSetCovered2 != null) {
                        u0bVar.dismiss();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet2 = stickerSetCovered2.set;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.id = stickerSet2.id;
                        new u0b(u0bVar.H1, u0bVar.F1, tL_inputStickerSetID, null, null, u0bVar.J0).show();
                        return;
                    }
                    return;
                }
                ArrayList arrayList7 = u0bVar.S1;
                if (arrayList7 != null) {
                    if (i < 0 || i >= arrayList7.size()) {
                        return;
                    }
                    s3a s3aVar = (s3a) u0bVar.S1.get(i);
                    u0bVar.O1 = s3aVar;
                    if (s3aVar.c) {
                        TextView textView = u0bVar.A1;
                        textView.setText(vu3.m(s3aVar.b, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        u0bVar.z1.k(gl5.g(u0bVar.O1.a), null, null, null, null, u0bVar.O1.e ? "tgs" : null, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) u0bVar.w1.getLayoutParams();
                        layoutParams.topMargin = u0bVar.Y1;
                        u0bVar.w1.setLayoutParams(layoutParams);
                        u0bVar.w1.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(u0bVar.w1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = u0bVar.M1;
                if (tL_messages_stickerSet2 == null || i < 0 || i >= tL_messages_stickerSet2.documents.size()) {
                    return;
                }
                u0bVar.N1 = u0bVar.M1.documents.get(i);
                int i13 = 0;
                while (true) {
                    if (i13 < u0bVar.N1.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = u0bVar.N1.attributes.get(i13);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            String str = documentAttribute.alt;
                            if (str != null && str.length() > 0) {
                                TextView textView2 = u0bVar.A1;
                                textView2.setText(vu3.m(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        } else {
                            i13++;
                        }
                    }
                }
                TextView textView3 = u0bVar.A1;
                String str2 = (String) hq6.d0(u0bVar.a).d0.f(u0bVar.N1.id);
                if (str2 == null) {
                    str2 = "";
                }
                textView3.setText(vu3.m(str2, u0bVar.A1.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = u0bVar.M1;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !xv2.e().m(view)) {
                    u0bVar.z1.getImageReceiver().b0(gl5.b(u0bVar.N1), null, gl5.c(ba4.w(u0bVar.N1.thumbs, 90, false, null, false), u0bVar.N1), null, "webp", u0bVar.M1, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) u0bVar.w1.getLayoutParams();
                    layoutParams2.topMargin = u0bVar.Y1;
                    u0bVar.w1.setLayoutParams(layoutParams2);
                    u0bVar.w1.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(u0bVar.w1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                    return;
                }
                return;
            case 18:
                dbb dbbVar = (dbb) this.b;
                String str3 = ((cbb) view).a;
                if (!dbbVar.s || (bbbVar = dbbVar.c) == null || !(bbbVar.getFieldText() instanceof Spanned)) {
                    return;
                }
                if (dbbVar.W != null) {
                    intValue = ((Spanned) dbbVar.c.getFieldText()).getSpanStart(dbbVar.W);
                    intValue2 = ((Spanned) dbbVar.c.getFieldText()).getSpanEnd(dbbVar.W);
                } else {
                    Integer num = dbbVar.b0;
                    if (num == null || dbbVar.c0 == null) {
                        return;
                    }
                    intValue = num.intValue();
                    intValue2 = dbbVar.c0.intValue();
                    dbbVar.c0 = null;
                    dbbVar.b0 = null;
                }
                Editable editText = dbbVar.c.getEditText();
                if (editText == null || intValue < 0 || intValue2 < 0 || intValue > editText.length() || intValue2 > editText.length()) {
                    return;
                }
                if (dbbVar.W != null) {
                    if (dbbVar.c.getFieldText() instanceof Spannable) {
                        ((Spannable) dbbVar.c.getFieldText()).removeSpan(dbbVar.W);
                    }
                    dbbVar.W = null;
                }
                String obj4 = editText.toString();
                String substring = obj4.substring(intValue, intValue2);
                int length = substring.length();
                int i14 = intValue2 - length;
                while (i14 >= 0) {
                    int i15 = i14 + length;
                    if (obj4.substring(i14, i15).equals(substring)) {
                        Paint.FontMetricsInt fontMetricsInt2 = dbbVar.c.getEditField() != null ? dbbVar.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
                        if (fontMetricsInt2 == null) {
                            Paint paint = new Paint();
                            paint.setTextSize(gl.L(18.0f));
                            fontMetricsInt2 = paint.getFontMetricsInt();
                        }
                        if (str3 == null || !str3.startsWith("animated_")) {
                            m = vu3.m(str3, fontMetricsInt2, true, fontMetricsInt, 0);
                        } else {
                            try {
                                long parseLong = Long.parseLong(str3.substring(9));
                                TLRPC.Document e = vl.e(dbbVar.a, parseLong);
                                SpannableString spannableString = new SpannableString(k27.U(e));
                                spannableString.setSpan(e == null ? new gm(parseLong, fontMetricsInt2) : new gm(e, fontMetricsInt2), 0, spannableString.length(), 33);
                                m = spannableString;
                            } catch (Exception unused) {
                                m = null;
                            }
                        }
                        if (m == null || ((gmVarArr = (gm[]) editText.getSpans(i14, i15, gm.class)) != null && gmVarArr.length > 0)) {
                            i2 = 3;
                            dbbVar.performHapticFeedback(i2, 1);
                            vu3.a(str3);
                            dbbVar.s = false;
                            dbbVar.w = true;
                            dbbVar.J = (byte) 0;
                            zabVar = dbbVar.d;
                            if (zabVar != null) {
                                zabVar.invalidate();
                                return;
                            }
                            return;
                        }
                        su3[] su3VarArr = (su3[]) editText.getSpans(i14, i15, su3.class);
                        if (su3VarArr != null) {
                            for (su3 su3Var : su3VarArr) {
                                editText.removeSpan(su3Var);
                            }
                        }
                        editText.replace(i14, i15, "");
                        editText.insert(i14, m);
                        i14 -= length;
                        i3 = 3;
                        fontMetricsInt = null;
                    } else {
                        i2 = i3;
                        dbbVar.performHapticFeedback(i2, 1);
                        vu3.a(str3);
                        dbbVar.s = false;
                        dbbVar.w = true;
                        dbbVar.J = (byte) 0;
                        zabVar = dbbVar.d;
                        if (zabVar != null) {
                        }
                    }
                }
                i2 = i3;
                dbbVar.performHapticFeedback(i2, 1);
                vu3.a(str3);
                dbbVar.s = false;
                dbbVar.w = true;
                dbbVar.J = (byte) 0;
                zabVar = dbbVar.d;
                if (zabVar != null) {
                }
                break;
            case 19:
                ((ydb) this.b).D0(i);
                return;
            case 20:
                l5c l5cVar8 = ((xdb) this.b).X1;
                if (l5cVar8 != null) {
                    l5cVar8.G(i - 1);
                    return;
                }
                return;
            case 21:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) this.b;
                int i16 = ThemeEditorView.EditorAlert.G1;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i != 0) {
                    w39 adapter = editorAlert.m1.getAdapter();
                    b0 b0Var = editorAlert.r1;
                    if (adapter == b0Var) {
                        int i17 = i - 1;
                        ArrayList arrayList8 = b0Var.d;
                        themeEditorView.e = (i17 < 0 || i17 >= arrayList8.size()) ? null : (ArrayList) arrayList8.get(i17);
                    } else {
                        c0 c0Var = editorAlert.s1;
                        int i18 = i - 1;
                        if (i18 < 0) {
                            c0Var.getClass();
                        } else if (i18 < c0Var.e.size()) {
                            arrayList = (ArrayList) c0Var.e.get(i18);
                            themeEditorView.e = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.e = arrayList;
                    }
                    themeEditorView.f = i;
                    for (int i19 = 0; i19 < themeEditorView.e.size(); i19++) {
                        blb blbVar = (blb) themeEditorView.e.get(i19);
                        int i20 = blbVar.e;
                        if (i20 == bkb.De) {
                            gl2 gl2Var = themeEditorView.m;
                            fx0 i21 = ug8.i((Activity) gl2Var.c, false, 1, null);
                            i21.P = k96.M0(2131752111, null);
                            i21.Q = true;
                            CharSequence[] charSequenceArr2 = {k96.M0(2131752101, null), k96.M0(2131745464, null), k96.M0(2131745471, null), k96.M0(2131751588, null)};
                            r20 r20Var = new r20(gl2Var, (byte) 5);
                            i21.M = charSequenceArr2;
                            i21.N = null;
                            i21.L = r20Var;
                            i21.show();
                            return;
                        }
                        int w0 = bkb.w0(blbVar.i, i20, false);
                        blbVar.h = w0;
                        if (i19 == 0) {
                            editorAlert.l1.c(w0);
                        }
                    }
                    editorAlert.F0(true);
                    return;
                }
                return;
            case 22:
                qmb qmbVar = (qmb) this.b;
                boolean z3 = qmbVar.Y0 != null;
                qmbVar.d1(i);
                if (z3 == (qmbVar.Y0 == null)) {
                    qmbVar.M0();
                    qmbVar.p1();
                }
                qmbVar.r1();
                qmbVar.L0[1].a(qmbVar.Y0 != null, true);
                qmbVar.R0.h1();
                int left = view.getLeft();
                int right = view.getRight();
                int L2 = gl.L(52.0f);
                int i22 = left - L2;
                rkb rkbVar = qmbVar.R0;
                if (i22 < 0) {
                    rkbVar.x0(i22, 0, null);
                    return;
                }
                int i23 = right + L2;
                if (i23 > rkbVar.getMeasuredWidth()) {
                    rkb rkbVar2 = qmbVar.R0;
                    rkbVar2.x0(i23 - rkbVar2.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 23:
                zsb zsbVar = (zsb) this.b;
                int i24 = zsbVar.I;
                HashSet hashSet2 = zsbVar.x;
                if (view instanceof za5) {
                    za5 za5Var = (za5) view;
                    TLRPC.Chat chat = (TLRPC.Chat) za5Var.getObject();
                    boolean contains = hashSet2.contains(Long.valueOf(chat.id));
                    long j5 = chat.id;
                    if (contains) {
                        hashSet2.remove(Long.valueOf(j5));
                        za5Var.c(false, true);
                    } else {
                        hashSet2.add(Long.valueOf(j5));
                        za5Var.c(true, true);
                    }
                    if (hashSet2.isEmpty() && zsbVar.w != -1 && zsbVar.n.getVisibility() == 0) {
                        zsbVar.w = -1;
                        zsbVar.n.animate().setListener(null).cancel();
                        zsbVar.n.animate().translationY(i24).setDuration(200L).setListener(new vsb(zsbVar, b)).start();
                        o39 o39Var = zsbVar.s.getVisibility() == 0 ? zsbVar.b : zsbVar.a;
                        o39Var.e1(false);
                        int M0 = ((t26) o39Var.getLayoutManager()).M0();
                        if ((M0 == o39Var.getAdapter().b() - 1 || (M0 == o39Var.getAdapter().b() - 2 && o39Var == zsbVar.a)) && (K = o39Var.K(M0)) != null) {
                            int bottom = K.a.getBottom();
                            if (M0 == zsbVar.d.c - 2) {
                                bottom += gl.L(12.0f);
                            }
                            if (o39Var.getMeasuredHeight() - bottom <= i24) {
                                o39Var.setTranslationY(-(o39Var.getMeasuredHeight() - bottom));
                                o39Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        zsbVar.a.setPadding(0, 0, 0, 0);
                        zsbVar.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet2.isEmpty() && zsbVar.n.getVisibility() == 8 && zsbVar.w != 1) {
                        zsbVar.w = 1;
                        zsbVar.n.setVisibility(0);
                        zsbVar.n.setTranslationY(i24);
                        zsbVar.n.animate().setListener(null).cancel();
                        zsbVar.n.animate().translationY(0.0f).setDuration(200L).setListener(new vsb(zsbVar, b2)).start();
                        zsbVar.a.setPadding(0, 0, 0, i24 - gl.L(12.0f));
                        zsbVar.b.setPadding(0, 0, 0, i24);
                    }
                    if (!hashSet2.isEmpty()) {
                        zsbVar.c.setText(k96.a0("LeaveChats", null, 2131748807, k96.G(hashSet2.size(), "Chats", new Object[0])));
                    }
                    if (hashSet2.isEmpty()) {
                        return;
                    }
                    o39 o39Var2 = zsbVar.s.getVisibility() == 0 ? zsbVar.b : zsbVar.a;
                    int height = o39Var2.getHeight() - view.getBottom();
                    if (height < i24) {
                        o39Var2.x0(0, i24 - height, null);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ((qvb) this.b).H0(view);
                return;
            case 25:
                qvb qvbVar = ((mvb) this.b).w0;
                long j6 = qvbVar.a;
                if (view instanceof ytb) {
                    mm4.n(qvbVar, j6, ((ytb) view).getTopic(), 0);
                    return;
                } else {
                    if (view instanceof nvb) {
                        nvb nvbVar = (nvb) view;
                        mm4.n(qvbVar, j6, nvbVar.O, nvbVar.getMessageId());
                        return;
                    }
                    return;
                }
            case 26:
                a(i, view);
                return;
            case 27:
                d2c d2cVar = (d2c) this.b;
                w39 adapter2 = d2cVar.n.getAdapter();
                c1b c1bVar = d2cVar.w;
                if (adapter2 == c1bVar) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) c1bVar.L.get(i);
                } else {
                    c2c c2cVar = d2cVar.s;
                    stickerSetCovered = i < c2cVar.x ? (TLRPC.StickerSetCovered) c2cVar.f.get(i) : null;
                }
                if (stickerSetCovered != null) {
                    d2cVar.b(stickerSetCovered.set, null);
                    return;
                }
                return;
            case 28:
                ((TwoStepVerificationActivity) this.b).j0(i);
                return;
            default:
                ((WallpapersListActivity) this.b).C0(i);
                return;
        }
    }
}
