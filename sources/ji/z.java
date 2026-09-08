package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.bo0;
import org.telegram.ui.Components.e51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class z extends a0 implements org.telegram.ui.ActionBar.z5, p9, l0, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public int E;
    public final int F;
    public final int G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public StaticLayout L;
    public StaticLayout M;
    public String N;
    public p3 O;
    public MessageObject P;
    public TLRPC.Document Q;
    public int R;
    public boolean S;
    public boolean T;
    public final k0 U;
    public final int n;
    public final org.telegram.ui.ActionBar.f6 r;
    public final Paint s;
    public final TextPaint v;
    public final RadialProgress2 w;
    public final bo0 x;
    public final int y;

    public z(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.s = new Paint(1);
        this.v = new TextPaint(1);
        this.E = AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(10.0f);
        this.F = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.G = dp2;
        this.n = i10;
        this.r = f6Var;
        setWillNotDraw(false);
        this.y = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.w = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.E;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        bo0 bo0Var = new bo0(this);
        this.x = bo0Var;
        bo0Var.h = new a6.i(this, 27);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        k0 k0Var = new k0(context, f6Var, new a4.m(this, 28));
        this.U = k0Var;
        addView(k0Var.a, w7.x5.e(-2, -2, 51));
        d();
    }

    private TLRPC.Document getDisplayDocument() {
        u uVar;
        a aVar = this.a;
        if (aVar == null || (uVar = aVar.g) == null) {
            return null;
        }
        TLRPC.Document document = uVar.h;
        return document != null ? document : uVar.i;
    }

    private int getIconForCurrentState() {
        if (k()) {
            return 3;
        }
        int i10 = this.R;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 3 ? 3 : 0;
    }

    @Override // ji.l0
    public final boolean a(int i10, int i11) {
        return this.U.f(i10, i11);
    }

    @Override // ji.l0
    public final void b() {
        this.U.i();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        this.s.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uf, this.r));
        k0 k0Var = this.U;
        if (k0Var != null) {
            k0Var.a();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.P;
        if (messageObject == null || i11 != this.n) {
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart || i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            m(true);
            return;
        }
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
            if (messageObject.getId() != ((Integer) objArr[0]).intValue() || (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null) {
                return;
            }
            MessageObject messageObject2 = this.P;
            messageObject2.audioProgress = playingMessageObject.audioProgress;
            messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
            messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
            n();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.U.c(canvas);
    }

    @Override // ji.a0
    public final void f(int i10) {
        int dp = AndroidUtilities.dp(16.0f);
        if (this.H) {
            i10 = 0;
        }
        int i11 = dp + i10;
        this.E = i11;
        int i12 = this.G;
        int i13 = this.F;
        this.w.q(i11, i13, i11 + i12, i12 + i13);
        requestLayout();
        invalidate();
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.U.e(arrayList);
    }

    @Override // ji.l0
    public h1 getCaptionEditText() {
        return this.U.a;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.y;
    }

    @Override // ji.l0
    public a getRow() {
        return this.a;
    }

    public final TLRPC.TL_documentAttributeAudio h() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i10 = 0; i10 < displayDocument.attributes.size(); i10++) {
            if (displayDocument.attributes.get(i10) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i10);
            }
        }
        return null;
    }

    public final void i(a aVar, p3 p3Var) {
        u uVar;
        this.a = aVar;
        this.O = p3Var;
        if (aVar != null && aVar.g == null) {
            aVar.g = new u();
        }
        this.H = LocaleController.isRTL;
        c(aVar);
        this.U.b();
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.Q) {
            this.Q = displayDocument;
            this.P = null;
            this.N = null;
            this.M = null;
        }
        if (j() && this.P == null && displayDocument != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = -Long.valueOf(displayDocument.id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i10 = this.n;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            peer.user_id = clientUserId;
            tL_peerUser.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            a aVar2 = this.a;
            if (aVar2 != null && (uVar = aVar2.g) != null && !TextUtils.isEmpty(uVar.e)) {
                tL_message.attachPath = this.a.g.e;
            }
            this.P = new MessageObject(i10, tL_message, false, true);
        }
        l();
        if (this.T) {
            m(false);
        }
        requestLayout();
        invalidate();
    }

    public final boolean j() {
        u uVar;
        a aVar = this.a;
        return (aVar == null || (uVar = aVar.g) == null || !uVar.b()) ? false : true;
    }

    public final boolean k() {
        u uVar;
        a aVar = this.a;
        return (aVar == null || (uVar = aVar.g) == null || !uVar.a()) ? false : true;
    }

    public final void l() {
        int dp = AndroidUtilities.dp(50.0f) + this.E;
        int i10 = this.G;
        this.I = dp + i10;
        this.K = Math.max(0, (((getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x) - this.I) - AndroidUtilities.dp(16.0f)) - (this.H ? this.c : 0));
        MessageObject messageObject = this.P;
        String musicAuthor = messageObject != null ? messageObject.getMusicAuthor(false) : h() != null ? h().performer : null;
        MessageObject messageObject2 = this.P;
        String musicTitle = messageObject2 != null ? messageObject2.getMusicTitle(false) : h() != null ? h().title : null;
        boolean isEmpty = TextUtils.isEmpty(musicTitle);
        int i11 = this.F;
        if (isEmpty && TextUtils.isEmpty(musicAuthor)) {
            this.L = null;
            this.J = ((i10 - AndroidUtilities.dp(30.0f)) / 2) + i11;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) ? !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor) : new SpannableStringBuilder(a4.a.C(musicAuthor, " - ", musicTitle));
            if (!TextUtils.isEmpty(musicAuthor)) {
                spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
            }
            float dp2 = AndroidUtilities.dp(16.0f);
            TextPaint textPaint = this.v;
            textPaint.setTextSize(dp2);
            this.L = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.K, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(50.0f) + this.K, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.J = AndroidUtilities.dp(11.0f) + ((i10 - AndroidUtilities.dp(30.0f)) / 2) + i11;
        }
        this.x.j(this.K, AndroidUtilities.dp(30.0f));
    }

    public final void m(boolean z10) {
        u uVar;
        int i10 = org.telegram.ui.ActionBar.j6.ie;
        int i11 = org.telegram.ui.ActionBar.j6.je;
        int i12 = org.telegram.ui.ActionBar.j6.uc;
        int i13 = org.telegram.ui.ActionBar.j6.vc;
        RadialProgress2 radialProgress2 = this.w;
        radialProgress2.g(i10, i11, i12, i13);
        radialProgress2.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Bd, this.r);
        boolean k10 = k();
        int i14 = this.n;
        if (k10) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            radialProgress2.o(this.a.g.f, z10);
            radialProgress2.setIcon(3, false, z10);
            n();
            return;
        }
        TLRPC.Document document = j() ? this.a.g.h : null;
        String attachFileName = FileLoader.getAttachFileName(document);
        a aVar = this.a;
        boolean z11 = (aVar == null || (uVar = aVar.g) == null || TextUtils.isEmpty(uVar.e) || !new File(this.a.g.e).exists()) ? false : true;
        File pathToAttach = document == null ? null : FileLoader.getInstance(i14).getPathToAttach(document, true);
        boolean z12 = z11 || (pathToAttach != null && pathToAttach.exists());
        if (TextUtils.isEmpty(attachFileName)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            this.R = (!MediaController.getInstance().isPlayingMessage(this.P) || MediaController.getInstance().isMessagePaused()) ? 0 : 1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i14).addLoadingFileObserver(attachFileName, null, this);
            if (FileLoader.getInstance(i14).isLoadingFile(attachFileName)) {
                this.R = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                radialProgress2.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            } else {
                this.R = 2;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            }
        }
        n();
    }

    public final void n() {
        double d;
        MessageObject messageObject;
        if (!k() && (messageObject = this.P) != null) {
            bo0 bo0Var = this.x;
            if (!bo0Var.e) {
                bo0Var.i(messageObject.audioProgress);
            }
        }
        int i10 = 0;
        if (k()) {
            if (h() != null) {
                d = h().duration;
                i10 = (int) d;
            }
        } else if (this.P == null || !MediaController.getInstance().isPlayingMessage(this.P)) {
            TLRPC.TL_documentAttributeAudio h = h();
            if (h != null) {
                d = h.duration;
                i10 = (int) d;
            }
        } else {
            i10 = this.P.audioProgressSec;
        }
        String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
        String str = this.N;
        if (str == null || !str.equals(formatShortDuration)) {
            this.N = formatShortDuration;
            float dp = AndroidUtilities.dp(16.0f);
            TextPaint textPaint = this.v;
            textPaint.setTextSize(dp);
            this.M = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        this.w.m(this);
        this.x.s = this;
        m(false);
        int i10 = this.n;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T = false;
        int i10 = this.n;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        q9 textSelectionHelper;
        if (getDisplayDocument() == null) {
            return;
        }
        this.w.draw(canvas);
        int i10 = org.telegram.ui.ActionBar.j6.ud;
        org.telegram.ui.ActionBar.f6 f6Var = this.r;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vd, f6Var);
        int i11 = org.telegram.ui.ActionBar.j6.xd;
        int v04 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        int v05 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        int v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wd, f6Var);
        bo0 bo0Var = this.x;
        bo0Var.h(v02, v03, v04, v05, v06);
        if (!k()) {
            canvas.save();
            canvas.translate(this.I, this.J);
            bo0Var.b(canvas);
            canvas.restore();
        }
        int v07 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.nd, f6Var);
        TextPaint textPaint = this.v;
        textPaint.setColor(v07);
        if (this.M != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.E, AndroidUtilities.dp(6.0f) + this.J);
            this.M.draw(canvas);
            canvas.restore();
        }
        if (this.L != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.E, this.J - AndroidUtilities.dp(16.0f));
            this.L.draw(canvas);
            canvas.restore();
        }
        p3 p3Var = this.O;
        if (p3Var != null && (textSelectionHelper = p3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.u0 && R <= textSelectionHelper.x0) {
                canvas.drawRoundRect(AndroidUtilities.dp(8.0f) + (this.H ? 0 : this.c), AndroidUtilities.dp(2.0f), (getWidth() - (this.H ? this.c : 0)) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.s);
            }
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        m(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = this.H;
        this.U.g(z11 ? 0 : this.c, z11 ? this.c : 0, i12 - i10, AndroidUtilities.dp(66.0f));
        l();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.H;
        setMeasuredDimension(size, AndroidUtilities.dp(66.0f) + this.U.h(z10 ? 0 : this.c, z10 ? this.c : 0, size));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
        this.w.o(Math.min(1.0f, j10 <= 0 ? 0.0f : j3 / j10), true);
        if (this.R != 3) {
            m(true);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.w.o(1.0f, true);
        m(true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (!k()) {
            if (this.x.f(x10 - this.I, y3 - this.J, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            if (x10 >= this.E) {
                int i10 = this.G;
                if (x10 <= r0 + i10) {
                    if (y3 >= this.F && y3 <= r0 + i10) {
                        this.S = true;
                        invalidate();
                        return true;
                    }
                }
            }
        } else if (actionMasked == 1) {
            if (this.S) {
                this.S = false;
                playSoundEffect(0);
                if (k()) {
                    p3 p3Var = this.O;
                    if (p3Var != null) {
                        a aVar = this.a;
                        v3 v3Var = p3Var.a;
                        ArrayList arrayList = v3Var.l3;
                        d5 d5Var = (d5) v3Var.Z3.remove(aVar.g);
                        if (d5Var != null) {
                            d5Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            g2 g2Var = v3Var.J3;
                            if (g2Var != null) {
                                g2Var.d();
                            }
                            arrayList.remove(indexOf);
                            v3Var.Y2.N(true);
                            g2 g2Var2 = v3Var.J3;
                            if (g2Var2 != null) {
                                g2Var2.h();
                            }
                        }
                        v3Var.h3.onContentChanged();
                    }
                } else if (this.P != null) {
                    TLRPC.Document document = j() ? this.a.g.h : null;
                    int i11 = this.R;
                    RadialProgress2 radialProgress2 = this.w;
                    if (i11 == 0) {
                        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                        arrayList2.add(this.P);
                        if (MediaController.getInstance().setPlaylist(arrayList2, this.P, 0L, false, null)) {
                            this.R = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i11 != 1) {
                        int i12 = this.n;
                        if (i11 == 2) {
                            radialProgress2.o(0.0f, false);
                            FileLoader.getInstance(i12).loadFile(document, this.P, 1, 1);
                            this.R = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i11 == 3) {
                            FileLoader.getInstance(i12).cancelLoadFile(document);
                            this.R = 2;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (MediaController.getInstance().lambda$startAudioAgain$7(this.P)) {
                        this.R = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 3) {
            this.S = false;
        }
        return this.S || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
