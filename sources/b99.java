// default package

import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class b99 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b99(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ba  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        jw9 jw9Var;
        i4d i4dVar;
        zh zhVar;
        TL_stars.SavedStarGift savedStarGift;
        jza i;
        byte b = 21;
        i4d i4dVar2 = null;
        CharSequence charSequence = null;
        r12 = null;
        gna gnaVar = null;
        boolean z = false;
        switch (this.a) {
            case 0:
                z99 z99Var = (z99) this.b;
                if (((f99) this.c).n > 0) {
                    z99Var.presentFragment(new jva());
                    break;
                }
                break;
            case 1:
                y99 y99Var = (y99) this.b;
                x99 x99Var = (x99) this.c;
                cs5 G = cs5.G(y99Var.c, y99Var.J0, y99Var.V1);
                G.b(R.drawable.menu_sort_value, k96.M0(2131745946, null), new t99(x99Var, (byte) 3), false);
                G.b(R.drawable.menu_sort_date, k96.M0(2131745950, null), new t99(x99Var, (byte) 4), false);
                G.b(R.drawable.menu_sort_number, k96.M0(2131745948, null), new t99(x99Var, (byte) 5), false);
                G.t = false;
                G.b0 = true;
                G.b0(0.0f, gl.L(-8.0f));
                G.a0();
                break;
            case 2:
                ((hd9) this.b).j0((Context) this.c, view);
                break;
            case 3:
                jw9 jw9Var2 = (jw9) this.b;
                Context context = (Context) this.c;
                if (jw9Var2.x == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    kq8 kq8Var = new kq8(jw9Var2, zArr, (byte) 16);
                    Pattern pattern = ij.a;
                    if (context == null) {
                        jw9Var = jw9Var2;
                    } else {
                        int w0 = bkb.w0(null, bkb.i5, false);
                        int w02 = bkb.w0(null, bkb.g5, false);
                        bkb.w0(null, bkb.zj, false);
                        bkb.w0(null, bkb.Dj, false);
                        bkb.w0(null, bkb.D8, false);
                        bkb.w0(null, bkb.F8, false);
                        bkb.w0(null, bkb.h6, false);
                        int w03 = bkb.w0(null, bkb.Ii, false);
                        int w04 = bkb.w0(null, bkb.Ei, false);
                        int w05 = bkb.w0(null, bkb.Gi, false);
                        i4d i4dVar3 = new i4d(context, null);
                        ((fx0) i4dVar3.a).w0 = false;
                        hn7 hn7Var = new hn7(context, null);
                        hn7Var.setTextColor(w0);
                        hn7Var.setTextOffset(gl.L(10.0f));
                        hn7Var.setItemCount(5);
                        ni niVar = new ni(context, null);
                        niVar.setItemCount(5);
                        niVar.setTextColor(w0);
                        niVar.setTextOffset(-gl.L(10.0f));
                        oi oiVar = new oi(context, null);
                        oiVar.setItemCount(5);
                        oiVar.setTextColor(w0);
                        oiVar.setTextOffset(-gl.L(34.0f));
                        zh zhVar2 = new zh(context, hn7Var, niVar, oiVar, (byte) 4);
                        zhVar2.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context);
                        zhVar2.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context);
                        textView.setText(k96.M0(2131745334, null));
                        textView.setTextColor(w0);
                        ir2.t(textView, 1, 20.0f);
                        frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new p8((byte) 2));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        zhVar2.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        wb wbVar = new wb(context, (byte) 4);
                        linearLayout.addView(hn7Var, nme.l(0.5f, 0, kk7.s4));
                        hn7Var.setMinValue(0);
                        hn7Var.setMaxValue(365);
                        hn7Var.setWrapSelectorWheel(false);
                        hn7Var.setFormatter(new c((byte) 20));
                        ie ieVar = new ie((Object) hn7Var, (Object) niVar, (Object) oiVar, (byte) 1);
                        hn7Var.setOnValueChangedListener(ieVar);
                        niVar.setMinValue(0);
                        niVar.setMaxValue(23);
                        linearLayout.addView(niVar, nme.l(0.2f, 0, kk7.s4));
                        niVar.setFormatter(new c((byte) 21));
                        niVar.setOnValueChangedListener(ieVar);
                        oiVar.setMinValue(0);
                        oiVar.setMaxValue(59);
                        oiVar.setValue(0);
                        oiVar.setFormatter(new c((byte) 22));
                        linearLayout.addView(oiVar, nme.l(0.3f, 0, kk7.s4));
                        oiVar.setOnValueChangedListener(ieVar);
                        if (currentTimeMillis <= 0 || currentTimeMillis == 2147483646) {
                            jw9Var = jw9Var2;
                            i4dVar = i4dVar3;
                            zhVar = zhVar2;
                        } else {
                            long j = currentTimeMillis * 1000;
                            i4dVar = i4dVar3;
                            jw9Var = jw9Var2;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            zhVar = zhVar2;
                            int timeInMillis = (int) ((j - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j);
                            if (timeInMillis >= 0) {
                                oiVar.setValue(calendar.get(12));
                                niVar.setValue(calendar.get(11));
                                hn7Var.setValue(timeInMillis);
                            }
                        }
                        ij.g(null, null, 0L, 0L, 0, hn7Var, niVar, oiVar);
                        wbVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                        wbVar.setGravity(17);
                        wbVar.setTextColor(w03);
                        wbVar.setTextSize(1, 14.0f);
                        wbVar.setTypeface(gl.o());
                        int L = gl.L(8.0f);
                        wbVar.setBackgroundDrawable(bkb.i0(L, L, L, L, w04, w05, w05));
                        wbVar.setText(k96.M0(2131745336, null));
                        zh zhVar3 = zhVar;
                        zhVar3.addView(wbVar, nme.t(-1, 48, 83, 16, 15, 16, 16));
                        i4d i4dVar4 = i4dVar;
                        wbVar.setOnClickListener(new ff(hn7Var, niVar, oiVar, calendar, kq8Var, i4dVar4, (byte) 0));
                        fx0 fx0Var = (fx0) i4dVar4.a;
                        fx0Var.O = zhVar3;
                        fx0Var.show();
                        fx0Var.s0(w02);
                        fx0Var.L(w02);
                        i4dVar2 = i4dVar4;
                    }
                    cf cfVar = new cf(jw9Var, zArr, (byte) 14);
                    fx0 fx0Var2 = (fx0) i4dVar2.a;
                    fx0Var2.I0 = cfVar;
                    fx0Var2.show();
                    jw9Var.x = fx0Var2;
                    jw9Var.a(false);
                    break;
                }
                break;
            case 4:
                ny9 ny9Var = (ny9) this.b;
                a61 a61Var = (a61) this.c;
                HashSet hashSet = ny9Var.U1;
                if (!hashSet.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList2 = ny9Var.T1.l;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                Object obj = arrayList2.get(i2);
                                i2++;
                                savedStarGift = (TL_stars.SavedStarGift) obj;
                                int i3 = savedStarGift.msg_id;
                                if ((i3 == 0 || i3 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList.add(savedStarGift);
                        }
                    }
                    a61Var.a(arrayList);
                    ny9Var.dismiss();
                    break;
                }
                break;
            case 5:
                my9 my9Var = (my9) this.b;
                ly9 ly9Var = (ly9) this.c;
                xsa xsaVar = my9Var.c.T1;
                xsaVar.e = !xsaVar.e;
                ly9Var.run();
                xsaVar.k(true);
                break;
            case 6:
                qy9 qy9Var = (qy9) this.b;
                gq7 gq7Var = (gq7) this.c;
                if (qy9Var.U1.g() != 0) {
                    gq7Var.a(new ArrayList(qy9Var.V1.values()));
                    qy9Var.dismiss();
                    break;
                }
                break;
            case 7:
                o0a o0aVar = (o0a) this.b;
                nu9 nu9Var = (nu9) this.c;
                u41 u41Var = o0aVar.p1;
                if (u41Var.e0 && !u41Var.R) {
                    gl.t1(o0aVar.m1);
                    u41Var.setLoading(true);
                    nu9Var.a(o0aVar.y1);
                    break;
                }
                break;
            case 8:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.c;
                sessionsActivity.getClass();
                alertDialog$Builder.a.M0.run();
                Integer num = (Integer) view.getTag();
                int i4 = num.intValue() == 0 ? 7 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? kk7.M2 : num.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i4;
                sessionsActivity.s = i4;
                g7a g7aVar = sessionsActivity.a;
                if (g7aVar != null) {
                    g7aVar.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ce2(r13));
                break;
            case 9:
                zka zkaVar = (zka) this.b;
                yka ykaVar = (yka) this.c;
                if (ykaVar.P) {
                    boolean x = DictationAsr.x();
                    String str = ykaVar.a;
                    if (x) {
                        DictationAsr.Z(str);
                    } else {
                        boolean z2 = DictationAsr.z(str);
                        StringBuilder sb = new StringBuilder();
                        String[] G2 = DictationAsr.G();
                        int length = G2.length;
                        while (r13 < length) {
                            String str2 = G2[r13];
                            if (str2.equals(str)) {
                                r13 = z2 ? r13 + 1 : (byte) 0;
                                if (sb.length() > 0) {
                                    sb.append(',');
                                }
                                sb.append(str2);
                            } else {
                                if (!DictationAsr.z(str2)) {
                                }
                                if (sb.length() > 0) {
                                }
                                sb.append(str2);
                            }
                        }
                        SharedPreferences.Editor putString = na7.c1().edit().putString("asr_langs", sb.toString());
                        if (sb.length() == 0) {
                            putString.putBoolean("asr_auto", true);
                        }
                        putString.apply();
                    }
                } else if (!ykaVar.Q) {
                    DictationAsr.s(ykaVar.f);
                }
                ykaVar.c();
                zkaVar.d0();
                break;
            case 10:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(jva.J0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 11:
                kna knaVar = (kna) this.b;
                ArrayList<TL_stars.StarGiftAttribute> arrayList3 = (ArrayList) this.c;
                ena enaVar = knaVar.j2;
                int i5 = knaVar.u2;
                if (i5 == 2) {
                    enaVar.setPreviewingAttributes(arrayList3);
                    knaVar.b1(1);
                    break;
                } else if (i5 == 1) {
                    gna gnaVar2 = new gna(enaVar.getUpgradeBackdropAttribute(), enaVar.getUpgradePatternAttribute(), enaVar.getUpgradeImageViewAttribute());
                    knaVar.o2 = gnaVar2;
                    enaVar.setPreviewAttributes(gnaVar2);
                    knaVar.b1(2);
                    break;
                }
                break;
            case 12:
                fna fnaVar = (fna) this.b;
                gna gnaVar3 = (gna) this.c;
                kna knaVar2 = fnaVar.Q;
                int i6 = knaVar2.u2;
                ena enaVar2 = knaVar2.j2;
                if (i6 == 1) {
                    knaVar2.o2 = new gna(enaVar2.getUpgradeBackdropAttribute(), enaVar2.getUpgradePatternAttribute(), enaVar2.getUpgradeImageViewAttribute());
                    knaVar2.b1(2);
                }
                int i7 = knaVar2.e2.s;
                gna gnaVar4 = knaVar2.o2;
                if (gnaVar4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = gnaVar4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = gnaVar4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = gnaVar4.b;
                    if (i7 == 1) {
                        gnaVar = new gna(gnaVar3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i7 == 2) {
                        gnaVar = new gna(stargiftattributebackdrop, gnaVar3.b, stargiftattributemodel);
                    } else if (i7 == 0) {
                        gnaVar = new gna(stargiftattributebackdrop, stargiftattributepattern, gnaVar3.c);
                    }
                }
                knaVar2.o2 = gnaVar;
                enaVar2.setPreviewAttributes(gnaVar);
                knaVar2.d1();
                break;
            case 13:
                vqa vqaVar = (vqa) this.b;
                ag2 ag2Var = (ag2) this.c;
                boolean z3 = !vqaVar.v3;
                vqaVar.v3 = z3;
                ag2Var.c(z3, true);
                break;
            case 14:
                d01.v(((vqa) this.b).getContext(), ((TL_stars.UniqueStarGiftValueInfo) this.c).fragment_listed_url, false);
                break;
            case 15:
                ((vqa) this.b).t2((CharSequence) this.c);
                break;
            case 16:
                upa upaVar = (upa) this.b;
                wjb wjbVar = (wjb) this.c;
                if (upaVar.F.getAlpha() >= 1.0f && !upaVar.i0 && !upaVar.k0 && upaVar.e0 != null) {
                    new kna(upaVar.getContext(), wjbVar, upaVar.a0, upaVar.d0, upaVar.e0, true).show();
                    break;
                }
                break;
            case 17:
                d01.t((Context) this.b, ((TL_stars.StarsTransaction) this.c).transaction_url);
                break;
            case 18:
                ywa ywaVar = (ywa) this.b;
                rxa rxaVar = (rxa) this.c;
                uxa uxaVar = ywaVar.e0;
                uxaVar.getOrCreateStoryViewer().G(uxaVar.getParentActivity(), rxaVar.b(), uxaVar.D0, p2b.a(uxaVar.T));
                break;
            case 19:
                cxa cxaVar = (cxa) this.b;
                k26 k26Var = (k26) this.c;
                int i8 = cxaVar.c;
                dxa dxaVar = cxaVar.d;
                oi4 oi4Var = cxaVar.a;
                if (oi4Var.c) {
                    ArrayList arrayList4 = dxaVar.n;
                    nf0 nf0Var = dxaVar.c;
                    int size2 = arrayList4.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size2) {
                            z = true;
                        } else if (i9 == i8 || !((cxa) arrayList4.get(i9)).a.c || !((cxa) arrayList4.get(i9)).a.b) {
                            i9++;
                        }
                    }
                    dxaVar.f();
                    if (z) {
                        gl.z3(oi4Var);
                        break;
                    } else {
                        oi4Var.setChecked(!oi4Var.b);
                        k26Var.n = oi4Var.b;
                        dxaVar.b.z();
                        if (dxaVar.r.c > 0 && i8 < nf0Var.d.size()) {
                            ((k26) nf0Var.d.get(i8)).n = oi4Var.b;
                            nf0Var.z();
                            break;
                        }
                    }
                }
                break;
            case 20:
                mza mzaVar = (mza) this.b;
                o42 o42Var = (o42) this.c;
                jza[] jzaVarArr = mzaVar.I;
                if (jzaVarArr != null && jzaVarArr.length != 0 && mzaVar.J != null && (i = mzaVar.i(mzaVar.o0, mzaVar.p0)) != null) {
                    o42Var.a(i);
                    break;
                }
                break;
            case 21:
                q0b q0bVar = (q0b) this.b;
                xya xyaVar = (xya) this.c;
                xv2.e().k(q0bVar.r.g2);
                xv2.e().m(xyaVar);
                break;
            case 22:
                t4b t4bVar = (t4b) this.b;
                iya iyaVar = (iya) this.c;
                it3 it3Var = t4bVar.T1;
                try {
                    charSequence = ((ClipboardManager) t4bVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(t4bVar.getContext());
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                if (charSequence != null) {
                    it3Var.d.setText(charSequence.toString());
                    ht3 ht3Var = it3Var.d;
                    ht3Var.setSelection(0, ht3Var.getText().length());
                }
                iyaVar.run();
                break;
            case 23:
                t7b t7bVar = (t7b) this.b;
                new g5b((Context) this.c, t7bVar.c, true, t7bVar.y0, new e6b(t7bVar, b), t7bVar.a).show();
                break;
            case 24:
                ((hj3) this.b).a((TLRPC.TL_payments_checkedGiftCode) this.c);
                break;
            case 25:
                ((hj3) this.b).a((TLRPC.Chat) this.c);
                break;
            case 26:
                CharSequence charSequence2 = (CharSequence) this.b;
                t7a t7aVar = (t7a) this.c;
                gl.g(charSequence2);
                t7aVar.run();
                break;
            case 27:
                fx0 fx0Var3 = (fx0) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                fx0Var3.dismiss();
                if (!zArr2[0]) {
                    na7.c1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                    break;
                }
                break;
            case 28:
                ymb ymbVar = (ymb) this.b;
                Context context2 = (Context) this.c;
                if (ymbVar.getParentActivity() != null) {
                    i4d i4dVar5 = new i4d(ymbVar.getParentActivity(), null);
                    ((fx0) i4dVar5.a).w0 = false;
                    LinearLayout j2 = de9.j(context2, 1);
                    TextView textView2 = new TextView(context2);
                    textView2.setText(k96.M0(2131752100, null));
                    tb4.w(textView2, bkb.i5, null, 1, 20.0f);
                    j2.addView(textView2, nme.t(-1, -2, 51, 22, 12, 22, 4));
                    textView2.setOnTouchListener(new wmb((byte) 0));
                    ((fx0) i4dVar5.a).O = j2;
                    ArrayList arrayList5 = new ArrayList();
                    int size3 = bkb.F.size();
                    for (int i10 = 0; i10 < size3; i10++) {
                        akb akbVar = (akb) bkb.F.get(i10);
                        TLRPC.TL_theme tL_theme = akbVar.G;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList5.add(akbVar);
                        }
                    }
                    qkb qkbVar = new qkb(context2, ymbVar, arrayList5, new ArrayList(), i4dVar5);
                    j2.addView(qkbVar, nme.k(0.0f, 7.0f, 0.0f, 1.0f, -1, kk7.d2));
                    qkbVar.A1(ymbVar.fragmentView.getMeasuredWidth());
                    ymbVar.showDialog((fx0) i4dVar5.a);
                    break;
                }
                break;
            default:
                lwb lwbVar = (lwb) this.b;
                or1 or1Var = (or1) this.c;
                lwbVar.d();
                mu1 mu1Var = or1Var.a;
                vtb e0 = vtb.e0(-mu1Var.l6, 0L);
                e0.E = mu1Var;
                mu1Var.presentFragment(e0);
                break;
        }
    }
}
