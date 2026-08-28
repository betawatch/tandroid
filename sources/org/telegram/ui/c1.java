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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c1 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.m9 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final int F;
    public TL_iv.pageBlockAudio G;
    public TLRPC.Document H;
    public MessageObject I;
    public final a70 a;
    public final j4 b;
    public e3 c;
    public e3 d;
    public final RadialProgress2 e;
    public final org.telegram.ui.Components.ln0 f;
    public boolean h;
    public int n;
    public final int r;
    public int s;
    public String v;
    public e3 w;
    public StaticLayout x;
    public int y;

    public c1(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.r = AndroidUtilities.dp(58.0f);
        this.a = a70Var;
        this.b = j4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.F = DownloadController.getInstance(((l4) a70Var).T).generateObserverTag();
        org.telegram.ui.Components.ln0 ln0Var = new org.telegram.ui.Components.ln0(this);
        this.f = ln0Var;
        ln0Var.h = new b1(this, 0);
    }

    private int getIconForCurrentState() {
        int i9 = this.D;
        if (i9 == 1) {
            return 1;
        }
        if (i9 == 2) {
            return 2;
        }
        return i9 == 3 ? 3 : 0;
    }

    public final void a(boolean z10) {
        int i9 = ((l4) this.a).T;
        String attachFileName = FileLoader.getAttachFileName(this.H);
        boolean exists = FileLoader.getInstance(i9).getPathToAttach(this.H, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            DownloadController.getInstance(i9).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.I);
            if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                this.D = 0;
            } else {
                this.D = 1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i9).addLoadingFileObserver(attachFileName, null, this);
            if (FileLoader.getInstance(i9).isLoadingFile(attachFileName)) {
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
        int i9;
        if (this.H == null || (messageObject = this.I) == null) {
            return;
        }
        org.telegram.ui.Components.ln0 ln0Var = this.f;
        if (!ln0Var.e) {
            ln0Var.i(messageObject.audioProgress);
        }
        if (!MediaController.getInstance().isPlayingMessage(this.I)) {
            i9 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= this.H.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.H.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i9 = (int) documentAttribute.duration;
                    break;
                }
                i10++;
            }
        } else {
            i9 = this.I.audioProgressSec;
        }
        String formatShortDuration = AndroidUtilities.formatShortDuration(i9);
        String str = this.v;
        if (str == null || !str.equals(formatShortDuration)) {
            this.v = formatShortDuration;
            TextPaint textPaint = l4.a1;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        l4.a1.setColor(this.a.b());
        invalidate();
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.w;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.c;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
        e3 e3Var3 = this.d;
        if (e3Var3 != null) {
            arrayList.add(e3Var3);
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
        e3 e3Var = this.w;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.c;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
        e3 e3Var3 = this.d;
        if (e3Var3 != null) {
            e3Var3.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(((l4) this.a).T).removeLoadingFileObserver(this);
        e3 e3Var = this.w;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.c;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
        e3 e3Var3 = this.d;
        if (e3Var3 != null) {
            e3Var3.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.G == null) {
            return;
        }
        int i9 = org.telegram.ui.ActionBar.f6.ie;
        int i10 = org.telegram.ui.ActionBar.f6.je;
        int i11 = org.telegram.ui.ActionBar.f6.uc;
        int i12 = org.telegram.ui.ActionBar.f6.vc;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i9, i10, i11, i12);
        int i13 = org.telegram.ui.ActionBar.f6.Bd;
        a70 a70Var = this.a;
        ((l4) a70Var).getClass();
        int i14 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.f6.w0(null, i13, false);
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
            e3 e3Var = this.w;
            canvas.translate(e3Var.s, e3Var.v);
            l4.v(a70Var, canvas, this, 0);
            this.w.draw(canvas, this);
            canvas.restore();
            i14 = 1;
        }
        e3 e3Var2 = this.c;
        int i15 = this.r;
        if (e3Var2 != null) {
            canvas.save();
            e3 e3Var3 = this.c;
            int i16 = this.n;
            e3Var3.s = i16;
            e3Var3.v = i15;
            canvas.translate(i16, i15);
            l4.v(a70Var, canvas, this, i14);
            this.c.draw(canvas, this);
            canvas.restore();
            i14++;
        }
        if (this.d != null) {
            canvas.save();
            e3 e3Var4 = this.d;
            int i17 = this.n;
            e3Var4.s = i17;
            e3Var4.v = i15 + this.s;
            canvas.translate(i17, i15 + r5);
            l4.v(a70Var, canvas, this, i14);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, a70Var, this.G, getMeasuredHeight());
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
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
            int i12 = this.B;
            this.e.q(i12, dp4, i12 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.G;
            e3 q10 = l4.q(this.a, this, null, pageblockaudio2.caption.text, dp2, this.r, pageblockaudio2, this.b);
            this.c = q10;
            if (q10 != null) {
                int height = this.c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.s = height;
                dp = org.telegram.messenger.l0.C(8.0f, height, dp);
            }
            i11 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.G;
            e3 p6 = l4.p(this.a, this, null, pageblockaudio3.caption.credit, dp2, this.r + this.s, pageblockaudio3, this.b.C ? org.telegram.ui.Components.rv0.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
            this.d = p6;
            if (p6 != null) {
                i11 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.G.level <= 0) {
                i11 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.I.getMusicAuthor(false);
            String musicTitle = this.I.getMusicTitle(false);
            int C = org.telegram.messenger.l0.C(50.0f, this.B, dp3);
            this.y = C;
            int dp5 = (size - C) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.w = null;
                this.A = ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.C;
            } else {
                SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) ? !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor) : new SpannableStringBuilder(aa.d.z(musicAuthor, " - ", musicTitle));
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.f6.O2, dp5, TextUtils.TruncateAt.END);
                e3 e3Var = new e3(this.a);
                this.w = e3Var;
                e3Var.d = new StaticLayout(ellipsize, l4.a1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.w.n = this.G;
                this.A = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.C;
            }
            this.f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
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
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (this.f.f(motionEvent.getX() - this.y, motionEvent.getY() - this.A, motionEvent.getAction())) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (this.D != -1) {
                if (x10 >= this.B && x10 <= AndroidUtilities.dp(48.0f) + r2) {
                    if (y10 >= this.C) {
                    }
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.E == 1) {
                this.E = 0;
                playSoundEffect(0);
                int i9 = ((l4) this.a).T;
                int i10 = this.D;
                j4 j4Var = this.b;
                RadialProgress2 radialProgress2 = this.e;
                if (i10 == 0) {
                    if (j4Var != null && MediaController.getInstance().setPlaylist(j4Var.v, this.I, 0L, false, null)) {
                        this.D = 1;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i10 == 1) {
                    if (MediaController.getInstance().lambda$startAudioAgain$7(this.I)) {
                        this.D = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i10 == 2) {
                    radialProgress2.o(0.0f, false);
                    FileLoader.getInstance(i9).loadFile(this.H, j4Var == null ? null : j4Var.A, 1, 1);
                    this.D = 3;
                    radialProgress2.setIcon(getIconForCurrentState(), true, true);
                    invalidate();
                } else if (i10 == 3) {
                    FileLoader.getInstance(i9).cancelLoadFile(this.H);
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
            if (!l4.l(this.a, this.b, motionEvent, this, this.c, this.n, this.r)) {
                if (!l4.l(this.a, this.b, motionEvent, this, this.d, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
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
