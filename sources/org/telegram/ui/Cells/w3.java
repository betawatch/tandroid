package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ParagraphStyle;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.z11;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w3 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.u6 b;
    public final org.telegram.ui.Components.y9 c;
    public final org.telegram.ui.Components.y9[] d;
    public final TextView[] e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final LinearLayout r;
    public boolean s;
    public int v;
    public boolean w;

    public w3(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = new org.telegram.ui.Components.y9[3];
        this.e = new TextView[2];
        this.a = i10;
        this.b = u6Var;
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.r = linearLayout;
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutDirection(LocaleController.isRTL ? 1 : 0);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        linearLayout.addView(y9Var, kb1.r(16, 16));
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        TextView c10 = c(context, 13, i11);
        this.f = c10;
        NotificationCenter.listenEmojiLoading(c10);
        c10.setTypeface(AndroidUtilities.bold());
        c10.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c10.setEllipsize(truncateAt);
        linearLayout.addView(c10, kb1.o(6.0f, 0.0f, 6.0f, 0.0f, -2, 16));
        TextView c11 = c(context, 13, org.telegram.ui.ActionBar.y6.y6);
        this.h = c11;
        c11.setSingleLine(true);
        linearLayout.addView(c11, kb1.r(-2, 16));
        addView(linearLayout);
        TextView c12 = c(context, 14, i11);
        this.n = c12;
        NotificationCenter.listenEmojiLoading(c12);
        c12.setMaxLines(3);
        c12.setEllipsize(truncateAt);
        c12.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        c12.setLineSpacing(AndroidUtilities.dp(18.0f) - c12.getPaint().getFontSpacing(), 1.0f);
        addView(c12);
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.y9[] y9VarArr = this.d;
            if (i12 >= y9VarArr.length) {
                break;
            }
            org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
            y9VarArr[i12] = y9Var2;
            y9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
            y9Var2.getImageReceiver().setCrossfadeAlpha((byte) 1);
            addView(y9Var2);
            i12++;
        }
        int i13 = 0;
        while (true) {
            TextView[] textViewArr = this.e;
            if (i13 >= textViewArr.length) {
                return;
            }
            TextView c13 = c(context, 12, org.telegram.ui.ActionBar.y6.G6);
            textViewArr[i13] = c13;
            c13.setTextColor(-1);
            c13.setGravity(17);
            c13.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            c13.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(4.0f), TLObject.FLAG_31));
            addView(c13);
            i13++;
        }
    }

    public final int a() {
        return AndroidUtilities.dp(this.v == 2 ? 100.0f : 72.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0348 A[EDGE_INSN: B:192:0x0348->B:193:0x0348 BREAK  A[LOOP:6: B:180:0x032a->B:189:0x0345], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0326  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(MessageObject messageObject, ArrayList arrayList) {
        String str;
        CharSequence charSequence;
        int i10;
        ArrayList arrayList2;
        int i11;
        int size;
        TextView[] textViewArr;
        org.telegram.ui.Components.y9[] y9VarArr;
        int i12;
        int i13;
        int i14;
        int i15;
        Drawable drawable;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        String str2;
        TLRPC.WebPage webPage;
        Object[] objArr;
        int i16;
        TLRPC.Message message = messageObject.messageOwner;
        long dialogId = messageObject.getDialogId();
        int i17 = this.a;
        TLObject chat = dialogId < 0 ? MessagesController.getInstance(i17).getChat(Long.valueOf(-dialogId)) : MessagesController.getInstance(i17).getUser(Long.valueOf(dialogId));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        if (chat instanceof TLRPC.Chat) {
            TLRPC.Chat chat2 = (TLRPC.Chat) chat;
            j9Var.q(chat2);
            str = chat2.title;
        } else if (chat instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) chat;
            j9Var.r(user);
            str = UserObject.getUserName(user);
        } else {
            str = "";
        }
        this.c.f(chat, j9Var);
        ArrayList<String> arrayList3 = messageObject.highlightedWords;
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        if (arrayList3 == null || arrayList3.isEmpty() || (charSequence = AndroidUtilities.highlightText(str, arrayList3, u6Var)) == null) {
            charSequence = str;
        }
        TextView textView = this.f;
        textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
        String formatShortDate = LocaleController.formatShortDate(message.date);
        TextView textView2 = this.h;
        textView2.setText(formatShortDate);
        int i18 = 1;
        boolean z10 = TextUtils.isEmpty(message.message) && message.rich_message == null;
        CharSequence charSequence2 = TextUtils.isEmpty(message.message) ? messageObject.messageText : message.message;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2 != null ? charSequence2 : "");
        for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Emoji.EmojiSpan.class)) {
            spannableStringBuilder.removeSpan(emojiSpan);
        }
        for (int i19 = 0; i19 < spannableStringBuilder.length(); i19++) {
            if (spannableStringBuilder.charAt(i19) == '\n') {
                spannableStringBuilder.replace(i19, i19 + 1, (CharSequence) " ");
            }
        }
        if (!TextUtils.isEmpty(message.message)) {
            MessageObject.addEntitiesToText(spannableStringBuilder, message.entities, false, true, false, false);
        }
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        int length = spans.length;
        int i20 = 0;
        while (i20 < length) {
            Object obj = spans[i20];
            if ((obj instanceof ClickableSpan) || (obj instanceof x61) || (obj instanceof TypefaceSpan) || (obj instanceof ni.h) || (obj instanceof ni.d) || (obj instanceof sj0) || (obj instanceof ParagraphStyle)) {
                objArr = spans;
                i16 = i18;
                spannableStringBuilder.removeSpan(obj);
            } else if ((obj instanceof r61) || ((obj instanceof StyleSpan) && ((StyleSpan) obj).getStyle() == i18)) {
                objArr = spans;
                i16 = i18;
                spannableStringBuilder.removeSpan(obj);
            } else if (obj instanceof a21) {
                z11 z11Var = ((a21) obj).b;
                i16 = i18;
                if (z11Var.b() == AndroidUtilities.bold()) {
                    int spanStart = spannableStringBuilder.getSpanStart(obj);
                    int spanEnd = spannableStringBuilder.getSpanEnd(obj);
                    int spanFlags = spannableStringBuilder.getSpanFlags(obj);
                    objArr = spans;
                    z11 z11Var2 = new z11(z11Var);
                    z11Var2.a &= -2;
                    spannableStringBuilder.removeSpan(obj);
                    if (z11Var2.a != 0) {
                        spannableStringBuilder.setSpan(new a21(z11Var2, 0), spanStart, spanEnd, spanFlags);
                    }
                } else {
                    objArr = spans;
                }
            } else {
                objArr = spans;
                i16 = i18;
            }
            i20++;
            i18 = i16;
            spans = objArr;
        }
        int i21 = i18;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int indexOf = spannableStringBuilder.toString().toLowerCase().indexOf(arrayList3.get(0));
            if (indexOf > 40) {
                int i22 = indexOf - 20;
                while (i22 < indexOf && !Character.isWhitespace(spannableStringBuilder.charAt(i22))) {
                    i22++;
                }
                if (i22 < indexOf) {
                    spannableStringBuilder.delete(0, i22 + 1);
                    spannableStringBuilder.insert(0, (CharSequence) "…");
                }
            }
            ?? highlightText = AndroidUtilities.highlightText(spannableStringBuilder, arrayList3, u6Var);
            if (highlightText != 0) {
                spannableStringBuilder = highlightText;
            }
        }
        TextView textView3 = this.n;
        textView3.setText(Emoji.replaceEmoji(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false));
        textView3.setAlpha(z10 ? 0.5f : 1.0f);
        this.v = 0;
        if (arrayList != null) {
            i10 = i21;
            if (arrayList.size() > i10) {
                arrayList2 = arrayList;
                i11 = 0;
                while (true) {
                    size = arrayList2.size();
                    textViewArr = this.e;
                    y9VarArr = this.d;
                    if (i11 < size || (i15 = this.v) >= y9VarArr.length) {
                        break;
                    }
                    org.telegram.ui.Components.y9 y9Var = y9VarArr[i15];
                    y9Var.setImageDrawable(null);
                    MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
                    Drawable drawable2 = messageObject2.strippedThumb;
                    TLRPC.MessageMedia media = MessageObject.getMedia(messageObject2.messageOwner);
                    TLRPC.Photo photo = media != null ? media.photo : null;
                    TLRPC.Document document = messageObject2.getDocument();
                    if (photo == null && media != null && (webPage = media.webpage) != null) {
                        photo = webPage.photo;
                    }
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(72.0f), true, null, true);
                        ImageLocation forPhoto = closestPhotoSizeWithSize != null ? ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo) : null;
                        if (drawable2 == null) {
                            drawable2 = ImageLoader.createStripedBitmap(photo.sizes);
                        }
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
                        drawable = drawable2;
                        imageLocation2 = (closestPhotoSizeWithSize2 == null || closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) ? null : ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo);
                        imageLocation = forPhoto;
                    } else {
                        if (document != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(72.0f), true, null, true);
                            ImageLocation forDocument = closestPhotoSizeWithSize3 != null ? ImageLocation.getForDocument(closestPhotoSizeWithSize3, document) : null;
                            if (drawable2 == null) {
                                drawable2 = ImageLoader.createStripedBitmap(document.thumbs);
                            }
                            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40);
                            if (closestPhotoSizeWithSize4 == null || closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                                drawable = drawable2;
                                imageLocation = forDocument;
                            } else {
                                drawable = drawable2;
                                imageLocation2 = ImageLocation.getForDocument(closestPhotoSizeWithSize4, document);
                                imageLocation = forDocument;
                            }
                        } else {
                            drawable = drawable2;
                            imageLocation = null;
                        }
                        imageLocation2 = null;
                    }
                    if (imageLocation != null || drawable != null || imageLocation2 != null) {
                        y9Var.a.setImage(imageLocation, "72_72", imageLocation2, "72_72_b", drawable, 0L, null, messageObject2, 1);
                        y9Var.d();
                        int i23 = this.v;
                        if (i23 < textViewArr.length) {
                            TextView textView4 = textViewArr[i23];
                            MessageObject messageObject3 = (MessageObject) arrayList2.get(i11);
                            TLRPC.Document document2 = messageObject3.getDocument();
                            if (messageObject3.isVideo() && document2 != null) {
                                ArrayList<TLRPC.DocumentAttribute> arrayList4 = document2.attributes;
                                int size2 = arrayList4.size();
                                int i24 = 0;
                                while (i24 < size2) {
                                    TLRPC.DocumentAttribute documentAttribute = arrayList4.get(i24);
                                    i24++;
                                    TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo) {
                                        str2 = AndroidUtilities.formatShortDuration((int) documentAttribute2.duration);
                                        break;
                                    }
                                }
                            }
                            str2 = null;
                            textView4.setText(str2);
                        }
                        this.v++;
                    }
                    i11++;
                }
                this.s = this.v <= 0;
                i12 = 0;
                while (true) {
                    if (i12 < y9VarArr.length) {
                        break;
                    }
                    y9VarArr[i12].setVisibility(i12 < this.v ? 0 : 8);
                    if (i12 >= this.v) {
                        y9VarArr[i12].setImageDrawable(null);
                    }
                    i12++;
                }
                int dp = AndroidUtilities.dp(8.0f);
                if (this.v < 3) {
                    i13 = 0;
                    y9VarArr[0].getImageReceiver().setRoundRadius(dp, 0, 0, dp);
                    y9VarArr[1].getImageReceiver().setRoundRadius(0, dp, 0, 0);
                    y9VarArr[2].getImageReceiver().setRoundRadius(0, 0, dp, 0);
                } else {
                    i13 = 0;
                    for (org.telegram.ui.Components.y9 y9Var2 : y9VarArr) {
                        y9Var2.setRoundRadius(dp);
                    }
                }
                i14 = i13;
                while (i14 < textViewArr.length) {
                    TextView textView5 = textViewArr[i14];
                    int i25 = this.v;
                    textView5.setVisibility((i14 >= i25 || i25 > 2 || TextUtils.isEmpty(textView5.getText())) ? 8 : i13);
                    i14++;
                }
                StringBuilder l4 = b10.l(str, ", ");
                l4.append((Object) textView2.getText());
                l4.append(", ");
                l4.append((Object) textView3.getText());
                setContentDescription(l4.toString());
                requestLayout();
            }
        } else {
            i10 = i21;
        }
        arrayList2 = new ArrayList(i10);
        arrayList2.add(messageObject);
        i11 = 0;
        while (true) {
            size = arrayList2.size();
            textViewArr = this.e;
            y9VarArr = this.d;
            if (i11 < size) {
                break;
            } else {
                break;
            }
            i11++;
        }
        this.s = this.v <= 0;
        i12 = 0;
        while (true) {
            if (i12 < y9VarArr.length) {
            }
            i12++;
        }
        int dp2 = AndroidUtilities.dp(8.0f);
        if (this.v < 3) {
        }
        i14 = i13;
        while (i14 < textViewArr.length) {
        }
        StringBuilder l42 = b10.l(str, ", ");
        l42.append((Object) textView2.getText());
        l42.append(", ");
        l42.append((Object) textView3.getText());
        setContentDescription(l42.toString());
        requestLayout();
    }

    public final TextView c(Context context, int i10, int i11) {
        TextView textView = new TextView(context);
        textView.setTextSize(i10);
        org.telegram.ui.ActionBar.f7.V(textView, i11, this.b);
        textView.setIncludeFontPadding(false);
        textView.setElegantTextHeight(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            textView.setFallbackLineSpacing(false);
        }
        if (i12 >= 35) {
            textView.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        textView.setGravity(16);
        return textView;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w) {
            canvas.drawLine(AndroidUtilities.dp(14.0f), getHeight() - 1, getWidth(), getHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int a2 = (LocaleController.isRTL && this.s) ? a() + AndroidUtilities.dp(26.0f) : AndroidUtilities.dp(14.0f);
        int dp = AndroidUtilities.dp(10.0f);
        LinearLayout linearLayout = this.r;
        linearLayout.layout(a2, dp, linearLayout.getMeasuredWidth() + a2, AndroidUtilities.dp(26.0f));
        int dp2 = AndroidUtilities.dp(31.0f);
        TextView textView = this.n;
        textView.layout(a2, dp2, textView.getMeasuredWidth() + a2, textView.getMeasuredHeight() + AndroidUtilities.dp(31.0f));
        int dp3 = LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : (getWidth() - AndroidUtilities.dp(11.0f)) - a();
        int dp4 = AndroidUtilities.dp(10.0f);
        int dp5 = AndroidUtilities.dp(72.0f);
        int i14 = this.v;
        int i15 = 0;
        org.telegram.ui.Components.y9[] y9VarArr = this.d;
        if (i14 >= 3) {
            int measuredWidth = y9VarArr[0].getMeasuredWidth();
            int i16 = (dp3 + dp5) - measuredWidth;
            int i17 = dp5 + dp4;
            y9VarArr[0].layout(dp3, dp4, dp3 + measuredWidth, i17);
            int i18 = i16 + measuredWidth;
            y9VarArr[1].layout(i16, dp4, i18, dp4 + measuredWidth);
            y9VarArr[2].layout(i16, i17 - measuredWidth, i18, i17);
        } else {
            for (int i19 = 0; i19 < y9VarArr.length; i19++) {
                int b10 = wh.b(52.0f, i19, dp3);
                org.telegram.ui.Components.y9 y9Var = y9VarArr[i19];
                y9Var.layout(b10, dp4, y9Var.getMeasuredWidth() + b10, dp4 + dp5);
            }
        }
        while (true) {
            TextView[] textViewArr = this.e;
            if (i15 >= textViewArr.length) {
                return;
            }
            TextView textView2 = textViewArr[i15];
            int measuredWidth2 = (y9VarArr[i15].getMeasuredWidth() + wh.b(52.0f, i15, dp3)) - AndroidUtilities.dp(4.0f);
            textView2.layout(measuredWidth2 - textView2.getMeasuredWidth(), AndroidUtilities.dp(62.0f), measuredWidth2, AndroidUtilities.dp(78.0f));
            i15++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int a2 = size - (this.s ? a() + AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(25.0f));
        int dp = a2 - AndroidUtilities.dp(28.0f);
        TextView textView = this.h;
        this.f.setMaxWidth(Math.max(0, dp - ((int) textView.getPaint().measureText(textView.getText().toString()))));
        this.r.measure(View.MeasureSpec.makeMeasureSpec(a2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(a2, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), TLObject.FLAG_31);
        TextView textView2 = this.n;
        textView2.measure(makeMeasureSpec, makeMeasureSpec2);
        textView2.measure(View.MeasureSpec.makeMeasureSpec(a2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.max(1, Math.min(3, textView2.getLineCount())) * 18), TLObject.FLAG_30));
        int B = wh.B(2.0f, AndroidUtilities.dp(72.0f), 2);
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.y9[] y9VarArr = this.d;
            if (i12 >= y9VarArr.length) {
                break;
            }
            int i13 = this.v;
            y9VarArr[i12].measure(View.MeasureSpec.makeMeasureSpec(i13 >= 3 ? B : i13 == 2 ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(72.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((this.v < 3 || i12 <= 0) ? AndroidUtilities.dp(72.0f) : B, TLObject.FLAG_30));
            i12++;
        }
        for (TextView textView3 : this.e) {
            textView3.measure(View.MeasureSpec.makeMeasureSpec(this.v == 2 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(64.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(r3 + 42), this.s ? AndroidUtilities.dp(94.0f) : 0));
    }

    public void setMessage(MessageObject messageObject) {
        b(messageObject, null);
    }
}
