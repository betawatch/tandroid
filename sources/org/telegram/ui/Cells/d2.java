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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.rc;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d2 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public final int B;
    public StaticLayout C;
    public final int D;
    public StaticLayout E;
    public TLRPC.BotInlineResult F;
    public TLRPC.User G;
    public TLRPC.Document H;
    public int I;
    public TLRPC.Photo J;
    public TLRPC.PhotoSize K;
    public int L;
    public boolean M;
    public MessageObject N;
    public AnimatorSet O;
    public final Paint P;
    public final int Q;
    public int R;
    public final RadialProgress2 S;
    public boolean T;
    public final kp U;
    public c2 V;
    public rc W;
    public final ImageReceiver a;
    public boolean a0;
    public boolean b;
    public String b0;
    public final n80 c;
    public boolean c0;
    public final int d;
    public float d0;
    public Object e;
    public final b2 e0;
    public final org.telegram.ui.ActionBar.f6 f;
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

    public d2(Context context) {
        this(context, null, false);
    }

    private int getIconForCurrentState() {
        int i10 = this.L;
        RadialProgress2 radialProgress2 = this.S;
        if (i10 != 3 && i10 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.j6.le, org.telegram.ui.ActionBar.j6.me, org.telegram.ui.ActionBar.j6.ne, org.telegram.ui.ActionBar.j6.oe);
            return this.R == 1 ? 10 : 4;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.j6.ie, org.telegram.ui.ActionBar.j6.je, org.telegram.ui.ActionBar.j6.uc, org.telegram.ui.ActionBar.j6.vc);
        int i11 = this.R;
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 2;
        }
        return i11 == 4 ? 3 : 0;
    }

    public final void a() {
        int i10 = this.L;
        if (i10 == 3 || i10 == 5) {
            int i11 = this.R;
            RadialProgress2 radialProgress2 = this.S;
            if (i11 == 0) {
                if (MediaController.getInstance().playMessage(this.N)) {
                    this.R = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            if (i11 == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.N)) {
                    this.R = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            int i12 = this.d;
            if (i11 == 2) {
                radialProgress2.o(0.0f, false);
                if (this.H != null) {
                    FileLoader.getInstance(i12).loadFile(this.H, this.F, 1, 0);
                } else if (this.F.content instanceof TLRPC.TL_webDocument) {
                    FileLoader.getInstance(i12).loadFile(WebFile.createWithWebDocument(this.F.content), 3, 1);
                }
                this.R = 4;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            if (i11 == 4) {
                if (this.H != null) {
                    FileLoader.getInstance(i12).cancelLoadFile(this.H);
                } else if (this.F.content instanceof TLRPC.TL_webDocument) {
                    FileLoader.getInstance(i12).cancelLoadFile(WebFile.createWithWebDocument(this.F.content));
                }
                this.R = 2;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        }
    }

    public final void b() {
        this.N = null;
        this.L = 0;
        TLRPC.Document document = this.H;
        if (document == null) {
            TLRPC.BotInlineResult botInlineResult = this.F;
            if (botInlineResult != null) {
                if (botInlineResult.photo != null) {
                    this.L = 7;
                } else if (botInlineResult.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                    this.L = 5;
                } else if (this.F.type.equals("voice")) {
                    this.L = 3;
                }
            }
        } else if (MessageObject.isGifDocument(document)) {
            this.L = 2;
        } else if (MessageObject.isStickerDocument(this.H) || MessageObject.isAnimatedStickerDocument(this.H, true)) {
            this.L = 6;
        } else if (MessageObject.isMusicDocument(this.H)) {
            this.L = 5;
        } else if (MessageObject.isVoiceDocument(this.H)) {
            this.L = 3;
        }
        int i10 = this.L;
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
            TLRPC.Document document2 = this.H;
            if (document2 != null) {
                messageMedia.document = document2;
                tL_message.attachPath = "";
            } else {
                String httpUrlExtension = ImageLoader.getHttpUrlExtension(this.F.content.url, this.L == 5 ? "mp3" : "ogg");
                TLRPC.Document document3 = tL_message.media.document;
                document3.id = 0L;
                document3.access_hash = 0L;
                document3.date = tL_message.date;
                document3.mime_type = vh.w2.e("audio/", httpUrlExtension);
                TLRPC.Document document4 = tL_message.media.document;
                document4.size = 0L;
                document4.dc_id = 0;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.duration = MessageObject.getInlineResultDuration(this.F);
                TLRPC.BotInlineResult botInlineResult2 = this.F;
                String str = botInlineResult2.title;
                if (str == null) {
                    str = "";
                }
                tL_documentAttributeAudio.title = str;
                String str2 = botInlineResult2.description;
                tL_documentAttributeAudio.performer = str2 != null ? str2 : "";
                tL_documentAttributeAudio.flags |= 3;
                if (this.L == 3) {
                    tL_documentAttributeAudio.voice = true;
                }
                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                StringBuilder sb = new StringBuilder();
                sb.append(Utilities.MD5(this.F.content.url));
                sb.append(".");
                sb.append(ImageLoader.getHttpUrlExtension(this.F.content.url, this.L == 5 ? "mp3" : "ogg"));
                tL_documentAttributeFilename.file_name = sb.toString();
                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                File directory = FileLoader.getDirectory(4);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Utilities.MD5(this.F.content.url));
                sb2.append(".");
                sb2.append(ImageLoader.getHttpUrlExtension(this.F.content.url, this.L == 5 ? "mp3" : "ogg"));
                tL_message.attachPath = new File(directory, sb2.toString()).getAbsolutePath();
            }
            this.N = new MessageObject(i11, tL_message, false, true);
        }
    }

    public final void c(boolean z4, boolean z10) {
        kp kpVar = this.U;
        if (kpVar == null) {
            return;
        }
        if (kpVar.getVisibility() != 0) {
            kpVar.setVisibility(0);
        }
        kpVar.a(z4, z10);
        AnimatorSet animatorSet = this.O;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O = null;
        }
        if (!z10) {
            this.d0 = z4 ? 0.85f : 1.0f;
            invalidate();
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.e0, z4 ? 0.81f : 1.0f));
        this.O.setDuration(200L);
        this.O.addListener(new dg.w2(14, this, z4));
        this.O.start();
    }

    public final void d(int i10, TLRPC.Document document, Object obj) {
        this.h = false;
        this.r = false;
        this.I = i10;
        this.F = null;
        this.e = obj;
        this.H = document;
        this.J = null;
        this.M = true;
        this.w = true;
        b();
        this.L = 2;
        requestLayout();
        this.b0 = null;
        this.c0 = false;
        this.a0 = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.h = z10;
        this.r = z11;
        this.G = user;
        this.F = botInlineResult;
        this.e = botInlineResult;
        if (botInlineResult != null) {
            this.H = botInlineResult.document;
            this.J = botInlineResult.photo;
        } else {
            this.H = null;
            this.J = null;
        }
        this.M = z4;
        this.w = z12;
        b();
        if (z12) {
            this.L = 2;
        }
        requestLayout();
        this.b0 = null;
        this.c0 = false;
        this.a0 = false;
        f(false, false);
    }

    public final void f(boolean z4, boolean z10) {
        String str = this.b0;
        if (str == null && !this.a0) {
            this.a0 = true;
            Utilities.searchQueue.postRunnable(new a2(this, z4));
            this.S.setIcon(4, z4, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.R = -1;
            this.S.setIcon(4, z4, false);
            return;
        }
        boolean isLoadingFile = this.H != null ? FileLoader.getInstance(this.d).isLoadingFile(this.b0) : ImageLoader.getInstance().isLoadingHttpFile(this.b0);
        if (isLoadingFile || !this.c0) {
            DownloadController.getInstance(this.d).addLoadingFileObserver(this.b0, this);
            int i10 = this.L;
            if (i10 != 5 && i10 != 3) {
                this.R = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(this.b0);
                this.S.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            } else if (isLoadingFile) {
                this.R = 4;
                Float fileProgress2 = ImageLoader.getInstance().getFileProgress(this.b0);
                if (fileProgress2 != null) {
                    this.S.o(fileProgress2.floatValue(), z10);
                } else {
                    this.S.o(0.0f, z10);
                }
            } else {
                this.R = 2;
            }
        } else {
            DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
            int i11 = this.L;
            if (i11 == 5 || i11 == 3) {
                boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.N);
                if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.R = 0;
                } else {
                    this.R = 1;
                }
                this.S.o(1.0f, z10);
            } else {
                this.R = -1;
            }
        }
        this.S.setIcon(getIconForCurrentState(), z4, z10);
        invalidate();
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.F;
    }

    public int getDate() {
        return this.I;
    }

    public TLRPC.Document getDocument() {
        return this.H;
    }

    public TLRPC.User getInlineBot() {
        return this.G;
    }

    public MessageObject getMessageObject() {
        return this.N;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.Q;
    }

    public Object getParentObject() {
        return this.e;
    }

    public ImageReceiver getPhotoImage() {
        return this.a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a.onAttachedToWindow()) {
            f(false, false);
        }
        this.S.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.onDetachedFromWindow();
        this.S.f();
        DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        ImageReceiver imageReceiver = this.a;
        kp kpVar = this.U;
        if (kpVar != null && (kpVar.a.q || !imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f || PhotoViewer.M1((MessageObject) this.e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.P);
        }
        if (this.C != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.B);
            this.C.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.E;
        org.telegram.ui.ActionBar.f6 f6Var = this.f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.j6.g3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.D);
            this.E.draw(canvas);
            canvas.restore();
        }
        if (this.y != null) {
            org.telegram.ui.ActionBar.j6.g3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.x);
            this.y.draw(canvas);
            canvas.restore();
        }
        boolean z4 = this.M;
        RadialProgress2 radialProgress2 = this.S;
        if (z4) {
            TLRPC.BotInlineResult botInlineResult = this.F;
            if (botInlineResult != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.j6.o4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.j6.o4.getIntrinsicHeight();
                    int x10 = (int) e2.c.x(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int x11 = (int) e2.c.x(imageReceiver.getImageHeight(), intrinsicHeight, 2.0f, imageReceiver.getImageY());
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + imageReceiver.getImageWidth(), imageReceiver.getImageY() + imageReceiver.getImageHeight(), n80.j);
                    org.telegram.ui.ActionBar.j6.o4.setBounds(x10, x11, intrinsicWidth + x10, intrinsicHeight + x11);
                    org.telegram.ui.ActionBar.j6.o4.draw(canvas);
                }
            }
        } else {
            boolean z10 = this.b;
            n80 n80Var = this.c;
            if (!z10 || PhotoViewer.N1(this.F)) {
                n80Var.setAlpha(255);
            } else {
                n80Var.setAlpha((int) ((1.0f - imageReceiver.getCurrentAlpha()) * 255.0f));
            }
            int i11 = this.L;
            if (i11 == 3 || i11 == 5) {
                radialProgress2.d = org.telegram.ui.ActionBar.j6.v0(this.n ? org.telegram.ui.ActionBar.j6.jd : org.telegram.ui.ActionBar.j6.id, f6Var);
                radialProgress2.draw(canvas);
            } else {
                TLRPC.BotInlineResult botInlineResult2 = this.F;
                if (botInlineResult2 == null || !botInlineResult2.type.equals("file")) {
                    TLRPC.BotInlineResult botInlineResult3 = this.F;
                    if (botInlineResult3 == null || !(botInlineResult3.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND) || this.F.type.equals("voice"))) {
                        TLRPC.BotInlineResult botInlineResult4 = this.F;
                        if (botInlineResult4 == null || !(botInlineResult4.type.equals("venue") || this.F.type.equals("geo"))) {
                            n80Var.draw(canvas);
                        } else {
                            int intrinsicWidth2 = org.telegram.ui.ActionBar.j6.o4.getIntrinsicWidth();
                            int intrinsicHeight2 = org.telegram.ui.ActionBar.j6.o4.getIntrinsicHeight();
                            int imageX = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth2) / 2));
                            int imageY = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight2) / 2));
                            canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), n80.j);
                            org.telegram.ui.ActionBar.j6.o4.setBounds(imageX, imageY, intrinsicWidth2 + imageX, intrinsicHeight2 + imageY);
                            org.telegram.ui.ActionBar.j6.o4.draw(canvas);
                        }
                    } else {
                        int intrinsicWidth3 = org.telegram.ui.ActionBar.j6.n4.getIntrinsicWidth();
                        int intrinsicHeight3 = org.telegram.ui.ActionBar.j6.n4.getIntrinsicHeight();
                        int imageX2 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth3) / 2));
                        int imageY2 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight3) / 2));
                        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), n80.j);
                        org.telegram.ui.ActionBar.j6.n4.setBounds(imageX2, imageY2, intrinsicWidth3 + imageX2, intrinsicHeight3 + imageY2);
                        org.telegram.ui.ActionBar.j6.n4.draw(canvas);
                    }
                } else {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.j6.m4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.j6.m4.getIntrinsicHeight();
                    int imageX3 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth4) / 2));
                    int imageY3 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight4) / 2));
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), n80.j);
                    org.telegram.ui.ActionBar.j6.m4.setBounds(imageX3, imageY3, intrinsicWidth4 + imageX3, intrinsicHeight4 + imageY3);
                    org.telegram.ui.ActionBar.j6.m4.draw(canvas);
                }
            }
        }
        if (this.b) {
            if (this.F != null) {
                imageReceiver.setVisible(!PhotoViewer.N1(r1), false);
            }
            canvas.save();
            float f10 = this.d0;
            rc rcVar = this.W;
            if (rcVar != null) {
                f10 *= rcVar.a(0.1f);
            }
            canvas.scale(f10, f10, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        if (this.M && ((i10 = this.L) == 7 || i10 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.h && !this.M) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
            }
        }
        if (this.r) {
            org.telegram.ui.ActionBar.j6.p4.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(3.0f));
            org.telegram.ui.ActionBar.j6.p4.draw(canvas);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z4) {
        f(true, z4);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        switch (this.L) {
            case 1:
                sb.append(LocaleController.getString(R.string.AttachDocument));
                break;
            case 2:
                sb.append(LocaleController.getString(R.string.AttachGif));
                break;
            case 3:
                sb.append(LocaleController.getString(R.string.AttachAudio));
                break;
            case 4:
                sb.append(LocaleController.getString(R.string.AttachVideo));
                break;
            case 5:
                sb.append(LocaleController.getString(R.string.AttachMusic));
                break;
            case 6:
                sb.append(LocaleController.getString(R.string.AttachSticker));
                break;
            case 7:
                sb.append(LocaleController.getString(R.string.AttachPhoto));
                break;
        }
        StaticLayout staticLayout = this.C;
        boolean z4 = (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) ? false : true;
        StaticLayout staticLayout2 = this.E;
        boolean z10 = (staticLayout2 == null || TextUtils.isEmpty(staticLayout2.getText())) ? false : true;
        if (this.L == 5 && z4 && z10) {
            sb.append(", ");
            sb.append(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.E.getText(), this.C.getText()));
        } else {
            if (z4) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.C.getText());
            }
            if (z10) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.E.getText());
            }
        }
        accessibilityNodeInfo.setText(sb);
        kp kpVar = this.U;
        if (kpVar != null && kpVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i10 = this.L;
        if (i10 == 3 || i10 == 5) {
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
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z4;
        n80 n80Var;
        n80 n80Var2;
        ?? r42;
        float f10;
        float f11;
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
        String str3;
        String str4;
        TLRPC.TL_photoStrippedSize strippedPhotoSize;
        ImageLocation imageLocation;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        ImageLocation forPhoto;
        String l10;
        String concat;
        ImageReceiver imageReceiver4;
        boolean z10;
        float f12;
        int dp;
        kp kpVar;
        TLRPC.TL_webDocument tL_webDocument;
        TLRPC.BotInlineMessage botInlineMessage;
        String str5;
        TLRPC.BotInlineResult botInlineResult2;
        String str6;
        boolean z11;
        char c3;
        char c10;
        boolean z12;
        CharSequence ellipsize;
        int i14 = 0;
        this.b = false;
        this.E = null;
        this.C = null;
        this.y = null;
        this.K = null;
        this.x = AndroidUtilities.dp(27.0f);
        if (this.F == null && this.H == null) {
            setMeasuredDimension(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int dp2 = (size - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(8.0f);
        if (this.H != null) {
            arrayList2 = new ArrayList(this.H.thumbs);
        } else {
            TLRPC.BotInlineResult botInlineResult3 = this.F;
            if (botInlineResult3 == null || botInlineResult3.photo == null) {
                arrayList = null;
                z4 = this.M;
                n80Var = this.c;
                if (!z4 || (botInlineResult2 = this.F) == null) {
                    n80Var2 = n80Var;
                    r42 = 1;
                    f10 = 1.0f;
                    f11 = 100.0f;
                } else {
                    if (botInlineResult2.title != null) {
                        try {
                            f11 = 100.0f;
                        } catch (Exception e) {
                            e = e;
                            f11 = 100.0f;
                        }
                        try {
                            this.C = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(this.F.title.replace('\n', ' '), org.telegram.ui.ActionBar.j6.f3.getFontMetricsInt(), false), org.telegram.ui.ActionBar.j6.f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.j6.f3.measureText(r0)), dp2), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.f3, dp2 + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } catch (Exception e6) {
                            e = e6;
                            FileLog.e(e);
                            n80Var.a(this.F.title);
                            str6 = this.F.description;
                            if (str6 == null) {
                            }
                            if (this.F.url != null) {
                            }
                            document = this.H;
                            if (document != null) {
                            }
                        }
                        n80Var.a(this.F.title);
                    } else {
                        f11 = 100.0f;
                    }
                    str6 = this.F.description;
                    if (str6 == null) {
                        try {
                            z11 = true;
                            z12 = true;
                            z12 = true;
                            c3 = '\n';
                            c10 = ' ';
                        } catch (Exception e10) {
                            e = e10;
                            z11 = true;
                            c3 = '\n';
                            c10 = ' ';
                        }
                        try {
                            StaticLayout u22 = s1.u2(Emoji.replaceEmoji(str6, org.telegram.ui.ActionBar.j6.g3.getFontMetricsInt(), false), org.telegram.ui.ActionBar.j6.g3, dp2, dp2, 0, 3);
                            this.E = u22;
                            if (u22.getLineCount() > 0) {
                                int i15 = this.D;
                                StaticLayout staticLayout = this.E;
                                this.x = i15 + staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + AndroidUtilities.dp(1.0f);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            FileLog.e(e);
                            z12 = z11;
                            if (this.F.url != null) {
                            }
                            document = this.H;
                            if (document != null) {
                            }
                        }
                    } else {
                        z12 = true;
                        c3 = '\n';
                        c10 = ' ';
                    }
                    if (this.F.url != null) {
                        try {
                            ellipsize = TextUtils.ellipsize(this.F.url.replace(c3, c10), org.telegram.ui.ActionBar.j6.g3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.j6.g3.measureText(r0)), dp2), TextUtils.TruncateAt.MIDDLE);
                            n80Var2 = n80Var;
                            f10 = 1.0f;
                        } catch (Exception e12) {
                            e = e12;
                            n80Var2 = n80Var;
                            f10 = 1.0f;
                        }
                        try {
                            this.y = new StaticLayout(ellipsize, org.telegram.ui.ActionBar.j6.g3, dp2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            r42 = z12;
                        } catch (Exception e13) {
                            e = e13;
                            FileLog.e(e);
                            r42 = z12;
                            document = this.H;
                            if (document != null) {
                            }
                        }
                    } else {
                        n80Var2 = n80Var;
                        f10 = 1.0f;
                        r42 = z12;
                    }
                }
                document = this.H;
                if (document != null) {
                    if (this.w || MessageObject.isGifDocument(document)) {
                        this.K = FileLoader.getClosestPhotoSizeWithSize(this.H.thumbs, 90, false, null, r42);
                    } else {
                        if (MessageObject.isStickerDocument(this.H) || MessageObject.isAnimatedStickerDocument(this.H, r42)) {
                            this.K = FileLoader.getClosestPhotoSizeWithSize(this.H.thumbs, 90, false, null, r42);
                            str = "webp";
                            closestPhotoSizeWithSize = null;
                            botInlineResult = this.F;
                            if (botInlineResult == null) {
                                if ((botInlineResult.content instanceof TLRPC.TL_webDocument) && (str5 = botInlineResult.type) != null) {
                                    if (str5.startsWith("gif")) {
                                        TLRPC.WebDocument webDocument = this.F.thumb;
                                        tL_webDocument = ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) ? (TLRPC.TL_webDocument) this.F.thumb : (TLRPC.TL_webDocument) this.F.content;
                                        this.L = 2;
                                    } else if (this.F.type.equals("photo")) {
                                        TLRPC.BotInlineResult botInlineResult4 = this.F;
                                        TLRPC.WebDocument webDocument2 = botInlineResult4.thumb;
                                        tL_webDocument = webDocument2 instanceof TLRPC.TL_webDocument ? (TLRPC.TL_webDocument) webDocument2 : (TLRPC.TL_webDocument) botInlineResult4.content;
                                    }
                                    if (tL_webDocument == null) {
                                        TLRPC.WebDocument webDocument3 = this.F.thumb;
                                        if (webDocument3 instanceof TLRPC.TL_webDocument) {
                                            tL_webDocument = (TLRPC.TL_webDocument) webDocument3;
                                        }
                                    }
                                    if (tL_webDocument == null && this.K == null && closestPhotoSizeWithSize == null) {
                                        botInlineMessage = this.F.send_message;
                                        if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo)) {
                                            TLRPC.GeoPoint geoPoint = botInlineMessage.geo;
                                            double d = geoPoint.lat;
                                            double d10 = geoPoint._long;
                                            if (MessagesController.getInstance(this.d).mapProvider != 2) {
                                                webFile = WebFile.createWithGeoPoint(this.F.send_message.geo, 72, 72, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)));
                                                str2 = null;
                                            } else {
                                                str2 = AndroidUtilities.formapMapUrl(this.d, d, d10, 72, 72, true, 15, -1);
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
                                    botInlineMessage = this.F.send_message;
                                    if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                                    }
                                    TLRPC.GeoPoint geoPoint2 = botInlineMessage.geo;
                                    double d11 = geoPoint2.lat;
                                    double d102 = geoPoint2._long;
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
                            if (this.H != null) {
                                for (int i16 = 0; i16 < this.H.attributes.size(); i16++) {
                                    TLRPC.DocumentAttribute documentAttribute = this.H.attributes.get(i16);
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
                                photoSize = this.K;
                                if (photoSize == null) {
                                    if (closestPhotoSizeWithSize != null) {
                                        closestPhotoSizeWithSize.size = -1;
                                    }
                                    i12 = photoSize.w;
                                    i13 = photoSize.h;
                                } else {
                                    TLRPC.BotInlineResult botInlineResult5 = this.F;
                                    if (botInlineResult5 != null) {
                                        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult5);
                                        int i17 = inlineResultWidthAndHeight[0];
                                        i13 = inlineResultWidthAndHeight[r42];
                                        i12 = i17;
                                    }
                                }
                            }
                            if (i12 != 0 || i13 == 0) {
                                i12 = AndroidUtilities.dp(80.0f);
                                i13 = i12;
                            }
                            document2 = this.H;
                            imageReceiver = this.a;
                            if (document2 != null && this.K == null && webFile == null && str2 == null) {
                                imageReceiver4 = imageReceiver;
                            } else {
                                if (this.M) {
                                    str3 = "52_52_b";
                                    str4 = "52_52";
                                } else {
                                    int min = Math.min(i12, i13) / 3;
                                    if (this.L == 2) {
                                        Locale locale = Locale.US;
                                        String l11 = android.support.v4.media.a.l((int) (min / AndroidUtilities.density), "_80_b");
                                        if (SharedConfig.isAutoplayGifs() || this.v) {
                                            str4 = l11;
                                            str3 = str4;
                                        } else {
                                            concat = l11.concat("_firstframe");
                                            l10 = l11.concat("_firstframe");
                                        }
                                    } else {
                                        Locale locale2 = Locale.US;
                                        l10 = android.support.v4.media.a.l((int) (min / AndroidUtilities.density), "_80");
                                        concat = l10.concat("_b");
                                    }
                                    str4 = l10;
                                    str3 = concat;
                                }
                                imageReceiver.setAspectFit(this.L != 6);
                                strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                                if (strippedPhotoSize != null) {
                                    TLRPC.Document document3 = this.H;
                                    if (document3 != null) {
                                        forPhoto = ImageLocation.getForDocument(strippedPhotoSize, document3);
                                    } else {
                                        TLRPC.Photo photo = this.J;
                                        if (photo != null) {
                                            forPhoto = ImageLocation.getForPhoto(strippedPhotoSize, photo);
                                        }
                                    }
                                    imageLocation = forPhoto;
                                    if (this.L == 2) {
                                        TLRPC.Document document4 = this.H;
                                        if (document4 != null) {
                                            TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(document4);
                                            if (documentVideoThumb != null) {
                                                ImageLocation forDocument = ImageLocation.getForDocument(documentVideoThumb, this.H);
                                                StringBuilder sb = new StringBuilder("100_100");
                                                sb.append((SharedConfig.isAutoplayGifs() || this.v) ? "" : "_firstframe");
                                                imageReceiver2 = imageReceiver;
                                                imageReceiver2.setImage(forDocument, sb.toString(), ImageLocation.getForDocument(this.K, this.H), str4, imageLocation, str3, null, -1L, str, this.e, 1);
                                            } else {
                                                imageReceiver2 = imageReceiver;
                                                ImageLocation forDocument2 = ImageLocation.getForDocument(this.H);
                                                if (this.w) {
                                                    forDocument2.imageType = 2;
                                                }
                                                StringBuilder sb2 = new StringBuilder("100_100");
                                                sb2.append((SharedConfig.isAutoplayGifs() || this.v) ? "" : "_firstframe");
                                                imageReceiver2.setImage(forDocument2, sb2.toString(), ImageLocation.getForDocument(this.K, this.H), str4, imageLocation, str3, null, this.H.size, str, this.e, 0);
                                            }
                                        } else {
                                            imageReceiver2 = imageReceiver;
                                            if (webFile != null) {
                                                imageReceiver2.setImage(ImageLocation.getForWebFile(webFile), "100_100", ImageLocation.getForPhoto(this.K, this.J), str4, imageLocation, str3, null, -1L, str, this.e, 1);
                                            } else {
                                                imageReceiver2.setImage(ImageLocation.getForPath(str2), "100_100", ImageLocation.getForPhoto(this.K, this.J), str4, imageLocation, str3, null, -1L, str, this.e, 1);
                                            }
                                        }
                                    } else {
                                        imageReceiver2 = imageReceiver;
                                        if (this.K != null) {
                                            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(this.H, org.telegram.ui.ActionBar.j6.a7, f10);
                                            if (!MessageObject.canAutoplayAnimatedSticker(this.H)) {
                                                TLRPC.Document document5 = this.H;
                                                if (document5 == null) {
                                                    imageReceiver2.setImage(ImageLocation.getForPhoto(this.K, this.J), str4, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.J), str3, imageLocation, str3, null, this.K.size, str, this.e, 0);
                                                } else if (svgThumb != null) {
                                                    imageReceiver2.setImage(ImageLocation.getForDocument(this.K, document5), str4, null, null, imageLocation, str3, svgThumb, this.K.size, str, this.e, 0);
                                                } else {
                                                    imageReceiver2.setImage(ImageLocation.getForDocument(this.K, document5), str4, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.J), str3, imageLocation, str3, null, this.K.size, str, this.e, 0);
                                                }
                                            } else if (svgThumb != null) {
                                                imageReceiver2.setImage(ImageLocation.getForDocument(this.H), "80_80", null, null, imageLocation, str3, svgThumb, this.K.size, str, this.e, 0);
                                            } else {
                                                imageReceiver2.setImage(ImageLocation.getForDocument(this.H), "80_80", ImageLocation.getForDocument(this.K, this.H), str3, imageLocation, str3, null, this.K.size, str, this.e, 0);
                                            }
                                        } else if (webFile != null) {
                                            imageReceiver2.setImage(ImageLocation.getForWebFile(webFile), str4, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.J), str3, imageLocation, str3, null, -1L, str, this.e, 1);
                                        } else {
                                            imageReceiver2.setImage(ImageLocation.getForPath(str2), str4, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.J), str3, imageLocation, str3, null, -1L, str, this.e, 1);
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
                                if (this.L == 2) {
                                }
                                imageReceiver3 = imageReceiver2;
                                if (SharedConfig.isAutoplayGifs()) {
                                }
                                imageReceiver3.setAllowStartAnimation(r42);
                                imageReceiver3.startAnimation();
                                this.b = r42;
                                imageReceiver4 = imageReceiver3;
                            }
                            z10 = this.M;
                            RadialProgress2 radialProgress2 = this.S;
                            if (z10) {
                                StaticLayout staticLayout2 = this.C;
                                if (staticLayout2 != null && staticLayout2.getLineCount() != 0) {
                                    StaticLayout staticLayout3 = this.C;
                                    i14 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - r42);
                                }
                                StaticLayout staticLayout4 = this.E;
                                if (staticLayout4 != null && staticLayout4.getLineCount() != 0) {
                                    StaticLayout staticLayout5 = this.E;
                                    i14 += staticLayout5.getLineBottom(staticLayout5.getLineCount() - r42);
                                }
                                StaticLayout staticLayout6 = this.y;
                                if (staticLayout6 != null && staticLayout6.getLineCount() > 0) {
                                    StaticLayout staticLayout7 = this.y;
                                    i14 += staticLayout7.getLineBottom(staticLayout7.getLineCount() - r42);
                                }
                                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.y3.b(16.0f, Math.max(AndroidUtilities.dp(52.0f), i14), AndroidUtilities.dp(68.0f)) + (this.h ? 1 : 0));
                                int dp3 = AndroidUtilities.dp(52.0f);
                                if (LocaleController.isRTL) {
                                    f12 = 8.0f;
                                    dp = org.telegram.messenger.y3.B(8.0f, View.MeasureSpec.getSize(i10), dp3);
                                } else {
                                    f12 = 8.0f;
                                    dp = AndroidUtilities.dp(8.0f);
                                }
                                n80Var2.setBounds(dp, AndroidUtilities.dp(f12), dp + dp3, AndroidUtilities.dp(60.0f));
                                float f13 = dp3;
                                imageReceiver4.setImageCoords(dp, AndroidUtilities.dp(f12), f13, f13);
                                int i18 = this.L;
                                if (i18 == 3 || i18 == 5) {
                                    radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
                                    radialProgress2.q(AndroidUtilities.dp(4.0f) + dp, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(48.0f) + dp, AndroidUtilities.dp(56.0f));
                                }
                            } else {
                                int size2 = View.MeasureSpec.getSize(i11);
                                if (size2 == 0) {
                                    size2 = AndroidUtilities.dp(f11);
                                }
                                setMeasuredDimension(size, size2);
                                int x10 = org.telegram.ui.b.x(24.0f, size, 2);
                                int x11 = org.telegram.ui.b.x(24.0f, size2, 2);
                                radialProgress2.q(x10, x11, AndroidUtilities.dp(24.0f) + x10, AndroidUtilities.dp(24.0f) + x11);
                                radialProgress2.setCircleRadius(AndroidUtilities.dp(12.0f));
                                imageReceiver4.setImageCoords(0.0f, 0.0f, size, size2);
                            }
                            kpVar = this.U;
                            if (kpVar == null) {
                                measureChildWithMargins(kpVar, i10, 0, i11, 0);
                                return;
                            }
                            return;
                        }
                        int i19 = this.L;
                        if (i19 != 5 && i19 != 3) {
                            this.K = FileLoader.getClosestPhotoSizeWithSize(this.H.thumbs, 90, false, null, r42);
                        }
                    }
                    closestPhotoSizeWithSize = null;
                    str = null;
                    botInlineResult = this.F;
                    if (botInlineResult == null) {
                    }
                    if (this.H != null) {
                    }
                    i12 = 0;
                    i13 = 0;
                    if (i12 != 0) {
                    }
                    photoSize = this.K;
                    if (photoSize == null) {
                    }
                    if (i12 != 0) {
                    }
                    i12 = AndroidUtilities.dp(80.0f);
                    i13 = i12;
                    document2 = this.H;
                    imageReceiver = this.a;
                    if (document2 != null) {
                    }
                    if (this.M) {
                    }
                    imageReceiver.setAspectFit(this.L != 6);
                    strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                    if (strippedPhotoSize != null) {
                    }
                    imageLocation = null;
                    if (this.L == 2) {
                    }
                    imageReceiver3 = imageReceiver2;
                    if (SharedConfig.isAutoplayGifs()) {
                    }
                    imageReceiver3.setAllowStartAnimation(r42);
                    imageReceiver3.startAnimation();
                    this.b = r42;
                    imageReceiver4 = imageReceiver3;
                    z10 = this.M;
                    RadialProgress2 radialProgress22 = this.S;
                    if (z10) {
                    }
                    kpVar = this.U;
                    if (kpVar == null) {
                    }
                } else {
                    TLRPC.BotInlineResult botInlineResult6 = this.F;
                    if (botInlineResult6 != null && botInlineResult6.photo != null) {
                        this.K = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), r42, null, r42);
                        closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 80, false, null, r42);
                        if (closestPhotoSizeWithSize != this.K) {
                            str = null;
                            botInlineResult = this.F;
                            if (botInlineResult == null) {
                            }
                            if (this.H != null) {
                            }
                            i12 = 0;
                            i13 = 0;
                            if (i12 != 0) {
                            }
                            photoSize = this.K;
                            if (photoSize == null) {
                            }
                            if (i12 != 0) {
                            }
                            i12 = AndroidUtilities.dp(80.0f);
                            i13 = i12;
                            document2 = this.H;
                            imageReceiver = this.a;
                            if (document2 != null) {
                            }
                            if (this.M) {
                            }
                            imageReceiver.setAspectFit(this.L != 6);
                            strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                            if (strippedPhotoSize != null) {
                            }
                            imageLocation = null;
                            if (this.L == 2) {
                            }
                            imageReceiver3 = imageReceiver2;
                            if (SharedConfig.isAutoplayGifs()) {
                            }
                            imageReceiver3.setAllowStartAnimation(r42);
                            imageReceiver3.startAnimation();
                            this.b = r42;
                            imageReceiver4 = imageReceiver3;
                            z10 = this.M;
                            RadialProgress2 radialProgress222 = this.S;
                            if (z10) {
                            }
                            kpVar = this.U;
                            if (kpVar == null) {
                            }
                        }
                    }
                    closestPhotoSizeWithSize = null;
                    str = null;
                    botInlineResult = this.F;
                    if (botInlineResult == null) {
                    }
                    if (this.H != null) {
                    }
                    i12 = 0;
                    i13 = 0;
                    if (i12 != 0) {
                    }
                    photoSize = this.K;
                    if (photoSize == null) {
                    }
                    if (i12 != 0) {
                    }
                    i12 = AndroidUtilities.dp(80.0f);
                    i13 = i12;
                    document2 = this.H;
                    imageReceiver = this.a;
                    if (document2 != null) {
                    }
                    if (this.M) {
                    }
                    imageReceiver.setAspectFit(this.L != 6);
                    strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                    if (strippedPhotoSize != null) {
                    }
                    imageLocation = null;
                    if (this.L == 2) {
                    }
                    imageReceiver3 = imageReceiver2;
                    if (SharedConfig.isAutoplayGifs()) {
                    }
                    imageReceiver3.setAllowStartAnimation(r42);
                    imageReceiver3.startAnimation();
                    this.b = r42;
                    imageReceiver4 = imageReceiver3;
                    z10 = this.M;
                    RadialProgress2 radialProgress2222 = this.S;
                    if (z10) {
                    }
                    kpVar = this.U;
                    if (kpVar == null) {
                    }
                }
            } else {
                arrayList2 = new ArrayList(this.F.photo.sizes);
            }
        }
        arrayList = arrayList2;
        z4 = this.M;
        n80Var = this.c;
        if (z4) {
        }
        n80Var2 = n80Var;
        r42 = 1;
        f10 = 1.0f;
        f11 = 100.0f;
        document = this.H;
        if (document != null) {
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.S.o(Math.min(1.0f, j10 / j11), true);
        int i10 = this.L;
        if (i10 == 3 || i10 == 5) {
            if (this.R != 4) {
                f(false, true);
            }
        } else if (this.R != 1) {
            f(false, true);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.c0 = true;
        this.S.o(1.0f, true);
        f(false, true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (this.M || this.V == null || this.F == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        AndroidUtilities.dp(48.0f);
        int i10 = this.L;
        n80 n80Var = this.c;
        boolean z4 = true;
        if (i10 == 3 || i10 == 5) {
            boolean contains = n80Var.getBounds().contains(x10, y10);
            int action = motionEvent.getAction();
            RadialProgress2 radialProgress2 = this.S;
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
            z4 = false;
        } else {
            TLRPC.BotInlineResult botInlineResult = this.F;
            if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                if (motionEvent.getAction() == 0) {
                    if (n80Var.getBounds().contains(x10, y10)) {
                        this.n = true;
                    }
                } else if (this.n) {
                    if (motionEvent.getAction() == 1) {
                        this.n = false;
                        playSoundEffect(0);
                        ((tf.j0) this.V).a.S.b.k(getResult());
                    } else if (motionEvent.getAction() == 3) {
                        this.n = false;
                    } else if (motionEvent.getAction() == 2 && !n80Var.getBounds().contains(x10, y10)) {
                        this.n = false;
                    }
                }
            }
            z4 = false;
        }
        return !z4 ? super.onTouchEvent(motionEvent) : z4;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        int i11;
        if (i10 != 16 || ((i11 = this.L) != 3 && i11 != 5)) {
            return super.performAccessibilityAction(i10, bundle);
        }
        a();
        return true;
    }

    public void setCanPreviewGif(boolean z4) {
        this.s = z4;
    }

    public void setDelegate(c2 c2Var) {
        this.V = c2Var;
    }

    public void setIsKeyboard(boolean z4) {
        this.v = z4;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        super.setPressed(z4);
        rc rcVar = this.W;
        if (rcVar != null) {
            rcVar.c(z4 || this.T);
        }
    }

    public void setScaled(boolean z4) {
        this.T = z4;
        rc rcVar = this.W;
        if (rcVar != null) {
            rcVar.c(isPressed() || this.T);
        }
    }

    public d2(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.d = i10;
        this.B = AndroidUtilities.dp(7.0f);
        this.D = AndroidUtilities.dp(27.0f);
        this.d0 = 1.0f;
        this.e0 = new b2(0, this);
        this.f = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setLayerNum(1);
        imageReceiver.setUseSharedAnimationQueue(true);
        this.c = new n80(0, f6Var);
        this.S = new RadialProgress2(this, null);
        this.Q = DownloadController.getInstance(i10).generateObserverTag();
        setFocusable(true);
        if (z4) {
            Paint paint = new Paint();
            this.P = paint;
            int i11 = org.telegram.ui.ActionBar.j6.Lh;
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            kp kpVar = new kp(context, 21, f6Var);
            this.U = kpVar;
            kpVar.setVisibility(4);
            kpVar.b(-1, i11, org.telegram.ui.ActionBar.j6.k7);
            kpVar.setDrawUnchecked(false);
            kpVar.setDrawBackgroundAsArc(1);
            addView(kpVar, k7.b6.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
