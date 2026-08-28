package mh;

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
import g7.e6;
import g7.g6;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.o9;
import org.telegram.ui.gf;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final b6 a;
    public final o9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final l80 h;

    public n(Activity activity, b6 b6Var) {
        super(activity);
        this.a = b6Var;
        LinearLayout f10 = org.telegram.messenger.l0.f(activity, 0);
        f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        g6.b(f10, 0.025f, 1.4f);
        addView(f10, e6.e(-1, -1, 119));
        int i9 = f6.Oh;
        setBackground(f6.Y(f6.l1(0.1f, f6.v0(i9, b6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        f10.addView(linearLayout, e6.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, e6.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = f6.G6;
        textView.setTextColor(f6.v0(i10, b6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, e6.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(f6.v0(i9, b6Var));
        g6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(f6.b0(AndroidUtilities.dp(9.0f), f6.l1(0.1f, f6.v0(i9, b6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, e6.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(f6.v0(i10, b6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, e6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        l80 l80Var = new l80(activity, null);
        this.h = l80Var;
        l80Var.setTextSize(1, 13.0f);
        l80Var.setLinkTextColor(f6.v0(f6.gc, b6Var));
        l80Var.setTextColor(f6.v0(i10, b6Var));
        linearLayout.addView(l80Var, e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(l80Var);
        o9 o9Var = new o9(activity);
        this.b = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        o9Var.setVisibility(8);
        f10.addView(o9Var, e6.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(f6.f0(5, f6.l1(0.2f, f6.v0(f6.W5, b6Var)), -1));
        g6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.de, b6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new fh.n(8));
        imageView.setVisibility(8);
        f10.addView(imageView, e6.t(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final qn qnVar, final MessageObject messageObject, gf gfVar, gf gfVar2) {
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
        l80 l80Var = this.h;
        CharSequence replaceEmoji2 = Emoji.replaceEmoji(charSequence, l80Var.getPaint().getFontMetricsInt(), false);
        String str2 = messageObject.sponsoredUrl;
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        ImageView imageView = this.c;
        o9 o9Var = this.b;
        if (messageMedia != null) {
            o9Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = messageObject.sponsoredMedia;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                o9Var.k(ImageLocation.getForDocument(messageObject.sponsoredMedia.document), "48_48", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48), messageObject.sponsoredMedia.document), "48_48", 0L, null, null, 0);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                    o9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.sponsoredMedia.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredMedia.photo.sizes, 48, true, closestPhotoSizeWithSize, false), messageObject.sponsoredMedia.photo), "48_48", 0L, null, null, 0);
                }
            }
        } else {
            TLRPC.Photo photo2 = messageObject.sponsoredPhoto;
            if (photo2 == null) {
                o9Var.setVisibility(8);
                imageView.setVisibility(0);
                z10 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                int i9 = f6.Oh;
                b6 b6Var = this.a;
                spannableStringBuilder.setSpan(new ForegroundColorSpan(f6.v0(i9, b6Var)), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(replaceEmoji);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((dp - textView2.getPaint().measureText(textView2.getText().toString())) - AndroidUtilities.dp(32.0f)) - AndroidUtilities.dp(!z10 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(f6.v0(i9, b6Var)), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(replaceEmoji);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                l80Var.setText(replaceEmoji2);
                l80Var.setOnLinkPressListener(new k80() { // from class: mh.m
                    @Override // org.telegram.ui.Components.k80
                    public final void a(ClickableSpan clickableSpan) {
                        n nVar = n.this;
                        nVar.getClass();
                        qn qnVar2 = qnVar;
                        if (qnVar2 != null) {
                            qnVar2.J9(messageObject, false, false);
                        }
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (qnVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                qnVar2.da(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(nVar.h);
                    }
                });
                textView2.setOnClickListener(new x8(gfVar, 1));
                setOnClickListener(new fh.g4(this, qnVar, messageObject, str2, 2));
                imageView.setOnClickListener(new x8(gfVar2, 2));
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
            o9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, messageObject.sponsoredPhoto), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredPhoto.sizes, 48, true, closestPhotoSizeWithSize2, false), messageObject.sponsoredPhoto), "48_48", 0L, null, null, 0);
            o9Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z10 = true;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
        int i92 = f6.Oh;
        b6 b6Var2 = this.a;
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(f6.v0(i92, b6Var2)), 0, spannableStringBuilder2.length(), 33);
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
        l80Var.setText(replaceEmoji2);
        l80Var.setOnLinkPressListener(new k80() { // from class: mh.m
            @Override // org.telegram.ui.Components.k80
            public final void a(ClickableSpan clickableSpan) {
                n nVar = n.this;
                nVar.getClass();
                qn qnVar2 = qnVar;
                if (qnVar2 != null) {
                    qnVar2.J9(messageObject, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (qnVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        qnVar2.da(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(nVar.h);
            }
        });
        textView22.setOnClickListener(new x8(gfVar, 1));
        setOnClickListener(new fh.g4(this, qnVar, messageObject, str2, 2));
        imageView.setOnClickListener(new x8(gfVar2, 2));
    }
}
