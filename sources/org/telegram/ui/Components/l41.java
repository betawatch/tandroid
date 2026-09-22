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
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class l41 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final String[] R = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap S;
    public final x31 E;
    public final n90 F;
    public boolean G;
    public final y31 H;
    public final k41 I;
    public final org.telegram.ui.Cells.r9 J;
    public final org.telegram.ui.Cells.da K;
    public final View L;
    public org.telegram.ui.ActionBar.n2 M;
    public Utilities.CallbackReturn N;
    public boolean O;
    public final d6 P;
    public Boolean Q;
    public Integer b;
    public final CharSequence c;
    public final TLRPC.InputPeer d;
    public final int e;
    public final boolean f;
    public final TL_iv.RichMessage h;
    public final RichMessageLayout.PreviewView n;
    public final RichMessageLayout.PreviewView r;
    public final String s;
    public String v;
    public String w;
    public final j41 x;
    public final bi.o y;

    public l41(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, TL_iv.RichMessage richMessage) {
        super(1, context, (org.telegram.ui.ActionBar.f6) null, false);
        this.O = true;
        this.backgroundPaddingLeft = 0;
        fixNavigationBar();
        this.c = charSequence;
        this.d = inputPeer;
        this.e = i10;
        this.f = z10;
        this.h = richMessage;
        this.s = str;
        this.v = str2;
        org.telegram.ui.t5 t5Var = new org.telegram.ui.t5(this, context);
        this.containerView = t5Var;
        this.P = new d6(t5Var, 320L, qr.h);
        bi.o oVar = new bi.o(context, 7);
        this.y = oVar;
        oVar.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        oVar.setTextSize(1, SharedConfig.fontSize);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        oVar.setTextColor(getThemedColor(i11));
        oVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.l1(0.2f, getThemedColor(i11)));
        oVar.setText(Emoji.replaceEmoji(charSequence == null ? "" : charSequence.toString(), oVar.getPaint().getFontMetricsInt(), true));
        this.E = new x31(context);
        n90 n90Var = new n90(context, null);
        this.F = n90Var;
        n90Var.setDisablePaddingsOffsetY(true);
        n90Var.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        n90Var.setTextSize(1, SharedConfig.fontSize);
        n90Var.setTextColor(getThemedColor(i11));
        n90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.gc));
        n90Var.setTextIsSelectable(true);
        n90Var.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.j6.uf));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.vf);
        try {
            if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
                Drawable textSelectHandleLeft = n90Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(themedColor, mode);
                n90Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandleRight = n90Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(themedColor, mode);
                n90Var.setTextSelectHandleRight(textSelectHandleRight);
            }
        } catch (Exception unused) {
        }
        this.E.addView(this.F, w7.y5.c(-1.0f, -1));
        if (this.h != null) {
            RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.n = previewView;
            previewView.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
            previewView.set(this.h);
            previewView.setTranslationLoading(true);
            RichMessageLayout.PreviewView previewView2 = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.r = previewView2;
            previewView2.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        }
        y31 y31Var = new y31(this, context);
        this.H = y31Var;
        y31Var.setOverScrollMode(1);
        y31Var.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.dp(80.0f));
        y31Var.setClipToPadding(true);
        s4.c0 c0Var = new s4.c0();
        y31Var.setLayoutManager(c0Var);
        View view = this.h != null ? this.n : this.y;
        k41 k41Var = new k41();
        k41Var.e = 1;
        k41Var.c = context;
        k41Var.d = view;
        this.I = k41Var;
        y31Var.setAdapter(k41Var);
        y31Var.setOnScrollListener(new z31(this));
        a41 a41Var = new a41(this);
        a41Var.n(180L);
        a41Var.o(new LinearInterpolator());
        y31Var.setItemAnimator(a41Var);
        this.containerView.addView(y31Var, w7.y5.e(-1, -2, 80));
        org.telegram.ui.Cells.r9 r9Var = new org.telegram.ui.Cells.r9();
        this.J = r9Var;
        r9Var.T(y31Var);
        r9Var.E0 = c0Var;
        org.telegram.ui.Cells.da o9 = r9Var.o(context);
        this.K = o9;
        AndroidUtilities.removeFromParent(o9);
        this.containerView.addView(o9, w7.y5.e(-1, -1, 119));
        RichMessageLayout.PreviewView previewView3 = this.r;
        if (previewView3 != null) {
            previewView3.setTextSelectionHelper(r9Var);
        }
        j41 j41Var = new j41(this, context);
        this.x = j41Var;
        this.containerView.addView(j41Var, w7.y5.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
        View view2 = new View(context);
        this.L = view2;
        view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.V5));
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, w7.y5.a(-1.0f, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55));
        TextView textView = new TextView(context);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.CloseTranslation));
        textView.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false)));
        textView.setOnClickListener(new i80(this, 23));
        frameLayout.addView(textView, w7.y5.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.containerView.addView(frameLayout, w7.y5.e(-1, -2, 87));
        M();
    }

    public static String A() {
        return MessagesController.getGlobalMainSettings().getString("translate_to_language", LocaleController.getInstance().getCurrentLocale().getLanguage());
    }

    public static HashMap B(CharSequence charSequence) {
        ArrayList<Emoji.EmojiSpanRange> parseEmojis;
        HashMap hashMap = new HashMap();
        if (charSequence != null && (parseEmojis = Emoji.parseEmojis(charSequence)) != null) {
            String charSequence2 = charSequence.toString();
            for (int i10 = 0; i10 < parseEmojis.size(); i10++) {
                Emoji.EmojiSpanRange emojiSpanRange = parseEmojis.get(i10);
                if (emojiSpanRange != null && emojiSpanRange.code != null) {
                    String substring = charSequence2.substring(emojiSpanRange.start, emojiSpanRange.end);
                    ArrayList arrayList = (ArrayList) hashMap.get(substring);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(substring, arrayList);
                    }
                    arrayList.add(emojiSpanRange);
                }
            }
        }
        return hashMap;
    }

    public static String D(String str, boolean[] zArr, boolean[] zArr2) {
        if (str == null || str.equals(TranslateController.UNKNOWN_LANGUAGE) || str.equals("auto")) {
            return null;
        }
        String str2 = str.split("_")[0];
        if ("nb".equals(str2)) {
            str2 = "no";
        }
        if (zArr != null) {
            String string = LocaleController.getString("TranslateLanguage" + str2.toUpperCase());
            boolean z10 = (string == null || string.startsWith("LOC_ERR")) ? false : true;
            zArr[0] = z10;
            if (z10) {
                return string;
            }
        }
        if (zArr2 != null) {
            String string2 = LocaleController.getString("TranslateLanguageGenitive" + str2.toUpperCase());
            boolean z11 = (string2 == null || string2.startsWith("LOC_ERR")) ? false : true;
            zArr2[0] = z11;
            if (z11) {
                return string2;
            }
        }
        String L = L(str, false);
        if (L == null) {
            L = L(str2, false);
        }
        if (L != null) {
            return L;
        }
        if ("no".equals(str)) {
            str = "nb";
        }
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        LocaleController.LocaleInfo builtinLanguageByPlural = LocaleController.getInstance().getBuiltinLanguageByPlural(str);
        if (builtinLanguageByPlural == null) {
            return null;
        }
        return (currentLocaleInfo == null || !"en".equals(currentLocaleInfo.pluralLangCode)) ? builtinLanguageByPlural.name : builtinLanguageByPlural.nameEnglish;
    }

    public static TLRPC.TL_textWithEntities E(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2) {
        Emoji.EmojiSpanRange emojiSpanRange;
        ArrayList<TLRPC.MessageEntity> arrayList;
        if (tL_textWithEntities2 == null || tL_textWithEntities2.text == null) {
            return null;
        }
        for (int i10 = 0; i10 < tL_textWithEntities2.entities.size(); i10++) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities2.entities.get(i10);
            if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                if (messageEntity.url != null) {
                    String str = tL_textWithEntities2.text;
                    int i11 = messageEntity.offset;
                    String substring = str.substring(i11, messageEntity.length + i11);
                    if (TextUtils.equals(substring, messageEntity.url)) {
                        TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                        tL_messageEntityUrl.offset = messageEntity.offset;
                        tL_messageEntityUrl.length = messageEntity.length;
                        tL_textWithEntities2.entities.set(i10, tL_messageEntityUrl);
                    } else if (messageEntity.url.startsWith("https://t.me/") && substring.startsWith("@") && TextUtils.equals(substring.substring(1), messageEntity.url.substring(13))) {
                        TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                        tL_messageEntityMention.offset = messageEntity.offset;
                        tL_messageEntityMention.length = messageEntity.length;
                        tL_textWithEntities2.entities.set(i10, tL_messageEntityMention);
                    }
                }
            } else if ((messageEntity instanceof TLRPC.TL_messageEntityPre) && tL_textWithEntities != null && (arrayList = tL_textWithEntities.entities) != null && i10 < arrayList.size() && (tL_textWithEntities.entities.get(i10) instanceof TLRPC.TL_messageEntityPre)) {
                messageEntity.language = tL_textWithEntities.entities.get(i10).language;
            }
        }
        if (tL_textWithEntities != null && tL_textWithEntities.text != null && !tL_textWithEntities.entities.isEmpty()) {
            HashMap B = B(tL_textWithEntities.text);
            HashMap B2 = B(tL_textWithEntities2.text);
            for (int i12 = 0; i12 < tL_textWithEntities.entities.size(); i12++) {
                TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i12);
                if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    String str2 = tL_textWithEntities.text;
                    int i13 = messageEntity2.offset;
                    String substring2 = str2.substring(i13, messageEntity2.length + i13);
                    if (!TextUtils.isEmpty(substring2)) {
                        ArrayList arrayList2 = (ArrayList) B.get(substring2);
                        ArrayList arrayList3 = (ArrayList) B2.get(substring2);
                        if (arrayList2 != null && arrayList3 != null) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= arrayList2.size()) {
                                    i14 = -1;
                                    break;
                                }
                                Emoji.EmojiSpanRange emojiSpanRange2 = (Emoji.EmojiSpanRange) arrayList2.get(i14);
                                int i15 = emojiSpanRange2.start;
                                int i16 = messageEntity2.offset;
                                if (i15 == i16 && emojiSpanRange2.end == i16 + messageEntity2.length) {
                                    break;
                                }
                                i14++;
                            }
                            if (i14 >= 0 && i14 < arrayList3.size() && (emojiSpanRange = (Emoji.EmojiSpanRange) arrayList3.get(i14)) != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= tL_textWithEntities2.entities.size()) {
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity2;
                                        tL_messageEntityCustomEmoji.document_id = tL_messageEntityCustomEmoji2.document_id;
                                        tL_messageEntityCustomEmoji.document = tL_messageEntityCustomEmoji2.document;
                                        int i18 = emojiSpanRange.start;
                                        tL_messageEntityCustomEmoji.offset = i18;
                                        tL_messageEntityCustomEmoji.length = emojiSpanRange.end - i18;
                                        tL_textWithEntities2.entities.add(tL_messageEntityCustomEmoji);
                                        break;
                                    }
                                    TLRPC.MessageEntity messageEntity3 = tL_textWithEntities2.entities.get(i17);
                                    if (messageEntity3 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        int i19 = emojiSpanRange.start;
                                        int i20 = emojiSpanRange.end;
                                        int i21 = messageEntity3.offset;
                                        if (AndroidUtilities.intersect1d(i19, i20, i21, messageEntity3.length + i21)) {
                                            break;
                                        }
                                    }
                                    i17++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return tL_textWithEntities2;
    }

    public static void I(String str) {
        MessagesController.getGlobalMainSettings().edit().putString("translate_to_language", str).apply();
    }

    public static d41 J(Activity activity, org.telegram.ui.zn znVar, TLRPC.InputPeer inputPeer, int i10, boolean z10, String str, String str2, CharSequence charSequence, boolean z11, org.telegram.ui.wf wfVar, Runnable runnable) {
        d41 d41Var = new d41(activity, str, str2, charSequence, inputPeer, i10, z10, runnable);
        d41Var.G(z11);
        d41Var.M = znVar;
        d41Var.N = wfVar;
        if (znVar.getParentActivity() != null) {
            znVar.showDialog(d41Var);
        }
        return d41Var;
    }

    public static void K(Context context, org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.m20 m20Var, org.telegram.ui.Cells.g gVar) {
        if (context == null) {
            return;
        }
        f41 f41Var = new f41(context, str, str2, charSequence, gVar);
        f41Var.G(false);
        f41Var.M = n2Var;
        f41Var.N = m20Var;
        if (n2Var == null) {
            f41Var.show();
        } else if (n2Var.getParentActivity() != null) {
            n2Var.showDialog(f41Var);
        }
    }

    public static String L(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (S == null) {
            S = new HashMap();
            try {
                Locale[] availableLocales = Locale.getAvailableLocales();
                for (int i10 = 0; i10 < availableLocales.length; i10++) {
                    S.put(availableLocales[i10].getLanguage(), availableLocales[i10]);
                    String country = availableLocales[i10].getCountry();
                    if (country != null && country.length() > 0) {
                        S.put(availableLocales[i10].getLanguage() + "-" + country.toLowerCase(), availableLocales[i10]);
                    }
                }
            } catch (Exception unused) {
            }
        }
        String lowerCase = str.replace("_", "-").toLowerCase();
        try {
            Locale locale = (Locale) S.get(lowerCase);
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

    public static void m(l41 l41Var, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, TLRPC.TL_error tL_error) {
        x31 x31Var = l41Var.E;
        k41 k41Var = l41Var.I;
        l41Var.b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            l41Var.N();
            return;
        }
        if (tL_textWithEntities2 != null) {
            l41Var.O = false;
            TLRPC.TL_textWithEntities E = E(tL_textWithEntities, tL_textWithEntities2);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(E.text);
            MessageObject.addEntitiesToText(valueOf, E.entities, false, true, false, false);
            l41Var.F.setText(l41Var.F(valueOf));
            k41Var.D(x31Var);
            return;
        }
        if (l41Var.O) {
            l41Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.rk.p(R.string.TranslationFailedAlert2, new xc((FrameLayout) l41Var.containerView, l41Var.resourcesProvider), null);
        h41 h41Var = l41Var.x.e;
        String str = l41Var.w;
        l41Var.v = str;
        h41Var.setText(D(str, null, null));
        k41Var.D(x31Var);
    }

    public static void n(l41 l41Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        x31 x31Var = l41Var.E;
        k41 k41Var = l41Var.I;
        l41Var.b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            l41Var.N();
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                l41Var.O = false;
                TLRPC.TL_textWithEntities E = E(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(E.text);
                MessageObject.addEntitiesToText(valueOf, E.entities, false, true, false, false);
                l41Var.F.setText(l41Var.F(valueOf));
                k41Var.D(x31Var);
                return;
            }
        }
        if (l41Var.O) {
            l41Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.rk.p(R.string.TranslationFailedAlert2, new xc((FrameLayout) l41Var.containerView, l41Var.resourcesProvider), null);
        h41 h41Var = l41Var.x.e;
        String str = l41Var.w;
        l41Var.v = str;
        h41Var.setText(D(str, null, null));
        k41Var.D(x31Var);
    }

    public static void o(l41 l41Var, TLObject tLObject) {
        RichMessageLayout.PreviewView previewView = l41Var.r;
        l41Var.b = null;
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
            if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                l41Var.O = false;
                TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                if (previewView != null) {
                    previewView.set(richMessage);
                    l41Var.I.D(previewView);
                    return;
                }
                return;
            }
        }
        if (l41Var.O) {
            l41Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.rk.p(R.string.TranslationFailedAlert2, new xc((FrameLayout) l41Var.containerView, l41Var.resourcesProvider), null);
        h41 h41Var = l41Var.x.e;
        String str = l41Var.w;
        l41Var.v = str;
        h41Var.setText(D(str, null, null));
    }

    public static void p(l41 l41Var, String str, Boolean bool) {
        x31 x31Var = l41Var.E;
        k41 k41Var = l41Var.I;
        if (str != null) {
            l41Var.O = false;
            l41Var.F.setText(l41Var.F(str));
            k41Var.D(x31Var);
        } else {
            if (l41Var.isDismissed()) {
                return;
            }
            if (l41Var.O) {
                l41Var.dismiss();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2));
                return;
            }
            org.telegram.messenger.rk.p(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2, new xc((FrameLayout) l41Var.containerView, l41Var.resourcesProvider), null);
            h41 h41Var = l41Var.x.e;
            String str2 = l41Var.w;
            l41Var.v = str2;
            h41Var.setText(D(str2, null, null));
            k41Var.D(x31Var);
        }
    }

    public static boolean u(l41 l41Var) {
        y31 y31Var = l41Var.H;
        float f7 = 0.0f;
        for (int i10 = 0; i10 < y31Var.getChildCount(); i10++) {
            if (RecyclerView.S(y31Var.getChildAt(i10)) == 1) {
                f7 += r3.getHeight();
            }
        }
        return f7 >= ((float) ((y31Var.getHeight() - y31Var.getPaddingTop()) - y31Var.getPaddingBottom()));
    }

    public static void x(String str, String str2, String str3, Utilities.Callback2 callback2) {
        if (str2 == null) {
            LanguageDetector.detectLanguage(str, new w31(str, str3, callback2), new w31(str, str3, callback2));
            return;
        }
        String encode = Uri.encode(str);
        if (encode.length() <= 5000) {
            new b41(str2, str3, encode, callback2).start();
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < encode.length()) {
            int min = Math.min(i10 + 5000, encode.length());
            int i11 = min - 1;
            int lastIndexOf = encode.lastIndexOf("%0A", i11);
            if (lastIndexOf < i10) {
                lastIndexOf = -1;
            }
            if (lastIndexOf == -1) {
                int lastIndexOf2 = encode.lastIndexOf("%20", i11);
                lastIndexOf = lastIndexOf2 >= i10 ? lastIndexOf2 : -1;
            }
            if (lastIndexOf != -1) {
                min = lastIndexOf + 3;
            }
            arrayList.add(encode.substring(i10, min));
            i10 = min;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(null);
        }
        boolean[] zArr = new boolean[1];
        int i13 = 0;
        while (i13 < arrayList.size()) {
            Utilities.Callback2 callback22 = callback2;
            new b41(str2, str3, (String) arrayList.get(i13), new ei.h1(zArr, arrayList2, i13, callback22, 5)).start();
            i13++;
            callback2 = callback22;
        }
    }

    public static String y(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public final CharSequence F(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.N != null || this.M != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new c41(this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, this.F.getPaint().getFontMetricsInt(), true);
    }

    public final void G(boolean z10) {
        n90 n90Var = this.F;
        if (n90Var != null) {
            n90Var.setTextIsSelectable(!z10);
        }
        if (z10) {
            getWindow().addFlags(8192);
            AndroidUtilities.logFlagSecure();
        } else {
            getWindow().clearFlags(8192);
            AndroidUtilities.logFlagSecure();
        }
    }

    public final void M() {
        if (this.b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.b.intValue(), true);
            this.b = null;
        }
        if ("alternative".equalsIgnoreCase(MessagesController.getInstance(this.currentAccount).translationsManualEnabled)) {
            N();
            return;
        }
        String str = this.v;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        TL_iv.RichMessage richMessage = this.h;
        int i10 = this.e;
        TLRPC.InputPeer inputPeer = this.d;
        if (richMessage != null && inputPeer != null) {
            TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
            tL_messages_translateRichMessage.flags = 1 | tL_messages_translateRichMessage.flags;
            tL_messages_translateRichMessage.peer = inputPeer;
            tL_messages_translateRichMessage.id.add(Integer.valueOf(i10));
            tL_messages_translateRichMessage.to_lang = TranslateController.normalizeLanguage(str);
            this.b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateRichMessage, new x1(this, 16)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence = this.c;
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.f && inputPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = inputPeer;
            tL_messages_summarizeText.id = i10;
            tL_messages_summarizeText.to_lang = TranslateController.normalizeLanguage(str);
            this.b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new org.telegram.messenger.a(), new ai.m0(13, this, tL_textWithEntities)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (inputPeer != null) {
            tL_messages_translateText.flags = 1 | tL_messages_translateText.flags;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.id.add(Integer.valueOf(i10));
        } else {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = TranslateController.normalizeLanguage(str);
        this.b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateText, new org.telegram.ui.oo(17, this, tL_textWithEntities)));
    }

    public final void N() {
        CharSequence charSequence = this.c;
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        String str = this.s;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        String str2 = this.v;
        if (str2 != null) {
            str2 = str2.split("_")[0];
        }
        x(charSequence2, str, "nb".equals(str2) ? "no" : str2, new d(this, 21));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.y.invalidate();
            this.F.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.translationModelDownloaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.translationModelDownloading);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        if (this.b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.b.intValue(), true);
            this.b = null;
        }
        super.dismissInternal();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.translationModelDownloaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.translationModelDownloading);
    }

    public final float z(boolean z10) {
        d6 d6Var;
        y31 y31Var = this.H;
        float top = y31Var.getTop();
        if (y31Var.getChildCount() >= 1) {
            top += Math.max(0, y31Var.getChildAt(y31Var.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - AndroidUtilities.dp(78.0f));
        if (z10 && (d6Var = this.P) != null) {
            if (!y31Var.K1 && !this.G) {
                return d6Var.d(max, false);
            }
            d6Var.d(max, true);
        }
        return max;
    }
}
