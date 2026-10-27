package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.eb1;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.jb1;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nb1;
import org.telegram.ui.Components.ub1;
import org.telegram.ui.Components.xc;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d2 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public StaticLayout E;
    public final int F;
    public StaticLayout G;
    public final int H;
    public StaticLayout I;
    public TLRPC.BotInlineResult J;
    public TLRPC.User K;
    public TLRPC.Document L;
    public int M;
    public TLRPC.Photo N;
    public TLRPC.PhotoSize O;
    public int P;
    public boolean Q;
    public MessageObject R;
    public AnimatorSet S;
    public final Paint T;
    public final int U;
    public int V;
    public final RadialProgress2 W;
    public final ImageReceiver a;
    public boolean a0;
    public boolean b;
    public final aq b0;
    public final i90 c;
    public c2 c0;
    public final int d;
    public xc d0;
    public Object e;
    public boolean e0;
    public final org.telegram.ui.ActionBar.u6 f;
    public String f0;
    public boolean g0;
    public eb1 h;
    public float h0;
    public final b2 i0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public d2(Context context) {
        this(context, null, false);
    }

    private int getIconForCurrentState() {
        int i10 = this.P;
        RadialProgress2 radialProgress2 = this.W;
        if (i10 != 3 && i10 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.y6.le, org.telegram.ui.ActionBar.y6.me, org.telegram.ui.ActionBar.y6.ne, org.telegram.ui.ActionBar.y6.oe);
            return this.V == 1 ? 10 : 4;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.y6.ie, org.telegram.ui.ActionBar.y6.je, org.telegram.ui.ActionBar.y6.uc, org.telegram.ui.ActionBar.y6.vc);
        int i11 = this.V;
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 2;
        }
        return i11 == 4 ? 3 : 0;
    }

    public final void a() {
        int i10 = this.P;
        if (i10 == 3 || i10 == 5) {
            int i11 = this.V;
            RadialProgress2 radialProgress2 = this.W;
            if (i11 == 0) {
                if (MediaController.getInstance().playMessage(this.R)) {
                    this.V = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            if (i11 == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.R)) {
                    this.V = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            int i12 = this.d;
            if (i11 == 2) {
                radialProgress2.p(0.0f, false);
                if (this.L != null) {
                    FileLoader.getInstance(i12).loadFile(this.L, this.J, 1, 0);
                } else if (this.J.content instanceof TLRPC.TL_webDocument) {
                    FileLoader.getInstance(i12).loadFile(WebFile.createWithWebDocument(this.J.content), 3, 1);
                }
                this.V = 4;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            if (i11 == 4) {
                if (this.L != null) {
                    FileLoader.getInstance(i12).cancelLoadFile(this.L);
                } else if (this.J.content instanceof TLRPC.TL_webDocument) {
                    FileLoader.getInstance(i12).cancelLoadFile(WebFile.createWithWebDocument(this.J.content));
                }
                this.V = 2;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        }
    }

    public final void b() {
        this.R = null;
        this.P = 0;
        TLRPC.Document document = this.L;
        if (document == null) {
            TLRPC.BotInlineResult botInlineResult = this.J;
            if (botInlineResult != null) {
                if (botInlineResult.photo != null) {
                    this.P = 7;
                } else if (botInlineResult.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                    this.P = 5;
                } else if (this.J.type.equals("voice")) {
                    this.P = 3;
                }
            }
        } else if (MessageObject.isGifDocument(document)) {
            this.P = 2;
        } else if (MessageObject.isStickerDocument(this.L) || MessageObject.isAnimatedStickerDocument(this.L, true)) {
            this.P = 6;
        } else if (MessageObject.isMusicDocument(this.L)) {
            this.P = 5;
        } else if (MessageObject.isVoiceDocument(this.L)) {
            this.P = 3;
        }
        int i10 = this.P;
        if (i10 == 3 || i10 == 5) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = -Utilities.random.nextInt();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i11 = this.d;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            TLRPC.MessageMedia messageMedia = tL_message.media;
            messageMedia.document.file_reference = new byte[0];
            tL_message.flags |= 768;
            TLRPC.Document document2 = this.L;
            if (document2 != null) {
                messageMedia.document = document2;
                tL_message.attachPath = "";
            } else {
                String httpUrlExtension = ImageLoader.getHttpUrlExtension(this.J.content.url, this.P == 5 ? "mp3" : "ogg");
                TLRPC.Document document3 = tL_message.media.document;
                document3.id = 0L;
                document3.access_hash = 0L;
                document3.date = tL_message.date;
                document3.mime_type = b10.j("audio/", httpUrlExtension);
                TLRPC.Document document4 = tL_message.media.document;
                document4.size = 0L;
                document4.dc_id = 0;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.duration = MessageObject.getInlineResultDuration(this.J);
                TLRPC.BotInlineResult botInlineResult2 = this.J;
                String str = botInlineResult2.title;
                if (str == null) {
                    str = "";
                }
                tL_documentAttributeAudio.title = str;
                String str2 = botInlineResult2.description;
                tL_documentAttributeAudio.performer = str2 != null ? str2 : "";
                tL_documentAttributeAudio.flags |= 3;
                if (this.P == 3) {
                    tL_documentAttributeAudio.voice = true;
                }
                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Utilities.MD5(this.J.content.url));
                sb2.append(".");
                sb2.append(ImageLoader.getHttpUrlExtension(this.J.content.url, this.P == 5 ? "mp3" : "ogg"));
                tL_documentAttributeFilename.file_name = sb2.toString();
                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                File directory = FileLoader.getDirectory(4);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Utilities.MD5(this.J.content.url));
                sb3.append(".");
                sb3.append(ImageLoader.getHttpUrlExtension(this.J.content.url, this.P == 5 ? "mp3" : "ogg"));
                tL_message.attachPath = new File(directory, sb3.toString()).getAbsolutePath();
            }
            this.R = new MessageObject(i11, tL_message, false, true);
        }
    }

    public final void c(boolean z10, boolean z11) {
        aq aqVar = this.b0;
        if (aqVar == null) {
            return;
        }
        if (aqVar.getVisibility() != 0) {
            aqVar.setVisibility(0);
        }
        aqVar.a(z10, z11);
        AnimatorSet animatorSet = this.S;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.S = null;
        }
        if (!z11) {
            this.h0 = z10 ? 0.85f : 1.0f;
            invalidate();
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.S = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.i0, z10 ? 0.81f : 1.0f));
        this.S.setDuration(200L);
        this.S.addListener(new bh.f0(23, this, z10));
        this.S.start();
    }

    public final void d(int i10, TLRPC.Document document, Object obj) {
        this.n = false;
        this.s = false;
        this.M = i10;
        this.J = null;
        this.e = obj;
        this.L = document;
        this.N = null;
        this.Q = true;
        this.x = true;
        b();
        this.P = 2;
        requestLayout();
        this.f0 = null;
        this.g0 = false;
        this.e0 = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.n = z11;
        this.s = z12;
        this.K = user;
        this.J = botInlineResult;
        this.e = botInlineResult;
        if (botInlineResult != null) {
            this.L = botInlineResult.document;
            this.N = botInlineResult.photo;
        } else {
            this.L = null;
            this.N = null;
        }
        this.Q = z10;
        this.x = z13;
        eb1 eb1Var = this.h;
        if (eb1Var != null && eb1Var.r) {
            eb1Var.r = false;
            eb1Var.h.p(false);
            eb1Var.h.q();
            jb1.q(eb1Var.c);
        }
        this.h = (botInlineResult == null || !(botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageWidget)) ? null : new eb1(this, this.d, botInlineResult, this.f);
        b();
        if (z13) {
            this.P = 2;
        }
        requestLayout();
        this.f0 = null;
        this.g0 = false;
        this.e0 = false;
        f(false, false);
    }

    public final void f(boolean z10, boolean z11) {
        String str = this.f0;
        if (str == null && !this.e0) {
            this.e0 = true;
            Utilities.searchQueue.postRunnable(new a2(this, z10));
            this.W.setIcon(4, z10, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.V = -1;
            this.W.setIcon(4, z10, false);
            return;
        }
        boolean isLoadingFile = this.L != null ? FileLoader.getInstance(this.d).isLoadingFile(this.f0) : ImageLoader.getInstance().isLoadingHttpFile(this.f0);
        if (isLoadingFile || !this.g0) {
            DownloadController.getInstance(this.d).addLoadingFileObserver(this.f0, this);
            int i10 = this.P;
            if (i10 != 5 && i10 != 3) {
                this.V = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(this.f0);
                this.W.p(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            } else if (isLoadingFile) {
                this.V = 4;
                Float fileProgress2 = ImageLoader.getInstance().getFileProgress(this.f0);
                if (fileProgress2 != null) {
                    this.W.p(fileProgress2.floatValue(), z11);
                } else {
                    this.W.p(0.0f, z11);
                }
            } else {
                this.V = 2;
            }
        } else {
            DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
            int i11 = this.P;
            if (i11 == 5 || i11 == 3) {
                boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.R);
                if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.V = 0;
                } else {
                    this.V = 1;
                }
                this.W.p(1.0f, z11);
            } else {
                this.V = -1;
            }
        }
        this.W.setIcon(getIconForCurrentState(), z10, z11);
        invalidate();
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.J;
    }

    public int getDate() {
        return this.M;
    }

    public TLRPC.Document getDocument() {
        return this.L;
    }

    public TLRPC.User getInlineBot() {
        return this.K;
    }

    public MessageObject getMessageObject() {
        return this.R;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.U;
    }

    public Object getParentObject() {
        return this.e;
    }

    public ImageReceiver getPhotoImage() {
        return this.a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.J;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a.onAttachedToWindow()) {
            f(false, false);
        }
        this.W.e();
        if (this.h == null || getMeasuredWidth() <= 0) {
            return;
        }
        this.h.f(getMeasuredWidth() - AndroidUtilities.dp(this.Q ? 4.0f : 16.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.onDetachedFromWindow();
        this.W.f();
        DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
        eb1 eb1Var = this.h;
        if (eb1Var == null || !eb1Var.r) {
            return;
        }
        eb1Var.r = false;
        eb1Var.h.p(false);
        eb1Var.h.q();
        jb1.q(eb1Var.c);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        eb1 eb1Var = this.h;
        if (eb1Var != null) {
            float dp = AndroidUtilities.dp(this.Q ? 2.0f : 8.0f);
            float dp2 = AndroidUtilities.dp(this.Q ? 2.0f : 6.0f);
            Paint paint = eb1Var.e;
            Path path = eb1Var.f;
            nb1 nb1Var = eb1Var.c;
            if (nb1Var != null && (i11 = eb1Var.n) > 0) {
                int min = Math.min(jb1.d(eb1Var.b, nb1Var, i11), AndroidUtilities.dp(320.0f));
                float dp3 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                canvas.save();
                canvas.translate(dp, dp2);
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, eb1Var.n, min);
                path.addRoundRect(rectF, dp3, dp3, Path.Direction.CW);
                canvas.clipPath(path);
                paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Aa, eb1Var.d) | (-16777216));
                canvas.drawRect(rectF, paint);
                ub1 ub1Var = eb1Var.h;
                if (ub1Var != null && ub1Var.b(canvas, eb1Var.n)) {
                    eb1Var.a.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
            if (!this.n || this.Q) {
                return;
            }
            canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
            return;
        }
        ImageReceiver imageReceiver = this.a;
        aq aqVar = this.b0;
        if (aqVar != null && (aqVar.a.q || !imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f || PhotoViewer.Q1((MessageObject) this.e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.T);
        }
        if (this.G != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.F);
            this.G.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.I;
        org.telegram.ui.ActionBar.u6 u6Var = this.f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.y6.g3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.z6, u6Var));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.H);
            this.I.draw(canvas);
            canvas.restore();
        }
        if (this.E != null) {
            org.telegram.ui.ActionBar.y6.g3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.J6, u6Var));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.y);
            this.E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = this.Q;
        RadialProgress2 radialProgress2 = this.W;
        if (z10) {
            TLRPC.BotInlineResult botInlineResult = this.J;
            if (botInlineResult != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.y6.o4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.y6.o4.getIntrinsicHeight();
                    int B = (int) c3.h0.B(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int B2 = (int) c3.h0.B(imageReceiver.getImageHeight(), intrinsicHeight, 2.0f, imageReceiver.getImageY());
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageWidth() + imageReceiver.getImageX(), imageReceiver.getImageHeight() + imageReceiver.getImageY(), i90.k);
                    org.telegram.ui.ActionBar.y6.o4.setBounds(B, B2, intrinsicWidth + B, intrinsicHeight + B2);
                    org.telegram.ui.ActionBar.y6.o4.draw(canvas);
                }
            }
        } else {
            boolean z11 = this.b;
            i90 i90Var = this.c;
            if (!z11 || PhotoViewer.R1(this.J)) {
                i90Var.setAlpha(255);
            } else {
                i90Var.setAlpha((int) ((1.0f - imageReceiver.getCurrentAlpha()) * 255.0f));
            }
            int i12 = this.P;
            if (i12 == 3 || i12 == 5) {
                radialProgress2.d = org.telegram.ui.ActionBar.y6.w0(this.r ? org.telegram.ui.ActionBar.y6.jd : org.telegram.ui.ActionBar.y6.id, u6Var);
                radialProgress2.draw(canvas);
            } else {
                TLRPC.BotInlineResult botInlineResult2 = this.J;
                if (botInlineResult2 == null || !botInlineResult2.type.equals("file")) {
                    TLRPC.BotInlineResult botInlineResult3 = this.J;
                    if (botInlineResult3 == null || !(botInlineResult3.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND) || this.J.type.equals("voice"))) {
                        TLRPC.BotInlineResult botInlineResult4 = this.J;
                        if (botInlineResult4 == null || !(botInlineResult4.type.equals("venue") || this.J.type.equals("geo"))) {
                            i90Var.draw(canvas);
                        } else {
                            int intrinsicWidth2 = org.telegram.ui.ActionBar.y6.o4.getIntrinsicWidth();
                            int intrinsicHeight2 = org.telegram.ui.ActionBar.y6.o4.getIntrinsicHeight();
                            int imageX = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth2) / 2));
                            int imageY = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight2) / 2));
                            canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), i90.k);
                            org.telegram.ui.ActionBar.y6.o4.setBounds(imageX, imageY, intrinsicWidth2 + imageX, intrinsicHeight2 + imageY);
                            org.telegram.ui.ActionBar.y6.o4.draw(canvas);
                        }
                    } else {
                        int intrinsicWidth3 = org.telegram.ui.ActionBar.y6.n4.getIntrinsicWidth();
                        int intrinsicHeight3 = org.telegram.ui.ActionBar.y6.n4.getIntrinsicHeight();
                        int imageX2 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth3) / 2));
                        int imageY2 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight3) / 2));
                        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), i90.k);
                        org.telegram.ui.ActionBar.y6.n4.setBounds(imageX2, imageY2, intrinsicWidth3 + imageX2, intrinsicHeight3 + imageY2);
                        org.telegram.ui.ActionBar.y6.n4.draw(canvas);
                    }
                } else {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.y6.m4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.y6.m4.getIntrinsicHeight();
                    int imageX3 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth4) / 2));
                    int imageY3 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight4) / 2));
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), i90.k);
                    org.telegram.ui.ActionBar.y6.m4.setBounds(imageX3, imageY3, intrinsicWidth4 + imageX3, intrinsicHeight4 + imageY3);
                    org.telegram.ui.ActionBar.y6.m4.draw(canvas);
                }
            }
        }
        if (this.b) {
            if (this.J != null) {
                imageReceiver.setVisible(!PhotoViewer.R1(r14), false);
            }
            canvas.save();
            float f7 = this.h0;
            xc xcVar = this.d0;
            if (xcVar != null) {
                f7 *= xcVar.a(0.1f);
            }
            canvas.scale(f7, f7, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        if (this.Q && ((i10 = this.P) == 7 || i10 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.n && !this.Q) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
            }
        }
        if (this.s) {
            org.telegram.ui.ActionBar.y6.p4.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(3.0f));
            org.telegram.ui.ActionBar.y6.p4.draw(canvas);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        f(true, z10);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        switch (this.P) {
            case 1:
                sb2.append(LocaleController.getString(R.string.AttachDocument));
                break;
            case 2:
                sb2.append(LocaleController.getString(R.string.AttachGif));
                break;
            case 3:
                sb2.append(LocaleController.getString(R.string.AttachAudio));
                break;
            case 4:
                sb2.append(LocaleController.getString(R.string.AttachVideo));
                break;
            case 5:
                sb2.append(LocaleController.getString(R.string.AttachMusic));
                break;
            case 6:
                sb2.append(LocaleController.getString(R.string.AttachSticker));
                break;
            case 7:
                sb2.append(LocaleController.getString(R.string.AttachPhoto));
                break;
        }
        StaticLayout staticLayout = this.G;
        boolean z10 = (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) ? false : true;
        StaticLayout staticLayout2 = this.I;
        boolean z11 = (staticLayout2 == null || TextUtils.isEmpty(staticLayout2.getText())) ? false : true;
        if (this.P == 5 && z10 && z11) {
            sb2.append(", ");
            sb2.append(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.I.getText(), this.G.getText()));
        } else {
            if (z10) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.G.getText());
            }
            if (z11) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.I.getText());
            }
        }
        accessibilityNodeInfo.setText(sb2);
        aq aqVar = this.b0;
        if (aqVar != null && aqVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i10 = this.P;
        if (i10 == 3 || i10 == 5) {
            int iconForCurrentState = getIconForCurrentState();
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? LocaleController.getString("AccActionPlay", R.string.AccActionPlay) : LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload) : LocaleController.getString("AccActionDownload", R.string.AccActionDownload) : LocaleController.getString("AccActionPause", R.string.AccActionPause)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0327 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x034a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fd  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        i90 i90Var;
        float f7;
        float f10;
        i90 i90Var2;
        ?? r72;
        float f11;
        float f12;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        String str;
        TLRPC.BotInlineResult botInlineResult;
        WebFile webFile;
        String str2;
        int i12;
        int i13;
        TLRPC.PhotoSize photoSize;
        TLRPC.Document document2;
        ImageReceiver imageReceiver;
        int i14;
        String str3;
        String str4;
        TLRPC.TL_photoStrippedSize strippedPhotoSize;
        ImageLocation imageLocation;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        ImageLocation forPhoto;
        String m10;
        String concat;
        ImageReceiver imageReceiver4;
        boolean z11;
        float f13;
        int dp;
        aq aqVar;
        TLRPC.TL_webDocument tL_webDocument;
        TLRPC.BotInlineMessage botInlineMessage;
        String str5;
        TLRPC.BotInlineResult botInlineResult2;
        String str6;
        boolean z12;
        char c10;
        boolean z13;
        int i15 = 0;
        this.b = false;
        this.I = null;
        this.G = null;
        this.E = null;
        this.O = null;
        this.y = AndroidUtilities.dp(27.0f);
        if (this.J == null && this.L == null) {
            setMeasuredDimension(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
            return;
        }
        if (this.h != null) {
            int size = View.MeasureSpec.getSize(i10);
            int dp2 = size - AndroidUtilities.dp(this.Q ? 4.0f : 16.0f);
            eb1 eb1Var = this.h;
            setMeasuredDimension(size, AndroidUtilities.dp(this.Q ? 4.0f : 12.0f) + Math.min(jb1.d(eb1Var.b, eb1Var.c, dp2), AndroidUtilities.dp(320.0f)) + (this.n ? 1 : 0));
            if (isAttachedToWindow()) {
                this.h.f(dp2);
                return;
            }
            return;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int dp3 = (size2 - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(8.0f);
        if (this.L != null) {
            arrayList2 = new ArrayList(this.L.thumbs);
        } else {
            TLRPC.BotInlineResult botInlineResult3 = this.J;
            if (botInlineResult3 == null || botInlineResult3.photo == null) {
                arrayList = null;
                z10 = this.Q;
                i90Var = this.c;
                if (!z10 || (botInlineResult2 = this.J) == null) {
                    f7 = 100.0f;
                    f10 = 1.0f;
                    i90Var2 = i90Var;
                    r72 = 1;
                    f11 = 12.0f;
                    f12 = 4.0f;
                } else {
                    f7 = 100.0f;
                    if (botInlineResult2.title != null) {
                        f11 = 12.0f;
                        try {
                            f12 = 4.0f;
                            try {
                                this.G = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(this.J.title.replace('\n', ' '), org.telegram.ui.ActionBar.y6.f3.getFontMetricsInt(), false), org.telegram.ui.ActionBar.y6.f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.y6.f3.measureText(r0)), dp3), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.y6.f3, dp3 + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            } catch (Exception e) {
                                e = e;
                                FileLog.e(e);
                                i90Var.a(this.J.title);
                                str6 = this.J.description;
                                if (str6 == null) {
                                }
                                r72 = z13;
                                if (this.J.url != null) {
                                }
                                document = this.L;
                                if (document != null) {
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            f12 = 4.0f;
                        }
                        i90Var.a(this.J.title);
                    } else {
                        f11 = 12.0f;
                        f12 = 4.0f;
                    }
                    str6 = this.J.description;
                    if (str6 == null) {
                        try {
                        } catch (Exception e11) {
                            e = e11;
                            f10 = 1.0f;
                            i90Var2 = i90Var;
                        }
                        try {
                            z12 = true;
                            c10 = ' ';
                            i90Var2 = i90Var;
                            f10 = 1.0f;
                        } catch (Exception e12) {
                            e = e12;
                            i90Var2 = i90Var;
                            f10 = 1.0f;
                            z12 = true;
                            c10 = ' ';
                            FileLog.e(e);
                            z13 = z12;
                            r72 = z13;
                            if (this.J.url != null) {
                            }
                            document = this.L;
                            if (document != null) {
                            }
                        }
                        try {
                            StaticLayout u22 = s1.u2(Emoji.replaceEmoji(str6, org.telegram.ui.ActionBar.y6.g3.getFontMetricsInt(), false), org.telegram.ui.ActionBar.y6.g3, dp3, dp3, 0, 3);
                            this.I = u22;
                            z13 = z12;
                            if (u22.getLineCount() > 0) {
                                int i16 = this.H;
                                StaticLayout staticLayout = this.I;
                                this.y = i16 + staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + AndroidUtilities.dp(1.0f);
                                z13 = z12;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            FileLog.e(e);
                            z13 = z12;
                            r72 = z13;
                            if (this.J.url != null) {
                            }
                            document = this.L;
                            if (document != null) {
                            }
                        }
                    } else {
                        f10 = 1.0f;
                        i90Var2 = i90Var;
                        z13 = true;
                        c10 = ' ';
                    }
                    r72 = z13;
                    if (this.J.url != null) {
                        try {
                            this.E = new StaticLayout(TextUtils.ellipsize(this.J.url.replace('\n', c10), org.telegram.ui.ActionBar.y6.g3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.y6.g3.measureText(r0)), dp3), TextUtils.TruncateAt.MIDDLE), org.telegram.ui.ActionBar.y6.g3, dp3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            r72 = z13;
                        } catch (Exception e14) {
                            FileLog.e(e14);
                            r72 = z13;
                        }
                    }
                }
                document = this.L;
                if (document != null) {
                    if (this.x || MessageObject.isGifDocument(document)) {
                        this.O = FileLoader.getClosestPhotoSizeWithSize(this.L.thumbs, 90, false, null, r72);
                    } else {
                        if (MessageObject.isStickerDocument(this.L) || MessageObject.isAnimatedStickerDocument(this.L, r72)) {
                            this.O = FileLoader.getClosestPhotoSizeWithSize(this.L.thumbs, 90, false, null, r72);
                            str = "webp";
                            closestPhotoSizeWithSize = null;
                            botInlineResult = this.J;
                            if (botInlineResult == null) {
                                if ((botInlineResult.content instanceof TLRPC.TL_webDocument) && (str5 = botInlineResult.type) != null) {
                                    if (str5.startsWith("gif")) {
                                        TLRPC.WebDocument webDocument = this.J.thumb;
                                        tL_webDocument = ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) ? (TLRPC.TL_webDocument) this.J.thumb : (TLRPC.TL_webDocument) this.J.content;
                                        this.P = 2;
                                    } else if (this.J.type.equals("photo")) {
                                        TLRPC.BotInlineResult botInlineResult4 = this.J;
                                        TLRPC.WebDocument webDocument2 = botInlineResult4.thumb;
                                        tL_webDocument = webDocument2 instanceof TLRPC.TL_webDocument ? (TLRPC.TL_webDocument) webDocument2 : (TLRPC.TL_webDocument) botInlineResult4.content;
                                    }
                                    if (tL_webDocument == null) {
                                        TLRPC.WebDocument webDocument3 = this.J.thumb;
                                        if (webDocument3 instanceof TLRPC.TL_webDocument) {
                                            tL_webDocument = (TLRPC.TL_webDocument) webDocument3;
                                        }
                                    }
                                    if (tL_webDocument == null && this.O == null && closestPhotoSizeWithSize == null) {
                                        botInlineMessage = this.J.send_message;
                                        if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo)) {
                                            TLRPC.GeoPoint geoPoint = botInlineMessage.geo;
                                            double d = geoPoint.lat;
                                            double d10 = geoPoint._long;
                                            if (MessagesController.getInstance(this.d).mapProvider != 2) {
                                                webFile = WebFile.createWithGeoPoint(this.J.send_message.geo, 72, 72, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)));
                                                str2 = null;
                                                if (tL_webDocument != null) {
                                                    webFile = WebFile.createWithWebDocument(tL_webDocument);
                                                }
                                            } else {
                                                str2 = AndroidUtilities.formapMapUrl(this.d, d, d10, 72, 72, true, 15, -1);
                                                webFile = null;
                                                if (tL_webDocument != null) {
                                                }
                                            }
                                        }
                                    }
                                    webFile = null;
                                    str2 = null;
                                    if (tL_webDocument != null) {
                                    }
                                }
                                tL_webDocument = null;
                                if (tL_webDocument == null) {
                                }
                                if (tL_webDocument == null) {
                                    botInlineMessage = this.J.send_message;
                                    if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                                    }
                                    TLRPC.GeoPoint geoPoint2 = botInlineMessage.geo;
                                    double d11 = geoPoint2.lat;
                                    double d102 = geoPoint2._long;
                                    if (MessagesController.getInstance(this.d).mapProvider != 2) {
                                    }
                                }
                                webFile = null;
                                str2 = null;
                                if (tL_webDocument != null) {
                                }
                            } else {
                                webFile = null;
                                str2 = null;
                            }
                            if (this.L != null) {
                                for (int i17 = 0; i17 < this.L.attributes.size(); i17++) {
                                    TLRPC.DocumentAttribute documentAttribute = this.L.attributes.get(i17);
                                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                        i12 = documentAttribute.w;
                                        i13 = documentAttribute.h;
                                        break;
                                    }
                                }
                            }
                            i12 = 0;
                            i13 = 0;
                            if (i12 != 0 || i13 == 0) {
                                photoSize = this.O;
                                if (photoSize == null) {
                                    if (closestPhotoSizeWithSize != null) {
                                        closestPhotoSizeWithSize.size = -1;
                                    }
                                    i12 = photoSize.w;
                                    i13 = photoSize.h;
                                } else {
                                    TLRPC.BotInlineResult botInlineResult5 = this.J;
                                    if (botInlineResult5 != null) {
                                        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult5);
                                        int i18 = inlineResultWidthAndHeight[0];
                                        i13 = inlineResultWidthAndHeight[r72];
                                        i12 = i18;
                                    }
                                }
                            }
                            if (i12 != 0 || i13 == 0) {
                                i12 = AndroidUtilities.dp(80.0f);
                                i13 = i12;
                            }
                            document2 = this.L;
                            imageReceiver = this.a;
                            if (document2 != null && this.O == null && webFile == null && str2 == null) {
                                i14 = 3;
                                imageReceiver4 = imageReceiver;
                            } else {
                                i14 = 3;
                                if (this.Q) {
                                    str3 = "52_52_b";
                                    str4 = "52_52";
                                } else {
                                    int min = Math.min(i12, i13) / 3;
                                    if (this.P == 2) {
                                        Locale locale = Locale.US;
                                        String m11 = a1.g.m((int) (min / AndroidUtilities.density), "_80_b");
                                        if (SharedConfig.isAutoplayGifs() || this.w) {
                                            str4 = m11;
                                            str3 = str4;
                                        } else {
                                            concat = m11.concat("_firstframe");
                                            m10 = m11.concat("_firstframe");
                                        }
                                    } else {
                                        Locale locale2 = Locale.US;
                                        m10 = a1.g.m((int) (min / AndroidUtilities.density), "_80");
                                        concat = m10.concat("_b");
                                    }
                                    str4 = m10;
                                    str3 = concat;
                                }
                                imageReceiver.setAspectFit(this.P != 6 ? r72 : false);
                                strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                                if (strippedPhotoSize != null) {
                                    TLRPC.Document document3 = this.L;
                                    if (document3 != null) {
                                        forPhoto = ImageLocation.getForDocument(strippedPhotoSize, document3);
                                    } else {
                                        TLRPC.Photo photo = this.N;
                                        if (photo != null) {
                                            forPhoto = ImageLocation.getForPhoto(strippedPhotoSize, photo);
                                        }
                                    }
                                    imageLocation = forPhoto;
                                    if (this.P == 2) {
                                        TLRPC.Document document4 = this.L;
                                        if (document4 != null) {
                                            TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(document4);
                                            if (documentVideoThumb != null) {
                                                ImageLocation forDocument = ImageLocation.getForDocument(documentVideoThumb, this.L);
                                                StringBuilder sb2 = new StringBuilder("100_100");
                                                sb2.append((SharedConfig.isAutoplayGifs() || this.w) ? "" : "_firstframe");
                                                imageReceiver2 = imageReceiver;
                                                imageReceiver2.setImage(forDocument, sb2.toString(), ImageLocation.getForDocument(this.O, this.L), str4, imageLocation, str3, null, -1L, str, this.e, 1);
                                            } else {
                                                imageReceiver2 = imageReceiver;
                                                ImageLocation forDocument2 = ImageLocation.getForDocument(this.L);
                                                if (this.x) {
                                                    forDocument2.imageType = 2;
                                                }
                                                StringBuilder sb3 = new StringBuilder("100_100");
                                                sb3.append((SharedConfig.isAutoplayGifs() || this.w) ? "" : "_firstframe");
                                                imageReceiver2.setImage(forDocument2, sb3.toString(), ImageLocation.getForDocument(this.O, this.L), str4, imageLocation, str3, null, this.L.size, str, this.e, 0);
                                            }
                                        } else {
                                            imageReceiver2 = imageReceiver;
                                            if (webFile != null) {
                                                imageReceiver2.setImage(ImageLocation.getForWebFile(webFile), "100_100", ImageLocation.getForPhoto(this.O, this.N), str4, imageLocation, str3, null, -1L, str, this.e, 1);
                                            } else {
                                                imageReceiver2.setImage(ImageLocation.getForPath(str2), "100_100", ImageLocation.getForPhoto(this.O, this.N), str4, imageLocation, str3, null, -1L, str, this.e, 1);
                                            }
                                        }
                                    } else {
                                        imageReceiver2 = imageReceiver;
                                        if (this.O != null) {
                                            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(this.L, org.telegram.ui.ActionBar.y6.a7, f10);
                                            if (!MessageObject.canAutoplayAnimatedSticker(this.L)) {
                                                TLRPC.Document document5 = this.L;
                                                if (document5 == null) {
                                                    imageReceiver2.setImage(ImageLocation.getForPhoto(this.O, this.N), str4, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.N), str3, imageLocation, str3, null, this.O.size, str, this.e, 0);
                                                } else if (svgThumb != null) {
                                                    imageReceiver2.setImage(ImageLocation.getForDocument(this.O, document5), str4, null, null, imageLocation, str3, svgThumb, this.O.size, str, this.e, 0);
                                                } else {
                                                    imageReceiver2.setImage(ImageLocation.getForDocument(this.O, document5), str4, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.N), str3, imageLocation, str3, null, this.O.size, str, this.e, 0);
                                                }
                                            } else if (svgThumb != null) {
                                                imageReceiver2.setImage(ImageLocation.getForDocument(this.L), "80_80", null, null, imageLocation, str3, svgThumb, this.O.size, str, this.e, 0);
                                            } else {
                                                imageReceiver2.setImage(ImageLocation.getForDocument(this.L), "80_80", ImageLocation.getForDocument(this.O, this.L), str3, imageLocation, str3, null, this.O.size, str, this.e, 0);
                                            }
                                        } else if (webFile != null) {
                                            imageReceiver2.setImage(ImageLocation.getForWebFile(webFile), str4, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.N), str3, imageLocation, str3, null, -1L, str, this.e, 1);
                                        } else {
                                            imageReceiver2.setImage(ImageLocation.getForPath(str2), str4, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.N), str3, imageLocation, str3, null, -1L, str, this.e, 1);
                                        }
                                    }
                                    imageReceiver3 = imageReceiver2;
                                    if (!SharedConfig.isAutoplayGifs() || this.w) {
                                        imageReceiver3.setAllowStartAnimation(r72);
                                        imageReceiver3.startAnimation();
                                    } else {
                                        imageReceiver3.setAllowStartAnimation(false);
                                        imageReceiver3.stopAnimation();
                                    }
                                    this.b = r72;
                                    imageReceiver4 = imageReceiver3;
                                }
                                imageLocation = null;
                                if (this.P == 2) {
                                }
                                imageReceiver3 = imageReceiver2;
                                if (SharedConfig.isAutoplayGifs()) {
                                }
                                imageReceiver3.setAllowStartAnimation(r72);
                                imageReceiver3.startAnimation();
                                this.b = r72;
                                imageReceiver4 = imageReceiver3;
                            }
                            z11 = this.Q;
                            RadialProgress2 radialProgress2 = this.W;
                            if (z11) {
                                StaticLayout staticLayout2 = this.G;
                                if (staticLayout2 != null && staticLayout2.getLineCount() != 0) {
                                    StaticLayout staticLayout3 = this.G;
                                    i15 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - r72);
                                }
                                StaticLayout staticLayout4 = this.I;
                                if (staticLayout4 != null && staticLayout4.getLineCount() != 0) {
                                    StaticLayout staticLayout5 = this.I;
                                    i15 += staticLayout5.getLineBottom(staticLayout5.getLineCount() - r72);
                                }
                                StaticLayout staticLayout6 = this.E;
                                if (staticLayout6 != null && staticLayout6.getLineCount() > 0) {
                                    StaticLayout staticLayout7 = this.E;
                                    i15 += staticLayout7.getLineBottom(staticLayout7.getLineCount() - r72);
                                }
                                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.t.z(16.0f, Math.max(AndroidUtilities.dp(52.0f), i15), AndroidUtilities.dp(68.0f)) + (this.n ? 1 : 0));
                                int dp4 = AndroidUtilities.dp(52.0f);
                                if (LocaleController.isRTL) {
                                    f13 = 8.0f;
                                    dp = org.telegram.messenger.t.C(8.0f, View.MeasureSpec.getSize(i10), dp4);
                                } else {
                                    f13 = 8.0f;
                                    dp = AndroidUtilities.dp(8.0f);
                                }
                                i90Var2.setBounds(dp, AndroidUtilities.dp(f13), dp + dp4, AndroidUtilities.dp(60.0f));
                                float f14 = dp4;
                                imageReceiver4.setImageCoords(dp, AndroidUtilities.dp(f13), f14, f14);
                                int i19 = this.P;
                                if (i19 == i14 || i19 == 5) {
                                    radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
                                    radialProgress2.r(AndroidUtilities.dp(f12) + dp, AndroidUtilities.dp(f11), AndroidUtilities.dp(48.0f) + dp, AndroidUtilities.dp(56.0f));
                                }
                            } else {
                                int size3 = View.MeasureSpec.getSize(i11);
                                if (size3 == 0) {
                                    size3 = AndroidUtilities.dp(f7);
                                }
                                setMeasuredDimension(size2, size3);
                                int B = wh.B(24.0f, size2, 2);
                                int B2 = wh.B(24.0f, size3, 2);
                                radialProgress2.r(B, B2, AndroidUtilities.dp(24.0f) + B, AndroidUtilities.dp(24.0f) + B2);
                                radialProgress2.setCircleRadius(AndroidUtilities.dp(f11));
                                imageReceiver4.setImageCoords(0.0f, 0.0f, size2, size3);
                            }
                            aqVar = this.b0;
                            if (aqVar == null) {
                                measureChildWithMargins(aqVar, i10, 0, i11, 0);
                                return;
                            }
                            return;
                        }
                        int i20 = this.P;
                        if (i20 != 5 && i20 != 3) {
                            this.O = FileLoader.getClosestPhotoSizeWithSize(this.L.thumbs, 90, false, null, r72);
                        }
                    }
                    closestPhotoSizeWithSize = null;
                    str = null;
                    botInlineResult = this.J;
                    if (botInlineResult == null) {
                    }
                    if (this.L != null) {
                    }
                    i12 = 0;
                    i13 = 0;
                    if (i12 != 0) {
                    }
                    photoSize = this.O;
                    if (photoSize == null) {
                    }
                    if (i12 != 0) {
                    }
                    i12 = AndroidUtilities.dp(80.0f);
                    i13 = i12;
                    document2 = this.L;
                    imageReceiver = this.a;
                    if (document2 != null) {
                    }
                    i14 = 3;
                    if (this.Q) {
                    }
                    imageReceiver.setAspectFit(this.P != 6 ? r72 : false);
                    strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                    if (strippedPhotoSize != null) {
                    }
                    imageLocation = null;
                    if (this.P == 2) {
                    }
                    imageReceiver3 = imageReceiver2;
                    if (SharedConfig.isAutoplayGifs()) {
                    }
                    imageReceiver3.setAllowStartAnimation(r72);
                    imageReceiver3.startAnimation();
                    this.b = r72;
                    imageReceiver4 = imageReceiver3;
                    z11 = this.Q;
                    RadialProgress2 radialProgress22 = this.W;
                    if (z11) {
                    }
                    aqVar = this.b0;
                    if (aqVar == null) {
                    }
                } else {
                    TLRPC.BotInlineResult botInlineResult6 = this.J;
                    if (botInlineResult6 != null && botInlineResult6.photo != null) {
                        this.O = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), r72, null, r72);
                        closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 80, false, null, r72);
                        if (closestPhotoSizeWithSize != this.O) {
                            str = null;
                            botInlineResult = this.J;
                            if (botInlineResult == null) {
                            }
                            if (this.L != null) {
                            }
                            i12 = 0;
                            i13 = 0;
                            if (i12 != 0) {
                            }
                            photoSize = this.O;
                            if (photoSize == null) {
                            }
                            if (i12 != 0) {
                            }
                            i12 = AndroidUtilities.dp(80.0f);
                            i13 = i12;
                            document2 = this.L;
                            imageReceiver = this.a;
                            if (document2 != null) {
                            }
                            i14 = 3;
                            if (this.Q) {
                            }
                            imageReceiver.setAspectFit(this.P != 6 ? r72 : false);
                            strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                            if (strippedPhotoSize != null) {
                            }
                            imageLocation = null;
                            if (this.P == 2) {
                            }
                            imageReceiver3 = imageReceiver2;
                            if (SharedConfig.isAutoplayGifs()) {
                            }
                            imageReceiver3.setAllowStartAnimation(r72);
                            imageReceiver3.startAnimation();
                            this.b = r72;
                            imageReceiver4 = imageReceiver3;
                            z11 = this.Q;
                            RadialProgress2 radialProgress222 = this.W;
                            if (z11) {
                            }
                            aqVar = this.b0;
                            if (aqVar == null) {
                            }
                        }
                    }
                    closestPhotoSizeWithSize = null;
                    str = null;
                    botInlineResult = this.J;
                    if (botInlineResult == null) {
                    }
                    if (this.L != null) {
                    }
                    i12 = 0;
                    i13 = 0;
                    if (i12 != 0) {
                    }
                    photoSize = this.O;
                    if (photoSize == null) {
                    }
                    if (i12 != 0) {
                    }
                    i12 = AndroidUtilities.dp(80.0f);
                    i13 = i12;
                    document2 = this.L;
                    imageReceiver = this.a;
                    if (document2 != null) {
                    }
                    i14 = 3;
                    if (this.Q) {
                    }
                    imageReceiver.setAspectFit(this.P != 6 ? r72 : false);
                    strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                    if (strippedPhotoSize != null) {
                    }
                    imageLocation = null;
                    if (this.P == 2) {
                    }
                    imageReceiver3 = imageReceiver2;
                    if (SharedConfig.isAutoplayGifs()) {
                    }
                    imageReceiver3.setAllowStartAnimation(r72);
                    imageReceiver3.startAnimation();
                    this.b = r72;
                    imageReceiver4 = imageReceiver3;
                    z11 = this.Q;
                    RadialProgress2 radialProgress2222 = this.W;
                    if (z11) {
                    }
                    aqVar = this.b0;
                    if (aqVar == null) {
                    }
                }
            } else {
                arrayList2 = new ArrayList(this.J.photo.sizes);
            }
        }
        arrayList = arrayList2;
        z10 = this.Q;
        i90Var = this.c;
        if (z10) {
        }
        f7 = 100.0f;
        f10 = 1.0f;
        i90Var2 = i90Var;
        r72 = 1;
        f11 = 12.0f;
        f12 = 4.0f;
        document = this.L;
        if (document != null) {
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.W.p(Math.min(1.0f, j10 / j11), true);
        int i10 = this.P;
        if (i10 == 3 || i10 == 5) {
            if (this.V != 4) {
                f(false, true);
            }
        } else if (this.V != 1) {
            f(false, true);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.g0 = true;
        this.W.p(1.0f, true);
        f(false, true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (this.Q || this.c0 == null || this.J == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x9 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        AndroidUtilities.dp(48.0f);
        int i10 = this.P;
        i90 i90Var = this.c;
        boolean z10 = true;
        if (i10 == 3 || i10 == 5) {
            boolean contains = i90Var.getBounds().contains(x9, y3);
            int action = motionEvent.getAction();
            RadialProgress2 radialProgress2 = this.W;
            if (action == 0) {
                if (contains) {
                    this.r = true;
                    radialProgress2.o(true, false);
                    invalidate();
                }
            } else if (this.r) {
                if (motionEvent.getAction() == 1) {
                    this.r = false;
                    playSoundEffect(0);
                    a();
                    invalidate();
                } else if (motionEvent.getAction() == 3) {
                    this.r = false;
                    invalidate();
                } else if (motionEvent.getAction() == 2 && !contains) {
                    this.r = false;
                    invalidate();
                }
                radialProgress2.o(this.r, false);
            }
            z10 = false;
        } else {
            TLRPC.BotInlineResult botInlineResult = this.J;
            if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                if (motionEvent.getAction() == 0) {
                    if (i90Var.getBounds().contains(x9, y3)) {
                        this.r = true;
                    }
                } else if (this.r) {
                    if (motionEvent.getAction() == 1) {
                        this.r = false;
                        playSoundEffect(0);
                        ((ig.v0) this.c0).a.V.b.k(getResult());
                    } else if (motionEvent.getAction() == 3) {
                        this.r = false;
                    } else if (motionEvent.getAction() == 2 && !i90Var.getBounds().contains(x9, y3)) {
                        this.r = false;
                    }
                }
            }
            z10 = false;
        }
        return !z10 ? super.onTouchEvent(motionEvent) : z10;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        int i11;
        if (i10 != 16 || ((i11 = this.P) != 3 && i11 != 5)) {
            return super.performAccessibilityAction(i10, bundle);
        }
        a();
        return true;
    }

    public void setCanPreviewGif(boolean z10) {
        this.v = z10;
    }

    public void setDelegate(c2 c2Var) {
        this.c0 = c2Var;
    }

    public void setIsKeyboard(boolean z10) {
        this.w = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        xc xcVar = this.d0;
        if (xcVar != null) {
            xcVar.c(z10 || this.a0);
        }
    }

    public void setScaled(boolean z10) {
        this.a0 = z10;
        xc xcVar = this.d0;
        if (xcVar != null) {
            xcVar.c(isPressed() || this.a0);
        }
    }

    public d2(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.d = i10;
        this.F = AndroidUtilities.dp(7.0f);
        this.H = AndroidUtilities.dp(27.0f);
        this.h0 = 1.0f;
        this.i0 = new b2(0, this);
        this.f = u6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setLayerNum(1);
        imageReceiver.setUseSharedAnimationQueue(true);
        this.c = new i90(0, u6Var);
        this.W = new RadialProgress2(this, null);
        this.U = DownloadController.getInstance(i10).generateObserverTag();
        setFocusable(true);
        if (z10) {
            Paint paint = new Paint();
            this.T = paint;
            int i11 = org.telegram.ui.ActionBar.y6.Lh;
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
            aq aqVar = new aq(context, 21, u6Var);
            this.b0 = aqVar;
            aqVar.setVisibility(4);
            aqVar.b(-1, i11, org.telegram.ui.ActionBar.y6.k7);
            aqVar.setDrawUnchecked(false);
            aqVar.setDrawBackgroundAsArc(1);
            addView(aqVar, kb1.h(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
