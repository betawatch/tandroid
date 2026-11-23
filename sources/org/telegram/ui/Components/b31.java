package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class b31 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.gs {
    public static final String[] S1 = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap T1;
    public final m80 A1;
    public final Drawable B1;
    public final Drawable C1;
    public int D1;
    public int E1;
    public boolean F1;
    public boolean G1;
    public final n21 H1;
    public final a31 I1;
    public final org.telegram.ui.Cells.j9 J1;
    public final org.telegram.ui.Cells.v9 K1;
    public final View L1;
    public final TextView M1;
    public org.telegram.ui.ActionBar.g2 N1;
    public org.telegram.messenger.z10 O1;
    public boolean P1;
    public final d6 Q1;
    public Boolean R1;
    public Integer m1;
    public final CharSequence n1;
    public final TLRPC.InputPeer o1;
    public final int p1;
    public final boolean q1;
    public final TL_iv.RichMessage r1;
    public final org.telegram.messenger.vt s1;
    public final org.telegram.messenger.vt t1;
    public final String u1;
    public String v1;
    public String w1;
    public final z21 x1;
    public final gi.j y1;
    public final m21 z1;

    public b31(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i7, boolean z10, TL_iv.RichMessage richMessage) {
        super(1, context, (org.telegram.ui.ActionBar.h6) null, false);
        this.F1 = org.telegram.ui.ActionBar.m6.I.q();
        this.P1 = true;
        this.u0 = 0;
        O();
        this.n1 = charSequence;
        this.o1 = inputPeer;
        this.p1 = i7;
        this.q1 = z10;
        this.r1 = richMessage;
        this.u1 = str;
        this.v1 = str2;
        v21 v21Var = new v21(this, context);
        this.b = v21Var;
        this.Q1 = new d6(v21Var, 320L, nr.h);
        gi.j jVar = new gi.j(context, 7);
        this.y1 = jVar;
        jVar.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
        jVar.setTextSize(1, org.telegram.messenger.cz.W0);
        int i10 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(jVar, i10, null);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.2f, i10);
        org.telegram.ui.ActionBar.t6.n(jVar, 2, K.a, -1, 2, K.d, null);
        jVar.setText(org.telegram.messenger.j6.m(charSequence == null ? "" : charSequence.toString(), jVar.getPaint().getFontMetricsInt(), true, null, 0));
        this.z1 = new m21(context);
        m80 m80Var = new m80(context, null);
        this.A1 = m80Var;
        m80Var.setDisablePaddingsOffsetY(true);
        m80Var.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
        m80Var.setTextSize(1, org.telegram.messenger.cz.W0);
        org.telegram.ui.ActionBar.t6.U(m80Var, i10, null);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, null);
        m80Var.setTextIsSelectable(true);
        org.telegram.ui.ActionBar.t6.C(m80Var, org.telegram.ui.ActionBar.m6.lg, null);
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.mg, this.J0);
        this.E1 = w02;
        try {
            if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.c6.i()) {
                Drawable textSelectHandleLeft = m80Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(w02, mode);
                m80Var.setTextSelectHandleLeft(textSelectHandleLeft);
                this.B1 = textSelectHandleLeft;
                Drawable textSelectHandleRight = m80Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(w02, mode);
                m80Var.setTextSelectHandleRight(textSelectHandleRight);
                this.C1 = textSelectHandleRight;
            }
        } catch (Exception unused) {
        }
        this.z1.addView(this.A1, c8.ma.c(-1.0f, -1));
        if (this.r1 != null) {
            org.telegram.messenger.vt vtVar = new org.telegram.messenger.vt(this.a, context, null);
            this.s1 = vtVar;
            vtVar.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
            vtVar.set(this.r1);
            vtVar.setTranslationLoading(true);
            org.telegram.messenger.vt vtVar2 = new org.telegram.messenger.vt(this.a, context, null);
            this.t1 = vtVar2;
            vtVar2.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
        }
        n21 n21Var = new n21(this, context);
        this.H1 = n21Var;
        n21Var.setOverScrollMode(1);
        n21Var.setPadding(0, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, 0, org.telegram.messenger.g0.L(80.0f));
        n21Var.setClipToPadding(true);
        v4.c0 c0Var = new v4.c0();
        n21Var.setLayoutManager(c0Var);
        View view = this.r1 != null ? this.s1 : this.y1;
        a31 a31Var = new a31();
        a31Var.e = 1;
        a31Var.c = context;
        a31Var.d = view;
        this.I1 = a31Var;
        n21Var.setAdapter(a31Var);
        n21Var.setOnScrollListener(new o21(this));
        p21 p21Var = new p21(this);
        p21Var.n(180L);
        p21Var.o(new LinearInterpolator());
        n21Var.setItemAnimator(p21Var);
        this.b.addView(n21Var, c8.ma.e(-1, -2, 80));
        org.telegram.ui.Cells.j9 j9Var = new org.telegram.ui.Cells.j9();
        this.J1 = j9Var;
        j9Var.S(n21Var);
        j9Var.z0 = c0Var;
        org.telegram.ui.Cells.v9 n10 = j9Var.n(context);
        this.K1 = n10;
        org.telegram.messenger.g0.E2(n10);
        this.b.addView(n10, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
        org.telegram.messenger.vt vtVar3 = this.t1;
        if (vtVar3 != null) {
            vtVar3.setTextSelectionHelper(j9Var);
        }
        z21 z21Var = new z21(this, context);
        this.x1 = z21Var;
        this.b.addView(z21Var, c8.ma.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, frameLayout, null);
        View view2 = new View(context);
        this.L1 = view2;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view2, null);
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, c8.ma.a(-1.0f, org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.N(1.0f), 55));
        TextView textView = new TextView(context);
        this.M1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ji, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(org.telegram.messenger.hd.N0(2131752025, null));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false);
        this.D1 = x02;
        textView.setBackground(org.telegram.ui.ActionBar.a6.e(x02, 24.0f));
        textView.setOnClickListener(new j70(this, 21));
        frameLayout.addView(textView, c8.ma.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.b.addView(frameLayout, c8.ma.e(-1, -2, 87));
        Y0();
    }

    public static boolean J0(b31 b31Var) {
        n21 n21Var = b31Var.H1;
        float f10 = 0.0f;
        for (int i7 = 0; i7 < n21Var.getChildCount(); i7++) {
            if (RecyclerView.R(n21Var.getChildAt(i7)) == 1) {
                f10 += r3.getHeight();
            }
        }
        return f10 >= ((float) ((n21Var.getHeight() - n21Var.getPaddingTop()) - n21Var.getPaddingBottom()));
    }

    public static void K0(String str, String str2, String str3, org.telegram.messenger.r10 r10Var) {
        if (str2 == null) {
            org.telegram.messenger.c6.d(str, new l21(str, str3, r10Var), new l21(str, str3, r10Var), false);
            return;
        }
        String encode = Uri.encode(str);
        if (encode.length() <= 5000) {
            new r21(str2, str3, encode, r10Var).start();
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 < encode.length()) {
            int min = Math.min(i7 + 5000, encode.length());
            int i10 = min - 1;
            int lastIndexOf = encode.lastIndexOf("%0A", i10);
            if (lastIndexOf < i7) {
                lastIndexOf = -1;
            }
            if (lastIndexOf == -1) {
                int lastIndexOf2 = encode.lastIndexOf("%20", i10);
                lastIndexOf = lastIndexOf2 >= i7 ? lastIndexOf2 : -1;
            }
            if (lastIndexOf != -1) {
                min = lastIndexOf + 3;
            }
            arrayList.add(encode.substring(i7, min));
            i7 = min;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(null);
        }
        boolean[] zArr = new boolean[1];
        int i12 = 0;
        while (i12 < arrayList.size()) {
            org.telegram.messenger.r10 r10Var2 = r10Var;
            new r21(str2, str3, (String) arrayList.get(i12), new di.j0(zArr, arrayList2, i12, r10Var2, 7)).start();
            i12++;
            r10Var = r10Var2;
        }
    }

    public static String L0(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String N0() {
        return org.telegram.messenger.np.g1().getString("translate_to_language", org.telegram.messenger.hd.E0().y.getLanguage());
    }

    public static HashMap O0(CharSequence charSequence) {
        HashMap hashMap = new HashMap();
        if (charSequence != null) {
            ArrayList j3 = org.telegram.messenger.j6.j(charSequence, null);
            String charSequence2 = charSequence.toString();
            for (int i7 = 0; i7 < j3.size(); i7++) {
                org.telegram.messenger.h6 h6Var = (org.telegram.messenger.h6) j3.get(i7);
                if (h6Var != null && h6Var.c != null) {
                    String substring = charSequence2.substring(h6Var.a, h6Var.b);
                    ArrayList arrayList = (ArrayList) hashMap.get(substring);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(substring, arrayList);
                    }
                    arrayList.add(h6Var);
                }
            }
        }
        return hashMap;
    }

    public static String P0(String str, boolean[] zArr, boolean[] zArr2) {
        org.telegram.messenger.dd ddVar;
        String str2;
        if (str == null || str.equals("und") || str.equals("auto")) {
            return null;
        }
        String str3 = str.split("_")[0];
        if ("nb".equals(str3)) {
            str3 = "no";
        }
        if (zArr != null) {
            String O0 = org.telegram.messenger.hd.O0("TranslateLanguage" + str3.toUpperCase());
            boolean z10 = (O0 == null || O0.startsWith("LOC_ERR")) ? false : true;
            zArr[0] = z10;
            if (z10) {
                return O0;
            }
        }
        if (zArr2 != null) {
            String O02 = org.telegram.messenger.hd.O0("TranslateLanguageGenitive" + str3.toUpperCase());
            boolean z11 = (O02 == null || O02.startsWith("LOC_ERR")) ? false : true;
            zArr2[0] = z11;
            if (z11) {
                return O02;
            }
        }
        String X0 = X0(str, false);
        if (X0 == null) {
            X0 = X0(str3, false);
        }
        if (X0 != null) {
            return X0;
        }
        if ("no".equals(str)) {
            str = "nb";
        }
        org.telegram.messenger.dd ddVar2 = org.telegram.messenger.hd.E0().B;
        Iterator it = org.telegram.messenger.hd.E0().N.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                ddVar = null;
                break;
            }
            ddVar = (org.telegram.messenger.dd) it.next();
            String str4 = ddVar.d;
            if (str4 != null && str4.equals("remote") && ((str2 = ddVar.c) == null || !str2.endsWith("_raw"))) {
                String str5 = ddVar.f;
                if (str5 != null && str5.equals(str)) {
                    break;
                }
            }
        }
        if (ddVar == null) {
            return null;
        }
        return (ddVar2 == null || !"en".equals(ddVar2.f)) ? ddVar.a : ddVar.b;
    }

    public static String Q0(String str) {
        String P0 = P0(str, null, null);
        if (P0 == null) {
            return null;
        }
        return P0.substring(0, 1).toUpperCase() + P0.substring(1);
    }

    public static TLRPC.TL_textWithEntities R0(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2) {
        org.telegram.messenger.h6 h6Var;
        ArrayList<TLRPC.MessageEntity> arrayList;
        if (tL_textWithEntities2 == null || tL_textWithEntities2.text == null) {
            return null;
        }
        for (int i7 = 0; i7 < tL_textWithEntities2.entities.size(); i7++) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities2.entities.get(i7);
            if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                if (messageEntity.url != null) {
                    String str = tL_textWithEntities2.text;
                    int i10 = messageEntity.offset;
                    String substring = str.substring(i10, messageEntity.length + i10);
                    if (TextUtils.equals(substring, messageEntity.url)) {
                        TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                        tL_messageEntityUrl.offset = messageEntity.offset;
                        tL_messageEntityUrl.length = messageEntity.length;
                        tL_textWithEntities2.entities.set(i7, tL_messageEntityUrl);
                    } else if (messageEntity.url.startsWith("https://t.me/") && substring.startsWith("@") && TextUtils.equals(substring.substring(1), messageEntity.url.substring(13))) {
                        TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                        tL_messageEntityMention.offset = messageEntity.offset;
                        tL_messageEntityMention.length = messageEntity.length;
                        tL_textWithEntities2.entities.set(i7, tL_messageEntityMention);
                    }
                }
            } else if ((messageEntity instanceof TLRPC.TL_messageEntityPre) && tL_textWithEntities != null && (arrayList = tL_textWithEntities.entities) != null && i7 < arrayList.size() && (tL_textWithEntities.entities.get(i7) instanceof TLRPC.TL_messageEntityPre)) {
                messageEntity.language = tL_textWithEntities.entities.get(i7).language;
            }
        }
        if (tL_textWithEntities != null && tL_textWithEntities.text != null && !tL_textWithEntities.entities.isEmpty()) {
            HashMap O0 = O0(tL_textWithEntities.text);
            HashMap O02 = O0(tL_textWithEntities2.text);
            for (int i11 = 0; i11 < tL_textWithEntities.entities.size(); i11++) {
                TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i11);
                if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    String str2 = tL_textWithEntities.text;
                    int i12 = messageEntity2.offset;
                    String substring2 = str2.substring(i12, messageEntity2.length + i12);
                    if (!TextUtils.isEmpty(substring2)) {
                        ArrayList arrayList2 = (ArrayList) O0.get(substring2);
                        ArrayList arrayList3 = (ArrayList) O02.get(substring2);
                        if (arrayList2 != null && arrayList3 != null) {
                            int i13 = 0;
                            while (true) {
                                if (i13 >= arrayList2.size()) {
                                    i13 = -1;
                                    break;
                                }
                                org.telegram.messenger.h6 h6Var2 = (org.telegram.messenger.h6) arrayList2.get(i13);
                                int i14 = h6Var2.a;
                                int i15 = messageEntity2.offset;
                                if (i14 == i15 && h6Var2.b == i15 + messageEntity2.length) {
                                    break;
                                }
                                i13++;
                            }
                            if (i13 >= 0 && i13 < arrayList3.size() && (h6Var = (org.telegram.messenger.h6) arrayList3.get(i13)) != null) {
                                int i16 = h6Var.b;
                                int i17 = h6Var.a;
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= tL_textWithEntities2.entities.size()) {
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity2;
                                        tL_messageEntityCustomEmoji.document_id = tL_messageEntityCustomEmoji2.document_id;
                                        tL_messageEntityCustomEmoji.document = tL_messageEntityCustomEmoji2.document;
                                        tL_messageEntityCustomEmoji.offset = i17;
                                        tL_messageEntityCustomEmoji.length = i16 - i17;
                                        tL_textWithEntities2.entities.add(tL_messageEntityCustomEmoji);
                                        break;
                                    }
                                    TLRPC.MessageEntity messageEntity3 = tL_textWithEntities2.entities.get(i18);
                                    if (messageEntity3 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        int i19 = messageEntity3.offset;
                                        if (org.telegram.messenger.g0.B1(i17, i16, i19, messageEntity3.length + i19)) {
                                            break;
                                        }
                                    }
                                    i18++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return tL_textWithEntities2;
    }

    public static void U0(String str) {
        org.telegram.messenger.np.g1().edit().putString("translate_to_language", str).apply();
    }

    public static s21 V0(Activity activity, org.telegram.ui.bn bnVar, TLRPC.InputPeer inputPeer, int i7, boolean z10, String str, String str2, CharSequence charSequence, boolean z11, org.telegram.ui.ef efVar, Runnable runnable) {
        s21 s21Var = new s21(activity, str, str2, charSequence, inputPeer, i7, z10, runnable);
        s21Var.T0(z11);
        s21Var.N1 = bnVar;
        s21Var.O1 = efVar;
        if (bnVar.getParentActivity() != null) {
            bnVar.showDialog(s21Var);
        }
        return s21Var;
    }

    public static void W0(Context context, org.telegram.ui.ActionBar.g2 g2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.o00 o00Var, org.telegram.ui.Cells.f fVar) {
        if (context == null) {
            return;
        }
        u21 u21Var = new u21(context, str, str2, charSequence, fVar);
        u21Var.T0(false);
        u21Var.N1 = g2Var;
        u21Var.O1 = o00Var;
        if (g2Var == null) {
            u21Var.show();
        } else if (g2Var.getParentActivity() != null) {
            g2Var.showDialog(u21Var);
        }
    }

    public static String X0(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (T1 == null) {
            T1 = new HashMap();
            try {
                Locale[] availableLocales = Locale.getAvailableLocales();
                for (int i7 = 0; i7 < availableLocales.length; i7++) {
                    T1.put(availableLocales[i7].getLanguage(), availableLocales[i7]);
                    String country = availableLocales[i7].getCountry();
                    if (country != null && country.length() > 0) {
                        T1.put(availableLocales[i7].getLanguage() + "-" + country.toLowerCase(), availableLocales[i7]);
                    }
                }
            } catch (Exception unused) {
            }
        }
        String lowerCase = str.replace("_", "-").toLowerCase();
        try {
            Locale locale = (Locale) T1.get(lowerCase);
            if (locale == null) {
                return null;
            }
            String displayLanguage = locale.getDisplayLanguage(z10 ? locale : Locale.getDefault());
            if (!lowerCase.contains("-")) {
                return displayLanguage;
            }
            String displayCountry = locale.getDisplayCountry(z10 ? locale : Locale.getDefault());
            if (TextUtils.isEmpty(displayCountry)) {
                return displayLanguage;
            }
            return displayLanguage + " (" + displayCountry + ")";
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        if (this.m1 != null) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.m1.intValue(), true);
            this.m1 = null;
        }
        super.L();
    }

    public final float M0(boolean z10) {
        d6 d6Var;
        n21 n21Var = this.H1;
        float top = n21Var.getTop();
        if (n21Var.getChildCount() >= 1) {
            top += Math.max(0, n21Var.getChildAt(n21Var.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - org.telegram.messenger.g0.L(78.0f));
        if (z10 && (d6Var = this.Q1) != null) {
            if (!n21Var.J1 && !this.G1) {
                return d6Var.e(false, max);
            }
            d6Var.e(true, max);
        }
        return max;
    }

    public final CharSequence S0(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.O1 != null || this.N1 != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(7, this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return org.telegram.messenger.j6.m(spannableStringBuilder, this.A1.getPaint().getFontMetricsInt(), true, null, 0);
    }

    public final void T0(boolean z10) {
        m80 m80Var = this.A1;
        if (m80Var != null) {
            m80Var.setTextIsSelectable(!z10);
        }
        if (z10) {
            getWindow().addFlags(TLObject.FLAG_13);
            org.telegram.messenger.g0.h2();
        } else {
            getWindow().clearFlags(TLObject.FLAG_13);
            org.telegram.messenger.g0.h2();
        }
    }

    public final void Y0() {
        if (this.m1 != null) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.m1.intValue(), true);
            this.m1 = null;
        }
        if ("alternative".equalsIgnoreCase(org.telegram.messenger.np.u1(this.a).X6)) {
            Z0();
            return;
        }
        String str = this.v1;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        TL_iv.RichMessage richMessage = this.r1;
        int i7 = this.p1;
        TLRPC.InputPeer inputPeer = this.o1;
        if (richMessage != null && inputPeer != null) {
            TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
            tL_messages_translateRichMessage.flags = 1 | tL_messages_translateRichMessage.flags;
            tL_messages_translateRichMessage.peer = inputPeer;
            tL_messages_translateRichMessage.id.add(Integer.valueOf(i7));
            tL_messages_translateRichMessage.to_lang = org.telegram.messenger.a10.D(str);
            this.m1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_translateRichMessage, new f2(this, 15)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence = this.n1;
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.q1 && inputPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = inputPeer;
            tL_messages_summarizeText.id = i7;
            tL_messages_summarizeText.to_lang = org.telegram.messenger.a10.D(str);
            this.m1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_summarizeText, new d3.b(1), new bi.o6(21, this, tL_textWithEntities)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (inputPeer != null) {
            tL_messages_translateText.flags = 1 | tL_messages_translateText.flags;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.id.add(Integer.valueOf(i7));
        } else {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = org.telegram.messenger.a10.D(str);
        this.m1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_translateText, new org.telegram.ui.u7(25, this, tL_textWithEntities)));
    }

    public final void Z0() {
        CharSequence charSequence = this.n1;
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        String str = this.u1;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        String str2 = this.v1;
        if (str2 != null) {
            str2 = str2.split("_")[0];
        }
        K0(charSequence2, str, "nb".equals(str2) ? "no" : str2, new d(this, 22));
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.l4) {
            this.y1.invalidate();
            this.A1.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public void dismiss() {
        super.dismiss();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.l4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.L5);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.K5);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false);
            TextView textView = this.M1;
            if (textView != null) {
                if (x02 == this.D1) {
                    if (this.F1 != org.telegram.ui.ActionBar.m6.I.q()) {
                    }
                }
                this.D1 = x02;
                this.F1 = org.telegram.ui.ActionBar.m6.I.q();
                textView.setBackground(org.telegram.ui.ActionBar.a6.e(x02, 24.0f));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.mg, this.J0);
            if (w02 != this.E1) {
                this.E1 = w02;
                Drawable drawable = this.B1;
                if (drawable != null) {
                    drawable.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                Drawable drawable2 = this.C1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.l4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.L5);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.K5);
    }
}
