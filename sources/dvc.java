// default package

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dvc extends FrameLayout implements snb {
    public final mb0 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public int n;
    public int r;
    public final /* synthetic */ evc s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvc(evc evcVar, Context context) {
        super(context);
        this.s = evcVar;
        setWillNotDraw(false);
        mb0 mb0Var = new mb0((byte) 11, context, this);
        this.a = mb0Var;
        addView(mb0Var, tre.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, tre.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(aob.L0(false));
        addView(view, tre.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(aob.w0(null, aob.i7, false), aob.w0(null, aob.k7, false));
        addView(checkBox, tre.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        TLRPC.PhotoSize photoSize;
        int U0;
        int U02;
        mb0 mb0Var;
        this.h = obj;
        mb0 mb0Var2 = this.a;
        mb0Var2.setVisibility(0);
        this.b.setVisibility(4);
        mb0Var2.setBackgroundDrawable(null);
        mb0Var2.getImageReceiver().p1 = null;
        mb0Var2.getImageReceiver().setAlpha(1.0f);
        mb0Var2.getImageReceiver().P(null);
        mb0Var2.getImageReceiver().W(null);
        this.e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize w = xb4.w(tL_wallPaper.document.thumbs, hl.L(100.0f), false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(tL_wallPaper.document.thumbs, hl.L(180.0f), false, null, false);
            photoSize = w2 != w ? w2 : null;
            long j = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                TLRPC.Document document = tL_wallPaper.document;
                if (photoSize != null) {
                    mb0Var2.g(1, j, jn5.c(photoSize, document), jn5.c(w, tL_wallPaper.document), tL_wallPaper, "180_180", "100_100_b", "jpg");
                    return;
                } else {
                    mb0Var2.g(1, j, jn5.b(document), jn5.c(w, tL_wallPaper.document), tL_wallPaper, "180_180", "100_100_b", "jpg");
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                ih7 ih7Var = new ih7(wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, true, false);
                if (tL_wallPaper.settings.intensity >= 0 || !aob.I.o()) {
                    mb0Var2.setBackground(ih7Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        mb0Var2.getImageReceiver().P(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    mb0Var2.getImageReceiver().W(ih7Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                U02 = ih7.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                mb0Var2.setBackgroundColor(aob.Y0(wallPaperSettings.background_color));
                U02 = hl.U0(tL_wallPaper.settings.background_color, false);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                mb0Var2.getImageReceiver().p1 = new PorterDuffColorFilter(hl.U0(U02, false), PorterDuff.Mode.SRC_IN);
            }
            TLRPC.Document document2 = tL_wallPaper.document;
            long j2 = j;
            if (photoSize != null) {
                jn5 c = jn5.c(photoSize, document2);
                jn5 c2 = jn5.c(w, tL_wallPaper.document);
                mb0Var = mb0Var2;
                mb0Var.g(1, j2, c, c2, tL_wallPaper, "180_180", null, "jpg");
            } else {
                jn5 c3 = jn5.c(w, document2);
                mb0Var = mb0Var2;
                mb0Var.g(1, j2, c3, null, tL_wallPaper, "180_180", null, "jpg");
            }
            mb0Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof yvc)) {
            if (!(obj instanceof zvc)) {
                if (!(obj instanceof ro6)) {
                    this.e = false;
                    return;
                }
                ro6 ro6Var = (ro6) obj;
                TLRPC.Photo photo = ro6Var.K;
                if (photo == null) {
                    mb0Var2.o(ro6Var.D, "180_180", null);
                    return;
                }
                TLRPC.PhotoSize w3 = xb4.w(photo.sizes, hl.L(100.0f), false, null, false);
                TLRPC.PhotoSize w4 = xb4.w(ro6Var.K.sizes, hl.L(180.0f), false, null, false);
                photoSize = w4 != w3 ? w4 : null;
                mb0Var2.g(1, photoSize != null ? photoSize.size : 0, jn5.i(photoSize, ro6Var.K), jn5.i(w3, ro6Var.K), ro6Var, "180_180", "100_100_b", "jpg");
                return;
            }
            zvc zvcVar = (zvc) obj;
            File file = zvcVar.e;
            if (file != null) {
                mb0Var2.o(file.getAbsolutePath(), "180_180", null);
                return;
            }
            File file2 = zvcVar.d;
            if (file2 != null) {
                mb0Var2.o(file2.getAbsolutePath(), "180_180", null);
                return;
            } else if ("t".equals(zvcVar.a)) {
                mb0Var2.setImageDrawable(aob.X0(true));
                return;
            } else {
                mb0Var2.setImageResource(zvcVar.c);
                return;
            }
        }
        yvc yvcVar = (yvc) obj;
        int i = yvcVar.d;
        int i2 = yvcVar.c;
        int i3 = yvcVar.b;
        if (yvcVar.g == null && !"d".equals(yvcVar.a)) {
            mb0Var2.setImageBitmap(null);
            if (yvcVar.j) {
                mb0Var2.setBackground(new ih7(yvcVar.b, yvcVar.c, yvcVar.d, yvcVar.e, true, false));
                return;
            } else if (i2 != 0) {
                mb0Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i3 | (-16777216), i2 | (-16777216)}));
                return;
            } else {
                mb0Var2.setBackgroundColor(i3 | (-16777216));
                return;
            }
        }
        if (i != 0) {
            ih7 ih7Var2 = new ih7(yvcVar.b, yvcVar.c, yvcVar.d, yvcVar.e, true, false);
            if (yvcVar.h >= 0.0f) {
                mb0Var2.setBackground(new ih7(yvcVar.b, yvcVar.c, yvcVar.d, yvcVar.e, true, false));
                if (Build.VERSION.SDK_INT >= 29) {
                    mb0Var2.getImageReceiver().P(BlendMode.SOFT_LIGHT);
                }
            } else {
                mb0Var2.getImageReceiver().W(ih7Var2.k);
            }
            U0 = ih7.g(i3, i2, i, yvcVar.e);
        } else {
            mb0Var2.setBackground(new ih7(yvcVar.b, yvcVar.c, 0, 0, true, false));
            U0 = hl.U0(i3, false);
        }
        int i4 = U0;
        if ("d".equals(yvcVar.a)) {
            Bitmap bitmap = yvcVar.l;
            if (bitmap == null) {
                bitmap = hgb.d(R.raw.default_pattern, 100, jn7.J2, -16777216);
                yvcVar.l = bitmap;
            }
            mb0Var2.setImageBitmap(bitmap);
            mb0Var2.getImageReceiver().setAlpha(Math.abs(yvcVar.h));
            return;
        }
        TLRPC.PhotoSize w5 = xb4.w(yvcVar.g.document.thumbs, 100, false, null, false);
        mb0Var2.g(1, w5 != null ? w5.size : yvcVar.g.document.size, jn5.c(w5, yvcVar.g.document), null, yvcVar.g, "180_180", null, "jpg");
        mb0Var2.getImageReceiver().setAlpha(Math.abs(yvcVar.h));
        if (Build.VERSION.SDK_INT < 29 || i == 0) {
            mb0Var2.getImageReceiver().p1 = new PorterDuffColorFilter(hl.U0(i4, false), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        evc evcVar = this.s;
        if (!evcVar.b || !this.c.y) {
            mb0 mb0Var = this.a;
            if (mb0Var.getImageReceiver().B() && mb0Var.getImageReceiver().i1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), evcVar.s);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override // snb
    public final void updateColors() {
        try {
            int w0 = aob.w0(null, aob.i7, false);
            int w02 = aob.w0(null, aob.k7, false);
            CheckBox checkBox = this.c;
            if (checkBox != null && (w0 != this.n || w02 != this.r)) {
                this.n = w0;
                this.r = w02;
                checkBox.c(w0, w02);
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
