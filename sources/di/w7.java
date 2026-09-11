package di;

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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class w7 extends View {
    public v7 E;
    public View F;
    public Object G;
    public Runnable H;
    public String I;
    public final int[] J;
    public final int[] K;
    public boolean L;
    public final int a;
    public final ka b;
    public la c;
    public final org.telegram.ui.Components.e6 d;
    public final RectF e;
    public final RectF f;
    public final ImageReceiver h;
    public boolean n;
    public f01 r;
    public f01 s;
    public final Path v;
    public final Paint w;
    public final org.telegram.ui.Components.zc x;
    public boolean y;

    public w7(Activity activity, int i10, ka kaVar) {
        super(activity);
        this.d = new org.telegram.ui.Components.e6(this, 0L, 320L, pr.h);
        this.e = new RectF();
        this.f = new RectF();
        this.h = new ImageReceiver(this);
        this.v = new Path();
        this.w = new Paint(1);
        this.x = new org.telegram.ui.Components.zc(this);
        this.J = new int[2];
        this.K = new int[2];
        this.a = i10;
        this.b = kaVar;
    }

    public final void a() {
        v7 v7Var = this.E;
        if (v7Var == null) {
            return;
        }
        this.r = new f01(v7Var.b(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.E.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            nq nqVar = new nq(R.drawable.settings_arrow, 0);
            nqVar.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.s = new f01(spannableStringBuilder, 14.0f, null);
        this.E.d(this.h);
        this.n = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        Object obj;
        float e7 = this.d.e(this.y);
        f01 f01Var = this.r;
        if (f01Var == null || this.s == null || e7 <= 0.0f) {
            return;
        }
        f01Var.p = getWidth() * 0.7f;
        this.s.p = getWidth() * 0.7f;
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        float dp3 = AndroidUtilities.dp(32.0f);
        float dp4 = AndroidUtilities.dp(2.0f);
        float dp5 = AndroidUtilities.dp(11.0f);
        float max = Math.max(Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f), Math.max(this.r.c, this.s.c) + (this.n ? dp5 + dp3 + dp5 : 0.0f) + dp + AndroidUtilities.dp(15.0f) + dp);
        float max2 = Math.max(this.n ? dp3 : 0.0f, this.s.j() + this.r.j() + dp4) + dp2 + dp2;
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e7) * this.x.a(0.05f);
        float dp6 = (1.0f - e7) * AndroidUtilities.dp(15.0f);
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
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(e7, -587202560));
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
            canvas.saveLayerAlpha(rectF2, (int) (255.0f * e7), 31);
            canvas.clipPath(path);
            canvas.translate(r10[0] - r7[0], r10[1] - r7[1]);
            float max3 = Math.max(this.F.getWidth() / c10.getWidth(), this.F.getHeight() / c10.getHeight());
            canvas.scale(max3, max3);
            canvas.drawRenderNode(c10);
            canvas.restore();
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(e7, 1879048192));
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
            imageReceiver.setAlpha(e7);
            imageReceiver.draw(canvas);
        }
        float centerY = rectF.centerY() - ((this.s.j() + (this.r.j() + dp4)) / f10);
        f01 f01Var2 = this.r;
        f01Var2.c(rectF.left + (this.n ? dp5 + dp3 + dp5 : 0.0f) + f7, (f01Var2.j() / f10) + centerY, e7, -1, canvas);
        this.s.c(rectF.left + (this.n ? dp3 + dp5 + dp5 : 0.0f) + f7, this.r.j() + centerY + dp4 + (this.s.j() / f10), e7, org.telegram.ui.ActionBar.j6.v(-16777216, -1610612737), canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        la laVar;
        boolean z10 = this.y;
        org.telegram.ui.Components.zc zcVar = this.x;
        if (!z10 || this.E == null) {
            this.L = false;
            zcVar.c(false);
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.e;
        if (action == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                this.L = true;
                zcVar.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            if (zcVar.h && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                zcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (zcVar.h && (laVar = this.c) != null && this.E != null) {
                laVar.run(new r7(this, 1));
            }
            zcVar.c(false);
            this.L = false;
        } else if (motionEvent.getAction() == 3) {
            zcVar.c(false);
            this.L = false;
        }
        return this.L || zcVar.h;
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
        ka kaVar = this.b;
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
            if (kaVar != null) {
                kaVar.run();
                return;
            }
            return;
        }
        v7 v7Var = this.E;
        if (!(v7Var == null && this.H == null) && (v7Var == null || TextUtils.equals(v7Var.a, str) || TextUtils.equals(this.I, str))) {
            v7 v7Var2 = this.E;
            if (v7Var2 == null || this.y || !TextUtils.equals(v7Var2.a, str)) {
                return;
            }
            this.y = true;
            a();
            invalidate();
            if (kaVar != null) {
                kaVar.run();
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
        r7 r7Var = new r7(this, 0);
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
                            r7Var.run(new t7(str, (TLRPC.User) userOrChat));
                        } else if (userOrChat instanceof TLRPC.Chat) {
                            r7Var.run(new u7(str, (TLRPC.Chat) userOrChat));
                        }
                    }
                    runnable = messagesController.getUserNameResolver().resolve(str3, queryParameter, new s7(r7Var, messagesController, str, 0));
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
            r7Var.run(runnable);
        }
        this.H = runnable;
    }
}
