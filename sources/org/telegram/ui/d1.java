package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d1 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.j9 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final int F;
    public TL_iv.pageBlockAudio G;
    public TLRPC.Document H;
    public MessageObject I;
    public final d70 a;
    public final k4 b;
    public f3 c;
    public f3 d;
    public final RadialProgress2 e;
    public final org.telegram.ui.Components.wn0 f;
    public boolean h;
    public int n;
    public final int r;
    public int s;
    public String v;
    public f3 w;
    public StaticLayout x;
    public int y;

    public d1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.r = AndroidUtilities.dp(58.0f);
        this.a = d70Var;
        this.b = k4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.F = DownloadController.getInstance(((m4) d70Var).T).generateObserverTag();
        org.telegram.ui.Components.wn0 wn0Var = new org.telegram.ui.Components.wn0(this);
        this.f = wn0Var;
        wn0Var.h = new c1(this, 0);
    }

    private int getIconForCurrentState() {
        int i10 = this.D;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 3 ? 3 : 0;
    }

    public final void a(boolean z10) {
        int i10 = ((m4) this.a).T;
        String attachFileName = FileLoader.getAttachFileName(this.H);
        boolean exists = FileLoader.getInstance(i10).getPathToAttach(this.H, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.I);
            if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                this.D = 0;
            } else {
                this.D = 1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            if (FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.D = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    radialProgress2.o(fileProgress.floatValue(), z10);
                } else {
                    radialProgress2.o(0.0f, z10);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            } else {
                this.D = 2;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            }
        }
        b();
    }

    public final void b() {
        MessageObject messageObject;
        int i10;
        if (this.H == null || (messageObject = this.I) == null) {
            return;
        }
        org.telegram.ui.Components.wn0 wn0Var = this.f;
        if (!wn0Var.e) {
            wn0Var.i(messageObject.audioProgress);
        }
        if (!MediaController.getInstance().isPlayingMessage(this.I)) {
            i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= this.H.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.H.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i10 = (int) documentAttribute.duration;
                    break;
                }
                i11++;
            }
        } else {
            i10 = this.I.audioProgressSec;
        }
        String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
        String str = this.v;
        if (str == null || !str.equals(formatShortDuration)) {
            this.v = formatShortDuration;
            TextPaint textPaint = m4.a1;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        m4.a1.setColor(this.a.b());
        invalidate();
    }

    @Override // org.telegram.ui.Cells.j9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.w;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.c;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
        f3 f3Var3 = this.d;
        if (f3Var3 != null) {
            arrayList.add(f3Var3);
        }
    }

    public MessageObject getMessageObject() {
        return this.I;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.F;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        f3 f3Var = this.w;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.c;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
        f3 f3Var3 = this.d;
        if (f3Var3 != null) {
            f3Var3.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(((m4) this.a).T).removeLoadingFileObserver(this);
        f3 f3Var = this.w;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.c;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
        f3 f3Var3 = this.d;
        if (f3Var3 != null) {
            f3Var3.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.G == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.ie;
        int i11 = org.telegram.ui.ActionBar.g6.je;
        int i12 = org.telegram.ui.ActionBar.g6.uc;
        int i13 = org.telegram.ui.ActionBar.g6.vc;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.g6.Bd;
        d70 d70Var = this.a;
        ((m4) d70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.g6.w0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.y, this.A);
        this.f.b(canvas);
        canvas.restore();
        if (this.x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.B, AndroidUtilities.dp(6.0f) + this.A);
            this.x.draw(canvas);
            canvas.restore();
        }
        if (this.w != null) {
            canvas.save();
            this.w.s = AndroidUtilities.dp(54.0f) + this.B;
            this.w.v = this.A - AndroidUtilities.dp(16.0f);
            f3 f3Var = this.w;
            canvas.translate(f3Var.s, f3Var.v);
            m4.v(d70Var, canvas, this, 0);
            this.w.draw(canvas, this);
            canvas.restore();
            i15 = 1;
        }
        f3 f3Var2 = this.c;
        int i16 = this.r;
        if (f3Var2 != null) {
            canvas.save();
            f3 f3Var3 = this.c;
            int i17 = this.n;
            f3Var3.s = i17;
            f3Var3.v = i16;
            canvas.translate(i17, i16);
            m4.v(d70Var, canvas, this, i15);
            this.c.draw(canvas, this);
            canvas.restore();
            i15++;
        }
        if (this.d != null) {
            canvas.save();
            f3 f3Var4 = this.d;
            int i18 = this.n;
            f3Var4.s = i18;
            f3Var4.v = i16 + this.s;
            canvas.translate(i18, i16 + r5);
            m4.v(d70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.G, getMeasuredHeight());
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        a(true);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVAudio));
        if (this.w != null) {
            sb2.append(", ");
            sb2.append(this.w.d.getText());
        }
        if (this.c != null) {
            sb2.append(", ");
            sb2.append(this.c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.G;
        if (pageblockaudio != null) {
            if (pageblockaudio.level > 0) {
                this.n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(r0 * 14);
            } else {
                this.n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.B = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.C = dp4;
            int i13 = this.B;
            this.e.q(i13, dp4, i13 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.G;
            f3 q6 = m4.q(this.a, this, null, pageblockaudio2.caption.text, dp2, this.r, pageblockaudio2, this.b);
            this.c = q6;
            if (q6 != null) {
                int height = this.c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.s = height;
                dp = org.telegram.messenger.x3.C(8.0f, height, dp);
            }
            i12 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.G;
            f3 p10 = m4.p(this.a, this, null, pageblockaudio3.caption.credit, dp2, this.r + this.s, pageblockaudio3, this.b.C ? org.telegram.ui.Components.bw0.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
            this.d = p10;
            if (p10 != null) {
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.G.level <= 0) {
                i12 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.I.getMusicAuthor(false);
            String musicTitle = this.I.getMusicTitle(false);
            int C = org.telegram.messenger.x3.C(50.0f, this.B, dp3);
            this.y = C;
            int dp5 = (size - C) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.w = null;
                this.A = ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.C;
            } else {
                SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) ? !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor) : new SpannableStringBuilder(a4.w.y(musicAuthor, " - ", musicTitle));
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.g6.O2, dp5, TextUtils.TruncateAt.END);
                f3 f3Var = new f3(this.a);
                this.w = f3Var;
                f3Var.d = new StaticLayout(ellipsize, m4.a1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.w.n = this.G;
                this.A = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.C;
            }
            this.f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.e.o(Math.min(1.0f, j10 / j11), true);
        if (this.D != 3) {
            a(true);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.e.o(1.0f, true);
        a(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r1 <= (org.telegram.messenger.AndroidUtilities.dp(48.0f) + r0)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        r14.E = 1;
        invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r14.D == 0) goto L23;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        if (this.f.f(motionEvent.getX() - this.y, motionEvent.getY() - this.A, motionEvent.getAction())) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (this.D != -1) {
                if (x4 >= this.B && x4 <= AndroidUtilities.dp(48.0f) + r2) {
                    if (y8 >= this.C) {
                    }
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.E == 1) {
                this.E = 0;
                playSoundEffect(0);
                int i10 = ((m4) this.a).T;
                int i11 = this.D;
                k4 k4Var = this.b;
                RadialProgress2 radialProgress2 = this.e;
                if (i11 == 0) {
                    if (k4Var != null && MediaController.getInstance().setPlaylist(k4Var.v, this.I, 0L, false, null)) {
                        this.D = 1;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i11 == 1) {
                    if (MediaController.getInstance().lambda$startAudioAgain$7(this.I)) {
                        this.D = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i11 == 2) {
                    radialProgress2.o(0.0f, false);
                    FileLoader.getInstance(i10).loadFile(this.H, k4Var == null ? null : k4Var.A, 1, 1);
                    this.D = 3;
                    radialProgress2.setIcon(getIconForCurrentState(), true, true);
                    invalidate();
                } else if (i11 == 3) {
                    FileLoader.getInstance(i10).cancelLoadFile(this.H);
                    this.D = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            }
        } else if (motionEvent.getAction() == 3) {
            this.E = 0;
        }
        if (this.E == 0) {
            if (!m4.l(this.a, this.b, motionEvent, this, this.c, this.n, this.r)) {
                if (!m4.l(this.a, this.b, motionEvent, this, this.d, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
