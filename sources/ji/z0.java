package ji;

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
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class z0 extends a0 implements org.telegram.ui.ActionBar.z5, p9, l0, DownloadController.FileDownloadProgressListener {
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
    public q3 S;
    public MessageObject T;
    public TLRPC.Document U;
    public final int n;
    public final org.telegram.ui.ActionBar.f6 r;
    public final Paint s;
    public final Paint v;
    public final TextPaint w;
    public final TextPaint x;
    public final RadialProgress2 y;

    public z0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.r = f6Var;
        setWillNotDraw(false);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        this.G = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.y = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.J;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        k0 k0Var = new k0(context, f6Var, new a6.m(this, 26));
        this.F = k0Var;
        addView(k0Var.a, w7.x5.e(-2, -2, 51));
        d();
    }

    @Override // ji.l0
    public final boolean a(int i10, int i11) {
        return this.F.f(i10, i11);
    }

    @Override // ji.l0
    public final void b() {
        this.F.i();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        this.s.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uf, this.r));
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

    @Override // ji.a0
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

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.F.e(arrayList);
    }

    @Override // ji.l0
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

    @Override // ji.l0
    public a getRow() {
        return this.a;
    }

    public final void h(TLRPC.Document document) {
        String str;
        u uVar;
        a aVar = this.a;
        String str2 = (aVar == null || (uVar = aVar.g) == null) ? null : uVar.e;
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
        q3 q3Var = this.S;
        MessageObject messageObject = q3Var == null ? null : q3Var.a.i3;
        imageReceiver.setImageCoords(this.K, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
        ImageLocation forDocument = closestPhotoSizeWithSize != null ? ImageLocation.getForDocument(closestPhotoSizeWithSize, document) : null;
        Drawable createStripedBitmap = ImageLoader.createStripedBitmap(document.thumbs);
        if (messageObject == null) {
            messageObject = this.T;
        }
        this.E.setImage(forDocument, "86_86", createStripedBitmap, null, messageObject, 1);
    }

    public final TLRPC.Document i() {
        u uVar;
        a aVar = this.a;
        if (aVar == null || (uVar = aVar.g) == null) {
            return null;
        }
        return uVar.h;
    }

    public final boolean j() {
        u uVar;
        a aVar = this.a;
        return (aVar == null || (uVar = aVar.g) == null || !uVar.a()) ? false : true;
    }

    public final void k() {
        int i10;
        float f7;
        u uVar;
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
        if (TextUtils.isEmpty(documentFileName) && (uVar = this.a.g) != null && !TextUtils.isEmpty(uVar.e)) {
            documentFileName = new File(this.a.g.e).getName();
        }
        if (documentFileName == null) {
            documentFileName = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(documentFileName, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j3 = i11.size;
        if (j3 <= 0) {
            u uVar2 = this.a.g;
            j3 = (uVar2 == null || TextUtils.isEmpty(uVar2.e)) ? 0L : new File(this.a.g.e).length();
        }
        this.R = new StaticLayout(AndroidUtilities.formatFileSize(j3), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (r5.exists() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(boolean z10) {
        File pathToAttach;
        u uVar;
        boolean z11 = this.L;
        org.telegram.ui.ActionBar.f6 f6Var = this.r;
        RadialProgress2 radialProgress2 = this.y;
        if (z11) {
            radialProgress2.g(org.telegram.ui.ActionBar.j6.le, org.telegram.ui.ActionBar.j6.me, org.telegram.ui.ActionBar.j6.ne, org.telegram.ui.ActionBar.j6.oe);
            radialProgress2.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.hd, f6Var);
        } else {
            radialProgress2.g(org.telegram.ui.ActionBar.j6.ie, org.telegram.ui.ActionBar.j6.je, org.telegram.ui.ActionBar.j6.uc, org.telegram.ui.ActionBar.j6.vc);
            radialProgress2.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Bd, f6Var);
        }
        boolean j3 = j();
        int i10 = this.n;
        if (j3) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            radialProgress2.o(this.a.g.f, z10);
            radialProgress2.setIcon(3, false, z10);
            return;
        }
        String attachFileName = FileLoader.getAttachFileName(i());
        a aVar = this.a;
        if (aVar != null && (uVar = aVar.g) != null && !TextUtils.isEmpty(uVar.e)) {
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
        q9 textSelectionHelper;
        if (i() == null) {
            return;
        }
        boolean z10 = this.L;
        org.telegram.ui.ActionBar.f6 f6Var = this.r;
        if (z10 && !this.E.draw(canvas)) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gd, f6Var);
            Paint paint = this.v;
            paint.setColor(v02);
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
        this.w.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Dd, f6Var));
        int dp2 = AndroidUtilities.dp(12.0f);
        if (this.Q != null) {
            canvas.save();
            canvas.translate(dp, dp2);
            this.Q.draw(canvas);
            canvas.restore();
        }
        this.x.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.nd, f6Var));
        StaticLayout staticLayout = this.Q;
        int dp3 = AndroidUtilities.dp(2.0f) + dp2 + (staticLayout == null ? 0 : staticLayout.getHeight());
        if (this.R != null) {
            canvas.save();
            canvas.translate(dp, dp3);
            this.R.draw(canvas);
            canvas.restore();
        }
        if (this.S == null || !(getParent() instanceof RecyclerView) || (textSelectionHelper = this.S.a.getTextSelectionHelper()) == null || !textSelectionHelper.y()) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int R = RecyclerView.R(this);
        if (R <= textSelectionHelper.u0 || R > textSelectionHelper.x0) {
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
    public final void onProgressDownload(String str, long j3, long j10) {
        this.y.o(j10 <= 0 ? 0.0f : Math.min(1.0f, j3 / j10), true);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.y.o(1.0f, true);
        l(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0121  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        MessageObject messageObject;
        if (motionEvent.getX() >= this.K && motionEvent.getX() <= getWidth() - AndroidUtilities.dp(12.0f) && motionEvent.getY() >= AndroidUtilities.dp(10.0f)) {
            if (motionEvent.getY() <= AndroidUtilities.dp(this.L ? 96.0f : 54.0f)) {
                z10 = true;
                if (motionEvent.getActionMasked() != 0 && z10) {
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
                    if (z10) {
                        playSoundEffect(0);
                        if (j()) {
                            q3 q3Var = this.S;
                            if (q3Var != null) {
                                a aVar = this.a;
                                v3 v3Var = q3Var.a;
                                d5 d5Var = (d5) v3Var.Z3.remove(aVar.g);
                                if (d5Var != null) {
                                    d5Var.b();
                                }
                                g2 g2Var = v3Var.J3;
                                if (g2Var != null) {
                                    g2Var.d();
                                }
                                v3Var.l3.remove(aVar);
                                v3Var.Y2.N(true);
                                g2 g2Var2 = v3Var.J3;
                                if (g2Var2 != null) {
                                    g2Var2.h();
                                }
                                v3Var.h3.onContentChanged();
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
                                    q3 q3Var2 = this.S;
                                    MessageObject messageObject2 = q3Var2 != null ? q3Var2.a.i3 : null;
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
        z10 = false;
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
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
