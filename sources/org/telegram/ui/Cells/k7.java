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
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.tp;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class k7 extends FrameLayout implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.u5 E;
    public float F;
    public float G;
    public StaticLayout H;
    public int I;
    public org.telegram.ui.Components.u5 J;
    public float K;
    public float L;
    public StaticLayout M;
    public MessageObject N;
    public boolean O;
    public final int P;
    public final int Q;
    public int R;
    public int S;
    public final RadialProgress2 T;
    public final int U;
    public StaticLayout V;
    public int W;
    public final SpannableStringBuilder a;
    public final TextPaint a0;
    public final tp b;
    public final TextPaint b0;
    public boolean c;
    public final org.telegram.ui.ActionBar.f6 c0;
    public boolean d;
    public boolean d0;
    public boolean e;
    public float e0;
    public int f;
    public boolean f0;
    public float g0;
    public int h;
    public final TextPaint h0;
    public Utilities.CallbackReturn i0;
    public float j0;
    public a10 k0;
    public int n;
    public final int r;
    public StaticLayout s;
    public float v;
    public float w;
    public org.telegram.ui.Components.u5 x;
    public int y;

    public k7(Context context) {
        this(context, 0, null);
    }

    private int getIconForCurrentState() {
        int i10 = this.R;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i10 = this.S;
        if (i10 < 0) {
            return 4;
        }
        return i10 == 0 ? 2 : 3;
    }

    public void a() {
        int i10 = this.R;
        int i11 = this.P;
        RadialProgress2 radialProgress2 = this.T;
        if (i10 == 0) {
            if (this.S == 0) {
                this.N.putInDownloadsStore = true;
                FileLoader.getInstance(i11).loadFile(this.N.getDocument(), this.N, 1, 0);
            }
            if (d(this.N)) {
                if (this.f == 2 && this.S != 1) {
                    this.S = 1;
                    radialProgress2.o(0.0f, false);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.R = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.N)) {
                this.R = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 2) {
            radialProgress2.o(0.0f, false);
            this.N.putInDownloadsStore = true;
            FileLoader.getInstance(i11).loadFile(this.N.getDocument(), this.N, 1, 0);
            this.R = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (i10 == 4) {
            FileLoader.getInstance(i11).cancelLoadFile(this.N.getDocument());
            this.R = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        StaticLayout staticLayout;
        org.telegram.ui.ActionBar.f6 f6Var = this.c0;
        if (this.U == 1) {
            this.a0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
        }
        StaticLayout staticLayout2 = this.V;
        int i10 = this.r;
        int i11 = 0;
        if (staticLayout2 != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? 0 : this.W), i10);
            this.V.draw(canvas);
            canvas.restore();
        }
        if (this.s != null) {
            int alpha = org.telegram.ui.ActionBar.j6.f3.getAlpha();
            float f7 = this.g0;
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f3.setAlpha((int) (alpha * f7));
            }
            canvas.save();
            int dp = AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline);
            if (LocaleController.isRTL && (staticLayout = this.V) != null) {
                i11 = staticLayout.getWidth() + AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 4.0f);
            }
            canvas.translate(((dp + i11) + (LocaleController.isRTL ? this.s.getWidth() - this.w : 0.0f)) - this.v, i10);
            this.s.draw(canvas);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.s, this.x, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.g0 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f3.setAlpha(alpha);
            }
        }
        if (this.M != null) {
            this.b0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            canvas.save();
            canvas.translate((AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? this.M.getWidth() - this.L : 0.0f)) - this.K, this.I);
            this.M.draw(canvas);
            canvas.restore();
        }
        if (this.H != null) {
            org.telegram.ui.ActionBar.j6.g3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
            int alpha2 = org.telegram.ui.ActionBar.j6.g3.getAlpha();
            float f10 = this.g0;
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.j6.g3.setAlpha((int) (alpha2 * f10));
            }
            canvas.save();
            canvas.translate((AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? this.H.getWidth() - this.G : 0.0f)) - this.F, this.y);
            this.H.draw(canvas);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.H, this.E, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.g0 != 1.0f) {
                org.telegram.ui.ActionBar.j6.g3.setAlpha(alpha2);
            }
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(this.d ? org.telegram.ui.ActionBar.j6.jd : org.telegram.ui.ActionBar.j6.id, f6Var);
        RadialProgress2 radialProgress2 = this.T;
        radialProgress2.d = v02;
        radialProgress2.H = this.g0;
        radialProgress2.draw(canvas);
        if (this.c) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - AndroidUtilities.dp(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
            } else {
                canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z10 = this.d0;
        if (z10 || this.e0 != 0.0f) {
            if (z10) {
                float f7 = this.e0;
                if (f7 != 1.0f) {
                    this.e0 = f7 + 0.10666667f;
                    invalidate();
                    this.e0 = Utilities.clamp(this.e0, 1.0f, 0.0f);
                    int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth();
                    int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight()) >> 1;
                    canvas.save();
                    float f10 = this.e0;
                    canvas.scale(f10, f10, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                    Drawable drawable = org.telegram.ui.ActionBar.j6.Z0;
                    drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() + measuredHeight);
                    org.telegram.ui.ActionBar.j6.Z0.draw(canvas);
                    canvas.restore();
                }
            }
            if (!z10) {
                float f11 = this.e0;
                if (f11 != 0.0f) {
                    this.e0 = f11 - 0.10666667f;
                    invalidate();
                }
            }
            this.e0 = Utilities.clamp(this.e0, 1.0f, 0.0f);
            int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth();
            int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight()) >> 1;
            canvas.save();
            float f102 = this.e0;
            canvas.scale(f102, f102, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
            Drawable drawable2 = org.telegram.ui.ActionBar.j6.Z0;
            drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() + measuredHeight2);
            org.telegram.ui.ActionBar.j6.Z0.draw(canvas);
            canvas.restore();
        }
    }

    public boolean d(MessageObject messageObject) {
        Utilities.CallbackReturn callbackReturn = this.i0;
        return callbackReturn != null && ((Boolean) callbackReturn.run(messageObject)).booleanValue();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g(false, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.f0;
        if (z10) {
            float f7 = this.g0;
            if (f7 != 1.0f) {
                this.g0 = f7 + 0.10666667f;
                invalidate();
                this.g0 = Utilities.clamp(this.g0, 1.0f, 0.0f);
                if (this.j0 != 1.0f || this.k0 == null) {
                    b(canvas);
                    c(canvas);
                    super.dispatchDraw(canvas);
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.j0) * 255.0f), 31);
                this.k0.setViewType(4);
                this.k0.e();
                this.k0.h();
                this.k0.draw(canvas);
                canvas.restore();
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.j0 * 255.0f), 31);
                b(canvas);
                super.dispatchDraw(canvas);
                c(canvas);
                canvas.restore();
                return;
            }
        }
        if (!z10) {
            float f10 = this.g0;
            if (f10 != 0.0f) {
                this.g0 = f10 - 0.10666667f;
                invalidate();
            }
        }
        this.g0 = Utilities.clamp(this.g0, 1.0f, 0.0f);
        if (this.j0 != 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        tp tpVar = this.b;
        if (tpVar.getVisibility() != 0) {
            tpVar.setVisibility(0);
        }
        tpVar.a(z10, z11);
    }

    public final void f(MessageObject messageObject, boolean z10) {
        this.c = z10;
        this.N = messageObject;
        TLRPC.Document document = messageObject.getDocument();
        TLRPC.PhotoSize closestPhotoSizeWithSize = document != null ? FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 360) : null;
        boolean z11 = closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.T;
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
        String fileName = this.N.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        MessageObject messageObject = this.N;
        boolean z12 = messageObject.attachPathExists || messageObject.mediaExists;
        if (SharedConfig.streamMedia && messageObject.isMusic() && ((int) this.N.getDialogId()) != 0) {
            this.f = z12 ? 1 : 2;
            z12 = true;
        } else {
            this.f = 0;
            this.S = -1;
        }
        int i10 = this.f;
        int i11 = this.P;
        RadialProgress2 radialProgress2 = this.T;
        if (i10 == 0) {
            if (z12) {
                DownloadController.getInstance(i11).removeLoadingFileObserver(this);
                boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.N);
                if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.R = 0;
                } else {
                    this.R = 1;
                }
                radialProgress2.o(1.0f, z11);
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
                invalidate();
                return;
            }
            DownloadController.getInstance(i11).addLoadingFileObserver(fileName, this.N, this);
            if (FileLoader.getInstance(i11).isLoadingFile(fileName)) {
                this.R = 4;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    radialProgress2.o(fileProgress.floatValue(), z11);
                } else {
                    radialProgress2.o(0.0f, z11);
                }
            } else {
                this.R = 2;
                radialProgress2.o(0.0f, z11);
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
            return;
        }
        radialProgress2.e.setColor(org.telegram.ui.ActionBar.j6.v0(this.N.isOutOwner() ? org.telegram.ui.ActionBar.j6.Nb : org.telegram.ui.ActionBar.j6.ie, this.c0));
        boolean isPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.N);
        if (!isPlayingMessage2 || (isPlayingMessage2 && MediaController.getInstance().isMessagePaused())) {
            this.R = 0;
        } else {
            this.R = 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
        if (this.f == 1) {
            DownloadController.getInstance(i11).removeLoadingFileObserver(this);
            this.S = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        DownloadController.getInstance(i11).addLoadingFileObserver(fileName, this.N, this);
        if (!FileLoader.getInstance(i11).isLoadingFile(fileName)) {
            this.S = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        this.S = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
        Float fileProgress2 = ImageLoader.getInstance().getFileProgress(fileName);
        if (fileProgress2 != null) {
            radialProgress2.o(fileProgress2.floatValue(), z11);
        } else {
            radialProgress2.o(0.0f, z11);
        }
    }

    public MessageObject getMessage() {
        return this.N;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.Q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T.e();
        g(false, false);
        int i10 = this.P;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        this.x = org.telegram.ui.Components.y5.update(0, this, this.x, this.s);
        this.E = org.telegram.ui.Components.y5.update(0, this, this.E, this.H);
        this.J = org.telegram.ui.Components.y5.update(0, this, this.J, this.M);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.P;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.T.f();
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        org.telegram.ui.Components.y5.release(this, this.x);
        org.telegram.ui.Components.y5.release(this, this.E);
        org.telegram.ui.Components.y5.release(this, this.J);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        g(true, z10);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.N.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.N.getMusicAuthor(), this.N.getMusicTitle()));
        } else if (this.s != null && this.H != null) {
            accessibilityNodeInfo.setText(((Object) this.s.getText()) + ", " + ((Object) this.H.getText()));
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
        float f7;
        CharSequence d;
        CharSequence highlightText;
        CharSequence highlightText2;
        TextPaint textPaint;
        this.H = null;
        this.s = null;
        this.M = null;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(28.0f);
        TextPaint textPaint2 = this.a0;
        int i13 = this.U;
        if (i13 == 1) {
            String stringForMessageListDate = LocaleController.stringForMessageListDate(this.N.messageOwner.date);
            int ceil = (int) Math.ceil(textPaint2.measureText(stringForMessageListDate));
            this.V = t1.u2(stringForMessageListDate, textPaint2, ceil, ceil, 0, 1);
            this.W = AndroidUtilities.dp(20.0f) + ((size - ceil) - AndroidUtilities.dp(8.0f));
            i12 = AndroidUtilities.dp(12.0f) + ceil;
        } else {
            i12 = 0;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.c0;
        if (i13 == 1) {
            try {
                if (!this.N.isVoice()) {
                    if (this.N.isRoundVideo()) {
                    }
                }
                d = z10.d(this.N, true, 1, null);
                f7 = 4.0f;
                highlightText2 = AndroidUtilities.highlightText(d, this.N.highlightedWords, f6Var);
                if (highlightText2 != null) {
                    d = highlightText2;
                }
                textPaint = this.h0;
                if (textPaint != null) {
                    textPaint = org.telegram.ui.ActionBar.j6.f3;
                }
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(d, textPaint, size - i12, TextUtils.TruncateAt.END), textPaint, (AndroidUtilities.dp(4.0f) + size) - i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.s = staticLayout;
                this.v = staticLayout.getLineCount() <= 0 ? this.s.getLineLeft(0) : 0.0f;
                this.w = this.s.getLineCount() <= 0 ? this.s.getLineWidth(0) : 0.0f;
                this.x = org.telegram.ui.Components.y5.update(0, this, this.x, this.s);
            } catch (Exception e) {
                e = e;
                f7 = 4.0f;
                FileLog.e(e);
                String str = "";
                if (this.N.hasHighlightedWords()) {
                }
                if (i13 == 1) {
                }
                CharSequence replace = this.N.getMusicAuthor().replace('\n', ' ');
                highlightText = AndroidUtilities.highlightText(replace, this.N.highlightedWords, f6Var);
                if (highlightText != null) {
                }
                if (i13 == 1) {
                }
                if (i13 == 1) {
                }
                if (this.N.getDuration() > 0.0d) {
                }
                this.H = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace, textPaint2, size - textPaint2.measureText(str), TextUtils.TruncateAt.END)).append((CharSequence) str), textPaint2, size + AndroidUtilities.dp(f7), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.F = this.H.getLineCount() > 0 ? this.H.getLineLeft(0) : 0.0f;
                this.G = this.H.getLineCount() > 0 ? this.H.getLineWidth(0) : 0.0f;
                this.E = org.telegram.ui.Components.y5.update(0, this, this.E, this.H);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f) + (this.M != null ? AndroidUtilities.dp(18.0f) : 0) + (this.c ? 1 : 0));
                if (LocaleController.isRTL) {
                }
                int dp = AndroidUtilities.dp(f7) + r0;
                this.h = dp;
                int dp2 = AndroidUtilities.dp(6.0f);
                this.n = dp2;
                this.T.q(dp, dp2, AndroidUtilities.dp(48.0f) + r0, AndroidUtilities.dp(50.0f));
                measureChildWithMargins(this.b, i10, 0, i11, 0);
                if (this.M == null) {
                }
            }
            String str2 = "";
            if (this.N.hasHighlightedWords()) {
                CharSequence highlightText3 = AndroidUtilities.highlightText(TextUtils.isEmpty(this.N.messageOwner.message) ? "" : Emoji.replaceEmoji(this.N.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), org.telegram.ui.ActionBar.j6.o2.getFontMetricsInt(), false), this.N.highlightedWords, f6Var);
                if (highlightText3 != null) {
                    String str3 = this.N.highlightedWords.get(0);
                    TextPaint textPaint3 = this.b0;
                    StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(AndroidUtilities.ellipsizeCenterEnd(highlightText3, str3, size, textPaint3, 130), textPaint3, size, TextUtils.TruncateAt.END), textPaint3, AndroidUtilities.dp(f7) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.M = staticLayout2;
                    this.K = staticLayout2.getLineCount() > 0 ? this.M.getLineLeft(0) : 0.0f;
                    this.L = this.M.getLineCount() > 0 ? this.M.getLineWidth(0) : 0.0f;
                }
                this.J = org.telegram.ui.Components.y5.update(0, this, this.J, this.M);
            }
            if (i13 == 1) {
                try {
                    if (!this.N.isVoice()) {
                        if (this.N.isRoundVideo()) {
                        }
                    }
                    String formatDuration = AndroidUtilities.formatDuration((int) this.N.getDuration(), false);
                    if (i13 != 1) {
                        textPaint2 = org.telegram.ui.ActionBar.j6.g3;
                    }
                    this.H = new StaticLayout(TextUtils.ellipsize(formatDuration, textPaint2, size, TextUtils.TruncateAt.END), textPaint2, size + AndroidUtilities.dp(f7), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.F = this.H.getLineCount() > 0 ? this.H.getLineLeft(0) : 0.0f;
                    this.G = this.H.getLineCount() > 0 ? this.H.getLineWidth(0) : 0.0f;
                    this.E = org.telegram.ui.Components.y5.update(0, this, this.E, this.H);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f) + (this.M != null ? AndroidUtilities.dp(18.0f) : 0) + (this.c ? 1 : 0));
                int B = LocaleController.isRTL ? org.telegram.messenger.a2.B(8.0f, View.MeasureSpec.getSize(i10), AndroidUtilities.dp(52.0f)) : AndroidUtilities.dp(8.0f);
                int dp3 = AndroidUtilities.dp(f7) + B;
                this.h = dp3;
                int dp22 = AndroidUtilities.dp(6.0f);
                this.n = dp22;
                this.T.q(dp3, dp22, AndroidUtilities.dp(48.0f) + B, AndroidUtilities.dp(50.0f));
                measureChildWithMargins(this.b, i10, 0, i11, 0);
                if (this.M == null) {
                    this.y = AndroidUtilities.dp(29.0f);
                    return;
                } else {
                    this.I = AndroidUtilities.dp(29.0f);
                    this.y = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(29.0f);
                    return;
                }
            }
            CharSequence replace2 = this.N.getMusicAuthor().replace('\n', ' ');
            highlightText = AndroidUtilities.highlightText(replace2, this.N.highlightedWords, f6Var);
            if (highlightText != null) {
                replace2 = highlightText;
            }
            if (i13 == 1) {
                replace2 = new SpannableStringBuilder(replace2).append(' ').append((CharSequence) this.a).append(' ').append(z10.d(this.N, true, 1, null));
            }
            if (i13 == 1) {
                textPaint2 = org.telegram.ui.ActionBar.j6.g3;
            }
            if (this.N.getDuration() > 0.0d) {
                str2 = " • " + LocaleController.formatShortDuration((int) Math.ceil(this.N.getDuration()));
            }
            this.H = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace2, textPaint2, size - textPaint2.measureText(str2), TextUtils.TruncateAt.END)).append((CharSequence) str2), textPaint2, size + AndroidUtilities.dp(f7), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.F = this.H.getLineCount() > 0 ? this.H.getLineLeft(0) : 0.0f;
            this.G = this.H.getLineCount() > 0 ? this.H.getLineWidth(0) : 0.0f;
            this.E = org.telegram.ui.Components.y5.update(0, this, this.E, this.H);
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f) + (this.M != null ? AndroidUtilities.dp(18.0f) : 0) + (this.c ? 1 : 0));
            if (LocaleController.isRTL) {
            }
            int dp32 = AndroidUtilities.dp(f7) + B;
            this.h = dp32;
            int dp222 = AndroidUtilities.dp(6.0f);
            this.n = dp222;
            this.T.q(dp32, dp222, AndroidUtilities.dp(48.0f) + B, AndroidUtilities.dp(50.0f));
            measureChildWithMargins(this.b, i10, 0, i11, 0);
            if (this.M == null) {
            }
        }
        d = this.N.getMusicTitle().replace('\n', ' ');
        f7 = 4.0f;
        highlightText2 = AndroidUtilities.highlightText(d, this.N.highlightedWords, f6Var);
        if (highlightText2 != null) {
        }
        textPaint = this.h0;
        if (textPaint != null) {
        }
        StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(d, textPaint, size - i12, TextUtils.TruncateAt.END), textPaint, (AndroidUtilities.dp(4.0f) + size) - i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.s = staticLayout3;
        this.v = staticLayout3.getLineCount() <= 0 ? this.s.getLineLeft(0) : 0.0f;
        this.w = this.s.getLineCount() <= 0 ? this.s.getLineWidth(0) : 0.0f;
        this.x = org.telegram.ui.Components.y5.update(0, this, this.x, this.s);
        String str22 = "";
        if (this.N.hasHighlightedWords()) {
        }
        if (i13 == 1) {
        }
        CharSequence replace22 = this.N.getMusicAuthor().replace('\n', ' ');
        highlightText = AndroidUtilities.highlightText(replace22, this.N.highlightedWords, f6Var);
        if (highlightText != null) {
        }
        if (i13 == 1) {
        }
        if (i13 == 1) {
        }
        if (this.N.getDuration() > 0.0d) {
        }
        this.H = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace22, textPaint2, size - textPaint2.measureText(str22), TextUtils.TruncateAt.END)).append((CharSequence) str22), textPaint2, size + AndroidUtilities.dp(f7), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.F = this.H.getLineCount() > 0 ? this.H.getLineLeft(0) : 0.0f;
        this.G = this.H.getLineCount() > 0 ? this.H.getLineWidth(0) : 0.0f;
        this.E = org.telegram.ui.Components.y5.update(0, this, this.E, this.H);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f) + (this.M != null ? AndroidUtilities.dp(18.0f) : 0) + (this.c ? 1 : 0));
        if (LocaleController.isRTL) {
        }
        int dp322 = AndroidUtilities.dp(f7) + B;
        this.h = dp322;
        int dp2222 = AndroidUtilities.dp(6.0f);
        this.n = dp2222;
        this.T.q(dp322, dp2222, AndroidUtilities.dp(48.0f) + B, AndroidUtilities.dp(50.0f));
        measureChildWithMargins(this.b, i10, 0, i11, 0);
        if (this.M == null) {
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
        this.T.o(Math.min(1.0f, j3 / j10), true);
        if (this.f != 0) {
            if (this.S != 1) {
                g(false, true);
            }
        } else if (this.R != 4) {
            g(false, true);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.T.o(1.0f, true);
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
        if (this.N == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int dp3 = AndroidUtilities.dp(36.0f);
        boolean z11 = this.S >= 0 && x10 >= (dp2 = this.h + (dp = AndroidUtilities.dp(27.0f))) && x10 <= dp2 + dp3 && y3 >= (i10 = this.n + dp) && y3 <= i10 + dp3;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.T;
        if (action == 0) {
            if (z11) {
                this.e = true;
                radialProgress2.n(true, true);
                invalidate();
            } else if (this.O && radialProgress2.a.contains(x10, y3)) {
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
                int i11 = this.S;
                int i12 = this.P;
                if (i11 == 0) {
                    this.S = 1;
                    radialProgress2.o(0.0f, false);
                    FileLoader.getInstance(i12).loadFile(this.N.getDocument(), this.N, 1, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i11 == 1) {
                    if (MediaController.getInstance().isPlayingMessage(this.N)) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                    }
                    this.S = 0;
                    FileLoader.getInstance(i12).cancelLoadFile(this.N.getDocument());
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
        this.O = z10;
    }

    public void setEnterAnimationAlpha(float f7) {
        if (this.j0 != f7) {
            this.j0 = f7;
            invalidate();
        }
    }

    public void setGlobalGradientView(a10 a10Var) {
        this.k0 = a10Var;
    }

    public void setNeedPlayMessageListener(Utilities.CallbackReturn<MessageObject, Boolean> callbackReturn) {
        this.i0 = callbackReturn;
    }

    public k7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.r = AndroidUtilities.dp(9.0f);
        this.y = AndroidUtilities.dp(29.0f);
        this.I = AndroidUtilities.dp(29.0f);
        int i11 = UserConfig.selectedAccount;
        this.P = i11;
        this.f0 = true;
        this.g0 = 0.0f;
        this.j0 = 1.0f;
        this.c0 = f6Var;
        this.U = i10;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.T = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.j6.ie, org.telegram.ui.ActionBar.j6.je, org.telegram.ui.ActionBar.j6.uc, org.telegram.ui.ActionBar.j6.vc);
        this.Q = DownloadController.getInstance(i11).generateObserverTag();
        setWillNotDraw(false);
        tp tpVar = new tp(context, 22, f6Var);
        this.b = tpVar;
        tpVar.setVisibility(4);
        tpVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
        tpVar.setDrawUnchecked(false);
        tpVar.setDrawBackgroundAsArc(3);
        boolean z10 = LocaleController.isRTL;
        addView(tpVar, w7.a6.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 38.1f, 32.1f, z10 ? 6.0f : 0.0f, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.a0 = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new ht(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.b0 = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        if (f6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.h0 = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint3.setColor(f6Var.F0(org.telegram.ui.ActionBar.j6.G6));
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
