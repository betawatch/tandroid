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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class c7 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        fb fbVar;
        int i;
        boolean z;
        o7b o7bVar;
        int i2;
        int i3;
        ArrayList arrayList;
        int[] iArr;
        int i4;
        int i5;
        int currentTop;
        int currentTop2;
        jla jlaVar;
        jla jlaVar2;
        jla jlaVar3;
        boolean z2 = false;
        r12 = false;
        boolean z3 = false;
        int i6 = 0;
        z2 = false;
        z2 = false;
        byte b = 1;
        switch (this.a) {
            case 1:
                o oVar = (o) this.b;
                if (oVar.i0.a0 && (fbVar = oVar.j0) != null) {
                    fbVar.setInput(editable != null ? editable.toString() : null);
                    break;
                }
                break;
            case 2:
                at0 at0Var = (at0) this.b;
                ms0 ms0Var = at0Var.t0;
                i = ((e) at0Var).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h = kt0.g(i).h(at0Var.b, false);
                long j = h == null ? 0L : h.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                at0Var.Z = parseLong;
                if (parseLong > j) {
                    at0Var.Z = j;
                    z = true;
                    at0Var.X = true;
                    at0Var.a0.setText(Long.toString(j));
                    xs0 xs0Var = at0Var.a0;
                    xs0Var.setSelection(xs0Var.getText().length());
                    at0Var.X = false;
                } else {
                    z = true;
                }
                at0Var.Y = at0Var.Z == j ? z : false;
                hl.r(ms0Var);
                ms0Var.run();
                if (!at0Var.X) {
                    at0Var.Y = false;
                    break;
                }
                break;
            case 3:
                ub1 ub1Var = (ub1) this.b;
                if (ub1Var.f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z2 = true;
                }
                ub1Var.F(z2);
                break;
            case 4:
                kc1 kc1Var = (kc1) this.b;
                if (!kc1Var.H0 && kc1Var.G0 && (o7bVar = kc1Var.E0) != null) {
                    o7bVar.c = new SpannableStringBuilder(editable);
                    o7b o7bVar2 = kc1Var.E0;
                    ArrayList arrayList2 = new ArrayList();
                    int i7 = -1;
                    for (int i8 = 0; i8 <= editable.length(); i8++) {
                        if (i8 == editable.length() || Character.isWhitespace(editable.charAt(i8))) {
                            if (i7 >= 0) {
                                arrayList2.add(Integer.valueOf(i7));
                                arrayList2.add(Integer.valueOf(i8));
                                i7 = -1;
                            }
                        } else if (i7 < 0) {
                            i7 = i8;
                        }
                    }
                    int size = arrayList2.size() / 2;
                    int[] iArr2 = o7bVar2.d;
                    Object[] objArr = iArr2 != null && iArr2.length == (size << 2);
                    long j2 = (iArr2 == null || iArr2.length < 4) ? o7bVar2.a : iArr2[2];
                    long max = Math.max(j2, (iArr2 == null || iArr2.length < 4) ? o7bVar2.b : iArr2[iArr2.length - 1]);
                    int[] iArr3 = new int[size << 2];
                    while (i6 < size) {
                        int i9 = i6 << 2;
                        int i10 = i6 << 1;
                        iArr3[i9] = ((Integer) arrayList2.get(i10)).intValue();
                        iArr3[i9 + 1] = ((Integer) arrayList2.get(i10 + b)).intValue();
                        int i11 = i9 + 2;
                        if (objArr == true) {
                            i3 = iArr2[i11];
                            i2 = i11;
                        } else {
                            i2 = i11;
                            i3 = (int) ((((max - j2) * i6) / size) + j2);
                        }
                        iArr3[i2] = i3;
                        int i12 = i9 + 3;
                        if (objArr == true) {
                            i4 = iArr2[i12];
                            arrayList = arrayList2;
                            iArr = iArr2;
                        } else {
                            arrayList = arrayList2;
                            iArr = iArr2;
                            i4 = (int) ((((max - j2) * (i6 + 1)) / size) + j2);
                        }
                        iArr3[i12] = i4;
                        i6++;
                        arrayList2 = arrayList;
                        iArr2 = iArr;
                        b = 1;
                    }
                    o7bVar2.d = iArr3;
                    kc1Var.E0.e = true;
                    break;
                }
                break;
            case 5:
                ve1 ve1Var = ((pe1) this.b).c;
                if (ve1Var.r.startsWith("@")) {
                    ve1Var.r = ve1Var.r.substring(1);
                }
                if (ve1Var.r.length() > 0) {
                    StringBuilder sb = new StringBuilder("https://");
                    i5 = ((e) ve1Var).currentAccount;
                    sb.append(uc7.s1(i5).N2);
                    sb.append("/");
                    sb.append(ve1Var.r);
                    String sb2 = sb.toString();
                    String a0 = ob6.a0("UsernameHelpLink", null, 2131743314, sb2);
                    int indexOf = a0.indexOf(sb2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new r1(b, sb2, ve1Var), indexOf, sb2.length() + indexOf, 33);
                        break;
                    }
                }
                break;
            case 7:
                TextUtils.isEmpty(((x12) this.b).E);
                ((x12) this.b).E = editable.toString().trim();
                hl.r(((x12) this.b).b0);
                if (!TextUtils.isEmpty(((x12) this.b).E)) {
                    x12 x12Var = (x12) this.b;
                    String str = x12Var.E;
                    x12Var.a0 = str != null && str.length() >= 0;
                    x12 x12Var2 = (x12) this.b;
                    if (!TextUtils.equals(x12Var2.W, x12Var2.E)) {
                        ((x12) this.b).M.clear();
                        x12 x12Var3 = (x12) this.b;
                        x12Var3.c0 = 0;
                        x12Var3.d0 = false;
                    }
                    hl.d3(((x12) this.b).b0, 1500L);
                }
                hl.r(((x12) this.b).g0);
                if (!TextUtils.isEmpty(((x12) this.b).E)) {
                    x12 x12Var4 = (x12) this.b;
                    String str2 = x12Var4.E;
                    x12Var4.n0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(uc7.s1(((x12) this.b).b.G3).k4.Q.f)) ? false : true;
                    x12 x12Var5 = (x12) this.b;
                    if (!TextUtils.equals(x12Var5.f0, x12Var5.E)) {
                        ((x12) this.b).N.clear();
                        ((x12) this.b).h0 = false;
                    }
                    hl.d3(((x12) this.b).g0, 1500L);
                }
                ((x12) this.b).S();
                break;
            case 8:
                String obj = editable.toString();
                boolean isEmpty = obj.isEmpty();
                b32 b32Var = (b32) this.b;
                if (isEmpty) {
                    j79 adapter = b32Var.s.getAdapter();
                    b32 b32Var2 = (b32) this.b;
                    if (adapter != b32Var2.F) {
                        currentTop = b32Var2.getCurrentTop();
                        ((b32) this.b).H.setText(ob6.M0(2131747954, null));
                        ((b32) this.b).H.c();
                        b32 b32Var3 = (b32) this.b;
                        b32Var3.s.setAdapter(b32Var3.F);
                        ((b32) this.b).F.f();
                        if (currentTop > 0) {
                            ((b32) this.b).w.g1(0, -currentTop);
                        }
                    }
                } else {
                    b34 b34Var = b32Var.H;
                    if (b34Var != null) {
                        b34Var.setText(ob6.M0(2131747898, null));
                    }
                }
                x22 x22Var = ((b32) this.b).G;
                if (x22Var != null) {
                    if (x22Var.f != null) {
                        Utilities.g.a(x22Var.f);
                        x22Var.f = null;
                    }
                    int i13 = x22Var.h + 1;
                    x22Var.h = i13;
                    to3 to3Var = Utilities.g;
                    w22 w22Var = new w22(x22Var, obj, i13, false ? (byte) 1 : (byte) 0);
                    x22Var.f = w22Var;
                    to3Var.d(w22Var, 300L);
                    break;
                }
                break;
            case 9:
                String obj2 = editable.toString();
                boolean isEmpty2 = obj2.isEmpty();
                f72 f72Var = (f72) this.b;
                gu guVar = f72Var.s;
                b34 b34Var2 = f72Var.F;
                c72 c72Var = f72Var.y;
                if (isEmpty2) {
                    if (guVar.getAdapter() != c72Var) {
                        currentTop2 = f72Var.getCurrentTop();
                        b34Var2.c();
                        guVar.setAdapter(c72Var);
                        c72Var.f();
                        if (currentTop2 > 0) {
                            f72Var.w.g1(0, -currentTop2);
                        }
                    }
                } else if (b34Var2 != null) {
                    b34Var2.setText(ob6.M0(2131747898, null));
                }
                d72 d72Var = f72Var.E;
                if (d72Var != null) {
                    f72 f72Var2 = d72Var.f;
                    gu guVar2 = f72Var2.s;
                    ArrayList arrayList3 = d72Var.d;
                    arrayList3.clear();
                    d72Var.e = obj2;
                    String I3 = hl.I3(obj2);
                    if (I3.startsWith("/")) {
                        I3 = I3.substring(1);
                    }
                    ArrayList arrayList4 = b19.f(yac.t0).b;
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        a19 a19Var = (a19) arrayList4.get(i14);
                        if (!b19.g(a19Var.b)) {
                            String I32 = hl.I3(a19Var.b);
                            if (I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                                arrayList3.add(a19Var);
                            }
                        }
                    }
                    j79 adapter2 = guVar2.getAdapter();
                    d72 d72Var2 = f72Var2.E;
                    if (adapter2 != d72Var2) {
                        guVar2.setAdapter(d72Var2);
                    }
                    d72Var.f();
                    break;
                }
                break;
            case 10:
                g92 g92Var = (g92) this.b;
                g92Var.r.j(5L, g92Var.w.getText().toString(), null, null);
                mb0 mb0Var = g92Var.e;
                if (mb0Var != null) {
                    mb0Var.invalidate();
                    break;
                }
                break;
            case 11:
                ((v92) this.b).a0();
                break;
            case 12:
                od2 od2Var = (od2) this.b;
                pd2 pd2Var = od2Var.e;
                if (!od2Var.d) {
                    pd2Var.T = editable.toString();
                    f89 L = pd2Var.b.L(pd2Var.v0);
                    if (L != null) {
                        pd2Var.q0(L.a);
                        break;
                    }
                }
                break;
            case 13:
                mg2 mg2Var = (mg2) this.b;
                mg2Var.y = false;
                fg2 fg2Var = mg2Var.G;
                hl.r(fg2Var);
                if (TextUtils.isEmpty(mg2Var.f.getText())) {
                    mg2Var.E = null;
                    mg2Var.d.b();
                } else {
                    mg2Var.y = true;
                    hl.d3(fg2Var, 800L);
                }
                mg2Var.c.g3.O(true);
                mg2Var.f0();
                break;
            case 15:
                ((xn2) this.b).Y();
                break;
            case 16:
                ry2 ry2Var = (ry2) this.b;
                ry2Var.T0();
                ry2Var.X1 = editable.toString();
                ry2Var.Y1.O(true);
                break;
            case 17:
                bn3 bn3Var = (bn3) this.b;
                if (!bn3Var.M) {
                    byte b2 = bn3Var.r;
                    if (b2 == 1) {
                        bn3Var.O = bn3Var.N.length();
                        bn3Var.I = editable.length();
                        if (editable.length() > 0 && !Character.isWhitespace(editable.charAt(editable.length() - 1))) {
                            z3 = true;
                        }
                        bn3Var.P = z3;
                        break;
                    } else if (b2 == 3 && TextUtils.isEmpty(editable)) {
                        bn3Var.o();
                        break;
                    }
                }
                break;
            case 18:
                xt3 xt3Var = (xt3) this.b;
                if (xt3Var.Y1 != xt3Var.getLineCount()) {
                    if (!xt3Var.Z1 && xt3Var.getMeasuredWidth() > 0) {
                        xt3Var.G(xt3Var.Y1, xt3Var.getLineCount());
                    }
                    xt3Var.Y1 = xt3Var.getLineCount();
                    break;
                }
                break;
            case 19:
                ((va7) this.b).run();
                break;
            case 20:
                sw3 sw3Var = (sw3) this.b;
                ImageView imageView = sw3Var.r;
                m7 m7Var = sw3Var.e;
                if (!sw3Var.s) {
                    sw3Var.d(false);
                    String obj3 = m7Var.getText().toString();
                    String str3 = TextUtils.isEmpty(obj3) ? null : obj3;
                    icc iccVar = sw3Var.x;
                    if (iccVar != null) {
                        iccVar.a(str3, -1);
                    }
                    rw3 rw3Var = sw3Var.h;
                    if (rw3Var != null) {
                        rw3Var.J1(null);
                        sw3Var.h.K1(TextUtils.isEmpty(obj3), true);
                    }
                    if (m7Var != null) {
                        m7Var.animate().cancel();
                        ViewPropertyAnimator translationX = m7Var.animate().translationX(0.0f);
                        k43 k43Var = k43.h;
                        translationX.setInterpolator(k43Var).start();
                        if (imageView != null && sw3Var.n != (!TextUtils.isEmpty(m7Var.getText()))) {
                            sw3Var.n = !sw3Var.n;
                            imageView.animate().cancel();
                            if (sw3Var.n) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(sw3Var.n ? 1.0f : 0.7f).scaleY(sw3Var.n ? 1.0f : 0.7f).alpha(sw3Var.n ? 1.0f : 0.0f).withEndAction(new lw3(this, b)).setInterpolator(k43Var).setDuration(320L).setStartDelay(sw3Var.n ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 21:
                c24 c24Var = (c24) this.b;
                c24Var.g(false);
                a24 a24Var = c24Var.d;
                String obj4 = a24Var.getText().toString();
                c24Var.b(obj4, true);
                b24 b24Var = c24Var.r;
                if (b24Var != null) {
                    b24Var.J1(null);
                    b24Var.K1(TextUtils.isEmpty(obj4), true);
                }
                c24Var.f(!TextUtils.isEmpty(obj4));
                if (a24Var != null) {
                    a24Var.clearAnimation();
                    a24Var.animate().translationX(0.0f).setInterpolator(k43.h).start();
                }
                c24Var.c(false);
                break;
            case 22:
                x34 x34Var = ((y34) this.b).c;
                if (x34Var != null) {
                    String trim = editable.toString().trim();
                    ao0 ao0Var = ((sn0) x34Var).a;
                    ao0Var.q2 = trim;
                    ao0Var.g1(false, false);
                    ao0Var.g1(true, true);
                    break;
                }
                break;
            case 23:
                nf4 nf4Var = ((kf4) this.b).e;
                if (!TextUtils.equals(editable, nf4Var.x)) {
                    nf4Var.n = !TextUtils.isEmpty(editable);
                    nf4Var.x = hm.onlyEmojiSpans(editable);
                    cf4 cf4Var = nf4Var.J;
                    if (cf4Var != null) {
                        cf4Var.e(hm.cloneSpans(nf4Var.x, -1, cf4Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
                    }
                    df4 df4Var = nf4Var.K;
                    if (df4Var != null) {
                        df4Var.r.setText(nf4.m0(nf4Var.x) ? ob6.M0(nf4Var.y ? 2131750700 : 2131750699, null) : null);
                    }
                    if (nf4Var.s && TextUtils.isEmpty(nf4Var.x)) {
                        jlaVar3 = ((e) nf4Var).simpleActionBar;
                        jlaVar3.setTitle(ob6.M0(2131750693, null));
                    } else {
                        jlaVar = ((e) nf4Var).simpleActionBar;
                        CharSequence charSequence = nf4Var.x;
                        jlaVar2 = ((e) nf4Var).simpleActionBar;
                        jlaVar.setTitle(hm.cloneSpans(charSequence, -1, jlaVar2.getTitleFontMetricsInt()));
                    }
                }
                nf4Var.k0(true);
                break;
            case 24:
                rq4 rq4Var = (rq4) this.b;
                if (!rq4Var.H.isEmpty() && editable.length() > 0 && rq4Var.K >= 0) {
                    rq4Var.K = -1;
                    rq4Var.f();
                }
                rq4Var.b();
                break;
            case 25:
                rc5 rc5Var = (rc5) this.b;
                if (rc5Var.f.r.length() != 0) {
                    pc5 pc5Var = rc5Var.w;
                    boolean z4 = pc5Var.n;
                    if (!z4) {
                        rc5Var.U = true;
                        rc5Var.T = true;
                        if (!z4) {
                            pc5Var.n = true;
                            pc5Var.f();
                        }
                        rc5Var.n.setFastScrollVisible(false);
                        rc5Var.n.setVerticalScrollBarEnabled(true);
                    }
                    rc5Var.w.L(rc5Var.f.r.getText().toString());
                    rc5Var.s.e(true, false);
                    break;
                } else {
                    rc5Var.U = false;
                    rc5Var.T = false;
                    pc5 pc5Var2 = rc5Var.w;
                    if (pc5Var2.n) {
                        pc5Var2.n = false;
                        pc5Var2.f();
                    }
                    rc5Var.w.L(null);
                    rc5Var.n.setFastScrollVisible(true);
                    rc5Var.n.setVerticalScrollBarEnabled(false);
                    rc5Var.t0(0);
                    break;
                }
            case 26:
                tc6 tc6Var = (tc6) this.b;
                if (!tc6Var.c) {
                    tc6Var.E = false;
                    tc6Var.y = editable.toString();
                    tc6Var.Y(true);
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
                break;
            case 5:
                pe1 pe1Var = (pe1) obj;
                ve1 ve1Var = pe1Var.c;
                String str = ve1Var.r;
                ve1Var.r = charSequence == null ? "" : charSequence.toString();
                ve1 ve1Var2 = pe1Var.c;
                re1 re1Var = ve1Var2.F;
                if (re1Var != null && str != null) {
                    re1Var.b(ve1Var2.r);
                    break;
                }
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 14:
                zj2 zj2Var = (zj2) obj;
                zj2Var.Y1 = charSequence.length() != 0;
                zj2Var.W1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                zj2Var.b2 = ofFloat;
                ofFloat.addUpdateListener(new az1(zj2Var, (byte) 12));
                boolean z = zj2Var.Y1;
                ValueAnimator valueAnimator = zj2Var.b2;
                if (z) {
                    valueAnimator.setDuration(220L);
                } else {
                    c00.o(1.5f, valueAnimator);
                    zj2Var.b2.setDuration(350L);
                }
                zj2Var.b2.start();
                zj2Var.m();
                break;
            case 15:
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
                break;
            case 27:
                df6 df6Var = (df6) obj;
                xe6 xe6Var = df6Var.T;
                if (df6Var.S) {
                    df6Var.removeCallbacks(xe6Var);
                    xe6Var.run();
                    break;
                }
                break;
            case 28:
                vf6 vf6Var = (vf6) obj;
                tf6 tf6Var = vf6Var.y;
                if (vf6Var.x) {
                    vf6Var.removeCallbacks(tf6Var);
                    tf6Var.run();
                    break;
                }
                break;
            default:
                tg6 tg6Var = (tg6) obj;
                gg6 gg6Var = tg6Var.u0;
                if (tg6Var.t0) {
                    tg6Var.removeCallbacks(gg6Var);
                    gg6Var.run();
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
                s7 s7Var = (s7) obj;
                o7 o7Var = s7Var.I;
                if (o7Var != null) {
                    o7Var.l(s7Var.e);
                }
                s7Var.k();
                if (!s7Var.h0.isEmpty() && !TextUtils.isEmpty(s7Var.e.getText()) && s7Var.i0 >= 0) {
                    s7Var.i0 = -1;
                    s7Var.E();
                    break;
                }
                break;
            case 5:
                pe1 pe1Var = (pe1) obj;
                ve1 ve1Var = pe1Var.c;
                String str = ve1Var.r;
                ve1Var.r = charSequence == null ? "" : charSequence.toString();
                ve1 ve1Var2 = pe1Var.c;
                re1 re1Var = ve1Var2.F;
                if (re1Var != null && str != null) {
                    re1Var.b(ve1Var2.r);
                }
                if (!ve1Var.n) {
                    ve1Var.b0(ve1Var.r);
                    break;
                }
                break;
            case 6:
                gi1 gi1Var = (gi1) obj;
                gi1Var.d0(gi1Var.y.getText().toString());
                break;
            case 11:
                v92 v92Var = (v92) obj;
                if (!v92Var.n0) {
                    String obj2 = v92Var.b.getText().toString();
                    re1 re1Var2 = v92Var.P;
                    if (re1Var2 != null) {
                        re1Var2.b(obj2);
                    }
                    v92Var.b0(obj2);
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

    private final void f(Editable editable) {
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
