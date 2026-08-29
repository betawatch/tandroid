package lh;

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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class l7 {
    public static k20 b;
    public static k20 c;
    public static k20 d;
    public static Paint e;
    public static RectF f;
    public static Paint g;
    public static Paint h;
    public static zz0 i;
    public static int j;
    public static BitmapDrawable m;
    public static final k20[] a = new k20[2];
    public static final Paint[] k = new Paint[2];
    public static final int[] l = new int[2];
    public static final RectF n = new RectF();
    public static final ab.n o = new ab.n(2);
    public static final RectF p = new RectF();
    public static final Path q = new Path();
    public static final Matrix r = new Matrix();
    public static final PathMeasure s = new PathMeasure();
    public static final Path t = new Path();

    public static void a(org.telegram.ui.ActionBar.h5 h5Var) {
        String string = LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") <= 0) {
            h5Var.l(string, false);
            return;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        o9 o9Var = new o9();
        valueOf.setSpan(o9Var, valueOf.length() - 1, valueOf.length(), 0);
        o9Var.a = h5Var;
        o9Var.n = true;
        h5Var.l(valueOf, false);
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

    public static void c(org.telegram.ui.ActionBar.c6 c6Var) {
        if (e == null) {
            Paint paint = new Paint(1);
            e = paint;
            paint.setStyle(Paint.Style.STROKE);
            e.setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            e.setStrokeCap(Paint.Cap.ROUND);
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var);
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

    public static void d(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        Paint[] paintArr = k;
        if (paintArr[z10 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z10 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z10 ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            paintArr[z10 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(!z10 ? org.telegram.ui.ActionBar.g6.s8 : org.telegram.ui.ActionBar.g6.M8, c6Var);
        int[] iArr = l;
        if (iArr[z10 ? 1 : 0] != v02) {
            iArr[z10 ? 1 : 0] = v02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(v02);
            if (computePerceivedBrightness >= 0.721f) {
                paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.2f, v02, -16777216));
            } else if (computePerceivedBrightness < 0.25f) {
                paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.2f, v02, -1));
            } else {
                paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.44f, v02, -1));
            }
        }
    }

    public static SpannableStringBuilder e(int i10, boolean z10, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.formatString(i10, objArr));
        iq iqVar = new iq(R.drawable.msg_mini_bomb, 0);
        if (z10) {
            iqVar.setScale(0.8f, 0.8f);
        } else {
            iqVar.setTopOffset(-1);
        }
        spannableStringBuilder.setSpan(iqVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString(R.string.Story));
        spannableStringBuilder.setSpan(new iq(R.drawable.msg_mini_replystory2, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f9, float f10, float f11, float f12) {
        float f13;
        boolean z10;
        float f14 = f10 - f9;
        if (f9 >= f11 || f10 >= f11 + f14) {
            f13 = f9;
            z10 = false;
        } else {
            f13 = f9;
            canvas.drawArc(rectF, f13, Math.min(f10, f11) - f9, false, paint);
            z10 = true;
        }
        float max = Math.max(f13, f12);
        float min = Math.min(f10, f11 + 360.0f);
        if (min >= max) {
            canvas.drawArc(rectF, max, min - max, false, paint);
        } else {
            if (z10) {
                return;
            }
            if (f13 <= f11 || f10 >= f12) {
                canvas.drawArc(rectF, f13, f14, false, paint);
            }
        }
    }

    public static void h(long j10, Canvas canvas, ImageReceiver imageReceiver, h7 h7Var) {
        i(j10, canvas, imageReceiver, UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j10 && MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(j10), h7Var);
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
    public static void i(long j10, Canvas canvas, ImageReceiver imageReceiver, boolean z10, h7 h7Var) {
        int r6;
        int i10;
        float lerp;
        float f9;
        int i11;
        Canvas canvas2;
        int i12;
        s6 s6Var;
        float f10;
        int i13;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        ImageReceiver imageReceiver2;
        h7 h7Var2;
        boolean z11;
        s6 s6Var2;
        float f14;
        ImageReceiver imageReceiver3;
        h7 h7Var3;
        RectF rectF2;
        float f15;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        float dpf2;
        float f16;
        float f17;
        float z12;
        int i14;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        float dpf22;
        float f18;
        float z13;
        k20 k20Var;
        float z14;
        s6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z15 = h7Var.b;
        RectF rectF3 = h7Var.F;
        boolean z16 = h7Var.E;
        if (h7Var.x != j10) {
            h7Var.x = j10;
            h7Var.g();
            z15 = false;
        }
        boolean z17 = storiesController.j.get(j10, 0) == 1;
        boolean z18 = ChatObject.isForum(UserConfig.selectedAccount, j10) && !h7Var.D;
        boolean z19 = h7Var.r ? !storiesController.h.isEmpty() : z10;
        if (h7Var.d != null) {
            storiesController.D(h7Var.c, j10);
            z17 = false;
        }
        if (z17) {
            if (storiesController.I(j10)) {
                r6 = 3;
                i10 = 2;
            } else {
                i10 = r(storiesController, j10);
                r6 = 3;
            }
            z15 = false;
        } else if (!z19) {
            r6 = r(storiesController, j10);
            i10 = r6;
        } else if (h7Var.a) {
            r6 = 2;
            i10 = 2;
        } else {
            int D = storiesController.D(h7Var.c, j10);
            i10 = D;
            r6 = D == 0 ? 2 : 1;
        }
        int i15 = h7Var.z;
        if (i15 != 0) {
            r6 = i15;
            i10 = r6;
        }
        int i16 = h7Var.y;
        if (i16 != r6) {
            if (i16 == 3) {
                z15 = true;
            }
            if (r6 == 3) {
                h7Var.q = i10;
                h7Var.t = 0.0f;
            }
            if (z15) {
                h7Var.A = i16;
                h7Var.y = r6;
                h7Var.B = 0.0f;
            } else {
                h7Var.y = r6;
                h7Var.B = 1.0f;
            }
        }
        uc ucVar = h7Var.H;
        float a2 = ucVar != null ? ucVar.a(0.08f) : 1.0f;
        if (h7Var.C != z17 && z17) {
            h7Var.K = 1.0f;
            h7Var.L = false;
        }
        h7Var.C = z17;
        if (h7Var.y == 0 && h7Var.B == 1.0f) {
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
        float f19 = storiesController.F(h7Var.x) ? h7Var.e : 0.0f;
        float f20 = h7Var.B;
        if (f20 != 1.0f) {
            f20 = jr.f.getInterpolation(f20);
        }
        float f21 = f20;
        if (!z16 || h7Var.v) {
            int i17 = h7Var.A;
            int i18 = h7Var.q;
            if (i17 == 3) {
                i17 = i18;
            }
            int dp = i17 == 2 ? AndroidUtilities.dp(3.0f) : i17 == 1 ? AndroidUtilities.dp(4.0f) : 0;
            int i19 = h7Var.y;
            int i20 = h7Var.q;
            if (i19 == 3) {
                i19 = i20;
            }
            lerp = AndroidUtilities.lerp(dp, i19 == 2 ? AndroidUtilities.dp(3.0f) : i19 == 1 ? AndroidUtilities.dp(4.0f) : 0, h7Var.B);
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
        if (f19 > 0.0f) {
            f12 = 1.0f;
            f9 = lerp;
            rectF = rectF4;
            i11 = i10;
            s6Var = storiesController;
            i12 = save;
            f10 = f19;
            i13 = 3;
            f11 = 0.08f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(rectF4.left - AndroidUtilities.dp(15.0f), rectF4.top - AndroidUtilities.dp(15.0f), rectF4.right + AndroidUtilities.dp(15.0f), rectF4.bottom + AndroidUtilities.dp(15.0f), 255, 31);
        } else {
            f9 = lerp;
            i11 = i10;
            canvas2 = canvas;
            i12 = save;
            s6Var = storiesController;
            f10 = f19;
            i13 = 3;
            f11 = 0.08f;
            f12 = 1.0f;
            rectF = rectF4;
        }
        int i21 = h7Var.A;
        k20[] k20VarArr = a;
        if ((i21 == 1 && h7Var.B != f12) || h7Var.y == 1) {
            if (i11 == 2) {
                o(imageReceiver);
                k20Var = b;
            } else if (i11 == i13) {
                q(imageReceiver);
                k20Var = c;
            } else {
                t(imageReceiver, z16);
                k20Var = k20VarArr[z16 ? 1 : 0];
            }
            boolean z20 = h7Var.A == 1 && h7Var.B != f12;
            float f22 = (!z16 || h7Var.v) ? 0.0f : -AndroidUtilities.dp(4.0f);
            if (z20) {
                z14 = (AndroidUtilities.dp(5.0f) * f21) + f22;
                k20Var.c.setAlpha((int) ((f12 - f21) * h7Var.u * 255.0f));
            } else {
                k20Var.c.setAlpha((int) (h7Var.u * 255.0f * f21));
                z14 = com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(5.0f), f22);
            }
            float f23 = z14 + h7Var.G;
            rectF.set(rectF3);
            rectF.inset(f23, f23);
            imageReceiver.getParentView();
            j(canvas2, h7Var, k20Var.c, z18);
        }
        int i22 = h7Var.A;
        Paint[] paintArr = k;
        if (i22 == 2) {
            f13 = 1.0f;
        } else {
            f13 = 1.0f;
        }
        if (h7Var.y != 2) {
            imageReceiver2 = imageReceiver;
            h7Var2 = h7Var;
            z11 = z18;
            s6Var2 = s6Var;
            f14 = 2.7f;
            if ((h7Var2.A == i13 || h7Var2.B == 1.0f) && h7Var2.y != i13) {
                imageReceiver3 = imageReceiver2;
                h7Var3 = h7Var2;
            } else {
                if (h7Var2.q == 1) {
                    t(imageReceiver2, z16);
                    paint = k20VarArr[z16 ? 1 : 0].c;
                } else if (z16) {
                    d(h7Var2.J, h7Var2.o);
                    paint = paintArr[h7Var2.o ? 1 : 0];
                } else {
                    c(h7Var2.J);
                    paint = e;
                }
                paint.setAlpha((int) (f21 * 255.0f));
                if (h7Var2.a) {
                    paint2 = t(imageReceiver2, z16);
                    paint2.setAlpha((int) (h7Var2.u * 255.0f));
                    Paint o10 = o(imageReceiver2);
                    o10.setAlpha((int) (h7Var2.u * 255.0f));
                    Paint q6 = q(imageReceiver2);
                    q6.setAlpha((int) (h7Var2.u * 255.0f));
                    c(h7Var2.J);
                    paint4 = o10;
                    paint3 = q6;
                } else {
                    paint2 = null;
                    paint3 = null;
                    paint4 = null;
                }
                if (h7Var2.a) {
                    if (z16 && !h7Var2.v) {
                        dpf2 = AndroidUtilities.dpf2(3.5f);
                        f16 = -dpf2;
                    }
                    f16 = 0.0f;
                } else {
                    if (z16 && !h7Var2.v) {
                        dpf2 = AndroidUtilities.dpf2(f14);
                        f16 = -dpf2;
                    }
                    f16 = 0.0f;
                }
                if (h7Var2.A != i13 || h7Var2.B == 1.0f) {
                    paint.setAlpha((int) (h7Var2.u * 255.0f * f21));
                    f17 = 1.0f;
                    z12 = com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(5.0f), f16);
                } else {
                    z12 = (AndroidUtilities.dp(7.0f) * f21) + f16;
                    paint.setAlpha((int) ((1.0f - f21) * h7Var2.u * 255.0f));
                    f17 = 1.0f;
                }
                float f24 = z12 + h7Var2.G;
                rectF.set(rectF3);
                rectF.inset(f24, f24);
                boolean z21 = h7Var2.a;
                if (z21 && h7Var2.y == i13) {
                    float f25 = h7Var2.t;
                    if (f25 != f17) {
                        float f26 = f25 + f11;
                        h7Var2.t = f26;
                        if (f26 > f17) {
                            h7Var2.t = f17;
                        }
                        float f27 = h7Var2.e;
                        h7Var2.e = f17 - h7Var2.t;
                        m(canvas2, s6Var2, imageReceiver2, h7Var2, paint, paint2, paint3, paint4, z11);
                        imageReceiver3 = imageReceiver2;
                        h7Var3 = h7Var2;
                        h7Var3.e = f27;
                        if (imageReceiver3.getParentView() != null) {
                            imageReceiver3.invalidate();
                            imageReceiver3.getParentView().invalidate();
                        }
                        canvas2 = canvas;
                    }
                }
                h7Var3 = h7Var2;
                Paint paint9 = paint4;
                imageReceiver3 = imageReceiver2;
                if (z21) {
                    int D2 = s6Var2.D(0, h7Var3.x);
                    if (D2 == 2) {
                        paint2 = paint9;
                    } else if (D2 == i13) {
                        paint2 = paint3;
                    }
                    View parentView = imageReceiver3.getParentView();
                    if (h7Var3.L) {
                        float f28 = h7Var3.K - 0.016f;
                        h7Var3.K = f28;
                        if (f28 < 0.0f) {
                            h7Var3.K = 0.0f;
                            h7Var3.L = true;
                            h7Var3.M += 1.152f;
                            parentView.invalidate();
                            if (h7Var3.L) {
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, h7Var3.M, h7Var3.K * 360.0f, false, paint2);
                            } else {
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, h7Var3.M + 360.0f, h7Var3.K * (-360.0f), false, paint2);
                            }
                            for (i14 = 0; i14 < 16; i14++) {
                                float f29 = (i14 * 22.5f) + 10.0f;
                                canvas.drawArc(rectF2, h7Var3.M + f29, ((22.5f + f29) - 10.0f) - f29, false, paint2);
                            }
                            canvas2 = canvas;
                            imageReceiver3.draw(canvas2);
                            h7Var3.w = f10 > 0.5f;
                            if (f19 > 0.0f) {
                                float f30 = f9 + h7Var3.G;
                                rectF2.set(rectF3);
                                rectF2.inset(f30, f30);
                                k(canvas2, rectF2, f10, imageReceiver3.getVisible(), 0.0f);
                            }
                            f15 = h7Var3.B;
                            if (f15 != 1.0f) {
                                float f31 = (AndroidUtilities.screenRefreshTime / 250.0f) + f15;
                                h7Var3.B = f31;
                                if (f31 > 1.0f) {
                                    h7Var3.B = 1.0f;
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
                        float f32 = h7Var3.K + 0.016f;
                        h7Var3.K = f32;
                        if (f32 >= 1.0f) {
                            h7Var3.K = 1.0f;
                            h7Var3.L = false;
                        }
                    }
                    h7Var3.M += 1.152f;
                    parentView.invalidate();
                    if (h7Var3.L) {
                    }
                    while (i14 < 16) {
                    }
                    canvas2 = canvas;
                    imageReceiver3.draw(canvas2);
                    h7Var3.w = f10 > 0.5f;
                    if (f19 > 0.0f) {
                    }
                    f15 = h7Var3.B;
                    if (f15 != 1.0f) {
                    }
                    if (i12 != 0) {
                    }
                }
                paint2 = paint;
                View parentView2 = imageReceiver3.getParentView();
                if (h7Var3.L) {
                }
                h7Var3.M += 1.152f;
                parentView2.invalidate();
                if (h7Var3.L) {
                }
                while (i14 < 16) {
                }
                canvas2 = canvas;
                imageReceiver3.draw(canvas2);
                h7Var3.w = f10 > 0.5f;
                if (f19 > 0.0f) {
                }
                f15 = h7Var3.B;
                if (f15 != 1.0f) {
                }
                if (i12 != 0) {
                }
            }
            rectF2 = rectF;
            imageReceiver3.draw(canvas2);
            h7Var3.w = f10 > 0.5f;
            if (f19 > 0.0f) {
            }
            f15 = h7Var3.B;
            if (f15 != 1.0f) {
            }
            if (i12 != 0) {
            }
        }
        boolean z22 = i22 == 2 && h7Var.B != f13;
        if (z16) {
            d(h7Var.J, h7Var.o);
            paint5 = paintArr[h7Var.o ? 1 : 0];
        } else {
            c(h7Var.J);
            paint5 = e;
        }
        Paint paint10 = paint5;
        if (h7Var.a) {
            Paint t10 = t(imageReceiver, z16);
            t10.setAlpha((int) (h7Var.u * 255.0f));
            paint6 = o(imageReceiver);
            paint6.setAlpha((int) (h7Var.u * 255.0f));
            Paint q9 = q(imageReceiver);
            q9.setAlpha((int) (h7Var.u * 255.0f));
            c(h7Var.J);
            paint8 = q9;
            paint7 = t10;
        } else {
            paint6 = null;
            paint7 = null;
            paint8 = null;
        }
        if (h7Var.a) {
            if (z16 && !h7Var.v) {
                dpf22 = AndroidUtilities.dpf2(3.5f);
                f18 = -dpf22;
            }
            f18 = 0.0f;
        } else {
            if (z16 && !h7Var.v) {
                dpf22 = AndroidUtilities.dpf2(2.7f);
                f18 = -dpf22;
            }
            f18 = 0.0f;
        }
        if (z22) {
            z13 = (AndroidUtilities.dp(5.0f) * f21) + f18;
            paint10.setAlpha((int) (h7Var.u * 255.0f * (1.0f - f21)));
            f14 = 2.7f;
        } else {
            paint10.setAlpha((int) (h7Var.u * 255.0f * f21));
            f14 = 2.7f;
            z13 = com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(5.0f), f18);
        }
        float f33 = z13 + h7Var.G;
        rectF.set(rectF3);
        rectF.inset(f33, f33);
        if (h7Var.a) {
            imageReceiver2 = imageReceiver;
            s6Var2 = s6Var;
            Paint paint11 = paint6;
            h7Var2 = h7Var;
            z11 = z18;
            m(canvas2, s6Var2, imageReceiver2, h7Var2, paint10, paint7, paint8, paint11, z11);
        } else {
            imageReceiver2 = imageReceiver;
            h7Var2 = h7Var;
            z11 = z18;
            s6Var2 = s6Var;
            imageReceiver2.getParentView();
            j(canvas2, h7Var2, paint10, z11);
        }
        if (h7Var2.A == i13) {
        }
        imageReceiver3 = imageReceiver2;
        h7Var3 = h7Var2;
        rectF2 = rectF;
        imageReceiver3.draw(canvas2);
        h7Var3.w = f10 > 0.5f;
        if (f19 > 0.0f) {
        }
        f15 = h7Var3.B;
        if (f15 != 1.0f) {
        }
        if (i12 != 0) {
        }
    }

    public static void j(Canvas canvas, h7 h7Var, Paint paint, boolean z10) {
        RectF rectF = n;
        if (z10) {
            RectF rectF2 = p;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
            return;
        }
        float f9 = h7Var.f;
        if (f9 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f9 / 2.0f) + 360.0f, 360.0f - f9, false, paint);
        }
    }

    public static void k(Canvas canvas, RectF rectF, float f9, boolean z10, float f10) {
        Canvas canvas2;
        if (i == null) {
            i = new zz0(LocaleController.getString(R.string.LiveStoryBadge), 9.66f, AndroidUtilities.bold());
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
        h.setColor(org.telegram.ui.ActionBar.g6.l1(f9, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ok, false)));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(7.0f), f10);
        float l10 = i.l() + lerp + lerp;
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(18.0f), f10);
        float dp = AndroidUtilities.dp(2.0f);
        canvas.save();
        float f11 = l10 / 2.0f;
        float f12 = 0.8f * lerp2;
        float f13 = lerp2 * 0.2f;
        f.set((rectF.centerX() - f11) - dp, (rectF.bottom - f12) - dp, rectF.centerX() + f11 + dp, rectF.bottom + f13 + dp);
        float lerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f9);
        canvas.scale(lerp3, lerp3, f.centerX(), f.centerY());
        AndroidUtilities.scaleRect(f, f9);
        RectF rectF2 = f;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, f.height() / 2.0f, g);
        if (z10) {
            f.set(rectF.centerX() - f11, rectF.bottom - f12, rectF.centerX() + f11, rectF.bottom + f13);
            RectF rectF3 = f;
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f.height() / 2.0f, h);
            zz0 zz0Var = i;
            RectF rectF4 = f;
            canvas2 = canvas;
            zz0Var.c(rectF4.left + lerp, rectF4.centerY(), f9, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f9, float f10, h7 h7Var, boolean z10) {
        if (z10) {
            float height = rectF.height() * 0.32f;
            float f11 = ((((int) f9) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            Path path = q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = r;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = t;
            path2.reset();
            pathMeasure.getSegment(((f9 - f12) / 360.0f) * length, length * ((f10 - f12) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        if (!h7Var.k) {
            if (h7Var.l) {
                float f13 = h7Var.f;
                g(canvas, rectF, paint, f9, f10, ((-f13) / 2.0f) + 180.0f, (f13 / 2.0f) + 180.0f);
                return;
            } else if (f9 < 90.0f) {
                g(canvas, rectF, paint, f9, f10, h7Var.g, h7Var.h);
                return;
            } else {
                g(canvas, rectF, paint, f9, f10, -h7Var.i, h7Var.j);
                return;
            }
        }
        boolean z11 = h7Var.m;
        if (!z11 && !h7Var.l) {
            if (f9 < 90.0f) {
                float f14 = h7Var.f;
                g(canvas, rectF, paint, f9, f10, (-f14) / 2.0f, f14 / 2.0f);
                return;
            } else {
                float f15 = h7Var.f;
                g(canvas, rectF, paint, f9, f10, ((-f15) / 2.0f) + 180.0f, (f15 / 2.0f) + 180.0f);
                return;
            }
        }
        if (h7Var.l) {
            float f16 = h7Var.f;
            g(canvas, rectF, paint, f9, f10, ((-f16) / 2.0f) + 180.0f, (f16 / 2.0f) + 180.0f);
        } else if (!z11) {
            canvas.drawArc(rectF, f9, f10 - f9, false, paint);
        } else {
            float f17 = h7Var.f;
            g(canvas, rectF, paint, f9, f10, (-f17) / 2.0f, f17 / 2.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ab, code lost:
    
        if (r4 == 1) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(Canvas canvas, s6 s6Var, ImageReceiver imageReceiver, h7 h7Var, Paint paint, Paint paint2, Paint paint3, Paint paint4, boolean z10) {
        Paint paint5;
        RectF rectF;
        int max;
        Paint paint6;
        h7 h7Var2 = h7Var;
        org.telegram.ui.ActionBar.c6 c6Var = h7Var2.J;
        boolean z11 = h7Var2.E;
        c(c6Var);
        d(h7Var2.J, h7Var2.o);
        long j10 = h7Var2.s;
        int i10 = 0;
        int D = j10 != 0 ? s6Var.D(0, j10) : s6Var.D(0, h7Var2.x);
        int i11 = 2;
        h7Var2.n = D == 0 ? 2 : 1;
        TL_stories.PeerStories y8 = s6Var.y(h7Var2.x);
        ArrayList arrayList = s6Var.h;
        if (y8 == null) {
            y8 = s6Var.z(h7Var2.x);
        }
        TL_stories.PeerStories peerStories = y8;
        int size = h7Var2.r ? arrayList.size() : (peerStories == null || peerStories.stories.size() == 1) ? 1 : peerStories.stories.size();
        Paint[] paintArr = k;
        if (D == 2) {
            o(imageReceiver);
            paint5 = b.c;
        } else if (D == 3) {
            q(imageReceiver);
            paint5 = c.c;
        } else if (D == 1) {
            t(imageReceiver, z11);
            paint5 = a[z11 ? 1 : 0].c;
        } else {
            paint5 = z11 ? paintArr[h7Var2.o ? 1 : 0] : e;
        }
        Paint paint7 = paint5;
        RectF rectF2 = n;
        if (size <= 1) {
            long j11 = h7Var2.x;
            TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) s6Var.i.f(j11);
            if (peerStories2 == null) {
                peerStories2 = s6Var.z(j11);
            }
            if (peerStories2 != null) {
                if (j11 != UserConfig.getInstance(s6Var.a).getClientUserId() || Utilities.isNullOrEmpty((Collection) s6Var.b.f(j11))) {
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
            l(canvas, rectF2, paint8, -90.0f, 90.0f, h7Var2, z10);
            l(canvas, rectF2, paint8, 90.0f, 270.0f, h7Var, z10);
            float f9 = h7Var.e;
            if (f9 == 1.0f || paint8 == paint7) {
                return;
            }
            paint7.setAlpha((int) ((1.0f - f9) * 255.0f));
            l(canvas, rectF2, paint7, -90.0f, 90.0f, h7Var, z10);
            l(canvas, rectF2, paint7, 90.0f, 270.0f, h7Var, z10);
            paint7.setAlpha(255);
            return;
        }
        Paint paint9 = paint7;
        float f10 = 360.0f / size;
        float f11 = (size > 20 ? 3 : 5) * h7Var2.e;
        float f12 = f11 > f10 ? 0.0f : f11;
        if (h7Var2.r) {
            rectF = rectF2;
            max = 0;
        } else {
            rectF = rectF2;
            max = Math.max(peerStories.max_read_id, s6Var.f.get(h7Var2.x, 0));
        }
        int i13 = 0;
        while (i13 < size) {
            Paint paint10 = z11 ? paintArr[h7Var2.o ? 1 : 0] : e;
            if (h7Var2.r) {
                int D2 = s6Var.D(i10, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get((size - 1) - i13)).peer));
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
            float f13 = (i13 * f10) - 90.0f;
            float f14 = f13 + f10;
            float f15 = f13 + f12;
            float f16 = f14 - f12;
            Paint paint11 = paint9;
            int i14 = max;
            int i15 = i13;
            Paint paint12 = paint10;
            RectF rectF3 = rectF;
            l(canvas, rectF3, paint12, f15, f16, h7Var, z10);
            RectF rectF4 = rectF3;
            if (h7Var.e == 1.0f || paint12 == paint11) {
                paint6 = paint11;
            } else {
                paint11.getStrokeWidth();
                paint11.setAlpha((int) ((1.0f - h7Var.e) * 255.0f));
                l(canvas, rectF4, paint11, f15, f16, h7Var, z10);
                rectF4 = rectF4;
                paint6 = paint11;
                paint6.setAlpha(255);
            }
            i13 = i15 + 1;
            h7Var2 = h7Var;
            rectF = rectF4;
            paint9 = paint6;
            max = i14;
            i10 = 0;
            i11 = 2;
        }
    }

    public static i7 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        if (peerStories == null || peerStories.stories.isEmpty() || DialogObject.getPeerDialogId(peerStories.peer) == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            runnable.run();
            return null;
        }
        s6 s6Var = MessagesController.getInstance(UserConfig.selectedAccount).storiesController;
        int i10 = s6Var.f.get(DialogObject.getPeerDialogId(peerStories.peer));
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
        i7 i7Var = new i7();
        i7Var.d = false;
        i7Var.a = peerDialogId;
        i7Var.b = s6Var;
        i7Var.c = new r3(16, i7Var, runnable);
        Runnable[] runnableArr = {r2};
        r3 r3Var = new r3(17, runnableArr, i7Var);
        AndroidUtilities.runOnUIThread(r3Var, 3000L);
        g7 g7Var = new g7(runnableArr, i7Var);
        i7Var.e = g7Var;
        g7Var.setAllowLoadingOnAttachedOnly(true);
        i7Var.e.onAttachedToWindow();
        String s10 = s();
        TLRPC.MessageMedia messageMedia2 = storyItem2.media;
        if (messageMedia2 == null || (document = messageMedia2.document) == null) {
            TLRPC.Photo photo2 = messageMedia2 != null ? messageMedia2.photo : null;
            if (photo2 == null || (arrayList2 = photo2.sizes) == null) {
                i7Var.c.run();
                return null;
            }
            i7Var.e.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, ConnectionsManager.DEFAULT_DATACENTER_ID), photo2), s10, null, null, null, 0L, null, storyItem2, 0);
        } else {
            i7Var.e.setImage(ImageLocation.getForDocument(document), u3.c.k(s10, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
        }
        return i7Var;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (b == null) {
            k20 k20Var = new k20();
            b = k20Var;
            k20Var.a = true;
            k20Var.b = true;
            k20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.lk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.mk, false), 0, 0);
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
            k20 k20Var = new k20();
            c = k20Var;
            k20Var.a = true;
            k20Var.b = true;
            k20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.nk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ok, false), 0, 0);
            c.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            c.c.setStyle(Paint.Style.STROKE);
            c.c.setStrokeCap(Paint.Cap.ROUND);
        }
        c.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return c.c;
    }

    public static int r(s6 s6Var, long j10) {
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
            int i10 = s6Var.f.get(j10, 0);
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
        int i11 = s6Var.f.get(j10, 0);
        TLRPC.TL_recentStory tL_recentStory4 = user.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        return tL_recentStory4.max_id > i11 ? 1 : 2;
    }

    public static String s() {
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        return com.google.android.recaptcha.internal.a.k(max, "_", max);
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z10) {
        k20[] k20VarArr = a;
        if (k20VarArr[z10 ? 1 : 0] == null) {
            k20 k20Var = new k20();
            k20VarArr[z10 ? 1 : 0] = k20Var;
            k20Var.a = true;
            k20Var.b = true;
            if (z10) {
                k20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.jk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kk, false), 0, 0);
            } else {
                k20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ik, false), 0, 0);
            }
            k20VarArr[z10 ? 1 : 0].c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            k20VarArr[z10 ? 1 : 0].c.setStyle(Paint.Style.STROKE);
            k20VarArr[z10 ? 1 : 0].c.setStrokeCap(Paint.Cap.ROUND);
        }
        k20VarArr[z10 ? 1 : 0].b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return k20VarArr[z10 ? 1 : 0].c;
    }

    public static CharSequence u(TextView textView, boolean z10) {
        String string = z10 ? LocaleController.getString(R.string.StoryEditing) : LocaleController.getString(R.string.UploadingStory);
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
