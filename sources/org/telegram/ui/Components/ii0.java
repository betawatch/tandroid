package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ii0 extends View {
    public float E;
    public int F;
    public RenderNode G;
    public float H;
    public float I;
    public float J;
    public final org.telegram.ui.ActionBar.d6 a;
    public final PorterDuffColorFilter b;
    public final PorterDuffColorFilter c;
    public f11 d;
    public f11 e;
    public final Paint f;
    public final Paint h;
    public final Path n;
    public final Drawable r;
    public final RectF s;
    public final Paint v;
    public final Path w;
    public final zc x;
    public int y;

    public ii0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.b = new PorterDuffColorFilter(-1, mode);
        this.c = new PorterDuffColorFilter(-16777216, mode);
        this.f = new Paint();
        Paint paint = new Paint();
        this.h = paint;
        Path path = new Path();
        this.n = path;
        this.s = new RectF();
        this.v = new Paint(1);
        new Paint(1);
        this.w = new Path();
        this.x = new zc(this);
        this.y = -1;
        this.a = d6Var;
        this.r = context.getResources().getDrawable(R.drawable.files_music).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(0.0f, -AndroidUtilities.dpf2(3.33f));
        path.lineTo(AndroidUtilities.dpf2(3.16f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dpf2(3.33f));
        setColor(null);
        c("Author", " - Title");
    }

    public final void a() {
        boolean z10 = this.E < 0.8f && AndroidUtilities.computePerceivedBrightness(this.F) > 0.85f;
        this.y = z10 ? -16777216 : -1;
        this.r.setColorFilter(z10 ? this.c : this.b);
        this.f.setColor(this.y);
        this.h.setColor(org.telegram.ui.ActionBar.i6.l1(0.85f, this.y));
        invalidate();
    }

    public final void b() {
        if (this.G != null) {
            this.G = null;
            invalidate();
        }
    }

    public final void c(String str, String str2) {
        this.d = new f11(str, 11.0f, AndroidUtilities.bold());
        this.e = new f11(str2, 11.0f, null);
        setContentDescription(LocaleController.getString(R.string.AccDescrProfileMusic) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.clamp01(this.J / AndroidUtilities.dp(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.s;
        zc zcVar = this.x;
        if (action == 0) {
            zcVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && zcVar.h) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                zcVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            zcVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (zcVar.h) {
                performClick();
            }
            zcVar.c(false);
        }
        return zcVar.h;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d == null || this.e == null) {
            return;
        }
        float clamp01 = Utilities.clamp01(this.J / AndroidUtilities.dp(21.0f));
        float a2 = this.x.a(0.02f);
        if (clamp01 <= 0.0f) {
            return;
        }
        int width = getWidth() - (AndroidUtilities.dp(12.0f) * 2);
        this.d.p = (width - AndroidUtilities.dp(35.0f)) / 2.0f;
        this.e.p = (width - this.d.l()) - AndroidUtilities.dp(35.0f);
        float l4 = this.e.l() + this.d.l() + AndroidUtilities.dp(16.6f) + AndroidUtilities.dp(8.0f);
        float dp = AndroidUtilities.dp(16.0f) + l4;
        canvas.save();
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        RectF rectF = this.s;
        rectF.set((getWidth() - dp) / 2.0f, AndroidUtilities.dp(10.0f), (getWidth() + dp) / 2.0f, (AndroidUtilities.dp(17.0f) * clamp01) + AndroidUtilities.dp(10.0f));
        Paint paint = this.v;
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * clamp01));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
        paint.setAlpha(alpha);
        Path path = this.w;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        if (this.G != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            canvas.save();
            canvas.translate(0.0f, this.I);
            float f7 = this.H;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(this.G);
            canvas.restore();
        }
        canvas.translate((getWidth() - l4) / 2.0f, 0.0f);
        float height = getHeight() / 2.0f;
        AndroidUtilities.dp(6.0f);
        AndroidUtilities.dp(2.0f);
        int dp2 = AndroidUtilities.dp(13.0f);
        int i10 = (int) height;
        int i11 = dp2 / 2;
        int i12 = i10 - i11;
        int i13 = i10 + i11;
        Drawable drawable = this.r;
        drawable.setBounds(0, i12, dp2, i13);
        drawable.draw(canvas);
        canvas.translate(AndroidUtilities.dp(16.6f), 0.0f);
        this.d.c(0.0f, height, clamp01, this.y, canvas);
        canvas.translate(this.d.l(), 0.0f);
        this.e.c(0.0f, height, clamp01 * 0.85f, this.y, canvas);
        canvas.translate(this.e.l(), 0.0f);
        float dpf2 = AndroidUtilities.dpf2(1.16f);
        Paint paint2 = this.h;
        paint2.setStrokeWidth(dpf2);
        canvas.translate(AndroidUtilities.dpf2(4.8f), height);
        canvas.drawPath(this.n, paint2);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), TLObject.FLAG_30));
    }

    public void setColor(MessagesController.PeerColor peerColor) {
        int bgColor1;
        int bgColor2;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        if (peerColor == null) {
            bgColor1 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.s8, d6Var);
            bgColor2 = bgColor1;
        } else {
            bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.i6.I.q());
            bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.i6.I.q());
        }
        if (peerColor == null) {
            this.F = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, d6Var);
        } else {
            this.F = org.telegram.ui.ActionBar.i6.b(0.04f, -0.09f, i0.a.d(0.15f, bgColor1, bgColor2));
        }
        this.v.setColor(this.F);
        a();
    }

    public void setMusicDocument(TLRPC.Document document) {
        String str;
        int i10 = 0;
        String str2 = null;
        if (document != null) {
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    str = documentAttribute.performer;
                    break;
                }
            }
        }
        str = null;
        if (document != null) {
            while (true) {
                if (i10 < document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i10);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        str2 = documentAttribute2.title;
                        if (str2 == null || str2.length() == 0) {
                            str2 = FileLoader.getDocumentFileName(document);
                        }
                    } else {
                        i10++;
                    }
                } else {
                    String documentFileName = FileLoader.getDocumentFileName(document);
                    if (!TextUtils.isEmpty(documentFileName)) {
                        str2 = documentFileName;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                str = LocaleController.getString(R.string.AudioUnknownArtist);
                str2 = org.telegram.messenger.q.g(R.string.AudioUnknownTitle, new StringBuilder(" - "));
            } else {
                str = "";
            }
        } else if (TextUtils.isEmpty(str2)) {
            str2 = "";
        } else {
            str2 = " - " + ((Object) str2);
        }
        c(str, str2);
    }

    public void setParentExpanded(float f7) {
        if (this.E != f7) {
            this.E = f7;
            a();
            invalidate();
        }
    }
}
