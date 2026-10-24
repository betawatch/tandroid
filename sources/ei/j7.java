package ei;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class j7 extends View {
    public i7 E;
    public View F;
    public Object G;
    public Runnable H;
    public String I;
    public final int[] J;
    public final int[] K;
    public boolean L;
    public final int a;
    public final t9 b;
    public u9 c;
    public final org.telegram.ui.Components.f6 d;
    public final RectF e;
    public final RectF f;
    public final ImageReceiver h;
    public boolean n;
    public i11 r;
    public i11 s;
    public final Path v;
    public final Paint w;
    public final yc x;
    public boolean y;

    public j7(Activity activity, int i10, t9 t9Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.f6(this, 0L, 320L, bs.h);
        this.e = new RectF();
        this.f = new RectF();
        this.h = new ImageReceiver(this);
        this.v = new Path();
        this.w = new Paint(1);
        this.x = new yc(this);
        this.J = new int[2];
        this.K = new int[2];
        this.a = i10;
        this.b = t9Var;
    }

    public final void a() {
        i7 i7Var = this.E;
        if (i7Var == null) {
            return;
        }
        this.r = new i11(i7Var.b(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.E.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            xq xqVar = new xq(R.drawable.settings_arrow, 0);
            xqVar.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(xqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.s = new i11(spannableStringBuilder, 14.0f, null);
        this.E.d(this.h);
        this.n = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        Object obj;
        float e = this.d.e(this.y);
        i11 i11Var = this.r;
        if (i11Var == null || this.s == null || e <= 0.0f) {
            return;
        }
        i11Var.p = getWidth() * 0.7f;
        this.s.p = getWidth() * 0.7f;
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        float dp3 = AndroidUtilities.dp(32.0f);
        float dp4 = AndroidUtilities.dp(2.0f);
        float dp5 = AndroidUtilities.dp(11.0f);
        float max = Math.max(Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f), Math.max(this.r.c, this.s.c) + (this.n ? dp5 + dp3 + dp5 : 0.0f) + dp + AndroidUtilities.dp(15.0f) + dp);
        float max2 = Math.max(this.n ? dp3 : 0.0f, this.s.j() + this.r.j() + dp4) + dp2 + dp2;
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e) * this.x.a(0.05f);
        float dp6 = (1.0f - e) * AndroidUtilities.dp(15.0f);
        float width = (getWidth() - max) / 2.0f;
        float height = (getHeight() - max2) / 2.0f;
        float width2 = (getWidth() + max) / 2.0f;
        float height2 = (getHeight() + max2) / 2.0f;
        RectF rectF = this.e;
        rectF.set(width, height, width2, height2);
        RectF rectF2 = this.f;
        rectF2.set(rectF);
        AndroidUtilities.scaleRect(rectF2, lerp);
        rectF2.offset(0.0f, dp6);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.w;
        if (i10 < 29 || (obj = this.G) == null || this.F == null) {
            f7 = dp;
            f10 = 2.0f;
            paint.setColor(org.telegram.ui.ActionBar.k6.o1(e, -587202560));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        } else {
            RenderNode c10 = org.telegram.messenger.b.c(obj);
            Path path = this.v;
            path.rewind();
            f10 = 2.0f;
            f7 = dp;
            path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            getLocationOnScreen(this.J);
            this.F.getLocationOnScreen(this.K);
            canvas.saveLayerAlpha(rectF2, (int) (255.0f * e), 31);
            canvas.clipPath(path);
            canvas.translate(r10[0] - r7[0], r10[1] - r7[1]);
            float max3 = Math.max(this.F.getWidth() / c10.getWidth(), this.F.getHeight() / c10.getHeight());
            canvas.scale(max3, max3);
            canvas.drawRenderNode(c10);
            canvas.restore();
            paint.setColor(org.telegram.ui.ActionBar.k6.o1(e, 1879048192));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        }
        canvas.save();
        canvas.translate(0.0f, dp6);
        canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
        if (this.n) {
            float f11 = dp3 / f10;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.setRoundRadius((int) f11);
            imageReceiver.setImageCoords(rectF.left + f7 + dp5, rectF.centerY() - f11, dp3, dp3);
            imageReceiver.setAlpha(e);
            imageReceiver.draw(canvas);
        }
        float centerY = rectF.centerY() - ((this.s.j() + (this.r.j() + dp4)) / f10);
        i11 i11Var2 = this.r;
        i11Var2.c(rectF.left + (this.n ? dp5 + dp3 + dp5 : 0.0f) + f7, (i11Var2.j() / f10) + centerY, e, -1, canvas);
        this.s.c(rectF.left + (this.n ? dp3 + dp5 + dp5 : 0.0f) + f7, this.r.j() + centerY + dp4 + (this.s.j() / f10), e, org.telegram.ui.ActionBar.k6.v(-16777216, -1610612737), canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        u9 u9Var;
        boolean z10 = this.y;
        yc ycVar = this.x;
        if (!z10 || this.E == null) {
            this.L = false;
            ycVar.c(false);
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.e;
        if (action == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                this.L = true;
                ycVar.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            if (ycVar.i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                ycVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (ycVar.i && (u9Var = this.c) != null && this.E != null) {
                u9Var.run(new f7(this, 1));
            }
            ycVar.c(false);
            this.L = false;
        } else if (motionEvent.getAction() == 3) {
            ycVar.c(false);
            this.L = false;
        }
        return this.L || ycVar.i;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.onDetachedFromWindow();
    }

    public void setLink(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        t9 t9Var = this.b;
        Runnable runnable = null;
        if (isEmpty) {
            Runnable runnable2 = this.H;
            if (runnable2 != null) {
                runnable2.run();
                this.H = null;
            }
            if (this.y) {
                invalidate();
            }
            this.y = false;
            this.I = null;
            if (t9Var != null) {
                t9Var.run();
                return;
            }
            return;
        }
        i7 i7Var = this.E;
        if (!(i7Var == null && this.H == null) && (i7Var == null || TextUtils.equals(i7Var.a, str) || TextUtils.equals(this.I, str))) {
            i7 i7Var2 = this.E;
            if (i7Var2 == null || this.y || !TextUtils.equals(i7Var2.a, str)) {
                return;
            }
            this.y = true;
            a();
            invalidate();
            if (t9Var != null) {
                t9Var.run();
                return;
            }
            return;
        }
        Runnable runnable3 = this.H;
        if (runnable3 != null) {
            runnable3.run();
            this.H = null;
        }
        this.E = null;
        this.I = str;
        int i10 = this.a;
        f7 f7Var = new f7(this, 0);
        try {
            MessagesController messagesController = MessagesController.getInstance(i10);
            String str2 = messagesController.linkPrefix;
            Uri parse = Uri.parse(str);
            if (TextUtils.equals(parse.getHost(), str2)) {
                List<String> pathSegments = parse.getPathSegments();
                if (!pathSegments.isEmpty()) {
                    String str3 = pathSegments.get(0);
                    String queryParameter = parse.getQueryParameter("ref");
                    if (TextUtils.isEmpty(queryParameter)) {
                        TLObject userOrChat = messagesController.getUserOrChat(str3);
                        if (userOrChat instanceof TLRPC.User) {
                            f7Var.run(new g7(str, (TLRPC.User) userOrChat));
                        } else if (userOrChat instanceof TLRPC.Chat) {
                            f7Var.run(new h7(str, (TLRPC.Chat) userOrChat));
                        }
                    }
                    runnable = messagesController.getUserNameResolver().resolve(str3, queryParameter, new ai.a4(f7Var, messagesController, str, 4));
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            f7Var.run(runnable);
        }
        this.H = runnable;
    }
}
