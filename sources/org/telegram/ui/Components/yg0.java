package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class yg0 extends org.telegram.ui.Cells.a0 implements fo0, DownloadController.FileDownloadProgressListener {
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public int F;
    public int G;
    public int H;
    public boolean f;
    public MessageObject h;
    public int n;
    public TextPaint r;
    public go0 s;
    public hi0 v;
    public int w;
    public int x;
    public int y;

    @Override // org.telegram.ui.Components.fo0
    public final void b(float f10) {
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(this.h, f10);
    }

    public final MessageObject getMessageObject() {
        return this.h;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.H;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(this.n).removeLoadingFileObserver(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        if (!this.f) {
            requestLayout();
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int i10 = point.y;
        int i11 = point.x;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            int measuredWidth = view.getMeasuredWidth();
            i10 = view.getMeasuredHeight();
            i11 = measuredWidth;
        }
        org.telegram.ui.ActionBar.k6.q3.n((int) getY(), i11, i10);
        org.telegram.ui.ActionBar.h5 h5Var = org.telegram.ui.ActionBar.k6.q3;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (h5Var != null) {
            h5Var.setBounds(0, 0, measuredWidth2, measuredHeight);
        }
        org.telegram.ui.ActionBar.k6.q3.draw(canvas);
        if (this.h == null) {
            return;
        }
        canvas.save();
        int i12 = this.y;
        if (i12 == 0 || i12 == 1) {
            canvas.translate(this.w, this.x);
            this.s.b(canvas);
        } else {
            canvas.translate(AndroidUtilities.dp(12.0f) + this.w, this.x);
            hi0 hi0Var = this.v;
            float f10 = hi0Var.e / 2;
            float f11 = hi0Var.f / 2.0f;
            canvas.drawRect(0.0f, f10 - f11, hi0Var.d, f11 + f10, hi0Var.a);
            float f12 = hi0Var.e / 2;
            canvas.drawRect(0.0f, f12 - f11, hi0Var.c * hi0Var.d, f11 + f12, hi0Var.b);
        }
        canvas.restore();
        int i13 = this.y;
        this.r.setColor(-6182221);
        Drawable drawable = org.telegram.ui.ActionBar.k6.U4[i13][this.D];
        int dp = AndroidUtilities.dp(36.0f);
        org.telegram.ui.Cells.a0.o(((dp - drawable.getIntrinsicWidth()) / 2) + this.B, ((dp - drawable.getIntrinsicHeight()) / 2) + this.C, drawable);
        drawable.draw(canvas);
        canvas.save();
        canvas.translate(this.F, AndroidUtilities.dp(18.0f));
        this.E.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z4) {
        r();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        hi0 hi0Var = this.v;
        if (this.h == null) {
            return;
        }
        this.w = AndroidUtilities.dp(54.0f);
        this.B = AndroidUtilities.dp(10.0f);
        this.F = (getMeasuredWidth() - this.G) - AndroidUtilities.dp(16.0f);
        this.s.j((getMeasuredWidth() - AndroidUtilities.dp(70.0f)) - this.G, AndroidUtilities.dp(30.0f));
        hi0Var.d = (getMeasuredWidth() - AndroidUtilities.dp(94.0f)) - this.G;
        hi0Var.e = AndroidUtilities.dp(30.0f);
        this.x = AndroidUtilities.dp(13.0f);
        this.C = AndroidUtilities.dp(10.0f);
        s();
        if (z4 || !this.f) {
            this.f = true;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.v.a(Math.min(1.0f, j10 / j11));
        if (this.y != 3) {
            r();
        }
        invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x012c, code lost:
    
        if (r1 <= (r0 + r4)) goto L58;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean f10 = this.s.f(motionEvent.getX() - this.w, motionEvent.getY() - this.x, motionEvent.getAction());
        if (f10) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return f10;
        }
        int dp = AndroidUtilities.dp(36.0f);
        if (motionEvent.getAction() == 0) {
            if (x10 >= this.B && x10 <= r5 + dp) {
                if (y10 >= this.C && y10 <= r0 + dp) {
                    this.D = 1;
                    invalidate();
                    f10 = true;
                }
            }
        } else if (this.D == 1) {
            if (motionEvent.getAction() == 1) {
                this.D = 0;
                playSoundEffect(0);
                int i10 = this.y;
                if (i10 == 0) {
                    boolean playMessage = MediaController.getInstance().playMessage(this.h);
                    if (!this.h.isOut() && this.h.isContentUnread() && this.h.messageOwner.peer_id.channel_id == 0) {
                        MessagesController.getInstance(this.n).markMessageContentAsRead(this.h);
                        this.h.setContentIsRead();
                    }
                    if (playMessage) {
                        this.y = 1;
                        invalidate();
                    }
                } else if (i10 == 1) {
                    if (MediaController.getInstance().lambda$startAudioAgain$7(this.h)) {
                        this.y = 0;
                        invalidate();
                    }
                } else if (i10 == 2) {
                    FileLoader.getInstance(this.n).loadFile(this.h.getDocument(), this.h, 1, 0);
                    this.y = 4;
                    invalidate();
                } else if (i10 == 3) {
                    FileLoader.getInstance(this.n).cancelLoadFile(this.h.getDocument());
                    this.y = 2;
                    invalidate();
                }
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.D = 0;
                invalidate();
            } else if (motionEvent.getAction() == 2) {
                if (x10 >= this.B && x10 <= r3 + dp) {
                    if (y10 >= this.C) {
                    }
                }
                this.D = 0;
                invalidate();
            }
        }
        return !f10 ? super.onTouchEvent(motionEvent) : f10;
    }

    public final void r() {
        hi0 hi0Var = this.v;
        String fileName = this.h.getFileName();
        if (FileLoader.getInstance(this.n).getPathToMessage(this.h.messageOwner).exists()) {
            DownloadController.getInstance(this.n).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.h);
            if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                this.y = 0;
            } else {
                this.y = 1;
            }
            hi0Var.a(0.0f);
        } else {
            DownloadController.getInstance(this.n).addLoadingFileObserver(fileName, this);
            if (FileLoader.getInstance(this.n).isLoadingFile(fileName)) {
                this.y = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    hi0Var.a(fileProgress.floatValue());
                } else {
                    hi0Var.a(0.0f);
                }
            } else {
                this.y = 2;
                hi0Var.a(0.0f);
            }
        }
        s();
    }

    public final void s() {
        int i10;
        TextPaint textPaint = this.r;
        MessageObject messageObject = this.h;
        if (messageObject == null) {
            return;
        }
        go0 go0Var = this.s;
        if (!go0Var.e) {
            go0Var.i(messageObject.audioProgress);
        }
        if (!MediaController.getInstance().isPlayingMessage(this.h)) {
            i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= this.h.getDocument().attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.h.getDocument().attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i10 = (int) documentAttribute.duration;
                    break;
                }
                i11++;
            }
        } else {
            i10 = this.h.audioProgressSec;
        }
        String formatLongDuration = AndroidUtilities.formatLongDuration(i10);
        this.G = (int) Math.ceil(textPaint.measureText(formatLongDuration));
        this.E = new StaticLayout(formatLongDuration, textPaint, this.G, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public void setMessageObject(MessageObject messageObject) {
        if (this.h != messageObject) {
            this.n = messageObject.currentAccount;
            go0 go0Var = this.s;
            int i10 = org.telegram.ui.ActionBar.k6.ud;
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
            int w03 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.k6.xd;
            go0Var.h(w02, w03, org.telegram.ui.ActionBar.k6.w0(null, i11, false), org.telegram.ui.ActionBar.k6.w0(null, i11, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.wd, false));
            hi0 hi0Var = this.v;
            hi0Var.a.setColor(-2497813);
            hi0Var.b.setColor(-7944712);
            this.h = messageObject;
            this.f = false;
            requestLayout();
        }
        r();
    }

    @Override // org.telegram.ui.Components.fo0
    public final /* synthetic */ void d(float f10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
