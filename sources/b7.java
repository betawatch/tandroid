// default package

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b7 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        eb ebVar;
        int i;
        s5b s5bVar;
        ArrayList arrayList;
        int[] iArr;
        int i2;
        int i3;
        int currentTop;
        int currentTop2;
        rja rjaVar;
        rja rjaVar2;
        rja rjaVar3;
        boolean z = false;
        r14 = false;
        boolean z2 = false;
        int i4 = 0;
        z = false;
        z = false;
        switch (this.a) {
            case 1:
                String trim = editable.toString().trim();
                ad adVar = ((wc) this.b).s;
                if (!TextUtils.equals(trim, adVar.H)) {
                    adVar.H = trim;
                    gm.r(adVar.R);
                    gm.d3(adVar.R, 300L);
                    break;
                }
                break;
            case 2:
                o oVar = (o) this.b;
                if (oVar.i0.a0 && (ebVar = oVar.j0) != null) {
                    ebVar.setInput(editable != null ? editable.toString() : null);
                    break;
                }
                break;
            case 3:
                au0 au0Var = (au0) this.b;
                mt0 mt0Var = au0Var.t0;
                i = ((d) au0Var).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h = ku0.g(i).h(au0Var.b, false);
                long j = h == null ? 0L : h.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                au0Var.Z = parseLong;
                if (parseLong > j) {
                    au0Var.Z = j;
                    au0Var.X = true;
                    au0Var.a0.setText(Long.toString(j));
                    vc vcVar = au0Var.a0;
                    vcVar.setSelection(vcVar.getText().length());
                    au0Var.X = false;
                }
                au0Var.Y = au0Var.Z == j;
                gm.r(mt0Var);
                mt0Var.run();
                if (!au0Var.X) {
                    au0Var.Y = false;
                    break;
                }
                break;
            case 4:
                tc1 tc1Var = (tc1) this.b;
                if (tc1Var.f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z = true;
                }
                tc1Var.F(z);
                break;
            case 5:
                kd1 kd1Var = (kd1) this.b;
                if (!kd1Var.H0 && kd1Var.G0 && (s5bVar = kd1Var.E0) != null) {
                    s5bVar.c = new SpannableStringBuilder(editable);
                    s5b s5bVar2 = kd1Var.E0;
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = -1;
                    for (int i6 = 0; i6 <= editable.length(); i6++) {
                        if (i6 == editable.length() || Character.isWhitespace(editable.charAt(i6))) {
                            if (i5 >= 0) {
                                arrayList2.add(Integer.valueOf(i5));
                                arrayList2.add(Integer.valueOf(i6));
                                i5 = -1;
                            }
                        } else if (i5 < 0) {
                            i5 = i6;
                        }
                    }
                    int size = arrayList2.size() / 2;
                    int[] iArr2 = s5bVar2.d;
                    Object[] objArr = iArr2 != null && iArr2.length == (size << 2);
                    long j2 = (iArr2 == null || iArr2.length < 4) ? s5bVar2.a : iArr2[2];
                    long max = Math.max(j2, (iArr2 == null || iArr2.length < 4) ? s5bVar2.b : iArr2[iArr2.length - 1]);
                    int[] iArr3 = new int[size << 2];
                    while (i4 < size) {
                        int i7 = i4 << 2;
                        int i8 = i4 << 1;
                        iArr3[i7] = ((Integer) arrayList2.get(i8)).intValue();
                        iArr3[i7 + 1] = ((Integer) arrayList2.get(i8 + 1)).intValue();
                        int i9 = i7 + 2;
                        if (objArr == true) {
                            arrayList = arrayList2;
                            i2 = iArr2[i9];
                            iArr = iArr2;
                        } else {
                            arrayList = arrayList2;
                            iArr = iArr2;
                            i2 = (int) ((((max - j2) * i4) / size) + j2);
                        }
                        iArr3[i9] = i2;
                        int i10 = i7 + 3;
                        iArr3[i10] = objArr != false ? iArr[i10] : (int) ((((i4 + 1) * (max - j2)) / size) + j2);
                        i4++;
                        arrayList2 = arrayList;
                        iArr2 = iArr;
                    }
                    s5bVar2.d = iArr3;
                    kd1Var.E0.e = true;
                    break;
                }
                break;
            case 6:
                uf1 uf1Var = ((of1) this.b).c;
                if (uf1Var.r.startsWith("@")) {
                    uf1Var.r = uf1Var.r.substring(1);
                }
                if (uf1Var.r.length() > 0) {
                    StringBuilder sb = new StringBuilder("https://");
                    i3 = ((d) uf1Var).currentAccount;
                    sb.append(oc7.r1(i3).N2);
                    sb.append("/");
                    sb.append(uf1Var.r);
                    String sb2 = sb.toString();
                    String a0 = jb6.a0("UsernameHelpLink", null, 2131743346, sb2);
                    int indexOf = a0.indexOf(sb2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new q1(true ? (byte) 1 : (byte) 0, sb2, uf1Var), indexOf, sb2.length() + indexOf, 33);
                        break;
                    }
                }
                break;
            case 8:
                TextUtils.isEmpty(((s22) this.b).E);
                ((s22) this.b).E = editable.toString().trim();
                gm.r(((s22) this.b).b0);
                if (!TextUtils.isEmpty(((s22) this.b).E)) {
                    s22 s22Var = (s22) this.b;
                    String str = s22Var.E;
                    s22Var.a0 = str != null && str.length() >= 0;
                    s22 s22Var2 = (s22) this.b;
                    if (!TextUtils.equals(s22Var2.W, s22Var2.E)) {
                        ((s22) this.b).M.clear();
                        s22 s22Var3 = (s22) this.b;
                        s22Var3.c0 = 0;
                        s22Var3.d0 = false;
                    }
                    gm.d3(((s22) this.b).b0, 1500L);
                }
                gm.r(((s22) this.b).g0);
                if (!TextUtils.isEmpty(((s22) this.b).E)) {
                    s22 s22Var4 = (s22) this.b;
                    String str2 = s22Var4.E;
                    s22Var4.n0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(oc7.r1(((s22) this.b).b.G3).l4.J.f)) ? false : true;
                    s22 s22Var5 = (s22) this.b;
                    if (!TextUtils.equals(s22Var5.f0, s22Var5.E)) {
                        ((s22) this.b).N.clear();
                        ((s22) this.b).h0 = false;
                    }
                    gm.d3(((s22) this.b).g0, 1500L);
                }
                ((s22) this.b).S();
                break;
            case 9:
                String obj = editable.toString();
                boolean isEmpty = obj.isEmpty();
                w32 w32Var = (w32) this.b;
                if (isEmpty) {
                    y59 adapter = w32Var.s.getAdapter();
                    w32 w32Var2 = (w32) this.b;
                    if (adapter != w32Var2.F) {
                        currentTop = w32Var2.getCurrentTop();
                        ((w32) this.b).H.setText(jb6.M0(2131747957, null));
                        ((w32) this.b).H.c();
                        w32 w32Var3 = (w32) this.b;
                        w32Var3.s.setAdapter(w32Var3.F);
                        ((w32) this.b).F.f();
                        if (currentTop > 0) {
                            ((w32) this.b).w.g1(0, -currentTop);
                        }
                    }
                } else {
                    r34 r34Var = w32Var.H;
                    if (r34Var != null) {
                        r34Var.setText(jb6.M0(2131747901, null));
                    }
                }
                s32 s32Var = ((w32) this.b).G;
                if (s32Var != null) {
                    if (s32Var.f != null) {
                        Utilities.g.a(s32Var.f);
                        s32Var.f = null;
                    }
                    int i11 = s32Var.h + 1;
                    s32Var.h = i11;
                    mp3 mp3Var = Utilities.g;
                    r32 r32Var = new r32(s32Var, obj, i11, false ? (byte) 1 : (byte) 0);
                    s32Var.f = r32Var;
                    mp3Var.d(r32Var, 300L);
                    break;
                }
                break;
            case 10:
                String obj2 = editable.toString();
                boolean isEmpty2 = obj2.isEmpty();
                a82 a82Var = (a82) this.b;
                fv fvVar = a82Var.s;
                r34 r34Var2 = a82Var.F;
                x72 x72Var = a82Var.y;
                if (isEmpty2) {
                    if (fvVar.getAdapter() != x72Var) {
                        currentTop2 = a82Var.getCurrentTop();
                        r34Var2.c();
                        fvVar.setAdapter(x72Var);
                        x72Var.f();
                        if (currentTop2 > 0) {
                            a82Var.w.g1(0, -currentTop2);
                        }
                    }
                } else if (r34Var2 != null) {
                    r34Var2.setText(jb6.M0(2131747901, null));
                }
                y72 y72Var = a82Var.E;
                if (y72Var != null) {
                    a82 a82Var2 = y72Var.f;
                    fv fvVar2 = a82Var2.s;
                    ArrayList arrayList3 = y72Var.d;
                    arrayList3.clear();
                    y72Var.e = obj2;
                    String I3 = gm.I3(obj2);
                    if (I3.startsWith("/")) {
                        I3 = I3.substring(1);
                    }
                    ArrayList arrayList4 = pz8.f(z8c.t0).b;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        oz8 oz8Var = (oz8) arrayList4.get(i12);
                        if (!pz8.g(oz8Var.b)) {
                            String I32 = gm.I3(oz8Var.b);
                            if (I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                                arrayList3.add(oz8Var);
                            }
                        }
                    }
                    y59 adapter2 = fvVar2.getAdapter();
                    y72 y72Var2 = a82Var2.E;
                    if (adapter2 != y72Var2) {
                        fvVar2.setAdapter(y72Var2);
                    }
                    y72Var.f();
                    break;
                }
                break;
            case 11:
                ba2 ba2Var = (ba2) this.b;
                ba2Var.r.j(5L, ba2Var.w.getText().toString(), null, null);
                kc0 kc0Var = ba2Var.e;
                if (kc0Var != null) {
                    kc0Var.invalidate();
                    break;
                }
                break;
            case 12:
                ((qa2) this.b).b0();
                break;
            case 13:
                je2 je2Var = (je2) this.b;
                ke2 ke2Var = je2Var.e;
                if (!je2Var.d) {
                    ke2Var.T = editable.toString();
                    u69 K = ke2Var.b.K(ke2Var.v0);
                    if (K != null) {
                        ke2Var.r0(K.a);
                        break;
                    }
                }
                break;
            case 14:
                hh2 hh2Var = (hh2) this.b;
                hh2Var.y = false;
                ah2 ah2Var = hh2Var.G;
                gm.r(ah2Var);
                if (TextUtils.isEmpty(hh2Var.f.getText())) {
                    hh2Var.E = null;
                    hh2Var.d.b();
                } else {
                    hh2Var.y = true;
                    gm.d3(ah2Var, 800L);
                }
                hh2Var.c.g3.O(true);
                hh2Var.g0();
                break;
            case 16:
                ((po2) this.b).Z();
                break;
            case 17:
                hz2 hz2Var = (hz2) this.b;
                hz2Var.S0();
                hz2Var.X1 = editable.toString();
                hz2Var.Y1.O(true);
                break;
            case 18:
                un3 un3Var = (un3) this.b;
                if (!un3Var.L) {
                    byte b = un3Var.r;
                    if (b == 1) {
                        un3Var.N = un3Var.M.length();
                        un3Var.I = editable.length();
                        if (editable.length() > 0 && !Character.isWhitespace(editable.charAt(editable.length() - 1))) {
                            z2 = true;
                        }
                        un3Var.O = z2;
                        break;
                    } else if (b == 3 && TextUtils.isEmpty(editable)) {
                        un3Var.m();
                        break;
                    }
                }
                break;
            case 19:
                qu3 qu3Var = (qu3) this.b;
                if (qu3Var.X1 != qu3Var.getLineCount()) {
                    if (!qu3Var.Y1 && qu3Var.getMeasuredWidth() > 0) {
                        qu3Var.G(qu3Var.X1, qu3Var.getLineCount());
                    }
                    qu3Var.X1 = qu3Var.getLineCount();
                    break;
                }
                break;
            case 20:
                ((aa7) this.b).run();
                break;
            case 21:
                ix3 ix3Var = (ix3) this.b;
                ImageView imageView = ix3Var.r;
                l7 l7Var = ix3Var.e;
                if (!ix3Var.s) {
                    ix3Var.d(false);
                    String obj3 = l7Var.getText().toString();
                    String str3 = TextUtils.isEmpty(obj3) ? null : obj3;
                    jac jacVar = ix3Var.x;
                    if (jacVar != null) {
                        jacVar.a(str3, -1);
                    }
                    hx3 hx3Var = ix3Var.h;
                    if (hx3Var != null) {
                        hx3Var.I1(null);
                        ix3Var.h.J1(TextUtils.isEmpty(obj3), true);
                    }
                    if (l7Var != null) {
                        l7Var.animate().cancel();
                        ViewPropertyAnimator translationX = l7Var.animate().translationX(0.0f);
                        d53 d53Var = d53.h;
                        translationX.setInterpolator(d53Var).start();
                        if (imageView != null && ix3Var.n != (!TextUtils.isEmpty(l7Var.getText()))) {
                            ix3Var.n = !ix3Var.n;
                            imageView.animate().cancel();
                            if (ix3Var.n) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(ix3Var.n ? 1.0f : 0.7f).scaleY(ix3Var.n ? 1.0f : 0.7f).alpha(ix3Var.n ? 1.0f : 0.0f).withEndAction(new bi3(this, (byte) 27)).setInterpolator(d53Var).setDuration(320L).setStartDelay(ix3Var.n ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 22:
                s24 s24Var = (s24) this.b;
                s24Var.g(false);
                q24 q24Var = s24Var.d;
                String obj4 = q24Var.getText().toString();
                s24Var.b(obj4, true);
                r24 r24Var = s24Var.r;
                if (r24Var != null) {
                    r24Var.I1(null);
                    r24Var.J1(TextUtils.isEmpty(obj4), true);
                }
                s24Var.f(!TextUtils.isEmpty(obj4));
                if (q24Var != null) {
                    q24Var.clearAnimation();
                    q24Var.animate().translationX(0.0f).setInterpolator(d53.h).start();
                }
                s24Var.c(false);
                break;
            case 23:
                m44 m44Var = ((n44) this.b).c;
                if (m44Var != null) {
                    String trim2 = editable.toString().trim();
                    ap0 ap0Var = ((so0) m44Var).a;
                    ap0Var.q2 = trim2;
                    ap0Var.f1(false, false);
                    ap0Var.f1(true, true);
                    break;
                }
                break;
            case 24:
                qf4 qf4Var = ((nf4) this.b).e;
                if (!TextUtils.equals(editable, qf4Var.x)) {
                    qf4Var.n = !TextUtils.isEmpty(editable);
                    qf4Var.x = gn.onlyEmojiSpans(editable);
                    ef4 ef4Var = qf4Var.J;
                    if (ef4Var != null) {
                        ef4Var.e(gn.cloneSpans(qf4Var.x, -1, ef4Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
                    }
                    ff4 ff4Var = qf4Var.K;
                    if (ff4Var != null) {
                        ff4Var.r.setText(qf4.n0(qf4Var.x) ? jb6.M0(qf4Var.y ? 2131750672 : 2131750671, null) : null);
                    }
                    if (qf4Var.s && TextUtils.isEmpty(qf4Var.x)) {
                        rjaVar3 = ((d) qf4Var).simpleActionBar;
                        rjaVar3.setTitle(jb6.M0(2131750665, null));
                    } else {
                        rjaVar = ((d) qf4Var).simpleActionBar;
                        CharSequence charSequence = qf4Var.x;
                        rjaVar2 = ((d) qf4Var).simpleActionBar;
                        rjaVar.setTitle(gn.cloneSpans(charSequence, -1, rjaVar2.getTitleFontMetricsInt()));
                    }
                }
                qf4Var.l0(true);
                break;
            case 25:
                oq4 oq4Var = (oq4) this.b;
                if (!oq4Var.G.isEmpty() && editable.length() > 0 && oq4Var.J >= 0) {
                    oq4Var.J = -1;
                    oq4Var.e();
                }
                oq4Var.a.a(oq4Var.n || oq4Var.r.length() > 0, true);
                break;
            case 26:
                oc5 oc5Var = (oc5) this.b;
                if (oc5Var.f.r.length() != 0) {
                    mc5 mc5Var = oc5Var.w;
                    boolean z3 = mc5Var.n;
                    if (!z3) {
                        oc5Var.U = true;
                        oc5Var.T = true;
                        if (!z3) {
                            mc5Var.n = true;
                            mc5Var.f();
                        }
                        oc5Var.n.setFastScrollVisible(false);
                        oc5Var.n.setVerticalScrollBarEnabled(true);
                    }
                    oc5Var.w.L(oc5Var.f.r.getText().toString());
                    oc5Var.s.e(true, false);
                    break;
                } else {
                    oc5Var.U = false;
                    oc5Var.T = false;
                    mc5 mc5Var2 = oc5Var.w;
                    if (mc5Var2.n) {
                        mc5Var2.n = false;
                        mc5Var2.f();
                    }
                    oc5Var.w.L(null);
                    oc5Var.n.setFastScrollVisible(true);
                    oc5Var.n.setVerticalScrollBarEnabled(false);
                    oc5Var.u0(0);
                    break;
                }
            case 27:
                oc6 oc6Var = (oc6) this.b;
                if (!oc6Var.c) {
                    oc6Var.E = false;
                    oc6Var.y = editable.toString();
                    oc6Var.Z(true);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                break;
            case 6:
                of1 of1Var = (of1) obj;
                uf1 uf1Var = of1Var.c;
                String str = uf1Var.r;
                uf1Var.r = charSequence == null ? "" : charSequence.toString();
                uf1 uf1Var2 = of1Var.c;
                qf1 qf1Var = uf1Var2.F;
                if (qf1Var != null && str != null) {
                    qf1Var.b(uf1Var2.r);
                    break;
                }
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
            case 15:
                rk2 rk2Var = (rk2) obj;
                rk2Var.X1 = charSequence.length() != 0;
                rk2Var.V1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                rk2Var.a2 = ofFloat;
                ofFloat.addUpdateListener(new et1(rk2Var, (byte) 13));
                boolean z = rk2Var.X1;
                ValueAnimator valueAnimator = rk2Var.a2;
                if (z) {
                    valueAnimator.setDuration(220L);
                } else {
                    b10.n(1.5f, valueAnimator);
                    rk2Var.a2.setDuration(350L);
                }
                rk2Var.a2.start();
                rk2Var.m();
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                break;
            case 28:
                ze6 ze6Var = (ze6) obj;
                te6 te6Var = ze6Var.T;
                if (ze6Var.S) {
                    ze6Var.removeCallbacks(te6Var);
                    te6Var.run();
                    break;
                }
                break;
            default:
                sf6 sf6Var = (sf6) obj;
                qf6 qf6Var = sf6Var.y;
                if (sf6Var.x) {
                    sf6Var.removeCallbacks(qf6Var);
                    qf6Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                r7 r7Var = (r7) obj;
                n7 n7Var = r7Var.I;
                if (n7Var != null) {
                    n7Var.l(r7Var.e);
                }
                r7Var.k();
                if (!r7Var.h0.isEmpty() && !TextUtils.isEmpty(r7Var.e.getText()) && r7Var.i0 >= 0) {
                    r7Var.i0 = -1;
                    r7Var.E();
                    break;
                }
                break;
            case 6:
                of1 of1Var = (of1) obj;
                uf1 uf1Var = of1Var.c;
                String str = uf1Var.r;
                uf1Var.r = charSequence == null ? "" : charSequence.toString();
                uf1 uf1Var2 = of1Var.c;
                qf1 qf1Var = uf1Var2.F;
                if (qf1Var != null && str != null) {
                    qf1Var.b(uf1Var2.r);
                }
                if (!uf1Var.n) {
                    uf1Var.c0(uf1Var.r);
                    break;
                }
                break;
            case 7:
                fj1 fj1Var = (fj1) obj;
                fj1Var.e0(fj1Var.y.getText().toString());
                break;
            case 12:
                qa2 qa2Var = (qa2) obj;
                if (!qa2Var.n0) {
                    String obj2 = qa2Var.b.getText().toString();
                    qf1 qf1Var2 = qa2Var.P;
                    if (qf1Var2 != null) {
                        qf1Var2.b(obj2);
                    }
                    qa2Var.c0(obj2);
                    break;
                }
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void A(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void B(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void C(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void D(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void E(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void F(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void G(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void H(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void I(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void J(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void K(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void L(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void M(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void N(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void O(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void P(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void Q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void R(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void S(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void T(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void U(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void V(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void W(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void X(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void Y(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void Z(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void a0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void v(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void w(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void x(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void y(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void z(int i, int i2, int i3, CharSequence charSequence) {
    }
}
