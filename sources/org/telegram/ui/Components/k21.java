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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class k21 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public static final String[] O1 = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap P1;
    public int A1;
    public boolean B1;
    public boolean C1;
    public final w11 D1;
    public final j21 E1;
    public final org.telegram.ui.Cells.i9 F1;
    public final org.telegram.ui.Cells.u9 G1;
    public final View H1;
    public final TextView I1;
    public org.telegram.ui.ActionBar.f2 J1;
    public org.telegram.messenger.d20 K1;
    public boolean L1;
    public final w5 M1;
    public Boolean N1;
    public Integer i1;
    public final CharSequence j1;
    public final TLRPC.InputPeer k1;
    public final int l1;
    public final boolean m1;
    public final TL_iv.RichMessage n1;
    public final org.telegram.messenger.au o1;
    public final org.telegram.messenger.au p1;
    public final String q1;
    public String r1;
    public String s1;
    public final i21 t1;
    public final ei.k u1;
    public final v11 v1;
    public final w70 w1;
    public final Drawable x1;
    public final Drawable y1;
    public int z1;

    public k21(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i7, boolean z9, TL_iv.RichMessage richMessage) {
        super(1, context, (org.telegram.ui.ActionBar.f6) null, false);
        this.B1 = org.telegram.ui.ActionBar.k6.I.q();
        this.L1 = true;
        this.t0 = 0;
        N();
        this.j1 = charSequence;
        this.k1 = inputPeer;
        this.l1 = i7;
        this.m1 = z9;
        this.n1 = richMessage;
        this.q1 = str;
        this.r1 = str2;
        e21 e21Var = new e21(this, context);
        this.b = e21Var;
        this.M1 = new w5(e21Var, 320L, xq.h);
        ei.k kVar = new ei.k(context, 7);
        this.u1 = kVar;
        kVar.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
        kVar.setTextSize(1, org.telegram.messenger.iz.W0);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(kVar, i10, null);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.2f, i10);
        org.telegram.ui.ActionBar.r6.o(kVar, 2, L.a, -1, 2, L.d, null);
        kVar.setText(org.telegram.messenger.i6.m(charSequence == null ? "" : charSequence.toString(), kVar.getPaint().getFontMetricsInt(), true, null, 0));
        this.v1 = new v11(context);
        w70 w70Var = new w70(context, null);
        this.w1 = w70Var;
        w70Var.setDisablePaddingsOffsetY(true);
        w70Var.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
        w70Var.setTextSize(1, org.telegram.messenger.iz.W0);
        org.telegram.ui.ActionBar.r6.V(w70Var, i10, null);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, null);
        w70Var.setTextIsSelectable(true);
        org.telegram.ui.ActionBar.r6.D(w70Var, org.telegram.ui.ActionBar.k6.ig, null);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.jg, this.I0);
        this.A1 = w02;
        try {
            if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.as.i()) {
                Drawable textSelectHandleLeft = w70Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(w02, mode);
                w70Var.setTextSelectHandleLeft(textSelectHandleLeft);
                this.x1 = textSelectHandleLeft;
                Drawable textSelectHandleRight = w70Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(w02, mode);
                w70Var.setTextSelectHandleRight(textSelectHandleRight);
                this.y1 = textSelectHandleRight;
            }
        } catch (Exception unused) {
        }
        this.v1.addView(this.w1, c8.ha.c(-1.0f, -1));
        if (this.n1 != null) {
            org.telegram.messenger.au auVar = new org.telegram.messenger.au(this.a, context, null);
            this.o1 = auVar;
            auVar.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
            auVar.set(this.n1);
            auVar.setTranslationLoading(true);
            org.telegram.messenger.au auVar2 = new org.telegram.messenger.au(this.a, context, null);
            this.p1 = auVar2;
            auVar2.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
        }
        w11 w11Var = new w11(this, context);
        this.D1 = w11Var;
        w11Var.setOverScrollMode(1);
        w11Var.setPadding(0, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, 0, org.telegram.messenger.g0.L(80.0f));
        w11Var.setClipToPadding(true);
        v4.b0 b0Var = new v4.b0();
        w11Var.setLayoutManager(b0Var);
        View view = this.n1 != null ? this.o1 : this.u1;
        j21 j21Var = new j21();
        j21Var.e = 1;
        j21Var.c = context;
        j21Var.d = view;
        this.E1 = j21Var;
        w11Var.setAdapter(j21Var);
        w11Var.setOnScrollListener(new x11(this));
        y11 y11Var = new y11(this);
        y11Var.n(180L);
        y11Var.o(new LinearInterpolator());
        w11Var.setItemAnimator(y11Var);
        this.b.addView(w11Var, c8.ha.e(-1, -2, 80));
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9();
        this.F1 = i9Var;
        i9Var.S(w11Var);
        i9Var.z0 = b0Var;
        org.telegram.ui.Cells.u9 n10 = i9Var.n(context);
        this.G1 = n10;
        org.telegram.messenger.g0.E2(n10);
        this.b.addView(n10, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        org.telegram.messenger.au auVar3 = this.p1;
        if (auVar3 != null) {
            auVar3.setTextSelectionHelper(i9Var);
        }
        i21 i21Var = new i21(this, context);
        this.t1 = i21Var;
        this.b.addView(i21Var, c8.ha.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout, null);
        View view2 = new View(context);
        this.H1 = view2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view2, null);
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, c8.ha.a(-1.0f, org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.N(1.0f), 55));
        TextView textView = new TextView(context);
        this.I1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(org.telegram.messenger.id.M0(2131752037, null));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        this.z1 = x02;
        textView.setBackground(org.telegram.ui.ActionBar.z5.e(x02, 24.0f));
        textView.setOnClickListener(new la0(this, 19));
        frameLayout.addView(textView, c8.ha.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.b.addView(frameLayout, c8.ha.e(-1, -2, 87));
        W0();
    }

    public static boolean I0(k21 k21Var) {
        w11 w11Var = k21Var.D1;
        float f10 = 0.0f;
        for (int i7 = 0; i7 < w11Var.getChildCount(); i7++) {
            if (RecyclerView.R(w11Var.getChildAt(i7)) == 1) {
                f10 += r3.getHeight();
            }
        }
        return f10 >= ((float) ((w11Var.getHeight() - w11Var.getPaddingTop()) - w11Var.getPaddingBottom()));
    }

    public static void J0(String str, String str2, String str3, org.telegram.messenger.v10 v10Var) {
        if (str2 == null) {
            org.telegram.messenger.b6.d(str, new u11(str, str3, v10Var), new u11(str, str3, v10Var), false);
            return;
        }
        String encode = Uri.encode(str);
        if (encode.length() <= 5000) {
            new a21(str2, str3, encode, v10Var).start();
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
            org.telegram.messenger.v10 v10Var2 = v10Var;
            new a21(str2, str3, (String) arrayList.get(i12), new bi.v0(zArr, arrayList2, i12, v10Var2, 7)).start();
            i12++;
            v10Var = v10Var2;
        }
    }

    public static String K0(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String M0() {
        return org.telegram.messenger.qp.e1().getString("translate_to_language", org.telegram.messenger.id.E0().y.getLanguage());
    }

    public static HashMap N0(CharSequence charSequence) {
        HashMap hashMap = new HashMap();
        if (charSequence != null) {
            ArrayList j3 = org.telegram.messenger.i6.j(charSequence, null);
            String charSequence2 = charSequence.toString();
            for (int i7 = 0; i7 < j3.size(); i7++) {
                org.telegram.messenger.g6 g6Var = (org.telegram.messenger.g6) j3.get(i7);
                if (g6Var != null && g6Var.c != null) {
                    String substring = charSequence2.substring(g6Var.a, g6Var.b);
                    ArrayList arrayList = (ArrayList) hashMap.get(substring);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(substring, arrayList);
                    }
                    arrayList.add(g6Var);
                }
            }
        }
        return hashMap;
    }

    public static String O0(String str, boolean[] zArr, boolean[] zArr2) {
        org.telegram.messenger.fd fdVar;
        String str2;
        if (str == null || str.equals("und") || str.equals("auto")) {
            return null;
        }
        String str3 = str.split("_")[0];
        if ("nb".equals(str3)) {
            str3 = "no";
        }
        if (zArr != null) {
            String N0 = org.telegram.messenger.id.N0("TranslateLanguage" + str3.toUpperCase());
            boolean z9 = (N0 == null || N0.startsWith("LOC_ERR")) ? false : true;
            zArr[0] = z9;
            if (z9) {
                return N0;
            }
        }
        if (zArr2 != null) {
            String N02 = org.telegram.messenger.id.N0("TranslateLanguageGenitive" + str3.toUpperCase());
            boolean z10 = (N02 == null || N02.startsWith("LOC_ERR")) ? false : true;
            zArr2[0] = z10;
            if (z10) {
                return N02;
            }
        }
        String V0 = V0(str, false);
        if (V0 == null) {
            V0 = V0(str3, false);
        }
        if (V0 != null) {
            return V0;
        }
        if ("no".equals(str)) {
            str = "nb";
        }
        org.telegram.messenger.fd fdVar2 = org.telegram.messenger.id.E0().B;
        Iterator it = org.telegram.messenger.id.E0().N.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                fdVar = null;
                break;
            }
            fdVar = (org.telegram.messenger.fd) it.next();
            String str4 = fdVar.d;
            if (str4 != null && str4.equals("remote") && ((str2 = fdVar.c) == null || !str2.endsWith("_raw"))) {
                String str5 = fdVar.f;
                if (str5 != null && str5.equals(str)) {
                    break;
                }
            }
        }
        if (fdVar == null) {
            return null;
        }
        return (fdVar2 == null || !"en".equals(fdVar2.f)) ? fdVar.a : fdVar.b;
    }

    public static TLRPC.TL_textWithEntities P0(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2) {
        org.telegram.messenger.g6 g6Var;
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
            HashMap N0 = N0(tL_textWithEntities.text);
            HashMap N02 = N0(tL_textWithEntities2.text);
            for (int i11 = 0; i11 < tL_textWithEntities.entities.size(); i11++) {
                TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i11);
                if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    String str2 = tL_textWithEntities.text;
                    int i12 = messageEntity2.offset;
                    String substring2 = str2.substring(i12, messageEntity2.length + i12);
                    if (!TextUtils.isEmpty(substring2)) {
                        ArrayList arrayList2 = (ArrayList) N0.get(substring2);
                        ArrayList arrayList3 = (ArrayList) N02.get(substring2);
                        if (arrayList2 != null && arrayList3 != null) {
                            int i13 = 0;
                            while (true) {
                                if (i13 >= arrayList2.size()) {
                                    i13 = -1;
                                    break;
                                }
                                org.telegram.messenger.g6 g6Var2 = (org.telegram.messenger.g6) arrayList2.get(i13);
                                int i14 = g6Var2.a;
                                int i15 = messageEntity2.offset;
                                if (i14 == i15 && g6Var2.b == i15 + messageEntity2.length) {
                                    break;
                                }
                                i13++;
                            }
                            if (i13 >= 0 && i13 < arrayList3.size() && (g6Var = (org.telegram.messenger.g6) arrayList3.get(i13)) != null) {
                                int i16 = g6Var.b;
                                int i17 = g6Var.a;
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

    public static void S0(String str) {
        org.telegram.messenger.qp.e1().edit().putString("translate_to_language", str).apply();
    }

    public static b21 T0(Activity activity, org.telegram.ui.an anVar, TLRPC.InputPeer inputPeer, int i7, boolean z9, String str, String str2, CharSequence charSequence, boolean z10, org.telegram.ui.ef efVar, Runnable runnable) {
        b21 b21Var = new b21(activity, str, str2, charSequence, inputPeer, i7, z9, runnable);
        b21Var.R0(z10);
        b21Var.J1 = anVar;
        b21Var.K1 = efVar;
        if (anVar.getParentActivity() != null) {
            anVar.showDialog(b21Var);
        }
        return b21Var;
    }

    public static void U0(Context context, org.telegram.ui.ActionBar.f2 f2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.j00 j00Var, org.telegram.ui.Cells.f fVar) {
        if (context == null) {
            return;
        }
        d21 d21Var = new d21(context, str, str2, charSequence, fVar);
        d21Var.R0(false);
        d21Var.J1 = f2Var;
        d21Var.K1 = j00Var;
        if (f2Var == null) {
            d21Var.show();
        } else if (f2Var.getParentActivity() != null) {
            f2Var.showDialog(d21Var);
        }
    }

    public static String V0(String str, boolean z9) {
        if (str == null) {
            return null;
        }
        if (P1 == null) {
            P1 = new HashMap();
            try {
                Locale[] availableLocales = Locale.getAvailableLocales();
                for (int i7 = 0; i7 < availableLocales.length; i7++) {
                    P1.put(availableLocales[i7].getLanguage(), availableLocales[i7]);
                    String country = availableLocales[i7].getCountry();
                    if (country != null && country.length() > 0) {
                        P1.put(availableLocales[i7].getLanguage() + "-" + country.toLowerCase(), availableLocales[i7]);
                    }
                }
            } catch (Exception unused) {
            }
        }
        String lowerCase = str.replace("_", "-").toLowerCase();
        try {
            Locale locale = (Locale) P1.get(lowerCase);
            if (locale == null) {
                return null;
            }
            String displayLanguage = locale.getDisplayLanguage(z9 ? locale : Locale.getDefault());
            if (!lowerCase.contains("-")) {
                return displayLanguage;
            }
            String displayCountry = locale.getDisplayCountry(z9 ? locale : Locale.getDefault());
            if (TextUtils.isEmpty(displayCountry)) {
                return displayLanguage;
            }
            return displayLanguage + " (" + displayCountry + ")";
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        if (this.i1 != null) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.i1.intValue(), true);
            this.i1 = null;
        }
        super.K();
    }

    public final float L0(boolean z9) {
        w5 w5Var;
        w11 w11Var = this.D1;
        float top = w11Var.getTop();
        if (w11Var.getChildCount() >= 1) {
            top += Math.max(0, w11Var.getChildAt(w11Var.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - org.telegram.messenger.g0.L(78.0f));
        if (z9 && (w5Var = this.M1) != null) {
            if (!w11Var.I1 && !this.C1) {
                return w5Var.e(false, max);
            }
            w5Var.e(true, max);
        }
        return max;
    }

    public final CharSequence Q0(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.K1 != null || this.J1 != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(8, this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return org.telegram.messenger.i6.m(spannableStringBuilder, this.w1.getPaint().getFontMetricsInt(), true, null, 0);
    }

    public final void R0(boolean z9) {
        w70 w70Var = this.w1;
        if (w70Var != null) {
            w70Var.setTextIsSelectable(!z9);
        }
        if (z9) {
            getWindow().addFlags(TLObject.FLAG_13);
            org.telegram.messenger.g0.h2();
        } else {
            getWindow().clearFlags(TLObject.FLAG_13);
            org.telegram.messenger.g0.h2();
        }
    }

    public final void W0() {
        if (this.i1 != null) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.i1.intValue(), true);
            this.i1 = null;
        }
        if ("alternative".equalsIgnoreCase(org.telegram.messenger.qp.s1(this.a).U6)) {
            X0();
            return;
        }
        String str = this.r1;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        TL_iv.RichMessage richMessage = this.n1;
        int i7 = this.l1;
        TLRPC.InputPeer inputPeer = this.k1;
        if (richMessage != null && inputPeer != null) {
            TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
            tL_messages_translateRichMessage.flags = 1 | tL_messages_translateRichMessage.flags;
            tL_messages_translateRichMessage.peer = inputPeer;
            tL_messages_translateRichMessage.id.add(Integer.valueOf(i7));
            tL_messages_translateRichMessage.to_lang = org.telegram.messenger.f10.D(str);
            this.i1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_translateRichMessage, new x1(this, 15)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence = this.j1;
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.m1 && inputPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = inputPeer;
            tL_messages_summarizeText.id = i7;
            tL_messages_summarizeText.to_lang = org.telegram.messenger.f10.D(str);
            this.i1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_summarizeText, new d3.b(1), new bi.p5(16, this, tL_textWithEntities)));
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
        tL_messages_translateText.to_lang = org.telegram.messenger.f10.D(str);
        this.i1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_translateText, new org.telegram.ui.ld(23, this, tL_textWithEntities)));
    }

    public final void X0() {
        CharSequence charSequence = this.j1;
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        String str = this.q1;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        String str2 = this.r1;
        if (str2 != null) {
            str2 = str2.split("_")[0];
        }
        J0(charSequence2, str, "nb".equals(str2) ? "no" : str2, new d(this, 21));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.i4) {
            this.u1.invalidate();
            this.w1.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.I5);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.H5);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
            TextView textView = this.I1;
            if (textView != null) {
                if (x02 == this.z1) {
                    if (this.B1 != org.telegram.ui.ActionBar.k6.I.q()) {
                    }
                }
                this.z1 = x02;
                this.B1 = org.telegram.ui.ActionBar.k6.I.q();
                textView.setBackground(org.telegram.ui.ActionBar.z5.e(x02, 24.0f));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.jg, this.I0);
            if (w02 != this.A1) {
                this.A1 = w02;
                Drawable drawable = this.x1;
                if (drawable != null) {
                    drawable.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                Drawable drawable2 = this.y1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.I5);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.H5);
    }
}
