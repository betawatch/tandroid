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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
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
        int i9 = this.a;
        int i10 = 9;
        int i11 = 3;
        int i12 = 0;
        boolean z10 = true;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i9) {
            case 0:
                l4 l4Var = (l4) obj4;
                p3 p3Var = (p3) obj3;
                Activity activity = (Activity) obj2;
                String str = (String) obj;
                if (!TextUtils.isEmpty(str) && p3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i13 = 0;
                    for (int i14 = 0; i14 < uRLSpanArr.length; i14++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i14]), length);
                        i13 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i14]), i13);
                    }
                    l4Var.d0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str);
                    if ((uRLSpanArr.length <= 0 || length != 0 || i13 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                        org.telegram.ui.web.k.b(activity, str);
                        org.telegram.ui.web.v0 webView = p3Var.getWebView();
                        String str2 = org.telegram.ui.web.j1.a().b;
                        if (str2 == null) {
                            sb2 = null;
                        } else {
                            StringBuilder n10 = e2.c.n(str2);
                            n10.append(URLEncoder.encode(str));
                            sb2 = n10.toString();
                        }
                        webView.loadUrl(sb2);
                        break;
                    } else {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str = ve.e.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        p3Var.getWebView().loadUrl(str);
                        break;
                    }
                }
                break;
            case 1:
                l4 l4Var2 = (l4) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                Boolean bool = (Boolean) obj;
                MessagesController.getInstance(l4Var2.T).addWebBrowserException(str3, true);
                if (!TextUtils.isEmpty(str4) && !TextUtils.equals(str4, str3)) {
                    MessagesController.getInstance(l4Var2.T).addWebBrowserException(str4, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.E1 = new c0(l4Var2, 8);
                    break;
                } else {
                    l4Var2.c0();
                    break;
                }
            case 2:
                qn.d1((qn) obj4, (TLRPC.User) obj3, (String) obj2, (Boolean) obj);
                break;
            case 3:
                qn qnVar = (qn) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                Long l10 = (Long) obj;
                if (groupedMessages != null) {
                    qnVar.getClass();
                    for (int i15 = 0; i15 < groupedMessages.messages.size(); i15++) {
                        if (!qnVar.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i15), false, l10.longValue())) {
                            z10 = false;
                        }
                    }
                    if (z10 && qnVar.N3 == 0) {
                        qnVar.O9(false);
                        break;
                    }
                } else if (qnVar.getSendMessagesHelper().retrySendMessage(messageObject, false, l10.longValue())) {
                    qnVar.Wc(false);
                    if (qnVar.N3 == 0) {
                        qnVar.O9(false);
                        break;
                    }
                }
                break;
            case 4:
                cn cnVar = (cn) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                om omVar = (om) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    omVar.run();
                    break;
                } else {
                    qn qnVar2 = cnVar.a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    df dfVar = new df(7, cnVar, messageObject2);
                    int i16 = k81.Z;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(qnVar2.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j10 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(qnVar2.getContext(), qnVar2.getResourceProvider());
                        org.telegram.ui.Components.pi0 pi0Var = obVar.a;
                        pi0Var.setScaleX(1.25f);
                        pi0Var.setScaleY(1.25f);
                        if (diceValue == 1) {
                            pi0Var.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            pi0Var.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            pi0Var.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            pi0Var.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            pi0Var.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            pi0Var.setImageResource(R.drawable.dice6);
                        } else {
                            pi0Var.setScaleX(0.8f);
                            pi0Var.setScaleY(0.8f);
                            pi0Var.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) gh.oa.M0(j10));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.rc.b(LocaleController.getString(R.string.StakeDiceToastChange), new n21(i10, qnVar2, dfVar), qnVar2.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(obVar.b);
                        org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(qnVar2.getContext(), null);
                        obVar.b = qcVar;
                        qcVar.setSingleLine();
                        obVar.b.setTypeface(Typeface.SANS_SERIF);
                        obVar.b.setTextSize(1, 15.0f);
                        obVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        obVar.b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        obVar.addView(obVar.b, g7.e6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        obVar.b.setText(gh.oa.P0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        obVar.b.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, qnVar2.getResourceProvider()));
                        obVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Hi, qnVar2.getResourceProvider()));
                        obVar.b.setSingleLine(false);
                        obVar.b.setMaxLines(2);
                        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(qnVar2.getContext(), qnVar2.getResourceProvider(), true);
                        ecVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        ecVar.a = new bg.i2(dfVar, j10, 29);
                        obVar.setButton(ecVar);
                        org.telegram.ui.Components.oc.a0(qnVar2).b(obVar, 2750).j();
                        break;
                    }
                }
                break;
            case 5:
                cn cnVar2 = (cn) obj4;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((org.telegram.ui.ActionBar.c2) obj3).c(200L);
                qn qnVar3 = cnVar2.a;
                boolean z11 = qnVar3.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(qnVar3.getMessagesController().verifyAgeBotUsername);
                boolean z12 = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                boolean z13 = z11;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(qnVar3.getParentActivity());
                if (z13) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(qnVar3.getParentActivity(), 1, qnVar3.getResourceProvider());
                    z1Var.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                    z1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                    z1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    frameLayout.addView(z1Var, g7.e6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    z1Var.setOnClickListener(new l8(i11, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar3.getParentActivity(), 0, qnVar3.getResourceProvider());
                String string = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(z12 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                alertDialog$Builder.n(frameLayout);
                c2Var.C = 9;
                alertDialog$Builder.h(LocaleController.getString(z12 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                if (!z12) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.sj(cnVar2, t1Var, zArr, z13, contentsettings));
                }
                qnVar3.showDialog(c2Var);
                break;
            case 6:
                dy dyVar = (dy) obj4;
                Long l11 = (Long) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.c2) obj3).q(150L);
                Boolean bool2 = dyVar.C.bot_participant;
                if (bool2 == null || !bool2.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    dyVar.getMessagesController().addUserToChat(l11.longValue(), dyVar.getMessagesController().getUser(Long.valueOf(dyVar.D)), 0, null, dyVar, false, runnable, new bf(i11, runnable));
                    break;
                }
                break;
            case 7:
                j01 j01Var = (j01) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap = new HashMap();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = b61.k(num + "️⃣", tL_messages_stickerSet);
                    if (k10 == null) {
                        k10 = b61.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k10 == null) {
                        String[] strArr = m01.s;
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
                    l01 l01Var = new l01();
                    j01Var.e.add(l01Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    l01Var.setDelegate(new k01(new Runnable[]{new ys0(25, j01Var, l01Var)}));
                    l01Var.setImage(ImageLocation.getForDocument(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    l01Var.onAttachedToWindow();
                    hashMap2.put(num2, l01Var);
                }
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    Integer num3 = (Integer) arrayList2.get(i17);
                    num3.getClass();
                    j01Var.d.add((l01) hashMap2.get(num3));
                }
                j01Var.g[0] = true;
                j01Var.a();
                break;
            case 8:
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i18 = ((b61) obj4).R;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i18).getStickerSets(5);
                HashSet hashSet = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe((String) obj3);
                String d = ta.b.d(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i19 = 0; i19 < stickerSets.size(); i19++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i19);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(d)) {
                                arrayList3.add(new y51(translitSafe2));
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
                            if (translitSafe3.startsWith(translitSafe) || translitSafe3.contains(d)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i18).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                    arrayList = stickerSet3 != null ? stickerSet3.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList3.add(new y51(stickerSetCovered.set.title));
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
                org.telegram.ui.Components.k5.h(((b61) obj4).R).f(arrayList4);
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
