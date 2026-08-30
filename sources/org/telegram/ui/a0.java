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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, int i10) {
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
        int i12 = 0;
        int i13 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                l4 l4Var = (l4) obj4;
                p3 p3Var = (p3) obj3;
                Activity activity = (Activity) obj2;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && p3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i14 = 0;
                    for (int i15 = 0; i15 < uRLSpanArr.length; i15++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i15]), length);
                        i14 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i15]), i14);
                    }
                    l4Var.e0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str2);
                    if ((uRLSpanArr.length <= 0 || length != 0 || i14 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                        org.telegram.ui.web.k.b(activity, str2);
                        org.telegram.ui.web.w0 webView = p3Var.getWebView();
                        String str3 = org.telegram.ui.web.l1.a().b;
                        if (str3 != null) {
                            StringBuilder l10 = e2.c.l(str3);
                            l10.append(URLEncoder.encode(str2));
                            str = l10.toString();
                        }
                        webView.loadUrl(str);
                        break;
                    } else {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str2 = af.g.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        p3Var.getWebView().loadUrl(str2);
                        break;
                    }
                }
                break;
            case 1:
                l4 l4Var2 = (l4) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                Boolean bool = (Boolean) obj;
                MessagesController.getInstance(l4Var2.U).addWebBrowserException(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    MessagesController.getInstance(l4Var2.U).addWebBrowserException(str5, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.F1 = new c0(l4Var2, 8);
                    break;
                } else {
                    l4Var2.c0();
                    break;
                }
                break;
            case 2:
                xn.d1((xn) obj4, (TLRPC.User) obj3, (String) obj2, (Boolean) obj);
                break;
            case 3:
                xn xnVar = (xn) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                Long l11 = (Long) obj;
                if (groupedMessages != null) {
                    xnVar.getClass();
                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                        if (!xnVar.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i16), false, l11.longValue())) {
                            i13 = 0;
                        }
                    }
                    if (i13 != 0 && xnVar.O3 == 0) {
                        xnVar.O9(false);
                        break;
                    }
                } else if (xnVar.getSendMessagesHelper().retrySendMessage(messageObject, false, l11.longValue())) {
                    xnVar.Wc(false);
                    if (xnVar.O3 == 0) {
                        xnVar.O9(false);
                        break;
                    }
                }
                break;
            case 4:
                jn jnVar = (jn) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                vm vmVar = (vm) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    vmVar.run();
                    break;
                } else {
                    xn xnVar2 = jnVar.a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    kh.a1 a1Var = new kh.a1(22, jnVar, messageObject2);
                    int i17 = y81.a0;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(xnVar2.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j10 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(xnVar2.getContext(), xnVar2.getResourceProvider());
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
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.tc.b(LocaleController.getString(R.string.StakeDiceToastChange), new l01(15, xnVar2, a1Var), xnVar2.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(qbVar.b);
                        org.telegram.ui.Components.sc scVar = new org.telegram.ui.Components.sc(xnVar2.getContext(), null);
                        qbVar.b = scVar;
                        scVar.setSingleLine();
                        qbVar.b.setTypeface(Typeface.SANS_SERIF);
                        qbVar.b.setTextSize(1, 15.0f);
                        qbVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        qbVar.b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        qbVar.addView(qbVar.b, k7.b6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        qbVar.b.setText(lh.ja.P0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        qbVar.b.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, xnVar2.getResourceProvider()));
                        qbVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, xnVar2.getResourceProvider()));
                        qbVar.b.setSingleLine(false);
                        qbVar.b.setMaxLines(2);
                        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(xnVar2.getContext(), xnVar2.getResourceProvider(), true);
                        gcVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        gcVar.a = new gg.y1(a1Var, j10, 24);
                        qbVar.setButton(gcVar);
                        org.telegram.ui.Components.qc.a0(xnVar2).b(qbVar, 2750).j();
                        break;
                    }
                }
                break;
            case 5:
                jn jnVar2 = (jn) obj4;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((org.telegram.ui.ActionBar.d2) obj3).c(200L);
                xn xnVar3 = jnVar2.a;
                boolean z4 = xnVar3.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(xnVar3.getMessagesController().verifyAgeBotUsername);
                boolean z10 = (contentsettings == null || !contentsettings.sensitive_can_change) && z4;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(xnVar3.getParentActivity());
                if (z4) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(xnVar3.getParentActivity(), 1, xnVar3.getResourceProvider());
                    z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    z1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                    z1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    frameLayout.addView(z1Var, k7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    z1Var.setOnClickListener(new o8(i11, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar3.getParentActivity(), 0, xnVar3.getResourceProvider());
                String string = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(z10 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                alertDialog$Builder.n(frameLayout);
                d2Var.D = 9;
                alertDialog$Builder.h(LocaleController.getString(z10 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                if (!z10) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.dk(jnVar2, t1Var, zArr, z4, contentsettings));
                }
                xnVar3.showDialog(d2Var);
                break;
            case 6:
                oy oyVar = (oy) obj4;
                Long l12 = (Long) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.d2) obj3).q(150L);
                Boolean bool2 = oyVar.D.bot_participant;
                if (bool2 == null || !bool2.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    oyVar.getMessagesController().addUserToChat(l12.longValue(), oyVar.getMessagesController().getUser(Long.valueOf(oyVar.E)), 0, null, oyVar, false, runnable, new gf(i11, runnable));
                    break;
                }
                break;
            case 7:
                v01 v01Var = (v01) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap = new HashMap();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = q61.k(num + "️⃣", tL_messages_stickerSet);
                    if (k10 == null) {
                        k10 = q61.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k10 == null) {
                        String[] strArr = y01.s;
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
                    x01 x01Var = new x01();
                    v01Var.e.add(x01Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    x01Var.setDelegate(new w01(new Runnable[]{new l01(i13, v01Var, x01Var)}));
                    x01Var.setImage(ImageLocation.getForDocument(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    x01Var.onAttachedToWindow();
                    hashMap2.put(num2, x01Var);
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    Integer num3 = (Integer) arrayList2.get(i18);
                    num3.getClass();
                    v01Var.d.add((x01) hashMap2.get(num3));
                }
                v01Var.g[0] = true;
                v01Var.a();
                break;
            case 8:
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i19 = ((q61) obj4).S;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i19).getStickerSets(5);
                HashSet hashSet = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe((String) obj3);
                String e = vh.v2.e(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i20 = 0; i20 < stickerSets.size(); i20++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i20);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(e)) {
                                arrayList3.add(new n61(translitSafe2));
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
                            if (translitSafe3.startsWith(translitSafe) || translitSafe3.contains(e)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i19).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                    arrayList = stickerSet3 != null ? stickerSet3.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList3.add(new n61(stickerSetCovered.set.title));
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
                org.telegram.ui.Components.l5.h(((q61) obj4).S).f(arrayList4);
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
