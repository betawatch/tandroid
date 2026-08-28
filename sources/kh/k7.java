package kh;

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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k7 extends View {
    public j7 A;
    public View B;
    public Object C;
    public Runnable D;
    public String E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public final int a;
    public final v9 b;
    public w9 c;
    public final org.telegram.ui.Components.y5 d;
    public final RectF e;
    public final RectF f;
    public final ImageReceiver h;
    public boolean n;
    public nz0 r;
    public nz0 s;
    public final Path v;
    public final Paint w;
    public final org.telegram.ui.Components.pc x;
    public boolean y;

    public k7(Activity activity, int i9, v9 v9Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.y5(this, 0L, 320L, gr.h);
        this.e = new RectF();
        this.f = new RectF();
        this.h = new ImageReceiver(this);
        this.v = new Path();
        this.w = new Paint(1);
        this.x = new org.telegram.ui.Components.pc(this);
        this.F = new int[2];
        this.G = new int[2];
        this.a = i9;
        this.b = v9Var;
    }

    public final void a() {
        j7 j7Var = this.A;
        if (j7Var == null) {
            return;
        }
        this.r = new nz0(j7Var.b(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.A.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            eq eqVar = new eq(R.drawable.settings_arrow, 0);
            eqVar.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.s = new nz0(spannableStringBuilder, 14.0f, null);
        this.A.d(this.h);
        this.n = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        Object obj;
        float e10 = this.d.e(this.y);
        nz0 nz0Var = this.r;
        if (nz0Var == null || this.s == null || e10 <= 0.0f) {
            return;
        }
        nz0Var.p = getWidth() * 0.7f;
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
        int i9 = Build.VERSION.SDK_INT;
        Paint paint = this.w;
        if (i9 < 29 || (obj = this.C) == null || this.B == null) {
            f10 = dp;
            f11 = 2.0f;
            paint.setColor(org.telegram.ui.ActionBar.f6.l1(e10, -587202560));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        } else {
            RenderNode c10 = org.telegram.messenger.b.c(obj);
            Path path = this.v;
            path.rewind();
            f11 = 2.0f;
            f10 = dp;
            path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            getLocationOnScreen(this.F);
            this.B.getLocationOnScreen(this.G);
            canvas.saveLayerAlpha(rectF2, (int) (255.0f * e10), 31);
            canvas.clipPath(path);
            canvas.translate(r10[0] - r7[0], r10[1] - r7[1]);
            float max3 = Math.max(this.B.getWidth() / c10.getWidth(), this.B.getHeight() / c10.getHeight());
            canvas.scale(max3, max3);
            canvas.drawRenderNode(c10);
            canvas.restore();
            paint.setColor(org.telegram.ui.ActionBar.f6.l1(e10, 1879048192));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        }
        canvas.save();
        canvas.translate(0.0f, dp6);
        canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
        if (this.n) {
            float f12 = dp3 / f11;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.setRoundRadius((int) f12);
            imageReceiver.setImageCoords(rectF.left + f10 + dp5, rectF.centerY() - f12, dp3, dp3);
            imageReceiver.setAlpha(e10);
            imageReceiver.draw(canvas);
        }
        float centerY = rectF.centerY() - ((this.s.j() + (this.r.j() + dp4)) / f11);
        nz0 nz0Var2 = this.r;
        nz0Var2.c(rectF.left + (this.n ? dp5 + dp3 + dp5 : 0.0f) + f10, (nz0Var2.j() / f11) + centerY, e10, -1, canvas);
        this.s.c(rectF.left + (this.n ? dp3 + dp5 + dp5 : 0.0f) + f10, this.r.j() + centerY + dp4 + (this.s.j() / f11), e10, org.telegram.ui.ActionBar.f6.v(-16777216, -1610612737), canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        w9 w9Var;
        boolean z10 = this.y;
        org.telegram.ui.Components.pc pcVar = this.x;
        if (!z10 || this.A == null) {
            this.H = false;
            pcVar.c(false);
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.e;
        if (action == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                this.H = true;
                pcVar.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            if (pcVar.h && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                pcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (pcVar.h && (w9Var = this.c) != null && this.A != null) {
                w9Var.run(new f7(this, 1));
            }
            pcVar.c(false);
            this.H = false;
        } else if (motionEvent.getAction() == 3) {
            pcVar.c(false);
            this.H = false;
        }
        return this.H || pcVar.h;
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
        v9 v9Var = this.b;
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
            if (v9Var != null) {
                v9Var.run();
                return;
            }
            return;
        }
        j7 j7Var = this.A;
        if (!(j7Var == null && this.D == null) && (j7Var == null || TextUtils.equals(j7Var.a, str) || TextUtils.equals(this.E, str))) {
            j7 j7Var2 = this.A;
            if (j7Var2 == null || this.y || !TextUtils.equals(j7Var2.a, str)) {
                return;
            }
            this.y = true;
            a();
            invalidate();
            if (v9Var != null) {
                v9Var.run();
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
        int i9 = this.a;
        f7 f7Var = new f7(this, 0);
        try {
            MessagesController messagesController = MessagesController.getInstance(i9);
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
                            f7Var.run(new h7(str, (TLRPC.User) userOrChat));
                        } else if (userOrChat instanceof TLRPC.Chat) {
                            f7Var.run(new i7(str, (TLRPC.Chat) userOrChat));
                        }
                    }
                    runnable = messagesController.getUserNameResolver().resolve(str3, queryParameter, new g7(f7Var, messagesController, str, 0));
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            f7Var.run(runnable);
        }
        this.D = runnable;
    }
}
