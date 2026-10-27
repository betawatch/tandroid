package li;

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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.r61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class y extends z implements p6, r9, k0, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
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
    public final j0 U;
    public boolean V;
    public final int n;
    public final u6 r;
    public final Paint s;
    public final TextPaint v;
    public final RadialProgress2 w;
    public final jp0 x;
    public final int y;

    public y(Context context, int i10, u6 u6Var) {
        super(context);
        this.s = new Paint(1);
        this.v = new TextPaint(1);
        this.E = AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(10.0f);
        this.F = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.G = dp2;
        this.n = i10;
        this.r = u6Var;
        setWillNotDraw(false);
        this.y = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, u6Var);
        this.w = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.E;
        radialProgress2.r(i11, dp, i11 + dp2, dp2 + dp);
        jp0 jp0Var = new jp0(this);
        this.x = jp0Var;
        jp0Var.h = new jg.i(this);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        j0 j0Var = new j0(context, u6Var, new jg.s0(this, 5));
        this.U = j0Var;
        addView(j0Var.a, kb1.i(-2, -2, 51));
        updateColors();
    }

    private TLRPC.Document getDisplayDocument() {
        t tVar;
        a aVar = this.a;
        if (aVar == null || (tVar = aVar.g) == null) {
            return null;
        }
        TLRPC.Document document = tVar.h;
        return document != null ? document : tVar.i;
    }

    private int getIconForCurrentState() {
        if (j()) {
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

    @Override // li.k0
    public final boolean a(int i10, int i11) {
        return this.U.f(i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.uf));
    }

    @Override // li.k0
    public final void b() {
        this.U.i();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.P;
        if (messageObject == null || i11 != this.n) {
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart || i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            l(true);
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
            m();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.U.c(canvas);
    }

    @Override // li.z
    public final void e(int i10) {
        int dp = AndroidUtilities.dp(16.0f);
        if (this.H) {
            i10 = 0;
        }
        int i11 = dp + i10;
        this.E = i11;
        int i12 = this.G;
        int i13 = this.F;
        this.w.r(i11, i13, i11 + i12, i12 + i13);
        requestLayout();
        invalidate();
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.U.e(arrayList);
    }

    public final TLRPC.TL_documentAttributeAudio g() {
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

    @Override // li.k0
    public g1 getCaptionEditText() {
        return this.U.a;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.y;
    }

    @Override // li.k0
    public a getRow() {
        return this.a;
    }

    public final void h(a aVar, p3 p3Var) {
        t tVar;
        this.a = aVar;
        this.O = p3Var;
        if (aVar != null && aVar.g == null) {
            aVar.g = new t();
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
        if (i() && this.P == null && displayDocument != null) {
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
            if (aVar2 != null && (tVar = aVar2.g) != null && !TextUtils.isEmpty(tVar.e)) {
                tL_message.attachPath = this.a.g.e;
            }
            this.P = new MessageObject(i10, tL_message, false, true);
        }
        k();
        if (this.T) {
            l(false);
        }
        requestLayout();
        invalidate();
    }

    public final boolean i() {
        t tVar;
        a aVar = this.a;
        return (aVar == null || (tVar = aVar.g) == null || !tVar.b()) ? false : true;
    }

    public final boolean j() {
        t tVar;
        a aVar = this.a;
        return (aVar == null || (tVar = aVar.g) == null || !tVar.a()) ? false : true;
    }

    public final void k() {
        int dp = AndroidUtilities.dp(50.0f) + this.E;
        int i10 = this.G;
        this.I = dp + i10;
        this.K = Math.max(0, (((getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x) - this.I) - AndroidUtilities.dp(16.0f)) - (this.H ? this.c : 0));
        MessageObject messageObject = this.P;
        String musicAuthor = messageObject != null ? messageObject.getMusicAuthor(false) : g() != null ? g().performer : null;
        MessageObject messageObject2 = this.P;
        String musicTitle = messageObject2 != null ? messageObject2.getMusicTitle(false) : g() != null ? g().title : null;
        boolean isEmpty = TextUtils.isEmpty(musicTitle);
        int i11 = this.F;
        if (isEmpty && TextUtils.isEmpty(musicAuthor)) {
            this.L = null;
            this.J = ((i10 - AndroidUtilities.dp(30.0f)) / 2) + i11;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) ? !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor) : new SpannableStringBuilder(a1.g.D(musicAuthor, " - ", musicTitle));
            if (!TextUtils.isEmpty(musicAuthor)) {
                spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
            }
            float dp2 = AndroidUtilities.dp(16.0f);
            TextPaint textPaint = this.v;
            textPaint.setTextSize(dp2);
            this.L = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.K, TextUtils.TruncateAt.END), this.v, AndroidUtilities.dp(50.0f) + this.K, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.J = AndroidUtilities.dp(11.0f) + ((i10 - AndroidUtilities.dp(30.0f)) / 2) + i11;
        }
        this.x.j(this.K, AndroidUtilities.dp(30.0f));
    }

    public final void l(boolean z10) {
        t tVar;
        int i10 = y6.ie;
        int i11 = y6.je;
        int i12 = y6.uc;
        int i13 = y6.vc;
        RadialProgress2 radialProgress2 = this.w;
        radialProgress2.g(i10, i11, i12, i13);
        radialProgress2.d = y6.w0(y6.Bd, this.r);
        this.V = true;
        boolean j10 = j();
        int i14 = this.n;
        if (j10) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            radialProgress2.p(this.a.g.f, z10);
            radialProgress2.setIcon(3, false, z10);
            m();
            return;
        }
        TLRPC.Document document = i() ? this.a.g.h : null;
        String attachFileName = FileLoader.getAttachFileName(document);
        a aVar = this.a;
        boolean z11 = (aVar == null || (tVar = aVar.g) == null || TextUtils.isEmpty(tVar.e) || !new File(this.a.g.e).exists()) ? false : true;
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
                radialProgress2.p(fileProgress != null ? fileProgress.floatValue() : 0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            } else {
                this.R = 2;
                radialProgress2.p(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            }
        }
        m();
    }

    public final void m() {
        double d;
        MessageObject messageObject;
        if (!j() && (messageObject = this.P) != null) {
            jp0 jp0Var = this.x;
            if (!jp0Var.e) {
                jp0Var.i(messageObject.audioProgress);
            }
        }
        int i10 = 0;
        if (j()) {
            if (g() != null) {
                d = g().duration;
                i10 = (int) d;
            }
        } else if (this.P == null || !MediaController.getInstance().isPlayingMessage(this.P)) {
            TLRPC.TL_documentAttributeAudio g7 = g();
            if (g7 != null) {
                d = g7.duration;
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
        this.w.n(this);
        this.x.s = this;
        l(false);
        int i10 = this.n;
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
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
        s9 textSelectionHelper;
        if (getDisplayDocument() == null) {
            return;
        }
        this.w.draw(canvas);
        int i10 = y6.ud;
        u6 u6Var = this.r;
        int w02 = y6.w0(i10, u6Var);
        int w03 = y6.w0(y6.vd, u6Var);
        int i11 = y6.xd;
        int w04 = y6.w0(i11, u6Var);
        int w05 = y6.w0(i11, u6Var);
        int w06 = y6.w0(y6.wd, u6Var);
        jp0 jp0Var = this.x;
        jp0Var.h(w02, w03, w04, w05, w06);
        if (!j()) {
            canvas.save();
            canvas.translate(this.I, this.J);
            jp0Var.b(canvas);
            canvas.restore();
        }
        int w07 = y6.w0(y6.nd, u6Var);
        TextPaint textPaint = this.v;
        textPaint.setColor(w07);
        if (this.M != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.E, AndroidUtilities.dp(6.0f) + this.J);
            this.M.draw(canvas);
            canvas.restore();
        }
        if (this.L != null) {
            textPaint.setColor(y6.w0(y6.G6, u6Var));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.E, this.J - AndroidUtilities.dp(16.0f));
            this.L.draw(canvas);
            canvas.restore();
        }
        p3 p3Var = this.O;
        if (p3Var != null && (textSelectionHelper = p3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas.drawRoundRect(AndroidUtilities.dp(8.0f) + (this.H ? 0 : this.c), AndroidUtilities.dp(2.0f), (getWidth() - (this.H ? this.c : 0)) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.s);
            }
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        l(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = this.H;
        this.U.g(z11 ? 0 : this.c, z11 ? this.c : 0, i12 - i10, AndroidUtilities.dp(66.0f));
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.H;
        setMeasuredDimension(size, AndroidUtilities.dp(66.0f) + this.U.h(z10 ? 0 : this.c, z10 ? this.c : 0, size));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.w.p(Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11), true);
        if (this.R != 3) {
            l(true);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.w.p(1.0f, true);
        l(true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (!j()) {
            if (this.x.f(x9 - this.I, y3 - this.J, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            if (x9 >= this.E) {
                int i10 = this.G;
                if (x9 <= r0 + i10) {
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
                if (j()) {
                    p3 p3Var = this.O;
                    if (p3Var != null) {
                        a aVar = this.a;
                        v3 v3Var = p3Var.a;
                        ArrayList arrayList = v3Var.t3;
                        a5 a5Var = (a5) v3Var.h4.remove(aVar.g);
                        if (a5Var != null) {
                            a5Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            f2 f2Var = v3Var.R3;
                            if (f2Var != null) {
                                f2Var.d();
                            }
                            arrayList.remove(indexOf);
                            v3Var.g3.O(true);
                            f2 f2Var2 = v3Var.R3;
                            if (f2Var2 != null) {
                                f2Var2.h();
                            }
                        }
                        v3Var.p3.onContentChanged();
                    }
                } else if (this.P != null) {
                    TLRPC.Document document = i() ? this.a.g.h : null;
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
                            radialProgress2.p(0.0f, false);
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        RadialProgress2 radialProgress2;
        int i10 = y6.uf;
        u6 u6Var = this.r;
        this.s.setColor(y6.w0(i10, u6Var));
        j0 j0Var = this.U;
        if (j0Var != null) {
            j0Var.a();
        }
        try {
            if (this.V && (radialProgress2 = this.w) != null) {
                radialProgress2.d = y6.w0(y6.Bd, u6Var);
            }
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(y6.w0(y6.d6, u6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
