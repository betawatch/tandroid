package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ps;
import org.telegram.ui.i10;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public static final /* synthetic */ int H = 0;
    public final int A;
    public int B;
    public int C;
    public final RadialProgress2 D;
    public final int E;
    public final SpannableStringBuilder F;
    public final org.telegram.ui.ActionBar.c6 G;
    public boolean a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public org.telegram.ui.Components.p5 f;
    public StaticLayout h;
    public final int n;
    public org.telegram.ui.Components.p5 r;
    public StaticLayout s;
    public final ImageView v;
    public MessageObject w;
    public boolean x;
    public final int y;

    public x(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = AndroidUtilities.dp(9.0f);
        this.n = AndroidUtilities.dp(29.0f);
        int i11 = UserConfig.selectedAccount;
        this.y = i11;
        setWillNotDraw(false);
        this.G = c6Var;
        this.E = i10;
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.m6, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 1, -1));
        addView(imageView, h7.z5.d(42, 42.0f, (LocaleController.isRTL ? 3 : 5) | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new ag.l2(10));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.D = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.g6.ie, org.telegram.ui.ActionBar.g6.je, org.telegram.ui.ActionBar.g6.uc, org.telegram.ui.ActionBar.g6.vc);
        this.A = DownloadController.getInstance(i11).generateObserverTag();
        setFocusable(true);
        if (i10 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.F = spannableStringBuilder;
            spannableStringBuilder.setSpan(new ps(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        int i10 = this.B;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i10 = this.C;
        if (i10 < 0) {
            return 4;
        }
        return i10 == 0 ? 2 : 3;
    }

    public final void a() {
        int i10 = this.B;
        int i11 = this.y;
        RadialProgress2 radialProgress2 = this.D;
        if (i10 == 0) {
            if (this.C == 0) {
                FileLoader.getInstance(i11).loadFile(this.w.getDocument(), this.w, 1, 0);
            }
            if (MediaController.getInstance().findMessageInPlaylistAndPlay(this.w)) {
                if (this.b == 2 && this.C != 1) {
                    this.C = 1;
                    radialProgress2.o(0.0f, false);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.B = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.w)) {
                this.B = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 2) {
            radialProgress2.o(0.0f, false);
            FileLoader.getInstance(i11).loadFile(this.w.getDocument(), this.w, 1, 0);
            this.B = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (i10 == 4) {
            FileLoader.getInstance(i11).cancelLoadFile(this.w.getDocument());
            this.B = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(boolean z10, boolean z11) {
        String fileName = this.w.getFileName();
        File file = null;
        if (!TextUtils.isEmpty(this.w.messageOwner.attachPath)) {
            File file2 = new File(this.w.messageOwner.attachPath);
            if (file2.exists()) {
                file = file2;
            }
        }
        int i10 = this.y;
        if (file == null) {
            file = FileLoader.getInstance(i10).getPathToAttach(this.w.getDocument());
        }
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        if (file.exists() && file.length() == 0) {
            file.delete();
        }
        boolean exists = file.exists();
        if (!SharedConfig.streamMedia || ((int) this.w.getDialogId()) == 0) {
            this.C = -1;
        } else {
            this.b = exists ? 1 : 2;
            exists = true;
        }
        int i11 = this.b;
        RadialProgress2 radialProgress2 = this.D;
        if (i11 == 0) {
            if (exists) {
                DownloadController.getInstance(i10).removeLoadingFileObserver(this);
                boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.w);
                if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.B = 0;
                } else {
                    this.B = 1;
                }
                radialProgress2.o(1.0f, z11);
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
                invalidate();
                return;
            }
            DownloadController.getInstance(i10).addLoadingFileObserver(fileName, this);
            if (FileLoader.getInstance(i10).isLoadingFile(fileName)) {
                this.B = 4;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    radialProgress2.o(fileProgress.floatValue(), z11);
                } else {
                    radialProgress2.o(0.0f, z11);
                }
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            } else {
                this.B = 2;
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            }
            invalidate();
            return;
        }
        radialProgress2.e.setColor(org.telegram.ui.ActionBar.g6.v0(this.w.isOutOwner() ? org.telegram.ui.ActionBar.g6.Nb : org.telegram.ui.ActionBar.g6.ie, this.G));
        boolean isPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.w);
        if (!isPlayingMessage2 || (isPlayingMessage2 && MediaController.getInstance().isMessagePaused())) {
            this.B = 0;
        } else {
            this.B = 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
        if (this.b == 1) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            this.C = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        DownloadController.getInstance(i10).addLoadingFileObserver(fileName, this.w, this);
        if (!FileLoader.getInstance(i10).isLoadingFile(fileName)) {
            this.C = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        this.C = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
        Float fileProgress2 = ImageLoader.getInstance().getFileProgress(fileName);
        if (fileProgress2 != null) {
            radialProgress2.o(fileProgress2.floatValue(), z11);
        } else {
            radialProgress2.o(0.0f, z11);
        }
    }

    public MessageObject getMessageObject() {
        return this.w;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D.e();
        this.f = org.telegram.ui.Components.t5.update(0, this, this.f, this.h);
        this.r = org.telegram.ui.Components.t5.update(0, this, this.r, this.s);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D.f();
        DownloadController.getInstance(this.y).removeLoadingFileObserver(this);
        org.telegram.ui.Components.t5.release(this, this.f);
        org.telegram.ui.Components.t5.release(this, this.r);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint T0;
        StaticLayout staticLayout = this.h;
        int i10 = 0;
        ImageView imageView = this.v;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : AndroidUtilities.leftBaseline) + ((LocaleController.isRTL && imageView.getVisibility() == 0) ? AndroidUtilities.dp(32.0f) : 0), this.e);
            this.h.draw(canvas);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.h, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.s;
        org.telegram.ui.ActionBar.c6 c6Var = this.G;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.g6.g3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
            canvas.save();
            int dp = AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : AndroidUtilities.leftBaseline);
            if (LocaleController.isRTL && imageView.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(32.0f);
            }
            canvas.translate(dp + i10, this.n);
            this.s.draw(canvas);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.s, this.r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.id, c6Var);
        RadialProgress2 radialProgress2 = this.D;
        radialProgress2.d = v02;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (!this.x || (T0 = org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var)) == null) {
            return;
        }
        if (LocaleController.isRTL) {
            canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getHeight(), T0);
        } else {
            canvas.drawRect(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getHeight() - 1, getWidth(), getHeight(), T0);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        b(true, z10);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.w.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.w.getMusicAuthor(), this.w.getMusicTitle()));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.s.getText()));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.c6 c6Var = this.G;
        this.s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(48.0f);
        try {
            CharSequence ellipsize = TextUtils.ellipsize(this.w.getMusicTitle().replace('\n', ' '), org.telegram.ui.ActionBar.g6.f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.g6.f3.measureText(r0)), size), TextUtils.TruncateAt.END);
            CharSequence highlightText = AndroidUtilities.highlightText(ellipsize, this.w.highlightedWords, c6Var);
            StaticLayout staticLayout = new StaticLayout(highlightText == null ? ellipsize : highlightText, org.telegram.ui.ActionBar.g6.f3, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f = org.telegram.ui.Components.t5.update(0, this, this.f, staticLayout);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        try {
            CharSequence replace = this.w.getMusicAuthor().replace('\n', ' ');
            if (this.E == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.F).append(' ').append(i10.d(this.w, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, org.telegram.ui.ActionBar.g6.g3, size, TextUtils.TruncateAt.END);
            CharSequence highlightText2 = AndroidUtilities.highlightText(ellipsize2, this.w.highlightedWords, c6Var);
            StaticLayout staticLayout2 = new StaticLayout(highlightText2 == null ? ellipsize2 : highlightText2, org.telegram.ui.ActionBar.g6.g3, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout2;
            this.r = org.telegram.ui.Components.t5.update(0, this, this.r, staticLayout2);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
        int B = LocaleController.isRTL ? org.telegram.messenger.y1.B(8.0f, View.MeasureSpec.getSize(i10), AndroidUtilities.dp(52.0f)) : AndroidUtilities.dp(8.0f);
        int dp = AndroidUtilities.dp(4.0f) + B;
        this.c = dp;
        int dp2 = AndroidUtilities.dp(6.0f);
        this.d = dp2;
        this.D.q(dp, dp2, AndroidUtilities.dp(48.0f) + B, AndroidUtilities.dp(50.0f));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.D.o(Math.min(1.0f, j10 / j11), true);
        if (this.b != 0) {
            if (this.C != 1) {
                b(false, true);
            }
        } else if (this.B != 4) {
            b(false, true);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.D.o(1.0f, true);
        b(false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int dp;
        int dp2;
        int i10;
        if (this.w == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x8 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int dp3 = AndroidUtilities.dp(36.0f);
        boolean z10 = true;
        boolean z11 = this.C >= 0 && x8 >= (dp2 = this.c + (dp = AndroidUtilities.dp(27.0f))) && x8 <= dp2 + dp3 && y10 >= (i10 = this.d + dp) && y10 <= i10 + dp3;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.D;
        if (action == 0) {
            if (z11) {
                this.a = true;
                radialProgress2.n(true, true);
                invalidate();
                if (motionEvent.getAction() == 3) {
                    return z10;
                }
                this.a = false;
                return false;
            }
        } else if (this.a) {
            if (motionEvent.getAction() == 1) {
                this.a = false;
                playSoundEffect(0);
                int i11 = this.C;
                int i12 = this.y;
                if (i11 == 0) {
                    this.C = 1;
                    radialProgress2.o(0.0f, false);
                    FileLoader.getInstance(i12).loadFile(this.w.getDocument(), this.w, 3, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i11 == 1) {
                    if (MediaController.getInstance().isPlayingMessage(this.w)) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                    }
                    this.C = 0;
                    FileLoader.getInstance(i12).cancelLoadFile(this.w.getDocument());
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.a = false;
                invalidate();
            } else if (motionEvent.getAction() == 2 && !z11) {
                this.a = false;
                invalidate();
            }
            radialProgress2.n(this.a, true);
        }
        z10 = false;
        if (motionEvent.getAction() == 3) {
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
