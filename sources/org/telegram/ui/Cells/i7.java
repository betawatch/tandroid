package org.telegram.ui.Cells;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.v70;
import org.telegram.ui.f10;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i7 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public MessageObject A;
    public boolean B;
    public boolean C;
    public final int D;
    public final SpannableStringBuilder E;
    public CharSequence F;
    public final mi0 G;
    public final org.telegram.ui.ActionBar.b6 H;
    public e00 I;
    public long J;
    public boolean K;
    public float L;
    public boolean M;
    public float N;
    public final ImageView a;
    public final ih.d4 b;
    public final TextView c;
    public final TextView d;
    public final org.telegram.ui.Components.s5 e;
    public final pi0 f;
    public final v70 h;
    public final dp n;
    public final TextView r;
    public final TextView s;
    public boolean v;
    public boolean w;
    public final int x;
    public final int y;

    public i7(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        float f10;
        this.v = true;
        int i10 = UserConfig.selectedAccount;
        this.x = i10;
        this.N = 1.0f;
        this.H = b6Var;
        this.D = i9;
        this.y = DownloadController.getInstance(i10).generateObserverTag();
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        if (i9 == 1) {
            boolean z10 = LocaleController.isRTL;
            addView(imageView, g7.e6.d(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 12.0f, z10 ? 15.0f : 0.0f, 0.0f));
        } else {
            boolean z11 = LocaleController.isRTL;
            addView(imageView, g7.e6.d(40, 40.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 12.0f, 8.0f, z11 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        j2.o(org.telegram.ui.ActionBar.f6.Bi, b6Var, textView, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        if (i9 == 1) {
            boolean z12 = LocaleController.isRTL;
            addView(textView, g7.e6.d(32, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 20.0f, 28.0f, z12 ? 20.0f : 0.0f, 0.0f));
        } else {
            boolean z13 = LocaleController.isRTL;
            addView(textView, g7.e6.d(32, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 22.0f, z13 ? 16.0f : 0.0f, 0.0f));
        }
        ih.d4 d4Var = new ih.d4(this, context, 1);
        this.b = d4Var;
        d4Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        if (i9 == 1) {
            boolean z14 = LocaleController.isRTL;
            addView(d4Var, g7.e6.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 0.0f));
        } else {
            boolean z15 = LocaleController.isRTL;
            addView(d4Var, g7.e6.d(40, 40.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 12.0f, 8.0f, z15 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        j2.o(i11, b6Var, textView2, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        if (i9 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z16 = LocaleController.isRTL;
            addView(textView2, g7.e6.d(-1, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 8.0f : 72.0f, 9.0f, z16 ? 72.0f : 8.0f, 0.0f));
            f10 = 14.0f;
        } else if (i9 == 2) {
            LinearLayout f11 = ll.f(context, 0);
            boolean z17 = LocaleController.isRTL;
            addView(f11, g7.e6.d(-1, -2.0f, (z17 ? 5 : 3) | 48, z17 ? 16.0f : 72.0f, 5.0f, z17 ? 72.0f : 16.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.r = textView3;
            ll.n(org.telegram.ui.ActionBar.f6.A6, b6Var, textView3, 1, 14.0f);
            f10 = 14.0f;
            if (LocaleController.isRTL) {
                f11.addView(textView3, g7.e6.l(0.0f, -2, -2));
                f11.addView(textView2, g7.e6.m(1.0f, -2, -2, 0, 4, 0));
            } else {
                f11.addView(textView2, g7.e6.l(1.0f, -2, -2));
                f11.addView(textView3, g7.e6.m(0.0f, -2, -2, 4, 0, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.s = textView4;
            textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z18 = LocaleController.isRTL;
            addView(textView4, g7.e6.d(-1, -2.0f, (z18 ? 5 : 3) | 48, z18 ? 8.0f : 72.0f, 30.0f, z18 ? 72.0f : 8.0f, 0.0f));
            textView4.setVisibility(8);
        } else {
            f10 = 14.0f;
            textView2.setMaxLines(1);
            boolean z19 = LocaleController.isRTL;
            addView(textView2, g7.e6.d(-1, -2.0f, (z19 ? 5 : 3) | 48, z19 ? 8.0f : 72.0f, 5.0f, z19 ? 72.0f : 8.0f, 0.0f));
        }
        mi0 mi0Var = new mi0(R.raw.download_arrow, "download_arrow", AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), true, null);
        this.G = mi0Var;
        pi0 pi0Var = new pi0(context);
        this.f = pi0Var;
        pi0Var.setAnimation(mi0Var);
        pi0Var.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.f6.Ih;
        pi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i12, b6Var), PorterDuff.Mode.SRC_IN));
        if (i9 == 1) {
            boolean z20 = LocaleController.isRTL;
            addView(pi0Var, g7.e6.d(14, 14.0f, (z20 ? 5 : 3) | 48, z20 ? 8.0f : 70.0f, 37.0f, z20 ? 72.0f : 8.0f, 0.0f));
        } else {
            boolean z21 = LocaleController.isRTL;
            addView(pi0Var, g7.e6.d(14, 14.0f, (z21 ? 5 : 3) | 48, z21 ? 8.0f : 70.0f, 33.0f, z21 ? 72.0f : 8.0f, 0.0f));
        }
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.e = s5Var;
        s5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
        s5Var.setLines(1);
        s5Var.setMaxLines(1);
        s5Var.setSingleLine(true);
        s5Var.setEllipsize(truncateAt);
        s5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        NotificationCenter.listenEmojiLoading(s5Var);
        if (i9 == 1) {
            s5Var.setTextSize(1, 13.0f);
            boolean z22 = LocaleController.isRTL;
            addView(s5Var, g7.e6.d(-1, -2.0f, (z22 ? 5 : 3) | 48, z22 ? 8.0f : 72.0f, 34.0f, z22 ? 72.0f : 8.0f, 0.0f));
        } else {
            s5Var.setTextSize(1, 13.0f);
            boolean z23 = LocaleController.isRTL;
            addView(s5Var, g7.e6.d(-1, -2.0f, (z23 ? 5 : 3) | 48, z23 ? 8.0f : 72.0f, 30.0f, z23 ? 72.0f : 8.0f, 0.0f));
        }
        v70 v70Var = new v70(context);
        this.h = v70Var;
        v70Var.setProgressColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        boolean z24 = LocaleController.isRTL;
        addView(v70Var, g7.e6.d(-1, 2.0f, (z24 ? 5 : 3) | 48, z24 ? 0.0f : 72.0f, 54.0f, z24 ? 72.0f : 0.0f, 0.0f));
        dp dpVar = new dp(context, 21, b6Var);
        this.n = dpVar;
        dpVar.setVisibility(4);
        dpVar.b(-1, org.telegram.ui.ActionBar.f6.d6, org.telegram.ui.ActionBar.f6.k7);
        dpVar.setDrawUnchecked(false);
        dpVar.setDrawBackgroundAsArc(2);
        if (i9 == 1) {
            boolean z25 = LocaleController.isRTL;
            addView(dpVar, g7.e6.d(24, 24.0f, (z25 ? 5 : 3) | 48, z25 ? 0.0f : 38.0f, 36.0f, z25 ? 38.0f : 0.0f, 0.0f));
        } else {
            boolean z26 = LocaleController.isRTL;
            addView(dpVar, g7.e6.d(24, 24.0f, (z26 ? 5 : 3) | 48, z26 ? 0.0f : 33.0f, 28.0f, z26 ? 33.0f : 0.0f, 0.0f));
        }
        if (i9 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.E = spannableStringBuilder;
            spannableStringBuilder.setSpan(new qs(), 0, 1, 0);
        }
    }

    public final void a(Canvas canvas) {
        if (this.w) {
            canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.f6.T0("paintDivider", this.H));
        }
    }

    public final void b(boolean z10, boolean z11) {
        dp dpVar = this.n;
        if (dpVar.getVisibility() != 0) {
            dpVar.setVisibility(0);
        }
        dpVar.a(z10, z11);
    }

    public final void c(MessageObject messageObject, boolean z10) {
        String str;
        org.telegram.ui.ActionBar.b6 b6Var;
        String str2;
        String str3;
        String str4;
        MessageObject messageObject2 = this.A;
        boolean z11 = (messageObject2 == null || messageObject == null || messageObject2.getId() == messageObject.getId()) ? false : true;
        this.w = z10;
        this.A = messageObject;
        this.C = false;
        this.B = false;
        if (!z11) {
            this.J = 0L;
        }
        TLRPC.Document document = messageObject.getDocument();
        TextView textView = this.s;
        TextView textView2 = this.c;
        ImageView imageView = this.a;
        TextView textView3 = this.d;
        ih.d4 d4Var = this.b;
        if (document != null) {
            if (messageObject.isMusic()) {
                str = null;
                for (int i9 = 0; i9 < document.attributes.size(); i9++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i9);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str3 = documentAttribute.performer) != null && str3.length() != 0) || ((str4 = documentAttribute.title) != null && str4.length() != 0))) {
                        str = messageObject.getMusicAuthor() + " - " + messageObject.getMusicTitle();
                    }
                }
            } else {
                str = null;
            }
            String documentFileName = (messageObject.isVideo() || (messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) || MessageObject.isGifDocument(document)) ? null : FileLoader.getDocumentFileName(document);
            if (TextUtils.isEmpty(documentFileName) && (str2 = document.mime_type) != null) {
                documentFileName = str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) ? MessageObject.isGifDocument(document) ? LocaleController.getString(R.string.AttachGif) : LocaleController.getString(R.string.AttachVideo) : document.mime_type.startsWith("image") ? MessageObject.isGifDocument(document) ? LocaleController.getString(R.string.AttachGif) : LocaleController.getString(R.string.AttachPhoto) : document.mime_type.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND) ? LocaleController.getString(R.string.AttachAudio) : LocaleController.getString(R.string.AttachDocument);
            }
            String str5 = str == null ? documentFileName : str;
            ArrayList<String> arrayList = messageObject.highlightedWords;
            org.telegram.ui.ActionBar.b6 b6Var2 = this.H;
            CharSequence highlightText = AndroidUtilities.highlightText(str5, arrayList, b6Var2);
            if (highlightText != null) {
                textView2.setText(highlightText);
            } else {
                textView2.setText(str5);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(documentFileName, document.mime_type, false));
            int lastIndexOf = documentFileName.lastIndexOf(46);
            textView3.setText(lastIndexOf == -1 ? "" : documentFileName.substring(lastIndexOf + 1).toLowerCase());
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40);
            if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                closestPhotoSizeWithSize = null;
            }
            if ((closestPhotoSizeWithSize2 instanceof TLRPC.TL_photoSizeEmpty) || closestPhotoSizeWithSize2 == null) {
                b6Var = b6Var2;
                d4Var.setVisibility(4);
                d4Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                d4Var.getImageReceiver().setNeedsQualityThumb(closestPhotoSizeWithSize == null);
                d4Var.getImageReceiver().setShouldGenerateQualityThumb(closestPhotoSizeWithSize == null);
                d4Var.setVisibility(0);
                if (messageObject.strippedThumb != null) {
                    b6Var = b6Var2;
                    d4Var.m(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", null, null, messageObject.strippedThumb, null, 1, messageObject);
                } else {
                    b6Var = b6Var2;
                    d4Var.k(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "40_40_b", 0L, null, messageObject, 1);
                }
            }
            e();
            if (messageObject.hasHighlightedWords() && !TextUtils.isEmpty(this.A.messageOwner.message)) {
                CharSequence highlightText2 = AndroidUtilities.highlightText(this.A.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.A.highlightedWords, b6Var);
                this.F = highlightText2;
                if (textView != null) {
                    textView.setVisibility(highlightText2 == null ? 8 : 0);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            textView2.setText("");
            textView3.setText("");
            this.e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            d4Var.setVisibility(4);
            d4Var.setImageBitmap(null);
            this.F = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.w);
        this.h.a(0.0f, false);
        f(z11);
    }

    public final void d(boolean z10, String str, int i9, String str2, String str3, String str4) {
        int i10;
        int i11;
        this.c.setText(str);
        this.e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.w = z10;
        ImageView imageView = this.a;
        if (i9 == 0) {
            imageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(str, str3, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i12 = this.D;
        ih.d4 d4Var = this.b;
        if (str4 == null && i9 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i12 != 3) {
                d4Var.setImageBitmap(null);
                d4Var.setVisibility(4);
            }
        } else {
            if (str4 == null) {
                fq L = org.telegram.ui.ActionBar.f6.L(AndroidUtilities.dp(42.0f), i9);
                if (i9 == R.drawable.files_storage) {
                    i10 = org.telegram.ui.ActionBar.f6.na;
                    i11 = org.telegram.ui.ActionBar.f6.ia;
                } else if (i9 == R.drawable.files_gallery) {
                    i10 = org.telegram.ui.ActionBar.f6.la;
                    i11 = org.telegram.ui.ActionBar.f6.ia;
                } else if (i9 == R.drawable.files_music) {
                    i10 = org.telegram.ui.ActionBar.f6.ka;
                    i11 = org.telegram.ui.ActionBar.f6.ia;
                } else if (i9 == R.drawable.files_internal) {
                    i10 = org.telegram.ui.ActionBar.f6.ja;
                    i11 = org.telegram.ui.ActionBar.f6.ia;
                } else {
                    i10 = org.telegram.ui.ActionBar.f6.Ai;
                    i11 = org.telegram.ui.ActionBar.f6.zi;
                }
                org.telegram.ui.ActionBar.b6 b6Var = this.H;
                org.telegram.ui.ActionBar.f6.v1(L, org.telegram.ui.ActionBar.f6.v0(i10, b6Var), false);
                org.telegram.ui.ActionBar.f6.v1(L, org.telegram.ui.ActionBar.f6.v0(i11, b6Var), true);
                d4Var.setImageDrawable(L);
            } else if (i12 != 3) {
                d4Var.f(str4, "42_42", null);
            }
            d4Var.setVisibility(0);
        }
        setWillNotDraw(!this.w);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.N == 1.0f || this.I == null) {
            super.dispatchDraw(canvas);
            a(canvas);
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.N) * 255.0f), 31);
            this.I.setViewType(3);
            this.I.d();
            this.I.h();
            this.I.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.N * 255.0f), 31);
            super.dispatchDraw(canvas);
            a(canvas);
            canvas.restore();
        }
        boolean z10 = this.K;
        if (z10 || this.L != 0.0f) {
            if (z10) {
                float f10 = this.L;
                if (f10 != 1.0f) {
                    this.L = f10 + 0.10666667f;
                    invalidate();
                    this.L = Utilities.clamp(this.L, 1.0f, 0.0f);
                    int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.f6.Z0.getIntrinsicWidth();
                    int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight()) >> 1;
                    canvas.save();
                    float f11 = this.L;
                    canvas.scale(f11, f11, (org.telegram.ui.ActionBar.f6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                    Drawable drawable = org.telegram.ui.ActionBar.f6.Z0;
                    drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight() + measuredHeight);
                    org.telegram.ui.ActionBar.f6.Z0.draw(canvas);
                    canvas.restore();
                }
            }
            if (!z10) {
                float f12 = this.L;
                if (f12 != 0.0f) {
                    this.L = f12 - 0.10666667f;
                    invalidate();
                }
            }
            this.L = Utilities.clamp(this.L, 1.0f, 0.0f);
            int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.f6.Z0.getIntrinsicWidth();
            int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight()) >> 1;
            canvas.save();
            float f112 = this.L;
            canvas.scale(f112, f112, (org.telegram.ui.ActionBar.f6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
            Drawable drawable2 = org.telegram.ui.ActionBar.f6.Z0;
            drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight() + measuredHeight2);
            org.telegram.ui.ActionBar.f6.Z0.draw(canvas);
            canvas.restore();
        }
    }

    public final void e() {
        String z10;
        MessageObject messageObject = this.A;
        if (messageObject == null || messageObject.getDocument() == null) {
            return;
        }
        MessageObject messageObject2 = this.A;
        long j10 = messageObject2.messageOwner.date * 1000;
        long j11 = this.J;
        if (j11 == 0) {
            z10 = AndroidUtilities.formatFileSize(messageObject2.getDocument().size);
        } else {
            Locale locale = Locale.ENGLISH;
            z10 = aa.d.z(AndroidUtilities.formatFileSize(j11), " / ", AndroidUtilities.formatFileSize(this.A.getDocument().size));
        }
        int i9 = this.D;
        org.telegram.ui.Components.s5 s5Var = this.e;
        if (i9 == 2) {
            s5Var.setText(new SpannableStringBuilder().append((CharSequence) z10).append(' ').append((CharSequence) this.E).append(' ').append(f10.d(this.A, true, 2, s5Var.getPaint())));
            this.r.setText(LocaleController.stringForMessageListDate(this.A.messageOwner.date));
            return;
        }
        s5Var.setText(z10 + ", " + LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10))));
    }

    public final void f(boolean z10) {
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) gr.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        MessageObject messageObject = this.A;
        int i9 = this.x;
        pi0 pi0Var = this.f;
        v70 v70Var = this.h;
        org.telegram.ui.Components.s5 s5Var = this.e;
        if (messageObject == null || messageObject.messageOwner.media == null) {
            this.B = false;
            this.C = true;
            v70Var.setVisibility(4);
            v70Var.a(0.0f, false);
            pi0Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s5Var.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 72.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 8.0f);
                s5Var.requestLayout();
            }
            DownloadController.getInstance(i9).removeLoadingFileObserver(this);
            return;
        }
        this.C = false;
        if (messageObject.attachPathExists || messageObject.mediaExists || !this.v) {
            pi0Var.setVisibility(4);
            v70Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) s5Var.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 72.0f);
                layoutParams2.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 8.0f);
                s5Var.requestLayout();
            }
            this.B = false;
            this.C = true;
            DownloadController.getInstance(i9).removeLoadingFileObserver(this);
            return;
        }
        String attachFileName = FileLoader.getAttachFileName(messageObject.getDocument());
        DownloadController.getInstance(i9).addLoadingFileObserver(attachFileName, this.A, this);
        this.B = FileLoader.getInstance(i9).isLoadingFile(attachFileName);
        pi0Var.setVisibility(0);
        int i10 = this.B ? 15 : 0;
        mi0 mi0Var = this.G;
        mi0Var.N(i10);
        mi0Var.h = true;
        if (z10) {
            pi0Var.d();
        } else {
            mi0Var.K(this.B ? 15 : 0);
            pi0Var.invalidate();
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) s5Var.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 86.0f);
            layoutParams3.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 86.0f : 8.0f);
            s5Var.requestLayout();
        }
        if (!this.B) {
            v70Var.setVisibility(4);
            return;
        }
        v70Var.setVisibility(0);
        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
        if (fileProgress == null) {
            fileProgress = Float.valueOf(0.0f);
        }
        v70Var.a(fileProgress.floatValue(), false);
    }

    public org.telegram.ui.Components.o9 getImageView() {
        return this.b;
    }

    public MessageObject getMessage() {
        return this.A;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h.getVisibility() == 0) {
            f(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(this.x).removeLoadingFileObserver(this);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        f(true);
        this.J = 0L;
        e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        dp dpVar = this.n;
        if (dpVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(dpVar.a.q);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.D != 1) {
            TextView textView = this.c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - AndroidUtilities.dp(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.l0.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.s5 s5Var = this.e;
                s5Var.layout(s5Var.getLeft(), s5Var.getTop() + measuredHeight, s5Var.getRight(), s5Var.getBottom() + measuredHeight);
                pi0 pi0Var = this.f;
                pi0Var.layout(pi0Var.getLeft(), pi0Var.getTop() + measuredHeight, pi0Var.getRight(), pi0Var.getBottom() + measuredHeight);
                v70 v70Var = this.h;
                v70Var.layout(v70Var.getLeft(), (getMeasuredHeight() - v70Var.getMeasuredHeight()) - (this.w ? 1 : 0), v70Var.getRight(), getMeasuredHeight() - (this.w ? 1 : 0));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        TextView textView;
        int i11 = this.D;
        if (i11 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.w ? 1 : 0), TLObject.FLAG_30));
            return;
        }
        if (i11 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
        int measuredHeight = this.c.getMeasuredHeight() + AndroidUtilities.dp(34.0f) + (this.w ? 1 : 0);
        if (this.F != null && (textView = this.s) != null && this.A.hasHighlightedWords()) {
            this.M = true;
            textView.setText(AndroidUtilities.ellipsizeCenterEnd(this.F, this.A.highlightedWords.get(0), textView.getMeasuredWidth(), textView.getPaint(), 130));
            this.M = false;
            measuredHeight = org.telegram.messenger.l0.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        v70 v70Var = this.h;
        if (v70Var.getVisibility() != 0) {
            f(true);
        }
        this.J = j10;
        e();
        v70Var.a(Math.min(1.0f, j10 / j11), true);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.h.a(1.0f, true);
        f(true);
        this.J = 0L;
        e();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.M) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawDownloadIcon(boolean z10) {
        this.v = z10;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.N != f10) {
            this.N = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(e00 e00Var) {
        this.I = e00Var;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        ih.d4 d4Var = this.b;
        if (endsWith) {
            d4Var.f("vthumb://0:".concat(str), null, null);
            d4Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            d4Var.setVisibility(8);
        } else {
            d4Var.f("thumb://0:".concat(str), null, null);
            d4Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(MediaController.PhotoEntry photoEntry) {
        String str;
        String str2 = photoEntry.thumbPath;
        ih.d4 d4Var = this.b;
        if (str2 != null) {
            d4Var.f(str2, null, org.telegram.ui.ActionBar.f6.R4);
            str = photoEntry.thumbPath;
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                d4Var.q(0, true);
                d4Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.f6.R4);
            } else {
                d4Var.p(photoEntry.orientation, photoEntry.invert, true);
                d4Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.f6.R4);
            }
            str = photoEntry.path;
        } else {
            d4Var.setImageDrawable(org.telegram.ui.ActionBar.f6.R4);
            str = "";
        }
        File file = new File(str);
        this.c.setText(file.getName());
        FileLoader.getFileExtension(file);
        this.d.setVisibility(8);
        StringBuilder sb2 = new StringBuilder();
        if (photoEntry.width != 0 && photoEntry.height != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            Locale locale = Locale.US;
            sb2.append(photoEntry.width + "x" + photoEntry.height);
        }
        if (photoEntry.isVideo) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(AndroidUtilities.formatShortDuration(photoEntry.duration));
        }
        if (photoEntry.size != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(AndroidUtilities.formatFileSize(photoEntry.size));
        }
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append(LocaleController.getInstance().getFormatterStats().format(photoEntry.dateTaken));
        this.e.setText(sb2);
        this.a.setVisibility(8);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
