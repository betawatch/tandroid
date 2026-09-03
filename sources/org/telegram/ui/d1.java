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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d1 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.k9 {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final int G;
    public TL_iv.pageBlockAudio H;
    public TLRPC.Document I;
    public MessageObject J;
    public final p70 a;
    public final l4 b;
    public f3 c;
    public f3 d;
    public final RadialProgress2 e;
    public final org.telegram.ui.Components.fo0 f;
    public boolean h;
    public int n;
    public final int r;
    public int s;
    public String v;
    public f3 w;
    public StaticLayout x;
    public int y;

    public d1(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.r = AndroidUtilities.dp(58.0f);
        this.a = p70Var;
        this.b = l4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.G = DownloadController.getInstance(((n4) p70Var).U).generateObserverTag();
        org.telegram.ui.Components.fo0 fo0Var = new org.telegram.ui.Components.fo0(this);
        this.f = fo0Var;
        fo0Var.h = new c1(this, 0);
    }

    private int getIconForCurrentState() {
        int i10 = this.E;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 3 ? 3 : 0;
    }

    public final void a(boolean z4) {
        int i10 = ((n4) this.a).U;
        String attachFileName = FileLoader.getAttachFileName(this.I);
        boolean exists = FileLoader.getInstance(i10).getPathToAttach(this.I, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.J);
            if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                this.E = 0;
            } else {
                this.E = 1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z4);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            if (FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.E = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    radialProgress2.o(fileProgress.floatValue(), z4);
                } else {
                    radialProgress2.o(0.0f, z4);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z4);
            } else {
                this.E = 2;
                radialProgress2.o(0.0f, z4);
                radialProgress2.setIcon(getIconForCurrentState(), false, z4);
            }
        }
        b();
    }

    public final void b() {
        MessageObject messageObject;
        int i10;
        if (this.I == null || (messageObject = this.J) == null) {
            return;
        }
        org.telegram.ui.Components.fo0 fo0Var = this.f;
        if (!fo0Var.e) {
            fo0Var.i(messageObject.audioProgress);
        }
        if (!MediaController.getInstance().isPlayingMessage(this.J)) {
            i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= this.I.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.I.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i10 = (int) documentAttribute.duration;
                    break;
                }
                i11++;
            }
        } else {
            i10 = this.J.audioProgressSec;
        }
        String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
        String str = this.v;
        if (str == null || !str.equals(formatShortDuration)) {
            this.v = formatShortDuration;
            TextPaint textPaint = n4.b1;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        n4.b1.setColor(this.a.b());
        invalidate();
    }

    @Override // org.telegram.ui.Cells.k9
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
        return this.J;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.G;
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
        DownloadController.getInstance(((n4) this.a).U).removeLoadingFileObserver(this);
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
        if (this.H == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.ie;
        int i11 = org.telegram.ui.ActionBar.j6.je;
        int i12 = org.telegram.ui.ActionBar.j6.uc;
        int i13 = org.telegram.ui.ActionBar.j6.vc;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.j6.Bd;
        p70 p70Var = this.a;
        ((n4) p70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.y, this.B);
        this.f.b(canvas);
        canvas.restore();
        if (this.x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.C, AndroidUtilities.dp(6.0f) + this.B);
            this.x.draw(canvas);
            canvas.restore();
        }
        if (this.w != null) {
            canvas.save();
            this.w.s = AndroidUtilities.dp(54.0f) + this.C;
            this.w.v = this.B - AndroidUtilities.dp(16.0f);
            f3 f3Var = this.w;
            canvas.translate(f3Var.s, f3Var.v);
            n4.v(p70Var, canvas, this, 0);
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
            n4.v(p70Var, canvas, this, i15);
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
            n4.v(p70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        n4.u(canvas, p70Var, this.H, getMeasuredHeight());
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z4) {
        a(true);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVAudio));
        if (this.w != null) {
            sb.append(", ");
            sb.append(this.w.d.getText());
        }
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.H;
        if (pageblockaudio != null) {
            if (pageblockaudio.level > 0) {
                this.n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(r0 * 14);
            } else {
                this.n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.C = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.D = dp4;
            int i13 = this.C;
            this.e.q(i13, dp4, i13 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.H;
            f3 q10 = n4.q(this.a, this, null, pageblockaudio2.caption.text, dp2, this.r, pageblockaudio2, this.b);
            this.c = q10;
            if (q10 != null) {
                int height = this.c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.s = height;
                dp = org.telegram.messenger.y3.C(8.0f, height, dp);
            }
            i12 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.H;
            f3 p10 = n4.p(this.a, this, null, pageblockaudio3.caption.credit, dp2, this.r + this.s, pageblockaudio3, this.b.D ? org.telegram.ui.Components.kw0.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
            this.d = p10;
            if (p10 != null) {
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.H.level <= 0) {
                i12 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.J.getMusicAuthor(false);
            String musicTitle = this.J.getMusicTitle(false);
            int C = org.telegram.messenger.y3.C(50.0f, this.C, dp3);
            this.y = C;
            int dp5 = (size - C) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.w = null;
                this.B = ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.D;
            } else {
                SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) ? !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor) : new SpannableStringBuilder(android.support.v4.media.a.z(musicAuthor, " - ", musicTitle));
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.f51(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.j6.O2, dp5, TextUtils.TruncateAt.END);
                f3 f3Var = new f3(this.a);
                this.w = f3Var;
                f3Var.d = new StaticLayout(ellipsize, n4.b1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.w.n = this.H;
                this.B = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.D;
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
        if (this.E != 3) {
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
    
        r14.F = 1;
        invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r14.E == 0) goto L23;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (this.f.f(motionEvent.getX() - this.y, motionEvent.getY() - this.B, motionEvent.getAction())) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (this.E != -1) {
                if (x10 >= this.C && x10 <= AndroidUtilities.dp(48.0f) + r2) {
                    if (y10 >= this.D) {
                    }
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.F == 1) {
                this.F = 0;
                playSoundEffect(0);
                int i10 = ((n4) this.a).U;
                int i11 = this.E;
                l4 l4Var = this.b;
                RadialProgress2 radialProgress2 = this.e;
                if (i11 == 0) {
                    if (l4Var != null && MediaController.getInstance().setPlaylist(l4Var.v, this.J, 0L, false, null)) {
                        this.E = 1;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i11 == 1) {
                    if (MediaController.getInstance().lambda$startAudioAgain$7(this.J)) {
                        this.E = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i11 == 2) {
                    radialProgress2.o(0.0f, false);
                    FileLoader.getInstance(i10).loadFile(this.I, l4Var == null ? null : l4Var.B, 1, 1);
                    this.E = 3;
                    radialProgress2.setIcon(getIconForCurrentState(), true, true);
                    invalidate();
                } else if (i11 == 3) {
                    FileLoader.getInstance(i10).cancelLoadFile(this.I);
                    this.E = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            }
        } else if (motionEvent.getAction() == 3) {
            this.F = 0;
        }
        if (this.F == 0) {
            if (!n4.l(this.a, this.b, motionEvent, this, this.c, this.n, this.r)) {
                if (!n4.l(this.a, this.b, motionEvent, this, this.d, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
