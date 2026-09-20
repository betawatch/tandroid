package ei;

import ai.p5;
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
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.v9;
import org.telegram.ui.rf;
import org.telegram.ui.zn;
import w7.b6;
import w7.y5;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class n extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final f6 a;
    public final v9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final k90 h;

    public n(Activity activity, f6 f6Var) {
        super(activity);
        this.a = f6Var;
        LinearLayout e = org.telegram.messenger.l0.e(activity, 0);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        b6.b(e, 0.025f, 1.4f);
        addView(e, y5.e(-1, -1, 119));
        int i10 = j6.Oh;
        setBackground(j6.Y(j6.l1(0.1f, j6.v0(i10, f6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        e.addView(linearLayout, y5.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, y5.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, y5.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(j6.v0(i10, f6Var));
        b6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(j6.b0(AndroidUtilities.dp(9.0f), j6.l1(0.1f, j6.v0(i10, f6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, y5.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(j6.v0(i11, f6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, y5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        k90 k90Var = new k90(activity, null);
        this.h = k90Var;
        k90Var.setTextSize(1, 13.0f);
        k90Var.setLinkTextColor(j6.v0(j6.gc, f6Var));
        k90Var.setTextColor(j6.v0(i11, f6Var));
        linearLayout.addView(k90Var, y5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(k90Var);
        v9 v9Var = new v9(activity);
        this.b = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        v9Var.setVisibility(8);
        e.addView(v9Var, y5.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(j6.f0(5, j6.l1(0.2f, j6.v0(j6.W5, f6Var)), -1));
        b6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.de, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ai.e2(3));
        imageView.setVisibility(8);
        e.addView(imageView, y5.t(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final zn znVar, final MessageObject messageObject, rf rfVar, rf rfVar2) {
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
        k90 k90Var = this.h;
        CharSequence replaceEmoji2 = Emoji.replaceEmoji(charSequence, k90Var.getPaint().getFontMetricsInt(), false);
        String str2 = messageObject.sponsoredUrl;
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        ImageView imageView = this.c;
        v9 v9Var = this.b;
        if (messageMedia != null) {
            v9Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = messageObject.sponsoredMedia;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                v9Var.k(ImageLocation.getForDocument(messageObject.sponsoredMedia.document), "48_48", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48), messageObject.sponsoredMedia.document), "48_48", 0L, null, null, 0);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                    v9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.sponsoredMedia.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredMedia.photo.sizes, 48, true, closestPhotoSizeWithSize, false), messageObject.sponsoredMedia.photo), "48_48", 0L, null, null, 0);
                }
            }
        } else {
            TLRPC.Photo photo2 = messageObject.sponsoredPhoto;
            if (photo2 == null) {
                v9Var.setVisibility(8);
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
                k90Var.setText(replaceEmoji2);
                k90Var.setOnLinkPressListener(new j90() { // from class: ei.m
                    @Override // org.telegram.ui.Components.j90
                    public final void a(ClickableSpan clickableSpan) {
                        n nVar = n.this;
                        nVar.getClass();
                        zn znVar2 = znVar;
                        if (znVar2 != null) {
                            znVar2.J9(messageObject, false, false);
                        }
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (znVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                znVar2.da(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(nVar.h);
                    }
                });
                textView2.setOnClickListener(new ai.v0(rfVar, 13));
                setOnClickListener(new p5(this, znVar, messageObject, str2, 1));
                imageView.setOnClickListener(new ai.v0(rfVar2, 14));
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
            v9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, messageObject.sponsoredPhoto), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredPhoto.sizes, 48, true, closestPhotoSizeWithSize2, false), messageObject.sponsoredPhoto), "48_48", 0L, null, null, 0);
            v9Var.setVisibility(0);
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
        k90Var.setText(replaceEmoji2);
        k90Var.setOnLinkPressListener(new j90() { // from class: ei.m
            @Override // org.telegram.ui.Components.j90
            public final void a(ClickableSpan clickableSpan) {
                n nVar = n.this;
                nVar.getClass();
                zn znVar2 = znVar;
                if (znVar2 != null) {
                    znVar2.J9(messageObject, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (znVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        znVar2.da(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(nVar.h);
            }
        });
        textView22.setOnClickListener(new ai.v0(rfVar, 13));
        setOnClickListener(new p5(this, znVar, messageObject, str2, 1));
        imageView.setOnClickListener(new ai.v0(rfVar2, 14));
    }
}
