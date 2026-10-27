package ai;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import bi.b7;
import bi.d6;
import bi.g6;
import bi.h7;
import bi.u6;
import bi.v4;
import bi.x5;
import bi.z1;
import bi.z5;
import di.q4;
import di.y9;
import fi.a6;
import fi.cc;
import fi.e6;
import fi.g9;
import fi.h2;
import fi.j2;
import fi.ka;
import fi.l5;
import fi.ma;
import fi.n5;
import fi.n9;
import fi.o9;
import fi.pc;
import fi.q9;
import fi.qc;
import fi.rb;
import fi.s6;
import fi.sb;
import fi.ta;
import fi.w7;
import fi.wb;
import fi.xb;
import hi.h3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import jg.b2;
import jg.c2;
import li.v3;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.zr;
import sg.w2;
import sg.x1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03b2  */
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
        li.s a2;
        int i13 = this.a;
        int i14 = 2;
        int i15 = 4;
        int i16 = 1;
        int i17 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i13) {
            case 0:
                t1 t1Var = (t1) obj3;
                q1 q1Var = (q1) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (!q1Var.G && q1Var.e == null) {
                    t1Var.E0(q1Var, bitmap);
                    break;
                }
                break;
            case 1:
                h7.d1((h7) obj3, (vg.n1[]) obj2, (Long) obj);
                break;
            case 2:
                h7.A0((h7) obj3, (e2) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 3:
                h7 h7Var = (h7) obj3;
                String str = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                b7 b7Var = h7Var.f0;
                hi.j[] jVarArr = h7Var.t0;
                fi.d dVar = h7Var.k0;
                if (stargiftupgradepreview != null) {
                    b7Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    h7Var.U2(1, false, null);
                    b7Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str), null);
                    jVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    jVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    jVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    h7Var.v0.setVisibility(8);
                    h7Var.u0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.i(LocaleController.getString(R.string.OK), false, true);
                    dVar.g(null, false);
                    dVar.setOnClickListener(new z1(h7Var, 9));
                    h7Var.show();
                    break;
                }
                break;
            case 4:
                z5 z5Var = (z5) obj3;
                z5Var.getClass();
                ((x5) obj2).a((TL_stars.StarGift) obj, true);
                z5Var.d(true);
                break;
            case 5:
                g6 g6Var = (g6) obj3;
                bg.b bVar = (bg.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                qf.c cVar = g6Var.n;
                if (cVar != null && bVar == g6Var.q) {
                    cVar.c(false);
                }
                g6Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    g6Var.o.put(bVar, new d6(bVar, tL_payments_paymentFormStarGift));
                    g6Var.a(true);
                    break;
                }
                break;
            case 6:
                ((Utilities.Callback2) obj3).run((bg.a) obj, new u6((bi.k1[]) obj2, i15));
                break;
            case 7:
                q4 q4Var = (q4) obj3;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                q4Var.z3 = canApplyBoost;
                tg.j0.G1(new v4(q4Var, i16), (TL_stories.TL_premium_boostsStatus) obj2, canApplyBoost, q4Var.q1, true);
                y9 y9Var = q4Var.y0;
                if (y9Var != null) {
                    y9Var.k1 = false;
                    y9Var.Q();
                    break;
                }
                break;
            case 8:
                j2 j2Var = (j2) obj3;
                pc pcVar = (pc) obj;
                j2Var.getClass();
                h2 h2Var = ((h2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(pcVar == null ? "🌤" : pcVar.c);
                sb2.append(" ");
                sb2.append(pcVar == null ? qc.b() ? "24°C" : "72°F" : pcVar.a());
                CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), j2Var.b.getFontMetricsInt(), false);
                j2 j2Var2 = h2Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(replaceEmoji, j2Var2.b, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), j2Var2.b, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                h2Var.k = staticLayout;
                h2Var.l = staticLayout.getLineCount() > 0 ? h2Var.k.getLineWidth(0) : 0.0f;
                h2Var.m = h2Var.k.getLineCount() > 0 ? h2Var.k.getLineLeft(0) : 0.0f;
                h2Var.b = AndroidUtilities.dpf2(17.6f) + h2Var.l;
                h2Var.c = AndroidUtilities.dpf2(36.0f);
                j2Var.invalidate();
                j2Var.requestLayout();
                break;
            case 9:
                ta taVar = (ta) obj3;
                rb rbVar = (rb) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - rbVar.getBottomPadding2(), taVar.i2 - rbVar.getPaddingUnderContainer()));
                taVar.R();
                if (max > 0) {
                    sg.j jVar = taVar.y0;
                    if ((jVar instanceof w2) && ((w2) jVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = taVar.C1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        taVar.C1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        x1 x1Var = taVar.S0;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(x1Var, (Property<x1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(taVar.I0, (Property<a6, Float>) property, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                        l5 l5Var = taVar.L0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<l5, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(taVar.q0, (Property<sg.k1, Float>) property2, (z10 || taVar.q1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(taVar.p0, (Property<sg.g1, Float>) property2, (z10 || taVar.q1) ? 1.0f : 0.0f));
                        taVar.Q0();
                        taVar.C1.playTogether(arrayList);
                        if (z10) {
                            taVar.C1.setDuration(350L);
                            taVar.C1.setInterpolator(ds.h);
                        } else {
                            taVar.C1.setDuration(250L);
                            taVar.C1.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                        }
                        taVar.C1.start();
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            ((Animator) arrayList.get(i10)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i10)).setInterpolator(z10 ? ds.h : org.telegram.ui.ActionBar.q1.w);
                            ((Animator) arrayList.get(i10)).start();
                        }
                        if (!z10) {
                            taVar.M0(false);
                        }
                        if (taVar.W1 != z10) {
                            taVar.d0();
                        }
                        taVar.W1 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = taVar.C1;
                if (animatorSet != null) {
                }
                taVar.C1 = new AnimatorSet();
                arrayList = new ArrayList();
                x1 x1Var2 = taVar.S0;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(x1Var2, (Property<x1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(taVar.I0, (Property<a6, Float>) property3, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                l5 l5Var2 = taVar.L0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(l5Var2, (Property<l5, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(taVar.q0, (Property<sg.k1, Float>) property22, (z10 || taVar.q1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(taVar.p0, (Property<sg.g1, Float>) property22, (z10 || taVar.q1) ? 1.0f : 0.0f));
                taVar.Q0();
                taVar.C1.playTogether(arrayList);
                if (z10) {
                }
                taVar.C1.start();
                while (i10 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (taVar.W1 != z10) {
                }
                taVar.W1 = z10;
                break;
            case 10:
                e6 e6Var = (e6) obj3;
                n5 n5Var = (n5) obj2;
                pc pcVar2 = (pc) obj;
                if (pcVar2 != null) {
                    n5Var.dismiss();
                    e6Var.w0(false);
                    e6Var.b0(e6Var.m0(pcVar2));
                    break;
                }
                break;
            case 11:
                e6 e6Var2 = (e6) obj3;
                sg.q0 q0Var = (sg.q0) obj2;
                sg.n0 n0Var = (sg.n0) obj;
                if (q0Var != null) {
                    int i18 = e6Var2.u1;
                    q0Var.u0 = n0Var;
                    q0Var.q0.b(i18, n0Var, false);
                    q0Var.m();
                    e6Var2.b0(q0Var);
                    break;
                } else {
                    e6Var2.b0(e6Var2.f0(n0Var));
                    break;
                }
            case 12:
                g9 g9Var = (g9) obj3;
                ((l80) obj2).u();
                g9Var.g(true);
                n9 n9Var = g9Var.W;
                q9 q9Var = n9Var.X;
                if (q9Var != null) {
                    q9Var.run(new HashSet(n9Var.v));
                    break;
                }
                break;
            case 13:
                g9 g9Var2 = (g9) obj3;
                g9Var2.W.G = true;
                ((zr[]) obj2)[0].dismiss();
                g9Var2.g(true);
                break;
            case 14:
                ma maVar = (ma) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Integer num = (Integer) obj;
                sb sbVar = maVar.a;
                boolean p02 = sbVar.p0();
                int i19 = sbVar.c;
                if (p02) {
                    try {
                        sbVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                sbVar.P1 = false;
                s6 s6Var = sbVar.C0;
                if (s6Var != null) {
                    s6Var.c(false);
                }
                if (sbVar.G1 != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(sbVar.G1.getAbsolutePath(), options);
                        i11 = options.outWidth;
                        try {
                            i12 = options.outHeight;
                        } catch (Exception unused2) {
                            i12 = -1;
                            if (num.intValue() != -1) {
                            }
                            if (num.intValue() != -1) {
                            }
                            w7 m10 = w7.m(r13, sbVar.G1);
                            m10.J0 = sbVar.v0;
                            m10.K0 = sbVar.w0;
                            if (sbVar.A0.j()) {
                            }
                        }
                    } catch (Exception unused3) {
                        i11 = -1;
                    }
                    int i20 = num.intValue() != -1 ? 0 : 90;
                    if (num.intValue() != -1) {
                        if (i11 > i12) {
                            i20 = 270;
                        }
                    } else if (i12 > i11 && i20 != 0) {
                        i20 = 0;
                    }
                    w7 m102 = w7.m(i20, sbVar.G1);
                    m102.J0 = sbVar.v0;
                    m102.K0 = sbVar.w0;
                    if (sbVar.A0.j()) {
                        sbVar.K1 = m102;
                        o9.a(i19, m102);
                        sbVar.L1 = false;
                        if (callback != null) {
                            callback.run(new ka(maVar, i14));
                            break;
                        } else {
                            sbVar.J(1, true);
                            break;
                        }
                    } else {
                        sbVar.G1 = null;
                        if (sbVar.A0.l(m102)) {
                            w7 a10 = w7.a(sbVar.A0.getLayout(), sbVar.A0.getContent());
                            sbVar.K1 = a10;
                            o9.a(i19, a10);
                            sbVar.L1 = false;
                            if (callback != null) {
                                callback.run(null);
                            }
                        } else if (callback != null) {
                            callback.run(null);
                        }
                        sbVar.l0(true);
                        break;
                    }
                }
                break;
            case 15:
                xb xbVar = (xb) obj2;
                Float f7 = (Float) obj;
                xbVar.i = f7.floatValue();
                wb wbVar = ((cc) obj3).a;
                if (wbVar != null) {
                    wbVar.r(f7.floatValue(), xbVar.a);
                    break;
                }
                break;
            case 16:
                hi.q.Q((hi.q) obj3, (String) obj2, (TLRPC.TL_error) obj);
                break;
            case 17:
                hi.b1 b1Var = (hi.b1) obj3;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) obj2;
                int[] iArr = (int[]) obj;
                b1Var.getClass();
                boolean z11 = false;
                while (i17 < iArr.length) {
                    if (iArr[i17] == 0) {
                        z11 = true;
                    }
                    i17++;
                }
                b1Var.d = true;
                b1Var.e = true;
                b1Var.k();
                Iterator it = b1Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                rVar.run(Boolean.TRUE, Boolean.valueOf(z11));
                break;
            case 18:
                hi.b1 b1Var2 = (hi.b1) obj3;
                Runnable runnable = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                b1Var2.getClass();
                boolean z12 = false;
                while (i17 < iArr2.length) {
                    if (iArr2[i17] == 0) {
                        z12 = true;
                    }
                    i17++;
                }
                b1Var2.d = z12;
                b1Var2.e = z12;
                b1Var2.k();
                Iterator it2 = b1Var2.f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 19:
                ((File[]) obj3)[0] = (File) obj;
                ((hi.k1) obj2).run();
                break;
            case 20:
                ((h3) obj3).d.y.F((String) obj2, (String) obj, false);
                break;
            case 21:
                ii.f fVar = (ii.f) obj3;
                fVar.getClass();
                fVar.X(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 22:
                ii.f fVar2 = (ii.f) obj3;
                fVar2.getClass();
                fVar2.W((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 23:
                ii.j0 j0Var = (ii.j0) obj3;
                j0Var.f0((TLRPC.Chat) obj2, j0Var.e, ((Boolean) obj).booleanValue());
                break;
            case 24:
                View view = (View) obj3;
                jg.t tVar = (jg.t) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                AndroidUtilities.hideKeyboard(tVar);
                AndroidUtilities.runOnUIThread(runnable2, 80L);
                break;
            case 25:
                b2 b2Var = (b2) obj2;
                c2 f10 = c2.f(UserConfig.selectedAccount);
                ti tiVar = ((jg.i0) obj3).b;
                long t12 = tiVar.t1();
                int i21 = f10.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i21).getInputPeer(t12);
                tL_messages_sendQuickReplyMessages.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_sendQuickReplyMessages.shortcut_id = b2Var.a;
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i21);
                    messagesStorage.getStorageQueue().postRunnable(new e0(f10, messagesStorage, b2Var, tL_messages_sendQuickReplyMessages, 25));
                }
                tiVar.dismiss();
                break;
            case 26:
                jg.h1.X((jg.h1) obj3, (View) obj2, (String) obj);
                break;
            case 27:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str2 = (String) obj;
                v3 v3Var = ((li.q) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str2;
                    v3Var.g3.O(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str2;
                    v3Var.X1(pageblockmath2);
                    break;
                }
            case 28:
                li.g1 g1Var = (li.g1) obj3;
                li.s sVar = (li.s) obj2;
                String str3 = (String) obj;
                g1Var.getClass();
                if (!TextUtils.isEmpty(str3)) {
                    Editable text = g1Var.getText();
                    int spanStart = text.getSpanStart(sVar);
                    int spanEnd = text.getSpanEnd(sVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a2 = li.s.a(str3, g1Var.getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) != null) {
                        boolean z13 = g1Var.v;
                        if (z13) {
                            g1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        int max2 = Math.max(0, Math.min(spanStart, g1Var.length()));
                        text.replace(max2, Math.max(max2, Math.min(spanEnd, g1Var.length())), spannableString);
                        g1Var.setSelection(Math.min(max2 + 1, g1Var.length()));
                        if (z13) {
                            g1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            default:
                li.b2 b2Var2 = (li.b2) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str4 = (String) obj;
                b2Var2.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str4;
                    b2Var2.P.g3.O(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str4;
                    b2Var2.P.X1(pageblockmath4);
                    break;
                }
        }
    }
}
