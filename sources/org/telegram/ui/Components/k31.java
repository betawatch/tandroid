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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class k31 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final String[] N = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap O;
    public final w21 A;
    public final y80 B;
    public boolean C;
    public final x21 D;
    public final j31 E;
    public final org.telegram.ui.Cells.k9 F;
    public final org.telegram.ui.Cells.w9 G;
    public final View H;
    public org.telegram.ui.ActionBar.o2 I;
    public Utilities.CallbackReturn J;
    public boolean K;
    public final d6 L;
    public Boolean M;
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
    public final i31 x;
    public final cg.s0 y;

    public k31(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, TL_iv.RichMessage richMessage) {
        super(context, null, false, false);
        this.K = true;
        this.backgroundPaddingLeft = 0;
        fixNavigationBar();
        this.c = charSequence;
        this.d = inputPeer;
        this.e = i10;
        this.f = z10;
        this.h = richMessage;
        this.s = str;
        this.v = str2;
        bg.u1 u1Var = new bg.u1(this, context);
        this.containerView = u1Var;
        this.L = new d6(u1Var, 320L, jr.h);
        cg.s0 s0Var = new cg.s0(context, 7);
        this.y = s0Var;
        s0Var.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        s0Var.setTextSize(1, SharedConfig.fontSize);
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        s0Var.setTextColor(getThemedColor(i11));
        s0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.l1(0.2f, getThemedColor(i11)));
        s0Var.setText(Emoji.replaceEmoji(charSequence == null ? "" : charSequence.toString(), s0Var.getPaint().getFontMetricsInt(), true));
        this.A = new w21(context);
        y80 y80Var = new y80(context, null);
        this.B = y80Var;
        y80Var.setDisablePaddingsOffsetY(true);
        y80Var.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        y80Var.setTextSize(1, SharedConfig.fontSize);
        y80Var.setTextColor(getThemedColor(i11));
        y80Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.gc));
        y80Var.setTextIsSelectable(true);
        y80Var.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.g6.uf));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.vf);
        try {
            if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
                Drawable textSelectHandleLeft = y80Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(themedColor, mode);
                y80Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandleRight = y80Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(themedColor, mode);
                y80Var.setTextSelectHandleRight(textSelectHandleRight);
            }
        } catch (Exception unused) {
        }
        this.A.addView(this.B, i7.f6.c(-1.0f, -1));
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
        x21 x21Var = new x21(this, context);
        this.D = x21Var;
        x21Var.setOverScrollMode(1);
        x21Var.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.dp(80.0f));
        x21Var.setClipToPadding(true);
        f2.j0 j0Var = new f2.j0();
        x21Var.setLayoutManager(j0Var);
        View view = this.h != null ? this.n : this.y;
        j31 j31Var = new j31();
        j31Var.e = 1;
        j31Var.c = context;
        j31Var.d = view;
        this.E = j31Var;
        x21Var.setAdapter(j31Var);
        x21Var.setOnScrollListener(new y21(this));
        z21 z21Var = new z21(this);
        z21Var.n(180L);
        z21Var.o(new LinearInterpolator());
        x21Var.setItemAnimator(z21Var);
        this.containerView.addView(x21Var, i7.f6.e(-1, -2, 80));
        org.telegram.ui.Cells.k9 k9Var = new org.telegram.ui.Cells.k9();
        this.F = k9Var;
        k9Var.T(x21Var);
        k9Var.E0 = j0Var;
        org.telegram.ui.Cells.w9 o10 = k9Var.o(context);
        this.G = o10;
        AndroidUtilities.removeFromParent(o10);
        this.containerView.addView(o10, i7.f6.e(-1, -1, 119));
        RichMessageLayout.PreviewView previewView3 = this.r;
        if (previewView3 != null) {
            previewView3.setTextSelectionHelper(k9Var);
        }
        i31 i31Var = new i31(this, context);
        this.x = i31Var;
        this.containerView.addView(i31Var, i7.f6.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
        View view2 = new View(context);
        this.H = view2;
        view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.V5));
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, i7.f6.a(-1.0f, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55));
        TextView textView = new TextView(context);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.CloseTranslation));
        textView.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false)));
        textView.setOnClickListener(new u70(this, 23));
        frameLayout.addView(textView, i7.f6.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.containerView.addView(frameLayout, i7.f6.e(-1, -2, 87));
        L();
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

    public static c31 I(Activity activity, org.telegram.ui.tn tnVar, TLRPC.InputPeer inputPeer, int i10, boolean z10, String str, String str2, CharSequence charSequence, boolean z11, org.telegram.ui.hf hfVar, Runnable runnable) {
        c31 c31Var = new c31(activity, str, str2, charSequence, inputPeer, i10, z10, runnable);
        c31Var.G(z11);
        c31Var.I = tnVar;
        c31Var.J = hfVar;
        if (tnVar.getParentActivity() != null) {
            tnVar.showDialog(c31Var);
        }
        return c31Var;
    }

    public static void J(Context context, org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.v10 v10Var, org.telegram.ui.Cells.g gVar) {
        if (context == null) {
            return;
        }
        e31 e31Var = new e31(context, str, str2, charSequence, gVar);
        e31Var.G(false);
        e31Var.I = o2Var;
        e31Var.J = v10Var;
        if (o2Var == null) {
            e31Var.show();
        } else if (o2Var.getParentActivity() != null) {
            o2Var.showDialog(e31Var);
        }
    }

    public static String K(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (O == null) {
            O = new HashMap();
            try {
                Locale[] availableLocales = Locale.getAvailableLocales();
                for (int i10 = 0; i10 < availableLocales.length; i10++) {
                    O.put(availableLocales[i10].getLanguage(), availableLocales[i10]);
                    String country = availableLocales[i10].getCountry();
                    if (country != null && country.length() > 0) {
                        O.put(availableLocales[i10].getLanguage() + "-" + country.toLowerCase(), availableLocales[i10]);
                    }
                }
            } catch (Exception unused) {
            }
        }
        String lowerCase = str.replace("_", "-").toLowerCase();
        try {
            Locale locale = (Locale) O.get(lowerCase);
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

    public static void m(k31 k31Var, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, TLRPC.TL_error tL_error) {
        w21 w21Var = k31Var.A;
        j31 j31Var = k31Var.E;
        k31Var.b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            k31Var.M();
            return;
        }
        if (tL_textWithEntities2 != null) {
            k31Var.K = false;
            TLRPC.TL_textWithEntities E = E(tL_textWithEntities, tL_textWithEntities2);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(E.text);
            MessageObject.addEntitiesToText(valueOf, E.entities, false, true, false, false);
            k31Var.B.setText(k31Var.F(valueOf));
            j31Var.D(w21Var);
            return;
        }
        if (k31Var.K) {
            k31Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.x3.s(R.string.TranslationFailedAlert2, new tc((FrameLayout) k31Var.containerView, k31Var.resourcesProvider), null);
        g31 g31Var = k31Var.x.e;
        String str = k31Var.w;
        k31Var.v = str;
        g31Var.setText(D(str, null, null));
        j31Var.D(w21Var);
    }

    public static void n(k31 k31Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        w21 w21Var = k31Var.A;
        j31 j31Var = k31Var.E;
        k31Var.b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            k31Var.M();
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                k31Var.K = false;
                TLRPC.TL_textWithEntities E = E(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(E.text);
                MessageObject.addEntitiesToText(valueOf, E.entities, false, true, false, false);
                k31Var.B.setText(k31Var.F(valueOf));
                j31Var.D(w21Var);
                return;
            }
        }
        if (k31Var.K) {
            k31Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.x3.s(R.string.TranslationFailedAlert2, new tc((FrameLayout) k31Var.containerView, k31Var.resourcesProvider), null);
        g31 g31Var = k31Var.x.e;
        String str = k31Var.w;
        k31Var.v = str;
        g31Var.setText(D(str, null, null));
        j31Var.D(w21Var);
    }

    public static void o(k31 k31Var, TLObject tLObject) {
        RichMessageLayout.PreviewView previewView = k31Var.r;
        k31Var.b = null;
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
            if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                k31Var.K = false;
                TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                if (previewView != null) {
                    previewView.set(richMessage);
                    k31Var.E.D(previewView);
                    return;
                }
                return;
            }
        }
        if (k31Var.K) {
            k31Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.x3.s(R.string.TranslationFailedAlert2, new tc((FrameLayout) k31Var.containerView, k31Var.resourcesProvider), null);
        g31 g31Var = k31Var.x.e;
        String str = k31Var.w;
        k31Var.v = str;
        g31Var.setText(D(str, null, null));
    }

    public static void p(k31 k31Var, String str, Boolean bool) {
        w21 w21Var = k31Var.A;
        j31 j31Var = k31Var.E;
        if (str != null) {
            k31Var.K = false;
            k31Var.B.setText(k31Var.F(str));
            j31Var.D(w21Var);
        } else {
            if (k31Var.isDismissed()) {
                return;
            }
            if (k31Var.K) {
                k31Var.dismiss();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2));
                return;
            }
            org.telegram.messenger.x3.s(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2, new tc((FrameLayout) k31Var.containerView, k31Var.resourcesProvider), null);
            g31 g31Var = k31Var.x.e;
            String str2 = k31Var.w;
            k31Var.v = str2;
            g31Var.setText(D(str2, null, null));
            j31Var.D(w21Var);
        }
    }

    public static boolean u(k31 k31Var) {
        x21 x21Var = k31Var.D;
        float f9 = 0.0f;
        for (int i10 = 0; i10 < x21Var.getChildCount(); i10++) {
            if (RecyclerView.R(x21Var.getChildAt(i10)) == 1) {
                f9 += r3.getHeight();
            }
        }
        return f9 >= ((float) ((x21Var.getHeight() - x21Var.getPaddingTop()) - x21Var.getPaddingBottom()));
    }

    public static void x(String str, String str2, String str3, Utilities.Callback2 callback2) {
        if (str2 == null) {
            LanguageDetector.detectLanguage(str, new v21(str, str3, callback2), new v21(str, str3, callback2));
            return;
        }
        String encode = Uri.encode(str);
        if (encode.length() <= 5000) {
            new a31(str2, str3, encode, callback2).start();
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
            new a31(str2, str3, (String) arrayList.get(i13), new jh.i0(zArr, arrayList2, i13, callback22, 4)).start();
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

    public final float A(boolean z10) {
        d6 d6Var;
        x21 x21Var = this.D;
        float top = x21Var.getTop();
        if (x21Var.getChildCount() >= 1) {
            top += Math.max(0, x21Var.getChildAt(x21Var.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - AndroidUtilities.dp(78.0f));
        if (z10 && (d6Var = this.L) != null) {
            if (!x21Var.G1 && !this.C) {
                return d6Var.d(max, false);
            }
            d6Var.d(max, true);
        }
        return max;
    }

    public final CharSequence F(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.J != null || this.I != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new b31(this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, this.B.getPaint().getFontMetricsInt(), true);
    }

    public final void G(boolean z10) {
        y80 y80Var = this.B;
        if (y80Var != null) {
            y80Var.setTextIsSelectable(!z10);
        }
        if (z10) {
            getWindow().addFlags(8192);
            AndroidUtilities.logFlagSecure();
        } else {
            getWindow().clearFlags(8192);
            AndroidUtilities.logFlagSecure();
        }
    }

    public final void L() {
        if (this.b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.b.intValue(), true);
            this.b = null;
        }
        if ("alternative".equalsIgnoreCase(MessagesController.getInstance(this.currentAccount).translationsManualEnabled)) {
            M();
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
            this.b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateRichMessage, new a2(this, 16)));
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
            this.b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new org.telegram.messenger.a(), new bh.v(19, this, tL_textWithEntities)));
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
        this.b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateText, new org.telegram.ui.zg(20, this, tL_textWithEntities)));
    }

    public final void M() {
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
            this.B.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
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
}
