package ei;

import ai.o5;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.w9;
import org.telegram.ui.pf;
import org.telegram.ui.xn;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class n extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final d6 a;
    public final w9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final d90 h;

    public n(Activity activity, d6 d6Var) {
        super(activity);
        this.a = d6Var;
        LinearLayout f7 = org.telegram.messenger.z0.f(activity, 0);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        z5.b(f7, 0.025f, 1.4f);
        addView(f7, x5.e(-1, -1, 119));
        int i10 = h6.Oh;
        setBackground(h6.Y(h6.l1(0.1f, h6.v0(i10, d6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        f7.addView(linearLayout, x5.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, x5.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = h6.G6;
        textView.setTextColor(h6.v0(i11, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, x5.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(h6.v0(i10, d6Var));
        z5.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(h6.b0(AndroidUtilities.dp(9.0f), h6.l1(0.1f, h6.v0(i10, d6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, x5.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(h6.v0(i11, d6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, x5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        d90 d90Var = new d90(activity, null);
        this.h = d90Var;
        d90Var.setTextSize(1, 13.0f);
        d90Var.setLinkTextColor(h6.v0(h6.gc, d6Var));
        d90Var.setTextColor(h6.v0(i11, d6Var));
        linearLayout.addView(d90Var, x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(d90Var);
        w9 w9Var = new w9(activity);
        this.b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        w9Var.setVisibility(8);
        f7.addView(w9Var, x5.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(h6.f0(5, h6.l1(0.2f, h6.v0(h6.W5, d6Var)), -1));
        z5.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.de, d6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ai.e2(3));
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
    public final void a(final xn xnVar, final MessageObject messageObject, pf pfVar, pf pfVar2) {
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
        w9 w9Var = this.b;
        if (messageMedia != null) {
            w9Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = messageObject.sponsoredMedia;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                w9Var.k(ImageLocation.getForDocument(messageObject.sponsoredMedia.document), "48_48", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48), messageObject.sponsoredMedia.document), "48_48", 0L, null, null, 0);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                    w9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.sponsoredMedia.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredMedia.photo.sizes, 48, true, closestPhotoSizeWithSize, false), messageObject.sponsoredMedia.photo), "48_48", 0L, null, null, 0);
                }
            }
        } else {
            TLRPC.Photo photo2 = messageObject.sponsoredPhoto;
            if (photo2 == null) {
                w9Var.setVisibility(8);
                imageView.setVisibility(0);
                z10 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                int i10 = h6.Oh;
                d6 d6Var = this.a;
                spannableStringBuilder.setSpan(new ForegroundColorSpan(h6.v0(i10, d6Var)), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(replaceEmoji);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((dp - textView2.getPaint().measureText(textView2.getText().toString())) - AndroidUtilities.dp(32.0f)) - AndroidUtilities.dp(!z10 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(h6.v0(i10, d6Var)), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(replaceEmoji);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                d90Var.setText(replaceEmoji2);
                d90Var.setOnLinkPressListener(new c90() { // from class: ei.m
                    @Override // org.telegram.ui.Components.c90
                    public final void a(ClickableSpan clickableSpan) {
                        n nVar = n.this;
                        nVar.getClass();
                        xn xnVar2 = xnVar;
                        if (xnVar2 != null) {
                            xnVar2.J9(messageObject, false, false);
                        }
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (xnVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                xnVar2.da(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(nVar.h);
                    }
                });
                textView2.setOnClickListener(new ai.v0(pfVar, 13));
                setOnClickListener(new o5(this, xnVar, messageObject, str2, 1));
                imageView.setOnClickListener(new ai.v0(pfVar2, 14));
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
            w9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, messageObject.sponsoredPhoto), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredPhoto.sizes, 48, true, closestPhotoSizeWithSize2, false), messageObject.sponsoredPhoto), "48_48", 0L, null, null, 0);
            w9Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z10 = true;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
        int i102 = h6.Oh;
        d6 d6Var2 = this.a;
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(h6.v0(i102, d6Var2)), 0, spannableStringBuilder2.length(), 33);
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
        d90Var.setOnLinkPressListener(new c90() { // from class: ei.m
            @Override // org.telegram.ui.Components.c90
            public final void a(ClickableSpan clickableSpan) {
                n nVar = n.this;
                nVar.getClass();
                xn xnVar2 = xnVar;
                if (xnVar2 != null) {
                    xnVar2.J9(messageObject, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (xnVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        xnVar2.da(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(nVar.h);
            }
        });
        textView22.setOnClickListener(new ai.v0(pfVar, 13));
        setOnClickListener(new o5(this, xnVar, messageObject, str2, 1));
        imageView.setOnClickListener(new ai.v0(pfVar2, 14));
    }
}
