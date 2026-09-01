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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class w31 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final String[] O = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap P;
    public final h31 B;
    public final g90 C;
    public boolean D;
    public final i31 E;
    public final v31 F;
    public final org.telegram.ui.Cells.m9 G;
    public final org.telegram.ui.Cells.y9 H;
    public final View I;
    public org.telegram.ui.ActionBar.p2 J;
    public Utilities.CallbackReturn K;
    public boolean L;
    public final z5 M;
    public Boolean N;
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
    public final u31 x;
    public final fg.s0 y;

    public w31(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z4, TL_iv.RichMessage richMessage) {
        super(context, null, false, false);
        this.L = true;
        this.backgroundPaddingLeft = 0;
        fixNavigationBar();
        this.c = charSequence;
        this.d = inputPeer;
        this.e = i10;
        this.f = z4;
        this.h = richMessage;
        this.s = str;
        this.v = str2;
        eg.q1 q1Var = new eg.q1(this, context);
        this.containerView = q1Var;
        this.M = new z5(q1Var, 320L, pr.h);
        fg.s0 s0Var = new fg.s0(context, 5);
        this.y = s0Var;
        s0Var.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        s0Var.setTextSize(1, SharedConfig.fontSize);
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        s0Var.setTextColor(getThemedColor(i11));
        s0Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.l1(0.2f, getThemedColor(i11)));
        s0Var.setText(Emoji.replaceEmoji(charSequence == null ? "" : charSequence.toString(), s0Var.getPaint().getFontMetricsInt(), true));
        this.B = new h31(context);
        g90 g90Var = new g90(context, null);
        this.C = g90Var;
        g90Var.setDisablePaddingsOffsetY(true);
        g90Var.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        g90Var.setTextSize(1, SharedConfig.fontSize);
        g90Var.setTextColor(getThemedColor(i11));
        g90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.gc));
        g90Var.setTextIsSelectable(true);
        g90Var.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.k6.uf));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.vf);
        try {
            if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
                Drawable textSelectHandleLeft = g90Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(themedColor, mode);
                g90Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandleRight = g90Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(themedColor, mode);
                g90Var.setTextSelectHandleRight(textSelectHandleRight);
            }
        } catch (Exception unused) {
        }
        this.B.addView(this.C, k7.c6.c(-1.0f, -1));
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
        i31 i31Var = new i31(this, context);
        this.E = i31Var;
        i31Var.setOverScrollMode(1);
        i31Var.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.dp(80.0f));
        i31Var.setClipToPadding(true);
        f2.j0 j0Var = new f2.j0();
        i31Var.setLayoutManager(j0Var);
        View view = this.h != null ? this.n : this.y;
        v31 v31Var = new v31();
        v31Var.e = 1;
        v31Var.c = context;
        v31Var.d = view;
        this.F = v31Var;
        i31Var.setAdapter(v31Var);
        i31Var.setOnScrollListener(new j31(this));
        k31 k31Var = new k31(this);
        k31Var.n(180L);
        k31Var.o(new LinearInterpolator());
        i31Var.setItemAnimator(k31Var);
        this.containerView.addView(i31Var, k7.c6.e(-1, -2, 80));
        org.telegram.ui.Cells.m9 m9Var = new org.telegram.ui.Cells.m9();
        this.G = m9Var;
        m9Var.T(i31Var);
        m9Var.E0 = j0Var;
        org.telegram.ui.Cells.y9 o10 = m9Var.o(context);
        this.H = o10;
        AndroidUtilities.removeFromParent(o10);
        this.containerView.addView(o10, k7.c6.e(-1, -1, 119));
        RichMessageLayout.PreviewView previewView3 = this.r;
        if (previewView3 != null) {
            previewView3.setTextSelectionHelper(m9Var);
        }
        u31 u31Var = new u31(this, context);
        this.x = u31Var;
        this.containerView.addView(u31Var, k7.c6.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
        View view2 = new View(context);
        this.I = view2;
        view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.V5));
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, k7.c6.a(-1.0f, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55));
        TextView textView = new TextView(context);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.CloseTranslation));
        textView.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{24.0f}, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false)));
        textView.setOnClickListener(new b80(this, 23));
        frameLayout.addView(textView, k7.c6.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.containerView.addView(frameLayout, k7.c6.e(-1, -2, 87));
        M();
    }

    public static String B() {
        return MessagesController.getGlobalMainSettings().getString("translate_to_language", LocaleController.getInstance().getCurrentLocale().getLanguage());
    }

    public static HashMap C(CharSequence charSequence) {
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
            boolean z4 = (string == null || string.startsWith("LOC_ERR")) ? false : true;
            zArr[0] = z4;
            if (z4) {
                return string;
            }
        }
        if (zArr2 != null) {
            String string2 = LocaleController.getString("TranslateLanguageGenitive" + str2.toUpperCase());
            boolean z10 = (string2 == null || string2.startsWith("LOC_ERR")) ? false : true;
            zArr2[0] = z10;
            if (z10) {
                return string2;
            }
        }
        String K = K(str, false);
        if (K == null) {
            K = K(str2, false);
        }
        if (K != null) {
            return K;
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
            HashMap C = C(tL_textWithEntities.text);
            HashMap C2 = C(tL_textWithEntities2.text);
            for (int i12 = 0; i12 < tL_textWithEntities.entities.size(); i12++) {
                TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i12);
                if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    String str2 = tL_textWithEntities.text;
                    int i13 = messageEntity2.offset;
                    String substring2 = str2.substring(i13, messageEntity2.length + i13);
                    if (!TextUtils.isEmpty(substring2)) {
                        ArrayList arrayList2 = (ArrayList) C.get(substring2);
                        ArrayList arrayList3 = (ArrayList) C2.get(substring2);
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

    public static void H(String str) {
        MessagesController.getGlobalMainSettings().edit().putString("translate_to_language", str).apply();
    }

    public static n31 I(Activity activity, org.telegram.ui.xn xnVar, TLRPC.InputPeer inputPeer, int i10, boolean z4, String str, String str2, CharSequence charSequence, boolean z10, org.telegram.ui.pf pfVar, Runnable runnable) {
        n31 n31Var = new n31(activity, str, str2, charSequence, inputPeer, i10, z4, runnable);
        n31Var.G(z10);
        n31Var.J = xnVar;
        n31Var.K = pfVar;
        if (xnVar.getParentActivity() != null) {
            xnVar.showDialog(n31Var);
        }
        return n31Var;
    }

    public static void J(Context context, org.telegram.ui.ActionBar.p2 p2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.i20 i20Var, org.telegram.ui.Cells.g gVar) {
        if (context == null) {
            return;
        }
        p31 p31Var = new p31(context, str, str2, charSequence, gVar);
        p31Var.G(false);
        p31Var.J = p2Var;
        p31Var.K = i20Var;
        if (p2Var == null) {
            p31Var.show();
        } else if (p2Var.getParentActivity() != null) {
            p2Var.showDialog(p31Var);
        }
    }

    public static String K(String str, boolean z4) {
        if (str == null) {
            return null;
        }
        if (P == null) {
            P = new HashMap();
            try {
                Locale[] availableLocales = Locale.getAvailableLocales();
                for (int i10 = 0; i10 < availableLocales.length; i10++) {
                    P.put(availableLocales[i10].getLanguage(), availableLocales[i10]);
                    String country = availableLocales[i10].getCountry();
                    if (country != null && country.length() > 0) {
                        P.put(availableLocales[i10].getLanguage() + "-" + country.toLowerCase(), availableLocales[i10]);
                    }
                }
            } catch (Exception unused) {
            }
        }
        String lowerCase = str.replace("_", "-").toLowerCase();
        try {
            Locale locale = (Locale) P.get(lowerCase);
            if (locale == null) {
                return null;
            }
            String displayLanguage = locale.getDisplayLanguage(z4 ? locale : Locale.getDefault());
            if (!lowerCase.contains("-")) {
                return displayLanguage;
            }
            String displayCountry = locale.getDisplayCountry(z4 ? locale : Locale.getDefault());
            if (TextUtils.isEmpty(displayCountry)) {
                return displayLanguage;
            }
            return displayLanguage + " (" + displayCountry + ")";
        } catch (Exception unused2) {
            return null;
        }
    }

    public static void m(w31 w31Var, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, TLRPC.TL_error tL_error) {
        h31 h31Var = w31Var.B;
        v31 v31Var = w31Var.F;
        w31Var.b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            w31Var.N();
            return;
        }
        if (tL_textWithEntities2 != null) {
            w31Var.L = false;
            TLRPC.TL_textWithEntities E = E(tL_textWithEntities, tL_textWithEntities2);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(E.text);
            MessageObject.addEntitiesToText(valueOf, E.entities, false, true, false, false);
            w31Var.C.setText(w31Var.F(valueOf));
            v31Var.D(h31Var);
            return;
        }
        if (w31Var.L) {
            w31Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.y3.s(R.string.TranslationFailedAlert2, new qc((FrameLayout) w31Var.containerView, w31Var.resourcesProvider), null);
        s31 s31Var = w31Var.x.e;
        String str = w31Var.w;
        w31Var.v = str;
        s31Var.setText(D(str, null, null));
        v31Var.D(h31Var);
    }

    public static void n(w31 w31Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        h31 h31Var = w31Var.B;
        v31 v31Var = w31Var.F;
        w31Var.b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            w31Var.N();
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                w31Var.L = false;
                TLRPC.TL_textWithEntities E = E(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(E.text);
                MessageObject.addEntitiesToText(valueOf, E.entities, false, true, false, false);
                w31Var.C.setText(w31Var.F(valueOf));
                v31Var.D(h31Var);
                return;
            }
        }
        if (w31Var.L) {
            w31Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.y3.s(R.string.TranslationFailedAlert2, new qc((FrameLayout) w31Var.containerView, w31Var.resourcesProvider), null);
        s31 s31Var = w31Var.x.e;
        String str = w31Var.w;
        w31Var.v = str;
        s31Var.setText(D(str, null, null));
        v31Var.D(h31Var);
    }

    public static void o(w31 w31Var, TLObject tLObject) {
        RichMessageLayout.PreviewView previewView = w31Var.r;
        w31Var.b = null;
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
            if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                w31Var.L = false;
                TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                if (previewView != null) {
                    previewView.set(richMessage);
                    w31Var.F.D(previewView);
                    return;
                }
                return;
            }
        }
        if (w31Var.L) {
            w31Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.y3.s(R.string.TranslationFailedAlert2, new qc((FrameLayout) w31Var.containerView, w31Var.resourcesProvider), null);
        s31 s31Var = w31Var.x.e;
        String str = w31Var.w;
        w31Var.v = str;
        s31Var.setText(D(str, null, null));
    }

    public static void p(w31 w31Var, String str, Boolean bool) {
        h31 h31Var = w31Var.B;
        v31 v31Var = w31Var.F;
        if (str != null) {
            w31Var.L = false;
            w31Var.C.setText(w31Var.F(str));
            v31Var.D(h31Var);
        } else {
            if (w31Var.isDismissed()) {
                return;
            }
            if (w31Var.L) {
                w31Var.dismiss();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2));
                return;
            }
            org.telegram.messenger.y3.s(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2, new qc((FrameLayout) w31Var.containerView, w31Var.resourcesProvider), null);
            s31 s31Var = w31Var.x.e;
            String str2 = w31Var.w;
            w31Var.v = str2;
            s31Var.setText(D(str2, null, null));
            v31Var.D(h31Var);
        }
    }

    public static boolean u(w31 w31Var) {
        i31 i31Var = w31Var.E;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < i31Var.getChildCount(); i10++) {
            if (RecyclerView.R(i31Var.getChildAt(i10)) == 1) {
                f10 += r3.getHeight();
            }
        }
        return f10 >= ((float) ((i31Var.getHeight() - i31Var.getPaddingTop()) - i31Var.getPaddingBottom()));
    }

    public static void x(String str, String str2, String str3, Utilities.Callback2 callback2) {
        if (str2 == null) {
            LanguageDetector.detectLanguage(str, new g31(str, str3, callback2), new g31(str, str3, callback2));
            return;
        }
        String encode = Uri.encode(str);
        if (encode.length() <= 5000) {
            new l31(str2, str3, encode, callback2).start();
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
            new l31(str2, str3, (String) arrayList.get(i13), new mh.h0(zArr, arrayList2, i13, callback22, 4)).start();
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

    public final float A(boolean z4) {
        z5 z5Var;
        i31 i31Var = this.E;
        float top = i31Var.getTop();
        if (i31Var.getChildCount() >= 1) {
            top += Math.max(0, i31Var.getChildAt(i31Var.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - AndroidUtilities.dp(78.0f));
        if (z4 && (z5Var = this.M) != null) {
            if (!i31Var.H1 && !this.D) {
                return z5Var.d(max, false);
            }
            z5Var.d(max, true);
        }
        return max;
    }

    public final CharSequence F(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.K != null || this.J != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new m31(this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, this.C.getPaint().getFontMetricsInt(), true);
    }

    public final void G(boolean z4) {
        g90 g90Var = this.C;
        if (g90Var != null) {
            g90Var.setTextIsSelectable(!z4);
        }
        if (z4) {
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
            this.b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateRichMessage, new y1(this, 16)));
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
            this.b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new org.telegram.messenger.a(), new eh.w(18, this, tL_textWithEntities)));
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
        this.b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateText, new org.telegram.ui.lo(17, this, tL_textWithEntities)));
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

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.y.invalidate();
            this.C.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.translationModelDownloaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.translationModelDownloading);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        if (this.b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.b.intValue(), true);
            this.b = null;
        }
        super.dismissInternal();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.translationModelDownloaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.translationModelDownloading);
    }
}
