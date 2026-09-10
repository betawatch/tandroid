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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b1 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.r9 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public TL_iv.pageBlockAudio K;
    public TLRPC.Document L;
    public MessageObject M;
    public final t70 a;
    public final h4 b;
    public c3 c;
    public c3 d;
    public final RadialProgress2 e;
    public final org.telegram.ui.Components.ko0 f;
    public boolean h;
    public int n;
    public final int r;
    public int s;
    public String v;
    public c3 w;
    public StaticLayout x;
    public int y;

    public b1(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.r = AndroidUtilities.dp(58.0f);
        this.a = t70Var;
        this.b = h4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.J = DownloadController.getInstance(((j4) t70Var).X).generateObserverTag();
        org.telegram.ui.Components.ko0 ko0Var = new org.telegram.ui.Components.ko0(this);
        this.f = ko0Var;
        ko0Var.h = new a1(this, 0);
    }

    private int getIconForCurrentState() {
        int i10 = this.H;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 3 ? 3 : 0;
    }

    public final void a(boolean z10) {
        int i10 = ((j4) this.a).X;
        String attachFileName = FileLoader.getAttachFileName(this.L);
        boolean exists = FileLoader.getInstance(i10).getPathToAttach(this.L, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.M);
            if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                this.H = 0;
            } else {
                this.H = 1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            if (FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.H = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    radialProgress2.o(fileProgress.floatValue(), z10);
                } else {
                    radialProgress2.o(0.0f, z10);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            } else {
                this.H = 2;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            }
        }
        b();
    }

    public final void b() {
        MessageObject messageObject;
        int i10;
        if (this.L == null || (messageObject = this.M) == null) {
            return;
        }
        org.telegram.ui.Components.ko0 ko0Var = this.f;
        if (!ko0Var.e) {
            ko0Var.i(messageObject.audioProgress);
        }
        if (!MediaController.getInstance().isPlayingMessage(this.M)) {
            i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= this.L.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.L.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i10 = (int) documentAttribute.duration;
                    break;
                }
                i11++;
            }
        } else {
            i10 = this.M.audioProgressSec;
        }
        String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
        String str = this.v;
        if (str == null || !str.equals(formatShortDuration)) {
            this.v = formatShortDuration;
            TextPaint textPaint = j4.e1;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        j4.e1.setColor(this.a.b());
        invalidate();
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.w;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.c;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
        c3 c3Var3 = this.d;
        if (c3Var3 != null) {
            arrayList.add(c3Var3);
        }
    }

    public MessageObject getMessageObject() {
        return this.M;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.J;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        c3 c3Var = this.w;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.c;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
        c3 c3Var3 = this.d;
        if (c3Var3 != null) {
            c3Var3.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(((j4) this.a).X).removeLoadingFileObserver(this);
        c3 c3Var = this.w;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.c;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
        c3 c3Var3 = this.d;
        if (c3Var3 != null) {
            c3Var3.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.K == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.ie;
        int i11 = org.telegram.ui.ActionBar.j6.je;
        int i12 = org.telegram.ui.ActionBar.j6.uc;
        int i13 = org.telegram.ui.ActionBar.j6.vc;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.j6.Bd;
        t70 t70Var = this.a;
        ((j4) t70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.y, this.E);
        this.f.b(canvas);
        canvas.restore();
        if (this.x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.F, AndroidUtilities.dp(6.0f) + this.E);
            this.x.draw(canvas);
            canvas.restore();
        }
        if (this.w != null) {
            canvas.save();
            this.w.s = AndroidUtilities.dp(54.0f) + this.F;
            this.w.v = this.E - AndroidUtilities.dp(16.0f);
            c3 c3Var = this.w;
            canvas.translate(c3Var.s, c3Var.v);
            j4.v(t70Var, canvas, this, 0);
            this.w.draw(canvas, this);
            canvas.restore();
            i15 = 1;
        }
        c3 c3Var2 = this.c;
        int i16 = this.r;
        if (c3Var2 != null) {
            canvas.save();
            c3 c3Var3 = this.c;
            int i17 = this.n;
            c3Var3.s = i17;
            c3Var3.v = i16;
            canvas.translate(i17, i16);
            j4.v(t70Var, canvas, this, i15);
            this.c.draw(canvas, this);
            canvas.restore();
            i15++;
        }
        if (this.d != null) {
            canvas.save();
            c3 c3Var4 = this.d;
            int i18 = this.n;
            c3Var4.s = i18;
            c3Var4.v = i16 + this.s;
            canvas.translate(i18, i16 + r5);
            j4.v(t70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        j4.u(canvas, t70Var, this.K, getMeasuredHeight());
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
        TL_iv.pageBlockAudio pageblockaudio = this.K;
        if (pageblockaudio != null) {
            if (pageblockaudio.level > 0) {
                this.n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(r0 * 14);
            } else {
                this.n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.F = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.G = dp4;
            int i13 = this.F;
            this.e.q(i13, dp4, i13 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.K;
            c3 q6 = j4.q(this.a, this, null, pageblockaudio2.caption.text, dp2, this.r, pageblockaudio2, this.b);
            this.c = q6;
            if (q6 != null) {
                int height = this.c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.s = height;
                dp = org.telegram.messenger.a2.C(8.0f, height, dp);
            }
            i12 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.K;
            c3 p5 = j4.p(this.a, this, null, pageblockaudio3.caption.credit, dp2, this.r + this.s, pageblockaudio3, this.b.G ? org.telegram.ui.Components.uw0.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
            this.d = p5;
            if (p5 != null) {
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.K.level <= 0) {
                i12 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.M.getMusicAuthor(false);
            String musicTitle = this.M.getMusicTitle(false);
            int C = org.telegram.messenger.a2.C(50.0f, this.F, dp3);
            this.y = C;
            int dp5 = (size - C) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.w = null;
                this.E = ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            } else {
                SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) ? !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor) : new SpannableStringBuilder(a4.a.C(musicAuthor, " - ", musicTitle));
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.s51(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.j6.O2, dp5, TextUtils.TruncateAt.END);
                c3 c3Var = new c3(this.a);
                this.w = c3Var;
                c3Var.d = new StaticLayout(ellipsize, j4.e1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.w.n = this.K;
                this.E = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            }
            this.f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
        this.e.o(Math.min(1.0f, j3 / j10), true);
        if (this.H != 3) {
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
    
        r14.I = 1;
        invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r14.H == 0) goto L23;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (this.f.f(motionEvent.getX() - this.y, motionEvent.getY() - this.E, motionEvent.getAction())) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (this.H != -1) {
                if (x10 >= this.F && x10 <= AndroidUtilities.dp(48.0f) + r2) {
                    if (y3 >= this.G) {
                    }
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.I == 1) {
                this.I = 0;
                playSoundEffect(0);
                int i10 = ((j4) this.a).X;
                int i11 = this.H;
                h4 h4Var = this.b;
                RadialProgress2 radialProgress2 = this.e;
                if (i11 == 0) {
                    if (h4Var != null && MediaController.getInstance().setPlaylist(h4Var.v, this.M, 0L, false, null)) {
                        this.H = 1;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i11 == 1) {
                    if (MediaController.getInstance().lambda$startAudioAgain$7(this.M)) {
                        this.H = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i11 == 2) {
                    radialProgress2.o(0.0f, false);
                    FileLoader.getInstance(i10).loadFile(this.L, h4Var == null ? null : h4Var.E, 1, 1);
                    this.H = 3;
                    radialProgress2.setIcon(getIconForCurrentState(), true, true);
                    invalidate();
                } else if (i11 == 3) {
                    FileLoader.getInstance(i10).cancelLoadFile(this.L);
                    this.H = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            }
        } else if (motionEvent.getAction() == 3) {
            this.I = 0;
        }
        if (this.I == 0) {
            if (!j4.l(this.a, this.b, motionEvent, this, this.c, this.n, this.r)) {
                if (!j4.l(this.a, this.b, motionEvent, this, this.d, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
