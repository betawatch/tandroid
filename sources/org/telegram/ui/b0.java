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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        boolean z4 = true;
        int i12 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                n4 n4Var = (n4) obj4;
                r3 r3Var = (r3) obj3;
                Activity activity = (Activity) obj2;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && r3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i13 = 0;
                    for (int i14 = 0; i14 < uRLSpanArr.length; i14++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i14]), length);
                        i13 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i14]), i13);
                    }
                    n4Var.e0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str2);
                    if ((uRLSpanArr.length <= 0 || length != 0 || i13 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                        org.telegram.ui.web.k.b(activity, str2);
                        org.telegram.ui.web.y0 webView = r3Var.getWebView();
                        String str3 = org.telegram.ui.web.n1.a().b;
                        if (str3 != null) {
                            StringBuilder l10 = e2.c.l(str3);
                            l10.append(URLEncoder.encode(str2));
                            str = l10.toString();
                        }
                        webView.loadUrl(str);
                        break;
                    } else {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str2 = ze.d.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        r3Var.getWebView().loadUrl(str2);
                        break;
                    }
                }
                break;
            case 1:
                n4 n4Var2 = (n4) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                Boolean bool = (Boolean) obj;
                MessagesController.getInstance(n4Var2.U).addWebBrowserException(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    MessagesController.getInstance(n4Var2.U).addWebBrowserException(str5, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.F1 = new d0(n4Var2, 8);
                    break;
                } else {
                    n4Var2.c0();
                    break;
                }
                break;
            case 2:
                zn.d1((zn) obj4, (TLRPC.User) obj3, (String) obj2, (Boolean) obj);
                break;
            case 3:
                zn znVar = (zn) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                Long l11 = (Long) obj;
                if (groupedMessages != null) {
                    znVar.getClass();
                    for (int i15 = 0; i15 < groupedMessages.messages.size(); i15++) {
                        if (!znVar.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i15), false, l11.longValue())) {
                            z4 = false;
                        }
                    }
                    if (z4 && znVar.O3 == 0) {
                        znVar.O9(false);
                        break;
                    }
                } else if (znVar.getSendMessagesHelper().retrySendMessage(messageObject, false, l11.longValue())) {
                    znVar.Wc(false);
                    if (znVar.O3 == 0) {
                        znVar.O9(false);
                        break;
                    }
                }
                break;
            case 4:
                ln lnVar = (ln) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                xm xmVar = (xm) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    xmVar.run();
                    break;
                } else {
                    zn znVar2 = lnVar.a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    kh.a1 a1Var = new kh.a1(22, lnVar, messageObject2);
                    int i16 = g91.a0;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(znVar2.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j10 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(znVar2.getContext(), znVar2.getResourceProvider());
                        org.telegram.ui.Components.jj0 jj0Var = qbVar.a;
                        jj0Var.setScaleX(1.25f);
                        jj0Var.setScaleY(1.25f);
                        if (diceValue == 1) {
                            jj0Var.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            jj0Var.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            jj0Var.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            jj0Var.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            jj0Var.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            jj0Var.setImageResource(R.drawable.dice6);
                        } else {
                            jj0Var.setScaleX(0.8f);
                            jj0Var.setScaleY(0.8f);
                            jj0Var.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) lh.ja.M0(j10));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.tc.b(LocaleController.getString(R.string.StakeDiceToastChange), new b11(14, znVar2, a1Var), znVar2.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(qbVar.b);
                        org.telegram.ui.Components.sc scVar = new org.telegram.ui.Components.sc(znVar2.getContext(), null);
                        qbVar.b = scVar;
                        scVar.setSingleLine();
                        qbVar.b.setTypeface(Typeface.SANS_SERIF);
                        qbVar.b.setTextSize(1, 15.0f);
                        qbVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        qbVar.b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        qbVar.addView(qbVar.b, k7.b6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        qbVar.b.setText(lh.ja.P0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        qbVar.b.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, znVar2.getResourceProvider()));
                        qbVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, znVar2.getResourceProvider()));
                        qbVar.b.setSingleLine(false);
                        qbVar.b.setMaxLines(2);
                        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(znVar2.getContext(), znVar2.getResourceProvider(), true);
                        gcVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        gcVar.a = new gg.y1(a1Var, j10, 23);
                        qbVar.setButton(gcVar);
                        org.telegram.ui.Components.qc.a0(znVar2).b(qbVar, 2750).j();
                        break;
                    }
                }
                break;
            case 5:
                ln lnVar2 = (ln) obj4;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj2;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((org.telegram.ui.ActionBar.d2) obj3).c(200L);
                zn znVar3 = lnVar2.a;
                boolean z10 = znVar3.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(znVar3.getMessagesController().verifyAgeBotUsername);
                boolean z11 = (contentsettings == null || !contentsettings.sensitive_can_change) && z10;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(znVar3.getParentActivity());
                if (z10) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(znVar3.getParentActivity(), 1, znVar3.getResourceProvider());
                    y1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    y1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                    y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    frameLayout.addView(y1Var, k7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    y1Var.setOnClickListener(new q8(i11, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar3.getParentActivity(), 0, znVar3.getResourceProvider());
                String string = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                alertDialog$Builder.n(frameLayout);
                d2Var.D = 9;
                alertDialog$Builder.h(LocaleController.getString(z11 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                if (!z11) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.dk(lnVar2, s1Var, zArr, z10, contentsettings));
                }
                znVar3.showDialog(d2Var);
                break;
            case 6:
                qy qyVar = (qy) obj4;
                Long l12 = (Long) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.d2) obj3).q(150L);
                Boolean bool2 = qyVar.D.bot_participant;
                if (bool2 == null || !bool2.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    qyVar.getMessagesController().addUserToChat(l12.longValue(), qyVar.getMessagesController().getUser(Long.valueOf(qyVar.E)), 0, null, qyVar, false, runnable, new jf(i11, runnable));
                    break;
                }
                break;
            case 7:
                c11 c11Var = (c11) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap = new HashMap();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = x61.k(num + "️⃣", tL_messages_stickerSet);
                    if (k10 == null) {
                        k10 = x61.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k10 == null) {
                        String[] strArr = f11.s;
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
                    e11 e11Var = new e11();
                    c11Var.e.add(e11Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    e11Var.setDelegate(new d11(new Runnable[]{new b11(i12, c11Var, e11Var)}));
                    e11Var.setImage(ImageLocation.getForDocument(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    e11Var.onAttachedToWindow();
                    hashMap2.put(num2, e11Var);
                }
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    Integer num3 = (Integer) arrayList2.get(i17);
                    num3.getClass();
                    c11Var.d.add((e11) hashMap2.get(num3));
                }
                c11Var.g[0] = true;
                c11Var.a();
                break;
            case 8:
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i18 = ((x61) obj4).S;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i18).getStickerSets(5);
                HashSet hashSet = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe((String) obj3);
                String e = vh.w2.e(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i19 = 0; i19 < stickerSets.size(); i19++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i19);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(e)) {
                                arrayList3.add(new u61(translitSafe2));
                                arrayList3.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i18).getFeaturedEmojiSets();
                if (featuredEmojiSets != null) {
                    while (i12 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i12);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                            String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title);
                            if (translitSafe3.startsWith(translitSafe) || translitSafe3.contains(e)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i18).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                    arrayList = stickerSet3 != null ? stickerSet3.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList3.add(new u61(stickerSetCovered.set.title));
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
                org.telegram.ui.Components.l5.h(((x61) obj4).S).f(arrayList4);
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
