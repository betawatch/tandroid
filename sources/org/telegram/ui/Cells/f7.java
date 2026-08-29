package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.vs;
import org.telegram.ui.h10;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class f7 extends FrameLayout implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.u5 A;
    public float B;
    public float C;
    public StaticLayout D;
    public int E;
    public org.telegram.ui.Components.u5 F;
    public float G;
    public float H;
    public StaticLayout I;
    public MessageObject J;
    public boolean K;
    public final int L;
    public final int M;
    public int N;
    public int O;
    public final RadialProgress2 P;
    public final int Q;
    public StaticLayout R;
    public int S;
    public final TextPaint T;
    public final TextPaint U;
    public final org.telegram.ui.ActionBar.c6 V;
    public boolean W;
    public final SpannableStringBuilder a;
    public float a0;
    public final hp b;
    public boolean b0;
    public boolean c;
    public float c0;
    public boolean d;
    public final TextPaint d0;
    public boolean e;
    public Utilities.CallbackReturn e0;
    public int f;
    public float f0;
    public p00 g0;
    public int h;
    public int n;
    public final int r;
    public StaticLayout s;
    public float v;
    public float w;
    public org.telegram.ui.Components.u5 x;
    public int y;

    public f7(Context context) {
        this(context, 0, null);
    }

    private int getIconForCurrentState() {
        int i10 = this.N;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i10 = this.O;
        if (i10 < 0) {
            return 4;
        }
        return i10 == 0 ? 2 : 3;
    }

    public void a() {
        int i10 = this.N;
        int i11 = this.L;
        RadialProgress2 radialProgress2 = this.P;
        if (i10 == 0) {
            if (this.O == 0) {
                this.J.putInDownloadsStore = true;
                FileLoader.getInstance(i11).loadFile(this.J.getDocument(), this.J, 1, 0);
            }
            if (d(this.J)) {
                if (this.f == 2 && this.O != 1) {
                    this.O = 1;
                    radialProgress2.o(0.0f, false);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.N = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.J)) {
                this.N = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 2) {
            radialProgress2.o(0.0f, false);
            this.J.putInDownloadsStore = true;
            FileLoader.getInstance(i11).loadFile(this.J.getDocument(), this.J, 1, 0);
            this.N = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (i10 == 4) {
            FileLoader.getInstance(i11).cancelLoadFile(this.J.getDocument());
            this.N = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        StaticLayout staticLayout;
        org.telegram.ui.ActionBar.c6 c6Var = this.V;
        if (this.Q == 1) {
            this.T.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
        }
        StaticLayout staticLayout2 = this.R;
        int i10 = this.r;
        int i11 = 0;
        if (staticLayout2 != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? 0 : this.S), i10);
            this.R.draw(canvas);
            canvas.restore();
        }
        if (this.s != null) {
            int alpha = org.telegram.ui.ActionBar.g6.f3.getAlpha();
            float f9 = this.c0;
            if (f9 != 1.0f) {
                org.telegram.ui.ActionBar.g6.f3.setAlpha((int) (alpha * f9));
            }
            canvas.save();
            int dp = AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline);
            if (LocaleController.isRTL && (staticLayout = this.R) != null) {
                i11 = staticLayout.getWidth() + AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 4.0f);
            }
            canvas.translate(((dp + i11) + (LocaleController.isRTL ? this.s.getWidth() - this.w : 0.0f)) - this.v, i10);
            this.s.draw(canvas);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.s, this.x, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.c0 != 1.0f) {
                org.telegram.ui.ActionBar.g6.f3.setAlpha(alpha);
            }
        }
        if (this.I != null) {
            this.U.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            canvas.save();
            canvas.translate((AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? this.I.getWidth() - this.H : 0.0f)) - this.G, this.E);
            this.I.draw(canvas);
            canvas.restore();
        }
        if (this.D != null) {
            org.telegram.ui.ActionBar.g6.g3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
            int alpha2 = org.telegram.ui.ActionBar.g6.g3.getAlpha();
            float f10 = this.c0;
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.g6.g3.setAlpha((int) (alpha2 * f10));
            }
            canvas.save();
            canvas.translate((AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? this.D.getWidth() - this.C : 0.0f)) - this.B, this.y);
            this.D.draw(canvas);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.D, this.A, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.c0 != 1.0f) {
                org.telegram.ui.ActionBar.g6.g3.setAlpha(alpha2);
            }
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(this.d ? org.telegram.ui.ActionBar.g6.jd : org.telegram.ui.ActionBar.g6.id, c6Var);
        RadialProgress2 radialProgress2 = this.P;
        radialProgress2.d = v02;
        radialProgress2.H = this.c0;
        radialProgress2.draw(canvas);
        if (this.c) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - AndroidUtilities.dp(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
            } else {
                canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z10 = this.W;
        if (z10 || this.a0 != 0.0f) {
            if (z10) {
                float f9 = this.a0;
                if (f9 != 1.0f) {
                    this.a0 = f9 + 0.10666667f;
                    invalidate();
                    this.a0 = Utilities.clamp(this.a0, 1.0f, 0.0f);
                    int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth();
                    int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight()) >> 1;
                    canvas.save();
                    float f10 = this.a0;
                    canvas.scale(f10, f10, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                    Drawable drawable = org.telegram.ui.ActionBar.g6.Z0;
                    drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() + measuredHeight);
                    org.telegram.ui.ActionBar.g6.Z0.draw(canvas);
                    canvas.restore();
                }
            }
            if (!z10) {
                float f11 = this.a0;
                if (f11 != 0.0f) {
                    this.a0 = f11 - 0.10666667f;
                    invalidate();
                }
            }
            this.a0 = Utilities.clamp(this.a0, 1.0f, 0.0f);
            int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth();
            int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight()) >> 1;
            canvas.save();
            float f102 = this.a0;
            canvas.scale(f102, f102, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
            Drawable drawable2 = org.telegram.ui.ActionBar.g6.Z0;
            drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() + measuredHeight2);
            org.telegram.ui.ActionBar.g6.Z0.draw(canvas);
            canvas.restore();
        }
    }

    public boolean d(MessageObject messageObject) {
        Utilities.CallbackReturn callbackReturn = this.e0;
        return callbackReturn != null && ((Boolean) callbackReturn.run(messageObject)).booleanValue();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g(false, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.b0;
        if (z10) {
            float f9 = this.c0;
            if (f9 != 1.0f) {
                this.c0 = f9 + 0.10666667f;
                invalidate();
                this.c0 = Utilities.clamp(this.c0, 1.0f, 0.0f);
                if (this.f0 != 1.0f || this.g0 == null) {
                    b(canvas);
                    c(canvas);
                    super.dispatchDraw(canvas);
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.f0) * 255.0f), 31);
                this.g0.setViewType(4);
                this.g0.e();
                this.g0.h();
                this.g0.draw(canvas);
                canvas.restore();
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.f0 * 255.0f), 31);
                b(canvas);
                super.dispatchDraw(canvas);
                c(canvas);
                canvas.restore();
                return;
            }
        }
        if (!z10) {
            float f10 = this.c0;
            if (f10 != 0.0f) {
                this.c0 = f10 - 0.10666667f;
                invalidate();
            }
        }
        this.c0 = Utilities.clamp(this.c0, 1.0f, 0.0f);
        if (this.f0 != 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        hp hpVar = this.b;
        if (hpVar.getVisibility() != 0) {
            hpVar.setVisibility(0);
        }
        hpVar.a(z10, z11);
    }

    public final void f(MessageObject messageObject, boolean z10) {
        this.c = z10;
        this.J = messageObject;
        TLRPC.Document document = messageObject.getDocument();
        TLRPC.PhotoSize closestPhotoSizeWithSize = document != null ? FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 360) : null;
        boolean z11 = closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.P;
        if (z11 || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(closestPhotoSizeWithSize, document, messageObject);
        } else {
            Bitmap bitmap = messageObject.audioCover;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.w.setImageBitmap(bitmap);
            } else {
                String artworkUrl = messageObject.getArtworkUrl(true);
                if (TextUtils.isEmpty(artworkUrl)) {
                    radialProgress2.i(null, null, null);
                } else {
                    radialProgress2.h(artworkUrl);
                }
            }
        }
        g(false, false);
        requestLayout();
    }

    public final void g(boolean z10, boolean z11) {
        String fileName = this.J.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        MessageObject messageObject = this.J;
        boolean z12 = messageObject.attachPathExists || messageObject.mediaExists;
        if (SharedConfig.streamMedia && messageObject.isMusic() && ((int) this.J.getDialogId()) != 0) {
            this.f = z12 ? 1 : 2;
            z12 = true;
        } else {
            this.f = 0;
            this.O = -1;
        }
        int i10 = this.f;
        int i11 = this.L;
        RadialProgress2 radialProgress2 = this.P;
        if (i10 == 0) {
            if (z12) {
                DownloadController.getInstance(i11).removeLoadingFileObserver(this);
                boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.J);
                if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.N = 0;
                } else {
                    this.N = 1;
                }
                radialProgress2.o(1.0f, z11);
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
                invalidate();
                return;
            }
            DownloadController.getInstance(i11).addLoadingFileObserver(fileName, this.J, this);
            if (FileLoader.getInstance(i11).isLoadingFile(fileName)) {
                this.N = 4;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    radialProgress2.o(fileProgress.floatValue(), z11);
                } else {
                    radialProgress2.o(0.0f, z11);
                }
            } else {
                this.N = 2;
                radialProgress2.o(0.0f, z11);
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
            return;
        }
        radialProgress2.e.setColor(org.telegram.ui.ActionBar.g6.v0(this.J.isOutOwner() ? org.telegram.ui.ActionBar.g6.Nb : org.telegram.ui.ActionBar.g6.ie, this.V));
        boolean isPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.J);
        if (!isPlayingMessage2 || (isPlayingMessage2 && MediaController.getInstance().isMessagePaused())) {
            this.N = 0;
        } else {
            this.N = 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
        if (this.f == 1) {
            DownloadController.getInstance(i11).removeLoadingFileObserver(this);
            this.O = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        DownloadController.getInstance(i11).addLoadingFileObserver(fileName, this.J, this);
        if (!FileLoader.getInstance(i11).isLoadingFile(fileName)) {
            this.O = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        this.O = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
        Float fileProgress2 = ImageLoader.getInstance().getFileProgress(fileName);
        if (fileProgress2 != null) {
            radialProgress2.o(fileProgress2.floatValue(), z11);
        } else {
            radialProgress2.o(0.0f, z11);
        }
    }

    public MessageObject getMessage() {
        return this.J;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P.e();
        g(false, false);
        int i10 = this.L;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        this.x = org.telegram.ui.Components.y5.update(0, this, this.x, this.s);
        this.A = org.telegram.ui.Components.y5.update(0, this, this.A, this.D);
        this.F = org.telegram.ui.Components.y5.update(0, this, this.F, this.I);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.L;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.P.f();
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        org.telegram.ui.Components.y5.release(this, this.x);
        org.telegram.ui.Components.y5.release(this, this.A);
        org.telegram.ui.Components.y5.release(this, this.F);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        g(true, z10);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.J.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.J.getMusicAuthor(), this.J.getMusicTitle()));
        } else if (this.s != null && this.D != null) {
            accessibilityNodeInfo.setText(((Object) this.s.getText()) + ", " + ((Object) this.D.getText()));
        }
        if (this.b.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? LocaleController.getString("AccActionPlay", R.string.AccActionPlay) : LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload) : LocaleController.getString("AccActionDownload", R.string.AccActionDownload) : LocaleController.getString("AccActionPause", R.string.AccActionPause)));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:0|1|(1:3)(1:107)|4|(36:98|99|(2:101|(1:103))|104|7|8|9|(1:11)|12|(1:14)(1:94)|15|(1:17)(1:93)|18|(1:20)(1:92)|21|22|(5:24|(1:26)(1:39)|27|(5:29|(1:31)(1:37)|32|(1:34)(1:36)|35)|38)|(17:80|81|(2:83|(1:85))|86|(1:88)(1:90)|89|52|(1:54)(1:78)|55|(1:57)(1:77)|58|59|(1:61)|62|(1:64)(1:72)|65|(2:67|68)(2:70|71))|41|(1:43)|(1:45)|(1:47)(1:79)|48|(1:50)|51|52|(0)(0)|55|(0)(0)|58|59|(0)|62|(0)(0)|65|(0)(0))|6|7|8|9|(0)|12|(0)(0)|15|(0)(0)|18|(0)(0)|21|22|(0)|(0)|41|(0)|(0)|(0)(0)|48|(0)|51|52|(0)(0)|55|(0)(0)|58|59|(0)|62|(0)(0)|65|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00d4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd A[Catch: Exception -> 0x00d4, TryCatch #2 {Exception -> 0x00d4, blocks: (B:9:0x0092, B:12:0x009d, B:15:0x00a4, B:17:0x00cd, B:18:0x00d7, B:20:0x00e1, B:21:0x00e9, B:94:0x00a2), top: B:8:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1 A[Catch: Exception -> 0x00d4, TryCatch #2 {Exception -> 0x00d4, blocks: (B:9:0x0092, B:12:0x009d, B:15:0x00a4, B:17:0x00cd, B:18:0x00d7, B:20:0x00e1, B:21:0x00e9, B:94:0x00a2), top: B:8:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0202 A[Catch: Exception -> 0x01b6, TryCatch #1 {Exception -> 0x01b6, blocks: (B:81:0x01a5, B:83:0x01ad, B:86:0x01b9, B:89:0x01c9, B:52:0x0278, B:54:0x0280, B:55:0x0288, B:57:0x0292, B:58:0x029a, B:90:0x01c7, B:41:0x01eb, B:45:0x0202, B:48:0x0224, B:50:0x0230, B:51:0x024b, B:79:0x0222), top: B:80:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0230 A[Catch: Exception -> 0x01b6, TryCatch #1 {Exception -> 0x01b6, blocks: (B:81:0x01a5, B:83:0x01ad, B:86:0x01b9, B:89:0x01c9, B:52:0x0278, B:54:0x0280, B:55:0x0288, B:57:0x0292, B:58:0x029a, B:90:0x01c7, B:41:0x01eb, B:45:0x0202, B:48:0x0224, B:50:0x0230, B:51:0x024b, B:79:0x0222), top: B:80:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0280 A[Catch: Exception -> 0x01b6, TryCatch #1 {Exception -> 0x01b6, blocks: (B:81:0x01a5, B:83:0x01ad, B:86:0x01b9, B:89:0x01c9, B:52:0x0278, B:54:0x0280, B:55:0x0288, B:57:0x0292, B:58:0x029a, B:90:0x01c7, B:41:0x01eb, B:45:0x0202, B:48:0x0224, B:50:0x0230, B:51:0x024b, B:79:0x0222), top: B:80:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0292 A[Catch: Exception -> 0x01b6, TryCatch #1 {Exception -> 0x01b6, blocks: (B:81:0x01a5, B:83:0x01ad, B:86:0x01b9, B:89:0x01c9, B:52:0x0278, B:54:0x0280, B:55:0x0288, B:57:0x0292, B:58:0x029a, B:90:0x01c7, B:41:0x01eb, B:45:0x0202, B:48:0x0224, B:50:0x0230, B:51:0x024b, B:79:0x0222), top: B:80:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0222 A[Catch: Exception -> 0x01b6, TryCatch #1 {Exception -> 0x01b6, blocks: (B:81:0x01a5, B:83:0x01ad, B:86:0x01b9, B:89:0x01c9, B:52:0x0278, B:54:0x0280, B:55:0x0288, B:57:0x0292, B:58:0x029a, B:90:0x01c7, B:41:0x01eb, B:45:0x0202, B:48:0x0224, B:50:0x0230, B:51:0x024b, B:79:0x0222), top: B:80:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a2 A[Catch: Exception -> 0x00d4, TryCatch #2 {Exception -> 0x00d4, blocks: (B:9:0x0092, B:12:0x009d, B:15:0x00a4, B:17:0x00cd, B:18:0x00d7, B:20:0x00e1, B:21:0x00e9, B:94:0x00a2), top: B:8:0x0092 }] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f9;
        CharSequence d;
        CharSequence highlightText;
        CharSequence highlightText2;
        TextPaint textPaint;
        this.D = null;
        this.s = null;
        this.I = null;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(28.0f);
        TextPaint textPaint2 = this.T;
        int i13 = this.Q;
        if (i13 == 1) {
            String stringForMessageListDate = LocaleController.stringForMessageListDate(this.J.messageOwner.date);
            int ceil = (int) Math.ceil(textPaint2.measureText(stringForMessageListDate));
            this.R = s1.u2(stringForMessageListDate, textPaint2, ceil, ceil, 0, 1);
            this.S = AndroidUtilities.dp(20.0f) + ((size - ceil) - AndroidUtilities.dp(8.0f));
            i12 = AndroidUtilities.dp(12.0f) + ceil;
        } else {
            i12 = 0;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.V;
        if (i13 == 1) {
            try {
                if (!this.J.isVoice()) {
                    if (this.J.isRoundVideo()) {
                    }
                }
                d = h10.d(this.J, true, 1, null);
                f9 = 4.0f;
                highlightText2 = AndroidUtilities.highlightText(d, this.J.highlightedWords, c6Var);
                if (highlightText2 != null) {
                    d = highlightText2;
                }
                textPaint = this.d0;
                if (textPaint != null) {
                    textPaint = org.telegram.ui.ActionBar.g6.f3;
                }
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(d, textPaint, size - i12, TextUtils.TruncateAt.END), textPaint, (AndroidUtilities.dp(4.0f) + size) - i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.s = staticLayout;
                this.v = staticLayout.getLineCount() <= 0 ? this.s.getLineLeft(0) : 0.0f;
                this.w = this.s.getLineCount() <= 0 ? this.s.getLineWidth(0) : 0.0f;
                this.x = org.telegram.ui.Components.y5.update(0, this, this.x, this.s);
            } catch (Exception e10) {
                e = e10;
                f9 = 4.0f;
                FileLog.e(e);
                String str = "";
                if (this.J.hasHighlightedWords()) {
                }
                if (i13 == 1) {
                }
                CharSequence replace = this.J.getMusicAuthor().replace('\n', ' ');
                highlightText = AndroidUtilities.highlightText(replace, this.J.highlightedWords, c6Var);
                if (highlightText != null) {
                }
                if (i13 == 1) {
                }
                if (i13 == 1) {
                }
                if (this.J.getDuration() > 0.0d) {
                }
                this.D = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace, textPaint2, size - textPaint2.measureText(str), TextUtils.TruncateAt.END)).append((CharSequence) str), textPaint2, size + AndroidUtilities.dp(f9), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.B = this.D.getLineCount() > 0 ? this.D.getLineLeft(0) : 0.0f;
                this.C = this.D.getLineCount() > 0 ? this.D.getLineWidth(0) : 0.0f;
                this.A = org.telegram.ui.Components.y5.update(0, this, this.A, this.D);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f) + (this.I != null ? AndroidUtilities.dp(18.0f) : 0) + (this.c ? 1 : 0));
                if (LocaleController.isRTL) {
                }
                int dp = AndroidUtilities.dp(f9) + r0;
                this.h = dp;
                int dp2 = AndroidUtilities.dp(6.0f);
                this.n = dp2;
                this.P.q(dp, dp2, AndroidUtilities.dp(48.0f) + r0, AndroidUtilities.dp(50.0f));
                measureChildWithMargins(this.b, i10, 0, i11, 0);
                if (this.I == null) {
                }
            }
            String str2 = "";
            if (this.J.hasHighlightedWords()) {
                CharSequence highlightText3 = AndroidUtilities.highlightText(TextUtils.isEmpty(this.J.messageOwner.message) ? "" : Emoji.replaceEmoji(this.J.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt(), false), this.J.highlightedWords, c6Var);
                if (highlightText3 != null) {
                    String str3 = this.J.highlightedWords.get(0);
                    TextPaint textPaint3 = this.U;
                    StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(AndroidUtilities.ellipsizeCenterEnd(highlightText3, str3, size, textPaint3, 130), textPaint3, size, TextUtils.TruncateAt.END), textPaint3, AndroidUtilities.dp(f9) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.I = staticLayout2;
                    this.G = staticLayout2.getLineCount() > 0 ? this.I.getLineLeft(0) : 0.0f;
                    this.H = this.I.getLineCount() > 0 ? this.I.getLineWidth(0) : 0.0f;
                }
                this.F = org.telegram.ui.Components.y5.update(0, this, this.F, this.I);
            }
            if (i13 == 1) {
                try {
                    if (!this.J.isVoice()) {
                        if (this.J.isRoundVideo()) {
                        }
                    }
                    String formatDuration = AndroidUtilities.formatDuration((int) this.J.getDuration(), false);
                    if (i13 != 1) {
                        textPaint2 = org.telegram.ui.ActionBar.g6.g3;
                    }
                    this.D = new StaticLayout(TextUtils.ellipsize(formatDuration, textPaint2, size, TextUtils.TruncateAt.END), textPaint2, size + AndroidUtilities.dp(f9), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.B = this.D.getLineCount() > 0 ? this.D.getLineLeft(0) : 0.0f;
                    this.C = this.D.getLineCount() > 0 ? this.D.getLineWidth(0) : 0.0f;
                    this.A = org.telegram.ui.Components.y5.update(0, this, this.A, this.D);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f) + (this.I != null ? AndroidUtilities.dp(18.0f) : 0) + (this.c ? 1 : 0));
                int B = LocaleController.isRTL ? org.telegram.messenger.x3.B(8.0f, View.MeasureSpec.getSize(i10), AndroidUtilities.dp(52.0f)) : AndroidUtilities.dp(8.0f);
                int dp3 = AndroidUtilities.dp(f9) + B;
                this.h = dp3;
                int dp22 = AndroidUtilities.dp(6.0f);
                this.n = dp22;
                this.P.q(dp3, dp22, AndroidUtilities.dp(48.0f) + B, AndroidUtilities.dp(50.0f));
                measureChildWithMargins(this.b, i10, 0, i11, 0);
                if (this.I == null) {
                    this.y = AndroidUtilities.dp(29.0f);
                    return;
                } else {
                    this.E = AndroidUtilities.dp(29.0f);
                    this.y = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(29.0f);
                    return;
                }
            }
            CharSequence replace2 = this.J.getMusicAuthor().replace('\n', ' ');
            highlightText = AndroidUtilities.highlightText(replace2, this.J.highlightedWords, c6Var);
            if (highlightText != null) {
                replace2 = highlightText;
            }
            if (i13 == 1) {
                replace2 = new SpannableStringBuilder(replace2).append(' ').append((CharSequence) this.a).append(' ').append(h10.d(this.J, true, 1, null));
            }
            if (i13 == 1) {
                textPaint2 = org.telegram.ui.ActionBar.g6.g3;
            }
            if (this.J.getDuration() > 0.0d) {
                str2 = " • " + LocaleController.formatShortDuration((int) Math.ceil(this.J.getDuration()));
            }
            this.D = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace2, textPaint2, size - textPaint2.measureText(str2), TextUtils.TruncateAt.END)).append((CharSequence) str2), textPaint2, size + AndroidUtilities.dp(f9), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.B = this.D.getLineCount() > 0 ? this.D.getLineLeft(0) : 0.0f;
            this.C = this.D.getLineCount() > 0 ? this.D.getLineWidth(0) : 0.0f;
            this.A = org.telegram.ui.Components.y5.update(0, this, this.A, this.D);
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f) + (this.I != null ? AndroidUtilities.dp(18.0f) : 0) + (this.c ? 1 : 0));
            if (LocaleController.isRTL) {
            }
            int dp32 = AndroidUtilities.dp(f9) + B;
            this.h = dp32;
            int dp222 = AndroidUtilities.dp(6.0f);
            this.n = dp222;
            this.P.q(dp32, dp222, AndroidUtilities.dp(48.0f) + B, AndroidUtilities.dp(50.0f));
            measureChildWithMargins(this.b, i10, 0, i11, 0);
            if (this.I == null) {
            }
        }
        d = this.J.getMusicTitle().replace('\n', ' ');
        f9 = 4.0f;
        highlightText2 = AndroidUtilities.highlightText(d, this.J.highlightedWords, c6Var);
        if (highlightText2 != null) {
        }
        textPaint = this.d0;
        if (textPaint != null) {
        }
        StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(d, textPaint, size - i12, TextUtils.TruncateAt.END), textPaint, (AndroidUtilities.dp(4.0f) + size) - i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.s = staticLayout3;
        this.v = staticLayout3.getLineCount() <= 0 ? this.s.getLineLeft(0) : 0.0f;
        this.w = this.s.getLineCount() <= 0 ? this.s.getLineWidth(0) : 0.0f;
        this.x = org.telegram.ui.Components.y5.update(0, this, this.x, this.s);
        String str22 = "";
        if (this.J.hasHighlightedWords()) {
        }
        if (i13 == 1) {
        }
        CharSequence replace22 = this.J.getMusicAuthor().replace('\n', ' ');
        highlightText = AndroidUtilities.highlightText(replace22, this.J.highlightedWords, c6Var);
        if (highlightText != null) {
        }
        if (i13 == 1) {
        }
        if (i13 == 1) {
        }
        if (this.J.getDuration() > 0.0d) {
        }
        this.D = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace22, textPaint2, size - textPaint2.measureText(str22), TextUtils.TruncateAt.END)).append((CharSequence) str22), textPaint2, size + AndroidUtilities.dp(f9), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.B = this.D.getLineCount() > 0 ? this.D.getLineLeft(0) : 0.0f;
        this.C = this.D.getLineCount() > 0 ? this.D.getLineWidth(0) : 0.0f;
        this.A = org.telegram.ui.Components.y5.update(0, this, this.A, this.D);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f) + (this.I != null ? AndroidUtilities.dp(18.0f) : 0) + (this.c ? 1 : 0));
        if (LocaleController.isRTL) {
        }
        int dp322 = AndroidUtilities.dp(f9) + B;
        this.h = dp322;
        int dp2222 = AndroidUtilities.dp(6.0f);
        this.n = dp2222;
        this.P.q(dp322, dp2222, AndroidUtilities.dp(48.0f) + B, AndroidUtilities.dp(50.0f));
        measureChildWithMargins(this.b, i10, 0, i11, 0);
        if (this.I == null) {
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.P.o(Math.min(1.0f, j10 / j11), true);
        if (this.f != 0) {
            if (this.O != 1) {
                g(false, true);
            }
        } else if (this.N != 4) {
            g(false, true);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.P.o(1.0f, true);
        g(false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0128 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int dp;
        int dp2;
        int i10;
        if (this.J == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x4 = (int) motionEvent.getX();
        int y8 = (int) motionEvent.getY();
        int dp3 = AndroidUtilities.dp(36.0f);
        boolean z11 = this.O >= 0 && x4 >= (dp2 = this.h + (dp = AndroidUtilities.dp(27.0f))) && x4 <= dp2 + dp3 && y8 >= (i10 = this.n + dp) && y8 <= i10 + dp3;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.P;
        if (action == 0) {
            if (z11) {
                this.e = true;
                radialProgress2.n(true, true);
                invalidate();
            } else if (this.K && radialProgress2.a.contains(x4, y8)) {
                requestDisallowInterceptTouchEvent(true);
                this.d = true;
                radialProgress2.n(true, false);
                invalidate();
            }
            z10 = true;
            radialProgress2.n(this.e, true);
            boolean z12 = !z10 || this.d;
            if (motionEvent.getAction() == 3) {
                return z12;
            }
            this.e = false;
            this.d = false;
            radialProgress2.n(false, false);
            radialProgress2.n(this.e, true);
            return false;
        }
        if (motionEvent.getAction() == 1) {
            if (this.e) {
                this.e = false;
                playSoundEffect(0);
                int i11 = this.O;
                int i12 = this.L;
                if (i11 == 0) {
                    this.O = 1;
                    radialProgress2.o(0.0f, false);
                    FileLoader.getInstance(i12).loadFile(this.J.getDocument(), this.J, 1, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i11 == 1) {
                    if (MediaController.getInstance().isPlayingMessage(this.J)) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                    }
                    this.O = 0;
                    FileLoader.getInstance(i12).cancelLoadFile(this.J.getDocument());
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            } else if (this.d) {
                this.d = false;
                playSoundEffect(0);
                a();
                invalidate();
            }
            requestDisallowInterceptTouchEvent(false);
        } else if (motionEvent.getAction() == 3) {
            requestDisallowInterceptTouchEvent(false);
            this.e = false;
            this.d = false;
            invalidate();
        } else if (motionEvent.getAction() == 2 && !z11 && this.e) {
            this.e = false;
            invalidate();
        }
        z10 = false;
        radialProgress2.n(this.e, true);
        if (z10) {
        }
        if (motionEvent.getAction() == 3) {
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.performAccessibilityAction(i10, bundle);
        }
        a();
        return true;
    }

    public void setCheckForButtonPress(boolean z10) {
        this.K = z10;
    }

    public void setEnterAnimationAlpha(float f9) {
        if (this.f0 != f9) {
            this.f0 = f9;
            invalidate();
        }
    }

    public void setGlobalGradientView(p00 p00Var) {
        this.g0 = p00Var;
    }

    public void setNeedPlayMessageListener(Utilities.CallbackReturn<MessageObject, Boolean> callbackReturn) {
        this.e0 = callbackReturn;
    }

    public f7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.r = AndroidUtilities.dp(9.0f);
        this.y = AndroidUtilities.dp(29.0f);
        this.E = AndroidUtilities.dp(29.0f);
        int i11 = UserConfig.selectedAccount;
        this.L = i11;
        this.b0 = true;
        this.c0 = 0.0f;
        this.f0 = 1.0f;
        this.V = c6Var;
        this.Q = i10;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.P = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.g6.ie, org.telegram.ui.ActionBar.g6.je, org.telegram.ui.ActionBar.g6.uc, org.telegram.ui.ActionBar.g6.vc);
        this.M = DownloadController.getInstance(i11).generateObserverTag();
        setWillNotDraw(false);
        hp hpVar = new hp(context, 22, c6Var);
        this.b = hpVar;
        hpVar.setVisibility(4);
        hpVar.b(-1, org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.k7);
        hpVar.setDrawUnchecked(false);
        hpVar.setDrawBackgroundAsArc(3);
        boolean z10 = LocaleController.isRTL;
        addView(hpVar, i7.f6.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 38.1f, 32.1f, z10 ? 6.0f : 0.0f, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.T = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new vs(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.U = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        if (c6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.d0 = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint3.setColor(c6Var.C0(org.telegram.ui.ActionBar.g6.G6));
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
