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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.x10;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class j7 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public MessageObject E;
    public boolean F;
    public boolean G;
    public final int H;
    public final SpannableStringBuilder I;
    public CharSequence J;
    public final xi0 K;
    public final org.telegram.ui.ActionBar.e6 L;
    public t00 M;
    public long N;
    public boolean O;
    public float P;
    public boolean Q;
    public float R;
    public final ImageView a;
    public final ai.z5 b;
    public final TextView c;
    public final TextView d;
    public final org.telegram.ui.Components.w5 e;
    public final aj0 f;
    public final m80 h;
    public final np n;
    public final TextView r;
    public final TextView s;
    public boolean v;
    public boolean w;
    public final int x;
    public final int y;

    public j7(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        float f7;
        this.v = true;
        int i11 = UserConfig.selectedAccount;
        this.x = i11;
        this.R = 1.0f;
        this.L = e6Var;
        this.H = i10;
        this.y = DownloadController.getInstance(i11).generateObserverTag();
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        if (i10 == 1) {
            boolean z10 = LocaleController.isRTL;
            addView(imageView, w7.x5.d(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 12.0f, z10 ? 15.0f : 0.0f, 0.0f));
        } else {
            boolean z11 = LocaleController.isRTL;
            addView(imageView, w7.x5.d(40, 40.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 12.0f, 8.0f, z11 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        q3.p(org.telegram.ui.ActionBar.i6.Bi, e6Var, textView, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        if (i10 == 1) {
            boolean z12 = LocaleController.isRTL;
            addView(textView, w7.x5.d(32, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 20.0f, 28.0f, z12 ? 20.0f : 0.0f, 0.0f));
        } else {
            boolean z13 = LocaleController.isRTL;
            addView(textView, w7.x5.d(32, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 22.0f, z13 ? 16.0f : 0.0f, 0.0f));
        }
        ai.z5 z5Var = new ai.z5(this, context, 2);
        this.b = z5Var;
        z5Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        if (i10 == 1) {
            boolean z14 = LocaleController.isRTL;
            addView(z5Var, w7.x5.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 0.0f));
        } else {
            boolean z15 = LocaleController.isRTL;
            addView(z5Var, w7.x5.d(40, 40.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 12.0f, 8.0f, z15 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        q3.p(i12, e6Var, textView2, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        if (i10 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z16 = LocaleController.isRTL;
            addView(textView2, w7.x5.d(-1, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 8.0f : 72.0f, 9.0f, z16 ? 72.0f : 8.0f, 0.0f));
            f7 = 14.0f;
        } else if (i10 == 2) {
            LinearLayout f10 = vl.f(context, 0);
            boolean z17 = LocaleController.isRTL;
            addView(f10, w7.x5.d(-1, -2.0f, (z17 ? 5 : 3) | 48, z17 ? 16.0f : 72.0f, 5.0f, z17 ? 72.0f : 16.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.r = textView3;
            vl.o(org.telegram.ui.ActionBar.i6.A6, e6Var, textView3, 1, 14.0f);
            f7 = 14.0f;
            if (LocaleController.isRTL) {
                f10.addView(textView3, w7.x5.l(0.0f, -2, -2));
                f10.addView(textView2, w7.x5.m(1.0f, -2, -2, 0, 4, 0));
            } else {
                f10.addView(textView2, w7.x5.l(1.0f, -2, -2));
                f10.addView(textView3, w7.x5.m(0.0f, -2, -2, 4, 0, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.s = textView4;
            textView4.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, e6Var));
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z18 = LocaleController.isRTL;
            addView(textView4, w7.x5.d(-1, -2.0f, (z18 ? 5 : 3) | 48, z18 ? 8.0f : 72.0f, 30.0f, z18 ? 72.0f : 8.0f, 0.0f));
            textView4.setVisibility(8);
        } else {
            f7 = 14.0f;
            textView2.setMaxLines(1);
            boolean z19 = LocaleController.isRTL;
            addView(textView2, w7.x5.d(-1, -2.0f, (z19 ? 5 : 3) | 48, z19 ? 8.0f : 72.0f, 5.0f, z19 ? 72.0f : 8.0f, 0.0f));
        }
        xi0 xi0Var = new xi0(R.raw.download_arrow, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), true, null);
        this.K = xi0Var;
        aj0 aj0Var = new aj0(context);
        this.f = aj0Var;
        aj0Var.setAnimation(xi0Var);
        aj0Var.setVisibility(4);
        int i13 = org.telegram.ui.ActionBar.i6.Ih;
        aj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i13, e6Var), PorterDuff.Mode.SRC_IN));
        if (i10 == 1) {
            boolean z20 = LocaleController.isRTL;
            addView(aj0Var, w7.x5.d(14, 14.0f, (z20 ? 5 : 3) | 48, z20 ? 8.0f : 70.0f, 37.0f, z20 ? 72.0f : 8.0f, 0.0f));
        } else {
            boolean z21 = LocaleController.isRTL;
            addView(aj0Var, w7.x5.d(14, 14.0f, (z21 ? 5 : 3) | 48, z21 ? 8.0f : 70.0f, 33.0f, z21 ? 72.0f : 8.0f, 0.0f));
        }
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(context);
        this.e = w5Var;
        w5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A6, e6Var));
        w5Var.setLines(1);
        w5Var.setMaxLines(1);
        w5Var.setSingleLine(true);
        w5Var.setEllipsize(truncateAt);
        w5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        NotificationCenter.listenEmojiLoading(w5Var);
        if (i10 == 1) {
            w5Var.setTextSize(1, 13.0f);
            boolean z22 = LocaleController.isRTL;
            addView(w5Var, w7.x5.d(-1, -2.0f, (z22 ? 5 : 3) | 48, z22 ? 8.0f : 72.0f, 34.0f, z22 ? 72.0f : 8.0f, 0.0f));
        } else {
            w5Var.setTextSize(1, 13.0f);
            boolean z23 = LocaleController.isRTL;
            addView(w5Var, w7.x5.d(-1, -2.0f, (z23 ? 5 : 3) | 48, z23 ? 8.0f : 72.0f, 30.0f, z23 ? 72.0f : 8.0f, 0.0f));
        }
        m80 m80Var = new m80(context);
        this.h = m80Var;
        m80Var.setProgressColor(org.telegram.ui.ActionBar.i6.v0(i13, e6Var));
        boolean z24 = LocaleController.isRTL;
        addView(m80Var, w7.x5.d(-1, 2.0f, (z24 ? 5 : 3) | 48, z24 ? 0.0f : 72.0f, 54.0f, z24 ? 72.0f : 0.0f, 0.0f));
        np npVar = new np(context, 21, e6Var);
        this.n = npVar;
        npVar.setVisibility(4);
        npVar.b(-1, org.telegram.ui.ActionBar.i6.d6, org.telegram.ui.ActionBar.i6.k7);
        npVar.setDrawUnchecked(false);
        npVar.setDrawBackgroundAsArc(2);
        if (i10 == 1) {
            boolean z25 = LocaleController.isRTL;
            addView(npVar, w7.x5.d(24, 24.0f, (z25 ? 5 : 3) | 48, z25 ? 0.0f : 38.0f, 36.0f, z25 ? 38.0f : 0.0f, 0.0f));
        } else {
            boolean z26 = LocaleController.isRTL;
            addView(npVar, w7.x5.d(24, 24.0f, (z26 ? 5 : 3) | 48, z26 ? 0.0f : 33.0f, 28.0f, z26 ? 33.0f : 0.0f, 0.0f));
        }
        if (i10 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.I = spannableStringBuilder;
            spannableStringBuilder.setSpan(new bt(), 0, 1, 0);
        }
    }

    public final void a(Canvas canvas) {
        if (this.w) {
            canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.i6.T0("paintDivider", this.L));
        }
    }

    public final void b(boolean z10, boolean z11) {
        np npVar = this.n;
        if (npVar.getVisibility() != 0) {
            npVar.setVisibility(0);
        }
        npVar.a(z10, z11);
    }

    public final void c(MessageObject messageObject, boolean z10) {
        String str;
        org.telegram.ui.ActionBar.e6 e6Var;
        String str2;
        String str3;
        String str4;
        MessageObject messageObject2 = this.E;
        boolean z11 = (messageObject2 == null || messageObject == null || messageObject2.getId() == messageObject.getId()) ? false : true;
        this.w = z10;
        this.E = messageObject;
        this.G = false;
        this.F = false;
        if (!z11) {
            this.N = 0L;
        }
        TLRPC.Document document = messageObject.getDocument();
        TextView textView = this.s;
        TextView textView2 = this.c;
        ImageView imageView = this.a;
        TextView textView3 = this.d;
        ai.z5 z5Var = this.b;
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
            org.telegram.ui.ActionBar.e6 e6Var2 = this.L;
            CharSequence highlightText = AndroidUtilities.highlightText(str5, arrayList, e6Var2);
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
                e6Var = e6Var2;
                z5Var.setVisibility(4);
                z5Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                z5Var.getImageReceiver().setNeedsQualityThumb(closestPhotoSizeWithSize == null);
                z5Var.getImageReceiver().setShouldGenerateQualityThumb(closestPhotoSizeWithSize == null);
                z5Var.setVisibility(0);
                if (messageObject.strippedThumb != null) {
                    e6Var = e6Var2;
                    z5Var.m(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", null, null, messageObject.strippedThumb, null, 1, messageObject);
                } else {
                    e6Var = e6Var2;
                    z5Var.k(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "40_40_b", 0L, null, messageObject, 1);
                }
            }
            e();
            if (messageObject.hasHighlightedWords() && !TextUtils.isEmpty(this.E.messageOwner.message)) {
                CharSequence highlightText2 = AndroidUtilities.highlightText(this.E.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.E.highlightedWords, e6Var);
                this.J = highlightText2;
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
            z5Var.setVisibility(4);
            z5Var.setImageBitmap(null);
            this.J = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.w);
        this.h.a(0.0f, false);
        f(z11);
    }

    public final void d(String str, String str2, String str3, String str4, int i10, boolean z10) {
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
        this.w = z10;
        ImageView imageView = this.a;
        if (i10 == 0) {
            imageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(str, str3, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i13 = this.H;
        ai.z5 z5Var = this.b;
        if (str4 == null && i10 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i13 != 3) {
                z5Var.setImageBitmap(null);
                z5Var.setVisibility(4);
            }
        } else {
            if (str4 == null) {
                pq L = org.telegram.ui.ActionBar.i6.L(AndroidUtilities.dp(42.0f), i10);
                if (i10 == R.drawable.files_storage) {
                    i11 = org.telegram.ui.ActionBar.i6.na;
                    i12 = org.telegram.ui.ActionBar.i6.ia;
                } else if (i10 == R.drawable.files_gallery) {
                    i11 = org.telegram.ui.ActionBar.i6.la;
                    i12 = org.telegram.ui.ActionBar.i6.ia;
                } else if (i10 == R.drawable.files_music) {
                    i11 = org.telegram.ui.ActionBar.i6.ka;
                    i12 = org.telegram.ui.ActionBar.i6.ia;
                } else if (i10 == R.drawable.files_internal) {
                    i11 = org.telegram.ui.ActionBar.i6.ja;
                    i12 = org.telegram.ui.ActionBar.i6.ia;
                } else {
                    i11 = org.telegram.ui.ActionBar.i6.Ai;
                    i12 = org.telegram.ui.ActionBar.i6.zi;
                }
                org.telegram.ui.ActionBar.e6 e6Var = this.L;
                org.telegram.ui.ActionBar.i6.v1(L, org.telegram.ui.ActionBar.i6.v0(i11, e6Var), false);
                org.telegram.ui.ActionBar.i6.v1(L, org.telegram.ui.ActionBar.i6.v0(i12, e6Var), true);
                z5Var.setImageDrawable(L);
            } else if (i13 != 3) {
                z5Var.f(str4, "42_42", null);
            }
            z5Var.setVisibility(0);
        }
        setWillNotDraw(true ^ this.w);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.R == 1.0f || this.M == null) {
            super.dispatchDraw(canvas);
            a(canvas);
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.R) * 255.0f), 31);
            this.M.setViewType(3);
            this.M.e();
            this.M.h();
            this.M.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.R * 255.0f), 31);
            super.dispatchDraw(canvas);
            a(canvas);
            canvas.restore();
        }
        boolean z10 = this.O;
        if (z10 || this.P != 0.0f) {
            if (z10) {
                float f7 = this.P;
                if (f7 != 1.0f) {
                    this.P = f7 + 0.10666667f;
                    invalidate();
                    this.P = Utilities.clamp(this.P, 1.0f, 0.0f);
                    int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.i6.Z0.getIntrinsicWidth();
                    int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.i6.Z0.getIntrinsicHeight()) >> 1;
                    canvas.save();
                    float f10 = this.P;
                    canvas.scale(f10, f10, (org.telegram.ui.ActionBar.i6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.i6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                    Drawable drawable = org.telegram.ui.ActionBar.i6.Z0;
                    drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.i6.Z0.getIntrinsicHeight() + measuredHeight);
                    org.telegram.ui.ActionBar.i6.Z0.draw(canvas);
                    canvas.restore();
                }
            }
            if (!z10) {
                float f11 = this.P;
                if (f11 != 0.0f) {
                    this.P = f11 - 0.10666667f;
                    invalidate();
                }
            }
            this.P = Utilities.clamp(this.P, 1.0f, 0.0f);
            int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.i6.Z0.getIntrinsicWidth();
            int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.i6.Z0.getIntrinsicHeight()) >> 1;
            canvas.save();
            float f102 = this.P;
            canvas.scale(f102, f102, (org.telegram.ui.ActionBar.i6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.i6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
            Drawable drawable2 = org.telegram.ui.ActionBar.i6.Z0;
            drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.i6.Z0.getIntrinsicHeight() + measuredHeight2);
            org.telegram.ui.ActionBar.i6.Z0.draw(canvas);
            canvas.restore();
        }
    }

    public final void e() {
        String D;
        MessageObject messageObject = this.E;
        if (messageObject == null || messageObject.getDocument() == null) {
            return;
        }
        MessageObject messageObject2 = this.E;
        long j3 = messageObject2.messageOwner.date * 1000;
        long j10 = this.N;
        if (j10 == 0) {
            D = AndroidUtilities.formatFileSize(messageObject2.getDocument().size);
        } else {
            Locale locale = Locale.ENGLISH;
            D = a4.a.D(AndroidUtilities.formatFileSize(j10), " / ", AndroidUtilities.formatFileSize(this.E.getDocument().size));
        }
        int i10 = this.H;
        org.telegram.ui.Components.w5 w5Var = this.e;
        if (i10 == 2) {
            w5Var.setText(new SpannableStringBuilder().append((CharSequence) D).append(' ').append((CharSequence) this.I).append(' ').append(x10.d(this.E, true, 2, w5Var.getPaint())));
            this.r.setText(LocaleController.stringForMessageListDate(this.E.messageOwner.date));
            return;
        }
        w5Var.setText(D + ", " + LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(new Date(j3)), LocaleController.getInstance().getFormatterDay().format(new Date(j3))));
    }

    public final void f(boolean z10) {
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) qr.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        MessageObject messageObject = this.E;
        int i10 = this.x;
        aj0 aj0Var = this.f;
        m80 m80Var = this.h;
        org.telegram.ui.Components.w5 w5Var = this.e;
        if (messageObject == null || messageObject.messageOwner.media == null) {
            this.F = false;
            this.G = true;
            m80Var.setVisibility(4);
            m80Var.a(0.0f, false);
            aj0Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w5Var.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 72.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 8.0f);
                w5Var.requestLayout();
            }
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            return;
        }
        this.G = false;
        if (messageObject.attachPathExists || messageObject.mediaExists || !this.v) {
            aj0Var.setVisibility(4);
            m80Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) w5Var.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 72.0f);
                layoutParams2.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 8.0f);
                w5Var.requestLayout();
            }
            this.F = false;
            this.G = true;
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            return;
        }
        String attachFileName = FileLoader.getAttachFileName(messageObject.getDocument());
        DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.E, this);
        this.F = FileLoader.getInstance(i10).isLoadingFile(attachFileName);
        aj0Var.setVisibility(0);
        int i11 = this.F ? 15 : 0;
        xi0 xi0Var = this.K;
        xi0Var.P(i11);
        xi0Var.h = true;
        if (z10) {
            aj0Var.d();
        } else {
            xi0Var.M(this.F ? 15 : 0);
            aj0Var.invalidate();
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) w5Var.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 86.0f);
            layoutParams3.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 86.0f : 8.0f);
            w5Var.requestLayout();
        }
        if (!this.F) {
            m80Var.setVisibility(4);
            return;
        }
        m80Var.setVisibility(0);
        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
        if (fileProgress == null) {
            fileProgress = Float.valueOf(0.0f);
        }
        m80Var.a(fileProgress.floatValue(), false);
    }

    public org.telegram.ui.Components.u9 getImageView() {
        return this.b;
    }

    public MessageObject getMessage() {
        return this.E;
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
        this.N = 0L;
        e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        np npVar = this.n;
        if (npVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(npVar.a.q);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.H != 1) {
            TextView textView = this.c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - AndroidUtilities.dp(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.y0.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.w5 w5Var = this.e;
                w5Var.layout(w5Var.getLeft(), w5Var.getTop() + measuredHeight, w5Var.getRight(), w5Var.getBottom() + measuredHeight);
                aj0 aj0Var = this.f;
                aj0Var.layout(aj0Var.getLeft(), aj0Var.getTop() + measuredHeight, aj0Var.getRight(), aj0Var.getBottom() + measuredHeight);
                m80 m80Var = this.h;
                m80Var.layout(m80Var.getLeft(), (getMeasuredHeight() - m80Var.getMeasuredHeight()) - (this.w ? 1 : 0), m80Var.getRight(), getMeasuredHeight() - (this.w ? 1 : 0));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12 = this.H;
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
        if (this.J != null && (textView = this.s) != null && this.E.hasHighlightedWords()) {
            this.Q = true;
            textView.setText(AndroidUtilities.ellipsizeCenterEnd(this.J, this.E.highlightedWords.get(0), textView.getMeasuredWidth(), textView.getPaint(), 130));
            this.Q = false;
            measuredHeight = org.telegram.messenger.y0.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
        m80 m80Var = this.h;
        if (m80Var.getVisibility() != 0) {
            f(true);
        }
        this.N = j3;
        e();
        m80Var.a(Math.min(1.0f, j3 / j10), true);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.h.a(1.0f, true);
        f(true);
        this.N = 0L;
        e();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Q) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawDownloadIcon(boolean z10) {
        this.v = z10;
    }

    public void setEnterAnimationAlpha(float f7) {
        if (this.R != f7) {
            this.R = f7;
            invalidate();
        }
    }

    public void setGlobalGradientView(t00 t00Var) {
        this.M = t00Var;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        ai.z5 z5Var = this.b;
        if (endsWith) {
            z5Var.f("vthumb://0:".concat(str), null, null);
            z5Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            z5Var.setVisibility(8);
        } else {
            z5Var.f("thumb://0:".concat(str), null, null);
            z5Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(MediaController.PhotoEntry photoEntry) {
        String str;
        String str2 = photoEntry.thumbPath;
        ai.z5 z5Var = this.b;
        if (str2 != null) {
            z5Var.f(str2, null, org.telegram.ui.ActionBar.i6.R4);
            str = photoEntry.thumbPath;
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                z5Var.q(0, true);
                z5Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.i6.R4);
            } else {
                z5Var.p(photoEntry.orientation, photoEntry.invert, true);
                z5Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.i6.R4);
            }
            str = photoEntry.path;
        } else {
            z5Var.setImageDrawable(org.telegram.ui.ActionBar.i6.R4);
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
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
