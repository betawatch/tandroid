package nh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class m7 {
    public static q20 b;
    public static q20 c;
    public static q20 d;
    public static Paint e;
    public static RectF f;
    public static Paint g;
    public static Paint h;
    public static k01 i;
    public static int j;
    public static BitmapDrawable m;
    public static final q20[] a = new q20[2];
    public static final Paint[] k = new Paint[2];
    public static final int[] l = new int[2];
    public static final RectF n = new RectF();
    public static final androidx.emoji2.text.n o = new androidx.emoji2.text.n(2);
    public static final RectF p = new RectF();
    public static final Path q = new Path();
    public static final Matrix r = new Matrix();
    public static final PathMeasure s = new PathMeasure();
    public static final Path t = new Path();

    public static void a(org.telegram.ui.ActionBar.k5 k5Var) {
        String string = LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") <= 0) {
            k5Var.l(string, false);
            return;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        o9 o9Var = new o9();
        valueOf.setSpan(o9Var, valueOf.length() - 1, valueOf.length(), 0);
        o9Var.a = k5Var;
        o9Var.n = true;
        k5Var.l(valueOf, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user == null || storyItem.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || v(storyItem)) {
            return;
        }
        if (storyItem.views == null) {
            storyItem.views = new TL_stories.TL_storyViews();
        }
        TL_stories.StoryViews storyViews = storyItem.views;
        if (storyViews.views_count == 0) {
            storyViews.views_count = 1;
            storyViews.recent_viewers.add(Long.valueOf(user.id));
        }
    }

    public static void c(org.telegram.ui.ActionBar.f6 f6Var) {
        if (e == null) {
            Paint paint = new Paint(1);
            e = paint;
            paint.setStyle(Paint.Style.STROKE);
            e.setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            e.setStrokeCap(Paint.Cap.ROUND);
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var);
        if (j != v02) {
            j = v02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(v02);
            if (computePerceivedBrightness >= 0.721f) {
                e.setColor(i0.a.d(0.2f, v02, -16777216));
            } else if (computePerceivedBrightness < 0.25f) {
                e.setColor(i0.a.d(0.2f, v02, -1));
            } else {
                e.setColor(i0.a.d(0.44f, v02, -1));
            }
        }
    }

    public static void d(org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        Paint[] paintArr = k;
        if (paintArr[z4 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z4 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z4 ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            paintArr[z4 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(!z4 ? org.telegram.ui.ActionBar.j6.s8 : org.telegram.ui.ActionBar.j6.M8, f6Var);
        int[] iArr = l;
        if (iArr[z4 ? 1 : 0] != v02) {
            iArr[z4 ? 1 : 0] = v02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(v02);
            if (computePerceivedBrightness >= 0.721f) {
                paintArr[z4 ? 1 : 0].setColor(i0.a.d(0.2f, v02, -16777216));
            } else if (computePerceivedBrightness < 0.25f) {
                paintArr[z4 ? 1 : 0].setColor(i0.a.d(0.2f, v02, -1));
            } else {
                paintArr[z4 ? 1 : 0].setColor(i0.a.d(0.44f, v02, -1));
            }
        }
    }

    public static SpannableStringBuilder e(int i10, boolean z4, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.formatString(i10, objArr));
        lq lqVar = new lq(R.drawable.msg_mini_bomb, 0);
        if (z4) {
            lqVar.setScale(0.8f, 0.8f);
        } else {
            lqVar.setTopOffset(-1);
        }
        spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString(R.string.Story));
        spannableStringBuilder.setSpan(new lq(R.drawable.msg_mini_replystory2, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, float f12, float f13) {
        float f14;
        boolean z4;
        float f15 = f11 - f10;
        if (f10 >= f12 || f11 >= f12 + f15) {
            f14 = f10;
            z4 = false;
        } else {
            f14 = f10;
            canvas.drawArc(rectF, f14, Math.min(f11, f12) - f10, false, paint);
            z4 = true;
        }
        float max = Math.max(f14, f13);
        float min = Math.min(f11, f12 + 360.0f);
        if (min >= max) {
            canvas.drawArc(rectF, max, min - max, false, paint);
        } else {
            if (z4) {
                return;
            }
            if (f14 <= f12 || f11 >= f13) {
                canvas.drawArc(rectF, f14, f15, false, paint);
            }
        }
    }

    public static void h(long j10, Canvas canvas, ImageReceiver imageReceiver, i7 i7Var) {
        i(j10, canvas, imageReceiver, UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j10 && MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(j10), i7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x0467, code lost:
    
        if (r1 == 1) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0269, code lost:
    
        if (r35.B == 1.0f) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04cf A[LOOP:0: B:185:0x04cb->B:187:0x04cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x048a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(long j10, Canvas canvas, ImageReceiver imageReceiver, boolean z4, i7 i7Var) {
        int r10;
        int i10;
        float lerp;
        float f10;
        int i11;
        Canvas canvas2;
        int i12;
        t6 t6Var;
        float f11;
        int i13;
        float f12;
        float f13;
        RectF rectF;
        float f14;
        ImageReceiver imageReceiver2;
        i7 i7Var2;
        boolean z10;
        t6 t6Var2;
        float f15;
        ImageReceiver imageReceiver3;
        i7 i7Var3;
        RectF rectF2;
        float f16;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        float dpf2;
        float f17;
        float f18;
        float w10;
        int i14;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        float dpf22;
        float f19;
        float w11;
        q20 q20Var;
        float w12;
        t6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z11 = i7Var.b;
        RectF rectF3 = i7Var.F;
        boolean z12 = i7Var.E;
        if (i7Var.x != j10) {
            i7Var.x = j10;
            i7Var.g();
            z11 = false;
        }
        boolean z13 = storiesController.j.get(j10, 0) == 1;
        boolean z14 = ChatObject.isForum(UserConfig.selectedAccount, j10) && !i7Var.D;
        boolean z15 = i7Var.r ? !storiesController.h.isEmpty() : z4;
        if (i7Var.d != null) {
            storiesController.D(i7Var.c, j10);
            z13 = false;
        }
        if (z13) {
            if (storiesController.I(j10)) {
                r10 = 3;
                i10 = 2;
            } else {
                i10 = r(storiesController, j10);
                r10 = 3;
            }
            z11 = false;
        } else if (!z15) {
            r10 = r(storiesController, j10);
            i10 = r10;
        } else if (i7Var.a) {
            r10 = 2;
            i10 = 2;
        } else {
            int D = storiesController.D(i7Var.c, j10);
            i10 = D;
            r10 = D == 0 ? 2 : 1;
        }
        int i15 = i7Var.z;
        if (i15 != 0) {
            r10 = i15;
            i10 = r10;
        }
        int i16 = i7Var.y;
        if (i16 != r10) {
            if (i16 == 3) {
                z11 = true;
            }
            if (r10 == 3) {
                i7Var.q = i10;
                i7Var.t = 0.0f;
            }
            if (z11) {
                i7Var.A = i16;
                i7Var.y = r10;
                i7Var.B = 0.0f;
            } else {
                i7Var.y = r10;
                i7Var.B = 1.0f;
            }
        }
        rc rcVar = i7Var.H;
        float a2 = rcVar != null ? rcVar.a(0.08f) : 1.0f;
        if (i7Var.C != z13 && z13) {
            i7Var.K = 1.0f;
            i7Var.L = false;
        }
        i7Var.C = z13;
        if (i7Var.y == 0 && i7Var.B == 1.0f) {
            imageReceiver.setImageCoords(rectF3);
            canvas.save();
            canvas.scale(a2, a2, rectF3.centerX(), rectF3.centerY());
            imageReceiver.draw(canvas);
            canvas.restore();
            return;
        }
        int save = canvas.save();
        if (a2 != 1.0f) {
            canvas.scale(a2, a2, rectF3.centerX(), rectF3.centerY());
        }
        float f20 = storiesController.F(i7Var.x) ? i7Var.e : 0.0f;
        float f21 = i7Var.B;
        if (f21 != 1.0f) {
            f21 = mr.f.getInterpolation(f21);
        }
        float f22 = f21;
        if (!z12 || i7Var.v) {
            int i17 = i7Var.A;
            int i18 = i7Var.q;
            if (i17 == 3) {
                i17 = i18;
            }
            int dp = i17 == 2 ? AndroidUtilities.dp(3.0f) : i17 == 1 ? AndroidUtilities.dp(4.0f) : 0;
            int i19 = i7Var.y;
            int i20 = i7Var.q;
            if (i19 == 3) {
                i19 = i20;
            }
            lerp = AndroidUtilities.lerp(dp, i19 == 2 ? AndroidUtilities.dp(3.0f) : i19 == 1 ? AndroidUtilities.dp(4.0f) : 0, i7Var.B);
        } else {
            lerp = 0.0f;
        }
        RectF rectF4 = n;
        if (lerp == 0.0f) {
            imageReceiver.setImageCoords(rectF3);
        } else {
            rectF4.set(rectF3);
            rectF4.inset(lerp, lerp);
            imageReceiver.setImageCoords(rectF4);
        }
        if (f20 > 0.0f) {
            f13 = 1.0f;
            f10 = lerp;
            rectF = rectF4;
            i11 = i10;
            t6Var = storiesController;
            i12 = save;
            f11 = f20;
            i13 = 3;
            f12 = 0.08f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(rectF4.left - AndroidUtilities.dp(15.0f), rectF4.top - AndroidUtilities.dp(15.0f), rectF4.right + AndroidUtilities.dp(15.0f), rectF4.bottom + AndroidUtilities.dp(15.0f), 255, 31);
        } else {
            f10 = lerp;
            i11 = i10;
            canvas2 = canvas;
            i12 = save;
            t6Var = storiesController;
            f11 = f20;
            i13 = 3;
            f12 = 0.08f;
            f13 = 1.0f;
            rectF = rectF4;
        }
        int i21 = i7Var.A;
        q20[] q20VarArr = a;
        if ((i21 == 1 && i7Var.B != f13) || i7Var.y == 1) {
            if (i11 == 2) {
                o(imageReceiver);
                q20Var = b;
            } else if (i11 == i13) {
                q(imageReceiver);
                q20Var = c;
            } else {
                t(imageReceiver, z12);
                q20Var = q20VarArr[z12 ? 1 : 0];
            }
            boolean z16 = i7Var.A == 1 && i7Var.B != f13;
            float f23 = (!z12 || i7Var.v) ? 0.0f : -AndroidUtilities.dp(4.0f);
            if (z16) {
                w12 = (AndroidUtilities.dp(5.0f) * f22) + f23;
                q20Var.c.setAlpha((int) ((f13 - f22) * i7Var.u * 255.0f));
            } else {
                q20Var.c.setAlpha((int) (i7Var.u * 255.0f * f22));
                w12 = e2.c.w(1.0f, f22, AndroidUtilities.dp(5.0f), f23);
            }
            float f24 = w12 + i7Var.G;
            rectF.set(rectF3);
            rectF.inset(f24, f24);
            imageReceiver.getParentView();
            j(canvas2, i7Var, q20Var.c, z14);
        }
        int i22 = i7Var.A;
        Paint[] paintArr = k;
        if (i22 == 2) {
            f14 = 1.0f;
        } else {
            f14 = 1.0f;
        }
        if (i7Var.y != 2) {
            imageReceiver2 = imageReceiver;
            i7Var2 = i7Var;
            z10 = z14;
            t6Var2 = t6Var;
            f15 = 2.7f;
            if ((i7Var2.A == i13 || i7Var2.B == 1.0f) && i7Var2.y != i13) {
                imageReceiver3 = imageReceiver2;
                i7Var3 = i7Var2;
            } else {
                if (i7Var2.q == 1) {
                    t(imageReceiver2, z12);
                    paint = q20VarArr[z12 ? 1 : 0].c;
                } else if (z12) {
                    d(i7Var2.J, i7Var2.o);
                    paint = paintArr[i7Var2.o ? 1 : 0];
                } else {
                    c(i7Var2.J);
                    paint = e;
                }
                paint.setAlpha((int) (f22 * 255.0f));
                if (i7Var2.a) {
                    paint2 = t(imageReceiver2, z12);
                    paint2.setAlpha((int) (i7Var2.u * 255.0f));
                    Paint o10 = o(imageReceiver2);
                    o10.setAlpha((int) (i7Var2.u * 255.0f));
                    Paint q10 = q(imageReceiver2);
                    q10.setAlpha((int) (i7Var2.u * 255.0f));
                    c(i7Var2.J);
                    paint4 = o10;
                    paint3 = q10;
                } else {
                    paint2 = null;
                    paint3 = null;
                    paint4 = null;
                }
                if (i7Var2.a) {
                    if (z12 && !i7Var2.v) {
                        dpf2 = AndroidUtilities.dpf2(3.5f);
                        f17 = -dpf2;
                    }
                    f17 = 0.0f;
                } else {
                    if (z12 && !i7Var2.v) {
                        dpf2 = AndroidUtilities.dpf2(f15);
                        f17 = -dpf2;
                    }
                    f17 = 0.0f;
                }
                if (i7Var2.A != i13 || i7Var2.B == 1.0f) {
                    paint.setAlpha((int) (i7Var2.u * 255.0f * f22));
                    f18 = 1.0f;
                    w10 = e2.c.w(1.0f, f22, AndroidUtilities.dp(5.0f), f17);
                } else {
                    w10 = (AndroidUtilities.dp(7.0f) * f22) + f17;
                    paint.setAlpha((int) ((1.0f - f22) * i7Var2.u * 255.0f));
                    f18 = 1.0f;
                }
                float f25 = w10 + i7Var2.G;
                rectF.set(rectF3);
                rectF.inset(f25, f25);
                boolean z17 = i7Var2.a;
                if (z17 && i7Var2.y == i13) {
                    float f26 = i7Var2.t;
                    if (f26 != f18) {
                        float f27 = f26 + f12;
                        i7Var2.t = f27;
                        if (f27 > f18) {
                            i7Var2.t = f18;
                        }
                        float f28 = i7Var2.e;
                        i7Var2.e = f18 - i7Var2.t;
                        m(canvas2, t6Var2, imageReceiver2, i7Var2, paint, paint2, paint3, paint4, z10);
                        imageReceiver3 = imageReceiver2;
                        i7Var3 = i7Var2;
                        i7Var3.e = f28;
                        if (imageReceiver3.getParentView() != null) {
                            imageReceiver3.invalidate();
                            imageReceiver3.getParentView().invalidate();
                        }
                        canvas2 = canvas;
                    }
                }
                i7Var3 = i7Var2;
                Paint paint9 = paint4;
                imageReceiver3 = imageReceiver2;
                if (z17) {
                    int D2 = t6Var2.D(0, i7Var3.x);
                    if (D2 == 2) {
                        paint2 = paint9;
                    } else if (D2 == i13) {
                        paint2 = paint3;
                    }
                    View parentView = imageReceiver3.getParentView();
                    if (i7Var3.L) {
                        float f29 = i7Var3.K - 0.016f;
                        i7Var3.K = f29;
                        if (f29 < 0.0f) {
                            i7Var3.K = 0.0f;
                            i7Var3.L = true;
                            i7Var3.M += 1.152f;
                            parentView.invalidate();
                            if (i7Var3.L) {
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, i7Var3.M, i7Var3.K * 360.0f, false, paint2);
                            } else {
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, i7Var3.M + 360.0f, i7Var3.K * (-360.0f), false, paint2);
                            }
                            for (i14 = 0; i14 < 16; i14++) {
                                float f30 = (i14 * 22.5f) + 10.0f;
                                canvas.drawArc(rectF2, i7Var3.M + f30, ((22.5f + f30) - 10.0f) - f30, false, paint2);
                            }
                            canvas2 = canvas;
                            imageReceiver3.draw(canvas2);
                            i7Var3.w = f11 > 0.5f;
                            if (f20 > 0.0f) {
                                float f31 = f10 + i7Var3.G;
                                rectF2.set(rectF3);
                                rectF2.inset(f31, f31);
                                k(canvas2, rectF2, f11, imageReceiver3.getVisible(), 0.0f);
                            }
                            f16 = i7Var3.B;
                            if (f16 != 1.0f) {
                                float f32 = (AndroidUtilities.screenRefreshTime / 250.0f) + f16;
                                i7Var3.B = f32;
                                if (f32 > 1.0f) {
                                    i7Var3.B = 1.0f;
                                }
                                if (imageReceiver3.getParentView() != null) {
                                    imageReceiver3.invalidate();
                                    imageReceiver3.getParentView().invalidate();
                                }
                            }
                            if (i12 != 0) {
                                canvas2.restoreToCount(i12);
                                return;
                            }
                            return;
                        }
                    } else {
                        float f33 = i7Var3.K + 0.016f;
                        i7Var3.K = f33;
                        if (f33 >= 1.0f) {
                            i7Var3.K = 1.0f;
                            i7Var3.L = false;
                        }
                    }
                    i7Var3.M += 1.152f;
                    parentView.invalidate();
                    if (i7Var3.L) {
                    }
                    while (i14 < 16) {
                    }
                    canvas2 = canvas;
                    imageReceiver3.draw(canvas2);
                    i7Var3.w = f11 > 0.5f;
                    if (f20 > 0.0f) {
                    }
                    f16 = i7Var3.B;
                    if (f16 != 1.0f) {
                    }
                    if (i12 != 0) {
                    }
                }
                paint2 = paint;
                View parentView2 = imageReceiver3.getParentView();
                if (i7Var3.L) {
                }
                i7Var3.M += 1.152f;
                parentView2.invalidate();
                if (i7Var3.L) {
                }
                while (i14 < 16) {
                }
                canvas2 = canvas;
                imageReceiver3.draw(canvas2);
                i7Var3.w = f11 > 0.5f;
                if (f20 > 0.0f) {
                }
                f16 = i7Var3.B;
                if (f16 != 1.0f) {
                }
                if (i12 != 0) {
                }
            }
            rectF2 = rectF;
            imageReceiver3.draw(canvas2);
            i7Var3.w = f11 > 0.5f;
            if (f20 > 0.0f) {
            }
            f16 = i7Var3.B;
            if (f16 != 1.0f) {
            }
            if (i12 != 0) {
            }
        }
        boolean z18 = i22 == 2 && i7Var.B != f14;
        if (z12) {
            d(i7Var.J, i7Var.o);
            paint5 = paintArr[i7Var.o ? 1 : 0];
        } else {
            c(i7Var.J);
            paint5 = e;
        }
        Paint paint10 = paint5;
        if (i7Var.a) {
            Paint t6 = t(imageReceiver, z12);
            t6.setAlpha((int) (i7Var.u * 255.0f));
            paint6 = o(imageReceiver);
            paint6.setAlpha((int) (i7Var.u * 255.0f));
            Paint q11 = q(imageReceiver);
            q11.setAlpha((int) (i7Var.u * 255.0f));
            c(i7Var.J);
            paint8 = q11;
            paint7 = t6;
        } else {
            paint6 = null;
            paint7 = null;
            paint8 = null;
        }
        if (i7Var.a) {
            if (z12 && !i7Var.v) {
                dpf22 = AndroidUtilities.dpf2(3.5f);
                f19 = -dpf22;
            }
            f19 = 0.0f;
        } else {
            if (z12 && !i7Var.v) {
                dpf22 = AndroidUtilities.dpf2(2.7f);
                f19 = -dpf22;
            }
            f19 = 0.0f;
        }
        if (z18) {
            w11 = (AndroidUtilities.dp(5.0f) * f22) + f19;
            paint10.setAlpha((int) (i7Var.u * 255.0f * (1.0f - f22)));
            f15 = 2.7f;
        } else {
            paint10.setAlpha((int) (i7Var.u * 255.0f * f22));
            f15 = 2.7f;
            w11 = e2.c.w(1.0f, f22, AndroidUtilities.dp(5.0f), f19);
        }
        float f34 = w11 + i7Var.G;
        rectF.set(rectF3);
        rectF.inset(f34, f34);
        if (i7Var.a) {
            imageReceiver2 = imageReceiver;
            t6Var2 = t6Var;
            Paint paint11 = paint6;
            i7Var2 = i7Var;
            z10 = z14;
            m(canvas2, t6Var2, imageReceiver2, i7Var2, paint10, paint7, paint8, paint11, z10);
        } else {
            imageReceiver2 = imageReceiver;
            i7Var2 = i7Var;
            z10 = z14;
            t6Var2 = t6Var;
            imageReceiver2.getParentView();
            j(canvas2, i7Var2, paint10, z10);
        }
        if (i7Var2.A == i13) {
        }
        imageReceiver3 = imageReceiver2;
        i7Var3 = i7Var2;
        rectF2 = rectF;
        imageReceiver3.draw(canvas2);
        i7Var3.w = f11 > 0.5f;
        if (f20 > 0.0f) {
        }
        f16 = i7Var3.B;
        if (f16 != 1.0f) {
        }
        if (i12 != 0) {
        }
    }

    public static void j(Canvas canvas, i7 i7Var, Paint paint, boolean z4) {
        RectF rectF = n;
        if (z4) {
            RectF rectF2 = p;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
            return;
        }
        float f10 = i7Var.f;
        if (f10 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f10 / 2.0f) + 360.0f, 360.0f - f10, false, paint);
        }
    }

    public static void k(Canvas canvas, RectF rectF, float f10, boolean z4, float f11) {
        Canvas canvas2;
        if (i == null) {
            i = new k01(LocaleController.getString(R.string.LiveStoryBadge), 9.66f, AndroidUtilities.bold());
        }
        if (g == null) {
            Paint paint = new Paint(1);
            g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f == null) {
            f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.j6.l1(f10, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ok, false)));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(7.0f), f11);
        float l10 = i.l() + lerp + lerp;
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(18.0f), f11);
        float dp = AndroidUtilities.dp(2.0f);
        canvas.save();
        float f12 = l10 / 2.0f;
        float f13 = 0.8f * lerp2;
        float f14 = lerp2 * 0.2f;
        f.set((rectF.centerX() - f12) - dp, (rectF.bottom - f13) - dp, rectF.centerX() + f12 + dp, rectF.bottom + f14 + dp);
        float lerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f10);
        canvas.scale(lerp3, lerp3, f.centerX(), f.centerY());
        AndroidUtilities.scaleRect(f, f10);
        RectF rectF2 = f;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, f.height() / 2.0f, g);
        if (z4) {
            f.set(rectF.centerX() - f12, rectF.bottom - f13, rectF.centerX() + f12, rectF.bottom + f14);
            RectF rectF3 = f;
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f.height() / 2.0f, h);
            k01 k01Var = i;
            RectF rectF4 = f;
            canvas2 = canvas;
            k01Var.c(rectF4.left + lerp, rectF4.centerY(), f10, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, i7 i7Var, boolean z4) {
        if (z4) {
            float height = rectF.height() * 0.32f;
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            Path path = q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = r;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = t;
            path2.reset();
            pathMeasure.getSegment(((f10 - f13) / 360.0f) * length, length * ((f11 - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        if (!i7Var.k) {
            if (i7Var.l) {
                float f14 = i7Var.f;
                g(canvas, rectF, paint, f10, f11, ((-f14) / 2.0f) + 180.0f, (f14 / 2.0f) + 180.0f);
                return;
            } else if (f10 < 90.0f) {
                g(canvas, rectF, paint, f10, f11, i7Var.g, i7Var.h);
                return;
            } else {
                g(canvas, rectF, paint, f10, f11, -i7Var.i, i7Var.j);
                return;
            }
        }
        boolean z10 = i7Var.m;
        if (!z10 && !i7Var.l) {
            if (f10 < 90.0f) {
                float f15 = i7Var.f;
                g(canvas, rectF, paint, f10, f11, (-f15) / 2.0f, f15 / 2.0f);
                return;
            } else {
                float f16 = i7Var.f;
                g(canvas, rectF, paint, f10, f11, ((-f16) / 2.0f) + 180.0f, (f16 / 2.0f) + 180.0f);
                return;
            }
        }
        if (i7Var.l) {
            float f17 = i7Var.f;
            g(canvas, rectF, paint, f10, f11, ((-f17) / 2.0f) + 180.0f, (f17 / 2.0f) + 180.0f);
        } else if (!z10) {
            canvas.drawArc(rectF, f10, f11 - f10, false, paint);
        } else {
            float f18 = i7Var.f;
            g(canvas, rectF, paint, f10, f11, (-f18) / 2.0f, f18 / 2.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ab, code lost:
    
        if (r4 == 1) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(Canvas canvas, t6 t6Var, ImageReceiver imageReceiver, i7 i7Var, Paint paint, Paint paint2, Paint paint3, Paint paint4, boolean z4) {
        Paint paint5;
        RectF rectF;
        int max;
        Paint paint6;
        i7 i7Var2 = i7Var;
        org.telegram.ui.ActionBar.f6 f6Var = i7Var2.J;
        boolean z10 = i7Var2.E;
        c(f6Var);
        d(i7Var2.J, i7Var2.o);
        long j10 = i7Var2.s;
        int i10 = 0;
        int D = j10 != 0 ? t6Var.D(0, j10) : t6Var.D(0, i7Var2.x);
        int i11 = 2;
        i7Var2.n = D == 0 ? 2 : 1;
        TL_stories.PeerStories y10 = t6Var.y(i7Var2.x);
        ArrayList arrayList = t6Var.h;
        if (y10 == null) {
            y10 = t6Var.z(i7Var2.x);
        }
        TL_stories.PeerStories peerStories = y10;
        int size = i7Var2.r ? arrayList.size() : (peerStories == null || peerStories.stories.size() == 1) ? 1 : peerStories.stories.size();
        Paint[] paintArr = k;
        if (D == 2) {
            o(imageReceiver);
            paint5 = b.c;
        } else if (D == 3) {
            q(imageReceiver);
            paint5 = c.c;
        } else if (D == 1) {
            t(imageReceiver, z10);
            paint5 = a[z10 ? 1 : 0].c;
        } else {
            paint5 = z10 ? paintArr[i7Var2.o ? 1 : 0] : e;
        }
        Paint paint7 = paint5;
        RectF rectF2 = n;
        if (size <= 1) {
            long j11 = i7Var2.x;
            TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) t6Var.i.f(j11);
            if (peerStories2 == null) {
                peerStories2 = t6Var.z(j11);
            }
            if (peerStories2 != null) {
                if (j11 != UserConfig.getInstance(t6Var.a).getClientUserId() || Utilities.isNullOrEmpty((Collection) t6Var.b.f(j11))) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories2.stories.size()) {
                            break;
                        }
                        TL_stories.StoryItem storyItem = peerStories2.stories.get(i12);
                        if (storyItem != null) {
                            if (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                i10 = 2;
                                break;
                            } else if (storyItem.id > peerStories2.max_read_id) {
                                break;
                            }
                        }
                        i12++;
                    }
                }
                i10 = 1;
            }
            Paint paint8 = i10 == 2 ? paint3 : paint7 == b.c ? paint4 : i10 == 1 ? paint2 : paint;
            l(canvas, rectF2, paint8, -90.0f, 90.0f, i7Var2, z4);
            l(canvas, rectF2, paint8, 90.0f, 270.0f, i7Var, z4);
            float f10 = i7Var.e;
            if (f10 == 1.0f || paint8 == paint7) {
                return;
            }
            paint7.setAlpha((int) ((1.0f - f10) * 255.0f));
            l(canvas, rectF2, paint7, -90.0f, 90.0f, i7Var, z4);
            l(canvas, rectF2, paint7, 90.0f, 270.0f, i7Var, z4);
            paint7.setAlpha(255);
            return;
        }
        Paint paint9 = paint7;
        float f11 = 360.0f / size;
        float f12 = (size > 20 ? 3 : 5) * i7Var2.e;
        float f13 = f12 > f11 ? 0.0f : f12;
        if (i7Var2.r) {
            rectF = rectF2;
            max = 0;
        } else {
            rectF = rectF2;
            max = Math.max(peerStories.max_read_id, t6Var.f.get(i7Var2.x, 0));
        }
        int i13 = 0;
        while (i13 < size) {
            Paint paint10 = z10 ? paintArr[i7Var2.o ? 1 : 0] : e;
            if (i7Var2.r) {
                int D2 = t6Var.D(i10, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get((size - 1) - i13)).peer));
                if (D2 == i11) {
                    paint10 = paint4;
                } else {
                    if (D2 != 3) {
                    }
                    paint10 = paint3;
                }
            } else {
                if (i13 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i13).justUploaded || peerStories.stories.get(i13).id > max) {
                        if (!(peerStories.stories.get(i13).media instanceof TLRPC.TL_messageMediaVideoStream)) {
                            if (peerStories.stories.get(i13).close_friends) {
                                paint10 = paint4;
                            }
                        }
                        paint10 = paint3;
                    }
                }
                paint10 = paint2;
            }
            float f14 = (i13 * f11) - 90.0f;
            float f15 = f14 + f11;
            float f16 = f14 + f13;
            float f17 = f15 - f13;
            Paint paint11 = paint9;
            int i14 = max;
            int i15 = i13;
            Paint paint12 = paint10;
            RectF rectF3 = rectF;
            l(canvas, rectF3, paint12, f16, f17, i7Var, z4);
            RectF rectF4 = rectF3;
            if (i7Var.e == 1.0f || paint12 == paint11) {
                paint6 = paint11;
            } else {
                paint11.getStrokeWidth();
                paint11.setAlpha((int) ((1.0f - i7Var.e) * 255.0f));
                l(canvas, rectF4, paint11, f16, f17, i7Var, z4);
                rectF4 = rectF4;
                paint6 = paint11;
                paint6.setAlpha(255);
            }
            i13 = i15 + 1;
            i7Var2 = i7Var;
            rectF = rectF4;
            paint9 = paint6;
            max = i14;
            i10 = 0;
            i11 = 2;
        }
    }

    public static j7 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        if (peerStories == null || peerStories.stories.isEmpty() || DialogObject.getPeerDialogId(peerStories.peer) == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            runnable.run();
            return null;
        }
        t6 t6Var = MessagesController.getInstance(UserConfig.selectedAccount).storiesController;
        int i10 = t6Var.f.get(DialogObject.getPeerDialogId(peerStories.peer));
        int i11 = 0;
        while (true) {
            if (i11 >= peerStories.stories.size()) {
                storyItem = null;
                break;
            }
            if (peerStories.stories.get(i11).id > i10) {
                storyItem = peerStories.stories.get(i11);
                break;
            }
            i11++;
        }
        if (storyItem == null) {
            storyItem = peerStories.stories.get(0);
        }
        TL_stories.StoryItem storyItem2 = storyItem;
        TLRPC.MessageMedia messageMedia = storyItem2.media;
        if (messageMedia == null || messageMedia.document == null) {
            TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
            if (photo == null || (arrayList = photo.sizes) == null) {
                runnable.run();
                return null;
            }
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), "", false);
            if (pathToAttach != null && pathToAttach.exists()) {
                runnable.run();
                return null;
            }
        } else {
            File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", false);
            if (pathToAttach2 != null && pathToAttach2.exists()) {
                runnable.run();
                return null;
            }
            File pathToAttach3 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", true);
            if (pathToAttach3 != null) {
                try {
                    int lastIndexOf = pathToAttach3.getName().lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        File file = new File(pathToAttach3.getParentFile(), pathToAttach3.getName().substring(0, lastIndexOf) + ".temp");
                        if (file.exists() && file.length() > 0) {
                            runnable.run();
                            return null;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        j7 j7Var = new j7();
        j7Var.b = false;
        j7Var.a = peerDialogId;
        j7Var.c = t6Var;
        j7Var.d = new n4(15, j7Var, runnable);
        Runnable[] runnableArr = {r2};
        n4 n4Var = new n4(16, runnableArr, j7Var);
        AndroidUtilities.runOnUIThread(n4Var, 3000L);
        h7 h7Var = new h7(runnableArr, j7Var);
        j7Var.e = h7Var;
        h7Var.setAllowLoadingOnAttachedOnly(true);
        ((h7) j7Var.e).onAttachedToWindow();
        String s6 = s();
        TLRPC.MessageMedia messageMedia2 = storyItem2.media;
        if (messageMedia2 == null || (document = messageMedia2.document) == null) {
            TLRPC.Photo photo2 = messageMedia2 != null ? messageMedia2.photo : null;
            if (photo2 == null || (arrayList2 = photo2.sizes) == null) {
                ((n4) j7Var.d).run();
                return null;
            }
            ((h7) j7Var.e).setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, ConnectionsManager.DEFAULT_DATACENTER_ID), photo2), s6, null, null, null, 0L, null, storyItem2, 0);
        } else {
            ((h7) j7Var.e).setImage(ImageLocation.getForDocument(document), vh.w2.k(s6, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
        }
        return j7Var;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (b == null) {
            q20 q20Var = new q20();
            b = q20Var;
            q20Var.a = true;
            q20Var.b = true;
            q20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.mk, false), 0, 0);
            b.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            b.c.setStyle(Paint.Style.STROKE);
            b.c.setStrokeCap(Paint.Cap.ROUND);
        }
        b.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return b.c;
    }

    public static Drawable p() {
        if (m == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.a.k(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            m = new BitmapDrawable(createBitmap);
        }
        return m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (c == null) {
            q20 q20Var = new q20();
            c = q20Var;
            q20Var.a = true;
            q20Var.b = true;
            q20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.nk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ok, false), 0, 0);
            c.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            c.c.setStyle(Paint.Style.STROKE);
            c.c.setStrokeCap(Paint.Cap.ROUND);
        }
        c.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return c.c;
    }

    public static int r(t6 t6Var, long j10) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        if (j10 == 0) {
            return 0;
        }
        if (j10 <= 0) {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
            if (chat == null || (tL_recentStory = chat.stories_max_id) == null || tL_recentStory.max_id <= 0 || chat.stories_unavailable) {
                return 0;
            }
            int i10 = t6Var.f.get(j10, 0);
            TLRPC.TL_recentStory tL_recentStory3 = chat.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            return tL_recentStory3.max_id > i10 ? 1 : 2;
        }
        TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
        if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || user == null || (tL_recentStory2 = user.stories_max_id) == null || tL_recentStory2.max_id <= 0 || user.stories_unavailable) {
            return 0;
        }
        int i11 = t6Var.f.get(j10, 0);
        TLRPC.TL_recentStory tL_recentStory4 = user.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        return tL_recentStory4.max_id > i11 ? 1 : 2;
    }

    public static String s() {
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        return e2.c.h(max, "_", max);
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z4) {
        q20[] q20VarArr = a;
        if (q20VarArr[z4 ? 1 : 0] == null) {
            q20 q20Var = new q20();
            q20VarArr[z4 ? 1 : 0] = q20Var;
            q20Var.a = true;
            q20Var.b = true;
            if (z4) {
                q20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kk, false), 0, 0);
            } else {
                q20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), 0, 0);
            }
            q20VarArr[z4 ? 1 : 0].c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            q20VarArr[z4 ? 1 : 0].c.setStyle(Paint.Style.STROKE);
            q20VarArr[z4 ? 1 : 0].c.setStrokeCap(Paint.Cap.ROUND);
        }
        q20VarArr[z4 ? 1 : 0].b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return q20VarArr[z4 ? 1 : 0].c;
    }

    public static CharSequence u(TextView textView, boolean z4) {
        String string = z4 ? LocaleController.getString(R.string.StoryEditing) : LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") <= 0) {
            return string;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        o9 o9Var = new o9();
        valueOf.setSpan(o9Var, valueOf.length() - 1, valueOf.length(), 0);
        o9Var.a = textView;
        o9Var.n = false;
        return valueOf;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        return storyItem != null && ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() > storyItem.expire_date + 86400;
    }

    public static boolean w(int i10, TL_stories.StoryItem storyItem) {
        return ConnectionsManager.getInstance(i10).getCurrentTime() > storyItem.expire_date;
    }

    public static void x(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, ConnectionsManager.DEFAULT_DATACENTER_ID), storyItem.media.document), "320_320", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new n9(storyItem));
            return;
        }
        TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(i0.a.d(0.2f, -16777216, -1));
            imageReceiver.setImageBitmap(createBitmap);
            imageReceiver.addDecorator(new n9(storyItem));
            return;
        }
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), photo), "320_320", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new n9(storyItem));
        }
    }

    public static void y(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem.media.document), "100_100", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, MediaDataController.MAX_STYLE_RUNS_COUNT), photo), "100_100", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
        }
    }
}
