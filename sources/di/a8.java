package di;

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
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z20;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public abstract class a8 {
    public static z20 b;
    public static z20 c;
    public static z20 d;
    public static Paint e;
    public static RectF f;
    public static Paint g;
    public static Paint h;
    public static q11 i;
    public static int j;
    public static BitmapDrawable m;
    public static final z20[] a = new z20[2];
    public static final Paint[] k = new Paint[2];
    public static final int[] l = new int[2];
    public static final RectF n = new RectF();
    public static final androidx.emoji2.text.n o = new androidx.emoji2.text.n(1);
    public static final RectF p = new RectF();
    public static final Path q = new Path();
    public static final Matrix r = new Matrix();
    public static final PathMeasure s = new PathMeasure();
    public static final Path t = new Path();

    public static void a(org.telegram.ui.ActionBar.b6 b6Var) {
        String string = LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") <= 0) {
            b6Var.l(string, false);
            return;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        ea eaVar = new ea();
        valueOf.setSpan(eaVar, valueOf.length() - 1, valueOf.length(), 0);
        eaVar.a = b6Var;
        eaVar.n = true;
        b6Var.l(valueOf, false);
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

    public static void c(org.telegram.ui.ActionBar.u6 u6Var) {
        if (e == null) {
            Paint paint = new Paint(1);
            e = paint;
            paint.setStyle(Paint.Style.STROKE);
            e.setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            e.setStrokeCap(Paint.Cap.ROUND);
        }
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var);
        if (j != w02) {
            j = w02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(w02);
            if (computePerceivedBrightness >= 0.721f) {
                e.setColor(i0.a.f(0.2f, w02, -16777216));
            } else if (computePerceivedBrightness < 0.25f) {
                e.setColor(i0.a.f(0.2f, w02, -1));
            } else {
                e.setColor(i0.a.f(0.44f, w02, -1));
            }
        }
    }

    public static void d(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        Paint[] paintArr = k;
        if (paintArr[z10 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z10 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z10 ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            paintArr[z10 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        int w02 = org.telegram.ui.ActionBar.y6.w0(!z10 ? org.telegram.ui.ActionBar.y6.s8 : org.telegram.ui.ActionBar.y6.M8, u6Var);
        int[] iArr = l;
        if (iArr[z10 ? 1 : 0] != w02) {
            iArr[z10 ? 1 : 0] = w02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(w02);
            if (computePerceivedBrightness >= 0.721f) {
                paintArr[z10 ? 1 : 0].setColor(i0.a.f(0.2f, w02, -16777216));
            } else if (computePerceivedBrightness < 0.25f) {
                paintArr[z10 ? 1 : 0].setColor(i0.a.f(0.2f, w02, -1));
            } else {
                paintArr[z10 ? 1 : 0].setColor(i0.a.f(0.44f, w02, -1));
            }
        }
    }

    public static SpannableStringBuilder e(int i10, boolean z10, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.formatString(i10, objArr));
        zq zqVar = new zq(R.drawable.msg_mini_bomb, 0);
        if (z10) {
            zqVar.setScale(0.8f, 0.8f);
        } else {
            zqVar.setTopOffset(-1);
        }
        spannableStringBuilder.setSpan(zqVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString(R.string.Story));
        spannableStringBuilder.setSpan(new zq(R.drawable.msg_mini_replystory2, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f7, float f10, float f11, float f12) {
        float f13;
        boolean z10;
        float f14 = f10 - f7;
        if (f7 >= f11 || f10 >= f11 + f14) {
            f13 = f7;
            z10 = false;
        } else {
            f13 = f7;
            canvas.drawArc(rectF, f13, Math.min(f10, f11) - f7, false, paint);
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

    public static void h(long j10, Canvas canvas, ImageReceiver imageReceiver, w7 w7Var) {
        i(j10, canvas, imageReceiver, UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j10 && MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(j10), w7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x0463, code lost:
    
        if (r1 == 1) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x026b, code lost:
    
        if (r35.B == 1.0f) goto L143;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04cf A[LOOP:0: B:185:0x04cb->B:187:0x04cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0486  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(long j10, Canvas canvas, ImageReceiver imageReceiver, boolean z10, w7 w7Var) {
        int r6;
        int i10;
        float lerp;
        float f7;
        Canvas canvas2;
        int i11;
        h7 h7Var;
        float f10;
        float f11;
        float f12;
        int i12;
        RectF rectF;
        int i13;
        float f13;
        ImageReceiver imageReceiver2;
        w7 w7Var2;
        boolean z11;
        float f14;
        h7 h7Var2;
        ImageReceiver imageReceiver3;
        w7 w7Var3;
        boolean z12;
        boolean z13;
        RectF rectF2;
        float f15;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        float dpf2;
        float f16;
        float f17;
        float z14;
        ?? r92;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        float dpf22;
        float f18;
        float z15;
        z20 z20Var;
        float z16;
        h7 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z17 = w7Var.b;
        RectF rectF3 = w7Var.F;
        boolean z18 = w7Var.E;
        if (w7Var.x != j10) {
            w7Var.x = j10;
            w7Var.g();
            z17 = false;
        }
        boolean z19 = storiesController.j.get(j10, 0) == 1;
        boolean z20 = ChatObject.isForum(UserConfig.selectedAccount, j10) && !w7Var.D;
        boolean z21 = w7Var.r ? !storiesController.h.isEmpty() : z10;
        if (w7Var.d != null) {
            storiesController.D(w7Var.c, j10);
            z19 = false;
        }
        if (z19) {
            if (storiesController.I(j10)) {
                r6 = 3;
                z17 = false;
                i10 = 2;
            } else {
                i10 = r(storiesController, j10);
                r6 = 3;
                z17 = false;
            }
        } else if (!z21) {
            r6 = r(storiesController, j10);
            i10 = r6;
        } else if (w7Var.a) {
            r6 = 2;
            i10 = 2;
        } else {
            int D = storiesController.D(w7Var.c, j10);
            i10 = D;
            r6 = D == 0 ? 2 : 1;
        }
        int i14 = w7Var.z;
        if (i14 != 0) {
            r6 = i14;
            i10 = r6;
        }
        int i15 = w7Var.y;
        if (i15 != r6) {
            if (i15 == 3) {
                z17 = true;
            }
            if (r6 == 3) {
                w7Var.q = i10;
                w7Var.t = 0.0f;
            }
            if (z17) {
                w7Var.A = i15;
                w7Var.y = r6;
                w7Var.B = 0.0f;
            } else {
                w7Var.y = r6;
                w7Var.B = 1.0f;
            }
        }
        xc xcVar = w7Var.H;
        float a2 = xcVar != null ? xcVar.a(0.08f) : 1.0f;
        if (w7Var.C != z19 && z19) {
            w7Var.K = 1.0f;
            w7Var.L = false;
        }
        w7Var.C = z19;
        if (w7Var.y == 0 && w7Var.B == 1.0f) {
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
        float f19 = storiesController.F(w7Var.x) ? w7Var.e : 0.0f;
        float f20 = w7Var.B;
        if (f20 != 1.0f) {
            f20 = ds.f.getInterpolation(f20);
        }
        float f21 = f20;
        if (!z18 || w7Var.v) {
            int i16 = w7Var.A;
            int i17 = w7Var.q;
            if (i16 == 3) {
                i16 = i17;
            }
            int dp = i16 == 2 ? AndroidUtilities.dp(3.0f) : i16 == 1 ? AndroidUtilities.dp(4.0f) : 0;
            int i18 = w7Var.y;
            int i19 = w7Var.q;
            if (i18 == 3) {
                i18 = i19;
            }
            lerp = AndroidUtilities.lerp(dp, i18 == 2 ? AndroidUtilities.dp(3.0f) : i18 == 1 ? AndroidUtilities.dp(4.0f) : 0, w7Var.B);
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
            f11 = 1.0f;
            f7 = lerp;
            i12 = i10;
            h7Var = storiesController;
            rectF = rectF4;
            i11 = save;
            f10 = f19;
            i13 = 3;
            f12 = 0.08f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(rectF4.left - AndroidUtilities.dp(15.0f), rectF4.top - AndroidUtilities.dp(15.0f), rectF4.right + AndroidUtilities.dp(15.0f), rectF4.bottom + AndroidUtilities.dp(15.0f), 255, 31);
        } else {
            f7 = lerp;
            canvas2 = canvas;
            i11 = save;
            h7Var = storiesController;
            f10 = f19;
            f11 = 1.0f;
            f12 = 0.08f;
            i12 = i10;
            rectF = rectF4;
            i13 = 3;
        }
        int i20 = w7Var.A;
        z20[] z20VarArr = a;
        if ((i20 == 1 && w7Var.B != f11) || w7Var.y == 1) {
            if (i12 == 2) {
                o(imageReceiver);
                z20Var = b;
            } else if (i12 == i13) {
                q(imageReceiver);
                z20Var = c;
            } else {
                t(imageReceiver, z18);
                z20Var = z20VarArr[z18 ? 1 : 0];
            }
            boolean z22 = w7Var.A == 1 && w7Var.B != f11;
            float f22 = (!z18 || w7Var.v) ? 0.0f : -AndroidUtilities.dp(4.0f);
            if (z22) {
                z16 = (AndroidUtilities.dp(5.0f) * f21) + f22;
                z20Var.c.setAlpha((int) ((f11 - f21) * w7Var.u * 255.0f));
            } else {
                z20Var.c.setAlpha((int) (w7Var.u * 255.0f * f21));
                z16 = c3.h0.z(f11, f21, AndroidUtilities.dp(5.0f), f22);
            }
            float f23 = z16 + w7Var.G;
            rectF.set(rectF3);
            rectF.inset(f23, f23);
            imageReceiver.getParentView();
            j(canvas2, w7Var, z20Var.c, z20);
        }
        int i21 = w7Var.A;
        Paint[] paintArr = k;
        if (i21 == 2) {
            f13 = 1.0f;
        } else {
            f13 = 1.0f;
        }
        if (w7Var.y != 2) {
            imageReceiver2 = imageReceiver;
            w7Var2 = w7Var;
            z11 = z20;
            f14 = 2.7f;
            h7Var2 = h7Var;
            if ((w7Var2.A == i13 || w7Var2.B == 1.0f) && w7Var2.y != i13) {
                imageReceiver3 = imageReceiver2;
                w7Var3 = w7Var2;
            } else {
                if (w7Var2.q == 1) {
                    t(imageReceiver2, z18);
                    paint = z20VarArr[z18 ? 1 : 0].c;
                } else if (z18) {
                    d(w7Var2.J, w7Var2.o);
                    paint = paintArr[w7Var2.o ? 1 : 0];
                } else {
                    c(w7Var2.J);
                    paint = e;
                }
                paint.setAlpha((int) (f21 * 255.0f));
                if (w7Var2.a) {
                    paint2 = t(imageReceiver2, z18);
                    paint2.setAlpha((int) (w7Var2.u * 255.0f));
                    Paint o10 = o(imageReceiver2);
                    o10.setAlpha((int) (w7Var2.u * 255.0f));
                    Paint q5 = q(imageReceiver2);
                    q5.setAlpha((int) (w7Var2.u * 255.0f));
                    c(w7Var2.J);
                    paint4 = o10;
                    paint3 = q5;
                } else {
                    paint2 = null;
                    paint3 = null;
                    paint4 = null;
                }
                if (w7Var2.a) {
                    if (z18 && !w7Var2.v) {
                        dpf2 = AndroidUtilities.dpf2(3.5f);
                        f16 = -dpf2;
                    }
                    f16 = 0.0f;
                } else {
                    if (z18 && !w7Var2.v) {
                        dpf2 = AndroidUtilities.dpf2(f14);
                        f16 = -dpf2;
                    }
                    f16 = 0.0f;
                }
                if (w7Var2.A != i13 || w7Var2.B == 1.0f) {
                    paint.setAlpha((int) (w7Var2.u * 255.0f * f21));
                    f17 = 1.0f;
                    z14 = c3.h0.z(1.0f, f21, AndroidUtilities.dp(5.0f), f16);
                } else {
                    z14 = (AndroidUtilities.dp(7.0f) * f21) + f16;
                    paint.setAlpha((int) ((1.0f - f21) * w7Var2.u * 255.0f));
                    f17 = 1.0f;
                }
                float f24 = z14 + w7Var2.G;
                rectF.set(rectF3);
                rectF.inset(f24, f24);
                boolean z23 = w7Var2.a;
                if (z23 && w7Var2.y == i13) {
                    float f25 = w7Var2.t;
                    if (f25 != f17) {
                        float f26 = f25 + f12;
                        w7Var2.t = f26;
                        if (f26 > f17) {
                            w7Var2.t = f17;
                        }
                        float f27 = w7Var2.e;
                        w7Var2.e = f17 - w7Var2.t;
                        m(canvas2, h7Var2, imageReceiver2, w7Var2, paint, paint2, paint3, paint4, z11);
                        imageReceiver3 = imageReceiver2;
                        w7Var3 = w7Var2;
                        w7Var3.e = f27;
                        if (imageReceiver3.getParentView() != null) {
                            imageReceiver3.invalidate();
                            imageReceiver3.getParentView().invalidate();
                        }
                        canvas2 = canvas;
                    }
                }
                w7Var3 = w7Var2;
                Paint paint9 = paint4;
                imageReceiver3 = imageReceiver2;
                if (z23) {
                    int D2 = h7Var2.D(0, w7Var3.x);
                    if (D2 == 2) {
                        paint2 = paint9;
                    } else if (D2 == i13) {
                        paint2 = paint3;
                    }
                    View parentView = imageReceiver3.getParentView();
                    if (w7Var3.L) {
                        z13 = false;
                        float f28 = w7Var3.K - 0.016f;
                        w7Var3.K = f28;
                        if (f28 < 0.0f) {
                            w7Var3.K = 0.0f;
                            z12 = true;
                            w7Var3.L = true;
                            w7Var3.M += 1.152f;
                            parentView.invalidate();
                            if (w7Var3.L) {
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, w7Var3.M, w7Var3.K * 360.0f, false, paint2);
                            } else {
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, w7Var3.M + 360.0f, w7Var3.K * (-360.0f), false, paint2);
                            }
                            for (r92 = z13; r92 < 16; r92++) {
                                float f29 = (((float) r92) * 22.5f) + 10.0f;
                                canvas.drawArc(rectF2, w7Var3.M + f29, ((22.5f + f29) - 10.0f) - f29, false, paint2);
                            }
                            canvas2 = canvas;
                            imageReceiver3.draw(canvas2);
                            w7Var3.w = f10 > 0.5f ? z12 : z13;
                            if (f19 > 0.0f) {
                                float f30 = f7 + w7Var3.G;
                                rectF2.set(rectF3);
                                rectF2.inset(f30, f30);
                                k(f10, 0.0f, canvas2, rectF2, imageReceiver3.getVisible());
                            }
                            f15 = w7Var3.B;
                            if (f15 != 1.0f) {
                                float f31 = (AndroidUtilities.screenRefreshTime / 250.0f) + f15;
                                w7Var3.B = f31;
                                if (f31 > 1.0f) {
                                    w7Var3.B = 1.0f;
                                }
                                if (imageReceiver3.getParentView() != null) {
                                    imageReceiver3.invalidate();
                                    imageReceiver3.getParentView().invalidate();
                                }
                            }
                            if (i11 != 0) {
                                canvas2.restoreToCount(i11);
                                return;
                            }
                            return;
                        }
                    } else {
                        float f32 = w7Var3.K + 0.016f;
                        w7Var3.K = f32;
                        if (f32 >= 1.0f) {
                            w7Var3.K = 1.0f;
                            z13 = false;
                            w7Var3.L = false;
                        } else {
                            z13 = false;
                        }
                    }
                    z12 = true;
                    w7Var3.M += 1.152f;
                    parentView.invalidate();
                    if (w7Var3.L) {
                    }
                    while (r92 < 16) {
                    }
                    canvas2 = canvas;
                    imageReceiver3.draw(canvas2);
                    w7Var3.w = f10 > 0.5f ? z12 : z13;
                    if (f19 > 0.0f) {
                    }
                    f15 = w7Var3.B;
                    if (f15 != 1.0f) {
                    }
                    if (i11 != 0) {
                    }
                }
                paint2 = paint;
                View parentView2 = imageReceiver3.getParentView();
                if (w7Var3.L) {
                }
                z12 = true;
                w7Var3.M += 1.152f;
                parentView2.invalidate();
                if (w7Var3.L) {
                }
                while (r92 < 16) {
                }
                canvas2 = canvas;
                imageReceiver3.draw(canvas2);
                w7Var3.w = f10 > 0.5f ? z12 : z13;
                if (f19 > 0.0f) {
                }
                f15 = w7Var3.B;
                if (f15 != 1.0f) {
                }
                if (i11 != 0) {
                }
            }
            rectF2 = rectF;
            z13 = false;
            z12 = true;
            imageReceiver3.draw(canvas2);
            w7Var3.w = f10 > 0.5f ? z12 : z13;
            if (f19 > 0.0f) {
            }
            f15 = w7Var3.B;
            if (f15 != 1.0f) {
            }
            if (i11 != 0) {
            }
        }
        boolean z24 = i21 == 2 && w7Var.B != f13;
        if (z18) {
            d(w7Var.J, w7Var.o);
            paint5 = paintArr[w7Var.o ? 1 : 0];
        } else {
            c(w7Var.J);
            paint5 = e;
        }
        Paint paint10 = paint5;
        if (w7Var.a) {
            Paint t10 = t(imageReceiver, z18);
            t10.setAlpha((int) (w7Var.u * 255.0f));
            paint6 = o(imageReceiver);
            paint6.setAlpha((int) (w7Var.u * 255.0f));
            Paint q9 = q(imageReceiver);
            q9.setAlpha((int) (w7Var.u * 255.0f));
            c(w7Var.J);
            paint8 = q9;
            paint7 = t10;
        } else {
            paint6 = null;
            paint7 = null;
            paint8 = null;
        }
        if (w7Var.a) {
            if (z18 && !w7Var.v) {
                dpf22 = AndroidUtilities.dpf2(3.5f);
                f18 = -dpf22;
            }
            f18 = 0.0f;
        } else {
            if (z18 && !w7Var.v) {
                dpf22 = AndroidUtilities.dpf2(2.7f);
                f18 = -dpf22;
            }
            f18 = 0.0f;
        }
        if (z24) {
            z15 = (AndroidUtilities.dp(5.0f) * f21) + f18;
            paint10.setAlpha((int) (w7Var.u * 255.0f * (1.0f - f21)));
            f14 = 2.7f;
        } else {
            paint10.setAlpha((int) (w7Var.u * 255.0f * f21));
            f14 = 2.7f;
            z15 = c3.h0.z(1.0f, f21, AndroidUtilities.dp(5.0f), f18);
        }
        float f33 = z15 + w7Var.G;
        rectF.set(rectF3);
        rectF.inset(f33, f33);
        if (w7Var.a) {
            imageReceiver2 = imageReceiver;
            h7Var2 = h7Var;
            Paint paint11 = paint6;
            w7Var2 = w7Var;
            z11 = z20;
            m(canvas2, h7Var2, imageReceiver2, w7Var2, paint10, paint7, paint8, paint11, z11);
        } else {
            imageReceiver2 = imageReceiver;
            w7Var2 = w7Var;
            z11 = z20;
            h7Var2 = h7Var;
            imageReceiver2.getParentView();
            j(canvas2, w7Var2, paint10, z11);
        }
        if (w7Var2.A == i13) {
        }
        imageReceiver3 = imageReceiver2;
        w7Var3 = w7Var2;
        rectF2 = rectF;
        z13 = false;
        z12 = true;
        imageReceiver3.draw(canvas2);
        w7Var3.w = f10 > 0.5f ? z12 : z13;
        if (f19 > 0.0f) {
        }
        f15 = w7Var3.B;
        if (f15 != 1.0f) {
        }
        if (i11 != 0) {
        }
    }

    public static void j(Canvas canvas, w7 w7Var, Paint paint, boolean z10) {
        RectF rectF = n;
        if (z10) {
            RectF rectF2 = p;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
            return;
        }
        float f7 = w7Var.f;
        if (f7 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f7 / 2.0f) + 360.0f, 360.0f - f7, false, paint);
        }
    }

    public static void k(float f7, float f10, Canvas canvas, RectF rectF, boolean z10) {
        Canvas canvas2;
        if (i == null) {
            i = new q11(LocaleController.getString(R.string.LiveStoryBadge), 9.66f, AndroidUtilities.bold());
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
        h.setColor(org.telegram.ui.ActionBar.y6.o1(f7, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ok, false)));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(7.0f), f10);
        float l4 = i.l() + lerp + lerp;
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(18.0f), f10);
        float dp = AndroidUtilities.dp(2.0f);
        canvas.save();
        float f11 = l4 / 2.0f;
        float f12 = 0.8f * lerp2;
        float f13 = lerp2 * 0.2f;
        f.set((rectF.centerX() - f11) - dp, (rectF.bottom - f12) - dp, rectF.centerX() + f11 + dp, rectF.bottom + f13 + dp);
        float lerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f7);
        canvas.scale(lerp3, lerp3, f.centerX(), f.centerY());
        AndroidUtilities.scaleRect(f, f7);
        RectF rectF2 = f;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, f.height() / 2.0f, g);
        if (z10) {
            f.set(rectF.centerX() - f11, rectF.bottom - f12, rectF.centerX() + f11, rectF.bottom + f13);
            RectF rectF3 = f;
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f.height() / 2.0f, h);
            q11 q11Var = i;
            RectF rectF4 = f;
            canvas2 = canvas;
            q11Var.c(rectF4.left + lerp, rectF4.centerY(), f7, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f7, float f10, w7 w7Var, boolean z10) {
        if (z10) {
            float height = rectF.height() * 0.32f;
            float f11 = ((((int) f7) / 90) * 90) + 90;
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
            pathMeasure.getSegment(((f7 - f12) / 360.0f) * length, length * ((f10 - f12) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        if (!w7Var.k) {
            if (w7Var.l) {
                float f13 = w7Var.f;
                g(canvas, rectF, paint, f7, f10, ((-f13) / 2.0f) + 180.0f, (f13 / 2.0f) + 180.0f);
                return;
            } else if (f7 < 90.0f) {
                g(canvas, rectF, paint, f7, f10, w7Var.g, w7Var.h);
                return;
            } else {
                g(canvas, rectF, paint, f7, f10, -w7Var.i, w7Var.j);
                return;
            }
        }
        boolean z11 = w7Var.m;
        if (!z11 && !w7Var.l) {
            if (f7 < 90.0f) {
                float f14 = w7Var.f;
                g(canvas, rectF, paint, f7, f10, (-f14) / 2.0f, f14 / 2.0f);
                return;
            } else {
                float f15 = w7Var.f;
                g(canvas, rectF, paint, f7, f10, ((-f15) / 2.0f) + 180.0f, (f15 / 2.0f) + 180.0f);
                return;
            }
        }
        if (w7Var.l) {
            float f16 = w7Var.f;
            g(canvas, rectF, paint, f7, f10, ((-f16) / 2.0f) + 180.0f, (f16 / 2.0f) + 180.0f);
        } else if (!z11) {
            canvas.drawArc(rectF, f7, f10 - f7, false, paint);
        } else {
            float f17 = w7Var.f;
            g(canvas, rectF, paint, f7, f10, (-f17) / 2.0f, f17 / 2.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a4, code lost:
    
        if (r4 == 1) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(Canvas canvas, h7 h7Var, ImageReceiver imageReceiver, w7 w7Var, Paint paint, Paint paint2, Paint paint3, Paint paint4, boolean z10) {
        Paint paint5;
        RectF rectF;
        int max;
        char c10;
        Paint paint6;
        w7 w7Var2 = w7Var;
        org.telegram.ui.ActionBar.u6 u6Var = w7Var2.J;
        boolean z11 = w7Var2.E;
        c(u6Var);
        d(w7Var2.J, w7Var2.o);
        long j10 = w7Var2.s;
        int i10 = 0;
        int D = j10 != 0 ? h7Var.D(0, j10) : h7Var.D(0, w7Var2.x);
        int i11 = 2;
        w7Var2.n = D == 0 ? 2 : 1;
        TL_stories.PeerStories y3 = h7Var.y(w7Var2.x);
        ArrayList arrayList = h7Var.h;
        if (y3 == null) {
            y3 = h7Var.z(w7Var2.x);
        }
        TL_stories.PeerStories peerStories = y3;
        int size = w7Var2.r ? arrayList.size() : (peerStories == null || peerStories.stories.size() == 1) ? 1 : peerStories.stories.size();
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
            paint5 = z11 ? paintArr[w7Var2.o ? 1 : 0] : e;
        }
        Paint paint7 = paint5;
        RectF rectF2 = n;
        if (size <= 1) {
            long j11 = w7Var2.x;
            TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) h7Var.i.f(j11);
            if (peerStories2 == null) {
                peerStories2 = h7Var.z(j11);
            }
            if (peerStories2 != null) {
                if (j11 != UserConfig.getInstance(h7Var.a).getClientUserId() || Utilities.isNullOrEmpty((Collection) h7Var.b.f(j11))) {
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
            l(canvas, rectF2, paint8, -90.0f, 90.0f, w7Var2, z10);
            l(canvas, rectF2, paint8, 90.0f, 270.0f, w7Var, z10);
            float f7 = w7Var.e;
            if (f7 == 1.0f || paint8 == paint7) {
                return;
            }
            paint7.setAlpha((int) ((1.0f - f7) * 255.0f));
            l(canvas, rectF2, paint7, -90.0f, 90.0f, w7Var, z10);
            l(canvas, rectF2, paint7, 90.0f, 270.0f, w7Var, z10);
            paint7.setAlpha(255);
            return;
        }
        Paint paint9 = paint7;
        float f10 = 360.0f / size;
        float f11 = (size > 20 ? 3 : 5) * w7Var2.e;
        if (f11 > f10) {
            f11 = 0.0f;
        }
        float f12 = f11;
        if (w7Var2.r) {
            rectF = rectF2;
            max = 0;
        } else {
            rectF = rectF2;
            max = Math.max(peerStories.max_read_id, h7Var.f.get(w7Var2.x, 0));
        }
        int i13 = 0;
        while (i13 < size) {
            Paint paint10 = z11 ? paintArr[w7Var2.o ? 1 : 0] : e;
            if (w7Var2.r) {
                int D2 = h7Var.D(i10, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get((size - 1) - i13)).peer));
                if (D2 == i11) {
                    paint10 = paint4;
                    c10 = 3;
                } else {
                    c10 = 3;
                    if (D2 != 3) {
                    }
                    paint10 = paint3;
                }
            } else {
                c10 = 3;
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
            l(canvas, rectF3, paint12, f15, f16, w7Var, z10);
            RectF rectF4 = rectF3;
            if (w7Var.e == 1.0f || paint12 == paint11) {
                paint6 = paint11;
            } else {
                paint11.getStrokeWidth();
                paint11.setAlpha((int) ((1.0f - w7Var.e) * 255.0f));
                l(canvas, rectF4, paint11, f15, f16, w7Var, z10);
                rectF4 = rectF4;
                paint6 = paint11;
                paint6.setAlpha(255);
            }
            i13 = i15 + 1;
            w7Var2 = w7Var;
            rectF = rectF4;
            paint9 = paint6;
            max = i14;
            i10 = 0;
            i11 = 2;
        }
    }

    public static x7 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        if (peerStories == null || peerStories.stories.isEmpty() || DialogObject.getPeerDialogId(peerStories.peer) == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            runnable.run();
            return null;
        }
        h7 h7Var = MessagesController.getInstance(UserConfig.selectedAccount).storiesController;
        int i10 = h7Var.f.get(DialogObject.getPeerDialogId(peerStories.peer));
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
        x7 x7Var = new x7();
        x7Var.b = false;
        x7Var.a = peerDialogId;
        x7Var.c = h7Var;
        x7Var.d = new b4(16, x7Var, runnable);
        Runnable[] runnableArr = {r2};
        b4 b4Var = new b4(17, runnableArr, x7Var);
        AndroidUtilities.runOnUIThread(b4Var, 3000L);
        v7 v7Var = new v7(runnableArr, x7Var);
        x7Var.e = v7Var;
        v7Var.setAllowLoadingOnAttachedOnly(true);
        ((v7) x7Var.e).onAttachedToWindow();
        String s10 = s();
        TLRPC.MessageMedia messageMedia2 = storyItem2.media;
        if (messageMedia2 == null || (document = messageMedia2.document) == null) {
            TLRPC.Photo photo2 = messageMedia2 != null ? messageMedia2.photo : null;
            if (photo2 == null || (arrayList2 = photo2.sizes) == null) {
                ((b4) x7Var.d).run();
                return null;
            }
            ((v7) x7Var.e).setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, ConnectionsManager.DEFAULT_DATACENTER_ID), photo2), s10, null, null, null, 0L, null, storyItem2, 0);
        } else {
            ((v7) x7Var.e).setImage(ImageLocation.getForDocument(document), b10.u(s10, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
        }
        return x7Var;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (b == null) {
            z20 z20Var = new z20();
            b = z20Var;
            z20Var.a = true;
            z20Var.b = true;
            z20Var.d(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.lk, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.mk, false), 0, 0);
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
            textPaint.setColor(i0.a.o(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            m = new BitmapDrawable(createBitmap);
        }
        return m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (c == null) {
            z20 z20Var = new z20();
            c = z20Var;
            z20Var.a = true;
            z20Var.b = true;
            z20Var.d(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.nk, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ok, false), 0, 0);
            c.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            c.c.setStyle(Paint.Style.STROKE);
            c.c.setStrokeCap(Paint.Cap.ROUND);
        }
        c.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return c.c;
    }

    public static int r(h7 h7Var, long j10) {
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
            int i10 = h7Var.f.get(j10, 0);
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
        int i11 = h7Var.f.get(j10, 0);
        TLRPC.TL_recentStory tL_recentStory4 = user.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        return tL_recentStory4.max_id > i11 ? 1 : 2;
    }

    public static String s() {
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        return a1.g.k(max, max, "_");
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z10) {
        z20[] z20VarArr = a;
        if (z20VarArr[z10 ? 1 : 0] == null) {
            z20 z20Var = new z20();
            z20VarArr[z10 ? 1 : 0] = z20Var;
            z20Var.a = true;
            z20Var.b = true;
            if (z10) {
                z20Var.d(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.jk, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.kk, false), 0, 0);
            } else {
                z20Var.d(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.hk, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ik, false), 0, 0);
            }
            z20VarArr[z10 ? 1 : 0].c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            z20VarArr[z10 ? 1 : 0].c.setStyle(Paint.Style.STROKE);
            z20VarArr[z10 ? 1 : 0].c.setStrokeCap(Paint.Cap.ROUND);
        }
        z20VarArr[z10 ? 1 : 0].b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return z20VarArr[z10 ? 1 : 0].c;
    }

    public static CharSequence u(TextView textView, boolean z10) {
        String string = z10 ? LocaleController.getString(R.string.StoryEditing) : LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") <= 0) {
            return string;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        ea eaVar = new ea();
        valueOf.setSpan(eaVar, valueOf.length() - 1, valueOf.length(), 0);
        eaVar.a = textView;
        eaVar.n = false;
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
            imageReceiver.addDecorator(new da(storyItem));
            return;
        }
        TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(i0.a.f(0.2f, -16777216, -1));
            imageReceiver.setImageBitmap(createBitmap);
            imageReceiver.addDecorator(new da(storyItem));
            return;
        }
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), photo), "320_320", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new da(storyItem));
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
