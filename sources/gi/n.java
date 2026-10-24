package gi;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.y90;
import org.telegram.ui.kf;
import org.telegram.ui.sn;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class n extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final g6 a;
    public final w9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final y90 h;

    public n(Activity activity, g6 g6Var) {
        super(activity);
        this.a = g6Var;
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 0);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        b6.b(f7, 0.025f, 1.4f);
        addView(f7, z5.e(-1, -1, 119));
        int i10 = k6.Oh;
        Drawable Z = k6.Z(k6.o1(0.1f, k6.w0(i10, g6Var)), 0, 0);
        n6 M = r6.M(0.1f, i10);
        setBackground(Z);
        r6.k(this, Z, null, M, g6Var);
        LinearLayout f10 = org.telegram.messenger.v0.f(activity, 1);
        f7.addView(f10, z5.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        f10.addView(linearLayout, z5.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = k6.G6;
        r6.W(textView, i11, g6Var);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, z5.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        r6.W(textView2, i10, g6Var);
        b6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        ShapeDrawable c02 = k6.c0(AndroidUtilities.dp(9.0f), k6.o1(0.1f, k6.w0(i10, g6Var)));
        n6 M2 = r6.M(0.1f, i10);
        textView2.setBackground(c02);
        r6.k(textView2, c02, M2, null, g6Var);
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout.addView(textView2, z5.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        r6.W(textView3, i11, g6Var);
        textView3.setTypeface(AndroidUtilities.bold());
        f10.addView(textView3, z5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        y90 y90Var = new y90(activity, null);
        this.h = y90Var;
        y90Var.setTextSize(1, 13.0f);
        r6.I(y90Var, k6.gc, g6Var);
        r6.W(y90Var, i11, g6Var);
        f10.addView(y90Var, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(y90Var);
        w9 w9Var = new w9(activity);
        this.b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        w9Var.setVisibility(8);
        f7.addView(w9Var, z5.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(k6.g0(5, k6.o1(0.2f, k6.w0(k6.W5, g6Var)), -1));
        b6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        r6.t(imageView, k6.de, g6Var, PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new ah.f(5));
        imageView.setVisibility(8);
        f7.addView(imageView, z5.t(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final sn snVar, final MessageObject messageObject, kf kfVar, kf kfVar2) {
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
        y90 y90Var = this.h;
        CharSequence replaceEmoji2 = Emoji.replaceEmoji(charSequence, y90Var.getPaint().getFontMetricsInt(), false);
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
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48);
                ImageLocation forDocument = ImageLocation.getForDocument(messageObject.sponsoredMedia.document);
                ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, messageObject.sponsoredMedia.document);
                z10 = true;
                w9Var.k(forDocument, "48_48", forDocument2, "48_48", 0L, null, null, 0);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredMedia.photo.sizes, 48, true, closestPhotoSizeWithSize2, false);
                    z10 = true;
                    w9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, messageObject.sponsoredMedia.photo), "48_48", ImageLocation.getForPhoto(closestPhotoSizeWithSize3, messageObject.sponsoredMedia.photo), "48_48", 0L, null, null, 0);
                } else {
                    z10 = true;
                }
            }
        } else {
            z10 = true;
            TLRPC.Photo photo2 = messageObject.sponsoredPhoto;
            if (photo2 == null) {
                w9Var.setVisibility(8);
                imageView.setVisibility(0);
                z11 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                int i10 = k6.Oh;
                g6 g6Var = this.a;
                spannableStringBuilder.setSpan(new m10(i10, g6Var), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(replaceEmoji);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((dp - textView2.getPaint().measureText(textView2.getText().toString())) - AndroidUtilities.dp(32.0f)) - AndroidUtilities.dp(!z11 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                    spannableStringBuilder.setSpan(new m10(i10, g6Var), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(replaceEmoji);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                y90Var.setText(replaceEmoji2);
                y90Var.setOnLinkPressListener(new x90() { // from class: gi.m
                    @Override // org.telegram.ui.Components.x90
                    public final void a(ClickableSpan clickableSpan) {
                        n nVar = n.this;
                        nVar.getClass();
                        sn snVar2 = snVar;
                        if (snVar2 != null) {
                            snVar2.O9(messageObject, false, false);
                        }
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (snVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                snVar2.ia(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(nVar.h);
                    }
                });
                textView2.setOnClickListener(new ah.g0(kfVar, 24));
                setOnClickListener(new ci.b4(this, snVar, messageObject, str2, 1));
                imageView.setOnClickListener(new ah.g0(kfVar2, 25));
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
            w9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize4, messageObject.sponsoredPhoto), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredPhoto.sizes, 48, true, closestPhotoSizeWithSize4, false), messageObject.sponsoredPhoto), "48_48", 0L, null, null, 0);
            w9Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z11 = z10;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
        int i102 = k6.Oh;
        g6 g6Var2 = this.a;
        spannableStringBuilder2.setSpan(new m10(i102, g6Var2), 0, spannableStringBuilder2.length(), 33);
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
        y90Var.setText(replaceEmoji2);
        y90Var.setOnLinkPressListener(new x90() { // from class: gi.m
            @Override // org.telegram.ui.Components.x90
            public final void a(ClickableSpan clickableSpan) {
                n nVar = n.this;
                nVar.getClass();
                sn snVar2 = snVar;
                if (snVar2 != null) {
                    snVar2.O9(messageObject, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (snVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        snVar2.ia(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(nVar.h);
            }
        });
        textView22.setOnClickListener(new ah.g0(kfVar, 24));
        setOnClickListener(new ci.b4(this, snVar, messageObject, str2, 1));
        imageView.setOnClickListener(new ah.g0(kfVar2, 25));
    }
}
