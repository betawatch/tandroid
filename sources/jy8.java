// default package

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jy8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jy8(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.a = (byte) 20;
        this.b = context;
        this.c = starsTransaction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d6  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        z8d z8dVar;
        TL_stars.SavedStarGift savedStarGift;
        h3b i;
        byte b = 2;
        z8d z8dVar2 = null;
        CharSequence charSequence = null;
        r12 = null;
        cra craVar = null;
        boolean z = false;
        switch (this.a) {
            case 0:
                ky8 ky8Var = (ky8) this.c;
                Context context = (Context) this.b;
                Uri B0 = hl.B0(ky8Var.l1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (B0 != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", B0);
                    try {
                        hl.W(context).startActivityForResult(Intent.createChooser(intent, ky8Var.m0.getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                break;
            case 1:
                String str = (String) this.c;
                Context context2 = (Context) this.b;
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", str);
                Intent createChooser = Intent.createChooser(intent2, ob6.M0(2131745186, null));
                createChooser.setFlags(TLObject.FLAG_28);
                context2.startActivity(createChooser);
                break;
            case 2:
                j59 j59Var = (j59) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.b;
                ArrayList arrayList = j59Var.S1;
                if (!arrayList.isEmpty()) {
                    i15 i15Var = j59Var.V1;
                    if (!i15Var.R) {
                        i15Var.setLoading(true);
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                            arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(wf3.n(tL_myBoost.peer)));
                        }
                        on0.a(chat.id, arrayList2, new ku0((Object) j59Var, (Object) chat, (Object) arrayList2, (Object) hashSet, (byte) 17), new ii7(j59Var, (byte) 27));
                        break;
                    }
                }
                break;
            case 3:
                ((nd9) this.c).f0((qc9) this.b);
                break;
            case 4:
                md9 md9Var = (md9) this.c;
                ld9 ld9Var = (ld9) this.b;
                fu5 G = fu5.G(md9Var.c, md9Var.J0, md9Var.V1);
                G.b(R.drawable.menu_sort_value, ob6.M0(2131745866, null), new id9(ld9Var, (byte) 3), false);
                G.b(R.drawable.menu_sort_date, ob6.M0(2131745870, null), new id9(ld9Var, (byte) 4), false);
                G.b(R.drawable.menu_sort_number, ob6.M0(2131745868, null), new id9(ld9Var, (byte) 5), false);
                G.t = false;
                G.e0 = true;
                G.b0(0.0f, hl.L(-8.0f));
                G.a0();
                break;
            case 5:
                ((yg9) this.c).j0((Context) this.b, view);
                break;
            case 6:
                c0a c0aVar = (c0a) this.c;
                Context context3 = (Context) this.b;
                if (c0aVar.x == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    yw9 yw9Var = new yw9(c0aVar, zArr, b);
                    Pattern pattern = jj.a;
                    if (context3 != null) {
                        int w0 = aob.w0(null, aob.j5, false);
                        int w02 = aob.w0(null, aob.h5, false);
                        aob.w0(null, aob.Aj, false);
                        aob.w0(null, aob.Ej, false);
                        aob.w0(null, aob.E8, false);
                        aob.w0(null, aob.G8, false);
                        aob.w0(null, aob.i6, false);
                        int w03 = aob.w0(null, aob.Ji, false);
                        int w04 = aob.w0(null, aob.Fi, false);
                        int w05 = aob.w0(null, aob.Hi, false);
                        z8d z8dVar3 = new z8d(context3, (vnb) null);
                        ((nx0) z8dVar3.b).w0 = false;
                        hq7 hq7Var = new hq7(context3, null);
                        hq7Var.setTextColor(w0);
                        hq7Var.setTextOffset(hl.L(10.0f));
                        hq7Var.setItemCount(5);
                        oi oiVar = new oi(context3, null);
                        oiVar.setItemCount(5);
                        oiVar.setTextColor(w0);
                        oiVar.setTextOffset(-hl.L(10.0f));
                        pi piVar = new pi(context3, null);
                        piVar.setItemCount(5);
                        piVar.setTextColor(w0);
                        piVar.setTextOffset(-hl.L(34.0f));
                        ai aiVar = new ai(context3, hq7Var, oiVar, piVar, (byte) 4);
                        aiVar.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context3);
                        aiVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context3);
                        textView.setText(ob6.M0(2131745254, null));
                        textView.setTextColor(w0);
                        bs2.t(textView, 1, 20.0f);
                        frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new q8((byte) 7));
                        LinearLayout linearLayout = new LinearLayout(context3);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        aiVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        xb xbVar = new xb(context3, (byte) 4);
                        linearLayout.addView(hq7Var, tre.l(0.5f, 0, jn7.s4));
                        hq7Var.setMinValue(0);
                        hq7Var.setMaxValue(365);
                        hq7Var.setWrapSelectorWheel(false);
                        hq7Var.setFormatter(new bg((byte) 4));
                        ie ieVar = new ie((Object) hq7Var, (Object) oiVar, (Object) piVar, (byte) 2);
                        hq7Var.setOnValueChangedListener(ieVar);
                        oiVar.setMinValue(0);
                        oiVar.setMaxValue(23);
                        linearLayout.addView(oiVar, tre.l(0.2f, 0, jn7.s4));
                        oiVar.setFormatter(new bg((byte) 5));
                        oiVar.setOnValueChangedListener(ieVar);
                        piVar.setMinValue(0);
                        piVar.setMaxValue(59);
                        piVar.setValue(0);
                        piVar.setFormatter(new bg((byte) 6));
                        linearLayout.addView(piVar, tre.l(0.3f, 0, jn7.s4));
                        piVar.setOnValueChangedListener(ieVar);
                        if (currentTimeMillis <= 0 || currentTimeMillis == 2147483646) {
                            z8dVar = z8dVar3;
                        } else {
                            long j = currentTimeMillis * 1000;
                            z8dVar = z8dVar3;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j);
                            if (timeInMillis >= 0) {
                                piVar.setValue(calendar.get(12));
                                oiVar.setValue(calendar.get(11));
                                hq7Var.setValue(timeInMillis);
                            }
                        }
                        jj.g(null, null, 0L, 0L, 0, hq7Var, oiVar, piVar);
                        xbVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                        xbVar.setGravity(17);
                        xbVar.setTextColor(w03);
                        xbVar.setTextSize(1, 14.0f);
                        xbVar.setTypeface(hl.o());
                        int L = hl.L(8.0f);
                        xbVar.setBackgroundDrawable(aob.i0(L, L, L, L, w04, w05, w05));
                        xbVar.setText(ob6.M0(2131745256, null));
                        aiVar.addView(xbVar, tre.t(-1, 48, 83, 16, 15, 16, 16));
                        z8d z8dVar4 = z8dVar;
                        z8dVar2 = z8dVar4;
                        xbVar.setOnClickListener(new xf(hq7Var, oiVar, piVar, calendar, yw9Var, z8dVar4, (byte) 1));
                        nx0 nx0Var = (nx0) z8dVar2.b;
                        nx0Var.O = aiVar;
                        nx0Var.show();
                        nx0Var.s0(w02);
                        nx0Var.K(w02);
                    }
                    gf gfVar = new gf(c0aVar, zArr, (byte) 14);
                    nx0 nx0Var2 = (nx0) z8dVar2.b;
                    nx0Var2.I0 = gfVar;
                    nx0Var2.show();
                    c0aVar.x = nx0Var2;
                    c0aVar.a(false);
                    break;
                }
                break;
            case 7:
                h2a h2aVar = (h2a) this.c;
                i61 i61Var = (i61) this.b;
                HashSet hashSet2 = h2aVar.U1;
                if (!hashSet2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList4 = h2aVar.T1.l;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                Object obj2 = arrayList4.get(i3);
                                i3++;
                                savedStarGift = (TL_stars.SavedStarGift) obj2;
                                int i4 = savedStarGift.msg_id;
                                if ((i4 == 0 || i4 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList3.add(savedStarGift);
                        }
                    }
                    i61Var.a(arrayList3);
                    h2aVar.dismiss();
                    break;
                }
                break;
            case 8:
                g2a g2aVar = (g2a) this.c;
                f2a f2aVar = (f2a) this.b;
                axa axaVar = g2aVar.c.T1;
                axaVar.e = !axaVar.e;
                f2aVar.run();
                axaVar.k(true);
                break;
            case 9:
                k2a k2aVar = (k2a) this.c;
                mt7 mt7Var = (mt7) this.b;
                if (k2aVar.U1.g() != 0) {
                    mt7Var.a(new ArrayList(k2aVar.V1.values()));
                    k2aVar.dismiss();
                    break;
                }
                break;
            case 10:
                h4a h4aVar = (h4a) this.c;
                ku9 ku9Var = (ku9) this.b;
                c51 c51Var = h4aVar.p1;
                if (c51Var.e0 && !c51Var.R) {
                    hl.t1(h4aVar.m1);
                    c51Var.setLoading(true);
                    ku9Var.a(h4aVar.y1);
                    break;
                }
                break;
            case 11:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.b;
                sessionsActivity.getClass();
                alertDialog$Builder.a.M0.run();
                Integer num = (Integer) view.getTag();
                int i5 = num.intValue() == 0 ? 7 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? jn7.M2 : num.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i5;
                sessionsActivity.s = i5;
                xaa xaaVar = sessionsActivity.a;
                if (xaaVar != null) {
                    xaaVar.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new xe2(r13));
                break;
            case 12:
                woa woaVar = (woa) this.c;
                voa voaVar = (voa) this.b;
                if (voaVar.a0) {
                    boolean y = DictationAsr.y();
                    String str2 = voaVar.a;
                    if (y) {
                        DictationAsr.b0(str2);
                    } else {
                        boolean A = DictationAsr.A(str2);
                        StringBuilder sb = new StringBuilder();
                        String[] I = DictationAsr.I();
                        int length = I.length;
                        while (r13 < length) {
                            String str3 = I[r13];
                            if (str3.equals(str2)) {
                                r13 = A ? r13 + 1 : (byte) 0;
                                if (sb.length() > 0) {
                                    sb.append(',');
                                }
                                sb.append(str3);
                            } else {
                                if (!DictationAsr.A(str3)) {
                                }
                                if (sb.length() > 0) {
                                }
                                sb.append(str3);
                            }
                        }
                        SharedPreferences.Editor putString = uc7.e1().edit().putString("asr_langs", sb.toString());
                        if (sb.length() == 0) {
                            putString.putBoolean("asr_auto", true);
                        }
                        putString.apply();
                    }
                } else if (!voaVar.b0) {
                    DictationAsr.t(voaVar.h);
                }
                voaVar.e();
                woaVar.f0();
                break;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                editTextBoldCursor.setText(nza.K0(((Long) this.b).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 14:
                gra graVar = (gra) this.c;
                ArrayList<TL_stars.StarGiftAttribute> arrayList5 = (ArrayList) this.b;
                ara araVar = graVar.j2;
                int i6 = graVar.u2;
                if (i6 != 2) {
                    if (i6 == 1) {
                        cra craVar2 = new cra(araVar.getUpgradeBackdropAttribute(), araVar.getUpgradePatternAttribute(), araVar.getUpgradeImageViewAttribute());
                        graVar.o2 = craVar2;
                        araVar.setPreviewAttributes(craVar2);
                        graVar.c1(2);
                        break;
                    }
                } else {
                    araVar.setPreviewingAttributes(arrayList5);
                    graVar.c1(1);
                    break;
                }
                break;
            case 15:
                bra braVar = (bra) this.c;
                cra craVar3 = (cra) this.b;
                gra graVar2 = braVar.Q;
                int i7 = graVar2.u2;
                ara araVar2 = graVar2.j2;
                if (i7 == 1) {
                    graVar2.o2 = new cra(araVar2.getUpgradeBackdropAttribute(), araVar2.getUpgradePatternAttribute(), araVar2.getUpgradeImageViewAttribute());
                    graVar2.c1(2);
                }
                int i8 = graVar2.e2.s;
                cra craVar4 = graVar2.o2;
                if (craVar4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = craVar4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = craVar4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = craVar4.b;
                    if (i8 == 1) {
                        craVar = new cra(craVar3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i8 == 2) {
                        craVar = new cra(stargiftattributebackdrop, craVar3.b, stargiftattributemodel);
                    } else if (i8 == 0) {
                        craVar = new cra(stargiftattributebackdrop, stargiftattributepattern, craVar3.c);
                    }
                }
                graVar2.o2 = craVar;
                araVar2.setPreviewAttributes(craVar);
                graVar2.e1();
                break;
            case 16:
                wua wuaVar = (wua) this.c;
                sg2 sg2Var = (sg2) this.b;
                boolean z2 = !wuaVar.v3;
                wuaVar.v3 = z2;
                sg2Var.c(z2, true);
                break;
            case 17:
                m01.w(((wua) this.c).getContext(), ((TL_stars.UniqueStarGiftValueInfo) this.b).fragment_listed_url, false);
                break;
            case 18:
                ((wua) this.c).u2((CharSequence) this.b);
                break;
            case 19:
                vta vtaVar = (vta) this.c;
                vnb vnbVar = (vnb) this.b;
                if (vtaVar.F.getAlpha() >= 1.0f && !vtaVar.i0 && !vtaVar.k0 && vtaVar.e0 != null) {
                    new gra(vtaVar.getContext(), vnbVar, vtaVar.a0, vtaVar.d0, vtaVar.e0, true).show();
                    break;
                }
                break;
            case 20:
                m01.u((Context) this.b, ((TL_stars.StarsTransaction) this.c).transaction_url);
                break;
            case 21:
                b1b b1bVar = (b1b) this.c;
                t1b t1bVar = (t1b) this.b;
                w1b w1bVar = b1bVar.e0;
                w1bVar.getOrCreateStoryViewer().G(w1bVar.getParentActivity(), t1bVar.b(), w1bVar.D0, l6b.a(w1bVar.T));
                break;
            case 22:
                f1b f1bVar = (f1b) this.c;
                o46 o46Var = (o46) this.b;
                int i9 = f1bVar.c;
                g1b g1bVar = f1bVar.d;
                sk4 sk4Var = f1bVar.a;
                if (sk4Var.c) {
                    ArrayList arrayList6 = g1bVar.n;
                    pf0 pf0Var = g1bVar.c;
                    int size3 = arrayList6.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size3) {
                            z = true;
                        } else if (i10 == i9 || !((f1b) arrayList6.get(i10)).a.c || !((f1b) arrayList6.get(i10)).a.b) {
                            i10++;
                        }
                    }
                    g1bVar.f();
                    if (!z) {
                        sk4Var.setChecked(!sk4Var.b);
                        o46Var.n = sk4Var.b;
                        g1bVar.b.z();
                        if (g1bVar.r.c > 0 && i9 < pf0Var.d.size()) {
                            ((o46) pf0Var.d.get(i9)).n = sk4Var.b;
                            pf0Var.z();
                            break;
                        }
                    } else {
                        hl.z3(sk4Var);
                        break;
                    }
                }
                break;
            case 23:
                k3b k3bVar = (k3b) this.c;
                e52 e52Var = (e52) this.b;
                h3b[] h3bVarArr = k3bVar.I;
                if (h3bVarArr != null && h3bVarArr.length != 0 && k3bVar.J != null && (i = k3bVar.i(k3bVar.o0, k3bVar.p0)) != null) {
                    e52Var.a(i);
                    break;
                }
                break;
            case 24:
                o4b o4bVar = (o4b) this.c;
                x2b x2bVar = (x2b) this.b;
                rw2.e().k(o4bVar.r.g2);
                rw2.e().m(x2bVar);
                break;
            case 25:
                r8b r8bVar = (r8b) this.c;
                z3b z3bVar = (z3b) this.b;
                zt3 zt3Var = r8bVar.T1;
                try {
                    charSequence = ((ClipboardManager) r8bVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(r8bVar.getContext());
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
                if (charSequence != null) {
                    zt3Var.d.setText(charSequence.toString());
                    yt3 yt3Var = zt3Var.d;
                    yt3Var.setSelection(0, yt3Var.getText().length());
                }
                z3bVar.run();
                break;
            case 26:
                rbb rbbVar = (rbb) this.c;
                new e9b((Activity) this.b, rbbVar.c, true, rbbVar.y0, new dab(rbbVar, (byte) 19), rbbVar.a).show();
                break;
            case 27:
                ((zj3) this.c).a((TLRPC.TL_payments_checkedGiftCode) this.b);
                break;
            case 28:
                ((zj3) this.c).a((TLRPC.Chat) this.b);
                break;
            default:
                CharSequence charSequence2 = (CharSequence) this.c;
                ida idaVar = (ida) this.b;
                hl.g(charSequence2);
                idaVar.run();
                break;
        }
    }

    public /* synthetic */ jy8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}
