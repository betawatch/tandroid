package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.u70;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e2 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public final int A;
    public StaticLayout B;
    public final int C;
    public StaticLayout D;
    public TLRPC.BotInlineResult E;
    public TLRPC.User F;
    public TLRPC.Document G;
    public int H;
    public TLRPC.Photo I;
    public TLRPC.PhotoSize J;
    public int K;
    public boolean L;
    public MessageObject M;
    public AnimatorSet N;
    public final Paint O;
    public final int P;
    public int Q;
    public final RadialProgress2 R;
    public boolean S;
    public final dp T;
    public d2 U;
    public pc V;
    public boolean W;
    public final ImageReceiver a;
    public String a0;
    public boolean b;
    public boolean b0;
    public final u70 c;
    public float c0;
    public final int d;
    public final c2 d0;
    public Object e;
    public final org.telegram.ui.ActionBar.b6 f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public int x;
    public StaticLayout y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public e2(Context context) {
        this(context, null, false);
    }

    private int getIconForCurrentState() {
        int i9 = this.K;
        RadialProgress2 radialProgress2 = this.R;
        if (i9 != 3 && i9 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.f6.le, org.telegram.ui.ActionBar.f6.me, org.telegram.ui.ActionBar.f6.ne, org.telegram.ui.ActionBar.f6.oe);
            return this.Q == 1 ? 10 : 4;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.f6.ie, org.telegram.ui.ActionBar.f6.je, org.telegram.ui.ActionBar.f6.uc, org.telegram.ui.ActionBar.f6.vc);
        int i10 = this.Q;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 4 ? 3 : 0;
    }

    public final void a() {
        int i9 = this.K;
        if (i9 == 3 || i9 == 5) {
            int i10 = this.Q;
            RadialProgress2 radialProgress2 = this.R;
            if (i10 == 0) {
                if (MediaController.getInstance().playMessage(this.M)) {
                    this.Q = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.M)) {
                    this.Q = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            int i11 = this.d;
            if (i10 == 2) {
                radialProgress2.o(0.0f, false);
                if (this.G != null) {
                    FileLoader.getInstance(i11).loadFile(this.G, this.E, 1, 0);
                } else if (this.E.content instanceof TLRPC.TL_webDocument) {
                    FileLoader.getInstance(i11).loadFile(WebFile.createWithWebDocument(this.E.content), 3, 1);
                }
                this.Q = 4;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            if (i10 == 4) {
                if (this.G != null) {
                    FileLoader.getInstance(i11).cancelLoadFile(this.G);
                } else if (this.E.content instanceof TLRPC.TL_webDocument) {
                    FileLoader.getInstance(i11).cancelLoadFile(WebFile.createWithWebDocument(this.E.content));
                }
                this.Q = 2;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        }
    }

    public final void b() {
        this.M = null;
        this.K = 0;
        TLRPC.Document document = this.G;
        if (document == null) {
            TLRPC.BotInlineResult botInlineResult = this.E;
            if (botInlineResult != null) {
                if (botInlineResult.photo != null) {
                    this.K = 7;
                } else if (botInlineResult.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                    this.K = 5;
                } else if (this.E.type.equals("voice")) {
                    this.K = 3;
                }
            }
        } else if (MessageObject.isGifDocument(document)) {
            this.K = 2;
        } else if (MessageObject.isStickerDocument(this.G) || MessageObject.isAnimatedStickerDocument(this.G, true)) {
            this.K = 6;
        } else if (MessageObject.isMusicDocument(this.G)) {
            this.K = 5;
        } else if (MessageObject.isVoiceDocument(this.G)) {
            this.K = 3;
        }
        int i9 = this.K;
        if (i9 == 3 || i9 == 5) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = -Utilities.random.nextInt();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i10 = this.d;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
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
            TLRPC.Document document2 = this.G;
            if (document2 != null) {
                messageMedia.document = document2;
                tL_message.attachPath = "";
            } else {
                String httpUrlExtension = ImageLoader.getHttpUrlExtension(this.E.content.url, this.K == 5 ? "mp3" : "ogg");
                TLRPC.Document document3 = tL_message.media.document;
                document3.id = 0L;
                document3.access_hash = 0L;
                document3.date = tL_message.date;
                document3.mime_type = ta.b.d("audio/", httpUrlExtension);
                TLRPC.Document document4 = tL_message.media.document;
                document4.size = 0L;
                document4.dc_id = 0;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.duration = MessageObject.getInlineResultDuration(this.E);
                TLRPC.BotInlineResult botInlineResult2 = this.E;
                String str = botInlineResult2.title;
                if (str == null) {
                    str = "";
                }
                tL_documentAttributeAudio.title = str;
                String str2 = botInlineResult2.description;
                tL_documentAttributeAudio.performer = str2 != null ? str2 : "";
                tL_documentAttributeAudio.flags |= 3;
                if (this.K == 3) {
                    tL_documentAttributeAudio.voice = true;
                }
                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Utilities.MD5(this.E.content.url));
                sb2.append(".");
                sb2.append(ImageLoader.getHttpUrlExtension(this.E.content.url, this.K == 5 ? "mp3" : "ogg"));
                tL_documentAttributeFilename.file_name = sb2.toString();
                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                File directory = FileLoader.getDirectory(4);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Utilities.MD5(this.E.content.url));
                sb3.append(".");
                sb3.append(ImageLoader.getHttpUrlExtension(this.E.content.url, this.K == 5 ? "mp3" : "ogg"));
                tL_message.attachPath = new File(directory, sb3.toString()).getAbsolutePath();
            }
            this.M = new MessageObject(i10, tL_message, false, true);
        }
    }

    public final void c(boolean z10, boolean z11) {
        dp dpVar = this.T;
        if (dpVar == null) {
            return;
        }
        if (dpVar.getVisibility() != 0) {
            dpVar.setVisibility(0);
        }
        dpVar.a(z10, z11);
        AnimatorSet animatorSet = this.N;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N = null;
        }
        if (!z11) {
            this.c0 = z10 ? 0.85f : 1.0f;
            invalidate();
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.N = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.d0, z10 ? 0.81f : 1.0f));
        this.N.setDuration(200L);
        this.N.addListener(new hg.b0(22, this, z10));
        this.N.start();
    }

    public final void d(int i9, TLRPC.Document document, Object obj) {
        this.h = false;
        this.r = false;
        this.H = i9;
        this.E = null;
        this.e = obj;
        this.G = document;
        this.I = null;
        this.L = true;
        this.w = true;
        b();
        this.K = 2;
        requestLayout();
        this.a0 = null;
        this.b0 = false;
        this.W = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.h = z11;
        this.r = z12;
        this.F = user;
        this.E = botInlineResult;
        this.e = botInlineResult;
        if (botInlineResult != null) {
            this.G = botInlineResult.document;
            this.I = botInlineResult.photo;
        } else {
            this.G = null;
            this.I = null;
        }
        this.L = z10;
        this.w = z13;
        b();
        if (z13) {
            this.K = 2;
        }
        requestLayout();
        this.a0 = null;
        this.b0 = false;
        this.W = false;
        f(false, false);
    }

    public final void f(boolean z10, boolean z11) {
        String str = this.a0;
        if (str == null && !this.W) {
            this.W = true;
            Utilities.searchQueue.postRunnable(new b2(this, z10));
            this.R.setIcon(4, z10, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.Q = -1;
            this.R.setIcon(4, z10, false);
            return;
        }
        boolean isLoadingFile = this.G != null ? FileLoader.getInstance(this.d).isLoadingFile(this.a0) : ImageLoader.getInstance().isLoadingHttpFile(this.a0);
        if (isLoadingFile || !this.b0) {
            DownloadController.getInstance(this.d).addLoadingFileObserver(this.a0, this);
            int i9 = this.K;
            if (i9 != 5 && i9 != 3) {
                this.Q = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(this.a0);
                this.R.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            } else if (isLoadingFile) {
                this.Q = 4;
                Float fileProgress2 = ImageLoader.getInstance().getFileProgress(this.a0);
                if (fileProgress2 != null) {
                    this.R.o(fileProgress2.floatValue(), z11);
                } else {
                    this.R.o(0.0f, z11);
                }
            } else {
                this.Q = 2;
            }
        } else {
            DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
            int i10 = this.K;
            if (i10 == 5 || i10 == 3) {
                boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.M);
                if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.Q = 0;
                } else {
                    this.Q = 1;
                }
                this.R.o(1.0f, z11);
            } else {
                this.Q = -1;
            }
        }
        this.R.setIcon(getIconForCurrentState(), z10, z11);
        invalidate();
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.E;
    }

    public int getDate() {
        return this.H;
    }

    public TLRPC.Document getDocument() {
        return this.G;
    }

    public TLRPC.User getInlineBot() {
        return this.F;
    }

    public MessageObject getMessageObject() {
        return this.M;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.P;
    }

    public Object getParentObject() {
        return this.e;
    }

    public ImageReceiver getPhotoImage() {
        return this.a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a.onAttachedToWindow()) {
            f(false, false);
        }
        this.R.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.onDetachedFromWindow();
        this.R.f();
        DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        ImageReceiver imageReceiver = this.a;
        dp dpVar = this.T;
        if (dpVar != null && (dpVar.a.q || !imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f || PhotoViewer.M1((MessageObject) this.e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.O);
        }
        if (this.B != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.A);
            this.B.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.D;
        org.telegram.ui.ActionBar.b6 b6Var = this.f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.f6.g3.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, b6Var));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.C);
            this.D.draw(canvas);
            canvas.restore();
        }
        if (this.y != null) {
            org.telegram.ui.ActionBar.f6.g3.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J6, b6Var));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.x);
            this.y.draw(canvas);
            canvas.restore();
        }
        boolean z10 = this.L;
        RadialProgress2 radialProgress2 = this.R;
        if (z10) {
            TLRPC.BotInlineResult botInlineResult = this.E;
            if (botInlineResult != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.f6.o4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.f6.o4.getIntrinsicHeight();
                    int A = (int) e2.c.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int A2 = (int) e2.c.A(imageReceiver.getImageHeight(), intrinsicHeight, 2.0f, imageReceiver.getImageY());
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + imageReceiver.getImageWidth(), imageReceiver.getImageY() + imageReceiver.getImageHeight(), u70.j);
                    org.telegram.ui.ActionBar.f6.o4.setBounds(A, A2, intrinsicWidth + A, intrinsicHeight + A2);
                    org.telegram.ui.ActionBar.f6.o4.draw(canvas);
                }
            }
        } else {
            boolean z11 = this.b;
            u70 u70Var = this.c;
            if (!z11 || PhotoViewer.N1(this.E)) {
                u70Var.setAlpha(255);
            } else {
                u70Var.setAlpha((int) ((1.0f - imageReceiver.getCurrentAlpha()) * 255.0f));
            }
            int i10 = this.K;
            if (i10 == 3 || i10 == 5) {
                radialProgress2.d = org.telegram.ui.ActionBar.f6.v0(this.n ? org.telegram.ui.ActionBar.f6.jd : org.telegram.ui.ActionBar.f6.id, b6Var);
                radialProgress2.draw(canvas);
            } else {
                TLRPC.BotInlineResult botInlineResult2 = this.E;
                if (botInlineResult2 == null || !botInlineResult2.type.equals("file")) {
                    TLRPC.BotInlineResult botInlineResult3 = this.E;
                    if (botInlineResult3 == null || !(botInlineResult3.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND) || this.E.type.equals("voice"))) {
                        TLRPC.BotInlineResult botInlineResult4 = this.E;
                        if (botInlineResult4 == null || !(botInlineResult4.type.equals("venue") || this.E.type.equals("geo"))) {
                            u70Var.draw(canvas);
                        } else {
                            int intrinsicWidth2 = org.telegram.ui.ActionBar.f6.o4.getIntrinsicWidth();
                            int intrinsicHeight2 = org.telegram.ui.ActionBar.f6.o4.getIntrinsicHeight();
                            int imageX = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth2) / 2));
                            int imageY = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight2) / 2));
                            canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), u70.j);
                            org.telegram.ui.ActionBar.f6.o4.setBounds(imageX, imageY, intrinsicWidth2 + imageX, intrinsicHeight2 + imageY);
                            org.telegram.ui.ActionBar.f6.o4.draw(canvas);
                        }
                    } else {
                        int intrinsicWidth3 = org.telegram.ui.ActionBar.f6.n4.getIntrinsicWidth();
                        int intrinsicHeight3 = org.telegram.ui.ActionBar.f6.n4.getIntrinsicHeight();
                        int imageX2 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth3) / 2));
                        int imageY2 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight3) / 2));
                        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), u70.j);
                        org.telegram.ui.ActionBar.f6.n4.setBounds(imageX2, imageY2, intrinsicWidth3 + imageX2, intrinsicHeight3 + imageY2);
                        org.telegram.ui.ActionBar.f6.n4.draw(canvas);
                    }
                } else {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.f6.m4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.f6.m4.getIntrinsicHeight();
                    int imageX3 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth4) / 2));
                    int imageY3 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight4) / 2));
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), u70.j);
                    org.telegram.ui.ActionBar.f6.m4.setBounds(imageX3, imageY3, intrinsicWidth4 + imageX3, intrinsicHeight4 + imageY3);
                    org.telegram.ui.ActionBar.f6.m4.draw(canvas);
                }
            }
        }
        if (this.b) {
            if (this.E != null) {
                imageReceiver.setVisible(!PhotoViewer.N1(r1), false);
            }
            canvas.save();
            float f10 = this.c0;
            pc pcVar = this.V;
            if (pcVar != null) {
                f10 *= pcVar.a(0.1f);
            }
            canvas.scale(f10, f10, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        if (this.L && ((i9 = this.K) == 7 || i9 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.h && !this.L) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
            }
        }
        if (this.r) {
            org.telegram.ui.ActionBar.f6.p4.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(3.0f));
            org.telegram.ui.ActionBar.f6.p4.draw(canvas);
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
        switch (this.K) {
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
        StaticLayout staticLayout = this.B;
        boolean z10 = (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) ? false : true;
        StaticLayout staticLayout2 = this.D;
        boolean z11 = (staticLayout2 == null || TextUtils.isEmpty(staticLayout2.getText())) ? false : true;
        if (this.K == 5 && z10 && z11) {
            sb2.append(", ");
            sb2.append(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.D.getText(), this.B.getText()));
        } else {
            if (z10) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.B.getText());
            }
            if (z11) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.D.getText());
            }
        }
        accessibilityNodeInfo.setText(sb2);
        dp dpVar = this.T;
        if (dpVar != null && dpVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i9 = this.K;
        if (i9 == 3 || i9 == 5) {
            int iconForCurrentState = getIconForCurrentState();
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? LocaleController.getString("AccActionPlay", R.string.AccActionPlay) : LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload) : LocaleController.getString("AccActionDownload", R.string.AccActionDownload) : LocaleController.getString("AccActionPause", R.string.AccActionPause)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0312 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x059d  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        u70 u70Var;
        u70 u70Var2;
        ?? r42;
        float f10;
        float f11;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        String str;
        TLRPC.BotInlineResult botInlineResult;
        WebFile webFile;
        String str2;
        int i11;
        int i12;
        TLRPC.PhotoSize photoSize;
        TLRPC.Document document2;
        ImageReceiver imageReceiver;
        String str3;
        String str4;
        TLRPC.TL_photoStrippedSize strippedPhotoSize;
        ImageLocation imageLocation;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        ImageLocation forPhoto;
        String c10;
        String concat;
        ImageReceiver imageReceiver4;
        boolean z11;
        float f12;
        int dp;
        dp dpVar;
        TLRPC.TL_webDocument tL_webDocument;
        TLRPC.BotInlineMessage botInlineMessage;
        String str5;
        TLRPC.BotInlineResult botInlineResult2;
        String str6;
        boolean z12;
        char c11;
        char c12;
        boolean z13;
        CharSequence ellipsize;
        int i13 = 0;
        this.b = false;
        this.D = null;
        this.B = null;
        this.y = null;
        this.J = null;
        this.x = AndroidUtilities.dp(27.0f);
        if (this.E == null && this.G == null) {
            setMeasuredDimension(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i9);
        int dp2 = (size - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(8.0f);
        if (this.G != null) {
            arrayList2 = new ArrayList(this.G.thumbs);
        } else {
            TLRPC.BotInlineResult botInlineResult3 = this.E;
            if (botInlineResult3 == null || botInlineResult3.photo == null) {
                arrayList = null;
                z10 = this.L;
                u70Var = this.c;
                if (!z10 || (botInlineResult2 = this.E) == null) {
                    u70Var2 = u70Var;
                    r42 = 1;
                    f10 = 1.0f;
                    f11 = 100.0f;
                } else {
                    if (botInlineResult2.title != null) {
                        try {
                            f11 = 100.0f;
                        } catch (Exception e10) {
                            e = e10;
                            f11 = 100.0f;
                        }
                        try {
                            this.B = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(this.E.title.replace('\n', ' '), org.telegram.ui.ActionBar.f6.f3.getFontMetricsInt(), false), org.telegram.ui.ActionBar.f6.f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.f6.f3.measureText(r0)), dp2), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.f6.f3, dp2 + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } catch (Exception e11) {
                            e = e11;
                            FileLog.e(e);
                            u70Var.a(this.E.title);
                            str6 = this.E.description;
                            if (str6 == null) {
                            }
                            if (this.E.url != null) {
                            }
                            document = this.G;
                            if (document != null) {
                            }
                        }
                        u70Var.a(this.E.title);
                    } else {
                        f11 = 100.0f;
                    }
                    str6 = this.E.description;
                    if (str6 == null) {
                        try {
                            z12 = true;
                            z13 = true;
                            z13 = true;
                            c11 = '\n';
                            c12 = ' ';
                        } catch (Exception e12) {
                            e = e12;
                            z12 = true;
                            c11 = '\n';
                            c12 = ' ';
                        }
                        try {
                            StaticLayout u22 = t1.u2(Emoji.replaceEmoji(str6, org.telegram.ui.ActionBar.f6.g3.getFontMetricsInt(), false), org.telegram.ui.ActionBar.f6.g3, dp2, dp2, 0, 3);
                            this.D = u22;
                            if (u22.getLineCount() > 0) {
                                int i14 = this.C;
                                StaticLayout staticLayout = this.D;
                                this.x = i14 + staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + AndroidUtilities.dp(1.0f);
                            }
                        } catch (Exception e13) {
                            e = e13;
                            FileLog.e(e);
                            z13 = z12;
                            if (this.E.url != null) {
                            }
                            document = this.G;
                            if (document != null) {
                            }
                        }
                    } else {
                        z13 = true;
                        c11 = '\n';
                        c12 = ' ';
                    }
                    if (this.E.url != null) {
                        try {
                            ellipsize = TextUtils.ellipsize(this.E.url.replace(c11, c12), org.telegram.ui.ActionBar.f6.g3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.f6.g3.measureText(r0)), dp2), TextUtils.TruncateAt.MIDDLE);
                            u70Var2 = u70Var;
                            f10 = 1.0f;
                        } catch (Exception e14) {
                            e = e14;
                            u70Var2 = u70Var;
                            f10 = 1.0f;
                        }
                        try {
                            this.y = new StaticLayout(ellipsize, org.telegram.ui.ActionBar.f6.g3, dp2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            r42 = z13;
                        } catch (Exception e15) {
                            e = e15;
                            FileLog.e(e);
                            r42 = z13;
                            document = this.G;
                            if (document != null) {
                            }
                        }
                    } else {
                        u70Var2 = u70Var;
                        f10 = 1.0f;
                        r42 = z13;
                    }
                }
                document = this.G;
                if (document != null) {
                    if (this.w || MessageObject.isGifDocument(document)) {
                        this.J = FileLoader.getClosestPhotoSizeWithSize(this.G.thumbs, 90, false, null, r42);
                    } else {
                        if (MessageObject.isStickerDocument(this.G) || MessageObject.isAnimatedStickerDocument(this.G, r42)) {
                            this.J = FileLoader.getClosestPhotoSizeWithSize(this.G.thumbs, 90, false, null, r42);
                            str = "webp";
                            closestPhotoSizeWithSize = null;
                            botInlineResult = this.E;
                            if (botInlineResult == null) {
                                if ((botInlineResult.content instanceof TLRPC.TL_webDocument) && (str5 = botInlineResult.type) != null) {
                                    if (str5.startsWith("gif")) {
                                        TLRPC.WebDocument webDocument = this.E.thumb;
                                        tL_webDocument = ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) ? (TLRPC.TL_webDocument) this.E.thumb : (TLRPC.TL_webDocument) this.E.content;
                                        this.K = 2;
                                    } else if (this.E.type.equals("photo")) {
                                        TLRPC.BotInlineResult botInlineResult4 = this.E;
                                        TLRPC.WebDocument webDocument2 = botInlineResult4.thumb;
                                        tL_webDocument = webDocument2 instanceof TLRPC.TL_webDocument ? (TLRPC.TL_webDocument) webDocument2 : (TLRPC.TL_webDocument) botInlineResult4.content;
                                    }
                                    if (tL_webDocument == null) {
                                        TLRPC.WebDocument webDocument3 = this.E.thumb;
                                        if (webDocument3 instanceof TLRPC.TL_webDocument) {
                                            tL_webDocument = (TLRPC.TL_webDocument) webDocument3;
                                        }
                                    }
                                    if (tL_webDocument == null && this.J == null && closestPhotoSizeWithSize == null) {
                                        botInlineMessage = this.E.send_message;
                                        if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo)) {
                                            TLRPC.GeoPoint geoPoint = botInlineMessage.geo;
                                            double d = geoPoint.lat;
                                            double d9 = geoPoint._long;
                                            if (MessagesController.getInstance(this.d).mapProvider != 2) {
                                                webFile = WebFile.createWithGeoPoint(this.E.send_message.geo, 72, 72, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)));
                                                str2 = null;
                                            } else {
                                                str2 = AndroidUtilities.formapMapUrl(this.d, d, d9, 72, 72, true, 15, -1);
                                                webFile = null;
                                            }
                                            if (tL_webDocument != null) {
                                                webFile = WebFile.createWithWebDocument(tL_webDocument);
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
                                    botInlineMessage = this.E.send_message;
                                    if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                                    }
                                    TLRPC.GeoPoint geoPoint2 = botInlineMessage.geo;
                                    double d10 = geoPoint2.lat;
                                    double d92 = geoPoint2._long;
                                    if (MessagesController.getInstance(this.d).mapProvider != 2) {
                                    }
                                    if (tL_webDocument != null) {
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
                            if (this.G != null) {
                                for (int i15 = 0; i15 < this.G.attributes.size(); i15++) {
                                    TLRPC.DocumentAttribute documentAttribute = this.G.attributes.get(i15);
                                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                        i11 = documentAttribute.w;
                                        i12 = documentAttribute.h;
                                        break;
                                    }
                                }
                            }
                            i11 = 0;
                            i12 = 0;
                            if (i11 != 0 || i12 == 0) {
                                photoSize = this.J;
                                if (photoSize == null) {
                                    if (closestPhotoSizeWithSize != null) {
                                        closestPhotoSizeWithSize.size = -1;
                                    }
                                    i11 = photoSize.w;
                                    i12 = photoSize.h;
                                } else {
                                    TLRPC.BotInlineResult botInlineResult5 = this.E;
                                    if (botInlineResult5 != null) {
                                        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult5);
                                        int i16 = inlineResultWidthAndHeight[0];
                                        i12 = inlineResultWidthAndHeight[r42];
                                        i11 = i16;
                                    }
                                }
                            }
                            if (i11 != 0 || i12 == 0) {
                                i11 = AndroidUtilities.dp(80.0f);
                                i12 = i11;
                            }
                            document2 = this.G;
                            imageReceiver = this.a;
                            if (document2 != null && this.J == null && webFile == null && str2 == null) {
                                imageReceiver4 = imageReceiver;
                            } else {
                                if (this.L) {
                                    str3 = "52_52_b";
                                    str4 = "52_52";
                                } else {
                                    int min = Math.min(i11, i12) / 3;
                                    if (this.K == 2) {
                                        Locale locale = Locale.US;
                                        String c13 = ta.b.c((int) (min / AndroidUtilities.density), "_80_b");
                                        if (SharedConfig.isAutoplayGifs() || this.v) {
                                            str4 = c13;
                                            str3 = str4;
                                        } else {
                                            concat = c13.concat("_firstframe");
                                            c10 = c13.concat("_firstframe");
                                        }
                                    } else {
                                        Locale locale2 = Locale.US;
                                        c10 = ta.b.c((int) (min / AndroidUtilities.density), "_80");
                                        concat = c10.concat("_b");
                                    }
                                    str4 = c10;
                                    str3 = concat;
                                }
                                imageReceiver.setAspectFit(this.K != 6);
                                strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                                if (strippedPhotoSize != null) {
                                    TLRPC.Document document3 = this.G;
                                    if (document3 != null) {
                                        forPhoto = ImageLocation.getForDocument(strippedPhotoSize, document3);
                                    } else {
                                        TLRPC.Photo photo = this.I;
                                        if (photo != null) {
                                            forPhoto = ImageLocation.getForPhoto(strippedPhotoSize, photo);
                                        }
                                    }
                                    imageLocation = forPhoto;
                                    if (this.K == 2) {
                                        TLRPC.Document document4 = this.G;
                                        if (document4 != null) {
                                            TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(document4);
                                            if (documentVideoThumb != null) {
                                                ImageLocation forDocument = ImageLocation.getForDocument(documentVideoThumb, this.G);
                                                StringBuilder sb2 = new StringBuilder("100_100");
                                                sb2.append((SharedConfig.isAutoplayGifs() || this.v) ? "" : "_firstframe");
                                                imageReceiver2 = imageReceiver;
                                                imageReceiver2.setImage(forDocument, sb2.toString(), ImageLocation.getForDocument(this.J, this.G), str4, imageLocation, str3, null, -1L, str, this.e, 1);
                                            } else {
                                                imageReceiver2 = imageReceiver;
                                                ImageLocation forDocument2 = ImageLocation.getForDocument(this.G);
                                                if (this.w) {
                                                    forDocument2.imageType = 2;
                                                }
                                                StringBuilder sb3 = new StringBuilder("100_100");
                                                sb3.append((SharedConfig.isAutoplayGifs() || this.v) ? "" : "_firstframe");
                                                imageReceiver2.setImage(forDocument2, sb3.toString(), ImageLocation.getForDocument(this.J, this.G), str4, imageLocation, str3, null, this.G.size, str, this.e, 0);
                                            }
                                        } else {
                                            imageReceiver2 = imageReceiver;
                                            if (webFile != null) {
                                                imageReceiver2.setImage(ImageLocation.getForWebFile(webFile), "100_100", ImageLocation.getForPhoto(this.J, this.I), str4, imageLocation, str3, null, -1L, str, this.e, 1);
                                            } else {
                                                imageReceiver2.setImage(ImageLocation.getForPath(str2), "100_100", ImageLocation.getForPhoto(this.J, this.I), str4, imageLocation, str3, null, -1L, str, this.e, 1);
                                            }
                                        }
                                    } else {
                                        imageReceiver2 = imageReceiver;
                                        if (this.J != null) {
                                            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(this.G, org.telegram.ui.ActionBar.f6.a7, f10);
                                            if (!MessageObject.canAutoplayAnimatedSticker(this.G)) {
                                                TLRPC.Document document5 = this.G;
                                                if (document5 == null) {
                                                    imageReceiver2.setImage(ImageLocation.getForPhoto(this.J, this.I), str4, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str3, imageLocation, str3, null, this.J.size, str, this.e, 0);
                                                } else if (svgThumb != null) {
                                                    imageReceiver2.setImage(ImageLocation.getForDocument(this.J, document5), str4, null, null, imageLocation, str3, svgThumb, this.J.size, str, this.e, 0);
                                                } else {
                                                    imageReceiver2.setImage(ImageLocation.getForDocument(this.J, document5), str4, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str3, imageLocation, str3, null, this.J.size, str, this.e, 0);
                                                }
                                            } else if (svgThumb != null) {
                                                imageReceiver2.setImage(ImageLocation.getForDocument(this.G), "80_80", null, null, imageLocation, str3, svgThumb, this.J.size, str, this.e, 0);
                                            } else {
                                                imageReceiver2.setImage(ImageLocation.getForDocument(this.G), "80_80", ImageLocation.getForDocument(this.J, this.G), str3, imageLocation, str3, null, this.J.size, str, this.e, 0);
                                            }
                                        } else if (webFile != null) {
                                            imageReceiver2.setImage(ImageLocation.getForWebFile(webFile), str4, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str3, imageLocation, str3, null, -1L, str, this.e, 1);
                                        } else {
                                            imageReceiver2.setImage(ImageLocation.getForPath(str2), str4, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str3, imageLocation, str3, null, -1L, str, this.e, 1);
                                        }
                                    }
                                    imageReceiver3 = imageReceiver2;
                                    if (!SharedConfig.isAutoplayGifs() || this.v) {
                                        imageReceiver3.setAllowStartAnimation(r42);
                                        imageReceiver3.startAnimation();
                                    } else {
                                        imageReceiver3.setAllowStartAnimation(false);
                                        imageReceiver3.stopAnimation();
                                    }
                                    this.b = r42;
                                    imageReceiver4 = imageReceiver3;
                                }
                                imageLocation = null;
                                if (this.K == 2) {
                                }
                                imageReceiver3 = imageReceiver2;
                                if (SharedConfig.isAutoplayGifs()) {
                                }
                                imageReceiver3.setAllowStartAnimation(r42);
                                imageReceiver3.startAnimation();
                                this.b = r42;
                                imageReceiver4 = imageReceiver3;
                            }
                            z11 = this.L;
                            RadialProgress2 radialProgress2 = this.R;
                            if (z11) {
                                StaticLayout staticLayout2 = this.B;
                                if (staticLayout2 != null && staticLayout2.getLineCount() != 0) {
                                    StaticLayout staticLayout3 = this.B;
                                    i13 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - r42);
                                }
                                StaticLayout staticLayout4 = this.D;
                                if (staticLayout4 != null && staticLayout4.getLineCount() != 0) {
                                    StaticLayout staticLayout5 = this.D;
                                    i13 += staticLayout5.getLineBottom(staticLayout5.getLineCount() - r42);
                                }
                                StaticLayout staticLayout6 = this.y;
                                if (staticLayout6 != null && staticLayout6.getLineCount() > 0) {
                                    StaticLayout staticLayout7 = this.y;
                                    i13 += staticLayout7.getLineBottom(staticLayout7.getLineCount() - r42);
                                }
                                setMeasuredDimension(View.MeasureSpec.getSize(i9), org.telegram.messenger.l0.z(16.0f, Math.max(AndroidUtilities.dp(52.0f), i13), AndroidUtilities.dp(68.0f)) + (this.h ? 1 : 0));
                                int dp3 = AndroidUtilities.dp(52.0f);
                                if (LocaleController.isRTL) {
                                    f12 = 8.0f;
                                    dp = org.telegram.messenger.l0.B(8.0f, View.MeasureSpec.getSize(i9), dp3);
                                } else {
                                    f12 = 8.0f;
                                    dp = AndroidUtilities.dp(8.0f);
                                }
                                u70Var2.setBounds(dp, AndroidUtilities.dp(f12), dp + dp3, AndroidUtilities.dp(60.0f));
                                float f13 = dp3;
                                imageReceiver4.setImageCoords(dp, AndroidUtilities.dp(f12), f13, f13);
                                int i17 = this.K;
                                if (i17 == 3 || i17 == 5) {
                                    radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
                                    radialProgress2.q(AndroidUtilities.dp(4.0f) + dp, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(48.0f) + dp, AndroidUtilities.dp(56.0f));
                                }
                            } else {
                                int size2 = View.MeasureSpec.getSize(i10);
                                if (size2 == 0) {
                                    size2 = AndroidUtilities.dp(f11);
                                }
                                setMeasuredDimension(size, size2);
                                int y10 = ll.y(24.0f, size, 2);
                                int y11 = ll.y(24.0f, size2, 2);
                                radialProgress2.q(y10, y11, AndroidUtilities.dp(24.0f) + y10, AndroidUtilities.dp(24.0f) + y11);
                                radialProgress2.setCircleRadius(AndroidUtilities.dp(12.0f));
                                imageReceiver4.setImageCoords(0.0f, 0.0f, size, size2);
                            }
                            dpVar = this.T;
                            if (dpVar == null) {
                                measureChildWithMargins(dpVar, i9, 0, i10, 0);
                                return;
                            }
                            return;
                        }
                        int i18 = this.K;
                        if (i18 != 5 && i18 != 3) {
                            this.J = FileLoader.getClosestPhotoSizeWithSize(this.G.thumbs, 90, false, null, r42);
                        }
                    }
                    closestPhotoSizeWithSize = null;
                    str = null;
                    botInlineResult = this.E;
                    if (botInlineResult == null) {
                    }
                    if (this.G != null) {
                    }
                    i11 = 0;
                    i12 = 0;
                    if (i11 != 0) {
                    }
                    photoSize = this.J;
                    if (photoSize == null) {
                    }
                    if (i11 != 0) {
                    }
                    i11 = AndroidUtilities.dp(80.0f);
                    i12 = i11;
                    document2 = this.G;
                    imageReceiver = this.a;
                    if (document2 != null) {
                    }
                    if (this.L) {
                    }
                    imageReceiver.setAspectFit(this.K != 6);
                    strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                    if (strippedPhotoSize != null) {
                    }
                    imageLocation = null;
                    if (this.K == 2) {
                    }
                    imageReceiver3 = imageReceiver2;
                    if (SharedConfig.isAutoplayGifs()) {
                    }
                    imageReceiver3.setAllowStartAnimation(r42);
                    imageReceiver3.startAnimation();
                    this.b = r42;
                    imageReceiver4 = imageReceiver3;
                    z11 = this.L;
                    RadialProgress2 radialProgress22 = this.R;
                    if (z11) {
                    }
                    dpVar = this.T;
                    if (dpVar == null) {
                    }
                } else {
                    TLRPC.BotInlineResult botInlineResult6 = this.E;
                    if (botInlineResult6 != null && botInlineResult6.photo != null) {
                        this.J = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), r42, null, r42);
                        closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 80, false, null, r42);
                        if (closestPhotoSizeWithSize != this.J) {
                            str = null;
                            botInlineResult = this.E;
                            if (botInlineResult == null) {
                            }
                            if (this.G != null) {
                            }
                            i11 = 0;
                            i12 = 0;
                            if (i11 != 0) {
                            }
                            photoSize = this.J;
                            if (photoSize == null) {
                            }
                            if (i11 != 0) {
                            }
                            i11 = AndroidUtilities.dp(80.0f);
                            i12 = i11;
                            document2 = this.G;
                            imageReceiver = this.a;
                            if (document2 != null) {
                            }
                            if (this.L) {
                            }
                            imageReceiver.setAspectFit(this.K != 6);
                            strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                            if (strippedPhotoSize != null) {
                            }
                            imageLocation = null;
                            if (this.K == 2) {
                            }
                            imageReceiver3 = imageReceiver2;
                            if (SharedConfig.isAutoplayGifs()) {
                            }
                            imageReceiver3.setAllowStartAnimation(r42);
                            imageReceiver3.startAnimation();
                            this.b = r42;
                            imageReceiver4 = imageReceiver3;
                            z11 = this.L;
                            RadialProgress2 radialProgress222 = this.R;
                            if (z11) {
                            }
                            dpVar = this.T;
                            if (dpVar == null) {
                            }
                        }
                    }
                    closestPhotoSizeWithSize = null;
                    str = null;
                    botInlineResult = this.E;
                    if (botInlineResult == null) {
                    }
                    if (this.G != null) {
                    }
                    i11 = 0;
                    i12 = 0;
                    if (i11 != 0) {
                    }
                    photoSize = this.J;
                    if (photoSize == null) {
                    }
                    if (i11 != 0) {
                    }
                    i11 = AndroidUtilities.dp(80.0f);
                    i12 = i11;
                    document2 = this.G;
                    imageReceiver = this.a;
                    if (document2 != null) {
                    }
                    if (this.L) {
                    }
                    imageReceiver.setAspectFit(this.K != 6);
                    strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                    if (strippedPhotoSize != null) {
                    }
                    imageLocation = null;
                    if (this.K == 2) {
                    }
                    imageReceiver3 = imageReceiver2;
                    if (SharedConfig.isAutoplayGifs()) {
                    }
                    imageReceiver3.setAllowStartAnimation(r42);
                    imageReceiver3.startAnimation();
                    this.b = r42;
                    imageReceiver4 = imageReceiver3;
                    z11 = this.L;
                    RadialProgress2 radialProgress2222 = this.R;
                    if (z11) {
                    }
                    dpVar = this.T;
                    if (dpVar == null) {
                    }
                }
            } else {
                arrayList2 = new ArrayList(this.E.photo.sizes);
            }
        }
        arrayList = arrayList2;
        z10 = this.L;
        u70Var = this.c;
        if (z10) {
        }
        u70Var2 = u70Var;
        r42 = 1;
        f10 = 1.0f;
        f11 = 100.0f;
        document = this.G;
        if (document != null) {
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.R.o(Math.min(1.0f, j10 / j11), true);
        int i9 = this.K;
        if (i9 == 3 || i9 == 5) {
            if (this.Q != 4) {
                f(false, true);
            }
        } else if (this.Q != 1) {
            f(false, true);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.b0 = true;
        this.R.o(1.0f, true);
        f(false, true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (this.L || this.U == null || this.E == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        AndroidUtilities.dp(48.0f);
        int i9 = this.K;
        u70 u70Var = this.c;
        boolean z10 = true;
        if (i9 == 3 || i9 == 5) {
            boolean contains = u70Var.getBounds().contains(x10, y10);
            int action = motionEvent.getAction();
            RadialProgress2 radialProgress2 = this.R;
            if (action == 0) {
                if (contains) {
                    this.n = true;
                    radialProgress2.n(true, false);
                    invalidate();
                }
            } else if (this.n) {
                if (motionEvent.getAction() == 1) {
                    this.n = false;
                    playSoundEffect(0);
                    a();
                    invalidate();
                } else if (motionEvent.getAction() == 3) {
                    this.n = false;
                    invalidate();
                } else if (motionEvent.getAction() == 2 && !contains) {
                    this.n = false;
                    invalidate();
                }
                radialProgress2.n(this.n, false);
            }
            z10 = false;
        } else {
            TLRPC.BotInlineResult botInlineResult = this.E;
            if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                if (motionEvent.getAction() == 0) {
                    if (u70Var.getBounds().contains(x10, y10)) {
                        this.n = true;
                    }
                } else if (this.n) {
                    if (motionEvent.getAction() == 1) {
                        this.n = false;
                        playSoundEffect(0);
                        ((of.s0) this.U).a.R.b.k(getResult());
                    } else if (motionEvent.getAction() == 3) {
                        this.n = false;
                    } else if (motionEvent.getAction() == 2 && !u70Var.getBounds().contains(x10, y10)) {
                        this.n = false;
                    }
                }
            }
            z10 = false;
        }
        return !z10 ? super.onTouchEvent(motionEvent) : z10;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        int i10;
        if (i9 != 16 || ((i10 = this.K) != 3 && i10 != 5)) {
            return super.performAccessibilityAction(i9, bundle);
        }
        a();
        return true;
    }

    public void setCanPreviewGif(boolean z10) {
        this.s = z10;
    }

    public void setDelegate(d2 d2Var) {
        this.U = d2Var;
    }

    public void setIsKeyboard(boolean z10) {
        this.v = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        pc pcVar = this.V;
        if (pcVar != null) {
            pcVar.c(z10 || this.S);
        }
    }

    public void setScaled(boolean z10) {
        this.S = z10;
        pc pcVar = this.V;
        if (pcVar != null) {
            pcVar.c(isPressed() || this.S);
        }
    }

    public e2(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        int i9 = UserConfig.selectedAccount;
        this.d = i9;
        this.A = AndroidUtilities.dp(7.0f);
        this.C = AndroidUtilities.dp(27.0f);
        this.c0 = 1.0f;
        this.d0 = new c2(0, this);
        this.f = b6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setLayerNum(1);
        imageReceiver.setUseSharedAnimationQueue(true);
        this.c = new u70(0, b6Var);
        this.R = new RadialProgress2(this, null);
        this.P = DownloadController.getInstance(i9).generateObserverTag();
        setFocusable(true);
        if (z10) {
            Paint paint = new Paint();
            this.O = paint;
            int i10 = org.telegram.ui.ActionBar.f6.Lh;
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
            dp dpVar = new dp(context, 21, b6Var);
            this.T = dpVar;
            dpVar.setVisibility(4);
            dpVar.b(-1, i10, org.telegram.ui.ActionBar.f6.k7);
            dpVar.setDrawUnchecked(false);
            dpVar.setDrawBackgroundAsArc(1);
            addView(dpVar, g7.e6.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
