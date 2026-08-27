package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String sb2;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        int i10 = this.a;
        int i11 = 9;
        int i12 = 3;
        int i13 = 0;
        boolean z10 = true;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                m4 m4Var = (m4) obj4;
                q3 q3Var = (q3) obj3;
                Activity activity = (Activity) obj2;
                String str = (String) obj;
                if (!TextUtils.isEmpty(str) && q3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i14 = 0;
                    for (int i15 = 0; i15 < uRLSpanArr.length; i15++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i15]), length);
                        i14 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i15]), i14);
                    }
                    m4Var.d0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str);
                    if ((uRLSpanArr.length <= 0 || length != 0 || i14 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                        org.telegram.ui.web.l.b(activity, str);
                        org.telegram.ui.web.w0 webView = q3Var.getWebView();
                        String str2 = org.telegram.ui.web.k1.a().b;
                        if (str2 == null) {
                            sb2 = null;
                        } else {
                            StringBuilder o10 = com.google.android.recaptcha.internal.a.o(str2);
                            o10.append(URLEncoder.encode(str));
                            sb2 = o10.toString();
                        }
                        webView.loadUrl(sb2);
                        break;
                    } else {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str = we.e.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        q3Var.getWebView().loadUrl(str);
                        break;
                    }
                }
                break;
            case 1:
                m4 m4Var2 = (m4) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                Boolean bool = (Boolean) obj;
                MessagesController.getInstance(m4Var2.T).addWebBrowserException(str3, true);
                if (!TextUtils.isEmpty(str4) && !TextUtils.equals(str4, str3)) {
                    MessagesController.getInstance(m4Var2.T).addWebBrowserException(str4, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.E1 = new d0(m4Var2, 8);
                    break;
                } else {
                    m4Var2.c0();
                    break;
                }
            case 2:
                rn.d1((rn) obj4, (TLRPC.User) obj3, (String) obj2, (Boolean) obj);
                break;
            case 3:
                rn rnVar = (rn) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                Long l10 = (Long) obj;
                if (groupedMessages != null) {
                    rnVar.getClass();
                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                        if (!rnVar.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i16), false, l10.longValue())) {
                            z10 = false;
                        }
                    }
                    if (z10 && rnVar.N3 == 0) {
                        rnVar.O9(false);
                        break;
                    }
                } else if (rnVar.getSendMessagesHelper().retrySendMessage(messageObject, false, l10.longValue())) {
                    rnVar.Wc(false);
                    if (rnVar.N3 == 0) {
                        rnVar.O9(false);
                        break;
                    }
                }
                break;
            case 4:
                dn dnVar = (dn) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                pm pmVar = (pm) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    pmVar.run();
                    break;
                } else {
                    rn rnVar2 = dnVar.a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    df dfVar = new df(7, dnVar, messageObject2);
                    int i17 = i81.Z;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(rnVar2.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j10 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(rnVar2.getContext(), rnVar2.getResourceProvider());
                        org.telegram.ui.Components.ri0 ri0Var = mbVar.a;
                        ri0Var.setScaleX(1.25f);
                        ri0Var.setScaleY(1.25f);
                        if (diceValue == 1) {
                            ri0Var.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            ri0Var.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            ri0Var.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            ri0Var.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            ri0Var.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            ri0Var.setImageResource(R.drawable.dice6);
                        } else {
                            ri0Var.setScaleX(0.8f);
                            ri0Var.setScaleY(0.8f);
                            ri0Var.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) hh.oa.M0(j10));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.pc.b(LocaleController.getString(R.string.StakeDiceToastChange), new m21(i11, rnVar2, dfVar), rnVar2.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(mbVar.b);
                        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(rnVar2.getContext(), null);
                        mbVar.b = ocVar;
                        ocVar.setSingleLine();
                        mbVar.b.setTypeface(Typeface.SANS_SERIF);
                        mbVar.b.setTextSize(1, 15.0f);
                        mbVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        mbVar.b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        mbVar.addView(mbVar.b, h7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        mbVar.b.setText(hh.oa.P0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        mbVar.b.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, rnVar2.getResourceProvider()));
                        mbVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hi, rnVar2.getResourceProvider()));
                        mbVar.b.setSingleLine(false);
                        mbVar.b.setMaxLines(2);
                        org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(rnVar2.getContext(), rnVar2.getResourceProvider(), true);
                        ccVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        ccVar.a = new cg.b2(dfVar, j10, 29);
                        mbVar.setButton(ccVar);
                        org.telegram.ui.Components.mc.a0(rnVar2).b(mbVar, 2750).j();
                        break;
                    }
                }
                break;
            case 5:
                dn dnVar2 = (dn) obj4;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj2;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((org.telegram.ui.ActionBar.b2) obj3).c(200L);
                rn rnVar3 = dnVar2.a;
                boolean z11 = rnVar3.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(rnVar3.getMessagesController().verifyAgeBotUsername);
                boolean z12 = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                boolean z13 = z11;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(rnVar3.getParentActivity());
                if (z13) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(rnVar3.getParentActivity(), 1, rnVar3.getResourceProvider());
                    y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    y1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                    y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    frameLayout.addView(y1Var, h7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    y1Var.setOnClickListener(new m8(i12, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar3.getParentActivity(), 0, rnVar3.getResourceProvider());
                String string = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.N = string;
                b2Var.P = LocaleController.getString(z12 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                alertDialog$Builder.n(frameLayout);
                b2Var.C = 9;
                alertDialog$Builder.h(LocaleController.getString(z12 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                if (!z12) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.wj(dnVar2, s1Var, zArr, z13, contentsettings));
                }
                rnVar3.showDialog(b2Var);
                break;
            case 6:
                gy gyVar = (gy) obj4;
                Long l11 = (Long) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.b2) obj3).q(150L);
                Boolean bool2 = gyVar.C.bot_participant;
                if (bool2 == null || !bool2.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    gyVar.getMessagesController().addUserToChat(l11.longValue(), gyVar.getMessagesController().getUser(Long.valueOf(gyVar.D)), 0, null, gyVar, false, runnable, new bf(i12, runnable));
                    break;
                }
                break;
            case 7:
                k01 k01Var = (k01) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap = new HashMap();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = a61.k(num + "️⃣", tL_messages_stickerSet);
                    if (k10 == null) {
                        k10 = a61.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k10 == null) {
                        String[] strArr = n01.s;
                        FileLog.e("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                        break;
                    } else {
                        hashMap.put(num, k10);
                    }
                }
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    m01 m01Var = new m01();
                    k01Var.e.add(m01Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    m01Var.setDelegate(new l01(new Runnable[]{new zs0(25, k01Var, m01Var)}));
                    m01Var.setImage(ImageLocation.getForDocument(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    m01Var.onAttachedToWindow();
                    hashMap2.put(num2, m01Var);
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    Integer num3 = (Integer) arrayList2.get(i18);
                    num3.getClass();
                    k01Var.d.add((m01) hashMap2.get(num3));
                }
                k01Var.g[0] = true;
                k01Var.a();
                break;
            case 8:
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i19 = ((a61) obj4).R;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i19).getStickerSets(5);
                HashSet hashSet = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe((String) obj3);
                String e9 = s3.c.e(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i20 = 0; i20 < stickerSets.size(); i20++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i20);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(e9)) {
                                arrayList3.add(new x51(translitSafe2));
                                arrayList3.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i19).getFeaturedEmojiSets();
                if (featuredEmojiSets != null) {
                    while (i13 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i13);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                            String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title);
                            if (translitSafe3.startsWith(translitSafe) || translitSafe3.contains(e9)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i19).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                    arrayList = stickerSet3 != null ? stickerSet3.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList3.add(new x51(stickerSetCovered.set.title));
                                    arrayList3.addAll(arrayList);
                                    hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                }
                            }
                        }
                        i13++;
                    }
                }
                runnable2.run();
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                Runnable runnable3 = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.k5.h(((a61) obj4).R).f(arrayList4);
                int size = arrayList4.size();
                while (i13 < size) {
                    Object obj5 = arrayList4.get(i13);
                    i13++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj5).id));
                }
                runnable3.run();
                break;
        }
    }
}
