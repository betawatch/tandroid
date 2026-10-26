package hi;

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
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.z90;
import org.telegram.ui.kf;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class u extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final u6 a;
    public final y9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final z90 h;

    public u(Activity activity, u6 u6Var) {
        super(activity);
        this.a = u6Var;
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 0);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        gb1.c(f7, 0.025f, 1.4f);
        addView(f7, gb1.i(-1, -1, 119));
        int i10 = y6.Oh;
        Drawable Z = y6.Z(y6.o1(0.1f, y6.w0(i10, u6Var)), 0, 0);
        b7 L = f7.L(0.1f, i10);
        setBackground(Z);
        f7.k(this, Z, null, L, u6Var);
        LinearLayout f10 = org.telegram.messenger.t.f(activity, 1);
        f7.addView(f10, gb1.s(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        f10.addView(linearLayout, gb1.t(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = y6.G6;
        f7.V(textView, i11, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, gb1.s(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        f7.V(textView2, i10, u6Var);
        gb1.c(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        ShapeDrawable c02 = y6.c0(AndroidUtilities.dp(9.0f), y6.o1(0.1f, y6.w0(i10, u6Var)));
        b7 L2 = f7.L(0.1f, i10);
        textView2.setBackground(c02);
        f7.k(textView2, c02, L2, null, u6Var);
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout.addView(textView2, gb1.t(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        f7.V(textView3, i11, u6Var);
        textView3.setTypeface(AndroidUtilities.bold());
        f10.addView(textView3, gb1.o(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        z90 z90Var = new z90(activity, null);
        this.h = z90Var;
        z90Var.setTextSize(1, 13.0f);
        f7.H(z90Var, y6.gc, u6Var);
        f7.V(z90Var, i11, u6Var);
        f10.addView(z90Var, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(z90Var);
        y9 y9Var = new y9(activity);
        this.b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        y9Var.setVisibility(8);
        f7.addView(y9Var, gb1.x(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(y6.g0(5, y6.o1(0.2f, y6.w0(y6.W5, u6Var)), -1));
        gb1.b(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        f7.t(imageView, y6.de, u6Var, PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new bh.f(5));
        imageView.setVisibility(8);
        f7.addView(imageView, gb1.x(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final un unVar, final MessageObject messageObject, kf kfVar, kf kfVar2) {
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
        z90 z90Var = this.h;
        CharSequence replaceEmoji2 = Emoji.replaceEmoji(charSequence, z90Var.getPaint().getFontMetricsInt(), false);
        String str2 = messageObject.sponsoredUrl;
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        ImageView imageView = this.c;
        y9 y9Var = this.b;
        if (messageMedia != null) {
            y9Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = messageObject.sponsoredMedia;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48);
                ImageLocation forDocument = ImageLocation.getForDocument(messageObject.sponsoredMedia.document);
                ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, messageObject.sponsoredMedia.document);
                z10 = true;
                y9Var.k(forDocument, "48_48", forDocument2, "48_48", 0L, null, null, 0);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredMedia.photo.sizes, 48, true, closestPhotoSizeWithSize2, false);
                    z10 = true;
                    y9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, messageObject.sponsoredMedia.photo), "48_48", ImageLocation.getForPhoto(closestPhotoSizeWithSize3, messageObject.sponsoredMedia.photo), "48_48", 0L, null, null, 0);
                } else {
                    z10 = true;
                }
            }
        } else {
            z10 = true;
            TLRPC.Photo photo2 = messageObject.sponsoredPhoto;
            if (photo2 == null) {
                y9Var.setVisibility(8);
                imageView.setVisibility(0);
                z11 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                int i10 = y6.Oh;
                u6 u6Var = this.a;
                spannableStringBuilder.setSpan(new p10(i10, u6Var), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(replaceEmoji);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((dp - textView2.getPaint().measureText(textView2.getText().toString())) - AndroidUtilities.dp(32.0f)) - AndroidUtilities.dp(!z11 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                    spannableStringBuilder.setSpan(new p10(i10, u6Var), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(replaceEmoji);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                z90Var.setText(replaceEmoji2);
                z90Var.setOnLinkPressListener(new y90() { // from class: hi.t
                    @Override // org.telegram.ui.Components.y90
                    public final void a(ClickableSpan clickableSpan) {
                        u uVar = u.this;
                        uVar.getClass();
                        un unVar2 = unVar;
                        if (unVar2 != null) {
                            unVar2.T9(messageObject, false, false);
                        }
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (unVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                unVar2.na(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(uVar.h);
                    }
                });
                textView2.setOnClickListener(new ai.s(kfVar, 25));
                setOnClickListener(new di.c4(this, unVar, messageObject, str2, 1));
                imageView.setOnClickListener(new ai.s(kfVar2, 26));
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
            y9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize4, messageObject.sponsoredPhoto), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredPhoto.sizes, 48, true, closestPhotoSizeWithSize4, false), messageObject.sponsoredPhoto), "48_48", 0L, null, null, 0);
            y9Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z11 = z10;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
        int i102 = y6.Oh;
        u6 u6Var2 = this.a;
        spannableStringBuilder2.setSpan(new p10(i102, u6Var2), 0, spannableStringBuilder2.length(), 33);
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
        z90Var.setText(replaceEmoji2);
        z90Var.setOnLinkPressListener(new y90() { // from class: hi.t
            @Override // org.telegram.ui.Components.y90
            public final void a(ClickableSpan clickableSpan) {
                u uVar = u.this;
                uVar.getClass();
                un unVar2 = unVar;
                if (unVar2 != null) {
                    unVar2.T9(messageObject, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (unVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        unVar2.na(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(uVar.h);
            }
        });
        textView22.setOnClickListener(new ai.s(kfVar, 25));
        setOnClickListener(new di.c4(this, unVar, messageObject, str2, 1));
        imageView.setOnClickListener(new ai.s(kfVar2, 26));
    }
}
