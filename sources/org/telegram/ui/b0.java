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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        int i10 = this.a;
        int i11 = 3;
        String str = null;
        boolean z10 = true;
        int i12 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                m4 m4Var = (m4) obj4;
                q3 q3Var = (q3) obj3;
                Activity activity = (Activity) obj2;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && q3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i13 = 0;
                    for (int i14 = 0; i14 < uRLSpanArr.length; i14++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i14]), length);
                        i13 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i14]), i13);
                    }
                    m4Var.d0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str2);
                    if ((uRLSpanArr.length <= 0 || length != 0 || i13 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                        org.telegram.ui.web.l.b(activity, str2);
                        org.telegram.ui.web.w0 webView = q3Var.getWebView();
                        String str3 = org.telegram.ui.web.k1.a().b;
                        if (str3 != null) {
                            StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str3);
                            n10.append(URLEncoder.encode(str2));
                            str = n10.toString();
                        }
                        webView.loadUrl(str);
                        break;
                    } else {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str2 = ye.d.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        q3Var.getWebView().loadUrl(str2);
                        break;
                    }
                }
                break;
            case 1:
                m4 m4Var2 = (m4) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                Boolean bool = (Boolean) obj;
                MessagesController.getInstance(m4Var2.T).addWebBrowserException(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    MessagesController.getInstance(m4Var2.T).addWebBrowserException(str5, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.E1 = new d0(m4Var2, 8);
                    break;
                } else {
                    m4Var2.c0();
                    break;
                }
                break;
            case 2:
                tn.d1((tn) obj4, (TLRPC.User) obj3, (String) obj2, (Boolean) obj);
                break;
            case 3:
                tn tnVar = (tn) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                Long l10 = (Long) obj;
                if (groupedMessages != null) {
                    tnVar.getClass();
                    for (int i15 = 0; i15 < groupedMessages.messages.size(); i15++) {
                        if (!tnVar.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i15), false, l10.longValue())) {
                            z10 = false;
                        }
                    }
                    if (z10 && tnVar.N3 == 0) {
                        tnVar.O9(false);
                        break;
                    }
                } else if (tnVar.getSendMessagesHelper().retrySendMessage(messageObject, false, l10.longValue())) {
                    tnVar.Wc(false);
                    if (tnVar.N3 == 0) {
                        tnVar.O9(false);
                        break;
                    }
                }
                break;
            case 4:
                fn fnVar = (fn) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                qm qmVar = (qm) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    qmVar.run();
                    break;
                } else {
                    tn tnVar2 = fnVar.a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    tm tmVar = new tm(i12, fnVar, messageObject2);
                    int i16 = l81.Z;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(tnVar2.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j10 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(tnVar2.getContext(), tnVar2.getResourceProvider());
                        org.telegram.ui.Components.aj0 aj0Var = ubVar.a;
                        aj0Var.setScaleX(1.25f);
                        aj0Var.setScaleY(1.25f);
                        int i17 = 6;
                        if (diceValue == 1) {
                            aj0Var.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            aj0Var.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            aj0Var.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            aj0Var.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            aj0Var.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            aj0Var.setImageResource(R.drawable.dice6);
                        } else {
                            aj0Var.setScaleX(0.8f);
                            aj0Var.setScaleY(0.8f);
                            aj0Var.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) jh.ia.M0(j10));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.wc.b(LocaleController.getString(R.string.StakeDiceToastChange), new t31(i17, tnVar2, tmVar), tnVar2.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(ubVar.b);
                        org.telegram.ui.Components.vc vcVar = new org.telegram.ui.Components.vc(tnVar2.getContext(), null);
                        ubVar.b = vcVar;
                        vcVar.setSingleLine();
                        ubVar.b.setTypeface(Typeface.SANS_SERIF);
                        ubVar.b.setTextSize(1, 15.0f);
                        ubVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        ubVar.b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        ubVar.addView(ubVar.b, i7.f6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        ubVar.b.setText(jh.ia.P0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        ubVar.b.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, tnVar2.getResourceProvider()));
                        ubVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hi, tnVar2.getResourceProvider()));
                        ubVar.b.setSingleLine(false);
                        ubVar.b.setMaxLines(2);
                        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(tnVar2.getContext(), tnVar2.getResourceProvider(), true);
                        kcVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        kcVar.a = new eg.z1(tmVar, j10, 27);
                        ubVar.setButton(kcVar);
                        org.telegram.ui.Components.tc.a0(tnVar2).b(ubVar, 2750).j();
                        break;
                    }
                }
                break;
            case 5:
                fn fnVar2 = (fn) obj4;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj2;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((org.telegram.ui.ActionBar.c2) obj3).c(200L);
                tn tnVar3 = fnVar2.a;
                boolean z11 = tnVar3.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(tnVar3.getMessagesController().verifyAgeBotUsername);
                boolean z12 = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(tnVar3.getParentActivity());
                if (z11) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(tnVar3.getParentActivity(), 1, tnVar3.getResourceProvider());
                    y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    y1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                    y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    frameLayout.addView(y1Var, i7.f6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    y1Var.setOnClickListener(new k8(i11, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar3.getParentActivity(), 0, tnVar3.getResourceProvider());
                String string = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(z12 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                alertDialog$Builder.n(frameLayout);
                c2Var.C = 9;
                alertDialog$Builder.h(LocaleController.getString(z12 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                if (!z12) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.zj(fnVar2, s1Var, zArr, z11, contentsettings));
                }
                tnVar3.showDialog(c2Var);
                break;
            case 6:
                fy fyVar = (fy) obj4;
                Long l11 = (Long) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.c2) obj3).q(150L);
                Boolean bool2 = fyVar.C.bot_participant;
                if (bool2 == null || !bool2.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    fyVar.getMessagesController().addUserToChat(l11.longValue(), fyVar.getMessagesController().getUser(Long.valueOf(fyVar.D)), 0, null, fyVar, false, runnable, new ze(i11, runnable));
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
                    TLRPC.Document k9 = d61.k(num + "️⃣", tL_messages_stickerSet);
                    if (k9 == null) {
                        k9 = d61.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k9 == null) {
                        String[] strArr = n01.s;
                        FileLog.e("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                        break;
                    } else {
                        hashMap.put(num, k9);
                    }
                }
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    m01 m01Var = new m01();
                    k01Var.e.add(m01Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    m01Var.setDelegate(new l01(new Runnable[]{new av0(22, k01Var, m01Var)}));
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
                int i19 = ((d61) obj4).R;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i19).getStickerSets(5);
                HashSet hashSet = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe((String) obj3);
                String e10 = u3.c.e(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i20 = 0; i20 < stickerSets.size(); i20++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i20);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(e10)) {
                                arrayList3.add(new a61(translitSafe2));
                                arrayList3.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i19).getFeaturedEmojiSets();
                if (featuredEmojiSets != null) {
                    while (i12 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i12);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                            String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title);
                            if (translitSafe3.startsWith(translitSafe) || translitSafe3.contains(e10)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i19).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                    arrayList = stickerSet3 != null ? stickerSet3.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList3.add(new a61(stickerSetCovered.set.title));
                                    arrayList3.addAll(arrayList);
                                    hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                }
                            }
                        }
                        i12++;
                    }
                }
                runnable2.run();
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                Runnable runnable3 = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.p5.h(((d61) obj4).R).f(arrayList4);
                int size = arrayList4.size();
                while (i12 < size) {
                    Object obj5 = arrayList4.get(i12);
                    i12++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj5).id));
                }
                runnable3.run();
                break;
        }
    }
}
