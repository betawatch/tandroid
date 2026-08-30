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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.zs;
import org.telegram.ui.t10;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class i7 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public MessageObject B;
    public boolean C;
    public boolean D;
    public final int E;
    public final SpannableStringBuilder F;
    public CharSequence G;
    public final gj0 H;
    public final org.telegram.ui.ActionBar.f6 I;
    public t00 J;
    public long K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public final ImageView a;
    public final nh.y3 b;
    public final TextView c;
    public final TextView d;
    public final org.telegram.ui.Components.t5 e;
    public final jj0 f;
    public final o80 h;
    public final lp n;
    public final TextView r;
    public final TextView s;
    public boolean v;
    public boolean w;
    public final int x;
    public final int y;

    public i7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        float f10;
        this.v = true;
        int i11 = UserConfig.selectedAccount;
        this.x = i11;
        this.O = 1.0f;
        this.I = f6Var;
        this.E = i10;
        this.y = DownloadController.getInstance(i11).generateObserverTag();
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        if (i10 == 1) {
            boolean z4 = LocaleController.isRTL;
            addView(imageView, k7.b6.d(42, 42.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 15.0f, 12.0f, z4 ? 15.0f : 0.0f, 0.0f));
        } else {
            boolean z10 = LocaleController.isRTL;
            addView(imageView, k7.b6.d(40, 40.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 12.0f, 8.0f, z10 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.Bi, f6Var, textView, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        if (i10 == 1) {
            boolean z11 = LocaleController.isRTL;
            addView(textView, k7.b6.d(32, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 20.0f, 28.0f, z11 ? 20.0f : 0.0f, 0.0f));
        } else {
            boolean z12 = LocaleController.isRTL;
            addView(textView, k7.b6.d(32, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 22.0f, z12 ? 16.0f : 0.0f, 0.0f));
        }
        nh.y3 y3Var = new nh.y3(this, context, 1);
        this.b = y3Var;
        y3Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        if (i10 == 1) {
            boolean z13 = LocaleController.isRTL;
            addView(y3Var, k7.b6.d(42, 42.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 0.0f));
        } else {
            boolean z14 = LocaleController.isRTL;
            addView(y3Var, k7.b6.d(40, 40.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 12.0f, 8.0f, z14 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.b.w(i12, f6Var, textView2, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        if (i10 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z15 = LocaleController.isRTL;
            addView(textView2, k7.b6.d(-1, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 8.0f : 72.0f, 9.0f, z15 ? 72.0f : 8.0f, 0.0f));
            f10 = 14.0f;
        } else if (i10 == 2) {
            LinearLayout f11 = org.telegram.messenger.y3.f(context, 0);
            boolean z16 = LocaleController.isRTL;
            addView(f11, k7.b6.d(-1, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 16.0f : 72.0f, 5.0f, z16 ? 72.0f : 16.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.r = textView3;
            org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.A6, f6Var, textView3, 1, 14.0f);
            f10 = 14.0f;
            if (LocaleController.isRTL) {
                f11.addView(textView3, k7.b6.l(0.0f, -2, -2));
                f11.addView(textView2, k7.b6.m(1.0f, -2, -2, 0, 4, 0));
            } else {
                f11.addView(textView2, k7.b6.l(1.0f, -2, -2));
                f11.addView(textView3, k7.b6.m(0.0f, -2, -2, 4, 0, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.s = textView4;
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z17 = LocaleController.isRTL;
            addView(textView4, k7.b6.d(-1, -2.0f, (z17 ? 5 : 3) | 48, z17 ? 8.0f : 72.0f, 30.0f, z17 ? 72.0f : 8.0f, 0.0f));
            textView4.setVisibility(8);
        } else {
            f10 = 14.0f;
            textView2.setMaxLines(1);
            boolean z18 = LocaleController.isRTL;
            addView(textView2, k7.b6.d(-1, -2.0f, (z18 ? 5 : 3) | 48, z18 ? 8.0f : 72.0f, 5.0f, z18 ? 72.0f : 8.0f, 0.0f));
        }
        gj0 gj0Var = new gj0(R.raw.download_arrow, "download_arrow", AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), true, null);
        this.H = gj0Var;
        jj0 jj0Var = new jj0(context);
        this.f = jj0Var;
        jj0Var.setAnimation(gj0Var);
        jj0Var.setVisibility(4);
        int i13 = org.telegram.ui.ActionBar.j6.Ih;
        jj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), PorterDuff.Mode.SRC_IN));
        if (i10 == 1) {
            boolean z19 = LocaleController.isRTL;
            addView(jj0Var, k7.b6.d(14, 14.0f, (z19 ? 5 : 3) | 48, z19 ? 8.0f : 70.0f, 37.0f, z19 ? 72.0f : 8.0f, 0.0f));
        } else {
            boolean z20 = LocaleController.isRTL;
            addView(jj0Var, k7.b6.d(14, 14.0f, (z20 ? 5 : 3) | 48, z20 ? 8.0f : 70.0f, 33.0f, z20 ? 72.0f : 8.0f, 0.0f));
        }
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(context);
        this.e = t5Var;
        t5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
        t5Var.setLines(1);
        t5Var.setMaxLines(1);
        t5Var.setSingleLine(true);
        t5Var.setEllipsize(truncateAt);
        t5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        NotificationCenter.listenEmojiLoading(t5Var);
        if (i10 == 1) {
            t5Var.setTextSize(1, 13.0f);
            boolean z21 = LocaleController.isRTL;
            addView(t5Var, k7.b6.d(-1, -2.0f, (z21 ? 5 : 3) | 48, z21 ? 8.0f : 72.0f, 34.0f, z21 ? 72.0f : 8.0f, 0.0f));
        } else {
            t5Var.setTextSize(1, 13.0f);
            boolean z22 = LocaleController.isRTL;
            addView(t5Var, k7.b6.d(-1, -2.0f, (z22 ? 5 : 3) | 48, z22 ? 8.0f : 72.0f, 30.0f, z22 ? 72.0f : 8.0f, 0.0f));
        }
        o80 o80Var = new o80(context);
        this.h = o80Var;
        o80Var.setProgressColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        boolean z23 = LocaleController.isRTL;
        addView(o80Var, k7.b6.d(-1, 2.0f, (z23 ? 5 : 3) | 48, z23 ? 0.0f : 72.0f, 54.0f, z23 ? 72.0f : 0.0f, 0.0f));
        lp lpVar = new lp(context, 21, f6Var);
        this.n = lpVar;
        lpVar.setVisibility(4);
        lpVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(2);
        if (i10 == 1) {
            boolean z24 = LocaleController.isRTL;
            addView(lpVar, k7.b6.d(24, 24.0f, (z24 ? 5 : 3) | 48, z24 ? 0.0f : 38.0f, 36.0f, z24 ? 38.0f : 0.0f, 0.0f));
        } else {
            boolean z25 = LocaleController.isRTL;
            addView(lpVar, k7.b6.d(24, 24.0f, (z25 ? 5 : 3) | 48, z25 ? 0.0f : 33.0f, 28.0f, z25 ? 33.0f : 0.0f, 0.0f));
        }
        if (i10 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.F = spannableStringBuilder;
            spannableStringBuilder.setSpan(new zs(), 0, 1, 0);
        }
    }

    public final void a(Canvas canvas) {
        if (this.w) {
            canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.T0("paintDivider", this.I));
        }
    }

    public final void b(boolean z4, boolean z10) {
        lp lpVar = this.n;
        if (lpVar.getVisibility() != 0) {
            lpVar.setVisibility(0);
        }
        lpVar.a(z4, z10);
    }

    public final void c(MessageObject messageObject, boolean z4) {
        String str;
        org.telegram.ui.ActionBar.f6 f6Var;
        String str2;
        String str3;
        String str4;
        MessageObject messageObject2 = this.B;
        boolean z10 = (messageObject2 == null || messageObject == null || messageObject2.getId() == messageObject.getId()) ? false : true;
        this.w = z4;
        this.B = messageObject;
        this.D = false;
        this.C = false;
        if (!z10) {
            this.K = 0L;
        }
        TLRPC.Document document = messageObject.getDocument();
        TextView textView = this.s;
        TextView textView2 = this.c;
        ImageView imageView = this.a;
        TextView textView3 = this.d;
        nh.y3 y3Var = this.b;
        if (document != null) {
            if (messageObject.isMusic()) {
                str = null;
                for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
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
            org.telegram.ui.ActionBar.f6 f6Var2 = this.I;
            CharSequence highlightText = AndroidUtilities.highlightText(str5, arrayList, f6Var2);
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
                f6Var = f6Var2;
                y3Var.setVisibility(4);
                y3Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                y3Var.getImageReceiver().setNeedsQualityThumb(closestPhotoSizeWithSize == null);
                y3Var.getImageReceiver().setShouldGenerateQualityThumb(closestPhotoSizeWithSize == null);
                y3Var.setVisibility(0);
                if (messageObject.strippedThumb != null) {
                    f6Var = f6Var2;
                    y3Var.m(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", null, null, messageObject.strippedThumb, null, 1, messageObject);
                } else {
                    f6Var = f6Var2;
                    y3Var.k(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "40_40_b", 0L, null, messageObject, 1);
                }
            }
            e();
            if (messageObject.hasHighlightedWords() && !TextUtils.isEmpty(this.B.messageOwner.message)) {
                CharSequence highlightText2 = AndroidUtilities.highlightText(this.B.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.B.highlightedWords, f6Var);
                this.G = highlightText2;
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
            y3Var.setVisibility(4);
            y3Var.setImageBitmap(null);
            this.G = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.w);
        this.h.a(0.0f, false);
        f(z10);
    }

    public final void d(boolean z4, String str, int i10, String str2, String str3, String str4) {
        int i11;
        int i12;
        this.c.setText(str);
        this.e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.w = z4;
        ImageView imageView = this.a;
        if (i10 == 0) {
            imageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(str, str3, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i13 = this.E;
        nh.y3 y3Var = this.b;
        if (str4 == null && i10 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i13 != 3) {
                y3Var.setImageBitmap(null);
                y3Var.setVisibility(4);
            }
        } else {
            if (str4 == null) {
                nq L = org.telegram.ui.ActionBar.j6.L(AndroidUtilities.dp(42.0f), i10);
                if (i10 == R.drawable.files_storage) {
                    i11 = org.telegram.ui.ActionBar.j6.na;
                    i12 = org.telegram.ui.ActionBar.j6.ia;
                } else if (i10 == R.drawable.files_gallery) {
                    i11 = org.telegram.ui.ActionBar.j6.la;
                    i12 = org.telegram.ui.ActionBar.j6.ia;
                } else if (i10 == R.drawable.files_music) {
                    i11 = org.telegram.ui.ActionBar.j6.ka;
                    i12 = org.telegram.ui.ActionBar.j6.ia;
                } else if (i10 == R.drawable.files_internal) {
                    i11 = org.telegram.ui.ActionBar.j6.ja;
                    i12 = org.telegram.ui.ActionBar.j6.ia;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.Ai;
                    i12 = org.telegram.ui.ActionBar.j6.zi;
                }
                org.telegram.ui.ActionBar.f6 f6Var = this.I;
                org.telegram.ui.ActionBar.j6.v1(L, org.telegram.ui.ActionBar.j6.v0(i11, f6Var), false);
                org.telegram.ui.ActionBar.j6.v1(L, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), true);
                y3Var.setImageDrawable(L);
            } else if (i13 != 3) {
                y3Var.f(str4, "42_42", null);
            }
            y3Var.setVisibility(0);
        }
        setWillNotDraw(!this.w);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.O == 1.0f || this.J == null) {
            super.dispatchDraw(canvas);
            a(canvas);
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.O) * 255.0f), 31);
            this.J.setViewType(3);
            this.J.e();
            this.J.h();
            this.J.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.O * 255.0f), 31);
            super.dispatchDraw(canvas);
            a(canvas);
            canvas.restore();
        }
        boolean z4 = this.L;
        if (z4 || this.M != 0.0f) {
            if (z4) {
                float f10 = this.M;
                if (f10 != 1.0f) {
                    this.M = f10 + 0.10666667f;
                    invalidate();
                    this.M = Utilities.clamp(this.M, 1.0f, 0.0f);
                    int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth();
                    int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight()) >> 1;
                    canvas.save();
                    float f11 = this.M;
                    canvas.scale(f11, f11, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                    Drawable drawable = org.telegram.ui.ActionBar.j6.Z0;
                    drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() + measuredHeight);
                    org.telegram.ui.ActionBar.j6.Z0.draw(canvas);
                    canvas.restore();
                }
            }
            if (!z4) {
                float f12 = this.M;
                if (f12 != 0.0f) {
                    this.M = f12 - 0.10666667f;
                    invalidate();
                }
            }
            this.M = Utilities.clamp(this.M, 1.0f, 0.0f);
            int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth();
            int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight()) >> 1;
            canvas.save();
            float f112 = this.M;
            canvas.scale(f112, f112, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
            Drawable drawable2 = org.telegram.ui.ActionBar.j6.Z0;
            drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() + measuredHeight2);
            org.telegram.ui.ActionBar.j6.Z0.draw(canvas);
            canvas.restore();
        }
    }

    public final void e() {
        String z4;
        MessageObject messageObject = this.B;
        if (messageObject == null || messageObject.getDocument() == null) {
            return;
        }
        MessageObject messageObject2 = this.B;
        long j10 = messageObject2.messageOwner.date * 1000;
        long j11 = this.K;
        if (j11 == 0) {
            z4 = AndroidUtilities.formatFileSize(messageObject2.getDocument().size);
        } else {
            Locale locale = Locale.ENGLISH;
            z4 = android.support.v4.media.a.z(AndroidUtilities.formatFileSize(j11), " / ", AndroidUtilities.formatFileSize(this.B.getDocument().size));
        }
        int i10 = this.E;
        org.telegram.ui.Components.t5 t5Var = this.e;
        if (i10 == 2) {
            t5Var.setText(new SpannableStringBuilder().append((CharSequence) z4).append(' ').append((CharSequence) this.F).append(' ').append(t10.d(this.B, true, 2, t5Var.getPaint())));
            this.r.setText(LocaleController.stringForMessageListDate(this.B.messageOwner.date));
            return;
        }
        t5Var.setText(z4 + ", " + LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10))));
    }

    public final void f(boolean z4) {
        if (z4) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) nr.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        MessageObject messageObject = this.B;
        int i10 = this.x;
        jj0 jj0Var = this.f;
        o80 o80Var = this.h;
        org.telegram.ui.Components.t5 t5Var = this.e;
        if (messageObject == null || messageObject.messageOwner.media == null) {
            this.C = false;
            this.D = true;
            o80Var.setVisibility(4);
            o80Var.a(0.0f, false);
            jj0Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t5Var.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 72.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 8.0f);
                t5Var.requestLayout();
            }
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            return;
        }
        this.D = false;
        if (messageObject.attachPathExists || messageObject.mediaExists || !this.v) {
            jj0Var.setVisibility(4);
            o80Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) t5Var.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 72.0f);
                layoutParams2.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 8.0f);
                t5Var.requestLayout();
            }
            this.C = false;
            this.D = true;
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            return;
        }
        String attachFileName = FileLoader.getAttachFileName(messageObject.getDocument());
        DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.B, this);
        this.C = FileLoader.getInstance(i10).isLoadingFile(attachFileName);
        jj0Var.setVisibility(0);
        int i11 = this.C ? 15 : 0;
        gj0 gj0Var = this.H;
        gj0Var.N(i11);
        gj0Var.h = true;
        if (z4) {
            jj0Var.d();
        } else {
            gj0Var.K(this.C ? 15 : 0);
            jj0Var.invalidate();
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) t5Var.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 86.0f);
            layoutParams3.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 86.0f : 8.0f);
            t5Var.requestLayout();
        }
        if (!this.C) {
            o80Var.setVisibility(4);
            return;
        }
        o80Var.setVisibility(0);
        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
        if (fileProgress == null) {
            fileProgress = Float.valueOf(0.0f);
        }
        o80Var.a(fileProgress.floatValue(), false);
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.b;
    }

    public MessageObject getMessage() {
        return this.B;
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
    public final void onFailedDownload(String str, boolean z4) {
        f(true);
        this.K = 0L;
        e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        lp lpVar = this.n;
        if (lpVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(lpVar.a.q);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.E != 1) {
            TextView textView = this.c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - AndroidUtilities.dp(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.y3.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.t5 t5Var = this.e;
                t5Var.layout(t5Var.getLeft(), t5Var.getTop() + measuredHeight, t5Var.getRight(), t5Var.getBottom() + measuredHeight);
                jj0 jj0Var = this.f;
                jj0Var.layout(jj0Var.getLeft(), jj0Var.getTop() + measuredHeight, jj0Var.getRight(), jj0Var.getBottom() + measuredHeight);
                o80 o80Var = this.h;
                o80Var.layout(o80Var.getLeft(), (getMeasuredHeight() - o80Var.getMeasuredHeight()) - (this.w ? 1 : 0), o80Var.getRight(), getMeasuredHeight() - (this.w ? 1 : 0));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12 = this.E;
        if (i12 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.w ? 1 : 0), TLObject.FLAG_30));
            return;
        }
        if (i12 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
        int measuredHeight = this.c.getMeasuredHeight() + AndroidUtilities.dp(34.0f) + (this.w ? 1 : 0);
        if (this.G != null && (textView = this.s) != null && this.B.hasHighlightedWords()) {
            this.N = true;
            textView.setText(AndroidUtilities.ellipsizeCenterEnd(this.G, this.B.highlightedWords.get(0), textView.getMeasuredWidth(), textView.getPaint(), 130));
            this.N = false;
            measuredHeight = org.telegram.messenger.y3.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        o80 o80Var = this.h;
        if (o80Var.getVisibility() != 0) {
            f(true);
        }
        this.K = j10;
        e();
        o80Var.a(Math.min(1.0f, j10 / j11), true);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.h.a(1.0f, true);
        f(true);
        this.K = 0L;
        e();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.N) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawDownloadIcon(boolean z4) {
        this.v = z4;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.O != f10) {
            this.O = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(t00 t00Var) {
        this.J = t00Var;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        nh.y3 y3Var = this.b;
        if (endsWith) {
            y3Var.f("vthumb://0:".concat(str), null, null);
            y3Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            y3Var.setVisibility(8);
        } else {
            y3Var.f("thumb://0:".concat(str), null, null);
            y3Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(MediaController.PhotoEntry photoEntry) {
        String str;
        String str2 = photoEntry.thumbPath;
        nh.y3 y3Var = this.b;
        if (str2 != null) {
            y3Var.f(str2, null, org.telegram.ui.ActionBar.j6.R4);
            str = photoEntry.thumbPath;
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                y3Var.q(0, true);
                y3Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.j6.R4);
            } else {
                y3Var.p(photoEntry.orientation, photoEntry.invert, true);
                y3Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.j6.R4);
            }
            str = photoEntry.path;
        } else {
            y3Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            str = "";
        }
        File file = new File(str);
        this.c.setText(file.getName());
        FileLoader.getFileExtension(file);
        this.d.setVisibility(8);
        StringBuilder sb = new StringBuilder();
        if (photoEntry.width != 0 && photoEntry.height != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Locale locale = Locale.US;
            sb.append(photoEntry.width + "x" + photoEntry.height);
        }
        if (photoEntry.isVideo) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(AndroidUtilities.formatShortDuration(photoEntry.duration));
        }
        if (photoEntry.size != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(AndroidUtilities.formatFileSize(photoEntry.size));
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(LocaleController.getInstance().getFormatterStats().format(photoEntry.dateTaken));
        this.e.setText(sb);
        this.a.setVisibility(8);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
