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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.x9;
import org.telegram.ui.co;
import org.telegram.ui.qf;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class o extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final f6 a;
    public final x9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final d90 h;

    public o(Activity activity, f6 f6Var) {
        super(activity);
        this.a = f6Var;
        LinearLayout f7 = org.telegram.messenger.w1.f(activity, 0);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        z5.b(f7, 0.025f, 1.4f);
        addView(f7, x5.e(-1, -1, 119));
        int i10 = j6.Oh;
        setBackground(j6.Y(j6.l1(0.1f, j6.v0(i10, f6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        f7.addView(linearLayout, x5.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, x5.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, x5.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(j6.v0(i10, f6Var));
        z5.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(j6.b0(AndroidUtilities.dp(9.0f), j6.l1(0.1f, j6.v0(i10, f6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, x5.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(j6.v0(i11, f6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, x5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        d90 d90Var = new d90(activity, null);
        this.h = d90Var;
        d90Var.setTextSize(1, 13.0f);
        d90Var.setLinkTextColor(j6.v0(j6.gc, f6Var));
        d90Var.setTextColor(j6.v0(i11, f6Var));
        linearLayout.addView(d90Var, x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(d90Var);
        x9 x9Var = new x9(activity);
        this.b = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        x9Var.setVisibility(8);
        f7.addView(x9Var, x5.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(j6.f0(5, j6.l1(0.2f, j6.v0(j6.W5, f6Var)), -1));
        z5.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.de, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ah.f(4));
        imageView.setVisibility(8);
        f7.addView(imageView, x5.t(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final co coVar, final MessageObject messageObject, qf qfVar, qf qfVar2) {
        boolean z10;
        float measureText;
        float measureText2;
        if (messageObject == null) {
            return;
        }
        String str = messageObject.sponsoredTitle;
        TextView textView = this.d;
        CharSequence replaceEmoji = Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false);
        CharSequence charSequence = messageObject.messageText;
        d90 d90Var = this.h;
        CharSequence replaceEmoji2 = Emoji.replaceEmoji(charSequence, d90Var.getPaint().getFontMetricsInt(), false);
        String str2 = messageObject.sponsoredUrl;
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        ImageView imageView = this.c;
        x9 x9Var = this.b;
        if (messageMedia != null) {
            x9Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = messageObject.sponsoredMedia;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                x9Var.k(ImageLocation.getForDocument(messageObject.sponsoredMedia.document), "48_48", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48), messageObject.sponsoredMedia.document), "48_48", 0L, null, null, 0);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                    x9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.sponsoredMedia.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredMedia.photo.sizes, 48, true, closestPhotoSizeWithSize, false), messageObject.sponsoredMedia.photo), "48_48", 0L, null, null, 0);
                }
            }
        } else {
            TLRPC.Photo photo2 = messageObject.sponsoredPhoto;
            if (photo2 == null) {
                x9Var.setVisibility(8);
                imageView.setVisibility(0);
                z10 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                int i10 = j6.Oh;
                f6 f6Var = this.a;
                spannableStringBuilder.setSpan(new ForegroundColorSpan(j6.v0(i10, f6Var)), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(replaceEmoji);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((dp - textView2.getPaint().measureText(textView2.getText().toString())) - AndroidUtilities.dp(32.0f)) - AndroidUtilities.dp(!z10 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(j6.v0(i10, f6Var)), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(replaceEmoji);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                d90Var.setText(replaceEmoji2);
                d90Var.setOnLinkPressListener(new c90() { // from class: fi.n
                    @Override // org.telegram.ui.Components.c90
                    public final void a(ClickableSpan clickableSpan) {
                        o oVar = o.this;
                        oVar.getClass();
                        co coVar2 = coVar;
                        if (coVar2 != null) {
                            coVar2.J9(messageObject, false, false);
                        }
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (coVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                coVar2.da(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(oVar.h);
                    }
                });
                textView2.setOnClickListener(new ah.h0(qfVar, 14));
                setOnClickListener(new bi.z4(this, coVar, messageObject, str2, 1));
                imageView.setOnClickListener(new ah.h0(qfVar2, 15));
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
            x9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, messageObject.sponsoredPhoto), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredPhoto.sizes, 48, true, closestPhotoSizeWithSize2, false), messageObject.sponsoredPhoto), "48_48", 0L, null, null, 0);
            x9Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z10 = true;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
        int i102 = j6.Oh;
        f6 f6Var2 = this.a;
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(j6.v0(i102, f6Var2)), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder2.append((CharSequence) " \u2009");
        spannableStringBuilder2.append(replaceEmoji);
        measureText = textView.getPaint().measureText(spannableStringBuilder2.toString());
        float dp2 = AndroidUtilities.displaySize.x - AndroidUtilities.dp(44.660004f);
        TextView textView22 = this.f;
        measureText2 = ((dp2 - textView22.getPaint().measureText(textView22.getText().toString())) - AndroidUtilities.dp(32.0f)) - AndroidUtilities.dp(!z10 ? 58.0f : 0.0f);
        TextView textView32 = this.e;
        if (measureText <= measureText2) {
        }
        textView.setText(spannableStringBuilder2);
        d90Var.setText(replaceEmoji2);
        d90Var.setOnLinkPressListener(new c90() { // from class: fi.n
            @Override // org.telegram.ui.Components.c90
            public final void a(ClickableSpan clickableSpan) {
                o oVar = o.this;
                oVar.getClass();
                co coVar2 = coVar;
                if (coVar2 != null) {
                    coVar2.J9(messageObject, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (coVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        coVar2.da(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(oVar.h);
            }
        });
        textView22.setOnClickListener(new ah.h0(qfVar, 14));
        setOnClickListener(new bi.z4(this, coVar, messageObject, str2, 1));
        imageView.setOnClickListener(new ah.h0(qfVar2, 15));
    }
}
