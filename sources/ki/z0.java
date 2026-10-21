package ki;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
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
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class z0 extends a0 implements org.telegram.ui.ActionBar.y5, m9, l0, DownloadController.FileDownloadProgressListener {
    public final ImageReceiver E;
    public final k0 F;
    public final int G;
    public final int H;
    public final int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public StaticLayout Q;
    public StaticLayout R;
    public r3 S;
    public MessageObject T;
    public TLRPC.Document U;
    public final int n;
    public final org.telegram.ui.ActionBar.d6 r;
    public final Paint s;
    public final Paint v;
    public final TextPaint w;
    public final TextPaint x;
    public final RadialProgress2 y;

    public z0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.s = new Paint(1);
        this.v = new Paint(1);
        this.w = new TextPaint(1);
        this.x = new TextPaint(1);
        int dp = AndroidUtilities.dp(10.0f);
        this.H = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.I = dp2;
        this.J = AndroidUtilities.dp(16.0f);
        this.K = AndroidUtilities.dp(16.0f);
        this.n = i10;
        this.r = d6Var;
        setWillNotDraw(false);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        this.G = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, d6Var);
        this.y = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.J;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        k0 k0Var = new k0(context, d6Var, new k2.w0(this, 1));
        this.F = k0Var;
        addView(k0Var.a, w7.z5.e(-2, -2, 51));
        d();
    }

    @Override // ki.l0
    public final boolean a(int i10, int i11) {
        return this.F.f(i10, i11);
    }

    @Override // ki.l0
    public final void b() {
        this.F.i();
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void d() {
        this.s.setColor(h6.w0(h6.uf, this.r));
        k0 k0Var = this.F;
        if (k0Var != null) {
            k0Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.F.c(canvas);
    }

    @Override // ki.a0
    public final void f(int i10) {
        int dp = AndroidUtilities.dp(16.0f);
        if (this.M) {
            i10 = 0;
        }
        int i11 = dp + i10;
        this.K = i11;
        if (this.L) {
            i11 += AndroidUtilities.dp(21.0f);
        }
        this.J = i11;
        int dp2 = this.L ? AndroidUtilities.dp(31.0f) : this.H;
        int i12 = this.J;
        int i13 = this.I;
        this.y.q(i12, dp2, i12 + i13, i13 + dp2);
        requestLayout();
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.F.e(arrayList);
    }

    @Override // ki.l0
    public h1 getCaptionEditText() {
        return this.F.a;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.G;
    }

    @Override // ki.l0
    public a getRow() {
        return this.a;
    }

    public final void h(TLRPC.Document document) {
        String str;
        t tVar;
        a aVar = this.a;
        String str2 = (aVar == null || (tVar = aVar.g) == null) ? null : tVar.e;
        File file = TextUtils.isEmpty(str2) ? null : new File(str2);
        String lowerCase = (document == null || (str = document.mime_type) == null) ? "" : str.toLowerCase();
        boolean z10 = j() && file != null && file.exists() && (lowerCase.startsWith("image/") || lowerCase.equals("video/mp4"));
        boolean isDocumentHasThumb = MessageObject.isDocumentHasThumb(document);
        this.L = z10 || isDocumentHasThumb;
        int dp = AndroidUtilities.dp(16.0f) + (this.M ? 0 : this.c);
        this.K = dp;
        if (this.L) {
            dp += AndroidUtilities.dp(21.0f);
        }
        this.J = dp;
        int dp2 = this.L ? AndroidUtilities.dp(31.0f) : this.H;
        int i10 = this.J;
        int i11 = this.I;
        this.y.q(i10, dp2, i10 + i11, i11 + dp2);
        ImageReceiver imageReceiver = this.E;
        if (z10) {
            imageReceiver.setImageCoords(this.K, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            this.E.setImage(ImageLocation.getForPath(str2), "86_86", null, null, document, 1);
            return;
        }
        if (!isDocumentHasThumb) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
        r3 r3Var = this.S;
        MessageObject messageObject = r3Var == null ? null : r3Var.a.g3;
        imageReceiver.setImageCoords(this.K, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
        ImageLocation forDocument = closestPhotoSizeWithSize != null ? ImageLocation.getForDocument(closestPhotoSizeWithSize, document) : null;
        Drawable createStripedBitmap = ImageLoader.createStripedBitmap(document.thumbs);
        if (messageObject == null) {
            messageObject = this.T;
        }
        this.E.setImage(forDocument, "86_86", createStripedBitmap, null, messageObject, 1);
    }

    public final TLRPC.Document i() {
        t tVar;
        a aVar = this.a;
        if (aVar == null || (tVar = aVar.g) == null) {
            return null;
        }
        return tVar.h;
    }

    public final boolean j() {
        t tVar;
        a aVar = this.a;
        return (aVar == null || (tVar = aVar.g) == null || !tVar.a()) ? false : true;
    }

    public final void k() {
        int i10;
        float f7;
        t tVar;
        TLRPC.Document i11 = i();
        if (i11 == null) {
            return;
        }
        if (this.L) {
            i10 = this.K;
            f7 = 97.0f;
        } else {
            i10 = this.J;
            f7 = 54.0f;
        }
        int max = Math.max(AndroidUtilities.dp(40.0f), (((getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x) - (AndroidUtilities.dp(f7) + i10)) - AndroidUtilities.dp(16.0f)) - (this.M ? this.c : 0));
        float dp = AndroidUtilities.dp(15.0f);
        TextPaint textPaint = this.w;
        textPaint.setTextSize(dp);
        textPaint.setTypeface(AndroidUtilities.bold());
        float dp2 = AndroidUtilities.dp(13.0f);
        TextPaint textPaint2 = this.x;
        textPaint2.setTextSize(dp2);
        String documentFileName = FileLoader.getDocumentFileName(i11);
        if (TextUtils.isEmpty(documentFileName) && (tVar = this.a.g) != null && !TextUtils.isEmpty(tVar.e)) {
            documentFileName = new File(this.a.g.e).getName();
        }
        if (documentFileName == null) {
            documentFileName = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(documentFileName, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j10 = i11.size;
        if (j10 <= 0) {
            t tVar2 = this.a.g;
            j10 = (tVar2 == null || TextUtils.isEmpty(tVar2.e)) ? 0L : new File(this.a.g.e).length();
        }
        this.R = new StaticLayout(AndroidUtilities.formatFileSize(j10), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (r5.exists() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(boolean z10) {
        File pathToAttach;
        t tVar;
        boolean z11 = this.L;
        org.telegram.ui.ActionBar.d6 d6Var = this.r;
        RadialProgress2 radialProgress2 = this.y;
        if (z11) {
            radialProgress2.g(h6.le, h6.me, h6.ne, h6.oe);
            radialProgress2.d = h6.w0(h6.hd, d6Var);
        } else {
            radialProgress2.g(h6.ie, h6.je, h6.uc, h6.vc);
            radialProgress2.d = h6.w0(h6.Bd, d6Var);
        }
        boolean j10 = j();
        int i10 = this.n;
        if (j10) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            radialProgress2.o(this.a.g.f, z10);
            radialProgress2.setIcon(3, false, z10);
            return;
        }
        String attachFileName = FileLoader.getAttachFileName(i());
        a aVar = this.a;
        if (aVar != null && (tVar = aVar.g) != null && !TextUtils.isEmpty(tVar.e)) {
            pathToAttach = new File(this.a.g.e);
        }
        if (i() == null) {
            pathToAttach = null;
        } else {
            pathToAttach = FileLoader.getInstance(i10).getPathToAttach(i(), false);
            if (pathToAttach == null || !pathToAttach.exists()) {
                pathToAttach = FileLoader.getInstance(i10).getPathToAttach(i(), true);
            }
        }
        if (pathToAttach != null && pathToAttach.exists()) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            this.P = 0;
            radialProgress2.setIcon(this.L ? 4 : 5, false, z10);
        } else {
            if (TextUtils.isEmpty(attachFileName)) {
                return;
            }
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            if (!FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.P = 1;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(2, false, z10);
            } else {
                this.P = 2;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                radialProgress2.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, z10);
                radialProgress2.setIcon(3, true, z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        this.y.m(this);
        this.E.onAttachedToWindow();
        l(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N = false;
        this.E.onDetachedFromWindow();
        DownloadController.getInstance(this.n).removeLoadingFileObserver(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        n9 textSelectionHelper;
        if (i() == null) {
            return;
        }
        boolean z10 = this.L;
        org.telegram.ui.ActionBar.d6 d6Var = this.r;
        if (z10 && !this.E.draw(canvas)) {
            int w02 = h6.w0(h6.Gd, d6Var);
            Paint paint = this.v;
            paint.setColor(w02);
            canvas.drawRoundRect(this.K, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f) + this.K, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.y.draw(canvas);
        if (this.L) {
            i10 = this.K;
            f7 = 97.0f;
        } else {
            i10 = this.J;
            f7 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f7) + i10;
        this.w.setColor(h6.w0(h6.Dd, d6Var));
        int dp2 = AndroidUtilities.dp(12.0f);
        if (this.Q != null) {
            canvas.save();
            canvas.translate(dp, dp2);
            this.Q.draw(canvas);
            canvas.restore();
        }
        this.x.setColor(h6.w0(h6.nd, d6Var));
        StaticLayout staticLayout = this.Q;
        int dp3 = AndroidUtilities.dp(2.0f) + dp2 + (staticLayout == null ? 0 : staticLayout.getHeight());
        if (this.R != null) {
            canvas.save();
            canvas.translate(dp, dp3);
            this.R.draw(canvas);
            canvas.restore();
        }
        if (this.S == null || !(getParent() instanceof RecyclerView) || (textSelectionHelper = this.S.a.getTextSelectionHelper()) == null || !textSelectionHelper.x()) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int R = RecyclerView.R(this);
        if (R <= textSelectionHelper.p0 || R > textSelectionHelper.s0) {
            return;
        }
        canvas.drawRoundRect(AndroidUtilities.dp(8.0f) + (this.M ? 0 : this.c), AndroidUtilities.dp(2.0f), (getWidth() - (this.M ? this.c : 0)) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.L ? 104.0f : 64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.s);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        l(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = this.M;
        this.F.g(z11 ? 0 : this.c, z11 ? this.c : 0, i12 - i10, AndroidUtilities.dp(this.L ? 106.0f : 66.0f));
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.M;
        setMeasuredDimension(size, AndroidUtilities.dp(this.L ? 106.0f : 66.0f) + this.F.h(z10 ? 0 : this.c, z10 ? this.c : 0, size));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.y.o(j11 <= 0 ? 0.0f : Math.min(1.0f, j10 / j11), true);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.y.o(1.0f, true);
        l(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0121  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        MessageObject messageObject;
        if (motionEvent.getX() >= this.K && motionEvent.getX() <= getWidth() - AndroidUtilities.dp(12.0f) && motionEvent.getY() >= AndroidUtilities.dp(10.0f)) {
            if (motionEvent.getY() <= AndroidUtilities.dp(this.L ? 96.0f : 54.0f)) {
                objArr = true;
                if (motionEvent.getActionMasked() != 0 && objArr == true) {
                    this.O = true;
                    return true;
                }
                if (motionEvent.getActionMasked() == 1 || !this.O) {
                    if (motionEvent.getActionMasked() == 3) {
                        this.O = false;
                    }
                    if (this.O && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                } else {
                    this.O = false;
                    if (objArr != false) {
                        playSoundEffect(0);
                        if (j()) {
                            r3 r3Var = this.S;
                            if (r3Var != null) {
                                a aVar = this.a;
                                w3 w3Var = r3Var.a;
                                a5 a5Var = (a5) w3Var.X3.remove(aVar.g);
                                if (a5Var != null) {
                                    a5Var.b();
                                }
                                h2 h2Var = w3Var.H3;
                                if (h2Var != null) {
                                    h2Var.d();
                                }
                                w3Var.j3.remove(aVar);
                                w3Var.W2.N(true);
                                h2 h2Var2 = w3Var.H3;
                                if (h2Var2 != null) {
                                    h2Var2.h();
                                }
                                w3Var.f3.onContentChanged();
                            }
                        } else {
                            int i10 = this.P;
                            Activity activity = null;
                            if (i10 == 0) {
                                Context context = getContext();
                                while (true) {
                                    if (context instanceof ContextWrapper) {
                                        if (context instanceof Activity) {
                                            activity = (Activity) context;
                                            break;
                                        }
                                        context = ((ContextWrapper) context).getBaseContext();
                                    } else if (context instanceof Activity) {
                                        activity = (Activity) context;
                                    }
                                }
                                if (activity != null && (messageObject = this.T) != null) {
                                    AndroidUtilities.openForView(messageObject, activity, this.r, false);
                                }
                            } else {
                                RadialProgress2 radialProgress2 = this.y;
                                int i11 = this.n;
                                if (i10 == 1 && i() != null) {
                                    r3 r3Var2 = this.S;
                                    MessageObject messageObject2 = r3Var2 != null ? r3Var2.a.g3 : null;
                                    FileLoader fileLoader = FileLoader.getInstance(i11);
                                    TLRPC.Document i12 = i();
                                    if (messageObject2 == null) {
                                        messageObject2 = this.T;
                                    }
                                    fileLoader.loadFile(i12, messageObject2, 1, 1);
                                    this.P = 2;
                                    radialProgress2.setIcon(3, true, true);
                                } else if (this.P == 2 && i() != null) {
                                    FileLoader.getInstance(i11).cancelLoadFile(i());
                                    this.P = 1;
                                    radialProgress2.setIcon(2, false, true);
                                }
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
                return true;
            }
        }
        objArr = false;
        if (motionEvent.getActionMasked() != 0) {
        }
        if (motionEvent.getActionMasked() == 1) {
        }
        if (motionEvent.getActionMasked() == 3) {
        }
        if (this.O) {
        }
        return true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
