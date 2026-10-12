package fi;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.fo;
import org.telegram.ui.wf;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class n extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final c6 a;
    public final z9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final da0 h;

    public n(Activity activity, c6 c6Var) {
        super(activity);
        this.a = c6Var;
        LinearLayout f7 = org.telegram.messenger.q.f(activity, 0);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        w7.c6.b(f7, 0.025f, 1.4f);
        addView(f7, a6.e(-1, -1, 119));
        int i10 = g6.Oh;
        setBackground(g6.Z(g6.m1(0.1f, g6.w0(i10, c6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        f7.addView(linearLayout, a6.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, a6.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = g6.G6;
        textView.setTextColor(g6.w0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, a6.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(g6.w0(i10, c6Var));
        w7.c6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(g6.c0(AndroidUtilities.dp(9.0f), g6.m1(0.1f, g6.w0(i10, c6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, a6.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(g6.w0(i11, c6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, a6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        da0 da0Var = new da0(activity, null);
        this.h = da0Var;
        da0Var.setTextSize(1, 13.0f);
        da0Var.setLinkTextColor(g6.w0(g6.gc, c6Var));
        da0Var.setTextColor(g6.w0(i11, c6Var));
        linearLayout.addView(da0Var, a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(da0Var);
        z9 z9Var = new z9(activity);
        this.b = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        z9Var.setVisibility(8);
        f7.addView(z9Var, a6.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(g6.g0(5, g6.m1(0.2f, g6.w0(g6.W5, c6Var)), -1));
        w7.c6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.de, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ah.f(4));
        imageView.setVisibility(8);
        f7.addView(imageView, a6.t(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final fo foVar, final MessageObject messageObject, wf wfVar, wf wfVar2) {
        boolean z10;
        boolean z11;
        float measureText;
        float measureText2;
        if (messageObject == null) {
            return;
        }
        String str = messageObject.sponsoredTitle;
        TextView textView = this.d;
        CharSequence replaceEmoji = Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false);
        CharSequence charSequence = messageObject.messageText;
        da0 da0Var = this.h;
        CharSequence replaceEmoji2 = Emoji.replaceEmoji(charSequence, da0Var.getPaint().getFontMetricsInt(), false);
        String str2 = messageObject.sponsoredUrl;
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        ImageView imageView = this.c;
        z9 z9Var = this.b;
        if (messageMedia != null) {
            z9Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = messageObject.sponsoredMedia;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48);
                ImageLocation forDocument = ImageLocation.getForDocument(messageObject.sponsoredMedia.document);
                ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, messageObject.sponsoredMedia.document);
                z10 = true;
                z9Var.k(forDocument, "48_48", forDocument2, "48_48", 0L, null, null, 0);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredMedia.photo.sizes, 48, true, closestPhotoSizeWithSize2, false);
                    z10 = true;
                    z9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, messageObject.sponsoredMedia.photo), "48_48", ImageLocation.getForPhoto(closestPhotoSizeWithSize3, messageObject.sponsoredMedia.photo), "48_48", 0L, null, null, 0);
                } else {
                    z10 = true;
                }
            }
        } else {
            z10 = true;
            TLRPC.Photo photo2 = messageObject.sponsoredPhoto;
            if (photo2 == null) {
                z9Var.setVisibility(8);
                imageView.setVisibility(0);
                z11 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                int i10 = g6.Oh;
                c6 c6Var = this.a;
                spannableStringBuilder.setSpan(new ForegroundColorSpan(g6.w0(i10, c6Var)), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(replaceEmoji);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((dp - textView2.getPaint().measureText(textView2.getText().toString())) - AndroidUtilities.dp(32.0f)) - AndroidUtilities.dp(!z11 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(g6.w0(i10, c6Var)), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(replaceEmoji);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                da0Var.setText(replaceEmoji2);
                da0Var.setOnLinkPressListener(new ca0() { // from class: fi.m
                    @Override // org.telegram.ui.Components.ca0
                    public final void a(ClickableSpan clickableSpan) {
                        n nVar = n.this;
                        nVar.getClass();
                        fo foVar2 = foVar;
                        if (foVar2 != null) {
                            foVar2.O9(messageObject, false, false);
                        }
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (foVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                foVar2.ia(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(nVar.h);
                    }
                });
                textView2.setOnClickListener(new ah.g0(wfVar, 14));
                setOnClickListener(new bi.b5(this, foVar, messageObject, str2, 1));
                imageView.setOnClickListener(new ah.g0(wfVar2, 15));
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
            z9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize4, messageObject.sponsoredPhoto), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredPhoto.sizes, 48, true, closestPhotoSizeWithSize4, false), messageObject.sponsoredPhoto), "48_48", 0L, null, null, 0);
            z9Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z11 = z10;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
        int i102 = g6.Oh;
        c6 c6Var2 = this.a;
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(g6.w0(i102, c6Var2)), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder2.append((CharSequence) " \u2009");
        spannableStringBuilder2.append(replaceEmoji);
        measureText = textView.getPaint().measureText(spannableStringBuilder2.toString());
        float dp2 = AndroidUtilities.displaySize.x - AndroidUtilities.dp(44.660004f);
        TextView textView22 = this.f;
        measureText2 = ((dp2 - textView22.getPaint().measureText(textView22.getText().toString())) - AndroidUtilities.dp(32.0f)) - AndroidUtilities.dp(!z11 ? 58.0f : 0.0f);
        TextView textView32 = this.e;
        if (measureText <= measureText2) {
        }
        textView.setText(spannableStringBuilder2);
        da0Var.setText(replaceEmoji2);
        da0Var.setOnLinkPressListener(new ca0() { // from class: fi.m
            @Override // org.telegram.ui.Components.ca0
            public final void a(ClickableSpan clickableSpan) {
                n nVar = n.this;
                nVar.getClass();
                fo foVar2 = foVar;
                if (foVar2 != null) {
                    foVar2.O9(messageObject, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (foVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        foVar2.ia(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(nVar.h);
            }
        });
        textView22.setOnClickListener(new ah.g0(wfVar, 14));
        setOnClickListener(new bi.b5(this, foVar, messageObject, str2, 1));
        imageView.setOnClickListener(new ah.g0(wfVar2, 15));
    }
}
