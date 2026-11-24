// default package

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class iu implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ iu(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // qac
    public final void a(Object obj) {
        Uri uri;
        Intent intent;
        BufferedReader bufferedReader;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.ChatFull M0;
        TLRPC.Document document;
        int i;
        boolean z = true;
        byte b = 0;
        int i2 = 0;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                m mVar = (m) this.c;
                Activity activity = (Activity) this.d;
                String str = (String) obj;
                if (!TextUtils.isEmpty(str) && mVar.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.trim());
                    gm.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i3 = 0;
                    for (int i4 = 0; i4 < uRLSpanArr.length; i4++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i4]), length);
                        i3 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i4]), i3);
                    }
                    oVar.i0.k(false);
                    Pattern pattern = Utilities.a;
                    try {
                        uri = Uri.parse(str);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if ((uRLSpanArr.length <= 0 || length != 0 || i3 <= 0) && (uri == null || uri.getScheme() == null)) {
                        eb.b(activity, str);
                        mw0 webView = mVar.getWebView();
                        String str2 = ku9.a().b;
                        webView.loadUrl(str2 != null ? str2 + URLEncoder.encode(str) : null);
                        break;
                    } else {
                        if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                            str = l11.x(uri, "https", null, uri.getEncodedPath(), "/");
                        }
                        mVar.getWebView().loadUrl(str);
                        break;
                    }
                }
                break;
            case 1:
                o oVar2 = (o) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                Boolean bool = (Boolean) obj;
                oc7.r1(oVar2.Y).m(str3, true);
                if (!TextUtils.isEmpty(str4) && !TextUtils.equals(str4, str3)) {
                    oc7.r1(oVar2.Y).m(str4, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.J1 = new ut(oVar2, (byte) 7);
                    break;
                } else {
                    oVar2.a0();
                    break;
                }
                break;
            case 2:
                tz tzVar = (tz) this.b;
                ((boolean[]) this.c)[0] = false;
                new o5(tzVar.getContext(), (ylb) this.d, tzVar.g2, (List) obj).show();
                break;
            case 3:
                e00 e00Var = (e00) this.b;
                boolean[] zArr = (boolean[]) this.c;
                ylb ylbVar = (ylb) this.d;
                List list = (List) obj;
                zArr[0] = false;
                if (e00Var.h2 != null) {
                    new o5(e00Var.getContext(), ylbVar, e00Var.h2, list).show();
                    e00Var.dismiss();
                    break;
                }
                break;
            case 4:
                i30 i30Var = (i30) this.b;
                he heVar = (he) this.c;
                TLRPC.Document document2 = (TLRPC.Document) this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj;
                if (inputFile == null) {
                    heVar.dismiss();
                    break;
                } else {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia.peer = oc7.r1(i30Var.a).i1(z8c.h(i30Var.a).e());
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                    tL_inputMediaUploadedDocument.file = inputFile;
                    tL_inputMediaUploadedDocument.mime_type = document2.mime_type;
                    tL_inputMediaUploadedDocument.attributes.addAll(document2.attributes);
                    ConnectionsManager.getInstance(i30Var.a).sendRequest(tL_messages_uploadMedia, new pm(i30Var, heVar, true ? (byte) 1 : (byte) 0));
                    break;
                }
            case 5:
                qw0 qw0Var = (qw0) this.b;
                String str5 = (String) this.c;
                ow0 ow0Var = (ow0) this.d;
                Boolean bool2 = (Boolean) obj;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool2.booleanValue() ? TextUtils.isEmpty(str5) ? "removed" : "updated" : "failed");
                    qw0Var.u(ow0Var, "biometry_token_updated", jSONObject);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 6:
                vh1 vh1Var = (vh1) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.c;
                qac qacVar = (qac) this.d;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj;
                vh1Var.m = tL_premium_boostsStatus.next_level_boosts <= 0;
                vh1Var.a(tL_premium_myBoosts);
                qacVar.a(vh1Var);
                break;
            case 7:
                yv1 yv1Var = (yv1) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str6 = (String) this.d;
                Boolean bool3 = (Boolean) obj;
                if (yv1Var.getParentActivity() != null) {
                    if (bool3.booleanValue()) {
                        intent = new Intent("android.intent.action.INSERT");
                        intent.setType("vnd.android.cursor.dir/raw_contact");
                    } else {
                        intent = new Intent("android.intent.action.INSERT_OR_EDIT");
                        intent.setType("vnd.android.cursor.item/contact");
                    }
                    Intent intent2 = intent;
                    if (user != null) {
                        intent2.putExtra("name", bw2.m(0, user.first_name, user.last_name));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                    if (!str6.startsWith("+")) {
                        TLRPC.User f = yv1Var.getUserConfig().f();
                        HashMap hashMap = new HashMap();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(a.b.getResources().getAssets().open("countries.txt")));
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                        }
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                String[] split = readLine.split(";");
                                wy2 wy2Var = new wy2();
                                wy2Var.a = split[2];
                                String str7 = split[0];
                                wy2Var.c = str7;
                                wy2Var.d = split[1];
                                List list2 = (List) hashMap.get(str7);
                                if (list2 == null) {
                                    String str8 = split[0];
                                    ArrayList arrayList3 = new ArrayList();
                                    hashMap.put(str8, arrayList3);
                                    list2 = arrayList3;
                                }
                                list2.add(wy2Var);
                            } else {
                                bufferedReader.close();
                                String str9 = f.phone;
                                int i5 = 4;
                                while (true) {
                                    if (i5 >= 1) {
                                        List list3 = (List) hashMap.get(str9.substring(0, i5));
                                        if (list3 == null || list3.size() <= 0) {
                                            i5--;
                                        } else {
                                            String str10 = ((wy2) list3.get(0)).c;
                                            if (str10.endsWith("0") && str6.startsWith("0")) {
                                                str6 = str6.substring(1);
                                            }
                                            str6 = kt6.o("+", str10, str6);
                                            b = 1;
                                        }
                                    }
                                }
                                if (b == 0) {
                                    Context context = a.b;
                                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                                    if (upperCase.endsWith("0") && str6.startsWith("0")) {
                                        str6 = str6.substring(1);
                                    }
                                    str6 = kt6.o("+", upperCase, str6);
                                }
                            }
                        }
                    }
                    contentValues.put("data1", str6);
                    contentValues.put("data2", (Integer) 2);
                    arrayList2.add(contentValues);
                    intent2.putExtra("finishActivityOnSaveCompleted", true);
                    intent2.putParcelableArrayListExtra("data", arrayList2);
                    yv1Var.getParentActivity().startActivity(intent2);
                    break;
                }
                break;
            case 8:
                yv1 yv1Var2 = (yv1) this.b;
                f47 f47Var = (f47) this.c;
                k47 k47Var = (k47) this.d;
                Long l = (Long) obj;
                if (f47Var != null) {
                    ArrayList arrayList4 = f47Var.d;
                    int i6 = 0;
                    while (i6 < arrayList4.size()) {
                        if (!yv1Var2.getSendMessagesHelper().j0(l.longValue(), (k47) arrayList4.get(i6), false)) {
                            z = false;
                        }
                        i6++;
                        z = z;
                    }
                    if (z && yv1Var2.g4 == 0) {
                        yv1Var2.da(false);
                        break;
                    }
                } else if (yv1Var2.getSendMessagesHelper().j0(l.longValue(), k47Var, false)) {
                    yv1Var2.Gd(false);
                    if (yv1Var2.g4 == 0) {
                        yv1Var2.da(false);
                        break;
                    }
                }
                break;
            case 9:
                ((yv1) this.b).j9((TLRPC.TL_attachMenuBot) this.d, (TLRPC.User) this.c);
                break;
            case 10:
                iv1 iv1Var = (iv1) this.b;
                k47 k47Var2 = (k47) this.c;
                tu1 tu1Var = (tu1) this.d;
                if (((Boolean) obj).booleanValue()) {
                    yv1 yv1Var3 = iv1Var.a;
                    int D0 = k47Var2.D0();
                    TLRPC.MessageMedia n1 = k47.n1(k47Var2.k);
                    if (n1 instanceof TLRPC.TL_messageMediaDice) {
                        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) n1).game_outcome;
                    }
                    x0 x0Var = new x0(iv1Var, k47Var2, (byte) 26);
                    int i7 = woa.Y1;
                    TLRPC.EmojiGameInfo emojiGameInfo = oc7.r1(yv1Var3.getCurrentAccount()).m5;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        b31 b31Var = new b31(yv1Var3.getContext(), yv1Var3.getResourceProvider());
                        b31Var.a.setScaleX(1.25f);
                        b31Var.a.setScaleY(1.25f);
                        if (D0 == 1) {
                            b31Var.a.setImageResource(R.drawable.dice1);
                        } else if (D0 == 2) {
                            b31Var.a.setImageResource(R.drawable.dice2);
                        } else {
                            s09 s09Var = b31Var.a;
                            if (D0 == 3) {
                                s09Var.setImageResource(R.drawable.dice3);
                            } else if (D0 == 4) {
                                s09Var.setImageResource(R.drawable.dice4);
                            } else if (D0 == 5) {
                                s09Var.setImageResource(R.drawable.dice5);
                            } else if (D0 == 6) {
                                s09Var.setImageResource(R.drawable.dice6);
                            } else {
                                s09Var.setScaleX(0.8f);
                                b31Var.a.setScaleY(0.8f);
                                b31Var.a.setImageDrawable(gw3.f("🎲"));
                            }
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.M0(2131744925, null));
                        spannableStringBuilder2.append((CharSequence) nxa.K0(j));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) y51.b(jb6.M0(2131744923, null), new e6a((Object) yv1Var3, (Object) x0Var, (byte) 12), yv1Var3.getResourceProvider(), null));
                        gm.B2(b31Var.b);
                        x51 x51Var = new x51(yv1Var3.getContext());
                        b31Var.b = x51Var;
                        x51Var.setSingleLine();
                        b31Var.b.setTypeface(Typeface.SANS_SERIF);
                        b31Var.b.setTextSize(1, 15.0f);
                        b31Var.b.setEllipsize(TextUtils.TruncateAt.END);
                        b31Var.b.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
                        b31Var.addView(b31Var.b, qoe.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        b31Var.b.setText(nxa.S0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        anb.G(b31Var.b, cmb.wj, yv1Var3.getResourceProvider());
                        b31Var.setTextColor(cmb.v0(cmb.xj, yv1Var3.getResourceProvider()));
                        b31Var.b.setSingleLine(false);
                        b31Var.b.setMaxLines(2);
                        s31 s31Var = new s31(yv1Var3.getResourceProvider(), yv1Var3.getContext(), true);
                        s31Var.e(jb6.M0(2131744924, null));
                        s31Var.b = new toa(x0Var, j, b);
                        b31Var.setButton(s31Var);
                        c41.b0(yv1Var3).b(b31Var, 2750).j();
                        break;
                    }
                } else {
                    tu1Var.run();
                    break;
                }
                break;
            case 11:
                iv1 iv1Var2 = (iv1) this.b;
                he heVar2 = (he) this.c;
                rc2 rc2Var = (rc2) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                heVar2.b(200L);
                boolean z2 = iv1Var2.a.getMessagesController().l4.l.f && !TextUtils.isEmpty(iv1Var2.a.getMessagesController().l4.P2.f);
                boolean z3 = (contentsettings == null || !contentsettings.sensitive_can_change) && z2;
                boolean[] zArr2 = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(iv1Var2.a.getParentActivity());
                byte b2 = 9;
                if (z2) {
                    zArr2[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    oh2 oh2Var = new oh2(1, iv1Var2.a.getResourceProvider(), iv1Var2.a.getParentActivity());
                    oh2Var.setBackground(cmb.L0(false));
                    oh2Var.e(jb6.M0(2131748239, null), "", zArr2[0], false, false);
                    oh2Var.setPadding(jb6.a0 ? gm.L(16.0f) : gm.L(8.0f), 0, jb6.a0 ? gm.L(8.0f) : gm.L(16.0f), 0);
                    frameLayout.addView(oh2Var, qoe.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    oh2Var.setOnClickListener(new gf(zArr2, b2));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, iv1Var2.a.getResourceProvider(), iv1Var2.a.getParentActivity());
                alertDialog$Builder.a.S = jb6.M0(2131748230, null);
                alertDialog$Builder.a.U = jb6.M0(z3 ? 2131748232 : 2131748233, null);
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.a.H = (byte) 9;
                alertDialog$Builder.g(jb6.M0(z3 ? 2131748231 : 2131752542, null), null);
                if (!z3) {
                    alertDialog$Builder.j(jb6.M0(2131748238, null), new og(iv1Var2, rc2Var, zArr2, z2, contentsettings));
                }
                iv1Var2.a.showDialog(alertDialog$Builder.a);
                break;
            case 12:
                v72 v72Var = (v72) this.b;
                yv1 yv1Var4 = (yv1) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                Long l2 = (Long) obj;
                if (yv1Var4.X7()) {
                    ik.I(yv1Var4.getParentActivity(), yv1Var4.a(), new jf((Object) v72Var, (Object) tL_messageMediaToDo, (Object) l2, (byte) 24));
                    break;
                } else {
                    v72Var.k0.a(tL_messageMediaToDo, null, null, null, true, 0, l2.longValue());
                    v72Var.b.a(true);
                    break;
                }
            case 13:
                ((nk3) this.b).c4((TLRPC.TL_attachMenuBot) this.c, (LaunchActivity) this.d);
                break;
            case 14:
                nk3 nk3Var = (nk3) this.b;
                he heVar3 = (he) this.c;
                Long l3 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                heVar3.q(150L);
                Boolean bool4 = nk3Var.H.bot_participant;
                if (bool4 == null || !bool4.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    nk3Var.getMessagesController().k(l3.longValue(), nk3Var.getMessagesController().W1(Long.valueOf(nk3Var.I)), null, nk3Var, false, runnable, new cf(runnable, (byte) 11));
                    break;
                }
            case 15:
                d24 d24Var = (d24) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                Runnable runnable2 = (Runnable) this.d;
                ArrayList arrayList6 = (ArrayList) obj;
                int size = arrayList6.size();
                while (i2 < size) {
                    Object obj2 = arrayList6.get(i2);
                    i2++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet m0 = hs6.d0(d24Var.a.G.d1).m0(hs6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        arrayList = m0 != null ? m0.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList5.add(new x14(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 16:
                e94 e94Var = (e94) this.b;
                d94 d94Var = (d94) this.c;
                k47 k47Var3 = (k47) this.d;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) obj;
                e94Var.b.put(d94Var.b, tL_factCheck);
                k47Var3.k.factcheck = tL_factCheck;
                break;
            case 17:
                Utilities.d.c(new xo1((ad4) this.b, (String) this.c, (String) this.d, (s3b) obj, (byte) 19));
                break;
            case 18:
                c cVar = (c) this.b;
                jac jacVar = (jac) this.c;
                String str11 = (String) this.d;
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    jacVar.a(null, null);
                    break;
                } else {
                    TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                    walletuseraddress.user_id = 0L;
                    walletuseraddress.address = str11;
                    walletuseraddress.public_key = bArr;
                    cVar.P.put(str11, walletuseraddress);
                    jacVar.a(walletuseraddress, null);
                    break;
                }
            case 19:
                c cVar2 = (c) this.b;
                qac qacVar2 = (qac) this.c;
                Runnable runnable3 = (Runnable) this.d;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                cVar2.q.put(wallettransaction, qacVar2);
                cVar2.r.put(wallettransaction, runnable3);
                break;
            case 20:
                w45 w45Var = (w45) this.b;
                s45 s45Var = (s45) this.c;
                d82 d82Var = (d82) this.d;
                String str12 = (String) obj;
                w45Var.getClass();
                s45Var.p = !s45Var.n && !w45Var.i(s45Var) && w45Var.A(s45Var) && str12 == null;
                d82Var.a(null, str12);
                break;
            case 21:
                w45 w45Var2 = (w45) this.b;
                s45 s45Var2 = (s45) this.c;
                qac qacVar3 = (qac) this.d;
                String str13 = (String) obj;
                s45Var2.m = false;
                if (s45Var2.r == null && w45Var2.g == s45Var2) {
                    w45Var2.g = null;
                }
                qacVar3.a(str13);
                break;
            case 22:
                w45 w45Var3 = (w45) this.b;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                h72 h72Var = (h72) this.d;
                w45Var3.getClass();
                gm.c3(new xo1(w45Var3, tonconnectsession, (String) obj, h72Var, (byte) 25));
                break;
            case 23:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                k11 k11Var = (k11) this.c;
                int[] iArr = (int[]) this.d;
                Long l4 = (Long) obj;
                String str14 = LaunchActivity.C1;
                if (k11Var != null) {
                    k11Var.b();
                }
                if ((l4 != null ? oc7.r1(launchActivity.P).a2(l4.longValue()) : null) != null) {
                    new ux4(launchActivity, iArr[0], l4.longValue(), null, null).show();
                    break;
                } else {
                    d Q = LaunchActivity.Q();
                    if (Q != null && (Q instanceof yv1)) {
                        ((yv1) Q).Pb();
                        break;
                    }
                }
                break;
            case 24:
                i46 i46Var = (i46) this.b;
                fa6 fa6Var = (fa6) this.c;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                fa6Var.setLoading(false);
                if (tL_premium_boostsStatus2 != null) {
                    i46Var.W1.boosts++;
                    if (i46Var.c2 == 32 && (M0 = oc7.r1(i46Var.a).M0(-i46Var.V1)) != null) {
                        M0.boosts_applied++;
                    }
                    i46Var.k1();
                    i46Var.q1(tL_premium_boostsStatus2, i46Var.Z1);
                    vh1 vh1Var2 = i46Var.X1;
                    vh1Var2.m = i46Var.W1.next_level_boosts <= 0;
                    vh1Var2.l = true;
                    vh1Var2.a(tL_premium_myBoosts2);
                    i46Var.m1();
                    break;
                }
                break;
            case 25:
                a66 a66Var = (a66) this.b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.c;
                d65 d65Var = (d65) this.d;
                Long l5 = (Long) obj;
                TLRPC.User W1 = l5 == null ? null : oc7.r1(a66Var.b).W1(l5);
                userArr[0] = W1;
                if (W1 == null) {
                    a66Var.c();
                    mlb.y(null, 2131747868, a66.d(), null);
                    break;
                } else {
                    d65Var.run();
                    break;
                }
            case 26:
                String str15 = (String) this.b;
                bf0 bf0Var = (bf0) this.c;
                String str16 = (String) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null) {
                    ArrayList j2 = gw3.j(str15, null);
                    for (int i8 = 0; i8 < j2.size(); i8++) {
                        ((ew3) j2.get(i8)).c = gw3.c(((ew3) j2.get(i8)).c.toString());
                    }
                    int i9 = 0;
                    while (true) {
                        if (i9 < tL_messages_stickerSet.documents.size()) {
                            document = tL_messages_stickerSet.documents.get(i9);
                            int size2 = j2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj3 = j2.get(i10);
                                i10++;
                                ew3 ew3Var = (ew3) obj3;
                                for (0; i < tL_messages_stickerSet.packs.size(); i + 1) {
                                    i = (tL_messages_stickerSet.packs.get(i).documents.contains(Long.valueOf(document.id)) && TextUtils.equals(gw3.c(tL_messages_stickerSet.packs.get(i).emoticon), ew3Var.c)) ? 0 : i + 1;
                                }
                            }
                        } else {
                            document = null;
                        }
                        i9++;
                    }
                    if (document != null) {
                        bf0Var.p(gn5.b(document), str16, eq3.f(document, cmb.l6, 0.2f, null), document);
                        bf0Var.invalidate();
                        break;
                    }
                }
                break;
            case 27:
                boolean[] zArr3 = (boolean[]) this.b;
                ArrayList[] arrayListArr = (ArrayList[]) this.c;
                zq6 zq6Var = (zq6) this.d;
                ArrayList arrayList7 = (ArrayList) obj;
                if (!zArr3[0]) {
                    arrayListArr[0] = arrayList7;
                    zq6Var.run();
                    zArr3[0] = true;
                    break;
                }
                break;
            case 28:
                boolean[] zArr4 = (boolean[]) this.b;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.c;
                g97 g97Var = (g97) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!zArr4[0]) {
                    if (userFull != null) {
                        botInfoArr[0] = userFull.bot_info;
                    }
                    gm.c3(g97Var);
                    break;
                }
                break;
            default:
                fs7.s((TL_stars.TL_starGiftUnique) this.b, jb6.a0(null, null, !((Boolean) obj).booleanValue() ? 2131749569 : ((Boolean) this.c).booleanValue() ? 2131749566 : 2131749567, (String) this.d));
                break;
        }
    }
}
