package ai;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.BitmapFactory;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xr;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03e1  */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        boolean z10;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        ki.s a2;
        int i13 = this.a;
        int i14 = 2;
        int i15 = 1;
        int i16 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i13) {
            case 0:
                l7.d1((l7) obj3, (ug.l1[]) obj2, (Long) obj);
                break;
            case 1:
                l7.A0((l7) obj3, (org.telegram.ui.ActionBar.c2) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 2:
                l7 l7Var = (l7) obj3;
                String str = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                f7 f7Var = l7Var.f0;
                gi.k[] kVarArr = l7Var.t0;
                ei.d dVar = l7Var.k0;
                if (stargiftupgradepreview != null) {
                    f7Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    l7Var.U2(1, false, null);
                    f7Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str), null);
                    kVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    kVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    kVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    l7Var.v0.setVisibility(8);
                    l7Var.u0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.i(LocaleController.getString(R.string.OK), false, true);
                    dVar.g(null, false);
                    dVar.setOnClickListener(new c2(l7Var, 9));
                    l7Var.show();
                    break;
                }
                break;
            case 3:
                e6 e6Var = (e6) obj3;
                e6Var.getClass();
                ((c6) obj2).a((TL_stars.StarGift) obj, true);
                e6Var.d(true);
                break;
            case 4:
                l6 l6Var = (l6) obj3;
                ag.b bVar = (ag.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                pf.c cVar = l6Var.n;
                if (cVar != null && bVar == l6Var.q) {
                    cVar.c(false);
                }
                l6Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    l6Var.o.put(bVar, new i6(bVar, tL_payments_paymentFormStarGift));
                    l6Var.a(true);
                    break;
                }
                break;
            case 5:
                ((Utilities.Callback2) obj3).run((ag.a) obj, new a3.d((l1[]) obj2, 22));
                break;
            case 6:
                ci.p4 p4Var = (ci.p4) obj3;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                p4Var.K3 = canApplyBoost;
                sg.j0.G1(new a5(p4Var, i15), (TL_stories.TL_premium_boostsStatus) obj2, canApplyBoost, p4Var.B1, true);
                ci.z9 z9Var = p4Var.J0;
                if (z9Var != null) {
                    z9Var.k1 = false;
                    z9Var.P();
                    break;
                }
                break;
            case 7:
                ei.l2 l2Var = (ei.l2) obj3;
                ei.tc tcVar = (ei.tc) obj;
                l2Var.getClass();
                ei.j2 j2Var = ((ei.j2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tcVar == null ? "🌤" : tcVar.c);
                sb2.append(" ");
                sb2.append(tcVar == null ? ei.uc.b() ? "24°C" : "72°F" : tcVar.a());
                CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), l2Var.b.getFontMetricsInt(), false);
                ei.l2 l2Var2 = j2Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(replaceEmoji, l2Var2.b, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), l2Var2.b, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                j2Var.k = staticLayout;
                j2Var.l = staticLayout.getLineCount() > 0 ? j2Var.k.getLineWidth(0) : 0.0f;
                j2Var.m = j2Var.k.getLineCount() > 0 ? j2Var.k.getLineLeft(0) : 0.0f;
                j2Var.b = AndroidUtilities.dpf2(17.6f) + j2Var.l;
                j2Var.c = AndroidUtilities.dpf2(36.0f);
                l2Var.invalidate();
                l2Var.requestLayout();
                break;
            case 8:
                ei.xa xaVar = (ei.xa) obj3;
                ei.ub ubVar = (ei.ub) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - ubVar.getBottomPadding2(), xaVar.t2 - ubVar.getPaddingUnderContainer()));
                xaVar.R();
                if (max > 0) {
                    rg.j jVar = xaVar.J0;
                    if ((jVar instanceof rg.w2) && ((rg.w2) jVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = xaVar.N1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        xaVar.N1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        rg.x1 x1Var = xaVar.d1;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(x1Var, (Property<rg.x1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(xaVar.T0, (Property<ei.b6, Float>) property, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                        ei.m5 m5Var = xaVar.W0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(m5Var, (Property<ei.m5, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(xaVar.B0, (Property<rg.k1, Float>) property2, (z10 || xaVar.B1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(xaVar.A0, (Property<rg.g1, Float>) property2, (z10 || xaVar.B1) ? 1.0f : 0.0f));
                        xaVar.R0();
                        xaVar.N1.playTogether(arrayList);
                        if (z10) {
                            xaVar.N1.setDuration(350L);
                            xaVar.N1.setInterpolator(bs.h);
                        } else {
                            xaVar.N1.setDuration(250L);
                            xaVar.N1.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                        }
                        xaVar.N1.start();
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            ((Animator) arrayList.get(i10)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i10)).setInterpolator(z10 ? bs.h : org.telegram.ui.ActionBar.o1.w);
                            ((Animator) arrayList.get(i10)).start();
                        }
                        if (!z10) {
                            xaVar.N0(false);
                        }
                        if (xaVar.h2 != z10) {
                            xaVar.e0();
                        }
                        xaVar.h2 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = xaVar.N1;
                if (animatorSet != null) {
                }
                xaVar.N1 = new AnimatorSet();
                arrayList = new ArrayList();
                rg.x1 x1Var2 = xaVar.d1;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(x1Var2, (Property<rg.x1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(xaVar.T0, (Property<ei.b6, Float>) property3, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                ei.m5 m5Var2 = xaVar.W0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(m5Var2, (Property<ei.m5, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(xaVar.B0, (Property<rg.k1, Float>) property22, (z10 || xaVar.B1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(xaVar.A0, (Property<rg.g1, Float>) property22, (z10 || xaVar.B1) ? 1.0f : 0.0f));
                xaVar.R0();
                xaVar.N1.playTogether(arrayList);
                if (z10) {
                }
                xaVar.N1.start();
                while (i10 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (xaVar.h2 != z10) {
                }
                xaVar.h2 = z10;
                break;
            case 9:
                ei.f6 f6Var = (ei.f6) obj3;
                ei.o5 o5Var = (ei.o5) obj2;
                ei.tc tcVar2 = (ei.tc) obj;
                if (tcVar2 != null) {
                    o5Var.dismiss();
                    f6Var.x0(false);
                    f6Var.c0(f6Var.n0(tcVar2));
                    break;
                }
                break;
            case 10:
                ei.f6 f6Var2 = (ei.f6) obj3;
                rg.q0 q0Var = (rg.q0) obj2;
                rg.n0 n0Var = (rg.n0) obj;
                if (q0Var != null) {
                    int i17 = f6Var2.F1;
                    q0Var.u0 = n0Var;
                    q0Var.q0.b(i17, n0Var, false);
                    q0Var.m();
                    f6Var2.c0(q0Var);
                    break;
                } else {
                    f6Var2.c0(f6Var2.g0(n0Var));
                    break;
                }
            case 11:
                ei.k9 k9Var = (ei.k9) obj3;
                ((j80) obj2).u();
                k9Var.g(true);
                ei.r9 r9Var = k9Var.W;
                ei.u9 u9Var = r9Var.X;
                if (u9Var != null) {
                    u9Var.run(new HashSet(r9Var.v));
                    break;
                }
                break;
            case 12:
                ei.k9 k9Var2 = (ei.k9) obj3;
                k9Var2.W.G = true;
                ((xr[]) obj2)[0].dismiss();
                k9Var2.g(true);
                break;
            case 13:
                ei.qa qaVar = (ei.qa) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Integer num = (Integer) obj;
                ei.vb vbVar = qaVar.a;
                boolean p02 = vbVar.p0();
                int i18 = vbVar.c;
                if (p02) {
                    try {
                        vbVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                vbVar.P1 = false;
                ei.v6 v6Var = vbVar.C0;
                if (v6Var != null) {
                    v6Var.c(false);
                }
                if (vbVar.G1 != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(vbVar.G1.getAbsolutePath(), options);
                        i11 = options.outWidth;
                        try {
                            i12 = options.outHeight;
                        } catch (Exception unused2) {
                            i12 = -1;
                            if (num.intValue() != -1) {
                            }
                            if (num.intValue() != -1) {
                            }
                            ei.a8 m10 = ei.a8.m(r13, vbVar.G1);
                            m10.J0 = vbVar.v0;
                            m10.K0 = vbVar.w0;
                            if (vbVar.A0.j()) {
                            }
                        }
                    } catch (Exception unused3) {
                        i11 = -1;
                    }
                    int i19 = num.intValue() != -1 ? 0 : 90;
                    if (num.intValue() != -1) {
                        if (i11 > i12) {
                            i19 = 270;
                        }
                    } else if (i12 > i11 && i19 != 0) {
                        i19 = 0;
                    }
                    ei.a8 m102 = ei.a8.m(i19, vbVar.G1);
                    m102.J0 = vbVar.v0;
                    m102.K0 = vbVar.w0;
                    if (vbVar.A0.j()) {
                        vbVar.K1 = m102;
                        ei.s9.a(i18, m102);
                        vbVar.L1 = false;
                        if (callback != null) {
                            callback.run(new ei.oa(qaVar, i14));
                            break;
                        } else {
                            vbVar.J(1, true);
                            break;
                        }
                    } else {
                        vbVar.G1 = null;
                        if (vbVar.A0.l(m102)) {
                            ei.a8 a10 = ei.a8.a(vbVar.A0.getLayout(), vbVar.A0.getContent());
                            vbVar.K1 = a10;
                            ei.s9.a(i18, a10);
                            vbVar.L1 = false;
                            if (callback != null) {
                                callback.run(null);
                            }
                        } else if (callback != null) {
                            callback.run(null);
                        }
                        vbVar.l0(true);
                        break;
                    }
                }
                break;
            case 14:
                ei.ac acVar = (ei.ac) obj2;
                Float f7 = (Float) obj;
                acVar.i = f7.floatValue();
                ei.zb zbVar = ((ei.gc) obj3).a;
                if (zbVar != null) {
                    zbVar.n(f7.floatValue(), acVar.a);
                    break;
                }
                break;
            case 15:
                gi.u0 u0Var = (gi.u0) obj3;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) obj2;
                int[] iArr = (int[]) obj;
                u0Var.getClass();
                boolean z11 = false;
                while (i16 < iArr.length) {
                    if (iArr[i16] == 0) {
                        z11 = true;
                    }
                    i16++;
                }
                u0Var.d = true;
                u0Var.e = true;
                u0Var.k();
                Iterator it = u0Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                rVar.run(Boolean.TRUE, Boolean.valueOf(z11));
                break;
            case 16:
                gi.u0 u0Var2 = (gi.u0) obj3;
                Runnable runnable = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                u0Var2.getClass();
                boolean z12 = false;
                while (i16 < iArr2.length) {
                    if (iArr2[i16] == 0) {
                        z12 = true;
                    }
                    i16++;
                }
                u0Var2.d = z12;
                u0Var2.e = z12;
                u0Var2.k();
                Iterator it2 = u0Var2.f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 17:
                ((File[]) obj3)[0] = (File) obj;
                ((gi.d1) obj2).run();
                break;
            case 18:
                ((gi.y2) obj3).d.y.F((String) obj2, (String) obj, false);
                break;
            case 19:
                hi.f fVar = (hi.f) obj3;
                fVar.getClass();
                fVar.W(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 20:
                hi.f fVar2 = (hi.f) obj3;
                fVar2.getClass();
                fVar2.V((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 21:
                hi.k0 k0Var = (hi.k0) obj3;
                k0Var.f0((TLRPC.Chat) obj2, k0Var.e, ((Boolean) obj).booleanValue());
                break;
            case 22:
                View view = (View) obj3;
                ig.s sVar = (ig.s) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                AndroidUtilities.hideKeyboard(sVar);
                AndroidUtilities.runOnUIThread(runnable2, 80L);
                break;
            case 23:
                ig.y1 y1Var = (ig.y1) obj2;
                ig.z1 f10 = ig.z1.f(UserConfig.selectedAccount);
                ti tiVar = ((ig.h0) obj3).b;
                long s12 = tiVar.s1();
                int i20 = f10.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i20).getInputPeer(s12);
                tL_messages_sendQuickReplyMessages.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_sendQuickReplyMessages.shortcut_id = y1Var.a;
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i20);
                    messagesStorage.getStorageQueue().postRunnable(new y0(f10, messagesStorage, y1Var, tL_messages_sendQuickReplyMessages, 22));
                }
                tiVar.dismiss();
                break;
            case 24:
                ig.e1.W((ig.e1) obj3, (View) obj2, (String) obj);
                break;
            case 25:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str2 = (String) obj;
                ki.w3 w3Var = ((ki.q) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str2;
                    w3Var.Z2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str2;
                    w3Var.X1(pageblockmath2);
                    break;
                }
            case 26:
                ki.h1 h1Var = (ki.h1) obj3;
                ki.s sVar2 = (ki.s) obj2;
                String str3 = (String) obj;
                h1Var.getClass();
                if (!TextUtils.isEmpty(str3)) {
                    Editable text = h1Var.getText();
                    int spanStart = text.getSpanStart(sVar2);
                    int spanEnd = text.getSpanEnd(sVar2);
                    if (spanStart >= 0 && spanEnd >= 0 && (a2 = ki.s.a(str3, h1Var.getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) != null) {
                        boolean z13 = h1Var.v;
                        if (z13) {
                            h1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        int max2 = Math.max(0, Math.min(spanStart, h1Var.length()));
                        text.replace(max2, Math.max(max2, Math.min(spanEnd, h1Var.length())), spannableString);
                        h1Var.setSelection(Math.min(max2 + 1, h1Var.length()));
                        if (z13) {
                            h1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 27:
                ki.d2 d2Var = (ki.d2) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str4 = (String) obj;
                d2Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str4;
                    d2Var.P.Z2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str4;
                    d2Var.P.X1(pageblockmath4);
                    break;
                }
            case 28:
                ki.w3 w3Var2 = (ki.w3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str5 = (String) obj;
                w3Var2.getClass();
                if (!TextUtils.equals(str5, pageblockmath5.source)) {
                    ki.h2 h2Var = w3Var2.K3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    pageblockmath5.source = str5;
                    w3Var2.Z2.N(false);
                    ki.h2 h2Var2 = w3Var2.K3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    w3Var2.i3.onContentChanged();
                    break;
                }
                break;
            default:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
        }
    }
}
