package nh;

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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class y6 extends View {
    public x6 A;
    public View B;
    public Object C;
    public Runnable D;
    public String E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public final int a;
    public final g9 b;
    public h9 c;
    public final org.telegram.ui.Components.d6 d;
    public final RectF e;
    public final RectF f;
    public final ImageReceiver h;
    public boolean n;
    public zz0 r;
    public zz0 s;
    public final Path v;
    public final Paint w;
    public final uc x;
    public boolean y;

    public y6(Activity activity, int i10, g9 g9Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.d6(this, 0L, 320L, jr.h);
        this.e = new RectF();
        this.f = new RectF();
        this.h = new ImageReceiver(this);
        this.v = new Path();
        this.w = new Paint(1);
        this.x = new uc(this);
        this.F = new int[2];
        this.G = new int[2];
        this.a = i10;
        this.b = g9Var;
    }

    public final void a() {
        x6 x6Var = this.A;
        if (x6Var == null) {
            return;
        }
        this.r = new zz0(x6Var.b(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.A.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            iq iqVar = new iq(R.drawable.settings_arrow, 0);
            iqVar.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(iqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.s = new zz0(spannableStringBuilder, 14.0f, null);
        this.A.d(this.h);
        this.n = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        float f10;
        Object obj;
        float e10 = this.d.e(this.y);
        zz0 zz0Var = this.r;
        if (zz0Var == null || this.s == null || e10 <= 0.0f) {
            return;
        }
        zz0Var.p = getWidth() * 0.7f;
        this.s.p = getWidth() * 0.7f;
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        float dp3 = AndroidUtilities.dp(32.0f);
        float dp4 = AndroidUtilities.dp(2.0f);
        float dp5 = AndroidUtilities.dp(11.0f);
        float max = Math.max(Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f), Math.max(this.r.c, this.s.c) + (this.n ? dp5 + dp3 + dp5 : 0.0f) + dp + AndroidUtilities.dp(15.0f) + dp);
        float max2 = Math.max(this.n ? dp3 : 0.0f, this.s.j() + this.r.j() + dp4) + dp2 + dp2;
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e10) * this.x.a(0.05f);
        float dp6 = (1.0f - e10) * AndroidUtilities.dp(15.0f);
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
        if (i10 < 29 || (obj = this.C) == null || this.B == null) {
            f9 = dp;
            f10 = 2.0f;
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(e10, -587202560));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        } else {
            RenderNode c3 = org.telegram.messenger.b.c(obj);
            Path path = this.v;
            path.rewind();
            f10 = 2.0f;
            f9 = dp;
            path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            getLocationOnScreen(this.F);
            this.B.getLocationOnScreen(this.G);
            canvas.saveLayerAlpha(rectF2, (int) (255.0f * e10), 31);
            canvas.clipPath(path);
            canvas.translate(r10[0] - r7[0], r10[1] - r7[1]);
            float max3 = Math.max(this.B.getWidth() / c3.getWidth(), this.B.getHeight() / c3.getHeight());
            canvas.scale(max3, max3);
            canvas.drawRenderNode(c3);
            canvas.restore();
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(e10, 1879048192));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        }
        canvas.save();
        canvas.translate(0.0f, dp6);
        canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
        if (this.n) {
            float f11 = dp3 / f10;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.setRoundRadius((int) f11);
            imageReceiver.setImageCoords(rectF.left + f9 + dp5, rectF.centerY() - f11, dp3, dp3);
            imageReceiver.setAlpha(e10);
            imageReceiver.draw(canvas);
        }
        float centerY = rectF.centerY() - ((this.s.j() + (this.r.j() + dp4)) / f10);
        zz0 zz0Var2 = this.r;
        zz0Var2.c(rectF.left + (this.n ? dp5 + dp3 + dp5 : 0.0f) + f9, (zz0Var2.j() / f10) + centerY, e10, -1, canvas);
        this.s.c(rectF.left + (this.n ? dp3 + dp5 + dp5 : 0.0f) + f9, this.r.j() + centerY + dp4 + (this.s.j() / f10), e10, org.telegram.ui.ActionBar.g6.v(-16777216, -1610612737), canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        h9 h9Var;
        boolean z10 = this.y;
        uc ucVar = this.x;
        if (!z10 || this.A == null) {
            this.H = false;
            ucVar.c(false);
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.e;
        if (action == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                this.H = true;
                ucVar.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            if (ucVar.h && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                ucVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (ucVar.h && (h9Var = this.c) != null && this.A != null) {
                h9Var.run(new u6(this, 1));
            }
            ucVar.c(false);
            this.H = false;
        } else if (motionEvent.getAction() == 3) {
            ucVar.c(false);
            this.H = false;
        }
        return this.H || ucVar.h;
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
        g9 g9Var = this.b;
        Runnable runnable = null;
        if (isEmpty) {
            Runnable runnable2 = this.D;
            if (runnable2 != null) {
                runnable2.run();
                this.D = null;
            }
            if (this.y) {
                invalidate();
            }
            this.y = false;
            this.E = null;
            if (g9Var != null) {
                g9Var.run();
                return;
            }
            return;
        }
        x6 x6Var = this.A;
        if (!(x6Var == null && this.D == null) && (x6Var == null || TextUtils.equals(x6Var.a, str) || TextUtils.equals(this.E, str))) {
            x6 x6Var2 = this.A;
            if (x6Var2 == null || this.y || !TextUtils.equals(x6Var2.a, str)) {
                return;
            }
            this.y = true;
            a();
            invalidate();
            if (g9Var != null) {
                g9Var.run();
                return;
            }
            return;
        }
        Runnable runnable3 = this.D;
        if (runnable3 != null) {
            runnable3.run();
            this.D = null;
        }
        this.A = null;
        this.E = str;
        int i10 = this.a;
        u6 u6Var = new u6(this, 0);
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
                            u6Var.run(new v6(str, (TLRPC.User) userOrChat));
                        } else if (userOrChat instanceof TLRPC.Chat) {
                            u6Var.run(new w6(str, (TLRPC.Chat) userOrChat));
                        }
                    }
                    runnable = messagesController.getUserNameResolver().resolve(str3, queryParameter, new cg.f0(u6Var, messagesController, str, 1));
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            u6Var.run(runnable);
        }
        this.D = runnable;
    }
}
